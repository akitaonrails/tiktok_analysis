package com.ss.android.ugc.profile.business.ur.ui;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0HFL;
import X.C0XQ7;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C418440Gaw;
import X.C437560HDu;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC437540HDs;
import Y.ACListenerS53S1200000_6;
import Y.ACListenerS79S1100000_6;
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
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarBottomSheetActionFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiPCHELIOSZ9GyovIC4/CTMtPS4hCio4PSA+Gy0pLDsSKzElJiEVOiQrJCo9PA==";
    public int LL;
    public User LLILLJJLI;
    public C0HFL LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 971));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 972));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 973));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 969));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 970));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 968));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(392));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(391));

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String uid;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        String uid2;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ein, viewGroup, false);
        C19GS c19gs = null;
        String str = "";
        if (this.LL == 0) {
            LinearLayout linearLayout = (LinearLayout) viewTd.findViewById(R.id.a2f);
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            if (curUser != null && (uid2 = curUser.getUid()) != null) {
                str = uid2;
            }
            C786410Ut5.LJJJJJL(linearLayout);
            View view = (View) this.LLILZ.getValue();
            if (view != null) {
                C786410Ut5.I7(new ACListenerS79S1100000_6(this, str, 4), view);
            } else {
                view = null;
            }
            linearLayout.addView(view);
            linearLayout.addView(C786410Ut5.LJLLJ(getContext(), R.layout.eii, null));
            View view2 = (View) this.LLILZIL.getValue();
            if (view2 != null) {
                C786410Ut5.I7(new ACListenerS79S1100000_6(this, str, 5), view2);
            } else {
                view2 = null;
            }
            linearLayout.addView(view2);
            linearLayout.addView(C786410Ut5.LJLLJ(getContext(), R.layout.eii, null));
            View view3 = (View) this.LLILZLL.getValue();
            if (view3 != null) {
                C786410Ut5.I7(new ACListenerS79S1100000_6(this, str, 6), view3);
            } else {
                view3 = null;
            }
            linearLayout.addView(view3);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams2 = null;
            }
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23));
            }
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(43));
            }
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
            C786410Ut5.d6(linearLayout, marginLayoutParams2);
        } else {
            View viewFindViewById = viewTd.findViewById(R.id.a2f);
            User curUser2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            if (curUser2 != null && (uid = curUser2.getUid()) != null) {
                str = uid;
            }
            LinearLayout linearLayout2 = (LinearLayout) viewFindViewById.findViewById(R.id.a2f);
            if (linearLayout2 != null) {
                C786410Ut5.LJJJJJL(linearLayout2);
                View view4 = (View) this.LLIZ.getValue();
                if (view4 != null) {
                    C786410Ut5.I7(new ACListenerS53S1200000_6(view4, this, str, 1), view4);
                } else {
                    view4 = null;
                }
                linearLayout2.addView(view4);
                linearLayout2.addView(C786410Ut5.LJLLJ(getContext(), R.layout.eii, null));
                View view5 = (View) this.LLIZLLLIL.getValue();
                if (view5 != null) {
                    EnumC437540HDs enumC437540HDs = ((C437560HDu) ((ISocialAvatarCreationStatusService) this.LLJIJIL.getValue()).LIZ(str).getValue()).LIZ;
                    if (enumC437540HDs != EnumC437540HDs.UPLOADING && enumC437540HDs != EnumC437540HDs.IN_QUEUE && enumC437540HDs != EnumC437540HDs.REGENERATING && enumC437540HDs != EnumC437540HDs.GENERATING) {
                        view5.setEnabled(true);
                        C786410Ut5.x5((TuxIconView) view5.findViewById(R.id.k1_), 1.0f);
                        C786410Ut5.B5((TuxTextView) view5.findViewById(R.id.xom), 1.0f);
                        C786410Ut5.I7(new ACListenerS53S1200000_6(view5, this, str, 2), view5);
                    } else {
                        view5.setEnabled(false);
                        C786410Ut5.x5((TuxIconView) view5.findViewById(R.id.k1_), 0.4f);
                        C786410Ut5.B5((TuxTextView) view5.findViewById(R.id.xom), 0.4f);
                        C786410Ut5.I7(null, view5);
                    }
                } else {
                    view5 = null;
                }
                linearLayout2.addView(view5);
                linearLayout2.addView(C786410Ut5.LJLLJ(getContext(), R.layout.eii, null));
                View view6 = (View) this.LLJ.getValue();
                if (view6 != null) {
                    C786410Ut5.I7(new ACListenerS79S1100000_6(this, str, 3), view6);
                } else {
                    view6 = null;
                }
                linearLayout2.addView(view6);
                ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23));
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(43));
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                }
                C786410Ut5.d6(linearLayout2, marginLayoutParams);
            }
        }
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
