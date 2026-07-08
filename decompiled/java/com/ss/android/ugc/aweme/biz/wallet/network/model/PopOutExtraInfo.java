package com.ss.android.ugc.aweme.biz.wallet.network.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class PopOutExtraInfo implements Serializable {

    @C09CT("change_phone_scene")
    public final String scene;

    @C09CT("change_phone_session_id")
    public final String sessionId;

    public PopOutExtraInfo(String str, String str2) {
        this.scene = str;
        this.sessionId = str2;
    }
}
