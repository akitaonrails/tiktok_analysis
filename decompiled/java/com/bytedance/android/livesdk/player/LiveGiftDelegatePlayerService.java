package com.bytedance.android.livesdk.player;

import X.C1139390fkv;
import X.C1140890fnL;
import X.InterfaceC2246731Cwh;
import X.InterfaceC2280931EPr;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService;
import com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService;

/* JADX INFO: loaded from: classes36.dex */
public class LiveGiftDelegatePlayerService implements ILiveGiftDelegatePlayerService {
    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final Object buildDelegateGiftPlayListener(final InterfaceC2280931EPr interfaceC2280931EPr) {
        ILiveGiftAlphaPlayerService iLiveGiftAlphaPlayerServiceLIZ = C1139390fkv.LIZ();
        if (iLiveGiftAlphaPlayerServiceLIZ != null) {
            return iLiveGiftAlphaPlayerServiceLIZ.buildDelegateGiftPlayListener(new InterfaceC2246731Cwh(interfaceC2280931EPr) { // from class: X.1EPq
                public final InterfaceC2280931EPr LIZ;

                @Override // X.InterfaceC2246731Cwh
                public final void LJII() {
                    InterfaceC2280931EPr interfaceC2280931EPr2 = this.LIZ;
                    if (interfaceC2280931EPr2 != null) {
                        interfaceC2280931EPr2.LJII();
                    }
                }

                @Override // X.InterfaceC2246731Cwh
                public final void onEnd() {
                    InterfaceC2280931EPr interfaceC2280931EPr2 = this.LIZ;
                    if (interfaceC2280931EPr2 != null) {
                        interfaceC2280931EPr2.onEnd();
                    }
                }

                @Override // X.InterfaceC2246731Cwh
                public final void onStart() {
                    InterfaceC2280931EPr interfaceC2280931EPr2 = this.LIZ;
                    if (interfaceC2280931EPr2 != null) {
                        interfaceC2280931EPr2.onStart();
                    }
                }

                @Override // X.InterfaceC2246731Cwh
                public final void onStop() {
                    InterfaceC2280931EPr interfaceC2280931EPr2 = this.LIZ;
                    if (interfaceC2280931EPr2 != null) {
                        interfaceC2280931EPr2.onStop();
                    }
                }

                {
                    this.LIZ = interfaceC2280931EPr;
                }

                @Override // X.InterfaceC2246731Cwh
                public final void LIZ(int i, String str, boolean z) {
                    InterfaceC2280931EPr interfaceC2280931EPr2 = this.LIZ;
                    if (interfaceC2280931EPr2 != null) {
                        interfaceC2280931EPr2.LIZ(i, str, z);
                    }
                }

                @Override // X.InterfaceC2246731Cwh
                public final void LIZIZ(float f, float f2, float f3, float f4) {
                    InterfaceC2280931EPr interfaceC2280931EPr2 = this.LIZ;
                    if (interfaceC2280931EPr2 != null) {
                        interfaceC2280931EPr2.LIZIZ();
                    }
                }
            });
        }
        return null;
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void clearMasks(Object obj) {
        ILiveGiftAlphaPlayerService iLiveGiftAlphaPlayerServiceLIZ = C1139390fkv.LIZ();
        if (iLiveGiftAlphaPlayerServiceLIZ != null) {
            iLiveGiftAlphaPlayerServiceLIZ.clearMasks(obj);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final View getAlphaView(Object obj) {
        ILiveGiftAlphaPlayerService iLiveGiftAlphaPlayerServiceLIZ = C1139390fkv.LIZ();
        if (iLiveGiftAlphaPlayerServiceLIZ != null) {
            return iLiveGiftAlphaPlayerServiceLIZ.getAlphaView(obj);
        }
        return null;
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void stop(Object obj) {
        ILiveGiftAlphaPlayerService iLiveGiftAlphaPlayerServiceLIZ = C1139390fkv.LIZ();
        if (iLiveGiftAlphaPlayerServiceLIZ != null) {
            iLiveGiftAlphaPlayerServiceLIZ.stop(obj);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void tryCancel(Object obj) {
        ILiveGiftAlphaPlayerService iLiveGiftAlphaPlayerServiceLIZ = C1139390fkv.LIZ();
        if (iLiveGiftAlphaPlayerServiceLIZ != null) {
            iLiveGiftAlphaPlayerServiceLIZ.tryCancel(obj);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void setAutoReleaseParam(Object obj, boolean z) {
        ILiveGiftAlphaPlayerService iLiveGiftAlphaPlayerServiceLIZ = C1139390fkv.LIZ();
        if (iLiveGiftAlphaPlayerServiceLIZ != null) {
            iLiveGiftAlphaPlayerServiceLIZ.setAutoReleaseParam(obj, z);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void setKeepLastFrame(Object obj, boolean z) {
        ILiveGiftAlphaPlayerService iLiveGiftAlphaPlayerServiceLIZ = C1139390fkv.LIZ();
        if (iLiveGiftAlphaPlayerServiceLIZ != null) {
            iLiveGiftAlphaPlayerServiceLIZ.setKeepLastFrame(obj, z);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void setLoopParam(Object obj, boolean z) {
        ILiveGiftAlphaPlayerService iLiveGiftAlphaPlayerServiceLIZ = C1139390fkv.LIZ();
        if (iLiveGiftAlphaPlayerServiceLIZ != null) {
            iLiveGiftAlphaPlayerServiceLIZ.setLoopParam(obj, z);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void setMute(Object obj, boolean z) {
        ILiveGiftAlphaPlayerService iLiveGiftAlphaPlayerServiceLIZ = C1139390fkv.LIZ();
        if (iLiveGiftAlphaPlayerServiceLIZ != null) {
            iLiveGiftAlphaPlayerServiceLIZ.setMute(obj, z);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void setTransparentType(Object obj, int i) {
        ILiveGiftAlphaPlayerService iLiveGiftAlphaPlayerServiceLIZ = C1139390fkv.LIZ();
        if (iLiveGiftAlphaPlayerServiceLIZ != null) {
            iLiveGiftAlphaPlayerServiceLIZ.setTransparentType(obj, i);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void releasePlayer(Object obj, Object obj2, ViewGroup viewGroup) {
        ILiveGiftAlphaPlayerService iLiveGiftAlphaPlayerServiceLIZ = C1139390fkv.LIZ();
        if (iLiveGiftAlphaPlayerServiceLIZ != null) {
            iLiveGiftAlphaPlayerServiceLIZ.releasePlayer(obj, obj2, viewGroup);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final Object start(Object obj, String str, long j) {
        ILiveGiftAlphaPlayerService iLiveGiftAlphaPlayerServiceLIZ = C1139390fkv.LIZ();
        if (iLiveGiftAlphaPlayerServiceLIZ != null) {
            return iLiveGiftAlphaPlayerServiceLIZ.start(obj, str, j);
        }
        return null;
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final Object createLiveGiftPlayController(Context context, LifecycleOwner lifecycleOwner, Object obj, ViewGroup viewGroup) {
        C1140890fnL.LIZJ();
        ILiveGiftAlphaPlayerService iLiveGiftAlphaPlayerServiceLIZ = C1139390fkv.LIZ();
        if (iLiveGiftAlphaPlayerServiceLIZ != null) {
            return iLiveGiftAlphaPlayerServiceLIZ.createLiveGiftPlayController(context, lifecycleOwner, obj, viewGroup);
        }
        return null;
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void setImageMask(Object obj, String str, Bitmap bitmap, float f) {
        ILiveGiftAlphaPlayerService iLiveGiftAlphaPlayerServiceLIZ = C1139390fkv.LIZ();
        if (iLiveGiftAlphaPlayerServiceLIZ != null) {
            iLiveGiftAlphaPlayerServiceLIZ.setImageMask(obj, str, bitmap, f);
        }
    }
}
