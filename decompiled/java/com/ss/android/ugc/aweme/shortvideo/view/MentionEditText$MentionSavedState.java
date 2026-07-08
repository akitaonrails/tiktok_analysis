package com.ss.android.ugc.aweme.shortvideo.view;

import X.C2189641Amo;
import X.C786410Ut5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class MentionEditText$MentionSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<MentionEditText$MentionSavedState> CREATOR = new C2189641Amo(20);
    public String LL;
    public int LLILLJJLI;
    public List<TextExtraStruct> LLILLL;

    public MentionEditText$MentionSavedState(Parcel parcel) {
        super(parcel);
        this.LL = parcel.readString();
        this.LLILLJJLI = parcel.readInt();
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        if (bundle != null) {
            this.LLILLL = bundle.getParcelableArrayList("text_extra_struct");
        }
    }

    public MentionEditText$MentionSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.LL);
        parcel.writeInt(this.LLILLJJLI);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIL(bundle, "text_extra_struct", (ArrayList) this.LLILLL);
        parcel.writeBundle(bundle);
    }
}
