package com.ss.android.ugc.aweme.live.livehostimpl;

import X.AbstractC2343909Gj;
import X.AbstractC842530X3j;
import X.C09S8;
import X.C0CSC;
import X.C0J62;
import X.C0K8R;
import X.C0UC2;
import X.C0WKN;
import X.C0WKO;
import X.C0X0P;
import X.C0X9S;
import X.C0XDN;
import X.C0XHR;
import X.C10EU;
import X.C1161920gLG;
import X.C1490190osj;
import X.C1499670p81;
import X.C1499850p8J;
import X.C1500830p9t;
import X.C1500860p9w;
import X.C1515210pX5;
import X.C1519610peB;
import X.C1519640peE;
import X.C1519650peF;
import X.C1527960pre;
import X.C1527980prg;
import X.C1528270ps9;
import X.C1803890x2h;
import X.C1834180xpY;
import X.C1861507Qv;
import X.C1904507d5;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2203431BLp;
import X.C2262581DhA;
import X.C477600IoA;
import X.C477630IoD;
import X.C481710Iun;
import X.C520610KbL;
import X.C793770VBv;
import X.C794240VDq;
import X.C821300WJs;
import X.C821310WJt;
import X.C844470XAv;
import X.EnumC2262571Dh9;
import X.EnumC325100Com;
import X.EnumC784160UpS;
import X.InterfaceC1528010prj;
import X.InterfaceC1904907d9;
import X.InterfaceC2221911Bxl;
import X.InterfaceC742680TBi;
import X.InterfaceC784190UpV;
import X.InterfaceC810750VrF;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutLandingBySkylightRoomSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageEnableWSChannelDestroyTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageOverridePPUrlSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageOverrideWsUrlSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessagePPTransportSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessagePrivateProtocolSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTimeoutSettingAnchor;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFeedFeaturesAddExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInjectLiveFeatureSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.LiveDispatchConfig;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.api.TTLiveThirdPartyApi;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostNetwork;
import com.ss.android.ugc.aweme.live.strategy.FeedFeatureUpdateInterceptor;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.net.control.DispatchConfig;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.ttlive.ILiveApi;
import com.ss.android.ugc.aweme.websocket.api.service.IWsServiceProvider;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class LiveHostNetwork implements IHostNetwork {
    public volatile ILiveApi LL;
    public final HashMap<Integer, C0CSC> LLILLJJLI = new HashMap<>();

    public final ILiveApi LIZIZ() {
        if (this.LL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://");
            sbLIZ.append("api-va.tiktokv.com");
            this.LL = (ILiveApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C2188811AlT.LIZIZ(sbLIZ)).build().retrofit.LIZ(ILiveApi.class);
        }
        return this.LL;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final InterfaceC742680TBi generateDualDeviceSignalManager() {
        return new C0J62();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final Map<String, String> getCommonParams() {
        HashMap map = new HashMap();
        C0XDN.LIZJ(map, false);
        return map;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final InterfaceC1904907d9 getFeedFeaturesUpdateInterceptor() {
        return new FeedFeatureUpdateInterceptor();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final int getNetworkState() {
        INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi(INetworkStateService.class);
        if (iNetworkStateService != null) {
            return iNetworkStateService.getEffectiveConnectionType();
        }
        return -1;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final boolean isWsConnected() {
        IWsServiceProvider iWsServiceProvider = (IWsServiceProvider) PluggableExtentionKt.pluggableSpi(IWsServiceProvider.class);
        if (iWsServiceProvider != null) {
            return iWsServiceProvider.LIZ().isConnected();
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void registerHostWS() {
        C1527960pre c1527960pre = C1527960pre.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerWs: service=");
        int i = C1527960pre.LLILLJJLI;
        sbLIZ.append(i);
        sbLIZ.append(", method=");
        int i2 = C1527960pre.LLILLL;
        sbLIZ.append(i2);
        C20441214yg.LJIIIZ("LiveHostWsMessageListener", C2188811AlT.LIZIZ(sbLIZ));
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        c2203431BLp.LIZLLL(c1527960pre);
        c2203431BLp.LJI(i, i2, c1527960pre);
        if (HangoutLandingBySkylightRoomSetting.INSTANCE.getValue() && !C477600IoA.LIZ) {
            C477630IoD.LIZ.LIZLLL(C477600IoA.LJ);
            C477600IoA.LIZ = true;
            C20441214yg.LIZIZ("legolas_im", "HangoutLandingMessage registerHandlerIfNeeded success");
        }
        C1834180xpY c1834180xpY = C1834180xpY.LL;
        c1834180xpY.getClass();
        c2203431BLp.LJI(50331702, 1, c1834180xpY);
        c2203431BLp.LJI(50331702, 2, c1834180xpY);
        c2203431BLp.LJI(134217737, -10000, c1834180xpY);
        c2203431BLp.LJI(134217736, -10000, c1834180xpY);
        C1519650peF c1519650peF = C1519650peF.LL;
        c2203431BLp.LIZLLL(c1519650peF);
        c2203431BLp.LJI(16778115, 1, c1519650peF);
        c2203431BLp.LJI(16778115, 2, c1519650peF);
        C1803890x2h c1803890x2h = C1803890x2h.LL;
        synchronized (c1803890x2h) {
            if (!C1803890x2h.LLILLJJLI) {
                c2203431BLp.LJI(67108928, 671089281, c1803890x2h);
                C1803890x2h.LLILLJJLI = true;
            }
        }
        C1519640peE.LL.LIZJ();
        C481710Iun.LIZJ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String getHostDomain() {
        return Live.getLiveDomain();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final Retrofit getHostRetrofit() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C2188811AlT.LIZIZ(sbLIZ));
        C1515210pX5.LIZLLL().getClass();
        c1499850p8JCreateBuilder.LIZ(C1515210pX5.LJ());
        C1515210pX5.LIZLLL().getClass();
        c1499850p8JCreateBuilder.LIZ(C1515210pX5.LJFF());
        return C1499670p81.LIZIZ.LIZ(c1499850p8JCreateBuilder.build());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String getHostWebSocketDomain() {
        return Live.getLiveWebSocketDomain();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String getKYCHostDomain() {
        return Live.getKYCDomain();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final Retrofit getKYCRetrofit() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(getKYCHostDomain());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1515210pX5.LIZLLL().getClass();
        List<C09S8> listLr2 = ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).lr2(true);
        C1515210pX5.LIZLLL().getClass();
        List<AbstractC2343909Gj> listMk1 = ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).mk1();
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(strLIZIZ);
        Iterator<C09S8> it2 = listLr2.iterator();
        while (it2.hasNext()) {
            c1499850p8JCreateBuilder.LJI(it2.next());
        }
        Iterator<AbstractC2343909Gj> it3 = listMk1.iterator();
        while (it3.hasNext()) {
            c1499850p8JCreateBuilder.LIZJ(it3.next());
        }
        C1515210pX5.LIZLLL().getClass();
        c1499850p8JCreateBuilder.LIZ(C1515210pX5.LJ());
        C1515210pX5.LIZLLL().getClass();
        c1499850p8JCreateBuilder.LIZ(C1515210pX5.LJFF());
        return C1499670p81.LIZIZ.LIZ(c1499850p8JCreateBuilder.build());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final EnumC784160UpS getTTNetworkStatus() {
        return LIZLLL(((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getNetworkStatus());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String getApiHost() {
        return "api-va.tiktokv.com";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C0UC2 getLiveHostWsManager() {
        return C1528270ps9.LL;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void syncShareCookieToTarget() {
        Live.syncShareCookieToTarget();
    }

    public static Map<String, String> LIZ(List<C520610KbL> list) {
        HashMap map = new HashMap();
        if (list != null) {
            for (C520610KbL c520610KbL : list) {
                map.put(c520610KbL.getName(), c520610KbL.getValue());
            }
        }
        return map;
    }

    public static EnumC784160UpS LIZLLL(EnumC325100Com enumC325100Com) {
        EnumC784160UpS enumC784160UpS = EnumC784160UpS.STRONG;
        int i = C0XHR.LIZIZ[enumC325100Com.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return EnumC784160UpS.NOT_AVAILABLE;
                }
            } else {
                return EnumC784160UpS.WEAK;
            }
        }
        return enumC784160UpS;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String executeGet(String str) {
        try {
            return NetworkUtils.executeGet(0, str, false, false, null, null, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final Retrofit getCustomHostRetrofit(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1515210pX5.LIZLLL().getClass();
        List<C09S8> listLr2 = ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).lr2(true);
        C1515210pX5.LIZLLL().getClass();
        List<AbstractC2343909Gj> listMk1 = ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).mk1();
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(strLIZIZ);
        Iterator<C09S8> it2 = listLr2.iterator();
        while (it2.hasNext()) {
            c1499850p8JCreateBuilder.LJI(it2.next());
        }
        Iterator<AbstractC2343909Gj> it3 = listMk1.iterator();
        while (it3.hasNext()) {
            c1499850p8JCreateBuilder.LIZJ(it3.next());
        }
        C1515210pX5.LIZLLL().getClass();
        c1499850p8JCreateBuilder.LIZ(C1515210pX5.LJ());
        C1515210pX5.LIZLLL().getClass();
        c1499850p8JCreateBuilder.LIZ(C1515210pX5.LJFF());
        return C1499670p81.LIZIZ.LIZ(c1499850p8JCreateBuilder.build());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final Retrofit getHostRetrofitWithApiHost(String str) {
        return C1499670p81.LIZIZ.LIZ(((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str).build());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final Retrofit getLiveRetrofit(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(getHostDomain());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1515210pX5.LIZLLL().getClass();
        List<C09S8> listLr2 = ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).lr2(z);
        C1515210pX5.LIZLLL().getClass();
        List<AbstractC2343909Gj> listMk1 = ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).mk1();
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(strLIZIZ);
        Iterator<C09S8> it2 = listLr2.iterator();
        while (it2.hasNext()) {
            c1499850p8JCreateBuilder.LJI(it2.next());
        }
        Iterator<AbstractC2343909Gj> it3 = listMk1.iterator();
        while (it3.hasNext()) {
            c1499850p8JCreateBuilder.LIZJ(it3.next());
        }
        if (LiveInjectLiveFeatureSetting.INSTANCE.injectEnable()) {
            C1515210pX5.LIZLLL().getClass();
            c1499850p8JCreateBuilder.LIZ(((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).kR0());
        }
        if (LiveFeedFeaturesAddExp.isEnable()) {
            c1499850p8JCreateBuilder.LIZ(new FeedFeatureUpdateInterceptor());
        }
        C1515210pX5.LIZLLL().getClass();
        c1499850p8JCreateBuilder.LIZ(C1515210pX5.LJ());
        C1515210pX5.LIZLLL().getClass();
        c1499850p8JCreateBuilder.LIZ(C1515210pX5.LJFF());
        return C1499670p81.LIZIZ.LIZ(c1499850p8JCreateBuilder.build());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void minorModeInterceptMonitor(String str) {
        if (C10EU.LJIIIIZZ()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("url", str);
                jSONObject.putOpt("source", "livesdk");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("ttlive_minor_mode_live", 1, jSONObject);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void observerNetworkChange(final InterfaceC784190UpV interfaceC784190UpV) {
        if (interfaceC784190UpV != null) {
            interfaceC784190UpV.LIZ(LIZLLL(((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getNetworkStatus()));
            C0CSC c0csc = new C0CSC() { // from class: X.0peA
                @Override // X.C0CSC
                public final void LIZ(EnumC325100Com enumC325100Com) {
                    LiveHostNetwork liveHostNetwork = this.LIZ;
                    InterfaceC784190UpV interfaceC784190UpV2 = interfaceC784190UpV;
                    liveHostNetwork.getClass();
                    interfaceC784190UpV2.LIZ(LiveHostNetwork.LIZLLL(enumC325100Com));
                }
            };
            ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).observerNetworkChange(c0csc);
            this.LLILLJJLI.put(Integer.valueOf(interfaceC784190UpV.hashCode()), c0csc);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void removeNetworkChangeObserver(InterfaceC784190UpV interfaceC784190UpV) {
        if (interfaceC784190UpV != null) {
            int iHashCode = interfaceC784190UpV.hashCode();
            C0CSC c0csc = this.LLILLJJLI.get(Integer.valueOf(iHashCode));
            if (c0csc != null) {
                this.LLILLJJLI.remove(Integer.valueOf(iHashCode));
                ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).removeNetworkChangeObserver(c0csc);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void unRegisterNetworkControl(String str) {
        EnumC2262571Dh9 enumC2262571Dh9LIZ = C2262581DhA.LIZ(str);
        if (enumC2262571Dh9LIZ != null) {
            C1490190osj c1490190osj = C1490190osj.LIZIZ;
            c1490190osj.LIZJ(enumC2262571Dh9LIZ);
            c1490190osj.LIZLLL(enumC2262571Dh9LIZ);
        }
    }

    public static String LIZJ(String str, String str2) {
        try {
            URI uri = new URI(str);
            URI uri2 = new URI(uri.getScheme().toLowerCase(Locale.US), str2, uri.getPath(), uri.getQuery(), uri.getFragment());
            int port = uri2.getPort();
            if (port > 0 && port == uri2.toURL().getDefaultPort()) {
                uri2 = new URI(uri2.getScheme(), uri2.getUserInfo(), uri2.getHost(), -1, uri2.getPath(), uri2.getQuery(), uri2.getFragment());
            }
            return uri2.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C0X9S<TypedInput> do3rdPartGet(String str, Map<String, String> map) {
        return ((TTLiveThirdPartyApi) ((I3rdRetrofitFactory) ServiceManager.get().getService(I3rdRetrofitFactory.class)).create().create(TTLiveThirdPartyApi.class)).doGet(str, map);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void registerNetworkControl(String str, LiveDispatchConfig liveDispatchConfig) {
        EnumC2262571Dh9 enumC2262571Dh9LIZ = C2262581DhA.LIZ(str);
        String sceneName = liveDispatchConfig.getSceneName();
        int delayDisableTimeMs = liveDispatchConfig.getDelayDisableTimeMs();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(liveDispatchConfig.getDropList());
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(liveDispatchConfig.getBlackList());
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.addAll(liveDispatchConfig.getWhiteList());
        int maxDelayTimeMs = liveDispatchConfig.getMaxDelayTimeMs();
        int sparseSendIntervalMs = liveDispatchConfig.getSparseSendIntervalMs();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.addAll(liveDispatchConfig.getHighPriorityApis());
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.addAll(liveDispatchConfig.getDefaultPriorityApis());
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.addAll(liveDispatchConfig.getLowPriorityApis());
        Map<String, Integer> throttleConfigByPath = liveDispatchConfig.getThrottleConfigByPath();
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.addAll(liveDispatchConfig.getApiThrottleLimitedDomainList());
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.addAll(liveDispatchConfig.getWsThrottleLimitedDomainList());
        DispatchConfig dispatchConfig = new DispatchConfig(sceneName, delayDisableTimeMs, linkedHashSet, linkedHashSet2, linkedHashSet3, maxDelayTimeMs, sparseSendIntervalMs, linkedHashSet4, linkedHashSet5, linkedHashSet6, throttleConfigByPath, linkedHashSet7, linkedHashSet8);
        if (enumC2262571Dh9LIZ != null) {
            C1490190osj c1490190osj = C1490190osj.LIZIZ;
            c1490190osj.LIZIZ(enumC2262571Dh9LIZ, dispatchConfig);
            c1490190osj.LIZ(enumC2262571Dh9LIZ);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C0K8R<C1500830p9t> get(String str, List<C520610KbL> list, Object obj) {
        Map<String, String> mapLIZ = LIZ(list);
        C1904507d5.LIZJ(str, mapLIZ);
        C0X9S<TypedInput> c0x9s = LIZIZ().get(str, mapLIZ, obj);
        minorModeInterceptMonitor(str);
        return new C1500860p9w(c0x9s);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void registerHostWS(int i, int i2, InterfaceC1528010prj interfaceC1528010prj) {
        synchronized (C1861507Qv.LIZ) {
            Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
            C1490190osj.LIZIZ.LJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register serviceId: ");
            sbLIZ.append(i);
            sbLIZ.append(" methodId: ");
            sbLIZ.append(i2);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("LiveHostNetworkWs", C2188811AlT.LIZIZ(sbLIZ));
            HashMap<Pair<Integer, Integer>, Pair<C1527980prg, C1519610peB>> map = C1861507Qv.LIZIZ;
            if (!map.containsKey(pair)) {
                C1519610peB c1519610peB = new C1519610peB();
                C1527980prg c1527980prg = new C1527980prg(c1519610peB);
                map.put(pair, new Pair<>(c1527980prg, c1519610peB));
                C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
                c2203431BLp.LIZLLL(c1527980prg);
                c2203431BLp.LJI(i, i2, c1527980prg);
            }
            Pair<C1527980prg, C1519610peB> pair2 = map.get(pair);
            if (pair2 == null) {
                return;
            }
            C1519610peB second = pair2.getSecond();
            if (interfaceC1528010prj == null) {
                second.getClass();
            } else {
                second.LIZ.LIZJ(interfaceC1528010prj);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void unRegisterHostWS(int i, int i2, InterfaceC1528010prj interfaceC1528010prj) {
        synchronized (C1861507Qv.LIZ) {
            Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
            HashMap<Pair<Integer, Integer>, Pair<C1527980prg, C1519610peB>> map = C1861507Qv.LIZIZ;
            Pair<C1527980prg, C1519610peB> pair2 = map.get(pair);
            if (pair2 == null) {
                return;
            }
            C1527980prg first = pair2.getFirst();
            C1519610peB second = pair2.getSecond();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unregister serviceId: ");
            sbLIZ.append(i);
            sbLIZ.append(" methodId: ");
            sbLIZ.append(i2);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("LiveHostNetworkWs", C2188811AlT.LIZIZ(sbLIZ));
            if (interfaceC1528010prj != null) {
                second.LIZ.LJ(interfaceC1528010prj);
            } else {
                second.getClass();
            }
            if (second.LIZ.isEmpty()) {
                map.remove(pair);
                C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
                c2203431BLp.LJIIJJI(first);
                c2203431BLp.LJIIIZ(first);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C0X9S<TypedInput> do3rdPartPost(String str, Map<String, String> map, String str2, byte[] bArr) {
        return ((TTLiveThirdPartyApi) ((I3rdRetrofitFactory) ServiceManager.get().getService(I3rdRetrofitFactory.class)).create().create(TTLiveThirdPartyApi.class)).doPost(str, map, AbstractC842530X3j.LIZLLL(C0X0P.LIZJ(str2), bArr));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final InterfaceC2221911Bxl registerWsChannel(Context context, String str, Map<String, String> map, final InterfaceC1528010prj interfaceC1528010prj) {
        String strValueOf;
        C0WKO c0wko;
        long wsConnectTimeout;
        LocalTestApi localTestApi;
        map.put("sid", AppLog.getSessionKey());
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            str = builderBuildUpon.build().toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        String strLIZJ = LIZJ(str, "webcast-frontier.tiktokv.com");
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isBoe() && (localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)) != null && localTestApi.getLiveBoeWsDomainNewFrontier() != null) {
            strLIZJ = LIZJ(str, localTestApi.getLiveBoeWsDomainNewFrontier());
        }
        LiveMessagePrivateProtocolSetting liveMessagePrivateProtocolSetting = LiveMessagePrivateProtocolSetting.INSTANCE;
        if (liveMessagePrivateProtocolSetting.enableNewFrontierAccess() && !liveMessagePrivateProtocolSetting.enablePrivateProtocol()) {
            str = strLIZJ;
        }
        LiveMessageOverrideWsUrlSetting liveMessageOverrideWsUrlSetting = LiveMessageOverrideWsUrlSetting.INSTANCE;
        if (!liveMessageOverrideWsUrlSetting.getWsUrl().isEmpty()) {
            str = liveMessageOverrideWsUrlSetting.getWsUrl();
        }
        LiveMessageOverridePPUrlSetting liveMessageOverridePPUrlSetting = LiveMessageOverridePPUrlSetting.INSTANCE;
        if (!liveMessageOverridePPUrlSetting.getPPUrl().isEmpty()) {
            strLIZJ = liveMessageOverridePPUrlSetting.getPPUrl();
        }
        HashMap map2 = new HashMap();
        map2.put("ttnet_ignore_offline", "1");
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null || strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.isEmpty()) {
            strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = CardStruct.IStatusCode.DEFAULT;
        }
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId();
        if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId != null && !strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId.isEmpty()) {
            str2 = strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId;
        }
        if (LiveMessageEnableWSChannelDestroyTimeoutSetting.INSTANCE.enabled()) {
            if (Objects.equals(map.get("identity"), "anchor")) {
                wsConnectTimeout = LiveMessageTimeoutSettingAnchor.INSTANCE.getWsConnectTimeout();
            } else {
                wsConnectTimeout = LiveMessageTimeoutSetting.INSTANCE.getWsConnectTimeout();
            }
            strValueOf = String.valueOf(wsConnectTimeout);
        } else {
            strValueOf = "";
        }
        final IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        C0WKN c0wkn = new C0WKN(10001);
        c0wkn.LJII = "e1bd35ec9db7b8d846de66ed140b1ad9";
        c0wkn.LJFF = 9;
        C844470XAv.LIZ.getClass();
        c0wkn.LJ = C844470XAv.LJIIJ;
        c0wkn.LJI = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getShortVersionCode();
        c0wkn.LJIIIIZZ = strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId;
        c0wkn.LJIIIZ = str2;
        List listSingletonList = Collections.singletonList(str);
        if (listSingletonList != null) {
            ((ArrayList) c0wkn.LIZLLL).addAll(listSingletonList);
        }
        ((HashMap) c0wkn.LIZIZ).putAll(map2);
        ((HashMap) c0wkn.LIZJ).putAll(new HashMap<String, String>() { // from class: X.0peG
            {
                put("X-Tt-Token", C847400XMc.LJI());
                put("sdk-version", C465680INy.LIZ());
                if (this.LL.isBoe()) {
                    put("x-use-boe", "1");
                    put("x-tt-env", this.LL.getBoeLane());
                } else {
                    if (!this.LL.isPpe()) {
                        return;
                    }
                    put("x-use-ppe", "1");
                    put("x-tt-env", this.LL.getPpeLane());
                }
            }
        });
        c0wkn.LJIIJ = liveMessagePrivateProtocolSetting.enablePrivateProtocol();
        c0wkn.LIZIZ("fallback_timeout_mills", String.valueOf(liveMessagePrivateProtocolSetting.fallbackTimeoutMills()));
        c0wkn.LIZIZ("destroy_timeout_millis", strValueOf);
        c0wkn.LIZJ(strLIZJ);
        if (LiveMessagePPTransportSetting.INSTANCE.getValue() != 4) {
            c0wko = C0WKO.TUDP_PROXY;
        } else {
            c0wko = C0WKO.TLS_PROXY;
        }
        c0wkn.LJIILIIL = c0wko;
        final C821300WJs c821300WJsLIZJ = C821310WJt.LIZJ(context, c0wkn.LIZ(), new InterfaceC810750VrF() { // from class: X.0prf
            @Override // X.InterfaceC810750VrF
            public final void LIZ(WsChannelMsg wsChannelMsg) {
                int i;
                if (wsChannelMsg != null && (i = wsChannelMsg.channelId) == 10001) {
                    C1527950prd c1527950prd = new C1527950prd(i);
                    c1527950prd.LIZJ = wsChannelMsg.logId;
                    c1527950prd.LJ = wsChannelMsg.method;
                    c1527950prd.LJIIIIZZ = wsChannelMsg.seqId;
                    c1527950prd.LIZLLL = wsChannelMsg.service;
                    c1527950prd.LJI = wsChannelMsg.payloadType;
                    c1527950prd.LJII = wsChannelMsg.payloadEncoding;
                    c1527950prd.LJFF = wsChannelMsg.LIZ();
                    c1527950prd.LJIIIZ = wsChannelMsg.replayToComponentName;
                    List<WsChannelMsg.MsgHeader> list = wsChannelMsg.msgHeaders;
                    if (list != null) {
                        for (WsChannelMsg.MsgHeader msgHeader : list) {
                            ((HashMap) c1527950prd.LIZIZ).put(msgHeader.key, msgHeader.value);
                        }
                    }
                    interfaceC1528010prj.LIZ(c1527950prd.LIZ());
                }
            }

            @Override // X.InterfaceC810750VrF
            public final void onReceiveConnectEvent(C821280WJq c821280WJq, JSONObject jSONObject) {
                if (c821280WJq != null && c821280WJq.LIZLLL == 10001) {
                    EnumC1527990prh enumC1527990prh = EnumC1527990prh.CONNECTION_UNKNOWN;
                    int i = C0XHR.LIZ[c821280WJq.LIZIZ.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5) {
                                        enumC1527990prh = EnumC1527990prh.CONNECTED;
                                    }
                                } else {
                                    enumC1527990prh = EnumC1527990prh.CONNECT_CLOSED;
                                }
                            } else {
                                enumC1527990prh = EnumC1527990prh.CONNECT_FAILED;
                                if (c821280WJq.LIZJ == -192) {
                                    enumC1527990prh = EnumC1527990prh.CONNECT_TIMEOUT;
                                }
                            }
                        } else {
                            enumC1527990prh = EnumC1527990prh.CONNECTING;
                        }
                    }
                    interfaceC1528010prj.LIZIZ(enumC1527990prh, jSONObject);
                }
            }
        });
        return new InterfaceC2221911Bxl() { // from class: X.0ppo
            @Override // X.InterfaceC2221911Bxl
            public final void LIZIZ() {
                ((C821300WJs) c821300WJsLIZJ).LIZJ();
            }

            @Override // X.InterfaceC2221911Bxl
            public final boolean isConnected() {
                return ((C821300WJs) c821300WJsLIZJ).LJFF == C0XE1.CONNECTED;
            }

            @Override // X.InterfaceC2221911Bxl
            public final void LIZ(LiveWsMessage liveWsMessage) {
                C0WKM c0wkm = new C0WKM(liveWsMessage.channelId);
                c0wkm.LIZJ = liveWsMessage.logId;
                c0wkm.LJ = liveWsMessage.method;
                c0wkm.LJIIIIZZ = liveWsMessage.seqId;
                c0wkm.LIZLLL = liveWsMessage.service;
                c0wkm.LJI = liveWsMessage.payloadType;
                c0wkm.LJII = liveWsMessage.payloadEncoding;
                c0wkm.LJFF = liveWsMessage.LIZ();
                c0wkm.LJIIIZ = liveWsMessage.replayToComponentName;
                List<LiveWsMessage.MsgHeader> list = liveWsMessage.msgHeaders;
                if (list != null) {
                    for (LiveWsMessage.MsgHeader msgHeader : list) {
                        c0wkm.LIZ(msgHeader.key, msgHeader.value);
                    }
                }
                ((C821300WJs) c821300WJsLIZJ).LIZIZ(c0wkm.LIZIZ(), null);
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C0K8R<C1500830p9t> downloadFile(boolean z, int i, String str, List<C520610KbL> list, Object obj) {
        Map<String, String> mapLIZ = LIZ(list);
        C1904507d5.LIZJ(str, mapLIZ);
        C0X9S<TypedInput> c0x9sDownloadFile = LIZIZ().downloadFile(z, i, str, mapLIZ, obj);
        minorModeInterceptMonitor(str);
        return new C1500860p9w(c0x9sDownloadFile);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C0K8R<C1500830p9t> post(String str, List<C520610KbL> list, String str2, byte[] bArr, Object obj) {
        Map<String, String> mapLIZ = LIZ(list);
        C1904507d5.LIZJ(str, mapLIZ);
        C0X9S<TypedInput> c0x9sPost = LIZIZ().post(str, new TypedByteArray(str2, bArr, new String[0]), mapLIZ, obj);
        minorModeInterceptMonitor(str);
        return new C1500860p9w(c0x9sPost);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C0K8R<C1500830p9t> uploadFile(int i, String str, List<C520610KbL> list, final String str2, final byte[] bArr, final long j, final String str3) {
        Map<String, String> mapLIZ = LIZ(list);
        C1904507d5.LIZJ(str, mapLIZ);
        C0X9S<TypedInput> c0x9sPostMultiPart = LIZIZ().postMultiPart(i, str, mapLIZ, new TypedOutput() { // from class: X.0pe9
            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String fileName() {
                return null;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final long length() {
                return j;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String md5Stub() {
                return str3;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String mimeType() {
                return str2;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final void writeTo(OutputStream outputStream) throws IOException {
                outputStream.write(bArr);
            }
        });
        minorModeInterceptMonitor(str);
        return new C1500860p9w(c0x9sPostMultiPart);
    }
}
