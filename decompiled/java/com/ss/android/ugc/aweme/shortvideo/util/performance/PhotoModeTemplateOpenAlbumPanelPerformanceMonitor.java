package com.ss.android.ugc.aweme.shortvideo.util.performance;

import X.C2097608Jq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.util.performance.PhotoModeTemplateOpenAlbumPanelPerformanceMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class PhotoModeTemplateOpenAlbumPanelPerformanceMonitor implements PerformanceMonitor {
    public static final PhotoModeTemplateOpenAlbumPanelPerformanceMonitor INSTANCE = new PhotoModeTemplateOpenAlbumPanelPerformanceMonitor();
    public static final Parcelable.Creator<PhotoModeTemplateOpenAlbumPanelPerformanceMonitor> CREATOR = new Parcelable.Creator<PhotoModeTemplateOpenAlbumPanelPerformanceMonitor>() { // from class: X.0Kr0
        @Override // android.os.Parcelable.Creator
        public final PhotoModeTemplateOpenAlbumPanelPerformanceMonitor createFromParcel(Parcel parcel) {
            parcel.readInt();
            return PhotoModeTemplateOpenAlbumPanelPerformanceMonitor.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoModeTemplateOpenAlbumPanelPerformanceMonitor[] newArray(int i) {
            return new PhotoModeTemplateOpenAlbumPanelPerformanceMonitor[i];
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
        return "tool_performance_open_album_panel_photo_mode_template";
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
