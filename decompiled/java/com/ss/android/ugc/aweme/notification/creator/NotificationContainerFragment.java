package com.ss.android.ugc.aweme.notification.creator;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C1720106oR;
import X.C189200o6;
import X.C1900870zZ7;
import X.C1904270zeb;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20277814Wa;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1581830rGX;
import X.InterfaceC1586310rNl;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class NotificationContainerFragment extends BaseFragment implements InterfaceC1586310rNl, InterfaceC21503819Do, InterfaceC1581830rGX {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjPSY1ISYtPSY8JmHELIOSsvOyoyPCo+ZwE8PCwqICwyPCwjJww8JjEtICE2OgM+KCg+LSs4";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS271S0000000_28.get$arr$(163), "group", Integer.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS271S0000000_28.get$arr$(164), "list_type", Integer.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS271S0000000_28.get$arr$(162), "filter_type", Integer.class);

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC1586310rNl
    public final String getEnterMethod() {
        return "notification_page";
    }

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        return "activity_page";
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1900870zZ7.LIZ = null;
        C1900870zZ7.LIZIZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1900870zZ7.LIZ = "new_activities";
        C1900870zZ7.LIZIZ = "new_activities";
    }

    @Override // X.InterfaceC1586310rNl
    public final void Zu(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("to_page", "activity_page");
        C20684815ws.LJIILLIIL("enter_activity_page", linkedHashMap);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        activityConfiguration(AFwS271S0000000_28.get$arr$(165));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        int iIntValue = ((Number) this.LLIZ.getValue()).intValue();
        if (iIntValue != -1) {
            C1904270zeb.LIZJ = iIntValue;
        }
        super.onAttach(activity);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("group = ");
        sbLIZ.append(((Number) this.LLIZ.getValue()).intValue());
        sbLIZ.append(", filterType = ");
        sbLIZ.append(((Number) this.LLJ.getValue()).intValue());
        sbLIZ.append(", listType = ");
        sbLIZ.append(((Number) this.LLIZLLLIL.getValue()).intValue());
        C1720106oR.LJI("NotificationContainerFragment", C2188811AlT.LIZIZ(sbLIZ));
        NR(AFwS271S0000000_28.get$arr$(166));
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putInt("group", ((Number) this.LLIZ.getValue()).intValue());
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.putInt("filter_type", ((Number) this.LLJ.getValue()).intValue());
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            arguments3.putInt("list_type", ((Number) this.LLIZLLLIL.getValue()).intValue());
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        NotificationFragmentV2 notificationFragmentV2 = new NotificationFragmentV2();
        notificationFragmentV2.setArguments(getArguments());
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiv, notificationFragmentV2, null);
        c19ehLJIIJ.LJIIL();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a5m, viewGroup, false);
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
