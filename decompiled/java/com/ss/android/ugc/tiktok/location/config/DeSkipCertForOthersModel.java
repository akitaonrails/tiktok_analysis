package com.ss.android.ugc.tiktok.location.config;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class DeSkipCertForOthersModel {

    @C09CT("list")
    public final List<String> list;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeSkipCertForOthersModel) && Intrinsics.LJFF(this.list, ((DeSkipCertForOthersModel) obj).list);
    }

    public final int hashCode() {
        return this.list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeSkipCertForOthersModel(list=");
        sbLIZ.append(this.list);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DeSkipCertForOthersModel() {
        this(C1697810uHb.LJIIJJI("bpea-location_offline_fetch_location_two", "bpea-location_offline_get_last_location_two", "bpea-location_request_enc_data_not_reverse", "bpea-host_location_granted_locate_android", "bpea-config-live-nearby-gps_live_nearby_locate_android", "bpea-ttop_service_plugin_location_with_geo_reverse", "bpea-ecom_address_map_locate"));
    }

    public DeSkipCertForOthersModel(List<String> list) {
        this.list = list;
    }
}
