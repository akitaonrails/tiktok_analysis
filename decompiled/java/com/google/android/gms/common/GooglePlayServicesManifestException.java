package com.google.android.gms.common;

import X.C829100Wfk;

/* JADX INFO: loaded from: classes14.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {
    public final int LL;

    public int getActualVersion() {
        return this.LL;
    }

    public int getExpectedVersion() {
        return C829100Wfk.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public GooglePlayServicesManifestException(int i, String str) {
        super(str);
        this.LL = i;
    }
}
