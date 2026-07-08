package kotlin.jvm.internal;

import X.C09AY;
import X.C0M26;
import X.C1674390tfp;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraScene;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class AwS175S0101000_8 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public Object l0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS175S0101000_8(C0M26 c0m26, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c0m26;
        this.i1 = i;
    }

    public static final Object invoke$0(AwS175S0101000_8 awS175S0101000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((AimeCameraScene) awS175S0101000_8.l0).LLLLLLL((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS175S0101000_8.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS175S0101000_8 awS175S0101000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1674390tfp.LIZJ((StoryHighlightsCreationVM) awS175S0101000_8.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS175S0101000_8.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS175S0101000_8 awS175S0101000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1674390tfp.LIZJ((StoryHighlightsCreationVM) awS175S0101000_8.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS175S0101000_8.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS175S0101000_8 awS175S0101000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C0M26) awS175S0101000_8.l0).LJ((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS175S0101000_8.i1 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS175S0101000_8(AimeCameraScene aimeCameraScene, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = aimeCameraScene;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS175S0101000_8(StoryHighlightsCreationVM storyHighlightsCreationVM, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = storyHighlightsCreationVM;
        this.i1 = i;
    }
}
