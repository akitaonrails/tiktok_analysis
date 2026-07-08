package com.ss.android.ugc.aweme.inbox;

import X.AbstractC1598130rgp;
import X.EnumC1598770rhr;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes25.dex */
public interface IInboxLiveService {
    void callPauseAnimation(RecyclerView.ViewHolder viewHolder, EnumC1598770rhr enumC1598770rhr);

    void callResumeAnimation(RecyclerView.ViewHolder viewHolder, EnumC1598770rhr enumC1598770rhr);

    void compensateLiveShow(RecyclerView.ViewHolder viewHolder);

    Set<Long> getInboxCellMobSet();

    int getInboxSkyLightListScrollState();

    Class<? extends PowerCell<? extends AbstractC1598130rgp>>[] getLiveCells();

    AbstractC1598130rgp mapLiveItem(InboxLiveNotice inboxLiveNotice, boolean z, int i);

    List<AbstractC1598130rgp> mapLiveItems(List<InboxLiveNotice> list, boolean z, boolean z2);

    void realPauseAnimation(RecyclerView.ViewHolder viewHolder);

    void recordRoomInfoList(List<InboxLiveNotice> list);

    void updateInboxListScrollState(int i);

    void watchLive(Context context, InboxLiveNotice inboxLiveNotice, int i);
}
