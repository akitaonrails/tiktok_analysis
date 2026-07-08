package com.ss.android.ugc.aweme.creative.model.stickers;

import X.C040H;
import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.music.MemeSoundMusicParam;
import com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.emojislider.EmojiSliderStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji.InteractiveEmojiStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.link.LinkAnchorModel;
import com.ss.android.ugc.aweme.tools.sticker.core.link.LinkStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.live.LiveCountDownStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.LiveEventCountDownStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.LiveEventStoryStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.LiveShareStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.poll.PollStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesResponseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.hashtag.HashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.SharedCommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.SocialAvatarStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.InteractAreaModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.MemeSongTextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class StickerNewEngineModel implements Parcelable {
    public static final Parcelable.Creator<StickerNewEngineModel> CREATOR = new Parcelable.Creator<StickerNewEngineModel>() { // from class: X.0mfr
        @Override // android.os.Parcelable.Creator
        public final StickerNewEngineModel createFromParcel(Parcel parcel) {
            Long lValueOf;
            boolean z;
            Integer numValueOf;
            boolean z2;
            boolean z3;
            boolean z4;
            Boolean boolValueOf;
            boolean z5;
            MemeSoundMusicParam memeSoundMusicParamCreateFromParcel;
            boolean z6;
            Boolean boolValueOf2;
            boolean z7;
            Boolean boolValueOf3;
            boolean z8;
            boolean z9;
            boolean z10;
            Boolean boolValueOf4;
            boolean z11;
            Boolean boolValueOf5;
            boolean z12;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(AddYoursStickerExtras.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList4.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i9 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList5.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i11 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList6.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i13 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList7.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i15 = parcel.readInt();
            ArrayList arrayList8 = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList8.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i17 = parcel.readInt();
            ArrayList arrayList9 = new ArrayList(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                arrayList9.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf = Boolean.valueOf(z4);
            }
            int i19 = parcel.readInt();
            ArrayList arrayList10 = new ArrayList(i19);
            for (int i20 = 0; i20 != i19; i20++) {
                arrayList10.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i21 = parcel.readInt();
            ArrayList arrayList11 = new ArrayList(i21);
            for (int i22 = 0; i22 != i21; i22++) {
                arrayList11.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i23 = parcel.readInt();
            ArrayList arrayList12 = new ArrayList(i23);
            for (int i24 = 0; i24 != i23; i24++) {
                arrayList12.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i25 = parcel.readInt();
            ArrayList arrayList13 = new ArrayList(i25);
            for (int i26 = 0; i26 != i25; i26++) {
                arrayList13.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i27 = parcel.readInt();
            ArrayList arrayList14 = new ArrayList(i27);
            for (int i28 = 0; i28 != i27; i28++) {
                arrayList14.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i29 = parcel.readInt();
            ArrayList arrayList15 = new ArrayList(i29);
            for (int i30 = 0; i30 != i29; i30++) {
                arrayList15.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i31 = parcel.readInt();
            ArrayList arrayList16 = new ArrayList(i31);
            for (int i32 = 0; i32 != i31; i32++) {
                arrayList16.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i33 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() == 0) {
                memeSoundMusicParamCreateFromParcel = null;
            } else {
                memeSoundMusicParamCreateFromParcel = MemeSoundMusicParam.CREATOR.createFromParcel(parcel);
            }
            MemeSoundMusicParam memeSoundMusicParam = memeSoundMusicParamCreateFromParcel;
            int i34 = parcel.readInt();
            ArrayList arrayList17 = new ArrayList(i34);
            for (int i35 = 0; i35 != i34; i35++) {
                arrayList17.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i36 = parcel.readInt();
            ArrayList arrayList18 = new ArrayList(i36);
            for (int i37 = 0; i37 != i36; i37++) {
                arrayList18.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i38 = parcel.readInt();
            ArrayList arrayList19 = new ArrayList(i38);
            for (int i39 = 0; i39 != i38; i39++) {
                arrayList19.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i40 = parcel.readInt();
            ArrayList arrayList20 = new ArrayList(i40);
            for (int i41 = 0; i41 != i40; i41++) {
                arrayList20.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i42 = parcel.readInt();
            ArrayList arrayList21 = new ArrayList(i42);
            for (int i43 = 0; i43 != i42; i43++) {
                arrayList21.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolValueOf2 = Boolean.valueOf(z6);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolValueOf3 = Boolean.valueOf(z7);
            }
            int i44 = parcel.readInt();
            ArrayList arrayList22 = new ArrayList(i44);
            for (int i45 = 0; i45 != i44; i45++) {
                arrayList22.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i46 = parcel.readInt();
            ArrayList arrayList23 = new ArrayList(i46);
            for (int i47 = 0; i47 != i46; i47++) {
                arrayList23.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i48 = parcel.readInt();
            ArrayList arrayList24 = new ArrayList(i48);
            for (int i49 = 0; i49 != i48; i49++) {
                arrayList24.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i50 = parcel.readInt();
            ArrayList arrayList25 = new ArrayList(i50);
            for (int i51 = 0; i51 != i50; i51++) {
                arrayList25.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            int i52 = parcel.readInt();
            ArrayList arrayList26 = new ArrayList(i52);
            for (int i53 = 0; i53 != i52; i53++) {
                arrayList26.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i54 = parcel.readInt();
            ArrayList arrayList27 = new ArrayList(i54);
            for (int i55 = 0; i55 != i54; i55++) {
                arrayList27.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i56 = parcel.readInt();
            ArrayList arrayList28 = new ArrayList(i56);
            for (int i57 = 0; i57 != i56; i57++) {
                arrayList28.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i58 = parcel.readInt();
            ArrayList arrayList29 = new ArrayList(i58);
            for (int i59 = 0; i59 != i58; i59++) {
                arrayList29.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            int i60 = parcel.readInt();
            ArrayList arrayList30 = new ArrayList(i60);
            for (int i61 = 0; i61 != i60; i61++) {
                arrayList30.add(parcel.readParcelable(StickerNewEngineModel.class.getClassLoader()));
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolValueOf4 = Boolean.valueOf(z10);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolValueOf5 = Boolean.valueOf(z11);
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            return new StickerNewEngineModel(arrayList, arrayList2, lValueOf, arrayList3, z, numValueOf, string, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, string2, z2, z3, arrayList9, boolValueOf, arrayList10, arrayList11, arrayList12, arrayList13, arrayList14, arrayList15, arrayListCreateStringArrayList, arrayList16, i33, z5, memeSoundMusicParam, arrayList17, arrayList18, arrayList19, arrayList20, arrayList21, boolValueOf2, boolValueOf3, arrayList22, arrayList23, arrayList24, arrayList25, z8, arrayList26, arrayList27, arrayList28, z9, arrayList29, arrayList30, boolValueOf4, boolValueOf5, z12);
        }

        @Override // android.os.Parcelable.Creator
        public final StickerNewEngineModel[] newArray(int i) {
            return new StickerNewEngineModel[i];
        }
    };

    @C09CT("add_your_enter_from")
    public String addYoursEnterFrom;

    @C09CT("add_yours_sticker_extras")
    public List<AddYoursStickerExtras> addYoursStickerExtras;

    @C09CT("add_yours_sticker_model")
    public List<AddYoursStickerModel> addYoursStickerModels;

    @C09CT("ai_caption_shuffle_index")
    public int aiCaptionShuffleIndex;

    @C09CT("ai_caption_shuffle_tts_data")
    public List<TTSModel> aiCaptionShuffleTTSDatas;

    @C09CT("ai_caption_shuffle_texts")
    public List<String> aiCaptionShuffleTexts;

    @C09CT("ai_caption_tag_stickers")
    public List<AICaptionTagStickerModel> aiCaptionTagStickers;

    @C09CT("article_stickers")
    public List<ArticleStickerModel> articleStickers;

    @C09CT("caption_item_bar_visible")
    public boolean captionItemBarVisible;

    @C09CT("comment_sticker_model")
    public List<CommentStickerModel> commentStickerModels;

    @C09CT("dm_eoy_ay_mention_sticker_model")
    public List<MentionStickerModel> dmEoyAYMentionStickerModel;

    @C09CT("public_group_entry_sticker")
    public List<DMGroupChatStickerModel> dmGroupChatStickerModel;

    @C09CT("donation_sticker_model")
    public List<DonationStickerModel> donationStickers;

    @C09CT("emoji_slider_model")
    public List<EmojiSliderStickerModel> emojiSliderStickerModels;

    @C040H
    public Boolean enableLyricSticker;

    @C09CT("global_lyric_toggle_state")
    public Boolean globalLyricToggleState;

    @C040H
    public Boolean hasFallbackFontInfo;

    @C09CT("hashtag_down_sticker_model")
    public List<HashTagStickerModel> hashtagStickerModel;

    @C09CT("interact_area_model")
    public List<InteractAreaModel> interactStickerStructs;

    @C09CT("interactive_emoji_model")
    public List<InteractiveEmojiStickerModel> interactiveEmojiStickerModels;

    @C09CT("is_ai_caption_added")
    public boolean isAiCaptionAdded;

    @C09CT("is_from_follow_add_yours")
    public boolean isFromFollowAddYours;

    @C09CT("is_from_secret_replies_try_it")
    public boolean isFromSecretRepliesTryIt;

    @C040H
    public Boolean isQADraft;

    @C09CT("link_model")
    public List<LinkStickerModel> linkStickerModels;

    @C09CT("link_anchor_model")
    public List<LinkAnchorModel> linkStoryAnchorModels;

    @C09CT("live_count_down_sticker_model")
    public List<LiveCountDownStickerModel> liveCountDownStickerModel;

    @C09CT("live_event_count_down_sticker_model")
    public List<LiveEventCountDownStickerModel> liveEventCountDownStickerModel;

    @C09CT("live_event_story_sticker_model")
    public List<LiveEventStoryStickerModel> liveEventStoryStickerModel;

    @C09CT("live_share_story_sticker_model")
    public List<LiveShareStickerModel> liveShareStickerModels;

    @C09CT("location_sticker_model")
    public List<LocationStickerModel> locationStickerModels;

    @C040H
    public transient boolean lyricEffectAnchorRemoved;

    @C09CT("lyric_sticker_models")
    public List<LyricStickerModel> lyricStickerModels;

    @C09CT("meme_song_text_sticker_model")
    public List<MemeSongTextStickerModel> memeSongTextStickerModels;

    @C09CT("ai_caption_music_param")
    public MemeSoundMusicParam memeSoundMusicParam;

    @C09CT("mention_sticker_model")
    public List<MentionStickerModel> mentionStickerModel;

    @C09CT("music_sticker_enter_method")
    public String musicStickerEnterMethod;

    @C040H
    public boolean musicStickerLastState;

    @C09CT("music_sticker_model")
    public List<MusicStickerModel> musicStickerModels;

    @C040H
    public boolean musicStickerPreAdded;

    @C09CT("poll_sticker_model")
    public List<PollStickerModel> pollStickers;

    @C09CT("secret_replies_response_sticker_model")
    public List<SecretRepliesResponseStickerModel> secretRepliesResponseStickerModel;

    @C09CT("secret_replies_sticker_model")
    public List<SecretRepliesStickerModel> secretRepliesStickerModel;

    @C09CT("shared_comment_model")
    public List<SharedCommentStickerModel> sharedCommentStickerModels;

    @C09CT("social_avatar_model")
    public List<SocialAvatarStickerModel> socialAvatarStickerModels;

    @C09CT("text_sticker_model")
    public List<TextStickerModel> textStickerModels;

    @C040H
    public Boolean textUseNewEngine;

    @C09CT("tos_time_stamp_for_add_yours_commend")
    public Long tosTimeStampForAyCommend;

    @C09CT("trend_source")
    public Integer trendSource;

    public StickerNewEngineModel() {
        this(null, null, null, null, false, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, -1, 131071, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerNewEngineModel)) {
            return false;
        }
        StickerNewEngineModel stickerNewEngineModel = (StickerNewEngineModel) obj;
        return Intrinsics.LJFF(this.addYoursStickerModels, stickerNewEngineModel.addYoursStickerModels) && Intrinsics.LJFF(this.addYoursStickerExtras, stickerNewEngineModel.addYoursStickerExtras) && Intrinsics.LJFF(this.tosTimeStampForAyCommend, stickerNewEngineModel.tosTimeStampForAyCommend) && Intrinsics.LJFF(this.liveShareStickerModels, stickerNewEngineModel.liveShareStickerModels) && this.isFromFollowAddYours == stickerNewEngineModel.isFromFollowAddYours && Intrinsics.LJFF(this.trendSource, stickerNewEngineModel.trendSource) && Intrinsics.LJFF(this.addYoursEnterFrom, stickerNewEngineModel.addYoursEnterFrom) && Intrinsics.LJFF(this.liveCountDownStickerModel, stickerNewEngineModel.liveCountDownStickerModel) && Intrinsics.LJFF(this.liveEventCountDownStickerModel, stickerNewEngineModel.liveEventCountDownStickerModel) && Intrinsics.LJFF(this.mentionStickerModel, stickerNewEngineModel.mentionStickerModel) && Intrinsics.LJFF(this.hashtagStickerModel, stickerNewEngineModel.hashtagStickerModel) && Intrinsics.LJFF(this.musicStickerModels, stickerNewEngineModel.musicStickerModels) && Intrinsics.LJFF(this.musicStickerEnterMethod, stickerNewEngineModel.musicStickerEnterMethod) && this.musicStickerPreAdded == stickerNewEngineModel.musicStickerPreAdded && this.musicStickerLastState == stickerNewEngineModel.musicStickerLastState && Intrinsics.LJFF(this.lyricStickerModels, stickerNewEngineModel.lyricStickerModels) && Intrinsics.LJFF(this.isQADraft, stickerNewEngineModel.isQADraft) && Intrinsics.LJFF(this.textStickerModels, stickerNewEngineModel.textStickerModels) && Intrinsics.LJFF(this.interactStickerStructs, stickerNewEngineModel.interactStickerStructs) && Intrinsics.LJFF(this.memeSongTextStickerModels, stickerNewEngineModel.memeSongTextStickerModels) && Intrinsics.LJFF(this.locationStickerModels, stickerNewEngineModel.locationStickerModels) && Intrinsics.LJFF(this.aiCaptionTagStickers, stickerNewEngineModel.aiCaptionTagStickers) && Intrinsics.LJFF(this.commentStickerModels, stickerNewEngineModel.commentStickerModels) && Intrinsics.LJFF(this.aiCaptionShuffleTexts, stickerNewEngineModel.aiCaptionShuffleTexts) && Intrinsics.LJFF(this.aiCaptionShuffleTTSDatas, stickerNewEngineModel.aiCaptionShuffleTTSDatas) && this.aiCaptionShuffleIndex == stickerNewEngineModel.aiCaptionShuffleIndex && this.isAiCaptionAdded == stickerNewEngineModel.isAiCaptionAdded && Intrinsics.LJFF(this.memeSoundMusicParam, stickerNewEngineModel.memeSoundMusicParam) && Intrinsics.LJFF(this.interactiveEmojiStickerModels, stickerNewEngineModel.interactiveEmojiStickerModels) && Intrinsics.LJFF(this.emojiSliderStickerModels, stickerNewEngineModel.emojiSliderStickerModels) && Intrinsics.LJFF(this.linkStickerModels, stickerNewEngineModel.linkStickerModels) && Intrinsics.LJFF(this.linkStoryAnchorModels, stickerNewEngineModel.linkStoryAnchorModels) && Intrinsics.LJFF(this.socialAvatarStickerModels, stickerNewEngineModel.socialAvatarStickerModels) && Intrinsics.LJFF(this.textUseNewEngine, stickerNewEngineModel.textUseNewEngine) && Intrinsics.LJFF(this.hasFallbackFontInfo, stickerNewEngineModel.hasFallbackFontInfo) && Intrinsics.LJFF(this.pollStickers, stickerNewEngineModel.pollStickers) && Intrinsics.LJFF(this.articleStickers, stickerNewEngineModel.articleStickers) && Intrinsics.LJFF(this.donationStickers, stickerNewEngineModel.donationStickers) && Intrinsics.LJFF(this.dmEoyAYMentionStickerModel, stickerNewEngineModel.dmEoyAYMentionStickerModel) && this.captionItemBarVisible == stickerNewEngineModel.captionItemBarVisible && Intrinsics.LJFF(this.sharedCommentStickerModels, stickerNewEngineModel.sharedCommentStickerModels) && Intrinsics.LJFF(this.secretRepliesStickerModel, stickerNewEngineModel.secretRepliesStickerModel) && Intrinsics.LJFF(this.secretRepliesResponseStickerModel, stickerNewEngineModel.secretRepliesResponseStickerModel) && this.isFromSecretRepliesTryIt == stickerNewEngineModel.isFromSecretRepliesTryIt && Intrinsics.LJFF(this.liveEventStoryStickerModel, stickerNewEngineModel.liveEventStoryStickerModel) && Intrinsics.LJFF(this.dmGroupChatStickerModel, stickerNewEngineModel.dmGroupChatStickerModel) && Intrinsics.LJFF(this.enableLyricSticker, stickerNewEngineModel.enableLyricSticker) && Intrinsics.LJFF(this.globalLyricToggleState, stickerNewEngineModel.globalLyricToggleState) && this.lyricEffectAnchorRemoved == stickerNewEngineModel.lyricEffectAnchorRemoved;
    }

    public final int hashCode() {
        int iHashCode = ((this.addYoursStickerModels.hashCode() * 31) + this.addYoursStickerExtras.hashCode()) * 31;
        Long l = this.tosTimeStampForAyCommend;
        int iHashCode2 = (((((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + this.liveShareStickerModels.hashCode()) * 31) + C786410Ut5.Z2(this.isFromFollowAddYours)) * 31;
        Integer num = this.trendSource;
        int iHashCode3 = (((((((((((((((((((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.addYoursEnterFrom.hashCode()) * 31) + this.liveCountDownStickerModel.hashCode()) * 31) + this.liveEventCountDownStickerModel.hashCode()) * 31) + this.mentionStickerModel.hashCode()) * 31) + this.hashtagStickerModel.hashCode()) * 31) + this.musicStickerModels.hashCode()) * 31) + this.musicStickerEnterMethod.hashCode()) * 31) + C786410Ut5.Z2(this.musicStickerPreAdded)) * 31) + C786410Ut5.Z2(this.musicStickerLastState)) * 31) + this.lyricStickerModels.hashCode()) * 31;
        Boolean bool = this.isQADraft;
        int iHashCode4 = (((((((((((((((((((((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + this.textStickerModels.hashCode()) * 31) + this.interactStickerStructs.hashCode()) * 31) + this.memeSongTextStickerModels.hashCode()) * 31) + this.locationStickerModels.hashCode()) * 31) + this.aiCaptionTagStickers.hashCode()) * 31) + this.commentStickerModels.hashCode()) * 31) + this.aiCaptionShuffleTexts.hashCode()) * 31) + this.aiCaptionShuffleTTSDatas.hashCode()) * 31) + this.aiCaptionShuffleIndex) * 31) + C786410Ut5.Z2(this.isAiCaptionAdded)) * 31;
        MemeSoundMusicParam memeSoundMusicParam = this.memeSoundMusicParam;
        int iHashCode5 = (((((((((((iHashCode4 + (memeSoundMusicParam == null ? 0 : memeSoundMusicParam.hashCode())) * 31) + this.interactiveEmojiStickerModels.hashCode()) * 31) + this.emojiSliderStickerModels.hashCode()) * 31) + this.linkStickerModels.hashCode()) * 31) + this.linkStoryAnchorModels.hashCode()) * 31) + this.socialAvatarStickerModels.hashCode()) * 31;
        Boolean bool2 = this.textUseNewEngine;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasFallbackFontInfo;
        int iHashCode7 = (((((((((((((((((((((((iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31) + this.pollStickers.hashCode()) * 31) + this.articleStickers.hashCode()) * 31) + this.donationStickers.hashCode()) * 31) + this.dmEoyAYMentionStickerModel.hashCode()) * 31) + C786410Ut5.Z2(this.captionItemBarVisible)) * 31) + this.sharedCommentStickerModels.hashCode()) * 31) + this.secretRepliesStickerModel.hashCode()) * 31) + this.secretRepliesResponseStickerModel.hashCode()) * 31) + C786410Ut5.Z2(this.isFromSecretRepliesTryIt)) * 31) + this.liveEventStoryStickerModel.hashCode()) * 31) + this.dmGroupChatStickerModel.hashCode()) * 31;
        Boolean bool4 = this.enableLyricSticker;
        int iHashCode8 = (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.globalLyricToggleState;
        return ((iHashCode8 + (bool5 != null ? bool5.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.lyricEffectAnchorRemoved);
    }

    public final String toString() {
        return "StickerNewEngineModel(addYoursStickerModels=" + this.addYoursStickerModels + ", addYoursStickerExtras=" + this.addYoursStickerExtras + ", tosTimeStampForAyCommend=" + this.tosTimeStampForAyCommend + ", liveShareStickerModels=" + this.liveShareStickerModels + ", isFromFollowAddYours=" + this.isFromFollowAddYours + ", trendSource=" + this.trendSource + ", addYoursEnterFrom=" + this.addYoursEnterFrom + ", liveCountDownStickerModel=" + this.liveCountDownStickerModel + ", liveEventCountDownStickerModel=" + this.liveEventCountDownStickerModel + ", mentionStickerModel=" + this.mentionStickerModel + ", hashtagStickerModel=" + this.hashtagStickerModel + ", musicStickerModels=" + this.musicStickerModels + ", musicStickerEnterMethod=" + this.musicStickerEnterMethod + ", musicStickerPreAdded=" + this.musicStickerPreAdded + ", musicStickerLastState=" + this.musicStickerLastState + ", lyricStickerModels=" + this.lyricStickerModels + ", isQADraft=" + this.isQADraft + ", textStickerModels=" + this.textStickerModels + ", interactStickerStructs=" + this.interactStickerStructs + ", memeSongTextStickerModels=" + this.memeSongTextStickerModels + ", locationStickerModels=" + this.locationStickerModels + ", aiCaptionTagStickers=" + this.aiCaptionTagStickers + ", commentStickerModels=" + this.commentStickerModels + ", aiCaptionShuffleTexts=" + this.aiCaptionShuffleTexts + ", aiCaptionShuffleTTSDatas=" + this.aiCaptionShuffleTTSDatas + ", aiCaptionShuffleIndex=" + this.aiCaptionShuffleIndex + ", isAiCaptionAdded=" + this.isAiCaptionAdded + ", memeSoundMusicParam=" + this.memeSoundMusicParam + ", interactiveEmojiStickerModels=" + this.interactiveEmojiStickerModels + ", emojiSliderStickerModels=" + this.emojiSliderStickerModels + ", linkStickerModels=" + this.linkStickerModels + ", linkStoryAnchorModels=" + this.linkStoryAnchorModels + ", socialAvatarStickerModels=" + this.socialAvatarStickerModels + ", textUseNewEngine=" + this.textUseNewEngine + ", hasFallbackFontInfo=" + this.hasFallbackFontInfo + ", pollStickers=" + this.pollStickers + ", articleStickers=" + this.articleStickers + ", donationStickers=" + this.donationStickers + ", dmEoyAYMentionStickerModel=" + this.dmEoyAYMentionStickerModel + ", captionItemBarVisible=" + this.captionItemBarVisible + ", sharedCommentStickerModels=" + this.sharedCommentStickerModels + ", secretRepliesStickerModel=" + this.secretRepliesStickerModel + ", secretRepliesResponseStickerModel=" + this.secretRepliesResponseStickerModel + ", isFromSecretRepliesTryIt=" + this.isFromSecretRepliesTryIt + ", liveEventStoryStickerModel=" + this.liveEventStoryStickerModel + ", dmGroupChatStickerModel=" + this.dmGroupChatStickerModel + ", enableLyricSticker=" + this.enableLyricSticker + ", globalLyricToggleState=" + this.globalLyricToggleState + ", lyricEffectAnchorRemoved=" + this.lyricEffectAnchorRemoved + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AddYoursStickerModel> list = this.addYoursStickerModels;
        parcel.writeInt(list.size());
        Iterator<AddYoursStickerModel> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        List<AddYoursStickerExtras> list2 = this.addYoursStickerExtras;
        parcel.writeInt(list2.size());
        Iterator<AddYoursStickerExtras> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        Long l = this.tosTimeStampForAyCommend;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        List<LiveShareStickerModel> list3 = this.liveShareStickerModels;
        parcel.writeInt(list3.size());
        Iterator<LiveShareStickerModel> it4 = list3.iterator();
        while (it4.hasNext()) {
            parcel.writeParcelable(it4.next(), i);
        }
        parcel.writeInt(this.isFromFollowAddYours ? 1 : 0);
        Integer num = this.trendSource;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.addYoursEnterFrom);
        List<LiveCountDownStickerModel> list4 = this.liveCountDownStickerModel;
        parcel.writeInt(list4.size());
        Iterator<LiveCountDownStickerModel> it5 = list4.iterator();
        while (it5.hasNext()) {
            parcel.writeParcelable(it5.next(), i);
        }
        List<LiveEventCountDownStickerModel> list5 = this.liveEventCountDownStickerModel;
        parcel.writeInt(list5.size());
        Iterator<LiveEventCountDownStickerModel> it6 = list5.iterator();
        while (it6.hasNext()) {
            parcel.writeParcelable(it6.next(), i);
        }
        List<MentionStickerModel> list6 = this.mentionStickerModel;
        parcel.writeInt(list6.size());
        Iterator<MentionStickerModel> it7 = list6.iterator();
        while (it7.hasNext()) {
            parcel.writeParcelable(it7.next(), i);
        }
        List<HashTagStickerModel> list7 = this.hashtagStickerModel;
        parcel.writeInt(list7.size());
        Iterator<HashTagStickerModel> it8 = list7.iterator();
        while (it8.hasNext()) {
            parcel.writeParcelable(it8.next(), i);
        }
        List<MusicStickerModel> list8 = this.musicStickerModels;
        parcel.writeInt(list8.size());
        Iterator<MusicStickerModel> it9 = list8.iterator();
        while (it9.hasNext()) {
            parcel.writeParcelable(it9.next(), i);
        }
        parcel.writeString(this.musicStickerEnterMethod);
        parcel.writeInt(this.musicStickerPreAdded ? 1 : 0);
        parcel.writeInt(this.musicStickerLastState ? 1 : 0);
        List<LyricStickerModel> list9 = this.lyricStickerModels;
        parcel.writeInt(list9.size());
        Iterator<LyricStickerModel> it10 = list9.iterator();
        while (it10.hasNext()) {
            parcel.writeParcelable(it10.next(), i);
        }
        Boolean bool = this.isQADraft;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<TextStickerModel> list10 = this.textStickerModels;
        parcel.writeInt(list10.size());
        Iterator<TextStickerModel> it11 = list10.iterator();
        while (it11.hasNext()) {
            parcel.writeParcelable(it11.next(), i);
        }
        List<InteractAreaModel> list11 = this.interactStickerStructs;
        parcel.writeInt(list11.size());
        Iterator<InteractAreaModel> it12 = list11.iterator();
        while (it12.hasNext()) {
            parcel.writeParcelable(it12.next(), i);
        }
        List<MemeSongTextStickerModel> list12 = this.memeSongTextStickerModels;
        parcel.writeInt(list12.size());
        Iterator<MemeSongTextStickerModel> it13 = list12.iterator();
        while (it13.hasNext()) {
            parcel.writeParcelable(it13.next(), i);
        }
        List<LocationStickerModel> list13 = this.locationStickerModels;
        parcel.writeInt(list13.size());
        Iterator<LocationStickerModel> it14 = list13.iterator();
        while (it14.hasNext()) {
            parcel.writeParcelable(it14.next(), i);
        }
        List<AICaptionTagStickerModel> list14 = this.aiCaptionTagStickers;
        parcel.writeInt(list14.size());
        Iterator<AICaptionTagStickerModel> it15 = list14.iterator();
        while (it15.hasNext()) {
            parcel.writeParcelable(it15.next(), i);
        }
        List<CommentStickerModel> list15 = this.commentStickerModels;
        parcel.writeInt(list15.size());
        Iterator<CommentStickerModel> it16 = list15.iterator();
        while (it16.hasNext()) {
            parcel.writeParcelable(it16.next(), i);
        }
        parcel.writeStringList(this.aiCaptionShuffleTexts);
        List<TTSModel> list16 = this.aiCaptionShuffleTTSDatas;
        parcel.writeInt(list16.size());
        Iterator<TTSModel> it17 = list16.iterator();
        while (it17.hasNext()) {
            parcel.writeParcelable(it17.next(), i);
        }
        parcel.writeInt(this.aiCaptionShuffleIndex);
        parcel.writeInt(this.isAiCaptionAdded ? 1 : 0);
        MemeSoundMusicParam memeSoundMusicParam = this.memeSoundMusicParam;
        if (memeSoundMusicParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            memeSoundMusicParam.writeToParcel(parcel, i);
        }
        List<InteractiveEmojiStickerModel> list17 = this.interactiveEmojiStickerModels;
        parcel.writeInt(list17.size());
        Iterator<InteractiveEmojiStickerModel> it18 = list17.iterator();
        while (it18.hasNext()) {
            parcel.writeParcelable(it18.next(), i);
        }
        List<EmojiSliderStickerModel> list18 = this.emojiSliderStickerModels;
        parcel.writeInt(list18.size());
        Iterator<EmojiSliderStickerModel> it19 = list18.iterator();
        while (it19.hasNext()) {
            parcel.writeParcelable(it19.next(), i);
        }
        List<LinkStickerModel> list19 = this.linkStickerModels;
        parcel.writeInt(list19.size());
        Iterator<LinkStickerModel> it20 = list19.iterator();
        while (it20.hasNext()) {
            parcel.writeParcelable(it20.next(), i);
        }
        List<LinkAnchorModel> list20 = this.linkStoryAnchorModels;
        parcel.writeInt(list20.size());
        Iterator<LinkAnchorModel> it21 = list20.iterator();
        while (it21.hasNext()) {
            parcel.writeParcelable(it21.next(), i);
        }
        List<SocialAvatarStickerModel> list21 = this.socialAvatarStickerModels;
        parcel.writeInt(list21.size());
        Iterator<SocialAvatarStickerModel> it22 = list21.iterator();
        while (it22.hasNext()) {
            parcel.writeParcelable(it22.next(), i);
        }
        Boolean bool2 = this.textUseNewEngine;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.hasFallbackFontInfo;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        List<PollStickerModel> list22 = this.pollStickers;
        parcel.writeInt(list22.size());
        Iterator<PollStickerModel> it23 = list22.iterator();
        while (it23.hasNext()) {
            parcel.writeParcelable(it23.next(), i);
        }
        List<ArticleStickerModel> list23 = this.articleStickers;
        parcel.writeInt(list23.size());
        Iterator<ArticleStickerModel> it24 = list23.iterator();
        while (it24.hasNext()) {
            parcel.writeParcelable(it24.next(), i);
        }
        List<DonationStickerModel> list24 = this.donationStickers;
        parcel.writeInt(list24.size());
        Iterator<DonationStickerModel> it25 = list24.iterator();
        while (it25.hasNext()) {
            parcel.writeParcelable(it25.next(), i);
        }
        List<MentionStickerModel> list25 = this.dmEoyAYMentionStickerModel;
        parcel.writeInt(list25.size());
        Iterator<MentionStickerModel> it26 = list25.iterator();
        while (it26.hasNext()) {
            parcel.writeParcelable(it26.next(), i);
        }
        parcel.writeInt(this.captionItemBarVisible ? 1 : 0);
        List<SharedCommentStickerModel> list26 = this.sharedCommentStickerModels;
        parcel.writeInt(list26.size());
        Iterator<SharedCommentStickerModel> it27 = list26.iterator();
        while (it27.hasNext()) {
            parcel.writeParcelable(it27.next(), i);
        }
        List<SecretRepliesStickerModel> list27 = this.secretRepliesStickerModel;
        parcel.writeInt(list27.size());
        Iterator<SecretRepliesStickerModel> it28 = list27.iterator();
        while (it28.hasNext()) {
            parcel.writeParcelable(it28.next(), i);
        }
        List<SecretRepliesResponseStickerModel> list28 = this.secretRepliesResponseStickerModel;
        parcel.writeInt(list28.size());
        Iterator<SecretRepliesResponseStickerModel> it29 = list28.iterator();
        while (it29.hasNext()) {
            parcel.writeParcelable(it29.next(), i);
        }
        parcel.writeInt(this.isFromSecretRepliesTryIt ? 1 : 0);
        List<LiveEventStoryStickerModel> list29 = this.liveEventStoryStickerModel;
        parcel.writeInt(list29.size());
        Iterator<LiveEventStoryStickerModel> it30 = list29.iterator();
        while (it30.hasNext()) {
            parcel.writeParcelable(it30.next(), i);
        }
        List<DMGroupChatStickerModel> list30 = this.dmGroupChatStickerModel;
        parcel.writeInt(list30.size());
        Iterator<DMGroupChatStickerModel> it31 = list30.iterator();
        while (it31.hasNext()) {
            parcel.writeParcelable(it31.next(), i);
        }
        Boolean bool4 = this.enableLyricSticker;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.globalLyricToggleState;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.lyricEffectAnchorRemoved ? 1 : 0);
    }

    public final void LIZ() {
        this.musicStickerEnterMethod = "auto_add";
    }

    public StickerNewEngineModel(List<AddYoursStickerModel> list, List<AddYoursStickerExtras> list2, Long l, List<LiveShareStickerModel> list3, boolean z, Integer num, String str, List<LiveCountDownStickerModel> list4, List<LiveEventCountDownStickerModel> list5, List<MentionStickerModel> list6, List<HashTagStickerModel> list7, List<MusicStickerModel> list8, String str2, boolean z2, boolean z3, List<LyricStickerModel> list9, Boolean bool, List<TextStickerModel> list10, List<InteractAreaModel> list11, List<MemeSongTextStickerModel> list12, List<LocationStickerModel> list13, List<AICaptionTagStickerModel> list14, List<CommentStickerModel> list15, List<String> list16, List<TTSModel> list17, int i, boolean z4, MemeSoundMusicParam memeSoundMusicParam, List<InteractiveEmojiStickerModel> list18, List<EmojiSliderStickerModel> list19, List<LinkStickerModel> list20, List<LinkAnchorModel> list21, List<SocialAvatarStickerModel> list22, Boolean bool2, Boolean bool3, List<PollStickerModel> list23, List<ArticleStickerModel> list24, List<DonationStickerModel> list25, List<MentionStickerModel> list26, boolean z5, List<SharedCommentStickerModel> list27, List<SecretRepliesStickerModel> list28, List<SecretRepliesResponseStickerModel> list29, boolean z6, List<LiveEventStoryStickerModel> list30, List<DMGroupChatStickerModel> list31, Boolean bool4, Boolean bool5, boolean z7) {
        this.addYoursStickerModels = list;
        this.addYoursStickerExtras = list2;
        this.tosTimeStampForAyCommend = l;
        this.liveShareStickerModels = list3;
        this.isFromFollowAddYours = z;
        this.trendSource = num;
        this.addYoursEnterFrom = str;
        this.liveCountDownStickerModel = list4;
        this.liveEventCountDownStickerModel = list5;
        this.mentionStickerModel = list6;
        this.hashtagStickerModel = list7;
        this.musicStickerModels = list8;
        this.musicStickerEnterMethod = str2;
        this.musicStickerPreAdded = z2;
        this.musicStickerLastState = z3;
        this.lyricStickerModels = list9;
        this.isQADraft = bool;
        this.textStickerModels = list10;
        this.interactStickerStructs = list11;
        this.memeSongTextStickerModels = list12;
        this.locationStickerModels = list13;
        this.aiCaptionTagStickers = list14;
        this.commentStickerModels = list15;
        this.aiCaptionShuffleTexts = list16;
        this.aiCaptionShuffleTTSDatas = list17;
        this.aiCaptionShuffleIndex = i;
        this.isAiCaptionAdded = z4;
        this.memeSoundMusicParam = memeSoundMusicParam;
        this.interactiveEmojiStickerModels = list18;
        this.emojiSliderStickerModels = list19;
        this.linkStickerModels = list20;
        this.linkStoryAnchorModels = list21;
        this.socialAvatarStickerModels = list22;
        this.textUseNewEngine = bool2;
        this.hasFallbackFontInfo = bool3;
        this.pollStickers = list23;
        this.articleStickers = list24;
        this.donationStickers = list25;
        this.dmEoyAYMentionStickerModel = list26;
        this.captionItemBarVisible = z5;
        this.sharedCommentStickerModels = list27;
        this.secretRepliesStickerModel = list28;
        this.secretRepliesResponseStickerModel = list29;
        this.isFromSecretRepliesTryIt = z6;
        this.liveEventStoryStickerModel = list30;
        this.dmGroupChatStickerModel = list31;
        this.enableLyricSticker = bool4;
        this.globalLyricToggleState = bool5;
        this.lyricEffectAnchorRemoved = z7;
    }

    public StickerNewEngineModel(List list, List list2, Long l, List list3, boolean z, Integer num, String str, List list4, List list5, List list6, List list7, List list8, String str2, boolean z2, boolean z3, List list9, Boolean bool, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, int i, boolean z4, MemeSoundMusicParam memeSoundMusicParam, List list18, List list19, List list20, List list21, List list22, Boolean bool2, Boolean bool3, List list23, List list24, List list25, List list26, boolean z5, List list27, List list28, List list29, boolean z6, List list30, List list31, Boolean bool4, Boolean bool5, boolean z7, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? new ArrayList() : list2, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? new ArrayList() : list3, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? "" : str, (i2 & 128) != 0 ? new ArrayList() : list4, (i2 & 256) != 0 ? new ArrayList() : list5, (i2 & 512) != 0 ? new ArrayList() : list6, (i2 & 1024) != 0 ? new ArrayList() : list7, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new ArrayList() : list8, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str2 : "", (i2 & 8192) != 0 ? false : z2, (i2 & 16384) != 0 ? false : z3, (i2 & 32768) != 0 ? new ArrayList() : list9, (i2 & 65536) != 0 ? null : bool, (131072 & i2) != 0 ? new ArrayList() : list10, (262144 & i2) != 0 ? new ArrayList() : list11, (524288 & i2) != 0 ? new ArrayList() : list12, (1048576 & i2) != 0 ? new ArrayList() : list13, (2097152 & i2) != 0 ? new ArrayList() : list14, (4194304 & i2) != 0 ? new ArrayList() : list15, (8388608 & i2) != 0 ? C13BV.INSTANCE : list16, (16777216 & i2) != 0 ? C13BV.INSTANCE : list17, (33554432 & i2) != 0 ? 0 : i, (67108864 & i2) != 0 ? false : z4, (134217728 & i2) != 0 ? null : memeSoundMusicParam, (268435456 & i2) != 0 ? new ArrayList() : list18, (536870912 & i2) != 0 ? new ArrayList() : list19, (1073741824 & i2) != 0 ? new ArrayList() : list20, (i2 & Integer.MIN_VALUE) != 0 ? new ArrayList() : list21, (i3 & 1) != 0 ? new ArrayList() : list22, (i3 & 2) != 0 ? null : bool2, (i3 & 4) != 0 ? null : bool3, (i3 & 8) != 0 ? new ArrayList() : list23, (i3 & 16) != 0 ? new ArrayList() : list24, (i3 & 32) != 0 ? new ArrayList() : list25, (i3 & 64) != 0 ? new ArrayList() : list26, (i3 & 128) != 0 ? false : z5, (i3 & 256) != 0 ? new ArrayList() : list27, (i3 & 512) != 0 ? new ArrayList() : list28, (i3 & 1024) != 0 ? new ArrayList() : list29, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z6, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new ArrayList() : list30, (i3 & 8192) != 0 ? new ArrayList() : list31, (i3 & 16384) != 0 ? null : bool4, (i3 & 32768) != 0 ? null : bool5, (i3 & 65536) != 0 ? false : z7);
    }
}
