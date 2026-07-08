package com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C01GW;
import X.C03DZ;
import X.C03J8;
import X.C1397760mTe;
import X.C13LE;
import X.C1745300vWC;
import X.C1745310vWD;
import X.C1746300vXo;
import X.C1746310vXp;
import X.C1746320vXq;
import X.C1748260vay;
import X.C1841350y17;
import X.C19719912Dl;
import X.C20094413jq;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C946503mx;
import X.ViewOnFocusChangeListenerC1775860wJU;
import Y.ARunnableS101S0100000_1;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionOption;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS77S0210000_26;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes27.dex */
public final class DeliveryInstructionItemViewHolder extends ECJediViewHolder<C1746310vXp> {
    public C1841350y17 LLJILJIL;
    public TuxTextView LLJILJILJ;
    public C1748260vay LLJILLL;
    public C1745300vWC LLJJ;
    public ConstraintLayout LLJJI;
    public final C01GW LLJJIII;
    public boolean LLJJIJI;
    public final C1746300vXo LLJJIJIIJIL;
    public final ViewOnFocusChangeListenerC1775860wJU LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C1745300vWC W5() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.kps) : null;
            this.LLJJ = (C1745300vWC) viewFindViewById;
        }
        return (C1745300vWC) viewFindViewById;
    }

    public final C1748260vay X5() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.kq4) : null;
            this.LLJILLL = (C1748260vay) viewFindViewById;
        }
        return (C1748260vay) viewFindViewById;
    }

    public final C1841350y17 a6() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ygw) : null;
            this.LLJILJIL = (C1841350y17) viewFindViewById;
        }
        return (C1841350y17) viewFindViewById;
    }

    public final DeliveryInstructionViewModel b6() {
        return (DeliveryInstructionViewModel) this.LLJJIII.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0vXo] */
    public DeliveryInstructionItemViewHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ai9, viewGroup, false));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryInstructionViewModel.class);
        this.LLJJIII = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 8));
        this.LLJJIJIIJIL = new C1746320vXq() { // from class: X.0vXo
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string;
                DeliveryInstructionViewModel deliveryInstructionViewModelB6 = this.LL.b6();
                if (editable != null) {
                    string = editable.toString();
                } else {
                    string = null;
                }
                deliveryInstructionViewModelB6.LLJIJIL = string;
            }
        };
        this.LLJJIJIL = new ViewOnFocusChangeListenerC1775860wJU(this, 4);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) throws Throwable {
        final boolean z;
        int iIntValue;
        final C1746310vXp c1746310vXp = (C1746310vXp) obj;
        C03J8.LIZ(this.itemView, false);
        DeliveryInstructionOption deliveryInstructionOption = c1746310vXp.LIZ;
        Integer num = deliveryInstructionOption.instructionType;
        if (num != null && num.intValue() == 100) {
            z = true;
        } else {
            z = false;
        }
        a6().setChecked(c1746310vXp.LIZIZ);
        a6().setFocusable(false);
        View viewFindViewById = this.LLJILJILJ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.z4s);
            } else {
                viewFindViewById = null;
            }
            this.LLJILJILJ = (TuxTextView) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(deliveryInstructionOption.instruction);
        if (Intrinsics.LJFF(c1746310vXp.LIZLLL, "2")) {
            View viewFindViewById3 = this.LLJILJILJ;
            if (viewFindViewById3 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById3 = viewLJJIJL2.findViewById(R.id.z4s);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJILJILJ = (TuxTextView) viewFindViewById3;
            }
            TuxTextView tuxTextView = (TuxTextView) viewFindViewById3;
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(102);
            }
        }
        X5().getEditText().removeTextChangedListener(this.LLJJIJIIJIL);
        if (c1746310vXp.LIZIZ && z) {
            Integer num2 = c1746310vXp.LIZ.maxLength;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 30;
            }
            C03DZ.LIZJ(W5());
            if (Intrinsics.LJFF(c1746310vXp.LIZLLL, "2")) {
                W5().LJI(null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), true);
            }
            if (!C1745310vWD.LIZ(c1746310vXp.LIZJ)) {
                W5().LJFF(c1746310vXp.LIZJ);
            } else {
                W5().LIZIZ();
            }
            EditText editText = X5().getEditText();
            X5().setInputType(131072);
            editText.setHorizontallyScrolling(false);
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(iIntValue)});
            X5().setHint(c1746310vXp.LIZ.hint);
            C946503mx.LIZLLL(editText, b6().LLJIJIL);
            editText.addTextChangedListener(this.LLJJIJIIJIL);
            X5().setOnEditTextFocusChangeListener(this.LLJJIJIL);
            if (this.LLJJIJI) {
                DeliveryInstructionViewModel deliveryInstructionViewModelB6 = b6();
                int layoutPosition = getLayoutPosition();
                deliveryInstructionViewModelB6.getClass();
                deliveryInstructionViewModelB6.setStateImmediate(new AwS38S0001000_26(layoutPosition, 21));
                HandlerHook.viewPostDelay(editText, new ARunnableS101S0100000_1((Object) editText, 78), 300L);
                this.LLJJIJI = false;
            }
        } else {
            C03DZ.LIZ(W5());
            C946503mx.LIZLLL(X5().getEditText(), null);
            X5().setOnEditTextFocusChangeListener(null);
            KeyboardUtils.LIZIZ(X5().getEditText());
        }
        View viewFindViewById4 = this.LLJJI;
        if (viewFindViewById4 == null) {
            View viewLJJIJL3 = LJJIJL();
            if (viewLJJIJL3 != null) {
                viewFindViewById4 = viewLJJIJL3.findViewById(R.id.eqx);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJJI = (ConstraintLayout) viewFindViewById4;
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.0vXn
            @Override // X.AbstractViewOnClickListenerC420730Ged
            public final void LIZ(View view) {
                if (view != null) {
                    DeliveryInstructionItemViewHolder deliveryInstructionItemViewHolder = this.LLILZ;
                    C1746310vXp c1746310vXp2 = c1746310vXp;
                    boolean z2 = z;
                    DeliveryInstructionViewModel deliveryInstructionViewModelB62 = deliveryInstructionItemViewHolder.b6();
                    deliveryInstructionViewModelB62.getClass();
                    deliveryInstructionViewModelB62.withState(new AwS77S0210000_26(deliveryInstructionViewModelB62, c1746310vXp2, true, 7));
                    if (!c1746310vXp2.LIZIZ && z2) {
                        deliveryInstructionItemViewHolder.LLJJIJI = true;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(700L);
            }
        }, viewFindViewById4);
        int i = C20094413jq.LJIIZILJ;
        View view = this.LLJJI;
        if (view == null) {
            View viewLJJIJL4 = LJJIJL();
            if (viewLJJIJL4 != null) {
                viewFindViewById2 = viewLJJIJL4.findViewById(R.id.eqx);
            }
            this.LLJJI = (ConstraintLayout) viewFindViewById2;
            view = viewFindViewById2;
        }
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LJIIIZ = new AwS605S0100000_26(this, 912);
        c1397760mTe.LIZ = String.valueOf(deliveryInstructionOption.instruction);
        q0.LJIJ(view, c1397760mTe.LIZ());
    }
}
