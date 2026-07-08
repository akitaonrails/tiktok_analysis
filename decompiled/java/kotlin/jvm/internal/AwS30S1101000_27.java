package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAnyCard;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS30S1101000_27 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS30S1101000_27 awS30S1101000_27, Object obj) {
        TakoAnyCard takoAnyCard;
        TakoPlaceholderSource takoPlaceholderSource = (TakoPlaceholderSource) ((Map) awS30S1101000_27.l1).get(awS30S1101000_27.s0);
        if (takoPlaceholderSource != null && (takoAnyCard = takoPlaceholderSource.anyCard) != null) {
            takoAnyCard.height = Integer.valueOf(awS30S1101000_27.i2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS30S1101000_27 awS30S1101000_27, Object obj) {
        TakoAnyCard takoAnyCard;
        TakoPlaceholderSource takoPlaceholderSource = (TakoPlaceholderSource) ((Map) awS30S1101000_27.l1).get(awS30S1101000_27.s0);
        if (takoPlaceholderSource != null && (takoAnyCard = takoPlaceholderSource.anyCard) != null) {
            takoAnyCard.height = Integer.valueOf(awS30S1101000_27.i2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS30S1101000_27(Map map, Map<String, TakoPlaceholderSource> map2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = map;
        this.s0 = map2;
        this.i2 = str;
    }
}
