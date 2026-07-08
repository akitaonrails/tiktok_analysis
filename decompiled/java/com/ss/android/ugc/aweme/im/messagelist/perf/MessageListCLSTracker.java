package com.ss.android.ugc.aweme.im.messagelist.perf;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface MessageListCLSTracker extends OnChatRoomTouchListener, IMessageEventProtocol {
    void QT(Map<String, String> map);

    void tG(RecyclerView recyclerView);
}
