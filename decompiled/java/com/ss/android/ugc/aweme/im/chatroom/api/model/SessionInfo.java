package com.ss.android.ugc.aweme.im.chatroom.api.model;

import X.C09CT;
import X.C0Y8T;
import X.C0Y8Y;
import X.C0YSQ;
import X.C1191204lK;
import X.C123100dR;
import X.C13BV;
import X.C869590Y9l;
import X.C892110YzB;
import X.C893600Z3u;
import X.C912520Zr0;
import X.InterfaceC876950Yaj;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class SessionInfo implements Serializable {
    public final String LL;
    public Long LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public Boolean LLJILJILJ;
    public int LLJILLL;
    public C893600Z3u LLJJIJI;
    public boolean LLJJIJIL;
    public boolean LLJJJIL;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public C892110YzB LLJLIL;
    public long LLJLILLLLZIIL;
    public long LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public C912520Zr0 LLJZ;
    public String LLJZIJLIL;
    public Integer LLL;
    public Map<String, String> LLLF;
    public Map<String, String> LLLFF;
    public boolean LLLFFI;
    public List<String> LLLFZ;
    public Map<String, String> LLLI;
    public boolean LLLII;
    public Long LLLIIII;
    public Long LLLIIL;
    public C869590Y9l LLLIILIL;
    public List<String> LLLIL;
    public String LLLILZ;
    public String LLLILZJ;
    public String LLLILZLLLI;
    public String LLLIZZ;
    public boolean LLLL;
    public int LLLLII;
    public Map<String, String> LLLLIILL;
    public transient JSONObject LLLLILI;
    public Integer LLLLJI;
    public boolean LLLLL;
    public boolean LLLLLIL;
    public boolean LLLLLILLIL;
    public PreviewConfig LLLLLJIL;
    public boolean LLLLLJLJLL;
    public boolean LLLLLL;

    @C09CT("auto_quoted_message_content_info_dict")
    public String autoQuotedMessageContentInfoMap;

    @C09CT("input_auto_filled_awe_type")
    public int inputAutoFilledAweType;

    @C09CT("input_auto_filled_sync_ext")
    public String inputAutoFilledSyncExt;

    @C09CT("input_expand_full_screen")
    public boolean quickChatInputCanExpandFullScreen;
    public String LLILLJJLI = "";
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public String LLJ = "";
    public String LLJJ = "";
    public String LLJJI = "";
    public String LLJJIII = "";
    public String LLJJIJIIJIL = "";
    public List<Long> LLJJJ = C13BV.INSTANCE;
    public int LLJJJJ = -1;
    public String LLLIIIIL = "";
    public final C1191204lK LLLIIIL = new C1191204lK();
    public int LLLJ = 1;
    public String LLLJIL = "";
    public int LLLJL = 1;
    public boolean LLLLIIIILLL = true;
    public String LLLLIIL = "";
    public boolean LLLLIILLL = true;
    public boolean LLLLIL = true;

    @C09CT("biz_info_extra")
    public String bizInfoExtra = "";

    @C09CT("input_auto_filled_content")
    public String inputAutoFillContent = "";
    public String LLLLJ = "";

    public static /* synthetic */ void getChatType$annotations() {
    }

    public static /* synthetic */ void getEnterFrom$annotations() {
    }

    public IMUser getSingleChatFromUser() {
        return null;
    }

    public String getSingleChatFromUserId() {
        return null;
    }

    public final boolean fromSpecialEntrance() {
        return this.LLLJ > 1;
    }

    public final JSONObject getBizInfoExtraMap() {
        if (this.LLLLILI == null && C123100dR.LIZ(this.bizInfoExtra)) {
            try {
                this.LLLLILI = new JSONObject(this.bizInfoExtra);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return this.LLLLILI;
    }

    public final String getTrafficTypeForMob() {
        if (C123100dR.LIZ(this.LLLJIL)) {
            return this.LLLJIL;
        }
        return null;
    }

    public final boolean hasChatHistory() {
        int i = this.LLJJJJ;
        return i > 0 && i != 15;
    }

    public final boolean isAuthorSupporterChat() {
        return this.LLILZIL == 4;
    }

    public final boolean isBotChat() {
        return this.LLILZIL == 5;
    }

    public final boolean isEnterpriseChat() {
        return this.LLILZIL == 2;
    }

    public final boolean isFriendChat() {
        return this.LLILZIL == 0;
    }

    public final boolean isFromLeadDmAdEntrance() {
        return this.LLLJ == 2;
    }

    public final boolean isFromSearch() {
        return this.LLLIIII != null;
    }

    public final boolean isGroupChat() {
        return this.LLILZIL == 3;
    }

    public final boolean isMessageRequest() {
        return this.LLILZIL == 1;
    }

    public final boolean isPreviewMode() {
        return this.LLLLLJIL != null;
    }

    public final boolean isSingleChat() {
        int i = this.LLILZIL;
        return i == 0 || i == 1 || i == 2 || i == 4 || i == 5;
    }

    public final boolean isCreatedByOrFromLeadDmAdEntrance() {
        C0Y8Y coreInfo;
        Map<String, String> ext;
        String str;
        if (isFromLeadDmAdEntrance()) {
            return true;
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLILLJJLI);
        return (c0y8tLIZ == null || (coreInfo = c0y8tLIZ.getCoreInfo()) == null || (ext = coreInfo.getExt()) == null || (str = ext.get("a:interacted")) == null || !a0.LJJIIZI(str, "ad:", false)) ? false : true;
    }

    public final String getAppLaunchFrom() {
        return this.LLLILZLLLI;
    }

    public final String getAuthorId() {
        return this.LLJJI;
    }

    public final String getAutoQuotedMessageContentInfoMap() {
        return this.autoQuotedMessageContentInfoMap;
    }

    public final List<String> getAutoSendMessageContent() {
        return this.LLLFZ;
    }

    public final Map<String, String> getAutoSendMessageExtra() {
        return this.LLLI;
    }

    public final String getBizInfoExtra() {
        return this.bizInfoExtra;
    }

    public final Map<String, String> getBotQueryRequestExtra() {
        return this.LLLF;
    }

    public final Map<String, String> getBotSendParams() {
        return this.LLLFF;
    }

    public final int getChatType() {
        return this.LLILZIL;
    }

    public final C892110YzB getClickOutPushParams() {
        return this.LLJLIL;
    }

    public final String getCollabUserType() {
        return this.LLLIZZ;
    }

    public final String getConversationId() {
        return this.LLILLJJLI;
    }

    public final int getDefaultMsgSelectedNum() {
        return this.LLJJJJJIL;
    }

    public final String getDefaultOpenPanelType() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final boolean getDisableLandingMessage() {
        return this.LLLLLILLIL;
    }

    public final boolean getDisableLocateMsgWhenEnter() {
        return this.LLLFFI;
    }

    public final C1191204lK getDynamicCardEventTrackingHelper() {
        return this.LLLIIIL;
    }

    public final List<String> getEffectIds() {
        return this.LLLIL;
    }

    public final int getEnterFrom() {
        return this.LLILZLL;
    }

    public final String getEnterFromForMob() {
        return this.LLIZ;
    }

    public final String getEnterMethod() {
        return this.LLJJ;
    }

    public final String getEntrancePageForMob() {
        return this.LLIZLLLIL;
    }

    public final int getEntranceType() {
        return this.LLLJ;
    }

    public final Map<String, String> getExtraMobParams() {
        return this.LLLLIILL;
    }

    public final String getExtrasInfoMobParams() {
        return this.LLLLIIL;
    }

    public final Integer getFollowStatusRelation() {
        return this.LLL;
    }

    public final boolean getForbidSugQuestionPanel() {
        return this.LLLLLIL;
    }

    public final String getGroupId() {
        return this.LLJJIII;
    }

    public final Boolean getImSearchNeedBounce() {
        return this.LLJILJILJ;
    }

    public final String getInboxSearchCellType() {
        return this.LLJIJIL;
    }

    public final String getInboxSearchPosition() {
        return this.LLJI;
    }

    public final String getInboxSearchTabName() {
        return this.LLJILJIL;
    }

    public final int getInnerPushType() {
        return this.LLJLLIL;
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
        return this.LLLLII;
    }

    public final int getLastMessageMsgType() {
        return this.LLJJJJ;
    }

    public final List<Long> getLastMsgReadersWhenEnterChatRoom() {
        return this.LLJJJ;
    }

    public final String getLastMsgUUIdWhenEnterChatRoom() {
        return this.LLJJIJIIJIL;
    }

    public final Long getLastReadIndexSnapshot() {
        return this.LLILLL;
    }

    public final String getMatchedKeyword() {
        return this.LLLIIIIL;
    }

    public final long getMsgIdFromInAppPush() {
        return this.LLJLL;
    }

    public final long getMsgIdFromPush() {
        return this.LLJLILLLLZIIL;
    }

    public final String getOutPushLabel() {
        return this.LLLILZJ;
    }

    public final String getPanelSourceForMob() {
        return this.LLJ;
    }

    public final String getPositionForMob() {
        return this.LLLLJ;
    }

    public final PreviewConfig getPreviewConfig() {
        return this.LLLLLJIL;
    }

    public final String getPushLabel() {
        return this.LLLILZ;
    }

    public final C893600Z3u getPushReferenceInfo() {
        return this.LLJJIJI;
    }

    public final boolean getQuickChatCanExpandFullScreen() {
        return this.LLLLIIIILLL;
    }

    public final boolean getQuickChatInputCanExpandFullScreen() {
        return this.quickChatInputCanExpandFullScreen;
    }

    public final int getQuickChatViewType() {
        return this.LLLJL;
    }

    public final C912520Zr0 getReportParams() {
        return this.LLJZ;
    }

    public final Long getScrollToMsgId() {
        return this.LLLIIL;
    }

    public final String getSearchId() {
        return this.LLJZIJLIL;
    }

    public final Long getSearchTargetIndex() {
        return this.LLLIIII;
    }

    public final boolean getShowKeyBoardByDefault() {
        return this.LLJJJJLIIL;
    }

    public final boolean getShowSafeConversationAfterKeyboardDismiss() {
        return this.LLJJL;
    }

    public final boolean getShowTitleBar() {
        return this.LLLLIILLL;
    }

    public final Integer getSiteId() {
        return this.LLLLJI;
    }

    public final C869590Y9l getStoryViewerListReplyMsg() {
        return this.LLLIILIL;
    }

    public final String getTrafficType() {
        return this.LLLJIL;
    }

    public final int getUnreadCount() {
        return this.LLJILLL;
    }

    public final String getUuid() {
        return this.LL;
    }

    public final boolean isChatroomAnalyticsBlocked() {
        return this.LLLLLL;
    }

    public final boolean isChatroomInteractionBlocked() {
        return this.LLLLLJLJLL;
    }

    public final boolean isDissolvedGroup() {
        return this.LLLII;
    }

    public final boolean isFromNewFollow() {
        return this.LLLLL;
    }

    public final boolean isFullScreen() {
        return this.LLLLIL;
    }

    public final boolean isHighRiskConversation() {
        return this.LLJL;
    }

    public final boolean isLastMsgAllReadWhenEnterChatRoom() {
        return this.LLJJIJIL;
    }

    public final boolean isMediaMsgMasking() {
        return this.LLJLLL;
    }

    public final boolean isNewGroupChat() {
        return this.LLLL;
    }

    public final boolean isQuickChat() {
        return this.LLJJJIL;
    }

    public final boolean isReportPage() {
        return this.LLILZ;
    }

    public SessionInfo(String str) {
        this.LL = str;
    }

    public final void setAppLaunchFrom(String str) {
        this.LLLILZLLLI = str;
    }

    public final void setAuthorId(String str) {
        this.LLJJI = str;
    }

    public final void setAutoQuotedMessageContentInfoMap(String str) {
        this.autoQuotedMessageContentInfoMap = str;
    }

    public final void setAutoSendMessageContent(List<String> list) {
        this.LLLFZ = list;
    }

    public final void setAutoSendMessageExtra(Map<String, String> map) {
        this.LLLI = map;
    }

    public final void setBizInfoExtra(String str) {
        this.bizInfoExtra = str;
    }

    public final void setBizInfoExtraMap(JSONObject jSONObject) {
        this.LLLLILI = jSONObject;
    }

    public final void setBotQueryRequestExtra(Map<String, String> map) {
        this.LLLF = map;
    }

    public final void setBotSendParams(Map<String, String> map) {
        this.LLLFF = map;
    }

    public final void setChatType(int i) {
        this.LLILZIL = i;
    }

    public final void setChatroomAnalyticsBlocked(boolean z) {
        this.LLLLLL = z;
    }

    public final void setChatroomInteractionBlocked(boolean z) {
        this.LLLLLJLJLL = z;
    }

    public final void setClickOutPushParams(C892110YzB c892110YzB) {
        this.LLJLIL = c892110YzB;
    }

    public final void setCollabUserType(String str) {
        this.LLLIZZ = str;
    }

    public final void setConversationId(String str) {
        Long lValueOf;
        try {
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
            if (c0y8tLIZ != null) {
                lValueOf = Long.valueOf(c0y8tLIZ.getReadIndex());
            } else {
                lValueOf = null;
            }
            this.LLILLL = lValueOf;
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLILLJJLI = str;
    }

    public final void setDefaultMsgSelectedNum(int i) {
        this.LLJJJJJIL = i;
    }

    public final void setDefaultOpenPanelType(String str) {
        this.LLJJLIIIJLLLLLLLZ = str;
    }

    public final void setDisableLandingMessage(boolean z) {
        this.LLLLLILLIL = z;
    }

    public final void setDisableLocateMsgWhenEnter(boolean z) {
        this.LLLFFI = z;
    }

    public final void setDissolvedGroup(boolean z) {
        this.LLLII = z;
    }

    public final void setEffectIds(List<String> list) {
        this.LLLIL = list;
    }

    public final void setEnterFrom(int i) {
        this.LLILZLL = i;
    }

    public final void setEnterFromForMob(String str) {
        this.LLIZ = str;
    }

    public final void setEnterMethod(String str) {
        this.LLJJ = str;
    }

    public final void setEntrancePageForMob(String str) {
        this.LLIZLLLIL = str;
    }

    public final void setEntranceType(int i) {
        this.LLLJ = i;
    }

    public final void setExtraMobParams(Map<String, String> map) {
        this.LLLLIILL = map;
    }

    public final void setExtrasInfoMobParams(String str) {
        this.LLLLIIL = str;
    }

    public final void setFollowStatusRelation(Integer num) {
        this.LLL = num;
    }

    public final void setForbidSugQuestionPanel(boolean z) {
        this.LLLLLIL = z;
    }

    public final void setFromNewFollow(boolean z) {
        this.LLLLL = z;
    }

    public final void setFullScreen(boolean z) {
        this.LLLLIL = z;
    }

    public final void setGroupId(String str) {
        this.LLJJIII = str;
    }

    public final void setHighRiskConversation(boolean z) {
        this.LLJL = z;
    }

    public final void setImSearchNeedBounce(Boolean bool) {
        this.LLJILJILJ = bool;
    }

    public final void setInboxSearchCellType(String str) {
        this.LLJIJIL = str;
    }

    public final void setInboxSearchPosition(String str) {
        this.LLJI = str;
    }

    public final void setInboxSearchTabName(String str) {
        this.LLJILJIL = str;
    }

    public final void setInnerPushType(int i) {
        this.LLJLLIL = i;
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
        this.LLLLII = i;
    }

    public final void setLastMessageMsgType(int i) {
        this.LLJJJJ = i;
    }

    public final void setLastMsgAllReadWhenEnterChatRoom(boolean z) {
        this.LLJJIJIL = z;
    }

    public final void setLastMsgReadersWhenEnterChatRoom(List<Long> list) {
        this.LLJJJ = list;
    }

    public final void setLastMsgUUIdWhenEnterChatRoom(String str) {
        this.LLJJIJIIJIL = str;
    }

    public final void setLastReadIndexSnapshot(Long l) {
        this.LLILLL = l;
    }

    public final void setMatchedKeyword(String str) {
        this.LLLIIIIL = str;
    }

    public final void setMediaMsgMasking(boolean z) {
        this.LLJLLL = z;
    }

    public final void setMsgIdFromInAppPush(long j) {
        this.LLJLL = j;
    }

    public final void setMsgIdFromPush(long j) {
        this.LLJLILLLLZIIL = j;
    }

    public final void setNewGroupChat(boolean z) {
        this.LLLL = z;
    }

    public final void setOutPushLabel(String str) {
        this.LLLILZJ = str;
    }

    public final void setPanelSourceForMob(String str) {
        this.LLJ = str;
    }

    public final void setPositionForMob(String str) {
        this.LLLLJ = str;
    }

    public final void setPreviewConfig(PreviewConfig previewConfig) {
        this.LLLLLJIL = previewConfig;
    }

    public final void setPushLabel(String str) {
        this.LLLILZ = str;
    }

    public final void setPushReferenceInfo(C893600Z3u c893600Z3u) {
        this.LLJJIJI = c893600Z3u;
    }

    public final void setQuickChat(boolean z) {
        this.LLJJJIL = z;
    }

    public final void setQuickChatCanExpandFullScreen(boolean z) {
        this.LLLLIIIILLL = z;
    }

    public final void setQuickChatInputCanExpandFullScreen(boolean z) {
        this.quickChatInputCanExpandFullScreen = z;
    }

    public final void setQuickChatViewType(int i) {
        this.LLLJL = i;
    }

    public final void setReportPage(boolean z) {
        this.LLILZ = z;
    }

    public final void setReportParams(C912520Zr0 c912520Zr0) {
        this.LLJZ = c912520Zr0;
    }

    public final void setScrollToMsgId(Long l) {
        this.LLLIIL = l;
    }

    public final void setSearchId(String str) {
        this.LLJZIJLIL = str;
    }

    public final void setSearchTargetIndex(Long l) {
        this.LLLIIII = l;
    }

    public final void setShowKeyBoardByDefault(boolean z) {
        this.LLJJJJLIIL = z;
    }

    public final void setShowSafeConversationAfterKeyboardDismiss(boolean z) {
        this.LLJJL = z;
    }

    public final void setShowTitleBar(boolean z) {
        this.LLLLIILLL = z;
    }

    public final void setSiteId(Integer num) {
        this.LLLLJI = num;
    }

    public final void setStoryViewerListReplyMsg(C869590Y9l c869590Y9l) {
        this.LLLIILIL = c869590Y9l;
    }

    public final void setTrafficType(String str) {
        this.LLLJIL = str;
    }

    public final void setUnreadCount(int i) {
        this.LLJILLL = i;
    }
}
