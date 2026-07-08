package com.ss.android.ugc.aweme.commercialize.data.utils;

import X.C08XD;
import X.C09CT;
import X.C1019270cdB;
import X.C1019380cdM;
import X.C1019390cdN;
import X.C1024180cl6;
import X.C1049030dPB;
import X.C13LP;
import X.C1EE2;
import X.C2188811AlT;
import X.C7740030o;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AdSessionPositionHelper {
    public static int LJJ;
    public static int LJJI;
    public static int LJJIFFI;
    public static int LJJIIJZLJL;
    public static int LJJIIZ;
    public static int LJJIIZI;
    public static final AdSessionPositionHelper LIZ = new AdSessionPositionHelper();
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static long LIZLLL = -1;
    public static int LJ = -1;
    public static int LJFF = -1;
    public static int LJI = -1;
    public static long LJII = -1;
    public static long LJIIIIZZ = -1;
    public static long LJIIIZ = -1;
    public static int LJIIJ = -1;
    public static int LJIIJJI = -1;
    public static int LJIIL = -1;
    public static int LJIILIIL = -1;
    public static int LJIILJJIL = -1;
    public static HashSet<String> LJIILL = new HashSet<>();
    public static int LJIILLIIL = -1;
    public static int LJIIZILJ = -1;
    public static int LJIJ = -1;
    public static int LJIJI = -1;
    public static int LJIJJ = -1;
    public static int LJIJJLI = -1;
    public static int LJIL = -1;
    public static int LJJII = -1;
    public static int LJJIII = -1;
    public static int LJJIIJ = -1;
    public static HashSet<String> LJJIJ = new HashSet<>();
    public static HashSet<String> LJJIJIIJI = new HashSet<>();
    public static HashSet<String> LJJIJIIJIL = new HashSet<>();
    public static HashMap<String, C1019390cdN> LJJIJIL = new HashMap<>();
    public static HashMap<String, C1019390cdN> LJJIJL = new HashMap<>();
    public static HashMap<String, C1019390cdN> LJJIJLIJ = new HashMap<>();
    public static ConcurrentHashMap<String, C1019380cdM> LJJIL = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, C1019380cdM> LJJIZ = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, C1019380cdM> LJJJ = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, C1019380cdM> LJJJI = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, C1019380cdM> LJJJIL = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, C1019380cdM> LJJJJ = new ConcurrentHashMap<>();
    public static final HashSet<String> LJJJJI = new HashSet<>();
    public static final HashSet<String> LJJJJIZL = new HashSet<>();
    public static final HashSet<String> LJJJJJ = new HashSet<>();
    public static String LJJJJJL = "";
    public static String LJJJJL = "";
    public static String LJJJJLI = "";
    public static String LJJJJLL = "";
    public static String LJJJJZ = "";

    public static final class SessionReportModel implements Serializable {

        @C09CT("absolute_session_position")
        public List<Integer> absolutePos;

        @C09CT("absolute_session_position_with_cross_tab")
        public List<Integer> absolutePosCrossTab;

        @C09CT("all_relative_position_of_last_request")
        public List<Integer> allRelativePositionLastReq;

        @C09CT("timestamp_of_first_ad_with_click")
        public long firstAdClickTime;

        @C09CT("timestamp_of_first_ad_with_show")
        public long firstAdShowTime;

        @C09CT("first_timestamp_of_enter_session")
        public long firstEnterSessionTime;

        @C09CT("last_relative_position_of_ad_with_click")
        public int lastAdClickPosition;

        @C09CT("last_timestamp_of_ad_with_click")
        public long lastAdClickTime;

        @C09CT("last_relative_position_of_ad_with_show")
        public int lastAdShowPosition;

        @C09CT("last_timestamp_of_ad_with_show")
        public long lastAdShowTime;

        @C09CT("photomode_features")
        public Map<String, ? extends List<Object>> photoModeFeature;

        @C09CT("relative_session_position")
        public List<Integer> relativePos;

        @C09CT("request_index_within_session")
        public int requestIndex;

        @C09CT("session_id")
        public String sessionId;

        public SessionReportModel() {
            this("", null, null, null, -1L, -1L, -1L, -1L, -1L, -1, -1, null, -1, null);
        }

        public final List<Integer> getAbsolutePos() {
            return this.absolutePos;
        }

        public final List<Integer> getAbsolutePosCrossTab() {
            return this.absolutePosCrossTab;
        }

        public final List<Integer> getAllRelativePositionLastReq() {
            return this.allRelativePositionLastReq;
        }

        public final long getFirstAdClickTime() {
            return this.firstAdClickTime;
        }

        public final long getFirstAdShowTime() {
            return this.firstAdShowTime;
        }

        public final long getFirstEnterSessionTime() {
            return this.firstEnterSessionTime;
        }

        public final int getLastAdClickPosition() {
            return this.lastAdClickPosition;
        }

        public final long getLastAdClickTime() {
            return this.lastAdClickTime;
        }

        public final int getLastAdShowPosition() {
            return this.lastAdShowPosition;
        }

        public final long getLastAdShowTime() {
            return this.lastAdShowTime;
        }

        public final Map<String, List<Object>> getPhotoModeFeature() {
            return this.photoModeFeature;
        }

        public final List<Integer> getRelativePos() {
            return this.relativePos;
        }

        public final int getRequestIndex() {
            return this.requestIndex;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public final void setAbsolutePos(List<Integer> list) {
            this.absolutePos = list;
        }

        public final void setAbsolutePosCrossTab(List<Integer> list) {
            this.absolutePosCrossTab = list;
        }

        public final void setAllRelativePositionLastReq(List<Integer> list) {
            this.allRelativePositionLastReq = list;
        }

        public final void setFirstAdClickTime(long j) {
            this.firstAdClickTime = j;
        }

        public final void setFirstAdShowTime(long j) {
            this.firstAdShowTime = j;
        }

        public final void setFirstEnterSessionTime(long j) {
            this.firstEnterSessionTime = j;
        }

        public final void setLastAdClickPosition(int i) {
            this.lastAdClickPosition = i;
        }

        public final void setLastAdClickTime(long j) {
            this.lastAdClickTime = j;
        }

        public final void setLastAdShowPosition(int i) {
            this.lastAdShowPosition = i;
        }

        public final void setLastAdShowTime(long j) {
            this.lastAdShowTime = j;
        }

        public final void setPhotoModeFeature(Map<String, ? extends List<Object>> map) {
            this.photoModeFeature = map;
        }

        public final void setRelativePos(List<Integer> list) {
            this.relativePos = list;
        }

        public final void setRequestIndex(int i) {
            this.requestIndex = i;
        }

        public final void setSessionId(String str) {
            this.sessionId = str;
        }

        public SessionReportModel(String str, List<Integer> list, List<Integer> list2, List<Integer> list3, long j, long j2, long j3, long j4, long j5, int i, int i2, List<Integer> list4, int i3, Map<String, ? extends List<Object>> map) {
            this.sessionId = str;
            this.absolutePos = list;
            this.relativePos = list2;
            this.absolutePosCrossTab = list3;
            this.firstEnterSessionTime = j;
            this.firstAdShowTime = j2;
            this.firstAdClickTime = j3;
            this.lastAdShowTime = j4;
            this.lastAdClickTime = j5;
            this.lastAdShowPosition = i;
            this.lastAdClickPosition = i2;
            this.allRelativePositionLastReq = list4;
            this.requestIndex = i3;
            this.photoModeFeature = map;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(java.lang.String r4) {
        /*
            r3 = -1
            if (r4 != 0) goto L4
            return r3
        L4:
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJIL
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L3a
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJIL
            java.lang.Object r0 = r0.get(r4)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L6c
            int r0 = r0.LIZIZ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L1c:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getAbsolutePos, cid is "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", result is "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            if (r2 == 0) goto L39
            int r3 = r2.intValue()
        L39:
            return r3
        L3a:
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJL
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L53
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJL
            java.lang.Object r0 = r0.get(r4)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L6c
            int r0 = r0.LIZIZ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L1c
        L53:
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJLIJ
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L6c
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJLIJ
            java.lang.Object r0 = r0.get(r4)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L6c
            int r0 = r0.LIZIZ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L1c
        L6c:
            r2 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LIZ(java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(java.lang.String r4) {
        /*
            r3 = -1
            if (r4 != 0) goto L4
            return r3
        L4:
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJIL
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L1a
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJIL
            java.lang.Object r0 = r0.get(r4)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L87
            int r0 = r0.LIZLLL
            if (r0 != r3) goto L87
        L1a:
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJL
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L30
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJL
            java.lang.Object r0 = r0.get(r4)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L76
            int r0 = r0.LIZLLL
            if (r0 != r3) goto L76
        L30:
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJLIJ
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L46
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJLIJ
            java.lang.Object r0 = r0.get(r4)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L65
            int r0 = r0.LIZLLL
            if (r0 != r3) goto L65
        L46:
            r2 = 0
        L47:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getAbsolutePosCrossTab, cid is "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", result is "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            if (r2 == 0) goto L64
            int r3 = r2.intValue()
        L64:
            return r3
        L65:
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJLIJ
            java.lang.Object r0 = r0.get(r4)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L46
            int r0 = r0.LIZLLL
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L47
        L76:
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJL
            java.lang.Object r0 = r0.get(r4)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L46
            int r0 = r0.LIZLLL
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L47
        L87:
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJIL
            java.lang.Object r0 = r0.get(r4)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L46
            int r0 = r0.LIZLLL
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LIZIZ(java.lang.String):int");
    }

    public static String LIZJ(String str) {
        if (str == null) {
            return null;
        }
        if (LJJIJ.contains(str)) {
            return "fyp";
        }
        if (LJJIJIIJI.contains(str)) {
            return "following";
        }
        if (!LJJIJIIJIL.contains(str)) {
            return null;
        }
        return "friends";
    }

    public static int LIZLLL(String str) {
        C1019390cdN c1019390cdN;
        if (str == null || (c1019390cdN = LJJIJIL.get(str)) == null) {
            return -1;
        }
        int i = c1019390cdN.LJFF;
        AdSessionPositionHelper adSessionPositionHelper = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLastClickRelativePos, cid is ");
        sbLIZ.append(str);
        sbLIZ.append(", feedType is fyp, result is ");
        sbLIZ.append(LJIILLIIL - i);
        C2188811AlT.LIZIZ(sbLIZ);
        adSessionPositionHelper.getClass();
        return i;
    }

    public static int LJ(String str) {
        if (str == null) {
            return -1;
        }
        C1019390cdN c1019390cdN = LJJIJIL.get(str);
        if (c1019390cdN != null) {
            int i = c1019390cdN.LJ;
            AdSessionPositionHelper adSessionPositionHelper = LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getLastShownRelativePos, cid is ");
            sbLIZ.append(str);
            sbLIZ.append(", feedType is fyp, result is ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            adSessionPositionHelper.getClass();
            return i;
        }
        C1019390cdN c1019390cdN2 = LJJIJL.get(str);
        if (c1019390cdN2 != null) {
            int i2 = c1019390cdN2.LJ;
            AdSessionPositionHelper adSessionPositionHelper2 = LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getLastShownRelativePos, cid is ");
            sbLIZ2.append(str);
            sbLIZ2.append(", feedType is following, result is ");
            sbLIZ2.append(i2);
            C2188811AlT.LIZIZ(sbLIZ2);
            adSessionPositionHelper2.getClass();
            return i2;
        }
        C1019390cdN c1019390cdN3 = LJJIJLIJ.get(str);
        if (c1019390cdN3 == null) {
            return -1;
        }
        int i3 = c1019390cdN3.LJ;
        AdSessionPositionHelper adSessionPositionHelper3 = LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getLastShownRelativePos, cid is ");
        sbLIZ3.append(str);
        sbLIZ3.append(", feedType is friends, result is ");
        sbLIZ3.append(i3);
        C2188811AlT.LIZIZ(sbLIZ3);
        adSessionPositionHelper3.getClass();
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJFF(java.lang.String r4) {
        /*
            r3 = -1
            if (r4 != 0) goto L4
            return r3
        L4:
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJIL
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L1a
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJIL
            java.lang.Object r0 = r0.get(r4)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L87
            int r0 = r0.LIZJ
            if (r0 != r3) goto L87
        L1a:
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJL
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L30
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJL
            java.lang.Object r0 = r0.get(r4)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L76
            int r0 = r0.LIZJ
            if (r0 != r3) goto L76
        L30:
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJLIJ
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L46
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJLIJ
            java.lang.Object r0 = r0.get(r4)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L65
            int r0 = r0.LIZJ
            if (r0 != r3) goto L65
        L46:
            r2 = 0
        L47:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getRelativePos, cid is "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", result is "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            if (r2 == 0) goto L64
            int r3 = r2.intValue()
        L64:
            return r3
        L65:
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJLIJ
            java.lang.Object r0 = r0.get(r4)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L46
            int r0 = r0.LIZJ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L47
        L76:
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJL
            java.lang.Object r0 = r0.get(r4)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L46
            int r0 = r0.LIZJ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L47
        L87:
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJIL
            java.lang.Object r0 = r0.get(r4)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L46
            int r0 = r0.LIZJ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJFF(java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJI(java.lang.String r3) {
        /*
            java.lang.String r2 = LIZJ(r3)
            if (r2 == 0) goto L35
            int r1 = r2.hashCode()
            r0 = -600094315(0xffffffffdc3b4995, float:-2.108669E17)
            if (r1 == r0) goto L53
            r0 = 101885(0x18dfd, float:1.42771E-40)
            if (r1 == r0) goto L38
            r0 = 765915793(0x2da6f291, float:1.8979736E-11)
            if (r1 != r0) goto L35
            java.lang.String r0 = "following"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L35
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJL
            java.lang.Object r0 = r0.get(r3)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L35
            java.util.List<java.lang.Integer> r0 = r0.LJI
            if (r0 == 0) goto L35
            java.lang.String r0 = r0.toString()
        L33:
            if (r0 != 0) goto L37
        L35:
            java.lang.String r0 = "[]"
        L37:
            return r0
        L38:
            java.lang.String r0 = "fyp"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L35
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJIL
            java.lang.Object r0 = r0.get(r3)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L35
            java.util.List<java.lang.Integer> r0 = r0.LJI
            if (r0 == 0) goto L35
            java.lang.String r0 = r0.toString()
            goto L33
        L53:
            java.lang.String r0 = "friends"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L35
            java.util.HashMap<java.lang.String, X.0cdN> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJIJLIJ
            java.lang.Object r0 = r0.get(r3)
            X.0cdN r0 = (X.C1019390cdN) r0
            if (r0 == 0) goto L35
            java.util.List<java.lang.Integer> r0 = r0.LJI
            if (r0 == 0) goto L35
            java.lang.String r0 = r0.toString()
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJI(java.lang.String):java.lang.String");
    }

    public static int LJII(String str) {
        C1019390cdN c1019390cdN;
        C1019390cdN c1019390cdN2;
        C1019390cdN c1019390cdN3;
        String strLIZJ = LIZJ(str);
        if (strLIZJ != null) {
            int iHashCode = strLIZJ.hashCode();
            if (iHashCode != -600094315) {
                if (iHashCode != 101885) {
                    if (iHashCode == 765915793 && strLIZJ.equals("following") && (c1019390cdN3 = LJJIJL.get(str)) != null) {
                        return c1019390cdN3.LJII;
                    }
                    return -1;
                }
                if (strLIZJ.equals("fyp") && (c1019390cdN2 = LJJIJIL.get(str)) != null) {
                    return c1019390cdN2.LJII;
                }
                return -1;
            }
            if (strLIZJ.equals("friends") && (c1019390cdN = LJJIJLIJ.get(str)) != null) {
                return c1019390cdN.LJII;
            }
            return -1;
        }
        return -1;
    }

    public static String LJIIIZ(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        if (LJJIJIL.containsKey(str)) {
            C1019390cdN c1019390cdN = LJJIJIL.get(str);
            if (c1019390cdN != null) {
                str2 = c1019390cdN.LIZ;
            }
        } else if (LJJIJL.containsKey(str)) {
            C1019390cdN c1019390cdN2 = LJJIJL.get(str);
            if (c1019390cdN2 != null) {
                str2 = c1019390cdN2.LIZ;
            }
        } else if (LJJIJLIJ.containsKey(str)) {
            C1019390cdN c1019390cdN3 = LJJIJLIJ.get(str);
            if (c1019390cdN3 != null) {
                str2 = c1019390cdN3.LIZ;
            }
        } else {
            str2 = LJJJJZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSessionId, cid is ");
        sbLIZ.append(str);
        sbLIZ.append(", result is ");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        return str2;
    }

    public static C1019380cdM LJIIJ(String str) {
        String strLIZJ = LIZJ(str);
        if (strLIZJ != null) {
            int iHashCode = strLIZJ.hashCode();
            if (iHashCode != -600094315) {
                if (iHashCode != 101885) {
                    if (iHashCode == 765915793 && strLIZJ.equals("following")) {
                        C1019380cdM c1019380cdM = LJJIZ.get(str);
                        if (c1019380cdM == null) {
                            return LJJJIL.get(str);
                        }
                        return c1019380cdM;
                    }
                    return null;
                }
                if (strLIZJ.equals("fyp")) {
                    C1019380cdM c1019380cdM2 = LJJIL.get(str);
                    if (c1019380cdM2 != null) {
                        return c1019380cdM2;
                    }
                    return LJJJI.get(str);
                }
                return null;
            }
            if (strLIZJ.equals("friends")) {
                C1019380cdM c1019380cdM3 = LJJJ.get(str);
                if (c1019380cdM3 != null) {
                    return c1019380cdM3;
                }
                return LJJJJ.get(str);
            }
            return null;
        }
        return null;
    }

    public static void LJIIL(long j) {
        LIZIZ = j;
        if (!TextUtils.isEmpty(LJJJJLL) && !TextUtils.equals(LJJJJLL, C1024180cl6.LIZIZ())) {
            LJJIJ = new HashSet<>();
            LJJIJIIJI = new HashSet<>();
            LJJIJIIJIL = new HashSet<>();
            LJJIJIL = new HashMap<>();
            LJJIJL = new HashMap<>();
            LJJIJLIJ = new HashMap<>();
            LJJIL = new ConcurrentHashMap<>();
            LJJIZ = new ConcurrentHashMap<>();
            LJJJ = new ConcurrentHashMap<>();
            LJJJI = new ConcurrentHashMap<>();
            LJJJIL = new ConcurrentHashMap<>();
            LJJJJ = new ConcurrentHashMap<>();
        }
        if (!TextUtils.isEmpty(LJJJJZ)) {
            LJIJJ = 0;
            LJIJJLI = 0;
            LJIL = 0;
        }
        LJJJJLL = C1024180cl6.LIZIZ();
        String str = C1019270cdB.LIZ;
        String str2 = LJJJJLL;
        if (!Intrinsics.LJFF(C1019270cdB.LIZLLL, str2)) {
            C1019270cdB.LIZLLL = str2;
            C1019270cdB.LIZJ();
        }
        LJJJJZ = C1019270cdB.LIZIZ;
        LJIIIIZZ = -1L;
        LJII = -1L;
        LIZJ = -1L;
        LJIIJ = -1;
        LJIIJJI = -1;
        LJIIL = -1;
        LJIILIIL = -1;
        LJIILJJIL = -1;
        LJIILL = new HashSet<>();
        LIZLLL = -1L;
        LJIIIZ = -1L;
        LJIILLIIL = -1;
        LJIIZILJ = -1;
        LJIJ = -1;
        LJIJI = -1;
        LJ = -1;
        LJFF = -1;
        LJI = -1;
        LJJ = 0;
        LJJI = 0;
        LJJIFFI = 0;
        LJJIIJZLJL = 0;
        LJJIIZ = 0;
        LJJIIZI = 0;
        LJIILJJIL(LJJIL, LJJJI, LJJJJI, LJJJJJL, "fyp");
        LJIILJJIL(LJJIZ, LJJJIL, LJJJJIZL, LJJJJL, "following");
        LJIILJJIL(LJJJ, LJJJJ, LJJJJJ, LJJJJLI, "friends");
    }

    public static void LJIIZILJ(String str) {
        C1019390cdN c1019390cdN;
        if (str != null) {
            C1049030dPB.LIZ.LIZ(str);
        }
        if (LJJIJIL.containsKey(str)) {
            C1019390cdN c1019390cdN2 = LJJIJIL.get(str);
            if ((c1019390cdN2 != null && c1019390cdN2.LIZIZ == -1) || (c1019390cdN = LJJIJIL.get(str)) == null) {
                return;
            }
            LJIILLIIL = c1019390cdN.LIZIZ;
        }
    }

    public static void LJIIJJI(String str, List list) {
        AwemeRawAd awemeRawAd;
        String creativeIdStr;
        AwemeRawAd awemeRawAd2;
        String creativeIdStr2;
        String creativeIdStr3;
        if (list == null) {
            return;
        }
        int size = list.size();
        System.currentTimeMillis();
        int iHashCode = str.hashCode();
        int i = -600094315;
        int i2 = 101885;
        int i3 = 765915793;
        if (iHashCode != -600094315) {
            if (iHashCode != 101885) {
                if (iHashCode == 765915793 && str.equals("following")) {
                    LJIJJLI++;
                    LJJJIL = LJJIZ;
                    LJJIZ = new ConcurrentHashMap<>();
                }
            } else if (str.equals("fyp")) {
                LJIJJ++;
                LJJJI = LJJIL;
                LJJIL = new ConcurrentHashMap<>();
            }
        } else if (str.equals("friends")) {
            LJIL++;
            LJJJJ = LJJJ;
            LJJJ = new ConcurrentHashMap<>();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Aweme) it2.next()).getAid());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Aweme aweme = (Aweme) it3.next();
            if (aweme.isAd()) {
                int iHashCode2 = str.hashCode();
                if (iHashCode2 != i) {
                    if (iHashCode2 != i2) {
                        if (iHashCode2 == i3) {
                            if (str.equals("following")) {
                                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                                if (awemeRawAd3 != null && (creativeIdStr3 = awemeRawAd3.getCreativeIdStr()) != null) {
                                    C1019380cdM c1019380cdM = new C1019380cdM(LJJJJZ, aweme.getAid(), LJIJJLI, LJJIIZ + list.indexOf(aweme), LJIJ + 1, list.indexOf(aweme), size, arrayList, C13LP.LLIIII(LJJJIL.values()));
                                    LJJIJIIJI.add(creativeIdStr3);
                                    LJJIZ.put(creativeIdStr3, c1019380cdM);
                                    LJIJ++;
                                }
                            }
                        }
                    } else if (str.equals("fyp") && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (creativeIdStr2 = awemeRawAd2.getCreativeIdStr()) != null) {
                        C1019380cdM c1019380cdM2 = new C1019380cdM(LJJJJZ, aweme.getAid(), LJIJJ, LJJIIJZLJL + list.indexOf(aweme), LJIIZILJ + 1, list.indexOf(aweme), size, arrayList, C13LP.LLIIII(LJJJI.values()));
                        LJJIJ.add(creativeIdStr2);
                        LJJIL.put(creativeIdStr2, c1019380cdM2);
                        LJIIZILJ++;
                    }
                } else if (str.equals("friends") && (awemeRawAd = aweme.getAwemeRawAd()) != null && (creativeIdStr = awemeRawAd.getCreativeIdStr()) != null) {
                    C1019380cdM c1019380cdM3 = new C1019380cdM(LJJJJZ, aweme.getAid(), LJIL, LJJIIZI + list.indexOf(aweme), LJIJI + 1, list.indexOf(aweme), size, arrayList, C13LP.LLIIII(LJJJJ.values()));
                    LJJIJIIJIL.add(creativeIdStr);
                    LJJJ.put(creativeIdStr, c1019380cdM3);
                    LJIJI++;
                }
                i = -600094315;
                i2 = 101885;
                i3 = 765915793;
            }
        }
        int iHashCode3 = str.hashCode();
        if (iHashCode3 != i) {
            if (iHashCode3 != i2) {
                if (iHashCode3 == i3 && str.equals("following")) {
                    LJJIIZ += size;
                    return;
                }
                return;
            }
            if (!str.equals("fyp")) {
                return;
            }
            LJJIIJZLJL += size;
            return;
        }
        if (!str.equals("friends")) {
            return;
        }
        LJJIIZI += size;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILL(X.C1022820ciu r27, com.ss.android.ugc.aweme.feed.model.AwemeRawAd r28) {
        /*
            Method dump skipped, instruction units count: 1191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJIILL(X.0ciu, com.ss.android.ugc.aweme.feed.model.AwemeRawAd):void");
    }

    public static void LJIILLIIL(long j, String str) {
        String str2;
        if (Intrinsics.LJFF(LIZJ(str), "fyp")) {
            C1019390cdN c1019390cdN = LJJIJIL.get(str);
            if (c1019390cdN != null) {
                str2 = c1019390cdN.LIZ;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, LJJJJZ) && LIZLLL == -1) {
                LIZLLL = j;
            }
        }
    }

    public static String LJIIIIZZ(Integer num, String str, String str2) {
        int i;
        Map<String, List<Object>> mapLIZLLL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (TextUtils.equals(str, "fyp")) {
            for (Map.Entry<String, C1019380cdM> entry : LJJIL.entrySet()) {
                arrayList.add(Integer.valueOf(entry.getValue().LIZLLL));
                arrayList2.add(Integer.valueOf(entry.getValue().LJ));
                arrayList3.add(Integer.valueOf(entry.getValue().LIZLLL + LJJI + LJJIFFI));
            }
            C08XD.LJIL(arrayList);
            C08XD.LJIL(arrayList2);
            C08XD.LJIL(arrayList3);
            Gson gson = C7740030o.LIZ().getGson();
            String str3 = LJJJJZ;
            long j = LIZIZ;
            long j2 = LIZJ;
            long j3 = LIZLLL;
            long j4 = LJIIIIZZ;
            long j5 = LJIIIZ;
            int i2 = LJIIJ;
            int i3 = 0;
            if (i2 == -1) {
                i = -1;
            } else {
                i = (LJJ - i2) - 2;
                if (i == -1) {
                    i = 0;
                }
            }
            int i4 = LJIILLIIL;
            if (i4 == -1) {
                i3 = -1;
            } else {
                int i5 = (LJJ - i4) - 2;
                if (i5 != -1) {
                    i3 = i5;
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry<String, C1019380cdM> entry2 : LJJIL.entrySet()) {
                arrayList4.add(Integer.valueOf(entry2.getValue().LJFF - entry2.getValue().LJI));
            }
            C08XD.LJIL(arrayList4);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getRelativePosLastReqForRequestReport, result is ");
            sbLIZ.append(arrayList4);
            C2188811AlT.LIZIZ(sbLIZ);
            int i6 = LJIJJ + 1;
            if (num != null && (num.intValue() == 2 || num.intValue() == 1)) {
                mapLIZLLL = C1EE2.LIZIZ.LJJIL().LIZLLL(str2);
            } else {
                mapLIZLLL = null;
            }
            return GsonProtectorUtils.toJson(gson, new SessionReportModel(str3, arrayList, arrayList2, arrayList3, j, j2, j3, j4, j5, i, i3, arrayList4, i6, mapLIZLLL));
        }
        if (TextUtils.equals(str, "following")) {
            for (Map.Entry<String, C1019380cdM> entry3 : LJJIZ.entrySet()) {
                arrayList.add(Integer.valueOf(entry3.getValue().LIZLLL));
                arrayList2.add(Integer.valueOf(entry3.getValue().LJ));
                arrayList3.add(Integer.valueOf(entry3.getValue().LIZLLL + LJJ + LJJIFFI));
            }
            C08XD.LJIL(arrayList);
            C08XD.LJIL(arrayList2);
            C08XD.LJIL(arrayList3);
            return GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), new SessionReportModel(LJJJJZ, arrayList, arrayList2, arrayList3, -1L, -1L, -1L, -1L, -1L, -1, -1, null, LJIJJLI + 1, null));
        }
        if (TextUtils.equals(str, "friends")) {
            for (Map.Entry<String, C1019380cdM> entry4 : LJJJ.entrySet()) {
                arrayList.add(Integer.valueOf(entry4.getValue().LIZLLL));
                arrayList2.add(Integer.valueOf(entry4.getValue().LJ));
                arrayList3.add(Integer.valueOf(entry4.getValue().LIZLLL + LJJ + LJJI));
            }
            C08XD.LJIL(arrayList);
            C08XD.LJIL(arrayList2);
            C08XD.LJIL(arrayList3);
            return GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), new SessionReportModel(LJJJJZ, arrayList, arrayList2, arrayList3, -1L, -1L, -1L, -1L, -1L, -1, -1, null, LJIL + 1, null));
        }
        return "";
    }

    public static void LJIILIIL(int i, String str, String str2) {
        int i2;
        int i3;
        int i4;
        int iHashCode = str2.hashCode();
        if (iHashCode != -600094315) {
            if (iHashCode != 101885) {
                if (iHashCode == 765915793 && str2.equals("following")) {
                    HashSet<String> hashSet = LJJJJIZL;
                    if (!hashSet.contains(str) && (((i4 = LJJIII) != i && Math.abs(i4 - i) == 1) || i == 0 || LJJIII == -1)) {
                        hashSet.add(str);
                        LJJI++;
                        LJJIII = i;
                    }
                    LJJJJL = str;
                }
            } else if (str2.equals("fyp")) {
                HashSet<String> hashSet2 = LJJJJI;
                if (!hashSet2.contains(str) && (((i3 = LJJII) != i && Math.abs(i3 - i) == 1) || i == 0 || LJJII == -1)) {
                    hashSet2.add(str);
                    LJJ++;
                    LJJII = i;
                }
                LJJJJJL = str;
            }
        } else if (str2.equals("friends")) {
            HashSet<String> hashSet3 = LJJJJJ;
            if (!hashSet3.contains(str) && (((i2 = LJJIIJ) != i && Math.abs(i2 - i) == 1) || i == 0 || LJJIIJ == -1)) {
                hashSet3.add(str);
                LJJIFFI++;
                LJJIIJ = i;
            }
            LJJJJLI = str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewHolderSelected, fypSessionShowNum is ");
        sbLIZ.append(LJJ);
        sbLIZ.append(", followSessionShowNum is ");
        sbLIZ.append(LJJI);
        sbLIZ.append(", friendsSessionShowNum is ");
        sbLIZ.append(LJJIFFI);
        sbLIZ.append(", position is ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIILJJIL(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, HashSet hashSet, String str, String str2) {
        int i;
        Iterator it2 = concurrentHashMap.entrySet().iterator();
        int i2 = -1;
        int iIndexOf = -1;
        int i3 = -1;
        boolean z = false;
        int i4 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            if (iIndexOf == i2 && i3 == i2) {
                iIndexOf = ((C1019380cdM) entry.getValue()).LJII.indexOf(str) + 1;
                i3 = ((C1019380cdM) entry.getValue()).LJI - iIndexOf;
                i4 = ((C1019380cdM) entry.getValue()).LJI;
                if (iIndexOf == 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("resetWhenSessionChanged, thisReqMapFailed, thisReqAidList is ");
                    sbLIZ.append(((C1019380cdM) entry.getValue()).LJII);
                    sbLIZ.append(", aid is ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    iIndexOf = -1;
                    i3 = -1;
                    break;
                }
                concurrentHashMap2.clear();
            }
            if (hashSet.contains(((C1019380cdM) entry.getValue()).LIZIZ)) {
                concurrentHashMap.remove(entry.getKey());
                ((C1019380cdM) entry.getValue()).LJI = iIndexOf;
                concurrentHashMap2.put(entry.getKey(), entry.getValue());
            } else {
                C1019380cdM c1019380cdM = (C1019380cdM) entry.getValue();
                if (iIndexOf > 0 && c1019380cdM.LJI <= c1019380cdM.LJII.size() && iIndexOf <= (i = c1019380cdM.LJI)) {
                    c1019380cdM.LJII = c1019380cdM.LJII.subList(iIndexOf, i);
                }
                c1019380cdM.LJI = i3;
                c1019380cdM.LIZJ = 0;
                if (TextUtils.equals(str2, "following")) {
                    int i5 = LJIJ + 1;
                    LJIJ = i5;
                    c1019380cdM.LJ = i5;
                } else if (TextUtils.equals(str2, "friends")) {
                    int i6 = LJIJI + 1;
                    LJIJI = i6;
                    c1019380cdM.LJ = i6;
                } else {
                    int i7 = LJIIZILJ + 1;
                    LJIIZILJ = i7;
                    c1019380cdM.LJ = i7;
                    AdSessionPositionHelper adSessionPositionHelper = LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("resetWhenSessionChanged, thisReqMap, lastFypAdRelativePos is ");
                    sbLIZ2.append(LJIIZILJ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    adSessionPositionHelper.getClass();
                }
                c1019380cdM.LIZ = LJJJJZ;
                c1019380cdM.LJFF -= iIndexOf;
                c1019380cdM.LJIIIIZZ = new ArrayList();
                z = true;
            }
            i2 = -1;
        }
        if (!z && concurrentHashMap2.size() != 0) {
            C1019380cdM c1019380cdM2 = (C1019380cdM) C13LP.LJJJJZ(concurrentHashMap2.values());
            if (iIndexOf == i2 && i3 == i2) {
                iIndexOf = c1019380cdM2.LJII.indexOf(str) + 1;
                i3 = (c1019380cdM2.LJI - iIndexOf) + i4;
                if (iIndexOf == 0) {
                    return;
                }
            }
            Iterator it3 = concurrentHashMap.entrySet().iterator();
            while (it3.hasNext()) {
                C1019380cdM c1019380cdM3 = (C1019380cdM) ((Map.Entry) it3.next()).getValue();
                c1019380cdM3.LIZJ = 0;
                if (TextUtils.equals(str2, "following")) {
                    int i8 = LJIJ + 1;
                    LJIJ = i8;
                    c1019380cdM3.LJ = i8;
                } else if (TextUtils.equals(str2, "friends")) {
                    int i9 = LJIJI + 1;
                    LJIJI = i9;
                    c1019380cdM3.LJ = i9;
                } else {
                    int i10 = LJIIZILJ + 1;
                    LJIIZILJ = i10;
                    c1019380cdM3.LJ = i10;
                }
                c1019380cdM3.LJFF -= iIndexOf;
                c1019380cdM3.LJI = i3;
                c1019380cdM3.LIZ = LJJJJZ;
                c1019380cdM3.LJIIIIZZ = new ArrayList();
            }
            for (Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                if (hashSet.contains(((C1019380cdM) entry2.getValue()).LIZIZ)) {
                    ((C1019380cdM) entry2.getValue()).LJI = iIndexOf;
                } else {
                    concurrentHashMap2.remove(entry2.getKey());
                    C1019380cdM c1019380cdM4 = (C1019380cdM) entry2.getValue();
                    c1019380cdM4.LJI = i3;
                    c1019380cdM4.LIZJ = 0;
                    if (TextUtils.equals(str2, "following")) {
                        int i11 = LJIJ + 1;
                        LJIJ = i11;
                        c1019380cdM4.LJ = i11;
                    } else if (TextUtils.equals(str2, "friends")) {
                        int i12 = LJIJI + 1;
                        LJIJI = i12;
                        c1019380cdM4.LJ = i12;
                    } else {
                        int i13 = LJIIZILJ + 1;
                        LJIIZILJ = i13;
                        c1019380cdM4.LJ = i13;
                    }
                    c1019380cdM4.LJFF -= iIndexOf;
                    c1019380cdM4.LIZ = LJJJJZ;
                    c1019380cdM4.LJIIIIZZ = new ArrayList();
                    concurrentHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
    }
}
