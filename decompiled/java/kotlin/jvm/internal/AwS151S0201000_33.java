package kotlin.jvm.internal;

import X.AbstractC21692819v4;
import X.C09AY;
import X.C21692119ux;
import X.C21692219uy;
import X.C2177071AIf;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public class AwS151S0201000_33 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS151S0201000_33 awS151S0201000_33) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("default");
        sbLIZ.append(((C2177071AIf) awS151S0201000_33.l0).LIZJ);
        sbLIZ.append('-');
        sbLIZ.append(awS151S0201000_33.i2);
        sbLIZ.append('-');
        sbLIZ.append(((C2177071AIf) awS151S0201000_33.l0).LJ);
        sbLIZ.append('-');
        sbLIZ.append((Integer) awS151S0201000_33.l1);
        sbLIZ.append('-');
        sbLIZ.append(((C2177071AIf) awS151S0201000_33.l0).LJIIIIZZ);
        sbLIZ.append('-');
        sbLIZ.append(((Number) ((C2177071AIf) awS151S0201000_33.l0).LJIJJ.getValue()).intValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS151S0201000_33 awS151S0201000_33) {
        AbstractC21692819v4 abstractC21692819v4 = (AbstractC21692819v4) awS151S0201000_33.l0;
        if (abstractC21692819v4 != null) {
            int i = awS151S0201000_33.i2;
            PhotoModeImageUrlModel photoModeImageUrlModel = (PhotoModeImageUrlModel) ListProtector.get(((C21692219uy) awS151S0201000_33.l1).LLJI, i);
            VideoItemParams videoItemParamsD6 = ((C21692219uy) awS151S0201000_33.l1).LLILZIL.d6();
            ((C21692219uy) awS151S0201000_33.l1).getClass();
            ((C21692219uy) awS151S0201000_33.l1).getClass();
            return abstractC21692819v4.LIZ(new C21692119ux(i, photoModeImageUrlModel, videoItemParamsD6, Boolean.TRUE));
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S0201000_33(AbstractC21692819v4 abstractC21692819v4, int i, C21692219uy c21692219uy, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = abstractC21692819v4;
        this.i2 = i;
        this.l1 = c21692219uy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S0201000_33(C2177071AIf c2177071AIf, int i, Integer num, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c2177071AIf;
        this.i2 = i;
        this.l1 = num;
    }
}
