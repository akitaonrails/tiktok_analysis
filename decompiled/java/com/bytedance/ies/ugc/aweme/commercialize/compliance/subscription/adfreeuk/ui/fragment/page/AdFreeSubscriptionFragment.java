package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page;

import X.C098200Yq;
import X.C0TOM;
import X.C0TOS;
import X.C0TQ7;
import X.C0TSA;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20515215Pi;
import X.C20684815ws;
import X.C2344009Gk;
import X.C745720TNa;
import X.C746100TOm;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import Y.AObserverS177S0200000_12;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.BenefitsResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.Description;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.AdFreeSubscriptionFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class AdFreeSubscriptionFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSM6KSsvLGEgPSc/Kj06HELIOSODElJiF9KSEqOyo2PS5iPCZ9LjctLiI2JjFiOS40LWsNLQkhLSAfPC0gKzclOTs6JysKOy40JSAiPQ==";
    public SubscriptionVM LLIZ;
    public AdFreeSubscription LLIZLLLIL;
    public SubscriptionStatusInfo LLJ;
    public SubscriptionInfo LLJI;
    public TuxNavBar LLJIJIL;
    public TuxTextView LLJILJIL;
    public ViewGroup LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public C197039127h LLJJI;
    public long LLJJIII;
    public Integer LLJJIJI;
    public C20515215Pi LLJJIJIIJIL;
    public int LLJJIJIL = 4;

    public final void UR() {
        String string;
        SubscriptionInfo subscriptionInfo;
        OfferInfo offerInfo;
        Description description;
        String str;
        OfferInfo offerInfo2;
        SubscriptionVM subscriptionVM = this.LLIZ;
        if (subscriptionVM != null) {
            subscriptionVM.zQ2();
        }
        AdFreeSubscription adFreeSubscription = this.LLIZLLLIL;
        SubscriptionStatusInfo subscriptionStatusInfo = adFreeSubscription != null ? adFreeSubscription.subscriptionStatusInfo : null;
        this.LLJ = subscriptionStatusInfo;
        this.LLJI = subscriptionStatusInfo != null ? subscriptionStatusInfo.subscriptionInfo : null;
        TuxNavBar tuxNavBar = this.LLJIJIL;
        if (tuxNavBar != null) {
            C1250250idj c1250250idj = new C1250250idj();
            SubscriptionInfo subscriptionInfo2 = this.LLJI;
            if (subscriptionInfo2 == null || (offerInfo2 = subscriptionInfo2.offerInfo) == null || (str = offerInfo2.offerName) == null) {
                str = "";
            }
            c1250250idj.LIZJ = str;
            tuxNavBar.LJIJJ(c1250250idj);
        }
        Context context = getContext();
        if (context != null && (subscriptionInfo = this.LLJI) != null && (offerInfo = subscriptionInfo.offerInfo) != null && (description = offerInfo.offerDescription) != null && !TextUtils.isEmpty(description.description)) {
            TuxTextView tuxTextView = this.LLJILJIL;
            if (tuxTextView != null) {
                C746100TOm c746100TOm = C746100TOm.LIZ;
                String str2 = description.description;
                List<String> list = description.hyperText;
                List<String> list2 = description.hyperLink;
                Integer numValueOf = Integer.valueOf(R.attr.a1j);
                Boolean bool = Boolean.TRUE;
                c746100TOm.getClass();
                tuxTextView.setText(C746100TOm.LIZLLL(context, str2, list, list2, numValueOf, bool));
            }
            TuxTextView tuxTextView2 = this.LLJILJIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        TuxTextView tuxTextView3 = this.LLJILLL;
        SubscriptionInfo subscriptionInfo3 = this.LLJI;
        String str3 = subscriptionInfo3 != null ? subscriptionInfo3.startTimestampText : null;
        String string2 = getString(2131847682);
        SubscriptionInfo subscriptionInfo4 = this.LLJI;
        SR(tuxTextView3, str3, string2, subscriptionInfo4 != null ? subscriptionInfo4.startTimestamp : null);
        TuxTextView tuxTextView4 = this.LLJJ;
        SubscriptionInfo subscriptionInfo5 = this.LLJI;
        String str4 = subscriptionInfo5 != null ? subscriptionInfo5.expireTimestampText : null;
        String string3 = getString(2131847681);
        SubscriptionInfo subscriptionInfo6 = this.LLJI;
        SR(tuxTextView4, str4, string3, subscriptionInfo6 != null ? subscriptionInfo6.expireTimestamp : null);
        SubscriptionStatusInfo subscriptionStatusInfo2 = this.LLJ;
        if (subscriptionStatusInfo2 == null || !Intrinsics.LJFF(subscriptionStatusInfo2.isCanceled(), Boolean.FALSE)) {
            return;
        }
        C197039127h c197039127h = this.LLJJI;
        if (c197039127h != null) {
            SubscriptionInfo subscriptionInfo7 = this.LLJI;
            if (subscriptionInfo7 == null || (string = subscriptionInfo7.cancelSubscriptionButtonText) == null) {
                string = getString(2131847679);
            }
            c197039127h.setText(string);
            C786410Ut5.U8(c197039127h, new ACListenerS147S0100000_12(this, 241));
        }
        C197039127h c197039127h2 = this.LLJJI;
        if (c197039127h2 != null) {
            C786410Ut5.LLLLLLJ(c197039127h2, 0);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C20515215Pi c20515215Pi = this.LLJJIJIIJIL;
        if (c20515215Pi != null) {
            c20515215Pi.LIZIZ();
        }
        this.LLJJIJIIJIL = null;
        C0TOS.LIZ.getClass();
        C0TOS.LIZLLL = null;
        super.onDestroyView();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numValueOf;
        MutableLiveData<BenefitsResponse> mutableLiveData;
        MutableLiveData<SubscriptionStatusResponse> mutableLiveData2;
        NR(AFwS245S0000000_12.get$arr$(60));
        super.onViewCreated(view, bundle);
        this.LLIZ = C0TQ7.LIZ(requireActivity());
        C0TOM.LIZ.getClass();
        this.LLIZLLLIL = C0TOM.LJ();
        Bundle arguments = getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("enter_from"));
        } else {
            numValueOf = null;
        }
        this.LLJJIJI = numValueOf;
        getParentFragmentManager().LLIIIJ("show_cancel_dialog", getViewLifecycleOwner(), new C0TSA() { // from class: X.0TNX
            @Override // X.C0TSA
            public final void LIZ(Bundle bundle2, String str) {
                AdFreeSubscriptionFragment adFreeSubscriptionFragment = this.LIZ;
                adFreeSubscriptionFragment.getClass();
                ComplianceServiceProvider.LJJI().LJIJJLI(new C745720TNa(adFreeSubscriptionFragment), 0);
                AdFreeSubscriptionFragment adFreeSubscriptionFragment2 = this.LIZ;
                Context context = adFreeSubscriptionFragment2.getContext();
                if (context != null) {
                    C1397580mTM c1397580mTM = new C1397580mTM(context);
                    c1397580mTM.LJIILIIL = 0;
                    c1397580mTM.LJI(adFreeSubscriptionFragment2.getString(2131857215));
                    c1397580mTM.LIZIZ(adFreeSubscriptionFragment2.getString(2131857214));
                    C985403tE.LIZ(c1397580mTM, new AwS591S0100000_12(adFreeSubscriptionFragment2, 976));
                    c1397580mTM.LIZLLL(new AwS591S0100000_12(context, 977));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                }
            }
        });
        this.LLJIJIL = (TuxNavBar) view.findViewById(R.id.p15);
        this.LLJILJIL = (TuxTextView) view.findViewById(R.id.y_p);
        this.LLJILJILJ = (ViewGroup) view.findViewById(R.id.bw0);
        this.LLJILLL = (TuxTextView) view.findViewById(R.id.wkk);
        this.LLJJ = (TuxTextView) view.findViewById(R.id.wiy);
        this.LLJJI = (C197039127h) view.findViewById(R.id.db1);
        TuxNavBar tuxNavBar = this.LLJIJIL;
        if (tuxNavBar != null) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZJ(new AwS556S0100000_12(this, 860));
            tuxNavBar.LIZIZ(c1251150ifB);
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_question_mark_circle_ltr;
            c1251150ifB2.LIZJ(new AwS556S0100000_12(tuxNavBar, 861));
            tuxNavBar.LIZ(c1251150ifB2);
            tuxNavBar.LJIIZILJ(false);
            tuxNavBar.setNavBackground(0);
        }
        C0TOS.LIZ.getClass();
        C0TOS.LIZLLL = new WeakReference<>(this);
        Context context = getContext();
        if (context != null) {
            SubscriptionVM subscriptionVM = this.LLIZ;
            if (subscriptionVM != null && (mutableLiveData2 = subscriptionVM.LLILLJJLI) != null) {
                mutableLiveData2.observe(getViewLifecycleOwner(), new AObserverS177S0200000_12(this, context, 41));
            }
            SubscriptionVM subscriptionVM2 = this.LLIZ;
            if (subscriptionVM2 != null && (mutableLiveData = subscriptionVM2.LLILLL) != null) {
                mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS177S0200000_12(this, context, 42));
            }
        }
        UR();
        ComplianceServiceProvider.LJJI().LJIJJLI(new C745720TNa(this), 0);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(this.LLJJIJI, "enter_from");
        C20684815ws.LJIILLIIL("show_ttadfree_page", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bfa, viewGroup, false);
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

    public final void SR(TuxTextView tuxTextView, String str, String str2, Integer num) {
        Context context = getContext();
        if (context != null && num != null && num.intValue() > 0) {
            int iIntValue = num.intValue();
            if (tuxTextView != null) {
                C746100TOm c746100TOm = C746100TOm.LIZ;
                if (str == null) {
                    str = str2;
                }
                c746100TOm.getClass();
                tuxTextView.setText(C746100TOm.LJ(context, iIntValue, str, "{%s}"));
            }
        }
    }
}
