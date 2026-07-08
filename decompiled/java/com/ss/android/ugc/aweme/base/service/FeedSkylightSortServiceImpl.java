package com.ss.android.ugc.aweme.base.service;

import X.C1596330rdv;
import X.C2188811AlT;
import X.InterfaceC1595240rcA;
import X.InterfaceC1891350zJl;
import X.InterfaceC714040Rze;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IFeedSkylightSortService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSkylightSortServiceImpl implements IFeedSkylightSortService {
    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightSortService
    public final void LIZ(int i) {
        C1596330rdv.LIZ.getClass();
        C1596330rdv.LIZ(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightSortService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZJ(java.util.List r15, int r16, int r17) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.service.FeedSkylightSortServiceImpl.LIZJ(java.util.List, int, int):int");
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightSortService
    public final Pair<List<InterfaceC1891350zJl>, List<InterfaceC1891350zJl>> LIZIZ(int i, int i2, List<? extends InterfaceC1891350zJl> list, String str, Function2<? super Integer, ? super InterfaceC1891350zJl, Unit> function2) {
        int i3;
        boolean z;
        boolean z2;
        String nickname;
        InterfaceC1595240rcA interfaceC1595240rcA;
        User user;
        InterfaceC1595240rcA interfaceC1595240rcA2;
        User user2;
        String uid;
        int i4 = 1;
        if (i2 == 1) {
            if (i != 1 && i != 3) {
                i3 = 0;
            } else {
                i3 = 2;
            }
        } else {
            i3 = LSPassThroughRecordSizeConfig.DEFAULT;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            Integer numValueOf = null;
            if (str != null && (interfaceC1891350zJl instanceof InterfaceC1595240rcA)) {
                User user3 = ((InterfaceC1595240rcA) interfaceC1891350zJl).getUser();
                if (user3 != null) {
                    uid = user3.getUid();
                } else {
                    uid = null;
                }
                if (Intrinsics.LJFF(uid, str)) {
                    if (function2 != null) {
                        function2.invoke(10, interfaceC1891350zJl);
                    }
                    arrayList.add(interfaceC1891350zJl);
                    i3++;
                }
            }
            if (i2 == i4 && arrayList.size() >= i3) {
                if (function2 != null) {
                    function2.invoke(1, interfaceC1891350zJl);
                }
                arrayList2.add(interfaceC1891350zJl);
            } else {
                boolean z3 = interfaceC1891350zJl instanceof InterfaceC1595240rcA;
                if (z3 && !((InterfaceC1595240rcA) interfaceC1891350zJl).isUnfollow()) {
                    z = true;
                } else {
                    z = false;
                }
                if ((interfaceC1891350zJl instanceof InterfaceC714040Rze) && ((InterfaceC714040Rze) interfaceC1891350zJl).hasUnreadStory()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sortStorySkylightData: name = ");
                if (z3 && (interfaceC1595240rcA2 = (InterfaceC1595240rcA) interfaceC1891350zJl) != null && (user2 = interfaceC1595240rcA2.getUser()) != null) {
                    nickname = user2.getNickname();
                } else {
                    nickname = null;
                }
                sbLIZ.append(nickname);
                sbLIZ.append(", follow = ");
                if (z3 && (interfaceC1595240rcA = (InterfaceC1595240rcA) interfaceC1891350zJl) != null && (user = interfaceC1595240rcA.getUser()) != null) {
                    numValueOf = Integer.valueOf(user.getFollowStatus());
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append("}, hasUnreadStory = ");
                sbLIZ.append(z2);
                C2188811AlT.LIZIZ(sbLIZ);
                if (z && z2) {
                    if (function2 != null) {
                        function2.invoke(0, interfaceC1891350zJl);
                    }
                    arrayList.add(interfaceC1891350zJl);
                } else {
                    if (function2 != null) {
                        function2.invoke(1, interfaceC1891350zJl);
                    }
                    arrayList2.add(interfaceC1891350zJl);
                }
            }
            i4 = 1;
        }
        return new Pair<>(arrayList, arrayList2);
    }
}
