package com.ss.android.ugc.aweme.comment.likelist.viewmodel;

import X.C01GW;
import X.C0O8X;
import X.C11NJ;
import X.C11S5;
import X.C1344030l4z;
import X.C1356840lPe;
import X.C1357010lPv;
import X.C1357090lQ3;
import X.C14EU;
import X.C1701940uOG;
import X.C19482611Ke;
import X.C2188811AlT;
import X.C452501pT;
import X.C622680Oba;
import X.C888460YtI;
import X.C897520ZIw;
import X.EnumC1356970lPr;
import X.InterfaceC1356980lPs;
import X.InterfaceC1487280oo2;
import Y.AfS37S1300000_21;
import Y.AfS8S1110000_21;
import android.util.LruCache;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
public final class LikeListVM extends ViewModel {
    public static final /* synthetic */ int LLJJ = 0;
    public BubbleBridge LL;
    public String LLILLJJLI = "";
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(130));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(128));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(129));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(131));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(136));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(132));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(135));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(133));
    public final C0O8X LLJIJIL = new C0O8X();
    public String LLJILJIL = "";
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(134));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(127));

    public final C897520ZIw vQ2() {
        return (C897520ZIw) this.LLJILLL.getValue();
    }

    public final Map<String, Long> wQ2() {
        return (Map) this.LLILZIL.getValue();
    }

    public final LikeListResponse yQ2() {
        return (LikeListResponse) ((LruCache) this.LLILZ.getValue()).get(this.LLILLJJLI);
    }

    public final NextLiveData<Boolean> zQ2() {
        return (NextLiveData) this.LLJI.getValue();
    }

    public LikeListVM() {
        C622680Oba.LIZJ(this);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C11NJ) this.LLIZLLLIL.getValue()).LJ();
        C622680Oba.LIZLLL(this);
    }

    public final void BQ2(String str) {
        this.LLJIJIL.LJ();
        C0O8X c0o8x = this.LLJIJIL;
        c0o8x.LIZLLL = "ttk_aweme_like_list_api_monitor";
        c0o8x.LIZJ(str, "gid");
        if (this.LLJILJIL.length() > 0) {
            this.LLJIJIL.LIZIZ(this.LLJILJIL, "enter_from");
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C888460YtI c888460YtI) throws JSONException {
        User user;
        String uid;
        LikeListResponse likeListResponseYQ2;
        List<User> likeList;
        Long l;
        if (c888460YtI != null && (user = c888460YtI.LIZ) != null && (uid = user.getUid()) != null && (likeListResponseYQ2 = yQ2()) != null && (likeList = likeListResponseYQ2.getLikeList()) != null) {
            ListIterator<User> listIterator = likeList.listIterator();
            boolean z = false;
            while (listIterator.hasNext()) {
                if (Intrinsics.LJFF(listIterator.next().getUid(), uid)) {
                    listIterator.remove();
                    z = true;
                }
            }
            if (z && (l = wQ2().get(this.LLILLJJLI)) != null && l.longValue() > 0) {
                wQ2().put(this.LLILLJJLI, Long.valueOf(l.longValue() - 1));
                C1356840lPe.LIZIZ(this.LLILLJJLI, l.longValue() - 1, null);
            }
            ((LiveData) this.LLILZLL.getValue()).setValue(c888460YtI.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSyncDiggStateEvent(X.C730120SkU r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse r0 = r7.yQ2()
            r3 = 0
            if (r0 == 0) goto Lb8
            java.util.List r6 = r0.getLikeList()
        Lb:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r5 = r0.getCurUser()
            if (r8 == 0) goto Lb5
            X.0Skz r1 = r8.LIZLLL
        L19:
            X.0Skz r0 = X.EnumC730430Skz.ICON
            if (r1 != r0) goto Lad
            java.lang.String r1 = r8.LIZ
            java.lang.String r0 = r7.LLILLJJLI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lad
            if (r6 == 0) goto Lad
            if (r5 == 0) goto Lad
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onSyncDiggStateEvent, receive event="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LikeListVM"
            X.C1720106oR.LJI(r0, r1)
            java.util.Map r4 = r7.wQ2()
            java.lang.String r2 = r7.LLILLJJLI
            long r0 = r8.LIZIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.put(r2, r0)
            int r1 = r8.LIZJ
            r0 = 1
            r4 = 0
            if (r1 != r0) goto L75
            java.util.Iterator r2 = r6.iterator()
        L5b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            java.lang.String r1 = r0.getUid()
            java.lang.String r0 = r5.getUid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5b
        L75:
            int r0 = r8.LIZJ
            if (r0 != 0) goto L9d
            java.util.Iterator r2 = r6.iterator()
        L7d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            java.lang.String r1 = r0.getUid()
            java.lang.String r0 = r5.getUid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lae
            if (r4 < 0) goto L9d
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r6, r4)
        L9c:
            r3 = r5
        L9d:
            X.01GW r0 = r7.LLIZ
            java.lang.Object r1 = r0.getValue()
            androidx.lifecycle.LiveData r1 = (androidx.lifecycle.LiveData) r1
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r8, r3)
            r1.setValue(r0)
        Lad:
            return
        Lae:
            int r4 = r4 + 1
            goto L7d
        Lb1:
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r6, r4, r5)
            goto L9c
        Lb5:
            r1 = r3
            goto L19
        Lb8:
            r6 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM.onSyncDiggStateEvent(X.0SkU):void");
    }

    public final long xQ2(Aweme aweme) {
        Long lValueOf;
        if (aweme == null) {
            return 0L;
        }
        Long l = wQ2().get(aweme.getAid());
        if (l != null) {
            return l.longValue();
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics == null || (lValueOf = Long.valueOf(statistics.getDiggCount())) == null) {
            return 0L;
        }
        return lValueOf.longValue();
    }

    public static final class BubbleBridge extends ILikedListViewModel {
        public final LikeListVM LLIZ;
        public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(125));
        public final C01GW LLJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(126));

        public BubbleBridge(LikeListVM likeListVM, LifecycleOwner lifecycleOwner) {
            this.LLIZ = likeListVM;
            this.LLILLL = lifecycleOwner;
        }

        public final void CQ2(String str, PaginationCursor paginationCursor) {
            boolean z = true;
            if (str.length() == 0) {
                C1344030l4z.LIZLLL("LikeListVM", "fetchLikeList aid is empty");
                return;
            }
            if (paginationCursor.getCursor() == 0 && paginationCursor.getOffset() == 0) {
                ((Set) this.LLJ.getValue()).clear();
            } else {
                z = false;
            }
            this.LLIZ.BQ2(str);
            ((C11NJ) this.LLIZ.LLIZLLLIL.getValue()).LIZ(((InterfaceC1356980lPs) C1357090lQ3.LIZIZ.getValue()).LIZ(str, paginationCursor.getCursor(), paginationCursor.getOffset(), 20, null, EnumC1356970lPr.BULLET.getValue()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS8S1110000_21(this, str, z, 0), new AfS8S1110000_21(this, str, z, 1)));
        }
    }

    public final void AQ2(C1357010lPv c1357010lPv, C19482611Ke c19482611Ke) {
        long offset;
        long cursor;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request start, req:");
        sbLIZ.append(c1357010lPv);
        C1344030l4z.LIZJ("LikeListVM", C2188811AlT.LIZIZ(sbLIZ));
        String str = c1357010lPv.LIZ;
        if (str.length() != 0) {
            Object obj = ((LruCache) this.LLILLL.getValue()).get(str);
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.LJFF(obj, bool)) {
                ((LruCache) this.LLILLL.getValue()).put(str, bool);
                if (!c1357010lPv.LIZIZ) {
                    LikeListResponse likeListResponse = (LikeListResponse) ((LruCache) this.LLILZ.getValue()).get(str);
                    if (likeListResponse != null) {
                        cursor = likeListResponse.getCursor();
                    } else {
                        cursor = 0;
                    }
                    LikeListResponse likeListResponse2 = (LikeListResponse) ((LruCache) this.LLILZ.getValue()).get(str);
                    if (likeListResponse2 != null) {
                        offset = likeListResponse2.getOffset();
                    } else {
                        offset = 0;
                    }
                    if (cursor <= 0) {
                        C1344030l4z.LIZ("LikeListVM", "request, cursor invalid");
                    }
                } else {
                    ((Set) this.LLJILJILJ.getValue()).clear();
                    offset = 0;
                    cursor = 0;
                }
                BQ2(str);
                ((C11NJ) this.LLIZLLLIL.getValue()).LIZ(((InterfaceC1356980lPs) C1357090lQ3.LIZIZ.getValue()).LIZ(str, cursor, offset, c1357010lPv.LIZLLL, c1357010lPv.LJ, c1357010lPv.LIZJ.getValue()).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0iTJ
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj2) {
                        String str2;
                        String str3;
                        LikeListResponse likeListResponse3 = (LikeListResponse) obj2;
                        List<User> likeList = likeListResponse3.getLikeList();
                        if (likeList != null) {
                            for (User user : likeList) {
                                MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
                                if (matchedFriendStruct != null && (str3 = matchedFriendStruct.recType) != null) {
                                    user.setRecType(str3);
                                }
                                BaseResponse.ServerTimeExtra serverTimeExtra = likeListResponse3.extra;
                                if (serverTimeExtra == null || (str2 = serverTimeExtra.logid) == null) {
                                    str2 = "";
                                }
                                user.setRequestId(str2);
                            }
                        }
                        return likeListResponse3;
                    }
                }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS37S1300000_21(c1357010lPv, this, c19482611Ke, str, 0), new AfS37S1300000_21(c1357010lPv, this, c19482611Ke, str, 1)));
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("request invalid, aid:");
        sbLIZ2.append(str);
        C1344030l4z.LIZ("LikeListVM", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("request invalid, aid:");
        sbLIZ3.append(str);
        IllegalStateException illegalStateException = new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
        if (!c19482611Ke.isDisposed()) {
            c19482611Ke.onError(illegalStateException);
        }
    }
}
