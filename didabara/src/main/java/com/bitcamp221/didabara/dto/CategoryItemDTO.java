package com.bitcamp221.didabara.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryItemDTO {

  private Long id;
  private String itemPath;
  private Long categoryId;
  private LocalDate expiredDate;
}
