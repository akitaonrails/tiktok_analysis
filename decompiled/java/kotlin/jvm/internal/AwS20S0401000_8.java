package kotlin.jvm.internal;

import X.C09AY;
import X.C574880Mgg;
import X.InterfaceC576180Mim;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import v7.o;

/* JADX INFO: loaded from: classes9.dex */
public class AwS20S0401000_8 extends C09AY implements Function0 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS20S0401000_8 r6) {
        /*
            java.lang.Object r1 = r6.l0
            X.0Mgg r1 = (X.C574880Mgg) r1
            r3 = 0
            r1.LIZIZ = r3
            float r0 = r1.LJII()
            r1.LJIIJ = r0
            java.lang.Object r0 = r6.l0
            X.0Mgg r0 = (X.C574880Mgg) r0
            X.0Dkm r0 = r0.LJIIIZ
            r0.LIZ()
            java.lang.Object r0 = r6.l1
            com.ss.android.vesdk.runtime.VEEditorResManager r0 = (com.ss.android.vesdk.runtime.VEEditorResManager) r0
            java.lang.String[] r1 = r0.mReverseVideoPath
            r5 = 1
            if (r1 == 0) goto L36
            java.lang.Object r4 = r6.l0
            X.0Mgg r4 = (X.C574880Mgg) r4
            int r0 = r1.length
            if (r0 == 0) goto L7b
            int r0 = r1.length
            if (r0 != r5) goto L7b
            X.0Dkm r0 = r4.LJIIIZ
            X.0EYJ r2 = r0.LIZLLL()
            r1 = r1[r3]
            float r0 = r4.LJIIJ
            r2.LJJIIZ(r0, r1)
        L36:
            java.lang.Object r0 = r6.l1
            com.ss.android.vesdk.runtime.VEEditorResManager r0 = (com.ss.android.vesdk.runtime.VEEditorResManager) r0
            java.lang.String[] r2 = r0.mReverseAudioPaths
            if (r2 == 0) goto L53
            java.lang.Object r1 = r6.l0
            X.0Mgg r1 = (X.C574880Mgg) r1
            int r0 = r2.length
            if (r0 == 0) goto L7b
            int r0 = r2.length
            if (r0 != r5) goto L7b
            X.0Dkm r0 = r1.LJIIIZ
            X.0EYJ r1 = r0.LIZLLL()
            r0 = r2[r3]
            r1.LJJJIL(r0)
        L53:
            java.lang.Object r0 = r6.l0
            X.0Mgg r0 = (X.C574880Mgg) r0
            X.0Dkm r0 = r0.LJIIIZ
            r0.LIZIZ()
            java.lang.Object r1 = r6.l2
            com.bytedance.ies.nle.editor_jni.NLEEditor r1 = (com.bytedance.ies.nle.editor_jni.NLEEditor) r1
            if (r1 == 0) goto L6b
            java.lang.Object r0 = r6.l0
            X.0Mgg r0 = (X.C574880Mgg) r0
            X.0EPp r0 = r0.LJIIJJI
            r1.addConsumer(r0)
        L6b:
            int r0 = r6.i4
            if (r0 != 0) goto L70
            r3 = 1
        L70:
            java.lang.Object r1 = r6.l3
            v7.o r1 = (v7.o) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.LJ(r0)
        L7b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS20S0401000_8.invoke$0(kotlin.jvm.internal.AwS20S0401000_8):java.lang.Object");
    }

    public static final Object invoke$1(AwS20S0401000_8 awS20S0401000_8) {
        ((InterfaceC576180Mim) awS20S0401000_8.l0).LIZJ((Field) awS20S0401000_8.l1, (String[]) ((Object[]) awS20S0401000_8.l2), awS20S0401000_8.i4, (Annotation) awS20S0401000_8.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS20S0401000_8 awS20S0401000_8) {
        ((InterfaceC576180Mim) awS20S0401000_8.l0).LIZLLL((Field) awS20S0401000_8.l1, (List) awS20S0401000_8.l2, awS20S0401000_8.i4, (Annotation) awS20S0401000_8.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS20S0401000_8(C574880Mgg c574880Mgg, C574880Mgg c574880Mgg2, VEEditorResManager vEEditorResManager, NLEEditor nLEEditor, int i, o<Boolean> oVar) {
        super(0);
        this.$t = oVar;
        this.l0 = c574880Mgg;
        this.l1 = c574880Mgg2;
        this.l2 = vEEditorResManager;
        this.i4 = nLEEditor;
        this.l3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS20S0401000_8(InterfaceC576180Mim interfaceC576180Mim, InterfaceC576180Mim<R> interfaceC576180Mim2, Field field, List<?> list, int i, R r) {
        super(0);
        this.$t = r;
        this.l0 = interfaceC576180Mim;
        this.l1 = interfaceC576180Mim2;
        this.l2 = field;
        this.i4 = list;
        this.l3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS20S0401000_8(InterfaceC576180Mim interfaceC576180Mim, InterfaceC576180Mim<R> interfaceC576180Mim2, Field field, Object[] objArr, int i, R r) {
        super(0);
        this.$t = r;
        this.l0 = interfaceC576180Mim;
        this.l1 = interfaceC576180Mim2;
        this.l2 = field;
        this.i4 = objArr;
        this.l3 = i;
    }
}
