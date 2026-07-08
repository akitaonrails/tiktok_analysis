package com.bytedance.effectcreatormobile.infrastructure.ui.widgets.highlight;

import X.C2325341G0m;
import android.R;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class Configuration implements Parcelable {
    public static final Parcelable.Creator<Configuration> CREATOR = new C2325341G0m(5);
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLJ;
    public int LLJI;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public int LLILZLL = 255;
    public int LLIZ = -1;
    public int LLIZLLLIL = -1;
    public int LLJIJIL = R.color.black;
    public boolean LLJILJIL = true;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.LLILZLL);
        parcel.writeInt(this.LLIZ);
        parcel.writeInt(this.LLIZLLLIL);
        parcel.writeInt(this.LLJIJIL);
        parcel.writeInt(this.LLJ);
        parcel.writeInt(this.LL);
        parcel.writeInt(this.LLILLJJLI);
        parcel.writeInt(this.LLILLL);
        parcel.writeInt(this.LLILZ);
        parcel.writeInt(this.LLILZIL);
        parcel.writeInt(this.LLJI);
        parcel.writeByte(this.LLJILJIL ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.LLJJ ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.LLJILJILJ ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.LLJILLL ? (byte) 1 : (byte) 0);
    }
}
