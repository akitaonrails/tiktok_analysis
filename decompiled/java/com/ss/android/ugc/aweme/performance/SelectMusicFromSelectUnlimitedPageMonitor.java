package com.ss.android.ugc.aweme.performance;

import X.C2097608Jq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectUnlimitedPageMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class SelectMusicFromSelectUnlimitedPageMonitor implements PerformanceMonitor {
    public static final SelectMusicFromSelectUnlimitedPageMonitor INSTANCE = new SelectMusicFromSelectUnlimitedPageMonitor();
    public static final Parcelable.Creator<SelectMusicFromSelectUnlimitedPageMonitor> CREATOR = new Parcelable.Creator<SelectMusicFromSelectUnlimitedPageMonitor>() { // from class: X.0Kmn
        @Override // android.os.Parcelable.Creator
        public final SelectMusicFromSelectUnlimitedPageMonitor createFromParcel(Parcel parcel) {
            parcel.readInt();
            return SelectMusicFromSelectUnlimitedPageMonitor.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final SelectMusicFromSelectUnlimitedPageMonitor[] newArray(int i) {
            return new SelectMusicFromSelectUnlimitedPageMonitor[i];
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
        return "tool_performance_use_music_from_select_music_unlimited_page";
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
