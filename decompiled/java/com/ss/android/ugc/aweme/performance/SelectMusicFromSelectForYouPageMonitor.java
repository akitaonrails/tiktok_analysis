package com.ss.android.ugc.aweme.performance;

import X.C2097608Jq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectForYouPageMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class SelectMusicFromSelectForYouPageMonitor implements PerformanceMonitor {
    public static final SelectMusicFromSelectForYouPageMonitor INSTANCE = new SelectMusicFromSelectForYouPageMonitor();
    public static final Parcelable.Creator<SelectMusicFromSelectForYouPageMonitor> CREATOR = new Parcelable.Creator<SelectMusicFromSelectForYouPageMonitor>() { // from class: X.0Kmj
        @Override // android.os.Parcelable.Creator
        public final SelectMusicFromSelectForYouPageMonitor createFromParcel(Parcel parcel) {
            parcel.readInt();
            return SelectMusicFromSelectForYouPageMonitor.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final SelectMusicFromSelectForYouPageMonitor[] newArray(int i) {
            return new SelectMusicFromSelectForYouPageMonitor[i];
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
        return "tool_performance_use_music_from_select_music_for_you_page";
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
