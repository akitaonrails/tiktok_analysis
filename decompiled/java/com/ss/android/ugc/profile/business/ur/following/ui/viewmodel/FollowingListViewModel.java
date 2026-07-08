package com.ss.android.ugc.profile.business.ur.following.ui.viewmodel;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C0XQ7;
import X.C1157130gDX;
import X.C11ON;
import X.C11TP;
import X.C1265600j2U;
import X.C13LP;
import X.C13LQ;
import X.C1910890zpH;
import X.C2188811AlT;
import X.C452501pT;
import X.C627660Ojc;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1265640j2Y;
import X.InterfaceC1364105Vn;
import X.InterfaceC1487280oo2;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.following.model.AliasPermissionUserData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IFollowReadService;
import com.ss.android.ugc.aweme.profile.model.AwemeUnreadInfo;
import com.ss.android.ugc.aweme.profile.model.FollowingItemList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowingListViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states.FollowingRelationState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS106S0110000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowingListViewModel extends AssemListViewModel<FollowingRelationState, InterfaceC1891350zJl, Integer> implements InterfaceC1265640j2Y {
    public final C01GW LL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(451));
    public final AtomicInteger LLILLJJLI = new AtomicInteger(0);
    public final AtomicInteger LLILLL = new AtomicInteger(0);
    public final AtomicInteger LLILZ = new AtomicInteger(0);
    public final C11TP LLILZIL = new C11TP();
    public boolean LLILZLL = true;
    public final int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public final Set<String> LLJI;
    public final NextLiveData<Set<String>> LLJIJIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new FollowingRelationState(null, null, false, null, null, false, 0, null, null, null, null, 0, null, null, null, null, null, 131071, null);
    }

    public final void refresh() {
        int iIncrementAndGet = this.LLILZ.incrementAndGet();
        C1910890zpH c1910890zpHWQ2 = wQ2();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[FDUP] refresh() #");
        sbLIZ.append(iIncrementAndGet);
        sbLIZ.append(", thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(", stack=");
        sbLIZ.append(C13LP.LJJLIIIJ(C13LQ.LJJLIIIJJIZ(6, new Throwable().getStackTrace()), " <- ", null, null, 0, null, AFwS257S0000000_19.get$arr$(440), 30));
        c1910890zpHWQ2.LJII("FOLLOWING_LIST_VM", C2188811AlT.LIZIZ(sbLIZ));
        setStateImmediate(AFwS257S0000000_19.get$arr$(441));
    }

    public final C1910890zpH wQ2() {
        return (C1910890zpH) this.LL.getValue();
    }

    public FollowingListViewModel() {
        this.LLIZ = C0XQ7.LJFF().LIZLLL() ? 1 : 2;
        this.LLJI = Collections.newSetFromMap(new ConcurrentHashMap());
        this.LLJIJIL = new NextLiveData<>();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        C1910890zpH c1910890zpHWQ2 = wQ2();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[FDUP] newState called, thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        c1910890zpHWQ2.LJII("FOLLOWING_LIST_VM", C2188811AlT.LIZIZ(sbLIZ));
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 381));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r20) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowingListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    public final C11ON vQ2(final FollowingRelationState followingRelationState) {
        return this.LLILZIL.LJJIJIL(followingRelationState.getUserId(), followingRelationState.getSecUserId(), followingRelationState.getPayload().LIZJ, followingRelationState.getPayload().LIZ, C1265600j2U.LIZIZ(followingRelationState.isSelf()), this.LLIZ, followingRelationState.getPageToken(), followingRelationState.getLiveSortBy(), C1265600j2U.LIZ(followingRelationState.isSelf())).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0j2S
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v10, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v14, types: [java.util.HashMap, java.util.LinkedHashMap] */
            /* JADX WARN: Type inference failed for: r3v9, types: [java.util.Map] */
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                String str;
                int size;
                ?? LJ;
                String str2;
                int size2;
                String uid;
                String nickname;
                int followingCount;
                String uniqueId;
                C1265420j2C c1265420j2C;
                int iIntValue;
                String str3;
                String str4;
                int iIntValue2;
                FollowingItemList followingItemList = (FollowingItemList) obj;
                C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("load more list - logId ");
                BaseResponse.ServerTimeExtra serverTimeExtra = followingItemList.extra;
                if (serverTimeExtra != null) {
                    str = serverTimeExtra.logid;
                } else {
                    str = null;
                }
                sbLIZ.append(str);
                sbLIZ.append(", isSelf ");
                sbLIZ.append(followingRelationState.isSelf());
                sbLIZ.append(", original result size ");
                InterfaceC1265640j2Y interfaceC1265640j2Y = this;
                FollowingRelationState followingRelationState2 = followingRelationState;
                interfaceC1265640j2Y.getClass();
                List<InterfaceC1891350zJl> listItemState = followingRelationState2.getListItemState();
                if (listItemState == null) {
                    listItemState = C13BV.INSTANCE;
                }
                sbLIZ.append(listItemState.size());
                sbLIZ.append(", itemCount ");
                List<User> list = followingItemList.items;
                if (list != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                sbLIZ.append(size);
                sbLIZ.append(", hasMore ");
                sbLIZ.append(followingItemList.hasMore);
                sbLIZ.append(", offset ");
                sbLIZ.append(followingItemList.offset);
                sbLIZ.append(", recommendHasMore ");
                sbLIZ.append(followingItemList.recommendHasMore);
                sbLIZ.append(", showCutOff = ");
                sbLIZ.append(followingItemList.showCutOff);
                c1910890zpHLIZ.LJI("FOLLOWING_LIST_VM", C2188811AlT.LIZIZ(sbLIZ));
                C1265600j2U.LIZJ(this, followingItemList);
                ((AssemViewModel) this).setState(new AwS106S0110000_19(followingItemList, false, 7));
                ((AssemViewModel) this).setState(new AwS598S0100000_19(followingItemList, 628));
                ((FollowingListViewModel) this).xQ2(followingItemList);
                C1606010rtX.LIZIZ.LIZJ(EnumC1615506Uf.STORY, EnumC1606080rte.FOLLOW_LIST, followingItemList.items, AFwS257S0000000_19.get$arr$(663));
                List<AliasPermissionUserData> list2 = followingItemList.aliasPermissions;
                String str5 = "";
                if (list2 != null) {
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LJ = new LinkedHashMap(iLIZIZ);
                    for (AliasPermissionUserData aliasPermissionUserData : list2) {
                        String str6 = aliasPermissionUserData.userId;
                        if (str6 == null) {
                            str6 = "";
                        }
                        Integer num = aliasPermissionUserData.aliasPermissionType;
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        Pair pair = new Pair(str6, Integer.valueOf(iIntValue2));
                        LJ.put(pair.getFirst(), pair.getSecond());
                    }
                } else {
                    LJ = C2097608Jq.LJ();
                }
                List<User> list3 = followingItemList.items;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator<User> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getUid());
                }
                C1910890zpH c1910890zpHLIZ2 = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[FDUP] loadMore transform: rawSize=");
                sbLIZ2.append(list3.size());
                sbLIZ2.append(", rawUids=");
                sbLIZ2.append(arrayList);
                sbLIZ2.append(", existingUidsSize=");
                sbLIZ2.append(((FollowingListViewModel) this).LLJI.size());
                sbLIZ2.append(", existingUids=");
                sbLIZ2.append(((FollowingListViewModel) this).LLJI);
                sbLIZ2.append(", logId=");
                BaseResponse.ServerTimeExtra serverTimeExtra2 = followingItemList.extra;
                if (serverTimeExtra2 != null) {
                    str2 = serverTimeExtra2.logid;
                } else {
                    str2 = null;
                }
                sbLIZ2.append(str2);
                sbLIZ2.append(", thread=");
                sbLIZ2.append(C786410Ut5.u3().getName());
                c1910890zpHLIZ2.LJII("FOLLOWING_LIST_VM", C2188811AlT.LIZIZ(sbLIZ2));
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (User user : list3) {
                    if (hashSet.add(user.getUid())) {
                        arrayList2.add(user);
                    }
                }
                int size3 = list3.size() - arrayList2.size();
                int i = 1;
                if (size3 > 0) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (User user2 : list3) {
                        String uid2 = user2.getUid();
                        Object arrayList3 = linkedHashMap.get(uid2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            linkedHashMap.put(uid2, arrayList3);
                        }
                        ((List) arrayList3).add(user2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (((List) entry.getValue()).size() > 1) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Set setKeySet = linkedHashMap2.keySet();
                    C1910890zpH c1910890zpHLIZ3 = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[FDUP] loadMore intra-page dups: count=");
                    sbLIZ3.append(size3);
                    sbLIZ3.append(", dupUids=");
                    sbLIZ3.append(setKeySet);
                    sbLIZ3.append(", logId=");
                    BaseResponse.ServerTimeExtra serverTimeExtra3 = followingItemList.extra;
                    if (serverTimeExtra3 != null) {
                        str4 = serverTimeExtra3.logid;
                    } else {
                        str4 = null;
                    }
                    sbLIZ3.append(str4);
                    c1910890zpHLIZ3.LJII("FOLLOWING_LIST_VM", C2188811AlT.LIZIZ(sbLIZ3));
                }
                InterfaceC1265640j2Y interfaceC1265640j2Y2 = this;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (((FollowingListViewModel) interfaceC1265640j2Y2).LLJI.contains(((User) obj2).getUid())) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((User) it3.next()).getUid());
                }
                if (!arrayList5.isEmpty()) {
                    C1910890zpH c1910890zpHLIZ4 = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("[FDUP] loadMore cross-page dups: count=");
                    sbLIZ4.append(arrayList5.size());
                    sbLIZ4.append(", dupUids=");
                    sbLIZ4.append(arrayList5);
                    sbLIZ4.append(", existingUidsSize=");
                    sbLIZ4.append(((FollowingListViewModel) this).LLJI.size());
                    sbLIZ4.append(", logId=");
                    BaseResponse.ServerTimeExtra serverTimeExtra4 = followingItemList.extra;
                    if (serverTimeExtra4 != null) {
                        str3 = serverTimeExtra4.logid;
                    } else {
                        str3 = null;
                    }
                    sbLIZ4.append(str3);
                    c1910890zpHLIZ4.LJII("FOLLOWING_LIST_VM", C2188811AlT.LIZIZ(sbLIZ4));
                }
                InterfaceC1265640j2Y interfaceC1265640j2Y3 = this;
                ArrayList<User> arrayList6 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (!((FollowingListViewModel) interfaceC1265640j2Y3).LLJI.contains(((User) obj3).getUid())) {
                        arrayList6.add(obj3);
                    }
                }
                InterfaceC1265640j2Y interfaceC1265640j2Y4 = this;
                ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(arrayList6, 10));
                for (User user3 : arrayList6) {
                    user3.setRequestId(followingItemList.extra.logid);
                    ((FollowingListViewModel) interfaceC1265640j2Y4).LLJI.add(user3.getUid());
                    if (C1253000iiA.LIZ()) {
                        List<AliasPermissionUserData> list4 = followingItemList.aliasPermissions;
                        if (list4 != null && !list4.isEmpty()) {
                            C1910890zpH c1910890zpHLIZ5 = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("loadMore - alias permission map size: ");
                            sbLIZ5.append(followingItemList.aliasPermissions.size());
                            c1910890zpHLIZ5.LIZ("FOLLOWING_LIST_VM", C2188811AlT.LIZIZ(sbLIZ5));
                            Integer num2 = (Integer) LJ.get(user3.getUid());
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            C1247020iYW c1247020iYW = EnumC1247010iYV.Companion;
                            Integer numValueOf = Integer.valueOf(iIntValue);
                            c1247020iYW.getClass();
                            c1265420j2C = new C1265420j2C(0, user3, user3.getRequestId(), C1247020iYW.LIZ(numValueOf), 4);
                        } else {
                            c1265420j2C = new C1265420j2C(0, user3, user3.getRequestId(), EnumC1247010iYV.FOLLOWER, 4);
                        }
                    } else {
                        c1265420j2C = new C1265420j2C(0, user3, user3.getRequestId(), EnumC1247010iYV.FOLLOWER, 4);
                    }
                    arrayList7.add(c1265420j2C);
                }
                ArrayList arrayList8 = new ArrayList(arrayList7);
                if (!followingRelationState.isSelf() && followingItemList.showCutOff && !followingItemList.hasMore) {
                    ((FollowingListViewModel) this).LLJ += arrayList8.size();
                    C1910890zpH c1910890zpHLIZ6 = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("following load more list, curOff = true, followingUserList.size is ");
                    sbLIZ6.append(arrayList8.size());
                    sbLIZ6.append(", currentListSize is ");
                    sbLIZ6.append(((FollowingListViewModel) this).LLJ);
                    c1910890zpHLIZ6.LIZ("FOLLOWING_LIST_VM", C2188811AlT.LIZIZ(sbLIZ6));
                    User followingListOwner = followingRelationState.getFollowingListOwner();
                    if (followingListOwner == null || (uid = followingListOwner.getUid()) == null) {
                        uid = "";
                    }
                    User followingListOwner2 = followingRelationState.getFollowingListOwner();
                    if (followingListOwner2 != null && (uniqueId = followingListOwner2.getUniqueId()) != null) {
                        str5 = uniqueId;
                    } else {
                        User followingListOwner3 = followingRelationState.getFollowingListOwner();
                        if (followingListOwner3 != null && (nickname = followingListOwner3.getNickname()) != null) {
                            str5 = nickname;
                        }
                    }
                    User followingListOwner4 = followingRelationState.getFollowingListOwner();
                    if (followingListOwner4 != null) {
                        followingCount = followingListOwner4.getFollowingCount();
                    } else {
                        followingCount = 0;
                    }
                    arrayList8.add(new C1782830wUj(false, 27, 0, followingCount, uid, str5, ((FollowingListViewModel) this).LLJ, 36));
                }
                boolean z = followingItemList.hasMore;
                int i2 = followingItemList.offset;
                long j = followingItemList.minTime;
                boolean z2 = followingItemList.recommendHasMore;
                if (!((FollowingListViewModel) this).LLILZLL) {
                    i = 1 + followingRelationState.getPayload().LJ;
                }
                List<User> list5 = followingItemList.items;
                if (list5 != null) {
                    size2 = list5.size();
                } else {
                    size2 = 0;
                }
                return new Pair(arrayList8, new C1265190j1p(z, i2, j, z2, i, size2, false, 192));
            }
        });
    }

    public final void xQ2(FollowingItemList followingItemList) {
        List<String> listLIZLLL;
        List<String> list;
        IFollowReadService iFollowReadService = (IFollowReadService) PluggableExtentionKt.pluggableSpi$default(IFollowReadService.class, false, false, false, 14, null);
        if (iFollowReadService != null && (listLIZLLL = iFollowReadService.LIZLLL()) != null && !listLIZLLL.isEmpty()) {
            Iterator<User> it2 = followingItemList.items.iterator();
            while (it2.hasNext()) {
                AwemeUnreadInfo awemeUnreadInfo = it2.next().getAwemeUnreadInfo();
                if (awemeUnreadInfo != null && (list = awemeUnreadInfo.unreadIdList) != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : list) {
                        if (listLIZLLL.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    list.removeAll(hashSet);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(int r11, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r12) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowingListViewModel.onLoadMore(int, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(num.intValue(), interfaceC1364105Vn);
    }
}
