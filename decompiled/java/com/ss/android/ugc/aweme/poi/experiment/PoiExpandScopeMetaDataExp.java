package com.ss.android.ugc.aweme.poi.experiment;

import X.C01GW;
import X.C09CT;
import X.C1207450hWh;
import X.C452501pT;
import X.C844470XAv;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiExpandScopeMetaDataExp {
    public static final PoiExpandScopeMetaDataExp LIZ = new PoiExpandScopeMetaDataExp();
    public static final MetadataConfig LIZIZ = new MetadataConfig(null, false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(360));

    public static boolean LIZ() {
        String str = ((MetadataConfig) LIZJ.getValue()).poiUseMetadataScope;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -427722629) {
                if (iHashCode != -318750117) {
                    if (iHashCode == 96673 && str.equals("all")) {
                        return true;
                    }
                } else if (str.equals("precise")) {
                    return LIZIZ();
                }
            } else if (str.equals("precise_and_coarse")) {
                if (LIZIZ()) {
                    return true;
                }
                C1207450hWh c1207450hWh = C1207450hWh.LIZ;
                C844470XAv.LIZ.getClass();
                if (c1207450hWh.LJII(0, C844470XAv.LIZ())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LIZIZ() {
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        C844470XAv.LIZ.getClass();
        return iLocationBaseServiceForMT.LJ(C844470XAv.LIZ()) && iLocationBaseServiceForMT.LJJIJ();
    }

    public static final class MetadataConfig {

        @C09CT("poi_use_metadata_scope")
        public final String poiUseMetadataScope;

        @C09CT("show_meta_disclaimer_panel")
        public final boolean showMetaDisclaimerPanel;

        public MetadataConfig() {
            this(null, false);
        }

        public MetadataConfig(String str, boolean z) {
            this.poiUseMetadataScope = str;
            this.showMetaDisclaimerPanel = z;
        }
    }
}
