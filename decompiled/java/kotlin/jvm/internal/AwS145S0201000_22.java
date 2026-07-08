package kotlin.jvm.internal;

import X.C09AY;
import X.C0MJ9;
import X.C113G;
import X.C1415610mwR;
import X.C1417330mzD;
import X.C1426590nE9;
import X.C1426770nER;
import X.C1426800nEU;
import X.C1446760nkg;
import X.C1454020nwO;
import X.InterfaceC1441090nbX;
import X.InterfaceC1631620sYq;
import X.RunnableC1432010nMt;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import v7.o;

/* JADX INFO: loaded from: classes23.dex */
public class AwS145S0201000_22 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS145S0201000_22 awS145S0201000_22) {
        NLEEditor nLEEditorR5;
        NLEModel nLEModelLIZ = ((C1454020nwO) awS145S0201000_22.l0).x5().LIZ();
        if (nLEModelLIZ != null && (nLEEditorR5 = ((C1454020nwO) awS145S0201000_22.l0).R5()) != null) {
            nLEEditorR5.setModel(nLEModelLIZ);
        }
        C1446760nkg.LIZ.getClass();
        if (C1446760nkg.LIZJ()) {
            ((C1454020nwO) awS145S0201000_22.l0).u6((SingleImageData) awS145S0201000_22.l1, awS145S0201000_22.i2);
        } else {
            ((C1454020nwO) awS145S0201000_22.l0).n5().r40(awS145S0201000_22.i2, (SingleImageData) awS145S0201000_22.l1);
            InterfaceC1441090nbX interfaceC1441090nbXC5 = ((C1454020nwO) awS145S0201000_22.l0).C5();
            if (interfaceC1441090nbXC5 != null) {
                interfaceC1441090nbXC5.nT(awS145S0201000_22.i2, ((SingleImageData) awS145S0201000_22.l1).getSrcImageInfo().getPath());
            }
            ((C1454020nwO) awS145S0201000_22.l0).n5().K92(true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS145S0201000_22 awS145S0201000_22) {
        C1417330mzD.Rg((C1417330mzD) awS145S0201000_22.l0, awS145S0201000_22.i2, (C0MJ9) awS145S0201000_22.l1, null, Float.valueOf(1.0f), null);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS145S0201000_22 awS145S0201000_22) {
        C1417330mzD.Rg((C1417330mzD) awS145S0201000_22.l0, awS145S0201000_22.i2, (C0MJ9) awS145S0201000_22.l1, null, Float.valueOf(1.0f), null);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS145S0201000_22 awS145S0201000_22) {
        C1417330mzD.Rg((C1417330mzD) awS145S0201000_22.l0, awS145S0201000_22.i2, (C0MJ9) awS145S0201000_22.l1, Float.valueOf(1.0f), null, null);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS145S0201000_22 awS145S0201000_22) {
        C1417330mzD.Rg((C1417330mzD) awS145S0201000_22.l0, awS145S0201000_22.i2, (C0MJ9) awS145S0201000_22.l1, Float.valueOf(1.0f), null, null);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS145S0201000_22 awS145S0201000_22) {
        InterfaceC1631620sYq<Integer, Exception, String, Unit> interfaceC1631620sYq = ((RunnableC1432010nMt) awS145S0201000_22.l0).LLIZ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(Integer.valueOf(awS145S0201000_22.i2), null, "Synthesis Image Error");
        }
        o oVar = (o) awS145S0201000_22.l1;
        Unit unit = Unit.LIZ;
        oVar.LJ(unit);
        return unit;
    }

    public static final Object invoke$6(AwS145S0201000_22 awS145S0201000_22) {
        InterfaceC1631620sYq<Integer, Exception, String, Unit> interfaceC1631620sYq = ((RunnableC1432010nMt) awS145S0201000_22.l0).LLIZ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(Integer.valueOf(awS145S0201000_22.i2), null, "Synthesis Image Error");
        }
        o oVar = (o) awS145S0201000_22.l1;
        Unit unit = Unit.LIZ;
        oVar.LJ(unit);
        return unit;
    }

    public static final Object invoke$7(AwS145S0201000_22 awS145S0201000_22) {
        String str;
        C113G c113g = (C113G) awS145S0201000_22.l0;
        if (c113g != null && c113g.LJJIIZI) {
            str = "editor_pro_panel";
        } else {
            str = "edit_page_panel";
        }
        C1426590nE9 c1426590nE9 = new C1426590nE9(str, 5);
        int iLIZ = (int) (C1415610mwR.LIZ() * 0.75f);
        int i = awS145S0201000_22.i2;
        C113G c113g2 = (C113G) awS145S0201000_22.l0;
        if (c113g2 == null) {
            c113g2 = new C113G(null, false, false, false, 0.0f, false, false, null, false, false, false, false, 0, false, false, false, false, false, null, false, false, 0, false, null, -1, 511);
        }
        return new C1426770nER(c1426590nE9, false, iLIZ, i, c113g2, ((C1426800nEU) awS145S0201000_22.l1).LLJILLL, null, UUID.randomUUID().toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0201000_22(C1417330mzD c1417330mzD, int i, C0MJ9 c0mj9, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1417330mzD;
        this.i2 = i;
        this.l1 = c0mj9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS145S0201000_22(RunnableC1432010nMt runnableC1432010nMt, RunnableC1432010nMt runnableC1432010nMt2, int i, o<Unit> oVar) {
        super(0);
        this.$t = oVar;
        this.l0 = runnableC1432010nMt;
        this.i2 = runnableC1432010nMt2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0201000_22(C1454020nwO c1454020nwO, SingleImageData singleImageData, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1454020nwO;
        this.l1 = singleImageData;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0201000_22(C113G c113g, int i, C1426800nEU c1426800nEU, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c113g;
        this.i2 = i;
        this.l1 = c1426800nEU;
    }
}
