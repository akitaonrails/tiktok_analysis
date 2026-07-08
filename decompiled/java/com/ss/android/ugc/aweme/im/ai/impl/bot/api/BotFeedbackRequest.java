package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BotFeedbackRequest implements Serializable {

    @C09CT("action_enum")
    public final Integer actionEnum;

    @C09CT("additional_feedback")
    public final String additionalFeedback;

    @C09CT("edit")
    public final Boolean edit;

    @C09CT("feedback_reason_ids")
    public final List<Integer> feedbackReasonIds;

    @C09CT("msg_id")
    public final Long msgId;

    public BotFeedbackRequest() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotFeedbackRequest)) {
            return false;
        }
        BotFeedbackRequest botFeedbackRequest = (BotFeedbackRequest) obj;
        return Intrinsics.LJFF(this.actionEnum, botFeedbackRequest.actionEnum) && Intrinsics.LJFF(this.msgId, botFeedbackRequest.msgId) && Intrinsics.LJFF(this.feedbackReasonIds, botFeedbackRequest.feedbackReasonIds) && Intrinsics.LJFF(this.additionalFeedback, botFeedbackRequest.additionalFeedback) && Intrinsics.LJFF(this.edit, botFeedbackRequest.edit);
    }

    public int hashCode() {
        Integer num = this.actionEnum;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.msgId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List<Integer> list = this.feedbackReasonIds;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.additionalFeedback;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.edit;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotFeedbackRequest(actionEnum=");
        sbLIZ.append(this.actionEnum);
        sbLIZ.append(", msgId=");
        sbLIZ.append(this.msgId);
        sbLIZ.append(", feedbackReasonIds=");
        sbLIZ.append(this.feedbackReasonIds);
        sbLIZ.append(", additionalFeedback=");
        sbLIZ.append(this.additionalFeedback);
        sbLIZ.append(", edit=");
        sbLIZ.append(this.edit);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BotFeedbackRequest(Integer num, Long l, List<Integer> list, String str, Boolean bool) {
        this.actionEnum = num;
        this.msgId = l;
        this.feedbackReasonIds = list;
        this.additionalFeedback = str;
        this.edit = bool;
    }
}
