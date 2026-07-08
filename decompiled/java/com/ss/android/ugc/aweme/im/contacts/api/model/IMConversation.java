package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C1368220li0;
import X.C2188811AlT;
import X.EnumC1369370ljr;
import X.InterfaceC1381610m3b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class IMConversation extends IMContact implements InterfaceC1381610m3b {
    public UrlModel conversationAvatar;
    public String conversationId;
    public int conversationMemberCount;
    public String conversationName;
    public long conversationShortId;
    public int conversationType;
    public String initialLetter;
    public boolean isActive;
    public List<String> memberIdList;
    public String nickName;
    public transient C1368220li0 primaryMatchMeta;
    public final transient EnumC1369370ljr relationship = EnumC1369370ljr.GROUP_CHAT;
    public transient Map<Integer, C1368220li0> allMatchMeta = new LinkedHashMap();

    public int hashCode() {
        String str = this.conversationId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMConversation{mConversationType=");
        sbLIZ.append(this.conversationType);
        sbLIZ.append(", mConversationId='");
        sbLIZ.append(this.conversationId);
        sbLIZ.append("', mConversationName='");
        sbLIZ.append(this.conversationName);
        sbLIZ.append("', mConversationMemberCount=");
        sbLIZ.append(this.conversationMemberCount);
        sbLIZ.append(", mConversationAvatar=");
        sbLIZ.append(this.conversationAvatar);
        sbLIZ.append(", relationListItemType=");
        sbLIZ.append(this.relationListItemType);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1381610m3b
    public Map<Integer, C1368220li0> getAllMatchMeta() {
        return this.allMatchMeta;
    }

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

    @Override // X.InterfaceC1381610m3b
    public String getItemId() {
        return this.conversationId;
    }

    public final List<String> getMemberIdList() {
        return this.memberIdList;
    }

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public String getNickName() {
        return this.conversationName;
    }

    @Override // X.InterfaceC1381610m3b
    public C1368220li0 getPrimaryMatchMeta() {
        return this.primaryMatchMeta;
    }

    @Override // X.InterfaceC1381610m3b
    public EnumC1369370ljr getRelationship() {
        return this.relationship;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMConversation)) {
            return false;
        }
        String str = this.conversationId;
        String str2 = ((IMConversation) obj).conversationId;
        if (str != null) {
            return Intrinsics.LJFF(str, str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1381610m3b
    public String getSearchDimension(int i) {
        if (i == 3) {
            return getDisplayName();
        }
        return null;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    @Override // X.InterfaceC1381610m3b
    public void setAllMatchMeta(Map<Integer, C1368220li0> map) {
        this.allMatchMeta = map;
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

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public void setNickName(String str) {
        this.nickName = str;
    }

    @Override // X.InterfaceC1381610m3b
    public void setPrimaryMatchMeta(C1368220li0 c1368220li0) {
        this.primaryMatchMeta = c1368220li0;
    }
}
