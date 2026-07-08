package com.ss.android.ugc.aweme.performance;

import X.C1697810uHb;
import X.C2097608Jq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class OpenMusicPanelPerformanceMonitor implements PerformanceMonitor {
    public static final OpenMusicPanelPerformanceMonitor INSTANCE = new OpenMusicPanelPerformanceMonitor();
    public static final Parcelable.Creator<OpenMusicPanelPerformanceMonitor> CREATOR = new Parcelable.Creator<OpenMusicPanelPerformanceMonitor>() { // from class: X.13l8
        @Override // android.os.Parcelable.Creator
        public final OpenMusicPanelPerformanceMonitor createFromParcel(Parcel parcel) {
            parcel.readInt();
            return OpenMusicPanelPerformanceMonitor.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final OpenMusicPanelPerformanceMonitor[] newArray(int i) {
            return new OpenMusicPanelPerformanceMonitor[i];
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
        return "video_shoot_page";
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final String getType() {
        return "tool_performance_open_choose_music_panel";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final List<String> iF() {
        return C1697810uHb.LJ("animation_finished", "set_music_data");
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final Map<String, String> getExtraParams() {
        return C2097608Jq.LJ();
    }
}
