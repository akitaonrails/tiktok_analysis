package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C1274220jGO;
import X.C1306390k6H;
import X.C1306400k6I;
import X.C2188811AlT;
import X.C326690CrL;
import X.EnumC1306820k6y;
import com.bytedance.android.livesdkapi.host.IHostStarshipStrategyService;
import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import com.bytedance.android.starship.strategy.IStarShipBaseStrategy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS599S0100000_20;

/* JADX INFO: loaded from: classes21.dex */
public final class HostStarshipStrategyService implements IHostStarshipStrategyService {
    @Override // com.bytedance.android.livesdkapi.host.IHostStarshipStrategyService
    public final void QI0() {
        ((IStarShipBaseStrategy) ServiceManager.get().getService(IStarShipStrategy.class)).loadStarShipStrategy();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostStarshipStrategyService
    public final void HI1(AwS599S0100000_20 awS599S0100000_20) {
        C326690CrL.LIZ.getStrategyResult(new C1306400k6I("mix_stream_downgrade"), new AwS599S0100000_20(awS599S0100000_20, 46));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostStarshipStrategyService
    public final void TD1(AFwS245S0000000_12 aFwS245S0000000_12) {
        C326690CrL.LIZ.LJIIJ(EnumC1306820k6y.START_LIVE, aFwS245S0000000_12);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostStarshipStrategyService
    public final C1274220jGO gf(String str, String str2) {
        Map<String, Object> map;
        String str3;
        String string;
        Map<String, Object> map2;
        Object obj;
        C1306390k6H<Map<String, Object>> c1306390k6HGf = C326690CrL.LIZ.gf(str, str2);
        C1274220jGO c1274220jGO = new C1274220jGO();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ostStarshipStrategyService starShip Node: ");
        Integer num = null;
        sbLIZ.append((Object) null);
        sbLIZ.append(',');
        if (c1306390k6HGf != null) {
            map = c1306390k6HGf.LIZ;
        } else {
            map = null;
        }
        sbLIZ.append(map);
        sbLIZ.append(',');
        if (c1306390k6HGf != null) {
            str3 = c1306390k6HGf.LIZIZ;
        } else {
            str3 = null;
        }
        sbLIZ.append(str3);
        sbLIZ.append(',');
        if (c1306390k6HGf != null) {
            num = c1306390k6HGf.LIZJ;
        }
        sbLIZ.append(num);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1306390k6HGf == null || (map2 = c1306390k6HGf.LIZ) == null || (obj = map2.get("b_data")) == null || (string = obj.toString()) == null) {
            string = "";
        }
        c1274220jGO.LIZ = string;
        return c1274220jGO;
    }
}
