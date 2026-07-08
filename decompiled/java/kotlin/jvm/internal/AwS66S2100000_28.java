package kotlin.jvm.internal;

import X.AbstractC1896090zRP;
import X.C01GW;
import X.C098200Yq;
import X.C09AY;
import X.C1393450mMh;
import X.C1619720sFe;
import X.C1697810uHb;
import X.C1868970yjf;
import X.C189200o6;
import X.C1894700zPA;
import X.C2178808gE;
import X.C2188811AlT;
import X.C2820017i;
import X.InterfaceC1895660zQi;
import X.InterfaceC1897260zTI;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.config.IIncentiveManager;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offlinepush.worker.BaseOfflinePushWork;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class AwS66S2100000_28 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS66S2100000_28 awS66S2100000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Work] uid mismatch strategy=");
        sbLIZ.append(((BaseOfflinePushWork) awS66S2100000_28.l2).LJIIJ());
        sbLIZ.append(" sender=");
        sbLIZ.append(awS66S2100000_28.s0);
        sbLIZ.append(" current=");
        sbLIZ.append(awS66S2100000_28.s1);
        sbLIZ.append(", skip without side effects");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS66S2100000_28 awS66S2100000_28) {
        InterfaceC1895660zQi next;
        IIncentiveManager iIncentiveManager = (IIncentiveManager) PluggableExtentionKt.pluggableSpi$default(IIncentiveManager.class, false, false, false, 14, null);
        if (iIncentiveManager != null) {
            iIncentiveManager.LIZLLL();
        }
        List<InterfaceC1895660zQi> list = C1393450mMh.LIZ;
        Uri uri = (Uri) awS66S2100000_28.l2;
        String str = awS66S2100000_28.s0;
        String str2 = awS66S2100000_28.s1;
        Iterator<InterfaceC1895660zQi> it2 = C1393450mMh.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ(str, str2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1895660zQi interfaceC1895660zQi = next;
        if (interfaceC1895660zQi != null) {
            interfaceC1895660zQi.LIZIZ(uri);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS66S2100000_28 awS66S2100000_28) {
        Object c098200Yq;
        Object c098200Yq2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        Object c098200Yq3;
        Object c098200Yq4;
        Uri uriLIZ;
        boolean zLJFF;
        Uri uriLIZIZ;
        SpecActServiceImpl specActServiceImpl = (SpecActServiceImpl) awS66S2100000_28.l2;
        String str = awS66S2100000_28.s0;
        String str2 = awS66S2100000_28.s1;
        specActServiceImpl.getClass();
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Uri uriLIZ2 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        try {
            c098200Yq2 = UriProtector.parse(str2);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        Uri uri2 = (Uri) c098200Yq2;
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        if (uri2 != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "url");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
        }
        try {
            c098200Yq3 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
            c098200Yq3 = null;
        }
        Uri uri3 = (Uri) c098200Yq3;
        try {
            c098200Yq4 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq4 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq4)) {
            c098200Yq4 = null;
        }
        Uri uri4 = (Uri) c098200Yq4;
        if (C1868970yjf.LIZ().reuseMatcherOptConfig.enableReuseMatcherOpt) {
            List<String> list = C1868970yjf.LIZ().reuseMatcherOptConfig.reuseMatcherMustCheckParams;
            if (uri3 != null) {
                uriLIZIZ = C2820017i.LIZIZ(uri3, list);
            } else {
                uriLIZIZ = null;
            }
            if (uri4 != null) {
                uriLIZ2 = C2820017i.LIZIZ(uri4, list);
            }
            zLJFF = Intrinsics.LJFF(uriLIZIZ, uriLIZ2);
        } else {
            List listLJIILJJIL = C1697810uHb.LJIILJJIL("device_id", "carrier_region");
            if (uri3 != null) {
                uriLIZ = C2820017i.LIZ(uri3, listLJIILJJIL);
            } else {
                uriLIZ = null;
            }
            if (uri4 != null) {
                uriLIZ2 = C2820017i.LIZ(uri4, listLJIILJJIL);
            }
            zLJFF = Intrinsics.LJFF(uriLIZ, uriLIZ2);
        }
        return Boolean.valueOf(zLJFF);
    }

    public static final Object invoke$3(AwS66S2100000_28 awS66S2100000_28) {
        String strLJIJI;
        String str;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        TouchPoint touchPointLIZJ = C2178808gE.LIZ().LIZJ(51, (Integer) awS66S2100000_28.l2);
        if (touchPointLIZJ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            if (abstractC1896090zRP == null || (strLJIJI = abstractC1896090zRP.LJIJI()) == null) {
                strLJIJI = "fyp";
            }
            if (Intrinsics.LJFF(strLJIJI, "follow")) {
                str = "homepage_follow";
            } else {
                str = "homepage_hot";
            }
            linkedHashMap.put("enter_from", str);
            linkedHashMap.put("touch_point_name", touchPointLIZJ.touchPointName);
            linkedHashMap.put("launch_plan_id", String.valueOf(touchPointLIZJ.launchPlanId));
            linkedHashMap.put("action_type", awS66S2100000_28.s0);
            if (Intrinsics.LJFF(awS66S2100000_28.s0, "click") && awS66S2100000_28.s1.length() > 0) {
                linkedHashMap.put("click_position", awS66S2100000_28.s1);
            }
            Map<String, String> map = touchPointLIZJ.customEventParams;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                interfaceC1897260zTILIZIZ.LIZ("timer_widget_toast", linkedHashMap);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S2100000_28(Uri uri, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = uri;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S2100000_28(BaseOfflinePushWork baseOfflinePushWork, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = baseOfflinePushWork;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S2100000_28(SpecActServiceImpl specActServiceImpl, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = specActServiceImpl;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S2100000_28(Integer num, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = num;
        this.s0 = str;
        this.s1 = str2;
    }
}
