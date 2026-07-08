package com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.user;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C1768006wA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS106S0200000_2;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS438S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class UserAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UserAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/im/ai/impl/smartreply/feedback/user/UserPanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public UserAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(UserPanelViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 265), AFwS229S0000000_2.get$arr$(219), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new AwS546S0100000_2(this, 264));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 263));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 266));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 267));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.coj;
    }

    public final UserPanelViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (UserPanelViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.060F
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C060B) obj).LLILLJJLI;
            }
        }, null, new AwS438S0200000_2(this, view, 7), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.060G
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C060B) obj).LL;
            }
        }, null, new AwS616S0100000_2(this, 29), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.060D
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C060B) obj).LLILLL;
            }
        }, null, new AwS616S0100000_2(this, 30), 6);
        TextView textView = (TextView) this.LLJJIJI.getValue();
        if (textView != null) {
            textView.setFilters(new InputFilter[]{new InputFilter() { // from class: X.06JX
                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                    int length;
                    if (spanned != null) {
                        length = spanned.length();
                    } else {
                        length = 0;
                    }
                    int i5 = 200 - (length - (i4 - i3));
                    if (i5 < i2 - i) {
                        String string = this.LL.LJJIJL().getContext().getString(2131846313);
                        C1389890mGx c1389890mGx = new C1389890mGx(this.LL.LJJIJL());
                        c1389890mGx.LJIIJ(string);
                        c1389890mGx.LJIIJJI();
                        if (i5 <= 0) {
                            return "";
                        }
                        if (charSequence != null) {
                            return charSequence.subSequence(i, i5 + i);
                        }
                        return null;
                    }
                    return null;
                }
            }});
        }
        TextView textView2 = (TextView) this.LLJJIJI.getValue();
        if (textView2 != null) {
            textView2.addTextChangedListener(new C1768006wA(this, 0));
        }
        C197039127h c197039127h = (C197039127h) this.LLJJIJIIJIL.getValue();
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS106S0200000_2(view, this, 0));
        }
    }
}
