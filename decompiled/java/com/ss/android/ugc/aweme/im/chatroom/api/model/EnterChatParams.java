package com.ss.android.ugc.aweme.im.chatroom.api.model;

import X.AbstractC884010Ym7;
import X.C09CT;
import X.C123100dR;
import X.C13BV;
import X.C869590Y9l;
import X.C892110YzB;
import X.C893600Z3u;
import X.C912520Zr0;
import X.EnumC896490ZEx;
import android.content.Context;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes15.dex */
public final class EnterChatParams implements Serializable {
    public String LL;
    public String LLILLJJLI;
    public Map<String, String> LLILLL;
    public transient Context LLILZ;
    public String LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public String LLIZLLLIL;
    public int LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public boolean LLJJIII;
    public int LLJJIJI;
    public String LLJJIJIIJIL;
    public Boolean LLJJIJIL;
    public String LLJJJ;
    public IMUser LLJJJIL;
    public Integer LLJJJJ;
    public IMContact LLJJJJJIL;
    public String LLJJJJLIIL;
    public Serializable LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public C912520Zr0 LLJL;
    public boolean LLJLIL;
    public int LLJLILLLLZIIL;
    public AbstractC884010Ym7 LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public EnumC896490ZEx LLLF;
    public String LLLFF;
    public boolean LLLFFI;
    public List<Long> LLLFZ;
    public String LLLI;
    public String LLLII;
    public C892110YzB LLLIIII;
    public long LLLIIIIL;
    public long LLLIIIL;
    public String LLLIIL;
    public boolean LLLIILIL;
    public int LLLIL;
    public String LLLILZ;
    public Integer LLLILZJ;
    public String LLLILZLLLI;
    public String LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;
    public int LLLLII;
    public String LLLLIIIILLL;
    public String LLLLIIL;
    public Integer LLLLIILL;
    public boolean LLLLIILLL;
    public final String LLLLIL;
    public String LLLLILI;
    public boolean LLLLJ;
    public Map<String, String> LLLLJI;
    public boolean LLLLL;
    public C893600Z3u LLLLLIL;
    public int LLLLLILLIL;
    public Integer LLLLLJIL;
    public String LLLLLJLJLL;
    public String LLLLLL;
    public String LLLLLLIL;
    public String LLLLLLJ;
    public boolean LLLLLLL;
    public boolean LLLLLLLLL;
    public Boolean LLLLLLLLLL;
    public boolean LLLLLLLZIL;
    public boolean LLLLLLZ;
    public boolean LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public String LLLLLZL;
    public Integer LLLLZ;
    public String LLLLZI;
    public String LLLLZIL;
    public String LLLLZLL;
    public Long LLLLZLLIL;
    public String LLLLZLLLI;
    public Long LLLZ;
    public C869590Y9l LLLZI;
    public int LLLZIIL;
    public List<String> LLLZIL;
    public String LLLZL;
    public Long LLLZLL;
    public String LLLZLZ;
    public String LLLZZ;
    public String LLLZZIL;
    public String LLZ;
    public String LLZIL;
    public boolean LLZILL;
    public boolean LLZL;
    public boolean LLZLI;
    public boolean LLZLL;
    public Map<String, String> LLZLLIL;
    public String LLZLLLL;
    public boolean LLZZ;
    public boolean LLZZJLIL;
    public PreviewConfig LLZZLLIL;
    public String LLZZZIL;

    @C09CT("auto_quoted_message_content_info_dict")
    public String autoQuotedMessageContentInfoMap;

    @C09CT("biz_info_extra")
    public String bizInfoExtra;

    @C09CT("biz_event_tracking_extra")
    public String extrasInfoMobParams;

    @C09CT("input_auto_filled_content")
    public String inputAutoFillContent;

    @C09CT("input_auto_filled_awe_type")
    public int inputAutoFilledAweType;

    @C09CT("input_auto_filled_sync_ext")
    public String inputAutoFilledSyncExt;

