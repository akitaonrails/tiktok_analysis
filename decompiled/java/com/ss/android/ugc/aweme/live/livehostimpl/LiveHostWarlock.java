package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C1954807lC;
import X.C823930WTv;
import com.bytedance.android.livesdkapi.host.IHostWarlock;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.warlock.IWarlockService;
import com.ss.ugc.live.sdk.message.data.warlock.WLDataModel;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveHostWarlock implements IHostWarlock {
    @Override // com.bytedance.android.livesdkapi.host.IHostWarlock
    public final boolean isOpen() {
        ((IWarlockService) ServiceManager.get().getService(IWarlockService.class)).isOpen();
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWarlock
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWarlock
    public final void sendMessage(WLDataModel wLDataModel) {
        IWarlockService iWarlockService = (IWarlockService) ServiceManager.get().getService(IWarlockService.class);
        new Object() { // from class: X.1Bxr
            {
                System.currentTimeMillis();
            }
        };
        switch (C823930WTv.LIZ[wLDataModel.getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                wLDataModel.getSubType();
                wLDataModel.getName();
                wLDataModel.getTime();
                wLDataModel.getParams();
                wLDataModel.getResult();
                iWarlockService.LIZIZ();
                return;
            default:
                throw new C1954807lC();
        }
    }
}
