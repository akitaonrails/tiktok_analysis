package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription;

import X.C098200Yq;
import X.C0TNG;
import X.C0TO6;
import X.C1390410mHn;
import X.C13LP;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class SubscriptionPage extends Fragment {
    public static C0TNG LLJJIJIL = null;
    public static Integer LLJJJ = null;
    public static TuxSheet LLJJJIL = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9HELIOSKyohOSM6KSsvLGEgPSc/Kj06ODElJiF9GzAuOiwhITU4ICA9GCQrLA==";
    public PickYourAdPlanPage LL;
    public Context LLILLJJLI;
    public OfferInfo LLILZ;
    public OfferInfo LLILZIL;
    public SubscriptionVM LLILZLL;
    public PersonalizationViewModel LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public RecyclerView LLJI;
    public C0TO6 LLJIJIL;
    public TuxTextView LLJILJIL;
    public C197039127h LLJILJILJ;
    public C197039127h LLJILLL;
    public View LLJJ;
    public C1390410mHn LLJJI;
    public long LLJJIJIIJIL;
    public final MutableLiveData<Integer> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJJIII = new MutableLiveData<>();
    public final MutableLiveData<IapProductDetail> LLJJIJI = new MutableLiveData<>();

    public final void MR(boolean z) {
        TuxSheet tuxSheet = LLJJJIL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        LLJJJIL = null;
        C0TNG c0tng = LLJJIJIL;
        if (c0tng != null) {
            c0tng.LIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List<OfferInfo> offerInfo;
        OfferInfo offerInfo2;
        List<OfferInfo> offerInfo3;
        OfferInfo offerInfo4;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            PickYourAdPlanPage pickYourAdPlanPage = (PickYourAdPlanPage) arguments.getParcelable("page_data");
            this.LL = pickYourAdPlanPage;
            if (pickYourAdPlanPage != null && (offerInfo3 = pickYourAdPlanPage.getOfferInfo()) != null && (offerInfo4 = (OfferInfo) C13LP.LJJJLZIJ(0, offerInfo3)) != null) {
                this.LLILZ = offerInfo4;
            }
            PickYourAdPlanPage pickYourAdPlanPage2 = this.LL;
            if (pickYourAdPlanPage2 != null && (offerInfo = pickYourAdPlanPage2.getOfferInfo()) != null && (offerInfo2 = (OfferInfo) C13LP.LJJJLZIJ(1, offerInfo)) != null) {
                this.LLILZIL = offerInfo2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0492  */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.0TO5] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v122 */
    /* JADX WARN: Type inference failed for: r4v123 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v41, types: [X.09Gk] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.String] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r53, android.os.Bundle r54) {
        /*
            Method dump skipped, instruction units count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bff, viewGroup, false);
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
