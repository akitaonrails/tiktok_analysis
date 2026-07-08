package com.ss.android.ugc.aweme.vibefeed.serviceimpl;

import X.C0N7Z;
import X.C0RF0;
import X.C0VKZ;
import X.C0Z7P;
import X.C0Z7U;
import X.C0ZDX;
import X.C1385040m98;
import X.C13LE;
import X.C1575210r5r;
import X.C1575440r6E;
import X.C1575580r6S;
import X.C1575900r6y;
import X.C1576040r7C;
import X.C19719912Dl;
import X.C628970Olj;
import X.C786410Ut5;
import X.C869590Y9l;
import X.EnumC1575230r5t;
import X.EnumC1575330r63;
import X.InterfaceC691450RAh;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.vibefeed.database.SharedFeedDatabase;
import com.ss.android.ugc.aweme.vibefeed.feed.interact.msg.VibeMessageListTrigger;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedInviteParam;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeFeedService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeFeedServiceImpl implements IVibeFeedService {
    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeFeedService
    public final void LIZ() {
        SharedFeedDatabase.LL = null;
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeFeedService
    public final C19719912Dl LIZLLL() {
        return C13LE.LIZ(VibeMessageListTrigger.class);
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeFeedService
    public final boolean LIZIZ(String str) {
        if (C1576040r7C.LIZ()) {
            if (Intrinsics.LJFF(str, "shared_feed") || Intrinsics.LJFF(str, "shared_feed_like_history")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeFeedService
    public final void LJ(C869590Y9l c869590Y9l) {
        String strLIZIZ;
        if (c869590Y9l != null && c869590Y9l.isSuccessStatus() && (strLIZIZ = C0ZDX.LIZIZ(c869590Y9l)) != null && C0ZDX.LJJIJIIJI(c869590Y9l)) {
            long msgId = c869590Y9l.getMsgId();
            String conversationId = c869590Y9l.getConversationId();
            long createdAt = c869590Y9l.getCreatedAt();
            C0Z7U.LIZ.getClass();
            C0Z7P.LIZ().LIZIZ(new C0VKZ(msgId, conversationId, strLIZIZ, createdAt));
        }
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeFeedService
    public final C0N7Z LJFF(int i, InterfaceC691450RAh interfaceC691450RAh) {
        C0RF0 c0rf0;
        EnumC1575330r63 enumC1575330r63;
        if (!(interfaceC691450RAh instanceof C0RF0) || (c0rf0 = (C0RF0) interfaceC691450RAh) == null) {
            return null;
        }
        switch (i) {
            case 68:
                String conversationId = c0rf0.LJ.param.getConversationId();
                if (conversationId == null) {
                    conversationId = "";
                }
                String chatFromUserId = c0rf0.LJ.param.getChatFromUserId();
                EnumC1575230r5t enumC1575230r5tLIZIZ = C1575210r5r.LLILLJJLI.LIZIZ(conversationId);
                if (enumC1575230r5tLIZIZ == EnumC1575230r5t.ACCEPTING) {
                    enumC1575330r63 = EnumC1575330r63.ACCEPT;
                } else if (enumC1575230r5tLIZIZ == EnumC1575230r5t.INVITE_GAP) {
                    enumC1575330r63 = EnumC1575330r63.INVITE_GAP;
                } else if (enumC1575230r5tLIZIZ == EnumC1575230r5t.INVITE_OUTGAP) {
                    enumC1575330r63 = EnumC1575330r63.RE_INVITE;
                } else {
                    enumC1575330r63 = EnumC1575330r63.INVITE;
                }
                return new C1575900r6y(c0rf0, new VibeFeedInviteParam(conversationId, chatFromUserId, "end_of_shared_content", enumC1575330r63, enumC1575230r5tLIZIZ, "", C1575440r6E.LJI(conversationId)));
            case 69:
                return new C628970Olj(c0rf0);
            case 70:
                return new C1575580r6S(c0rf0);
            default:
                return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeFeedService
    public final View LIZJ(Context context, int i, ViewGroup viewGroup) {
        if (i == 70) {
            return C786410Ut5.Td(C786410Ut5.ne(C1385040m98.LIZ(context, true)), R.layout.i8i, viewGroup, false);
        }
        return C786410Ut5.Td(C786410Ut5.ne(C1385040m98.LIZ(context, true)), R.layout.i8g, viewGroup, false);
    }
}
