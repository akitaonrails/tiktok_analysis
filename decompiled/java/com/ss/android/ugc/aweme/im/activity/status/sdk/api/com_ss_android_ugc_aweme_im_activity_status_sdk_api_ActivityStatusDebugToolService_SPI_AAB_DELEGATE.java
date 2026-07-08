package com.ss.android.ugc.aweme.im.activity.status.sdk.api;

import X.C01GW;
import X.C1079004Jw;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusDebugToolServiceImpl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_activity_status_sdk_api_ActivityStatusDebugToolService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_activity_status_sdk_api_ActivityStatusDebugToolService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_activity_status_sdk_api_ActivityStatusDebugToolService_SPI_AAB_DELEGATE();
    public static final C01GW ActivityStatusDebugToolServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C1079004Jw());

    private final ActivityStatusDebugToolServiceImpl getActivityStatusDebugToolServiceImplinstance() {
        return (ActivityStatusDebugToolServiceImpl) ActivityStatusDebugToolServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<ActivityStatusDebugToolService> getServices() {
        ArrayList<ActivityStatusDebugToolService> arrayList = new ArrayList<>();
        arrayList.add(getActivityStatusDebugToolServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ActivityStatusDebugToolService getService() {
        return getActivityStatusDebugToolServiceImplinstance();
    }
}
