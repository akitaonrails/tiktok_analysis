package com.ss.android.ugc.aweme.social.creation.api.mediapicker;

import X.C0L6P;
import X.InterfaceC1631620sYq;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public interface StoryNavigationService {
    TokenCert chooseBPEAToken(String str, String str2, String str3);

    void customizeStartStoryPublish(Activity activity, EnterStoryParam enterStoryParam, InterfaceC1631620sYq<? super Activity, ? super Bundle, ? super Integer, Unit> interfaceC1631620sYq);

    C0L6P getDebugService();

    boolean openStoryRecordingPageDirectly(Context context, EnterStoryParam enterStoryParam, Bundle bundle);

    void requestPermission(Activity activity, EnterStoryParam enterStoryParam, TokenCert tokenCert, Function1<? super Boolean, Unit> function1, Function0<Unit> function0);

    void startStoryPublish(Activity activity, EnterStoryParam enterStoryParam, TokenCert tokenCert);

    void trimLowMemoryTask();

    void warmUpMediaResources();
}
