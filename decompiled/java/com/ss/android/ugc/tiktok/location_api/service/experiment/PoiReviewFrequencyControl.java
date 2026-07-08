package com.ss.android.ugc.tiktok.location_api.service.experiment;

import X.AbstractC848400XPy;
import X.C09CT;
import X.C0C64;
import X.C0XQ7;
import X.C20489080x;
import X.C2188811AlT;
import com.bytedance.keva.Keva;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewFrequencyControl {
    public static final PoiReviewFrequencyControl LIZ = new PoiReviewFrequencyControl();
    public static final Keva LIZIZ;

    static {
        C20489080x.LIZ.getClass();
        LIZIZ = C20489080x.LIZLLL();
    }

    public static InnerConfig LIZ() {
        return (InnerConfig) C0C64.LJIILLIIL().LJJII(InnerConfig.class, null, "poi_review_frequency_control", false);
    }

    public static final class DetailPage {

        @C09CT("poi")
        public final Frequency poi;

        public DetailPage() {
            this(null);
        }

        public DetailPage(Frequency frequency) {
            this.poi = frequency;
        }
    }

    public static boolean LIZIZ(String str) {
        ProfilePage profilePage;
        Frequency frequency;
        InnerConfig innerConfigLIZ = LIZ();
        if (innerConfigLIZ == null || (profilePage = innerConfigLIZ.profilePage) == null || (frequency = profilePage.video) == null) {
            return false;
        }
        int i = frequency.frequencyDay;
        int i2 = frequency.frequencyTimes;
        String strLIZLLL = LIZLLL("ts_profile_banner_close", str);
        Keva keva = LIZIZ;
        if (System.currentTimeMillis() - keva.getLong(strLIZLLL, 0L) > ((long) (i * 24 * 60 * 60)) * 1000 || keva.getInt(LIZLLL("count_profile_banner_close", str), 0) < i2) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(String str) {
        ProfilePage profilePage;
        Frequency frequency;
        InnerConfig innerConfigLIZ = LIZ();
        if (innerConfigLIZ == null || (profilePage = innerConfigLIZ.profilePage) == null || (frequency = profilePage.poi) == null) {
            return false;
        }
        int i = frequency.frequencyDay;
        int i2 = frequency.frequencyTimes;
        String strLIZLLL = LIZLLL("ts_profile_banner_with_same_poi", str);
        Keva keva = LIZIZ;
        if (System.currentTimeMillis() - keva.getLong(strLIZLLL, 0L) > ((long) (i * 24 * 60 * 60)) * 1000 || keva.getInt(LIZLLL("count_profile_banner_with_same_poi", str), 0) < i2) {
            return false;
        }
        return true;
    }

    public static void LJ(String str) {
        DetailPage detailPage;
        Frequency frequency;
        InnerConfig innerConfigLIZ = LIZ();
        if (innerConfigLIZ != null && (detailPage = innerConfigLIZ.detailPage) != null && (frequency = detailPage.poi) != null) {
            int i = frequency.frequencyDay;
            int i2 = frequency.frequencyTimes;
            String strLIZLLL = LIZLLL("ts_detail_page_with_same_poi", str);
            Keva keva = LIZIZ;
            if (System.currentTimeMillis() - keva.getLong(strLIZLLL, 0L) > ((long) (i * 24 * 60 * 60)) * 1000) {
                keva.storeInt(LIZLLL("count_detail_page_with_same_poi", str), 1);
                keva.storeLong(LIZLLL("ts_detail_page_with_same_poi", str), System.currentTimeMillis());
            } else {
                if (keva.getInt(LIZLLL("count_detail_page_with_same_poi", str), 0) >= i2) {
                    return;
                }
                keva.storeInt(LIZLLL("count_detail_page_with_same_poi", str), keva.getInt(LIZLLL("count_detail_page_with_same_poi", str), 0) + 1);
            }
        }
    }

    public static void LJFF(String str) {
        String strLIZLLL = LIZLLL("ts_detail_page_with_same_poi", str);
        Keva keva = LIZIZ;
        keva.storeLong(strLIZLLL, System.currentTimeMillis());
        keva.storeInt(LIZLLL("count_detail_page_with_same_poi", str), 0);
    }

    public static void LJI(String str) {
        ProfilePage profilePage;
        Frequency frequency;
        InnerConfig innerConfigLIZ = LIZ();
        if (innerConfigLIZ != null && (profilePage = innerConfigLIZ.profilePage) != null && (frequency = profilePage.video) != null) {
            int i = frequency.frequencyDay;
            int i2 = frequency.frequencyTimes;
            String strLIZLLL = LIZLLL("ts_profile_banner_close", str);
            Keva keva = LIZIZ;
            if (System.currentTimeMillis() - keva.getLong(strLIZLLL, 0L) > ((long) (i * 24 * 60 * 60)) * 1000) {
                keva.storeInt(LIZLLL("count_profile_banner_close", str), 1);
                keva.storeLong(LIZLLL("ts_profile_banner_close", str), System.currentTimeMillis());
            } else {
                if (keva.getInt(LIZLLL("count_profile_banner_close", str), 0) >= i2) {
                    return;
                }
                keva.storeInt(LIZLLL("count_profile_banner_close", str), keva.getInt(LIZLLL("count_profile_banner_close", str), 0) + 1);
            }
        }
    }

    public static void LJII(String str) {
        ProfilePage profilePage;
        Frequency frequency;
        InnerConfig innerConfigLIZ = LIZ();
        if (innerConfigLIZ != null && (profilePage = innerConfigLIZ.profilePage) != null && (frequency = profilePage.poi) != null) {
            int i = frequency.frequencyDay;
            int i2 = frequency.frequencyTimes;
            String strLIZLLL = LIZLLL("ts_profile_banner_with_same_poi", str);
            Keva keva = LIZIZ;
            if (System.currentTimeMillis() - keva.getLong(strLIZLLL, 0L) > ((long) (i * 24 * 60 * 60)) * 1000) {
                keva.storeInt(LIZLLL("count_profile_banner_with_same_poi", str), 1);
                keva.storeLong(LIZLLL("ts_profile_banner_with_same_poi", str), System.currentTimeMillis());
            } else {
                if (keva.getInt(LIZLLL("count_profile_banner_with_same_poi", str), 0) >= i2) {
                    return;
                }
                keva.storeInt(LIZLLL("count_profile_banner_with_same_poi", str), keva.getInt(LIZLLL("count_profile_banner_with_same_poi", str), 0) + 1);
            }
        }
    }

    public static long LJIIIIZZ(String str) {
        return LIZIZ.getLong(LIZLLL("ts_poi_review_post_entrance_show_index", str), -1L);
    }

    public static int LJIIIZ(String str) {
        String strLIZLLL = LIZLLL("ts_poi_review_post_entrance_last_ts", str);
        String strLIZLLL2 = LIZLLL("ts_poi_review_post_entrance_cur_ts", str);
        Keva keva = LIZIZ;
        long j = keva.getLong(strLIZLLL, -1L);
        long j2 = keva.getLong(strLIZLLL2, System.currentTimeMillis());
        if (j == -1) {
            return -1;
        }
        return (int) ((j2 - j) / ((long) 86400000));
    }

    public static void LJIIJ(String str) {
        String strLIZLLL = LIZLLL("ts_poi_review_post_entrance_last_ts", str);
        String strLIZLLL2 = LIZLLL("ts_poi_review_post_entrance_cur_ts", str);
        Keva keva = LIZIZ;
        keva.storeLong(strLIZLLL, keva.getLong(strLIZLLL2, -1L));
        keva.storeLong(strLIZLLL2, System.currentTimeMillis());
    }

    public static final class Frequency {

        @C09CT("frequency_day")
        public final int frequencyDay;

        @C09CT("frequency_times")
        public final int frequencyTimes;

        public Frequency(int i, int i2) {
            this.frequencyDay = i;
            this.frequencyTimes = i2;
        }
    }

    public static final class FriendPage {

        @C09CT("poi")
        public final Frequency poi;

        @C09CT("uid")
        public final Frequency uid;

        public FriendPage() {
            this(null, null);
        }

        public FriendPage(Frequency frequency, Frequency frequency2) {
            this.poi = frequency;
            this.uid = frequency2;
        }
    }

    public static String LIZLLL(String str, String str2) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class InnerConfig {

        @C09CT("detail_page")
        public final DetailPage detailPage;

        @C09CT("friend_page")
        public final FriendPage friendPage;

        @C09CT("profile_page")
        public final ProfilePage profilePage;

        public InnerConfig() {
            this(null, null, null);
        }

        public InnerConfig(FriendPage friendPage, ProfilePage profilePage, DetailPage detailPage) {
            this.friendPage = friendPage;
            this.profilePage = profilePage;
            this.detailPage = detailPage;
        }
    }

    public static final class ProfilePage {

        @C09CT("poi")
        public final Frequency poi;

        @C09CT("uid")
        public final Frequency uid;

        @C09CT("video")
        public final Frequency video;

        public ProfilePage() {
            this(null, null, null);
        }

        public ProfilePage(Frequency frequency, Frequency frequency2, Frequency frequency3) {
            this.video = frequency;
            this.poi = frequency2;
            this.uid = frequency3;
        }
    }
}
