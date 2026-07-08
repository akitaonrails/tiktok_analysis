package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class ShootExtraData implements Parcelable, Serializable {

    @C09CT("recommend_music_clip_id")
    public Long clipId;

    @C09CT("recommend_music_cml_clip_id")
    public Long cmlClipId;

    @C09CT("recommend_music_cml_meta_song_id")
    public String cmlMetaSongId;

    @C09CT("check_if_show_music_loading")
    public Boolean downloadMusicInBackground;

    @C09CT("followup_square_action_position")
    public String followupSquareActionPosition;

    @C09CT("followup_square_recommend_reason")
    public String followupSquareRecommendReason;

    @C09CT("followup_square_recommend_type")
    public String followupSquareRecommendType;

    @C09CT("followup_square_video_rank")
    public Integer followupSquareVideoRank;

    @C09CT("aweme_type")
    public Integer fromAwemeType;

    @C09CT("from_banner_id")
    public String fromBannerId;

    @C09CT("is_bundled")
    public Integer isBundled;

    @C09CT("is_commercial_use")
    public Integer isCommercialUse;

    @C09CT("is_from_followup_square_original_video")
    public String isFromFollowupSquareOriginalVideo;

    @C09CT("is_recommend_music")
    public Boolean isRecommendMusic;

    @C09CT("is_same_music_supply_detail_page")
    public String isSameMusicSupplyDetailPage;

    @C09CT("recommend_music_meta_song_id")
    public String metaSongId;

    @C09CT("mob_params")
    public Map<String, ? extends Map<String, String>> mobParams;

    @C09CT("replace_offline_music")
    public Boolean replaceOfflineMusic;

    @C09CT("shoot_enter_from")
    public String shootEnterFrom;

    @C09CT("shoot_enter_method")
    public String shootEnterMethod;

    @C09CT("sticker_music_origiin")
    public String stickerMusicOrigin;

    @C09CT("sticker_shoot_way")
    public String stickerShootWay;

    @C09CT("recommend_music_suggestion_id")
    public Long suggestionId;

    @C09CT("recommend_music_version")
    public String version;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ShootExtraData> CREATOR = new Creator();

    public static final class Companion {
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<ShootExtraData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShootExtraData createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string3 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string4 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    String string12 = parcel.readString();
                    int i3 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap.put(string12, linkedHashMap2);
                }
            }
            return new ShootExtraData(string, string2, numValueOf, boolValueOf, string3, numValueOf2, lValueOf, string4, lValueOf2, string5, string6, numValueOf3, lValueOf3, boolValueOf2, string7, string8, string9, string10, string11, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShootExtraData[] newArray(int i) {
            return new ShootExtraData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16777215, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str) {
        this(str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16777214, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2) {
        this(str, str2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16777212, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num) {
        this(str, str2, num, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16777208, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool) {
        this(str, str2, num, bool, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16777200, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3) {
        this(str, str2, num, bool, str3, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16777184, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2) {
        this(str, str2, num, bool, str3, num2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16777152, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l) {
        this(str, str2, num, bool, str3, num2, l, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16777088, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4) {
        this(str, str2, num, bool, str3, num2, l, str4, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16776960, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16776704, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16776192, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, str6, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16775168, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Integer num3) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, str6, num3, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16773120, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Integer num3, Long l3) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, str6, num3, l3, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16769024, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Integer num3, Long l3, Boolean bool2) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, str6, num3, l3, bool2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16760832, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Integer num3, Long l3, Boolean bool2, String str7) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, str6, num3, l3, bool2, str7, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16744448, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Integer num3, Long l3, Boolean bool2, String str7, String str8) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, str6, num3, l3, bool2, str7, str8, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16711680, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Integer num3, Long l3, Boolean bool2, String str7, String str8, String str9) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, str6, num3, l3, bool2, str7, str8, str9, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16646144, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Integer num3, Long l3, Boolean bool2, String str7, String str8, String str9, String str10) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, str6, num3, l3, bool2, str7, str8, str9, str10, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16515072, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Integer num3, Long l3, Boolean bool2, String str7, String str8, String str9, String str10, String str11) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, str6, num3, l3, bool2, str7, str8, str9, str10, str11, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16252928, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Integer num3, Long l3, Boolean bool2, String str7, String str8, String str9, String str10, String str11, Map<String, ? extends Map<String, String>> map) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, str6, num3, l3, bool2, str7, str8, str9, str10, str11, map, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15728640, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Integer num3, Long l3, Boolean bool2, String str7, String str8, String str9, String str10, String str11, Map<String, ? extends Map<String, String>> map, String str12) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, str6, num3, l3, bool2, str7, str8, str9, str10, str11, map, str12, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14680064, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Integer num3, Long l3, Boolean bool2, String str7, String str8, String str9, String str10, String str11, Map<String, ? extends Map<String, String>> map, String str12, String str13) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, str6, num3, l3, bool2, str7, str8, str9, str10, str11, map, str12, str13, null, 0 == true ? 1 : 0, 12582912, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Integer num3, Long l3, Boolean bool2, String str7, String str8, String str9, String str10, String str11, Map<String, ? extends Map<String, String>> map, String str12, String str13, Integer num4) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, str6, num3, l3, bool2, str7, str8, str9, str10, str11, map, str12, str13, num4, null, 8388608, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.shootEnterFrom);
        parcel.writeString(this.fromBannerId);
        Integer num = this.isBundled;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.isRecommendMusic;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.shootEnterMethod);
        Integer num2 = this.isCommercialUse;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Long l = this.clipId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.metaSongId);
        Long l2 = this.cmlClipId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.cmlMetaSongId);
        parcel.writeString(this.version);
        Integer num3 = this.fromAwemeType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Long l3 = this.suggestionId;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Boolean bool2 = this.replaceOfflineMusic;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.isSameMusicSupplyDetailPage);
        parcel.writeString(this.followupSquareActionPosition);
        parcel.writeString(this.isFromFollowupSquareOriginalVideo);
        parcel.writeString(this.followupSquareRecommendType);
        parcel.writeString(this.followupSquareRecommendReason);
        Map<String, ? extends Map<String, String>> map = this.mobParams;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, ? extends Map<String, String>> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                Map<String, String> value = entry.getValue();
                parcel.writeInt(value.size());
                for (Map.Entry<String, String> entry2 : value.entrySet()) {
                    parcel.writeString(entry2.getKey());
                    parcel.writeString(entry2.getValue());
                }
            }
        }
        parcel.writeString(this.stickerShootWay);
        parcel.writeString(this.stickerMusicOrigin);
        Integer num4 = this.followupSquareVideoRank;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Boolean bool3 = this.downloadMusicInBackground;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
    }

    public final Long getClipId() {
        return this.clipId;
    }

    public final Long getCmlClipId() {
        return this.cmlClipId;
    }

    public final String getCmlMetaSongId() {
        return this.cmlMetaSongId;
    }

    public final Boolean getDownloadMusicInBackground() {
        return this.downloadMusicInBackground;
    }

    public final String getFollowupSquareActionPosition() {
        return this.followupSquareActionPosition;
    }

    public final String getFollowupSquareRecommendReason() {
        return this.followupSquareRecommendReason;
    }

    public final String getFollowupSquareRecommendType() {
        return this.followupSquareRecommendType;
    }

    public final Integer getFollowupSquareVideoRank() {
        return this.followupSquareVideoRank;
    }

    public final Integer getFromAwemeType() {
        return this.fromAwemeType;
    }

    public final String getFromBannerId() {
        return this.fromBannerId;
    }

    public final String getMetaSongId() {
        return this.metaSongId;
    }

    public final Map<String, Map<String, String>> getMobParams() {
        return this.mobParams;
    }

    public final Boolean getReplaceOfflineMusic() {
        return this.replaceOfflineMusic;
    }

    public final String getShootEnterFrom() {
        return this.shootEnterFrom;
    }

    public final String getShootEnterMethod() {
        return this.shootEnterMethod;
    }

    public final String getStickerMusicOrigin() {
        return this.stickerMusicOrigin;
    }

    public final String getStickerShootWay() {
        return this.stickerShootWay;
    }

    public final Long getSuggestionId() {
        return this.suggestionId;
    }

    public final String getVersion() {
        return this.version;
    }

    public final Integer isBundled() {
        return this.isBundled;
    }

    public final Integer isCommercialUse() {
        return this.isCommercialUse;
    }

    public final String isFromFollowupSquareOriginalVideo() {
        return this.isFromFollowupSquareOriginalVideo;
    }

    public final Boolean isRecommendMusic() {
        return this.isRecommendMusic;
    }

    public final String isSameMusicSupplyDetailPage() {
        return this.isSameMusicSupplyDetailPage;
    }

    public final void setBundled(Integer num) {
        this.isBundled = num;
    }

    public final void setClipId(Long l) {
        this.clipId = l;
    }

    public final void setCmlClipId(Long l) {
        this.cmlClipId = l;
    }

    public final void setCmlMetaSongId(String str) {
        this.cmlMetaSongId = str;
    }

    public final void setCommercialUse(Integer num) {
        this.isCommercialUse = num;
    }

    public final void setDownloadMusicInBackground(Boolean bool) {
        this.downloadMusicInBackground = bool;
    }

    public final void setFollowupSquareActionPosition(String str) {
        this.followupSquareActionPosition = str;
    }

    public final void setFollowupSquareRecommendReason(String str) {
        this.followupSquareRecommendReason = str;
    }

    public final void setFollowupSquareRecommendType(String str) {
        this.followupSquareRecommendType = str;
    }

    public final void setFollowupSquareVideoRank(Integer num) {
        this.followupSquareVideoRank = num;
    }

    public final void setFromAwemeType(Integer num) {
        this.fromAwemeType = num;
    }

    public final void setFromBannerId(String str) {
        this.fromBannerId = str;
    }

    public final void setFromFollowupSquareOriginalVideo(String str) {
        this.isFromFollowupSquareOriginalVideo = str;
    }

    public final void setMetaSongId(String str) {
        this.metaSongId = str;
    }

    public final void setMobParams(Map<String, ? extends Map<String, String>> map) {
        this.mobParams = map;
    }

    public final void setRecommendMusic(Boolean bool) {
        this.isRecommendMusic = bool;
    }

    public final void setReplaceOfflineMusic(Boolean bool) {
        this.replaceOfflineMusic = bool;
    }

    public final void setSameMusicSupplyDetailPage(String str) {
        this.isSameMusicSupplyDetailPage = str;
    }

    public final void setShootEnterFrom(String str) {
        this.shootEnterFrom = str;
    }

    public final void setShootEnterMethod(String str) {
        this.shootEnterMethod = str;
    }

    public final void setStickerMusicOrigin(String str) {
        this.stickerMusicOrigin = str;
    }

    public final void setStickerShootWay(String str) {
        this.stickerShootWay = str;
    }

    public final void setSuggestionId(Long l) {
        this.suggestionId = l;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Integer num3, Long l3, Boolean bool2, String str7, String str8, String str9, String str10, String str11, Map<String, ? extends Map<String, String>> map, String str12, String str13, Integer num4, Boolean bool3) {
        this.shootEnterFrom = str;
        this.fromBannerId = str2;
        this.isBundled = num;
        this.isRecommendMusic = bool;
        this.shootEnterMethod = str3;
        this.isCommercialUse = num2;
        this.clipId = l;
        this.metaSongId = str4;
        this.cmlClipId = l2;
        this.cmlMetaSongId = str5;
        this.version = str6;
        this.fromAwemeType = num3;
        this.suggestionId = l3;
        this.replaceOfflineMusic = bool2;
        this.isSameMusicSupplyDetailPage = str7;
        this.followupSquareActionPosition = str8;
        this.isFromFollowupSquareOriginalVideo = str9;
        this.followupSquareRecommendType = str10;
        this.followupSquareRecommendReason = str11;
        this.mobParams = map;
        this.stickerShootWay = str12;
        this.stickerMusicOrigin = str13;
        this.followupSquareVideoRank = num4;
        this.downloadMusicInBackground = bool3;
    }

    public /* synthetic */ ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Integer num3, Long l3, Boolean bool2, String str7, String str8, String str9, String str10, String str11, Map map, String str12, String str13, Integer num4, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) == 0 ? str3 : "", (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : l2, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num3, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : l3, (i & 8192) != 0 ? Boolean.FALSE : bool2, (i & 16384) != 0 ? null : str7, (32768 & i) != 0 ? null : str8, (65536 & i) != 0 ? null : str9, (131072 & i) != 0 ? null : str10, (262144 & i) != 0 ? null : str11, (524288 & i) != 0 ? null : map, (1048576 & i) != 0 ? null : str12, (2097152 & i) != 0 ? null : str13, (4194304 & i) != 0 ? null : num4, (i & 8388608) != 0 ? Boolean.FALSE : bool3);
    }
}
