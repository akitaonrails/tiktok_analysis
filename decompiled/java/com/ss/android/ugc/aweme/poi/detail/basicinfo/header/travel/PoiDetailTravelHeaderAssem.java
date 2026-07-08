package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel;

import X.C1180060goW;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1189060h32;
import X.C1200940hMC;
import X.C13LP;
import X.C13LQ;
import X.C19748612Om;
import X.C339190DRl;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.IconTag;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailTravelHeaderAssem extends PoiDetailHeaderAssem {
    public List<IconTag> LLJJJJLIIL;

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Qp(View view, String str, boolean z, PoiListApi.PoiDetailResponse poiDetailResponse, String str2, String str3, String str4, String str5, String str6, String str7) {
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Xp(View view, PoiListApi.PoiDetailResponse poiDetailResponse, String str, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final boolean op(PoiListApi.PoiDetailResponse poiDetailResponse) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final boolean sp(PoiListApi.PoiDetailResponse poiDetailResponse) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair kq(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r6) {
        /*
            r5 = 0
            if (r6 == 0) goto L67
            java.util.List r0 = r6.getTags()
            if (r0 == 0) goto L67
            java.util.Iterator r3 = r0.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r0 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) r0
            int r1 = r0.tagType
            X.0gna r0 = X.EnumC1179480gna.POI_DETAIL_TAG_TYPE_CATEGORY
            int r0 = r0.getValue()
            if (r1 != r0) goto Ld
        L24:
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r2 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) r2
            if (r2 == 0) goto L67
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagContent r0 = r2.tagContent
            if (r0 == 0) goto L67
            java.lang.String r4 = r0.commonText
        L2e:
            java.util.List r0 = r6.getTags()
            if (r0 == 0) goto L5d
            java.util.Iterator r3 = r0.iterator()
        L38:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r0 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) r0
            int r1 = r0.tagType
            X.0gna r0 = X.EnumC1179480gna.POI_DETAIL_TAG_TYPE_OPENING_TIME
            int r0 = r0.getValue()
            if (r1 != r0) goto L38
        L4f:
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r2 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) r2
            if (r2 == 0) goto L5d
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagContent r0 = r2.tagContent
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.poi.detail.container.model.OpeningTimeInfo r0 = r0.openingTime
            if (r0 == 0) goto L5d
            java.lang.String r5 = r0.openingTimeText
        L5d:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r4, r5)
            return r0
        L63:
            r2 = r5
            goto L4f
        L65:
            r2 = r5
            goto L24
        L67:
            r4 = r5
            if (r6 == 0) goto L5d
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssem.kq(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse):kotlin.Pair");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [kotlin.jvm.functions.Function1] */
    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Gp(ViewGroup viewGroup, PoiListApi.PoiDetailResponse poiDetailResponse) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C1184480gve c1184480gve;
        int i;
        char c;
        CharSequence charSequence;
        int iLJIILJJIL;
        int iLIZLLL;
        C1184480gve c1184480gve2;
        C1184480gve c1184480gve3;
        C1184480gve c1184480gve4;
        C1184480gve c1184480gve5;
        C1184480gve c1184480gve6;
        C1184480gve c1184480gve7;
        C1184480gve c1184480gve8;
        if (Intrinsics.LJFF(this.LLJJI, poiDetailResponse)) {
            return;
        }
        this.LLJJJ = false;
        String collectInfo = null;
        C19748612Om.LIZ(viewGroup, null);
        Up(viewGroup, poiDetailResponse);
        Vp(viewGroup, poiDetailResponse, cp().LL);
        Fp(viewGroup);
        fq(viewGroup, poiDetailResponse);
        String str8 = cp().LL;
        C1184460gvc c1184460gvcOo = Oo();
        if (c1184460gvcOo != null && (c1184480gve8 = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve8.LLILLJJLI;
        } else {
            str = null;
        }
        C1184460gvc c1184460gvcOo2 = Oo();
        if (c1184460gvcOo2 != null && (c1184480gve7 = c1184460gvcOo2.LLILLL) != null) {
            str2 = c1184480gve7.LL;
        } else {
            str2 = null;
        }
        Wp(viewGroup, poiDetailResponse, str8, str, str2);
        String str9 = cp().LL;
        C1200940hMC c1200940hMC = C1200940hMC.LIZ;
        Context context = viewGroup.getContext();
        c1200940hMC.getClass();
        boolean zLIZIZ = C1200940hMC.LIZIZ(context);
        C1184460gvc c1184460gvcOo3 = Oo();
        if (c1184460gvcOo3 != null && (c1184480gve6 = c1184460gvcOo3.LLILLL) != null) {
            str3 = c1184480gve6.LLIZLLLIL;
        } else {
            str3 = null;
        }
        C1184460gvc c1184460gvcOo4 = Oo();
        if (c1184460gvcOo4 != null && (c1184480gve5 = c1184460gvcOo4.LLILLL) != null) {
            str4 = c1184480gve5.LLJ;
        } else {
            str4 = null;
        }
        C1184460gvc c1184460gvcOo5 = Oo();
        if (c1184460gvcOo5 != null && (c1184480gve4 = c1184460gvcOo5.LLILLL) != null) {
            str5 = c1184480gve4.LLJI;
        } else {
            str5 = null;
        }
        C1184460gvc c1184460gvcOo6 = Oo();
        if (c1184460gvcOo6 != null && (c1184480gve3 = c1184460gvcOo6.LLILLL) != null) {
            str6 = c1184480gve3.LLILLJJLI;
        } else {
            str6 = null;
        }
        C1184460gvc c1184460gvcOo7 = Oo();
        if (c1184460gvcOo7 != null && (c1184480gve2 = c1184460gvcOo7.LLILLL) != null) {
            str7 = c1184480gve2.LL;
        } else {
            str7 = null;
        }
        if (poiDetailResponse != null) {
            collectInfo = poiDetailResponse.getCollectInfo();
        }
        dq(viewGroup, str9, zLIZIZ, poiDetailResponse, str3, str4, str5, str6, str7, collectInfo);
        cp();
        Oo();
        Oo();
        cp();
        C1200940hMC.LIZIZ(viewGroup.getContext());
        Oo();
        Oo();
        Oo();
        Oo();
        Oo();
        if (poiDetailResponse != null) {
            poiDetailResponse.getCollectInfo();
        }
        Tp(viewGroup, poiDetailResponse);
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.po4);
        TextView textView = (TextView) viewGroup.findViewById(R.id.po5);
        TuxIconView tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.pof);
        View viewFindViewById = viewGroup.findViewById(R.id.olr);
        Pair pairKq = kq(poiDetailResponse);
        String str10 = (String) pairKq.getFirst();
        String str11 = (String) pairKq.getSecond();
        if ((str10 == null || str10.length() == 0) && (str11 == null || str11.length() == 0)) {
            C339190DRl.LIZIZ(frameLayout);
            C339190DRl.LIZIZ(tuxIconView);
        } else {
            if (viewFindViewById.getVisibility() == 8) {
                C339190DRl.LIZLLL(tuxIconView);
                if (tuxIconView != null) {
                    iLJIILJJIL = C1180060goW.LJIILJJIL(tuxIconView);
                    iLIZLLL = C1180060goW.LIZLLL(tuxIconView);
                } else {
                    iLJIILJJIL = 0;
                    iLIZLLL = 0;
                }
                Integer numValueOf = Integer.valueOf(iLJIILJJIL + iLIZLLL);
                i = 8;
                c = 1;
                C1189060h32.LJJII(frameLayout, null, null, numValueOf, null);
                Context context2 = getContext();
                if (context2 != null && C960203pA.LIZIZ(context2)) {
                    if (tuxIconView != null) {
                        tuxIconView.setBackgroundResource(R.drawable.cuh);
                    }
                } else if (tuxIconView != null) {
                    tuxIconView.setBackgroundResource(R.drawable.cui);
                }
            } else {
                i = 8;
                c = 1;
                C339190DRl.LIZIZ(tuxIconView);
            }
            C339190DRl.LIZLLL(frameLayout);
            View viewFindViewById2 = viewGroup.findViewById(R.id.r3e);
            if (viewFindViewById2 != null && viewFindViewById2.getVisibility() == 0) {
                charSequence = null;
                C1189060h32.LJJII(frameLayout, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), null, null);
            } else {
                charSequence = null;
                C1189060h32.LJJII(frameLayout, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null);
            }
            String[] strArr = new String[2];
            strArr[0] = str10;
            strArr[c] = str11;
            textView.setText(C13LP.LJJLIIIJ(C13LQ.LJIJI(strArr), " · ", charSequence, charSequence, 0, charSequence, charSequence, 62));
            C786410Ut5.I7(new AkS57S0200000_18(this, tuxIconView, 30), tuxIconView);
            C786410Ut5.I7(new AkS57S0200000_18(this, frameLayout, 31), frameLayout);
        }
        zp(viewGroup, poiDetailResponse);
        Bp(viewGroup, poiDetailResponse);
        Ep(viewGroup, poiDetailResponse);
        aq(viewGroup, poiDetailResponse);
        Ip(viewGroup, poiDetailResponse);
        Jp(viewGroup, poiDetailResponse, cp().LL);
        String str12 = cp().LL;
        C1184460gvc c1184460gvcOo8 = Oo();
        if (c1184460gvcOo8 != null) {
            c1184480gve = c1184460gvcOo8.LLILLL;
        } else {
            c1184480gve = null;
        }
        Ap(viewGroup, str12, poiDetailResponse, c1184480gve);
        tp(viewGroup);
        this.LLJJI = poiDetailResponse;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Tp(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        View viewFindViewById = view.findViewById(R.id.doo);
        View viewFindViewById2 = view.findViewById(R.id.doq);
        C339190DRl.LIZIZ(viewFindViewById);
        C339190DRl.LIZIZ(viewFindViewById2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[ADDED_TO_REGION, REMOVE] */
    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dq(android.view.View r27, java.lang.String r28, boolean r29, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssem.dq(android.view.View, java.lang.String, boolean, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
