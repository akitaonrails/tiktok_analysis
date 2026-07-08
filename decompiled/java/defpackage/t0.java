package defpackage;

import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C155000ia;
import X.InterfaceC1364105Vn;
import X.InterfaceC383701eN;
import X.InterfaceC497601wk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinItemResponseCursor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "BulletinInternalLoadMoreTask$onFirstLoadCompleted$1", f = "BulletinInternalLoadMoreTask.kt", l = {202, 74}, m = "invokeSuspend")
public final class t0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public r0 LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ r0 LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ Long LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(r0 r0Var, String str, boolean z, Long l, InterfaceC1364105Vn<? super t0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = r0Var;
        this.LLIZLLLIL = str;
        this.LLJ = z;
        this.LLJI = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new t0(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        r0 r0Var;
        InterfaceC383701eN interfaceC383701eN;
        String str;
        boolean z;
        Long l;
        Long l2;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        boolean z2 = true;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        interfaceC383701eN = this.LL;
                        C155000ia.LIZIZ(obj);
                        interfaceC383701eN.LIZIZ(null);
                        return Unit.LIZ;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.LLILZIL;
                l = (Long) this.LLILZ;
                str = (String) this.LLILLL;
                r0Var = this.LLILLJJLI;
                interfaceC383701eN = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                r0Var = this.LLIZ;
                interfaceC383701eN = r0Var.LJIILIIL;
                str = this.LLIZLLLIL;
                z = this.LLJ;
                l = this.LLJI;
                this.LL = interfaceC383701eN;
                this.LLILLJJLI = r0Var;
                this.LLILLL = str;
                this.LLILZ = l;
                this.LLILZIL = z;
                this.LLILZLL = 1;
                if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                    return objLJFF;
                }
            }
            BulletinItemResponseCursor bulletinItemResponseCursorLIZ = u0.LIZ(str);
            if (bulletinItemResponseCursorLIZ != null) {
                l2 = bulletinItemResponseCursorLIZ.nextCursor;
            } else {
                l2 = null;
            }
            r0Var.LJII = l2;
            r0Var.LJIIIIZZ = str;
            if (!z) {
                z2 = false;
            }
            r0Var.LJIIJJI = z2;
            r0Var.LJI = l;
            this.LL = interfaceC383701eN;
            this.LLILLJJLI = null;
            this.LLILLL = null;
            this.LLILZ = null;
            this.LLILZLL = 2;
            if (r0Var.LIZ(this) == objLJFF) {
                return objLJFF;
            }
            interfaceC383701eN.LIZIZ(null);
            return Unit.LIZ;
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            interfaceC383701eN.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
