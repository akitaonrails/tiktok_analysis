package com.ss.android.ugc.aweme.analytics;

import X.C0I0B;
import X.C20684815ws;
import X.C830490Whz;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class IMAlbumUpdateGuideAnalytics implements IIMAlbumUpdateGuideAnalytics {
    @Override // com.ss.android.ugc.aweme.analytics.IIMAlbumUpdateGuideAnalytics
    public final void LIZIZ(SessionInfo sessionInfo) {
        String str;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("conversation_id", sessionInfo.getConversationId());
        Integer numValueOf = Integer.valueOf(sessionInfo.getChatType());
        if (numValueOf != null && numValueOf.intValue() == 3) {
            str = "group";
        } else {
            str = "private";
        }
        c830490Whz.put("chat_type", str);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_show_album_update_floating_layer", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.analytics.IIMAlbumUpdateGuideAnalytics
    public final void LIZJ(SessionInfo sessionInfo) {
        String str;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("conversation_id", sessionInfo.getConversationId());
        Integer numValueOf = Integer.valueOf(sessionInfo.getChatType());
        if (numValueOf != null && numValueOf.intValue() == 3) {
            str = "group";
        } else {
            str = "private";
        }
        c830490Whz.put("chat_type", str);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_click_album_update_floating_layer", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.analytics.IIMAlbumUpdateGuideAnalytics
    public final void LIZ(Integer num, String str) {
        String str2;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("conversation_id", str);
        if (num != null && num.intValue() == 3) {
            str2 = "group";
        } else {
            str2 = "private";
        }
        c830490Whz.put("chat_type", str2);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_send_album_update_floating_layer", c830490Whz);
    }
}
