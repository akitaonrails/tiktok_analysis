package com.bytedance.android.livesdk.subscribe.model.invite;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SubInvitationEntrance {

    @C09CT("be_invited")
    public boolean beInvited;

    @C09CT("entrance_prompts")
    public List<SubInvitationEntrancePrompt> entrancePrompt;

    @C09CT("has_entrance")
    public boolean hasInvitationEntrance;

    @C09CT("invitation_status")
    public int invitationStatus;

    @C09CT("switcher")
    public SubInvitationFunctionSwitcher switcher;
}
