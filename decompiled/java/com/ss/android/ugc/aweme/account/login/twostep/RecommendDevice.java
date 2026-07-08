package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RecommendDevice implements Serializable {
    public static final int $stable = 0;

    @C09CT("AppId")
    public final Integer appId;

    @C09CT("AppName")
    public final String appName;

    @C09CT("CreateTime")
    public final String createTime;

    @C09CT("DeviceName")
    public final String deviceName;

    @C09CT("DeviceType")
    public final Integer deviceType;

    /* JADX INFO: renamed from: did, reason: collision with root package name */
    @C09CT("Did")
    public final Long f334did;

    @C09CT("HasRisk")
    public final Boolean hasRisk;

    @C09CT("Ip")
    public final String ip;

    @C09CT("IsLocalDevice")
    public final Boolean isLocalDevice;

    @C09CT("LastUseTime")
    public final String lastUseTime;

    @C09CT("LastUseTimestamp")
    public final Long lastUseTimestamp;

    @C09CT("Location")
    public final String location;

    @C09CT("LoginStatus")
    public final Boolean loginStatus;

    @C09CT("LoginType")
    public final String loginType;

    @C09CT("Os")
    public final String os;

    @C09CT("RiskLevel")
    public final Integer riskLevel;

    @C09CT("StrDid")
    public final String strDid;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendDevice)) {
            return false;
        }
        RecommendDevice recommendDevice = (RecommendDevice) obj;
        return Intrinsics.LJFF(this.f334did, recommendDevice.f334did) && Intrinsics.LJFF(this.strDid, recommendDevice.strDid) && Intrinsics.LJFF(this.createTime, recommendDevice.createTime) && Intrinsics.LJFF(this.lastUseTime, recommendDevice.lastUseTime) && Intrinsics.LJFF(this.deviceName, recommendDevice.deviceName) && Intrinsics.LJFF(this.loginStatus, recommendDevice.loginStatus) && Intrinsics.LJFF(this.os, recommendDevice.os) && Intrinsics.LJFF(this.loginType, recommendDevice.loginType) && Intrinsics.LJFF(this.lastUseTimestamp, recommendDevice.lastUseTimestamp) && Intrinsics.LJFF(this.appId, recommendDevice.appId) && Intrinsics.LJFF(this.appName, recommendDevice.appName) && Intrinsics.LJFF(this.deviceType, recommendDevice.deviceType) && Intrinsics.LJFF(this.hasRisk, recommendDevice.hasRisk) && Intrinsics.LJFF(this.riskLevel, recommendDevice.riskLevel) && Intrinsics.LJFF(this.location, recommendDevice.location) && Intrinsics.LJFF(this.isLocalDevice, recommendDevice.isLocalDevice) && Intrinsics.LJFF(this.ip, recommendDevice.ip);
    }

    public int hashCode() {
        Long l = this.f334did;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.strDid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.createTime;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastUseTime;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.loginStatus;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.os;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.loginType;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l2 = this.lastUseTimestamp;
        int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.appId;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.appName;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.deviceType;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.hasRisk;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.riskLevel;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str8 = this.location;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool3 = this.isLocalDevice;
        int iHashCode16 = (iHashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str9 = this.ip;
        return iHashCode16 + (str9 != null ? str9.hashCode() : 0);
    }

    public final Boolean isLocalDevice() {
        return this.isLocalDevice;
    }

    public RecommendDevice(Long l, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, Long l2, Integer num, String str7, Integer num2, Boolean bool2, Integer num3, String str8, Boolean bool3, String str9) {
        this.f334did = l;
        this.strDid = str;
        this.createTime = str2;
        this.lastUseTime = str3;
        this.deviceName = str4;
        this.loginStatus = bool;
        this.os = str5;
        this.loginType = str6;
        this.lastUseTimestamp = l2;
        this.appId = num;
        this.appName = str7;
        this.deviceType = num2;
        this.hasRisk = bool2;
        this.riskLevel = num3;
        this.location = str8;
        this.isLocalDevice = bool3;
        this.ip = str9;
    }
}
