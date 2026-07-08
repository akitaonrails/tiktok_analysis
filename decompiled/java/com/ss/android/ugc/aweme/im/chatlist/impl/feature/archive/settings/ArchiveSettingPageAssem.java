package com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings;

import X.C019F;
import X.C01GW;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1383370m6R;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C878970Ydz;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ArchiveSettingPageAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ArchiveSettingPageAssem.class, "archiveSettingPageVM", "getArchiveSettingPageVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/archive/settings/ArchiveSettingPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ArchiveSettingPageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ArchiveSettingPageViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 256), AFwS248S0000000_14.get$arr$(78), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 254));
        this.LLJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 255));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        ArchiveSettingPageViewModel archiveSettingPageViewModel = (ArchiveSettingPageViewModel) assemVMLazy.getValue();
        archiveSettingPageViewModel.vQ2();
        C878970Ydz.LIZIZ(ArchiveSettingPageViewModel.LL, false, false, true, new AwS593S0100000_14(archiveSettingPageViewModel, 385), 3);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJ.getValue();
        if (tuxNavBar != null) {
            tuxNavBar.setNavBackground(0);
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZJ(new AwS558S0100000_14(this, 1802));
            C0OM1 c0om1 = new C0OM1();
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            Context context = getContext();
            if (context == null) {
                context = C1383370m6R.LIZ;
            }
            c1250250idj.LIZJ = context.getString(2131830292);
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavActions(c0om1);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJI.getValue();
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(ArchiveSettingPageCell.class);
        }
        C736680Sv4.LJIIIIZZ(this, this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0YuD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C889010YuB) obj).LL;
            }
        }, null, new AwS628S0100000_14(this, 120), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0YuC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C889010YuB) obj).LLILLJJLI;
            }
        }, null, new AwS628S0100000_14(this, 121), 6);
    }
}
