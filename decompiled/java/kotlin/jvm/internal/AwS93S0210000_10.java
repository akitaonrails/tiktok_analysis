package kotlin.jvm.internal;

import X.C09AY;
import X.C118300cf;
import X.C13LE;
import X.C20600815jK;
import X.C2188811AlT;
import X.C677830QiL;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.ui.SearchHorizontalListAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AwS93S0210000_10 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
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

    public static final Object invoke$0(AwS93S0210000_10 awS93S0210000_10) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = ((SearchHorizontalListAssem) awS93S0210000_10.l0).LLJLILLLLZIIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            state.LJIILL((List) awS93S0210000_10.l1, null);
        }
        if (awS93S0210000_10.z2 && (viewOnAttachStateChangeListenerC20604515jv = ((SearchHorizontalListAssem) awS93S0210000_10.l0).LLJLILLLLZIIL) != null) {
            viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS93S0210000_10 awS93S0210000_10) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseMixRefreshRepo: onComplete: totalChunks=");
        sbLIZ.append(((C118300cf) awS93S0210000_10.l0).element + 1);
        sbLIZ.append(", state=");
        sbLIZ.append(C13LE.LIZ(((C677830QiL) awS93S0210000_10.l1).getClass()).LJI());
        sbLIZ.append(", hasData=");
        sbLIZ.append(awS93S0210000_10.z2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0210000_10(C118300cf c118300cf, C677830QiL c677830QiL, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = c677830QiL;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS93S0210000_10(SearchHorizontalListAssem searchHorizontalListAssem, SearchHorizontalListAssem searchHorizontalListAssem2, List<? extends InterfaceC1891350zJl> list, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = searchHorizontalListAssem;
        this.l1 = searchHorizontalListAssem2;
        this.z2 = list;
    }
}
