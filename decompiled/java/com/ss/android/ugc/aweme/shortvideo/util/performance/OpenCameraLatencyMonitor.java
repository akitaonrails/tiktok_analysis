package com.ss.android.ugc.aweme.shortvideo.util.performance;

import X.C13LQ;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2241008qG;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.services.performance.OpenCameraStep;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenCameraLatencyMonitor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class OpenCameraLatencyMonitor implements PerformanceMonitor {
    public static final OpenCameraLatencyMonitor INSTANCE = new OpenCameraLatencyMonitor();
    public static boolean codeStart = true;
    public static final Parcelable.Creator<OpenCameraLatencyMonitor> CREATOR = new Parcelable.Creator<OpenCameraLatencyMonitor>() { // from class: X.0tKw
        @Override // android.os.Parcelable.Creator
        public final OpenCameraLatencyMonitor createFromParcel(Parcel parcel) {
            parcel.readInt();
            return OpenCameraLatencyMonitor.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final OpenCameraLatencyMonitor[] newArray(int i) {
            return new OpenCameraLatencyMonitor[i];
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
        return "av_video_open_camera_track";
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final List<String> iF() {
        return C1697810uHb.LJ(OpenCameraStep.ANIMATION_DONE.getStepName(), OpenCameraStep.CAMERA_FIRST_FRAME.getStepName());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final Map<String, String> getExtraParams() {
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final JSONObject aA(String str, String[] strArr, long[] jArr, HashMap<String, Long> map) {
        if (strArr.length == jArr.length && strArr.length == OpenCameraStep.values().length) {
            for (OpenCameraStep openCameraStep : OpenCameraStep.values()) {
                if (C13LQ.LJJIJIIJI(openCameraStep.getStepName(), strArr) < 0) {
                    return null;
                }
            }
            C2241008qG c2241008qG = new C2241008qG();
            OpenCameraStep openCameraStep2 = OpenCameraStep.START_TIME;
            OpenCameraStep openCameraStep3 = OpenCameraStep.REAL_START;
            LIZ(c2241008qG, map, strArr, jArr, "step1", openCameraStep2, openCameraStep3);
            OpenCameraStep openCameraStep4 = OpenCameraStep.SAA_ON_CREATE_BEGIN;
            LIZ(c2241008qG, map, strArr, jArr, "step2", openCameraStep3, openCameraStep4);
            LIZ(c2241008qG, map, strArr, jArr, "step3", openCameraStep4, OpenCameraStep.SAA_ON_CREATE_END);
            LIZ(c2241008qG, map, strArr, jArr, "step4", OpenCameraStep.SAA_ON_START_BEGIN, OpenCameraStep.SAA_ON_START_END);
            OpenCameraStep openCameraStep5 = OpenCameraStep.SAA_ON_RESUME_BEGIN;
            OpenCameraStep openCameraStep6 = OpenCameraStep.SAA_ON_RESUME_END;
            LIZ(c2241008qG, map, strArr, jArr, "step5", openCameraStep5, openCameraStep6);
            OpenCameraStep openCameraStep7 = OpenCameraStep.ANIMATION_DONE;
            LIZ(c2241008qG, map, strArr, jArr, "step6", openCameraStep6, openCameraStep7);
            OpenCameraStep openCameraStep8 = OpenCameraStep.CAMERA_FIRST_FRAME;
            LIZ(c2241008qG, map, strArr, jArr, "step7", openCameraStep6, openCameraStep8);
            LIZ(c2241008qG, map, strArr, jArr, "step10", openCameraStep2, openCameraStep8);
            LIZ(c2241008qG, map, strArr, jArr, "step11", OpenCameraStep.INIT_RECORDER_BEGIN, OpenCameraStep.INIT_RECORDER_END);
            LIZ(c2241008qG, map, strArr, jArr, "step12", OpenCameraStep.PLAN_C_ON_ACTIVITY_CREATED_BEGIN, OpenCameraStep.PLAN_C_ON_ACTIVITY_CREATED_END);
            LIZ(c2241008qG, map, strArr, jArr, "totaltime", openCameraStep2, openCameraStep7);
            c2241008qG.LIZIZ(Integer.valueOf(strArr.length), "totalstep");
            c2241008qG.LIZLLL("type", str);
            c2241008qG.LIZ(Boolean.valueOf(codeStart), "cold_start");
            if (codeStart) {
                codeStart = false;
            }
            return c2241008qG.LJ();
        }
        return null;
    }

    public static final void LIZ(C2241008qG c2241008qG, HashMap<String, Long> map, String[] strArr, long[] jArr, String str, OpenCameraStep openCameraStep, OpenCameraStep openCameraStep2) {
        int i;
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 < length) {
                if (Intrinsics.LJFF(strArr[i3], openCameraStep.getStepName())) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i3 = -1;
                break;
            }
        }
        int length2 = strArr.length;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            if (Intrinsics.LJFF(strArr[i2], openCameraStep2.getStepName())) {
                i = i2;
                break;
            }
            i2++;
        }
        long j = jArr[i] - jArr[i3];
        c2241008qG.LIZJ(Long.valueOf(j), str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(':');
        sbLIZ.append(openCameraStep.getStepName());
        sbLIZ.append("_2_");
        sbLIZ.append(openCameraStep2.getStepName());
        map.put(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(j));
    }
}
