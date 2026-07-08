package kotlin.jvm.internal;

import X.C09AY;
import X.C21696019va;
import X.C2188811AlT;
import X.C725890Sdf;
import X.C786410Ut5;
import X.C816100Vzs;
import android.view.View;
import com.bytedance.helios.network.api.config.AutoSkipApiConfig;
import com.bytedance.tux.input.TuxTextView;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS153S0101000_13 extends C09AY implements Function0 {
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
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS153S0101000_13 awS153S0101000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Shower] show ok strategy=");
        sbLIZ.append(((C816100Vzs) awS153S0101000_13.l0).LIZ);
        sbLIZ.append(" id=");
        sbLIZ.append(awS153S0101000_13.i1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS153S0101000_13 awS153S0101000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStopNestedScroll: target=");
        sbLIZ.append((View) awS153S0101000_13.l0);
        sbLIZ.append(", type=");
        sbLIZ.append(awS153S0101000_13.i1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS153S0101000_13 awS153S0101000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStopNestedScroll: target=");
        sbLIZ.append((View) awS153S0101000_13.l0);
        sbLIZ.append(", type=");
        sbLIZ.append(awS153S0101000_13.i1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS153S0101000_13 awS153S0101000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("statisticsApiCost not skip id: ");
        sbLIZ.append(awS153S0101000_13.i1);
        sbLIZ.append(" autoSkipApiConfig: ");
        sbLIZ.append((AutoSkipApiConfig) awS153S0101000_13.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS153S0101000_13 awS153S0101000_13) {
        ((C21696019va) awS153S0101000_13.l0).getPhotoCountView().setText(C786410Ut5.k4(Locale.ENGLISH, "%,d", Arrays.copyOf(new Object[]{Integer.valueOf(awS153S0101000_13.i1)}, 1)));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS153S0101000_13 awS153S0101000_13) {
        TuxTextView photoCountView = ((C21696019va) awS153S0101000_13.l0).getPhotoCountView();
        int i = awS153S0101000_13.i1;
        boolean z = true;
        if (i <= 1) {
            z = false;
        }
        C725890Sdf.LIZJ(photoCountView, z, new AwS153S0101000_13((C21696019va) awS153S0101000_13.l0, i, 4));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S0101000_13(int i, View view, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = view;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S0101000_13(int i, AutoSkipApiConfig autoSkipApiConfig, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = autoSkipApiConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S0101000_13(C816100Vzs c816100Vzs, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c816100Vzs;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S0101000_13(C21696019va c21696019va, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c21696019va;
        this.i1 = i;
    }
}
