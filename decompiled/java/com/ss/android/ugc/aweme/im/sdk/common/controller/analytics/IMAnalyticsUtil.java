package com.ss.android.ugc.aweme.im.sdk.common.controller.analytics;

import X.C069P;
import X.C0Y8T;
import X.C0YNP;
import X.C0YSQ;
import X.C1229100i5c;
import X.C123100dR;
import X.C1572306Dp;
import X.C879390Yef;
import X.C882340YjQ;
import X.C909290Zln;
import X.InterfaceC1294060jmO;
import X.InterfaceC876950Yaj;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.utils.ChatRoomEventTrackingStore;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@InterfaceC1294060jmO
public final class IMAnalyticsUtil implements IIMAnalyticsUtil {
    public static final IMAnalyticsUtil LIZIZ = new IMAnalyticsUtil();
    public static final Map<String, String> LIZJ = new ConcurrentHashMap();
    public static String LIZLLL = "";
    public static SessionInfo LJ;

    public static final class Service implements IIMAnalyticsUtil {
        public final /* synthetic */ IMAnalyticsUtil LIZIZ = IMAnalyticsUtil.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
        public final String LIZ(String str) {
            return this.LIZIZ.LIZ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
        public final String LIZIZ() {
            return this.LIZIZ.LIZIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
        public final void LIZJ(String str, String str2) {
            this.LIZIZ.LIZJ("enter_from", str2);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
        public final String LIZLLL(SessionInfo sessionInfo) {
            return this.LIZIZ.LIZLLL(sessionInfo);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
        public final String LJ(SessionInfo sessionInfo) {
            return this.LIZIZ.LJ(sessionInfo);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
        public final String LJFF(Aweme aweme) {
            return this.LIZIZ.LJFF(aweme);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
        public final String LJII() {
            return this.LIZIZ.LJII();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
        public final String getPid() {
            return this.LIZIZ.getPid();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
        public final String getProcessId() {
            this.LIZIZ.getClass();
            return IMAnalyticsUtil.LIZLLL;
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
        public final SessionInfo getSessionInfo() {
            this.LIZIZ.getClass();
            return IMAnalyticsUtil.LJ;
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
        public final void LJI(SessionInfo sessionInfo) {
            this.LIZIZ.getClass();
            IMAnalyticsUtil.LJ = sessionInfo;
        }
    }

    public static final void LJIIIIZZ() {
        LIZIZ.getClass();
        LIZLLL = "";
        ((ConcurrentHashMap) LIZJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
    public final String LIZIZ() {
        C909290Zln c909290Zln;
        SessionInfo sessionInfo = LJ;
        if (!Intrinsics.LJFF(sessionInfo != null ? sessionInfo.getEnterFromForMob() : null, "others_homepage")) {
            return null;
        }
        SessionInfo sessionInfo2 = LJ;
        if (!(sessionInfo2 instanceof C909290Zln) || (c909290Zln = (C909290Zln) sessionInfo2) == null) {
            return null;
        }
        return c909290Zln.getEnterProfileGroupId();
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
    public final String getPid() {
        String strLIZ = ChatRoomEventTrackingStore.LIZIZ.LIZ();
        return !C123100dR.LIZ(strLIZ) ? LIZLLL : strLIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
    public final String LJII() {
        String string = UUID.randomUUID().toString();
        LIZLLL = string;
        return string;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
    public final String getProcessId() {
        return LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
    public final SessionInfo getSessionInfo() {
        return LJ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
    public final String LIZ(String str) {
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ != null) {
            if (C882340YjQ.LJ(c0y8tLIZ)) {
                return "stranger";
            }
            if (c0y8tLIZ.isGroupChat()) {
                return C1229100i5c.LIZLLL(str);
            }
        }
        if (C879390Yef.LJ(str)) {
            return "tcm";
        }
        return "private";
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
    public final String LIZLLL(SessionInfo sessionInfo) {
        if (sessionInfo == null) {
            return "";
        }
        if (sessionInfo.isMessageRequest()) {
            return "message_box";
        }
        String strLJIIIZ = LJIIIZ("enter_from", "");
        if (strLJIIIZ.length() == 0) {
            String enterFromForMob = sessionInfo.getEnterFromForMob();
            if (enterFromForMob.length() == 0) {
                return "chat";
            }
            return enterFromForMob;
        }
        return strLJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
    public final String LJ(SessionInfo sessionInfo) {
        C909290Zln c909290Zln;
        int chatType = sessionInfo.getChatType();
        if (sessionInfo instanceof C909290Zln) {
            c909290Zln = (C909290Zln) sessionInfo;
        } else {
            c909290Zln = null;
        }
        if (c909290Zln != null && c909290Zln.isTCM()) {
            return "tcm";
        }
        if (chatType == 3) {
            return C1229100i5c.LIZLLL(sessionInfo.getConversationId());
        }
        if (chatType == 1) {
            return "stranger";
        }
        if (C0YNP.LJI(sessionInfo.getConversationId()) == 5) {
            return "aiasst";
        }
        return "private";
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
    public final String LJFF(Aweme aweme) {
        if (C1572306Dp.LIZ(AwemeExtKt.getAuthorUid(aweme))) {
            return "5";
        }
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJ = C069P.LIZ().LJ().LJ(AwemeExtKt.getAuthorUid(aweme), null);
        if (iMUserLJ != null) {
            int followStatus = iMUserLJ.getFollowStatus();
            int followerStatus = iMUserLJ.getFollowerStatus();
            if (followStatus == 1) {
                return "1";
            }
            if (followStatus == 2) {
                return "2";
            }
            if (followerStatus == 1) {
                return "3";
            }
            if (followStatus != 0) {
                return null;
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        User author = aweme.getAuthor();
        if (author != null) {
            int followStatus2 = author.getFollowStatus();
            int followerStatus2 = author.getFollowerStatus();
            if (followStatus2 == 1) {
                return "1";
            }
            if (followStatus2 == 2) {
                return "2";
            }
            if (followerStatus2 == 1) {
                return "3";
            }
            if (followStatus2 == 0) {
                return CardStruct.IStatusCode.DEFAULT;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
    public final void LJI(SessionInfo sessionInfo) {
        LJ = sessionInfo;
    }

    public static final String LJIIIZ(String str, String str2) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        String str3 = (String) ((ConcurrentHashMap) LIZJ).get(str);
        if (str3 == null) {
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        return str3;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil
    public final void LIZJ(String str, String str2) {
        Map<String, String> map = LIZJ;
        if (str2 == null) {
            str2 = "";
        }
        ((ConcurrentHashMap) map).put(str, str2);
    }
}