    @C09CT("input_expand_full_screen")
    public boolean quickChatInputCanExpandFullScreen;

    @C09CT("aweim_prefer_push_in_panel_percent_type")
    public int quickChatViewType;

    public static /* synthetic */ void getChatType$annotations() {
    }

    public static /* synthetic */ void getEnterFrom$annotations() {
    }

    public static /* synthetic */ void getTransitionType$annotations() {
    }

    public final String getTrafficTypeForMob() {
        if (C123100dR.LIZ(this.LLJI)) {
            return this.LLJI;
        }
        return null;
    }

    public final String getUserId() {
        IMUser iMUser = this.LLJJJIL;
        return iMUser != null ? iMUser.getUid() : "";
    }

    public final boolean isPreviewMode() {
        return this.LLZZLLIL != null;
    }

    public EnterChatParams() {
        this.LLILZIL = "";
        this.LLILZLL = -1;
        this.LLIZLLLIL = "";
        this.LLJ = 1;
        this.LLJI = "";
        this.LLJILJIL = "";
        this.LLJILJILJ = "";
        this.LLLF = EnumC896490ZEx.NO_STATUS;
        this.LLLFF = "";
        this.LLLFZ = C13BV.INSTANCE;
        this.LLLI = "";
        this.LLLII = "";
        this.LLLILZ = "";
        this.LLLILZLLLI = "";
        this.LLLIZZ = "";
        this.LLLL = true;
        this.quickChatViewType = 1;
        this.inputAutoFillContent = "";
        this.inputAutoFilledSyncExt = "";
        this.LLLLIIIILLL = "";
        this.LLLLIIL = "";
        this.LLLLIL = UUID.randomUUID().toString();
        this.LLLLJI = new LinkedHashMap();
        this.extrasInfoMobParams = "";
        this.bizInfoExtra = "";
        this.LLLLLILLIL = -1;
        this.LLLLZLLLI = "";
        this.LLLZLL = 0L;
        this.LLLZLZ = "";
        this.LLLZZ = "";
        this.LLZLI = true;
        this.LLZLL = true;
        this.LLZLLIL = new LinkedHashMap();
        this.LLZZZIL = "";
    }

    public final EnumC896490ZEx getActivityStatus() {
        return this.LLLF;
    }

    public final int getActivityStatusLevel() {
        return this.LLLZIIL;
    }

    public final boolean getAllowPreloadLayout() {
        return this.LLZZ;
    }

    public final String getAppLaunchFrom() {
        return this.LLLLZIL;
    }

    public final String getAuthorId() {
        return this.LLLLIIIILLL;
    }

    public final String getAutoQuotedMessageContentInfoMap() {
        return this.autoQuotedMessageContentInfoMap;
    }

    public final String getBizInfoExtra() {
        return this.bizInfoExtra;
    }

    public final String getButtonType() {
        return this.LLJJJ;
    }

    public final Serializable getChatExt() {
        return this.LLJJL;
    }

    public final int getChatType() {
        return this.LLILZLL;
    }

    public final boolean getCheckWelcomeMsg() {
        return this.LLLLLLLZIL;
    }

    public final C892110YzB getClickOutPushParams() {
        return this.LLLIIII;
    }

    public final String getCollabUserType() {
        return this.LLLZZ;
    }

    public final Context getContext() {
        return this.LLILZ;
    }

    public final String getDefaultOpenPanelType() {
        return this.LLLZZIL;
    }

    public final int getDisableBackGroundMaskForQuickChat() {
        return this.LLLLII;
    }

    public final boolean getDisableLandingMessage() {
        return this.LLZL;
    }

    public final List<String> getEffectIds() {
        return this.LLLZIL;
    }

    public final int getEnterFrom() {
        return this.LLIZ;
    }

    public final String getEnterFromForMob() {
        return this.LLIZLLLIL;
    }

