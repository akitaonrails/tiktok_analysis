package com.bytedance.vcloud.strategy.drm;

import X.C2188811AlT;
import android.media.MediaCrypto;
import android.media.MediaDrm;

/* JADX INFO: loaded from: classes35.dex */
public final class SessionEntry {
    public MediaCrypto mediaCrypto;
    public MediaDrm mediaDrm;
    public final String pssh;
    public String securityLevel;
    public byte[] sessionId;
    public long sessionVersion;
    public final String streamName;
    public int widevineCode;

    public boolean isValid() {
        byte[] bArr;
        return (this.mediaDrm == null || (bArr = this.sessionId) == null || bArr.length <= 0 || this.mediaCrypto == null) ? false : true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SessionEntry{streamName=");
        sbLIZ.append(this.streamName);
        sbLIZ.append(", pssh=");
        sbLIZ.append(this.pssh);
        sbLIZ.append(", cacheKey=");
        sbLIZ.append(PsshUtils.cacheKeyOf(this.pssh));
        sbLIZ.append(", sessionId=");
        sbLIZ.append(PsshUtils.bytesToHex(this.sessionId));
        sbLIZ.append(", mediaDrm=");
        sbLIZ.append(PsshUtils.identityOf(this.mediaDrm));
        sbLIZ.append(", mediaCrypto=");
        sbLIZ.append(PsshUtils.identityOf(this.mediaCrypto));
        sbLIZ.append(", securityLevel=");
        sbLIZ.append(this.securityLevel);
        sbLIZ.append(", widevineCode=");
        sbLIZ.append(this.widevineCode);
        sbLIZ.append(", sessionVersion=");
        sbLIZ.append(this.sessionVersion);
        sbLIZ.append(", isValid=");
        sbLIZ.append(isValid());
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SessionEntry(String str, String str2) {
        this.streamName = str;
        this.pssh = str2;
    }
}
