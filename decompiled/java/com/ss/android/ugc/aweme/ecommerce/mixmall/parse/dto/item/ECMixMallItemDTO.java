package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.item;

import X.C09CT;
import X.C1569410qwV;
import X.C2333909Cn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.schema.ECMixMallSchemaDataItemDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.tab.ECMixMallMultiTabDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackDataDTO;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import defpackage.ListMapDeserializer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes27.dex */
public class ECMixMallItemDTO {
    public static final Gson LIZ;
    public static final Gson LIZIZ;

    @C09CT("data")
    public k data;

    @C09CT("exposed_data")
    public List<? extends Map<String, ? extends Object>> exposedData;

    @C09CT("exposure_data")
    public List<? extends Map<String, ? extends Object>> exposureData;

    @C09CT("exposure_data_v2")
    public List<? extends Map<String, ? extends Object>> exposureDataV2;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("ignore_index_in_list")
    public int ignoreIndexInList;

    @C09CT("impression_data")
    public h impressionData;

    @C09CT("impression_data_v2")
    public h impressionDataV2;

    @C09CT("only_one")
    public int isOnlyOne;

    @C09CT("item_data")
    public Map<String, ? extends Object> itemData;

    @C09CT("load_required")
    public int loadRequired;

    @C09CT("multi_tab")
    public ECMixMallMultiTabDTO multiTab;

    @C09CT("schema_data")
    public Map<String, ECMixMallSchemaDataItemDTO> schemaData;

    @C09CT("storage_item_list")
    public List<? extends Map<String, ? extends Object>> storageItemList;

    @C09CT("style")
    public ECMixMallStyleDTO style;

    @C09CT("track_data")
    public ECMixMallTrackDataDTO trackData;

    @C09CT("type")
    public String type;

    @C09CT("webcast_lru_cache_list")
    public h webcastLruCacheList;

    static {
        Gson gsonLIZ;
        e eVar = new e();
        eVar.LIZJ(new ListMapDeserializer(), new TypeToken<List<? extends Map<String, ? extends Object>>>() { // from class: X.0wGH
        }.getType());
        Gson gsonLIZ2 = eVar.LIZ();
        LIZ = gsonLIZ2;
        try {
            gsonLIZ = C2333909Cn.LIZ(gsonLIZ2);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            gsonLIZ = null;
        }
        if (C1569410qwV.LIZ.gsonOpt != 1 || gsonLIZ == null) {
            gsonLIZ = LIZ;
        }
        LIZIZ = gsonLIZ;
    }
}
