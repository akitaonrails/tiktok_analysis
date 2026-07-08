package com.ss.android.ugc.aweme.series.serieslist.assem;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C1220000hqw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C1559260qg8;
import X.C1572910r29;
import X.C1572960r2E;
import X.C1620820sHQ;
import X.C1749280vcc;
import X.C197039127h;
import X.C20603715jn;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
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
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS158S0100000_24;
import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.minidrama.common.component.ab.SeriesFeedbackIntegrationURLSetting;
import com.ss.android.ugc.aweme.series.serieslist.powercell.SeriesFooterCell;
import com.ss.android.ugc.aweme.series.serieslist.viewmodel.SeriesListAssemViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS440S0200000_4;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesListAssem extends UIListContentAssem<SeriesListAssemViewModel> {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1572960r2E.class, "paid_content_collection_list_hierarchy_data_key"), checkSupervisorPrepared());
    public boolean LLJ;
    public final C736950SvV LLJI;
    public final C01GW LLJIJIL;
    public TuxNavBar LLJILJIL;
    public C1251150ifB LLJILJILJ;
    public C197039127h LLJILLL;
    public LinearLayout LLJJ;
    public boolean LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIII.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 4;
        c20603715jn.LIZLLL = SeriesFooterCell.class;
        return c20603715jn;
    }

    public final C1572960r2E Lo() {
        return (C1572960r2E) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final SeriesListAssemViewModel ip() {
        return (SeriesListAssemViewModel) this.LLJI.getValue();
    }

    public SeriesListAssem() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1098);
        this.LLJI = new C736950SvV(C13LE.LIZ(SeriesListAssemViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(354), new AwS568S0100000_24((AbstractC738140SxQ) this, 1097), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(333));
        this.LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1096));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1095));
    }

    public final void Oo() {
        C197039127h c197039127h;
        Context context = getContext();
        if (context == null || (c197039127h = this.LLJILLL) == null) {
            return;
        }
        HandlerHook.viewPost(LJJIJL(), new ARunnableS75S0200000_6((Object) context, (Object) c197039127h, 47));
        C1572910r29.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("show_mobile_creation_tooltip", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TuxNavBar tuxNavBar;
        super.onViewCreated(view);
        C1749280vcc c1749280vcc = (C1749280vcc) LJJIJL().findViewById(R.id.pza);
        c1749280vcc.LJ();
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        this.LLJILLL = (C197039127h) LJJIJL().findViewById(R.id.pzn);
        this.LLJJ = (LinearLayout) LJJIJL().findViewById(R.id.fa6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r1m
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1572980r2G c1572980r2G = (C1572980r2G) obj;
                c1572980r2G.getClass();
                return C627260Oiy.LIZ(c1572980r2G);
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 90), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r1l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1572980r2G) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 91), 4);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0r1n
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1572980r2G c1572980r2G = (C1572980r2G) obj;
                c1572980r2G.getClass();
                return C627260Oiy.LIZLLL(c1572980r2G);
            }
        }, null, new AwS390S0200000_24(this, c1749280vcc, 31), AFwS213S0000000_24.get$arr$(334), new AwS390S0200000_24(this, c1749280vcc, 32), 2, null);
        Go().setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.LLJILJIL = (TuxNavBar) view.findViewById(R.id.pzb);
        if (Lo().LLIZLLLIL == 55) {
            TuxNavBar tuxNavBar2 = this.LLJILJIL;
            if (tuxNavBar2 != null) {
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB.LIZLLL = true;
                c1251150ifB.LIZJ(new AwS568S0100000_24(this, 1806));
                tuxNavBar2.LIZIZ(c1251150ifB);
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = tuxNavBar2.getResources().getString(2131847511);
                tuxNavBar2.LJIJJ(c1250250idj);
            }
        } else {
            TuxNavBar tuxNavBar3 = this.LLJILJIL;
            if (tuxNavBar3 != null) {
                C1251150ifB c1251150ifB2 = new C1251150ifB();
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = R.raw.icon_chevron_left_ltr;
                c1251150ifB2.LIZLLL = true;
                c1251150ifB2.LIZJ(new AwS568S0100000_24(this, 1807));
                tuxNavBar3.LIZIZ(c1251150ifB2);
                C1250250idj c1250250idj2 = new C1250250idj();
                String string = Lo().LLJIJIL;
                if (string == null) {
                    string = tuxNavBar3.getResources().getString(2131847406);
                }
                c1250250idj2.LIZJ = string;
                tuxNavBar3.LJIJJ(c1250250idj2);
            }
            SeriesFeedbackIntegrationURLSetting.FeedbackIntegrationInfoStructJsonModel feedbackIntegrationInfoStructJsonModelLIZ = SeriesFeedbackIntegrationURLSetting.LIZ();
            if (Intrinsics.LJFF(Lo().LLILLL, "personal_homepage") && feedbackIntegrationInfoStructJsonModelLIZ != null && (tuxNavBar = this.LLJILJIL) != null) {
                C1251150ifB c1251150ifB3 = new C1251150ifB();
                c1251150ifB3.LIZLLL();
                c1251150ifB3.LIZJ = R.raw.icon_bubble_ellipsis_right;
                c1251150ifB3.LIZJ(new AwS425S0200000_24(this, feedbackIntegrationInfoStructJsonModelLIZ, 87));
                tuxNavBar.LIZ(c1251150ifB3);
            }
            if (Intrinsics.LJFF(String.valueOf(Lo().LL), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                C1251150ifB c1251150ifB4 = new C1251150ifB();
                c1251150ifB4.LIZLLL();
                c1251150ifB4.LIZJ = R.raw.icon_horn_ltr;
                c1251150ifB4.LIZIZ = "promote";
                c1251150ifB4.LIZJ(new AwS568S0100000_24(this, 1808));
                this.LLJILJILJ = c1251150ifB4;
                TuxNavBar tuxNavBar4 = this.LLJILJIL;
                if (tuxNavBar4 != null) {
                    tuxNavBar4.LIZ(c1251150ifB4);
                }
            }
        }
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("series_search_filter_setting", false)) {
                TextView textView = (TextView) view.findViewById(R.id.f8c);
                C786410Ut5.LJLLLLLL(0, textView);
                textView.addTextChangedListener(new C1620820sHQ(this, 2));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (Lo().LLILZLL) {
            LinearLayout linearLayout = (LinearLayout) LJJIJL().findViewById(R.id.pyz);
            LinearLayout linearLayout2 = (LinearLayout) LJJIJL().findViewById(R.id.pyy);
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(0, linearLayout2);
                linearLayout2.setClickable(false);
                C786410Ut5.R7(linearLayout2, new View.OnClickListener() { // from class: X.0r28
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                    }
                });
            }
            C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r26
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1572980r2G) obj).LLILZIL;
                }
            }, C736820SvI.LIZLLL(), new AwS440S0200000_4(linearLayout, linearLayout2, 24), 4);
            C786410Ut5.R7(linearLayout, new ACListenerS158S0100000_24(this, 101));
        }
    }
}
