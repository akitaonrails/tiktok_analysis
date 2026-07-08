package com.ss.android.ugc.aweme.im.sdk.chat.utils;

import X.C2097608Jq;
import com.ss.android.ugc.aweme.im.chatroom.api.IChatRoomEventTrackingStore;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatRoomEventTrackingStore implements IChatRoomEventTrackingStore {
    public static final ChatRoomEventTrackingStore LIZIZ = new ChatRoomEventTrackingStore();
    public static final ConcurrentHashMap<String, Map<String, String>> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentLinkedDeque<String> LIZLLL = new ConcurrentLinkedDeque<>();

    public static final class Service implements IChatRoomEventTrackingStore {
        public final /* synthetic */ ChatRoomEventTrackingStore LIZIZ = ChatRoomEventTrackingStore.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.chatroom.api.IChatRoomEventTrackingStore
        public final String LIZ() {
            return this.LIZIZ.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.chatroom.api.IChatRoomEventTrackingStore
        public final Map<String, String> LIZIZ(String str) {
            return this.LIZIZ.LIZIZ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IChatRoomEventTrackingStore
    public final String LIZ() {
        String strPeek = LIZLLL.peek();
        return strPeek == null ? "" : strPeek;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IChatRoomEventTrackingStore
    public final Map<String, String> LIZIZ(String str) {
        Map<String, String> map;
        if (str == null || (map = LIZJ.get(str)) == null) {
            return C2097608Jq.LJ();
        }
        return map;
    }
}
