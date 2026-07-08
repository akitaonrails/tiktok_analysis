package com.ss.android.ugc.aweme.feed.model.live;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AwS575S0100000_31;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class FYPCommerceStruct implements Serializable {

    @C09CT("commerce_permission")
    public Long commercePermission;

    @C09CT("oec_live_preview_room_data")
    public String oecLivePreviewRoomData;

    @C09CT("pop_product_id")
    public Long popProductId;

    @C09CT("preview_product_card_info")
    public PreviewProductCardInfo previewProductCardInfo;

    @C09CT("product_num")
    public Long productNum;
    public final transient C01GW oecLivePreviewRoomDataObject$delegate = C452501pT.LIZIZ(new AwS575S0100000_31(this, 682));
    public final transient C01GW cachedPreviewDaInfoMap$delegate = C452501pT.LIZIZ(new AwS575S0100000_31(this, 681));

    private final Map<String, String> getCachedPreviewDaInfoMap() {
        return (Map) this.cachedPreviewDaInfoMap$delegate.getValue();
    }

    public final OecLivePreviewRoomData getOecLivePreviewRoomDataObject() {
        return (OecLivePreviewRoomData) this.oecLivePreviewRoomDataObject$delegate.getValue();
    }

    public final Map<String, String> parsePreviewDaInfoNested() {
        HashMap map;
        String str = this.oecLivePreviewRoomData;
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("da_info");
                    if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) {
                        String strOptString = jSONObject.optString("da_info");
                        if (strOptString.length() > 0) {
                            JSONObject jSONObject2 = new JSONObject(strOptString);
                            if (jSONObject2.length() != 0) {
                                map = new HashMap();
                                Iterator<String> itKeys = jSONObject2.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    map.put(next, jSONObject2.optString(next));
                                }
                            }
                        }
                    } else {
                        map = new HashMap();
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            map.put(next2, jSONObjectOptJSONObject.optString(next2));
                        }
                    }
                    return map;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return null;
    }

    public final Map<String, String> getPreviewDaInfoMap() {
        return getCachedPreviewDaInfoMap();
    }

    public final Long getCommercePermission() {
        return this.commercePermission;
    }

    public final String getOecLivePreviewRoomData() {
        return this.oecLivePreviewRoomData;
    }

    public final Long getPopProductId() {
        return this.popProductId;
    }

    public final PreviewProductCardInfo getPreviewProductCardInfo() {
        return this.previewProductCardInfo;
    }

    public final Long getProductNum() {
        return this.productNum;
    }

    public final void setCommercePermission(Long l) {
        this.commercePermission = l;
    }

    public final void setOecLivePreviewRoomData(String str) {
        this.oecLivePreviewRoomData = str;
    }

    public final void setPopProductId(Long l) {
        this.popProductId = l;
    }

    public final void setPreviewProductCardInfo(PreviewProductCardInfo previewProductCardInfo) {
        this.previewProductCardInfo = previewProductCardInfo;
    }

    public final void setProductNum(Long l) {
        this.productNum = l;
    }
}
