package com.ss.android.ugc.aweme.im.sdk.chat.feature.inlinenotice;

import X.C1622306Wv;
import X.C1675506hF;
import X.C869590Y9l;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.messagelist.api.notice.protocol.ISystemNoticeDisplayProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class MinorProtectionNoticeDisplayProtocol implements ISystemNoticeDisplayProtocol {
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.notice.protocol.ISystemNoticeDisplayProtocol
    public final boolean Pe0(SystemContent systemContent) {
        SystemContent.Key[] template = systemContent.getTemplate();
        if (template == null) {
            return false;
        }
        for (SystemContent.Key key : template) {
            C1675506hF.LIZ.getClass();
            if (C1675506hF.LIZJ(key)) {
                if (key == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.notice.protocol.ISystemNoticeDisplayProtocol
    public final C1622306Wv Fg1(C869590Y9l c869590Y9l, SystemContent systemContent) {
        return new C1622306Wv(14);
    }
}
