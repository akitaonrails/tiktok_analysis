package com.ss.ugc.effectplatform.task;

import X.C01GW;
import X.C04WP;
import X.C0XSU;
import X.C0XSV;
import X.C13LD;
import X.C13MA;
import X.C13OD;
import X.C13OQ;
import X.C13R7;
import X.C13RD;
import X.C13RE;
import X.C13SS;
import X.C1535105zh;
import X.C15438062q;
import X.C1630480sX0;
import X.C1633190sbN;
import X.C1662010tLr;
import X.C19997513Mf;
import X.C2097608Jq;
import X.C2188811AlT;
import X.InterfaceC1633730scF;
import X.InterfaceC20004513Ox;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectFilterReq;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.ugc.effectplatform.model.HorizontalEffectsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes31.dex */
public class FetchHorizontalEffectsTask extends C13OD<HorizontalEffectsModel, HorizontalEffectsResponse> {
    public final C13RD effectConfig;
    public final Map<String, String> extraParams;
    public long fileSize;
    public final Map<String, String> horizontalEffectsRequestParam;
    public final String insertString;
    public final String panel;
    public final String taskId;
    public final int whitelistScene;

    public Map<String, Object> addMobPanelInfoMap(Map<String, ? extends Object> map) {
        return map;
    }

    @Override // X.C13OD
    public C0XSU buildRequest() throws Throwable {
        String strLIZIZ;
        String strConvertObjToJson;
        HashMap mapLIZ = C13RE.LIZ(this.effectConfig, true);
        mapLIZ.put("panel", this.panel);
        mapLIZ.putAll(this.horizontalEffectsRequestParam);
        Map<String, String> map = this.extraParams;
        if (map != null) {
            mapLIZ.putAll(map);
        }
        int i = this.whitelistScene;
        if (i != 0) {
            EffectFilterReq effectFilterReqLIZJ = C1630480sX0.LIZJ(i);
            C13R7 c13r7 = this.effectConfig.LJIJI;
            if (c13r7 == null || (strConvertObjToJson = c13r7.LIZ.convertObjToJson(effectFilterReqLIZJ)) == null) {
                strConvertObjToJson = "";
            }
            mapLIZ.put("allow_list", strConvertObjToJson);
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("internal_horizontal_effects_settings", false)) {
            strLIZIZ = "https://tiktok-effect-internal-api-ap.tiktok-row.net/api/internal/meta/horizontal/effects";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.effectConfig.LJJIIJZLJL);
            this.effectConfig.getClass();
            sbLIZ.append("/effect/api");
            sbLIZ.append("/effect/horizontal/effects");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return new C0XSU(C1535105zh.LIZ(mapLIZ, strLIZIZ), null, C0XSV.GET, null, null, false, null, null, 1018);
    }

    @Override // X.C13OD, X.AbstractC20000013Ne
    public void onCancel() {
        if (!C04WP.LIZ()) {
            super.onCancel();
        } else {
            this.effectConfig.LJJJIL.LIZJ(this.taskId);
        }
    }

