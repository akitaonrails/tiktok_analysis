package com.ss.android.ugc.gamora.recorder.sticker.popup;

import X.C13LE;
import X.C688120Qyw;
import X.InterfaceC20660715sz;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes13.dex */
public final class RecordStickerPanelPopupScreenScene implements InterfaceC20660715sz {
    public static volatile RecordStickerPanelPopupScreenScene LLILLL;
    public final Context LL;
    public final LifecycleOwner LLILLJJLI;

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return "record_sticker_panel_popup_screen_scene";
    }

    @Override // X.InterfaceC20660715sz
    public final boolean t2() {
        return false;
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return this.LLILLJJLI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        return new C688120Qyw(this.LL, this.LLILLJJLI, null);
    }

    public static final class Companion {
        public static RecordStickerPanelPopupScreenScene LIZ(Context context, LifecycleOwner lifecycleOwner) {
            RecordStickerPanelPopupScreenScene recordStickerPanelPopupScreenScene = RecordStickerPanelPopupScreenScene.LLILLL;
            if (recordStickerPanelPopupScreenScene == null) {
                synchronized (C13LE.LIZ(RecordStickerPanelPopupScreenScene.class)) {
                    try {
                        recordStickerPanelPopupScreenScene = RecordStickerPanelPopupScreenScene.LLILLL;
                        if (recordStickerPanelPopupScreenScene == null) {
                            recordStickerPanelPopupScreenScene = new RecordStickerPanelPopupScreenScene(context, lifecycleOwner);
                            RecordStickerPanelPopupScreenScene.LLILLL = recordStickerPanelPopupScreenScene;
                            lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.gamora.recorder.sticker.popup.RecordStickerPanelPopupScreenScene$Companion$getInstance$1$1$1
                                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                                public final void onDestroy() {
                                    RecordStickerPanelPopupScreenScene.LLILLL = null;
                                }

                                @Override // androidx.lifecycle.LifecycleEventObserver
                                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                    if (event == Lifecycle.Event.ON_DESTROY) {
                                        onDestroy();
                                    }
                                }
                            });
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return recordStickerPanelPopupScreenScene;
        }
    }

    public RecordStickerPanelPopupScreenScene(Context context, LifecycleOwner lifecycleOwner) {
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
    }
}
