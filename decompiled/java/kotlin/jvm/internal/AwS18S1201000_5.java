package kotlin.jvm.internal;

import X.C09AY;
import X.C0F1E;
import X.C259800zU;
import X.C348100Dkm;
import X.C377730ErT;
import X.C381030Ewn;
import X.C382830Ezh;
import X.C382840Ezi;
import X.C382850Ezj;
import X.C382890Ezn;
import X.EnumC378720Et4;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS18S1201000_5 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS18S1201000_5 awS18S1201000_5, Object obj) {
        C382840Ezi c382840Ezi = (C382840Ezi) obj;
        Integer numValueOf = Integer.valueOf(awS18S1201000_5.i3);
        String str = awS18S1201000_5.s0;
        if (str == null) {
            str = ((C382850Ezj) awS18S1201000_5.l1).T2().LJJI;
        }
        C382840Ezi c382840EziLIZ = C382840Ezi.LIZ(c382840Ezi, null, false, null, null, null, numValueOf, null, null, false, null, null, null, 0, false, false, false, false, false, null, null, null, str, null, 50331615);
        int i = C381030Ewn.LIZ[((EnumC378720Et4) awS18S1201000_5.l2).ordinal()];
        if (i != 1) {
            if (i == 2) {
                String str2 = awS18S1201000_5.s0;
                if (str2 == null) {
                    str2 = ((C382850Ezj) awS18S1201000_5.l1).T2().LJ;
                }
                return C382840Ezi.LIZ(c382840EziLIZ, null, false, null, null, str2, null, null, null, false, null, null, null, 0, false, false, false, false, false, null, null, null, null, null, 67108847);
            }
            return c382840EziLIZ;
        }
        String str3 = awS18S1201000_5.s0;
        if (str3 == null) {
            str3 = ((C382850Ezj) awS18S1201000_5.l1).T2().LIZLLL;
        }
        return C382840Ezi.LIZ(c382840EziLIZ, null, false, null, str3, null, null, null, null, false, null, null, null, 0, false, false, false, false, false, null, null, null, null, null, 67108855);
    }

    public static final Object invoke$1(AwS18S1201000_5 awS18S1201000_5, Object obj) {
        return C382890Ezn.LIZ((C382890Ezn) obj, false, null, (C0F1E) awS18S1201000_5.l2, false, awS18S1201000_5.i3, awS18S1201000_5.s0, ((C382830Ezh) awS18S1201000_5.l1).T2().LJI + 1, false, 0L, null, 0, null, false, false, false, 32651);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS18S1201000_5 r5, java.lang.Object r6) {
        /*
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            java.lang.Object r0 = r5.l1
            X.0ErT r0 = (X.C377730ErT) r0
            java.lang.Object r0 = r0.T2()
            X.0Erd r0 = (X.C377830Erd) r0
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel r0 = r0.LJFF
            r4 = 0
            if (r0 == 0) goto L72
            java.lang.String r3 = r0.epAIGCAsyncTaskId
            if (r3 == 0) goto L72
            java.lang.Object r0 = r5.l1
            X.0ErT r0 = (X.C377730ErT) r0
            com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel r0 = r0.LLJLIL
            if (r0 == 0) goto L6b
            X.1DDq r0 = r0.LLILZIL
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r0.getValue()
            X.0Eqj r0 = (X.C377270Eqj) r0
            if (r0 == 0) goto L6b
            java.util.List<X.0Equ> r0 = r0.LIZIZ
            if (r0 == 0) goto L6b
            java.util.Iterator r2 = r0.iterator()
        L34:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0Equ r0 = (X.C377380Equ) r0
            java.lang.String r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L34
        L49:
            X.0Equ r1 = (X.C377380Equ) r1
            if (r1 == 0) goto L6b
            int r0 = r1.LJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L53:
            int r0 = r0.intValue()
            if (r0 > 0) goto L72
            java.lang.Object r0 = r5.l1
            X.0ErT r0 = (X.C377730ErT) r0
            X.0ErL r0 = r0.C5()
            if (r0 == 0) goto L66
            r0.KJ0()
        L66:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L69:
            r1 = r4
            goto L49
        L6b:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L53
        L72:
            java.lang.Object r2 = r5.l1
            X.0ErT r2 = (X.C377730ErT) r2
            r1 = 1
            r0 = 0
            r2.J8(r1, r0)
            java.lang.Object r1 = r5.l1
            X.0ErT r1 = (X.C377730ErT) r1
            kotlin.jvm.internal.AwS26S1201000_5 r0 = new kotlin.jvm.internal.AwS26S1201000_5
            java.lang.String r2 = r5.s0
            java.lang.Object r3 = r5.l2
            X.00zU r3 = (X.C259800zU) r3
            int r4 = r5.i3
            r5 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            r1.r8(r0)
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS18S1201000_5.invoke$2(kotlin.jvm.internal.AwS18S1201000_5, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS18S1201000_5 awS18S1201000_5, Object obj) {
        C348100Dkm c348100Dkm = (C348100Dkm) obj;
        String str = awS18S1201000_5.s0;
        if (str != null && Intrinsics.LJFF(str, ((EffectPointModel) ListProtector.get((ArrayList) awS18S1201000_5.l1, awS18S1201000_5.i3)).getUuid())) {
            c348100Dkm.LIZLLL().LJJJJJ(new String[]{awS18S1201000_5.s0});
            ListProtector.remove((ArrayList) awS18S1201000_5.l1, awS18S1201000_5.i3);
            ((AtomicBoolean) awS18S1201000_5.l2).set(true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S1201000_5(int i, String str, C382850Ezj c382850Ezj, EnumC378720Et4 enumC378720Et4, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.s0 = str;
        this.l1 = c382850Ezj;
        this.l2 = enumC378720Et4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S1201000_5(C377730ErT c377730ErT, C377730ErT c377730ErT2, String str, C259800zU<AIGCGenerationParam> c259800zU, int i) {
        super(1);
        this.$t = i;
        this.l1 = c377730ErT;
        this.s0 = c377730ErT2;
        this.l2 = str;
        this.i3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S1201000_5(C382830Ezh c382830Ezh, C0F1E c0f1e, int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c382830Ezh;
        this.l2 = c0f1e;
        this.i3 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S1201000_5(String str, String str2, ArrayList<EffectPointModel> arrayList, int i, AtomicBoolean atomicBoolean) {
        super(1);
        this.$t = atomicBoolean;
        this.s0 = str;
        this.l1 = str2;
        this.i3 = arrayList;
        this.l2 = i;
    }
}
