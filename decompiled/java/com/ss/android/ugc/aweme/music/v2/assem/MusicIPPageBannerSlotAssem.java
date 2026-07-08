package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C424560Gko;
import X.C630080OnW;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS44S0500000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicIPPageBannerSlotAssem extends DynamicAssem {
    public static final C630080OnW LLJJIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0OnW] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicIPPageBannerSlotAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIII = new Object() { // from class: X.0OnW
        };
    }

    public MusicIPPageBannerSlotAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1262), AFwS240S0000000_9.get$arr$(532), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dq_;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        View viewFindViewById = view.findViewById(R.id.l08);
        C424560Gko c424560Gko = (C424560Gko) view.findViewById(R.id.l07);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.l05);
        View viewFindViewById2 = view.findViewById(R.id.k2o);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OnV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, this, null, null, null, new AwS44S0500000_9(this, viewFindViewById, c424560Gko, tuxTextView, viewFindViewById2, 1), 28, null);
    }
}
