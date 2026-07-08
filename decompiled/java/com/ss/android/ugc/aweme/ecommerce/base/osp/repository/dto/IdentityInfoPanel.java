package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class IdentityInfoPanel implements Serializable, Parcelable {

    @C09CT("description")
    public String description;

    @C09CT("identity_info_options")
    public List<IdentityInfoOption> identityInfoOptions;

    @C09CT("invalid_hint")
    public String invalidHint;

    @C09CT("placeholder_text")
    public String placeholderText;

    @C09CT("tax_submit_button")
    public String taxSubmitButton;

    @C09CT("title")
    public String title;
    public static final Parcelable.Creator<IdentityInfoPanel> CREATOR = new Parcelable.Creator<IdentityInfoPanel>() { // from class: X.02wM
        @Override // android.os.Parcelable.Creator
        public final IdentityInfoPanel createFromParcel(Parcel parcel) {
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
                    arrayList.add(IdentityInfoOption.CREATOR.createFromParcel(parcel));
                }
            }
            return new IdentityInfoPanel(string, string2, string3, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityInfoPanel[] newArray(int i) {
            return new IdentityInfoPanel[i];
        }
    };
    public static final int $stable = 8;

    public IdentityInfoPanel() {
    }

    public final IdentityInfoPanel copy(String str, String str2, String str3, List<IdentityInfoOption> list, String str4, String str5) {
        return new IdentityInfoPanel(str, str2, str3, list, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityInfoPanel)) {
            return false;
        }
        IdentityInfoPanel identityInfoPanel = (IdentityInfoPanel) obj;
        return Intrinsics.LJFF(this.title, identityInfoPanel.title) && Intrinsics.LJFF(this.description, identityInfoPanel.description) && Intrinsics.LJFF(this.invalidHint, identityInfoPanel.invalidHint) && Intrinsics.LJFF(this.identityInfoOptions, identityInfoPanel.identityInfoOptions) && Intrinsics.LJFF(this.taxSubmitButton, identityInfoPanel.taxSubmitButton) && Intrinsics.LJFF(this.placeholderText, identityInfoPanel.placeholderText);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.invalidHint;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<IdentityInfoOption> list = this.identityInfoOptions;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.taxSubmitButton;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.placeholderText;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IdentityInfoPanel(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", invalidHint=");
        sbLIZ.append(this.invalidHint);
        sbLIZ.append(", identityInfoOptions=");
        sbLIZ.append(this.identityInfoOptions);
        sbLIZ.append(", taxSubmitButton=");
        sbLIZ.append(this.taxSubmitButton);
        sbLIZ.append(", placeholderText=");
        sbLIZ.append(this.placeholderText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.invalidHint);
        List<IdentityInfoOption> list = this.identityInfoOptions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<IdentityInfoOption> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.taxSubmitButton);
        parcel.writeString(this.placeholderText);
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<IdentityInfoOption> getIdentityInfoOptions() {
        return this.identityInfoOptions;
    }

    public final String getInvalidHint() {
        return this.invalidHint;
    }

    public final String getPlaceholderText() {
        return this.placeholderText;
    }

    public final String getTaxSubmitButton() {
        return this.taxSubmitButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public IdentityInfoPanel(String str, String str2, String str3, List<IdentityInfoOption> list, String str4, String str5) {
        this.title = str;
        this.description = str2;
        this.invalidHint = str3;
        this.identityInfoOptions = list;
        this.taxSubmitButton = str4;
        this.placeholderText = str5;
    }
}
