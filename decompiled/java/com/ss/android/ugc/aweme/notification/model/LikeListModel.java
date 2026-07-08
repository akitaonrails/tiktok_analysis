package com.ss.android.ugc.aweme.notification.model;

import X.AbstractC666100QAu;
import X.C15O7;
import X.C1606010rtX;
import X.C1697810uHb;
import X.C1908260zl2;
import X.C1908300zl6;
import X.C1909140zmS;
import X.C1C7U;
import X.EnumC1606080rte;
import X.EnumC1615506Uf;
import X.InterfaceC1526205yG;
import X.InterfaceC2385309Wh;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.notification.bean.LikeListResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class LikeListModel extends AbstractC666100QAu<LikeListResponse> {
    public final int diggType;
    public boolean isLoadMore;
    public final boolean isNew;
    public final long lastReadTimestamp;
    public final HashSet<String> mLoadedIds = new HashSet<>();
    public final String refId;
    public final String secUserIds;
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;

    public static final class Companion {
    }

    @Override // X.AbstractC666100QAu
    public boolean checkParams(Object... objArr) {
        return true;
    }

    public final void loadMore() {
        this.isLoadMore = true;
        LikeListResponse data = getData();
        long j = data != null ? data.maxCursor : 0L;
        LikeListResponse data2 = getData();
        fetchLikeList(j, data2 != null ? data2.minCursor : 0L);
    }

    public final void refresh() {
        this.isLoadMore = false;
        fetchLikeList(0L, 0L);
    }

    public final boolean isLoadMore() {
        return this.isLoadMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC666100QAu
    public void handleData(LikeListResponse likeListResponse) {
        int i;
        String uid;
        if (likeListResponse == 0) {
            this.mData = null;
            return;
        }
        List<DiggInfo> list = likeListResponse.diggInfos;
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            List<DiggInfo> arrayList = likeListResponse.diggInfos;
            if (arrayList != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (DiggInfo diggInfo : arrayList) {
                    User user = diggInfo.user;
                    if (user != null) {
                        uid = user.getUid();
                    } else {
                        uid = null;
                    }
                    if (hashSet.add(uid)) {
                        arrayList2.add(diggInfo);
                    }
                }
                arrayList = new ArrayList<>(arrayList2);
            }
            likeListResponse.diggInfos = arrayList;
            if (this.lastReadTimestamp > 0 && arrayList != null && !arrayList.isEmpty()) {
                Iterator<DiggInfo> it2 = arrayList.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (it2.next().timestamp >= this.lastReadTimestamp && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            LikeListResponse likeListResponse2 = (LikeListResponse) this.mData;
            if (likeListResponse2 != null) {
                i2 = likeListResponse2.LL;
            }
            likeListResponse.LL = i2 + i;
        } else {
            likeListResponse.hasMore = 0;
        }
        this.mData = likeListResponse;
        C1606010rtX.LIZIZ.LIZJ(EnumC1615506Uf.STORY, EnumC1606080rte.INBOX, likeListResponse.diggInfos, AFwS271S0000000_28.get$arr$(168));
    }

    public final void setLoadMore(boolean z) {
        this.isLoadMore = z;
    }

    private final void fetchLikeList(long j, long j2) {
        C1909140zmS.LIZLLL(j, j2, this.isNew, this.diggType, this.refId, this.secUserIds).LJ(new InterfaceC2385309Wh() { // from class: com.ss.android.ugc.aweme.notification.model.LikeListModel.fetchLikeList.1
            /* JADX INFO: renamed from: then, reason: collision with other method in class */
            public final void m294then(C15O7<LikeListResponse> c15o7) {
                AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28((BaseResponse) c15o7.LJIIL(), 183);
                C1908260zl2 c1908260zl2 = C1908300zl6.LIZ;
                if (c1908260zl2 != null) {
                    awS607S0100000_28.invoke(c1908260zl2);
                }
                if (c15o7.LJIILL()) {
                    List<InterfaceC1526205yG> list = LikeListModel.this.mNotifyListeners;
                    if (list != null) {
                        Iterator<InterfaceC1526205yG> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onFailed(c15o7.LJIIJJI());
                        }
                        return;
                    }
                    return;
                }
                LikeListModel.this.handleData(c15o7.LJIIL());
                List<InterfaceC1526205yG> list2 = LikeListModel.this.mNotifyListeners;
                if (list2 != null) {
                    Iterator<InterfaceC1526205yG> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        it3.next().onSuccess();
                    }
                }
            }

            @Override // X.InterfaceC2385309Wh
            public /* bridge */ /* synthetic */ Object then(C15O7 c15o7) {
                C1C7U.LIZ("LikeListModel@7f55.fetchLikeList$1");
                m294then((C15O7<LikeListResponse>) c15o7);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LikeListModel@7f55.fetchLikeList$1");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    public LikeListModel(String str, boolean z, int i, long j, String str2) {
        this.refId = str;
        this.isNew = z;
        this.diggType = i;
        this.lastReadTimestamp = j;
        this.secUserIds = str2;
    }
}
