package com.ss.android.ugc.aweme.popup;

import X.AbstractC20656215sG;
import X.C1C7U;
import X.InterfaceC20658015sY;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.poplayer.core.PopupManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class SocialPopupManager {
    public static int LIZ;
    public static final MainHandler LIZIZ = new MainHandler();
    public static final Map<InterfaceC20658015sY, Integer> LIZJ = new LinkedHashMap();

    public static final class MainHandler extends BPEAHandler {
        public MainHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("SocialPopupManager$MainHandler@ede8.handleMessage");
            super.handleMessage(message);
            if (HandlerHook.getMessageObj(message.obj) instanceof InterfaceC20658015sY) {
                InterfaceC20658015sY interfaceC20658015sY = (InterfaceC20658015sY) HandlerHook.getMessageObj(message.obj);
                PopupManager.LJIILLIIL(interfaceC20658015sY);
                SocialPopupManager.LIZJ.remove(interfaceC20658015sY);
            }
            C1C7U.LIZIZ("SocialPopupManager$MainHandler@ede8.handleMessage");
        }
    }

    public static void LIZ(AbstractC20656215sG abstractC20656215sG) {
        Map<InterfaceC20658015sY, Integer> map = LIZJ;
        Object objValueOf = ((LinkedHashMap) map).get(abstractC20656215sG.scene);
        if (objValueOf == null) {
            int i = LIZ;
            LIZ = i + 1;
            objValueOf = Integer.valueOf(i);
            map.put(abstractC20656215sG.scene, (Integer) objValueOf);
        } else {
            LIZIZ.removeMessages(((Number) objValueOf).intValue());
        }
        PopupManager.LIZ(abstractC20656215sG, true);
        MainHandler mainHandler = LIZIZ;
        Message message = new Message();
        message.what = ((Number) objValueOf).intValue();
        message.obj = abstractC20656215sG.scene;
        mainHandler.sendMessageDelayed(message, 300L);
    }
}
