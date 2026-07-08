package com.ss.android.ugc.aweme.poi.map;

import X.C1186790gzN;
import X.C1188440h22;
import X.C1188460h24;
import X.C1188530h2B;
import X.C1189060h32;
import X.C1200940hMC;
import X.C1976907ol;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapPageInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String string;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (string = uri.toString()) == null || !a0.LJJIIZI(string, "//poi/map", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String stringExtra;
        String stringExtra2;
        Serializable serializableExtra;
        LocationDetailMobParam locationDetailMobParam;
        Serializable serializableExtra2;
        boolean zLIZIZ;
        String poiInfoSource;
        String poiCityCode;
        String poiRegionCode;
        String fromGroupId;
        Intent extra;
        String poiInfoSource2;
        String poiCityCode2;
        String poiRegionCode2;
        String collectInfo;
        String stringExtra3;
        Intent extra2;
        Intent extra3;
        Intent extra4;
        Intent extra5;
        Intent extra6;
        Intent extra7;
        if (routeIntent != null && (extra7 = routeIntent.getExtra()) != null) {
            extra7.putExtra("page_start_ts", System.currentTimeMillis());
        }
        String fromGroupId2 = null;
        String str = "";
        if (routeIntent == null || (extra6 = routeIntent.getExtra()) == null) {
            stringExtra = "";
        } else {
            try {
                stringExtra = extra6.getStringExtra("poi_id");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        }
        if (routeIntent == null || (extra5 = routeIntent.getExtra()) == null) {
            stringExtra2 = "";
        } else {
            try {
                stringExtra2 = extra5.getStringExtra("enter_method");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
        }
        C1188460h24.LIZ.getClass();
        C1188440h22 c1188440h22LIZIZ = C1188460h24.LIZIZ(stringExtra);
        if (routeIntent != null && (extra4 = routeIntent.getExtra()) != null) {
            serializableExtra = extra4.getSerializableExtra("mob_param");
        } else {
            serializableExtra = null;
        }
        if (!(serializableExtra instanceof LocationDetailMobParam) || (locationDetailMobParam = (LocationDetailMobParam) serializableExtra) == null) {
            locationDetailMobParam = new LocationDetailMobParam(c1188440h22LIZIZ, stringExtra2, null, null, null, null, null, null, null, null, null, null);
        }
        if (routeIntent != null && (extra3 = routeIntent.getExtra()) != null) {
            C1186790gzN.LJ(extra3, "mob_param", locationDetailMobParam);
        }
        if (routeIntent != null && (extra2 = routeIntent.getExtra()) != null) {
            serializableExtra2 = extra2.getSerializableExtra("poi_collect_mob_data");
        } else {
            serializableExtra2 = null;
        }
        if (!(serializableExtra2 instanceof C1188530h2B)) {
            serializableExtra2 = null;
        }
        if (serializableExtra2 == null) {
            if (context != null) {
                C1200940hMC.LIZ.getClass();
                zLIZIZ = C1200940hMC.LIZIZ(context);
            } else {
                zLIZIZ = false;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from", "poi_map");
            linkedHashMap.put("enter_method", "click_button_map");
            linkedHashMap.put("page_poi_id", stringExtra);
            C1188440h22 c1188440h22 = locationDetailMobParam.data;
            if (c1188440h22 == null || (poiInfoSource = c1188440h22.getPoiInfoSource()) == null) {
                poiInfoSource = "";
            }
            linkedHashMap.put("page_poi_info_source", poiInfoSource);
            C1188440h22 c1188440h222 = locationDetailMobParam.data;
            if (c1188440h222 == null || (poiCityCode = c1188440h222.getPoiCityCode()) == null) {
                poiCityCode = "";
            }
            linkedHashMap.put("page_poi_city", poiCityCode);
            C1188440h22 c1188440h223 = locationDetailMobParam.data;
            if (c1188440h223 == null || (poiRegionCode = c1188440h223.getPoiRegionCode()) == null) {
                poiRegionCode = "";
            }
            linkedHashMap.put("page_poi_region_code", poiRegionCode);
            linkedHashMap.put("enable_location", C1189060h32.LJJIJ(zLIZIZ));
            String str2 = locationDetailMobParam.entranceEnterPage;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("previous_page", str2);
            C1188440h22 c1188440h224 = locationDetailMobParam.data;
            if (c1188440h224 == null || (fromGroupId = c1188440h224.getFromGroupId()) == null) {
                fromGroupId = "";
            }
            linkedHashMap.put("from_group_id", fromGroupId);
            Map<String, String> map = locationDetailMobParam.searchParams;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    linkedHashMap.put(key, value);
                }
            }
            if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                Intent extra8 = routeIntent.getExtra();
                if (extra8 != null) {
                    try {
                        String stringExtra4 = extra8.getStringExtra("enter_from");
                        if (stringExtra4 != null) {
                            str = stringExtra4;
                        }
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
                if (c1188440h22LIZIZ != null) {
                    poiInfoSource2 = c1188440h22LIZIZ.getPoiInfoSource();
                    poiCityCode2 = c1188440h22LIZIZ.getPoiCityCode();
                    poiRegionCode2 = c1188440h22LIZIZ.getPoiRegionCode();
                } else {
                    poiInfoSource2 = null;
                    poiCityCode2 = null;
                    poiRegionCode2 = null;
                }
                int iLJJIIZ = C1189060h32.LJJIIZ(Boolean.valueOf(zLIZIZ));
                if (c1188440h22LIZIZ != null) {
                    fromGroupId2 = c1188440h22LIZIZ.getFromGroupId();
                    collectInfo = c1188440h22LIZIZ.getCollectInfo();
                } else {
                    collectInfo = null;
                }
                Intent extra9 = routeIntent.getExtra();
                if (extra9 != null) {
                    try {
                        stringExtra3 = extra9.getStringExtra("page_model");
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                    if (stringExtra3 == null) {
                        stringExtra3 = "detail";
                    }
                    C1186790gzN.LJ(extra, "poi_collect_mob_data", new C1188530h2B(str, stringExtra2, null, iLJJIIZ, stringExtra3, null, null, null, null, null, null, stringExtra, poiInfoSource2, poiCityCode2, poiRegionCode2, null, null, null, stringExtra, null, null, null, null, null, null, collectInfo, new LinkedHashMap(), fromGroupId2, null, null, null, linkedHashMap));
                } else {
                    stringExtra3 = "detail";
                    C1186790gzN.LJ(extra, "poi_collect_mob_data", new C1188530h2B(str, stringExtra2, null, iLJJIIZ, stringExtra3, null, null, null, null, null, null, stringExtra, poiInfoSource2, poiCityCode2, poiRegionCode2, null, null, null, stringExtra, null, null, null, null, null, null, collectInfo, new LinkedHashMap(), fromGroupId2, null, null, null, linkedHashMap));
                }
            }
        }
        return false;
    }
}
