package com.ss.android.ugc.aweme.lexical.platform.span;

import X.C913910ZtF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class AiCopyWritingSpan extends ForegroundColorSpan {
    public static final Parcelable.Creator<AiCopyWritingSpan> CREATOR = new C913910ZtF(1);
    public TextExtraStruct mStruct;
    public String mText;
    public int subType;

    @Override // android.text.style.ForegroundColorSpan, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.mText;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        TextExtraStruct textExtraStruct = this.mStruct;
        return ((iHashCode + (textExtraStruct != null ? textExtraStruct.hashCode() : 0)) * 31) + this.subType;
    }

    public AiCopyWritingSpan(Parcel parcel) {
        super(parcel);
        this.mText = "";
        this.mText = parcel.readString();
        this.mStruct = (TextExtraStruct) parcel.readParcelable(TextExtraStruct.class.getClassLoader());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AiCopyWritingSpan aiCopyWritingSpan = (AiCopyWritingSpan) obj;
        if (this.subType != aiCopyWritingSpan.subType || !Objects.equals(this.mText, aiCopyWritingSpan.mText)) {
            return false;
        }
        return Objects.equals(this.mStruct, aiCopyWritingSpan.mStruct);
    }

    @Override // android.text.style.ForegroundColorSpan, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mText);
        parcel.writeParcelable(this.mStruct, i);
    }

    public AiCopyWritingSpan(int i, String str, int i2) {
        super(i);
        this.mText = str;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        this.mStruct = textExtraStruct;
        textExtraStruct.setType(i2);
    }
}
