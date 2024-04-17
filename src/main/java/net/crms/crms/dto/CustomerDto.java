package net.crms.crms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CustomerDto {
    private Long id;
    private String name;
    private String email;
    private String phone;
    public String issue;
    public String deliverystatus;
}
