package com.ss.android.ugc.profile.business.live.notificationpost;

import X.AbstractC848400XPy;
import X.C004I;
import X.C01GW;
import X.C0OM1;
import X.C0XQ7;
import X.C10E1;
import X.C11DN;
import X.C11E5;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1265190j1p;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C1749280vcc;
import X.C1761680vwc;
import X.C1766560w4U;
import X.C19328310jZ;
import X.C19719912Dl;
import X.C21610619ho;
import X.C2187451AjH;
import X.C423610GjH;
import X.C616540OGe;
import X.InterfaceC1891350zJl;
import X.InterfaceC836760Ws6;
import X.InterfaceC960503pD;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.following.ui.BaseRelationFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS115S0110000_29;
import kotlin.jvm.internal.AwS157S0400000_29;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
@InterfaceC836760Ws6
public final class PostNotificationSettingsFragment extends BaseRelationFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9JCw6LGE9JzElHELIOSLyYwKTElJiEjJzY4Zx88OzECJjs6LiwvKDs6JysfLDsnISsrOgkhKSIhLCEn";
    public TuxNavBar LLJIJIL;
    public C21610619ho LLJILJIL;
    public RecyclerView LLJILJILJ;
    public C1749280vcc LLJILLL;
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS273S0000000_29.get$arr$(254), "enter_from", String.class);
    public final User LLJJI;
    public boolean LLJJIII;
    public final lifecycleAwareLazy LLJJIJI;
    public PostNotificationSettingsAdapter LLJJIJIIJIL;

    public PostNotificationSettingsFragment() {
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        this.LLJJI = iAccountUserServiceLJFF != null ? ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser() : null;
        AwS643S0100000_29 awS643S0100000_29 = new AwS643S0100000_29(this, 56);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PostNotificationSettingsViewModel.class);
        AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(c19719912DlLIZ, 738);
        this.LLJJIJI = new lifecycleAwareLazy(this, awS573S0100000_29, new AwS157S0400000_29(this, awS573S0100000_29, c19719912DlLIZ, awS643S0100000_29, 13));
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int NR() {
        return 2131834842;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int OR() {
        return 2131834837;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int PR() {
        return 2131845495;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int getLayoutId() {
        return R.layout.ede;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return false;
    }

    public final PostNotificationSettingsViewModel ZR() {
        return (PostNotificationSettingsViewModel) this.LLJJIJI.getValue();
    }

    public final RecyclerView aS() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tvw) : null;
            this.LLJILJILJ = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final C1749280vcc bS() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w2j) : null;
            this.LLJILLL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void LJFF() {
        ZR().LLJIJIL.refresh();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(PostNotificationSettingsFragment.class.getName());
        }
        super.onResume();
        C10E1 c10e1M4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4();
        PostNotificationSettingsViewModel postNotificationSettingsViewModelZR = ZR();
        boolean z = c10e1M4.LJIIL() && c10e1M4.LJIILIIL();
        postNotificationSettingsViewModelZR.getClass();
        postNotificationSettingsViewModelZR.setState(new AwS41S0010000_29(z, 93));
        if (AddOptionForGuidanceExp.LJFF) {
            PostNotificationSettingsViewModel postNotificationSettingsViewModelZR2 = ZR();
            boolean zLIZJ = c10e1M4.LIZJ();
            postNotificationSettingsViewModelZR2.getClass();
            postNotificationSettingsViewModelZR2.setState(new AwS115S0110000_29(postNotificationSettingsViewModelZR2, zLIZJ, 11));
        }
        if (ZR().LLJ) {
            ListMiddleware<PostNotificationStatus, InterfaceC1891350zJl, C1265190j1p> listMiddleware = ZR().LLJIJIL;
            C13BV c13bv = C13BV.INSTANCE;
            listMiddleware.getClass();
            listMiddleware.LIZLLL().dR2(new AwS395S0200000_29(listMiddleware, (C11E5<C004I, C004I>) new AwS392S0200000_26((List) c13bv, (List<Object>) listMiddleware, (ListMiddleware<C004I, Object, C1761680vwc>) 140), (Function1<C004I, C004I>) 83));
            ZR().LLJIJIL.refresh();
            ZR().LLJ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.zp);
        tuxImmersionBarLIZLLL.LJ(R.attr.zp);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LIZLLL();
        String str = (String) this.LLJJ.getValue();
        if (str != null && str.length() > 0) {
            ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getEventTracker().LIZ("post", str);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        String string;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLJIJIL;
        PostNotificationSettingsAdapter postNotificationSettingsAdapter = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.p15);
            } else {
                viewFindViewById = null;
            }
            this.LLJIJIL = (TuxNavBar) viewFindViewById;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131849303);
        c0om1.LIZJ = c1250250idj;
        boolean z = true;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS573S0100000_29(this, 1113));
        c0om1.LJ(c1251150ifB);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -7829368;
        }
        c0om1.LIZJ(iIntValue);
        c0om1.LIZLLL = false;
        tuxNavBar.setNavActions(c0om1);
        View viewFindViewById2 = this.LLJILJIL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.vwl);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJILJIL = (C21610619ho) viewFindViewById2;
        }
        ((C21610619ho) viewFindViewById2).setEnabled(false);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.setOrientation(1);
        aS().setLayoutManager(wrapLinearLayoutManager);
        aS().setItemAnimator(new C423610GjH());
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("enter_from")) == null) {
            string = "settings_page";
        }
        PostNotificationSettingsAdapter postNotificationSettingsAdapter2 = new PostNotificationSettingsAdapter(string, this);
        this.LLJJIJIIJIL = postNotificationSettingsAdapter2;
        postNotificationSettingsAdapter2.setLoadEmptyText((CharSequence) null);
        RecyclerView recyclerViewAS = aS();
        PostNotificationSettingsAdapter postNotificationSettingsAdapter3 = this.LLJJIJIIJIL;
        if (postNotificationSettingsAdapter3 == null) {
            postNotificationSettingsAdapter3 = null;
        }
        recyclerViewAS.setAdapter(postNotificationSettingsAdapter3);
        PostNotificationSettingsAdapter postNotificationSettingsAdapter4 = this.LLJJIJIIJIL;
        if (postNotificationSettingsAdapter4 == null) {
            postNotificationSettingsAdapter4 = null;
        }
        postNotificationSettingsAdapter4.setLoadMoreListener(new AwS573S0100000_29(this, 1112));
        ListMiddleware<PostNotificationStatus, InterfaceC1891350zJl, C1265190j1p> listMiddleware = ZR().LLJIJIL;
        PostNotificationSettingsAdapter postNotificationSettingsAdapter5 = this.LLJJIJIIJIL;
        if (postNotificationSettingsAdapter5 != null) {
            postNotificationSettingsAdapter = postNotificationSettingsAdapter5;
        }
        final AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this, 856);
        final AwS643S0100000_29 awS643S0100000_29 = new AwS643S0100000_29(this, 167);
        final AwS643S0100000_29 awS643S0100000_292 = new AwS643S0100000_29(this, 168);
        C11DN<InterfaceC1891350zJl, InterfaceC960503pD> c11dn = new C11DN<InterfaceC1891350zJl, InterfaceC960503pD>(awS608S0100000_29, awS643S0100000_29, awS643S0100000_292) { // from class: X.11hk
            public final Function1<InterfaceC960503pD, Unit> LIZ;
            public final Function2<InterfaceC960503pD, Throwable, Unit> LIZIZ;
            public final Function2<InterfaceC960503pD, List<? extends InterfaceC1891350zJl>, Unit> LIZJ;

            @Override // X.C11DN
            public final Function2<InterfaceC960503pD, Throwable, Unit> LIZ() {
                return this.LIZIZ;
            }

            @Override // X.C11DN
            public final Function2<InterfaceC960503pD, List<? extends InterfaceC1891350zJl>, Unit> LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.C11DN
            public final Function1<InterfaceC960503pD, Unit> LIZJ() {
                return this.LIZ;
            }

            {
                this.LIZ = awS608S0100000_29;
                this.LIZIZ = awS643S0100000_29;
                this.LIZJ = awS643S0100000_292;
            }
        };
        final AwS608S0100000_29 awS608S0100000_292 = new AwS608S0100000_29(this, 858);
        final AwS643S0100000_29 awS643S0100000_293 = new AwS643S0100000_29(this, 169);
        final AwS643S0100000_29 awS643S0100000_294 = new AwS643S0100000_29(this, 170);
        listMiddleware.subscribe(this, postNotificationSettingsAdapter, false, getUniqueOnlyGlobal(), c11dn, new C11DN<InterfaceC1891350zJl, InterfaceC960503pD>(awS608S0100000_292, awS643S0100000_293, awS643S0100000_294) { // from class: X.11hl
            public final Function1<InterfaceC960503pD, Unit> LIZ;
            public final Function2<InterfaceC960503pD, Throwable, Unit> LIZIZ;
            public final Function2<InterfaceC960503pD, List<? extends InterfaceC1891350zJl>, Unit> LIZJ;

            @Override // X.C11DN
            public final Function2<InterfaceC960503pD, Throwable, Unit> LIZ() {
                return this.LIZIZ;
            }

            @Override // X.C11DN
            public final Function2<InterfaceC960503pD, List<? extends InterfaceC1891350zJl>, Unit> LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.C11DN
            public final Function1<InterfaceC960503pD, Unit> LIZJ() {
                return this.LIZ;
            }

            {
                this.LIZ = awS608S0100000_292;
                this.LIZIZ = awS643S0100000_293;
                this.LIZJ = awS643S0100000_294;
            }
        }, new AwS643S0100000_29(this, 171), null, null, null);
        if (!this.LLILZIL) {
            if (AddOptionForGuidanceExp.LJFF) {
                PostNotificationSettingsViewModel postNotificationSettingsViewModelZR = ZR();
                if (C19328310jZ.LIZIZ.LIZLLL("follow_new_video_push_select") != 1) {
                    z = false;
                }
                postNotificationSettingsViewModelZR.getClass();
                postNotificationSettingsViewModelZR.setState(new AwS115S0110000_29(postNotificationSettingsViewModelZR, z, 11));
            }
            ZR().LLJIJIL.refresh();
        }
    }
}
