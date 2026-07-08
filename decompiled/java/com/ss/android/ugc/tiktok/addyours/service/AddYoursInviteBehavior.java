package com.ss.android.ugc.tiktok.addyours.service;

import X.C1554610qYd;
import X.C1554960qZC;
import X.C1697810uHb;
import X.C197039127h;
import X.C2752014s;
import X.C817250W4d;
import X.InterfaceC1364105Vn;
import X.InterfaceC330080Cwo;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.tiktok.addyours.mob.invite.EnterAddYoursInvitePanelProvider;
import com.ss.android.ugc.tiktok.addyours.mob.invite.IAddYoursInviteEventProtocol;
import com.ss.android.ugc.tiktok.addyours.mob.invite.SelectAddYoursInviteeProvider;
import com.ss.android.ugc.tiktok.addyours.mob.invite.SendAddYoursInvitationInviteeProvider;
import com.ss.android.ugc.tiktok.addyours.mob.invite.SendAddYoursInvitationProvider;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS127S0110000_9;
import kotlin.jvm.internal.AwS1S1220000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS92S0210000_9;

/* JADX INFO: loaded from: classes10.dex */
public class AddYoursInviteBehavior implements InterfaceC330080Cwo {
    public Map<String, ? extends Object> LL;

    public final Map<String, Object> LIZ() {
        Map<String, ? extends Object> map = this.LL;
        if (map != null) {
            return map;
        }
        return null;
    }

    @Override // X.InterfaceC330080Cwo
    public void initExtra(Map<String, ? extends Object> map) {
        this.LL = map;
    }

    @Override // X.InterfaceC330080Cwo
    public void initScope(InterfaceC665370Q7z interfaceC665370Q7z) {
        String string;
        String string2;
        String string3;
        String string4;
        C1554610qYd.LIZJ(interfaceC665370Q7z, IAddYoursInviteEventProtocol.class, C1697810uHb.LJIILJJIL(new EnterAddYoursInvitePanelProvider(interfaceC665370Q7z)));
        C1554610qYd.LIZJ(interfaceC665370Q7z, IAddYoursInviteEventProtocol.class, C1697810uHb.LJIILJJIL(new SelectAddYoursInviteeProvider(interfaceC665370Q7z)));
        C1554610qYd.LIZJ(interfaceC665370Q7z, IAddYoursInviteEventProtocol.class, C1697810uHb.LJIILJJIL(new SendAddYoursInvitationProvider(interfaceC665370Q7z)));
        C1554610qYd.LIZJ(interfaceC665370Q7z, IAddYoursInviteEventProtocol.class, C1697810uHb.LJIILJJIL(new SendAddYoursInvitationInviteeProvider(interfaceC665370Q7z)));
        Object obj = LIZ().get("topic_id");
        String string5 = null;
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        Object obj2 = LIZ().get("extra_topic_title");
        if (obj2 != null) {
            string2 = obj2.toString();
        } else {
            string2 = null;
        }
        Object obj3 = LIZ().get("enter_from");
        if (obj3 != null) {
            string3 = obj3.toString();
        } else {
            string3 = null;
        }
        Object obj4 = LIZ().get("enter_method");
        if (obj4 != null) {
            string4 = obj4.toString();
        } else {
            string4 = null;
        }
        Object obj5 = LIZ().get("extra_previous_page");
        if (obj5 != null) {
            string5 = obj5.toString();
        }
        C1554960qZC.LIZ(interfaceC665370Q7z, new C2752014s(string3, string4, string5, string, string2), C2752014s.class, "source_default_key");
    }

    @Override // X.InterfaceC330080Cwo
    public void mobEnter(Context context, InterfaceC665370Q7z interfaceC665370Q7z) {
        C817250W4d.LIZIZ(context, "enter_add_yours_invite_panel", new AwS553S0100000_9(this, 1643), new AwS553S0100000_9(interfaceC665370Q7z, 1642));
    }

    @Override // X.InterfaceC330080Cwo
    public void onSelectionChange(List<UserInvitee> list, View view) {
        C197039127h c197039127h;
        CharSequence text = null;
        if ((view instanceof C197039127h) && (c197039127h = (C197039127h) view) != null) {
            Resources resources = c197039127h.getResources();
            if (resources != null) {
                text = resources.getText(2131846775);
            }
            c197039127h.setText(text);
            c197039127h.setEnabled(true);
        }
    }

    @Override // X.InterfaceC330080Cwo
    public void mobInviteButtonClicked(Context context, InterfaceC665370Q7z interfaceC665370Q7z, boolean z, List<UserInvitee> list) {
        C817250W4d.LIZIZ(context, "send_add_yours_invitation", new AwS92S0210000_9((List) list, (List<UserInvitee>) z, (boolean) this, (AddYoursInviteBehavior) 1), new AwS127S0110000_9(interfaceC665370Q7z, z, 17));
    }

    @Override // X.InterfaceC330080Cwo
    public Object onSelected(Fragment fragment, List<UserInvitee> list, List<UserInvitee> list2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    @Override // X.InterfaceC330080Cwo
    public void mobSelectChange(Context context, InterfaceC665370Q7z interfaceC665370Q7z, boolean z, UserInvitee userInvitee, String str, boolean z2) {
        C817250W4d.LIZIZ(context, "select_add_yours_invitee", new AwS1S1220000_9(z, this, userInvitee, z2, str, 1), new AwS1S1220000_9(interfaceC665370Q7z, z, userInvitee, z2, str, 0));
    }
}
