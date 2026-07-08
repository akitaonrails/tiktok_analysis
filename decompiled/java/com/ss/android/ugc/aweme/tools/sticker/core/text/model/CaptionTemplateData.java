package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C0F7Q;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class CaptionTemplateData implements Parcelable {

    @C09CT("align")
    public final int align;

    @C09CT("caption_anim_id")
    public final String captionAnimId;

    @C09CT("font_id")
    public final String fontId;

    @C09CT("font_size")
    public final float fontSize;

    @C09CT("force_lowercase")
    public final boolean forceLowercase;

    @C09CT("force_uppercase")
    public final boolean forceUppercase;

    @C09CT("style_mode")
    public final int mode;

    @C09CT("panel")
    public final String panel;

    @C09CT("res_id")
    public String resID;

    @C09CT("scale")
    public final float scale;

    @C09CT("style_id")
    public final String styleId;

    @C09CT("text_anim_id")
    public final String textAnimId;

    @C09CT("text_color")
    public final String textColor;
    public static final C0F7Q Companion = new Object() { // from class: X.0F7Q
    };
    public static final Parcelable.Creator<CaptionTemplateData> CREATOR = new Parcelable.Creator<CaptionTemplateData>() { // from class: X.0F7P
        @Override // android.os.Parcelable.Creator
        public final CaptionTemplateData createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            int i2 = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new CaptionTemplateData(string, string2, string3, i, f, f2, i2, string4, string5, string6, string7, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final CaptionTemplateData[] newArray(int i) {
            return new CaptionTemplateData[i];
        }
    };
    public static final int $stable = 8;

    public CaptionTemplateData() {
        this("", "tiktok_ep_caption_template", "#FFFFFFFF", 2, 28.0f, 1.0f, 1, null, null, null, null, false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionTemplateData)) {
            return false;
        }
        CaptionTemplateData captionTemplateData = (CaptionTemplateData) obj;
        return Intrinsics.LJFF(this.resID, captionTemplateData.resID) && Intrinsics.LJFF(this.panel, captionTemplateData.panel) && Intrinsics.LJFF(this.textColor, captionTemplateData.textColor) && this.align == captionTemplateData.align && Float.compare(this.fontSize, captionTemplateData.fontSize) == 0 && Float.compare(this.scale, captionTemplateData.scale) == 0 && this.mode == captionTemplateData.mode && Intrinsics.LJFF(this.styleId, captionTemplateData.styleId) && Intrinsics.LJFF(this.textAnimId, captionTemplateData.textAnimId) && Intrinsics.LJFF(this.captionAnimId, captionTemplateData.captionAnimId) && Intrinsics.LJFF(this.fontId, captionTemplateData.fontId) && this.forceLowercase == captionTemplateData.forceLowercase && this.forceUppercase == captionTemplateData.forceUppercase;
    }

    public final String toString() {
        return "CaptionTemplateData(resID=" + this.resID + ", panel=" + this.panel + ", textColor=" + this.textColor + ", align=" + this.align + ", fontSize=" + this.fontSize + ", scale=" + this.scale + ", mode=" + this.mode + ", styleId=" + this.styleId + ", textAnimId=" + this.textAnimId + ", captionAnimId=" + this.captionAnimId + ", fontId=" + this.fontId + ", forceLowercase=" + this.forceLowercase + ", forceUppercase=" + this.forceUppercase + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.resID);
        parcel.writeString(this.panel);
        parcel.writeString(this.textColor);
        parcel.writeInt(this.align);
        parcel.writeFloat(this.fontSize);
        parcel.writeFloat(this.scale);
        parcel.writeInt(this.mode);
        parcel.writeString(this.styleId);
        parcel.writeString(this.textAnimId);
        parcel.writeString(this.captionAnimId);
        parcel.writeString(this.fontId);
        parcel.writeInt(this.forceLowercase ? 1 : 0);
        parcel.writeInt(this.forceUppercase ? 1 : 0);
    }

    public final int hashCode() {
        int iHashCode = ((this.resID.hashCode() * 31) + this.panel.hashCode()) * 31;
        String str = this.textColor;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.align) * 31) + Float.floatToIntBits(this.fontSize)) * 31) + Float.floatToIntBits(this.scale)) * 31) + this.mode) * 31;
        String str2 = this.styleId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textAnimId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.captionAnimId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fontId;
        return ((((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.forceLowercase)) * 31) + C786410Ut5.Z2(this.forceUppercase);
    }

    public static CaptionTemplateData LIZ(CaptionTemplateData captionTemplateData, int i, String str, String str2, String str3, boolean z, boolean z2, int i2) {
        String str4;
        String str5;
        String str6;
        int i3;
        float f;
        float f2;
        boolean z3 = z2;
        String str7 = str3;
        String str8 = str2;
        boolean z4 = z;
        String str9 = str;
        int i4 = i;
        String str10 = null;
        if ((i2 & 1) != 0) {
            str4 = captionTemplateData.resID;
        } else {
            str4 = null;
        }
        if ((i2 & 2) != 0) {
            str5 = captionTemplateData.panel;
        } else {
            str5 = null;
        }
        if ((i2 & 4) != 0) {
            str6 = captionTemplateData.textColor;
        } else {
            str6 = null;
        }
        if ((i2 & 8) != 0) {
            i3 = captionTemplateData.align;
        } else {
            i3 = 0;
        }
        if ((i2 & 16) != 0) {
            f = captionTemplateData.fontSize;
        } else {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = captionTemplateData.scale;
        } else {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            i4 = captionTemplateData.mode;
        }
        if ((i2 & 128) != 0) {
            str9 = captionTemplateData.styleId;
        }
        if ((i2 & 256) != 0) {
            str8 = captionTemplateData.textAnimId;
        }
        if ((i2 & 512) != 0) {
            str7 = captionTemplateData.captionAnimId;
        }
        if ((i2 & 1024) != 0) {
            str10 = captionTemplateData.fontId;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z4 = captionTemplateData.forceLowercase;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z3 = captionTemplateData.forceUppercase;
        }
        return new CaptionTemplateData(str4, str5, str6, i3, f, f2, i4, str9, str8, str7, str10, z4, z3);
    }

    public CaptionTemplateData(String str, String str2, String str3, int i, float f, float f2, int i2, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        this.resID = str;
        this.panel = str2;
        this.textColor = str3;
        this.align = i;
        this.fontSize = f;
        this.scale = f2;
        this.mode = i2;
        this.styleId = str4;
        this.textAnimId = str5;
        this.captionAnimId = str6;
        this.fontId = str7;
        this.forceLowercase = z;
        this.forceUppercase = z2;
    }
}
