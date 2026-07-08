package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommercePitayaInfo implements Serializable {

    @C09CT("client_ai_upload_json_str")
    public String pitayaUpload;

    @C09CT("sati_param_for_pitaya")
    public String satiParamForPitaya;

    public CommercePitayaInfo() {
        this("", "");
    }

    public final void setPitayaUpload(String str) {
        this.pitayaUpload = str;
    }

    public final void setSatiParamForPitaya(String str) {
        this.satiParamForPitaya = str;
    }

    public CommercePitayaInfo(String str, String str2) {
        this.pitayaUpload = str;
        this.satiParamForPitaya = str2;
    }
}
