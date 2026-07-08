package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel;

import X.C0251006n;
import X.C098200Yq;
import X.C09RD;
import X.C09RE;
import X.C0BMX;
import X.C0H4V;
import X.C0H4W;
import X.C0IDH;
import X.C0IDX;
import X.C1175120ggY;
import X.C1180060goW;
import X.C1180600gpO;
import X.C1180760gpe;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1184550gvl;
import X.C1184710gw1;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1186070gyD;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1189400h3a;
import X.C1191160h6Q;
import X.C1202680hP0;
import X.C1203300hQ0;
import X.C1209070hZJ;
import X.C1252710ihh;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1367960lha;
import X.C13LE;
import X.C13LQ;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1843500y4a;
import X.C189200o6;
import X.C19M4;
import X.C19MB;
import X.C20642515q3;
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
import X.C427690Gpr;
import X.C438710HIf;
import X.C443120HZe;
import X.C444960Hcc;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1184760gw6;
import X.EnumC1184810gwB;
import X.EnumC1203020hPY;
import X.EnumC1338240kve;
import X.InterfaceC1184330gvP;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiStyleConfig;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.ai.model.PoiHeadAiSummary;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell.HighLightIconTag;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell.PoiChartCell;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell.PoiHighLightIconCell;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell.PoiTagDividerCell;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.ChartInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.DistanceInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.IconTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiHighlightTagModule;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import irm.AkS0S3400000_18;
import irm.AkS0S7410000_18;
import irm.AkS28S0300000_18;
import irm.AkS2S0500000_18;
import irm.AkS87S0100000_18;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS115S0400000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS23S1400000_18;
import kotlin.jvm.internal.AwS38S1400000_18;
import kotlin.jvm.internal.AwS83S1300000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailTravelHeaderAssemV2 extends PoiDetailHeaderAssem {
    public final C1184710gw1 LLJJJJLIIL;
    public C0IDX LLJJL;
    public List<IconTag> LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final int Jo() {
        return R.layout.e0d;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final boolean mp() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final boolean op(PoiListApi.PoiDetailResponse poiDetailResponse) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1184710gw1 c1184710gw1 = this.LLJJJJLIIL;
        if (c1184710gw1 != null) {
            ((LinkedHashMap) c1184710gw1.LIZ).clear();
            EnumC1184760gw6 enumC1184760gw6 = EnumC1184760gw6.UNKNOWN;
            c1184710gw1.LIZIZ = enumC1184760gw6;
            c1184710gw1.LIZJ = enumC1184760gw6;
        }
        super.onDestroy();
    }

    public PoiDetailTravelHeaderAssemV2() {
        this.LLJJJJLIIL = C0BMX.LIZ() ? new C1184710gw1() : null;
    }

    public final int lq() {
        PoiListApi.PoiDetailResponse poiDetailResponse;
        PoiStyleConfig poiStyleConfig;
        C1184460gvc c1184460gvcOo = Oo();
        return C1175120ggY.LIZJ((c1184460gvcOo == null || (poiDetailResponse = c1184460gvcOo.LLILLJJLI) == null || (poiStyleConfig = poiDetailResponse.getPoiStyleConfig()) == null) ? null : poiStyleConfig.travelHeaderRefactorType);
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2.pq(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse):X.0HZe");
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02f3 A[PHI: r13
      0x02f3: PHI (r13v10 com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) = 
      (r13v9 com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag)
      (r13v14 com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag)
     binds: [B:153:0x02c0, B:157:0x02cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x09c7  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c1  */
    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Gp(android.view.ViewGroup r30, final com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r31) {
        /*
            Method dump skipped, instruction units count: 2683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2.Gp(android.view.ViewGroup, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Tp(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        ChartInfo chartTag;
        View viewFindViewById = view.findViewById(R.id.doq);
        viewFindViewById.setTag(1706771800, "pick_entrance");
        if (poiDetailResponse != null && (chartTag = poiDetailResponse.getChartTag()) != null) {
            C337180DJs.LIZJ(viewFindViewById);
            C1189060h32.LJJIIJ(viewFindViewById, new AwS227S0300000_18(this, poiDetailResponse, chartTag, 28));
            C786410Ut5.LJLLLLLL(0, viewFindViewById.findViewById(R.id.dov));
            ((TextView) viewFindViewById.findViewById(R.id.dou)).setText(chartTag.chartTopicName);
            C2211631BhB.LJ(viewFindViewById, new AwS115S0400000_18(viewFindViewById, this, poiDetailResponse, chartTag, 8));
            return;
        }
        C339190DRl.LIZIZ(viewFindViewById);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Up(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        UrlModel cover;
        UrlModel cover2;
        int iIntValue;
        PictureAlbum pictureAlbum;
        List<UrlModel> picturesByExperiment;
        PictureAlbum pictureAlbum2;
        Integer numLIZJ;
        PictureAlbum pictureAlbum3;
        PictureAlbum pictureAlbum4;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.r3e);
        TextView textView = (TextView) view.findViewById(R.id.r3f);
        View viewFindViewById = view.findViewById(R.id.jk8);
        int i = 0;
        if (poiDetailResponse != null && poiDetailResponse.isHeaderAlbumMode()) {
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
            UrlModel cover3 = null;
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
                    pictureAlbum3 = poiDetailResponse3.getPictureAlbum();
                } else {
                    pictureAlbum3 = null;
                }
                if (poiDetailResponse != null) {
                    pictureAlbum4 = poiDetailResponse.getPictureAlbum();
                } else {
                    pictureAlbum4 = null;
                }
                if (Intrinsics.LJFF(pictureAlbum3, pictureAlbum4)) {
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
            C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_detail_header_img", null);
            c1180600gpO.LIZLLL = new C1202680hP0(cp().LL, null, null, null, null, 30);
            if (poiDetailResponse != null) {
                cover3 = poiDetailResponse.getCover();
            }
            C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(cover3));
            c1189360h3WLIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
            c1189360h3WLIZ.LIZLLL(smartImageView);
            c1189360h3WLIZ.LIZ.LIZLLL("poi_detail_header_img");
            c1189360h3WLIZ.LIZ.LJJ = EnumC1338240kve.CENTER_CROP;
            c1189360h3WLIZ.LIZIZ();
            PoiDetailHeaderAssem.up(poiDetailResponse);
            if (poiDetailResponse != null && (pictureAlbum = poiDetailResponse.getPictureAlbum()) != null && (picturesByExperiment = pictureAlbum.getPicturesByExperiment()) != null && picturesByExperiment.size() > 1) {
                if (textView != null) {
                    C337180DJs.LIZJ(textView);
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.zg, view.getContext());
                    c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
                    textView.setBackground(c384050F3z.LIZ(view.getContext()));
                    if (poiDetailResponse != null && (pictureAlbum2 = poiDetailResponse.getPictureAlbum()) != null) {
                        i = pictureAlbum2.totalPictureNum;
                    }
                    textView.setText(String.valueOf(i));
                }
            } else if (textView != null) {
                C339190DRl.LIZIZ(textView);
            }
            C786410Ut5.I7(new AkS28S0300000_18(smartImageView, this, poiDetailResponse, 10), smartImageView);
            C2211631BhB.LJ(smartImageView, new AwS227S0300000_18(smartImageView, this, poiDetailResponse, 29));
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
            } else if (((View) c09re.next()).getVisibility() != 8) {
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
                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                String str2 = aiSummary.dimensionKey;
                PageFinder pageFinderZo = Zo();
                C1184710gw1 c1184710gw1 = this.LLJJJJLIIL;
                c1185430gxB.getClass();
                C1185430gxB.LJI(pageFinderZo, interfaceC665370Q7zLJIIL, c1184710gw1, str2);
            } else {
                C339190DRl.LIZIZ(c1180760gpe);
            }
            if (!Intrinsics.LJFF(aiSummary.clickEnable, Boolean.FALSE)) {
                C786410Ut5.I7(new AkS2S0500000_18(this, context, c1180760gpe, poiDetailResponse, aiSummary, 1), c1180760gpe);
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
        String str2;
        String str3;
        C1184480gve c1184480gve2;
        C1184480gve c1184480gve3;
        int i;
        if (poiDetailResponse == null) {
            return;
        }
        TextView textView2 = (TextView) view.findViewById(R.id.qw6);
        int i2 = 0;
        if (poiDetailResponse.getAddress() != null) {
            z = true;
        } else {
            z = false;
        }
        String str4 = null;
        if (z) {
            textView = textView2;
        } else {
            textView = null;
        }
        if (textView != null) {
            String address = poiDetailResponse.getAddress();
            if (address == null) {
                address = "";
            }
            textView.setText(address);
            if (poiDetailResponse.getAddress() != null && textView2 != null) {
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
                    c419890GdH.LIZIZ(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C444960Hcc.LIZJ(textView2.getContext()));
                    C786410Ut5.q2(spannableStringBuilder, c419890GdH, 0, 1, 33);
                } else {
                    spannableStringBuilder.append((CharSequence) poiDetailResponse.getAddress());
                }
                textView2.setText(spannableStringBuilder);
            }
            if (C444960Hcc.LIZJ(textView.getContext())) {
                i = 4;
            } else {
                i = 3;
            }
            textView.setTextDirection(i);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.r1x);
        tuxTextView.setMaxLines(2);
        if (poiDetailResponse.getDistanceInfo() != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            DistanceInfo distanceInfo = poiDetailResponse.getDistanceInfo();
            if (distanceInfo != null) {
                str2 = distanceInfo.distanceText;
            } else {
                str2 = null;
            }
            tuxTextView.setText(str2);
            textView2.setMaxLines(1);
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            String str5 = cp().LL;
            String collectInfo = poiDetailResponse.getCollectInfo();
            C1184460gvc c1184460gvcOo = Oo();
            if (c1184460gvcOo != null && (c1184480gve3 = c1184460gvcOo.LLILLL) != null) {
                str3 = c1184480gve3.LLILLJJLI;
            } else {
                str3 = null;
            }
            C1184460gvc c1184460gvcOo2 = Oo();
            if (c1184460gvcOo2 != null && (c1184480gve2 = c1184460gvcOo2.LLILLL) != null) {
                str4 = c1184480gve2.LL;
            }
            DistanceInfo distanceInfo2 = poiDetailResponse.getDistanceInfo();
            if (distanceInfo2 != null) {
                i2 = distanceInfo2.distanceType;
            }
            Integer userLocation = poiDetailResponse.getUserLocation();
            PageFinder pageFinderZo = Zo();
            C1184710gw1 c1184710gw1 = this.LLJJJJLIIL;
            c1185430gxB.getClass();
            C1185430gxB.LJJJLL(interfaceC665370Q7zLJIIL, str5, collectInfo, str3, str4, i2, userLocation, pageFinderZo, c1184710gw1);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            textView2.setMaxLines(2);
        }
        C1209070hZJ c1209070hZJ = this.LLJJJJ;
        C1367960lha.LIZ.getClass();
        c1209070hZJ.invoke(textView2, C1367960lha.LIZ().LJLI(poiDetailResponse.getName(), poiDetailResponse.getAddress()), str, Boolean.TRUE);
        AwS38S1400000_18 awS38S1400000_18 = new AwS38S1400000_18(this, str, poiDetailResponse, view, c1184480gve, 3);
        C786410Ut5.I7(new AkS87S0100000_18(awS38S1400000_18, 30), view);
        C786410Ut5.I7(new AkS87S0100000_18(awS38S1400000_18, 31), textView2);
        C786410Ut5.I7(new AkS87S0100000_18(awS38S1400000_18, 32), tuxTextView);
    }

    public final void kq(ConstraintLayout constraintLayout, float f, int i, int i2) {
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJIIIIZZ(R.id.r3e, 3, i, 3);
        c19mb.LJIIIIZZ(R.id.r3e, 4, i2, 4);
        c19mb.LJJIIZ(f, R.id.r3e);
        c19mb.LIZIZ(constraintLayout);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Wp(View view, PoiListApi.PoiDetailResponse poiDetailResponse, String str, String str2, String str3) {
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel2;
        long jLongValue;
        boolean z;
        float fDoubleValue;
        int i;
        String quantityString;
        Object c098200Yq;
        int i2;
        String collectInfo;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.rb4);
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTag(1706771800, "review_entrance");
        if (poiDetailResponse != null) {
            poiReviewSummaryModel = poiDetailResponse.getPoiReviewSummaryModel();
        } else {
            poiReviewSummaryModel = null;
        }
        if (poiReviewSummaryModel != null) {
            PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJJIII;
            if (poiDetailResponse2 != null) {
                poiReviewSummaryModel2 = poiDetailResponse2.getPoiReviewSummaryModel();
            } else {
                poiReviewSummaryModel2 = null;
            }
            if (Intrinsics.LJFF(poiReviewSummaryModel2, poiDetailResponse.getPoiReviewSummaryModel())) {
                PoiListApi.PoiDetailResponse poiDetailResponse3 = this.LLJJIII;
                if (poiDetailResponse3 != null) {
                    collectInfo = poiDetailResponse3.getCollectInfo();
                } else {
                    collectInfo = null;
                }
                if (Intrinsics.LJFF(collectInfo, poiDetailResponse.getCollectInfo())) {
                    return;
                }
            }
            this.LLJJIII = poiDetailResponse;
            PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel3 = poiDetailResponse.getPoiReviewSummaryModel();
            C1203300hQ0 c1203300hQ0 = (C1203300hQ0) viewGroup.findViewById(R.id.srg);
            TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.rbi);
            C19M4 c19m4 = (C19M4) viewGroup.findViewById(R.id.rb6);
            Long l = poiReviewSummaryModel3.totalCount;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (!Intrinsics.LJFF(poiReviewSummaryModel3.noRating, Boolean.TRUE) && jLongValue > 0) {
                z = false;
            } else {
                z = true;
            }
            if (C1184550gvl.LIZ() && z) {
                C786410Ut5.LJLZ(8, viewGroup);
                return;
            }
            C786410Ut5.LJLZ(0, viewGroup);
            if (!poiDetailResponse.showPoiSmallPic() && !poiDetailResponse.isHeaderAlbumMode()) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                C786410Ut5.X5(layoutParams, viewGroup);
            }
            String str4 = "";
            if (z) {
                this.LLJJJ = true;
                C1189060h32.LJJII(tuxTextView, 0, null, null, null);
                tuxTextView.setText("");
                tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                if (c19m4 != null) {
                    String strLJI = C20642515q3.LJI(2131844738);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLJI);
                    sbLIZ.append(' ');
                    c19m4.setText(new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ)));
                    if (C0H4W.LIZIZ(c19m4.getContext())) {
                        i2 = 4;
                    } else {
                        i2 = 3;
                    }
                    c19m4.setTextDirection(i2);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_star_fill;
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a02);
                    c19m4.setStartIcon(c419910GdJ);
                }
                try {
                    c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
                if (c19m4 != null) {
                    C1180060goW.LIZ(c19m4, new AwS83S1300000_18(c1185410gx9, this, str, poiDetailResponse, 6));
                }
                C339190DRl.LIZIZ(c1203300hQ0);
                C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                PageFinder pageFinderZo = Zo();
                C1184710gw1 c1184710gw1 = this.LLJJJJLIIL;
                c1191160h6Q.getClass();
                C1191160h6Q.LJJIIJ(pageFinderZo, interfaceC665370Q7zLJIIL, c1184710gw1, "poi_detail_general_header");
            } else {
                if (c19m4 != null) {
                    Resources resources = c19m4.getResources();
                    if (resources != null && (quantityString = resources.getQuantityString(2131755624, (int) jLongValue, C1843500y4a.LIZIZ(jLongValue))) != null) {
                        str4 = quantityString;
                    }
                    c19m4.setText(str4);
                    if (C0H4W.LIZIZ(c19m4.getContext())) {
                        i = 4;
                    } else {
                        i = 3;
                    }
                    c19m4.setTextDirection(i);
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZ = R.raw.icon_chevron_right_slim_thin_ltr;
                    c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(7.2d)));
                    c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.a1j);
                    c19m4.setEndIcon(c419910GdJ2);
                }
                C1191160h6Q c1191160h6Q2 = C1191160h6Q.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
                PageFinder pageFinderZo2 = Zo();
                C1184710gw1 c1184710gw12 = this.LLJJJJLIIL;
                c1191160h6Q2.getClass();
                C1191160h6Q.LJJII(pageFinderZo2, interfaceC665370Q7zLJIIL2, c1184710gw12, "poi_detail_general_header");
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, view.getContext());
                if (numLIZJ != null) {
                    tuxTextView.setTextColor(numLIZJ.intValue());
                }
                C1189060h32.LJJII(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, null, null);
                tuxTextView.setTuxFont(62);
                tuxTextView.setText(String.valueOf(poiReviewSummaryModel3.score));
                C337180DJs.LIZJ(c1203300hQ0);
                Double d = poiReviewSummaryModel3.score;
                if (d != null) {
                    fDoubleValue = (float) d.doubleValue();
                } else {
                    fDoubleValue = 0.0f;
                }
                c1203300hQ0.setValue(fDoubleValue);
                C427690Gpr.LJI(viewGroup, null);
                C786410Ut5.I7(new AkS0S3400000_18(this, str, poiDetailResponse, poiReviewSummaryModel3, str2, str3, viewGroup, 1), viewGroup);
            }
            C2211631BhB.LJ(viewGroup, new AwS23S1400000_18(viewGroup, str, poiDetailResponse, poiReviewSummaryModel3, this, 2));
            return;
        }
        C786410Ut5.LJLZ(8, viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void dq(View view, String str, boolean z, PoiListApi.PoiDetailResponse poiDetailResponse, String str2, String str3, String str4, String str5, String str6, String str7) {
        List<IconTag> list;
        boolean z2;
        int i;
        C0H4V c0h4v;
        int i2;
        int iHashCode;
        GradientDrawable gradientDrawable;
        PoiHighlightTagModule poiHighlightTagModule;
        PoiHighlightTagModule poiHighlightTagModule2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rdw);
        View viewFindViewById = view.findViewById(R.id.olr);
        viewFindViewById.setTag(1706771800, "info_bar");
        viewOnAttachStateChangeListenerC20604515jv.setTag(1706771800, "info_bar");
        List<IconTag> list2 = null;
        if (poiDetailResponse != null && (poiHighlightTagModule2 = poiDetailResponse.getPoiHighlightTagModule()) != null) {
            list = poiHighlightTagModule2.iconTags;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (poiDetailResponse != null && str != null && !z2) {
            C443120HZe<String, String, String> c443120HZePq = pq(poiDetailResponse);
            List listLJIJI = C13LQ.LJIJI(new String[]{c443120HZePq.getFirst(), c443120HZePq.getSecond(), c443120HZePq.getThird()});
            if (((ArrayList) listLJIJI).size() == 1) {
                c0h4v = new C0H4V(Integer.valueOf(((String) ListProtector.get(listLJIJI, 0)).hashCode()), new HighLightIconTag((CharSequence) ListProtector.get(listLJIJI, 0), null, null), 1);
                i = 1;
            } else {
                i = 2;
                c0h4v = null;
            }
            if (list != null) {
                PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJJI;
                if (poiDetailResponse2 != null && (poiHighlightTagModule = poiDetailResponse2.getPoiHighlightTagModule()) != null) {
                    list2 = poiHighlightTagModule.iconTags;
                }
                if (Intrinsics.LJFF(list2, list) || Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, list)) {
                    return;
                }
            }
            this.LLJJLIIIJLLLLLLLZ = list;
            poiDetailResponse.showPoiSmallPic();
            if (list != null && !list.isEmpty()) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            } else {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            if (c0h4v != null) {
                C337180DJs.LIZJ(viewFindViewById.findViewById(R.id.f801suk));
            } else {
                C786410Ut5.LJLLLLLL(4, viewFindViewById.findViewById(R.id.f801suk));
            }
            if (C960203pA.LIZIZ(viewFindViewById.getContext())) {
                viewFindViewById.setBackgroundResource(R.drawable.cuh);
            } else {
                viewFindViewById.setBackgroundResource(R.drawable.cui);
            }
            viewFindViewById.setLayoutDirection(C0H4W.LIZ() ? 1 : 0);
            if (C0H4W.LIZ()) {
                Drawable drawableMutate = viewFindViewById.getBackground().mutate();
                if ((drawableMutate instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawableMutate) != null) {
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
                }
            }
            C786410Ut5.I7(new AkS0S7410000_18(this, viewFindViewById, str, z, viewFindViewById, str2, str3, str4, str5, str6, str7, poiDetailResponse, 6), viewFindViewById);
            C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv);
            viewOnAttachStateChangeListenerC20604515jv.setOrientation(0);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiChartCell.class);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiHighLightIconCell.class);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiTagDividerCell.class);
            if (viewOnAttachStateChangeListenerC20604515jv.getItemDecorationCount() <= 0) {
                viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0IDH(C1180060goW.LJIILJJIL(viewFindViewById), this, 2));
            }
            ArrayList arrayList = new ArrayList();
            if (c0h4v != null) {
                arrayList.add(c0h4v);
                arrayList.add(new C0251006n(0));
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (list != null) {
                int i3 = 0;
                for (IconTag iconTag : list) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        IconTag iconTag2 = iconTag;
                        int i5 = i3 + i2;
                        String str8 = iconTag2.tagContent;
                        if (str8 != null) {
                            iHashCode = str8.hashCode();
                        } else {
                            iHashCode = 0;
                        }
                        arrayList.add(new C0H4V(Integer.valueOf(iHashCode | i5), new HighLightIconTag(iconTag2.tagContent, iconTag2.icon, iconTag2.tagId), i));
                        arrayList.add(new C0251006n(i5));
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            if ((true ^ arrayList.isEmpty()) && arrayList.size() - 1 < arrayList.size()) {
                ListProtector.remove(arrayList, arrayList.size() - 1);
            }
            viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(arrayList, null);
            return;
        }
        C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv);
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        this.LLJJLIIIJLLLLLLLZ = null;
        viewOnAttachStateChangeListenerC20604515jv.getState().LJFF(null);
    }
}
