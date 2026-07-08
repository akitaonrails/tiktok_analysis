package com.bytedance.ies.ugc.aweme.commercialize.compliance.ata;

import X.C098200Yq;
import X.C1022820ciu;
import X.C1391190mJ3;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2184171Adz;
import X.C343970De7;
import X.C786410Ut5;
import X.EnumC1913590ztd;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.StaticAdExplainDialog;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes13.dex */
public final class StaticAdExplainDialog extends Fragment implements View.OnClickListener {
    public static TuxSheet LLILZLL = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklHELIOSMyp9KyohOSM6KSsvLGEyPCRiGjsyPCwvCCsWMDUgKCY9DCwtJSA0";
    public RelativeLayout LL;
    public TuxTextView LLILLJJLI;
    public AwemeRawAd LLILLL;
    public String LLILZ;
    public C19EG LLILZIL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        Long creativeId;
        String logExtra;
        String str;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null && numValueOf.intValue() == R.id.q_p) {
            String str2 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
            AwemeRawAd awemeRawAd = this.LLILLL;
            if (awemeRawAd != null) {
                creativeId = awemeRawAd.getCreativeId();
            } else {
                creativeId = null;
            }
            String strValueOf = String.valueOf(creativeId);
            AwemeRawAd awemeRawAd2 = this.LLILLL;
            if (awemeRawAd2 != null) {
                logExtra = awemeRawAd2.getLogExtra();
            } else {
                logExtra = null;
            }
            C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("pa_info_page", "otherclick", strValueOf, logExtra, null);
            c1022820ciuLJ.LIZJ("button", "refer");
            c1022820ciuLJ.LJII();
            if (u.LJIJI(this.LLILZ, "long_press", false)) {
                str = "ads_long_press";
            } else {
                str = "ads_share_panel";
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "//privacy/setting/ad_personalization");
            smartRouteBuildRoute.withParam("enter_from", str);
            smartRouteBuildRoute.open();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        if (!ComplianceServiceProvider.LJIILIIL().LJIIJJI() && !((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).isGuestMode()) {
            z = false;
        } else {
            z = true;
        }
        View viewFindViewById = null;
        if (z) {
            View viewFindViewById2 = this.LL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.q_p);
                } else {
                    viewFindViewById2 = null;
                }
                this.LL = (RelativeLayout) viewFindViewById2;
            }
            C786410Ut5.LLIIL((RelativeLayout) viewFindViewById2, 0);
        }
        View viewFindViewById3 = this.LL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.q_p);
            } else {
                viewFindViewById3 = null;
            }
            this.LL = (RelativeLayout) viewFindViewById3;
        }
        C786410Ut5.S7((RelativeLayout) viewFindViewById3, this);
        C19EG c19eg = this.LLILZIL;
        if (c19eg == null) {
            c19eg = null;
        }
        String string = C786410Ut5.P3(c19eg).getString(2131834538);
        C19EG c19eg2 = this.LLILZIL;
        if (c19eg2 == null) {
            c19eg2 = null;
        }
        String string2 = C786410Ut5.P3(c19eg2).getString(2131834541);
        View viewFindViewById4 = this.LLILLJJLI;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.a8e);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILLJJLI = (TuxTextView) viewFindViewById4;
        }
        TextView textView = (TextView) viewFindViewById4;
        int iLJJJ = a0.LJJJ(string, string2, 0, false, 6);
        if (iLJJJ == -1) {
            new SpannableStringBuilder(string);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0TRT
            public final /* synthetic */ String LL = "privacy-policy";

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view5) {
                TuxSheet tuxSheet = StaticAdExplainDialog.LLILZLL;
                if (tuxSheet == null) {
                    tuxSheet = null;
                }
                tuxSheet.dismiss();
                ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
                if (iCompliancePolicyServiceLJIIIIZZ != null) {
                    iCompliancePolicyServiceLJIIIIZZ.LIZ(new C1913610ztf(EnumC1913590ztd.AD_EXPLANATION.getValue(), this.LL, false, true, false, null, false, 116), new InterfaceC1913620ztg() { // from class: X.0TRU
                        @Override // X.InterfaceC1913620ztg
                        public final void onComplete() {
                        }
                    });
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, iLJJJ, string2.length() + iLJJJ, 33);
        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, string2.length() + iLJJJ, 33);
        textView.setText(spannableStringBuilder);
        View view5 = this.LLILLJJLI;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById = view6.findViewById(R.id.a8e);
            }
            this.LLILLJJLI = (TuxTextView) viewFindViewById;
            view5 = viewFindViewById;
        }
        ((TextView) view5).setMovementMethod(LinkMovementMethod.getInstance());
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            EnumC1913590ztd.AD_EXPLANATION.getValue();
            iCompliancePolicyServiceLJIIIIZZ.LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bm3, viewGroup, false);
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
