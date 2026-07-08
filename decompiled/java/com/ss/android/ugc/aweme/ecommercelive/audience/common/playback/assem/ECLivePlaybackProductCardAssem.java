package com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.assem;

import X.AnonymousClass1857;
import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C1766200w3u;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.ECLivePlaybackViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: loaded from: classes25.dex */
public final class ECLivePlaybackProductCardAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public AnonymousClass1857 LLJ;
    public C1766200w3u LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECLivePlaybackProductCardAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommercelive/audience/common/playback/ECLivePlaybackViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ECLivePlaybackProductCardAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ECLivePlaybackViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 186), AFwS264S0000000_24.get$arr$(110), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AnonymousClass1857 anonymousClass1857 = (AnonymousClass1857) view.findViewById(R.id.tne);
        this.LLJ = anonymousClass1857;
        if (anonymousClass1857 != null) {
            AssemVMLazy assemVMLazy = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
            this.LLJI = new C1766200w3u(anonymousClass1857, ((ECLivePlaybackViewModel) assemVMLazy.getValue()).LLILLJJLI);
        }
        AnonymousClass1857 anonymousClass18572 = this.LLJ;
        if (anonymousClass18572 != null) {
            anonymousClass18572.setClickListener(this.LLJI);
        }
        AssemVMLazy assemVMLazy2 = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJIJIL;
        ((ECLivePlaybackViewModel) assemVMLazy2.getValue()).xQ2(new C2217381BqS() { // from class: X.0qxK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1569940qxM) obj).LLIZLLLIL;
            }
        }, this, new AwS611S0100000_32(this, 325));
    }
}
