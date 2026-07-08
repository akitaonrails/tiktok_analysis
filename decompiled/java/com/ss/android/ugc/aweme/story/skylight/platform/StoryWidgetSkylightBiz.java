package com.ss.android.ugc.aweme.story.skylight.platform;

import X.C1596950rev;
import X.EnumC1597060rf6;
import X.InterfaceC1595240rcA;
import X.InterfaceC1596570reJ;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.platform.SkylightBiz;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.widget.IStoryWidgetService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryWidgetSkylightBiz implements SkylightBiz<InterfaceC1891350zJl> {
    public final EnumC1597060rf6 LIZ = EnumC1597060rf6.STORY_WIDGET;

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final InterfaceC1596570reJ<InterfaceC1891350zJl> LIZIZ() {
        return new InterfaceC1596570reJ<InterfaceC1891350zJl>() { // from class: X.0rfx
            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597700rg8<InterfaceC1891350zJl> LIZ(int i) {
                return new InterfaceC1597700rg8<InterfaceC1891350zJl>() { // from class: X.0rg9
                    public final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(16));
                    public InterfaceC1891350zJl LIZIZ;

                    @Override // X.InterfaceC1597700rg8
                    public final Object LIZJ(C1596730reZ c1596730reZ, InterfaceC1364105Vn<? super C1160260gIa<? extends InterfaceC1891350zJl>> interfaceC1364105Vn) {
                        C1598170rgt c1598170rgtLLILL;
                        Pair<InterfaceC1891350zJl, Boolean> pairLIZLLL;
                        if (c1596730reZ.LIZIZ == EnumC1597050rf5.REFRESH) {
                            IStoryWidgetService iStoryWidgetService = (IStoryWidgetService) this.LIZ.getValue();
                            if (iStoryWidgetService != null && (pairLIZLLL = iStoryWidgetService.LIZLLL()) != null && pairLIZLLL.getFirst() != null) {
                                c1598170rgtLLILL = ((InterfaceC1597720rgA) pairLIZLLL.getFirst()).LLILL(10000);
                            } else {
                                c1598170rgtLLILL = null;
                            }
                            this.LIZIZ = c1598170rgtLLILL;
                        }
                        return new C1160260gIa(10, null, C1697810uHb.LJIIL(this.LIZIZ), null, false, true);
                    }
                };
            }

            @Override // X.InterfaceC1596570reJ
            public final List<C1597160rfG<?>> LIZIZ(int i) {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597360rfa<InterfaceC1891350zJl> LIZJ(int i) {
                return new InterfaceC1597360rfa<InterfaceC1891350zJl>() { // from class: X.0rfK
                    @Override // X.InterfaceC1597360rfa
                    public final List<EnumC1597060rf6> LIZ() {
                        return Collections.singletonList(EnumC1597060rf6.STORY);
                    }

                    @Override // X.InterfaceC1597360rfa
                    public final List<InterfaceC1160280gIc<InterfaceC1891350zJl>> LIZIZ(List<? extends InterfaceC1891350zJl> list) {
                        return C13BV.INSTANCE;
                    }

                    @Override // X.InterfaceC1597360rfa
                    public final List LIZJ(C1597310rfV c1597310rfV, List list) {
                        Boolean bool;
                        String uid;
                        InterfaceC1595240rcA interfaceC1595240rcA;
                        User user;
                        Object obj = c1597310rfV.LIZ(EnumC1597060rf6.STORY).get("has_more");
                        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null && bool.booleanValue()) {
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                                if (!(interfaceC1891350zJl instanceof InterfaceC1595240rcA) || (interfaceC1595240rcA = (InterfaceC1595240rcA) interfaceC1891350zJl) == null || (user = interfaceC1595240rcA.getUser()) == null || (uid = user.getUid()) == null) {
                                    uid = "";
                                }
                                arrayList.add(new C1160290gId(C1596950rev.LIZJ(EnumC1597060rf6.STORY_WIDGET, uid)));
                            }
                            return arrayList;
                        }
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
        InterfaceC1595240rcA interfaceC1595240rcA;
        User user;
        if (!(interfaceC1891350zJl instanceof InterfaceC1595240rcA) || (interfaceC1595240rcA = (InterfaceC1595240rcA) interfaceC1891350zJl) == null || (user = interfaceC1595240rcA.getUser()) == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        return C1596950rev.LIZJ(this.LIZ, uid);
    }
}
