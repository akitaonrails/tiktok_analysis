package com.ss.android.ugc.aweme.portrait.service;

import X.C19A3;
import X.C19EG;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.portrait.model.OpenGenerationPageParams;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public interface IAIPortraitLauncher {
    Class<? extends C19A3> customizeRootSceneClass();

    C19A3 customizeRootSceneInstance();

    void enterPhotoEditPageAfterSuccess(C19EG c19eg, CreativeInfo creativeInfo, CreativeModel creativeModel, boolean z, Function0<Unit> function0);

    Class<? extends C19A3> generationRootSceneClass();

    C19A3 generationRootSceneInstance();

    boolean handlePortraitRoute(Context context, String str, Bundle bundle);

    void launchGeneratePage(OpenGenerationPageParams openGenerationPageParams, Context context);

    void onClickPortraitFromProfileAsset(Context context, AIPortraitEnterParams aIPortraitEnterParams);

    void openAssetHub(Activity activity, String str, String str2, String str3);

    void openPortraitCustomizeTab(Context context, AIPortraitEnterParams aIPortraitEnterParams);

    void openPortraitTab(Context context, AIPortraitEnterParams aIPortraitEnterParams);

    void openStylePreviewScene(Context context, AIPortraitEnterParams aIPortraitEnterParams);

    Class<? extends C19A3> stylePreviewRootSceneClass();

    C19A3 stylePreviewRootSceneInstance();

    Class<? extends C19A3> tabRootSceneClass();

    C19A3 tabRootSceneInstance();
}
