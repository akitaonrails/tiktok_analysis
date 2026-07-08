package com.ss.android.ugc.aweme.im.activity.status.sdk.api;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusContainer;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class com_ss_android_ugc_aweme_im_activity_status_sdk_api_ActivityStatusService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_activity_status_sdk_api_ActivityStatusService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_activity_status_sdk_api_ActivityStatusService_SPI_AAB_DELEGATE();
    public static final C01GW ActivityStatusContainerinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS195S0000000_9.get$arr$(124));

    private final ActivityStatusContainer getActivityStatusContainerinstance() {
        return (ActivityStatusContainer) ActivityStatusContainerinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<ActivityStatusService> getServices() {
        ArrayList<ActivityStatusService> arrayList = new ArrayList<>();
        arrayList.add(getActivityStatusContainerinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ActivityStatusService getService() {
        return getActivityStatusContainerinstance();
    }
}
