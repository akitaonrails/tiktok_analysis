package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03DZ;
import X.C03IJ;
import X.C03K6;
import X.C0H1U;
import X.C0H9H;
import X.C0HTI;
import X.C13LE;
import X.C14EU;
import X.C1712320uf0;
import X.C1713070ugD;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C345890DhD;
import X.C452080Ho6;
import X.C452501pT;
import X.C679280Qkg;
import X.C737910Sx3;
import X.C770750ULh;
import X.C786410Ut5;
import X.C894903ed;
import X.C933503kr;
import X.C960303pB;
import X.EnumC1712310uez;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS160S0100000_26;
import Y.ARunnableS126S0100000_26;
import Y.ARunnableS70S0200000_1;
import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes27.dex */
public final class CCDCNfcScanTipsViewHolder extends PowerCell<C960303pB> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(106));
    public TuxSheet LLILLJJLI;
    public TuxSheet LLILLL;
    public EnumC1712310uez LLILZ;
    public final AssemVMLazy LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final ARunnableS126S0100000_26 LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CCDCNfcScanTipsViewHolder.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CCDCNfcScanTipsViewHolder() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 389);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(203);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 374), awS570S0100000_26, AFwS215S0000000_26.get$arr$(108), new AwS570S0100000_26((C03K6) this, 375), new AwS570S0100000_26((C03K6) this, 377), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 379), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 381), null, new AwS570S0100000_26((C03K6) this, 382));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 376);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 378);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 380);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 22));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 383);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 384);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 385);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 386);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 387);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 388), awS570S0100000_26, AFwS215S0000000_26.get$arr$(109), new AwS570S0100000_26((C03K6) this, 390), new AwS570S0100000_26((C03K6) this, 361), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 362), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 363), null, new AwS570S0100000_26((C03K6) this, 364));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 366), awS570S0100000_26, AFwS215S0000000_26.get$arr$(107), new AwS570S0100000_26((C03K6) this, 369), new AwS570S0100000_26((C03K6) this, 371), new AwS570S0100000_26((C03K6) this, 372), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 373));
        }
        this.LLILZIL = assemVMLazy;
        this.LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 365));
        this.LLIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 368));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 370));
        this.LLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 367));
        this.LLJI = new ARunnableS126S0100000_26(this, 25);
    }

    public final LinearLayout I5() {
        return (LinearLayout) this.LLILZLL.getValue();
    }

    public final CCDCAddCardViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (CCDCAddCardViewModel) assemVMLazy.getValue();
    }

    public final void N5() {
        EnumC1712310uez enumC1712310uez = this.LLILZ;
        C933503kr.LIZ.getClass();
        EnumC1712310uez enumC1712310uez2 = C933503kr.LIZIZ;
        if (enumC1712310uez == enumC1712310uez2) {
            return;
        }
        this.LLILZ = enumC1712310uez2;
        if (enumC1712310uez2 != null) {
            int i = C1712320uf0.LIZ[enumC1712310uez2.ordinal()];
            if (i == 1) {
                C03DZ.LIZJ(I5());
                C03DZ.LIZJ((View) this.LLIZ.getValue());
                C0H1U.LIZIZ((View) this.LLIZLLLIL.getValue());
                ((TextView) this.LLJ.getValue()).setText(this.itemView.getContext().getString(2131832879));
                return;
            }
            if (i == 2) {
                C03DZ.LIZJ(I5());
                C03DZ.LIZJ((View) this.LLIZ.getValue());
                C0H1U.LIZIZ((View) this.LLIZLLLIL.getValue());
                ((TextView) this.LLJ.getValue()).setText(this.itemView.getContext().getString(2131832881));
                return;
            }
            if (i == 3) {
                C0H1U.LIZIZ(I5());
            } else if (i == 4) {
                C03DZ.LIZJ(I5());
                C0H1U.LIZIZ((View) this.LLIZ.getValue());
                C03DZ.LIZJ((View) this.LLIZLLLIL.getValue());
                ((TextView) this.LLJ.getValue()).setText(this.itemView.getContext().getString(2131832880));
            }
        }
    }

    public final void R5() {
        int i = ((Keva) this.LL.getValue()).getInt("pipo_tts_ccdc_nfc_show_acount", 0);
        if (i % 5 == 0) {
            HandlerHook.viewRemoveCallbacks(this.itemView, this.LLJI);
            HandlerHook.viewPostDelay(this.itemView, this.LLJI, 50L);
        }
        ((Keva) this.LL.getValue()).storeInt("pipo_tts_ccdc_nfc_show_acount", i + 1);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        HandlerHook.viewRemoveCallbacks(this.itemView, this.LLJI);
        super.onViewDetachedFromWindow();
        C1713070ugD.LIZIZ(this);
    }

    public final void P5() {
        FragmentManager fragmentManager;
        C960303pB item;
        Activity activity;
        C960303pB item2 = getItem();
        if (item2 == null || (fragmentManager = item2.LL) == null) {
            return;
        }
        C770750ULh c770750ULh = new C770750ULh();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.x8;
        c770750ULh.LIZ = c0hti.LIZ(this.itemView.getContext());
        c770750ULh.LIZLLL = 2;
        c770750ULh.LJ = this.itemView.getContext().getString(2131832804);
        c770750ULh.LJFF(new C345890DhD(this.itemView.getContext().getString(2131832800), true), new C345890DhD(this.itemView.getContext().getString(2131832801), true));
        c770750ULh.LJI(this.itemView.getContext().getString(2131832803), new AwS580S0100000_1(this, 144));
        c770750ULh.LJII(this.itemView.getContext().getString(2131832802), AFwS268S0000000_26.get$arr$(204));
        c770750ULh.LJIILLIIL = true;
        TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
        this.LLILLJJLI = tuxSheet;
        if (tuxSheet != null) {
            tuxSheet.show(fragmentManager, "NFC_ENABLE");
        }
        C960303pB item3 = getItem();
        if (item3 == null || !item3.LLILZ || (item = getItem()) == null || (activity = item.LLILLJJLI) == null) {
            return;
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS70S0200000_1(this, activity, 4));
    }

    public final void S5() {
        FragmentManager fragmentManager;
        C960303pB item;
        Activity activity;
        C960303pB item2 = getItem();
        if (item2 == null || (fragmentManager = item2.LL) == null) {
            return;
        }
        C770750ULh c770750ULh = new C770750ULh();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.xl;
        c770750ULh.LIZ = c0hti.LIZ(this.itemView.getContext());
        c770750ULh.LIZLLL = 2;
        c770750ULh.LJ = this.itemView.getContext().getString(2131833152);
        c770750ULh.LJFF(new C345890DhD(this.itemView.getContext().getString(2131833149), true), new C345890DhD(this.itemView.getContext().getString(2131833150), true), new C345890DhD(this.itemView.getContext().getString(2131833151), true));
        c770750ULh.LJI(this.itemView.getContext().getString(2131833064), AFwS268S0000000_26.get$arr$(205));
        c770750ULh.LJIILLIIL = true;
        TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
        this.LLILLL = tuxSheet;
        if (tuxSheet != null) {
            tuxSheet.show(fragmentManager, "NFC_SCAN");
        }
        C960303pB item3 = getItem();
        if (item3 == null || !item3.LLILZ || (item = getItem()) == null || (activity = item.LLILLJJLI) == null) {
            return;
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS70S0200000_1(this, activity, 5));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C1713070ugD.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        N5();
        R5();
        if (Intrinsics.LJFF(((C960303pB) interfaceC1891350zJl).LLILLL, Boolean.TRUE)) {
            C0H9H.LJI(C679280Qkg.LIZ(8), I5());
        } else {
            C0H9H.LJI(C679280Qkg.LIZ(24), I5());
        }
        C786410Ut5.R7(I5(), new ACListenerS160S0100000_26(this, 68));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aqa, viewGroup, false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEcCCDCNfcStatusEvent(C894903ed c894903ed) {
        if (this.LLILZ == EnumC1712310uez.NOT_ENABLED && c894903ed.LIZ == EnumC1712310uez.ENABLED) {
            ((Keva) this.LL.getValue()).storeInt("pipo_tts_ccdc_nfc_show_acount", 0);
            R5();
        }
        N5();
    }
}
