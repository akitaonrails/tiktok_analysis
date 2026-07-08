package com.ss.android.ugc.aweme.im.sticker.api.viewmodel;

import X.C01S9;
import X.C05YD;
import X.C06SA;
import X.C189200o6;
import X.C869590Y9l;
import X.EnumC1778780wOC;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC904740ZeS;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.viewmodel.Photo2StickerCreateEventAbility;
import kotlin.Unit;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Photo2StickerViewModel extends AssemViewModel<InterfaceC0148002o> implements Photo2StickerCreateEventAbility {
    public abstract boolean forceRefreshOnStart();

    public abstract C05YD<Boolean> getCanOpenStickerPanelUponCreationEvent();

    public abstract C01S9<Unit> getForceRefresh();

    /* JADX INFO: renamed from: getMediaModelFromPhotoMessage-0E7RQCE */
    public abstract Object mo242getMediaModelFromPhotoMessage0E7RQCE(Context context, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C189200o6<? extends Object>> interfaceC1364105Vn);

    public abstract C05YD<String> getMsgIdTriggerInlineUnderLocalVideo();

    public abstract C05YD<String> getMsgIdTriggerInlineUnderPhoto();

    public abstract C05YD<String> getMsgIdTriggerInlineUnderUGC();

    public abstract void markInlineShown(String str, EnumC1778780wOC enumC1778780wOC, String str2);

    public abstract void updateTargetMessageForDMPhotoInline(String str, C06SA c06sa);

    public abstract void updateTargetMessageForLocalVideoInline(String str, C06SA c06sa);

    public abstract void updateTargetMessageForUGCInline(String str, InterfaceC904740ZeS interfaceC904740ZeS, Long l);
}
