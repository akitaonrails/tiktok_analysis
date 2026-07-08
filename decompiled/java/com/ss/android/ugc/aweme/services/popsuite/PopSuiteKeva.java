package com.ss.android.ugc.aweme.services.popsuite;

import X.C0WQI;
import X.C0XPY;
import X.C0XQ5;
import X.C13LP;
import X.C20085613iQ;
import X.C21312118al;
import X.C21312318an;
import X.C2188811AlT;
import X.C7740030o;
import X.InterfaceC586170Myt;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.IPopSuiteManagerService;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.services.popsuite.PopupConfigApiResponse;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class PopSuiteKeva {
    public static final PopSuiteKeva INSTANCE = new PopSuiteKeva();
    public static final Keva keva = Keva.getRepo("pop_suite_keva_repo");
    public static final int $stable = 8;

    private final String getCurrAppLang() {
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        return ((ILanguageService) C0XPY.LIZIZ(ILanguageService.class)).getAppLanguage();
    }

    public final void clearCache() {
        keva.clear();
    }

    public final void initPopupConfigCacheObjectsToNull() {
        keva.storeString(getPopUpConfigKevaKey(), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), new C21312118al(0)));
    }

    private final String getPopUpConfigKevaKey() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getUserId());
        sbLIZ.append("_popup_configs_cache_");
        sbLIZ.append(getCurrAppLang());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getUserId() {
        return C0XQ5.LIZLLL();
    }

    public final C21312118al readPopupConfigDataCache() {
        Gson gson = C7740030o.LIZ().getGson();
        String string = keva.getString(getPopUpConfigKevaKey(), "");
        if (Intrinsics.LJFF(string, "")) {
            return null;
        }
        try {
            return (C21312118al) gson.LJII(string, C21312118al.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0WQI.LIZ(4, "POP_SUITE", "Error fetching popup config from keva");
            return null;
        }
    }

    public final C21312318an readPopupFreqCache(String str) {
        Gson gson = C7740030o.LIZ().getGson();
        String string = keva.getString(str, "");
        if (Intrinsics.LJFF(string, "")) {
            return new C21312318an(0);
        }
        try {
            return (C21312318an) gson.LJII(string, C21312318an.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new C21312318an(0);
        }
    }

    public final void setPopupConfigApiRespCache(PopupConfigApiResponse.PopupConfigData popupConfigData) {
        List listLJLLLL;
        List listLJLLLL2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<IPopSuiteManagerService.PopupConfigObject> list = popupConfigData.profilePopupConfigs;
        List listLJLLLL3 = null;
        if (list != null) {
            listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: com.ss.android.ugc.aweme.services.popsuite.PopSuiteKeva$setPopupConfigApiRespCache$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C20085613iQ.LIZIZ(Integer.valueOf(((IPopSuiteManagerService.PopupConfigObject) t2).priority), Integer.valueOf(((IPopSuiteManagerService.PopupConfigObject) t).priority));
                }
            }, list);
        } else {
            listLJLLLL = null;
        }
        List<IPopSuiteManagerService.PopupConfigObject> list2 = popupConfigData.inboxPopupConfigs;
        if (list2 != null) {
            listLJLLLL2 = C13LP.LJLLLL(new Comparator() { // from class: com.ss.android.ugc.aweme.services.popsuite.PopSuiteKeva$setPopupConfigApiRespCache$$inlined$sortedByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C20085613iQ.LIZIZ(Integer.valueOf(((IPopSuiteManagerService.PopupConfigObject) t2).priority), Integer.valueOf(((IPopSuiteManagerService.PopupConfigObject) t).priority));
                }
            }, list2);
        } else {
            listLJLLLL2 = null;
        }
        List<IPopSuiteManagerService.PopupConfigObject> list3 = popupConfigData.fypPopupConfigs;
        if (list3 != null) {
            listLJLLLL3 = C13LP.LJLLLL(new Comparator() { // from class: com.ss.android.ugc.aweme.services.popsuite.PopSuiteKeva$setPopupConfigApiRespCache$$inlined$sortedByDescending$3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C20085613iQ.LIZIZ(Integer.valueOf(((IPopSuiteManagerService.PopupConfigObject) t2).priority), Integer.valueOf(((IPopSuiteManagerService.PopupConfigObject) t).priority));
                }
            }, list3);
        }
        keva.storeString(getPopUpConfigKevaKey(), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), new C21312118al(listLJLLLL, listLJLLLL2, jCurrentTimeMillis, listLJLLLL3)));
    }

    public final void setPopupConfigDataCache(C21312118al c21312118al) {
        keva.storeString(getPopUpConfigKevaKey(), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), c21312118al));
    }

    public final void updatePopupFreqCache(String str, C21312318an c21312318an) {
        keva.storeString(str, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), c21312318an));
    }
}
