package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ExposeUserRightPanel implements Parcelable {

    @C09CT("background_image")
    public Icon background;

    @C09CT("background_color")
    public Integer backgroundColor;

    @C09CT("bg_end_color")
    public CustomColor bgEndColor;

    @C09CT("bg_start_color")
    public CustomColor bgStartColor;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("description")
    public String description;

    @C09CT("expose_user_rights")
    public List<ExposeUserRight> exposeUserRights;

    @C09CT("icon")
    public Icon icon;

    @C09CT("schema")
    public String schema;

    @C09CT("style")
    public Integer style;

    @C09CT("title")
    public String title;

    @C09CT("title_en")
    public String titleEn;
    public static final Parcelable.Creator<ExposeUserRightPanel> CREATOR = new Parcelable.Creator<ExposeUserRightPanel>() { // from class: X.02ZP
        @Override // android.os.Parcelable.Creator
        public final ExposeUserRightPanel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            String string = parcel.readString();
            Icon icon = (Icon) parcel.readParcelable(ExposeUserRightPanel.class.getClassLoader());
            Icon icon2 = (Icon) parcel.readParcelable(ExposeUserRightPanel.class.getClassLoader());
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ExposeUserRight.CREATOR.createFromParcel(parcel));
                }
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new ExposeUserRightPanel(string, icon, icon2, arrayList, string2, numValueOf, numValueOf2, (CustomColor) parcel.readParcelable(ExposeUserRightPanel.class.getClassLoader()), (CustomColor) parcel.readParcelable(ExposeUserRightPanel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExposeUserRightPanel[] newArray(int i) {
            return new ExposeUserRightPanel[i];
        }
    };
    public static final int $stable = 8;

    public ExposeUserRightPanel() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExposeUserRightPanel)) {
            return false;
        }
        ExposeUserRightPanel exposeUserRightPanel = (ExposeUserRightPanel) obj;
        return Intrinsics.LJFF(this.title, exposeUserRightPanel.title) && Intrinsics.LJFF(this.icon, exposeUserRightPanel.icon) && Intrinsics.LJFF(this.background, exposeUserRightPanel.background) && Intrinsics.LJFF(this.exposeUserRights, exposeUserRightPanel.exposeUserRights) && Intrinsics.LJFF(this.titleEn, exposeUserRightPanel.titleEn) && Intrinsics.LJFF(this.style, exposeUserRightPanel.style) && Intrinsics.LJFF(this.backgroundColor, exposeUserRightPanel.backgroundColor) && Intrinsics.LJFF(this.bgStartColor, exposeUserRightPanel.bgStartColor) && Intrinsics.LJFF(this.bgEndColor, exposeUserRightPanel.bgEndColor) && Intrinsics.LJFF(this.description, exposeUserRightPanel.description) && Intrinsics.LJFF(this.schema, exposeUserRightPanel.schema) && Intrinsics.LJFF(this.daInfo, exposeUserRightPanel.daInfo);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.icon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        Icon icon2 = this.background;
        int iHashCode3 = (iHashCode2 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        List<ExposeUserRight> list = this.exposeUserRights;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.titleEn;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.style;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.backgroundColor;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        CustomColor customColor = this.bgStartColor;
        int iHashCode8 = (iHashCode7 + (customColor == null ? 0 : customColor.hashCode())) * 31;
        CustomColor customColor2 = this.bgEndColor;
        int iHashCode9 = (iHashCode8 + (customColor2 == null ? 0 : customColor2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.schema;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.daInfo;
        return iHashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "ExposeUserRightPanel(title=" + this.title + ", icon=" + this.icon + ", background=" + this.background + ", exposeUserRights=" + this.exposeUserRights + ", titleEn=" + this.titleEn + ", style=" + this.style + ", backgroundColor=" + this.backgroundColor + ", bgStartColor=" + this.bgStartColor + ", bgEndColor=" + this.bgEndColor + ", description=" + this.description + ", schema=" + this.schema + ", daInfo=" + this.daInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.icon, i);
        parcel.writeParcelable(this.background, i);
        List<ExposeUserRight> list = this.exposeUserRights;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ExposeUserRight> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.titleEn);
        Integer num = this.style;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.backgroundColor;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeParcelable(this.bgStartColor, i);
        parcel.writeParcelable(this.bgEndColor, i);
        parcel.writeString(this.description);
        parcel.writeString(this.schema);
        parcel.writeString(this.daInfo);
    }

    public ExposeUserRightPanel(String str, Icon icon, Icon icon2, List<ExposeUserRight> list, String str2, Integer num, Integer num2, CustomColor customColor, CustomColor customColor2, String str3, String str4, String str5) {
        this.title = str;
        this.icon = icon;
        this.background = icon2;
        this.exposeUserRights = list;
        this.titleEn = str2;
        this.style = num;
        this.backgroundColor = num2;
        this.bgStartColor = customColor;
        this.bgEndColor = customColor2;
        this.description = str3;
        this.schema = str4;
        this.daInfo = str5;
    }
}
