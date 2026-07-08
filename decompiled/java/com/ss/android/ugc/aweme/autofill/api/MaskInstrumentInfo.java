package com.ss.android.ugc.aweme.autofill.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.autofill.AdPaymentModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class MaskInstrumentInfo extends AdPaymentModel {
    public static final int $stable = 8;

    @C09CT("instrumentId")
    public final String instrumentId;

    @C09CT("pipoUserId")
    public final String pipoUserId;

    @C09CT("source")
    public final String source;

    public MaskInstrumentInfo() {
        this(null, null, null);
    }

    public final MaskInstrumentInfo copy(String str, String str2, String str3) {
        return new MaskInstrumentInfo(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskInstrumentInfo)) {
            return false;
        }
        MaskInstrumentInfo maskInstrumentInfo = (MaskInstrumentInfo) obj;
        return Intrinsics.LJFF(this.instrumentId, maskInstrumentInfo.instrumentId) && Intrinsics.LJFF(this.source, maskInstrumentInfo.source) && Intrinsics.LJFF(this.pipoUserId, maskInstrumentInfo.pipoUserId);
    }

    public int hashCode() {
        String str = this.instrumentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pipoUserId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaskInstrumentInfo(instrumentId=");
        sbLIZ.append(this.instrumentId);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", pipoUserId=");
        sbLIZ.append(this.pipoUserId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public final String getPipoUserId() {
        return this.pipoUserId;
    }

    public final String getSource() {
        return this.source;
    }

    public MaskInstrumentInfo(String str, String str2, String str3) {
        this.instrumentId = str;
        this.source = str2;
        this.pipoUserId = str3;
    }
}
