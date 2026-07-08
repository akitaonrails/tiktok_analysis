package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.MinisRegisteredRewardTask;
import com.ss.android.ugc.aweme.minis.model.ServerExtra;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisMetaResp implements Parcelable {

    @C09CT("allowed_domains")
    public final List<String> allowedDomains;

    @C09CT("app_version")
    public final String appVersion;

    @C09CT("client_key")
    public String clientKey;

    @C09CT("client_key_type")
    public final Integer clientKeyType;

    @C09CT("config")
    public String config;

    @C09CT("description")
    public final String description;

    @C09CT("entity")
    public final String entity;

    @C09CT("extra")
    public final ServerExtra extra;

    @C09CT("icon_big_url")
    public final String iconBigUrl;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("minis_category")
    public final String minisCategory;

    @C09CT("minis_status")
    public Integer minisStatus;

    @C09CT("minis_tech_type")
    public final Integer minisTechType;

    @C09CT("minis_type")
    public final Integer minisType;

    @C09CT("minis_url")
    public String minisUrl;

    @C09CT("name")
    public final String name;

    @C09CT("package_config")
    public String packageConfig;

    @C09CT("tos_url")
    public final String privacyTosUrl;

    @C09CT("privacy_url")
    public final String privacyUrl;

    @C09CT("registered_reward_tasks")
    public final List<MinisRegisteredRewardTask> registeredRewardTasks;

    @C09CT("scopes")
    public final List<String> scopes;

    @C09CT("stage")
    public final Integer stage;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("update_time")
    public final String updateTime;
    public static final Parcelable.Creator<MinisMetaResp> CREATOR = new Parcelable.Creator<MinisMetaResp>() { // from class: X.0wSG
        @Override // android.os.Parcelable.Creator
        public final MinisMetaResp createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            Integer numValueOf5;
            Integer numValueOf6;
            ServerExtra serverExtraCreateFromParcel;
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
            if (parcel.readInt() == 0) {
                numValueOf5 = null;
            } else {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            String string14 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf6 = null;
            } else {
                numValueOf6 = Integer.valueOf(parcel.readInt());
            }
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            if (parcel.readInt() == 0) {
                serverExtraCreateFromParcel = null;
            } else {
                serverExtraCreateFromParcel = ServerExtra.CREATOR.createFromParcel(parcel);
            }
            ServerExtra serverExtra = serverExtraCreateFromParcel;
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
            return new MinisMetaResp(string, numValueOf, numValueOf2, numValueOf3, numValueOf4, string2, string3, string4, string5, string6, string7, string8, arrayListCreateStringArrayList, string9, string10, string11, string12, arrayListCreateStringArrayList2, string13, numValueOf5, string14, numValueOf6, string15, string16, serverExtra, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MinisMetaResp[] newArray(int i) {
            return new MinisMetaResp[i];
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
        if (!(obj instanceof MinisMetaResp)) {
            return false;
        }
        MinisMetaResp minisMetaResp = (MinisMetaResp) obj;
        return Intrinsics.LJFF(this.clientKey, minisMetaResp.clientKey) && Intrinsics.LJFF(this.clientKeyType, minisMetaResp.clientKeyType) && Intrinsics.LJFF(this.minisType, minisMetaResp.minisType) && Intrinsics.LJFF(this.minisTechType, minisMetaResp.minisTechType) && Intrinsics.LJFF(this.minisStatus, minisMetaResp.minisStatus) && Intrinsics.LJFF(this.name, minisMetaResp.name) && Intrinsics.LJFF(this.description, minisMetaResp.description) && Intrinsics.LJFF(this.iconUrl, minisMetaResp.iconUrl) && Intrinsics.LJFF(this.iconBigUrl, minisMetaResp.iconBigUrl) && Intrinsics.LJFF(this.appVersion, minisMetaResp.appVersion) && Intrinsics.LJFF(this.minisUrl, minisMetaResp.minisUrl) && Intrinsics.LJFF(this.privacyUrl, minisMetaResp.privacyUrl) && Intrinsics.LJFF(this.allowedDomains, minisMetaResp.allowedDomains) && Intrinsics.LJFF(this.config, minisMetaResp.config) && Intrinsics.LJFF(this.packageConfig, minisMetaResp.packageConfig) && Intrinsics.LJFF(this.updateTime, minisMetaResp.updateTime) && Intrinsics.LJFF(this.privacyTosUrl, minisMetaResp.privacyTosUrl) && Intrinsics.LJFF(this.scopes, minisMetaResp.scopes) && Intrinsics.LJFF(this.entity, minisMetaResp.entity) && Intrinsics.LJFF(this.stage, minisMetaResp.stage) && Intrinsics.LJFF(this.minisCategory, minisMetaResp.minisCategory) && Intrinsics.LJFF(this.statusCode, minisMetaResp.statusCode) && Intrinsics.LJFF(this.statusMsg, minisMetaResp.statusMsg) && Intrinsics.LJFF(this.merchantId, minisMetaResp.merchantId) && Intrinsics.LJFF(this.extra, minisMetaResp.extra) && Intrinsics.LJFF(this.registeredRewardTasks, minisMetaResp.registeredRewardTasks);
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
        String str12 = this.privacyTosUrl;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<String> list2 = this.scopes;
        int iHashCode18 = (iHashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str13 = this.entity;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num5 = this.stage;
        int iHashCode20 = (iHashCode19 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str14 = this.minisCategory;
        int iHashCode21 = (iHashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num6 = this.statusCode;
        int iHashCode22 = (iHashCode21 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str15 = this.statusMsg;
        int iHashCode23 = (iHashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.merchantId;
        int iHashCode24 = (iHashCode23 + (str16 == null ? 0 : str16.hashCode())) * 31;
        ServerExtra serverExtra = this.extra;
        int iHashCode25 = (iHashCode24 + (serverExtra == null ? 0 : serverExtra.hashCode())) * 31;
        List<MinisRegisteredRewardTask> list3 = this.registeredRewardTasks;
        return iHashCode25 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "MinisMetaResp(clientKey=" + this.clientKey + ", clientKeyType=" + this.clientKeyType + ", minisType=" + this.minisType + ", minisTechType=" + this.minisTechType + ", minisStatus=" + this.minisStatus + ", name=" + this.name + ", description=" + this.description + ", iconUrl=" + this.iconUrl + ", iconBigUrl=" + this.iconBigUrl + ", appVersion=" + this.appVersion + ", minisUrl=" + this.minisUrl + ", privacyUrl=" + this.privacyUrl + ", allowedDomains=" + this.allowedDomains + ", config=" + this.config + ", packageConfig=" + this.packageConfig + ", updateTime=" + this.updateTime + ", privacyTosUrl=" + this.privacyTosUrl + ", scopes=" + this.scopes + ", entity=" + this.entity + ", stage=" + this.stage + ", minisCategory=" + this.minisCategory + ", statusCode=" + this.statusCode + ", statusMsg=" + this.statusMsg + ", merchantId=" + this.merchantId + ", extra=" + this.extra + ", registeredRewardTasks=" + this.registeredRewardTasks + ')';
    }

    public final String LIZ() {
        ServerExtra serverExtra = this.extra;
        if (serverExtra != null) {
            return serverExtra.logId;
        }
        return null;
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
        parcel.writeString(this.privacyTosUrl);
        parcel.writeStringList(this.scopes);
        parcel.writeString(this.entity);
        Integer num5 = this.stage;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        parcel.writeString(this.minisCategory);
        Integer num6 = this.statusCode;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeString(this.statusMsg);
        parcel.writeString(this.merchantId);
        ServerExtra serverExtra = this.extra;
        if (serverExtra == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serverExtra.logId);
        }
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

    public MinisMetaResp(String str, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list, String str9, String str10, String str11, String str12, List<String> list2, String str13, Integer num5, String str14, Integer num6, String str15, String str16, ServerExtra serverExtra, List<MinisRegisteredRewardTask> list3) {
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
        this.privacyTosUrl = str12;
        this.scopes = list2;
        this.entity = str13;
        this.stage = num5;
        this.minisCategory = str14;
        this.statusCode = num6;
        this.statusMsg = str15;
        this.merchantId = str16;
        this.extra = serverExtra;
        this.registeredRewardTasks = list3;
    }

    public MinisMetaResp(String str, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, String str12, List list2, String str13, Integer num5, String str14, Integer num6, String str15, String str16, ServerExtra serverExtra, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, num2, num3, num4, str2, str3, str4, str5, str6, str7, str8, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list, str9, str10, str11, str12, (131072 & i) != 0 ? C13BV.INSTANCE : list2, str13, (524288 & i) != 0 ? null : num5, str14, (2097152 & i) != 0 ? null : num6, (4194304 & i) != 0 ? null : str15, str16, (16777216 & i) != 0 ? null : serverExtra, (i & 33554432) == 0 ? list3 : null);
    }
}
