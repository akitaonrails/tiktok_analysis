package com.ss.android.ugc.aweme.feed.landscape.component;

import X.C1235870iGX;
import X.C1558520qew;
import X.C1603210rp1;
import X.InterfaceC1554640qYg;
import X.InterfaceC1581920rGg;
import X.InterfaceC1603280rp8;
import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedDataLoadLogicAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeLoadMoreAbility;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class LandscapeFeedDataLoadUIComponent extends BasePanelUIComponent implements LandscapeLoadMoreAbility, InterfaceC1554640qYg {
    public C1603210rp1 LLJIJIL;
    public FeedSwipeRefreshLayout LLJILJIL;
    public boolean LLJILJILJ;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1930343144) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeLoadMoreAbility
    public final void Jm() {
        C1603210rp1 c1603210rp1 = this.LLJIJIL;
        if (c1603210rp1 != null) {
            c1603210rp1.LJIIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeLoadMoreAbility
    public final boolean Sw() {
        C1603210rp1 c1603210rp1 = this.LLJIJIL;
        if (c1603210rp1 != null) {
            return c1603210rp1.LJ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeLoadMoreAbility
    public final void showLoadMoreLoading() {
        C1603210rp1 c1603210rp1 = this.LLJIJIL;
        if (c1603210rp1 != null) {
            C1235870iGX c1235870iGXLIZJ = c1603210rp1.LIZJ(true);
            if (c1235870iGXLIZJ != null) {
                c1235870iGXLIZJ.LJIIIIZZ();
            }
            c1603210rp1.LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeLoadMoreAbility
    public final void Mq0(boolean z) {
        this.LLJILJILJ = z;
        C1603210rp1 c1603210rp1 = this.LLJIJIL;
        if (c1603210rp1 != null) {
            c1603210rp1.setSkipTouchEvent(!z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeLoadMoreAbility
    public final void Wi(Exception exc) {
        C1603210rp1 c1603210rp1 = this.LLJIJIL;
        if (c1603210rp1 != null) {
            c1603210rp1.LJIILIIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeLoadMoreAbility
    public final void gC0(boolean z) {
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = this.LLJILJIL;
        if (feedSwipeRefreshLayout != null) {
            feedSwipeRefreshLayout.setEnabled(z);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        FeedSwipeRefreshLayout feedSwipeRefreshLayout;
        C1603210rp1 c1603210rp1;
        VerticalViewPager verticalViewPagerSP1;
        C1603210rp1 c1603210rp12;
        super.onViewCreated(view);
        if (view instanceof FeedSwipeRefreshLayout) {
            feedSwipeRefreshLayout = (FeedSwipeRefreshLayout) view;
        } else {
            feedSwipeRefreshLayout = null;
        }
        this.LLJILJIL = feedSwipeRefreshLayout;
        if (feedSwipeRefreshLayout != null) {
            feedSwipeRefreshLayout.setEnabled(false);
        }
        FeedSwipeRefreshLayout feedSwipeRefreshLayout2 = this.LLJILJIL;
        if (feedSwipeRefreshLayout2 != null) {
            feedSwipeRefreshLayout2.setOnRefreshListener(new InterfaceC1581920rGg() { // from class: X.0rp3
                @Override // X.InterfaceC1581920rGg
                public final void LJFF() {
                    LandscapeFeedDataLoadLogicAbility landscapeFeedDataLoadLogicAbility = (LandscapeFeedDataLoadLogicAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), LandscapeFeedDataLoadLogicAbility.class, null);
                    if (landscapeFeedDataLoadLogicAbility != null) {
                        landscapeFeedDataLoadLogicAbility.PS1();
                    }
                }
            });
        }
        FeedSwipeRefreshLayout feedSwipeRefreshLayout3 = this.LLJILJIL;
        if (feedSwipeRefreshLayout3 != null) {
            c1603210rp1 = (C1603210rp1) feedSwipeRefreshLayout3.findViewById(R.id.nns);
        } else {
            c1603210rp1 = null;
        }
        if (!(c1603210rp1 instanceof C1603210rp1)) {
            c1603210rp1 = null;
        }
        this.LLJIJIL = c1603210rp1;
        if (this.LLJILJILJ) {
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedViewPagerAbility.class, null);
            if (landscapeFeedViewPagerAbility != null && (verticalViewPagerSP1 = landscapeFeedViewPagerAbility.sP1()) != null && (c1603210rp12 = this.LLJIJIL) != null) {
                FeedSwipeRefreshLayout feedSwipeRefreshLayout4 = this.LLJILJIL;
                c1603210rp12.LLILZ = verticalViewPagerSP1;
                c1603210rp12.LLILZIL = feedSwipeRefreshLayout4;
            }
            C1603210rp1 c1603210rp13 = this.LLJIJIL;
            if (c1603210rp13 != null) {
                c1603210rp13.setLoadMoreListener(new InterfaceC1603280rp8() { // from class: X.0rp4
                    @Override // X.InterfaceC1603280rp8
                    public final void LJJIIJ() {
                        LandscapeFeedDataLoadLogicAbility landscapeFeedDataLoadLogicAbility = (LandscapeFeedDataLoadLogicAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), LandscapeFeedDataLoadLogicAbility.class, null);
                        if (landscapeFeedDataLoadLogicAbility != null) {
                            landscapeFeedDataLoadLogicAbility.iw2();
                        }
                    }
                });
            }
            LandscapeFeedDataLoadLogicAbility landscapeFeedDataLoadLogicAbility = (LandscapeFeedDataLoadLogicAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedDataLoadLogicAbility.class, null);
            if (landscapeFeedDataLoadLogicAbility != null) {
                landscapeFeedDataLoadLogicAbility.zR(this, 1, new AwS638S0100000_24(this, 29));
            }
            LandscapeFeedDataLoadLogicAbility landscapeFeedDataLoadLogicAbility2 = (LandscapeFeedDataLoadLogicAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedDataLoadLogicAbility.class, null);
            if (landscapeFeedDataLoadLogicAbility2 != null) {
                landscapeFeedDataLoadLogicAbility2.zR(this, 2, new AwS638S0100000_24(this, 30));
            }
        }
    }
}