    private final HorizontalEffectsResponse fillInCacheTag(HorizontalEffectsResponse horizontalEffectsResponse) {
        HorizontalEffectsModel horizontalEffectsModelCopy;
        ArrayList arrayList;
        ArrayList arrayList2;
        HorizontalEffectsResponse horizontalEffectsResponseCopy = horizontalEffectsResponse.copy(horizontalEffectsResponse.data, horizontalEffectsResponse.message, horizontalEffectsResponse.status_code);
        HorizontalEffectsModel responseData = horizontalEffectsResponseCopy.getResponseData();
        HorizontalEffectsModel horizontalEffectsModel = null;
        ArrayList arrayList3 = null;
        horizontalEffectsModel = null;
        if (responseData != null && (horizontalEffectsModelCopy = responseData.copy(responseData.trending_effects, responseData.favorite_effects, responseData.recent_effects, responseData.insert_effects, responseData.left_trending_effects, responseData.url_prefix, responseData.from_cache, responseData.logId)) != null) {
            List<? extends Effect> list = horizontalEffectsModelCopy.trending_effects;
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<? extends Effect> it2 = list.iterator();
            while (it2.hasNext()) {
                Effect effect = new Effect(it2.next());
                effect.set_cached_data(true);
                arrayList4.add(effect);
            }
            horizontalEffectsModelCopy.setTrending_effects(arrayList4);
            List<? extends Effect> list2 = horizontalEffectsModelCopy.insert_effects;
            if (list2 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<? extends Effect> it3 = list2.iterator();
                while (it3.hasNext()) {
                    Effect effect2 = new Effect(it3.next());
                    effect2.set_cached_data(true);
                    arrayList.add(effect2);
                }
            } else {
                arrayList = null;
            }
            horizontalEffectsModelCopy.setInsert_effects(arrayList);
            List<? extends Effect> list3 = horizontalEffectsModelCopy.recent_effects;
            if (list3 != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator<? extends Effect> it4 = list3.iterator();
                while (it4.hasNext()) {
                    Effect effect3 = new Effect(it4.next());
                    effect3.set_cached_data(true);
                    arrayList2.add(effect3);
                }
            } else {
                arrayList2 = null;
            }
            horizontalEffectsModelCopy.setRecent_effects(arrayList2);
            List<? extends Effect> list4 = horizontalEffectsModelCopy.favorite_effects;
            if (list4 != null) {
                arrayList3 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                Iterator<? extends Effect> it5 = list4.iterator();
                while (it5.hasNext()) {
                    Effect effect4 = new Effect(it5.next());
                    effect4.set_cached_data(true);
                    arrayList3.add(effect4);
                }
            }
            horizontalEffectsModelCopy.setFavorite_effects(arrayList3);
            horizontalEffectsModel = horizontalEffectsModelCopy;
        }
        horizontalEffectsResponseCopy.setData(horizontalEffectsModel);
        return horizontalEffectsResponseCopy;
    }

