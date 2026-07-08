package com.ss.android.ugc.aweme.feed.landscape.component;

import X.C01GW;
import X.C1390410mHn;
import X.C14EU;
import X.C1558520qew;
import X.C2248751Czx;
import X.C452501pT;
import X.C724240Sb0;
import X.C726660Seu;
import X.C786410Ut5;
import X.C823050WQl;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ARunnableS102S0100000_2;
import android.view.View;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedLoadingAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeFeedLoadingComponent extends BasePanelUIComponent implements LandscapeFeedLoadingAbility, InterfaceC1554640qYg {
    public long LLJIJIL;
    public boolean LLJILJIL;
    public C1390410mHn LLJILJILJ;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 413));

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2048925869) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedLoadingAbility
    public final void De() {
        C1390410mHn c1390410mHn = this.LLJILJILJ;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
            C786410Ut5.LLLZZIL(c1390410mHn, 8);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C823050WQl.LIZIZ().execute(new ARunnableS102S0100000_2(this, 21));
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) this.LLJILLL.getValue();
        if (landscapeFeedViewPagerAbility != null) {
            landscapeFeedViewPagerAbility.bY0(this, new AwS616S0100000_2(this, 26));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C823050WQl.LIZIZ().execute(new ARunnableS102S0100000_2(this, 22));
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedLoadingAbility
    public final void Ud(int i) {
        long jLLLJL;
        if (i != 2) {
            LandscapeFeedPlayerAbility landscapeFeedPlayerAbility = (LandscapeFeedPlayerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedPlayerAbility.class, null);
            if (landscapeFeedPlayerAbility != null) {
                jLLLJL = landscapeFeedPlayerAbility.LLLJL();
            } else {
                jLLLJL = this.LLJIJIL;
            }
            this.LLJIJIL = jLLLJL;
            C1390410mHn c1390410mHn = this.LLJILJILJ;
            if (c1390410mHn != null) {
                C786410Ut5.LLLZZIL(c1390410mHn, 0);
                c1390410mHn.LIZJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedLoadingAbility
    public final void eR(long j) {
        C1390410mHn c1390410mHn = this.LLJILJILJ;
        if (c1390410mHn != null && c1390410mHn.getVisibility() == 0) {
            if (this.LLJILJIL) {
                this.LLJILJIL = false;
                return;
            } else {
                if (Math.abs(this.LLJIJIL - j) > 100) {
                    De();
                    this.LLJIJIL = j;
                    return;
                }
                return;
            }
        }
        this.LLJIJIL = j;
    }

    @C14EU
    public final void onPlayerControllerVideoPlayProgressChange(C2248751Czx c2248751Czx) {
        eR(c2248751Czx.LJFF);
    }

    @C14EU
    public void onSeekChangeEvent(C726660Seu c726660Seu) {
        LandscapeFeedPlayerAbility landscapeFeedPlayerAbility;
        if (Intrinsics.LJFF(C724240Sb0.LIZ(this), c726660Seu.LIZ) && (landscapeFeedPlayerAbility = (LandscapeFeedPlayerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedPlayerAbility.class, null)) != null) {
            landscapeFeedPlayerAbility.LJIILL(c726660Seu.LIZIZ);
            C1390410mHn c1390410mHn = this.LLJILJILJ;
            if (c1390410mHn != null && c1390410mHn.getVisibility() == 0) {
                this.LLJIJIL = (long) ((c726660Seu.LIZIZ * landscapeFeedPlayerAbility.K2()) / 100);
                this.LLJILJIL = true;
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJILJILJ = (C1390410mHn) view.findViewById(R.id.cxw);
    }
}
