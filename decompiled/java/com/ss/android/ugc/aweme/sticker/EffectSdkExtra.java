package com.ss.android.ugc.aweme.sticker;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.EffectSdkExtra;
import com.ss.android.ugc.aweme.sticker.PlDataBean;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes28.dex */
public final class EffectSdkExtra implements Parcelable, Serializable {
    public static final Parcelable.Creator<EffectSdkExtra> CREATOR = new Parcelable.Creator<EffectSdkExtra>() { // from class: X.0wQt
        @Override // android.os.Parcelable.Creator
        public final EffectSdkExtra createFromParcel(Parcel parcel) {
            return new EffectSdkExtra(PlDataBean.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EffectSdkExtra[] newArray(int i) {
            return new EffectSdkExtra[i];
        }
    };

    @C09CT("pl")
    public PlDataBean pl;

    public EffectSdkExtra() {
        this(new PlDataBean(new ArrayList(), null, null, true, true, 0, 2, 5, -1, -1, -1, -1, 0, 0, false));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.pl.writeToParcel(parcel, i);
    }

    public final PlDataBean getPl() {
        return this.pl;
    }

    public EffectSdkExtra(PlDataBean plDataBean) {
        this.pl = plDataBean;
    }

    public final void setPl(PlDataBean plDataBean) {
        this.pl = plDataBean;
    }
}
