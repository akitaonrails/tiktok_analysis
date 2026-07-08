package com.ss.android.ugc.feed.platform.panel.live;

import X.C1A5A;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveGameBottomBannerComponent extends BasePanelComponent implements IGameLiveAbility, InterfaceC1554640qYg {
    public final Map<String, C1A5A> LL = new ConcurrentHashMap();

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 861651795) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((ConcurrentHashMap) this.LL).clear();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.live.IGameLiveAbility
    public final C1A5A Wj2(String str) {
        return (C1A5A) ((ConcurrentHashMap) this.LL).get(str);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.live.IGameLiveAbility
    public final void ej1(String str, C1A5A c1a5a) {
        ((ConcurrentHashMap) this.LL).put(str, c1a5a);
    }
}
