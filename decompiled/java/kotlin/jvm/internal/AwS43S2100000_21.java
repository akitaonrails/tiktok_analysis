package kotlin.jvm.internal;

import X.C09AY;
import X.C1362810lZH;
import X.C20271614Tq;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelImHeadViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS43S2100000_21 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS43S2100000_21 awS43S2100000_21, Object obj) {
        int i;
        C20271614Tq c20271614Tq = (C20271614Tq) obj;
        String strLJIIL = ((SharePanelImHeadViewModel) awS43S2100000_21.l2).LLJJIJIL.LJIIL();
        String str = awS43S2100000_21.s0;
        if (((SharePanelImHeadViewModel) awS43S2100000_21.l2).LLJJIJIL.LJII()) {
            i = 2;
        } else {
            i = 1;
        }
        return C20271614Tq.LIZ(c20271614Tq, strLJIIL, str, i, "dm", awS43S2100000_21.s1, 0, 522605);
    }

    public static final Object invoke$1(AwS43S2100000_21 awS43S2100000_21, Object obj) {
        return C20271614Tq.LIZ((C20271614Tq) obj, ((C1362810lZH) awS43S2100000_21.l2).LIZ.LIZJ, awS43S2100000_21.s0, 1, "dm", awS43S2100000_21.s1, 0, 522605);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S2100000_21(C1362810lZH c1362810lZH, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1362810lZH;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S2100000_21(SharePanelImHeadViewModel sharePanelImHeadViewModel, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = sharePanelImHeadViewModel;
        this.s0 = str;
        this.s1 = str2;
    }
}
