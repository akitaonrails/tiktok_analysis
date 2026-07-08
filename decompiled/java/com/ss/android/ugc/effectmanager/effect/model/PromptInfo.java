package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PromptInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<PromptInfo> CREATOR = new Creator();

    @C09CT("followed_prompt_id")
    public final Long followed_prompt_id;

    @C09CT("prompt_text")
    public final String prompt_text;

    @C09CT("root_prompt_id")
    public final Long root_prompt_id;

    @C09CT("source_type")
    public final Integer source_type;

    public static final class Creator implements Parcelable.Creator<PromptInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromptInfo createFromParcel(Parcel parcel) {
            return new PromptInfo(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromptInfo[] newArray(int i) {
            return new PromptInfo[i];
        }
    }

    public final PromptInfo copy(Long l, Long l2, String str, Integer num) {
        return new PromptInfo(l, l2, str, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptInfo)) {
            return false;
        }
        PromptInfo promptInfo = (PromptInfo) obj;
        return Intrinsics.LJFF(this.followed_prompt_id, promptInfo.followed_prompt_id) && Intrinsics.LJFF(this.root_prompt_id, promptInfo.root_prompt_id) && Intrinsics.LJFF(this.prompt_text, promptInfo.prompt_text) && Intrinsics.LJFF(this.source_type, promptInfo.source_type);
    }

    public int hashCode() {
        Long l = this.followed_prompt_id;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.root_prompt_id;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.prompt_text;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.source_type;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromptInfo(followed_prompt_id=");
        sbLIZ.append(this.followed_prompt_id);
        sbLIZ.append(", root_prompt_id=");
        sbLIZ.append(this.root_prompt_id);
        sbLIZ.append(", prompt_text=");
        sbLIZ.append(this.prompt_text);
        sbLIZ.append(", source_type=");
        sbLIZ.append(this.source_type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.followed_prompt_id;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.root_prompt_id;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.prompt_text);
        Integer num = this.source_type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public final Long getFollowed_prompt_id() {
        return this.followed_prompt_id;
    }

    public final String getPrompt_text() {
        return this.prompt_text;
    }

    public final Long getRoot_prompt_id() {
        return this.root_prompt_id;
    }

    public final Integer getSource_type() {
        return this.source_type;
    }

    public PromptInfo(Long l, Long l2, String str, Integer num) {
        this.followed_prompt_id = l;
        this.root_prompt_id = l2;
        this.prompt_text = str;
        this.source_type = num;
    }
}
