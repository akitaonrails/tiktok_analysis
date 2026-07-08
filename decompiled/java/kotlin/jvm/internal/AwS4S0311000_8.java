package kotlin.jvm.internal;

import X.C09AY;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.BasicMediaEngine;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class AwS4S0311000_8 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AwS4S0311000_8 awS4S0311000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((BasicMediaEngine) awS4S0311000_8.l0).Yg((SocMediaResource) awS4S0311000_8.l1, awS4S0311000_8.z3, (InterfaceC1685750ty9) awS4S0311000_8.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS4S0311000_8.i4 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S0311000_8 awS4S0311000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((PurePreviewMediaEngine) awS4S0311000_8.l0).LIZ((SocMediaResource) awS4S0311000_8.l1, awS4S0311000_8.z3, (InterfaceC1685750ty9) awS4S0311000_8.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS4S0311000_8.i4 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0311000_8(BasicMediaEngine basicMediaEngine, SocMediaResource socMediaResource, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = basicMediaEngine;
        this.l1 = socMediaResource;
        this.z3 = z;
        this.l2 = interfaceC1685750ty9;
        this.i4 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0311000_8(PurePreviewMediaEngine purePreviewMediaEngine, SocMediaResource socMediaResource, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = purePreviewMediaEngine;
        this.l1 = socMediaResource;
        this.z3 = z;
        this.l2 = interfaceC1685750ty9;
        this.i4 = i;
    }
}
