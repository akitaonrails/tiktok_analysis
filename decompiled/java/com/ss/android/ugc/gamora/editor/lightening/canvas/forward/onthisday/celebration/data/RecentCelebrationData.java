package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.data;

import X.C09CT;
import com.ss.android.ugc.aweme.story.celebration.CelebrationExtraParams;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes9.dex */
public final class RecentCelebrationData implements Serializable {
    public static final int $stable = 8;

    @C09CT("exit_cele_date")
    public ConcurrentMap<String, String> celebrationExitDetail;

    @C09CT("date")
    public String date;

    @C09CT("extra_params")
    public Map<String, CelebrationExtraParams> extraParams;

    @C09CT("last_pull_date")
    public String lastPullDate;

    @C09CT("ready_celebration")
    public List<Integer> readyCelebration;

    @C09CT("recent_celebration")
    public List<Integer> recentCelebration;

    @C09CT("today_celebration")
    public List<Integer> todayCelebration;

    public RecentCelebrationData() {
        this(null, null, null, new ConcurrentHashMap(), "", "", null);
    }

    public final ConcurrentMap<String, String> getCelebrationExitDetail() {
        return this.celebrationExitDetail;
    }

    public final String getDate() {
        return this.date;
    }

    public final Map<String, CelebrationExtraParams> getExtraParams() {
        return this.extraParams;
    }

    public final String getLastPullDate() {
        return this.lastPullDate;
    }

    public final List<Integer> getReadyCelebration() {
        return this.readyCelebration;
    }

    public final List<Integer> getRecentCelebration() {
        return this.recentCelebration;
    }

    public final List<Integer> getTodayCelebration() {
        return this.todayCelebration;
    }

    public final void setCelebrationExitDetail(ConcurrentMap<String, String> concurrentMap) {
        this.celebrationExitDetail = concurrentMap;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setExtraParams(Map<String, CelebrationExtraParams> map) {
        this.extraParams = map;
    }

    public final void setLastPullDate(String str) {
        this.lastPullDate = str;
    }

    public final void setReadyCelebration(List<Integer> list) {
        this.readyCelebration = list;
    }

    public final void setRecentCelebration(List<Integer> list) {
        this.recentCelebration = list;
    }

    public final void setTodayCelebration(List<Integer> list) {
        this.todayCelebration = list;
    }

    public RecentCelebrationData(List<Integer> list, List<Integer> list2, List<Integer> list3, ConcurrentMap<String, String> concurrentMap, String str, String str2, Map<String, CelebrationExtraParams> map) {
        this.recentCelebration = list;
        this.todayCelebration = list2;
        this.readyCelebration = list3;
        this.celebrationExitDetail = concurrentMap;
        this.date = str;
        this.lastPullDate = str2;
        this.extraParams = map;
    }
}
