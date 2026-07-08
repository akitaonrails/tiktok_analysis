package com.ss.lyrax.transcoder;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public class MixStreamCommonConfig {
    public LyraxTranscoderAppdataSEIMode appdataSEIMode;
    public String backgroundColor;
    public String serverMixTaskId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStreamCommonConfig{backgroundColor='");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append('\'');
        sbLIZ.append(", appdataSEIMode=");
        sbLIZ.append(this.appdataSEIMode);
        sbLIZ.append(", serverMixTaskId='");
        sbLIZ.append(this.serverMixTaskId);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxTranscoderAppdataSEIMode getAppdataSEIMode() {
        return this.appdataSEIMode;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getServerMixTaskId() {
        return this.serverMixTaskId;
    }

    public void setAppdataSEIMode(LyraxTranscoderAppdataSEIMode lyraxTranscoderAppdataSEIMode) {
        this.appdataSEIMode = lyraxTranscoderAppdataSEIMode;
    }

    public void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public void setServerMixTaskId(String str) {
        this.serverMixTaskId = str;
    }
}
