package ttpobfuscated;

import X.AnonymousClass0957;
import X.C099R;
import X.C09AX;
import X.C09AY;
import X.C09DV;
import X.C13LP;
import X.C1507240pKE;
import X.C155000ia;
import X.C1697810uHb;
import X.C1C7U;
import X.C23250099c;
import X.C452501pT;
import X.C817503Hh;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.OrbuCodeConfig;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class q7 implements p7 {
    public final ByteBuffer a;
    public final s b;
    public final GeneralConfig c;
    public final OrbuCodeConfig d;
    public final tg e;
    public final j4 f;
    public final ad<Request> g;

    public final class a extends C09AY implements Function0<AnonymousClass0957<? extends jg>> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass0957<jg> invoke() {
            return C23250099c.LIZIZ(C817503Hh.LL, null, null, new C0068a(q7.this, null), 3);
        }

        /* JADX INFO: renamed from: ttpobfuscated.q7$a$a, reason: collision with other inner class name */
        @C09DV(c = "ttp.orbu.sdk.requestvalidator.InstructionBufferImpl$get$1$1", f = "InstructionBufferImpl.kt", l = {86}, m = "invokeSuspend")
        public final class C0068a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super jg>, Object> {
            public int a;
            public final /* synthetic */ q7 b;

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                C1C7U.LIZ("q7$a@ed4f.a$1");
                Object objLJFF = C099R.LJFF();
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    tg tgVar = this.b.e;
                    this.a = 1;
                    obj = tgVar.a(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("q7$a@ed4f.a$1");
                        return objLJFF;
                    }
                }
                C1C7U.LIZIZ("q7$a@ed4f.a$1");
                return obj;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0068a(q7 q7Var, InterfaceC1364105Vn<? super C0068a> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.b = q7Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super jg> interfaceC1364105Vn) {
                return new C0068a(this.b, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new C0068a(this.b, interfaceC1364105Vn);
            }
        }

        public a() {
            super(0);
        }
    }

    @Override // ttpobfuscated.p7
    public boolean a() {
        return this.a.hasRemaining();
    }

    @Override // ttpobfuscated.p7
    public int b() {
        return this.a.limit();
    }

    @Override // ttpobfuscated.p7
    public int c() {
        return this.a.position();
    }

    private final void b(int i) throws pa {
        if (i + 24 <= this.a.limit()) {
            return;
        }
        throw new pa("Instruction offset [" + i + "] is invalid for limit [" + this.a.limit() + ']');
    }

    @Override // ttpobfuscated.p7
    public o7 a(Integer num) throws pa {
        int iPosition;
        if (num != null) {
            iPosition = num.intValue();
        } else {
            iPosition = this.a.position();
        }
        b(iPosition);
        this.a.position(iPosition);
        IntBuffer intBufferAsIntBuffer = z.a(this.a, (Integer) null, 24, false, 5, (Object) null).asIntBuffer();
        List<C1507240pKE> listLJIIJJI = C1697810uHb.LJIIJJI(new C1507240pKE(intBufferAsIntBuffer.get()), new C1507240pKE(intBufferAsIntBuffer.get()), new C1507240pKE(intBufferAsIntBuffer.get()), new C1507240pKE(intBufferAsIntBuffer.get()), new C1507240pKE(intBufferAsIntBuffer.get()), new C1507240pKE(intBufferAsIntBuffer.get()));
        int i = (((C1507240pKE) C13LP.LJJJJZI(listLJIIJJI)).LL & 67043328) >>> 16;
        ha haVarA = ha.b.a(i);
        if (haVarA != null) {
            bh.c.getClass();
            if (bh.d.a) {
                return ia.a(haVarA, listLJIIJJI, this.b, C452501pT.LIZIZ(new a()), null, this.c, this.d, this.f, this.e, this.g);
            }
            return ua.a.b().d().a(haVarA, listLJIIJJI, this.b, this.g);
        }
        throw new pa("Unknown OpCode [" + ((Object) C1507240pKE.LIZJ(i)) + ']');
    }

    @Override // ttpobfuscated.p7
    public void a(int i) {
        this.a.position(i);
    }

    public q7(ByteBuffer byteBuffer, s sVar, GeneralConfig generalConfig, OrbuCodeConfig orbuCodeConfig, tg tgVar, j4 j4Var, ad<Request> adVar) {
        this.a = byteBuffer;
        this.b = sVar;
        this.c = generalConfig;
        this.d = orbuCodeConfig;
        this.e = tgVar;
        this.f = j4Var;
        this.g = adVar;
    }
}
