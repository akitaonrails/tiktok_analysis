package com.bytedance.android.livesdk.hangout;

import X.C098200Yq;
import X.C09AY;
import X.C0JSW;
import X.C0KZA;
import X.C1322000kVS;
import X.C1324720kZq;
import X.C1685300txQ;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C439850HMp;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.CountDownTimerC521500Kcm;
import X.DialogInterfaceOnCancelListenerC521720Kd8;
import X.DialogInterfaceOnDismissListenerC521770KdD;
import X.InterfaceC481680Iuk;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class HangoutRandomMatchPanelFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ICQiLiHELIOSAmPGsEKCE0JzA4Gy49LCohBC4nKy0cKCE2JAM+KCg+LSs4";
    public String LL = "";
    public int LLILLJJLI = 30;
    public boolean LLILLL = true;
    public boolean LLILZ = true;
    public AwS621S0100000_7 LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public C0KZA LLIZLLLIL;
    public C1324720kZq LLJ;
    public C1324720kZq LLJI;
    public C1324720kZq LLJIJIL;
    public C16FS LLJILJIL;
    public C16FS LLJILJILJ;
    public TextView LLJILLL;
    public TextView LLJJ;
    public TextView LLJJI;
    public InterfaceC481680Iuk LLJJIII;
    public String LLJJIJI;
    public long LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public TuxPanel LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public C09AY LLJJL;
    public CountDownTimerC521500Kcm LLJJLIIIJLLLLLLLZ;

    static {
        new C0JSW();
    }

    public final void dismiss() {
        CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LLJJLIIIJLLLLLLLZ;
        if (countDownTimerC521500Kcm != null) {
            countDownTimerC521500Kcm.cancel();
        }
        TuxPanel tuxPanel = this.LLJJJIL;
        if (tuxPanel != null) {
            tuxPanel.dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LLJJLIIIJLLLLLLLZ;
        if (countDownTimerC521500Kcm != null) {
            countDownTimerC521500Kcm.cancel();
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        C0KZA c0kza = this.LLIZLLLIL;
        if (c0kza != null) {
            c0kza.LIZLLL();
        }
        ?? r0 = this.LLJJL;
        if (r0 != 0) {
            r0.invoke();
        }
    }

    public final void NR(FragmentManager fragmentManager) {
        this.LLJJJJ = false;
        C439850HMp c439850HMp = new C439850HMp();
        TuxPanel tuxPanel = c439850HMp.LIZ;
        tuxPanel.LLILLJJLI = this;
        tuxPanel.LLJ = this.LLILZ;
        tuxPanel.LLIZLLLIL = true;
        tuxPanel.LLJI = this.LLILLL;
        tuxPanel.LLJILJIL = true;
        Integer numValueOf = Integer.valueOf(R.style.y0);
        TuxPanel tuxPanel2 = c439850HMp.LIZ;
        tuxPanel2.LL = numValueOf;
        tuxPanel2.LLILZLL = new DialogInterfaceOnCancelListenerC521720Kd8(this, 1);
        tuxPanel2.LLILZIL = new DialogInterfaceOnDismissListenerC521770KdD(this, 1);
        this.LLJJJIL = tuxPanel2;
        tuxPanel2.show(fragmentManager, "HangoutRandomMatchPanel");
    }

    public static void MR(C1324720kZq c1324720kZq, String str) {
        Context context = c1324720kZq.getContext();
        if (context == null) {
            return;
        }
        C1322000kVS c1322000kVSLJFF = C1322000kVS.LJFF(context);
        c1322000kVSLJFF.LIZLLL(str);
        c1322000kVSLJFF.LJ();
        c1322000kVSLJFF.LIZ(ImageView.ScaleType.CENTER_CROP);
        c1322000kVSLJFF.LIZJ(c1324720kZq);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        InterfaceC481680Iuk interfaceC481680Iuk;
        C1324720kZq c1324720kZq;
        C1324720kZq c1324720kZq2;
        C1324720kZq c1324720kZq3;
        super.onViewCreated(view, bundle);
        this.LLILZLL = view.findViewById(R.id.o3_);
        this.LLIZ = view.findViewById(R.id.wn4);
        this.LLIZLLLIL = (C0KZA) view.findViewById(R.id.si3);
        this.LLJ = (C1324720kZq) view.findViewById(R.id.bh9);
        this.LLJI = (C1324720kZq) view.findViewById(R.id.bh_);
        this.LLJIJIL = (C1324720kZq) view.findViewById(R.id.bh7);
        this.LLJILJIL = (C16FS) view.findViewById(R.id.clv);
        this.LLJILJILJ = (C16FS) view.findViewById(R.id.cm8);
        this.LLJILLL = (TextView) view.findViewById(R.id.z75);
        this.LLJJ = (TextView) view.findViewById(R.id.z4o);
        this.LLJJI = (TextView) view.findViewById(R.id.z33);
        C16FS c16fs = this.LLJILJIL;
        if (c16fs != null) {
            C500260Jjc.LJLIIIL(500L, c16fs, new AwS586S0100000_7(this, 475));
        }
        C16FS c16fs2 = this.LLJILJILJ;
        if (c16fs2 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs2, new AwS586S0100000_7(this, 476));
        }
        if (a0.LJJIIZI(this.LL, "random_chat", true)) {
            i = -10908429;
        } else {
            i = -2191688;
        }
        C0KZA c0kza = this.LLIZLLLIL;
        if (c0kza != null) {
            c0kza.setRingColor(i);
        }
        if (this.LLJJJJLIIL) {
            long j = this.LLJJIJIIJIL;
            String str = this.LLJJIJIL;
            String strLIZIZ = this.LLJJJ;
            this.LLJJIJIIJIL = j;
            this.LLJJIJIL = str;
            this.LLJJJ = strLIZIZ;
            C0KZA c0kza2 = this.LLIZLLLIL;
            if (c0kza2 != null) {
                c0kza2.LIZLLL();
            }
            View view2 = this.LLILZLL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            View view3 = this.LLIZ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            TextView textView = this.LLJILLL;
            if (textView != null) {
                Object[] objArr = new Object[1];
                if (strLIZIZ == null) {
                    strLIZIZ = "";
                } else {
                    try {
                        if (strLIZIZ.codePointCount(0, strLIZIZ.length()) > 20) {
                            int iOffsetByCodePoints = strLIZIZ.offsetByCodePoints(0, 20);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZIZ.substring(0, iOffsetByCodePoints));
                            sbLIZ.append("…");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                objArr[0] = strLIZIZ;
                textView.setText(C497740JfY.LJIJJ(2131854710, objArr));
            }
            C16FS c16fs3 = this.LLJILJILJ;
            if (c16fs3 != null) {
                c16fs3.setText(C497740JfY.LJIJI(2131854269));
            }
            String str2 = this.LLJJIJI;
            if (str2 != null && str2.length() != 0 && (c1324720kZq3 = this.LLJI) != null) {
                MR(c1324720kZq3, str2);
            }
            if (str != null && str.length() != 0 && (c1324720kZq2 = this.LLJIJIL) != null) {
                MR(c1324720kZq2, str);
            }
            CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LLJJLIIIJLLLLLLLZ;
            if (countDownTimerC521500Kcm != null) {
                countDownTimerC521500Kcm.cancel();
            }
            TextView textView2 = this.LLJJI;
            if (textView2 != null) {
                textView2.setText(C497740JfY.LJIJJ(2131854713, Integer.valueOf(this.LLILLJJLI)));
            }
            CountDownTimerC521500Kcm countDownTimerC521500Kcm2 = new CountDownTimerC521500Kcm(((long) this.LLILLJJLI) * 1000, this, 3);
            this.LLJJLIIIJLLLLLLLZ = countDownTimerC521500Kcm2;
            countDownTimerC521500Kcm2.start();
            return;
        }
        View view4 = this.LLILZLL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        View view5 = this.LLIZ;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(8, view5);
        }
        C0KZA c0kza3 = this.LLIZLLLIL;
        if (c0kza3 != null) {
            c0kza3.LIZJ();
        }
        String str3 = this.LLJJIJI;
        if (str3 != null && str3.length() != 0 && (c1324720kZq = this.LLJ) != null) {
            MR(c1324720kZq, str3);
        }
        if (a0.LJJIIZI(this.LL, "random_chat", true)) {
            TextView textView3 = this.LLJJ;
            if (textView3 != null) {
                textView3.setText(C497740JfY.LJIJI(2131854266));
            }
        } else {
            TextView textView4 = this.LLJJ;
            if (textView4 != null) {
                textView4.setText(C497740JfY.LJIJI(2131854265));
            }
        }
        C0KZA c0kza4 = this.LLIZLLLIL;
        if (c0kza4 != null) {
            c0kza4.LIZJ();
        }
        if (this.LLJJJJJIL || (interfaceC481680Iuk = this.LLJJIII) == null) {
            return;
        }
        interfaceC481680Iuk.n();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c8q, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
