package com.lynx.animax.property;

import X.C1289870jfd;
import X.C2188811AlT;
import X.EnumC1289860jfc;

/* JADX INFO: loaded from: classes21.dex */
public class AnimaXValueParam {
    public final EnumC1289860jfc LIZ;
    public final String LIZIZ;
    public final Number LIZJ;
    public final Boolean LIZLLL;
    public final C1289870jfd LJ;
    public final Integer LJFF;
    public final Integer LJI = null;

    public boolean getBooleanValue() {
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public int getColorValue() {
        Integer num;
        EnumC1289860jfc enumC1289860jfc = this.LIZ;
        if ((enumC1289860jfc == EnumC1289860jfc.COLOR || enumC1289860jfc == EnumC1289860jfc.COLOR_FILTER) && (num = this.LJFF) != null) {
            return num.intValue();
        }
        return 0;
    }

    public int getFilterMode() {
        if (this.LIZ == EnumC1289860jfc.COLOR_FILTER) {
            return (int) getNumberValue();
        }
        return 0;
    }

    public double getNumberValue() {
        Number number = this.LIZJ;
        if (number != null) {
            return number.doubleValue();
        }
        return 0.0d;
    }

    public int getTargetFrame() {
        Integer num = this.LJI;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public int getTypeIndex() {
        return this.LIZ.ordinal();
    }

    public double getX() {
        C1289870jfd c1289870jfd = this.LJ;
        if (c1289870jfd != null) {
            return c1289870jfd.LIZ;
        }
        return 0.0d;
    }

    public double getY() {
        C1289870jfd c1289870jfd = this.LJ;
        if (c1289870jfd != null) {
            return c1289870jfd.LIZIZ;
        }
        return 0.0d;
    }

    public double getZ() {
        C1289870jfd c1289870jfd = this.LJ;
        if (c1289870jfd != null) {
            return c1289870jfd.LIZJ;
        }
        return 0.0d;
    }

    public final String toString() {
        int targetFrame = getTargetFrame();
        switch (this.LIZ) {
            case STRING:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AnimaXValueParam{stringValue='");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append("', targetFrame=");
                sbLIZ.append(targetFrame);
                sbLIZ.append("}");
                return C2188811AlT.LIZIZ(sbLIZ);
            case NUMBER:
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AnimaXValueParam{numberValue=");
                sbLIZ2.append(getNumberValue());
                sbLIZ2.append(", targetFrame=");
                sbLIZ2.append(targetFrame);
                sbLIZ2.append("}");
                return C2188811AlT.LIZIZ(sbLIZ2);
            case BOOLEAN:
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("AnimaXValueParam{booleanValue=");
                sbLIZ3.append(getBooleanValue());
                sbLIZ3.append(", targetFrame=");
                sbLIZ3.append(targetFrame);
                sbLIZ3.append("}");
                return C2188811AlT.LIZIZ(sbLIZ3);
            case COORDINATE:
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("AnimaXValueParam{coordinateValue=(");
                sbLIZ4.append(getX());
                sbLIZ4.append(",");
                sbLIZ4.append(getY());
                sbLIZ4.append(",");
                sbLIZ4.append(getZ());
                sbLIZ4.append("), targetFrame=");
                sbLIZ4.append(targetFrame);
                sbLIZ4.append("}");
                return C2188811AlT.LIZIZ(sbLIZ4);
            case COLOR:
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("AnimaXValueParam{colorValue=");
                sbLIZ5.append(getColorValue());
                sbLIZ5.append(", targetFrame=");
                sbLIZ5.append(targetFrame);
                sbLIZ5.append("}");
                return C2188811AlT.LIZIZ(sbLIZ5);
            case COLOR_FILTER:
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("AnimaXValueParam{colorValue=");
                sbLIZ6.append(getColorValue());
                sbLIZ6.append(", mode=");
                sbLIZ6.append(getNumberValue());
                sbLIZ6.append(", targetFrame=");
                sbLIZ6.append(targetFrame);
                sbLIZ6.append("}");
                return C2188811AlT.LIZIZ(sbLIZ6);
            case NULL:
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("AnimaXValueParam{null, targetFrame=");
                sbLIZ7.append(targetFrame);
                sbLIZ7.append("}");
                return C2188811AlT.LIZIZ(sbLIZ7);
            default:
                return "AnimaXValueParam{unknown}";
        }
    }

    public String getStringValue() {
        return this.LIZIZ;
    }

    public static AnimaXValueParam fromBoolean(boolean z) {
        return new AnimaXValueParam(EnumC1289860jfc.BOOLEAN, null, null, Boolean.valueOf(z), null, null);
    }

    public static AnimaXValueParam fromColor(int i) {
        return new AnimaXValueParam(EnumC1289860jfc.COLOR, null, null, null, null, Integer.valueOf(i));
    }

    public static AnimaXValueParam fromNumber(double d) {
        return new AnimaXValueParam(EnumC1289860jfc.NUMBER, null, Double.valueOf(d), null, null, null);
    }

    public static AnimaXValueParam fromString(String str) {
        return new AnimaXValueParam(EnumC1289860jfc.STRING, str, null, null, null, null);
    }

    public static AnimaXValueParam fromColorFilter(int i, int i2) {
        return new AnimaXValueParam(EnumC1289860jfc.COLOR_FILTER, null, Double.valueOf(i2), null, null, Integer.valueOf(i));
    }

    public static AnimaXValueParam fromCoordinate(double d, double d2, double d3) {
        return new AnimaXValueParam(EnumC1289860jfc.COORDINATE, null, null, null, new C1289870jfd(d, d2, d3), null);
    }

    public AnimaXValueParam(EnumC1289860jfc enumC1289860jfc, String str, Number number, Boolean bool, C1289870jfd c1289870jfd, Integer num) {
        this.LIZ = enumC1289860jfc;
        this.LIZIZ = str;
        this.LIZJ = number;
        this.LIZLLL = bool;
        this.LJ = c1289870jfd;
        this.LJFF = num;
    }
}
