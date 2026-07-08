package com.ss.android.ugc.aweme.legoImp.task.kidsmode;

import X.C0CCZ;
import X.C0VZ0;
import X.C1150504el;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class KidsModeFetchKidsSettingTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "KidsModeFetchKidsSettingTask";
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
        C1150504el.LIZ().LIZLLL("method_init_fetch_kids_setting_duration_kids_mode", false);
        IKidsCommonService iKidsCommonService = (IKidsCommonService) PluggableExtentionKt.pluggableSpi$default(IKidsCommonService.class, false, false, false, 14, null);
        if (iKidsCommonService != null) {
            iKidsCommonService.LJII();
        }
        C1150504el.LIZ().LJI("method_init_fetch_kids_setting_duration_kids_mode", false);
    }
}
