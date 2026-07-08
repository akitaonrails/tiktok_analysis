package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class FavorAndFeedback implements Serializable {

    @C09CT("feedback_title")
    public final String feedbackTitle;

    @C09CT("feedback_type")
    public final String feedbackType;

    @C09CT("unique_id")
    public final String uniqueId;

    public final FavorAndFeedback copy(String str, String str2, String str3) {
        return new FavorAndFeedback(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavorAndFeedback)) {
            return false;
        }
        FavorAndFeedback favorAndFeedback = (FavorAndFeedback) obj;
        return Intrinsics.LJFF(this.uniqueId, favorAndFeedback.uniqueId) && Intrinsics.LJFF(this.feedbackType, favorAndFeedback.feedbackType) && Intrinsics.LJFF(this.feedbackTitle, favorAndFeedback.feedbackTitle);
    }

    public int hashCode() {
        String str = this.uniqueId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.feedbackType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.feedbackTitle;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FavorAndFeedback(uniqueId=");
        sbLIZ.append(this.uniqueId);
        sbLIZ.append(", feedbackType=");
        sbLIZ.append(this.feedbackType);
        sbLIZ.append(", feedbackTitle=");
        sbLIZ.append(this.feedbackTitle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getFeedbackTitle() {
        return this.feedbackTitle;
    }

    public final String getFeedbackType() {
        return this.feedbackType;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public FavorAndFeedback(String str, String str2, String str3) {
        this.uniqueId = str;
        this.feedbackType = str2;
        this.feedbackTitle = str3;
    }
}
