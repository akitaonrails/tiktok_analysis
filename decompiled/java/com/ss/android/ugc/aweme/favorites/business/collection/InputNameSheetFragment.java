package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C01GW;
import X.C098200Yq;
import X.C0C64;
import X.C0WZX;
import X.C1171340gaS;
import X.C1171420gaa;
import X.C1171430gab;
import X.C1172510gcL;
import X.C11JF;
import X.C11S5;
import X.C1208770hYp;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C21411818qq;
import X.C2204961BRm;
import X.C294880Bh8;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1172550gcP;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS118S0100000_18;
import Y.AfS178S0100000_9;
import Y.AfS179S0100000_10;
import Y.AkS473S0100000_10;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.favorites.business.collection.InputNameSheetFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.text.a0;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class InputNameSheetFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExPTYlHELIOSJyogO2svJiM/LSY4ICA9ZgwiOTonBiQhLBw7LSA4Dz0yLygpJzs=";
    public TuxSpinner LL;
    public EditText LLILLJJLI;
    public ImageView LLILLL;
    public TextView LLILZ;
    public C197039127h LLILZIL;
    public C11JF LLILZLL;
    public InterfaceC1172550gcP LLIZ;
    public TuxTextView LLIZLLLIL;
    public C21411818qq LLJ;
    public TuxTextView LLJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJIJIL;
    public boolean LLJILJIL;
    public List<String> LLJILLL;
    public AwS589S0100000_10 LLJJ;
    public boolean LLJILJILJ = true;
    public boolean LLJJI = true;
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(125));

    static {
        new C1172510gcL();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C11JF c11jf;
        super.onDestroy();
        C11JF c11jf2 = this.LLILZLL;
        if (c11jf2 == null || c11jf2.isDisposed() || (c11jf = this.LLILZLL) == null) {
            return;
        }
        c11jf.dispose();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC1172550gcP interfaceC1172550gcP;
        super.onDestroyView();
        if (!this.LLJJI || (interfaceC1172550gcP = this.LLIZ) == null) {
            return;
        }
        interfaceC1172550gcP.LIZIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        boolean z;
        String string;
        String string2;
        boolean z2;
        int i;
        int i2;
        String string3;
        EditText editText;
        int length;
        Bundle arguments;
        Bundle arguments2;
        String string4;
        String string5;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z = arguments3.getBoolean("enablePrivacySetting");
        } else {
            z = true;
        }
        this.LLJILJILJ = z;
        this.LLILZIL = (C197039127h) view.findViewById(R.id.wop);
        this.LLILZ = (TextView) view.findViewById(R.id.zjj);
        this.LLILLL = (ImageView) view.findViewById(R.id.lbx);
        C21411818qq c21411818qq = null;
        if (C294880Bh8.LIZ()) {
            ImageView imageView = this.LLILLL;
            if (imageView == null) {
                imageView = null;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17));
            c419910GdJ.LIZ = R.raw.icon_x_mark_circle_fill;
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1p, view.getContext());
            imageView.setImageDrawable(c419910GdJ.LIZ(view.getContext()));
        }
        this.LLILLJJLI = (EditText) view.findViewById(R.id.hd7);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.zww);
        this.LLJ = (C21411818qq) view.findViewById(R.id.rus);
        this.LLJI = (TuxTextView) view.findViewById(R.id.zd0);
        this.LLJIJIL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.sxl);
        final TextView textView = (TextView) view.findViewById(R.id.zjm);
        TextView textView2 = (TextView) view.findViewById(R.id.title);
        View viewFindViewById = view.findViewById(R.id.dat);
        View viewFindViewById2 = view.findViewById(R.id.bmy);
        this.LL = (TuxSpinner) view.findViewById(R.id.nl1);
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            string = arguments4.getString("title");
        } else {
            string = null;
        }
        textView2.setText(string);
        C197039127h c197039127h = this.LLILZIL;
        if (c197039127h == null) {
            c197039127h = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            string2 = arguments5.getString("btnName");
        } else {
            string2 = null;
        }
        c197039127h.setText(string2);
        EditText editText2 = this.LLILLJJLI;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.setHint(2131834455);
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 18), viewFindViewById);
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 19), viewFindViewById2);
        Bundle arguments6 = getArguments();
        if (arguments6 != null && arguments6.getBoolean("cancelStyle")) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        Bundle arguments7 = getArguments();
        if (arguments7 != null && arguments7.getBoolean("cancelStyle")) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        C786410Ut5.LJLLLLLL(i2, viewFindViewById2);
        ImageView imageView2 = this.LLILLL;
        if (imageView2 == null) {
            imageView2 = null;
        }
        C786410Ut5.Q7(imageView2, new ACListenerS153S0100000_18(this, 20));
        EditText editText3 = this.LLILLJJLI;
        if (editText3 == null) {
            editText3 = null;
        }
        editText3.addTextChangedListener(new TextWatcher() { // from class: X.0gcO
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int length2;
                String string6;
                boolean z3;
                String string7;
                boolean z4 = false;
                if (editable != null && (string7 = editable.toString()) != null) {
                    length2 = string7.length();
                } else {
                    length2 = 0;
                }
                EditText editText4 = this.LL.LLILLJJLI;
                TextView textView3 = null;
                if (editText4 == null) {
                    editText4 = null;
                }
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C446980Hfs.LIZ(editText4.getContext(), R.color.rt));
                C1360520lVa c1360520lVa = new C1360520lVa();
                if (length2 > 30) {
                    if (C294880Bh8.LIZ()) {
                        c1360520lVa.LIZIZ(String.valueOf(length2));
                    } else {
                        c1360520lVa.LIZJ(C787200UuM.LIZ(length2), foregroundColorSpan, 33);
                    }
                } else if (C294880Bh8.LIZ()) {
                    c1360520lVa.LIZIZ(String.valueOf(length2));
                } else {
                    c1360520lVa.LIZIZ(C787200UuM.LIZ(length2));
                }
                c1360520lVa.LJI("/");
                if (C294880Bh8.LIZ()) {
                    c1360520lVa.LIZIZ("30");
                } else {
                    c1360520lVa.LIZIZ(C787200UuM.LIZ(30));
                }
                textView.setText(c1360520lVa.LIZ);
                InputNameSheetFragment inputNameSheetFragment = this.LL;
                if (editable == null || (string6 = editable.toString()) == null) {
                    string6 = "";
                }
                ImageView imageView3 = inputNameSheetFragment.LLILLL;
                if (imageView3 == null) {
                    imageView3 = null;
                }
                C786410Ut5.LJZI(0, imageView3);
                TuxSpinner tuxSpinner = inputNameSheetFragment.LL;
                if (tuxSpinner == null) {
                    tuxSpinner = null;
                }
                C786410Ut5.LLZILL(tuxSpinner, 8);
                C11JF c11jf = inputNameSheetFragment.LLILZLL;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                if (string6.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    ImageView imageView4 = inputNameSheetFragment.LLILLL;
                    if (imageView4 == null) {
                        imageView4 = null;
                    }
                    C786410Ut5.LJZI(8, imageView4);
                    TextView textView4 = inputNameSheetFragment.LLILZ;
                    if (textView4 == null) {
                        textView4 = null;
                    }
                    C786410Ut5.LLIL(textView4, 4);
                    C197039127h c197039127h2 = inputNameSheetFragment.LLILZIL;
                    if (c197039127h2 == null) {
                        c197039127h2 = null;
                    }
                    c197039127h2.setEnabled(false);
                } else if (string6.length() > 30) {
                    TextView textView5 = inputNameSheetFragment.LLILZ;
                    if (textView5 == null) {
                        textView5 = null;
                    }
                    C786410Ut5.LLIL(textView5, 0);
                    TextView textView6 = inputNameSheetFragment.LLILZ;
                    if (textView6 == null) {
                        textView6 = null;
                    }
                    textView6.setText(inputNameSheetFragment.getText(2131834453));
                    C197039127h c197039127h3 = inputNameSheetFragment.LLILZIL;
                    if (c197039127h3 == null) {
                        c197039127h3 = null;
                    }
                    c197039127h3.setEnabled(false);
                } else if (a0.LJJJIL(string6)) {
                    TextView textView7 = inputNameSheetFragment.LLILZ;
                    if (textView7 == null) {
                        textView7 = null;
                    }
                    C786410Ut5.LLIL(textView7, 0);
                    TextView textView8 = inputNameSheetFragment.LLILZ;
                    if (textView8 == null) {
                        textView8 = null;
                    }
                    textView8.setText(inputNameSheetFragment.getText(2131828949));
                    C197039127h c197039127h4 = inputNameSheetFragment.LLILZIL;
                    if (c197039127h4 == null) {
                        c197039127h4 = null;
                    }
                    c197039127h4.setEnabled(false);
                } else {
                    TextView textView9 = inputNameSheetFragment.LLILZ;
                    if (textView9 == null) {
                        textView9 = null;
                    }
                    C786410Ut5.LLIL(textView9, 4);
                    C197039127h c197039127h5 = inputNameSheetFragment.LLILZIL;
                    if (c197039127h5 == null) {
                        c197039127h5 = null;
                    }
                    c197039127h5.setEnabled(true);
                }
                AwS589S0100000_10 awS589S0100000_10 = inputNameSheetFragment.LLJJ;
                if (awS589S0100000_10 != null) {
                    TextView textView10 = inputNameSheetFragment.LLILZ;
                    if (textView10 != null) {
                        textView3 = textView10;
                    }
                    if (textView3.getVisibility() == 0) {
                        z4 = true;
                    }
                    awS589S0100000_10.invoke(Boolean.valueOf(z4));
                }
            }
        });
        EditText editText4 = this.LLILLJJLI;
        if (editText4 == null) {
            editText4 = null;
        }
        Bundle arguments8 = getArguments();
        if (arguments8 == null || (string3 = arguments8.getString("defaultInput")) == null) {
            string3 = "";
        }
        editText4.setText(string3);
        EditText editText5 = this.LLILLJJLI;
        if (editText5 == null) {
            editText = null;
            editText5 = null;
        } else {
            editText = editText5;
        }
        Editable editableLLJILJILJ = C2204961BRm.LLJILJILJ(editText5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLl2EYAwyyYek258TfKMwE/JPmhGt8VKGeyu068hZlx5Erc=", null));
        if (editableLLJILJILJ != null && (string5 = editableLLJILJILJ.toString()) != null) {
            length = string5.length();
        } else {
            length = 0;
        }
        editText.setSelection(length);
        C197039127h c197039127h2 = this.LLILZIL;
        if (c197039127h2 == null) {
            c197039127h2 = null;
        }
        C786410Ut5.I7(new AbS699S0100000_18(this, 1, 42), c197039127h2);
        boolean z3 = !this.LLJILJILJ;
        EditText editText6 = this.LLILLJJLI;
        if (editText6 == null) {
            editText6 = null;
        }
        HandlerHook.viewPostDelay(editText6, new ARunnableS118S0100000_18(this, 14), 200L);
        C21411818qq c21411818qq2 = this.LLJ;
        if (c21411818qq2 == null) {
            c21411818qq2 = null;
        }
        C786410Ut5.C7(c21411818qq2, new C1208770hYp(this, 0));
        if (z3) {
            TuxTextView tuxTextView = this.LLJI;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            TuxTextView tuxTextView2 = this.LLIZLLLIL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
            C21411818qq c21411818qq3 = this.LLJ;
            if (c21411818qq3 != null) {
                c21411818qq = c21411818qq3;
            }
            C786410Ut5.LLLLZI(c21411818qq, 8);
        } else {
            TuxTextView tuxTextView3 = this.LLJI;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView3, 0);
            TuxTextView tuxTextView4 = this.LLIZLLLIL;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView4, 0);
            C21411818qq c21411818qq4 = this.LLJ;
            if (c21411818qq4 != null) {
                c21411818qq = c21411818qq4;
            }
            C786410Ut5.LLLLZI(c21411818qq, 0);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ls_collection_recommend_name", true, false) && (arguments = getArguments()) != null && arguments.getBoolean("isLSContent") && (arguments2 = getArguments()) != null && (string4 = arguments2.getString("awemeId")) != null) {
            new C1171340gaS().LLILLL.LL.LL.LIZJ(string4).LJJIJIIJIL(C1171420gaa.LL).LJJIJIIJI(C1171430gab.LL).LJL(C11S5.LIZ()).LJJJJZI(new AkS473S0100000_10(this, 1)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS179S0100000_10(this, 4), new AfS178S0100000_9(this, 18));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c6f, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
