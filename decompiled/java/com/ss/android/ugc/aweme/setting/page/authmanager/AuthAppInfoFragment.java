package com.ss.android.ugc.aweme.setting.page.authmanager;

import X.AbstractC19484711Kz;
import X.C01GW;
import X.C098200Yq;
import X.C0PEM;
import X.C1389890mGx;
import X.C13LE;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1702870uPl;
import X.C1703770uRD;
import X.C1749280vcc;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C21411818qq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC19474811He;
import Y.ACListenerS160S0100000_26;
import Y.AObserverS228S0100000_26;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.setting.model.SecondPartyPartnerAuth;
import com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class AuthAppInfoFragment extends JediBaseFragment {
    public static String LLJJIII = "";
    public static String LLJJIJI = "";
    public static String LLJJIJIIJIL = "";
    public static String LLJJIJIL = null;
    public static String LLJJJ = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiOSHELIOS40LWstPDs7JSQiKCg2OmsNPDs7CTU8ACE1JwM+KCg+LSs4";
    public C1749280vcc LLILLJJLI;
    public TuxIconView LLILLL;
    public C197039127h LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public RemoteImageView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public LinearLayout LLJIJIL;
    public C21411818qq LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;

    public final TuxTextView MR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.b7j) : null;
            this.LLJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView NR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bbh) : null;
            this.LLJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final AuthListViewModel OR() {
        return (AuthListViewModel) this.LLJILJILJ.getValue();
    }

    public final C197039127h PR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cmh) : null;
            this.LLILZ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final LinearLayout RR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u1r) : null;
            this.LLJIJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final void SR() {
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIIZ(2131837962);
        c1389890mGx.LJIIJJI();
        C786410Ut5.LLLZLZ((C1749280vcc) this.LLJILLL.getValue(), 8);
    }

    public final void UR() {
        AuthManagementPage authManagementPage;
        C786410Ut5.LLLZLZ((C1749280vcc) this.LLJILLL.getValue(), 8);
        if (getParentFragment() != null) {
            Fragment parentFragment = getParentFragment();
            if (!(parentFragment instanceof AuthManagementPage) || (authManagementPage = (AuthManagementPage) parentFragment) == null) {
                return;
            }
            authManagementPage.ZR(u.LJJIFFI(getString(2131826822), "%s", LLJJIII, false));
        }
    }

    public final void VR() {
        if (Intrinsics.LJFF(LLJJJ, "amazon_in_app_shopping_link_partner")) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1702870uPl(this, null), 2);
        }
        final String str = LLJJIJIL;
        if (str != null) {
            AuthListViewModel authListViewModelOR = OR();
            boolean z = this.LLJJ;
            SecondPartyPartnerAuth secondPartyPartnerAuth = authListViewModelOR.LLJIJIL;
            String str2 = secondPartyPartnerAuth != null ? secondPartyPartnerAuth.secondPartyPartnerEnum : null;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deleteAuthApp, clientKey:");
            sbLIZ.append(str);
            sbLIZ.append(", partnerIdentifier:");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            if (z) {
                authListViewModelOR.LLIZ = null;
                authListViewModelOR.LLIZLLLIL = null;
            }
            C1703770uRD c1703770uRD = authListViewModelOR.LLILZIL;
            String str3 = authListViewModelOR.LLIZ;
            String str4 = authListViewModelOR.LLIZLLLIL;
            c1703770uRD.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("client_key", str);
            if (z) {
                linkedHashMap.put("is_single_app_auth", "true");
            }
            if (str3 != null) {
                linkedHashMap.put("teen_sec_uid", str3);
            }
            if (str4 != null) {
                linkedHashMap.put(Scene.SCENE_SERVICE, str4);
            }
            if (str2 != null) {
                linkedHashMap.put("partner_identifier", str2);
            }
            AbstractC19484711Kz.LJIJJ(c1703770uRD.LIZLLL.request(linkedHashMap)).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<BaseResponse>() { // from class: X.0vdd
                @Override // X.InterfaceC19474811He
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                }

                @Override // X.InterfaceC19474811He
                public final void onError(Throwable th) {
                    boolean z2;
                    String str5;
                    Intent intent;
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onDelete, onError:");
                    sbLIZ2.append(th);
                    C1720106oR.LIZ("appauth-AuthAppInfoFragment", C2188811AlT.LIZIZ(sbLIZ2));
                    if (this.LL.LLJJI) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        C19EG activity = this.LL.getActivity();
                        if (activity != null && !C960203pA.LIZIZ(activity)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            str5 = "1";
                        } else {
                            str5 = CardStruct.IStatusCode.DEFAULT;
                        }
                        c2344009Gk.LJIIIIZZ("background", str5);
                        c2344009Gk.LJIIIIZZ("click_type", "1");
                        c2344009Gk.LJIIIIZZ("action", "");
                        c2344009Gk.LJIIIIZZ("result", CardStruct.IStatusCode.DEFAULT);
                        c2344009Gk.LJIIIIZZ("minis_id", AuthAppInfoFragment.LLJJIJIL);
                        C19EG activity2 = this.LL.getActivity();
                        String string = null;
                        if (activity2 != null && (intent = activity2.getIntent()) != null) {
                            try {
                                Bundle extras = intent.getExtras();
                                if (extras != null) {
                                    string = extras.getString("enter_from");
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        c2344009Gk.LJFF("enter_from", string);
                        ((IMinisApiService) ServiceManager.get().getService(IMinisApiService.class)).LJIJ(c2344009Gk, "tm_data_privacy_page_click");
                    }
                    this.LL.SR();
                }

                @Override // X.InterfaceC19474811He
                public final void onSuccess(BaseResponse baseResponse) {
                    boolean z2;
                    String str5;
                    Intent intent;
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onDelete, onSuccess:");
                    sbLIZ2.append(baseResponse);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    AuthListViewModel authListViewModelOR2 = this.LL.OR();
                    String str6 = str;
                    authListViewModelOR2.getClass();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("setStateAfterDelete, clientKey:");
                    sbLIZ3.append(str6);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    authListViewModelOR2.setState(new AwS76S1000000_26(str6, 43));
                    AuthAppInfoFragment authAppInfoFragment = this.LL;
                    if (authAppInfoFragment.LLJJ) {
                        if (authAppInfoFragment.LLJJI) {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            C19EG activity = this.LL.getActivity();
                            if (activity != null && !C960203pA.LIZIZ(activity)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                str5 = "1";
                            } else {
                                str5 = CardStruct.IStatusCode.DEFAULT;
                            }
                            c2344009Gk.LJIIIIZZ("background", str5);
                            c2344009Gk.LJIIIIZZ("click_type", "1");
                            c2344009Gk.LJIIIIZZ("action", "1");
                            c2344009Gk.LJIIIIZZ("result", "1");
                            c2344009Gk.LJIIIIZZ("minis_id", AuthAppInfoFragment.LLJJIJIL);
                            C19EG activity2 = this.LL.getActivity();
                            String string = null;
                            if (activity2 != null && (intent = activity2.getIntent()) != null) {
                                try {
                                    Bundle extras = intent.getExtras();
                                    if (extras != null) {
                                        string = extras.getString("enter_from");
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            c2344009Gk.LJFF("enter_from", string);
                            ((IMinisApiService) ServiceManager.get().getService(IMinisApiService.class)).LJIJ(c2344009Gk, "tm_data_privacy_page_click");
                        }
                        C19EG activity3 = this.LL.getActivity();
                        if (activity3 != null) {
                            activity3.finish();
                            return;
                        }
                        return;
                    }
                    authAppInfoFragment.UR();
                }
            });
        }
    }

    public AuthAppInfoFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AuthListViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 97));
        this.LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1124));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intent intent;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        View viewFindViewById = null;
        boolean z = false;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && extras.getBoolean("minis")) {
                    z = true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LLJJI = z;
        View view2 = this.LLILLL;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.bn2);
            }
            this.LLILLL = (TuxIconView) viewFindViewById;
            view2 = viewFindViewById;
        }
        C786410Ut5.a9((TuxIconView) view2, new ACListenerS160S0100000_26(this, 38));
        C786410Ut5.U8(PR(), new ACListenerS160S0100000_26(this, 39));
        OR().LLILZLL.observe(this, new AObserverS228S0100000_26(this, 4));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f6r, viewGroup, false);
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
