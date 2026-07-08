package com.ss.android.ugc.aweme.favorites.business.collection.base;

import X.C098200Yq;
import X.C1388190mED;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C786410Ut5;
import X.InterfaceC21503819Do;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BasePage extends BaseFragment implements InterfaceC21503819Do {
    public static final int LLIZLLLIL = 8;
    public View LLIZ;

    public /* synthetic */ void FE(Bundle bundle) {
    }

    public /* synthetic */ void Q9(Activity activity) {
    }

    public /* synthetic */ void WK(boolean z) {
    }

    public abstract int WR();

    public void aS(Activity activity) {
    }

    public /* synthetic */ void ap() {
    }

    public /* synthetic */ void onActivityFinish() {
    }

    public /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    public /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    public /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return UR(this, layoutInflater, viewGroup, bundle);
    }

    public /* synthetic */ void qO(Intent intent) {
    }

    public final View ZR() {
        View view = this.LLIZ;
        if (view != null) {
            return view;
        }
        return null;
    }

    public void VR() {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public boolean bS() {
        VR();
        return true;
    }

    @Override // X.InterfaceC21503819Do
    public void tv() {
        if (bS()) {
            return;
        }
        C20277814Wa.LIZIZ(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS256S0000000_18.get$arr$(99));
        activityConfiguration(AFwS256S0000000_18.get$arr$(100));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Activity activityLIZ;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        aS(activityLIZ);
    }

    public View SR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LLIZ = C786410Ut5.Td(layoutInflater, WR(), viewGroup, false);
        return ZR();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.InterfaceC21503819Do
    public void ur(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    public static View UR(BasePage basePage, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewSR = basePage.SR(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewSR instanceof View)) {
            viewSR = null;
        }
        if (viewSR != null) {
            try {
                ViewTreeLifecycleOwner.set(viewSR, basePage.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewSR, basePage);
                viewSR.setTag(R.id.view_tree_saved_state_registry_owner, basePage);
                C19EG activity = basePage.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewSR;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewSR;
    }
}
