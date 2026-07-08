package com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.waistbanner;

import X.AnonymousClass0322;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C950403na;
import X.C950703nd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC950803ne;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.waistbanner.SeaSkuWaistBannerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class SeaSkuWaistBannerCell extends ECPowerCell<AnonymousClass0322> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public C950403na LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final AssemVMLazy LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaSkuWaistBannerCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.axv;
    }

    public SeaSkuWaistBannerCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1199);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(62);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1210), awS577S0100000_33, AFwS224S0000000_33.get$arr$(175), new AwS577S0100000_33((C03K6) this, 1185), new AwS577S0100000_33((C03K6) this, 1187), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1189), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1191), null, new AwS577S0100000_33((C03K6) this, 1192));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1186);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1188);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1190);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 44));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1193);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1194);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1195);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1196);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1197);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1198), awS577S0100000_33, AFwS224S0000000_33.get$arr$(173), new AwS577S0100000_33((C03K6) this, 1200), new AwS577S0100000_33((C03K6) this, 1201), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1202), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1203), null, new AwS577S0100000_33((C03K6) this, 1204));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1205), awS577S0100000_33, AFwS224S0000000_33.get$arr$(174), new AwS577S0100000_33((C03K6) this, 1206), new AwS577S0100000_33((C03K6) this, 1207), new AwS577S0100000_33((C03K6) this, 1208), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1209));
        }
        this.LLJILJIL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C950403na c950403na = this.LLJ;
        if (c950403na != null) {
            c950403na.LIZJ(false);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C950403na c950403na = (C950403na) this.itemView.findViewById(R.id.ehi);
        this.LLJ = c950403na;
        if (c950403na == null) {
            C786410Ut5.LJLLLLLL(8, this.itemView);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onPause() {
        super.onPause();
        C950403na c950403na = this.LLJ;
        if (c950403na != null) {
            c950403na.LIZJ(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        AnonymousClass0322 anonymousClass0322 = (AnonymousClass0322) interfaceC1891350zJl;
        super.onBindItemView(anonymousClass0322);
        C950403na c950403na = this.LLJ;
        if (c950403na != null) {
            C786410Ut5.LJLLLLLL(0, this.itemView);
            if (!this.LLJI) {
                this.LLJI = true;
                float fLIZIZ = C418440Gaw.LIZIZ(10);
                c950403na.LIZ(new C950703nd(0, 0, 0, 0, Float.valueOf(fLIZIZ), Integer.valueOf(R.attr.a03), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 256), new InterfaceC950803ne() { // from class: X.03m1
                    @Override // X.InterfaceC950803ne
                    public final void LIZ(View view, C950203nY c950203nY) {
                        SeaSkuWaistBannerCell seaSkuWaistBannerCell = this.LIZ;
                        if (!seaSkuWaistBannerCell.LLJIJIL) {
                            seaSkuWaistBannerCell.LLJIJIL = true;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("SkuInsert_tiktokec_banner_show_");
                            sbLIZ.append(c950203nY.LIZ);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            SeaSkuWaistBannerCell seaSkuWaistBannerCell2 = this.LIZ;
                            linkedHashMap.put("page_name", "order_submit");
                            AssemVMLazy assemVMLazy = seaSkuWaistBannerCell2.LLJILJIL;
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SeaSkuWaistBannerCell.LLJILJILJ;
                            linkedHashMap.putAll(((OrderSubmitAssemViewModel) assemVMLazy.getValue()).hi1(false));
                            C951103nh.LIZIZ(view, strLIZIZ, c950203nY, "c6993.d39520", linkedHashMap);
                        }
                    }

                    @Override // X.InterfaceC950803ne
                    public final void LIZIZ(C950403na c950403na2, C950203nY c950203nY) {
                        if (c950203nY.LJIIIIZZ != null) {
                            SeaSkuWaistBannerCell seaSkuWaistBannerCell = this.LIZ;
                            SmartRouter.buildRoute(c950403na2.getContext(), c950203nY.LJIIIIZZ).open();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("page_name", "order_submit");
                            AssemVMLazy assemVMLazy = seaSkuWaistBannerCell.LLJILJIL;
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SeaSkuWaistBannerCell.LLJILJILJ;
                            linkedHashMap.putAll(((OrderSubmitAssemViewModel) assemVMLazy.getValue()).hi1(false));
                            C951103nh.LIZ(c950403na2, c950203nY, "c6993.d39520", linkedHashMap);
                        }
                    }
                });
            }
            c950403na.LJ(anonymousClass0322.LLIZ, new AwS580S0100000_1(this, 937));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        C950403na c950403na = this.LLJ;
        if (c950403na != null) {
            c950403na.LIZIZ();
        }
    }
}
