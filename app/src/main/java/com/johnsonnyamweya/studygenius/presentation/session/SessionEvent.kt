package com.johnsonnyamweya.studygenius.presentation.session

import com.johnsonnyamweya.studygenius.domain.model.Session
import com.johnsonnyamweya.studygenius.domain.model.Subject

sealed class SessionEvent {
    data class OnRelatedSubjectChange(val subject: Subject): SessionEvent()
    data class SaveSession(val duration: Long): SessionEvent()
    data class OnDeleteSessionButtonClick(val session: Session): SessionEvent()
    data object DeleteSession: SessionEvent()
    data object NotifyToUpdateSubject: SessionEvent()
    data class UpdateSubjectIdAndRelatedSubject(
        val subjectId: Int?,
        val relatedToSubject: String?
    ): SessionEvent()
}