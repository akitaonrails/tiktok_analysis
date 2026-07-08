package kotlin.jvm.internal;

import X.C09AY;
import X.C856020Xi4;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS222S0000000_32 extends C09AY implements Function0 {
    public final int $t;

    public static final Object invoke$1(AwS222S0000000_32 awS222S0000000_32) {
        return "MynaTemplateLoadContext is not removed from map after the template is loaded";
    }

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS222S0000000_32(int i) {
        super(0);
        this.$t = i;
    }

    public static final Object invoke$0(AwS222S0000000_32 awS222S0000000_32) {
        C856020Xi4 c856020Xi4 = new C856020Xi4();
        c856020Xi4.LIZ.put("last_class", "MvChoosePhotoScene");
        return c856020Xi4;
    }
}
