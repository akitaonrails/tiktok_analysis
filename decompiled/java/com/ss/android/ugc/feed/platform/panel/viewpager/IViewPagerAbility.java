package com.ss.android.ugc.feed.platform.panel.viewpager;

import X.InterfaceC1368705Xh;
import X.InterfaceC21604719gr;
import X.InterfaceC494301wD;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;

/* JADX INFO: loaded from: classes25.dex */
public interface IViewPagerAbility extends InterfaceC494301wD {
    void Em(boolean z);

    void K62();

    int LJIL();

    PagerAdapter LJJLIIIJL();

    void LLFFF(int i, boolean z);

    int LLLIIIL();

    int MC0();

    InterfaceC1368705Xh Ru();

    void bY1();

    void f02(InterfaceC21604719gr interfaceC21604719gr);

    int getHeight();

    View getView();

    VerticalViewPager j51();

    boolean post(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j);

    boolean removeCallbacks(Runnable runnable);

    void t21(boolean z);
}
