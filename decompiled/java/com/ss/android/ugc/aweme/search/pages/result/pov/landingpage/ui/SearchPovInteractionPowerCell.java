package com.ss.android.ugc.aweme.search.pages.result.pov.landingpage.ui;

import X.C01GW;
import X.C079T;
import X.C1308910kAL;
import X.C1383370m6R;
import X.C1558520qew;
import X.C1A5Q;
import X.C2097608Jq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427690Gpr;
import X.C452501pT;
import X.C684910Qtl;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.pages.result.pov.mob.ITop1MobAbility;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPovInteractionPowerCell extends PowerCell<C684910Qtl> {
    public C684910Qtl LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 633));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 636));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 632));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 635));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 637));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 631));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 630));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 634));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 638));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ez9;
    }

    public final Drawable I5() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a1e, this.itemView.getContext());
        Float fValueOf = Float.valueOf(8.0f);
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(fValueOf));
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(fValueOf));
        c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(fValueOf));
        c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(fValueOf));
        return c384050F3z.LIZ(this.itemView.getContext());
    }

    public final TuxIconView L5() {
        return (TuxIconView) this.LLIZ.getValue();
    }

    public final InterfaceC665370Q7z LLIIJLIL() {
        return (InterfaceC665370Q7z) this.LLJI.getValue();
    }

    public final TuxIconView N5() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    public final C1A5Q P5() {
        return (C1A5Q) this.LLILLJJLI.getValue();
    }

    public final TuxIconView R5() {
        return (TuxIconView) this.LLILLL.getValue();
    }

    public final TuxIconView S5() {
        return (TuxIconView) this.LLILZLL.getValue();
    }

    public final Map<String, String> LLLFZ() {
        ITop1MobAbility iTop1MobAbility;
        Map<String, String> mapLLLFZ;
        InterfaceC665370Q7z interfaceC665370Q7zLLIIJLIL = LLIIJLIL();
        return (interfaceC665370Q7zLLIIJLIL == null || (iTop1MobAbility = (ITop1MobAbility) C1558520qew.LIZ(interfaceC665370Q7zLLIIJLIL, ITop1MobAbility.class, null)) == null || (mapLLLFZ = iTop1MobAbility.LLLFZ()) == null) ? C2097608Jq.LJ() : mapLLLFZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f1  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemViewCreated() {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.pov.landingpage.ui.SearchPovInteractionPowerCell.onItemViewCreated():void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C684910Qtl c684910Qtl = (C684910Qtl) interfaceC1891350zJl;
        super.onBindItemView(c684910Qtl);
        this.LL = c684910Qtl;
        C1A5Q c1a5qP5 = P5();
        if (c1a5qP5 != null) {
            c1a5qP5.setUniqueKeyForCache(c684910Qtl.LLILLJJLI.uniqueId);
            c1a5qP5.LIZIZ();
        }
        if (c684910Qtl.LLILZ) {
            TuxIconView tuxIconViewR5 = R5();
            if (tuxIconViewR5 != null) {
                tuxIconViewR5.setBackground(null);
            }
            TuxIconView tuxIconViewN5 = N5();
            if (tuxIconViewN5 != null) {
                tuxIconViewN5.setBackground(null);
            }
            S5().setBackground(null);
            L5().setBackground(null);
            TuxIconView tuxIconViewR52 = R5();
            if (tuxIconViewR52 != null) {
                C427690Gpr.LJI(tuxIconViewR52, null);
            }
            TuxIconView tuxIconViewN52 = N5();
            if (tuxIconViewN52 != null) {
                C427690Gpr.LJI(tuxIconViewN52, null);
            }
            C427690Gpr.LJI(S5(), null);
            C427690Gpr.LJI(L5(), null);
            TuxIconView tuxIconViewR53 = R5();
            if (tuxIconViewR53 != null) {
                tuxIconViewR53.setForeground(null);
            }
            TuxIconView tuxIconViewN53 = N5();
            if (tuxIconViewN53 != null) {
                tuxIconViewN53.setForeground(null);
            }
            S5().setForeground(null);
            L5().setForeground(null);
        } else {
            TuxIconView tuxIconViewR54 = R5();
            if (tuxIconViewR54 != null) {
                tuxIconViewR54.setBackground(I5());
            }
            TuxIconView tuxIconViewN54 = N5();
            if (tuxIconViewN54 != null) {
                tuxIconViewN54.setBackground(I5());
            }
            S5().setBackground(I5());
            L5().setBackground(I5());
            TuxIconView tuxIconViewR55 = R5();
            if (tuxIconViewR55 != null) {
                C427690Gpr.LJ(tuxIconViewR55, 0.0f);
            }
            TuxIconView tuxIconViewN55 = N5();
            if (tuxIconViewN55 != null) {
                C427690Gpr.LJ(tuxIconViewN55, 0.0f);
            }
            C427690Gpr.LJ(S5(), 0.0f);
            C427690Gpr.LJ(L5(), 0.0f);
        }
        int i = 0;
        if (c684910Qtl.LLILLL) {
            P5().setPadding(0, 0, 0, 0);
            ((View) this.LLILZIL.getValue()).setPadding(0, 0, 0, 0);
            if (C079T.LIZ()) {
                TuxIconView tuxIconViewR56 = R5();
                if (tuxIconViewR56 != null) {
                    C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(32.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(40.0f))), tuxIconViewR56);
                }
                TuxIconView tuxIconViewR57 = R5();
                if (tuxIconViewR57 != null) {
                    tuxIconViewR57.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                }
                TuxIconView tuxIconViewN56 = N5();
                if (tuxIconViewN56 != null) {
                    C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(32.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(40.0f))), tuxIconViewN56);
                }
                TuxIconView tuxIconViewN57 = N5();
                if (tuxIconViewN57 != null) {
                    tuxIconViewN57.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                }
                C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(32.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(40.0f))), S5());
                S5().setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(32.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(40.0f))), L5());
                L5().setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            } else {
                TuxIconView tuxIconViewR58 = R5();
                if (tuxIconViewR58 != null) {
                    C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))), tuxIconViewR58);
                }
                TuxIconView tuxIconViewR59 = R5();
                if (tuxIconViewR59 != null) {
                    C426750GoL.LJIIIZ(tuxIconViewR59, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), false, 16);
                }
                TuxIconView tuxIconViewR510 = R5();
                if (tuxIconViewR510 != null) {
                    tuxIconViewR510.setPadding(0, 0, 0, 0);
                }
                TuxIconView tuxIconViewN58 = N5();
                if (tuxIconViewN58 != null) {
                    C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))), tuxIconViewN58);
                }
                TuxIconView tuxIconViewN59 = N5();
                if (tuxIconViewN59 != null) {
                    C426750GoL.LJIIIZ(tuxIconViewN59, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), false, 16);
                }
                TuxIconView tuxIconViewN510 = N5();
                if (tuxIconViewN510 != null) {
                    tuxIconViewN510.setPadding(0, 0, 0, 0);
                }
                C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))), S5());
                C426750GoL.LJIIIZ(S5(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), false, 16);
                S5().setPadding(0, 0, 0, 0);
                C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))), L5());
                C426750GoL.LJIIIZ(L5(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), false, 16);
                L5().setPadding(0, 0, 0, 0);
            }
        } else {
            P5().setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f))), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f))), 0);
            ((View) this.LLILZIL.getValue()).setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f))), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f))), 0);
            TuxIconView tuxIconViewR511 = R5();
            if (tuxIconViewR511 != null) {
                C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(36.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(36.0f))), tuxIconViewR511);
            }
            TuxIconView tuxIconViewR512 = R5();
            if (tuxIconViewR512 != null) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f)));
                tuxIconViewR512.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
            }
            TuxIconView tuxIconViewN511 = N5();
            if (tuxIconViewN511 != null) {
                C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(36.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(36.0f))), tuxIconViewN511);
            }
            TuxIconView tuxIconViewN512 = N5();
            if (tuxIconViewN512 != null) {
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f)));
                tuxIconViewN512.setPadding(iLIZIZ2, iLIZIZ2, iLIZIZ2, iLIZIZ2);
            }
            C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(36.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(36.0f))), S5());
            TuxIconView tuxIconViewS5 = S5();
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f)));
            tuxIconViewS5.setPadding(iLIZIZ3, iLIZIZ3, iLIZIZ3, iLIZIZ3);
            C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(36.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(36.0f))), L5());
            TuxIconView tuxIconViewL5 = L5();
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f)));
            tuxIconViewL5.setPadding(iLIZIZ4, iLIZIZ4, iLIZIZ4, iLIZIZ4);
        }
        View view = (View) this.LLIZLLLIL.getValue();
        if (!c684910Qtl.LLILZIL) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        C1A5Q c1a5qP5 = P5();
        if (c1a5qP5 != null) {
            c1a5qP5.LIZIZ();
        }
    }
}
