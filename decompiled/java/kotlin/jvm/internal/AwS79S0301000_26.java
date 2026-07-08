package kotlin.jvm.internal;

import X.AnonymousClass0485;
import X.C049K;
import X.C09AY;
import X.C10515049h;
import X.C1744100vUG;
import X.C1744110vUH;
import X.C1748720vbi;
import X.C1752390vhd;
import X.C1752420vhg;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS79S0301000_26 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS79S0301000_26 awS79S0301000_26) {
        C1748720vbi.LIZLLL(((C1744110vUH) awS79S0301000_26.l0).itemView, new C10515049h(), new AwS132S0101000_26(awS79S0301000_26.i3, (C1744100vUG) awS79S0301000_26.l1, 8));
        C1748720vbi.LIZLLL(((C1744110vUH) awS79S0301000_26.l0).itemView, new AnonymousClass0485(), new AwS605S0100000_26((Image) awS79S0301000_26.l2, 672));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS79S0301000_26 awS79S0301000_26) {
        ECBaseFragment eCBaseFragment = ((C1752420vhg) awS79S0301000_26.l0).LL;
        C049K c049k = new C049K();
        C1752420vhg c1752420vhg = (C1752420vhg) awS79S0301000_26.l0;
        C1748720vbi.LIZIZ(eCBaseFragment, c049k, new AwS50S0301000_26(awS79S0301000_26.i3, (Feed) awS79S0301000_26.l2, c1752420vhg, (Map) awS79S0301000_26.l1, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS79S0301000_26 awS79S0301000_26) {
        ECBaseFragment eCBaseFragment = ((C1752390vhd) awS79S0301000_26.l0).LL;
        C049K c049k = new C049K();
        C1752390vhd c1752390vhd = (C1752390vhd) awS79S0301000_26.l0;
        C1748720vbi.LIZIZ(eCBaseFragment, c049k, new AwS50S0301000_26(awS79S0301000_26.i3, (Feed) awS79S0301000_26.l2, c1752390vhd, (Map) awS79S0301000_26.l1, 6));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS79S0301000_26(int i, Feed feed, C1752390vhd c1752390vhd, Map map, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1752390vhd;
        this.i3 = i;
        this.l1 = map;
        this.l2 = feed;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS79S0301000_26(int i, Feed feed, C1752420vhg c1752420vhg, Map map, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1752420vhg;
        this.i3 = i;
        this.l1 = map;
        this.l2 = feed;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS79S0301000_26(C1744110vUH c1744110vUH, int i, C1744100vUG c1744100vUG, Image image, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1744110vUH;
        this.i3 = i;
        this.l1 = c1744100vUG;
        this.l2 = image;
    }
}
