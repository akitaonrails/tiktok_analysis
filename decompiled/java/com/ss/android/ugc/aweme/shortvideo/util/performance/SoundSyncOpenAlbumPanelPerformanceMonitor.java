package com.ss.android.ugc.aweme.shortvideo.util.performance;

import X.C2097608Jq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.util.performance.SoundSyncOpenAlbumPanelPerformanceMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class SoundSyncOpenAlbumPanelPerformanceMonitor implements PerformanceMonitor {
    public static final SoundSyncOpenAlbumPanelPerformanceMonitor INSTANCE = new SoundSyncOpenAlbumPanelPerformanceMonitor();
    public static final Parcelable.Creator<SoundSyncOpenAlbumPanelPerformanceMonitor> CREATOR = new Parcelable.Creator<SoundSyncOpenAlbumPanelPerformanceMonitor>() { // from class: X.0Kr1
        @Override // android.os.Parcelable.Creator
        public final SoundSyncOpenAlbumPanelPerformanceMonitor createFromParcel(Parcel parcel) {
            parcel.readInt();
            return SoundSyncOpenAlbumPanelPerformanceMonitor.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final SoundSyncOpenAlbumPanelPerformanceMonitor[] newArray(int i) {
            return new SoundSyncOpenAlbumPanelPerformanceMonitor[i];
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
        return "tool_performance_open_album_panel_sound_sync";
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
