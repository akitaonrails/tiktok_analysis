package com.ss.android.ugc.aweme.services.external.ui;

import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class DMAlbumParams {
    public final BaseHeaderComponent baseHeaderComponent;
    public final int chatType;
    public final int chooseMediaTnSNoticeRes;
    public final String conversationId;
    public final FeatureAttachmentData featureAttachmentData;
    public final int hintTextRes;
    public final int maxSelectCount;
    public final int maxSelectableVideoDuration;
    public final Map<String, String> openAlbumMobMap;
    public final Map<String, String> openAlbumMobMapV2;
    public final QuoteMode quoteMode;
    public final String receiverNickname;
    public final String sessionId;
    public final boolean shouldDisplayRecordButtonGuide;
    public final boolean shouldDisplayTnsNotice;
    public final String toUserId;

    public DMAlbumParams(String str, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, Map<String, String> map, Map<String, String> map2, String str2, String str3, String str4, QuoteMode quoteMode, BaseHeaderComponent baseHeaderComponent, FeatureAttachmentData featureAttachmentData) {
        this.sessionId = str;
        this.chatType = i;
        this.maxSelectCount = i2;
        this.maxSelectableVideoDuration = i3;
        this.hintTextRes = i4;
        this.chooseMediaTnSNoticeRes = i5;
        this.shouldDisplayTnsNotice = z;
        this.shouldDisplayRecordButtonGuide = z2;
        this.openAlbumMobMap = map;
        this.openAlbumMobMapV2 = map2;
        this.receiverNickname = str2;
        this.toUserId = str3;
        this.conversationId = str4;
        this.quoteMode = quoteMode;
        this.baseHeaderComponent = baseHeaderComponent;
        this.featureAttachmentData = featureAttachmentData;
    }
}
