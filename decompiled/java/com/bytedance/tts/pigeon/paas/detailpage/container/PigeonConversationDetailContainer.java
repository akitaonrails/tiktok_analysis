package com.bytedance.tts.pigeon.paas.detailpage.container;

import X.C054G;
import X.C09A1;
import X.C09R7;
import X.C0YXB;
import X.C13EQ;
import X.C13LP;
import X.C19719912Dl;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C872060YIy;
import X.InterfaceC497601wk;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.container.BasePigeonContainer;
import com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.AbsConversationDetailComponent;
import com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class PigeonConversationDetailContainer extends BasePigeonContainer<AbsConversationDetailComponent<? extends IConversationDetailContainer>> implements IConversationDetailContainer {
    public final GECPigeon LLILLJJLI;
    public String LLILLL = "";
    public final C054G LLILZ;

    @Override // com.bytedance.tts.pigeon.container.BasePigeonContainer, X.C0YXH
    public final void LJJIIZI() {
        super.LJJIIZI();
        C2296808zG.LIZJ(this.LLILZ, null);
    }

    @Override // X.C0YXB
    public final GECPigeon LJJJJLL() {
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer
    public final String getConversationId() {
        return this.LLILLL;
    }

    @Override // com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer
    public final InterfaceC497601wk getScope() {
        return this.LLILZ;
    }

    public PigeonConversationDetailContainer(GECPigeon gECPigeon) {
        this.LLILLJJLI = gECPigeon;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        GECPigeon.Companion.getClass();
        this.LLILZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C872060YIy.LIZ().LIZJ().LIZLLL));
    }

    @Override // com.bytedance.tts.pigeon.container.BasePigeonContainer
    public final C0YXB LIZIZ(C19719912Dl c19719912Dl) {
        return (AbsPigeonEventProtocol) C09R7.LIZ(c19719912Dl).getConstructor(GECPigeon.class, IConversationDetailContainer.class).newInstance(this.LLILLJJLI, this);
    }

    @Override // com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer
    public final Object LJJJJL(C19719912Dl c19719912Dl) {
        return C13LP.LJJJJZI(C13EQ.LJJIJL(this.LL, C09R7.LIZ(c19719912Dl)));
    }

    @Override // com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer
    public final List LJJJJZ(C19719912Dl c19719912Dl) {
        return C13EQ.LJJIJL(this.LL, C09R7.LIZ(c19719912Dl));
    }
}
