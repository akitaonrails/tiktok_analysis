package com.ss.bytertc.engine.handler;

import com.bytedance.realx.video.VideoFrame;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public class RTCVideoFrameObserver {
    public void onLocalScreenFrame(VideoFrame videoFrame) throws Exception {
        try {
            videoFrame.release();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    public void onLocalVideoFrame(VideoFrame videoFrame) throws Exception {
        try {
            videoFrame.release();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    public void onMergeFrame(String str, String str2, VideoFrame videoFrame) throws Exception {
        try {
            videoFrame.release();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    public void onRemoteScreenFrame(String str, String str2, VideoFrame videoFrame) throws Exception {
        try {
            videoFrame.release();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    public void onRemoteVideoFrame(String str, String str2, VideoFrame videoFrame) throws Exception {
        try {
            videoFrame.release();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }
}
