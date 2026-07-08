package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateEditStateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextTemplateModel implements Parcelable {

    @C09CT("default_font_id")
    public String defaultFontID;

    @InterfaceC2270908v5
    @C09CT("default_font_path")
    public String defaultFontPath;

    @C09CT("default_select_child_index")
    public int defaultSelectIndex;

    @C09CT("default_text")
    public String defaultText;

    @C09CT("default_texts")
    public List<String> defaultTexts;

    @C09CT("depend_resources_json")
    public String dependResourcesJson;

    @C09CT("template_edit_states")
    public TextTemplateEditStateModel editState;

    @C09CT("edited_align")
    public boolean editedAlign;

    @C09CT("edited_color")
    public boolean editedColor;

    @C09CT("edited_font")
    public boolean editedFont;

    @C09CT("edited_style")
    public boolean editedStyle;

    @C09CT("enable_text_template")
    public boolean enableTextTemplate;

    @C09CT("from_inspiration")
    public boolean fromInspirationPanel;

    @C09CT("is_group_text_templates")
    public boolean isGroupTextTemplates;

    @C09CT("is_hint")
    public boolean isHint;

    @C09CT("is_l8")
    public boolean isL8;

    @C09CT("is_new_text_template")
    public boolean isNewTextTemplate;

    @C09CT("tab")
    public int tab;

    @C09CT("tab_name")
    public String tabName;

    @C09CT("template_effect_id")
    public String templateEffectId;

    @C09CT("template_name")
    public String templateName;

    @InterfaceC2270908v5
    @C09CT("template_path")
    public String templatePath;

    @C09CT("template_uuid")
    public String templateuuid;

    @C09CT("text_param")
    public String textParam;

    @C09CT("use_default_align")
    public boolean useDefaultAlign;

    @C09CT("use_default_color")
    public boolean useDefaultColor;

    @C09CT("use_default_font")
    public boolean useDefaultFont;

    @C09CT("use_default_text")
    public boolean useDefaultText;
    public static final Parcelable.Creator<TextTemplateModel> CREATOR = new Parcelable.Creator<TextTemplateModel>() { // from class: X.0FAU
        @Override // android.os.Parcelable.Creator
        public final TextTemplateModel createFromParcel(Parcel parcel) {
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
            boolean z12;
            boolean z13;
            boolean z14;
            String string = parcel.readString();
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
            String string2 = parcel.readString();
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
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i = parcel.readInt();
            String string8 = parcel.readString();
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
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            String string9 = parcel.readString();
            String string10 = parcel.readString();
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
            return new TextTemplateModel(string, z, z2, z3, string2, z4, z5, z6, string3, string4, string5, z7, z8, string6, string7, i, string8, z9, z10, z11, z12, string9, string10, z13, z14, parcel.readInt(), parcel.createStringArrayList(), TextTemplateEditStateModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TextTemplateModel[] newArray(int i) {
            return new TextTemplateModel[i];
        }
    };
    public static final int $stable = 8;

    public TextTemplateModel() {
        this(null, false, false, false, null, false, false, false, null, null, null, false, false, null, null, 0, null, false, false, false, false, null, null, false, false, 0, null, null, 268435455, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTemplateModel)) {
            return false;
        }
        TextTemplateModel textTemplateModel = (TextTemplateModel) obj;
        return Intrinsics.LJFF(this.templatePath, textTemplateModel.templatePath) && this.enableTextTemplate == textTemplateModel.enableTextTemplate && this.isNewTextTemplate == textTemplateModel.isNewTextTemplate && this.useDefaultText == textTemplateModel.useDefaultText && Intrinsics.LJFF(this.defaultText, textTemplateModel.defaultText) && this.useDefaultColor == textTemplateModel.useDefaultColor && this.useDefaultFont == textTemplateModel.useDefaultFont && this.useDefaultAlign == textTemplateModel.useDefaultAlign && Intrinsics.LJFF(this.defaultFontID, textTemplateModel.defaultFontID) && Intrinsics.LJFF(this.defaultFontPath, textTemplateModel.defaultFontPath) && Intrinsics.LJFF(this.templateEffectId, textTemplateModel.templateEffectId) && this.isL8 == textTemplateModel.isL8 && this.isHint == textTemplateModel.isHint && Intrinsics.LJFF(this.templateName, textTemplateModel.templateName) && Intrinsics.LJFF(this.textParam, textTemplateModel.textParam) && this.tab == textTemplateModel.tab && Intrinsics.LJFF(this.tabName, textTemplateModel.tabName) && this.editedFont == textTemplateModel.editedFont && this.editedColor == textTemplateModel.editedColor && this.editedAlign == textTemplateModel.editedAlign && this.editedStyle == textTemplateModel.editedStyle && Intrinsics.LJFF(this.templateuuid, textTemplateModel.templateuuid) && Intrinsics.LJFF(this.dependResourcesJson, textTemplateModel.dependResourcesJson) && this.fromInspirationPanel == textTemplateModel.fromInspirationPanel && this.isGroupTextTemplates == textTemplateModel.isGroupTextTemplates && this.defaultSelectIndex == textTemplateModel.defaultSelectIndex && Intrinsics.LJFF(this.defaultTexts, textTemplateModel.defaultTexts) && Intrinsics.LJFF(this.editState, textTemplateModel.editState);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((this.templatePath.hashCode() * 31) + C786410Ut5.Z2(this.enableTextTemplate)) * 31) + C786410Ut5.Z2(this.isNewTextTemplate)) * 31) + C786410Ut5.Z2(this.useDefaultText)) * 31) + this.defaultText.hashCode()) * 31) + C786410Ut5.Z2(this.useDefaultColor)) * 31) + C786410Ut5.Z2(this.useDefaultFont)) * 31) + C786410Ut5.Z2(this.useDefaultAlign)) * 31) + this.defaultFontID.hashCode()) * 31) + this.defaultFontPath.hashCode()) * 31) + this.templateEffectId.hashCode()) * 31) + C786410Ut5.Z2(this.isL8)) * 31) + C786410Ut5.Z2(this.isHint)) * 31) + this.templateName.hashCode()) * 31) + this.textParam.hashCode()) * 31) + this.tab) * 31) + this.tabName.hashCode()) * 31) + C786410Ut5.Z2(this.editedFont)) * 31) + C786410Ut5.Z2(this.editedColor)) * 31) + C786410Ut5.Z2(this.editedAlign)) * 31) + C786410Ut5.Z2(this.editedStyle)) * 31) + this.templateuuid.hashCode()) * 31) + this.dependResourcesJson.hashCode()) * 31) + C786410Ut5.Z2(this.fromInspirationPanel)) * 31) + C786410Ut5.Z2(this.isGroupTextTemplates)) * 31) + this.defaultSelectIndex) * 31) + this.defaultTexts.hashCode()) * 31) + this.editState.hashCode();
    }

    public final String toString() {
        return "TextTemplateModel(templatePath=" + this.templatePath + ", enableTextTemplate=" + this.enableTextTemplate + ", isNewTextTemplate=" + this.isNewTextTemplate + ", useDefaultText=" + this.useDefaultText + ", defaultText=" + this.defaultText + ", useDefaultColor=" + this.useDefaultColor + ", useDefaultFont=" + this.useDefaultFont + ", useDefaultAlign=" + this.useDefaultAlign + ", defaultFontID=" + this.defaultFontID + ", defaultFontPath=" + this.defaultFontPath + ", templateEffectId=" + this.templateEffectId + ", isL8=" + this.isL8 + ", isHint=" + this.isHint + ", templateName=" + this.templateName + ", textParam=" + this.textParam + ", tab=" + this.tab + ", tabName=" + this.tabName + ", editedFont=" + this.editedFont + ", editedColor=" + this.editedColor + ", editedAlign=" + this.editedAlign + ", editedStyle=" + this.editedStyle + ", templateuuid=" + this.templateuuid + ", dependResourcesJson=" + this.dependResourcesJson + ", fromInspirationPanel=" + this.fromInspirationPanel + ", isGroupTextTemplates=" + this.isGroupTextTemplates + ", defaultSelectIndex=" + this.defaultSelectIndex + ", defaultTexts=" + this.defaultTexts + ", editState=" + this.editState + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templatePath);
        parcel.writeInt(this.enableTextTemplate ? 1 : 0);
        parcel.writeInt(this.isNewTextTemplate ? 1 : 0);
        parcel.writeInt(this.useDefaultText ? 1 : 0);
        parcel.writeString(this.defaultText);
        parcel.writeInt(this.useDefaultColor ? 1 : 0);
        parcel.writeInt(this.useDefaultFont ? 1 : 0);
        parcel.writeInt(this.useDefaultAlign ? 1 : 0);
        parcel.writeString(this.defaultFontID);
        parcel.writeString(this.defaultFontPath);
        parcel.writeString(this.templateEffectId);
        parcel.writeInt(this.isL8 ? 1 : 0);
        parcel.writeInt(this.isHint ? 1 : 0);
        parcel.writeString(this.templateName);
        parcel.writeString(this.textParam);
        parcel.writeInt(this.tab);
        parcel.writeString(this.tabName);
        parcel.writeInt(this.editedFont ? 1 : 0);
        parcel.writeInt(this.editedColor ? 1 : 0);
        parcel.writeInt(this.editedAlign ? 1 : 0);
        parcel.writeInt(this.editedStyle ? 1 : 0);
        parcel.writeString(this.templateuuid);
        parcel.writeString(this.dependResourcesJson);
        parcel.writeInt(this.fromInspirationPanel ? 1 : 0);
        parcel.writeInt(this.isGroupTextTemplates ? 1 : 0);
        parcel.writeInt(this.defaultSelectIndex);
        parcel.writeStringList(this.defaultTexts);
        this.editState.writeToParcel(parcel, i);
    }

    public static TextTemplateModel LIZ(TextTemplateModel textTemplateModel, String str, int i) {
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        String str3;
        boolean z4;
        boolean z5;
        boolean z6;
        String str4;
        String str5;
        String str6;
        boolean z7;
        boolean z8;
        String str7;
        String str8;
        int i2;
        String str9;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        String str10;
        boolean z13;
        boolean z14;
        int i3;
        List<String> list;
        String str11 = str;
        TextTemplateEditStateModel textTemplateEditStateModel = null;
        if ((i & 1) != 0) {
            str2 = textTemplateModel.templatePath;
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            z = textTemplateModel.enableTextTemplate;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = textTemplateModel.isNewTextTemplate;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = textTemplateModel.useDefaultText;
        } else {
            z3 = false;
        }
        if ((i & 16) != 0) {
            str3 = textTemplateModel.defaultText;
        } else {
            str3 = null;
        }
        if ((i & 32) != 0) {
            z4 = textTemplateModel.useDefaultColor;
        } else {
            z4 = false;
        }
        if ((i & 64) != 0) {
            z5 = textTemplateModel.useDefaultFont;
        } else {
            z5 = false;
        }
        if ((i & 128) != 0) {
            z6 = textTemplateModel.useDefaultAlign;
        } else {
            z6 = false;
        }
        if ((i & 256) != 0) {
            str4 = textTemplateModel.defaultFontID;
        } else {
            str4 = null;
        }
        if ((i & 512) != 0) {
            str5 = textTemplateModel.defaultFontPath;
        } else {
            str5 = null;
        }
        if ((i & 1024) != 0) {
            str6 = textTemplateModel.templateEffectId;
        } else {
            str6 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z7 = textTemplateModel.isL8;
        } else {
            z7 = false;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z8 = textTemplateModel.isHint;
        } else {
            z8 = false;
        }
        if ((i & 8192) != 0) {
            str7 = textTemplateModel.templateName;
        } else {
            str7 = null;
        }
        if ((i & 16384) != 0) {
            str8 = textTemplateModel.textParam;
        } else {
            str8 = null;
        }
        if ((32768 & i) != 0) {
            i2 = textTemplateModel.tab;
        } else {
            i2 = 0;
        }
        if ((65536 & i) != 0) {
            str9 = textTemplateModel.tabName;
        } else {
            str9 = null;
        }
        if ((131072 & i) != 0) {
            z9 = textTemplateModel.editedFont;
        } else {
            z9 = false;
        }
        if ((262144 & i) != 0) {
            z10 = textTemplateModel.editedColor;
        } else {
            z10 = false;
        }
        if ((524288 & i) != 0) {
            z11 = textTemplateModel.editedAlign;
        } else {
            z11 = false;
        }
        if ((1048576 & i) != 0) {
            z12 = textTemplateModel.editedStyle;
        } else {
            z12 = false;
        }
        if ((2097152 & i) != 0) {
            str11 = textTemplateModel.templateuuid;
        }
        if ((4194304 & i) != 0) {
            str10 = textTemplateModel.dependResourcesJson;
        } else {
            str10 = null;
        }
        if ((8388608 & i) != 0) {
            z13 = textTemplateModel.fromInspirationPanel;
        } else {
            z13 = false;
        }
        if ((16777216 & i) != 0) {
            z14 = textTemplateModel.isGroupTextTemplates;
        } else {
            z14 = false;
        }
        if ((33554432 & i) != 0) {
            i3 = textTemplateModel.defaultSelectIndex;
        } else {
            i3 = 0;
        }
        if ((67108864 & i) != 0) {
            list = textTemplateModel.defaultTexts;
        } else {
            list = null;
        }
        if ((i & 134217728) != 0) {
            textTemplateEditStateModel = textTemplateModel.editState;
        }
        textTemplateModel.getClass();
        return new TextTemplateModel(str2, z, z2, z3, str3, z4, z5, z6, str4, str5, str6, z7, z8, str7, str8, i2, str9, z9, z10, z11, z12, str11, str10, z13, z14, i3, list, textTemplateEditStateModel);
    }

    public TextTemplateModel(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, boolean z6, String str3, String str4, String str5, boolean z7, boolean z8, String str6, String str7, int i, String str8, boolean z9, boolean z10, boolean z11, boolean z12, String str9, String str10, boolean z13, boolean z14, int i2, List<String> list, TextTemplateEditStateModel textTemplateEditStateModel) {
        this.templatePath = str;
        this.enableTextTemplate = z;
        this.isNewTextTemplate = z2;
        this.useDefaultText = z3;
        this.defaultText = str2;
        this.useDefaultColor = z4;
        this.useDefaultFont = z5;
        this.useDefaultAlign = z6;
        this.defaultFontID = str3;
        this.defaultFontPath = str4;
        this.templateEffectId = str5;
        this.isL8 = z7;
        this.isHint = z8;
        this.templateName = str6;
        this.textParam = str7;
        this.tab = i;
        this.tabName = str8;
        this.editedFont = z9;
        this.editedColor = z10;
        this.editedAlign = z11;
        this.editedStyle = z12;
        this.templateuuid = str9;
        this.dependResourcesJson = str10;
        this.fromInspirationPanel = z13;
        this.isGroupTextTemplates = z14;
        this.defaultSelectIndex = i2;
        this.defaultTexts = list;
        this.editState = textTemplateEditStateModel;
    }

    public TextTemplateModel(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, boolean z6, String str3, String str4, String str5, boolean z7, boolean z8, String str6, String str7, int i, String str8, boolean z9, boolean z10, boolean z11, boolean z12, String str9, String str10, boolean z13, boolean z14, int i2, List list, TextTemplateEditStateModel textTemplateEditStateModel, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? false : z3, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? true : z4, (i3 & 64) != 0 ? true : z5, (i3 & 128) == 0 ? z6 : true, (i3 & 256) != 0 ? "" : str3, (i3 & 512) != 0 ? "" : str4, (i3 & 1024) != 0 ? "" : str5, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z7, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z8, (i3 & 8192) != 0 ? "" : str6, (i3 & 16384) != 0 ? "" : str7, (32768 & i3) != 0 ? 0 : i, (65536 & i3) != 0 ? "" : str8, (131072 & i3) != 0 ? false : z9, (262144 & i3) != 0 ? false : z10, (524288 & i3) != 0 ? false : z11, (1048576 & i3) != 0 ? false : z12, (2097152 & i3) != 0 ? "" : str9, (4194304 & i3) == 0 ? str10 : "", (8388608 & i3) != 0 ? false : z13, (16777216 & i3) != 0 ? false : z14, (33554432 & i3) != 0 ? 0 : i2, (67108864 & i3) != 0 ? C13BV.INSTANCE : list, (i3 & 134217728) != 0 ? new TextTemplateEditStateModel(new ArrayList(), new ArrayList(), new ArrayList()) : textTemplateEditStateModel);
    }
}
