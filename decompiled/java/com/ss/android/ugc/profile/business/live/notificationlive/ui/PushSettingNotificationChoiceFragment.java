package com.ss.android.ugc.profile.business.live.notificationlive.ui;

import X.AbstractC848400XPy;
import X.C004I;
import X.C0XQ7;
import X.C10E1;
import X.C11DN;
import X.C11E5;
import X.C1265190j1p;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C1749280vcc;
import X.C1761680vwc;
import X.C19719912Dl;
import X.C21610619ho;
import X.C2187451AjH;
import X.C423610GjH;
import X.C616540OGe;
import X.InterfaceC1891350zJl;
import X.InterfaceC19572111hn;
import X.InterfaceC960503pD;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.following.ui.BaseRelationFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.profile.business.live.notificationlive.adapter.PushSettingFollowListAdapter;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS157S0400000_29;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class PushSettingNotificationChoiceFragment extends BaseRelationFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9JCw6LGE9JzElLyYwKTHELIOSElJiE/ITMpZzo6ZhU5OicALTE4ICE0Bio4ICk6KyQ4ICA9Cy0jICw2DjctLiI2JjE=";
    public C21610619ho LLJIJIL;
    public RecyclerView LLJILJIL;
    public C1749280vcc LLJILJILJ;
    public final User LLJILLL;
    public boolean LLJJ;
    public final lifecycleAwareLazy LLJJI;
    public PushSettingFollowListAdapter LLJJIII;

    public PushSettingNotificationChoiceFragment() {
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        this.LLJILLL = iAccountUserServiceLJFF != null ? ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser() : null;
        AwS643S0100000_29 awS643S0100000_29 = new AwS643S0100000_29(this, 55);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PushSettingNotificationChoiceViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 2083);
        this.LLJJI = new lifecycleAwareLazy(this, awS563S0100000_19, new AwS157S0400000_29(this, awS563S0100000_19, c19719912DlLIZ, awS643S0100000_29, 12));
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
        return R.layout.edo;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return false;
    }

    public final PushSettingNotificationChoiceViewModel ZR() {
        return (PushSettingNotificationChoiceViewModel) this.LLJJI.getValue();
    }

    public final RecyclerView aS() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tvw) : null;
            this.LLJILJIL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final C1749280vcc bS() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w2j) : null;
            this.LLJILJILJ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void LJFF() {
        ZR().LLJ.refresh();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(PushSettingNotificationChoiceFragment.class.getName());
        }
        super.onResume();
        C10E1 c10e1M4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4();
        boolean z = c10e1M4.LJIIIZ() && c10e1M4.getPushLiveState();
        PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModelZR = ZR();
        pushSettingNotificationChoiceViewModelZR.getClass();
        pushSettingNotificationChoiceViewModelZR.setState(new AwS41S0010000_29(z, 92));
        if (ZR().LLIZLLLIL) {
            ListMiddleware<NotificationChoiceState, InterfaceC1891350zJl, C1265190j1p> listMiddleware = ZR().LLJ;
            C13BV c13bv = C13BV.INSTANCE;
            listMiddleware.getClass();
            listMiddleware.LIZLLL().dR2(new AwS395S0200000_29(listMiddleware, (C11E5<C004I, C004I>) new AwS392S0200000_26((List) c13bv, (List<Object>) listMiddleware, (ListMiddleware<C004I, Object, C1761680vwc>) 140), (Function1<C004I, C004I>) 83));
            ZR().LLJ.refresh();
            ZR().LLIZLLLIL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        InterfaceC19572111hn eventTracker = ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getEventTracker();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("enter_from")) == null) {
            string = "";
        }
        eventTracker.LIZ("live", string);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLJIJIL;
        PushSettingFollowListAdapter pushSettingFollowListAdapter = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.vwl);
            } else {
                viewFindViewById = null;
            }
            this.LLJIJIL = (C21610619ho) viewFindViewById;
        }
        ((C21610619ho) viewFindViewById).setEnabled(false);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.setOrientation(1);
        aS().setLayoutManager(wrapLinearLayoutManager);
        aS().setItemAnimator(new C423610GjH());
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("enter_from")) == null) {
            string = "settings_page";
        }
        PushSettingFollowListAdapter pushSettingFollowListAdapter2 = new PushSettingFollowListAdapter(string, this);
        this.LLJJIII = pushSettingFollowListAdapter2;
        pushSettingFollowListAdapter2.setLoadEmptyText((CharSequence) null);
        RecyclerView recyclerViewAS = aS();
        PushSettingFollowListAdapter pushSettingFollowListAdapter3 = this.LLJJIII;
        if (pushSettingFollowListAdapter3 == null) {
            pushSettingFollowListAdapter3 = null;
        }
        recyclerViewAS.setAdapter(pushSettingFollowListAdapter3);
        PushSettingFollowListAdapter pushSettingFollowListAdapter4 = this.LLJJIII;
        if (pushSettingFollowListAdapter4 == null) {
            pushSettingFollowListAdapter4 = null;
        }
        pushSettingFollowListAdapter4.setLoadMoreListener(new AwS573S0100000_29(this, 1102));
        ListMiddleware<NotificationChoiceState, InterfaceC1891350zJl, C1265190j1p> listMiddleware = ZR().LLJ;
        PushSettingFollowListAdapter pushSettingFollowListAdapter5 = this.LLJJIII;
        if (pushSettingFollowListAdapter5 != null) {
            pushSettingFollowListAdapter = pushSettingFollowListAdapter5;
        }
        final AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this, 850);
        final AwS643S0100000_29 awS643S0100000_29 = new AwS643S0100000_29(this, 155);
        final AwS643S0100000_29 awS643S0100000_292 = new AwS643S0100000_29(this, 156);
        C11DN<InterfaceC1891350zJl, InterfaceC960503pD> c11dn = new C11DN<InterfaceC1891350zJl, InterfaceC960503pD>(awS608S0100000_29, awS643S0100000_29, awS643S0100000_292) { // from class: X.11hi
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
        final AwS608S0100000_29 awS608S0100000_292 = new AwS608S0100000_29(this, 852);
        final AwS643S0100000_29 awS643S0100000_293 = new AwS643S0100000_29(this, 157);
        final AwS643S0100000_29 awS643S0100000_294 = new AwS643S0100000_29(this, 158);
        listMiddleware.subscribe(this, pushSettingFollowListAdapter, false, getUniqueOnlyGlobal(), c11dn, new C11DN<InterfaceC1891350zJl, InterfaceC960503pD>(awS608S0100000_292, awS643S0100000_293, awS643S0100000_294) { // from class: X.11hj
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
        }, new AwS643S0100000_29(this, 159), null, null, null);
        if (!this.LLILZIL) {
            ZR().LLJ.refresh();
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, view.getContext());
        if (numLIZJ != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
    }
}
