package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C1367060lg8;
import X.C1367140lgG;
import X.C1368220li0;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public abstract class IMContact extends BaseContact {
    public static final C1367060lg8 Companion = new Object() { // from class: X.0lg8
    };
    public transient String bizLabel;
    public int disabledOnSharePanelReasonCode;
    public transient String invitedEventId;
    public boolean isAtLastInSharePanel;
    public int isRecentContact;
    public int isRecentTop5Contact;
    public transient boolean isShareSuccess;
    public boolean isStickTop;
    public transient C1368220li0 primaryMatchMetaCopy;
    public transient String shareRelationType;
    public transient int displayPosition = -1;
    public transient C1367140lgG info = new C1367140lgG();
    public final transient Map<Integer, C1368220li0> allMatchMetaCopy = new LinkedHashMap();

    public final Map<Integer, C1368220li0> getAllMatchMetaCopy() {
        return this.allMatchMetaCopy;
    }

    public final String getBizLabel() {
        return this.bizLabel;
    }

    public final int getDisabledOnSharePanelReasonCode() {
        return this.disabledOnSharePanelReasonCode;
    }

    public final C1367140lgG getInfo() {
        return this.info;
    }

    public final String getInvitedEventId() {
        return this.invitedEventId;
    }

    public final C1368220li0 getPrimaryMatchMetaCopy() {
        return this.primaryMatchMetaCopy;
    }

    public final String getShareRelationType() {
        return this.shareRelationType;
    }

    public final int getType() {
        return this.relationListItemType;
    }

    public final boolean isAtLastInSharePanel() {
        return this.isAtLastInSharePanel;
    }

    public final int isRecentContact() {
        return this.isRecentContact;
    }

    public final int isRecentTop5Contact() {
        return this.isRecentTop5Contact;
    }

    public final boolean isShareSuccess() {
        return this.isShareSuccess;
    }

    public final boolean isStickTop() {
        return this.isStickTop;
    }

    public final void setAtLastInSharePanel(boolean z) {
        this.isAtLastInSharePanel = z;
    }

    public final void setBizLabel(String str) {
        this.bizLabel = str;
    }

    public final void setDisabledOnSharePanelReasonCode(int i) {
        this.disabledOnSharePanelReasonCode = i;
    }

    public final void setInfo(C1367140lgG c1367140lgG) {
        this.info = c1367140lgG;
    }

    public final void setInvitedEventId(String str) {
        this.invitedEventId = str;
    }

    public final void setPrimaryMatchMetaCopy(C1368220li0 c1368220li0) {
        this.primaryMatchMetaCopy = c1368220li0;
    }

    public final void setRecentContact(int i) {
        this.isRecentContact = i;
    }

    public final void setRecentTop5Contact(int i) {
        this.isRecentTop5Contact = i;
    }

    public final void setShareRelationType(String str) {
        this.shareRelationType = str;
    }

    public final void setShareSuccess(boolean z) {
        this.isShareSuccess = z;
    }

    public final void setStickTop(boolean z) {
        this.isStickTop = z;
    }

    public final void setType(int i) {
        this.relationListItemType = i;
    }
}
