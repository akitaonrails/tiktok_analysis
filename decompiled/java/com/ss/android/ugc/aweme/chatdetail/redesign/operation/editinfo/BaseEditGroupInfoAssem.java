package com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo;

import X.C019F;
import X.C01GW;
import X.C0DL6;
import X.C0I7D;
import X.C1383370m6R;
import X.C13LE;
import X.C1509305vX;
import X.C1584506Ih;
import X.C1637806bA;
import X.C1748470vbJ;
import X.C1749190vcT;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C459080HzO;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS149S0100000_14;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseEditGroupInfoAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public C1748470vbJ LLJIJIL;
    public final C01GW LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseEditGroupInfoAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/operation/editinfo/EditGroupInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BaseEditGroupInfoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditGroupInfoViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 124), AFwS248S0000000_14.get$arr$(34), null, true);
        this.LLJ = C1509305vX.LIZ(new AwS558S0100000_14(this, 123));
        this.LLJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 125));
        this.LLJILJIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 122));
    }

    public abstract Integer Go();

    public abstract int Ho();

    public abstract String Jo();

    public abstract int Lo();

    public int No() {
        return 0;
    }

    public abstract int So();

    public abstract int Vo();

    public abstract void ap(String str);

    public final EditGroupInfoViewModel Zo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (EditGroupInfoViewModel) assemVMLazy.getValue();
    }

    public static Drawable Oo(Context context) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        return c384050F3z.LIZ(context);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        C426750GoL.LJIIIZ((View) this.LLJI.getValue(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, null, null, false, 30);
        C1749190vcT c1749190vcT = (C1749190vcT) this.LLJ.getValue();
        LinearLayout linearLayout = new LinearLayout(c1749190vcT.getContext());
        linearLayout.setOrientation(1);
        C1748470vbJ c1748470vbJ = new C1748470vbJ(c1749190vcT.getContext(), null, 6);
        c1748470vbJ.LJIIJ(C1383370m6R.LJIIJ(So()));
        C0I7D editText = c1748470vbJ.getEditText();
        editText.setText(Jo());
        editText.setSelection(Jo().length());
        editText.setTextAlignment(5);
        c1748470vbJ.LJII(131073);
        editText.setFilters(C459080HzO.LIZIZ(Lo(), editText));
        if (No() > 0) {
            c1748470vbJ.setMinimumHeight(No());
        }
        c1748470vbJ.LLIZLLLIL = Lo();
        c1748470vbJ.LJFF(false);
        c1748470vbJ.setBackground(Oo(c1748470vbJ.getContext()));
        C1584506Ih.LIZ(c1748470vbJ.findViewById(R.id.uqb));
        c1748470vbJ.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        c1748470vbJ.LIZIZ(new C0DL6() { // from class: X.0ZC3
            @Override // X.C0DL6, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                this.LL.ap(editable.toString());
            }
        });
        this.LLJIJIL = c1748470vbJ;
        c1749190vcT.LJII(C1383370m6R.LJIIJ(Vo()));
        linearLayout.addView(this.LLJIJIL);
        c1749190vcT.setFormField(linearLayout);
        C1748470vbJ c1748470vbJ2 = this.LLJIJIL;
        if (c1748470vbJ2 != null) {
            C786410Ut5.Y8(c1748470vbJ2, new ACListenerS149S0100000_14(this, 92));
        }
    }

    public final void bp(int i, boolean z) {
        TextView textView = (TextView) this.LLJILJIL.getValue();
        if (textView != null) {
            if (z) {
                C1748470vbJ c1748470vbJ = this.LLJIJIL;
                if (c1748470vbJ != null) {
                    Context context = LJJIJL().getContext();
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                    c384050F3z.LJFF = Integer.valueOf(R.attr.a1m);
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                    c1748470vbJ.setBackground(c384050F3z.LIZ(context));
                }
                textView.setText(C1383370m6R.LJIIJ(i));
                C1584506Ih.LIZIZ(textView);
                return;
            }
            C1584506Ih.LIZ(textView);
            C1748470vbJ c1748470vbJ2 = this.LLJIJIL;
            if (c1748470vbJ2 == null) {
                return;
            }
            c1748470vbJ2.setBackground(Oo(LJJIJL().getContext()));
        }
    }
}
