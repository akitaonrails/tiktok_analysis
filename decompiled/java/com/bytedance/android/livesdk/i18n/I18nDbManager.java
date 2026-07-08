package com.bytedance.android.livesdk.i18n;

import X.AbstractC19484711Kz;
import X.C0OGG;
import X.C0VJ1;
import X.C1124870fNV;
import X.C1124970fNf;
import X.C11NN;
import X.C11S5;
import X.C1701940uOG;
import X.C176600m4;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C293501Bt;
import X.C325510CpR;
import X.C786410Ut5;
import X.C795950VKf;
import X.InterfaceC1125010fNj;
import X.InterfaceC1125030fNl;
import X.InterfaceC300801Eo;
import X.InterfaceC420801kM;
import X.InterfaceC795960VKg;
import Y.AfS139S0000000_17;
import Y.AfS186S0100000_17;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.i18n.I18nDbManager;
import com.bytedance.android.livesdk.i18n.db.I18nDatabase;
import com.bytedance.android.livesdk.livesetting.performance.LiveI18nCenterInitOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveI18nHotKeysDefaultSetting;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes18.dex */
public class I18nDbManager {
    public static volatile InterfaceC795960VKg informationDao;
    public static volatile boolean isPrepared;
    public static volatile InterfaceC1125010fNj translationDao;
    public List<String> cachedDeleteKeys;
    public Map<String, String> cachedTranslationMap;
    public String cachedUpdateMethod;
    public long cachedVersion;
    public String cachedVersionCtrCode;
    public InterfaceC1125030fNl dbCallback;
    public boolean isQuerying;
    public boolean isUpdating;
    public String locale;
    public volatile Keva mHotKeyCacheKeva;
    public InterfaceC420801kM queryDisposable;
    public InterfaceC420801kM updateDisposable;
    public volatile ConcurrentHashSet<Long> loadedSectionIdxs = new ConcurrentHashSet<>();
    public boolean hasCacheToUpdate = false;

    private void updateCachedContentIfNeed() {
        if (this.hasCacheToUpdate) {
            updateTranslations(this.cachedVersion, this.cachedVersionCtrCode, this.cachedDeleteKeys, this.cachedTranslationMap, this.cachedUpdateMethod);
            this.cachedVersion = -1L;
            this.cachedVersionCtrCode = "";
            this.cachedTranslationMap = null;
            this.cachedDeleteKeys = null;
            this.hasCacheToUpdate = false;
            this.cachedUpdateMethod = null;
        }
    }

