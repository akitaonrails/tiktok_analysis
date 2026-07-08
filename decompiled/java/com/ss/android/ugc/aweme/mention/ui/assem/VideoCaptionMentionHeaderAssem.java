package com.ss.android.ugc.aweme.mention.ui.assem;

import X.C019F;
import X.C01GW;
import X.C0I7D;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C1637806bA;
import X.C1749260vca;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C462900IDg;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1726100v1E;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionStateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class VideoCaptionMentionHeaderAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoCaptionMentionHeaderAssem.class, "videoCaptionMentionStateVM", "getVideoCaptionMentionStateVM()Lcom/ss/android/ugc/aweme/mention/viewmodel/VideoCaptionMentionStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public VideoCaptionMentionHeaderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCaptionMentionStateViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 465), AFwS236S0000000_6.get$arr$(220), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 462));
        this.LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 464));
    }

    public final C1749260vca Go() {
        return (C1749260vca) this.LLJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        Resources resources;
        String string2;
        super.onViewCreated(view);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJ.getValue();
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        Context context = getContext();
        String str = "";
        if (context == null || (string = context.getString(2131826717)) == null) {
            string = "";
        }
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS550S0100000_6(this, 463));
        c0om1.LJ(c1251150ifB);
        c0om1.LIZLLL = false;
        tuxNavBar.setNavActions(c0om1);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Hjf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C449310Hjd) obj).LLILZ);
            }
        }, null, new AwS620S0100000_6(this, 40), 6);
        Go().setSearchBarHeight(EnumC1726100v1E.HIGH);
        C0I7D editTextView = Go().getEditTextView();
        Context context2 = getContext();
        if (context2 != null && (resources = context2.getResources()) != null && (string2 = resources.getString(2131826716)) != null) {
            str = string2;
        }
        editTextView.setHint(str);
        Go().getEditTextView().addTextChangedListener(new C462900IDg(this, 5));
    }
}
