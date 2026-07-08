package com.ss.android.ugc.aweme.inbox.skylight.platform;

import X.C1596950rev;
import X.C1598140rgq;
import X.EnumC1597060rf6;
import X.InterfaceC1596570reJ;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.platform.SkylightBiz;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsSkylightBiz implements SkylightBiz<InterfaceC1891350zJl> {
    public final EnumC1597060rf6 LIZ = EnumC1597060rf6.FRIENDS;

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final InterfaceC1596570reJ<InterfaceC1891350zJl> LIZIZ() {
        return new InterfaceC1596570reJ<InterfaceC1891350zJl>() { // from class: X.0rfv
            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597700rg8<InterfaceC1891350zJl> LIZ(int i) {
                return C1598680rhi.LIZ;
            }

            @Override // X.InterfaceC1596570reJ
            public final List<C1597160rfG<?>> LIZIZ(int i) {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597360rfa<InterfaceC1891350zJl> LIZJ(int i) {
                return new C1597540rfs();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final EnumC1597060rf6 getBizType() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final String LIZ(InterfaceC1891350zJl interfaceC1891350zJl) {
        String string;
        C1598140rgq c1598140rgq;
        SkylightData skylightData;
        Long l;
        if (!(interfaceC1891350zJl instanceof C1598140rgq) || (c1598140rgq = (C1598140rgq) interfaceC1891350zJl) == null || (skylightData = c1598140rgq.LLILLJJLI) == null || (l = skylightData.uid) == null || (string = l.toString()) == null) {
            string = "";
        }
        return C1596950rev.LIZJ(this.LIZ, string);
    }
}
