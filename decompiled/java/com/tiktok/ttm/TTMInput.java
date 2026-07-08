package com.tiktok.ttm;

import X.C08FF;

/* JADX INFO: loaded from: classes35.dex */
public class TTMInput {
    public long extendedFunc;
    public String machineCode;
    public long machineCodeAddress;
    public byte[] machineCodeByte;
    public long nativeParamAddress;
    public TTMParamData paramData;
    public ParamType paramType;
    public TTMContext ttmContext;

    /* JADX INFO: loaded from: classes8.dex */
    public enum ParamType {
        VOID(0),
        TYPE_MAP(10),
        TYPE_NATIVE_PARAM(13);

        public final int typeVal;

        public static ParamType valueOf(String str) {
            return (ParamType) C08FF.LIZ(ParamType.class, str);
        }

        ParamType(int i) {
            this.typeVal = i;
        }
    }
}
