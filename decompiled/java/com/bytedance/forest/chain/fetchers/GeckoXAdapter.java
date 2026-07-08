package com.bytedance.forest.chain.fetchers;

import X.AbstractC1552040qUU;
import X.C086F;
import X.C098200Yq;
import X.C0VSJ;
import X.C0VSZ;
import X.C13LP;
import X.C1533370q0N;
import X.C1533490q0Z;
import X.C1533510q0b;
import X.C1533560q0g;
import X.C1533570q0h;
import X.C1533650q0p;
import X.C1533790q13;
import X.C1534250q1n;
import X.C1537040q6I;
import X.C1537050q6J;
import X.C1550600qSA;
import X.C1550610qSB;
import X.C1550730qSN;
import X.C1551530qTf;
import X.C1551940qUK;
import X.C1551950qUL;
import X.C1553130qWF;
import X.C1554340qYC;
import X.C189200o6;
import X.C1956907lX;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C797990VSb;
import X.InterfaceC1294060jmO;
import X.InterfaceC1533390q0P;
import X.InterfaceC1551450qTX;
import Y.ARunnableS23S0210000_23;
import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.ForestEnvData;
import com.bytedance.forest.model.ForestEnvType;
import com.bytedance.forest.model.GeckoSource;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class GeckoXAdapter {
    public static Map<String, String> CDNMultiVersionCommonParamsDelegate;
    public static final Companion Companion = new Companion();
    public static boolean enableThrottle = true;
    public static final List<String> fallbackCDNMultiVersionDomains = new ArrayList();
    public static String geckoBucketId = "-1";
    public final Application app;
    public File appFileDir;
    public final Forest forest;
    public final C1533560q0g forestConfig;
    public final HashMap<String, C1551950qUL> geckoClients = new HashMap<>();
    public final InterfaceC1551450qTX mStatisticMonitor = new InterfaceC1551450qTX() { // from class: X.0q0M
        @Override // X.InterfaceC1551450qTX
        public final void LIZ(String str, JSONObject jSONObject) {
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("event:");
                sbLIZ.append(str);
                sbLIZ.append(",data:");
                sbLIZ.append(jSONObject);
                C1534250q1n.LJII("GeckoXAdapter", C2188811AlT.LIZIZ(sbLIZ), false);
            }
        }
    };

    public static final class Companion {
        public final String dealWithBoeDomainIfNeed(String str) {
            return str;
        }

        public final Map<String, String> getCDNMultiVersionCommonParams() {
            Map<String, String> map = GeckoXAdapter.CDNMultiVersionCommonParamsDelegate;
            if (map != null) {
                return map;
            }
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            if (c1551940qUK.LIZLLL == null) {
                return C2097608Jq.LJIIIIZZ(new Pair("version_name", ""), new Pair("device_platform", "android"), new Pair("os", "android"), new Pair("aid", ""), new Pair("gecko_bkt", "9"));
            }
            Pair[] pairArr = new Pair[5];
            c1551940qUK.LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig = c1551940qUK.LIZLLL;
            pairArr[0] = new Pair("version_name", geckoGlobalConfig != null ? geckoGlobalConfig.getAppVersion() : null);
            pairArr[1] = new Pair("device_platform", "android");
            pairArr[2] = new Pair("os", "android");
            c1551940qUK.LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig2 = c1551940qUK.LIZLLL;
            pairArr[3] = new Pair("aid", geckoGlobalConfig2 != null ? Long.valueOf(geckoGlobalConfig2.getAppId()).toString() : null);
            pairArr[4] = new Pair("gecko_bkt", getGeckoBucketId(null));
            Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            GeckoXAdapter.CDNMultiVersionCommonParamsDelegate = mapLJIIIIZZ;
            return mapLJIIIIZZ;
        }

        public final boolean getEnableThrottle$forest_release() {
            return GeckoXAdapter.enableThrottle;
        }

        public final void addDefaultCDNMultiVersionDomains(List<String> list) {
            GeckoXAdapter.fallbackCDNMultiVersionDomains.addAll(list);
        }

        public final boolean canParsed(String str) {
            if (tryParseGeckoModelViaPrefix2Ak(str) != null) {
                return true;
            }
            return false;
        }

        public final String getGeckoBucketId(Long l) {
            String strValueOf;
            String deviceId;
            if (!Intrinsics.LJFF(GeckoXAdapter.geckoBucketId, "-1")) {
                return GeckoXAdapter.geckoBucketId;
            }
            if (l == null) {
                C1551940qUK c1551940qUK = C797990VSb.LIZ;
                c1551940qUK.LIZIZ();
                GeckoGlobalConfig geckoGlobalConfig = c1551940qUK.LIZLLL;
                if (geckoGlobalConfig == null || (deviceId = geckoGlobalConfig.getDeviceId()) == null || (l = C2095008Iq.LJIILIIL(deviceId)) == null) {
                    return "9";
                }
            }
            int iLongValue = (int) (l.longValue() % ((long) 100));
            if (iLongValue == 0) {
                strValueOf = "s01";
            } else if (1 <= iLongValue && iLongValue < 5) {
                strValueOf = "s05";
            } else if (5 <= iLongValue && iLongValue < 10) {
                strValueOf = CardStruct.IStatusCode.DEFAULT;
            } else {
                strValueOf = String.valueOf(iLongValue / 10);
            }
            GeckoXAdapter.geckoBucketId = strValueOf;
            return strValueOf;
        }

        public final String getPrefixAsGeckoCDN(String str) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"/"}, 0, 6);
            if (!listLJJLIIIJILLIZJL.isEmpty() && listLJJLIIIJILLIZJL.size() >= 6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('/');
                sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
                sbLIZ.append('/');
                sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 2));
                sbLIZ.append('/');
                sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 3));
                sbLIZ.append('/');
                sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 4));
                sbLIZ.append('/');
                sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 5));
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return "";
        }

        public final boolean isCDNMultiVersionResource(String str) {
            List<String> listLJJJJLI;
            GlobalConfigSettings.ResourceMeta resourceMeta;
            GlobalConfigSettings.CurrentLevelConfig config;
            GlobalConfigSettings.CDNMultiVersion cDNMultiVersion;
            List<String> domains;
            if (str == null || a0.LJJJIL(str)) {
                return false;
            }
            GlobalConfigSettings globalConfigSettingsLJI = C797990VSb.LIZ.LJI();
            if (globalConfigSettingsLJI != null && (resourceMeta = globalConfigSettingsLJI.getResourceMeta()) != null && (config = resourceMeta.getConfig()) != null && (cDNMultiVersion = config.getCDNMultiVersion()) != null && (domains = cDNMultiVersion.getDomains()) != null) {
                listLJJJJLI = C13LP.LJJJJLI(domains);
            } else {
                listLJJJJLI = GeckoXAdapter.fallbackCDNMultiVersionDomains;
            }
            for (String str2 : listLJJJJLI) {
                if (a0.LJJIIZI(str, str2, false)) {
                    if (str2 != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        public final void setEnableThrottle$forest_release(boolean z) {
            GeckoXAdapter.enableThrottle = z;
        }

        public final C1533510q0b tryParseGeckoModelViaPrefix2Ak(String str) {
            String scheme;
            GlobalConfigSettings.ResourceMeta resourceMeta;
            String str2;
            C1533510q0b c1533510q0bLIZIZ;
            try {
                if (str.length() == 0) {
                    return null;
                }
                Uri uri = UriProtector.parse(str);
                if (uri.getScheme() != null && (scheme = uri.getScheme()) != null && u.LJJIIJZLJL(scheme, "http", false)) {
                    GlobalConfigSettings globalConfigSettingsLJI = C797990VSb.LIZ.LJI();
                    if (globalConfigSettingsLJI != null && (resourceMeta = globalConfigSettingsLJI.getResourceMeta()) != null) {
                        Companion companion = GeckoXAdapter.Companion;
                        String path = uri.getPath();
                        if (path == null) {
                            path = "";
                        }
                        String prefixAsGeckoCDN = companion.getPrefixAsGeckoCDN(path);
                        if (prefixAsGeckoCDN.length() == 0) {
                            return null;
                        }
                        GlobalConfigSettings.CurrentLevelConfig config = resourceMeta.getConfig();
                        if (config == null) {
                            C1534250q1n.LIZIZ(null, "could not get any valid config", null);
                            return null;
                        }
                        Map<String, String> prefix2AccessKey = config.getPrefix2AccessKey();
                        if (prefix2AccessKey != null && (str2 = prefix2AccessKey.get(prefixAsGeckoCDN)) != null && (c1533510q0bLIZIZ = C1956907lX.LIZIZ(str, prefixAsGeckoCDN)) != null) {
                            c1533510q0bLIZIZ.LIZ = str2;
                            c1533510q0bLIZIZ.LJIIIIZZ = GeckoSource.REMOTE_SETTING;
                            return c1533510q0bLIZIZ;
                        }
                    } else {
                        C1534250q1n.LIZIZ(null, "could not get any valid resource meta", null);
                        return null;
                    }
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return null;
            }
        }

        public final Uri addCommonParamsForCDNMultiVersionURL(String str, Uri uri) {
            ForestEnvData forestEnvData;
            String str2;
            Function0<String> function0;
            String strInvoke;
            if (!isCDNMultiVersionResource(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(" is not a cdn-multiple-version url");
                C1534250q1n.LJII("GeckoXAdapter", C2188811AlT.LIZIZ(sbLIZ), false);
                return uri;
            }
            Map<String, String> cDNMultiVersionCommonParams = getCDNMultiVersionCommonParams();
            if (cDNMultiVersionCommonParams.isEmpty()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("no cdn-multiple-version params need to add on ");
                sbLIZ2.append(str);
                C1534250q1n.LJII("GeckoXAdapter", C2188811AlT.LIZIZ(sbLIZ2), false);
            }
            try {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                for (Map.Entry<String, String> entry : cDNMultiVersionCommonParams.entrySet()) {
                    if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, entry.getKey()) == null) {
                        builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Parameter ");
                        sbLIZ3.append(entry.getKey());
                        sbLIZ3.append(" of cdn-multiple-version already exists, value is:");
                        sbLIZ3.append(entry.getValue());
                        sbLIZ3.append('.');
                        C1534250q1n.LJII("GeckoXAdapter", C2188811AlT.LIZIZ(sbLIZ3), false);
                    }
                }
                Forest.Companion companion = Forest.Companion;
                C1533650q0p globalConfig = companion.getGlobalConfig();
                if (globalConfig != null && (function0 = globalConfig.LJII) != null && (strInvoke = function0.invoke()) != null) {
                    builderBuildUpon.appendQueryParameter("op_region", strInvoke);
                }
                C1533650q0p globalConfig2 = companion.getGlobalConfig();
                if (globalConfig2 != null && (forestEnvData = globalConfig2.LJ) != null) {
                    Pair[] pairArr = new Pair[2];
                    if (forestEnvData.type == ForestEnvType.PPE) {
                        str2 = "x-use-ppe";
                    } else {
                        str2 = "x-use-boe";
                    }
                    pairArr[0] = new Pair(str2, "1");
                    pairArr[1] = new Pair("x-tt-env", forestEnvData.name);
                    for (Map.Entry entry2 : C2097608Jq.LJIIIIZZ(pairArr).entrySet()) {
                        if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, (String) entry2.getKey()) == null) {
                            builderBuildUpon.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("Parameter ");
                            sbLIZ4.append((String) entry2.getKey());
                            sbLIZ4.append(" of cdn-multiple-version already exists for ");
                            sbLIZ4.append(str);
                            sbLIZ4.append(", except:");
                            sbLIZ4.append((String) entry2.getValue());
                            sbLIZ4.append(", current:");
                            sbLIZ4.append(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, (String) entry2.getKey()));
                            sbLIZ4.append('.');
                            C1534250q1n.LJII("GeckoXAdapter", C2188811AlT.LIZIZ(sbLIZ4), false);
                        }
                    }
                }
                String host = uri.getHost();
                dealWithBoeDomainIfNeed(host);
                if (Intrinsics.LJFF(host, host)) {
                    return builderBuildUpon.build();
                }
                return builderBuildUpon.authority(host).build();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("build cdn-multiple-version for ");
                sbLIZ5.append(str);
                sbLIZ5.append(" failed, error: ");
                sbLIZ5.append(th.getMessage());
                C1534250q1n.LIZIZ("GeckoXAdapter", C2188811AlT.LIZIZ(sbLIZ5), null);
                return uri;
            }
        }

        public final void checkUpdate(Collection<UpdatePackage> collection, Map<String, Long> map, Forest forest) {
            HashMap map2 = new HashMap();
            for (UpdatePackage updatePackage : collection) {
                Long l = map.get(updatePackage.getChannel());
                if (l != null && l.longValue() < updatePackage.getVersion()) {
                    String accessKey = updatePackage.getAccessKey();
                    if (!map2.containsKey(accessKey)) {
                        map2.put(accessKey, new ArrayList());
                    }
                    List list = (List) map2.get(accessKey);
                    if (list != null) {
                        list.add(new CheckRequestBodyModel.TargetChannel(updatePackage.getChannel()));
                    }
                }
            }
            if (!map2.isEmpty()) {
                C1554340qYC c1554340qYC = new C1554340qYC(0);
                for (Map.Entry entry : map2.entrySet()) {
                    C1551950qUL normalGeckoXClient$forest_release = forest.getGeckoXAdapter().getNormalGeckoXClient$forest_release((String) entry.getKey());
                    if (normalGeckoXClient$forest_release != null) {
                        Map<String, List<CheckRequestBodyModel.TargetChannel>> mapLIZJ = C2097908Jt.LIZJ(new Pair(entry.getKey(), entry.getValue()));
                        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                        optionCheckUpdateParams.setListener(c1554340qYC);
                        optionCheckUpdateParams.setLazyUpdate(true);
                        normalGeckoXClient$forest_release.LIZ(null, mapLIZJ, optionCheckUpdateParams);
                    }
                }
            }
        }

        public final void lazyUpdate(Forest forest, Map<String, Long> map, boolean z) {
            C086F c086f = C086F.LIZ;
            ARunnableS23S0210000_23 aRunnableS23S0210000_23 = new ARunnableS23S0210000_23(forest, map, z, 0);
            c086f.getClass();
            C086F.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, aRunnableS23S0210000_23);
        }

        private final OptionCheckUpdateParams buildChannelOptionParams(GeckoXAdapter geckoXAdapter, C1533490q0Z c1533490q0Z, boolean z, AbstractC1552040qUU abstractC1552040qUU, boolean z2, boolean z3) {
            boolean z4;
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setCustomParam(geckoXAdapter.getCustomParams$forest_release(c1533490q0Z.LJJJJLI.LIZ));
            optionCheckUpdateParams.setListener(abstractC1552040qUU);
            optionCheckUpdateParams.setLazyUpdate(z);
            optionCheckUpdateParams.setLowStorageUpdate(z2);
            optionCheckUpdateParams.setIgnoreLowStorageLimit(z3);
            if (!c1533490q0Z.LJJJJLI.LIZLLL && !z2) {
                z4 = false;
            } else {
                z4 = true;
            }
            optionCheckUpdateParams.setWaitUpdate(z4);
            optionCheckUpdateParams.setEnableThrottle(getEnableThrottle$forest_release());
            optionCheckUpdateParams.setFrom("forest");
            if (c1533490q0Z.LJJJJLL) {
                optionCheckUpdateParams.setChannelUpdatePriority(3);
            }
            return optionCheckUpdateParams;
        }

        public final void checkUpdate(Forest forest, boolean z, final String str, C1533490q0Z c1533490q0Z, final InterfaceC1533390q0P interfaceC1533390q0P, boolean z2, boolean z3) {
            if (str != null && str.length() != 0) {
                final String str2 = c1533490q0Z.LJJJJLI.LIZ;
                AbstractC1552040qUU abstractC1552040qUU = new AbstractC1552040qUU() { // from class: X.0q0R
                    @Override // X.AbstractC1552040qUU
                    public final void LJIILLIIL(LocalPackageModel localPackageModel) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onLocalNewestVersion:localPackage:");
                        sbLIZ.append(localPackageModel);
                        C1534250q1n.LIZIZ("GeckoXAdapter", C2188811AlT.LIZIZ(sbLIZ), null);
                        InterfaceC1533390q0P interfaceC1533390q0P2 = interfaceC1533390q0P;
                        String str3 = str;
                        localPackageModel.getChannelPath();
                        interfaceC1533390q0P2.LIZIZ(Long.valueOf(localPackageModel.getLatestVersion()), str3);
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJII(Throwable th, Map map) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onCheckServerVersionFail:requestMap:");
                        sbLIZ.append(map);
                        C1534250q1n.LIZIZ("GeckoXAdapter", C2188811AlT.LIZIZ(sbLIZ), th);
                        InterfaceC1533390q0P interfaceC1533390q0P2 = interfaceC1533390q0P;
                        String str3 = str;
                        if (th == null) {
                            th = new Throwable("geckox update failed", th);
                        }
                        interfaceC1533390q0P2.LIZ(str3, th);
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIIIIZZ(Map<String, List<android.util.Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                        List<UpdatePackage> list;
                        List<android.util.Pair<String, Long>> list2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onCheckServerVersionSuccess:requestMap:");
                        sbLIZ.append(map);
                        sbLIZ.append(" responseMap:");
                        sbLIZ.append(map2);
                        C1534250q1n.LJII("GeckoXAdapter", C2188811AlT.LIZIZ(sbLIZ), false);
                        if (map != null && (list2 = map.get(str2)) != null) {
                            String str3 = str;
                            Iterator<android.util.Pair<String, Long>> it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                android.util.Pair<String, Long> next = it2.next();
                                if (Intrinsics.LJFF(next.first, str3)) {
                                    if (next != null) {
                                        return;
                                    }
                                }
                            }
                        }
                        if (map2 != null && (list = map2.get(str2)) != null) {
                            String str4 = str;
                            Iterator<UpdatePackage> it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                UpdatePackage next2 = it3.next();
                                if (Intrinsics.LJFF(next2.getChannel(), str4)) {
                                    if (next2 != null) {
                                        return;
                                    }
                                }
                            }
                        }
                        interfaceC1533390q0P.LIZ(str, new Throwable("invalid channel"));
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                        InterfaceC1533390q0P interfaceC1533390q0P2 = interfaceC1533390q0P;
                        String str3 = str;
                        if (th == null) {
                            th = new Throwable("geckox update failed", th);
                        }
                        interfaceC1533390q0P2.LIZ(str3, th);
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIL(long j, UpdatePackage updatePackage) {
                        String channel;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onUpdateSuccess:channel:");
                        if (updatePackage != null) {
                            channel = updatePackage.getChannel();
                        } else {
                            channel = null;
                        }
                        sbLIZ.append(channel);
                        sbLIZ.append(" version:");
                        sbLIZ.append(j);
                        C1534250q1n.LJII("GeckoXAdapter", C2188811AlT.LIZIZ(sbLIZ), false);
                        interfaceC1533390q0P.LIZIZ(Long.valueOf(j), str);
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJI(int i, Throwable th, Map map) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onCheckRequestIntercept:code:");
                        sbLIZ.append(i);
                        sbLIZ.append(" requestMap:");
                        sbLIZ.append(map);
                        C1534250q1n.LIZIZ("GeckoXAdapter", C2188811AlT.LIZIZ(sbLIZ), th);
                        interfaceC1533390q0P.LIZ(str, th);
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIIIZ(Map<String, List<android.util.Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2, C1551680qTu c1551680qTu) {
                        List<android.util.Pair<String, Long>> list;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onCheckServerVersionSuccess:requestMap:");
                        sbLIZ.append(map);
                        sbLIZ.append(" responseMap:");
                        sbLIZ.append(map2);
                        sbLIZ.append(" operation: ");
                        sbLIZ.append(c1551680qTu);
                        C1534250q1n.LJII("GeckoXAdapter", C2188811AlT.LIZIZ(sbLIZ), false);
                        if (map != null && (list = map.get(str2)) != null) {
                            String str3 = str;
                            Iterator<android.util.Pair<String, Long>> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                android.util.Pair<String, Long> next = it2.next();
                                if (Intrinsics.LJFF(next.first, str3)) {
                                    if (next != null) {
                                        return;
                                    }
                                }
                            }
                        }
                        List list2 = (List) ((HashMap) map2).get(str2);
                        if (list2 != null) {
                            String str4 = str;
                            Iterator it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (Intrinsics.LJFF(((UpdatePackage) next2).getChannel(), str4)) {
                                    if (next2 != null) {
                                        return;
                                    }
                                }
                            }
                        }
                        interfaceC1533390q0P.LIZ(str, new Throwable("invalid channel"));
                    }
                };
                GeckoXAdapter geckoXAdapter = forest.getGeckoXAdapter();
                C1551950qUL normalGeckoXClient$forest_release = geckoXAdapter.getNormalGeckoXClient$forest_release(c1533490q0Z);
                if (normalGeckoXClient$forest_release != null) {
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new CheckRequestBodyModel.TargetChannel(str));
                    map.put(str2, arrayList);
                    normalGeckoXClient$forest_release.LIZ(null, map, buildChannelOptionParams(geckoXAdapter, c1533490q0Z, z, abstractC1552040qUU, z2, z3));
                    return;
                }
                interfaceC1533390q0P.LIZ(str, new Throwable("GeckoXClient is null"));
                return;
            }
            interfaceC1533390q0P.LIZ("", new Exception("update failed because channel is null"));
        }
    }

    public final Application getApp() {
        return this.app;
    }

    private final C1551950qUL initGeckoXMultiClient(String str) {
        long jLongValue;
        C1537050q6J.LIZ.getClass();
        C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(str);
        if (c1551950qULLIZ != null) {
            return c1551950qULLIZ;
        }
        C1533570q0h c1533570q0hLIZIZ = this.forestConfig.LIZIZ(str);
        C1551950qUL c1551950qULLIZLLL = null;
        if (c1533570q0hLIZIZ == null) {
            return null;
        }
        String str2 = c1533570q0hLIZIZ.LJ;
        if (str2 == null) {
            str2 = "";
        }
        File geckoXOfflineRootDirFileWithoutAccessKey = getGeckoXOfflineRootDirFileWithoutAccessKey(c1533570q0hLIZIZ.LIZIZ, c1533570q0hLIZIZ.LJI);
        try {
            C1537040q6I c1537040q6I = new C1537040q6I(this.app);
            c1537040q6I.LJIIIZ = this.forestConfig.LIZ;
            Long l = c1533570q0hLIZIZ.LIZJ;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            c1537040q6I.LIZJ(jLongValue);
            c1537040q6I.LJII = c1533570q0hLIZIZ.LIZLLL;
            c1537040q6I.LIZ = c1533570q0hLIZIZ.LJII;
            c1537040q6I.LJFF = c1533570q0hLIZIZ.LJIIIIZZ;
            c1537040q6I.LJ = this.mStatisticMonitor;
            c1537040q6I.LJIIJJI = c1533570q0hLIZIZ.LJFF;
            c1537040q6I.LIZ(str);
            c1537040q6I.LIZIZ(str);
            c1537040q6I.LJIIIIZZ = str2;
            c1537040q6I.LJIIJ = geckoXOfflineRootDirFileWithoutAccessKey;
            c1551950qULLIZLLL = C1551950qUL.LIZLLL(new C1551530qTf(c1537040q6I));
            return c1551950qULLIZLLL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1534250q1n.LIZIZ("GeckoXAdapter", "GeckoClient.create error", e);
            return c1551950qULLIZLLL;
        }
    }

    public final Map<String, Map<String, String>> getCustomParams$forest_release(String str) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = "";
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C1533570q0h c1533570q0hLIZIZ = this.forestConfig.LIZIZ(str);
        if (c1533570q0hLIZIZ != null) {
            String str4 = c1533570q0hLIZIZ.LJIIIZ;
            if (str4 == null) {
                String str5 = c1533570q0hLIZIZ.LIZLLL;
                if (str5 != null) {
                    str3 = str5;
                }
            } else {
                str3 = str4;
            }
            linkedHashMap2.put("business_version", str3);
        }
        linkedHashMap.put(str2, linkedHashMap2);
        return linkedHashMap;
    }

    public final C1551950qUL getNormalGeckoXClient$forest_release(String str) {
        C1551950qUL c1551950qUL = this.geckoClients.get(str);
        if (c1551950qUL == null) {
            C1551950qUL c1551950qULInitGeckoXMultiClient = initGeckoXMultiClient(str);
            this.geckoClients.put(str, c1551950qULInitGeckoXMultiClient);
            return c1551950qULInitGeckoXMultiClient;
        }
        return c1551950qUL;
    }

    public final boolean isGeckoCDNAndMergeConfig(C1533490q0Z c1533490q0Z) {
        GlobalConfigSettings.ResourceMeta resourceMeta;
        GlobalConfigSettings globalConfigSettingsLJI = C797990VSb.LIZ.LJI();
        if (globalConfigSettingsLJI != null && (resourceMeta = globalConfigSettingsLJI.getResourceMeta()) != null) {
            return isGeckoCDNAndMergeConfig(c1533490q0Z, resourceMeta);
        }
        C1534250q1n.LIZIZ(null, "could not get any valid resource meta", null);
        return false;
    }

    public final C1551950qUL getNormalGeckoXClient$forest_release(C1533490q0Z c1533490q0Z) {
        return getNormalGeckoXClient$forest_release(c1533490q0Z.LJJJJLI.LIZ);
    }

    public GeckoXAdapter(Application application, Forest forest) {
        this.app = application;
        this.forest = forest;
        this.forestConfig = forest.getConfig();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014b A[LOOP:2: B:81:0x0143->B:83:0x014b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isGeckoCDNAndMergeConfig(X.C1533490q0Z r15, com.bytedance.geckox.settings.model.GlobalConfigSettings.ResourceMeta r16) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.forest.chain.fetchers.GeckoXAdapter.isGeckoCDNAndMergeConfig(X.0q0Z, com.bytedance.geckox.settings.model.GlobalConfigSettings$ResourceMeta):boolean");
    }

    public final boolean checkChannelExists(String str, String str2) {
        C1533570q0h c1533570q0hLIZIZ;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (c1533570q0hLIZIZ = this.forestConfig.LIZIZ(str)) == null) {
            return false;
        }
        getGeckoXOfflineRootDirFileWithoutAccessKey(c1533570q0hLIZIZ.LIZIZ, c1533570q0hLIZIZ.LJI);
        if (C1550610qSB.LIZJ(str, str2) == null) {
            return false;
        }
        return true;
    }

    public final void doGeckoStatistics$forest_release(String str, String str2) {
        C1550600qSA c1550600qSA = C1550600qSA.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkExistOpt called for ak: ");
        sbLIZ.append(str);
        sbLIZ.append(", channel: ");
        sbLIZ.append(str2);
        C1553130qWF.LIZ("gecko-debug-tag-res_load_new", C2188811AlT.LIZIZ(sbLIZ));
        C1550730qSN.LJI(str, str2, AFwS263S0000000_23.get$arr$(61));
        C1550600qSA.LIZ(str, str2);
    }

    public final File getGeckoXOfflineRootDirFileWithoutAccessKey(String str, boolean z) {
        if (!z) {
            return new C0VSJ(str);
        }
        if (this.appFileDir == null) {
            this.appFileDir = this.app.getFilesDir();
        }
        try {
            C0VSJ c0vsj = new C0VSJ(this.appFileDir, str);
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
                return c0vsj;
            }
            return c0vsj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new C0VSJ(str);
        }
    }

    @InterfaceC1294060jmO
    public final boolean checkIsExists(String str, String str2, String str3) {
        C1533570q0h c1533570q0hLIZIZ;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || (c1533570q0hLIZIZ = this.forestConfig.LIZIZ(str2)) == null) {
            return false;
        }
        getGeckoXOfflineRootDirFileWithoutAccessKey(str, c1533570q0hLIZIZ.LJI);
        if (C1550610qSB.LIZJ(str2, str3) == null) {
            return false;
        }
        return true;
    }

    private final Pair<String, Long> getPathByLoader(String str, String str2, String str3, String str4) {
        try {
            C1533370q0N sessionManager$forest_release = this.forest.getSessionManager$forest_release();
            sessionManager$forest_release.getClass();
            Pair pair = new Pair(str, str2);
            LinkedHashMap linkedHashMap = (LinkedHashMap) sessionManager$forest_release.LIZIZ;
            C0VSZ c0vsz = (C0VSZ) linkedHashMap.get(pair);
            if (c0vsz == null) {
                c0vsz = new C0VSZ(sessionManager$forest_release.LIZ, str2);
                linkedHashMap.put(pair, c0vsz);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            sbLIZ.append(File.separator);
            sbLIZ.append(str4);
            return new Pair<>(c0vsz.LIZIZ(C2188811AlT.LIZIZ(sbLIZ)), (Long) ((HashMap) c0vsz.LIZ.LIZJ()).get(str3));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1534250q1n.LIZIZ("GeckoXAdapter", "getPathByLoader error", e);
            return null;
        }
    }

    public final String getGeckoResourcePath(C1533790q13 c1533790q13, String str, String str2, String str3) {
        boolean z;
        long jLongValue;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Long l = null;
        String first = null;
        if (z || str2.length() == 0 || str3.length() == 0) {
            return null;
        }
        String str4 = c1533790q13.LIZ.LJJJI;
        if (str4 != null) {
            Pair<String, Long> pathByLoader = getPathByLoader(str4, str, str2, str3);
            if (pathByLoader != null) {
                first = pathByLoader.getFirst();
                jLongValue = pathByLoader.getSecond().longValue();
            } else {
                jLongValue = 0;
            }
            c1533790q13.LJIIIZ = jLongValue;
            return first;
        }
        if (this.forestConfig.LIZIZ(str) == null) {
            return null;
        }
        C086F.LIZ.getClass();
        if (C086F.LIZ()) {
            l = 200L;
        }
        if (c1533790q13.LIZ.LJIIJJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1550600qSA.LIZLLL(str, l, false, str2));
            sbLIZ.append(File.separator);
            sbLIZ.append(a0.LJJJJZ("/", str3));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C1550600qSA.LIZLLL(str, l, true, str2));
        sbLIZ2.append(File.separator);
        sbLIZ2.append(a0.LJJJJZ("/", str3));
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @InterfaceC1294060jmO
    public final String getGeckoResourcePath(C1533790q13 c1533790q13, String str, String str2, String str3, String str4) {
        boolean z;
        long jLongValue;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String first = null;
        if (z || str3.length() == 0 || str4.length() == 0) {
            return null;
        }
        String str5 = c1533790q13.LIZ.LJJJI;
        if (str5 != null) {
            Pair<String, Long> pathByLoader = getPathByLoader(str5, str2, str3, str4);
            if (pathByLoader != null) {
                first = pathByLoader.getFirst();
                jLongValue = pathByLoader.getSecond().longValue();
            } else {
                jLongValue = 0;
            }
            c1533790q13.LJIIIZ = jLongValue;
            return first;
        }
        if (this.forestConfig.LIZIZ(str2) == null) {
            return null;
        }
        if (c1533790q13.LIZ.LJIIJJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1550600qSA.LIZLLL(str2, null, false, str3));
            sbLIZ.append(File.separator);
            sbLIZ.append(a0.LJJJJZ("/", str4));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C1550600qSA.LIZLLL(str2, null, true, str3));
        sbLIZ2.append(File.separator);
        sbLIZ2.append(a0.LJJJJZ("/", str4));
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
