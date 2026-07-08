package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol;

import X.C13LE;
import X.C2217381BqS;
import X.C910890ZoN;
import X.C911020Zoa;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC911100Zoi;
import X.InterfaceC911200Zos;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class PhotoSwapSendAssem extends PhotoSwapAssem<C911020Zoa, PhotoSwapSendAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public volatile C910890ZoN LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoSwapSendAssem.class, "mediaCardSendAbility", "getMediaCardSendAbility()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/viewholder/template/media/protocol/MediaCardSendAbility;", 0);
        C13LE.LIZ.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final InterfaceC911200Zos Fp() {
        C910890ZoN c910890ZoN = this.LLLIIII;
        if (c910890ZoN == null) {
            synchronized (this) {
                c910890ZoN = this.LLLIIII;
                if (c910890ZoN == null) {
                    C910890ZoN c910890ZoN2 = new C910890ZoN(Ap());
                    this.LLLIIII = c910890ZoN2;
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
        C911020Zoa c911020Zoa = (C911020Zoa) interfaceC911100Zoi;
        super.sr(c911020Zoa, list);
        ((C910890ZoN) Fp()).LIZ(c911020Zoa, list);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraPhotoCardAssem, X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C911020Zoa c911020Zoa = (C911020Zoa) interfaceC1587906Jp;
        super.sr(c911020Zoa, list);
        ((C910890ZoN) Fp()).LIZ(c911020Zoa, list);
    }
}
