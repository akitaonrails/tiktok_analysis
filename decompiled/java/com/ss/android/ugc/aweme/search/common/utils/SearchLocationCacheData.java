package com.ss.android.ugc.aweme.search.common.utils;

import X.C09CT;
import X.C145T;
import X.C15438062q;
import X.C1798550wu5;
import X.C1839107If;
import X.C19741112Lp;
import android.app.Activity;
import com.bytedance.i18n.location.api.LocationClient;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLocationCacheData {
    public static String LIZIZ;
    public static String LIZJ;
    public static Double LIZLLL;
    public static Double LJ;
    public static long LJI;
    public static long LJII;
    public static final SearchLocationCacheData LIZ = new SearchLocationCacheData();
    public static int LJFF = -1;

    public static String LIZJ() {
        return LIZLLL(LJII, LIZJ, "place", "lynx");
    }

    public static Pair LIZIZ() {
        if (C1839107If.LIZ() && LJ(null)) {
            return new Pair(String.valueOf(LIZLLL), String.valueOf(LJ));
        }
        return null;
    }

    public static Integer LIZ(SearchLocationCacheData searchLocationCacheData) {
        searchLocationCacheData.getClass();
        SAFHelper.LIZ.getClass();
        Activity activityLJIIIIZZ = SAFHelper.LJIIIIZZ(null);
        if (activityLJIIIIZZ == null) {
            return null;
        }
        return Integer.valueOf(C145T.LIZ(activityLJIIIIZZ));
    }

    public static boolean LJ(Activity activity) {
        boolean z;
        if (activity == null) {
            SAFHelper.LIZ.getClass();
            activity = SAFHelper.LJIIIIZZ(null);
            if (activity == null) {
                return false;
            }
        }
        List<String> listLJIIZILJ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIIZILJ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIZILJ, 10));
        for (String str : listLJIIZILJ) {
            C19741112Lp.LIZ.getClass();
            arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(activity, str)));
        }
        if (C145T.LIZ(activity) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!arrayList.contains(Boolean.TRUE) || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017a A[PHI: r5
      0x017a: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v4 java.lang.String), (r5v4 java.lang.String) binds: [B:103:0x0176, B:59:0x00cb, B:61:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018b A[PHI: r10
      0x018b: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v4 java.lang.String), (r10v4 java.lang.String) binds: [B:110:0x0187, B:26:0x0064, B:28:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(com.bytedance.i18n.location.api.LocationData r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SearchLocationCacheData.LJFF(com.bytedance.i18n.location.api.LocationData, int, int):void");
    }

    public final void LJII(LocationData locationData, Activity activity, int i) {
        ArrayList arrayList;
        if (!C1839107If.LIZ()) {
            return;
        }
        List<String> listLJIIZILJ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIIZILJ();
        if (activity != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIZILJ, 10));
            for (String str : listLJIIZILJ) {
                C19741112Lp.LIZ.getClass();
                arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(activity, str)));
            }
        } else {
            arrayList = new ArrayList();
        }
        if (arrayList.contains(Boolean.TRUE)) {
            LocationClient locationClient = C1798550wu5.LIZIZ;
            LJFF(locationData, locationClient.LJIJI(activity), locationClient.LJIIJJI());
        } else {
            LJFF(null, 0, 0);
        }
        LJFF = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(long r19, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SearchLocationCacheData.LIZLLL(long, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static final class SearchEncryptLocation {

        @C09CT("city_id")
        public final String cityId;

        @C09CT("country_code")
        public final String countryCode;

        @C09CT("country_id")
        public final String countryId;

        @C09CT("decrypted_lat")
        public final String decryptedLat;

        @C09CT("decrypted_lng")
        public final String decryptedLng;

        @C09CT("district_id")
        public final String districtId;

        @C09CT("encrypted_lat")
        public final String encryptedLat;

        @C09CT("encrypted_lng")
        public final String encryptedLng;

        @C09CT("in_app_precise_mode")
        public final int inAppPreciseMode;

        @C09CT("loc_fetch_err_reason")
        public final String locFetchErrReason;

        @C09CT("loc_fetch_timestamp")
        public final Long locFetchTimestamp;

        @C09CT("sub_division_id")
        public final String subDivisionId;

        @C09CT("system_location_permission_status")
        public final int systemLocationPermissionStatus;

        public SearchEncryptLocation(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, String str8, String str9, Long l, String str10) {
            this.encryptedLat = str;
            this.encryptedLng = str2;
            this.countryCode = str3;
            this.countryId = str4;
            this.subDivisionId = str5;
            this.cityId = str6;
            this.districtId = str7;
            this.systemLocationPermissionStatus = i;
            this.inAppPreciseMode = i2;
            this.decryptedLat = str8;
            this.decryptedLng = str9;
            this.locFetchTimestamp = l;
            this.locFetchErrReason = str10;
        }
    }
}
