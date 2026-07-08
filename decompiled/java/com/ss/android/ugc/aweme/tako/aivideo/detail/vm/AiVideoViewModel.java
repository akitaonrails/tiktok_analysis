package com.ss.android.ugc.aweme.tako.aivideo.detail.vm;

import X.AnonymousClass0951;
import X.C05VZ;
import X.C09IC;
import X.C1687320u0g;
import X.C1697810uHb;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C465501rZ;
import X.EnumC1687410u0p;
import X.InterfaceC0148002o;
import X.InterfaceC1664360tPe;
import X.InterfaceC1672680td4;
import X.InterfaceC1682240tsU;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Collection;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class AiVideoViewModel extends AssemViewModel<C1687320u0g> implements C05VZ {
    public static final /* synthetic */ int LLILZIL = 0;
    public final InterfaceC1682240tsU LL;
    public final C2252321DDq LLILLJJLI;
    public final AnonymousClass0951 LLILLL;
    public final C2252321DDq LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1687320u0g(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        AccountUserService accountUserServiceLJIIJ;
        super.onPrepared();
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            setState(new AwS604S0100000_25(accountUserServiceLJIIJ.getCurUser(), 324));
        }
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C465501rZ(this, null), 3);
    }

    public final int vQ2() {
        InterfaceC1664360tPe<InterfaceC1672680td4> interfaceC1664360tPe = getState().LL;
        int i = 0;
        if (!(interfaceC1664360tPe instanceof Collection) || !interfaceC1664360tPe.isEmpty()) {
            i = 0;
            for (InterfaceC1672680td4 interfaceC1672680td4 : interfaceC1664360tPe) {
                if (interfaceC1672680td4.getMessageType() == EnumC1687410u0p.USER_QUERY || interfaceC1672680td4.getMessageType() == EnumC1687410u0p.AI_ANSWER || interfaceC1672680td4.getMessageType() == EnumC1687410u0p.TNS_BLOCKED) {
                    i++;
                    if (i < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
        }
        return i;
    }

    @Override // X.C05VZ
    public final /* bridge */ /* synthetic */ C2252321DDq getBottomHeight() {
        return this.LLILZ;
    }

    public AiVideoViewModel(InterfaceC1682240tsU interfaceC1682240tsU) {
        this.LL = interfaceC1682240tsU;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Float.valueOf(0.0f));
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLILZ = C1BNE.LIZ(0);
    }

    @Override // X.C05VZ
    public final void O40(int i) {
        this.LLILZ.setValue(Integer.valueOf(i));
    }
}
