package com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight;

import X.C019F;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C631630Oq1;
import X.C723580SZw;
import X.C724750Sbp;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.AObjectS62S0000000_9;
import android.content.Context;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicTitleAssem extends ReusedUISlotAssem<MusicTitleAssem> implements InterfaceC712990Rxx<C631630Oq1> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJL;
    public TuxTextView LLJLIL;
    public C127G LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicTitleAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OriginMusicListViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1108), AFwS240S0000000_9.get$arr$(450), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.egk;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLILLLLZIIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLILLLLZIIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{OriginMusicListViewModel.class, new AObjectS62S0000000_9(this, 23)}, defaultViewModelProviderFactory);
                    this.LLJLILLLLZIIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11) {
        /*
            r10 = this;
            r0 = 2131382386(0x7f0a5072, float:1.8385116E38)
            android.view.View r0 = r11.findViewById(r0)
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r4 = r10
            r4.LLJLIL = r0
            r0 = 2131382385(0x7f0a5071, float:1.8385114E38)
            android.view.View r2 = r11.findViewById(r0)
            com.bytedance.tux.icon.TuxIconView r2 = (com.bytedance.tux.icon.TuxIconView) r2
            if (r2 == 0) goto L6a
            X.0GdJ r3 = new X.0GdJ
            r3.<init>()
            r0 = 2130773651(0x7f010693, float:1.7150455E38)
            r3.LIZ = r0
            r0 = 2131100622(0x7f0603ce, float:1.781363E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.LJ = r0
            r1 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r3.LIZIZ = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r3.LIZJ = r0
            r2.setTuxIcon(r3)
            X.0qg8 r0 = r4.LLJJLIIIJLLLLLLLZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.music.OriginMusicArg r0 = (com.ss.android.ugc.aweme.music.OriginMusicArg) r0
            if (r0 == 0) goto L8b
            boolean r1 = r0.isMe()
            r0 = 1
            if (r1 != r0) goto L8b
            X.0Oqx r0 = X.C632210Oqx.LIZ
            r0.getClass()
            boolean r0 = X.C632210Oqx.LJFF()
            if (r0 != 0) goto L8b
            X.C631230OpN.LIZJ(r2)
        L6a:
            kotlin.jvm.internal.AwS588S0100000_9 r1 = new kotlin.jvm.internal.AwS588S0100000_9
            r0 = 268(0x10c, float:3.76E-43)
            r1.<init>(r4, r0)
            r0 = 0
            X.C723830SaL.LIZ(r4, r0, r1)
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r4.LLJL
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight.MusicTitleAssem.LLJLL
            com.bytedance.assem.arch.viewModel.AssemViewModel r5 = r1.getValue()
            X.0Oun r6 = new X.C2217381BqS() { // from class: X.0Oun
                static {
                    /*
                        X.0Oun r0 = new X.0Oun
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0Oun) X.0Oun.LL X.0Oun
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C634590Oun.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0OrU> r3 = X.C632540OrU.class
                        java.lang.String r2 = "getListItemState()Ljava/util/List;"
                        r1 = 0
                        java.lang.String r0 = "listItemState"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C634590Oun.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0OrU r2 = (X.C632540OrU) r2
                        r2.getClass()
                        java.util.List r0 = X.C627260Oiy.LIZ(r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C634590Oun.get(java.lang.Object):java.lang.Object");
                }
            }
            r7 = 0
            r0 = 23
            kotlin.jvm.internal.AFwS292S0000000_9 r8 = kotlin.jvm.internal.AFwS292S0000000_9.get$arr$(r0)
            r9 = 6
            X.C736680Sv4.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            return
        L8b:
            X.C631230OpN.LIZ(r2)
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight.MusicTitleAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C631630Oq1 c631630Oq1) {
        String string;
        C631630Oq1 c631630Oq12 = c631630Oq1;
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(c631630Oq12.LL);
            } else {
                string = null;
            }
            tuxTextView.setText(string);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C631630Oq1 c631630Oq1) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C631630Oq1 c631630Oq1) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
