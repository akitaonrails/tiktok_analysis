package com.ss.android.ugc.aweme.adaptation.ab;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SocialVideoEditPushInSAFTikTokActivityConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("rules")
    public final List<SocialVideoEditPushInSAFTikTokActivityRule> rules;

    public SocialVideoEditPushInSAFTikTokActivityConfig() {
        this(false, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialVideoEditPushInSAFTikTokActivityConfig)) {
            return false;
        }
        SocialVideoEditPushInSAFTikTokActivityConfig socialVideoEditPushInSAFTikTokActivityConfig = (SocialVideoEditPushInSAFTikTokActivityConfig) obj;
        return this.enable == socialVideoEditPushInSAFTikTokActivityConfig.enable && Intrinsics.LJFF(this.rules, socialVideoEditPushInSAFTikTokActivityConfig.rules);
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + this.rules.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialVideoEditPushInSAFTikTokActivityConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", rules=");
        sbLIZ.append(this.rules);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SocialVideoEditPushInSAFTikTokActivityConfig(boolean z, List<SocialVideoEditPushInSAFTikTokActivityRule> list) {
        this.enable = z;
        this.rules = list;
    }

    public SocialVideoEditPushInSAFTikTokActivityConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
