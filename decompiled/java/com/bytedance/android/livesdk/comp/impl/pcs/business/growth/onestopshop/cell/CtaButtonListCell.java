package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C13LE;
import X.C16F5;
import X.C1820540xTY;
import X.C1820920xUA;
import X.C1832140xmG;
import X.C1832150xmH;
import X.C1832160xmI;
import X.C1832170xmJ;
import X.C1832180xmK;
import X.C1832190xmL;
import X.C1832200xmM;
import X.C1832210xmN;
import X.C1832220xmO;
import X.C1832230xmP;
import X.C1832240xmQ;
import X.C1832250xmR;
import X.C1832260xmS;
import X.C1832270xmT;
import X.C1832280xmU;
import X.C1832290xmV;
import X.C1832300xmW;
import X.C1832310xmX;
import X.C1832320xmY;
import X.C1832330xmZ;
import X.C1832340xma;
import X.C1832350xmb;
import X.C1832360xmc;
import X.C1832370xmd;
import X.C1832380xme;
import X.C1832390xmf;
import X.C1832400xmg;
import X.C1832410xmh;
import X.C1832420xmi;
import X.C1832430xmj;
import X.C1832440xmk;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C520010KaN;
import X.C737910Sx3;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.OneStopPageVM;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class CtaButtonListCell extends PowerCell<C1820920xUA> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILLJJLI;
    public C16F5 LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CtaButtonListCell.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/onestopshop/vm/OneStopPageVM;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CtaButtonListCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OneStopPageVM.class);
        C1832160xmI c1832160xmI = new C1832160xmI(c19719912DlLIZ);
        C1832440xmk c1832440xmk = new C1832440xmk();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C1832430xmj(c19719912DlLIZ), c1832160xmI, new C1832360xmc(), new C1832260xmS(this), new C1832180xmK(this), new C1832380xme(this), c1832440xmk, new C1832150xmH(this), null, new C1832190xmL(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1832240xmQ c1832240xmQ = new C1832240xmQ(this);
            C1832370xmd c1832370xmd = new C1832370xmd(this);
            C1832400xmg c1832400xmg = new C1832400xmg(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1832330xmZ((InterfaceC451590HnJ) obj, c1832240xmQ));
            C1832280xmU c1832280xmU = new C1832280xmU(c01gwLIZIZ);
            C1832290xmV c1832290xmV = new C1832290xmV(c01gwLIZIZ);
            C1832300xmW c1832300xmW = new C1832300xmW(c01gwLIZIZ);
            C1832310xmX c1832310xmX = new C1832310xmX(c01gwLIZIZ);
            C1832320xmY c1832320xmY = new C1832320xmY(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c1832400xmg, c1832160xmI, new C452080Ho6(), c1832280xmU, c1832290xmV, c1832370xmd, c1832440xmk, c1832300xmW, c1832310xmX, c1832320xmY);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C1832410xmh(c19719912DlLIZ), c1832160xmI, new C1832340xma(), new C1832270xmT(this), new C1832230xmP(this), new C1832390xmf(this), c1832440xmk, new C1832140xmG(this), null, new C1832200xmM(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C1832420xmi(c19719912DlLIZ), c1832160xmI, new C1832350xmb(), new C1832250xmR(this), new C1832210xmN(this), new C1832220xmO(this), c1832440xmk, null, null, new C1832170xmJ(this));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C20600815jK<InterfaceC1891350zJl> state;
        C1820920xUA c1820920xUA = (C1820920xUA) interfaceC1891350zJl;
        super.onBindItemView(c1820920xUA);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLJJLI;
        Context context = getContext();
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        C1820540xTY.LIZ(context, viewOnAttachStateChangeListenerC20604515jv, ((OneStopPageVM) assemVMLazy.getValue()).LLILZ);
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            c16f5.setText(c1820920xUA.LL);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILLJJLI;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            state.LJIILL(c1820920xUA.LLILLJJLI, null);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        IHostCreativeTool iHostCreativeTool;
        LifecycleOwner parent;
        View viewInflateItemView$default = PowerCell.inflateItemView$default(this, viewGroup, R.layout.gtp, false, 4, null);
        this.LLILLJJLI = (ViewOnAttachStateChangeListenerC20604515jv) viewInflateItemView$default.findViewById(R.id.fa4);
        this.LLILLL = (C16F5) viewInflateItemView$default.findViewById(R.id.fa5);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLJJLI;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (iHostCreativeTool = C520010KaN.LIZ) != null && iHostCreativeTool.UC0() && (parent = getParent()) != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(parent);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILLJJLI;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(CtaButtonCell.class);
        }
        return viewInflateItemView$default;
    }
}
