package com.ss.android.ugc.aweme.story.skylight.platform;

import X.C1596950rev;
import X.EnumC1597060rf6;
import X.InterfaceC1595240rcA;
import X.InterfaceC1596570reJ;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.platform.SkylightBiz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class OnThisDaySkylightBiz implements SkylightBiz<InterfaceC1891350zJl> {
    public final EnumC1597060rf6 LIZ = EnumC1597060rf6.ON_THIS_DAY;

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final InterfaceC1596570reJ<InterfaceC1891350zJl> LIZIZ() {
        return new InterfaceC1596570reJ<InterfaceC1891350zJl>() { // from class: X.0rfC
            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597700rg8<InterfaceC1891350zJl> LIZ(int i) {
                InterfaceC1597700rg8<InterfaceC1891350zJl> interfaceC1597700rg8;
                if (i == 3) {
                    Object objLIZJ = C1600300rkK.LIZIZ.LIZJ();
                    if ((objLIZJ instanceof InterfaceC1597700rg8) && (interfaceC1597700rg8 = (InterfaceC1597700rg8) objLIZJ) != null) {
                        return interfaceC1597700rg8;
                    }
                }
                return new InterfaceC1597700rg8<InterfaceC1891350zJl>() { // from class: X.0rf1
                    @Override // X.InterfaceC1597700rg8
                    public final Object LIZJ(C1596730reZ c1596730reZ, InterfaceC1364105Vn<? super C1160260gIa<? extends InterfaceC1891350zJl>> interfaceC1364105Vn) {
                        List<AnonymousClass0060> list = c1596730reZ.LJ;
                        ArrayList arrayList = new ArrayList();
                        for (AnonymousClass0060 anonymousClass0060 : list) {
                            if (anonymousClass0060 instanceof AnonymousClass0062) {
                                arrayList.add(anonymousClass0060);
                            }
                        }
                        return new C1160260gIa(26, null, C13BV.INSTANCE, null, false, false);
                    }
                };
            }

            @Override // X.InterfaceC1596570reJ
            public final List<C1597160rfG<?>> LIZIZ(int i) {
                if (i == 3) {
                    return Collections.singletonList(new C1597160rfG(C13LE.LIZ(C1597180rfI.class), new C1597280rfS()));
                }
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597360rfa<InterfaceC1891350zJl> LIZJ(int i) {
                return new InterfaceC1597360rfa<InterfaceC1891350zJl>() { // from class: X.0rfD
                    @Override // X.InterfaceC1597360rfa
                    public final List<EnumC1597060rf6> LIZ() {
                        return C13BV.INSTANCE;
                    }

                    @Override // X.InterfaceC1597360rfa
                    public final List<InterfaceC1160280gIc<InterfaceC1891350zJl>> LIZIZ(List<? extends InterfaceC1891350zJl> list) {
                        return C13BV.INSTANCE;
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
        InterfaceC1595240rcA interfaceC1595240rcA;
        if (!(interfaceC1891350zJl instanceof InterfaceC1595240rcA) || (interfaceC1595240rcA = (InterfaceC1595240rcA) interfaceC1891350zJl) == null || (uid = interfaceC1595240rcA.getUid()) == null) {
            uid = "";
        }
        return C1596950rev.LIZJ(this.LIZ, uid);
    }
}
