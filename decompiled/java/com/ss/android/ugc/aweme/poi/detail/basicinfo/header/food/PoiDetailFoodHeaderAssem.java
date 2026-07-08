package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food;

import X.C09RD;
import X.C09RE;
import X.C0BMX;
import X.C0IDX;
import X.C1175120ggY;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1180760gpe;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1184710gw1;
import X.C1186070gyD;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1189400h3a;
import X.C1202680hP0;
import X.C1209070hZJ;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1367960lha;
import X.C19MB;
import X.C2097608Jq;
import X.C21415018rM;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C337180DJs;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C426750GoL;
import X.C438710HIf;
import X.C444960Hcc;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1177490gkN;
import X.EnumC1184760gw6;
import X.EnumC1184810gwB;
import X.EnumC1203020hPY;
import X.EnumC1338240kve;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiStyleConfig;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.ai.model.PoiHeadAiSummary;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.ChartInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.DistanceInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.IconTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum;
import com.zhiliaoapp.musically.R;
import irm.AkS1S0600000_18;
import irm.AkS28S0300000_18;
import irm.AkS87S0100000_18;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS115S0400000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS38S1400000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailFoodHeaderAssem extends PoiDetailHeaderAssem {
    public C0IDX LLJJJJLIIL;
    public List<IconTag> LLJJL;
    public final C1184710gw1 LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final int Jo() {
        return R.layout.e05;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final boolean op(PoiListApi.PoiDetailResponse poiDetailResponse) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1184710gw1 c1184710gw1 = this.LLJJLIIIJLLLLLLLZ;
        if (c1184710gw1 != null) {
            ((LinkedHashMap) c1184710gw1.LIZ).clear();
            EnumC1184760gw6 enumC1184760gw6 = EnumC1184760gw6.UNKNOWN;
            c1184710gw1.LIZIZ = enumC1184760gw6;
            c1184710gw1.LIZJ = enumC1184760gw6;
        }
        super.onDestroy();
    }

    public PoiDetailFoodHeaderAssem() {
        this.LLJJLIIIJLLLLLLLZ = C0BMX.LIZ() ? new C1184710gw1() : null;
    }

    public final int lq() {
        PoiListApi.PoiDetailResponse poiDetailResponse;
        PoiStyleConfig poiStyleConfig;
        C1184460gvc c1184460gvcOo = Oo();
        return C1175120ggY.LIZJ((c1184460gvcOo == null || (poiDetailResponse = c1184460gvcOo.LLILLJJLI) == null || (poiStyleConfig = poiDetailResponse.getPoiStyleConfig()) == null) ? null : poiStyleConfig.foodHeaderRefactorType);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair qq(com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r7) {
        /*
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagContent r0 = r7.tagContent
            r3 = 0
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.poi.detail.container.model.PriceInfo r2 = r0.priceInfo
            if (r2 == 0) goto L17
            com.ss.android.ugc.aweme.poi.detail.container.model.PriceLevel r6 = r2.priceLevel
        Lb:
            int r1 = r7.tagType
            X.0gna r0 = X.EnumC1179480gna.POI_DETAIL_TAG_TYPE_PRICE
            int r0 = r0.getValue()
            if (r1 == r0) goto L19
            return r3
        L16:
            r2 = r3
        L17:
            r6 = r3
            goto Lb
        L19:
            if (r2 == 0) goto L39
            java.lang.String r0 = r2.priceRange
            if (r0 == 0) goto L29
            java.lang.String r2 = r2.priceRange
            X.0gw8 r1 = X.EnumC1184780gw8.RANGE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        L29:
            if (r2 == 0) goto L39
            java.lang.String r0 = r2.priceNum
            if (r0 == 0) goto L39
            java.lang.String r2 = r2.priceNum
            X.0gw8 r1 = X.EnumC1184780gw8.RANGE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        L39:
            if (r6 == 0) goto L7a
            int r3 = r6.totalLevel
            r2 = 0
            java.lang.String r5 = ""
            r4 = 0
        L41:
            if (r2 >= r3) goto L60
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r5)
            java.lang.String r0 = r6.currencySymbol
            r1.append(r0)
            java.lang.String r5 = X.C2188811AlT.LIZIZ(r1)
            int r0 = r6.actualLevel
            int r0 = r0 + (-1)
            if (r2 != r0) goto L5d
            int r4 = r5.length()
        L5d:
            int r2 = r2 + 1
            goto L41
        L60:
            int r3 = r5.length()
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r5)
            X.0h8J r1 = new X.0h8J
            r1.<init>()
            r0 = 17
            X.C786410Ut5.p2(r2, r1, r4, r3, r0)
            X.0gw8 r0 = X.EnumC1184780gw8.GRADE
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r2, r0)
        L7a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem.qq(com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag):kotlin.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098 A[PHI: r5
      0x0098: PHI (r5v1 java.lang.String) = 
      (r5v0 java.lang.String)
      (r5v4 java.lang.String)
      (r5v4 java.lang.String)
      (r5v4 java.lang.String)
      (r5v4 java.lang.String)
     binds: [B:48:0x0095, B:17:0x0032, B:24:0x0051, B:26:0x0055, B:28:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C443120HZe<java.lang.String, java.lang.String, java.lang.String> pq(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r8) {
        /*
            r7 = this;
            r6 = 0
            if (r8 == 0) goto L94
            java.util.List r0 = r8.getTags()
            if (r0 == 0) goto L94
            java.util.Iterator r3 = r0.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r0 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) r0
            int r1 = r0.tagType
            X.0gna r0 = X.EnumC1179480gna.POI_DETAIL_TAG_OPENING_STATUS
            int r0 = r0.getValue()
            if (r1 != r0) goto Ld
        L24:
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r2 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) r2
            if (r2 == 0) goto L94
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagContent r0 = r2.tagContent
            if (r0 == 0) goto L94
            java.lang.String r5 = r0.commonText
        L2e:
            java.util.List r0 = r8.getTags()
            if (r0 == 0) goto L98
            java.util.Iterator r3 = r0.iterator()
        L38:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r0 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) r0
            int r1 = r0.tagType
            X.0gna r0 = X.EnumC1179480gna.POI_DETAIL_TAG_TYPE_OPENING_TIME
            int r0 = r0.getValue()
            if (r1 != r0) goto L38
        L4f:
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r2 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) r2
            if (r2 == 0) goto L98
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagContent r0 = r2.tagContent
            if (r0 == 0) goto L98
            com.ss.android.ugc.aweme.poi.detail.container.model.OpeningTimeInfo r0 = r0.openingTime
            if (r0 == 0) goto L98
            java.lang.String r4 = r0.openingTimeText
        L5d:
            java.util.List r0 = r8.getTags()
            if (r0 == 0) goto L88
            java.util.Iterator r3 = r0.iterator()
        L67:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r0 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) r0
            int r1 = r0.tagType
            X.0gna r0 = X.EnumC1179480gna.POI_DETAIL_TAG_TYPE_CATEGORY
            int r0 = r0.getValue()
            if (r1 != r0) goto L67
        L7e:
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r2 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) r2
            if (r2 == 0) goto L88
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagContent r0 = r2.tagContent
            if (r0 == 0) goto L88
            java.lang.String r6 = r0.commonText
        L88:
            X.0HZe r0 = new X.0HZe
            r0.<init>(r5, r4, r6)
            return r0
        L8e:
            r2 = r6
            goto L7e
        L90:
            r2 = r6
            goto L4f
        L92:
            r2 = r6
            goto L24
        L94:
            r5 = r6
            if (r8 == 0) goto L98
            goto L2e
        L98:
            r4 = r6
            if (r8 == 0) goto L88
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem.pq(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse):X.0HZe");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Bp(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        String address;
        DistanceInfo distanceInfo;
        if (poiDetailResponse == null) {
            return;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJJI;
        String name = null;
        if (poiDetailResponse2 != null) {
            address = poiDetailResponse2.getAddress();
        } else {
            address = null;
        }
        if (Intrinsics.LJFF(address, poiDetailResponse.getAddress())) {
            PoiListApi.PoiDetailResponse poiDetailResponse3 = this.LLJJI;
            if (poiDetailResponse3 != null) {
                distanceInfo = poiDetailResponse3.getDistanceInfo();
            } else {
                distanceInfo = null;
            }
            if (Intrinsics.LJFF(distanceInfo, poiDetailResponse.getDistanceInfo())) {
                PoiListApi.PoiDetailResponse poiDetailResponse4 = this.LLJJI;
                if (poiDetailResponse4 != null) {
                    name = poiDetailResponse4.getName();
                }
                if (Intrinsics.LJFF(name, poiDetailResponse.getName())) {
                    return;
                }
            }
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.qvy);
        C1186070gyD c1186070gyD = C1186070gyD.LIZ;
        Context context = view.getContext();
        EnumC1184810gwB enumC1184810gwB = EnumC1184810gwB.BOTTOM_NEW;
        c1186070gyD.getClass();
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(C1186070gyD.LIZIZ(context, enumC1184810gwB));
        c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
        C1189400h3a.LIZIZ(c1331670kl3LJIIIZ, "poi_detail", "poi_detail_address_bg", C2097608Jq.LJIIJ(new Pair("poi_id", cp().LL)));
        c1331670kl3LJIIIZ.LJJI(imageView);
        c1331670kl3LJIIIZ.LJIIJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d6 A[PHI: r2
      0x01d6: PHI (r2v1 com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) = 
      (r2v0 com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag)
      (r2v158 com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag)
     binds: [B:91:0x01a3, B:93:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03e8 A[PHI: r8
      0x03e8: PHI (r8v11 com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) = 
      (r8v10 com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag)
      (r8v22 com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag)
     binds: [B:204:0x03b0, B:206:0x03b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0187  */
    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Gp(android.view.ViewGroup r26, final com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r27) {
        /*
            Method dump skipped, instruction units count: 2467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem.Gp(android.view.ViewGroup, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Tp(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        ChartInfo chartTag;
        View viewFindViewById = view.findViewById(R.id.doq);
        viewFindViewById.setTag(1706771800, "pick_entrance");
        if (poiDetailResponse != null && (chartTag = poiDetailResponse.getChartTag()) != null) {
            C337180DJs.LIZJ(viewFindViewById);
            C1189060h32.LJJIIJ(viewFindViewById, new AwS227S0300000_18(this, poiDetailResponse, chartTag, 26));
            C786410Ut5.LJLLLLLL(0, viewFindViewById.findViewById(R.id.dov));
            ((TextView) viewFindViewById.findViewById(R.id.dou)).setText(chartTag.chartTopicName);
            C2211631BhB.LJ(viewFindViewById, new AwS115S0400000_18(viewFindViewById, this, poiDetailResponse, chartTag, 7));
            return;
        }
        C339190DRl.LIZIZ(viewFindViewById);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Up(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        boolean z;
        UrlModel cover;
        UrlModel cover2;
        int iIntValue;
        List<UrlModel> picturesByExperiment;
        Integer numLIZJ;
        PictureAlbum pictureAlbum;
        PictureAlbum pictureAlbum2;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.r3e);
        TextView textView = (TextView) view.findViewById(R.id.r3f);
        View viewFindViewById = view.findViewById(R.id.jk8);
        int i = 0;
        if (poiDetailResponse != null && poiDetailResponse.isHeaderAlbumMode()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (viewFindViewById != null) {
                C337180DJs.LIZJ(viewFindViewById);
            }
            view.setPadding(view.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), view.getPaddingRight(), view.getPaddingBottom());
        } else {
            if (viewFindViewById != null) {
                C339190DRl.LIZIZ(viewFindViewById);
            }
            view.setPadding(view.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), view.getPaddingRight(), view.getPaddingBottom());
        }
        if (poiDetailResponse != null && poiDetailResponse.showPoiSmallPic()) {
            PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJJI;
            if (poiDetailResponse2 != null) {
                cover = poiDetailResponse2.getCover();
            } else {
                cover = null;
            }
            if (poiDetailResponse != null) {
                cover2 = poiDetailResponse.getCover();
            } else {
                cover2 = null;
            }
            if (Intrinsics.LJFF(cover, cover2)) {
                PoiListApi.PoiDetailResponse poiDetailResponse3 = this.LLJJI;
                if (poiDetailResponse3 != null) {
                    pictureAlbum = poiDetailResponse3.getPictureAlbum();
                } else {
                    pictureAlbum = null;
                }
                if (poiDetailResponse != null) {
                    pictureAlbum2 = poiDetailResponse.getPictureAlbum();
                } else {
                    pictureAlbum2 = null;
                }
                if (Intrinsics.LJFF(pictureAlbum, pictureAlbum2)) {
                    return;
                }
            }
            if (smartImageView != null) {
                C337180DJs.LIZJ(smartImageView);
            }
            smartImageView.setTag(1706771800, "head_pic");
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            c1331750klB.LJII = EnumC1203020hPY.BITMAP_ONLY;
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c1331750klB.LIZJ = iIntValue;
            c1331750klB.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
            C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_detail_header_img", new C1180560gpK(getContext(), EnumC1177490gkN.FALLBACK_26_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(8))), null));
            c1180600gpO.LIZLLL = new C1202680hP0(cp().LL, null, null, null, null, 30);
            C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(poiDetailResponse.getCover()));
            c1189360h3WLIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
            c1189360h3WLIZ.LIZLLL(smartImageView);
            c1189360h3WLIZ.LIZ.LJJ = EnumC1338240kve.CENTER_CROP;
            c1189360h3WLIZ.LIZIZ();
            PoiDetailHeaderAssem.up(poiDetailResponse);
            PictureAlbum pictureAlbum3 = poiDetailResponse.getPictureAlbum();
            if (pictureAlbum3 != null && (picturesByExperiment = pictureAlbum3.getPicturesByExperiment()) != null && picturesByExperiment.size() > 1) {
                if (textView != null) {
                    C337180DJs.LIZJ(textView);
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.zg, view.getContext());
                    c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
                    textView.setBackground(c384050F3z.LIZ(view.getContext()));
                    PictureAlbum pictureAlbum4 = poiDetailResponse.getPictureAlbum();
                    if (pictureAlbum4 != null) {
                        i = pictureAlbum4.totalPictureNum;
                    }
                    textView.setText(String.valueOf(i));
                }
            } else if (textView != null) {
                C339190DRl.LIZIZ(textView);
            }
            C786410Ut5.I7(new AkS28S0300000_18(smartImageView, this, poiDetailResponse, 9), smartImageView);
            C2211631BhB.LJ(smartImageView, new AwS227S0300000_18(smartImageView, this, poiDetailResponse, 27));
            return;
        }
        if (smartImageView != null) {
            C339190DRl.LIZIZ(smartImageView);
        }
        if (textView != null) {
            C339190DRl.LIZIZ(textView);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final int Vo(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        int marginStart;
        View viewFindViewById = view.findViewById(R.id.r3e);
        int marginEnd = 0;
        if (poiDetailResponse == null || !poiDetailResponse.showPoiSmallPic()) {
            return 0;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(94));
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        int i = iLIZIZ + marginStart;
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
        }
        return i + marginEnd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tq(android.view.ViewGroup r19, final com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r20) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem.tq(android.view.ViewGroup, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void zp(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        int i;
        PoiHeadAiSummary aiSummary;
        Iterator<View> it2 = new C09RD((ViewGroup) view.findViewById(R.id.jo4)).iterator();
        boolean z = true;
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                break;
            }
            View view2 = (View) c09re.next();
            if (view2.getVisibility() != 8 && !(view2 instanceof C1180760gpe)) {
                z = false;
            }
        }
        if (z) {
            i = R.id.qwa;
        } else {
            i = R.id.qw9;
        }
        C1180760gpe c1180760gpe = (C1180760gpe) view.findViewById(i);
        C339190DRl.LIZIZ(c1180760gpe);
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (poiDetailResponse != null && (aiSummary = poiDetailResponse.getAiSummary()) != null) {
            ViewGroup container = c1180760gpe.getContainer();
            if (container != null) {
                C426750GoL.LJIIL(container, 0, 0, 0, 0, 16);
            }
            TuxTextView aiSummaryTitle = c1180760gpe.getAiSummaryTitle();
            if (aiSummaryTitle != null) {
                aiSummaryTitle.setTuxFont(61);
            }
            TuxIconView aiSummaryStartIcon = c1180760gpe.getAiSummaryStartIcon();
            if (aiSummaryStartIcon != null) {
                ViewGroup.LayoutParams layoutParams = aiSummaryStartIcon.getLayoutParams();
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                C786410Ut5.M6(aiSummaryStartIcon, layoutParams);
            }
            String str = aiSummary.recommendationText;
            if (str != null && str.length() > 0) {
                C337180DJs.LIZJ(c1180760gpe);
                c1180760gpe.LIZ(aiSummary);
                C337180DJs.LIZJ(view.findViewById(R.id.r1y));
                vq(this.LLJJI, poiDetailResponse, "ai", new AwS419S0200000_18(this, poiDetailResponse, 63), new AwS384S0200000_18(this, aiSummary, 89));
            } else {
                C339190DRl.LIZIZ(c1180760gpe);
            }
            if (!Intrinsics.LJFF(aiSummary.clickEnable, Boolean.FALSE)) {
                C786410Ut5.I7(new AkS1S0600000_18(this, context, view, poiDetailResponse, c1180760gpe, aiSummary, 1), c1180760gpe);
                return;
            } else {
                C786410Ut5.ia(c1180760gpe);
                c1180760gpe.setClickable(false);
                return;
            }
        }
        C339190DRl.LIZIZ(c1180760gpe);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Vp(View view, PoiListApi.PoiDetailResponse poiDetailResponse, String str) {
        String name;
        String name2;
        String name3;
        C21415018rM c21415018rM;
        Context context;
        int marginStart;
        int marginEnd;
        View view2;
        int marginStart2;
        int marginEnd2;
        int iIntValue = 0;
        this.LLJILJIL = false;
        int iVo = Vo(view, poiDetailResponse);
        PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJJI;
        Integer numValueOf = null;
        if (poiDetailResponse2 != null) {
            name = poiDetailResponse2.getName();
        } else {
            name = null;
        }
        if (poiDetailResponse != null) {
            name2 = poiDetailResponse.getName();
        } else {
            name2 = null;
        }
        if ((Intrinsics.LJFF(name, name2) && Vo(view, this.LLJJI) == iVo) || poiDetailResponse == null || (name3 = poiDetailResponse.getName()) == null || name3.length() == 0 || (c21415018rM = (C21415018rM) view.findViewById(R.id.r4z)) == null || (context = getContext()) == null) {
            return;
        }
        Object parent = c21415018rM.getParent();
        if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart2 = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart2 = 0;
            }
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd2 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
            } else {
                marginEnd2 = 0;
            }
            numValueOf = Integer.valueOf(marginStart2 + marginEnd2);
        }
        ViewGroup.LayoutParams layoutParams3 = c21415018rM.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart();
        } else {
            marginStart = 0;
        }
        ViewGroup.LayoutParams layoutParams4 = c21415018rM.getLayoutParams();
        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd();
        } else {
            marginEnd = 0;
        }
        int i = marginStart + marginEnd;
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        }
        c21415018rM.setTextLayout(Lo(context, poiDetailResponse.getName(), ((C418440Gaw.LIZLLL(context) - iVo) - ((i + iIntValue) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)))) - (view.getPaddingStart() + view.getPaddingEnd())));
        this.LLJJJJ.invoke(c21415018rM, poiDetailResponse.getName(), str, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Ap(View view, String str, PoiListApi.PoiDetailResponse poiDetailResponse, C1184480gve c1184480gve) {
        boolean z;
        TextView textView;
        if (poiDetailResponse == null) {
            return;
        }
        TextView textView2 = (TextView) view.findViewById(R.id.qw6);
        if (poiDetailResponse.getAddress() != null) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            textView = textView2;
        } else {
            textView = null;
        }
        if (textView != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (Intrinsics.LJFF(poiDetailResponse.getPoiInfoSource(), "google")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(' ');
                sbLIZ.append(poiDetailResponse.getAddress());
                spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_color_google_map;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(view.getContext());
                tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
                C419890GdH c419890GdH = new C419890GdH(tuxIconDrawableLIZ, 2);
                c419890GdH.LIZIZ(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C444960Hcc.LIZJ(textView.getContext()));
                C786410Ut5.q2(spannableStringBuilder, c419890GdH, 0, 1, 33);
            } else {
                spannableStringBuilder.append((CharSequence) poiDetailResponse.getAddress());
            }
            textView.setText(spannableStringBuilder);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.r1x);
        tuxTextView.setMaxLines(2);
        if (poiDetailResponse.getDistanceInfo() != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            DistanceInfo distanceInfo = poiDetailResponse.getDistanceInfo();
            if (distanceInfo != null) {
                str2 = distanceInfo.distanceText;
            }
            tuxTextView.setText(str2);
            textView2.setMaxLines(1);
            vq(this.LLJJI, poiDetailResponse, "address", new AwS419S0200000_18(this, poiDetailResponse, 64), new AwS384S0200000_18(this, poiDetailResponse, 90));
        } else {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            textView2.setMaxLines(2);
        }
        C1209070hZJ c1209070hZJ = this.LLJJJJ;
        C1367960lha.LIZ.getClass();
        c1209070hZJ.invoke(textView2, C1367960lha.LIZ().LJLI(poiDetailResponse.getName(), poiDetailResponse.getAddress()), str, Boolean.TRUE);
        AwS38S1400000_18 awS38S1400000_18 = new AwS38S1400000_18(this, str, poiDetailResponse, view, c1184480gve, 1);
        C786410Ut5.I7(new AkS87S0100000_18(awS38S1400000_18, 20), view);
        C786410Ut5.I7(new AkS87S0100000_18(awS38S1400000_18, 21), textView2);
        C786410Ut5.I7(new AkS87S0100000_18(awS38S1400000_18, 22), tuxTextView);
    }

    public final void kq(ConstraintLayout constraintLayout, float f, int i, int i2) {
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJIIIIZZ(R.id.r3e, 3, i, 3);
        c19mb.LJIIIIZZ(R.id.r3e, 4, i2, 4);
        c19mb.LJJIIZ(f, R.id.r3e);
        c19mb.LIZIZ(constraintLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Wp(android.view.View r25, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem.Wp(android.view.View, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vq(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r6, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r7, java.lang.String r8, kotlin.jvm.functions.Function0<java.lang.Boolean> r9, kotlin.jvm.functions.Function1<? super X.C1184710gw1, kotlin.Unit> r10) {
        /*
            r5 = this;
            boolean r0 = X.C0BMX.LIZ()
            if (r0 == 0) goto Lc
            X.0gw1 r0 = r5.LLJJLIIIJLLLLLLLZ
            r10.invoke(r0)
        Lb:
            return
        Lc:
            kotlin.jvm.internal.AwS562S0100000_18 r2 = new kotlin.jvm.internal.AwS562S0100000_18
            r0 = 1011(0x3f3, float:1.417E-42)
            r2.<init>(r10, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r8)
            r0 = 95
            r1.append(r0)
            r3 = 0
            if (r6 == 0) goto La5
            java.lang.String r0 = r6.getRdTtlsDataSource()
        L26:
            r1.append(r0)
            java.lang.String r0 = "__"
            r1.append(r0)
            if (r7 == 0) goto La3
            java.lang.String r0 = r7.getRdTtlsDataSource()
        L34:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            if (r6 == 0) goto La1
            java.lang.String r1 = r6.getRdTtlsDataSource()
        L40:
            X.0hP2 r4 = X.EnumC1202700hP2.MEMORY_CACHE
            java.lang.String r0 = r4.toString()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L5e
            if (r6 == 0) goto L9f
            java.lang.String r1 = r6.getRdTtlsDataSource()
        L52:
            X.0hP2 r0 = X.EnumC1202700hP2.SLASH_LITE_PRELOAD
            java.lang.String r0 = r0.toString()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto La7
        L5e:
            if (r7 == 0) goto L9d
            java.lang.String r1 = r7.getRdTtlsDataSource()
        L64:
            java.lang.String r0 = r4.toString()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto La7
            if (r7 == 0) goto L74
            java.lang.String r3 = r7.getRdTtlsDataSource()
        L74:
            X.0hP2 r0 = X.EnumC1202700hP2.SLASH_LITE_PRELOAD
            java.lang.String r0 = r0.toString()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 != 0) goto La7
            java.lang.Object r0 = r9.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String.valueOf(r0)
            java.lang.Object r0 = r9.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lb
            r2.invoke()
            return
        L9d:
            r1 = r3
            goto L64
        L9f:
            r1 = r3
            goto L52
        La1:
            r1 = r3
            goto L40
        La3:
            r0 = r3
            goto L34
        La5:
            r0 = r3
            goto L26
        La7:
            r2.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem.vq(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dq(android.view.View r29, java.lang.String r30, boolean r31, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem.dq(android.view.View, java.lang.String, boolean, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
