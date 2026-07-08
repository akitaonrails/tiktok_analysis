package com.bytedance.lynx.service.resource;

import X.AbstractC1289780jfU;
import X.C1289470jez;
import X.C1471550oOf;
import X.C1471660oOq;
import X.C1474810oTv;
import X.C1475600oVC;
import X.C1476140oW4;
import X.C1476320oWM;
import X.C1476400oWU;
import X.C1522030pi5;
import X.C1530360pvW;
import X.C2187451AjH;
import X.C797990VSb;
import X.C805420Vie;
import X.InterfaceC1289770jfT;
import X.InterfaceC1301250jxz;
import X.InterfaceC1301330jy7;
import X.InterfaceC1301400jyE;
import X.InterfaceC1475560oV8;
import X.InterfaceC1476390oWT;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.ss.ttvideoengine.DataLoaderHelper;
import fyo.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public final class LynxResourceService implements InterfaceC1301330jy7 {
    public static InterfaceC1476390oWT adapter;
    public static C1522030pi5 lynxServiceConfig;
    public static LinkedHashMap<String, String> prefixMap;
    public static final LynxResourceService INSTANCE = new LynxResourceService();
    public static boolean shouldLogResourceMetaError = true;
    public static boolean shouldLogConfigError = true;
    public static final ReentrantLock lock = new ReentrantLock();

    @Override // com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ void onInitialize(Context context) {
        C1289470jez.LIZ(this, context);
    }

    private final boolean isInitial() {
        InterfaceC1476390oWT interfaceC1476390oWT;
        return (lynxServiceConfig == null || prefixMap == null || (interfaceC1476390oWT = adapter) == null || !interfaceC1476390oWT.isInitial()) ? false : true;
    }

    @Override // X.InterfaceC1301330jy7
    public boolean isReady() {
        return isInitial();
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public Class getServiceClass() {
        return InterfaceC1301330jy7.class;
    }

    private final String getPath(String str) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        Uri uri = UriProtector.parse(str);
        if (uri.getScheme() == null || !u.LJJIIJZLJL(uri.getScheme(), "http", false)) {
            return null;
        }
        return uri.getPath();
    }

    private final String getPrefix(String str) {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            String str2 = prefixMap.get(str);
            reentrantLock.unlock();
            return str2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    private final boolean isContainerGeckoResource(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bundle");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() == 0 || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel")) == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "prefix");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3.length() == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    private final boolean isFrescoLocalResource(String str) {
        if (!u.LJJIIJZLJL(str, "file://", false) && !u.LJJIIJZLJL(str, "content://", false) && !u.LJJIIJZLJL(str, "asset://", false) && !u.LJJIIJZLJL(str, "data:", false)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1301330jy7
    public int isLocalResource(String str) {
        GlobalConfigSettings.ResourceMeta resourceMeta;
        String prefixAsGeckoCDN;
        if (isInitial() && !lynxServiceConfig.LJIIJJI) {
            if (str == null || str.length() == 0 || isFrescoLocalResource(str)) {
                return 0;
            }
            if (!u.LJJIIJZLJL(str, "http", false)) {
                return -1;
            }
            GlobalConfigSettings globalConfigSettingsLJI = C797990VSb.LIZ.LJI();
            InterfaceC1476390oWT interfaceC1476390oWT = null;
            if (globalConfigSettingsLJI != null && (resourceMeta = globalConfigSettingsLJI.getResourceMeta()) != null) {
                String path = getPath(str);
                if (path == null || path.length() == 0) {
                    return 0;
                }
                if (!prefixMap.containsKey(path) || (prefixAsGeckoCDN = getPrefix(path)) == null) {
                    prefixAsGeckoCDN = "";
                }
                if ((prefixAsGeckoCDN.length() == 0 && (prefixAsGeckoCDN = queryPrefixFromUrl(str, path)) == null) || prefixAsGeckoCDN.length() == 0) {
                    InterfaceC1476390oWT interfaceC1476390oWT2 = adapter;
                    if (interfaceC1476390oWT2 != null) {
                        interfaceC1476390oWT = interfaceC1476390oWT2;
                    }
                    prefixAsGeckoCDN = interfaceC1476390oWT.getPrefixAsGeckoCDN(path);
                }
                if (prefixAsGeckoCDN.length() == 0) {
                    if (isContainerGeckoResource(str)) {
                        return -1;
                    }
                    return 0;
                }
                setPrefix(path, prefixAsGeckoCDN);
                String strPrefix2AccessKey = prefix2AccessKey(resourceMeta, prefixAsGeckoCDN);
                if (strPrefix2AccessKey != null && strPrefix2AccessKey.length() != 0) {
                    return 1;
                }
                if (!isContainerGeckoResource(str)) {
                    return 0;
                }
            } else {
                if (shouldLogResourceMetaError) {
                    LynxLog.e("LynxResourceService", "could not get any valid resource meta");
                    shouldLogResourceMetaError = false;
                }
                return 0;
            }
        }
        return -1;
    }

    private final String prefix2AccessKey(GlobalConfigSettings.ResourceMeta resourceMeta, String str) {
        GlobalConfigSettings.CurrentLevelConfig config = resourceMeta.getConfig();
        if (config == null) {
            if (shouldLogConfigError) {
                LynxLog.e("LynxResourceService", "could not get any valid config");
                shouldLogConfigError = false;
            }
            return null;
        }
        Map<String, String> prefix2AccessKey = config.getPrefix2AccessKey();
        if (prefix2AccessKey == null) {
            return null;
        }
        return prefix2AccessKey.get(str);
    }

    private final String queryPrefixFromUrl(String str, String str2) {
        boolean z;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "prefix");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        Integer numValueOf = Integer.valueOf(a0.LJJJ(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, 0, false, 6));
        if (numValueOf.intValue() == -1) {
            return "";
        }
        return str2.substring(0, numValueOf.intValue() + strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length());
    }

    private final void setPrefix(String str, String str2) {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            prefixMap.put(str, str2);
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public void addResourceLoader(Object obj, String str) {
        if (isInitial()) {
            InterfaceC1476390oWT interfaceC1476390oWT = adapter;
            if (interfaceC1476390oWT == null) {
                interfaceC1476390oWT = null;
            }
            interfaceC1476390oWT.addResourceLoader(obj, str);
        }
    }

    @Override // X.InterfaceC1301330jy7
    public void cancelPreloadMedia(String str, String str2) {
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        dataLoaderHelper.LJJ(str);
        if (str2 != null) {
            int i = 0;
            if (C1474810oTv.LJJIFFI()) {
                dataLoaderHelper.LJLJJLL.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    if (dataLoaderHelper.LJIIIIZZ != null && dataLoaderHelper.LIZIZ == 0) {
                        ArrayList arrayList = new ArrayList();
                        dataLoaderHelper.LJJ.LIZJ(1);
                        try {
                            if (dataLoaderHelper.LIZJ.LIZJ() > 0) {
                                ArrayList<C1471550oOf> arrayListLJIIIZ = dataLoaderHelper.LIZJ.LJIIIZ();
                                for (int i2 = 0; i2 < arrayListLJIIIZ.size(); i2++) {
                                    C1471550oOf c1471550oOf = arrayListLJIIIZ.get(i2);
                                    if (!TextUtils.isEmpty(c1471550oOf.LIZ) && str2.equals(c1471550oOf.LIZ)) {
                                        for (C1476320oWM c1476320oWM : (CopyOnWriteArrayList) c1471550oOf.LJIILLIIL) {
                                            if (!TextUtils.isEmpty(c1476320oWM.LIZ)) {
                                                arrayList.add(c1476320oWM.LIZ);
                                            }
                                        }
                                    }
                                }
                            }
                            if (dataLoaderHelper.LIZLLL.LIZJ() > 0) {
                                ArrayList<C1471550oOf> arrayListLJIIIZ2 = dataLoaderHelper.LIZLLL.LJIIIZ();
                                for (int i3 = 0; i3 < arrayListLJIIIZ2.size(); i3++) {
                                    C1471550oOf c1471550oOf2 = arrayListLJIIIZ2.get(i3);
                                    if (!TextUtils.isEmpty(c1471550oOf2.LIZ) && str2.equals(c1471550oOf2.LIZ)) {
                                        for (C1476320oWM c1476320oWM2 : (CopyOnWriteArrayList) c1471550oOf2.LJIILLIIL) {
                                            if (!TextUtils.isEmpty(c1476320oWM2.LIZ)) {
                                                arrayList.add(c1476320oWM2.LIZ);
                                            }
                                        }
                                    }
                                }
                            }
                            if (dataLoaderHelper.LJ.LIZJ() > 0) {
                                ArrayList<C1471550oOf> arrayListLJIIIZ3 = dataLoaderHelper.LJ.LJIIIZ();
                                for (int i4 = 0; i4 < arrayListLJIIIZ3.size(); i4++) {
                                    C1471550oOf c1471550oOf3 = arrayListLJIIIZ3.get(i4);
                                    if (!TextUtils.isEmpty(c1471550oOf3.LIZ) && str2.equals(c1471550oOf3.LIZ)) {
                                        for (C1476320oWM c1476320oWM3 : (CopyOnWriteArrayList) c1471550oOf3.LJIILLIIL) {
                                            if (!TextUtils.isEmpty(c1476320oWM3.LIZ)) {
                                                arrayList.add(c1476320oWM3.LIZ);
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        dataLoaderHelper.LJJ.LJFF(1);
                        if (arrayList.size() > 0) {
                            while (i < arrayList.size()) {
                                C1476140oW4.LIZJ((String) ListProtector.get(arrayList, i), dataLoaderHelper);
                                i++;
                            }
                            return;
                        }
                        return;
                    }
                    int i5 = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("DataLoaderHelper", "need start mdl first");
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (dataLoaderHelper.LJIIIIZZ != null && dataLoaderHelper.LIZIZ == 0) {
                    ArrayList arrayList2 = new ArrayList();
                    dataLoaderHelper.LJJ.LIZJ(1);
                    try {
                        if (dataLoaderHelper.LIZJ.LIZJ() > 0) {
                            ArrayList<C1471550oOf> arrayListLJIIIZ4 = dataLoaderHelper.LIZJ.LJIIIZ();
                            for (int i6 = 0; i6 < arrayListLJIIIZ4.size(); i6++) {
                                C1471550oOf c1471550oOf4 = arrayListLJIIIZ4.get(i6);
                                if (!TextUtils.isEmpty(c1471550oOf4.LIZ) && str2.equals(c1471550oOf4.LIZ)) {
                                    for (C1476320oWM c1476320oWM4 : (CopyOnWriteArrayList) c1471550oOf4.LJIILLIIL) {
                                        if (!TextUtils.isEmpty(c1476320oWM4.LIZ)) {
                                            arrayList2.add(c1476320oWM4.LIZ);
                                        }
                                    }
                                }
                            }
                        }
                        if (dataLoaderHelper.LIZLLL.LIZJ() > 0) {
                            ArrayList<C1471550oOf> arrayListLJIIIZ5 = dataLoaderHelper.LIZLLL.LJIIIZ();
                            for (int i7 = 0; i7 < arrayListLJIIIZ5.size(); i7++) {
                                C1471550oOf c1471550oOf5 = arrayListLJIIIZ5.get(i7);
                                if (!TextUtils.isEmpty(c1471550oOf5.LIZ) && str2.equals(c1471550oOf5.LIZ)) {
                                    for (C1476320oWM c1476320oWM5 : (CopyOnWriteArrayList) c1471550oOf5.LJIILLIIL) {
                                        if (!TextUtils.isEmpty(c1476320oWM5.LIZ)) {
                                            arrayList2.add(c1476320oWM5.LIZ);
                                        }
                                    }
                                }
                            }
                        }
                        if (dataLoaderHelper.LJ.LIZJ() > 0) {
                            ArrayList<C1471550oOf> arrayListLJIIIZ6 = dataLoaderHelper.LJ.LJIIIZ();
                            for (int i8 = 0; i8 < arrayListLJIIIZ6.size(); i8++) {
                                C1471550oOf c1471550oOf6 = arrayListLJIIIZ6.get(i8);
                                if (!TextUtils.isEmpty(c1471550oOf6.LIZ) && str2.equals(c1471550oOf6.LIZ)) {
                                    for (C1476320oWM c1476320oWM6 : (CopyOnWriteArrayList) c1471550oOf6.LJIILLIIL) {
                                        if (!TextUtils.isEmpty(c1476320oWM6.LIZ)) {
                                            arrayList2.add(c1476320oWM6.LIZ);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    dataLoaderHelper.LJJ.LJFF(1);
                    if (arrayList2.size() > 0) {
                        while (i < arrayList2.size()) {
                            dataLoaderHelper.LJJ((String) ListProtector.get(arrayList2, i));
                            i++;
                        }
                        return;
                    }
                    return;
                }
                int i9 = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("DataLoaderHelper", "need start mdl first");
            }
        }
    }

    public InterfaceC1289770jfT fetchResourceSync(String str, C1530360pvW c1530360pvW) {
        if (!isInitial()) {
            LynxLog.e("LynxResourceService", "Please initialize before call fetchResourceSync.");
            return new C1476400oWU("LynxResourceService is Not initialized");
        }
        if (str != null && str.length() != 0) {
            String path = getPath(str);
            if (path != null && path.length() != 0) {
                InterfaceC1476390oWT interfaceC1476390oWT = adapter;
                if (interfaceC1476390oWT == null) {
                    interfaceC1476390oWT = null;
                }
                return interfaceC1476390oWT.fetchResourceSync(str, c1530360pvW);
            }
            return new C1476400oWU("invalid url");
        }
        return new C1476400oWU("empty url");
    }

    public final void initialize(C1522030pi5 c1522030pi5, InterfaceC1476390oWT interfaceC1476390oWT) {
        lynxServiceConfig = c1522030pi5;
        adapter = interfaceC1476390oWT;
        interfaceC1476390oWT.initLynxResourceServiceAdapter(c1522030pi5);
        prefixMap = new LinkedHashMap<String, String>() { // from class: X.0jvC
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, String>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, String>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<String> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<String> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsKey((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsValue((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
                if (size() > 16) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(String str) {
                return super.containsValue((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ String get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ String remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ String get(String str) {
                return (String) super.get((Object) str);
            }

            public /* bridge */ String remove(String str) {
                return (String) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (String) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof String)) {
                    return false;
                }
                return remove((String) obj, (String) obj2);
            }

            public final /* bridge */ String getOrDefault(Object obj, String str) {
                if (!(obj instanceof String)) {
                    return str;
                }
                return getOrDefault((String) obj, str);
            }

            public /* bridge */ boolean remove(String str, String str2) {
                return super.remove((Object) str, (Object) str2);
            }

            public /* bridge */ String getOrDefault(String str, String str2) {
                return (String) super.getOrDefault((Object) str, str2);
            }
        };
    }

    @Override // X.InterfaceC1301330jy7
    public InterfaceC1301400jyE fetchResourceAsync(String str, C1530360pvW c1530360pvW, AbstractC1289780jfU abstractC1289780jfU) {
        boolean zLJI = MethodIDManager.LJI(137361);
        InterfaceC1476390oWT interfaceC1476390oWT = null;
        if (!isInitial()) {
            LynxLog.e("LynxResourceService", "Please initialize before call fetchResourceAsync.");
            abstractC1289780jfU.LIZ(new C1476400oWU("LynxResourceService is Not initialized"));
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return null;
        }
        if (str != null && str.length() != 0) {
            String path = getPath(str);
            if (path != null && path.length() != 0) {
                InterfaceC1476390oWT interfaceC1476390oWT2 = adapter;
                if (interfaceC1476390oWT2 != null) {
                    interfaceC1476390oWT = interfaceC1476390oWT2;
                }
                InterfaceC1301400jyE interfaceC1301400jyEFetchResourceAsync = interfaceC1476390oWT.fetchResourceAsync(str, c1530360pvW, abstractC1289780jfU);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return interfaceC1301400jyEFetchResourceAsync;
            }
            abstractC1289780jfU.LIZ(new C1476400oWU("invalid url"));
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return null;
        }
        abstractC1289780jfU.LIZ(new C1476400oWU("empty url"));
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return null;
    }

    @Override // X.InterfaceC1301330jy7
    public void preloadMedia(String str, String str2, String str3, long j, final InterfaceC1301250jxz interfaceC1301250jxz) {
        C1475600oVC c1475600oVC = new C1475600oVC(j, str2, str3, new String[]{str});
        if (interfaceC1301250jxz != null) {
            c1475600oVC.LJIIJ = new InterfaceC1475560oV8() { // from class: X.0jy1
                @Override // X.InterfaceC1475560oV8
                public final void LIZ(C1475490oV1 c1475490oV1) {
                    String str4;
                    int i = c1475490oV1.LIZ;
                    if (i == 2) {
                        ((C1301260jy0) ((C1301240jxy) interfaceC1301250jxz).LIZ).LIZ(0, "");
                        return;
                    }
                    if (i != 3) {
                        return;
                    }
                    e eVar = c1475490oV1.LIZJ;
                    if (eVar == null || (str4 = eVar.LIZLLL) == null) {
                        str4 = "preload media failed";
                    }
                    ((C1301260jy0) ((C1301240jxy) interfaceC1301250jxz).LIZ).LIZ(-1, str4);
                }
            };
        }
        C805420Vie.LIZ.LJIIZILJ(c1475600oVC);
    }
}
