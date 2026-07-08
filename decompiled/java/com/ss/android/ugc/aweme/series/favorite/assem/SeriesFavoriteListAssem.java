package com.ss.android.ugc.aweme.series.favorite.assem;

import X.AbstractC738140SxQ;
import X.AnonymousClass0357;
import X.C01GW;
import X.C118300cf;
import X.C1220000hqw;
import X.C13LE;
import X.C14EU;
import X.C1559260qg8;
import X.C1572480r1S;
import X.C1572600r1e;
import X.C1572960r2E;
import X.C1573950r3p;
import X.C1749280vcc;
import X.C20603715jn;
import X.C2217381BqS;
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
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.series.favorite.appdiff.SeriesFavoriteAppDiffProtocol;
import com.ss.android.ugc.aweme.series.serieslist.viewmodel.SeriesListAssemViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesFavoriteListAssem extends UIListContentAssem<SeriesListAssemViewModel> {
    public final SeriesFavoriteAppDiffProtocol LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final C736950SvV LLJI;
    public C1749280vcc LLJIJIL;
    public boolean LLJILJIL;
    public List<C1573950r3p> LLJILJILJ;
    public final C01GW LLJILLL;
    public final C1572480r1S LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        this.LLIZLLLIL.LIZ();
        c20603715jn.LIZ = 4;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    public final boolean Lo() {
        this.LLIZLLLIL.LJFF();
        return false;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final SeriesListAssemViewModel Jo() {
        return (SeriesListAssemViewModel) this.LLJI.getValue();
    }

    public SeriesFavoriteListAssem() {
        SeriesFavoriteAppDiffProtocol.LIZ.getClass();
        this.LLIZLLLIL = C1572600r1e.LIZ();
        this.LLJ = new C1559260qg8(new C723590SZx(this, C1572960r2E.class, "paid_content_collection_list_hierarchy_data_key"), checkSupervisorPrepared());
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 915);
        this.LLJI = new C736950SvV(C13LE.LIZ(SeriesListAssemViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(277), new AwS568S0100000_24((AbstractC738140SxQ) this, 914), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 911));
        this.LLJJ = new C1572480r1S(new AwS568S0100000_24(this, 910));
        this.LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 913));
        this.LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 912));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        if (Lo()) {
            EventBus.LIZLLL().LJIJJ(this);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (Lo()) {
            EventBus.LIZLLL().LJJI(this);
            C1572480r1S c1572480r1S = this.LLJJ;
            ((ArrayList) c1572480r1S.LIZIZ).clear();
            c1572480r1S.getClass();
            c1572480r1S.getClass();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(AnonymousClass0357 anonymousClass0357) {
        Lo();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1749280vcc c1749280vcc = (C1749280vcc) LJJIJL().findViewById(R.id.pza);
        c1749280vcc.LJ();
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        Lo();
        this.LLJIJIL = c1749280vcc;
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r1R
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1572980r2G c1572980r2G = (C1572980r2G) obj;
                c1572980r2G.getClass();
                return C627260Oiy.LIZ(c1572980r2G);
            }
        }, null, new AwS638S0100000_24(this, 63), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r1V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1572980r2G) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 64), 4);
        C118300cf c118300cf = new C118300cf();
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0r1Q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1572980r2G c1572980r2G = (C1572980r2G) obj;
                c1572980r2G.getClass();
                return C627260Oiy.LIZLLL(c1572980r2G);
            }
        }, null, new AwS603S0100000_24(this, 195), new AwS425S0200000_24(this, c118300cf, 34), new AwS390S0200000_24(this, c118300cf, 21), 2, null);
    }
}
