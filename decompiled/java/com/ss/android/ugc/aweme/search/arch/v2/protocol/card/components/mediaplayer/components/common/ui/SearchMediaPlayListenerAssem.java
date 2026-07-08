package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui;

import X.C0HHT;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C658770Psh;
import X.C724750Sbp;
import X.C737910Sx3;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC583720Muw;
import X.InterfaceC657240PqE;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.viewmodel.SearchMediaPlayStateVM;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaPlayListenerAssem extends ReusedUIContentAssem<SearchMediaPlayListenerAssem> implements InterfaceC712990Rxx<InterfaceC657240PqE> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final C658770Psh LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchMediaPlayListenerAssem.class, "playStateVM", "getPlayStateVM()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/mediaplayer/viewmodel/SearchMediaPlayStateVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Psh] */
    public SearchMediaPlayListenerAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchMediaPlayStateVM.class);
        this.LLJJJJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 245), null, AFwS241S0000000_10.get$arr$(150));
        this.LLJJJJJIL = new InterfaceC583720Muw() { // from class: X.0Psh
            @Override // X.InterfaceC583720Muw
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC583720Muw
            public final void LIZ() {
                this.LIZ.cp().vQ2();
            }

            @Override // X.InterfaceC583720Muw
            public final void LIZJ() {
                this.LIZ.cp().vQ2();
            }

            @Override // X.InterfaceC583720Muw
            public final void LJII() {
                this.LIZ.cp().LJLIIIL();
            }

            @Override // X.InterfaceC583720Muw
            public final void LJJZ() {
                this.LIZ.cp().LJLIIIL();
            }

            @Override // X.InterfaceC583720Muw
            public final void onLoading() {
                SearchMediaPlayStateVM searchMediaPlayStateVMCp = this.LIZ.cp();
                searchMediaPlayStateVMCp.getClass();
                searchMediaPlayStateVMCp.setState(AFwS241S0000000_10.get$arr$(445));
            }

            @Override // X.InterfaceC583720Muw
            public final void onPause() {
                this.LIZ.cp().vQ2();
            }

            @Override // X.InterfaceC583720Muw
            public final void onBuffering(boolean z) {
                if (z) {
                    SearchMediaPlayStateVM searchMediaPlayStateVMCp = this.LIZ.cp();
                    searchMediaPlayStateVMCp.getClass();
                    searchMediaPlayStateVMCp.setState(AFwS241S0000000_10.get$arr$(445));
                    return;
                }
                this.LIZ.cp().LJLIIIL();
            }
        };
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final SearchMediaPlayStateVM cp() {
        return (SearchMediaPlayStateVM) this.LLJJJJ.getValue(this, LLJJJJLIIL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchComponentCenter$Player$PlayerControlAbility.class, null);
        if (searchComponentCenter$Player$PlayerControlAbility != null) {
            searchComponentCenter$Player$PlayerControlAbility.yA2(this.LLJJJJJIL);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchComponentCenter$Player$PlayerControlAbility.class, null);
        if (searchComponentCenter$Player$PlayerControlAbility != null) {
            searchComponentCenter$Player$PlayerControlAbility.Im2(this.LLJJJJJIL);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        SearchMediaPlayStateVM searchMediaPlayStateVMCp = cp();
        searchMediaPlayStateVMCp.getClass();
        searchMediaPlayStateVMCp.setState(AFwS241S0000000_10.get$arr$(444));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC657240PqE interfaceC657240PqE) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC657240PqE interfaceC657240PqE) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
