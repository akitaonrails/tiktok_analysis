package com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet;

import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1390920mIc;
import X.C1391190mJ3;
import X.C1435105jZ;
import X.C16BC;
import X.C1708710uZB;
import X.C1708720uZC;
import X.C1766560w4U;
import X.C1906580ziK;
import X.C19EG;
import X.C2084208Em;
import X.C2188811AlT;
import X.C299110Bnx;
import X.C343970De7;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C960203pA;
import X.DialogInterfaceOnCancelListenerC1775850wJT;
import X.InterfaceC1058150ddt;
import X.InterfaceC1712420ufA;
import X.InterfaceC344240DeY;
import Y.ARunnableS126S0100000_26;
import Y.ARunnableS95S0200000_26;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.CashierBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes27.dex */
public class PipoCashierBaseFragment extends BaseFragment implements InterfaceC344240DeY, InterfaceC1058150ddt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9KyQ/ISY2OmsvJiI+JytiPCHELIOSYwJyg8JiE2JjFiKyAnPCohOic2LTFiGSYjJwYtOic6LTcOKDw2DjctLiI2JjE=";
    public boolean LLIZ;
    public TuxSheet LLIZLLLIL;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int LLJJ;
    public InterfaceC1712420ufA LLJJI;
    public Integer LLJJIII;
    public boolean LLJJIJI;
    public long LLJJIJIIJIL;
    public String LLJJIJIL;
    public final float LLJ = 0.6f;
    public final boolean LLJILJIL = C299110Bnx.LIZ();
    public final CashierBottomSheetBehavior<FrameLayout> LLJILJILJ = new CashierBottomSheetBehavior<>();
    public final TuxCashierSheetBehavior<FrameLayout> LLJILLL = new TuxCashierSheetBehavior<>();

    public C1250250idj aS() {
        return null;
    }

    public void cS() {
    }

    public void dS(long j, String str) {
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1103));
        c0om1.LIZIZ(c1251150ifB);
        C1250250idj c1250250idjAS = aS();
        if (c1250250idjAS != null) {
            c0om1.LIZJ = c1250250idjAS;
        }
        if (this.LLIZ) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB2.LIZLLL = true;
            c1251150ifB2.LIZJ(new AwS570S0100000_26(this, 1102));
            c0om1.LJ(c1251150ifB2);
        }
        return c0om1;
    }

    public final boolean bS() {
        BottomSheetBehavior bottomSheetBehavior;
        TuxSheetBehavior tuxSheetBehavior;
        String str = TuxSheet._pnsPageId;
        C16BC c16bcLJIIIZ = C1391190mJ3.LJIIIZ(this);
        return C299110Bnx.LIZ() ? (c16bcLJIIIZ instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bcLJIIIZ) != null && tuxSheetBehavior.LJIJJ == 3 : (c16bcLJIIIZ instanceof BottomSheetBehavior) && (bottomSheetBehavior = (BottomSheetBehavior) c16bcLJIIIZ) != null && bottomSheetBehavior.getState() == 3;
    }

    public final void iS() {
        InterfaceC1712420ufA interfaceC1712420ufA = this.LLJJI;
        if (interfaceC1712420ufA != null) {
            interfaceC1712420ufA.LIZ();
        }
        this.LLJJIJIL = "return";
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIILJJIL(this);
    }

    public final void kS() {
        if (this.LLJI) {
            this.LLJI = false;
            if (this.LLJILJIL) {
                this.LLJILLL.setState(3);
                TuxCashierSheetBehavior<FrameLayout> tuxCashierSheetBehavior = this.LLJILLL;
                tuxCashierSheetBehavior.LJJIJLIJ = false;
                tuxCashierSheetBehavior.setPeekHeight(this.LLJJ, false);
                return;
            }
            this.LLJILJILJ.setState(3);
            CashierBottomSheetBehavior<FrameLayout> cashierBottomSheetBehavior = this.LLJILJILJ;
            cashierBottomSheetBehavior.LIZ = false;
            cashierBottomSheetBehavior.setPeekHeight(this.LLJJ, false);
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        FragmentManager childFragmentManager;
        if (this.LLJJIJI) {
            return true;
        }
        TuxSheet tuxSheet = this.LLIZLLLIL;
        if (tuxSheet == null || (childFragmentManager = tuxSheet.getChildFragmentManager()) == null || childFragmentManager.LJJLIIIIJ() <= 0) {
            return false;
        }
        kS();
        return false;
    }

    public final void VR() {
        Context context = getContext();
        if (context != null) {
            if (this.LLJILJIL) {
                this.LLJILLL.setPeekHeight(C497820Jfg.LIZ(context) + C2084208Em.LIZ(context), false);
                this.LLJILLL.LJJIJLIJ = true;
            } else {
                this.LLJILJILJ.setPeekHeight(C497820Jfg.LIZ(context) + C2084208Em.LIZ(context), false);
                this.LLJILJILJ.LIZ = true;
            }
        }
        this.LLJIJIL = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            KeyboardUtils.LIZIZ(getView());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hide keyboard error: ");
            sbLIZ.append(th.getMessage());
            c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (C1906580ziK.LJI()) {
            this.LLJJIJIL = "close";
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIJIIJIL;
        String str = this.LLJJIJIL;
        if (str == null) {
            str = "return";
        }
        dS(jCurrentTimeMillis, str);
        this.LLJJIJIL = null;
    }

    public final void SR(float f) {
        int i;
        int expandedOffset;
        View view;
        TuxSheet tuxSheet;
        View view2;
        View viewFindViewById;
        View view3;
        View viewFindViewById2;
        View view4;
        View viewFindViewById3;
        View viewFindViewById4 = null;
        if (this.LLJI) {
            if (this.LLIZLLLIL != null && f >= 0.0f) {
                Integer num = this.LLJJIII;
                if (num != null && num.intValue() == 3) {
                    int iLIZ = C2084208Em.LIZ(getActivity());
                    TuxSheet tuxSheet2 = this.LLIZLLLIL;
                    if (tuxSheet2 != null && (view4 = tuxSheet2.getView()) != null && (viewFindViewById3 = view4.findViewById(R.id.v4n)) != null) {
                        viewFindViewById3.setPadding(viewFindViewById3.getPaddingLeft(), (int) (iLIZ * f), viewFindViewById3.getPaddingRight(), viewFindViewById3.getPaddingBottom());
                    }
                }
                TuxSheet tuxSheet3 = this.LLIZLLLIL;
                if (tuxSheet3 != null && (view3 = tuxSheet3.getView()) != null && (viewFindViewById2 = view3.findViewById(R.id.v4a)) != null) {
                    viewFindViewById2.setPadding(viewFindViewById2.getPaddingLeft(), viewFindViewById2.getPaddingTop(), viewFindViewById2.getPaddingRight(), 0);
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLIZLLLIL == null || f < 0.0f) {
            return;
        }
        int iLIZ2 = C2084208Em.LIZ(getActivity());
        Integer num2 = this.LLJJIII;
        if (num2 != null && num2.intValue() == 3 && (tuxSheet = this.LLIZLLLIL) != null && (view2 = tuxSheet.getView()) != null && (viewFindViewById = view2.findViewById(R.id.v4n)) != null) {
            viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), (int) (iLIZ2 * f), viewFindViewById.getPaddingRight(), viewFindViewById.getPaddingBottom());
        }
        TuxSheet tuxSheet4 = this.LLIZLLLIL;
        if (tuxSheet4 != null && (view = tuxSheet4.getView()) != null) {
            viewFindViewById4 = view.findViewById(R.id.v4a);
        }
        if (this.LLJILJIL) {
            TuxCashierSheetBehavior<FrameLayout> tuxCashierSheetBehavior = this.LLJILLL;
            i = tuxCashierSheetBehavior.LJIILLIIL;
            expandedOffset = tuxCashierSheetBehavior.getExpandedOffset();
        } else {
            CashierBottomSheetBehavior<FrameLayout> cashierBottomSheetBehavior = this.LLJILJILJ;
            i = cashierBottomSheetBehavior.collapsedOffset;
            expandedOffset = cashierBottomSheetBehavior.getExpandedOffset();
        }
        int i2 = (int) ((i - expandedOffset) * (1 - f));
        if (viewFindViewById4 == null) {
            return;
        }
        viewFindViewById4.setPadding(viewFindViewById4.getPaddingLeft(), viewFindViewById4.getPaddingTop(), viewFindViewById4.getPaddingRight(), i2);
    }

    public final void UR(boolean z) {
        Dialog dialog;
        this.LLJJIJI = z;
        if (this.LLJILJIL) {
            TuxCashierSheetBehavior<FrameLayout> tuxCashierSheetBehavior = this.LLJILLL;
            if (tuxCashierSheetBehavior != null) {
                tuxCashierSheetBehavior.LJJIL = z;
            }
        } else {
            CashierBottomSheetBehavior<FrameLayout> cashierBottomSheetBehavior = this.LLJILJILJ;
            if (cashierBottomSheetBehavior != null) {
                cashierBottomSheetBehavior.LIZIZ = z;
            }
        }
        TuxSheet tuxSheet = this.LLIZLLLIL;
        if (tuxSheet != null && (dialog = tuxSheet.getDialog()) != null) {
            dialog.setCanceledOnTouchOutside(!z);
        }
    }

    public void WR(String str) {
        this.LLJJIJIL = str;
        String str2 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    public final void gS(C19EG c19eg) {
        this.LLJI = false;
        if (this.LLIZLLLIL == null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = this;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJLL = true;
            c1390920mIc.LJIIIIZZ(3);
            c1390920mIc.LJFF(this.LLJ);
            if (this.LLJILJIL) {
                c1390920mIc.LIZ.LLLIIIIL = this.LLJILLL;
            } else {
                c1390920mIc.LIZ.LLLIIII = this.LLJILJILJ;
            }
            this.LLIZLLLIL = c1390920mIc.LIZ;
        }
        this.LLJJIII = 3;
        TuxSheet tuxSheet2 = this.LLIZLLLIL;
        if (tuxSheet2 != null) {
            tuxSheet2.show(c19eg.getSupportFragmentManager(), String.valueOf(hashCode()));
        }
        C786410Ut5.LJLIIL(300L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(this, 55));
    }

    public final void mS(boolean z) {
        Integer numLIZJ;
        C19EG activity;
        boolean z2 = false;
        if (z && ((activity = getActivity()) == null || !C960203pA.LIZIZ(activity))) {
            z2 = true;
        }
        TuxSheet tuxSheet = this.LLIZLLLIL;
        if (tuxSheet != null) {
            if (z) {
                Context context = tuxSheet.getContext();
                if (context != null) {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
                } else {
                    return;
                }
            } else {
                Context context2 = tuxSheet.getContext();
                if (context2 == null) {
                    return;
                } else {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context2);
                }
            }
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(tuxSheet, true);
                tuxImmersionBarLIZJ.LJIIIZ(iIntValue);
                tuxImmersionBarLIZJ.LIZIZ.LJIIJ(z2);
                tuxImmersionBarLIZJ.LIZLLL();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS268S0000000_26.get$arr$(439));
        EventBus.LIZLLL().LJIILL(new C1435105jZ(null));
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        if (this.LLJI) {
            return;
        }
        SR(f);
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        if (this.LLJI) {
            if (!this.LLJIJIL && i == 3) {
                mS(true);
                VR();
            } else if (i != 3) {
                if (i != 4) {
                    return;
                }
                if (this.LLJILJIL) {
                    this.LLJILLL.setState(3);
                    return;
                } else {
                    this.LLJILJILJ.setState(3);
                    return;
                }
            }
            SR(1.0f);
            mS(true);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            SR(0.0f);
            mS(false);
            return;
        }
        SR(1.0f);
        mS(true);
    }

    public final void hS(C19EG c19eg, float f) {
        this.LLJI = false;
        if (this.LLIZLLLIL == null) {
            int i = c19eg.getResources().getDisplayMetrics().heightPixels;
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = this;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJLL = true;
            c1390920mIc.LJIIIIZZ(2);
            float f2 = i;
            c1390920mIc.LIZIZ((int) (f * f2), (int) (f2 * 0.95f));
            DialogInterfaceOnCancelListenerC1775850wJT dialogInterfaceOnCancelListenerC1775850wJT = new DialogInterfaceOnCancelListenerC1775850wJT(this, 5);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LL = dialogInterfaceOnCancelListenerC1775850wJT;
            if (this.LLJILJIL) {
                tuxSheet2.LLLIIIIL = this.LLJILLL;
            } else {
                tuxSheet2.LLLIIII = this.LLJILJILJ;
            }
            this.LLIZLLLIL = tuxSheet2;
        }
        this.LLJJIII = 2;
        TuxSheet tuxSheet3 = this.LLIZLLLIL;
        if (tuxSheet3 != null) {
            tuxSheet3.show(c19eg.getSupportFragmentManager(), String.valueOf(hashCode()));
        }
        C786410Ut5.LJLIIL(300L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(this, 120));
    }

    public final void nS(PipoCashierBaseFragment pipoCashierBaseFragment, boolean z) {
        if (z) {
            this.LLJI = true;
            this.LLJIJIL = false;
            C786410Ut5.LJLIIL(100L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS95S0200000_26(this, pipoCashierBaseFragment, 20));
        }
        pipoCashierBaseFragment.LLIZ = true;
        this.LLJJIJIL = "next";
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIJI(this, pipoCashierBaseFragment, false, null, 12);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJIJIIJIL = System.currentTimeMillis();
        cS();
    }
}
