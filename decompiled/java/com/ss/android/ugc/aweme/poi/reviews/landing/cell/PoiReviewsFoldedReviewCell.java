package com.ss.android.ugc.aweme.poi.reviews.landing.cell;

import X.C01GW;
import X.C098200Yq;
import X.C0FV2;
import X.C0XQ7;
import X.C1175120ggY;
import X.C1181430gqj;
import X.C1182380gsG;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1189590h3t;
import X.C1190230h4v;
import X.C1190820h5s;
import X.C1191150h6P;
import X.C1191160h6Q;
import X.C1191340h6i;
import X.C1191350h6j;
import X.C1202300hOO;
import X.C1203280hPy;
import X.C1209100hZM;
import X.C1209504oH;
import X.C123100dR;
import X.C1247510iZJ;
import X.C1308910kAL;
import X.C1378990lzN;
import X.C1388190mED;
import X.C1390850mIV;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1843500y4a;
import X.C189200o6;
import X.C18JG;
import X.C19EG;
import X.C19M4;
import X.C19ME;
import X.C1EDK;
import X.C20742216Eq;
import X.C2211631BhB;
import X.C2365509Or;
import X.C297470BlJ;
import X.C418440Gaw;
import X.C418460Gay;
import X.C419910GdJ;
import X.C427660Gpo;
import X.C427690Gpr;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C848230XPh;
import X.C985403tE;
import X.EnumC1189990h4X;
import X.EnumC1190240h4w;
import X.InterfaceC1191710h7J;
import X.InterfaceC1542790qFZ;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewOnLongClickListenerC1208780hYq;
import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import irm.AkS87S0100000_18;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsFoldedReviewCell extends PowerCell<PoiReviewsApi.PoiReviewModel> {
    public InterfaceC1191710h7J LL;
    public C1190230h4v LLILLJJLI;
    public C427660Gpo LLILLL;
    public TuxTextView LLILZ;
    public View LLILZIL;
    public C1203280hPy LLILZLL;
    public C418460Gay LLIZ;
    public C1202300hOO LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxIconView LLJI;
    public View LLJIJIL;
    public ViewGroup LLJILJIL;
    public ViewGroup LLJILJILJ;
    public SmartImageView LLJILLL;
    public SmartImageView LLJJ;
    public SmartImageView LLJJI;
    public View LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public C1189590h3t LLJL;
    public ConstraintLayout LLJLIL;
    public SmartImageView LLJLILLLLZIIL;
    public int LLJLL;
    public PoiReviewsApi.PoiReviewModel LLJZ;
    public View LLJZIJLIL;
    public TextView LLL;
    public SmartImageView LLLF;
    public C20742216Eq LLLFF;
    public C19M4 LLLFFI;
    public View LLLFZ;
    public TuxIconView LLLI;
    public boolean LLLIIIIL;
    public final boolean LLJLLIL = C1191350h6j.LIZ();
    public long LLJLLL = System.currentTimeMillis();
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1767));
    public final ACListenerS153S0100000_18 LLLIIII = new ACListenerS153S0100000_18(this, 86);

    public interface PoiReviewCellVAbility extends InterfaceC494301wD {
        C1190230h4v G1();

        InterfaceC1191710h7J r0();
    }

    public final int I5() {
        InterfaceC1191710h7J interfaceC1191710h7J = this.LL;
        if (interfaceC1191710h7J != null) {
            interfaceC1191710h7J.wZ();
        }
        return getBindingAdapterPosition() + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList<com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData> P5() {
        /*
            r11 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJILLL
            r4 = 1
            r3 = 0
            if (r2 == 0) goto L39
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L39
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJILLL
            if (r2 == 0) goto L1b
            r2.getLocationOnScreen(r0)
        L1b:
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJILLL
            if (r2 == 0) goto L97
            int r6 = r2.getWidth()
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJILLL
            if (r2 == 0) goto L97
            int r7 = r2.getHeight()
            r8 = r0[r3]
            r9 = r0[r4]
            r10 = 240(0xf0, float:3.36E-43)
            com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData r5 = new com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData
            r5.<init>(r6, r7, r8, r9, r10)
            r1.add(r5)
        L39:
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJ
            if (r2 == 0) goto L68
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L68
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJ
            if (r2 == 0) goto L4a
            r2.getLocationOnScreen(r0)
        L4a:
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJ
            if (r2 == 0) goto L97
            int r6 = r2.getWidth()
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJ
            if (r2 == 0) goto L97
            int r7 = r2.getHeight()
            r8 = r0[r3]
            r9 = r0[r4]
            r10 = 240(0xf0, float:3.36E-43)
            com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData r5 = new com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData
            r5.<init>(r6, r7, r8, r9, r10)
            r1.add(r5)
        L68:
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJI
            if (r2 == 0) goto L97
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L97
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJI
            if (r2 == 0) goto L79
            r2.getLocationOnScreen(r0)
        L79:
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJI
            if (r2 == 0) goto L97
            int r5 = r2.getWidth()
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJI
            if (r2 == 0) goto L97
            int r6 = r2.getHeight()
            r7 = r0[r3]
            r8 = r0[r4]
            r9 = 240(0xf0, float:3.36E-43)
            com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData r4 = new com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData
            r4.<init>(r5, r6, r7, r8, r9)
            r1.add(r4)
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsFoldedReviewCell.P5():java.util.ArrayList");
    }

    public final PageFinder R5() {
        return (PageFinder) this.LLLII.getValue();
    }

    public final void U5() {
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC1191710h7J interfaceC1191710h7J = this.LL;
        String strXq1 = interfaceC1191710h7J != null ? interfaceC1191710h7J.Xq1() : null;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        C1185430gxB.LJJIJL(c1185430gxB, strXq1, "click", fragmentLJIIJ != null ? C1558360qeg.LJFF(fragmentLJIIJ, null) : null, "poi_secondary_reviews_page", "poi_review", PageFinder.via(C1189060h32.LJIIJ(this)));
    }

    public final void V5() {
        C1247510iZJ c1247510iZJ;
        C1247510iZJ c1247510iZJ2;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
        FragmentManager supportFragmentManager = c19egLIZIZ != null ? c19egLIZIZ.getSupportFragmentManager() : null;
        PoiReviewsApi.PoiReviewModel item = getItem();
        if (item == null) {
            return;
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        if (N5(item)) {
            C1247510iZJ[] c1247510iZJArr = new C1247510iZJ[2];
            if (item.getWantTranslate()) {
                c1247510iZJ2 = new C1247510iZJ();
                c1247510iZJ2.LIZIZ(R.string.suj);
                c1247510iZJ2.LIZ(new AwS384S0200000_18(item, this, 133));
            } else {
                c1247510iZJ2 = new C1247510iZJ();
                c1247510iZJ2.LIZIZ(2131850744);
                c1247510iZJ2.LIZ(new AwS384S0200000_18(item, this, 132));
            }
            c1247510iZJArr[0] = c1247510iZJ2;
            C1247510iZJ c1247510iZJ3 = new C1247510iZJ();
            c1247510iZJ3.LIZIZ(2131829536);
            c1247510iZJ3.LIZ(new AwS384S0200000_18(item, this, 134));
            c1247510iZJArr[1] = c1247510iZJ3;
            List listLJIILJJIL = C1697810uHb.LJIILJJIL(c1247510iZJArr);
            C1190230h4v c1190230h4v = this.LLILLJJLI;
            if (c1190230h4v != null && c1190230h4v.LIZ) {
                C1247510iZJ c1247510iZJ4 = new C1247510iZJ();
                c1247510iZJ4.LIZIZ(R.string.gm7);
                c1247510iZJ4.LIZJ = 1;
                c1247510iZJ4.LIZ(new AwS597S0100000_18(this, 457));
                listLJIILJJIL.add(c1247510iZJ4);
            }
            c1390850mIV.LJI(listLJIILJJIL);
        } else {
            if (item.getWantTranslate()) {
                c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZIZ(R.string.suj);
                c1247510iZJ.LIZ(new AwS384S0200000_18(item, this, 138));
            } else {
                c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZIZ(2131850744);
                c1247510iZJ.LIZ(new AwS384S0200000_18(item, this, 137));
            }
            C1247510iZJ c1247510iZJ5 = new C1247510iZJ();
            c1247510iZJ5.LIZIZ(2131836352);
            c1247510iZJ5.LIZ(new AwS384S0200000_18(item, this, 136));
            C1247510iZJ c1247510iZJ6 = new C1247510iZJ();
            c1247510iZJ6.LIZIZ(2131836352);
            c1247510iZJ6.LIZ(new AwS384S0200000_18(item, this, 135));
            if ((!C1190820h5s.LJFF(item) || C1190820h5s.LJIIIIZZ(item) || C1190820h5s.LJ(item)) && C848230XPh.LL.LJI()) {
                c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ5);
            } else if (C1190820h5s.LJII(item) && C848230XPh.LL.LJI() && C1191150h6P.LIZ()) {
                c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ6);
            } else {
                c1390850mIV.LIZIZ(c1247510iZJ);
            }
        }
        c1390850mIV.LIZLLL(R.string.f1_);
        if (supportFragmentManager != null) {
            c1390850mIV.LIZJ().show(supportFragmentManager, "PoiReviewMenuPanel");
        }
    }

    public final void W5() {
        String reviewId;
        String str;
        String poiId;
        InterfaceC1191710h7J interfaceC1191710h7J;
        PoiReviewsApi.PoiReviewStatusModel status;
        PoiReviewsApi.PoiReviewModel poiReviewModel;
        PoiReviewsApi.PoiReviewContentModel content;
        Integer source;
        PoiReviewsApi.PoiReviewUserModel author;
        PoiReviewsApi.PoiReviewContentModel content2;
        String str2;
        PoiReviewsApi.PoiReviewContentModel content3;
        List<PoiReviewsApi.ImageDataModel> list;
        PoiReviewsApi.PoiReviewStatisticsModel statistics;
        Long l;
        PoiReviewsApi.PoiReviewContentModel content4;
        PoiReviewsApi.PoiReviewContentModel content5;
        String strZZ1;
        PoiReviewsApi.PoiReviewUserModel author2;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        InterfaceC1191710h7J interfaceC1191710h7J2 = this.LL;
        String strLJJLIIIJJI = interfaceC1191710h7J2 != null ? interfaceC1191710h7J2.LJJLIIIJJI() : null;
        String str3 = "";
        if (strLJJLIIIJJI == null) {
            strLJJLIIIJJI = "";
        }
        PoiReviewsApi.PoiReviewModel item = getItem();
        if (item == null || (reviewId = item.getReviewId()) == null) {
            reviewId = "";
        }
        PoiReviewsApi.PoiReviewModel item2 = getItem();
        if (item2 == null || (author2 = item2.getAuthor()) == null || (str = author2.userId) == null) {
            str = "";
        }
        PoiReviewsApi.PoiReviewModel item3 = getItem();
        if (item3 == null || (poiId = item3.getPoiId()) == null) {
            poiId = "";
        }
        InterfaceC1191710h7J interfaceC1191710h7J3 = this.LL;
        if (interfaceC1191710h7J3 != null && (strZZ1 = interfaceC1191710h7J3.ZZ1()) != null) {
            str3 = strZZ1;
        }
        PoiReviewsApi.PoiReviewModel item4 = getItem();
        float fLIZIZ = C1175120ggY.LIZIZ((item4 == null || (content5 = item4.getContent()) == null) ? null : Float.valueOf(C1190820h5s.LIZLLL(content5)));
        PoiReviewsApi.PoiReviewModel item5 = getItem();
        boolean zLIZ = C123100dR.LIZ((item5 == null || (content4 = item5.getContent()) == null) ? null : content4.text);
        Integer numValueOf = Integer.valueOf(I5());
        PoiReviewsApi.PoiReviewModel item6 = getItem();
        int iLongValue = (item6 == null || (statistics = item6.getStatistics()) == null || (l = statistics.likeCount) == null) ? 0 : (int) l.longValue();
        PoiReviewsApi.PoiReviewModel item7 = getItem();
        int size = (item7 == null || (content3 = item7.getContent()) == null || (list = content3.images) == null) ? 0 : list.size();
        PoiReviewsApi.PoiReviewModel item8 = getItem();
        int length = (item8 == null || (content2 = item8.getContent()) == null || (str2 = content2.text) == null) ? 0 : str2.length();
        PoiReviewsApi.PoiReviewModel item9 = getItem();
        String str4 = (item9 == null || (author = item9.getAuthor()) == null) ? null : author.reviewUserSource;
        PoiReviewsApi.PoiReviewModel item10 = getItem();
        int value = (item10 == null || (source = item10.getSource()) == null) ? EnumC1190240h4w.PoiReviewSource_TikTok.getValue() : source.intValue();
        InterfaceC1191710h7J interfaceC1191710h7J4 = this.LL;
        String logId = interfaceC1191710h7J4 != null ? interfaceC1191710h7J4.getLogId() : null;
        PoiReviewsApi.PoiReviewModel item11 = getItem();
        String str5 = (item11 == null || (content = item11.getContent()) == null) ? null : content.textLang;
        PoiReviewsApi.PoiReviewModel item12 = getItem();
        boolean wantTranslate = item12 != null ? item12.getWantTranslate() : false;
        InterfaceC1191710h7J interfaceC1191710h7J5 = this.LL;
        String strYy = interfaceC1191710h7J5 != null ? interfaceC1191710h7J5.yy() : null;
        InterfaceC1191710h7J interfaceC1191710h7J6 = this.LL;
        String strO32 = interfaceC1191710h7J6 != null ? interfaceC1191710h7J6.o32() : null;
        PoiReviewsApi.PoiReviewModel item13 = getItem();
        int i = (item13 == null || !item13.isAnonymous()) ? 0 : 1;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = fragmentLJIIJ != null ? C1558360qeg.LJFF(fragmentLJIIJ, null) : null;
        int i2 = 1;
        if ((I5() != 1 || (poiReviewModel = this.LLJZ) == null || !N5(poiReviewModel)) && ((interfaceC1191710h7J = this.LL) == null || !interfaceC1191710h7J.x0())) {
            i2 = 0;
        }
        Integer numValueOf2 = Integer.valueOf(i2);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLJZ;
        Integer num = (poiReviewModel2 == null || (status = poiReviewModel2.getStatus()) == null) ? null : status.status;
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLJZ;
        String verifiedDisplay = poiReviewModel3 != null ? poiReviewModel3.getVerifiedDisplay() : null;
        PageFinder pageFinderR5 = R5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJIIJ(strLJJLIIIJJI, "review", reviewId, str, poiId, str3, fLIZIZ, zLIZ ? 1 : 0, numValueOf, iLongValue, size, length, str4, value, logId, str5, wantTranslate, strYy, strO32, "reviews_button", i, interfaceC665370Q7zLJFF, numValueOf2, num, verifiedDisplay, pageFinderR5);
        U5();
    }

    public final void X5() {
        String reviewId;
        String str;
        String poiId;
        PoiReviewsApi.PoiReviewContentModel content;
        Integer source;
        PoiReviewsApi.PoiReviewUserModel author;
        PoiReviewsApi.PoiReviewContentModel content2;
        String str2;
        PoiReviewsApi.PoiReviewContentModel content3;
        List<PoiReviewsApi.ImageDataModel> list;
        PoiReviewsApi.PoiReviewStatisticsModel statistics;
        Long l;
        PoiReviewsApi.PoiReviewContentModel content4;
        PoiReviewsApi.PoiReviewContentModel content5;
        String strZZ1;
        PoiReviewsApi.PoiReviewUserModel author2;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        InterfaceC1191710h7J interfaceC1191710h7J = this.LL;
        String strLJJLIIIJJI = interfaceC1191710h7J != null ? interfaceC1191710h7J.LJJLIIIJJI() : null;
        String str3 = "";
        if (strLJJLIIIJJI == null) {
            strLJJLIIIJJI = "";
        }
        PoiReviewsApi.PoiReviewModel item = getItem();
        if (item == null || (reviewId = item.getReviewId()) == null) {
            reviewId = "";
        }
        PoiReviewsApi.PoiReviewModel item2 = getItem();
        if (item2 == null || (author2 = item2.getAuthor()) == null || (str = author2.userId) == null) {
            str = "";
        }
        PoiReviewsApi.PoiReviewModel item3 = getItem();
        if (item3 == null || (poiId = item3.getPoiId()) == null) {
            poiId = "";
        }
        InterfaceC1191710h7J interfaceC1191710h7J2 = this.LL;
        if (interfaceC1191710h7J2 != null && (strZZ1 = interfaceC1191710h7J2.ZZ1()) != null) {
            str3 = strZZ1;
        }
        PoiReviewsApi.PoiReviewModel item4 = getItem();
        float fLIZIZ = C1175120ggY.LIZIZ((item4 == null || (content5 = item4.getContent()) == null) ? null : Float.valueOf(C1190820h5s.LIZLLL(content5)));
        PoiReviewsApi.PoiReviewModel item5 = getItem();
        boolean zLIZ = C123100dR.LIZ((item5 == null || (content4 = item5.getContent()) == null) ? null : content4.text);
        int iI5 = I5();
        PoiReviewsApi.PoiReviewModel item6 = getItem();
        int iLongValue = (item6 == null || (statistics = item6.getStatistics()) == null || (l = statistics.likeCount) == null) ? 0 : (int) l.longValue();
        PoiReviewsApi.PoiReviewModel item7 = getItem();
        int size = (item7 == null || (content3 = item7.getContent()) == null || (list = content3.images) == null) ? 0 : list.size();
        PoiReviewsApi.PoiReviewModel item8 = getItem();
        int length = (item8 == null || (content2 = item8.getContent()) == null || (str2 = content2.text) == null) ? 0 : str2.length();
        PoiReviewsApi.PoiReviewModel item9 = getItem();
        String str4 = (item9 == null || (author = item9.getAuthor()) == null) ? null : author.reviewUserSource;
        PoiReviewsApi.PoiReviewModel item10 = getItem();
        int value = (item10 == null || (source = item10.getSource()) == null) ? EnumC1190240h4w.PoiReviewSource_TikTok.getValue() : source.intValue();
        InterfaceC1191710h7J interfaceC1191710h7J3 = this.LL;
        String logId = interfaceC1191710h7J3 != null ? interfaceC1191710h7J3.getLogId() : null;
        PoiReviewsApi.PoiReviewModel item11 = getItem();
        String str5 = (item11 == null || (content = item11.getContent()) == null) ? null : content.textLang;
        PoiReviewsApi.PoiReviewModel item12 = getItem();
        boolean wantTranslate = item12 != null ? item12.getWantTranslate() : false;
        InterfaceC1191710h7J interfaceC1191710h7J4 = this.LL;
        String strYy = interfaceC1191710h7J4 != null ? interfaceC1191710h7J4.yy() : null;
        InterfaceC1191710h7J interfaceC1191710h7J5 = this.LL;
        String strO32 = interfaceC1191710h7J5 != null ? interfaceC1191710h7J5.o32() : null;
        PoiReviewsApi.PoiReviewModel item13 = getItem();
        int i = (item13 == null || !item13.isAnonymous()) ? 0 : 1;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = fragmentLJIIJ != null ? C1558360qeg.LJFF(fragmentLJIIJ, null) : null;
        PoiReviewsApi.PoiReviewModel item14 = getItem();
        String verifiedDisplay = item14 != null ? item14.getVerifiedDisplay() : null;
        PageFinder pageFinderR5 = R5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJII(strLJJLIIIJJI, reviewId, str, poiId, str3, fLIZIZ, zLIZ ? 1 : 0, iI5, iLongValue, size, length, str4, value, logId, str5, wantTranslate, strYy, strO32, i, interfaceC665370Q7zLJFF, verifiedDisplay, pageFinderR5);
    }

    public final void c6() {
        C1397580mTM c1397580mTM = new C1397580mTM(this.itemView.getContext());
        c1397580mTM.LIZIZ(this.itemView.getContext().getResources().getString(2131844853));
        C985403tE.LIZ(c1397580mTM, new AwS597S0100000_18(this, 748));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        SmartImageView smartImageView;
        SmartImageView smartImageView2;
        SmartImageView smartImageView3;
        C19ME c19me;
        C19ME c19me2;
        TuxIconView tuxIconView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C19ME c19me3;
        C19ME c19me4;
        C19ME c19me5;
        C19ME c19me6;
        ViewGroup.LayoutParams layoutParams;
        PoiReviewCellVAbility poiReviewCellVAbility;
        super.onItemViewCreated();
        this.LLILLL = (C427660Gpo) this.itemView.findViewById(R.id.bh2);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.p09);
        this.LLILZIL = this.itemView.findViewById(R.id.srh);
        this.LLILZLL = (C1203280hPy) this.itemView.findViewById(R.id.srg);
        this.LLIZ = (C418460Gay) this.itemView.findViewById(R.id.yky);
        this.LLIZLLLIL = (C1202300hOO) this.itemView.findViewById(R.id.text);
        this.LLJ = (TuxTextView) this.itemView.findViewById(R.id.yil);
        this.LLJIJIL = this.itemView.findViewById(R.id.ujd);
        this.LLJI = (TuxIconView) this.itemView.findViewById(R.id.k4x);
        this.LLJILJIL = (ViewGroup) this.itemView.findViewById(R.id.kc4);
        this.LLJILJILJ = (ViewGroup) this.itemView.findViewById(R.id.tgq);
        this.LLJJJJ = (TuxTextView) this.itemView.findViewById(R.id.ffv);
        this.LLJLILLLLZIIL = (SmartImageView) this.itemView.findViewById(R.id.bpv);
        this.LLJJJ = this.itemView.findViewById(R.id.mnd);
        this.LLJJIJIIJIL = (TuxIconView) this.itemView.findViewById(R.id.mnv);
        this.LLJJIJIL = (TuxTextView) this.itemView.findViewById(R.id.mnh);
        this.LLJJJIL = this.itemView.findViewById(R.id.cpg);
        this.LLJJJJJIL = (TuxTextView) this.itemView.findViewById(R.id.g39);
        this.LLJJJJLIIL = (TuxTextView) this.itemView.findViewById(R.id.f707g3a);
        this.LLJJL = (TuxTextView) this.itemView.findViewById(R.id.g3b);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) this.itemView.findViewById(R.id.verified_display);
        this.LLJL = (C1189590h3t) this.itemView.findViewById(R.id.cik);
        this.LLJZIJLIL = this.itemView.findViewById(R.id.thg);
        this.LLL = (TextView) this.itemView.findViewById(R.id.mm_);
        this.LLLF = (SmartImageView) this.itemView.findViewById(R.id.mm8);
        this.LLLFF = (C20742216Eq) this.itemView.findViewById(R.id.jeq);
        this.LLJLIL = (ConstraintLayout) this.itemView.findViewById(R.id.m6p);
        this.LLLFFI = (C19M4) this.itemView.findViewById(R.id.ths);
        this.LLLFZ = this.itemView.findViewById(R.id.tht);
        this.LLLI = (TuxIconView) this.itemView.findViewById(R.id.cpi);
        C427690Gpr.LJ(this.itemView, 0.0f);
        this.LLILLJJLI = new C1190230h4v(true);
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null && (poiReviewCellVAbility = (PoiReviewCellVAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiReviewCellVAbility.class, null)) != null) {
            this.LL = poiReviewCellVAbility.r0();
            this.LLILLJJLI = poiReviewCellVAbility.G1();
        }
        this.LLJLL = C297470BlJ.LIZ() ? C814420VxA.LIZIZ((((C0FV2.LIZIZ(getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) / 3.0f) : C814420VxA.LIZIZ(((C0FV2.LIZIZ(getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2)) / 3.0f);
        ViewGroup viewGroup = this.LLJILJIL;
        if (viewGroup != null) {
            smartImageView = (SmartImageView) viewGroup.findViewById(R.id.tgn);
            if (smartImageView != null) {
                int i = this.LLJLL;
                C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams(i, i));
            }
        } else {
            smartImageView = null;
        }
        this.LLJILLL = smartImageView;
        ViewGroup viewGroup2 = this.LLJILJIL;
        if (viewGroup2 != null) {
            smartImageView2 = (SmartImageView) viewGroup2.findViewById(R.id.tgo);
            if (smartImageView2 != null) {
                int i2 = this.LLJLL;
                C786410Ut5.G6(smartImageView2, new LinearLayout.LayoutParams(i2, i2));
            }
        } else {
            smartImageView2 = null;
        }
        this.LLJJ = smartImageView2;
        ViewGroup viewGroup3 = this.LLJILJIL;
        if (viewGroup3 != null) {
            smartImageView3 = (SmartImageView) viewGroup3.findViewById(R.id.tgp);
            if (smartImageView3 != null) {
                int i3 = this.LLJLL;
                C786410Ut5.G6(smartImageView3, new LinearLayout.LayoutParams(i3, i3));
            }
        } else {
            smartImageView3 = null;
        }
        this.LLJJI = smartImageView3;
        SmartImageView smartImageView4 = this.LLJILLL;
        if (smartImageView4 != null) {
            C786410Ut5.Q8(smartImageView4, this.LLLIIII);
        }
        SmartImageView smartImageView5 = this.LLJJ;
        if (smartImageView5 != null) {
            C786410Ut5.Q8(smartImageView5, this.LLLIIII);
        }
        SmartImageView smartImageView6 = this.LLJJI;
        if (smartImageView6 != null) {
            C786410Ut5.Q8(smartImageView6, this.LLLIIII);
        }
        SmartImageView smartImageView7 = this.LLJILLL;
        if (smartImageView7 != null) {
            smartImageView7.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 8));
        }
        SmartImageView smartImageView8 = this.LLJJ;
        if (smartImageView8 != null) {
            smartImageView8.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 9));
        }
        SmartImageView smartImageView9 = this.LLJJI;
        if (smartImageView9 != null) {
            smartImageView9.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 10));
        }
        this.LLJJIII = this.itemView.findViewById(R.id.olm);
        this.LLJJIJI = (TuxTextView) this.itemView.findViewById(R.id.oll);
        View view = this.LLJJIII;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 87), view);
        }
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setText(2131846662);
        }
        if (C297470BlJ.LIZ()) {
            C427660Gpo c427660Gpo = this.LLILLL;
            if (c427660Gpo != null && (layoutParams = c427660Gpo.getLayoutParams()) != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            }
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setTuxFont(72);
            }
            TuxTextView tuxTextView3 = this.LLILZ;
            if (tuxTextView3 != null) {
                tuxTextView3.setTextColorRes(R.attr.a1j);
            }
            View view2 = this.LLJZIJLIL;
            if (view2 != null) {
                C1189060h32.LJJII(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 0, 0, 0);
            }
            SmartImageView smartImageView10 = this.LLLF;
            if (smartImageView10 != null) {
                ViewGroup.LayoutParams layoutParams2 = smartImageView10.getLayoutParams();
                if ((layoutParams2 instanceof C19ME) && (c19me6 = (C19ME) layoutParams2) != null) {
                    ((ViewGroup.MarginLayoutParams) c19me6).width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    ((ViewGroup.MarginLayoutParams) c19me6).height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    c19me6.topToTop = R.id.mm_;
                    c19me6.bottomToBottom = R.id.mm_;
                    C786410Ut5.G6(smartImageView10, c19me6);
                }
            }
            C20742216Eq c20742216Eq = this.LLLFF;
            if (c20742216Eq != null) {
                c20742216Eq.setGuidelineBegin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)));
            }
            TextView textView = this.LLL;
            if (textView != null) {
                textView.setTextSize(10.0f);
            }
            View view3 = this.LLILZIL;
            if (view3 != null) {
                C1189060h32.LJJII(view3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0);
            }
            C1202300hOO c1202300hOO = this.LLIZLLLIL;
            if (c1202300hOO != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, this.itemView.getContext());
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    c1202300hOO.setExpandActionColor(iIntValue);
                    c1202300hOO.setCollapseActionColor(iIntValue);
                    c1202300hOO.setExpandActionSize(41);
                    c1202300hOO.setCollapseActionSize(41);
                }
                ViewGroup.LayoutParams layoutParams3 = c1202300hOO.getLayoutParams();
                if ((layoutParams3 instanceof C19ME) && (c19me5 = (C19ME) layoutParams3) != null) {
                    ((ViewGroup.MarginLayoutParams) c19me5).width = 0;
                    c19me5.startToStart = R.id.p09;
                    ((ViewGroup.MarginLayoutParams) c19me5).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    C786410Ut5.k7(c1202300hOO, c19me5);
                }
            }
            View view4 = this.LLJIJIL;
            if (view4 != null) {
                ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                if ((layoutParams4 instanceof C19ME) && (c19me4 = (C19ME) layoutParams4) != null) {
                    ((ViewGroup.MarginLayoutParams) c19me4).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    c19me4.startToStart = R.id.p09;
                    C786410Ut5.W5(view4, c19me4);
                }
            }
            ViewGroup viewGroup4 = this.LLJILJIL;
            if (viewGroup4 != null) {
                ViewGroup.LayoutParams layoutParams5 = viewGroup4.getLayoutParams();
                if ((layoutParams5 instanceof C19ME) && (c19me3 = (C19ME) layoutParams5) != null) {
                    ((ViewGroup.MarginLayoutParams) c19me3).width = 0;
                    ((ViewGroup.MarginLayoutParams) c19me3).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    c19me3.startToStart = R.id.p09;
                    c19me3.endToEnd = 0;
                    C786410Ut5.X5(c19me3, viewGroup4);
                }
            }
            ViewGroup viewGroup5 = this.LLJILJILJ;
            if (viewGroup5 != null) {
                viewGroup5.setPadding(0, 0, 0, 0);
            }
            SmartImageView smartImageView11 = this.LLJILLL;
            if (smartImageView11 != null) {
                C1378990lzN.LIZIZ(smartImageView11, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
            }
            SmartImageView smartImageView12 = this.LLJJ;
            if (smartImageView12 != null) {
                C1378990lzN.LIZIZ(smartImageView12, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
            }
            SmartImageView smartImageView13 = this.LLJJI;
            if (smartImageView13 != null) {
                C1378990lzN.LIZIZ(smartImageView13, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
            }
            View view5 = this.LLJJIII;
            if (view5 != null) {
                ViewGroup.LayoutParams layoutParams6 = view5.getLayoutParams();
                if ((layoutParams6 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                    marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    C786410Ut5.W5(view5, marginLayoutParams);
                }
            }
            TuxTextView tuxTextView4 = this.LLJJIJI;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextColorRes(R.attr.zi);
                tuxTextView4.setTuxFont(82);
            }
            View view6 = this.LLJJJIL;
            if (view6 != null) {
                if ((view6 instanceof TuxIconView) && (tuxIconView = (TuxIconView) view6) != null) {
                    tuxIconView.setTintColorRes(R.attr.a1j);
                }
                ViewGroup.LayoutParams layoutParams7 = view6.getLayoutParams();
                if ((layoutParams7 instanceof C19ME) && (c19me2 = (C19ME) layoutParams7) != null) {
                    c19me2.startToStart = R.id.p09;
                    C786410Ut5.W5(view6, c19me2);
                }
            }
            View view7 = this.LLJJJ;
            if (view7 != null) {
                C1189060h32.LJJII(view7, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, 0);
            }
            TuxIconView tuxIconView2 = this.LLJJIJIIJIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColorRes(R.attr.a1j);
            }
            View view8 = this.LLLFZ;
            if (view8 != null) {
                C1189060h32.LJJII(view8, 0, 0, 0, 0);
                ViewGroup.LayoutParams layoutParams8 = view8.getLayoutParams();
                if ((layoutParams8 instanceof C19ME) && (c19me = (C19ME) layoutParams8) != null) {
                    c19me.startToStart = R.id.p09;
                    c19me.endToStart = R.id.cpg;
                    C786410Ut5.W5(view8, c19me);
                }
            }
        }
        View view9 = this.itemView;
        view9.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 23));
        C786410Ut5.I7(new AkS57S0200000_18(this, view9, 21), view9);
        C19M4 c19m4 = this.LLLFFI;
        if (c19m4 != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 54), c19m4);
        }
        View view10 = this.LLJJJ;
        if (view10 != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 55), view10);
        }
        View view11 = this.LLJIJIL;
        if (view11 != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 57), view11);
        }
        View view12 = this.LLJZIJLIL;
        if (view12 != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 56), view12);
        }
        C1202300hOO c1202300hOO2 = this.LLIZLLLIL;
        if (c1202300hOO2 != null) {
            C786410Ut5.I7(new AkS57S0200000_18(this, c1202300hOO2, 22), c1202300hOO2);
            c1202300hOO2.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 24));
        }
        C1202300hOO c1202300hOO3 = this.LLIZLLLIL;
        if (c1202300hOO3 != null && C1209504oH.LIZ()) {
            c1202300hOO3.setLineSpacing(C418440Gaw.LIZIZ(4), 1.0f);
        }
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 456));
        C19M4 c19m42 = this.LLLFFI;
        if (c19m42 != null) {
            C2211631BhB.LJ(c19m42, new AwS597S0100000_18(this, 455));
        }
    }

    public final void L5(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        List<PoiReviewsApi.ImageDataModel> list;
        C19ME c19me;
        C19ME c19me2;
        C19ME c19me3;
        C19ME c19me4;
        C19ME c19me5;
        C19ME c19me6;
        if (C297470BlJ.LIZ()) {
            if (getBindingAdapterPosition() == 0) {
                this.itemView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            } else {
                this.itemView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            }
            String str = null;
            if (poiReviewModel.getHasFoldedReviews()) {
                View view = this.LLJJJ;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof C19ME) && (c19me6 = (C19ME) layoutParams) != null) {
                        c19me6.topToTop = -1;
                        c19me6.topToBottom = R.id.kc4;
                        c19me6.endToEnd = 0;
                        ((ViewGroup.MarginLayoutParams) c19me6).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        C786410Ut5.W5(view, c19me6);
                    }
                }
                View view2 = this.LLJJJIL;
                if (view2 != null) {
                    C1189060h32.LJJII(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), 0);
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if ((layoutParams2 instanceof C19ME) && (c19me5 = (C19ME) layoutParams2) != null) {
                        c19me5.startToStart = -1;
                        c19me5.startToEnd = R.id.tht;
                        c19me5.endToStart = R.id.mnd;
                        C786410Ut5.W5(view2, c19me5);
                        return;
                    }
                    return;
                }
                return;
            }
            PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
            if (content != null) {
                list = content.images;
            } else {
                list = null;
            }
            if ((list == null || poiReviewModel.getContent().images.isEmpty()) && C1EDK.LIZIZ()) {
                PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModel.getContent();
                if (content2 != null) {
                    str = content2.translatedContent;
                }
                if (C123100dR.LIZ(str)) {
                    View view3 = this.LLJJJ;
                    if (view3 != null) {
                        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                        if ((layoutParams3 instanceof C19ME) && (c19me2 = (C19ME) layoutParams3) != null) {
                            c19me2.topToTop = R.id.ujd;
                            c19me2.topToBottom = -1;
                            c19me2.endToEnd = 0;
                            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = 0;
                            C786410Ut5.W5(view3, c19me2);
                        }
                    }
                    View view4 = this.LLJJJIL;
                    if (view4 == null) {
                        return;
                    }
                    C1189060h32.LJJII(view4, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), 0);
                    ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                    if (!(layoutParams4 instanceof C19ME) || (c19me = (C19ME) layoutParams4) == null) {
                        return;
                    }
                    c19me.startToStart = -1;
                    c19me.startToEnd = -1;
                    c19me.endToStart = R.id.mnd;
                    C786410Ut5.W5(view4, c19me);
                    return;
                }
            }
            View view5 = this.LLJJJ;
            if (view5 != null) {
                ViewGroup.LayoutParams layoutParams5 = view5.getLayoutParams();
                if ((layoutParams5 instanceof C19ME) && (c19me4 = (C19ME) layoutParams5) != null) {
                    c19me4.topToTop = -1;
                    c19me4.topToBottom = R.id.kc4;
                    c19me4.endToEnd = 0;
                    ((ViewGroup.MarginLayoutParams) c19me4).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    C786410Ut5.W5(view5, c19me4);
                }
            }
            View view6 = this.LLJJJIL;
            if (view6 == null) {
                return;
            }
            C1189060h32.LJJII(view6, 0, 0, 0, 0);
            ViewGroup.LayoutParams layoutParams6 = view6.getLayoutParams();
            if (!(layoutParams6 instanceof C19ME) || (c19me3 = (C19ME) layoutParams6) == null) {
                return;
            }
            c19me3.startToStart = R.id.p09;
            c19me3.startToEnd = -1;
            c19me3.endToStart = -1;
            C786410Ut5.W5(view6, c19me3);
        }
    }

    public final boolean N5(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        String str;
        PoiReviewsApi.PoiReviewUserModel author = poiReviewModel.getAuthor();
        if (author != null) {
            str = author.userId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, C0XQ7.LJFF().getCurUserId())) {
            if (!C1190820h5s.LJFF(poiReviewModel) || C1190820h5s.LJII(poiReviewModel)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a6(boolean z) {
        String strLJJLIIIJJI;
        String reviewId;
        String str;
        String poiId;
        Float fValueOf;
        String str2;
        int iLongValue;
        int size;
        int length;
        String str3;
        int value;
        String logId;
        String str4;
        String strYy;
        String strO32;
        int i;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        InterfaceC1191710h7J interfaceC1191710h7J;
        Integer num;
        PoiReviewsApi.PoiReviewStatusModel status;
        PoiReviewsApi.PoiReviewModel poiReviewModel;
        PoiReviewsApi.PoiReviewContentModel content;
        Integer source;
        PoiReviewsApi.PoiReviewUserModel author;
        PoiReviewsApi.PoiReviewContentModel content2;
        String str5;
        PoiReviewsApi.PoiReviewContentModel content3;
        List<PoiReviewsApi.ImageDataModel> list;
        PoiReviewsApi.PoiReviewStatisticsModel statistics;
        Long l;
        PoiReviewsApi.PoiReviewContentModel content4;
        PoiReviewsApi.PoiReviewContentModel content5;
        String strZZ1;
        PoiReviewsApi.PoiReviewUserModel author2;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        InterfaceC1191710h7J interfaceC1191710h7J2 = this.LL;
        String verifiedDisplay = null;
        if (interfaceC1191710h7J2 != null) {
            strLJJLIIIJJI = interfaceC1191710h7J2.LJJLIIIJJI();
        } else {
            strLJJLIIIJJI = null;
        }
        String str6 = "";
        if (strLJJLIIIJJI == null) {
            strLJJLIIIJJI = "";
        }
        PoiReviewsApi.PoiReviewModel item = getItem();
        if (item == null || (reviewId = item.getReviewId()) == null) {
            reviewId = "";
        }
        PoiReviewsApi.PoiReviewModel item2 = getItem();
        if (item2 == null || (author2 = item2.getAuthor()) == null || (str = author2.userId) == null) {
            str = "";
        }
        PoiReviewsApi.PoiReviewModel item3 = getItem();
        if (item3 == null || (poiId = item3.getPoiId()) == null) {
            poiId = "";
        }
        InterfaceC1191710h7J interfaceC1191710h7J3 = this.LL;
        if (interfaceC1191710h7J3 != null && (strZZ1 = interfaceC1191710h7J3.ZZ1()) != null) {
            str6 = strZZ1;
        }
        PoiReviewsApi.PoiReviewModel item4 = getItem();
        if (item4 != null && (content5 = item4.getContent()) != null) {
            fValueOf = Float.valueOf(C1190820h5s.LIZLLL(content5));
        } else {
            fValueOf = null;
        }
        float fLIZIZ = C1175120ggY.LIZIZ(fValueOf);
        PoiReviewsApi.PoiReviewModel item5 = getItem();
        if (item5 != null && (content4 = item5.getContent()) != null) {
            str2 = content4.text;
        } else {
            str2 = null;
        }
        boolean zLIZ = C123100dR.LIZ(str2);
        int iI5 = I5();
        PoiReviewsApi.PoiReviewModel item6 = getItem();
        int i2 = 0;
        if (item6 != null && (statistics = item6.getStatistics()) != null && (l = statistics.likeCount) != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = 0;
        }
        PoiReviewsApi.PoiReviewModel item7 = getItem();
        if (item7 != null && (content3 = item7.getContent()) != null && (list = content3.images) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        PoiReviewsApi.PoiReviewModel item8 = getItem();
        if (item8 != null && (content2 = item8.getContent()) != null && (str5 = content2.text) != null) {
            length = str5.length();
        } else {
            length = 0;
        }
        PoiReviewsApi.PoiReviewModel item9 = getItem();
        if (item9 != null && (author = item9.getAuthor()) != null) {
            str3 = author.reviewUserSource;
        } else {
            str3 = null;
        }
        PoiReviewsApi.PoiReviewModel item10 = getItem();
        if (item10 != null && (source = item10.getSource()) != null) {
            value = source.intValue();
        } else {
            value = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
        }
        InterfaceC1191710h7J interfaceC1191710h7J4 = this.LL;
        if (interfaceC1191710h7J4 != null) {
            logId = interfaceC1191710h7J4.getLogId();
        } else {
            logId = null;
        }
        PoiReviewsApi.PoiReviewModel item11 = getItem();
        if (item11 != null && (content = item11.getContent()) != null) {
            str4 = content.textLang;
        } else {
            str4 = null;
        }
        InterfaceC1191710h7J interfaceC1191710h7J5 = this.LL;
        if (interfaceC1191710h7J5 != null) {
            strYy = interfaceC1191710h7J5.yy();
        } else {
            strYy = null;
        }
        InterfaceC1191710h7J interfaceC1191710h7J6 = this.LL;
        if (interfaceC1191710h7J6 != null) {
            strO32 = interfaceC1191710h7J6.o32();
        } else {
            strO32 = null;
        }
        PoiReviewsApi.PoiReviewModel item12 = getItem();
        if (item12 != null && item12.isAnonymous()) {
            i = 1;
        } else {
            i = 0;
        }
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
        } else {
            interfaceC665370Q7zLJFF = null;
        }
        if ((I5() == 1 && (poiReviewModel = this.LLJZ) != null && N5(poiReviewModel)) || ((interfaceC1191710h7J = this.LL) != null && interfaceC1191710h7J.x0())) {
            i2 = 1;
        }
        Integer numValueOf = Integer.valueOf(i2);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLJZ;
        if (poiReviewModel2 != null && (status = poiReviewModel2.getStatus()) != null) {
            num = status.status;
        } else {
            num = null;
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLJZ;
        if (poiReviewModel3 != null) {
            verifiedDisplay = poiReviewModel3.getVerifiedDisplay();
        }
        PageFinder pageFinderR5 = R5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJIILJJIL(fLIZIZ, zLIZ ? 1 : 0, iI5, iLongValue, size, length, value, i, pageFinderR5, interfaceC665370Q7zLJFF, numValueOf, num, strLJJLIIIJJI, reviewId, str, poiId, str6, str3, logId, str4, strYy, strO32, verifiedDisplay, z);
        U5();
    }

    public final void b6(boolean z) {
        String strLJJLIIIJJI;
        String reviewId;
        String str;
        String poiId;
        Float fValueOf;
        String str2;
        int iLongValue;
        int size;
        int length;
        String str3;
        String logId;
        String str4;
        int value;
        String strYy;
        String strO32;
        int i;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        InterfaceC1191710h7J interfaceC1191710h7J;
        Integer num;
        PoiReviewsApi.PoiReviewStatusModel status;
        PoiReviewsApi.PoiReviewModel poiReviewModel;
        Integer source;
        PoiReviewsApi.PoiReviewContentModel content;
        PoiReviewsApi.PoiReviewUserModel author;
        PoiReviewsApi.PoiReviewContentModel content2;
        String str5;
        PoiReviewsApi.PoiReviewContentModel content3;
        List<PoiReviewsApi.ImageDataModel> list;
        PoiReviewsApi.PoiReviewStatisticsModel statistics;
        Long l;
        PoiReviewsApi.PoiReviewContentModel content4;
        PoiReviewsApi.PoiReviewContentModel content5;
        String strZZ1;
        PoiReviewsApi.PoiReviewUserModel author2;
        U5();
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        InterfaceC1191710h7J interfaceC1191710h7J2 = this.LL;
        String verifiedDisplay = null;
        if (interfaceC1191710h7J2 != null) {
            strLJJLIIIJJI = interfaceC1191710h7J2.LJJLIIIJJI();
        } else {
            strLJJLIIIJJI = null;
        }
        String str6 = "";
        if (strLJJLIIIJJI == null) {
            strLJJLIIIJJI = "";
        }
        PoiReviewsApi.PoiReviewModel item = getItem();
        if (item == null || (reviewId = item.getReviewId()) == null) {
            reviewId = "";
        }
        PoiReviewsApi.PoiReviewModel item2 = getItem();
        if (item2 == null || (author2 = item2.getAuthor()) == null || (str = author2.userId) == null) {
            str = "";
        }
        PoiReviewsApi.PoiReviewModel item3 = getItem();
        if (item3 == null || (poiId = item3.getPoiId()) == null) {
            poiId = "";
        }
        InterfaceC1191710h7J interfaceC1191710h7J3 = this.LL;
        if (interfaceC1191710h7J3 != null && (strZZ1 = interfaceC1191710h7J3.ZZ1()) != null) {
            str6 = strZZ1;
        }
        PoiReviewsApi.PoiReviewModel item4 = getItem();
        if (item4 != null && (content5 = item4.getContent()) != null) {
            fValueOf = Float.valueOf(C1190820h5s.LIZLLL(content5));
        } else {
            fValueOf = null;
        }
        float fLIZIZ = C1175120ggY.LIZIZ(fValueOf);
        PoiReviewsApi.PoiReviewModel item5 = getItem();
        if (item5 != null && (content4 = item5.getContent()) != null) {
            str2 = content4.text;
        } else {
            str2 = null;
        }
        boolean zLIZ = C123100dR.LIZ(str2);
        int iI5 = I5();
        PoiReviewsApi.PoiReviewModel item6 = getItem();
        int i2 = 0;
        if (item6 != null && (statistics = item6.getStatistics()) != null && (l = statistics.likeCount) != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = 0;
        }
        PoiReviewsApi.PoiReviewModel item7 = getItem();
        if (item7 != null && (content3 = item7.getContent()) != null && (list = content3.images) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        PoiReviewsApi.PoiReviewModel item8 = getItem();
        if (item8 != null && (content2 = item8.getContent()) != null && (str5 = content2.text) != null) {
            length = str5.length();
        } else {
            length = 0;
        }
        PoiReviewsApi.PoiReviewModel item9 = getItem();
        if (item9 != null && (author = item9.getAuthor()) != null) {
            str3 = author.reviewUserSource;
        } else {
            str3 = null;
        }
        InterfaceC1191710h7J interfaceC1191710h7J4 = this.LL;
        if (interfaceC1191710h7J4 != null) {
            logId = interfaceC1191710h7J4.getLogId();
        } else {
            logId = null;
        }
        PoiReviewsApi.PoiReviewModel item10 = getItem();
        if (item10 != null && (content = item10.getContent()) != null) {
            str4 = content.textLang;
        } else {
            str4 = null;
        }
        PoiReviewsApi.PoiReviewModel item11 = getItem();
        if (item11 != null && (source = item11.getSource()) != null) {
            value = source.intValue();
        } else {
            value = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
        }
        InterfaceC1191710h7J interfaceC1191710h7J5 = this.LL;
        if (interfaceC1191710h7J5 != null) {
            strYy = interfaceC1191710h7J5.yy();
        } else {
            strYy = null;
        }
        InterfaceC1191710h7J interfaceC1191710h7J6 = this.LL;
        if (interfaceC1191710h7J6 != null) {
            strO32 = interfaceC1191710h7J6.o32();
        } else {
            strO32 = null;
        }
        PoiReviewsApi.PoiReviewModel item12 = getItem();
        if (item12 != null && item12.isAnonymous()) {
            i = 1;
        } else {
            i = 0;
        }
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
        } else {
            interfaceC665370Q7zLJFF = null;
        }
        if ((I5() == 1 && (poiReviewModel = this.LLJZ) != null && N5(poiReviewModel)) || ((interfaceC1191710h7J = this.LL) != null && interfaceC1191710h7J.x0())) {
            i2 = 1;
        }
        Integer numValueOf = Integer.valueOf(i2);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLJZ;
        if (poiReviewModel2 != null && (status = poiReviewModel2.getStatus()) != null) {
            num = status.status;
        } else {
            num = null;
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLJZ;
        if (poiReviewModel3 != null) {
            verifiedDisplay = poiReviewModel3.getVerifiedDisplay();
        }
        PageFinder pageFinderR5 = R5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJIILIIL(fLIZIZ, zLIZ ? 1 : 0, iI5, iLongValue, size, length, value, i, pageFinderR5, interfaceC665370Q7zLJFF, numValueOf, num, strLJJLIIIJJI, reviewId, str, poiId, str6, str3, logId, str4, strYy, strO32, verifiedDisplay, z);
    }

    public final void d6(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        Long l;
        TuxTextView tuxTextView;
        int i;
        Integer numValueOf;
        TuxTextView tuxTextView2;
        int i2;
        Long l2;
        int i3;
        Long l3;
        if (C1191340h6i.LIZ()) {
            View view = this.LLJJJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = this.LLJJJIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        if (C1191340h6i.LIZIZ()) {
            if (poiReviewModel.getScene() == EnumC1189990h4X.REVIEW_LANDING_PAGE) {
                ConstraintLayout constraintLayout = this.LLJLIL;
                if (constraintLayout != null) {
                    constraintLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                }
                C1202300hOO c1202300hOO = this.LLIZLLLIL;
                if (c1202300hOO != null) {
                    C1189060h32.LJJII(c1202300hOO, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, 0);
                }
                ViewGroup viewGroup = this.LLJILJIL;
                if (viewGroup != null) {
                    C1189060h32.LJJII(viewGroup, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, 0);
                }
            }
            View view3 = this.LLJJJ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
        }
        long jLongValue = 0;
        if (!this.LLJLLIL) {
            TuxTextView tuxTextView3 = this.LLJJIJIL;
            if (tuxTextView3 != null) {
                PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModel.getStatistics();
                if (statistics != null && (l3 = statistics.likeCount) != null && l3.longValue() > 0) {
                    i3 = 0;
                } else {
                    i3 = 4;
                }
                C786410Ut5.LLLLZLL(tuxTextView3, i3);
            }
            TuxTextView tuxTextView4 = this.LLJJIJIL;
            if (tuxTextView4 != null) {
                PoiReviewsApi.PoiReviewStatisticsModel statistics2 = poiReviewModel.getStatistics();
                if (statistics2 != null && (l2 = statistics2.likeCount) != null) {
                    jLongValue = l2.longValue();
                }
                tuxTextView4.setText(C1843500y4a.LIZIZ(jLongValue));
            }
        } else {
            TuxTextView tuxTextView5 = this.LLJJIJIL;
            if (tuxTextView5 != null) {
                C786410Ut5.LLLLZLL(tuxTextView5, 0);
            }
            PoiReviewsApi.PoiReviewStatisticsModel statistics3 = poiReviewModel.getStatistics();
            if (statistics3 != null) {
                l = statistics3.likeCount;
            } else {
                l = null;
            }
            if (l != null && poiReviewModel.getStatistics().likeCount.longValue() > 0) {
                String strLIZIZ = C1843500y4a.LIZIZ(poiReviewModel.getStatistics().likeCount.longValue());
                String string = this.itemView.getContext().getString(2131835492);
                if (C1191340h6i.LIZIZ()) {
                    TuxTextView tuxTextView6 = this.LLJJIJIL;
                    if (tuxTextView6 != null) {
                        tuxTextView6.setText(strLIZIZ);
                    }
                } else {
                    TuxTextView tuxTextView7 = this.LLJJIJIL;
                    if (tuxTextView7 != null) {
                        tuxTextView7.setText(C786410Ut5.j4("%s %s", Arrays.copyOf(new Object[]{string, strLIZIZ}, 2)));
                    }
                }
            } else {
                TuxTextView tuxTextView8 = this.LLJJIJIL;
                if (tuxTextView8 != null) {
                    tuxTextView8.setText(this.itemView.getContext().getString(2131835492));
                }
            }
        }
        PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
        if (userStatus != null && Intrinsics.LJFF(userStatus.liked, Boolean.TRUE)) {
            TuxTextView tuxTextView9 = this.LLJJIJIL;
            if (tuxTextView9 != null) {
                tuxTextView9.setTextColorRes(R.attr.a04);
            }
            TuxIconView tuxIconView = this.LLJJIJIIJIL;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                if (this.LLJLLIL) {
                    i2 = R.raw.icon_thumbs_up_fill;
                } else {
                    i2 = R.raw.icon_heart_fill;
                }
                c419910GdJ.LIZ = i2;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            if (this.LLJLLIL && (tuxTextView2 = this.LLJJIJIL) != null) {
                tuxTextView2.setTuxFont(62);
                return;
            }
            return;
        }
        if (C297470BlJ.LIZ()) {
            TuxTextView tuxTextView10 = this.LLJJIJIL;
            if (tuxTextView10 != null) {
                tuxTextView10.setTextColorRes(R.attr.a1j);
            }
        } else {
            TuxTextView tuxTextView11 = this.LLJJIJIL;
            if (tuxTextView11 != null) {
                tuxTextView11.setTextColorRes(R.attr.a1k);
            }
        }
        TuxIconView tuxIconView2 = this.LLJJIJIIJIL;
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            if (this.LLJLLIL) {
                i = R.raw.icon_thumbs_up;
            } else {
                i = R.raw.icon_heart;
            }
            c419910GdJ2.LIZ = i;
            if (C297470BlJ.LIZ()) {
                numValueOf = Integer.valueOf(R.attr.a1j);
            } else {
                numValueOf = Integer.valueOf(R.attr.a1k);
            }
            c419910GdJ2.LJ = numValueOf;
            tuxIconView2.setTuxIcon(c419910GdJ2);
        }
        if (!this.LLJLLIL || (tuxTextView = this.LLJJIJIL) == null) {
            return;
        }
        tuxTextView.setTuxFont(61);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1181430gqj.LIZIZ(viewGroup.getContext(), R.layout.e20, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        InterfaceC1191710h7J interfaceC1191710h7J;
        super.onResume(z);
        if (z && (interfaceC1191710h7J = this.LL) != null) {
            interfaceC1191710h7J.iC(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0628  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r29, java.util.List r30) {
        /*
            Method dump skipped, instruction units count: 2016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsFoldedReviewCell.onBindItemView(X.0zJl, java.util.List):void");
    }

    public final void S5(Context context, String str, String str2, String str3) {
        String strLJJLIIIJJI;
        String logId;
        Integer source;
        String strZZ1;
        String strYy;
        String strO32;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        String poiId;
        if (str2 != null && str2.length() != 0) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile");
            smartRouteBuildRoute.withParam("uid", str2);
            String verifiedDisplay = null;
            smartRouteBuildRoute.withParam("source_btm_token", C18JG.LIZ("c68202.d81238", PageFinder.via(this.itemView), null));
            smartRouteBuildRoute.open();
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            InterfaceC1191710h7J interfaceC1191710h7J = this.LL;
            if (interfaceC1191710h7J != null) {
                strLJJLIIIJJI = interfaceC1191710h7J.LJJLIIIJJI();
            } else {
                strLJJLIIIJJI = null;
            }
            InterfaceC1191710h7J interfaceC1191710h7J2 = this.LL;
            if (interfaceC1191710h7J2 != null) {
                logId = interfaceC1191710h7J2.getLogId();
            } else {
                logId = null;
            }
            PoiReviewsApi.PoiReviewModel item = getItem();
            if (item != null) {
                source = item.getSource();
            } else {
                source = null;
            }
            InterfaceC1191710h7J interfaceC1191710h7J3 = this.LL;
            if (interfaceC1191710h7J3 != null) {
                strZZ1 = interfaceC1191710h7J3.ZZ1();
            } else {
                strZZ1 = null;
            }
            String str4 = "";
            if (strZZ1 == null) {
                strZZ1 = "";
            }
            PoiReviewsApi.PoiReviewModel item2 = getItem();
            if (item2 != null && (poiId = item2.getPoiId()) != null) {
                str4 = poiId;
            }
            InterfaceC1191710h7J interfaceC1191710h7J4 = this.LL;
            if (interfaceC1191710h7J4 != null) {
                strYy = interfaceC1191710h7J4.yy();
            } else {
                strYy = null;
            }
            InterfaceC1191710h7J interfaceC1191710h7J5 = this.LL;
            if (interfaceC1191710h7J5 != null) {
                strO32 = interfaceC1191710h7J5.o32();
            } else {
                strO32 = null;
            }
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
            if (fragmentLJIIJ != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            } else {
                interfaceC665370Q7zLJFF = null;
            }
            PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLJZ;
            if (poiReviewModel != null) {
                verifiedDisplay = poiReviewModel.getVerifiedDisplay();
            }
            PageFinder pageFinderVia = PageFinder.via(this);
            c1191160h6Q.getClass();
            C1191160h6Q.LJIIZILJ(strLJJLIIIJJI, str, str2, str3, logId, source, strZZ1, strYy, str4, strO32, interfaceC665370Q7zLJFF, verifiedDisplay, pageFinderVia);
        }
    }

    public final void T5(String str, final Context context, String str2, String str3, String str4, View view) {
        String strYy;
        String strP40;
        String strZZ1;
        String poiId;
        String verifiedDisplay;
        JSONObject jSONObjectRE;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        SparkContext sparkContext;
        Integer source;
        String reviewId;
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        String strLIZIZ = TiktokPoiLynxSettings.LIZIZ("poi_review_center");
        String str5 = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        sparkContext2.LJJLIIJ(strLIZIZ);
        sparkContext2.LJJJZ("enter_method", str);
        if (str2 == null) {
            str2 = "";
        }
        sparkContext2.LJJJZ("enter_from", str2);
        if (str3 == null) {
            str3 = "";
        }
        sparkContext2.LJJJZ("poi_id", str3);
        InterfaceC1191710h7J interfaceC1191710h7J = this.LL;
        if (interfaceC1191710h7J == null || (strYy = interfaceC1191710h7J.yy()) == null) {
            strYy = "";
        }
        sparkContext2.LJJJZ("from_group_id", strYy);
        if (!Intrinsics.LJFF(((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).getCurUserId(), str4)) {
            if (str4 == null) {
                str4 = "";
            }
            sparkContext2.LJJJZ("to_user_id", str4);
        }
        InterfaceC1191710h7J interfaceC1191710h7J2 = this.LL;
        if (interfaceC1191710h7J2 == null || (strP40 = interfaceC1191710h7J2.P40()) == null) {
            strP40 = "";
        }
        sparkContext2.LJJJZ("extra_info", strP40);
        InterfaceC1191710h7J interfaceC1191710h7J3 = this.LL;
        if (interfaceC1191710h7J3 != null) {
            strZZ1 = interfaceC1191710h7J3.ZZ1();
        } else {
            strZZ1 = null;
        }
        sparkContext2.LJJJZ("collect_info", String.valueOf(strZZ1));
        PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLJZ;
        if (poiReviewModel == null || (poiId = poiReviewModel.getPoiId()) == null) {
            poiId = "";
        }
        sparkContext2.LJJJZ("poi_id", poiId);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLJZ;
        if (poiReviewModel2 != null && (reviewId = poiReviewModel2.getReviewId()) != null) {
            str5 = reviewId;
        }
        sparkContext2.LJJJZ("review_id", str5);
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLJZ;
        if (poiReviewModel3 != null) {
            verifiedDisplay = poiReviewModel3.getVerifiedDisplay();
        } else {
            verifiedDisplay = null;
        }
        if (C123100dR.LIZ(verifiedDisplay) && verifiedDisplay != null) {
            sparkContext2.LJJJZ("review_tags", verifiedDisplay);
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel4 = this.LLJZ;
        if (poiReviewModel4 != null && (source = poiReviewModel4.getSource()) != null) {
            sparkContext2.LJJJZ("review_source", String.valueOf(source.intValue()));
        }
        try {
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
            if (fragmentLJIIJ != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            } else {
                interfaceC665370Q7zLJFF = null;
            }
            Map mapLJII = C1182380gsG.LJII(interfaceC665370Q7zLJFF);
            if (!mapLJII.isEmpty()) {
                sparkContext2.LJJJZ("poi_general_track_params", C2365509Or.LJ(mapLJII));
                sparkContext = sparkContext2;
            } else {
                sparkContext = null;
            }
            C189200o6.m2constructorimpl(sparkContext);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        InterfaceC1191710h7J interfaceC1191710h7J4 = this.LL;
        if (interfaceC1191710h7J4 != null && (jSONObjectRE = interfaceC1191710h7J4.rE(null, null)) != null) {
            sparkContext2.LJJJZ("poi_review_landing_params", C786410Ut5.J3(jSONObjectRE));
        }
        sparkContext2.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0h78
            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJJJI() {
                return !C444960Hcc.LIZJ(context) ? new C1725480v0E(R.anim.g6, R.anim.ed) : new C1725480v0E(R.anim.g5, R.anim.ed);
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJLI() {
                return !C444960Hcc.LIZJ(context) ? new C1725480v0E(0, R.anim.g8) : new C1725480v0E(0, R.anim.g7);
            }
        });
        sparkContext2.LJJJJZI(new C1209100hZM((C427660Gpo) view, 2));
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext2).LIZIZ();
    }
}
