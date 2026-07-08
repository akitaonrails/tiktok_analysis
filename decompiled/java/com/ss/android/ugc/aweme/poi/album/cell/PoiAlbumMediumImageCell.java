package com.ss.android.ugc.aweme.poi.album.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1186590gz3;
import X.C1186630gz7;
import X.C1189360h3W;
import X.C1208590hYX;
import X.C1331570kkt;
import X.C13LE;
import X.C166W;
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
import X.EnumC720130SMp;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.LayerDrawable;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumViewModel;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryOptExp;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAlbumMediumImageCell extends PowerCell<C1186590gz3> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C166W LL = new C166W(new AwS597S0100000_18((PowerCell) this, 225));
    public final AssemVMLazy LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiAlbumMediumImageCell.class, "binding", "getBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiAlbumMediumImageCellLayoutBinding;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiAlbumMediumImageCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/album/PoiAlbumViewModel;", 0);
        c09r3.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dy8;
    }

    public PoiAlbumMediumImageCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiAlbumViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 810);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(255);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 821), awS562S0100000_18, AFwS206S0000000_18.get$arr$(253), new AwS562S0100000_18((C03K6) this, 796), new AwS562S0100000_18((C03K6) this, 798), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 800), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 802), null, new AwS562S0100000_18((C03K6) this, 803));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 797);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 799);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 801);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 55));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 804);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 805);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 806);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 807);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, StrategyCenter.ENABLE_SMART_SERVICE);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 809), awS562S0100000_18, AFwS206S0000000_18.get$arr$(251), new AwS562S0100000_18((C03K6) this, 811), new AwS562S0100000_18((C03K6) this, 812), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 813), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 814), null, new AwS562S0100000_18((C03K6) this, 815));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 816), awS562S0100000_18, AFwS206S0000000_18.get$arr$(252), new AwS562S0100000_18((C03K6) this, 817), new AwS562S0100000_18((C03K6) this, 818), new AwS562S0100000_18((C03K6) this, 819), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 820));
        }
        this.LLILLJJLI = assemVMLazy;
    }

    public final C1186630gz7 I5() {
        C166W c166w = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (C1186630gz7) c166w.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1186590gz3 c1186590gz3 = (C1186590gz3) interfaceC1891350zJl;
        super.onBindItemView(c1186590gz3);
        if (C296700Bk4.LIZ()) {
            Context context = this.itemView.getContext();
            if (context != null) {
                C1189360h3W c1189360h3WLIZ = new C1180600gpO("poi_album", "poi_album_image", new C1180560gpK(context, EnumC1177490gkN.FALLBACK_32_PX, new C1180580gpM(Float.valueOf(0.0f)), null)).LIZ(C438710HIf.LIZ(c1186590gz3.LL));
                if (PoiGalleryOptExp.LIZ()) {
                    c1189360h3WLIZ.LIZ.LJJIJIL(new C1331570kkt(EnumC720130SMp.TYPE_1_5));
                    c1189360h3WLIZ.LIZ.LJIL = Bitmap.Config.ARGB_8888;
                }
                c1189360h3WLIZ.LIZLLL(I5().LLILLJJLI);
                c1189360h3WLIZ.LIZ.LJIIJJI();
            }
        } else {
            Context context2 = this.itemView.getContext();
            if (context2 != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_image_stack_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a03);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context2);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zp);
                LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context2));
                I5().LLILLJJLI.setBackground(layerDrawableLJIILIIL);
                C1189360h3W c1189360h3WLIZ2 = new C1180600gpO("poi_album", "poi_album_image", null).LIZ(C438710HIf.LIZ(c1186590gz3.LL));
                if (PoiGalleryOptExp.LIZ()) {
                    c1189360h3WLIZ2.LIZ.LJJIJIL(new C1331570kkt(EnumC720130SMp.TYPE_1_5));
                    c1189360h3WLIZ2.LIZ.LJIL = Bitmap.Config.ARGB_8888;
                }
                c1189360h3WLIZ2.LIZLLL(I5().LLILLJJLI);
                c1189360h3WLIZ2.LIZ.LJIIL(new C1208590hYX(this, layerDrawableLJIILIIL, 3));
            }
        }
        C786410Ut5.I7(new AkS57S0200000_18(this, c1186590gz3, 26), I5().LLILLJJLI);
    }
}
