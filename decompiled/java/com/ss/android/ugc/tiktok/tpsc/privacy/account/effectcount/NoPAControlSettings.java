package com.ss.android.ugc.tiktok.tpsc.privacy.account.effectcount;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class NoPAControlSettings {

    @C09CT("content_reuse_permission")
    public final int contentReusePermission;

    @C09CT("download")
    public final int download;

    @C09CT("duet")
    public final int duet;

    @C09CT("stitch")
    public final int stitch;

    public NoPAControlSettings() {
        this(0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoPAControlSettings)) {
            return false;
        }
        NoPAControlSettings noPAControlSettings = (NoPAControlSettings) obj;
        return this.download == noPAControlSettings.download && this.duet == noPAControlSettings.duet && this.stitch == noPAControlSettings.stitch && this.contentReusePermission == noPAControlSettings.contentReusePermission;
    }

    public NoPAControlSettings(int i, int i2, int i3, int i4) {
        this.download = i;
        this.duet = i2;
        this.stitch = i3;
        this.contentReusePermission = i4;
    }
}
