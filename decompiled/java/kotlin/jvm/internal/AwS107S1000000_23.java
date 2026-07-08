package kotlin.jvm.internal;

import X.AbstractC830880Wic;
import X.C01GW;
import X.C08CX;
import X.C09AY;
import X.C13LP;
import X.C1490520otG;
import X.C1492560owY;
import X.C1534750q2b;
import X.C1535250q3P;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2251708rz;
import X.C2344809Gs;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class AwS107S1000000_23 extends C09AY implements Function0 {
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
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS107S1000000_23 awS107S1000000_23) {
        C1492560owY c1492560owY = C1492560owY.LIZ;
        String str = awS107S1000000_23.s0;
        synchronized (c1492560owY) {
            try {
                C01GW c01gw = C1492560owY.LIZJ;
                Set<String> stringSet = ((Keva) c01gw.getValue()).getStringSet("extra_data", C08CX.INSTANCE);
                stringSet.removeAll(C13LP.LLIIJI(C1492560owY.LIZ(stringSet.size())));
                stringSet.add(str);
                ((Keva) c01gw.getValue()).storeStringSet("extra_data", stringSet);
                LinkedHashMap<String, String> linkedHashMap = C1492560owY.LIZLLL;
                if (!linkedHashMap.containsKey(str)) {
                    C1490520otG c1490520otGLJFF = C1490520otG.LJFF();
                    c1490520otGLJFF.getClass();
                    String strLIZIZ = "";
                    if (TextUtils.isEmpty(str)) {
                        C2344809Gs.LJ("MusicProviderConfig getFilePathById music id is null");
                    } else {
                        String strLIZ = c1490520otGLJFF.LIZ();
                        if (!TextUtils.isEmpty(strLIZ)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZ);
                            C2251708rz.LIZ.getClass();
                            sbLIZ.append(C2251708rz.LIZ(str));
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                    }
                    linkedHashMap.put(str, strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS107S1000000_23 awS107S1000000_23) {
        TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(awS107S1000000_23.s0, null, null, new AbstractC830880Wic() { // from class: X.0W4Z
            @Override // X.AbstractC830880Wic
            public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initTTMStragtegyEvent TTMScene:");
                sbLIZ.append(interfaceC830890Wid);
                sbLIZ.append(" action result statuscode:");
                sbLIZ.append(interfaceC805220ViK.LIZIZ());
                sbLIZ.append(" errorMsg:");
                sbLIZ.append(interfaceC805220ViK.getErrorMessage());
                C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC830880Wic
            public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initTTMStragtegyEvent registerSceneResult TTMScene:");
                sbLIZ.append(interfaceC830890Wid);
                sbLIZ.append(" stateCode:");
                sbLIZ.append(enumC2213771Bkd);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageRetreatAwake from: ");
        sbLIZ.append(awS107S1000000_23.s0);
        sbLIZ.append(" listener already removed");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$11(AwS107S1000000_23 awS107S1000000_23) {
        return new C1534750q2b("ResourceProcessChain", "process", awS107S1000000_23.s0, 24);
    }

    public static final Object invoke$12(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("condition not satisfied, ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("ResourceProcessChain", "processSingleProcessor", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$13(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("already executed, ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("ResourceProcessChain", "processSingleProcessor", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$14(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("execute on background thread, ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("ResourceProcessChain", "processSingleProcessor", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$15(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cached request rejects to reuse: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("PrefetchService", "internalFetch", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$16(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cached request is expired, retry: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("PrefetchService", "internalFetch", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$17(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hit cached request: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("PrefetchService", "prefetch", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$18(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cpu is stressful");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("PrefetchGroup", "prefetch", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$19(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executing prefetch: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("PrefetchService", "prefetch", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$2(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("channel=");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("GeckoResourceProvider", "onUpdateSuccess", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$20(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cached request is only_once and not_used, rejected");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("PrefetchService", "prefetch", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$21(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prefetch group destroyed");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("PrefetchGroup", "prefetch", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$22(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cached request is only_once and used, retry: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("PrefetchService", "internalFetch", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$23(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hit cached result: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("PrefetchService", "internalFetch", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$24(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hit cached request: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("PrefetchService", "internalFetch", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$25(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cached request is expired, retry: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("PrefetchService", "internalFetch", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$26(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("HTTPCache", "createDiskCache", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$27(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("NetCacheManager", "createOrGetCachePool", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$28(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("base url: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("NetCacheManager", "traverseAndFetchCacheIf", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$29(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("base url: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("NetCacheManager", "traverseAndFetchCacheIf", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$3(AwS107S1000000_23 awS107S1000000_23) throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadPkgByBusinessName success, businessName: ");
        sbLIZ.append(awS107S1000000_23.s0);
        C20441214yg.LIZIZ("LivePitayaPkgUpdateStrategy", C2188811AlT.LIZIZ(sbLIZ));
        JSONObject jSONObject = new JSONObject();
        String str = awS107S1000000_23.s0;
        jSONObject.putOpt("success", 1);
        jSONObject.putOpt("package_name", str);
        C1CC2.LIZJ("ttlive_algo_package_pull_optimize_monitor", jSONObject, new JSONObject(), new JSONObject());
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("write back ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("NetCacheManager", "trimAndGenerateCacheKey", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$31(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS107S1000000_23.s0);
        sbLIZ.append(" is not a cdn-multiple-version url");
        return new C1534750q2b("GeckoUtils", "addCommonParamsForCDNMultiVersionURL", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$32(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadStart ");
        sbLIZ.append(awS107S1000000_23.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch succeeded: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1535250q3P("HTTPResponseProvider", "provideData", C2188811AlT.LIZIZ(sbLIZ), null, null, false, null, 120);
    }

    public static final Object invoke$5(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("redirect to ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1535250q3P("HTTPResponseProvider", "provideData", C2188811AlT.LIZIZ(sbLIZ), null, null, false, null, 120);
    }

    public static final Object invoke$6(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clean file: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("ForestGlobalConfigX", "triggerCDNClear", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$7(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clean file: clean cache key since file not exists: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("ForestGlobalConfigX", "triggerCDNDeepClean", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$8(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clean cache key since expired: ");
        sbLIZ.append(awS107S1000000_23.s0);
        return new C1534750q2b("ForestGlobalConfigX", "triggerCDNDeepClean", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$9(AwS107S1000000_23 awS107S1000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageRetreatAwake from: ");
        sbLIZ.append(awS107S1000000_23.s0);
        sbLIZ.append(" tasks queue is empty");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S1000000_23(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
