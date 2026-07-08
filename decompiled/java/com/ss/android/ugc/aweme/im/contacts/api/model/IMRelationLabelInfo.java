package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IMRelationLabelInfo {

    @C09CT("mob_value")
    public final String mobValue;

    @C09CT("text")
    public final String text;

    @C09CT("update_time")
    public final Long updateTime;

    public IMRelationLabelInfo() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMRelationLabelInfo)) {
            return false;
        }
        IMRelationLabelInfo iMRelationLabelInfo = (IMRelationLabelInfo) obj;
        return Intrinsics.LJFF(this.text, iMRelationLabelInfo.text) && Intrinsics.LJFF(this.updateTime, iMRelationLabelInfo.updateTime) && Intrinsics.LJFF(this.mobValue, iMRelationLabelInfo.mobValue);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.updateTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.mobValue;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMRelationLabelInfo(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", updateTime=");
        sbLIZ.append(this.updateTime);
        sbLIZ.append(", mobValue=");
        sbLIZ.append(this.mobValue);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMRelationLabelInfo(String str, Long l, String str2) {
        this.text = str;
        this.updateTime = l;
        this.mobValue = str2;
    }
}
