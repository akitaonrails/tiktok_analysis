package com.ss.android.legoimpl;

import X.C0CCZ;
import X.C0VZ0;
import X.C1BWL;
import X.C2206241BWk;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.app.IInitAllService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class BusinessToolsTask implements C0CCZ {
    public static BusinessToolsTask LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "BusinessToolsTask";
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

    public static BusinessToolsTask LIZ() {
        if (LL == null) {
            LL = new BusinessToolsTask();
        }
        return LL;
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        if (!C2206241BWk.LIZ()) {
            return true;
        }
        C844470XAv.LIZ.getClass();
        return TextUtils.equals(C844470XAv.LJIILL, "business") || TextUtils.equals(C844470XAv.LJIILL, "release_outer_test");
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ((IInitAllService) ServiceManager.get().getService(IInitAllService.class)).LIZ(C1BWL.LIZ());
    }
}
