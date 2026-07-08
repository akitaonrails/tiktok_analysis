package com.ss.android.ugc.aweme.detail.operators;

import X.C0R4K;
import X.C1620900sHY;
import X.C638920P4g;
import X.InterfaceC1255404vg;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class DetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC1255404vg> LIZ() {
        HashMap<String, InterfaceC1255404vg> map = new HashMap<>();
        map.put("from_time_line", new C0R4K(0));
        map.put("from_music_children_mode", new C0R4K(1));
        map.put("from_challenge_children_mode", new C0R4K(2));
        map.put("from_window_following", new C638920P4g(0));
        map.put("from_chat", new C1620900sHY(0));
        map.put("from_auto_message", new C1620900sHY(1));
        map.put("from_no_request", new C0R4K(3));
        map.put("from_commerce_banner", new C0R4K(4));
        map.put("from_notification_page_repost_entrance", new C0R4K(5));
        return map;
    }
}
