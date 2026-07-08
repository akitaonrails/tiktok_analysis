package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CustomCaptionTemplateData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class CaptionTemplateModel implements Parcelable {

    @C09CT("custom_template_data")
    public CustomCaptionTemplateData customTemplateData;

    @C09CT("ever_used_caption_template")
    public boolean everUsedCaptionTemplate;

    @C09CT("force_lowercase")
    public boolean forceLowercase;

    @C09CT("force_uppercase")
    public boolean forceUppercase;

    @C09CT("is_manually_cleared")
    public boolean isManuallyCleared;

    @C09CT("template_data")
    public CaptionTemplateData templateData;
    public static final Parcelable.Creator<CaptionTemplateModel> CREATOR = new Parcelable.Creator<CaptionTemplateModel>() { // from class: X.0F7O
        @Override // android.os.Parcelable.Creator
        public final CaptionTemplateModel createFromParcel(Parcel parcel) {
            boolean z;
            CaptionTemplateData captionTemplateDataCreateFromParcel;
            boolean z2;
            boolean z3;
            boolean z4;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                captionTemplateDataCreateFromParcel = null;
            } else {
                captionTemplateDataCreateFromParcel = CaptionTemplateData.CREATOR.createFromParcel(parcel);
            }
            CaptionTemplateData captionTemplateData = captionTemplateDataCreateFromParcel;
            CustomCaptionTemplateData customCaptionTemplateDataCreateFromParcel = CustomCaptionTemplateData.CREATOR.createFromParcel(parcel);
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
            return new CaptionTemplateModel(z, captionTemplateData, customCaptionTemplateDataCreateFromParcel, z2, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final CaptionTemplateModel[] newArray(int i) {
            return new CaptionTemplateModel[i];
        }
    };
    public static final int $stable = 8;

    public CaptionTemplateModel() {
        this(false, null, new CustomCaptionTemplateData(false, -1, 4, new TextMotionModel("", 0.0f, 0, "", "", "", 3, false, true, false), new TextFontModel(null, null, null, null, null, null, 0, 0, null, null, false, false, false, 0, 16383, null), null), false, false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionTemplateModel)) {
            return false;
        }
        CaptionTemplateModel captionTemplateModel = (CaptionTemplateModel) obj;
        return this.everUsedCaptionTemplate == captionTemplateModel.everUsedCaptionTemplate && Intrinsics.LJFF(this.templateData, captionTemplateModel.templateData) && Intrinsics.LJFF(this.customTemplateData, captionTemplateModel.customTemplateData) && this.isManuallyCleared == captionTemplateModel.isManuallyCleared && this.forceLowercase == captionTemplateModel.forceLowercase && this.forceUppercase == captionTemplateModel.forceUppercase;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.everUsedCaptionTemplate) * 31;
        CaptionTemplateData captionTemplateData = this.templateData;
        return ((((((((iZ2 + (captionTemplateData == null ? 0 : captionTemplateData.hashCode())) * 31) + this.customTemplateData.hashCode()) * 31) + C786410Ut5.Z2(this.isManuallyCleared)) * 31) + C786410Ut5.Z2(this.forceLowercase)) * 31) + C786410Ut5.Z2(this.forceUppercase);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionTemplateModel(everUsedCaptionTemplate=");
        sbLIZ.append(this.everUsedCaptionTemplate);
        sbLIZ.append(", templateData=");
        sbLIZ.append(this.templateData);
        sbLIZ.append(", customTemplateData=");
        sbLIZ.append(this.customTemplateData);
        sbLIZ.append(", isManuallyCleared=");
        sbLIZ.append(this.isManuallyCleared);
        sbLIZ.append(", forceLowercase=");
        sbLIZ.append(this.forceLowercase);
        sbLIZ.append(", forceUppercase=");
        sbLIZ.append(this.forceUppercase);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.everUsedCaptionTemplate ? 1 : 0);
        CaptionTemplateData captionTemplateData = this.templateData;
        if (captionTemplateData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            captionTemplateData.writeToParcel(parcel, i);
        }
        this.customTemplateData.writeToParcel(parcel, i);
        parcel.writeInt(this.isManuallyCleared ? 1 : 0);
        parcel.writeInt(this.forceLowercase ? 1 : 0);
        parcel.writeInt(this.forceUppercase ? 1 : 0);
    }

    public CaptionTemplateModel(boolean z, CaptionTemplateData captionTemplateData, CustomCaptionTemplateData customCaptionTemplateData, boolean z2, boolean z3, boolean z4) {
        this.everUsedCaptionTemplate = z;
        this.templateData = captionTemplateData;
        this.customTemplateData = customCaptionTemplateData;
        this.isManuallyCleared = z2;
        this.forceLowercase = z3;
        this.forceUppercase = z4;
    }

    public static CaptionTemplateModel LIZ(CaptionTemplateModel captionTemplateModel, boolean z, CaptionTemplateData captionTemplateData, CustomCaptionTemplateData customCaptionTemplateData, boolean z2, boolean z3, boolean z4, int i) {
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z2;
        CustomCaptionTemplateData customCaptionTemplateData2 = customCaptionTemplateData;
        CaptionTemplateData captionTemplateData2 = captionTemplateData;
        boolean z8 = z;
        if ((i & 1) != 0) {
            z8 = captionTemplateModel.everUsedCaptionTemplate;
        }
        if ((i & 2) != 0) {
            captionTemplateData2 = captionTemplateModel.templateData;
        }
        if ((i & 4) != 0) {
            customCaptionTemplateData2 = captionTemplateModel.customTemplateData;
        }
        if ((i & 8) != 0) {
            z7 = captionTemplateModel.isManuallyCleared;
        }
        if ((i & 16) != 0) {
            z6 = captionTemplateModel.forceLowercase;
        }
        if ((i & 32) != 0) {
            z5 = captionTemplateModel.forceUppercase;
        }
        captionTemplateModel.getClass();
        return new CaptionTemplateModel(z8, captionTemplateData2, customCaptionTemplateData2, z7, z6, z5);
    }
}
