package com.ss.android.ugc.aweme.im.strategy.commonresource;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: loaded from: classes7.dex */
public final class LightInteractionStickerSetMessage {

    @C09CT("a_src")
    public final String aSrc;

    @C09CT("creator_avatar_thumb")
    public final String creatorAvatarThumb;

    @C09CT("creator_nick_name")
    public final String creatorNickName;

    @C09CT("creator_user_id")
    public final String creatorUserId;

    @C09CT("height")
    public final Integer height;

    @C09CT("origin_video_id")
    public final String originVideoId;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("static_url")
    public final String staticUrl;

    @C09CT("sticker_id")
    public final String stickerId;

    @C09CT("sticker_set_id")
    public final String stickerSetId;

    @C09CT("sticker_type")
    public final Integer stickerType;

    @C09CT("sticker_uri")
    public final String stickerUri;

    @C09CT("sticker_url")
    public final String stickerUrl;

    @C09CT("width")
    public final Integer width;

    public LightInteractionStickerSetMessage() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final int hashCode() {
        String str = this.stickerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stickerSetId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originVideoId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.stickerType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.creatorUserId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stickerUrl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.stickerUri;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.staticUrl;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.scene;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.creatorNickName;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.creatorAvatarThumb;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num2 = this.width;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.height;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str11 = this.aSrc;
        return iHashCode13 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        return "LightInteractionStickerSetMessage(stickerId=" + this.stickerId + ", stickerSetId=" + this.stickerSetId + ", originVideoId=" + this.originVideoId + ", stickerType=" + this.stickerType + ", creatorUserId=" + this.creatorUserId + ", stickerUrl=" + this.stickerUrl + ", stickerUri=" + this.stickerUri + ", staticUrl=" + this.staticUrl + ", scene=" + this.scene + ", creatorNickName=" + this.creatorNickName + ", creatorAvatarThumb=" + this.creatorAvatarThumb + ", width=" + this.width + ", height=" + this.height + ", aSrc=" + this.aSrc + ')';
    }

    public static LightInteractionStickerSetMessage LIZ(LightInteractionStickerSetMessage lightInteractionStickerSetMessage, String str, String str2, int i) {
        String str3;
        String str4;
        String str5;
        Integer num;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Integer num2;
        String str12 = str2;
        String str13 = str;
        Integer num3 = null;
        if ((i & 1) != 0) {
            str3 = lightInteractionStickerSetMessage.stickerId;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str4 = lightInteractionStickerSetMessage.stickerSetId;
        } else {
            str4 = null;
        }
        if ((i & 4) != 0) {
            str5 = lightInteractionStickerSetMessage.originVideoId;
        } else {
            str5 = null;
        }
        if ((i & 8) != 0) {
            num = lightInteractionStickerSetMessage.stickerType;
        } else {
            num = null;
        }
        if ((i & 16) != 0) {
            str6 = lightInteractionStickerSetMessage.creatorUserId;
        } else {
            str6 = null;
        }
        if ((i & 32) != 0) {
            str13 = lightInteractionStickerSetMessage.stickerUrl;
        }
        if ((i & 64) != 0) {
            str7 = lightInteractionStickerSetMessage.stickerUri;
        } else {
            str7 = null;
        }
        if ((i & 128) != 0) {
            str8 = lightInteractionStickerSetMessage.staticUrl;
        } else {
            str8 = null;
        }
        if ((i & 256) != 0) {
            str9 = lightInteractionStickerSetMessage.scene;
        } else {
            str9 = null;
        }
        if ((i & 512) != 0) {
            str10 = lightInteractionStickerSetMessage.creatorNickName;
        } else {
            str10 = null;
        }
        if ((i & 1024) != 0) {
            str11 = lightInteractionStickerSetMessage.creatorAvatarThumb;
        } else {
            str11 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num2 = lightInteractionStickerSetMessage.width;
        } else {
            num2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num3 = lightInteractionStickerSetMessage.height;
        }
        if ((i & 8192) != 0) {
            str12 = lightInteractionStickerSetMessage.aSrc;
        }
        lightInteractionStickerSetMessage.getClass();
        return new LightInteractionStickerSetMessage(str3, str4, str5, num, str6, str13, str7, str8, str9, str10, str11, num2, num3, str12);
    }

    public LightInteractionStickerSetMessage(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num2, Integer num3, String str11) {
        this.stickerId = str;
        this.stickerSetId = str2;
        this.originVideoId = str3;
        this.stickerType = num;
        this.creatorUserId = str4;
        this.stickerUrl = str5;
        this.stickerUri = str6;
        this.staticUrl = str7;
        this.scene = str8;
        this.creatorNickName = str9;
        this.creatorAvatarThumb = str10;
        this.width = num2;
        this.height = num3;
        this.aSrc = str11;
    }
}
