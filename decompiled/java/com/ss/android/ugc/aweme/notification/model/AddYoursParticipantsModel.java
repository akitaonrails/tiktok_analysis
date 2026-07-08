package com.ss.android.ugc.aweme.notification.model;

import X.AbstractC666100QAu;
import X.C01GW;
import X.C15438062q;
import X.C1935107i1;
import X.C1BVK;
import X.C1C7U;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursNoticeVideosResp;
import com.ss.android.ugc.tiktok.addyours.service.IAddYoursService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class AddYoursParticipantsModel extends AbstractC666100QAu<AddYoursNoticeVideosResp> {
    public static final int $stable = 8;
    public long cursor;
    public boolean hasMore;
    public boolean isLoadMore;
    public List<DiggInfo> newList;
    public final String passThrough;
    public final Long topicId;
    public final C01GW aySvc$delegate = C1935107i1.LIZ(AFwS217S0000000_28.get$arr$(279));
    public final List<DiggInfo> diggInfos = new ArrayList();

    @Override // X.AbstractC666100QAu
    public boolean checkParams(Object... objArr) {
        return true;
    }

    public final void loadMore() {
        this.isLoadMore = true;
        fetchFavoriteUserListInNotice(this.cursor);
    }

    public final void refresh() {
        this.isLoadMore = false;
        fetchFavoriteUserListInNotice(0L);
    }

    public final IAddYoursService getAySvc() {
        return (IAddYoursService) this.aySvc$delegate.getValue();
    }

    public final List<DiggInfo> getDiggInfos() {
        return this.diggInfos;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<DiggInfo> getNewList() {
        return this.newList;
    }

    public final boolean isLoadMore() {
        return this.isLoadMore;
    }

    private final List<DiggInfo> diggInfo(List<? extends Aweme> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<? extends Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(diggInfo(it2.next()));
            }
            return arrayList;
        }
        return null;
    }

    private final void fetchFavoriteUserListInNotice(final long j) {
        Long l = this.topicId;
        if (l != null) {
            final long jLongValue = l.longValue();
            C1BVK.LIZIZ().LIZ(this.mHandler, new Callable() { // from class: com.ss.android.ugc.aweme.notification.model.AddYoursParticipantsModel$fetchFavoriteUserListInNotice$1$1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("AddYoursParticipantsModel@6f47.fetchFavoriteUserListInNotice$1$1");
                    AddYoursNoticeVideosResp addYoursNoticeVideosRespLJIILIIL = this.this$0.getAySvc().LJIILIIL(20, jLongValue, j, this.this$0.passThrough);
                    C1C7U.LIZIZ("AddYoursParticipantsModel@6f47.fetchFavoriteUserListInNotice$1$1");
                    return addYoursNoticeVideosRespLJIILIIL;
                }
            }, 0);
        }
    }

    @Override // X.AbstractC666100QAu
    public void handleData(AddYoursNoticeVideosResp addYoursNoticeVideosResp) {
        boolean zBooleanValue;
        super.handleData(addYoursNoticeVideosResp);
        if (addYoursNoticeVideosResp == null) {
            return;
        }
        this.newList = diggInfo(addYoursNoticeVideosResp.videos);
        Boolean bool = addYoursNoticeVideosResp.hasMore;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.hasMore = zBooleanValue;
        if (addYoursNoticeVideosResp.cursor != null) {
            this.cursor = r0.intValue();
        }
        if (!this.isLoadMore) {
            this.diggInfos.clear();
        }
        List<DiggInfo> list = this.newList;
        if (list != null) {
            this.diggInfos.addAll(list);
        }
    }

    public final void setLoadMore(boolean z) {
        this.isLoadMore = z;
    }

    private final DiggInfo diggInfo(Aweme aweme) {
        DiggInfo diggInfo = new DiggInfo();
        diggInfo.user = aweme.getAuthor();
        diggInfo.aweme = aweme;
        return diggInfo;
    }

    public AddYoursParticipantsModel(Long l, String str) {
        this.topicId = l;
        this.passThrough = str;
    }
}
