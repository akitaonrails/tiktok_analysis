package com.ss.android.ugc.aweme.config;

import X.C2097608Jq;
import com.ss.android.ugc.aweme.operation.GroupChatConfig;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class EditGroupInfo implements GroupChatConfig {
    public final String LL = "group_chat_edit_group_info";
    public final Map<Integer, Integer> LLILLJJLI = C2097608Jq.LJIIIIZZ(new Pair(1, 14), new Pair(2, 12));

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
