package com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.productdescription;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1066100dqi;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C1406700mi4;
import X.C1427600nFm;
import X.C1750100vdw;
import X.C1752170vhH;
import X.C1752360vha;
import X.C1776120wJu;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C954703oH;
import X.EnumC1338240kve;
import X.EnumC1752350vhZ;
import X.InterfaceC1752190vhJ;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC497601wk;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import c1b.m;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SkuProductImageCell extends PowerCell<C1406700mi4> implements InterfaceC1752190vhJ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public C1752170vhH LLILLJJLI;
    public final C01GW LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SkuProductImageCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/vm/SkuPanelAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1752190vhJ
    public final void LJJJJJL(boolean z) {
    }

    @Override // X.InterfaceC1752190vhJ
    public final void LJJLIIIJILLIZJL() {
    }

    @Override // X.InterfaceC1752190vhJ
    public final void l4(TuxSheet tuxSheet) {
    }

    @Override // X.InterfaceC1752190vhJ
    public final void m4(BasicPopUp basicPopUp, String str) {
    }

    @Override // X.InterfaceC1752190vhJ
    public final void p2() {
    }

    public SkuProductImageCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkuPanelAssemVM.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 562);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(254);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 547), awS570S0100000_26, AFwS215S0000000_26.get$arr$(146), new AwS570S0100000_26((C03K6) this, 548), new AwS570S0100000_26((C03K6) this, 550), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 552), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 554), null, new AwS570S0100000_26((C03K6) this, 555));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 549);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 551);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 553);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 32));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 556);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 557);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 558);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 559);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 560);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 561), awS570S0100000_26, AFwS215S0000000_26.get$arr$(147), new AwS570S0100000_26((C03K6) this, 563), new AwS570S0100000_26((C03K6) this, 564), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 565), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 566), null, new AwS570S0100000_26((C03K6) this, 567));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 568), awS570S0100000_26, AFwS215S0000000_26.get$arr$(148), new AwS570S0100000_26((C03K6) this, 569), new AwS570S0100000_26((C03K6) this, 570), new AwS570S0100000_26((C03K6) this, 571), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 545));
        }
        this.LL = assemVMLazy;
        this.LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 546));
    }

    public final SkuPanelAssemVM I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (SkuPanelAssemVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C1427600nFm c1427600nFmBQ2 = I5().BQ2();
        if (c1427600nFmBQ2 != null) {
            int absoluteAdapterPosition = getAbsoluteAdapterPosition();
            AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 249);
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(I5());
            C1752360vha c1752360vha = EnumC1752350vhZ.Companion;
            Integer numValueOf = Integer.valueOf(I5().Zf2().LJIIJ());
            c1752360vha.getClass();
            c1427600nFmBQ2.LIZ(absoluteAdapterPosition, awS605S0100000_26, viewModelScope, C1752360vha.LIZ(numValueOf));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C1427600nFm c1427600nFmBQ2 = I5().BQ2();
        if (c1427600nFmBQ2 != null) {
            c1427600nFmBQ2.LIZIZ(getAbsoluteAdapterPosition());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1406700mi4 c1406700mi4 = (C1406700mi4) interfaceC1891350zJl;
        super.onBindItemView(c1406700mi4);
        this.LLILLJJLI = (C1752170vhH) this.itemView.findViewById(R.id.fng);
        C1427600nFm c1427600nFmBQ2 = I5().BQ2();
        if (c1427600nFmBQ2 != null) {
            c1427600nFmBQ2.LJFF(getAbsoluteAdapterPosition());
        }
        AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 464);
        C1752170vhH c1752170vhH = this.LLILLJJLI;
        if (c1752170vhH != null) {
            c1752170vhH.LIZ(c1406700mi4, getAbsoluteAdapterPosition(), (m) this.LLILLL.getValue(), this, awS605S0100000_26, AFwS215S0000000_26.get$arr$(290));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C01GW c01gw = C954703oH.LIZ;
        return C954703oH.LIZ(viewGroup.getContext(), R.layout.aue, viewGroup, false);
    }

    @Override // X.InterfaceC1752190vhJ
    public final void h1(C1406700mi4 c1406700mi4, SmartImageView smartImageView, C1066100dqi c1066100dqi) {
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        Image image = c1406700mi4.LL;
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
        c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
        EnumC1338240kve enumC1338240kve = EnumC1338240kve.CENTER;
        c1331670kl3LIZLLL.LJIILIIL = R.drawable.b5l;
        c1331670kl3LIZLLL.LJIILLIIL = enumC1338240kve;
        c1331670kl3LIZLLL.LIZLLL("CommerceHeadVH");
        c1331670kl3LIZLLL.LJJ(smartImageView);
        C1750100vdw.LIZ(c1331670kl3LIZLLL, c1406700mi4.LL, LifecycleOwnerKt.getLifecycleScope(this));
        c1331670kl3LIZLLL.LJIIJ(new C1776120wJu(c1066100dqi, 2));
    }
}
