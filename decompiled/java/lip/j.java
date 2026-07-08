package lip;

import X.C098D;
import X.C11J7;
import X.C11KB;
import X.C11NZ;
import X.C11P0;
import X.C11PI;
import X.C19494511Ot;
import X.EnumC19492211Nw;
import X.InterfaceC1487280oo2;
import X.InterfaceC626120Oh8;

/* JADX INFO: loaded from: classes30.dex */
public final class j<T, U> extends C11J7<T, U> {
    public final InterfaceC1487280oo2<? super T, ? extends C098D<? extends U>> LLILLJJLI;
    public final int LLILLL;
    public final EnumC19492211Nw LLILZ;

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super U> interfaceC626120Oh8) {
        boolean z;
        if (C11KB.LIZ(this.LL, interfaceC626120Oh8, this.LLILLJJLI)) {
            return;
        }
        if (this.LLILZ == EnumC19492211Nw.IMMEDIATE) {
            this.LL.LIZIZ(new C19494511Ot(new C11PI(interfaceC626120Oh8), this.LLILLJJLI, this.LLILLL));
            return;
        }
        C098D<T> c098d = this.LL;
        InterfaceC1487280oo2<? super T, ? extends C098D<? extends U>> interfaceC1487280oo2 = this.LLILLJJLI;
        int i = this.LLILLL;
        if (this.LLILZ == EnumC19492211Nw.END) {
            z = true;
        } else {
            z = false;
        }
        c098d.LIZIZ(new C11P0(interfaceC626120Oh8, interfaceC1487280oo2, i, z));
    }

    public j(C11NZ c11nz, InterfaceC1487280oo2 interfaceC1487280oo2, int i, EnumC19492211Nw enumC19492211Nw) {
        super(c11nz);
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILZ = enumC19492211Nw;
        this.LLILLL = Math.max(8, i);
    }
}
