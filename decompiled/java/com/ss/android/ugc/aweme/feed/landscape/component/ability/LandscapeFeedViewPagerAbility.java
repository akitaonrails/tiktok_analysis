package com.ss.android.ugc.aweme.feed.landscape.component.ability;

import X.C0SZ8;
import X.InterfaceC494301wD;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public interface LandscapeFeedViewPagerAbility extends InterfaceC494301wD {
    Aweme BD1();

    C0SZ8 D();

    C0SZ8 F();

    C0SZ8 LJJIJIL(String str);

    C0SZ8 LJLIL();

    int LJLLJ();

    Aweme LLLLLJLJLL();

    void SB();

    void bY0(LifecycleOwner lifecycleOwner, Function2<? super Integer, ? super Boolean, Unit> function2);

    Aweme d2(int i);

    int getItemCount();

    int hu(Aweme aweme);

    VerticalViewPager sP1();

    void to(int i);
}
