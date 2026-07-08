package com.ss.android.ugc.aweme.series.vip.viewmodel;

import X.C090F;
import X.C099F;
import X.C09JN;
import X.C11S5;
import X.C1272004yM;
import X.C1272204yO;
import X.C1573110r2T;
import X.C1573130r2V;
import X.C1573140r2W;
import X.C1612810s4V;
import X.C1614710s7Z;
import X.C1614720s7a;
import X.C1614740s7c;
import X.C1614750s7d;
import X.C1614760s7e;
import X.C1614790s7h;
import X.C1614860s7o;
import X.C23250099c;
import X.C427010Gol;
import X.C627660Ojc;
import X.EnumC1614730s7b;
import X.EnumC1614900s7s;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import X.InterfaceC781210Ukh;
import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetail;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse;
import com.ss.android.ugc.aweme.model.VipSubscriptionStatus;
import com.ss.android.ugc.aweme.series.vip.service.SeriesSubscriptionService;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS74S1000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesVipSubscriptionViewModel extends AssemListViewModel<C1614710s7Z, InterfaceC1891350zJl, String> {
    public static final /* synthetic */ int LLILLL = 0;
    public final SeriesSubscriptionService LL = (SeriesSubscriptionService) PluggableExtentionKt.pluggableSpi$default(SeriesSubscriptionService.class, false, false, false, 14, null);
    public C099F LLILLJJLI = C090F.LIZIZ();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void JQ2() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.series.vip.service.SeriesSubscriptionService r4 = r5.LL
            if (r4 != 0) goto L5
            return
        L5:
            X.002o r0 = r5.getState()
            X.0s7Z r0 = (X.C1614710s7Z) r0
            com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse r0 = r0.LLILLJJLI
            if (r0 == 0) goto L40
            java.util.List<com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption> r0 = r0.subsOptions
            if (r0 == 0) goto L40
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L1c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption r0 = (com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption) r0
            com.ss.android.ugc.aweme.model.VipSubscriptionPrice r0 = r0.price
            if (r0 == 0) goto L1c
            java.lang.String r1 = r0.mpProductId
            if (r1 == 0) goto L1c
            int r0 = r1.length()
            if (r0 <= 0) goto L1c
            r3.add(r1)
            goto L1c
        L3a:
            java.util.List r0 = X.C13LP.LJJJJI(r3)
            if (r0 != 0) goto L42
        L40:
            X.13BV r0 = X.C13BV.INSTANCE
        L42:
            BQ2(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel.JQ2():void");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1614710s7Z(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String CQ2() {
        VipSubscriptionDetail vipSubscriptionDetail;
        Long lValueOf;
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = ((C1614710s7Z) getState()).LLILLJJLI;
        if (vipSubscriptionDetailResponse == null || (vipSubscriptionDetail = vipSubscriptionDetailResponse.detail) == null) {
            return "";
        }
        int i = C1614720s7a.LIZIZ[vipSubscriptionDetail.status.ordinal()];
        if (i == 1) {
            lValueOf = Long.valueOf(vipSubscriptionDetail.autoRenewTime);
            if (lValueOf.longValue() <= 0) {
                return "";
            }
        } else {
            if (i != 2 && i != 3) {
                return "";
            }
            lValueOf = Long.valueOf(vipSubscriptionDetail.expiredTime);
            if (lValueOf.longValue() <= 0) {
                return "";
            }
        }
        return DateFormat.getDateInstance(2, Locale.getDefault()).format(new Date(lValueOf.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String DQ2() {
        VipSubscriptionDetail vipSubscriptionDetail;
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = ((C1614710s7Z) getState()).LLILLJJLI;
        if (vipSubscriptionDetailResponse == null || (vipSubscriptionDetail = vipSubscriptionDetailResponse.detail) == null) {
            return "";
        }
        Long lValueOf = Long.valueOf(vipSubscriptionDetail.autoRenewTime);
        return lValueOf.longValue() > 0 ? DateFormat.getDateInstance(2, Locale.getDefault()).format(new Date(lValueOf.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT))) : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void GQ2(String str) {
        C1614710s7Z c1614710s7Z = (C1614710s7Z) getState();
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = c1614710s7Z.LLILLJJLI;
        if (vipSubscriptionDetailResponse == null) {
            return;
        }
        if (str.length() == 0) {
            str = c1614710s7Z.LLILZ;
        }
        setState(new AwS74S1000000_24(str, 7));
        listSetItems(yQ2(vipSubscriptionDetailResponse, c1614710s7Z.LLILLL, str, c1614710s7Z.LLJILJILJ));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 277));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r20) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vQ2(VipSubscriptionDetailResponse vipSubscriptionDetailResponse) {
        VipSubscriptionStatus vipSubscriptionStatus;
        C1614710s7Z c1614710s7Z = (C1614710s7Z) getState();
        C1614740s7c c1614740s7c = EnumC1614730s7b.Companion;
        VipSubscriptionDetail vipSubscriptionDetail = vipSubscriptionDetailResponse.detail;
        if (vipSubscriptionDetail != null) {
            vipSubscriptionStatus = vipSubscriptionDetail.status;
        } else {
            vipSubscriptionStatus = null;
        }
        c1614740s7c.getClass();
        EnumC1614730s7b enumC1614730s7bLIZ = C1614740s7c.LIZ(vipSubscriptionStatus);
        String strIQ2 = IQ2(vipSubscriptionDetailResponse, enumC1614730s7bLIZ, c1614710s7Z.LLILZ);
        setState(new C1614860s7o(this, vipSubscriptionDetailResponse, enumC1614730s7bLIZ, strIQ2));
        listSetItems(yQ2(vipSubscriptionDetailResponse, enumC1614730s7bLIZ, strIQ2, c1614710s7Z.LLJILJILJ));
    }

    public static void BQ2(SeriesSubscriptionService seriesSubscriptionService, List list) {
        if (seriesSubscriptionService != null && !list.isEmpty()) {
            seriesSubscriptionService.LIZJ(list).LJIJJLI(C11S5.LIZ()).LJIJI(new C09JN() { // from class: X.0s7y
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("SeriesVipSubscriptionViewModel@bda1.firePrecheck$2");
                    C1C7U.LIZIZ("SeriesVipSubscriptionViewModel@bda1.firePrecheck$2");
                }
            }, new InterfaceC781210Ukh() { // from class: X.0s8R
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String xQ2(X.C1614710s7Z r8, com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption r9) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel.xQ2(X.0s7Z, com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List zQ2(SeriesVipSubscriptionViewModel seriesVipSubscriptionViewModel, VipSubscriptionDetailResponse vipSubscriptionDetailResponse) {
        Map<String, String> map = ((C1614710s7Z) seriesVipSubscriptionViewModel.getState()).LLJ;
        Map<String, String> map2 = ((C1614710s7Z) seriesVipSubscriptionViewModel.getState()).LLJIJIL;
        Map<String, IapSubscriptionProduct> map3 = ((C1614710s7Z) seriesVipSubscriptionViewModel.getState()).LLJI;
        seriesVipSubscriptionViewModel.getClass();
        return C1612810s4V.LIZJ(vipSubscriptionDetailResponse.subsOptions, map, map2, map3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void EQ2(Context context, EnumC1614900s7s enumC1614900s7s) {
        C1614710s7Z c1614710s7Z = (C1614710s7Z) getState();
        if (!c1614710s7Z.LLILZIL && !c1614710s7Z.LLIZ) {
            if (c1614710s7Z.LLIZLLLIL && (enumC1614900s7s == EnumC1614900s7s.CANCEL_AUTO_RENEW || enumC1614900s7s == EnumC1614900s7s.CHANGE_PLAN)) {
                return;
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1614750s7d(enumC1614900s7s, this, context, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: FQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r7, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1614810s7j
            if (r0 == 0) goto L5d
            r4 = r8
            X.0s7j r4 = (X.C1614810s7j) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 1
            if (r0 == 0) goto L43
            if (r0 != r5) goto L82
            X.0s7Z r2 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r4 = r3.getFirst()
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r3.getSecond()
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L63
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            X.13BV r1 = X.C13BV.INSTANCE
            r0.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r1)
            return r0
        L43:
            X.C155000ia.LIZIZ(r3)
            X.002o r2 = r6.getState()
            X.0s7Z r2 = (X.C1614710s7Z) r2
            java.util.List<X.0r2T> r0 = r2.LLJILJILJ
            int r0 = r0.size()
            r4.LL = r2
            r4.LLILZ = r5
            java.lang.Object r3 = r6.AQ2(r0, r7, r4)
            if (r3 != r1) goto L24
            return r1
        L5d:
            X.0s7j r4 = new X.0s7j
            r4.<init>(r6, r8)
            goto L12
        L63:
            kotlin.jvm.internal.AwS390S0200000_24 r1 = new kotlin.jvm.internal.AwS390S0200000_24
            r0 = 36
            r1.<init>(r2, r4, r0)
            r6.setState(r1)
            if (r3 == 0) goto L77
            X.0CcB r1 = X.AbstractC316870CbV.LIZ
            r0 = 0
            X.0Cm0 r0 = X.C317290CcB.LJ(r1, r0, r3, r4, r5)
            return r0
        L77:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r4)
            return r0
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(long r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C1614830s7l
            if (r0 == 0) goto L51
            r7 = r12
            X.0s7l r7 = (X.C1614830s7l) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r1 = r7.LLILLL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            r6 = 1
            if (r0 == 0) goto L49
            if (r0 != r6) goto L5a
            long r2 = r7.LLILLJJLI
            long r10 = r7.LL
            X.C155000ia.LIZIZ(r1)
        L26:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 >= 0) goto L57
            X.099F r0 = r9.LLILLJJLI
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto L3a
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3a:
            r7.LL = r10
            r7.LLILLJJLI = r2
            r7.LLILZIL = r6
            r0 = 50
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r8) goto L26
            return r8
        L49:
            X.C155000ia.LIZIZ(r1)
            long r2 = java.lang.System.currentTimeMillis()
            goto L26
        L51:
            X.0s7l r7 = new X.0s7l
            r7.<init>(r9, r12)
            goto L12
        L57:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel.wQ2(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc A[PHI: r1
      0x00cc: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v12 java.lang.String), (r1v13 java.lang.String) binds: [B:68:0x00c9, B:51:0x009e, B:57:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String IQ2(com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse r7, X.EnumC1614730s7b r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel.IQ2(com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse, X.0s7b, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(int r11, java.lang.String r12, X.InterfaceC1364105Vn r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C1614840s7m
            if (r0 == 0) goto L9c
            r6 = r13
            X.0s7m r6 = (X.C1614840s7m) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9c
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r8 = r6.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L56
            if (r0 != r5) goto Lbb
            int r11 = r6.LL
            X.C155000ia.LIZIZ(r8)
        L25:
            com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterResponse r8 = (com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterResponse) r8
            java.util.List<com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview> r0 = r8.collections
            if (r0 != 0) goto L2d
            X.13BV r0 = X.C13BV.INSTANCE
        L2d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r9 = r0.iterator()
        L36:
            boolean r0 = r9.hasNext()
            r6 = 0
            if (r0 == 0) goto La7
            java.lang.Object r3 = r9.next()
            int r2 = r4 + 1
            if (r4 < 0) goto La3
            com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview r3 = (com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview) r3
            if (r3 == 0) goto L54
            X.0r2T r1 = new X.0r2T
            java.lang.String r0 = "vip_subscription_status"
            int r4 = r4 + r11
            r1.<init>(r3, r0, r4)
            r7.add(r1)
        L54:
            r4 = r2
            goto L36
        L56:
            X.C155000ia.LIZIZ(r8)
            r0 = 2
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "genre"
            java.lang.String r0 = "0"
            r2.<init>(r1, r0)
            r3[r4] = r2
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "sort"
            java.lang.String r0 = "1"
            r2.<init>(r1, r0)
            r3[r5] = r2
            java.util.HashMap r3 = X.C2097608Jq.LJI(r3)
            com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterRequest r2 = new com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterRequest
            r0 = 12
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.<init>(r3, r12, r1, r0)
            com.ss.android.ugc.aweme.series.feed.api.SeriesListApi$GetSeriesCenterListApi r0 = X.C1576960r8g.LIZIZ()
            if (r0 == 0) goto L8f
            X.11NZ r0 = r0.getMiniDramaCenterV2(r2)
            if (r0 != 0) goto L91
        L8f:
            X.11IR r0 = X.C11IR.LL
        L91:
            r6.LL = r11
            r6.LLILZ = r5
            java.lang.Object r8 = X.C11UD.LIZJ(r0, r6)
            if (r8 != r7) goto L25
            return r7
        L9c:
            X.0s7m r6 = new X.0s7m
            r6.<init>(r10, r13)
            goto L12
        La3:
            X.C1697810uHb.LJIJI()
            throw r6
        La7:
            java.lang.Boolean r1 = r8.hasMore
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lb5
            java.lang.String r6 = r8.cursor
        Lb5:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r7, r6)
            return r0
        Lbb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel.AQ2(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object HQ2(com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption r15, X.C1614710s7Z r16, X.InterfaceC1364105Vn<? super X.AbstractC1615220s8O> r17) {
        /*
            r14 = this;
            r4 = r17
            boolean r0 = r4 instanceof X.C1614820s7k
            if (r0 == 0) goto L22
            r3 = r4
            X.0s7k r3 = (X.C1614820s7k) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r3.LLILLL = r2
        L14:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            goto L8b
        L22:
            X.0s7k r3 = new X.0s7k
            r3.<init>(r14, r4)
            goto L14
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.model.VipSubscriptionPrice r4 = r15.price
            if (r4 != 0) goto L3f
            X.0s7q r1 = new X.0s7q
            X.0s7n r0 = X.EnumC1614850s7n.PRODUCT_DETAIL_NOT_FOUND
            r1.<init>(r0)
            return r1
        L3f:
            X.0sBA r7 = X.C1616940sBA.LIZ     // Catch: java.lang.Throwable -> L94
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r8 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            r9 = 0
            r12 = 14
            r13 = 0
            r10 = r9
            r11 = r9
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L94
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L88
            X.15v3 r0 = r0.k4()     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L88
            X.0wjP r6 = r0.LLFZ()     // Catch: java.lang.Throwable -> L94
        L5b:
            java.lang.String r5 = X.C2536509wp.LIZ()     // Catch: java.lang.Throwable -> L94
            X.0sBF r8 = new X.0sBF     // Catch: java.lang.Throwable -> L94
            java.lang.String r9 = "vip_subscription_page"
            java.lang.String r10 = r4.mpProductId     // Catch: java.lang.Throwable -> L94
            java.lang.String r11 = r4.basePlanId     // Catch: java.lang.Throwable -> L94
            java.lang.String r12 = r4.promotionOfferId     // Catch: java.lang.Throwable -> L94
            r0 = r16
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.LLJILJIL     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = r0.LLILZ     // Catch: java.lang.Throwable -> L94
            java.lang.Object r13 = r4.get(r0)     // Catch: java.lang.Throwable -> L94
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L94
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L94
            r7.getClass()     // Catch: java.lang.Throwable -> L94
            X.11Kz r0 = X.C1616940sBA.LJFF(r6, r5, r8)     // Catch: java.lang.Throwable -> L94
            r3.LLILLL = r1     // Catch: java.lang.Throwable -> L94
            java.lang.Object r4 = X.C11UD.LIZIZ(r0, r3)     // Catch: java.lang.Throwable -> L94
            if (r4 != r2) goto L8e
            goto L8a
        L88:
            r6 = 0
            goto L5b
        L8a:
            return r2
        L8b:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L94
        L8e:
            X.0s8O r4 = (X.AbstractC1615220s8O) r4     // Catch: java.lang.Throwable -> L94
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> L94
            goto La0
        L94:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r4 = new X.00Yq
            r4.<init>(r0)
            X.C189200o6.m2constructorimpl(r4)
        La0:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r4)
            if (r0 == 0) goto Lad
            X.0s7q r4 = new X.0s7q
            X.0s7n r0 = X.EnumC1614850s7n.EMPTY_MARKETPLACE_RESULT
            r4.<init>(r0)
        Lad:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel.HQ2(com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption, X.0s7Z, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<InterfaceC1891350zJl> yQ2(VipSubscriptionDetailResponse vipSubscriptionDetailResponse, EnumC1614730s7b enumC1614730s7b, String str, List<C1573110r2T> list) {
        int i;
        C1614790s7h c1614790s7hLIZ = C1614760s7e.LIZ(vipSubscriptionDetailResponse, enumC1614730s7b, str, ((C1614710s7Z) getState()).LLJILLL, ((C1614710s7Z) getState()).LLJ);
        ArrayList arrayList = new ArrayList(list.size() + 8);
        arrayList.add(new C427010Gol(c1614790s7hLIZ.LIZIZ));
        C1573130r2V c1573130r2V = c1614790s7hLIZ.LIZJ;
        if (c1573130r2V != null) {
            arrayList.add(new C1573140r2W(c1573130r2V));
        }
        int i2 = C1614720s7a.LIZ[enumC1614730s7b.ordinal()];
        if (i2 != 3 && i2 != 4) {
            i = 0;
        } else {
            i = 20;
        }
        arrayList.add(new C1272204yO(c1614790s7hLIZ.LIZLLL, i));
        arrayList.add(new C1272004yM(0));
        arrayList.addAll(list);
        return arrayList;
    }
}
