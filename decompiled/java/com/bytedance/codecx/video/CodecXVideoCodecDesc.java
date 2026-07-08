package com.bytedance.codecx.video;

/* JADX INFO: loaded from: classes21.dex */
public class CodecXVideoCodecDesc {
    public final CodecXVideoCodecProfile profile;
    public final CodecXVideoCodecStandard standard;

    public int GetProfileInt() {
        return this.profile.toInt();
    }

    public int GetStandardInt() {
        return this.standard.toInt();
    }

    public String getName() {
        return this.standard.mimeType();
    }

    public CodecXVideoCodecProfile getProfile() {
        return this.profile;
    }

    public CodecXVideoCodecStandard getStandard() {
        return this.standard;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CodecXVideoCodecDesc)) {
            return false;
        }
        CodecXVideoCodecDesc codecXVideoCodecDesc = (CodecXVideoCodecDesc) obj;
        if (this.standard != codecXVideoCodecDesc.standard || this.profile != codecXVideoCodecDesc.profile) {
            return false;
        }
        return true;
    }

    public CodecXVideoCodecDesc(int i, int i2) {
        this.standard = CodecXVideoCodecStandard.fromValue(i);
        this.profile = CodecXVideoCodecProfile.fromValue(i2);
    }

    public CodecXVideoCodecDesc(CodecXVideoCodecStandard codecXVideoCodecStandard, CodecXVideoCodecProfile codecXVideoCodecProfile) {
        this.standard = codecXVideoCodecStandard;
        this.profile = codecXVideoCodecProfile;
    }
}
