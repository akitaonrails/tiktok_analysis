package com.ss.android.ugc.aweme.story.friends;

import X.C03H5;
import X.C13IQ;
import X.InterfaceC1570900qyu;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public interface IStoryFriendsService {
    Pair<C13IQ<? extends UISlotAssem>, C13IQ<? extends ReusedAssem<? extends C03H5>>> getFriendsDetailViewerEntranceAssem();

    C13IQ<? extends UIContentAssem> getToolBarAssem();

    InterfaceC1570900qyu newStoryToolBarViewGenerator();
}
