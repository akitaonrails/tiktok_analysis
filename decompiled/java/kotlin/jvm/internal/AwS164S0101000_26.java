package kotlin.jvm.internal;

import X.C09AY;
import X.C1054104Ah;
import X.C1054804Ao;
import X.C1748720vbi;
import X.C1750840vf8;
import X.C1757410vpj;
import X.C1757600vq2;
import X.C1763830w05;
import X.C2188811AlT;
import X.C679280Qkg;
import X.EnumC1757710vqD;
import X.InterfaceC1748810vbr;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS164S0101000_26 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object invoke$0(AwS164S0101000_26 awS164S0101000_26) {
        C1054104Ah c1054104Ah = ((SeaPdpHeadNavBarWidget) awS164S0101000_26.l0).LJIL().LLJLIL;
        if (c1054104Ah != null) {
            boolean z = ((SeaPdpHeadNavBarWidget) awS164S0101000_26.l0).LJIL().LLIZLLLIL;
            int i = awS164S0101000_26.i1;
            Map<String, Object> mapLJ = ((SeaPdpHeadNavBarWidget) awS164S0101000_26.l0).LJIL().LLLLL.LJ("c35259.d6786");
            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
            if (interfaceC1748810vbrLJJIZ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C1054804Ao(), new C1750840vf8(c1054104Ah, mapLJ, null, i, z));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS164S0101000_26 awS164S0101000_26) {
        return new C1757600vq2(EnumC1757710vqD.BOTTOM_RIGHT, 0, C679280Qkg.LIZ(awS164S0101000_26.i1), Integer.valueOf(((C1757410vpj) awS164S0101000_26.l0).LJ));
    }

    public static final Object invoke$2(AwS164S0101000_26 awS164S0101000_26) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageSelected: marginTop = ");
        sbLIZ.append(awS164S0101000_26.i1);
        sbLIZ.append(" imageBounds = ");
        sbLIZ.append(((C1763830w05) awS164S0101000_26.l0).LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S0101000_26(int i, C1757410vpj c1757410vpj, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1757410vpj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S0101000_26(int i, C1763830w05 c1763830w05, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1763830w05;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S0101000_26(int i, SeaPdpHeadNavBarWidget seaPdpHeadNavBarWidget, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = seaPdpHeadNavBarWidget;
        this.i1 = i;
    }
}
