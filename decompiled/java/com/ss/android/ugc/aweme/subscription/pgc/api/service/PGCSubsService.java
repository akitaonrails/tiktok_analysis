package com.ss.android.ugc.aweme.subscription.pgc.api.service;

import X.C0K6O;
import X.C11NZ;
import X.InterfaceC511460K4a;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.gson.n;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;

/* JADX INFO: loaded from: classes8.dex */
public interface PGCSubsService {
    Fragment LIZ();

    void LIZIZ(Context context, boolean z, String str, String str2, String str3, String str4, SubscriptionSceneContext subscriptionSceneContext);

    C0K6O LIZJ();

    Fragment LIZLLL();

    Fragment LJ(Bundle bundle, String str, String str2, String str3);

    InterfaceC511460K4a LJFF();

    InterfaceC511460K4a LJI();

    boolean LJII(Context context, String str, Bundle bundle);

    Fragment LJIIIIZZ();

    C11NZ<n> getSubscribeInfo(boolean z, String str, boolean z2, String str2, int i);

    Context wrapWithPgcOverlay(Context context);
}
