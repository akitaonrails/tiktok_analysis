package com.ss.android.ugc.aweme.setting.page.authmanager;

import X.AbstractC1252750ihl;
import X.AnonymousClass0412;
import X.C004I;
import X.C098200Yq;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C11S5;
import X.C1389890mGx;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1726240v1S;
import X.C1765020w20;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C828330WeV;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1749900vdc;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC828360WeY;
import X.InterfaceC836760Ws6;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.AfS181S0100000_12;
import Y.AfS47S1200000_26;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.setting.api.AuthListApi;
import com.ss.android.ugc.aweme.setting.model.AuthAppInfoListResponse;
import com.ss.android.ugc.aweme.setting.model.AuthorizedStruct;
import com.ss.android.ugc.aweme.setting.model.SecondPartyPartnerAuth;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class AuthManagementPage extends BasePage implements InterfaceC1749900vdc, InterfaceC1171660gay, InterfaceC1075600e62<AnonymousClass0412> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiOSHELIOS40LWstPDs7JSQiKCg2OmsNPDs7BSQiKCg2JSAiPR8yLyA=";
    public final AnonymousClass0412 LLJ = new AnonymousClass0412();
    public final lifecycleAwareLazy LLJI;
    public JediBaseFragment LLJIJIL;
    public AuthAppInfoListResponse LLJILJIL;
    public boolean LLJILJILJ;

    public AuthManagementPage() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AuthListViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 1126);
        this.LLJI = new lifecycleAwareLazy(this, awS570S0100000_26, new AwS154S0400000_26(this, awS570S0100000_26, c19719912DlLIZ, AFwS313S0000000_26.get$arr$(18), 13));
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f5n;
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final boolean WR() {
        JediBaseFragment jediBaseFragment = this.LLJIJIL;
        if (jediBaseFragment == null || (jediBaseFragment instanceof AuthAppInfoListFragment) || this.LLJILJILJ) {
            SR();
            return true;
        }
        ZR(null);
        return true;
    }

    @Override // X.InterfaceC1075600e62
    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory jl() {
        return this.LLJ;
    }

    public final void ZR(String str) {
        AuthAppInfoListFragment authAppInfoListFragment = new AuthAppInfoListFragment();
        authAppInfoListFragment.LLIZ = this;
        aS(authAppInfoListFragment);
        if (str != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void aS(JediBaseFragment jediBaseFragment) {
        this.LLJIJIL = jediBaseFragment;
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.bbp, jediBaseFragment, null);
        c19ehLJIIJ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Intent intent;
        super.onCreate(bundle);
        C19EG activity = getActivity();
        String str = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                stringExtra = intent.getStringExtra("teen_sec_uid");
                if (stringExtra != null) {
                    str = "family_pairing";
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        } else {
            stringExtra = null;
        }
        ((AuthListViewModel) this.LLJI.getValue()).hR2(stringExtra, str);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initData, scene:");
        sbLIZ.append(str);
        sbLIZ.append(", teenSecUid:");
        sbLIZ.append(stringExtra);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1749900vdc
    public final void Gq(AuthorizedStruct authorizedStruct, SecondPartyPartnerAuth secondPartyPartnerAuth) {
        JediBaseFragment jediBaseFragment = this.LLJIJIL;
        if (jediBaseFragment != null && (jediBaseFragment instanceof AuthAppInfoListFragment)) {
            ((AuthAppInfoListFragment) jediBaseFragment).OR().iR2(authorizedStruct, secondPartyPartnerAuth);
        }
        if (!TextUtils.isEmpty(authorizedStruct.getPermissionUrl())) {
            if (Intrinsics.LJFF(authorizedStruct.getClientKey(), "awb8yexdm4y2h5m0")) {
                C828330WeV c828330WeV = new C828330WeV(new ThirdPartyBizCert(268435457));
                Context contextRequireContext = requireContext();
                String permissionUrl = authorizedStruct.getPermissionUrl();
                if (permissionUrl == null) {
                    permissionUrl = "";
                }
                c828330WeV.LIZIZ(contextRequireContext, permissionUrl, new InterfaceC828360WeY() { // from class: X.09fb
                    @Override // X.InterfaceC828360WeY
                    public final void LIZ(Context context, String str) {
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
                            intent.addFlags(268435456);
                            intent.addCategory("android.intent.category.BROWSABLE");
                            C2429209fW.LIZ().appendDataFlowId(intent, 1207967489);
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                            C1701330uNH.LIZ(intent, context);
                            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV95xHnHYDfZAu+/15X23wr5CgSkRFmrsAkGWjbqzozSOQU+fc=", null));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }, null);
                return;
            }
            try {
                String strEncode = URLEncoder.encode(authorizedStruct.getPermissionUrl(), "UTF-8");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://webview?url=");
                sbLIZ.append(strEncode);
                SmartRouter.buildRoute(this, C2188811AlT.LIZIZ(sbLIZ)).open();
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        aS(new AuthAppInfoFragment());
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        ArrayList<String> stringArrayList;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Boolean boolValueOf = null;
        if (arguments != null) {
            string = arguments.getString(Scene.SCENE_SERVICE);
        } else {
            string = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("teen_sec_uid");
        } else {
            string2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            stringArrayList = arguments3.getStringArrayList("client_key");
        } else {
            stringArrayList = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            boolValueOf = Boolean.valueOf(arguments4.getBoolean("minis"));
        }
        if (string != null && stringArrayList != null) {
            AuthListApi.LIZ.getClass();
            C1726240v1S.LIZ().LIZIZ(string, string2, stringArrayList).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS47S1200000_26(this, boolValueOf, string, 0), new AfS181S0100000_12(this, 136));
        } else {
            AuthAppInfoListFragment authAppInfoListFragment = new AuthAppInfoListFragment();
            authAppInfoListFragment.LLIZ = this;
            aS(authAppInfoListFragment);
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
