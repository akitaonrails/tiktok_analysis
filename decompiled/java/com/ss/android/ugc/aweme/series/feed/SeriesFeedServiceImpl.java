package com.ss.android.ugc.aweme.series.feed;

import X.C01GW;
import X.C11S5;
import X.C1576890r8Z;
import X.C1576990r8j;
import X.C452501pT;
import X.InterfaceC1577280r9C;
import X.InterfaceC1577520r9a;
import Y.ARunnableS124S0100000_24;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public class SeriesFeedServiceImpl implements ISeriesFeedService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(272));
    public final C1576890r8Z LIZIZ = C1576890r8Z.LIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(271));

    @Override // com.ss.android.ugc.aweme.series.feed.ISeriesFeedService
    public final InterfaceC1577280r9C LIZ() {
        return (InterfaceC1577280r9C) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.series.feed.ISeriesFeedService
    public final InterfaceC1577520r9a LIZIZ() {
        return (InterfaceC1577520r9a) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.series.feed.ISeriesFeedService
    public final C1576890r8Z LIZLLL() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.series.feed.ISeriesFeedService
    public final void LIZJ(SkylightCommonItem skylightCommonItem) {
        C1576990r8j.LIZ.getClass();
        C11S5.LIZ().LIZIZ(new ARunnableS124S0100000_24(skylightCommonItem, 4));
    }
}
