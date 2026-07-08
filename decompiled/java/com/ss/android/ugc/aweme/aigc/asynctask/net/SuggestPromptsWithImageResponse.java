package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.asynctask.net.SuggestPromptsResponse;
import com.ss.android.ugc.aweme.aigc.asynctask.net.SuggestPromptsWithImageResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class SuggestPromptsWithImageResponse implements Parcelable {

    @C09CT("prompt_infos")
    public final List<SuggestPromptsResponse.PromptItem> promptInfos;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;
    public static final Parcelable.Creator<SuggestPromptsWithImageResponse> CREATOR = new Parcelable.Creator<SuggestPromptsWithImageResponse>() { // from class: X.0LX5
        @Override // android.os.Parcelable.Creator
        public final SuggestPromptsWithImageResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SuggestPromptsResponse.PromptItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new SuggestPromptsWithImageResponse(arrayList, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestPromptsWithImageResponse[] newArray(int i) {
            return new SuggestPromptsWithImageResponse[i];
        }
    };
    public static final int $stable = 8;

    public SuggestPromptsWithImageResponse() {
        this(null, null, null);
    }

    public final SuggestPromptsWithImageResponse copy(List<SuggestPromptsResponse.PromptItem> list, Integer num, String str) {
        return new SuggestPromptsWithImageResponse(list, num, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestPromptsWithImageResponse)) {
            return false;
        }
        SuggestPromptsWithImageResponse suggestPromptsWithImageResponse = (SuggestPromptsWithImageResponse) obj;
        return Intrinsics.LJFF(this.promptInfos, suggestPromptsWithImageResponse.promptInfos) && Intrinsics.LJFF(this.statusCode, suggestPromptsWithImageResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, suggestPromptsWithImageResponse.statusMsg);
    }

    public int hashCode() {
        List<SuggestPromptsResponse.PromptItem> list = this.promptInfos;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.statusCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.statusMsg;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestPromptsWithImageResponse(promptInfos=");
        sbLIZ.append(this.promptInfos);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<SuggestPromptsResponse.PromptItem> list = this.promptInfos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SuggestPromptsResponse.PromptItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.statusCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.statusMsg);
    }

    public final List<SuggestPromptsResponse.PromptItem> getPromptInfos() {
        return this.promptInfos;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public SuggestPromptsWithImageResponse(List<SuggestPromptsResponse.PromptItem> list, Integer num, String str) {
        this.promptInfos = list;
        this.statusCode = num;
        this.statusMsg = str;
    }
}