    public final String getEnterFromSubPage() {
        return this.LLJIJIL;
    }

    public final String getEnterMethodForMob() {
        return this.LLJILJIL;
    }

    public final String getEnterProfileGroupId() {
        return this.LLLIIL;
    }

    public final String getEntrancePageForMob() {
        return this.LLJILJILJ;
    }

    public final int getEntranceType() {
        return this.LLJ;
    }

    public final Map<String, String> getExtraMobParams() {
        return this.LLLLJI;
    }

    public final Map<String, String> getExtras() {
        return this.LLZLLIL;
    }

    public final String getExtrasInfoMobParams() {
        return this.extrasInfoMobParams;
    }

    public final boolean getFinishTopChatroomPages() {
        return this.LLLLJ;
    }

    public final Integer getFollowStatusRelation() {
        return this.LLLILZJ;
    }

    public final boolean getForbidSugQuestionPanel() {
        return this.LLZILL;
    }

    public final boolean getForceRefresh() {
        return this.LLLLLZIL;
    }

    public final String getFromRequestId() {
        return this.LLILLJJLI;
    }

    public final boolean getFullScreenByDefault() {
        return this.LLLLLLLLL;
    }

    public final boolean getGroupChatNeedPullLatestMsg() {
        return this.LLZZJLIL;
    }

    public final String getGroupId() {
        return this.LLLILZ;
    }

    public final boolean getHasCameraIcon() {
        return this.LLJLLL;
    }

    public final boolean getHasThoughtAndWillShowAsExpanded() {
        return this.LLLLL;
    }

    public final boolean getHasUnreadDot() {
        return this.LLLJIL;
    }

    public final IMContact getImContact() {
        return this.LLJJJJJIL;
    }

    public final Boolean getImSearchNeedBounce() {
        return this.LLJJIJIL;
    }

    public final IMUser getImUser() {
        return this.LLJJJIL;
    }

    public final String getInboxSearchCellType() {
        return this.LLJJI;
    }

    public final String getInboxSearchPosition() {
        return this.LLJJ;
    }

    public final String getInboxSearchTabName() {
        return this.LLJJIJIIJIL;
    }

    public final Integer getInboxType() {
        return this.LLJJJJ;
    }

    public final int getInnerPushType() {
        return this.LLLIL;
    }

    public final String getInputAutoFillContent() {
        return this.inputAutoFillContent;
    }

    public final int getInputAutoFilledAweType() {
        return this.inputAutoFilledAweType;
    }

    public final String getInputAutoFilledSyncExt() {
        return this.inputAutoFilledSyncExt;
    }

    public final int getInviteeGroupStatus() {
        return this.LLJJIJI;
    }

    public final boolean getKeepEnterFrom() {
        return this.LLJZ;
    }

    public final int getLastMessageMsgType() {
        return this.LLLLLILLIL;
    }

    public final String getLastMsgUUId() {
        return this.LLLFF;
    }

    public final String getLastVideoPlayDuration() {
        return this.LLLLLLJ;
    }

    public final Map<String, String> getLiveLogMap() {
        return this.LLILLL;
    }

    public final String getMatchedKeyword() {
        return this.LLLLZLLLI;
    }

    public final String getMobEnterMethodForEditShare() {
        return this.LLJILLL;
    }

    public final long getMsgIdFromInAppPush() {
        return this.LLLIIIL;
    }

    public final long getMsgIdFromPush() {
        return this.LLLIIIIL;
    }

    public final boolean getNoEnterChatEvent() {
        return this.LLJLIL;
    }

    public final String getOutPushLabel() {
        return this.LLLLZLL;
    }

    public final String getPetPanelAdditionalParams() {
        return this.LLZ;
    }

    public final String getPositionForMob() {
        return this.LLLLIIL;
    }

    public final PreviewConfig getPreviewConfig() {
        return this.LLZZLLIL;
    }

    public final String getPreviousPage() {
        return this.LLLLILI;
    }

