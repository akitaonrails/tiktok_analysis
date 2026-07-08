package com.ss.android.ugc.aweme.im.service;

import X.C0R54;
import X.C0ZUN;
import X.InterfaceC1252250igx;
import X.InterfaceC1345705Ol;
import X.InterfaceC1395120mPO;
import X.InterfaceC1521605xW;
import X.InterfaceC1617930sCl;
import X.InterfaceC1765906vp;
import X.InterfaceC1903310zd3;
import X.InterfaceC1908910zm5;
import X.InterfaceC1908920zm6;
import X.InterfaceC2188371Akl;
import X.InterfaceC315700CZc;
import X.InterfaceC714600S1i;
import X.InterfaceC878090YcZ;
import X.InterfaceC894260Z6i;
import X.InterfaceC895100Z9o;
import X.InterfaceC896190ZDt;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics;
import com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper;
import com.ss.android.ugc.aweme.im.service.refresh.IMessageRefreshManager;
import com.ss.android.ugc.aweme.im.service.service.IIMBulletinBoardService;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService;
import com.ss.android.ugc.aweme.im.service.service.IInboxVisibilityChangeManager;
import com.ss.android.ugc.aweme.im.service.service.IMPerformanceService;
import com.ss.android.ugc.aweme.im.service.service.IQuickDmService;

/* JADX INFO: loaded from: classes29.dex */
public interface IIMService {
    InterfaceC1521605xW getAssembleEmojiPanelService();

    IAutomessageTooltipHelper getAutoMessageTooltipHelper();

    IAwemeFetchManager getAwemeFetchManager();

    IIMBulletinBoardService getBulletinBoardService();

    InterfaceC1395120mPO getCameraEffectService();

    InterfaceC2188371Akl getHeavyJobControlService();

    IIMChatService getImChatService();

    InterfaceC1908910zm5 getImEnsureService();

    InterfaceC1617930sCl getImInitializeService();

    InterfaceC1908920zm6 getImMafService();

    InterfaceC895100Z9o getImNudgeAnalytics();

    IIMNudgeAndStreakService getImNudgeAndStreakService();

    InterfaceC315700CZc getImPopupService();

    PrivacySettingsFeature getImPrivacySettings();

    InterfaceC1252250igx getImSayHiService();

    IMSayhiAnalytics getImSayhiAnalytics();

    InterfaceC1345705Ol getImUserService();

    C0R54 getImVideoService();

    InterfaceC1765906vp getImXBridgeProviderService();

    InterfaceC1903310zd3 getInboxAnalytics();

    IInboxVisibilityChangeManager getInboxTabChangeManager();

    long getInitTimestamp();

    InterfaceC896190ZDt getLightInteractService();

    IMessageRefreshManager getMessageRefreshManager();

    IMPerformanceService getPerformanceService();

    IQuickDmService getQuickDmService();

    InterfaceC714600S1i getQuickReplyAnalytics();

    InterfaceC894260Z6i getReplyingMsgService();

    InterfaceC878090YcZ getSendMessageTemplateService();

    void initialize(C0ZUN c0zun);

    void setHighlightText(TextView textView, String str, String str2);
}
