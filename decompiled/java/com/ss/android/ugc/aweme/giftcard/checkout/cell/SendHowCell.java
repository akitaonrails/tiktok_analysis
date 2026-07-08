package com.ss.android.ugc.aweme.giftcard.checkout.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0DL6;
import X.C0TVI;
import X.C1203130hPj;
import X.C1203140hPk;
import X.C1203200hPq;
import X.C13LE;
import X.C14K9;
import X.C15438062q;
import X.C1582480rHa;
import X.C1712540ufM;
import X.C1748330vb5;
import X.C1748440vbG;
import X.C1876107Wl;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1388090mE3;
import X.InterfaceC1203170hPn;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ARunnableS126S0100000_26;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.giftcard.checkout.CheckRule;
import com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutVM;
import com.ss.android.ugc.aweme.giftcard.checkout.GiftCardNotifyShowItem;
import com.ss.android.ugc.aweme.giftcard.checkout.cell.SendHowCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS38S0010000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class SendHowCell extends PowerCell<C1876107Wl> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public int LLILLJJLI;
    public long LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SendHowCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/giftcard/checkout/GiftCardCheckoutVM;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ccl;
    }

    public SendHowCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GiftCardCheckoutVM.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 723);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(327);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 734), awS570S0100000_26, AFwS215S0000000_26.get$arr$(200), new AwS570S0100000_26((C03K6) this, 709), new AwS570S0100000_26((C03K6) this, 711), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 713), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 715), null, new AwS570S0100000_26((C03K6) this, 716));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 710);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 712);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 714);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 42));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 717);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 718);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 719);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 720);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 721);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 722), awS570S0100000_26, AFwS215S0000000_26.get$arr$(198), new AwS570S0100000_26((C03K6) this, 724), new AwS570S0100000_26((C03K6) this, 725), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 726), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 727), null, new AwS570S0100000_26((C03K6) this, 728));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 729), awS570S0100000_26, AFwS215S0000000_26.get$arr$(199), new AwS570S0100000_26((C03K6) this, 730), new AwS570S0100000_26((C03K6) this, 731), new AwS570S0100000_26((C03K6) this, 732), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 733));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C19EG activity;
        final View viewFindViewById;
        final C1876107Wl c1876107Wl = (C1876107Wl) interfaceC1891350zJl;
        super.onBindItemView(c1876107Wl);
        ((TextView) this.itemView.findViewById(R.id.upl)).setText(c1876107Wl.LL);
        View viewFindViewById2 = this.itemView.findViewById(R.id.upk);
        C1203130hPj c1203130hPj = (C1203130hPj) this.itemView.findViewById(R.id.upj);
        View viewFindViewById3 = this.itemView.findViewById(R.id.fz3);
        final C1748440vbG c1748440vbG = (C1748440vbG) this.itemView.findViewById(R.id.f723j0b);
        final C1748330vb5 c1748330vb5 = (C1748330vb5) this.itemView.findViewById(R.id.j0c);
        if (c1876107Wl.LLILLJJLI.size() <= 1) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            C786410Ut5.LLLLLLL(c1203130hPj, 8);
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
            L5(c1748330vb5, c1748440vbG, this, c1876107Wl);
        } else {
            int i = 0;
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            C786410Ut5.LLLLLLL(c1203130hPj, 0);
            C786410Ut5.LJLLLLLL(0, viewFindViewById3);
            c1203130hPj.setHorizontalMargin(0);
            List<GiftCardNotifyShowItem> list = c1876107Wl.LLILLJJLI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<GiftCardNotifyShowItem> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().label;
                if (str == null) {
                    str = "";
                }
                arrayList.add(new C1203140hPk(str, null, 14));
            }
            c1203130hPj.setChips(arrayList);
            c1203130hPj.setSelectionStyle(new C1582480rHa(null, null, null, null));
            c1203130hPj.setOnSelectedChangeListener(new InterfaceC1203170hPn() { // from class: X.0ugB
                @Override // X.InterfaceC1203170hPn
                public final void LIZ(int i2, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
                    if (z) {
                        SendHowCell sendHowCell = this;
                        sendHowCell.LLILLJJLI = i2;
                        SendHowCell.L5(c1748330vb5, c1748440vbG, sendHowCell, c1876107Wl);
                    }
                }
            });
            Iterator<GiftCardNotifyShowItem> it3 = c1876107Wl.LLILLJJLI.iterator();
            int i2 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it3.next().defaultChoose, Boolean.TRUE)) {
                    if (i2 >= 0) {
                        i = i2;
                    }
                } else {
                    i2++;
                }
            }
            c1203130hPj.LIZ(i, true, C1203200hPq.LIZ);
        }
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null && (activity = currentFragment.getActivity()) != null && (viewFindViewById = activity.findViewById(android.R.id.content)) != null) {
            C14K9.LJIJJ(viewFindViewById, new C0TVI() { // from class: X.0ukJ
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    if (!c20246014Ju.LJIIIIZZ(8)) {
                        HandlerHook.viewPostDelay(viewFindViewById, new ARunnableS126S0100000_26(this, viewFindViewById, 114), 100L);
                    }
                    return c20246014Ju;
                }
            });
        }
    }

    public static String I5(String str, List list) {
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            CheckRule checkRule = (CheckRule) it2.next();
            String str2 = checkRule.regex;
            if (str2 != null && !new Regex(a0.LJLIIIL(str2).toString()).matches(str)) {
                return checkRule.errorMsg;
            }
        }
        return null;
    }

    public static final void L5(final C1748330vb5 c1748330vb5, final C1748440vbG c1748440vbG, final SendHowCell sendHowCell, final C1876107Wl c1876107Wl) {
        Integer num;
        c1748440vbG.setSingleLine(true);
        c1748440vbG.setMaxLines(1);
        c1748440vbG.setImeOptions(6);
        c1748440vbG.setPlaceholderText(((GiftCardNotifyShowItem) ListProtector.get(c1876107Wl.LLILLJJLI, sendHowCell.LLILLJJLI)).placeholder);
        String str = ((GiftCardNotifyShowItem) ListProtector.get(c1876107Wl.LLILLJJLI, sendHowCell.LLILLJJLI)).notifyMethod;
        if (str != null && u.LJIJI(str, EnumC1388090mE3.EMAIL.getValue(), true) && (num = C1712540ufM.LIZ().formConfig.emailMaxLen) != null) {
            c1748440vbG.setMaxLength(num.intValue());
        }
        c1748440vbG.LJIILLIIL(true);
        c1748440vbG.setEditTextOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0ug9
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                boolean z2;
                int i;
                String str2;
                String str3 = "";
                if (!z) {
                    String strValueOf = String.valueOf(c1748440vbG.getText());
                    SendHowCell sendHowCell2 = sendHowCell;
                    C1748330vb5 c1748330vb52 = c1748330vb5;
                    C1748440vbG c1748440vbG2 = c1748440vbG;
                    C1876107Wl c1876107Wl2 = c1876107Wl;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SendHowCell.LLILZ;
                    List<CheckRule> list = ((GiftCardNotifyShowItem) ListProtector.get(c1876107Wl2.LLILLJJLI, sendHowCell2.LLILLJJLI)).verifyRules;
                    String strI5 = SendHowCell.I5(strValueOf, list);
                    if (strI5 != null) {
                        c1748330vb52.setMessage(strI5);
                        C786410Ut5.LLLLLLLZIL(c1748330vb52, 0);
                        c1748440vbG2.setValidationStatus(3);
                        z2 = false;
                    } else {
                        c1748330vb52.setMessage("");
                        C786410Ut5.LLLLLLLZIL(c1748330vb52, 8);
                        c1748440vbG2.setValidationStatus(0);
                        z2 = true;
                    }
                    C1714100uhs c1714100uhs = C1714100uhs.LIZ;
                    if (strValueOf.length() == 0) {
                        str3 = "normal";
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - sendHowCell2.LLILLL;
                    if (list != null && !list.isEmpty()) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    c1714100uhs.getClass();
                    Pair[] pairArr = new Pair[7];
                    pairArr[0] = new Pair("input_method", str3);
                    pairArr[1] = new Pair("event_type", "fillin");
                    pairArr[2] = new Pair("input_box_id", "recipient_email_address");
                    pairArr[3] = new Pair("fillin_duration", Long.valueOf(jCurrentTimeMillis));
                    pairArr[4] = new Pair("is_verification_exist", Integer.valueOf(i ^ 1));
                    if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                        str2 = "pass";
                    } else {
                        str2 = "fail";
                    }
                    pairArr[5] = new Pair("verification_status", str2);
                    pairArr[6] = new Pair("verification_err_msg", strI5);
                    C1714100uhs.LIZIZ("pipo_input_fillin", C2097608Jq.LJIIJ(pairArr));
                    return;
                }
                C1748330vb5 c1748330vb53 = c1748330vb5;
                C1748440vbG c1748440vbG3 = c1748440vbG;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = SendHowCell.LLILZ;
                c1748330vb53.setMessage("");
                C786410Ut5.LLLLLLLZIL(c1748330vb53, 8);
                c1748440vbG3.setValidationStatus(0);
                sendHowCell.LLILLL = System.currentTimeMillis();
                C1714100uhs.LIZ.getClass();
                C1714100uhs.LIZIZ("pipo_input_click", C2097608Jq.LJIIJ(new Pair("event_type", "click"), new Pair("input_box_id", "recipient_email_address")));
            }
        });
        c1748440vbG.LIZ(new C0DL6() { // from class: X.0ugA
            @Override // X.C0DL6, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string = editable.toString();
                List<CheckRule> list = ((GiftCardNotifyShowItem) ListProtector.get(c1876107Wl.LLILLJJLI, sendHowCell.LLILLJJLI)).verifyRules;
                String str2 = ((GiftCardNotifyShowItem) ListProtector.get(c1876107Wl.LLILLJJLI, sendHowCell.LLILLJJLI)).notifyMethod;
                sendHowCell.getClass();
                String strI5 = SendHowCell.I5(string, list);
                AssemVMLazy assemVMLazy = sendHowCell.LL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SendHowCell.LLILZ;
                boolean z = false;
                GiftCardCheckoutVM giftCardCheckoutVM = (GiftCardCheckoutVM) assemVMLazy.getValue();
                if (strI5 == null) {
                    z = true;
                }
                if (str2 == null) {
                    str2 = "";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(z);
                sbLIZ.append(", ");
                sbLIZ.append(string);
                sbLIZ.append(", ");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
                giftCardCheckoutVM.LLILLL = str2;
                giftCardCheckoutVM.LLILLJJLI = string;
                giftCardCheckoutVM.setState(new AwS38S0010000_26(z, 14));
            }
        });
    }
}
