package com.ss.android.ugc.aweme.im.service.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class QrcodeCreateGroupEntranceConfig {

    @C09CT("entrance_icon_res")
    public final String entranceIconRes;

    @C09CT("entrance_text")
    public final String entranceText;

    public QrcodeCreateGroupEntranceConfig() {
        this("", "");
    }

    public QrcodeCreateGroupEntranceConfig(String str, String str2) {
        this.entranceIconRes = str;
        this.entranceText = str2;
    }
}
