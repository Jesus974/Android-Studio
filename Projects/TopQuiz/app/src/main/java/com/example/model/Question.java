package com.example.model;

import java.util.List;

public class Question {

    private String mQuestion;
    private List<String> mChoiceList;
    private int mAnswerIndex;
    private String mExplain;

    public Question(String question, List<String> choiceList, int answerIndex, String Explain) {
        mQuestion = question;
        mChoiceList = choiceList;
        mAnswerIndex = answerIndex;
        mExplain = Explain;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        mQuestion = question;
    }

    public List<String> getChoiceList() {
        return mChoiceList;
    }

    public void setChoiceList(List<String> choiceList) {
        mChoiceList = choiceList;
    }

    public int getAnswerIndex() {
        return mAnswerIndex;
    }

    public void setAnswerIndex(int answerIndex) {
        mAnswerIndex = answerIndex;
    }

    public String getExplain() {
        return mExplain;
    }

    public void setExplain(String explain) {
        mExplain = explain;
    }
}
