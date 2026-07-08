package com.ss.android.ugc.aweme.services;

import X.InterfaceC1178904jL;
import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.filter.IFilterService;
import com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;

/* JADX INFO: loaded from: classes26.dex */
public interface IFoundationAVService {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface IFetchResourcesListener {
        void onFailed(Exception exc);

        void onSuccess(String[] strArr);
    }

    IAVSettingsService avSettingsService();

    IEffectService effectService();

    void fetchResourcesNeededByRequirements(String[] strArr, IFetchResourcesListener iFetchResourcesListener);

    IFilterService getFilterService();

    ISDKService getSDKService();

    IVideoLegalCheckerAndToastService getVideoLegalCheckerAndToastService(Context context);

    void loadLibrary(String str, Application application);

    String photoDir(CreativeInfo creativeInfo);

    void setLastInfo(InterfaceC1178904jL interfaceC1178904jL);

    void tryCopyDuetDefaultLayout();
}
