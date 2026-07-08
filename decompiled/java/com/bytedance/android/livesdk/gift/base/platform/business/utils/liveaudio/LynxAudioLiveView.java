package com.bytedance.android.livesdk.gift.base.platform.business.utils.liveaudio;

import X.C1532680pzG;
import X.C1532950pzh;
import X.C1533710q0v;
import X.C1535630q41;
import X.C20441214yg;
import X.C21341718fX;
import X.C2188811AlT;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.tiktok.forestx.RequestParamsX;
import j27.s;
import kotlin.jvm.internal.AwS76S1000000_26;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes33.dex */
public final class LynxAudioLiveView extends UISimpleView<C21341718fX> {
    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        GiftAudioPlayer.LL.release();
    }

    public LynxAudioLiveView(s sVar) {
        super(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(final Context context) {
        GiftAudioPlayer.LL.init(context);
        return new FrameLayout(context) { // from class: X.18fX
        };
    }

    @InterfaceC1967107nB
    public final void pause(Callback callback) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", Control method: --> pause()");
        LynxLog.i("LiveAudioPlayerView", C2188811AlT.LIZIZ(sbLIZ));
        GiftAudioPlayer.LL.pause();
    }

    @InterfaceC1967107nB
    public final void play(Callback callback) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", Control method: --> play()");
        LynxLog.i("LiveAudioPlayerView", C2188811AlT.LIZIZ(sbLIZ));
        GiftAudioPlayer.LL.start();
    }

    @InterfaceC1312540kGC(name = "src")
    public final void setSrc(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", setSrc -> ");
        sbLIZ.append(str);
        LynxLog.i("LiveAudioPlayerView", C2188811AlT.LIZIZ(sbLIZ));
        GiftAudioPlayer giftAudioPlayer = GiftAudioPlayer.LL;
        giftAudioPlayer.getClass();
        if (C1535630q41.LJJIII) {
            C1532680pzG.LIZ.getClass();
            C1532950pzh c1532950pzh = C1532680pzG.LJJ;
            RequestParamsX requestParamsX = new RequestParamsX(null, null, 3, null);
            requestParamsX.source = "GiftAudio";
            c1532950pzh.LIZ(str, requestParamsX, new AwS76S1000000_26(str, 18));
        } else {
            JSONArray jSONArray = C1533710q0v.LIZ;
            IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(null, false);
            RequestParams requestParams = new RequestParams(null, 1, null);
            if (iResourceServiceXLIZIZ != null) {
                iResourceServiceXLIZIZ.fetchResourceAsyncIfNeed(str, requestParams, new AwS76S1000000_26(str, 19));
            }
        }
        String str2 = GiftAudioPlayer.LLILLJJLI;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("url ");
        sbLIZ2.append(giftAudioPlayer);
        sbLIZ2.append(".url");
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @InterfaceC1312540kGC(name = "volume")
    public final void setVolume(float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", setVolume -> ");
        sbLIZ.append(f);
        LynxLog.i("LiveAudioPlayerView", C2188811AlT.LIZIZ(sbLIZ));
        GiftAudioPlayer.LL.setVolume(f);
    }

    @InterfaceC1967107nB
    public final void stop(Callback callback) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", Control method: --> stop()");
        LynxLog.i("LiveAudioPlayerView", C2188811AlT.LIZIZ(sbLIZ));
        GiftAudioPlayer.LL.stop();
    }
}
