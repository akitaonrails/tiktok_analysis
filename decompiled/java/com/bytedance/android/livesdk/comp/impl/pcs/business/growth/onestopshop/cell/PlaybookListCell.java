package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C16F5;
import X.C1820540xTY;
import X.C1820640xTi;
import X.C1820650xTj;
import X.C1820930xUB;
import X.C1821010xUJ;
import X.C1832760xnG;
import X.C1832770xnH;
import X.C1832780xnI;
import X.C1832790xnJ;
import X.C1832800xnK;
import X.C1832810xnL;
import X.C1832820xnM;
import X.C1832830xnN;
import X.C1832840xnO;
import X.C1832850xnP;
import X.C1832860xnQ;
import X.C1832870xnR;
import X.C1832880xnS;
import X.C1832890xnT;
import X.C1832900xnU;
import X.C1832910xnV;
import X.C1832920xnW;
import X.C1832930xnX;
import X.C1832940xnY;
import X.C1832950xnZ;
import X.C1832960xna;
import X.C1832970xnb;
import X.C1832980xnc;
import X.C1832990xnd;
import X.C1833000xne;
import X.C1833010xnf;
import X.C1833020xng;
import X.C1833030xnh;
import X.C1833040xni;
import X.C1833050xnj;
import X.C1833070xnl;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C500260Jjc;
import X.C520010KaN;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell.PlaybookListCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.OneStopPageVM;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PlaybookListCell extends PowerCell<C1820930xUB> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILLJJLI;
    public C16F5 LLILLL;
    public LinearLayout LLILZ;
    public LinearLayout LLILZIL;
    public C16F5 LLILZLL;
    public LiveIconView LLIZ;
    public final int LLIZLLLIL;
    public List<C1821010xUJ> LLJ;
    public boolean LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PlaybookListCell.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/onestopshop/vm/OneStopPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void I5() {
        List<C1821010xUJ> listLL;
        C20600815jK<InterfaceC1891350zJl> state;
        if (this.LLJI) {
            listLL = this.LLJ;
            C500260Jjc.LJIILIIL(this.LLILZ);
        } else {
            listLL = C13LP.LL(this.LLJ, this.LLIZLLLIL);
            C500260Jjc.LLFFF(this.LLILZ);
            C16F5 c16f5 = this.LLILZLL;
            if (c16f5 != null) {
                Context context = getContext();
                c16f5.setText(context != null ? context.getString(2131856001) : null);
            }
            LiveIconView liveIconView = this.LLIZ;
            if (liveIconView != null) {
                liveIconView.setIcon(R.raw.icon_chevron_down);
            }
            LinearLayout linearLayout = this.LLILZ;
            if (linearLayout != null) {
                C786410Ut5.R7(linearLayout, new View.OnClickListener() { // from class: X.0xnk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PlaybookListCell playbookListCell = this.LL;
                        playbookListCell.LLJI = true;
                        playbookListCell.I5();
                    }
                });
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLJJLI;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (state = viewOnAttachStateChangeListenerC20604515jv.getState()) == null) {
            return;
        }
        if (listLL == null) {
            listLL = null;
        }
        state.LJIILL(listLL, null);
    }

    public PlaybookListCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OneStopPageVM.class);
        C1832780xnI c1832780xnI = new C1832780xnI(c19719912DlLIZ);
        C1833070xnl c1833070xnl = new C1833070xnl();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C1833050xnj(c19719912DlLIZ), c1832780xnI, new C1832960xna(), new C1832880xnS(this), new C1832800xnK(this), new C1833000xne(this), c1833070xnl, new C1832770xnH(this), null, new C1832810xnL(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1832860xnQ c1832860xnQ = new C1832860xnQ(this);
            C1832990xnd c1832990xnd = new C1832990xnd(this);
            C1833020xng c1833020xng = new C1833020xng(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1832950xnZ((InterfaceC451590HnJ) obj, c1832860xnQ));
            C1832900xnU c1832900xnU = new C1832900xnU(c01gwLIZIZ);
            C1832910xnV c1832910xnV = new C1832910xnV(c01gwLIZIZ);
            C1832920xnW c1832920xnW = new C1832920xnW(c01gwLIZIZ);
            C1832930xnX c1832930xnX = new C1832930xnX(c01gwLIZIZ);
            C1832940xnY c1832940xnY = new C1832940xnY(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c1833020xng, c1832780xnI, new C452080Ho6(), c1832900xnU, c1832910xnV, c1832990xnd, c1833070xnl, c1832920xnW, c1832930xnX, c1832940xnY);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C1833030xnh(c19719912DlLIZ), c1832780xnI, new C1832970xnb(), new C1832890xnT(this), new C1832850xnP(this), new C1833010xnf(this), c1833070xnl, new C1832760xnG(this), null, new C1832820xnM(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C1833040xni(c19719912DlLIZ), c1832780xnI, new C1832980xnc(), new C1832870xnR(this), new C1832830xnN(this), new C1832840xnO(this), c1833070xnl, null, null, new C1832790xnJ(this));
        }
        this.LL = assemVMLazy;
        this.LLIZLLLIL = 2;
        this.LLJ = C13BV.INSTANCE;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1820930xUB c1820930xUB = (C1820930xUB) interfaceC1891350zJl;
        super.onBindItemView(c1820930xUB);
        LinearLayout linearLayout = this.LLILZIL;
        Context context = getContext();
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C1820540xTY.LIZ(context, linearLayout, ((OneStopPageVM) assemVMLazy.getValue()).LLILZ);
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            c16f5.setText(c1820930xUB.LL);
        }
        List<C1821010xUJ> list = c1820930xUB.LLILLJJLI;
        this.LLJ = list;
        if (list.size() <= this.LLIZLLLIL) {
            this.LLJI = true;
        }
        I5();
        C1820640xTi.LIZLLL("playbook", "show", ((OneStopPageVM) this.LL.getValue()).LLILZIL.LIZ, new C1820650xTj(null, null, null, null, null, 31));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        IHostCreativeTool iHostCreativeTool;
        LifecycleOwner parent;
        View viewInflateItemView$default = PowerCell.inflateItemView$default(this, viewGroup, R.layout.gts, false, 4, null);
        this.LLILLJJLI = (ViewOnAttachStateChangeListenerC20604515jv) viewInflateItemView$default.findViewById(R.id.qrs);
        this.LLILZIL = (LinearLayout) viewInflateItemView$default.findViewById(R.id.qrw);
        this.LLILLL = (C16F5) viewInflateItemView$default.findViewById(R.id.qrx);
        this.LLILZ = (LinearLayout) viewInflateItemView$default.findViewById(R.id.qrt);
        this.LLILZLL = (C16F5) viewInflateItemView$default.findViewById(R.id.qrv);
        this.LLIZ = (LiveIconView) viewInflateItemView$default.findViewById(R.id.qru);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLJJLI;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (iHostCreativeTool = C520010KaN.LIZ) != null && iHostCreativeTool.UC0() && (parent = getParent()) != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(parent);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILLJJLI;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(PlaybookCell.class);
        }
        return viewInflateItemView$default;
    }
}
