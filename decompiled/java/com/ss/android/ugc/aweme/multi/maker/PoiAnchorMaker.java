package com.ss.android.ugc.aweme.multi.maker;

import X.AbstractC1066890drz;
import X.C01GW;
import X.C1199400hJi;
import X.C1367960lha;
import X.C1400390mXt;
import X.C1558520qew;
import X.C2344009Gk;
import X.C692070RCr;
import X.C692090RCt;
import X.C712510RxB;
import X.C712520RxC;
import X.C786410Ut5;
import X.EnumC1050190dR3;
import X.EnumC1188920h2o;
import X.EnumC1430380nKG;
import X.InterfaceC1197120hG2;
import X.InterfaceC1392640mLO;
import X.InterfaceC1393560mMs;
import X.InterfaceC665370Q7z;
import X.InterfaceC718610SGt;
import Y.ACListenerS54S0400000_18;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAnchorMaker extends AbstractC1066890drz implements FcpStandardPreloadProtocol {
    public final C1367960lha LLJ;
    public final InterfaceC1197120hG2 LLJI;
    public final String LLJIJIL;
    public boolean LLJILJIL;
    public final C1400390mXt LLJILJILJ;

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, InterfaceC718610SGt> so1() {
        return null;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final String LIZLLL() {
        String strLIZLLL;
        InterfaceC1197120hG2 interfaceC1197120hG2 = this.LLJI;
        return (interfaceC1197120hG2 == null || (strLIZLLL = interfaceC1197120hG2.LIZLLL()) == null) ? super.LIZLLL() : strLIZLLL;
    }

    @Override // X.AbstractC1066890drz
    public final boolean LJIJI() {
        C1367960lha.LIZ.getClass();
        return C1367960lha.LIZ().LJLJLJ();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final CharSequence LJJIZ() {
        InterfaceC1197120hG2 interfaceC1197120hG2 = this.LLJI;
        if (interfaceC1197120hG2 != null) {
            return interfaceC1197120hG2.LJJIZ();
        }
        return null;
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJJZ() {
        InterfaceC1197120hG2 interfaceC1197120hG2;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zK0 = interfaceC1392640mLO.k0();
        if (interfaceC665370Q7zK0 == null || (interfaceC1197120hG2 = this.LLJI) == null) {
            return;
        }
        interfaceC1197120hG2.LLJJIJI(interfaceC665370Q7zK0, this);
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> Yr2() {
        InterfaceC1197120hG2 interfaceC1197120hG2 = this.LLJI;
        if (interfaceC1197120hG2 != null) {
            return interfaceC1197120hG2.LLJJJJLIIL(LJIIZILJ(), LJIJJLI());
        }
        return null;
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new PoiAnchorMaker();
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void onBind() {
        InterfaceC1197120hG2 interfaceC1197120hG2;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zK0 = interfaceC1392640mLO.k0();
        if (interfaceC665370Q7zK0 == null || (interfaceC1197120hG2 = this.LLJI) == null) {
            return;
        }
        interfaceC1197120hG2.LLLIL(interfaceC665370Q7zK0, this);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.POI.getTYPE();
    }

    public PoiAnchorMaker() {
        IPoiService iPoiServiceLIZ;
        C1367960lha c1367960lha = C1367960lha.LIZ;
        this.LLJ = c1367960lha;
        this.LLJI = (c1367960lha == null || (iPoiServiceLIZ = C1367960lha.LIZ()) == null) ? null : iPoiServiceLIZ.LJJJZ();
        this.LLJIJIL = "video_anchor";
        this.LLJILJILJ = new C1400390mXt(null, null, null, null, null, 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003f A[PHI: r0
      0x003f: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v9 java.lang.String) binds: [B:23:0x003c, B:16:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJIJIIJI() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LJIIZILJ()
            r2 = 0
            if (r0 == 0) goto L15
            java.util.List r0 = r0.getAnchors()
            if (r0 == 0) goto L15
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L15
            r2 = 1
        L15:
            java.lang.String r1 = ""
            if (r2 == 0) goto L2c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LJIIZILJ()
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r0.getPoiDataStruct()
            if (r0 == 0) goto L2b
            com.ss.android.ugc.aweme.poi.PoiAnchorInfo r0 = r0.commentAnchor
            if (r0 == 0) goto L2b
            java.lang.String r0 = r0.trackInfo
            if (r0 != 0) goto L3f
        L2b:
            return r1
        L2c:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LJIIZILJ()
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r0.getPoiDataStruct()
            if (r0 == 0) goto L2b
            com.ss.android.ugc.aweme.poi.PoiAnchorInfo r0 = r0.videoAnchor
            if (r0 == 0) goto L2b
            java.lang.String r0 = r0.trackInfo
            if (r0 != 0) goto L3f
            return r1
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.multi.maker.PoiAnchorMaker.LJJIJIIJI():java.lang.String");
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        InterfaceC1197120hG2 interfaceC1197120hG2 = this.LLJI;
        if (interfaceC1197120hG2 != null) {
            interfaceC1197120hG2.LLJJJJ(LJIIZILJ(), this.LLJIJIL, LJIJJLI(), null, false, false, LJJIJIIJI(), c2344009Gk, new AwS597S0100000_18(this, 189));
        }
    }

    @Override // X.AbstractC1066890drz
    public final void LJJI(boolean z) {
        PoiDataStruct poiDataStruct = LJIIZILJ().getPoiDataStruct();
        if (poiDataStruct != null) {
            poiDataStruct.setAnchorAvoidResult(z);
        }
        PoiDataStruct poiDataStruct2 = LJIIZILJ().getPoiDataStruct();
        if (poiDataStruct2 != null) {
            poiDataStruct2.setAnchorShowed(!z);
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJJJI(SmartImageView smartImageView) {
        LJJIIZI(smartImageView, new AwS419S0200000_18(this, smartImageView, 49));
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJJ(C712520RxC c712520RxC) {
        String strDs0;
        RootCellCommonAbility rootCellCommonAbility;
        InterfaceC665370Q7z interfaceC665370Q7z = c712520RxC.LIZ;
        if (interfaceC665370Q7z == null || (rootCellCommonAbility = (RootCellCommonAbility) C1558520qew.LIZ(interfaceC665370Q7z, RootCellCommonAbility.class, null)) == null || (strDs0 = rootCellCommonAbility.ds0()) == null) {
            strDs0 = "";
        }
        C01GW c01gw = C692070RCr.LIZ;
        C692090RCt c692090RCtLIZLLL = C692070RCr.LIZLLL(strDs0, "PoiAnchorMaker", "attachContext");
        this.LL = c712520RxC;
        InterfaceC1197120hG2 interfaceC1197120hG2 = this.LLJI;
        if (interfaceC1197120hG2 != null) {
            C712510RxB c712510RxB = c712520RxC.LIZIZ;
            interfaceC1197120hG2.LLLILZLLLI(c712510RxB.LIZ, "video_default", c712510RxB.LIZJ, false);
        }
        InterfaceC1197120hG2 interfaceC1197120hG22 = this.LLJI;
        if (interfaceC1197120hG22 != null) {
            interfaceC1197120hG22.LLZ();
        }
        C692070RCr.LIZ(c692090RCtLIZLLL, strDs0, null, null);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        if (!C1199400hJi.LIZJ(LJIIZILJ().getUgcPoiTicketDetail()) && !C1199400hJi.LIZ(LJIIZILJ().getUgcPoiTicketDetail())) {
            return super.LJJJJLL(list);
        }
        Iterator<AnchorCommonStruct> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AnchorCommonStruct next = it2.next();
            if (next.getType() == type()) {
                if (next != null) {
                    list.remove(next);
                }
            }
        }
        return EnumC1050190dR3.NOT_FOUND;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LLLIZZ(Aweme aweme) {
        InterfaceC1197120hG2 interfaceC1197120hG2 = this.LLJI;
        if (interfaceC1197120hG2 != null) {
            interfaceC1197120hG2.LLLIZZ(aweme);
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        InterfaceC1197120hG2 interfaceC1197120hG2 = this.LLJI;
        if (interfaceC1197120hG2 != null) {
            interfaceC1197120hG2.LJJLL(LJIIZILJ(), this.LLJIJIL, LJIJJLI(), false, LJJIJIIJI(), c2344009Gk, null, new AwS597S0100000_18(this, 188));
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        EnumC1188920h2o anchorNavigateTarget;
        PoiDataStruct poiDataStruct = LJIIZILJ().getPoiDataStruct();
        InterfaceC1392640mLO interfaceC1392640mLO = null;
        if (poiDataStruct == null || (anchorNavigateTarget = poiDataStruct.getAnchorNavigateTarget(false)) == null) {
            anchorNavigateTarget = EnumC1188920h2o.DEFAULT;
        }
        InterfaceC1197120hG2 interfaceC1197120hG2 = this.LLJI;
        if (interfaceC1197120hG2 != null) {
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
            if (interfaceC1392640mLO2 != null) {
                interfaceC1392640mLO = interfaceC1392640mLO2;
            }
            interfaceC1197120hG2.LLLLIIL(interfaceC1392640mLO.LIZIZ(), view, LJIIZILJ(), this.LLJIJIL, LJIJJLI(), c2344009Gk, false, null, LJJIJIIJI(), null, false, anchorNavigateTarget, null, new AwS597S0100000_18(this, 187));
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        EnumC1188920h2o anchorNavigateTarget;
        IPoiService iPoiServiceLIZ;
        IPoiService iPoiServiceLIZ2;
        View viewLLF = null;
        viewLLF = null;
        viewLLF = null;
        viewLLF = null;
        viewLLF = null;
        InterfaceC1392640mLO interfaceC1392640mLO = null;
        viewLLF = null;
        viewLLF = null;
        if (this.LLJI == null) {
            return null;
        }
        PoiDataStruct poiDataStruct = LJIIZILJ().getPoiDataStruct();
        if (poiDataStruct == null || (anchorNavigateTarget = poiDataStruct.getAnchorNavigateTarget(false)) == null) {
            anchorNavigateTarget = EnumC1188920h2o.DEFAULT;
        }
        if (anchorNavigateTarget == EnumC1188920h2o.DEFAULT) {
            if (this.LLJI != null && this.LLJ != null && (iPoiServiceLIZ2 = C1367960lha.LIZ()) != null) {
                InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
                if (interfaceC1392640mLO2 == null) {
                    interfaceC1392640mLO2 = null;
                }
                View viewLJJL = iPoiServiceLIZ2.LJJL(interfaceC1392640mLO2.LIZIZ(), LJIIZILJ());
                if (viewLJJL != null) {
                    C786410Ut5.I7(new ACListenerS54S0400000_18(this, viewLJJL, c2344009Gk, dialog, 0), viewLJJL);
                    viewLLF = viewLJJL;
                    viewGroup.addView(viewLLF);
                }
            }
        } else if (this.LLJI != null && this.LLJ != null && (iPoiServiceLIZ = C1367960lha.LIZ()) != null) {
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
            if (interfaceC1392640mLO3 != null) {
                interfaceC1392640mLO = interfaceC1392640mLO3;
            }
            viewLLF = iPoiServiceLIZ.LLF(interfaceC1392640mLO.LIZIZ(), LJIIZILJ(), LJIJJLI(), this.LLJIJIL);
            if (viewLLF != null) {
                viewGroup.addView(viewLLF);
            }
        }
        return viewLLF;
    }

    public final void LJJIJIIJIL(int i, int i2, int i3, int i4, int i5, int i6) {
        InterfaceC1197120hG2 interfaceC1197120hG2 = this.LLJI;
        if (interfaceC1197120hG2 != null) {
            interfaceC1197120hG2.LLLFFI(i, i2, 0, i4, i5, 0);
        }
        if (i4 > 0 || i5 > 0) {
            this.LLJILJIL = true;
        }
    }
}
