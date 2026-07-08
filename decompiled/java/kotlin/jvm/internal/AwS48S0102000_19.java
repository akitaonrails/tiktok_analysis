package kotlin.jvm.internal;

import X.C09AY;
import X.C1244290iU7;
import X.C1666390tSv;
import X.C1674430tft;
import X.C1689210u3j;
import X.C341440Da2;
import X.InterfaceC1665500tRU;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import com.ss.android.ugc.aweme.account.loginapproval.TwoStepPromoteFragment;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AwS48S0102000_19 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public int i2;
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
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS48S0102000_19 awS48S0102000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((TwoStepPromoteFragment) awS48S0102000_19.l0).SR(awS48S0102000_19.i1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS48S0102000_19.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS48S0102000_19 awS48S0102000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Function2 function2 = (Function2) awS48S0102000_19.l0;
        C1689210u3j.LJIIIIZZ(C341440Da2.LIZ(awS48S0102000_19.i1 | 1), awS48S0102000_19.i2, (InterfaceC1680500tpg) obj, function2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS48S0102000_19 awS48S0102000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        InterfaceC1665500tRU interfaceC1665500tRU = (InterfaceC1665500tRU) awS48S0102000_19.l0;
        C1244290iU7.LIZ(C341440Da2.LIZ(awS48S0102000_19.i1 | 1), awS48S0102000_19.i2, (InterfaceC1680500tpg) obj, interfaceC1665500tRU);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS48S0102000_19 awS48S0102000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1674430tft.LJFF((StoryHighlightsCreationVM) awS48S0102000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS48S0102000_19.i1 | 1), awS48S0102000_19.i2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS48S0102000_19 awS48S0102000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1674430tft.LJFF((StoryHighlightsCreationVM) awS48S0102000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS48S0102000_19.i1 | 1), awS48S0102000_19.i2);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS48S0102000_19 awS48S0102000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666390tSv.LIZJ((InterfaceC1685750ty9) awS48S0102000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS48S0102000_19.i1 | 1), awS48S0102000_19.i2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S0102000_19(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = interfaceC1685750ty9;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S0102000_19(int i, int i2, Function2 function2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = function2;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS48S0102000_19(InterfaceC1665500tRU interfaceC1665500tRU, InterfaceC1665500tRU<AlertToneItem> interfaceC1665500tRU2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC1665500tRU;
        this.i1 = interfaceC1665500tRU2;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S0102000_19(TwoStepPromoteFragment twoStepPromoteFragment, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = twoStepPromoteFragment;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S0102000_19(StoryHighlightsCreationVM storyHighlightsCreationVM, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = storyHighlightsCreationVM;
        this.i1 = i;
        this.i2 = i2;
    }
}
