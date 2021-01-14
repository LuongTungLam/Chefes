package com.chefes.page.reponsitory;

import com.chefes.page.common.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
