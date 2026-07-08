package com.tiktok.strategycenterengineimpl.storagecenter.model;

/* JADX INFO: loaded from: classes35.dex */
public final class TTMPackageModel {
    public Object content;
    public String contentDataFilePath;
    public String contentMD5;
    public long contentNativeAddress;
    public int contentSize;
    public int contentType;
    public int engineType;
    public String packageKey;
    public int runTimeType;

    public TTMPackageModel() {
        this(null, 0, 0, null, null, 0L, 0, null, -1);
    }

    private final native long nativeMakePackageModel(String str, int i, int i2, String str2, Object obj, int i3, String str3, int i4);

    public long makeNativeModel() {
        String str = this.packageKey;
        if (str == null) {
            str = "";
        }
        int i = this.engineType;
        int i2 = this.contentSize;
        String str2 = this.contentMD5;
        if (str2 == null) {
            str2 = "";
        }
        Object obj = this.content;
        if (obj == null) {
            obj = "";
        }
        int i3 = this.contentType;
        String str3 = this.contentDataFilePath;
        return nativeMakePackageModel(str, i, i2, str2, obj, i3, str3 != null ? str3 : "", this.runTimeType);
    }

    public final Object getContent() {
        return this.content;
    }

    public final String getContentDataFilePath() {
        return this.contentDataFilePath;
    }

    public final String getContentMD5() {
        return this.contentMD5;
    }

    public final long getContentNativeAddress() {
        return this.contentNativeAddress;
    }

    public final int getContentSize() {
        return this.contentSize;
    }

    public final int getContentType() {
        return this.contentType;
    }

    public final int getEngineType() {
        return this.engineType;
    }

    public final String getPackageKey() {
        return this.packageKey;
    }

    public final int getRunTimeType() {
        return this.runTimeType;
    }

    public final void setContent(Object obj) {
        this.content = obj;
    }

    public final void setContentDataFilePath(String str) {
        this.contentDataFilePath = str;
    }

    public final void setContentMD5(String str) {
        this.contentMD5 = str;
    }

    public final void setContentNativeAddress(long j) {
        this.contentNativeAddress = j;
    }

    public final void setContentSize(int i) {
        this.contentSize = i;
    }

    public final void setContentType(int i) {
        this.contentType = i;
    }

    public final void setEngineType(int i) {
        this.engineType = i;
    }

    public final void setPackageKey(String str) {
        this.packageKey = str;
    }

    public final void setRunTimeType(int i) {
        this.runTimeType = i;
    }

    public TTMPackageModel(String str, int i, int i2, String str2, Object obj, long j, int i3, String str3, int i4) {
        this.packageKey = str;
        this.engineType = i;
        this.contentSize = i2;
        this.contentMD5 = str2;
        this.content = obj;
        this.contentNativeAddress = j;
        this.contentType = i3;
        this.contentDataFilePath = str3;
        this.runTimeType = i4;
    }
}
