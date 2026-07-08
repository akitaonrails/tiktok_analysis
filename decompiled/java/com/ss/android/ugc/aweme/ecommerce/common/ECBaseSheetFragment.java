package com.ss.android.ugc.aweme.ecommerce.common;

import X.C01GW;
import X.C1391190mJ3;
import X.C1508090pLb;
import X.C16BC;
import X.C16G0;
import X.C1766560w4U;
import X.C1AF0;
import X.C343970De7;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1058150ddt;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public abstract class ECBaseSheetFragment extends ECBaseFragment implements InterfaceC1058150ddt, DialogInterface.OnDismissListener {
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 609));
    public int LLILZ = 4;
    public boolean LLILZIL = true;
    public boolean LLILZLL;

    public abstract void bS(C16G0 c16g0);

    public abstract void cS(TuxSheet tuxSheet, float f);

    public abstract void dS(int i, int i2, boolean z);

    public abstract void gS();

    public abstract void iS();

    public abstract boolean isHalfScreen();

    public boolean onBackPress() {
        return false;
    }

    public void VR() {
        TuxSheet tuxSheet;
        int i = this.LLILZ;
        if (i == 4 || i == 2) {
            return;
        }
        this.LLILZ = 4;
        if (getDialog() == null || aS() == null) {
            C1AF0.LIZJ("dialog is null when collapsedSheet");
        } else {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJIIIIZZ(this, false);
        }
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof TuxSheet) || (tuxSheet = (TuxSheet) parentFragment) == null) {
            return;
        }
        tuxSheet.ZR();
    }

    public final C16BC<?> WR() {
        return (C16BC) this.LLILLL.getValue();
    }

    public void ZU() {
        int i = this.LLILZ;
        if (i == 3 || i == 2) {
            return;
        }
        this.LLILZ = 3;
        if (getDialog() == null) {
            C1AF0.LIZJ("dialog is null when expandSheet");
        } else {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJIIIIZZ(this, true);
        }
    }

    public final void dismiss() {
        DialogFragment dialogFragment;
        Dialog dialog;
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            C1766560w4U.LIZ(requireActivity(), dialog2);
        }
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof DialogFragment) || (dialogFragment = (DialogFragment) parentFragment) == null || (dialog = dialogFragment.getDialog()) == null) {
            return;
        }
        dialog.setOnKeyListener(null);
    }

    public final C16G0 ZR() {
        View view;
        View view2 = getView();
        if (view2 != null) {
            do {
                Object parent = view2.getParent();
                if (!(parent instanceof C16G0)) {
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view2 = (View) parent;
                } else {
                    view = (View) parent;
                    break;
                }
            } while (view2 != null);
            view = null;
        } else {
            view = null;
        }
        if (view instanceof C16G0) {
            return (C16G0) view;
        }
        return null;
    }

    public final TuxSheet aS() {
        TuxSheet tuxSheet = (TuxSheet) getParentFragment();
        if (tuxSheet == null || !tuxSheet.isAdded()) {
            return null;
        }
        return tuxSheet;
    }

    public final Dialog getDialog() {
        DialogFragment dialogFragment;
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof DialogFragment) || (dialogFragment = (DialogFragment) parentFragment) == null) {
            return null;
        }
        return dialogFragment.getDialog();
    }

    public final boolean kS() {
        return OR() && C1508090pLb.LIZIZ();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.LLILZLL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r6 = this;
            boolean r0 = X.C616540OGe.LIZ()
            if (r0 == 0) goto L27
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IMainService> r0 = com.ss.android.ugc.aweme.services.IMainService.class
            java.lang.Object r1 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.IMainService r1 = (com.ss.android.ugc.aweme.services.IMainService) r1
            X.19EG r0 = r6.getActivity()
            boolean r0 = r1.isMainPage(r0)
            if (r0 != 0) goto L27
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            X.C2187451AjH.LJJIJIIJI(r0)
        L27:
            super.onResume()
            r4 = 0
            android.app.Dialog r0 = r6.getDialog()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L55
            android.view.Window r1 = r0.getWindow()     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto L55
            boolean r0 = r6.LLILZLL     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L45
            boolean r0 = r6.kS()     // Catch: java.lang.Throwable -> Lbc
            if (r0 != 0) goto L4f
            r0 = 2131887455(0x7f12055f, float:1.9409518E38)
            goto L52
        L45:
            boolean r0 = r6.kS()     // Catch: java.lang.Throwable -> Lbc
            if (r0 != 0) goto L4f
            r0 = 2131887449(0x7f120559, float:1.9409505E38)
            goto L52
        L4f:
            r0 = 2131887456(0x7f120560, float:1.940952E38)
        L52:
            r1.setWindowAnimations(r0)     // Catch: java.lang.Throwable -> Lbc
        L55:
            android.view.View r3 = r6.getView()     // Catch: java.lang.Throwable -> Lbc
            if (r3 == 0) goto L67
            Y.ARunnableS126S0100000_26 r2 = new Y.ARunnableS126S0100000_26     // Catch: java.lang.Throwable -> Lbc
            r0 = 40
            r2.<init>(r6, r0)     // Catch: java.lang.Throwable -> Lbc
            r0 = 100
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r3, r2, r0)     // Catch: java.lang.Throwable -> Lbc
        L67:
            r6.LLILZLL = r4
            boolean r5 = r6.isHalfScreen()
            r1 = 0
            if (r5 == 0) goto Lb7
            androidx.fragment.app.Fragment r0 = r6.getParentFragment()
            if (r0 == 0) goto Lb5
            com.bytedance.tux.system.TuxImmersionBar r3 = X.C1766560w4U.LIZLLL(r0)
        L7a:
            r2 = 1
            if (r5 == 0) goto La6
            int r1 = r6.LLILZ
            r0 = 4
            if (r1 == r0) goto Lb3
        L82:
            r1 = 1
        L83:
            if (r3 == 0) goto La5
            com.bytedance.immersionbar.ImmersionBar r0 = r3.LIZIZ
            r0.LJIIJ(r1)
            com.bytedance.immersionbar.ImmersionBar r0 = r3.LIZIZ
            r0.LJIIL()
            r0 = 2131099676(0x7f06001c, float:1.7811712E38)
            r3.LJ(r0)
            com.bytedance.immersionbar.ImmersionBar r0 = r3.LIZIZ
            r0.LJII(r2)
            int r1 = r6.LLILZ
            r0 = 3
            if (r1 != r0) goto La2
            r3.LIZ(r4)
        La2:
            r3.LIZLLL()
        La5:
            return
        La6:
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto Lb3
            boolean r0 = X.C1744700vVE.LJ(r0, r1)
            if (r0 != 0) goto Lb3
            goto L82
        Lb3:
            r1 = 0
            goto L83
        Lb5:
            r3 = r1
            goto L7a
        Lb7:
            com.bytedance.tux.system.TuxImmersionBar r3 = X.C1766560w4U.LIZLLL(r6)
            goto L7a
        Lbc:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lbc
            r6.LLILZLL = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment.onResume():void");
    }

    public static final void hS(TuxSheet tuxSheet, boolean z) {
        if (tuxSheet.getDialog() != null) {
            TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(tuxSheet, false);
            tuxImmersionBarLIZJ.LIZIZ.LJIIJ(z);
            tuxImmersionBarLIZJ.LIZIZ.LJIIL();
            tuxImmersionBarLIZJ.LJFF(-16777216);
            tuxImmersionBarLIZJ.LIZIZ.LJII(true);
            tuxImmersionBarLIZJ.LIZ(false);
            tuxImmersionBarLIZJ.LIZLLL();
        }
    }

    public void LLLFFI(TuxSheet tuxSheet, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        cS(tuxSheet, f);
    }

    public void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        boolean z = false;
        if (i != 3) {
            if (i == 4 || i == 5) {
                hS(tuxSheet, false);
            }
        } else {
            hS(tuxSheet, true);
        }
        if (!(this instanceof SeaPdpFragment)) {
            if (i == 3 || i == 4 || i == 5) {
                dS(this.LLILZ, i, this.LLILZIL);
            }
            if (this.LLILZIL && i == 5) {
                gS();
                tuxSheet.dismiss();
            } else {
                if (i != 5) {
                    if (i == 3 || i == 4 || i == 5) {
                    }
                }
                this.LLILZ = i;
            }
            this.LLILZIL = true;
            this.LLILZ = i;
        } else {
            int i2 = this.LLILZ;
            if (i == 3 || i == 4 || i == 5) {
                this.LLILZ = i;
                dS(i2, i, this.LLILZIL);
            }
            if (this.LLILZIL && i == 5) {
                gS();
                tuxSheet.dismiss();
            } else if (i == 5) {
            }
            this.LLILZIL = true;
        }
        C16G0 c16g0ZR = ZR();
        if (c16g0ZR != null) {
            if (i != 2) {
                z = true;
            }
            c16g0ZR.setEnabled(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        DialogFragment dialogFragment;
        Dialog dialog;
        super.onViewCreated(view, bundle);
        if (isHalfScreen()) {
            C16G0 c16g0ZR = ZR();
            bS(c16g0ZR);
            if (c16g0ZR != null) {
                C786410Ut5.I7(new AjS70S0100000_26(this, 0), c16g0ZR.findViewById(R.id.yg_));
            }
            Fragment parentFragment = getParentFragment();
            if ((parentFragment instanceof DialogFragment) && (dialogFragment = (DialogFragment) parentFragment) != null && (dialog = dialogFragment.getDialog()) != null) {
                dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0vo8
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                        if (i == 4 && keyEvent.getAction() == 1) {
                            return this.LL.onBackPress();
                        }
                        return false;
                    }
                });
            }
        }
    }
}
