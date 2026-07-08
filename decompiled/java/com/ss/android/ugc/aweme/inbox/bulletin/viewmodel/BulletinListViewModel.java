package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.AbstractC316870CbV;
import X.AnonymousClass0956;
import X.C01GW;
import X.C054G;
import X.C08EX;
import X.C09R9;
import X.C0OHU;
import X.C0OHW;
import X.C0OI4;
import X.C0OJO;
import X.C0OJP;
import X.C0OJQ;
import X.C0OJU;
import X.C0OJV;
import X.C0OJZ;
import X.C0OK3;
import X.C0OK6;
import X.C0OKA;
import X.C0OKC;
import X.C0OKD;
import X.C0OKS;
import X.C0OLV;
import X.C0ONX;
import X.C0OOH;
import X.C0OPF;
import X.C0OPX;
import X.C0PEM;
import X.C0R1H;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C1559260qg8;
import X.C1720106oR;
import X.C20600815jK;
import X.C2095008Iq;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2286608xc;
import X.C2296808zG;
import X.C23250099c;
import X.C290750BaT;
import X.C316650Cb9;
import X.C317290CcB;
import X.C452501pT;
import X.C605490Nox;
import X.C605550Np3;
import X.C605670NpF;
import X.C616770OHb;
import X.C616870OHl;
import X.C616880OHm;
import X.C617330OJf;
import X.C617340OJg;
import X.C617360OJi;
import X.C617390OJl;
import X.C621270OYj;
import X.C623470Ocr;
import X.C627260Oiy;
import X.C627660Ojc;
import X.C723600SZy;
import X.C724750Sbp;
import X.EnumC044600Ea;
import X.EnumC323450Cm7;
import X.EnumC618810OOx;
import X.InterfaceC0148002o;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC617160OIo;
import X.InterfaceC617290OJb;
import X.InterfaceC736910SvR;
import Y.AComparatorS28S0000000_9;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.utils.event.BulletinBoardListChangeEvent;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEvent;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEventResponse;
import defpackage.r0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS107S0400000_9;
import kotlin.jvm.internal.AwS218S0300000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS44S0500000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinListViewModel extends AssemListViewModel<C616880OHm, InterfaceC1891350zJl, String> implements C0OJU {
    public final InterfaceC617160OIo LL;
    public final InterfaceC617290OJb LLILLJJLI;
    public volatile long LLILZLL;
    public C0OOH LLJILJILJ;
    public Long LLJILLL;
    public volatile boolean LLJJ;
    public final C09R9 LLILLL = new C09R9(this, C13LE.LIZ(C0ONX.class));
    public final C1559260qg8 LLILZ = new C1559260qg8(new C723600SZy(this, C0OLV.class, "bulletin_board_param"), true);
    public final C08EX LLILZIL = new C08EX(new AwS410S0200000_9(new AwS553S0100000_9(this, 823), C724750Sbp.LJII(this), 25));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 822));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 821));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(194));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 820));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 824));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 825));

    public final C0OK3 BQ2() {
        return (C0OK3) this.LLIZLLLIL.getValue();
    }

    public final C0OI4 CQ2() {
        return (C0OI4) this.LLILZIL.getValue();
    }

    public final BulletinBoardListChangeEvent DQ2() {
        return (BulletinBoardListChangeEvent) this.LLJIJIL.getValue();
    }

    public final Boolean EQ2() {
        int i = C0OJQ.LIZ[this.LL.Kf().getIdentityTpe().ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public final r0 GQ2() {
        return (r0) this.LLJILJIL.getValue();
    }

    public final C0OLV Hh2() {
        return (C0OLV) this.LLILZ.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C616880OHm(0);
    }

    public final InterfaceC736910SvR<C0OKS> zQ2() {
        return (InterfaceC736910SvR) this.LLILLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCleared() {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel.onCleared():void");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C0OLV c0olvHh2;
        String str;
        String str2;
        super.onPrepared();
        EventBus.LIZLLL().LJIJJ(this);
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C0OHW(this, null), 3);
        C0OLV c0olvHh22 = Hh2();
        if (c0olvHh22 != null && (str2 = c0olvHh22.LL) != null && str2.length() != 0) {
            C621270OYj.LIZ.putIfAbsent(str2, new ConcurrentHashMap<>());
        }
        if (this.LLJJ || !C616770OHb.LIZ() || CQ2() == null || this.LLIZ.getValue() == null || (c0olvHh2 = Hh2()) == null || (str = c0olvHh2.LL) == null) {
            return;
        }
        YQ2(str);
        this.LLJJ = true;
        C0OPX.LJII("BBArch [ListVM] tasks early-submitted in onPrepared");
    }

    @Override // X.C0OJU
    public final C0OOH Ly() {
        return this.LLJILJILJ;
    }

    public static Long FQ2(C616870OHl c616870OHl) {
        EnumC044600Ea enumC044600Ea;
        BulletinBaseItem bulletinBaseItemPrevious;
        if (c616870OHl != null) {
            enumC044600Ea = c616870OHl.LIZ;
        } else {
            enumC044600Ea = null;
        }
        if (enumC044600Ea != EnumC044600Ea.SUCCESS) {
            return null;
        }
        List<BulletinBaseItem> list = c616870OHl.LIZLLL;
        ListIterator<BulletinBaseItem> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                bulletinBaseItemPrevious = listIterator.previous();
                BulletinBaseItem bulletinBaseItem = bulletinBaseItemPrevious;
                if (bulletinBaseItem.LJIIZILJ() != 0 && !bulletinBaseItem.LLILLL && bulletinBaseItem.LJJIL()) {
                    break;
                }
            } else {
                bulletinBaseItemPrevious = null;
                break;
            }
        }
        BulletinBaseItem bulletinBaseItem2 = bulletinBaseItemPrevious;
        if (bulletinBaseItem2 == null) {
            return null;
        }
        return Long.valueOf(bulletinBaseItem2.LJIIZILJ());
    }

    public static boolean MQ2(BulletinBaseItem bulletinBaseItem) {
        if (bulletinBaseItem != null && !bulletinBaseItem.LLILLL && bulletinBaseItem.LJJIL()) {
            C0OK6 c0ok6 = bulletinBaseItem.itemType;
            if (c0ok6 != C0OK6.CONTENT) {
                if (c0ok6 == C0OK6.INLINE && bulletinBaseItem.LIZLLL() != EnumC618810OOx.NONE) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(X.InterfaceC1364105Vn<? super X.C616870OHl> r19) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel.AQ2(X.05Vn):java.lang.Object");
    }

    public final void HQ2(C616870OHl c616870OHl) {
        long jLJIIZILJ;
        BulletinBaseItem bulletinBaseItem = (BulletinBaseItem) C13LP.LJJJLL(c616870OHl.LIZLLL);
        long jLongValue = 0;
        if (bulletinBaseItem != null) {
            jLJIIZILJ = bulletinBaseItem.LJIIZILJ();
        } else {
            jLJIIZILJ = 0;
        }
        Long l = c616870OHl.LJII;
        if (l != null) {
            jLongValue = l.longValue();
        }
        if (C290750BaT.LIZ()) {
            C617360OJi c617360OJi = (C617360OJi) this.LLJI.getValue();
            C0OJO c0ojo = new C0OJO(this);
            C0OKC c0okc = new C0OKC(this);
            c617360OJi.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinSubscribePeriodicRequestHandler + initPeriodicConfig, lastCreateTime=");
            sbLIZ.append(jLJIIZILJ);
            sbLIZ.append(", startTime=");
            sbLIZ.append(jLongValue);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            AnonymousClass0956 anonymousClass0956 = c617360OJi.LJI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c617360OJi.LJI = null;
            c617360OJi.LIZJ = jLJIIZILJ;
            c617360OJi.LIZLLL = jLongValue;
            c617360OJi.LJ = c0ojo;
            c617360OJi.LJFF = c0okc;
            if (c617360OJi.LIZ()) {
                c617360OJi.LIZJ();
                return;
            }
            return;
        }
        C617340OJg value = C617340OJg.LIZJ.getValue();
        C0OJP c0ojp = new C0OJP(this);
        C0OKD c0okd = new C0OKD(this);
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        value.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BulletinSubscribePeriodicRequestHandler + initPeriodicConfig + ");
        sbLIZ2.append(this);
        sbLIZ2.append(", lastCreateTime=");
        sbLIZ2.append(jLJIIZILJ);
        sbLIZ2.append(", startTime=");
        sbLIZ2.append(jLongValue);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
        value.LIZJ(this);
        C617390OJl c617390OJl = new C617390OJl(value.LIZIZ, jLJIIZILJ, jLongValue, c0ojp, c0okd, c054gLIZ);
        value.LIZ.put(new WeakReference<>(this), c617390OJl);
        value.LIZ();
        if (!c617390OJl.LIZ()) {
            return;
        }
        value.LIZLLL(this);
    }

    public final boolean IQ2(long j) {
        String str;
        Long lLJIILIIL;
        C0OLV c0olvHh2 = Hh2();
        if (c0olvHh2 == null || (str = c0olvHh2.LL) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str)) == null || j != lLJIILIIL.longValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean JQ2(BulletinBaseItem bulletinBaseItem) {
        if (bulletinBaseItem == null) {
            return false;
        }
        C616880OHm c616880OHm = (C616880OHm) getState();
        c616880OHm.getClass();
        List<InterfaceC1891350zJl> listLIZ = C627260Oiy.LIZ(c616880OHm);
        if (listLIZ == null) {
            return false;
        }
        for (InterfaceC1891350zJl interfaceC1891350zJl : listLIZ) {
            if (interfaceC1891350zJl instanceof BulletinBaseItem) {
                BulletinBaseItem bulletinBaseItem2 = (BulletinBaseItem) interfaceC1891350zJl;
                if (bulletinBaseItem2.itemType == C0OK6.CONTENT) {
                    if (bulletinBaseItem.LJJJ() == null || !Intrinsics.LJFF(bulletinBaseItem.LJJJ(), bulletinBaseItem2.LJJJ())) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void YQ2(String str) {
        C605550Np3 c605550Np3 = (C605550Np3) this.LLIZ.getValue();
        if (c605550Np3 == null) {
            return;
        }
        c605550Np3.LIZLLL(new C605490Nox(str));
        c605550Np3.LIZLLL(new C605670NpF(str));
        C0OPX.LJII("BBArch [ListVM] tasks submitted");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 209));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        String str;
        boolean z;
        String str2;
        boolean zLJI = MethodIDManager.LJI(202527);
        C0OLV c0olvHh2 = Hh2();
        if (c0olvHh2 != null && (str = c0olvHh2.LL) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" channelID: ");
            sbLIZ.append(str);
            C0OPX.LJIILIIL("/tiktok/bulletin/item/list/", "fetch", C2188811AlT.LIZIZ(sbLIZ));
            if (C0OPF.LJI.LJI()) {
                C0OPF.LJIIIIZZ.LIZJ();
            }
            boolean z2 = true;
            if (CQ2() != null && C616770OHb.LIZ()) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BBDiag [onRefresh] dc=");
            if (CQ2() == null) {
                z2 = false;
            }
            sbLIZ2.append(z2);
            sbLIZ2.append(", abHit=");
            sbLIZ2.append(C616770OHb.LIZ());
            sbLIZ2.append(", path=");
            if (z) {
                str2 = "DC";
            } else {
                str2 = "Legacy";
            }
            sbLIZ2.append(str2);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            if (z) {
                Object objSQ2 = SQ2(str, interfaceC1364105Vn);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return objSQ2;
            }
            Object objRQ2 = RQ2(str, interfaceC1364105Vn);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return objRQ2;
        }
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        Exception exc = new Exception();
        c317290CcB.getClass();
        C316650Cb9 c316650Cb9 = new C316650Cb9(exc);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c316650Cb9;
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    @InterfaceC1294060jmO
    public final void tryRemoveSpecificItem(C0OJZ c0ojz) {
        if (!IQ2(c0ojz.LIZ)) {
            return;
        }
        withState(new AwS44S0500000_9(this, Long.valueOf(c0ojz.LIZIZ), C0OKA.FE_DELETE, 3));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void tryReportSpecificCardAction(C0OJV c0ojv) {
        if (IQ2(c0ojv.LIZ) && C0R1H.LIZJ(this) == Lifecycle.State.RESUMED) {
            WQ2(Long.valueOf(c0ojv.LIZ), c0ojv.LIZIZ, c0ojv.LIZJ, c0ojv.LIZLLL, c0ojv.LJ);
        }
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void tryUpdateSpecificItem(C617330OJf c617330OJf) {
        if (!IQ2(c617330OJf.LIZ)) {
            return;
        }
        withState(new AwS375S0200000_9(c617330OJf, this, 52));
    }

    public BulletinListViewModel(InterfaceC617160OIo interfaceC617160OIo, InterfaceC617290OJb interfaceC617290OJb) {
        this.LL = interfaceC617160OIo;
        this.LLILLJJLI = interfaceC617290OJb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r10 == null) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013f A[RETURN] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: PQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r21, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r22) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object QQ2(defpackage.o2<kotlin.Pair<java.lang.Long, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse>> r21, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r22) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel.QQ2(o2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object RQ2(java.lang.String r7, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0OJN
            if (r0 == 0) goto L51
            r5 = r8
            X.0OJN r5 = (X.C0OJN) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r4 = r5.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r5.LLILZIL
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L26
            if (r1 == r0) goto L38
            if (r1 != r2) goto L57
            X.C155000ia.LIZIZ(r4)
        L25:
            return r4
        L26:
            X.C155000ia.LIZIZ(r4)
            r5.LL = r7
            r5.LLILLJJLI = r6
            r5.LLILZIL = r0
            java.lang.Object r4 = r6.AQ2(r5)
            if (r4 != r3) goto L36
            return r3
        L36:
            r1 = r6
            goto L41
        L38:
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel r1 = r5.LLILLJJLI
            java.lang.Object r7 = r5.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r4)
        L41:
            X.0OHl r4 = (X.C616870OHl) r4
            r0 = 0
            r5.LL = r0
            r5.LLILLJJLI = r0
            r5.LLILZIL = r2
            java.lang.Object r4 = r1.VQ2(r4, r7, r5)
            if (r4 != r3) goto L25
            return r3
        L51:
            X.0OJN r5 = new X.0OJN
            r5.<init>(r6, r8)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel.RQ2(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object SQ2(java.lang.String r21, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r22) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel.SQ2(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadLatest(String str, InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("BulletinPageFragment", "BulletinListViewModel onLoadLatest()");
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }

    @Override // X.C0OJU
    public final void p81(List<BulletinFetchEvent> list, Map<String, String> map) {
        withState(new AwS218S0300000_9(this, (BulletinListViewModel) list, (List<BulletinFetchEvent>) map, (Map<String, String>) 5));
    }

    public final Object yQ2(long j, InterfaceC1364105Vn<? super BulletinFetchEventResponse> interfaceC1364105Vn) {
        String str;
        Long lLJIILIIL;
        C0OLV c0olvHh2 = Hh2();
        if (c0olvHh2 != null && (str = c0olvHh2.LL) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            return ((C0OKS) zQ2().getOperator()).LJZL(lLJIILIIL.longValue(), C2286608xc.LJFF(j), interfaceC1364105Vn);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object TQ2(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse r18, java.lang.String r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel.TQ2(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object VQ2(X.C616870OHl r9, java.lang.String r10, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r11) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel.VQ2(X.0OHl, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.C0OJU
    public final void jZ1(BulletinBaseItem bulletinBaseItem, BulletinBaseItem bulletinBaseItem2, C0OKA c0oka) {
        withState(new AwS107S0400000_9(this, bulletinBaseItem, bulletinBaseItem2, c0oka, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static List LQ2(List list, List list2, long j, long j2) {
        ?? arrayList;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof BulletinBaseItem) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                BulletinBaseItem bulletinBaseItem = (BulletinBaseItem) obj2;
                if (bulletinBaseItem.LJIIZILJ() > j || bulletinBaseItem.LJIIZILJ() < j2) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(list2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList3) {
            Long lLJJJ = ((BulletinBaseItem) obj3).LJJJ();
            Object arrayList4 = linkedHashMap.get(lLJJJ);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(lLJJJ, arrayList4);
            }
            ((List) arrayList4).add(obj3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), C13LP.LJJLIIIJJI((List) entry.getValue()));
        }
        return new ArrayList(C13LP.LJLLLL(new AComparatorS28S0000000_9(8), linkedHashMap2.values()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static List NQ2(BulletinListViewModel bulletinListViewModel, List list, AbstractC316870CbV abstractC316870CbV, int i) {
        boolean z;
        if ((i & 2) != 0) {
            abstractC316870CbV = null;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        bulletinListViewModel.getClass();
        bulletinListViewModel.setStateImmediate(new AwS588S0100000_9(list, (List<InterfaceC1891350zJl>) 543));
        if (z) {
            C20600815jK<ITEM> c20600815jK = bulletinListViewModel.state;
            if (c20600815jK != 0) {
                c20600815jK.LJIILL(list, null);
                bulletinListViewModel.setStateImmediate(new AwS588S0100000_9(c20600815jK, (C20600815jK<InterfaceC1891350zJl>) 515));
                if (abstractC316870CbV != null) {
                    bulletinListViewModel.getConfig().getOperator().LIZJ(EnumC323450Cm7.Refresh, abstractC316870CbV, false);
                    if (abstractC316870CbV instanceof C316650Cb9) {
                        bulletinListViewModel.setStateImmediate(new AwS588S0100000_9(abstractC316870CbV, (AbstractC316870CbV<String>) 517));
                    }
                }
            }
            return C13BV.INSTANCE;
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a1 A[LOOP:1: B:54:0x019b->B:56:0x01a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028f A[LOOP:5: B:77:0x0289->B:79:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object UQ2(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse r23, java.lang.String r24, X.InterfaceC1364105Vn r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel.UQ2(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse, java.lang.String, X.05Vn, boolean):java.lang.Object");
    }

    public final void WQ2(Long l, long j, int i, Long l2, String str) {
        String str2;
        Long lLJIILIIL;
        long jLongValue;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            C0OLV c0olvHh2 = Hh2();
            if (c0olvHh2 == null || (str2 = c0olvHh2.LL) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) == null) {
                return;
            } else {
                jLongValue = lLJIILIIL.longValue();
            }
        }
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C0OHU(this, jLongValue, j, i, l2, str, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(java.lang.String r19, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse r20, java.lang.String r21, boolean r22, X.InterfaceC1364105Vn<? super X.C616870OHl> r23) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel.vQ2(java.lang.String, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021f  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object KQ2(java.lang.String r11, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse r12, java.lang.Long r13, java.lang.Long r14, java.util.List<? extends com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem> r15, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem>> r16) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel.KQ2(java.lang.String, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse, java.lang.Long, java.lang.Long, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse r24, X.EnumC617060OIe r25, X.EnumC617480OJu r26, boolean r27, java.lang.String r28, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r29) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel.xQ2(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse, X.0OIe, X.0OJu, boolean, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void OQ2(com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel r6, java.lang.String r7, java.lang.String r8, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem r9, com.ss.android.ugc.aweme.profile.model.User r10, java.lang.Boolean r11, java.lang.String r12, java.lang.Boolean r13, java.lang.Boolean r14, int r15) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel.OQ2(com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem, com.ss.android.ugc.aweme.profile.model.User, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, int):void");
    }
}
