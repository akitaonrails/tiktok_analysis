package com.bytedance.android.livesdk.subscription;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import emotes.model.SubEmoteDetailResult;

/* JADX INFO: loaded from: classes8.dex */
public interface SubscribeApi {
    @InterfaceC1501160pAQ("/webcast/sub/privilege/get_sub_emote_detail/")
    C11NZ<C470590Icr<SubEmoteDetailResult>> getEmotesDetail(@InterfaceC1501070pAH("for_anchor") boolean z, @InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("display_type") int i, @InterfaceC1501070pAH("package_id") String str2, @InterfaceC1501070pAH("room_id") Long l, @InterfaceC1501070pAH("is_show_fans") String str3);
}
