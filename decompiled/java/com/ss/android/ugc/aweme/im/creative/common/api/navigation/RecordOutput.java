package com.ss.android.ugc.aweme.im.creative.common.api.navigation;

import X.C2188811AlT;
import X.C786410Ut5;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.GroupShotParam;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMRecordPageEnum;
import com.ss.android.ugc.aweme.im.creative.common.api.navigation.RecordOutput;
import com.ss.android.ugc.aweme.im.creative.common.api.navigation.TargetResolution;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class RecordOutput implements Parcelable {
    public static final Parcelable.Creator<RecordOutput> CREATOR = new Parcelable.Creator<RecordOutput>() { // from class: X.0nhw
        @Override // android.os.Parcelable.Creator
        public final RecordOutput createFromParcel(Parcel parcel) {
            boolean z;
            TargetResolution targetResolutionCreateFromParcel;
            boolean z2;
            Uri uri = (Uri) parcel.readParcelable(RecordOutput.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            IMRecordPageEnum iMRecordPageEnumCreateFromParcel = IMRecordPageEnum.CREATOR.createFromParcel(parcel);
            GroupShotParam groupShotParamCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                targetResolutionCreateFromParcel = null;
            } else {
                targetResolutionCreateFromParcel = TargetResolution.CREATOR.createFromParcel(parcel);
            }
            TargetResolution targetResolution = targetResolutionCreateFromParcel;
            Effect effect = (Effect) parcel.readParcelable(RecordOutput.class.getClassLoader());
            if (parcel.readInt() != 0) {
                groupShotParamCreateFromParcel = GroupShotParam.CREATOR.createFromParcel(parcel);
            }
            GroupShotParam groupShotParam = groupShotParamCreateFromParcel;
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new RecordOutput(uri, z, iMRecordPageEnumCreateFromParcel, targetResolution, effect, groupShotParam, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final RecordOutput[] newArray(int i) {
            return new RecordOutput[i];
        }
    };
    public final Effect effect;
    public final GroupShotParam groupShotParam;
    public final boolean isFromAlbum;
    public final boolean isImage;
    public final IMRecordPageEnum page;
    public final TargetResolution targetResolution;
    public final Uri uri;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordOutput)) {
            return false;
        }
        RecordOutput recordOutput = (RecordOutput) obj;
        return Intrinsics.LJFF(this.uri, recordOutput.uri) && this.isImage == recordOutput.isImage && this.page == recordOutput.page && Intrinsics.LJFF(this.targetResolution, recordOutput.targetResolution) && Intrinsics.LJFF(this.effect, recordOutput.effect) && Intrinsics.LJFF(this.groupShotParam, recordOutput.groupShotParam) && this.isFromAlbum == recordOutput.isFromAlbum;
    }

    public final int hashCode() {
        int iHashCode = ((((this.uri.hashCode() * 31) + C786410Ut5.Z2(this.isImage)) * 31) + this.page.hashCode()) * 31;
        TargetResolution targetResolution = this.targetResolution;
        int iHashCode2 = (iHashCode + (targetResolution == null ? 0 : targetResolution.hashCode())) * 31;
        Effect effect = this.effect;
        int iHashCode3 = (iHashCode2 + (effect == null ? 0 : effect.hashCode())) * 31;
        GroupShotParam groupShotParam = this.groupShotParam;
        return ((iHashCode3 + (groupShotParam != null ? groupShotParam.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isFromAlbum);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordOutput(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", isImage=");
        sbLIZ.append(this.isImage);
        sbLIZ.append(", page=");
        sbLIZ.append(this.page);
        sbLIZ.append(", targetResolution=");
        sbLIZ.append(this.targetResolution);
        sbLIZ.append(", effect=");
        sbLIZ.append(this.effect);
        sbLIZ.append(", groupShotParam=");
        sbLIZ.append(this.groupShotParam);
        sbLIZ.append(", isFromAlbum=");
        sbLIZ.append(this.isFromAlbum);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.uri, i);
        parcel.writeInt(this.isImage ? 1 : 0);
        this.page.writeToParcel(parcel, i);
        TargetResolution targetResolution = this.targetResolution;
        if (targetResolution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            targetResolution.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.effect, i);
        GroupShotParam groupShotParam = this.groupShotParam;
        if (groupShotParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupShotParam.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isFromAlbum ? 1 : 0);
    }

    public /* synthetic */ RecordOutput(Uri uri, boolean z, IMRecordPageEnum iMRecordPageEnum, TargetResolution targetResolution, Effect effect, boolean z2, int i) {
        this(uri, z, iMRecordPageEnum, (i & 8) != 0 ? null : targetResolution, (i & 16) != 0 ? null : effect, (GroupShotParam) null, (i & 64) != 0 ? false : z2);
    }

    public RecordOutput(Uri uri, boolean z, IMRecordPageEnum iMRecordPageEnum, TargetResolution targetResolution, Effect effect, GroupShotParam groupShotParam, boolean z2) {
        this.uri = uri;
        this.isImage = z;
        this.page = iMRecordPageEnum;
        this.targetResolution = targetResolution;
        this.effect = effect;
        this.groupShotParam = groupShotParam;
        this.isFromAlbum = z2;
    }
}
