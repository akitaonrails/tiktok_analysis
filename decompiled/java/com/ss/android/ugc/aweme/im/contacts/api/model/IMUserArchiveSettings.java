package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class IMUserArchiveSettings implements Serializable {

    @C09CT("archive_inactive_chats")
    public final Boolean autoArchiveInactiveConversation;

    @C09CT("keep_chats_archived")
    public final Boolean keepConversationsArchived;

    public IMUserArchiveSettings() {
        this(null, null);
    }

    public final IMUserArchiveSettings copy(Boolean bool, Boolean bool2) {
        return new IMUserArchiveSettings(bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMUserArchiveSettings)) {
            return false;
        }
        IMUserArchiveSettings iMUserArchiveSettings = (IMUserArchiveSettings) obj;
        return Intrinsics.LJFF(this.keepConversationsArchived, iMUserArchiveSettings.keepConversationsArchived) && Intrinsics.LJFF(this.autoArchiveInactiveConversation, iMUserArchiveSettings.autoArchiveInactiveConversation);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMUserArchiveSettings(keepConversationsArchived=");
        sbLIZ.append(this.keepConversationsArchived);
        sbLIZ.append(", autoArchiveInactiveConversation=");
        sbLIZ.append(this.autoArchiveInactiveConversation);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMUserArchiveSettings(Boolean bool, Boolean bool2) {
        this.keepConversationsArchived = bool;
        this.autoArchiveInactiveConversation = bool2;
    }
}
