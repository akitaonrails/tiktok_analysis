package com.ss.android.ugc.aweme.legoImp.task.kidsmode;

import X.C0CCZ;
import X.C0VZ0;
import X.C1150504el;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC842850X4p;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class KidsModeCheckAABDownloadTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "KidsModeCheckAABDownloadTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1150504el.LIZ().LIZLLL("method_init_check_kids_aab", false);
        IChildModeService iChildModeService = (IChildModeService) PluggableExtentionKt.pluggableSpi$default(IChildModeService.class, false, false, false, 14, null);
        if (iChildModeService != null) {
            iChildModeService.LJIIJ(new InterfaceC842850X4p() { // from class: X.0X27
                @Override // X.InterfaceC842850X4p
                public final void LIZJ(String str, boolean z) {
                    IKidsCommonService iKidsCommonService = (IKidsCommonService) PluggableExtentionKt.pluggableSpi$default(IKidsCommonService.class, false, false, false, 14, null);
                    if (iKidsCommonService != null) {
                        iKidsCommonService.LJ();
                    }
                }

                @Override // X.InterfaceC842850X4p
                public final void LIZ(int i, String str, boolean z) {
                    IKidsCommonService iKidsCommonService = (IKidsCommonService) PluggableExtentionKt.pluggableSpi$default(IKidsCommonService.class, false, false, false, 14, null);
                    if (iKidsCommonService != null) {
                        iKidsCommonService.LJ();
                    }
                }
            }, "cold launch", true);
        }
        C1150504el.LIZ().LJI("method_init_check_kids_aab", false);
    }
}
