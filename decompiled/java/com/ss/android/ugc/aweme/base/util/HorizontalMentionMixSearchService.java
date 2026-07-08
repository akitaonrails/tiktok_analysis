package com.ss.android.ugc.aweme.base.util;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C08CX;
import X.C090F;
import X.C099F;
import X.C0AMR;
import X.C0AMT;
import X.C0PEM;
import X.C0XQ7;
import X.C11IE;
import X.C11NZ;
import X.C11ON;
import X.C1697810uHb;
import X.C20612815lG;
import X.C23250099c;
import X.C237600vu;
import X.C286800BLy;
import X.C315740CZg;
import X.C316590Cb3;
import X.C346430Di5;
import X.C452501pT;
import X.C516201zk;
import X.InterfaceC1364105Vn;
import X.InterfaceC1487280oo2;
import Y.AfS171S0100000_2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.following.model.AliasPermissionUserData;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mention.experiment.HorizontalMentionMixSearchConfig;
import com.ss.android.ugc.aweme.mixsearch.IMixSearchService;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IMentionMixSearchService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public final class HorizontalMentionMixSearchService implements IMentionMixSearchService {
    public boolean LIZJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(951));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(950));
    public volatile Set<String> LIZLLL = C08CX.INSTANCE;

    @Override // com.ss.android.ugc.aweme.service.IMentionMixSearchService
    public final boolean LIZIZ() {
        return ((HorizontalMentionMixSearchConfig) C315740CZg.LIZIZ.getValue()).scenes.contains("mention_after_publish");
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionMixSearchService
    public final int LJFF() {
        return ((HorizontalMentionMixSearchConfig) C315740CZg.LIZIZ.getValue()).remoteSearchDebounceMs;
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionMixSearchService
    public final boolean LJI() {
        return ((Boolean) C0AMR.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionMixSearchService
    public final void release() {
        if (this.LIZJ) {
            IMixSearchService iMixSearchService = (IMixSearchService) this.LIZ.getValue();
            if (iMixSearchService != null) {
                iMixSearchService.LIZIZ();
            }
            this.LIZJ = false;
            this.LIZLLL = C08CX.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionMixSearchService
    public final boolean LJ() {
        return C286800BLy.LIZ();
    }

    public static C099F LJIIIIZZ(long j, String str) throws Throwable {
        C11NZ<RelationSearchResponse> c11nzQueryRelationSearchList;
        IProfileService iProfileService = (IProfileService) PluggableExtentionKt.pluggableSpi$default(IProfileService.class, false, false, false, 14, null);
        if (iProfileService != null && (c11nzQueryRelationSearchList = iProfileService.queryRelationSearchList(((Number) C0AMT.LIZ.getValue()).intValue(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), str, Integer.valueOf((int) j))) != null) {
            C11ON c11onLJJJJZI = c11nzQueryRelationSearchList.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0DC0
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
            new C11IE(c11onLJJJJZI).LJIJ(new C516201zk(c099fLIZIZ, 200), new AfS171S0100000_2(c099fLIZIZ, 41), new C346430Di5(c099fLIZIZ, 5));
            return c099fLIZIZ;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    @Override // com.ss.android.ugc.aweme.service.IMentionMixSearchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r9, X.InterfaceC1364105Vn<? super X.C225300tv> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C316760CbK
            if (r0 == 0) goto L56
            r4 = r10
            X.0CbK r4 = (X.C316760CbK) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L49
            if (r1 != r0) goto L6a
            X.C155000ia.LIZIZ(r2)
        L22:
            X.00tw r2 = (X.C225400tw) r2
            java.util.List<X.15l7> r1 = r2.LIZ
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r1.next()
            X.15l7 r0 = (X.C20611915l7) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = X.C20611815l6.LJFF(r0)
            r3.add(r0)
            goto L35
        L49:
            X.C155000ia.LIZIZ(r2)
            r4.LLILLL = r0
            r0 = 0
            java.lang.Object r2 = r8.LJIIJ(r9, r0, r4)
            if (r2 != r3) goto L22
            return r3
        L56:
            X.0CbK r4 = new X.0CbK
            r4.<init>(r8, r10)
            goto L12
        L5c:
            java.lang.String r4 = r2.LIZIZ
            int r5 = r2.LIZJ
            float r6 = r2.LIZLLL
            float r7 = r2.LJ
            X.00tv r2 = new X.00tv
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    @Override // com.ss.android.ugc.aweme.service.IMentionMixSearchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(long r11, java.lang.String r13, X.InterfaceC1364105Vn r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C316750CbJ
            r4 = r10
            if (r0 == 0) goto L57
            r9 = r14
            X.0CbJ r9 = (X.C316750CbJ) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r9.LLILLL = r2
        L13:
            java.lang.Object r3 = r9.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r9.LLILLL
            r0 = 1
            if (r1 == 0) goto L48
            if (r1 != r0) goto L5e
            X.C155000ia.LIZIZ(r3)
        L23:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r3, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r3.iterator()
        L34:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r1.next()
            X.15l7 r0 = (X.C20611915l7) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = X.C20611815l6.LJFF(r0)
            r2.add(r0)
            goto L34
        L48:
            X.C155000ia.LIZIZ(r3)
            r8 = 0
            r9.LLILLL = r0
            r5 = r13
            r6 = r11
            java.lang.Object r3 = r4.LJIIJJI(r5, r6, r8, r9)
            if (r3 != r2) goto L23
            return r2
        L57:
            X.0CbJ r9 = new X.0CbJ
            r9.<init>(r4, r14)
            goto L13
        L5d:
            return r2
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService.LIZJ(long, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionMixSearchService
    public final List<User> LJII(List<? extends User> list, List<? extends User> list2, List<? extends User> list3) {
        return LJIIIZ(list, list2, list3, AFwS232S0000000_4.get$arr$(17));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.lang.String r24, X.C20612815lG r25, X.InterfaceC1364105Vn<? super X.C225400tw> r26) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService.LJIIJ(java.lang.String, X.15lG, X.05Vn):java.lang.Object");
    }

    public static List LJIIIZ(List list, List list2, List list3, Function1 function1) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (curUserId != null) {
            linkedHashSet.add(curUserId);
        }
        Iterator it2 = C1697810uHb.LJIIJJI(list, list2, list3).iterator();
        while (it2.hasNext()) {
            for (Object obj : (List) it2.next()) {
                if (linkedHashSet.add(function1.invoke(obj))) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.String r23, long r24, X.C20612815lG r26, X.InterfaceC1364105Vn<? super java.util.List<X.C20611915l7>> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService.LJIIJJI(java.lang.String, long, X.15lG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // com.ss.android.ugc.aweme.service.IMentionMixSearchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(long r13, java.lang.String r15, java.lang.String r16, java.util.List r17, X.InterfaceC1364105Vn r18) {
        /*
            r12 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C316770CbL
            r4 = r12
            if (r0 == 0) goto L5f
            r11 = r3
            X.0CbL r11 = (X.C316770CbL) r11
            int r2 = r11.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r11.LLILLL = r2
        L15:
            java.lang.Object r3 = r11.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r11.LLILLL
            r0 = 1
            if (r1 == 0) goto L4c
            if (r1 != r0) goto L6d
            X.C155000ia.LIZIZ(r3)
        L25:
            X.00vu r3 = (X.C237600vu) r3
            java.util.List<X.15l7> r1 = r3.LIZ
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L38:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r1.next()
            X.15l7 r0 = (X.C20611915l7) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = X.C20611815l6.LJFF(r0)
            r2.add(r0)
            goto L38
        L4c:
            X.C155000ia.LIZIZ(r3)
            r10 = 0
            r11.LLILLL = r0
            r9 = r16
            r5 = r15
            r7 = r13
            r6 = r17
            java.lang.Object r3 = r4.LJIIL(r5, r6, r7, r9, r10, r11)
            if (r3 != r2) goto L25
            return r2
        L5f:
            X.0CbL r11 = new X.0CbL
            r11.<init>(r4, r3)
            goto L15
        L65:
            boolean r1 = r3.LIZIZ
            X.00ED r0 = new X.00ED
            r0.<init>(r2, r1)
            return r0
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService.LIZLLL(long, java.lang.String, java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    public final Object LJIIL(String str, List<String> list, long j, String str2, C20612815lG c20612815lG, InterfaceC1364105Vn<? super C237600vu> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C316590Cb3(list, j, str, str2, this, c20612815lG, null));
    }
}
