package com.ss.android.ugc.aweme.notification.v2.viewmodel;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0PEM;
import X.C13BV;
import X.C15438062q;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1869670ykn;
import X.C1889530zGp;
import X.C1890910zJ3;
import X.C1900360zYI;
import X.C1900630zYj;
import X.C1900830zZ3;
import X.C1900970zZH;
import X.C1900980zZI;
import X.C1901230zZh;
import X.C1901600zaI;
import X.C1901610zaJ;
import X.C1902710zc5;
import X.C1907040zj4;
import X.C2187451AjH;
import X.C23250099c;
import X.C452501pT;
import X.C687700QyG;
import X.C723600SZy;
import X.C890290YwF;
import X.C897980ZKq;
import X.EnumC1155150gAL;
import X.EnumC1599580rjA;
import X.EnumC1900710zYr;
import X.EnumC1906270zhp;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeFilterModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope;
import com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class NotificationCreatorResultViewModel extends BaseNotificationResultViewModel implements InterfaceC1146704e9 {
    public AnonymousClass0956 LLILZ;
    public AnonymousClass0956 LLILZIL;
    public NoticeTabModel LLIZ;
    public Integer LLIZLLLIL;
    public String LLJI;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C1869670ykn.class, "notification_result_fragment_model"), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 444));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(305));
    public List<Integer> LLJ = C13BV.INSTANCE;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(306));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(309));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(307));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(308));

    @Override // com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel
    public final void AQ2() {
        this.LL = false;
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        String str = (String) this.LLILLL.getValue();
        c1889530zGp.getClass();
        C1889530zGp.LIZ(str, "onLoadMore()");
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1890910zJ3(this, null), 2);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CreatorNoticeTabScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreatorNoticeTabScope.class);
        return arrayList;
    }

    public final String EQ2() {
        NoticeTabModel noticeTabModel = this.LLIZ;
        if (noticeTabModel != null) {
            return noticeTabModel.trackingName;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8 A[PHI: r1
      0x00a8: PHI (r1v1 int) = (r1v0 int), (r1v5 int), (r1v5 int) binds: [B:52:0x00a6, B:13:0x0024, B:40:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad A[PHI: r1 r7
      0x00ad: PHI (r1v2 int) = (r1v1 int), (r1v4 int), (r1v4 int) binds: [B:54:0x00ab, B:18:0x0033, B:31:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r7v1 int) = (r7v0 int), (r7v3 int), (r7v3 int) binds: [B:54:0x00ab, B:18:0x0033, B:31:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1900540zYa xQ2() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel r0 = r9.LLIZ
            if (r0 == 0) goto Lb1
            int r0 = r0.tabId
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        La:
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r8 == 0) goto La3
            int r0 = r8.intValue()
            if (r0 == r6) goto La3
            int r0 = r8.intValue()
            if (r0 != r5) goto L84
            r1 = 2131830218(0x7f1125ca, float:1.9293427E38)
        L20:
            int r0 = r8.intValue()
            if (r0 == r6) goto La8
            int r0 = r8.intValue()
            if (r0 != r5) goto L66
            r7 = 2131830219(0x7f1125cb, float:1.929343E38)
        L2f:
            int r0 = r8.intValue()
            if (r0 == r6) goto Lad
            int r0 = r8.intValue()
            if (r0 != r5) goto L48
            r0 = 2130774040(0x7f010818, float:1.7151244E38)
        L3e:
            X.0zYa r2 = new X.0zYa
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r1, r7, r0)
            return r2
        L48:
            int r0 = r8.intValue()
            if (r0 != r4) goto L52
            r0 = 2130774032(0x7f010810, float:1.7151227E38)
            goto L3e
        L52:
            int r0 = r8.intValue()
            if (r0 != r3) goto L5c
            r0 = 2130774060(0x7f01082c, float:1.7151284E38)
            goto L3e
        L5c:
            int r0 = r8.intValue()
            if (r0 != r2) goto Lad
            r0 = 2130774048(0x7f010820, float:1.715126E38)
            goto L3e
        L66:
            int r0 = r8.intValue()
            if (r0 != r4) goto L70
            r7 = 2131830223(0x7f1125cf, float:1.9293437E38)
            goto L2f
        L70:
            int r0 = r8.intValue()
            if (r0 != r3) goto L7a
            r7 = 2131830221(0x7f1125cd, float:1.9293433E38)
            goto L2f
        L7a:
            int r0 = r8.intValue()
            if (r0 != r2) goto La8
            r7 = 2131830227(0x7f1125d3, float:1.9293445E38)
            goto L2f
        L84:
            int r0 = r8.intValue()
            if (r0 != r4) goto L8e
            r1 = 2131830222(0x7f1125ce, float:1.9293435E38)
            goto L20
        L8e:
            int r0 = r8.intValue()
            if (r0 != r3) goto L98
            r1 = 2131830220(0x7f1125cc, float:1.9293431E38)
            goto L20
        L98:
            int r0 = r8.intValue()
            if (r0 != r2) goto La3
            r1 = 2131830226(0x7f1125d2, float:1.9293443E38)
            goto L20
        La3:
            r1 = 2131830216(0x7f1125c8, float:1.9293423E38)
            if (r8 != 0) goto L20
        La8:
            r7 = 2131830217(0x7f1125c9, float:1.9293425E38)
            if (r8 != 0) goto L2f
        Lad:
            r0 = 2130774061(0x7f01082d, float:1.7151286E38)
            goto L3e
        Lb1:
            r8 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationCreatorResultViewModel.xQ2():X.0zYa");
    }

    @Override // com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel
    public final List<InterfaceC1891350zJl> yQ2() {
        return (List) this.LLJILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel
    public final List<MusNotice> zQ2() {
        return (List) this.LLJILJIL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C1869670ykn c1869670ykn = (C1869670ykn) this.LLILLJJLI.getValue();
        this.LLIZ = c1869670ykn != null ? c1869670ykn.LLILLL : null;
    }

    @Override // com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel
    public final void BQ2(EnumC1599580rjA enumC1599580rjA) {
        AwS429S0200000_28 awS429S0200000_28 = new AwS429S0200000_28(this, enumC1599580rjA, 44);
        if (C897980ZKq.LIZ()) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("NotificationResultViewModel", "load but children mode");
            setState(AFwS271S0000000_28.get$arr$(398));
            return;
        }
        awS429S0200000_28.invoke();
    }

    public final void CQ2(boolean z) {
        InterfaceC1891350zJl next;
        C1900970zZH c1900970zZH;
        MusNotice musNotice;
        String strLIZJ;
        AwS572S0100000_28 awS572S0100000_28;
        List<NoticeSortModel> list;
        boolean z2;
        yQ2().clear();
        List<InterfaceC1891350zJl> listYQ2 = yQ2();
        NoticeTabModel noticeTabModel = this.LLIZ;
        if (noticeTabModel != null) {
            C890290YwF c890290YwF = C890290YwF.LIZIZ;
            if (c890290YwF.LIZJ(false)) {
                setState(new AwS607S0100000_28(this, 327));
            }
            Integer num = this.LLIZLLLIL;
            if (num != null) {
                int iIntValue = num.intValue();
                List<NoticeSortModel> list2 = noticeTabModel.sortOptionList;
                List<NoticeFilterModel> list3 = noticeTabModel.filterOptionList;
                if (iIntValue != EnumC1155150gAL.UN_SUPPORT.getId() && list2 != null && !list2.isEmpty()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                boolean zLIZ = C1900830zZ3.LIZ("filter_vh", list3);
                if ((!z2 || !zLIZ) && !c890290YwF.LIZJ(false)) {
                    List<Integer> list4 = this.LLJ;
                    String str = noticeTabModel.trackingName;
                    if (str == null) {
                        str = "";
                    }
                    listYQ2.add(new C1901600zaI(iIntValue, list4, str, noticeTabModel.sortOptionList, noticeTabModel.filterOptionList));
                }
            }
        }
        if (z && zQ2().isEmpty()) {
            EnumC1599580rjA enumC1599580rjA = EnumC1599580rjA.PULL_TO_REFRESH;
            enumC1599580rjA.setDetail("first_refresh");
            yQ2().add(new C1900980zZI(new AwS429S0200000_28(this, enumC1599580rjA, 43), EnumC1906270zhp.NEW_ACTIVITY));
            zQ2().clear();
            return;
        }
        List<InterfaceC1891350zJl> listYQ22 = yQ2();
        List<MusNotice> listZQ2 = zQ2();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listZQ2, 10));
        int i = 0;
        for (MusNotice musNotice2 : listZQ2) {
            int i2 = i + 1;
            if (i >= 0) {
                MusNotice musNotice3 = musNotice2;
                String strLIZIZ = C1902710zc5.LIZIZ(musNotice3.timeLineType);
                String strEQ2 = EQ2();
                List listLIZ = C1907040zj4.LIZ(musNotice3.type);
                Integer num2 = this.LLIZLLLIL;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    NoticeTabModel noticeTabModel2 = this.LLIZ;
                    if (noticeTabModel2 != null) {
                        list = noticeTabModel2.sortOptionList;
                    } else {
                        list = null;
                    }
                    strLIZJ = C1901610zaJ.LIZJ(iIntValue2, list);
                } else {
                    strLIZJ = null;
                }
                C1901230zZh c1901230zZh = new C1901230zZh(strLIZJ, EQ2());
                AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 107);
                AwS607S0100000_28 awS607S0100000_282 = new AwS607S0100000_28(this, 108);
                if (i == zQ2().size() - 10) {
                    awS572S0100000_28 = new AwS572S0100000_28(this, 443);
                } else {
                    awS572S0100000_28 = null;
                }
                arrayList.add(new C1900970zZH(musNotice3, strLIZIZ, strEQ2, false, listLIZ, true, c1901230zZh, awS607S0100000_28, awS607S0100000_282, awS572S0100000_28, null, 17792));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        listYQ22.addAll(arrayList);
        if (C890290YwF.LIZIZ.LIZJ(false)) {
            C1900360zYI.LIZIZ(yQ2());
        }
        for (BaseNotice baseNotice : (List) this.LLJILJILJ.getValue()) {
            Iterator<InterfaceC1891350zJl> it2 = yQ2().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    InterfaceC1891350zJl interfaceC1891350zJl = next;
                    if ((interfaceC1891350zJl instanceof C1900970zZH) && Intrinsics.LJFF(((C1900970zZH) interfaceC1891350zJl).LL.nid, baseNotice.nid)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if ((next instanceof C1900970zZH) && (c1900970zZH = (C1900970zZH) next) != null && (musNotice = c1900970zZH.LL) != null && baseNotice.hasRead) {
                musNotice.hasRead = true;
                GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
                if (generalTemplateNotice != null) {
                    generalTemplateNotice.hasRead = true;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x041d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DQ2(X.AbstractC1623806Xk<com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse> r29, X.EnumC1900710zYr r30, com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel r31) {
        /*
            Method dump skipped, instruction units count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationCreatorResultViewModel.DQ2(X.06Xk, X.0zYr, com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel):void");
    }

    public final void FQ2(EnumC1900710zYr enumC1900710zYr, boolean z, boolean z2) {
        if (yQ2().isEmpty()) {
            setState(AFwS271S0000000_28.get$arr$(185));
            return;
        }
        if (z) {
            setState(AFwS271S0000000_28.get$arr$(186));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(yQ2());
        setState(new C1900630zYj(arrayList, z, enumC1900710zYr, z2));
    }
}