    private final void saveHorizontalToCache(String str, HorizontalEffectsResponse horizontalEffectsResponse) {
        String strConvertObjToJson;
        boolean z;
        String strConvertObjToJson2;
        String strLJIIIIZZ = C13OQ.LJIIIIZZ(this.whitelistScene, this.insertString);
        HorizontalEffectsResponse horizontalEffectsResponseFillInCacheTag = fillInCacheTag(horizontalEffectsResponse);
        try {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            long jLJIIJ = 0;
            if (z && this.isJsonOptimize) {
                InterfaceC20004513Ox interfaceC20004513Ox = this.effectConfig.LJJIFFI;
                if (interfaceC20004513Ox != null) {
                    jLJIIJ = interfaceC20004513Ox.LJIIJ(strLJIIIIZZ, str, "");
                }
                this.fileSize = jLJIIJ / ((long) 1024);
            } else {
                C13R7 c13r7 = this.effectConfig.LJIJI;
                if (c13r7 != null) {
                    strConvertObjToJson2 = c13r7.LIZ.convertObjToJson(horizontalEffectsResponseFillInCacheTag);
                    if (strConvertObjToJson2 != null) {
                        InterfaceC20004513Ox interfaceC20004513Ox2 = this.effectConfig.LJJIFFI;
                        if (interfaceC20004513Ox2 != null) {
                            jLJIIJ = interfaceC20004513Ox2.LJIIJ(strLJIIIIZZ, strConvertObjToJson2, "");
                        }
                        this.fileSize = jLJIIJ / ((long) 1024);
                    }
                } else {
                    strConvertObjToJson2 = null;
                }
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NewFetchHorizontal Effects Task saved to cache, key: ");
                sbLIZ.append(strLJIIIIZZ);
                sbLIZ.append(", jsonString: ");
                sbLIZ.append(strConvertObjToJson2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZ("effect_request_chine_tag", strLIZIZ);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            C01GW c01gw = C1633190sbN.LIZ;
            ((Keva) c01gw.getValue()).storeLong(strLJIIIIZZ, jCurrentTimeMillis);
            ((Keva) c01gw.getValue()).storeBoolean("has_save_cache_tag", true);
            Keva.getRepo("keva_ep_download_repo").storeBoolean("main_camera_proxy_sync_flag", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS c13ss2 = C13SS.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Exception: ");
            sbLIZ2.append(e);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c13ss2.getClass();
            C13SS.LIZIZ("NewFetchHorizontal Effects Task saved to cache", strLIZIZ2, null);
        }
        try {
            Version version = new Version(CardStruct.IStatusCode.DEFAULT, this.logId);
            C13R7 c13r72 = this.effectConfig.LJIJI;
            if (c13r72 != null && (strConvertObjToJson = c13r72.LIZ.convertObjToJson(version)) != null) {
                String strLJIIJ = C13OQ.LJIIJ(this.whitelistScene, this.insertString);
                InterfaceC20004513Ox interfaceC20004513Ox3 = this.effectConfig.LJJIFFI;
                if (interfaceC20004513Ox3 != null) {
                    interfaceC20004513Ox3.LJIIJ(strLJIIJ, strConvertObjToJson, "");
                }
                C13SS c13ss3 = C13SS.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("NewFetchHorizontal Effects Task saved to cache, key: ");
                sbLIZ3.append(strLJIIJ);
                sbLIZ3.append(", jsonString: ");
                sbLIZ3.append(strConvertObjToJson);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                c13ss3.getClass();
                C13SS.LIZ("effect_request_chine_tag", strLIZIZ3);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C13SS.LIZ.getClass();
            C13SS.LIZIZ("FetchPanelInfoTask", "Json Exception: " + e2, null);
        }
    }

    @Override // X.C13OD
    public HorizontalEffectsResponse parseResponse(C13R7 c13r7, String str) {
        return (HorizontalEffectsResponse) c13r7.LIZ.convertJsonToObj(str, HorizontalEffectsResponse.class);
    }

    @Override // X.C13OD
    public void onFailure(String str, String str2, C1662010tLr c1662010tLr) {
        if (C04WP.LIZ()) {
            C13MA c13maLIZ = this.effectConfig.LJJJIL.LIZ(this.taskId);
            if (c13maLIZ != null) {
                c13maLIZ.onFail(null, c1662010tLr);
            }
            this.effectConfig.LJJJIL.LIZJ(this.taskId);
            return;
        }
        super.onFailure(str, str2, c1662010tLr);
    }

    @Override // X.C13OD
    public void onSuccess(long j, long j2, long j3, HorizontalEffectsResponse horizontalEffectsResponse) {
        if (!C04WP.LIZ()) {
            super.onSuccess(j, j2, j3, horizontalEffectsResponse);
            return;
        }
        HorizontalEffectsModel responseData = horizontalEffectsResponse.getResponseData();
        if (responseData == null) {
            return;
        }
        C13MA c13maLIZ = this.effectConfig.LJJJIL.LIZ(this.taskId);
        if (c13maLIZ != null) {
            c13maLIZ.onSuccess(responseData);
        }
        this.effectConfig.LJJJIL.LIZJ(this.taskId);
    }

    @Override // X.C13OD
    public void onSuccess(long j, long j2, long j3, String str, HorizontalEffectsResponse horizontalEffectsResponse) {
        C13LD c13ld = C13LD.LIZ;
        C13RD c13rd = this.effectConfig;
        String str2 = this.panel;
        HorizontalEffectsModel data = horizontalEffectsResponse.getData();
        String str3 = this.logId;
        boolean z = this.effectConfig.LJJJJLL;
        c13ld.getClass();
        C13LD.LIZLLL(c13rd, str2, data, str3, z);
        super.onSuccess(j, j2, j3, str, horizontalEffectsResponse);
        Map<String, ? extends Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("log_id", this.logId), new Pair("panel", this.panel), new Pair("category", "full_horizontal"), new Pair("duration", Long.valueOf(System.currentTimeMillis() - j)), new Pair("network_time", Long.valueOf(j2 - j)), new Pair("json_time", Long.valueOf(j3 - j2)), new Pair("io_time", Long.valueOf(System.currentTimeMillis() - j3)), new Pair("size", Long.valueOf(this.fileSize)), new Pair("url_path", "/effect/horizontal/effects"));
        C13RD c13rd2 = this.effectConfig;
        InterfaceC1633730scF interfaceC1633730scF = c13rd2.LJIJJLI;
        if (interfaceC1633730scF != null) {
            addMobPanelInfoMap(mapLJIIIIZZ);
            C19997513Mf.LIZ(interfaceC1633730scF, true, "full_width_horizontal", c13rd2, mapLJIIIIZZ, "");
        }
        saveHorizontalToCache(str, horizontalEffectsResponse);
    }

    public FetchHorizontalEffectsTask(Map<String, String> map, C13RD c13rd, String str, String str2, String str3, int i, Map<String, String> map2) {
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str, null);
        this.horizontalEffectsRequestParam = map;
        this.effectConfig = c13rd;
        this.taskId = str;
        this.panel = str2;
        this.insertString = str3;
        this.whitelistScene = i;
        this.extraParams = map2;
    }
}
