package kotlin.jvm.internal;

import X.C09AY;
import X.C0MVV;
import X.C11KT;
import X.C19EG;
import X.C20656615sK;
import X.C259800zU;
import X.C540290LGx;
import X.InterfaceC2329309At;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class AwS91S0500000_8 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS91S0500000_8 awS91S0500000_8, Object obj, Object obj2) {
        ((Function0) awS91S0500000_8.l0).invoke();
        C540290LGx c540290LGx = C540290LGx.LIZ;
        C19EG c19eg = (C19EG) awS91S0500000_8.l1;
        AwS252S0300000_8 awS252S0300000_8 = new AwS252S0300000_8((Function0) awS91S0500000_8.l2, (Function0<Unit>) c19eg, (C19EG) awS91S0500000_8.l3, (C20656615sK) 18);
        AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8((C20656615sK) awS91S0500000_8.l3, (Function0) awS91S0500000_8.l4, 58);
        AwS409S0200000_8 awS409S0200000_82 = new AwS409S0200000_8((C19EG) awS91S0500000_8.l1, (C20656615sK) awS91S0500000_8.l3, 59);
        c540290LGx.getClass();
        C540290LGx.LJIIIIZZ(c19eg, awS252S0300000_8, awS409S0200000_8, awS409S0200000_82);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS91S0500000_8 awS91S0500000_8, Object obj, Object obj2) throws Throwable {
        ((Number) obj).intValue();
        C0MVV.LIZJ((VideoPublishEditModel) awS91S0500000_8.l0, (InterfaceC2329309At) awS91S0500000_8.l1, (C259800zU) awS91S0500000_8.l2, (WeakReference) awS91S0500000_8.l3, (AwemeDraft) awS91S0500000_8.l4);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S0500000_8(VideoPublishEditModel videoPublishEditModel, C11KT c11kt, C259800zU c259800zU, WeakReference weakReference, AwemeDraft awemeDraft, int i) {
        super(2);
        this.$t = i;
        this.l0 = videoPublishEditModel;
        this.l1 = c11kt;
        this.l2 = c259800zU;
        this.l3 = weakReference;
        this.l4 = awemeDraft;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS91S0500000_8(Function0 function0, Function0<Unit> function02, C19EG c19eg, Function0<Unit> function03, C20656615sK c20656615sK, Function0<Unit> function04) {
        super(2);
        this.$t = function04;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = c19eg;
        this.l3 = function03;
        this.l4 = c20656615sK;
    }
}
