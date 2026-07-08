package com.bytedance.android.sdk.ticketguard;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: loaded from: classes14.dex */
public final class TicketDataBean {

    @C09CT("ticket")
    public final String ticket;

    @C09CT("ts_sign")
    public final String ts_sign;

    @C09CT("ts_sign_ree")
    public final String ts_sign_ree;

    @C09CT("type")
    public final String type;

    public final TicketData toTicketData() {
        return new TicketData(this.type, this.ticket, GsonProtectorUtils.toJson(TicketGuardApiKt.getGson(), new CombineTsSign(this.ts_sign, this.ts_sign_ree)));
    }

    public static final class CombineTsSign {

        @C09CT("ts_sign")
        public final String ts_sign;

        @C09CT("ts_sign_ree")
        public final String ts_sign_ree;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CombineTsSign(ts_sign=");
            sbLIZ.append(this.ts_sign);
            sbLIZ.append(", ts_sign_ree=");
            sbLIZ.append(this.ts_sign_ree);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CombineTsSign(String str, String str2) {
            this.ts_sign = str;
            this.ts_sign_ree = str2;
        }
    }

    public TicketDataBean(String str, String str2, String str3, String str4) {
        this.type = str;
        this.ticket = str2;
        this.ts_sign = str3;
        this.ts_sign_ree = str4;
    }
}
