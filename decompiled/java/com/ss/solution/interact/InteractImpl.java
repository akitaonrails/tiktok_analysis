package com.ss.solution.interact;

import X.C2188811AlT;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.librarian.Librarian;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.avframework.livestreamv2.core.interact.DisposableParams;
import com.ss.bytertc.engine.loader.LyraxPluginConfig;
import com.ss.lyrax.engine.LyraxEngineOption;
import com.ss.lyrax.stream.LyraxForwardStreamInfo;
import com.ss.lyrax.transcoder.LyraxTranscoderLayoutRegionConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderServerControlConfig;
import com.ss.lyrax.transcoder.MixStreamCommonConfig;
import com.ss.lyrax.transcoder.MixStreamVideoConfig;
import com.ss.lyrax.utils.LyraxNativeCleaner;
import com.ss.lyrax.utils.loader.LyraxNativeLibraryLoader;
import com.ss.lyrax.utils.loader.LyraxNativeLibraryLoaderAdapter;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxVideoEncoderConfig;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class InteractImpl implements IInteract {
    public static volatile boolean mLibraryLoaded;
    public final long handle;

    private native int nativeAdjustPlaybackSignalVolume(long j, int i);

    private native int nativeAdjustRecordingSignalVolume(long j, int i);

    private native int nativeApplyMixStream(long j, DisposableParams disposableParams);

    public static native long nativeCreate(InteractCoreOption interactCoreOption, LyraxEngineOption lyraxEngineOption);

    private native AuxStreamInfo nativeCreateAuxStream(long j, String str);

    private native void nativeDestroy(long j);

    private native int nativeDisableAudio(long j);

    private native void nativeDisableDownlinkAudioSelection(long j);

    private native int nativeEnableAudio(long j);

    private native int nativeEnableAudioVolumeIndication(long j, int i, int i2);

    private native void nativeEnableDownlinkAudioSelection(long j, int i);

    public static native boolean nativeEquals(long j, long j2);

    private native String nativeGetBusinessId(long j);

    public static native long nativeGetDestroy();

    private native String nativeGetLivePusherTaskId(long j);

    public static native String nativeGetSDKDeviceID();

    public static native String nativeGetSDKVersion();

    private native int nativeInitialize(long j);

    private native boolean nativeIsJoined(long j);

    private native int nativeJoinChannel(long j);

    private native int nativeLeaveChannel(long j);

    private native int nativeMuteAllRemoteAudioStreams(long j, boolean z);

    private native int nativeMuteAllRemoteVideoStreams(long j, boolean z);

    private native int nativeMuteAuxStreamAudio(long j, String str, boolean z);

    private native int nativeMuteLocalAudioStream(long j, boolean z);

    private native int nativeMuteLocalVideoStream(long j, boolean z);

    private native int nativeMuteRemoteAudioStream(long j, String str, boolean z);

    private native int nativeMuteRemoteVideoStream(long j, String str, boolean z);

    private native void nativeParseSDKParams(long j, String str);

    private native void nativePublishBlackFrameIfNeeded(long j);

    private native int nativePublishVideoStream(long j, boolean z);

    private native void nativeRecoverVideoStreamStatus(long j);

    private native void nativeRemoveVideoRenderer(long j, String str);

    private native void nativeReportAPICall(long j, String str, String str2);

    private native int nativeResetVideoPerformanceConfig(long j);

    private native int nativeSendRoomBinaryMessage(long j, byte[] bArr);

    private native int nativeSendRoomMessage(long j, String str);

    private native int nativeSendSEIV1(long j, String str, int i, boolean z);

    private native int nativeSendSEIV1Bytes(long j, byte[] bArr, int i, boolean z);

    private native int nativeSendSEIV2(long j, String str, int i, boolean z, boolean z2);

    private native long nativeSendUserMessage(long j, String str, String str2);

    private native int nativeSetAuxStreamRenderView(long j, String str, Object obj);

    private native void nativeSetBizSessionId(long j, String str);

    private native int nativeSetBusinessId(long j, String str);

    private native int nativeSetBusinessLabel(long j, String str);

    private native int nativeSetDefaultMuteAllRemoteAudioStreams(long j, boolean z);

    private native int nativeSetDefaultMuteAllRemoteVideoStreams(long j, boolean z);

    private native int nativeSetDownLinkAudioSelectionPriority(long j, int i, int i2);

    private native int nativeSetEnableSpeakerphone(long j, boolean z);

    private native int nativeSetGroupChannelId(long j, String str);

    private native void nativeSetInteractParams(long j, int i, boolean z);

    private native void nativeSetLinkMicType(long j, int i);

    private native void nativeSetLinkmicStateForAnchorNet(long j);

    private native int nativeSetMixStreamAppDataSEI(long j, String str);

    private native int nativeSetMixStreamRegions(long j, LyraxTranscoderLayoutRegionConfig[] lyraxTranscoderLayoutRegionConfigArr);

    private native void nativeSetNativeListener(long j, IInteractNativeListener iInteractNativeListener);

    private native void nativeSetPlaybackVolume(long j, int i);

    private native void nativeSetRemoteAudioPlaybackVolume(long j, String str, int i);

    private native int nativeSetRemoteRoomAudioPlaybackVolume(long j, int i);

    private native void nativeSetRemoteSessionNeedRender(long j, boolean z);

    private native void nativeSetRemoteVideoRenderTargetView(long j, String str, View view);

    private native void nativeSetRtcScene(long j, int i);

    private native int nativeSetRtcVideoSize(long j, int i, int i2, int i3, int i4);

    private native int nativeSetSEICurrentShiftDiffTimeMs(long j, long j2);

    private native int nativeSetVideoEncoderConfig(long j, int i, LyraxVideoEncoderConfig lyraxVideoEncoderConfig);

    private native int nativeSetVideoPerformanceConfig(long j, int i, int i2, int i3, int i4);

    private native int nativeSetVideoSource(long j, ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper);

    private native int nativeStartAuxStream(long j, String str);

    private native int nativeStartForwardStreamToRooms(long j, List<LyraxForwardStreamInfo> list);

    private native int nativeStartMixStream(long j);

    private native int nativeStopAuxStream(long j, String str);

    private native int nativeStopForwardStreamToRooms(long j);

    private native int nativeStopMixStream(long j);

    private native int nativeSubscribeAuxStream(long j, String str);

    private native int nativeSubscribeAuxStreamWithMediaType(long j, String str, boolean z, boolean z2);

    private native void nativeSubscribeRemoteStream(long j, int i, int i2);

    private native int nativeUnsubscribeAuxStream(long j, String str);

    private native int nativeUpdateAuthInfo(long j, String str);

    private native int nativeUpdateAuxStreamEncodeConfig(long j, String str, int i, int i2, int i3, int i4, int i5, int i6);

    private native int nativeUpdateAuxStreamSourceConfig(long j, String str, Object obj);

    private native ChannelBaseApplyResult nativeUpdateChannelBaseConfiguration(long j, String str, String str2);

    private native int nativeUpdateForwardStreamToRooms(long j, List<LyraxForwardStreamInfo> list);

    private native void nativeUpdateInteractVideoSourceType(long j, int i);

    private native int nativeUpdateMixStreamAuthInfo(long j, String str);

    private native int nativeUpdateMixStreamCommonConfig(long j, MixStreamCommonConfig mixStreamCommonConfig);

    private native int nativeUpdateMixStreamVideoConfig(long j, MixStreamVideoConfig mixStreamVideoConfig);

    private native void nativeUpdateRtcExtInfo(long j, String str);

    private native int nativeUpdateServerControlConfig(long j, LyraxTranscoderServerControlConfig lyraxTranscoderServerControlConfig);

    private native void nativeUpdateSingleViewModeFlag(long j, boolean z);

    private native boolean nativeVideoStreamPublished(long j);

    public int createOutStreamExtraFilter(String str) {
        return 0;
    }

    public int releaseOutStreamExtraFilter(String str) {
        return 0;
    }

    public void setAudioScene(int i) {
    }

    public void destroy() {
        nativeDestroy(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public int disableAudio() {
        return nativeDisableAudio(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public void disableDownlinkAudioSelection() {
        nativeDisableDownlinkAudioSelection(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public int enableAudio() {
        return nativeEnableAudio(this.handle);
    }

    public void finalize() throws Throwable {
        try {
            if (Build.VERSION.SDK_INT < 33) {
                LyraxNativeCleaner.nativeApplyFreeFunction(nativeGetDestroy(), this.handle);
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    @Override // com.ss.solution.interact.IInteract
    public String getBusinessId() {
        return nativeGetBusinessId(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public String getLivePusherTaskId() {
        return nativeGetLivePusherTaskId(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public int initialize() {
        return nativeInitialize(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public boolean isJoined() {
        return nativeIsJoined(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public int joinChannel() {
        return nativeJoinChannel(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public int leaveChannel() {
        return nativeLeaveChannel(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public void publishBlackFrameIfNeeded() {
        nativePublishBlackFrameIfNeeded(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public void recoverVideoStreamStatus() {
        nativeRecoverVideoStreamStatus(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public int resetVideoPerformanceConfig() {
        return nativeResetVideoPerformanceConfig(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public void setLinkmicStateForAnchorNet() {
        nativeSetLinkmicStateForAnchorNet(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public int startMixStream() {
        return nativeStartMixStream(this.handle);
    }

    public void stop() {
        nativeDestroy(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public int stopForwardStreamToRooms() {
        return nativeStopForwardStreamToRooms(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public int stopMixStream() {
        return nativeStopMixStream(this.handle);
    }

    @Override // com.ss.solution.interact.IInteract
    public boolean videoStreamPublished() {
        return nativeVideoStreamPublished(this.handle);
    }

    public static void loadSoFile() {
        String soLibraryName = LyraxPluginConfig.getSoLibraryName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[LYRAX_SO_LOAD] InteractImpl.loadSoFile: soName=");
        sbLIZ.append(soLibraryName);
        sbLIZ.append(", pluginState=");
        sbLIZ.append(LyraxPluginConfig.getPluginState());
        LyraxPluginConfig.safeLogW("InteractImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (mLibraryLoaded) {
            return;
        }
        synchronized (InteractImpl.class) {
            try {
                if (mLibraryLoaded) {
                    return;
                }
                LyraxNativeLibraryLoader lyraxNativeLibraryLoader = LyraxNativeLibraryLoaderAdapter.getLyraxNativeLibraryLoader();
                if (lyraxNativeLibraryLoader != null) {
                    mLibraryLoaded = true;
                    mLibraryLoaded &= lyraxNativeLibraryLoader.load("bytenn");
                    mLibraryLoaded = lyraxNativeLibraryLoader.load(soLibraryName) & mLibraryLoaded;
                } else {
                    try {
                        INVOKESTATIC_com_ss_solution_interact_InteractImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                        INVOKESTATIC_com_ss_solution_interact_InteractImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(soLibraryName);
                        mLibraryLoaded = true;
                    } catch (UnsatisfiedLinkError e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Failed to load native library: ");
                        sbLIZ2.append(soLibraryName);
                        Logging.e("InteractImpl", C2188811AlT.LIZIZ(sbLIZ2), e);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    static {
        loadSoFile();
    }

    public static void INVOKESTATIC_com_ss_solution_interact_InteractImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    @Override // com.ss.solution.interact.IInteract
    public int adjustPlaybackSignalVolume(int i) {
        return nativeAdjustPlaybackSignalVolume(this.handle, i);
    }

    @Override // com.ss.solution.interact.IInteract
    public int adjustRecordingSignalVolume(int i) {
        return nativeAdjustRecordingSignalVolume(this.handle, i);
    }

    @Override // com.ss.solution.interact.IInteract
    public int applyMixStream(DisposableParams disposableParams) {
        return nativeApplyMixStream(this.handle, disposableParams);
    }

    @Override // com.ss.solution.interact.IInteract
    public AuxStreamInfo createAuxStream(String str) {
        return nativeCreateAuxStream(this.handle, str);
    }

    @Override // com.ss.solution.interact.IInteract
    public void enableDownlinkAudioSelection(int i) {
        nativeEnableDownlinkAudioSelection(this.handle, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof InteractImpl)) {
            return nativeEquals(this.handle, ((InteractImpl) obj).handle);
        }
        return false;
    }

    @Override // com.ss.solution.interact.IInteract
    public int muteAllRemoteAudioStreams(boolean z) {
        return nativeMuteAllRemoteAudioStreams(this.handle, z);
    }

    @Override // com.ss.solution.interact.IInteract
    public int muteAllRemoteVideoStreams(boolean z) {
        return nativeMuteAllRemoteVideoStreams(this.handle, z);
    }

    @Override // com.ss.solution.interact.IInteract
    public int muteLocalAudioStream(boolean z) {
        return nativeMuteLocalAudioStream(this.handle, z);
    }

    @Override // com.ss.solution.interact.IInteract
    public int muteLocalVideoStream(boolean z) {
        return nativeMuteLocalVideoStream(this.handle, z);
    }

    @Override // com.ss.solution.interact.IInteract
    public void parseSDKParams(String str) {
        nativeParseSDKParams(this.handle, str);
    }

    @Override // com.ss.solution.interact.IInteract
    public int publishVideoStream(boolean z) {
        return nativePublishVideoStream(this.handle, z);
    }

    @Override // com.ss.solution.interact.IInteract
    public void removeVideoRenderer(String str) {
        if (str != null && !str.isEmpty()) {
            nativeRemoveVideoRenderer(this.handle, str);
        }
    }

    @Override // com.ss.solution.interact.IInteract
    public int sendRoomBinaryMessage(byte[] bArr) {
        return nativeSendRoomBinaryMessage(this.handle, bArr);
    }

    @Override // com.ss.solution.interact.IInteract
    public int sendRoomMessage(String str) {
        return nativeSendRoomMessage(this.handle, str);
    }

    @Override // com.ss.solution.interact.IInteract
    public void setBizSessionId(String str) {
        nativeSetBizSessionId(this.handle, str);
    }

    @Override // com.ss.solution.interact.IInteract
    public int setBusinessId(String str) {
        return nativeSetBusinessId(this.handle, str);
    }

    @Override // com.ss.solution.interact.IInteract
    public int setBusinessLabel(String str) {
        return nativeSetBusinessLabel(this.handle, str);
    }

    @Override // com.ss.solution.interact.IInteract
    public int setDefaultMuteAllRemoteAudioStreams(boolean z) {
        return nativeSetDefaultMuteAllRemoteAudioStreams(this.handle, z);
    }

    @Override // com.ss.solution.interact.IInteract
    public int setDefaultMuteAllRemoteVideoStreams(boolean z) {
        return nativeSetDefaultMuteAllRemoteVideoStreams(this.handle, z);
    }

    @Override // com.ss.solution.interact.IInteract
    public int setEnableSpeakerphone(boolean z) {
        return nativeSetEnableSpeakerphone(this.handle, z);
    }

    @Override // com.ss.solution.interact.IInteract
    public int setGroupChannelId(String str) {
        return nativeSetGroupChannelId(this.handle, str);
    }

    @Override // com.ss.solution.interact.IInteract
    public void setLinkMicType(int i) {
        nativeSetLinkMicType(this.handle, i);
    }

    @Override // com.ss.solution.interact.IInteract
    public int setMixStreamAppDataSEI(String str) {
        return nativeSetMixStreamAppDataSEI(this.handle, str);
    }

    @Override // com.ss.solution.interact.IInteract
    public int setMixStreamRegions(LyraxTranscoderLayoutRegionConfig[] lyraxTranscoderLayoutRegionConfigArr) {
        return nativeSetMixStreamRegions(this.handle, lyraxTranscoderLayoutRegionConfigArr);
    }

    @Override // com.ss.solution.interact.IInteract
    public void setNativeListener(IInteractNativeListener iInteractNativeListener) {
        nativeSetNativeListener(this.handle, iInteractNativeListener);
    }

    @Override // com.ss.solution.interact.IInteract
    public void setPlaybackVolume(int i) {
        nativeSetPlaybackVolume(this.handle, i);
    }

    @Override // com.ss.solution.interact.IInteract
    public int setRemoteRoomAudioPlaybackVolume(int i) {
        return nativeSetRemoteRoomAudioPlaybackVolume(this.handle, i);
    }

    @Override // com.ss.solution.interact.IInteract
    public void setRemoteSessionNeedRender(boolean z) {
        nativeSetRemoteSessionNeedRender(this.handle, z);
    }

    @Override // com.ss.solution.interact.IInteract
    public void setRtcScene(int i) {
        nativeSetRtcScene(this.handle, i);
    }

    @Override // com.ss.solution.interact.IInteract
    public int setSEICurrentShiftDiffTimeMs(long j) {
        return nativeSetSEICurrentShiftDiffTimeMs(this.handle, j);
    }

    @Override // com.ss.solution.interact.IInteract
    public int setVideoSource(ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper) {
        return nativeSetVideoSource(this.handle, iLyraxVideoPlatformWrapper);
    }

    @Override // com.ss.solution.interact.IInteract
    public int startAuxStream(String str) {
        return nativeStartAuxStream(this.handle, str);
    }

    @Override // com.ss.solution.interact.IInteract
    public int startForwardStreamToRooms(List<LyraxForwardStreamInfo> list) {
        return nativeStartForwardStreamToRooms(this.handle, list);
    }

    @Override // com.ss.solution.interact.IInteract
    public int stopAuxStream(String str) {
        return nativeStopAuxStream(this.handle, str);
    }

    @Override // com.ss.solution.interact.IInteract
    public int subscribeAuxStream(String str) {
        return nativeSubscribeAuxStream(this.handle, str);
    }

    @Override // com.ss.solution.interact.IInteract
    public int unsubscribeAuxStream(String str) {
        return nativeUnsubscribeAuxStream(this.handle, str);
    }

    @Override // com.ss.solution.interact.IInteract
    public int updateAuthInfo(String str) {
        return nativeUpdateAuthInfo(this.handle, str);
    }

    @Override // com.ss.solution.interact.IInteract
    public int updateForwardStreamToRooms(List<LyraxForwardStreamInfo> list) {
        return nativeUpdateForwardStreamToRooms(this.handle, list);
    }

    @Override // com.ss.solution.interact.IInteract
    public void updateInteractVideoSourceType(int i) {
        nativeUpdateInteractVideoSourceType(this.handle, i);
    }

    @Override // com.ss.solution.interact.IInteract
    public int updateMixStreamAuthInfo(String str) {
        return nativeUpdateMixStreamAuthInfo(this.handle, str);
    }

    @Override // com.ss.solution.interact.IInteract
    public int updateMixStreamCommonConfig(MixStreamCommonConfig mixStreamCommonConfig) {
        return nativeUpdateMixStreamCommonConfig(this.handle, mixStreamCommonConfig);
    }

    @Override // com.ss.solution.interact.IInteract
    public int updateMixStreamVideoConfig(MixStreamVideoConfig mixStreamVideoConfig) {
        return nativeUpdateMixStreamVideoConfig(this.handle, mixStreamVideoConfig);
    }

    @Override // com.ss.solution.interact.IInteract
    public void updateRtcExtInfo(String str) {
        nativeUpdateRtcExtInfo(this.handle, str);
    }

    @Override // com.ss.solution.interact.IInteract
    public int updateServerControlConfig(LyraxTranscoderServerControlConfig lyraxTranscoderServerControlConfig) {
        return nativeUpdateServerControlConfig(this.handle, lyraxTranscoderServerControlConfig);
    }

    @Override // com.ss.solution.interact.IInteract
    public void updateSingleViewModeFlag(boolean z) {
        nativeUpdateSingleViewModeFlag(this.handle, z);
    }

    public InteractImpl(InteractCoreOption interactCoreOption, LyraxEngineOption lyraxEngineOption) {
        long jNativeCreate = nativeCreate(interactCoreOption, lyraxEngineOption);
        this.handle = jNativeCreate;
        if (jNativeCreate != 0) {
            LyraxNativeCleaner.register(this, jNativeCreate, nativeGetDestroy());
            return;
        }
        throw new IllegalStateException("Failed to create native InteractCore");
    }

    @Override // com.ss.solution.interact.IInteract
    public int enableAudioVolumeIndication(int i, int i2) {
        return nativeEnableAudioVolumeIndication(this.handle, i, i2);
    }

    @Override // com.ss.solution.interact.IInteract
    public int muteAuxStreamAudio(String str, boolean z) {
        return nativeMuteAuxStreamAudio(this.handle, str, z);
    }

    @Override // com.ss.solution.interact.IInteract
    public int muteRemoteAudioStream(String str, boolean z) {
        return nativeMuteRemoteAudioStream(this.handle, str, z);
    }

    @Override // com.ss.solution.interact.IInteract
    public int muteRemoteVideoStream(String str, boolean z) {
        return nativeMuteRemoteVideoStream(this.handle, str, z);
    }

    @Override // com.ss.solution.interact.IInteract
    public void reportAPICall(String str, String str2) {
        nativeReportAPICall(this.handle, str, str2);
    }

    @Override // com.ss.solution.interact.IInteract
    public long sendUserMessage(String str, String str2) {
        return nativeSendUserMessage(this.handle, str, str2);
    }

    @Override // com.ss.solution.interact.IInteract
    public int setAuxStreamRenderView(String str, Object obj) {
        return nativeSetAuxStreamRenderView(this.handle, str, obj);
    }

    @Override // com.ss.solution.interact.IInteract
    public int setDownLinkAudioSelectionPriority(int i, int i2) {
        return nativeSetDownLinkAudioSelectionPriority(this.handle, i, i2);
    }

    @Override // com.ss.solution.interact.IInteract
    public void setInteractParams(int i, boolean z) {
        nativeSetInteractParams(this.handle, i, z);
    }

    @Override // com.ss.solution.interact.IInteract
    public void setRemoteAudioPlaybackVolume(String str, int i) {
        nativeSetRemoteAudioPlaybackVolume(this.handle, str, i);
    }

    @Override // com.ss.solution.interact.IInteract
    public void setRemoteVideoRenderTargetView(String str, View view) {
        if (str != null && !str.isEmpty()) {
            nativeSetRemoteVideoRenderTargetView(this.handle, str, view);
        }
    }

    @Override // com.ss.solution.interact.IInteract
    public int setVideoEncoderConfig(int i, LyraxVideoEncoderConfig lyraxVideoEncoderConfig) {
        return nativeSetVideoEncoderConfig(this.handle, i, lyraxVideoEncoderConfig);
    }

    @Override // com.ss.solution.interact.IInteract
    public void subscribeRemoteStream(int i, int i2) {
        nativeSubscribeRemoteStream(this.handle, i, i2);
    }

    @Override // com.ss.solution.interact.IInteract
    public int updateAuxStreamSourceConfig(String str, Object obj) {
        return nativeUpdateAuxStreamSourceConfig(this.handle, str, obj);
    }

    @Override // com.ss.solution.interact.IInteract
    public ChannelBaseApplyResult updateChannelBaseConfiguration(String str, String str2) {
        return nativeUpdateChannelBaseConfiguration(this.handle, str, str2);
    }

    @Override // com.ss.solution.interact.IInteract
    public int sendSEIV1(String str, int i, boolean z) {
        return nativeSendSEIV1(this.handle, str, i, z);
    }

    @Override // com.ss.solution.interact.IInteract
    public int subscribeAuxStreamWithMediaType(String str, boolean z, boolean z2) {
        return nativeSubscribeAuxStreamWithMediaType(this.handle, str, z, z2);
    }

    @Override // com.ss.solution.interact.IInteract
    public int sendSEIV1(byte[] bArr, int i, boolean z) {
        return nativeSendSEIV1Bytes(this.handle, bArr, i, z);
    }

    @Override // com.ss.solution.interact.IInteract
    public int sendSEIV2(String str, int i, boolean z, boolean z2) {
        return nativeSendSEIV2(this.handle, str, i, z, z2);
    }

    @Override // com.ss.solution.interact.IInteract
    public int setRtcVideoSize(int i, int i2, int i3, int i4) {
        return nativeSetRtcVideoSize(this.handle, i, i2, i3, i4);
    }

    @Override // com.ss.solution.interact.IInteract
    public int setVideoPerformanceConfig(int i, int i2, int i3, int i4) {
        return nativeSetVideoPerformanceConfig(this.handle, i, i2, i3, i4);
    }

    @Override // com.ss.solution.interact.IInteract
    public int updateAuxStreamEncodeConfig(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        return nativeUpdateAuxStreamEncodeConfig(this.handle, str, i, i2, i3, i4, i5, i6);
    }
}
