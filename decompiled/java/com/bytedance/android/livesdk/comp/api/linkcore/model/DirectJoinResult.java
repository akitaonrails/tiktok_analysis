package com.bytedance.android.livesdk.comp.api.linkcore.model;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectResponse;
import java.util.List;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes.dex */
public final class DirectJoinResult {
    public final BizJoinDirectResponse joinDirectResp;
    public final List<SpotInfo> spotList;

    public DirectJoinResult(BizJoinDirectResponse bizJoinDirectResponse, List<SpotInfo> list) {
        this.joinDirectResp = bizJoinDirectResponse;
        this.spotList = list;
    }
}
