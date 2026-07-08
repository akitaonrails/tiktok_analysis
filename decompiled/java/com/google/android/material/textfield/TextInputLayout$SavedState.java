package com.google.android.material.textfield;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.textfield.TextInputLayout$SavedState;

/* JADX INFO: loaded from: classes34.dex */
public class TextInputLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<TextInputLayout$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<TextInputLayout$SavedState>() { // from class: X.19Tm
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new TextInputLayout$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TextInputLayout$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final TextInputLayout$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new TextInputLayout$SavedState(parcel, classLoader);
        }
    };
    public CharSequence LL;
    public boolean LLILLJJLI;
    public CharSequence LLILLL;
    public CharSequence LLILZ;
    public CharSequence LLILZIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextInputLayout.SavedState{");
        sbLIZ.append(Integer.toHexString(System.identityHashCode(this)));
        sbLIZ.append(" error=");
        sbLIZ.append((Object) this.LL);
        sbLIZ.append(" hint=");
        sbLIZ.append((Object) this.LLILLL);
        sbLIZ.append(" helperText=");
        sbLIZ.append((Object) this.LLILZ);
        sbLIZ.append(" placeholderText=");
        sbLIZ.append((Object) this.LLILZIL);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TextInputLayout$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public TextInputLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.LL = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LLILLJJLI = parcel.readInt() == 1;
        this.LLILLL = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LLILZ = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LLILZIL = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.LL, parcel, i);
        parcel.writeInt(this.LLILLJJLI ? 1 : 0);
        TextUtils.writeToParcel(this.LLILLL, parcel, i);
        TextUtils.writeToParcel(this.LLILZ, parcel, i);
        TextUtils.writeToParcel(this.LLILZIL, parcel, i);
    }
}
