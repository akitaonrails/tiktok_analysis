package com.bytedance.android.livesdk.livesetting.gecko;

import X.C1161920gLG;
import X.C13BV;
import X.C2188811AlT;
import X.C2222681Bz0;
import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.GeckoSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("tt_live_gecko_cdn_base_path")
public final class TTLiveGeckoBaseUrlSetting {
    public static final TTLiveGeckoBaseUrlSetting INSTANCE = new TTLiveGeckoBaseUrlSetting();
    public static int envType = -1;
    public static int delayDownTime = -1;
    public static List<String> urlList = new ArrayList();
    public static final GeckoSetting DEFAULT = new GeckoSetting();

    private final int getEnvTypeValue() {
        if (envType < 0) {
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            envType = iHostAppContext.isBoe() ? 2 : iHostAppContext.isPpe() ? 3 : 1;
        }
        return envType;
    }

    public final long getDelayDownTime() {
        if (delayDownTime < 0) {
            GeckoSetting value = getValue();
            delayDownTime = value != null ? value.delayTriggerDownTime : 5;
        }
        return ((long) delayDownTime) * 1000;
    }

    public final GeckoSetting getValue() {
        return (GeckoSetting) SettingsManager.INSTANCE.getValueSafely("tt_live_gecko_cdn_base_path", DEFAULT);
    }

    public final boolean isEnable() {
        GeckoSetting value = getValue();
        if (value == null) {
            value = DEFAULT;
        }
        return value.isEnable;
    }

    public final GeckoSetting getDEFAULT() {
        return DEFAULT;
    }

    public final List<String> getUrlList() {
        return urlList;
    }

    public final void setUrlList(List<String> list) {
        urlList = list;
    }

    public static final List<String> getUrlList(String str, String str2) {
        GeckoSetting value;
        List<String> list;
        List<String> arrayList;
        List<String> list2;
        List<String> arrayList2;
        List<String> list3;
        List<String> list4;
        List<String> arrayList3;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!urlList.isEmpty()) {
                return INSTANCE.getCdnPath(urlList, str, str2);
            }
            TTLiveGeckoBaseUrlSetting tTLiveGeckoBaseUrlSetting = INSTANCE;
            int envTypeValue = tTLiveGeckoBaseUrlSetting.getEnvTypeValue();
            if (envTypeValue == 1) {
                GeckoSetting value2 = tTLiveGeckoBaseUrlSetting.getValue();
                if (value2 != null && (list4 = value2.urlList) != null && list4.size() > 0) {
                    GeckoSetting value3 = tTLiveGeckoBaseUrlSetting.getValue();
                    if (value3 == null || (arrayList3 = value3.urlList) == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    urlList = arrayList3;
                }
            } else if (envTypeValue == 2) {
                GeckoSetting value4 = tTLiveGeckoBaseUrlSetting.getValue();
                if (value4 != null && (list2 = value4.boeUrlList) != null && list2.size() > 0) {
                    GeckoSetting value5 = tTLiveGeckoBaseUrlSetting.getValue();
                    if (value5 == null || (arrayList2 = value5.boeUrlList) == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    urlList = arrayList2;
                }
            } else if (envTypeValue == 3 && (value = tTLiveGeckoBaseUrlSetting.getValue()) != null && (list = value.ppeUrlList) != null && list.size() > 0) {
                GeckoSetting value6 = tTLiveGeckoBaseUrlSetting.getValue();
                if (value6 == null || (arrayList = value6.ppeUrlList) == null) {
                    arrayList = new ArrayList<>();
                }
                urlList = arrayList;
            }
            if (urlList.isEmpty()) {
                int iLIZ = C2222681Bz0.LIZ();
                if (iLIZ != 2) {
                    if (iLIZ != 3) {
                        list3 = DEFAULT.LIZ;
                    } else {
                        list3 = DEFAULT.LIZJ;
                    }
                } else {
                    list3 = DEFAULT.LIZIZ;
                }
                urlList = list3;
            }
            return tTLiveGeckoBaseUrlSetting.getCdnPath(urlList, str, str2);
        }
        return C13BV.INSTANCE;
    }

    private final List<String> getCdnPath(List<String> list, String str, String str2) {
        if (!list.isEmpty() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ArrayList arrayList = new ArrayList();
            for (String str3 : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str3);
                sbLIZ.append('/');
                sbLIZ.append(str);
                sbLIZ.append('/');
                sbLIZ.append(str2);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
