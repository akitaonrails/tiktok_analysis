package com.ss.android.ugc.aweme.authorize;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13BV;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC344240DeY;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class AwemeAuthLearnMoreFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQ5PSc8OiHELIOSw2LGESPyAhLA4mPC0ALC4hJggjOyoVOiQrJCo9PA==";
    public final Function0<Unit> LL;
    public LinearLayout LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public List<String> LLILZIL;

    public AwemeAuthLearnMoreFragment() {
        this(null);
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_small_fill_ltr;
        c1251150ifB.LIZJ(new AwS548S0100000_4(this, 50));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = this.LLILLL;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = true;
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLJJLI = null;
    }

    public AwemeAuthLearnMoreFragment(Function0<Unit> function0) {
        this.LL = function0;
        this.LLILLL = "";
        this.LLILZ = "";
        this.LLILZIL = C13BV.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleRequireArguments = requireArguments();
        String string = bundleRequireArguments.getString("auth_SDK_learn_more_header_key");
        String str = "";
        if (string == null) {
            string = "";
        }
        this.LLILLL = string;
        String string2 = bundleRequireArguments.getString("auth_SDK_learn_more_title_key");
        if (string2 != null) {
            str = string2;
        }
        this.LLILZ = str;
        this.LLILZIL = (List) bundleRequireArguments.getSerializable("auth_SDK_learn_more_items_key");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context context = getContext();
        int i = -1;
        if (context != null) {
            View viewFindViewById = this.LLILLJJLI;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.miv);
                } else {
                    viewFindViewById = null;
                }
                this.LLILLJJLI = (LinearLayout) viewFindViewById;
            }
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setTuxFont(31);
            tuxTextView.setTextColorRes(R.attr.a1k);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            C786410Ut5.R6(tuxTextView, layoutParams);
            tuxTextView.setTextAlignment(5);
            tuxTextView.setText(this.LLILZ);
            ((ViewGroup) viewFindViewById).addView(tuxTextView);
        }
        for (String str : this.LLILZIL) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, -2);
            layoutParams2.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            C786410Ut5.d6(linearLayout, layoutParams2);
            linearLayout.setOrientation(0);
            ImageView imageView = new ImageView(linearLayout.getContext());
            linearLayout.setVerticalGravity(48);
            imageView.setImageResource(R.drawable.bwm);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iLIZIZ, iLIZIZ);
            layoutParams3.gravity = 48;
            layoutParams3.setMarginStart(iLIZIZ2);
            layoutParams3.topMargin = iLIZIZ4;
            layoutParams3.setMarginEnd(iLIZIZ3);
            C786410Ut5.c6(imageView, layoutParams3);
            linearLayout.addView(imageView);
            TuxTextView tuxTextView2 = new TuxTextView(linearLayout.getContext(), null, 6, 0);
            tuxTextView2.setTuxFont(31);
            tuxTextView2.setTextColorRes(R.attr.a1k);
            C786410Ut5.R6(tuxTextView2, new ViewGroup.LayoutParams(-1, -2));
            tuxTextView2.setText(str);
            linearLayout.addView(tuxTextView2);
            View viewFindViewById2 = this.LLILLJJLI;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.miv);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILLJJLI = (LinearLayout) viewFindViewById2;
            }
            ((ViewGroup) viewFindViewById2).addView(linearLayout);
            i = -1;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        View viewSd = C786410Ut5.Sd(R.layout.c82, layoutInflater, null);
        if (!(viewSd instanceof View)) {
            viewSd = null;
        }
        if (viewSd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewSd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewSd, this);
                viewSd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewSd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewSd;
    }
}
