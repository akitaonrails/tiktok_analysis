package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class OnboardingLink extends C1893670zNV {

    @C09CT("jump_link")
    public String jumpLink;

    @C09CT("notification_id")
    public String notificationId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingLink)) {
            return false;
        }
        OnboardingLink onboardingLink = (OnboardingLink) obj;
        return Intrinsics.LJFF(this.jumpLink, onboardingLink.jumpLink) && Intrinsics.LJFF(this.notificationId, onboardingLink.notificationId);
    }

    public final int hashCode() {
        return (this.jumpLink.hashCode() * 31) + this.notificationId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingLink(jumpLink=");
        sbLIZ.append(this.jumpLink);
        sbLIZ.append(", notificationId=");
        sbLIZ.append(this.notificationId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OnboardingLink(String str, String str2) {
        this.jumpLink = str;
        this.notificationId = str2;
    }
}
