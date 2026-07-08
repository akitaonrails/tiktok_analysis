package com.bytedance.android.livesdk.gift.base.platform.business.utils.liveaudio;

import X.AbstractC986140blk;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2640010k;
import X.C497740JfY;
import X.InterfaceC774130UYh;
import android.content.Context;
import com.bytedance.android.live.broadcast.api.LiveStreamGlobalChannel;
import com.bytedance.android.live.gift.IGiftAudioPlayer;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class GiftAudioPlayer implements IGiftAudioPlayer {
    public static InterfaceC774130UYh LLILLL;
    public static TTVideoEngine LLILZ;
    public static final GiftAudioPlayer LL = new GiftAudioPlayer();
    public static final String LLILLJJLI = "GiftAudioPlayer";
    public static String LLILZIL = "";

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer
    public final void pause() {
        if (LLILLL == null || !C2640010k.LIZIZ()) {
            TTVideoEngine tTVideoEngine = LLILZ;
            if (tTVideoEngine != null) {
                tTVideoEngine.pause();
            }
            C20441214yg.LIZIZ(LLILLJJLI, "mEngine play pause");
            return;
        }
        InterfaceC774130UYh interfaceC774130UYh = LLILLL;
        if (interfaceC774130UYh != null) {
            interfaceC774130UYh.pause();
        }
        C20441214yg.LIZIZ(LLILLJJLI, "avplayer play pause");
    }

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer
    public final void release() {
        TTVideoEngine tTVideoEngine = LLILZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.release();
        }
        InterfaceC774130UYh interfaceC774130UYh = LLILLL;
        if (interfaceC774130UYh != null) {
            interfaceC774130UYh.stop();
        }
        C20441214yg.LIZIZ(LLILLJJLI, "release");
    }

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer
    public final void start() {
        if (LLILLL == null || !C2640010k.LIZIZ()) {
            TTVideoEngine tTVideoEngine = LLILZ;
            if (tTVideoEngine != null) {
                tTVideoEngine.LJIJ(LLILZIL);
            }
            TTVideoEngine tTVideoEngine2 = LLILZ;
            if (tTVideoEngine2 != null) {
                tTVideoEngine2.play();
            }
            String str = LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mEnginePlayer play start, url");
            sbLIZ.append(LLILZIL);
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        InterfaceC774130UYh interfaceC774130UYh = LLILLL;
        if (interfaceC774130UYh != null) {
            interfaceC774130UYh.setDataSource(C497740JfY.LJII(), LLILZIL);
        }
        InterfaceC774130UYh interfaceC774130UYh2 = LLILLL;
        if (interfaceC774130UYh2 != null) {
            interfaceC774130UYh2.prepare();
        }
        InterfaceC774130UYh interfaceC774130UYh3 = LLILLL;
        if (interfaceC774130UYh3 != null) {
            interfaceC774130UYh3.setMixerEnable(false);
        }
        InterfaceC774130UYh interfaceC774130UYh4 = LLILLL;
        if (interfaceC774130UYh4 != null) {
            interfaceC774130UYh4.start();
        }
        String str2 = LLILLJJLI;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("avplayer play start, url");
        sbLIZ2.append(LLILZIL);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer
    public final void stop() {
        if (LLILLL == null || !C2640010k.LIZIZ()) {
            TTVideoEngine tTVideoEngine = LLILZ;
            if (tTVideoEngine != null) {
                tTVideoEngine.stop();
            }
            C20441214yg.LIZIZ(LLILLJJLI, "mEngine play stop");
            return;
        }
        InterfaceC774130UYh interfaceC774130UYh = LLILLL;
        if (interfaceC774130UYh != null) {
            interfaceC774130UYh.stop();
        }
        C20441214yg.LIZIZ(LLILLJJLI, "avplayer play stop");
    }

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer
    public final void init(Context context) {
        DataChannelGlobal.LLILZ.DQ2(LiveStreamGlobalChannel.class, this, new AwS594S0100000_15(context, 575));
        if (LLILLL == null || !C2640010k.LIZIZ()) {
            LLILZ = new TTVideoEngine(context, 0);
            String str = LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Engine Player");
            sbLIZ.append(LLILZ);
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        String str2 = LLILLJJLI;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("init avplayer");
        sbLIZ2.append(LLILLL);
        sbLIZ2.append("，engineplayer");
        sbLIZ2.append(LLILZ);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer
    public final void setListener(AbstractC986140blk abstractC986140blk) {
        InterfaceC774130UYh interfaceC774130UYh = LLILLL;
        if (interfaceC774130UYh != null) {
            interfaceC774130UYh.setEventListener(null);
        }
        InterfaceC774130UYh interfaceC774130UYh2 = LLILLL;
        if (interfaceC774130UYh2 != null) {
            interfaceC774130UYh2.setErrorListener(null);
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer
    public final void setVolume(float f) {
        String str = LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set volume");
        sbLIZ.append(f);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC774130UYh interfaceC774130UYh = LLILLL;
        if (interfaceC774130UYh != null) {
            interfaceC774130UYh.setVolume(f);
        }
        TTVideoEngine tTVideoEngine = LLILZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJIILLIIL(f, f);
        }
    }
}
