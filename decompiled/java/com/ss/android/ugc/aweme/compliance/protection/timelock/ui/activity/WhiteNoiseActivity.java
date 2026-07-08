package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.activity;

import X.C01GW;
import X.C098200Yq;
import X.C1163250gNP;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC1163260gNQ;
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
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class WhiteNoiseActivity extends BaseFragment implements InterfaceC21503819Do {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODcjPSowPCHELIOSwjJ2EnISgpJSAwI2s5IGEyKzElPyYnMWsbISYnLQsjIDw2CSY4IDk6PDw=";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS256S0000000_18.get$arr$(57), "noise_type", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS256S0000000_18.get$arr$(55), "enter_from", String.class);

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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS256S0000000_18.get$arr$(56));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC1163260gNQ next;
        super.onViewCreated(view, bundle);
        C1163250gNP c1163250gNP = EnumC1163260gNQ.Companion;
        String str = (String) this.LLIZ.getValue();
        c1163250gNP.getClass();
        Iterator<EnumC1163260gNQ> it2 = EnumC1163260gNQ.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                String value = next.getValue();
                Locale locale = Locale.ROOT;
                if (Intrinsics.LJFF(value.toLowerCase(locale), str.toLowerCase(locale))) {
                    break;
                }
            } else {
                next = EnumC1163260gNQ.DEFAULT;
                break;
            }
        }
        C723850SaN.LIZ(this, false, null, new AwS384S0200000_18(this, next, 31), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getContext().setTheme(R.style.y0);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bd2, viewGroup, false);
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
