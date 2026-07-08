package com.ss.android.ugc.aweme.shortvideo.subtitle;

import X.C0X9S;
import X.C15O7;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;

/* JADX INFO: loaded from: classes30.dex */
public interface SubtitleApi {
    @InterfaceC1501170pAR("/tiktok/v1/videocaption/feedback/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C15O7<Object> feedback(@InterfaceC1501070pAH("vid") String str, @InterfaceC1501070pAH("aweme_id") String str2, @InterfaceC1501070pAH("task_id") String str3, @InterfaceC1485405rg FeedbackBody feedbackBody);

    @InterfaceC1501160pAQ("/tiktok/v1/videocaption/query/")
    C0X9S<SubmitAudioBody> query(@InterfaceC1501070pAH("task_id") String str);

    @InterfaceC1501170pAR("/tiktok/v1/videocaption/submit/")
    C0X9S<SubmitAudioBody> submit(@InterfaceC1501070pAH("tos_key") String str, @InterfaceC1501070pAH("max_lines") int i, @InterfaceC1501070pAH("words_per_line") int i2, @InterfaceC1501070pAH("selected_language") String str2, @InterfaceC1501070pAH("use_lid") boolean z, @InterfaceC1501070pAH("use_ddc") boolean z2, @InterfaceC1501070pAH("language_model") String str3, @InterfaceC1501070pAH("use_capitalize") boolean z3, @InterfaceC1501070pAH("use_punc") boolean z4);
}
