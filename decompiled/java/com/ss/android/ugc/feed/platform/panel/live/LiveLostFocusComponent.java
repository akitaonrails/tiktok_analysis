package com.ss.android.ugc.feed.platform.panel.live;

import X.C01GW;
import X.C452501pT;
import X.C786130Usd;
import android.util.LruCache;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveLostFocusComponent extends BasePanelComponent {
    public long LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public LruCache<Integer, Long> LLILZLL;
    public C786130Usd LLIZ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 646));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 311));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 310));

    public final void bo() {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        this.LLILLJJLI = 0L;
        this.LLILZ = 0;
        LruCache<Integer, Long> lruCache = this.LLILZLL;
        if (lruCache == null) {
            lruCache = null;
        }
        lruCache.evictAll();
        if (this.LLIZ == null || (iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue()) == null) {
            return;
        }
        C786130Usd c786130Usd = this.LLIZ;
        iViewPagerComponentAbility.Xl0(c786130Usd != null ? c786130Usd : null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        bo();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        this.LLILZLL = new LruCache<>(16);
        this.LLILLJJLI = 0L;
        this.LLIZ = new C786130Usd(this, 9);
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue();
        if (iViewPagerComponentAbility != null) {
            C786130Usd c786130Usd = this.LLIZ;
            if (c786130Usd == null) {
                c786130Usd = null;
            }
            iViewPagerComponentAbility.Bv0(c786130Usd);
        }
    }
}
