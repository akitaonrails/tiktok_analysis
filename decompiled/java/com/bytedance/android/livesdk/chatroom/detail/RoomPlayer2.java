package com.bytedance.android.livesdk.chatroom.detail;

import X.C0IEB;
import X.C0IF5;
import X.C0IIZ;
import X.C0IJ7;
import X.C0IL2;
import X.C0IM2;
import X.C0IM9;
import X.C0IMA;
import X.C0IWV;
import X.C0IX5;
import X.C0IXA;
import X.C1161920gLG;
import X.C1281010jRL;
import X.C1300320jwU;
import X.C1699360uK6;
import X.C1699430uKD;
import X.C1APY;
import X.C1C7U;
import X.C20441214yg;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C463260IEq;
import X.C465050ILn;
import X.C465130ILv;
import X.C465140ILw;
import X.C467650IVn;
import X.C480530Ist;
import X.C480540Isu;
import X.C480590Isz;
import X.C480600It0;
import X.C480610It1;
import X.C480620It2;
import X.C480710ItB;
import X.C786410Ut5;
import X.C827750WdZ;
import X.C945320ahu;
import X.EnumC1913550ztZ;
import X.InterfaceC1106030et7;
import X.InterfaceC1699390uK9;
import X.InterfaceC1699420uKC;
import X.InterfaceC463820IGu;
import X.InterfaceC467750IVx;
import X.InterfaceC480510Isr;
import X.InterfaceC480570Isx;
import X.InterfaceC480650It5;
import X.InterfaceC485640J2s;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS26S0110000_7;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRoomPlayerSeiOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterRoomSuccessMsgOptExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerAppBackgroundEventSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePredictSlideOrExitExp;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisablePullStreamSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.LivePlayerCreateLogicOptExp;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class RoomPlayer2 implements C0IEB {
    public int audioCurrentStatusStore;
    public boolean enableSeiFilter;
    public String enterMethodSubtag;
    public String enterRoomScene;
    public C1699360uK6 entranceParam;
    public boolean hasLogPrePlayerHitCache;
    public boolean isBackground;
    public boolean isPreparePlayer;
    public Long isPrivate;
    public boolean isReusePlayer;
    public boolean isReusePlayerWithFirstFrame;
    public boolean isSmoothEnter;
    public C945320ahu lastFullyLinkMicSeiData;
    public InterfaceC467750IVx liveRoomLogger;
    public String logId;
    public C480540Isu mAudioFocusController;
    public WeakReference<InterfaceC480570Isx> mCallbackRef;
    public C465140ILw mConfig;
    public int mDecodeStatus;
    public boolean mHasAttached;
    public boolean mHasWarmedUp;
    public InterfaceC480510Isr mLivePlayController;
    public C0IXA mLogger;
    public Handler mMainHandler;
    public String mMediaErrorMessage;
    public List<C480610It1> mPendingCallbacks;
    public Runnable mPendingMessageRunnable;
    public InterfaceC480650It5 mPlayMessageListener;
    public String mPlayerTag;
    public boolean mPullStreamParallel;
    public WeakReference<InterfaceC463820IGu> mRenderViewRef;
    public boolean mStopOnPlayingOther;
    public WeakReference<Context> mTagContextRef;
    public boolean multiPlayer;
    public Runnable pendingAction;
    public String reusePlayerTag;
    public long roomId;
    public long startTime;
    public boolean supportLowLatency;

    @Override // X.C0IEB
    public void onBackground() {
        this.isBackground = true;
        stopPreIo();
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.v0(false);
        }
        if (!InterfaceC1106030et7.e5.LIZIZ().booleanValue()) {
            setMute(true, "bgplay close");
            return;
        }
        if (!C0IJ7.LIZIZ(getTagContext()) && InterfaceC1106030et7.c5.LIZIZ().booleanValue()) {
            setMute(true, "bgplay close");
            return;
        }
        C480540Isu c480540Isu = this.mAudioFocusController;
        if (c480540Isu == null) {
            return;
        }
        c480540Isu.LIZ(true);
    }

    @Override // X.C0IEB
    public void onForeground() {
        this.isBackground = false;
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.v0(true);
        }
        C480540Isu c480540Isu = this.mAudioFocusController;
        if (c480540Isu == null) {
            return;
        }
        c480540Isu.LIZ(false);
        this.mAudioFocusController.LIZJ(getTagContext(), this.mPlayerTag);
    }

    @Override // X.C0IEB
    public /* bridge */ /* synthetic */ void setSeiOpen(boolean z) {
    }

    @Override // X.C0IEB
    public void setSessionIdFromFullLinkContext(String str) {
    }

    @Override // X.C0IEB
    public boolean warmUp() {
        this.mHasWarmedUp = true;
        C465050ILn.LJ(this.roomId, "live_room_player_create_to_start");
        return start();
    }

    private boolean doStart() {
        InterfaceC480510Isr interfaceC480510Isr;
        this.mLogger.LIZLLL = this.mHasWarmedUp;
        setLivePlayEntranceParamFromConfig();
        if (this.isReusePlayer && (interfaceC480510Isr = this.mLivePlayController) != null) {
            this.isReusePlayerWithFirstFrame = interfaceC480510Isr.i0();
        }
        C0IXA c0ixa = this.mLogger;
        boolean z = this.isReusePlayer;
        boolean z2 = this.isReusePlayerWithFirstFrame;
        c0ixa.getClass();
        c0ixa.LJ = z ? z2 ? 1 : 2 : 0;
        if (this.multiPlayer && this.mLivePlayController != null) {
            ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LJIIIZ(this.mLivePlayController, this.mPlayerTag);
        }
        int i = this.mConfig.LJII;
        if (i == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.startTime = jCurrentTimeMillis;
            this.mLogger.LJI(Long.valueOf(jCurrentTimeMillis), "room_player_start");
            this.isBackground = false;
            doStartPlayByMultiPullStreamData(this.logId);
            return true;
        }
        if (i != 2) {
            return false;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        this.startTime = jCurrentTimeMillis2;
        this.mLogger.LJI(Long.valueOf(jCurrentTimeMillis2), "room_player_start");
        this.isBackground = false;
        doStartPlayByStreamUrl(this.logId);
        return true;
    }

    private InterfaceC463820IGu getRenderView() {
        WeakReference<InterfaceC463820IGu> weakReference = this.mRenderViewRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private boolean hasPendingFirstFrameMsg() {
        List<C480610It1> list = this.mPendingCallbacks;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<C480610It1> it2 = this.mPendingCallbacks.iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZ == EnumC1913550ztZ.DISPLAYED_PLAY) {
                return true;
            }
        }
        return false;
    }

    private void reusePlayerAndBgOptRecordFirstFrame() {
        if (this.isReusePlayer && this.isReusePlayerWithFirstFrame) {
            if (this.mLivePlayController.i0() && this.isSmoothEnter) {
                long jLJFF = this.mLogger.LJFF("start_real");
                this.mLogger.LJI(Long.valueOf(jLJFF), "first_frame");
                InterfaceC480570Isx callback = getCallback();
                if (callback != null) {
                    callback.LJFF(this.mLogger.LIZLLL(), this.mLogger.LJ());
                }
                InterfaceC467750IVx interfaceC467750IVx = this.liveRoomLogger;
                if (interfaceC467750IVx != null) {
                    ((C467650IVn) interfaceC467750IVx).LJJIJIIJI(jLJFF, C0IWV.SMOOTH_ENTER);
                    return;
                }
                return;
            }
            C463260IEq c463260IEq = this.mLogger.LIZJ;
            long jCurrentTimeMillis = c463260IEq != null ? c463260IEq.LJIIIIZZ : System.currentTimeMillis();
            this.mLogger.LJI(Long.valueOf(jCurrentTimeMillis), "first_frame");
            InterfaceC480570Isx callback2 = getCallback();
            if (callback2 != null) {
                callback2.LJFF(this.mLogger.LIZLLL(), this.mLogger.LJ());
            }
            InterfaceC467750IVx interfaceC467750IVx2 = this.liveRoomLogger;
            if (interfaceC467750IVx2 != null) {
                ((C467650IVn) interfaceC467750IVx2).LJJIJIIJI(jCurrentTimeMillis, C0IWV.REUSE_PLAYER);
            }
        }
    }

    private void setLivePlayEntranceParamFromConfig() {
        if (this.mLivePlayController == null) {
            return;
        }
        EnterRoomConfig enterRoomConfig = C0IL2.LIZ.LIZ().mEnterRoomConfig;
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        String str = roomsData.enterFromMerge;
        String str2 = roomsData.enterMethod;
        String str3 = roomsData.actionType;
        if (C2093608Ic.LJ(str3)) {
            str3 = enterRoomConfig.mLogData.loadDuration > 0 ? "draw" : "click";
        }
        C1699360uK6 c1699360uK6 = new C1699360uK6(str, str2, str3, this.enterMethodSubtag, false, false);
        this.entranceParam = c1699360uK6;
        this.mLivePlayController.LJJII(c1699360uK6);
    }

    @Override // X.C0IEB
    public void dynamicOpenTextureRender() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.dynamicOpenTextureRender();
        }
    }

    @Override // X.C0IEB
    public boolean getAndClearResumeFromAbovePage() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            return interfaceC480510Isr.getAndClearResumeFromAbovePage();
        }
        return false;
    }

    public long getAudioLostFocusTime() {
        C480540Isu c480540Isu = this.mAudioFocusController;
        if (c480540Isu == null) {
            return -1L;
        }
        return c480540Isu.LJ;
    }

    public InterfaceC480570Isx getCallback() {
        WeakReference<InterfaceC480570Isx> weakReference = this.mCallbackRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // X.C0IEB
    public String getCurrentResolution() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        return interfaceC480510Isr != null ? interfaceC480510Isr.getCurrentResolution() : "";
    }

    public String getCurrentUrl() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        return interfaceC480510Isr == null ? "" : interfaceC480510Isr.LJFF();
    }

    @Override // X.C0IEB
    public String getFirstFrameBlockInfo() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        return interfaceC480510Isr != null ? interfaceC480510Isr.LJIIIIZZ() : "";
    }

    @Override // X.C0IEB
    public boolean getIfPreviewUsingPlayer() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            return interfaceC480510Isr.getIfPreviewUsingPlayer();
        }
        return false;
    }

    @Override // X.C0IEB
    public C1281010jRL getLiveNetworkState() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            return interfaceC480510Isr.getLiveNetworkState();
        }
        return null;
    }

    @Override // X.C0IEB
    public C1699430uKD getPlayerThreadBlockStatus() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            return interfaceC480510Isr.getPlayerThreadBlockStatus();
        }
        return null;
    }

    public Context getTagContext() {
        WeakReference<Context> weakReference = this.mTagContextRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public List<String> getWidevineSupportedQualityList() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            return interfaceC480510Isr.LJIJJLI();
        }
        return null;
    }

    @Override // X.C0IEB
    public boolean isHadGamePreviewLiveVideoRotated() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            return interfaceC480510Isr.isHadGamePreviewLiveVideoRotated();
        }
        return false;
    }

    @Override // X.C0IEB
    public boolean isPlaying() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        return interfaceC480510Isr != null && interfaceC480510Isr.isPlaying();
    }

    @Override // X.C0IEB
    public boolean isVideoHorizontal() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        return interfaceC480510Isr != null && interfaceC480510Isr.isVideoHorizontal();
    }

    @Override // X.C0IEB
    public boolean isWidevineDrmStream() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            return interfaceC480510Isr.isWidevineDrmStream();
        }
        return false;
    }

    @Override // X.C0IEB
    public void restoreAudioStatus() {
        int i;
        C480540Isu c480540Isu = this.mAudioFocusController;
        if (c480540Isu == null || (i = this.audioCurrentStatusStore) == -100) {
            return;
        }
        c480540Isu.LIZ = i;
        this.audioCurrentStatusStore = -100;
    }

    @Override // X.C0IEB
    public void saveAudioStatus() {
        C480540Isu c480540Isu = this.mAudioFocusController;
        if (c480540Isu != null) {
            this.audioCurrentStatusStore = c480540Isu.LIZ;
        }
    }

    @Override // X.C0IEB
    public boolean start() {
        if (TestDisablePullStreamSetting.INSTANCE.getValue()) {
            C827750WdZ.LIZ("RoomPlayer2", "block pull stream -> it only valid for offline packages");
            return true;
        }
        if (this.mConfig == null || this.mLivePlayController != null) {
            C0IX5.LJIJ(1, C0IX5.LJIILLIIL(Long.valueOf(this.roomId)));
            reusePlayerAndBgOptRecordFirstFrame();
            return true;
        }
        if (this.multiPlayer && this.isReusePlayer && !C2093608Ic.LJ(this.reusePlayerTag)) {
            ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LJI(this.reusePlayerTag, this.mPlayerTag);
        }
        this.mLivePlayController = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZJ(this.mPlayerTag, true);
        Runnable runnable = this.pendingAction;
        if (runnable != null) {
            runnable.run();
            this.pendingAction = null;
        }
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.x0(this.roomId);
        }
        this.mLivePlayController.g0(new C480620It2(((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).JE(), this));
        InterfaceC480510Isr interfaceC480510Isr2 = this.mLivePlayController;
        this.mConfig.getClass();
        interfaceC480510Isr2.setSeiOpen(true);
        this.mLivePlayController.C0(this.mConfig.LJI);
        this.mAudioFocusController = new C480540Isu(this.mLivePlayController);
        return doStart();
    }

    @Override // X.C0IEB
    public boolean startWithNewLivePlayer() {
        if (this.mLivePlayController != null) {
            return true;
        }
        if (this.mConfig.LJII == 0) {
            return false;
        }
        InterfaceC480510Isr interfaceC480510IsrXj1 = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Xj1();
        this.mLivePlayController = interfaceC480510IsrXj1;
        if (interfaceC480510IsrXj1 != null) {
            interfaceC480510IsrXj1.x0(this.roomId);
        }
        this.mLivePlayController.LJJLIIIJLLLLLLLZ();
        this.mLivePlayController.setSeiOpen(true);
        this.mAudioFocusController = new C480540Isu(this.mLivePlayController);
        return doStart();
    }

    @Override // X.C0IEB
    public void stopUseTextureRender() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.stopUseTextureRender();
        }
    }

    @Override // X.C0IEB
    public void stopWhenJoinInteract() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr == null) {
            return;
        }
        interfaceC480510Isr.q0(this.mPlayerTag);
    }

    @Override // X.C0IEB
    public void stopWhenPlayingOther() {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr == null) {
            return;
        }
        interfaceC480510Isr.K0(this.mPlayerTag);
    }

    @Override // X.C0IEB
    public boolean tryResumePlay() {
        if (!this.mStopOnPlayingOther) {
            return false;
        }
        this.mStopOnPlayingOther = false;
        return doStart();
    }

    @Override // X.C0IEB
    public void tryToStartAudioDevice() {
        C480540Isu c480540Isu = this.mAudioFocusController;
        if (c480540Isu != null) {
            c480540Isu.LIZJ(getTagContext(), this.mPlayerTag);
        }
    }

    @Override // X.C0IEB
    public void tryToUploadFirstScreenTime() throws JSONException {
        this.mLogger.LJIIIIZZ(C0IX5.LJIILLIIL(Long.valueOf(this.roomId)));
    }

    @Override // X.C0IEB
    public boolean pipResumePlay() {
        return doStart();
    }

    @Override // X.C0IEB
    public void recycle() {
        C465130ILv c465130ILvLIZIZ = C465130ILv.LIZIZ();
        c465130ILvLIZIZ.getClass();
        String playerTag = getPlayerTag();
        if (playerTag != null) {
            release();
            ((HashMap) c465130ILvLIZIZ.LIZIZ).remove(playerTag);
            ((LinkedList) c465130ILvLIZIZ.LIZJ).offer(this);
        }
    }

    @Override // X.C0IEB
    public void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.roomId);
        sbLIZ.append(", release -> roomPlayer release and reset param");
        C827750WdZ.LIZ("RoomPlayer2", C2188811AlT.LIZIZ(sbLIZ));
        stopPreIo();
        this.mAudioFocusController = null;
        this.mLivePlayController = null;
        if (LinkMicRoomPlayerSeiOptSetting.INSTANCE.isEnable()) {
            this.lastFullyLinkMicSeiData = null;
        }
        this.mDecodeStatus = 0;
        this.mMediaErrorMessage = null;
        this.mStopOnPlayingOther = false;
        this.isPreparePlayer = false;
        this.hasLogPrePlayerHitCache = false;
        this.isBackground = false;
        this.mPendingCallbacks.clear();
        this.mHasAttached = false;
        this.mHasWarmedUp = false;
        this.isReusePlayer = false;
        this.reusePlayerTag = null;
        this.isReusePlayerWithFirstFrame = false;
        this.isSmoothEnter = false;
        this.startTime = 0L;
        this.mPlayerTag = null;
        this.roomId = 0L;
        this.enterMethodSubtag = null;
        this.entranceParam = null;
        C0IXA c0ixa = this.mLogger;
        ((ConcurrentHashMap) c0ixa.LIZIZ).clear();
        c0ixa.LIZJ = null;
        c0ixa.LIZLLL = false;
        c0ixa.LJII = false;
        c0ixa.LJ = 0;
        c0ixa.LJFF = false;
        this.mConfig = null;
        WeakReference<Context> weakReference = this.mTagContextRef;
        if (weakReference != null) {
            weakReference.clear();
            this.mTagContextRef = null;
        }
        WeakReference<InterfaceC480570Isx> weakReference2 = this.mCallbackRef;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.mCallbackRef = null;
        }
        WeakReference<InterfaceC463820IGu> weakReference3 = this.mRenderViewRef;
        if (weakReference3 != null) {
            weakReference3.clear();
            this.mRenderViewRef = null;
        }
    }

    public void stopPreIo() {
        InterfaceC480510Isr interfaceC480510IsrLIZJ;
        if (LivePredictSlideOrExitExp.isEnablePreIoSceneGate() && (interfaceC480510IsrLIZJ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZJ(this.mPlayerTag, false)) != null) {
            interfaceC480510IsrLIZJ.LJJJ();
        }
    }

    private C945320ahu getLastFullyLinkMicSeiData() {
        return this.lastFullyLinkMicSeiData;
    }

    @Override // X.C0IEB
    public int getDecodeStatus() {
        return this.mDecodeStatus;
    }

    @Override // X.C0IEB
    public boolean getIsPreparePlayer() {
        return this.isPreparePlayer;
    }

    @Override // X.C0IEB
    public String getMediaErrorMessage() {
        return this.mMediaErrorMessage;
    }

    @Override // X.C0IEB
    public boolean getPlayerHasLogPrePlayerHitCache() {
        return this.hasLogPrePlayerHitCache;
    }

    @Override // X.C0IEB
    public String getPlayerTag() {
        return this.mPlayerTag;
    }

    public long getRoomId() {
        return this.roomId;
    }

    @Override // X.C0IEB
    public long getStartTime() {
        return this.startTime;
    }

    @Override // X.C0IEB
    public boolean isPullParallel() {
        return this.mPullStreamParallel;
    }

    @Override // X.C0IEB
    public C0IXA getLogger() {
        return this.mLogger;
    }

    private void doStartPlayByMultiPullStreamData(String str) {
        C480590Isz c480590Isz;
        if (this.mConfig == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play stream data: ");
        sbLIZ.append(this.mConfig.LIZJ);
        sbLIZ.append(", streamType: ");
        sbLIZ.append(this.mConfig.LJ);
        C827750WdZ.LIZ("RoomPlayer2", C2188811AlT.LIZIZ(sbLIZ));
        try {
            StreamUrlExtra.SrConfig srConfig = this.mConfig.LJFF;
            if (srConfig != null) {
                C480600It0 c480600It0 = new C480600It0();
                c480600It0.LIZ = srConfig.enabled;
                c480600It0.LIZIZ = srConfig.antiAlias;
                c480600It0.LIZJ = srConfig.strength;
                c480600It0.LIZLLL = srConfig.LIZ;
                c480590Isz = new C480590Isz(c480600It0);
            } else {
                c480590Isz = null;
            }
            InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
            C465140ILw c465140ILw = this.mConfig;
            String str2 = c465140ILw.LIZ;
            String str3 = c465140ILw.LIZIZ;
            InterfaceC463820IGu renderView = getRenderView();
            interfaceC480510Isr.o0(this.mConfig.LJ.ordinal(), this.mPlayMessageListener, c480590Isz, new C0IMA(C0IX5.LJIILLIIL(Long.valueOf(this.roomId)), Long.valueOf(this.roomId), this.supportLowLatency, str), renderView, this.isPrivate, str2, str3, this.mPlayerTag, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC480570Isx callback = getCallback();
            if (callback != null) {
                callback.LIZ(e);
            }
        }
    }

    private void doStartPlayByStreamUrl(String str) {
        C480590Isz c480590Isz;
        if (this.mConfig == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play url: ");
        sbLIZ.append(this.mConfig.LIZJ);
        sbLIZ.append(", streamType: ");
        sbLIZ.append(this.mConfig.LJ);
        C827750WdZ.LIZ("RoomPlayer2", C2188811AlT.LIZIZ(sbLIZ));
        try {
            StreamUrlExtra.SrConfig srConfig = this.mConfig.LJFF;
            if (srConfig != null) {
                C480600It0 c480600It0 = new C480600It0();
                c480600It0.LIZ = srConfig.enabled;
                c480600It0.LIZIZ = srConfig.antiAlias;
                c480600It0.LIZJ = srConfig.strength;
                c480600It0.LIZLLL = srConfig.LIZ;
                c480590Isz = new C480590Isz(c480600It0);
            } else {
                c480590Isz = null;
            }
            this.mLivePlayController.J0(this.mConfig.LIZJ, getRenderView(), this.mConfig.LJ.ordinal(), c480590Isz, this.mPlayMessageListener, this.mConfig.LIZLLL, this.mPlayerTag, new C0IMA(C0IX5.LJIILLIIL(Long.valueOf(this.roomId)), Long.valueOf(this.roomId), this.supportLowLatency, str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC480570Isx callback = getCallback();
            if (callback != null) {
                callback.LIZ(e);
            }
        }
    }

    private boolean isFullyLinkMicSeiAppData(String str) {
        if (str != null && !str.contains("ByteVC") && str.contains("app_data")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIsSmoothEnter$0(boolean z) {
        C1C7U.LIZ("RoomPlayer2@c98e.setIsSmoothEnter$1L");
        setIsSmoothEnter(z);
        C1C7U.LIZIZ("RoomPlayer2@c98e.setIsSmoothEnter$1L");
    }

    @Override // X.C0IEB
    public void changeLowLatencyMode(boolean z) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.changeLowLatencyMode(z);
        }
    }

    @Override // X.C0IEB
    public void changeSRSupportScene(boolean z) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.changeSRSupportScene(z);
        }
    }

    @Override // X.C0IEB
    public void enableSeiFilter(boolean z) {
        this.enableSeiFilter = z;
    }

    @Override // X.C0IEB
    public int getAudioDuckingDurationForLive(int i) {
        if (this.mLivePlayController != null) {
            C20441214yg.LJIIIZ("MatchAICommentary", "Roomplayer2 getAudioDuckingDurationForLive");
            return this.mLivePlayController.getAudioDuckingDurationForLive(i);
        }
        return 0;
    }

    @Override // X.C0IEB
    public void getVideoSize(int[] iArr) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null && iArr != null) {
            int videoSize = interfaceC480510Isr.getVideoSize();
            iArr[0] = 65535 & videoSize;
            iArr[1] = videoSize >> 16;
        }
    }

    @Override // X.C0IEB
    public void getVideoSizeNoCache(int[] iArr) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null && iArr != null) {
            int iP0 = interfaceC480510Isr.p0();
            iArr[0] = 65535 & iP0;
            iArr[1] = iP0 >> 16;
        }
    }

    @Override // X.C0IEB
    public void onAppBackground(boolean z) {
        InterfaceC480510Isr interfaceC480510Isr;
        if (!LivePlayerAppBackgroundEventSetting.enable() || (interfaceC480510Isr = this.mLivePlayController) == null) {
            return;
        }
        int i = 0;
        if (z) {
            if (InterfaceC1106030et7.e5.LIZIZ().booleanValue()) {
                if (InterfaceC1106030et7.c5.LIZIZ().booleanValue()) {
                    i = 2;
                } else {
                    i = 1;
                }
            }
            this.mLivePlayController.LJIIJ(i);
        } else {
            interfaceC480510Isr.LJIIJ(0);
        }
        this.mLivePlayController.LJIIZILJ(z);
    }

    public void onPlayerLog(JSONObject jSONObject) {
        C0IXA c0ixa = this.mLogger;
        c0ixa.getClass();
        if (jSONObject != null && TextUtils.equals(jSONObject.optString("event_key"), "first_frame")) {
            String[] strArr = C0IXA.LJIIJ;
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str = strArr[i];
                long jOptLong = jSONObject.optLong(C0IXA.LJIIJJI[i], 0L);
                if (jOptLong != 0) {
                    ((ConcurrentHashMap) c0ixa.LIZIZ).put(str, Long.valueOf(jOptLong));
                }
            }
        }
    }

    public boolean preCreatedSurface(Context context) {
        boolean zLJJIJ = this.mLivePlayController.LJJIJ(context);
        this.mLogger.LJFF = zLJJIJ;
        return zLJJIJ;
    }

    @Override // X.C0IEB
    public void preparePlayer(C0IMA c0ima) {
        InterfaceC480510Isr interfaceC480510IsrLIZJ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZJ(this.mPlayerTag, true);
        if (interfaceC480510IsrLIZJ != null) {
            EnterRoomConfig.RoomsData roomsData = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData;
            interfaceC480510IsrLIZJ.LJJII(new C1699360uK6(roomsData.enterFromMerge, roomsData.enterMethod, "draw", this.enterMethodSubtag, false, false));
            C465140ILw c465140ILw = this.mConfig;
            interfaceC480510IsrLIZJ.LJJJI(c465140ILw.LIZ, c465140ILw.LIZIZ, this.mPlayerTag, c0ima);
        }
    }

    @Override // X.C0IEB
    public void registerMuteFilter(C1APY c1apy) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.registerMuteFilter(c1apy);
        }
    }

    @Override // X.C0IEB
    public void setAnchorInteractMode(boolean z) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.setAnchorInteractMode(z);
        }
    }

    @Override // X.C0IEB
    public void setAudioRespondDisableForQuiz(boolean z) {
        C480540Isu c480540Isu = this.mAudioFocusController;
        if (c480540Isu != null) {
            c480540Isu.LJFF = z;
        }
    }

    @Override // X.C0IEB
    public void setEnterRoomScene(String str) {
        if (str != null) {
            this.enterRoomScene = str;
        }
    }

    @Override // X.C0IEB
    public void setHadGamePreviewLiveVideoRotated(boolean z) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.setHadGamePreviewLiveVideoRotated(z);
        }
    }

    @Override // X.C0IEB
    public void setIsPreparePlayer(boolean z) {
        this.isPreparePlayer = z;
    }

    @Override // X.C0IEB
    public void setIsPrivate(Long l) {
        this.isPrivate = l;
    }

    public void setIsSmoothEnter(boolean z) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.LJJIJIIJI(z);
        } else {
            this.pendingAction = new ARunnableS26S0110000_7(this, z, 3);
        }
    }

    @Override // X.C0IEB
    public void setLiveRoomLogger(InterfaceC467750IVx interfaceC467750IVx) {
        this.liveRoomLogger = interfaceC467750IVx;
    }

    @Override // X.C0IEB
    public void setPlayerHashLogPrePlayerHitCache(boolean z) {
        this.hasLogPrePlayerHitCache = z;
    }

    @Override // X.C0IEB
    public void setPrePullStream(boolean z) {
        if (this.mHasWarmedUp) {
            return;
        }
        this.mHasWarmedUp = z;
    }

    @Override // X.C0IEB
    public void setPullParallel(boolean z) {
        C0IXA c0ixa = this.mLogger;
        if (c0ixa != null) {
            c0ixa.LJI = z;
        }
        this.mPullStreamParallel = z;
    }

    @Override // X.C0IEB
    public void setRenderRotation(C0IIZ c0iiz) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.f0(c0iiz, false);
        }
    }

    @Override // X.C0IEB
    public void setScreenOrientation(boolean z) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.setScreenOrientation(z);
        }
    }

    @Override // X.C0IEB
    public boolean start(boolean z) {
        InterfaceC480510Isr interfaceC480510Isr;
        if (TestDisablePullStreamSetting.INSTANCE.getValue()) {
            C827750WdZ.LIZ("RoomPlayer2", "block pull stream -> it only valid for offline packages");
            return true;
        }
        if (this.mConfig != null && this.mLivePlayController == null) {
            if (this.multiPlayer && this.isReusePlayer && !C2093608Ic.LJ(this.reusePlayerTag)) {
                ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LJI(this.reusePlayerTag, this.mPlayerTag);
            }
            InterfaceC480510Isr interfaceC480510IsrLIZJ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZJ(this.mPlayerTag, true);
            this.mLivePlayController = interfaceC480510IsrLIZJ;
            if (interfaceC480510IsrLIZJ != null) {
                interfaceC480510IsrLIZJ.x0(this.roomId);
            }
            if (z && (interfaceC480510Isr = this.mLivePlayController) != null) {
                interfaceC480510Isr.LJJLIIIJLLLLLLLZ();
            }
            this.mLivePlayController.g0(new C480620It2(((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).JE(), this));
            InterfaceC480510Isr interfaceC480510Isr2 = this.mLivePlayController;
            this.mConfig.getClass();
            interfaceC480510Isr2.setSeiOpen(true);
            this.mLivePlayController.C0(this.mConfig.LJI);
            this.mAudioFocusController = new C480540Isu(this.mLivePlayController);
            return doStart();
        }
        C0IX5.LJIJ(1, C0IX5.LJIILLIIL(Long.valueOf(this.roomId)));
        reusePlayerAndBgOptRecordFirstFrame();
        return true;
    }

    @Override // X.C0IEB
    public void startPreIo(long j) {
        InterfaceC480510Isr interfaceC480510IsrLIZJ;
        if (j > 0 && this.mConfig != null) {
            if (LivePredictSlideOrExitExp.isEnablePreIoSceneGate() && this.isBackground) {
                return;
            }
            String str = this.mConfig.LIZ;
            if (!TextUtils.isEmpty(str) && (interfaceC480510IsrLIZJ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZJ(this.mPlayerTag, false)) != null) {
                interfaceC480510IsrLIZJ.LJJIJIL(j, str);
            }
        }
    }

    @Override // X.C0IEB
    public void stop(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop -> playerTag=");
        sbLIZ.append(this.mPlayerTag);
        sbLIZ.append(", needRelease: ");
        sbLIZ.append(z);
        C827750WdZ.LIZ("RoomPlayer2", C2188811AlT.LIZIZ(sbLIZ));
        String str = this.mPlayerTag;
        if (str == null) {
            return;
        }
        C480540Isu c480540Isu = this.mAudioFocusController;
        if (c480540Isu != null) {
            if (z) {
                c480540Isu.LIZIZ(null, str, true);
                C480530Ist c480530Ist = c480540Isu.LIZIZ;
                HashSet hashSet = (HashSet) C480710ItB.LIZJ;
                hashSet.remove(c480530Ist);
                if (hashSet.isEmpty()) {
                    try {
                        C480710ItB.LIZ.abandonAudioFocus(C480710ItB.LIZIZ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJIIL("AudioFocusUtil", "returnFocus error");
                    }
                }
                try {
                    C480710ItB.LIZ.abandonAudioFocus(C480710ItB.LIZIZ);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C20441214yg.LJIIL("AudioFocusUtil", "returnFocus error");
                }
            } else {
                C480530Ist c480530Ist2 = c480540Isu.LIZIZ;
                HashSet hashSet2 = (HashSet) C480710ItB.LIZJ;
                hashSet2.remove(c480530Ist2);
                if (hashSet2.isEmpty()) {
                    try {
                        C480710ItB.LIZ.abandonAudioFocus(C480710ItB.LIZIZ);
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        C20441214yg.LJIIL("AudioFocusUtil", "returnFocus error");
                    }
                }
            }
            this.mAudioFocusController = null;
        }
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.A0(this.mPlayerTag);
            if (z) {
                this.mLivePlayController.LJIJ(this.mPlayerTag);
            }
            this.mLivePlayController = null;
        }
        this.mDecodeStatus = 0;
        this.mMediaErrorMessage = null;
        this.mStopOnPlayingOther = false;
        this.mMainHandler.removeCallbacks(this.mPendingMessageRunnable);
        if (LinkMicRoomPlayerSeiOptSetting.INSTANCE.isEnable()) {
            this.lastFullyLinkMicSeiData = null;
        }
    }

    @Override // X.C0IEB
    public int stopAuxAudioDucking(int i) {
        if (this.mLivePlayController != null) {
            C20441214yg.LJIIIZ("MatchAICommentary", "Roomplayer2 stopAuxAudioDucking");
            return this.mLivePlayController.stopAuxAudioDucking(i);
        }
        C20441214yg.LJIIIZ("MatchAICommentary", "Roomplayer2 mLivePlayController = null when stopAuxAudioDucking");
        return -100;
    }

    @Override // X.C0IEB
    public void switchNextPullStream(String str) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.switchNextPullStream(str);
        }
    }

    @Override // X.C0IEB
    public void switchResolution(String str) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.switchResolution(str);
        }
    }

    @Override // X.C0IEB
    public void unRegisterMuteFilter(C1APY c1apy) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.unRegisterMuteFilter(c1apy);
        }
    }

    @Override // X.C0IEB
    public void bindSurface(C0IF5 c0if5, String str) {
        InterfaceC480510Isr interfaceC480510IsrLIZJ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZJ(this.mPlayerTag, LivePlayerCreateLogicOptExp.isForbidCreate());
        if (interfaceC480510IsrLIZJ != null) {
            interfaceC480510IsrLIZJ.y0(c0if5, str);
        }
    }

    @Override // X.C0IEB
    public void initialize(C0IMA c0ima, C465140ILw c465140ILw) {
        this.roomId = C0IM9.LIZ(c0ima);
        String str = c0ima.LIZJ;
        if (str == null) {
            str = "";
        }
        this.logId = str;
        this.supportLowLatency = c0ima.LIZLLL;
        this.mConfig = c465140ILw;
        if (this.isPreparePlayer) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prepare_");
            sbLIZ.append(this.roomId);
            sbLIZ.append("_");
            sbLIZ.append(SystemClock.uptimeMillis());
            this.mPlayerTag = C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.roomId);
        sbLIZ2.append("_");
        sbLIZ2.append(SystemClock.uptimeMillis());
        this.mPlayerTag = C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.C0IEB
    public void preparePlayerWithConfig(C0IM2 c0im2, boolean z) {
        InterfaceC480510Isr interfaceC480510IsrLIZJ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZJ(this.mPlayerTag, true);
        if (z) {
            C786410Ut5.N3(c0im2.LJII);
            C465140ILw c465140ILw = new C465140ILw();
            String str = c0im2.LJI;
            c465140ILw.LIZ = str;
            if (!TextUtils.isEmpty(str)) {
                c465140ILw.LJII = 1;
            }
            c465140ILw.LIZIZ = c0im2.LJFF;
            c465140ILw.LIZJ = "";
            if (c465140ILw.LJII == 0 && !TextUtils.isEmpty("")) {
                c465140ILw.LJII = 2;
            }
            c465140ILw.LIZLLL = "";
            c465140ILw.LJ = c0im2.LIZLLL;
            c465140ILw.LJFF = c0im2.LJ;
            c465140ILw.LJI = 0L;
            this.mConfig = c465140ILw;
            this.roomId = c0im2.LJIIIZ;
            interfaceC480510IsrLIZJ.stop(this.mPlayerTag);
        } else if (interfaceC480510IsrLIZJ == null) {
            return;
        }
        interfaceC480510IsrLIZJ.LJJII(new C1699360uK6(c0im2.LIZJ, c0im2.LIZIZ, c0im2.LIZ, this.enterMethodSubtag, false, false));
        C0IMA c0ima = new C0IMA(UUID.randomUUID().toString(), Long.valueOf(this.roomId), this.supportLowLatency, "");
        C465140ILw c465140ILw2 = this.mConfig;
        interfaceC480510IsrLIZJ.LJJJI(c465140ILw2.LIZ, c465140ILw2.LIZIZ, this.mPlayerTag, c0ima);
    }

    @Override // X.C0IEB
    public void setEnterMethodSubtag(String str, boolean z) {
        try {
            String str2 = this.enterMethodSubtag;
            this.enterMethodSubtag = str;
            if (z && this.mLivePlayController != null) {
                if (str2 == null) {
                    if (str == null) {
                        return;
                    }
                } else if (str != null && str2.equals(str)) {
                    return;
                }
                this.mLivePlayController.LJJI(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setEnterMethodSubtag ");
            sbLIZ.append(th);
            C20441214yg.LJ("RoomPlayer2", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.C0IEB
    public void setMute(boolean z, String str) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.t0(this.mPlayerTag, str, z);
        }
    }

    @Override // X.C0IEB
    public void setMuteNew(boolean z, String str) {
        setMute(z, str);
    }

    @Override // X.C0IEB
    public int startAuxAudioDucking(C1300320jwU c1300320jwU, InterfaceC1699390uK9 interfaceC1699390uK9) {
        if (this.mLivePlayController != null) {
            C20441214yg.LJIIIZ("MatchAICommentary", "Roomplayer2 startAuxAudioDucking");
            return this.mLivePlayController.startAuxAudioDucking(c1300320jwU, interfaceC1699390uK9);
        }
        C20441214yg.LJIIIZ("MatchAICommentary", "Roomplayer2 mLivePlayController = null when startAuxAudioDucking");
        return -100;
    }

    @Override // X.C0IEB
    public void switchResolution(String str, InterfaceC1699420uKC interfaceC1699420uKC) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            if (interfaceC1699420uKC != null) {
                interfaceC480510Isr.switchResolution(str, interfaceC1699420uKC);
            } else {
                interfaceC480510Isr.switchResolution(str);
            }
        }
    }

    public void tryCacheFullyLinkMicSeiAppData(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
        if (LinkMicRoomPlayerSeiOptSetting.INSTANCE.isEnable() && enumC1913550ztZ == EnumC1913550ztZ.INTERACT_SEI) {
            SystemClock.currentThreadTimeMillis();
            if (obj instanceof C945320ahu) {
                C945320ahu c945320ahu = (C945320ahu) obj;
                if (isFullyLinkMicSeiAppData(c945320ahu.LIZIZ)) {
                    this.lastFullyLinkMicSeiData = c945320ahu;
                    return;
                }
                return;
            }
            if (!(obj instanceof String)) {
                return;
            }
            String str = (String) obj;
            if (!isFullyLinkMicSeiAppData(str)) {
                return;
            }
            this.lastFullyLinkMicSeiData = new C945320ahu(null, str);
        }
    }

    @Override // X.C0IEB
    public int writeAuxAudioDuckingPCM(byte[] bArr, int i) {
        if (this.mLivePlayController != null) {
            C20441214yg.LJIIIZ("MatchAICommentary", "Roomplayer2 writeAuxAudioDuckingPCM");
            return this.mLivePlayController.writeAuxAudioDuckingPCM(bArr, i);
        }
        C20441214yg.LJIIIZ("MatchAICommentary", "Roomplayer2 mLivePlayController = null when writeAuxAudioDuckingPCM");
        return -100;
    }

    public RoomPlayer2(C0IMA c0ima, C465140ILw c465140ILw, boolean z) {
        this.mPendingCallbacks = new ArrayList();
        this.mHasAttached = false;
        this.mHasWarmedUp = false;
        this.mPullStreamParallel = false;
        this.isReusePlayer = false;
        this.isReusePlayerWithFirstFrame = false;
        this.audioCurrentStatusStore = -100;
        this.enableSeiFilter = false;
        this.mMainHandler = new BPEAHandler(Looper.getMainLooper());
        this.mPendingMessageRunnable = new ARunnableS107S0100000_7(this, 27);
        this.mLogger = new C0IXA();
        this.entranceParam = null;
        this.reusePlayerTag = null;
        this.multiPlayer = LiveMultiPlayerEnableSetting.INSTANCE.getValue();
        this.isSmoothEnter = false;
        this.hasLogPrePlayerHitCache = false;
        this.logId = "";
        this.mPlayMessageListener = new InterfaceC485640J2s() { // from class: X.0Isq
            @Override // X.InterfaceC480650It5
            public final boolean LLILLIZIL() {
                return true;
            }

            @Override // X.InterfaceC485640J2s
            public final void LLLLLLIL() {
                this.LL.mLogger.LJI(Long.valueOf(System.currentTimeMillis()), "sdk_player_first_frame");
            }

            @Override // X.InterfaceC485640J2s
            public final void o() {
                this.LL.mLogger.LJI(Long.valueOf(System.currentTimeMillis()), "sdk_player_start");
            }

            @Override // X.InterfaceC480650It5
            public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) throws JSONException {
                long jU0;
                RoomPlayer2 roomPlayer2 = this.LL;
                if (roomPlayer2.mAudioFocusController != null && roomPlayer2.mLivePlayController != null) {
                    InterfaceC480570Isx callback = roomPlayer2.getCallback();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPlayerMessage -> message is ");
                    sbLIZ.append(enumC1913550ztZ.name());
                    C827750WdZ.LIZ("RoomPlayer2", C2188811AlT.LIZIZ(sbLIZ));
                    if (callback == null) {
                        this.LL.tryCacheFullyLinkMicSeiAppData(enumC1913550ztZ, obj);
                        RoomPlayer2 roomPlayer22 = this.LL;
                        if (!roomPlayer22.mHasAttached) {
                            for (C480610It1 c480610It1 : roomPlayer22.mPendingCallbacks) {
                                if (c480610It1.LIZ == enumC1913550ztZ) {
                                    c480610It1.LIZIZ = obj;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("onPlayerMessage -> replace pending message: ");
                                    sbLIZ2.append(enumC1913550ztZ.toString());
                                    C827750WdZ.LIZ("RoomPlayer2", C2188811AlT.LIZIZ(sbLIZ2));
                                    return;
                                }
                            }
                            if (enumC1913550ztZ == EnumC1913550ztZ.DISPLAYED_PLAY) {
                                ListProtector.add(this.LL.mPendingCallbacks, 0, new C480610It1(enumC1913550ztZ, obj));
                            } else {
                                this.LL.mPendingCallbacks.add(new C480610It1(enumC1913550ztZ, obj));
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("onPlayerMessage -> add pending message: ");
                            sbLIZ3.append(enumC1913550ztZ.name());
                            C827750WdZ.LIZ("RoomPlayer2", C2188811AlT.LIZIZ(sbLIZ3));
                        }
                        return;
                    }
                    switch (C1913540ztY.LIZ[enumC1913550ztZ.ordinal()]) {
                        case 1:
                            callback.LJIIIIZZ();
                            break;
                        case 2:
                            callback.LJJLIIIJ();
                            break;
                        case 3:
                            callback.LJJLIIIJ();
                            if (obj != null) {
                                this.LL.mMediaErrorMessage = obj.toString();
                            }
                            RoomPlayer2 roomPlayer23 = this.LL;
                            if (roomPlayer23.mDecodeStatus != 1) {
                                roomPlayer23.mDecodeStatus = 2;
                                callback.LJIIIZ(EnumC1913550ztZ.MEDIA_ERROR.ordinal(), this.LL.mMediaErrorMessage);
                            }
                            break;
                        case 4:
                            RoomPlayer2 roomPlayer24 = this.LL;
                            roomPlayer24.mDecodeStatus = 1;
                            if (!roomPlayer24.isBackground) {
                                if (!roomPlayer24.multiPlayer) {
                                    roomPlayer24.mAudioFocusController.LIZJ(roomPlayer24.getTagContext(), this.LL.mPlayerTag);
                                } else {
                                    InterfaceC480510Isr interfaceC480510Isr = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ;
                                    RoomPlayer2 roomPlayer25 = this.LL;
                                    if (interfaceC480510Isr == roomPlayer25.mLivePlayController) {
                                        roomPlayer25.mAudioFocusController.LIZJ(roomPlayer25.getTagContext(), this.LL.mPlayerTag);
                                    }
                                }
                            }
                            InterfaceC480510Isr interfaceC480510Isr2 = this.LL.mLivePlayController;
                            if (interfaceC480510Isr2 == null) {
                                jU0 = 0;
                            } else {
                                jU0 = interfaceC480510Isr2.u0();
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jU0 > 0) {
                                long jLJFF = this.LL.mLogger.LJFF("sdk_player_first_frame");
                                if (jLJFF > 0) {
                                    jU0 = Math.max(jU0, jLJFF);
                                }
                                this.LL.mLogger.LJI(Long.valueOf(jU0), "first_frame");
                                jCurrentTimeMillis = jU0;
                            } else {
                                C0IXA c0ixa = this.LL.mLogger;
                                if (!((ConcurrentHashMap) c0ixa.LIZIZ).containsKey("first_frame")) {
                                    c0ixa.LJI(Long.valueOf(System.currentTimeMillis()), "first_frame");
                                }
                            }
                            InterfaceC467750IVx interfaceC467750IVx = this.LL.liveRoomLogger;
                            if (interfaceC467750IVx != null) {
                                ((C467650IVn) interfaceC467750IVx).LJJIJIIJI(jCurrentTimeMillis, C0IWV.DISPLAYED_PLAY);
                            }
                            callback.LIZJ(this.LL.mLogger.LIZLLL(), this.LL.mLogger.LJ());
                            RoomPlayer2 roomPlayer26 = this.LL;
                            roomPlayer26.mLogger.LJIIIIZZ(C0IX5.LJIILLIIL(Long.valueOf(roomPlayer26.roomId)));
                            C20441214yg.LJIIIZ("RoomPlayer2", "DISPLAYED_PLAY");
                            break;
                        case 5:
                            RoomPlayer2 roomPlayer27 = this.LL;
                            roomPlayer27.mStopOnPlayingOther = true;
                            C480540Isu c480540Isu = roomPlayer27.mAudioFocusController;
                            c480540Isu.LIZIZ(null, roomPlayer27.mPlayerTag, true);
                            C480530Ist c480530Ist = c480540Isu.LIZIZ;
                            HashSet hashSet = (HashSet) C480710ItB.LIZJ;
                            hashSet.remove(c480530Ist);
                            if (hashSet.isEmpty()) {
                                try {
                                    C480710ItB.LIZ.abandonAudioFocus(C480710ItB.LIZIZ);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C20441214yg.LJIIL("AudioFocusUtil", "returnFocus error");
                                }
                            }
                            try {
                                C480710ItB.LIZ.abandonAudioFocus(C480710ItB.LIZIZ);
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                C20441214yg.LJIIL("AudioFocusUtil", "returnFocus error");
                                return;
                            }
                            break;
                        case 6:
                            this.LL.mStopOnPlayingOther = true;
                            break;
                        case 7:
                            SystemClock.currentThreadTimeMillis();
                            if (obj instanceof C945320ahu) {
                                callback.LIZIZ((C945320ahu) obj);
                            } else if (obj instanceof String) {
                                callback.LIZIZ(new C945320ahu(null, (String) obj));
                            }
                            break;
                        case 8:
                            callback.LJI();
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            callback.LIZLLL();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            int i = CastIntegerProtector.parseInt((String) obj);
                            callback.onVideoSizeChanged(65535 & i, i >> 16);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            callback.LJII();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            callback.LJIIJJI();
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            if (obj != null) {
                                callback.LJIILJJIL(obj.toString());
                            }
                            break;
                        case 14:
                            if (obj != null) {
                                callback.LJIIJ(obj.toString());
                            }
                            break;
                        case 15:
                            callback.LLLIL();
                            break;
                        case 16:
                            callback.LLZZLLIL((C1281010jRL) obj);
                            break;
                    }
                }
            }
        };
        this.pendingAction = null;
        this.isPreparePlayer = z;
        initialize(c0ima, c465140ILw);
    }

    @Override // X.C0IEB
    public void changeLowLatencyMode(boolean z, String str, String str2) {
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.changeLowLatencyMode(z);
            if (!TextUtils.isEmpty(str)) {
                this.mLivePlayController.LJIIL(str, str2);
            }
        }
    }

    @Override // X.C0IEB
    public void setReusePlayer(boolean z, String str, boolean z2) {
        this.isReusePlayer = z;
        this.reusePlayerTag = str;
        this.isSmoothEnter = z2;
    }

    public RoomPlayer2(C0IMA c0ima, C465140ILw c465140ILw, InterfaceC463820IGu interfaceC463820IGu, InterfaceC480570Isx interfaceC480570Isx) {
        this.mPendingCallbacks = new ArrayList();
        this.mHasAttached = false;
        this.mHasWarmedUp = false;
        this.mPullStreamParallel = false;
        this.isReusePlayer = false;
        this.isReusePlayerWithFirstFrame = false;
        this.audioCurrentStatusStore = -100;
        this.enableSeiFilter = false;
        this.mMainHandler = new BPEAHandler(Looper.getMainLooper());
        this.mPendingMessageRunnable = new ARunnableS107S0100000_7(this, 27);
        this.mLogger = new C0IXA();
        this.entranceParam = null;
        this.reusePlayerTag = null;
        this.multiPlayer = LiveMultiPlayerEnableSetting.INSTANCE.getValue();
        this.isSmoothEnter = false;
        this.isPreparePlayer = false;
        this.hasLogPrePlayerHitCache = false;
        this.logId = "";
        this.mPlayMessageListener = new InterfaceC485640J2s() { // from class: X.0Isq
            @Override // X.InterfaceC480650It5
            public final boolean LLILLIZIL() {
                return true;
            }

            @Override // X.InterfaceC485640J2s
            public final void LLLLLLIL() {
                this.LL.mLogger.LJI(Long.valueOf(System.currentTimeMillis()), "sdk_player_first_frame");
            }

            @Override // X.InterfaceC485640J2s
            public final void o() {
                this.LL.mLogger.LJI(Long.valueOf(System.currentTimeMillis()), "sdk_player_start");
            }

            @Override // X.InterfaceC480650It5
            public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) throws JSONException {
                long jU0;
                RoomPlayer2 roomPlayer2 = this.LL;
                if (roomPlayer2.mAudioFocusController != null && roomPlayer2.mLivePlayController != null) {
                    InterfaceC480570Isx callback = roomPlayer2.getCallback();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPlayerMessage -> message is ");
                    sbLIZ.append(enumC1913550ztZ.name());
                    C827750WdZ.LIZ("RoomPlayer2", C2188811AlT.LIZIZ(sbLIZ));
                    if (callback == null) {
                        this.LL.tryCacheFullyLinkMicSeiAppData(enumC1913550ztZ, obj);
                        RoomPlayer2 roomPlayer22 = this.LL;
                        if (!roomPlayer22.mHasAttached) {
                            for (C480610It1 c480610It1 : roomPlayer22.mPendingCallbacks) {
                                if (c480610It1.LIZ == enumC1913550ztZ) {
                                    c480610It1.LIZIZ = obj;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("onPlayerMessage -> replace pending message: ");
                                    sbLIZ2.append(enumC1913550ztZ.toString());
                                    C827750WdZ.LIZ("RoomPlayer2", C2188811AlT.LIZIZ(sbLIZ2));
                                    return;
                                }
                            }
                            if (enumC1913550ztZ == EnumC1913550ztZ.DISPLAYED_PLAY) {
                                ListProtector.add(this.LL.mPendingCallbacks, 0, new C480610It1(enumC1913550ztZ, obj));
                            } else {
                                this.LL.mPendingCallbacks.add(new C480610It1(enumC1913550ztZ, obj));
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("onPlayerMessage -> add pending message: ");
                            sbLIZ3.append(enumC1913550ztZ.name());
                            C827750WdZ.LIZ("RoomPlayer2", C2188811AlT.LIZIZ(sbLIZ3));
                        }
                        return;
                    }
                    switch (C1913540ztY.LIZ[enumC1913550ztZ.ordinal()]) {
                        case 1:
                            callback.LJIIIIZZ();
                            break;
                        case 2:
                            callback.LJJLIIIJ();
                            break;
                        case 3:
                            callback.LJJLIIIJ();
                            if (obj != null) {
                                this.LL.mMediaErrorMessage = obj.toString();
                            }
                            RoomPlayer2 roomPlayer23 = this.LL;
                            if (roomPlayer23.mDecodeStatus != 1) {
                                roomPlayer23.mDecodeStatus = 2;
                                callback.LJIIIZ(EnumC1913550ztZ.MEDIA_ERROR.ordinal(), this.LL.mMediaErrorMessage);
                            }
                            break;
                        case 4:
                            RoomPlayer2 roomPlayer24 = this.LL;
                            roomPlayer24.mDecodeStatus = 1;
                            if (!roomPlayer24.isBackground) {
                                if (!roomPlayer24.multiPlayer) {
                                    roomPlayer24.mAudioFocusController.LIZJ(roomPlayer24.getTagContext(), this.LL.mPlayerTag);
                                } else {
                                    InterfaceC480510Isr interfaceC480510Isr = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ;
                                    RoomPlayer2 roomPlayer25 = this.LL;
                                    if (interfaceC480510Isr == roomPlayer25.mLivePlayController) {
                                        roomPlayer25.mAudioFocusController.LIZJ(roomPlayer25.getTagContext(), this.LL.mPlayerTag);
                                    }
                                }
                            }
                            InterfaceC480510Isr interfaceC480510Isr2 = this.LL.mLivePlayController;
                            if (interfaceC480510Isr2 == null) {
                                jU0 = 0;
                            } else {
                                jU0 = interfaceC480510Isr2.u0();
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jU0 > 0) {
                                long jLJFF = this.LL.mLogger.LJFF("sdk_player_first_frame");
                                if (jLJFF > 0) {
                                    jU0 = Math.max(jU0, jLJFF);
                                }
                                this.LL.mLogger.LJI(Long.valueOf(jU0), "first_frame");
                                jCurrentTimeMillis = jU0;
                            } else {
                                C0IXA c0ixa = this.LL.mLogger;
                                if (!((ConcurrentHashMap) c0ixa.LIZIZ).containsKey("first_frame")) {
                                    c0ixa.LJI(Long.valueOf(System.currentTimeMillis()), "first_frame");
                                }
                            }
                            InterfaceC467750IVx interfaceC467750IVx = this.LL.liveRoomLogger;
                            if (interfaceC467750IVx != null) {
                                ((C467650IVn) interfaceC467750IVx).LJJIJIIJI(jCurrentTimeMillis, C0IWV.DISPLAYED_PLAY);
                            }
                            callback.LIZJ(this.LL.mLogger.LIZLLL(), this.LL.mLogger.LJ());
                            RoomPlayer2 roomPlayer26 = this.LL;
                            roomPlayer26.mLogger.LJIIIIZZ(C0IX5.LJIILLIIL(Long.valueOf(roomPlayer26.roomId)));
                            C20441214yg.LJIIIZ("RoomPlayer2", "DISPLAYED_PLAY");
                            break;
                        case 5:
                            RoomPlayer2 roomPlayer27 = this.LL;
                            roomPlayer27.mStopOnPlayingOther = true;
                            C480540Isu c480540Isu = roomPlayer27.mAudioFocusController;
                            c480540Isu.LIZIZ(null, roomPlayer27.mPlayerTag, true);
                            C480530Ist c480530Ist = c480540Isu.LIZIZ;
                            HashSet hashSet = (HashSet) C480710ItB.LIZJ;
                            hashSet.remove(c480530Ist);
                            if (hashSet.isEmpty()) {
                                try {
                                    C480710ItB.LIZ.abandonAudioFocus(C480710ItB.LIZIZ);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C20441214yg.LJIIL("AudioFocusUtil", "returnFocus error");
                                }
                            }
                            try {
                                C480710ItB.LIZ.abandonAudioFocus(C480710ItB.LIZIZ);
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                C20441214yg.LJIIL("AudioFocusUtil", "returnFocus error");
                                return;
                            }
                            break;
                        case 6:
                            this.LL.mStopOnPlayingOther = true;
                            break;
                        case 7:
                            SystemClock.currentThreadTimeMillis();
                            if (obj instanceof C945320ahu) {
                                callback.LIZIZ((C945320ahu) obj);
                            } else if (obj instanceof String) {
                                callback.LIZIZ(new C945320ahu(null, (String) obj));
                            }
                            break;
                        case 8:
                            callback.LJI();
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            callback.LIZLLL();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            int i = CastIntegerProtector.parseInt((String) obj);
                            callback.onVideoSizeChanged(65535 & i, i >> 16);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            callback.LJII();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            callback.LJIIJJI();
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            if (obj != null) {
                                callback.LJIILJJIL(obj.toString());
                            }
                            break;
                        case 14:
                            if (obj != null) {
                                callback.LJIIJ(obj.toString());
                            }
                            break;
                        case 15:
                            callback.LLLIL();
                            break;
                        case 16:
                            callback.LLZZLLIL((C1281010jRL) obj);
                            break;
                    }
                }
            }
        };
        this.pendingAction = null;
        initialize(c0ima, c465140ILw);
        this.mRenderViewRef = new WeakReference<>(interfaceC463820IGu);
        this.mCallbackRef = new WeakReference<>(interfaceC480570Isx);
    }

    @Override // X.C0IEB
    public void attach(Context context, InterfaceC463820IGu interfaceC463820IGu, InterfaceC480570Isx interfaceC480570Isx, boolean z) {
        this.mTagContextRef = new WeakReference<>(context);
        this.mCallbackRef = new WeakReference<>(interfaceC480570Isx);
        this.mRenderViewRef = new WeakReference<>(interfaceC463820IGu);
        if (LinkMicRoomPlayerSeiOptSetting.INSTANCE.isEnable() && interfaceC480570Isx != null) {
            interfaceC480570Isx.LJ(getLastFullyLinkMicSeiData());
            this.lastFullyLinkMicSeiData = null;
        }
        InterfaceC480510Isr interfaceC480510Isr = this.mLivePlayController;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.y0(interfaceC463820IGu, this.mPlayerTag);
        }
        C480540Isu c480540Isu = this.mAudioFocusController;
        if (c480540Isu != null) {
            c480540Isu.LIZJ(context, this.mPlayerTag);
        }
        boolean z2 = true;
        this.mHasAttached = true;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z2 = false;
        }
        if (interfaceC480570Isx != null) {
            if (this.isReusePlayer) {
                if (z2 && z && LiveEnterRoomSuccessMsgOptExp.INSTANCE.enableDirectFirstFrameMsgOnAttachConditional() && hasPendingFirstFrameMsg()) {
                    this.mPendingMessageRunnable.run();
                    return;
                } else {
                    C786410Ut5.LJL(this.mMainHandler, this.mPendingMessageRunnable);
                    return;
                }
            }
            if (z2 && z && LiveEnterRoomSuccessMsgOptExp.INSTANCE.enableDirectFirstFrameMsgOnAttachConditional() && hasPendingFirstFrameMsg()) {
                this.mPendingMessageRunnable.run();
            } else {
                C786410Ut5.LJJZZIII(this.mMainHandler, this.mPendingMessageRunnable);
            }
        }
    }
}
