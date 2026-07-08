package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C427870Gq9;
import X.C452501pT;
import X.C630800Oog;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.model.MusicResourceBitStruct;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinMusicDetailAssem extends DynamicAssem {
    public static final C630800Oog LLJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final C01GW<Keva> LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public View LLJJIII;
    public C427870Gq9 LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public MusicResourceBitStruct LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinMusicDetailAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJIL = new C630800Oog();
        LLJJJJJIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(252));
    }

    public BulletinMusicDetailAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1220), AFwS240S0000000_9.get$arr$(518), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dpv;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        this.LLJJIII = view.findViewById(R.id.td3);
        this.LLJJIJI = (C427870Gq9) view.findViewById(R.id.bi4);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.z1i);
        this.LLJJIJIL = (TuxTextView) view.findViewById(R.id.z04);
        View view2 = this.LLJJIII;
        if (view2 != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 29, 42), view2);
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Ooh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 313), 28, null);
    }
}
