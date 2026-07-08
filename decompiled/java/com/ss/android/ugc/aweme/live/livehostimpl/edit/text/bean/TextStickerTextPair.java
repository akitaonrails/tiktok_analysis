package com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextPair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class TextStickerTextPair implements Parcelable {

    @C09CT(alternate = {"a"}, value = "first")
    public final String first;

    @C09CT(alternate = {"b"}, value = "second")
    public final List<InteractTextStructWrap> second;
    public static final Parcelable.Creator<TextStickerTextPair> CREATOR = new Parcelable.Creator<TextStickerTextPair>() { // from class: X.1257
        @Override // android.os.Parcelable.Creator
        public final TextStickerTextPair createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InteractTextStructWrap.CREATOR.createFromParcel(parcel));
            }
            return new TextStickerTextPair(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerTextPair[] newArray(int i) {
            return new TextStickerTextPair[i];
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
        if (!(obj instanceof TextStickerTextPair)) {
            return false;
        }
        TextStickerTextPair textStickerTextPair = (TextStickerTextPair) obj;
        return Intrinsics.LJFF(this.first, textStickerTextPair.first) && Intrinsics.LJFF(this.second, textStickerTextPair.second);
    }

    public final int hashCode() {
        return (this.first.hashCode() * 31) + this.second.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.first);
        List<InteractTextStructWrap> list = this.second;
        parcel.writeInt(list.size());
        Iterator<InteractTextStructWrap> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public TextStickerTextPair() {
        this("", new ArrayList());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append(this.first);
        sbLIZ.append(", ");
        sbLIZ.append(this.second);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TextStickerTextPair(String str, List<InteractTextStructWrap> list) {
        this.first = str;
        this.second = list;
    }
}
