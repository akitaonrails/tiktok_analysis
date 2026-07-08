package com.bytedance.tiktok.homepage.mainfragment.toolbar.search;

import X.AbstractC1585770rMt;
import X.C1157804fw;
import X.C13LP;
import X.C15438062q;
import X.C1585820rMy;
import X.C1586190rNZ;
import X.C1586220rNc;
import X.C1697810uHb;
import X.C20642515q3;
import X.C418440Gaw;
import X.C443120HZe;
import X.C814420VxA;
import X.C995220c0O;
import X.InterfaceC1586210rNb;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.aweme.search.service.ISearchIconOutService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes25.dex */
public final class SearchIconOutServiceImpl implements ISearchIconOutService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0rNZ] */
    @Override // com.ss.android.ugc.aweme.search.service.ISearchIconOutService
    public final C1586190rNZ LIZIZ() {
        return new AbstractC1585770rMt() { // from class: X.0rNZ
            @Override // X.AbstractC1585770rMt
            public final InterfaceC1570900qyu LIZJ() {
                return new C1611120s1m();
            }

            @Override // X.AbstractC1585770rMt
            public final EnumC1584360rKc LIZIZ() {
                return EnumC1584360rKc.SEARCH;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0rMy] */
    @Override // com.ss.android.ugc.aweme.search.service.ISearchIconOutService
    public final C1585820rMy LIZJ() {
        return new AbstractC1585770rMt() { // from class: X.0rMy
            @Override // X.AbstractC1585770rMt
            public final InterfaceC1570900qyu LIZJ() {
                return new C1611080s1i();
            }

            @Override // X.AbstractC1585770rMt
            public final EnumC1584360rKc LIZIZ() {
                return EnumC1584360rKc.SEARCH_BAR;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.search.service.ISearchIconOutService
    public final void LIZLLL() {
        C995220c0O.LIZ.getClass();
        C995220c0O.LIZLLL.clear();
    }

    @Override // com.ss.android.ugc.aweme.search.service.ISearchIconOutService
    public final void LJ(Context context) {
        Object service;
        String strLJI;
        Object service2;
        List listSingletonList;
        C995220c0O.LIZ.getClass();
        if (C1157804fw.LIZ()) {
            service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
        } else {
            service = ServiceManager.get().getService(ISearchService.class);
        }
        if (!((InterfaceC1586210rNb) service).LJJ()) {
            int i = C995220c0O.LIZJ;
            int i2 = C995220c0O.LIZIZ;
            int i3 = i + i2;
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setTuxFont(62);
            TextPaint paint = tuxTextView.getPaint();
            C1586220rNc.LIZ.getClass();
            if (context == null || (strLJI = context.getString(R.string.spp)) == null) {
                strLJI = C20642515q3.LJI(R.string.spp);
            }
            int iMeasureText = ((int) paint.measureText(strLJI)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)) + i2 + 10;
            if (C1157804fw.LIZ()) {
                service2 = ServiceManager.get().getService(ISearchServiceLowEnd.class);
            } else {
                service2 = ServiceManager.get().getService(ISearchService.class);
            }
            if (((InterfaceC1586210rNb) service2).LLLLLJLJLL()) {
                listSingletonList = C13LP.LJLLL(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(iMeasureText)));
            } else {
                listSingletonList = Collections.singletonList(Integer.valueOf(iMeasureText));
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSingletonList, 10));
            Iterator it2 = listSingletonList.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((Number) it2.next()).intValue() - C995220c0O.LIZIZ));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Number) obj).intValue() > 0) {
                    arrayList2.add(obj);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Number) it3.next()).intValue();
                ConcurrentHashMap<Integer, C443120HZe<View, TextView, Integer>> concurrentHashMap = C995220c0O.LIZLLL;
                Integer numValueOf = Integer.valueOf(iIntValue);
                C995220c0O.LIZ.getClass();
                HomepageIconServiceApi homepageIconServiceApi = (HomepageIconServiceApi) C995220c0O.LJ.getValue();
                if (homepageIconServiceApi != null) {
                    concurrentHashMap.put(numValueOf, homepageIconServiceApi.LJFF(iIntValue, context));
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    @Override // com.ss.android.ugc.aweme.search.service.ISearchIconOutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC1586250rNf LIZ(X.C19EG r7, com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip r8, X.InterfaceC1617760sCU r9, kotlin.Pair r10) {
        /*
            r6 = this;
            X.0c0O r0 = X.C995220c0O.LIZ
            r0.getClass()
            boolean r0 = X.C1157804fw.LIZ()
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.search.ISearchServiceLowEnd> r0 = com.ss.android.ugc.aweme.search.ISearchServiceLowEnd.class
            java.lang.Object r3 = r1.getService(r0)
        L15:
            X.0rNb r3 = (X.InterfaceC1586210rNb) r3
            boolean r0 = r3.LJJ()
            if (r0 == 0) goto L9c
            r5 = 0
            if (r10 == 0) goto L96
            java.lang.Object r0 = r10.getFirst()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L5c
            java.util.Iterator r3 = r0.iterator()
        L2c:
            r4 = r5
        L2d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r2 = r3.next()
            X.0qyu r2 = (X.InterfaceC1570900qyu) r2
            java.lang.String r1 = r2.getTag()
            X.0rKb r0 = X.EnumC1584350rKb.SEARCH
            java.lang.String r0 = r0.getTag()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2d
            boolean r0 = r2 instanceof X.C1611120s1m
            if (r0 == 0) goto L2c
            r4 = r2
            X.0rNf r4 = (X.AbstractC1586250rNf) r4
            goto L2d
        L51:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.search.ISearchService> r0 = com.ss.android.ugc.aweme.search.ISearchService.class
            java.lang.Object r3 = r1.getService(r0)
            goto L15
        L5c:
            r4 = r5
            if (r10 == 0) goto L91
        L5f:
            java.lang.Object r0 = r10.getSecond()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L91
            java.util.Iterator r3 = r0.iterator()
        L6b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r2 = r3.next()
            X.0qyu r2 = (X.InterfaceC1570900qyu) r2
            java.lang.String r1 = r2.getTag()
            X.0rKb r0 = X.EnumC1584350rKb.SEARCH
            java.lang.String r0 = r0.getTag()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6b
            boolean r0 = r2 instanceof X.C1611120s1m
            if (r0 == 0) goto L8f
            r4 = r2
            X.0rNf r4 = (X.AbstractC1586250rNf) r4
            goto L6b
        L8f:
            r4 = r5
            goto L6b
        L91:
            if (r4 == 0) goto L96
            r4.LL = r9
            return r4
        L96:
            X.0s1m r4 = new X.0s1m
            r4.<init>(r9)
            return r4
        L9c:
            r8.zf0()
            int r0 = X.C995220c0O.LIZIZ
            r2 = 0
            int r1 = -r0
            X.0rNe r4 = new X.0rNe
            boolean r0 = r3.Q0()
            if (r0 != 0) goto Laf
            int r0 = X.C995220c0O.LIZJ
            if (r1 >= r0) goto Lb0
        Laf:
            r2 = 1
        Lb0:
            r4.<init>(r1, r2, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainfragment.toolbar.search.SearchIconOutServiceImpl.LIZ(X.19EG, com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip, X.0sCU, kotlin.Pair):X.0rNf");
    }
}
