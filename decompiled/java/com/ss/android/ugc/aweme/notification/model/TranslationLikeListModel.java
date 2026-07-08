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
import com.ss.android.ugc.aweme.notification.bean.TranslationLikeListResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class TranslationLikeListModel extends AbstractC666100QAu<TranslationLikeListResponse> {
    public static final int $stable = 8;
    public boolean isLoadMore;
    public final String itemId;
    public final long lastReadTimestamp;
    public final String subtitleId;

    @Override // X.AbstractC666100QAu
    public boolean checkParams(Object... objArr) {
        return true;
    }

    public final void loadMore() {
        this.isLoadMore = true;
        TranslationLikeListResponse data = getData();
        long j = data != null ? data.nextOffset : 0L;
        TranslationLikeListResponse data2 = getData();
        fetchTranslationLikeList(j, data2 != null ? data2.maxCursor : 0L);
    }

    public final void refresh() {
        this.isLoadMore = false;
        fetchTranslationLikeList(0L, 0L);
    }

    public final boolean isLoadMore() {
        return this.isLoadMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC666100QAu
    public void handleData(TranslationLikeListResponse translationLikeListResponse) {
        int i;
        if (translationLikeListResponse == 0) {
            this.mData = null;
            return;
        }
        List<User> list = translationLikeListResponse.users;
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            List<User> arrayList = translationLikeListResponse.users;
            if (arrayList != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (User user : arrayList) {
                    if (hashSet.add(user.getUid())) {
                        arrayList2.add(user);
                    }
                }
                arrayList = new ArrayList<>(arrayList2);
            }
            translationLikeListResponse.users = arrayList;
            if (this.lastReadTimestamp > 0 && arrayList != null && !arrayList.isEmpty()) {
                i = 0;
                for (User user2 : arrayList) {
                    List<User> list2 = ((TranslationLikeListResponse) this.mData).users;
                    if (list2 != null) {
                        Iterator<User> it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            User next = it2.next();
                            if (Intrinsics.LJFF(user2.getUid(), next.getUid())) {
                                if (next != null) {
                                    continue;
                                }
                            }
                        }
                    }
                    i++;
                    if (i < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            TranslationLikeListResponse translationLikeListResponse2 = (TranslationLikeListResponse) this.mData;
            if (translationLikeListResponse2 != null) {
                i2 = translationLikeListResponse2.LL;
            }
            translationLikeListResponse.LL = i2 + i;
        } else {
            translationLikeListResponse.hasMore = 0;
        }
        this.mData = translationLikeListResponse;
    }

    public final void setLoadMore(boolean z) {
        this.isLoadMore = z;
    }

    private final void fetchTranslationLikeList(long j, long j2) {
        C1909140zmS.LJFF(this.subtitleId, this.itemId, j, j2).LJ(new InterfaceC2385309Wh() { // from class: com.ss.android.ugc.aweme.notification.model.TranslationLikeListModel.fetchTranslationLikeList.1
            /* JADX INFO: renamed from: then, reason: collision with other method in class */
            public final void m295then(C15O7<TranslationLikeListResponse> c15o7) {
                AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28((BaseResponse) c15o7.LJIIL(), 183);
                C1908260zl2 c1908260zl2 = C1908300zl6.LIZ;
                if (c1908260zl2 != null) {
                    awS607S0100000_28.invoke(c1908260zl2);
                }
                if (c15o7.LJIILL()) {
                    List<InterfaceC1526205yG> list = TranslationLikeListModel.this.mNotifyListeners;
                    if (list != null) {
                        Iterator<InterfaceC1526205yG> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onFailed(c15o7.LJIIJJI());
                        }
                        return;
                    }
                    return;
                }
                TranslationLikeListModel.this.handleData(c15o7.LJIIL());
                List<InterfaceC1526205yG> list2 = TranslationLikeListModel.this.mNotifyListeners;
                if (list2 != null) {
                    Iterator<InterfaceC1526205yG> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        it3.next().onSuccess();
                    }
                }
            }

            @Override // X.InterfaceC2385309Wh
            public /* bridge */ /* synthetic */ Object then(C15O7 c15o7) {
                C1C7U.LIZ("TranslationLikeListModel@40be.fetchTranslationLikeList$1");
                m295then((C15O7<TranslationLikeListResponse>) c15o7);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TranslationLikeListModel@40be.fetchTranslationLikeList$1");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    public TranslationLikeListModel(String str, String str2, long j) {
        this.subtitleId = str;
        this.itemId = str2;
        this.lastReadTimestamp = j;
    }
}
