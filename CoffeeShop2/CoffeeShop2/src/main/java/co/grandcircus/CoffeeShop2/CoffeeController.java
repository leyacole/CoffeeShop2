package co.grandcircus.CoffeeShop2;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.CoffeeShop2.dao.ProductDao;
import co.grandcircus.CoffeeShop2.dao.ProductRepository;
import co.grandcircus.CoffeeShop2.dao.UserRepository;
import co.grandcircus.CoffeeShop2.entity.Users;
import co.grandcircus.CoffeeShop2.entity.Products;


@Controller
public class CoffeeController {
	
	@Autowired
	private ProductDao prodDao;
	@Autowired
	 private UserRepository usersDao;
	@Autowired
	 private ProductRepository productDao;
	
	@RequestMapping("/")
	public ModelAndView home() {
		List<Products> product = productDao.findAll();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("product", product);
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register-form");
	
	}
	
	@PostMapping("/register-form")
	public ModelAndView submitregform(Users user, HttpSession session) {
			usersDao.save(user);
			session.setAttribute("user", user);
			return new ModelAndView("redirect:/");
				
	 }
	
	@RequestMapping("/admin")
	public ModelAndView admin() {
		ModelAndView mv = new ModelAndView("admin");
		mv.addObject("product", productDao.findAll() );
		return mv;
	}
	
	@RequestMapping("/add")
	public ModelAndView add() {
		return new ModelAndView("add");
		
	}
	
	@PostMapping("/add")
	public ModelAndView addSubmit(Products product) {
		prodDao.create(product);
		return new ModelAndView("redirect:admin");
	}
	
	@RequestMapping("/delete")
	public ModelAndView remove(@RequestParam("id") Long id) {
		prodDao.delete(id);
		return new ModelAndView("redirect:admin");
	}
	
	@RequestMapping("/signup")
	public ModelAndView showSignup() {
		return new ModelAndView("signup-form");
	}
	
	@RequestMapping("/signup-confirmation")
	public ModelAndView submitSignup(Users user, HttpSession session) {
		usersDao.save(user);
		session.setAttribute("user", user);
		ModelAndView mv = new ModelAndView("thanks");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView showLogin() {
		return new ModelAndView("login-form");
	}
	
	@PostMapping("/login")
	public ModelAndView submitLogin(
		@RequestParam("email") String email,
		@RequestParam("password") String password,
		HttpSession session
			) {
		
		Users user = usersDao.findByEmailAndPassword(email, password);
		System.out.println(user);
		
			if (user == null) {
			return new ModelAndView("login-form", "message", "Incorrect username or password.");
		}
		
		session.setAttribute("user", user);
		
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
		
		return new ModelAndView("redirect:/");
	}


}
