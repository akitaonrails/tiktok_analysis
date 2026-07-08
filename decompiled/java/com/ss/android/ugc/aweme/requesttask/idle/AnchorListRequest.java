package com.ss.android.ugc.aweme.requesttask.idle;

import X.C0C64;
import X.C0CO3;
import X.C312690CNn;
import X.C312700CNo;
import X.C312710CNp;
import X.C786410Ut5;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import X.RunnableC312720CNq;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.anchor.service.IAnchorListService;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class AnchorListRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AnchorListRequest";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.BOOT_FINISH;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        C312710CNp c312710CNp;
        if (!z && C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "anchor_fetch_list_request_optimize", true, false)) {
            return;
        }
        if (!C312690CNn.LJ) {
            C312690CNn.LIZIZ = C312690CNn.LIZ();
            C312690CNn.LJ = true;
        }
        long j = C312690CNn.LIZIZ;
        if (j != 60000 && (c312710CNp = (C312710CNp) ((LinkedHashMap) C312700CNo.LIZ).get("anchor_list")) != null) {
            j = c312710CNp.LIZ ? 2147483647L : c312710CNp.LIZIZ;
        }
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        RunnableC312720CNq runnableC312720CNq = new Runnable() { // from class: X.0CNq
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AnchorListRequest@3e76.request$1");
                try {
                    ((IAnchorListService) ServiceManager.get().getService(IAnchorListService.class)).LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AnchorListRequest@3e76.request$1");
            }
        };
        IAnchorBusinessOutBridgeService iAnchorBusinessOutBridgeService = (IAnchorBusinessOutBridgeService) PluggableExtentionKt.pluggableSpi$default(IAnchorBusinessOutBridgeService.class, false, false, false, 14, null);
        if (iAnchorBusinessOutBridgeService == null || !iAnchorBusinessOutBridgeService.LIZJ()) {
            j = 0;
        }
        C786410Ut5.LJLIIL(j, bPEAHandler, runnableC312720CNq);
    }
}
