package com.ss.android.ugc.aweme.poi.reviews.landing.cell;

import X.C01GW;
import X.C03EB;
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
import X.C1189590h3t;
import X.C1190010h4Z;
import X.C1190820h5s;
import X.C1191150h6P;
import X.C1191160h6Q;
import X.C1191340h6i;
import X.C1191350h6j;
import X.C1202300hOO;
import X.C1202420hOa;
import X.C1203280hPy;
import X.C1209100hZM;
import X.C1209504oH;
import X.C123100dR;
import X.C1247510iZJ;
import X.C1308910kAL;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1378990lzN;
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
import X.C19ME;
import X.C20742216Eq;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2365509Or;
import X.C297470BlJ;
import X.C305400By6;
import X.C418440Gaw;
import X.C418460Gay;
import X.C426750GoL;
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
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.ViewOnLongClickListenerC1208780hYq;
import Y.ACListenerS153S0100000_18;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
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
public final class PoiDetailReviewListItemCell extends PowerCell<PoiReviewsApi.PoiReviewModel> {
    public InterfaceC1191710h7J LL;
    public C1189530h3n LLILLJJLI;
    public C427660Gpo LLILLL;
    public C03EB LLILZ;
    public TuxTextView LLILZIL;
    public View LLILZLL;
    public C1203280hPy LLIZ;
    public C418460Gay LLIZLLLIL;
    public C1202300hOO LLJ;
    public TuxTextView LLJI;
    public TuxIconView LLJIJIL;
    public View LLJILJIL;
    public ViewGroup LLJILJILJ;
    public ViewGroup LLJILLL;
    public SmartImageView LLJJ;
    public SmartImageView LLJJI;
    public SmartImageView LLJJIII;
    public View LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxIconView LLJJJ;
    public TuxIconView LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public View LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public TuxIconView LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public TuxIconView LLJLLIL;
    public TuxTextView LLJLLL;
    public View LLJZ;
    public View LLJZIJLIL;
    public TuxTextView LLL;
    public TuxTextView LLLF;
    public TuxTextView LLLFF;
    public C1189590h3t LLLFFI;
    public SmartImageView LLLFZ;
    public int LLLI;
    public PoiReviewsApi.PoiReviewModel LLLIIIIL;
    public View LLLIIIL;
    public TextView LLLIIL;
    public SmartImageView LLLIILIL;
    public C20742216Eq LLLIL;
    public boolean LLLILZLLLI;
    public final boolean LLLII = C1191350h6j.LIZ();
    public long LLLIIII = System.currentTimeMillis();
    public final C01GW LLLILZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1765));
    public final ACListenerS153S0100000_18 LLLILZJ = new ACListenerS153S0100000_18(this, 73);

    public final int L5() {
        InterfaceC1191710h7J interfaceC1191710h7J = this.LL;
        if (interfaceC1191710h7J != null) {
            interfaceC1191710h7J.wZ();
        }
        return getBindingAdapterPosition() + 1;
    }

    public final ArrayList<PoiGalleryAnchorData> P5() {
        ArrayList<PoiGalleryAnchorData> arrayList = new ArrayList<>();
        int[] iArr = new int[2];
        SmartImageView smartImageView = this.LLJJ;
        if (smartImageView != null && smartImageView.getVisibility() == 0) {
            SmartImageView smartImageView2 = this.LLJJ;
            if (smartImageView2 != null) {
                smartImageView2.getLocationOnScreen(iArr);
            }
            SmartImageView smartImageView3 = this.LLJJ;
            int width = smartImageView3 != null ? smartImageView3.getWidth() : 0;
            SmartImageView smartImageView4 = this.LLJJ;
            arrayList.add(new PoiGalleryAnchorData(width, smartImageView4 != null ? smartImageView4.getHeight() : 0, iArr[0], iArr[1], 240));
        }
        SmartImageView smartImageView5 = this.LLJJI;
        if (smartImageView5 != null && smartImageView5.getVisibility() == 0) {
            SmartImageView smartImageView6 = this.LLJJI;
            if (smartImageView6 != null) {
                smartImageView6.getLocationOnScreen(iArr);
            }
            SmartImageView smartImageView7 = this.LLJJI;
            int width2 = smartImageView7 != null ? smartImageView7.getWidth() : 0;
            SmartImageView smartImageView8 = this.LLJJI;
            arrayList.add(new PoiGalleryAnchorData(width2, smartImageView8 != null ? smartImageView8.getHeight() : 0, iArr[0], iArr[1], 240));
        }
        SmartImageView smartImageView9 = this.LLJJIII;
        if (smartImageView9 != null && smartImageView9.getVisibility() == 0) {
            SmartImageView smartImageView10 = this.LLJJIII;
            if (smartImageView10 != null) {
                smartImageView10.getLocationOnScreen(iArr);
            }
            SmartImageView smartImageView11 = this.LLJJIII;
            int width3 = smartImageView11 != null ? smartImageView11.getWidth() : 0;
            SmartImageView smartImageView12 = this.LLJJIII;
            arrayList.add(new PoiGalleryAnchorData(width3, smartImageView12 != null ? smartImageView12.getHeight() : 0, iArr[0], iArr[1], 240));
        }
        return arrayList;
    }

    public final PageFinder R5() {
        return (PageFinder) this.LLLILZ.getValue();
    }

    public final void V5() {
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

    public final void a6() {
        FragmentManager fragmentManager;
        PoiReviewsApi.PoiReviewModel item;
        C1247510iZJ c1247510iZJ;
        C1247510iZJ c1247510iZJ2;
        Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
        if (fragmentLIZ == null || (fragmentManager = fragmentLIZ.getFragmentManager()) == null || (item = getItem()) == null) {
            return;
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        if (N5(item)) {
            C1247510iZJ[] c1247510iZJArr = new C1247510iZJ[2];
            if (item.getWantTranslate()) {
                c1247510iZJ2 = new C1247510iZJ();
                c1247510iZJ2.LIZIZ(R.string.suj);
                c1247510iZJ2.LIZ(new AwS384S0200000_18(item, this, 121));
            } else {
                c1247510iZJ2 = new C1247510iZJ();
                c1247510iZJ2.LIZIZ(2131850744);
                c1247510iZJ2.LIZ(new AwS384S0200000_18(item, this, 120));
            }
            c1247510iZJArr[0] = c1247510iZJ2;
            C1247510iZJ c1247510iZJ3 = new C1247510iZJ();
            c1247510iZJ3.LIZIZ(2131829536);
            c1247510iZJ3.LIZ(new AwS384S0200000_18(item, this, 122));
            c1247510iZJArr[1] = c1247510iZJ3;
            List listLJIILJJIL = C1697810uHb.LJIILJJIL(c1247510iZJArr);
            if (this.LLILLJJLI != null) {
                C1247510iZJ c1247510iZJ4 = new C1247510iZJ();
                c1247510iZJ4.LIZIZ(R.string.gm7);
                c1247510iZJ4.LIZJ = 1;
                c1247510iZJ4.LIZ(new AwS597S0100000_18(this, 451));
                listLJIILJJIL.add(c1247510iZJ4);
            }
            c1390850mIV.LJI(listLJIILJJIL);
        } else {
            if (item.getWantTranslate()) {
                c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZIZ(R.string.suj);
                c1247510iZJ.LIZ(new AwS384S0200000_18(item, this, 119));
            } else {
                c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZIZ(2131850744);
                c1247510iZJ.LIZ(new AwS384S0200000_18(item, this, 118));
            }
            C1247510iZJ c1247510iZJ5 = new C1247510iZJ();
            c1247510iZJ5.LIZIZ(2131836352);
            c1247510iZJ5.LIZ(new AwS384S0200000_18(item, this, 124));
            C1247510iZJ c1247510iZJ6 = new C1247510iZJ();
            c1247510iZJ6.LIZIZ(2131836352);
            c1247510iZJ6.LIZ(new AwS384S0200000_18(item, this, 123));
            if ((!C1190820h5s.LJFF(item) || C1190820h5s.LJIIIIZZ(item) || C1190820h5s.LJ(item)) && C848230XPh.LL.LJI()) {
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

    public final void h6() {
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
        Integer numValueOf = Integer.valueOf(L5());
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
        Integer numValueOf2 = Integer.valueOf((L5() == 1 && (poiReviewModel = this.LLLIIIIL) != null && N5(poiReviewModel)) ? 1 : 0);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLLIIIIL;
        Integer num = (poiReviewModel2 == null || (status = poiReviewModel2.getStatus()) == null) ? null : status.status;
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLLIIIIL;
        String verifiedDisplay = poiReviewModel3 != null ? poiReviewModel3.getVerifiedDisplay() : null;
        PageFinder pageFinderR5 = R5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJIIJ(strLJJLIIIJJI, "review", reviewId, str, poiId, str3, fLIZIZ, zLIZ ? 1 : 0, numValueOf, iLongValue, size, length, str4, value, logId, str5, wantTranslate, strYy, strO32, "reviews_button", i, interfaceC665370Q7zLJFF, numValueOf2, num, verifiedDisplay, pageFinderR5);
    }

    public final void i6() {
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
        int iL5 = L5();
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
        PageFinder pageFinderR5 = R5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJII(strLJJLIIIJJI, reviewId, str, poiId, str3, fLIZIZ, zLIZ ? 1 : 0, iL5, iLongValue, size, length, str4, value, logId, str5, wantTranslate, strYy, strO32, i, interfaceC665370Q7zLJFF, verifiedDisplay, pageFinderR5);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        int i;
        int i2;
        SmartImageView smartImageView;
        SmartImageView smartImageView2;
        SmartImageView smartImageView3;
        C19ME c19me;
        TuxIconView tuxIconView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C19ME c19me2;
        C19ME c19me3;
        C19ME c19me4;
        C19ME c19me5;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        PoiReviewCellVAbility poiReviewCellVAbility;
        super.onItemViewCreated();
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null && (poiReviewCellVAbility = (PoiReviewCellVAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiReviewCellVAbility.class, null)) != null) {
            this.LL = poiReviewCellVAbility.r0();
            this.LLILLJJLI = poiReviewCellVAbility.G1();
        }
        if (this.LLLII) {
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
        this.LLILZ = (C03EB) this.itemView.findViewById(R.id.f831xtc);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.p09);
        this.LLILZLL = this.itemView.findViewById(R.id.srh);
        this.LLIZ = (C1203280hPy) this.itemView.findViewById(R.id.srg);
        this.LLIZLLLIL = (C418460Gay) this.itemView.findViewById(R.id.yky);
        this.LLJ = (C1202300hOO) this.itemView.findViewById(R.id.text);
        this.LLJI = (TuxTextView) this.itemView.findViewById(R.id.yil);
        this.LLJILJIL = this.itemView.findViewById(R.id.ujd);
        this.LLJIJIL = (TuxIconView) this.itemView.findViewById(R.id.k4x);
        this.LLJILJILJ = (ViewGroup) this.itemView.findViewById(R.id.kc4);
        this.LLJILLL = (ViewGroup) this.itemView.findViewById(R.id.tgq);
        this.LLJJIJIL = (TuxTextView) this.itemView.findViewById(R.id.ffs);
        this.LLJJJJLIIL = (TuxTextView) this.itemView.findViewById(R.id.ffv);
        this.itemView.findViewById(R.id.mnh);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) this.itemView.findViewById(R.id.mni);
        this.LLJJJ = (TuxIconView) this.itemView.findViewById(R.id.mnv);
        this.LLJL = (TuxIconView) this.itemView.findViewById(R.id.mnx);
        this.LLJJJIL = (TuxIconView) this.itemView.findViewById(R.id.fxm);
        this.LLJLIL = (TuxIconView) this.itemView.findViewById(R.id.fxp);
        this.LLJJJJ = this.itemView.findViewById(R.id.mnd);
        this.LLJJJJJIL = this.itemView.findViewById(R.id.fxn);
        this.LLJLILLLLZIIL = this.itemView.findViewById(R.id.mnf);
        this.LLJLL = this.itemView.findViewById(R.id.fxo);
        this.itemView.findViewById(R.id.cpg);
        this.LLJJL = this.itemView.findViewById(R.id.cpi);
        this.LLLFZ = (SmartImageView) this.itemView.findViewById(R.id.bpv);
        this.LLJZ = this.itemView.findViewById(R.id.mng);
        this.LLJLLIL = (TuxIconView) this.itemView.findViewById(R.id.mny);
        this.LLJLLL = (TuxTextView) this.itemView.findViewById(R.id.mnj);
        this.LLJZIJLIL = this.itemView.findViewById(R.id.cpj);
        this.LLLIIIL = this.itemView.findViewById(R.id.thg);
        this.LLLIIL = (TextView) this.itemView.findViewById(R.id.mm_);
        this.LLLIILIL = (SmartImageView) this.itemView.findViewById(R.id.mm8);
        this.LLLIL = (C20742216Eq) this.itemView.findViewById(R.id.jeq);
        this.LLL = (TuxTextView) this.itemView.findViewById(R.id.g39);
        this.itemView.findViewById(R.id.f707g3a);
        this.LLLF = (TuxTextView) this.itemView.findViewById(R.id.g3b);
        this.LLLFF = (TuxTextView) this.itemView.findViewById(R.id.verified_display);
        this.LLLFFI = (C1189590h3t) this.itemView.findViewById(R.id.cik);
        View viewFindViewById = this.itemView.findViewById(R.id.m6p);
        if (viewFindViewById != null) {
            C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 16);
        }
        C427690Gpr.LJ(this.itemView, 0.0f);
        View viewC6 = c6();
        if (viewC6 != null) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 76), viewC6);
        }
        View viewB6 = b6();
        if (viewB6 != null) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 77), viewB6);
        }
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 3));
        C03EB c03eb = this.LLILZ;
        if (c03eb != null) {
            C786410Ut5.la(c03eb, new ACListenerS153S0100000_18(this, 78));
        }
        C427660Gpo c427660Gpo = this.LLILLL;
        if (c427660Gpo != null) {
            C786410Ut5.T8(c427660Gpo, new ACListenerS153S0100000_18(this, 79));
        }
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS153S0100000_18(this, 80));
        }
        C1202300hOO c1202300hOO = this.LLJ;
        if (c1202300hOO != null) {
            if (C1209504oH.LIZ()) {
                c1202300hOO.setLineSpacing(C418440Gaw.LIZIZ(4), 1.0f);
            }
            C786410Ut5.ja(c1202300hOO, new ACListenerS153S0100000_18(this, 81));
            c1202300hOO.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 4));
        }
        this.LLLI = C297470BlJ.LIZ() ? C814420VxA.LIZIZ((((C0FV2.LIZIZ(getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) / 3.0f) : C814420VxA.LIZIZ(((C0FV2.LIZIZ(getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2)) / 3.0f);
        ViewGroup viewGroup = this.LLJILJILJ;
        if (viewGroup == null || (smartImageView = (SmartImageView) viewGroup.findViewById(R.id.tgn)) == null) {
            smartImageView = null;
        } else {
            int i3 = this.LLLI;
            C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams(i3, i3));
        }
        this.LLJJ = smartImageView;
        ViewGroup viewGroup2 = this.LLJILJILJ;
        if (viewGroup2 == null || (smartImageView2 = (SmartImageView) viewGroup2.findViewById(R.id.tgo)) == null) {
            smartImageView2 = null;
        } else {
            int i4 = this.LLLI;
            C786410Ut5.G6(smartImageView2, new LinearLayout.LayoutParams(i4, i4));
        }
        this.LLJJI = smartImageView2;
        ViewGroup viewGroup3 = this.LLJILJILJ;
        if (viewGroup3 == null || (smartImageView3 = (SmartImageView) viewGroup3.findViewById(R.id.tgp)) == null) {
            smartImageView3 = null;
        } else {
            int i5 = this.LLLI;
            C786410Ut5.G6(smartImageView3, new LinearLayout.LayoutParams(i5, i5));
        }
        this.LLJJIII = smartImageView3;
        SmartImageView smartImageView4 = this.LLJJ;
        if (smartImageView4 != null) {
            C786410Ut5.Q8(smartImageView4, this.LLLILZJ);
        }
        SmartImageView smartImageView5 = this.LLJJI;
        if (smartImageView5 != null) {
            C786410Ut5.Q8(smartImageView5, this.LLLILZJ);
        }
        SmartImageView smartImageView6 = this.LLJJIII;
        if (smartImageView6 != null) {
            C786410Ut5.Q8(smartImageView6, this.LLLILZJ);
        }
        SmartImageView smartImageView7 = this.LLJJ;
        if (smartImageView7 != null) {
            smartImageView7.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 0));
        }
        SmartImageView smartImageView8 = this.LLJJI;
        if (smartImageView8 != null) {
            smartImageView8.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 1));
        }
        SmartImageView smartImageView9 = this.LLJJIII;
        if (smartImageView9 != null) {
            smartImageView9.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 2));
        }
        this.LLJJIJI = this.itemView.findViewById(R.id.olm);
        this.LLJJIJIIJIL = (TuxTextView) this.itemView.findViewById(R.id.oll);
        View view = this.LLJJIJI;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 75), view);
        }
        TuxTextView tuxTextView2 = this.LLJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(2131846662);
        }
        if (C297470BlJ.LIZ()) {
            C427660Gpo c427660Gpo2 = this.LLILLL;
            if (c427660Gpo2 != null && (layoutParams2 = c427660Gpo2.getLayoutParams()) != null) {
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            }
            C03EB c03eb2 = this.LLILZ;
            if (c03eb2 != null && (layoutParams = c03eb2.getLayoutParams()) != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            }
            TuxTextView tuxTextView3 = this.LLILZIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setTuxFont(72);
            }
            TuxTextView tuxTextView4 = this.LLILZIL;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextColorRes(R.attr.a1j);
            }
            View view2 = this.LLLIIIL;
            if (view2 != null) {
                C1189060h32.LJJII(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 0, 0, 0);
            }
            SmartImageView smartImageView10 = this.LLLIILIL;
            if (smartImageView10 != null) {
                ViewGroup.LayoutParams layoutParams3 = smartImageView10.getLayoutParams();
                if ((layoutParams3 instanceof C19ME) && (c19me5 = (C19ME) layoutParams3) != null) {
                    ((ViewGroup.MarginLayoutParams) c19me5).width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    ((ViewGroup.MarginLayoutParams) c19me5).height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    c19me5.topToTop = R.id.mm_;
                    c19me5.bottomToBottom = R.id.mm_;
                    C786410Ut5.G6(smartImageView10, c19me5);
                }
            }
            C20742216Eq c20742216Eq = this.LLLIL;
            if (c20742216Eq != null) {
                c20742216Eq.setGuidelineBegin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)));
            }
            TextView textView = this.LLLIIL;
            if (textView != null) {
                textView.setTextSize(10.0f);
            }
            View view3 = this.LLILZLL;
            if (view3 != null) {
                C1189060h32.LJJII(view3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0);
            }
            C418460Gay c418460Gay = this.LLIZLLLIL;
            if (c418460Gay != null) {
                C1189060h32.LJJII(c418460Gay, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0);
            }
            C1202300hOO c1202300hOO2 = this.LLJ;
            if (c1202300hOO2 != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, this.itemView.getContext());
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    c1202300hOO2.setExpandActionColor(iIntValue);
                    c1202300hOO2.setCollapseActionColor(iIntValue);
                    c1202300hOO2.setExpandActionSize(41);
                    c1202300hOO2.setCollapseActionSize(41);
                }
                ViewGroup.LayoutParams layoutParams4 = c1202300hOO2.getLayoutParams();
                if ((layoutParams4 instanceof C19ME) && (c19me4 = (C19ME) layoutParams4) != null) {
                    ((ViewGroup.MarginLayoutParams) c19me4).width = 0;
                    c19me4.startToStart = R.id.p09;
                    ((ViewGroup.MarginLayoutParams) c19me4).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    C786410Ut5.k7(c1202300hOO2, c19me4);
                }
            }
            View view4 = this.LLJILJIL;
            if (view4 != null) {
                ViewGroup.LayoutParams layoutParams5 = view4.getLayoutParams();
                if ((layoutParams5 instanceof C19ME) && (c19me3 = (C19ME) layoutParams5) != null) {
                    ((ViewGroup.MarginLayoutParams) c19me3).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    c19me3.startToStart = R.id.p09;
                    C786410Ut5.W5(view4, c19me3);
                }
            }
            ViewGroup viewGroup4 = this.LLJILJILJ;
            if (viewGroup4 != null) {
                ViewGroup.LayoutParams layoutParams6 = viewGroup4.getLayoutParams();
                if ((layoutParams6 instanceof C19ME) && (c19me2 = (C19ME) layoutParams6) != null) {
                    ((ViewGroup.MarginLayoutParams) c19me2).width = 0;
                    ((ViewGroup.MarginLayoutParams) c19me2).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    c19me2.startToStart = R.id.p09;
                    c19me2.endToEnd = 0;
                    C786410Ut5.X5(c19me2, viewGroup4);
                }
            }
            ViewGroup viewGroup5 = this.LLJILLL;
            if (viewGroup5 != null) {
                viewGroup5.setPadding(0, 0, 0, 0);
            }
            SmartImageView smartImageView11 = this.LLJJ;
            if (smartImageView11 != null) {
                C1378990lzN.LIZIZ(smartImageView11, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
            }
            SmartImageView smartImageView12 = this.LLJJI;
            if (smartImageView12 != null) {
                C1378990lzN.LIZIZ(smartImageView12, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
            }
            SmartImageView smartImageView13 = this.LLJJIII;
            if (smartImageView13 != null) {
                C1378990lzN.LIZIZ(smartImageView13, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
            }
            View view5 = this.LLJJIJI;
            if (view5 != null) {
                ViewGroup.LayoutParams layoutParams7 = view5.getLayoutParams();
                if ((layoutParams7 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams7) != null) {
                    marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    C786410Ut5.W5(view5, marginLayoutParams);
                }
            }
            TuxTextView tuxTextView5 = this.LLJJIJIIJIL;
            if (tuxTextView5 != null) {
                tuxTextView5.setTextColorRes(R.attr.zi);
                tuxTextView5.setTuxFont(82);
            }
            View viewE6 = e6();
            if (viewE6 != null) {
                if ((viewE6 instanceof TuxIconView) && (tuxIconView = (TuxIconView) viewE6) != null) {
                    tuxIconView.setTintColorRes(R.attr.a1j);
                }
                ViewGroup.LayoutParams layoutParams8 = viewE6.getLayoutParams();
                if ((layoutParams8 instanceof C19ME) && (c19me = (C19ME) layoutParams8) != null) {
                    c19me.startToStart = R.id.p09;
                    C786410Ut5.W5(viewE6, c19me);
                }
            }
            TuxIconView tuxIconView2 = C1191340h6i.LIZIZ() ? this.LLJLLIL : this.LLJL;
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColorRes(R.attr.a1j);
            }
        }
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 449));
        if (C305400By6.LIZ == 1) {
            C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 450));
        }
    }

    public final void u6() {
        C1397580mTM c1397580mTM = new C1397580mTM(this.itemView.getContext());
        c1397580mTM.LIZIZ(this.itemView.getContext().getResources().getString(2131844853));
        C985403tE.LIZ(c1397580mTM, new AwS597S0100000_18(this, 746));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final boolean T5() {
        return !C1190820h5s.LJFF(getItem()) || C1190820h5s.LJII(getItem());
    }

    public final View b6() {
        return !C1191350h6j.LIZ() ? this.LLJJJJJIL : this.LLJLL;
    }

    public final View c6() {
        return C1191340h6i.LIZIZ() ? this.LLJZ : this.LLJLILLLLZIIL;
    }

    public final TuxTextView d6() {
        return C1191340h6i.LIZIZ() ? this.LLJLLL : this.LLJJLIIIJLLLLLLLZ;
    }

    public final View e6() {
        return C1191340h6i.LIZIZ() ? this.LLJZIJLIL : this.LLJJL;
    }

    public final boolean v6() {
        return !T5();
    }

    public final void I5(boolean z) {
        int i;
        C19ME c19me;
        C19ME c19me2;
        C19ME c19me3;
        if (z) {
            i = R.id.f831xtc;
        } else {
            i = R.id.bh2;
        }
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me3 = (C19ME) layoutParams) != null) {
                c19me3.startToEnd = i;
                C786410Ut5.R6(tuxTextView, c19me3);
            }
        }
        View view = this.LLILZLL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (c19me2 = (C19ME) layoutParams2) != null) {
                c19me2.startToEnd = i;
                C786410Ut5.W5(view, c19me2);
            }
        }
        C1202300hOO c1202300hOO = this.LLJ;
        if (c1202300hOO != null) {
            ViewGroup.LayoutParams layoutParams3 = c1202300hOO.getLayoutParams();
            if ((layoutParams3 instanceof C19ME) && (c19me = (C19ME) layoutParams3) != null) {
                c19me.topToBottom = i;
                C786410Ut5.k7(c1202300hOO, c19me);
            }
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

    /* JADX WARN: Removed duplicated region for block: B:159:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0780  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: X5, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi.PoiReviewModel r26) {
        /*
            Method dump skipped, instruction units count: 2158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiDetailReviewListItemCell.onBindItemView(com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi$PoiReviewModel):void");
    }

    public final void f6(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        List<PoiReviewsApi.ImageDataModel> list;
        int size;
        List<PoiReviewsApi.ImageDataModel> list2;
        SmartImageView smartImageView;
        UrlModel urlModel;
        int iIntValue;
        ViewGroup viewGroup = this.LLJILJILJ;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        SmartImageView smartImageView2 = this.LLJJ;
        if (smartImageView2 != null) {
            C786410Ut5.LLFF(8, smartImageView2);
        }
        SmartImageView smartImageView3 = this.LLJJI;
        if (smartImageView3 != null) {
            C786410Ut5.LLFF(8, smartImageView3);
        }
        SmartImageView smartImageView4 = this.LLJJIII;
        if (smartImageView4 != null) {
            C786410Ut5.LLFF(8, smartImageView4);
        }
        PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
        if (content != null && (list2 = content.images) != null) {
            int i = 1;
            if (!list2.isEmpty()) {
                ViewGroup viewGroup2 = this.LLJILJILJ;
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
                                        smartImageView = this.LLJJIII;
                                    } else {
                                        i2 = i3;
                                        i = 1;
                                    }
                                } else {
                                    smartImageView = this.LLJJI;
                                }
                            } else {
                                smartImageView = this.LLJJ;
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
            TuxTextView tuxTextView = this.LLJJIJIIJIL;
            if (tuxTextView != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('+');
                sbLIZ.append(size);
                tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            View view = this.LLJJIJI;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        View view2 = this.LLJJIJI;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view2);
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

    public final void q6(boolean z) {
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
        int iL5 = L5();
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
        if (L5() == 1 && (poiReviewModel = this.LLLIIIIL) != null && N5(poiReviewModel)) {
            i2 = 1;
        }
        Integer numValueOf = Integer.valueOf(i2);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLLIIIIL;
        if (poiReviewModel2 != null && (status = poiReviewModel2.getStatus()) != null) {
            num = status.status;
        } else {
            num = null;
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLLIIIIL;
        if (poiReviewModel3 != null) {
            verifiedDisplay = poiReviewModel3.getVerifiedDisplay();
        }
        PageFinder pageFinderR5 = R5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJIILJJIL(fLIZIZ, zLIZ ? 1 : 0, iL5, iLongValue, size, length, value, i, pageFinderR5, interfaceC665370Q7zLJFF, numValueOf, num, strLJJLIIIJJI, reviewId, str, poiId, str6, str3, logId, str4, strYy, strO32, verifiedDisplay, z);
    }

    public final void r6(boolean z) {
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
        int iL5 = L5();
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
        if (L5() == 1 && (poiReviewModel = this.LLLIIIIL) != null && N5(poiReviewModel)) {
            i2 = 1;
        }
        Integer numValueOf = Integer.valueOf(i2);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLLIIIIL;
        if (poiReviewModel2 != null && (status = poiReviewModel2.getStatus()) != null) {
            num = status.status;
        } else {
            num = null;
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLLIIIIL;
        if (poiReviewModel3 != null) {
            verifiedDisplay = poiReviewModel3.getVerifiedDisplay();
        }
        PageFinder pageFinderR5 = R5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJIILIIL(fLIZIZ, zLIZ ? 1 : 0, iL5, iLongValue, size, length, value, i, pageFinderR5, interfaceC665370Q7zLJFF, numValueOf, num, strLJJLIIIJJI, reviewId, str, poiId, str6, str3, logId, str4, strYy, strO32, verifiedDisplay, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w6(com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi.PoiReviewModel r5) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiDetailReviewListItemCell.w6(com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi$PoiReviewModel):void");
    }

    public final void W5(View view, PoiReviewsApi.PoiReviewModel poiReviewModel) {
        String str;
        View view2;
        PoiReviewsApi.PoiUserReviewModel poiUserReviewModel;
        String strLJJLIIIJJI;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        if (!T5() || poiReviewModel == null) {
            return;
        }
        PoiReviewsApi.PoiReviewUserModel author = poiReviewModel.getAuthor();
        Context context = null;
        String strLJJLIIIJJI2 = null;
        if (author != null && (poiUserReviewModel = author.userReviewProfileFrame) != null && poiUserReviewModel.badgeUrl != null) {
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            InterfaceC1191710h7J interfaceC1191710h7J = this.LL;
            if (interfaceC1191710h7J != null) {
                strLJJLIIIJJI = interfaceC1191710h7J.LJJLIIIJJI();
            } else {
                strLJJLIIIJJI = null;
            }
            String poiId = poiReviewModel.getPoiId();
            String reviewId = poiReviewModel.getReviewId();
            String str2 = poiReviewModel.getAuthor().userId;
            Integer num = poiReviewModel.getAuthor().userReviewProfileFrame.badgeLevel;
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
            if (fragmentLJIIJ != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            } else {
                interfaceC665370Q7zLJFF = null;
            }
            PageFinder pageFinderR5 = R5();
            c1191160h6Q.getClass();
            C1191160h6Q.LJFF(pageFinderR5, interfaceC665370Q7zLJFF, num, strLJJLIIIJJI, poiId, reviewId, str2);
        }
        if (poiReviewModel.isAnonymous()) {
            InterfaceC1191710h7J interfaceC1191710h7J2 = this.LL;
            if (interfaceC1191710h7J2 != null) {
                interfaceC1191710h7J2.D00();
                return;
            }
            return;
        }
        PoiReviewsApi.PoiReviewUserModel author2 = poiReviewModel.getAuthor();
        if (author2 != null && Intrinsics.LJFF(author2.redirectReviewCenter, Boolean.TRUE)) {
            Application applicationLIZ = C1202420hOa.LIZ();
            InterfaceC1191710h7J interfaceC1191710h7J3 = this.LL;
            if (interfaceC1191710h7J3 != null) {
                strLJJLIIIJJI2 = interfaceC1191710h7J3.LJJLIIIJJI();
            }
            String poiId2 = poiReviewModel.getPoiId();
            String str3 = poiReviewModel.getAuthor().userId;
            if (v6()) {
                view2 = this.LLILZ;
            } else {
                view2 = this.LLILLL;
            }
            U5("click_head", applicationLIZ, strLJJLIIIJJI2, poiId2, str3, view2);
            return;
        }
        PoiReviewsApi.PoiReviewUserModel author3 = poiReviewModel.getAuthor();
        if (author3 != null) {
            str = author3.userId;
        } else {
            str = null;
        }
        if (view != null) {
            context = view.getContext();
        }
        S5(context, "click_review_head", str, poiReviewModel.getReviewId());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl;
        if (list.isEmpty()) {
            onBindItemView(poiReviewModel);
        } else if (ListProtector.get(list, 0) instanceof C1190010h4Z) {
            w6(poiReviewModel);
        } else {
            onBindItemView(poiReviewModel);
        }
    }

    public final void S5(Context context, String str, String str2, String str3) {
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
            PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLLIIIIL;
            if (poiReviewModel != null) {
                verifiedDisplay = poiReviewModel.getVerifiedDisplay();
            }
            PageFinder pageFinderVia = PageFinder.via(this);
            c1191160h6Q.getClass();
            C1191160h6Q.LJIIZILJ(strLJJLIIIJJI, str, str2, str3, logId, source, strZZ1, strYy, str4, strO32, interfaceC665370Q7zLJFF, verifiedDisplay, pageFinderVia);
        }
    }

    public final void U5(String str, final Context context, String str2, String str3, String str4, View view) {
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
        PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLLIIIIL;
        if (poiReviewModel == null || (poiId = poiReviewModel.getPoiId()) == null) {
            poiId = "";
        }
        sparkContext2.LJJJZ("poi_id", poiId);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLLIIIIL;
        if (poiReviewModel2 != null && (reviewId = poiReviewModel2.getReviewId()) != null) {
            str5 = reviewId;
        }
        sparkContext2.LJJJZ("review_id", str5);
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLLIIIIL;
        if (poiReviewModel3 != null) {
            verifiedDisplay = poiReviewModel3.getVerifiedDisplay();
        } else {
            verifiedDisplay = null;
        }
        if (C123100dR.LIZ(verifiedDisplay) && verifiedDisplay != null) {
            sparkContext2.LJJJZ("review_tags", verifiedDisplay);
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel4 = this.LLLIIIIL;
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
        sparkContext2.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0h7X
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
        sparkContext2.LJJJJZI(new C1209100hZM(view, 0));
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext2).LIZIZ();
    }
}
