package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.model.MobileEffectTemplateInfo;
import com.ss.android.ugc.aweme.sticker.model.TemplateCategoryInformation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class MobileEffectTemplateInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<MobileEffectTemplateInfo> CREATOR = new Parcelable.Creator<MobileEffectTemplateInfo>() { // from class: X.0ss2
        @Override // android.os.Parcelable.Creator
        public final MobileEffectTemplateInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(TemplateCategoryInformation.CREATOR.createFromParcel(parcel));
                }
            }
            return new MobileEffectTemplateInfo(string, string2, string3, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MobileEffectTemplateInfo[] newArray(int i) {
            return new MobileEffectTemplateInfo[i];
        }
    };

    @C09CT("template_categories")
    public final List<TemplateCategoryInformation> templateCategories;

    @C09CT("template_icon")
    public final String templateIcon;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("template_name")
    public final String templateName;

    @C09CT("template_resource_id")
    public final String templateResourceId;

    public final MobileEffectTemplateInfo copy(String str, String str2, String str3, List<TemplateCategoryInformation> list, String str4) {
        return new MobileEffectTemplateInfo(str, str2, str3, list, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileEffectTemplateInfo)) {
            return false;
        }
        MobileEffectTemplateInfo mobileEffectTemplateInfo = (MobileEffectTemplateInfo) obj;
        return Intrinsics.LJFF(this.templateName, mobileEffectTemplateInfo.templateName) && Intrinsics.LJFF(this.templateIcon, mobileEffectTemplateInfo.templateIcon) && Intrinsics.LJFF(this.templateId, mobileEffectTemplateInfo.templateId) && Intrinsics.LJFF(this.templateCategories, mobileEffectTemplateInfo.templateCategories) && Intrinsics.LJFF(this.templateResourceId, mobileEffectTemplateInfo.templateResourceId);
    }

    public int hashCode() {
        int iHashCode = ((((this.templateName.hashCode() * 31) + this.templateIcon.hashCode()) * 31) + this.templateId.hashCode()) * 31;
        List<TemplateCategoryInformation> list = this.templateCategories;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.templateResourceId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MobileEffectTemplateInfo(templateName=");
        sbLIZ.append(this.templateName);
        sbLIZ.append(", templateIcon=");
        sbLIZ.append(this.templateIcon);
        sbLIZ.append(", templateId=");
        sbLIZ.append(this.templateId);
        sbLIZ.append(", templateCategories=");
        sbLIZ.append(this.templateCategories);
        sbLIZ.append(", templateResourceId=");
        sbLIZ.append(this.templateResourceId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateName);
        parcel.writeString(this.templateIcon);
        parcel.writeString(this.templateId);
        List<TemplateCategoryInformation> list = this.templateCategories;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<TemplateCategoryInformation> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.templateResourceId);
    }

    public final List<TemplateCategoryInformation> getTemplateCategories() {
        return this.templateCategories;
    }

    public final String getTemplateIcon() {
        return this.templateIcon;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public final String getTemplateResourceId() {
        return this.templateResourceId;
    }

    public MobileEffectTemplateInfo(String str, String str2, String str3, List<TemplateCategoryInformation> list, String str4) {
        this.templateName = str;
        this.templateIcon = str2;
        this.templateId = str3;
        this.templateCategories = list;
        this.templateResourceId = str4;
    }
}
