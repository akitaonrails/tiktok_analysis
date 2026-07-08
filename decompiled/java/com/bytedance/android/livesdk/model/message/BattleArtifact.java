package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.match.VirtualTicketEnvelopeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class BattleArtifact {

    @C09CT("artifact_type")
    public int artifactType;

    @C09CT("use_virtual_ticket")
    public BattleArtifactUseVirtualTicketInfo useVirtualTicket;

    @C09CT("virtual_ticket_envelope_rush_out_notice")
    public VirtualTicketEnvelopeRushOutNotice virtualTicketEnvelopeRushOutNotice;

    @C09CT("virtual_ticket_envelope_send_notice")
    public VirtualTicketEnvelopeInfo virtualTicketEnvelopeSendNotice;
}
