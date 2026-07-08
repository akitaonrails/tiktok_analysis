package com.ss.android.ugc.aweme.comment.widgets;

import X.C21536519Qd;
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
public final class CommentEditText$MentionSavedState extends View.BaseSavedState {
    public List<EmojiStruct> emojis;
    public int selectionEnd;
    public List<? extends TextExtraStruct> structs;
    public String text;
    public static final C21536519Qd Companion = new Object() { // from class: X.19Qd
    };
    public static final Parcelable.Creator<CommentEditText$MentionSavedState> CREATOR = new C2189641Amo(18);

    public CommentEditText$MentionSavedState(Parcel parcel) {
        super(parcel);
        this.text = parcel.readString();
        this.selectionEnd = parcel.readInt();
        Bundle bundle = parcel.readBundle(CommentEditText$MentionSavedState.class.getClassLoader());
        if (bundle != null) {
            this.structs = bundle.getParcelableArrayList("text_extra_struct");
            this.emojis = bundle.getParcelableArrayList("emoji_span");
        }
    }

    public CommentEditText$MentionSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        parcel.writeInt(this.selectionEnd);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIL(bundle, "text_extra_struct", (ArrayList) this.structs);
        C786410Ut5.LJJIL(bundle, "emoji_span", (ArrayList) this.emojis);
        parcel.writeBundle(bundle);
    }
}
