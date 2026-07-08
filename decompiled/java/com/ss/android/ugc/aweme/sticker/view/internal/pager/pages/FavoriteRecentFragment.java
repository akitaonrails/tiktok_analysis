package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import X.C01GW;
import X.C0DXR;
import X.C1630880sXe;
import X.C1631250sYF;
import X.C1635990sft;
import X.C1636000sfu;
import X.C1636010sfv;
import X.C1636320sgQ;
import X.C1636520sgk;
import X.C452501pT;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625970sPj;
import X.InterfaceC1631540sYi;
import X.InterfaceC1635560sfC;
import X.InterfaceC1636390sgX;
import android.view.ViewGroup;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class FavoriteRecentFragment extends FavoriteFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4ICw4LTdiPyY2P2slJzHELIOSs2OistJWEjKSIpO2EjKSIpOmEVKTMjOyYnLRcpKio9PAM+KCg+LSs4";
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 421));

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.FavoriteFragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final InterfaceC1631540sYi<Effect> rS() {
        return new FavoriteRecentStickerListViewModel(this, RR(), PR().LIZIZ, UR(), PR().LJI, ((Number) this.LLJJJJLIIL.getValue()).intValue());
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.FavoriteFragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final C1636320sgQ sS() {
        final InterfaceC1624480sNK interfaceC1624480sNKRR = RR();
        final InterfaceC1635560sfC interfaceC1635560sfCUR = UR();
        final InterfaceC1631540sYi<Effect> interfaceC1631540sYiIS = iS();
        final C1636520sgk c1636520sgk = PR().LJFF;
        final InterfaceC1625970sPj interfaceC1625970sPj = OR().LIZLLL;
        final InterfaceC1636390sgX interfaceC1636390sgX = OR().LIZIZ;
        final C1631250sYF c1631250sYFOR = OR();
        final EffectCategoryModel effectCategoryModelHS = hS();
        final int i = this.LLILZIL;
        ((Number) this.LLJJJJLIIL.getValue()).intValue();
        return new C1635990sft(interfaceC1624480sNKRR, interfaceC1635560sfCUR, interfaceC1631540sYiIS, c1636520sgk, interfaceC1625970sPj, interfaceC1636390sgX, c1631250sYFOR, effectCategoryModelHS, i) { // from class: X.0sfr
            @Override // X.C1636320sgQ, X.AbstractC1636650sgx
            public final void LLLFZ(C1636260sgK<Effect> c1636260sgK) {
                super.LLLFZ(c1636260sgK);
                if (c1636260sgK instanceof AbstractViewOnClickListenerC1636290sgN) {
                    ((AbstractViewOnClickListenerC1636290sgN) c1636260sgK).LLJ = new InterfaceC1636220sgG() { // from class: X.0sfq
                        @Override // X.InterfaceC1636220sgG
                        public final boolean LIZ(Effect effect, Effect effect2) {
                            String strLIZIZ;
                            String strLIZIZ2;
                            String strLIZIZ3;
                            if (!C1635900sfk.LIZ() ? !C1625940sPg.LJIIL(this.LIZ.LLIZ, effect2) || C1624200sMs.LJIIIIZZ(effect2) : !C1625940sPg.LJIILJJIL(this.LIZ.LLIZ, effect2)) {
                                return false;
                            }
                            getClass();
                            String strLIZIZ4 = null;
                            if (effect == null || (strLIZIZ3 = C1629100sUm.LIZIZ(effect)) == null || strLIZIZ3.length() == 0) {
                                if (effect2 != null) {
                                    strLIZIZ = C1629100sUm.LIZIZ(effect2);
                                } else {
                                    strLIZIZ = null;
                                }
                                if (C703302op.LIZ(strLIZIZ)) {
                                    String strLIZJ = C1629100sUm.LIZJ(effect2);
                                    if (strLIZJ != null && effect != null) {
                                        C1629100sUm.LJII(effect, strLIZJ);
                                    }
                                    return true;
                                }
                            }
                            if (effect != null) {
                                strLIZIZ2 = C1629100sUm.LIZIZ(effect);
                            } else {
                                strLIZIZ2 = null;
                            }
                            if (effect2 != null) {
                                strLIZIZ4 = C1629100sUm.LIZIZ(effect2);
                            }
                            return Intrinsics.LJFF(strLIZIZ2, strLIZIZ4);
                        }
                    };
                }
            }

            @Override // X.AbstractC1636650sgx
            public final boolean LLLIIIIL(int i2) {
                Effect effectLLLII;
                if (super.LLLIIIIL(i2) || C1629100sUm.LJI(LLLII(i2)) || C1629100sUm.LJ(LLLII(i2)) || ((effectLLLII = LLLII(i2)) != null && Intrinsics.LJFF(effectLLLII.getName(), "related_title"))) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC1636650sgx
            public final C1636260sgK<Effect> LLLILZLLLI(ViewGroup viewGroup) {
                return new C1631750sZ3(12, viewGroup);
            }

            @Override // X.C1636320sgQ
            public final void LLLLIIIILLL(C1636690sh1 c1636690sh1) {
                c1636690sh1.LIZ(new AwS604S0100000_25(this, 856), AFwS266S0000000_25.get$arr$(555));
                c1636690sh1.LIZ(new AwS604S0100000_25(this, 857), AFwS266S0000000_25.get$arr$(556));
                c1636690sh1.LIZ(new AwS604S0100000_25(this, 838), AFwS266S0000000_25.get$arr$(552));
                super.LLLLIIIILLL(c1636690sh1);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final C0DXR MR() {
        C1636520sgk c1636520sgk;
        C1630880sXe c1630880sXePR = PR();
        return (c1630880sXePR == null || (c1636520sgk = c1630880sXePR.LJFF) == null || c1636520sgk.LIZ != 4) ? new C1636010sfv() : new C1636000sfu();
    }
}
