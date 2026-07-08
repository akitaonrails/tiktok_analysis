package com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt;

import X.C01GW;
import X.C0NZZ;
import X.C0PEM;
import X.C13LP;
import X.C15438062q;
import X.C1559240qg6;
import X.C1559260qg8;
import X.C1561130qj9;
import X.C1573150r2X;
import X.C1573180r2a;
import X.C1573270r2j;
import X.C1573330r2p;
import X.C1574470r4f;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C23250099c;
import X.C452501pT;
import X.C723600SZy;
import X.EnumC1573550r3B;
import X.EnumC1574490r4h;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService;
import com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesCenterMainPageAssemViewModel extends AssemViewModel<C1573270r2j> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1561130qj9.class, "series_center_list_key"), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(293));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(294));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(292));
    public final C1573330r2p LLILZIL = C1573330r2p.LIZIZ;

    public interface AppDiffProtocol {
        public static final C1573180r2a LIZ = C1573180r2a.LIZ;

        Map LIZ();

        EnumC1574490r4h LIZIZ();

        void getEnterMethod();

        public static final class DowngradeInstance implements AppDiffProtocol {
            @Override // com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenterMainPageAssemViewModel.AppDiffProtocol
            public final void getEnterMethod() {
            }

            @Override // com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenterMainPageAssemViewModel.AppDiffProtocol
            public final Map LIZ() {
                return C2097608Jq.LJ();
            }

            @Override // com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenterMainPageAssemViewModel.AppDiffProtocol
            public final EnumC1574490r4h LIZIZ() {
                return EnumC1574490r4h.SERIES_CENTER;
            }
        }
    }

    public final C1561130qj9 xQ2() {
        return (C1561130qj9) this.LL.getValue();
    }

    public final void zQ2() {
        setState(AFwS264S0000000_24.get$arr$(301));
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C0NZZ(this, null), 2);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        String str;
        String str2;
        C1561130qj9 c1561130qj9XQ2 = xQ2();
        boolean z = c1561130qj9XQ2 != null && c1561130qj9XQ2.LLILZIL == SeriesCenterSceneEnum.ALL.getValue();
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            return new C1573270r2j(CardStruct.IStatusCode.DEFAULT, new SeriesCenterCenterScene(SeriesCenterSceneEnum.ALL, CardStruct.IStatusCode.DEFAULT, "", null), 975);
        }
        C1561130qj9 c1561130qj9XQ22 = xQ2();
        if (c1561130qj9XQ22 != null && c1561130qj9XQ22.LLILZIL == SeriesCenterSceneEnum.TREND.getValue()) {
            return new C1573270r2j("1", new SeriesCenterCenterScene(SeriesCenterSceneEnum.TREND, "1", "", null), 975);
        }
        C1561130qj9 c1561130qj9XQ23 = xQ2();
        if (c1561130qj9XQ23 == null || (str = c1561130qj9XQ23.LLILZLL) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        SeriesCenterSceneEnum seriesCenterSceneEnum = SeriesCenterSceneEnum.CATEGORY;
        C1561130qj9 c1561130qj9XQ24 = xQ2();
        if (c1561130qj9XQ24 != null && (str2 = c1561130qj9XQ24.LLILZLL) != null) {
            str3 = str2;
        }
        return new C1573270r2j(str, new SeriesCenterCenterScene(seriesCenterSceneEnum, str3, "", null), 975);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C1561130qj9 c1561130qj9XQ2 = xQ2();
        if (c1561130qj9XQ2 == null || !c1561130qj9XQ2.LLIZ) {
            this.LLILZIL.LIZ.clear();
        }
        super.onCleared();
    }

    public final SeriesCenterSceneEnum wQ2() {
        SeriesCenterSceneEnum seriesCenterSceneEnum;
        SeriesCenterCenterScene seriesCenterCenterScene = getState().LLILZLL;
        return (seriesCenterCenterScene == null || (seriesCenterSceneEnum = seriesCenterCenterScene.scene) == null) ? SeriesCenterSceneEnum.ALL : seriesCenterSceneEnum;
    }

    public final EnumC1573550r3B yQ2() {
        C1561130qj9 c1561130qj9XQ2 = xQ2();
        return Intrinsics.LJFF(c1561130qj9XQ2 != null ? c1561130qj9XQ2.LLILLL : null, "series_discover") ? EnumC1573550r3B.SERIES_DISCOVER : EnumC1573550r3B.SERIES_CENTER;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQ2(int r5) {
        /*
            r4 = this;
            X.002o r3 = r4.getState()
            X.0r2j r3 = (X.C1573270r2j) r3
            com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse r0 = r3.LLIZLLLIL
            if (r0 == 0) goto L38
            java.util.List<com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene> r2 = r0.scenes
        Lc:
            X.00zU r1 = new X.00zU
            r1.<init>()
            if (r2 == 0) goto L1f
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r2)
            com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene r0 = (com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene) r0
            if (r0 == 0) goto L1f
            java.lang.String r0 = r0.categoryId
            if (r0 != 0) goto L21
        L1f:
            java.lang.String r0 = ""
        L21:
            r1.element = r0
            com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse r0 = r3.LLIZLLLIL
            boolean r0 = X.C1573190r2b.LIZ(r0)
            if (r0 == 0) goto L2f
            java.lang.String r0 = "0"
            r1.element = r0
        L2f:
            X.0r2m r0 = new X.0r2m
            r0.<init>(r5, r2, r1)
            r4.setState(r0)
            return
        L38:
            r2 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenterMainPageAssemViewModel.AQ2(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:31:0x00b9, B:32:0x00bc, B:36:0x00c3, B:38:0x00cb, B:40:0x00cf, B:44:0x00da, B:46:0x0103, B:48:0x0112, B:45:0x00ed, B:21:0x0079, B:22:0x007c, B:24:0x008e, B:25:0x0094, B:17:0x004c), top: B:53:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:31:0x00b9, B:32:0x00bc, B:36:0x00c3, B:38:0x00cb, B:40:0x00cf, B:44:0x00da, B:46:0x0103, B:48:0x0112, B:45:0x00ed, B:21:0x0079, B:22:0x007c, B:24:0x008e, B:25:0x0094, B:17:0x004c), top: B:53:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112 A[Catch: Exception -> 0x0121, TRY_LEAVE, TryCatch #0 {Exception -> 0x0121, blocks: (B:31:0x00b9, B:32:0x00bc, B:36:0x00c3, B:38:0x00cb, B:40:0x00cf, B:44:0x00da, B:46:0x0103, B:48:0x0112, B:45:0x00ed, B:21:0x0079, B:22:0x007c, B:24:0x008e, B:25:0x0094, B:17:0x004c), top: B:53:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenterMainPageAssemViewModel.BQ2(X.05Vn):java.lang.Object");
    }

    public final void vQ2(SeriesCenterListResponse seriesCenterListResponse, String str, boolean z) {
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        SeriesCenterCenterScene seriesCenterCenterScene;
        String str3;
        List<SeriesCenterCenterScene> list;
        String string;
        String string2;
        C1561130qj9 c1561130qj9XQ2 = xQ2();
        if (c1561130qj9XQ2 == null || (str2 = c1561130qj9XQ2.LLILZ) == null) {
            str2 = (String) this.LLILLL.getValue();
        }
        List<ShortDramaOverview> list2 = seriesCenterListResponse.collections;
        SeriesCenterCenterScene seriesCenterCenterScene2 = null;
        String str4 = "";
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            int i = 0;
            for (ShortDramaOverview shortDramaOverview : list2) {
                int i2 = i + 1;
                if (i >= 0) {
                    ShortDramaOverview shortDramaOverview2 = shortDramaOverview;
                    if (Intrinsics.LJFF(shortDramaOverview2.isLimitedFree(), Boolean.TRUE)) {
                        ISeriesLimitedFreeService iSeriesLimitedFreeService = (ISeriesLimitedFreeService) this.LLILLJJLI.getValue();
                        Long l = shortDramaOverview2.collectionId;
                        if (l == null || (string2 = l.toString()) == null) {
                            string2 = "";
                        }
                        iSeriesLimitedFreeService.LIZIZ(string2);
                    }
                    arrayList3.add(new C1573150r2X(shortDramaOverview2, i2, str2, !Intrinsics.LJFF(shortDramaOverview2.isSafe(), Boolean.FALSE)));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            arrayList = new ArrayList(arrayList3);
        } else {
            arrayList = new ArrayList();
        }
        List<ShortDramaOverview> list3 = seriesCenterListResponse.safeCollections;
        if (list3 != null) {
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            int i3 = 0;
            for (ShortDramaOverview shortDramaOverview3 : list3) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    ShortDramaOverview shortDramaOverview4 = shortDramaOverview3;
                    if (Intrinsics.LJFF(shortDramaOverview4.isLimitedFree(), Boolean.TRUE)) {
                        ISeriesLimitedFreeService iSeriesLimitedFreeService2 = (ISeriesLimitedFreeService) this.LLILLJJLI.getValue();
                        Long l2 = shortDramaOverview4.collectionId;
                        if (l2 == null || (string = l2.toString()) == null) {
                            string = "";
                        }
                        iSeriesLimitedFreeService2.LIZIZ(string);
                    }
                    arrayList4.add(new C1573150r2X(shortDramaOverview4, i4, str2, true));
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            arrayList2 = new ArrayList(arrayList4);
        } else {
            arrayList2 = new ArrayList();
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Long l3 = ((C1573150r2X) it2.next()).LLILLJJLI.collectionId;
            if (l3 != null) {
                arrayList5.add(l3);
            }
        }
        List listLLIIII = C13LP.LLIIII(arrayList5);
        Map<EnumC1574490r4h, Map<String, Aweme>> map = C1574470r4f.LIZ;
        AppDiffProtocol.LIZ.getClass();
        C1574470r4f.LIZ(C1573180r2a.LIZIZ.getValue().LIZIZ(), listLLIIII, Integer.valueOf(CastIntegerProtector.parseInt("1")));
        if (str.length() != 0 && (list = seriesCenterListResponse.scenes) != null && !list.isEmpty()) {
            Iterator<SeriesCenterCenterScene> it3 = seriesCenterListResponse.scenes.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                SeriesCenterCenterScene next = it3.next();
                if (Intrinsics.LJFF(next.categoryId, str)) {
                    seriesCenterCenterScene2 = next;
                    break;
                }
            }
            seriesCenterCenterScene = seriesCenterCenterScene2;
        } else {
            seriesCenterCenterScene = seriesCenterListResponse.currentScene;
        }
        setState(new AwS390S0200000_24(new C1559240qg6(arrayList, arrayList2, seriesCenterCenterScene), seriesCenterListResponse, 27));
        C1561130qj9 c1561130qj9XQ22 = xQ2();
        if (c1561130qj9XQ22 != null && c1561130qj9XQ22.LLIZ) {
            return;
        }
        C1573330r2p c1573330r2p = this.LLILZIL;
        if (seriesCenterCenterScene == null || (str3 = seriesCenterCenterScene.categoryId) == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        boolean zLJFF = Intrinsics.LJFF(seriesCenterListResponse.hasMore, Boolean.TRUE);
        String str5 = seriesCenterListResponse.cursor;
        if (str5 != null) {
            str4 = str5;
        }
        c1573330r2p.LIZIZ(str3, arrayList, zLJFF, str4, z, arrayList2, false);
    }
}
