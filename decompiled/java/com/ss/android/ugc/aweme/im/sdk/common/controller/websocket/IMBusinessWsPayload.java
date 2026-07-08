package com.ss.android.ugc.aweme.im.sdk.common.controller.websocket;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class IMBusinessWsPayload implements Serializable {

    @C09CT("action")
    public final int action;

    public IMBusinessWsPayload(int i) {
        this.action = i;
    }
}
