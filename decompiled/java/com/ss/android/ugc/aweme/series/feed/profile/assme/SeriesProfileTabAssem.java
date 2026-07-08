package com.ss.android.ugc.aweme.series.feed.profile.assme;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1155750gBJ;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C1567820qtw;
import X.C1574470r4f;
import X.C1620660sHA;
import X.C1749280vcc;
import X.C20603715jn;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC1574490r4h;
import X.InterfaceC1572870r25;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS226S0100000_24;
import Y.AsS50S0100000_24;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.series.feed.profile.assme.SeriesProfileTabAssem;
import com.ss.android.ugc.aweme.series.feed.profile.view.SeriesFooterCell;
import com.ss.android.ugc.aweme.series.feed.profile.viewmodel.SeriesProfileTabViewModel;
import com.ss.android.ugc.aweme.service.ISeriesETHost;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesProfileTabAssem extends UIListContentAssem<SeriesProfileTabViewModel> {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1155750gBJ.class, "series_profile_hierarchy_data_key"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;
    public AsS50S0100000_24 LLJJ;
    public AObserverS226S0100000_24 LLJJI;

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = !(((C1155750gBJ) this.LLIZLLLIL.getValue()) != null ? r0.LLILLJJLI : false);
        c20603715jn.LIZ = 0;
        c20603715jn.LIZLLL = SeriesFooterCell.class;
        return c20603715jn;
    }

    public final SwipeRefreshLayout Lo() {
        return (SwipeRefreshLayout) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final SeriesProfileTabViewModel Jo() {
        return (SeriesProfileTabViewModel) this.LLJ.getValue();
    }

    public SeriesProfileTabAssem() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 945);
        this.LLJ = new C736950SvV(C13LE.LIZ(SeriesProfileTabViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(289), new AwS568S0100000_24((AbstractC738140SxQ) this, 943), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 942));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 944));
        this.LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 941));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        AsS50S0100000_24 asS50S0100000_24;
        if (so() && (asS50S0100000_24 = this.LLJJ) != null) {
            Go().removeOnScrollListener(asS50S0100000_24);
        }
        AObserverS226S0100000_24 aObserverS226S0100000_24 = this.LLJJI;
        if (aObserverS226S0100000_24 != null) {
            ip().LL.removeObserver(aObserverS226S0100000_24);
        }
        Map<EnumC1574490r4h, Map<String, Aweme>> map = C1574470r4f.LIZ;
        C1574470r4f.LIZLLL(EnumC1574490r4h.OTHERS_HOMEPAGE);
        super.onDestroy();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().setLayoutManager(new GridLayoutManager(getContext(), 1));
        Go().setItemAnimator(null);
        if (ip().vQ2()) {
            Go().addItemDecoration(new C1620660sHA(this, 0));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        AsS50S0100000_24 asS50S0100000_24 = new AsS50S0100000_24(this, 4);
        this.LLJJ = asS50S0100000_24;
        viewOnAttachStateChangeListenerC20604515jvGo.addOnScrollListener(asS50S0100000_24);
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.w28);
        MutableLiveData<C1567820qtw<Boolean>> mutableLiveData = ip().LL;
        AObserverS226S0100000_24 aObserverS226S0100000_24 = new AObserverS226S0100000_24(this, 6);
        this.LLJJI = aObserverS226S0100000_24;
        mutableLiveData.observeForever(aObserverS226S0100000_24);
        Lo().setOnRefreshListener(new InterfaceC1572870r25() { // from class: X.0r1t
            @Override // X.InterfaceC1572870r25
            public final void LJFF() {
                SeriesProfileTabAssem seriesProfileTabAssem = this.LIZ;
                seriesProfileTabAssem.LLJILJILJ = seriesProfileTabAssem.Go().getState().LJIIIIZZ() > 0;
                this.LIZ.Lo().setRefreshing(this.LIZ.LLJILJILJ);
                SeriesProfileTabAssem seriesProfileTabAssem2 = this.LIZ;
                seriesProfileTabAssem2.LLJILJIL = seriesProfileTabAssem2.LLJILJILJ;
                SeriesProfileTabViewModel seriesProfileTabViewModelIp = seriesProfileTabAssem2.ip();
                seriesProfileTabViewModelIp.LLILLJJLI.clear();
                seriesProfileTabViewModelIp.manualListRefresh();
            }
        });
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r1v
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1572990r2H) obj).LL);
            }
        }, null, new AwS638S0100000_24(this, 70), 6);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0r1u
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1572990r2H c1572990r2H = (C1572990r2H) obj;
                c1572990r2H.getClass();
                return C627260Oiy.LIZLLL(c1572990r2H);
            }
        }, null, new AwS390S0200000_24(this, c1749280vcc, 24), new AwS425S0200000_24(this, c1749280vcc, 36), new AwS390S0200000_24(this, c1749280vcc, 25), 2, null);
        ISeriesETHost iSeriesETHost = (ISeriesETHost) PluggableExtentionKt.pluggableSpi$default(ISeriesETHost.class, false, false, false, 14, null);
        if (iSeriesETHost != null) {
            iSeriesETHost.LIZ();
        }
    }
}
