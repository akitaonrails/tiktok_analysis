package com.ss.android.ugc.aweme.im.saas.host.api.feature.story;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.story.StreakStoryFeatureImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_feature_story_StreakStoryFeature_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_feature_story_StreakStoryFeature_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_feature_story_StreakStoryFeature_SPI_AAB_DELEGATE();
    public static final C01GW StreakStoryFeatureImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(425));
    public static final int $stable = 8;

    private final StreakStoryFeatureImpl getStreakStoryFeatureImplinstance() {
        return (StreakStoryFeatureImpl) StreakStoryFeatureImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<StreakStoryFeature> getServices() {
        ArrayList<StreakStoryFeature> arrayList = new ArrayList<>();
        arrayList.add(getStreakStoryFeatureImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public StreakStoryFeature getService() {
        return getStreakStoryFeatureImplinstance();
    }
}
