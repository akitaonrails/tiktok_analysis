package com.ss.android.ugc.aweme.poi.detail.banner;

import X.C1173300gdc;
import X.C1173980gei;
import X.C1174850gg7;
import X.C1178990gmn;
import X.C1185600gxS;
import X.C1194160hBG;
import X.C1194750hCD;
import X.C1194760hCE;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1181010gq3;
import X.InterfaceC1194150hBF;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import com.ss.android.ugc.aweme.poi.detail.banner.PoiBannerModel;
import com.ss.android.ugc.aweme.poi.detail.banner.PoiDetailBannerComponent;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailBannerComponent extends PoiDetailBaseAssem<PoiBannerModel> {
    public String LLJJL;
    public C1194750hCD LLJJLIIIJLLLLLLLZ;
    public C1194760hCE LLJL;
    public final Set<String> LLJLIL = new LinkedHashSet();
    public final Set<String> LLJLILLLLZIIL = new LinkedHashSet();

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2h;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hahaTest - PoiDetailBannerComponet - onDestroy - showedList:");
        sbLIZ.append(this.LLJLIL);
        C2188811AlT.LIZIZ(sbLIZ);
        for (String str : this.LLJLIL) {
            if (!this.LLJLILLLLZIIL.contains(str)) {
                C1194160hBG.LJII(str, "poi_detail");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        List<PoiActivityApi.PoiBannerInfo> bannerListInfo;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        final PoiBannerModel poiBannerModel = (PoiBannerModel) baseComponentData;
        super.CG1(poiBannerModel);
        List<PoiActivityApi.PoiBannerInfo> bannerListInfo2 = null;
        if (poiBannerModel != null) {
            bannerListInfo = poiBannerModel.getBannerListInfo();
        } else {
            bannerListInfo = null;
        }
        boolean z = true;
        if (!((ArrayList) C1194160hBG.LJ("poi_detail", bannerListInfo)).isEmpty()) {
            C1194760hCE c1194760hCE = this.LLJL;
            if (c1194760hCE != null) {
                C1194750hCD c1194750hCD = this.LLJJLIIIJLLLLLLLZ;
                if (c1194750hCD != null) {
                    c1194750hCD.LIZIZ(false);
                }
                View contentView = getContentView();
                if ((contentView instanceof FrameLayout) && (frameLayout = (FrameLayout) contentView) != null) {
                    C786410Ut5.LJJJZ(c1194760hCE, frameLayout);
                }
            }
            this.LLJL = new C1194760hCE(getContentView().getContext());
            final C1194760hCE c1194760hCE2 = this.LLJL;
            if (c1194760hCE2 != null) {
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) (((C497820Jfg.LIZIZ(getContentView().getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) / 5.0f) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * 2)));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1194760hCE2);
                c1194760hCE2.setLayoutParams(layoutParams);
                C1194750hCD c1194750hCD2 = new C1194750hCD(c1194760hCE2, new InterfaceC1194150hBF() { // from class: X.0h1C
                    @Override // X.InterfaceC1194150hBF
                    public final void LIZ(String str) {
                        this.LIZ.LLJLILLLLZIIL.add(str);
                    }

                    @Override // X.InterfaceC1194150hBF
                    public final void LIZIZ(String str) {
                        FrameLayout frameLayout2;
                        List<PoiActivityApi.PoiBannerInfo> bannerListInfo3;
                        String str2;
                        ArrayList arrayList = new ArrayList();
                        PoiBannerModel poiBannerModel2 = poiBannerModel;
                        if (poiBannerModel2 != null && (bannerListInfo3 = poiBannerModel2.getBannerListInfo()) != null) {
                            for (PoiActivityApi.PoiBannerInfo poiBannerInfo : bannerListInfo3) {
                                if (poiBannerInfo != null) {
                                    str2 = poiBannerInfo.activityId;
                                } else {
                                    str2 = null;
                                }
                                if (!Intrinsics.LJFF(str2, str)) {
                                    arrayList.add(poiBannerInfo);
                                }
                            }
                        }
                        if (arrayList.size() != 0 && !((ArrayList) C1194160hBG.LJ("poi_detail", arrayList)).isEmpty()) {
                            C1194750hCD c1194750hCD3 = this.LIZ.LLJJLIIIJLLLLLLLZ;
                            if (c1194750hCD3 != null) {
                                c1194750hCD3.LIZ(C1194160hBG.LJ("poi_detail", arrayList));
                                return;
                            }
                            return;
                        }
                        View contentView2 = this.LIZ.getContentView();
                        if ((contentView2 instanceof FrameLayout) && (frameLayout2 = (FrameLayout) contentView2) != null) {
                            C786410Ut5.LJJJZ(c1194760hCE2, frameLayout2);
                        }
                        C1194750hCD c1194750hCD4 = this.LIZ.LLJJLIIIJLLLLLLLZ;
                        if (c1194750hCD4 != null) {
                            c1194750hCD4.LIZIZ(false);
                        }
                        InterfaceC1181010gq3 interfaceC1181010gq3LIZIZ = C1178990gmn.LIZIZ(this.LIZ);
                        if (interfaceC1181010gq3LIZIZ == null) {
                            return;
                        }
                        PoiDetailBannerComponent poiDetailBannerComponent = this.LIZ;
                        poiDetailBannerComponent.getClass();
                        interfaceC1181010gq3LIZIZ.remove(C1173980gei.LIZ(poiDetailBannerComponent));
                    }

                    @Override // X.InterfaceC1194150hBF
                    public final void LIZJ(String str) {
                        this.LIZ.LLJLIL.add(str);
                    }
                }, z, 8);
                c1194750hCD2.LLJI = this.LLJJL;
                if (poiBannerModel != null) {
                    bannerListInfo2 = poiBannerModel.getBannerListInfo();
                }
                c1194750hCD2.LIZ(C1194160hBG.LJ("poi_detail", bannerListInfo2));
                this.LLJJLIIIJLLLLLLLZ = c1194750hCD2;
                View contentView2 = getContentView();
                if ((contentView2 instanceof FrameLayout) && (viewGroup = (ViewGroup) contentView2) != null) {
                    viewGroup.addView(this.LLJL);
                    return;
                }
                return;
            }
            return;
        }
        InterfaceC1181010gq3 interfaceC1181010gq3LIZIZ = C1178990gmn.LIZIZ(this);
        if (interfaceC1181010gq3LIZIZ == null) {
            return;
        }
        interfaceC1181010gq3LIZIZ.remove(C1173980gei.LIZ(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        C1185600gxS c1185600gxS;
        super.onViewCreated(view);
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        if (c1173300gdcLJ != null && (c1185600gxS = (C1185600gxS) c1173300gdcLJ.LIZ) != null) {
            str = c1185600gxS.LIZ;
        } else {
            str = null;
        }
        this.LLJJL = str;
    }
}
