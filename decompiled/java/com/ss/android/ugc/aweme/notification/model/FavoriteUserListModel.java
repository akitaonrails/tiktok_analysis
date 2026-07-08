package com.ss.android.ugc.aweme.notification.model;

import X.AbstractC666100QAu;
import X.C15O7;
import X.C1697810uHb;
import X.C1908260zl2;
import X.C1908300zl6;
import X.C1909140zmS;
import X.C1C7U;
import X.InterfaceC1526205yG;
import X.InterfaceC2385309Wh;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.notification.bean.FavoriteListResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class FavoriteUserListModel extends AbstractC666100QAu<FavoriteListResponse> {
    public final String awemeId;
    public boolean isLoadMore;
    public final long lastReadTimestamp;
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
        FavoriteListResponse data = getData();
        fetchFavoriteUserListInNotice(data != null ? data.cursor : 0L);
    }

    public final void refresh() {
        this.isLoadMore = false;
        FavoriteListResponse data = getData();
        fetchFavoriteUserListInNotice(data != null ? data.cursor : 0L);
    }

    public final boolean isLoadMore() {
        return this.isLoadMore;
    }

    private final void fetchFavoriteUserListInNotice(long j) {
        C1909140zmS.LIZJ(j, this.awemeId).LJ(new InterfaceC2385309Wh() { // from class: com.ss.android.ugc.aweme.notification.model.FavoriteUserListModel.fetchFavoriteUserListInNotice.1
            /* JADX INFO: renamed from: then, reason: collision with other method in class */
            public final void m293then(C15O7<FavoriteListResponse> c15o7) {
                AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28((BaseResponse) c15o7.LJIIL(), 183);
                C1908260zl2 c1908260zl2 = C1908300zl6.LIZ;
                if (c1908260zl2 != null) {
                    awS607S0100000_28.invoke(c1908260zl2);
                }
                if (c15o7.LJIILL()) {
                    List<InterfaceC1526205yG> list = FavoriteUserListModel.this.mNotifyListeners;
                    if (list != null) {
                        Iterator<InterfaceC1526205yG> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onFailed(c15o7.LJIIJJI());
                        }
                        return;
                    }
                    return;
                }
                FavoriteUserListModel.this.handleData(c15o7.LJIIL());
                List<InterfaceC1526205yG> list2 = FavoriteUserListModel.this.mNotifyListeners;
                if (list2 != null) {
                    Iterator<InterfaceC1526205yG> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        it3.next().onSuccess();
                    }
                }
            }

            @Override // X.InterfaceC2385309Wh
            public /* bridge */ /* synthetic */ Object then(C15O7 c15o7) {
                C1C7U.LIZ("FavoriteUserListModel@5fdf.fetchFavoriteUserListInNotice$1");
                m293then((C15O7<FavoriteListResponse>) c15o7);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FavoriteUserListModel@5fdf.fetchFavoriteUserListInNotice$1");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC666100QAu
    public void handleData(FavoriteListResponse favoriteListResponse) {
        int i;
        String uid;
        if (favoriteListResponse == 0) {
            this.mData = null;
            return;
        }
        List<DiggInfo> list = favoriteListResponse.diggInfos;
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            List<DiggInfo> arrayList = favoriteListResponse.diggInfos;
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
            favoriteListResponse.diggInfos = arrayList;
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
            FavoriteListResponse favoriteListResponse2 = (FavoriteListResponse) this.mData;
            if (favoriteListResponse2 != null) {
                i2 = favoriteListResponse2.LL;
            }
            favoriteListResponse.LL = i2 + i;
        } else {
            favoriteListResponse.hasMore = 0;
        }
        this.mData = favoriteListResponse;
    }

    public final void setLoadMore(boolean z) {
        this.isLoadMore = z;
    }

    public FavoriteUserListModel(String str, long j) {
        this.awemeId = str;
        this.lastReadTimestamp = j;
    }
}
