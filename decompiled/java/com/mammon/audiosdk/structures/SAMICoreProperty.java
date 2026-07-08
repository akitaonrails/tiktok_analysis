package com.mammon.audiosdk.structures;

import com.mammon.audiosdk.enums.SAMICoreDataType;
import com.mammon.audiosdk.enums.SAMICorePropertyId;

/* JADX INFO: loaded from: classes4.dex */
public class SAMICoreProperty {
    public int dataArrayLen;
    public byte[] dataByteArray;
    public Object[] dataObjectArray;
    public Object userContext;
    public int writable;
    public SAMICoreDataType type = SAMICoreDataType.SAMICoreDataType_Null;
    public SAMICorePropertyId id = SAMICorePropertyId.SAMICorePropertyID_Base_UNKNOWN;
    public String extraInfo = "";

    public int getDataType() {
        return this.type.getValue();
    }

    public int getExtraInfoLen() {
        String str = this.extraInfo;
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    public int getPropertyId() {
        return this.id.getValue();
    }

    public void setDataType(int i) {
        this.type = SAMICoreDataType.fromInt(i);
    }

    public void setPropertyId(int i) {
        this.id = SAMICorePropertyId.fromInt(i);
    }
}
