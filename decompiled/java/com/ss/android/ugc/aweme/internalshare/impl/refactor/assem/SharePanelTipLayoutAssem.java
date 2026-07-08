package com.ss.android.ugc.aweme.internalshare.impl.refactor.assem;

import X.C019F;
import X.C1214080hhO;
import X.C1214160hhW;
import X.C1362270lYP;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelTipLayoutAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1362270lYP.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public C1214080hhO LLJI;
    public C1214160hhW LLJIJIL;
    public View LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SharePanelTipLayoutAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/internalshare/impl/refactor/vm/ShareContactListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SharePanelTipLayoutAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareContactListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 649), AFwS229S0000000_2.get$arr$(390), null, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go() {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelTipLayoutAssem.Go():void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJI = (C1214080hhO) view.findViewById(R.id.v0w);
        this.LLJIJIL = (C1214160hhW) view.findViewById(R.id.v0v);
        this.LLJILJIL = view.findViewById(R.id.xys);
        Go();
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0lYK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1362190lYH) obj).LLJ);
            }
        }, null, new AwS635S0100000_21(this, 117), 6);
    }
}
