package kotlin.jvm.internal;

import X.C09AY;
import X.C0MJJ;
import X.C2188811AlT;
import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes35.dex */
public class AwS88S0500000_34 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object invoke$0(AwS88S0500000_34 awS88S0500000_34) {
        String str;
        AIGCPictureHandler.checkValidAndUpload$continueRun((AIGCPictureHandler) awS88S0500000_34.l0, (Activity) awS88S0500000_34.l2, (List) awS88S0500000_34.l3, (Function1) awS88S0500000_34.l4);
        C0MJJ c0mjj = C0MJJ.LIZ;
        if (((AIGCPictureHandler) awS88S0500000_34.l0).isFastPath) {
            str = "fast";
        } else {
            str = "slow";
        }
        c0mjj.getClass();
        C0MJJ.LIZLLL("confirm", str);
        ((Function0) awS88S0500000_34.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS88S0500000_34 awS88S0500000_34) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pack log with ");
        sbLIZ.append(((JSONArray) awS88S0500000_34.l0).length());
        sbLIZ.append(" v3、");
        sbLIZ.append(((JSONArray) awS88S0500000_34.l1).length());
        sbLIZ.append(" v1、");
        sbLIZ.append(((JSONArray) awS88S0500000_34.l2).length());
        sbLIZ.append(" log_data、");
        sbLIZ.append(((JSONArray) awS88S0500000_34.l3).length());
        sbLIZ.append(" launch、");
        sbLIZ.append(((JSONArray) awS88S0500000_34.l4).length());
        sbLIZ.append(" terminate...");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S0500000_34(Activity activity, AIGCPictureHandler aIGCPictureHandler, List list, Function0 function0, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l0 = aIGCPictureHandler;
        this.l1 = function0;
        this.l2 = activity;
        this.l3 = list;
        this.l4 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S0500000_34(JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4, JSONArray jSONArray5, int i) {
        super(0);
        this.$t = i;
        this.l0 = jSONArray;
        this.l1 = jSONArray2;
        this.l2 = jSONArray3;
        this.l3 = jSONArray4;
        this.l4 = jSONArray5;
    }
}
