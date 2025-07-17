package com.bryan.loonaapi;

import org.springframework.stereotype.Service;

import java.util.List;
import java.time.LocalDate;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    public List<Member> getAllMembers() {
        return List.of(
                new Member("HeeJin", "FF4EB1", LocalDate.of(2000, 10, 19)),
                new Member("HyunJin", "F5D600", LocalDate.of(2000, 11, 15)),
                new Member("HaSeul", "00A86B", LocalDate.of(1997, 8, 18)),
                new Member("YeoJin", "FF7F00", LocalDate.of(2002, 11, 11)),
                new Member("ViVi", "FFB7D5", LocalDate.of(1996, 12, 9)),
                new Member("Kim Lip", "FFB7D5", LocalDate.of(1999, 2, 10)),
                new Member("JinSoul", "FFB7D5", LocalDate.of(1997, 6, 13)),
                new Member("Choerry", "FFB7D5", LocalDate.of(2001, 6, 4)),
                new Member("Yves", "FFB7D5", LocalDate.of(1997, 2, 24)),
                new Member("Chuu", "FFB7D5", LocalDate.of(1999, 10, 20)),
                new Member("GoWon", "FFB7D5", LocalDate.of(2000, 11, 19)),
                new Member("HyeJu", "FFB7D5", LocalDate.of(2001, 11, 13))
        );
    }

    public Optional<Member> getMember(Integer id) {
        return memberRepository.findById(id);
    }
}
