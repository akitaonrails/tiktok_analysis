package com.ss.android.ugc.aweme.compliance.privacy.checkup;

import X.C098200Yq;
import X.C1258004w6;
import X.C1308910kAL;
import X.C13LP;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20277814Wa;
import X.C306560Bzy;
import X.C786410Ut5;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class CheckupContainerFragment extends Fragment implements InterfaceC21503819Do {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODclHELIOSPy4wMWsvISowIzA8Zww7LSYnPD8QJys4KCY9LTcKOy40JSAiPQ==";
    public final List<Function0<Fragment>> LL = new ArrayList();

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
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
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final void MR() {
        Fragment fragment;
        Function0 function0 = (Function0) C13LP.LJJJLZIJ(getChildFragmentManager().LJJLIIIIJ(), this.LL);
        if (function0 == null || (fragment = (Fragment) function0.invoke()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIIJZLJL(bundle, getArguments());
        fragment.setArguments(bundle);
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJJLI(R.anim.fv, R.anim.g0, R.anim.ft, R.anim.g2);
        c19ehLJIIJ.LJIJ(R.id.tsc, fragment, null);
        c19ehLJIIJ.LJII(null);
        c19ehLJIIJ.LJIIJ();
    }

    public final void NR() {
        if (getChildFragmentManager().LJJLIIIIJ() > 1) {
            getChildFragmentManager().LJLLILLLL();
            return;
        }
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        CheckupBasePageFragment checkupBasePageFragment;
        Fragment fragmentLJJJJZ = getChildFragmentManager().LJJJJZ(R.id.tsc);
        if ((fragmentLJJJJZ instanceof CheckupBasePageFragment) && (checkupBasePageFragment = (CheckupBasePageFragment) fragmentLJJJJZ) != null) {
            if (checkupBasePageFragment.NR(getChildFragmentManager().LJJLIIIIJ() <= 1)) {
                return;
            }
        }
        NR();
    }

    @Override // X.InterfaceC21503819Do
    public final void Q9(Activity activity) {
        if (activity != null) {
            activity.setTheme(R.style.my);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.zp);
        tuxImmersionBarLIZLLL.LJ(R.attr.zp);
        tuxImmersionBarLIZLLL.LIZLLL();
        C19EG activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            intent.putExtra("activity_translation_type", 7);
        }
        List<Function0<Fragment>> list = this.LL;
        C1258004w6.LIZ.getClass();
        if (C1258004w6.LIZ() == 3 || C1258004w6.LIZ() == 4) {
            ((ArrayList) list).add(AFwS217S0000000_28.get$arr$(124));
        }
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(AFwS217S0000000_28.get$arr$(125));
        if (!C306560Bzy.LIZ()) {
            arrayList.add(AFwS217S0000000_28.get$arr$(126));
        }
        arrayList.add(AFwS217S0000000_28.get$arr$(127));
        arrayList.add(AFwS217S0000000_28.get$arr$(128));
        MR();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        FrameLayout frameLayout = new FrameLayout(requireContext());
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setId(R.id.tsc);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
