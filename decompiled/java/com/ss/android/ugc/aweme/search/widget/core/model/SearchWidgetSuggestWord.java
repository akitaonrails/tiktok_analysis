package com.ss.android.ugc.aweme.search.widget.core.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.widget.core.model.SearchWidgetSuggestWord;
import com.ss.android.ugc.aweme.search.widget.core.model.WordParams;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchWidgetSuggestWord implements Parcelable, Serializable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SearchWidgetSuggestWord> CREATOR = new Parcelable.Creator<SearchWidgetSuggestWord>() { // from class: X.0QNn
        @Override // android.os.Parcelable.Creator
        public final SearchWidgetSuggestWord createFromParcel(Parcel parcel) {
            WordParams wordParamsCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                wordParamsCreateFromParcel = null;
            } else {
                wordParamsCreateFromParcel = WordParams.CREATOR.createFromParcel(parcel);
            }
            return new SearchWidgetSuggestWord(string, string2, wordParamsCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SearchWidgetSuggestWord[] newArray(int i) {
            return new SearchWidgetSuggestWord[i];
        }
    };

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String groupId;

    @C09CT("params")
    public final WordParams params;

    @C09CT("word")
    public final String word;

    public final SearchWidgetSuggestWord copy(String str, String str2, WordParams wordParams) {
        return new SearchWidgetSuggestWord(str, str2, wordParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchWidgetSuggestWord)) {
            return false;
        }
        SearchWidgetSuggestWord searchWidgetSuggestWord = (SearchWidgetSuggestWord) obj;
        return Intrinsics.LJFF(this.word, searchWidgetSuggestWord.word) && Intrinsics.LJFF(this.groupId, searchWidgetSuggestWord.groupId) && Intrinsics.LJFF(this.params, searchWidgetSuggestWord.params);
    }

    public int hashCode() {
        int iHashCode = ((this.word.hashCode() * 31) + this.groupId.hashCode()) * 31;
        WordParams wordParams = this.params;
        return iHashCode + (wordParams == null ? 0 : wordParams.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchWidgetSuggestWord(word=");
        sbLIZ.append(this.word);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.groupId);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.word);
        parcel.writeString(this.groupId);
        WordParams wordParams = this.params;
        if (wordParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wordParams.writeToParcel(parcel, i);
        }
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final WordParams getParams() {
        return this.params;
    }

    public final String getWord() {
        return this.word;
    }

    public SearchWidgetSuggestWord(String str, String str2, WordParams wordParams) {
        this.word = str;
        this.groupId = str2;
        this.params = wordParams;
    }
}
