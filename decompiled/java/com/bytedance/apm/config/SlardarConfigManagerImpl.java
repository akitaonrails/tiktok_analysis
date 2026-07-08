package com.bytedance.apm.config;

import X.C092U;
import X.C0BFM;
import X.C0CN5;
import X.C0V5V;
import X.C0V5Z;
import X.C2106708Nd;
import X.C2188811AlT;
import X.C2499609qs;
import X.C787900UvU;
import X.C792060V5g;
import X.C792400V6o;
import X.C792910V8n;
import X.C838410Wul;
import X.InterfaceC792020V5c;
import X.InterfaceC792030V5d;
import X.InterfaceC792050V5f;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class SlardarConfigManagerImpl implements IConfigManager {
    public C0V5Z mSlardarConfigFetcher = new C0V5Z();

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void fetchConfig() {
        boolean zLJI = MethodIDManager.LJI(138045);
        com_bytedance_apm_config_SlardarConfigManagerImpl_com_ss_android_ugc_aweme_net_TTBootPerfSlardarOptLancet_fetchConfig(this);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void com_bytedance_apm_config_SlardarConfigManagerImpl__fetchConfig$___twin___() {
        C0V5Z c0v5z = this.mSlardarConfigFetcher;
        boolean zLJIIJ = c0v5z.LJIIJ();
        if (C792400V6o.LJIIIZ()) {
            if (c0v5z.LLJILJIL > System.currentTimeMillis()) {
                zLJIIJ = true;
            }
            c0v5z.LJII(zLJIIJ);
        }
    }

    public JSONObject getConfig() {
        return this.mSlardarConfigFetcher.LLJI;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean isConfigReady() {
        return this.mSlardarConfigFetcher.LL;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public String queryConfig() {
        return this.mSlardarConfigFetcher.LJI();
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public JSONObject retrieveSettingsParams() {
        return this.mSlardarConfigFetcher.LJIIIIZZ();
    }

    public static void com_bytedance_apm_config_SlardarConfigManagerImpl_com_ss_android_ugc_aweme_net_TTBootPerfSlardarOptLancet_fetchConfig(SlardarConfigManagerImpl slardarConfigManagerImpl) {
        long j = C0BFM.LIZ;
        if (j != -1 && !C0V5V.LLILLJJLI) {
            C0CN5.LIZIZ(Long.valueOf(j), new C0V5V(slardarConfigManagerImpl));
        } else {
            slardarConfigManagerImpl.com_bytedance_apm_config_SlardarConfigManagerImpl__fetchConfig$___twin___();
        }
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public JSONObject getConfigJSON(String str) {
        JSONObject jSONObject;
        C0V5Z c0v5z = this.mSlardarConfigFetcher;
        c0v5z.getClass();
        if (!TextUtils.isEmpty(str) && (jSONObject = c0v5z.LLJI) != null) {
            return jSONObject.optJSONObject(str);
        }
        return new JSONObject();
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getLogTypeSwitch(String str) {
        C0V5Z c0v5z = this.mSlardarConfigFetcher;
        c0v5z.getClass();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(str, "block_monitor")) {
            str = "caton_monitor";
        }
        if (TextUtils.equals(str, "core_exception_monitor")) {
            return c0v5z.LLILLJJLI;
        }
        if (c0v5z.LLILLL == null || c0v5z.LLILLL.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getMetricTypeSwitch(String str) {
        C0V5Z c0v5z = this.mSlardarConfigFetcher;
        if (c0v5z.LLILZ != null && !TextUtils.isEmpty(str) && c0v5z.LLILZ.optInt(str) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getServiceSwitch(String str) {
        C0V5Z c0v5z = this.mSlardarConfigFetcher;
        if (c0v5z.LLILZIL != null && !TextUtils.isEmpty(str) && c0v5z.LLILZIL.optInt(str) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getSwitch(String str) {
        JSONObject jSONObject;
        C0V5Z c0v5z = this.mSlardarConfigFetcher;
        c0v5z.getClass();
        if (!TextUtils.isEmpty(str) && (jSONObject = c0v5z.LLJI) != null) {
            return jSONObject.optBoolean(str);
        }
        return false;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void registerConfigListener(InterfaceC792030V5d interfaceC792030V5d) {
        C0V5Z c0v5z = this.mSlardarConfigFetcher;
        if (interfaceC792030V5d == null) {
            c0v5z.getClass();
            return;
        }
        if (c0v5z.LLJJIJIL == null) {
            c0v5z.LLJJIJIL = new CopyOnWriteArrayList();
        }
        if (!((CopyOnWriteArrayList) c0v5z.LLJJIJIL).contains(interfaceC792030V5d)) {
            ((CopyOnWriteArrayList) c0v5z.LLJJIJIL).add(interfaceC792030V5d);
        }
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addConfigListener, mReady=");
            sbLIZ.append(c0v5z.LL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!c0v5z.LL) {
            return;
        }
        interfaceC792030V5d.LJFF(c0v5z.LLJI, c0v5z.LLJIJIL);
        interfaceC792030V5d.LIZ();
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void registerResponseConfigListener(InterfaceC792050V5f interfaceC792050V5f) {
        if (interfaceC792050V5f != null) {
            if (C792060V5g.LIZ == null) {
                C792060V5g.LIZ = new CopyOnWriteArrayList();
            }
            if (!((CopyOnWriteArrayList) C792060V5g.LIZ).contains(interfaceC792050V5f)) {
                ((CopyOnWriteArrayList) C792060V5g.LIZ).add(interfaceC792050V5f);
            }
        }
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void unregisterConfigListener(InterfaceC792030V5d interfaceC792030V5d) {
        C0V5Z c0v5z = this.mSlardarConfigFetcher;
        if (interfaceC792030V5d == null) {
            c0v5z.getClass();
            return;
        }
        List<InterfaceC792030V5d> list = c0v5z.LLJJIJIL;
        if (list == null) {
            return;
        }
        ((CopyOnWriteArrayList) list).remove(interfaceC792030V5d);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void unregisterResponseConfigListener(InterfaceC792050V5f interfaceC792050V5f) {
        List<InterfaceC792050V5f> list;
        if (interfaceC792050V5f != null && (list = C792060V5g.LIZ) != null) {
            ((CopyOnWriteArrayList) list).remove(interfaceC792050V5f);
        }
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean updateWithSpecificAidResult(JSONObject jSONObject) {
        return this.mSlardarConfigFetcher.LJIIJJI(jSONObject);
    }

    public void forceUpdateFromRemote(InterfaceC792020V5c interfaceC792020V5c, List<String> list) {
        C0V5Z c0v5z = this.mSlardarConfigFetcher;
        c0v5z.LJIIJ();
        if (interfaceC792020V5c != null) {
            c0v5z.LLJ = interfaceC792020V5c;
        }
        if (!C2106708Nd.LIZ(list)) {
            c0v5z.LLILZLL = new ArrayList(list);
        }
        c0v5z.LJII(true);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public int getConfigInt(String str, int i) {
        JSONObject jSONObject;
        C0V5Z c0v5z = this.mSlardarConfigFetcher;
        c0v5z.getClass();
        if (!TextUtils.isEmpty(str) && (jSONObject = c0v5z.LLJI) != null) {
            return jSONObject.optInt(str, i);
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public void initParams(boolean z, InterfaceC792020V5c interfaceC792020V5c, List<String> list) {
        ?? EmptyList;
        C0V5Z c0v5z = this.mSlardarConfigFetcher;
        c0v5z.LLJJI = z;
        c0v5z.LLJJIII = C792400V6o.LJIIIZ();
        if (c0v5z.LLIZLLLIL == null) {
            synchronized (c0v5z) {
                try {
                    if (c0v5z.LLIZLLLIL == null) {
                        c0v5z.LLIZLLLIL = C092U.LIZIZ(C792400V6o.LIZ, "monitor_config");
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        c0v5z.LLJ = interfaceC792020V5c;
        if (!C2106708Nd.LIZ(list)) {
            try {
            } catch (MalformedURLException th) {
            }
            if (!C2106708Nd.LIZ(list)) {
                EmptyList = new ArrayList(2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String host = new URL((String) ListProtector.get(list, i)).getHost();
                    if (!TextUtils.isEmpty(host) && host.indexOf(46) > 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("https://");
                        sbLIZ.append(host);
                        sbLIZ.append("/monitor/appmonitor/v5/batch_settings");
                        EmptyList.add(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            } else {
                EmptyList = Collections.emptyList();
            }
            c0v5z.LLILZLL = EmptyList;
        }
        if (!c0v5z.LLJJ) {
            c0v5z.LLJJ = true;
            if (c0v5z.LLJJIII || c0v5z.LLJJI) {
                C787900UvU.LIZ.LIZ(c0v5z);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.apm.setting.update.action");
            C2499609qs c2499609qs = new C2499609qs(c0v5z, 2);
            Context context = C792400V6o.LIZ;
            if (context != null) {
                try {
                    C838410Wul.LJFF(context, c2499609qs, intentFilter, 2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C792910V8n.LIZJ("SlardarConfigFetcher", "registerReceiver error", th2);
                }
            }
        }
    }
}
