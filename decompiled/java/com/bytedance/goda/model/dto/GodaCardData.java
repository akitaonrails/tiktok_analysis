package com.bytedance.goda.model.dto;

import X.C09CS;
import X.C09CT;
import X.C19719512Dh;
import com.bytedance.goda.model.adapter.GodaCardDataAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@C09CS(GodaCardDataAdapter.class)
public final class GodaCardData {
    public transient Object LIZ;

    @C09CT("features")
    public final GodaCardDataFeature features;

    @C09CT("fields")
    public final Map<String, Object> fields;

    public GodaCardData() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GodaCardData)) {
            return false;
        }
        GodaCardData godaCardData = (GodaCardData) obj;
        return Intrinsics.LJFF(this.fields, godaCardData.fields) && Intrinsics.LJFF(this.LIZ, godaCardData.LIZ) && Intrinsics.LJFF(this.features, godaCardData.features);
    }

    public final Integer LIZ() {
        Map map;
        Map<String, Object> map2 = this.fields;
        if (map2 == null || map2.get("mobile_config") == null) {
            return null;
        }
        Object obj = this.fields.get("mobile_config");
        Object obj2 = (!(obj instanceof Map) || (map = (Map) obj) == null) ? null : map.get("brick_name");
        if (obj2 instanceof Integer) {
            return (Integer) obj2;
        }
        return null;
    }

    public final boolean LIZIZ() {
        Map map;
        Map<String, Object> map2 = this.fields;
        if (map2 == null || map2.get("mobile_config") == null) {
            return false;
        }
        Object obj = this.fields.get("mobile_config");
        Object obj2 = (!(obj instanceof Map) || (map = (Map) obj) == null) ? null : map.get("is_promotion_card");
        return Intrinsics.LJFF(obj2 instanceof Boolean ? obj2 : null, Boolean.TRUE);
    }

    public final void LIZJ(Map<String, ? extends Object> map) {
        Object obj;
        Map map2;
        Map<String, Object> map3 = this.fields;
        List<String> list = null;
        if (map3 != null && map3.get("mobile_config") != null) {
            Object obj2 = this.fields.get("mobile_config");
            if ((obj2 instanceof Map) && (map2 = (Map) obj2) != null) {
                obj = map2.get("mobile_field_keys");
            } else {
                obj = null;
            }
            if (C19719512Dh.LJI(obj)) {
                list = (List) obj;
            }
            synchronized (this.fields) {
                if (list != null) {
                    try {
                        for (String str : list) {
                            this.fields.put(str, map.get(str));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    public GodaCardData(Map<String, Object> map, Object obj, GodaCardDataFeature godaCardDataFeature) {
        this.fields = map;
        this.LIZ = obj;
        this.features = godaCardDataFeature;
    }
}
