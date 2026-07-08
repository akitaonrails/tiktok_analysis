package com.ss.android.ugc.aweme.authorize;

import X.AbstractC848400XPy;
import X.C098200Yq;
import X.C0JEF;
import X.C0XQ7;
import X.C1324840ka2;
import X.C1685300txQ;
import X.C189200o6;
import X.C1908030zkf;
import X.C19EG;
import X.C19GS;
import X.C19H6;
import X.C19H7;
import X.C1B3S;
import X.C1B3X;
import X.C2188811AlT;
import X.C422820Gi0;
import X.C786410Ut5;
import Y.ACListenerS166S0100000_32;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: loaded from: classes33.dex */
public final class I18nLiteAuthorizeFragment extends Fragment implements C0JEF {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQ5PSc8HELIOSOiw2LGEaeX0iBSYnLQQ5PSc8Oiw2LAkhKSIhLCEn";
    public C422820Gi0 LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public AuthCommonViewModel LLILZLL;
    public AwemeAuthorizePlatformDepend LLIZ;
    public C19H7 LLIZLLLIL;
    public C1B3S LLJ;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1B3S c1b3s = new C1B3S(getArguments());
        this.LLJ = c1b3s;
        if (c1b3s.callerPackage == null) {
            c1b3s.callerPackage = requireActivity().getCallingPackage();
        }
        this.LLIZ = new AwemeAuthorizePlatformDepend(this);
        getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.LLIZ;
        C1B3S c1b3s2 = null;
        if (awemeAuthorizePlatformDepend == null) {
            awemeAuthorizePlatformDepend = null;
        }
        this.LLIZLLLIL = new C19H7(awemeAuthorizePlatformDepend);
        Application application = requireActivity().getApplication();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.LLIZ;
        if (awemeAuthorizePlatformDepend2 == null) {
            awemeAuthorizePlatformDepend2 = null;
        }
        C19H7 c19h7 = this.LLIZLLLIL;
        if (c19h7 == null) {
            c19h7 = null;
        }
        C1B3S c1b3s3 = this.LLJ;
        if (c1b3s3 != null) {
            c1b3s2 = c1b3s3;
        }
        this.LLILZLL = (AuthCommonViewModel) ViewModelProviders.of(requireActivity(), new C19H6(application, awemeAuthorizePlatformDepend2, c19h7, c1b3s2, C1B3X.LIZ(getArguments()))).get(AuthCommonViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        User curUser;
        super.onViewCreated(view, bundle);
        if (getContext() != null && (curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser()) != null) {
            View viewFindViewById = this.LL;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.mt7);
                } else {
                    viewFindViewById = null;
                }
                this.LL = (C422820Gi0) viewFindViewById;
            }
            C1324840ka2.LJFF((RemoteImageView) viewFindViewById, curUser.getAvatarThumb());
            View viewFindViewById3 = this.LLILLJJLI;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.mt9);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILLJJLI = (TuxTextView) viewFindViewById3;
            }
            ((TextView) viewFindViewById3).setText(curUser.getNickname());
            String uniqueId = curUser.getUniqueId();
            View viewFindViewById4 = this.LLILLL;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.mtb);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILLL = (TuxTextView) viewFindViewById4;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('@');
            sbLIZ.append(uniqueId);
            ((TextView) viewFindViewById4).setText(C2188811AlT.LIZIZ(sbLIZ));
            Context context = getContext();
            String customVerify = curUser.getCustomVerify();
            String enterpriseVerifyReason = curUser.getEnterpriseVerifyReason();
            View viewFindViewById5 = this.LLILLL;
            if (viewFindViewById5 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById5 = view5.findViewById(R.id.mtb);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLILLL = (TuxTextView) viewFindViewById5;
            }
            C1908030zkf.LJI(context, customVerify, enterpriseVerifyReason, (TextView) viewFindViewById5);
            View viewFindViewById6 = this.LLILZ;
            if (viewFindViewById6 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById6 = view6.findViewById(R.id.mt3);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLILZ = (TuxTextView) viewFindViewById6;
            }
            ((TextView) viewFindViewById6).setText(C786410Ut5.j4(getResources().getString(2131850343), Arrays.copyOf(new Object[]{curUser.getUniqueId()}, 1)));
            View viewFindViewById7 = this.LLILZ;
            if (viewFindViewById7 == null) {
                View view7 = getView();
                if (view7 != null) {
                    viewFindViewById7 = view7.findViewById(R.id.mt3);
                } else {
                    viewFindViewById7 = null;
                }
                this.LLILZ = (TuxTextView) viewFindViewById7;
            }
            C786410Ut5.h9((TuxTextView) viewFindViewById7, new ACListenerS166S0100000_32(this, 112));
            View view8 = this.LLILZIL;
            if (view8 == null) {
                View view9 = getView();
                if (view9 != null) {
                    viewFindViewById2 = view9.findViewById(R.id.mt2);
                }
                this.LLILZIL = (TuxTextView) viewFindViewById2;
                view8 = viewFindViewById2;
            }
            C786410Ut5.h9((TuxTextView) view8, new ACListenerS166S0100000_32(this, 113));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        View viewSd = C786410Ut5.Sd(R.layout.j7, layoutInflater, null);
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
