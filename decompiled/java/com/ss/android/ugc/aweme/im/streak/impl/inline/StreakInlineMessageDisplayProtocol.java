package com.ss.android.ugc.aweme.im.streak.impl.inline;

import X.C06LY;
import X.C1622006Ws;
import X.C1622306Wv;
import X.C869590Y9l;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissContext;
import com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissUtil;
import com.ss.android.ugc.aweme.im.messagelist.api.notice.protocol.ISystemNoticeDisplayProtocol;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS285S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakInlineMessageDisplayProtocol implements ISystemNoticeDisplayProtocol {
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.notice.protocol.ISystemNoticeDisplayProtocol
    public final boolean Pe0(SystemContent systemContent) {
        SystemContent.Key[] template = systemContent.getTemplate();
        if (template != null) {
            for (SystemContent.Key key : template) {
                if (key.getAction() == 200001 || key.getAction() == 26 || key.getAction() == 200002) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.notice.protocol.ISystemNoticeDisplayProtocol
    public final C1622306Wv Fg1(C869590Y9l c869590Y9l, SystemContent systemContent) {
        Boolean boolValueOf;
        C1622006Ws c1622006Ws = new C1622006Ws(AFwS285S0000000_2.get$arr$(21));
        C1622006Ws c1622006Ws2 = new C1622006Ws(AFwS285S0000000_2.get$arr$(22));
        IStreakService.LJJIIZ.getClass();
        Boolean boolValueOf2 = Boolean.valueOf(C06LY.LIZ().G(c869590Y9l.getConversationId()));
        List<Map<String, String>> msgDismissConditions = systemContent.getMsgDismissConditions();
        if (msgDismissConditions != null) {
            boolValueOf = Boolean.valueOf(SystemContentDismissUtil.INSTANCE.shouldDismiss(new SystemContentDismissContext(c869590Y9l.getConversationId(), null, null, null), msgDismissConditions));
        } else {
            boolValueOf = null;
        }
        return new C1622306Wv(true, c1622006Ws, c1622006Ws2, new Pair(boolValueOf2, boolValueOf));
    }
}
