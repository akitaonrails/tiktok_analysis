package kotlin.jvm.internal;

import X.C09AY;
import X.C1537480q70;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1547430qN3;
import X.C1547450qN5;
import X.C1547470qN7;
import X.C2187451AjH;
import X.C2188811AlT;
import X.InterfaceC1631620sYq;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: loaded from: classes24.dex */
public class AwS70S2100000_23 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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
    public AwS70S2100000_23(String str, String str2, C1547470qN7 c1547470qN7, int i) {
        super(3);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = c1547470qN7;
    }

    public static final Object invoke$0(AwS70S2100000_23 awS70S2100000_23, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerPreloadInfo, preloadViewFactory, hybridContext:");
            sbLIZ.append(c1537480q70);
            C2188811AlT.LIZIZ(sbLIZ);
            return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
        }
        C1547430qN3 c1547430qN3 = C1547430qN3.LIZ;
        String str = awS70S2100000_23.s0;
        String str2 = awS70S2100000_23.s1;
        c1547430qN3.getClass();
        SparkContext sparkContextLIZLLL = C1547430qN3.LIZLLL(C1547430qN3.LJ(str, str2, ""), (C1547450qN5) awS70S2100000_23.l2);
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        sparkContextLIZLLL.usePreload = true;
        c1537900q7g2.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ2 = new C1541950qED(context, sparkContextLIZLLL).LIZ(false);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("registerPreloadInfo, preloadViewFactory, sparkContext:");
        sbLIZ2.append(sparkContextLIZLLL);
        C2188811AlT.LIZIZ(sbLIZ2);
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ2;
    }

    public static final Object invoke$1(AwS70S2100000_23 awS70S2100000_23, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerPreloadInfo, preloadViewFactory, hybridContext:");
            sbLIZ.append(c1537480q70);
            C2188811AlT.LIZIZ(sbLIZ);
            return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
        }
        C1547430qN3 c1547430qN3 = C1547430qN3.LIZ;
        String str = awS70S2100000_23.s0;
        String str2 = awS70S2100000_23.s1;
        c1547430qN3.getClass();
        SparkContext sparkContextLJII = C1547430qN3.LJII(C1547430qN3.LJ(str, str2, ""), (C1547450qN5) awS70S2100000_23.l2);
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        sparkContextLJII.usePreload = true;
        c1537900q7g2.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ2 = new C1541950qED(context, sparkContextLJII).LIZ(false);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("registerPreloadInfo, preloadViewFactory, sparkContext:");
        sbLIZ2.append(sparkContextLJII);
        C2188811AlT.LIZIZ(sbLIZ2);
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ2;
    }
}
