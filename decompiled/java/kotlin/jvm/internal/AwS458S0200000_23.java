package kotlin.jvm.internal;

import X.AbstractC1535150q3F;
import X.C09AY;
import X.C1097680efe;
import X.C118300cf;
import X.C1503650pER;
import X.C1532300pye;
import X.C1532340pyi;
import X.C1533950q1J;
import X.C1534360q1y;
import X.C1545590qK5;
import X.C1547880qNm;
import X.C1909107dp;
import X.C2097608Jq;
import X.C2382909Vj;
import X.C238400w2;
import X.C259800zU;
import X.InterfaceC1503610pEN;
import X.InterfaceC1532430pyr;
import X.InterfaceC1554220qY0;
import X.InterfaceC634840OvC;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public class AwS458S0200000_23 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS458S0200000_23(C238400w2 c238400w2, C118300cf c118300cf, int i) {
        super(2);
        this.$t = i;
        this.l0 = c238400w2;
        this.l1 = c118300cf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS458S0200000_23 awS458S0200000_23, Object obj, Object obj2) {
        ((C259800zU) awS458S0200000_23.l0).element = obj2;
        ((C259800zU) awS458S0200000_23.l1).element = obj;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS458S0200000_23 awS458S0200000_23, Object obj, Object obj2) {
        ((C1532300pye) awS458S0200000_23.l0).LJIIJJI(((Boolean) obj).booleanValue(), (C1532340pyi) obj2, (InterfaceC1532430pyr) awS458S0200000_23.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS458S0200000_23 awS458S0200000_23, Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        int iIntValue = ((Number) obj2).intValue();
        ((C238400w2) awS458S0200000_23.l0).element = jLongValue;
        ((C118300cf) awS458S0200000_23.l1).element = iIntValue;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS458S0200000_23 awS458S0200000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJIIJJI((SparkPopup) obj2, (LayoutInflater) awS458S0200000_23.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS458S0200000_23 awS458S0200000_23, Object obj, Object obj2) {
        boolean zLJFF;
        String strSubstring = (String) obj;
        String strSubstring2 = (String) obj2;
        ((C1547880qNm) awS458S0200000_23.l0).getClass();
        C1545590qK5 c1545590qK5 = C1545590qK5.LIZIZ;
        if (c1545590qK5.LIZLLL(strSubstring)) {
            strSubstring = c1545590qK5.LIZIZ(strSubstring, C2097608Jq.LJ());
        }
        int iLJJJ = a0.LJJJ(strSubstring, "spark_page_session", 0, false, 6);
        if (iLJJJ > 0) {
            strSubstring = strSubstring.substring(0, iLJJJ);
        }
        ((C1547880qNm) awS458S0200000_23.l0).getClass();
        if (c1545590qK5.LIZLLL(strSubstring2)) {
            strSubstring2 = c1545590qK5.LIZIZ(strSubstring2, C2097608Jq.LJ());
        }
        int iLJJJ2 = a0.LJJJ(strSubstring2, "spark_page_session", 0, false, 6);
        if (iLJJJ2 > 0) {
            strSubstring2 = strSubstring2.substring(0, iLJJJ2);
        }
        if (C1533950q1J.LJ(((C1097680efe) awS458S0200000_23.l1).LJIIJJI)) {
            zLJFF = new Regex(((C1097680efe) awS458S0200000_23.l1).LJIIJJI).containsMatchIn(strSubstring);
        } else {
            zLJFF = Intrinsics.LJFF(strSubstring, strSubstring2);
        }
        return Boolean.valueOf(zLJFF);
    }

    public static final Object invoke$5(AwS458S0200000_23 awS458S0200000_23, Object obj, Object obj2) {
        String str = (String) obj;
        String containerID = null;
        if (!TextUtils.isEmpty(str)) {
            CompletionBlock completionBlock = (CompletionBlock) awS458S0200000_23.l0;
            ((C1503650pER) awS458S0200000_23.l1).getClass();
            InterfaceC634840OvC interfaceC634840OvC = ((C1503650pER) awS458S0200000_23.l1).IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1503610pEN.class, containerID);
            ((InterfaceC1503610pEN) xBaseModelLIZJ).setImageUri(str);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } else {
            C2382909Vj.LIZ((CompletionBlock) awS458S0200000_23.l0, -2, null, null, 6);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS458S0200000_23(C259800zU c259800zU, C259800zU<LinkedList<AbstractC1535150q3F<?, ?>>> c259800zU2, C259800zU<C1534360q1y<?>> c259800zU3) {
        super(2);
        this.$t = c259800zU3;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS458S0200000_23(C1532300pye c1532300pye, InterfaceC1532430pyr interfaceC1532430pyr, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1532300pye;
        this.l1 = interfaceC1532430pyr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS458S0200000_23(C1547880qNm c1547880qNm, C1097680efe c1097680efe, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1547880qNm;
        this.l1 = c1097680efe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS458S0200000_23(CompletionBlock completionBlock, CompletionBlock<InterfaceC1503610pEN> completionBlock2, C1503650pER c1503650pER) {
        super(2);
        this.$t = c1503650pER;
        this.l0 = completionBlock;
        this.l1 = completionBlock2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS458S0200000_23(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i) {
        super(2);
        this.$t = i;
        this.l0 = layoutInflater;
        this.l1 = viewGroup;
    }
}
