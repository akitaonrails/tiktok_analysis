package com.ss.android.ugc.aweme.textsticker;

import X.C09CT;
import X.C13LP;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextStickerChallenges implements Parcelable, Serializable {
    public static final Parcelable.Creator<TextStickerChallenges> CREATOR = new Parcelable.Creator<TextStickerChallenges>() { // from class: X.0F9b
        @Override // android.os.Parcelable.Creator
        public final TextStickerChallenges createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(TextStickerChallenges.class.getClassLoader()));
            }
            return new TextStickerChallenges(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerChallenges[] newArray(int i) {
            return new TextStickerChallenges[i];
        }
    };

    @C09CT("readTextChallenges")
    public final List<AVChallenge> readTextChallenges;

    public final TextStickerChallenges copy(List<AVChallenge> list) {
        return new TextStickerChallenges(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextStickerChallenges) && Intrinsics.LJFF(this.readTextChallenges, ((TextStickerChallenges) obj).readTextChallenges);
    }

    public int hashCode() {
        return this.readTextChallenges.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextStickerChallenges(readTextChallenges=");
        sbLIZ.append(this.readTextChallenges);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AVChallenge> list = this.readTextChallenges;
        parcel.writeInt(list.size());
        Iterator<AVChallenge> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public TextStickerChallenges() {
        this(new LinkedList());
    }

    public final List<String> getReadTextChallengeIds() {
        ArrayList arrayList = new ArrayList();
        List<AVChallenge> list = this.readTextChallenges;
        ListIterator<AVChallenge> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            AVChallenge aVChallengePrevious = listIterator.previous();
            if (!arrayList.contains(aVChallengePrevious.cid)) {
                arrayList.add(aVChallengePrevious.cid);
            }
        }
        return arrayList;
    }

    public final List<AVChallenge> getReadTextChallenges() {
        ArrayList arrayList = new ArrayList();
        List<AVChallenge> list = this.readTextChallenges;
        ListIterator<AVChallenge> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            AVChallenge aVChallengePrevious = listIterator.previous();
            if (!arrayList.contains(aVChallengePrevious)) {
                arrayList.add(aVChallengePrevious);
            }
        }
        return C13LP.LJLJJLL(C13LP.LLIIII(arrayList));
    }

    public TextStickerChallenges(List<AVChallenge> list) {
        this.readTextChallenges = list;
    }

    public final void addReadTextChallenge(AVChallenge aVChallenge) {
        this.readTextChallenges.add(aVChallenge);
    }

    public final void removeReadTextChallenge(String str, Function1<? super AVChallenge, Unit> function1) {
        for (AVChallenge aVChallenge : this.readTextChallenges) {
            if (Intrinsics.LJFF(aVChallenge.cid, str)) {
                if (aVChallenge != null) {
                    this.readTextChallenges.remove(aVChallenge);
                    function1.invoke(aVChallenge);
                    return;
                }
                return;
            }
        }
    }
}
