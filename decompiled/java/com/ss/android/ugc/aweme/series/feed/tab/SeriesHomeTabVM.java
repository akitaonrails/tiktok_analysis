package com.ss.android.ugc.aweme.series.feed.tab;

import X.C01GW;
import X.C0W93;
import X.C1440005kM;
import X.C1577250r99;
import X.C1577850rA7;
import X.C1581940rGi;
import X.C2097608Jq;
import X.C452501pT;
import X.C622680Oba;
import X.C818480W8w;
import X.EnumC1584370rKd;
import X.InterfaceC0148002o;
import X.InterfaceC1574160r4A;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.BaseSeriesTopTabVM;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesHomeTabVM extends BaseSeriesTopTabVM<C1577850rA7> {
    public static final EnumC1584370rKd LLJIJIL = EnumC1584370rKd.SERIES;
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.topfeed.BaseSeriesTopTabVM
    public final void CQ2() {
        C818480W8w.LIZJ("homepage_series", C0W93.SUCCESS, null, C2097608Jq.LJ());
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.topfeed.BaseSeriesTopTabVM
    public final String getEnterFrom() {
        return "homepage_series";
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.topfeed.BaseSeriesTopTabVM
    public final void DQ2() {
        C818480W8w.LIZ("homepage_series");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.0rA7
        };
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.topfeed.BaseSeriesTopTabVM
    public final ISeriesLimitedFreeService vQ2() {
        return (ISeriesLimitedFreeService) this.LLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.topfeed.BaseSeriesTopTabVM
    public final void yQ2() {
        C1440005kM.LIZ(new C1581940rGi("HOME"));
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.topfeed.BaseSeriesTopTabVM
    public final C1577250r99 wQ2() {
        return C1577250r99.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.topfeed.BaseSeriesTopTabVM
    public final void xQ2(InterfaceC1574160r4A interfaceC1574160r4A) {
        C622680Oba.LIZIZ(interfaceC1574160r4A);
    }
}
