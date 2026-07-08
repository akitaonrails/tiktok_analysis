package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class StandardPlanPageFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSM6KSsvLGEgPSc/KjHELIOS06ODElJiF9KSEqOyo2PS5iPCZ9LjctLiI2JjFiOS40LWsfPS49LCQ+LR8/KSscKCg2DjctLiI2JjE=";
    public ViewGroup LLIZ;
    public TuxNavBar LLIZLLLIL;
    public ViewGroup LLJ;
    public ImageView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public ViewGroup LLJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public ViewGroup LLJJIJI;
    public C197039127h LLJJIJIIJIL;

    /* JADX WARN: Removed duplicated region for block: B:101:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d5 A[ADDED_TO_REGION, LOOP:1: B:83:0x02d5->B:87:0x02eb, LOOP_START, PHI: r11
      0x02d5: PHI (r11v4 int) = (r11v3 int), (r11v5 int) binds: [B:55:0x0211, B:87:0x02eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0304  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 1059
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.StandardPlanPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bf_, viewGroup, false);
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