    public final String getPushLabel() {
        return this.LLLZL;
    }

    public final C893600Z3u getPushReferenceInfo() {
        return this.LLLLLIL;
    }

    public final boolean getQuickChatCanExpandFullScreen() {
        return this.LLLL;
    }

    public final boolean getQuickChatInputCanExpandFullScreen() {
        return this.quickChatInputCanExpandFullScreen;
    }

    public final int getQuickChatViewType() {
        return this.quickChatViewType;
    }

    public final List<Long> getReaders() {
        return this.LLLFZ;
    }

    public final String getRecType() {
        return this.LLLI;
    }

    public final C912520Zr0 getReportParams() {
        return this.LLJL;
    }

    public final String getReturnPage() {
        return this.LLLLZI;
    }

    public final String getRoomId() {
        return this.LL;
    }

    public final Long getScrollToMsgId() {
        return this.LLLZ;
    }

    public final String getSearchId() {
        return this.LLLLLL;
    }

    public final String getSearchResultId() {
        return this.LLLLLLIL;
    }

    public final Long getSearchTargetIndex() {
        return this.LLLLZLLIL;
    }

    public final String getSearchType() {
        return this.LLLLLJLJLL;
    }

    public final String getSectionType() {
        return this.LLLLLZL;
    }

    public final String getSessionId() {
        return this.LLILZIL;
    }

    public final String getShareUserId() {
        return this.LLJJJJLIIL;
    }

    public final boolean getShowKeyBoardByDefault() {
        return this.LLLLLLL;
    }

    public final boolean getShowTitleBar() {
        return this.LLZLI;
    }

    public final Integer getSiteId() {
        return this.LLLLIILL;
    }

    public final String getSourceBtmToken() {
        return this.LLZIL;
    }

    public final String getStoryCollectionId() {
        return this.LLLIZZ;
    }

    public final String getStoryType() {
        return this.LLLILZLLLI;
    }

    public final C869590Y9l getStoryViewerListReplyMsg() {
        return this.LLLZI;
    }

    public final String getSuggestReplySource() {
        return this.LLZZZIL;
    }

    public final boolean getTabletOptimizationEnabled() {
        return this.LLLIILIL;
    }

    public final Long getTakoActionItemId() {
        return this.LLLZLL;
    }

    public final String getTakoActionProcessId() {
        return this.LLLZLZ;
    }

    public final String getToAccType() {
        return this.LLZLLLL;
    }

    public final String getToUserType() {
        return this.LLLII;
    }

    public final String getTrafficType() {
        return this.LLJI;
    }

    public final Integer getTransitionType() {
        return this.LLLLZ;
    }

    public final int getUnreadCount() {
        return this.LLJLILLLLZIIL;
    }

    public final AbstractC884010Ym7 getUnreadViewState() {
        return this.LLJLL;
    }

    public final String getUuid() {
        return this.LLLLIL;
    }

    public final Boolean getWelcomeMsgEnabled() {
        return this.LLLLLLLLLL;
    }

    public final boolean isDissolvedGroup() {
        return this.LLLLLZ;
    }

    public final boolean isFromNewFollow() {
        return this.LLLLIILLL;
    }

    public final boolean isFullScreen() {
        return this.LLZLL;
    }

    public final boolean isHighRiskConversation() {
        return this.LLLLLLZ;
    }

    public final boolean isLastMsgAllRead() {
        return this.LLLFFI;
    }

    public final boolean isMediaMsgMasking() {
        return this.LLLLLLZZ;
    }

    public final boolean isNewGroupChat() {
        return this.LLJJIII;
    }

    public final boolean isQuickChat() {
        return this.LLLJL;
    }

    public final boolean isRecommendedChat() {
        return this.LLJLLIL;
    }

    public final boolean isReportPage() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final boolean isRisky() {
        return this.LLL;
    }

    public final Integer isSearchScene() {
        return this.LLLLLJIL;
    }

