package com.ss.android.ugc.aweme.im.message.persistentext.adapter;

import X.C062F;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.BotFeedbackData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BotFeedbackData implements Parcelable {
    public static final Parcelable.Creator<BotFeedbackData> CREATOR = new Parcelable.Creator<BotFeedbackData>() { // from class: X.061H
        @Override // android.os.Parcelable.Creator
        public final BotFeedbackData createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(Long.valueOf(parcel.readLong()), C062F.valueOf(parcel.readString()));
            }
            return new BotFeedbackData(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BotFeedbackData[] newArray(int i) {
            return new BotFeedbackData[i];
        }
    };
    public final Map<Long, C062F> feedbackMap;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BotFeedbackData) && Intrinsics.LJFF(this.feedbackMap, ((BotFeedbackData) obj).feedbackMap);
    }

    public final int hashCode() {
        return this.feedbackMap.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotFeedbackData(feedbackMap=");
        sbLIZ.append(this.feedbackMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map<Long, C062F> map = this.feedbackMap;
        parcel.writeInt(map.size());
        for (Map.Entry<Long, C062F> entry : map.entrySet()) {
            parcel.writeLong(entry.getKey().longValue());
            parcel.writeString(entry.getValue().name());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BotFeedbackData(Map<Long, ? extends C062F> map) {
        this.feedbackMap = map;
    }
}
