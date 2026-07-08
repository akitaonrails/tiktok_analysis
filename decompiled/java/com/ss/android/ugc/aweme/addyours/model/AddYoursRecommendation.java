package com.ss.android.ugc.aweme.addyours.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursRecommendation implements Serializable, Parcelable {
    public static final Parcelable.Creator<AddYoursRecommendation> CREATOR = new Parcelable.Creator<AddYoursRecommendation>() { // from class: X.0NNL
        @Override // android.os.Parcelable.Creator
        public final AddYoursRecommendation createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AddYoursRecommendation(lValueOf, string, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AddYoursRecommendation[] newArray(int i) {
            return new AddYoursRecommendation[i];
        }
    };

    @C09CT("topic_id")
    public Long topicId;

    @C09CT("topic_text")
    public String topicText;

    @C09CT("topic_type")
    public Integer topicType;

    public AddYoursRecommendation() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.topicId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.topicText);
        Integer num = this.topicType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public final Long getTopicId() {
        return this.topicId;
    }

    public final String getTopicText() {
        return this.topicText;
    }

    public final Integer getTopicType() {
        return this.topicType;
    }

    public AddYoursRecommendation(Long l, String str, Integer num) {
        this.topicId = l;
        this.topicText = str;
        this.topicType = num;
    }
}
