package com.ss.android.ugc.playerkit.model;

import X.C2188811AlT;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PlayerPowerThermalConfig {
    public CurveParamFactor curveParamFactor;
    public boolean enableAdjustBrSelect;
    public boolean enableAdjustPreRender;
    public boolean enableAdjustSr;
    public boolean enableAdjustTextureRender;
    public SrFactor srFactor;

    public static class CurveParamFactor {
        public List<Float> lightThermalParamFactor;
        public List<Float> lowPowerParamFactor;
        public List<Float> moderateThermalParamFactor;
        public List<Float> severeThermalParamFactor;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CurveParamFactor{lowPowerParamFactor=");
            List<Float> list = this.lowPowerParamFactor;
            sbLIZ.append(list != null ? Arrays.toString(list.toArray()) : "null");
            sbLIZ.append(", lightThermalParamFactor=");
            List<Float> list2 = this.lightThermalParamFactor;
            sbLIZ.append(list2 != null ? Arrays.toString(list2.toArray()) : "null");
            sbLIZ.append(", moderateThermalParamFactor=");
            List<Float> list3 = this.moderateThermalParamFactor;
            sbLIZ.append(list3 != null ? Arrays.toString(list3.toArray()) : "null");
            sbLIZ.append(", severeThermalParamFactor=");
            List<Float> list4 = this.severeThermalParamFactor;
            sbLIZ.append(list4 != null ? Arrays.toString(list4.toArray()) : "null");
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static class SrFactor {
        public float lightThermalSrFactor;
        public float lowPowerSrFactor;
        public float moderateThermalSrFactor;
        public float severeThermalSrFactor;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SrFactor{lowPowerSrFactor=");
            sbLIZ.append(this.lowPowerSrFactor);
            sbLIZ.append(", lightThermalSrFactor=");
            sbLIZ.append(this.lightThermalSrFactor);
            sbLIZ.append(", moderateThermalSrFactor=");
            sbLIZ.append(this.moderateThermalSrFactor);
            sbLIZ.append(", severeThermalSrFactor=");
            sbLIZ.append(this.severeThermalSrFactor);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayerPowerThermalConfig{enableAdjustSr=");
        sbLIZ.append(this.enableAdjustSr);
        sbLIZ.append(", srFactor=");
        sbLIZ.append(this.srFactor);
        sbLIZ.append(", enableAdjustBrSelect=");
        sbLIZ.append(this.enableAdjustBrSelect);
        sbLIZ.append(", curveParamFactor=");
        sbLIZ.append(this.curveParamFactor);
        sbLIZ.append(", enableAdjustTextureRender=");
        sbLIZ.append(this.enableAdjustTextureRender);
        sbLIZ.append(", enableAdjustPreRender=");
        sbLIZ.append(this.enableAdjustPreRender);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean isCurveParamFactorValid(CurveParamFactor curveParamFactor) {
        List<Float> list;
        List<Float> list2;
        List<Float> list3;
        List<Float> list4;
        if (curveParamFactor != null && (list = curveParamFactor.lowPowerParamFactor) != null && list.size() == 5 && (list2 = curveParamFactor.lightThermalParamFactor) != null && list2.size() == 5 && (list3 = curveParamFactor.moderateThermalParamFactor) != null && list3.size() == 5 && (list4 = curveParamFactor.severeThermalParamFactor) != null && list4.size() == 5) {
            return true;
        }
        return false;
    }
}
