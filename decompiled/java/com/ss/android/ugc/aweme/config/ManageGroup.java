package com.ss.android.ugc.aweme.config;

import X.C2097908Jt;
import com.ss.android.ugc.aweme.operation.GroupChatConfig;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class ManageGroup implements GroupChatConfig {
    public final String LL = "group_chat_manage_group";
    public final Map<Integer, Integer> LLILLJJLI = C2097908Jt.LIZJ(new Pair(3, 12));

    @Override // com.ss.android.ugc.aweme.operation.GroupChatConfig
    public final boolean enable(String str) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.operation.GroupChatConfig
    public final String C32() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.operation.GroupChatConfig
    public final Map<Integer, Integer> PC2() {
        return this.LLILLJJLI;
    }
}
