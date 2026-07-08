package com.bytedance.ies.sdk.widgets.widgetloadpriority;

import X.C1C7U;
import X.C2179971ATj;
import X.C786410Ut5;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes8.dex */
public final class PreLoadInteractionLayer {
    public final CallBack callback;
    public final DataChannel dataChannel;
    public boolean mHasCallFirstFrame;
    public boolean mHasCallRoomEnter;
    public boolean mHasEnterRoom;
    public Room mRoom;
    public final Runnable mShowRunnable = new Runnable() { // from class: com.bytedance.ies.sdk.widgets.widgetloadpriority.PreLoadInteractionLayer$mShowRunnable$1
        @Override // java.lang.Runnable
        public final void run() {
            C1C7U.LIZ("PreLoadInteractionLayer@c54b.mShowRunnable$1");
            com_bytedance_ies_sdk_widgets_widgetloadpriority_PreLoadInteractionLayer$mShowRunnable$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("PreLoadInteractionLayer@c54b.mShowRunnable$1");
        }

        public final void com_bytedance_ies_sdk_widgets_widgetloadpriority_PreLoadInteractionLayer$mShowRunnable$1__run$___twin___() {
            PreLoadInteractionLayer preLoadInteractionLayer = this.this$0;
            preLoadInteractionLayer.mHasCallFirstFrame = true;
            preLoadInteractionLayer.mHasCallRoomEnter = true;
            preLoadInteractionLayer.mHasEnterRoom = true;
            preLoadInteractionLayer.getCallback().delayShowWithRoomInfo(this.this$0.mRoom);
        }

        public static void com_bytedance_ies_sdk_widgets_widgetloadpriority_PreLoadInteractionLayer$mShowRunnable$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(PreLoadInteractionLayer$mShowRunnable$1 preLoadInteractionLayer$mShowRunnable$1) {
            try {
                preLoadInteractionLayer$mShowRunnable$1.com_bytedance_ies_sdk_widgets_widgetloadpriority_PreLoadInteractionLayer$mShowRunnable$1__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    };
    public final Handler uiHandler;

    public interface CallBack {
        void delayShowWithRoomInfo(Room room);

        void onFistFrame();

        void onRoomEnter(Room room);
    }

    public final void clear() {
        Handler handler = this.uiHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mShowRunnable);
        }
        this.mHasCallRoomEnter = false;
        this.mHasEnterRoom = false;
        this.mHasCallFirstFrame = false;
        this.mRoom = null;
    }

    public final CallBack getCallback() {
        return this.callback;
    }

    public final DataChannel getDataChannel() {
        return this.dataChannel;
    }

    public final Handler getUiHandler() {
        return this.uiHandler;
    }

    public PreLoadInteractionLayer(DataChannel dataChannel, Handler handler, CallBack callBack) {
        this.dataChannel = dataChannel;
        this.uiHandler = handler;
        this.callback = callBack;
    }

    public final void preLoadNextRoomInteractionLayer(boolean z, boolean z2, Room room) {
        if (LivePreloadInteractionLayerSetting.INSTANCE.isDisablePreload(this.dataChannel)) {
            return;
        }
        if (this.mRoom == null) {
            this.mRoom = room;
        }
        if (z) {
            if (!this.mHasCallFirstFrame) {
                this.mHasCallFirstFrame = true;
                this.callback.onFistFrame();
            }
            if (this.mHasEnterRoom) {
                this.uiHandler.removeCallbacks(this.mShowRunnable);
                if (!this.mHasCallRoomEnter) {
                    this.mHasCallRoomEnter = true;
                    this.callback.onRoomEnter(this.mRoom);
                }
            }
        }
        if (z2) {
            this.mHasEnterRoom = true;
            if (this.mHasCallFirstFrame) {
                this.uiHandler.removeCallbacks(this.mShowRunnable);
                if (!this.mHasCallRoomEnter) {
                    this.mHasCallRoomEnter = true;
                    this.callback.onRoomEnter(this.mRoom);
                    return;
                }
                return;
            }
            this.uiHandler.removeCallbacks(this.mShowRunnable);
            C786410Ut5.LJLIIL(200L, this.uiHandler, this.mShowRunnable);
        }
    }
}
