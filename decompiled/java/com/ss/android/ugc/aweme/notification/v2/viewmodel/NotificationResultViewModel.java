package com.ss.android.ugc.aweme.notification.v2.viewmodel;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0PEM;
import X.C15438062q;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C1703100uQ8;
import X.C1720106oR;
import X.C1869670ykn;
import X.C1889530zGp;
import X.C1900360zYI;
import X.C1900540zYa;
import X.C1900970zZH;
import X.C1901270zZl;
import X.C1902710zc5;
import X.C1904270zeb;
import X.C1904510zez;
import X.C1907040zj4;
import X.C2187451AjH;
import X.C23250099c;
import X.C452501pT;
import X.C723600SZy;
import X.C890290YwF;
import X.C897980ZKq;
import X.EnumC1599580rjA;
import X.EnumC1889770zHD;
import X.EnumC1900750zYv;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupFilterStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class NotificationResultViewModel extends BaseNotificationResultViewModel {
    public long LLILZLL;
    public AnonymousClass0956 LLJ;
    public AnonymousClass0956 LLJI;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C1869670ykn.class, "notification_result_fragment_model"), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 446));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(312));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(311));
    public String LLIZ = "";
    public C1901270zZl LLIZLLLIL = new C1901270zZl();

    @Override // com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel
    public final void AQ2() {
        this.LL = false;
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        String str = (String) this.LLILLL.getValue();
        c1889530zGp.getClass();
        C1889530zGp.LIZ(str, "onLoadMore()");
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1703100uQ8(this, null), 2);
    }

    public final List<InterfaceC1891350zJl> CQ2() {
        InterfaceC1891350zJl next;
        C1900970zZH c1900970zZH;
        MusNotice musNotice;
        yQ2().clear();
        List<InterfaceC1891350zJl> listYQ2 = yQ2();
        List<MusNotice> listZQ2 = zQ2();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listZQ2, 10));
        int i = 0;
        for (MusNotice musNotice2 : listZQ2) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            MusNotice musNotice3 = musNotice2;
            arrayList.add(new C1900970zZH(musNotice3, C1902710zc5.LIZIZ(musNotice3.timeLineType), C1902710zc5.LIZ(Integer.valueOf(getGroupType())), false, C1907040zj4.LIZ(musNotice3.type), true, null, new AwS607S0100000_28(this, 112), new AwS607S0100000_28(this, 113), i == zQ2().size() + (-10) ? new AwS572S0100000_28(this, 445) : null, null, 18304));
            i = i2;
        }
        listYQ2.addAll(arrayList);
        if (C890290YwF.LIZIZ.LIZJ(false)) {
            C1900360zYI.LIZIZ(yQ2());
        }
        for (MusNotice musNotice4 : zQ2()) {
            Iterator<InterfaceC1891350zJl> it2 = yQ2().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                InterfaceC1891350zJl interfaceC1891350zJl = next;
                if ((interfaceC1891350zJl instanceof C1900970zZH) && Intrinsics.LJFF(((C1900970zZH) interfaceC1891350zJl).LL.nid, musNotice4.nid)) {
                    break;
                }
            }
            if ((next instanceof C1900970zZH) && (c1900970zZH = (C1900970zZH) next) != null && (musNotice = c1900970zZH.LL) != null && musNotice4.hasRead) {
                musNotice.hasRead = true;
                GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
                if (generalTemplateNotice != null) {
                    generalTemplateNotice.hasRead = true;
                }
            }
        }
        return yQ2();
    }

    public final C1869670ykn FQ2() {
        return (C1869670ykn) this.LLILLJJLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel
    public final List<InterfaceC1891350zJl> yQ2() {
        return (List) this.LLILZIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel
    public final List<MusNotice> zQ2() {
        return (List) this.LLILZ.getValue();
    }

    public int getGroupType() {
        GroupFilterStruct groupFilterStruct;
        C1869670ykn c1869670yknFQ2 = FQ2();
        return (c1869670yknFQ2 == null || (groupFilterStruct = c1869670yknFQ2.LLILZ) == null) ? C1904270zeb.LIZJ : groupFilterStruct.noticeGroup;
    }

    @Override // com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel
    public final C1900540zYa xQ2() {
        GroupFilterStruct groupFilterStruct;
        GroupFilterStruct groupFilterStruct2;
        GroupFilterStruct groupFilterStruct3;
        C1869670ykn c1869670yknFQ2 = FQ2();
        Integer num = null;
        int i = (c1869670yknFQ2 == null || (groupFilterStruct3 = c1869670yknFQ2.LLILZ) == null) ? 2131838266 : groupFilterStruct3.titleId;
        C1869670ykn c1869670yknFQ22 = FQ2();
        int i2 = (c1869670yknFQ22 == null || (groupFilterStruct2 = c1869670yknFQ22.LLILZ) == null) ? 2131838271 : groupFilterStruct2.descId;
        C1869670ykn c1869670yknFQ23 = FQ2();
        if (c1869670yknFQ23 != null && (groupFilterStruct = c1869670yknFQ23.LLILZ) != null) {
            num = groupFilterStruct.placeHolderResId;
        }
        return new C1900540zYa(i, i2, num);
    }

    @Override // com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel
    public void BQ2(EnumC1599580rjA enumC1599580rjA) {
        AwS429S0200000_28 awS429S0200000_28 = new AwS429S0200000_28(this, enumC1599580rjA, 45);
        if (C897980ZKq.LIZ()) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("NotificationResultViewModel", "load but children mode");
            setState(AFwS271S0000000_28.get$arr$(398));
            return;
        }
        awS429S0200000_28.invoke();
    }

    public final void HQ2(EnumC1900750zYv enumC1900750zYv) {
        C1904510zez.LJFF.LJIIJ("notice", EnumC1889770zHD.FAIL);
        if (zQ2().isEmpty()) {
            setState(AFwS271S0000000_28.get$arr$(191));
        } else {
            setState(AFwS271S0000000_28.get$arr$(192));
            setState(new AwS394S0200000_28(this, enumC1900750zYv, 31));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EQ2(com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse r33, X.EnumC1900750zYv r34) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel.EQ2(com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse, X.0zYv):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object GQ2(com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel r7, java.lang.String r8, X.EnumC1900750zYv r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel.GQ2(com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel, java.lang.String, X.0zYv, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String DQ2(com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel r15, int r16, long r17, long r19, long r21, java.lang.String r23, int r24) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel.DQ2(com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel, int, long, long, long, java.lang.String, int):java.lang.String");
    }
}
