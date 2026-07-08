package com.ss.android.ugc.tiktok.location.config;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DeSkipCertForLbsModel {

    @C09CT("list")
    public final List<String> list;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeSkipCertForLbsModel) && Intrinsics.LJFF(this.list, ((DeSkipCertForLbsModel) obj).list);
    }

    public final int hashCode() {
        return this.list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeSkipCertForLbsModel(list=");
        sbLIZ.append(this.list);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DeSkipCertForLbsModel() {
        this(C1697810uHb.LJIIJJI("bpea-revisit-poi_locate_android", "bpea-poi_quiz_request_location", "bpea-location_fyp_gps_fetch_10_min_cache", "bpea-poi_map_mode_fetch_cache_location", "bpea-poi_map_mode_fetch_location_in_find_places_nearby", "bpea-nearby_region_list_show", "bpea-nearby_roaming_current_region_try_location", "bpea-poi_detail_page_no_regional_get_location", "bpea-poi_publish_extension_fetcher_location", "bpea-poi_search_empty_search_client_rank", "bpea-poi_video_record_fetch_location_two_for_scene_no_cache", "bpea-publish_recommond_poi_preload_android_location", "bpea-config-claim-poi_poi_claim_poi_locate_android", "bpea-user_claim_poi_auto_locate_android", "bpea-user_claim_poi_manual_locate_android", "bpea-location_fyp_gps_fetch_15_min_cache", "bpea-location_fyp_gps_fetch_5_min_cache", "bpea-poi_search_recommend_client_rank", "bpea-poi_search_fetcher_location", "bpea-sticker_effect_guitar_fetch_guitar_cache_time_v3", "bpea-sticker_effect_guitar_fetch_guitar_immediately_v2", "bpea-nearby_fetch_location_when_inapp_status_change", "bpea-nearby_fetch_location_when_inapp_status_change_v2", "bpea-nearby_request_location_unnecessary_by_popup_manager_two", "bpea-nearby_request_location_unnecessary_by_popup_manager_v3", "bpea-nearby_request_location_unnecessary_two", "bpea-nearby_request_location_unnecessary_v3", "bpea-nearby_tab_fetch_location_when_entering_v2"));
    }

    public DeSkipCertForLbsModel(List<String> list) {
        this.list = list;
    }
}