    private Keva getHotKeyCacheKeva() {
        if (this.mHotKeyCacheKeva == null) {
            this.mHotKeyCacheKeva = KevaImpl.getRepo("keva_repo_key_live_i18n_hot_keys", 0);
        }
        return this.mHotKeyCacheKeva;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C1124970fNf lambda$queryTranslations$0() throws Exception {
        C1C7U.LIZ("I18nDbManager@4159.queryTranslations$1L");
        C795950VKf c795950VKf = informationDao.get("locale");
        if (c795950VKf == null) {
            throw new Exception("locale info not found in db");
        }
        if (!TextUtils.equals(this.locale, c795950VKf.LIZIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("locale in db is ");
            sbLIZ.append(c795950VKf.LIZIZ);
            sbLIZ.append(", but you are request for ");
            sbLIZ.append(this.locale);
            throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1124970fNf c1124970fNf = new C1124970fNf();
        if (C325510CpR.LIZ()) {
            C795950VKf c795950VKf2 = informationDao.get("version_ctr_code");
            if (c795950VKf2 != null) {
                c1124970fNf.LIZIZ = c795950VKf2.LIZIZ;
            }
        } else {
            C795950VKf c795950VKf3 = informationDao.get("version");
            if (c795950VKf3 == null) {
                throw new Exception("version info not found in db");
            }
            c1124970fNf.LIZ = CastLongProtector.valueOf(c795950VKf3.LIZIZ).longValue();
        }
        Map<String, String> mapFetchHotKeyTranslation = LiveI18nCenterInitOptSetting.INSTANCE.isEnable() ? fetchHotKeyTranslation() : getAllTranslations();
        if (mapFetchHotKeyTranslation != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
            sbLIZ2.append(mapFetchHotKeyTranslation.size());
            sbLIZ2.append(" translations found in db, locale is ");
            sbLIZ2.append(this.locale);
            sbLIZ2.append(", version is ");
            sbLIZ2.append(c1124970fNf.LIZ);
            C20441214yg.LIZIZ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ2));
        }
        c1124970fNf.LIZJ = mapFetchHotKeyTranslation;
        C1C7U.LIZIZ("I18nDbManager@4159.queryTranslations$1L");
        return c1124970fNf;
    }

    public void clearSectionCache() {
        this.loadedSectionIdxs.clear();
    }

    public InterfaceC420801kM clearTranslationDB() {
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo<Object>() { // from class: X.0fNi
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<Object> interfaceC2329309At) {
                I18nDbManager.translationDao.empty();
                interfaceC2329309At.onSuccess(1);
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new AfS139S0000000_17(2), new AfS139S0000000_17(1));
    }

    public void destroy() {
        C20441214yg.LIZIZ("i18n_translation", "I18nDbManager destroy");
        InterfaceC420801kM interfaceC420801kM = this.queryDisposable;
        if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
            this.queryDisposable.dispose();
        }
        InterfaceC420801kM interfaceC420801kM2 = this.updateDisposable;
        if (interfaceC420801kM2 != null && !interfaceC420801kM2.isDisposed()) {
            this.updateDisposable.dispose();
        }
        this.dbCallback = null;
    }

