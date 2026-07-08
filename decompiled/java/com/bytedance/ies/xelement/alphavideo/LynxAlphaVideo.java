package com.bytedance.ies.xelement.alphavideo;

import X.AbstractC1321260kUG;
import X.AbstractC1327750kej;
import X.AbstractC447090Hg3;
import X.C08XD;
import X.C1290210jgB;
import X.C1290470jgb;
import X.C1291100jhc;
import X.C1291110jhd;
import X.C1294030jmL;
import X.C1299120juY;
import X.C1301610jyZ;
import X.C1315790kLR;
import X.C1322200kVm;
import X.C1323050kX9;
import X.C1325700kbQ;
import X.C1470410oMp;
import X.C1470420oMq;
import X.C1520380pfQ;
import X.C2188811AlT;
import X.C2200151B8z;
import X.C786410Ut5;
import X.C822700WPc;
import X.InterfaceC1290060jfw;
import X.InterfaceC1290070jfx;
import X.InterfaceC1312540kGC;
import X.InterfaceC1320200kSY;
import X.InterfaceC1967107nB;
import X.InterfaceC2033107xp;
import X.InterfaceC2247121CxK;
import Y.ACallableS21S2100000_20;
import Y.ACallableS68S1100000_20;
import Y.AComparatorS39S0000000_20;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS24S1200000_20;
import Y.ARunnableS25S1100000_20;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IProgressListener;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import j27.s;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxAlphaVideo extends UISimpleView<C1291100jhc> {
    public static final /* synthetic */ int LLJJIJI = 0;
    public PlayerController LL;
    public Set<String> LLILLJJLI;
    public DataSource LLILLL;
    public C1470410oMp LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public InterfaceC2033107xp<C1290210jgB> LLIZLLLIL;
    public Bitmap LLJ;
    public String LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final List<Integer> LLJILLL;
    public final List<Integer> LLJJ;
    public final C1291110jhd LLJJI;
    public boolean LLJJIII;

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        this.LL.release();
        this.LL.detachAlphaView((ViewGroup) this.mView);
        ((C1291100jhc) this.mView).setMPoster(null);
        this.LLJ = null;
        ((C1291100jhc) this.mView).setMLastFrame(null);
        PlayerController playerController = this.LL;
        if ((playerController instanceof PlayerController) && playerController != null) {
            playerController.setFirstGLFrameListener(null);
        }
        PlayerController playerController2 = this.LL;
        if (playerController2 != null) {
            playerController2.withVideoAction(null);
        }
        PlayerController playerController3 = this.LL;
        if (playerController3 != null) {
            playerController3.setMonitor(null);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onAttach() {
        PlayerController playerController;
        super.onAttach();
        if (this.LLJILJILJ || (playerController = this.LL) == null || !this.LLILZIL) {
            return;
        }
        playerController.attachAlphaView((ViewGroup) this.mView);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onDetach() {
        PlayerController playerController;
        super.onDetach();
        if (this.LLJILJILJ || (playerController = this.LL) == null) {
            return;
        }
        playerController.detachAlphaView((ViewGroup) this.mView);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        this.LL.getView().layout(0, 0, getWidth(), getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [byte[]] */
    public static String LJJIJ(String str) {
        byte[] bytes;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(Charsets.UTF_8));
            str = messageDigest.digest();
            bytes = str;
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            bytes = str.getBytes(Charsets.UTF_8);
        }
        StringBuilder sb = new StringBuilder();
        for (int i : bytes) {
            String hexString = Integer.toHexString(i & 255);
            if (hexString.length() < 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('0');
                sbLIZ.append(hexString);
                hexString = C2188811AlT.LIZIZ(sbLIZ);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:32:0x0166
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource LJJIIZI(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo.LJJIIZI(java.lang.String):com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource");
    }

    public final void LJJIJIL(final String str) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("legacySetSrc, directUrl is ");
            sbLIZ.append(str);
            LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
            if (str != null) {
                final Uri uri = UriProtector.parse(str);
                this.LLILLL = null;
                String scheme = uri.getScheme();
                if (scheme != null) {
                    int iHashCode = scheme.hashCode();
                    if (iHashCode != 3143036) {
                        if (iHashCode == 3213448 ? scheme.equals("http") : iHashCode == 99617003 && scheme.equals("https")) {
                            if (u.LJIIZILJ((String) a0.LJJLIIIJ(str, new char[]{'?'}, false, 0, 6).get(0), ".zip", false)) {
                                DownloadTask downloadTaskWith = C2200151B8z.with(this.mContext);
                                downloadTaskWith.url(str);
                                downloadTaskWith.name(uri.getLastPathSegment());
                                downloadTaskWith.savePath(C786410Ut5.w2(C786410Ut5.T3(this.mContext)).getAbsolutePath());
                                downloadTaskWith.mainThreadListener(new AbsDownloadListener(this, uri, str) { // from class: X.0jg9
                                    public final Uri LL;
                                    public final String LLILLJJLI;
                                    public final WeakReference<LynxAlphaVideo> LLILLL;

                                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                                    public final void onSuccessed(DownloadInfo downloadInfo) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("download resource success, and directUrl is ");
                                        sbLIZ2.append(this.LLILLJJLI);
                                        LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ2));
                                        LynxAlphaVideo lynxAlphaVideo = this.LLILLL.get();
                                        if (lynxAlphaVideo != null) {
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append(C786410Ut5.w2(C786410Ut5.T3(lynxAlphaVideo.mContext)).getAbsolutePath());
                                            sbLIZ3.append('/');
                                            sbLIZ3.append(this.LL.getLastPathSegment());
                                            lynxAlphaVideo.LJJIJLIJ(C2188811AlT.LIZIZ(sbLIZ3), this.LLILLJJLI);
                                        }
                                    }

                                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) throws JSONException {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("download resource failed, error msg is ");
                                        sbLIZ2.append(baseException);
                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                        LynxLog.i("x-alpha-video", strLIZIZ);
                                        LynxAlphaVideo lynxAlphaVideo = this.LLILLL.get();
                                        if (lynxAlphaVideo != null) {
                                            lynxAlphaVideo.LJJIJIIJIL(-12, strLIZIZ, lynxAlphaVideo.LLJI);
                                            s sVar = lynxAlphaVideo.mContext;
                                            String str2 = this.LLILLJJLI;
                                            sVar.getClass();
                                            sVar.LJJIFFI(str2, "video", new LynxError(39800, strLIZIZ));
                                        }
                                    }

                                    {
                                        this.LL = uri;
                                        this.LLILLJJLI = str;
                                        this.LLILLL = new WeakReference<>(this);
                                    }
                                });
                                downloadTaskWith.monitorScene("legacy_lynx_alphavideo");
                                downloadTaskWith.download();
                                return;
                            }
                            LJJIJIIJIL(-13, "resource type is not support", this.LLJI);
                            return;
                        }
                    } else if (scheme.equals("file")) {
                        try {
                            if (u.LJIIZILJ(str, ".zip", false)) {
                                LJJIJLIJ(uri.getPath(), uri.getPath());
                                return;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(uri.getPath());
                            sbLIZ2.append('/');
                            this.LLILLL = LJJIIZI(C2188811AlT.LIZIZ(sbLIZ2));
                            LJJIZ("ready", LJJIJIIJI(1, "load resource success", null));
                            if (this.LLILLL != null && this.LLILZIL) {
                                this.LL.attachAlphaView((ViewGroup) this.mView);
                                this.LL.startWithLastFrameHold(this.LLILLL, this.LLJILJIL);
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("parse config.json failed, resource is ");
                            sbLIZ3.append(str);
                            sbLIZ3.append(", error msg is ");
                            sbLIZ3.append(e);
                            LJJIJIIJIL(-3, C2188811AlT.LIZIZ(sbLIZ3), this.LLJI);
                            return;
                        }
                    }
                }
                LJJIJLIJ(str, str);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            LynxLog.e("x-alpha-video", e2.toString());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) throws JSONException {
        Context contextN3;
        C1291100jhc c1291100jhc = new C1291100jhc(context);
        Configuration configuration = new Configuration();
        Context contextN32 = null;
        if (context != null) {
            contextN3 = C786410Ut5.N3(context);
        } else {
            contextN3 = null;
        }
        configuration.setContext(contextN3);
        configuration.setLifecycleOwner(c1291100jhc);
        configuration.setAlphaVideoViewType(1);
        AlphaPlayerAction alphaPlayerAction = new AlphaPlayerAction() { // from class: X.0jhX
            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void endAction() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("endAction action, url is ");
                sbLIZ.append(this.LIZ.LLJI);
                LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
                ((C1291100jhc) this.LIZ.mView).setMIsShowPoster(false);
                ((C1291100jhc) this.LIZ.mView).setMIsShowLastFrame(true);
                LynxAlphaVideo lynxAlphaVideo = this.LIZ;
                ((C1291100jhc) lynxAlphaVideo.mView).setMLastFrame(lynxAlphaVideo.LLJ);
                C1291100jhc c1291100jhc2 = (C1291100jhc) this.LIZ.mView;
                c1291100jhc2.LLILZ = null;
                c1291100jhc2.invalidate();
                LynxAlphaVideo lynxAlphaVideo2 = this.LIZ;
                lynxAlphaVideo2.getClass();
                lynxAlphaVideo2.LJJIZ("completion", LynxAlphaVideo.LJJIJIIJI(2, "play video success", null));
                this.LIZ.LL.stop();
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void startAction() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start action, url is ");
                sbLIZ.append(this.LIZ.LLJI);
                LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
                ((C1291100jhc) this.LIZ.mView).setMIsShowPoster(false);
                ((C1291100jhc) this.LIZ.mView).setMIsShowLastFrame(false);
                LynxAlphaVideo lynxAlphaVideo = this.LIZ;
                ((C1291100jhc) lynxAlphaVideo.mView).LLILZIL = null;
                lynxAlphaVideo.LJJIZ("start", LynxAlphaVideo.LJJIJIIJI(1, "start video", null));
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void onVideoSizeChange(int i, int i2, DataSource.ScaleType scaleType) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onVideoSizeChange: videoWidth = ");
                sbLIZ.append(i);
                sbLIZ.append(" videoHeight = ");
                sbLIZ.append(i2);
                sbLIZ.append(" scaleType = ");
                sbLIZ.append(scaleType.name());
                LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        IMonitor iMonitor = new IMonitor() { // from class: X.0jfu
            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor
            public final void monitorInit(String str, Exception exc) throws JSONException {
                LynxAlphaVideo lynxAlphaVideo = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("failed when init media player, and player is ");
                sbLIZ.append(str);
                sbLIZ.append(", error msg is ");
                sbLIZ.append(exc);
                sbLIZ.append(' ');
                lynxAlphaVideo.LJJIJIIJIL(-8, C2188811AlT.LIZIZ(sbLIZ), this.LIZ.LLJI);
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor
            public final void monitor(boolean z, String str, int i, int i2, String str2) throws JSONException {
                if (!z) {
                    LynxAlphaVideo lynxAlphaVideo = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("failed when monitor: state = ");
                    sbLIZ.append(z);
                    sbLIZ.append(", playerType = ");
                    sbLIZ.append(str);
                    sbLIZ.append(", what = ");
                    sbLIZ.append(i);
                    sbLIZ.append(", extra = ");
                    sbLIZ.append(i2);
                    sbLIZ.append(", errorInfo = ");
                    sbLIZ.append(str2);
                    lynxAlphaVideo.LJJIJIIJIL(-9, C2188811AlT.LIZIZ(sbLIZ), this.LIZ.LLJI);
                }
            }
        };
        try {
            if (context != null) {
                contextN32 = C786410Ut5.N3(context);
            }
            C1470410oMp c1470410oMp = new C1470410oMp(contextN32);
            this.LLILZ = c1470410oMp;
            this.LL = PlayerController.get(configuration, c1470410oMp);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init CustomPlayerImpl failed and try to use DefaultSystemPlayer, the exception is ");
            sbLIZ.append(e);
            LJJIJIIJIL(-10, C2188811AlT.LIZIZ(sbLIZ), this.LLJI);
            this.LL = PlayerController.get(configuration, new DefaultSystemPlayer());
        }
        PlayerController playerController = this.LL;
        if (playerController != null) {
            playerController.withVideoAction(alphaPlayerAction);
        }
        PlayerController playerController2 = this.LL;
        if (playerController2 != null) {
            playerController2.setMonitor(iMonitor);
        }
        PlayerController playerController3 = this.LL;
        if (playerController3 instanceof PlayerController) {
            if (playerController3 != null) {
                playerController3.setFirstGLFrameListener(new InterfaceC2247121CxK() { // from class: X.0jha
                    @Override // X.InterfaceC2247121CxK
                    public final void LIZ() {
                        LynxAlphaVideo lynxAlphaVideo = this.LIZ;
                        int i = LynxAlphaVideo.LLJJIJI;
                        HandlerHook.viewPost(lynxAlphaVideo.mView, new ARunnableS120S0100000_20(lynxAlphaVideo, 454));
                        lynxAlphaVideo.LJJIZ("firstframe", LynxAlphaVideo.LJJIJIIJI(1, "first frame begin", null));
                    }
                });
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController");
            }
        }
        PlayerController playerController4 = this.LL;
        if (playerController4 != null) {
            playerController4.setProgressListener(new IProgressListener() { // from class: X.0jhW
                @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.IProgressListener
                public final void onProgress(long j) {
                    LynxAlphaVideo lynxAlphaVideo = this.LIZ;
                    int i = LynxAlphaVideo.LLJJIJI;
                    try {
                        lynxAlphaVideo.LL.getDuration();
                        if (j < lynxAlphaVideo.LLJIJIL) {
                            ((ArrayList) lynxAlphaVideo.LLJJ).clear();
                        }
                        lynxAlphaVideo.LLJIJIL = j;
                        int size = ((ArrayList) lynxAlphaVideo.LLJJ).size();
                        if (size < ((ArrayList) lynxAlphaVideo.LLJILLL).size()) {
                            int iIntValue = ((Number) ((ArrayList) lynxAlphaVideo.LLJILLL).get(((ArrayList) lynxAlphaVideo.LLJJ).size())).intValue();
                            if (iIntValue <= j) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("send trackedMSCount is ");
                                sbLIZ2.append(size);
                                sbLIZ2.append(", trackedMS is ");
                                sbLIZ2.append(iIntValue);
                                sbLIZ2.append(", progress is ");
                                sbLIZ2.append(j);
                                LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ2));
                                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                                javaOnlyMap.putInt("subscribedMillisecond", iIntValue);
                                lynxAlphaVideo.LJJIZ("update", LynxAlphaVideo.LJJIJIIJI(1, "", javaOnlyMap));
                                ((ArrayList) lynxAlphaVideo.LLJJ).add(Integer.valueOf(iIntValue));
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        LynxLog.e("x-alpha-video", e2.toString());
                    }
                }
            }, 5L);
        }
        return c1291100jhc;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-ignore-attach-status")
    public final void setAndroidIgnoreAttachStatus(boolean z) {
        this.LLJILJILJ = z;
        T t = this.mView;
        if (t != 0) {
            ((C1291100jhc) t).setMIgnoreAttachStatus(z);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.xelement.alphavideo.LynxAlphaVideoView");
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "autoplay")
    public final void setAutoPlay(boolean z) {
        this.LLILZIL = z;
        T t = this.mView;
        if (t != 0) {
            ((C1291100jhc) t).setMAutoPlay(z);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.xelement.alphavideo.LynxAlphaVideoView");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        Set<String> setKeySet;
        super.setEvents(map);
        if (map != null) {
            setKeySet = map.keySet();
        } else {
            setKeySet = null;
        }
        this.LLILLJJLI = setKeySet;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "frame-hold")
    public final void setFrameHold(boolean z) {
        this.LLJILJIL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "keep-last-frame")
    public final void setKeepLastFrame(boolean z) {
        if (this.LLILZLL != z) {
            DataSource dataSource = this.LLILLL;
            if (dataSource != null) {
                dataSource.setAutoRelease(!z);
            }
            this.LLILZLL = z;
        }
    }

    @InterfaceC1312540kGC(name = "last-frame")
    public final void setLastFrame(final String str) {
        if (str == null) {
            return;
        }
        C1290470jgb c1290470jgb = new C1290470jgb(new ACallableS68S1100000_20(this, str, 4));
        c1290470jgb.LIZIZ(new InterfaceC1290060jfw() { // from class: X.0jhZ
            @Override // X.InterfaceC1290060jfw
            public final void onResult(Object obj) {
                LynxAlphaVideo lynxAlphaVideo = this.LIZ;
                Bitmap bitmap = (Bitmap) obj;
                int i = LynxAlphaVideo.LLJJIJI;
                if (bitmap != null) {
                    LynxLog.i("x-alpha-video", "non-null last-frame and set done ");
                    DataSource dataSource = lynxAlphaVideo.LLILLL;
                    if (dataSource != null) {
                        dataSource.setAutoRelease(true);
                    }
                    lynxAlphaVideo.LLJ = bitmap;
                    ((C1291100jhc) lynxAlphaVideo.mView).setMLastFrame(bitmap);
                }
            }
        });
        c1290470jgb.LIZ(new InterfaceC1290060jfw() { // from class: X.0jfs
            @Override // X.InterfaceC1290060jfw
            public final void onResult(Object obj) throws JSONException {
                LynxAlphaVideo lynxAlphaVideo = this.LIZ;
                String str2 = str;
                DataSource dataSource = lynxAlphaVideo.LLILLL;
                if (dataSource != null) {
                    dataSource.setAutoRelease(true);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("set video lastFrame failed, lastFrame is ");
                sbLIZ.append(str2);
                sbLIZ.append(", error msg is ");
                sbLIZ.append(obj);
                lynxAlphaVideo.LJJIJIIJIL(-16, C2188811AlT.LIZIZ(sbLIZ), lynxAlphaVideo.LLJI);
            }
        });
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "loop")
    public final void setLoop(boolean z) {
        DataSource dataSource = this.LLILLL;
        if (dataSource != null) {
            dataSource.setLoop(z);
        }
    }

    @InterfaceC1312540kGC(name = "poster")
    public final void setPoster(final String str) {
        if (str == null) {
            return;
        }
        C1290470jgb c1290470jgb = new C1290470jgb(new ACallableS68S1100000_20(this, str, 5));
        c1290470jgb.LIZIZ(new InterfaceC1290060jfw() { // from class: X.0jhb
            @Override // X.InterfaceC1290060jfw
            public final void onResult(Object obj) {
                LynxAlphaVideo lynxAlphaVideo = this.LIZ;
                Bitmap bitmap = (Bitmap) obj;
                int i = LynxAlphaVideo.LLJJIJI;
                if (bitmap != null) {
                    LynxLog.i("x-alpha-video", "non-null poster and set done ");
                    ((C1291100jhc) lynxAlphaVideo.mView).setMPoster(bitmap);
                    ((C1291100jhc) lynxAlphaVideo.mView).setMIsShowPoster(true);
                    lynxAlphaVideo.mView.invalidate();
                }
            }
        });
        c1290470jgb.LIZ(new InterfaceC1290060jfw() { // from class: X.0jft
            @Override // X.InterfaceC1290060jfw
            public final void onResult(Object obj) throws JSONException {
                LynxAlphaVideo lynxAlphaVideo = this.LIZ;
                String str2 = str;
                int i = LynxAlphaVideo.LLJJIJI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("set video poster failed, poster is ");
                sbLIZ.append(str2);
                sbLIZ.append(", error msg is ");
                sbLIZ.append(obj);
                lynxAlphaVideo.LJJIJIIJIL(-15, C2188811AlT.LIZIZ(sbLIZ), lynxAlphaVideo.LLJI);
            }
        });
    }

    @InterfaceC1312540kGC(name = "src")
    public final void setSrc(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1301610jyZ.LIZIZ().execute(new ARunnableS25S1100000_20(this, str, 32));
    }

    public LynxAlphaVideo(s sVar, Object obj) {
        this(sVar, "x-alpha_video-flower", obj);
    }

    public final void LJJIJL(String str, final InterfaceC1290070jfx interfaceC1290070jfx) {
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(C1294030jmL.LIZ(this.mContext, str, false)));
        C1315790kLR.LIZ(c1325700kbQLIZLLL);
        final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(c1325700kbQLIZLLL.LIZ(), "x-alpha-video");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        AbstractC447090Hg3 abstractC447090Hg3 = new AbstractC447090Hg3() { // from class: X.0jfy
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                interfaceC1290070jfx.onFailed();
                if (interfaceC1320200kSY != null) {
                    interfaceC1320200kSY.close();
                }
                countDownLatch.countDown();
            }

            @Override // X.AbstractC447090Hg3
            public final void LJI(Bitmap bitmap) {
                if (interfaceC1320200kSYLJI.LIZ() && bitmap != null) {
                    interfaceC1290070jfx.LIZ(bitmap.copy(bitmap.getConfig(), true));
                    interfaceC1320200kSYLJI.close();
                }
                countDownLatch.countDown();
            }
        };
        ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(abstractC447090Hg3, C822700WPc.LL);
        try {
            if (!countDownLatch.await(3L, TimeUnit.SECONDS)) {
                abstractC447090Hg3.LIZIZ(interfaceC1320200kSYLJI);
            }
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            abstractC447090Hg3.LIZIZ(interfaceC1320200kSYLJI);
        }
    }

    public final void LJJIJLIJ(String str, String str2) {
        C1290470jgb c1290470jgb = new C1290470jgb(new ACallableS21S2100000_20(this, str, str2, 2));
        c1290470jgb.LIZIZ(new InterfaceC1290060jfw() { // from class: X.0jhY
            @Override // X.InterfaceC1290060jfw
            public final void onResult(Object obj) throws JSONException {
                LynxAlphaVideo lynxAlphaVideo = this.LIZ;
                String str3 = (String) obj;
                int i = LynxAlphaVideo.LLJJIJI;
                if (str3 == "success") {
                    lynxAlphaVideo.getClass();
                    lynxAlphaVideo.LJJIZ("ready", LynxAlphaVideo.LJJIJIIJI(1, "load resource success", null));
                    if (lynxAlphaVideo.LLILLL != null && lynxAlphaVideo.LLILZIL) {
                        lynxAlphaVideo.LL.attachAlphaView((ViewGroup) lynxAlphaVideo.mView);
                        lynxAlphaVideo.LL.startWithLastFrameHold(lynxAlphaVideo.LLILLL, lynxAlphaVideo.LLJILJIL);
                        return;
                    }
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unknown exception, ");
                sbLIZ.append(str3);
                lynxAlphaVideo.LJJIJIIJIL(-6, C2188811AlT.LIZIZ(sbLIZ), lynxAlphaVideo.LLJI);
            }
        });
        c1290470jgb.LIZ(new InterfaceC1290060jfw() { // from class: X.0jfv
            @Override // X.InterfaceC1290060jfw
            public final void onResult(Object obj) throws JSONException {
                LynxAlphaVideo lynxAlphaVideo = this.LIZ;
                int i = LynxAlphaVideo.LLJJIJI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unknown exception, ");
                sbLIZ.append(obj);
                lynxAlphaVideo.LJJIJIIJIL(-6, C2188811AlT.LIZIZ(sbLIZ), lynxAlphaVideo.LLJI);
            }
        });
    }

    public final void LJJIZ(String str, Map<String, Object> map) {
        C1301610jyZ.LIZIZ().execute(new ARunnableS24S1200000_20(map, str, this, 15));
    }

    @InterfaceC1967107nB
    public final void getDuration(ReadableMap readableMap, Callback callback) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && this.LL != null) {
            try {
                javaOnlyMap.putBoolean("success", true);
                int duration = this.LL.getDuration();
                JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                javaOnlyMap2.putInt("duration", duration);
                javaOnlyMap.putMap("data", javaOnlyMap2);
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public final void isPlaying(ReadableMap readableMap, Callback callback) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && this.LL != null) {
            try {
                javaOnlyMap.putBoolean("success", true);
                boolean zIsPlaying = this.LL.isPlaying();
                JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                javaOnlyMap2.putBoolean("isPlaying", zIsPlaying);
                javaOnlyMap.putMap("data", javaOnlyMap2);
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public final void pause(ReadableMap readableMap, Callback callback) {
        PlayerController playerController;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && (playerController = this.LL) != null) {
            try {
                playerController.pause();
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public final void play(ReadableMap readableMap, Callback callback) {
        PlayerController playerController;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && (playerController = this.LL) != null) {
            try {
                if (!playerController.isPlaying() && this.LLILLL != null) {
                    this.LL.attachAlphaView((ViewGroup) this.mView);
                    this.LL.startWithLastFrameHold(this.LLILLL, this.LLJILJIL);
                    callback.invoke(0, javaOnlyMap);
                    return;
                }
                callback.invoke(1, javaOnlyMap);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public final void release(ReadableMap readableMap, Callback callback) {
        PlayerController playerController;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putBoolean("success", true);
        javaOnlyMap.putMap("data", new JavaOnlyMap());
        if (this.mView != 0 && (playerController = this.LL) != null) {
            try {
                playerController.release();
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public final void resume(ReadableMap readableMap, Callback callback) {
        PlayerController playerController;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putBoolean("success", true);
        javaOnlyMap.putMap("data", new JavaOnlyMap());
        if (this.mView != 0 && (playerController = this.LL) != null && !playerController.isPlaying()) {
            try {
                this.LL.attachAlphaView((ViewGroup) this.mView);
                this.LL.resume();
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public final void seek(ReadableMap readableMap, Callback callback) {
        Integer numValueOf;
        C1470420oMq c1470420oMq;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && this.LL != null) {
            if (readableMap != null && (numValueOf = Integer.valueOf(readableMap.getInt("ms"))) != null) {
                try {
                    C1470410oMp c1470410oMp = this.LLILZ;
                    if (c1470410oMp != null && (c1470420oMq = c1470410oMp.LIZIZ) != null) {
                        c1470420oMq.LIZJ(515, 1);
                        c1470410oMp.LIZIZ.LIZJ(143, 1);
                        c1470410oMp.LIZIZ.LIZJ(110, 2000);
                    }
                    PlayerController playerController = this.LL;
                    if (playerController != null) {
                        playerController.seekTo(numValueOf.intValue());
                    }
                    if (callback != null) {
                        callback.invoke(0, javaOnlyMap);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    javaOnlyMap.putString("message", e.getMessage());
                    if (callback != null) {
                        callback.invoke(1, javaOnlyMap);
                        return;
                    }
                    return;
                }
            }
            javaOnlyMap.putString("message", "Invalid 'ms' parameter");
            if (callback != null) {
                callback.invoke(4, javaOnlyMap);
                return;
            }
            return;
        }
        javaOnlyMap.putString("message", "View or player controller is not available");
        if (callback != null) {
            callback.invoke(1, javaOnlyMap);
        }
    }

    @InterfaceC1967107nB
    public final void stop(ReadableMap readableMap, Callback callback) {
        PlayerController playerController;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && (playerController = this.LL) != null) {
            try {
                playerController.stop();
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public final void subscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        int i = readableMap.getInt("ms");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeUpdateEvent: ");
        sbLIZ.append(i);
        LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
        if (!((ArrayList) this.LLJILLL).contains(Integer.valueOf(i))) {
            ((ArrayList) this.LLJILLL).add(Integer.valueOf(i));
            ArrayList arrayList = (ArrayList) this.LLJILLL;
            if (arrayList.size() > 1) {
                C08XD.LJJ(arrayList, new AComparatorS39S0000000_20(2));
            }
            if (callback != null) {
                callback.invoke(0);
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("already subscribeUpdateEvent with ");
        sbLIZ2.append(i);
        sbLIZ2.append(" milliseconds");
        callback.invoke(1, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @InterfaceC1967107nB
    public final void unsubscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        int i = readableMap.getInt("ms");
        if (((ArrayList) this.LLJILLL).contains(Integer.valueOf(i))) {
            ((ArrayList) this.LLJILLL).remove(Integer.valueOf(i));
            if (callback != null) {
                callback.invoke(0);
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(" milliseconds is not subscribed");
        callback.invoke(1, C2188811AlT.LIZIZ(sbLIZ));
    }

    public LynxAlphaVideo(s sVar, String str, Object obj) {
        super(sVar, obj);
        this.LLILZIL = true;
        this.LLIZ = true;
        this.LLJI = "";
        this.LLJILLL = new ArrayList();
        this.LLJJ = new ArrayList();
        this.LLJJI = new C1291110jhd(str);
    }

    public static Map LJJIJIIJI(int i, String str, JavaOnlyMap javaOnlyMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(i));
        linkedHashMap.put("message", str);
        if (javaOnlyMap != null) {
            for (Map.Entry<String, Object> entry : javaOnlyMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final void LJJIJIIJIL(int i, String str, String str2) throws JSONException {
        LJJIZ("error", LJJIJIIJI(i, str, null));
        C1291110jhd c1291110jhd = this.LLJJI;
        c1291110jhd.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", String.valueOf(i));
        jSONObject.put("resource_url", str2);
        jSONObject.put("message", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("virtual_aid", c1291110jhd.LIZ);
        C1520380pfQ.LIZ.getClass();
        C1520380pfQ.LIZIZ(str2, "alpha_video_runtime_error", jSONObject, null, jSONObject2);
        LynxLog.e("x-alpha-video", str);
    }
}
