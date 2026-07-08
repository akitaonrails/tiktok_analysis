package com.ss.android.ugc.aweme.story.inbox;

import X.AbstractC738140SxQ;
import X.C11NZ;
import X.C13IQ;
import X.C1598870ri1;
import X.EnumC1596540reG;
import X.InterfaceC1597940rgW;
import X.InterfaceC1891350zJl;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;

/* JADX INFO: loaded from: classes25.dex */
public interface IStoryInboxService {
    boolean canShowStoryCell();

    void cancelPreloadTask();

    C1598870ri1 convertDayResponseToItem(OnThisDayResponse onThisDayResponse);

    C11NZ<StoryGetFeedByPageResponse> fetchStoryItems(long j, long j2, String str, EnumC1596540reG enumC1596540reG, int i, String str2);

    Class<? extends PowerCell<? extends InterfaceC1891350zJl>>[] getOnThisDayCell();

    InterfaceC1597940rgW getOnThisDayService();

    Class<? extends PowerCell<? extends InterfaceC1891350zJl>>[] getStoryCell();

    Class<? extends PowerLoadingCell> getStoryFooterCell();

    C13IQ<? extends AbstractC738140SxQ> getStoryInboxPreloadComponent();

    C13IQ<? extends AbstractC738140SxQ> getStoryInboxPreloadComponentV2();

    void markColdStart();

    void preloadData();

    void preloadOnBoot();

    void registerStoryInnerPushHandler();

    void resetDataCenterStatus();

    void sendViewedMemorableView(String str);

    boolean shouldShowShootingEntrance(boolean z, boolean z2);
}
