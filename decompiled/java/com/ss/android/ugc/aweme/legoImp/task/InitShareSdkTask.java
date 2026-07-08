package com.ss.android.ugc.aweme.legoImp.task;

import X.C04TD;
import X.C0CCZ;
import X.C0CD2;
import X.C0VZ0;
import X.C799890VZj;
import X.C799900VZk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.share.ShareSdkService;
import com.ss.android.ugc.sdk.ShareSdkServiceImpl;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class InitShareSdkTask implements C0CCZ {
    public static final InitShareSdkTask LL = new InitShareSdkTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitShareSdkTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ShareSdkService shareSdkService;
        ShareSdkService.LIZ.getClass();
        Object objLIZ = C04TD.LIZ(ShareSdkService.class, false);
        if (objLIZ != null) {
            shareSdkService = (ShareSdkService) objLIZ;
        } else {
            if (C04TD.Q6 == null) {
                synchronized (ShareSdkService.class) {
                    if (C04TD.Q6 == null) {
                        C04TD.Q6 = new ShareSdkServiceImpl();
                    }
                }
            }
            shareSdkService = C04TD.Q6;
        }
        shareSdkService.LIZ();
        if (((Boolean) C0CD2.LJJJJI.getValue()).booleanValue()) {
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(new InitShareOrderListTask());
            c799890VZj.LIZIZ();
            return;
        }
        new InitShareOrderListTask().run(context);
    }
}
