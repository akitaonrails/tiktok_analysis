package com.ss.android.ugc.aweme.plugin;

import X.C01GW;
import X.C09CT;
import X.C0C58;
import X.C0C5P;
import X.C0C5Q;
import X.C0C64;
import X.C0CV2;
import X.C0PEM;
import X.C0TA0;
import X.C0VGI;
import X.C0WYJ;
import X.C0WYL;
import X.C0X52;
import X.C10QB;
import X.C10RN;
import X.C10SR;
import X.C10SX;
import X.C10T0;
import X.C10T4;
import X.C10T7;
import X.C10TG;
import X.C10TK;
import X.C10TQ;
import X.C10TV;
import X.C10TW;
import X.C1106304Uj;
import X.C11N2;
import X.C11NZ;
import X.C11S5;
import X.C123100dR;
import X.C13LP;
import X.C1514430pVp;
import X.C1515120pWw;
import X.C15438062q;
import X.C1720306oT;
import X.C19243610Qg;
import X.C19249410Sm;
import X.C19254610Um;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.C2329809Ay;
import X.C2344009Gk;
import X.C2502809rO;
import X.C259800zU;
import X.C292560BdO;
import X.C292830Bdp;
import X.C293230BeT;
import X.C314040CSs;
import X.C317560Ccc;
import X.C412101ix;
import X.C452501pT;
import X.C516201zk;
import X.C7740030o;
import X.C786410Ut5;
import X.C817503Hh;
import X.C823050WQl;
import X.C844470XAv;
import X.C848050XOp;
import X.EnumC19241510Pl;
import X.EnumC586470MzN;
import X.InterfaceC1294060jmO;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC314050CSt;
import Y.AObserverS188S0200000_28;
import Y.AObserverS230S0100000_28;
import Y.ARunnableS36S0400000_28;
import Y.AfS102S0300000_4;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.ss.android.ugc.aweme.configuration.scene.UGStrategyTriggerAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INewUserJourneyAppDiffService;
import com.ss.android.ugc.aweme.journey.interest.IInterestSelectionDataService;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.plugin.downstreamexperiment.IDownstreamExperimentService;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestPageStruct;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import com.ss.android.ugc.aweme.plugin.retry.NetworkRetryConfig;
import com.ss.android.ugc.aweme.plugin.retry.RetryNetworkInterceptor;
import com.ss.android.ugc.aweme.plugin.retry.RetryStrategy;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.service.interest.IInterestReselectionService;
import com.ss.android.ugc.aweme.service.interest.model.InterestTag;
import com.ss.android.ugc.aweme.service.protection.TooltipApplicabilityService;
import com.ss.android.ugc.aweme.tablet.api.IDeviceCapability;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class PluginService implements IPluginService {
    public static final C10TW Companion = new Object() { // from class: X.10TW
    };
    public final PluginApi api = createApi();
    public IPluginService.ClientTriggerConfig clientTriggerConfig;
    public final AtomicBoolean didCompleteLoad;
    public final AtomicBoolean didLoad;
    public final C01GW downstreamExperimentService$delegate;
    public final C01GW firstInstallVersion$delegate;
    public final C01GW initListeners$delegate;
    public final C01GW initialRequestResultLiveData$delegate;
    public final Keva keva;
    public C10T7 nujFeedSignalModel;
    public final C01GW pluginABManager$delegate;
    public Map<Long, C10SX> pluginMap;
    public final MutableLiveData<Map<Long, C10SX>> plugins;
    public final InterfaceC314050CSt prefetchApi;
    public final C01GW runtimeLogHelper$delegate;
    public final C01GW ssaid$delegate;

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public String getPluginConfigProtoBufVid() {
        return "74651034";
    }

    private final IDownstreamExperimentService getDownstreamExperimentService() {
        return (IDownstreamExperimentService) this.downstreamExperimentService$delegate.getValue();
    }

    private final List<C10TV> getInitListeners() {
        return (List) this.initListeners$delegate.getValue();
    }

    public final String getAdsGroupId() {
        C19254610Um.LIZIZ.LJ().LIZLLL();
        return C10SR.LIZ();
    }

    public final String getAttributionDetail() {
        C19254610Um.LIZIZ.LJ().LIZLLL();
        return C10SR.LIZIZ();
    }

    public final String getAttributionType() {
        C19254610Um.LIZIZ.LJ().LIZLLL();
        return C10SR.LIZJ();
    }

    public final C10T0 getCacheAgeIfNeedReBind() {
        C10T0 c10t0LIZIZ;
        C10TG c10tgLJII = C19254610Um.LIZIZ.LJII();
        return (c10tgLJII == null || (c10t0LIZIZ = c10tgLJII.LIZIZ()) == null) ? new C10T0(null, null, null, null) : c10t0LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public List<C0TA0> getCurrentPluginList() {
        Collection<C10SX> collectionValues = this.pluginMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (Intrinsics.LJFF(((C10SX) obj).LIZIZ.showConfig.shouldShow, Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        return C13LP.LLIIII(arrayList);
    }

    public List<C0TA0> getCurrentPluginListNoChecks() {
        return C13LP.LLIIII(this.pluginMap.values());
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    @InterfaceC1294060jmO
    public List<IPluginService.PluginData> getCurrentPluginListPluginData() {
        Collection<C10SX> collectionValues = this.pluginMap.values();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C10SX) it2.next()).LIZIZ);
        }
        return C13LP.LLIIII(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public IPluginService.ReinstallCheck getDeviceCheckResult() {
        int i = Keva.getRepo("plugin_repo").getInt("reinstall_check_result", 0);
        IPluginService.ReinstallCheck.Companion.getClass();
        return C19249410Sm.LIZ(i);
    }

    public final String getFirstInstallVersion() {
        return (String) this.firstInstallVersion$delegate.getValue();
    }

    public final MutableLiveData<C0CV2> getInitialRequestResultLiveData() {
        return (MutableLiveData) this.initialRequestResultLiveData$delegate.getValue();
    }

    public final C19243610Qg getPluginABManager() {
        return (C19243610Qg) this.pluginABManager$delegate.getValue();
    }

    public final String getRequiredModelDecisionMap() throws JSONException {
        String strLJIJ;
        String strLJIJ2;
        Long lValueOf;
        C10RN.LIZ.getClass();
        if (C1514430pVp.LIZLLL().booleanValue() || ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin() || C10RN.LJFF.getBoolean("should_terminate", false)) {
            return null;
        }
        String strLIZJ = UGStrategyTriggerAbility.LJI().LIZJ();
        if (strLIZJ.length() == 0) {
            return null;
        }
        long jLJFF = UGStrategyTriggerAbility.LJI().LJFF();
        if (jLJFF <= 0) {
            return null;
        }
        INewUserDebugService iNewUserDebugService = (INewUserDebugService) ServiceManager.get().getService(INewUserDebugService.class);
        if (iNewUserDebugService != null && (strLJIJ = iNewUserDebugService.LJIJ()) != null && C123100dR.LIZ(strLJIJ) && (strLJIJ2 = iNewUserDebugService.LJIJ()) != null && (lValueOf = Long.valueOf(CastLongProtector.parseLong(strLJIJ2))) != null) {
            long jLongValue = lValueOf.longValue();
            if (jLongValue > 0) {
                jLJFF = jLongValue;
            }
        }
        if (C19254610Um.LIZIZ.LJJIL().LJIIIZ(jLJFF)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("skippable_daily_login", strLIZJ);
        return C786410Ut5.J3(jSONObject);
    }

    public final INewUserDebugService getRuntimeLogHelper() {
        return (INewUserDebugService) this.runtimeLogHelper$delegate.getValue();
    }

    public final String getSsaid() {
        return (String) this.ssaid$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public void tryInit() throws Exception {
        if (this.didLoad.compareAndSet(false, true)) {
            Map<Long, C10SX> mapInitCachedPlugins = initCachedPlugins();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Loaded cached plugins, total in cache: ");
            sbLIZ.append(mapInitCachedPlugins != null ? mapInitCachedPlugins.size() : -1);
            sbLIZ.append('.');
            C2188811AlT.LIZIZ(sbLIZ);
            int i = C1720306oT.LIZ;
            loadClientTriggerConfig();
            updateDownstreamExperimentFilterIdList();
            synchronized (getInitListeners()) {
                try {
                    this.didCompleteLoad.set(true);
                    Iterator<C10TV> it2 = getInitListeners().iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ();
                    }
                    getInitListeners().clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public PluginService() {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        this.prefetchApi = (InterfaceC314050CSt) iRetrofitFactory.LIZ(C2188811AlT.LIZIZ(sbLIZ)).create(InterfaceC314050CSt.class);
        this.pluginMap = C2097608Jq.LJ();
        this.plugins = new MutableLiveData<>();
        this.initialRequestResultLiveData$delegate = C452501pT.LIZIZ(new C317560Ccc());
        this.didLoad = new AtomicBoolean(false);
        this.didCompleteLoad = new AtomicBoolean(false);
        this.initListeners$delegate = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(324));
        this.pluginABManager$delegate = C452501pT.LIZIZ(new C10TQ());
        this.runtimeLogHelper$delegate = C452501pT.LIZIZ(new C10T4());
        this.clientTriggerConfig = new IPluginService.ClientTriggerConfig(Boolean.TRUE, 50, 30000L, null);
        this.keva = Keva.getRepo("plugin_repo");
        this.firstInstallVersion$delegate = C452501pT.LIZIZ(new AwS572S0100000_28(this, 489));
        this.ssaid$delegate = C452501pT.LIZIZ(new C314040CSs());
        this.nujFeedSignalModel = loadNUJFeedSignal();
        this.downstreamExperimentService$delegate = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(323));
    }

    private final PluginApi createApi() {
        NetworkRetryConfig networkRetryConfig;
        ((INewUserDebugService) ServiceManager.get().getService(INewUserDebugService.class)).LJIIJ();
        RetryNetworkInterceptor.LL.getClass();
        if (!RetryNetworkInterceptor.LLILLL) {
            try {
                SettingsManager.LIZLLL().getClass();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                networkRetryConfig = new NetworkRetryConfig(RetryStrategy.NO_RETRY, null, null, null, null, 30, null);
            }
            if (SettingsManager.LIZ("retry_network_killswitch", true)) {
                List<String> list = C1106304Uj.LIZ;
                networkRetryConfig = new NetworkRetryConfig(RetryStrategy.NO_RETRY, null, null, null, null, 30, null);
                RetryStrategy retryStrategy = networkRetryConfig.retryStrategy;
                RetryStrategy retryStrategy2 = RetryStrategy.NO_RETRY;
                if (retryStrategy != retryStrategy2) {
                    RetryNetworkInterceptor.LLILLL = true;
                    RetryNetworkInterceptor.LLILLJJLI = networkRetryConfig;
                    if (retryStrategy == null) {
                        retryStrategy = retryStrategy2;
                    }
                    RetryNetworkInterceptor.LLILZ = retryStrategy;
                    Integer num = networkRetryConfig.retryNumber;
                    RetryNetworkInterceptor.LLILZIL = num != null ? num.intValue() : 0;
                    Integer num2 = networkRetryConfig.timeoutMs;
                    RetryNetworkInterceptor.LLILZLL = num2 != null ? num2.intValue() : 0;
                    C1515120pWw.LIZIZ(RetryNetworkInterceptor.LL);
                }
            }
        }
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        return (PluginApi) iRetrofitFactory.LIZ(C2188811AlT.LIZIZ(sbLIZ)).create(PluginApi.class);
    }

    private final Map<Long, C10SX> initCachedPlugins() throws Exception {
        Gson gson = C7740030o.LIZ().getGson();
        Map<Long, C10SX> map = null;
        try {
            String string = this.keva.getString("plugin_list", "");
            if (TextUtils.isEmpty(string)) {
                updatePlugins(C2097608Jq.LJ());
                return null;
            }
            try {
                Type type = new TypeToken<Map<Long, ? extends IPluginService.PluginData>>() { // from class: X.10Sw
                }.getType();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) gson.LJIIIIZZ(string, type)).entrySet()) {
                    C10SX c10sxLIZ = C10QB.LIZ((IPluginService.PluginData) entry.getValue());
                    if (c10sxLIZ != null) {
                        linkedHashMap.put(entry.getKey(), c10sxLIZ);
                    }
                }
                map = linkedHashMap;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    List list = (List) gson.LJIIIIZZ(string, new TypeToken<List<? extends IPluginService.PluginData>>() { // from class: X.10T1
                    }.getType());
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C10SX c10sxLIZ2 = C10QB.LIZ((IPluginService.PluginData) it2.next());
                        if (c10sxLIZ2 != null) {
                            arrayList.add(c10sxLIZ2);
                        }
                    }
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
                    for (Object obj : arrayList) {
                        C10SX c10sx = (C10SX) obj;
                        int value = c10sx.LIZ.getValue();
                        Integer num = c10sx.LIZIZ.instanceId;
                        linkedHashMap2.put(Long.valueOf(getPluginIdentifier(value, Integer.valueOf(num != null ? num.intValue() : 0))), obj);
                    }
                    map = linkedHashMap2;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            if (map != null) {
                updatePlugins(map);
                return map;
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            onParseException(e3);
        }
        return map;
    }

    private final void loadClientTriggerConfig() {
        IPluginService.ClientTriggerConfig clientTriggerConfig;
        Gson gson = C7740030o.LIZ().getGson();
        String string = this.keva.getString("ctconfig", "");
        if (C123100dR.LIZ(string)) {
            try {
                clientTriggerConfig = (IPluginService.ClientTriggerConfig) gson.LJIIIIZZ(string, new TypeToken<IPluginService.ClientTriggerConfig>() { // from class: X.10TC
                }.getType());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                clientTriggerConfig = this.clientTriggerConfig;
            }
            this.clientTriggerConfig = clientTriggerConfig;
        }
    }

    private final C10T7 loadNUJFeedSignal() {
        Gson gson = C7740030o.LIZ().getGson();
        String string = this.keva.getString("nuj_feed_signal", "");
        if (!C123100dR.LIZ(string)) {
            return new C10T7(0);
        }
        try {
            return (C10T7) gson.LJIIIIZZ(string, new TypeToken<C10T7>() { // from class: X.10TB
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new C10T7(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public String getCdid() {
        return C123100dR.LIZ(getSsaid()) ? getSsaid() : "";
    }

    public final List<Long> getDownstreamExperimentFilterIds() {
        return ((IDownstreamExperimentService) ServiceManager.get().getService(IDownstreamExperimentService.class)).LIZIZ(EnumC586470MzN.PLUGIN_CONFIG);
    }

    public final Long getMemorySize() {
        if (!C1514430pVp.LIZLLL().booleanValue()) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        return Long.valueOf(C0WYJ.LJIJI(C844470XAv.LIZ()));
    }

    public final Double getScreenDp() {
        if (!C1514430pVp.LIZLLL().booleanValue()) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        C0WYL c0wylLJIILL = C0WYJ.LJIILL(C844470XAv.LIZ());
        double d = c0wylLJIILL.LIZ;
        int i = c0wylLJIILL.LIZJ;
        if (d > 0.0d) {
            return Double.valueOf(((double) (i * 160.0f)) / d);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public void runClientExperimentUploadTask() {
        boolean zLJI = MethodIDManager.LJI(196623);
        C10TK c10tk = C10TK.LIZ;
        c10tk.getClass();
        c10tk.LIZJ(AFwS217S0000000_28.get$arr$(834));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void updateDownstreamExperimentFilterIdList() {
        IDownstreamExperimentService downstreamExperimentService = getDownstreamExperimentService();
        if (downstreamExperimentService != null) {
            Collection<C10SX> collectionValues = this.pluginMap.values();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C10SX) it2.next()).LIZIZ);
            }
            downstreamExperimentService.LIZ(arrayList);
        }
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public C10T7 getNewUserFeedSignalModel() {
        return this.nujFeedSignalModel;
    }

    private final void clearExposureVids(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        if (strLJJLIIIJ.length() > 0 && (!a0.LJJJIL(strLJJLIIIJ))) {
            C0C5P.LIZJ().getClass();
            C292830Bdp c292830Bdp = (C292830Bdp) C292560BdO.LJI.getValue();
            c292830Bdp.getClass();
            List<String> listLIZIZ = C292830Bdp.LIZIZ(strLJJLIIIJ);
            if (listLIZIZ != null) {
                c292830Bdp.LJ.LIZJ(listLIZIZ);
                C293230BeT c293230BeTLIZ = c292830Bdp.LIZ();
                if (c293230BeTLIZ != null) {
                    c293230BeTLIZ.LIZJ(listLIZIZ);
                }
            }
            C292560BdO.LJ();
        }
    }

    private final Map<Long, C10SX> getMergedList(List<IPluginService.PluginData> list) {
        int iIntValue;
        Map<Long, C10SX> map = this.pluginMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        ArrayList arrayList = new ArrayList();
        for (IPluginService.PluginData pluginData : list) {
            C10SX c10sxLIZ = C10QB.LIZ(pluginData);
            if (c10sxLIZ != null) {
                int value = c10sxLIZ.LIZ.getValue();
                Integer num = c10sxLIZ.LIZIZ.instanceId;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                long pluginIdentifier = getPluginIdentifier(value, Integer.valueOf(iIntValue));
                C10SX c10sx = map.get(Long.valueOf(pluginIdentifier));
                if (c10sx != null) {
                    long j = pluginData.timestamp;
                    IPluginService.PluginData pluginData2 = c10sx.LIZIZ;
                    if (j <= pluginData2.timestamp) {
                        collectVidsToDelete(pluginData2, arrayList);
                    }
                }
                System.currentTimeMillis();
                linkedHashMap.put(Long.valueOf(pluginIdentifier), c10sxLIZ);
            }
        }
        clearExposureVids(arrayList);
        return linkedHashMap;
    }

    private final String getUserKey(C848050XOp c848050XOp) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new_user_");
        sbLIZ.append(c848050XOp.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final void onParseException(Exception exc) throws Exception {
        if (!(exc instanceof JSONException) && !(exc instanceof C2329809Ay)) {
            if (exc instanceof NullPointerException) {
                return;
            } else {
                throw exc;
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        c2344009Gk.LJIIIIZZ("fail_info", localizedMessage);
        C20684815ws.LJIILLIIL("ct_json_exception", c2344009Gk.LIZ);
    }

    public final Boolean cacheUserAndCheckIfNewSignup(C848050XOp c848050XOp) {
        if (c848050XOp == null) {
            if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
                this.keva.storeString("prev_user", "");
                return null;
            }
            String curSecUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurSecUserId();
            Keva keva = this.keva;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("new_user_");
            sbLIZ.append(curSecUserId);
            return Boolean.valueOf(keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false));
        }
        this.keva.storeString("prev_user", c848050XOp.LIZ);
        String userKey = getUserKey(c848050XOp);
        if (this.keva.contains(userKey)) {
            return Boolean.valueOf(this.keva.getBoolean(userKey, false));
        }
        this.keva.storeBoolean(userKey, c848050XOp.LIZIZ);
        if (c848050XOp.LIZIZ) {
            TooltipApplicabilityService.LJII().LJI(c848050XOp.LIZ);
        }
        return Boolean.valueOf(c848050XOp.LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public C0TA0 getCurrentPluginData(EnumC19241510Pl enumC19241510Pl) {
        Object next;
        Iterator<T> it2 = this.pluginMap.values().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C10SX c10sx = (C10SX) next;
                if (c10sx.LIZ == enumC19241510Pl && Intrinsics.LJFF(c10sx.LIZIZ.showConfig.shouldShow, Boolean.TRUE)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (C0TA0) next;
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public C0VGI observeInitialLaunchRequestResultForever(final Observer<C0CV2> observer) {
        synchronized (getInitialRequestResultLiveData()) {
            try {
                C0CV2 value = getInitialRequestResultLiveData().getValue();
                if (value != null) {
                    observer.onChanged(value);
                    return new C0VGI() { // from class: X.10TP
                        @Override // X.C0VGI
                        public final void onComplete() {
                        }
                    };
                }
                getInitialRequestResultLiveData().observeForever(observer);
                return new C0VGI() { // from class: X.10Ss
                    @Override // X.C0VGI
                    public final void onComplete() {
                        this.LIZ.getInitialRequestResultLiveData().removeObserver(observer);
                    }
                };
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void persistInterestTagsForReselection(NewUserInterestPageStruct newUserInterestPageStruct) {
        IInterestReselectionService iInterestReselectionService;
        IInterestSelectionDataService iInterestSelectionDataService;
        if (newUserInterestPageStruct == null || (iInterestReselectionService = (IInterestReselectionService) PluggableExtentionKt.pluggableSpi$default(IInterestReselectionService.class, false, false, false, 14, null)) == null || (iInterestSelectionDataService = (IInterestSelectionDataService) PluggableExtentionKt.pluggableSpi$default(IInterestSelectionDataService.class, false, false, false, 14, null)) == null) {
            return;
        }
        List<NewUserInterestStruct> listLIZ = newUserInterestPageStruct.interest_list;
        if (listLIZ == null) {
            listLIZ = iInterestSelectionDataService.LIZ();
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
        for (NewUserInterestStruct newUserInterestStruct : listLIZ) {
            arrayList.add(new InterestTag(newUserInterestStruct.id, newUserInterestStruct.text, Boolean.FALSE));
        }
        iInterestReselectionService.LJIJI(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, X.01kM] */
    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public void prefetchABSettings(Function1<? super IPluginService.OnboardingConfigResponse, Unit> function1) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = this.prefetchApi.LIZ().LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS102S0300000_4(this, function1, c259800zU, 0), new C516201zk(c259800zU, 101));
    }

    public final void processPrefetchedAbConfig(C0X52<IPluginService.OnboardingConfigResponse> c0x52) {
        n nVar;
        if (TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) && (nVar = c0x52.LIZIZ.vodConfig) != null) {
            C0C58 c0c58 = C0C58.LIZJ;
            if (c0c58.LIZ.LIZIZ().LJ().size() == 0 && c0c58.LIZ.LJ().LJ().size() == 0) {
                for (Map.Entry entry : ((HashMap) C2502809rO.LIZ).entrySet()) {
                    String str = (String) entry.getKey();
                    n nVarLJJIJ = nVar.LJJIJ(str);
                    if (nVarLJJIJ != null && nVarLJJIJ.LJJIJIIJI("val") != null) {
                        C0C5Q.LJIIIIZZ((ConfigItem) entry.getValue(), nVar, str);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public void subscribeInit(C10TV c10tv) {
        synchronized (getInitListeners()) {
            try {
                if (this.didCompleteLoad.get()) {
                    c10tv.LIZ();
                } else {
                    getInitListeners().add(c10tv);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void updateClientTriggerConfig(IPluginService.ClientTriggerConfig clientTriggerConfig) {
        String str = clientTriggerConfig.vid;
        if (str != null) {
            C0C5P.LIZJ().getClass();
            C0C5P.LIZ(str);
        }
        this.clientTriggerConfig = clientTriggerConfig;
        try {
            this.keva.storeString("ctconfig", C7740030o.LIZ().getGson().LJIILL(clientTriggerConfig));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void updateNUJFeedSignal(IPluginService.NUJFeedSignal nUJFeedSignal) {
        C10T7 c10t7 = this.nujFeedSignalModel;
        Integer num = nUJFeedSignal.reinstallStatus;
        if (num == null) {
            num = c10t7.LIZ;
        }
        c10t7.LIZ = num;
        Integer num2 = nUJFeedSignal.forcedLoginStatus;
        if (num2 == null) {
            num2 = c10t7.LIZIZ;
        }
        c10t7.LIZIZ = num2;
        IPluginService.NUJFeedSignal.NUJInstallationInfoModel nUJInstallationInfoModel = nUJFeedSignal.installationInfo;
        if (nUJInstallationInfoModel == null) {
            nUJInstallationInfoModel = c10t7.LIZJ;
        }
        c10t7.LIZJ = nUJInstallationInfoModel;
        IPluginService.NUJFeedSignal.NUJLoginHistoryInfoModel nUJLoginHistoryInfoModel = nUJFeedSignal.loginHistoryInfo;
        if (nUJLoginHistoryInfoModel == null) {
            nUJLoginHistoryInfoModel = c10t7.LIZLLL;
        }
        c10t7.LIZLLL = nUJLoginHistoryInfoModel;
        try {
            this.keva.storeString("nuj_feed_signal", C7740030o.LIZ().getGson().LJIILL(this.nujFeedSignalModel));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void updatePlugins(Map<Long, C10SX> map) throws Exception {
        this.pluginMap = map;
        this.plugins.postValue(map);
        try {
            Gson gson = C7740030o.LIZ().getGson();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap.put(entry.getKey(), ((C10SX) entry.getValue()).LIZIZ);
            }
            this.keva.storeString("plugin_list", gson.LJIILL(linkedHashMap));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            onParseException(e);
        }
    }

    private final void collectVidsToDelete(IPluginService.PluginData pluginData, List<String> list) {
        String str;
        String str2;
        String str3 = pluginData.abExposeVid;
        if (str3 != null) {
            list.add(str3);
        }
        IPluginService.AutoExposureConfig autoExposureConfig = pluginData.autoExposureConfig;
        if (autoExposureConfig != null && (str2 = autoExposureConfig.preciseExposureVid) != null) {
            list.add(str2);
        }
        IPluginService.AutoExposureConfig autoExposureConfig2 = pluginData.autoExposureConfig;
        if (autoExposureConfig2 != null && (str = autoExposureConfig2.fullExposureVid) != null) {
            list.add(str);
        }
    }

    private final long getPluginIdentifier(int i, Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return (((long) i) * 10000000000L) + ((long) iIntValue);
    }

    private final Map<Long, C10SX> removeExpiredPlugins(Map<Long, C10SX> map, List<Integer> list) {
        List<Integer> listEmptyList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Long, C10SX> entry : map.entrySet()) {
            long jLongValue = entry.getKey().longValue();
            C10SX value = entry.getValue();
            IPluginService.PluginData pluginData = value.LIZIZ;
            if (list == null) {
                listEmptyList = Collections.emptyList();
            } else {
                listEmptyList = list;
            }
            if (!listEmptyList.contains(Integer.valueOf(pluginData.id))) {
                linkedHashMap.put(Long.valueOf(jLongValue), value);
            } else {
                collectVidsToDelete(pluginData, arrayList);
            }
        }
        clearExposureVids(arrayList);
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public C0VGI backgroundThreadObserveFirst(EnumC19241510Pl enumC19241510Pl, Observer<C0TA0> observer) {
        final C259800zU c259800zU = new C259800zU();
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS36S0400000_28(c259800zU, enumC19241510Pl, observer, this, 0));
        return new C0VGI() { // from class: X.10Sg
            @Override // X.C0VGI
            public final void onComplete() {
                Observer<Map<Long, C10SX>> observer2 = c259800zU.element;
                if (observer2 != null) {
                    this.plugins.removeObserver(observer2);
                }
            }
        };
    }

    @InterfaceC1294060jmO
    public C0VGI backgroundThreadObserveFirstPluginData(EnumC19241510Pl enumC19241510Pl, Observer<IPluginService.PluginData> observer) {
        final C259800zU c259800zU = new C259800zU();
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS36S0400000_28(c259800zU, enumC19241510Pl, observer, this, 1));
        return new C0VGI() { // from class: X.10Sh
            @Override // X.C0VGI
            public final void onComplete() {
                Observer<Map<Long, C10SX>> observer2 = c259800zU.element;
                if (observer2 != null) {
                    this.plugins.removeObserver(observer2);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public void observeInitialLaunchRequestResult(LifecycleOwner lifecycleOwner, C11N2<C0CV2> c11n2) {
        getInitialRequestResultLiveData().observe(lifecycleOwner, new AObserverS230S0100000_28(c11n2, 39));
    }

    public final void processCallback(C0X52<IPluginService.OnboardingConfigResponse> c0x52, Function1<? super IPluginService.OnboardingConfigResponse, Unit> function1) {
        if (function1 == null) {
            return;
        }
        function1.invoke(c0x52.LIZIZ);
    }

    public void removePluginData(EnumC19241510Pl enumC19241510Pl, Function0<Unit> function0) {
        Map<Long, C10SX> map = this.pluginMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Long, C10SX> entry : map.entrySet()) {
            if (enumC19241510Pl != entry.getValue().LIZ) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C412101ix(this, linkedHashMap, function0, null), 2);
    }

    public final void tryClearCacheAge(C10T0 c10t0, boolean z) {
        C10TG c10tgLJII;
        if (z && c10t0.LIZ() && (c10tgLJII = C19254610Um.LIZIZ.LJII()) != null) {
            c10tgLJII.LIZ();
        }
    }

    public final synchronized void updateRepo(List<IPluginService.PluginData> list, List<Integer> list2) {
        Map<Long, C10SX> mergedList = getMergedList(list);
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "plugin_cache_optimization", true) == 1) {
            mergedList = removeExpiredPlugins(mergedList, list2);
        }
        updatePlugins(mergedList);
    }

    public interface PluginApi {
        @InterfaceC1501200pAU("tiktok/v1/plugin/config/")
        C11NZ<C0X52<IPluginService.PluginConfigResponse>> LIZ(@InterfaceC1501120pAM("has_previous_did") Boolean bool, @InterfaceC1501120pAM("is_new_signup_user") Boolean bool2, @InterfaceC1501120pAM("is_multiaccount_user") Boolean bool3, @InterfaceC1501120pAM("first_install_version") String str, @InterfaceC1501120pAM("cached_plugins") String str2, @InterfaceC1501120pAM("skip_cache") Boolean bool4, @InterfaceC1501120pAM("is_install_mt") Integer num, @InterfaceC1501120pAM("gaid") String str3, @InterfaceC1501120pAM("ssaid") String str4, @InterfaceC1501120pAM("bind_age") String str5, @InterfaceC1501120pAM("is_first_launch") Boolean bool5, @InterfaceC1501120pAM("pre_did_req_cnt") Integer num2, @InterfaceC1501120pAM("need_cdid_ab") Integer num3, @InterfaceC1501120pAM("android_device_reinstall_check") Integer num4, @InterfaceC1501120pAM("vv_count") Integer num5, @InterfaceC1501120pAM("memory_size") Long l, @InterfaceC1501120pAM("screen_dp") Double d, @InterfaceC1501120pAM("is_pad") Integer num6, @InterfaceC1501120pAM("is_foldable") Integer num7, @InterfaceC1501120pAM("device_model") String str6, @InterfaceC1501120pAM("attribution_type") String str7, @InterfaceC1501120pAM("attribution_detail") String str8, @InterfaceC1501120pAM("attribution_ads_group_id") String str9, @InterfaceC1501120pAM("required_model_decision_map") String str10, @InterfaceC1501120pAM("downstream_experiment_filter_ids") List<Long> list, @InterfaceC1501120pAM("business") String str11, @InterfaceC1501120pAM("bind_age_range_lb") Integer num8, @InterfaceC1501120pAM("bind_age_range_ub") Integer num9, @InterfaceC1501120pAM("is_3rd_party_age_range") Boolean bool6);

        public static final class CachedPlugin {

            @C09CT("cached_time")
            public final long cacheTime;

            @C09CT(FollowStatusChangeMethod.PARAM_UID)
            public final int id;

            @C09CT("instance_id")
            public final Integer instanceId;

            public CachedPlugin(int i, Integer num, long j) {
                this.id = i;
                this.instanceId = num;
                this.cacheTime = j;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public void observe(EnumC19241510Pl enumC19241510Pl, LifecycleOwner lifecycleOwner, C11N2<C0TA0> c11n2) {
        this.plugins.observe(lifecycleOwner, new AObserverS188S0200000_28((Object) enumC19241510Pl, (View) c11n2, (ViewPagerBottomSheetBehavior<View>) 11));
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public void startPluginRequest(final Boolean bool, final C848050XOp c848050XOp, final Boolean bool2, final boolean z, final int i) {
        boolean zLJI = MethodIDManager.LJI(137722);
        C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.10SY
            /* JADX WARN: Type inference failed for: r0v3, types: [T, X.01kM] */
            /* JADX WARN: Type inference failed for: r2v33, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r4v9, types: [T, java.lang.Long] */
            public final void LIZ() throws Exception {
                String curSecUserId;
                this.LL.tryInit();
                Collection<C10SX> collectionValues = this.LL.pluginMap.values();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                Iterator<T> it2 = collectionValues.iterator();
                while (true) {
                    int iIntValue = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    C10SX c10sx = (C10SX) it2.next();
                    int value = c10sx.LIZ.getValue();
                    Integer num = c10sx.LIZIZ.instanceId;
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    arrayList.add(new PluginService.PluginApi.CachedPlugin(value, Integer.valueOf(iIntValue), c10sx.LIZIZ.timestamp));
                }
                List listLLIIII = C13LP.LLIIII(arrayList);
                final C259800zU c259800zU = new C259800zU();
                final Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
                C259800zU c259800zU2 = new C259800zU();
                Boolean bool3 = bool2;
                Boolean bool4 = Boolean.TRUE;
                if (Intrinsics.LJFF(bool3, bool4)) {
                    c259800zU2.element = 0;
                    ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZ(false);
                    long j = C1150504el.LIZ().LJJIII;
                    long jElapsedRealtime = j > 0 ? SystemClock.elapsedRealtime() - j : -1L;
                    c259800zU.element = Long.valueOf(SystemClock.elapsedRealtime());
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZJ(0, "android_id_status");
                    c2344009Gk.LIZLLL(jElapsedRealtime, "app_start_req_send_duration");
                    C10SV.LIZ(c2344009Gk);
                    Map<String, String> map = c2344009Gk.LIZ;
                    C807840VmY.LIZ(map);
                    C20684815ws.LJIILLIIL("hybrid_ab_req_send", map);
                } else {
                    C19248410Sc.LIZ.getClass();
                    if (C19248410Sc.LIZIZ.length() != 0) {
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LJIIIIZZ("url", C19248410Sc.LIZIZ);
                        if (C19248410Sc.LIZLLL) {
                            c2344009Gk2.LJFF("need_mall", "1");
                        }
                        C19249910Sr.LIZIZ.LIZIZ(c2344009Gk2, "tts_plugin_req_send");
                    }
                }
                C848050XOp c848050XOp2 = c848050XOp;
                if ((c848050XOp2 == null || (curSecUserId = c848050XOp2.LIZ) == null) && (curSecUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurSecUserId()) == null) {
                    curSecUserId = "";
                }
                boolean z2 = !Intrinsics.LJFF(curSecUserId, this.LL.keva.getString("prev_user", ""));
                Boolean boolCacheUserAndCheckIfNewSignup = this.LL.cacheUserAndCheckIfNewSignup(c848050XOp);
                int i2 = this.LL.keva.getInt("reinstall_check_result", -1);
                IPolicyNoticeService iPolicyNoticeService = (IPolicyNoticeService) PluggableExtentionKt.pluggableSpi$default(IPolicyNoticeService.class, false, false, false, 14, null);
                String business = iPolicyNoticeService != null ? iPolicyNoticeService.getBusiness() : null;
                IDeviceCapability iDeviceCapability = (IDeviceCapability) PluggableExtentionKt.pluggableSpi$default(IDeviceCapability.class, false, false, false, 14, null);
                int i3 = (iDeviceCapability == null || !iDeviceCapability.i()) ? 0 : 1;
                IDeviceCapability iDeviceCapability2 = (IDeviceCapability) PluggableExtentionKt.pluggableSpi$default(IDeviceCapability.class, false, false, false, 14, null);
                int i4 = (iDeviceCapability2 == null || !iDeviceCapability2.k(null)) ? 0 : 1;
                final C238400w2 c238400w2 = new C238400w2();
                c238400w2.element = SystemClock.elapsedRealtime();
                C0CR2 c0cr2 = C0CR2.LIZ;
                int i5 = i;
                c0cr2.getClass();
                long j2 = C1150504el.LIZ().LJJIII;
                long jElapsedRealtime2 = j2 > 0 ? SystemClock.elapsedRealtime() - j2 : -1L;
                C2344009Gk c2344009Gk3 = new C2344009Gk();
                c2344009Gk3.LIZLLL(jElapsedRealtime2, "app_start_req_send_duration");
                c2344009Gk3.LIZJ(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0, "is_cold_start_first_launch");
                c2344009Gk3.LIZJ(C2214201BlK.LJIIJJI ? 1 : 0, "is_app_background");
                c2344009Gk3.LIZJ(C0CR2.LIZIZ.getNetworkStatus().ordinal(), "network_status");
                c2344009Gk3.LIZJ(i5, Scene.SCENE_SERVICE);
                C20684815ws.LJIILLIIL("plugin_api_req_send", c2344009Gk3.LIZ);
                INewUserJourneyAppDiffService iNewUserJourneyAppDiffService = (INewUserJourneyAppDiffService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyAppDiffService.class, false, false, false, 14, null);
                if (iNewUserJourneyAppDiffService != null) {
                    iNewUserJourneyAppDiffService.LIZ();
                }
                INewUserJourneyAppDiffService iNewUserJourneyAppDiffService2 = (INewUserJourneyAppDiffService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyAppDiffService.class, false, false, false, 14, null);
                if (iNewUserJourneyAppDiffService2 != null) {
                    iNewUserJourneyAppDiffService2.LIZ();
                    Intrinsics.LJFF(bool2, bool4);
                }
                final C10T0 cacheAgeIfNeedReBind = this.LL.getCacheAgeIfNeedReBind();
                C10SZ c10sz = new C10SZ(this.LL, bool, boolCacheUserAndCheckIfNewSignup, listLLIIII, z2, 0, "", cacheAgeIfNeedReBind, c259800zU2, z, i2, i3, i4, business);
                final C259800zU c259800zU3 = new C259800zU();
                C11O8 c11o8LJJJLZIJ = c10sz.invoke().LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ());
                final PluginService pluginService = this.LL;
                final Boolean bool5 = bool2;
                final int i6 = i;
                final Boolean bool6 = bool;
                c259800zU3.element = c11o8LJJJLZIJ.LJJLL(new C09JN() { // from class: X.10SS
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:202:0x0411  */
                    /* JADX WARN: Removed duplicated region for block: B:275:0x0680  */
                    /* JADX WARN: Removed duplicated region for block: B:302:0x0728  */
                    /* JADX WARN: Removed duplicated region for block: B:314:0x077e  */
                    /* JADX WARN: Removed duplicated region for block: B:325:0x07ab  */
                    /* JADX WARN: Removed duplicated region for block: B:361:0x0841  */
                    /* JADX WARN: Removed duplicated region for block: B:362:0x0844  */
                    /* JADX WARN: Removed duplicated region for block: B:363:0x0847  */
                    /* JADX WARN: Removed duplicated region for block: B:417:0x091d  */
                    /* JADX WARN: Type inference failed for: r4v21 */
                    /* JADX WARN: Type inference failed for: r4v217 */
                    /* JADX WARN: Type inference failed for: r4v218 */
                    /* JADX WARN: Type inference failed for: r4v22, types: [int] */
                    /* JADX WARN: Type inference failed for: r4v27 */
                    /* JADX WARN: Type inference failed for: r4v28, types: [int] */
                    /* JADX WARN: Type inference failed for: r5v30, types: [com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService] */
                    /* JADX WARN: Type inference failed for: r5v36, types: [com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService] */
                    /* JADX WARN: Type inference failed for: r6v18, types: [X.10Tj] */
                    @Override // X.C09JN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void accept(java.lang.Object r20) {
                        /*
                            Method dump skipped, instruction units count: 2414
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C10SS.accept(java.lang.Object):void");
                    }
                }, new C09JN() { // from class: X.0CTw
                    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
                    /* JADX WARN: Removed duplicated region for block: B:70:0x015b A[PHI: r0 r3 r5
                      0x015b: PHI (r0v30 java.lang.String) = (r0v28 java.lang.String), (r0v32 java.lang.String) binds: [B:65:0x0140, B:57:0x012d] A[DONT_GENERATE, DONT_INLINE]
                      0x015b: PHI (r3v6 com.ss.android.ugc.aweme.base.api.BaseResponse) = (r3v4 com.ss.android.ugc.aweme.base.api.BaseResponse), (r3v7 com.ss.android.ugc.aweme.base.api.BaseResponse) binds: [B:65:0x0140, B:57:0x012d] A[DONT_GENERATE, DONT_INLINE]
                      0x015b: PHI (r5v8 int) = (r5v6 int), (r5v9 int) binds: [B:65:0x0140, B:57:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.C09JN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void accept(java.lang.Object r13) {
                        /*
                            Method dump skipped, instruction units count: 394
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C314340CTw.accept(java.lang.Object):void");
                    }
                });
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PluginService@95b4.startPluginRequest$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PluginService@95b4.startPluginRequest$1");
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
