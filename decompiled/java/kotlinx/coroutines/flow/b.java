package kotlinx.coroutines.flow;

import X.AbstractC23133094p;
import X.C094D;
import X.C23135094r;
import X.EnumC2252401DDy;
import X.InterfaceC1364105Vn;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class b<T> extends C23135094r<T> {
    public final Function2<C094D<? super T>, InterfaceC1364105Vn<? super Unit>, Object> LLILLJJLI;

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    @Override // X.C23135094r, X.AbstractC23133094p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collectTo(X.C094D<? super T> r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C23136094s
            if (r0 == 0) goto L3b
            r4 = r7
            X.094s r4 = (X.C23136094s) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L2d
            if (r1 != r0) goto L49
            X.094D r6 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            boolean r0 = r6.LJ()
            if (r0 == 0) goto L41
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r6
            r4.LLILZ = r0
            java.lang.Object r0 = super.collectTo(r6, r4)
            if (r0 != r2) goto L24
            return r2
        L3b:
            X.094s r4 = new X.094s
            r4.<init>(r5, r7)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r1.<init>(r0)
            throw r1
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b.collectTo(X.094D, X.05Vn):java.lang.Object");
    }

    @Override // X.C23135094r, X.AbstractC23133094p
    public final AbstractC23133094p<T> create(CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        return new b(this.LLILLJJLI, coroutineContext, i, enumC2252401DDy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Function2<? super C094D<? super T>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        super(function2, coroutineContext, i, enumC2252401DDy);
        this.LLILLJJLI = function2;
    }
}
