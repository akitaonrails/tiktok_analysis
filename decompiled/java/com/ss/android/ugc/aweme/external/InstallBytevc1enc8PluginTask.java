package com.ss.android.ugc.aweme.external;

import X.AnonymousClass1403;
import X.C098200Yq;
import X.C0CCZ;
import X.C0VZ0;
import X.C189200o6;
import X.C201955140j;
import X.C2188811AlT;
import X.C844020X9c;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20194513zz;
import X.InterfaceC842850X4p;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes31.dex */
public final class InstallBytevc1enc8PluginTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InstallBytevc1enc8PluginTask";
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Object c098200Yq;
        if (!InterfaceC20194513zz.LJIIL.isEnableBytevc1enc8Plugin()) {
            return;
        }
        final IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_ve_enc8")) {
            C201955140j.LIZ("Bytevc1enc8Plugin -> com.ss.android.ugc.aweme.df_ve_enc8 installed");
            return;
        }
        C201955140j.LIZ("Bytevc1enc8Plugin -> start install com.ss.android.ugc.aweme.df_ve_enc8");
        C844020X9c c844020X9c = new C844020X9c();
        c844020X9c.LIZIZ = true;
        c844020X9c.LIZ = "com.ss.android.ugc.aweme.df_ve_enc8";
        AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
        anonymousClass1403.LIZIZ = false;
        anonymousClass1403.LIZJ = false;
        anonymousClass1403.LIZLLL = false;
        anonymousClass1403.LJIIIZ = false;
        c844020X9c.LJ = anonymousClass1403.LIZ();
        c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.13zs
            @Override // X.InterfaceC842850X4p
            public final void LIZJ(String str, boolean z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Bytevc1enc8Plugin -> plugin install success, packageName=");
                sbLIZ.append(str);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (iPluginService.LIZLLL() != null) {
                    C1BLW.LIZIZ(str, true);
                }
            }

            @Override // X.InterfaceC842850X4p
            public final void LIZ(int i, String str, boolean z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Bytevc1enc8Plugin -> plugin download failed, packageName=");
                sbLIZ.append(str);
                sbLIZ.append(", reason = ");
                sbLIZ.append(i);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (iPluginService.LIZLLL() != null) {
                    C1BLW.LIZIZ(str, false);
                }
            }
        };
        iPluginService.LJJI(c844020X9c.LIZ());
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Bytevc1enc8Plugin -> InstallBytevc1enc8PluginTask run failed ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
