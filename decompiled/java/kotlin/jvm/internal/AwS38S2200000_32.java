package kotlin.jvm.internal;

import X.C09AY;
import X.C1519540pe4;
import X.C1775590wJ3;
import com.ss.android.ugc.aweme.ecommerce.mixmall.player.MMKLynxLiveView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes33.dex */
public class AwS38S2200000_32 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS38S2200000_32 awS38S2200000_32) throws JSONException {
        String string;
        String str = awS38S2200000_32.s0;
        String str2 = awS38S2200000_32.s1;
        Object obj = ((Map) awS38S2200000_32.l2).get("code");
        String str3 = "";
        if (obj == null || (string = obj.toString()) == null) {
            string = "";
        }
        String str4 = ((MMKLynxLiveView) awS38S2200000_32.l3).LLILZIL;
        if (str4 != null) {
            str3 = str4;
        }
        C1519540pe4.LIZIZ(str, str2, string, str3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS38S2200000_32 awS38S2200000_32) throws JSONException {
        String string;
        String str = awS38S2200000_32.s0;
        String str2 = awS38S2200000_32.s1;
        Object obj = ((Map) awS38S2200000_32.l2).get("code");
        String str3 = "";
        if (obj == null || (string = obj.toString()) == null) {
            string = "";
        }
        String str4 = ((C1775590wJ3) awS38S2200000_32.l3).LLJJI;
        if (str4 != null) {
            str3 = str4;
        }
        C1519540pe4.LIZIZ(str, str2, string, str3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS38S2200000_32(String str, String str2, String str3, Map<String, Object> map, C1775590wJ3 c1775590wJ3) {
        super(0);
        this.$t = c1775590wJ3;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS38S2200000_32(String str, String str2, String str3, Map<String, Object> map, MMKLynxLiveView mMKLynxLiveView) {
        super(0);
        this.$t = mMKLynxLiveView;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
        this.l3 = map;
    }
}
