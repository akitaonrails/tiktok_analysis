package com.ss.android.ugc.aweme.experiment;

import X.C1514430pVp;
import X.C1697810uHb;
import X.C307020C1s;
import X.EnumC1584360rKc;
import com.ss.android.ugc.aweme.spi.ITabConfigService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes5.dex */
public final class MainTabConfigServiceImpl implements ITabConfigService {
    @Override // com.ss.android.ugc.aweme.spi.ITabConfigService
    public final List<TopTabItem> LIZ() {
        return C1697810uHb.LJIILJJIL(new TopTabItem(EnumC1584360rKc.FOLLOWING.getKey(), null, null, null, null, null, null), new TopTabItem(EnumC1584360rKc.HOT.getKey(), null, null, null, null, null, null));
    }

    @Override // com.ss.android.ugc.aweme.spi.ITabConfigService
    public final TabConfig LIZJ() {
        return new TabConfig(Boolean.TRUE, null, null, null, null, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.spi.ITabConfigService
    public final boolean LIZLLL() {
        return C307020C1s.LIZ() || !C1514430pVp.LIZLLL().booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.spi.ITabConfigService
    public final Map LIZIZ(AFwS213S0000000_24 aFwS213S0000000_24) {
        return (Map) aFwS213S0000000_24.invoke();
    }

    @Override // com.ss.android.ugc.aweme.spi.ITabConfigService
    public final List LJ(AFwS213S0000000_24 aFwS213S0000000_24) {
        return (List) aFwS213S0000000_24.invoke();
    }

    @Override // com.ss.android.ugc.aweme.spi.ITabConfigService
    public final Map LJFF(AFwS213S0000000_24 aFwS213S0000000_24) {
        return (Map) aFwS213S0000000_24.invoke();
    }
}
