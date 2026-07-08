package kotlin.jvm.internal;

import X.C09AY;
import X.C0FDW;
import X.C1954807lC;
import X.C361520EFi;
import X.C361620EFs;
import X.C375830EoP;
import X.C377280Eqk;
import X.C377400Eqw;
import X.C382590EzJ;
import X.C382650EzP;
import X.C387180FGa;
import X.C387490FHf;
import X.EnumC1641420soe;
import X.EnumC361610EFr;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS113S0101000_5 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS113S0101000_5 r4, java.lang.Object r5) {
        /*
            com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent r5 = (com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent) r5
            if (r5 == 0) goto L5d
            X.0F7x r3 = r5.richTextData
            java.util.List<java.lang.Float> r1 = r5.canvasColor
            r0 = 0
            java.util.List r0 = X.C0F9I.LIZ(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r2 = 4
            if (r0 != 0) goto L62
            java.util.List<java.lang.Float> r0 = r5.canvasColor
            int r0 = r0.size()
            if (r0 != r2) goto L60
            java.util.List<java.lang.Float> r0 = r5.canvasColor
            r2 = 3
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L60
        L2f:
            int r0 = r4.i1
            r5.updateColor(r2, r0)
            java.lang.Object r2 = r4.l0
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r2 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r2
            r1 = 0
            java.lang.String r0 = "text_sticker_data"
            java.lang.String r1 = X.C351220Dpo.LJLJL(r2, r0, r1)
            if (r1 == 0) goto L56
            int r0 = r1.length()
            if (r0 == 0) goto L56
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = X.C363430EMr.LIZIZ(r1)
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel r1 = r0.getTextStyle()
            if (r1 == 0) goto L56
            int r0 = r4.i1
            X.C385050F7v.LJJIIJ(r1, r5, r0)
        L56:
            java.lang.String r0 = r3.toLabelStr()
            r5.setRichText(r0)
        L5d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L60:
            r2 = 2
            goto L2f
        L62:
            java.util.List<java.lang.Float> r0 = r3.outlineColor
            if (r0 != 0) goto L2f
            java.util.List<java.lang.Float> r0 = r3.shadowColor
            if (r0 == 0) goto L6c
            r2 = 5
            goto L2f
        L6c:
            r2 = 1
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS113S0101000_5.invoke$0(kotlin.jvm.internal.AwS113S0101000_5, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS113S0101000_5 awS113S0101000_5, Object obj) {
        return C387490FHf.LIZ((C387490FHf) obj, null, null, null, Integer.valueOf(awS113S0101000_5.i1), (C387180FGa) awS113S0101000_5.l0, false, false, null, null, new C375830EoP(0), null, 0, 3559);
    }

    public static final Object invoke$2(AwS113S0101000_5 awS113S0101000_5, Object obj) {
        return C382650EzP.LIZ(((C382590EzJ) awS113S0101000_5.l0).T2(), awS113S0101000_5.i1, null, null, null, null, false, false, false, false, 1022);
    }

    public static final Object invoke$3(AwS113S0101000_5 awS113S0101000_5, Object obj) {
        C361520EFi c361520EFi = (C361520EFi) obj;
        int i = C361620EFs.LIZ[((EnumC361610EFr) awS113S0101000_5.l0).ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C361520EFi.LIZ(c361520EFi, 0, awS113S0101000_5.i1, null, null, 27);
            }
            throw new C1954807lC();
        }
        return C361520EFi.LIZ(c361520EFi, awS113S0101000_5.i1, 0, null, null, 29);
    }

    public static final Object invoke$4(AwS113S0101000_5 awS113S0101000_5, Object obj) {
        ((C0FDW) awS113S0101000_5.l0).R5(awS113S0101000_5.i1, EnumC1641420soe.DOWNLOADING, ((Number) obj).intValue());
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS113S0101000_5 awS113S0101000_5, Object obj) {
        C377400Eqw c377400EqwT2 = ((C377280Eqk) awS113S0101000_5.l0).T2();
        return new C377400Eqw(c377400EqwT2.LIZ, awS113S0101000_5.i1, c377400EqwT2.LIZJ, c377400EqwT2.LIZLLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0101000_5(int i, EnumC361610EFr enumC361610EFr, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = enumC361610EFr;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0101000_5(int i, C387180FGa c387180FGa, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c387180FGa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0101000_5(int i, NLETrackSlot nLETrackSlot, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = nLETrackSlot;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0101000_5(C377280Eqk c377280Eqk, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c377280Eqk;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0101000_5(C382590EzJ c382590EzJ, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c382590EzJ;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0101000_5(C0FDW c0fdw, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c0fdw;
        this.i1 = i;
    }
}
