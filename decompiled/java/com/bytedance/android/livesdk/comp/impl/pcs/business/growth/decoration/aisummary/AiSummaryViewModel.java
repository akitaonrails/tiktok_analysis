package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary;

import X.AbstractC1812500xGa;
import X.AbstractC1812820xH6;
import X.C01KE;
import X.C13BV;
import X.C13LE;
import X.C1812600xGk;
import X.C1812670xGr;
import X.C1812700xGu;
import X.C1812840xH8;
import X.C2217381BqS;
import X.EnumC1812620xGm;
import X.EnumC768840UDy;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC774460UZo;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.mvi.core.MviViewModel;
import kotlin.Unit;

/* JADX INFO: loaded from: classes28.dex */
public final class AiSummaryViewModel extends MviViewModel<C1812670xGr, AbstractC1812500xGa, AbstractC1812820xH6> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public EnumC768840UDy LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public volatile C1812840xH8 LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AiSummaryViewModel.class, "repository", "getRepository()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/aisummary/AiSummaryRepository;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AiSummaryViewModel() {
        C13BV c13bv = C13BV.INSTANCE;
        EnumC1812620xGm enumC1812620xGm = EnumC1812620xGm.LOADING;
        super(new C1812670xGr(new C1812600xGk(c13bv, enumC1812620xGm), enumC1812620xGm));
    }

    public final C1812840xH8 zQ2() {
        C1812840xH8 c1812840xH8 = this.LLJ;
        if (c1812840xH8 == null) {
            synchronized (this) {
                c1812840xH8 = this.LLJ;
                if (c1812840xH8 == null) {
                    C1812840xH8 c1812840xH82 = new C1812840xH8();
                    this.LLJ = c1812840xH82;
                    return c1812840xH82;
                }
            }
        }
        return c1812840xH8;
    }

    @Override // com.bytedance.android.livesdk.mvi.core.MviViewModel
    public final Object yQ2(InterfaceC774460UZo interfaceC774460UZo, InterfaceC1364105Vn interfaceC1364105Vn) {
        C01KE.LIZ(ViewModelKt.getViewModelScope(this), new C1812700xGu((AbstractC1812500xGa) interfaceC774460UZo, this, null));
        return Unit.LIZ;
    }
}
