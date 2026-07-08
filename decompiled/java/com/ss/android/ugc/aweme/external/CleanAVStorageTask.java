package com.ss.android.ugc.aweme.external;

import X.AbstractC1387200mCc;
import X.C0CCZ;
import X.C0CHQ;
import X.C0VZ0;
import X.C13VL;
import X.C1604550rrB;
import X.C1906580ziK;
import X.C280360Ayo;
import X.C289390BVx;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1603190roz;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.ToolsCleanupInUseConfig;
import com.ss.android.ugc.tiktok.tools.performance.api.storage.IToolsStorageService;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class CleanAVStorageTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CleanAVStorageTask";
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
        return EnumC799870VZh.APP_BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        IToolsStorageService iToolsStorageService;
        C13VL c13vlLIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        Object obj = null;
        if (abstractC1387200mCcLJ != null) {
            obj = abstractC1387200mCcLJ.LIZ;
        }
        if ((obj instanceof InterfaceC1603190roz) && obj != null) {
            if (C289390BVx.LIZ() && C0CHQ.LIZ().LJJIIJZLJL().getCleanUselessDraftsProvider().LIZJ()) {
                C0CHQ.LIZ().LJJIIJZLJL().getCleanUselessDraftsProvider().LIZLLL();
            }
            if (((Boolean) C280360Ayo.LIZ.getValue()).booleanValue()) {
                C0CHQ.LIZ().LJJIIJZLJL().getCleanUselessDraftsProvider().LIZIZ();
            }
            if (((ToolsCleanupInUseConfig) C1604550rrB.LIZIZ.getValue()).enable && (iToolsStorageService = (IToolsStorageService) PluggableExtentionKt.pluggableSpi$default(IToolsStorageService.class, false, false, false, 14, null)) != null && (c13vlLIZ = iToolsStorageService.LIZ()) != null) {
                c13vlLIZ.LIZIZ();
            }
        }
    }
}
