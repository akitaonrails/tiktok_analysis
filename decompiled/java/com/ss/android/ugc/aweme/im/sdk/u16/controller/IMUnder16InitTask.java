package com.ss.android.ugc.aweme.im.sdk.u16.controller;

import X.C0CCZ;
import X.C0I0B;
import X.C0VZ0;
import X.C1400340mXo;
import X.C21511719Gp;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.keva.Keva;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class IMUnder16InitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "im_under_16_init_task";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (((java.lang.Boolean) X.C2206291BWp.LJIJJLI.getValue()).booleanValue() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (X.C070Q.LIZ() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return X.EnumC799870VZh.BOOT_FINISH;
     */
    @Override // X.C0CCZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC799870VZh type() {
        /*
            r1 = this;
            boolean r0 = X.C070Q.LIZ()
            if (r0 == 0) goto L17
            X.0CBW r0 = X.C0CBW.LIZ
            boolean r0 = X.C0CBW.LIZIZ()
            if (r0 == 0) goto L2b
            boolean r0 = X.C070Q.LIZ()
            if (r0 == 0) goto L2b
        L14:
            X.0VZh r0 = X.EnumC799870VZh.BOOT_FINISH
            return r0
        L17:
            X.1BWp r0 = X.C2206291BWp.LIZ
            r0.getClass()
            X.01GW r0 = X.C2206291BWp.LJIJJLI
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2b
            goto L14
        L2b:
            X.0VZh r0 = X.EnumC799870VZh.SPARSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16InitTask.type():X.0VZh");
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C21511719Gp.LIZ.getClass();
        C21511719Gp.LIZJ(Keva.getRepo("disable_im_under_sixteen_repo"), ((C1400340mXo) C0I0B.LJFF.LIZ()).isLogin());
    }
}
