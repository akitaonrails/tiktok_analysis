package com.ss.android.ugc.aweme.toplive.assem.multi;

import X.C098200Yq;
import X.C13LP;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C842240X2g;
import X.EnumC1427810nG7;
import X.EnumC1668010tVX;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS195S1100000_19;

/* JADX INFO: loaded from: classes8.dex */
public final class HangoutPlayGuideDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjOSM6PiBiKDwgLSHELIOShiJDo/PCxiAS49Lyo5PR8/KTwLPCY3LQElKCM8LwM+KCg+LSs4";
    public Function0<Unit> LL;
    public Function0<Unit> LLILLJJLI;
    public EnumC1668010tVX LLILLL;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -1);
            window2.setBackgroundDrawable(new ColorDrawable(0));
            window2.addFlags(Integer.MIN_VALUE);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, android.R.style.Theme.Translucent.NoTitleBar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        List<String> listLIZ;
        ImageModel avatarMedium = UserService.getInstance().user().LJIJJLI().getAvatarMedium();
        C19GS c19gs = null;
        if (avatarMedium != null && (listLIZ = C842240X2g.LIZ(avatarMedium)) != null) {
            str = (String) C13LP.LJJJLL(listLIZ);
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-1051128646, new AwS195S1100000_19(this, str, 3), true));
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
