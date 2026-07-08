package com.ss.android.ugc.aweme.config;

import X.C0Y8T;
import X.C0Y8Y;
import X.C0YSQ;
import X.C13LP;
import X.C1697810uHb;
import X.C2097908Jt;
import X.EnumC913760Zt0;
import X.InterfaceC876950Yaj;
import com.ss.android.ugc.aweme.operation.GroupChatConfig;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes15.dex */
public final class InsertQrCodeMsg implements GroupChatConfig {
    public final String LL = "group_chat_insert_qr_code_msg";
    public final Map<Integer, Integer> LLILLJJLI = C2097908Jt.LIZJ(new Pair(3, 14));

    @Override // com.ss.android.ugc.aweme.operation.GroupChatConfig
    public final String C32() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.operation.GroupChatConfig
    public final Map<Integer, Integer> PC2() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.operation.GroupChatConfig
    public final boolean enable(String str) {
        String str2;
        Map<String, String> ext;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ == null) {
            return false;
        }
        C0Y8Y coreInfo = c0y8tLIZ.getCoreInfo();
        if (coreInfo != null && (ext = coreInfo.getExt()) != null) {
            str2 = ext.get("a:group_type");
        } else {
            str2 = null;
        }
        return C13LP.LJJJJ(str2, C1697810uHb.LJIIJJI(EnumC913760Zt0.QR_CODE_GROUP.getValue(), EnumC913760Zt0.INCENTIVE_GROUP.getValue()));
    }
}
