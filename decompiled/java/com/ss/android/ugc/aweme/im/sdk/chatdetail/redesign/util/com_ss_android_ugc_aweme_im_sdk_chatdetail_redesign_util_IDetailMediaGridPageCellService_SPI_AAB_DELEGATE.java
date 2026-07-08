package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.DetailMediaGridPageCellServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_sdk_chatdetail_redesign_util_IDetailMediaGridPageCellService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_sdk_chatdetail_redesign_util_IDetailMediaGridPageCellService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_sdk_chatdetail_redesign_util_IDetailMediaGridPageCellService_SPI_AAB_DELEGATE();
    public static final C01GW DetailMediaGridPageCellServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(493));

    private final DetailMediaGridPageCellServiceImpl getDetailMediaGridPageCellServiceImplinstance() {
        return (DetailMediaGridPageCellServiceImpl) DetailMediaGridPageCellServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IDetailMediaGridPageCellService> getServices() {
        ArrayList<IDetailMediaGridPageCellService> arrayList = new ArrayList<>();
        arrayList.add(getDetailMediaGridPageCellServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IDetailMediaGridPageCellService getService() {
        return getDetailMediaGridPageCellServiceImplinstance();
    }
}
