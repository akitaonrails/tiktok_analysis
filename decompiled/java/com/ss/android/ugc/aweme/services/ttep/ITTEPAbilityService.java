package com.ss.android.ugc.aweme.services.ttep;

import X.C15O7;
import X.C19EG;
import android.app.Activity;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes29.dex */
public interface ITTEPAbilityService {
    void downloadEffectAndJumpShootPage(C19EG c19eg, Function0<Boolean> function0, String str, Function1<? super Integer, Unit> function1, Function1<? super Boolean, Unit> function12);

    void downloadPreviewEffectAndResource(String str, String str2, IDownloadCallback iDownloadCallback);

    void downloadPreviewEffectAndResourceWithoutLogin(String str, String str2, IDownloadCallback iDownloadCallback);

    C15O7<Effect> downloadPreviewEffectAndResourceWithoutLoginTask(String str, String str2);

    boolean enablePreviewByDeeplink();

    void fetchTTEPMaterials(String str, Function2<Object, ? super Exception, Unit> function2);

    void jumpShootPageAndPreview(Activity activity, String str, boolean z);
}
