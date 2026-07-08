package com.ss.android.ugc.aweme.editSticker.model;

import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import X.C268470Afd;
import X.C391580FWy;
import X.InterfaceC2270908v5;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class StickerItemModel implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<StickerItemModel> CREATOR = new C391580FWy(2);

    @C09CT("is_editorpro_adjust_text_color")
    public String adjustTextColorInEditorPro;

    @C09CT("is_editorpro_adjust_text_font")
    public String adjustTextFontInEditorPro;

    @C09CT("is_editorpro_adjust_text_paragraph")
    public String adjustTextParagraph;

    @C09CT("is_editorpro_adjust_text_position")
    public String adjustTextPositionInEditorPro;

    @C09CT("is_editorpro_adjust_text_style")
    public String adjustTextStyleInEditorPro;

    @C09CT("aigc_info")
    public AIGCInfo aigcInfo;

    @C09CT("challenge_id_loki")
    public String challengeIdLoki;

    @C09CT("current_offsetX")
    public float currentOffsetX;

    @C09CT("current_offsetY")
    public float currentOffsetY;

    @C09CT("cutout")
    public boolean cutout;

    @C09CT("deletable")
    public boolean deletable;
    public DrawRect drawRect;

    @C09CT("editorpro_tts_tone_id")
    public String editorProTTSID;

    @C09CT("enable_pan")
    public boolean enablePan;

    @C09CT("enable_rotate")
    public boolean enableRotate;

    @C09CT("enable_scale")
    public boolean enableScale;

    @C09CT("end_time")
    public int endTime;

    @C09CT("extra")
    public String extra;

    @C09CT("extra2")
    public String extra2;

    @C09CT("extra3")
    public String extra3;
    public transient boolean fromSearch;

    @C09CT("h")
    public float h;
    public int id;

    @C09CT("in_duration")
    public int inDuration;

    @C09CT("in_path")
    public String inPath;

    @C09CT("in_sticker_id")
    public String inStickerId;

    @C09CT("info_sticker_subtype")
    public int infoStickerSubtype;

    @C09CT("init_height")
    public float initHeight;

    @C09CT("init_width")
    public float initWidth;

    @C09CT("is_add_veeditor_success")
    public boolean isAddVEEditorSuccess;

    @C09CT("isAnimate")
    public boolean isAnimate;

    @C09CT("is_animation_loop")
    public boolean isAnimationLoop;

    @C09CT("is_attribution_link")
    public boolean isAttributionLink;

    @C09CT("is_dynamic")
    public boolean isDynamicSticker;

    @C09CT("is_editorpro_caption")
    public String isEditorProCaption;

    @C09CT("is_editorpro_copy_text")
    public String isEditorProCopyText;

    @C09CT("is_editorpro_tts")
    public String isEditorProTTS;

    @C09CT("is_editorpro_text")
    public String isEditorProText;

    @C09CT("is_editorpro_trim_text_length")
    public String isEditorProTrimLength;

    @C09CT("is_enable_interaction")
    public boolean isEnableInteraction;

    @C09CT("is_from_editor_pro")
    public boolean isFromEditorPro;

    @C09CT("is_from_pugc_template")
    public boolean isFromPugcTemlate;
    public boolean isImageStickerLayer;

    @C09CT("is_pin")
    public boolean isPin;

    @C09CT("layer_weight")
    public int layerWeight;

    @C09CT("max_scale")
    public float maxScale;

    @C09CT("min_scale")
    public float minScale;

    @C09CT("normalized_height")
    public float normalizedHeight;

    @C09CT("normalized_width")
    public float normalizedWidth;
    public int originalEndTime;
    public int originalStartTime;

    @C09CT("out_duration")
    public int outDuration;

    @C09CT("out_path")
    public String outPath;

    @C09CT("panel")
    public String panel;

    @InterfaceC2270908v5
    @C09CT("path")
    @C0MY0
    public String path;

    @C09CT("from_photo_mode_share_to_story")
    public float photoModeShareToStoryRatio;

    @C09CT("pin_algorithm_file")
    @C0MY0
    public String pinAlgorithmFile;

    @C09CT("pin_algorithm_mapping_file")
    @C0MY0
    public String pinAlgorithmMappingFile;

    @C09CT("provider_effect")
    public String providerEffect;

    @C09CT("ratio")
    public float ratio;

    @C09CT("res_id")
    public String resId;

    @C09CT("angle")
    public float rotateAngle;

    @C09CT("scale")
    public float scale;

    @C09CT("start_time")
    public int startTime;

    @C09CT("stickerDrawScale")
    public float stickerDrawScale;

    @C09CT("sticker_id")
    public String stickerId;

    @C09CT("mob_params")
    public StickerMobParams stickerMobParams;

    @C09CT("sticker_source")
    public String stickerSource;

    @C09CT("tab_id")
    public String tabId;
    public int type;

    @C09CT("ui_end_time")
    public int uiEndTime;

    @C09CT("ui_start_time")
    public int uiStartTime;

    @C09CT("utf8_code")
    public String utf8Code;

    @C09CT("uuid")
    public String uuid;
    public transient int viewHash;

    @C09CT("w")
    public float w;

    @C09CT("x")
    public float x;

    @C09CT("y")
    public float y;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StickerItemModel dumpClonedData() {
        StickerItemModel stickerItemModel = new StickerItemModel(this.stickerId, this.path, this.extra, this.layerWeight, this.isAnimate, this.startTime, this.endTime, this.type);
        stickerItemModel.id = this.id;
        stickerItemModel.scale = this.scale;
        stickerItemModel.maxScale = this.maxScale;
        stickerItemModel.minScale = this.minScale;
        stickerItemModel.rotateAngle = this.rotateAngle;
        stickerItemModel.initHeight = this.initHeight;
        stickerItemModel.initWidth = this.initWidth;
        stickerItemModel.currentOffsetX = this.currentOffsetX;
        stickerItemModel.currentOffsetY = this.currentOffsetY;
        stickerItemModel.isAnimate = this.isAnimate;
        stickerItemModel.isImageStickerLayer = this.isImageStickerLayer;
        stickerItemModel.pinAlgorithmFile = this.pinAlgorithmFile;
        stickerItemModel.isPin = this.isPin;
        stickerItemModel.x = this.x;
        stickerItemModel.y = this.y;
        stickerItemModel.w = this.w;
        stickerItemModel.h = this.h;
        stickerItemModel.isAnimationLoop = this.isAnimationLoop;
        stickerItemModel.inStickerId = this.inStickerId;
        stickerItemModel.inPath = this.inPath;
        stickerItemModel.inDuration = this.inDuration;
        stickerItemModel.outPath = this.outPath;
        stickerItemModel.outDuration = this.outDuration;
        stickerItemModel.ratio = this.ratio;
        stickerItemModel.stickerMobParams = this.stickerMobParams;
        stickerItemModel.adjustTextStyleInEditorPro = this.adjustTextStyleInEditorPro;
        stickerItemModel.adjustTextParagraph = this.adjustTextParagraph;
        stickerItemModel.adjustTextFontInEditorPro = this.adjustTextFontInEditorPro;
        stickerItemModel.adjustTextColorInEditorPro = this.adjustTextColorInEditorPro;
        stickerItemModel.adjustTextPositionInEditorPro = this.adjustTextPositionInEditorPro;
        stickerItemModel.isEditorProTrimLength = this.isEditorProTrimLength;
        stickerItemModel.isEditorProText = this.isEditorProText;
        stickerItemModel.isEditorProCopyText = this.isEditorProCopyText;
        stickerItemModel.isEditorProTTS = this.isEditorProTTS;
        stickerItemModel.editorProTTSID = this.editorProTTSID;
        stickerItemModel.isEditorProCaption = this.isEditorProCaption;
        stickerItemModel.isDynamicSticker = this.isDynamicSticker;
        stickerItemModel.drawRect = this.drawRect;
        stickerItemModel.providerEffect = this.providerEffect;
        stickerItemModel.resId = this.resId;
        stickerItemModel.panel = this.panel;
        stickerItemModel.isFromEditorPro = this.isFromEditorPro;
        stickerItemModel.utf8Code = this.utf8Code;
        stickerItemModel.photoModeShareToStoryRatio = this.photoModeShareToStoryRatio;
        stickerItemModel.isFromPugcTemlate = this.isFromPugcTemlate;
        stickerItemModel.isAttributionLink = this.isAttributionLink;
        return stickerItemModel;
    }

    public RectF getDrawRect() {
        DrawRect drawRect = this.drawRect;
        if (drawRect == null) {
            return null;
        }
        DrawRect.Companion.getClass();
        return new RectF(drawRect.getLeft(), drawRect.getTop(), drawRect.getRight(), drawRect.getBottom());
    }

    public boolean isAnimTimestampSticker() {
        return this.type == 14;
    }

    public Boolean isFromPugcTemplate() {
        return Boolean.valueOf(this.isFromPugcTemlate);
    }

    public boolean isImageSticker() {
        int i = this.type;
        return i == 11 || i == 25;
    }

    public boolean isLocalHashTagSticker() {
        return this.type == 13;
    }

    public boolean isLyric() {
        int i = this.type;
        return i == 3 || i == 17;
    }

    public boolean isMagnifier() {
        return "MagnifierSticker".equals(this.extra);
    }

    public boolean isMemeSongSticker() {
        int i = this.type;
        return i == 50 || i == 51;
    }

    public boolean isMusicShareToStorySticker() {
        return this.type == 27;
    }

    public boolean isNormalInfoSticker() {
        return this.type == 0;
    }

    public boolean isNormalTextSticker() {
        return this.type == 2;
    }

    public boolean isNowSmallWindowSticker() {
        return this.type == 25;
    }

    public boolean isStoryStreakGifSticker() {
        return this.type == 33;
    }

    public boolean isStoryStreakInfoSticker() {
        return this.type == 34;
    }

    public boolean isSubtitle() {
        return "subtitle".equals(this.extra) || this.type == 5;
    }

    public boolean isSubtitleRule() {
        return "subtitle_rule".equals(this.extra);
    }

    public boolean isTextSticker() {
        int i = this.type;
        return i == 2 || i == 20;
    }

    public boolean isTextTemplateSticker() {
        return this.type == 23;
    }

    public StickerItemModel() {
        this.scale = 1.0f;
        this.stickerDrawScale = 1.0f;
        this.currentOffsetX = 0.5f;
        this.currentOffsetY = 0.5f;
        this.tabId = "";
        this.w = 1.0f;
        this.h = 1.0f;
        this.ratio = 1.0f;
        this.deletable = true;
        this.isEnableInteraction = true;
        this.normalizedWidth = -1.0f;
        this.normalizedHeight = -1.0f;
        this.adjustTextStyleInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextParagraph = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextFontInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextColorInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextPositionInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProTrimLength = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProText = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProCopyText = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProTTS = CardStruct.IStatusCode.DEFAULT;
        this.editorProTTSID = "";
        this.isEditorProCaption = CardStruct.IStatusCode.DEFAULT;
        this.providerEffect = "";
        this.enableRotate = true;
        this.enableScale = true;
        this.enablePan = true;
        this.photoModeShareToStoryRatio = -1.0f;
        this.drawRect = new DrawRect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final StickerItemModel clone() {
        try {
            return (StickerItemModel) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public int hashCode() {
        int id = getId() * 31;
        String str = this.stickerId;
        int iHashCode = (id + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.path;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.extra;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerItemModel{id=");
        sbLIZ.append(getId());
        sbLIZ.append(", stickerId='");
        sbLIZ.append(this.stickerId);
        sbLIZ.append('\'');
        sbLIZ.append(", path='");
        sbLIZ.append(this.path);
        sbLIZ.append('\'');
        sbLIZ.append(", extra='");
        sbLIZ.append(this.extra);
        sbLIZ.append('\'');
        sbLIZ.append(", scale=");
        sbLIZ.append(this.scale);
        sbLIZ.append(", rotateAngle=");
        sbLIZ.append(this.rotateAngle);
        sbLIZ.append(", layerWeight=");
        sbLIZ.append(this.layerWeight);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", initWidth=");
        sbLIZ.append(this.initWidth);
        sbLIZ.append(", initHeight=");
        sbLIZ.append(this.initHeight);
        sbLIZ.append(", currentOffsetX=");
        sbLIZ.append(this.currentOffsetX);
        sbLIZ.append(", currentOffsetY=");
        sbLIZ.append(this.currentOffsetY);
        sbLIZ.append(", normalizedWidth=");
        sbLIZ.append(this.normalizedWidth);
        sbLIZ.append(", normalizedHeight=");
        sbLIZ.append(this.normalizedHeight);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getId() {
        return this.id;
    }

    public boolean getIsAttributionLink() {
        return this.isAttributionLink;
    }

    public int getOriginalEndTime() {
        return this.originalEndTime;
    }

    public int getOriginalStartTime() {
        return this.originalStartTime;
    }

    public String getPinAlgorithmFile() {
        return this.pinAlgorithmFile;
    }

    public String getText() {
        return this.path;
    }

    public boolean isFromEditorPro() {
        return this.isFromEditorPro;
    }

    public boolean isFromSearch() {
        return this.fromSearch;
    }

    public boolean isPin() {
        return this.isPin;
    }

    public StickerItemModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        this.scale = 1.0f;
        this.stickerDrawScale = 1.0f;
        this.currentOffsetX = 0.5f;
        this.currentOffsetY = 0.5f;
        this.tabId = "";
        this.w = 1.0f;
        this.h = 1.0f;
        this.ratio = 1.0f;
        this.deletable = true;
        this.isEnableInteraction = true;
        this.normalizedWidth = -1.0f;
        this.normalizedHeight = -1.0f;
        this.adjustTextStyleInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextParagraph = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextFontInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextColorInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextPositionInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProTrimLength = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProText = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProCopyText = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProTTS = CardStruct.IStatusCode.DEFAULT;
        this.editorProTTSID = "";
        this.isEditorProCaption = CardStruct.IStatusCode.DEFAULT;
        this.providerEffect = "";
        this.enableRotate = true;
        this.enableScale = true;
        this.enablePan = true;
        this.photoModeShareToStoryRatio = -1.0f;
        this.drawRect = new DrawRect(0.0f, 0.0f, 0.0f, 0.0f);
        this.stickerId = parcel.readString();
        this.path = parcel.readString();
        this.extra = parcel.readString();
        this.extra2 = parcel.readString();
        this.extra3 = parcel.readString();
        this.scale = parcel.readFloat();
        this.stickerDrawScale = parcel.readFloat();
        this.rotateAngle = parcel.readFloat();
        this.layerWeight = parcel.readInt();
        this.startTime = parcel.readInt();
        this.endTime = parcel.readInt();
        this.uiStartTime = parcel.readInt();
        this.uiEndTime = parcel.readInt();
        this.initWidth = parcel.readFloat();
        this.initHeight = parcel.readFloat();
        this.currentOffsetX = parcel.readFloat();
        this.currentOffsetY = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isAnimate = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isImageStickerLayer = z2;
        this.type = parcel.readInt();
        this.pinAlgorithmFile = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isPin = z3;
        this.tabId = parcel.readString();
        this.x = parcel.readFloat();
        this.y = parcel.readFloat();
        this.w = parcel.readFloat();
        this.h = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.cutout = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.deletable = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.isEnableInteraction = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.isAnimationLoop = z7;
        this.inStickerId = parcel.readString();
        this.inPath = parcel.readString();
        this.inDuration = parcel.readInt();
        this.outPath = parcel.readString();
        this.outDuration = parcel.readInt();
        this.normalizedWidth = parcel.readFloat();
        this.normalizedHeight = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.isAddVEEditorSuccess = z8;
        this.uuid = parcel.readString();
        this.maxScale = parcel.readFloat();
        this.minScale = parcel.readFloat();
        this.ratio = parcel.readFloat();
        this.stickerMobParams = (StickerMobParams) parcel.readParcelable(getClass().getClassLoader());
        this.adjustTextStyleInEditorPro = parcel.readString();
        this.adjustTextParagraph = parcel.readString();
        this.adjustTextFontInEditorPro = parcel.readString();
        this.adjustTextColorInEditorPro = parcel.readString();
        this.adjustTextPositionInEditorPro = parcel.readString();
        this.isEditorProTrimLength = parcel.readString();
        this.isEditorProText = parcel.readString();
        this.isEditorProCopyText = parcel.readString();
        this.isEditorProTTS = parcel.readString();
        this.editorProTTSID = parcel.readString();
        this.isEditorProCaption = parcel.readString();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.isDynamicSticker = z9;
        this.stickerSource = parcel.readString();
        this.infoStickerSubtype = parcel.readInt();
        this.drawRect = (DrawRect) parcel.readParcelable(DrawRect.class.getClassLoader());
        this.providerEffect = parcel.readString();
        this.resId = parcel.readString();
        this.panel = parcel.readString();
        this.aigcInfo = (AIGCInfo) parcel.readParcelable(AIGCInfo.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.isFromEditorPro = z10;
        this.utf8Code = parcel.readString();
        this.photoModeShareToStoryRatio = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.isFromPugcTemlate = z11;
        this.isAttributionLink = parcel.readByte() != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerItemModel)) {
            return false;
        }
        StickerItemModel stickerItemModel = (StickerItemModel) obj;
        if (!TextUtils.isEmpty(this.uuid) && (getId() != 0 || ((Boolean) C268470Afd.LIZ.getValue()).booleanValue())) {
            if (!TextUtils.equals(this.uuid, stickerItemModel.uuid)) {
                return false;
            }
        } else if (getId() != stickerItemModel.getId()) {
            return false;
        }
        String str = this.path;
        if (str != null && !str.equals(stickerItemModel.path)) {
            return false;
        }
        String str2 = this.stickerId;
        if (str2 != null && !str2.equals(stickerItemModel.stickerId)) {
            return false;
        }
        String str3 = this.extra;
        String str4 = stickerItemModel.extra;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    public void setDrawRect(RectF rectF) {
        DrawRect.Companion.getClass();
        this.drawRect = new DrawRect(rectF.left, rectF.bottom, rectF.right, rectF.top);
    }

    public void setFromEditorPro(boolean z) {
        this.isFromEditorPro = z;
    }

    public void setFromPugcTemplate(boolean z) {
        this.isFromPugcTemlate = z;
    }

    public void setFromSearch(boolean z) {
        this.fromSearch = z;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setIsAttributionLink(boolean z) {
        this.isAttributionLink = z;
    }

    public void setOriginalEndTime(int i) {
        this.originalEndTime = i;
    }

    public void setOriginalStartTime(int i) {
        this.originalStartTime = i;
    }

    public void setPin(boolean z) {
        this.isPin = z;
    }

    public void setPinAlgorithmFile(String str) {
        this.pinAlgorithmFile = str;
    }

    public void updateLayerWeight(int i) {
        this.layerWeight = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.stickerId);
        parcel.writeString(this.path);
        parcel.writeString(this.extra);
        parcel.writeString(this.extra2);
        parcel.writeString(this.extra3);
        parcel.writeFloat(this.scale);
        parcel.writeFloat(this.stickerDrawScale);
        parcel.writeFloat(this.rotateAngle);
        parcel.writeInt(this.layerWeight);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeInt(this.uiStartTime);
        parcel.writeInt(this.uiEndTime);
        parcel.writeFloat(this.initWidth);
        parcel.writeFloat(this.initHeight);
        parcel.writeFloat(this.currentOffsetX);
        parcel.writeFloat(this.currentOffsetY);
        parcel.writeByte(this.isAnimate ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isImageStickerLayer ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.type);
        parcel.writeString(this.pinAlgorithmFile);
        parcel.writeByte(this.isPin ? (byte) 1 : (byte) 0);
        parcel.writeString(this.tabId);
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.w);
        parcel.writeFloat(this.h);
        parcel.writeByte(this.cutout ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.deletable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isEnableInteraction ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isAnimationLoop ? (byte) 1 : (byte) 0);
        parcel.writeString(this.inStickerId);
        parcel.writeString(this.inPath);
        parcel.writeInt(this.inDuration);
        parcel.writeString(this.outPath);
        parcel.writeInt(this.outDuration);
        parcel.writeFloat(this.normalizedWidth);
        parcel.writeFloat(this.normalizedHeight);
        parcel.writeByte(this.isAddVEEditorSuccess ? (byte) 1 : (byte) 0);
        parcel.writeString(this.uuid);
        parcel.writeFloat(this.maxScale);
        parcel.writeFloat(this.minScale);
        parcel.writeFloat(this.ratio);
        parcel.writeParcelable(this.stickerMobParams, i);
        parcel.writeString(this.adjustTextStyleInEditorPro);
        parcel.writeString(this.adjustTextParagraph);
        parcel.writeString(this.adjustTextFontInEditorPro);
        parcel.writeString(this.adjustTextColorInEditorPro);
        parcel.writeString(this.adjustTextPositionInEditorPro);
        parcel.writeString(this.isEditorProTrimLength);
        parcel.writeString(this.isEditorProText);
        parcel.writeString(this.isEditorProCopyText);
        parcel.writeString(this.isEditorProTTS);
        parcel.writeString(this.editorProTTSID);
        parcel.writeString(this.isEditorProCaption);
        parcel.writeByte(this.isDynamicSticker ? (byte) 1 : (byte) 0);
        parcel.writeString(this.stickerSource);
        parcel.writeInt(this.infoStickerSubtype);
        parcel.writeParcelable(this.drawRect, i);
        parcel.writeString(this.providerEffect);
        parcel.writeString(this.resId);
        parcel.writeString(this.panel);
        parcel.writeParcelable(this.aigcInfo, i);
        parcel.writeByte(this.isFromEditorPro ? (byte) 1 : (byte) 0);
        parcel.writeString(this.utf8Code);
        parcel.writeFloat(this.photoModeShareToStoryRatio);
        parcel.writeByte(this.isFromPugcTemlate ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isAttributionLink ? (byte) 1 : (byte) 0);
    }

    public StickerItemModel(String str, String str2, String str3, int i, boolean z, int i2, int i3, int i4) {
        this.scale = 1.0f;
        this.stickerDrawScale = 1.0f;
        this.currentOffsetX = 0.5f;
        this.currentOffsetY = 0.5f;
        this.tabId = "";
        this.w = 1.0f;
        this.h = 1.0f;
        this.ratio = 1.0f;
        this.deletable = true;
        this.isEnableInteraction = true;
        this.normalizedWidth = -1.0f;
        this.normalizedHeight = -1.0f;
        this.adjustTextStyleInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextParagraph = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextFontInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextColorInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextPositionInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProTrimLength = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProText = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProCopyText = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProTTS = CardStruct.IStatusCode.DEFAULT;
        this.editorProTTSID = "";
        this.isEditorProCaption = CardStruct.IStatusCode.DEFAULT;
        this.providerEffect = "";
        this.enableRotate = true;
        this.enableScale = true;
        this.enablePan = true;
        this.photoModeShareToStoryRatio = -1.0f;
        this.drawRect = new DrawRect(0.0f, 0.0f, 0.0f, 0.0f);
        this.stickerId = str;
        this.path = str2;
        this.extra = str3;
        this.layerWeight = i;
        this.isAnimate = z;
        this.startTime = i2;
        this.endTime = i3;
        this.type = i4;
    }
}
