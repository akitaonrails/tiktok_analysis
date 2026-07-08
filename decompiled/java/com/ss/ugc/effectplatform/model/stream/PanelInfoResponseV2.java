package com.ss.ugc.effectplatform.model.stream;

import X.C09CT;
import X.C13GX;
import X.C13KA;
import X.C13KB;
import X.C19989713Jf;
import X.C19989813Jg;
import X.C2188811AlT;
import X.InterfaceC1633760scI;
import X.InterfaceC1841100y0i;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986513Hz;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel$$serializer;
import com.ss.ugc.effectplatform.model.stream.PanelInfoResponseV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public final class PanelInfoResponseV2 implements InterfaceC1633760scI<PanelInfoModel> {
    public static final C13KB Companion = new Object() { // from class: X.13KB
        public final C13HG<PanelInfoResponseV2> serializer() {
            return C13KA.LIZ;
        }
    };

    @C09CT("data")
    public final PanelInfoModel data;

    @C09CT("data_type")
    public final String dataType;

    @C09CT("message")
    public final String message;

    @C09CT("status_code")
    public final int statusCode;

    public PanelInfoResponseV2() {
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

    public final PanelInfoResponseV2 copy(PanelInfoModel panelInfoModel, String str, int i, String str2) {
        return new PanelInfoResponseV2(panelInfoModel, str, i, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanelInfoResponseV2)) {
            return false;
        }
        PanelInfoResponseV2 panelInfoResponseV2 = (PanelInfoResponseV2) obj;
        return Intrinsics.LJFF(this.data, panelInfoResponseV2.data) && Intrinsics.LJFF(this.message, panelInfoResponseV2.message) && this.statusCode == panelInfoResponseV2.statusCode && Intrinsics.LJFF(this.dataType, panelInfoResponseV2.dataType);
    }

    public int hashCode() {
        PanelInfoModel panelInfoModel = this.data;
        int iHashCode = (panelInfoModel == null ? 0 : panelInfoModel.hashCode()) * 31;
        String str = this.message;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.statusCode) * 31) + this.dataType.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelInfoResponseV2(data=");
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
    public PanelInfoModel getData() {
        return this.data;
    }

    public static final /* synthetic */ void write$Self$ckresource_model_release(PanelInfoResponseV2 panelInfoResponseV2, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        if (interfaceC19986513Hz.LJIJJ() || panelInfoResponseV2.getData() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 0, PanelInfoModel$$serializer.INSTANCE, panelInfoResponseV2.getData());
        }
        if (interfaceC19986513Hz.LJIJJ() || panelInfoResponseV2.getMessage() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 1, C13GX.LIZ, panelInfoResponseV2.getMessage());
        }
        if (interfaceC19986513Hz.LJIJJ() || panelInfoResponseV2.getStatusCode() != 0) {
            interfaceC19986513Hz.LJ(2, panelInfoResponseV2.getStatusCode(), interfaceC19983313Gt);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(panelInfoResponseV2.getDataType(), "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 3, panelInfoResponseV2.getDataType());
        }
    }

    public PanelInfoResponseV2(PanelInfoModel panelInfoModel, String str, int i, String str2) {
        this.data = panelInfoModel;
        this.message = str;
        this.statusCode = i;
        this.dataType = str2;
    }

    public /* synthetic */ PanelInfoResponseV2(int i, PanelInfoModel panelInfoModel, String str, int i2, String str2, C19989813Jg c19989813Jg) {
        if (0 == 0) {
            if ((i & 1) == 0) {
                this.data = null;
            } else {
                this.data = panelInfoModel;
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
        C19989713Jf.LIZ(i, 0, C13KA.LIZ.getDescriptor());
        throw null;
    }
}
