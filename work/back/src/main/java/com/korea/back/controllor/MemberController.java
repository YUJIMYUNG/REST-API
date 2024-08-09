package com.korea.back.controllor;

import com.korea.back.dto.MemberDTO;
import com.korea.back.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/members")
@RequiredArgsConstructor
@Slf4j
public class MemberController {
	private MemberService memberService;


	//로그인
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody MemberDTO request) throws Exception{
		return ResponseEntity.ok().body(memberService.signIn(request));
	}

	//회원가입
	@PostMapping("/join")
	@ResponseStatus(HttpStatus.OK)
	public Long join(@Valid @RequestBody MemberDTO request) throws Exception{
		return memberService.signUp(request);
	}

//	@GetMapping("/login")
//	public String getLogin(HttpServletRequest request, Model model) {
//		//현재 페이지를 가져와 세션에 저장
//		String referer = request.getHeader("Referer");
//		request.getSession().setAttribute("prevPage", referer);
//		log.info("uri={}", referer);
//		model.addAttribute("login",new LoginDTO());
//		return "member/login";
//	}
//
//	@PostMapping("/login")
//	public String postLogin(@ModelAttribute("login") LoginDTO loginDTO,
//							HttpServletRequest request,
//							HttpSession session,
//							Model model) {
//		boolean login = memberService.login(loginDTO);
//
//		if(login) {
//			String userName = loginDTO.getUserName();
//			Member member = memberService.findBuUserName(userName);
//			session.setAttribute("loginMember", member);
//
//			//저장한 이전페이지 주소를 가져옴
//			String prevPage = (String)request.getSession().getAttribute("prevPage");
//			//세션에 페이지 주소 삭제
//			request.getSession().removeAttribute("prevPage");
//
//			//이전 페이지가 있다면 이동, 없다면 /페이지
//			return "redirect:" + (prevPage != null ? prevPage : "/");
//		}
//
//		model.addAttribute("error", "비밀번호 또는 아이디가 올바르지 않습니다.");
//		return "member/login";
//	}
//
//	@PostMapping("/logout")
//	public String logout(HttpSession session) {
//		session.removeAttribute("loginMember");
//		return "redirect:/";
//	}
}
