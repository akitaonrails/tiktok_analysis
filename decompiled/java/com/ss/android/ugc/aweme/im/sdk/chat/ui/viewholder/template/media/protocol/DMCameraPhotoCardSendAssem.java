package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol;

import X.C13LE;
import X.C2217381BqS;
import X.C910890ZoN;
import X.C911070Zof;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC911100Zoi;
import X.InterfaceC911200Zos;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class DMCameraPhotoCardSendAssem extends DMCameraPhotoCardAssem<C911070Zof, DMCameraPhotoCardSendAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public volatile C910890ZoN LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DMCameraPhotoCardSendAssem.class, "mediaCardSendAbility", "getMediaCardSendAbility()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/viewholder/template/media/protocol/MediaCardSendAbility;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final InterfaceC911200Zos Fp() {
        C910890ZoN c910890ZoN = this.LLJZIJLIL;
        if (c910890ZoN == null) {
            synchronized (this) {
                c910890ZoN = this.LLJZIJLIL;
                if (c910890ZoN == null) {
                    C910890ZoN c910890ZoN2 = new C910890ZoN(Ap());
                    this.LLJZIJLIL = c910890ZoN2;
                    return c910890ZoN2;
                }
            }
        }
        return c910890ZoN;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        ((C910890ZoN) Fp()).LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraPhotoCardAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        ((C910890ZoN) Fp()).LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraPhotoCardAssem
    /* JADX INFO: renamed from: Bp */
    public final void sr(InterfaceC911100Zoi interfaceC911100Zoi, List list) {
        C911070Zof c911070Zof = (C911070Zof) interfaceC911100Zoi;
        super.sr(c911070Zof, list);
        ((C910890ZoN) Fp()).LIZ(c911070Zof, list);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraPhotoCardAssem, X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C911070Zof c911070Zof = (C911070Zof) interfaceC1587906Jp;
        super.sr(c911070Zof, list);
        ((C910890ZoN) Fp()).LIZ(c911070Zof, list);
    }
}
