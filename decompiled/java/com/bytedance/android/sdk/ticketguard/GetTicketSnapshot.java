package com.bytedance.android.sdk.ticketguard;

import X.C09CT;
import X.C0XNP;
import X.C0XNU;
import X.C2188811AlT;
import com.bytedance.android.sdk.ticketguard.TicketDataBean;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class GetTicketSnapshot extends CommonSnapshot {

    @C09CT("response_ticket_data")
    public final String response_ticket_data;

    @C09CT("server_data")
    public final String server_data;

    public GetTicketSnapshot(C0XNU c0xnu) {
        String strLIZ;
        super(c0xnu);
        this.server_data = C0XNP.LIZ(c0xnu.LIZJ);
        StringBuilder sb = new StringBuilder();
        List<TicketData> list = c0xnu.LIZLLL;
        if (list != null) {
            for (TicketData ticketData : list) {
                TicketDataBean.CombineTsSign combineTsSign = (TicketDataBean.CombineTsSign) GsonProtectorUtils.fromJson(TicketGuardApiKt.getGson(), ticketData.ts_sign, TicketDataBean.CombineTsSign.class);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(';');
                sbLIZ.append(C0XNP.LIZ(ticketData.ticket));
                sbLIZ.append(':');
                String str = combineTsSign.ts_sign;
                String strLIZ2 = null;
                if (str != null) {
                    strLIZ = C0XNP.LIZ(str);
                } else {
                    strLIZ = null;
                }
                sbLIZ.append(strLIZ);
                sbLIZ.append(':');
                String str2 = combineTsSign.ts_sign_ree;
                if (str2 != null) {
                    strLIZ2 = C0XNP.LIZ(str2);
                }
                sbLIZ.append(strLIZ2);
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        this.response_ticket_data = sb.toString();
    }
}
