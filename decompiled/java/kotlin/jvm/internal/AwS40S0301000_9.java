package kotlin.jvm.internal;

import X.AbstractC848400XPy;
import X.C09AY;
import X.C0OKA;
import X.C0OKY;
import X.C0XQ7;
import X.C1389890mGx;
import X.C618680OOk;
import X.C619350OQz;
import X.EnumC617060OIe;
import X.EnumC618730OOp;
import X.EnumC620430OVd;
import X.InterfaceC1891350zJl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPoll;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollOption;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPublishAction;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS40S0301000_9 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS40S0301000_9 awS40S0301000_9, Object obj) {
        ArrayList arrayList;
        C0OKY c0oky = (C0OKY) obj;
        BulletinProfileViewModel bulletinProfileViewModel = (BulletinProfileViewModel) awS40S0301000_9.l0;
        BulletinBoardInfo bulletinBoardInfo = (BulletinBoardInfo) awS40S0301000_9.l1;
        long j = bulletinBoardInfo.bulletinId;
        BulletinAccountEditResponse bulletinAccountEditResponse = (BulletinAccountEditResponse) awS40S0301000_9.l2;
        List<InterfaceC1891350zJl> listIQ2 = bulletinProfileViewModel.IQ2(j, bulletinAccountEditResponse.bulletinFunctionSettings, bulletinAccountEditResponse.functionList, bulletinBoardInfo.editQuota, bulletinBoardInfo.status, Integer.valueOf(awS40S0301000_9.i3));
        List<BulletinPublishAction> list = ((BulletinAccountEditResponse) awS40S0301000_9.l2).plusPostSettingList;
        ArrayList arrayList2 = null;
        if (list != null) {
            BulletinProfileViewModel bulletinProfileViewModel2 = (BulletinProfileViewModel) awS40S0301000_9.l0;
            arrayList = new ArrayList();
            for (BulletinPublishAction bulletinPublishAction : list) {
                BulletinPublishAction bulletinPublishAction2 = bulletinPublishAction;
                if (!bulletinProfileViewModel2.GQ2() || bulletinPublishAction2.getPublishActionType() != EnumC620430OVd.IMAGE_UPLOAD.getPostType()) {
                    arrayList.add(bulletinPublishAction);
                }
            }
        } else {
            arrayList = null;
        }
        List<BulletinPublishAction> list2 = ((BulletinAccountEditResponse) awS40S0301000_9.l2).quickPostSettingList;
        if (list2 != null) {
            BulletinProfileViewModel bulletinProfileViewModel3 = (BulletinProfileViewModel) awS40S0301000_9.l0;
            arrayList2 = new ArrayList();
            for (BulletinPublishAction bulletinPublishAction3 : list2) {
                BulletinPublishAction bulletinPublishAction4 = bulletinPublishAction3;
                if (!bulletinProfileViewModel3.GQ2() || bulletinPublishAction4.getPublishActionType() != EnumC620430OVd.IMAGE_UPLOAD.getPostType()) {
                    arrayList2.add(bulletinPublishAction3);
                }
            }
        }
        BulletinAccountEditResponse bulletinAccountEditResponse2 = (BulletinAccountEditResponse) awS40S0301000_9.l2;
        return C0OKY.LIZ(c0oky, null, null, null, null, arrayList2, arrayList, 0L, null, null, null, null, null, null, listIQ2, null, null, null, null, 0L, bulletinAccountEditResponse2.bizResourceEntry, bulletinAccountEditResponse2.embeddedPublishContent, bulletinAccountEditResponse2.toolkitOrders, null, null, null, null, null, false, null, null, 2140127183);
    }

    public static final Object invoke$1(AwS40S0301000_9 awS40S0301000_9, Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int value;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        C618680OOk c618680OOk = (C618680OOk) awS40S0301000_9.l0;
        BulletinPollOption bulletinPollOption = (BulletinPollOption) awS40S0301000_9.l1;
        int i = awS40S0301000_9.i3;
        c618680OOk.getClass();
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        List<User> list = bulletinPollOption.votedUserList;
        User user = null;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        long jLIZIZ = bulletinPollOption.LIZIZ() - 1;
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!Intrinsics.LJFF(((User) obj2).getUid(), curUser.getUid())) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        BulletinPollOption bulletinPollOptionLIZ = BulletinPollOption.LIZ(bulletinPollOption, Long.valueOf(jLIZIZ), Boolean.FALSE, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(c618680OOk.LLILZLL.getNonNullOptions());
        ListProtector.set(arrayList3, i, bulletinPollOptionLIZ);
        BulletinPoll bulletinPoll = c618680OOk.LLILZLL;
        C618680OOk c618680OOkLLIIIL = C618680OOk.LLIIIL(c618680OOk, bulletinPoll.copy(bulletinPoll.title, bulletinPoll.duration, arrayList3, bulletinPoll.pollId, Long.valueOf(bulletinPoll.getNonNullTotalVoteCount() - 1), bulletinPoll.resultViewable, bulletinPoll.pollExpired), false, false, false, false, 0, 0, EnumC618730OOp.UN_VOTE.ordinal(), null, 917502);
        C619350OQz c619350OQz = (C619350OQz) awS40S0301000_9.l2;
        BulletinListViewModel bulletinListViewModel = c619350OQz.LIZLLL;
        if (bulletinListViewModel != null) {
            bulletinListViewModel.jZ1(c619350OQz.LJIIJ, c618680OOkLLIIIL, C0OKA.UPDATE);
        }
        C619350OQz c619350OQz2 = (C619350OQz) awS40S0301000_9.l2;
        BulletinPollViewModel bulletinPollViewModel = c619350OQz2.LIZIZ;
        if (bulletinPollViewModel != null) {
            BulletinCommonAbility bulletinCommonAbility = c619350OQz2.LJ;
            if (bulletinCommonAbility != null) {
                value = bulletinCommonAbility.bB();
            } else {
                value = EnumC617060OIe.INVALID.getValue();
            }
            long j = ((C619350OQz) awS40S0301000_9.l2).LJII;
            Long l = ((C618680OOk) awS40S0301000_9.l0).LLIZ;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Long pollId = ((C618680OOk) awS40S0301000_9.l0).LLILZLL.getPollId();
            if (pollId != null) {
                jLongValue2 = pollId.longValue();
            } else {
                jLongValue2 = 0;
            }
            Long l2 = ((BulletinPollOption) awS40S0301000_9.l1).optionId;
            if (l2 != null) {
                jLongValue3 = l2.longValue();
            } else {
                jLongValue3 = 0;
            }
            bulletinPollViewModel.vQ2(value, j, jLongValue, jLongValue2, jLongValue3, 2, ((C619350OQz) awS40S0301000_9.l2).LIZLLL, c618680OOkLLIIIL, C618680OOk.LLIIIL((C618680OOk) awS40S0301000_9.l0, null, false, false, false, false, 0, 0, EnumC618730OOp.UPDATE.ordinal(), null, 917503));
        }
        C619350OQz c619350OQz3 = (C619350OQz) awS40S0301000_9.l2;
        BulletinListViewModel bulletinListViewModel2 = c619350OQz3.LIZLLL;
        if (bulletinListViewModel2 != null) {
            String strValueOf = String.valueOf(c619350OQz3.LJII);
            C618680OOk c618680OOk2 = ((C619350OQz) awS40S0301000_9.l2).LJIIJ;
            if (c618680OOk2 != null) {
                user = c618680OOk2.LLJJIJIL;
            }
            BulletinListViewModel.OQ2(bulletinListViewModel2, strValueOf, "vote", c618680OOk2, user, null, "click_cancel_vote", null, null, 208);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(((C619350OQz) awS40S0301000_9.l2).LJIILL);
        c1389890mGx.LJIIIZ(2131827969);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0301000_9(C618680OOk c618680OOk, BulletinPollOption bulletinPollOption, int i, C619350OQz c619350OQz, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c618680OOk;
        this.l1 = bulletinPollOption;
        this.i3 = i;
        this.l2 = c619350OQz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0301000_9(BulletinProfileViewModel bulletinProfileViewModel, BulletinBoardInfo bulletinBoardInfo, BulletinAccountEditResponse bulletinAccountEditResponse, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = bulletinProfileViewModel;
        this.l1 = bulletinBoardInfo;
        this.l2 = bulletinAccountEditResponse;
        this.i3 = i;
    }
}
