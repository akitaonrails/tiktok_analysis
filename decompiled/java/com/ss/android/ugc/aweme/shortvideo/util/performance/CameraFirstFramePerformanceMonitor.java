package com.ss.android.ugc.aweme.shortvideo.util.performance;

import X.C1697810uHb;
import X.C2097608Jq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class CameraFirstFramePerformanceMonitor implements PerformanceMonitor {
    public static final CameraFirstFramePerformanceMonitor INSTANCE = new CameraFirstFramePerformanceMonitor();
    public static final Parcelable.Creator<CameraFirstFramePerformanceMonitor> CREATOR = new Parcelable.Creator<CameraFirstFramePerformanceMonitor>() { // from class: X.0ptC
        @Override // android.os.Parcelable.Creator
        public final CameraFirstFramePerformanceMonitor createFromParcel(Parcel parcel) {
            parcel.readInt();
            return CameraFirstFramePerformanceMonitor.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final CameraFirstFramePerformanceMonitor[] newArray(int i) {
            return new CameraFirstFramePerformanceMonitor[i];
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
        return C1697810uHb.LJ("camera frame available", "PlanC onResume");
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final Map<String, String> getExtraParams() {
        return C2097608Jq.LJ();
    }
}
