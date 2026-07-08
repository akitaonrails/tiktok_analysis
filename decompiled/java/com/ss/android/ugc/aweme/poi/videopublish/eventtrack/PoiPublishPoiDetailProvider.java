package com.ss.android.ugc.aweme.poi.videopublish.eventtrack;

import X.C1189060h32;
import X.C1200260hL6;
import X.C1554960qZC;
import X.C1883007Zc;
import X.C2095008Iq;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiDetails;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPublishPoiDetailProvider implements IPoiPublishExtensionProvider<C1883007Zc> {
    public final InterfaceC665370Q7z LL;

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        final String str;
        final int iIntValue;
        PoiDetails poiDetails;
        String str2;
        Integer numLJIIJJI;
        PoiDetails poiDetails2;
        String str3;
        Integer numLJIIJJI2;
        C1200260hL6 c1200260hL6;
        String str4 = null;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(this.LL, "source_default_key", C1200260hL6.class, null);
        PoiData poiData = (interfaceC1555100qZQLIZIZ == null || (c1200260hL6 = (C1200260hL6) interfaceC1555100qZQLIZIZ.getSource()) == null) ? null : c1200260hL6.LLILLL;
        if (poiData == null || (str = poiData.poiId) == null) {
            str = "";
        }
        final int iIntValue2 = 0;
        if (poiData == null || (poiDetails2 = poiData.getPoiDetails()) == null || (str3 = poiDetails2.cityCode) == null || (numLJIIJJI2 = C2095008Iq.LJIIJJI(str3)) == null) {
            iIntValue = 0;
            if (poiData != null) {
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (poiData != null && (poiDetails = poiData.getPoiDetails()) != null) {
                str4 = poiDetails.collectInfo;
            }
            C1189060h32.LIZ(str4, linkedHashMap);
            return new InterfaceC1282004zy(str, linkedHashMap, iIntValue, iIntValue2) { // from class: X.07Zc
                public final String LL;
                public final int LLILLJJLI = 0;
                public final int LLILLL;
                public final int LLILZ;
                public final Map<String, String> LLILZIL;

                @Override // X.InterfaceC1282004zy
                public final boolean checkExtraParamKey() {
                    return false;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1883007Zc)) {
                        return false;
                    }
                    C1883007Zc c1883007Zc = (C1883007Zc) obj;
                    return Intrinsics.LJFF(this.LL, c1883007Zc.LL) && this.LLILLJJLI == c1883007Zc.LLILLJJLI && this.LLILLL == c1883007Zc.LLILLL && this.LLILZ == c1883007Zc.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1883007Zc.LLILZIL);
                }

                public final int hashCode() {
                    int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31;
                    Map<String, String> map = this.LLILZIL;
                    return iHashCode + (map == null ? 0 : map.hashCode());
                }

                @Override // X.InterfaceC1282004zy
                public final Map<String, Object> keyParams() {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("poi_id", this.LL);
                    linkedHashMap2.put("poi_device_same_city", Integer.valueOf(this.LLILLJJLI));
                    linkedHashMap2.put("poi_city", Integer.valueOf(this.LLILLL));
                    linkedHashMap2.put("poi_region_code", Integer.valueOf(this.LLILZ));
                    return linkedHashMap2;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PoiPublishPoiDetailGroup(poiID=");
                    sbLIZ.append(this.LL);
                    sbLIZ.append(", poiDeviceSameCity=");
                    sbLIZ.append(this.LLILLJJLI);
                    sbLIZ.append(", poiCity=");
                    sbLIZ.append(this.LLILLL);
                    sbLIZ.append(", poiRegionCode=");
                    sbLIZ.append(this.LLILZ);
                    sbLIZ.append(", params=");
                    sbLIZ.append(this.LLILZIL);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.InterfaceC1282004zy
                public final Map<String, Object> getExtraParam() {
                    Map<String, String> map = this.LLILZIL;
                    return map == null ? new LinkedHashMap() : map;
                }

                @Override // X.InterfaceC1282004zy
                public final Map<String, Object> filteredParams() {
                    return keyParams();
                }

                {
                    this.LL = str;
                    this.LLILLL = iIntValue;
                    this.LLILZ = iIntValue2;
                    this.LLILZIL = linkedHashMap;
                }
            };
        }
        iIntValue = numLJIIJJI2.intValue();
        PoiDetails poiDetails3 = poiData.getPoiDetails();
        if (poiDetails3 != null && (str2 = poiDetails3.countryCode) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null) {
            iIntValue2 = numLJIIJJI.intValue();
        }
        final Map linkedHashMap2 = new LinkedHashMap();
        if (poiData != null) {
            str4 = poiDetails.collectInfo;
        }
        C1189060h32.LIZ(str4, linkedHashMap2);
        return new InterfaceC1282004zy(str, linkedHashMap2, iIntValue, iIntValue2) { // from class: X.07Zc
            public final String LL;
            public final int LLILLJJLI = 0;
            public final int LLILLL;
            public final int LLILZ;
            public final Map<String, String> LLILZIL;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1883007Zc)) {
                    return false;
                }
                C1883007Zc c1883007Zc = (C1883007Zc) obj;
                return Intrinsics.LJFF(this.LL, c1883007Zc.LL) && this.LLILLJJLI == c1883007Zc.LLILLJJLI && this.LLILLL == c1883007Zc.LLILLL && this.LLILZ == c1883007Zc.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1883007Zc.LLILZIL);
            }

            public final int hashCode() {
                int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31;
                Map<String, String> map = this.LLILZIL;
                return iHashCode + (map == null ? 0 : map.hashCode());
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> keyParams() {
                LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                linkedHashMap22.put("poi_id", this.LL);
                linkedHashMap22.put("poi_device_same_city", Integer.valueOf(this.LLILLJJLI));
                linkedHashMap22.put("poi_city", Integer.valueOf(this.LLILLL));
                linkedHashMap22.put("poi_region_code", Integer.valueOf(this.LLILZ));
                return linkedHashMap22;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PoiPublishPoiDetailGroup(poiID=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", poiDeviceSameCity=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", poiCity=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(", poiRegionCode=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(", params=");
                sbLIZ.append(this.LLILZIL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> getExtraParam() {
                Map<String, String> map = this.LLILZIL;
                return map == null ? new LinkedHashMap() : map;
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> filteredParams() {
                return keyParams();
            }

            {
                this.LL = str;
                this.LLILLL = iIntValue;
                this.LLILZ = iIntValue2;
                this.LLILZIL = linkedHashMap2;
            }
        };
    }

    public PoiPublishPoiDetailProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }
}
