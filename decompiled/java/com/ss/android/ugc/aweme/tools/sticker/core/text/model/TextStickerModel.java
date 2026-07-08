package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.AbstractC1442160ndG;
import X.C040H;
import X.C09CT;
import X.C0F7S;
import X.C0F7T;
import X.C0F8J;
import X.C0FHM;
import X.C0FKI;
import X.C0FVR;
import X.C123100dR;
import X.C13BV;
import X.C13LP;
import X.C1440500naa;
import X.C15438062q;
import X.C1919207fS;
import X.C19591311kt;
import X.C19598511m3;
import X.C2188811AlT;
import X.C384900F7g;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.ss.android.ugc.aweme.sticker.data.Word;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.EditViewUIState;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.StoryStreakTextStickerStyleModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextEventTrackingModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextHashtagModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMentionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMobModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes6.dex */
public final class TextStickerModel implements StickerModel, Parcelable {

    @C09CT("align")
    public final int align;

    @C09CT("auto_adapt_canvas")
    public boolean autoAdaptCanvas;

    @C09CT("auto_adapt_dpi")
    public boolean autoAdaptDpi;

    @C09CT("auto_line_break")
    public boolean autoLineBreak;

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("business_source")
    public final C0F7T businessSource;

    @C09CT("cacheWords")
    public List<Word> cacheWords;

    @C09CT("canvas_wh_fixed")
    public List<Float> canvasWHFixed;

    @C09CT("caption_model")
    public CaptionModel captionModel;

    @C09CT("caption_template")
    public CaptionTemplateModel captionTemplateModel;

    @C09CT("clickable")
    public final boolean clickable;

    @C09CT("clip_end")
    public long clipEnd;

    @C09CT("clip_start")
    public long clipStart;

    @C09CT("color")
    public final int color;

    @C09CT("compat_model")
    public TextStickerCompatModel compatModel;

    @C040H
    public transient EditViewUIState editViewUIState;

    @C09CT("editable")
    public final boolean editable;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enableGesture")
    public final boolean enableGesture;

    @C09CT("filter_selected")
    public boolean filterSelected;

    @C09CT("filter_tag")
    public String filterTag;

    @C09CT("fixed_font_size")
    public boolean fixedFontSize;

    @C09CT("font_model")
    public TextFontModel fontModel;

    @C09CT("force_effect_render")
    public boolean forceEffectRender;

    @C09CT("guide_type")
    public C0FVR guideType;

    @C09CT("hashtag_list")
    public List<TextHashtagModel> hashtagList;

    @C09CT("hint")
    public String hint;

    @C09CT("is_dm_text_sticker")
    public boolean isDMTextSticker;

    @C09CT("is_manual_edited")
    public boolean isManualEdited;

    @C09CT("lineSpacingExtra")
    public float lineSpacingExtra;

    @C09CT("mention_list")
    public List<TextMentionModel> mentionList;

    @C09CT("mob_model")
    public TextMobModel mobModel;

    @C09CT("mode")
    public final int mode;

    @C09CT("richContent")
    public final String richContent;

    @C09CT("source")
    public C0F7S sourceType;

    @C09CT("streak_text_style")
    public final StoryStreakTextStickerStyleModel streakTextStyleModel;

    @C09CT("text_event_tracking")
    public TextEventTrackingModel textEventTracking;

    @C09CT("text_motion_model")
    public TextMotionModel textMotionModel;

    @C09CT("text_sticker_info")
    public TextStickerInfo textStickerInfo;

    @C09CT("text_str")
    public final String textStr;

    @C09CT("text_str_with_line_break")
    public String textStrWithLineBreak;

    @C09CT("text_style")
    public TextStyleModel textStyle;

    @C09CT("text_template_model")
    public TextTemplateModel textTemplateModel;

    @C09CT("tts_model")
    public final TTSModel ttsModel;

    @C09CT("uuid")
    public String uuid;

    @C09CT("visible")
    public boolean visible;

    @C09CT("was_guide")
    public boolean wasGuide;

