package kotlin.jvm.internal;

import X.C09AY;
import X.C1669700tYG;
import X.C1675260thE;
import X.C341440Da2;
import X.InterfaceC1675480tha;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.ui.BottomTakoEntranceComposeAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS8S2201000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS8S2201000_25 awS8S2201000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1669700tYG.LIZ(awS8S2201000_25.s0, awS8S2201000_25.s1, (Function0) awS8S2201000_25.l2, (Function0) awS8S2201000_25.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS8S2201000_25.i4 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS8S2201000_25 awS8S2201000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1675260thE.LIZIZ(awS8S2201000_25.s0, awS8S2201000_25.s1, (Function0) awS8S2201000_25.l2, (Function0) awS8S2201000_25.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS8S2201000_25.i4 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS8S2201000_25 awS8S2201000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((BottomTakoEntranceComposeAssem) awS8S2201000_25.l2).So((InterfaceC1675480tha) awS8S2201000_25.l3, awS8S2201000_25.s0, awS8S2201000_25.s1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS8S2201000_25.i4 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S2201000_25(BottomTakoEntranceComposeAssem bottomTakoEntranceComposeAssem, InterfaceC1675480tha interfaceC1675480tha, String str, String str2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l2 = bottomTakoEntranceComposeAssem;
        this.l3 = interfaceC1675480tha;
        this.s0 = str;
        this.s1 = str2;
        this.i4 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS8S2201000_25(String str, String str2, String str3, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
        this.l3 = function0;
        this.i4 = function02;
    }
}
