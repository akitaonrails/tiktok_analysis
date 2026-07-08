package com.ss.android.ugc.aweme.shortvideo.util.performance;

import X.C13LQ;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2241008qG;
import X.C577580Ml2;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class OpenAlbumPanelPerformanceMonitor implements PerformanceMonitor {
    public static final OpenAlbumPanelPerformanceMonitor INSTANCE = new OpenAlbumPanelPerformanceMonitor();
    public static final Parcelable.Creator<OpenAlbumPanelPerformanceMonitor> CREATOR = new Parcelable.Creator<OpenAlbumPanelPerformanceMonitor>() { // from class: X.0ptA
        @Override // android.os.Parcelable.Creator
        public final OpenAlbumPanelPerformanceMonitor createFromParcel(Parcel parcel) {
            parcel.readInt();
            return OpenAlbumPanelPerformanceMonitor.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final OpenAlbumPanelPerformanceMonitor[] newArray(int i) {
            return new OpenAlbumPanelPerformanceMonitor[i];
        }
    };

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final boolean IN() {
        return true;
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
        return "tool_performance_open_album_panel";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final List<String> iF() {
        return Collections.singletonList("imageLoaded");
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final Map<String, String> getExtraParams() {
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final JSONObject aA(String str, String[] strArr, long[] jArr, HashMap<String, Long> map) {
        if (strArr.length >= 2 && strArr.length == jArr.length) {
            C2241008qG c2241008qG = new C2241008qG();
            int length = strArr.length - 1;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                long j = jArr[i2] - jArr[i];
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("step");
                sbLIZ.append(i2);
                c2241008qG.LIZJ(Long.valueOf(j), C2188811AlT.LIZIZ(sbLIZ));
                Long lValueOf = Long.valueOf(j);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("step");
                sbLIZ2.append(i2);
                sbLIZ2.append('_');
                sbLIZ2.append(strArr[i]);
                sbLIZ2.append("_2_");
                sbLIZ2.append(strArr[i2]);
                map.put(C2188811AlT.LIZIZ(sbLIZ2), lValueOf);
                i = i2;
            }
            c2241008qG.LIZJ(Long.valueOf(jArr[jArr.length - 1] - jArr[0]), "totaltime");
            c2241008qG.LIZIZ(Integer.valueOf(strArr.length), "totalstep");
            c2241008qG.LIZLLL("type", str);
            for (Map.Entry<String, String> entry : C577580Ml2.LIZ.LIZJ(jArr[jArr.length - 1], C13LQ.LJJLL(strArr), C13LQ.LJJLJLI(jArr)).entrySet()) {
                c2241008qG.LIZLLL(entry.getKey(), entry.getValue());
            }
            return c2241008qG.LJ();
        }
        return null;
    }
}
