package kotlin.jvm.internal;

import X.C09AY;
import X.C2196361Axe;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import kotlin.Unit;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes31.dex */
public class AwS679S0100000_30 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS679S0100000_30(SchemaParserData schemaParserData, int i) {
        super(3);
        this.$t = i;
        this.l0 = schemaParserData;
    }

    public static final Object invoke$0(AwS679S0100000_30 awS679S0100000_30, Object obj, Object obj2, Object obj3) {
        JSONArray jSONArray = C2196361Axe.LIZ;
        C2196361Axe.LJIIIIZZ((SchemaParserData) awS679S0100000_30.l0, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (String) obj3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS679S0100000_30 awS679S0100000_30, Object obj, Object obj2, Object obj3) {
        JSONArray jSONArray = C2196361Axe.LIZ;
        C2196361Axe.LJIIJJI((SchemaParserData) awS679S0100000_30.l0, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (String) obj3);
        return Unit.LIZ;
    }
}
