package com.ss.android.ugc.aweme.shortvideo.util.performance;

import X.C1697810uHb;
import X.C2097608Jq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitorV2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class CameraFirstFramePerformanceMonitorV2 implements PerformanceMonitor {
    public static final CameraFirstFramePerformanceMonitorV2 INSTANCE = new CameraFirstFramePerformanceMonitorV2();
    public static final Parcelable.Creator<CameraFirstFramePerformanceMonitorV2> CREATOR = new Parcelable.Creator<CameraFirstFramePerformanceMonitorV2>() { // from class: X.0ptB
        @Override // android.os.Parcelable.Creator
        public final CameraFirstFramePerformanceMonitorV2 createFromParcel(Parcel parcel) {
            parcel.readInt();
            return CameraFirstFramePerformanceMonitorV2.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final CameraFirstFramePerformanceMonitorV2[] newArray(int i) {
            return new CameraFirstFramePerformanceMonitorV2[i];
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
        return "av_camera_open_init";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final List<String> iF() {
        return C1697810uHb.LJ("camera frame available");
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final Map<String, String> getExtraParams() {
        return C2097608Jq.LJ();
    }
}
