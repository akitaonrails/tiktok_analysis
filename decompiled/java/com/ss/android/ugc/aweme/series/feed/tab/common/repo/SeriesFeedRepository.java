package com.ss.android.ugc.aweme.series.feed.tab.common.repo;

import X.C11S5;
import X.C13BV;
import X.C15438062q;
import X.C1573560r3C;
import X.C1574310r4P;
import X.C1576780r8O;
import X.C1576920r8c;
import X.C1578180rAe;
import X.C1578210rAh;
import X.C1578240rAk;
import X.C1578260rAm;
import X.C1578290rAp;
import X.C1578310rAr;
import X.C1578340rAu;
import X.C1578350rAv;
import X.C1578360rAw;
import X.C297590BlV;
import X.C673002jw;
import X.EnumC1578460rB6;
import Y.ARunnableS124S0100000_24;
import com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightResponse;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.UrlModel;
import com.ss.android.ugc.aweme.minidrama.tab.v2.navbar.NavItem;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum;
import com.ss.android.ugc.aweme.series.innerfeed.recommend.DramaFeedRecommendService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesFeedRepository {
    public static final SeriesFeedRepository LIZ = new SeriesFeedRepository();
    public static boolean LIZIZ;

    public static void LIZJ() {
        LIZIZ = true;
    }

    public interface AppDiffProtocol {
        public static final C1576920r8c LIZ = C1576920r8c.LIZ;

        Object LIZ(C1578360rAw c1578360rAw, C1574310r4P c1574310r4P);

        SeriesFeedResp LIZIZ(C1578350rAv c1578350rAv);

        public static final class DowngradeInstance implements AppDiffProtocol {
            @Override // com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository.AppDiffProtocol
            public final SeriesFeedResp LIZIZ(C1578350rAv c1578350rAv) {
                return (SeriesFeedResp) c1578350rAv.invoke();
            }

            @Override // com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository.AppDiffProtocol
            public final Object LIZ(C1578360rAw c1578360rAw, C1574310r4P c1574310r4P) {
                return c1578360rAw.invoke(c1574310r4P);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static SkylightBlocks LIZLLL(C1578240rAk c1578240rAk) {
        ?? arrayList;
        int iIntValue;
        List<C1578180rAe> list = c1578240rAk.skylight_card_list;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C1578180rAe c1578180rAe : list) {
                Integer num = c1578180rAe.card_style;
                List<C1578210rAh> list2 = c1578180rAe.history_list;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<C1578210rAh> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(LJ(it2.next()));
                }
                List<C1578210rAh> list3 = c1578180rAe.trending_list;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator<C1578210rAh> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(LJ(it3.next()));
                }
                List<C1578260rAm> list4 = c1578180rAe.scene_list;
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                for (C1578260rAm c1578260rAm : list4) {
                    C1578340rAu c1578340rAu = SeriesCenterSceneEnum.Companion;
                    Integer num2 = c1578260rAm.scene;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    c1578340rAu.getClass();
                    arrayList4.add(new SeriesCenterCenterScene(C1578340rAu.LIZ(iIntValue), c1578260rAm.category_id, c1578260rAm.name, c1578260rAm.metric_name));
                }
                List<C1578290rAp> list5 = c1578180rAe.nav_list;
                ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list5, 10));
                for (C1578290rAp c1578290rAp : list5) {
                    arrayList5.add(new NavItem(c1578290rAp.icon, c1578290rAp.name, c1578290rAp.schema));
                }
                arrayList.add(new SkylightBlockInfo(num, arrayList2, arrayList3, arrayList4, arrayList5));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        return new SkylightBlocks(arrayList);
    }

    public static final SkylightCommonItem LJ(C1578210rAh c1578210rAh) {
        long jIntValue;
        UrlModel urlModel;
        Long l = c1578210rAh.collection_id;
        Integer num = c1578210rAh.category;
        if (num != null) {
            jIntValue = num.intValue();
        } else {
            jIntValue = 0;
        }
        Long lValueOf = Long.valueOf(jIntValue);
        Boolean bool = c1578210rAh.is_limited_free;
        String str = c1578210rAh.title;
        C673002jw c673002jw = c1578210rAh.cover;
        if (c673002jw != null) {
            urlModel = new UrlModel(c673002jw.uri, c673002jw.url_list, c673002jw.width, c673002jw.height, c673002jw.url_key);
        } else {
            urlModel = null;
        }
        return new SkylightCommonItem(l, lValueOf, bool, str, urlModel, c1578210rAh.last_watched, c1578210rAh.num_videos);
    }

    public final SkylightBlocks LIZIZ(boolean z, boolean z2) {
        SkylightBlocks skylightBlocks;
        List<SkylightBlockInfo> list;
        SeriesFeedApi seriesFeedApi = SeriesFeedApi.LIZIZ;
        IDramaSharedApiPathService.LIZ.getClass();
        String strLIZ = C1573560r3C.LIZ().LIZ(EnumC1578460rB6.SKYLIGHT);
        DramaFeedRecommendService.LIZ.getClass();
        SkylightResponse skylightResponse = seriesFeedApi.fetchSkylightList(strLIZ, C1578310rAr.LIZ().LIZJ(true), z, z2).get();
        if (skylightResponse != null) {
            skylightBlocks = skylightResponse.skylightBlocks;
        } else {
            skylightBlocks = null;
        }
        C1576780r8O.LIZ.getClass();
        if (C297590BlV.LIZIZ() && skylightBlocks != null && (list = skylightBlocks.blocks) != null && !list.isEmpty()) {
            C1576780r8O.LJ = skylightBlocks;
            C11S5.LIZ().LIZIZ(new ARunnableS124S0100000_24(skylightBlocks, 5));
        }
        return skylightBlocks;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r18, boolean r19, boolean r20, java.lang.String r21, java.lang.String r22, java.lang.Integer r23, java.util.List<java.lang.String> r24, java.util.List<java.lang.String> r25, java.util.List<java.lang.String> r26, boolean r27, int r28, boolean r29, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp> r30) {
        /*
            r17 = this;
            r3 = r30
            boolean r0 = r3 instanceof X.C1574310r4P
            if (r0 == 0) goto L5b
            r4 = r3
            X.0r4P r4 = (X.C1574310r4P) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r4.LLILLL = r2
        L14:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L6b
            X.C155000ia.LIZIZ(r3)
        L24:
            if (r3 == 0) goto L63
            return r3
        L27:
            X.C155000ia.LIZIZ(r3)
            X.0r8c r0 = com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository.AppDiffProtocol.LIZ
            r0.getClass()
            X.01GW<com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository$AppDiffProtocol> r0 = X.C1576920r8c.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository$AppDiffProtocol r0 = (com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository.AppDiffProtocol) r0
            X.0rAw r5 = new X.0rAw
            r16 = 0
            r14 = r27
            r13 = r26
            r12 = r25
            r11 = r24
            r10 = r23
            r9 = r21
            r8 = r20
            r15 = r29
            r6 = r18
            r7 = r22
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZ(r5, r4)
            if (r3 != r2) goto L24
            return r2
        L5b:
            X.0r4P r4 = new X.0r4P
            r0 = r17
            r4.<init>(r0, r3)
            goto L14
        L63:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "fetchFeedList -> resp is null"
            r1.<init>(r0)
            throw r1
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository.LIZ(int, boolean, boolean, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, java.util.List, java.util.List, boolean, int, boolean, X.05Vn):java.lang.Object");
    }
}
