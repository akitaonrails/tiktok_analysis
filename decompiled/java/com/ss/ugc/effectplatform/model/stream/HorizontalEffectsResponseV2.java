package com.ss.ugc.effectplatform.model.stream;

import X.C09CT;
import X.C13GX;
import X.C13KC;
import X.C13KD;
import X.C19989713Jf;
import X.C19989813Jg;
import X.C2188811AlT;
import X.InterfaceC1633760scI;
import X.InterfaceC1841100y0i;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986513Hz;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel$$serializer;
import com.ss.ugc.effectplatform.model.stream.HorizontalEffectsResponseV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public final class HorizontalEffectsResponseV2 implements InterfaceC1633760scI<HorizontalEffectsModel> {
    public static final C13KD Companion = new Object() { // from class: X.13KD
        public final C13HG<HorizontalEffectsResponseV2> serializer() {
            return C13KC.LIZ;
        }
    };

    @C09CT("data")
    public final HorizontalEffectsModel data;

    @C09CT("data_type")
    public final String dataType;

    @C09CT("message")
    public final String message;

    @C09CT("status_code")
    public final int statusCode;

    public HorizontalEffectsResponseV2() {
        this(null, null, 0, "");
    }

    public static /* synthetic */ void getData$annotations() {
    }

    public static /* synthetic */ void getDataType$annotations() {
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public final HorizontalEffectsResponseV2 copy(HorizontalEffectsModel horizontalEffectsModel, String str, int i, String str2) {
        return new HorizontalEffectsResponseV2(horizontalEffectsModel, str, i, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalEffectsResponseV2)) {
            return false;
        }
        HorizontalEffectsResponseV2 horizontalEffectsResponseV2 = (HorizontalEffectsResponseV2) obj;
        return Intrinsics.LJFF(this.data, horizontalEffectsResponseV2.data) && Intrinsics.LJFF(this.message, horizontalEffectsResponseV2.message) && this.statusCode == horizontalEffectsResponseV2.statusCode && Intrinsics.LJFF(this.dataType, horizontalEffectsResponseV2.dataType);
    }

    public int hashCode() {
        HorizontalEffectsModel horizontalEffectsModel = this.data;
        int iHashCode = (horizontalEffectsModel == null ? 0 : horizontalEffectsModel.hashCode()) * 31;
        String str = this.message;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.statusCode) * 31) + this.dataType.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HorizontalEffectsResponseV2(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", dataType=");
        sbLIZ.append(this.dataType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getDataType() {
        return this.dataType;
    }

    @Override // X.InterfaceC1633760scI
    public String getMessage() {
        return this.message;
    }

    @Override // X.InterfaceC1633760scI
    public int getStatusCode() {
        return this.statusCode;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC1633760scI
    public HorizontalEffectsModel getData() {
        return this.data;
    }

    public static final /* synthetic */ void write$Self$ckresource_model_release(HorizontalEffectsResponseV2 horizontalEffectsResponseV2, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        if (interfaceC19986513Hz.LJIJJ() || horizontalEffectsResponseV2.getData() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 0, HorizontalEffectsModel$$serializer.INSTANCE, horizontalEffectsResponseV2.getData());
        }
        if (interfaceC19986513Hz.LJIJJ() || horizontalEffectsResponseV2.getMessage() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 1, C13GX.LIZ, horizontalEffectsResponseV2.getMessage());
        }
        if (interfaceC19986513Hz.LJIJJ() || horizontalEffectsResponseV2.getStatusCode() != 0) {
            interfaceC19986513Hz.LJ(2, horizontalEffectsResponseV2.getStatusCode(), interfaceC19983313Gt);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(horizontalEffectsResponseV2.getDataType(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 3, horizontalEffectsResponseV2.getDataType());
        }
    }

    public HorizontalEffectsResponseV2(HorizontalEffectsModel horizontalEffectsModel, String str, int i, String str2) {
        this.data = horizontalEffectsModel;
        this.message = str;
        this.statusCode = i;
        this.dataType = str2;
    }

    public /* synthetic */ HorizontalEffectsResponseV2(int i, HorizontalEffectsModel horizontalEffectsModel, String str, int i2, String str2, C19989813Jg c19989813Jg) {
        if (0 == 0) {
            if ((i & 1) == 0) {
                this.data = null;
            } else {
                this.data = horizontalEffectsModel;
            }
            if ((i & 2) == 0) {
                this.message = null;
            } else {
                this.message = str;
            }
            if ((i & 4) == 0) {
                this.statusCode = 0;
            } else {
                this.statusCode = i2;
            }
            if ((i & 8) == 0) {
                this.dataType = "";
                return;
            } else {
                this.dataType = str2;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, C13KC.LIZ.getDescriptor());
        throw null;
    }
}
