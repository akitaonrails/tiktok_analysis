package com.ss.android.ugc.aweme.aime.effectpanel;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aime.effectpanel.AiMeEffectStyle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AiMeEffectStyle implements Parcelable {

    @C09CT("editable_prompt")
    public String actualPrompt;

    @C09CT("challenge")
    public List<String> challengeId;

    @C09CT("female_prompt")
    public String femalePrompt;

    @C09CT("imageURL")
    public final String image;

    @C09CT("is_selected")
    public boolean isSelected;

    @C09CT("male_prompt")
    public String malePrompt;

    @C09CT("music")
    public List<String> musicList;

    @C09CT("name")
    public final String name;

    @C09CT("resource_id")
    public final String resourceId;

    @C09CT("style_id")
    public String styleId;
    public static final Parcelable.Creator<AiMeEffectStyle> CREATOR = new Parcelable.Creator<AiMeEffectStyle>() { // from class: X.0mhB
        @Override // android.os.Parcelable.Creator
        public final AiMeEffectStyle createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AiMeEffectStyle(string, string2, string3, string4, string5, string6, string7, z, parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AiMeEffectStyle[] newArray(int i) {
            return new AiMeEffectStyle[i];
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
        if (!(obj instanceof AiMeEffectStyle)) {
            return false;
        }
        AiMeEffectStyle aiMeEffectStyle = (AiMeEffectStyle) obj;
        return Intrinsics.LJFF(this.actualPrompt, aiMeEffectStyle.actualPrompt) && Intrinsics.LJFF(this.femalePrompt, aiMeEffectStyle.femalePrompt) && Intrinsics.LJFF(this.malePrompt, aiMeEffectStyle.malePrompt) && Intrinsics.LJFF(this.image, aiMeEffectStyle.image) && Intrinsics.LJFF(this.name, aiMeEffectStyle.name) && Intrinsics.LJFF(this.styleId, aiMeEffectStyle.styleId) && Intrinsics.LJFF(this.resourceId, aiMeEffectStyle.resourceId) && this.isSelected == aiMeEffectStyle.isSelected && Intrinsics.LJFF(this.musicList, aiMeEffectStyle.musicList) && Intrinsics.LJFF(this.challengeId, aiMeEffectStyle.challengeId);
    }

    public final int hashCode() {
        String str = this.actualPrompt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.femalePrompt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.malePrompt;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.image;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.styleId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.resourceId;
        int iHashCode7 = (((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + C786410Ut5.Z2(this.isSelected)) * 31;
        List<String> list = this.musicList;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.challengeId;
        return iHashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiMeEffectStyle(actualPrompt=");
        sbLIZ.append(this.actualPrompt);
        sbLIZ.append(", femalePrompt=");
        sbLIZ.append(this.femalePrompt);
        sbLIZ.append(", malePrompt=");
        sbLIZ.append(this.malePrompt);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", styleId=");
        sbLIZ.append(this.styleId);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.isSelected);
        sbLIZ.append(", musicList=");
        sbLIZ.append(this.musicList);
        sbLIZ.append(", challengeId=");
        sbLIZ.append(this.challengeId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.actualPrompt);
        parcel.writeString(this.femalePrompt);
        parcel.writeString(this.malePrompt);
        parcel.writeString(this.image);
        parcel.writeString(this.name);
        parcel.writeString(this.styleId);
        parcel.writeString(this.resourceId);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeStringList(this.musicList);
        parcel.writeStringList(this.challengeId);
    }

    public AiMeEffectStyle(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, List<String> list, List<String> list2) {
        this.actualPrompt = str;
        this.femalePrompt = str2;
        this.malePrompt = str3;
        this.image = str4;
        this.name = str5;
        this.styleId = str6;
        this.resourceId = str7;
        this.isSelected = z;
        this.musicList = list;
        this.challengeId = list2;
    }
}
