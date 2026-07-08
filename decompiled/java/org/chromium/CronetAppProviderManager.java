package org.chromium;

import X.AnonymousClass0803;
import X.AnonymousClass0806;
import X.C081H;
import X.C1494230ozF;
import X.C2188811AlT;
import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class CronetAppProviderManager {
    public static volatile CronetAppProviderManager sCronetAppProviderManager;
    public ICronetAppProvider mCronetAppProvider;
    public Object mCronetAppProviderAdapter;
    public ICronetDepend mCronetDepend;

    public List<String> getAbSdkVersion() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getAbSdkVersion();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return null;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getAbSdkVersion");
            return (List) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public String getBypassBOEJSON() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getBypassBOEJSON();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return null;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getBypassBOEJSON");
            return (String) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public Map<String[], Pair<byte[], byte[]>> getClientOpaqueData() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getClientOpaqueData();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return null;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getClientOpaqueData");
            return (Map) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public String getCronetSoPath() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getCronetSoPath();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return null;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getCronetSoPath");
            return (String) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public String getGetDomainDefaultJSON() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getGetDomainDefaultJSON();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return null;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getGetDomainDefaultJSON");
            return (String) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public ArrayList<byte[]> getOpaqueData() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getOpaqueData();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return null;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getOpaqueData");
            return (ArrayList) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public boolean getOptInit() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return false;
                }
                return iCronetAppProvider.getOptInit();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return false;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getOptInit");
            return ((Boolean) anonymousClass0806LIZJ.get()).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public int getProcessFlag() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return 0;
                }
                return iCronetAppProvider.getProcessFlag();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return 0;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getProcessFlag");
            return ((Integer) anonymousClass0806LIZJ.get()).intValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public Map<String, Pair<Integer, Integer>> getQuicHint() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getQuicHint();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return null;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getQuicHint");
            return (Map) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public String getStoreIdcRuleJSON() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getStoreIdcRuleJSON();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return null;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getStoreIdcRuleJSON");
            return (String) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public Map<String, String> getTNCRequestHeader() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getTNCRequestHeader();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return null;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getTNCRequestHeader");
            return (Map) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public Map<String, String> getTNCRequestQuery() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getTNCRequestQuery();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return null;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getTNCRequestQuery");
            return (Map) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public int getWifiFrequency() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return 0;
                }
                return iCronetAppProvider.getWifiFrequency();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return 0;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getWifiFrequency");
            return ((Integer) anonymousClass0806LIZJ.get()).intValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public int getWifiRssi() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return 0;
                }
                return iCronetAppProvider.getWifiRssi();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return 0;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getWifiRssi");
            return ((Integer) anonymousClass0806LIZJ.get()).intValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public boolean isBOEProxyEnabled() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return false;
                }
                return iCronetAppProvider.isBOEProxyEnabled();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return false;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("isBOEProxyEnabled");
            return ((Boolean) anonymousClass0806LIZJ.get()).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public boolean isEnableBrotli() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return false;
                }
                return iCronetAppProvider.isEnableBrotli();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return false;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("isEnableBrotli");
            return ((Boolean) anonymousClass0806LIZJ.get()).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public boolean isEnableHttp2() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return false;
                }
                return iCronetAppProvider.isEnableHttp2();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return false;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("isEnableHttp2");
            return ((Boolean) anonymousClass0806LIZJ.get()).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public boolean isEnableQuic() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return false;
                }
                return iCronetAppProvider.isEnableQuic();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return false;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("isEnableQuic");
            return ((Boolean) anonymousClass0806LIZJ.get()).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public boolean needCustomLoadLibrary() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return false;
                }
                return iCronetAppProvider.needCustomLoadLibrary();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return false;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("needCustomLoadLibrary");
            return ((Boolean) anonymousClass0806LIZJ.get()).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static CronetAppProviderManager inst() {
        if (sCronetAppProviderManager == null) {
            synchronized (CronetAppProviderManager.class) {
                try {
                    if (sCronetAppProviderManager == null) {
                        sCronetAppProviderManager = new CronetAppProviderManager();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sCronetAppProviderManager;
    }

    public String getAbi() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getAbi");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getAbi();
    }

    public String getAppId() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getAppId");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getAppId();
    }

    public String getAppName() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getAppName");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getAppName();
    }

    public long getAppStartTime() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return -1L;
                }
                return iCronetAppProvider.getAppStartTime();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return -1L;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getAppStartTime");
            return ((Long) anonymousClass0806LIZJ.get()).longValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1L;
        }
    }

    public String getCarrierRegion() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getCarrierRegion");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getCarrierRegion();
    }

    public String getChannel() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getChannel");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getChannel();
    }

    public String getDeviceBrand() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getDeviceBrand");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getDeviceBrand();
    }

    public String getDeviceId() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getDeviceId");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getDeviceId();
    }

    public String getDeviceModel() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getDeviceModel");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getDeviceModel();
    }

    public String getDevicePlatform() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getDevicePlatform");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getDevicePlatform();
    }

    public String getDeviceType() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getDeviceType");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getDeviceType();
    }

    public Map<String, String> getGetDomainDependHostMap() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                return iCronetAppProvider == null ? Collections.emptyMap() : iCronetAppProvider.getGetDomainDependHostMap();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return Collections.emptyMap();
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getGetDomainDependHostMap");
            return (Map) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return Collections.emptyMap();
        }
    }

    public String getHttpDnsRequestFlags() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getHttpDnsRequestFlags");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getHttpDnsRequestFlags();
    }

    public String getInitRegion() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getAppInitialRegionInfo");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getAppInitialRegionInfo();
    }

    public String getIsDropFirstTnc() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getIsDropFirstTnc();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return null;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getIsDropFirstTnc");
            return (String) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    public String getManifestVersionCode() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getManifestVersionCode");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getManifestVersionCode();
    }

    public String getNetAccessType() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getNetAccessType");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getNetAccessType();
    }

    public String getNetworkOperator() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                return iCronetAppProvider == null ? "" : iCronetAppProvider.getNetworkOperator();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return "";
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getNetworkOperator");
            return (String) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    public String getOSApi() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getOSApi");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getOSApi();
    }

    public String getOSVersion() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getOSVersion");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getOSVersion();
    }

    public String getRegion() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getRegion");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getRegion();
    }

    public String getSdkAppId() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getSdkAppId");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getSdkAppId();
    }

    public String getSdkVersion() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getSdkVersion");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getSdkVersion();
    }

    public String getSimOperator() {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                return iCronetAppProvider == null ? "" : iCronetAppProvider.getSimOperator();
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return "";
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ("getSimOperator");
            return (String) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    public String getStoreIdc() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getStoreIdc");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getStoreIdc();
    }

    public String getSysRegion() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getSysRegion");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getSysRegion();
    }

    public String getTNCRequestFlags() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getTNCRequestFlags");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getTNCRequestFlags();
    }

    public String getUpdateVersionCode() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getUpdateVersionCode");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getUpdateVersionCode();
    }

    public String getUserId() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getUserId");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getUserId();
    }

    public String getVersionCode() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getVersionCode");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getVersionCode();
    }

    public String getVersionName() {
        if (!C1494230ozF.LIZJ) {
            return getStringAttribute("getVersionName");
        }
        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getVersionName();
    }

    public void onColdStartFinish() {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager.inst().loggerD("CronetAppProviderManager", "onColdStartFinish ");
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onColdStartFinish();
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0803.LIZJ(obj).LIZ("onColdStartFinish");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onCronetBootSucceed() {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager.inst().loggerD("CronetAppProviderManager", "onCronetBootSucceed ");
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onCronetBootSucceed();
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0803.LIZJ(obj).LIZ("onCronetBootSucceed");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private String getStringAttribute(String str) {
        try {
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return "";
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZ(str);
            return (String) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    public void doLoadLibrary(String str) {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.doLoadLibrary(str);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0803.LIZJ(obj).LIZIZ("doLoadLibrary", new Class[]{String.class}, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onClientIPChanged(String str) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager.inst().loggerD("CronetAppProviderManager", "onClientIPChanged ");
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onClientIPChanged(str);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0803.LIZJ(obj).LIZIZ("onClientIPChanged", new Class[]{String.class}, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onEffectiveConnectionTypeChanged(int i) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onEffectiveConnectionTypeChanged type = ");
            sbLIZ.append(i);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onEffectiveConnectionTypeChangedOnIOThread(i);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0803.LIZJ(obj).LIZIZ("onEffectiveConnectionTypeChangedOnIOThread", new Class[]{Integer.TYPE}, Integer.valueOf(i));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onNetworkQualityLevelChanged(int i) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onNetworkQualityLevelChanged, nql: ");
            sbLIZ.append(i);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onNetworkQualityLevelChangedOnIOThread(i);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZIZ("onNetworkQualityLevelChangedOnIOThread", new Class[]{Integer.TYPE}, Integer.valueOf(i));
            anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onNetworkQualityTypeChangedV3(int i) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onNetworkQualityTypeChangedV3, network_quality_type = ");
            sbLIZ.append(i);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onEffectiveConnectionTypeChangedOnIOThread(i);
                AnonymousClass0803.LIZ().LIZIZ("notifyNQTChanged", new Class[]{Integer.TYPE}, Integer.valueOf(i));
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            Class<?> cls = Integer.TYPE;
            anonymousClass0806LIZJ.LIZIZ("onEffectiveConnectionTypeChangedOnIOThread", new Class[]{cls}, Integer.valueOf(i));
            try {
                AnonymousClass0803.LIZ().LIZIZ("notifyNQTChanged", new Class[]{cls}, Integer.valueOf(i));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C081H(e.getMessage(), e.getCause());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onTTNetDetectInfoChanged(String str) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onTTNetDetectInfoChanged info str = ");
            sbLIZ.append(str);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onTTNetDetectInfoChanged(str);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0803.LIZJ(obj).LIZIZ("onTTNetDetectInfoChanged", new Class[]{String.class}, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onUserSpecifiedNetworkEnabled(boolean z) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onUserSpecifiedNetworkEnabled, enable = ");
            sbLIZ.append(z);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onUserSpecifiedNetworkEnabled(z);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0803.LIZJ(obj).LIZIZ("onUserSpecifiedNetworkEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void setAdapter(Object obj) {
        if (obj != null) {
            try {
                List allInterfaces = Utils.getAllInterfaces(obj.getClass());
                if (allInterfaces != null && !allInterfaces.isEmpty()) {
                    Iterator it2 = allInterfaces.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if ("com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider".equals(((Class) it2.next()).getName())) {
                            if (CronetDependManager.inst().loggerDebug()) {
                                CronetDependManager.inst().loggerD("CronetAppProviderManager", "inject CronetAppProviderManager success");
                            }
                            this.mCronetAppProviderAdapter = obj;
                        }
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        if (obj instanceof ICronetAppProvider) {
            this.mCronetAppProvider = (ICronetAppProvider) obj;
        }
        if (obj instanceof ICronetDepend) {
            this.mCronetDepend = (ICronetDepend) obj;
        }
    }

    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCallToAddSecurityFactor info url = ");
            sbLIZ.append(str);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.onCallToAddSecurityFactor(str, map);
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return null;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            anonymousClass0806LIZJ.LIZIZ("onCallToAddSecurityFactor", new Class[]{String.class, Map.class}, str, map);
            return (Map) anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public void onDropReasonChanged(boolean z, List<Integer> list) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDropReasonChanged ");
            sbLIZ.append(z);
            sbLIZ.append(", Drop Reason List ");
            sbLIZ.append(list);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onDropReasonChanged(z, list);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0803.LIZJ(obj).LIZIZ("onDropReasonChanged", new Class[]{Boolean.TYPE, List.class}, Boolean.valueOf(z), list);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onMappingRequestStatus(String str, int i) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMappingRequestStatus key = ");
            sbLIZ.append(str);
            sbLIZ.append(" status = ");
            sbLIZ.append(i);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onMappingRequestStatus(str, i);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0803.LIZJ(obj).LIZIZ("onMappingRequestStatus", new Class[]{String.class, Integer.TYPE}, str, Integer.valueOf(i));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onMultiNetworkStateChanged(int i, int i2) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMultiNetworkStateChanged, prev state = ");
            sbLIZ.append(i);
            sbLIZ.append(", curr state = ");
            sbLIZ.append(i2);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onMultiNetworkStateChanged(i, i2);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            Class<?> cls = Integer.TYPE;
            anonymousClass0806LIZJ.LIZIZ("onMultiNetworkStateChanged", new Class[]{cls, cls}, Integer.valueOf(i), Integer.valueOf(i2));
            anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onPublicIPsChanged(List<String> list, List<String> list2) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager.inst().loggerD("CronetAppProviderManager", "onPublicIPsChanged ");
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onPublicIPsChanged(list, list2);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0803.LIZJ(obj).LIZIZ("onPublicIPsChanged", new Class[]{List.class, List.class}, list, list2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onTNCUpdateFailed(String[] strArr, String str) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager.inst().loggerD("CronetAppProviderManager", "onTNCUpdateFailed ");
        }
        if (strArr != null) {
            try {
                if (strArr.length > 0) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    Collections.addAll(arrayList, strArr);
                    if (C1494230ozF.LIZJ) {
                        ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                        if (iCronetAppProvider == null) {
                            return;
                        }
                        iCronetAppProvider.onTNCUpdateFailed(arrayList, str);
                        return;
                    }
                    Object obj = this.mCronetAppProviderAdapter;
                    if (obj == null) {
                        return;
                    }
                    AnonymousClass0803.LIZJ(obj).LIZIZ("onTNCUpdateFailed", new Class[]{ArrayList.class, String.class}, arrayList, str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void onWiFiToCellStateChanged(int i, int i2) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onWiFiToCellStateChanged, prev state = ");
            sbLIZ.append(i);
            sbLIZ.append(", curr state = ");
            sbLIZ.append(i2);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onWiFiToCellStateChanged(i, i2);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            Class<?> cls = Integer.TYPE;
            anonymousClass0806LIZJ.LIZIZ("onWiFiToCellStateChanged", new Class[]{cls, cls}, Integer.valueOf(i), Integer.valueOf(i2));
            anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void sendAppMonitorEvent(String str, String str2) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Send monitor json = ");
            sbLIZ.append(str);
            sbLIZ.append(", log type =");
            sbLIZ.append(str2);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.sendAppMonitorEvent(str, str2);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0803.LIZJ(obj).LIZIZ("sendAppMonitorEvent", new Class[]{String.class, String.class}, str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onNetworkQualityRttAndThroughputNotified(int i, int i2, int i3) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onNetworkQualityRttAndThroughputNotified, effectiveHrttMs: ");
            sbLIZ.append(i);
            sbLIZ.append(", effectiveTrttMs: ");
            sbLIZ.append(i2);
            sbLIZ.append(", effectiveRxThroughputKbps: ");
            sbLIZ.append(i3);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onNetworkQualityRttAndThroughputNotifiedOnIOThread(i, i2, i3);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            Class<?> cls = Integer.TYPE;
            anonymousClass0806LIZJ.LIZIZ("onNetworkQualityRttAndThroughputNotifiedOnIOThread", new Class[]{cls, cls, cls}, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRTTOrThroughputEstimatesComputed httpRtt = ");
            sbLIZ.append(i);
            sbLIZ.append(", transportRttMs = ");
            sbLIZ.append(i2);
            sbLIZ.append(",downstreamThroughputKbps = ");
            sbLIZ.append(i3);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onRTTOrThroughputEstimatesComputedOnIOThread(i, i2, i3);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            Class<?> cls = Integer.TYPE;
            anonymousClass0806LIZJ.LIZIZ("onRTTOrThroughputEstimatesComputedOnIOThread", new Class[]{cls, cls, cls}, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onServerConfigUpdated(String str, String str2, String str3) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onServerConfigUpdated json = ");
            sbLIZ.append(str);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onServerConfigEtagChanged(str2);
                this.mCronetAppProvider.onServerConfigABTestChanged(str3);
                this.mCronetAppProvider.onServerConfigUpdated(str);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0803.LIZJ(obj).LIZIZ("onServerConfigEtagChanged", new Class[]{String.class}, str2);
            AnonymousClass0803.LIZJ(this.mCronetAppProviderAdapter).LIZIZ("onServerConfigABTestChanged", new Class[]{String.class}, str3);
            AnonymousClass0803.LIZJ(this.mCronetAppProviderAdapter).LIZIZ("onServerConfigUpdated", new Class[]{String.class}, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onTncRequestSucceeded(boolean z, boolean z2, int i) {
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onTncRequestSucceeded(z, z2, i);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            Class<?> cls = Boolean.TYPE;
            anonymousClass0806LIZJ.LIZIZ("onTncRequestSucceeded", new Class[]{cls, cls, Integer.TYPE}, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i));
            anonymousClass0806LIZJ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onPacketLossComputed(int i, double d, double d2, double d3, double d4) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPacketLossComputed protocol = ");
            sbLIZ.append(i);
            sbLIZ.append(", upstreamLossRate = ");
            sbLIZ.append(d);
            sbLIZ.append(", upstreamLossRateVariance = ");
            sbLIZ.append(d2);
            sbLIZ.append(", downstreamLossRate = ");
            sbLIZ.append(d3);
            sbLIZ.append(", downstreamLossRateVariance = ");
            sbLIZ.append(d4);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onPacketLossComputedOnIOThread(i, d, d2, d3, d4);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            Class<?> cls = Double.TYPE;
            anonymousClass0806LIZJ.LIZIZ("onPacketLossComputedOnIOThread", new Class[]{Integer.TYPE, cls, cls, cls, cls}, Integer.valueOf(i), Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onStoreIdcChanged(String str, String str2, String str3, String str4, String str5, String str6) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager.inst().loggerD("CronetAppProviderManager", "onStoreIdcChanged ");
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onStoreIdcChanged(str, str2, str3, str4, str5, str6);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0803.LIZJ(obj).LIZIZ("onStoreIdcChanged", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, str, str2, str3, str4, str5, str6);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onTTDnsResolveResult(String str, String str2, int i, int i2, int i3, List<String> list, String str3) {
        if (CronetDependManager.inst().loggerDebug()) {
            CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onTTDnsResolveResult info uuid = ");
            sbLIZ.append(str);
            sbLIZ.append(" host: ");
            sbLIZ.append(str2);
            cronetDependManagerInst.loggerD("CronetAppProviderManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (C1494230ozF.LIZJ) {
                ICronetAppProvider iCronetAppProvider = this.mCronetAppProvider;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onTTDnsResolveResult(str, str2, i, i2, i3, list, str3);
                return;
            }
            Object obj = this.mCronetAppProviderAdapter;
            if (obj == null) {
                return;
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(obj);
            Class<?> cls = Integer.TYPE;
            anonymousClass0806LIZJ.LIZIZ("onTTDnsResolveResult", new Class[]{String.class, String.class, cls, cls, cls, List.class, String.class}, str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list, str3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
