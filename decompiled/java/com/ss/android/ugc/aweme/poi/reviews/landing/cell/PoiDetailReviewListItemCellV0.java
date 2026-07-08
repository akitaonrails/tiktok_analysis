package com.ss.android.ugc.aweme.poi.reviews.landing.cell;

import X.C01GW;
import X.C098200Yq;
import X.C0FV2;
import X.C0XQ7;
import X.C1170350gYr;
import X.C1175120ggY;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1181430gqj;
import X.C1182380gsG;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1189530h3n;
import X.C1190820h5s;
import X.C1191150h6P;
import X.C1191160h6Q;
import X.C1191340h6i;
import X.C1191350h6j;
import X.C1202300hOO;
import X.C1203280hPy;
import X.C1209100hZM;
import X.C123100dR;
import X.C1247510iZJ;
import X.C1308910kAL;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1390850mIV;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C13LP;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C189200o6;
import X.C18JG;
import X.C20742216Eq;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2365509Or;
import X.C305400By6;
import X.C418440Gaw;
import X.C418460Gay;
import X.C427660Gpo;
import X.C427690Gpr;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C848230XPh;
import X.C946803n0;
import X.C985403tE;
import X.EnumC1177490gkN;
import X.EnumC1190240h4w;
import X.EnumC1203020hPY;
import X.InterfaceC1184330gvP;
import X.InterfaceC1191710h7J;
import X.InterfaceC1542790qFZ;
import X.InterfaceC665370Q7z;
import X.ViewOnLongClickListenerC1208780hYq;
import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
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
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.ability.PoiReviewCellVAbility;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailReviewListItemCellV0 extends PowerCell<PoiReviewsApi.PoiReviewModel> {
    public InterfaceC1191710h7J LL;
    public C1189530h3n LLILLJJLI;
    public C427660Gpo LLILLL;
    public TuxTextView LLILZ;
    public C1203280hPy LLILZIL;
    public C418460Gay LLILZLL;
    public C1202300hOO LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxIconView LLJ;
    public View LLJI;
    public ViewGroup LLJIJIL;
    public SmartImageView LLJILJIL;
    public SmartImageView LLJILJILJ;
    public SmartImageView LLJILLL;
    public View LLJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public TuxIconView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public TuxTextView LLJJJIL;
    public View LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxIconView LLJJJJLIIL;
    public TuxIconView LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public TuxIconView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public ConstraintLayout LLJLLL;
    public SmartImageView LLJZ;
    public int LLJZIJLIL;
    public PoiReviewsApi.PoiReviewModel LLLFF;
    public View LLLFFI;
    public TextView LLLFZ;
    public SmartImageView LLLI;
    public C20742216Eq LLLII;
    public boolean LLLIIIL;
    public final boolean LLL = C1191350h6j.LIZ();
    public long LLLF = System.currentTimeMillis();
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1766));
    public final ACListenerS153S0100000_18 LLLIIIIL = new ACListenerS153S0100000_18(this, 82);

    public final int f6(int i) {
        switch (i) {
            case 1:
            case 2:
                return R.attr.ny;
            case 3:
            case 4:
                return R.attr.a19;
            case 5:
            case 6:
                return R.attr.zv;
            default:
                return -1;
        }
    }

    public final int I5() {
        InterfaceC1191710h7J interfaceC1191710h7J = this.LL;
        if (interfaceC1191710h7J != null) {
            interfaceC1191710h7J.wZ();
        }
        return getBindingAdapterPosition() + 1;
    }

    public final ArrayList<PoiGalleryAnchorData> N5() {
        ArrayList<PoiGalleryAnchorData> arrayList = new ArrayList<>();
        int[] iArr = new int[2];
        SmartImageView smartImageView = this.LLJILJIL;
        if (smartImageView != null && smartImageView.getVisibility() == 0) {
            SmartImageView smartImageView2 = this.LLJILJIL;
            if (smartImageView2 != null) {
                smartImageView2.getLocationOnScreen(iArr);
            }
            SmartImageView smartImageView3 = this.LLJILJIL;
            int width = smartImageView3 != null ? smartImageView3.getWidth() : 0;
            SmartImageView smartImageView4 = this.LLJILJIL;
            arrayList.add(new PoiGalleryAnchorData(width, smartImageView4 != null ? smartImageView4.getHeight() : 0, iArr[0], iArr[1], 240));
        }
        SmartImageView smartImageView5 = this.LLJILJILJ;
        if (smartImageView5 != null && smartImageView5.getVisibility() == 0) {
            SmartImageView smartImageView6 = this.LLJILJILJ;
            if (smartImageView6 != null) {
                smartImageView6.getLocationOnScreen(iArr);
            }
            SmartImageView smartImageView7 = this.LLJILJILJ;
            int width2 = smartImageView7 != null ? smartImageView7.getWidth() : 0;
            SmartImageView smartImageView8 = this.LLJILJILJ;
            arrayList.add(new PoiGalleryAnchorData(width2, smartImageView8 != null ? smartImageView8.getHeight() : 0, iArr[0], iArr[1], 240));
        }
        SmartImageView smartImageView9 = this.LLJILLL;
        if (smartImageView9 != null && smartImageView9.getVisibility() == 0) {
            SmartImageView smartImageView10 = this.LLJILLL;
            if (smartImageView10 != null) {
                smartImageView10.getLocationOnScreen(iArr);
            }
            SmartImageView smartImageView11 = this.LLJILLL;
            int width3 = smartImageView11 != null ? smartImageView11.getWidth() : 0;
            SmartImageView smartImageView12 = this.LLJILLL;
            arrayList.add(new PoiGalleryAnchorData(width3, smartImageView12 != null ? smartImageView12.getHeight() : 0, iArr[0], iArr[1], 240));
        }
        return arrayList;
    }

    public final PageFinder P5() {
        return (PageFinder) this.LLLIIII.getValue();
    }

    public final void T5() {
        InterfaceC1191710h7J interfaceC1191710h7J = this.LL;
        if (interfaceC1191710h7J == null || !interfaceC1191710h7J.zL1()) {
            return;
        }
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC1191710h7J interfaceC1191710h7J2 = this.LL;
        String strXq1 = interfaceC1191710h7J2 != null ? interfaceC1191710h7J2.Xq1() : null;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        C1185430gxB.LJJIJL(c1185430gxB, strXq1, "click", fragmentLJIIJ != null ? C1558360qeg.LJFF(fragmentLJIIJ, null) : null, "poi_secondary_reviews_page", "poi_review", PageFinder.via(C1189060h32.LJIIJ(this)));
    }

    public final void U5() {
        FragmentManager fragmentManager;
        PoiReviewsApi.PoiReviewModel item;
        C1247510iZJ c1247510iZJ;
        C1247510iZJ c1247510iZJ2;
        Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
        if (fragmentLIZ == null || (fragmentManager = fragmentLIZ.getFragmentManager()) == null || (item = getItem()) == null) {
            return;
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        if (L5(item)) {
            C1247510iZJ[] c1247510iZJArr = new C1247510iZJ[2];
            if (item.getWantTranslate()) {
                c1247510iZJ2 = new C1247510iZJ();
                c1247510iZJ2.LIZIZ(R.string.suj);
                c1247510iZJ2.LIZ(new AwS384S0200000_18(item, this, 126));
            } else {
                c1247510iZJ2 = new C1247510iZJ();
                c1247510iZJ2.LIZIZ(2131850744);
                c1247510iZJ2.LIZ(new AwS384S0200000_18(item, this, 125));
            }
            c1247510iZJArr[0] = c1247510iZJ2;
            C1247510iZJ c1247510iZJ3 = new C1247510iZJ();
            c1247510iZJ3.LIZIZ(2131829536);
            c1247510iZJ3.LIZ(new AwS384S0200000_18(item, this, 127));
            c1247510iZJArr[1] = c1247510iZJ3;
            List listLJIILJJIL = C1697810uHb.LJIILJJIL(c1247510iZJArr);
            if (this.LLILLJJLI != null) {
                C1247510iZJ c1247510iZJ4 = new C1247510iZJ();
                c1247510iZJ4.LIZIZ(R.string.gm7);
                c1247510iZJ4.LIZJ = 1;
                c1247510iZJ4.LIZ(new AwS597S0100000_18(this, 454));
                listLJIILJJIL.add(c1247510iZJ4);
            }
            c1390850mIV.LJI(listLJIILJJIL);
        } else {
            if (item.getWantTranslate()) {
                c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZIZ(R.string.suj);
                c1247510iZJ.LIZ(new AwS384S0200000_18(item, this, 131));
            } else {
                c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZIZ(2131850744);
                c1247510iZJ.LIZ(new AwS384S0200000_18(item, this, 130));
            }
            C1247510iZJ c1247510iZJ5 = new C1247510iZJ();
            c1247510iZJ5.LIZIZ(2131836352);
            c1247510iZJ5.LIZ(new AwS384S0200000_18(item, this, 129));
            C1247510iZJ c1247510iZJ6 = new C1247510iZJ();
            c1247510iZJ6.LIZIZ(2131836352);
            c1247510iZJ6.LIZ(new AwS384S0200000_18(item, this, 128));
            if ((!C1190820h5s.LJFF(item) || C1190820h5s.LJIIIIZZ(item)) && C848230XPh.LL.LJI()) {
                c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ5);
            } else if (C1190820h5s.LJII(item) && C848230XPh.LL.LJI() && C1191150h6P.LIZ()) {
                c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ6);
            } else {
                c1390850mIV.LIZIZ(c1247510iZJ);
            }
        }
        c1390850mIV.LIZLLL(R.string.f1_);
        c1390850mIV.LIZJ().show(fragmentManager, "PoiReviewMenuPanel");
    }

    public final void b6() {
        String reviewId;
        String str;
        String poiId;
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
        Integer numValueOf2 = Integer.valueOf((I5() == 1 && (poiReviewModel = this.LLLFF) != null && L5(poiReviewModel)) ? 1 : 0);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLLFF;
        Integer num = (poiReviewModel2 == null || (status = poiReviewModel2.getStatus()) == null) ? null : status.status;
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLLFF;
        String verifiedDisplay = poiReviewModel3 != null ? poiReviewModel3.getVerifiedDisplay() : null;
        PageFinder pageFinderP5 = P5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJIIJ(strLJJLIIIJJI, "review", reviewId, str, poiId, str3, fLIZIZ, zLIZ ? 1 : 0, numValueOf, iLongValue, size, length, str4, value, logId, str5, wantTranslate, strYy, strO32, "reviews_button", i, interfaceC665370Q7zLJFF, numValueOf2, num, verifiedDisplay, pageFinderP5);
    }

    public final void c6() {
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
        PoiReviewsApi.PoiReviewModel item14 = getItem();
        String verifiedDisplay = item14 != null ? item14.getVerifiedDisplay() : null;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = fragmentLJIIJ != null ? C1558360qeg.LJFF(fragmentLJIIJ, null) : null;
        PageFinder pageFinderP5 = P5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJII(strLJJLIIIJJI, reviewId, str, poiId, str3, fLIZIZ, zLIZ ? 1 : 0, iI5, iLongValue, size, length, str4, value, logId, str5, wantTranslate, strYy, strO32, i, interfaceC665370Q7zLJFF, verifiedDisplay, pageFinderP5);
    }

    public final void h6() {
        C1397580mTM c1397580mTM = new C1397580mTM(this.itemView.getContext());
        c1397580mTM.LIZIZ(this.itemView.getContext().getResources().getString(2131844853));
        C985403tE.LIZ(c1397580mTM, new AwS597S0100000_18(this, 751));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final View V5() {
        return !C1191350h6j.LIZ() ? this.LLJJJ : this.LLJL;
    }

    public final TuxTextView W5() {
        return C1191340h6i.LIZIZ() ? this.LLJLILLLLZIIL : this.LLJJJJJIL;
    }

    public final TuxTextView X5() {
        return !C1191350h6j.LIZ() ? this.LLJJIII : this.LLJJJIL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        int i;
        int i2;
        SmartImageView smartImageView;
        SmartImageView smartImageView2;
        SmartImageView smartImageView3;
        PoiReviewCellVAbility poiReviewCellVAbility;
        super.onItemViewCreated();
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        SmartImageView smartImageView4 = null;
        if (fragmentLJIIJ != null && (poiReviewCellVAbility = (PoiReviewCellVAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiReviewCellVAbility.class, null)) != null) {
            this.LL = poiReviewCellVAbility.r0();
            this.LLILLJJLI = poiReviewCellVAbility.G1();
        }
        if (this.LLL) {
            i = 0;
            i2 = 8;
        } else {
            i = 8;
            i2 = 0;
        }
        C786410Ut5.LJLLLLLL(i2, this.itemView.findViewById(R.id.cpg));
        C786410Ut5.LJLLLLLL(i2, this.itemView.findViewById(R.id.ffs));
        C786410Ut5.LJLLLLLL(i2, this.itemView.findViewById(R.id.mnd));
        C786410Ut5.LJLLLLLL(i2, this.itemView.findViewById(R.id.fxn));
        C786410Ut5.LJLLLLLL(i, this.itemView.findViewById(R.id.cpi));
        C786410Ut5.LJLLLLLL(i, this.itemView.findViewById(R.id.ffv));
        C786410Ut5.LJLLLLLL(i, this.itemView.findViewById(R.id.mnf));
        C786410Ut5.LJLLLLLL(i, this.itemView.findViewById(R.id.fxo));
        C786410Ut5.LJLLLLLL(i, this.itemView.findViewById(R.id.f707g3a));
        this.LLILLL = (C427660Gpo) this.itemView.findViewById(R.id.bh2);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.p09);
        this.LLILZIL = (C1203280hPy) this.itemView.findViewById(R.id.srg);
        this.LLILZLL = (C418460Gay) this.itemView.findViewById(R.id.yky);
        this.LLIZ = (C1202300hOO) this.itemView.findViewById(R.id.text);
        this.LLIZLLLIL = (TuxTextView) this.itemView.findViewById(R.id.yil);
        this.LLJI = this.itemView.findViewById(R.id.ujd);
        this.LLJ = (TuxIconView) this.itemView.findViewById(R.id.k4x);
        this.LLJIJIL = (ViewGroup) this.itemView.findViewById(R.id.kc4);
        this.LLJJIII = (TuxTextView) this.itemView.findViewById(R.id.ffs);
        this.LLJJJIL = (TuxTextView) this.itemView.findViewById(R.id.ffv);
        this.itemView.findViewById(R.id.mnh);
        this.LLJJJJJIL = (TuxTextView) this.itemView.findViewById(R.id.mni);
        this.LLJJIJI = (TuxIconView) this.itemView.findViewById(R.id.mnv);
        this.LLJJJJLIIL = (TuxIconView) this.itemView.findViewById(R.id.mnx);
        this.LLJJIJIIJIL = (TuxIconView) this.itemView.findViewById(R.id.fxm);
        this.LLJJL = (TuxIconView) this.itemView.findViewById(R.id.fxp);
        this.LLJJIJIL = this.itemView.findViewById(R.id.mnd);
        this.LLJJJ = this.itemView.findViewById(R.id.fxn);
        this.LLJJLIIIJLLLLLLLZ = this.itemView.findViewById(R.id.mnf);
        this.LLJL = this.itemView.findViewById(R.id.fxo);
        this.itemView.findViewById(R.id.cpg);
        this.LLJJJJ = this.itemView.findViewById(R.id.cpi);
        this.LLJZ = (SmartImageView) this.itemView.findViewById(R.id.bpv);
        this.LLJLL = this.itemView.findViewById(R.id.mng);
        this.LLJLIL = (TuxIconView) this.itemView.findViewById(R.id.mny);
        this.LLJLILLLLZIIL = (TuxTextView) this.itemView.findViewById(R.id.mnj);
        this.LLJLLIL = this.itemView.findViewById(R.id.cpj);
        this.LLLFFI = this.itemView.findViewById(R.id.thg);
        this.LLLFZ = (TextView) this.itemView.findViewById(R.id.mm_);
        this.LLLI = (SmartImageView) this.itemView.findViewById(R.id.mm8);
        this.LLLII = (C20742216Eq) this.itemView.findViewById(R.id.jeq);
        this.itemView.findViewById(R.id.g39);
        this.itemView.findViewById(R.id.f707g3a);
        this.itemView.findViewById(R.id.cik);
        this.LLJLLL = (ConstraintLayout) this.itemView.findViewById(R.id.m6p);
        C427690Gpr.LJ(this.itemView, 0.0f);
        View view = C1191340h6i.LIZIZ() ? this.LLJLL : this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 84), view);
        }
        View viewV5 = V5();
        if (viewV5 != null) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 85), viewV5);
        }
        this.LLJZIJLIL = C814420VxA.LIZIZ(((C0FV2.LIZIZ(getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2)) / 3.0f);
        ViewGroup viewGroup = this.LLJIJIL;
        if (viewGroup == null || (smartImageView = (SmartImageView) viewGroup.findViewById(R.id.tgn)) == null) {
            smartImageView = null;
        } else {
            int i3 = this.LLJZIJLIL;
            C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams(i3, i3));
        }
        this.LLJILJIL = smartImageView;
        ViewGroup viewGroup2 = this.LLJIJIL;
        if (viewGroup2 == null || (smartImageView2 = (SmartImageView) viewGroup2.findViewById(R.id.tgo)) == null) {
            smartImageView2 = null;
        } else {
            int i4 = this.LLJZIJLIL;
            C786410Ut5.G6(smartImageView2, new LinearLayout.LayoutParams(i4, i4));
        }
        this.LLJILJILJ = smartImageView2;
        ViewGroup viewGroup3 = this.LLJIJIL;
        if (viewGroup3 != null && (smartImageView3 = (SmartImageView) viewGroup3.findViewById(R.id.tgp)) != null) {
            int i5 = this.LLJZIJLIL;
            C786410Ut5.G6(smartImageView3, new LinearLayout.LayoutParams(i5, i5));
            smartImageView4 = smartImageView3;
        }
        this.LLJILLL = smartImageView4;
        SmartImageView smartImageView5 = this.LLJILJIL;
        if (smartImageView5 != null) {
            C786410Ut5.Q8(smartImageView5, this.LLLIIIIL);
        }
        SmartImageView smartImageView6 = this.LLJILJILJ;
        if (smartImageView6 != null) {
            C786410Ut5.Q8(smartImageView6, this.LLLIIIIL);
        }
        SmartImageView smartImageView7 = this.LLJILLL;
        if (smartImageView7 != null) {
            C786410Ut5.Q8(smartImageView7, this.LLLIIIIL);
        }
        SmartImageView smartImageView8 = this.LLJILJIL;
        if (smartImageView8 != null) {
            smartImageView8.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 5));
        }
        SmartImageView smartImageView9 = this.LLJILJILJ;
        if (smartImageView9 != null) {
            smartImageView9.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 6));
        }
        SmartImageView smartImageView10 = this.LLJILLL;
        if (smartImageView10 != null) {
            smartImageView10.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 7));
        }
        this.LLJJ = this.itemView.findViewById(R.id.olm);
        this.LLJJI = (TuxTextView) this.itemView.findViewById(R.id.oll);
        View view2 = this.LLJJ;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 83), view2);
        }
        TuxTextView tuxTextView = this.LLIZLLLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(2131846662);
        }
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 452));
        if (C305400By6.LIZ == 1) {
            C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 453));
        }
    }

    public final boolean L5(PoiReviewsApi.PoiReviewModel poiReviewModel) {
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

    public final void a6(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        List<PoiReviewsApi.ImageDataModel> list;
        int size;
        List<PoiReviewsApi.ImageDataModel> list2;
        SmartImageView smartImageView;
        UrlModel urlModel;
        int iIntValue;
        ViewGroup viewGroup = this.LLJIJIL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        SmartImageView smartImageView2 = this.LLJILJIL;
        if (smartImageView2 != null) {
            C786410Ut5.LLFF(8, smartImageView2);
        }
        SmartImageView smartImageView3 = this.LLJILJILJ;
        if (smartImageView3 != null) {
            C786410Ut5.LLFF(8, smartImageView3);
        }
        SmartImageView smartImageView4 = this.LLJILLL;
        if (smartImageView4 != null) {
            C786410Ut5.LLFF(8, smartImageView4);
        }
        PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
        if (content != null && (list2 = content.images) != null) {
            int i = 1;
            if (!list2.isEmpty()) {
                ViewGroup viewGroup2 = this.LLJIJIL;
                if (viewGroup2 != null) {
                    C786410Ut5.LJLZ(0, viewGroup2);
                }
                ArrayList arrayList = new ArrayList();
                for (PoiReviewsApi.ImageDataModel imageDataModel : list2) {
                    if (imageDataModel != null) {
                        arrayList.add(imageDataModel);
                    }
                }
                List listLL = C13LP.LL(arrayList, 3);
                if (listLL != null) {
                    int i2 = 0;
                    for (Object obj : listLL) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            PoiReviewsApi.ImageDataModel imageDataModel2 = (PoiReviewsApi.ImageDataModel) obj;
                            if (i2 != 0) {
                                if (i2 != i) {
                                    if (i2 == 2) {
                                        smartImageView = this.LLJILLL;
                                    } else {
                                        i2 = i3;
                                        i = 1;
                                    }
                                } else {
                                    smartImageView = this.LLJILJILJ;
                                }
                            } else {
                                smartImageView = this.LLJILJIL;
                            }
                            if (smartImageView != null) {
                                C1180600gpO c1180600gpO = new C1180600gpO("poi_detail_reviews", "poi_reviews_image", new C1180560gpK(this.itemView.getContext(), EnumC1177490gkN.FALLBACK_26_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(12))), null));
                                if (imageDataModel2 != null) {
                                    urlModel = imageDataModel2.cropImage;
                                } else {
                                    urlModel = null;
                                }
                                C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(urlModel));
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c7, this.itemView.getContext());
                                if (numLIZJ != null) {
                                    iIntValue = numLIZJ.intValue();
                                } else {
                                    iIntValue = -1;
                                }
                                c1189360h3WLIZ.LIZ.LJIJJ = new ColorDrawable(iIntValue);
                                C1331750klB c1331750klB = new C1331750klB();
                                c1331750klB.LJ = C418440Gaw.LIZIZ(12);
                                c1331750klB.LJII = EnumC1203020hPY.BITMAP_ONLY;
                                c1189360h3WLIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
                                c1189360h3WLIZ.LIZLLL(smartImageView);
                                c1189360h3WLIZ.LIZIZ();
                                C786410Ut5.LLFF(0, smartImageView);
                            }
                            i2 = i3;
                            i = 1;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
        }
        PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModel.getContent();
        if (content2 != null && (list = content2.images) != null && (size = list.size() - 3) > 0) {
            TuxTextView tuxTextView = this.LLJJI;
            if (tuxTextView != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('+');
                sbLIZ.append(size);
                tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            View view = this.LLJJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        View view2 = this.LLJJ;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view2);
    }

    public final void d6(boolean z) {
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
        InterfaceC1191710h7J interfaceC1191710h7J = this.LL;
        String verifiedDisplay = null;
        if (interfaceC1191710h7J != null) {
            strLJJLIIIJJI = interfaceC1191710h7J.LJJLIIIJJI();
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
        InterfaceC1191710h7J interfaceC1191710h7J2 = this.LL;
        if (interfaceC1191710h7J2 != null && (strZZ1 = interfaceC1191710h7J2.ZZ1()) != null) {
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
        InterfaceC1191710h7J interfaceC1191710h7J3 = this.LL;
        if (interfaceC1191710h7J3 != null) {
            logId = interfaceC1191710h7J3.getLogId();
        } else {
            logId = null;
        }
        PoiReviewsApi.PoiReviewModel item11 = getItem();
        if (item11 != null && (content = item11.getContent()) != null) {
            str4 = content.textLang;
        } else {
            str4 = null;
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
        if (I5() == 1 && (poiReviewModel = this.LLLFF) != null && L5(poiReviewModel)) {
            i2 = 1;
        }
        Integer numValueOf = Integer.valueOf(i2);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLLFF;
        if (poiReviewModel2 != null && (status = poiReviewModel2.getStatus()) != null) {
            num = status.status;
        } else {
            num = null;
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLLFF;
        if (poiReviewModel3 != null) {
            verifiedDisplay = poiReviewModel3.getVerifiedDisplay();
        }
        PageFinder pageFinderP5 = P5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJIILJJIL(fLIZIZ, zLIZ ? 1 : 0, iI5, iLongValue, size, length, value, i, pageFinderP5, interfaceC665370Q7zLJFF, numValueOf, num, strLJJLIIIJJI, reviewId, str, poiId, str6, str3, logId, str4, strYy, strO32, verifiedDisplay, z);
    }

    public final void e6(boolean z) {
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
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        InterfaceC1191710h7J interfaceC1191710h7J = this.LL;
        String verifiedDisplay = null;
        if (interfaceC1191710h7J != null) {
            strLJJLIIIJJI = interfaceC1191710h7J.LJJLIIIJJI();
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
        InterfaceC1191710h7J interfaceC1191710h7J2 = this.LL;
        if (interfaceC1191710h7J2 != null && (strZZ1 = interfaceC1191710h7J2.ZZ1()) != null) {
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
        InterfaceC1191710h7J interfaceC1191710h7J3 = this.LL;
        if (interfaceC1191710h7J3 != null) {
            logId = interfaceC1191710h7J3.getLogId();
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
        if (I5() == 1 && (poiReviewModel = this.LLLFF) != null && L5(poiReviewModel)) {
            i2 = 1;
        }
        Integer numValueOf = Integer.valueOf(i2);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLLFF;
        if (poiReviewModel2 != null && (status = poiReviewModel2.getStatus()) != null) {
            num = status.status;
        } else {
            num = null;
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLLFF;
        if (poiReviewModel3 != null) {
            verifiedDisplay = poiReviewModel3.getVerifiedDisplay();
        }
        PageFinder pageFinderP5 = P5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJIILIIL(fLIZIZ, zLIZ ? 1 : 0, iI5, iLongValue, size, length, value, i, pageFinderP5, interfaceC665370Q7zLJFF, numValueOf, num, strLJJLIIIJJI, reviewId, str, poiId, str6, str3, logId, str4, strYy, strO32, verifiedDisplay, z);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (SlashComponentUIPreloadExp.LIZ("poi_review")) {
            return C1181430gqj.LIZIZ(viewGroup.getContext(), R.layout.e1w, viewGroup, false);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e1w, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        InterfaceC1191710h7J interfaceC1191710h7J;
        super.onResume(z);
        if (z && (interfaceC1191710h7J = this.LL) != null) {
            interfaceC1191710h7J.iC(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0832  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r26, java.util.List r27) {
        /*
            Method dump skipped, instruction units count: 2285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiDetailReviewListItemCellV0.onBindItemView(X.0zJl, java.util.List):void");
    }

    public final void R5(Context context, String str, String str2, String str3) {
        String strLJJLIIIJJI;
        String logId;
        Integer source;
        String strZZ1;
        String strYy;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        String strO32;
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
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
            if (fragmentLJIIJ != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            } else {
                interfaceC665370Q7zLJFF = null;
            }
            InterfaceC1191710h7J interfaceC1191710h7J5 = this.LL;
            if (interfaceC1191710h7J5 != null) {
                strO32 = interfaceC1191710h7J5.o32();
            } else {
                strO32 = null;
            }
            PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLLFF;
            if (poiReviewModel != null) {
                verifiedDisplay = poiReviewModel.getVerifiedDisplay();
            }
            PageFinder pageFinderVia = PageFinder.via(this);
            c1191160h6Q.getClass();
            C1191160h6Q.LJIIZILJ(strLJJLIIIJJI, str, str2, str3, logId, source, strZZ1, strYy, str4, strO32, interfaceC665370Q7zLJFF, verifiedDisplay, pageFinderVia);
        }
    }

    public final void S5(String str, final Context context, String str2, String str3, String str4, View view) {
        String strYy;
        String strP40;
        String strZZ1;
        String poiId;
        String verifiedDisplay;
        C1185410gx9 c1185410gx9Nf;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        SparkContext sparkContext;
        Integer source;
        String reviewId;
        if (context == null) {
            return;
        }
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
        InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = null;
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
        PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLLFF;
        if (poiReviewModel == null || (poiId = poiReviewModel.getPoiId()) == null) {
            poiId = "";
        }
        sparkContext2.LJJJZ("poi_id", poiId);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLLFF;
        if (poiReviewModel2 != null && (reviewId = poiReviewModel2.getReviewId()) != null) {
            str5 = reviewId;
        }
        sparkContext2.LJJJZ("review_id", str5);
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLLFF;
        if (poiReviewModel3 != null) {
            verifiedDisplay = poiReviewModel3.getVerifiedDisplay();
        } else {
            verifiedDisplay = null;
        }
        if (C123100dR.LIZ(verifiedDisplay) && verifiedDisplay != null) {
            sparkContext2.LJJJZ("review_tags", verifiedDisplay);
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel4 = this.LLLFF;
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
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1170350gYr.LIZJ(this, C13LE.LIZ(InterfaceC1184330gvP.class));
        if (interfaceC1184330gvP != null) {
            c1185410gx9Nf = interfaceC1184330gvP.Nf();
        } else {
            c1185410gx9Nf = null;
        }
        InterfaceC1191710h7J interfaceC1191710h7J4 = this.LL;
        if (interfaceC1191710h7J4 != null) {
            Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ(this);
            if (fragmentLJIIJ2 != null) {
                interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJIIJ2, null);
            }
            JSONObject jSONObjectRE = interfaceC1191710h7J4.rE(c1185410gx9Nf, interfaceC665370Q7zLJFF2);
            if (jSONObjectRE != null) {
                sparkContext2.LJJJZ("poi_review_landing_params", C786410Ut5.J3(jSONObjectRE));
            }
        }
        sparkContext2.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0h7Y
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
        sparkContext2.LJJJJZI(new C1209100hZM((C427660Gpo) view, 1));
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext2).LIZIZ();
    }
}
