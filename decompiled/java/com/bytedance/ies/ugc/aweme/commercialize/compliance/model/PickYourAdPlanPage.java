package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class PickYourAdPlanPage implements Serializable, Parcelable {
    public static final Parcelable.Creator<PickYourAdPlanPage> CREATOR = new Parcelable.Creator<PickYourAdPlanPage>() { // from class: X.0TOE
        @Override // android.os.Parcelable.Creator
        public final PickYourAdPlanPage createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            boolean z3 = true;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readSerializable());
                }
            }
            return new PickYourAdPlanPage(string, string2, arrayList, boolValueOf, string3, string4, string5, boolValueOf2, boolValueOf3, numValueOf, numValueOf2, numValueOf3, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final PickYourAdPlanPage[] newArray(int i) {
            return new PickYourAdPlanPage[i];
        }
    };

    @C09CT("button_desc")
    public final String buttonDesc;

    @C09CT("choice_source")
    public final Integer choiceSource;

    @C09CT("continue_button_text")
    public final String continueButtonText;

    @C09CT("descriptions")
    public final List<Description> descriptions;

    @C09CT("is_continue_pay")
    public final Boolean isContinuePay;

    @C09CT("is_skippable")
    public final Boolean isSkippable;

    @C09CT("need_display")
    public final Boolean needDisplay;

    @C09CT("offer_infos")
    public final List<OfferInfo> offerInfo;

    @C09CT("pre_ticking_selection")
    public final Integer preTickingSelection;

    @C09CT("prompt_type")
    public final Integer promptType;

    @C09CT("skippable_button_text")
    public final String skippableButtonText;

    @C09CT("subtitle")
    public final String subtitle;

    @C09CT("title")
    public final String title;

    public final PickYourAdPlanPage copy(String str, String str2, List<OfferInfo> list, Boolean bool, String str3, String str4, String str5, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, List<Description> list2) {
        return new PickYourAdPlanPage(str, str2, list, bool, str3, str4, str5, bool2, bool3, num, num2, num3, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickYourAdPlanPage)) {
            return false;
        }
        PickYourAdPlanPage pickYourAdPlanPage = (PickYourAdPlanPage) obj;
        return Intrinsics.LJFF(this.title, pickYourAdPlanPage.title) && Intrinsics.LJFF(this.subtitle, pickYourAdPlanPage.subtitle) && Intrinsics.LJFF(this.offerInfo, pickYourAdPlanPage.offerInfo) && Intrinsics.LJFF(this.isSkippable, pickYourAdPlanPage.isSkippable) && Intrinsics.LJFF(this.skippableButtonText, pickYourAdPlanPage.skippableButtonText) && Intrinsics.LJFF(this.continueButtonText, pickYourAdPlanPage.continueButtonText) && Intrinsics.LJFF(this.buttonDesc, pickYourAdPlanPage.buttonDesc) && Intrinsics.LJFF(this.isContinuePay, pickYourAdPlanPage.isContinuePay) && Intrinsics.LJFF(this.needDisplay, pickYourAdPlanPage.needDisplay) && Intrinsics.LJFF(this.preTickingSelection, pickYourAdPlanPage.preTickingSelection) && Intrinsics.LJFF(this.promptType, pickYourAdPlanPage.promptType) && Intrinsics.LJFF(this.choiceSource, pickYourAdPlanPage.choiceSource) && Intrinsics.LJFF(this.descriptions, pickYourAdPlanPage.descriptions);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<OfferInfo> list = this.offerInfo;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isSkippable;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.skippableButtonText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.continueButtonText;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buttonDesc;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.isContinuePay;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.needDisplay;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.preTickingSelection;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.promptType;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.choiceSource;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<Description> list2 = this.descriptions;
        return iHashCode12 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "PickYourAdPlanPage(title=" + this.title + ", subtitle=" + this.subtitle + ", offerInfo=" + this.offerInfo + ", isSkippable=" + this.isSkippable + ", skippableButtonText=" + this.skippableButtonText + ", continueButtonText=" + this.continueButtonText + ", buttonDesc=" + this.buttonDesc + ", isContinuePay=" + this.isContinuePay + ", needDisplay=" + this.needDisplay + ", preTickingSelection=" + this.preTickingSelection + ", promptType=" + this.promptType + ", choiceSource=" + this.choiceSource + ", descriptions=" + this.descriptions + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        List<OfferInfo> list = this.offerInfo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<OfferInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }
        Boolean bool = this.isSkippable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.skippableButtonText);
        parcel.writeString(this.continueButtonText);
        parcel.writeString(this.buttonDesc);
        Boolean bool2 = this.isContinuePay;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.needDisplay;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Integer num = this.preTickingSelection;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.promptType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.choiceSource;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        List<Description> list2 = this.descriptions;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<Description> it3 = list2.iterator();
        while (it3.hasNext()) {
            parcel.writeSerializable(it3.next());
        }
    }

    public final String getButtonDesc() {
        return this.buttonDesc;
    }

    public final Integer getChoiceSource() {
        return this.choiceSource;
    }

    public final String getContinueButtonText() {
        return this.continueButtonText;
    }

    public final List<Description> getDescriptions() {
        return this.descriptions;
    }

    public final Boolean getNeedDisplay() {
        return this.needDisplay;
    }

    public final List<OfferInfo> getOfferInfo() {
        return this.offerInfo;
    }

    public final Integer getPreTickingSelection() {
        return this.preTickingSelection;
    }

    public final Integer getPromptType() {
        return this.promptType;
    }

    public final String getSkippableButtonText() {
        return this.skippableButtonText;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Boolean isContinuePay() {
        return this.isContinuePay;
    }

    public final Boolean isSkippable() {
        return this.isSkippable;
    }

    public PickYourAdPlanPage(String str, String str2, List<OfferInfo> list, Boolean bool, String str3, String str4, String str5, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, List<Description> list2) {
        this.title = str;
        this.subtitle = str2;
        this.offerInfo = list;
        this.isSkippable = bool;
        this.skippableButtonText = str3;
        this.continueButtonText = str4;
        this.buttonDesc = str5;
        this.isContinuePay = bool2;
        this.needDisplay = bool3;
        this.preTickingSelection = num;
        this.promptType = num2;
        this.choiceSource = num3;
        this.descriptions = list2;
    }

    public PickYourAdPlanPage(String str, String str2, List list, Boolean bool, String str3, String str4, String str5, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) == 0 ? str5 : "", bool2, bool3, num, (i & 1024) != 0 ? 0 : num2, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : num3, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : list2);
    }
}
