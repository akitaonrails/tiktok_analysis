package com.ss.android.ugc.aweme.minis.common;

import X.C08S3;
import X.C1048270dNx;
import X.C1227904rF;
import X.C123100dR;
import X.C13LP;
import X.C1697810uHb;
import X.C1943007jI;
import X.C1954807lC;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2192721Arm;
import X.C2195161Avi;
import X.C2195171Avj;
import X.C2195221Avo;
import X.C2196291AxX;
import X.C2196331Axb;
import X.C2196701AyC;
import X.C2197221Az2;
import X.C786410Ut5;
import X.EnumC2192711Arl;
import X.EnumC2196301AxY;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisDebug;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes35.dex */
public final class SchemaParserData implements Parcelable {
    public String clientKey;
    public TiktokMinisDebug debugInfo;
    public Map<String, ? extends Object> engineMeta;
    public String enterMethod;
    public Map<String, String> extraParams;
    public Boolean hasNativeCache;
    public Boolean hasNativeResource;
    public String hashFragment;
    public String host;
    public boolean isBackgroundLoad;
    public boolean isFromTokenAppLink;
    public Boolean isNativeGame;
    public boolean isSandBox;
    public String minisSource;
    public EnumC2192711Arl minisStage;
    public String minisToken;
    public Map<String, String> paramsMap;
    public Map<String, String> paramsMapInner;
    public String pathWithOutParams;
    public String pathWithParams;
    public Uri schemaUri;
    public String schemaUrl;
    public TiktokMinisQueryParams tiktokMinisParams;
    public String videoResourcePreloadUrl;
    public static final C2196291AxX Companion = new C2196291AxX();
    public static final Parcelable.Creator<SchemaParserData> CREATOR = new Parcelable.Creator<SchemaParserData>() { // from class: X.0mQU
        @Override // android.os.Parcelable.Creator
        public final SchemaParserData createFromParcel(Parcel parcel) {
            boolean z;
            TiktokMinisDebug tiktokMinisDebugCreateFromParcel;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            TiktokMinisQueryParams tiktokMinisQueryParamsCreateFromParcel;
            boolean z2;
            boolean z3;
            Boolean boolValueOf;
            boolean z4;
            Boolean boolValueOf2;
            boolean z5;
            Boolean boolValueOf3;
            LinkedHashMap linkedHashMap3;
            boolean z6;
            Uri uri = (Uri) parcel.readParcelable(SchemaParserData.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                tiktokMinisDebugCreateFromParcel = null;
            } else {
                tiktokMinisDebugCreateFromParcel = TiktokMinisDebug.CREATOR.createFromParcel(parcel);
            }
            TiktokMinisDebug tiktokMinisDebug = tiktokMinisDebugCreateFromParcel;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i3 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                tiktokMinisQueryParamsCreateFromParcel = null;
            } else {
                tiktokMinisQueryParamsCreateFromParcel = TiktokMinisQueryParams.CREATOR.createFromParcel(parcel);
            }
            TiktokMinisQueryParams tiktokMinisQueryParams = tiktokMinisQueryParamsCreateFromParcel;
            EnumC2192711Arl enumC2192711ArlValueOf = EnumC2192711Arl.valueOf(parcel.readString());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            int i5 = parcel.readInt();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                linkedHashMap4.put(parcel.readString(), parcel.readString());
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolValueOf = Boolean.valueOf(z3);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf2 = Boolean.valueOf(z4);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolValueOf3 = Boolean.valueOf(z5);
            }
            if (parcel.readInt() == 0) {
                linkedHashMap3 = null;
            } else {
                int i7 = parcel.readInt();
                linkedHashMap3 = new LinkedHashMap(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    linkedHashMap3.put(parcel.readString(), parcel.readValue(SchemaParserData.class.getClassLoader()));
                }
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            return new SchemaParserData(uri, string, z, tiktokMinisDebug, string2, string3, string4, linkedHashMap, linkedHashMap2, tiktokMinisQueryParams, enumC2192711ArlValueOf, string5, string6, string7, z2, string8, string9, string10, linkedHashMap4, boolValueOf, boolValueOf2, boolValueOf3, linkedHashMap3, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final SchemaParserData[] newArray(int i) {
            return new SchemaParserData[i];
        }
    };
    public static final int $stable = 8;
    public static final List<String> SCHEMA_PARAMS_TO_INNER_KEEP = C1697810uHb.LJIIJJI("_tiktok_minis_params", "ugdp_id", "convert_url");

    public SchemaParserData() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemaParserData)) {
            return false;
        }
        SchemaParserData schemaParserData = (SchemaParserData) obj;
        return Intrinsics.LJFF(this.schemaUri, schemaParserData.schemaUri) && Intrinsics.LJFF(this.clientKey, schemaParserData.clientKey) && this.isSandBox == schemaParserData.isSandBox && Intrinsics.LJFF(this.debugInfo, schemaParserData.debugInfo) && Intrinsics.LJFF(this.schemaUrl, schemaParserData.schemaUrl) && Intrinsics.LJFF(this.pathWithParams, schemaParserData.pathWithParams) && Intrinsics.LJFF(this.pathWithOutParams, schemaParserData.pathWithOutParams) && Intrinsics.LJFF(this.paramsMap, schemaParserData.paramsMap) && Intrinsics.LJFF(this.paramsMapInner, schemaParserData.paramsMapInner) && Intrinsics.LJFF(this.tiktokMinisParams, schemaParserData.tiktokMinisParams) && this.minisStage == schemaParserData.minisStage && Intrinsics.LJFF(this.enterMethod, schemaParserData.enterMethod) && Intrinsics.LJFF(this.minisSource, schemaParserData.minisSource) && Intrinsics.LJFF(this.host, schemaParserData.host) && this.isFromTokenAppLink == schemaParserData.isFromTokenAppLink && Intrinsics.LJFF(this.minisToken, schemaParserData.minisToken) && Intrinsics.LJFF(this.videoResourcePreloadUrl, schemaParserData.videoResourcePreloadUrl) && Intrinsics.LJFF(this.hashFragment, schemaParserData.hashFragment) && Intrinsics.LJFF(this.extraParams, schemaParserData.extraParams) && Intrinsics.LJFF(this.hasNativeCache, schemaParserData.hasNativeCache) && Intrinsics.LJFF(this.hasNativeResource, schemaParserData.hasNativeResource) && Intrinsics.LJFF(this.isNativeGame, schemaParserData.isNativeGame) && Intrinsics.LJFF(this.engineMeta, schemaParserData.engineMeta) && this.isBackgroundLoad == schemaParserData.isBackgroundLoad;
    }

    public final int hashCode() {
        Uri uri = this.schemaUri;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.clientKey;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.isSandBox)) * 31;
        TiktokMinisDebug tiktokMinisDebug = this.debugInfo;
        int iHashCode3 = (iHashCode2 + (tiktokMinisDebug == null ? 0 : tiktokMinisDebug.hashCode())) * 31;
        String str2 = this.schemaUrl;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pathWithParams;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pathWithOutParams;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, String> map = this.paramsMap;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.paramsMapInner;
        int iHashCode8 = (iHashCode7 + (map2 == null ? 0 : map2.hashCode())) * 31;
        TiktokMinisQueryParams tiktokMinisQueryParams = this.tiktokMinisParams;
        int iHashCode9 = (((((iHashCode8 + (tiktokMinisQueryParams == null ? 0 : tiktokMinisQueryParams.hashCode())) * 31) + this.minisStage.hashCode()) * 31) + this.enterMethod.hashCode()) * 31;
        String str5 = this.minisSource;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.host;
        int iHashCode11 = (((iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.Z2(this.isFromTokenAppLink)) * 31;
        String str7 = this.minisToken;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.videoResourcePreloadUrl;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.hashFragment;
        int iHashCode14 = (((iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.extraParams.hashCode()) * 31;
        Boolean bool = this.hasNativeCache;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasNativeResource;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isNativeGame;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Map<String, ? extends Object> map3 = this.engineMeta;
        return ((iHashCode17 + (map3 != null ? map3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isBackgroundLoad);
    }

    public final String toString() {
        return "SchemaParserData(schemaUri=" + this.schemaUri + ", clientKey=" + this.clientKey + ", isSandBox=" + this.isSandBox + ", debugInfo=" + this.debugInfo + ", schemaUrl=" + this.schemaUrl + ", pathWithParams=" + this.pathWithParams + ", pathWithOutParams=" + this.pathWithOutParams + ", paramsMap=" + this.paramsMap + ", paramsMapInner=" + this.paramsMapInner + ", tiktokMinisParams=" + this.tiktokMinisParams + ", minisStage=" + this.minisStage + ", enterMethod=" + this.enterMethod + ", minisSource=" + this.minisSource + ", host=" + this.host + ", isFromTokenAppLink=" + this.isFromTokenAppLink + ", minisToken=" + this.minisToken + ", videoResourcePreloadUrl=" + this.videoResourcePreloadUrl + ", hashFragment=" + this.hashFragment + ", extraParams=" + this.extraParams + ", hasNativeCache=" + this.hasNativeCache + ", hasNativeResource=" + this.hasNativeResource + ", isNativeGame=" + this.isNativeGame + ", engineMeta=" + this.engineMeta + ", isBackgroundLoad=" + this.isBackgroundLoad + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.schemaUri, i);
        parcel.writeString(this.clientKey);
        parcel.writeInt(this.isSandBox ? 1 : 0);
        TiktokMinisDebug tiktokMinisDebug = this.debugInfo;
        if (tiktokMinisDebug == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tiktokMinisDebug.writeToParcel(parcel, i);
        }
        parcel.writeString(this.schemaUrl);
        parcel.writeString(this.pathWithParams);
        parcel.writeString(this.pathWithOutParams);
        Map<String, String> map = this.paramsMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        Map<String, String> map2 = this.paramsMapInner;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
        }
        TiktokMinisQueryParams tiktokMinisQueryParams = this.tiktokMinisParams;
        if (tiktokMinisQueryParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tiktokMinisQueryParams.writeToParcel(parcel, i);
        }
        parcel.writeString(this.minisStage.name());
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.minisSource);
        parcel.writeString(this.host);
        parcel.writeInt(this.isFromTokenAppLink ? 1 : 0);
        parcel.writeString(this.minisToken);
        parcel.writeString(this.videoResourcePreloadUrl);
        parcel.writeString(this.hashFragment);
        Map<String, String> map3 = this.extraParams;
        parcel.writeInt(map3.size());
        for (Map.Entry<String, String> entry3 : map3.entrySet()) {
            parcel.writeString(entry3.getKey());
            parcel.writeString(entry3.getValue());
        }
        Boolean bool = this.hasNativeCache;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hasNativeResource;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isNativeGame;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Map<String, ? extends Object> map4 = this.engineMeta;
        if (map4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map4.size());
            for (Map.Entry<String, ? extends Object> entry4 : map4.entrySet()) {
                parcel.writeString(entry4.getKey());
                parcel.writeValue(entry4.getValue());
            }
        }
        parcel.writeInt(this.isBackgroundLoad ? 1 : 0);
    }

    public final String LIZJ() {
        Map<String, ? extends Object> map;
        String str;
        TiktokMinisQueryParams tiktokMinisQueryParams = this.tiktokMinisParams;
        if (tiktokMinisQueryParams != null && (map = tiktokMinisQueryParams.logExtra) != null && map.containsKey("click_id")) {
            Map<String, ? extends Object> map2 = tiktokMinisQueryParams.logExtra;
            Object obj = map2 != null ? map2.get("click_id") : null;
            if ((obj instanceof String) && (str = (String) obj) != null) {
                return str;
            }
        }
        return "";
    }

    public final Map<String, String> LIZLLL() {
        String str;
        String str2;
        String str3;
        C1048270dNx c1048270dNx;
        Map<String, ? extends Object> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, ? extends Object> map2 = this.engineMeta;
        if (map2 != null) {
            for (Map.Entry<String, ? extends Object> entry : map2.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        TiktokMinisQueryParams tiktokMinisQueryParams = this.tiktokMinisParams;
        if (tiktokMinisQueryParams != null && (map = tiktokMinisQueryParams.logExtra) != null) {
            for (Map.Entry<String, ? extends Object> entry2 : map.entrySet()) {
                String key = entry2.getKey();
                Object value = entry2.getValue();
                if (key != null && value != null) {
                    linkedHashMap.put(key, value.toString());
                }
            }
        }
        String str4 = this.clientKey;
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("minis_id", str4);
        TiktokMinisQueryParams tiktokMinisQueryParams2 = this.tiktokMinisParams;
        if (tiktokMinisQueryParams2 == null || (str = tiktokMinisQueryParams2.enterFrom) == null) {
            str = "";
        }
        linkedHashMap.put("enter_from", str);
        String str5 = this.enterMethod;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("enter_method", str5);
        TiktokMinisQueryParams tiktokMinisQueryParams3 = this.tiktokMinisParams;
        if (tiktokMinisQueryParams3 == null || (str2 = tiktokMinisQueryParams3.minisCategory) == null) {
            str2 = "";
        }
        linkedHashMap.put("minis_category", str2);
        if (!linkedHashMap.containsKey("video_id")) {
            linkedHashMap.put("video_id", LJ());
        }
        linkedHashMap.put("click_id", LIZJ());
        linkedHashMap.put("minis_type", LJFF());
        linkedHashMap.put("is_sandbox", this.isSandBox ? "1" : CardStruct.IStatusCode.DEFAULT);
        TiktokMinisQueryParams tiktokMinisQueryParams4 = this.tiktokMinisParams;
        if (tiktokMinisQueryParams4 == null || (str3 = tiktokMinisQueryParams4.ttmgInitModule) == null) {
            str3 = "";
        }
        linkedHashMap.put("ttmg_init_module", str3);
        ConcurrentHashMap<String, C2195171Avj> concurrentHashMap = C2195161Avi.LIZ;
        if (C2195161Avi.LIZLLL(C2195161Avi.LIZ(this))) {
            linkedHashMap.put("load_type", "hot");
        }
        Boolean bool = this.isNativeGame;
        linkedHashMap.put("is_native_game", bool != null ? Intrinsics.LJFF(bool, Boolean.TRUE) ? "1" : CardStruct.IStatusCode.DEFAULT : "");
        linkedHashMap.put("run_type", this.minisStage == EnumC2192711Arl.MINIS_STAGE_NATIVE_DEBUG ? LJIIJJI() ? "remote_preview" : "remote_debug" : "online");
        linkedHashMap.put("minis_version", LJI());
        linkedHashMap.put("is_background_load", this.isBackgroundLoad ? "1" : CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.putAll(this.extraParams);
        TiktokMinisQueryParams tiktokMinisQueryParams5 = this.tiktokMinisParams;
        if (Intrinsics.LJFF(tiktokMinisQueryParams5 != null ? tiktokMinisQueryParams5.minisCategory : null, "short_drama") && (c1048270dNx = C2195221Avo.LJIIL) != null) {
            String str6 = c1048270dNx.LIZ;
            if (str6 != null) {
                linkedHashMap.put("minis_drama_collection_id", str6);
            }
            String str7 = c1048270dNx.LIZIZ;
            if (str7 != null) {
                linkedHashMap.put("minis_short_drama_inner_feed_episode_num_uid", str7);
            }
        }
        return linkedHashMap;
    }

    public final String LJ() {
        Map<String, ? extends Object> map;
        String str;
        TiktokMinisQueryParams tiktokMinisQueryParams = this.tiktokMinisParams;
        if (tiktokMinisQueryParams != null && (map = tiktokMinisQueryParams.logExtra) != null && map.containsKey("item_id")) {
            Map<String, ? extends Object> map2 = tiktokMinisQueryParams.logExtra;
            Object obj = map2 != null ? map2.get("item_id") : null;
            if ((obj instanceof String) && (str = (String) obj) != null) {
                return str;
            }
        }
        return "";
    }

    public final String LJFF() {
        return C2197221Az2.LIZ(this.clientKey) ? EnumC2196301AxY.MINI_GAME.getValue() : EnumC2196301AxY.MINI_APP.getValue();
    }

    public final String LJI() {
        switch (C2192721Arm.LIZ[this.minisStage.ordinal()]) {
            case 1:
                return "prod";
            case 2:
                return "preview";
            case 3:
                return "audit";
            case 4:
                return "debug";
            case 5:
                return "unknown";
            case 6:
                return "native_debug";
            case 7:
                return "minis_debug";
            default:
                throw new C1954807lC();
        }
    }

    public final String LJII() {
        String str;
        TiktokMinisQueryParams tiktokMinisQueryParams = this.tiktokMinisParams;
        if (!C123100dR.LIZ(tiktokMinisQueryParams != null ? tiktokMinisQueryParams.ttmgInitModule : null)) {
            return "__GAME__";
        }
        TiktokMinisQueryParams tiktokMinisQueryParams2 = this.tiktokMinisParams;
        return (tiktokMinisQueryParams2 == null || (str = tiktokMinisQueryParams2.ttmgInitModule) == null) ? "" : str;
    }

    public final String LJIIIZ() {
        String str = this.extraParams.get("ttoclid");
        if (str != null) {
            return str;
        }
        return null;
    }

    public final String LJIIJ() {
        String str;
        Map<String, ? extends Object> map;
        TiktokMinisQueryParams tiktokMinisQueryParams = this.tiktokMinisParams;
        Object obj = null;
        if (tiktokMinisQueryParams != null && (map = tiktokMinisQueryParams.logExtra) != null) {
            obj = map.get("video_id");
        }
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "";
        }
        return str.length() == 0 ? LJ() : str;
    }

    public final boolean LJIIJJI() {
        String str;
        Map<String, String> map = this.paramsMap;
        if (map == null || (str = map.get("debugMode")) == null) {
            str = "";
        }
        return Intrinsics.LJFF(str, "clientPreview");
    }

    public final String getEnterFrom() {
        String str;
        TiktokMinisQueryParams tiktokMinisQueryParams = this.tiktokMinisParams;
        return (tiktokMinisQueryParams == null || (str = tiktokMinisQueryParams.enterFrom) == null) ? "" : str;
    }

    public final String LIZ() {
        Map<String, ? extends Object> map;
        String str;
        String strLJIIIZ = LJIIIZ();
        if (strLJIIIZ != null) {
            return strLJIIIZ;
        }
        TiktokMinisQueryParams tiktokMinisQueryParams = this.tiktokMinisParams;
        if (tiktokMinisQueryParams != null && (map = tiktokMinisQueryParams.logExtra) != null && map.containsKey("tracking_id")) {
            Map<String, ? extends Object> map2 = tiktokMinisQueryParams.logExtra;
            Object obj = map2 != null ? map2.get("tracking_id") : null;
            if ((obj instanceof String) && (str = (String) obj) != null) {
                return str;
            }
        }
        return "";
    }

    public final void LIZIZ() {
        this.extraParams.put("ttoclid", UUID.randomUUID().toString());
        C2196331Axb c2196331Axb = C2196331Axb.LIZ;
        Map<String, String> mapLIZLLL = LIZLLL();
        c2196331Axb.getClass();
        C2196331Axb.LIZIZ(mapLIZLLL);
        C2196701AyC.LIZ.getClass();
        HashMap map = new HashMap();
        Keva keva = C2196331Axb.LIZIZ;
        if (keva != null) {
            keva.storeString("tm_page_timeline", "");
        }
        c2196331Axb.getClass();
        C2196331Axb.LIZJ("tm_ttoclid_generation", map, null, null);
        for (Map.Entry entry : ((LinkedHashMap) LIZLLL()).entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        C08S3.LIZLLL("tm_ttoclid_generation", map, null, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisTTOCLIDGeneration, data:");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ SchemaParserData(int i) {
        this(null, null, false, null, null, null, null, null, null, null, EnumC2192711Arl.MINIS_STAGE_PROD, "schema", null, null, false, null, null, null, new LinkedHashMap(), null, null, null, null, false);
    }

    public final void LJIIL(Uri uri) {
        String string;
        String host;
        String fragment;
        List<String> pathSegments;
        String str;
        String string2;
        Uri uriBuild;
        String scheme;
        String host2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        boolean z;
        boolean z2;
        boolean z3;
        String strLIZIZ;
        this.schemaUri = uri;
        if (uri != null) {
            string = uri.toString();
        } else {
            string = null;
        }
        this.schemaUrl = string;
        if (uri != null) {
            host = uri.getHost();
        } else {
            host = null;
        }
        this.host = host;
        if (uri != null) {
            fragment = uri.getFragment();
        } else {
            fragment = null;
        }
        this.hashFragment = fragment;
        if (uri != null && (pathSegments = uri.getPathSegments()) != null && !pathSegments.isEmpty()) {
            String str2 = (String) C13LP.LJJJLZIJ(0, pathSegments);
            if (str2 != null) {
                this.clientKey = str2;
            }
            ConcurrentHashMap<String, C2195171Avj> concurrentHashMap = C2195161Avi.LIZ;
            if (C2195161Avi.LIZLLL(C2195161Avi.LIZ(this))) {
                this.hasNativeCache = Boolean.TRUE;
            }
            String str3 = (String) C13LP.LJJJLZIJ(1, pathSegments);
            if (str3 != null) {
                if (Intrinsics.LJFF(str3, "preview")) {
                    this.minisStage = EnumC2192711Arl.MINIS_STAGE_PREVIEW;
                    this.pathWithParams = LJIIIIZZ(uri, pathSegments, 2);
                } else if (Intrinsics.LJFF(str3, "audit")) {
                    this.minisStage = EnumC2192711Arl.MINIS_STAGE_AUDIT;
                    this.pathWithParams = LJIIIIZZ(uri, pathSegments, 2);
                } else if (a0.LJJIIZI(str3, "debug;url=", false)) {
                    this.minisStage = EnumC2192711Arl.MINIS_STAGE_DEBUG;
                    String strLJJLIL = a0.LJJLIL(str3, "debug;url=", str3);
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("parseDebugInfo, debugSiteUrl:");
                    sbLIZ.append(strLJJLIL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (strLJJLIL != null && strLJJLIL.length() != 0) {
                        if (!C2197221Az2.LIZ(this.clientKey)) {
                            try {
                                uriBuild = UriProtector.parse(strLJJLIL);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                uriBuild = null;
                            }
                            if (uriBuild == null) {
                                scheme = null;
                                host2 = null;
                            } else {
                                scheme = uriBuild.getScheme();
                                host2 = uriBuild.getHost();
                                uriBuild.getPort();
                            }
                            if (uriBuild != null) {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "d_port");
                            } else {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                            }
                            if (uriBuild != null) {
                                try {
                                    Uri.Builder builderBuildUpon = uriBuild.buildUpon();
                                    builderBuildUpon.clearQuery();
                                    Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uriBuild);
                                    if (queryParameterNames != null) {
                                        for (String str4 : queryParameterNames) {
                                            if (!Intrinsics.LJFF(str4, "d_port") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, str4)) != null) {
                                                builderBuildUpon.appendQueryParameter(str4, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                                            }
                                        }
                                    }
                                    uriBuild = builderBuildUpon.build();
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                                if (uriBuild != null) {
                                    uriBuild.toString();
                                }
                            }
                            if (scheme != null && scheme.length() != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            boolean z4 = !z;
                            if (host2 != null && host2.length() != 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            boolean z5 = z4 & (!z2);
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (z5 & (!z3)) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(scheme);
                                sbLIZ2.append("://");
                                sbLIZ2.append(host2);
                                sbLIZ2.append(':');
                                sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            } else {
                                strLIZIZ = null;
                            }
                        } else {
                            strLIZIZ = null;
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                        }
                        this.debugInfo = new TiktokMinisDebug(null, strLJJLIL, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strLIZIZ);
                    }
                    this.pathWithParams = LJIIIIZZ(uri, pathSegments, 2);
                } else if (a0.LJJIIZI(str3, "native_debug_flag;url=", false)) {
                    this.minisStage = EnumC2192711Arl.MINIS_STAGE_NATIVE_DEBUG;
                    this.pathWithParams = LJIIIIZZ(uri, pathSegments, 2);
                } else if (a0.LJJIIZI(str3, "minis_debug_flag;url=", false)) {
                    this.minisStage = EnumC2192711Arl.MINIS_STAGE_MINIS_DEBUG;
                    this.pathWithParams = LJIIIIZZ(uri, pathSegments, 2);
                } else {
                    this.minisStage = EnumC2192711Arl.MINIS_STAGE_PROD;
                    if (str3.equals("prod")) {
                        this.pathWithParams = LJIIIIZZ(uri, pathSegments, 2);
                    } else {
                        this.pathWithParams = LJIIIIZZ(uri, pathSegments, 1);
                    }
                }
            } else {
                this.minisStage = EnumC2192711Arl.MINIS_STAGE_PROD;
                this.pathWithParams = LJIIIIZZ(uri, pathSegments, 1);
            }
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_tiktok_minis_params");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                    try {
                        string2 = URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, "UTF-8");
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        string2 = new n().toString();
                    }
                    try {
                        C1227904rF.LIZ.getClass();
                        TiktokMinisQueryParams tiktokMinisQueryParams = (TiktokMinisQueryParams) C1227904rF.LIZIZ(string2, TiktokMinisQueryParams.class);
                        this.tiktokMinisParams = tiktokMinisQueryParams;
                        int i2 = C2187451AjH.LIZ;
                        Objects.toString(tiktokMinisQueryParams);
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        int i3 = C2187451AjH.LIZ;
                        e4.toString();
                    }
                }
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            TiktokMinisQueryParams tiktokMinisQueryParams2 = this.tiktokMinisParams;
            if (tiktokMinisQueryParams2 == null || (str = tiktokMinisQueryParams2.enterFrom) == null) {
                str = "";
            }
            this.minisSource = str;
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("clientKey:");
            sbLIZ3.append(this.clientKey);
            sbLIZ3.append(", minisVersionStage:");
            sbLIZ3.append(this.minisStage);
            sbLIZ3.append(", debugInfo:");
            sbLIZ3.append(this.debugInfo);
            sbLIZ3.append(", schemaUrl:");
            sbLIZ3.append(this.schemaUrl);
            sbLIZ3.append(", pathWithParams:");
            sbLIZ3.append(this.pathWithParams);
            sbLIZ3.append(", pathWithOutParams:");
            sbLIZ3.append(this.pathWithOutParams);
            sbLIZ3.append(",  tiktokMinisParams:");
            sbLIZ3.append(this.tiktokMinisParams);
            sbLIZ3.append(", minisSource:");
            sbLIZ3.append(this.minisSource);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
    }

    public final String LJIILJJIL(String str) {
        boolean z;
        TiktokMinisQueryParams tiktokMinisQueryParams;
        LinkedHashMap linkedHashMap;
        Uri uriLJI;
        if ("anchor_click_id".length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || str.length() == 0 || (tiktokMinisQueryParams = this.tiktokMinisParams) == null) {
            return null;
        }
        Map<String, ? extends Object> map = tiktokMinisQueryParams.logExtra;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put("anchor_click_id", str);
        tiktokMinisQueryParams.logExtra = linkedHashMap;
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(tiktokMinisQueryParams);
        if (strLJI == null || (uriLJI = C1943007jI.LJI(this.schemaUri, strLJI)) == null) {
            return null;
        }
        return uriLJI.toString();
    }

    public final void LJIILIIL(String str, String str2) {
        String str3;
        if (str != null && str.length() != 0 && str.equals(this.clientKey) && str2 != null) {
            TiktokMinisQueryParams tiktokMinisQueryParams = this.tiktokMinisParams;
            if (tiktokMinisQueryParams == null || (str3 = tiktokMinisQueryParams.minisCategory) == null || str3.length() == 0) {
                if (this.tiktokMinisParams == null) {
                    this.tiktokMinisParams = new TiktokMinisQueryParams(null, null, null, null, null, null, null);
                }
                TiktokMinisQueryParams tiktokMinisQueryParams2 = this.tiktokMinisParams;
                if (tiktokMinisQueryParams2 != null) {
                    tiktokMinisQueryParams2.minisCategory = str2;
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateMinisCategoryIfNecessary, minisCategory:");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    public final String LJIIIIZZ(Uri uri, List<String> list, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (uri != null) {
            boolean z4 = false;
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                int i2 = 0;
                for (String str : list) {
                    int i3 = i2 + 1;
                    if (i2 >= i) {
                        if (sb.toString().length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            sb.append(String.valueOf(str));
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append('/');
                            sbLIZ.append(str);
                            sb.append(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    i2 = i3;
                }
                this.pathWithOutParams = sb.toString();
                if (C123100dR.LIZ(this.hashFragment)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.pathWithOutParams);
                    sbLIZ2.append('#');
                    sbLIZ2.append(this.hashFragment);
                    this.pathWithOutParams = C2188811AlT.LIZIZ(sbLIZ2);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                    if (queryParameterNames != null) {
                        for (String str2 : queryParameterNames) {
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                                linkedHashMap.put(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                            }
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this.paramsMapInner = linkedHashMap;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                Iterator<String> it2 = SCHEMA_PARAMS_TO_INNER_KEEP.iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.remove(it2.next());
                }
                this.paramsMap = linkedHashMap2;
                StringBuilder sb2 = new StringBuilder();
                Set<String> queryParameterNames2 = UriProtector.getQueryParameterNames(uri);
                if (queryParameterNames2 != null) {
                    for (String str3 : queryParameterNames2) {
                        if (!SCHEMA_PARAMS_TO_INNER_KEEP.contains(str3)) {
                            if (sb2.toString().length() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append('?');
                                sbLIZ3.append(str3);
                                sbLIZ3.append('=');
                                sbLIZ3.append(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3));
                                sb2.append(C2188811AlT.LIZIZ(sbLIZ3));
                            } else {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append('&');
                                sbLIZ4.append(str3);
                                sbLIZ4.append('=');
                                sbLIZ4.append(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3));
                                sb2.append(C2188811AlT.LIZIZ(sbLIZ4));
                            }
                        }
                    }
                }
                String string = sb2.toString();
                if (string.length() > 0) {
                    z4 = true;
                }
                if (z4) {
                    sb.append(string);
                }
                if (C123100dR.LIZ(this.hashFragment)) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append('#');
                    sbLIZ5.append(this.hashFragment);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ5));
                }
                return sb.toString();
            }
            return "";
        }
        return "";
    }

    public SchemaParserData(Uri uri, String str, boolean z, TiktokMinisDebug tiktokMinisDebug, String str2, String str3, String str4, Map<String, String> map, Map<String, String> map2, TiktokMinisQueryParams tiktokMinisQueryParams, EnumC2192711Arl enumC2192711Arl, String str5, String str6, String str7, boolean z2, String str8, String str9, String str10, Map<String, String> map3, Boolean bool, Boolean bool2, Boolean bool3, Map<String, ? extends Object> map4, boolean z3) {
        this.schemaUri = uri;
        this.clientKey = str;
        this.isSandBox = z;
        this.debugInfo = tiktokMinisDebug;
        this.schemaUrl = str2;
        this.pathWithParams = str3;
        this.pathWithOutParams = str4;
        this.paramsMap = map;
        this.paramsMapInner = map2;
        this.tiktokMinisParams = tiktokMinisQueryParams;
        this.minisStage = enumC2192711Arl;
        this.enterMethod = str5;
        this.minisSource = str6;
        this.host = str7;
        this.isFromTokenAppLink = z2;
        this.minisToken = str8;
        this.videoResourcePreloadUrl = str9;
        this.hashFragment = str10;
        this.extraParams = map3;
        this.hasNativeCache = bool;
        this.hasNativeResource = bool2;
        this.isNativeGame = bool3;
        this.engineMeta = map4;
        this.isBackgroundLoad = z3;
    }
}
