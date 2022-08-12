package com.example.test.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(name = "id", unique = true, nullable = false)
  private Long id;

  @Column(name = "username", unique = true, nullable = false)
  private String username;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "nickname", unique = true, nullable = false)
  private String nickname;

  @Column(name = "rank", nullable = false)
  @ColumnDefault("0")
  private int rank;

  @Column(name = "ban", nullable = false)
  @ColumnDefault("false")
  private boolean ban;

  @Column(name = "regist_date", nullable = false)
//  @ColumnDefault() 이건 차후 알아봄.
  private LocalDate registDate;
}
