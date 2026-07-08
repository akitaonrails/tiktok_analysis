package com.ss.android.ugc.aweme.performance;

import X.C2097608Jq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectSearchPageMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class SelectMusicFromSelectSearchPageMonitor implements PerformanceMonitor {
    public static final SelectMusicFromSelectSearchPageMonitor INSTANCE = new SelectMusicFromSelectSearchPageMonitor();
    public static final Parcelable.Creator<SelectMusicFromSelectSearchPageMonitor> CREATOR = new Parcelable.Creator<SelectMusicFromSelectSearchPageMonitor>() { // from class: X.0Kml
        @Override // android.os.Parcelable.Creator
        public final SelectMusicFromSelectSearchPageMonitor createFromParcel(Parcel parcel) {
            parcel.readInt();
            return SelectMusicFromSelectSearchPageMonitor.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final SelectMusicFromSelectSearchPageMonitor[] newArray(int i) {
            return new SelectMusicFromSelectSearchPageMonitor[i];
        }
    };

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final boolean IN() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final JSONObject aA(String str, String[] strArr, long[] jArr, HashMap<String, Long> map) {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final String getEnterFrom() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final String getType() {
        return "tool_performance_use_music_from_select_music_search_page";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final List<String> iF() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final Map<String, String> getExtraParams() {
        return C2097608Jq.LJ();
    }
}
