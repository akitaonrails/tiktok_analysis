package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes26.dex */
public final class MobileEffectResponse {
    public int LIZ;

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("message")
    public final String message;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("ttep_effect_id")
    public final String ttepEffectId;

    public MobileEffectResponse() {
        this(0, "", 0, null, -1);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MobileEffectResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", ttepEffectId=");
        sbLIZ.append(this.ttepEffectId);
        sbLIZ.append(", httpStatusCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MobileEffectResponse(int i, String str, int i2, String str2, int i3) {
        this.statusCode = i;
        this.message = str;
        this.errorCode = i2;
        this.ttepEffectId = str2;
        this.LIZ = i3;
    }
}
