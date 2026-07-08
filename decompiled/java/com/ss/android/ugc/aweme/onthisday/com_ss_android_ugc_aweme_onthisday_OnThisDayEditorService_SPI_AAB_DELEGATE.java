package com.ss.android.ugc.aweme.onthisday;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_onthisday_OnThisDayEditorService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_onthisday_OnThisDayEditorService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_onthisday_OnThisDayEditorService_SPI_AAB_DELEGATE();
    public static final C01GW OnThisDayEditorServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(598));
    public static final int $stable = 8;

    private final OnThisDayEditorServiceImpl getOnThisDayEditorServiceImplinstance() {
        return (OnThisDayEditorServiceImpl) OnThisDayEditorServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<OnThisDayEditorService> getServices() {
        ArrayList<OnThisDayEditorService> arrayList = new ArrayList<>();
        arrayList.add(getOnThisDayEditorServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public OnThisDayEditorService getService() {
        return getOnThisDayEditorServiceImplinstance();
    }
}
