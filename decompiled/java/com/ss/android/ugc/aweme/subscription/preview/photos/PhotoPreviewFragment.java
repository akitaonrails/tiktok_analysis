package com.ss.android.ugc.aweme.subscription.preview.photos;

import X.C098200Yq;
import X.C11NJ;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C189200o6;
import X.C19201510Ab;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20088213iq;
import X.EnumC1427810nG7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: loaded from: classes29.dex */
public final class PhotoPreviewFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8JmHELIOSs8OyolISA7Zz87JzEjOmEDICo4Jh8hLTMlLDgVOiQrJCo9PA==";
    public final PhotoPreviewViewModel LL = new PhotoPreviewViewModel(0);
    public final C11NJ LLILLJJLI = new C11NJ();
    public C19201510Ab LLILLL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLILLJJLI.LJ();
        super.onDestroyView();
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5 A[PHI: r6
      0x00e5: PHI (r6v4 boolean) = (r6v3 boolean), (r6v9 boolean), (r6v9 boolean) binds: [B:52:0x00e1, B:21:0x003f, B:23:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.preview.photos.PhotoPreviewFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-1183413943, new AwS639S0100000_25(this, 58), true));
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
