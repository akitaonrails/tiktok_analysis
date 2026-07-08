package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.AbstractC1622390sJx;
import X.C01GW;
import X.C1623370sLX;
import X.C1624200sMs;
import X.C1627370sRz;
import X.InterfaceC1623110sL7;
import X.InterfaceC1624920sO2;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes26.dex */
public final class GameStickerHandler extends AbstractC1622390sJx implements InterfaceC1623110sL7, GenericLifecycleObserver {
    public final C01GW<InterfaceC1624920sO2> LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final SafeHandler LLILZ;
    public Effect LLILZIL;

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLILZIL = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        if (this.LLILLJJLI.isInitialized()) {
            this.LLILLJJLI.getValue().onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private final void onStop() {
        if (this.LLILLJJLI.isInitialized()) {
            this.LLILLJJLI.getValue().LIZ();
        }
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return C1624200sMs.LJIIIIZZ(c1627370sRz.LIZ);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        this.LLILLL.invoke();
        this.LLILZIL = c1627370sRz.LIZ;
    }

    public GameStickerHandler(LifecycleOwner lifecycleOwner, C01GW c01gw, AwS569S0100000_25 awS569S0100000_25) {
        this.LLILLJJLI = c01gw;
        this.LLILLL = awS569S0100000_25;
        this.LLILZ = new SafeHandler(lifecycleOwner);
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(final int i, final int i2, final int i3, final String str) {
        if (!C1624200sMs.LJIIIIZZ(this.LLILZIL)) {
            return;
        }
        this.LLILZ.post(new Runnable() { // from class: X.0sO1
            public final void LIZ() {
                int i4 = i;
                if (i4 != 45) {
                    if (i4 == 48) {
                        this.LLILLJJLI.getValue().startPlay();
                        return;
                    }
                    return;
                }
                if (i2 == 2) {
                    GameStickerHandler gameStickerHandler = this;
                    int i5 = i3;
                    String str2 = str;
                    gameStickerHandler.getClass();
                    try {
                        String strOptString = new JSONObject(str2).optString("effectPath");
                        Effect effect = gameStickerHandler.LLILZIL;
                        if (TextUtils.isEmpty(effect != null ? effect.getUnzipPath() : null)) {
                            return;
                        }
                        Effect effect2 = gameStickerHandler.LLILZIL;
                        if (a0.LJJIIZI(strOptString, effect2 != null ? effect2.getUnzipPath() : null, true)) {
                            gameStickerHandler.LLILLJJLI.getValue().LIZIZ(gameStickerHandler.LLILZIL, i5, str2);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GameStickerHandler@ba95.onMessageReceived$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GameStickerHandler@ba95.onMessageReceived$1");
            }
        });
    }
}
