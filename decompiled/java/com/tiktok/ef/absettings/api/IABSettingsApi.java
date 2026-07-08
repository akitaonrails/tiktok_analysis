package com.tiktok.ef.absettings.api;

import X.AbstractC19483511Kn;
import X.C0X52;
import X.C311600CJi;
import android.app.Application;
import android.content.Context;
import com.google.gson.k;
import com.google.gson.n;

/* JADX INFO: loaded from: classes5.dex */
public interface IABSettingsApi {

    public interface FetchCallback {
        void onAfterSaveToDB(n nVar, n nVar2);

        void onBeforeSaveToDB();
    }

    void LIZ(Application application);

    AbstractC19483511Kn<C0X52<k>> LIZIZ(Context context, String str);

    boolean LIZJ(Context context, n nVar, C311600CJi c311600CJi, FetchCallback fetchCallback);

    void LIZLLL(Application application);
}