    public final boolean isStickyTop() {
        return this.LLLJ;
    }

    public final boolean isTCM() {
        return this.LLJZIJLIL;
    }

    public final void setActivityStatus(EnumC896490ZEx enumC896490ZEx) {
        this.LLLF = enumC896490ZEx;
    }

    public final void setActivityStatusLevel(int i) {
        this.LLLZIIL = i;
    }

    public final void setAllowPreloadLayout(boolean z) {
        this.LLZZ = z;
    }

    public final void setAppLaunchFrom(String str) {
        this.LLLLZIL = str;
    }

    public final void setAuthorId(String str) {
        this.LLLLIIIILLL = str;
    }

    public final void setAutoQuotedMessageContentInfoMap(String str) {
        this.autoQuotedMessageContentInfoMap = str;
    }

    public final void setBizInfoExtra(String str) {
        this.bizInfoExtra = str;
    }

    public final void setButtonType(String str) {
        this.LLJJJ = str;
    }

    public final void setChatExt(Serializable serializable) {
        this.LLJJL = serializable;
    }

    public final void setChatType(int i) {
        this.LLILZLL = i;
    }

    public final void setCheckWelcomeMsg(boolean z) {
        this.LLLLLLLZIL = z;
    }

    public final void setClickOutPushParams(C892110YzB c892110YzB) {
        this.LLLIIII = c892110YzB;
    }

    public final void setCollabUserType(String str) {
        this.LLLZZ = str;
    }

    public final void setContext(Context context) {
        this.LLILZ = context;
    }

    public final void setDefaultOpenPanelType(String str) {
        this.LLLZZIL = str;
    }

    public final void setDisableBackGroundMaskForQuickChat(int i) {
        this.LLLLII = i;
    }

    public final void setDisableLandingMessage(boolean z) {
        this.LLZL = z;
    }

    public final void setDissolvedGroup(boolean z) {
        this.LLLLLZ = z;
    }

    public final void setEffectIds(List<String> list) {
        this.LLLZIL = list;
    }

    public final void setEnterFrom(int i) {
        this.LLIZ = i;
    }

    public final void setEnterFromForMob(String str) {
        this.LLIZLLLIL = str;
    }

    public final void setEnterFromSubPage(String str) {
        this.LLJIJIL = str;
    }

    public final void setEnterMethodForMob(String str) {
        this.LLJILJIL = str;
    }

    public final void setEnterProfileGroupId(String str) {
        this.LLLIIL = str;
    }

    public final void setEntrancePageForMob(String str) {
        this.LLJILJILJ = str;
    }

    public final void setEntranceType(int i) {
        this.LLJ = i;
    }

    public final void setExtraMobParams(Map<String, String> map) {
        this.LLLLJI = map;
    }

    public final void setExtras(Map<String, String> map) {
        this.LLZLLIL = map;
    }

    public final void setExtrasInfoMobParams(String str) {
        this.extrasInfoMobParams = str;
    }

    public final void setFinishTopChatroomPages(boolean z) {
        this.LLLLJ = z;
    }

    public final void setFollowStatusRelation(Integer num) {
        this.LLLILZJ = num;
    }

    public final void setForbidSugQuestionPanel(boolean z) {
        this.LLZILL = z;
    }

    public final void setForceRefresh(boolean z) {
        this.LLLLLZIL = z;
    }

    public final void setFromNewFollow(boolean z) {
        this.LLLLIILLL = z;
    }

    public final void setFromRequestId(String str) {
        this.LLILLJJLI = str;
    }

    public final void setFullScreen(boolean z) {
        this.LLZLL = z;
    }

    public final void setFullScreenByDefault(boolean z) {
        this.LLLLLLLLL = z;
    }

    public final void setGroupChatNeedPullLatestMsg(boolean z) {
        this.LLZZJLIL = z;
    }

    public final void setGroupId(String str) {
        this.LLLILZ = str;
    }

