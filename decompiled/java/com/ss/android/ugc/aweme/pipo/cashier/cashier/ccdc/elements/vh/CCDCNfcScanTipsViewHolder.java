package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0HTI;
import X.C12ES;
import X.C13LE;
import X.C14EU;
import X.C1708610uZ1;
import X.C1709950ubB;
import X.C1710770ucV;
import X.C1710970ucp;
import X.C1712080uec;
import X.C1722120uuo;
import X.C19719912Dl;
import X.C21569319b9;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C345890DhD;
import X.C452080Ho6;
import X.C452501pT;
import X.C622680Oba;
import X.C737910Sx3;
import X.C770750ULh;
import X.C786410Ut5;
import X.C960403pC;
import X.C991750bun;
import X.EnumC1712090ued;
import X.InterfaceC1709310ua9;
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
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes27.dex */
public final class CCDCNfcScanTipsViewHolder extends PowerCell<C960403pC> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(231));
    public TuxSheet LLILLJJLI;
    public TuxSheet LLILLL;
    public EnumC1712090ued LLILZ;
    public final AssemVMLazy LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final ARunnableS126S0100000_26 LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CCDCNfcScanTipsViewHolder.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/pipo/cashier/cashier/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CCDCNfcScanTipsViewHolder() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 1057);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(404);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 1042), awS570S0100000_26, AFwS215S0000000_26.get$arr$(233), new AwS570S0100000_26((C03K6) this, 1043), new AwS570S0100000_26((C03K6) this, 1045), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1047), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 1049), null, new AwS570S0100000_26((C03K6) this, 1050));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 1044);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1046);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 1048);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 52));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 1051);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 1052);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 1053);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 1054);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 1055);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 1056), awS570S0100000_26, AFwS215S0000000_26.get$arr$(234), new AwS570S0100000_26((C03K6) this, 1058), new AwS570S0100000_26((C03K6) this, 1029), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1030), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 1031), null, new AwS570S0100000_26((C03K6) this, 1032));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 1034), awS570S0100000_26, AFwS215S0000000_26.get$arr$(232), new AwS570S0100000_26((C03K6) this, 1037), new AwS570S0100000_26((C03K6) this, 1039), new AwS570S0100000_26((C03K6) this, 1040), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 1041));
        }
        this.LLILZIL = assemVMLazy;
        this.LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1033));
        this.LLIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1036));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1038));
        this.LLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1035));
        this.LLJI = new ARunnableS126S0100000_26(this, 50);
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
        EnumC1712090ued enumC1712090ued = this.LLILZ;
        C1710970ucp.LIZ.getClass();
        EnumC1712090ued enumC1712090ued2 = C1710970ucp.LIZIZ;
        if (enumC1712090ued == enumC1712090ued2) {
            return;
        }
        this.LLILZ = enumC1712090ued2;
        if (enumC1712090ued2 != null) {
            int i = C1712080uec.LIZ[enumC1712090ued2.ordinal()];
            if (i == 1) {
                C12ES.LJIILL(0, I5());
                C12ES.LJIILL(0, (View) this.LLIZ.getValue());
                C1709950ubB.LIZ((View) this.LLIZLLLIL.getValue());
                ((TextView) this.LLJ.getValue()).setText(this.itemView.getContext().getString(2131832879));
                return;
            }
            if (i == 2) {
                C12ES.LJIILL(0, I5());
                C12ES.LJIILL(0, (View) this.LLIZ.getValue());
                C1709950ubB.LIZ((View) this.LLIZLLLIL.getValue());
                ((TextView) this.LLJ.getValue()).setText(this.itemView.getContext().getString(2131832881));
                return;
            }
            if (i == 3) {
                C1709950ubB.LIZ(I5());
            } else if (i == 4) {
                C12ES.LJIILL(0, I5());
                C1709950ubB.LIZ((View) this.LLIZ.getValue());
                C12ES.LJIILL(0, (View) this.LLIZLLLIL.getValue());
                ((TextView) this.LLJ.getValue()).setText(this.itemView.getContext().getString(2131832880));
            }
        }
    }

    public final void R5() {
        int i = ((Keva) this.LL.getValue()).getInt("pipo_ccdc_nfc_show_acount", 0);
        if (i % 5 == 0) {
            HandlerHook.viewRemoveCallbacks(this.itemView, this.LLJI);
            HandlerHook.viewPostDelay(this.itemView, this.LLJI, 50L);
        }
        ((Keva) this.LL.getValue()).storeInt("pipo_ccdc_nfc_show_acount", i + 1);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C622680Oba.LIZLLL(this);
    }

    public final void P5(boolean z) {
        FragmentManager fragmentManager;
        String str;
        String str2;
        C960403pC item;
        Activity activity;
        C960403pC item2 = getItem();
        if (item2 != null && (fragmentManager = item2.LL) != null) {
            C770750ULh c770750ULh = new C770750ULh();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.x8;
            c770750ULh.LIZ = c0hti.LIZ(this.itemView.getContext());
            c770750ULh.LIZLLL = 2;
            c770750ULh.LJ = this.itemView.getContext().getString(2131832804);
            c770750ULh.LJFF(new C345890DhD(this.itemView.getContext().getString(2131832800), true), new C345890DhD(this.itemView.getContext().getString(2131832801), true));
            c770750ULh.LJI(this.itemView.getContext().getString(2131832803), new AwS605S0100000_26(this, 353));
            c770750ULh.LJII(this.itemView.getContext().getString(2131832802), AFwS268S0000000_26.get$arr$(405));
            c770750ULh.LJIILLIIL = true;
            TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
            this.LLILLJJLI = tuxSheet;
            if (tuxSheet != null) {
                tuxSheet.show(fragmentManager, "NFC_ENABLE");
            }
            C960403pC item3 = getItem();
            if (item3 != null && item3.LLILZIL && (item = getItem()) != null && (activity = item.LLILLJJLI) != null) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS70S0200000_1(this, activity, 10));
            }
            C960403pC item4 = getItem();
            if (item4 == null || (str = item4.LLILZ) == null) {
                str = "nfc";
            }
            InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str);
            HashMap map = new HashMap();
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("auto", str2);
            interfaceC1709310ua9LIZIZ.LIZ("rd_pipo_enable_sheet_show", map);
        }
    }

    public final void S5(boolean z) {
        FragmentManager fragmentManager;
        String str;
        String str2;
        C960403pC item;
        Activity activity;
        C960403pC item2 = getItem();
        if (item2 != null && (fragmentManager = item2.LL) != null) {
            C770750ULh c770750ULh = new C770750ULh();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.xl;
            c770750ULh.LIZ = c0hti.LIZ(this.itemView.getContext());
            c770750ULh.LIZLLL = 2;
            c770750ULh.LJ = this.itemView.getContext().getString(2131833152);
            c770750ULh.LJFF(new C345890DhD(this.itemView.getContext().getString(2131833149), true), new C345890DhD(this.itemView.getContext().getString(2131833150), true), new C345890DhD(this.itemView.getContext().getString(2131833151), true));
            c770750ULh.LJI(this.itemView.getContext().getString(2131833064), AFwS268S0000000_26.get$arr$(406));
            c770750ULh.LJIILLIIL = true;
            TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
            this.LLILLL = tuxSheet;
            if (tuxSheet != null) {
                tuxSheet.show(fragmentManager, "NFC_SCAN");
            }
            C960403pC item3 = getItem();
            if (item3 != null && item3.LLILZIL && (item = getItem()) != null && (activity = item.LLILLJJLI) != null) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS70S0200000_1(this, activity, 11));
            }
            C960403pC item4 = getItem();
            if (item4 == null || (str = item4.LLILZ) == null) {
                str = "nfc";
            }
            InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str);
            HashMap map = new HashMap();
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("auto", str2);
            interfaceC1709310ua9LIZIZ.LIZ("rd_pipo_scan_sheet_show", map);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C960403pC c960403pC = (C960403pC) interfaceC1891350zJl;
        C1710770ucV.LIZ(this.itemView, new C21569319b9(C1722120uuo.LIZJ(0), C1722120uuo.LIZJ(16), C1722120uuo.LIZJ(16), 48, true, 232));
        N5();
        R5();
        C960403pC item = getItem();
        if (item == null || (str = item.LLILZ) == null) {
            str = "nfc";
        }
        C1708610uZ1.LIZIZ(str).LIZ("rd_pipo_nfc_tips_show", new HashMap());
        if (Intrinsics.LJFF(c960403pC.LLILLL, Boolean.TRUE)) {
            LinearLayout linearLayoutI5 = I5();
            int iLIZ = C1722120uuo.LIZ(8);
            if (linearLayoutI5 != null) {
                ViewGroup.LayoutParams layoutParams = linearLayoutI5.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams2.topMargin = iLIZ;
                }
                linearLayoutI5.requestLayout();
            }
        } else {
            LinearLayout linearLayoutI52 = I5();
            int iLIZ2 = C1722120uuo.LIZ(24);
            if (linearLayoutI52 != null) {
                ViewGroup.LayoutParams layoutParams2 = linearLayoutI52.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.topMargin = iLIZ2;
                }
                linearLayoutI52.requestLayout();
            }
        }
        C786410Ut5.R7(I5(), new ACListenerS160S0100000_26(this, 44));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dvl, viewGroup, false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEcCCDCNfcStatusEvent(C991750bun c991750bun) {
        if (this.LLILZ == EnumC1712090ued.NOT_ENABLED && c991750bun.LIZ == EnumC1712090ued.ENABLED) {
            ((Keva) this.LL.getValue()).storeInt("pipo_ccdc_nfc_show_acount", 0);
            R5();
        }
        N5();
    }
}
