package com.ss.android.ugc.aweme.creative.model.edit.aicover;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1454140nwa;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AICoverInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<AICoverInfo> CREATOR = new Parcelable.Creator<AICoverInfo>() { // from class: X.0nxh
        @Override // android.os.Parcelable.Creator
        public final AICoverInfo createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(AICoverItem.CREATOR.createFromParcel(parcel));
            }
            String string2 = parcel.readString();
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new AICoverInfo(string, i, arrayList, string2, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final AICoverInfo[] newArray(int i) {
            return new AICoverInfo[i];
        }
    };

    @C09CT("covers")
    public final List<AICoverItem> covers;

    @C09CT("insert_index")
    public final int insertIndex;

    @C09CT("is_confirmed")
    public final boolean isConfirmed;

    @C09CT("selected_cover_id")
    public String selectedCoverId;

    @C09CT("skip_record_on_terminal")
    public final boolean skipReorderOnTerminal;

    @C09CT("task_id")
    public final String taskId;

    public final AICoverInfo copy(String str, int i, List<AICoverItem> list, String str2, boolean z, boolean z2) {
        return new AICoverInfo(str, i, list, str2, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AICoverInfo)) {
            return false;
        }
        AICoverInfo aICoverInfo = (AICoverInfo) obj;
        return Intrinsics.LJFF(this.taskId, aICoverInfo.taskId) && this.insertIndex == aICoverInfo.insertIndex && Intrinsics.LJFF(this.covers, aICoverInfo.covers) && Intrinsics.LJFF(this.selectedCoverId, aICoverInfo.selectedCoverId) && this.isConfirmed == aICoverInfo.isConfirmed && this.skipReorderOnTerminal == aICoverInfo.skipReorderOnTerminal;
    }

    public int hashCode() {
        int iHashCode = ((((this.taskId.hashCode() * 31) + this.insertIndex) * 31) + this.covers.hashCode()) * 31;
        String str = this.selectedCoverId;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.isConfirmed)) * 31) + C786410Ut5.Z2(this.skipReorderOnTerminal);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AICoverInfo(taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", insertIndex=");
        sbLIZ.append(this.insertIndex);
        sbLIZ.append(", covers=");
        sbLIZ.append(this.covers);
        sbLIZ.append(", selectedCoverId=");
        sbLIZ.append(this.selectedCoverId);
        sbLIZ.append(", isConfirmed=");
        sbLIZ.append(this.isConfirmed);
        sbLIZ.append(", skipReorderOnTerminal=");
        sbLIZ.append(this.skipReorderOnTerminal);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.taskId);
        parcel.writeInt(this.insertIndex);
        List<AICoverItem> list = this.covers;
        parcel.writeInt(list.size());
        Iterator<AICoverItem> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.selectedCoverId);
        parcel.writeInt(this.isConfirmed ? 1 : 0);
        parcel.writeInt(this.skipReorderOnTerminal ? 1 : 0);
    }

    public final boolean getAllFinished() {
        if (!(!this.covers.isEmpty())) {
            return false;
        }
        List<AICoverItem> list = this.covers;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<AICoverItem> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!it2.next().isFinished()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean getAnyFailed() {
        List<AICoverItem> list = this.covers;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<AICoverItem> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().getState() == EnumC1454140nwa.FAILED) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean getAnyGenerating() {
        List<AICoverItem> list = this.covers;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<AICoverItem> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().getState() == EnumC1454140nwa.GENERATING) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int getReadyCount() {
        List<AICoverItem> list = this.covers;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<AICoverItem> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().isReady() && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public final boolean getHasReady() {
        return getReadyCount() > 0;
    }

    public final boolean isAllFailed() {
        return getAllFinished() && !getHasReady();
    }

    public final List<AICoverItem> getCovers() {
        return this.covers;
    }

    public final int getInsertIndex() {
        return this.insertIndex;
    }

    public final String getSelectedCoverId() {
        return this.selectedCoverId;
    }

    public final boolean getSkipReorderOnTerminal() {
        return this.skipReorderOnTerminal;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final boolean isConfirmed() {
        return this.isConfirmed;
    }

    public final void setSelectedCoverId(String str) {
        this.selectedCoverId = str;
    }

    public AICoverInfo(String str, int i, List<AICoverItem> list, String str2, boolean z, boolean z2) {
        this.taskId = str;
        this.insertIndex = i;
        this.covers = list;
        this.selectedCoverId = str2;
        this.isConfirmed = z;
        this.skipReorderOnTerminal = z2;
    }
}
