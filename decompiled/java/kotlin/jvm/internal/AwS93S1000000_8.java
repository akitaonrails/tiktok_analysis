package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C189200o6;
import X.C2188811AlT;
import X.C2286708xd;
import X.C2354709Kn;
import X.C470601sO;
import X.C544540LXg;
import X.C572490Mcp;
import X.C576730Mjf;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowDownloadConfig;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class AwS93S1000000_8 extends C09AY implements Function0 {
    public final int $t;
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
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return this.s0;
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS93S1000000_8 awS93S1000000_8) {
        C572490Mcp.LIZJ.remove(awS93S1000000_8.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS93S1000000_8 awS93S1000000_8) {
        boolean z;
        boolean z2;
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        String str = awS93S1000000_8.s0;
        int iIntValue = 1;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        float fFloatValue = 0.0f;
        if (!z) {
            C470601sO c470601sO = C470601sO.LIZ;
            try {
                c098200Yq3 = Float.valueOf((float) new JSONObject(str).optDouble("img_gender", 0.0f));
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!(th instanceof CancellationException)) {
                    c470601sO.getClass();
                    C470601sO.LIZ(th);
                    c098200Yq3 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq3);
                } else {
                    throw th;
                }
            }
            Float fValueOf = Float.valueOf(0.0f);
            if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                c098200Yq3 = fValueOf;
            }
            fFloatValue = ((Number) c098200Yq3).floatValue();
        }
        Float fValueOf2 = Float.valueOf(fFloatValue);
        String str2 = awS93S1000000_8.s0;
        if (str2 != null && str2.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str3 = "";
        if (!z2) {
            C470601sO c470601sO2 = C470601sO.LIZ;
            try {
                c098200Yq2 = new JSONObject(str2).optString("img_skincolor", "");
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (!(th2 instanceof CancellationException)) {
                    c470601sO2.getClass();
                    C470601sO.LIZ(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                } else {
                    throw th2;
                }
            }
            Object obj = "";
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            str3 = (String) obj;
        }
        String str4 = awS93S1000000_8.s0;
        if (str4 != null && str4.length() != 0) {
            C470601sO c470601sO3 = C470601sO.LIZ;
            try {
                c098200Yq = Integer.valueOf(new JSONObject(str4).optInt("img_imgtype", 1));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                if (!(th3 instanceof CancellationException)) {
                    c470601sO3.getClass();
                    C470601sO.LIZ(th3);
                    c098200Yq = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq);
                } else {
                    throw th3;
                }
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = 1;
            }
            iIntValue = ((Number) c098200Yq).intValue();
        }
        return new C544540LXg(fValueOf2, str3, Integer.valueOf(iIntValue), 4);
    }

    public static final Object invoke$2(AwS93S1000000_8 awS93S1000000_8) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cleanUnusedCompiledFiles: ");
        sbLIZ.append(awS93S1000000_8.s0);
        C576730Mjf.LJIIJJI("CameraLayoutNLECompiler", C2188811AlT.LIZIZ(sbLIZ));
        C2286708xd.LJIJ(awS93S1000000_8.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS93S1000000_8 awS93S1000000_8) {
        return new AIGCWorkflowDownloadConfig(awS93S1000000_8.s0, 3, 3);
    }

    public static final Object invoke$4(AwS93S1000000_8 awS93S1000000_8) {
        return Boolean.valueOf(C2354709Kn.LIZIZ(awS93S1000000_8.s0));
    }

    public static final Object invoke$5(AwS93S1000000_8 awS93S1000000_8) {
        return Boolean.valueOf(C2354709Kn.LIZIZ(awS93S1000000_8.s0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S1000000_8(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
