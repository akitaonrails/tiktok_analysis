package com.ss.android.ugc.aweme.ecommerce.base.payment.viewholder.ccdc;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0H9H;
import X.C123100dR;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C770702zh;
import X.C786410Ut5;
import X.C870703aj;
import X.C888903df;
import X.C943503mT;
import X.C958503ot;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS136S0100000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class USBARegionInputElementViewHolderV2 extends PowerCell<C888903df> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USBARegionInputElementViewHolderV2.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public USBARegionInputElementViewHolderV2() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1340);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(326);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1350), awS545S0100000_1, AFwS207S0000000_19.get$arr$(234), new AwS545S0100000_1((C03K6) this, 1332), new AwS545S0100000_1((C03K6) this, 1334), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1336), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1376), null, new AwS545S0100000_1((C03K6) this, 1338));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 1333);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1335);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 1337);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 87));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1377);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1378);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1379);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1380);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1381);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1339), awS545S0100000_1, AFwS207S0000000_19.get$arr$(235), new AwS545S0100000_1((C03K6) this, 1341), new AwS545S0100000_1((C03K6) this, 1342), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1343), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1382), null, new AwS545S0100000_1((C03K6) this, 1344));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1345), awS545S0100000_1, AFwS207S0000000_19.get$arr$(236), new AwS545S0100000_1((C03K6) this, 1346), new AwS545S0100000_1((C03K6) this, 1347), new AwS545S0100000_1((C03K6) this, 1348), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 1349));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(104));
    }

    public final CCDCAddCardViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (CCDCAddCardViewModel) assemVMLazy.getValue();
    }

    public final void L5(List<Region> list) {
        String strLJJLIIIJ;
        C958503ot c958503ot;
        EditText editText;
        if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS228S0000000_1.get$arr$(325), 31)) == null) {
            strLJJLIIIJ = "";
        }
        View view = this.itemView;
        if ((view instanceof C943503mT) && (c958503ot = (C958503ot) view) != null && (editText = c958503ot.getEditText()) != null) {
            editText.setText(strLJJLIIIJ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C958503ot c958503ot;
        String str;
        String str2;
        PaymentElement paymentElement;
        C888903df c888903df = (C888903df) interfaceC1891350zJl;
        super.onBindItemView(c888903df);
        C870703aj.LIZ(this.itemView, c888903df.LLILZIL);
        View view = this.itemView;
        view.setPadding(view.getPaddingLeft(), this.itemView.getPaddingTop(), C0H9H.LIZIZ(16), this.itemView.getPaddingBottom());
        ElementDTO elementDTO = c888903df.LLILLJJLI.get("eg_ccdc_global_billing_address_city");
        ElementDTO elementDTO2 = c888903df.LLILLJJLI.get("eg_ccdc_global_billing_address_state");
        CCDCAddCardViewModel cCDCAddCardViewModelI5 = I5();
        Map<String, ElementDTO> map = c888903df.LLILLJJLI;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<String, ElementDTO>> it2 = map.entrySet().iterator();
        while (true) {
            String str3 = null;
            if (!it2.hasNext()) {
                break;
            }
            List list = (List) ((LinkedHashMap) cCDCAddCardViewModelI5.LL).get(it2.next().getKey());
            if (list != null && (paymentElement = (PaymentElement) C13LP.LJJJLL(list)) != null) {
                str3 = paymentElement.paramValue;
            }
            arrayList.add(new Region(str3, null, null, null, null, null, null));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (C770702zh.LIZIZ(((Region) obj).name)) {
                arrayList2.add(obj);
            }
        }
        L5(arrayList2);
        View view2 = this.itemView;
        if ((view2 instanceof C943503mT) && (c958503ot = (C958503ot) view2) != null) {
            String str4 = "";
            if ((elementDTO == null || (str = elementDTO.displayName) == null) && (elementDTO2 == null || (str = elementDTO2.displayName) == null)) {
                str = "";
            }
            c958503ot.setTitle(str);
            if ((elementDTO != null && (str2 = elementDTO.placeholderDisplayName) != null) || (elementDTO2 != null && (str2 = elementDTO2.placeholderDisplayName) != null)) {
                str4 = str2;
            }
            c958503ot.setPlaceHolderText(str4);
            c958503ot.getEditText().setInputType(0);
            c958503ot.getEditText().setFocusable(false);
            c958503ot.getEditText().setFocusableInTouchMode(false);
            TuxIconView tuxIconView = new TuxIconView(c958503ot.getContext(), null, 0, 6, null);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_down;
            c419910GdJ.LIZJ = C0H9H.LIZIZ(20);
            c419910GdJ.LIZIZ = C0H9H.LIZIZ(20);
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.ub, tuxIconView.getContext());
            c419910GdJ.LJ = Integer.valueOf(R.attr.ub);
            tuxIconView.setTuxIcon(c419910GdJ);
            c958503ot.setEndInfoIcon(tuxIconView);
            C786410Ut5.N7(c958503ot.getEditText(), new ACListenerS136S0100000_1(this, 21));
            if (C123100dR.LIZ(c888903df.LLILLL)) {
                c958503ot.LJ(c888903df.LLILLL);
            } else {
                c888903df.LLILLL = null;
                c958503ot.LJ(null);
            }
        }
        I5().LLJILJILJ = new AwS367S0200000_1(this, c888903df, 245);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        return new C958503ot(context) { // from class: X.03mT
            public PaymentMethod LLJILJILJ;
            public ElementDTO LLJILLL;
            public List<Region> LLJJ = C13BV.INSTANCE;
            public Function0<Unit> LLJJI = AFwS185S0000000_1.get$arr$(152);

            public final ElementDTO getElementDTO() {
                return this.LLJILLL;
            }

            public final Function0<Unit> getOnSelect() {
                return this.LLJJI;
            }

            public final PaymentMethod getPaymentMethod() {
                return this.LLJILJILJ;
            }

            public final List<Region> getRegionList() {
                return this.LLJJ;
            }

            @Override // X.C958503ot
            public List<PaymentElement> getValue() {
                return C13BV.INSTANCE;
            }

            public final void setElementDTO(ElementDTO elementDTO) {
                this.LLJILLL = elementDTO;
            }

            public final void setOnSelect(Function0<Unit> function0) {
                this.LLJJI = function0;
            }

            public final void setPaymentMethod(PaymentMethod paymentMethod) {
                this.LLJILJILJ = paymentMethod;
            }

            public final void setRegionList(List<Region> list) {
                this.LLJJ = list;
            }

            @Override // X.C958503ot
            public final void LIZLLL(ElementDTO elementDTO, List<PaymentElement> list, String str) {
                super.LIZLLL(elementDTO, list, null);
                this.LLJILLL = elementDTO;
            }
        };
    }
}
