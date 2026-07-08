package com.ss.android.ugc.aweme.poi.reviews.landing.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03EB;
import X.C03IJ;
import X.C03K6;
import X.C098200Yq;
import X.C0FV2;
import X.C0XQ7;
import X.C1175120ggY;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1181430gqj;
import X.C1182380gsG;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1189590h3t;
import X.C1190690h5f;
import X.C1190820h5s;
import X.C1191120h6M;
import X.C1191150h6P;
import X.C1191160h6Q;
import X.C1191350h6j;
import X.C1202300hOO;
import X.C1203280hPy;
import X.C1209100hZM;
import X.C1209504oH;
import X.C123100dR;
import X.C1247510iZJ;
import X.C1308910kAL;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1378990lzN;
import X.C1388190mED;
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
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C19M4;
import X.C19ME;
import X.C1EDK;
import X.C20742216Eq;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C2365509Or;
import X.C297470BlJ;
import X.C339180DRk;
import X.C339190DRl;
import X.C418440Gaw;
import X.C418460Gay;
import X.C419910GdJ;
import X.C427660Gpo;
import X.C438710HIf;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C848230XPh;
import X.C985403tE;
import X.EnumC1177490gkN;
import X.EnumC1190240h4w;
import X.EnumC1203020hPY;
import X.InterfaceC1191710h7J;
import X.InterfaceC1542790qFZ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewOnLongClickListenerC1208780hYq;
import Y.ACListenerS121S0200000_18;
import Y.ACListenerS153S0100000_18;
import Y.ALAdapterS13S0200000_18;
import Y.AUListenerS267S0100000_18;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsListItemCell extends PowerCell<PoiReviewsApi.PoiReviewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public final AssemVMLazy LL;
    public C1190690h5f LLILLJJLI;
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
    public TuxIconView LLJJIJIL;
    public TuxTextView LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public C1189590h3t LLJLIL;
    public ConstraintLayout LLJLILLLLZIIL;
    public SmartImageView LLJLL;
    public int LLJLLIL;
    public final boolean LLJLLL;
    public long LLJZ;
    public PoiReviewsApi.PoiReviewModel LLJZIJLIL;
    public View LLL;
    public TextView LLLF;
    public SmartImageView LLLFF;
    public C20742216Eq LLLFFI;
    public C19M4 LLLFZ;
    public View LLLI;
    public TuxIconView LLLII;
    public final C01GW LLLIIII;
    public final ACListenerS153S0100000_18 LLLIIIIL;
    public boolean LLLIIIL;

    public interface PoiReviewCellVAbility extends InterfaceC494301wD {
        C1190690h5f G1();

        UrlModel nj0();

        InterfaceC1191710h7J r0();

        PoiReviewsApi.PoiReviewDisclaimer si0();
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiReviewsListItemCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/reviews/landing/viewmodel/PoiReviewsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final int r6(int i) {
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

    public PoiReviewsListItemCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiReviewsListViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1772);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(576);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1783), awS562S0100000_18, AFwS206S0000000_18.get$arr$(468), new AwS562S0100000_18((C03K6) this, 1785), new AwS562S0100000_18((C03K6) this, 1787), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1789), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1791), null, new AwS562S0100000_18((C03K6) this, 1792));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 1786);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1788);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 1790);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 90));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 1793);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 1794);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 1768);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 1769);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 1770);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1771), awS562S0100000_18, AFwS206S0000000_18.get$arr$(466), new AwS562S0100000_18((C03K6) this, 1773), new AwS562S0100000_18((C03K6) this, 1774), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1775), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1776), null, new AwS562S0100000_18((C03K6) this, 1777));
        } else {
            if (!Intrinsics.LJFF(obj, obj)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1778), awS562S0100000_18, AFwS206S0000000_18.get$arr$(467), new AwS562S0100000_18((C03K6) this, 1779), new AwS562S0100000_18((C03K6) this, 1780), new AwS562S0100000_18((C03K6) this, 1781), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 1782));
        }
        this.LL = assemVMLazy;
        this.LLJLLL = C1191350h6j.LIZ();
        this.LLJZ = System.currentTimeMillis();
        this.LLLIIII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1784));
        this.LLLIIIIL = new ACListenerS153S0100000_18(this, 88);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList<com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData> R5() {
        /*
            r11 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJ
            r4 = 1
            r3 = 0
            if (r2 == 0) goto L39
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L39
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJ
            if (r2 == 0) goto L1b
            r2.getLocationOnScreen(r0)
        L1b:
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
        L39:
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJI
            if (r2 == 0) goto L68
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L68
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJI
            if (r2 == 0) goto L4a
            r2.getLocationOnScreen(r0)
        L4a:
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJI
            if (r2 == 0) goto L97
            int r6 = r2.getWidth()
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJI
            if (r2 == 0) goto L97
            int r7 = r2.getHeight()
            r8 = r0[r3]
            r9 = r0[r4]
            r10 = 240(0xf0, float:3.36E-43)
            com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData r5 = new com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData
            r5.<init>(r6, r7, r8, r9, r10)
            r1.add(r5)
        L68:
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJIII
            if (r2 == 0) goto L97
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L97
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJIII
            if (r2 == 0) goto L79
            r2.getLocationOnScreen(r0)
        L79:
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJIII
            if (r2 == 0) goto L97
            int r5 = r2.getWidth()
            com.bytedance.lighten.loader.SmartImageView r2 = r11.LLJJIII
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell.R5():java.util.ArrayList");
    }

    public final PageFinder S5() {
        return (PageFinder) this.LLLIIII.getValue();
    }

    public final PoiReviewsListViewModel T5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIL;
        return (PoiReviewsListViewModel) assemVMLazy.getValue();
    }

    public final void X5() {
        C339180DRk c339180DRk = C339180DRk.LIZ;
        TuxTextView tuxTextView = this.LLJL;
        TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
        PoiReviewsApi.PoiReviewModel item = getItem();
        String verifiedDisplay = item != null ? item.getVerifiedDisplay() : null;
        c339180DRk.getClass();
        C339180DRk.LIZ(tuxTextView2, tuxTextView, verifiedDisplay);
    }

    public final void b6() {
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String strXq1 = T5().Xq1();
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        C1185430gxB.LJJIJL(c1185430gxB, strXq1, "click", fragmentLJIIJ != null ? C1558360qeg.LJFF(fragmentLJIIJ, null) : null, "poi_secondary_reviews_page", "poi_review", PageFinder.via(C1189060h32.LJIIJ(this)));
    }

    public final void c6() {
        C1247510iZJ c1247510iZJ;
        C1247510iZJ c1247510iZJ2;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
        FragmentManager supportFragmentManager = c19egLIZIZ != null ? c19egLIZIZ.getSupportFragmentManager() : null;
        PoiReviewsApi.PoiReviewModel item = getItem();
        if (item == null) {
            return;
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        if (P5(item)) {
            C1247510iZJ[] c1247510iZJArr = new C1247510iZJ[2];
            if (item.getWantTranslate()) {
                c1247510iZJ2 = new C1247510iZJ();
                c1247510iZJ2.LIZIZ(R.string.suj);
                c1247510iZJ2.LIZ(new AwS384S0200000_18(item, this, 140));
            } else {
                c1247510iZJ2 = new C1247510iZJ();
                c1247510iZJ2.LIZIZ(2131850744);
                c1247510iZJ2.LIZ(new AwS384S0200000_18(item, this, 139));
            }
            c1247510iZJArr[0] = c1247510iZJ2;
            C1247510iZJ c1247510iZJ3 = new C1247510iZJ();
            c1247510iZJ3.LIZIZ(2131829536);
            c1247510iZJ3.LIZ(new AwS384S0200000_18(item, this, 141));
            c1247510iZJArr[1] = c1247510iZJ3;
            List listLJIILJJIL = C1697810uHb.LJIILJJIL(c1247510iZJArr);
            C1190690h5f c1190690h5f = this.LLILLJJLI;
            if (c1190690h5f != null && c1190690h5f.LIZ) {
                C1247510iZJ c1247510iZJ4 = new C1247510iZJ();
                c1247510iZJ4.LIZIZ(R.string.gm7);
                c1247510iZJ4.LIZJ = 1;
                c1247510iZJ4.LIZ(new AwS597S0100000_18(this, 460));
                listLJIILJJIL.add(c1247510iZJ4);
            }
            c1390850mIV.LJI(listLJIILJJIL);
        } else {
            if (item.getWantTranslate()) {
                c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZIZ(R.string.suj);
                c1247510iZJ.LIZ(new AwS384S0200000_18(item, this, 145));
            } else {
                c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZIZ(2131850744);
                c1247510iZJ.LIZ(new AwS384S0200000_18(item, this, 144));
            }
            C1247510iZJ c1247510iZJ5 = new C1247510iZJ();
            c1247510iZJ5.LIZIZ(2131836352);
            c1247510iZJ5.LIZ(new AwS384S0200000_18(item, this, 143));
            C1247510iZJ c1247510iZJ6 = new C1247510iZJ();
            c1247510iZJ6.LIZIZ(2131836352);
            c1247510iZJ6.LIZ(new AwS384S0200000_18(item, this, 142));
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

    public final void e6() {
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
        PoiReviewsApi.PoiReviewUserModel author2;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        T5();
        PoiReviewsApi.PoiReviewModel item = getItem();
        String reviewId = item != null ? item.getReviewId() : null;
        if (reviewId == null) {
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
        String strZZ1 = T5().ZZ1();
        if (strZZ1 == null) {
            strZZ1 = "";
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
        String str3 = (item9 == null || (author = item9.getAuthor()) == null) ? null : author.reviewUserSource;
        PoiReviewsApi.PoiReviewModel item10 = getItem();
        int value = (item10 == null || (source = item10.getSource()) == null) ? EnumC1190240h4w.PoiReviewSource_TikTok.getValue() : source.intValue();
        String logId = T5().getLogId();
        PoiReviewsApi.PoiReviewModel item11 = getItem();
        String str4 = (item11 == null || (content = item11.getContent()) == null) ? null : content.textLang;
        PoiReviewsApi.PoiReviewModel item12 = getItem();
        boolean wantTranslate = item12 != null ? item12.getWantTranslate() : false;
        String strYy = T5().yy();
        T5();
        PoiReviewsApi.PoiReviewModel item13 = getItem();
        int i = 1;
        int i2 = (item13 == null || !item13.isAnonymous()) ? 0 : 1;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = fragmentLJIIJ != null ? C1558360qeg.LJFF(fragmentLJIIJ, null) : null;
        if (L5() != 1 || (poiReviewModel = this.LLJZIJLIL) == null || !P5(poiReviewModel)) {
            T5();
            i = 0;
        }
        Integer numValueOf2 = Integer.valueOf(i);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLJZIJLIL;
        Integer num = (poiReviewModel2 == null || (status = poiReviewModel2.getStatus()) == null) ? null : status.status;
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLJZIJLIL;
        String verifiedDisplay = poiReviewModel3 != null ? poiReviewModel3.getVerifiedDisplay() : null;
        PageFinder pageFinderS5 = S5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJIIJ("poi_reviews", "review", reviewId, str, poiId, strZZ1, fLIZIZ, zLIZ ? 1 : 0, numValueOf, iLongValue, size, length, str3, value, logId, str4, wantTranslate, strYy, null, "reviews_button", i2, interfaceC665370Q7zLJFF, numValueOf2, num, verifiedDisplay, pageFinderS5);
        b6();
    }

    public final void f6() {
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
        PoiReviewsApi.PoiReviewUserModel author2;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        T5();
        PoiReviewsApi.PoiReviewModel item = getItem();
        String reviewId = item != null ? item.getReviewId() : null;
        if (reviewId == null) {
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
        String strZZ1 = T5().ZZ1();
        if (strZZ1 == null) {
            strZZ1 = "";
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
        String str3 = (item9 == null || (author = item9.getAuthor()) == null) ? null : author.reviewUserSource;
        PoiReviewsApi.PoiReviewModel item10 = getItem();
        int value = (item10 == null || (source = item10.getSource()) == null) ? EnumC1190240h4w.PoiReviewSource_TikTok.getValue() : source.intValue();
        String logId = T5().getLogId();
        PoiReviewsApi.PoiReviewModel item11 = getItem();
        String str4 = (item11 == null || (content = item11.getContent()) == null) ? null : content.textLang;
        PoiReviewsApi.PoiReviewModel item12 = getItem();
        boolean wantTranslate = item12 != null ? item12.getWantTranslate() : false;
        String strYy = T5().yy();
        T5();
        PoiReviewsApi.PoiReviewModel item13 = getItem();
        int i = (item13 == null || !item13.isAnonymous()) ? 0 : 1;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = fragmentLJIIJ != null ? C1558360qeg.LJFF(fragmentLJIIJ, null) : null;
        PoiReviewsApi.PoiReviewModel item14 = getItem();
        String verifiedDisplay = item14 != null ? item14.getVerifiedDisplay() : null;
        PageFinder pageFinderS5 = S5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJII("poi_reviews", reviewId, str, poiId, strZZ1, fLIZIZ, zLIZ ? 1 : 0, iL5, iLongValue, size, length, str3, value, logId, str4, wantTranslate, strYy, null, i, interfaceC665370Q7zLJFF, verifiedDisplay, pageFinderS5);
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
        ViewGroup.LayoutParams layoutParams2;
        PoiReviewCellVAbility poiReviewCellVAbility;
        super.onItemViewCreated();
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
        this.LLJJJJJIL = (TuxTextView) this.itemView.findViewById(R.id.ffv);
        this.LLJLL = (SmartImageView) this.itemView.findViewById(R.id.bpv);
        this.LLJJJIL = this.itemView.findViewById(R.id.mnd);
        this.LLJJIJIL = (TuxIconView) this.itemView.findViewById(R.id.mnv);
        this.LLJJJ = (TuxTextView) this.itemView.findViewById(R.id.mnh);
        this.LLJJJJ = this.itemView.findViewById(R.id.cpg);
        this.LLJJJJLIIL = (TuxTextView) this.itemView.findViewById(R.id.g39);
        this.LLJJL = (TuxTextView) this.itemView.findViewById(R.id.f707g3a);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) this.itemView.findViewById(R.id.g3b);
        this.LLJL = (TuxTextView) this.itemView.findViewById(R.id.verified_display);
        this.LLJLIL = (C1189590h3t) this.itemView.findViewById(R.id.cik);
        this.LLL = this.itemView.findViewById(R.id.thg);
        this.LLLF = (TextView) this.itemView.findViewById(R.id.mm_);
        this.LLLFF = (SmartImageView) this.itemView.findViewById(R.id.mm8);
        this.LLLFFI = (C20742216Eq) this.itemView.findViewById(R.id.jeq);
        this.LLJLILLLLZIIL = (ConstraintLayout) this.itemView.findViewById(R.id.m6p);
        this.LLLFZ = (C19M4) this.itemView.findViewById(R.id.ths);
        this.LLLI = this.itemView.findViewById(R.id.tht);
        this.LLLII = (TuxIconView) this.itemView.findViewById(R.id.cpi);
        this.LLILLJJLI = new C1190690h5f();
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null && (poiReviewCellVAbility = (PoiReviewCellVAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiReviewCellVAbility.class, null)) != null) {
            this.LLILLJJLI = poiReviewCellVAbility.G1();
        }
        this.LLJLLIL = C297470BlJ.LIZ() ? C814420VxA.LIZIZ((((C0FV2.LIZIZ(getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) / 3.0f) : C814420VxA.LIZIZ(((C0FV2.LIZIZ(getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2)) / 3.0f);
        ViewGroup viewGroup = this.LLJILJILJ;
        if (viewGroup != null) {
            smartImageView = (SmartImageView) viewGroup.findViewById(R.id.tgn);
            if (smartImageView != null) {
                int i = this.LLJLLIL;
                C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams(i, i));
            }
        } else {
            smartImageView = null;
        }
        this.LLJJ = smartImageView;
        ViewGroup viewGroup2 = this.LLJILJILJ;
        if (viewGroup2 != null) {
            smartImageView2 = (SmartImageView) viewGroup2.findViewById(R.id.tgo);
            if (smartImageView2 != null) {
                int i2 = this.LLJLLIL;
                C786410Ut5.G6(smartImageView2, new LinearLayout.LayoutParams(i2, i2));
            }
        } else {
            smartImageView2 = null;
        }
        this.LLJJI = smartImageView2;
        ViewGroup viewGroup3 = this.LLJILJILJ;
        if (viewGroup3 != null) {
            smartImageView3 = (SmartImageView) viewGroup3.findViewById(R.id.tgp);
            if (smartImageView3 != null) {
                int i3 = this.LLJLLIL;
                C786410Ut5.G6(smartImageView3, new LinearLayout.LayoutParams(i3, i3));
            }
        } else {
            smartImageView3 = null;
        }
        this.LLJJIII = smartImageView3;
        SmartImageView smartImageView4 = this.LLJJ;
        if (smartImageView4 != null) {
            C786410Ut5.Q8(smartImageView4, this.LLLIIIIL);
        }
        SmartImageView smartImageView5 = this.LLJJI;
        if (smartImageView5 != null) {
            C786410Ut5.Q8(smartImageView5, this.LLLIIIIL);
        }
        SmartImageView smartImageView6 = this.LLJJIII;
        if (smartImageView6 != null) {
            C786410Ut5.Q8(smartImageView6, this.LLLIIIIL);
        }
        SmartImageView smartImageView7 = this.LLJJ;
        if (smartImageView7 != null) {
            smartImageView7.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 11));
        }
        SmartImageView smartImageView8 = this.LLJJI;
        if (smartImageView8 != null) {
            smartImageView8.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 12));
        }
        SmartImageView smartImageView9 = this.LLJJIII;
        if (smartImageView9 != null) {
            smartImageView9.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 13));
        }
        this.LLJJIJI = this.itemView.findViewById(R.id.olm);
        this.LLJJIJIIJIL = (TuxTextView) this.itemView.findViewById(R.id.oll);
        View view = this.LLJJIJI;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 89), view);
        }
        TuxTextView tuxTextView = this.LLJI;
        if (tuxTextView != null) {
            tuxTextView.setText(2131846662);
        }
        if (C297470BlJ.LIZ()) {
            C427660Gpo c427660Gpo = this.LLILLL;
            if (c427660Gpo != null && (layoutParams2 = c427660Gpo.getLayoutParams()) != null) {
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            }
            C03EB c03eb = this.LLILZ;
            if (c03eb != null && (layoutParams = c03eb.getLayoutParams()) != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            }
            TuxTextView tuxTextView2 = this.LLILZIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setTuxFont(72);
            }
            TuxTextView tuxTextView3 = this.LLILZIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setTextColorRes(R.attr.a1j);
            }
            View view2 = this.LLL;
            if (view2 != null) {
                C1189060h32.LJJII(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 0, 0, 0);
            }
            SmartImageView smartImageView10 = this.LLLFF;
            if (smartImageView10 != null) {
                ViewGroup.LayoutParams layoutParams3 = smartImageView10.getLayoutParams();
                if ((layoutParams3 instanceof C19ME) && (c19me6 = (C19ME) layoutParams3) != null) {
                    ((ViewGroup.MarginLayoutParams) c19me6).width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    ((ViewGroup.MarginLayoutParams) c19me6).height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    c19me6.topToTop = R.id.mm_;
                    c19me6.bottomToBottom = R.id.mm_;
                    C786410Ut5.G6(smartImageView10, c19me6);
                }
            }
            C20742216Eq c20742216Eq = this.LLLFFI;
            if (c20742216Eq != null) {
                c20742216Eq.setGuidelineBegin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)));
            }
            TextView textView = this.LLLF;
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
            C1202300hOO c1202300hOO = this.LLJ;
            if (c1202300hOO != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, this.itemView.getContext());
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    c1202300hOO.setExpandActionColor(iIntValue);
                    c1202300hOO.setCollapseActionColor(iIntValue);
                    c1202300hOO.setExpandActionSize(41);
                    c1202300hOO.setCollapseActionSize(41);
                }
                ViewGroup.LayoutParams layoutParams4 = c1202300hOO.getLayoutParams();
                if ((layoutParams4 instanceof C19ME) && (c19me5 = (C19ME) layoutParams4) != null) {
                    ((ViewGroup.MarginLayoutParams) c19me5).width = 0;
                    c19me5.startToStart = R.id.p09;
                    ((ViewGroup.MarginLayoutParams) c19me5).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    C786410Ut5.k7(c1202300hOO, c19me5);
                }
            }
            View view4 = this.LLJILJIL;
            if (view4 != null) {
                ViewGroup.LayoutParams layoutParams5 = view4.getLayoutParams();
                if ((layoutParams5 instanceof C19ME) && (c19me4 = (C19ME) layoutParams5) != null) {
                    ((ViewGroup.MarginLayoutParams) c19me4).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    c19me4.startToStart = R.id.p09;
                    C786410Ut5.W5(view4, c19me4);
                }
            }
            ViewGroup viewGroup4 = this.LLJILJILJ;
            if (viewGroup4 != null) {
                ViewGroup.LayoutParams layoutParams6 = viewGroup4.getLayoutParams();
                if ((layoutParams6 instanceof C19ME) && (c19me3 = (C19ME) layoutParams6) != null) {
                    ((ViewGroup.MarginLayoutParams) c19me3).width = 0;
                    ((ViewGroup.MarginLayoutParams) c19me3).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    c19me3.startToStart = R.id.p09;
                    c19me3.endToEnd = 0;
                    C786410Ut5.X5(c19me3, viewGroup4);
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
            TuxTextView tuxTextView4 = this.LLJJIJIIJIL;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextColorRes(R.attr.zi);
                tuxTextView4.setTuxFont(82);
            }
            View view6 = this.LLJJJJ;
            if (view6 != null) {
                if ((view6 instanceof TuxIconView) && (tuxIconView = (TuxIconView) view6) != null) {
                    tuxIconView.setTintColorRes(R.attr.a1j);
                }
                ViewGroup.LayoutParams layoutParams8 = view6.getLayoutParams();
                if ((layoutParams8 instanceof C19ME) && (c19me2 = (C19ME) layoutParams8) != null) {
                    c19me2.startToStart = R.id.p09;
                    C786410Ut5.W5(view6, c19me2);
                }
            }
            View view7 = this.LLJJJIL;
            if (view7 != null) {
                C1189060h32.LJJII(view7, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, 0);
            }
            TuxIconView tuxIconView2 = this.LLJJIJIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColorRes(R.attr.a1j);
            }
            View view8 = this.LLLI;
            if (view8 != null) {
                C1189060h32.LJJII(view8, 0, 0, 0, 0);
                ViewGroup.LayoutParams layoutParams9 = view8.getLayoutParams();
                if ((layoutParams9 instanceof C19ME) && (c19me = (C19ME) layoutParams9) != null) {
                    c19me.startToStart = R.id.p09;
                    c19me.endToStart = R.id.cpg;
                    C786410Ut5.W5(view8, c19me);
                }
            }
        }
        C1202300hOO c1202300hOO2 = this.LLJ;
        if (c1202300hOO2 != null && C1209504oH.LIZ()) {
            c1202300hOO2.setLineSpacing(C418440Gaw.LIZIZ(4), 1.0f);
        }
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 459));
        C19M4 c19m4 = this.LLLFZ;
        if (c19m4 != null) {
            C2211631BhB.LJ(c19m4, new AwS597S0100000_18(this, 458));
        }
    }

    public final void u6() {
        C1397580mTM c1397580mTM = new C1397580mTM(this.itemView.getContext());
        c1397580mTM.LIZIZ(this.itemView.getContext().getResources().getString(2131844853));
        C985403tE.LIZ(c1397580mTM, new AwS597S0100000_18(this, 744));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final int L5() {
        T5();
        return getBindingAdapterPosition() + 1;
    }

    public final void W5() {
        if (C1190820h5s.LJ(getItem())) {
            C1203280hPy c1203280hPy = this.LLIZ;
            if (c1203280hPy != null) {
                c1203280hPy.setActiveColorInt(ColorProtector.parseColor("#ED742E"));
            }
            PoiReviewsApi.PoiReviewModel item = getItem();
            if (item == null || !C1190820h5s.LJ(item)) {
                return;
            }
            PoiReviewsApi.PoiReviewUserModel author = item.getAuthor();
            if (C123100dR.LIZ(author != null ? author.externalUrl : null)) {
                AwS419S0200000_18 awS419S0200000_18 = new AwS419S0200000_18(item, this, 92);
                C03EB c03eb = this.LLILZ;
                if (c03eb != null) {
                    C786410Ut5.I7(new AkS87S0100000_18(awS419S0200000_18, 60), c03eb);
                }
            }
        }
    }

    public final boolean v6() {
        if (!C1190820h5s.LJFF(getItem()) || C1190820h5s.LJII(getItem())) {
            return false;
        }
        PoiReviewsApi.PoiReviewModel item = getItem();
        return item == null || !Intrinsics.LJFF(item.isLocalAdded(), Boolean.TRUE);
    }

    public final void w6() {
        Context context;
        int i;
        PoiReviewsApi.PoiReviewModel item = getItem();
        if (item == null) {
            return;
        }
        CharSequence text = null;
        if (C1EDK.LIZIZ()) {
            PoiReviewsApi.PoiReviewContentModel content = item.getContent();
            if (C123100dR.LIZ(content != null ? content.translatedContent : null)) {
                C339190DRl.LIZLLL(this.LLJILJIL);
                T5().Ez1(item, !item.getWantTranslate());
                this.LLLIIIL = true;
            } else {
                C339190DRl.LIZIZ(this.LLJILJIL);
            }
        }
        View view = this.LLJILJIL;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS121S0200000_18(item, this, 25), view);
        }
        TuxIconView tuxIconView = this.LLJIJIL;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = item.getWantTranslate() ? R.raw.icon_languages_tick : R.raw.icon_languages;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        TuxTextView tuxTextView = this.LLJI;
        if (tuxTextView != null) {
            if (item.getWantTranslate()) {
                context = getContext();
                if (context != null) {
                    i = 2131846662;
                    text = context.getText(i);
                }
            } else {
                context = getContext();
                if (context != null) {
                    i = 2131846663;
                    text = context.getText(i);
                }
            }
            tuxTextView.setText(text);
        }
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

    public final void N5(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        C19ME c19me;
        C19ME c19me2;
        C19ME c19me3;
        C19ME c19me4;
        View view;
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
                View view2 = this.LLJJJIL;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof C19ME) && (c19me6 = (C19ME) layoutParams) != null) {
                        c19me6.topToTop = -1;
                        c19me6.topToBottom = R.id.kc4;
                        c19me6.endToEnd = 0;
                        ((ViewGroup.MarginLayoutParams) c19me6).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        C786410Ut5.W5(view2, c19me6);
                    }
                }
                View view3 = this.LLJJJJ;
                if (view3 != null) {
                    C1189060h32.LJJII(view3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), 0);
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if ((layoutParams2 instanceof C19ME) && (c19me5 = (C19ME) layoutParams2) != null) {
                        c19me5.startToStart = -1;
                        c19me5.startToEnd = R.id.tht;
                        c19me5.endToStart = R.id.mnd;
                        C786410Ut5.W5(view3, c19me5);
                    }
                }
                View view4 = this.LLJJJJ;
                if ((view4 != null && view4.getVisibility() == 0) || (view = this.LLLI) == null) {
                    return;
                }
                C1189060h32.LJJII(view, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), 0);
                return;
            }
            PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
            if ((content == null || content.images == null || poiReviewModel.getContent().images.isEmpty()) && C1EDK.LIZIZ()) {
                PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModel.getContent();
                if (content2 != null) {
                    str = content2.translatedContent;
                }
                if (C123100dR.LIZ(str)) {
                    View view5 = this.LLJJJIL;
                    if (view5 != null) {
                        ViewGroup.LayoutParams layoutParams3 = view5.getLayoutParams();
                        if ((layoutParams3 instanceof C19ME) && (c19me2 = (C19ME) layoutParams3) != null) {
                            c19me2.topToTop = R.id.ujd;
                            c19me2.topToBottom = -1;
                            c19me2.endToEnd = 0;
                            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = 0;
                            C786410Ut5.W5(view5, c19me2);
                        }
                    }
                    View view6 = this.LLJJJJ;
                    if (view6 == null) {
                        return;
                    }
                    C1189060h32.LJJII(view6, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), 0);
                    ViewGroup.LayoutParams layoutParams4 = view6.getLayoutParams();
                    if (!(layoutParams4 instanceof C19ME) || (c19me = (C19ME) layoutParams4) == null) {
                        return;
                    }
                    c19me.startToStart = -1;
                    c19me.startToEnd = -1;
                    c19me.endToStart = R.id.mnd;
                    C786410Ut5.W5(view6, c19me);
                    return;
                }
            }
            View view7 = this.LLJJJIL;
            if (view7 != null) {
                ViewGroup.LayoutParams layoutParams5 = view7.getLayoutParams();
                if ((layoutParams5 instanceof C19ME) && (c19me4 = (C19ME) layoutParams5) != null) {
                    c19me4.topToTop = -1;
                    c19me4.topToBottom = R.id.kc4;
                    c19me4.endToEnd = 0;
                    ((ViewGroup.MarginLayoutParams) c19me4).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    C786410Ut5.W5(view7, c19me4);
                }
            }
            View view8 = this.LLJJJJ;
            if (view8 == null) {
                return;
            }
            C1189060h32.LJJII(view8, 0, 0, 0, 0);
            ViewGroup.LayoutParams layoutParams6 = view8.getLayoutParams();
            if (!(layoutParams6 instanceof C19ME) || (c19me3 = (C19ME) layoutParams6) == null) {
                return;
            }
            c19me3.startToStart = R.id.p09;
            c19me3.startToEnd = -1;
            c19me3.endToStart = -1;
            C786410Ut5.W5(view8, c19me3);
        }
    }

    public final boolean P5(PoiReviewsApi.PoiReviewModel poiReviewModel) {
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

    public final void V5(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        Integer numLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stage_reviews_cell: bgcolor highlight state: ");
        sbLIZ.append(poiReviewModel.getHighlightState());
        sbLIZ.append(" pos: ");
        sbLIZ.append(getBindingAdapterPosition());
        sbLIZ.append(" review_id: ");
        sbLIZ.append(poiReviewModel.getReviewId());
        sbLIZ.append(" viewId: ");
        sbLIZ.append(this.itemView.hashCode());
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C1191120h6M.LIZ[poiReviewModel.getHighlightState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        Context context = getContext();
                        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a0h, context)) != null) {
                            ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(numLIZJ.intValue(), 0);
                            valueAnimatorOfArgb.setDuration(300L);
                            valueAnimatorOfArgb.setInterpolator(new LinearInterpolator());
                            valueAnimatorOfArgb.addUpdateListener(new AUListenerS267S0100000_18(this, 13));
                            valueAnimatorOfArgb.addListener(new ALAdapterS13S0200000_18(this, poiReviewModel, 2));
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("stage_reviews_cell: bgcolor highlight disappear start pos: ");
                            sbLIZ2.append(getBindingAdapterPosition());
                            sbLIZ2.append(" review_id: ");
                            sbLIZ2.append(poiReviewModel.getReviewId());
                            sbLIZ2.append(" viewId: ");
                            sbLIZ2.append(this.itemView.hashCode());
                            sbLIZ2.append(' ');
                            C2188811AlT.LIZIZ(sbLIZ2);
                            valueAnimatorOfArgb.start();
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                q6(poiReviewModel);
                return;
            }
            q6(poiReviewModel);
            T5().CT1(poiReviewModel);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("stage_reviews_cell: bgcolor default pos: ");
        sbLIZ3.append(getBindingAdapterPosition());
        sbLIZ3.append(" review_id: ");
        sbLIZ3.append(poiReviewModel.getReviewId());
        sbLIZ3.append(" viewId: ");
        sbLIZ3.append(this.itemView.hashCode());
        sbLIZ3.append(' ');
        C2188811AlT.LIZIZ(sbLIZ3);
        ConstraintLayout constraintLayout = this.LLJLILLLLZIIL;
        if (constraintLayout == null) {
            return;
        }
        constraintLayout.setBackgroundColor(0);
    }

    public final void d6(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        List<PoiReviewsApi.ImageDataModel> list;
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
        View view = this.LLJJIJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
        if (content != null && (list2 = content.images) != null && (!list2.isEmpty())) {
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
                int i = 0;
                for (Object obj : listLL) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        PoiReviewsApi.ImageDataModel imageDataModel2 = (PoiReviewsApi.ImageDataModel) obj;
                        if (i != 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    smartImageView = this.LLJJIII;
                                } else {
                                    i = i2;
                                }
                            } else {
                                smartImageView = this.LLJJI;
                            }
                        } else {
                            smartImageView = this.LLJJ;
                        }
                        if (smartImageView != null) {
                            C1180600gpO c1180600gpO = new C1180600gpO("poi_reviews", "poi_reviews_image", new C1180560gpK(this.itemView.getContext(), EnumC1177490gkN.FALLBACK_26_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(12))), null));
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
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModel.getContent();
        if (content2 != null && (list = content2.images) != null && !list.isEmpty()) {
            Iterator<PoiReviewsApi.ImageDataModel> it2 = list.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                if (it2.next() != null && (i3 = i3 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
            int i4 = i3 - 3;
            if (i4 > 0) {
                TuxTextView tuxTextView = this.LLJJIJIIJIL;
                if (tuxTextView != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('+');
                    sbLIZ.append(i4);
                    tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
                }
                View view2 = this.LLJJIJI;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(0, view2);
                }
            }
        }
    }

    public final void h6(boolean z) {
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
        String str4;
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
        PoiReviewsApi.PoiReviewUserModel author2;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        T5();
        PoiReviewsApi.PoiReviewModel item = getItem();
        String verifiedDisplay = null;
        if (item != null) {
            reviewId = item.getReviewId();
        } else {
            reviewId = null;
        }
        String str6 = "";
        if (reviewId == null) {
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
        String strZZ1 = T5().ZZ1();
        if (strZZ1 != null) {
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
        String logId = T5().getLogId();
        PoiReviewsApi.PoiReviewModel item11 = getItem();
        if (item11 != null && (content = item11.getContent()) != null) {
            str4 = content.textLang;
        } else {
            str4 = null;
        }
        String strYy = T5().yy();
        T5();
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
        if (L5() == 1 && (poiReviewModel = this.LLJZIJLIL) != null && P5(poiReviewModel)) {
            i2 = 1;
        } else {
            T5();
        }
        Integer numValueOf = Integer.valueOf(i2);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLJZIJLIL;
        if (poiReviewModel2 != null && (status = poiReviewModel2.getStatus()) != null) {
            num = status.status;
        } else {
            num = null;
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLJZIJLIL;
        if (poiReviewModel3 != null) {
            verifiedDisplay = poiReviewModel3.getVerifiedDisplay();
        }
        PageFinder pageFinderS5 = S5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJIILJJIL(fLIZIZ, zLIZ ? 1 : 0, iL5, iLongValue, size, length, value, i, pageFinderS5, interfaceC665370Q7zLJFF, numValueOf, num, "poi_reviews", reviewId, str, poiId, str6, str3, logId, str4, strYy, null, verifiedDisplay, z);
        b6();
    }

    public final void i6(boolean z) {
        String reviewId;
        String str;
        String poiId;
        Float fValueOf;
        String str2;
        int iLongValue;
        int size;
        int length;
        String str3;
        String str4;
        int value;
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
        PoiReviewsApi.PoiReviewUserModel author2;
        b6();
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        T5();
        PoiReviewsApi.PoiReviewModel item = getItem();
        String verifiedDisplay = null;
        if (item != null) {
            reviewId = item.getReviewId();
        } else {
            reviewId = null;
        }
        String str6 = "";
        if (reviewId == null) {
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
        String strZZ1 = T5().ZZ1();
        if (strZZ1 != null) {
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
        String logId = T5().getLogId();
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
        String strYy = T5().yy();
        T5();
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
        if (L5() == 1 && (poiReviewModel = this.LLJZIJLIL) != null && P5(poiReviewModel)) {
            i2 = 1;
        } else {
            T5();
        }
        Integer numValueOf = Integer.valueOf(i2);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLJZIJLIL;
        if (poiReviewModel2 != null && (status = poiReviewModel2.getStatus()) != null) {
            num = status.status;
        } else {
            num = null;
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLJZIJLIL;
        if (poiReviewModel3 != null) {
            verifiedDisplay = poiReviewModel3.getVerifiedDisplay();
        }
        PageFinder pageFinderS5 = S5();
        c1191160h6Q.getClass();
        C1191160h6Q.LJIILIIL(fLIZIZ, zLIZ ? 1 : 0, iL5, iLongValue, size, length, value, i, pageFinderS5, interfaceC665370Q7zLJFF, numValueOf, num, "poi_reviews", reviewId, str, poiId, str6, str3, logId, str4, strYy, null, verifiedDisplay, z);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1181430gqj.LIZIZ(viewGroup.getContext(), R.layout.e20, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        if (z) {
            T5().LLJJI = null;
        }
    }

    public final void q6(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        Integer numLIZJ;
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stage_reviews_cell: bgcolor highlight pos: ");
            sbLIZ.append(getBindingAdapterPosition());
            sbLIZ.append(" review_id: ");
            sbLIZ.append(poiReviewModel.getReviewId());
            sbLIZ.append(" viewId: ");
            sbLIZ.append(this.itemView.hashCode());
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
            ConstraintLayout constraintLayout = this.LLJLILLLLZIIL;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundColor(iIntValue);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x07ce  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r26, java.util.List r27) {
        /*
            Method dump skipped, instruction units count: 2131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell.onBindItemView(X.0zJl, java.util.List):void");
    }

    public final void U5(Context context, String str, String str2, String str3) {
        Integer source;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        String poiId;
        if (str2 != null && str2.length() != 0) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile");
            smartRouteBuildRoute.withParam("uid", str2);
            String verifiedDisplay = null;
            smartRouteBuildRoute.withParam("source_btm_token", C18JG.LIZ("c68202.d81238", PageFinder.via(this.itemView), null));
            smartRouteBuildRoute.open();
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            T5();
            String logId = T5().getLogId();
            PoiReviewsApi.PoiReviewModel item = getItem();
            if (item != null) {
                source = item.getSource();
            } else {
                source = null;
            }
            String strZZ1 = T5().ZZ1();
            String str4 = "";
            if (strZZ1 == null) {
                strZZ1 = "";
            }
            PoiReviewsApi.PoiReviewModel item2 = getItem();
            if (item2 != null && (poiId = item2.getPoiId()) != null) {
                str4 = poiId;
            }
            String strYy = T5().yy();
            T5();
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
            if (fragmentLJIIJ != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            } else {
                interfaceC665370Q7zLJFF = null;
            }
            PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLJZIJLIL;
            if (poiReviewModel != null) {
                verifiedDisplay = poiReviewModel.getVerifiedDisplay();
            }
            PageFinder pageFinderVia = PageFinder.via(this);
            c1191160h6Q.getClass();
            C1191160h6Q.LJIIZILJ("poi_reviews", str, str2, str3, logId, source, strZZ1, strYy, str4, null, interfaceC665370Q7zLJFF, verifiedDisplay, pageFinderVia);
        }
    }

    public final void a6(String str, final Context context, String str2, String str3, String str4, View view) {
        String poiId;
        String verifiedDisplay;
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
        sparkContext2.LJJJZ("enter_from", "poi_reviews");
        if (str3 == null) {
            str3 = "";
        }
        sparkContext2.LJJJZ("poi_id", str3);
        String strYy = T5().yy();
        if (strYy == null) {
            strYy = "";
        }
        sparkContext2.LJJJZ("from_group_id", strYy);
        if (!Intrinsics.LJFF(((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).getCurUserId(), str4)) {
            if (str4 == null) {
                str4 = "";
            }
            sparkContext2.LJJJZ("to_user_id", str4);
        }
        String strP40 = T5().P40();
        if (strP40 == null) {
            strP40 = "";
        }
        sparkContext2.LJJJZ("extra_info", strP40);
        sparkContext2.LJJJZ("collect_info", String.valueOf(T5().ZZ1()));
        PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLJZIJLIL;
        if (poiReviewModel == null || (poiId = poiReviewModel.getPoiId()) == null) {
            poiId = "";
        }
        sparkContext2.LJJJZ("poi_id", poiId);
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLJZIJLIL;
        if (poiReviewModel2 != null && (reviewId = poiReviewModel2.getReviewId()) != null) {
            str5 = reviewId;
        }
        sparkContext2.LJJJZ("review_id", str5);
        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLJZIJLIL;
        if (poiReviewModel3 != null) {
            verifiedDisplay = poiReviewModel3.getVerifiedDisplay();
        } else {
            verifiedDisplay = null;
        }
        if (C123100dR.LIZ(verifiedDisplay) && verifiedDisplay != null) {
            sparkContext2.LJJJZ("review_tags", verifiedDisplay);
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel4 = this.LLJZIJLIL;
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
        JSONObject jSONObjectRE = T5().rE(null, null);
        if (jSONObjectRE != null) {
            sparkContext2.LJJJZ("poi_review_landing_params", C786410Ut5.J3(jSONObjectRE));
        }
        sparkContext2.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0h6h
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
        sparkContext2.LJJJJZI(new C1209100hZM(view, 3));
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext2).LIZIZ();
    }
}
