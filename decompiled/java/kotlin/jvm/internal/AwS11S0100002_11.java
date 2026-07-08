package kotlin.jvm.internal;

import X.C09AY;
import X.C0CNO;
import X.C16F4;
import X.C2188811AlT;
import X.C721130SQl;
import X.C721140SQm;
import com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS11S0100002_11 extends C09AY implements Function0 {
    public final int $t;
    public float f1;
    public float f2;
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

    public static final Object invoke$0(AwS11S0100002_11 awS11S0100002_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((LivePhotoViewHolder) awS11S0100002_11.l0).hashCode());
        sbLIZ.append(" updatePlayerViewContainerLayout ScaleType ");
        sbLIZ.append(((LivePhotoViewHolder) awS11S0100002_11.l0).LLJLLIL.getScaleType());
        sbLIZ.append(" video ratio: ");
        sbLIZ.append(awS11S0100002_11.f1);
        sbLIZ.append(" containerRatio: ");
        sbLIZ.append(awS11S0100002_11.f2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS11S0100002_11 awS11S0100002_11) {
        C721130SQl c721130SQl = (C721130SQl) awS11S0100002_11.l0;
        float f = awS11S0100002_11.f1;
        float f2 = awS11S0100002_11.f2;
        c721130SQl.getClass();
        C0CNO.LIZLLL(0L, new AwS11S0100002_11(c721130SQl, f, f2, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS11S0100002_11 awS11S0100002_11) {
        if (!((C721130SQl) awS11S0100002_11.l0).LL.LJIIIIZZ.yQ2()) {
            C721130SQl c721130SQl = (C721130SQl) awS11S0100002_11.l0;
            if (c721130SQl.LL.LIZJ != null) {
                PostDiggViewModel postDiggViewModel = c721130SQl.LLILLJJLI;
                if (postDiggViewModel.LLILLJJLI) {
                    float f = awS11S0100002_11.f1;
                    float f2 = awS11S0100002_11.f2;
                    C16F4 c16f4LIZ = c721130SQl.LIZ();
                    if (c16f4LIZ != null) {
                        c16f4LIZ.LIZJ(f, f2, null);
                    }
                } else {
                    postDiggViewModel.yQ2(new C721140SQm(c721130SQl, awS11S0100002_11.f1, awS11S0100002_11.f2));
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S0100002_11(C721130SQl c721130SQl, float f, float f2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c721130SQl;
        this.f1 = f;
        this.f2 = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S0100002_11(LivePhotoViewHolder livePhotoViewHolder, float f, float f2, int i) {
        super(0);
        this.$t = i;
        this.l0 = livePhotoViewHolder;
        this.f1 = f;
        this.f2 = f2;
    }
}
