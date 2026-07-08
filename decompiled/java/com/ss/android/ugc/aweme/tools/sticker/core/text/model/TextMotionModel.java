package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import X.C363300EMe;
import X.C786410Ut5;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextMotionModel implements Parcelable {

    @C09CT("motion_auto_wrap_line")
    public boolean autoWrapLine;

    @C09CT("combined_with_font")
    public boolean combinedWithFont;

    @C09CT("motion_enabled_on_last_use")
    public boolean lastMotionEnabledState;

    @C09CT("motion_category_id")
    public final String motionCategoryId;

    @C09CT("animation_duration")
    public final float motionDuration;

    @C09CT("motion_enabled")
    public int motionEnabled;

    @C09CT("motion_id")
    public final String motionId;

    @InterfaceC2270908v5
    @C09CT("animation_path")
    public String motionPath;

    @C09CT("motion_res_id")
    public final String motionResId;

    @C09CT("animation_type")
    public final int motionType;
    public static final C363300EMe Companion = new Object() { // from class: X.0EMe
    };
    public static final Parcelable.Creator<TextMotionModel> CREATOR = new Parcelable.Creator<TextMotionModel>() { // from class: X.0EMc
        @Override // android.os.Parcelable.Creator
        public final TextMotionModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            float f = parcel.readFloat();
            int i = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
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
            return new TextMotionModel(string, f, i, string2, string3, string4, i2, z, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final TextMotionModel[] newArray(int i) {
            return new TextMotionModel[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotionModel)) {
            return false;
        }
        TextMotionModel textMotionModel = (TextMotionModel) obj;
        return Intrinsics.LJFF(this.motionPath, textMotionModel.motionPath) && Float.compare(this.motionDuration, textMotionModel.motionDuration) == 0 && this.motionType == textMotionModel.motionType && Intrinsics.LJFF(this.motionId, textMotionModel.motionId) && Intrinsics.LJFF(this.motionCategoryId, textMotionModel.motionCategoryId) && Intrinsics.LJFF(this.motionResId, textMotionModel.motionResId) && this.motionEnabled == textMotionModel.motionEnabled && this.lastMotionEnabledState == textMotionModel.lastMotionEnabledState && this.combinedWithFont == textMotionModel.combinedWithFont && this.autoWrapLine == textMotionModel.autoWrapLine;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextMotionModel(motionPath=");
        sbLIZ.append(this.motionPath);
        sbLIZ.append(", motionDuration=");
        sbLIZ.append(this.motionDuration);
        sbLIZ.append(", motionType=");
        sbLIZ.append(this.motionType);
        sbLIZ.append(", motionId=");
        sbLIZ.append(this.motionId);
        sbLIZ.append(", motionCategoryId=");
        sbLIZ.append(this.motionCategoryId);
        sbLIZ.append(", motionResId=");
        sbLIZ.append(this.motionResId);
        sbLIZ.append(", motionEnabled=");
        sbLIZ.append(this.motionEnabled);
        sbLIZ.append(", lastMotionEnabledState=");
        sbLIZ.append(this.lastMotionEnabledState);
        sbLIZ.append(", combinedWithFont=");
        sbLIZ.append(this.combinedWithFont);
        sbLIZ.append(", autoWrapLine=");
        sbLIZ.append(this.autoWrapLine);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.motionPath);
        parcel.writeFloat(this.motionDuration);
        parcel.writeInt(this.motionType);
        parcel.writeString(this.motionId);
        parcel.writeString(this.motionCategoryId);
        parcel.writeString(this.motionResId);
        parcel.writeInt(this.motionEnabled);
        parcel.writeInt(this.lastMotionEnabledState ? 1 : 0);
        parcel.writeInt(this.combinedWithFont ? 1 : 0);
        parcel.writeInt(this.autoWrapLine ? 1 : 0);
    }

    public TextMotionModel() {
        this("", 0.0f, 0, "", "", "", 3, false, true, false);
    }

    public final int hashCode() {
        return (((((((((((((((((this.motionPath.hashCode() * 31) + Float.floatToIntBits(this.motionDuration)) * 31) + this.motionType) * 31) + this.motionId.hashCode()) * 31) + this.motionCategoryId.hashCode()) * 31) + this.motionResId.hashCode()) * 31) + this.motionEnabled) * 31) + C786410Ut5.Z2(this.lastMotionEnabledState)) * 31) + C786410Ut5.Z2(this.combinedWithFont)) * 31) + C786410Ut5.Z2(this.autoWrapLine);
    }

    public static TextMotionModel LIZ(TextMotionModel textMotionModel, String str, float f, int i, String str2, String str3, int i2, boolean z, int i3) {
        String str4;
        boolean z2;
        boolean z3;
        boolean z4 = z;
        int i4 = i2;
        String str5 = str2;
        int i5 = i;
        float f2 = f;
        String str6 = str3;
        String str7 = str;
        if ((i3 & 1) != 0) {
            str7 = textMotionModel.motionPath;
        }
        if ((i3 & 2) != 0) {
            f2 = textMotionModel.motionDuration;
        }
        if ((i3 & 4) != 0) {
            i5 = textMotionModel.motionType;
        }
        if ((i3 & 8) != 0) {
            str5 = textMotionModel.motionId;
        }
        if ((i3 & 16) != 0) {
            str4 = textMotionModel.motionCategoryId;
        } else {
            str4 = null;
        }
        if ((i3 & 32) != 0) {
            str6 = textMotionModel.motionResId;
        }
        if ((i3 & 64) != 0) {
            i4 = textMotionModel.motionEnabled;
        }
        if ((i3 & 128) != 0) {
            z4 = textMotionModel.lastMotionEnabledState;
        }
        if ((i3 & 256) != 0) {
            z2 = textMotionModel.combinedWithFont;
        } else {
            z2 = false;
        }
        if ((i3 & 512) != 0) {
            z3 = textMotionModel.autoWrapLine;
        } else {
            z3 = false;
        }
        textMotionModel.getClass();
        return new TextMotionModel(str7, f2, i5, str5, str4, str6, i4, z4, z2, z3);
    }

    public TextMotionModel(String str, float f, int i, String str2, String str3, String str4, int i2, boolean z, boolean z2, boolean z3) {
        this.motionPath = str;
        this.motionDuration = f;
        this.motionType = i;
        this.motionId = str2;
        this.motionCategoryId = str3;
        this.motionResId = str4;
        this.motionEnabled = i2;
        this.lastMotionEnabledState = z;
        this.combinedWithFont = z2;
        this.autoWrapLine = z3;
    }
}
