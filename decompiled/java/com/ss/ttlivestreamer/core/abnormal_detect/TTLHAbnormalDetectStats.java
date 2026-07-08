package com.ss.ttlivestreamer.core.abnormal_detect;

import X.C1275590jIb;
import X.C2188811AlT;
import android.graphics.Matrix;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.statics.StaticsReport;
import com.ss.ttlivestreamer.core.utils.AVLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHAbnormalDetectStats extends StaticsReport {
    public int blackCount;
    public int blackDetectCount;
    public int errorCode;
    public int errorCount;
    public C1275590jIb extraFrameInfo;
    public int frameHeight;
    public int frameWidth;
    public int greenCount;
    public int greenDetectCount;
    public String abnormalType = "Unknown";
    public float blackFrameRatio = -1.0f;
    public float blackPixelRatio = -1.0f;
    public float greenFrameRatio = -1.0f;
    public float greenPixelRatio = -1.0f;
    public float avgY = -1.0f;
    public float avgU = -1.0f;
    public float avgV = -1.0f;

    public boolean isBlackOut() {
        return this.blackCount > 0;
    }

    public boolean isGreenOut() {
        return this.greenCount > 0;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("abnormal_type", this.abnormalType);
            jSONObject.put("black_frame_ratio", this.blackFrameRatio);
            jSONObject.put("black_pixel_ratio", this.blackPixelRatio);
            jSONObject.put("green_frame_ratio", this.greenFrameRatio);
            jSONObject.put("green_pixel_ratio", this.greenPixelRatio);
            jSONObject.put("avg_y", this.avgY);
            jSONObject.put("avg_u", this.avgU);
            jSONObject.put("avg_v", this.avgV);
            jSONObject.put("error_count", this.errorCount);
            jSONObject.put("error_code", this.errorCode);
            jSONObject.put("black_count", this.blackCount);
            jSONObject.put("black_detect_count", this.blackDetectCount);
            jSONObject.put("green_count", this.greenCount);
            jSONObject.put("green_detect_count", this.greenDetectCount);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.frameWidth);
            sbLIZ.append("/");
            sbLIZ.append(this.frameHeight);
            jSONObject.put("w/h", C2188811AlT.LIZIZ(sbLIZ));
            C1275590jIb c1275590jIb = this.extraFrameInfo;
            if (c1275590jIb != null) {
                jSONObject.put("render_type", c1275590jIb.LIZ);
                jSONObject.put("GlFenceValid", this.extraFrameInfo.LIZIZ);
                C1275590jIb c1275590jIb2 = this.extraFrameInfo;
                float[] fArr = c1275590jIb2.LIZJ;
                if (fArr == null || fArr.length <= 0) {
                    Matrix matrix = c1275590jIb2.LIZLLL;
                    if (matrix != null) {
                        fArr = new float[9];
                        matrix.getValues(fArr);
                    } else {
                        fArr = null;
                    }
                }
                if (fArr != null && fArr.length > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (float f : fArr) {
                        jSONArray.put(f);
                    }
                    jSONObject.put("TransformMatrix", jSONArray);
                    return jSONObject;
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.w("TTLHAbnormalStats", e.toString());
        }
        return jSONObject;
    }

    public TTLHAbnormalDetectStats() {
        setAbnormalType("Unknown");
        setBlackPixelRatio(this.blackPixelRatio);
        setBlackFrameRatio(this.blackFrameRatio);
        setGreenFrameRatio(this.greenFrameRatio);
        setGreenPixelRatio(this.greenPixelRatio);
        setAvgY(this.avgY);
        setAvgU(this.avgU);
        setAvgV(this.avgV);
        setBlackCount(this.blackDetectCount);
        setBlackDetectCount(this.blackDetectCount);
        setGreenCount(this.greenCount);
        setGreenDetectCount(this.greenDetectCount);
    }

    public void setAbnormalType(String str) {
        this.abnormalType = str;
        setString("abnormal_type", str);
    }

    public void setAvgU(float f) {
        this.avgU = f;
        setDouble("avg_u", f);
    }

    public void setAvgV(float f) {
        this.avgV = f;
        setDouble("avg_v", f);
    }

    public void setAvgY(float f) {
        this.avgY = f;
        setDouble("avg_y", f);
    }

    public void setBlackCount(int i) {
        this.blackCount = i;
        setInt("black_count", i);
    }

    public void setBlackDetectCount(int i) {
        this.blackDetectCount = i;
        setInt("black_detect_count", i);
    }

    public void setBlackFrameRatio(float f) {
        this.blackFrameRatio = f;
        setDouble("black_frame_ratio", f);
    }

    public void setBlackPixelRatio(float f) {
        this.blackPixelRatio = f;
        setDouble("black_pixel_ratio", f);
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
        setInt("error_code", i);
    }

    public void setErrorCount(int i) {
        this.errorCount = i;
        setInt("black_count", this.blackCount);
        setInt("green_count", this.greenCount);
    }

    public void setGreenCount(int i) {
        this.greenCount = i;
        setInt("green_count", i);
    }

    public void setGreenDetectCount(int i) {
        this.greenDetectCount = i;
        setInt("green_detect_count", i);
    }

    public void setGreenFrameRatio(float f) {
        this.greenFrameRatio = f;
        setDouble("green_frame_ratio", f);
    }

    public void setGreenPixelRatio(float f) {
        this.greenPixelRatio = f;
        setDouble("green_pixel_ratio", f);
    }
}
