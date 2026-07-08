package kotlin.jvm.internal;

import X.C09AY;
import X.C105700ad;
import X.C1533790q13;
import X.C828620Wey;
import X.C844280XAc;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.pumbaa.hybrid.governance.csp.CspHeaderConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.security.ClientSecurityServiceImpl;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.json.JSONException;

/* JADX INFO: loaded from: classes14.dex */
public class AwS246S0000000_13 extends C09AY implements Function1 {
    public final int $t;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS246S0000000_13(int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS246S0000000_13(ClientSecurityServiceImpl clientSecurityServiceImpl, int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AwS246S0000000_13 awS246S0000000_13, Object obj) {
        byte[] bArrLJIIIZ;
        String str;
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && (bArrLJIIIZ = c1533790q13.LJIIIZ()) != null) {
            String str2 = c1533790q13.LJJIIZI;
            if (str2 != null) {
                str = new String(bArrLJIIIZ, Charset.forName(str2));
            } else {
                str = new String(bArrLJIIIZ, Charsets.UTF_8);
            }
            if (str.length() > 0) {
                try {
                    C828620Wey c828620Wey = C828620Wey.LIZ;
                    CspHeaderConfig cspHeaderConfig = (CspHeaderConfig) C105700ad.LIZ(str, CspHeaderConfig.class);
                    c828620Wey.getClass();
                    C828620Wey.LIZIZ = cspHeaderConfig;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS246S0000000_13 awS246S0000000_13, Object obj) {
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C844280XAc.LIZIZ.invoke()).build().create((Class) obj);
    }
}
