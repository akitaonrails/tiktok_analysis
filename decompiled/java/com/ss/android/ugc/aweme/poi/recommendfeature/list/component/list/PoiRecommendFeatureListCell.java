package com.ss.android.ugc.aweme.poi.recommendfeature.list.component.list;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1180160gog;
import X.C1183220gtc;
import X.C1183240gte;
import X.C1185430gxB;
import X.C1189060h32;
import X.C13LE;
import X.C1558360qeg;
import X.C18JG;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C425810Gmp;
import X.C427660Gpo;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import Y.ACListenerS153S0100000_18;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.vm.PoiRecommendFeatureListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureListCell extends PowerCell<C1180160gog> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public SmartImageView LL;
    public FrameLayout LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxIconView LLIZ;
    public TuxTextView LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public C427660Gpo LLJIJIL;
    public C425810Gmp LLJILJIL;
    public Integer LLJILJILJ;
    public Integer LLJILLL;
    public GradientDrawable LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public final AssemVMLazy LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiRecommendFeatureListCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/recommendfeature/list/vm/PoiRecommendFeatureListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiRecommendFeatureListCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiRecommendFeatureListViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1747);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(569);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1732), awS562S0100000_18, AFwS206S0000000_18.get$arr$(448), new AwS562S0100000_18((C03K6) this, 1733), new AwS562S0100000_18((C03K6) this, 1735), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1737), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1739), null, new AwS562S0100000_18((C03K6) this, 1740));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 1734);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1736);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 1738);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 89));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 1741);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 1742);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 1743);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 1744);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 1745);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1746), awS562S0100000_18, AFwS206S0000000_18.get$arr$(449), new AwS562S0100000_18((C03K6) this, 1748), new AwS562S0100000_18((C03K6) this, 1749), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1750), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1751), null, new AwS562S0100000_18((C03K6) this, 1752));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1753), awS562S0100000_18, AFwS206S0000000_18.get$arr$(450), new AwS562S0100000_18((C03K6) this, 1754), new AwS562S0100000_18((C03K6) this, 1755), new AwS562S0100000_18((C03K6) this, 1730), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 1731));
        }
        this.LLJJIJI = assemVMLazy;
    }

    public final void I5() {
        String str;
        String str2;
        String str3;
        PoiRecommendFeatureListItem poiRecommendFeatureListItem;
        PoiRecommendFeatureListItem poiRecommendFeatureListItem2;
        C1180160gog item = getItem();
        String str4 = (item == null || (poiRecommendFeatureListItem2 = item.LL) == null) ? null : poiRecommendFeatureListItem2.id;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        C1183240gte c1183240gte = ((PoiRecommendFeatureListViewModel) assemVMLazy.getValue()).LLILLJJLI;
        if (c1183240gte == null || (str = c1183240gte.poiId) == null) {
            str = "";
        }
        if (a0.LJJJIL(str4) || a0.LJJJIL(str)) {
            return;
        }
        C1180160gog item2 = getItem();
        if (item2 != null && (poiRecommendFeatureListItem = item2.LL) != null) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            String str6 = poiRecommendFeatureListItem.id;
            String str7 = poiRecommendFeatureListItem.collectInfo;
            int bindingAdapterPosition = getBindingAdapterPosition();
            Integer numValueOf = Integer.valueOf(bindingAdapterPosition >= 0 ? bindingAdapterPosition : 0);
            UrlModel urlModel = poiRecommendFeatureListItem.cover;
            String uri = urlModel != null ? urlModel.getUri() : null;
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = fragmentLJIIJ != null ? C1558360qeg.LJFF(fragmentLJIIJ, null) : null;
            PageFinder pageFinderVia = PageFinder.via(this.itemView);
            c1185430gxB.getClass();
            C1185430gxB.LJIIL(pageFinderVia, interfaceC665370Q7zLJFF, numValueOf, str6, str7, uri);
        }
        C1183220gtc c1183220gtc = new C1183220gtc("poi_secondary_industry_info_page", C18JG.LIZ("a4257.b78030", PageFinder.via(this.itemView), null));
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.itemView.getContext(), "//poi/recommend_feature_detail");
        smartRouteBuildRoute.withParam("poi_id", str);
        smartRouteBuildRoute.withParam("entity_id", str4);
        if (c1183240gte == null || (str2 = c1183240gte.dataVersion) == null) {
            str2 = "";
        }
        smartRouteBuildRoute.withParam("data_version", str2);
        if (c1183240gte != null && (str3 = c1183240gte.poiSessionId) != null) {
            str5 = str3;
        }
        smartRouteBuildRoute.withParam("poi_session_id", str5);
        smartRouteBuildRoute.withParam("poi_category_feature_mob_params", c1183220gtc);
        smartRouteBuildRoute.open();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams;
        super.onItemViewCreated();
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.r9r);
        this.LLILLJJLI = (FrameLayout) this.itemView.findViewById(R.id.rac);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.rad);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.rag);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.rab);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.ra2);
        this.LLIZ = (TuxIconView) this.itemView.findViewById(R.id.ra1);
        this.LLIZLLLIL = (TuxTextView) this.itemView.findViewById(R.id.r9s);
        this.LLJ = this.itemView.findViewById(R.id.ra0);
        this.LLJI = this.itemView.findViewById(R.id.r9k);
        this.LLJIJIL = (C427660Gpo) this.itemView.findViewById(R.id.r9m);
        C425810Gmp c425810Gmp = (C425810Gmp) this.itemView.findViewById(R.id.r9l);
        this.LLJILJIL = c425810Gmp;
        Double dValueOf = Double.valueOf(1.6d);
        if (c425810Gmp != null) {
            c425810Gmp.setGapPx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)));
        }
        C425810Gmp c425810Gmp2 = this.LLJILJIL;
        if (c425810Gmp2 != null) {
            c425810Gmp2.setOverlapPx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)));
        }
        TuxTextView tuxTextView = this.LLILZLL;
        this.LLJILJILJ = tuxTextView != null ? Integer.valueOf(tuxTextView.getCurrentTextColor()) : null;
        TuxTextView tuxTextView2 = this.LLILLL;
        this.LLJILLL = tuxTextView2 != null ? Integer.valueOf(tuxTextView2.getCurrentTextColor()) : null;
        View view = this.LLJI;
        int i = 0;
        this.LLJJI = (view == null || (layoutParams = view.getLayoutParams()) == null) ? 0 : layoutParams.height;
        TuxTextView tuxTextView3 = this.LLIZLLLIL;
        ViewGroup.LayoutParams layoutParams2 = tuxTextView3 != null ? tuxTextView3.getLayoutParams() : null;
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i = marginLayoutParams.topMargin;
        }
        this.LLJJIII = i;
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 71), this.itemView);
        View view2 = this.LLJI;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 72), view2);
        }
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 444));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r28) {
        /*
            Method dump skipped, instruction units count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.recommendfeature.list.component.list.PoiRecommendFeatureListCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e6y, viewGroup, false);
    }
}
