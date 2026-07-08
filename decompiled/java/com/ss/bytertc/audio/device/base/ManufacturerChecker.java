package com.ss.bytertc.audio.device.base;

import X.C08FF;
import android.os.Build;

/* JADX INFO: loaded from: classes35.dex */
public class ManufacturerChecker {
    public static Type typeResult;

    public static Type getManufacturerType() {
        return getManufacturerType(Build.BRAND);
    }

    public enum Type {
        UNKNOWN,
        XM,
        RM,
        HW,
        HR,
        VO,
        OP;

        public static Type valueOf(String str) {
            return (Type) C08FF.LIZ(Type.class, str);
        }
    }

    public static Type getManufacturerType(String str) {
        Type type = typeResult;
        if (type != null) {
            return type;
        }
        if (str != null && !str.isEmpty()) {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            String lowerCase = sb.toString().toLowerCase();
            if (lowerCase.equalsIgnoreCase("imoaix")) {
                typeResult = Type.XM;
            } else if (lowerCase.equalsIgnoreCase("imder")) {
                typeResult = Type.RM;
            } else if (lowerCase.equalsIgnoreCase("iewauh")) {
                typeResult = Type.HW;
            } else if (lowerCase.equalsIgnoreCase("ronoh")) {
                typeResult = Type.HR;
            } else if (lowerCase.equalsIgnoreCase("oviv")) {
                typeResult = Type.VO;
            } else if ((lowerCase.length() != 4 || !lowerCase.startsWith("op") || !lowerCase.endsWith("po")) && !lowerCase.equalsIgnoreCase("sulpeno") && !lowerCase.equalsIgnoreCase("emlaer")) {
                typeResult = Type.UNKNOWN;
            } else {
                typeResult = Type.OP;
            }
            return typeResult;
        }
        return Type.UNKNOWN;
    }
}
