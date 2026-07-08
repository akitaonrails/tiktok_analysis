package com.bytedance.android.livesdkapi.user;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes13.dex */
public final class DetailLivePermission {

    @C09CT("enableLiveStudio")
    public final boolean enableLiveStudio;

    @C09CT("enableLiveVoice")
    public final boolean enableLiveVoice;

    @C09CT("enableShowLiveStudio")
    public final boolean enableShowLiveStudio;

    @C09CT("obsPermission")
    public final boolean obsPermission;

    @C09CT("screenPermission")
    public final boolean screenPermission;

    @C09CT("videoPermission")
    public final boolean videoPermission;

    public DetailLivePermission() {
        this(false, false, false, false, false, false);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DetailLivePermission(videoPermission=");
        sbLIZ.append(this.videoPermission);
        sbLIZ.append(", screenPermission=");
        sbLIZ.append(this.screenPermission);
        sbLIZ.append(", obsPermission=");
        sbLIZ.append(this.obsPermission);
        sbLIZ.append(", enableLiveStudio=");
        sbLIZ.append(this.enableLiveStudio);
        sbLIZ.append(", enableShowLiveStudio=");
        sbLIZ.append(this.enableShowLiveStudio);
        sbLIZ.append(", enableLiveVoice=");
        sbLIZ.append(this.enableLiveVoice);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DetailLivePermission(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.videoPermission = z;
        this.screenPermission = z2;
        this.obsPermission = z3;
        this.enableLiveStudio = z4;
        this.enableShowLiveStudio = z5;
        this.enableLiveVoice = z6;
    }
}
