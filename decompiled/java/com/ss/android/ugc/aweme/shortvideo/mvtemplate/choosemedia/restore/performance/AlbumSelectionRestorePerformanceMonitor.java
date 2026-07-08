package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.restore.performance;

import X.C2097608Jq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.restore.performance.AlbumSelectionRestorePerformanceMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumSelectionRestorePerformanceMonitor implements PerformanceMonitor {
    public static final AlbumSelectionRestorePerformanceMonitor INSTANCE = new AlbumSelectionRestorePerformanceMonitor();
    public static final String type = "tool_performance_album_selection_restore_query";
    public static final Parcelable.Creator<AlbumSelectionRestorePerformanceMonitor> CREATOR = new Parcelable.Creator<AlbumSelectionRestorePerformanceMonitor>() { // from class: X.0Kmd
        @Override // android.os.Parcelable.Creator
        public final AlbumSelectionRestorePerformanceMonitor createFromParcel(Parcel parcel) {
            parcel.readInt();
            return AlbumSelectionRestorePerformanceMonitor.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumSelectionRestorePerformanceMonitor[] newArray(int i) {
            return new AlbumSelectionRestorePerformanceMonitor[i];
        }
    };
    public static final int $stable = 8;

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

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final String getType() {
        return type;
    }
}
