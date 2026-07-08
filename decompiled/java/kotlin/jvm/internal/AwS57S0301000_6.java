package kotlin.jvm.internal;

import X.C09AY;
import X.C0HL5;
import X.C1659840tIM;
import X.C1665420tRM;
import X.C1666000tSI;
import X.C341440Da2;
import X.C535700Kzg;
import X.InterfaceC1680500tpg;
import X.InterfaceC1680820tqC;
import X.InterfaceC1685750ty9;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS57S0301000_6 extends C09AY implements Function2 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS57S0301000_6 awS57S0301000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((PurePreviewMediaEngine) awS57S0301000_6.l0).LIZIZ((SocMediaResource) awS57S0301000_6.l1, (InterfaceC1685750ty9) awS57S0301000_6.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS57S0301000_6.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS57S0301000_6 awS57S0301000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((SocialAvatarCameraSceneV2) awS57S0301000_6.l0).LLLLLLLLL((C0HL5) awS57S0301000_6.l1, (InterfaceC1680820tqC) awS57S0301000_6.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS57S0301000_6.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS57S0301000_6 awS57S0301000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666000tSI.LJ((LiveData) awS57S0301000_6.l0, (InterfaceC1685750ty9) awS57S0301000_6.l1, (Function0) awS57S0301000_6.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS57S0301000_6.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS57S0301000_6 awS57S0301000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C1665420tRM) awS57S0301000_6.l0).LIZIZ((C1659840tIM) awS57S0301000_6.l1, (InterfaceC1685750ty9) awS57S0301000_6.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS57S0301000_6.i3 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0301000_6(C1665420tRM c1665420tRM, C1659840tIM c1659840tIM, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1665420tRM;
        this.l1 = c1659840tIM;
        this.l2 = interfaceC1685750ty9;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS57S0301000_6(LiveData liveData, LiveData<C535700Kzg> liveData2, InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function0, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveData;
        this.l1 = liveData2;
        this.l2 = interfaceC1685750ty9;
        this.i3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0301000_6(PurePreviewMediaEngine purePreviewMediaEngine, SocMediaResource socMediaResource, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = purePreviewMediaEngine;
        this.l1 = socMediaResource;
        this.l2 = interfaceC1685750ty9;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0301000_6(SocialAvatarCameraSceneV2 socialAvatarCameraSceneV2, C0HL5 c0hl5, InterfaceC1680820tqC interfaceC1680820tqC, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = socialAvatarCameraSceneV2;
        this.l1 = c0hl5;
        this.l2 = interfaceC1680820tqC;
        this.i3 = i;
    }
}
