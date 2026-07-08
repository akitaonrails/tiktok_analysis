package com.ss.android.ugc.aweme.mention;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_mention_IMentionPanelFactory_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_mention_IMentionPanelFactory_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_mention_IMentionPanelFactory_SPI_AAB_DELEGATE();
    public static final C01GW MentionPanelFactoryImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(586));

    private final MentionPanelFactoryImpl getMentionPanelFactoryImplinstance() {
        return (MentionPanelFactoryImpl) MentionPanelFactoryImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMentionPanelFactory> getServices() {
        ArrayList<IMentionPanelFactory> arrayList = new ArrayList<>();
        arrayList.add(getMentionPanelFactoryImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMentionPanelFactory getService() {
        return getMentionPanelFactoryImplinstance();
    }
}
