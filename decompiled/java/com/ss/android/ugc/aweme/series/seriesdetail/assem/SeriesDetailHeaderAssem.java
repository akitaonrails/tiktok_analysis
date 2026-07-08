package com.ss.android.ugc.aweme.series.seriesdetail.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1385040m98;
import X.C13LE;
import X.C1559260qg8;
import X.C1611800s2s;
import X.C1612160s3S;
import X.C1623606Xi;
import X.C19719912Dl;
import X.C19EG;
import X.C21578619ce;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1809520xBm;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.minidrama.common.component.ab.SeriesFeedbackIntegrationURLSetting;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.refund.viewmodel.SeriesRefundRatingViewModel;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesDetailHeaderAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1611800s2s.class, "paid_content_collection_detail_hierarchy_data_key"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public final C736950SvV LLJI;
    public final C1251150ifB LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C1611800s2s Ho() {
        return (C1611800s2s) this.LLIZLLLIL.getValue();
    }

    public final TuxNavBar Jo() {
        return (TuxNavBar) this.LLJILLL.getValue();
    }

    public final C21578619ce Lo() {
        return (C21578619ce) this.LLJJ.getValue();
    }

    public final SeriesDetailVideoListViewModel No() {
        return (SeriesDetailVideoListViewModel) this.LLJ.getValue();
    }

    public SeriesDetailHeaderAssem() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1080);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeriesDetailVideoListViewModel.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(335);
        AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24((AbstractC738140SxQ) this, 1077);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJ = new C736950SvV(c19719912DlLIZ, awS568S0100000_24, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS264S0000000_24, awS568S0100000_242, c451610HnL, c723700Sa8);
        AwS568S0100000_24 awS568S0100000_243 = new AwS568S0100000_24(this, 1075);
        this.LLJI = new C736950SvV(C13LE.LIZ(SeriesRefundRatingViewModel.class), awS568S0100000_243, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(336), new AwS568S0100000_24((AbstractC738140SxQ) this, 1078), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJIJIL = new C1251150ifB();
        this.LLJILJIL = true;
        this.LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1073));
        this.LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1076));
        this.LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1079));
        this.LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1072));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CollectionDetailModel Go() {
        return ((C1612160s3S) No().getState()).LLILLJJLI.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oo() {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.seriesdetail.assem.SeriesDetailHeaderAssem.Oo():void");
    }

    public final void So() {
        Integer numLIZJ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Jo().LJIJ(C1385040m98.LIZLLL(c19egLIZ));
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
                int iIntValue = numLIZJ.intValue();
                Jo().setNavBackground(iIntValue);
                Jo().setBackgroundColor(iIntValue);
            }
            C786410Ut5.C5(Jo(), 1.0f);
            this.LLJILJIL = false;
            Vo();
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19egLIZ);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19egLIZ, immersionBarLJIILJJIL);
            immersionBarLJIILJJIL.LJIIJ(!C960203pA.LIZIZ(c19egLIZ));
            tuxImmersionBar.LJIIIIZZ(R.attr.bx);
            tuxImmersionBar.LIZ(false);
            tuxImmersionBar.LIZLLL();
            this.LLJILJILJ = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Vo() {
        if (((C1612160s3S) No().getState()).LLIZLLLIL) {
            Jo().LJJ(new AwS603S0100000_24(this, 258), "favorite");
        } else {
            Jo().LJJ(new AwS603S0100000_24(this, 259), "favorite");
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        SeriesDetailVideoListViewModel seriesDetailVideoListViewModelNo = No();
        CollectionDetailModel collectionDetailModelBQ2 = seriesDetailVideoListViewModelNo.BQ2();
        if (collectionDetailModelBQ2 != null) {
            CollectionDetailModel collectionDetailModel = ((IPaidContentService) seriesDetailVideoListViewModelNo.LLJIJIL.getValue()).LJI().get(Long.valueOf(collectionDetailModelBQ2.collectionId));
            if (collectionDetailModel != null) {
                seriesDetailVideoListViewModelNo.MQ2(new C1623606Xi(collectionDetailModel));
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default(No(), new C2217381BqS() { // from class: X.0s2m
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1612160s3S) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), null, null, new AwS603S0100000_24(this, 256), 12, null);
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0s2o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1612160s3S) obj).LLIZLLLIL);
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 87), 4);
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0s2p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1612160s3S) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 88), 4);
        AssemViewModel.asyncSubscribe$default(No(), new C2217381BqS() { // from class: X.0s2n
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1612160s3S) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS603S0100000_24(this, 257), new AwS568S0100000_24(this, 1074), null, 16, null);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (!Ho().LLIZLLLIL) {
            TuxNavBar tuxNavBarJo = Jo();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS568S0100000_24(c19egLIZ, 1698));
            tuxNavBarJo.LIZIZ(c1251150ifB);
        }
        TuxNavBar tuxNavBarJo2 = Jo();
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_3pt_arrow_turn_up_right;
        c1251150ifB2.LIZIZ = "share_collection";
        c1251150ifB2.LJI = false;
        c1251150ifB2.LIZLLL = false;
        c1251150ifB2.LIZJ(new AwS425S0200000_24(this, c19egLIZ, 59));
        tuxNavBarJo2.LIZ(c1251150ifB2);
        TuxNavBar tuxNavBarJo3 = Jo();
        C1251150ifB c1251150ifB3 = this.LLJIJIL;
        c1251150ifB3.LIZLLL();
        c1251150ifB3.LIZJ = R.raw.icon_color_bookmark_shadow_alt_3;
        c1251150ifB3.LIZIZ = "favorite";
        c1251150ifB3.LJI = false;
        c1251150ifB3.LIZJ(new AwS568S0100000_24(this, 1699));
        tuxNavBarJo3.LIZ(c1251150ifB3);
        SeriesFeedbackIntegrationURLSetting.FeedbackIntegrationInfoStructJsonModel feedbackIntegrationInfoStructJsonModelLIZ = SeriesFeedbackIntegrationURLSetting.LIZ();
        TuxNavBar tuxNavBarJo4 = Jo();
        C1251150ifB c1251150ifB4 = new C1251150ifB();
        c1251150ifB4.LIZLLL();
        c1251150ifB4.LIZJ = R.raw.icon_bubble_ellipsis_right;
        c1251150ifB4.LIZIZ = "feedback";
        c1251150ifB4.LJI = false;
        c1251150ifB4.LIZJ(new AwS425S0200000_24(c19egLIZ, feedbackIntegrationInfoStructJsonModelLIZ, 60));
        tuxNavBarJo4.LIZ(c1251150ifB4);
        TuxNavBar tuxNavBarJo5 = Jo();
        C1251150ifB c1251150ifB5 = new C1251150ifB();
        c1251150ifB5.LIZLLL();
        c1251150ifB5.LIZJ = R.raw.icon_ellipsis_horizontal;
        c1251150ifB5.LIZIZ = "paid_collection_menu";
        c1251150ifB5.LJI = false;
        c1251150ifB5.LIZJ(new AwS568S0100000_24(this, 1700));
        tuxNavBarJo5.LIZ(c1251150ifB5);
        Jo().LJIIZILJ(false);
        Jo().LJIJ(R.style.y0);
        Jo().setNavBackground(0);
        Jo().setBackgroundColor(0);
        Lo().setOnScrollChangeListener(new InterfaceC1809520xBm() { // from class: X.0s2q
            @Override // X.InterfaceC1809520xBm
            public final void LIZ(C21578619ce c21578619ce, int i, int i2, int i3, int i4) {
                this.LIZ.Oo();
            }
        });
    }
}
