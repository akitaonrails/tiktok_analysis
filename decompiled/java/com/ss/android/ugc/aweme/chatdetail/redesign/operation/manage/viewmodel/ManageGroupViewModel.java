package com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel;

import X.AbstractC879060Ye8;
import X.AnonymousClass0956;
import X.C01GW;
import X.C0I0B;
import X.C0Y8T;
import X.C0YNP;
import X.C0Z58;
import X.C0Z5B;
import X.C1228910i5J;
import X.C13LP;
import X.C1461005nk;
import X.C1509305vX;
import X.C1527905yX;
import X.C1529305yl;
import X.C1559260qg8;
import X.C1651206dK;
import X.C1717406o0;
import X.C1717506o1;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C291001Au;
import X.C461720I8s;
import X.C723600SZy;
import X.C866530Xz1;
import X.InterfaceC0148002o;
import X.InterfaceC1222510huz;
import X.InterfaceC1732006qM;
import X.InterfaceC863600XuI;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteria;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS17S0010000_2;
import kotlin.jvm.internal.AwS33S0010000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS6S0011000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ManageGroupViewModel extends AssemViewModel<C1651206dK> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1717506o1.class, null), true);
    public final C01GW LLILLJJLI = C1509305vX.LIZ(new AwS563S0100000_19(this, 507));
    public final C01GW LLILLL = C1509305vX.LIZ(new AwS563S0100000_19(this, 505));
    public final C01GW LLILZ = C1509305vX.LIZ(new AwS563S0100000_19(this, 506));
    public final C01GW LLILZIL = C1509305vX.LIZ(new AwS563S0100000_19(this, 509));
    public final C01GW LLILZLL = C1509305vX.LIZ(AFwS207S0000000_19.get$arr$(74));
    public final C01GW LLIZ = C1509305vX.LIZ(AFwS207S0000000_19.get$arr$(72));
    public final C01GW LLIZLLLIL = C1509305vX.LIZ(AFwS207S0000000_19.get$arr$(73));
    public final C01GW LLJ = C1509305vX.LIZ(new AwS563S0100000_19(this, 508));
    public AnonymousClass0956 LLJI;

    public final int vQ2() {
        C1461005nk c1461005nk = C1461005nk.LIZ;
        AbstractC879060Ye8 abstractC879060Ye8YQ2 = yQ2();
        return C1527905yX.LIZ(Integer.valueOf(c1461005nk.LIZLLL(abstractC879060Ye8YQ2 != null ? abstractC879060Ye8YQ2.LJ() : null)));
    }

    public final InterfaceC1732006qM wQ2() {
        return (InterfaceC1732006qM) this.LLIZ.getValue();
    }

    public final String xQ2() {
        return (String) this.LLILZ.getValue();
    }

    public final AbstractC879060Ye8 yQ2() {
        return (AbstractC879060Ye8) this.LLILLJJLI.getValue();
    }

    public final InterfaceC1222510huz zQ2() {
        return (InterfaceC1222510huz) this.LLILZLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        String string;
        String strLJI = zQ2().LJI(xQ2());
        boolean zLIZ = wQ2().LIZ("group_chat_who_can_join", xQ2(), C461720I8s.LIZIZ(), false);
        GroupAccessCriteria groupAccessCriteria = (GroupAccessCriteria) C13LP.LJJJLL(zQ2().LIZJ(xQ2()));
        String strXQ2 = xQ2();
        if (strXQ2 == null) {
            string = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("manage_group_repo_");
            sbLIZ.append(C461720I8s.LIZIZ());
            Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strXQ2);
            sbLIZ2.append("join_requirement_description");
            string = repo.getString(C2188811AlT.LIZIZ(sbLIZ2), "");
        }
        boolean zLIZ2 = wQ2().LIZ("group_chat_require_approval", xQ2(), C461720I8s.LIZIZ(), false);
        boolean zLJIIIZ = zQ2().LJIIIZ(xQ2());
        String strLJFF = zQ2().LJFF(xQ2());
        boolean zLIZ3 = wQ2().LIZ("group_chat_enable_allow_link_invite", xQ2(), C461720I8s.LIZIZ(), false);
        boolean zLJ = zQ2().LJ(xQ2());
        int iVQ2 = vQ2();
        boolean zLIZ4 = wQ2().LIZ("group_chat_go_live_reminder", xQ2(), C461720I8s.LIZIZ(), false);
        boolean z = zQ2().LIZLLL(xQ2(), strLJI) == C0Z5B.ENABLED;
        boolean zLIZ5 = wQ2().LIZ("group_chat_hide_members", xQ2(), C461720I8s.LIZIZ(), false);
        InterfaceC1222510huz interfaceC1222510huzZQ2 = zQ2();
        String strXQ22 = xQ2();
        if (strXQ22 == null) {
            strXQ22 = "";
        }
        boolean zLIZ6 = interfaceC1222510huzZQ2.LIZ(strXQ22);
        boolean zLIZ7 = wQ2().LIZ("group_chat_transfer_owner", xQ2(), C461720I8s.LIZIZ(), false);
        boolean zLIZ8 = wQ2().LIZ("group_chat_end_group", xQ2(), C461720I8s.LIZIZ(), false);
        Boolean bool = Boolean.FALSE;
        return new C1651206dK(zLIZ, groupAccessCriteria, string, zLIZ2, zLJIIIZ, strLJFF, 0, zLIZ3, zLJ, iVQ2, strLJI, zLIZ4, z, zLIZ5, zLIZ6, zLIZ7, zLIZ8, new C291001Au(bool), new C291001Au(bool));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        AbstractC879060Ye8 abstractC879060Ye8YQ2 = yQ2();
        if (abstractC879060Ye8YQ2 != null) {
            abstractC879060Ye8YQ2.LJIILLIIL((C1717406o0) this.LLJ.getValue());
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        AbstractC879060Ye8 abstractC879060Ye8YQ2 = yQ2();
        if (abstractC879060Ye8YQ2 != null) {
            abstractC879060Ye8YQ2.LJIIJJI((C1717406o0) this.LLJ.getValue());
        }
    }

    public final void AQ2(final boolean z) {
        String str;
        String str2;
        Long l = (Long) this.LLILZIL.getValue();
        if (l != null) {
            long jLongValue = l.longValue();
            if (z == getState().LLILZIL) {
                return;
            }
            IMGroupChatDetailAnalytics iMGroupChatDetailAnalytics = IMGroupChatDetailAnalytics.LIZ;
            Pair[] pairArr = new Pair[4];
            boolean z2 = false;
            pairArr[0] = new Pair("enter_from", "group_management");
            pairArr[1] = new Pair("enter_method", "group_management_cell");
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            pairArr[2] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            if (getState().LLIZ > 0) {
                z2 = true;
            }
            pairArr[3] = new Pair("has_audit_request", C1529305yl.LIZ(Boolean.valueOf(z2)));
            iMGroupChatDetailAnalytics.LJFF("approval_require_join", pairArr, C0I0B.LJFF.LIZIZ());
            final int i = getState().LLIZ;
            setStateImmediate(new AwS17S0010000_2(z, 0));
            C0Z58 c0z58 = C0Z58.LIZ;
            String strValueOf = String.valueOf(jLongValue);
            InterfaceC863600XuI<C0Y8T> interfaceC863600XuI = new InterfaceC863600XuI<C0Y8T>() { // from class: X.0hux
                @Override // X.InterfaceC863600XuI
                public final void LIZIZ(C0YMW c0ymw) {
                    this.LIZ.setState(new AwS6S0011000_19(z, i, 0));
                    IIMErrorUtils.LIZ.getClass();
                    IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
                    if (iIMErrorUtilsLIZ != null) {
                        C0I0B.LJFF.LIZJ();
                        iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
                    }
                }

                @Override // X.InterfaceC863600XuI
                public final void onSuccess(C0Y8T c0y8t) {
                    boolean zLJIIIZ = C0Z58.LIZ.LJIIIZ(this.LIZ.xQ2());
                    this.LIZ.setState(new AwS33S0010000_19(zLJIIIZ, 4));
                    if (!zLJIIIZ) {
                        this.LIZ.setState(AFwS257S0000000_19.get$arr$(87));
                    }
                }
            };
            c0z58.getClass();
            if (strValueOf != null) {
                C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(strValueOf);
                if (z) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c866530Xz1LIZIZ.LJIL(C2097908Jt.LIZJ(new Pair("a:audit_switch", str2)), interfaceC863600XuI);
            }
        }
    }

    public final void BQ2(Context context, GroupAccessCriteriaCollection groupAccessCriteriaCollection) {
        String strLIZLLL = C1228910i5J.LIZLLL(context, groupAccessCriteriaCollection);
        setState(new AwS133S1100000_19(groupAccessCriteriaCollection, strLIZLLL, 3));
        String strXQ2 = xQ2();
        if (strXQ2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("manage_group_repo_");
            sbLIZ.append(C461720I8s.LIZIZ());
            Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strXQ2);
            sbLIZ2.append("join_requirement_description");
            repo.storeString(C2188811AlT.LIZIZ(sbLIZ2), strLIZLLL);
        }
    }
}
