package com.ss.android.ugc.aweme.live.skylight.platform;

import X.C1596950rev;
import X.EnumC1597060rf6;
import X.InterfaceC1595240rcA;
import X.InterfaceC1596570reJ;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.platform.SkylightBiz;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveEventSkylightBiz implements SkylightBiz<InterfaceC1891350zJl> {
    public final EnumC1597060rf6 LIZ = EnumC1597060rf6.LIVE_EVENT;

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final InterfaceC1596570reJ<InterfaceC1891350zJl> LIZIZ() {
        return new InterfaceC1596570reJ<InterfaceC1891350zJl>() { // from class: X.0reb
            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597700rg8<InterfaceC1891350zJl> LIZ(int i) {
                InterfaceC1597700rg8<InterfaceC1891350zJl> interfaceC1597700rg8;
                this.LIZ.getClass();
                if (C1569180qw8.LIZ(i)) {
                    return C614770O9j.LIZIZ.LJ().LJFF();
                }
                if (i == 3) {
                    Object objLIZJ = C1600300rkK.LIZIZ.LIZJ();
                    if ((objLIZJ instanceof InterfaceC1597700rg8) && (interfaceC1597700rg8 = (InterfaceC1597700rg8) objLIZJ) != null) {
                        return interfaceC1597700rg8;
                    }
                    return new InterfaceC1597700rg8<InterfaceC1891350zJl>() { // from class: X.0red
                        @Override // X.InterfaceC1597700rg8
                        public final Object LIZJ(C1596730reZ c1596730reZ, InterfaceC1364105Vn<? super C1160260gIa<? extends InterfaceC1891350zJl>> interfaceC1364105Vn) {
                            List<AnonymousClass0060> list = c1596730reZ.LJ;
                            ArrayList arrayList = new ArrayList();
                            for (AnonymousClass0060 anonymousClass0060 : list) {
                                if (anonymousClass0060 instanceof C0237005z) {
                                    arrayList.add(anonymousClass0060);
                                }
                            }
                            return new C1160260gIa(26, null, C13BV.INSTANCE, null, false, false);
                        }
                    };
                }
                if (i != 0) {
                    if (i != 2) {
                        C614770O9j.LIZIZ.LJ().LJIJJLI();
                        return C1596700reW.LIZ;
                    }
                    return C614770O9j.LIZIZ.LJ().LJJIJLIJ();
                }
                return C614770O9j.LIZIZ.LJ().LJJIJIL();
            }

            @Override // X.InterfaceC1596570reJ
            public final List<C1597160rfG<?>> LIZIZ(int i) {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597360rfa<InterfaceC1891350zJl> LIZJ(final int i) {
                return new InterfaceC1597360rfa<InterfaceC1891350zJl>(i) { // from class: X.0rfE
                    public final int LIZ;

                    @Override // X.InterfaceC1597360rfa
                    public final List<EnumC1597060rf6> LIZ() {
                        return this.LIZ == 2 ? Collections.singletonList(EnumC1597060rf6.LIVE) : C13BV.INSTANCE;
                    }

                    {
                        this.LIZ = i;
                    }

                    @Override // X.InterfaceC1597360rfa
                    public final List<InterfaceC1160280gIc<InterfaceC1891350zJl>> LIZIZ(List<? extends InterfaceC1891350zJl> list) {
                        return C13BV.INSTANCE;
                    }

                    @Override // X.InterfaceC1597360rfa
                    public final List LIZJ(C1597310rfV c1597310rfV, List list) {
                        InterfaceC1595240rcA interfaceC1595240rcA;
                        String uid;
                        InterfaceC1595240rcA interfaceC1595240rcA2;
                        String uid2;
                        if (this.LIZ != 2) {
                            return C13BV.INSTANCE;
                        }
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (InterfaceC1891350zJl interfaceC1891350zJl : c1597310rfV.LIZJ(EnumC1597060rf6.LIVE)) {
                            if ((interfaceC1891350zJl instanceof InterfaceC1595240rcA) && (interfaceC1595240rcA2 = (InterfaceC1595240rcA) interfaceC1891350zJl) != null && (uid2 = interfaceC1595240rcA2.getUid()) != null && uid2.length() != 0) {
                                linkedHashSet.add(uid2);
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return C13BV.INSTANCE;
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) it2.next();
                            if ((interfaceC1891350zJl2 instanceof InterfaceC1595240rcA) && (interfaceC1595240rcA = (InterfaceC1595240rcA) interfaceC1891350zJl2) != null && (uid = interfaceC1595240rcA.getUid()) != null && uid.length() != 0 && linkedHashSet.contains(uid)) {
                                arrayList.add(new C1160290gId(c1597310rfV.LIZIZ(interfaceC1891350zJl2)));
                            }
                        }
                        return arrayList;
                    }
                };
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final EnumC1597060rf6 getBizType() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final String LIZ(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        InterfaceC1595240rcA interfaceC1595240rcA;
        User user;
        if (!(interfaceC1891350zJl instanceof InterfaceC1595240rcA) || (interfaceC1595240rcA = (InterfaceC1595240rcA) interfaceC1891350zJl) == null || (user = interfaceC1595240rcA.getUser()) == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        return C1596950rev.LIZJ(this.LIZ, uid);
    }
}
