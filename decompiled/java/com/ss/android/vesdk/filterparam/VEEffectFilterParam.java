package com.ss.android.vesdk.filterparam;

import X.C08FF;
import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes36.dex */
public class VEEffectFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEEffectFilterParam> CREATOR = new C2325341G0m(37);
    public String[] composerTags;
    public float[] composerValues;
    public EffectFilterType effectFilterType;
    public String effectPath;
    public boolean isSyncLoadResource;
    public long longRequestId;
    public long longStickerId;
    public boolean multicamMode;
    public boolean needReload;
    public final Map<String, String> optionalJsonConfig;
    public int reqId;
    public String resId;
    public boolean resourceQuickRelease;
    public int stickerId;
    public String stickerTag;
    public int timeout;
    public boolean useLongId;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEEffectFilterParam() {
        this.effectFilterType = EffectFilterType.DEFAULT;
        this.filterName = "filter effect";
        this.filterType = 8;
        this.effectPath = "";
        this.stickerTag = "";
        this.resId = "";
        this.optionalJsonConfig = new HashMap();
        this.isSyncLoadResource = false;
        this.composerTags = null;
        this.composerValues = null;
        this.multicamMode = false;
        this.resourceQuickRelease = false;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEEffectFilterParam{effectPath='");
        sbLIZ.append(this.effectPath);
        sbLIZ.append('\'');
        sbLIZ.append(", stickerId=");
        sbLIZ.append(this.stickerId);
        sbLIZ.append(", longStickerId=");
        sbLIZ.append(this.longStickerId);
        sbLIZ.append(", reqId=");
        sbLIZ.append(this.reqId);
        sbLIZ.append(", longReqId=");
        sbLIZ.append(this.longRequestId);
        sbLIZ.append(", useLongId=");
        sbLIZ.append(this.useLongId);
        sbLIZ.append(", timeout=");
        sbLIZ.append(this.timeout);
        sbLIZ.append(", needReload=");
        sbLIZ.append(this.needReload);
        sbLIZ.append(", stickerTag='");
        sbLIZ.append(this.stickerTag);
        sbLIZ.append('\'');
        sbLIZ.append(", resId='");
        sbLIZ.append(this.resId);
        sbLIZ.append('\'');
        sbLIZ.append(", json='");
        sbLIZ.append(this.optionalJsonConfig);
        sbLIZ.append('\'');
        sbLIZ.append(", isSyncLoadResource=");
        sbLIZ.append(this.isSyncLoadResource);
        sbLIZ.append(", composerTags=");
        sbLIZ.append(Arrays.toString(this.composerTags));
        sbLIZ.append(", composerValues=");
        sbLIZ.append(Arrays.toString(this.composerValues));
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append('\'');
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append('\'');
        sbLIZ.append(", effectFilterType=");
        sbLIZ.append(this.effectFilterType.ordinal());
        sbLIZ.append(", multicamMode=");
        sbLIZ.append(this.multicamMode);
        sbLIZ.append(", forceEffectResourceQuickRelease=");
        sbLIZ.append(this.resourceQuickRelease);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX INFO: loaded from: classes26.dex */
    public enum EffectFilterType {
        DEFAULT,
        MUSIC,
        AUDIO_SPEED,
        MIMO;

        public static EffectFilterType valueOf(String str) {
            return (EffectFilterType) C08FF.LIZ(EffectFilterType.class, str);
        }
    }

    public VEEffectFilterParam(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        super(parcel);
        this.effectFilterType = EffectFilterType.DEFAULT;
        this.effectPath = parcel.readString();
        this.stickerId = parcel.readInt();
        this.longStickerId = parcel.readLong();
        this.reqId = parcel.readInt();
        this.longRequestId = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useLongId = z;
        this.timeout = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.needReload = z2;
        this.stickerTag = parcel.readString();
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.resId = string;
        int i = parcel.readInt();
        this.optionalJsonConfig = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            this.optionalJsonConfig.put(parcel.readString(), parcel.readString());
        }
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isSyncLoadResource = z3;
        this.composerTags = parcel.createStringArray();
        this.composerValues = parcel.createFloatArray();
        this.effectFilterType = EffectFilterType.values()[parcel.readInt()];
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.multicamMode = z4;
        this.resourceQuickRelease = parcel.readByte() != 0;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.effectPath);
        parcel.writeInt(this.stickerId);
        parcel.writeLong(this.longStickerId);
        parcel.writeInt(this.reqId);
        parcel.writeLong(this.longRequestId);
        parcel.writeByte(this.useLongId ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.timeout);
        parcel.writeByte(this.needReload ? (byte) 1 : (byte) 0);
        parcel.writeString(this.stickerTag);
        parcel.writeString(this.resId);
        parcel.writeInt(this.optionalJsonConfig.size());
        for (Map.Entry<String, String> entry : this.optionalJsonConfig.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeByte(this.isSyncLoadResource ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.composerTags);
        parcel.writeFloatArray(this.composerValues);
        parcel.writeInt(this.effectFilterType.ordinal());
        parcel.writeByte(this.multicamMode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.resourceQuickRelease ? (byte) 1 : (byte) 0);
    }
}
