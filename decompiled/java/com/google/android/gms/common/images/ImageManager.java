package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes14.dex */
public final class ImageManager {
    public static final Object LIZ = new Object();

    static {
        new HashSet();
    }

    public final class ImageReceiver extends ResultReceiver {
        public final Uri zab;
        public final ArrayList<Object> zac;

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            throw null;
        }
    }
}
