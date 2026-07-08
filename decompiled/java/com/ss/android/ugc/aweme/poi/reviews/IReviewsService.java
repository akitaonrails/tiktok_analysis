package com.ss.android.ugc.aweme.poi.reviews;

/* JADX INFO: loaded from: classes19.dex */
public interface IReviewsService {
    void friendPageUnifyFreqLog();

    int getTightenFriendPageDailyFreqTimes();

    int getTightenFriendPageWeeklyFreqTimes();

    int getTightenProfilePageDailyFreqTimes();

    int getTightenProfilePageWeeklyFreqTimes();

    boolean isFriendPageUnifyFreqHit();

    boolean isProfileCloseUnifyFreqHit();

    boolean isProfilePageUnifyFreqHit();

    boolean isTightenCloseFreqHit();

    boolean isTightenFriendPageDailyFreqHit();

    boolean isTightenFriendPageWeeklyFreqHit();

    boolean isTightenProfilePageDailyFreqHit();

    boolean isTightenProfilePageWeeklyFreqHit();

    void profileCloseUnifyFreqLog();

    void profilePageUnifyFreqLog();

    void tightenCloseFreqLog();

    void tightenFriendPageDailyFreqClicked();

    void tightenFriendPageDailyFreqLog();

    void tightenFriendPageWeeklyFreqClicked();

    void tightenFriendPageWeeklyFreqLog();

    void tightenProfilePageDailyFreqClicked();

    void tightenProfilePageDailyFreqLog();

    void tightenProfilePageWeeklyFreqClicked();

    void tightenProfilePageWeeklyFreqLog();
}
