package com.johnsonnyamweya.studygenius.presentation.session

import com.johnsonnyamweya.studygenius.domain.model.Session
import com.johnsonnyamweya.studygenius.domain.model.Subject

data class SessionState(
    val subjects: List<Subject> = emptyList(),
    val sessions: List<Session> = emptyList(),
    val relatedToSubject: String? = null,
    val subjectId: Int? = null,
    val session: Session? = null
)
