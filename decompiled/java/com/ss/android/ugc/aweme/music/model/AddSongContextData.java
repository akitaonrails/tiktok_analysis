package com.ss.android.ugc.aweme.music.model;

import X.C13BV;
import X.C786410Ut5;
import X.EnumC631120OpC;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.legacy.LegacyGsonService;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class AddSongContextData implements Serializable {
    public final boolean activityStartResult;
    public final String awemeId;
    public final int awemeType;
    public final MusicETBusinessModule businessModule;
    public final String buttonType;
    public final String chartId;
    public final String displayButtonName;
    public final EnumC631120OpC dspEntrance;
    public final String enterFrom;
    public final String enterMethod;
    public final String firstEnterFrom;
    public final String fromAlbumScene;
    public final boolean isAddMultiSongs;
    public final boolean isFromHybrid;
    public final boolean isSimilarMusic;
    public final DspLinkState linkState;
    public final HashMap<String, String> logExtra;
    public final String metaSongId;
    public final Music music;
    public final String musicType;
    public final String musicVolume;
    public final boolean needShowGuide;
    public final Integer order;
    public final String page;
    public final String playlistId;
    public final String promoId;
    public final String requestId;
    public final SearchInflowParam searchInflowParam;
    public final List<Long> selectedMusicIds;
    public final DspPlatform shareFromDsp;
    public final Long similarMusicCollectionId;

    public final AddSongContextData copy(String str, String str2, MusicETBusinessModule musicETBusinessModule, String str3, String str4, String str5, Music music, int i, String str6, String str7, String str8, EnumC631120OpC enumC631120OpC, DspLinkState dspLinkState, String str9, SearchInflowParam searchInflowParam, String str10, String str11, Integer num, String str12, String str13, DspPlatform dspPlatform, boolean z, boolean z2, HashMap<String, String> map, List<Long> list, String str14, boolean z3, Long l, boolean z4, String str15, boolean z5) {
        return new AddSongContextData(str, str2, musicETBusinessModule, str3, str4, str5, music, i, str6, str7, str8, enumC631120OpC, dspLinkState, str9, searchInflowParam, str10, str11, num, str12, str13, dspPlatform, z, z2, map, list, str14, z3, l, z4, str15, z5);
    }

    public int hashCode() {
        int iHashCode = ((this.enterFrom.hashCode() * 31) + this.firstEnterFrom.hashCode()) * 31;
        MusicETBusinessModule musicETBusinessModule = this.businessModule;
        int iHashCode2 = (iHashCode + (musicETBusinessModule == null ? 0 : musicETBusinessModule.hashCode())) * 31;
        String str = this.displayButtonName;
        int iHashCode3 = (((((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.awemeId.hashCode()) * 31) + this.buttonType.hashCode()) * 31) + this.music.hashCode()) * 31) + this.awemeType) * 31;
        String str2 = this.metaSongId;
        int iHashCode4 = (((((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.musicVolume.hashCode()) * 31) + this.musicType.hashCode()) * 31) + this.dspEntrance.hashCode()) * 31) + this.linkState.hashCode()) * 31;
        String str3 = this.requestId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SearchInflowParam searchInflowParam = this.searchInflowParam;
        int iHashCode6 = (iHashCode5 + (searchInflowParam == null ? 0 : searchInflowParam.hashCode())) * 31;
        String str4 = this.playlistId;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.chartId;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.order;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.enterMethod;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.page;
        int iHashCode11 = (((((((((((iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.shareFromDsp.hashCode()) * 31) + C786410Ut5.Z2(this.activityStartResult)) * 31) + C786410Ut5.Z2(this.isAddMultiSongs)) * 31) + this.logExtra.hashCode()) * 31) + this.selectedMusicIds.hashCode()) * 31;
        String str8 = this.promoId;
        int iHashCode12 = (((iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31) + C786410Ut5.Z2(this.isSimilarMusic)) * 31;
        Long l = this.similarMusicCollectionId;
        int iHashCode13 = (((iHashCode12 + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Z2(this.needShowGuide)) * 31;
        String str9 = this.fromAlbumScene;
        return ((iHashCode13 + (str9 != null ? str9.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isFromHybrid);
    }

    public final String getLogExtraString() {
        Gson gson = LegacyGsonService.LIZ().getGson();
        if (gson != null) {
            return GsonProtectorUtils.toJson(gson, this.logExtra);
        }
        return null;
    }

    public final boolean isAddMultiSongs() {
        return this.isAddMultiSongs;
    }

    public final boolean isFromHybrid() {
        return this.isFromHybrid;
    }

    public final boolean isSimilarMusic() {
        return this.isSimilarMusic;
    }

    public final void appendLogExtra(Map<String, String> map) {
        if (map != null) {
            this.logExtra.putAll(map);
        }
    }

    public final void appendLogExtra(String str, String str2) {
        this.logExtra.put(str, str2);
    }

    public AddSongContextData(String str, String str2, MusicETBusinessModule musicETBusinessModule, String str3, String str4, String str5, Music music, int i, String str6, String str7, String str8, EnumC631120OpC enumC631120OpC, DspLinkState dspLinkState, String str9, SearchInflowParam searchInflowParam, String str10, String str11, Integer num, String str12, String str13, DspPlatform dspPlatform, boolean z, boolean z2, HashMap<String, String> map, List<Long> list, String str14, boolean z3, Long l, boolean z4, String str15, boolean z5) {
        this.enterFrom = str;
        this.firstEnterFrom = str2;
        this.businessModule = musicETBusinessModule;
        this.displayButtonName = str3;
        this.awemeId = str4;
        this.buttonType = str5;
        this.music = music;
        this.awemeType = i;
        this.metaSongId = str6;
        this.musicVolume = str7;
        this.musicType = str8;
        this.dspEntrance = enumC631120OpC;
        this.linkState = dspLinkState;
        this.requestId = str9;
        this.searchInflowParam = searchInflowParam;
        this.playlistId = str10;
        this.chartId = str11;
        this.order = num;
        this.enterMethod = str12;
        this.page = str13;
        this.shareFromDsp = dspPlatform;
        this.activityStartResult = z;
        this.isAddMultiSongs = z2;
        this.logExtra = map;
        this.selectedMusicIds = list;
        this.promoId = str14;
        this.isSimilarMusic = z3;
        this.similarMusicCollectionId = l;
        this.needShowGuide = z4;
        this.fromAlbumScene = str15;
        this.isFromHybrid = z5;
    }

    public AddSongContextData(String str, String str2, MusicETBusinessModule musicETBusinessModule, String str3, String str4, String str5, Music music, int i, String str6, String str7, String str8, EnumC631120OpC enumC631120OpC, DspLinkState dspLinkState, String str9, SearchInflowParam searchInflowParam, String str10, String str11, Integer num, String str12, String str13, DspPlatform dspPlatform, boolean z, boolean z2, HashMap map, List list, String str14, boolean z3, Long l, boolean z4, String str15, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, musicETBusinessModule, (i2 & 8) != 0 ? null : str3, str4, str5, music, i, str6, str7, str8, enumC631120OpC, dspLinkState, (i2 & 8192) != 0 ? null : str9, (i2 & 16384) != 0 ? null : searchInflowParam, (32768 & i2) != 0 ? null : str10, (65536 & i2) != 0 ? null : str11, (131072 & i2) != 0 ? null : num, (262144 & i2) != 0 ? null : str12, (524288 & i2) != 0 ? null : str13, (1048576 & i2) != 0 ? DspPlatform.UNKNOWN : dspPlatform, (2097152 & i2) != 0 ? false : z, (4194304 & i2) != 0 ? false : z2, (8388608 & i2) != 0 ? new HashMap() : map, (16777216 & i2) != 0 ? C13BV.INSTANCE : list, (33554432 & i2) != 0 ? null : str14, (67108864 & i2) != 0 ? false : z3, (134217728 & i2) != 0 ? null : l, (268435456 & i2) != 0 ? false : z4, (536870912 & i2) == 0 ? str15 : null, (i2 & 1073741824) != 0 ? false : z5);
    }
}
