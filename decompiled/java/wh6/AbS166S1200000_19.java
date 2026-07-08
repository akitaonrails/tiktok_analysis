package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0PEM;
import X.C1230430i7l;
import X.C1230620i84;
import X.C1260120ite;
import X.C1261940iwa;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C337180DJs;
import X.EnumC1261960iwc;
import X.EnumC666200QBe;
import Y.ARunnableS109S0100000_9;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.im.saas.host.impl.feed.invitation.JoinGroupBottomButtonAssem;
import com.ss.android.ugc.aweme.publicgroup.data.GroupForInvitation;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.EntryAreaCell;

/* JADX INFO: loaded from: classes20.dex */
public class AbS166S1200000_19 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS166S1200000_19 abS166S1200000_19, View view) {
        if (view != null) {
            JoinGroupBottomButtonAssem joinGroupBottomButtonAssem = (JoinGroupBottomButtonAssem) abS166S1200000_19.l1;
            GroupForInvitation groupForInvitation = (GroupForInvitation) abS166S1200000_19.l2;
            String str = abS166S1200000_19.s0;
            joinGroupBottomButtonAssem.getClass();
            String strLIZ = C1230620i84.LIZ(str);
            if (strLIZ != null) {
                long j = groupForInvitation.convShortId;
                C1260120ite.LIZIZ(new ARunnableS109S0100000_9(joinGroupBottomButtonAssem, 174));
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1230430i7l(strLIZ, j, joinGroupBottomButtonAssem, groupForInvitation, str, null), 3);
            }
            JoinGroupBottomButtonAssem joinGroupBottomButtonAssem2 = (JoinGroupBottomButtonAssem) abS166S1200000_19.l1;
            String str2 = abS166S1200000_19.s0;
            joinGroupBottomButtonAssem2.getClass();
            C1230620i84.LIZ.remove(str2);
            C337180DJs.LIZ(joinGroupBottomButtonAssem2.LJJIJL());
        }
    }

    public static final void LIZ$1(AbS166S1200000_19 abS166S1200000_19, View view) {
        if (view != null) {
            C1261940iwa c1261940iwa = C1261940iwa.LIZ;
            EnumC1261960iwc enumC1261960iwc = (EnumC1261960iwc) abS166S1200000_19.l1;
            c1261940iwa.getClass();
            Keva kevaLIZIZ = C1261940iwa.LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exposeTime");
            sbLIZ.append(enumC1261960iwc);
            kevaLIZIZ.storeInt(C2188811AlT.LIZIZ(sbLIZ), 0);
            EnumC1261960iwc enumC1261960iwc2 = (EnumC1261960iwc) abS166S1200000_19.l1;
            Keva kevaLIZIZ2 = C1261940iwa.LIZIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadTime");
            sbLIZ2.append(enumC1261960iwc2);
            kevaLIZIZ2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), 0);
            ((EntryAreaCell) abS166S1200000_19.l2).U5("ffp_aggregate_entrance_click");
            FindFriendsPageArg findFriendsPageArg = new FindFriendsPageArg(false, 0, "", "inbox_first_page", EnumC666200QBe.DEFAULT, null, 0, false, -1, null);
            if (((EnumC1261960iwc) abS166S1200000_19.l1) == EnumC1261960iwc.INBOX_PAGE) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), abS166S1200000_19.s0);
                smartRouteBuildRoute.withNavArg(findFriendsPageArg);
                smartRouteBuildRoute.open();
                return;
            }
            SmartRouter.buildRoute(view.getContext(), abS166S1200000_19.s0).open();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS166S1200000_19(Object obj, Object obj2, String str, int i) {
        super(300L);
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
