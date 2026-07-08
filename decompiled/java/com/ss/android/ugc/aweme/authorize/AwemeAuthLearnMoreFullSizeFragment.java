package com.ss.android.ugc.aweme.authorize;

import X.C098200Yq;
import X.C0JEF;
import X.C13BV;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19H6;
import X.C19H7;
import X.C1B3S;
import X.C1B3X;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS166S0100000_32;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes33.dex */
public final class AwemeAuthLearnMoreFullSizeFragment extends Fragment implements C0JEF {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQ5PSc8Oiw2LGHELIOSESPyAhLA4mPC0ALC4hJggjOyoVPSkgGiYpLQM+KCg+LSs4";
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;
    public LinearLayout LLILLL;
    public C1B3S LLILZ;
    public AwemeAuthorizePlatformDepend LLILZIL;
    public C19H7 LLILZLL;
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public List<String> LLJ = C13BV.INSTANCE;

    public final LinearLayout MR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bcg) : null;
            this.LLILLL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Application application = requireActivity().getApplication();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.LLILZIL;
        C1B3S c1b3s = null;
        if (awemeAuthorizePlatformDepend == null) {
            awemeAuthorizePlatformDepend = null;
        }
        C19H7 c19h7 = this.LLILZLL;
        if (c19h7 == null) {
            c19h7 = null;
        }
        C1B3S c1b3s2 = this.LLILZ;
        if (c1b3s2 != null) {
            c1b3s = c1b3s2;
        }
        ViewModelProviders.of(requireActivity(), new C19H6(application, awemeAuthorizePlatformDepend, c19h7, c1b3s, C1B3X.LIZ(getArguments()))).get(AuthCommonViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        List<String> arrayList;
        String string2;
        super.onCreate(bundle);
        this.LLILZ = new C1B3S(getArguments());
        this.LLILZIL = new AwemeAuthorizePlatformDepend(this);
        getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.LLILZIL;
        Serializable serializable = null;
        if (awemeAuthorizePlatformDepend == null) {
            awemeAuthorizePlatformDepend = null;
        }
        this.LLILZLL = new C19H7(awemeAuthorizePlatformDepend);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null) {
            arguments.getString("pattern", "");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("auth_SDK_learn_more_header_key")) == null) {
            string = "";
        }
        this.LLIZ = string;
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string2 = arguments3.getString("auth_SDK_learn_more_title_key")) != null) {
            str = string2;
        }
        this.LLIZLLLIL = str;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            serializable = arguments4.getSerializable("auth_SDK_learn_more_items_key");
        }
        if (!(serializable instanceof List) || (arrayList = (List) serializable) == null) {
            arrayList = new ArrayList<>();
        }
        this.LLJ = arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.mj3);
            } else {
                viewFindViewById = null;
            }
            this.LL = (TuxTextView) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(this.LLIZ);
        View viewFindViewById2 = this.LLILLJJLI;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.bn2);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLJJLI = (TuxIconView) viewFindViewById2;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById2, new ACListenerS166S0100000_32(this, 110));
        C786410Ut5.LJJJJJL(MR());
        Context context = getContext();
        int i = 12;
        int i2 = -1;
        if (context != null) {
            LinearLayout linearLayoutMR = MR();
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setTuxFont(31);
            tuxTextView.setTextColorRes(R.attr.a1k);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            C786410Ut5.R6(tuxTextView, layoutParams);
            tuxTextView.setTextAlignment(5);
            tuxTextView.setText(this.LLIZLLLIL);
            linearLayoutMR.addView(tuxTextView);
        }
        List<String> list = this.LLJ;
        if (list != null) {
            for (String str : list) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, -2);
                layoutParams2.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                C786410Ut5.d6(linearLayout, layoutParams2);
                linearLayout.setOrientation(0);
                ImageView imageView = new ImageView(linearLayout.getContext());
                linearLayout.setVerticalGravity(48);
                imageView.setImageResource(R.drawable.bwm);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
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
                MR().addView(linearLayout);
                i2 = -1;
                i = 12;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        View viewSd = C786410Ut5.Sd(R.layout.c8o, layoutInflater, null);
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
