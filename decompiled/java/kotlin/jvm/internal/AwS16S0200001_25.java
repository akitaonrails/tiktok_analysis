package kotlin.jvm.internal;

import X.AbstractC1690640u62;
import X.C09AY;
import X.C1675630thp;
import X.C1690830u6L;
import X.EnumC1671200tag;
import X.EnumC1684030tvN;
import X.InterfaceC1631620sYq;
import X.InterfaceC1690500u5o;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes26.dex */
public class AwS16S0200001_25 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S0200001_25(InterfaceC1690500u5o interfaceC1690500u5o, Bitmap bitmap, float f, int i) {
        super(3);
        this.$t = i;
        this.l0 = interfaceC1690500u5o;
        this.l1 = bitmap;
        this.f2 = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS16S0200001_25 r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS16S0200001_25.invoke$0(kotlin.jvm.internal.AwS16S0200001_25, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS16S0200001_25 awS16S0200001_25, Object obj, Object obj2, Object obj3) {
        float fLIZ;
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        float fFloatValue3 = ((Number) obj3).floatValue();
        AbstractC1690640u62 abstractC1690640u62 = (AbstractC1690640u62) awS16S0200001_25.l0;
        EnumC1671200tag enumC1671200tag = (EnumC1671200tag) awS16S0200001_25.l1;
        float f = awS16S0200001_25.f2;
        boolean zLIZIZ = C1690830u6L.LIZIZ(abstractC1690640u62, fFloatValue);
        if (abstractC1690640u62.LJIIL().getOrientation() != EnumC1684030tvN.Vertical && enumC1671200tag != EnumC1671200tag.Ltr) {
            zLIZIZ = !zLIZIZ;
        }
        int iLJFF = abstractC1690640u62.LJIIL().LJFF();
        if (iLJFF == 0) {
            fLIZ = 0.0f;
        } else {
            fLIZ = C1690830u6L.LIZ(abstractC1690640u62) / iLJFF;
        }
        float f2 = fLIZ - ((int) fLIZ);
        int iLIZ = C1675630thp.LIZ(fFloatValue, abstractC1690640u62.LJIILLIIL);
        if (iLIZ == 0) {
            fFloatValue2 = Math.abs(f2) > f ? fFloatValue3 : fFloatValue3;
        } else if (iLIZ != 1) {
            if (iLIZ != 2) {
                fFloatValue2 = 0.0f;
            }
        }
        return Float.valueOf(fFloatValue2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S0200001_25(AbstractC1690640u62 abstractC1690640u62, EnumC1671200tag enumC1671200tag, float f, int i) {
        super(3);
        this.$t = i;
        this.l0 = abstractC1690640u62;
        this.l1 = enumC1671200tag;
        this.f2 = f;
    }
}