    @C09CT("mWords")
    public List<Word> words;
    public static final C384900F7g Companion = new Object() { // from class: X.0F7g
    };
    public static final Parcelable.Creator<TextStickerModel> CREATOR = new Parcelable.Creator<TextStickerModel>() { // from class: X.0F7R
        @Override // android.os.Parcelable.Creator
        public final TextStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            TTSModel tTSModelCreateFromParcel;
            CaptionModel captionModelCreateFromParcel;
            boolean z6;
            boolean z7;
            ArrayList arrayList;
            ArrayList arrayList2;
            boolean z8;
            boolean z9;
            TextStyleModel textStyleModelCreateFromParcel;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            float f = parcel.readFloat();
            TextFontModel textFontModelCreateFromParcel = TextFontModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
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
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                tTSModelCreateFromParcel = null;
            } else {
                tTSModelCreateFromParcel = TTSModel.CREATOR.createFromParcel(parcel);
            }
            TTSModel tTSModel = tTSModelCreateFromParcel;
            TextStickerInfo textStickerInfo = (TextStickerInfo) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                captionModelCreateFromParcel = null;
            } else {
                captionModelCreateFromParcel = CaptionModel.CREATOR.createFromParcel(parcel);
            }
            CaptionModel captionModel = captionModelCreateFromParcel;
            C0FVR c0fvrValueOf = C0FVR.valueOf(parcel.readString());
            TextMobModel textMobModelCreateFromParcel = TextMobModel.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            int i4 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList4.add(parcel.readSerializable());
            }
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i6 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i6);
            for (int i7 = 0; i7 != i6; i7++) {
                arrayList5.add(parcel.readSerializable());
            }
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            C0F7S c0f7sValueOf = C0F7S.valueOf(parcel.readString());
            TextMotionModel textMotionModelCreateFromParcel = TextMotionModel.CREATOR.createFromParcel(parcel);
            TextTemplateModel textTemplateModelCreateFromParcel = TextTemplateModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i8 = parcel.readInt();
                arrayList = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList.add(TextMentionModel.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i10 = parcel.readInt();
                arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList2.add(TextHashtagModel.CREATOR.createFromParcel(parcel));
                }
            }
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
            CaptionTemplateModel captionTemplateModelCreateFromParcel = CaptionTemplateModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                textStyleModelCreateFromParcel = null;
            } else {
                textStyleModelCreateFromParcel = TextStyleModel.CREATOR.createFromParcel(parcel);
            }
            TextStyleModel textStyleModel = textStyleModelCreateFromParcel;
            TextEventTrackingModel textEventTrackingModelCreateFromParcel = TextEventTrackingModel.CREATOR.createFromParcel(parcel);
            EditViewUIState editViewUIStateCreateFromParcel = EditViewUIState.CREATOR.createFromParcel(parcel);
            C0F7T c0f7tValueOf = C0F7T.valueOf(parcel.readString());
            StoryStreakTextStickerStyleModel storyStreakTextStickerStyleModelCreateFromParcel = StoryStreakTextStickerStyleModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList3 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList3.add(Float.valueOf(parcel.readFloat()));
                }
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
            return new TextStickerModel(baseStickerModelCreateFromParcel, string, string2, string3, string4, i, i2, i3, f, textFontModelCreateFromParcel, z, z2, z3, z4, z5, tTSModel, textStickerInfo, captionModel, c0fvrValueOf, textMobModelCreateFromParcel, string5, arrayList4, string6, z6, arrayList5, j, j2, c0f7sValueOf, textMotionModelCreateFromParcel, textTemplateModelCreateFromParcel, z7, arrayList, arrayList2, z8, z9, captionTemplateModelCreateFromParcel, textStyleModel, textEventTrackingModelCreateFromParcel, editViewUIStateCreateFromParcel, c0f7tValueOf, storyStreakTextStickerStyleModelCreateFromParcel, z10, z11, arrayList3, z12, z13, z14, TextStickerCompatModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerModel[] newArray(int i) {
            return new TextStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public TextStickerModel() {
        this(null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65535, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextStickerModel copy$default(TextStickerModel textStickerModel, BaseStickerModel baseStickerModel, String str, String str2, String str3, String str4, int i, int i2, int i3, float f, TextFontModel textFontModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TTSModel tTSModel, TextStickerInfo textStickerInfo, CaptionModel captionModel, C0FVR c0fvr, TextMobModel textMobModel, String str5, List list, String str6, boolean z6, List list2, long j, long j2, C0F7S c0f7s, TextMotionModel textMotionModel, TextTemplateModel textTemplateModel, boolean z7, List list3, List list4, boolean z8, boolean z9, CaptionTemplateModel captionTemplateModel, TextStyleModel textStyleModel, TextEventTrackingModel textEventTrackingModel, EditViewUIState editViewUIState, C0F7T c0f7t, StoryStreakTextStickerStyleModel storyStreakTextStickerStyleModel, boolean z10, boolean z11, List list5, boolean z12, boolean z13, boolean z14, TextStickerCompatModel textStickerCompatModel, int i4, int i5, Object obj) {
        boolean z15 = z;
        boolean z16 = z3;
        TextFontModel textFontModel2 = textFontModel;
        float f2 = f;
        boolean z17 = z2;
        int i6 = i3;
        int i7 = i2;
        int i8 = i;
        String str7 = str4;
        String str8 = str3;
        String str9 = str2;
        String str10 = str;
        BaseStickerModel baseStickerModel2 = baseStickerModel;
        boolean z18 = z14;
        boolean z19 = z13;
        boolean z20 = z11;
        boolean z21 = z10;
        C0F7T c0f7t2 = c0f7t;
        boolean z22 = z9;
        String str11 = str5;
        List list6 = list3;
        TextTemplateModel textTemplateModel2 = textTemplateModel;
        List list7 = list5;
        TextMotionModel textMotionModel2 = textMotionModel;
        TextStyleModel textStyleModel2 = textStyleModel;
        C0F7S c0f7s2 = c0f7s;
        EditViewUIState editViewUIState2 = editViewUIState;
        long j3 = j;
        TextEventTrackingModel textEventTrackingModel2 = textEventTrackingModel;
        boolean z23 = z7;
        List list8 = list2;
        CaptionTemplateModel captionTemplateModel2 = captionTemplateModel;
        boolean z24 = z6;
        String str12 = str6;
        List list9 = list4;
        StoryStreakTextStickerStyleModel storyStreakTextStickerStyleModel2 = storyStreakTextStickerStyleModel;
        TTSModel tTSModel2 = tTSModel;
        long j4 = j2;
        List list10 = list;
        boolean z25 = z4;
        TextMobModel textMobModel2 = textMobModel;
        boolean z26 = z12;
        C0FVR c0fvr2 = c0fvr;
        boolean z27 = z8;
        TextStickerInfo textStickerInfo2 = textStickerInfo;
        boolean z28 = z5;
        TextStickerCompatModel textStickerCompatModel2 = textStickerCompatModel;
        CaptionModel captionModel2 = captionModel;
        if ((i4 & 1) != 0) {
            baseStickerModel2 = textStickerModel.baseStickerModel;
        }
        if ((i4 & 2) != 0) {
            str10 = textStickerModel.uuid;
        }
        if ((i4 & 4) != 0) {
            str9 = textStickerModel.richContent;
        }
        if ((i4 & 8) != 0) {
            str8 = textStickerModel.textStr;
        }
        if ((i4 & 16) != 0) {
            str7 = textStickerModel.textStrWithLineBreak;
        }
        if ((i4 & 32) != 0) {
            i8 = textStickerModel.mode;
        }
        if ((i4 & 64) != 0) {
            i7 = textStickerModel.color;
        }
        if ((i4 & 128) != 0) {
            i6 = textStickerModel.align;
        }
        if ((i4 & 256) != 0) {
            f2 = textStickerModel.lineSpacingExtra;
        }
        if ((i4 & 512) != 0) {
            textFontModel2 = textStickerModel.fontModel;
        }
        if ((i4 & 1024) != 0) {
            z15 = textStickerModel.editable;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z17 = textStickerModel.clickable;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z16 = textStickerModel.enableGesture;
        }
        if ((i4 & 8192) != 0) {
            z25 = textStickerModel.visible;
        }
        if ((i4 & 16384) != 0) {
            z28 = textStickerModel.enable;
        }
        if ((i4 & 32768) != 0) {
            tTSModel2 = textStickerModel.ttsModel;
        }
        if ((65536 & i4) != 0) {
            textStickerInfo2 = textStickerModel.textStickerInfo;
        }
        if ((131072 & i4) != 0) {
            captionModel2 = textStickerModel.captionModel;
        }
        if ((262144 & i4) != 0) {
            c0fvr2 = textStickerModel.guideType;
        }
        if ((524288 & i4) != 0) {
            textMobModel2 = textStickerModel.mobModel;
        }
        if ((1048576 & i4) != 0) {
            str11 = textStickerModel.hint;
        }
        if ((2097152 & i4) != 0) {
            list10 = textStickerModel.words;
        }
        if ((4194304 & i4) != 0) {
            str12 = textStickerModel.filterTag;
        }
        if ((8388608 & i4) != 0) {
            z24 = textStickerModel.filterSelected;
        }
        if ((16777216 & i4) != 0) {
            list8 = textStickerModel.cacheWords;
        }
        if ((33554432 & i4) != 0) {
            j3 = textStickerModel.clipStart;
        }
        if ((67108864 & i4) != 0) {
            j4 = textStickerModel.clipEnd;
        }
        if ((134217728 & i4) != 0) {
            c0f7s2 = textStickerModel.sourceType;
        }
        if ((268435456 & i4) != 0) {
            textMotionModel2 = textStickerModel.textMotionModel;
        }
        if ((536870912 & i4) != 0) {
            textTemplateModel2 = textStickerModel.textTemplateModel;
        }
        if ((1073741824 & i4) != 0) {
            z23 = textStickerModel.isManualEdited;
        }
        if ((i4 & Integer.MIN_VALUE) != 0) {
            list6 = textStickerModel.mentionList;
        }
        if ((i5 & 1) != 0) {
            list9 = textStickerModel.hashtagList;
        }
        if ((i5 & 2) != 0) {
            z27 = textStickerModel.isDMTextSticker;
        }
        if ((i5 & 4) != 0) {
            z22 = textStickerModel.wasGuide;
        }
        if ((i5 & 8) != 0) {
            captionTemplateModel2 = textStickerModel.captionTemplateModel;
        }
        if ((i5 & 16) != 0) {
            textStyleModel2 = textStickerModel.textStyle;
        }
        if ((i5 & 32) != 0) {
            textEventTrackingModel2 = textStickerModel.textEventTracking;
        }
        if ((i5 & 64) != 0) {
            editViewUIState2 = textStickerModel.editViewUIState;
        }
        if ((i5 & 128) != 0) {
            c0f7t2 = textStickerModel.businessSource;
        }
        if ((i5 & 256) != 0) {
            storyStreakTextStickerStyleModel2 = textStickerModel.streakTextStyleModel;
        }
        if ((i5 & 512) != 0) {
            z21 = textStickerModel.autoLineBreak;
        }
        if ((i5 & 1024) != 0) {
            z20 = textStickerModel.forceEffectRender;
        }
        if ((i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            list7 = textStickerModel.canvasWHFixed;
        }
        if ((i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z26 = textStickerModel.autoAdaptCanvas;
        }
        if ((i5 & 8192) != 0) {
            z19 = textStickerModel.autoAdaptDpi;
        }
        if ((i5 & 16384) != 0) {
            z18 = textStickerModel.fixedFontSize;
        }
        if ((i5 & 32768) != 0) {
            textStickerCompatModel2 = textStickerModel.compatModel;
        }
        return textStickerModel.copy(baseStickerModel2, str10, str9, str8, str7, i8, i7, i6, f2, textFontModel2, z15, z17, z16, z25, z28, tTSModel2, textStickerInfo2, captionModel2, c0fvr2, textMobModel2, str11, list10, str12, z24, list8, j3, j4, c0f7s2, textMotionModel2, textTemplateModel2, z23, list6, list9, z27, z22, captionTemplateModel2, textStyleModel2, textEventTrackingModel2, editViewUIState2, c0f7t2, storyStreakTextStickerStyleModel2, z21, z20, list7, z26, z19, z18, textStickerCompatModel2);
    }

    public final TextStickerModel copy(BaseStickerModel baseStickerModel, String str, String str2, String str3, String str4, int i, int i2, int i3, float f, TextFontModel textFontModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TTSModel tTSModel, TextStickerInfo textStickerInfo, CaptionModel captionModel, C0FVR c0fvr, TextMobModel textMobModel, String str5, List<Word> list, String str6, boolean z6, List<Word> list2, long j, long j2, C0F7S c0f7s, TextMotionModel textMotionModel, TextTemplateModel textTemplateModel, boolean z7, List<TextMentionModel> list3, List<TextHashtagModel> list4, boolean z8, boolean z9, CaptionTemplateModel captionTemplateModel, TextStyleModel textStyleModel, TextEventTrackingModel textEventTrackingModel, EditViewUIState editViewUIState, C0F7T c0f7t, StoryStreakTextStickerStyleModel storyStreakTextStickerStyleModel, boolean z10, boolean z11, List<Float> list5, boolean z12, boolean z13, boolean z14, TextStickerCompatModel textStickerCompatModel) {
        return new TextStickerModel(baseStickerModel, str, str2, str3, str4, i, i2, i3, f, textFontModel, z, z2, z3, z4, z5, tTSModel, textStickerInfo, captionModel, c0fvr, textMobModel, str5, list, str6, z6, list2, j, j2, c0f7s, textMotionModel, textTemplateModel, z7, list3, list4, z8, z9, captionTemplateModel, textStyleModel, textEventTrackingModel, editViewUIState, c0f7t, storyStreakTextStickerStyleModel, z10, z11, list5, z12, z13, z14, textStickerCompatModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStickerModel)) {
            return false;
        }
        TextStickerModel textStickerModel = (TextStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, textStickerModel.baseStickerModel) && Intrinsics.LJFF(this.uuid, textStickerModel.uuid) && Intrinsics.LJFF(this.richContent, textStickerModel.richContent) && Intrinsics.LJFF(this.textStr, textStickerModel.textStr) && Intrinsics.LJFF(this.textStrWithLineBreak, textStickerModel.textStrWithLineBreak) && this.mode == textStickerModel.mode && this.color == textStickerModel.color && this.align == textStickerModel.align && Float.compare(this.lineSpacingExtra, textStickerModel.lineSpacingExtra) == 0 && Intrinsics.LJFF(this.fontModel, textStickerModel.fontModel) && this.editable == textStickerModel.editable && this.clickable == textStickerModel.clickable && this.enableGesture == textStickerModel.enableGesture && this.visible == textStickerModel.visible && this.enable == textStickerModel.enable && Intrinsics.LJFF(this.ttsModel, textStickerModel.ttsModel) && Intrinsics.LJFF(this.textStickerInfo, textStickerModel.textStickerInfo) && Intrinsics.LJFF(this.captionModel, textStickerModel.captionModel) && this.guideType == textStickerModel.guideType && Intrinsics.LJFF(this.mobModel, textStickerModel.mobModel) && Intrinsics.LJFF(this.hint, textStickerModel.hint) && Intrinsics.LJFF(this.words, textStickerModel.words) && Intrinsics.LJFF(this.filterTag, textStickerModel.filterTag) && this.filterSelected == textStickerModel.filterSelected && Intrinsics.LJFF(this.cacheWords, textStickerModel.cacheWords) && this.clipStart == textStickerModel.clipStart && this.clipEnd == textStickerModel.clipEnd && this.sourceType == textStickerModel.sourceType && Intrinsics.LJFF(this.textMotionModel, textStickerModel.textMotionModel) && Intrinsics.LJFF(this.textTemplateModel, textStickerModel.textTemplateModel) && this.isManualEdited == textStickerModel.isManualEdited && Intrinsics.LJFF(this.mentionList, textStickerModel.mentionList) && Intrinsics.LJFF(this.hashtagList, textStickerModel.hashtagList) && this.isDMTextSticker == textStickerModel.isDMTextSticker && this.wasGuide == textStickerModel.wasGuide && Intrinsics.LJFF(this.captionTemplateModel, textStickerModel.captionTemplateModel) && Intrinsics.LJFF(this.textStyle, textStickerModel.textStyle) && Intrinsics.LJFF(this.textEventTracking, textStickerModel.textEventTracking) && Intrinsics.LJFF(this.editViewUIState, textStickerModel.editViewUIState) && this.businessSource == textStickerModel.businessSource && Intrinsics.LJFF(this.streakTextStyleModel, textStickerModel.streakTextStyleModel) && this.autoLineBreak == textStickerModel.autoLineBreak && this.forceEffectRender == textStickerModel.forceEffectRender && Intrinsics.LJFF(this.canvasWHFixed, textStickerModel.canvasWHFixed) && this.autoAdaptCanvas == textStickerModel.autoAdaptCanvas && this.autoAdaptDpi == textStickerModel.autoAdaptDpi && this.fixedFontSize == textStickerModel.fixedFontSize && Intrinsics.LJFF(this.compatModel, textStickerModel.compatModel);
    }

    public String toString() {
        return "TextStickerModel(baseStickerModel=" + this.baseStickerModel + ", uuid=" + this.uuid + ", richContent=" + this.richContent + ", textStr=" + this.textStr + ", textStrWithLineBreak=" + this.textStrWithLineBreak + ", mode=" + this.mode + ", color=" + this.color + ", align=" + this.align + ", lineSpacingExtra=" + this.lineSpacingExtra + ", fontModel=" + this.fontModel + ", editable=" + this.editable + ", clickable=" + this.clickable + ", enableGesture=" + this.enableGesture + ", visible=" + this.visible + ", enable=" + this.enable + ", ttsModel=" + this.ttsModel + ", textStickerInfo=" + this.textStickerInfo + ", captionModel=" + this.captionModel + ", guideType=" + this.guideType + ", mobModel=" + this.mobModel + ", hint=" + this.hint + ", words=" + this.words + ", filterTag=" + this.filterTag + ", filterSelected=" + this.filterSelected + ", cacheWords=" + this.cacheWords + ", clipStart=" + this.clipStart + ", clipEnd=" + this.clipEnd + ", sourceType=" + this.sourceType + ", textMotionModel=" + this.textMotionModel + ", textTemplateModel=" + this.textTemplateModel + ", isManualEdited=" + this.isManualEdited + ", mentionList=" + this.mentionList + ", hashtagList=" + this.hashtagList + ", isDMTextSticker=" + this.isDMTextSticker + ", wasGuide=" + this.wasGuide + ", captionTemplateModel=" + this.captionTemplateModel + ", textStyle=" + this.textStyle + ", textEventTracking=" + this.textEventTracking + ", editViewUIState=" + this.editViewUIState + ", businessSource=" + this.businessSource + ", streakTextStyleModel=" + this.streakTextStyleModel + ", autoLineBreak=" + this.autoLineBreak + ", forceEffectRender=" + this.forceEffectRender + ", canvasWHFixed=" + this.canvasWHFixed + ", autoAdaptCanvas=" + this.autoAdaptCanvas + ", autoAdaptDpi=" + this.autoAdaptDpi + ", fixedFontSize=" + this.fixedFontSize + ", compatModel=" + this.compatModel + ')';
    }

    public final TextStickerModel deepCopy() {
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null);
        TextFontModel textFontModelLIZ = TextFontModel.LIZ(this.fontModel, null, null, null, null, null, null, 0, 0, null, null, false, false, 0, 16383);
        TTSModel tTSModel = this.ttsModel;
        TTSModel tTSModelLIZ = tTSModel != null ? TTSModel.LIZ(tTSModel) : null;
        CaptionModel captionModel = this.captionModel;
        return copy$default(this, baseStickerModelCopy$default, null, null, null, null, 0, 0, 0, 0.0f, textFontModelLIZ, false, false, false, false, false, tTSModelLIZ, null, captionModel != null ? new CaptionModel(captionModel.isEditorProCaption) : null, null, null, null, null, null, false, null, 0L, 0L, null, TextMotionModel.LIZ(this.textMotionModel, null, 0.0f, 0, null, null, 0, false, 1023), TextTemplateModel.LIZ(this.textTemplateModel, null, 268435455), false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -805470722, 65535, null);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        interactStickerStructLIZLLL.setType(getCaptionModel() != null ? 20 : 18);
        interactStickerStructLIZLLL.setIndex(getBaseModel().getZIndex());
        HashMap map = new HashMap();
        map.put("text_sticker_id", String.valueOf(getBaseModel().getId()));
        interactStickerStructLIZLLL.setAttr(GsonProtectorUtils.toJson(C19598511m3.LIZ(), map));
        interactStickerStructLIZLLL.setTextInfo(this.textStickerInfo);
        interactStickerStructLIZLLL.setTextStruct(this.textStr);
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        String str = this.uuid;
        int iHashCode2 = (((((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.richContent.hashCode()) * 31) + this.textStr.hashCode()) * 31) + this.textStrWithLineBreak.hashCode()) * 31) + this.mode) * 31) + this.color) * 31) + this.align) * 31) + Float.floatToIntBits(this.lineSpacingExtra)) * 31) + this.fontModel.hashCode()) * 31) + C786410Ut5.Z2(this.editable)) * 31) + C786410Ut5.Z2(this.clickable)) * 31) + C786410Ut5.Z2(this.enableGesture)) * 31) + C786410Ut5.Z2(this.visible)) * 31) + C786410Ut5.Z2(this.enable)) * 31;
        TTSModel tTSModel = this.ttsModel;
        int iHashCode3 = (iHashCode2 + (tTSModel == null ? 0 : tTSModel.hashCode())) * 31;
        TextStickerInfo textStickerInfo = this.textStickerInfo;
        int iHashCode4 = (iHashCode3 + (textStickerInfo == null ? 0 : textStickerInfo.hashCode())) * 31;
        CaptionModel captionModel = this.captionModel;
        int iHashCode5 = (((((((((((((((((((((((((((iHashCode4 + (captionModel == null ? 0 : captionModel.hashCode())) * 31) + this.guideType.hashCode()) * 31) + this.mobModel.hashCode()) * 31) + this.hint.hashCode()) * 31) + this.words.hashCode()) * 31) + this.filterTag.hashCode()) * 31) + C786410Ut5.Z2(this.filterSelected)) * 31) + this.cacheWords.hashCode()) * 31) + C786410Ut5.Y2(this.clipStart)) * 31) + C786410Ut5.Y2(this.clipEnd)) * 31) + this.sourceType.hashCode()) * 31) + this.textMotionModel.hashCode()) * 31) + this.textTemplateModel.hashCode()) * 31) + C786410Ut5.Z2(this.isManualEdited)) * 31;
        List<TextMentionModel> list = this.mentionList;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<TextHashtagModel> list2 = this.hashtagList;
        int iHashCode7 = (((((((iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31) + C786410Ut5.Z2(this.isDMTextSticker)) * 31) + C786410Ut5.Z2(this.wasGuide)) * 31) + this.captionTemplateModel.hashCode()) * 31;
        TextStyleModel textStyleModel = this.textStyle;
        int iHashCode8 = (((((((((((((iHashCode7 + (textStyleModel == null ? 0 : textStyleModel.hashCode())) * 31) + this.textEventTracking.hashCode()) * 31) + this.editViewUIState.hashCode()) * 31) + this.businessSource.hashCode()) * 31) + this.streakTextStyleModel.hashCode()) * 31) + C786410Ut5.Z2(this.autoLineBreak)) * 31) + C786410Ut5.Z2(this.forceEffectRender)) * 31;
        List<Float> list3 = this.canvasWHFixed;
        return ((((((((iHashCode8 + (list3 != null ? list3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.autoAdaptCanvas)) * 31) + C786410Ut5.Z2(this.autoAdaptDpi)) * 31) + C786410Ut5.Z2(this.fixedFontSize)) * 31) + this.compatModel.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        String str;
        boolean z = false;
        if (this.textTemplateModel.isGroupTextTemplates && !this.isManualEdited) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isNotEmptyModel: textTemplateModel.isGroupTextTemplates && isManualEdited:");
            sbLIZ.append(this.isManualEdited);
            C0F8J.LIZ("inspiration", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if ((C123100dR.LIZ(this.textStr) && (!a0.LJJJIL(this.textStr))) || (!a0.LJJJIL(this.hint))) {
            z = true;
            break;
        }
        if (this.textTemplateModel.isGroupTextTemplates) {
            List<SubTemplateInfo> subTemplates = this.compatModel.getSubTemplates();
            if (!(subTemplates instanceof Collection) || !subTemplates.isEmpty()) {
                for (SubTemplateInfo subTemplateInfo : subTemplates) {
                    if (C123100dR.LIZ(subTemplateInfo.text) && (str = subTemplateInfo.text) != null && (!a0.LJJJIL(str))) {
                        z = true;
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("isNotEmptyModel: isNotEmpty:");
        sb.append(z);
        sb.append(" textStr:");
        sb.append(this.textStr);
        sb.append(" hint:");
        sb.append(this.hint);
        sb.append(" isGroupTextTemplates:");
        sb.append(this.textTemplateModel.isGroupTextTemplates);
        sb.append(' ');
        List<SubTemplateInfo> subTemplates2 = this.compatModel.getSubTemplates();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(subTemplates2, 10));
        Iterator<SubTemplateInfo> it2 = subTemplates2.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().text);
        }
        sb.append(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        C0F8J.LIZ("inspiration", sb.toString());
        return z;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isVERenderSticker() {
        String str;
        if (this.forceEffectRender || this.textMotionModel.motionEnabled == 1) {
            return true;
        }
        TextStyleModel textStyleModel = this.textStyle;
        return !(textStyleModel == null || !textStyleModel.isEffectStyle || (str = textStyleModel.path) == null || a0.LJJJIL(str)) || this.textTemplateModel.enableTextTemplate;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean needCompile() {
        return !isVERenderSticker();
    }

    public final int getAlign() {
        return this.align;
    }

    public final boolean getAutoAdaptCanvas() {
        return this.autoAdaptCanvas;
    }

    public final boolean getAutoAdaptDpi() {
        return this.autoAdaptDpi;
    }

    public final boolean getAutoLineBreak() {
        return this.autoLineBreak;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final C0F7T getBusinessSource() {
        return this.businessSource;
    }

    public final List<Word> getCacheWords() {
        return this.cacheWords;
    }

    public final List<Float> getCanvasWHFixed() {
        return this.canvasWHFixed;
    }

    public final CaptionModel getCaptionModel() {
        return this.captionModel;
    }

    public final CaptionTemplateModel getCaptionTemplateModel() {
        return this.captionTemplateModel;
    }

    public final boolean getClickable() {
        return this.clickable;
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

    public final EditViewUIState getEditViewUIState() {
        return this.editViewUIState;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getEnableGesture() {
        return this.enableGesture;
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

    public final TextFontModel getFontModel() {
        return this.fontModel;
    }

    public final boolean getForceEffectRender() {
        return this.forceEffectRender;
    }

    public final C0FVR getGuideType() {
        return this.guideType;
    }

    public final List<TextHashtagModel> getHashtagList() {
        return this.hashtagList;
    }

    public final String getHint() {
        return this.hint;
    }

    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    public final List<TextMentionModel> getMentionList() {
        return this.mentionList;
    }

    public final TextMobModel getMobModel() {
        return this.mobModel;
    }

    public final int getMode() {
        return this.mode;
    }

    public final String getRichContent() {
        return this.richContent;
    }

    public final C0F7S getSourceType() {
        return this.sourceType;
    }

    public final StoryStreakTextStickerStyleModel getStreakTextStyleModel() {
        return this.streakTextStyleModel;
    }

    public final TextEventTrackingModel getTextEventTracking() {
        return this.textEventTracking;
    }

    public final TextMotionModel getTextMotionModel() {
        return this.textMotionModel;
    }

    public final TextStickerInfo getTextStickerInfo() {
        return this.textStickerInfo;
    }

    public final String getTextStr() {
        return this.textStr;
    }

    public final String getTextStrWithLineBreak() {
        return this.textStrWithLineBreak;
    }

    public final TextStyleModel getTextStyle() {
        return this.textStyle;
    }

    public final TextTemplateModel getTextTemplateModel() {
        return this.textTemplateModel;
    }

    public final TTSModel getTtsModel() {
        return this.ttsModel;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final boolean getWasGuide() {
        return this.wasGuide;
    }

    public final List<Word> getWords() {
        return this.words;
    }

    public final boolean isDMTextSticker() {
        return this.isDMTextSticker;
    }

    public final boolean isManualEdited() {
        return this.isManualEdited;
    }

    public final void setAutoAdaptCanvas(boolean z) {
        this.autoAdaptCanvas = z;
    }

    public final void setAutoAdaptDpi(boolean z) {
        this.autoAdaptDpi = z;
    }

    public final void setAutoLineBreak(boolean z) {
        this.autoLineBreak = z;
    }

    public final void setCacheWords(List<Word> list) {
        this.cacheWords = list;
    }

    public final void setCanvasWHFixed(List<Float> list) {
        this.canvasWHFixed = list;
    }

    public final void setCaptionModel(CaptionModel captionModel) {
        this.captionModel = captionModel;
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

    public final void setCompatModel(TextStickerCompatModel textStickerCompatModel) {
        this.compatModel = textStickerCompatModel;
    }

    public final void setDMTextSticker(boolean z) {
        this.isDMTextSticker = z;
    }

    public final void setEditViewUIState(EditViewUIState editViewUIState) {
        this.editViewUIState = editViewUIState;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
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

    public final void setFontModel(TextFontModel textFontModel) {
        this.fontModel = textFontModel;
    }

    public final void setForceEffectRender(boolean z) {
        this.forceEffectRender = z;
    }

    public final void setGuideType(C0FVR c0fvr) {
        this.guideType = c0fvr;
    }

    public final void setHashtagList(List<TextHashtagModel> list) {
        this.hashtagList = list;
    }

    public final void setHint(String str) {
        this.hint = str;
    }

    public final void setLineSpacingExtra(float f) {
        this.lineSpacingExtra = f;
    }

    public final void setManualEdited(boolean z) {
        this.isManualEdited = z;
    }

    public final void setMentionList(List<TextMentionModel> list) {
        this.mentionList = list;
    }

    public final void setMobModel(TextMobModel textMobModel) {
        this.mobModel = textMobModel;
    }

    public final void setSourceType(C0F7S c0f7s) {
        this.sourceType = c0f7s;
    }

    public final void setTextEventTracking(TextEventTrackingModel textEventTrackingModel) {
        this.textEventTracking = textEventTrackingModel;
    }

    public final void setTextMotionModel(TextMotionModel textMotionModel) {
        this.textMotionModel = textMotionModel;
    }

    public final void setTextStickerInfo(TextStickerInfo textStickerInfo) {
        this.textStickerInfo = textStickerInfo;
    }

    public final void setTextStrWithLineBreak(String str) {
        this.textStrWithLineBreak = str;
    }

    public final void setTextStyle(TextStyleModel textStyleModel) {
        this.textStyle = textStyleModel;
    }

    public final void setTextTemplateModel(TextTemplateModel textTemplateModel) {
        this.textTemplateModel = textTemplateModel;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    public final void setVisible(boolean z) {
        this.visible = z;
    }

    public final void setWasGuide(boolean z) {
        this.wasGuide = z;
    }

    public final void setWords(List<Word> list) {
        this.words = list;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy$default(this, BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeString(this.uuid);
        parcel.writeString(this.richContent);
        parcel.writeString(this.textStr);
        parcel.writeString(this.textStrWithLineBreak);
        parcel.writeInt(this.mode);
        parcel.writeInt(this.color);
        parcel.writeInt(this.align);
        parcel.writeFloat(this.lineSpacingExtra);
        this.fontModel.writeToParcel(parcel, i);
        parcel.writeInt(this.editable ? 1 : 0);
        parcel.writeInt(this.clickable ? 1 : 0);
        parcel.writeInt(this.enableGesture ? 1 : 0);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeInt(this.enable ? 1 : 0);
        TTSModel tTSModel = this.ttsModel;
        if (tTSModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tTSModel.writeToParcel(parcel, i);
        }
        parcel.writeSerializable(this.textStickerInfo);
        CaptionModel captionModel = this.captionModel;
        if (captionModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(captionModel.isEditorProCaption ? 1 : 0);
        }
        parcel.writeString(this.guideType.name());
        this.mobModel.writeToParcel(parcel, i);
        parcel.writeString(this.hint);
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
        parcel.writeString(this.sourceType.name());
        this.textMotionModel.writeToParcel(parcel, i);
        this.textTemplateModel.writeToParcel(parcel, i);
        parcel.writeInt(this.isManualEdited ? 1 : 0);
        List<TextMentionModel> list3 = this.mentionList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<TextMentionModel> it4 = list3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        List<TextHashtagModel> list4 = this.hashtagList;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<TextHashtagModel> it5 = list4.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.isDMTextSticker ? 1 : 0);
        parcel.writeInt(this.wasGuide ? 1 : 0);
        this.captionTemplateModel.writeToParcel(parcel, i);
        TextStyleModel textStyleModel = this.textStyle;
        if (textStyleModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textStyleModel.writeToParcel(parcel, i);
        }
        this.textEventTracking.writeToParcel(parcel, i);
        this.editViewUIState.writeToParcel(parcel, i);
        parcel.writeString(this.businessSource.name());
        this.streakTextStyleModel.writeToParcel(parcel, i);
        parcel.writeInt(this.autoLineBreak ? 1 : 0);
        parcel.writeInt(this.forceEffectRender ? 1 : 0);
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
        this.compatModel.writeToParcel(parcel, i);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(final Context context, final String str, final C1440500naa c1440500naa, final C0FKI c0fki, final String str2) {
        return new AbstractC1442160ndG<TextStickerModel>(context, str, c1440500naa, c0fki, str2) { // from class: X.0F7n
            public final Context LIZJ;
            public final String LIZLLL;
            public final C0FKI LJ;
            public final String LJFF;

            @Override // X.AbstractC1442160ndG
            public final EnumC1466150oFx LIZJ() {
                return EnumC1466150oFx.TEXT;
            }

            @Override // X.AbstractC1442160ndG
            public final String LIZ(StickerModel stickerModel) {
                String strLIZIZ = this.LIZLLL;
                String str3 = this.LJFF;
                int id = ((TextStickerModel) stickerModel).getId();
                String str4 = File.separator;
                if (!u.LJIIZILJ(strLIZIZ, str4, false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(str4);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("text_sticker_");
                sbLIZ2.append(str3);
                sbLIZ2.append('_');
                sbLIZ2.append(id);
                sbLIZ2.append(".png");
                return C2188811AlT.LIZIZ(sbLIZ2);
            }

            @Override // X.AbstractC1442160ndG
            public final View LIZIZ(StickerModel stickerModel) {
                TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
                C385340F8y c385340F8y = new C385340F8y(this.LIZJ);
                c385340F8y.setUseAutoTextSize(false);
                C384980F7o c384980F7o = new C384980F7o(this.LJ);
                c385340F8y.LLJ = null;
                c385340F8y.LLJI = c384980F7o;
                c385340F8y.LIZJ(textStickerModel.getInteractStickerStruct(), textStickerModel);
                return c385340F8y;
            }

            @Override // X.AbstractC1442160ndG
            public final StickerModel LIZLLL(StickerModel stickerModel, int i, int i2) {
                TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
                return TextStickerModel.copy$default(textStickerModel, BaseStickerModel.copy$default(textStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, i, i2, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -385, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null);
            }

            {
                super(context, c1440500naa);
                this.LIZJ = context;
                this.LIZLLL = str;
                this.LJ = c0fki;
                this.LJFF = str2;
            }
        };
    }

    public TextStickerModel(BaseStickerModel baseStickerModel, String str, String str2, String str3, String str4, int i, int i2, int i3, float f, TextFontModel textFontModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TTSModel tTSModel, TextStickerInfo textStickerInfo, CaptionModel captionModel, C0FVR c0fvr, TextMobModel textMobModel, String str5, List<Word> list, String str6, boolean z6, List<Word> list2, long j, long j2, C0F7S c0f7s, TextMotionModel textMotionModel, TextTemplateModel textTemplateModel, boolean z7, List<TextMentionModel> list3, List<TextHashtagModel> list4, boolean z8, boolean z9, CaptionTemplateModel captionTemplateModel, TextStyleModel textStyleModel, TextEventTrackingModel textEventTrackingModel, EditViewUIState editViewUIState, C0F7T c0f7t, StoryStreakTextStickerStyleModel storyStreakTextStickerStyleModel, boolean z10, boolean z11, List<Float> list5, boolean z12, boolean z13, boolean z14, TextStickerCompatModel textStickerCompatModel) {
        this.baseStickerModel = baseStickerModel;
        this.uuid = str;
        this.richContent = str2;
        this.textStr = str3;
        this.textStrWithLineBreak = str4;
        this.mode = i;
        this.color = i2;
        this.align = i3;
        this.lineSpacingExtra = f;
        this.fontModel = textFontModel;
        this.editable = z;
        this.clickable = z2;
        this.enableGesture = z3;
        this.visible = z4;
        this.enable = z5;
        this.ttsModel = tTSModel;
        this.textStickerInfo = textStickerInfo;
        this.captionModel = captionModel;
        this.guideType = c0fvr;
        this.mobModel = textMobModel;
        this.hint = str5;
        this.words = list;
        this.filterTag = str6;
        this.filterSelected = z6;
        this.cacheWords = list2;
        this.clipStart = j;
        this.clipEnd = j2;
        this.sourceType = c0f7s;
        this.textMotionModel = textMotionModel;
        this.textTemplateModel = textTemplateModel;
        this.isManualEdited = z7;
        this.mentionList = list3;
        this.hashtagList = list4;
        this.isDMTextSticker = z8;
        this.wasGuide = z9;
        this.captionTemplateModel = captionTemplateModel;
        this.textStyle = textStyleModel;
        this.textEventTracking = textEventTrackingModel;
        this.editViewUIState = editViewUIState;
        this.businessSource = c0f7t;
        this.streakTextStyleModel = storyStreakTextStickerStyleModel;
        this.autoLineBreak = z10;
        this.forceEffectRender = z11;
        this.canvasWHFixed = list5;
        this.autoAdaptCanvas = z12;
        this.autoAdaptDpi = z13;
        this.fixedFontSize = z14;
        this.compatModel = textStickerCompatModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextStickerModel(BaseStickerModel baseStickerModel, String str, String str2, String str3, String str4, int i, int i2, int i3, float f, TextFontModel textFontModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TTSModel tTSModel, TextStickerInfo textStickerInfo, CaptionModel captionModel, C0FVR c0fvr, TextMobModel textMobModel, String str5, List list, String str6, boolean z6, List list2, long j, long j2, C0F7S c0f7s, TextMotionModel textMotionModel, TextTemplateModel textTemplateModel, boolean z7, List list3, List list4, boolean z8, boolean z9, CaptionTemplateModel captionTemplateModel, TextStyleModel textStyleModel, TextEventTrackingModel textEventTrackingModel, EditViewUIState editViewUIState, C0F7T c0f7t, StoryStreakTextStickerStyleModel storyStreakTextStickerStyleModel, boolean z10, boolean z11, List list5, boolean z12, boolean z13, boolean z14, TextStickerCompatModel textStickerCompatModel, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        int i6 = i3;
        List list6 = list5;
        C0F7T c0f7t2 = c0f7t;
        EditViewUIState editViewUIState2 = editViewUIState;
        TextEventTrackingModel textEventTrackingModel2 = textEventTrackingModel;
        TextStyleModel textStyleModel2 = textStyleModel;
        CaptionTemplateModel captionTemplateModel2 = captionTemplateModel;
        boolean z15 = z9;
        boolean z16 = z8;
        List list7 = list4;
        boolean z17 = z7;
        TextTemplateModel textTemplateModel2 = textTemplateModel;
        TextMotionModel textMotionModel2 = textMotionModel;
        C0F7S c0f7s2 = c0f7s;
        long j3 = j;
        List list8 = list2;
        List list9 = list;
        TextMobModel textMobModel2 = textMobModel;
        C0FVR c0fvr2 = c0fvr;
        CaptionModel captionModel2 = captionModel;
        boolean z18 = z;
        boolean z19 = z12;
        List list10 = list3;
        TextStickerInfo textStickerInfo2 = textStickerInfo;
        TTSModel tTSModel2 = tTSModel;
        String str7 = str5;
        boolean z20 = z3;
        boolean z21 = z2;
        String str8 = str4;
        boolean z22 = z11;
        TextFontModel textFontModel2 = textFontModel;
        float fLJIIIZ = f;
        String str9 = str;
        boolean z23 = z10;
        int i7 = i2;
        int i8 = i;
        boolean z24 = z5;
        StoryStreakTextStickerStyleModel storyStreakTextStickerStyleModel2 = storyStreakTextStickerStyleModel;
        boolean z25 = z14;
        String str10 = str3;
        TextStickerCompatModel textStickerCompatModel2 = textStickerCompatModel;
        String str11 = str2;
        boolean z26 = z6;
        boolean z27 = z4;
        BaseStickerModel baseStickerModel2 = (i4 & 1) != 0 ? new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null) : baseStickerModel;
        str9 = (i4 & 2) != 0 ? null : str9;
        str11 = (i4 & 4) != 0 ? "" : str11;
        str10 = (i4 & 8) != 0 ? "" : str10;
        str8 = (i4 & 16) != 0 ? "" : str8;
        i8 = (i4 & 32) != 0 ? 1 : i8;
        i7 = (i4 & 64) != 0 ? -1 : i7;
        i6 = (i4 & 128) != 0 ? 2 : i6;
        fLJIIIZ = (i4 & 256) != 0 ? C1919207fS.LJIIIZ() : fLJIIIZ;
        textFontModel2 = (i4 & 512) != 0 ? new TextFontModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383, 0 == true ? 1 : 0) : textFontModel2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        z18 = (i4 & 1024) != 0 ? false : z18;
        z21 = (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z21;
        z20 = (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? true : z20;
        z27 = (i4 & 8192) != 0 ? true : z27;
        z24 = (i4 & 16384) != 0 ? true : z24;
        tTSModel2 = (i4 & 32768) != 0 ? null : tTSModel2;
        textStickerInfo2 = (65536 & i4) != 0 ? null : textStickerInfo2;
        captionModel2 = (131072 & i4) != 0 ? null : captionModel2;
        c0fvr2 = (262144 & i4) != 0 ? C0FVR.NONE : c0fvr2;
        textMobModel2 = (524288 & i4) != 0 ? new TextMobModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0) : textMobModel2;
        str7 = (1048576 & i4) != 0 ? "" : str7;
        list9 = (2097152 & i4) != 0 ? C13BV.INSTANCE : list9;
        String str12 = (4194304 & i4) == 0 ? str6 : "";
        z26 = (8388608 & i4) != 0 ? false : z26;
        list8 = (16777216 & i4) != 0 ? C13BV.INSTANCE : list8;
        j3 = (33554432 & i4) != 0 ? 0L : j3;
        long j4 = (67108864 & i4) == 0 ? j2 : 0L;
        c0f7s2 = (134217728 & i4) != 0 ? C0F7S.EDIT : c0f7s2;
        textMotionModel2 = (268435456 & i4) != 0 ? new TextMotionModel("", 0.0f, 0, "", "", "", 3, false, true, false) : textMotionModel2;
        textTemplateModel2 = (536870912 & i4) != 0 ? new TextTemplateModel(null, false, false, false, null, false, false, false, null, null, null, false, false, null, null, 0, null, false, false, false, false, null, null, false, false, 0, null, null, 268435455, null) : textTemplateModel2;
        z17 = (1073741824 & i4) != 0 ? false : z17;
        list10 = (i4 & Integer.MIN_VALUE) != 0 ? null : list10;
        list7 = (i5 & 1) != 0 ? null : list7;
        z16 = (i5 & 2) != 0 ? false : z16;
        z15 = (i5 & 4) != 0 ? false : z15;
        captionTemplateModel2 = (i5 & 8) != 0 ? new CaptionTemplateModel(false, null, new CustomCaptionTemplateData(false, -1, 4, new TextMotionModel("", 0.0f, 0, "", "", "", 3, false, true, false), new TextFontModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 16383, 0 == true ? 1 : 0), null), false, false, false) : captionTemplateModel2;
        textStyleModel2 = (i5 & 16) != 0 ? null : textStyleModel2;
        textEventTrackingModel2 = (i5 & 32) != 0 ? new TextEventTrackingModel(null, null, null, null, null, null, null, null, null) : textEventTrackingModel2;
        if ((i5 & 64) != 0) {
            C0FHM c0fhm = null;
            editViewUIState2 = new EditViewUIState(c0fhm, c0fhm, 7);
        }
        this(baseStickerModel2, str9, str11, str10, str8, i8, i7, i6, fLJIIIZ, textFontModel2, z18, z21, z20, z27, z24, tTSModel2, textStickerInfo2, captionModel2, c0fvr2, textMobModel2, str7, list9, str12, z26, list8, j3, j4, c0f7s2, textMotionModel2, textTemplateModel2, z17, list10, list7, z16, z15, captionTemplateModel2, textStyleModel2, textEventTrackingModel2, editViewUIState2, (i5 & 128) != 0 ? C0F7T.DEFAULT : c0f7t2, (i5 & 256) != 0 ? new StoryStreakTextStickerStyleModel(0, 0, 0) : storyStreakTextStickerStyleModel2, (i5 & 512) != 0 ? true : z23, (i5 & 1024) != 0 ? false : z22, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : list6, (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z19, (i5 & 8192) == 0 ? z13 : false, (i5 & 16384) != 0 ? true : z25, (i5 & 32768) != 0 ? new TextStickerCompatModel(false, false, null, null, null, null, null, null, null, false, null, null, null, 0, null, 0.0f, null, null, null, null, null, 2097151, null) : textStickerCompatModel2);
    }
}
