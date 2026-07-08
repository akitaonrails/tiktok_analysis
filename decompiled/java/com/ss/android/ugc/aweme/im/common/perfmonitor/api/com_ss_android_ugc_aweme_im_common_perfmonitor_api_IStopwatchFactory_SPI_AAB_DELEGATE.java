package com.ss.android.ugc.aweme.im.common.perfmonitor.api;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.common.perfmonitor.impl.SimpleStopwatchFactory;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_common_perfmonitor_api_IStopwatchFactory_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_common_perfmonitor_api_IStopwatchFactory_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_common_perfmonitor_api_IStopwatchFactory_SPI_AAB_DELEGATE();
    public static final C01GW SimpleStopwatchFactoryinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(370));

    private final SimpleStopwatchFactory getSimpleStopwatchFactoryinstance() {
        return (SimpleStopwatchFactory) SimpleStopwatchFactoryinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IStopwatchFactory> getServices() {
        ArrayList<IStopwatchFactory> arrayList = new ArrayList<>();
        arrayList.add(getSimpleStopwatchFactoryinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IStopwatchFactory getService() {
        return getSimpleStopwatchFactoryinstance();
    }
}
