package com.ss.android.ugc.aweme.im.common.perfmonitor.firstdraw;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.common.perfmonitor.impl.firstdraw.FirstFramePerfMonImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_common_perfmonitor_firstdraw_FirstFramePerfMon_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_common_perfmonitor_firstdraw_FirstFramePerfMon_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_common_perfmonitor_firstdraw_FirstFramePerfMon_SPI_AAB_DELEGATE();
    public static final C01GW FirstFramePerfMonImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(372));

    private final FirstFramePerfMonImpl getFirstFramePerfMonImplinstance() {
        return (FirstFramePerfMonImpl) FirstFramePerfMonImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<FirstFramePerfMon> getServices() {
        ArrayList<FirstFramePerfMon> arrayList = new ArrayList<>();
        arrayList.add(getFirstFramePerfMonImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public FirstFramePerfMon getService() {
        return getFirstFramePerfMonImplinstance();
    }
}
