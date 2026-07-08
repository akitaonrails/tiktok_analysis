package com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default;

import X.C098200Yq;
import X.C1390920mIc;
import X.C13LP;
import X.C15438062q;
import X.C1685300txQ;
import X.C189200o6;
import X.C1913750ztt;
import X.C1914060zuO;
import X.C1914080zuQ;
import X.C19EG;
import X.C19GS;
import X.C2097908Jt;
import X.C418440Gaw;
import X.C426750GoL;
import X.C431280Gve;
import X.C770750ULh;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ARunnableS117S0100000_17;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.DSAToggle;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.StyleExtra;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS46S2100000_28;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupBottomSheetUI extends UniversalPopupUI {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUiOmEmJiw6LD0gKSk8Jj8mOGHELIOSsvJj02ZjAlZys2LiQ5JTt9HSslPyohOyQgGSAjPTUOJjsnJygfISo2PBAF";
    public final C770750ULh LLIZ = new C770750ULh();
    public final ArrayList<C1914060zuO> LLIZLLLIL = new ArrayList<>();

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final int MR() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final Map<String, String> OR() {
        ArrayList<C1914060zuO> arrayList = this.LLIZLLLIL;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C1914060zuO c1914060zuO : arrayList) {
            Pair pair = new Pair(c1914060zuO.getSwitchId$pns_universal_popup_release(), String.valueOf(c1914060zuO.LL.LLILZ.isChecked()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void WR(String str) {
        this.LLIZ.LJ = str;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void RR(Map<String, String> map, StyleExtra styleExtra) {
        List<DSAToggle> list;
        final boolean zLJFF = Intrinsics.LJFF(map.get("upper_right_close"), "true");
        final boolean zLJFF2 = Intrinsics.LJFF(map.get("dismiss_click_outside"), "true");
        if (styleExtra != null && (list = styleExtra.dsaToggles) != null) {
            LinearLayout linearLayout = new LinearLayout(requireContext());
            linearLayout.setOrientation(1);
            C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            linearLayout.addView(C786410Ut5.LJLLJ(requireContext(), R.layout.i62, null));
            C426750GoL.LJIIIZ(linearLayout, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), false, 23);
            for (DSAToggle dSAToggle : list) {
                C1914060zuO c1914060zuO = new C1914060zuO(requireContext());
                String str = dSAToggle.id;
                String str2 = dSAToggle.name;
                String str3 = dSAToggle.description;
                boolean z = dSAToggle.defaultValue;
                c1914060zuO.LLILLJJLI = str;
                TuxTextView tuxTextView = c1914060zuO.LL.LLILLL;
                tuxTextView.setText(str2);
                tuxTextView.setTuxFont(42);
                if (str3 != null) {
                    TuxTextView tuxTextView2 = c1914060zuO.LL.LLILLJJLI;
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                    tuxTextView2.setText(str3);
                    tuxTextView2.setTuxFont(81);
                } else {
                    C786410Ut5.LLLLZLL(c1914060zuO.LL.LLILLJJLI, 8);
                }
                c1914060zuO.LL.LLILZ.setChecked(z);
                this.LLIZLLLIL.add(c1914060zuO);
                linearLayout.addView(c1914060zuO);
            }
            this.LLIZ.LJIILL = linearLayout;
        }
        C770750ULh c770750ULh = this.LLIZ;
        c770750ULh.LJIILLIIL = zLJFF;
        c770750ULh.LJIJ = true;
        C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
        DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: X.0eMN
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                if (zLJFF || zLJFF2) {
                    C786410Ut5.LJLIIL(200L, new BPEAHandler(), new ARunnableS117S0100000_17(this, 129));
                }
            }
        };
        TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
        tuxSheet.LL = onCancelListener;
        tuxSheet.LLILLL = zLJFF2;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLJLLIL = false;
        tuxSheet.show(getChildFragmentManager(), "UNIVERSAL_POPUP_BOTTOM_SHEET");
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void SR(SpannableStringBuilder spannableStringBuilder, String str) {
        C770750ULh c770750ULh = this.LLIZ;
        c770750ULh.LJIILIIL = C431280Gve.LIZ(requireContext(), spannableStringBuilder, str);
        c770750ULh.LJIILJJIL = false;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void VR(String str, String str2) {
        C770750ULh c770750ULh = this.LLIZ;
        c770750ULh.LIZJ = new AwS46S2100000_28(this, str, str2, 0);
        c770750ULh.LIZLLL = 0;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void UR(List list, Boolean bool, AwS596S0100000_17 awS596S0100000_17) {
        C1913750ztt c1913750ztt = (C1913750ztt) C13LP.LJJJLZIJ(0, list);
        if (c1913750ztt != null) {
            this.LLIZ.LJI(c1913750ztt.LIZ, new AwS394S0200000_28(awS596S0100000_17, c1913750ztt, 97));
        }
        C1913750ztt c1913750ztt2 = (C1913750ztt) C13LP.LJJJLZIJ(1, list);
        if (c1913750ztt2 != null) {
            this.LLIZ.LJII(c1913750ztt2.LIZ, new AwS394S0200000_28(awS596S0100000_17, c1913750ztt2, 98));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = C1914080zuQ.LIZ(layoutInflater, viewGroup).LL;
        C19GS c19gs = null;
        if (!(constraintLayout instanceof View)) {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            try {
                ViewTreeLifecycleOwner.set(constraintLayout, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(constraintLayout, this);
                constraintLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return constraintLayout;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return constraintLayout;
    }
}
