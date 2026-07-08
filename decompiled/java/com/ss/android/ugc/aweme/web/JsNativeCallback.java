package com.ss.android.ugc.aweme.web;

import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes7.dex */
public abstract class JsNativeCallback extends ResultReceiver {
    public abstract void LIZ();

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        LIZ();
    }
}
