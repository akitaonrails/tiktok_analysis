package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import X.EnumC363350EMj;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.AtomAnimation;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.RichContentDependRes;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.StickerAnimation;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TransformAnchor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextStickerCompatModel implements Parcelable, Serializable {

    @C09CT("anchor")
    public final TransformAnchor anchor;

    @C09CT("atom_animations")
    public final List<AtomAnimation> atomAnimations;

    @C09CT("capitalization_state")
    public EnumC363350EMj capitalizationState;

    @C09CT("preview_width")
    public float groupTemplatePreviewBoundWidth;

    @C09CT("hint_color")
    public Integer hintColor;

    @C09CT("is_from_mae_template")
    public boolean isFromMaeTemplate;

    @C09CT("is_from_pugc_template")
    public boolean isFromPugcTemplate;

    @C09CT("is_used_pov_theme")
    public boolean isUsedPovTheme;

    @C09CT("meme_sound_bgm_uuid")
    public String memeSoundBgmUuid;

    @C09CT("meme_sound_music_id")
    public String memeSoundMusicId;

    @C09CT("min_font_size")
    public Float minFontSize;

    @C09CT("imagine_studio_text_width")
    public Integer mixStudioTextWidth;

    @C09CT("ori_text_str")
    public String oriTextStr;

    @C09CT("ori_text_str_with_break")
    public String oriTextStrWithBreak;

    @C09CT("rich_content_depend_res")
    public final List<RichContentDependRes> richContentDependRes;

    @C09CT("select_pov_text")
    public String selectPovText;

    @C09CT("selected_sub_slot_index")
    public int selectSlotIndex;

    @C09CT("show_punctuation")
    public Boolean showPunctuation;

    @C09CT("sticker_animation")
    public final StickerAnimation stickerAnimation;

    @C09CT("sub_templates")
    public List<SubTemplateInfo> subTemplates;

    @C09CT("text_hint")
    public String textHint;
    public static final Parcelable.Creator<TextStickerCompatModel> CREATOR = new Parcelable.Creator<TextStickerCompatModel>() { // from class: X.0EMi
        @Override // android.os.Parcelable.Creator
        public final TextStickerCompatModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            Boolean boolValueOf;
            Integer numValueOf;
            boolean z4;
            Integer numValueOf2;
            Float fValueOf;
            ArrayList arrayList;
            StickerAnimation stickerAnimationCreateFromParcel;
            ArrayList arrayList2;
            TransformAnchor transformAnchorCreateFromParcel;
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
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            EnumC363350EMj enumC363350EMjValueOf = EnumC363350EMj.valueOf(parcel.readString());
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
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList3.add(SubTemplateInfo.CREATOR.createFromParcel(parcel));
            }
            float f = parcel.readFloat();
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList.add(AtomAnimation.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                stickerAnimationCreateFromParcel = null;
            } else {
                stickerAnimationCreateFromParcel = StickerAnimation.CREATOR.createFromParcel(parcel);
            }
            StickerAnimation stickerAnimation = stickerAnimationCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i6 = parcel.readInt();
                arrayList2 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList2.add(RichContentDependRes.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                transformAnchorCreateFromParcel = null;
            } else {
                transformAnchorCreateFromParcel = TransformAnchor.CREATOR.createFromParcel(parcel);
            }
            return new TextStickerCompatModel(z, z2, string, string2, string3, string4, enumC363350EMjValueOf, boolValueOf, numValueOf, z4, string5, string6, numValueOf2, i, arrayList3, f, fValueOf, arrayList, stickerAnimation, arrayList2, transformAnchorCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerCompatModel[] newArray(int i) {
            return new TextStickerCompatModel[i];
        }
    };
    public static final int $stable = 8;

    public TextStickerCompatModel() {
        this(false, false, null, null, null, null, null, null, null, false, null, null, null, 0, null, 0.0f, null, null, null, null, null, 2097151, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextStickerCompatModel copy$default(TextStickerCompatModel textStickerCompatModel, boolean z, boolean z2, String str, String str2, String str3, String str4, EnumC363350EMj enumC363350EMj, Boolean bool, Integer num, boolean z3, String str5, String str6, Integer num2, int i, List list, float f, Float f2, List list2, StickerAnimation stickerAnimation, List list3, TransformAnchor transformAnchor, int i2, Object obj) {
        String str7 = str4;
        String str8 = str3;
        String str9 = str2;
        String str10 = str;
        boolean z4 = z2;
        boolean z5 = z;
        Integer num3 = num2;
        String str11 = str6;
        String str12 = str5;
        boolean z6 = z3;
        Integer num4 = num;
        Boolean bool2 = bool;
        int i3 = i;
        EnumC363350EMj enumC363350EMj2 = enumC363350EMj;
        List list4 = list3;
        StickerAnimation stickerAnimation2 = stickerAnimation;
        List list5 = list2;
        Float f3 = f2;
        float f4 = f;
        TransformAnchor transformAnchor2 = transformAnchor;
        List list6 = list;
        if ((i2 & 1) != 0) {
            z5 = textStickerCompatModel.isFromPugcTemplate;
        }
        if ((i2 & 2) != 0) {
            z4 = textStickerCompatModel.isFromMaeTemplate;
        }
        if ((i2 & 4) != 0) {
            str10 = textStickerCompatModel.memeSoundMusicId;
        }
        if ((i2 & 8) != 0) {
            str9 = textStickerCompatModel.memeSoundBgmUuid;
        }
        if ((i2 & 16) != 0) {
            str8 = textStickerCompatModel.oriTextStrWithBreak;
        }
        if ((i2 & 32) != 0) {
            str7 = textStickerCompatModel.oriTextStr;
        }
        if ((i2 & 64) != 0) {
            enumC363350EMj2 = textStickerCompatModel.capitalizationState;
        }
        if ((i2 & 128) != 0) {
            bool2 = textStickerCompatModel.showPunctuation;
        }
        if ((i2 & 256) != 0) {
            num4 = textStickerCompatModel.mixStudioTextWidth;
        }
        if ((i2 & 512) != 0) {
            z6 = textStickerCompatModel.isUsedPovTheme;
        }
        if ((i2 & 1024) != 0) {
            str12 = textStickerCompatModel.selectPovText;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str11 = textStickerCompatModel.textHint;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num3 = textStickerCompatModel.hintColor;
        }
        if ((i2 & 8192) != 0) {
            i3 = textStickerCompatModel.selectSlotIndex;
        }
        if ((i2 & 16384) != 0) {
            list6 = textStickerCompatModel.subTemplates;
        }
        if ((32768 & i2) != 0) {
            f4 = textStickerCompatModel.groupTemplatePreviewBoundWidth;
        }
        if ((65536 & i2) != 0) {
            f3 = textStickerCompatModel.minFontSize;
        }
        if ((131072 & i2) != 0) {
            list5 = textStickerCompatModel.atomAnimations;
        }
        if ((262144 & i2) != 0) {
            stickerAnimation2 = textStickerCompatModel.stickerAnimation;
        }
        if ((524288 & i2) != 0) {
            list4 = textStickerCompatModel.richContentDependRes;
        }
        if ((i2 & 1048576) != 0) {
            transformAnchor2 = textStickerCompatModel.anchor;
        }
        Integer num5 = num4;
        boolean z7 = z6;
        String str13 = str12;
        String str14 = str11;
        Integer num6 = num3;
        return textStickerCompatModel.copy(z5, z4, str10, str9, str8, str7, enumC363350EMj2, bool2, num5, z7, str13, str14, num6, i3, list6, f4, f3, list5, stickerAnimation2, list4, transformAnchor2);
    }

    public final TextStickerCompatModel copy(boolean z, boolean z2, String str, String str2, String str3, String str4, EnumC363350EMj enumC363350EMj, Boolean bool, Integer num, boolean z3, String str5, String str6, Integer num2, int i, List<SubTemplateInfo> list, float f, Float f2, List<AtomAnimation> list2, StickerAnimation stickerAnimation, List<RichContentDependRes> list3, TransformAnchor transformAnchor) {
        return new TextStickerCompatModel(z, z2, str, str2, str3, str4, enumC363350EMj, bool, num, z3, str5, str6, num2, i, list, f, f2, list2, stickerAnimation, list3, transformAnchor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStickerCompatModel)) {
            return false;
        }
        TextStickerCompatModel textStickerCompatModel = (TextStickerCompatModel) obj;
        return this.isFromPugcTemplate == textStickerCompatModel.isFromPugcTemplate && this.isFromMaeTemplate == textStickerCompatModel.isFromMaeTemplate && Intrinsics.LJFF(this.memeSoundMusicId, textStickerCompatModel.memeSoundMusicId) && Intrinsics.LJFF(this.memeSoundBgmUuid, textStickerCompatModel.memeSoundBgmUuid) && Intrinsics.LJFF(this.oriTextStrWithBreak, textStickerCompatModel.oriTextStrWithBreak) && Intrinsics.LJFF(this.oriTextStr, textStickerCompatModel.oriTextStr) && this.capitalizationState == textStickerCompatModel.capitalizationState && Intrinsics.LJFF(this.showPunctuation, textStickerCompatModel.showPunctuation) && Intrinsics.LJFF(this.mixStudioTextWidth, textStickerCompatModel.mixStudioTextWidth) && this.isUsedPovTheme == textStickerCompatModel.isUsedPovTheme && Intrinsics.LJFF(this.selectPovText, textStickerCompatModel.selectPovText) && Intrinsics.LJFF(this.textHint, textStickerCompatModel.textHint) && Intrinsics.LJFF(this.hintColor, textStickerCompatModel.hintColor) && this.selectSlotIndex == textStickerCompatModel.selectSlotIndex && Intrinsics.LJFF(this.subTemplates, textStickerCompatModel.subTemplates) && Float.compare(this.groupTemplatePreviewBoundWidth, textStickerCompatModel.groupTemplatePreviewBoundWidth) == 0 && Intrinsics.LJFF(this.minFontSize, textStickerCompatModel.minFontSize) && Intrinsics.LJFF(this.atomAnimations, textStickerCompatModel.atomAnimations) && Intrinsics.LJFF(this.stickerAnimation, textStickerCompatModel.stickerAnimation) && Intrinsics.LJFF(this.richContentDependRes, textStickerCompatModel.richContentDependRes) && Intrinsics.LJFF(this.anchor, textStickerCompatModel.anchor);
    }

    public String toString() {
        return "TextStickerCompatModel(isFromPugcTemplate=" + this.isFromPugcTemplate + ", isFromMaeTemplate=" + this.isFromMaeTemplate + ", memeSoundMusicId=" + this.memeSoundMusicId + ", memeSoundBgmUuid=" + this.memeSoundBgmUuid + ", oriTextStrWithBreak=" + this.oriTextStrWithBreak + ", oriTextStr=" + this.oriTextStr + ", capitalizationState=" + this.capitalizationState + ", showPunctuation=" + this.showPunctuation + ", mixStudioTextWidth=" + this.mixStudioTextWidth + ", isUsedPovTheme=" + this.isUsedPovTheme + ", selectPovText=" + this.selectPovText + ", textHint=" + this.textHint + ", hintColor=" + this.hintColor + ", selectSlotIndex=" + this.selectSlotIndex + ", subTemplates=" + this.subTemplates + ", groupTemplatePreviewBoundWidth=" + this.groupTemplatePreviewBoundWidth + ", minFontSize=" + this.minFontSize + ", atomAnimations=" + this.atomAnimations + ", stickerAnimation=" + this.stickerAnimation + ", richContentDependRes=" + this.richContentDependRes + ", anchor=" + this.anchor + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isFromPugcTemplate ? 1 : 0);
        parcel.writeInt(this.isFromMaeTemplate ? 1 : 0);
        parcel.writeString(this.memeSoundMusicId);
        parcel.writeString(this.memeSoundBgmUuid);
        parcel.writeString(this.oriTextStrWithBreak);
        parcel.writeString(this.oriTextStr);
        parcel.writeString(this.capitalizationState.name());
        Boolean bool = this.showPunctuation;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.mixStudioTextWidth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.isUsedPovTheme ? 1 : 0);
        parcel.writeString(this.selectPovText);
        parcel.writeString(this.textHint);
        Integer num2 = this.hintColor;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.selectSlotIndex);
        List<SubTemplateInfo> list = this.subTemplates;
        parcel.writeInt(list.size());
        Iterator<SubTemplateInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeFloat(this.groupTemplatePreviewBoundWidth);
        Float f = this.minFontSize;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        List<AtomAnimation> list2 = this.atomAnimations;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<AtomAnimation> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        StickerAnimation stickerAnimation = this.stickerAnimation;
        if (stickerAnimation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickerAnimation.writeToParcel(parcel, i);
        }
        List<RichContentDependRes> list3 = this.richContentDependRes;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<RichContentDependRes> it4 = list3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        TransformAnchor transformAnchor = this.anchor;
        if (transformAnchor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transformAnchor.writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.isFromPugcTemplate) * 31) + C786410Ut5.Z2(this.isFromMaeTemplate)) * 31;
        String str = this.memeSoundMusicId;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.memeSoundBgmUuid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.oriTextStrWithBreak;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.oriTextStr;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.capitalizationState.hashCode()) * 31;
        Boolean bool = this.showPunctuation;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.mixStudioTextWidth;
        int iHashCode6 = (((iHashCode5 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.isUsedPovTheme)) * 31;
        String str5 = this.selectPovText;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.textHint;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.hintColor;
        int iHashCode9 = (((((((iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.selectSlotIndex) * 31) + this.subTemplates.hashCode()) * 31) + Float.floatToIntBits(this.groupTemplatePreviewBoundWidth)) * 31;
        Float f = this.minFontSize;
        int iHashCode10 = (iHashCode9 + (f == null ? 0 : f.hashCode())) * 31;
        List<AtomAnimation> list = this.atomAnimations;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        StickerAnimation stickerAnimation = this.stickerAnimation;
        int iHashCode12 = (iHashCode11 + (stickerAnimation == null ? 0 : stickerAnimation.hashCode())) * 31;
        List<RichContentDependRes> list2 = this.richContentDependRes;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        TransformAnchor transformAnchor = this.anchor;
        return iHashCode13 + (transformAnchor != null ? transformAnchor.hashCode() : 0);
    }

    public final TransformAnchor getAnchor() {
        return this.anchor;
    }

    public final List<AtomAnimation> getAtomAnimations() {
        return this.atomAnimations;
    }

    public final EnumC363350EMj getCapitalizationState() {
        return this.capitalizationState;
    }

    public final float getGroupTemplatePreviewBoundWidth() {
        return this.groupTemplatePreviewBoundWidth;
    }

    public final Integer getHintColor() {
        return this.hintColor;
    }

    public final String getMemeSoundBgmUuid() {
        return this.memeSoundBgmUuid;
    }

    public final String getMemeSoundMusicId() {
        return this.memeSoundMusicId;
    }

    public final Float getMinFontSize() {
        return this.minFontSize;
    }

    public final Integer getMixStudioTextWidth() {
        return this.mixStudioTextWidth;
    }

    public final String getOriTextStr() {
        return this.oriTextStr;
    }

    public final String getOriTextStrWithBreak() {
        return this.oriTextStrWithBreak;
    }

    public final List<RichContentDependRes> getRichContentDependRes() {
        return this.richContentDependRes;
    }

    public final String getSelectPovText() {
        return this.selectPovText;
    }

    public final int getSelectSlotIndex() {
        return this.selectSlotIndex;
    }

    public final Boolean getShowPunctuation() {
        return this.showPunctuation;
    }

    public final StickerAnimation getStickerAnimation() {
        return this.stickerAnimation;
    }

    public final List<SubTemplateInfo> getSubTemplates() {
        return this.subTemplates;
    }

    public final String getTextHint() {
        return this.textHint;
    }

    public final boolean isFromMaeTemplate() {
        return this.isFromMaeTemplate;
    }

    public final boolean isFromPugcTemplate() {
        return this.isFromPugcTemplate;
    }

    public final boolean isUsedPovTheme() {
        return this.isUsedPovTheme;
    }

    public final void setCapitalizationState(EnumC363350EMj enumC363350EMj) {
        this.capitalizationState = enumC363350EMj;
    }

    public final void setFromMaeTemplate(boolean z) {
        this.isFromMaeTemplate = z;
    }

    public final void setFromPugcTemplate(boolean z) {
        this.isFromPugcTemplate = z;
    }

    public final void setGroupTemplatePreviewBoundWidth(float f) {
        this.groupTemplatePreviewBoundWidth = f;
    }

    public final void setHintColor(Integer num) {
        this.hintColor = num;
    }

    public final void setMemeSoundBgmUuid(String str) {
        this.memeSoundBgmUuid = str;
    }

    public final void setMemeSoundMusicId(String str) {
        this.memeSoundMusicId = str;
    }

    public final void setMinFontSize(Float f) {
        this.minFontSize = f;
    }

    public final void setMixStudioTextWidth(Integer num) {
        this.mixStudioTextWidth = num;
    }

    public final void setOriTextStr(String str) {
        this.oriTextStr = str;
    }

    public final void setOriTextStrWithBreak(String str) {
        this.oriTextStrWithBreak = str;
    }

    public final void setSelectPovText(String str) {
        this.selectPovText = str;
    }

    public final void setSelectSlotIndex(int i) {
        this.selectSlotIndex = i;
    }

    public final void setShowPunctuation(Boolean bool) {
        this.showPunctuation = bool;
    }

    public final void setSubTemplates(List<SubTemplateInfo> list) {
        this.subTemplates = list;
    }

    public final void setTextHint(String str) {
        this.textHint = str;
    }

    public final void setUsedPovTheme(boolean z) {
        this.isUsedPovTheme = z;
    }

    public TextStickerCompatModel(boolean z, boolean z2, String str, String str2, String str3, String str4, EnumC363350EMj enumC363350EMj, Boolean bool, Integer num, boolean z3, String str5, String str6, Integer num2, int i, List<SubTemplateInfo> list, float f, Float f2, List<AtomAnimation> list2, StickerAnimation stickerAnimation, List<RichContentDependRes> list3, TransformAnchor transformAnchor) {
        this.isFromPugcTemplate = z;
        this.isFromMaeTemplate = z2;
        this.memeSoundMusicId = str;
        this.memeSoundBgmUuid = str2;
        this.oriTextStrWithBreak = str3;
        this.oriTextStr = str4;
        this.capitalizationState = enumC363350EMj;
        this.showPunctuation = bool;
        this.mixStudioTextWidth = num;
        this.isUsedPovTheme = z3;
        this.selectPovText = str5;
        this.textHint = str6;
        this.hintColor = num2;
        this.selectSlotIndex = i;
        this.subTemplates = list;
        this.groupTemplatePreviewBoundWidth = f;
        this.minFontSize = f2;
        this.atomAnimations = list2;
        this.stickerAnimation = stickerAnimation;
        this.richContentDependRes = list3;
        this.anchor = transformAnchor;
    }

    public TextStickerCompatModel(boolean z, boolean z2, String str, String str2, String str3, String str4, EnumC363350EMj enumC363350EMj, Boolean bool, Integer num, boolean z3, String str5, String str6, Integer num2, int i, List list, float f, Float f2, List list2, StickerAnimation stickerAnimation, List list3, TransformAnchor transformAnchor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? EnumC363350EMj.DEFAULT : enumC363350EMj, (i2 & 128) != 0 ? Boolean.TRUE : bool, (i2 & 256) != 0 ? null : num, (i2 & 512) == 0 ? z3 : false, (i2 & 1024) != 0 ? null : str5, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str6, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : num2, (i2 & 8192) != 0 ? 1 : i, (i2 & 16384) != 0 ? C13BV.INSTANCE : list, (32768 & i2) != 0 ? 0.0f : f, (65536 & i2) != 0 ? null : f2, (131072 & i2) != 0 ? null : list2, (262144 & i2) != 0 ? null : stickerAnimation, (524288 & i2) != 0 ? null : list3, (i2 & 1048576) != 0 ? null : transformAnchor);
    }
}
