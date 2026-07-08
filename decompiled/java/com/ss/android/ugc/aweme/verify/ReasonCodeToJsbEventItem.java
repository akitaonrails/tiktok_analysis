package com.ss.android.ugc.aweme.verify;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ReasonCodeToJsbEventItem {

    @C09CT("jsb_event")
    public final String jsbEvent;

    @C09CT("jsb_event_code")
    public final String jsbEventCode;

    @C09CT("jsb_event_code_type")
    public final String jsbEventCodeType;

    @C09CT("reason_code")
    public final int reasonCode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReasonCodeToJsbEventItem)) {
            return false;
        }
        ReasonCodeToJsbEventItem reasonCodeToJsbEventItem = (ReasonCodeToJsbEventItem) obj;
        return Intrinsics.LJFF(this.jsbEvent, reasonCodeToJsbEventItem.jsbEvent) && Intrinsics.LJFF(this.jsbEventCode, reasonCodeToJsbEventItem.jsbEventCode) && Intrinsics.LJFF(this.jsbEventCodeType, reasonCodeToJsbEventItem.jsbEventCodeType) && this.reasonCode == reasonCodeToJsbEventItem.reasonCode;
    }

    public final int hashCode() {
        return (((((this.jsbEvent.hashCode() * 31) + this.jsbEventCode.hashCode()) * 31) + this.jsbEventCodeType.hashCode()) * 31) + this.reasonCode;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReasonCodeToJsbEventItem(jsbEvent=");
        sbLIZ.append(this.jsbEvent);
        sbLIZ.append(", jsbEventCode=");
        sbLIZ.append(this.jsbEventCode);
        sbLIZ.append(", jsbEventCodeType=");
        sbLIZ.append(this.jsbEventCodeType);
        sbLIZ.append(", reasonCode=");
        sbLIZ.append(this.reasonCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ReasonCodeToJsbEventItem() {
        this("", "", "", 0);
    }

    public ReasonCodeToJsbEventItem(String str, String str2, String str3, int i) {
        this.jsbEvent = str;
        this.jsbEventCode = str2;
        this.jsbEventCodeType = str3;
        this.reasonCode = i;
    }
}
