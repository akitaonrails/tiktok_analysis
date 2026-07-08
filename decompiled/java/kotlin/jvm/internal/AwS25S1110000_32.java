package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.ViewTreeObserverOnScrollChangedListenerC21156017qg;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS25S1110000_32 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS25S1110000_32 awS25S1110000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewAttachedToWindow[");
        sbLIZ.append(((ViewTreeObserverOnScrollChangedListenerC21156017qg) awS25S1110000_32.l1).LLJIJIL);
        sbLIZ.append("]: (anchorTag: ");
        sbLIZ.append(awS25S1110000_32.s0);
        sbLIZ.append("), (hasAnchorTagChanged: ");
        sbLIZ.append(awS25S1110000_32.z2);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS25S1110000_32 awS25S1110000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewDetachedFromWindow[");
        sbLIZ.append(((ViewTreeObserverOnScrollChangedListenerC21156017qg) awS25S1110000_32.l1).LLJIJIL);
        sbLIZ.append("]: (anchorTag: ");
        sbLIZ.append(awS25S1110000_32.s0);
        sbLIZ.append("), (isInitAnchorTag: ");
        sbLIZ.append(awS25S1110000_32.z2);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S1110000_32(ViewTreeObserverOnScrollChangedListenerC21156017qg viewTreeObserverOnScrollChangedListenerC21156017qg, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = viewTreeObserverOnScrollChangedListenerC21156017qg;
        this.s0 = str;
        this.z2 = z;
    }
}
