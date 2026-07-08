package com.ss.android.ugc.aweme.net.bridge;

import X.C01GW;
import X.C0CSC;
import X.C452501pT;
import com.ss.android.ugc.aweme.net.IMediaIOCoreBridgeService;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.mediakit.net.APPNetworkState;
import com.ss.mediakit.net.NQE;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class MediaIOCoreBridgeServiceImpl implements IMediaIOCoreBridgeService {
    public final C01GW LIZ;

    public MediaIOCoreBridgeServiceImpl() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(97));
        this.LIZ = c01gwLIZIZ;
        ((INetworkStateService) c01gwLIZIZ.getValue()).observerNetworkChange(new C0CSC() { // from class: X.0oWq
            @Override // X.C0CSC
            public final void LIZ(EnumC325100Com enumC325100Com) {
                APPNetworkState aPPNetworkState;
                int i = C325120Coo.LIZ[enumC325100Com.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                aPPNetworkState = new APPNetworkState();
                            } else {
                                aPPNetworkState = new APPNetworkState(APPNetworkState.Status.STRONG);
                            }
                        } else {
                            aPPNetworkState = new APPNetworkState(APPNetworkState.Status.WEAK);
                        }
                    } else {
                        aPPNetworkState = new APPNetworkState(APPNetworkState.Status.FAKE);
                    }
                } else {
                    aPPNetworkState = new APPNetworkState(APPNetworkState.Status.NOT_AVAILABLE);
                }
                NQE.getInstance().onAPPNetworkStateChanged(aPPNetworkState);
            }
        });
    }
}
