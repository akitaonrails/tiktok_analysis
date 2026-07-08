package com.ss.android.ugc.aweme.series.seriesdetail.assem;

import X.AbstractC431340Gvk;
import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C0PEM;
import X.C0XQ7;
import X.C1155930gBb;
import X.C11NJ;
import X.C11NZ;
import X.C11PQ;
import X.C1220000hqw;
import X.C123100dR;
import X.C1308910kAL;
import X.C1321405Fc;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389890mGx;
import X.C1390130mHL;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1573930r3n;
import X.C1576640r8A;
import X.C1606610ruV;
import X.C1611550s2T;
import X.C1611790s2r;
import X.C1611800s2s;
import X.C1612160s3S;
import X.C1612200s3W;
import X.C1612390s3p;
import X.C1612490s3z;
import X.C1612600s4A;
import X.C1613680s5u;
import X.C1613730s5z;
import X.C1613940s6K;
import X.C1614180s6i;
import X.C1614390s73;
import X.C1617190sBZ;
import X.C1637806bA;
import X.C1637906bB;
import X.C1701940uOG;
import X.C1893760zNe;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C1BWL;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C2502009rG;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427660Gpo;
import X.C431300Gvg;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C498480Jgk;
import X.C627660Ojc;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C757070Tmr;
import X.C786410Ut5;
import X.C788990UxF;
import X.C814420VxA;
import X.EnumC1612690s4J;
import X.EnumC1612760s4Q;
import X.EnumC1913590ztd;
import X.InterfaceC1611890s31;
import X.InterfaceC1612220s3Y;
import X.InterfaceC1614350s6z;
import X.InterfaceC2217461Bqa;
import X.InterfaceC500500Jk0;
import Y.ACListenerS126S0200000_24;
import Y.ACListenerS158S0100000_24;
import Y.ACListenerS85S0300000_19;
import Y.ACListenerS88S0300000_24;
import Y.AObserverS185S0200000_24;
import Y.AfS158S0200000_24;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil;
import com.ss.android.ugc.aweme.PrivacyDisclaimerUtilService;
import com.ss.android.ugc.aweme.anchor.service.IPaidContentAnchorAttachService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.feed.model.TvRatingInfo;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.refund.viewmodel.SeriesRefundRatingViewModel;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.ContinueStatus;
import com.ss.android.ugc.aweme.model.PaidContentVideoListResponse;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel;
import com.ss.android.ugc.aweme.series.payment.viewmodel.SeriesDetailPurchaseViewModel;
import com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel;
import com.ss.android.ugc.aweme.series.serieslist.viewmodel.SeriesListAssemViewModel;
import com.ss.android.ugc.aweme.series.voucher.utils.SeriesCountDownTimer;
import com.ss.android.ugc.aweme.series.voucher.viewmodel.SeriesVoucherClaimViewModel;
import com.ss.android.ugc.aweme.service.ISeriesPricingService;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import com.ss.android.ugc.aweme.service.MiniDramaPaymentService;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS20S0410000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesDetailDescriptionAssem extends UIContentAssem implements InterfaceC1614350s6z {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJIL;
    public TuxTextView LLIZLLLIL;
    public RoundedFrameLayout LLJ;
    public final C11PQ<C1613680s5u> LLJI = new C11PQ<>();
    public final C11PQ<C1576640r8A> LLJIJIL = new C11PQ<>();
    public final C11NJ LLJILJIL = new C11NJ();
    public final C1559260qg8 LLJILJILJ = new C1559260qg8(new C723590SZx(this, C1611800s2s.class, "paid_content_collection_detail_hierarchy_data_key"), checkSupervisorPrepared());
    public final C736950SvV LLJILLL;
    public final C736950SvV LLJJ;
    public final C736950SvV LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C736950SvV LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public String LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public long LLJJJJLIIL;
    public long LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public ViewGroup LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public C1390130mHL LLJLL;
    public TuxTextView LLJLLIL;
    public TuxSheet LLJLLL;
    public TuxSheet LLJZ;
    public TuxSheet LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public C197039127h LLLII;
    public C197039127h LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public TuxTextView LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeriesDetailDescriptionAssem.class, "purchaseViewModel", "getPurchaseViewModel()Lcom/ss/android/ugc/aweme/series/payment/viewmodel/SeriesDetailPurchaseViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SeriesDetailDescriptionAssem.class, "voucherClaimViewModel", "getVoucherClaimViewModel()Lcom/ss/android/ugc/aweme/series/voucher/viewmodel/SeriesVoucherClaimViewModel;", 0);
        c09r3.getClass();
        LLLJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1614350s6z
    public final void jI1(boolean z) {
    }

    public SeriesDetailDescriptionAssem() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1059);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeriesDetailVideoListViewModel.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(331);
        AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24((AbstractC738140SxQ) this, 1067);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJILLL = new C736950SvV(c19719912DlLIZ, awS568S0100000_24, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS264S0000000_24, awS568S0100000_242, c451610HnL, c723700Sa8);
        AwS568S0100000_24 awS568S0100000_243 = new AwS568S0100000_24(this, 1060);
        this.LLJJ = new C736950SvV(C13LE.LIZ(SeriesInnerFeedViewModel.class), awS568S0100000_243, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(332), new AwS568S0100000_24((AbstractC738140SxQ) this, 1068), new C451610HnL(this, true, true), new C723700Sa8(this));
        AwS568S0100000_24 awS568S0100000_244 = new AwS568S0100000_24(this, 1062);
        this.LLJJI = new C736950SvV(C13LE.LIZ(SeriesListAssemViewModel.class), awS568S0100000_244, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(333), new AwS568S0100000_24((AbstractC738140SxQ) this, 1069), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJIII = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(324));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(323));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(325));
        AwS568S0100000_24 awS568S0100000_245 = new AwS568S0100000_24(this, 1063);
        this.LLJJIJIL = new C736950SvV(C13LE.LIZ(SeriesRefundRatingViewModel.class), awS568S0100000_245, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(334), new AwS568S0100000_24((AbstractC738140SxQ) this, 1071), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SeriesDetailPurchaseViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 1819), AFwS264S0000000_24.get$arr$(329), null, true);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SeriesVoucherClaimViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c01d1, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ3, 1821), AFwS264S0000000_24.get$arr$(330), null, true);
        this.LLJJJIL = EnumC1612690s4J.SDP_CLICK_PURCHASE_BUTTON.getKey();
        this.LLJJJJJIL = true;
        this.LLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1811));
        this.LLLF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1816));
        this.LLLFF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1817));
        this.LLLFFI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1818));
        this.LLLFZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1064));
        this.LLLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1061));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1812));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1065));
        this.LLLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1822));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1813));
        this.LLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1815));
        this.LLLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1814));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1820));
    }

    public final C1611800s2s Jo() {
        return (C1611800s2s) this.LLJILJILJ.getValue();
    }

    public final SeriesRefundRatingViewModel Lo() {
        return (SeriesRefundRatingViewModel) this.LLJJIJIL.getValue();
    }

    public final C197039127h No() {
        return (C197039127h) this.LLL.getValue();
    }

    public final SeriesDetailVideoListViewModel Oo() {
        return (SeriesDetailVideoListViewModel) this.LLJILLL.getValue();
    }

    public final SeriesVoucherClaimViewModel So() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLJIL;
        return (SeriesVoucherClaimViewModel) assemVMLazy.getValue();
    }

    public final RoundedFrameLayout Vo() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.voucher_expiration_container) : null;
            this.LLJ = (RoundedFrameLayout) viewFindViewById;
        }
        return (RoundedFrameLayout) viewFindViewById;
    }

    public final TuxTextView Zo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.voucher_expiration) : null;
            this.LLIZLLLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final void ep() {
        GradientDrawable gradientDrawable;
        TuxTextView tuxTextView = this.LLJLILLLLZIIL;
        if (tuxTextView != null) {
            tuxTextView.setBackgroundResource(R.drawable.bfp);
        }
        C1613680s5u c1613680s5uLJLZ = this.LLJI.LJLZ();
        if (c1613680s5uLJLZ != null) {
            int i = c1613680s5uLJLZ.LIZ;
            TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
            Drawable background = tuxTextView2 != null ? tuxTextView2.getBackground() : null;
            if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                gradientDrawable.setColor(i);
            }
        }
        TuxTextView tuxTextView3 = this.LLJLILLLLZIIL;
        if (tuxTextView3 != null) {
            Context context = getContext();
            tuxTextView3.setText(context != null ? context.getString(2131850244) : null);
        }
        TuxTextView tuxTextView4 = this.LLJLILLLLZIIL;
        if (tuxTextView4 != null) {
            tuxTextView4.setClickable(false);
        }
    }

    public final void mp() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIJ(c19egLIZ.getResources().getString(2131847513));
            c1389890mGx.LJIIJJI();
            CollectionDetailModel collectionDetailModelHo = Ho();
            if (collectionDetailModelHo != null) {
                C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                Intent intent = Jo().LLILZ;
                String str = this.LLJJJIL;
                C1612600s4A c1612600s4A = Jo().LLJJIJIIJIL;
                c1611790s2r.getClass();
                C1612490s3z.LJJJJZ(C1612490s3z.LJI, "collection_in_app_purchase_toast", intent != null ? C1611790s2r.LIZ(intent, "enter_from") : null, null, null, null, null, Boolean.valueOf(C1611790s2r.LIZJ(intent)), null, null, null, str, null, null, null, null, null, null, null, collectionDetailModelHo, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, c1612600s4A, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -526404, 1073733631);
            }
        }
    }

    public final void sp() {
        CollectionDetailModel collectionDetailModelHo = Ho();
        if (collectionDetailModelHo == null || collectionDetailModelHo.voucherUrgencyType != 1) {
            C426750GoL.LJIIIZ(Vo(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, false, 29);
            C426750GoL.LJIIL(Vo(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, 26);
            Vo().setBackgroundColor(0);
            C426750GoL.LJIIIZ(Zo(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, false, 26);
            return;
        }
        C1613680s5u c1613680s5uLJLZ = this.LLJI.LJLZ();
        if (c1613680s5uLJLZ != null && !c1613680s5uLJLZ.LIZJ) {
            float[] fArr = {0.0f, 0.0f, 1.0f};
            Color.colorToHSV(c1613680s5uLJLZ.LIZ, fArr);
            int iHSVToColor = Color.HSVToColor(fArr);
            fArr[2] = fArr[2] * 0.3f;
            int iHSVToColor2 = Color.HSVToColor(fArr);
            Vo().setBackgroundColor(iHSVToColor);
            TuxTextView tuxTextViewZo = Zo();
            if (tuxTextViewZo != null) {
                tuxTextViewZo.setTextColor(iHSVToColor2);
            }
        }
        C426750GoL.LJIIIZ(Vo(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, null, false, 29);
        C426750GoL.LJIIL(Vo(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, 26);
        C426750GoL.LJIIIZ(Zo(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, false, 26);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CollectionDetailModel Ho() {
        return ((C1612160s3S) Oo().getState()).LLILLJJLI.LIZ();
    }

    public final void ap() {
        Context context = getContext();
        if (context != null) {
            ((IPaidContentAnchorAttachService) this.LLJJIJI.getValue()).LIZ(context, Jo().LLILLJJLI, Collections.singletonList(Ho()));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJILJIL.dispose();
        MiniDramaPaymentService miniDramaPaymentService = (MiniDramaPaymentService) this.LLJJIII.getValue();
        if (miniDramaPaymentService != null) {
            miniDramaPaymentService.LIZ(this);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (this.LLLIZZ) {
            Oo().manualListRefresh();
            this.LLLJ = true;
            this.LLLIZZ = false;
        }
        SeriesInnerFeedViewModel seriesInnerFeedViewModel = (SeriesInnerFeedViewModel) this.LLJJ.getValue();
        seriesInnerFeedViewModel.newState(new C627660Ojc(null, null, null, C13BV.INSTANCE, 7));
        ((InterfaceC1611890s31) seriesInnerFeedViewModel.GQ2().getOperator()).LJJJZ(0);
    }

    public final void bp(String str) {
        String str2;
        if (!C1893760zNe.LIZ(C724240Sb0.LIZ(this), false)) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(LJJIJL().getContext(), "aweme://paidcontent/collections/refundconfirmation");
        smartRouteBuildRoute.withParam("price_in_usd", str);
        CollectionDetailModel collectionDetailModelHo = Ho();
        if (collectionDetailModelHo != null) {
            str2 = collectionDetailModelHo.collectionName;
        } else {
            str2 = null;
        }
        smartRouteBuildRoute.withParam("collection_title", str2);
        smartRouteBuildRoute.open();
    }

    public final void cp(CollectionDetailModel collectionDetailModel) {
        boolean z;
        String strLIZ;
        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
        Intent intent = Jo().LLILZ;
        String str = Jo().LLJILJIL;
        String str2 = Jo().LLJILJILJ;
        String str3 = Jo().LLJILLL;
        Integer numValueOf = Integer.valueOf(Jo().LLJJ);
        if (Jo().LLJJ > 1) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        c1611790s2r.getClass();
        Integer numValueOf2 = Integer.valueOf(C1611790s2r.LJIIL(boolValueOf));
        boolean z2 = Jo().LLJJIII;
        C1612600s4A c1612600s4A = Jo().LLJJIJIIJIL;
        C1612490s3z c1612490s3z = C1612490s3z.LJI;
        if (intent != null) {
            strLIZ = C1611790s2r.LIZ(intent, "enter_from");
        } else {
            strLIZ = null;
        }
        C1612490s3z.LJJJJZ(c1612490s3z, "click_purchase_collection", strLIZ, null, null, null, null, Boolean.valueOf(C1611790s2r.LIZJ(intent)), null, null, null, null, null, null, null, null, null, null, null, collectionDetailModel, null, str, str2, str3, numValueOf, numValueOf2, null, z2, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, c1612600s4A, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -333971524, 1073733631);
        if (collectionDetailModel.enableSingleVideoPurchase) {
            Go(EnumC1612690s4J.SDP_CLICK_PURCHASE_BUTTON, null);
            withState(Lo(), new AwS603S0100000_24(this, 251));
        } else {
            op(null, true);
        }
    }

    public final void dp(boolean z) {
        C197039127h c197039127h = this.LLLII;
        if (c197039127h != null) {
            c197039127h.setLoading(z);
        }
        C197039127h c197039127h2 = this.LLLIIII;
        if (c197039127h2 != null) {
            c197039127h2.setLoading(z);
        }
        C197039127h c197039127h3 = this.LLLII;
        if (c197039127h3 != null) {
            c197039127h3.setClickable(!z);
        }
        C197039127h c197039127h4 = this.LLLIIII;
        if (c197039127h4 != null) {
            c197039127h4.setClickable(!z);
        }
    }

    public final void hp(final CollectionDetailModel collectionDetailModel) {
        PriceInfo priceInfo;
        LiveData<Map<Long, C1576640r8A>> liveDataLIZJ;
        String nickname;
        String uid;
        String uid2;
        String uid3;
        String str;
        String uid4;
        String str2;
        String uid5;
        String str3;
        String string;
        Resources resources;
        CollectionDetailModel collectionDetailModelHo;
        int i;
        String str4;
        String strLIZ;
        PaidVideoItem paidVideoItemLJIILJJIL;
        String string2;
        String string3;
        InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL;
        final int iIntValue;
        final int iIntValue2;
        TuxTextView tuxTextView;
        List<String> urlList;
        String str5;
        String tvRating;
        UrlModel avatarThumb;
        Object objLJJJLZIJ;
        String strLIZ2;
        String str6;
        List<String> urlList2;
        C786410Ut5.LLFF(0, (SmartImageView) this.LLLI.getValue());
        String str7 = "";
        if (!((SmartImageView) this.LLLI.getValue()).LIZLLL()) {
            com.ss.android.ugc.aweme.model.UrlModel urlModel = collectionDetailModel.collectionCover;
            if (urlModel == null || (urlList2 = urlModel.getUrlList()) == null || (str6 = (String) C13LP.LJJJLZIJ(0, urlList2)) == null) {
                str6 = "";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str6);
            c1331670kl3LJIIIZ.LJJ((SmartImageView) this.LLLI.getValue());
            c1331670kl3LJIIIZ.LIZLLL = true;
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        ((TextView) LJJIJL().findViewById(R.id.e76)).setText(collectionDetailModel.collectionName);
        if (C757070Tmr.LIZ()) {
            TuxTextView tuxTextView2 = this.LLJL;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
            TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
        } else {
            Context context = getContext();
            if (context != null && (priceInfo = collectionDetailModel.priceInfo) != null) {
                ISeriesPricingService.LIZ.getClass();
                ISeriesPricingService iSeriesPricingServiceLIZ = C1613940s6K.LIZ();
                if (iSeriesPricingServiceLIZ != null && (liveDataLIZJ = iSeriesPricingServiceLIZ.LIZJ(context, Collections.singletonList(new C1617190sBZ(collectionDetailModel.collectionId, priceInfo, collectionDetailModel.discountedPriceInfo, collectionDetailModel.singleVideoPriceInfo)))) != null) {
                    liveDataLIZJ.observe(this, new AObserverS185S0200000_24(collectionDetailModel, this, 6));
                }
            }
        }
        final TuxTextView tuxTextView4 = (TuxTextView) LJJIJL().findViewById(R.id.e6v);
        C1573930r3n.LIZ.getClass();
        if (C1573930r3n.LIZ()) {
            C786410Ut5.y3(tuxTextView4.getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0gJB
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    tuxTextView4.setText(collectionDetailModel.collectionDescription);
                    C786410Ut5.D3(tuxTextView4.getViewTreeObserver(), this);
                    return true;
                }
            });
        } else {
            tuxTextView4.setText(collectionDetailModel.collectionDescription);
        }
        C786410Ut5.LJLLLLLL(0, LJJIJL().findViewById(R.id.pzp));
        int i2 = collectionDetailModel.numWatched;
        if (i2 > 100 && (strLIZ2 = C498480Jgk.LIZ(i2)) != null) {
            ((TextView) this.LLLIL.getValue()).setText(u.LJJIFFI(LJJIJL().getResources().getString(2131847402), "%d", strLIZ2, false));
            C786410Ut5.LJLLLLLL(0, (View) this.LLLILZ.getValue());
        } else {
            C786410Ut5.LJLLLLLL(8, (View) this.LLLIL.getValue());
        }
        ((TextView) this.LLLIILIL.getValue()).setText(C788990UxF.LIZ(collectionDetailModel.collectionTotalDuration, LJJIJL().getResources()));
        ((TextView) LJJIJL().findViewById(R.id.e70)).setText("|");
        C427660Gpo c427660Gpo = (C427660Gpo) LJJIJL().findViewById(R.id.l_5);
        User user = collectionDetailModel.collectionCreator;
        if (user != null && (avatarThumb = user.getAvatarThumb()) != null) {
            List<String> urlList3 = avatarThumb.getUrlList();
            if (urlList3 == null || (objLJJJLZIJ = C13LP.LJJJLZIJ(0, urlList3)) == null) {
                objLJJJLZIJ = "";
            }
            C427660Gpo.LJIIJJI(c427660Gpo, objLJJJLZIJ, false, null, null, false, false, null, null, false, null, 1022);
        }
        TextView textView = (TextView) LJJIJL().findViewById(R.id.e78);
        User user2 = collectionDetailModel.collectionCreator;
        if (user2 != null) {
            nickname = user2.getNickname();
        } else {
            nickname = null;
        }
        textView.setText(nickname);
        C786410Ut5.R7((LinearLayout) LJJIJL().findViewById(R.id.q0j), new ACListenerS126S0200000_24(collectionDetailModel, this, 17));
        if (collectionDetailModel.tvRatingInfo != null) {
            TuxTextView tuxTextView5 = (TuxTextView) LJJIJL().findViewById(R.id.e71);
            tuxTextView5.setText("|");
            C786410Ut5.LLLLZLL(tuxTextView5, 0);
            TextView textView2 = (TextView) LJJIJL().findViewById(R.id.e77);
            TvRatingInfo tvRatingInfo = collectionDetailModel.tvRatingInfo;
            if (tvRatingInfo != null) {
                tvRating = tvRatingInfo.getTvRating();
            } else {
                tvRating = null;
            }
            textView2.setText(tvRating);
            TuxIconView tuxIconView = (TuxIconView) LJJIJL().findViewById(R.id.tv_rating_info_circle);
            C786410Ut5.a9(tuxIconView, new ACListenerS85S0300000_19(this, tuxIconView, collectionDetailModel, 19));
            C786410Ut5.LJZL(0, (LinearLayout) this.LLLIIL.getValue());
        }
        TextView textView3 = (TextView) LJJIJL().findViewById(R.id.t35);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(textView3.getResources().getString(2131847493));
        sbLIZ.append(" · ");
        sbLIZ.append(textView3.getResources().getString(2131847496));
        textView3.setText(C2188811AlT.LIZIZ(sbLIZ));
        LinearLayout linearLayout = (LinearLayout) LJJIJL().findViewById(R.id.pzl);
        C786410Ut5.R7(linearLayout, new ACListenerS158S0100000_24(this, 74));
        C786410Ut5.LJZL(0, linearLayout);
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        User user3 = collectionDetailModel.collectionCreator;
        if (user3 != null) {
            uid = user3.getUid();
        } else {
            uid = null;
        }
        boolean zEquals = curUserId.equals(uid);
        if (collectionDetailModel.discountedPriceInfo != null) {
            View viewFindViewById = LJJIJL().findViewById(R.id.voucher_panel_skeleton);
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            if (collectionDetailModel.voucherDescription != null) {
                SeriesVoucherClaimViewModel seriesVoucherClaimViewModelSo = So();
                com.ss.android.ugc.aweme.model.UrlModel urlModel2 = collectionDetailModel.collectionCover;
                if (urlModel2 != null && (urlList = urlModel2.getUrlList()) != null && (str5 = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
                    str7 = str5;
                }
                C1331660kl2.LJIIIZ(str7).LJJII(new C2502009rG(seriesVoucherClaimViewModelSo, 3));
                C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.09hc
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C2442109hb) obj).LLILLJJLI;
                    }
                }, null, new AwS638S0100000_24(this, 155), 6);
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
                ViewGroup viewGroup = this.LLJLIL;
                if (viewGroup != null) {
                    C786410Ut5.LJLZ(0, viewGroup);
                }
                ViewGroup viewGroup2 = this.LLJLIL;
                if (viewGroup2 != null) {
                    viewGroup2.setBackgroundResource(R.drawable.bfq);
                }
                ViewGroup viewGroup3 = this.LLJLIL;
                if (viewGroup3 != null) {
                    tuxTextView = (TuxTextView) viewGroup3.findViewById(R.id.voucher_claim_button);
                } else {
                    tuxTextView = null;
                }
                this.LLJLILLLLZIIL = tuxTextView;
                if (zEquals) {
                    if (tuxTextView != null) {
                        tuxTextView.setText(2131847410);
                    }
                } else if (tuxTextView != null) {
                    C786410Ut5.h9(tuxTextView, new ACListenerS126S0200000_24(collectionDetailModel, this, 18));
                }
                this.LLJILJIL.LIZ(C11NZ.LJLLILLLL(this.LLJI, this.LLJIJIL, new InterfaceC500500Jk0<T1, T2, Pair<? extends T1, ? extends T2>>() { // from class: X.0anZ
                    @Override // X.InterfaceC500500Jk0
                    public final Object apply(Object obj, Object obj2) {
                        return new Pair(obj, obj2);
                    }
                }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS158S0200000_24(this, collectionDetailModel, 4)));
            }
        }
        String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        User user4 = collectionDetailModel.collectionCreator;
        if (user4 != null) {
            uid2 = user4.getUid();
        } else {
            uid2 = null;
        }
        boolean zEquals2 = curUserId2.equals(uid2);
        TuxTextView tuxTextView6 = (TuxTextView) LJJIJL().findViewById(R.id.q06);
        LinearLayout linearLayout2 = (LinearLayout) LJJIJL().findViewById(R.id.q0c);
        if (tuxTextView6 != null) {
            String string4 = LJJIJL().getContext().getResources().getString(2131847501);
            String string5 = LJJIJL().getContext().getResources().getString(2131847502, string4);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, LJJIJL().getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, LJJIJL().getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            AbstractC431340Gvk abstractC431340Gvk = new AbstractC431340Gvk(iIntValue, iIntValue2) { // from class: X.0s5G
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    IPrivacyDisclaimerUtil iPrivacyDisclaimerUtilLJFF = PrivacyDisclaimerUtilService.LJFF();
                    this.LJJIJL().getContext();
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
            int iLJJJ = a0.LJJJ(string5, string4, 0, false, 6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string5);
            C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk, iLJJJ, string4.length() + iLJJJ, 34);
            tuxTextView6.setHighlightColor(0);
            tuxTextView6.setText(spannableStringBuilder);
            tuxTextView6.setMovementMethod(C431300Gvg.LIZ());
            ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
            if (iCompliancePolicyServiceLJIIIIZZ != null) {
                EnumC1913590ztd.VIDEO_GIFT.getValue();
                iCompliancePolicyServiceLJIIIIZZ.LIZLLL();
            }
        }
        this.LLLII = (C197039127h) LJJIJL().findViewById(R.id.pz4);
        LinearLayout linearLayout3 = (LinearLayout) LJJIJL().findViewById(R.id.pz_);
        if (!collectionDetailModel.hasPurchasedCollection && !zEquals2) {
            MiniDramaCacheService.LIZ.getClass();
            MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
            if (miniDramaCacheServiceLIZ != null && (interfaceC1612220s3YLIZLLL = miniDramaCacheServiceLIZ.LIZLLL(Long.valueOf(collectionDetailModel.collectionId))) != null) {
                paidVideoItemLJIILJJIL = interfaceC1612220s3YLIZLLL.LJIILJJIL();
            } else {
                paidVideoItemLJIILJJIL = null;
            }
            if (paidVideoItemLJIILJJIL != null && !collectionDetailModel.hasUserPartialPurchased) {
                C786410Ut5.LJZL(0, linearLayout3);
                C197039127h c197039127h = (C197039127h) LJJIJL().findViewById(R.id.pz8);
                this.LLLIIII = c197039127h;
                if (c197039127h != null) {
                    C786410Ut5.U8(c197039127h, new ACListenerS126S0200000_24(collectionDetailModel, this, 15));
                }
                C197039127h c197039127h2 = this.LLLIIII;
                if (c197039127h2 != null) {
                    if (collectionDetailModel.hasUserPartialPurchased) {
                        string3 = LJJIJL().getContext().getResources().getString(2131847547);
                    } else {
                        string3 = LJJIJL().getContext().getResources().getString(Jo().LLJ);
                    }
                    c197039127h2.setText(string3);
                }
                C197039127h c197039127h3 = this.LLLIIII;
                if (c197039127h3 != null) {
                    c197039127h3.setLoading(false);
                }
                C197039127h c197039127h4 = this.LLLIIII;
                if (c197039127h4 != null) {
                    c197039127h4.setClickable(true);
                }
                C197039127h c197039127h5 = (C197039127h) LJJIJL().findViewById(R.id.pzc);
                if (c197039127h5 != null) {
                    C786410Ut5.U8(c197039127h5, new ACListenerS88S0300000_24(this, paidVideoItemLJIILJJIL, collectionDetailModel, 5));
                    c197039127h5.setText(LJJIJL().getContext().getResources().getString(2131847415));
                    c197039127h5.setButtonStartIcon(Integer.valueOf(R.raw.icon_play_fill));
                }
            } else {
                C197039127h c197039127h6 = this.LLLII;
                if (c197039127h6 != null) {
                    C786410Ut5.U8(c197039127h6, new ACListenerS126S0200000_24(collectionDetailModel, this, 16));
                }
                C197039127h c197039127h7 = this.LLLII;
                if (c197039127h7 != null) {
                    if (collectionDetailModel.hasUserPartialPurchased) {
                        string2 = LJJIJL().getContext().getResources().getString(2131847547);
                    } else if (collectionDetailModel.voucherId != null) {
                        string2 = LJJIJL().getContext().getResources().getString(2131850242);
                    } else {
                        string2 = LJJIJL().getContext().getResources().getString(Jo().LLJ);
                    }
                    c197039127h7.setText(string2);
                }
                C197039127h c197039127h8 = this.LLLII;
                if (c197039127h8 != null) {
                    C786410Ut5.LLLLLLJ(c197039127h8, 0);
                }
                C197039127h c197039127h9 = this.LLLII;
                if (c197039127h9 != null) {
                    c197039127h9.setLoading(false);
                }
                C197039127h c197039127h10 = this.LLLII;
                if (c197039127h10 != null) {
                    c197039127h10.setClickable(true);
                }
            }
            C786410Ut5.LLLLZLL(tuxTextView6, 0);
            C786410Ut5.LJZL(0, linearLayout2);
        } else {
            C197039127h c197039127h11 = this.LLLII;
            if (c197039127h11 != null) {
                C786410Ut5.LLLLLLJ(c197039127h11, 8);
            }
            if (linearLayout3 != null) {
                C786410Ut5.LJZL(8, linearLayout3);
            }
            C786410Ut5.LLLLZLL(tuxTextView6, 8);
            C786410Ut5.LJZL(8, linearLayout2);
        }
        LinearLayout linearLayout4 = (LinearLayout) LJJIJL().findViewById(R.id.pzd);
        if (this.LLLJ) {
            if (collectionDetailModel.hasPurchasedCollection && (collectionDetailModelHo = Ho()) != null) {
                C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                Intent intent = Jo().LLILZ;
                C1155930gBb c1155930gBb = new C1155930gBb(0, 0, "", (Integer) null, 16);
                String str8 = this.LLJJJIL;
                Long lValueOf = Long.valueOf(Jo().LLIZ);
                String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
                String str9 = Jo().LLJILJIL;
                String str10 = Jo().LLJILJILJ;
                String str11 = Jo().LLJILLL;
                Integer numValueOf = Integer.valueOf(Jo().LLJJ);
                if (Jo().LLJJ > 1) {
                    i = 1;
                } else {
                    i = 0;
                }
                Integer numValueOf2 = Integer.valueOf(i);
                boolean z = Jo().LLJJIII;
                if (collectionDetailModelHo.hasVoucher && collectionDetailModelHo.enableSingleVideoPurchase) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                SeriesCategory seriesCategory = collectionDetailModelHo.category;
                Boolean bool = Boolean.TRUE;
                C1612600s4A c1612600s4A = Jo().LLJJIJIIJIL;
                c1611790s2r.getClass();
                C1612490s3z c1612490s3z = C1612490s3z.LJI;
                if (intent != null) {
                    strLIZ = C1611790s2r.LIZ(intent, "enter_from");
                } else {
                    strLIZ = null;
                }
                C1612490s3z.LJJJJZ(c1612490s3z, "collection_in_app_purchase_confirmation", strLIZ, null, null, null, null, Boolean.valueOf(C1611790s2r.LIZJ(intent)), bool, c1155930gBb, null, str8, lValueOf, currentUserID, null, null, null, null, "web_payment", collectionDetailModelHo, null, str9, str10, str11, numValueOf, numValueOf2, null, z, null, null, null, null, null, false, null, str4, null, null, null, null, seriesCategory, null, bool, c1612600s4A, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 202491164, 1073203742);
            }
            this.LLLJ = false;
        }
        if (!collectionDetailModel.hasPurchasedCollection && (str2 = collectionDetailModel.webPaymentLink) != null && str2.length() != 0) {
            TuxTextView tuxTextView7 = (TuxTextView) LJJIJL().findViewById(R.id.pze);
            this.LLLILZLLLI = tuxTextView7;
            if (tuxTextView7 != null) {
                Context context2 = getContext();
                if (context2 != null && (resources = context2.getResources()) != null) {
                    string = resources.getString(2131847621);
                } else {
                    string = null;
                }
                tuxTextView7.setText(string);
            }
            TuxTextView tuxTextView8 = this.LLLILZLLLI;
            if (tuxTextView8 != null) {
                C786410Ut5.h9(tuxTextView8, new ACListenerS126S0200000_24(collectionDetailModel, this, 19));
            }
            C786410Ut5.LJZL(0, linearLayout4);
            C1612490s3z c1612490s3z2 = C1612490s3z.LJI;
            String str12 = Jo().LLILLJJLI;
            String strValueOf = String.valueOf(collectionDetailModel.collectionId);
            User user5 = collectionDetailModel.collectionCreator;
            if (user5 != null) {
                uid5 = user5.getUid();
            } else {
                uid5 = null;
            }
            String str13 = collectionDetailModel.collectionName;
            PriceInfo priceInfo2 = collectionDetailModel.priceInfo;
            if (priceInfo2 != null) {
                str3 = priceInfo2.priceInUsd;
            } else {
                str3 = null;
            }
            String strValueOf2 = String.valueOf(collectionDetailModel.collectionRating);
            c1612490s3z2.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("enter_from", str12);
            c2344009Gk.LJFF("collection_user_id", uid5);
            c2344009Gk.LJFF("collection_id", strValueOf);
            c2344009Gk.LJFF("collection_name", str13);
            c2344009Gk.LJFF("collection_price", str3);
            c2344009Gk.LJFF("collection_rating", strValueOf2);
            MiniDramaETInjectService.LIZ.getClass();
            MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
            if (miniDramaETInjectServiceLIZ != null) {
                miniDramaETInjectServiceLIZ.onEventV3("show_web_payment_series_url", c2344009Gk.LIZ);
            }
        } else {
            C786410Ut5.LJZL(8, linearLayout4);
        }
        String curUserId3 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        User user6 = collectionDetailModel.collectionCreator;
        if (user6 != null) {
            uid3 = user6.getUid();
        } else {
            uid3 = null;
        }
        if (curUserId3.equals(uid3)) {
            C786410Ut5.LJZL(0, (LinearLayout) LJJIJL().findViewById(R.id.q0c));
            C786410Ut5.LLLLZLL((TuxTextView) LJJIJL().findViewById(R.id.q06), 8);
            C197039127h c197039127h12 = (C197039127h) LJJIJL().findViewById(R.id.jd8);
            C786410Ut5.LLLLLLJ(c197039127h12, 0);
            c197039127h12.setText(C1BWL.LIZJ().getString(2131847551));
            C786410Ut5.U8(c197039127h12, new ACListenerS126S0200000_24(collectionDetailModel, this, 14));
            C1612490s3z c1612490s3z3 = C1612490s3z.LJI;
            String str14 = Jo().LLILLJJLI;
            String strValueOf3 = String.valueOf(collectionDetailModel.collectionId);
            String str15 = collectionDetailModel.collectionName;
            PriceInfo priceInfo3 = collectionDetailModel.priceInfo;
            if (priceInfo3 != null) {
                str = priceInfo3.priceInUsd;
            } else {
                str = null;
            }
            User user7 = collectionDetailModel.collectionCreator;
            if (user7 != null) {
                uid4 = user7.getUid();
            } else {
                uid4 = null;
            }
            c1612490s3z3.getClass();
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJFF("enter_from", str14);
            c2344009Gk2.LJFF("collection_id", strValueOf3);
            c2344009Gk2.LJFF("collection_name", str15);
            c2344009Gk2.LJFF("collection_price", str);
            c2344009Gk2.LJFF("author_id", uid4);
            MiniDramaETInjectService.LIZ.getClass();
            MiniDramaETInjectService miniDramaETInjectServiceLIZ2 = C1611550s2T.LIZ();
            if (miniDramaETInjectServiceLIZ2 != null) {
                miniDramaETInjectServiceLIZ2.onEventV3("show_series_promote_horn_pill_button", c2344009Gk2.LIZ);
            }
        }
        sp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ip(boolean z) {
        CollectionDetailModel collectionDetailModelHo;
        String string;
        User user;
        Long lValueOf;
        int i = 8;
        String uid = null;
        if (z) {
            MiniDramaCacheService.LIZ.getClass();
            MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
            if (miniDramaCacheServiceLIZ != null) {
                C1611800s2s c1611800s2sJo = Jo();
                if (c1611800s2sJo != null) {
                    lValueOf = Long.valueOf(c1611800s2sJo.LL);
                } else {
                    lValueOf = null;
                }
                InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL = miniDramaCacheServiceLIZ.LIZLLL(lValueOf);
                if (interfaceC1612220s3YLIZLLL != null && interfaceC1612220s3YLIZLLL.LJIIIZ()) {
                    C197039127h c197039127hNo = No();
                    if (c197039127hNo != null) {
                        c197039127hNo.setLoading(false);
                    }
                }
            }
            C197039127h c197039127hNo2 = No();
            if (c197039127hNo2 != null) {
                C786410Ut5.LLLLLLJ(c197039127hNo2, 8);
                return;
            }
            return;
        }
        PaidContentVideoListResponse paidContentVideoListResponseLIZ = ((C1612160s3S) Oo().getState()).LLJI.LIZ();
        if (paidContentVideoListResponseLIZ != null) {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            CollectionDetailModel collectionDetailModelHo2 = Ho();
            if (collectionDetailModelHo2 != null && (user = collectionDetailModelHo2.collectionCreator) != null) {
                uid = user.getUid();
            }
            if (curUserId.equals(uid)) {
                return;
            }
            C197039127h c197039127hNo3 = No();
            if (c197039127hNo3 != null) {
                int i2 = C1613730s5z.LIZ[paidContentVideoListResponseLIZ.continueWatchingInfo.continueStatus.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            string = "UNKNOWN";
                        } else {
                            string = LJJIJL().getContext().getString(2131847412);
                        }
                    } else {
                        string = LJJIJL().getContext().getString(2131847414);
                    }
                } else {
                    string = LJJIJL().getContext().getString(2131847413);
                }
                c197039127hNo3.setText(string);
            }
            C197039127h c197039127hNo4 = No();
            if (c197039127hNo4 != null) {
                C786410Ut5.U8(c197039127hNo4, new ACListenerS126S0200000_24(paidContentVideoListResponseLIZ, this, 8));
            }
            C197039127h c197039127hNo5 = No();
            if (c197039127hNo5 != null) {
                c197039127hNo5.setButtonStartIcon(Integer.valueOf(R.raw.icon_play_fill));
            }
            C197039127h c197039127hNo6 = No();
            if (c197039127hNo6 != null) {
                ContinueStatus continueStatus = paidContentVideoListResponseLIZ.continueWatchingInfo.continueStatus;
                if (continueStatus != ContinueStatus.UNKNOWN && continueStatus != ContinueStatus.SERIES_COMPLETED && (collectionDetailModelHo = Ho()) != null && collectionDetailModelHo.hasPurchasedCollection) {
                    i = 0;
                }
                C786410Ut5.LLLLLLJ(c197039127hNo6, i);
            }
            C197039127h c197039127hNo7 = No();
            if (c197039127hNo7 != null) {
                c197039127hNo7.setClickable(true);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView;
        CollectionDetailModel collectionDetailModel;
        super.onViewCreated(view);
        this.LLJJL = SystemClock.elapsedRealtime();
        C1573930r3n.LIZ.getClass();
        if (C1573930r3n.LIZ() && (collectionDetailModel = Jo().LLJJI) != null) {
            hp(collectionDetailModel);
        }
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) LJJIJL().findViewById(R.id.mtn);
        this.LLJL = (TuxTextView) LJJIJL().findViewById(R.id.e73);
        ViewGroup viewGroup = (ViewGroup) LJJIJL().findViewById(R.id.voucher_layout);
        this.LLJLIL = viewGroup;
        if (viewGroup != null) {
            tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.voucher_description);
        } else {
            tuxTextView = null;
        }
        this.LLJLLIL = tuxTextView;
        this.LLJLL = (C1390130mHL) LJJIJL().findViewById(R.id.voucher_claim_loading_view);
        MiniDramaPaymentService miniDramaPaymentService = (MiniDramaPaymentService) this.LLJJIII.getValue();
        if (miniDramaPaymentService != null) {
            miniDramaPaymentService.LJIIJ(this);
        }
        Oo().asyncSubscribe(new C2217381BqS() { // from class: X.0s2j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1612160s3S) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS603S0100000_24(this, 255), new AwS568S0100000_24(this, 1058), new AwS603S0100000_24(this, 249));
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0s3q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1612160s3S) obj).LLILLL;
            }
        }, null, new AwS638S0100000_24(this, 85), 6);
        Oo().asyncSubscribe(new C2217381BqS() { // from class: X.0s3r
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1612160s3S) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS603S0100000_24(this, 250), new AwS568S0100000_24(this, 1066), new AwS603S0100000_24(this, 252));
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0s3s
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1611650s2d) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 86), 4);
        So().asyncSubscribe(new C2217381BqS() { // from class: X.0s3w
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2442109hb) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS603S0100000_24(this, 253), new AwS568S0100000_24(this, 1070), new AwS603S0100000_24(this, 254));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJ.getValue(), new C2217381BqS() { // from class: X.0s3t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1612210s3X) obj).LLJJIJI);
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 154), 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8 A[PHI: r2
      0x00d8: PHI (r2v8 int) = (r2v7 int), (r2v12 int), (r2v12 int), (r2v12 int) binds: [B:60:0x0115, B:46:0x00c5, B:48:0x00c9, B:52:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    @Override // X.InterfaceC1614350s6z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sX0(X.AbstractC1159090gGh r8) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.seriesdetail.assem.SeriesDetailDescriptionAssem.sX0(X.0gGh):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Go(EnumC1612690s4J enumC1612690s4J, String str) {
        FragmentManager supportFragmentManager;
        boolean z;
        boolean z2;
        boolean z3;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
            C1612160s3S c1612160s3S = (C1612160s3S) Oo().getState();
            List<PurchaseOption> list = c1612160s3S.LLJIJIL;
            Integer num = c1612160s3S.LLJILJILJ;
            EnumC1612760s4Q enumC1612760s4Q = Jo().LLILLL;
            EnumC1612760s4Q enumC1612760s4Q2 = EnumC1612760s4Q.ANCHOR;
            if (enumC1612760s4Q == enumC1612760s4Q2) {
                z = true;
            } else {
                z = false;
            }
            TuxSheet tuxSheet = this.LLJLLL;
            if ((tuxSheet != null && tuxSheet.isVisible()) || list == null || num == null) {
                return;
            }
            MiniDramaPaymentService miniDramaPaymentService = (MiniDramaPaymentService) this.LLJJIII.getValue();
            TuxSheet tuxSheetLJII = null;
            C1614390s73 c1614390s73LIZ = null;
            if (miniDramaPaymentService != null) {
                CollectionDetailModel collectionDetailModelLIZ = c1612160s3S.LLILLJJLI.LIZ();
                if (collectionDetailModelLIZ != null && collectionDetailModelLIZ.hasUserPartialPurchased) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                CollectionDetailModel collectionDetailModelLIZ2 = c1612160s3S.LLILLJJLI.LIZ();
                if (Jo().LLILLL == enumC1612760s4Q2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z4 = Jo().LLJJIJI;
                String str2 = Jo().LLILLJJLI;
                Integer num2 = c1612160s3S.LLJILJIL;
                CollectionDetailModel collectionDetailModelLIZ3 = c1612160s3S.LLILLJJLI.LIZ();
                if (collectionDetailModelLIZ3 != null) {
                    c1614390s73LIZ = C1612390s3p.LIZ(collectionDetailModelLIZ3);
                }
                C1612600s4A c1612600s4A = Jo().LLJJIJIIJIL;
                boolean z5 = Jo().LLJJIJIL;
                boolean z6 = Jo().LLJJJ;
                C1614390s73 c1614390s73 = c1614390s73LIZ;
                tuxSheetLJII = miniDramaPaymentService.LJII(supportFragmentManager, new C1614180s6i(num.intValue(), list, z2, num2, enumC1612690s4J, collectionDetailModelLIZ2, z3, z4, true, str2, true, null, false, str, c1614390s73, 0, c1612600s4A, Boolean.valueOf(z5), Boolean.valueOf(z6), Jo().LLJJJIL, Jo().LLJJIII, false, ((SeriesInnerFeedViewModel) this.LLJJ.getValue()).xA(), Jo().LLJJ, Jo().LLJILJIL, Long.valueOf(Jo().LLIZ), null, null, Boolean.FALSE, Jo().LLJJJJLIIL), new C1612200s3W(this), new AwS20S0410000_24(c1612160s3S, (C1612160s3S) z, (boolean) this, (SeriesDetailDescriptionAssem) enumC1612690s4J, (EnumC1612690s4J) list, (List<PurchaseOption>) 0), null);
            }
            this.LLJLLL = tuxSheetLJII;
        }
    }

    public final void kp(CollectionDetailModel collectionDetailModel, String str) {
        Context context;
        String str2;
        String str3;
        TuxTextView tuxTextView;
        String string;
        if (collectionDetailModel.voucherDescription != null && (context = getContext()) != null) {
            String str4 = "";
            if (collectionDetailModel.voucherIsCountdown) {
                PriceInfo priceInfo = collectionDetailModel.priceInfo;
                if (priceInfo != null && (str2 = priceInfo.priceInUsd) != null) {
                    float f = CastFloatProtector.parseFloat(str2);
                    PriceInfo priceInfo2 = collectionDetailModel.discountedPriceInfo;
                    if (priceInfo2 != null && (str3 = priceInfo2.priceInUsd) != null) {
                        float f2 = CastFloatProtector.parseFloat(str3);
                        String str5 = collectionDetailModel.voucherDescription;
                        if (str5 != null && (tuxTextView = this.LLJLLIL) != null) {
                            String str6 = (String) C13LP.LJJJLL(a0.LJJLIIIJILLIZJL(str5, new String[]{"\n"}, 0, 6));
                            if (str6 != null && (string = a0.LJLIIIL(str6).toString()) != null) {
                                str4 = string;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append((int) ((f2 / f) * 100));
                            sbLIZ.append('%');
                            tuxTextView.setText(C786410Ut5.j4(str4, Arrays.copyOf(new Object[]{C2188811AlT.LIZIZ(sbLIZ)}, 1)));
                        }
                    }
                }
                SeriesCountDownTimer seriesCountDownTimer = (SeriesCountDownTimer) this.LLLFZ.getValue();
                long j = collectionDetailModel.voucherExpireTimestamp;
                AwS390S0200000_24 awS390S0200000_24 = new AwS390S0200000_24(this, context, 29);
                if (seriesCountDownTimer.LL == null) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    seriesCountDownTimer.LL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1321405Fc(j, seriesCountDownTimer, awS390S0200000_24, null), 3);
                    return;
                }
                return;
            }
            String str7 = collectionDetailModel.voucherDescription;
            if (str7 != null) {
                str4 = str7;
            }
            List listLJJLIIIJ = a0.LJJLIIIJ(C786410Ut5.j4(str4, Arrays.copyOf(new Object[]{str}, 1)), new char[]{'\n'}, false, 0, 6);
            if (listLJJLIIIJ.size() != 2) {
                return;
            }
            String str8 = (String) ListProtector.get(listLJJLIIIJ, 0);
            String str9 = (String) ListProtector.get(listLJJLIIIJ, 1);
            TuxTextView tuxTextView2 = this.LLJLLIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(str8);
            }
            TuxTextView tuxTextViewZo = Zo();
            if (tuxTextViewZo == null) {
                return;
            }
            tuxTextViewZo.setText(str9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x030f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void op(java.lang.String r74, boolean r75) {
        /*
            Method dump skipped, instruction units count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.seriesdetail.assem.SeriesDetailDescriptionAssem.op(java.lang.String, boolean):void");
    }

    public final void lp(String str, boolean z, boolean z2, C1576640r8A c1576640r8A, boolean z3) {
        int i;
        TuxTextView tuxTextView = this.LLJL;
        int i2 = 8;
        if (tuxTextView != null) {
            if (!c1576640r8A.LJIIIIZZ && C123100dR.LIZ(c1576640r8A.LIZLLL) && !z2 && !z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxTextView);
            tuxTextView.setText(c1576640r8A.LIZIZ);
            if (C123100dR.LIZ(c1576640r8A.LIZLLL)) {
                tuxTextView.setPaintFlags(tuxTextView.getPaintFlags() | 16);
            }
        }
        TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
        C786410Ut5.LJLZ(8, (ViewGroup) this.LLLF.getValue());
        if (z3 && C123100dR.LIZ(c1576640r8A.LJI) && !z2 && !z) {
            C786410Ut5.LJLZ(0, (ViewGroup) this.LLLF.getValue());
            ((TextView) this.LLLFFI.getValue()).setText(C786410Ut5.j4(u.LJJIFFI(C1BWL.LIZJ().getString(2131847549), "%1$d", "%1$s", false), Arrays.copyOf(new Object[]{c1576640r8A.LJI}, 1)));
            ((TextView) this.LLLFF.getValue()).setText(C786410Ut5.j4(u.LJJIFFI(C1BWL.LIZJ().getString(2131847548), "%1$d", "%1$s", false), Arrays.copyOf(new Object[]{c1576640r8A.LIZIZ}, 1)));
            return;
        }
        TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView3 == null) {
            return;
        }
        if (!c1576640r8A.LJIIIIZZ && !z2 && !z) {
            i2 = 0;
        }
        C786410Ut5.LJLLLLLL(i2, tuxTextView3);
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('$');
            if (str == null) {
                str = "";
            }
            sbLIZ.append(str);
            tuxTextView3.setText(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (C123100dR.LIZ(c1576640r8A.LIZLLL)) {
            tuxTextView3.setText(c1576640r8A.LIZLLL);
        } else {
            tuxTextView3.setText(c1576640r8A.LIZIZ);
        }
    }
}
