package com.ss.android.ugc.aweme.mix.editname;

import X.AbstractC738140SxQ;
import X.C01D1;
import X.C09R3;
import X.C0OBG;
import X.C0OM1;
import X.C0WZX;
import X.C1169160gWw;
import X.C1169500gXU;
import X.C1169510gXV;
import X.C1208860hYy;
import X.C1251150ifB;
import X.C1252710ihh;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1360500lVY;
import X.C1360520lVa;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C1735430vGH;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C297000BkY;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452070Ho5;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1169560gXa;
import X.InterfaceC1735440vGI;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS87S0200000_18;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS69S1000000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import wh6.AbS508S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class EditPlayListNameAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public int LLIZLLLIL = 25;
    public final long LLJ = 1000;
    public EditText LLJI;
    public TextView LLJIJIL;
    public View LLJILJIL;
    public LinearLayout LLJILJILJ;
    public TuxSpinner LLJILLL;
    public C197039127h LLJJ;
    public ImageView LLJJI;
    public TextView LLJJIII;
    public SmartImageView LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final C1735430vGH LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditPlayListNameAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/editname/EditPlayListNameEditTextVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(EditPlayListNameAssem.class, "createVM", "getCreateVM()Lcom/ss/android/ugc/aweme/mix/createmix/viewmodel/MixCreateViewModel;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public EditPlayListNameAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditPlayListNameEditTextVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 476);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(146);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((AbstractC738140SxQ) this, 477), aFwS256S0000000_18, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJIJIL = assemVMLazy;
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MixCreateViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ2, 478), AFwS256S0000000_18.get$arr$(147), null, true);
        this.LLJJJIL = new C1735430vGH(this.LLJ, 100L, new InterfaceC1735440vGI() { // from class: X.0gXZ
            @Override // X.InterfaceC1735440vGI
            public final void LJJI(long j) {
            }

            @Override // X.InterfaceC1735440vGI
            public final void onStart() {
            }

            @Override // X.InterfaceC1735440vGI
            public final void LIZLLL() {
                this.LL.Ho();
            }
        });
    }

    public final void Ho() {
        EditText editText = this.LLJI;
        if (editText == null) {
            editText = null;
        }
        if (Intrinsics.LJFF(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).toString(), "")) {
            TuxSpinner tuxSpinner = this.LLJILLL;
            if (tuxSpinner == null) {
                tuxSpinner = null;
            }
            C786410Ut5.LLZILL(tuxSpinner, 8);
            ImageView imageView = this.LLJJI;
            C786410Ut5.LJZI(8, imageView != null ? imageView : null);
            if (C297000BkY.LIZ()) {
                Go();
                return;
            }
            return;
        }
        EditText editText2 = this.LLJI;
        if (editText2 == null) {
            editText2 = null;
        }
        if (a0.LJLIIIL(C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).toString()).toString().length() == 0) {
            No();
            return;
        }
        EditText editText3 = this.LLJI;
        if (editText3 == null) {
            editText3 = null;
        }
        if (C2204961BRm.LLJILLL(editText3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).toString().length() <= this.LLIZLLLIL) {
            if (C297000BkY.LIZ()) {
                TuxSpinner tuxSpinner2 = this.LLJILLL;
                C786410Ut5.LLZILL(tuxSpinner2 != null ? tuxSpinner2 : null, 8);
                Go();
                return;
            }
            TuxSpinner tuxSpinner3 = this.LLJILLL;
            if (tuxSpinner3 == null) {
                tuxSpinner3 = null;
            }
            C786410Ut5.LLZILL(tuxSpinner3, 0);
            EditPlayListNameEditTextVM editPlayListNameEditTextVMLo = Lo();
            EditText editText4 = this.LLJI;
            if (editText4 == null) {
                editText4 = null;
            }
            editPlayListNameEditTextVMLo.withState(new C1169500gXU(editPlayListNameEditTextVMLo, C2204961BRm.LLJILLL(editText4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).toString()));
            ImageView imageView2 = this.LLJJI;
            C786410Ut5.LJZI(8, imageView2 != null ? imageView2 : null);
        }
    }

    public final MixCreateViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (MixCreateViewModel) assemVMLazy.getValue();
    }

    public final EditPlayListNameEditTextVM Lo() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (EditPlayListNameEditTextVM) assemVMLazy.getValue();
    }

    public final void Go() {
        if (C297000BkY.LIZ()) {
            EditText editText = this.LLJI;
            if (editText == null) {
                editText = null;
            }
            if (C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).length() == 0) {
                C197039127h c197039127h = this.LLJJ;
                if (c197039127h == null) {
                    c197039127h = null;
                }
                c197039127h.setButtonVariant(1);
                C197039127h c197039127h2 = this.LLJJ;
                (c197039127h2 != null ? c197039127h2 : null).setEnabled(false);
                return;
            }
        }
        EditText editText2 = this.LLJI;
        if (editText2 == null) {
            editText2 = null;
        }
        if (C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).length() > 0) {
            EditText editText3 = this.LLJI;
            if (editText3 == null) {
                editText3 = null;
            }
            if (C2204961BRm.LLJILLL(editText3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).length() <= this.LLIZLLLIL) {
                C197039127h c197039127h3 = this.LLJJ;
                if (c197039127h3 == null) {
                    c197039127h3 = null;
                }
                c197039127h3.setButtonVariant(0);
                C197039127h c197039127h4 = this.LLJJ;
                (c197039127h4 != null ? c197039127h4 : null).setEnabled(true);
            }
        }
    }

    public final void No() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            View view = this.LLJILJIL;
            if (view == null) {
                view = null;
            }
            view.setBackground(new ColorDrawable(C960203pA.LIZ(R.attr.nb, c19egLIZ)));
            C197039127h c197039127h = this.LLJJ;
            if (c197039127h == null) {
                c197039127h = null;
            }
            c197039127h.setButtonVariant(0);
        }
        LinearLayout linearLayout = this.LLJILJILJ;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(8, linearLayout);
        TuxSpinner tuxSpinner = this.LLJILLL;
        if (tuxSpinner == null) {
            tuxSpinner = null;
        }
        C786410Ut5.LLZILL(tuxSpinner, 8);
        ImageView imageView = this.LLJJI;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.LJZI(0, imageView);
        TextView textView = this.LLJJIII;
        if (textView == null) {
            textView = null;
        }
        Context context = getContext();
        textView.setText(context != null ? context.getText(2131840543) : null);
        C197039127h c197039127h2 = this.LLJJ;
        (c197039127h2 != null ? c197039127h2 : null).setEnabled(false);
    }

    public final void Oo() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            EditText editText = this.LLJI;
            if (editText == null) {
                editText = null;
            }
            c1360520lVa.LIZ.append((CharSequence) String.valueOf(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).length()));
            c1360520lVa.LIZ.append((CharSequence) "/");
            c1360520lVa.LIZ.append((CharSequence) String.valueOf(this.LLIZLLLIL));
            C1360500lVY c1360500lVY = c1360520lVa.LIZ;
            EditText editText2 = this.LLJI;
            if (editText2 == null) {
                editText2 = null;
            }
            if (C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).length() <= this.LLIZLLLIL) {
                TextView textView = this.LLJIJIL;
                (textView != null ? textView : null).setText(c1360500lVY);
                return;
            }
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(c19egLIZ.getResources().getColor(R.color.cl));
            EditText editText3 = this.LLJI;
            if (editText3 == null) {
                editText3 = null;
            }
            C786410Ut5.r2(c1360500lVY, foregroundColorSpan, 0, String.valueOf(C2204961BRm.LLJILLL(editText3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).length()).length() + 1, 33);
            TextView textView2 = this.LLJIJIL;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(c1360500lVY);
            LinearLayout linearLayout = this.LLJILJILJ;
            if (linearLayout == null) {
                linearLayout = null;
            }
            C786410Ut5.LJZL(0, linearLayout);
            TextView textView3 = this.LLJJIII;
            if (textView3 == null) {
                textView3 = null;
            }
            Context context = getContext();
            textView3.setText(context != null ? context.getText(2131828516) : null);
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 != null) {
                View view = this.LLJILJIL;
                (view != null ? view : null).setBackground(new ColorDrawable(C960203pA.LIZ(R.attr.zs, c19egLIZ2)));
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        MixCreateViewModel mixCreateViewModelJo = Jo();
        EditText editText = this.LLJI;
        if (editText == null) {
            editText = null;
        }
        mixCreateViewModelJo.setStateImmediate(new AwS69S1000000_18(So(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).toString()), 33));
        super.onPause();
    }

    public static String So(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        while (length > 0) {
            int i = length - 1;
            if (Intrinsics.LJI(charArray[i], 32) > 0) {
                break;
            }
            length = i;
        }
        if (length < charArray.length) {
            return new String(charArray).substring(0, length);
        }
        return new String(charArray);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Object objJ2;
        String str;
        Integer numValueOf;
        int i;
        Integer num;
        CharSequence text;
        CharSequence text2;
        CharSequence text3;
        CharSequence text4;
        CharSequence text5;
        CharSequence text6;
        CharSequence text7;
        CharSequence text8;
        String str2;
        List<String> urlList;
        String str3;
        this.LLIZLLLIL = 25;
        this.LLJI = (EditText) view.findViewById(R.id.hd7);
        this.LLJIJIL = (TextView) view.findViewById(R.id.mm1);
        this.LLJILJIL = view.findViewById(R.id.view);
        this.LLJILJILJ = (LinearLayout) view.findViewById(R.id.gpz);
        this.LLJILLL = (TuxSpinner) view.findViewById(R.id.nl1);
        this.LLJJ = (C197039127h) view.findViewById(R.id.d6g);
        this.LLJJI = (ImageView) view.findViewById(R.id.fkh);
        this.LLJJIII = (TextView) view.findViewById(R.id.zjj);
        TextView textView = (TextView) view.findViewById(R.id.g24);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            objJ2 = C786410Ut5.J2(c19egLIZ, "input_method");
        } else {
            objJ2 = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) objJ2;
        if (C297000BkY.LIZ()) {
            this.LLJJIJI = (SmartImageView) view.findViewById(R.id.qua);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZ = R.raw.icon_playlist_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ne);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(view.getContext());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(view.getContext()));
            SmartImageView smartImageView = this.LLJJIJI;
            if (smartImageView == null) {
                smartImageView = null;
            }
            smartImageView.setBackground(layerDrawableLJIILIIL);
            UrlModel urlModel = Jo().LLILZLL;
            if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str3 = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str3);
                SmartImageView smartImageView2 = this.LLJJIJI;
                if (smartImageView2 == null) {
                    smartImageView2 = null;
                }
                c1331670kl3LJIIIZ.LJJ(smartImageView2);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            }
        }
        EditText editText = this.LLJI;
        if (editText == null) {
            editText = null;
        }
        HandlerHook.viewPostDelay(editText, new ARunnableS87S0200000_18(this, inputMethodManager, 5), 300L);
        C1169510gXV c1169510gXV = (C1169510gXV) C1252710ihh.LJIIIIZZ(this, C13LE.LIZ(InterfaceC1169560gXa.class));
        if (c1169510gXV != null) {
            str = c1169510gXV.LIZLLL;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            EditText editText2 = this.LLJI;
            if (editText2 == null) {
                editText2 = null;
            }
            editText2.setText(str);
            EditText editText3 = this.LLJI;
            if (editText3 == null) {
                editText3 = null;
            }
            editText3.setSelection(str.length());
        }
        C1169510gXV c1169510gXV2 = (C1169510gXV) C1252710ihh.LJIIIIZZ(this, C13LE.LIZ(InterfaceC1169560gXa.class));
        if (c1169510gXV2 != null && (str2 = c1169510gXV2.LIZIZ) != null && str2.length() != 0) {
            EditText editText4 = this.LLJI;
            if (editText4 == null) {
                editText4 = null;
            }
            editText4.setText(str2);
            EditText editText5 = this.LLJI;
            if (editText5 == null) {
                editText5 = null;
            }
            editText5.setSelection(str2.length());
        }
        EditText editText6 = this.LLJI;
        if (editText6 == null) {
            editText6 = null;
        }
        editText6.addTextChangedListener(new C1208860hYy(this, 3));
        C1169510gXV c1169510gXV3 = (C1169510gXV) C1252710ihh.LJIIIIZZ(this, C13LE.LIZ(InterfaceC1169560gXa.class));
        if (c1169510gXV3 != null) {
            numValueOf = Integer.valueOf(c1169510gXV3.LIZ);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 1) {
                Context context = getContext();
                if (context != null) {
                    text7 = context.getText(2131837897);
                } else {
                    text7 = null;
                }
                textView.setText(text7);
                C197039127h c197039127h = this.LLJJ;
                if (c197039127h == null) {
                    c197039127h = null;
                }
                Context context2 = getContext();
                if (context2 != null) {
                    text8 = context2.getText(2131838122);
                } else {
                    text8 = null;
                }
                c197039127h.setText(text8);
                C1169160gWw c1169160gWw = C1169160gWw.LIZ;
                String str4 = Jo().LLILLJJLI;
                c1169160gWw.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str4);
                C20684815ws.LJIILLIIL("enter_playlist_name", c2344009Gk.LIZ);
            } else if (numValueOf != null) {
                if (numValueOf.intValue() == 2) {
                    Context context3 = getContext();
                    if (context3 != null) {
                        text4 = context3.getText(2131828508);
                    } else {
                        text4 = null;
                    }
                    textView.setText(text4);
                    if (C297000BkY.LIZ()) {
                        C197039127h c197039127h2 = this.LLJJ;
                        if (c197039127h2 == null) {
                            c197039127h2 = null;
                        }
                        Context context4 = getContext();
                        if (context4 != null) {
                            text6 = context4.getText(2131840535);
                        } else {
                            text6 = null;
                        }
                        c197039127h2.setText(text6);
                    } else {
                        C197039127h c197039127h3 = this.LLJJ;
                        if (c197039127h3 == null) {
                            c197039127h3 = null;
                        }
                        Context context5 = getContext();
                        if (context5 != null) {
                            text5 = context5.getText(2131846775);
                        } else {
                            text5 = null;
                        }
                        c197039127h3.setText(text5);
                    }
                } else if (numValueOf.intValue() == 3) {
                    Context context6 = getContext();
                    if (context6 != null) {
                        text = context6.getText(2131837897);
                    } else {
                        text = null;
                    }
                    textView.setText(text);
                    if (C297000BkY.LIZ()) {
                        C197039127h c197039127h4 = this.LLJJ;
                        if (c197039127h4 == null) {
                            c197039127h4 = null;
                        }
                        Context context7 = getContext();
                        if (context7 != null) {
                            text3 = context7.getText(2131840535);
                        } else {
                            text3 = null;
                        }
                        c197039127h4.setText(text3);
                    } else {
                        C197039127h c197039127h5 = this.LLJJ;
                        if (c197039127h5 == null) {
                            c197039127h5 = null;
                        }
                        Context context8 = getContext();
                        if (context8 != null) {
                            text2 = context8.getText(2131838122);
                        } else {
                            text2 = null;
                        }
                        c197039127h5.setText(text2);
                    }
                    this.LLJJIJIIJIL = true;
                    C1169160gWw c1169160gWw2 = C1169160gWw.LIZ;
                    String str5 = Jo().LLILLJJLI;
                    c1169160gWw2.getClass();
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("enter_from", str5);
                    C20684815ws.LJIILLIIL("enter_playlist_name", c2344009Gk2.LIZ);
                }
            }
        }
        ImageView imageView = this.LLJJI;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.Q7(imageView, new ACListenerS153S0100000_18(this, 34));
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.y08);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS419S0200000_18(this, inputMethodManager, 40));
        c0om1.LJ(c1251150ifB);
        c0om1.LIZLLL = false;
        tuxNavBar.setNavActions(c0om1);
        C197039127h c197039127h6 = this.LLJJ;
        if (c197039127h6 == null) {
            c197039127h6 = null;
        }
        C0OBG.LIZ(300L, c197039127h6);
        C197039127h c197039127h7 = this.LLJJ;
        if (c197039127h7 == null) {
            c197039127h7 = null;
        }
        C786410Ut5.I7(new AbS508S0200000_18(this, inputMethodManager, 9, 42), c197039127h7);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gU4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163880gOQ) obj).LLIZ;
            }
        }, null, new AwS597S0100000_18(this, 130), new AwS562S0100000_18(this, 480), new AwS597S0100000_18(this, 143), 2, null);
        Oo();
        No();
        if (C297000BkY.LIZ()) {
            AssemViewModel.asyncSubscribe$default(Lo(), new C2217381BqS() { // from class: X.0gXW
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1169480gXS) obj).LL;
                }
            }, null, new AwS597S0100000_18(this, 138), new AwS562S0100000_18(this, 482), new AwS597S0100000_18(this, 139), 2, null);
        } else {
            AssemViewModel.asyncSubscribe$default(Lo(), new C2217381BqS() { // from class: X.0gXX
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1169480gXS) obj).LL;
                }
            }, null, new AwS597S0100000_18(this, 141), AFwS206S0000000_18.get$arr$(192), new AwS597S0100000_18(this, 142), 2, null);
        }
        AssemViewModel.asyncSubscribe$default(Lo(), new C2217381BqS() { // from class: X.0gXT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1169480gXS) obj).LLILLJJLI;
            }
        }, null, new AwS583S0100000_4(this, 88), AFwS206S0000000_18.get$arr$(191), new AwS597S0100000_18(this, 133), 2, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gU0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163880gOQ) obj).LLIZ;
            }
        }, null, new AwS597S0100000_18(this, 134), new AwS562S0100000_18(this, 481), new AwS597S0100000_18(this, 136), 2, null);
        EditPlayListNameEditTextVM editPlayListNameEditTextVMLo = Lo();
        C1169510gXV c1169510gXV4 = (C1169510gXV) C1252710ihh.LJIIIIZZ(this, C13LE.LIZ(InterfaceC1169560gXa.class));
        if (c1169510gXV4 != null) {
            i = c1169510gXV4.LJ;
        } else {
            i = 0;
        }
        editPlayListNameEditTextVMLo.LLILLL = i;
        EditPlayListNameEditTextVM editPlayListNameEditTextVMLo2 = Lo();
        C1169510gXV c1169510gXV5 = (C1169510gXV) C1252710ihh.LJIIIIZZ(this, C13LE.LIZ(InterfaceC1169560gXa.class));
        if (c1169510gXV5 != null) {
            num = c1169510gXV5.LJFF;
        } else {
            num = null;
        }
        editPlayListNameEditTextVMLo2.LLILZ = num;
        ImageView imageView2 = this.LLJJI;
        if (imageView2 == null) {
            imageView2 = null;
        }
        C786410Ut5.LJZI(0, imageView2);
        if (!TextUtils.isEmpty(Jo().vQ2())) {
            EditText editText7 = this.LLJI;
            if (editText7 == null) {
                editText7 = null;
            }
            editText7.setText(Jo().vQ2());
            Jo().vQ2();
        }
        if (C297000BkY.LIZ()) {
            Ho();
        }
        C1169510gXV c1169510gXV6 = (C1169510gXV) C1252710ihh.LJIIIIZZ(this, C13LE.LIZ(InterfaceC1169560gXa.class));
        if (c1169510gXV6 != null && c1169510gXV6.LIZ == 2) {
            return;
        }
        C1169160gWw c1169160gWw3 = C1169160gWw.LIZ;
        String str6 = Jo().LLILLJJLI;
        String str7 = Jo().LLILLL;
        c1169160gWw3.getClass();
        C1169160gWw.LJFF(str6, str7);
    }
}
