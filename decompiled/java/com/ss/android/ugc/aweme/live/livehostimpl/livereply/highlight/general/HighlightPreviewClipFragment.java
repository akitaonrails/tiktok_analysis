package com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general;

import X.AnonymousClass0956;
import X.C01GW;
import X.C098200Yq;
import X.C0GXB;
import X.C1290330jgN;
import X.C1391190mJ3;
import X.C13BV;
import X.C13LQ;
import X.C1488060opI;
import X.C15438062q;
import X.C1602160rnK;
import X.C1619980sG4;
import X.C1685300txQ;
import X.C16G6;
import X.C1765690w35;
import X.C1834730xqR;
import X.C1835140xr6;
import X.C1835390xrV;
import X.C1835920xsM;
import X.C1835960xsQ;
import X.C1835970xsR;
import X.C1835980xsS;
import X.C1836130xsh;
import X.C1836280xsw;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C20684815ws;
import X.C2188811AlT;
import X.C343970De7;
import X.C376400EpK;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C485260J1g;
import X.C497740JfY;
import X.C500260Jjc;
import X.C785410UrT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1488080opK;
import X.InterfaceC1488720oqM;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS127S0100000_27;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.dataChannel.GeneralHighlightPreviewEnterEvent;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.HighlightPreviewClipFragment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import com.zhiliaoapp.musically.R;
import irm.AkS64S0200000_27;
import irm.AkS94S0100000_27;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS132S0101000_26;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: loaded from: classes28.dex */
public final class HighlightPreviewClipFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiklPyohLTHELIOSUgMGE7ISIkJSY0IDFiLio9LTctJWEbISIkJSY0IDEcOyolISA7CiM6OAM+KCg+LSs4";
    public final Map<String, String> LL;
    public LiveFragmentDetail LLILLJJLI;
    public ConstraintLayout LLILLL;
    public TuxTextView LLILZ;
    public ImageView LLILZIL;
    public CardView LLILZLL;
    public View LLIZ;
    public C1835970xsR LLIZLLLIL;
    public C0GXB LLJ;
    public C1488060opI LLJI;
    public View LLJIJIL;
    public TuxIconView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public View LLJILLL;
    public C1835920xsM LLJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public Pair<Integer, Integer> LLJJJJ;
    public AnimatorSet LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public final int LLJLIL;
    public final int LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public AnonymousClass0956 LLJLLIL;
    public String LLJLLL;
    public String LLJZ;
    public LiveDialog LLJZIJLIL;
    public final long LLL;
    public final float LLLF;
    public final Interpolator LLLFF;
    public final Interpolator LLLFFI;

    public HighlightPreviewClipFragment() {
        this(null, null);
    }

    public final void PR() {
        LiveDialog liveDialog = this.LLJZIJLIL;
        if (liveDialog != null) {
            liveDialog.dismiss();
            C785410UrT.LIZ(liveDialog);
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
        this.LLJZIJLIL = null;
        C1835140xr6.LLILZIL = false;
    }

    public final void RR() {
        LiveFragmentDetail liveFragmentDetail;
        ViewGroup.LayoutParams layoutParams;
        String str;
        final C1835970xsR c1835970xsR = this.LLIZLLLIL;
        if (c1835970xsR != null) {
            LiveFragmentDetail liveFragmentDetail2 = this.LLILLJJLI;
            if (liveFragmentDetail2 != null) {
                int screenWidth = ScreenUtils.getScreenWidth(c1835970xsR.getContext()) - ((int) C497740JfY.LIZIZ(142.0f));
                this.LLJJJJLIIL = screenWidth;
                this.LLJJL = (int) (screenWidth * ((liveFragmentDetail2.height * 1.0f) / liveFragmentDetail2.witdh));
                CardView cardView = this.LLILZLL;
                if (cardView != null) {
                    layoutParams = cardView.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = this.LLJJJJLIIL;
                        layoutParams.height = this.LLJJL;
                    }
                } else {
                    layoutParams = null;
                }
                CardView cardView2 = this.LLILZLL;
                if (cardView2 != null) {
                    C786410Ut5.j6(cardView2, layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = c1835970xsR.getLayoutParams();
                layoutParams2.width = this.LLJJJJLIIL;
                layoutParams2.height = this.LLJJL;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1835970xsR);
                c1835970xsR.setLayoutParams(layoutParams2);
                int i = -((int) C497740JfY.LIZIZ(1.0f));
                C426750GoL.LJIIIZ(c1835970xsR, Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), false, 16);
                c1835970xsR.invalidate();
                VideoMetaInfo videoMetaInfo = liveFragmentDetail2.mp4VideoMetaInfo;
                if (videoMetaInfo != null && (str = videoMetaInfo.url) != null && C500260Jjc.LJJIIZ(str)) {
                    final C1488060opI c1488060opI = new C1488060opI(c1835970xsR);
                    c1488060opI.LJIIL = this.LLJJIJIIJIL;
                    c1488060opI.LJIILIIL = false;
                    ((ArrayList) c1488060opI.LJIILJJIL).add(new InterfaceC1488080opK() { // from class: X.0xsK
                        @Override // X.InterfaceC1488080opK
                        public final void LJII(float f, int i2) {
                        }

                        @Override // X.InterfaceC1488080opK
                        public final void LL(String str2) {
                        }

                        @Override // X.InterfaceC1488080opK
                        public final void LLJJIJIL(int i2, String str2) {
                        }

                        @Override // X.InterfaceC1488080opK
                        public final void onBufferedPercent(String str2, long j, int i2) {
                        }

                        @Override // X.InterfaceC1488080opK
                        public final void onBuffering(boolean z) {
                        }

                        @Override // X.InterfaceC1488080opK
                        public final void onDecoderBuffering(boolean z) {
                        }

                        @Override // X.InterfaceC1488080opK
                        public final void onPausePlay(String str2) {
                        }

                        @Override // X.InterfaceC1488080opK
                        public final void onResumePlay(String str2) {
                        }

                        @Override // X.InterfaceC1488080opK
                        public final void onVideoSizeChanged(String str2, int i2, int i3) {
                        }

                        @Override // X.InterfaceC1488080opK
                        public final void onPlayCompleted(String str2) {
                            c1488060opI.LIZ.LJIIIZ(0.0f, false);
                        }

                        @Override // X.InterfaceC1488080opK
                        public final void onPlayProgressChange(float f) {
                            HighlightPreviewClipFragment highlightPreviewClipFragment;
                            Pair<Integer, Integer> pair;
                            HighlightPreviewClipFragment highlightPreviewClipFragment2 = this;
                            int iIntValue = 0;
                            if (highlightPreviewClipFragment2.LLJJJIL && !highlightPreviewClipFragment2.LLJJJ && highlightPreviewClipFragment2.LLJJJJ != null) {
                                C1835980xsS playerMaskFromXml = c1835970xsR.getPlayerMaskFromXml();
                                if ((playerMaskFromXml == null || !playerMaskFromXml.LLJJIII) && (pair = (highlightPreviewClipFragment = this).LLJJJJ) != null) {
                                    C1835970xsR c1835970xsR2 = c1835970xsR;
                                    float f2 = f / 100;
                                    float f3 = highlightPreviewClipFragment.LLJJIJIL * f2;
                                    int iIntValue2 = pair.getFirst().intValue();
                                    Pair<Integer, Integer> pair2 = highlightPreviewClipFragment.LLJJJJ;
                                    if (pair2 != null) {
                                        iIntValue = pair2.getSecond().intValue();
                                    }
                                    float fFloatValue = ((f2 * highlightPreviewClipFragment.LLJJIJIL) - pair.getFirst().floatValue()) / (iIntValue - iIntValue2);
                                    if (f3 >= iIntValue2 && f3 <= iIntValue && fFloatValue < 1.0f) {
                                        C0GXB c0gxb = highlightPreviewClipFragment.LLJ;
                                        if (c0gxb != null) {
                                            c0gxb.setProgress((int) (fFloatValue * 10000));
                                        }
                                        C1835920xsM c1835920xsM = highlightPreviewClipFragment.LLJJ;
                                        if (c1835920xsM != null) {
                                            c1835920xsM.LIZ(f);
                                            return;
                                        }
                                        return;
                                    }
                                    c1835970xsR2.LJIIIIZZ(pair.getFirst().intValue() / highlightPreviewClipFragment.LLJJIJIL);
                                    return;
                                }
                                return;
                            }
                            if (highlightPreviewClipFragment2.LLJJJ) {
                                int i2 = (int) ((highlightPreviewClipFragment2.LLJJIJIL * f) / 100);
                                int i3 = i2 % 60;
                                int i4 = i2 / 60;
                                TuxTextView tuxTextView = highlightPreviewClipFragment2.LLJJIII;
                                if (tuxTextView != null) {
                                    tuxTextView.setText(C786410Ut5.k4(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i3)}, 2)));
                                }
                            }
                            C1835920xsM c1835920xsM2 = this.LLJJ;
                            if (c1835920xsM2 != null) {
                                c1835920xsM2.LIZ(f);
                            }
                        }

                        @Override // X.InterfaceC1488080opK
                        public final void onPreparePlay(String str2) {
                            C1835980xsS playerMaskFromXml = c1835970xsR.getPlayerMaskFromXml();
                            if (playerMaskFromXml != null) {
                                playerMaskFromXml.LIZ(false);
                            }
                            View view = this.LLIZ;
                            if (view != null) {
                                C500260Jjc.LJIILIIL(view);
                            }
                        }

                        @Override // X.InterfaceC1488080opK
                        public final void LLLIZZ(int i2, int i3, long j) {
                            C1835960xsQ scrollHandle$live_release;
                            C1835920xsM c1835920xsM = this.LLJJ;
                            if (c1835920xsM != null && (scrollHandle$live_release = c1835920xsM.getScrollHandle$live_release()) != null) {
                                scrollHandle$live_release.setStart(true);
                            }
                            LifecycleOwnerExtensionsKt.LIZIZ(this, 500L, new ARunnableS127S0100000_27(c1835970xsR, 60));
                            View view = this.LLIZ;
                            if (view != null) {
                                C500260Jjc.LJIILIIL(view);
                            }
                            TuxIconView tuxIconView = this.LLJILJIL;
                            if (tuxIconView != null) {
                                C500260Jjc.LLFFF(tuxIconView);
                            }
                            TuxIconView tuxIconView2 = this.LLJILJILJ;
                            if (tuxIconView2 != null) {
                                C500260Jjc.LLFFF(tuxIconView2);
                            }
                            C0GXB c0gxb = this.LLJ;
                            if (c0gxb != null) {
                                C500260Jjc.LLFFF(c0gxb);
                            }
                        }
                    });
                    this.LLJI = c1488060opI;
                    VideoMetaInfo videoMetaInfo2 = liveFragmentDetail2.mp4VideoMetaInfo;
                    this.LLJJIJIL = videoMetaInfo2 != null ? (int) videoMetaInfo2.duration : 0;
                    Video video = new Video();
                    LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("live_replay_video_");
                    sbLIZ.append(str);
                    localVideoUrlModel.setSourceId(C2188811AlT.LIZIZ(sbLIZ));
                    localVideoUrlModel.setUrlList(new ArrayList());
                    localVideoUrlModel.getUrlList().add(str);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("live_replay_video_");
                    sbLIZ2.append(str);
                    localVideoUrlModel.setUrlKey(C2188811AlT.LIZIZ(sbLIZ2));
                    video.setPlayAddr(localVideoUrlModel);
                    video.setVideoLength(this.LLJJIJIL * LSPassThroughRecordSizeConfig.DEFAULT);
                    C1488060opI c1488060opI2 = this.LLJI;
                    if (c1488060opI2 != null) {
                        c1488060opI2.LIZLLL = video;
                        c1488060opI2.mute();
                    }
                    C1488060opI c1488060opI3 = this.LLJI;
                    if (c1488060opI3 != null) {
                        c1488060opI3.LJ = "highlight_video";
                    }
                    new C1834730xqR();
                    C1834730xqR c1834730xqR = new C1834730xqR();
                    c1834730xqR.LIZ = this.LLJI;
                    C19EG activity = getActivity();
                    c1834730xqR.LIZIZ = activity != null ? activity.getWindow() : null;
                    c1834730xqR.LIZJ = Long.valueOf(this.LLJJIJIL * LSPassThroughRecordSizeConfig.DEFAULT);
                    c1834730xqR.LJ = true;
                    c1834730xqR.LIZLLL = false;
                    c1834730xqR.LJFF = true;
                    c1834730xqR.LJI = true;
                    c1834730xqR.LJII = false;
                    c1835970xsR.setParams(c1834730xqR);
                    C1835980xsS c1835980xsS = (C1835980xsS) c1835970xsR.findViewById(R.id.qtg);
                    C500260Jjc.LJIILIIL(c1835980xsS);
                    C786410Ut5.LLLLLLLLLL(c1835980xsS.getTimeTipsFromXml(), 8);
                    if (c1835980xsS.LLJJIJI) {
                        c1835980xsS.LJ(2);
                    } else {
                        c1835980xsS.LJ(0);
                    }
                    View viewFindViewById = c1835980xsS.findViewById(R.id.qnd);
                    if (viewFindViewById != null) {
                        C500260Jjc.LJIILIIL(viewFindViewById);
                    }
                    View viewFindViewById2 = c1835980xsS.findViewById(R.id.a15);
                    if (viewFindViewById2 != null) {
                        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.inu);
                        if (viewFindViewById3 != null) {
                            C500260Jjc.LJIILIIL(viewFindViewById3);
                        }
                        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.qnk);
                        if (viewFindViewById4 != null) {
                            C500260Jjc.LJIILIIL(viewFindViewById4);
                        }
                        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.video_duration);
                        if (viewFindViewById5 != null) {
                            C500260Jjc.LJIILIIL(viewFindViewById5);
                        }
                        View viewFindViewById6 = viewFindViewById2.findViewById(R.id.vki);
                        if (viewFindViewById6 != null) {
                            C500260Jjc.LJIILIIL(viewFindViewById6);
                        }
                        int iLIZIZ = (int) C497740JfY.LIZIZ(13.0f);
                        C0GXB c0gxb = (C0GXB) viewFindViewById2.findViewById(R.id.vkd);
                        this.LLJ = c0gxb;
                        if (c0gxb != null) {
                            C500260Jjc.LJIILIIL(c0gxb);
                        }
                        C0GXB c0gxb2 = this.LLJ;
                        if (c0gxb2 != null) {
                            C426750GoL.LJIIIZ(c0gxb2, Integer.valueOf(iLIZIZ), 0, Integer.valueOf(iLIZIZ), Integer.valueOf((int) C497740JfY.LIZIZ(10.0f)), false, 16);
                        }
                    }
                    c1835970xsR.LJIIIZ(0.0f, true);
                }
                VideoMetaInfo videoMetaInfo3 = liveFragmentDetail2.mp4VideoMetaInfo;
                this.LLJJIJIL = videoMetaInfo3 != null ? (int) videoMetaInfo3.duration : 0;
                TuxTextView tuxTextView = this.LLJJIJI;
                if (tuxTextView != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(" / ");
                    sbLIZ3.append(C1765690w35.LIZ(this.LLJJIJIL));
                    tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            c1835970xsR.setSeekbarTouchCallback(new AwS606S0100000_27(this, 127));
        }
        C1835920xsM c1835920xsM = this.LLJJ;
        if (c1835920xsM == null || (liveFragmentDetail = this.LLILLJJLI) == null) {
            return;
        }
        C1835970xsR c1835970xsR2 = this.LLIZLLLIL;
        AwS428S0200000_27 awS428S0200000_27 = new AwS428S0200000_27(this, c1835920xsM, 17);
        AwS393S0200000_27 awS393S0200000_27 = new AwS393S0200000_27(this, c1835920xsM, 36);
        List listLIZIZ = C1835390xrV.LIZIZ(liveFragmentDetail.spriteList);
        if (listLIZIZ == null) {
            listLIZIZ = C13BV.INSTANCE;
        }
        Iterator it2 = listLIZIZ.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            i2 += ((IHostSubscription.SpriteImage) it2.next()).spriteNum;
        }
        c1835920xsM.LLILLJJLI = new C1290330jgN(listLIZIZ, new AwS132S0101000_26(c1835920xsM, i2, 9));
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add("");
        }
        if (i2 > 0) {
            c1835920xsM.LL.LLILLJJLI = (C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(32.0f))) / i2;
        }
        ((ArrayList) c1835920xsM.LL.LL).addAll(arrayList);
        c1835920xsM.LLJILJIL.setAdapter(c1835920xsM.LL);
        c1835920xsM.LLILLL = c1835970xsR2;
        c1835920xsM.LLILZ = awS393S0200000_27;
        VideoMetaInfo videoMetaInfo4 = liveFragmentDetail.mp4VideoMetaInfo;
        c1835920xsM.LLILZIL = videoMetaInfo4 != null ? (int) videoMetaInfo4.duration : 1;
        if (c1835970xsR2 != null) {
            c1835970xsR2.setStartAndPauseCallback(c1835920xsM.LLJI);
            c1835970xsR2.setCurrentPercentage(c1835920xsM.LLJ);
        }
        C1835960xsQ c1835960xsQ = c1835920xsM.LLJIJIL;
        int i4 = c1835920xsM.LLILZIL;
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c1835970xsR2, 1286);
        AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(c1835970xsR2, 502);
        new AwS606S0100000_27(c1835970xsR2, 494);
        c1835960xsQ.LLJJIJI = awS571S0100000_27;
        c1835960xsQ.LLJJIII = awS606S0100000_27;
        c1835960xsQ.LLLFZ = c1835960xsQ.LLLFFI / i4;
        c1835960xsQ.LLLI = awS428S0200000_27;
        float f = ((View) c1835960xsQ.getParent()).getLayoutParams().height;
        C1836130xsh<Float> c1836130xsh = c1835960xsQ.LLILZ;
        int layoutDirection = c1835960xsQ.getResources().getConfiguration().getLayoutDirection();
        Float fValueOf = Float.valueOf(c1835960xsQ.LLJ);
        Float fValueOf2 = Float.valueOf((c1835960xsQ.LLLFFI - (c1835960xsQ.LLLFZ * c1835960xsQ.LLJZ)) + c1835960xsQ.LLJ);
        if (layoutDirection != 0) {
            fValueOf = fValueOf2;
        }
        c1836130xsh.LIZJ(fValueOf);
        C1836130xsh<Float> c1836130xsh2 = c1835960xsQ.LLILZIL;
        int layoutDirection2 = c1835960xsQ.getResources().getConfiguration().getLayoutDirection();
        Float fValueOf3 = Float.valueOf(c1835960xsQ.LLILZ.LIZIZ.floatValue() + (c1835960xsQ.LLLFZ * c1835960xsQ.LLJZ));
        Float fValueOf4 = Float.valueOf(c1835960xsQ.LLLFFI + c1835960xsQ.LLJ);
        if (layoutDirection2 != 0) {
            fValueOf3 = fValueOf4;
        }
        c1836130xsh2.LIZJ(fValueOf3);
        c1835960xsQ.LLJILJILJ = new RectF(c1835960xsQ.LLILZ.LIZIZ.floatValue() - c1835960xsQ.LLJ, 0.0f, c1835960xsQ.LLILZ.LIZIZ.floatValue(), f);
        c1835960xsQ.LLJILLL = new RectF(c1835960xsQ.LLILZIL.LIZIZ.floatValue(), c1835960xsQ.LLJILJILJ.top, c1835960xsQ.LLILZIL.LIZIZ.floatValue() + c1835960xsQ.LLJ, c1835960xsQ.LLJILJILJ.bottom);
        c1835960xsQ.LLJJ = new RectF(c1835960xsQ.LLILZ.LIZIZ.floatValue(), c1835960xsQ.LLJILJILJ.top, c1835960xsQ.LLILZIL.LIZIZ.floatValue(), c1835960xsQ.LLJILJILJ.top + c1835960xsQ.LLJILJIL);
        c1835960xsQ.LLJJI = new RectF(c1835960xsQ.LLILZ.LIZIZ.floatValue(), c1835960xsQ.LLJILJILJ.bottom - c1835960xsQ.LLJILJIL, c1835960xsQ.LLILZIL.LIZIZ.floatValue(), c1835960xsQ.LLJILJILJ.bottom);
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        RectF rectF = c1835960xsQ.LLJJJJ.LIZIZ;
        rectF.top = fLIZIZ;
        rectF.bottom = f - fLIZIZ;
        c1835960xsQ.LLJJJIL.LIZJ(c1835960xsQ.LLILZ.LIZIZ);
        C16G6.LIZIZ(c1835960xsQ.LLJZIJLIL, c1835960xsQ.getLayoutDirection());
        C16G6.LIZIZ(c1835960xsQ.LLL, c1835960xsQ.getLayoutDirection());
        c1835920xsM.LLILZLL = c1835920xsM.LLJIJIL.getScrollWidth();
        C1836280xsw.LIZIZ(c1835920xsM.LLJIJIL.getPlayHeadCenterX(), new AwS606S0100000_27(c1835920xsM, 496));
    }

    public final void SR() {
        ConstraintLayout constraintLayout = this.LLILLL;
        if (constraintLayout == null || this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        int height = constraintLayout.getHeight() > 0 ? constraintLayout.getHeight() : constraintLayout.getMeasuredHeight();
        if (height <= 0) {
            HandlerHook.viewPost(constraintLayout, new ARunnableS127S0100000_27(this, 20));
            return;
        }
        this.LLJL = height;
        constraintLayout.setMinimumHeight(height);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.height = this.LLJL;
        C786410Ut5.m6(constraintLayout, layoutParams);
        this.LLJJLIIIJLLLLLLLZ = true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1488060opI c1488060opI = this.LLJI;
        if (c1488060opI != null) {
            c1488060opI.release();
        }
        LiveDialog liveDialog = this.LLJZIJLIL;
        if (liveDialog != null) {
            liveDialog.dismiss();
            C785410UrT.LIZ(liveDialog);
        }
        AnimatorSet animatorSet = this.LLJJJJJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJJJJJIL = null;
        AnonymousClass0956 anonymousClass0956 = this.LLJLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    public final ValueAnimator NR(float f) {
        final CardView cardView = this.LLILZLL;
        if (cardView == null || this.LLJJJJLIIL <= 0 || this.LLJJL <= 0) {
            return null;
        }
        final int width = cardView.getWidth();
        final int height = cardView.getHeight();
        final int i = (int) (this.LLJJJJLIIL * f);
        final int i2 = (int) (this.LLJJL * f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.LLL);
        valueAnimatorOfFloat.setInterpolator(this.LLLFF);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0xsN
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.LayoutParams layoutParams;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int i3 = (int) (width + ((i - r2) * animatedFraction));
                int i4 = (int) (height + ((i2 - r2) * animatedFraction));
                ViewGroup.LayoutParams layoutParams2 = cardView.getLayoutParams();
                if (layoutParams2.width != i3 || layoutParams2.height != i4) {
                    layoutParams2.width = i3;
                    layoutParams2.height = i4;
                    C786410Ut5.j6(cardView, layoutParams2);
                }
                C1835970xsR c1835970xsR = this.LLIZLLLIL;
                if (c1835970xsR != null) {
                    layoutParams = c1835970xsR.getLayoutParams();
                    if (layoutParams != null) {
                        if (layoutParams.width != i3 || layoutParams.height != i4) {
                            layoutParams.width = i3;
                            layoutParams.height = i4;
                        } else {
                            return;
                        }
                    }
                } else {
                    layoutParams = null;
                }
                C1835970xsR c1835970xsR2 = this.LLIZLLLIL;
                if (c1835970xsR2 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1835970xsR2);
                    c1835970xsR2.setLayoutParams(layoutParams);
                }
            }
        });
        return valueAnimatorOfFloat;
    }

    public final void OR(final boolean z) {
        ObjectAnimator objectAnimatorOfFloat;
        if (!this.LLJJJ) {
            return;
        }
        AnimatorSet animatorSet = this.LLJJJJJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View view = this.LLJIJIL;
        int i = 0;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
            C786410Ut5.T4(view, 0.0f);
        }
        List listLJIJI = C13LQ.LJIJI(new View[]{this.LLILZIL, this.LLJILJIL, this.LLJ, this.LLJIJIL});
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIJI, 10));
        for (View view2 : (ArrayList) listLJIJI) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, view2.getAlpha(), 1.0f);
            objectAnimatorOfFloat2.setDuration(this.LLL);
            objectAnimatorOfFloat2.setInterpolator(this.LLLFF);
            arrayList.add(objectAnimatorOfFloat2);
        }
        View view3 = this.LLJILLL;
        ObjectAnimator objectAnimatorOfFloat3 = null;
        if (view3 != null) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, view3.getAlpha(), 0.0f);
            objectAnimatorOfFloat.setDuration(this.LLL);
            objectAnimatorOfFloat.setInterpolator(this.LLLFFI);
        } else {
            objectAnimatorOfFloat = null;
        }
        View view4 = this.LLJILLL;
        if (view4 != null) {
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.TRANSLATION_Y, view4.getTranslationY(), this.LLLF);
            objectAnimatorOfFloat3.setDuration(this.LLL);
            objectAnimatorOfFloat3.setInterpolator(this.LLLFFI);
        }
        ValueAnimator valueAnimatorNR = NR(1.0f);
        int i2 = this.LLJLIL;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.LLJLILLLLZIIL;
        if (i3 >= 0) {
            i = i3;
        }
        ValueAnimator valueAnimatorMR = MR(i2, i);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        if (objectAnimatorOfFloat != null) {
            arrayList2.add(objectAnimatorOfFloat);
        }
        if (objectAnimatorOfFloat3 != null) {
            arrayList2.add(objectAnimatorOfFloat3);
        }
        if (valueAnimatorNR != null) {
            arrayList2.add(valueAnimatorNR);
        }
        if (valueAnimatorMR != null) {
            arrayList2.add(valueAnimatorMR);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList2);
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: X.0xsL
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.LL.LLJJJJJIL = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C1835960xsQ scrollHandle$live_release;
                C1835960xsQ scrollHandle$live_release2;
                C1835970xsR c1835970xsR;
                if (C1835120xr4.LIZ == EnumC1508960pN0.PLAYER_PAUSE && (c1835970xsR = this.LL.LLIZLLLIL) != null) {
                    c1835970xsR.LJIIIZ(0.0f, false);
                }
                View view5 = this.LL.LLJILLL;
                if (view5 != null) {
                    C786410Ut5.LJLLLLLL(8, view5);
                    C786410Ut5.T4(view5, 1.0f);
                    C786410Ut5.ed(view5, 0.0f);
                }
                TuxTextView tuxTextView = this.LL.LLILZ;
                if (tuxTextView != null) {
                    tuxTextView.setText(C497740JfY.LJIJI(2131852409));
                }
                HighlightPreviewClipFragment highlightPreviewClipFragment = this.LL;
                highlightPreviewClipFragment.LLJJJ = false;
                C1835920xsM c1835920xsM = highlightPreviewClipFragment.LLJJ;
                if (c1835920xsM != null && (scrollHandle$live_release2 = c1835920xsM.getScrollHandle$live_release()) != null) {
                    scrollHandle$live_release2.setInClipMode$live_release(false);
                }
                C1835920xsM c1835920xsM2 = this.LL.LLJJ;
                if (c1835920xsM2 != null && (scrollHandle$live_release = c1835920xsM2.getScrollHandle$live_release()) != null) {
                    scrollHandle$live_release.setClipped$live_release(!z);
                }
                HighlightPreviewClipFragment highlightPreviewClipFragment2 = this.LL;
                highlightPreviewClipFragment2.LLJJJJJIL = null;
                ConstraintLayout constraintLayout = highlightPreviewClipFragment2.LLILLL;
                if (constraintLayout != null && highlightPreviewClipFragment2.LLJJLIIIJLLLLLLLZ) {
                    constraintLayout.setMinimumHeight(0);
                    ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                    layoutParams.height = -2;
                    C786410Ut5.m6(constraintLayout, layoutParams);
                    highlightPreviewClipFragment2.LLJJLIIIJLLLLLLLZ = false;
                }
            }
        });
        animatorSet2.start();
        this.LLJJJJJIL = animatorSet2;
    }

    public final void UR(String str) {
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        String str6;
        String str7;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> map = this.LL;
        String str8 = "";
        if (map == null || (str2 = map.get("anchor_id")) == null) {
            str2 = "";
        }
        linkedHashMap.put("anchor_id", str2);
        linkedHashMap.put("viewer_user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        Map<String, String> map2 = this.LL;
        if (map2 == null || (str3 = map2.get("room_id")) == null) {
            str3 = "";
        }
        linkedHashMap.put("room_id", str3);
        linkedHashMap.put("post_type", "quick_post");
        LiveFragmentDetail liveFragmentDetail = this.LLILLJJLI;
        if (liveFragmentDetail != null) {
            i = liveFragmentDetail.fragmentTypeNew;
        } else {
            i = 100;
        }
        linkedHashMap.put("fragment_type", String.valueOf(i));
        Map<String, String> map3 = this.LL;
        if (map3 == null || (str4 = map3.get("fragment_id")) == null) {
            str4 = "";
        }
        linkedHashMap.put("fragment_id", str4);
        Map<String, String> map4 = this.LL;
        if (map4 == null || (str5 = map4.get("enter_from_page")) == null) {
            str5 = "";
        }
        linkedHashMap.put("enter_from_page", str5);
        Map<String, String> map5 = this.LL;
        if (map5 == null || (str6 = map5.get("enter_method")) == null) {
            str6 = "";
        }
        linkedHashMap.put("enter_method", str6);
        Map<String, String> map6 = this.LL;
        if (map6 != null && (str7 = map6.get("enter_from")) != null) {
            str8 = str7;
        }
        linkedHashMap.put("enter_from", str8);
        linkedHashMap.put("click_type", str);
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("click_type", str);
        if (Intrinsics.LJFF(str, "show")) {
            C485260J1g.LIZ.getClass();
            C20684815ws.LJIILLIIL("livesdk_fans_highlight_card_show", linkedHashMap);
        } else {
            linkedHashMap.put("click_position", str);
            C485260J1g.LIZ.getClass();
            C20684815ws.LJIILLIIL("livesdk_fans_highlight_card_click", linkedHashMap);
        }
    }

    public final void VR(boolean z) {
        String str;
        String idStr;
        ILiveOuterService iLiveOuterService;
        InterfaceC1488720oqM interfaceC1488720oqMW4;
        Map<String, String> map = this.LL;
        if (map == null || (str = map.get("room_id")) == null) {
            str = "";
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (roomLJJLI != null) {
            idStr = roomLJJLI.getIdStr();
        } else {
            idStr = null;
        }
        if (Intrinsics.LJFF(str, idStr) && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC1488720oqMW4 = iLiveOuterService.w4()) != null) {
            interfaceC1488720oqMW4.setCurrentPlayerMute(z);
        }
    }

    public HighlightPreviewClipFragment(Map<String, String> map, LiveFragmentDetail liveFragmentDetail) {
        this.LL = map;
        this.LLILLJJLI = liveFragmentDetail;
        this.LLJJIJIIJIL = true;
        this.LLJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
        this.LLJLILLLLZIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLJLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(121));
        this.LLJLLL = "";
        this.LLJZ = "";
        this.LLL = 150L;
        this.LLLF = (int) C497740JfY.LIZIZ(165.0f);
        this.LLLFF = new LinearInterpolator();
        this.LLLFFI = C1619980sG4.LJIILIIL();
    }

    public final ValueAnimator MR(final int i, final int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        final TuxIconView tuxIconView = this.LLJILJILJ;
        if (tuxIconView == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return null;
        }
        final int i3 = marginLayoutParams.bottomMargin;
        final int marginEnd = marginLayoutParams.getMarginEnd();
        if (i3 == i && marginEnd == i2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.LLL);
        valueAnimatorOfFloat.setInterpolator(this.LLLFFI);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0xsO
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int i4 = (int) (i3 + ((i - r2) * animatedFraction));
                int i5 = (int) (marginEnd + ((i2 - r2) * animatedFraction));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) tuxIconView.getLayoutParams();
                marginLayoutParams2.bottomMargin = i4;
                marginLayoutParams2.setMarginEnd(i5);
                C786410Ut5.M6(tuxIconView, marginLayoutParams2);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        this.LLILLL = (ConstraintLayout) view.findViewById(R.id.jnh);
        ImageView imageView = (ImageView) view.findViewById(R.id.jnb);
        TuxTextView tuxTextView = null;
        if (imageView != null) {
            C786410Ut5.I7(new AkS94S0100000_27(this, 31), imageView);
        } else {
            imageView = null;
        }
        this.LLILZIL = imageView;
        this.LLILZ = (TuxTextView) view.findViewById(R.id.jnk);
        this.LLILZLL = (CardView) view.findViewById(R.id.jn5);
        View viewFindViewById = view.findViewById(R.id.jnf);
        if (viewFindViewById != null) {
            int screenWidth = ScreenUtils.getScreenWidth(viewFindViewById.getContext()) - ((int) C497740JfY.LIZIZ(142.0f));
            int i = (int) (((double) screenWidth) * 1.777d);
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = screenWidth;
                layoutParams2.height = i;
            }
            C786410Ut5.W5(viewFindViewById, layoutParams2);
        } else {
            viewFindViewById = null;
        }
        this.LLIZ = viewFindViewById;
        C1835970xsR c1835970xsR = (C1835970xsR) view.findViewById(R.id.jng);
        if (c1835970xsR != null) {
            c1835970xsR.setGeneralPopup$live_release(true);
            int screenWidth2 = ScreenUtils.getScreenWidth(c1835970xsR.getContext()) - ((int) C497740JfY.LIZIZ(142.0f));
            this.LLJJJJLIIL = screenWidth2;
            this.LLJJL = (int) (((double) screenWidth2) * 1.777d);
            CardView cardView = this.LLILZLL;
            if (cardView != null) {
                layoutParams = cardView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = this.LLJJJJLIIL;
                    layoutParams.height = this.LLJJL;
                }
            } else {
                layoutParams = null;
            }
            CardView cardView2 = this.LLILZLL;
            if (cardView2 != null) {
                C786410Ut5.j6(cardView2, layoutParams);
            }
            C1835980xsS playerMaskFromXml = c1835970xsR.getPlayerMaskFromXml();
            if (playerMaskFromXml != null) {
                playerMaskFromXml.LLJJIJI = true;
                if (!playerMaskFromXml.LLJJIII) {
                    playerMaskFromXml.LJ(2);
                }
                C376400EpK playCenterFromXml = playerMaskFromXml.getPlayCenterFromXml();
                int visibility = playCenterFromXml.getVisibility();
                playCenterFromXml.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, playCenterFromXml);
            }
        } else {
            c1835970xsR = null;
        }
        this.LLIZLLLIL = c1835970xsR;
        this.LLJIJIL = view.findViewById(R.id.jn_);
        View viewFindViewById2 = view.findViewById(R.id.jnm);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new AkS94S0100000_27(this, 33), viewFindViewById2);
        }
        View viewFindViewById3 = view.findViewById(R.id.jno);
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(new AkS94S0100000_27(this, 34), viewFindViewById3);
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.jne);
        if (tuxIconView != null) {
            C786410Ut5.I7(new AkS94S0100000_27(this, 35), tuxIconView);
        } else {
            tuxIconView = null;
        }
        this.LLJILJIL = tuxIconView;
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.jnn);
        if (tuxIconView2 != null) {
            C786410Ut5.I7(new AkS64S0200000_27(this, tuxIconView2, 17), tuxIconView2);
        } else {
            tuxIconView2 = null;
        }
        this.LLJILJILJ = tuxIconView2;
        this.LLJILLL = view.findViewById(R.id.jn9);
        this.LLJJI = (TuxTextView) view.findViewById(R.id.jni);
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.jnc);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.jnl);
        if (tuxTextView2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" / ");
            sbLIZ.append(C1765690w35.LIZ(this.LLJJIJIL));
            tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ));
            tuxTextView = tuxTextView2;
        }
        this.LLJJIJI = tuxTextView;
        View viewFindViewById4 = view.findViewById(R.id.jna);
        if (viewFindViewById4 != null) {
            C786410Ut5.I7(new AkS94S0100000_27(this, 32), viewFindViewById4);
        }
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.jnd);
        if (tuxTextView3 != null) {
            C786410Ut5.I7(new AkS64S0200000_27(this, tuxTextView3, 18), tuxTextView3);
        }
        this.LLJJ = (C1835920xsM) view.findViewById(R.id.jnj);
        RR();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.BQ2(this, this, GeneralHighlightRoomEndEvent.class, new AwS606S0100000_27(this, 128));
        if (this.LLJZ.length() > 0) {
            dataChannelGlobal.FQ2(GeneralHighlightPreviewEnterEvent.class, this.LLJZ);
        }
        UR("show");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        Map<String, String> map;
        String str2;
        boolean z;
        Map<String, String> map2 = this.LL;
        String str3 = "";
        if (map2 == null || (str = map2.get("room_id")) == null) {
            str = "";
        }
        this.LLJLLL = str;
        LiveFragmentDetail liveFragmentDetail = this.LLILLJJLI;
        if (liveFragmentDetail == null ? !((map = this.LL) == null || (str2 = map.get("fragment_id")) == null) : (str2 = liveFragmentDetail.fragmentIdStr) != null) {
            str3 = str2;
        }
        this.LLJZ = str3;
        C19GS c19gs = null;
        if (this.LLILLJJLI == null) {
            if (str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                PR();
                C1835140xr6 c1835140xr6 = C1835140xr6.LL;
                C1835140xr6.LJI(2131852402);
            } else {
                AnonymousClass0956 anonymousClass0956 = this.LLJLLIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                C1835140xr6 c1835140xr62 = C1835140xr6.LL;
                this.LLJLLIL = C1835140xr6.LIZJ(this.LLJZ, new AwS641S0100000_27(this, 134));
            }
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ddw, viewGroup, false);
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
