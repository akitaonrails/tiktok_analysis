package com.ss.android.ugc.profile.business.ur.following.ui.viewmodel;

import X.AbstractC316870CbV;
import X.C1157130gDX;
import X.C11IR;
import X.C11NZ;
import X.C11ON;
import X.C11TQ;
import X.C1265190j1p;
import X.C1265440j2E;
import X.C13BV;
import X.C15438062q;
import X.C1910890zpH;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C627660Ojc;
import X.C826660Wbo;
import X.EnumC055300Id;
import X.EnumC1910860zpE;
import X.InterfaceC0148002o;
import X.InterfaceC1265060j1c;
import X.InterfaceC1364105Vn;
import X.InterfaceC1487280oo2;
import X.InterfaceC1891350zJl;
import Y.AkS326S0200000_19;
import android.content.Context;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.following.model.AliasPermissionUserData;
import com.ss.android.ugc.aweme.following.model.FollowerItemList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states.FollowerRelationState;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowerListViewModel extends AssemListViewModel<FollowerRelationState, InterfaceC1891350zJl, Integer> implements InterfaceC1265060j1c {
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public Context LLILZLL;
    public int LLJ;
    public final C11TQ LL = new C11TQ();
    public int LLILLJJLI = -1;
    public final Map<String, Boolean> LLIZ = new LinkedHashMap();
    public boolean LLIZLLLIL = true;
    public EnumC055300Id LLJI = EnumC055300Id.CACHE_UNUSED;

    public final void xQ2() {
        AssemSingleListViewModel.manualListLoadMore$default(this, null, 1, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new FollowerRelationState("", "", false, "", null, new C627660Ojc(null, null, null, null, 15), new C1265190j1p(false, 0, 0L, false, 0, 0, false, 255));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        withState(new AwS598S0100000_19(this, 626));
        this.LL.release();
    }

    @Override // X.InterfaceC1265060j1c
    public final int El0() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1265060j1c
    public final boolean GD2() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1265060j1c
    public final String KU1() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1265060j1c
    public final int Qs0() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1265060j1c
    public final Context getContext() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1265060j1c
    public final String getEnterFrom() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1265060j1c
    public final Map<String, Boolean> kV1() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1265060j1c
    public final List<InterfaceC1891350zJl> CZ0(FollowerRelationState followerRelationState) {
        List<InterfaceC1891350zJl> listItemState = followerRelationState.getListItemState();
        if (listItemState == null) {
            return C13BV.INSTANCE;
        }
        return listItemState;
    }

    public final void Cn(Function1<? super FollowerRelationState, Unit> function1) {
        withState(function1);
    }

    @Override // X.InterfaceC1265060j1c
    public final C1265190j1p FN1(FollowerRelationState followerRelationState) {
        return followerRelationState.getPayload();
    }

    @Override // X.InterfaceC1265060j1c
    public final void LJJJZ(Function1<? super FollowerRelationState, FollowerRelationState> function1) {
        setState(function1);
    }

    @Override // X.InterfaceC1265060j1c
    public final void Oc0(List<? extends InterfaceC1891350zJl> list) {
        listSetItems(list);
    }

    @Override // X.InterfaceC1265060j1c
    public final void Om2(String str) {
        if (str != null && str.length() != 0) {
            Map<String, Boolean> map = this.LLIZ;
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                arrayList.add(new Pair(it2.next(), Boolean.TRUE));
            }
            map.putAll(C2097608Jq.LJIILLIIL(arrayList));
        }
    }

    @Override // X.InterfaceC1265060j1c
    public final void Ss0(String str) {
        this.LLILZ = str;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 377));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r12) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowerListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    public final C11NZ<Pair<List<InterfaceC1891350zJl>, C1265190j1p>> vQ2(FollowerRelationState followerRelationState) {
        int i;
        if (!followerRelationState.isSelf()) {
            i = 50;
        } else {
            i = 40;
        }
        if (!followerRelationState.isSelf() && !followerRelationState.getPayload().LIZIZ.LIZ) {
            C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Follower list - actualLoadMore, others SKIP due to hasMore: ");
            sbLIZ.append(followerRelationState.getPayload().LIZIZ.LIZ);
            c1910890zpHLIZ.LJI("FollowerRelationVM", C2188811AlT.LIZIZ(sbLIZ));
            return C11IR.LL;
        }
        if (!followerRelationState.isSelf()) {
            C1910890zpH c1910890zpHLIZ2 = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Follower list - actualLoadMore, others client bypass, hasMore: ");
            sbLIZ2.append(followerRelationState.getPayload().LIZIZ.LIZ);
            c1910890zpHLIZ2.LJI("FollowerRelationVM", C2188811AlT.LIZIZ(sbLIZ2));
            return C11IR.LL;
        }
        C1910890zpH c1910890zpHLIZ3 = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Follower list - actualLoadMore, isSelf ");
        sbLIZ3.append(followerRelationState.isSelf());
        sbLIZ3.append(", list: ");
        List<InterfaceC1891350zJl> listItemState = followerRelationState.getListItemState();
        if (listItemState == null) {
            listItemState = C13BV.INSTANCE;
        }
        sbLIZ3.append(listItemState.size());
        sbLIZ3.append(", hasMore: ");
        sbLIZ3.append(followerRelationState.getPayload().LIZIZ.LIZ);
        c1910890zpHLIZ3.LJI("FollowerRelationVM", C2188811AlT.LIZIZ(sbLIZ3));
        this.LLIZLLLIL = false;
        return this.LL.LJJIJIL(followerRelationState.getUserId(), followerRelationState.getSecUserId(), followerRelationState.getPayload().LIZJ, i, followerRelationState.getPayload().LIZ, C1265440j2E.LIZ(this, followerRelationState.isSelf()), C826660Wbo.LIZ(), followerRelationState.getPageToken(), null).LJJJJZI(new AkS326S0200000_19(this, followerRelationState, 0));
    }

    public final C11ON wQ2(final FollowerRelationState followerRelationState) {
        int i;
        User followerListOwner;
        if (!followerRelationState.isSelf()) {
            i = 50;
        } else {
            i = 40;
        }
        final boolean z = false;
        if (!followerRelationState.isSelf() && (followerListOwner = followerRelationState.getFollowerListOwner()) != null && followerListOwner.getFollowerCount() > 50) {
            z = true;
        }
        return this.LL.LJJIJIL(followerRelationState.getUserId(), followerRelationState.getSecUserId(), 0L, i, 0, C1265440j2E.LIZ(this, followerRelationState.isSelf()), C826660Wbo.LIZ(), null, this.LLILZ).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0j2D
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v19, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v23, types: [java.util.HashMap, java.util.LinkedHashMap] */
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                String str;
                int size;
                ?? LJ;
                int i2;
                String uid;
                User followerListOwner2;
                String nickname;
                int followerCount;
                String uid2;
                String nickname2;
                int followerCount2;
                String uniqueId;
                C1265420j2C c1265420j2C;
                int iIntValue;
                int iIntValue2;
                FollowerItemList followerItemList = (FollowerItemList) obj;
                C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("refresh list - logId ");
                BaseResponse.ServerTimeExtra serverTimeExtra = followerItemList.extra;
                String str2 = null;
                if (serverTimeExtra != null) {
                    str = serverTimeExtra.logid;
                } else {
                    str = null;
                }
                sbLIZ.append(str);
                sbLIZ.append(", isSelf ");
                sbLIZ.append(followerRelationState.isSelf());
                sbLIZ.append(", itemCount ");
                List<User> list = followerItemList.items;
                int size2 = 0;
                if (list != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                sbLIZ.append(size);
                sbLIZ.append(", hasMore ");
                sbLIZ.append(followerItemList.hasMore);
                sbLIZ.append(", offset ");
                sbLIZ.append(followerItemList.offset);
                sbLIZ.append(", recommendHasMore ");
                sbLIZ.append(followerItemList.recommendHasMore);
                c1910890zpHLIZ.LJI("FollowerRelationVM", C2188811AlT.LIZIZ(sbLIZ));
                if (C295390Bhx.LIZIZ()) {
                    this.getContext();
                    try {
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (!C036E.LIZ.LIZIZ()) {
                        this.LJJJZ(new AwS598S0100000_19(followerItemList, 627));
                    }
                } else {
                    this.LJJJZ(new AwS598S0100000_19(followerItemList, 627));
                }
                C1606010rtX.LIZIZ.LIZJ(EnumC1615506Uf.STORY, EnumC1606080rte.FOLLOW_LIST, followerItemList.items, AFwS257S0000000_19.get$arr$(662));
                List<AliasPermissionUserData> list2 = followerItemList.aliasPermissions;
                String str3 = "";
                if (list2 != null) {
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LJ = new LinkedHashMap(iLIZIZ);
                    for (AliasPermissionUserData aliasPermissionUserData : list2) {
                        String str4 = aliasPermissionUserData.userId;
                        if (str4 == null) {
                            str4 = "";
                        }
                        Integer num = aliasPermissionUserData.aliasPermissionType;
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        Pair pair = new Pair(str4, Integer.valueOf(iIntValue2));
                        LJ.put(pair.getFirst(), pair.getSecond());
                    }
                } else {
                    LJ = C2097608Jq.LJ();
                }
                List<User> list3 = followerItemList.items;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (User user : list3) {
                    if (hashSet.add(user.getUid())) {
                        arrayList.add(user);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (true) {
                    i2 = 1;
                    if (!it2.hasNext()) {
                        break;
                    }
                    User user2 = (User) it2.next();
                    user2.setRequestId(followerItemList.extra.logid);
                    if (C1253000iiA.LIZ()) {
                        List<AliasPermissionUserData> list4 = followerItemList.aliasPermissions;
                        if (list4 != null && !list4.isEmpty()) {
                            C1910890zpH c1910890zpHLIZ2 = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("refresh - alias permission map size: ");
                            sbLIZ2.append(followerItemList.aliasPermissions.size());
                            c1910890zpHLIZ2.LIZ("FollowerRelationVM", C2188811AlT.LIZIZ(sbLIZ2));
                            Integer num2 = (Integer) LJ.get(user2.getUid());
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            C1247020iYW c1247020iYW = EnumC1247010iYV.Companion;
                            Integer numValueOf = Integer.valueOf(iIntValue);
                            c1247020iYW.getClass();
                            c1265420j2C = new C1265420j2C(1, user2, str2, C1247020iYW.LIZ(numValueOf), 12);
                        } else {
                            c1265420j2C = new C1265420j2C(i2, user2, str2, EnumC1247010iYV.FOLLOWER, 12);
                        }
                    } else {
                        c1265420j2C = new C1265420j2C(i2, user2, str2, EnumC1247010iYV.FOLLOWER, 12);
                    }
                    arrayList2.add(c1265420j2C);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (z) {
                    boolean zIsSelf = followerRelationState.isSelf();
                    User followerListOwner3 = followerRelationState.getFollowerListOwner();
                    if (followerListOwner3 == null || (uid = followerListOwner3.getUid()) == null) {
                        uid = "";
                    }
                    User followerListOwner4 = followerRelationState.getFollowerListOwner();
                    if ((followerListOwner4 == null || (nickname = followerListOwner4.getUniqueId()) == null) && ((followerListOwner2 = followerRelationState.getFollowerListOwner()) == null || (nickname = followerListOwner2.getNickname()) == null)) {
                        nickname = "";
                    }
                    User followerListOwner5 = followerRelationState.getFollowerListOwner();
                    if (followerListOwner5 != null) {
                        followerCount = followerListOwner5.getFollowerCount();
                    } else {
                        followerCount = 0;
                    }
                    ListProtector.add(arrayList3, 0, new C1782830wUj(zIsSelf, 26, followerCount, 0, uid, nickname, 0, 196));
                    boolean zIsSelf2 = followerRelationState.isSelf();
                    User followerListOwner6 = followerRelationState.getFollowerListOwner();
                    if (followerListOwner6 == null || (uid2 = followerListOwner6.getUid()) == null) {
                        uid2 = "";
                    }
                    User followerListOwner7 = followerRelationState.getFollowerListOwner();
                    if (followerListOwner7 != null && (uniqueId = followerListOwner7.getUniqueId()) != null) {
                        str3 = uniqueId;
                    } else {
                        User followerListOwner8 = followerRelationState.getFollowerListOwner();
                        if (followerListOwner8 != null && (nickname2 = followerListOwner8.getNickname()) != null) {
                            str3 = nickname2;
                        }
                    }
                    User followerListOwner9 = followerRelationState.getFollowerListOwner();
                    if (followerListOwner9 != null) {
                        followerCount2 = followerListOwner9.getFollowerCount();
                    } else {
                        followerCount2 = 0;
                    }
                    arrayList3.add(new C1782830wUj(zIsSelf2, 25, followerCount2, 0, uid2, str3, 0, 196));
                }
                boolean z2 = followerItemList.hasMore;
                int i3 = followerItemList.offset;
                long j = followerItemList.minTime;
                boolean z3 = followerItemList.recommendHasMore;
                if (!this.GD2()) {
                    i2 = 1 + this.FN1(followerRelationState).LJ;
                }
                List<User> list5 = followerItemList.items;
                if (list5 != null) {
                    size2 = list5.size();
                }
                return new Pair(arrayList3, new C1265190j1p(z2, i3, j, z3, i2, size2, false, 192));
            }
        });
    }

    @Override // X.InterfaceC1265060j1c
    public final void y72(int i) {
        this.LLJ = i;
    }

    @Override // X.InterfaceC1265060j1c
    public final void Ig1(int i, String str) {
        if (str != null && str.length() != 0) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
            if (!listLJJLIIIJILLIZJL.isEmpty()) {
                if (listLJJLIIIJILLIZJL.size() == 1) {
                    this.LLIZ.put((String) ListProtector.get(listLJJLIIIJILLIZJL, 0), Boolean.TRUE);
                    return;
                }
                if (listLJJLIIIJILLIZJL.size() == 2 && 1 <= i && i < 4) {
                    Map<String, Boolean> map = this.LLIZ;
                    Object obj = ListProtector.get(listLJJLIIIJILLIZJL, 0);
                    Boolean bool = Boolean.TRUE;
                    map.put((String) obj, bool);
                    this.LLIZ.put((String) ListProtector.get(listLJJLIIIJILLIZJL, 1), bool);
                    return;
                }
                if (listLJJLIIIJILLIZJL.size() == 3 || (i == 3 && listLJJLIIIJILLIZJL.size() > 3)) {
                    Map<String, Boolean> map2 = this.LLIZ;
                    Object obj2 = ListProtector.get(listLJJLIIIJILLIZJL, 0);
                    Boolean bool2 = Boolean.TRUE;
                    map2.put((String) obj2, bool2);
                    this.LLIZ.put((String) ListProtector.get(listLJJLIIIJILLIZJL, 1), bool2);
                    this.LLIZ.put((String) ListProtector.get(listLJJLIIIJILLIZJL, 2), bool2);
                    return;
                }
                if (listLJJLIIIJILLIZJL.size() <= 1) {
                    return;
                }
                Map<String, Boolean> map3 = this.LLIZ;
                Object obj3 = ListProtector.get(listLJJLIIIJILLIZJL, 0);
                Boolean bool3 = Boolean.TRUE;
                map3.put((String) obj3, bool3);
                this.LLIZ.put((String) ListProtector.get(listLJJLIIIJILLIZJL, 1), bool3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(int r7, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1265460j2G
            if (r0 == 0) goto L20
            r3 = r8
            X.0j2G r3 = (X.C1265460j2G) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r2 = r3.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r5 = 1
            if (r0 == 0) goto L2e
            if (r0 != r5) goto L26
            goto L4b
        L20:
            X.0j2G r3 = new X.0j2G
            r3.<init>(r6, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            X.0JAM r0 = X.C0JAU.LIZJ()
            r0.LIZJ()
            X.002o r0 = r6.getState()     // Catch: java.lang.Exception -> L8d
            com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states.FollowerRelationState r0 = (com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states.FollowerRelationState) r0     // Catch: java.lang.Exception -> L8d
            X.11NZ r0 = r6.vQ2(r0)     // Catch: java.lang.Exception -> L8d
            r3.LLILLL = r5     // Catch: java.lang.Exception -> L8d
            java.lang.Object r2 = X.C11UD.LJI(r0, r3)     // Catch: java.lang.Exception -> L8d
            if (r2 != r1) goto L4e
            return r1
        L4b:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L8d
        L4e:
            kotlin.Pair r2 = (kotlin.Pair) r2     // Catch: java.lang.Exception -> L8d
            java.lang.Object r4 = r2.getSecond()
            X.0j1p r4 = (X.C1265190j1p) r4
            if (r4 == 0) goto L7c
            kotlin.jvm.internal.AwS598S0100000_19 r1 = new kotlin.jvm.internal.AwS598S0100000_19
            r0 = 378(0x17a, float:5.3E-43)
            r1.<init>(r4, r0)
            r6.setState(r1)
            X.0vwd r0 = r4.LIZIZ
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L7c
            X.0CcB r3 = X.AbstractC316870CbV.LIZ
            java.lang.Object r2 = r2.getFirst()
            java.util.List r2 = (java.util.List) r2
            int r0 = r4.LIZ
            r1 = 0
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            X.0Cm0 r0 = X.C317290CcB.LJ(r3, r1, r0, r2, r5)
            return r0
        L7c:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            java.lang.Object r1 = r2.getFirst()
            java.util.List r1 = (java.util.List) r1
            r0.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r1)
            return r0
        L8d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowerListViewModel.onLoadMore(int, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(num.intValue(), interfaceC1364105Vn);
    }
}
