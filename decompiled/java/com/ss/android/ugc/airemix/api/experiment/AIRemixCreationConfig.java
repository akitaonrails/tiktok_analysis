package com.ss.android.ugc.airemix.api.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class AIRemixCreationConfig {

    @C09CT("allow_multiple_publish")
    public final boolean allowMultiplePublish;

    @C09CT("enable_auth_post")
    public final boolean enableAuthPost;

    @C09CT("enable_auth_save")
    public final boolean enableAuthSave;

    @C09CT("enable_auth_share")
    public final boolean enableAuthShare;

    public AIRemixCreationConfig() {
        this(true, true, true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixCreationConfig)) {
            return false;
        }
        AIRemixCreationConfig aIRemixCreationConfig = (AIRemixCreationConfig) obj;
        return this.enableAuthPost == aIRemixCreationConfig.enableAuthPost && this.enableAuthSave == aIRemixCreationConfig.enableAuthSave && this.enableAuthShare == aIRemixCreationConfig.enableAuthShare && this.allowMultiplePublish == aIRemixCreationConfig.allowMultiplePublish;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.enableAuthPost) * 31) + C786410Ut5.Z2(this.enableAuthSave)) * 31) + C786410Ut5.Z2(this.enableAuthShare)) * 31) + C786410Ut5.Z2(this.allowMultiplePublish);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixCreationConfig(enableAuthPost=");
        sbLIZ.append(this.enableAuthPost);
        sbLIZ.append(", enableAuthSave=");
        sbLIZ.append(this.enableAuthSave);
        sbLIZ.append(", enableAuthShare=");
        sbLIZ.append(this.enableAuthShare);
        sbLIZ.append(", allowMultiplePublish=");
        sbLIZ.append(this.allowMultiplePublish);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIRemixCreationConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enableAuthPost = z;
        this.enableAuthSave = z2;
        this.enableAuthShare = z3;
        this.allowMultiplePublish = z4;
    }
}
