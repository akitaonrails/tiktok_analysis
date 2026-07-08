package com.ss.android.ugc.aweme.multi.maker;

import X.C0ACH;
import X.C1052180dUG;
import X.C13LP;
import X.C1554610qYd;
import X.C1697810uHb;
import X.C2344009Gk;
import X.C258720ABy;
import X.EnumC1050190dR3;
import X.EnumC1430380nKG;
import X.InterfaceC1392640mLO;
import X.InterfaceC1393560mMs;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.ss.android.ugc.aweme.anchor.service.IShortDramaReserveAnchorExpService;
import com.ss.android.ugc.aweme.feed.flexible.preload.FlexibleSparkPreloadProtocol;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class ShortDramaReserveAnchorMaker extends CommonAnchorMaker {
    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new ShortDramaReserveAnchorMaker();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.SHORT_DRAMA_RESERVE.getTYPE();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.isEmpty()) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        IShortDramaReserveAnchorExpService iShortDramaReserveAnchorExpService = (IShortDramaReserveAnchorExpService) PluggableExtentionKt.pluggableSpi$default(IShortDramaReserveAnchorExpService.class, false, false, false, 14, null);
        if (iShortDramaReserveAnchorExpService != null && iShortDramaReserveAnchorExpService.LIZ()) {
            AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) C13LP.LJJJJZI(arrayList);
            list.remove(anchorCommonStruct2);
            LJIILIIL(anchorCommonStruct2);
            this.LLIZ = anchorCommonStruct2;
            return EnumC1050190dR3.DONE;
        }
        list.removeAll(arrayList);
        return EnumC1050190dR3.NOT_FOUND;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
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

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        String schema;
        this.LLJI = true;
        LJJIJL();
        if (((Boolean) C0ACH.LIZ.getValue()).booleanValue()) {
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
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        AnchorCommonStruct anchorCommonStruct;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        if (interfaceC1392640mLO.LJII() && (anchorCommonStruct = this.LLIZ) != null && anchorCommonStruct.getStandardComponentInfo() != null && ((Boolean) C258720ABy.LIZ.getValue()).booleanValue()) {
            return;
        }
        super.LJJJLL(view, c2344009Gk);
    }
}
