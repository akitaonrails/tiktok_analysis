package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C01D1;
import X.C01GW;
import X.C1184350gvR;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1185490gxH;
import X.C1188440h22;
import X.C1188450h23;
import X.C1188460h24;
import X.C1188530h2B;
import X.C1188730h2V;
import X.C1189060h32;
import X.C1206904nr;
import X.C12ES;
import X.C13LE;
import X.C1637806bA;
import X.C19719512Dh;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C848230XPh;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel;
import com.ss.android.ugc.aweme.poi.collect.detailfeed.PoiCollectBottomBarViewModel;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPlayFeedFavoriteBottomAssem extends PoiCollectStatusBaseAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 931));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 932));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 933));
    public TuxTextView LLJL;
    public String LLJLIL;
    public final AssemVMLazy LLJLILLLLZIIL;
    public C1188440h22 LLJLL;
    public String LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiPlayFeedFavoriteBottomAssem.class, "bottomBarViewModel", "getBottomBarViewModel()Lcom/ss/android/ugc/aweme/poi/collect/detailfeed/PoiCollectBottomBarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiPlayFeedFavoriteBottomAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiCollectBottomBarViewModel.class);
        this.LLJLILLLLZIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 934), AFwS256S0000000_18.get$arr$(297), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2b;
    }

    public final PoiCollectBottomBarViewModel Qp() {
        AssemVMLazy assemVMLazy = this.LLJLILLLLZIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (PoiCollectBottomBarViewModel) assemVMLazy.getValue();
    }

    public final C1188530h2B Tp() {
        C1188530h2B c1188530h2B;
        String poiId;
        String poiInfoSource;
        String poiCityCode;
        String poiRegionCode;
        String strLIZLLL;
        String strLIZJ;
        Aweme aweme = (Aweme) withState(Qp(), AFwS256S0000000_18.get$arr$(967));
        String collectInfo = null;
        if (aweme == null || (c1188530h2B = Ap().LLIZ) == null) {
            return null;
        }
        C1185490gxH.Companion.getClass();
        C1185490gxH c1185490gxHLJ = C1188730h2V.LJ(aweme);
        C1188460h24.LIZ.getClass();
        C1188440h22 c1188440h22LJ = C1188460h24.LJ(aweme, "feed_bottom", null);
        if (c1188440h22LJ != null) {
            poiId = c1188440h22LJ.getPoiId();
            poiInfoSource = c1188440h22LJ.getPoiInfoSource();
            poiCityCode = c1188440h22LJ.getPoiCityCode();
            poiRegionCode = c1188440h22LJ.getPoiRegionCode();
        } else {
            poiId = null;
            poiInfoSource = null;
            poiCityCode = null;
            poiRegionCode = null;
        }
        if (c1188440h22LJ != null) {
            strLIZLLL = C1188460h24.LIZLLL(c1188440h22LJ);
            strLIZJ = C1188460h24.LIZJ(c1188440h22LJ);
            collectInfo = c1188440h22LJ.getCollectInfo();
        } else {
            strLIZLLL = null;
            strLIZJ = null;
        }
        return c1188530h2B.copy(c1188530h2B.LL, c1188530h2B.LLILLJJLI, c1188530h2B.LLILLL, c1188530h2B.LLILZ, c1188530h2B.LLILZIL, c1188530h2B.LLILZLL, c1188530h2B.LLIZ, c1188530h2B.LLIZLLLIL, c1188530h2B.LLJ, c1188530h2B.LLJI, c1188530h2B.LLJIJIL, c1188530h2B.LLJILJIL, c1188530h2B.LLJILJILJ, c1188530h2B.LLJILLL, c1188530h2B.LLJJ, c1188530h2B.LLJJI, c1188530h2B.LLJJIII, c1188530h2B.LLJJIJI, poiId, poiInfoSource, poiCityCode, poiRegionCode, c1188530h2B.LLJJJJ, strLIZLLL, strLIZJ, collectInfo, c1188530h2B.LLJJLIIIJLLLLLLLZ, c1188530h2B.LLJL, c1185490gxHLJ.getGroupId(), c1185490gxHLJ.getAuthorId(), c1188530h2B.LLJLL, c1188530h2B.LLJLLIL);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View zp() {
        return (View) this.LLJJJJLIIL.getValue();
    }

    public final C1188440h22 Vp() {
        String str = Ap().LL;
        if (str == null) {
            return null;
        }
        String str2 = Ap().LLILZ;
        Bp();
        Boolean bool = PoiCollectStatusViewModel.LLILZ.get(str);
        return new C1188440h22(null, str, str2, null, null, null, null, null, null, null, null, null, bool != null ? bool.booleanValue() : Ap().LLILLJJLI, null, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final C1184350gvR sp() {
        Aweme aweme = (Aweme) withState(Qp(), AFwS256S0000000_18.get$arr$(295));
        if (aweme == null) {
            return super.sp();
        }
        C1188440h22 c1188440h22LIZ = C1188450h23.LIZ(aweme);
        return c1188440h22LIZ != null ? new C1184350gvR(c1188440h22LIZ.getPoiId(), c1188440h22LIZ.getPoiName(), c1188440h22LIZ.getFallbackAddress(), c1188440h22LIZ.isCollected()) : super.sp();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Ep(boolean z) {
        Map<String, String> mapForceToMap;
        String enterMethod;
        C1188530h2B c1188530h2BTp = Tp();
        if (c1188530h2BTp != null && (mapForceToMap = c1188530h2BTp.forceToMap()) != null) {
            if (C19719512Dh.LJII(mapForceToMap)) {
                C1185410gx9 c1185410gx9 = Ap().LLIZLLLIL;
                if (c1185410gx9 != null) {
                    enterMethod = c1185410gx9.getEnterMethod();
                } else {
                    enterMethod = null;
                }
                C1189060h32.LJIJI(mapForceToMap, "poi_detail_enter_method", enterMethod);
            }
            if (z) {
                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
                c1185430gxB.getClass();
                C1185430gxB.LJIJJ(mapForceToMap, pageFinderVia, null, null);
                return;
            }
            C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
            PageFinder pageFinderVia2 = PageFinder.via(C724240Sb0.LJI(this));
            c1185430gxB2.getClass();
            C1185430gxB.LJII(mapForceToMap, pageFinderVia2, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Jp(boolean z) {
        int i;
        int i2;
        boolean zLIZ = C1206904nr.LIZ();
        Integer numValueOf = Integer.valueOf(R.attr.ee);
        if (z) {
            View viewZp = zp();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e9);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            viewZp.setBackground(c384050F3z.LIZ(zp().getContext()));
            TuxIconView tuxIconView = (TuxIconView) this.LLJJL.getValue();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_bookmark_fill;
            c419910GdJ.LJ = numValueOf;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            tuxIconView.setTuxIcon(c419910GdJ);
            TextView textView = (TextView) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (zLIZ) {
                i2 = 2131844689;
            } else {
                i2 = 2131844691;
            }
            textView.setText(i2);
            ((TuxTextView) this.LLJJLIIIJLLLLLLLZ.getValue()).setTextColorRes(R.attr.ee);
            return;
        }
        View viewZp2 = zp();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
        viewZp2.setBackground(c384050F3z2.LIZ(zp().getContext()));
        TuxIconView tuxIconView2 = (TuxIconView) this.LLJJL.getValue();
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_bookmark;
        c419910GdJ2.LJ = numValueOf;
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        tuxIconView2.setTuxIcon(c419910GdJ2);
        TextView textView2 = (TextView) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (zLIZ) {
            i = 2131844688;
        } else {
            i = 2131844690;
        }
        textView2.setText(i);
        ((TuxTextView) this.LLJJLIIIJLLLLLLLZ.getValue()).setTextColorRes(R.attr.ee);
    }

    public final void Up(Boolean bool) {
        String aid;
        Aweme aweme = (Aweme) withState(Qp(), AFwS256S0000000_18.get$arr$(296));
        String str = this.LLJLLIL;
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(str, aid)) {
            return;
        }
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        this.LLJLLIL = aid2;
        C1188530h2B c1188530h2BTp = Tp();
        if (c1188530h2BTp == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c1188530h2BTp.forceToMap());
        String str2 = "1";
        if (C848230XPh.LL.LJI()) {
            linkedHashMap.put("is_login", "1");
        } else {
            linkedHashMap.put("is_login", CardStruct.IStatusCode.DEFAULT);
        }
        if (bool != null) {
            if (!bool.booleanValue()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_favourite", str2);
        }
        linkedHashMap.put("enter_method", "click_button_video");
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
        c1185430gxB.getClass();
        C1185430gxB.LJJJLIIL(pageFinderVia, linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        zp().setMinimumWidth((int) (C12ES.LJIIJ(getContext()) * 0.4f));
        this.LLJL = (TuxTextView) view.findViewById(R.id.tv_poi_name);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.lnv);
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = ((IPoiAnchorService) ServiceManager.get().getService(IPoiService.class)).getIconResByABExp(false);
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 46), view);
        C736680Sv4.LJIIIIZZ(this, Qp(), new C2217381BqS() { // from class: X.0h2C
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158240gFK) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 93), 6);
        withState(Qp(), new AwS597S0100000_18(this, 250));
    }
}
