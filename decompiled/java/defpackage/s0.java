package defpackage;

import X.AbstractC23140094w;
import X.C09DV;
import X.InterfaceC1364105Vn;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "BulletinInternalLoadMoreTask", f = "BulletinInternalLoadMoreTask.kt", l = {151, 155, 165, 169}, m = "executeLoadMore")
public final class s0 extends AbstractC23140094w {
    public Function0 LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ r0 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(r0 r0Var, InterfaceC1364105Vn<? super s0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = r0Var;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        return this.LLILZ.LIZIZ(null, this);
    }
}
