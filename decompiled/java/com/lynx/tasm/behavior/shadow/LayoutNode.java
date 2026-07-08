package com.lynx.tasm.behavior.shadow;

import X.C1312230kFh;
import X.C1312260kFk;
import X.C1312270kFl;
import X.C1312280kFm;
import X.EnumC1300260jwO;
import X.InterfaceC1300000jvy;
import X.InterfaceC1312240kFi;
import com.lynx.tasm.behavior.LayoutNodeManager;

/* JADX INFO: loaded from: classes21.dex */
public class LayoutNode {
    public LayoutNodeManager LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public InterfaceC1300000jvy LJFF;
    public InterfaceC1312240kFi LJI;
    public C1312270kFl LJII;
    public long LJIIIIZZ;

    public void LJFF() {
    }

    public void LJ() {
        InterfaceC1312240kFi interfaceC1312240kFi;
        InterfaceC1300000jvy interfaceC1300000jvy;
        this.LJII = new C1312270kFl((ShadowNode) this);
        if (!this.LIZJ && (interfaceC1300000jvy = this.LJFF) != null) {
            LJII(interfaceC1300000jvy);
        } else {
            if (this.LIZLLL || (interfaceC1312240kFi = this.LJI) == null) {
                return;
            }
            LJI(interfaceC1312240kFi);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kFn] */
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
    public void align() {
        if (this.LJI != null) {
            C1312260kFk c1312260kFk = new C1312260kFk();
            this.LJI.LIZJ(new Object() { // from class: X.0kFn
            }, c1312260kFk);
        }
    }

    public final void LJI(InterfaceC1312240kFi interfaceC1312240kFi) {
        this.LJI = interfaceC1312240kFi;
        LayoutNodeManager layoutNodeManager = this.LIZ;
        if (layoutNodeManager != null) {
            this.LIZLLL = true;
            layoutNodeManager.LJIIIIZZ(this.LIZIZ, this);
        }
    }

    public final void LJII(InterfaceC1300000jvy interfaceC1300000jvy) {
        this.LJFF = interfaceC1300000jvy;
        LayoutNodeManager layoutNodeManager = this.LIZ;
        if (layoutNodeManager != null) {
            this.LIZJ = true;
            layoutNodeManager.LJIIIIZZ(this.LIZIZ, this);
        }
    }

    public float[] measure(float f, int i, float f2, int i2, boolean z) {
        float[] fArr = new float[3];
        InterfaceC1300000jvy interfaceC1300000jvy = this.LJFF;
        if (interfaceC1300000jvy != null) {
            long jLIZLLL = interfaceC1300000jvy.LIZLLL(this, f, EnumC1300260jwO.fromInt(i), f2, EnumC1300260jwO.fromInt(i2));
            fArr[0] = Float.intBitsToFloat((int) ((jLIZLLL >> 32) & (-1)));
            fArr[1] = Float.intBitsToFloat((int) (jLIZLLL & (-1)));
            fArr[2] = this.LJIIIIZZ;
        } else if (this.LJI != null) {
            C1312280kFm c1312280kFm = new C1312280kFm(z);
            C1312230kFh c1312230kFh = new C1312230kFh();
            EnumC1300260jwO enumC1300260jwOFromInt = EnumC1300260jwO.fromInt(i);
            EnumC1300260jwO enumC1300260jwOFromInt2 = EnumC1300260jwO.fromInt(i2);
            c1312230kFh.LIZ = f;
            c1312230kFh.LIZIZ = enumC1300260jwOFromInt;
            c1312230kFh.LIZJ = f2;
            c1312230kFh.LIZLLL = enumC1300260jwOFromInt2;
            float[] fArr2 = this.LJI.LIZ(c1312280kFm, c1312230kFh).LIZ;
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            return fArr;
        }
        return fArr;
    }
}
