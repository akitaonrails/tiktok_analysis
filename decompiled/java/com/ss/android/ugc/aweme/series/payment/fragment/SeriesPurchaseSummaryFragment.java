package com.ss.android.ugc.aweme.series.payment.fragment;

import X.AbstractC431340Gvk;
import X.C013C;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11NJ;
import X.C1237320iIs;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C13LP;
import X.C1576640r8A;
import X.C1612240s3a;
import X.C1612700s4K;
import X.C1613640s5q;
import X.C1613940s6K;
import X.C1617190sBZ;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C1848410yCV;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C338490DOt;
import X.C431300Gvg;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C498480Jgk;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C844470XAv;
import X.C987103tV;
import X.EnumC1913590ztd;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS158S0100000_24;
import Y.ACListenerS57S0400000_24;
import Y.AObserverS222S0100000_18;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import avg.f;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil;
import com.ss.android.ugc.aweme.PrivacyDisclaimerUtilService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.series.payment.viewmodel.SeriesDetailPurchaseViewModel;
import com.ss.android.ugc.aweme.series.payment.viewmodel.SeriesPurchaseSummaryViewModel;
import com.ss.android.ugc.aweme.service.ISeriesPricingService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import mf.a;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesPurchaseSummaryFragment extends BaseFragment implements InterfaceC344240DeY, InterfaceC724530SbT {
    public static final C1613640s5q LLJJJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2s8KDY+LSs4HELIOSZykhKSIhLCEnZhYpOyY2OxU5Oyw7KTYpGjo+JSQ+MAkhKSIhLCEn";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1049));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1042));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1050));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1051));
    public final AssemVMLazy LLJIJIL;
    public final C11NJ LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public C197039127h LLJILLL;
    public SmartImageView LLJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public FrameLayout LLJJJ;
    public TuxTextView LLJJJIL;
    public C1237320iIs LLJJJJ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0s5q] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeriesPurchaseSummaryFragment.class, "purchaseViewModel", "getPurchaseViewModel()Lcom/ss/android/ugc/aweme/series/payment/viewmodel/SeriesDetailPurchaseViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(SeriesPurchaseSummaryFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/series/payment/viewmodel/SeriesPurchaseSummaryViewModel;", 0)};
        LLJJJJJIL = new Object() { // from class: X.0s5q
        };
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public SeriesPurchaseSummaryFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeriesDetailPurchaseViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 1043);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(323);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1044), aFwS264S0000000_24, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS568S0100000_24((Fragment) this, 1045), aFwS264S0000000_24, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1046), aFwS264S0000000_24, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJIJIL = assemVMLazy;
        this.LLJILJIL = new C11NJ();
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SeriesPurchaseSummaryViewModel.class);
        this.LLJILJILJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), new AwS568S0100000_24(c19719912DlLIZ2, 1047), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1048), AFwS264S0000000_24.get$arr$(324));
    }

    public final C1612240s3a SR() {
        return (C1612240s3a) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getResources().getString(2131847495);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS568S0100000_24(this, 1041));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        return c0om1;
    }

    public final C1612700s4K UR() {
        return (C1612700s4K) this.LLIZ.getValue();
    }

    public final SeriesPurchaseSummaryViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (SeriesPurchaseSummaryViewModel) assemVMLazy.getValue();
    }

    public final void WR() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        C1237320iIs c1237320iIs = this.LLJJJJ;
        if (c1237320iIs == null || (viewPropertyAnimatorAnimate = c1237320iIs.animate()) == null) {
            return;
        }
        viewPropertyAnimatorAnimate.setListener(null);
        viewPropertyAnimatorAnimate.cancel();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLJILJIL.dispose();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Boolean bool;
        Integer num;
        String strLIZ;
        View viewFindViewById;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        C197039127h c197039127h;
        final int iIntValue;
        final int iIntValue2;
        Context context;
        Integer numLIZJ;
        Context context2;
        Integer numLIZJ2;
        TextView textView;
        String str2;
        UrlModel urlModel;
        List<String> urlList;
        super.onViewCreated(view, bundle);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.0s5Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159080gGg) obj).LL;
            }
        }, null, new AwS638S0100000_24(this, 81), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.0s5Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159080gGg) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 82), 4);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.0s5a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159080gGg) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 83), 4);
        this.LLJJ = (SmartImageView) view.findViewById(R.id.e7c);
        this.LLJJI = (TuxTextView) view.findViewById(R.id.e7m);
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.e7r);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.e7p);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.e7q);
        this.LLJJIJIL = (LinearLayout) view.findViewById(R.id.e7o);
        this.LLJJJ = (FrameLayout) view.findViewById(R.id.e7l);
        this.LLJJJIL = (TuxTextView) view.findViewById(R.id.e7s);
        this.LLJJJJ = (C1237320iIs) view.findViewById(R.id.wp3);
        C1612240s3a c1612240s3aSR = SR();
        if (c1612240s3aSR != null) {
            PriceInfo priceInfo = c1612240s3aSR.priceInfo;
            if (priceInfo != null) {
                SeriesPurchaseSummaryViewModel seriesPurchaseSummaryViewModelVR = VR();
                List<C1617190sBZ> listSingletonList = Collections.singletonList(new C1617190sBZ(c1612240s3aSR.collectionId, priceInfo, c1612240s3aSR.discountedPriceInfo, c1612240s3aSR.singleVideoPriceInfo));
                ISeriesPricingService.LIZ.getClass();
                ISeriesPricingService iSeriesPricingServiceLIZ = C1613940s6K.LIZ();
                if (iSeriesPricingServiceLIZ != null) {
                    C844470XAv.LIZ.getClass();
                    LiveData<Map<Long, C1576640r8A>> liveDataLIZJ = iSeriesPricingServiceLIZ.LIZJ(C844470XAv.LIZ(), listSingletonList);
                    if (liveDataLIZJ != null) {
                        liveDataLIZJ.observe(this, new AObserverS222S0100000_18(seriesPurchaseSummaryViewModelVR, 36));
                    }
                }
            }
            VR().LL = c1612240s3aSR.collectionId;
        }
        C1612240s3a c1612240s3aSR2 = SR();
        if (c1612240s3aSR2 == null || (urlModel = c1612240s3aSR2.collectionCover) == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
            str = "";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(this.LLJJ);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        TuxTextView tuxTextView = this.LLJJI;
        TextView textView2 = null;
        if (tuxTextView != null) {
            C1612240s3a c1612240s3aSR3 = SR();
            if (c1612240s3aSR3 != null) {
                str2 = c1612240s3aSR3.collectionName;
            } else {
                str2 = null;
            }
            tuxTextView.setText(str2);
        }
        C1612240s3a c1612240s3aSR4 = SR();
        if (c1612240s3aSR4 != null) {
            bool = c1612240s3aSR4.hasVoucher;
        } else {
            bool = null;
        }
        C1612240s3a c1612240s3aSR5 = SR();
        if (c1612240s3aSR5 != null) {
            num = c1612240s3aSR5.numWatched;
        } else {
            num = null;
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            LinearLayout linearLayout = this.LLJJIJIL;
            if (linearLayout != null) {
                C786410Ut5.LJLLLLLL(0, linearLayout);
            }
            FrameLayout frameLayout = this.LLJJJ;
            if (frameLayout != null) {
                C786410Ut5.LJLLLLLL(0, frameLayout);
            }
        } else if (num != null && num.intValue() > 100 && (strLIZ = C498480Jgk.LIZ(num.intValue())) != null) {
            TuxTextView tuxTextView2 = this.LLJJJIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(u.LJJIFFI(getResources().getString(2131847402), "%d", strLIZ, false));
            }
            TuxTextView tuxTextView3 = this.LLJJJIL;
            if (tuxTextView3 != null) {
                C786410Ut5.LJLLLLLL(0, tuxTextView3);
            }
            FrameLayout frameLayout2 = this.LLJJJ;
            if (frameLayout2 != null) {
                C786410Ut5.LJLLLLLL(0, frameLayout2);
            }
        }
        View view2 = getView();
        if (view2 != null) {
            viewFindViewById = view2.findViewById(R.id.t2c);
        } else {
            viewFindViewById = null;
        }
        View view3 = getView();
        if (view3 != null) {
            tuxIconView = (TuxIconView) view3.findViewById(R.id.k4t);
        } else {
            tuxIconView = null;
        }
        View view4 = getView();
        if (view4 != null) {
            tuxIconView2 = (TuxIconView) view4.findViewById(R.id.k4s);
        } else {
            tuxIconView2 = null;
        }
        View view5 = getView();
        if (view5 != null && (textView = (TextView) view5.findViewById(R.id.unlimited_access_text)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(textView.getResources().getString(2131847493));
            sbLIZ.append(" · ");
            sbLIZ.append(textView.getResources().getString(2131847496));
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C013C c013c = new C013C();
        if (viewFindViewById != null) {
            View.OnClickListener aCListenerS57S0400000_24 = new ACListenerS57S0400000_24(c013c, this, tuxIconView, tuxIconView2, 0);
            if (C1848410yCV.LIZ) {
                aCListenerS57S0400000_24 = new f(aCListenerS57S0400000_24);
            }
            a aVar = new a(aCListenerS57S0400000_24);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(viewFindViewById);
            }
            viewFindViewById.setOnClickListener(aVar);
        }
        View view6 = getView();
        if (view6 != null) {
            c197039127h = (C197039127h) view6.findViewById(R.id.wp0);
        } else {
            c197039127h = null;
        }
        this.LLJILLL = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS158S0100000_24(this, 122));
        }
        View view7 = getView();
        if (view7 != null) {
            textView2 = (TextView) view7.findViewById(R.id.woz);
        }
        String string = getResources().getString(2131847501);
        String string2 = getResources().getString(2131847502, string);
        View view8 = getView();
        if (view8 != null && (context2 = view8.getContext()) != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context2)) != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = 0;
        }
        View view9 = getView();
        if (view9 != null && (context = view9.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
            iIntValue2 = numLIZJ.intValue();
        } else {
            iIntValue2 = 0;
        }
        AbstractC431340Gvk abstractC431340Gvk = new AbstractC431340Gvk(iIntValue, iIntValue2) { // from class: X.0s5H
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view10) {
                IPrivacyDisclaimerUtil iPrivacyDisclaimerUtilLJFF = PrivacyDisclaimerUtilService.LJFF();
                view10.getContext();
                iPrivacyDisclaimerUtilLJFF.LIZ();
            }

            @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                C444890HcV c444890HcV = new C444890HcV();
                c444890HcV.LIZ(82);
                textPaint.setTypeface(c444890HcV.getTypeface());
                textPaint.setUnderlineText(false);
            }
        };
        int iLJJJ = a0.LJJJ(string2, string, 0, false, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk, iLJJJ, string.length() + iLJJJ, 34);
        if (textView2 != null) {
            textView2.setHighlightColor(0);
            textView2.setText(spannableStringBuilder);
            textView2.setMovementMethod(C431300Gvg.LIZ());
        }
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            EnumC1913590ztd.VIDEO_GIFT.getValue();
            iCompliancePolicyServiceLJIIIIZZ.LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bho, viewGroup, false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
