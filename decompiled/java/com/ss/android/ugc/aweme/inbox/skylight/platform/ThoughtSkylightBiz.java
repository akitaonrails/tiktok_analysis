package com.ss.android.ugc.aweme.inbox.skylight.platform;

import X.C1596950rev;
import X.EnumC1597060rf6;
import X.InterfaceC1596570reJ;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.platform.SkylightBiz;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.ThoughtInboxItem;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class ThoughtSkylightBiz implements SkylightBiz<InterfaceC1891350zJl> {
    public final EnumC1597060rf6 LIZ = EnumC1597060rf6.THOUGHT;

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final InterfaceC1596570reJ<InterfaceC1891350zJl> LIZIZ() {
        return new InterfaceC1596570reJ<InterfaceC1891350zJl>() { // from class: X.0rfu
            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597700rg8<InterfaceC1891350zJl> LIZ(int i) {
                return C614770O9j.LIZIZ.LJ().LJIIJJI(i);
            }

            @Override // X.InterfaceC1596570reJ
            public final List<C1597160rfG<?>> LIZIZ(int i) {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597360rfa<InterfaceC1891350zJl> LIZJ(int i) {
                return new InterfaceC1597360rfa<InterfaceC1891350zJl>() { // from class: X.0rft
                    @Override // X.InterfaceC1597360rfa
                    public final List<EnumC1597060rf6> LIZ() {
                        return C13BV.INSTANCE;
                    }

                    @Override // X.InterfaceC1597360rfa
                    public final List<InterfaceC1160280gIc<InterfaceC1891350zJl>> LIZIZ(List<? extends InterfaceC1891350zJl> list) {
                        ThoughtInboxItem thoughtInboxItem;
                        User thoughtUser;
                        String uid;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        ArrayList arrayList = new ArrayList();
                        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                            if ((interfaceC1891350zJl instanceof ThoughtInboxItem) && (thoughtInboxItem = (ThoughtInboxItem) interfaceC1891350zJl) != null && (thoughtUser = thoughtInboxItem.getThoughtUser()) != null && (uid = thoughtUser.getUid()) != null && !linkedHashSet.add(uid)) {
                                arrayList.add(new C1160290gId(C1596950rev.LIZJ(EnumC1597060rf6.THOUGHT, uid)));
                            }
                        }
                        return arrayList;
                    }

                    @Override // X.InterfaceC1597360rfa
                    public final List LIZJ(C1597310rfV c1597310rfV, List list) {
                        return C13BV.INSTANCE;
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
        ThoughtInboxItem thoughtInboxItem;
        User thoughtUser;
        if (!(interfaceC1891350zJl instanceof ThoughtInboxItem) || (thoughtInboxItem = (ThoughtInboxItem) interfaceC1891350zJl) == null || (thoughtUser = thoughtInboxItem.getThoughtUser()) == null || (uid = thoughtUser.getUid()) == null) {
            uid = "";
        }
        return C1596950rev.LIZJ(this.LIZ, uid);
    }
}
