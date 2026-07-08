package com.ss.android.ugc.aweme.im.chatlist.impl.core.refactor.prbocessor;

import X.AbstractC1711506n3;
import X.C01GW;
import X.C051M;
import X.C09CT;
import X.C0I0B;
import X.C0Y8T;
import X.C1400340mXo;
import X.C1730606q8;
import X.C452501pT;
import X.C869590Y9l;
import X.C886290Ypn;
import X.InterfaceC891490YyB;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class IMUnreadMsgPortraitObserver {
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 237));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 238));

    public static final class UnreadConvMetaData implements Serializable {
        public static final C886290Ypn Companion = new C886290Ypn();

        @C09CT("last_show_msg_timestamp")
        public final long lastShowMsgTimestamp;

        @C09CT("unread_count")
        public final long unreadCount;

        public final String toJsonString() {
            return C051M.LJ(this, false);
        }

        public UnreadConvMetaData() {
            this(0L, 0L);
        }

        public UnreadConvMetaData(long j, long j2) {
            this.unreadCount = j;
            this.lastShowMsgTimestamp = j2;
        }
    }

    public static void LIZ(Keva keva) {
        String str;
        String str2 = null;
        UnreadConvMetaData unreadConvMetaData = null;
        for (Map.Entry<String, ?> entry : keva.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C886290Ypn c886290Ypn = UnreadConvMetaData.Companion;
            if ((value instanceof String) && (str = (String) value) != null) {
                c886290Ypn.getClass();
                UnreadConvMetaData unreadConvMetaDataLIZ = C886290Ypn.LIZ(str);
                if (unreadConvMetaDataLIZ != null && (unreadConvMetaData == null || unreadConvMetaDataLIZ.lastShowMsgTimestamp > unreadConvMetaData.lastShowMsgTimestamp)) {
                    unreadConvMetaData = unreadConvMetaDataLIZ;
                    str2 = key;
                }
            }
        }
        UnreadConvMetaData unreadConvMetaData2 = (UnreadConvMetaData) new Pair(str2, unreadConvMetaData).getSecond();
        String str3 = "";
        if (unreadConvMetaData2 != null) {
            IMUserPortraitApi.LIZ.getClass();
            InterfaceC891490YyB interfaceC891490YyBLIZLLL = C1730606q8.LIZ().LIZLLL();
            long j = unreadConvMetaData2.lastShowMsgTimestamp;
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId != null) {
                str3 = curUserId;
            }
            interfaceC891490YyBLIZLLL.LJIILLIIL(j, str3);
            return;
        }
        IMUserPortraitApi.LIZ.getClass();
        InterfaceC891490YyB interfaceC891490YyBLIZLLL2 = C1730606q8.LIZ().LIZLLL();
        String curUserId2 = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId2 != null) {
            str3 = curUserId2;
        }
        interfaceC891490YyBLIZLLL2.LJIILLIIL(-1L, str3);
    }

    public static void LIZIZ(C0Y8T c0y8t, Keva keva) {
        long createdAt;
        String str;
        if ((c0y8t.getConversationType() == AbstractC1711506n3.LIZ || c0y8t.getConversationType() == AbstractC1711506n3.LIZIZ) && keva != null) {
            String conversationId = c0y8t.getConversationId();
            if (c0y8t.getUnreadCount() != 0 && !c0y8t.isMute()) {
                String string = keva.getString(conversationId, "");
                UnreadConvMetaData.Companion.getClass();
                UnreadConvMetaData unreadConvMetaDataLIZ = C886290Ypn.LIZ(string);
                long unreadCount = c0y8t.getUnreadCount();
                C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
                if (lastShowMessage != null) {
                    createdAt = lastShowMessage.getCreatedAt();
                } else {
                    createdAt = -1;
                }
                String jsonString = new UnreadConvMetaData(unreadCount, createdAt).toJsonString();
                if (unreadConvMetaDataLIZ == null && keva.count() >= 100) {
                    String str2 = null;
                    UnreadConvMetaData unreadConvMetaData = null;
                    for (Map.Entry<String, ?> entry : keva.getAll().entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        C886290Ypn c886290Ypn = UnreadConvMetaData.Companion;
                        if ((value instanceof String) && (str = (String) value) != null) {
                            c886290Ypn.getClass();
                            UnreadConvMetaData unreadConvMetaDataLIZ2 = C886290Ypn.LIZ(str);
                            if (unreadConvMetaDataLIZ2 != null && (unreadConvMetaData == null || unreadConvMetaDataLIZ2.lastShowMsgTimestamp < unreadConvMetaData.lastShowMsgTimestamp)) {
                                unreadConvMetaData = unreadConvMetaDataLIZ2;
                                str2 = key;
                            }
                        }
                    }
                    String str3 = (String) new Pair(str2, unreadConvMetaData).getFirst();
                    if (str3 != null) {
                        keva.erase(str3);
                        LIZ(keva);
                    }
                }
                keva.storeString(conversationId, jsonString);
                LIZ(keva);
                return;
            }
            keva.erase(conversationId);
            LIZ(keva);
        }
    }
}
