package com.ss.android.ugc.aweme.im.callroom.analytics;

import X.C0I0B;
import X.C20684815ws;
import X.C830490Whz;
import com.ss.android.ugc.aweme.im.callroom.api.analytics.IVoiceCallEntranceAnalytics;

/* JADX INFO: loaded from: classes3.dex */
public final class VoiceCallEntranceAnalyticsImpl implements IVoiceCallEntranceAnalytics {
    public static C830490Whz LIZJ(String str, String str2, String str3, String str4) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("enter_method", str3);
        c830490Whz.put("to_user_id", str2);
        c830490Whz.put("conversation_id", str);
        c830490Whz.put("chat_type", "private");
        c830490Whz.put("relation_tag", str4);
        return c830490Whz;
    }

    @Override // com.ss.android.ugc.aweme.im.callroom.api.analytics.IVoiceCallEntranceAnalytics
    public final void LIZIZ(String str, String str2, String str3, String str4) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_im_outgoing_call_click", LIZJ(str, str2, str3, str4));
    }

    @Override // com.ss.android.ugc.aweme.im.callroom.api.analytics.IVoiceCallEntranceAnalytics
    public final void LIZ(String str, String str2, String str3, String str4, String str5) {
        C830490Whz c830490WhzLIZJ = LIZJ(str2, str3, str4, str5);
        c830490WhzLIZJ.put("result", str);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_im_outgoing_call_result", c830490WhzLIZJ);
    }
}
