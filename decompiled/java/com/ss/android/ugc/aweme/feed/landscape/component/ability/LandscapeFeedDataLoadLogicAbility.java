package com.ss.android.ugc.aweme.feed.landscape.component.ability;

import X.InterfaceC494301wD;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public interface LandscapeFeedDataLoadLogicAbility extends InterfaceC494301wD {
    void PS1();

    void as1(LandscapeProfileListViewModel landscapeProfileListViewModel, Aweme aweme);

    void iw2();

    void vK1(int i);

    void zR(LifecycleOwner lifecycleOwner, int i, Function2<? super List<? extends Aweme>, ? super Boolean, Unit> function2);
}
