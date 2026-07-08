package com.ss.android.ugc.aweme.series.seriesdetail.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C11S5;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1428010nGR;
import X.C1559260qg8;
import X.C1606610ruV;
import X.C1611800s2s;
import X.C1612110s3N;
import X.C1612160s3S;
import X.C1612380s3o;
import X.C1620630sH7;
import X.C1701940uOG;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C20626615nU;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C444920HcY;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1612310s3h;
import X.InterfaceC1612220s3Y;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AfS193S0100000_24;
import android.content.Context;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.PaidContentImageSettings;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayProgressService;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.refund.viewmodel.SeriesRefundRatingViewModel;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel;
import com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS175S0400000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesDetailVideoListAssem extends UIListContentAssem<SeriesDetailVideoListViewModel> {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1611800s2s.class, "paid_content_collection_detail_hierarchy_data_key"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public TuxTextView LLJI;
    public ViewGroup LLJIJIL;
    public ViewGroup LLJILJIL;
    public final C736950SvV LLJILJILJ;
    public final C01GW LLJILLL;
    public C1749280vcc LLJJ;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILLL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 3;
        c20603715jn.LJIIJ = false;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    public final C1611800s2s No() {
        return (C1611800s2s) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Oo, reason: merged with bridge method [inline-methods] */
    public final SeriesDetailVideoListViewModel ip() {
        return (SeriesDetailVideoListViewModel) this.LLJILJILJ.getValue();
    }

    public SeriesDetailVideoListAssem() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1082);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeriesRefundRatingViewModel.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(337);
        AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24((AbstractC738140SxQ) this, 1083);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJ = new C736950SvV(c19719912DlLIZ, awS568S0100000_24, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS264S0000000_24, awS568S0100000_242, c451610HnL, c723700Sa8);
        AwS568S0100000_24 awS568S0100000_243 = new AwS568S0100000_24(this, 1086);
        this.LLJILJILJ = new C736950SvV(C13LE.LIZ(SeriesDetailVideoListViewModel.class), awS568S0100000_243, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(338), new AwS568S0100000_24((AbstractC738140SxQ) this, 1084), new C451610HnL(this, true, true), new C723700Sa8(this));
        new AwS568S0100000_24(this, 1087);
        C13LE.LIZ(SeriesInnerFeedViewModel.class);
        AFwS264S0000000_24.get$arr$(339);
        new AwS568S0100000_24((AbstractC738140SxQ) this, 1085);
        new C451610HnL(this, true, true);
        new C723700Sa8(this);
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this);
        this.LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1081));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        MiniDramaPlayProgressService miniDramaPlayProgressServiceDQ2 = ip().DQ2();
        if (miniDramaPlayProgressServiceDQ2 != null) {
            miniDramaPlayProgressServiceDQ2.LIZJ();
        }
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ != null) {
            CollectionDetailModel collectionDetailModelLIZ = ((C1612160s3S) ip().getState()).LLILLJJLI.LIZ();
            InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL = miniDramaCacheServiceLIZ.LIZLLL(collectionDetailModelLIZ != null ? Long.valueOf(collectionDetailModelLIZ.collectionId) : null);
            if (interfaceC1612220s3YLIZLLL != null) {
                interfaceC1612220s3YLIZLLL.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (((C1612160s3S) ip().getState()).LLJI.LIZ() != null) {
            SeriesDetailVideoListViewModel seriesDetailVideoListViewModelIp = ip();
            seriesDetailVideoListViewModelIp.getClass();
            seriesDetailVideoListViewModelIp.disposeOnClear(C1612110s3N.LIZIZ(null, new C1612380s3o(seriesDetailVideoListViewModelIp.CQ2().LL, 0, 0L, "continue", EnumC1612310s3h.FORWARD, "mini_drama_container", seriesDetailVideoListViewModelIp.CQ2().LLJJJJ, seriesDetailVideoListViewModelIp.CQ2().LLJJL), Boolean.FALSE, null, null, null, null, null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS193S0100000_24(seriesDetailVideoListViewModelIp, 45)));
        }
        ip().NQ2();
        Go().LJIIJ();
    }

    public static void Vo(ConstraintLayout constraintLayout) {
        Paint paint = new Paint();
        paint.setTextSize(C418440Gaw.LIZIZ(14));
        C1428010nGR c1428010nGR = new C1428010nGR(C418440Gaw.LIZIZ(18), paint);
        ((C20626615nU) constraintLayout.findViewById(R.id.y2p)).setFontConfig(c1428010nGR);
        ((C20626615nU) constraintLayout.findViewById(R.id.wmj)).setFontConfig(c1428010nGR);
    }

    public final void So(C1722300uv6 c1722300uv6) {
        Boolean boolValueOf;
        String str;
        Context context = LJJIJL().getContext();
        Context context2 = null;
        if (context != null) {
            boolValueOf = Boolean.valueOf(C960203pA.LIZIZ(context));
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            str = PaidContentImageSettings.LIZ().couldntLoadImage.dark;
        } else {
            str = PaidContentImageSettings.LIZ().couldntLoadImage.light;
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        C1749280vcc c1749280vcc = this.LLJJ;
        if (c1749280vcc != null) {
            context2 = c1749280vcc.getContext();
        }
        c1331670kl3LJIIIZ.LJJIJL(context2);
        c1331670kl3LJIIIZ.LJJII(new C1620630sH7(this, c1722300uv6, 0));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (No().LLJJI != null) {
            ViewGroup viewGroup = (ViewGroup) LJJIJL().findViewById(R.id.u3s);
            C786410Ut5.LJLLLLLL(0, viewGroup);
            this.LLJILJIL = viewGroup;
            C20626615nU c20626615nU = (C20626615nU) LJJIJL().findViewById(R.id.y35);
            Paint paint = new Paint();
            paint.setTextSize(C418440Gaw.LIZIZ(16));
            c20626615nU.setFontConfig(new C1428010nGR(C418440Gaw.LIZIZ(21), paint));
            Vo((ConstraintLayout) LJJIJL().findViewById(R.id.vf4));
            Vo((ConstraintLayout) LJJIJL().findViewById(R.id.vf5));
        }
        this.LLJJ = (C1749280vcc) LJJIJL().findViewById(R.id.pz5);
        this.LLJIJIL = (ViewGroup) LJJIJL().findViewById(R.id.video_list_section);
        this.LLJI = (TuxTextView) LJJIJL().findViewById(R.id.pzr);
        final Context context = LJJIJL().getContext();
        Go().setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.series.seriesdetail.assem.SeriesDetailVideoListAssem$onViewCreated$layoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                return false;
            }
        });
        Go().LJIIL(ip().getConfig());
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0s2S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1612160s3S) obj).LLILLJJLI;
            }
        }, null, null, null, new AwS603S0100000_24(this, 260), 14, null);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0s2R
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1612160s3S c1612160s3S = (C1612160s3S) obj;
                c1612160s3S.getClass();
                return C627260Oiy.LIZLLL(c1612160s3S);
            }
        }, null, null, null, new AwS603S0100000_24(this, 262), 14, null);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0s2U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1612160s3S) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 89), 4);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(Go().getContext()), R.layout.bhd, Go(), false);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0s2V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1612160s3S) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS175S0400000_24((TuxTextView) viewTd.findViewById(R.id.pzj), (TuxIconView) viewTd.findViewById(R.id.pzi), viewTd, this, 1), 4);
    }

    public final Spannable Lo(String str, String str2) {
        Integer numLIZJ;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIntValue = 0;
        Integer numValueOf = Integer.valueOf(a0.LJJJ(str, str2, 0, false, 6));
        if (numValueOf.intValue() >= 0) {
            int iIntValue2 = numValueOf.intValue();
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(61, false), iIntValue2, str2.length() + iIntValue2, 17);
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), iIntValue2, str2.length() + iIntValue2, 17);
        }
        return SpannableString.valueOf(spannableStringBuilder);
    }
}
