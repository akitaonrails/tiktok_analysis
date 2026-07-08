package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol;

import X.C13LE;
import X.C2217381BqS;
import X.C910890ZoN;
import X.C911000ZoY;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC910980ZoW;
import X.InterfaceC911200Zos;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class DMCameraVideoCardSendAssem extends DMCameraVideoCardAssem<C911000ZoY, DMCameraVideoCardSendAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public volatile C910890ZoN LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DMCameraVideoCardSendAssem.class, "mediaCardSendAbility", "getMediaCardSendAbility()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/viewholder/template/media/protocol/MediaCardSendAbility;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final InterfaceC911200Zos Bp() {
        C910890ZoN c910890ZoN = this.LLJZIJLIL;
        if (c910890ZoN == null) {
            synchronized (this) {
                c910890ZoN = this.LLJZIJLIL;
                if (c910890ZoN == null) {
                    C910890ZoN c910890ZoN2 = new C910890ZoN(yp());
                    this.LLJZIJLIL = c910890ZoN2;
                    return c910890ZoN2;
                }
            }
        }
        return c910890ZoN;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        ((C910890ZoN) Bp()).LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraVideoCardAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        ((C910890ZoN) Bp()).LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraVideoCardAssem, X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C911000ZoY c911000ZoY = (C911000ZoY) interfaceC1587906Jp;
        super.sr(c911000ZoY, list);
        ((C910890ZoN) Bp()).LIZ(c911000ZoY, list);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraVideoCardAssem
    /* JADX INFO: renamed from: zp */
    public final void sr(InterfaceC910980ZoW interfaceC910980ZoW, List list) {
        C911000ZoY c911000ZoY = (C911000ZoY) interfaceC910980ZoW;
        super.sr(c911000ZoY, list);
        ((C910890ZoN) Bp()).LIZ(c911000ZoY, list);
    }
}
