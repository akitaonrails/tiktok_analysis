package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C09CT;
import X.C0FI2;
import X.C0MY0;
import X.C123P;
import X.C13BV;
import X.C1697810uHb;
import X.C1919207fS;
import X.C1954807lC;
import X.C2188811AlT;
import X.C390570FTb;
import X.EnumC390580FTc;
import X.InterfaceC1294060jmO;
import X.InterfaceC384940F7k;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerCoverExtraData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.ss.android.ugc.aweme.sticker.data.Word;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CustomCaptionTemplateData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSAudioBean;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextEventTrackingModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextStickerData implements Parcelable, Cloneable, InterfaceC384940F7k {
    public static final Parcelable.Creator<TextStickerData> CREATOR = new Parcelable.Creator<TextStickerData>() { // from class: X.0F7V
        @Override // android.os.Parcelable.Creator
        public final TextStickerData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            InnerEffectTextLayoutConfig innerEffectTextLayoutConfigCreateFromParcel;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            ArrayList arrayList;
            boolean z18;
            boolean z19;
            boolean z20;
            boolean z21;
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            String string2 = parcel.readString();
            Point point = (Point) parcel.readParcelable(TextStickerData.class.getClassLoader());
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i8);
            for (int i9 = 0; i9 != i8; i9++) {
                arrayList2.add(parcel.readSerializable());
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i10 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList3.add(parcel.readSerializable());
            }
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            long j3 = parcel.readLong();
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
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            TextStickerData.Pair pair = (TextStickerData.Pair) parcel.readSerializable();
            EnumC390580FTc enumC390580FTcValueOf = EnumC390580FTc.valueOf(parcel.readString());
            float f3 = parcel.readFloat();
            float f4 = parcel.readFloat();
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
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int i12 = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i13 = parcel.readInt();
            String string8 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i14 = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            TextStickerTextWrap textStickerTextWrapCreateFromParcel = TextStickerTextWrap.CREATOR.createFromParcel(parcel);
            int i15 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList4.add(TextStickerTextWrap.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                innerEffectTextLayoutConfigCreateFromParcel = null;
            } else {
                innerEffectTextLayoutConfigCreateFromParcel = InnerEffectTextLayoutConfig.CREATOR.createFromParcel(parcel);
            }
            InnerEffectTextLayoutConfig innerEffectTextLayoutConfig = innerEffectTextLayoutConfigCreateFromParcel;
            TextStickerCoverExtraData textStickerCoverExtraDataCreateFromParcel = TextStickerCoverExtraData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            TextMotionModel textMotionModel = (TextMotionModel) parcel.readParcelable(TextStickerData.class.getClassLoader());
            float f5 = parcel.readFloat();
            float f6 = parcel.readFloat();
            int i17 = parcel.readInt();
            int i18 = parcel.readInt();
            int i19 = parcel.readInt();
            int i20 = parcel.readInt();
            float f7 = parcel.readFloat();
            TTSVoiceModel tTSVoiceModel = (TTSVoiceModel) parcel.readParcelable(TextStickerData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            String string23 = parcel.readString();
            long j4 = parcel.readLong();
            long j5 = parcel.readLong();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            String string34 = parcel.readString();
            int i21 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i21);
            for (int i22 = 0; i22 != i21; i22++) {
                arrayList5.add(parcel.readParcelable(TextStickerData.class.getClassLoader()));
            }
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
            if (parcel.readInt() != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            int i23 = parcel.readInt();
            int i24 = parcel.readInt();
            TTSAudioBean tTSAudioBean = (TTSAudioBean) parcel.readParcelable(TextStickerData.class.getClassLoader());
            int i25 = parcel.readInt();
            int i26 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i26);
            for (int i27 = 0; i27 != i26; i27++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            TextStickerInfo textStickerInfo = (TextStickerInfo) parcel.readSerializable();
            TextStyleModel textStyleModel = (TextStyleModel) parcel.readParcelable(TextStickerData.class.getClassLoader());
            CaptionTemplateModel captionTemplateModel = (CaptionTemplateModel) parcel.readParcelable(TextStickerData.class.getClassLoader());
            TextEventTrackingModel textEventTrackingModel = (TextEventTrackingModel) parcel.readParcelable(TextStickerData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (parcel.readInt() != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            String string35 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i28 = parcel.readInt();
                arrayList = new ArrayList(i28);
                for (int i29 = 0; i29 != i28; i29++) {
                    arrayList.add(Float.valueOf(parcel.readFloat()));
                }
            }
            if (parcel.readInt() != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (parcel.readInt() != 0) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (parcel.readInt() != 0) {
                z20 = true;
            } else {
                z20 = false;
            }
            if (parcel.readInt() != 0) {
                z21 = true;
            } else {
                z21 = false;
            }
            return new TextStickerData(string, i, i2, i3, string2, point, i4, i5, i6, i7, arrayList2, string3, z, arrayList3, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTcValueOf, f3, f4, z5, z6, z7, i12, string4, string5, string6, string7, i13, string8, arrayListCreateStringArrayList, i14, strArrCreateStringArray, textStickerTextWrapCreateFromParcel, arrayList4, innerEffectTextLayoutConfig, textStickerCoverExtraDataCreateFromParcel, z8, z9, string9, string10, string11, string12, string13, string14, string15, textMotionModel, f5, f6, i17, i18, i19, i20, f7, tTSVoiceModel, z10, string16, string17, string18, string19, string20, string21, string22, z11, string23, j4, j5, arrayListCreateStringArrayList2, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, arrayList5, z12, z13, z14, z15, i23, i24, tTSAudioBean, i25, linkedHashMap, textStickerInfo, textStyleModel, captionTemplateModel, textEventTrackingModel, z16, z17, string35, arrayList, z18, z19, z20, z21, (TextStickerCompatModel) parcel.readParcelable(TextStickerData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerData[] newArray(int i) {
            return new TextStickerData[i];
        }
    };

    @C09CT("font_type")
    public String _fontType;
    public boolean addToLayout;
    public boolean addToLayoutInPreviewOrCover;

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

    @C09CT("align")
    public int align;
    public Pair<Float, Boolean> alpha;

    @C09CT("audio_path_list")
    @C0MY0
    public List<String> audioPathList;

    @C09CT("old_text")
    public String audioText;

    @C09CT("audio_track_duration")
    public int audioTrackDuration;

    @C09CT("audio_track_file_path")
    @C0MY0
    public String audioTrackFilePath;

    @C09CT("audio_track_index")
    public int audioTrackIndex;

    @C09CT("auto_adapt_canvas")
    public boolean autoAdaptCanvas;

    @C09CT("auto_adapt_dpi")
    public boolean autoAdaptDpi;

    @C09CT("auto_add_tts_flag")
    public boolean autoAddTtsFlag;

    @C09CT("auto_line_break")
    public boolean autoLineBreak;
    public boolean autoSelect;

    @C09CT("bg_mode")
    public int bgMode;

    @C09CT("cacheWords")
    public List<Word> cacheWords;

    @C09CT("canvas_height")
    public int canvasHeight;

    @C09CT("canvas_wh_fixed")
    public List<Float> canvasWHFixed;

    @C09CT("canvas_width")
    public int canvasWidth;
    public boolean captionOnlyShowDeleteBubble;

    @C09CT("caption_template")
    public CaptionTemplateModel captionTemplateModel;

    @C09CT("clip_end")
    public long clipEnd;

    @C09CT("clip_start")
    public long clipStart;

    @C09CT("color")
    public int color;

    @C09CT("compat_model")
    public TextStickerCompatModel compatModel;

    @C09CT("cover_extra_data")
    public TextStickerCoverExtraData coverExtraData;

    @C09CT("edit_center_point")
    public Point editCenterPoint;
    public long editInEPDuration;

    @C09CT("editorpro_tts_tone_id")
    public String editorProTTSID;

    @C09CT("effect_text_layout_config")
    public InnerEffectTextLayoutConfig effectTextLayoutConfig;

    @C09CT("mEndTime")
    public int endTime;

    @C09CT("filter_selected")
    public boolean filterSelected;

    @C09CT("filter_tag")
    public String filterTag;

    @C09CT("fixed_font_size")
    public boolean fixedFontSize;

    @C09CT("font_category_id")
    public String fontCategoryId;

    @C09CT("font_id")
    public String fontId;

    @C09CT("font_name")
    public String fontName;

    @C09CT("font_panel")
    public String fontPanel;

    @C09CT("font_path")
    public String fontPath;

    @C09CT("font_res_id")
    public String fontResId;
    public int fontSize;

    @C09CT("font_title")
    public String fontTitle;

    @C09CT("force_effect_render")
    public boolean forceEffectRender;

    @C09CT("guidance_with_default_text")
    public boolean guidanceWithDefaultText;

    @C09CT("has_changed_font_size")
    public boolean hasChangedFontSize;

    @C09CT("has_read_text_audio")
    public boolean hasReadTextAudio;
    public EnumC390580FTc highlightState;

    @C09CT("id_for_new_engine")
    public int idInNewEngine;

    @C09CT("inline_text_styles")
    public List<? extends InlineRichTextStyleData> inlineTextStyles;

    @C09CT("is_adjust_text_roll_bar")
    public boolean isAdjustTextRollbar;

    @C09CT("is_creator")
    public boolean isCreatorVoice;

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

    @C09CT("is_guidance_sticker")
    public boolean isGuidanceSticker;

    @C09CT("is_manual_edited")
    public boolean isManualEdited;

    @C09CT("is_use_auto_text_size")
    public boolean isUseAutoTextSize;

    @C09CT("is_use_text_color_dropper")
    public boolean isUseColorDropper;

    @C09CT("last_edit_func")
    public String lastEditFunc;

    @C09CT("layout_height")
    public float layoutHeight;

    @C09CT("layout_width")
    public float layoutWidth;

    @C09CT("lineSpacingExtra")
    public float lineSpacingExtra;

    @C09CT("motion_data")
    public TextMotionModel motionModel;

    @C09CT("nle_uuid")
    public String nleUuid;

    @C09CT("editor_pro_mapping_id")
    public String placeholderSlotId;

    @C09CT("r")
    public float rotation;

    @C09CT("s")
    public float scale;
    public boolean showOnScreen;

    @C09CT("speaker_id")
    public String speakerID;

    @C09CT("speaker_name")
    public String speakerName;

    @C09CT("mStartTime")
    public int startTime;

    @C09CT("text_event_tracking")
    public TextEventTrackingModel textEventTracking;

    @C09CT("editorpro_text_slot_add_order")
    public int textSlotAddOrder;

    @C09CT("editorpro_text_slot_track_order")
    public int textSlotTrackOrder;

    @C09CT("text_sticker_info")
    public TextStickerInfo textStickerInfo;

    @C09CT("text_str")
    public String textStr;

    @C09CT("text_str_ary")
    public String[] textStrAry;

    @C09CT("text_style")
    public TextStyleModel textStyle;

    @C09CT("text_str_wrap")
    public TextStickerTextWrap textWrap;

    @C09CT("text_str_wrap_list")
    public List<TextStickerTextWrap> textWrapList;

    @C09CT("tts_anchor_release_date")
    public long ttsAnchorReleaseDate;

    @C09CT("tts_audio_bean")
    public TTSAudioBean ttsAudioBean;

    @C09CT("tts_extra")
    public final Map<String, String> ttsExtraMap;

    @C09CT("tts_hash_tag_ids")
    public List<String> ttsHashTagIds;

    @C09CT("tts_release_date")
    public long ttsReleaseDate;

    @C09CT("tts_voice_model")
    public TTSVoiceModel ttsVoiceModel;

    @C09CT("type")
    public String type;

    @C09CT("mUIEndTime")
    public int uiEndTime;

    @C09CT("mUIStartTime")
    public int uiStartTime;

    @C09CT("video_height")
    public int videoHeight;

    @C09CT("video_width")
    public int videoWidth;

    @C09CT("voice_anchor_name")
    public String voiceAnchorName;

    @C09CT("creator_user_id")
    public String voiceCreatorUserId;

    @C09CT("creator_user_name")
    public String voiceCreatorUserName;

    @C09CT("voice_effect_icon_url")
    public String voiceEffectIconUrl;

    @C09CT("voice_effect_id")
    public String voiceEffectId;

    @C09CT("voice_effect_resource_id")
    public String voiceEffectResourceId;

    @C09CT("mWords")
    public List<Word> words;
    public float x;
    public float y;

    public TextStickerData() {
        this(null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, -1, -1, 4095, null);
    }

    public TextStickerData(String str) {
        this(str, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -2, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i) {
        this(str, i, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -4, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2) {
        this(str, i, i2, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -8, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3) {
        this(str, i, i2, i3, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -16, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2) {
        this(str, i, i2, i3, str2, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -32, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point) {
        this(str, i, i2, i3, str2, point, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -64, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4) {
        this(str, i, i2, i3, str2, point, i4, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -128, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5) {
        this(str, i, i2, i3, str2, point, i4, i5, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -256, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -512, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1024, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -2048, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -4096, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -8192, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -16384, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -32768, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -65536, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -131072, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -262144, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -524288, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1048576, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -2097152, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -4194304, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -8388608, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -16777216, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -33554432, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -67108864, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -134217728, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -268435456, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -536870912, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1073741824, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, Integer.MIN_VALUE, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -1, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -2, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -4, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -8, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -16, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -32, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -64, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -128, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -256, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -512, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -1024, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -2048, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -4096, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -8192, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -16384, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -32768, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -65536, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -131072, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -262144, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -524288, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -1048576, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -2097152, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -4194304, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -8388608, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -16777216, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -33554432, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -67108864, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -134217728, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -268435456, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -536870912, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, -1073741824, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, Integer.MIN_VALUE, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -1, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -2, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -4, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -8, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -16, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -32, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -64, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -128, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -256, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -512, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -1024, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -2048, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -4096, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -8192, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -16384, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -32768, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -65536, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -131072, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -262144, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -524288, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -1048576, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -2097152, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -4194304, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -8388608, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -16777216, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -33554432, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -67108864, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -134217728, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -268435456, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, tTSAudioBean, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -536870912, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, tTSAudioBean, i17, null, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, -1073741824, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17, Map<String, String> map) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, tTSAudioBean, i17, map, null, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, Integer.MIN_VALUE, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17, Map<String, String> map, TextStickerInfo textStickerInfo) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, tTSAudioBean, i17, map, textStickerInfo, null, null, null, false, false, null, null, false, false, false, false, null, 0, 0, 0, 4095, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17, Map<String, String> map, TextStickerInfo textStickerInfo, TextStyleModel textStyleModel) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, tTSAudioBean, i17, map, textStickerInfo, textStyleModel, null, null, false, false, null, null, false, false, false, false, null, 0, 0, 0, 4094, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17, Map<String, String> map, TextStickerInfo textStickerInfo, TextStyleModel textStyleModel, CaptionTemplateModel captionTemplateModel) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, tTSAudioBean, i17, map, textStickerInfo, textStyleModel, captionTemplateModel, null, false, false, null, null, false, false, false, false, null, 0, 0, 0, 4092, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17, Map<String, String> map, TextStickerInfo textStickerInfo, TextStyleModel textStyleModel, CaptionTemplateModel captionTemplateModel, TextEventTrackingModel textEventTrackingModel) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, tTSAudioBean, i17, map, textStickerInfo, textStyleModel, captionTemplateModel, textEventTrackingModel, false, false, null, null, false, false, false, false, null, 0, 0, 0, 4088, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17, Map<String, String> map, TextStickerInfo textStickerInfo, TextStyleModel textStyleModel, CaptionTemplateModel captionTemplateModel, TextEventTrackingModel textEventTrackingModel, boolean z16) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, tTSAudioBean, i17, map, textStickerInfo, textStyleModel, captionTemplateModel, textEventTrackingModel, z16, false, null, null, false, false, false, false, null, 0, 0, 0, 4080, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17, Map<String, String> map, TextStickerInfo textStickerInfo, TextStyleModel textStyleModel, CaptionTemplateModel captionTemplateModel, TextEventTrackingModel textEventTrackingModel, boolean z16, boolean z17) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, tTSAudioBean, i17, map, textStickerInfo, textStyleModel, captionTemplateModel, textEventTrackingModel, z16, z17, null, null, false, false, false, false, null, 0, 0, 0, 4064, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17, Map<String, String> map, TextStickerInfo textStickerInfo, TextStyleModel textStyleModel, CaptionTemplateModel captionTemplateModel, TextEventTrackingModel textEventTrackingModel, boolean z16, boolean z17, String str35) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, tTSAudioBean, i17, map, textStickerInfo, textStyleModel, captionTemplateModel, textEventTrackingModel, z16, z17, str35, null, false, false, false, false, null, 0, 0, 0, 4032, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17, Map<String, String> map, TextStickerInfo textStickerInfo, TextStyleModel textStyleModel, CaptionTemplateModel captionTemplateModel, TextEventTrackingModel textEventTrackingModel, boolean z16, boolean z17, String str35, List<Float> list7) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, tTSAudioBean, i17, map, textStickerInfo, textStyleModel, captionTemplateModel, textEventTrackingModel, z16, z17, str35, list7, false, false, false, false, null, 0, 0, 0, 3968, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17, Map<String, String> map, TextStickerInfo textStickerInfo, TextStyleModel textStyleModel, CaptionTemplateModel captionTemplateModel, TextEventTrackingModel textEventTrackingModel, boolean z16, boolean z17, String str35, List<Float> list7, boolean z18) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, tTSAudioBean, i17, map, textStickerInfo, textStyleModel, captionTemplateModel, textEventTrackingModel, z16, z17, str35, list7, z18, false, false, false, null, 0, 0, 0, 3840, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17, Map<String, String> map, TextStickerInfo textStickerInfo, TextStyleModel textStyleModel, CaptionTemplateModel captionTemplateModel, TextEventTrackingModel textEventTrackingModel, boolean z16, boolean z17, String str35, List<Float> list7, boolean z18, boolean z19) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, tTSAudioBean, i17, map, textStickerInfo, textStyleModel, captionTemplateModel, textEventTrackingModel, z16, z17, str35, list7, z18, z19, false, false, null, 0, 0, 0, 3584, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17, Map<String, String> map, TextStickerInfo textStickerInfo, TextStyleModel textStyleModel, CaptionTemplateModel captionTemplateModel, TextEventTrackingModel textEventTrackingModel, boolean z16, boolean z17, String str35, List<Float> list7, boolean z18, boolean z19, boolean z20) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, tTSAudioBean, i17, map, textStickerInfo, textStyleModel, captionTemplateModel, textEventTrackingModel, z16, z17, str35, list7, z18, z19, z20, false, null, 0, 0, 0, 3072, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17, Map<String, String> map, TextStickerInfo textStickerInfo, TextStyleModel textStyleModel, CaptionTemplateModel captionTemplateModel, TextEventTrackingModel textEventTrackingModel, boolean z16, boolean z17, String str35, List<Float> list7, boolean z18, boolean z19, boolean z20, boolean z21) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, list, str3, z, list2, j, j2, f, f2, j3, z2, z3, z4, pair, enumC390580FTc, f3, f4, z5, z6, z7, i8, str4, str5, str6, str7, i9, str8, list3, i10, strArr, textStickerTextWrap, list4, innerEffectTextLayoutConfig, textStickerCoverExtraData, z8, z9, str9, str10, str11, str12, str13, str14, str15, textMotionModel, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z10, str16, str17, str18, str19, str20, str21, str22, z11, str23, j4, j5, list5, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, list6, z12, z13, z14, z15, i15, i16, tTSAudioBean, i17, map, textStickerInfo, textStyleModel, captionTemplateModel, textEventTrackingModel, z16, z17, str35, list7, z18, z19, z20, z21, null, 0, 0, 0, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE, null);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getTextStrAry$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getTextWrap$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void get_fontType$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.textStr);
        parcel.writeInt(this.bgMode);
        parcel.writeInt(this.color);
        parcel.writeInt(this.align);
        parcel.writeString(this._fontType);
        parcel.writeParcelable(this.editCenterPoint, i);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeInt(this.uiStartTime);
        parcel.writeInt(this.uiEndTime);
        List<Word> list = this.words;
        parcel.writeInt(list.size());
        Iterator<Word> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeSerializable(it2.next());
        }
        parcel.writeString(this.filterTag);
        parcel.writeInt(this.filterSelected ? 1 : 0);
        List<Word> list2 = this.cacheWords;
        parcel.writeInt(list2.size());
        Iterator<Word> it3 = list2.iterator();
        while (it3.hasNext()) {
            parcel.writeSerializable(it3.next());
        }
        parcel.writeLong(this.clipStart);
        parcel.writeLong(this.clipEnd);
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeLong(this.editInEPDuration);
        parcel.writeInt(this.showOnScreen ? 1 : 0);
        parcel.writeInt(this.addToLayout ? 1 : 0);
        parcel.writeInt(this.addToLayoutInPreviewOrCover ? 1 : 0);
        parcel.writeSerializable(this.alpha);
        parcel.writeString(this.highlightState.name());
        parcel.writeFloat(this.rotation);
        parcel.writeFloat(this.scale);
        parcel.writeInt(this.autoSelect ? 1 : 0);
        parcel.writeInt(this.captionOnlyShowDeleteBubble ? 1 : 0);
        parcel.writeInt(this.hasReadTextAudio ? 1 : 0);
        parcel.writeInt(this.audioTrackIndex);
        parcel.writeString(this.nleUuid);
        parcel.writeString(this.audioTrackFilePath);
        parcel.writeString(this.speakerID);
        parcel.writeString(this.speakerName);
        parcel.writeInt(this.audioTrackDuration);
        parcel.writeString(this.audioText);
        parcel.writeStringList(this.audioPathList);
        parcel.writeInt(this.fontSize);
        parcel.writeStringArray(this.textStrAry);
        this.textWrap.writeToParcel(parcel, i);
        List<TextStickerTextWrap> list3 = this.textWrapList;
        parcel.writeInt(list3.size());
        Iterator<TextStickerTextWrap> it4 = list3.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig = this.effectTextLayoutConfig;
        if (innerEffectTextLayoutConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            innerEffectTextLayoutConfig.writeToParcel(parcel, i);
        }
        this.coverExtraData.writeToParcel(parcel, i);
        parcel.writeInt(this.isGuidanceSticker ? 1 : 0);
        parcel.writeInt(this.guidanceWithDefaultText ? 1 : 0);
        parcel.writeString(this.fontId);
        parcel.writeString(this.fontCategoryId);
        parcel.writeString(this.fontResId);
        parcel.writeString(this.fontPanel);
        parcel.writeString(this.fontName);
        parcel.writeString(this.fontTitle);
        parcel.writeString(this.fontPath);
        parcel.writeParcelable(this.motionModel, i);
        parcel.writeFloat(this.layoutWidth);
        parcel.writeFloat(this.layoutHeight);
        parcel.writeInt(this.canvasWidth);
        parcel.writeInt(this.canvasHeight);
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeFloat(this.lineSpacingExtra);
        parcel.writeParcelable(this.ttsVoiceModel, i);
        parcel.writeInt(this.autoAddTtsFlag ? 1 : 0);
        parcel.writeString(this.voiceEffectId);
        parcel.writeString(this.voiceEffectResourceId);
        parcel.writeString(this.voiceAnchorName);
        parcel.writeString(this.voiceEffectIconUrl);
        parcel.writeString(this.placeholderSlotId);
        parcel.writeString(this.voiceCreatorUserId);
        parcel.writeString(this.voiceCreatorUserName);
        parcel.writeInt(this.isCreatorVoice ? 1 : 0);
        parcel.writeString(this.type);
        parcel.writeLong(this.ttsAnchorReleaseDate);
        parcel.writeLong(this.ttsReleaseDate);
        parcel.writeStringList(this.ttsHashTagIds);
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
        List<? extends InlineRichTextStyleData> list4 = this.inlineTextStyles;
        parcel.writeInt(list4.size());
        Iterator<? extends InlineRichTextStyleData> it5 = list4.iterator();
        while (it5.hasNext()) {
            parcel.writeParcelable(it5.next(), i);
        }
        parcel.writeInt(this.isUseAutoTextSize ? 1 : 0);
        parcel.writeInt(this.hasChangedFontSize ? 1 : 0);
        parcel.writeInt(this.isUseColorDropper ? 1 : 0);
        parcel.writeInt(this.isAdjustTextRollbar ? 1 : 0);
        parcel.writeInt(this.textSlotAddOrder);
        parcel.writeInt(this.textSlotTrackOrder);
        parcel.writeParcelable(this.ttsAudioBean, i);
        parcel.writeInt(this.idInNewEngine);
        Map<String, String> map = this.ttsExtraMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeSerializable(this.textStickerInfo);
        parcel.writeParcelable(this.textStyle, i);
        parcel.writeParcelable(this.captionTemplateModel, i);
        parcel.writeParcelable(this.textEventTracking, i);
        parcel.writeInt(this.autoLineBreak ? 1 : 0);
        parcel.writeInt(this.forceEffectRender ? 1 : 0);
        parcel.writeString(this.lastEditFunc);
        List<Float> list5 = this.canvasWHFixed;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            Iterator<Float> it6 = list5.iterator();
            while (it6.hasNext()) {
                parcel.writeFloat(it6.next().floatValue());
            }
        }
        parcel.writeInt(this.autoAdaptCanvas ? 1 : 0);
        parcel.writeInt(this.autoAdaptDpi ? 1 : 0);
        parcel.writeInt(this.fixedFontSize ? 1 : 0);
        parcel.writeInt(this.isManualEdited ? 1 : 0);
        parcel.writeParcelable(this.compatModel, i);
    }

    public final boolean hasPositionData() {
        return !(this.scale == 0.0f);
    }

    public final boolean hasTimeData() {
        return this.endTime != 0;
    }

    public final boolean isAICaption() {
        return Intrinsics.LJFF(this.type, "type_ai_caption");
    }

    public final boolean isCaption() {
        return Intrinsics.LJFF(this.type, "type_inline_caption");
    }

    public final boolean isTextSticker() {
        return Intrinsics.LJFF(this.type, "type_text_sticker");
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TextStickerData m187clone() {
        try {
            return (TextStickerData) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, -1, -1, 4095, null);
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("textStr: ");
        sbLIZ.append(this.textStr);
        sbLIZ.append(", bgMode: ");
        sbLIZ.append(this.bgMode);
        sbLIZ.append(", color: ");
        sbLIZ.append(this.color);
        sbLIZ.append(", align: ");
        sbLIZ.append(this.align);
        sbLIZ.append(", fontType: ");
        sbLIZ.append(this._fontType);
        sbLIZ.append(", centerPoint: ");
        sbLIZ.append(this.editCenterPoint);
        sbLIZ.append(", fontSize: ");
        sbLIZ.append(this.fontSize);
        sbLIZ.append(", position: (");
        sbLIZ.append(this.x);
        sbLIZ.append(", ");
        sbLIZ.append(this.y);
        sbLIZ.append("), scale: ");
        sbLIZ.append(this.scale);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getAddToLayout() {
        return this.addToLayout;
    }

    public final boolean getAddToLayoutInPreviewOrCover() {
        return this.addToLayoutInPreviewOrCover;
    }

    public final String getAdjustTextColorInEditorPro() {
        return this.adjustTextColorInEditorPro;
    }

    public final String getAdjustTextFontInEditorPro() {
        return this.adjustTextFontInEditorPro;
    }

    public final String getAdjustTextParagraph() {
        return this.adjustTextParagraph;
    }

    public final String getAdjustTextPositionInEditorPro() {
        return this.adjustTextPositionInEditorPro;
    }

    public final String getAdjustTextStyleInEditorPro() {
        return this.adjustTextStyleInEditorPro;
    }

    public final int getAlign() {
        return this.align;
    }

    public final Pair<Float, Boolean> getAlpha() {
        return this.alpha;
    }

    public final List<String> getAudioPathList() {
        return this.audioPathList;
    }

    public final String getAudioText() {
        return this.audioText;
    }

    public final int getAudioTrackDuration() {
        return this.audioTrackDuration;
    }

    public final String getAudioTrackFilePath() {
        return this.audioTrackFilePath;
    }

    public final int getAudioTrackIndex() {
        return this.audioTrackIndex;
    }

    public final boolean getAutoAdaptCanvas() {
        return this.autoAdaptCanvas;
    }

    public final boolean getAutoAdaptDpi() {
        return this.autoAdaptDpi;
    }

    public final boolean getAutoAddTtsFlag() {
        return this.autoAddTtsFlag;
    }

    public final boolean getAutoLineBreak() {
        return this.autoLineBreak;
    }

    public final boolean getAutoSelect() {
        return this.autoSelect;
    }

    public final int getBgMode() {
        return this.bgMode;
    }

    public final List<Word> getCacheWords() {
        return this.cacheWords;
    }

    public final int getCanvasHeight() {
        return this.canvasHeight;
    }

    public final List<Float> getCanvasWHFixed() {
        return this.canvasWHFixed;
    }

    public final int getCanvasWidth() {
        return this.canvasWidth;
    }

    public final boolean getCaptionOnlyShowDeleteBubble() {
        return this.captionOnlyShowDeleteBubble;
    }

    public final CaptionTemplateModel getCaptionTemplateModel() {
        return this.captionTemplateModel;
    }

    public final long getClipEnd() {
        return this.clipEnd;
    }

    public final long getClipStart() {
        return this.clipStart;
    }

    public final int getColor() {
        return this.color;
    }

    public final TextStickerCompatModel getCompatModel() {
        return this.compatModel;
    }

    public final TextStickerCoverExtraData getCoverExtraData() {
        return this.coverExtraData;
    }

    public final Point getEditCenterPoint() {
        return this.editCenterPoint;
    }

    public final long getEditInEPDuration() {
        return this.editInEPDuration;
    }

    public final String getEditorProTTSID() {
        return this.editorProTTSID;
    }

    public final InnerEffectTextLayoutConfig getEffectTextLayoutConfig() {
        return this.effectTextLayoutConfig;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final boolean getFilterSelected() {
        return this.filterSelected;
    }

    public final String getFilterTag() {
        return this.filterTag;
    }

    public final boolean getFixedFontSize() {
        return this.fixedFontSize;
    }

    public final String getFontCategoryId() {
        return this.fontCategoryId;
    }

    public final String getFontId() {
        return this.fontId;
    }

    public final String getFontName() {
        return this.fontName;
    }

    public final String getFontPanel() {
        return this.fontPanel;
    }

    public final String getFontPath() {
        return this.fontPath;
    }

    public final String getFontResId() {
        return this.fontResId;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final String getFontTitle() {
        return this.fontTitle;
    }

    public final String getFontType() {
        return this._fontType;
    }

    public final boolean getForceEffectRender() {
        return this.forceEffectRender;
    }

    public final boolean getGuidanceWithDefaultText() {
        return this.guidanceWithDefaultText;
    }

    public final boolean getHasChangedFontSize() {
        return this.hasChangedFontSize;
    }

    public final boolean getHasReadTextAudio() {
        return this.hasReadTextAudio;
    }

    public final EnumC390580FTc getHighlightState() {
        return this.highlightState;
    }

    public final int getIdInNewEngine() {
        return this.idInNewEngine;
    }

    public final List<InlineRichTextStyleData> getInlineTextStyles() {
        return this.inlineTextStyles;
    }

    public final String getLastEditFunc() {
        return this.lastEditFunc;
    }

    public final float getLayoutHeight() {
        return this.layoutHeight;
    }

    public final float getLayoutWidth() {
        return this.layoutWidth;
    }

    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    public final TextMotionModel getMotionModel() {
        return this.motionModel;
    }

    public final String getNleUuid() {
        return this.nleUuid;
    }

    public final String getPlaceholderSlotId() {
        return this.placeholderSlotId;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScale() {
        return this.scale;
    }

    public final boolean getShowOnScreen() {
        return this.showOnScreen;
    }

    public final String getSpeakerID() {
        return this.speakerID;
    }

    public final String getSpeakerName() {
        return this.speakerName;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final TextEventTrackingModel getTextEventTracking() {
        return this.textEventTracking;
    }

    public final int getTextSlotAddOrder() {
        return this.textSlotAddOrder;
    }

    public final int getTextSlotTrackOrder() {
        return this.textSlotTrackOrder;
    }

    public final TextStickerInfo getTextStickerInfo() {
        return this.textStickerInfo;
    }

    public final String getTextStr() {
        return this.textStr;
    }

    public final TextStyleModel getTextStyle() {
        return this.textStyle;
    }

    public final List<TextStickerTextWrap> getTextWrapList() {
        return this.textWrapList;
    }

    public final long getTtsAnchorReleaseDate() {
        return this.ttsAnchorReleaseDate;
    }

    public final TTSAudioBean getTtsAudioBean() {
        return this.ttsAudioBean;
    }

    public final Map<String, String> getTtsExtraMap() {
        return this.ttsExtraMap;
    }

    public final List<String> getTtsHashTagIds() {
        return this.ttsHashTagIds;
    }

    public final long getTtsReleaseDate() {
        return this.ttsReleaseDate;
    }

    public final TTSVoiceModel getTtsVoiceModel() {
        return this.ttsVoiceModel;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUiEndTime() {
        return this.uiEndTime;
    }

    public final int getUiStartTime() {
        return this.uiStartTime;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final String getVoiceAnchorName() {
        return this.voiceAnchorName;
    }

    public final String getVoiceCreatorUserId() {
        return this.voiceCreatorUserId;
    }

    public final String getVoiceCreatorUserName() {
        return this.voiceCreatorUserName;
    }

    public final String getVoiceEffectIconUrl() {
        return this.voiceEffectIconUrl;
    }

    public final String getVoiceEffectId() {
        return this.voiceEffectId;
    }

    public final String getVoiceEffectResourceId() {
        return this.voiceEffectResourceId;
    }

    public final List<Word> getWords() {
        return this.words;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final boolean isAdjustTextRollbar() {
        return this.isAdjustTextRollbar;
    }

    public final boolean isCreatorVoice() {
        return this.isCreatorVoice;
    }

    public final String isEditorProCaption() {
        return this.isEditorProCaption;
    }

    public final String isEditorProCopyText() {
        return this.isEditorProCopyText;
    }

    public final String isEditorProTTS() {
        return this.isEditorProTTS;
    }

    public final String isEditorProText() {
        return this.isEditorProText;
    }

    public final String isEditorProTrimLength() {
        return this.isEditorProTrimLength;
    }

    public final boolean isGuidanceSticker() {
        return this.isGuidanceSticker;
    }

    public final boolean isManualEdited() {
        return this.isManualEdited;
    }

    public final boolean isUseAutoTextSize() {
        return this.isUseAutoTextSize;
    }

    public final boolean isUseColorDropper() {
        return this.isUseColorDropper;
    }

    public final float alphaFromHighlightState(EnumC390580FTc enumC390580FTc) {
        int i = C390570FTb.LIZ[enumC390580FTc.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 0.3137255f;
                }
                throw new C1954807lC();
            }
            return this.alpha.first.floatValue();
        }
        return 1.0f;
    }

    public final boolean isVisibleWhen(long j) {
        if (hasTimeData()) {
            int i = this.startTime;
            if (j > this.endTime || i > j) {
                return false;
            }
        }
        return true;
    }

    public final void setAddToLayout(boolean z) {
        this.addToLayout = z;
    }

    public final void setAddToLayoutInPreviewOrCover(boolean z) {
        this.addToLayoutInPreviewOrCover = z;
    }

    public final void setAdjustTextColorInEditorPro(String str) {
        this.adjustTextColorInEditorPro = str;
    }

    public final void setAdjustTextFontInEditorPro(String str) {
        this.adjustTextFontInEditorPro = str;
    }

    public final void setAdjustTextParagraph(String str) {
        this.adjustTextParagraph = str;
    }

    public final void setAdjustTextPositionInEditorPro(String str) {
        this.adjustTextPositionInEditorPro = str;
    }

    public final void setAdjustTextRollbar(boolean z) {
        this.isAdjustTextRollbar = z;
    }

    public final void setAdjustTextStyleInEditorPro(String str) {
        this.adjustTextStyleInEditorPro = str;
    }

    public final void setAlign(int i) {
        this.align = i;
    }

    public final void setAlpha(Pair<Float, Boolean> pair) {
        this.alpha = pair;
    }

    public final void setAudioPathList(List<String> list) {
        this.audioPathList = list;
    }

    public final void setAudioText(String str) {
        this.audioText = str;
    }

    public final void setAudioTrackDuration(int i) {
        this.audioTrackDuration = i;
    }

    public final void setAudioTrackFilePath(String str) {
        this.audioTrackFilePath = str;
    }

    public final void setAudioTrackIndex(int i) {
        this.audioTrackIndex = i;
    }

    public final void setAutoAdaptCanvas(boolean z) {
        this.autoAdaptCanvas = z;
    }

    public final void setAutoAdaptDpi(boolean z) {
        this.autoAdaptDpi = z;
    }

    public final void setAutoAddTtsFlag(boolean z) {
        this.autoAddTtsFlag = z;
    }

    public final void setAutoLineBreak(boolean z) {
        this.autoLineBreak = z;
    }

    public final void setAutoSelect(boolean z) {
        this.autoSelect = z;
    }

    public final void setBgMode(int i) {
        this.bgMode = i;
    }

    public final void setCacheWords(List<Word> list) {
        this.cacheWords = list;
    }

    public final void setCanvasHeight(int i) {
        this.canvasHeight = i;
    }

    public final void setCanvasWHFixed(List<Float> list) {
        this.canvasWHFixed = list;
    }

    public final void setCanvasWidth(int i) {
        this.canvasWidth = i;
    }

    public final void setCaptionOnlyShowDeleteBubble(boolean z) {
        this.captionOnlyShowDeleteBubble = z;
    }

    public final void setCaptionTemplateModel(CaptionTemplateModel captionTemplateModel) {
        this.captionTemplateModel = captionTemplateModel;
    }

    public final void setClipEnd(long j) {
        this.clipEnd = j;
    }

    public final void setClipStart(long j) {
        this.clipStart = j;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setCompatModel(TextStickerCompatModel textStickerCompatModel) {
        this.compatModel = textStickerCompatModel;
    }

    public final void setCoverExtraData(TextStickerCoverExtraData textStickerCoverExtraData) {
        this.coverExtraData = textStickerCoverExtraData;
    }

    public final void setCreatorVoice(boolean z) {
        this.isCreatorVoice = z;
    }

    public final void setEditCenterPoint(Point point) {
        this.editCenterPoint = point;
    }

    public final void setEditInEPDuration(long j) {
        this.editInEPDuration = j;
    }

    public final void setEditorProCaption(String str) {
        this.isEditorProCaption = str;
    }

    public final void setEditorProCopyText(String str) {
        this.isEditorProCopyText = str;
    }

    public final void setEditorProTTS(String str) {
        this.isEditorProTTS = str;
    }

    public final void setEditorProTTSID(String str) {
        this.editorProTTSID = str;
    }

    public final void setEditorProText(String str) {
        this.isEditorProText = str;
    }

    public final void setEditorProTrimLength(String str) {
        this.isEditorProTrimLength = str;
    }

    public final void setEffectTextLayoutConfig(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        this.effectTextLayoutConfig = innerEffectTextLayoutConfig;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setFilterSelected(boolean z) {
        this.filterSelected = z;
    }

    public final void setFilterTag(String str) {
        this.filterTag = str;
    }

    public final void setFixedFontSize(boolean z) {
        this.fixedFontSize = z;
    }

    public final void setFontCategoryId(String str) {
        this.fontCategoryId = str;
    }

    public final void setFontId(String str) {
        this.fontId = str;
    }

    public final void setFontName(String str) {
        this.fontName = str;
    }

    public final void setFontPanel(String str) {
        this.fontPanel = str;
    }

    public final void setFontPath(String str) {
        this.fontPath = str;
    }

    public final void setFontResId(String str) {
        this.fontResId = str;
    }

    public final void setFontSize(int i) {
        this.fontSize = i;
    }

    public final void setFontTitle(String str) {
        this.fontTitle = str;
    }

    public final void setFontType(String str) {
        this._fontType = str;
        TextFontStyleData textFontStyleDataLJIILL = C0FI2.LJIILL(str);
        if (textFontStyleDataLJIILL != null) {
            this.fontId = textFontStyleDataLJIILL.LJ.getEffectId();
            this.fontPath = textFontStyleDataLJIILL.LJ.getUnzipPath();
            this.fontResId = textFontStyleDataLJIILL.LJ.getResource_id();
            this.fontPanel = textFontStyleDataLJIILL.LJ.getPanel();
            this.fontName = textFontStyleDataLJIILL.fontName;
            this.fontTitle = textFontStyleDataLJIILL.title;
            return;
        }
        this.fontId = "";
        this.fontPath = "";
        this.fontResId = "";
        this.fontPanel = "";
        this.fontName = null;
        this.fontTitle = null;
    }

    public final void setForceEffectRender(boolean z) {
        this.forceEffectRender = z;
    }

    public final void setGuidanceSticker(boolean z) {
        this.isGuidanceSticker = z;
    }

    public final void setGuidanceWithDefaultText(boolean z) {
        this.guidanceWithDefaultText = z;
    }

    public final void setHasChangedFontSize(boolean z) {
        this.hasChangedFontSize = z;
    }

    public final void setHasReadTextAudio(boolean z) {
        this.hasReadTextAudio = z;
    }

    public final void setHighlightState(EnumC390580FTc enumC390580FTc) {
        this.highlightState = enumC390580FTc;
    }

    public final void setIdInNewEngine(int i) {
        this.idInNewEngine = i;
    }

    public final void setInlineTextStyles(List<? extends InlineRichTextStyleData> list) {
        this.inlineTextStyles = list;
    }

    public final void setLastEditFunc(String str) {
        this.lastEditFunc = str;
    }

    public final void setLayoutHeight(float f) {
        this.layoutHeight = f;
    }

    public final void setLayoutWidth(float f) {
        this.layoutWidth = f;
    }

    public final void setLineSpacingExtra(float f) {
        this.lineSpacingExtra = f;
    }

    public final void setManualEdited(boolean z) {
        this.isManualEdited = z;
    }

    public final void setMotionModel(TextMotionModel textMotionModel) {
        this.motionModel = textMotionModel;
    }

    public final void setNleUuid(String str) {
        this.nleUuid = str;
    }

    public final void setPlaceholderSlotId(String str) {
        this.placeholderSlotId = str;
    }

    public final void setRotation(float f) {
        this.rotation = f;
    }

    public final void setScale(float f) {
        this.scale = f;
    }

    public final void setShowOnScreen(boolean z) {
        this.showOnScreen = z;
    }

    public final void setSpeakerID(String str) {
        this.speakerID = str;
    }

    public final void setSpeakerName(String str) {
        this.speakerName = str;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final void setTextEventTracking(TextEventTrackingModel textEventTrackingModel) {
        this.textEventTracking = textEventTrackingModel;
    }

    public final void setTextSlotAddOrder(int i) {
        this.textSlotAddOrder = i;
    }

    public final void setTextSlotTrackOrder(int i) {
        this.textSlotTrackOrder = i;
    }

    public final void setTextStickerInfo(TextStickerInfo textStickerInfo) {
        this.textStickerInfo = textStickerInfo;
    }

    public final void setTextStr(String str) {
        this.textStr = str;
    }

    public final void setTextStyle(TextStyleModel textStyleModel) {
        this.textStyle = textStyleModel;
    }

    public final void setTextWrapList(List<TextStickerTextWrap> list) {
        this.textWrapList = list;
    }

    public final void setTtsAnchorReleaseDate(long j) {
        this.ttsAnchorReleaseDate = j;
    }

    public final void setTtsAudioBean(TTSAudioBean tTSAudioBean) {
        this.ttsAudioBean = tTSAudioBean;
    }

    public final void setTtsHashTagIds(List<String> list) {
        this.ttsHashTagIds = list;
    }

    public final void setTtsReleaseDate(long j) {
        this.ttsReleaseDate = j;
    }

    public final void setTtsVoiceModel(TTSVoiceModel tTSVoiceModel) {
        this.ttsVoiceModel = tTSVoiceModel;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUiEndTime(int i) {
        this.uiEndTime = i;
    }

    public final void setUiStartTime(int i) {
        this.uiStartTime = i;
    }

    public final void setUseAutoTextSize(boolean z) {
        this.isUseAutoTextSize = z;
    }

    public final void setUseColorDropper(boolean z) {
        this.isUseColorDropper = z;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public final void setVoiceAnchorName(String str) {
        this.voiceAnchorName = str;
    }

    public final void setVoiceCreatorUserId(String str) {
        this.voiceCreatorUserId = str;
    }

    public final void setVoiceCreatorUserName(String str) {
        this.voiceCreatorUserName = str;
    }

    public final void setVoiceEffectIconUrl(String str) {
        this.voiceEffectIconUrl = str;
    }

    public final void setVoiceEffectId(String str) {
        this.voiceEffectId = str;
    }

    public final void setVoiceEffectResourceId(String str) {
        this.voiceEffectResourceId = str;
    }

    public final void setWords(List<Word> list) {
        this.words = list;
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final void setY(float f) {
        this.y = f;
    }

    /* JADX INFO: loaded from: classes30.dex */
    public static final class Pair<A, B> implements Serializable {

        @C09CT(alternate = {"LIZIZ"}, value = "first")
        public final A first;

        @C09CT(alternate = {"LIZ"}, value = "second")
        public final B second;

        public Pair(A a, B b) {
            this.first = a;
            this.second = b;
        }
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List<Word> list, String str3, boolean z, List<Word> list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair<Float, Boolean> pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List<String> list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List<String> list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List<? extends InlineRichTextStyleData> list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17, Map<String, String> map, TextStickerInfo textStickerInfo, TextStyleModel textStyleModel, CaptionTemplateModel captionTemplateModel, TextEventTrackingModel textEventTrackingModel, boolean z16, boolean z17, String str35, List<Float> list7, boolean z18, boolean z19, boolean z20, boolean z21, TextStickerCompatModel textStickerCompatModel) {
        this.textStr = str;
        this.bgMode = i;
        this.color = i2;
        this.align = i3;
        this._fontType = str2;
        this.editCenterPoint = point;
        this.startTime = i4;
        this.endTime = i5;
        this.uiStartTime = i6;
        this.uiEndTime = i7;
        this.words = list;
        this.filterTag = str3;
        this.filterSelected = z;
        this.cacheWords = list2;
        this.clipStart = j;
        this.clipEnd = j2;
        this.x = f;
        this.y = f2;
        this.editInEPDuration = j3;
        this.showOnScreen = z2;
        this.addToLayout = z3;
        this.addToLayoutInPreviewOrCover = z4;
        this.alpha = pair;
        this.highlightState = enumC390580FTc;
        this.rotation = f3;
        this.scale = f4;
        this.autoSelect = z5;
        this.captionOnlyShowDeleteBubble = z6;
        this.hasReadTextAudio = z7;
        this.audioTrackIndex = i8;
        this.nleUuid = str4;
        this.audioTrackFilePath = str5;
        this.speakerID = str6;
        this.speakerName = str7;
        this.audioTrackDuration = i9;
        this.audioText = str8;
        this.audioPathList = list3;
        this.fontSize = i10;
        this.textStrAry = strArr;
        this.textWrap = textStickerTextWrap;
        this.textWrapList = list4;
        this.effectTextLayoutConfig = innerEffectTextLayoutConfig;
        this.coverExtraData = textStickerCoverExtraData;
        this.isGuidanceSticker = z8;
        this.guidanceWithDefaultText = z9;
        this.fontId = str9;
        this.fontCategoryId = str10;
        this.fontResId = str11;
        this.fontPanel = str12;
        this.fontName = str13;
        this.fontTitle = str14;
        this.fontPath = str15;
        this.motionModel = textMotionModel;
        this.layoutWidth = f5;
        this.layoutHeight = f6;
        this.canvasWidth = i11;
        this.canvasHeight = i12;
        this.videoWidth = i13;
        this.videoHeight = i14;
        this.lineSpacingExtra = f7;
        this.ttsVoiceModel = tTSVoiceModel;
        this.autoAddTtsFlag = z10;
        this.voiceEffectId = str16;
        this.voiceEffectResourceId = str17;
        this.voiceAnchorName = str18;
        this.voiceEffectIconUrl = str19;
        this.placeholderSlotId = str20;
        this.voiceCreatorUserId = str21;
        this.voiceCreatorUserName = str22;
        this.isCreatorVoice = z11;
        this.type = str23;
        this.ttsAnchorReleaseDate = j4;
        this.ttsReleaseDate = j5;
        this.ttsHashTagIds = list5;
        this.adjustTextStyleInEditorPro = str24;
        this.adjustTextParagraph = str25;
        this.adjustTextFontInEditorPro = str26;
        this.adjustTextColorInEditorPro = str27;
        this.adjustTextPositionInEditorPro = str28;
        this.isEditorProTrimLength = str29;
        this.isEditorProText = str30;
        this.isEditorProCopyText = str31;
        this.isEditorProTTS = str32;
        this.editorProTTSID = str33;
        this.isEditorProCaption = str34;
        this.inlineTextStyles = list6;
        this.isUseAutoTextSize = z12;
        this.hasChangedFontSize = z13;
        this.isUseColorDropper = z14;
        this.isAdjustTextRollbar = z15;
        this.textSlotAddOrder = i15;
        this.textSlotTrackOrder = i16;
        this.ttsAudioBean = tTSAudioBean;
        this.idInNewEngine = i17;
        this.ttsExtraMap = map;
        this.textStickerInfo = textStickerInfo;
        this.textStyle = textStyleModel;
        this.captionTemplateModel = captionTemplateModel;
        this.textEventTracking = textEventTrackingModel;
        this.autoLineBreak = z16;
        this.forceEffectRender = z17;
        this.lastEditFunc = str35;
        this.canvasWHFixed = list7;
        this.autoAdaptCanvas = z18;
        this.autoAdaptDpi = z19;
        this.fixedFontSize = z20;
        this.isManualEdited = z21;
        this.compatModel = textStickerCompatModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, List list, String str3, boolean z, List list2, long j, long j2, float f, float f2, long j3, boolean z2, boolean z3, boolean z4, Pair pair, EnumC390580FTc enumC390580FTc, float f3, float f4, boolean z5, boolean z6, boolean z7, int i8, String str4, String str5, String str6, String str7, int i9, String str8, List list3, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List list4, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z8, boolean z9, String str9, String str10, String str11, String str12, String str13, String str14, String str15, TextMotionModel textMotionModel, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z10, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z11, String str23, long j4, long j5, List list5, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List list6, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean tTSAudioBean, int i17, Map map, TextStickerInfo textStickerInfo, TextStyleModel textStyleModel, CaptionTemplateModel captionTemplateModel, TextEventTrackingModel textEventTrackingModel, boolean z16, boolean z17, String str35, List list7, boolean z18, boolean z19, boolean z20, boolean z21, TextStickerCompatModel textStickerCompatModel, int i18, int i19, int i20, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        List list8;
        TextStickerCompatModel textStickerCompatModel2 = textStickerCompatModel;
        boolean z22 = z21;
        boolean z23 = z17;
        TextEventTrackingModel textEventTrackingModel2 = textEventTrackingModel;
        CaptionTemplateModel captionTemplateModel2 = captionTemplateModel;
        int i22 = i16;
        boolean z24 = z15;
        boolean z25 = z14;
        boolean z26 = z12;
        List list9 = list6;
        String str36 = str33;
        String str37 = str32;
        String str38 = str31;
        String str39 = str30;
        int i23 = i7;
        List arrayList = list5;
        long j6 = j4;
        String str40 = str23;
        boolean z27 = z11;
        String str41 = str22;
        String str42 = str21;
        String str43 = str20;
        String str44 = str19;
        String str45 = str18;
        String str46 = str16;
        boolean z28 = z10;
        boolean z29 = z16;
        float fLJIIIZ = f7;
        int i24 = i14;
        String str47 = str28;
        int i25 = i12;
        String str48 = str27;
        float f8 = f5;
        boolean z30 = z9;
        TextMotionModel textMotionModel2 = textMotionModel;
        String str49 = str15;
        String str50 = str26;
        String str51 = str14;
        String str52 = str13;
        String str53 = str25;
        String str54 = str11;
        TTSVoiceModel tTSVoiceModel2 = tTSVoiceModel;
        int i26 = i13;
        String str55 = str10;
        int i27 = i11;
        boolean z31 = z8;
        String str56 = str8;
        String str57 = str6;
        TextStickerTextWrap textStickerTextWrapLIZJ = textStickerTextWrap;
        boolean z32 = z18;
        String str58 = str7;
        String str59 = str4;
        String[] strArr2 = strArr;
        boolean z33 = z19;
        List arrayList2 = list3;
        int i28 = i9;
        float f9 = f2;
        long j7 = j2;
        String str60 = str5;
        int i29 = i8;
        boolean z34 = z7;
        boolean z35 = z6;
        boolean z36 = z5;
        float f10 = f4;
        int i30 = i10;
        String str61 = str29;
        Pair pair2 = pair;
        long j8 = j3;
        String str62 = str9;
        float f11 = f;
        long j9 = j;
        int i31 = i5;
        String str63 = str12;
        List list10 = list2;
        int i32 = i6;
        boolean z37 = z4;
        boolean z38 = z13;
        EnumC390580FTc enumC390580FTc2 = enumC390580FTc;
        boolean z39 = z20;
        List listLJ = list4;
        TextStickerCoverExtraData textStickerCoverExtraData2 = textStickerCoverExtraData;
        String str64 = str3;
        int i33 = i17;
        int i34 = i;
        List list11 = list;
        int i35 = i15;
        float f12 = f3;
        TextStyleModel textStyleModel2 = textStyleModel;
        String str65 = str2;
        boolean z40 = z;
        String str66 = str24;
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig2 = innerEffectTextLayoutConfig;
        int i36 = i4;
        String str67 = str17;
        boolean z41 = z2;
        Point point2 = point;
        TextStickerInfo textStickerInfo2 = textStickerInfo;
        int i37 = i3;
        Map map2 = map;
        int i38 = i2;
        boolean z42 = z3;
        TTSAudioBean tTSAudioBean2 = tTSAudioBean;
        String str68 = (i18 & 1) != 0 ? null : str;
        i34 = (i18 & 2) != 0 ? 0 : i34;
        i38 = (i18 & 4) != 0 ? 0 : i38;
        i37 = (i18 & 8) != 0 ? 0 : i37;
        str65 = (i18 & 16) != 0 ? null : str65;
        point2 = (i18 & 32) != 0 ? new Point() : point2;
        i36 = (i18 & 64) != 0 ? 0 : i36;
        i31 = (i18 & 128) != 0 ? 0 : i31;
        i32 = (i18 & 256) != 0 ? 0 : i32;
        i23 = (i18 & 512) != 0 ? 0 : i23;
        list11 = (i18 & 1024) != 0 ? C13BV.INSTANCE : list11;
        str64 = (i18 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str64;
        z40 = (i18 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z40;
        list10 = (i18 & 8192) != 0 ? C13BV.INSTANCE : list10;
        j9 = (i18 & 16384) != 0 ? 0L : j9;
        j7 = (32768 & i18) != 0 ? 0L : j7;
        f11 = (65536 & i18) != 0 ? 0.0f : f11;
        f9 = (131072 & i18) != 0 ? 0.0f : f9;
        j8 = (262144 & i18) != 0 ? 0L : j8;
        z41 = (524288 & i18) != 0 ? true : z41;
        z42 = (1048576 & i18) != 0 ? false : z42;
        z37 = (2097152 & i18) != 0 ? false : z37;
        pair2 = (4194304 & i18) != 0 ? new Pair(Float.valueOf(1.0f), Boolean.TRUE) : pair2;
        enumC390580FTc2 = (8388608 & i18) != 0 ? EnumC390580FTc.NORMAL : enumC390580FTc2;
        f12 = (16777216 & i18) != 0 ? 0.0f : f12;
        f10 = (33554432 & i18) != 0 ? 0.0f : f10;
        z36 = (67108864 & i18) != 0 ? false : z36;
        z35 = (134217728 & i18) != 0 ? false : z35;
        z34 = (268435456 & i18) != 0 ? false : z34;
        i29 = (536870912 & i18) != 0 ? -1 : i29;
        str59 = (1073741824 & i18) != 0 ? "" : str59;
        str60 = (i18 & Integer.MIN_VALUE) != 0 ? null : str60;
        str57 = (i19 & 1) != 0 ? null : str57;
        str58 = (i19 & 2) != 0 ? null : str58;
        i28 = (i19 & 4) != 0 ? 0 : i28;
        str56 = (i19 & 8) != 0 ? null : str56;
        arrayList2 = (i19 & 16) != 0 ? new ArrayList() : arrayList2;
        i30 = (i19 & 32) != 0 ? 28 : i30;
        strArr2 = (i19 & 64) != 0 ? new String[0] : strArr2;
        textStickerTextWrapLIZJ = (i19 & 128) != 0 ? C123P.LIZJ(strArr2) : textStickerTextWrapLIZJ;
        listLJ = (i19 & 256) != 0 ? C1697810uHb.LJ(textStickerTextWrapLIZJ) : listLJ;
        innerEffectTextLayoutConfig2 = (i19 & 512) != 0 ? null : innerEffectTextLayoutConfig2;
        textStickerCoverExtraData2 = (i19 & 1024) != 0 ? new TextStickerCoverExtraData(true) : textStickerCoverExtraData2;
        z31 = (i19 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z31;
        z30 = (i19 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z30;
        str62 = (i19 & 8192) != 0 ? null : str62;
        str55 = (i19 & 16384) != 0 ? null : str55;
        str54 = (32768 & i19) != 0 ? null : str54;
        str63 = (65536 & i19) != 0 ? null : str63;
        str52 = (131072 & i19) != 0 ? null : str52;
        str51 = (262144 & i19) != 0 ? null : str51;
        str49 = (524288 & i19) != 0 ? null : str49;
        textMotionModel2 = (1048576 & i19) != 0 ? new TextMotionModel("", 0.0f, 0, "", "", "", 3, false, true, false) : textMotionModel2;
        f8 = (2097152 & i19) != 0 ? 0.0f : f8;
        float f13 = (4194304 & i19) == 0 ? f6 : 0.0f;
        i27 = (8388608 & i19) != 0 ? 0 : i27;
        i25 = (16777216 & i19) != 0 ? 0 : i25;
        i26 = (33554432 & i19) != 0 ? 0 : i26;
        i24 = (67108864 & i19) != 0 ? 0 : i24;
        fLJIIIZ = (134217728 & i19) != 0 ? C1919207fS.LJIIIZ() : fLJIIIZ;
        tTSVoiceModel2 = (268435456 & i19) != 0 ? null : tTSVoiceModel2;
        z28 = (536870912 & i19) != 0 ? false : z28;
        str46 = (1073741824 & i19) != 0 ? null : str46;
        str67 = (i19 & Integer.MIN_VALUE) != 0 ? null : str67;
        str45 = (i20 & 1) != 0 ? null : str45;
        str44 = (i20 & 2) != 0 ? null : str44;
        str43 = (i20 & 4) != 0 ? null : str43;
        str42 = (i20 & 8) != 0 ? "" : str42;
        str41 = (i20 & 16) != 0 ? "" : str41;
        z27 = (i20 & 32) != 0 ? false : z27;
        str40 = (i20 & 64) != 0 ? "type_text_sticker" : str40;
        j6 = (i20 & 128) != 0 ? 0L : j6;
        long j10 = (i20 & 256) == 0 ? j5 : 0L;
        arrayList = (i20 & 512) != 0 ? new ArrayList() : arrayList;
        int i39 = i20 & 1024;
        String str69 = CardStruct.IStatusCode.DEFAULT;
        str66 = i39 != 0 ? CardStruct.IStatusCode.DEFAULT : str66;
        str53 = (i20 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? CardStruct.IStatusCode.DEFAULT : str53;
        str50 = (i20 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? CardStruct.IStatusCode.DEFAULT : str50;
        str48 = (i20 & 8192) != 0 ? CardStruct.IStatusCode.DEFAULT : str48;
        str47 = (i20 & 16384) != 0 ? CardStruct.IStatusCode.DEFAULT : str47;
        str61 = (32768 & i20) != 0 ? CardStruct.IStatusCode.DEFAULT : str61;
        str39 = (65536 & i20) != 0 ? CardStruct.IStatusCode.DEFAULT : str39;
        str38 = (131072 & i20) != 0 ? CardStruct.IStatusCode.DEFAULT : str38;
        str37 = (262144 & i20) != 0 ? CardStruct.IStatusCode.DEFAULT : str37;
        str36 = (524288 & i20) != 0 ? "" : str36;
        str69 = (1048576 & i20) == 0 ? str34 : str69;
        list9 = (2097152 & i20) != 0 ? C13BV.INSTANCE : list9;
        z26 = (4194304 & i20) != 0 ? true : z26;
        z38 = (8388608 & i20) != 0 ? false : z38;
        z25 = (16777216 & i20) != 0 ? false : z25;
        z24 = (33554432 & i20) != 0 ? false : z24;
        i35 = (67108864 & i20) != 0 ? 0 : i35;
        i22 = (134217728 & i20) != 0 ? 0 : i22;
        if ((268435456 & i20) != 0) {
            list8 = null;
            tTSAudioBean2 = new TTSAudioBean(null, 1, null);
        } else {
            list8 = null;
        }
        this(str68, i34, i38, i37, str65, point2, i36, i31, i32, i23, list11, str64, z40, list10, j9, j7, f11, f9, j8, z41, z42, z37, pair2, enumC390580FTc2, f12, f10, z36, z35, z34, i29, str59, str60, str57, str58, i28, str56, arrayList2, i30, strArr2, textStickerTextWrapLIZJ, listLJ, innerEffectTextLayoutConfig2, textStickerCoverExtraData2, z31, z30, str62, str55, str54, str63, str52, str51, str49, textMotionModel2, f8, f13, i27, i25, i26, i24, fLJIIIZ, tTSVoiceModel2, z28, str46, str67, str45, str44, str43, str42, str41, z27, str40, j6, j10, arrayList, str66, str53, str50, str48, str47, str61, str39, str38, str37, str36, str69, list9, z26, z38, z25, z24, i35, i22, tTSAudioBean2, (536870912 & i20) != 0 ? 0 : i33, (1073741824 & i20) != 0 ? new LinkedHashMap() : map2, (i20 & Integer.MIN_VALUE) != 0 ? list8 : textStickerInfo2, (i21 & 1) != 0 ? list8 : textStyleModel2, (i21 & 2) != 0 ? new CaptionTemplateModel(false, list8, new CustomCaptionTemplateData(false, -1, 4, new TextMotionModel("", 0.0f, 0, "", "", "", 3, false, true, false), new TextFontModel(list8, list8, list8, list8, list8, list8, 0, 0, list8, list8, false, false, false, 0, 16383, list8), list8), false, false, false) : captionTemplateModel2, (i21 & 4) != 0 ? new TextEventTrackingModel(list8, list8, list8, list8, list8, list8, list8, list8, list8) : textEventTrackingModel2, (i21 & 8) != 0 ? true : z29, (i21 & 16) != 0 ? false : z23, (i21 & 32) == 0 ? str35 : "", (i21 & 64) == 0 ? list7 : list8, (i21 & 128) != 0 ? false : z32, (i21 & 256) != 0 ? false : z33, (i21 & 512) != 0 ? true : z39, (i21 & 1024) != 0 ? false : z22, (i21 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new TextStickerCompatModel(false, false, null, null, null, null, null, null, null, false, null, null, null, 0, null, 0.0f, null, null, null, null, null, 2097151, null) : textStickerCompatModel2);
    }
}
