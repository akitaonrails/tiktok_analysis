package ttpobfuscated;

import X.AnonymousClass0957;
import X.C099R;
import X.C09AX;
import X.C09AY;
import X.C09DV;
import X.C1507240pKE;
import X.C155000ia;
import X.C1C7U;
import X.C23250099c;
import X.C452501pT;
import X.C817503Hh;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ttpobfuscated.z5;

/* JADX INFO: loaded from: classes24.dex */
public final class t6 extends o7 {
    public final tg m;

    public final class a extends C09AY implements Function0<AnonymousClass0957<? extends jg>> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass0957<jg> invoke() {
            return C23250099c.LIZIZ(C817503Hh.LL, null, null, new C0075a(t6.this, null), 3);
        }

        /* JADX INFO: renamed from: ttpobfuscated.t6$a$a, reason: collision with other inner class name */
        @C09DV(c = "ttp.orbu.sdk.app.domain.runtime.instruction.HasPropertyInstruction$run$user$1$1", f = "HasPropertyInstruction.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
        public final class C0075a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super jg>, Object> {
            public int a;
            public final /* synthetic */ t6 b;

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                C1C7U.LIZ("t6$a@46ad.a$1");
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
                    tg tgVar = this.b.m;
                    this.a = 1;
                    obj = tgVar.a(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("t6$a@46ad.a$1");
                        return objLJFF;
                    }
                }
                C1C7U.LIZIZ("t6$a@46ad.a$1");
                return obj;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0075a(t6 t6Var, InterfaceC1364105Vn<? super C0075a> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.b = t6Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super jg> interfaceC1364105Vn) {
                return new C0075a(this.b, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new C0075a(this.b, interfaceC1364105Vn);
            }
        }

        public a() {
            super(0);
        }
    }

    public t6(List<C1507240pKE> list, tg tgVar) {
        super(ha.HasProperty, list);
        this.m = tgVar;
    }

    @Override // ttpobfuscated.o7
    public tc a(xc xcVar, cc ccVar) {
        String strA;
        z5 z5VarA = z5.d.a(z5.a, c(xcVar), null, ccVar, C452501pT.LIZIZ(new a()), 2, null);
        if (z5VarA != null) {
            strA = z5VarA.a();
        } else {
            strA = null;
        }
        return a(strA);
    }
}
