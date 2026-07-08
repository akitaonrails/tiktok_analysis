package com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextUnderlineIndexRange;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class InteractTextStructWrap implements Parcelable {
    public final TextStickerTextUnderlineIndexRange range;
    public final CreateAnchorInfo struct;
    public static final Parcelable.Creator<InteractTextStructWrap> CREATOR = new Parcelable.Creator<InteractTextStructWrap>() { // from class: X.125A
        @Override // android.os.Parcelable.Creator
        public final InteractTextStructWrap createFromParcel(Parcel parcel) {
            return new InteractTextStructWrap(TextStickerTextUnderlineIndexRange.CREATOR.createFromParcel(parcel), (CreateAnchorInfo) parcel.readParcelable(InteractTextStructWrap.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final InteractTextStructWrap[] newArray(int i) {
            return new InteractTextStructWrap[i];
        }
    };
    public static final int $stable = 8;

    public final InteractTextStructWrap copy(TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange, CreateAnchorInfo createAnchorInfo) {
        return new InteractTextStructWrap(textStickerTextUnderlineIndexRange, createAnchorInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractTextStructWrap)) {
            return false;
        }
        InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) obj;
        return Intrinsics.LJFF(this.range, interactTextStructWrap.range) && Intrinsics.LJFF(this.struct, interactTextStructWrap.struct);
    }

    public int hashCode() {
        return (this.range.hashCode() * 31) + this.struct.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractTextStructWrap(range=");
        sbLIZ.append(this.range);
        sbLIZ.append(", struct=");
        sbLIZ.append(this.struct);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.range.writeToParcel(parcel, i);
        parcel.writeParcelable(this.struct, i);
    }

    public final TextStickerTextUnderlineIndexRange getRange() {
        return this.range;
    }

    public final CreateAnchorInfo getStruct() {
        return this.struct;
    }

    public final boolean isValid(int i) {
        return this.range.isValid(i);
    }

    public InteractTextStructWrap(TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange, CreateAnchorInfo createAnchorInfo) {
        this.range = textStickerTextUnderlineIndexRange;
        this.struct = createAnchorInfo;
    }
}
