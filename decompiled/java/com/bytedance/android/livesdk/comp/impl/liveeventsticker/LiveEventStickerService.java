package com.bytedance.android.livesdk.comp.impl.liveeventsticker;

import X.C13LE;
import X.C19719912Dl;
import com.bytedance.android.livesdk.comp.api.decoration.ILiveEventStickerService;
import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerPreviewWrapperWidget;
import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerWrapperWidget;
import com.bytedance.android.livesdk.livesetting.liveevent.LiveEventStickerAnchorTypeSetting;
import com.bytedance.android.livesdk.livesetting.liveevent.LiveEventStickerAudienceTypeSetting;

/* JADX INFO: loaded from: classes30.dex */
public class LiveEventStickerService implements ILiveEventStickerService {
    @Override // com.bytedance.android.livesdk.comp.api.decoration.ILiveEventStickerService
    public final C19719912Dl Jc1() {
        return C13LE.LIZ(LiveEventStickerPreviewWrapperWidget.class);
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.ILiveEventStickerService
    public final LiveEventStickerWrapperWidget kS(boolean z) {
        boolean zEnable;
        if (z) {
            zEnable = LiveEventStickerAnchorTypeSetting.INSTANCE.enable();
        } else {
            zEnable = LiveEventStickerAudienceTypeSetting.INSTANCE.enable();
        }
        if (!zEnable) {
            return null;
        }
        return new LiveEventStickerWrapperWidget();
    }
}
