package com.ss.android.ugc.aweme.df;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.chatdetail.redesign.notify.GroupNotifyPage;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_df_IGroupNotifyPage_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_df_IGroupNotifyPage_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_df_IGroupNotifyPage_SPI_AAB_DELEGATE();
    public static final C01GW GroupNotifyPageinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(215));

    private final GroupNotifyPage getGroupNotifyPageinstance() {
        return (GroupNotifyPage) GroupNotifyPageinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IGroupNotifyPage> getServices() {
        ArrayList<IGroupNotifyPage> arrayList = new ArrayList<>();
        arrayList.add(getGroupNotifyPageinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IGroupNotifyPage getService() {
        return getGroupNotifyPageinstance();
    }
}
