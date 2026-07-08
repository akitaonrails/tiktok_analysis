package com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.ui;

import X.C1355410lNL;
import X.C1402020maW;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: loaded from: classes22.dex */
public final class HashTagSpan extends ForegroundColorSpan {
    public String tagText;
    public int tagType;
    public static final C1355410lNL Companion = new Object() { // from class: X.0lNL
    };
    public static final int $stable = 8;
    public static final Parcelable.Creator<HashTagSpan> CREATOR = new C1402020maW(4);

    public HashTagSpan(Parcel parcel) {
        super(parcel);
        this.tagType = 1;
        this.tagText = "";
        this.tagText = parcel.readString();
    }

    @Override // android.text.style.ForegroundColorSpan, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.tagText);
    }

    public HashTagSpan(int i, String str, int i2) {
        super(i);
        this.tagText = str;
        this.tagType = i2;
    }
}
