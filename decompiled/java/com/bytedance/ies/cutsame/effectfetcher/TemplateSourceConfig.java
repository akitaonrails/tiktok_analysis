package com.bytedance.ies.cutsame.effectfetcher;

import X.C2268931DrP;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;

/* JADX INFO: loaded from: classes36.dex */
public final class TemplateSourceConfig implements Parcelable {
    public final String ac;
    public final String accessKey;
    public final String appID;
    public final String appLanguage;
    public final String appVersion;
    public final String artistCacheDir;
    public final String artistHost;
    public final String deviceId;
    public final String effectCacheDir;
    public final String effectHost;
    public final String effectModelCacheDir;
    public final String effectSdkVersion;
    public final String imuseCacheDir;
    public final String imuseHost;
    public final boolean isEpRequest;
    public final String materialResourceAccessKey;
    public final String materialResourceAppId;
    public final String materialResourceAppName;
    public final String materialResourceAppVersion;
    public final String materialResourceCache;
    public final String materialResourceHost;
    public final int materialResourceStatus;
    public final String materialResourceTag;
    public final String mediaCacheDir;
    public final String musicCacheDir;
    public final String musicHost;
    public final String region;
    public final String templateCacheDir;
    public final String uid;
    public static final C2268931DrP Companion = new Object() { // from class: X.1DrP
    };
    public static final Parcelable.Creator<TemplateSourceConfig> CREATOR = new Parcelable.Creator<TemplateSourceConfig>() { // from class: X.1DPv
        @Override // android.os.Parcelable.Creator
        public final TemplateSourceConfig createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new TemplateSourceConfig(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, z, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateSourceConfig[] newArray(int i) {
            return new TemplateSourceConfig[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appID);
        parcel.writeString(this.appVersion);
        parcel.writeString(this.accessKey);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.region);
        parcel.writeString(this.appLanguage);
        parcel.writeString(this.templateCacheDir);
        parcel.writeString(this.mediaCacheDir);
        parcel.writeString(this.effectSdkVersion);
        parcel.writeString(this.effectHost);
        parcel.writeString(this.effectCacheDir);
        parcel.writeString(this.effectModelCacheDir);
        parcel.writeString(this.imuseHost);
        parcel.writeString(this.imuseCacheDir);
        parcel.writeString(this.artistHost);
        parcel.writeString(this.artistCacheDir);
        parcel.writeString(this.musicHost);
        parcel.writeString(this.musicCacheDir);
        parcel.writeInt(this.isEpRequest ? 1 : 0);
        parcel.writeString(this.materialResourceAccessKey);
        parcel.writeString(this.materialResourceAppId);
        parcel.writeString(this.materialResourceAppVersion);
        parcel.writeString(this.materialResourceAppName);
        parcel.writeString(this.ac);
        parcel.writeString(this.uid);
        parcel.writeInt(this.materialResourceStatus);
        parcel.writeString(this.materialResourceTag);
        parcel.writeString(this.materialResourceHost);
        parcel.writeString(this.materialResourceCache);
    }

    public TemplateSourceConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, int i, String str25, String str26, String str27) {
        this.appID = str;
        this.appVersion = str2;
        this.accessKey = str3;
        this.deviceId = str4;
        this.region = str5;
        this.appLanguage = str6;
        this.templateCacheDir = str7;
        this.mediaCacheDir = str8;
        this.effectSdkVersion = str9;
        this.effectHost = str10;
        this.effectCacheDir = str11;
        this.effectModelCacheDir = str12;
        this.imuseHost = str13;
        this.imuseCacheDir = str14;
        this.artistHost = str15;
        this.artistCacheDir = str16;
        this.musicHost = str17;
        this.musicCacheDir = str18;
        this.isEpRequest = z;
        this.materialResourceAccessKey = str19;
        this.materialResourceAppId = str20;
        this.materialResourceAppVersion = str21;
        this.materialResourceAppName = str22;
        this.ac = str23;
        this.uid = str24;
        this.materialResourceStatus = i;
        this.materialResourceTag = str25;
        this.materialResourceHost = str26;
        this.materialResourceCache = str27;
    }
}
