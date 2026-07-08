package com.ss.android.ugc.aweme.im.contacts.impl.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IMFeatureCapability {

    @C09CT("dm_message_interaction_status")
    public final Integer messageLongPressAndReactStatus;

    @C09CT("message_request_banner_status")
    public final Integer messageRequestBannerStatus;

    public IMFeatureCapability() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMFeatureCapability)) {
            return false;
        }
        IMFeatureCapability iMFeatureCapability = (IMFeatureCapability) obj;
        return Intrinsics.LJFF(this.messageLongPressAndReactStatus, iMFeatureCapability.messageLongPressAndReactStatus) && Intrinsics.LJFF(this.messageRequestBannerStatus, iMFeatureCapability.messageRequestBannerStatus);
    }

    public final int hashCode() {
        Integer num = this.messageLongPressAndReactStatus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.messageRequestBannerStatus;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMFeatureCapability(messageLongPressAndReactStatus=");
        sbLIZ.append(this.messageLongPressAndReactStatus);
        sbLIZ.append(", messageRequestBannerStatus=");
        sbLIZ.append(this.messageRequestBannerStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMFeatureCapability(Integer num, Integer num2) {
        this.messageLongPressAndReactStatus = num;
        this.messageRequestBannerStatus = num2;
    }
}
