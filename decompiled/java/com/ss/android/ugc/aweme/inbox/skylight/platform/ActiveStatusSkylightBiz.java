package com.ss.android.ugc.aweme.inbox.skylight.platform;

import X.C1596950rev;
import X.EnumC1597060rf6;
import X.InterfaceC1595240rcA;
import X.InterfaceC1596570reJ;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.platform.SkylightBiz;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class ActiveStatusSkylightBiz implements SkylightBiz<InterfaceC1891350zJl> {
    public final EnumC1597060rf6 LIZ = EnumC1597060rf6.ACTIVE_STATUS;

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final InterfaceC1596570reJ<InterfaceC1891350zJl> LIZIZ() {
        return new InterfaceC1596570reJ<InterfaceC1891350zJl>() { // from class: X.0rfw
            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597700rg8<InterfaceC1891350zJl> LIZ(int i) {
                return new C1598840rhy();
            }

            @Override // X.InterfaceC1596570reJ
            public final List<C1597160rfG<?>> LIZIZ(int i) {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597360rfa<InterfaceC1891350zJl> LIZJ(int i) {
                return new InterfaceC1597360rfa<InterfaceC1891350zJl>() { // from class: X.0rfr
                    @Override // X.InterfaceC1597360rfa
                    public final List<EnumC1597060rf6> LIZ() {
                        return C1697810uHb.LJIIJJI(EnumC1597060rf6.LIVE, EnumC1597060rf6.LIVE_EVENT, EnumC1597060rf6.STORY, EnumC1597060rf6.HIGHLIGHT);
                    }

                    @Override // X.InterfaceC1597360rfa
                    public final List<InterfaceC1160280gIc<InterfaceC1891350zJl>> LIZIZ(List<? extends InterfaceC1891350zJl> list) {
                        return C13BV.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashSet, java.util.LinkedHashSet] */
                    /* JADX WARN: Type inference failed for: r5v1, types: [X.08CX] */
                    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashSet, java.util.LinkedHashSet] */
                    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Set] */
                    /* JADX WARN: Type inference failed for: r5v5, types: [X.08CX] */
                    @Override // X.InterfaceC1597360rfa
                    public final List LIZJ(C1597310rfV c1597310rfV, List list) {
                        ?? linkedHashSet;
                        InterfaceC1595240rcA interfaceC1595240rcA;
                        String uid;
                        if (list.isEmpty()) {
                            return C13BV.INSTANCE;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (obj instanceof C1598860ri0) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return C13BV.INSTANCE;
                        }
                        if (C1597190rfJ.LIZ(c1597310rfV)) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                String uid2 = ((C1598860ri0) it2.next()).LL.getUid();
                                if (uid2 != null) {
                                    arrayList2.add(new C1160290gId(C1596950rev.LIZJ(EnumC1597060rf6.ACTIVE_STATUS, uid2)));
                                }
                            }
                            return arrayList2;
                        }
                        C1597610rfz c1597610rfz = C1597610rfz.LIZ;
                        List<EnumC1597060rf6> listLIZ = LIZ();
                        c1597610rfz.getClass();
                        if (arrayList.isEmpty()) {
                            linkedHashSet = C08CX.INSTANCE;
                        } else if (!C0C93.LIZ(c1597310rfV.LIZJ(EnumC1597060rf6.STORY).size() + c1597310rfV.LIZJ(EnumC1597060rf6.LIVE).size())) {
                            linkedHashSet = new LinkedHashSet();
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                String uid3 = ((C1598860ri0) it3.next()).LL.getUid();
                                if (uid3 != null) {
                                    linkedHashSet.add(uid3);
                                }
                            }
                        } else {
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            Iterator<EnumC1597060rf6> it4 = listLIZ.iterator();
                            while (it4.hasNext()) {
                                for (InterfaceC1891350zJl interfaceC1891350zJl : c1597310rfV.LIZJ(it4.next())) {
                                    if ((interfaceC1891350zJl instanceof InterfaceC1595240rcA) && (interfaceC1595240rcA = (InterfaceC1595240rcA) interfaceC1891350zJl) != null && (uid = interfaceC1595240rcA.getUid()) != null && uid.length() != 0) {
                                        linkedHashSet2.add(uid);
                                    }
                                }
                            }
                            if (linkedHashSet2.isEmpty()) {
                                linkedHashSet = C08CX.INSTANCE;
                            } else {
                                linkedHashSet = new LinkedHashSet();
                                Iterator it5 = arrayList.iterator();
                                while (it5.hasNext()) {
                                    String uid4 = ((C1598860ri0) it5.next()).LL.getUid();
                                    if (uid4 != null && linkedHashSet2.contains(uid4)) {
                                        linkedHashSet.add(uid4);
                                    }
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return C13BV.INSTANCE;
                        }
                        Iterable iterable = (Iterable) linkedHashSet;
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(iterable, 10));
                        Iterator it6 = iterable.iterator();
                        while (it6.hasNext()) {
                            arrayList3.add(new C1160290gId(C1596950rev.LIZJ(EnumC1597060rf6.ACTIVE_STATUS, (String) it6.next())));
                        }
                        return arrayList3;
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
