package com.bytedance.android.livesdk.game.broadcast.mirror.message;

import X.C09CT;
import X.C0TE7;
import X.C0TER;
import com.google.gson.n;

/* JADX INFO: loaded from: classes13.dex */
public final class PhoneAsCameraConnectMsg implements C0TER {

    @C09CT("extra")
    public n extra;

    @C09CT("start_mirror")
    public int startMirror;

    public PhoneAsCameraConnectMsg() {
        this(-1, null);
    }

    @Override // X.C0TER
    public final String getMethodName() {
        return C0TE7.PHONE_AS_CAMERA_CONNECT.getMethod();
    }

    public PhoneAsCameraConnectMsg(int i, n nVar) {
        this.startMirror = i;
        this.extra = nVar;
    }
}
