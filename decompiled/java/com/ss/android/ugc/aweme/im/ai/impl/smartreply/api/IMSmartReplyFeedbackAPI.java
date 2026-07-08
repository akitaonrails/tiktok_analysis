package com.ss.android.ugc.aweme.im.ai.impl.smartreply.api;

import X.C11NZ;
import X.C1535705zn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackCancelRequest;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackCancelResponse;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackConfigResponse;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackRequest;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface IMSmartReplyFeedbackAPI {
    public static final C1535705zn LIZ = C1535705zn.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/im/bot/feedback")
    C11NZ<BotFeedbackResponse> feedback(@InterfaceC1485405rg BotFeedbackRequest botFeedbackRequest);

    @InterfaceC1501170pAR("/tiktok/v1/im/bot/feedback_cancel")
    C11NZ<BotFeedbackCancelResponse> feedbackCancel(@InterfaceC1485405rg BotFeedbackCancelRequest botFeedbackCancelRequest);

    @InterfaceC1501160pAQ("/tiktok/v1/im/bot/feedback_config")
    C11NZ<BotFeedbackConfigResponse> feedbackConfig();
}
