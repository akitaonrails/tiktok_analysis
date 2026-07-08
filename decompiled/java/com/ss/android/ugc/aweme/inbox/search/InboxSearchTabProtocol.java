package com.ss.android.ugc.aweme.inbox.search;

import X.C06KX;
import X.C1241480iPa;
import X.C1241800iQ6;
import X.EnumC1241910iQH;
import X.EnumC1242040iQU;
import X.InterfaceC1364105Vn;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.protocal.IMMessageProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public abstract class InboxSearchTabProtocol implements C06KX {
    public final boolean LL = true;
    public final boolean LLILLJJLI = true;
    public C1241800iQ6 LLILLL;
    public C1241480iPa LLILZ;

    public abstract List<Class<? extends PowerCell<?>>> LIZ();

    public long LIZJ() {
        return 0L;
    }

    public boolean LJ() {
        return this instanceof IMMessageProtocol;
    }

    public abstract EnumC1242040iQU LJFF();

    public abstract Object LJI(int i, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn);

    public int LJII() {
        return 0;
    }

    public abstract String LJIIIIZZ();

    public abstract EnumC1241910iQH LJIIIZ();

    public void LJIIJJI() {
    }

    public void LJIIL() {
    }

    public boolean LIZLLL() {
        return this.LLILLJJLI;
    }

    public boolean LJIIJ() {
        return this.LL;
    }
}
