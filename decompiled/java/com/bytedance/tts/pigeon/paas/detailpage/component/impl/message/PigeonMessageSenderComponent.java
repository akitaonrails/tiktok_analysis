package com.bytedance.tts.pigeon.paas.detailpage.component.impl.message;

import X.C01GW;
import X.C099R;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C869590Y9l;
import X.C872060YIy;
import X.C875490YWd;
import X.C875520YWg;
import X.C875530YWh;
import X.C875650YWt;
import X.InterfaceC1364105Vn;
import X.InterfaceC863600XuI;
import X.InterfaceC875580YWm;
import X.InterfaceC875640YWs;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageSenderComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.AbsConversationDetailComponent;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class PigeonMessageSenderComponent extends AbsConversationDetailComponent<IConversationDetailContainer> implements PigeonMessageSenderComponentApi {
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final CopyOnWriteArrayList<C869590Y9l> LLILZIL;
    public final C875490YWd LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YXH
    public final void LJJIIZI() {
        if (!this.LLILZIL.isEmpty()) {
            GECPigeon.Companion.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C872060YIy.LIZ().LIZJ().LIZIZ), null, null, new C875520YWg(this, null), 3);
        }
    }

    public PigeonMessageSenderComponent(GECPigeon gECPigeon, IConversationDetailContainer iConversationDetailContainer) {
        super(gECPigeon, iConversationDetailContainer);
        this.LLILLL = C452501pT.LIZIZ(new AwS558S0100000_14(iConversationDetailContainer, 35));
        this.LLILZ = C452501pT.LIZIZ(new AwS415S0200000_14(gECPigeon, iConversationDetailContainer, 9));
        this.LLILZIL = new CopyOnWriteArrayList<>();
        this.LLILZLL = new C875490YWd(this, gECPigeon);
        this.LLIZ = C452501pT.LIZIZ(new AwS415S0200000_14(gECPigeon, iConversationDetailContainer, 8));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(gECPigeon, 36));
    }

    @Override // com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageSenderComponentApi
    public final void LIZJ(C869590Y9l c869590Y9l, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        ((InterfaceC875580YWm) this.LLILZ.getValue()).LIZJ(c869590Y9l, interfaceC863600XuI);
    }

    @Override // com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageSenderComponentApi
    public final void LIZ(C869590Y9l c869590Y9l, boolean z, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        ((InterfaceC875580YWm) this.LLILZ.getValue()).LIZ(c869590Y9l, z, interfaceC863600XuI);
    }

    @Override // com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageSenderComponentApi
    public final Object LJJJLIIL(C869590Y9l c869590Y9l, InterfaceC875640YWs interfaceC875640YWs, Function2<? super C869590Y9l, ? super InterfaceC1364105Vn<? super C875650YWt>, ? extends Object> function2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJJL = ((PigeonConversationComponentApi) this.LLILLL.getValue()).LJJL(new C875530YWh(this, c869590Y9l, interfaceC875640YWs, function2, null), interfaceC1364105Vn);
        if (objLJJL == C099R.LJFF()) {
            return objLJJL;
        }
        return Unit.LIZ;
    }
}
