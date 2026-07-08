package com.bytedance.im.core.message.core.metrics.ability;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.sdk.performance.Service;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_bytedance_im_core_message_core_metrics_ability_ReceiveMsgPerfTracker_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_bytedance_im_core_message_core_metrics_ability_ReceiveMsgPerfTracker_SPI_AAB_DELEGATE INSTANCE = new com_bytedance_im_core_message_core_metrics_ability_ReceiveMsgPerfTracker_SPI_AAB_DELEGATE();
    public static final C01GW Serviceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(127));

    private final Service getServiceinstance() {
        return (Service) Serviceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<ReceiveMsgPerfTracker> getServices() {
        ArrayList<ReceiveMsgPerfTracker> arrayList = new ArrayList<>();
        arrayList.add(getServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ReceiveMsgPerfTracker getService() {
        return getServiceinstance();
    }
}
