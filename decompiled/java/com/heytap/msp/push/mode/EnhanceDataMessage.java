package com.heytap.msp.push.mode;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public class EnhanceDataMessage extends BaseMode {
    public String mAppPackage;
    public String mContent;
    public String mMessageID;
    public int mMessageType;

    public EnhanceDataMessage(String str, String str2, String str3, int i) {
        this.mAppPackage = str;
        this.mMessageID = str2;
        this.mContent = str3;
        this.mMessageType = i;
    }

    public String getAppPackage() {
        return this.mAppPackage;
    }

    public String getContent() {
        return this.mContent;
    }

    public String getMessageID() {
        return this.mMessageID;
    }

    public int getMessageType() {
        return this.mMessageType;
    }

    @Override // com.heytap.msp.push.mode.BaseMode
    public int getType() {
        return 4117;
    }

    public void setAppPackage(String str) {
        this.mAppPackage = str;
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    public void setMessageID(String str) {
        this.mMessageID = str;
    }

    public void setMessageType(int i) {
        this.mMessageType = i;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnhanceDataMessage{mAppPackage='");
        sbLIZ.append(this.mAppPackage);
        sbLIZ.append('\'');
        sbLIZ.append(", mMessageID='");
        sbLIZ.append(this.mMessageID);
        sbLIZ.append('\'');
        sbLIZ.append(", mContent='");
        sbLIZ.append(this.mContent);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
