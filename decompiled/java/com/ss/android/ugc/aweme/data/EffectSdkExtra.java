package com.ss.android.ugc.aweme.data;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.data.EffectSdkExtra;
import com.ss.android.ugc.aweme.data.PlDataBean;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class EffectSdkExtra implements Parcelable, Serializable {
    public static final Parcelable.Creator<EffectSdkExtra> CREATOR = new Parcelable.Creator<EffectSdkExtra>() { // from class: X.0wQs
        @Override // android.os.Parcelable.Creator
        public final EffectSdkExtra createFromParcel(Parcel parcel) {
            PlDataBean plDataBeanCreateFromParcel;
            if (parcel.readInt() == 0) {
                plDataBeanCreateFromParcel = null;
            } else {
                plDataBeanCreateFromParcel = PlDataBean.CREATOR.createFromParcel(parcel);
            }
            return new EffectSdkExtra(plDataBeanCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EffectSdkExtra[] newArray(int i) {
            return new EffectSdkExtra[i];
        }
    };

    @C09CT("pl")
    public PlDataBean pl;

    public EffectSdkExtra() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PlDataBean plDataBean = this.pl;
        if (plDataBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            plDataBean.writeToParcel(parcel, i);
        }
    }

    public final boolean hasValidGreenScreen() {
        PlDataBean plDataBean = this.pl;
        return plDataBean != null && plDataBean.getMinCount() <= plDataBean.getMaxCount();
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
