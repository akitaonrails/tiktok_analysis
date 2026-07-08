package com.ss.android.ugc.aweme.notification;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2095008Iq;
import X.C2148608bM;
import X.C23250099c;
import X.C452501pT;
import X.C497820Jfg;
import X.C635440OwA;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS144S0100000_9;
import Y.AObserverS213S0100000_9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notification.vh.SystemNotificationCategorySettingCell;
import com.ss.android.ugc.aweme.notification.vh.SystemNotificationChannelSettingCell;
import com.ss.android.ugc.aweme.notification.vh.SystemNotificationDetailTitleCell;
import com.ss.android.ugc.aweme.notification.vh.SystemNotificationInnerSpaceCell;
import com.ss.android.ugc.aweme.notification.vm.UnsubscribeChannelSettingViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class SystemNotificationUnsubscribeDetailSettingFragment extends AmeBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjPSY1ISYtPSY8JmsfMDwnLSgCHELIOSJjs6LiwvKDs6JysZJzwmKjYvOyYxLQEpPS46JBYpPTs6JiIKOy40JSAiPQ==";
    public ViewOnAttachStateChangeListenerC20604515jv LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public Integer LLILZIL;
    public final C01GW LL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS240S0000000_9.get$arr$(568), "enter_from", String.class);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1357));

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numLJIIJJI;
        Boolean boolValueOf;
        String str;
        String string;
        super.onViewCreated(view, bundle);
        ((UnsubscribeChannelSettingViewModel) this.LLILZLL.getValue()).LL = (String) this.LL.getValue();
        Bundle arguments = getArguments();
        GroupUnsubscribeSetting groupUnsubscribeSetting = null;
        if (arguments != null && (string = arguments.getString("channel_id")) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(string);
        } else {
            numLJIIJJI = null;
        }
        this.LLILZIL = numLJIIJJI;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            boolValueOf = Boolean.valueOf(arguments2.getBoolean("use_exit_data", false));
        } else {
            boolValueOf = null;
        }
        View view2 = getView();
        if (view2 != null) {
            view2.setPadding(0, C497820Jfg.LIZJ(requireActivity()), 0, 0);
        }
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.zp);
        tuxImmersionBarLIZLLL.LJ(R.attr.zp);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LIZLLL();
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.bn0);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = (TuxIconView) viewFindViewById;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById, new ACListenerS144S0100000_9(this, 143));
        ((UnsubscribeChannelSettingViewModel) this.LLILZLL.getValue()).LLILZ.observe(getViewLifecycleOwner(), new AObserverS213S0100000_9(this, 21));
        View viewFindViewById2 = this.LLILLJJLI;
        if (viewFindViewById2 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.rmx);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLJJLI = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById2;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById2;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SystemNotificationDetailTitleCell.class, SystemNotificationInnerSpaceCell.class, SystemNotificationCategorySettingCell.class, SystemNotificationChannelSettingCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        }
        ((UnsubscribeChannelSettingViewModel) this.LLILZLL.getValue()).LLILLL.observe(getViewLifecycleOwner(), new AObserverS213S0100000_9(this, 20));
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            UnsubscribeChannelSettingViewModel unsubscribeChannelSettingViewModel = (UnsubscribeChannelSettingViewModel) this.LLILZLL.getValue();
            Integer num = this.LLILZIL;
            unsubscribeChannelSettingViewModel.getClass();
            if (num != null) {
                List<GroupUnsubscribeSetting> list = C635440OwA.LIZ;
                if (list != null) {
                    Iterator<GroupUnsubscribeSetting> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        GroupUnsubscribeSetting next = it2.next();
                        if (next.group == num.intValue()) {
                            groupUnsubscribeSetting = next;
                            break;
                        }
                    }
                    groupUnsubscribeSetting = groupUnsubscribeSetting;
                }
                unsubscribeChannelSettingViewModel.LLILLJJLI = groupUnsubscribeSetting;
                unsubscribeChannelSettingViewModel.vQ2(num.intValue());
                MutableLiveData<String> mutableLiveData = unsubscribeChannelSettingViewModel.LLILZ;
                GroupUnsubscribeSetting groupUnsubscribeSetting2 = unsubscribeChannelSettingViewModel.LLILLJJLI;
                if (groupUnsubscribeSetting2 == null || (str = groupUnsubscribeSetting2.name) == null) {
                    str = "";
                }
                mutableLiveData.postValue(str);
                return;
            }
            return;
        }
        UnsubscribeChannelSettingViewModel unsubscribeChannelSettingViewModel2 = (UnsubscribeChannelSettingViewModel) this.LLILZLL.getValue();
        Integer num2 = this.LLILZIL;
        unsubscribeChannelSettingViewModel2.getClass();
        if (num2 == null) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(unsubscribeChannelSettingViewModel2), null, null, new C2148608bM(unsubscribeChannelSettingViewModel2, num2, null), 3);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.abd, viewGroup, false);
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
