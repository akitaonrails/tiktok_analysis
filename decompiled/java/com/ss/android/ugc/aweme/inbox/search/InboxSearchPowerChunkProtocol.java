package com.ss.android.ugc.aweme.inbox.search;

import X.C06KX;
import X.C0ALX;
import X.C1241890iQF;
import X.C1241920iQI;
import X.EnumC1154650g9X;
import X.EnumC1241910iQH;
import X.EnumC1242040iQU;
import X.InterfaceC1364105Vn;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public abstract class InboxSearchPowerChunkProtocol implements C06KX {
    public final boolean LL = true;
    public final EnumC1154650g9X LLILLJJLI = EnumC1154650g9X.LOCAL;
    public final int LLILLL = ((Number) C0ALX.LIZ.getValue()).intValue();
    public C1241890iQF LLILZ;

    public abstract List<Class<? extends InboxSearchPowerCell<?>>> LIZ();

    public long LIZLLL() {
        return 0L;
    }

    public abstract EnumC1242040iQU LJFF();

    public abstract Object LJI(String str, InterfaceC1364105Vn<? super C1241920iQI> interfaceC1364105Vn);

    public int LJII() {
        return 0;
    }

    public abstract String LJIIIIZZ();

    public abstract EnumC1241910iQH LJIIIZ();

    public EnumC1154650g9X LIZJ() {
        return this.LLILLJJLI;
    }

    public boolean LJ() {
        return this.LL;
    }
}
