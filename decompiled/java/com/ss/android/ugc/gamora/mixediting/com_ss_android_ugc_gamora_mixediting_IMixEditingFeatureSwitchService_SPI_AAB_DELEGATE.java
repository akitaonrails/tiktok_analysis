package com.ss.android.ugc.gamora.mixediting;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureSwitchServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_gamora_mixediting_IMixEditingFeatureSwitchService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_gamora_mixediting_IMixEditingFeatureSwitchService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_gamora_mixediting_IMixEditingFeatureSwitchService_SPI_AAB_DELEGATE();
    public static final C01GW MixEditingFeatureSwitchServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(735));
    public static final int $stable = 8;

    private final MixEditingFeatureSwitchServiceImpl getMixEditingFeatureSwitchServiceImplinstance() {
        return (MixEditingFeatureSwitchServiceImpl) MixEditingFeatureSwitchServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMixEditingFeatureSwitchService> getServices() {
        ArrayList<IMixEditingFeatureSwitchService> arrayList = new ArrayList<>();
        arrayList.add(getMixEditingFeatureSwitchServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMixEditingFeatureSwitchService getService() {
        return getMixEditingFeatureSwitchServiceImplinstance();
    }
}
