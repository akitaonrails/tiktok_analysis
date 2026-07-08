package com.ss.android.ugc.aweme.im.callroom.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class VoipNotice implements Serializable {

    @C09CT("display_notice_text")
    public final String noticeText;

    @C09CT("display_notice")
    public final int noticeType;

    public VoipNotice() {
        this(0, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoipNotice)) {
            return false;
        }
        VoipNotice voipNotice = (VoipNotice) obj;
        return this.noticeType == voipNotice.noticeType && Intrinsics.LJFF(this.noticeText, voipNotice.noticeText);
    }

    public int hashCode() {
        int i = this.noticeType * 31;
        String str = this.noticeText;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoipNotice(noticeType=");
        sbLIZ.append(this.noticeType);
        sbLIZ.append(", noticeText=");
        sbLIZ.append(this.noticeText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VoipNotice(int i, String str) {
        this.noticeType = i;
        this.noticeText = str;
    }
}
