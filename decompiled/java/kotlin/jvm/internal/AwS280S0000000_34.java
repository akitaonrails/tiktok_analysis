package kotlin.jvm.internal;

import X.C09AY;
import X.C1306400k6I;
import X.C2239731ClP;
import X.C326690CrL;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AwS280S0000000_34 extends C09AY implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS280S0000000_34(int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS280S0000000_34(C2239731ClP c2239731ClP, int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AwS280S0000000_34 awS280S0000000_34, Object obj) {
        ((Boolean) obj).booleanValue();
        C326690CrL.LIZ.registerStrategyCallback(new C1306400k6I("play_time_collect_by_cep"), new AwS280S0000000_34(2));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AwS280S0000000_34 awS280S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AwS280S0000000_34 awS280S0000000_34, Object obj) {
        return Unit.LIZ;
    }
}
