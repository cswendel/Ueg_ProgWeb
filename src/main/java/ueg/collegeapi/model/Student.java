package ueg.collegeapi.model;

import lombok.*;


import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private Long id;
    private String name;
    private String registerNumber;
    private String course;
    private LocalDateTime registerDateTime;
}
