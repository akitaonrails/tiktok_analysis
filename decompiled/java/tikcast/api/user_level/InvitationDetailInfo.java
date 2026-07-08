package tikcast.api.user_level;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class InvitationDetailInfo {

    @C09CT("invitation_template_id")
    public String invitationTemplateId = "";

    @C09CT("invitation_phases")
    public List<InvitationPhaseItem> invitationPhases = new ArrayList();

    @C09CT("invitation_list")
    public List<Invitation> invitationList = new ArrayList();
}
