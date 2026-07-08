package com.ss.android.ugc.aweme.following.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0XIR;
import X.C0XQ7;
import X.C123100dR;
import X.C1257170iot;
import X.C1264160j0A;
import X.C1264480j0g;
import X.C1264490j0h;
import X.C1264500j0i;
import X.C1264510j0j;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C295390Bhx;
import X.C419910GdJ;
import X.C452501pT;
import X.C666390QBx;
import X.C786410Ut5;
import X.InterfaceC1264400j0Y;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseRelationFragment extends JediBaseFragment implements InterfaceC1264400j0Y {
    public boolean LLILLJJLI;
    public String LLILLL;
    public User LLILZ;
    public boolean LLILZIL;
    public String LLILZLL = "";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1442));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1443));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1440));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1441));

    public abstract void LJFF();

    public abstract int NR();

    public abstract int OR();

    public int PR() {
        return 0;
    }

    public void UR() {
    }

    public String getEnterFrom() {
        return "";
    }

    public abstract int getLayoutId();

    public void onPageSelected() {
    }

    public final boolean RR() {
        String string = this.LLILLL;
        if (string == null) {
            Bundle arguments = getArguments();
            string = arguments != null ? arguments.getString("uid") : null;
        }
        this.LLILLL = string;
        return TextUtils.equals(string, C0XQ7.LJFF().getCurUserId());
    }

    public final boolean SR() {
        return ((Boolean) this.LLIZ.getValue()).booleanValue();
    }

    public final String getPreviousPage() {
        String str = (String) this.LLIZLLLIL.getValue();
        return !C123100dR.LIZ(str) ? RR() ? "personal_homepage" : "others_homepage" : str;
    }

    public final void VR() {
        LJFF();
        C1264480j0g c1264480j0g = C1264480j0g.LIZ;
        String enterFrom = getEnterFrom();
        Context context = getContext();
        c1264480j0g.getClass();
        C1264480j0g.LIZ(context, enterFrom);
    }

    @Override // X.InterfaceC1264400j0Y
    public final void ck() {
        if (isViewValid()) {
            LJFF();
            this.LLILZIL = false;
        }
    }

    @Override // X.InterfaceC1264400j0Y
    public final boolean LJLLL() {
        return this.LLILZIL;
    }

    public final C1722300uv6 MR(String str) {
        String string;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_no_access;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        Context context = getContext();
        if (context == null || (string = context.getString(2131827609)) == null) {
            string = "";
        }
        c1722300uv6.LJI = string;
        c1722300uv6.LJIIIIZZ = str;
        return c1722300uv6;
    }

    @Override // X.InterfaceC1264400j0Y
    public final void X5(boolean z) {
        this.LLILZIL = z;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLILZLL = arguments.getString("uid", "");
            this.LLILLL = arguments.getString("uid");
        }
        this.LLILZ = C666390QBx.LIZJ;
    }

    public void WR(C1749280vcc c1749280vcc, Exception exc) {
        User user;
        String errorMsg = "";
        if (((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).isStandardUIEnable()) {
            C19EG activity = getActivity();
            if (activity != null) {
                C1257170iot.LIZIZ(activity, getEnterFrom(), exc, c1749280vcc);
            }
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            if (C295390Bhx.LIZJ()) {
                c1749280vcc.setLayoutVariant(0);
            }
            if (!RR() && getContext() != null) {
                if (exc instanceof C0XIR) {
                    User user2 = this.LLILZ;
                    if (user2 != null) {
                        C0XIR c0xir = (C0XIR) exc;
                        if (c0xir.getErrorCode() != 2077 && !user2.isBlock) {
                            if (c0xir.getErrorCode() == 2078 && user2.isBlocked()) {
                                errorMsg = getString(2131836247);
                            } else if (c0xir.getErrorCode() == 2096) {
                                errorMsg = getString(PR());
                            } else if (!TextUtils.isEmpty(c0xir.getErrorMsg())) {
                                errorMsg = c0xir.getErrorMsg();
                            } else {
                                C1264160j0A.LIZIZ(c1749280vcc, getEnterFrom(), exc, new C1264500j0i(this));
                                return;
                            }
                        } else {
                            errorMsg = getString(2131827617);
                        }
                    }
                    if (!TextUtils.isEmpty(errorMsg)) {
                        c1749280vcc.setStatus(MR(errorMsg));
                        return;
                    } else {
                        c1749280vcc.setStatus((C1722300uv6) this.LLJI.getValue());
                        return;
                    }
                }
                C1264160j0A.LIZIZ(c1749280vcc, getEnterFrom(), exc, new C1264510j0j(this));
                return;
            }
            C1264160j0A.LIZIZ(c1749280vcc, getEnterFrom(), exc, new C1264490j0h(this));
            return;
        }
        if (!RR() && getContext() != null) {
            if ((exc instanceof C0XIR) && (user = this.LLILZ) != null) {
                C0XIR c0xir2 = (C0XIR) exc;
                if (c0xir2.getErrorCode() == 2077 && user.isBlock) {
                    errorMsg = getString(2131827617);
                } else if (c0xir2.getErrorCode() == 2078 && user.isBlocked()) {
                    errorMsg = getString(2131836247);
                } else if (c0xir2.getErrorCode() == 2096) {
                    errorMsg = getString(PR());
                } else if (!TextUtils.isEmpty(c0xir2.getErrorMsg())) {
                    errorMsg = c0xir2.getErrorMsg();
                }
            }
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            if (!TextUtils.isEmpty(errorMsg)) {
                c1749280vcc.setStatus(MR(errorMsg));
                return;
            } else {
                c1749280vcc.setStatus((C1722300uv6) this.LLJI.getValue());
                return;
            }
        }
        c1749280vcc.setStatus((C1722300uv6) this.LLJI.getValue());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewTd = C786410Ut5.Td(layoutInflater, getLayoutId(), viewGroup, false);
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
