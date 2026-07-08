package com.ss.android.ugc.aweme.shortvideo;

import X.C580180MpE;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class DuetContext implements Parcelable {
    public String chorusMethod;
    public Effect defaultDuetLayout;
    public String duetAudioPath;
    public String duetFromAwemeId;
    public String duetFromChallengeName;
    public Integer duetGroupDuration;
    public String duetLayout;
    public String duetLayoutInfoJson;
    public String duetLayoutMode;
    public String duetOriginId;
    public int duetUploadType;
    public int duetVideoHeight;
    public String duetVideoPath;
    public int duetVideoWidth;
    public boolean isDuetSing;
    public boolean isDuetUpload;
    public int isFromDuetSticker;
    public int layoutDirection;
    public boolean micDefaultState;
    public boolean successEnableAEC;
    public float veSuggestHumanVolume;
    public float veSuggestVideoVolume;
    public List<EmbaddedWindowInfo> windowInfoList;
    public static final C580180MpE Companion = new Object() { // from class: X.0MpE
    };
    public static final Parcelable.Creator<DuetContext> CREATOR = new Parcelable.Creator<DuetContext>() { // from class: X.0MpD
        @Override // android.os.Parcelable.Creator
        public final DuetContext createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(parcel.readParcelable(DuetContext.class.getClassLoader()));
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i5 = parcel.readInt();
            String string7 = parcel.readString();
            int i6 = parcel.readInt();
            Effect effect = (Effect) parcel.readParcelable(DuetContext.class.getClassLoader());
            String string8 = parcel.readString();
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
            int i7 = parcel.readInt();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new DuetContext(string, string2, string3, string4, f, f2, z, i, i2, string5, string6, arrayList, z2, i5, string7, i6, effect, string8, z3, z4, i7, string9, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final DuetContext[] newArray(int i) {
            return new DuetContext[i];
        }
    };
    public static final int DUET_UPLOAD_TYPE_PICTURE = 1;
    public static final int DUET_UPLOAD_TYPE_VIDEO = 2;

    public DuetContext() {
        this(null, null, null, null, 1.0f, 1.0f, false, 0, 0, null, null, new ArrayList(), false, 0, "", 0, null, null, false, false, 0, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetContext)) {
            return false;
        }
        DuetContext duetContext = (DuetContext) obj;
        return Intrinsics.LJFF(this.duetFromChallengeName, duetContext.duetFromChallengeName) && Intrinsics.LJFF(this.duetFromAwemeId, duetContext.duetFromAwemeId) && Intrinsics.LJFF(this.duetVideoPath, duetContext.duetVideoPath) && Intrinsics.LJFF(this.duetAudioPath, duetContext.duetAudioPath) && Float.compare(this.veSuggestHumanVolume, duetContext.veSuggestHumanVolume) == 0 && Float.compare(this.veSuggestVideoVolume, duetContext.veSuggestVideoVolume) == 0 && this.successEnableAEC == duetContext.successEnableAEC && this.duetVideoWidth == duetContext.duetVideoWidth && this.duetVideoHeight == duetContext.duetVideoHeight && Intrinsics.LJFF(this.duetLayout, duetContext.duetLayout) && Intrinsics.LJFF(this.duetLayoutInfoJson, duetContext.duetLayoutInfoJson) && Intrinsics.LJFF(this.windowInfoList, duetContext.windowInfoList) && this.micDefaultState == duetContext.micDefaultState && this.isFromDuetSticker == duetContext.isFromDuetSticker && Intrinsics.LJFF(this.duetLayoutMode, duetContext.duetLayoutMode) && this.layoutDirection == duetContext.layoutDirection && Intrinsics.LJFF(this.defaultDuetLayout, duetContext.defaultDuetLayout) && Intrinsics.LJFF(this.duetOriginId, duetContext.duetOriginId) && this.isDuetSing == duetContext.isDuetSing && this.isDuetUpload == duetContext.isDuetUpload && this.duetUploadType == duetContext.duetUploadType && Intrinsics.LJFF(this.chorusMethod, duetContext.chorusMethod) && Intrinsics.LJFF(this.duetGroupDuration, duetContext.duetGroupDuration);
    }

    public final String toString() {
        return "DuetContext(duetFromChallengeName=" + this.duetFromChallengeName + ", duetFromAwemeId=" + this.duetFromAwemeId + ", duetVideoPath=" + this.duetVideoPath + ", duetAudioPath=" + this.duetAudioPath + ", veSuggestHumanVolume=" + this.veSuggestHumanVolume + ", veSuggestVideoVolume=" + this.veSuggestVideoVolume + ", successEnableAEC=" + this.successEnableAEC + ", duetVideoWidth=" + this.duetVideoWidth + ", duetVideoHeight=" + this.duetVideoHeight + ", duetLayout=" + this.duetLayout + ", duetLayoutInfoJson=" + this.duetLayoutInfoJson + ", windowInfoList=" + this.windowInfoList + ", micDefaultState=" + this.micDefaultState + ", isFromDuetSticker=" + this.isFromDuetSticker + ", duetLayoutMode=" + this.duetLayoutMode + ", layoutDirection=" + this.layoutDirection + ", defaultDuetLayout=" + this.defaultDuetLayout + ", duetOriginId=" + this.duetOriginId + ", isDuetSing=" + this.isDuetSing + ", isDuetUpload=" + this.isDuetUpload + ", duetUploadType=" + this.duetUploadType + ", chorusMethod=" + this.chorusMethod + ", duetGroupDuration=" + this.duetGroupDuration + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.duetFromChallengeName);
        parcel.writeString(this.duetFromAwemeId);
        parcel.writeString(this.duetVideoPath);
        parcel.writeString(this.duetAudioPath);
        parcel.writeFloat(this.veSuggestHumanVolume);
        parcel.writeFloat(this.veSuggestVideoVolume);
        parcel.writeInt(this.successEnableAEC ? 1 : 0);
        parcel.writeInt(this.duetVideoWidth);
        parcel.writeInt(this.duetVideoHeight);
        parcel.writeString(this.duetLayout);
        parcel.writeString(this.duetLayoutInfoJson);
        List<EmbaddedWindowInfo> list = this.windowInfoList;
        parcel.writeInt(list.size());
        Iterator<EmbaddedWindowInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeInt(this.micDefaultState ? 1 : 0);
        parcel.writeInt(this.isFromDuetSticker);
        parcel.writeString(this.duetLayoutMode);
        parcel.writeInt(this.layoutDirection);
        parcel.writeParcelable(this.defaultDuetLayout, i);
        parcel.writeString(this.duetOriginId);
        parcel.writeInt(this.isDuetSing ? 1 : 0);
        parcel.writeInt(this.isDuetUpload ? 1 : 0);
        parcel.writeInt(this.duetUploadType);
        parcel.writeString(this.chorusMethod);
        Integer num = this.duetGroupDuration;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public final int hashCode() {
        String str = this.duetFromChallengeName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.duetFromAwemeId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.duetVideoPath;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.duetAudioPath;
        int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Float.floatToIntBits(this.veSuggestHumanVolume)) * 31) + Float.floatToIntBits(this.veSuggestVideoVolume)) * 31) + C786410Ut5.Z2(this.successEnableAEC)) * 31) + this.duetVideoWidth) * 31) + this.duetVideoHeight) * 31;
        String str5 = this.duetLayout;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.duetLayoutInfoJson;
        int iHashCode6 = (((((((((((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.windowInfoList.hashCode()) * 31) + C786410Ut5.Z2(this.micDefaultState)) * 31) + this.isFromDuetSticker) * 31) + this.duetLayoutMode.hashCode()) * 31) + this.layoutDirection) * 31;
        Effect effect = this.defaultDuetLayout;
        int iHashCode7 = (iHashCode6 + (effect == null ? 0 : effect.hashCode())) * 31;
        String str7 = this.duetOriginId;
        int iHashCode8 = (((((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + C786410Ut5.Z2(this.isDuetSing)) * 31) + C786410Ut5.Z2(this.isDuetUpload)) * 31) + this.duetUploadType) * 31;
        String str8 = this.chorusMethod;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.duetGroupDuration;
        return iHashCode9 + (num != null ? num.hashCode() : 0);
    }

    public DuetContext(String str, String str2, String str3, String str4, float f, float f2, boolean z, int i, int i2, String str5, String str6, List<EmbaddedWindowInfo> list, boolean z2, int i3, String str7, int i4, Effect effect, String str8, boolean z3, boolean z4, int i5, String str9, Integer num) {
        this.duetFromChallengeName = str;
        this.duetFromAwemeId = str2;
        this.duetVideoPath = str3;
        this.duetAudioPath = str4;
        this.veSuggestHumanVolume = f;
        this.veSuggestVideoVolume = f2;
        this.successEnableAEC = z;
        this.duetVideoWidth = i;
        this.duetVideoHeight = i2;
        this.duetLayout = str5;
        this.duetLayoutInfoJson = str6;
        this.windowInfoList = list;
        this.micDefaultState = z2;
        this.isFromDuetSticker = i3;
        this.duetLayoutMode = str7;
        this.layoutDirection = i4;
        this.defaultDuetLayout = effect;
        this.duetOriginId = str8;
        this.isDuetSing = z3;
        this.isDuetUpload = z4;
        this.duetUploadType = i5;
        this.chorusMethod = str9;
        this.duetGroupDuration = num;
    }
}
