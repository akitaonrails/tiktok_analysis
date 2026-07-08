package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page;

import X.C098200Yq;
import X.C1390410mHn;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C746100TOm;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.Description;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class AdFreeSubscriptionCancellation extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSM6KSsvLGEgPSc/Kj06ODHELIOSElJiF9KSEqOyo2PS5iPCZ9LjctLiI2JjFiOS40LWsNLQkhLSAfPC0gKzclOTs6JysPKCEwLSkgKDs6Jys=";
    public TuxNavBar LL;
    public ImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public ViewGroup LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public C197039127h LLJ;
    public SubscriptionVM LLJI;
    public C1390410mHn LLJIJIL;
    public final MutableLiveData<Boolean> LLJILJIL = new MutableLiveData<>();

    /* JADX WARN: Removed duplicated region for block: B:68:0x0187  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.AdFreeSubscriptionCancellation.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final SpannableStringBuilder MR(Context context, Description description, int i) {
        C746100TOm c746100TOm = C746100TOm.LIZ;
        String str = description.description;
        List<String> list = description.hyperText;
        List<String> list2 = description.hyperLink;
        Integer numValueOf = Integer.valueOf(i);
        Boolean bool = Boolean.TRUE;
        c746100TOm.getClass();
        return C746100TOm.LIZLLL(context, str, list, list2, numValueOf, bool);
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
