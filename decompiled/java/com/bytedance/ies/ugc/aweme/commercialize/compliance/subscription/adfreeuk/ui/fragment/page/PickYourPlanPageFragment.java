package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page;

import X.C098200Yq;
import X.C0TOS;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390410mHn;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C745910TNt;
import X.C746110TOn;
import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
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
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class PickYourPlanPageFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSM6KSsvLGEgPSc/KjHELIOS06ODElJiF9KSEqOyo2PS5iPCZ9LjctLiI2JjFiOS40LWscICw4ESo5Ox8/KSscKCg2DjctLiI2JjE=";
    public Integer LLILLJJLI;
    public SubscriptionVM LLILLL;
    public PersonalizationViewModel LLILZ;
    public AdFreeSubscription LLILZIL;
    public SubscriptionInfo LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public PickYourAdPlanPage LLJ;
    public TuxNavBar LLJI;
    public TuxTextView LLJIJIL;
    public RecyclerView LLJILJIL;
    public C745910TNt LLJILJILJ;
    public TuxTextView LLJILLL;
    public C197039127h LLJJ;
    public C197039127h LLJJI;
    public boolean LLJJIII;
    public C1390410mHn LLJJIJI;
    public View LLJJIJIIJIL;
    public long LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public Integer LLJJJJLIIL;
    public TuxSheet LLJJLIIIJLLLLLLLZ;
    public final MutableLiveData<Integer> LL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJJIJIL = new MutableLiveData<>();
    public boolean LLJJJJJIL = true;
    public final MutableLiveData<IapProductDetail> LLJJL = new MutableLiveData<>();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        List<OfferInfo> offerInfo;
        PickYourAdPlanPage pickYourAdPlanPage = this.LLJ;
        if (pickYourAdPlanPage != null && (offerInfo = pickYourAdPlanPage.getOfferInfo()) != null) {
            Iterator<OfferInfo> it2 = offerInfo.iterator();
            while (it2.hasNext()) {
                it2.next().setSelected(false);
            }
        }
        this.LLILLJJLI = null;
        this.LLJJJIL = false;
        this.LLJJJJ = false;
        super.onDestroyView();
        C0TOS.LIZ.getClass();
        C0TOS.LIZJ = null;
        this.LLJJLIIIJLLLLLLLZ = null;
    }

    public final void NR(boolean z) {
        Intent intent;
        AdFreeTrialPageInfo adFreeTrialPageInfo;
        AdFreeTrialPageInfo adFreeTrialPageInfo2;
        boolean zLJFF;
        int iIntValue;
        Integer preTickingSelection;
        Context context = getContext();
        if (context == null) {
            return;
        }
        this.LLJJJJJIL = false;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(this.LLJJJJLIIL, "enter_from");
        c2344009Gk.LIZJ(z ? 1 : 0, "click_value");
        c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLJJJ, "stay_time");
        if (this.LLJJIII) {
            PickYourAdPlanPage pickYourAdPlanPage = this.LLJ;
            if (pickYourAdPlanPage != null) {
                zLJFF = Intrinsics.LJFF(pickYourAdPlanPage.isSkippable(), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            c2344009Gk.LJ(Boolean.valueOf(zLJFF), "is_skippable");
            PickYourAdPlanPage pickYourAdPlanPage2 = this.LLJ;
            if (pickYourAdPlanPage2 != null && (preTickingSelection = pickYourAdPlanPage2.getPreTickingSelection()) != null) {
                iIntValue = preTickingSelection.intValue();
            } else {
                iIntValue = 0;
            }
            c2344009Gk.LIZJ(iIntValue, "design_type");
            c2344009Gk.LIZJ(this.LLIZLLLIL, "prompt_type");
        }
        C20684815ws.LJIILLIIL("exit_ttadfree_pickplan", c2344009Gk.LIZ);
        String stringExtra = null;
        if (this.LLJJIII) {
            TuxSheet tuxSheet = this.LLJJLIIIJLLLLLLLZ;
            if (tuxSheet != null) {
                tuxSheet.dismiss();
            }
            if (!z) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                c1389890mGx.LJII(R.attr.a1h);
                c1389890mGx.LJIIIZ(2131848762);
                c1389890mGx.LIZLLL(2000L);
                c1389890mGx.LJIIJJI();
                return;
            }
            AdFreeSubscription adFreeSubscription = this.LLILZIL;
            if (adFreeSubscription != null) {
                adFreeTrialPageInfo2 = adFreeSubscription.completePaymentWelcomePage;
            } else {
                adFreeTrialPageInfo2 = null;
            }
            C746110TOn.LIZ(c19egLIZIZ, adFreeTrialPageInfo2, null);
            return;
        }
        if (z) {
            C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJJLI(R.anim.fn, R.anim.fo, R.anim.fm, R.anim.fp);
            AdFreeSubscriptionFragment adFreeSubscriptionFragment = new AdFreeSubscriptionFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("enter_from", 0);
            adFreeSubscriptionFragment.setArguments(bundle);
            c19ehLJIIJ.LJIJ(R.id.iiv, adFreeSubscriptionFragment, null);
            c19ehLJIIJ.LJII(null);
            c19ehLJIIJ.LJIIIZ();
            AdFreeSubscription adFreeSubscription2 = this.LLILZIL;
            if (adFreeSubscription2 != null) {
                adFreeTrialPageInfo = adFreeSubscription2.completePaymentWelcomePage;
            } else {
                adFreeTrialPageInfo = null;
            }
            C746110TOn.LIZ(c19egLIZIZ, adFreeTrialPageInfo, null);
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//commercialize/compliance/personalization/ads_page");
        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ2 != null && (intent = c19egLIZIZ2.getIntent()) != null) {
            try {
                stringExtra = intent.getStringExtra("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        smartRouteBuildRoute.withParam("enter_from", stringExtra);
        smartRouteBuildRoute.open();
        C19EG c19egLIZIZ3 = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ3 == null) {
            return;
        }
        c19egLIZIZ3.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MR(int r19, kotlin.jvm.functions.Function0<kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.PickYourPlanPageFragment.MR(int, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03d8 A[PHI: r8
      0x03d8: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v9 java.lang.String) binds: [B:199:0x03d4, B:26:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Type inference failed for: r4v50, types: [X.0TNx] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.PickYourPlanPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bfh, viewGroup, false);
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
