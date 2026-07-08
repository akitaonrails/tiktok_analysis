package com.ss.android.ugc.aweme.shortvideo.util.performance;

import X.C1697810uHb;
import X.C2097608Jq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.util.performance.VideoRecordFirstFramePerformanceMonitor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class VideoRecordFirstFramePerformanceMonitor implements PerformanceMonitor {
    public static final VideoRecordFirstFramePerformanceMonitor INSTANCE = new VideoRecordFirstFramePerformanceMonitor();
    public static final Parcelable.Creator<VideoRecordFirstFramePerformanceMonitor> CREATOR = new Parcelable.Creator<VideoRecordFirstFramePerformanceMonitor>() { // from class: X.0ptD
        @Override // android.os.Parcelable.Creator
        public final VideoRecordFirstFramePerformanceMonitor createFromParcel(Parcel parcel) {
            parcel.readInt();
            return VideoRecordFirstFramePerformanceMonitor.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final VideoRecordFirstFramePerformanceMonitor[] newArray(int i) {
            return new VideoRecordFirstFramePerformanceMonitor[i];
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
        return "av_video_record_init";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final List<String> iF() {
        return C1697810uHb.LJ("PlanC onResume");
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final Map<String, String> getExtraParams() {
        return C2097608Jq.LJ();
    }
}
