package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.minis.model.MinisMeta;
import com.ss.android.ugc.aweme.minis.model.MinisRegisteredRewardTask;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisMeta implements Parcelable {

    @C09CT("allowed_domains")
    public final List<String> allowedDomains;

    @C09CT("app_version")
    public final String appVersion;

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("client_key_type")
    public final Integer clientKeyType;

    @C09CT("config")
    public final String config;

    @C09CT("description")
    public final String description;

    @C09CT("entity")
    public final String entity;

    @C09CT("icon_big_url")
    public final String iconBigUrl;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("minis_category")
    public final String minisCategory;

    @C09CT("minis_status")
    public final Integer minisStatus;

    @C09CT("minis_tech_type")
    public final Integer minisTechType;

    @C09CT("minis_type")
    public final Integer minisType;

    @C09CT("minis_url")
    public final String minisUrl;

    @C09CT("name")
    public final String name;

    @C09CT("package_config")
    public final String packageConfig;

    @C09CT("privacy_url")
    public final String privacyUrl;

    @C09CT("registered_reward_tasks")
    public final List<MinisRegisteredRewardTask> registeredRewardTasks;

    @C09CT("scopes")
    public final List<String> scopes;

    @C09CT("tos_url")
    public final String tosUrl;

    @C09CT("update_time")
    public final String updateTime;
    public static final Parcelable.Creator<MinisMeta> CREATOR = new Parcelable.Creator<MinisMeta>() { // from class: X.0wSE
        @Override // android.os.Parcelable.Creator
        public final MinisMeta createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            ArrayList arrayList;
            MinisRegisteredRewardTask minisRegisteredRewardTaskCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    if (parcel.readInt() == 0) {
                        minisRegisteredRewardTaskCreateFromParcel = null;
                    } else {
                        minisRegisteredRewardTaskCreateFromParcel = MinisRegisteredRewardTask.CREATOR.createFromParcel(parcel);
                    }
                    arrayList.add(minisRegisteredRewardTaskCreateFromParcel);
                }
            }
            return new MinisMeta(string, numValueOf, numValueOf2, numValueOf3, numValueOf4, string2, string3, string4, string5, string6, string7, string8, arrayListCreateStringArrayList, string9, string10, string11, string12, arrayListCreateStringArrayList2, string13, string14, string15, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MinisMeta[] newArray(int i) {
            return new MinisMeta[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisMeta)) {
            return false;
        }
        MinisMeta minisMeta = (MinisMeta) obj;
        return Intrinsics.LJFF(this.clientKey, minisMeta.clientKey) && Intrinsics.LJFF(this.clientKeyType, minisMeta.clientKeyType) && Intrinsics.LJFF(this.minisType, minisMeta.minisType) && Intrinsics.LJFF(this.minisTechType, minisMeta.minisTechType) && Intrinsics.LJFF(this.minisStatus, minisMeta.minisStatus) && Intrinsics.LJFF(this.name, minisMeta.name) && Intrinsics.LJFF(this.description, minisMeta.description) && Intrinsics.LJFF(this.iconUrl, minisMeta.iconUrl) && Intrinsics.LJFF(this.iconBigUrl, minisMeta.iconBigUrl) && Intrinsics.LJFF(this.appVersion, minisMeta.appVersion) && Intrinsics.LJFF(this.minisUrl, minisMeta.minisUrl) && Intrinsics.LJFF(this.privacyUrl, minisMeta.privacyUrl) && Intrinsics.LJFF(this.allowedDomains, minisMeta.allowedDomains) && Intrinsics.LJFF(this.config, minisMeta.config) && Intrinsics.LJFF(this.packageConfig, minisMeta.packageConfig) && Intrinsics.LJFF(this.updateTime, minisMeta.updateTime) && Intrinsics.LJFF(this.tosUrl, minisMeta.tosUrl) && Intrinsics.LJFF(this.scopes, minisMeta.scopes) && Intrinsics.LJFF(this.entity, minisMeta.entity) && Intrinsics.LJFF(this.minisCategory, minisMeta.minisCategory) && Intrinsics.LJFF(this.merchantId, minisMeta.merchantId) && Intrinsics.LJFF(this.registeredRewardTasks, minisMeta.registeredRewardTasks);
    }

    public final int hashCode() {
        String str = this.clientKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.clientKeyType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minisType;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.minisTechType;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.minisStatus;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconUrl;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconBigUrl;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.appVersion;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.minisUrl;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.privacyUrl;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<String> list = this.allowedDomains;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        String str9 = this.config;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.packageConfig;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.updateTime;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.tosUrl;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<String> list2 = this.scopes;
        int iHashCode18 = (iHashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str13 = this.entity;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.minisCategory;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.merchantId;
        int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List<MinisRegisteredRewardTask> list3 = this.registeredRewardTasks;
        return iHashCode21 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "MinisMeta(clientKey=" + this.clientKey + ", clientKeyType=" + this.clientKeyType + ", minisType=" + this.minisType + ", minisTechType=" + this.minisTechType + ", minisStatus=" + this.minisStatus + ", name=" + this.name + ", description=" + this.description + ", iconUrl=" + this.iconUrl + ", iconBigUrl=" + this.iconBigUrl + ", appVersion=" + this.appVersion + ", minisUrl=" + this.minisUrl + ", privacyUrl=" + this.privacyUrl + ", allowedDomains=" + this.allowedDomains + ", config=" + this.config + ", packageConfig=" + this.packageConfig + ", updateTime=" + this.updateTime + ", tosUrl=" + this.tosUrl + ", scopes=" + this.scopes + ", entity=" + this.entity + ", minisCategory=" + this.minisCategory + ", merchantId=" + this.merchantId + ", registeredRewardTasks=" + this.registeredRewardTasks + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientKey);
        Integer num = this.clientKeyType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.minisType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.minisTechType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.minisStatus;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.iconBigUrl);
        parcel.writeString(this.appVersion);
        parcel.writeString(this.minisUrl);
        parcel.writeString(this.privacyUrl);
        parcel.writeStringList(this.allowedDomains);
        parcel.writeString(this.config);
        parcel.writeString(this.packageConfig);
        parcel.writeString(this.updateTime);
        parcel.writeString(this.tosUrl);
        parcel.writeStringList(this.scopes);
        parcel.writeString(this.entity);
        parcel.writeString(this.minisCategory);
        parcel.writeString(this.merchantId);
        List<MinisRegisteredRewardTask> list = this.registeredRewardTasks;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (MinisRegisteredRewardTask minisRegisteredRewardTask : list) {
            if (minisRegisteredRewardTask == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                minisRegisteredRewardTask.writeToParcel(parcel, i);
            }
        }
    }

    public MinisMeta(String str, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list, String str9, String str10, String str11, String str12, List<String> list2, String str13, String str14, String str15, List<MinisRegisteredRewardTask> list3) {
        this.clientKey = str;
        this.clientKeyType = num;
        this.minisType = num2;
        this.minisTechType = num3;
        this.minisStatus = num4;
        this.name = str2;
        this.description = str3;
        this.iconUrl = str4;
        this.iconBigUrl = str5;
        this.appVersion = str6;
        this.minisUrl = str7;
        this.privacyUrl = str8;
        this.allowedDomains = list;
        this.config = str9;
        this.packageConfig = str10;
        this.updateTime = str11;
        this.tosUrl = str12;
        this.scopes = list2;
        this.entity = str13;
        this.minisCategory = str14;
        this.merchantId = str15;
        this.registeredRewardTasks = list3;
    }

    public MinisMeta(String str, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, String str12, List list2, String str13, String str14, String str15, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, num2, num3, num4, str2, str3, str4, str5, str6, str7, str8, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list, str9, str10, str11, str12, (131072 & i) != 0 ? C13BV.INSTANCE : list2, str13, str14, str15, (i & 2097152) != 0 ? null : list3);
    }
}
