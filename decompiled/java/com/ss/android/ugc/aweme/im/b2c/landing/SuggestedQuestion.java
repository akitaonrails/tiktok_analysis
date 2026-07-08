package com.ss.android.ugc.aweme.im.b2c.landing;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1735006qq;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SuggestedQuestion implements InterfaceC1735006qq {

    @C09CT("question_text")
    public final String displayText;

    @C09CT("question_id")
    public final long id;

    @C09CT("question_ver")
    public final long qnVer;

    @C09CT("replies")
    public final List<BusinessAutoMessage> replies;

    @C09CT("set_by")
    public final String setBy;

    @C09CT("source")
    public final int source;

    public SuggestedQuestion() {
        this(0L, 0L, null, null, 0, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedQuestion)) {
            return false;
        }
        SuggestedQuestion suggestedQuestion = (SuggestedQuestion) obj;
        return this.id == suggestedQuestion.id && this.qnVer == suggestedQuestion.qnVer && Intrinsics.LJFF(this.displayText, suggestedQuestion.displayText) && Intrinsics.LJFF(this.setBy, suggestedQuestion.setBy) && this.source == suggestedQuestion.source && Intrinsics.LJFF(this.replies, suggestedQuestion.replies);
    }

    public final int hashCode() {
        int iY2 = ((((((((C786410Ut5.Y2(this.id) * 31) + C786410Ut5.Y2(this.qnVer)) * 31) + this.displayText.hashCode()) * 31) + this.setBy.hashCode()) * 31) + this.source) * 31;
        List<BusinessAutoMessage> list = this.replies;
        return iY2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestedQuestion(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", qnVer=");
        sbLIZ.append(this.qnVer);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(", setBy=");
        sbLIZ.append(this.setBy);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", replies=");
        sbLIZ.append(this.replies);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1735006qq
    public final String LIZ() {
        return this.displayText;
    }

    public SuggestedQuestion(long j, long j2, String str, String str2, int i, List<BusinessAutoMessage> list) {
        this.id = j;
        this.qnVer = j2;
        this.displayText = str;
        this.setBy = str2;
        this.source = i;
        this.replies = list;
    }

    public SuggestedQuestion(long j, long j2, String str, String str2, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) == 0 ? j2 : 0L, (i2 & 4) != 0 ? "" : str, (i2 & 8) == 0 ? str2 : "", (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? C13BV.INSTANCE : list);
    }
}
