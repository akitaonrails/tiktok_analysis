package com.tiktok.ttm;

import X.C08FF;
import X.C2188811AlT;
import X.C2213631BkP;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public final class TTMOutput {
    public Object data;
    public String msg;
    public ReturnType type;

    public String toString() {
        String string;
        int i = C2213631BkP.LIZ[this.type.ordinal()];
        if (i == 1) {
            string = Arrays.toString((long[]) this.data);
        } else if (i == 2) {
            string = Arrays.toString((double[]) this.data);
        } else if (i == 3 || i == 4) {
            string = Arrays.toString((Object[]) this.data);
        } else {
            Object obj = this.data;
            string = obj != null ? obj.toString() : "null";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\n\t\"msg\": ");
        sbLIZ.append(this.msg);
        sbLIZ.append(",\n\t\"data\": ");
        sbLIZ.append(string);
        sbLIZ.append("\n}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Object getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public ReturnType getType() {
        return this.type;
    }

    public enum ReturnType {
        ERROR(-1),
        BOOL(0),
        LONG(1),
        DOUBLE(2),
        STRING(3),
        LONG_ARRAY(4),
        DOUBLE_ARRAY(5),
        STRING_ARRAY(6),
        OBJECT_ARRAY(7),
        MAP(8),
        NULL(9),
        LIST(10),
        UN_SUPPORT(12);

        public int value;

        public static ReturnType parseFromIntVal(int i) {
            switch (i) {
                case 0:
                    return BOOL;
                case 1:
                    return LONG;
                case 2:
                    return DOUBLE;
                case 3:
                    return STRING;
                case 4:
                    return LONG_ARRAY;
                case 5:
                    return DOUBLE_ARRAY;
                case 6:
                    return STRING_ARRAY;
                case 7:
                    return OBJECT_ARRAY;
                case 8:
                    return MAP;
                case BdTuring.TYPE_ECAF /* 9 */:
                    return NULL;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    return LIST;
                case BdTuring.TYPE_EMAIL /* 11 */:
                default:
                    return ERROR;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    return UN_SUPPORT;
            }
        }

        public static ReturnType valueOf(String str) {
            return (ReturnType) C08FF.LIZ(ReturnType.class, str);
        }

        ReturnType(int i) {
            this.value = i;
        }
    }

    private int convertParamTypeToReturnType(int i) {
        switch (i) {
            case 0:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return ReturnType.MAP.value;
            case 1:
            case BdTuring.TYPE_EMAIL /* 11 */:
                return ReturnType.LIST.value;
            case 2:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            default:
                return i;
            case 3:
                return ReturnType.OBJECT_ARRAY.value;
            case 4:
                return ReturnType.LONG.value;
            case 5:
                return ReturnType.DOUBLE.value;
            case 6:
                return ReturnType.STRING.value;
            case 7:
                return ReturnType.LONG_ARRAY.value;
            case 8:
                return ReturnType.DOUBLE_ARRAY.value;
            case BdTuring.TYPE_ECAF /* 9 */:
                return ReturnType.STRING_ARRAY.value;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return ReturnType.NULL.value;
        }
    }

    private void nativeSetDoubleValue(double d) {
        this.msg = "ok";
        this.type = ReturnType.DOUBLE;
        this.data = Double.valueOf(d);
    }

    private void setErrorMessage(String str) {
        this.msg = str;
    }

    public static void NativeSetListBoolValue(List<Object> list, boolean z) {
        list.add(Boolean.valueOf(z));
    }

    public static void NativeSetListDoubleValue(List<Object> list, double d) {
        list.add(Double.valueOf(d));
    }

    public static void NativeSetListLongValue(List<Object> list, long j) {
        list.add(Long.valueOf(j));
    }

    public static void NativeSetListObjectValue(List<Object> list, Object obj) {
        list.add(obj);
    }

    private void nativeSetOutLongValue(int i, long j) {
        this.msg = "ok";
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                this.type = ReturnType.ERROR;
                this.data = Long.valueOf(j);
                this.msg = "error";
                return;
            } else {
                this.type = ReturnType.LONG;
                this.data = Long.valueOf(j);
                return;
            }
        }
        this.type = ReturnType.BOOL;
        if (j != 1) {
            z = false;
        }
        this.data = Boolean.valueOf(z);
    }

    private void nativeSetOutput(int i, Object obj) {
        if (i == -1) {
            this.type = ReturnType.ERROR;
            this.data = null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttm execute failed, error_meessage: ");
            sbLIZ.append(obj);
            this.msg = C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (i == 11 && (obj instanceof TTMParamData)) {
            TTMParamData tTMParamData = (TTMParamData) obj;
            Object inputData = tTMParamData.getInputData();
            i = convertParamTypeToReturnType(tTMParamData.getType());
            obj = inputData;
        }
        this.msg = "ok";
        this.type = ReturnType.parseFromIntVal(i);
        this.data = obj;
    }

    public static void NativeSetMapBoolValue(Map<Object, Object> map, Object obj, boolean z) {
        map.put(obj, Boolean.valueOf(z));
    }

    public static void NativeSetMapDoubleValue(Map<Object, Object> map, Object obj, double d) {
        map.put(obj, Double.valueOf(d));
    }

    public static void NativeSetMapLongValue(Map<Object, Object> map, Object obj, long j) {
        map.put(obj, Long.valueOf(j));
    }

    public static void NativeSetMapObjectValue(Map<Object, Object> map, Object obj, Object obj2) {
        map.put(obj, obj2);
    }

    public static void NativeSetObjectArrayBoolValue(Object[] objArr, int i, boolean z) {
        objArr[i] = Boolean.valueOf(z);
    }

    public static void NativeSetObjectArrayDoubleValue(Object[] objArr, int i, double d) {
        objArr[i] = Double.valueOf(d);
    }

    public static void NativeSetObjectArrayLongValue(Object[] objArr, int i, long j) {
        objArr[i] = Long.valueOf(j);
    }
}
