package com.ss.android.ugc.aweme.poi.detail.container.bottom;

import X.C0XQ7;
import X.C1173300gdc;
import X.C1173980gei;
import X.C1174850gg7;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1185600gxS;
import X.C1186970gzf;
import X.C13LE;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19MB;
import X.C337180DJs;
import X.C339190DRl;
import X.C418440Gaw;
import X.C424870GlJ;
import X.C723850SaN;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC586170Myt;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiDetailFavoriteButtonAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailGrayServiceButtonAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.stable.PoiStableBottomBarModule;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiContentComponent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS27S0310000_2;
import kotlin.jvm.internal.AwS70S0210000_18;

/* JADX INFO: loaded from: classes19.dex */
public abstract class PoiBaseBottomButtonsComponent extends PoiDetailBaseUiContentComponent<PoiStableBottomBarModule> implements InterfaceC586170Myt {
    public View LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public ConstraintLayout LLJILLL;

    public abstract void Lo(PoiStableBottomBarModule poiStableBottomBarModule);

    public void So() {
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, X.InterfaceC1173990gej
    public final void fm1() {
        C1174850gg7.LJII(this);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        String strLJFF = C1174850gg7.LJFF(this);
        if (strLJFF == null) {
            strLJFF = C1173980gei.LIZ(this);
        }
        C1185430gxB.LJJIJIL(c1185430gxB, interfaceC665370Q7zLJIIL, strLJFF, C1173980gei.LIZ(this), new C1185050gwZ(PageFinder.via(LJJIJL())), 16);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        C0XQ7.LJ();
        C0XQ7.LIZ.LJI(this);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        PoiStableBottomBarModule poiStableBottomBarModule = (PoiStableBottomBarModule) baseComponentData;
        super.CG1(poiStableBottomBarModule);
        Zo(poiStableBottomBarModule);
    }

    public final void Zo(PoiStableBottomBarModule poiStableBottomBarModule) {
        int i;
        Lo(poiStableBottomBarModule);
        if (this.LLJILLL != null) {
            C19MB c19mb = new C19MB();
            c19mb.LJII(this.LLJILLL);
            int i2 = 0;
            List listLJIIJJI = C1697810uHb.LJIIJJI(this.LLJIJIL, this.LLJILJILJ, this.LLJILJIL, this.LLJI);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJIIJJI) {
                if (C424870GlJ.LIZ(C724240Sb0.LIZ(this), (View) obj)) {
                    arrayList.add(obj);
                }
            }
            for (Object obj2 : arrayList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    View view = (View) obj2;
                    if (arrayList.size() <= 2) {
                        i = 4;
                    } else {
                        i = 3;
                    }
                    Vo(c19mb, null, view, i);
                    Vo(c19mb, view, null, i);
                    if (i2 == 0) {
                        Vo(c19mb, null, view, 16);
                    }
                    if (i2 == arrayList.size() - 1) {
                        Vo(c19mb, view, null, 16);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            c19mb.LIZIZ(this.LLJILLL);
        }
        So();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiContentComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e9c, viewGroup, true);
            this.LLJILLL = (ConstraintLayout) viewGroup.findViewById(R.id.cbl);
            this.LLJI = viewGroup.findViewById(R.id.hpr);
            this.LLJIJIL = viewGroup.findViewById(R.id.utn);
            this.LLJILJILJ = viewGroup.findViewById(R.id.uyr);
            this.LLJILJIL = viewGroup.findViewById(R.id.p3l);
        }
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(this);
    }

    public final void No(PoiStableBottomBarModule poiStableBottomBarModule, boolean z) {
        PoiListApi.PoiDetailResponse poiDetailResponseGo = Go();
        if (poiStableBottomBarModule.isCollect() != null && poiDetailResponseGo != null) {
            View view = this.LLJI;
            if (view != null) {
                C337180DJs.LIZJ(view);
            }
            C723850SaN.LIZLLL(this, new AwS70S0210000_18(this, poiDetailResponseGo, z, 1));
            return;
        }
        View view2 = this.LLJI;
        if (view2 != null) {
            C339190DRl.LIZIZ(view2);
        }
        C723850SaN.LJII(this, C13LE.LIZ(PoiDetailFavoriteButtonAssem.class), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oo(PoiStableBottomBarModule poiStableBottomBarModule, boolean z) {
        C1185600gxS c1185600gxS;
        PoiShopBookingInfo serviceButton = poiStableBottomBarModule.getServiceButton();
        PoiListApi.PoiDetailResponse poiDetailResponseGo = Go();
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        String string = null;
        if (c1173300gdcLJ != null) {
            c1185600gxS = (C1185600gxS) c1173300gdcLJ.LIZ;
        } else {
            c1185600gxS = null;
        }
        if (serviceButton != null && poiDetailResponseGo != null && c1185600gxS != null) {
            View view = this.LLJIJIL;
            if (view != null) {
                C337180DJs.LIZJ(view);
            }
            Integer num = serviceButton.provider;
            if (num != null) {
                string = num.toString();
            }
            C723850SaN.LIZLLL(this, new AwS27S0310000_2(this, serviceButton, new C1186970gzf(string, c1185600gxS.LIZ, poiDetailResponseGo.getCityCode(), poiDetailResponseGo.getRegionCode(), poiStableBottomBarModule.getTypeLevel(), poiStableBottomBarModule.getCollectInfo(), serviceButton.trackInfo, Ho().LJIIJJI(), Ho().LJ(), "click_bottom_bar"), z, 1));
            return;
        }
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            C339190DRl.LIZIZ(view2);
        }
        C723850SaN.LJII(this, C13LE.LIZ(PoiDetailGrayServiceButtonAssem.class), null);
    }

    public static void Vo(C19MB c19mb, View view, View view2, int i) {
        if (view != null) {
            c19mb.LJJIIJZLJL(view.getId(), 7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
        }
        if (view2 != null) {
            c19mb.LJJIIJZLJL(view2.getId(), 6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        PoiStableBottomBarModule poiStableBottomBarModule = (PoiStableBottomBarModule) C1174850gg7.LIZJ(this);
        if (z && poiStableBottomBarModule != null) {
            if (i != 1 && i != 2) {
                return;
            }
            Zo(poiStableBottomBarModule);
        }
    }
}
