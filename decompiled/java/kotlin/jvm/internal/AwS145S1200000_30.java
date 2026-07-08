package kotlin.jvm.internal;

import X.C09AY;
import X.C1227904rF;
import X.C13LB;
import X.C20017613Ty;
import X.C20231414Ee;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.music.cache.CacheResponse;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public class AwS145S1200000_30 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS145S1200000_30 awS145S1200000_30) {
        ((C20231414Ee) awS145S1200000_30.l1).LIZIZ.remove(awS145S1200000_30.s0);
        ((ArrayList) ((C20231414Ee) awS145S1200000_30.l1).LJFF).remove((LocalVideoUrlModel) awS145S1200000_30.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS145S1200000_30 awS145S1200000_30) {
        ((Function0) awS145S1200000_30.l1).invoke();
        ((ITakoContextAbility) awS145S1200000_30.l2).PG0(new C13LB(awS145S1200000_30.s0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS145S1200000_30 awS145S1200000_30) {
        C20017613Ty c20017613Ty = (C20017613Ty) awS145S1200000_30.l1;
        Object obj = awS145S1200000_30.l2;
        c20017613Ty.getClass();
        if (obj != null) {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(obj);
            if (strLJI != null) {
                C20017613Ty c20017613Ty2 = (C20017613Ty) awS145S1200000_30.l1;
                String str = awS145S1200000_30.s0;
                if (strLJI.length() > 0) {
                    c20017613Ty2.LIZ.LJFF(str, new CacheResponse(System.currentTimeMillis(), strLJI));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Response added to cache, key: ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS145S1200000_30(C20017613Ty c20017613Ty, C20017613Ty c20017613Ty2, Object obj, String str) {
        super(0);
        this.$t = str;
        this.l1 = c20017613Ty;
        this.l2 = c20017613Ty2;
        this.s0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S1200000_30(C20231414Ee c20231414Ee, String str, LocalVideoUrlModel localVideoUrlModel, int i) {
        super(0);
        this.$t = i;
        this.l1 = c20231414Ee;
        this.s0 = str;
        this.l2 = localVideoUrlModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS145S1200000_30(Function0 function0, Function0<Unit> function02, ITakoContextAbility iTakoContextAbility, String str) {
        super(0);
        this.$t = str;
        this.l1 = function0;
        this.l2 = function02;
        this.s0 = iTakoContextAbility;
    }
}
