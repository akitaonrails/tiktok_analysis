package com.ss.android.ugc.aweme.shortvideo.util.performance;

import X.C2097608Jq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.util.performance.AutoCutAnchorOpenAlbumPerformanceMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoCutAnchorOpenAlbumPerformanceMonitor implements PerformanceMonitor {
    public static final AutoCutAnchorOpenAlbumPerformanceMonitor INSTANCE = new AutoCutAnchorOpenAlbumPerformanceMonitor();
    public static final Parcelable.Creator<AutoCutAnchorOpenAlbumPerformanceMonitor> CREATOR = new Parcelable.Creator<AutoCutAnchorOpenAlbumPerformanceMonitor>() { // from class: X.0Kqn
        @Override // android.os.Parcelable.Creator
        public final AutoCutAnchorOpenAlbumPerformanceMonitor createFromParcel(Parcel parcel) {
            parcel.readInt();
            return AutoCutAnchorOpenAlbumPerformanceMonitor.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final AutoCutAnchorOpenAlbumPerformanceMonitor[] newArray(int i) {
            return new AutoCutAnchorOpenAlbumPerformanceMonitor[i];
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
        return "tool_performance_open_album_panel_autocut_anchor";
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
