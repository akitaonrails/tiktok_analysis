package com.bytedance.android.livesdk.comp.api.linkcore.model;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import java.util.List;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class ReplyResult {
    public final OnLineMicInfo inviteeFixedMicInfo;
    public final String inviteeLinkMicId;
    public final boolean isPreApproved;
    public final String logId;
    public final BizReplyResponse multiGuestRespExtra;
    public final List<SpotInfo> spotList;

    public ReplyResult(String str, OnLineMicInfo onLineMicInfo, BizReplyResponse bizReplyResponse, String str2, List<SpotInfo> list, boolean z) {
        this.inviteeLinkMicId = str;
        this.inviteeFixedMicInfo = onLineMicInfo;
        this.multiGuestRespExtra = bizReplyResponse;
        this.logId = str2;
        this.spotList = list;
        this.isPreApproved = z;
    }
}
