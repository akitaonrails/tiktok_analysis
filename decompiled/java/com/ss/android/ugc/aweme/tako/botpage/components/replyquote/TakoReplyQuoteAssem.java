package com.ss.android.ugc.aweme.tako.botpage.components.replyquote;

import X.C019F;
import X.C0PEM;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1857280yQo;
import X.C1857300yQq;
import X.C19719912Dl;
import X.C1DFH;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C23250099c;
import X.C724750Sbp;
import X.InterfaceC1587906Jp;
import X.InterfaceC1857320yQs;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoReplyQuoteAssem extends ReusedUISlotAssem<TakoReplyQuoteAssem> implements InterfaceC712990Rxx<InterfaceC1857320yQs> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoReplyQuoteAssem.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoReplyQuoteAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1861), AFwS269S0000000_27.get$arr$(224), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fkf;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.t7i);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC1857320yQs interfaceC1857320yQs) {
        Message messageYy1;
        InterfaceC1857320yQs interfaceC1857320yQs2 = interfaceC1857320yQs;
        TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TakoCardAbility.class, null);
        if (takoCardAbility != null) {
            messageYy1 = takoCardAbility.Yy1();
        } else {
            messageYy1 = null;
        }
        C1857280yQo.LIZJ(getContentView(), C1857280yQo.LIZIZ(messageYy1));
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1857300yQq(messageYy1, this, interfaceC1857320yQs2, null), 2);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1857320yQs interfaceC1857320yQs) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1857320yQs interfaceC1857320yQs) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
