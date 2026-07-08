package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyInfo implements Serializable {
    public transient JSONObject _parsedEventTrack;

    @C09CT("can_not_cached")
    public Boolean cannotCached;

    @C09CT("event_track")
    public String eventTrack;

    @C09CT("local_views_item_auth")
    public Boolean localViewsItemAuth;

    @C09CT("nearby_double_column_event_track")
    public String nearbyDoubleColumnEventTrack;

    @C09CT("nearby_region")
    public String nearbyRegion;

    @C09CT("nearby_vv")
    public Long nearbyVV;

    public NearbyInfo() {
        this(null, null, null, null, null, null);
    }

    public final NearbyInfo copy(String str, Boolean bool, String str2, Long l, Boolean bool2, String str3) {
        return new NearbyInfo(str, bool, str2, l, bool2, str3);
    }

    public final String getDevicePoiLocationRelationshipFromEventTrack() {
        String strOptString = null;
        try {
            String str = this.eventTrack;
            JSONObject jSONObject = str != null ? new JSONObject(str) : null;
            if (jSONObject != null) {
                strOptString = jSONObject.optString("device_poi_location_relationship", "");
                return strOptString;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return strOptString;
    }

    private final JSONObject getParsedEventTrack() {
        JSONObject jSONObject = this._parsedEventTrack;
        if (jSONObject == null) {
            jSONObject = null;
            try {
                String str = this.eventTrack;
                if (str != null) {
                    jSONObject = new JSONObject(str);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this._parsedEventTrack = jSONObject;
        }
        return jSONObject;
    }

    public final String getGeoExpansionType() {
        JSONObject parsedEventTrack = getParsedEventTrack();
        if (parsedEventTrack != null) {
            return parsedEventTrack.optString("geo_expansion_type");
        }
        return null;
    }

    public NearbyInfo(String str, Boolean bool, String str2, Long l, Boolean bool2, String str3) {
        this.eventTrack = str;
        this.cannotCached = bool;
        this.nearbyRegion = str2;
        this.nearbyVV = l;
        this.localViewsItemAuth = bool2;
        this.nearbyDoubleColumnEventTrack = str3;
    }
}
