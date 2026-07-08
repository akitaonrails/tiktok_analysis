package com.ss.android.ugc.aweme.services.publish;

import android.view.View;

/* JADX INFO: loaded from: classes30.dex */
public interface IAVPublishPageUIRefactorService {

    public static final class DefaultImpls {
    }

    IDebugAddLinkOptionService debugAddLinkOptionService();

    boolean disableShareShow();

    boolean enableLargeMentionAndHashTagBtn();

    boolean enableLargePostBtn();

    boolean enableRefactorAddLinkECommerceGuide();

    boolean enableRefactorPoiRcmdList();

    boolean enableRefactorPublishIcon();

    boolean enableRefactorPublishUI();

    boolean enableRemoveHashTagLoading();

    boolean enableToastCenter();

    boolean enableUseShareSheet();

    boolean fixPublishPageSheetColor();

    IPublishOptionCustomViewFactory getPublishOptionCustomViewFactory();

    long getSharePanelDismissDuration();

    void highlightContent(View view, Integer num);

    boolean isRefactorNewUserAddLinkGuideEnable();

    boolean isRefactorNewUserMoreOptionGuideEnable();

    boolean isRefactorPublishAddLinkOption();

    boolean isRefactorPublishPoiOption();
}
