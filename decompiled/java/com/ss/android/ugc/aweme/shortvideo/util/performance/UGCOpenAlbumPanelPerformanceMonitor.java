package com.ss.android.ugc.aweme.shortvideo.util.performance;

import X.C2097608Jq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.util.performance.UGCOpenAlbumPanelPerformanceMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class UGCOpenAlbumPanelPerformanceMonitor implements PerformanceMonitor {
    public static final UGCOpenAlbumPanelPerformanceMonitor INSTANCE = new UGCOpenAlbumPanelPerformanceMonitor();
    public static final Parcelable.Creator<UGCOpenAlbumPanelPerformanceMonitor> CREATOR = new Parcelable.Creator<UGCOpenAlbumPanelPerformanceMonitor>() { // from class: X.0Kr2
        @Override // android.os.Parcelable.Creator
        public final UGCOpenAlbumPanelPerformanceMonitor createFromParcel(Parcel parcel) {
            parcel.readInt();
            return UGCOpenAlbumPanelPerformanceMonitor.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final UGCOpenAlbumPanelPerformanceMonitor[] newArray(int i) {
            return new UGCOpenAlbumPanelPerformanceMonitor[i];
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
        return "tool_performance_open_album_panel_ugc_template";
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
