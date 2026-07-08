package kotlin.jvm.internal;

import X.C09AY;
import X.C0WZX;
import X.C1022820ciu;
import X.C1023640ckE;
import X.C1040740dBo;
import X.C1040780dBs;
import X.C1043500dGG;
import X.C1701330uNH;
import X.C1AF0;
import X.C2184171Adz;
import X.C2204961BRm;
import X.C2265711DmD;
import X.C988840bq6;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS8S2300000_16 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS8S2300000_16 awS8S2300000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LJFF, awS8S2300000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LJIILJJIL, Integer.valueOf(((C1040740dBo) awS8S2300000_16.l2).LL.getFirstPage()));
        C2265711DmD.LIZ.getClass();
        c1023640ckE.withParam(C2265711DmD.LJJIIJ, (Integer) awS8S2300000_16.l3);
        if (Intrinsics.LJFF((Boolean) awS8S2300000_16.l4, Boolean.TRUE)) {
            C1040780dBs.LIZ.getClass();
            c1023640ckE.withParam(C1040780dBs.LIZIZ, awS8S2300000_16.s1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS8S2300000_16 awS8S2300000_16, Object obj) {
        Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", awS8S2300000_16.s0, null));
        Context context = (Context) awS8S2300000_16.l2;
        if (context != null) {
            String str = awS8S2300000_16.s0;
            Integer num = (Integer) awS8S2300000_16.l3;
            String str2 = awS8S2300000_16.s1;
            Aweme aweme = (Aweme) awS8S2300000_16.l4;
            try {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOusLbnL2TYKRkDO0Wb9kosRXviz", null));
                HashMap<String, Integer> map = C988840bq6.LIZ;
                int iIntValue = 1;
                if (num != null) {
                    iIntValue = 1 + num.intValue();
                }
                map.put(str, Integer.valueOf(iIntValue));
                C988840bq6.LIZIZ = System.currentTimeMillis();
                C988840bq6.LIZJ = str2;
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str2, "otherclick", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL.LIZJ("banner_confirm", "refer");
                c1022820ciuLIZLLL.LJII();
                C2184171Adz.LIZLLL(str2, "leave_tt", aweme.getAwemeRawAd()).LJII();
            } catch (ActivityNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S2300000_16(Context context, Aweme aweme, Integer num, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = context;
        this.l3 = num;
        this.s1 = str2;
        this.l4 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S2300000_16(String str, C1040740dBo c1040740dBo, Integer num, Boolean bool, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = c1040740dBo;
        this.l3 = num;
        this.l4 = bool;
        this.s1 = str2;
    }
}
