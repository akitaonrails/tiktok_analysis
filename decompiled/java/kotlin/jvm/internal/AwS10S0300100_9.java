package kotlin.jvm.internal;

import X.C09AY;
import X.C0OIV;
import X.C0OKY;
import X.C1623606Xi;
import X.EnumC617060OIe;
import X.EnumC617480OJu;
import X.EnumC620430OVd;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBizResourceEntry;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFunctionSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPublishAction;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSubscriptionInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS10S0300100_9 extends C09AY implements Function1 {
    public final int $t;
    public long j3;
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
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS10S0300100_9 awS10S0300100_9, Object obj) {
        ArrayList arrayList;
        C0OKY c0oky = (C0OKY) obj;
        C1623606Xi c1623606Xi = new C1623606Xi("");
        BulletinProfileViewModel bulletinProfileViewModel = (BulletinProfileViewModel) awS10S0300100_9.l0;
        long j = awS10S0300100_9.j3;
        BulletinAccountInfoResponse bulletinAccountInfoResponse = (BulletinAccountInfoResponse) awS10S0300100_9.l1;
        List<BulletinFunctionSetting> list = bulletinAccountInfoResponse.bulletinFunctionSettings;
        List<InboxEntranceFunction> list2 = bulletinAccountInfoResponse.functionList;
        BulletinBoardInfo bulletinBoardInfo = (BulletinBoardInfo) awS10S0300100_9.l2;
        List<InterfaceC1891350zJl> listIQ2 = bulletinProfileViewModel.IQ2(j, list, list2, bulletinBoardInfo.editQuota, bulletinBoardInfo.status, Integer.valueOf(bulletinAccountInfoResponse.identity));
        List<BulletinPublishAction> list3 = ((BulletinAccountInfoResponse) awS10S0300100_9.l1).quickPostSettingList;
        ArrayList arrayList2 = null;
        if (list3 != null) {
            BulletinProfileViewModel bulletinProfileViewModel2 = (BulletinProfileViewModel) awS10S0300100_9.l0;
            arrayList = new ArrayList();
            for (BulletinPublishAction bulletinPublishAction : list3) {
                BulletinPublishAction bulletinPublishAction2 = bulletinPublishAction;
                if (!bulletinProfileViewModel2.GQ2() || bulletinPublishAction2.getPublishActionType() != EnumC620430OVd.IMAGE_UPLOAD.getPostType()) {
                    arrayList.add(bulletinPublishAction);
                }
            }
        } else {
            arrayList = null;
        }
        List<BulletinPublishAction> list4 = ((BulletinAccountInfoResponse) awS10S0300100_9.l1).plusPostSettingList;
        if (list4 != null) {
            BulletinProfileViewModel bulletinProfileViewModel3 = (BulletinProfileViewModel) awS10S0300100_9.l0;
            arrayList2 = new ArrayList();
            for (BulletinPublishAction bulletinPublishAction3 : list4) {
                BulletinPublishAction bulletinPublishAction4 = bulletinPublishAction3;
                if (!bulletinProfileViewModel3.GQ2() || bulletinPublishAction4.getPublishActionType() != EnumC620430OVd.IMAGE_UPLOAD.getPostType()) {
                    arrayList2.add(bulletinPublishAction3);
                }
            }
        }
        BulletinAccountInfoResponse bulletinAccountInfoResponse2 = (BulletinAccountInfoResponse) awS10S0300100_9.l1;
        return C0OKY.LIZ(c0oky, null, null, null, null, arrayList, arrayList2, 0L, null, null, null, null, null, null, listIQ2, null, c1623606Xi, bulletinAccountInfoResponse2.barEntrance, null, 0L, bulletinAccountInfoResponse2.bizResourceEntry, bulletinAccountInfoResponse2.embeddedPublishContent, bulletinAccountInfoResponse2.toolkitOrders, null, null, null, null, null, false, null, null, 2139930575);
    }

    public static final Object invoke$1(AwS10S0300100_9 awS10S0300100_9, Object obj) {
        ArrayList arrayList;
        C0OKY c0oky = (C0OKY) obj;
        C1623606Xi c1623606Xi = new C1623606Xi("");
        BulletinProfileViewModel bulletinProfileViewModel = (BulletinProfileViewModel) awS10S0300100_9.l0;
        long j = awS10S0300100_9.j3;
        BulletinAccountInfoResponse bulletinAccountInfoResponse = (BulletinAccountInfoResponse) awS10S0300100_9.l1;
        List<BulletinFunctionSetting> list = bulletinAccountInfoResponse.bulletinFunctionSettings;
        List<InboxEntranceFunction> list2 = bulletinAccountInfoResponse.functionList;
        BulletinBoardInfo bulletinBoardInfo = (BulletinBoardInfo) awS10S0300100_9.l2;
        List<InterfaceC1891350zJl> listIQ2 = bulletinProfileViewModel.IQ2(j, list, list2, bulletinBoardInfo.editQuota, bulletinBoardInfo.status, Integer.valueOf(bulletinAccountInfoResponse.identity));
        List<BulletinPublishAction> list3 = ((BulletinAccountInfoResponse) awS10S0300100_9.l1).quickPostSettingList;
        ArrayList arrayList2 = null;
        if (list3 != null) {
            BulletinProfileViewModel bulletinProfileViewModel2 = (BulletinProfileViewModel) awS10S0300100_9.l0;
            arrayList = new ArrayList();
            for (BulletinPublishAction bulletinPublishAction : list3) {
                BulletinPublishAction bulletinPublishAction2 = bulletinPublishAction;
                if (!bulletinProfileViewModel2.GQ2() || bulletinPublishAction2.getPublishActionType() != EnumC620430OVd.IMAGE_UPLOAD.getPostType()) {
                    arrayList.add(bulletinPublishAction);
                }
            }
        } else {
            arrayList = null;
        }
        List<BulletinPublishAction> list4 = ((BulletinAccountInfoResponse) awS10S0300100_9.l1).plusPostSettingList;
        if (list4 != null) {
            BulletinProfileViewModel bulletinProfileViewModel3 = (BulletinProfileViewModel) awS10S0300100_9.l0;
            arrayList2 = new ArrayList();
            for (BulletinPublishAction bulletinPublishAction3 : list4) {
                BulletinPublishAction bulletinPublishAction4 = bulletinPublishAction3;
                if (!bulletinProfileViewModel3.GQ2() || bulletinPublishAction4.getPublishActionType() != EnumC620430OVd.IMAGE_UPLOAD.getPostType()) {
                    arrayList2.add(bulletinPublishAction3);
                }
            }
        }
        BulletinAccountInfoResponse bulletinAccountInfoResponse2 = (BulletinAccountInfoResponse) awS10S0300100_9.l1;
        return C0OKY.LIZ(c0oky, null, null, null, null, arrayList, arrayList2, 0L, null, null, null, null, null, null, listIQ2, null, c1623606Xi, bulletinAccountInfoResponse2.barEntrance, null, 0L, bulletinAccountInfoResponse2.bizResourceEntry, bulletinAccountInfoResponse2.embeddedPublishContent, bulletinAccountInfoResponse2.toolkitOrders, null, null, null, null, null, false, null, null, 2139930575);
    }

    public static final Object invoke$2(AwS10S0300100_9 awS10S0300100_9, Object obj) {
        Integer numValueOf;
        long jLongValue;
        ArrayList arrayList;
        ArrayList arrayList2;
        long jLongValue2;
        C0OKY c0oky = (C0OKY) obj;
        C1623606Xi c1623606Xi = new C1623606Xi((BulletinBoardInfo) awS10S0300100_9.l0);
        C1623606Xi c1623606Xi2 = new C1623606Xi("");
        EnumC617060OIe enumC617060OIeLIZ = c0oky.LLILLJJLI.LIZ();
        BulletinSubscriptionInfo bulletinSubscriptionInfo = ((BulletinAccountInfoResponse) awS10S0300100_9.l1).subscriptionInfo;
        Integer numValueOf2 = null;
        if (bulletinSubscriptionInfo != null) {
            numValueOf = Integer.valueOf(bulletinSubscriptionInfo.subscribeStatus);
        } else {
            numValueOf = null;
        }
        EnumC617480OJu enumC617480OJuLIZ = C0OIV.LIZ(enumC617060OIeLIZ, numValueOf, ((BulletinBoardInfo) awS10S0300100_9.l0).status);
        BulletinProfileViewModel bulletinProfileViewModel = (BulletinProfileViewModel) awS10S0300100_9.l2;
        long j = awS10S0300100_9.j3;
        BulletinAccountInfoResponse bulletinAccountInfoResponse = (BulletinAccountInfoResponse) awS10S0300100_9.l1;
        List<BulletinFunctionSetting> list = bulletinAccountInfoResponse.bulletinFunctionSettings;
        List<InboxEntranceFunction> list2 = bulletinAccountInfoResponse.functionList;
        BulletinBoardInfo bulletinBoardInfo = (BulletinBoardInfo) awS10S0300100_9.l0;
        List<InterfaceC1891350zJl> listIQ2 = bulletinProfileViewModel.IQ2(j, list, list2, bulletinBoardInfo.editQuota, bulletinBoardInfo.status, Integer.valueOf(bulletinAccountInfoResponse.identity));
        Long l = ((BulletinBoardInfo) awS10S0300100_9.l0).subscriberCount;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        List<BulletinPublishAction> list3 = ((BulletinAccountInfoResponse) awS10S0300100_9.l1).quickPostSettingList;
        if (list3 != null) {
            BulletinProfileViewModel bulletinProfileViewModel2 = (BulletinProfileViewModel) awS10S0300100_9.l2;
            arrayList = new ArrayList();
            for (BulletinPublishAction bulletinPublishAction : list3) {
                BulletinPublishAction bulletinPublishAction2 = bulletinPublishAction;
                if (!bulletinProfileViewModel2.GQ2() || bulletinPublishAction2.getPublishActionType() != EnumC620430OVd.IMAGE_UPLOAD.getPostType()) {
                    arrayList.add(bulletinPublishAction);
                }
            }
        } else {
            arrayList = null;
        }
        List<BulletinPublishAction> list4 = ((BulletinAccountInfoResponse) awS10S0300100_9.l1).plusPostSettingList;
        if (list4 != null) {
            BulletinProfileViewModel bulletinProfileViewModel3 = (BulletinProfileViewModel) awS10S0300100_9.l2;
            arrayList2 = new ArrayList();
            for (BulletinPublishAction bulletinPublishAction3 : list4) {
                BulletinPublishAction bulletinPublishAction4 = bulletinPublishAction3;
                if (!bulletinProfileViewModel3.GQ2() || bulletinPublishAction4.getPublishActionType() != EnumC620430OVd.IMAGE_UPLOAD.getPostType()) {
                    arrayList2.add(bulletinPublishAction3);
                }
            }
        } else {
            arrayList2 = null;
        }
        Long l2 = ((BulletinBoardInfo) awS10S0300100_9.l0).quota;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        BulletinAccountInfoResponse bulletinAccountInfoResponse2 = (BulletinAccountInfoResponse) awS10S0300100_9.l1;
        List<BulletinBizResourceEntry> list5 = bulletinAccountInfoResponse2.bizResourceEntry;
        BulletinProfileViewModel bulletinProfileViewModel4 = (BulletinProfileViewModel) awS10S0300100_9.l2;
        BulletinBoardInfo bulletinBoardInfo2 = (BulletinBoardInfo) awS10S0300100_9.l0;
        String str = bulletinAccountInfoResponse2.contentPb;
        String str2 = bulletinAccountInfoResponse2.shareUrl;
        int i = bulletinAccountInfoResponse2.identity;
        BulletinSubscriptionInfo bulletinSubscriptionInfo2 = bulletinAccountInfoResponse2.subscriptionInfo;
        if (bulletinSubscriptionInfo2 != null) {
            numValueOf2 = Integer.valueOf(bulletinSubscriptionInfo2.subscribeStatus);
        }
        bulletinProfileViewModel4.getClass();
        BulletinShareModel bulletinShareModelWQ2 = BulletinProfileViewModel.wQ2(bulletinBoardInfo2, str, str2, i, numValueOf2);
        BulletinAccountInfoResponse bulletinAccountInfoResponse3 = (BulletinAccountInfoResponse) awS10S0300100_9.l1;
        return C0OKY.LIZ(c0oky, c1623606Xi, null, null, bulletinShareModelWQ2, arrayList, arrayList2, jLongValue, enumC617480OJuLIZ, null, null, null, null, null, listIQ2, null, c1623606Xi2, bulletinAccountInfoResponse3.barEntrance, null, jLongValue2, list5, bulletinAccountInfoResponse3.embeddedPublishContent, bulletinAccountInfoResponse3.toolkitOrders, null, null, null, null, null, false, null, null, 2139406086);
    }

    public static final Object invoke$3(AwS10S0300100_9 awS10S0300100_9, Object obj) {
        BulletinProfileViewModel bulletinProfileViewModel = (BulletinProfileViewModel) awS10S0300100_9.l0;
        long j = awS10S0300100_9.j3;
        BulletinAccountEditResponse bulletinAccountEditResponse = (BulletinAccountEditResponse) awS10S0300100_9.l1;
        List<BulletinFunctionSetting> list = bulletinAccountEditResponse.bulletinFunctionSettings;
        List<InboxEntranceFunction> list2 = bulletinAccountEditResponse.functionList;
        BulletinBoardInfo bulletinBoardInfo = (BulletinBoardInfo) awS10S0300100_9.l2;
        return C0OKY.LIZ((C0OKY) obj, null, null, null, null, null, null, 0L, null, null, null, null, null, null, bulletinProfileViewModel.IQ2(j, list, list2, bulletinBoardInfo.editQuota, bulletinBoardInfo.status, Integer.valueOf(EnumC617060OIe.IDENTITY_CREATOR.getValue())), null, null, null, null, 0L, null, null, null, null, null, null, null, null, false, null, null, 2147467263);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS10S0300100_9(long r3, com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel r5, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse r6, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            switch(r8) {
                case 0: goto L13;
                case 1: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r7
            r1.l1 = r6
            r1.l2 = r5
            r1.j3 = r3
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r5
            r1.j3 = r3
            r1.l1 = r6
            r1.l2 = r7
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS10S0300100_9.<init>(long, com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S0300100_9(BulletinProfileViewModel bulletinProfileViewModel, long j, BulletinAccountEditResponse bulletinAccountEditResponse, BulletinBoardInfo bulletinBoardInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = bulletinProfileViewModel;
        this.j3 = j;
        this.l1 = bulletinAccountEditResponse;
        this.l2 = bulletinBoardInfo;
    }
}
