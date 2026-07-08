package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1173300gdc;
import X.C1174830gg5;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1185600gxS;
import X.C1186010gy7;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1202680hP0;
import X.C1208590hYX;
import X.C1208600hYY;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C296700Bk4;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C438710HIf;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1177490gkN;
import X.InterfaceC1181010gq3;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderGalleryCell extends PowerCell<C1186010gy7> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public SmartImageView LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiHeaderGalleryCell.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.e3x;
    }

    public PoiHeaderGalleryCell() {
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1034);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(358);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1045), awS562S0100000_18, AFwS206S0000000_18.get$arr$(318), new AwS562S0100000_18((C03K6) this, 1020), new AwS562S0100000_18((C03K6) this, 1022), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1024), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1026), null, new AwS562S0100000_18((C03K6) this, 1027));
            return;
        }
        if (!(obj instanceof InterfaceC451590HnJ)) {
            if (Intrinsics.LJFF(obj, obj)) {
                new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1033), awS562S0100000_18, AFwS206S0000000_18.get$arr$(316), new AwS562S0100000_18((C03K6) this, 1035), new AwS562S0100000_18((C03K6) this, 1036), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1037), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1038), null, new AwS562S0100000_18((C03K6) this, 1039));
                return;
            }
            if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1040), awS562S0100000_18, AFwS206S0000000_18.get$arr$(317), new AwS562S0100000_18((C03K6) this, 1041), new AwS562S0100000_18((C03K6) this, 1042), new AwS562S0100000_18((C03K6) this, 1043), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 1044));
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't support this VMScope: ");
            sbLIZ.append(obj);
            sbLIZ.append(" there");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 1021);
        AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1023);
        AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 1025);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 65));
        AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 1028);
        AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 1029);
        AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 1030);
        AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 1031);
        AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 1032);
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
        new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.r36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1185600gxS c1185600gxS;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        C1173300gdc c1173300gdcQr0;
        C1185600gxS c1185600gxS2;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ2;
        C1173300gdc c1173300gdcQr02;
        C1186010gy7 c1186010gy7 = (C1186010gy7) interfaceC1891350zJl;
        super.onBindItemView(c1186010gy7);
        String str = null;
        if (C296700Bk4.LIZ()) {
            if (this.itemView.getContext() != null) {
                Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
                if (fragmentLJIIJ != null && (interfaceC1181010gq3LIZ2 = C1174830gg5.LIZ(fragmentLJIIJ)) != null && (c1173300gdcQr02 = interfaceC1181010gq3LIZ2.qr0()) != null) {
                    c1185600gxS2 = (C1185600gxS) c1173300gdcQr02.LIZ;
                } else {
                    c1185600gxS2 = null;
                }
                C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_detail_header_album", new C1180560gpK(this.itemView.getContext(), EnumC1177490gkN.FALLBACK_32_PX, new C1180580gpM(Float.valueOf(0.0f)), null));
                if (c1185600gxS2 != null) {
                    str = c1185600gxS2.LIZ;
                }
                c1180600gpO.LIZLLL = new C1202680hP0(str, null, null, null, null, 30);
                C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(c1186010gy7.LL));
                c1189360h3WLIZ.LIZLLL(this.LL);
                c1189360h3WLIZ.LIZ.LJIIL(new C1208600hYY(this, 0));
            }
        } else {
            Context context = this.itemView.getContext();
            if (context != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_image_stack_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a03);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zp);
                LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
                SmartImageView smartImageView = this.LL;
                if (smartImageView != null) {
                    smartImageView.setBackground(layerDrawableLJIILIIL);
                }
                Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ(this);
                if (fragmentLJIIJ2 != null && (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJIIJ2)) != null && (c1173300gdcQr0 = interfaceC1181010gq3LIZ.qr0()) != null) {
                    c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ;
                } else {
                    c1185600gxS = null;
                }
                C1180600gpO c1180600gpO2 = new C1180600gpO("poi_detail", "poi_detail_header_album", null);
                if (c1185600gxS != null) {
                    str = c1185600gxS.LIZ;
                }
                c1180600gpO2.LIZLLL = new C1202680hP0(str, null, null, null, null, 30);
                C1189360h3W c1189360h3WLIZ2 = c1180600gpO2.LIZ(C438710HIf.LIZ(c1186010gy7.LL));
                c1189360h3WLIZ2.LIZLLL(this.LL);
                c1189360h3WLIZ2.LIZ.LJIIL(new C1208590hYX(this, layerDrawableLJIILIIL, 0));
            }
        }
        SmartImageView smartImageView2 = this.LL;
        if (smartImageView2 != null) {
            C786410Ut5.I7(new AkS57S0200000_18(this, c1186010gy7, 10), smartImageView2);
        }
    }
}
