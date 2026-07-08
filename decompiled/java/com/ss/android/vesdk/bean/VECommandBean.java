package com.ss.android.vesdk.bean;

/* JADX INFO: loaded from: classes.dex */
public class VECommandBean {
    public String commandTag;
    public String[] coordinateArray;
    public String keyValueArray;
    public String layerId;

    public String getCommandTag() {
        return this.commandTag;
    }

    public String[] getCoordinateArray() {
        return this.coordinateArray;
    }

    public String getKeyValueArray() {
        return this.keyValueArray;
    }

    public String getLayerId() {
        return this.layerId;
    }

    private void setCoordinateArray(String[] strArr) {
        this.coordinateArray = strArr;
    }
}
