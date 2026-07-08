package kotlin.jvm.internal;

import X.C09AY;
import X.C1007900cKq;
import X.C1007940cKu;
import X.C1008110cLB;
import X.C1032900czA;
import X.C1033080czS;
import X.C2188811AlT;
import X.InterfaceC1032410cyN;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.rich.reward.api.GmtRewardClaimResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class AwS81S0100100_16 extends C09AY implements Function2 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS81S0100100_16(long j, C1033080czS c1033080czS, int i) {
        super(2);
        this.$t = i;
        this.j1 = j;
        this.l0 = c1033080czS;
    }

    public static final Object invoke$0(AwS81S0100100_16 awS81S0100100_16, Object obj, Object obj2) throws JSONException {
        String strLIZIZ;
        int i;
        Integer num;
        Function1<JSONObject, Unit> function1;
        GmtRewardClaimResult gmtRewardClaimResult = (GmtRewardClaimResult) obj;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - awS81S0100100_16.j1;
        if (gmtRewardClaimResult != null) {
            Integer num2 = gmtRewardClaimResult.statusCode;
            if (num2 != null && num2.intValue() == 0 && (num = gmtRewardClaimResult.actionReportStatus) != null && num.intValue() == 0) {
                C1032900czA.LIZLLL(((C1033080czS) awS81S0100100_16.l0).LIZ, 1, 1, jElapsedRealtime, null);
                if (obj2 != null && (function1 = ((C1033080czS) awS81S0100100_16.l0).LIZLLL) != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_key", "reward_response");
                    jSONObject.put("response_string", obj2);
                    function1.invoke(jSONObject);
                }
                InterfaceC1032410cyN interfaceC1032410cyN = ((C1033080czS) awS81S0100100_16.l0).LIZJ;
                if (interfaceC1032410cyN != null) {
                    interfaceC1032410cyN.LIZ(gmtRewardClaimResult);
                }
                ((C1033080czS) awS81S0100100_16.l0).LJ.invoke(Boolean.TRUE, gmtRewardClaimResult);
                return Unit.LIZ;
            }
            Integer num3 = gmtRewardClaimResult.statusCode;
            if (num3 != null && num3.intValue() == 0) {
                Integer num4 = gmtRewardClaimResult.actionReportStatus;
                if (num4 != null && num4.intValue() == 0) {
                    strLIZIZ = "networkError:unknown";
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("serverError:actionReportStatus=");
                    sbLIZ.append(gmtRewardClaimResult.actionReportStatus);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("serverError:statusCode=");
                sbLIZ2.append(gmtRewardClaimResult.statusCode);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
        } else if (obj2 != null) {
            strLIZIZ = "invalidDataFormat:claim result parse failed";
        } else {
            strLIZIZ = "networkError:claim result is null";
        }
        if (gmtRewardClaimResult == null) {
            if (obj2 != null) {
                i = 2;
            } else {
                i = 3;
            }
        } else {
            i = 4;
        }
        C1032900czA.LIZLLL(((C1033080czS) awS81S0100100_16.l0).LIZ, 0, i, jElapsedRealtime, strLIZIZ);
        if (gmtRewardClaimResult == null || !(!a0.LJJJIL(gmtRewardClaimResult.bubbleText))) {
            gmtRewardClaimResult = new GmtRewardClaimResult(null, null, 0, false, ((C1033080czS) awS81S0100100_16.l0).LIZIZ, null, null, null, null);
        }
        InterfaceC1032410cyN interfaceC1032410cyN2 = ((C1033080czS) awS81S0100100_16.l0).LIZJ;
        if (interfaceC1032410cyN2 != null) {
            interfaceC1032410cyN2.LIZ(gmtRewardClaimResult);
        }
        ((C1033080czS) awS81S0100100_16.l0).LJ.invoke(Boolean.FALSE, null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS81S0100100_16 awS81S0100100_16, Object obj, Object obj2) {
        C1007940cKu.LIZJ((C1007900cKq) awS81S0100100_16.l0, new C1008110cLB(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), awS81S0100100_16.j1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS81S0100100_16(C1007900cKq c1007900cKq, long j, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1007900cKq;
        this.j1 = j;
    }
}
