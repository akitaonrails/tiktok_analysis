package com.ss.android.ugc.aweme.im.sdk.chat.feature.top;

import X.C01GW;
import X.C0I0B;
import X.C1309105Aj;
import X.C1673406gu;
import X.C1677606ha;
import X.C23250099c;
import X.C452501pT;
import X.C909290Zln;
import X.C913140Zs0;
import X.InterfaceC497601wk;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class BottomNoticeViewModel extends ViewModel {
    public static final /* synthetic */ int LLILZLL = 0;
    public final Context LL;
    public SessionInfo LLILLJJLI;
    public String LLILLL = "notice_code";
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(482));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(483));

    public BottomNoticeViewModel(Context context) {
        this.LL = context;
    }

    public final void wQ2(int i) {
        String str;
        String conversationId;
        SessionInfo sessionInfo = this.LLILLJJLI;
        if (sessionInfo instanceof C913140Zs0) {
            str = "group_chat";
        } else {
            str = "dm_chat";
        }
        String str2 = this.LLILLL;
        if (sessionInfo != null) {
            conversationId = sessionInfo.getConversationId();
        } else {
            conversationId = null;
        }
        if (str2 != null && !a0.LJJJIL(str2)) {
            C23250099c.LIZLLL((InterfaceC497601wk) this.LLILZ.getValue(), (CoroutineContext) this.LLILZIL.getValue(), null, new C1309105Aj(i, str2, str, conversationId, null), 2);
        }
    }

    public final void vQ2(int i, String str, boolean z) {
        String strLIZ;
        C909290Zln c909290Zln;
        String conversationId;
        String conversationId2;
        String strLIZ2;
        IMUser fromUser;
        C909290Zln c909290Zln2;
        wQ2(i);
        IImDmProminenceAnalytics.LIZ.getClass();
        IImDmProminenceAnalytics iImDmProminenceAnalyticsLIZ = C1673406gu.LIZ();
        String str2 = "";
        IMUser fromUser2 = null;
        if (z && iImDmProminenceAnalyticsLIZ != null) {
            Integer numValueOf = Integer.valueOf(i);
            SessionInfo sessionInfo = this.LLILLJJLI;
            boolean z2 = sessionInfo instanceof C913140Zs0;
            if (sessionInfo == null || (conversationId2 = sessionInfo.getConversationId()) == null) {
                conversationId2 = "";
            }
            SessionInfo sessionInfo2 = this.LLILLJJLI;
            if (sessionInfo2 != null) {
                strLIZ2 = C1677606ha.LIZ(sessionInfo2.getChatType());
            } else {
                strLIZ2 = null;
            }
            boolean zLJFF = Intrinsics.LJFF(str, "safe_conversation_block_notice");
            SessionInfo sessionInfo3 = this.LLILLJJLI;
            if ((sessionInfo3 instanceof C909290Zln) && (c909290Zln2 = (C909290Zln) sessionInfo3) != null) {
                fromUser = c909290Zln2.getFromUser();
            } else {
                fromUser = null;
            }
            iImDmProminenceAnalyticsLIZ.LJFF(numValueOf, C0I0B.LJFF.LIZIZ(), z2, str, conversationId2, strLIZ2, zLJFF, fromUser);
        }
        if (i == 3 && iImDmProminenceAnalyticsLIZ != null) {
            SessionInfo sessionInfo4 = this.LLILLJJLI;
            if (sessionInfo4 != null && (conversationId = sessionInfo4.getConversationId()) != null) {
                str2 = conversationId;
            }
            SessionInfo sessionInfo5 = this.LLILLJJLI;
            if (sessionInfo5 != null) {
                strLIZ = C1677606ha.LIZ(sessionInfo5.getChatType());
            } else {
                strLIZ = null;
            }
            SessionInfo sessionInfo6 = this.LLILLJJLI;
            if ((sessionInfo6 instanceof C909290Zln) && (c909290Zln = (C909290Zln) sessionInfo6) != null) {
                fromUser2 = c909290Zln.getFromUser();
            }
            iImDmProminenceAnalyticsLIZ.LIZJ(fromUser2, C0I0B.LJFF.LIZIZ(), str2, strLIZ, str);
        }
    }
}
