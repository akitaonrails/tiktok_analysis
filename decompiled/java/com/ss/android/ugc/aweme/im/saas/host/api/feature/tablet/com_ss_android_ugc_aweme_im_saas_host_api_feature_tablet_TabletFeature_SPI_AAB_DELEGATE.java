package com.ss.android.ugc.aweme.im.saas.host.api.feature.tablet;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.tablet.TabletFeatureImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_feature_tablet_TabletFeature_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_feature_tablet_TabletFeature_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_feature_tablet_TabletFeature_SPI_AAB_DELEGATE();
    public static final C01GW TabletFeatureImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(427));
    public static final int $stable = 8;

    private final TabletFeatureImpl getTabletFeatureImplinstance() {
        return (TabletFeatureImpl) TabletFeatureImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<TabletFeature> getServices() {
        ArrayList<TabletFeature> arrayList = new ArrayList<>();
        arrayList.add(getTabletFeatureImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public TabletFeature getService() {
        return getTabletFeatureImplinstance();
    }
}
