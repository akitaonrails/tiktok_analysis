package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.AbstractC1622390sJx;
import X.C0FWM;
import X.C1446130njf;
import X.C1623370sLX;
import X.C1624570sNT;
import X.C1627370sRz;
import X.C1656440tCs;
import X.C19GS;
import X.InterfaceC1463990oCT;
import X.InterfaceC1623110sL7;
import X.InterfaceC1623520sLm;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.SavePhotoStickerHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes26.dex */
public final class SavePhotoStickerHandler extends AbstractC1622390sJx implements InterfaceC1623110sL7, GenericLifecycleObserver {
    public final C19GS LLILLJJLI;
    public final InterfaceC1623520sLm LLILLL;
    public final InterfaceC1463990oCT LLILZ;
    public final LifecycleOwner LLILZIL;
    public final SafeHandler LLILZLL;
    public Effect LLIZ;

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLIZ = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return C1624570sNT.LJJI(c1627370sRz.LIZ);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        Effect effect = c1627370sRz.LIZ;
        this.LLIZ = effect;
        if (effect != null) {
            try {
                C1446130njf.LIZ.getClass();
                String strLJFF = C1446130njf.LJFF(effect, "hint_for_saving_captured_image");
                this.LLILLL.LIZ(strLJFF);
                if (!TextUtils.isEmpty(strLJFF)) {
                    this.LLILLL.LIZIZ(this.LLIZ, this.LLILLJJLI, this.LLILZIL);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILZ.LIZIZ(e);
            }
        }
    }

    public SavePhotoStickerHandler(C19GS c19gs, C1656440tCs c1656440tCs, LifecycleOwner lifecycleOwner) {
        C0FWM c0fwm = C0FWM.LIZ;
        this.LLILLJJLI = c19gs;
        this.LLILLL = c1656440tCs;
        this.LLILZ = c0fwm;
        this.LLILZIL = lifecycleOwner;
        this.LLILZLL = new SafeHandler(lifecycleOwner);
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(final int i, final int i2, int i3, final String str) {
        if (C1624570sNT.LJJI(this.LLIZ) && i3 == 0) {
            this.LLILZLL.post(new Runnable() { // from class: X.0sLl
                public final void LIZ() {
                    if (i == 69 && i2 == 0) {
                        SavePhotoStickerHandler savePhotoStickerHandler = this;
                        String str2 = str;
                        Effect effect = savePhotoStickerHandler.LLIZ;
                        C1446130njf.LIZ.getClass();
                        savePhotoStickerHandler.LLILLL.LIZJ(str2, C1446130njf.LIZIZ(effect, "need_to_remove_label_for_capture_image", false));
                        Effect effect2 = savePhotoStickerHandler.LLIZ;
                        if (effect2 != null) {
                            try {
                                savePhotoStickerHandler.LLILLL.LIZ(C1446130njf.LJFF(effect2, "hint_for_saving_captured_image"));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                savePhotoStickerHandler.LLILZ.LIZIZ(e);
                            }
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SavePhotoStickerHandler@c44.onMessageReceived$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SavePhotoStickerHandler@c44.onMessageReceived$1");
                }
            });
        }
    }
}
