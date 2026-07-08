package kotlin.jvm.internal;

import X.C09AY;
import X.C0EAX;
import X.C0EJ5;
import X.C360160EAc;
import X.C360210EAh;
import X.C361980EHc;
import X.C362060EHk;
import X.C375830EoP;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS30S1110000_5 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS30S1110000_5 awS30S1110000_5, Object obj) {
        ResourceItem resourceItem = new ResourceItem();
        resourceItem.setResourceId(awS30S1110000_5.s0);
        return C360210EAh.LIZ((C360210EAh) obj, null, null, null, new C375830EoP(resourceItem), new C375830EoP(C360160EAc.LIZ(((C0EAX) awS30S1110000_5.l1).T2().LJ.LIZ, false, false, awS30S1110000_5.z2, 3)), null, null, null, false, null, false, false, 0, false, 16359);
    }

    public static final Object invoke$1(AwS30S1110000_5 awS30S1110000_5, Object obj) {
        ResourceItem resourceItem = new ResourceItem();
        resourceItem.setResourceId(awS30S1110000_5.s0);
        return C360210EAh.LIZ((C360210EAh) obj, null, null, null, new C375830EoP(resourceItem), new C375830EoP(C360160EAc.LIZ(((C0EAX) awS30S1110000_5.l1).T2().LJ.LIZ, false, false, awS30S1110000_5.z2, 3)), null, null, null, false, null, false, false, 0, false, 16359);
    }

    public static final Object invoke$2(AwS30S1110000_5 awS30S1110000_5, Object obj) {
        return C0EJ5.LIZ((C0EJ5) obj, false, null, null, null, null, null, new C375830EoP(new C362060EHk(awS30S1110000_5.s0, (C361980EHc) awS30S1110000_5.l1, awS30S1110000_5.z2)), null, null, null, 15359);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S1110000_5(C0EAX c0eax, boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c0eax;
        this.z2 = z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S1110000_5(String str, C361980EHc c361980EHc, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c361980EHc;
        this.z2 = z;
    }
}
