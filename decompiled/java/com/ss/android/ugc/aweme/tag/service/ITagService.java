package com.ss.android.ugc.aweme.tag.service;

import X.C11VD;
import X.C19EG;
import X.InterfaceC1631620sYq;
import android.content.Context;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public interface ITagService {
    void LIZ();

    int LIZIZ();

    void LIZJ(Context context, String str, Aweme aweme, int i, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback);

    void LIZLLL(C19EG c19eg, String str, Aweme aweme, int i, List<InteractionTagUserInfo> list, InterfaceC1631620sYq<? super List<InteractionTagUserInfo>, ? super Boolean, ? super Boolean, Unit> interfaceC1631620sYq);

    LiveData LJ(LifecycleRegistry lifecycleRegistry);

    void LJFF(C19EG c19eg, boolean z, Function0<Unit> function0);

    void LJI(C19EG c19eg, Aweme aweme, String str, String str2);

    C11VD LJII();
}
