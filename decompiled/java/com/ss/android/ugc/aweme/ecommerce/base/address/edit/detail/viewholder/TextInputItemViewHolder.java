package com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.viewholder;

import X.C01GW;
import X.C123100dR;
import X.C13LE;
import X.C1743750vTh;
import X.C1745300vWC;
import X.C1745330vWF;
import X.C1745660vWm;
import X.C1745680vWo;
import X.C1745690vWp;
import X.C1746060vXQ;
import X.C19719912Dl;
import X.C452501pT;
import X.C786410Ut5;
import X.C927503jt;
import X.C960203pA;
import X.C992303uL;
import X.InterfaceC998610c5r;
import Y.ACListenerS128S0200000_26;
import Y.ARunnableS126S0100000_26;
import aha.h;
import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailActivity;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import g1c.AjS70S0100000_26;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS86S1200000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zga.b;

/* JADX INFO: loaded from: classes27.dex */
public final class TextInputItemViewHolder extends BaseViewHolder implements InterfaceC998610c5r {
    public final AddressEditDetailActivity LLJILJILJ;
    public final C01GW LLJILLL;
    public b LLJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC998610c5r
    public final View l() {
        b bVar = this.LLJJ;
        if (bVar != null) {
            return bVar.LL.getInputWithIndicatorEditTextFromXml();
        }
        return null;
    }

    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        b bVar = this.LLJJ;
        if (bVar != null) {
            return bVar.w2();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [X.0vWm] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(final C1745680vWo c1745680vWo) {
        boolean z;
        String str;
        C1746060vXQ c1746060vXQ;
        super.rr(c1745680vWo);
        if (this.LLJJ == null) {
            this.LLJJ = new b((C1745300vWC) this.itemView, this.LLJILJILJ, (AddressEditDetailViewModel) this.LLJILLL.getValue());
        }
        final b bVar = this.LLJJ;
        if (bVar != null) {
            bVar.LLJIJIL = c1745680vWo;
            bVar.LLIZLLLIL = c1745680vWo.LIZLLL;
            String str2 = null;
            if (C123100dR.LIZ(c1745680vWo.LIZ.key)) {
                String str3 = c1745680vWo.LIZ.key;
                ClientConfig clientConfig = bVar.LLILLL.LLJJIII;
                if (clientConfig != null) {
                    str2 = clientConfig.wakeUpKeyBoardKeys;
                }
                if (Intrinsics.LJFF(str3, str2) && !bVar.LLJ && ((c1746060vXQ = bVar.LLILLL.LLJI) == null || c1746060vXQ.LIZIZ == null)) {
                    HandlerHook.viewPost(bVar.LL, new ARunnableS126S0100000_26(bVar, 137));
                    bVar.LLJ = true;
                }
            }
            C1745660vWm c1745660vWm = bVar.LLILZ;
            if (c1745660vWm != null) {
                bVar.LL.getInputWithIndicatorFromXml().getEditText().removeTextChangedListener(c1745660vWm);
            }
            bVar.LL.getInputWithIndicatorFromXml().setIndicatorClickListener(new ACListenerS128S0200000_26(bVar, c1745680vWo, 40));
            bVar.LL.getInputWithIndicatorFromXml().setOnIndicatorVisibleChangeListener(new AwS392S0200000_26(bVar, c1745680vWo, 268));
            Object obj = c1745680vWo.LIZIZ;
            if ((obj instanceof String) && (str = (String) obj) != null) {
                bVar.LL.getInputWithIndicatorFromXml().setText(str);
            } else {
                bVar.LL.getInputWithIndicatorFromXml().setText("");
            }
            Integer num = c1745680vWo.LIZ.type;
            if (num != null) {
                if (num.intValue() == 0) {
                    bVar.LL.getInputWithIndicatorFromXml().getEditText().setTag(0);
                    bVar.LL.getInputWithIndicatorFromXml().setInputType(1);
                } else if (num.intValue() == 5) {
                    bVar.LL.getInputWithIndicatorFromXml().getEditText().setTag(5);
                    bVar.LL.getInputWithIndicatorFromXml().setInputType(1);
                }
            }
            final C1745300vWC c1745300vWC = bVar.LL;
            c1745300vWC.LIZLLL(c1745680vWo.LIZ.title, false);
            c1745300vWC.getInputWithIndicatorFromXml().setHint(c1745680vWo.LIZ.hint);
            Integer num2 = c1745680vWo.LIZ.maxLines;
            if (num2 == null || num2.intValue() < 0) {
                num2 = Integer.MAX_VALUE;
            }
            c1745300vWC.getInputWithIndicatorFromXml().setMaxLines(num2.intValue());
            if (num2.intValue() > 1) {
                c1745300vWC.getInputWithIndicatorEditTextFromXml().setImeOptions(6);
                c1745300vWC.getInputWithIndicatorEditTextFromXml().setRawInputType(1);
                c1745300vWC.getInputWithIndicatorEditTextFromXml().setInputType(131072);
                c1745300vWC.getInputWithIndicatorEditTextFromXml().setHorizontallyScrolling(false);
            } else {
                Integer num3 = c1745680vWo.LJIIIIZZ;
                if (num3 != null) {
                    bVar.LL.getInputWithIndicatorEditTextFromXml().setImeOptions(num3.intValue());
                }
            }
            if (!((h) bVar.LLJILJIL.getValue()).LIZLLL() && !bVar.LLILLL.FQ2().isAllRequiredItemFilled()) {
                z = false;
            } else {
                z = true;
            }
            C1745330vWF.LIZ(z, c1745680vWo.LIZJ, c1745300vWC);
            C786410Ut5.I7(new AjS44S0200000_26(c1745300vWC, bVar, 67), bVar.LL.getContentViewFromXml());
            bVar.LL.getInputWithIndicatorFromXml().getEditText().setFilters(new C1745690vWp[]{new C1745690vWp()});
            Integer num4 = c1745680vWo.LIZ.maxLength;
            if (num4 != null) {
                c1745300vWC.getInputWithIndicatorFromXml().setMaxLength(num4.intValue());
            }
            bVar.LLILZ = new C927503jt() { // from class: X.0vWm
                @Override // X.C927503jt, android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    if (bVar.LLILLL.hR2() == 0) {
                        bVar.LLILLL.jR2(false);
                    } else {
                        bVar.LLILLL.jR2(true);
                    }
                    bVar.LLILLL.LLILZLL = null;
                }

                @Override // X.C927503jt, android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
                    boolean z2;
                    CharSequence charSequenceLJLIIIL;
                    b bVar2 = bVar;
                    if (!bVar2.LLIZ && i2 <= 0 && i3 <= 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    bVar2.LLIZ = z2;
                    if (charSequence != null) {
                        C1745680vWo c1745680vWo2 = c1745680vWo;
                        String string = a0.LJLIIIL(charSequence.toString()).toString();
                        if (!Intrinsics.LJFF(string, c1745680vWo2.LIZIZ)) {
                            bVar2.LLILLL.LLIZLLLIL = true;
                            c1745680vWo2.LIZIZ = string;
                        } else {
                            return;
                        }
                    }
                    if (C1745470vWT.LIZ(c1745680vWo.LIZ.key)) {
                        b bVar3 = bVar;
                        if (bVar3.LLIZLLLIL && !bVar3.LLILLL.LLJILJILJ) {
                            EditText editText = bVar3.LL.getInputWithIndicatorFromXml().getEditText();
                            Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6d4ROH8MmREOXM5f7Oj4qLY+inFG2vDjgovgPHoBJUeYk=", null));
                            if (editableLLJILLL != null && (charSequenceLJLIIIL = a0.LJLIIIL(editableLLJILLL)) != null) {
                                int length = charSequenceLJLIIIL.length();
                                if (length > 3) {
                                    b bVar4 = bVar;
                                    AddressEditDetailViewModel addressEditDetailViewModel = bVar4.LLILLL;
                                    String str4 = c1745680vWo.LIZ.key;
                                    AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26(bVar4, editText, 269);
                                    addressEditDetailViewModel.getClass();
                                    addressEditDetailViewModel.withState(new AwS86S1200000_1(addressEditDetailViewModel, (AddressEditDetailViewModel) str4, (String) awS392S0200000_26, (Function1<? super CandInputDataOptions, Unit>) 51));
                                    return;
                                }
                                if (length != 0) {
                                    return;
                                }
                            }
                            AddressEditDetailViewModel addressEditDetailViewModel2 = bVar.LLILLL;
                            addressEditDetailViewModel2.getClass();
                            addressEditDetailViewModel2.setState(new AwS605S0100000_26((CandInputDataOptions) null, 932));
                        }
                    }
                }
            };
            c1745300vWC.getInputWithIndicatorFromXml().getEditText().addTextChangedListener(bVar.LLILZ);
            c1745300vWC.getInputWithIndicatorFromXml().setOnEditTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0vWk
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z2) throws Throwable {
                    int length;
                    EditText editText;
                    Editable editableLLJILLL;
                    CharSequence charSequenceLJLIIIL;
                    CharSequence charSequenceLJLIIIL2;
                    if (z2) {
                        b bVar2 = bVar;
                        Editable editableLLJILLL2 = C2204961BRm.LLJILLL(c1745300vWC.getInputWithIndicatorFromXml().getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6d4ROH8MmREOXM5f7Oj4qLY+inFG2vDjgovgPHoBJUeYk=", null));
                        if (editableLLJILLL2 != null && (charSequenceLJLIIIL2 = a0.LJLIIIL(editableLLJILLL2)) != null) {
                            length = charSequenceLJLIIIL2.length();
                        } else {
                            length = 0;
                        }
                        bVar2.LLILZLL = length;
                        bVar.LLILZIL = SystemClock.elapsedRealtime();
                        AddressEditDetailActivity addressEditDetailActivity = AddressEditDetailActivity.LLJJJIL;
                        if (addressEditDetailActivity != null) {
                            C1748720vbi.LIZIZ(addressEditDetailActivity, new C10510049c(), new AwS605S0100000_26(c1745680vWo, 941));
                        }
                        C1745680vWo c1745680vWo2 = c1745680vWo;
                        if (c1745680vWo2.LIZIZ == null) {
                            c1745680vWo2.LIZIZ = "";
                        }
                        if (C1745470vWT.LIZ(c1745680vWo2.LIZ.key)) {
                            String str4 = c1745680vWo.LIZ.inputHintMessage;
                            C1745300vWC c1745300vWC2 = c1745300vWC;
                            if (str4 != null && !a0.LJJJIL(str4)) {
                                c1745300vWC2.LJ(str4);
                            }
                            b bVar3 = bVar;
                            if (bVar3.LLIZLLLIL && !bVar3.LLILLL.LLJILJILJ && (editableLLJILLL = C2204961BRm.LLJILLL((editText = bVar3.LL.getInputWithIndicatorFromXml().getEditText()), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6d4ROH8MmREOXM5f7Oj4qLY+inFG2vDjgovgPHoBJUeYk=", null))) != null && (charSequenceLJLIIIL = a0.LJLIIIL(editableLLJILLL)) != null && charSequenceLJLIIIL.length() > 3) {
                                b bVar4 = bVar;
                                AddressEditDetailViewModel addressEditDetailViewModel = bVar4.LLILLL;
                                String str5 = c1745680vWo.LIZ.key;
                                AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26(bVar4, editText, 270);
                                addressEditDetailViewModel.getClass();
                                addressEditDetailViewModel.withState(new AwS86S1200000_1(addressEditDetailViewModel, (AddressEditDetailViewModel) str5, (String) awS392S0200000_26, (Function1<? super CandInputDataOptions, Unit>) 51));
                            }
                        }
                        c1745300vWC.LIZIZ();
                        c1745680vWo.LIZJ = null;
                        return;
                    }
                    String string = a0.LJLIIIL(C2204961BRm.LLJILLL(c1745300vWC.getInputWithIndicatorFromXml().getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6d4ROH8MmREOXM5f7Oj4qLY+inFG2vDjgovgPHoBJUeYk=", null)).toString()).toString();
                    c1745680vWo.LIZIZ = string;
                    b bVar5 = bVar;
                    if (string != null) {
                        bVar5.LL.getInputWithIndicatorFromXml().setText(string);
                    } else {
                        bVar5.LL.getInputWithIndicatorFromXml().setText("");
                    }
                    if (C1745470vWT.LIZ(c1745680vWo.LIZ.key)) {
                        C1745300vWC c1745300vWC3 = c1745300vWC;
                        c1745300vWC3.getAddressHintMessageFromXml().setText("");
                        C03DZ.LIZ(c1745300vWC3.getAddressHintMessageFromXml());
                        AddressEditDetailViewModel addressEditDetailViewModel2 = bVar.LLILLL;
                        addressEditDetailViewModel2.getClass();
                        addressEditDetailViewModel2.setState(new AwS605S0100000_26((CandInputDataOptions) null, 932));
                    }
                    boolean zLJFF = Intrinsics.LJFF(AddressEditDetailActivity.LLJJJJ, "sug");
                    boolean zLJFF2 = Intrinsics.LJFF(AddressEditDetailActivity.LLJJJJ, "auto");
                    int length2 = string.length();
                    b bVar6 = bVar;
                    int i = length2 - bVar6.LLILZLL;
                    if (i < 0) {
                        AddressEditDetailActivity.LLJJJJ = "del";
                    } else if (i > 0) {
                        AddressEditDetailActivity.LLJJJJ = "add";
                    } else if (!zLJFF && !zLJFF2) {
                        AddressEditDetailActivity.LLJJJJ = "";
                    }
                    C948503nH.LJ(bVar6.LLILLJJLI, C23271099x.INSTANCE, new C1745650vWl(bVar6, c1745680vWo, zLJFF2, zLJFF, null));
                }
            });
            if (!c1745680vWo.LJFF) {
                if (((h) bVar.LLJILJIL.getValue()).LIZJ()) {
                    bVar.LL.getTitleFromXml().setTextColor(C960203pA.LIZ(R.attr.a1p, bVar.LL.getContext()));
                }
                C786410Ut5.M9(bVar.LL);
                C786410Ut5.I7(new AjS70S0100000_26(bVar, 113), bVar.LL);
                C786410Ut5.I7(new AjS70S0100000_26(bVar, 114), bVar.LL.getContentViewFromXml());
                bVar.LL.getInputWithIndicatorEditTextFromXml().setFocusable(false);
                bVar.LL.getInputWithIndicatorEditTextFromXml().setCursorVisible(false);
                bVar.LL.getInputWithIndicatorEditTextFromXml().setFocusableInTouchMode(false);
                bVar.LL.getInputWithIndicatorEditTextFromXml().setTextColor(C960203pA.LIZ(R.attr.a1p, bVar.LL.getContext()));
                C786410Ut5.I7(new AjS70S0100000_26(bVar, 115), bVar.LL.getContentViewFromXml().findViewById(R.id.kq8));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public TextInputItemViewHolder(ViewGroup viewGroup, AddressEditDetailActivity addressEditDetailActivity) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.ajh, viewGroup));
        this.LLJILJILJ = addressEditDetailActivity;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditDetailViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 12));
    }
}
