package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C01GW;
import X.C03DZ;
import X.C0WZX;
import X.C13LE;
import X.C1743750vTh;
import X.C1745300vWC;
import X.C1745330vWF;
import X.C1745340vWG;
import X.C1745680vWo;
import X.C1745850vX5;
import X.C1745870vX7;
import X.C1745880vX8;
import X.C1746460vY4;
import X.C19719912Dl;
import X.C2204961BRm;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C586610Mzb;
import X.C786410Ut5;
import X.C814420VxA;
import X.C927503jt;
import X.C948503nH;
import X.C960203pA;
import X.C992303uL;
import X.EnumC586600Mza;
import X.InterfaceC998610c5r;
import Y.ACListenerS160S0100000_26;
import aha.e;
import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import p8b.c;

/* JADX INFO: loaded from: classes27.dex */
public class PhoneInputItemViewHolder extends BaseViewHolder implements c, InterfaceC998610c5r {
    public final AddressEditFragment LLJILJILJ;
    public C1745850vX5 LLJILLL;
    public final C01GW LLJJ;
    public C1745880vX8 LLJJI;
    public final CandHelper LLJJIII;
    public long LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public String LLJJJIL;
    public final C01GW LLJJJJ;

    @Override // p8b.c
    public final String getViewName() {
        return "PhoneInputItemViewHolder";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void a6() {
        if (a0.LJJIIZI(((C1745850vX5) this.itemView.findViewById(R.id.qap)).getFullPhoneNumber().getSecond(), "*", false)) {
            ((C1745850vX5) this.itemView.findViewById(R.id.qap)).setPhoneNumber("");
        }
    }

    public final C1745850vX5 b6() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qap) : null;
            this.LLJILLL = (C1745850vX5) viewFindViewById;
        }
        return (C1745850vX5) viewFindViewById;
    }

    public final AddressEditViewModel c6() {
        return (AddressEditViewModel) this.LLJJ.getValue();
    }

    @Override // X.InterfaceC998610c5r
    public final View l() {
        return ((C1745850vX5) this.itemView.findViewById(R.id.qap)).getInputWithIndicator().getEditText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        String str;
        C1745680vWo c1745680vWo = (C1745680vWo) this.LLILLJJLI;
        if (!c1745680vWo.LJFF) {
            return false;
        }
        C1745340vWG c1745340vWG = c1745680vWo.LIZJ;
        return !(c1745340vWG == null || (str = c1745340vWG.LIZ) == null || str.length() <= 0) || C2204961BRm.LLJILLL(((C1745850vX5) this.itemView.findViewById(R.id.qap)).getInputWithIndicator().getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6P7QKR8crTAunbvOj+WUrlpTSsYMpHPlumsDB9cHHPpXeIww==", null)).toString().length() == 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        CandHelper candHelper = this.LLJJIII;
        PopupWindow popupWindow = candHelper.LIZJ;
        if (popupWindow == null) {
            popupWindow = null;
        }
        popupWindow.dismiss();
        candHelper.LJIILIIL.removeMessages(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [X.0vX8] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(final C1745680vWo c1745680vWo) throws Throwable {
        String str;
        Pair<String, String> pair;
        int length;
        Pair pair2;
        String str2;
        String str3;
        int iLIZIZ;
        C1745300vWC c1745300vWC;
        super.rr(c1745680vWo);
        this.LLJJIII.LIZJ(c6(), c1745680vWo.LIZ.key);
        ((C1745850vX5) this.itemView.findViewById(R.id.qap)).getInputWithIndicator().setIndicatorClickListener(new ACListenerS160S0100000_26(c1745680vWo, 24));
        final C1745300vWC c1745300vWC2 = (C1745300vWC) this.itemView;
        ClientConfig clientConfig = c6().LLL;
        if (clientConfig != null) {
            str = clientConfig.uiStyle;
        } else {
            str = null;
        }
        if (C586610Mzb.LIZ(str)) {
            ClientConfig clientConfig2 = c6().LLL;
            if (clientConfig2 != null) {
                str3 = clientConfig2.uiStyle;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(str3, EnumC586600Mza.EU_NEW_VERSION.getValue())) {
                View inputBottomSpaceFromXml = c1745300vWC2.getInputBottomSpaceFromXml();
                if (inputBottomSpaceFromXml != null) {
                    C786410Ut5.LJLLLLLL(8, inputBottomSpaceFromXml);
                }
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            }
            View view = this.itemView;
            if ((view instanceof C1745300vWC) && (c1745300vWC = (C1745300vWC) view) != null) {
                c1745300vWC.LJI(Integer.valueOf(iLIZIZ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), true);
            }
            C426750GoL.LJIIL(c1745300vWC2.getPhoneInputFromXml(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), 21);
        }
        ClientConfig clientConfig3 = c6().LLL;
        if (clientConfig3 != null && Intrinsics.LJFF(clientConfig3.disableRegionCodeChange, Boolean.TRUE)) {
            C1745850vX5 phoneInputFromXml = c1745300vWC2.getPhoneInputFromXml();
            if (C426750GoL.LIZLLL(phoneInputFromXml.getContext())) {
                C03DZ.LIZ(phoneInputFromXml.getIconArrowDownRtlFromXml());
                phoneInputFromXml.getPhoneInputViewCountryRtlLayoutFromXml().setEnabled(false);
            } else {
                C03DZ.LIZ(phoneInputFromXml.getIconArrowDownFromXml());
                phoneInputFromXml.getPhoneInputViewCountryLayoutFromXml().setEnabled(false);
            }
            C1745850vX5 phoneInputFromXml2 = c1745300vWC2.getPhoneInputFromXml();
            phoneInputFromXml2.getCountryCodeDdNameFromXml().setTextColorRes(R.attr.a1k);
            phoneInputFromXml2.getCountryCodeDdNameRtlFromXml().setTextColorRes(R.attr.a1k);
            phoneInputFromXml2.getCountryCodeDdNumberFromXml().setTextColorRes(R.attr.a1k);
            phoneInputFromXml2.getCountryCodeDdNumberRtlFromXml().setTextColorRes(R.attr.a1k);
        }
        C1745880vX8 c1745880vX8 = this.LLJJI;
        if (c1745880vX8 != null) {
            c1745300vWC2.getPhoneInputFromXml().getInputWithIndicator().getEditText().removeTextChangedListener(c1745880vX8);
        }
        c1745300vWC2.LIZLLL(c1745680vWo.LIZ.title, c1745680vWo.LIZJ());
        C1745850vX5 phoneInputFromXml3 = c1745300vWC2.getPhoneInputFromXml();
        Object obj = c1745680vWo.LIZIZ;
        if (obj instanceof Pair) {
            pair = (Pair) obj;
        } else {
            pair = null;
        }
        boolean z = true;
        phoneInputFromXml3.LIZJ(pair, true);
        this.LLJJJIL = c1745680vWo.LIZ.hint;
        if (C426750GoL.LIZLLL(c1745300vWC2.getContext())) {
            ViewGroup.LayoutParams layoutParams = c1745300vWC2.getPhoneInputFromXml().getInputWithIndicator().getEditText().getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            String text = c1745300vWC2.getPhoneInputFromXml().getInputWithIndicator().getText();
            if (text != null && text.length() != 0) {
                c1745300vWC2.getPhoneInputFromXml().setHint(null);
            } else {
                c1745300vWC2.getPhoneInputFromXml().setHint(this.LLJJJIL);
            }
        } else {
            c1745300vWC2.getPhoneInputFromXml().setHint(this.LLJJJIL);
        }
        Object obj2 = c1745680vWo.LIZIZ;
        if ((obj2 instanceof Pair) && (pair2 = (Pair) obj2) != null && (str2 = (String) pair2.getSecond()) != null && str2.length() != 0) {
            String str4 = c1745680vWo.LIZ.key;
            if (str4 == null) {
                str4 = "";
            }
            C1746460vY4.LIZ.getClass();
            if (C1746460vY4.LIZIZ(str4)) {
                C948503nH.LJIIIIZZ(this.LLJILJILJ, new C1745870vX7(this, c1745680vWo, (C1745300vWC) this.itemView, str4, null));
            }
        }
        Integer num = ((C1745680vWo) this.LLILLJJLI).LJIIIIZZ;
        if (num != null) {
            ((C1745850vX5) this.itemView.findViewById(R.id.qap)).getInputWithIndicator().getEditText().setImeOptions(num.intValue());
        }
        if (!((e) this.LLJJJJ.getValue()).LIZLLL() && !c6().FQ2().isAllKeyItemFilled()) {
            z = false;
        }
        C1745330vWF.LIZ(z, c1745680vWo.LIZJ, c1745300vWC2);
        String str5 = this.LLJJIII.LJIIJ;
        if (Intrinsics.LJFF(str5, "sug") || Intrinsics.LJFF(str5, "auto")) {
            Editable editableLLJILLL = C2204961BRm.LLJILLL(c1745300vWC2.getPhoneInputFromXml().getInputWithIndicator().getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6P7QKR8crTAunbvOj+WUrlpTSsYMpHPlumsDB9cHHPpXeIww==", null));
            if (editableLLJILLL != null) {
                length = editableLLJILLL.length();
            } else {
                length = 0;
            }
            this.LLJJIJIIJIL = length;
        }
        this.LLJJI = new C927503jt(this) { // from class: X.0vX8
            public final /* synthetic */ PhoneInputItemViewHolder LLILLJJLI;

            @Override // X.C927503jt, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                if (C426750GoL.LIZLLL(c1745300vWC2.getContext())) {
                    if (editable != null && editable.length() != 0) {
                        c1745300vWC2.getPhoneInputFromXml().setHint(null);
                    } else {
                        c1745300vWC2.getPhoneInputFromXml().setHint(this.LLILLJJLI.LLJJJIL);
                    }
                }
            }

            {
                this.LLILLJJLI = this;
            }

            @Override // X.C927503jt, android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Pair pair3;
                if (charSequence != null) {
                    C1745300vWC c1745300vWC3 = c1745300vWC2;
                    C1745680vWo c1745680vWo2 = c1745680vWo;
                    PhoneInputItemViewHolder phoneInputItemViewHolder = this.LLILLJJLI;
                    boolean z2 = false;
                    if (!a0.LJJIIZI(charSequence, "*", false)) {
                        Pair<String, String> fullPhoneNumber = c1745300vWC3.getPhoneInputFromXml().getFullPhoneNumber();
                        String second = fullPhoneNumber.getSecond();
                        Object obj3 = c1745680vWo2.LIZIZ;
                        Object second2 = null;
                        if ((obj3 instanceof Pair) && (pair3 = (Pair) obj3) != null) {
                            second2 = pair3.getSecond();
                        }
                        if (!Intrinsics.LJFF(second, second2)) {
                            phoneInputItemViewHolder.c6().LLJJIJI = true;
                        }
                        c1745680vWo2.LIZIZ = fullPhoneNumber;
                        AddressEditViewModel addressEditViewModelC6 = phoneInputItemViewHolder.c6();
                        if (phoneInputItemViewHolder.c6().AR2() != 0) {
                            z2 = true;
                        }
                        addressEditViewModelC6.nS2(z2);
                    }
                }
                c1745300vWC2.getPhoneInputFromXml().setCountryLayoutState(String.valueOf(charSequence));
                PhoneInputItemViewHolder phoneInputItemViewHolder2 = this.LLILLJJLI;
                CandHelper candHelper = phoneInputItemViewHolder2.LLJJIII;
                if (candHelper.LJI == 0) {
                    candHelper.LJI = 1;
                    candHelper.LIZ(phoneInputItemViewHolder2.c6(), c1745680vWo.LIZ.key);
                } else {
                    if (!phoneInputItemViewHolder2.LLJJJ) {
                        return;
                    }
                    candHelper.LJ(((C1745850vX5) phoneInputItemViewHolder2.itemView.findViewById(R.id.qap)).getInputWithIndicator().getEditText(), c1745680vWo.LIZ.key, this.LLILLJJLI.c6(), 1);
                }
            }
        };
        c1745300vWC2.getPhoneInputFromXml().getInputWithIndicator().getEditText().addTextChangedListener(this.LLJJI);
        c1745300vWC2.getPhoneInputFromXml().setOnCountryCodeChangeListener(new AwS427S0200000_26(c1745300vWC2, c1745680vWo, 12));
        c1745300vWC2.getPhoneInputFromXml().setOnCountryCodeClickListener(new ACListenerS160S0100000_26(this, 25));
        c1745300vWC2.getPhoneInputFromXml().getInputWithIndicator().setOnEditTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0vX4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z2) throws Throwable {
                List arrayList;
                int length2;
                Object second;
                String strLJLJJLL;
                Pair pair3;
                String str6;
                boolean z3 = false;
                int length3 = 0;
                if (z2) {
                    this.LL.getClass();
                    PhoneInputItemViewHolder phoneInputItemViewHolder = this.LL;
                    phoneInputItemViewHolder.LLJJIJIL = true;
                    phoneInputItemViewHolder.c6().LLJJIJI = true;
                    PhoneInputItemViewHolder phoneInputItemViewHolder2 = this.LL;
                    Editable editableLLJILLL2 = C2204961BRm.LLJILLL(c1745300vWC2.getPhoneInputFromXml().getInputWithIndicator().getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6P7QKR8crTAunbvOj+WUrlpTSsYMpHPlumsDB9cHHPpXeIww==", null));
                    if (editableLLJILLL2 != null) {
                        length3 = editableLLJILLL2.length();
                    }
                    phoneInputItemViewHolder2.LLJJIJIIJIL = length3;
                    this.LL.LLJJIJI = SystemClock.elapsedRealtime();
                    AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
                    if (addressEditFragment != null) {
                        C1748720vbi.LIZIZ(addressEditFragment, new C10510049c(), new AwS392S0200000_26(c1745680vWo, this.LL, 33));
                    }
                    C1745680vWo c1745680vWo2 = c1745680vWo;
                    if (c1745680vWo2.LIZIZ == null) {
                        c1745680vWo2.LIZIZ = c1745300vWC2.getPhoneInputFromXml().getFullPhoneNumber();
                    }
                    PhoneInputItemViewHolder phoneInputItemViewHolder3 = this.LL;
                    phoneInputItemViewHolder3.LLJJIII.LJ(((C1745850vX5) phoneInputItemViewHolder3.itemView.findViewById(R.id.qap)).getInputWithIndicator().getEditText(), c1745680vWo.LIZ.key, this.LL.c6(), 1);
                    this.LL.a6();
                    c1745300vWC2.LIZIZ();
                    c1745680vWo.LIZJ = null;
                    this.LL.LLJJJ = true;
                    return;
                }
                this.LL.getClass();
                String countryName = c1745300vWC2.getPhoneInputFromXml().getCountryName();
                ClientConfig clientConfig4 = this.LL.c6().LLL;
                if (clientConfig4 == null || (str6 = clientConfig4.phonePrefixCheckCountry) == null || (arrayList = a0.LJJLIIIJILLIZJL(str6, new String[]{","}, 0, 6)) == null) {
                    arrayList = new ArrayList();
                }
                if (C770702zh.LIZIZ(countryName) && arrayList.contains(countryName)) {
                    PhoneInputItemViewHolder phoneInputItemViewHolder4 = this.LL;
                    Object obj3 = ((C1745680vWo) phoneInputItemViewHolder4.LLILLJJLI).LIZIZ;
                    if (!(obj3 instanceof Pair) || (pair3 = (Pair) obj3) == null || (second = pair3.getSecond()) == null) {
                        second = ((C1745680vWo) phoneInputItemViewHolder4.LLILLJJLI).LIZIZ;
                    }
                    if (second instanceof String) {
                        CharSequence charSequence = (CharSequence) second;
                        if (charSequence.length() != 0) {
                            List listLJJLIIIJ = a0.LJJLIIIJ(charSequence, new char[]{')'}, false, 0, 6);
                            String str7 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJ);
                            if (str7 != null) {
                                strLJLJJLL = a0.LJLJJLL(str7, '0');
                            } else {
                                strLJLJJLL = null;
                            }
                            if (C770702zh.LIZ(strLJLJJLL)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append((String) C13LP.LJJJLZIJ(0, listLJJLIIIJ));
                                sbLIZ.append(')');
                                sbLIZ.append(strLJLJJLL);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                ((C1745850vX5) phoneInputItemViewHolder4.itemView.findViewById(R.id.qap)).getInputWithIndicator().getEditText().setText(strLJLJJLL);
                                C1745680vWo c1745680vWo3 = (C1745680vWo) phoneInputItemViewHolder4.LLILLJJLI;
                                Object obj4 = c1745680vWo3.LIZIZ;
                                if ((obj4 instanceof Pair) && obj4 != null) {
                                    c1745680vWo3.LIZIZ = new Pair(((Pair) obj4).getFirst(), strLIZIZ);
                                } else {
                                    c1745680vWo3.LIZIZ = strLIZIZ;
                                }
                            }
                        }
                    }
                }
                c1745300vWC2.getPhoneInputFromXml().getInputWithIndicator().getEditText().setText(c1745300vWC2.getPhoneInputFromXml().getInputWithIndicator().getText());
                PhoneInputItemViewHolder phoneInputItemViewHolder5 = this.LL;
                phoneInputItemViewHolder5.LLJJIII.LIZ(phoneInputItemViewHolder5.c6(), c1745680vWo.LIZ.key);
                String str8 = c1745680vWo.LIZ.key;
                C1746460vY4.LIZ.getClass();
                boolean zLIZJ = C1746460vY4.LIZJ(str8);
                boolean zLIZIZ = C1746460vY4.LIZIZ(str8);
                Editable editableLLJILLL3 = C2204961BRm.LLJILLL(c1745300vWC2.getPhoneInputFromXml().getInputWithIndicator().getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6P7QKR8crTAunbvOj+WUrlpTSsYMpHPlumsDB9cHHPpXeIww==", null));
                if (editableLLJILLL3 != null) {
                    length2 = editableLLJILLL3.length();
                } else {
                    length2 = 0;
                }
                PhoneInputItemViewHolder phoneInputItemViewHolder6 = this.LL;
                int i = length2 - phoneInputItemViewHolder6.LLJJIJIIJIL;
                if (!zLIZJ && !zLIZIZ) {
                    if (i < 0) {
                        phoneInputItemViewHolder6.LLJJIII.LJIIJ = "del";
                    } else if (i > 0) {
                        phoneInputItemViewHolder6.LLJJIII.LJIIJ = "add";
                    } else {
                        phoneInputItemViewHolder6.LLJJIII.LJIIJ = "same";
                    }
                } else {
                    phoneInputItemViewHolder6.LLJJIII.LJIIJ = "";
                }
                C948503nH.LJIIIIZZ(phoneInputItemViewHolder6.LLJILJILJ, new C1745860vX6(phoneInputItemViewHolder6, c1745680vWo, c1745300vWC2, zLIZJ, null));
                AddressEditViewModel addressEditViewModelC6 = this.LL.c6();
                if (this.LL.c6().AR2() != 0) {
                    z3 = true;
                }
                addressEditViewModelC6.nS2(z3);
            }
        });
        if (!c1745680vWo.LJFF) {
            if (((e) this.LLJJJJ.getValue()).LIZJ()) {
                ((TextView) this.itemView.findViewById(R.id.title)).setTextColor(C960203pA.LIZ(R.attr.a1p, this.itemView.getContext()));
            }
            C786410Ut5.O7((FrameLayout) this.itemView.findViewById(R.id.euf), null);
            C786410Ut5.I7(new AjS70S0100000_26(this, 68), this.itemView.findViewById(R.id.euf));
            C786410Ut5.R7(b6().getPhoneCountryLayout(), null);
            b6().getCountryCodeTextView().setTextColor(C960203pA.LIZ(R.attr.a1p, this.itemView.getContext()));
            b6().getCountryNameTextView().setTextColor(C960203pA.LIZ(R.attr.a1p, this.itemView.getContext()));
            C786410Ut5.I7(new AjS70S0100000_26(this, 69), b6().getPhoneCountryLayout());
            b6().getInputWithIndicator().getEditText().setFocusable(false);
            b6().getInputWithIndicator().getEditText().setFocusableInTouchMode(false);
            b6().getInputWithIndicator().getEditText().setTextColor(C960203pA.LIZ(R.attr.a1p, this.itemView.getContext()));
            C786410Ut5.I7(new AjS70S0100000_26(this, 70), b6().getInputWithIndicator().getEditText());
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public PhoneInputItemViewHolder(ViewGroup viewGroup, AddressEditFragment addressEditFragment) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.aj_, viewGroup));
        this.LLJILJILJ = addressEditFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 24));
        this.LLJJIII = new CandHelper(viewGroup.getContext(), ((C1745850vX5) this.itemView.findViewById(R.id.qap)).getInputWithIndicator().getEditText());
        this.LLJJIJI = -1L;
        this.LLJJJ = true;
        this.LLJJJIL = "";
        this.LLJJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 173));
    }
}
