package com.ss.android.ugc.gamora.mixediting;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_gamora_mixediting_IMixEditingFeatureExtractionService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_gamora_mixediting_IMixEditingFeatureExtractionService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_gamora_mixediting_IMixEditingFeatureExtractionService_SPI_AAB_DELEGATE();
    public static final C01GW MixEditingFeatureExtractionServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(734));
    public static final int $stable = 8;

    private final MixEditingFeatureExtractionService getMixEditingFeatureExtractionServiceinstance() {
        return (MixEditingFeatureExtractionService) MixEditingFeatureExtractionServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMixEditingFeatureExtractionService> getServices() {
        ArrayList<IMixEditingFeatureExtractionService> arrayList = new ArrayList<>();
        arrayList.add(getMixEditingFeatureExtractionServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMixEditingFeatureExtractionService getService() {
        return getMixEditingFeatureExtractionServiceinstance();
    }
}
