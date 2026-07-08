package com.ss.android.ugc.aweme.im.push.impl.alerttone.settings;

import X.C01GW;
import X.C098200Yq;
import X.C13FE;
import X.C13LE;
import X.C14EU;
import X.C1511105vp;
import X.C15438062q;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C336720DHy;
import X.C452501pT;
import X.C891390Yy1;
import X.EnumC1427810nG7;
import X.EnumC452301pR;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.GetAlertToneResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@InterfaceC836760Ws6
public final class MessageNotificationToneMsgTypeFragment extends BaseFragment implements InterfaceC21503819Do {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZz8mOy1iICIjJGstJSohPDEjJyp9HELIOSOyA4PSY9LzZiBCogOyQrLAE8PCwqICwyPCwjJxs8JiABOigHMTUpDz0yLygpJzs=";
    public final ViewModelLazy LLIZ;

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

    public MessageNotificationToneMsgTypeFragment() {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS558S0100000_14(new AwS558S0100000_14((Fragment) this, 583), 584));
        this.LLIZ = C336720DHy.LIZ(this, C13LE.LIZ(AlertToneViewModel.class), new AwS558S0100000_14(c01gwLIZ, 585), new AwS415S0200000_14((Function0) null, c01gwLIZ, 37), new AwS415S0200000_14(this, c01gwLIZ, 38));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS248S0000000_14.get$arr$(148));
    }

    @C14EU
    public final void onSyncAlertToneSettings$im_push_impl_release(C1511105vp c1511105vp) {
        C891390Yy1 c891390Yy1;
        GetAlertToneResponse getAlertToneResponse;
        AlertToneViewModel alertToneViewModel = (AlertToneViewModel) this.LLIZ.getValue();
        Object value = ((C13FE) alertToneViewModel.LL).getValue();
        ArrayList arrayList = null;
        if ((value instanceof C891390Yy1) && (c891390Yy1 = (C891390Yy1) value) != null && (getAlertToneResponse = c891390Yy1.LIZ) != null) {
            String str = c1511105vp.LIZ;
            List<AlertToneItem> list = getAlertToneResponse.alertToneInfo;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (AlertToneItem alertToneItemLIZ : list) {
                    if (Intrinsics.LJFF(alertToneItemLIZ.alertToneScene, str)) {
                        alertToneItemLIZ = AlertToneItem.LIZ(alertToneItemLIZ, null, c1511105vp.LIZIZ.alertToneValue, 7);
                    }
                    arrayList2.add(alertToneItemLIZ);
                }
                arrayList = arrayList2;
            }
            ((C13FE) alertToneViewModel.LL).setValue(new C891390Yy1(new GetAlertToneResponse(arrayList)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setFitsSystemWindows(true);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-1159939046, new AwS633S0100000_19(this, 46), true));
        try {
            ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(composeView, this);
            composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return composeView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return composeView;
        }
    }
}
