package com.ss.android.ugc.aweme.tako.share.panel;

import X.C1355090lMp;
import X.C1371600lnS;
import X.C1388300mEO;
import X.InterfaceC1058150ddt;
import X.InterfaceC1366490lfD;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol;
import com.ss.android.ugc.aweme.tako.share.panel.TakoImageSharePackage;
import com.ss.android.ugc.aweme.tako.share.panel.TakoImageSharePanelLogicProtocol;
import kotlin.Unit;
import kotlin.jvm.internal.AwS485S0200000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class TakoImageSharePanelLogicProtocol extends TTSharePanelLogicProtocol {
    public static final /* synthetic */ int LLILLJJLI = 0;

    @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
    public final View As0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
    public final InterfaceC1366490lfD T72() {
        final TakoImageSharePackage takoImageSharePackage;
        BaseSharePackage baseSharePackage = this.LL;
        return (!(baseSharePackage instanceof TakoImageSharePackage) || (takoImageSharePackage = (TakoImageSharePackage) baseSharePackage) == null) ? new C1355090lMp() { // from class: X.0mEP
        } : new C1355090lMp() { // from class: X.0mEU
            @Override // X.C1355090lMp, X.InterfaceC1366490lfD
            public final void LJI(Context context, BaseSharePackage baseSharePackage2) {
                C1388380mEW c1388380mEWLIZ = C1388420mEa.LIZ(takoImageSharePackage);
                if (c1388380mEWLIZ != null) {
                    c1388380mEWLIZ.LIZ();
                }
                C1388420mEa.LIZ.remove(takoImageSharePackage);
            }
        };
    }

    public TakoImageSharePanelLogicProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, X.InterfaceC1372360log
    public final void tu(C1371600lnS c1371600lnS) {
        final TakoImageSharePackage takoImageSharePackage;
        super.tu(c1371600lnS);
        BaseSharePackage baseSharePackage = this.LL;
        if ((baseSharePackage instanceof TakoImageSharePackage) && (takoImageSharePackage = (TakoImageSharePackage) baseSharePackage) != null) {
            c1371600lnS.LJJJJJL = false;
            c1371600lnS.LJJJJ = false;
            C1388300mEO c1388300mEO = new C1388300mEO();
            c1388300mEO.LIZ = new AwS600S0100000_21(takoImageSharePackage, 173);
            c1371600lnS.LJJZZI = c1388300mEO;
            c1371600lnS.LJJJJLL = true;
            c1371600lnS.LJJJJZ = new AwS485S0200000_21(c1371600lnS, takoImageSharePackage, 3);
            c1371600lnS.LJJZZIII = new InterfaceC1058150ddt() { // from class: X.0mEV
                @Override // X.InterfaceC1058150ddt
                public final boolean onBackPress() {
                    return false;
                }

                @Override // X.InterfaceC1058150ddt
                public final void LLLFFI(TuxSheet tuxSheet, float f) {
                    View view;
                    C1388380mEW c1388380mEWLIZ = C1388420mEa.LIZ(takoImageSharePackage);
                    if (c1388380mEWLIZ != null) {
                        c1388380mEWLIZ.LIZIZ = tuxSheet;
                    }
                    TakoImageSharePanelLogicProtocol takoImageSharePanelLogicProtocol = this;
                    TakoImageSharePackage takoImageSharePackage2 = takoImageSharePackage;
                    takoImageSharePanelLogicProtocol.getClass();
                    C1388380mEW c1388380mEWLIZ2 = C1388420mEa.LIZ(takoImageSharePackage2);
                    if (c1388380mEWLIZ2 != null && (view = c1388380mEWLIZ2.LIZJ) != null && view.getVisibility() != 8) {
                        C786410Ut5.LJLLLLLL(8, view);
                    }
                }

                @Override // X.InterfaceC1058150ddt
                public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
                    View view;
                    Unit unit;
                    C1388380mEW c1388380mEWLIZ = C1388420mEa.LIZ(takoImageSharePackage);
                    if (c1388380mEWLIZ != null) {
                        c1388380mEWLIZ.LIZIZ = tuxSheet;
                    }
                    this.getClass();
                    try {
                        tuxSheet.setCancelable(true);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    try {
                        Dialog dialog = tuxSheet.getDialog();
                        if (dialog != null) {
                            dialog.setCanceledOnTouchOutside(false);
                            unit = Unit.LIZ;
                        } else {
                            unit = null;
                        }
                        C189200o6.m2constructorimpl(unit);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                    try {
                        Fragment fragment = (Fragment) C13LP.LJJJLL(tuxSheet.getChildFragmentManager().LJJLIIIJL());
                        if (fragment != null) {
                            String str = TuxSheet._pnsPageId;
                            C1391190mJ3.LJIIZILJ(fragment, false);
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        C189200o6.m2constructorimpl(new C098200Yq(th3));
                    }
                    TakoImageSharePanelLogicProtocol takoImageSharePanelLogicProtocol = this;
                    TakoImageSharePackage takoImageSharePackage2 = takoImageSharePackage;
                    takoImageSharePanelLogicProtocol.getClass();
                    C1388380mEW c1388380mEWLIZ2 = C1388420mEa.LIZ(takoImageSharePackage2);
                    if (c1388380mEWLIZ2 != null && (view = c1388380mEWLIZ2.LIZJ) != null && view.getVisibility() != 8) {
                        C786410Ut5.LJLLLLLL(8, view);
                    }
                    if (i == 5) {
                        C1388380mEW c1388380mEWLIZ3 = C1388420mEa.LIZ(takoImageSharePackage);
                        if (c1388380mEWLIZ3 != null) {
                            c1388380mEWLIZ3.LIZ();
                        }
                        C1388420mEa.LIZ.remove(takoImageSharePackage);
                    }
                }
            };
        }
    }
}
