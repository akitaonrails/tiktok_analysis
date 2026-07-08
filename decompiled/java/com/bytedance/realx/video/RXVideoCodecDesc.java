package com.bytedance.realx.video;

/* JADX INFO: loaded from: classes21.dex */
public class RXVideoCodecDesc {
    public final RXVideoCodecProfile profile;
    public final RXVideoCodecStandard standard;

    public int GetProfileInt() {
        return this.profile.toInt();
    }

    public int GetStandardInt() {
        return this.standard.toInt();
    }

    public String getName() {
        return this.standard.mimeType();
    }

    public RXVideoCodecProfile getProfile() {
        return this.profile;
    }

    public RXVideoCodecStandard getStandard() {
        return this.standard;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RXVideoCodecDesc)) {
            return false;
        }
        RXVideoCodecDesc rXVideoCodecDesc = (RXVideoCodecDesc) obj;
        if (this.standard != rXVideoCodecDesc.standard || this.profile != rXVideoCodecDesc.profile) {
            return false;
        }
        return true;
    }

    public RXVideoCodecDesc(int i, int i2) {
        this.standard = RXVideoCodecStandard.fromValue(i);
        this.profile = RXVideoCodecProfile.fromValue(i2);
    }

    public RXVideoCodecDesc(RXVideoCodecStandard rXVideoCodecStandard, RXVideoCodecProfile rXVideoCodecProfile) {
        this.standard = rXVideoCodecStandard;
        this.profile = rXVideoCodecProfile;
    }
}
