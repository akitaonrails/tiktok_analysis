package com.ss.android.ugc.aweme.service;

import X.C19EG;
import X.C21524119Lj;
import android.content.Context;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public interface ICollabService {
    boolean LIZ();

    void LIZIZ();

    void LIZJ(C19EG c19eg, C21524119Lj c21524119Lj);

    long LIZLLL();

    void LJ();

    boolean LJFF();

    long LJI();

    ICollabEventTrackingService LJII();

    void LJIIIIZZ(ReusedUIAssem reusedUIAssem, int i, int i2);

    LiveData LJIIIZ(LifecycleRegistry lifecycleRegistry);

    void LJIIJ(String str, C19EG c19eg, Aweme aweme, String str2, Function0<Unit> function0, String str3);

    void LJIIJJI(C19EG c19eg, Aweme aweme, boolean z);

    void LJIIL(Context context, String str, List<? extends User> list, OnActivityResultCallback onActivityResultCallback);
}
