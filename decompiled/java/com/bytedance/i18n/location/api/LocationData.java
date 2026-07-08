package com.bytedance.i18n.location.api;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class LocationData {
    public static final LocationData LJFF = new LocationData(0.0d, 0.0d, 0, -1002, "no_cache", 0, false, 0.0d, "", 0, null, null, null, null, null, null, null, null, null, 523879, null);
    public static final C01GW<LocationData> LJI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(69));
    public static final C01GW<LocationData> LJII = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(58));
    public static final C01GW<LocationData> LJIIIIZZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(68));
    public static final C01GW<LocationData> LJIIIZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(56));
    public static final C01GW<LocationData> LJIIJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(60));
    public static final C01GW<LocationData> LJIIJJI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(61));
    public static final C01GW<LocationData> LJIIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(62));
    public static final C01GW<LocationData> LJIILIIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(65));
    public static final C01GW<LocationData> LJIILJJIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(66));
    public static final C01GW<LocationData> LJIILL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(63));
    public static final C01GW<LocationData> LJIILLIIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(64));
    public static final C01GW<LocationData> LJIIZILJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(55));
    public static final C01GW<LocationData> LJIJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(59));
    public static final C01GW<LocationData> LJIJI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(67));
    public static final C01GW<LocationData> LJIJJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(57));
    public ReversedGeo LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;

    @C09CT("accuracy")
    public final double accuracy;

    @C09CT("address")
    public Address address;

    @C09CT("cache_type")
    public int cacheType;

    @C09CT("coordinate_system")
    public final String coordinateSystem;

    @C09CT("encrypted_lat")
    public String encryptedLatitude;

    @C09CT("encrypted_lon")
    public String encryptedLongitude;

    @C09CT("err_code")
    public final int errCode;

    @C09CT("err_msg")
    public String errMsg;

    @C09CT("fuzz_type")
    public int fuzzType;

    @C09CT("is_cache")
    public boolean isCache;

    @C09CT("latitude")
    public double latitude;

    @C09CT("locate_type")
    public final int locateType;

    @C09CT("longitude")
    public double longitude;

    @C09CT("provider")
    public final String provider;

    @C09CT("timestamp")
    public long timestamp;

    public LocationData() {
        this(0.0d, 0.0d, 0L, 0, null, 0, false, 0.0d, null, 0, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public final String toString() {
        return "LocationData(latitude=" + this.latitude + ", longitude=" + this.longitude + ", timestamp=" + this.timestamp + ", errCode=" + this.errCode + ", errMsg=" + this.errMsg + ", fuzzType=" + this.fuzzType + ", isCache=" + this.isCache + ", accuracy=" + this.accuracy + ", provider=" + this.provider + ", locateType=" + this.locateType + ", encryptedLatitude=" + this.encryptedLatitude + ", encryptedLongitude=" + this.encryptedLongitude + ", reversedGeo=" + this.LIZ + ", district=" + this.LIZIZ + ", coordinateSystem=" + this.coordinateSystem + ", address=" + this.address + ", encryptedGeoHash=" + this.LIZJ + ", encryptedH3=" + this.LIZLLL + ", encryptedS2=" + this.LJ + ')';
    }

    public final boolean LIZIZ() {
        return this.errCode == 0;
    }

    public static LocationData LIZ(LocationData locationData) {
        double d = locationData.latitude;
        double d2 = locationData.longitude;
        long j = locationData.timestamp;
        int i = locationData.errCode;
        String str = locationData.errMsg;
        int i2 = locationData.fuzzType;
        boolean z = locationData.isCache;
        double d3 = locationData.accuracy;
        String str2 = locationData.provider;
        int i3 = locationData.locateType;
        String str3 = locationData.encryptedLatitude;
        String str4 = locationData.encryptedLongitude;
        ReversedGeo reversedGeo = locationData.LIZ;
        String str5 = locationData.LIZIZ;
        String str6 = locationData.coordinateSystem;
        Address address = locationData.address;
        String str7 = locationData.LIZJ;
        String str8 = locationData.LIZLLL;
        String str9 = locationData.LJ;
        locationData.getClass();
        return new LocationData(d, d2, j, i, str, i2, z, d3, str2, i3, str3, str4, reversedGeo, str5, str6, address, str7, str8, str9);
    }

    public LocationData(double d, double d2, long j, int i, String str, int i2, boolean z, double d3, String str2, int i3, String str3, String str4, ReversedGeo reversedGeo, String str5, String str6, Address address, String str7, String str8, String str9) {
        this.latitude = d;
        this.longitude = d2;
        this.timestamp = j;
        this.errCode = i;
        this.errMsg = str;
        this.fuzzType = i2;
        this.isCache = z;
        this.accuracy = d3;
        this.provider = str2;
        this.locateType = i3;
        this.encryptedLatitude = str3;
        this.encryptedLongitude = str4;
        this.LIZ = reversedGeo;
        this.LIZIZ = str5;
        this.coordinateSystem = str6;
        this.address = address;
        this.LIZJ = str7;
        this.LIZLLL = str8;
        this.LJ = str9;
        this.cacheType = z ? 1 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LocationData(double r27, double r29, long r31, int r33, java.lang.String r34, int r35, boolean r36, double r37, java.lang.String r39, int r40, java.lang.String r41, java.lang.String r42, com.bytedance.i18n.location.api.ReversedGeo r43, java.lang.String r44, java.lang.String r45, com.bytedance.i18n.location.api.Address r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, int r50, kotlin.jvm.internal.DefaultConstructorMarker r51) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.i18n.location.api.LocationData.<init>(double, double, long, int, java.lang.String, int, boolean, double, java.lang.String, int, java.lang.String, java.lang.String, com.bytedance.i18n.location.api.ReversedGeo, java.lang.String, java.lang.String, com.bytedance.i18n.location.api.Address, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
