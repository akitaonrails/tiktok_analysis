package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view.photoswap;

import X.C13LE;
import X.C1EEQ;
import X.C901020ZWi;
import X.InterfaceC2187708hf;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view.photo.PrivateImageViewSendAssem;

/* JADX INFO: loaded from: classes15.dex */
public final class PhotoSwapSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C901020ZWi> {
    public final C1EEQ LLJJJIL = C1EEQ.LIZ;

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PhotoSwapSendPowerCell$createAssemAttached2Cell$1(this, C13LE.LIZ(PrivateImageViewSendAssem.class));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell
    public final InterfaceC2187708hf T5() {
        return this.LLJJJIL;
    }
}
