package vj0;

import X.C1152520g66;
import X.C11NJ;
import X.C20441214yg;
import X.C2188811AlT;
import X.C915980Zwa;
import X.C964500bCq;
import X.C964510bCr;
import X.C964560bCw;
import X.C964580bCy;
import X.C964610bD1;
import X.C970940bNE;
import X.EnumC958900b3o;
import X.EnumC964530bCt;
import X.EnumC964540bCu;
import X.InterfaceC964570bCx;
import android.content.Context;
import com.bytedance.android.live.liveinteract.linkroom.CohostListPanelDismissEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.event.QuickCoHostStateChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.List;
import kotlin.jvm.internal.AFwS250S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements InterfaceC964570bCx {
    public static final d LIZIZ;
    public static volatile C964610bD1 LIZJ;
    public static volatile C11NJ LIZLLL;

    static {
        d dVar = new d();
        LIZIZ = dVar;
        LIZLLL = new C11NJ();
        InterfaceC964570bCx.LIZ.getClass();
        C964580bCy.LIZIZ = dVar;
        C20441214yg.LJIIIZ("PreferencePanelServiceImpl", "registered as PreferencePanelService impl");
    }

    public final void LIZIZ() {
        C964610bD1 c964610bD1 = LIZJ;
        if (c964610bD1 == null) {
            return;
        }
        C20441214yg.LJIIIZ("PreferencePanelServiceImpl", "close");
        LIZJ = null;
        DataChannelGlobal.LLILZ.zQ2(this);
        LIZLLL.dispose();
        LIZLLL = new C11NJ();
        c964610bD1.LJZI(false);
    }

    @Override // X.InterfaceC964570bCx
    public final void LIZ(Context context, EnumC964540bCu enumC964540bCu) {
        int rawValue;
        if (LIZJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("livesdk_match_preference_open_skipped_already_open entrance=");
            sbLIZ.append(enumC964540bCu.getWireValue());
            C20441214yg.LJIIL("PreferencePanelServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!C1152520g66.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("open(");
            sbLIZ2.append(enumC964540bCu.getWireValue());
            sbLIZ2.append(") blocked — feature disabled");
            C20441214yg.LJIIL("PreferencePanelServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (enumC964540bCu == EnumC964540bCu.QUICK_PAIR_CARD && !C915980Zwa.LJI().LIZ().LJIJI()) {
            C20441214yg.LJIIL("PreferencePanelServiceImpl", "QUICK_PAIR_CARD blocked — host not music-qualified");
            return;
        }
        EnumC958900b3o enumC958900b3oK0 = C915980Zwa.LJIIIZ().k0();
        if (enumC958900b3oK0 == EnumC958900b3o.NONE) {
            rawValue = EnumC964530bCt.APPLY_PREFERENCE_AND_QUICKMATCH.getRawValue();
        } else {
            rawValue = EnumC964530bCt.APPLY_PREFERENCE_ONLY.getRawValue();
        }
        List<Integer> listLJJJJZI = C915980Zwa.LJI().LIZ().LJJJJZI();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("open entrance=");
        sbLIZ3.append(enumC964540bCu.getWireValue());
        sbLIZ3.append(" status=");
        sbLIZ3.append(enumC958900b3oK0);
        sbLIZ3.append(" action=");
        sbLIZ3.append(rawValue);
        sbLIZ3.append(" ids=");
        sbLIZ3.append(listLJJJJZI);
        C20441214yg.LJIIIZ("PreferencePanelServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
        C964610bD1 c964610bD1 = new C964610bD1(rawValue, listLJJJJZI, enumC964540bCu, new C964510bCr(this), new C964500bCq(this), new C964560bCw(this));
        if (!C970940bNE.LIZJ(context, c964610bD1)) {
            C20441214yg.LJ("PreferencePanelServiceImpl", "open failed: jumpLynxPopupPage returned false");
            return;
        }
        LIZJ = c964610bD1;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.CQ2(CohostListPanelDismissEvent.class, this, AFwS250S0000000_15.get$arr$(247));
        dataChannelGlobal.CQ2(QuickCoHostStateChannel.class, this, AFwS250S0000000_15.get$arr$(248));
    }
}
