package com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive;

import X.AbstractC1250290idn;
import X.C019F;
import X.C01GW;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1383370m6R;
import X.C13LE;
import X.C1637806bA;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C878950Ydx;
import X.C880880Yh4;
import X.EnumC638250P1r;
import X.EnumC880850Yh1;
import X.InterfaceC2217461Bqa;
import X.InterfaceC879010Ye3;
import X.InterfaceC884020Ym8;
import X.InterfaceC884640Yn8;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.AwS663S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class InboxArchivePageTitleBarAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public TuxPanel LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InboxArchivePageTitleBarAssem.class, "archivePageVM", "getArchivePageVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/archive/ArchivePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InboxArchivePageTitleBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ArchivePageViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 251), AFwS248S0000000_14.get$arr$(73), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 250));
    }

    public final ArchivePageViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (ArchivePageViewModel) assemVMLazy.getValue();
    }

    public final Context Jo() {
        Context context = getContext();
        return context == null ? C1383370m6R.LIZ : context;
    }

    public final AbstractC1250290idn Ho(EnumC880850Yh1 enumC880850Yh1) {
        InterfaceC879010Ye3 key;
        InterfaceC884640Yn8 config;
        InterfaceC884020Ym8 interfaceC884020Ym8 = Go().LL;
        C878950Ydx c878950Ydx = null;
        if (interfaceC884020Ym8 != null && (config = interfaceC884020Ym8.getConfig()) != null) {
            key = config.getKey();
        } else {
            key = null;
        }
        if (key instanceof C878950Ydx) {
            c878950Ydx = (C878950Ydx) key;
        }
        int i = C880880Yh4.LIZ[enumC880850Yh1.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C1250300ido c1250300ido = new C1250300ido();
                c1250300ido.LIZJ = Jo().getString(2131830251);
                c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
                c1250300ido.LIZ(new AwS415S0200000_14(c878950Ydx, this, 23));
                return c1250300ido;
            }
            throw new C1954807lC();
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_ellipsis_horizontal;
        c1251150ifB.LIZJ(new AwS415S0200000_14(c878950Ydx, this, 22));
        c1251150ifB.LIZIZ = "title_bar_menu_entrance_tag";
        return c1251150ifB;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIZ(this, Go(), new C2217381BqS() { // from class: X.0Yrz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C887580Yrs) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0Yrx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C887580Yrs) obj).LL;
            }
        }, null, new AwS663S0100000_14(this, 8), 12);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0Yry
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C887580Yrs) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 101), 4);
    }
}
