package com.stackoverflow.project.Stackoverflow.service;

import com.stackoverflow.project.Stackoverflow.dto.AnswerDTO;
import com.stackoverflow.project.Stackoverflow.dto.InsertAnswerDTO;
import com.stackoverflow.project.Stackoverflow.dto.RequestAnswerDTO;
import com.stackoverflow.project.Stackoverflow.model.Answer;
import com.stackoverflow.project.Stackoverflow.repository.AnswerRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AnswerService {

    ResponseEntity<Answer> getAnswer(Long id);

    List<Answer> getAnswers();

    ResponseEntity<Answer> createAnswer(AnswerDTO newAnswer);

    ResponseEntity<Answer> updateAnswer(Long id, AnswerDTO updatedAnswer);

    ResponseEntity<RequestAnswerDTO> deleteAnswer(Long id);

    RequestAnswerDTO insertAnswer(Long questionId, InsertAnswerDTO insertAnswerDTO);

    RequestAnswerDTO editAnswer(Long id, String newText);
}
