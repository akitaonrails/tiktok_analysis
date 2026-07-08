package com.ss.android.ugc.aweme.im.common.model;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class IMSaasConversation extends BaseContact {
    public UrlModel conversationAvatar;
    public String conversationId;
    public int conversationMemberCount;
    public String conversationName;
    public long conversationShortId;
    public int conversationType;
    public String initialLetter;
    public boolean isActive;
    public List<String> memberIdList;

    public final UrlModel getConversationAvatar() {
        return this.conversationAvatar;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final int getConversationMemberCount() {
        return this.conversationMemberCount;
    }

    public final String getConversationName() {
        return this.conversationName;
    }

    public final long getConversationShortId() {
        return this.conversationShortId;
    }

    public final int getConversationType() {
        return this.conversationType;
    }

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public UrlModel getDisplayAvatar() {
        return this.conversationAvatar;
    }

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public String getDisplayName() {
        return this.conversationName;
    }

    public final String getInitialLetter() {
        return this.initialLetter;
    }

    public final List<String> getMemberIdList() {
        return this.memberIdList;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final void setConversationAvatar(UrlModel urlModel) {
        this.conversationAvatar = urlModel;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setConversationMemberCount(int i) {
        this.conversationMemberCount = i;
    }

    public final void setConversationName(String str) {
        this.conversationName = str;
    }

    public final void setConversationShortId(long j) {
        this.conversationShortId = j;
    }

    public final void setConversationType(int i) {
        this.conversationType = i;
    }

    public final void setInitialLetter(String str) {
        this.initialLetter = str;
    }

    public final void setMemberIdList(List<String> list) {
        this.memberIdList = list;
    }
}
