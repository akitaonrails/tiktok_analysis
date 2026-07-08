package com.ss.android.ugc.aweme.api.pipeline;

import X.C1412390mrF;
import X.C2188811AlT;
import X.C531570Kt1;
import X.EnumC1412640mre;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TemplateConsumeCoreParam implements Parcelable {
    public final C1412390mrF dispatchType;
    public final String templateId;
    public final EnumC1412640mre templateType;
    public static final C531570Kt1 Companion = new Object() { // from class: X.0Kt1
    };
    public static final Parcelable.Creator<TemplateConsumeCoreParam> CREATOR = new Parcelable.Creator<TemplateConsumeCoreParam>() { // from class: X.0Kt0
        @Override // android.os.Parcelable.Creator
        public final TemplateConsumeCoreParam createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            EnumC1412640mre enumC1412640mreValueOf = EnumC1412640mre.valueOf(parcel.readString());
            String string2 = parcel.readString();
            if (string2 == null) {
                string2 = "";
            }
            return new TemplateConsumeCoreParam(string, enumC1412640mreValueOf, new C1412390mrF(string2));
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateConsumeCoreParam[] newArray(int i) {
            return new TemplateConsumeCoreParam[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateConsumeCoreParam)) {
            return false;
        }
        TemplateConsumeCoreParam templateConsumeCoreParam = (TemplateConsumeCoreParam) obj;
        return Intrinsics.LJFF(this.templateId, templateConsumeCoreParam.templateId) && this.templateType == templateConsumeCoreParam.templateType && Intrinsics.LJFF(this.dispatchType, templateConsumeCoreParam.dispatchType);
    }

    public final int hashCode() {
        return (((this.templateId.hashCode() * 31) + this.templateType.hashCode()) * 31) + this.dispatchType.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateConsumeCoreParam(templateId=");
        sbLIZ.append(this.templateId);
        sbLIZ.append(", templateType=");
        sbLIZ.append(this.templateType);
        sbLIZ.append(", dispatchType=");
        sbLIZ.append(this.dispatchType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateId);
        parcel.writeString(this.templateType.name());
        parcel.writeString(this.dispatchType.LIZ);
    }

    public TemplateConsumeCoreParam(String str, EnumC1412640mre enumC1412640mre, C1412390mrF c1412390mrF) {
        this.templateId = str;
        this.templateType = enumC1412640mre;
        this.dispatchType = c1412390mrF;
    }
}
