package com.ss.android.ugc.aweme.paidcontent.assem;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C1220000hqw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C1559260qg8;
import X.C1572960r2E;
import X.C1611550s2T;
import X.C1612490s3z;
import X.C1749280vcc;
import X.C197039127h;
import X.C1BWL;
import X.C20603715jn;
import X.C2188811AlT;
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
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.series.serieslist.viewmodel.SeriesListAssemViewModel;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesPromoteListAssem extends UIListContentAssem<SeriesListAssemViewModel> {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1572960r2E.class, "paid_content_collection_list_hierarchy_data_key"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public final C01GW LLJI;
    public C1749280vcc LLJIJIL;
    public C197039127h LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 4;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    public final C1572960r2E Lo() {
        return (C1572960r2E) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final SeriesListAssemViewModel Jo() {
        return (SeriesListAssemViewModel) this.LLJ.getValue();
    }

    public SeriesPromoteListAssem() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 830);
        this.LLJ = new C736950SvV(C13LE.LIZ(SeriesListAssemViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(245), new AwS568S0100000_24((AbstractC738140SxQ) this, 829), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(253));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 828));
        this.LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 827));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1749280vcc c1749280vcc = (C1749280vcc) LJJIJL().findViewById(R.id.s_p);
        this.LLJIJIL = c1749280vcc;
        C197039127h c197039127h = null;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        c1749280vcc.LJ();
        C1749280vcc c1749280vcc2 = this.LLJIJIL;
        if (c1749280vcc2 == null) {
            c1749280vcc2 = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r2B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1572980r2G) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 57), 4);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0r2A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1572980r2G c1572980r2G = (C1572980r2G) obj;
                c1572980r2G.getClass();
                return C627260Oiy.LIZLLL(c1572980r2G);
            }
        }, null, new AwS603S0100000_24(this, 166), AFwS213S0000000_24.get$arr$(254), new AwS603S0100000_24(this, 167), 2, null);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.s_t);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS568S0100000_24(this, 1841));
        tuxNavBar.LIZIZ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1BWL.LIZJ().getString(2131847405));
        sbLIZ.append(' ');
        c1250250idj.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        c1250250idj.LJFF = R.raw.icon_info_circle;
        c1250250idj.LJI = null;
        c1250250idj.LIZ(new AwS568S0100000_24(this, 1842));
        tuxNavBar.LJIJJ(c1250250idj);
        C197039127h c197039127h2 = (C197039127h) view.findViewById(R.id.s_b);
        this.LLJILJIL = c197039127h2;
        if (c197039127h2 == null) {
            c197039127h2 = null;
        }
        c197039127h2.setText(C1BWL.LIZJ().getString(2131847550));
        C197039127h c197039127h3 = this.LLJILJIL;
        if (c197039127h3 == null) {
            c197039127h3 = null;
        }
        c197039127h3.setEnabled(false);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r2C
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1572980r2G) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 299), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r2D
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1572980r2G) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(view, 143), 4);
        C197039127h c197039127h4 = this.LLJILJIL;
        if (c197039127h4 != null) {
            c197039127h = c197039127h4;
        }
        C786410Ut5.U8(c197039127h, new ACListenerS158S0100000_24(this, 114));
        C1612490s3z c1612490s3z = C1612490s3z.LJI;
        String str = Lo().LLILLL;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        c1612490s3z.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("author_id", curUserId);
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("show_add_series_to_post", c2344009Gk.LIZ);
        }
    }
}
