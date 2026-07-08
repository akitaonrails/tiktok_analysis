package com.ss.android.ugc.aweme.multi.maker;

import X.AbstractC1066890drz;
import X.C1052180dUG;
import X.C123100dR;
import X.C13BV;
import X.C13LQ;
import X.C1554610qYd;
import X.C1697810uHb;
import X.C2344009Gk;
import X.C707720RpS;
import X.EnumC1050190dR3;
import X.EnumC1430380nKG;
import X.InterfaceC1392640mLO;
import X.InterfaceC1393560mMs;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.flexible.preload.FlexibleSparkPreloadProtocol;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class E2EGeneralAnchorMaker extends AbstractC1066890drz implements FlexibleSparkPreloadProtocol {
    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new E2EGeneralAnchorMaker();
    }

    @Override // com.ss.android.ugc.aweme.feed.flexible.preload.FlexibleSparkPreloadProtocol
    public final List<String> e51() {
        String schema;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        return (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null) ? C13BV.INSTANCE : C1697810uHb.LJIILJJIL(schema);
    }

    @Override // com.ss.android.ugc.aweme.feed.flexible.preload.FlexibleSparkPreloadProtocol
    public final String o7() {
        String componentKey;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        return (anchorCommonStruct == null || (componentKey = anchorCommonStruct.getComponentKey()) == null) ? "" : componentKey;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            if (anchorCommonStruct2.getGeneralType() == 2 && C123100dR.LIZ(anchorCommonStruct2.getSchema()) && C13LQ.LJJIJ(anchorCommonStruct2.getType(), new int[]{EnumC1430380nKG.GREEN_SCREEN_ANCHOR_TYPE.getTYPE()}) < 0) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct3 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        list.remove(anchorCommonStruct3);
        LJIILIIL(anchorCommonStruct3);
        this.LLIZ = anchorCommonStruct3;
        if (arrayList.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LLLIZZ(Aweme aweme) {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zK0 = interfaceC1392640mLO.k0();
        if (interfaceC665370Q7zK0 != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7zK0, FlexibleSparkPreloadProtocol.class, this);
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        String schema;
        super.p1(c2344009Gk);
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = null;
        if (anchorCommonStruct != null) {
            schema = anchorCommonStruct.getSchema();
        } else {
            schema = null;
        }
        if (C1052180dUG.LIZ(schema)) {
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
            if (interfaceC1392640mLO2 != null) {
                interfaceC1392640mLO = interfaceC1392640mLO2;
            }
            InterfaceC665370Q7z interfaceC665370Q7zK0 = interfaceC1392640mLO.k0();
            if (interfaceC665370Q7zK0 != null) {
                C1554610qYd.LIZJ(interfaceC665370Q7zK0, FlexibleSparkPreloadProtocol.class, C1697810uHb.LJIILJJIL(this));
            }
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String schema;
        String componentKey;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        InterfaceC1392640mLO interfaceC1392640mLO2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        Activity activityLIZIZ = interfaceC1392640mLO.LIZIZ();
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            schema = anchorCommonStruct.getSchema();
        } else {
            schema = null;
        }
        if (C1052180dUG.LIZIZ(schema)) {
            if (schema == null) {
                schema = "";
            }
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
            if (interfaceC1392640mLO3 == null) {
                interfaceC1392640mLO3 = null;
            }
            String strCf = interfaceC1392640mLO3.Cf();
            Aweme awemeLJIIZILJ = LJIIZILJ();
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            if (anchorCommonStruct2 != null) {
                componentKey = anchorCommonStruct2.getComponentKey();
            } else {
                componentKey = null;
            }
            String strLIZ = C707720RpS.LIZ(awemeLJIIZILJ, schema, strCf, componentKey, "anchor", this.LLILLL);
            InterfaceC1392640mLO interfaceC1392640mLO4 = this.LL;
            if (interfaceC1392640mLO4 != null) {
                interfaceC1392640mLO2 = interfaceC1392640mLO4;
            }
            Fragment fragmentLJ = interfaceC1392640mLO2.LJ();
            if (fragmentLJ != null) {
                SmartRouter.buildFragmentRoute(fragmentLJ, strLIZ).open(0);
                return;
            } else {
                SmartRouter.buildRoute(activityLIZIZ, strLIZ).open();
                return;
            }
        }
        LJJIJ(new AwS595S0100000_16(activityLIZIZ, 120));
    }
}
