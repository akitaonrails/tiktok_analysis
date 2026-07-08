package irm;

import X.AbstractC1386130mAt;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.C016L;
import X.C098200Yq;
import X.C0N4J;
import X.C1389890mGx;
import X.C1575080r5e;
import X.C189200o6;
import X.C19651011uW;
import X.C19719612Di;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C241200wU;
import X.C317150Cbx;
import X.C343240Dcw;
import X.C343260Dcy;
import X.C735410St1;
import X.C735840Sti;
import X.C844470XAv;
import X.C994030byT;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell;
import com.ss.android.ugc.aweme.ui.cell.publish.CollabInviteEditCell;
import com.ss.android.ugc.aweme.ui.cell.publish.CollabInviteSelectedCell;
import com.ss.android.ugc.aweme.vm.publish.CollabEditPageContainerViewModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class AkS61S0200000_24 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS61S0200000_24 akS61S0200000_24, View view) {
        Map<String, String> mapLJ;
        ((CollabFeedInvitedCell) akS61S0200000_24.l0).P5("click_head");
        CollabFeedInvitedCell collabFeedInvitedCell = (CollabFeedInvitedCell) akS61S0200000_24.l0;
        User user = ((C343260Dcy) akS61S0200000_24.l1).LLILLJJLI;
        C1575080r5e c1575080r5e = collabFeedInvitedCell.N5().LL;
        if (c1575080r5e == null || (mapLJ = c1575080r5e.LIZIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        String str = mapLJ.get("enter_from");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        C343260Dcy item = collabFeedInvitedCell.getItem();
        if (item != null) {
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            C735410St1 c735410St1 = new C735410St1();
            c735410St1.LJIJI(item.LLILZ);
            c735410St1.LIZLLL = str;
            c735410St1.LJJLIIIJILLIZJL = "collab";
            c735410St1.LJJLIIJ = user.getUid();
            Object objLJIIIZ = c19651011uW.LJIIIZ(item.LLILZ, c735410St1);
            Aweme aweme = item.LLILZ;
            c735840Sti.getClass();
            C735840Sti.LIZIZ(aweme, objLJIIIZ);
            AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) objLJIIIZ;
            String str3 = mapLJ.get("user_type");
            if (str3 != null) {
                str2 = str3;
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("collab_user_type", str2));
            abstractC1386130mAt.getClass();
            for (Map.Entry entry : mapLIZJ.entrySet()) {
                abstractC1386130mAt.LJ((String) entry.getKey(), (String) entry.getValue());
            }
            abstractC1386130mAt.LJIILJJIL();
        }
        Context context = collabFeedInvitedCell.itemView.getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://user/profile/");
        sbLIZ.append(user.getUid());
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.open();
    }

    public static final void LIZ$1(AkS61S0200000_24 akS61S0200000_24, View view) {
        Map<String, String> mapLJ;
        CollabFeedInvitedPendingCell collabFeedInvitedPendingCell = (CollabFeedInvitedPendingCell) akS61S0200000_24.l0;
        User user = ((C343240Dcw) akS61S0200000_24.l1).LL;
        C1575080r5e c1575080r5e = collabFeedInvitedPendingCell.I5().LL;
        if (c1575080r5e == null || (mapLJ = c1575080r5e.LIZIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        String str = mapLJ.get("enter_from");
        if (str == null) {
            str = "";
        }
        C343240Dcw item = collabFeedInvitedPendingCell.getItem();
        if (item != null) {
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            C735410St1 c735410St1 = new C735410St1();
            c735410St1.LJIJI(item.LLILLJJLI);
            c735410St1.LIZLLL = str;
            c735410St1.LJJLIIIJILLIZJL = "collab";
            c735410St1.LJJLIIJ = user.getUid();
            Object objLJIIIZ = c19651011uW.LJIIIZ(item.LLILLJJLI, c735410St1);
            Aweme aweme = item.LLILLJJLI;
            c735840Sti.getClass();
            C735840Sti.LIZIZ(aweme, objLJIIIZ);
            ((AbstractC1386130mAt) objLJIIIZ).LJIILJJIL();
        }
        Context context = collabFeedInvitedPendingCell.itemView.getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://user/profile/");
        sbLIZ.append(user.getUid());
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.open();
    }

    public static final void LIZ$2(AkS61S0200000_24 akS61S0200000_24, View view) {
        String str;
        String str2;
        Object c098200Yq;
        CollabInviteEditCell collabInviteEditCell = (CollabInviteEditCell) akS61S0200000_24.l0;
        if (collabInviteEditCell.LLJI) {
            CollabEditPageContainerViewModel collabEditPageContainerViewModelI5 = collabInviteEditCell.I5();
            User user = ((C317150Cbx) akS61S0200000_24.l1).LL;
            C19719612Di.LJJIIJ(collabEditPageContainerViewModelI5.LLILLJJLI, new AwS591S0100000_12(user, 1236), true);
            collabEditPageContainerViewModelI5.setStateImmediate(new AwS603S0100000_24(user, 702));
        } else if (collabInviteEditCell.LLJ == 1) {
            SettingsManager.LIZLLL().getClass();
            int iLJ = SettingsManager.LJ("collab_invite_max", 5);
            C844470XAv.LIZ.getClass();
            String quantityString = C844470XAv.LIZ().getResources().getQuantityString(2131755141, iLJ, Integer.valueOf(iLJ));
            C1389890mGx c1389890mGx = new C1389890mGx(((CollabInviteEditCell) akS61S0200000_24.l0).itemView);
            c1389890mGx.LJIIJ(quantityString);
            c1389890mGx.LJIIJJI();
        } else {
            CollabEditPageContainerViewModel collabEditPageContainerViewModelI52 = collabInviteEditCell.I5();
            User user2 = ((C317150Cbx) akS61S0200000_24.l1).LL;
            ((ArrayList) collabEditPageContainerViewModelI52.LLILLJJLI).add(user2);
            collabEditPageContainerViewModelI52.setStateImmediate(new AwS603S0100000_24(user2, 701));
        }
        Map<String, String> map = ((CollabInviteEditCell) akS61S0200000_24.l0).I5().LL;
        C241200wU c241200wU = C241200wU.LIZ;
        String str3 = map.get("previous_page");
        if (str3 == null) {
            str3 = "";
        }
        if (((CollabInviteEditCell) akS61S0200000_24.l0).LLJI) {
            str = "choose";
        } else {
            str = "cancel_choose";
        }
        C317150Cbx c317150Cbx = (C317150Cbx) akS61S0200000_24.l1;
        String str4 = c317150Cbx.LLILLL;
        String uid = c317150Cbx.LL.getUid();
        if (Intrinsics.LJFF(((C317150Cbx) akS61S0200000_24.l1).LLILLL, "all_user")) {
            str2 = ((C317150Cbx) akS61S0200000_24.l1).LLILLJJLI;
        } else {
            str2 = null;
        }
        c241200wU.getClass();
        try {
            C0N4J.LIZ("invite_collab_head_click", new C016L(str3, str, str4, uid, str2));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        KeyboardUtils.LIZIZ(((CollabInviteEditCell) akS61S0200000_24.l0).itemView);
    }

    public static final void LIZ$3(AkS61S0200000_24 akS61S0200000_24, View view) {
        CollabEditPageContainerViewModel collabEditPageContainerViewModel = (CollabEditPageContainerViewModel) ((CollabInviteSelectedCell) akS61S0200000_24.l0).LL.getValue();
        User user = ((C994030byT) akS61S0200000_24.l1).LL;
        C19719612Di.LJJIIJ(collabEditPageContainerViewModel.LLILLJJLI, new AwS591S0100000_12(user, 1236), true);
        collabEditPageContainerViewModel.setStateImmediate(new AwS603S0100000_24(user, 702));
    }

    public AkS61S0200000_24(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
