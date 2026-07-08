package com.ss.android.ugc.aweme;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_IMGroupChatApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_IMGroupChatApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_IMGroupChatApi_SPI_AAB_DELEGATE();
    public static final C01GW IMGroupChatDelegateinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(201));

    private final IMGroupChatDelegate getIMGroupChatDelegateinstance() {
        return (IMGroupChatDelegate) IMGroupChatDelegateinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMGroupChatApi> getServices() {
        ArrayList<IMGroupChatApi> arrayList = new ArrayList<>();
        arrayList.add(getIMGroupChatDelegateinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMGroupChatApi getService() {
        return getIMGroupChatDelegateinstance();
    }
}