    public Map<String, String> fetchHotKeyTranslation() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.addAll((Collection) C293501Bt.LIZ().LJIIIIZZ(getHotKeyCacheKeva().getString("keva_key_live_i18n_hot_keys", "[]"), new TypeToken<List<String>>() { // from class: X.0fNk
            }.getType()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error when fetch hotKeys from keva, err = ");
            sbLIZ.append(e);
            C20441214yg.LJ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ));
        }
        arrayList.addAll(LiveI18nHotKeysDefaultSetting.INSTANCE.getValue().defaultHotKeys);
        try {
            for (C0VJ1 c0vj1 : translationDao.LJ(arrayList)) {
                concurrentHashMap.put(c0vj1.LIZ, c0vj1.LIZIZ);
            }
            return concurrentHashMap;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return concurrentHashMap;
        }
    }

    public Map<String, String> getAllTranslations() throws Exception {
        List<C0VJ1> all = translationDao.getAll();
        if (all == null || all.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("translations not found for locale: ");
            sbLIZ.append(this.locale);
            throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
        }
        Map<String, String> mapInitTranslationMap = initTranslationMap();
        for (C0VJ1 c0vj1 : all) {
            if (!TextUtils.isEmpty(c0vj1.LIZ) && !TextUtils.isEmpty(c0vj1.LIZIZ)) {
                mapInitTranslationMap.put(c0vj1.LIZ, c0vj1.LIZIZ);
            }
        }
        return mapInitTranslationMap;
    }

    public void queryTranslations() {
        C20441214yg.LIZIZ("i18n_translation", "query translations");
        if (this.isQuerying) {
            C20441214yg.LIZIZ("i18n_translation", "is querying, return");
        } else {
            this.isQuerying = true;
            this.queryDisposable = C11NN.LJFF(new Callable() { // from class: X.0fNn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.LL.lambda$queryTranslations$0();
                }
            }).LJIIZILJ(C11S5.LIZ()).LJIILIIL(new AfS186S0100000_17(this, 47), new AfS186S0100000_17(this, 48));
        }
    }

    private Map<String, String> initTranslationMap() {
        if (!C325510CpR.LIZ()) {
            C1124870fNV.LIZJ().getClass();
            if (!C1124870fNV.LIZLLL()) {
                return new HashMap();
            }
        }
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ void lambda$clearTranslationDB$6(Object obj) {
        C1C7U.LIZ("I18nDbManager@4159.clearTranslationDB$1L");
        C1C7U.LIZIZ("I18nDbManager@4159.clearTranslationDB$1L");
    }

    public static /* synthetic */ void lambda$clearTranslationDB$7(Throwable th) {
        C1C7U.LIZ("I18nDbManager@4159.clearTranslationDB$2L");
        C1C7U.LIZIZ("I18nDbManager@4159.clearTranslationDB$2L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryTranslations$1(C1124970fNf c1124970fNf) {
        C1C7U.LIZ("I18nDbManager@4159.queryTranslations$2L");
        this.isQuerying = false;
        InterfaceC1125030fNl interfaceC1125030fNl = this.dbCallback;
        if (interfaceC1125030fNl != null) {
            interfaceC1125030fNl.LIZ(this.locale, c1124970fNf);
        }
        C1C7U.LIZIZ("I18nDbManager@4159.queryTranslations$2L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryTranslations$2(Throwable th) {
        C1C7U.LIZ("I18nDbManager@4159.queryTranslations$3L");
        this.isQuerying = false;
        InterfaceC1125030fNl interfaceC1125030fNl = this.dbCallback;
        if (interfaceC1125030fNl != null) {
            interfaceC1125030fNl.LIZJ(this.locale, new Exception(th));
        }
        C1C7U.LIZIZ("I18nDbManager@4159.queryTranslations$3L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateTranslations$4(Boolean bool) {
        C1C7U.LIZ("I18nDbManager@4159.updateTranslations$2L");
        this.isUpdating = false;
        InterfaceC1125030fNl interfaceC1125030fNl = this.dbCallback;
        if (interfaceC1125030fNl != null) {
            interfaceC1125030fNl.LIZIZ();
        }
        updateCachedContentIfNeed();
        C1C7U.LIZIZ("I18nDbManager@4159.updateTranslations$2L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateTranslations$5(Throwable th) {
        C1C7U.LIZ("I18nDbManager@4159.updateTranslations$3L");
        this.isUpdating = false;
        InterfaceC1125030fNl interfaceC1125030fNl = this.dbCallback;
        if (interfaceC1125030fNl != null) {
            interfaceC1125030fNl.LIZLLL(new Exception(th));
        }
        updateCachedContentIfNeed();
        C1C7U.LIZIZ("I18nDbManager@4159.updateTranslations$3L");
    }

    public static void prepareInit(Context context) {
        if (!isPrepared) {
            synchronized (I18nDbManager.class) {
                try {
                    if (!isPrepared) {
                        if (context == null) {
                            return;
                        }
                        I18nDatabase i18nDatabase = (I18nDatabase) C0OGG.LIZ(C786410Ut5.N3(context), I18nDatabase.class, "i18n_live").LIZIZ();
                        translationDao = i18nDatabase.LIZIZ();
                        informationDao = i18nDatabase.LIZ();
                        isPrepared = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public synchronized C0VJ1 fetchTranslationForKey(String str) {
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
        return translationDao.LJFF(str);
    }

    public synchronized Map<String, String> fetchTranslationsOfSameSectionByKey(String str) {
        try {
            long jLIZIZ = translationDao.LIZIZ(str);
            long cachePartitionSize = LiveI18nCenterInitOptSetting.INSTANCE.getCachePartitionSize();
            long j = jLIZIZ / cachePartitionSize;
            if (this.loadedSectionIdxs.contains(Long.valueOf(j))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("section - ");
                sbLIZ.append(j);
                sbLIZ.append(" has already loaded, return directly");
                C20441214yg.LIZIZ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
            this.loadedSectionIdxs.add(Long.valueOf(j));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("do load section - ");
            sbLIZ2.append(jLIZIZ);
            sbLIZ2.append(" index from ");
            long j2 = j * cachePartitionSize;
            sbLIZ2.append(j2);
            sbLIZ2.append(" to ");
            sbLIZ2.append((j + 1) * cachePartitionSize);
            C20441214yg.LIZIZ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ2));
            List<C0VJ1> listLIZLLL = translationDao.LIZLLL(cachePartitionSize, j2);
            HashMap map = new HashMap();
            for (C0VJ1 c0vj1 : listLIZLLL) {
                map.put(c0vj1.LIZ, c0vj1.LIZIZ);
            }
            return map;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public void saveHotKeyCache(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("do save hot key cache, cache size = ");
                sbLIZ.append(map.size());
                C20441214yg.LJIIIZ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ));
                getHotKeyCacheKeva().storeString("keva_key_live_i18n_hot_keys", C293501Bt.LIZ().LJIILL(new ArrayList(map.keySet())));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("error when save hot key cache err = ");
                sbLIZ2.append(e);
                C20441214yg.LJ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public I18nDbManager(String str, InterfaceC1125030fNl interfaceC1125030fNl) {
        this.locale = str;
        this.dbCallback = interfaceC1125030fNl;
        prepareInit(C786410Ut5.N3(C176600m4.LIZ()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$updateTranslations$3(Map map, String str, List list, long j, String str2) {
        C1C7U.LIZ("I18nDbManager@4159.updateTranslations$1L");
        Set<Map.Entry> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                arrayList.add(new C0VJ1((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        if (str.equals("full")) {
            translationDao.empty();
        }
        translationDao.LIZ(arrayList);
        if (list != null && !list.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("do delete ");
            sbLIZ.append(list.size());
            sbLIZ.append(" keys");
            C20441214yg.LIZIZ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ));
            translationDao.LIZJ(list);
        }
        informationDao.LIZ(new C795950VKf("locale", this.locale));
        informationDao.LIZ(new C795950VKf("version", String.valueOf(j)));
        informationDao.LIZ(new C795950VKf("version_ctr_code", String.valueOf(str2)));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("");
        sbLIZ2.append(arrayList.size());
        sbLIZ2.append(" translations saved in db, locale is ");
        sbLIZ2.append(this.locale);
        sbLIZ2.append(", version is ");
        sbLIZ2.append(j);
        sbLIZ2.append(", versionCode is ");
        sbLIZ2.append(str2);
        C20441214yg.LIZIZ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ2));
        Boolean bool = Boolean.TRUE;
        C1C7U.LIZIZ("I18nDbManager@4159.updateTranslations$1L");
        return bool;
    }

    public void updateTranslations(final long j, final String str, final List<String> list, final Map<String, String> map, final String str2) {
        C20441214yg.LIZIZ("i18n_translation", "update translations in db");
        if (TextUtils.isEmpty(this.locale) || ((map == null || map.isEmpty()) && (list == null || list.isEmpty()))) {
            if (TextUtils.isEmpty(this.locale)) {
                C20441214yg.LJ("i18n_translation", "locale is empty, return");
                return;
            } else {
                C20441214yg.LJ("i18n_translation", "translation map or deleteKeys is empty, return");
                return;
            }
        }
        if (this.isUpdating) {
            this.hasCacheToUpdate = true;
            this.cachedVersion = j;
            this.cachedVersionCtrCode = str;
            this.cachedDeleteKeys = list;
            this.cachedTranslationMap = map;
            this.cachedUpdateMethod = str2;
            C20441214yg.LIZIZ("i18n_translation", "is updating, saved as cache and return");
            return;
        }
        this.isUpdating = true;
        this.updateDisposable = C11NN.LJFF(new Callable() { // from class: X.0fNm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.LL.lambda$updateTranslations$3(map, str2, list, j, str);
            }
        }).LJIIJ(C1701940uOG.LIZIZ()).LJIIZILJ(C11S5.LIZ()).LJIILIIL(new AfS186S0100000_17(this, 49), new AfS186S0100000_17(this, 50));
    }
}
