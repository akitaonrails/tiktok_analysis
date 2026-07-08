package kotlin.jvm.internal;

import X.C09AY;
import X.C0K0S;
import X.C0K19;
import X.C0KCK;
import X.C0KLA;
import X.C2097608Jq;
import X.C510540K0m;
import X.C510560K0o;
import X.C510570K0p;
import X.C513470KBt;
import X.C513840KDe;
import X.C515930KLf;
import X.C516110KLx;
import X.C786410Ut5;
import X.EnumC513480KBu;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.PrivilegeCreatorRoomItemDetailFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.PrivilegeDiscordItemDetailFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: loaded from: classes8.dex */
public class AwS69S0500000_7 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS69S0500000_7 awS69S0500000_7) {
        C516110KLx c516110KLx = (C516110KLx) awS69S0500000_7.l0;
        c516110KLx.LIZJ = Boolean.TRUE;
        if (c516110KLx.LIZ()) {
            C0KLA c0kla = (C0KLA) awS69S0500000_7.l1;
            EnumC513480KBu enumC513480KBu = c0kla.LJII;
            if (enumC513480KBu != EnumC513480KBu.PLAN_CHANGE) {
                C513470KBt.LJFF(c0kla.LIZ, c0kla.LIZJ, enumC513480KBu, (HashMap) awS69S0500000_7.l2);
            }
            ((C0KLA) awS69S0500000_7.l1).LJIIJ.LIZIZ();
            ((C0KLA) awS69S0500000_7.l1).LJIIJ.LJFF((HashMap) awS69S0500000_7.l2, (C0KCK) awS69S0500000_7.l4);
            C513840KDe.LJIILL((HashMap) awS69S0500000_7.l2);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS69S0500000_7 awS69S0500000_7) {
        String idStr;
        String secUid;
        String str;
        String str2;
        String strRS;
        boolean zLIZ;
        SubInfo subInfo;
        Boolean bool;
        PrivilegeDetailViewModel privilegeDetailViewModelZS;
        String strXQ2;
        SubscriptionSceneContext subscriptionSceneContext;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment3;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment4 = ((C0K0S) awS69S0500000_7.l0).LJ;
        if (subscriptionPrivilegeDetailFragment4 != null) {
            subscriptionPrivilegeDetailFragment4.cS(((C510540K0m) awS69S0500000_7.l1).LIZ, C2097608Jq.LJ());
        }
        FragmentManager fragmentManager = (FragmentManager) awS69S0500000_7.l2;
        PrivilegeDiscordItemDetailFragment privilegeDiscordItemDetailFragment = new PrivilegeDiscordItemDetailFragment();
        Bundle bundle = new Bundle();
        PGCGetSubPrivilegeDetailResponse.Data data = (PGCGetSubPrivilegeDetailResponse.Data) awS69S0500000_7.l4;
        C0K0S c0k0s = (C0K0S) awS69S0500000_7.l0;
        User user = data.anchorDetail;
        String str3 = "";
        if (user == null || (idStr = user.getIdStr()) == null) {
            idStr = "";
        }
        C786410Ut5.LJJJI("creator_id", idStr, bundle);
        User user2 = data.anchorDetail;
        if (user2 == null || (secUid = user2.getSecUid()) == null) {
            secUid = "";
        }
        C786410Ut5.LJJJI("sec_user_id", secUid, bundle);
        if (c0k0s == null || (subscriptionPrivilegeDetailFragment3 = c0k0s.LJ) == null || (str = subscriptionPrivilegeDetailFragment3.LLLFFI) == null) {
            str = "";
        }
        C786410Ut5.LJJJI("package_id", str, bundle);
        if (c0k0s == null || (subscriptionPrivilegeDetailFragment2 = c0k0s.LJ) == null || (str2 = subscriptionPrivilegeDetailFragment2.LLILZLL) == null) {
            str2 = "";
        }
        C786410Ut5.LJJJI("show_entrance", str2, bundle);
        if (c0k0s == null || (subscriptionPrivilegeDetailFragment = c0k0s.LJ) == null || (strRS = subscriptionPrivilegeDetailFragment.rS()) == null) {
            strRS = "";
        }
        C786410Ut5.LJJJI("back_url", strRS, bundle);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment5 = c0k0s.LJ;
        boolean zBooleanValue = false;
        if (subscriptionPrivilegeDetailFragment5 != null && (subscriptionSceneContext = subscriptionPrivilegeDetailFragment5.LLJJI) != null) {
            zLIZ = subscriptionSceneContext.LIZ();
        } else {
            zLIZ = false;
        }
        bundle.putBoolean("preview_mode", zLIZ);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment6 = c0k0s.LJ;
        if (subscriptionPrivilegeDetailFragment6 != null && (privilegeDetailViewModelZS = subscriptionPrivilegeDetailFragment6.zS()) != null && (strXQ2 = privilegeDetailViewModelZS.xQ2()) != null) {
            str3 = strXQ2;
        }
        C786410Ut5.LJJJI("package_price", str3, bundle);
        PGCGetSubPrivilegeDetailResponse.Data data2 = c0k0s.LIZLLL;
        if (data2 != null && (subInfo = data2.subInfo) != null && (bool = subInfo.isSubscribing) != null) {
            zBooleanValue = bool.booleanValue();
        }
        C786410Ut5.LJJJI("is_subscribing", String.valueOf(zBooleanValue), bundle);
        bundle.putBoolean("hide_bottom_button", C510570K0p.LJFF(data));
        C0K19.LIZ(fragmentManager, privilegeDiscordItemDetailFragment, "sub_privilege_discord_item_detail_dialog", bundle);
        ((Function0) awS69S0500000_7.l3).invoke();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS69S0500000_7 awS69S0500000_7) {
        String strRS;
        String strXQ2;
        boolean zLIZ;
        String idStr;
        String secUid;
        String str;
        SubInfo subInfo;
        Boolean bool;
        String str2;
        SubscriptionSceneContext subscriptionSceneContext;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment;
        PrivilegeDetailViewModel privilegeDetailViewModelZS;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2;
        FragmentManager fragmentManager = (FragmentManager) awS69S0500000_7.l0;
        PrivilegeCreatorRoomItemDetailFragment privilegeCreatorRoomItemDetailFragment = new PrivilegeCreatorRoomItemDetailFragment();
        Bundle bundle = new Bundle();
        C0K0S c0k0s = (C0K0S) awS69S0500000_7.l1;
        PGCGetSubPrivilegeDetailResponse.Data data = (PGCGetSubPrivilegeDetailResponse.Data) awS69S0500000_7.l4;
        String str3 = "";
        if (c0k0s == null || (subscriptionPrivilegeDetailFragment2 = c0k0s.LJ) == null || (strRS = subscriptionPrivilegeDetailFragment2.rS()) == null) {
            strRS = "";
        }
        C786410Ut5.LJJJI("back_url", strRS, bundle);
        if (c0k0s == null || (subscriptionPrivilegeDetailFragment = c0k0s.LJ) == null || (privilegeDetailViewModelZS = subscriptionPrivilegeDetailFragment.zS()) == null || (strXQ2 = privilegeDetailViewModelZS.xQ2()) == null) {
            strXQ2 = "";
        }
        C786410Ut5.LJJJI("package_price", strXQ2, bundle);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment3 = c0k0s.LJ;
        boolean zBooleanValue = false;
        if (subscriptionPrivilegeDetailFragment3 != null && (subscriptionSceneContext = subscriptionPrivilegeDetailFragment3.LLJJI) != null) {
            zLIZ = subscriptionSceneContext.LIZ();
        } else {
            zLIZ = false;
        }
        bundle.putBoolean("preview_mode", zLIZ);
        User user = data.anchorDetail;
        if (user == null || (idStr = user.getIdStr()) == null) {
            idStr = "";
        }
        C786410Ut5.LJJJI("creator_id", idStr, bundle);
        User user2 = data.anchorDetail;
        if (user2 == null || (secUid = user2.getSecUid()) == null) {
            secUid = "";
        }
        C786410Ut5.LJJJI("sec_user_id", secUid, bundle);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment4 = c0k0s.LJ;
        if (subscriptionPrivilegeDetailFragment4 == null || (str = subscriptionPrivilegeDetailFragment4.LLLFFI) == null) {
            str = "";
        }
        C786410Ut5.LJJJI("package_id", str, bundle);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment5 = c0k0s.LJ;
        if (subscriptionPrivilegeDetailFragment5 != null && (str2 = subscriptionPrivilegeDetailFragment5.LLILZLL) != null) {
            str3 = str2;
        }
        C786410Ut5.LJJJI("show_entrance", str3, bundle);
        PGCGetSubPrivilegeDetailResponse.Data data2 = c0k0s.LIZLLL;
        if (data2 != null && (subInfo = data2.subInfo) != null && (bool = subInfo.isSubscribing) != null) {
            zBooleanValue = bool.booleanValue();
        }
        C786410Ut5.LJJJI("is_subscribing", String.valueOf(zBooleanValue), bundle);
        bundle.putBoolean("hide_bottom_button", C510570K0p.LJFF(data));
        C0K19.LIZ(fragmentManager, privilegeCreatorRoomItemDetailFragment, "sub_privilege_creator_room_detail_dialog", bundle);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment6 = ((C0K0S) awS69S0500000_7.l1).LJ;
        if (subscriptionPrivilegeDetailFragment6 != null) {
            subscriptionPrivilegeDetailFragment6.cS(((C510560K0o) awS69S0500000_7.l2).LIZ, C2097608Jq.LJ());
        }
        ((Function0) awS69S0500000_7.l3).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS69S0500000_7(C0K0S c0k0s, C0K0S c0k0s2, C510540K0m c510540K0m, FragmentManager fragmentManager, Function0<Unit> function0, PGCGetSubPrivilegeDetailResponse.Data data) {
        super(0);
        this.$t = data;
        this.l0 = c0k0s;
        this.l1 = c0k0s2;
        this.l2 = c510540K0m;
        this.l3 = fragmentManager;
        this.l4 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS69S0500000_7(C516110KLx c516110KLx, C516110KLx c516110KLx2, C0KLA c0kla, HashMap<String, List<PGCSubscriptionProductDetailWithTemplateInfo>> map, C515930KLf c515930KLf, C0KCK c0kck) {
        super(0);
        this.$t = c0kck;
        this.l0 = c516110KLx;
        this.l1 = c516110KLx2;
        this.l2 = c0kla;
        this.l3 = map;
        this.l4 = c515930KLf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS69S0500000_7(FragmentManager fragmentManager, FragmentManager fragmentManager2, C0K0S c0k0s, C510560K0o c510560K0o, Function0<Unit> function0, PGCGetSubPrivilegeDetailResponse.Data data) {
        super(0);
        this.$t = data;
        this.l0 = fragmentManager;
        this.l1 = fragmentManager2;
        this.l2 = c0k0s;
        this.l3 = c510560K0o;
        this.l4 = function0;
    }
}
