package com.ss.android.ugc.aweme.translation.ui;

import X.C017O;
import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C299170Bo3;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC344240DeY;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoDubbingConsumptionSheetFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjE+KCEgJCQ4ICA9ZjHELIOSAlZw4mPCoIPC0xISsrCiA9OzAhOTs6JysfISo2PAM+KCg+LSs4";
    public final String LL = "AutoDubbingConsumptionSheetFragment";

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String string;
        Integer numLIZJ;
        Context context = getContext();
        if (context == null || (string = context.getString(2131828761)) == null) {
            return null;
        }
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS548S0100000_4(this, 296));
        c0om1.LIZIZ(c1251150ifB);
        Context context2 = getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context2)) != null) {
            c0om1.LIZJ(numLIZJ.intValue());
        }
        return c0om1;
    }

    public final LinearLayout MR(int i, String str) {
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setOrientation(0);
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(48);
        if (str == null) {
            return linearLayout;
        }
        TuxIconView tuxIconView = new TuxIconView(requireContext(), null, 0, 6, null);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        tuxIconView.setTuxIcon(c419910GdJ);
        linearLayout.addView(tuxIconView);
        TuxTextView tuxTextView = new TuxTextView(requireContext(), null, 6, 0);
        tuxTextView.setText(str);
        tuxTextView.setTuxFont(41);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, tuxTextView.getContext());
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        C786410Ut5.R6(tuxTextView, layoutParams);
        linearLayout.addView(tuxTextView);
        return linearLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        Integer num;
        String string;
        String string2;
        LinearLayout linearLayout = new LinearLayout(requireContext());
        boolean z2 = true;
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(17);
        C426750GoL.LJIIL(linearLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 16);
        if (C017O.LIZ()) {
            C426750GoL.LJIIIZ(linearLayout, 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), false, 16);
        } else {
            C426750GoL.LJIIIZ(linearLayout, 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(81))), false, 16);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setIntrinsicHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        shapeDrawable.getPaint().setColor(0);
        linearLayout.setDividerDrawable(shapeDrawable);
        linearLayout.setShowDividers(2);
        if (C299170Bo3.LIZ() == 1) {
            z = true;
        } else {
            z = false;
        }
        C19GS c19gs = null;
        if (z) {
            num = null;
        } else {
            if (C299170Bo3.LIZ() != 2) {
                z2 = false;
            }
            if (z2) {
                num = 2131828760;
            } else {
                num = 2131828759;
            }
        }
        Context context = getContext();
        if (context != null) {
            string = context.getString(2131828758);
        } else {
            string = null;
        }
        linearLayout.addView(MR(R.raw.icon_human_soundwave_fill, string));
        if (num != null) {
            int iIntValue = num.intValue();
            Context context2 = getContext();
            if (context2 != null) {
                string2 = context2.getString(iIntValue);
            } else {
                string2 = null;
            }
            linearLayout.addView(MR(R.raw.icon_person_gear_fill, string2));
        }
        try {
            ViewTreeLifecycleOwner.set(linearLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(linearLayout, this);
            linearLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return linearLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return linearLayout;
        }
    }
}