    public final void setHasCameraIcon(boolean z) {
        this.LLJLLL = z;
    }

    public final void setHasThoughtAndWillShowAsExpanded(boolean z) {
        this.LLLLL = z;
    }

    public final void setHasUnreadDot(boolean z) {
        this.LLLJIL = z;
    }

    public final void setHighRiskConversation(boolean z) {
        this.LLLLLLZ = z;
    }

    public final void setImContact(IMContact iMContact) {
        this.LLJJJJJIL = iMContact;
    }

    public final void setImSearchNeedBounce(Boolean bool) {
        this.LLJJIJIL = bool;
    }

    public final void setImUser(IMUser iMUser) {
        this.LLJJJIL = iMUser;
    }

    public final void setInboxSearchCellType(String str) {
        this.LLJJI = str;
    }

    public final void setInboxSearchPosition(String str) {
        this.LLJJ = str;
    }

    public final void setInboxSearchTabName(String str) {
        this.LLJJIJIIJIL = str;
    }

    public final void setInboxType(Integer num) {
        this.LLJJJJ = num;
    }

    public final void setInnerPushType(int i) {
        this.LLLIL = i;
    }

    public final void setInputAutoFillContent(String str) {
        this.inputAutoFillContent = str;
    }

    public final void setInputAutoFilledAweType(int i) {
        this.inputAutoFilledAweType = i;
    }

    public final void setInputAutoFilledSyncExt(String str) {
        this.inputAutoFilledSyncExt = str;
    }

    public final void setInviteeGroupStatus(int i) {
        this.LLJJIJI = i;
    }

    public final void setKeepEnterFrom(boolean z) {
        this.LLJZ = z;
    }

    public final void setLastMessageMsgType(int i) {
        this.LLLLLILLIL = i;
    }

    public final void setLastMsgAllRead(boolean z) {
        this.LLLFFI = z;
    }

    public final void setLastMsgUUId(String str) {
        this.LLLFF = str;
    }

    public final void setLastVideoPlayDuration(String str) {
        this.LLLLLLJ = str;
    }

    public final void setLiveLogMap(Map<String, String> map) {
        this.LLILLL = map;
    }

    public final void setMatchedKeyword(String str) {
        this.LLLLZLLLI = str;
    }

    public final void setMediaMsgMasking(boolean z) {
        this.LLLLLLZZ = z;
    }

    public final void setMobEnterMethodForEditShare(String str) {
        this.LLJILLL = str;
    }

    public final void setMsgIdFromInAppPush(long j) {
        this.LLLIIIL = j;
    }

    public final void setMsgIdFromPush(long j) {
        this.LLLIIIIL = j;
    }

    public final void setNewGroupChat(boolean z) {
        this.LLJJIII = z;
    }

    public final void setNoEnterChatEvent(boolean z) {
        this.LLJLIL = z;
    }

    public final void setOutPushLabel(String str) {
        this.LLLLZLL = str;
    }

    public final void setPetPanelAdditionalParams(String str) {
        this.LLZ = str;
    }

    public final void setPositionForMob(String str) {
        this.LLLLIIL = str;
    }

    public final void setPreviewConfig(PreviewConfig previewConfig) {
        this.LLZZLLIL = previewConfig;
    }

    public final void setPreviousPage(String str) {
        this.LLLLILI = str;
    }

    public final void setPushLabel(String str) {
        this.LLLZL = str;
    }

    public final void setPushReferenceInfo(C893600Z3u c893600Z3u) {
        this.LLLLLIL = c893600Z3u;
    }

    public final void setQuickChat(boolean z) {
        this.LLLJL = z;
    }

    public final void setQuickChatCanExpandFullScreen(boolean z) {
        this.LLLL = z;
    }

    public final void setQuickChatInputCanExpandFullScreen(boolean z) {
        this.quickChatInputCanExpandFullScreen = z;
    }

    public final void setQuickChatViewType(int i) {
        this.quickChatViewType = i;
    }

