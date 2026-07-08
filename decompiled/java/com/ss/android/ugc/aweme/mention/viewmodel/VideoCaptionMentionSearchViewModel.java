package com.ss.android.ugc.aweme.mention.viewmodel;

import X.AbstractC316870CbV;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C090F;
import X.C099F;
import X.C0KBN;
import X.C0XQ7;
import X.C11IE;
import X.C11NZ;
import X.C11ON;
import X.C1243240iSQ;
import X.C15438062q;
import X.C20610715kv;
import X.C20611415l2;
import X.C20611715l5;
import X.C317060Cbo;
import X.C317510CcX;
import X.C325550CpV;
import X.C452501pT;
import X.C516201zk;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1487280oo2;
import X.InterfaceC1891350zJl;
import Y.AfS171S0100000_2;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.following.model.AliasPermissionUserData;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoCaptionMentionSearchViewModel extends AssemListViewModel<C325550CpV, InterfaceC1891350zJl, Boolean> {
    public C20610715kv LLILLJJLI;
    public String LL = "";
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1740));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1739));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325550CpV(0);
    }

    public final C099F vQ2() {
        C11NZ<RelationSearchResponse> c11nzQueryRelationSearchList;
        IProfileService iProfileService = (IProfileService) PluggableExtentionKt.pluggableSpi$default(IProfileService.class, false, false, false, 14, null);
        if (iProfileService == null || (c11nzQueryRelationSearchList = iProfileService.queryRelationSearchList(3, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), this.LL, 6)) == null) {
            return null;
        }
        C11ON c11onLJJJJZI = c11nzQueryRelationSearchList.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0DC2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                ?? LJ;
                long jLongValue;
                int iIntValue;
                Integer num;
                Long l;
                RelationSearchResponse relationSearchResponse = (RelationSearchResponse) obj;
                List list = relationSearchResponse.searchUser;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                List<AliasPermissionUserData> list2 = relationSearchResponse.aliasPermissions;
                if (list2 != null) {
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LJ = new LinkedHashMap(iLIZIZ);
                    for (AliasPermissionUserData aliasPermissionUserData : list2) {
                        Pair pair = new Pair(aliasPermissionUserData.userId, aliasPermissionUserData.aliasPermissionType);
                        LJ.put(pair.getFirst(), pair.getSecond());
                    }
                } else {
                    LJ = C2097608Jq.LJ();
                }
                IntRange intRangeLJIIIZ = C1697810uHb.LJIIIZ(list);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIIIZ, 10));
                C531650Kt9 it2 = intRangeLJIIIZ.iterator();
                while (it2.LLILLL) {
                    int iNextInt = it2.nextInt();
                    User user = (User) ListProtector.get(list, iNextInt);
                    String strLIZIZ = C1247000iYU.LIZIZ(user);
                    List<Long> list3 = relationSearchResponse.mentionBlockTypes;
                    if (list3 != null && (l = (Long) C13LP.LJJJLZIJ(iNextInt, list3)) != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    List<Integer> list4 = relationSearchResponse.matchBy;
                    if (list4 != null && (num = (Integer) C13LP.LJJJLZIJ(iNextInt, list4)) != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Integer num2 = (Integer) LJ.get(user.getUid());
                    if (num2 != null) {
                        num2.intValue();
                    }
                    arrayList.add(new C316790CbN(strLIZIZ, user, jLongValue, iIntValue));
                }
                return arrayList;
            }
        });
        C099F c099fLIZIZ = C090F.LIZIZ();
        new C11IE(c11onLJJJJZI).LJIIZILJ(new C516201zk(c099fLIZIZ, 130), new AfS171S0100000_2(c099fLIZIZ, 24));
        return c099fLIZIZ;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 84));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Boolean>> r13) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C317010Cbj
            if (r0 == 0) goto L4e
            r5 = r13
            X.0Cbj r5 = (X.C317010Cbj) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r0 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r3 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r3 == 0) goto L26
            if (r3 == r1) goto L40
            if (r3 != r2) goto L54
            X.C155000ia.LIZIZ(r0)
        L25:
            return r0
        L26:
            X.C155000ia.LIZIZ(r0)
            X.01GW r0 = r12.LLILZ
            java.lang.Object r6 = r0.getValue()
            com.ss.android.ugc.ur.alias.IAliasService r6 = (com.ss.android.ugc.ur.alias.IAliasService) r6
            java.lang.String r7 = r12.LL
            r5.LLILLL = r1
            r10 = 0
            r8 = 6
            X.099G r0 = r6.LJ(r7, r8, r10)
            if (r0 != r4) goto L43
            return r4
        L40:
            X.C155000ia.LIZIZ(r0)
        L43:
            X.0957 r0 = (X.AnonymousClass0957) r0
            r5.LLILLL = r2
            java.lang.Object r0 = r12.wQ2(r1, r0, r5)
            if (r0 != r4) goto L25
            return r4
        L4e:
            X.0Cbj r5 = new X.0Cbj
            r5.<init>(r12, r13)
            goto L12
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionSearchViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    public final String xQ2(C20611415l2 c20611415l2) {
        String str;
        C317510CcX c317510CcX = c20611415l2.LJIJJ;
        if (c317510CcX == null || (str = c317510CcX.LJIIIZ) == null) {
            C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
            User userLIZJ = C20611715l5.LIZJ(c20611415l2);
            c1243240iSQ.getClass();
            String nickname = userLIZJ.getNickname();
            if (nickname == null) {
                return "";
            }
            return nickname;
        }
        return str;
    }

    public final List<C317060Cbo> yQ2(List<C20611415l2> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C20611415l2> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C317060Cbo(it2.next()));
        }
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Boolean bool, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn) {
        bool.booleanValue();
        return wQ2(false, null, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4 A[Catch: Exception -> 0x0238, TryCatch #0 {Exception -> 0x0238, blocks: (B:51:0x0121, B:52:0x0124, B:56:0x0134, B:57:0x0138, B:59:0x0140, B:60:0x014d, B:62:0x0153, B:66:0x016c, B:68:0x018f, B:69:0x019f, B:70:0x01a5, B:72:0x01ab, B:74:0x01b5, B:77:0x01bb, B:82:0x01c6, B:84:0x01ca, B:85:0x01e0, B:86:0x01f7, B:88:0x01fd, B:89:0x0209, B:91:0x0216, B:93:0x0227, B:28:0x0095, B:29:0x0098, B:31:0x009c, B:33:0x00a1, B:34:0x00ae, B:36:0x00b4, B:40:0x00c9, B:44:0x00e3, B:45:0x0100, B:18:0x0045, B:20:0x0074, B:23:0x0084, B:25:0x008a, B:32:0x009f, B:48:0x0116, B:19:0x0061), top: B:98:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140 A[Catch: Exception -> 0x0238, TryCatch #0 {Exception -> 0x0238, blocks: (B:51:0x0121, B:52:0x0124, B:56:0x0134, B:57:0x0138, B:59:0x0140, B:60:0x014d, B:62:0x0153, B:66:0x016c, B:68:0x018f, B:69:0x019f, B:70:0x01a5, B:72:0x01ab, B:74:0x01b5, B:77:0x01bb, B:82:0x01c6, B:84:0x01ca, B:85:0x01e0, B:86:0x01f7, B:88:0x01fd, B:89:0x0209, B:91:0x0216, B:93:0x0227, B:28:0x0095, B:29:0x0098, B:31:0x009c, B:33:0x00a1, B:34:0x00ae, B:36:0x00b4, B:40:0x00c9, B:44:0x00e3, B:45:0x0100, B:18:0x0045, B:20:0x0074, B:23:0x0084, B:25:0x008a, B:32:0x009f, B:48:0x0116, B:19:0x0061), top: B:98:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(boolean r29, X.AnonymousClass0957<? extends java.util.List<X.C316550Caz>> r30, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Boolean>> r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionSearchViewModel.wQ2(boolean, X.0957, X.05Vn):java.lang.Object");
    }
}
