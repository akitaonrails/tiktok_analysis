package kotlin.jvm.internal;

import X.AnonymousClass1262;
import X.C09AY;
import X.C0P0T;
import X.C1749140vcO;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.ss.android.ugc.tiktok.tools.performance.util.NLEEditorExtensionKt$addSafeConsumer$$inlined$doOnDestroy$1$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public class AwS20S2300000_29 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS20S2300000_29 awS20S2300000_29) {
        ((LifecycleOwner) awS20S2300000_29.l2).getLifecycle().addObserver(new NLEEditorExtensionKt$addSafeConsumer$$inlined$doOnDestroy$1$1(awS20S2300000_29.s0, awS20S2300000_29.s1, (NLEEditor) awS20S2300000_29.l3, (NLEEditorListener) awS20S2300000_29.l4));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS20S2300000_29 awS20S2300000_29) {
        ((C1749140vcO) awS20S2300000_29.l2).setText(awS20S2300000_29.s0);
        String str = awS20S2300000_29.s1;
        if (str != null) {
            AnonymousClass1262 anonymousClass1262 = (AnonymousClass1262) awS20S2300000_29.l4;
            anonymousClass1262.LJ.invoke(str, awS20S2300000_29.s0);
        }
        C0P0T c0p0t = (C0P0T) ((Function0) awS20S2300000_29.l3).invoke();
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS20S2300000_29(C1749140vcO c1749140vcO, C1749140vcO c1749140vcO2, String str, String str2, Function0<? extends C0P0T> function0, AnonymousClass1262 anonymousClass1262) {
        super(0);
        this.$t = anonymousClass1262;
        this.l2 = c1749140vcO;
        this.s0 = c1749140vcO2;
        this.s1 = str;
        this.l3 = str2;
        this.l4 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S2300000_29(LifecycleOwner lifecycleOwner, String str, String str2, NLEEditor nLEEditor, NLEEditorListener nLEEditorListener, int i) {
        super(0);
        this.$t = i;
        this.l2 = lifecycleOwner;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = nLEEditor;
        this.l4 = nLEEditorListener;
    }
}
