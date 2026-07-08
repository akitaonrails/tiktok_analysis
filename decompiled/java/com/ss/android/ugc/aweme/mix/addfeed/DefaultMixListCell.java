package com.ss.android.ugc.aweme.mix.addfeed;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0I7D;
import X.C0WZX;
import X.C1168640gW6;
import X.C1168680gWA;
import X.C1168690gWB;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1208860hYy;
import X.C1208930hZ5;
import X.C1360500lVY;
import X.C1360520lVa;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1735430vGH;
import X.C1765020w20;
import X.C19719912Dl;
import X.C21412118qt;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C444960Hcc;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1168720gWE;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1735440vGI;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC451590HnJ;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.ACListenerS121S0200000_18;
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS118S0100000_18;
import Y.ARunnableS26S0110000_7;
import android.graphics.drawable.ColorDrawable;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class DefaultMixListCell extends PowerCell<C1168640gW6> implements InterfaceC1171660gay {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public EditText LL;
    public TuxTextView LLILLJJLI;
    public View LLILLL;
    public LinearLayout LLILZ;
    public TuxSpinner LLILZIL;
    public ImageView LLILZLL;
    public TextView LLIZ;
    public C1735430vGH LLIZLLLIL;
    public C1168640gW6 LLJ;
    public final C1208930hZ5 LLJI = new C1208930hZ5(this, 1);
    public int LLJIJIL = 25;
    public final AssemVMLazy LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DefaultMixListCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/mix/addfeed/IMixFeedControl;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(DefaultMixListCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/editname/EditPlayListNameEditTextVM;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public DefaultMixListCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditPlayListNameEditTextVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 399);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(132);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 384), awS562S0100000_18, AFwS206S0000000_18.get$arr$(178), new AwS562S0100000_18((C03K6) this, 385), new AwS562S0100000_18((C03K6) this, 387), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 389), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 391), null, new AwS562S0100000_18((C03K6) this, 392));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 386);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 388);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 390);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 36));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 393);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 394);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 395);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 396);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 397);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 398), awS562S0100000_18, AFwS206S0000000_18.get$arr$(179), new AwS562S0100000_18((C03K6) this, 400), new AwS562S0100000_18((C03K6) this, 401), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 402), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 403), null, new AwS562S0100000_18((C03K6) this, 404));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 405), awS562S0100000_18, AFwS206S0000000_18.get$arr$(180), new AwS562S0100000_18((C03K6) this, 406), new AwS562S0100000_18((C03K6) this, 407), new AwS562S0100000_18((C03K6) this, 382), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 383));
        }
        this.LLJILJIL = assemVMLazy;
    }

    public final InterfaceC1168720gWE I5() {
        return (InterfaceC1168720gWE) this.LLJI.getValue(this, LLJILJILJ[0]);
    }

    public final void L5() {
        View view = this.LLILLL;
        if (view == null) {
            view = null;
        }
        view.setBackground(new ColorDrawable(C960203pA.LIZ(R.attr.nb, this.itemView.getContext())));
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(8, linearLayout);
        TuxSpinner tuxSpinner = this.LLILZIL;
        if (tuxSpinner == null) {
            tuxSpinner = null;
        }
        HandlerHook.viewPostDelay(tuxSpinner, new ARunnableS118S0100000_18(this, 22), 300L);
        ImageView imageView = this.LLILZLL;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.LJZI(0, imageView);
        TextView textView = this.LLIZ;
        (textView != null ? textView : null).setText(this.itemView.getContext().getText(2131840543));
    }

    public final void P5() {
        C1360520lVa c1360520lVa = new C1360520lVa();
        EditText editText = this.LL;
        if (editText == null) {
            editText = null;
        }
        c1360520lVa.LIZ.append((CharSequence) String.valueOf(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HP2DaCvshZtcIMeggwCuwxXF02/i1xHlZ+1g==", null)).length()));
        c1360520lVa.LIZ.append((CharSequence) (C444960Hcc.LIZIZ() ? "\u200f\\" : "\u200e/"));
        c1360520lVa.LIZ.append((CharSequence) String.valueOf(this.LLJIJIL));
        C1360500lVY c1360500lVY = c1360520lVa.LIZ;
        EditText editText2 = this.LL;
        if (editText2 == null) {
            editText2 = null;
        }
        if (C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HP2DaCvshZtcIMeggwCuwxXF02/i1xHlZ+1g==", null)).length() <= this.LLJIJIL) {
            TuxTextView tuxTextView = this.LLILLJJLI;
            (tuxTextView != null ? tuxTextView : null).setText(c1360500lVY);
            return;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C960203pA.LIZ(R.attr.zs, this.itemView.getContext()));
        EditText editText3 = this.LL;
        if (editText3 == null) {
            editText3 = null;
        }
        C786410Ut5.r2(c1360500lVY, foregroundColorSpan, 0, String.valueOf(C2204961BRm.LLJILLL(editText3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HP2DaCvshZtcIMeggwCuwxXF02/i1xHlZ+1g==", null)).length()).length() + 1, 33);
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        tuxTextView2.setText(c1360500lVY);
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(0, linearLayout);
        TextView textView = this.LLIZ;
        if (textView == null) {
            textView = null;
        }
        textView.setText(this.itemView.getContext().getText(2131828516));
        View view = this.LLILLL;
        (view != null ? view : null).setBackground(new ColorDrawable(C960203pA.LIZ(R.attr.zs, this.itemView.getContext())));
        N5(false);
    }

    public final void R5() {
        C1168640gW6 c1168640gW6 = this.LLJ;
        if ((c1168640gW6 == null ? null : c1168640gW6).LLILZIL) {
            if (c1168640gW6 == null) {
                c1168640gW6 = null;
            }
            c1168640gW6.LLILLJJLI = String.valueOf(C2204961BRm.LLLLJI((C0I7D) this.itemView.findViewById(R.id.fj4), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HP2DaCvshZtcIMeggwCuwxXF02/i1xHlZ+1g==", null)));
            InterfaceC1168720gWE interfaceC1168720gWEI5 = I5();
            if (interfaceC1168720gWEI5 != null) {
                boolean zIsChecked = ((CompoundButton) this.itemView.findViewById(R.id.fiz)).isChecked();
                C1168640gW6 c1168640gW62 = this.LLJ;
                interfaceC1168720gWEI5.ks2(new C1168680gWA(zIsChecked, (c1168640gW62 != null ? c1168640gW62 : null).LLILLJJLI));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLJIJIL = 25;
        this.LLIZLLLIL = new C1735430vGH(1000L, 100L, new InterfaceC1735440vGI() { // from class: X.0gXb
            @Override // X.InterfaceC1735440vGI
            public final void LJJI(long j) {
            }

            @Override // X.InterfaceC1735440vGI
            public final void onStart() {
            }

            @Override // X.InterfaceC1735440vGI
            public final void LIZLLL() {
                EditText editText = this.LL.LL;
                if (editText == null) {
                    editText = null;
                }
                if (Intrinsics.LJFF(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HP2DaCvshZtcIMeggwCuwxXF02/i1xHlZ+1g==", null)).toString(), "")) {
                    TuxSpinner tuxSpinner = this.LL.LLILZIL;
                    if (tuxSpinner == null) {
                        tuxSpinner = null;
                    }
                    C786410Ut5.LLZILL(tuxSpinner, 8);
                    ImageView imageView = this.LL.LLILZLL;
                    if (imageView == null) {
                        imageView = null;
                    }
                    C786410Ut5.LJZI(8, imageView);
                    DefaultMixListCell defaultMixListCell = this.LL;
                    C1168640gW6 c1168640gW6 = defaultMixListCell.LLJ;
                    (c1168640gW6 != null ? c1168640gW6 : null).LLILZIL = false;
                    defaultMixListCell.N5(false);
                    return;
                }
                EditText editText2 = this.LL.LL;
                if (editText2 == null) {
                    editText2 = null;
                }
                if (a0.LJLIIIL(C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HP2DaCvshZtcIMeggwCuwxXF02/i1xHlZ+1g==", null)).toString()).toString().length() == 0) {
                    this.LL.L5();
                    DefaultMixListCell defaultMixListCell2 = this.LL;
                    C1168640gW6 c1168640gW62 = defaultMixListCell2.LLJ;
                    (c1168640gW62 != null ? c1168640gW62 : null).LLILZIL = false;
                    defaultMixListCell2.N5(false);
                    return;
                }
                EditText editText3 = this.LL.LL;
                if (editText3 == null) {
                    editText3 = null;
                }
                int length = C2204961BRm.LLJILLL(editText3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HP2DaCvshZtcIMeggwCuwxXF02/i1xHlZ+1g==", null)).toString().length();
                DefaultMixListCell defaultMixListCell3 = this.LL;
                if (length > defaultMixListCell3.LLJIJIL) {
                    C1168640gW6 c1168640gW63 = defaultMixListCell3.LLJ;
                    (c1168640gW63 != null ? c1168640gW63 : null).LLILZIL = false;
                    defaultMixListCell3.N5(false);
                    return;
                }
                TuxSpinner tuxSpinner2 = defaultMixListCell3.LLILZIL;
                if (tuxSpinner2 == null) {
                    tuxSpinner2 = null;
                }
                C786410Ut5.LLZILL(tuxSpinner2, 0);
                ImageView imageView2 = this.LL.LLILZLL;
                if (imageView2 == null) {
                    imageView2 = null;
                }
                C786410Ut5.LJZI(8, imageView2);
                AssemVMLazy assemVMLazy = this.LL.LLJILJIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = DefaultMixListCell.LLJILJILJ;
                EditPlayListNameEditTextVM editPlayListNameEditTextVM = (EditPlayListNameEditTextVM) assemVMLazy.getValue();
                EditText editText4 = this.LL.LL;
                if (editText4 == null) {
                    editText4 = null;
                }
                editPlayListNameEditTextVM.withState(new C1169500gXU(editPlayListNameEditTextVM, C2204961BRm.LLJILLL(editText4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HP2DaCvshZtcIMeggwCuwxXF02/i1xHlZ+1g==", null)).toString()));
            }
        });
        this.LL = (EditText) this.itemView.findViewById(R.id.fj4);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.fj9);
        this.LLILLL = this.itemView.findViewById(R.id.fj_);
        this.LLILZ = (LinearLayout) this.itemView.findViewById(R.id.fj8);
        this.LLILZIL = (TuxSpinner) this.itemView.findViewById(R.id.fjb);
        this.LLILZLL = (ImageView) this.itemView.findViewById(R.id.fj3);
        this.LLIZ = (TextView) this.itemView.findViewById(R.id.fj7);
        EditText editText = this.LL;
        if (editText == null) {
            editText = null;
        }
        editText.addTextChangedListener(new C1208860hYy(this, 2));
        P5();
        L5();
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gXY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1169480gXS) obj).LL;
            }
        }, null, new AwS597S0100000_18(this, 973), AFwS206S0000000_18.get$arr$(761), new AwS597S0100000_18(this, 974), 2, null);
        ImageView imageView = this.LLILZLL;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.LJZI(0, imageView);
        ImageView imageView2 = this.LLILZLL;
        C786410Ut5.Q7(imageView2 != null ? imageView2 : null, new ACListenerS153S0100000_18(this, 31));
    }

    public final void N5(boolean z) {
        InterfaceC1168720gWE interfaceC1168720gWEI5 = I5();
        if (interfaceC1168720gWEI5 != null) {
            interfaceC1168720gWEI5.ii1(new C1168690gWB(z));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C1168640gW6 c1168640gW6 = (C1168640gW6) interfaceC1891350zJl;
        this.LLJ = c1168640gW6;
        ((CompoundButton) this.itemView.findViewById(R.id.fiz)).setChecked(c1168640gW6.LLILZ);
        View viewFindViewById = this.itemView.findViewById(R.id.p7_);
        if (c1168640gW6.LLILZ) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        boolean z = c1168640gW6.LLILZ;
        EditText editText = this.LL;
        if (editText == null) {
            editText = null;
        }
        HandlerHook.viewPostDelay(editText, new ARunnableS26S0110000_7(this, z, 4), 300L);
        N5(c1168640gW6.LLILZIL);
        R5();
        ((AppCompatImageView) this.itemView.findViewById(R.id.fja)).setBackgroundResource(R.drawable.cnu);
        C786410Ut5.U7((C21412118qt) this.itemView.findViewById(R.id.fiz), new ACListenerS121S0200000_18(this, c1168640gW6, 10));
        C786410Ut5.I7(new ACListenerS121S0200000_18(this, c1168640gW6, 11), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dnv, viewGroup, false);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
