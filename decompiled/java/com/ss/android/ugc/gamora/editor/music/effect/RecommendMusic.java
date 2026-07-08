package com.ss.android.ugc.gamora.editor.music.effect;

import X.C09CT;
import X.C13BV;
import X.C1654330t9T;
import X.C1654340t9U;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class RecommendMusic extends C1654340t9U {

    @C09CT("from_recommend")
    public boolean fromRecommend;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("music_list")
    public List<MusicInfoAndEffectUseCount> musicList;
    public static final C1654330t9T Companion = new Object() { // from class: X.0t9T
    };
    public static final int $stable = 8;
    public static final RecommendMusic EMPTY = new RecommendMusic(C13BV.INSTANCE, null, false);

    public RecommendMusic() {
        this(null, null, false);
    }

    public final RecommendMusic copy(List<MusicInfoAndEffectUseCount> list, LogPbBean logPbBean, boolean z) {
        return new RecommendMusic(list, logPbBean, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendMusic)) {
            return false;
        }
        RecommendMusic recommendMusic = (RecommendMusic) obj;
        return Intrinsics.LJFF(this.musicList, recommendMusic.musicList) && Intrinsics.LJFF(this.logPb, recommendMusic.logPb) && this.fromRecommend == recommendMusic.fromRecommend;
    }

    public int hashCode() {
        List<MusicInfoAndEffectUseCount> list = this.musicList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        LogPbBean logPbBean = this.logPb;
        return ((iHashCode + (logPbBean != null ? logPbBean.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.fromRecommend);
    }

    @Override // X.C1654340t9U
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendMusic(musicList=");
        sbLIZ.append(this.musicList);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(", fromRecommend=");
        sbLIZ.append(this.fromRecommend);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getFromRecommend() {
        return this.fromRecommend;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final List<MusicInfoAndEffectUseCount> getMusicList() {
        return this.musicList;
    }

    public final void setFromRecommend(boolean z) {
        this.fromRecommend = z;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setMusicList(List<MusicInfoAndEffectUseCount> list) {
        this.musicList = list;
    }

    public RecommendMusic(List<MusicInfoAndEffectUseCount> list, LogPbBean logPbBean, boolean z) {
        this.musicList = list;
        this.logPb = logPbBean;
        this.fromRecommend = z;
    }
}