    public final void setReaders(List<Long> list) {
        this.LLLFZ = list;
    }

    public final void setRecType(String str) {
        this.LLLI = str;
    }

    public final void setRecommendedChat(boolean z) {
        this.LLJLLIL = z;
    }

    public final void setReportPage(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    public final void setReportParams(C912520Zr0 c912520Zr0) {
        this.LLJL = c912520Zr0;
    }

    public final void setReturnPage(String str) {
        this.LLLLZI = str;
    }

    public final void setRisky(boolean z) {
        this.LLL = z;
    }

    public final void setRoomId(String str) {
        this.LL = str;
    }

    public final void setScrollToMsgId(Long l) {
        this.LLLZ = l;
    }

    public final void setSearchId(String str) {
        this.LLLLLL = str;
    }

    public final void setSearchResultId(String str) {
        this.LLLLLLIL = str;
    }

    public final void setSearchScene(Integer num) {
        this.LLLLLJIL = num;
    }

    public final void setSearchTargetIndex(Long l) {
        this.LLLLZLLIL = l;
    }

    public final void setSearchType(String str) {
        this.LLLLLJLJLL = str;
    }

    public final void setSectionType(String str) {
        this.LLLLLZL = str;
    }

    public final void setSessionId(String str) {
        this.LLILZIL = str;
    }

    public final void setShareUserId(String str) {
        this.LLJJJJLIIL = str;
    }

    public final void setShowKeyBoardByDefault(boolean z) {
        this.LLLLLLL = z;
    }

    public final void setShowTitleBar(boolean z) {
        this.LLZLI = z;
    }

    public final void setSiteId(Integer num) {
        this.LLLLIILL = num;
    }

    public final void setSourceBtmToken(String str) {
        this.LLZIL = str;
    }

    public final void setStickyTop(boolean z) {
        this.LLLJ = z;
    }

    public final void setStoryCollectionId(String str) {
        this.LLLIZZ = str;
    }

    public final void setStoryType(String str) {
        this.LLLILZLLLI = str;
    }

    public final void setStoryViewerListReplyMsg(C869590Y9l c869590Y9l) {
        this.LLLZI = c869590Y9l;
    }

    public final void setSuggestReplySource(String str) {
        this.LLZZZIL = str;
    }

    public final void setTCM(boolean z) {
        this.LLJZIJLIL = z;
    }

    public final void setTabletOptimizationEnabled(boolean z) {
        this.LLLIILIL = z;
    }

    public final void setTakoActionItemId(Long l) {
        this.LLLZLL = l;
    }

    public final void setTakoActionProcessId(String str) {
        this.LLLZLZ = str;
    }

    public final void setToAccType(String str) {
        this.LLZLLLL = str;
    }

    public final void setToUserType(String str) {
        this.LLLII = str;
    }

    public final void setTrafficType(String str) {
        this.LLJI = str;
    }

    public final void setTransitionType(Integer num) {
        this.LLLLZ = num;
    }

    public final void setUnreadCount(int i) {
        this.LLJLILLLLZIIL = i;
    }

    public final void setUnreadViewState(AbstractC884010Ym7 abstractC884010Ym7) {
        this.LLJLL = abstractC884010Ym7;
    }

    public final void setWelcomeMsgEnabled(Boolean bool) {
        this.LLLLLLLLLL = bool;
    }

    public EnterChatParams(Context context, IMContact iMContact) {
        this.LLILZIL = "";
        this.LLILZLL = -1;
        this.LLIZLLLIL = "";
        this.LLJ = 1;
        this.LLJI = "";
        this.LLJILJIL = "";
        this.LLJILJILJ = "";
        this.LLLF = EnumC896490ZEx.NO_STATUS;
        this.LLLFF = "";
        this.LLLFZ = C13BV.INSTANCE;
        this.LLLI = "";
        this.LLLII = "";
        this.LLLILZ = "";
        this.LLLILZLLLI = "";
        this.LLLIZZ = "";
        this.LLLL = true;
        this.quickChatViewType = 1;
        this.inputAutoFillContent = "";
        this.inputAutoFilledSyncExt = "";
        this.LLLLIIIILLL = "";
        this.LLLLIIL = "";
        this.LLLLIL = UUID.randomUUID().toString();
        this.LLLLJI = new LinkedHashMap();
        this.extrasInfoMobParams = "";
        this.bizInfoExtra = "";
        this.LLLLLILLIL = -1;
        this.LLLLZLLLI = "";
        this.LLLZLL = 0L;
        this.LLLZLZ = "";
        this.LLLZZ = "";
        this.LLZLI = true;
        this.LLZLL = true;
        this.LLZLLIL = new LinkedHashMap();
        this.LLZZZIL = "";
        this.LLILZ = context;
        this.LLJJJJJIL = iMContact;
    }

    public EnterChatParams(Context context, IMUser iMUser) {
        this.LLILZIL = "";
        this.LLILZLL = -1;
        this.LLIZLLLIL = "";
        this.LLJ = 1;
        this.LLJI = "";
        this.LLJILJIL = "";
        this.LLJILJILJ = "";
        this.LLLF = EnumC896490ZEx.NO_STATUS;
        this.LLLFF = "";
        this.LLLFZ = C13BV.INSTANCE;
        this.LLLI = "";
        this.LLLII = "";
        this.LLLILZ = "";
        this.LLLILZLLLI = "";
        this.LLLIZZ = "";
        this.LLLL = true;
        this.quickChatViewType = 1;
        this.inputAutoFillContent = "";
        this.inputAutoFilledSyncExt = "";
        this.LLLLIIIILLL = "";
        this.LLLLIIL = "";
        this.LLLLIL = UUID.randomUUID().toString();
        this.LLLLJI = new LinkedHashMap();
        this.extrasInfoMobParams = "";
        this.bizInfoExtra = "";
        this.LLLLLILLIL = -1;
        this.LLLLZLLLI = "";
        this.LLLZLL = 0L;
        this.LLLZLZ = "";
        this.LLLZZ = "";
        this.LLZLI = true;
        this.LLZLL = true;
        this.LLZLLIL = new LinkedHashMap();
        this.LLZZZIL = "";
        this.LLILZ = context;
        this.LLJJJIL = iMUser;
    }

    public EnterChatParams(Context context, int i, String str) {
        this.LLILZIL = "";
        this.LLILZLL = -1;
        this.LLIZLLLIL = "";
        this.LLJ = 1;
        this.LLJI = "";
        this.LLJILJIL = "";
        this.LLJILJILJ = "";
        this.LLLF = EnumC896490ZEx.NO_STATUS;
        this.LLLFF = "";
        this.LLLFZ = C13BV.INSTANCE;
        this.LLLI = "";
        this.LLLII = "";
        this.LLLILZ = "";
        this.LLLILZLLLI = "";
        this.LLLIZZ = "";
        this.LLLL = true;
        this.quickChatViewType = 1;
        this.inputAutoFillContent = "";
        this.inputAutoFilledSyncExt = "";
        this.LLLLIIIILLL = "";
        this.LLLLIIL = "";
        this.LLLLIL = UUID.randomUUID().toString();
        this.LLLLJI = new LinkedHashMap();
        this.extrasInfoMobParams = "";
        this.bizInfoExtra = "";
        this.LLLLLILLIL = -1;
        this.LLLLZLLLI = "";
        this.LLLZLL = 0L;
        this.LLLZLZ = "";
        this.LLLZZ = "";
        this.LLZLI = true;
        this.LLZLL = true;
        this.LLZLLIL = new LinkedHashMap();
        this.LLZZZIL = "";
        this.LLILZ = context;
        this.LLILZLL = i;
        this.LLILZIL = str;
    }
}
