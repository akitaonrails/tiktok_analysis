package ttpobfuscated;

import X.C13LP;
import X.C1697810uHb;
import X.C1954807lC;
import X.C2097608Jq;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ttp.orbu.sdk.configuration.model.Config;
import ttp.orbu.sdk.configuration.model.ConfigType;
import ttp.orbu.sdk.configuration.model.EventSetting;
import ttp.orbu.sdk.configuration.model.FeatureSetting;
import ttp.orbu.sdk.configuration.model.GeckoValidation;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.OrbuCodeConfig;
import ttp.orbu.sdk.configuration.model.ServerAPIType;
import ttp.orbu.sdk.configuration.model.ServerConfig;
import ttp.orbu.sdk.configuration.model.SessionIdHeaderFrequency;
import ttp.orbu.sdk.configuration.model.UnhandledReturnStrategy;
import ttp.orbu.sdk.requestvalidator.OrbuResult;
import ttpobfuscated.q3;
import ttpobfuscated.zb;

/* JADX INFO: loaded from: classes24.dex */
public final class x implements s3 {
    public static final x a = new x();
    public static final List<String> c;
    public static final Map<String, FeatureSetting> d;
    public static final GeneralConfig e;
    public static final OrbuCodeConfig f;

    static {
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("US", "PR", "GU", "MP", "VI", "AS");
        c = listLJIIJJI;
        Map<String, FeatureSetting> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("pki", new FeatureSetting("pki", false)), new Pair("adaptiveConfigDelay", new FeatureSetting("adaptiveConfigDelay", true)), new Pair("network", new FeatureSetting("network", true)), new Pair("web", new FeatureSetting("web", true)), new Pair("webrouter", new FeatureSetting("webrouter", true)), new Pair("apptoapp", new FeatureSetting("apptoapp", true)), new Pair("settings", new FeatureSetting("settings", true)), new Pair("sdk", new FeatureSetting("sdk", true)), new Pair("systemAPI", new FeatureSetting("systemAPI", true)), new Pair("liveSei", new FeatureSetting("liveSei", true)), new Pair("liveVideo", new FeatureSetting("liveVideo", true)), new Pair("liveAudio", new FeatureSetting("liveAudio", true)), new Pair("gecko", new FeatureSetting("gecko", true)), new Pair("crashLogs", new FeatureSetting("crashLogs", false)));
        d = mapLJIIJ;
        List listLLIIII = C13LP.LLIIII(((LinkedHashMap) mapLJIIJ).values());
        EventSetting eventSetting = new EventSetting("activation", zb.d.h, 2);
        EventSetting eventSetting2 = new EventSetting("heartbeat", new zb.f(604800000L), 2);
        zb.a aVar = zb.a.h;
        List listLJIIJJI2 = C1697810uHb.LJIIJJI(eventSetting, eventSetting2, new EventSetting("bundleValidation", aVar, 2), new EventSetting("invalidSignature", aVar, 2), new EventSetting("configuration", new zb.e(LSPassThroughRecordSizeConfig.DEFAULT), 2), new EventSetting("compromisedDb", aVar, 2), new EventSetting("sample", aVar, 1), new EventSetting("orbuCodeLog", aVar, 2), new EventSetting("cleanup", aVar, 2));
        SessionIdHeaderFrequency sessionIdHeaderFrequency = SessionIdHeaderFrequency.HeartbeatOnly;
        ServerAPIType serverAPIType = ServerAPIType.LOGGING;
        ServerConfig serverConfig = new ServerConfig(serverAPIType, serverAPIType.getBaseUrl(), 30000, 32768, serverAPIType.getDefaultServiceDeferIntervalInSeconds(), "v1");
        ServerAPIType serverAPIType2 = ServerAPIType.SAMPLING;
        ServerConfig serverConfig2 = new ServerConfig(serverAPIType2, serverAPIType2.getBaseUrl(), 30000, 10485760, serverAPIType2.getDefaultServiceDeferIntervalInSeconds(), "v1");
        ServerAPIType serverAPIType3 = ServerAPIType.PKI;
        ServerConfig serverConfig3 = new ServerConfig(serverAPIType3, serverAPIType3.getBaseUrl(), 30000, 0, serverAPIType3.getDefaultServiceDeferIntervalInSeconds(), serverAPIType3.getDefaultApiVersionPathParameter());
        ServerAPIType serverAPIType4 = ServerAPIType.CONFIGURATION;
        List listLJIIJJI3 = C1697810uHb.LJIIJJI(serverConfig, serverConfig2, serverConfig3, new ServerConfig(serverAPIType4, serverAPIType4.getBaseUrl(), 30000, 0, serverAPIType4.getDefaultServiceDeferIntervalInSeconds(), serverAPIType4.getDefaultApiVersionPathParameter()));
        q3.a.getClass();
        e = new GeneralConfig(-1, ConfigType.General.INSTANCE, 10000L, listLLIIII, listLJIIJJI2, sessionIdHeaderFrequency, listLJIIJJI, listLJIIJJI3, 28800000L, false, q3.a.d ? "testLogId1" : "logId1", GeckoValidation.PRODUCTION, 1016, new gc(k0.None, 120000L), new u5(20, -1.0d), C2097608Jq.LJIIIIZZ(new Pair(new IntRange(10, 20), 140000L), new Pair(new IntRange(20, 30), 60000L), new Pair(new IntRange(30, 40), 20000L), new Pair(new IntRange(40, Integer.MAX_VALUE), 10000L)), 90);
        f = new OrbuCodeConfig(-1, ConfigType.OrbuCode.INSTANCE, "T3JidUNvZGUBAQIAgAAAAAgAAACIAAAA2AAAAGABAAA0AAAA//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////8EAAAAYAAAAAEAAQAAAAEAAAAAAAQAAAAAAAAAAAAAANAAKwAAAEAEsAsAAAAAAAAAAAAAAAAAANRmJwARAIABAAAAAAAAAAAAAAAAAAAAAPAAAgAAAAAAAAAAAAAAAAAAAAAAAAAAAAEAAQAAAAAAAAAAAAUAAAAAAAAAAAAAANAALAAXAMADAwAAAKzFJzcAAAAAAAAAANAALAAmAIADAwAAAKzFJzcAAAAAAAAAANAALAAAAEAEAwAAAKzFJzcAAAAAAAAAAPAAAgAAAAAAAAAAAAAAAAAAAAAAAAAAAHR0LmRlZmF1bHQuc2FtcGxlb3NOYW1lcmVxdWVzdC5pbnZhbGlkdHQuZGVmYXVsdC5sb2c=", "d083d0da9c86efdec76d7a3e529d418482b2ac25130442ea385458b8bf9338e", new UnhandledReturnStrategy(OrbuResult.a.a, false), 20);
    }

    public final Map<String, FeatureSetting> a() {
        return d;
    }

    @Override // ttpobfuscated.s3
    public Config a(ConfigType configType) {
        if (Intrinsics.LJFF(configType, ConfigType.General.INSTANCE)) {
            return e;
        }
        if (Intrinsics.LJFF(configType, ConfigType.OrbuCode.INSTANCE)) {
            return f;
        }
        throw new C1954807lC();
    }
}
