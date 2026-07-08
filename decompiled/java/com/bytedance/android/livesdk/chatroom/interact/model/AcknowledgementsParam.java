package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class AcknowledgementsParam {

    @C09CT("ack_type")
    public List<Integer> ackType = new ArrayList();

    @C09CT("playbook_guidance_extra")
    public PlaybookGuidanceExtra playbookGuidanceExtra;

    public static final class PlaybookGuidanceExtra {

        @C09CT("battle_id")
        public long battleId;
    }
}
