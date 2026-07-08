package com.ss.android.ugc.aweme.framework.services;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes26.dex */
public final class StickerTagChangeData {
    public final String panel;
    public final String tabId;
    public final String tabKey;
    public final String tabName;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerTagChangeData(panel=");
        sbLIZ.append(this.panel);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.tabName);
        sbLIZ.append(", tabKey=");
        sbLIZ.append(this.tabKey);
        sbLIZ.append(", tabId=");
        sbLIZ.append(this.tabId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StickerTagChangeData(String str, String str2, String str3, String str4) {
        this.panel = str;
        this.tabName = str2;
        this.tabKey = str3;
        this.tabId = str4;
    }
}
