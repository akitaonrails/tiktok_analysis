package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes16.dex */
public final class ApplyMessage {
    public final LinkUser applicant;
    public final CustomLinkMessage customMessage;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplyMessage(applicant=");
        sbLIZ.append(this.applicant);
        sbLIZ.append(", customMessage=");
        sbLIZ.append(this.customMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ApplyMessage(LinkUser linkUser, CustomLinkMessage customLinkMessage) {
        this.applicant = linkUser;
        this.customMessage = customLinkMessage;
    }
}
