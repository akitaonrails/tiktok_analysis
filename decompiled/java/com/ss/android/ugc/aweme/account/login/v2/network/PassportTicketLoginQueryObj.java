package com.ss.android.ugc.aweme.account.login.v2.network;

import X.AbstractC849240XTe;
import X.C09CT;
import X.C0XO2;
import X.C0XOE;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class PassportTicketLoginQueryObj extends AbstractC849240XTe implements C0XOE {
    public C0XO2 LJI;

    @C09CT("passport_ticket")
    public final String passportTicket;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PassportTicketLoginQueryObj) && Intrinsics.LJFF(this.passportTicket, ((PassportTicketLoginQueryObj) obj).passportTicket);
    }

    public final int hashCode() {
        return this.passportTicket.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PassportTicketLoginQueryObj(passportTicket=");
        sbLIZ.append(this.passportTicket);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PassportTicketLoginQueryObj() {
        this("");
    }

    @Override // X.C0XOE
    public final C0XO2 getUserInfo() {
        return this.LJI;
    }

    public PassportTicketLoginQueryObj(String str) {
        this.passportTicket = str;
        this.LJI = new C0XO2(new JSONObject());
    }
}
