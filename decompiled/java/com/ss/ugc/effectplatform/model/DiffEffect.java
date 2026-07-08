package com.ss.ugc.effectplatform.model;

import X.C09CT;
import X.C13GX;
import X.C13KE;
import X.C13KF;
import X.C19989713Jf;
import X.C19989813Jg;
import X.C2188811AlT;
import X.InterfaceC1841100y0i;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986513Hz;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel$$serializer;
import com.ss.ugc.effectplatform.model.DiffEffect;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public class DiffEffect implements Serializable, Parcelable {

    @C09CT("base_url")
    public UrlModel base_url;

    @C09CT("diff_url")
    public UrlModel diff_url;

    @C09CT("extra")
    public String extra;
    public static final C13KF Companion = new Object() { // from class: X.13KF
        public final C13HG<DiffEffect> serializer() {
            return C13KE.LIZ;
        }
    };
    public static final Parcelable.Creator<DiffEffect> CREATOR = new Parcelable.Creator<DiffEffect>() { // from class: X.0mxi
        @Override // android.os.Parcelable.Creator
        public final DiffEffect createFromParcel(Parcel parcel) {
            return new DiffEffect((UrlModel) parcel.readParcelable(DiffEffect.class.getClassLoader()), (UrlModel) parcel.readParcelable(DiffEffect.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiffEffect[] newArray(int i) {
            return new DiffEffect[i];
        }
    };

    public DiffEffect() {
        this(new UrlModel(new ArrayList(), null, null, null, null), new UrlModel(new ArrayList(), null, null, null, null), null);
    }

    public static /* synthetic */ void getBase_url$annotations() {
    }

    public static /* synthetic */ void getDiff_url$annotations() {
    }

    public static /* synthetic */ void getExtra$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.diff_url, i);
        parcel.writeParcelable(this.base_url, i);
        parcel.writeString(this.extra);
    }

    public int hashCode() {
        int iHashCode = ((getDiff_url().hashCode() * 31) + getBase_url().hashCode()) * 31;
        String extra = getExtra();
        return iHashCode + (extra != null ? extra.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiffEffect(diff_url=");
        sbLIZ.append(getDiff_url());
        sbLIZ.append(", base_url=");
        sbLIZ.append(getBase_url());
        sbLIZ.append(", extra=");
        sbLIZ.append(getExtra());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UrlModel getBase_url() {
        return this.base_url;
    }

    public UrlModel getDiff_url() {
        return this.diff_url;
    }

    public String getExtra() {
        return this.extra;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiffEffect diffEffect = (DiffEffect) obj;
        if (Intrinsics.LJFF(getDiff_url(), diffEffect.getDiff_url()) && Intrinsics.LJFF(getBase_url(), diffEffect.getBase_url()) && Intrinsics.LJFF(getExtra(), diffEffect.getExtra())) {
            return true;
        }
        return false;
    }

    public void setBase_url(UrlModel urlModel) {
        this.base_url = urlModel;
    }

    public void setDiff_url(UrlModel urlModel) {
        this.diff_url = urlModel;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public DiffEffect(UrlModel urlModel, UrlModel urlModel2, String str) {
        this.diff_url = urlModel;
        this.base_url = urlModel2;
        this.extra = str;
    }

    public static final /* synthetic */ void write$Self(DiffEffect diffEffect, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(diffEffect.getDiff_url(), new UrlModel(new ArrayList(), null, null, null, null))) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 0, UrlModel$$serializer.INSTANCE, diffEffect.getDiff_url());
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(diffEffect.getBase_url(), new UrlModel(new ArrayList(), null, null, null, null))) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 1, UrlModel$$serializer.INSTANCE, diffEffect.getBase_url());
        }
        if (interfaceC19986513Hz.LJIJJ() || diffEffect.getExtra() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 2, C13GX.LIZ, diffEffect.getExtra());
        }
    }

    public /* synthetic */ DiffEffect(int i, UrlModel urlModel, UrlModel urlModel2, String str, C19989813Jg c19989813Jg) {
        UrlModel urlModel3 = urlModel;
        if (0 == 0) {
            this.diff_url = (i & 1) == 0 ? new UrlModel(new ArrayList(), null, null, null, null) : urlModel3;
            if ((i & 2) == 0) {
                this.base_url = new UrlModel(new ArrayList(), null, null, null, null);
            } else {
                this.base_url = urlModel2;
            }
            if ((i & 4) == 0) {
                this.extra = null;
                return;
            } else {
                this.extra = str;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, C13KE.LIZ.getDescriptor());
        throw null;
    }
}
