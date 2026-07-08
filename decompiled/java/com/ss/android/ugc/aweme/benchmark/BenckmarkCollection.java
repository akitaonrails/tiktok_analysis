package com.ss.android.ugc.aweme.benchmark;

import X.C0CCZ;
import X.C0VZ0;
import X.C1336210ksN;
import X.C21310818aY;
import X.C21310918aZ;
import X.C21311018aa;
import X.C2188811AlT;
import X.C806930Vl5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1294060jmO;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class BenckmarkCollection implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public /* bridge */ /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public String key() {
        return "BenckmarkCollection";
    }

    @Override // X.InterfaceC800080Va2
    public /* bridge */ /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    @InterfaceC1294060jmO
    public /* bridge */ /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public /* bridge */ /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public /* bridge */ /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.18aX] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void initCollection() {
        C21310918aZ c21310918aZ;
        if (((Boolean) C1336210ksN.LIZLLL.getValue()).booleanValue()) {
            return;
        }
        C21311018aa c21311018aa = C21311018aa.LIZIZ;
        synchronized (c21311018aa) {
            c21310918aZ = c21311018aa.LIZ;
        }
        final C21310818aY c21310818aY = new C21310818aY();
        if (BenchmarkRunningGroupId.value() > 0) {
            int iValue = BenchmarkRunningGroupId.value();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setRunningGroupId: ");
            sbLIZ.append(iValue);
            C2188811AlT.LIZIZ(sbLIZ);
            C806930Vl5.LIZJ("ByteBench");
            if (iValue <= 0) {
                c21310818aY.LIZ = false;
            } else {
                c21310818aY.LIZ = true;
                c21310818aY.LIZIZ = iValue;
            }
        }
        c21310918aZ.LIZIZ(new Object(c21310818aY) { // from class: X.18aX
            public final boolean LIZ;
            public final int LIZIZ;
            public final EnumC1490360ot0 LIZJ;
            public final boolean LIZLLL;

            {
                this.LIZ = c21310818aY.LIZ;
                this.LIZIZ = c21310818aY.LIZIZ;
                this.LIZJ = c21310818aY.LIZJ;
                this.LIZLLL = c21310818aY.LIZLLL;
            }
        });
        C21311018aa.LIZIZ.LIZ().LIZ();
    }

    @Override // X.C0CCZ
    public EnumC799870VZh type() {
        return EnumC799870VZh.APP_BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public void run(Context context) {
        initCollection();
    }
}
