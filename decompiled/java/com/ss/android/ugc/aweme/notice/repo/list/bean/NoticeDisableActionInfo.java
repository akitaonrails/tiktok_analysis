package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class NoticeDisableActionInfo {

    @C09CT("disable_key")
    public final String disableKey;

    @C09CT("highlighted")
    public final boolean highlighted;

    @C09CT("mute_type")
    public final String muteType;

    @C09CT("text")
    public final String text;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeDisableActionInfo)) {
            return false;
        }
        NoticeDisableActionInfo noticeDisableActionInfo = (NoticeDisableActionInfo) obj;
        return Intrinsics.LJFF(this.text, noticeDisableActionInfo.text) && Intrinsics.LJFF(this.disableKey, noticeDisableActionInfo.disableKey) && this.highlighted == noticeDisableActionInfo.highlighted && Intrinsics.LJFF(this.muteType, noticeDisableActionInfo.muteType);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeDisableActionInfo(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", disableKey=");
        sbLIZ.append(this.disableKey);
        sbLIZ.append(", highlighted=");
        sbLIZ.append(this.highlighted);
        sbLIZ.append(", muteType=");
        sbLIZ.append(this.muteType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NoticeDisableActionInfo(String str, String str2, boolean z, String str3) {
        this.text = str;
        this.disableKey = str2;
        this.highlighted = z;
        this.muteType = str3;
    }
}
