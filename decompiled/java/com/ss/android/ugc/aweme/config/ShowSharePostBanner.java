package com.ss.android.ugc.aweme.config;

import X.C0Y8T;
import X.C0Y8Y;
import X.C0YSQ;
import X.C1229100i5c;
import X.C2097908Jt;
import X.EnumC1229430i69;
import X.EnumC913760Zt0;
import X.InterfaceC876950Yaj;
import com.ss.android.ugc.aweme.operation.GroupChatConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ShowSharePostBanner implements GroupChatConfig {
    public final String LL = "group_chat_show_share_post_banner";
    public final Map<Integer, Integer> LLILLJJLI = C2097908Jt.LIZJ(new Pair(1, 14));

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
        String str3;
        C0Y8Y coreInfo;
        Map<String, String> ext;
        Map<String, String> ext2;
        C0YSQ c0ysq = InterfaceC876950Yaj.LIZ;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(c0ysq).LIZ(str);
        if (c0y8tLIZ == null) {
            return false;
        }
        C0Y8Y coreInfo2 = c0y8tLIZ.getCoreInfo();
        String str4 = null;
        if (coreInfo2 != null && (ext2 = coreInfo2.getExt()) != null) {
            str2 = ext2.get("a:group_type");
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, EnumC913760Zt0.EXTERNAL_SHARE_GROUP.getValue())) {
            return false;
        }
        C0Y8T c0y8tLIZ2 = C0YSQ.LIZIZ(c0ysq).LIZ(c0y8tLIZ.getConversationId());
        if (c0y8tLIZ2 != null && (coreInfo = c0y8tLIZ2.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null) {
            str3 = ext.get("a:et_group_type");
            str4 = ext.get("a:group_type");
        } else {
            str3 = null;
        }
        if (Intrinsics.LJFF(str4, EnumC913760Zt0.AI_SHOT_GROUP.getValue()) || Intrinsics.LJFF(str3, EnumC1229430i69.QR_CODE_GROUP_SHOT_GROUP.getValue()) || Intrinsics.LJFF(str3, EnumC1229430i69.GROUP_SHOT_GROUP.getValue()) || C1229100i5c.LIZ.LJIIL(c0y8tLIZ)) {
            return false;
        }
        return true;
    }
}
