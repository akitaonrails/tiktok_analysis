package kotlin.jvm.internal;

import X.AbstractC1683310tuD;
import X.AbstractC1686530tzP;
import X.AbstractC1688180u24;
import X.C05P1;
import X.C05ZJ;
import X.C09AY;
import X.C0MAE;
import X.C118300cf;
import X.C13LZ;
import X.C1628680sU6;
import X.C1669580tY4;
import X.C1688050u1r;
import X.C1688130u1z;
import X.C1696890uG7;
import X.C1696970uGF;
import X.C19719212De;
import X.EnumC1671200tag;
import X.InterfaceC1675750ti1;
import X.InterfaceC1689940u4u;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS17S0401000_25 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS17S0401000_25 awS17S0401000_25, Object obj) {
        C1628680sU6.H2((C1628680sU6) awS17S0401000_25.l0, (NavigationScene) awS17S0401000_25.l1, awS17S0401000_25.i4, (Function0) awS17S0401000_25.l2, (Function0) awS17S0401000_25.l3, null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS17S0401000_25 awS17S0401000_25, Object obj) {
        float fLIZLLL;
        float f;
        long jLongValue = ((Number) obj).longValue();
        int i = awS17S0401000_25.i4;
        if (i <= 1 || ((C118300cf) awS17S0401000_25.l0).element % i == 0) {
            float fLIZLLL2 = C13LZ.LIZLLL(((Number) ((C05P1) awS17S0401000_25.l1).getValue()).floatValue(), 0.0f, 1.0f);
            if (fLIZLLL2 <= 0.0315f) {
                fLIZLLL = 0.0f;
            } else {
                fLIZLLL = C13LZ.LIZLLL(((fLIZLLL2 - 0.0315f) / 0.9685f) * 4.0f, 0.0f, 1.0f);
            }
            C1696970uGF c1696970uGF = (C1696970uGF) awS17S0401000_25.l2;
            float f2 = c1696970uGF.LIZ;
            if (fLIZLLL > f2) {
                f = 0.45f;
            } else {
                f = 0.16f;
            }
            float f3 = f2 + ((fLIZLLL - f2) * f);
            c1696970uGF.LIZ = f3;
            int[] iArr = C1696890uG7.LIZ;
            float fLIZLLL3 = (C13LZ.LIZLLL(f3, 0.0f, 1.0f) * 1.0f) + 1.0f;
            ((C1696970uGF) awS17S0401000_25.l2).LIZIZ += fLIZLLL3 * 0.015f * awS17S0401000_25.i4;
            ((InterfaceC1675750ti1) awS17S0401000_25.l3).LJIIIIZZ(jLongValue);
        }
        C118300cf c118300cf = (C118300cf) awS17S0401000_25.l0;
        int i2 = c118300cf.element;
        c118300cf.element = i2 + 1;
        return Integer.valueOf(i2);
    }

    public static final Object invoke$2(AwS17S0401000_25 awS17S0401000_25, Object obj) {
        float fLIZLLL;
        float f;
        long jLongValue = ((Number) obj).longValue();
        if (((C118300cf) awS17S0401000_25.l0).element == 0) {
            float fLIZLLL2 = C13LZ.LIZLLL(((Number) ((C05P1) awS17S0401000_25.l1).getValue()).floatValue(), 0.0f, 1.0f);
            if (fLIZLLL2 <= 0.01f) {
                fLIZLLL = 0.0f;
            } else {
                fLIZLLL = C13LZ.LIZLLL(((fLIZLLL2 - 0.01f) / 0.99f) * 4.0f, 0.0f, 1.0f);
            }
            C1696970uGF c1696970uGF = (C1696970uGF) awS17S0401000_25.l2;
            float f2 = c1696970uGF.LIZ;
            if (fLIZLLL > f2) {
                f = 0.45f;
            } else {
                f = 0.16f;
            }
            float f3 = f2 + ((fLIZLLL - f2) * f);
            c1696970uGF.LIZ = f3;
            int[] iArr = C1696890uG7.LIZ;
            float fLIZLLL3 = (C13LZ.LIZLLL(f3, 0.0f, 1.0f) * 1.0f) + 1.0f;
            ((C1696970uGF) awS17S0401000_25.l2).LIZIZ += fLIZLLL3 * 0.015f * awS17S0401000_25.i4;
            ((InterfaceC1675750ti1) awS17S0401000_25.l3).LJIIIIZZ(jLongValue);
        }
        C118300cf c118300cf = (C118300cf) awS17S0401000_25.l0;
        c118300cf.element = (c118300cf.element + 1) % awS17S0401000_25.i4;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS17S0401000_25 awS17S0401000_25, Object obj) {
        int size = ((SocialMediaPickerViewModel) awS17S0401000_25.l0).xQ2().LIZ.size();
        AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2((SocialMediaPickerViewModel) awS17S0401000_25.l0, 503);
        C05ZJ c05zj = (C05ZJ) awS17S0401000_25.l1;
        ((C0MAE) obj).LIZJ(size, awS581S0100000_2, AFwS240S0000000_9.get$arr$(907), new C19719212De(313691419, new C1669580tY4(awS17S0401000_25.i4, (SocialMediaPickerViewModel) awS17S0401000_25.l0, c05zj, (Function1) awS17S0401000_25.l2, (Function1) awS17S0401000_25.l3), true));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS17S0401000_25 awS17S0401000_25, Object obj) {
        C1688050u1r c1688050u1r;
        int iLIZ;
        AbstractC1688180u24 abstractC1688180u24;
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        AbstractC1686530tzP[] abstractC1686530tzPArr = (AbstractC1686530tzP[]) awS17S0401000_25.l0;
        C1688130u1z c1688130u1z = (C1688130u1z) awS17S0401000_25.l1;
        int i = awS17S0401000_25.i4;
        InterfaceC1689940u4u interfaceC1689940u4u = (InterfaceC1689940u4u) awS17S0401000_25.l2;
        int[] iArr = (int[]) awS17S0401000_25.l3;
        int length = abstractC1686530tzPArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            AbstractC1686530tzP abstractC1686530tzP = abstractC1686530tzPArr[i2];
            int i4 = i3 + 1;
            Object objLJJJ = abstractC1686530tzP.LJJJ();
            if (objLJJJ instanceof C1688050u1r) {
                c1688050u1r = (C1688050u1r) objLJJJ;
            } else {
                c1688050u1r = null;
            }
            EnumC1671200tag layoutDirection = interfaceC1689940u4u.getLayoutDirection();
            c1688130u1z.getClass();
            if (c1688050u1r != null && (abstractC1688180u24 = c1688050u1r.LIZJ) != null) {
                iLIZ = abstractC1688180u24.LIZ(i - abstractC1686530tzP.LL, layoutDirection);
            } else {
                iLIZ = c1688130u1z.LIZIZ.LIZ(0, i - abstractC1686530tzP.LL, layoutDirection);
            }
            abstractC1683310tuD.LIZLLL(abstractC1686530tzP, iLIZ, iArr[i3], 0.0f);
            i2++;
            i3 = i4;
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS17S0401000_25(int r3, X.InterfaceC1675750ti1 r4, X.C05P1 r5, X.C1696970uGF r6, X.C118300cf r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            int r8 = 1 - r8
            if (r8 == 0) goto L16
            r1 = r2
            r1.l0 = r7
            r1.l1 = r5
            r1.l2 = r6
            r1.i4 = r3
            r1.l3 = r4
            r0 = 1
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.i4 = r3
            r1.l0 = r7
            r1.l1 = r5
            r1.l2 = r6
            r1.l3 = r4
            r0 = 1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS17S0401000_25.<init>(int, X.0ti1, X.05P1, X.0uGF, X.00cf, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0401000_25(int i, SocialMediaPickerViewModel socialMediaPickerViewModel, C05ZJ c05zj, Function1 function1, Function1 function12, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = socialMediaPickerViewModel;
        this.l1 = c05zj;
        this.i4 = i;
        this.l2 = function1;
        this.l3 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS17S0401000_25(C1628680sU6 c1628680sU6, C1628680sU6 c1628680sU62, NavigationScene navigationScene, int i, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l0 = c1628680sU6;
        this.l1 = c1628680sU62;
        this.i4 = navigationScene;
        this.l2 = i;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0401000_25(AbstractC1686530tzP[] abstractC1686530tzPArr, C1688130u1z c1688130u1z, int i, InterfaceC1689940u4u interfaceC1689940u4u, int[] iArr, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = abstractC1686530tzPArr;
        this.l1 = c1688130u1z;
        this.i4 = i;
        this.l2 = interfaceC1689940u4u;
        this.l3 = iArr;
    }
}
