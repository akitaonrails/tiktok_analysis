package kotlin.jvm.internal;

import X.AbstractC207072161e;
import X.AbstractC848400XPy;
import X.C09AY;
import X.C0OD6;
import X.C0XQ7;
import X.C1554610qYd;
import X.C308560C7q;
import X.C817250W4d;
import X.InterfaceC1282004zy;
import X.InterfaceC665370Q7z;
import com.ss.android.tracker.event.EventParamsProtocol;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.tiktok.addyours.mob.invite.IAddYoursInviteEventProtocol;
import com.ss.android.ugc.tiktok.addyours.mob.invite.SelectAddYoursInviteeEvent;
import com.ss.android.ugc.tiktok.addyours.service.AddYoursInviteBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS1S1220000_9 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S1220000_9 awS1S1220000_9) {
        String str;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS1S1220000_9.l1;
        AbstractC207072161e abstractC207072161e = (AbstractC207072161e) SelectAddYoursInviteeEvent.class.newInstance();
        boolean z = false;
        List listLIZIZ = C1554610qYd.LIZIZ(interfaceC665370Q7z, IAddYoursInviteEventProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                InterfaceC1282004zy param = ((EventParamsProtocol) it2.next()).getParam();
                if (param != null) {
                    abstractC207072161e.LJII(param);
                }
            }
        }
        if ((abstractC207072161e instanceof SelectAddYoursInviteeEvent) && abstractC207072161e != null) {
            boolean z2 = awS1S1220000_9.z3;
            UserInvitee userInvitee = (UserInvitee) awS1S1220000_9.l2;
            boolean z3 = awS1S1220000_9.z4;
            String str2 = awS1S1220000_9.s0;
            if (z2) {
                str = "select";
            } else {
                str = "cancel";
            }
            abstractC207072161e.LJI(str, "action_type");
            abstractC207072161e.LJI(userInvitee.getUid(), "to_user_id");
            abstractC207072161e.LJI(Integer.valueOf(C308560C7q.LIZ(Boolean.valueOf(userInvitee.getInvited()))), "has_invited");
            abstractC207072161e.LJI(Integer.valueOf(C0OD6.LIZIZ(userInvitee.getFollowStatus(), userInvitee.getFollowerStatus())), "follow_status");
            if (z3 || Intrinsics.LJFF(str2, "search")) {
                z = true;
            }
            abstractC207072161e.LJI(C308560C7q.LIZIZ(Boolean.valueOf(z)), "is_search_result");
        }
        return abstractC207072161e;
    }

    public static final Object invoke$1(AwS1S1220000_9 awS1S1220000_9) {
        String str;
        String string;
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z2 = awS1S1220000_9.z3;
        AddYoursInviteBehavior addYoursInviteBehavior = (AddYoursInviteBehavior) awS1S1220000_9.l1;
        UserInvitee userInvitee = (UserInvitee) awS1S1220000_9.l2;
        boolean z3 = awS1S1220000_9.z4;
        String str2 = awS1S1220000_9.s0;
        if (z2) {
            str = "select";
        } else {
            str = "cancel";
        }
        linkedHashMap.put("action_type", str);
        Object obj = addYoursInviteBehavior.LIZ().get("enter_from");
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        C817250W4d.LIZ("enter_from", string, linkedHashMap);
        C817250W4d.LIZ("from_user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), linkedHashMap);
        linkedHashMap.put("to_user_id", userInvitee.getUid());
        C817250W4d.LIZ("has_invited", C308560C7q.LIZIZ(Boolean.valueOf(userInvitee.getInvited())), linkedHashMap);
        linkedHashMap.put("follow_status", String.valueOf(C0OD6.LIZIZ(userInvitee.getFollowStatus(), userInvitee.getFollowerStatus())));
        if (!z3 && !Intrinsics.LJFF(str2, "search")) {
            z = false;
        } else {
            z = true;
        }
        linkedHashMap.put("is_search_result", C308560C7q.LIZIZ(Boolean.valueOf(z)));
        return linkedHashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S1220000_9(InterfaceC665370Q7z interfaceC665370Q7z, boolean z, UserInvitee userInvitee, boolean z2, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC665370Q7z;
        this.z3 = z;
        this.l2 = userInvitee;
        this.z4 = z2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S1220000_9(boolean z, AddYoursInviteBehavior addYoursInviteBehavior, UserInvitee userInvitee, boolean z2, String str, int i) {
        super(0);
        this.$t = i;
        this.z3 = z;
        this.l1 = addYoursInviteBehavior;
        this.l2 = userInvitee;
        this.z4 = z2;
        this.s0 = str;
    }
}
