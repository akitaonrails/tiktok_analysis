package com.ss.android.ugc.aweme.creative.model.music;

import X.C040H;
import X.C09CT;
import X.C1438590nXV;
import X.C1456960o18;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.AudioRatioInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzCompatModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import com.ss.android.ugc.aweme.creative.model.music.UnSelectMusic;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.music.model.FullSongDetail;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class MusicBuzModel implements Parcelable {
    public static final Parcelable.Creator<MusicBuzModel> CREATOR = new Parcelable.Creator<MusicBuzModel>() { // from class: X.0MHa
        @Override // android.os.Parcelable.Creator
        public final MusicBuzModel createFromParcel(Parcel parcel) {
            boolean z;
            MusicObject musicObjectCreateFromParcel;
            ArrayList arrayList;
            boolean z2;
            boolean z3;
            Boolean boolValueOf;
            AudioRatioInfo audioRatioInfoCreateFromParcel;
            boolean z4;
            boolean z5;
            boolean z6;
            ArrayList arrayList2;
            LogPbBean logPbBeanCreateFromParcel;
            boolean z7;
            ArrayList arrayList3;
            Float[] fArr;
            boolean z8;
            StickPointMusicAlg stickPointMusicAlgCreateFromParcel;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            Boolean boolValueOf2;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            Boolean boolValueOf3;
            boolean z20;
            boolean z21;
            boolean z22;
            boolean z23;
            boolean z24;
            boolean z25;
            boolean z26;
            boolean z27;
            boolean z28;
            UnSelectMusic unSelectMusicCreateFromParcel;
            boolean z29;
            boolean z30;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                musicObjectCreateFromParcel = null;
            } else {
                musicObjectCreateFromParcel = MusicObject.CREATOR.createFromParcel(parcel);
            }
            MusicObject musicObject = musicObjectCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(MusicBuzModel.CREATOR.createFromParcel(parcel));
                }
            }
            String string = parcel.readString();
            float f = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
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
                audioRatioInfoCreateFromParcel = null;
            } else {
                audioRatioInfoCreateFromParcel = AudioRatioInfo.CREATOR.createFromParcel(parcel);
            }
            AudioRatioInfo audioRatioInfo = audioRatioInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            AVChallenge aVChallenge = (AVChallenge) parcel.readParcelable(MusicBuzModel.class.getClassLoader());
            String string2 = parcel.readString();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            long j = parcel.readLong();
            int i5 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i6 = parcel.readInt();
                arrayList2 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList2.add(parcel.readSerializable());
                }
            }
            if (parcel.readInt() == 0) {
                logPbBeanCreateFromParcel = null;
            } else {
                logPbBeanCreateFromParcel = LogPbBean.CREATOR.createFromParcel(parcel);
            }
            LogPbBean logPbBean = logPbBeanCreateFromParcel;
            String string3 = parcel.readString();
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i10 = parcel.readInt();
                arrayList3 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList3.add(Integer.valueOf(parcel.readInt()));
                }
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            if (parcel.readInt() == 0) {
                fArr = null;
            } else {
                int i14 = parcel.readInt();
                fArr = new Float[i14];
                for (int i15 = 0; i15 != i14; i15++) {
                    fArr[i15] = Float.valueOf(parcel.readFloat());
                }
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() == 0) {
                stickPointMusicAlgCreateFromParcel = null;
            } else {
                stickPointMusicAlgCreateFromParcel = StickPointMusicAlg.CREATOR.createFromParcel(parcel);
            }
            StickPointMusicAlg stickPointMusicAlg = stickPointMusicAlgCreateFromParcel;
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            String string10 = parcel.readString();
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (parcel.readInt() != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (parcel.readInt() != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolValueOf2 = Boolean.valueOf(z15);
            }
            if (parcel.readInt() != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            String string11 = parcel.readString();
            int i16 = parcel.readInt();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            int i17 = parcel.readInt();
            int i18 = parcel.readInt();
            int i19 = parcel.readInt();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            if (parcel.readInt() != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (parcel.readInt() != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            int i20 = parcel.readInt();
            int i21 = parcel.readInt();
            int i22 = parcel.readInt();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolValueOf3 = Boolean.valueOf(z19);
            }
            int i23 = parcel.readInt();
            int i24 = parcel.readInt();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            if (parcel.readInt() != 0) {
                z20 = true;
            } else {
                z20 = false;
            }
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            long j2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (parcel.readInt() != 0) {
                z22 = true;
            } else {
                z22 = false;
            }
            String string21 = parcel.readString();
            MatchedPGCSoundInfo matchedPGCSoundInfo = (MatchedPGCSoundInfo) parcel.readSerializable();
            MatchedSoundInfo matchedSoundInfo = (MatchedSoundInfo) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z23 = true;
            } else {
                z23 = false;
            }
            float f2 = parcel.readFloat();
            String string22 = parcel.readString();
            int i25 = parcel.readInt();
            String string23 = parcel.readString();
            C1438590nXV c1438590nXV = (C1438590nXV) parcel.readSerializable();
            C1456960o18 c1456960o18 = (C1456960o18) parcel.readSerializable();
            String string24 = parcel.readString();
            AVMusic aVMusic = (AVMusic) parcel.readSerializable();
            FullSongDetail fullSongDetail = (FullSongDetail) parcel.readSerializable();
            int i26 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z24 = true;
            } else {
                z24 = false;
            }
            if (parcel.readInt() != 0) {
                z25 = true;
            } else {
                z25 = false;
            }
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            int i27 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z26 = true;
            } else {
                z26 = false;
            }
            if (parcel.readInt() != 0) {
                z27 = true;
            } else {
                z27 = false;
            }
            if (parcel.readInt() != 0) {
                z28 = true;
            } else {
                z28 = false;
            }
            AIGCInfo aIGCInfo = (AIGCInfo) parcel.readParcelable(MusicBuzModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                unSelectMusicCreateFromParcel = null;
            } else {
                unSelectMusicCreateFromParcel = UnSelectMusic.CREATOR.createFromParcel(parcel);
            }
            UnSelectMusic unSelectMusic = unSelectMusicCreateFromParcel;
            if (parcel.readInt() != 0) {
                z29 = true;
            } else {
                z29 = false;
            }
            if (parcel.readInt() != 0) {
                z30 = true;
            } else {
                z30 = false;
            }
            return new MusicBuzModel(z, musicObject, arrayList, string, f, z2, boolValueOf, audioRatioInfo, z4, aVChallenge, string2, i3, i4, z5, z6, j, i5, arrayList2, logPbBean, string3, i8, i9, z7, arrayList3, arrayListCreateStringArrayList, i12, i13, fArr, string4, string5, z8, stickPointMusicAlg, string6, z9, z10, string7, string8, string9, z11, string10, z12, z13, z14, boolValueOf2, z16, string11, i16, urlModel, i17, i18, i19, string12, string13, string14, z17, z18, i20, i21, i22, boolValueOf3, i23, i24, string15, string16, string17, z20, string18, string19, string20, j2, z21, z22, string21, matchedPGCSoundInfo, matchedSoundInfo, z23, f2, string22, i25, string23, c1438590nXV, c1456960o18, string24, aVMusic, fullSongDetail, i26, z24, z25, string25, string26, string27, string28, string29, string30, string31, i27, z26, z27, z28, aIGCInfo, unSelectMusic, z29, z30, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), MusicBuzCompatModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MusicBuzModel[] newArray(int i) {
            return new MusicBuzModel[i];
        }
    };

    @C040H
    public String aiMusicLogPbImprId;

    @C09CT("aigc_info")
    public AIGCInfo aigcInfo;

    @C09CT("amr_detect_result")
    public Boolean amrDetectResult;

    @C09CT("cancel_able_in_shoot")
    public boolean cancelAbleInShoot;

    @C09CT("category_id")
    public String categoryID;

    @C09CT("challenge")
    public AVChallenge challenge;

    @C09CT("change_tone")
    public boolean changeTone;

    @C09CT("clip_shoot_duration")
    public int clipShootDuration;

    @C040H
    public int comFrom;

    @C09CT("come_from_for_mod")
    public int comeFromForMod;

    @C09CT("disable_audio_drive")
    public boolean disableAudioDrive;

    @C040H
    public boolean enableMusicSound;

    @C040H
    public long enterTrimPanelTime;

    @C09CT("extend_music_list")
    public List<MusicBuzModel> extendMusicList;

    @C09CT("from_recommend")
    public boolean fromRecommend;

    @C09CT("from_section")
    public int fromSection;

    @C09CT("full_song")
    public FullSongDetail fullSongDetail;

    @C040H
    public transient boolean hasRecordLastSelectMusic;

    @C09CT("hot_tab_chart_region")
    public String hotTabChartRegion;

    @C09CT("ignore_reuse_audio")
    public boolean ignoreReuseAudio;

    @C09CT("is_best_match")
    public boolean isBestMatch;

    @C09CT("is_cc_template_local_music")
    public boolean isCCTemplateLocalMusic;

    @C09CT("is_collected")
    public boolean isCollected;

    @C09CT("is_draft_music_illegal")
    public boolean isDraftMusicIllegal;

    @C09CT("is_draft_music_valid")
    public boolean isDraftMusicValid;

    @C09CT("is_feed_pre_download_mdp")
    public int isFeedPreDownloadMdp;

    @C09CT("is_full_song")
    public boolean isFullSong;

    @C09CT("is_mdp_music_download_finished")
    public boolean isMDPMusicDownloadFinished;

    @C09CT("is_multi_music_from_template")
    public boolean isMultiMusicFromTemplate;

    @C09CT("is_music_from_auto_edit")
    public boolean isMusicFromAutoEdit;

    @C09CT("is_mv_theme_music")
    public boolean isMvThemeMusic;

    @C040H
    public boolean isOriginalSound;

    @C040H
    public boolean isPGC;

    @C040H
    public boolean isPhotoMvModeMusic;

    @C040H
    public boolean isReuseOriginalSound;

    @C09CT("is_same_music_supply_detail_page")
    public String isSameMusicSupplyDetailPage;

    @C040H
    public boolean isSamiRecommend;

    @C09CT("is_sound_loop")
    public Boolean isSoundLoop;

    @C09CT("is_trimming_limited")
    public boolean isTrimmingLimited;

    @C09CT("use_music_before_edit")
    public boolean isUseMusicBeforeEdit;

    @C09CT("keep_origin_auto_music_id")
    public String keepOriginAutoMusicId;

    @C09CT("keep_origin_enter_music_id")
    public String keepOriginEnterMusicId;

    @C09CT("local_music_duration")
    public long localMusicDuration;

    @C09CT("local_music_thumb")
    public String localThumbPath;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("cur_music_length")
    public int mCurMusicLength;

    @C040H
    public int mMusicType;

    @C040H
    public MatchedPGCSoundInfo matchedPGCSoundInfo;

    @C040H
    public MatchedSoundInfo matchedSongInfo;

    @C040H
    public AVMusic memeSongAvMusic;

    @C040H
    public String metaSongID;

    @C09CT("music_object")
    public MusicObject music;

    @C09CT("music_buz_compat_model")
    public MusicBuzCompatModel musicBuzCompatModel;

    @C09CT("music_edit_from")
    public String musicEditFrom;

    @C09CT("music_end")
    public int musicEnd;

    @C09CT("music_end_from_cut")
    public int musicEndFromCut;

    @C09CT("music_length")
    public int musicLength;

    @C09CT("music_max_loop_duration")
    public int musicMaxLoopDuration;

    @C040H
    public String musicMuteDetailUrl;

    @C09CT("music_origin")
    public String musicOrigin;

    @C040H
    public String musicPath;

    @C09CT("music_priority")
    public int musicPriority;

    @C040H
    public int musicRecType;

    @C09CT("music_rec_type_recent")
    public String musicRecTypeRecent;

    @C040H
    public String musicRequestId;

    @C09CT("music_select_tab")
    public String musicSelectTab;

    @C09CT("music_selected_from")
    public String musicSelectedFrom;

    @C09CT("music_selected_from_draft")
    public String musicSelectedFromDraft;

    @C040H
    public int musicShowRank;

    @C09CT("music_start")
    public int musicStart;

    @C09CT("music_start_from_cut")
    public int musicStartFromCut;

    @C09CT("music_type")
    public int musicType;

    @C040H
    public float musicVolume;

    @C09CT("music_volume_info")
    public String musicVolumeInfo;

    @C09CT("music_wave_data")
    public Float[] musicWaveData;

    @C040H
    public boolean needAddRecent;

    @C09CT("online_key")
    public String onlineKey;

    @C09CT("online_path")
    public String onlinePath;

    @C09CT("original_music_end_from_follow_up")
    public int originalMusicEndFromFollowup;

    @C09CT("original_music_start_from_follow_up")
    public int originalMusicStartFromFollowup;

    @C09CT("path")
    public String path;

    @C09CT("previous_search_query")
    public String previousSearchQuery;

    @C040H
    public String recommendSourceFrom;

    @C040H
    public String replaceMusicId;

    @C040H
    public C1438590nXV replaceMusicModel;

    @C040H
    public String reuseOriginalSoundId;

    @C040H
    public int reuseOriginalSoundLength;

    @C040H
    public UrlModel reuseOriginalSoundUrls;

    @C09CT("search_key_words")
    public String searchKeyWords;

    @C09CT("should_music_loop")
    public boolean shouldMusicLoop;

    @C09CT("should_show_commerce_tips")
    public boolean shouldShowCommerceTips;

    @C09CT("similar_tag")
    public int similarTag;

    @C09CT("single_song_shoot_previous_enter_method")
    public String singleSongShootPreviousEnterMethod;

    @C09CT("single_song_shoot_previous_page")
    public String singleSongShootPreviousPage;

    @C09CT("song_id")
    public String songId;

    @C09CT("sound_filter_id")
    public String soundFilterId;

    @C09CT("sound_speed")
    public float soundSpeed;

    @C09CT("stick_point_music_alg")
    public StickPointMusicAlg stickPointMusicAlg;

    @C09CT("stick_point_strategy")
    public Boolean stickPointStrategy;

    @C040H
    public C1456960o18 stripMusicModel;

    @C09CT("sync_click_from")
    public String syncClickFrom;

    @C09CT("tag_list")
    public List<MusicTag> tagList;

    @C09CT("trim_point_recommended")
    public boolean trimPointRecommended;

    @C09CT("trim_point_list")
    public List<Integer> trimPointsList;

    @C09CT("trim_type_list")
    public ArrayList<String> trimTypeList;

    @C040H
    public UnSelectMusic unSelectMusic;

    @C09CT("user_count")
    public int userCount;

    @C09CT("video_duration")
    public int videoDuration;

    @C09CT("amr_detect_result_info")
    public AudioRatioInfo voiceDetectResult;

    public MusicBuzModel() {
        this(false, null, null, null, 1.0f, false, null, null, false, null, null, 0, MusicModel.FromSection.OTHER.ordinal(), false, false, 0L, 0, null, null, null, 0, 0, false, null, null, 0, 0, null, null, null, false, null, null, false, false, null, null, null, false, null, false, false, false, Boolean.FALSE, false, null, 0, null, 0, 0, 0, null, null, null, false, false, 0, 0, 0, Boolean.FALSE, 0, 0, null, "", null, false, null, null, null, 0L, false, false, "", null, null, false, 0.0f, "", 0, null, null, null, null, null, null, 0, false, false, null, null, null, null, null, null, null, 0, false, false, false, null, null, true, false, 0, 0, 0, 0, new MusicBuzCompatModel(null, null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isDraftMusicValid ? 1 : 0);
        MusicObject musicObject = this.music;
        if (musicObject == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicObject.writeToParcel(parcel, i);
        }
        List<MusicBuzModel> list = this.extendMusicList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<MusicBuzModel> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.soundFilterId);
        parcel.writeFloat(this.soundSpeed);
        parcel.writeInt(this.changeTone ? 1 : 0);
        Boolean bool = this.amrDetectResult;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        AudioRatioInfo audioRatioInfo = this.voiceDetectResult;
        if (audioRatioInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioRatioInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isCollected ? 1 : 0);
        parcel.writeParcelable(this.challenge, i);
        parcel.writeString(this.categoryID);
        parcel.writeInt(this.comeFromForMod);
        parcel.writeInt(this.fromSection);
        parcel.writeInt(this.ignoreReuseAudio ? 1 : 0);
        parcel.writeInt(this.isMvThemeMusic ? 1 : 0);
        parcel.writeLong(this.localMusicDuration);
        parcel.writeInt(this.userCount);
        List<MusicTag> list2 = this.tagList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<MusicTag> it3 = list2.iterator();
            while (it3.hasNext()) {
                parcel.writeSerializable(it3.next());
            }
        }
        LogPbBean logPbBean = this.logPb;
        if (logPbBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logPbBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.musicEditFrom);
        parcel.writeInt(this.musicStartFromCut);
        parcel.writeInt(this.musicEndFromCut);
        parcel.writeInt(this.trimPointRecommended ? 1 : 0);
        List<Integer> list3 = this.trimPointsList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<Integer> it4 = list3.iterator();
            while (it4.hasNext()) {
                parcel.writeInt(it4.next().intValue());
            }
        }
        parcel.writeStringList(this.trimTypeList);
        parcel.writeInt(this.musicPriority);
        parcel.writeInt(this.musicType);
        Float[] fArr = this.musicWaveData;
        if (fArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            int length = fArr.length;
            parcel.writeInt(length);
            for (int i2 = 0; i2 != length; i2++) {
                parcel.writeFloat(fArr[i2].floatValue());
            }
        }
        parcel.writeString(this.songId);
        parcel.writeString(this.searchKeyWords);
        parcel.writeInt(this.shouldShowCommerceTips ? 1 : 0);
        StickPointMusicAlg stickPointMusicAlg = this.stickPointMusicAlg;
        if (stickPointMusicAlg == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickPointMusicAlg.writeToParcel(parcel, i);
        }
        parcel.writeString(this.path);
        parcel.writeInt(this.cancelAbleInShoot ? 1 : 0);
        parcel.writeInt(this.isPhotoMvModeMusic ? 1 : 0);
        parcel.writeString(this.musicOrigin);
        parcel.writeString(this.keepOriginEnterMusicId);
        parcel.writeString(this.keepOriginAutoMusicId);
        parcel.writeInt(this.isMusicFromAutoEdit ? 1 : 0);
        parcel.writeString(this.syncClickFrom);
        parcel.writeInt(this.isDraftMusicIllegal ? 1 : 0);
        parcel.writeInt(this.isBestMatch ? 1 : 0);
        parcel.writeInt(this.disableAudioDrive ? 1 : 0);
        Boolean bool2 = this.stickPointStrategy;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.isReuseOriginalSound ? 1 : 0);
        parcel.writeString(this.reuseOriginalSoundId);
        parcel.writeInt(this.reuseOriginalSoundLength);
        parcel.writeSerializable(this.reuseOriginalSoundUrls);
        parcel.writeInt(this.musicLength);
        parcel.writeInt(this.musicStart);
        parcel.writeInt(this.musicEnd);
        parcel.writeString(this.musicPath);
        parcel.writeString(this.onlinePath);
        parcel.writeString(this.onlineKey);
        parcel.writeInt(this.isUseMusicBeforeEdit ? 1 : 0);
        parcel.writeInt(this.fromRecommend ? 1 : 0);
        parcel.writeInt(this.mCurMusicLength);
        parcel.writeInt(this.musicShowRank);
        parcel.writeInt(this.musicRecType);
        Boolean bool3 = this.isSoundLoop;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.mMusicType);
        parcel.writeInt(this.similarTag);
        parcel.writeString(this.recommendSourceFrom);
        parcel.writeString(this.replaceMusicId);
        parcel.writeString(this.localThumbPath);
        parcel.writeInt(this.needAddRecent ? 1 : 0);
        parcel.writeString(this.hotTabChartRegion);
        parcel.writeString(this.musicSelectTab);
        parcel.writeString(this.musicRecTypeRecent);
        parcel.writeLong(this.enterTrimPanelTime);
        parcel.writeInt(this.isPGC ? 1 : 0);
        parcel.writeInt(this.isSamiRecommend ? 1 : 0);
        parcel.writeString(this.metaSongID);
        parcel.writeSerializable(this.matchedPGCSoundInfo);
        parcel.writeSerializable(this.matchedSongInfo);
        parcel.writeInt(this.isOriginalSound ? 1 : 0);
        parcel.writeFloat(this.musicVolume);
        parcel.writeString(this.aiMusicLogPbImprId);
        parcel.writeInt(this.comFrom);
        parcel.writeString(this.musicRequestId);
        parcel.writeSerializable(this.replaceMusicModel);
        parcel.writeSerializable(this.stripMusicModel);
        parcel.writeString(this.musicMuteDetailUrl);
        parcel.writeSerializable(this.memeSongAvMusic);
        parcel.writeSerializable(this.fullSongDetail);
        parcel.writeInt(this.clipShootDuration);
        parcel.writeInt(this.isFullSong ? 1 : 0);
        parcel.writeInt(this.isTrimmingLimited ? 1 : 0);
        parcel.writeString(this.musicVolumeInfo);
        parcel.writeString(this.singleSongShootPreviousPage);
        parcel.writeString(this.singleSongShootPreviousEnterMethod);
        parcel.writeString(this.previousSearchQuery);
        parcel.writeString(this.musicSelectedFrom);
        parcel.writeString(this.musicSelectedFromDraft);
        parcel.writeString(this.isSameMusicSupplyDetailPage);
        parcel.writeInt(this.isFeedPreDownloadMdp);
        parcel.writeInt(this.isMDPMusicDownloadFinished ? 1 : 0);
        parcel.writeInt(this.isMultiMusicFromTemplate ? 1 : 0);
        parcel.writeInt(this.isCCTemplateLocalMusic ? 1 : 0);
        parcel.writeParcelable(this.aigcInfo, i);
        UnSelectMusic unSelectMusic = this.unSelectMusic;
        if (unSelectMusic == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            unSelectMusic.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.enableMusicSound ? 1 : 0);
        parcel.writeInt(this.shouldMusicLoop ? 1 : 0);
        parcel.writeInt(this.musicMaxLoopDuration);
        parcel.writeInt(this.videoDuration);
        parcel.writeInt(this.originalMusicStartFromFollowup);
        parcel.writeInt(this.originalMusicEndFromFollowup);
        this.musicBuzCompatModel.writeToParcel(parcel, i);
    }

    public MusicBuzModel(boolean z, MusicObject musicObject, List<MusicBuzModel> list, String str, float f, boolean z2, Boolean bool, AudioRatioInfo audioRatioInfo, boolean z3, AVChallenge aVChallenge, String str2, int i, int i2, boolean z4, boolean z5, long j, int i3, List<MusicTag> list2, LogPbBean logPbBean, String str3, int i4, int i5, boolean z6, List<Integer> list3, ArrayList<String> arrayList, int i6, int i7, Float[] fArr, String str4, String str5, boolean z7, StickPointMusicAlg stickPointMusicAlg, String str6, boolean z8, boolean z9, String str7, String str8, String str9, boolean z10, String str10, boolean z11, boolean z12, boolean z13, Boolean bool2, boolean z14, String str11, int i8, UrlModel urlModel, int i9, int i10, int i11, String str12, String str13, String str14, boolean z15, boolean z16, int i12, int i13, int i14, Boolean bool3, int i15, int i16, String str15, String str16, String str17, boolean z17, String str18, String str19, String str20, long j2, boolean z18, boolean z19, String str21, MatchedPGCSoundInfo matchedPGCSoundInfo, MatchedSoundInfo matchedSoundInfo, boolean z20, float f2, String str22, int i17, String str23, C1438590nXV c1438590nXV, C1456960o18 c1456960o18, String str24, AVMusic aVMusic, FullSongDetail fullSongDetail, int i18, boolean z21, boolean z22, String str25, String str26, String str27, String str28, String str29, String str30, String str31, int i19, boolean z23, boolean z24, boolean z25, AIGCInfo aIGCInfo, UnSelectMusic unSelectMusic, boolean z26, boolean z27, int i20, int i21, int i22, int i23, MusicBuzCompatModel musicBuzCompatModel) {
        this.isDraftMusicValid = z;
        this.music = musicObject;
        this.extendMusicList = list;
        this.soundFilterId = str;
        this.soundSpeed = f;
        this.changeTone = z2;
        this.amrDetectResult = bool;
        this.voiceDetectResult = audioRatioInfo;
        this.isCollected = z3;
        this.challenge = aVChallenge;
        this.categoryID = str2;
        this.comeFromForMod = i;
        this.fromSection = i2;
        this.ignoreReuseAudio = z4;
        this.isMvThemeMusic = z5;
        this.localMusicDuration = j;
        this.userCount = i3;
        this.tagList = list2;
        this.logPb = logPbBean;
        this.musicEditFrom = str3;
        this.musicStartFromCut = i4;
        this.musicEndFromCut = i5;
        this.trimPointRecommended = z6;
        this.trimPointsList = list3;
        this.trimTypeList = arrayList;
        this.musicPriority = i6;
        this.musicType = i7;
        this.musicWaveData = fArr;
        this.songId = str4;
        this.searchKeyWords = str5;
        this.shouldShowCommerceTips = z7;
        this.stickPointMusicAlg = stickPointMusicAlg;
        this.path = str6;
        this.cancelAbleInShoot = z8;
        this.isPhotoMvModeMusic = z9;
        this.musicOrigin = str7;
        this.keepOriginEnterMusicId = str8;
        this.keepOriginAutoMusicId = str9;
        this.isMusicFromAutoEdit = z10;
        this.syncClickFrom = str10;
        this.isDraftMusicIllegal = z11;
        this.isBestMatch = z12;
        this.disableAudioDrive = z13;
        this.stickPointStrategy = bool2;
        this.isReuseOriginalSound = z14;
        this.reuseOriginalSoundId = str11;
        this.reuseOriginalSoundLength = i8;
        this.reuseOriginalSoundUrls = urlModel;
        this.musicLength = i9;
        this.musicStart = i10;
        this.musicEnd = i11;
        this.musicPath = str12;
        this.onlinePath = str13;
        this.onlineKey = str14;
        this.isUseMusicBeforeEdit = z15;
        this.fromRecommend = z16;
        this.mCurMusicLength = i12;
        this.musicShowRank = i13;
        this.musicRecType = i14;
        this.isSoundLoop = bool3;
        this.mMusicType = i15;
        this.similarTag = i16;
        this.recommendSourceFrom = str15;
        this.replaceMusicId = str16;
        this.localThumbPath = str17;
        this.needAddRecent = z17;
        this.hotTabChartRegion = str18;
        this.musicSelectTab = str19;
        this.musicRecTypeRecent = str20;
        this.enterTrimPanelTime = j2;
        this.isPGC = z18;
        this.isSamiRecommend = z19;
        this.metaSongID = str21;
        this.matchedPGCSoundInfo = matchedPGCSoundInfo;
        this.matchedSongInfo = matchedSoundInfo;
        this.isOriginalSound = z20;
        this.musicVolume = f2;
        this.aiMusicLogPbImprId = str22;
        this.comFrom = i17;
        this.musicRequestId = str23;
        this.replaceMusicModel = c1438590nXV;
        this.stripMusicModel = c1456960o18;
        this.musicMuteDetailUrl = str24;
        this.memeSongAvMusic = aVMusic;
        this.fullSongDetail = fullSongDetail;
        this.clipShootDuration = i18;
        this.isFullSong = z21;
        this.isTrimmingLimited = z22;
        this.musicVolumeInfo = str25;
        this.singleSongShootPreviousPage = str26;
        this.singleSongShootPreviousEnterMethod = str27;
        this.previousSearchQuery = str28;
        this.musicSelectedFrom = str29;
        this.musicSelectedFromDraft = str30;
        this.isSameMusicSupplyDetailPage = str31;
        this.isFeedPreDownloadMdp = i19;
        this.isMDPMusicDownloadFinished = z23;
        this.isMultiMusicFromTemplate = z24;
        this.isCCTemplateLocalMusic = z25;
        this.aigcInfo = aIGCInfo;
        this.unSelectMusic = unSelectMusic;
        this.enableMusicSound = z26;
        this.shouldMusicLoop = z27;
        this.musicMaxLoopDuration = i20;
        this.videoDuration = i21;
        this.originalMusicStartFromFollowup = i22;
        this.originalMusicEndFromFollowup = i23;
        this.musicBuzCompatModel = musicBuzCompatModel;
    }
}
