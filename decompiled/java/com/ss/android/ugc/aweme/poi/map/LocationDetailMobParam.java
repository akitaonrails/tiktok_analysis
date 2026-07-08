package com.ss.android.ugc.aweme.poi.map;

import X.C1188440h22;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationDetailMobParam implements Serializable {
    public final String anchorInteractMethod;
    public final String authorId;
    public final C1188440h22 data;
    public final String enterMethod;
    public final String entranceEnterMethod;
    public final String entranceEnterPage;
    public final String groupId;
    public final String initialPoiEnterFrom;
    public final Boolean isPoiInSheetMode;
    public final String logPb;
    public final String previousPage;
    public final Map<String, String> searchParams;

    public LocationDetailMobParam() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationDetailMobParam)) {
            return false;
        }
        LocationDetailMobParam locationDetailMobParam = (LocationDetailMobParam) obj;
        return Intrinsics.LJFF(this.data, locationDetailMobParam.data) && Intrinsics.LJFF(this.enterMethod, locationDetailMobParam.enterMethod) && Intrinsics.LJFF(this.entranceEnterMethod, locationDetailMobParam.entranceEnterMethod) && Intrinsics.LJFF(this.entranceEnterPage, locationDetailMobParam.entranceEnterPage) && Intrinsics.LJFF(this.groupId, locationDetailMobParam.groupId) && Intrinsics.LJFF(this.authorId, locationDetailMobParam.authorId) && Intrinsics.LJFF(this.logPb, locationDetailMobParam.logPb) && Intrinsics.LJFF(this.previousPage, locationDetailMobParam.previousPage) && Intrinsics.LJFF(this.searchParams, locationDetailMobParam.searchParams) && Intrinsics.LJFF(this.isPoiInSheetMode, locationDetailMobParam.isPoiInSheetMode) && Intrinsics.LJFF(this.anchorInteractMethod, locationDetailMobParam.anchorInteractMethod) && Intrinsics.LJFF(this.initialPoiEnterFrom, locationDetailMobParam.initialPoiEnterFrom);
    }

    public final Boolean isPoiInSheetMode() {
        return this.isPoiInSheetMode;
    }

    public LocationDetailMobParam(C1188440h22 c1188440h22, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map, Boolean bool, String str8, String str9) {
        this.data = c1188440h22;
        this.enterMethod = str;
        this.entranceEnterMethod = str2;
        this.entranceEnterPage = str3;
        this.groupId = str4;
        this.authorId = str5;
        this.logPb = str6;
        this.previousPage = str7;
        this.searchParams = map;
        this.isPoiInSheetMode = bool;
        this.anchorInteractMethod = str8;
        this.initialPoiEnterFrom = str9;
    }
}
