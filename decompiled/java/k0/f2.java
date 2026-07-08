package k0;

import X.C1838700xwq;
import X.C20047313cF;
import X.C20078113hD;
import X.EnumC1684030tvN;
import X.InterfaceC1392705cj;
import X.InterfaceC1420105h9;
import X.InterfaceC1677690tl9;
import X.InterfaceC1685750ty9;
import X.InterfaceC1690500u5o;
import X.InterfaceC595010NVj;
import androidx.compose.foundation.gestures.ScrollableElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class f2 {
    public static final AFwS274S0000000_30 LIZ = AFwS274S0000000_30.get$arr$(264);
    public static final C20078113hD LIZIZ = new InterfaceC1392705cj() { // from class: X.13hD
        @Override // X.InterfaceC1392705cj
        public final float LIZJ(float f) {
            return f;
        }
    };
    public static final C1838700xwq LIZJ = new InterfaceC1677690tl9() { // from class: X.0xwq
        @Override // X.InterfaceC1677690tl9
        public final float LJLJI() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.CoroutineContext.Element
        public final InterfaceC23272099y getKey() {
            return InterfaceC1677690tl9.LJLJJI;
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
            return (E) C09A1.LIZIZ(this, interfaceC23272099y);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
            return C09A1.LIZJ(this, interfaceC23272099y);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final CoroutineContext plus(CoroutineContext coroutineContext) {
            return C09A1.LIZLLL(this, coroutineContext);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) C09A1.LIZ(this, r, function2);
        }
    };
    public static final C20047313cF LIZLLL = new InterfaceC1690500u5o() { // from class: X.13cF
        @Override // X.InterfaceC1681050tqZ
        public final float LJJ() {
            return 1.0f;
        }

        @Override // X.InterfaceC1690500u5o
        public final float LJJJJLL(float f) {
            return f * 1.0f;
        }

        @Override // X.InterfaceC1690500u5o
        public final /* synthetic */ long LJJLIIIJLJLI(long j) {
            return C1682420tsm.LIZLLL(j, this);
        }

        @Override // X.InterfaceC1690500u5o
        public final /* synthetic */ long LJLI(long j) {
            return C1682420tsm.LIZIZ(j, this);
        }

        @Override // X.InterfaceC1681050tqZ
        public final /* synthetic */ long LJLJLJ(float f) {
            return C1685230txJ.LIZIZ(this, f);
        }

        @Override // X.InterfaceC1690500u5o
        public final /* synthetic */ int LJLLJ(float f) {
            return C1682420tsm.LIZ(f, this);
        }

        @Override // X.InterfaceC1690500u5o
        public final /* synthetic */ float LJLLL(long j) {
            return C1682420tsm.LIZJ(j, this);
        }

        @Override // X.InterfaceC1681050tqZ
        public final /* synthetic */ float LLI(long j) {
            return C1685230txJ.LIZ(this, j);
        }

        @Override // X.InterfaceC1690500u5o
        public final float getDensity() {
            return 1.0f;
        }

        @Override // X.InterfaceC1690500u5o
        public final float LJJI(int i) {
            return i / 1.0f;
        }

        @Override // X.InterfaceC1690500u5o
        public final float LLIIIJ(float f) {
            return f / 1.0f;
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.C20082713hx r10, long r11, X.InterfaceC1364105Vn r13) {
        /*
            r6 = r10
            boolean r0 = r13 instanceof X.C197014126i
            if (r0 == 0) goto L51
            r4 = r13
            X.126i r4 = (X.C197014126i) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r4.LLILZ = r2
        L13:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L57
            X.03Hg r9 = r4.LLILLJJLI
            X.13hx r6 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L27:
            float r0 = r9.element
            long r0 = r6.LJII(r0)
            X.05aS r2 = new X.05aS
            r2.<init>(r0)
            return r2
        L33:
            X.C155000ia.LIZIZ(r3)
            X.03Hg r9 = new X.03Hg
            r9.<init>()
            X.05bM r0 = X.EnumC1384205bM.Default
            X.13i2 r5 = new X.13i2
            r10 = 0
            r7 = r11
            r5.<init>(r6, r7, r9, r10)
            r4.LL = r6
            r4.LLILLJJLI = r9
            r4.LLILZ = r1
            java.lang.Object r0 = r6.LJFF(r0, r5, r4)
            if (r0 != r2) goto L27
            return r2
        L51:
            X.126i r4 = new X.126i
            r4.<init>(r13)
            goto L13
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.f2.LIZ(X.13hx, long, X.05Vn):java.lang.Object");
    }

    public static InterfaceC1685750ty9 LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1420105h9 interfaceC1420105h9, EnumC1684030tvN enumC1684030tvN, boolean z, boolean z2, InterfaceC595010NVj interfaceC595010NVj, int i) {
        InterfaceC595010NVj interfaceC595010NVj2 = interfaceC595010NVj;
        boolean z3 = z2;
        boolean z4 = z;
        if ((i & 4) != 0) {
            z4 = true;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            interfaceC595010NVj2 = null;
        }
        return interfaceC1685750ty9.LIZ(new ScrollableElement(null, null, enumC1684030tvN, interfaceC1420105h9, interfaceC595010NVj2, z4, z3));
    }
}
