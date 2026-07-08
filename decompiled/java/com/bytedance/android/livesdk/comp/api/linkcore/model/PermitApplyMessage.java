package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import java.util.List;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class PermitApplyMessage {
    public final OnLineMicInfo applicantFixedMicInfo;
    public final LinkUser applier;
    public final LinkUser approver;
    public final CustomLinkMessage customMessage;
    public final LayoutDSLConfig layoutDSLConfig;
    public final int permitStatus;
    public final List<SpotInfo> spotList;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PermitApplyMessage(approver=");
        sbLIZ.append(this.approver);
        sbLIZ.append(", permitStatus=");
        sbLIZ.append(this.permitStatus);
        sbLIZ.append(", applicantFixedMicInfo=");
        sbLIZ.append(this.applicantFixedMicInfo);
        sbLIZ.append(", layoutDSLConfig=");
        sbLIZ.append(this.layoutDSLConfig);
        sbLIZ.append(", customMessage=");
        sbLIZ.append(this.customMessage);
        sbLIZ.append(", applier=");
        sbLIZ.append(this.applier);
        sbLIZ.append(", spotList=");
        sbLIZ.append(this.spotList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PermitApplyMessage(LinkUser linkUser, int i, OnLineMicInfo onLineMicInfo, LayoutDSLConfig layoutDSLConfig, CustomLinkMessage customLinkMessage, LinkUser linkUser2, List<SpotInfo> list) {
        this.approver = linkUser;
        this.permitStatus = i;
        this.applicantFixedMicInfo = onLineMicInfo;
        this.layoutDSLConfig = layoutDSLConfig;
        this.customMessage = customLinkMessage;
        this.applier = linkUser2;
        this.spotList = list;
    }
}
