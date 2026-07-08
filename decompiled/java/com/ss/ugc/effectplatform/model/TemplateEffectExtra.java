package com.ss.ugc.effectplatform.model;

import X.C09CT;
import X.C13GX;
import X.C13KG;
import X.C13KH;
import X.C19989713Jf;
import X.C19989813Jg;
import X.C2188811AlT;
import X.InterfaceC1841100y0i;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986513Hz;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.effectplatform.model.TemplateEffectExtra;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public class TemplateEffectExtra implements Serializable, Parcelable {

    @C09CT("resource_id")
    public String resource_id;
    public static final C13KH Companion = new Object() { // from class: X.13KH
        public final C13HG<TemplateEffectExtra> serializer() {
            return C13KG.LIZ;
        }
    };
    public static final Parcelable.Creator<TemplateEffectExtra> CREATOR = new Parcelable.Creator<TemplateEffectExtra>() { // from class: X.0wRj
        @Override // android.os.Parcelable.Creator
        public final TemplateEffectExtra createFromParcel(Parcel parcel) {
            return new TemplateEffectExtra(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateEffectExtra[] newArray(int i) {
            return new TemplateEffectExtra[i];
        }
    };

    public static /* synthetic */ void getResource_id$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.resource_id);
    }

    public TemplateEffectExtra() {
        this("");
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateEffectExtra(resource_id=");
        sbLIZ.append(getResource_id());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getResource_id() {
        return this.resource_id;
    }

    public TemplateEffectExtra(String str) {
        this.resource_id = str;
    }

    public void setResource_id(String str) {
        this.resource_id = str;
    }

    public /* synthetic */ TemplateEffectExtra(int i, String str, C19989813Jg c19989813Jg) {
        if (0 == 0) {
            if ((i & 1) == 0) {
                this.resource_id = "";
                return;
            } else {
                this.resource_id = str;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, C13KG.LIZ.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ void write$Self(TemplateEffectExtra templateEffectExtra, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(templateEffectExtra.getResource_id(), "")) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 0, C13GX.LIZ, templateEffectExtra.getResource_id());
        }
    }
}
