package com.ss.android.ugc.aweme.ecommerce.anchor.utils;

import X.C0CCZ;
import X.C0VZ0;
import X.C20236114Fz;
import X.C2203431BLp;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC486470J5x;
import android.content.Context;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ss.android.ugc.aweme.anchor.service.IAnchorListService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: loaded from: classes31.dex */
public final class AnchorFetchListTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AnchorFetchListTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C20236114Fz c20236114Fz = new InterfaceC486470J5x() { // from class: X.14Fz
            @Override // X.InterfaceC486470J5x
            public final void LIZIZ(WsChannelMsg wsChannelMsg) throws JSONException {
                C21271918Mj c21271918Mj = C21271918Mj.LIZ;
                String string = wsChannelMsg.toString();
                c21271918Mj.getClass();
                C1421105hJ.LIZLLL("rd_anchor_premission_validation", new Pair("validation_time", Long.valueOf(System.currentTimeMillis())), new Pair("extra", string));
                ((IAnchorListService) ServiceManager.get().getService(IAnchorListService.class)).LIZ();
            }
        };
        c20236114Fz.getClass();
        C2203431BLp.LIZIZ.LJI(50331725, 1, c20236114Fz);
    }
}
