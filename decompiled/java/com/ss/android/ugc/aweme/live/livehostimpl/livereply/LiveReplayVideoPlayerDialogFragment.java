package com.ss.android.ugc.aweme.live.livehostimpl.livereply;

import X.AbstractC848400XPy;
import X.AnonymousClass0112;
import X.AnonymousClass1689;
import X.C098200Yq;
import X.C0TVI;
import X.C0TZ2;
import X.C0TZ3;
import X.C0XQ7;
import X.C1161920gLG;
import X.C11NZ;
import X.C1300480jwk;
import X.C1488060opI;
import X.C14K9;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1766560w4U;
import X.C1833990xpF;
import X.C1834040xpK;
import X.C1834190xpZ;
import X.C1834240xpe;
import X.C1834680xqM;
import X.C1834710xqP;
import X.C1834730xqR;
import X.C1835180xrA;
import X.C1835970xsR;
import X.C1835980xsS;
import X.C1836420xtA;
import X.C1848410yCV;
import X.C189200o6;
import X.C19736512Jv;
import X.C19EG;
import X.C19GS;
import X.C1EOY;
import X.C20337914i1;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2344009Gk;
import X.C376400EpK;
import X.C384050F3z;
import X.C389001fE;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C444960Hcc;
import X.C465520INi;
import X.C470590Icr;
import X.C473410IhP;
import X.C494720Jag;
import X.C494730Jah;
import X.C497740JfY;
import X.C500260Jjc;
import X.C755620TkW;
import X.C755630TkX;
import X.C761730TuN;
import X.C766270U4b;
import X.C782110Um9;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1488080opK;
import X.InterfaceC1833600xoc;
import X.InterfaceC1834200xpa;
import X.InterfaceC1835090xr1;
import X.InterfaceC1836050xsZ;
import X.InterfaceC743640TFa;
import X.InterfaceC836760Ws6;
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS123S0100000_23;
import Y.ATListenerS459S0100000_27;
import Y.AcS498S0100000_27;
import Y.AfS10S0100100_27;
import Y.AfS196S0100000_27;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import avg.f;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData;
import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayVideoGoClipMinimumDurationSetting;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayKeepScreenOnEnableSetting;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayPlayerUnregisterDataChannelSetting;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayVideoFirstFrameOptEnableSetting;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayVideoPreloadSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPerformanceMonitor;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import mf.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
@InterfaceC836760Ws6
public final class LiveReplayVideoPlayerDialogFragment extends GlobalHookDialogFragment implements InterfaceC1834200xpa {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiklHELIOSPyohLTUgMGEfITMpGyojJCQ1HyY3LSocJS4qLTcIIC4/JyIKOy40JSAiPQ==";
    public C761730TuN LL;
    public ImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public ImageView LLILZIL;
    public ImageView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public ConstraintLayout LLJ;
    public C1749280vcc LLJI;
    public C1488060opI LLJIJIL;
    public C1835970xsR LLJILJIL;
    public C1835980xsS LLJILJILJ;
    public ConstraintLayout LLJILLL;
    public ConstraintLayout LLJJ;
    public C376400EpK LLJJI;
    public ImageView LLJJIII;
    public ConstraintLayout LLJJIJI;
    public int LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public long LLJJJJJIL;
    public Boolean LLJJJJLIIL;
    public long LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public C19736512Jv LLJL;
    public boolean LLJLIL;
    public int LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public C1834680xqM LLJZIJLIL;
    public int LLLI;
    public boolean LLLII;
    public String LLLIIII;
    public int LLLIIIIL;
    public int LLLIIIL;
    public InterfaceC1835090xr1 LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZLLLI;
    public long LLLIZZ;
    public long LLLJ;
    public long LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;
    public RoomReplay LLLLIIIILLL;
    public String LLJJIJIIJIL = "";
    public String LLJJIJIL = "";
    public boolean LLJLILLLLZIIL = true;
    public String LLL = "";
    public String LLLF = "";
    public String LLLFF = "";
    public String LLLFFI = "";
    public String LLLFZ = "";
    public final int LLLILZJ = LiveReplayVideoGoClipMinimumDurationSetting.getMinimumDuration();
    public final AwS571S0100000_27 LLLLII = new AwS571S0100000_27(this, 295);
    public final long LLLILZ = System.currentTimeMillis();
    public final LiveReplayVideoPlayerDialogFragment$observer$1 LLLLIIL = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment$observer$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_RESUME) {
                onResume();
                return;
            }
            if (event == Lifecycle.Event.ON_PAUSE) {
                onPause();
            } else if (event == Lifecycle.Event.ON_STOP) {
                onStop();
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            C1835970xsR c1835970xsR = this.LL.LLJILJIL;
            if (c1835970xsR != null) {
                c1835970xsR.LIZIZ();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            C1835970xsR c1835970xsR = this.LL.LLJILJIL;
            if (c1835970xsR != null) {
                HandlerHook.viewPost(c1835970xsR, new ARunnableS123S0100000_23(c1835970xsR, 30));
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onStop() {
            InterfaceC1836050xsZ interfaceC1836050xsZ;
            C1835970xsR c1835970xsR = this.LL.LLJILJIL;
            if (c1835970xsR == null || (interfaceC1836050xsZ = c1835970xsR.LLJJJIL) == null) {
                return;
            }
            interfaceC1836050xsZ.stop();
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPause() {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w4().setCurrentPlayerMute(false);
            C1835970xsR c1835970xsR = this.LL.LLJILJIL;
            if (c1835970xsR != null) {
                c1835970xsR.LIZJ();
            }
        }
    };

    public final void MR() {
        if (TextUtils.isEmpty(this.LLLF)) {
            return;
        }
        C1834710xqP c1834710xqPLIZJ = C1834710xqP.LIZJ();
        String str = this.LLL;
        String str2 = this.LLJJIJIIJIL;
        c1834710xqPLIZJ.getClass();
        int iLIZLLL = C1834710xqP.LIZLLL(str, str2);
        if (iLIZLLL == 1 || iLIZLLL == 3) {
            PR();
            return;
        }
        if (aS().getShowingScheduledImage()) {
            oS();
            return;
        }
        if (this.LLLIL) {
            return;
        }
        this.LLLIL = true;
        C11NZ<C470590Icr<AnchorReplayInfoData>> c11nzCheckScheduledLiveReplayVideoTask = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).checkScheduledLiveReplayVideoTask(false, Long.valueOf(CastLongProtector.parseLong(this.LLLF)), Boolean.FALSE, null, Boolean.valueOf(this.LLJZ));
        if (c11nzCheckScheduledLiveReplayVideoTask != null) {
            c11nzCheckScheduledLiveReplayVideoTask.LJJLL(new AfS196S0100000_27(this, 21), new AfS196S0100000_27(this, 22));
        }
    }

    public final C2344009Gk NR() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", this.LLLIIII);
        c2344009Gk.LJIIIIZZ("room_id", this.LLLF);
        c2344009Gk.LJIIIIZZ("video_url", this.LLJJIJIIJIL);
        c2344009Gk.LJIIIIZZ("enter_from_page", this.LLLFF);
        c2344009Gk.LJIIIIZZ("enter_from", this.LLLFFI);
        c2344009Gk.LJIIIIZZ("last_page", this.LLLFZ);
        c2344009Gk.LIZJ(this.LLJJJ, "video_duration");
        c2344009Gk.LJIIIIZZ("replay_type", "normal");
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "replay_video");
        c2344009Gk.LJIIIIZZ("event_page", "video_page");
        return c2344009Gk;
    }

    public final void OR() {
        String str = this.LLLF;
        C1834040xpK.LIZ = str;
        C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1833600xoc.ya;
        Map<String, String> mapLIZIZ = c20337914i1.LIZIZ();
        mapLIZIZ.remove(str);
        c20337914i1.LJFF(mapLIZIZ);
        C1834710xqP c1834710xqPLIZJ = C1834710xqP.LIZJ();
        String str2 = this.LLLF;
        c1834710xqPLIZJ.getClass();
        C1836420xtA.LJFF().getClass();
        DownloadInfo downloadInfoLIZLLL = C1836420xtA.LIZLLL(str2);
        C1834710xqP c1834710xqPLIZJ2 = C1834710xqP.LIZJ();
        C19EG activity = getActivity();
        String url = downloadInfoLIZLLL != null ? downloadInfoLIZLLL.getUrl() : null;
        String str3 = this.LLLF;
        c1834710xqPLIZJ2.getClass();
        C1834710xqP.LJI(activity, 1, url, str3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PR() {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment.PR():void");
    }

    public final ImageView RR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.j2o) : null;
            this.LLILLJJLI = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final ImageView SR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jvt) : null;
            this.LLILZLL = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final TuxTextView UR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.mtq) : null;
            this.LLILZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView VR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.mz0) : null;
            this.LLIZLLLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView WR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.myz) : null;
            this.LLIZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView ZR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.n5k) : null;
            this.LLILLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C761730TuN aS() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.n9f) : null;
            this.LL = (C761730TuN) viewFindViewById;
        }
        return (C761730TuN) viewFindViewById;
    }

    public final C1749280vcc bS() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t77) : null;
            this.LLJI = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        if (!this.LLJLILLLLZIIL) {
            super.dismiss();
            return;
        }
        C19EG c19egLJ = C500260Jjc.LJ(getContext());
        if (c19egLJ != null) {
            c19egLJ.finish();
        }
    }

    public final void iS() {
        String strLIZIZ;
        if (this.LLJJIJIIJIL.length() == 0) {
            return;
        }
        Video video = new Video();
        if (!LiveReplayVideoPreloadSetting.INSTANCE.isEnable() || this.LLJJIJIL.length() <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("live_replay_video_");
            sbLIZ.append(this.LLJJIJIIJIL);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = this.LLJJIJIL;
        }
        LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
        localVideoUrlModel.setSourceId(strLIZIZ);
        localVideoUrlModel.setUrlKey(strLIZIZ);
        localVideoUrlModel.setUrlList(new ArrayList());
        localVideoUrlModel.getUrlList().add(this.LLJJIJIIJIL);
        video.setPlayAddr(localVideoUrlModel);
        video.setVideoLength(video.getVideoLength() * LSPassThroughRecordSizeConfig.DEFAULT);
        C1488060opI c1488060opI = this.LLJIJIL;
        if (c1488060opI != null) {
            c1488060opI.LIZLLL = video;
            c1488060opI.LJ = "replay_video";
        }
        C1835970xsR c1835970xsR = this.LLJILJIL;
        if (c1835970xsR != null) {
            new C1834730xqR();
            C1834730xqR c1834730xqR = new C1834730xqR();
            c1834730xqR.LIZ = this.LLJIJIL;
            C19EG activity = getActivity();
            c1834730xqR.LIZIZ = activity != null ? activity.getWindow() : null;
            c1834730xqR.LIZJ = Long.valueOf(c1835970xsR.getVideoLength$live_release() * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            Dialog dialog = getDialog();
            c1834730xqR.LIZIZ = dialog != null ? dialog.getWindow() : null;
            c1834730xqR.LJ = true;
            c1834730xqR.LIZLLL = false;
            c1834730xqR.LJFF = true;
            c1835970xsR.setParams(c1834730xqR);
            C786410Ut5.LLLLLLLLL(c1835970xsR.getSliderCustomIconFromXml(), 0);
            c1835970xsR.LJIIIZ(0.0f, false);
            C20684815ws.LJIILLIIL("livesdk_video_request", NR().LIZ);
            this.LLLJIL = System.currentTimeMillis();
        }
    }

    public final void oS() {
        C782110Um9 c782110Um9 = new C782110Um9(getContext());
        c782110Um9.LJIIZILJ(2131842564);
        c782110Um9.LJII(2131842563);
        C494720Jag c494720Jag = new C494720Jag();
        C755620TkW c755620TkW = new C755620TkW();
        c755620TkW.LIZ = C497740JfY.LJIJI(2131842561);
        c755620TkW.LIZJ = new AcS498S0100000_27(this, 2);
        c494720Jag.LIZ(new C0TZ2(c755620TkW));
        C755630TkX c755630TkX = new C755630TkX();
        c755630TkX.LIZ = C497740JfY.LJIJI(2131842562);
        c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0xqL
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        };
        c494720Jag.LIZ(new C0TZ3(c755630TkX));
        c494720Jag.LIZIZ = 2;
        c782110Um9.LIZJ(new C494730Jah(c494720Jag));
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
        wS("livesdk_live_replay_click", "already_scheduled");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C465520INi.LIZ.qu1();
        C1833990xpF.LIZIZ(this.LLLF, "video_page");
        if (!this.LLLII) {
            C2344009Gk c2344009GkNR = NR();
            c2344009GkNR.LJIIIIZZ("cancel_type", "leave_page");
            C20684815ws.LJIILLIIL("livesdk_video_play_cancel", c2344009GkNR.LIZ);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLILZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C2344009Gk c2344009GkNR2 = NR();
        c2344009GkNR2.LIZLLL(jCurrentTimeMillis / ((long) LSPassThroughRecordSizeConfig.DEFAULT), "duration");
        c2344009GkNR2.LJIIIIZZ("access_identity", C1834240xpe.LIZJ(this.LLJLL));
        c2344009GkNR2.LIZJ(C500260Jjc.LJJJI(Boolean.valueOf(this.LLLJL)) ? 1 : 0, "is_video_start");
        c2344009GkNR2.LJIIIIZZ("cancel_type", this.LLLJL ? "" : "leave_page");
        if (this.LLJLL != 0) {
            c2344009GkNR2.LJFF("viewer_user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        }
        C20684815ws.LJIILLIIL("livesdk_live_replay_play_end", c2344009Gk.LIZ);
        C389001fE.LIZ("onLiveReplayVideoPlayerDialogDestroy", new JSONObject(), System.currentTimeMillis(), false);
        C1834680xqM c1834680xqM = this.LLJZIJLIL;
        if (c1834680xqM != null) {
            C1834710xqP.LIZJ().getClass();
            C1836420xtA.LJFF().LIZIZ.remove(TextUtils.isEmpty(c1834680xqM.LIZIZ) ? c1834680xqM.LIZ : c1834680xqM.LIZIZ);
        }
        C1834710xqP c1834710xqPLIZJ = C1834710xqP.LIZJ();
        String str = this.LLL;
        String str2 = this.LLLF;
        c1834710xqPLIZJ.getClass();
        int iLIZLLL = C1834710xqP.LIZLLL(str, str2);
        if (iLIZLLL != 2 && iLIZLLL != 4) {
            C1834710xqP c1834710xqPLIZJ2 = C1834710xqP.LIZJ();
            String str3 = this.LLL;
            String str4 = this.LLLF;
            C1835180xrA c1835180xrA = new C1835180xrA(str3, str4);
            c1834710xqPLIZJ2.getClass();
            C1834710xqP.LJ(str3, str4, c1835180xrA);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.JQ2(AnonymousClass1689.class, Boolean.FALSE);
        this.LLJIJIL = null;
        C1835970xsR c1835970xsR = this.LLJILJIL;
        if (c1835970xsR != null) {
            c1835970xsR.LIZIZ();
        }
        this.LLJILJIL = null;
        C19EG activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
        super.onDestroy();
        getLifecycle().removeObserver(this.LLLLIIL);
        C1834190xpZ.LIZ().LIZ.LJ(this);
        this.LLLIILIL = false;
        if (LiveReplayPlayerUnregisterDataChannelSetting.INSTANCE.getEnable()) {
            dataChannelGlobal.zQ2(this);
        }
    }

    public final void rS() {
        AnonymousClass0112 anonymousClass0112 = AnonymousClass0112.LIZ;
        C19EG activity = getActivity();
        String str = this.LLLF;
        String strValueOf = String.valueOf(this.LLJJLIIIJLLLLLLLZ);
        AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(this, 111);
        anonymousClass0112.getClass();
        AnonymousClass0112.LIZ(activity, str, strValueOf, awS606S0100000_27);
    }

    public final void gS() {
        C500260Jjc.LLFFF(aS());
        C761730TuN c761730TuNAS = aS();
        View.OnClickListener aCListenerS161S0100000_27 = new ACListenerS161S0100000_27(this, 41);
        if (C1848410yCV.LIZ) {
            aCListenerS161S0100000_27 = new f(aCListenerS161S0100000_27);
        }
        a aVar = new a(aCListenerS161S0100000_27);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c761730TuNAS);
        }
        c761730TuNAS.setOnClickListener(aVar);
    }

    public final boolean onBackPressed() {
        dismiss();
        InterfaceC1835090xr1 interfaceC1835090xr1 = this.LLLIIL;
        if (interfaceC1835090xr1 != null) {
            interfaceC1835090xr1.LIZ();
        }
        DataChannelGlobal.LLILZ.JQ2(AnonymousClass1689.class, Boolean.FALSE);
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C19EG activity;
        Window window;
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        if (!LiveReplayKeepScreenOnEnableSetting.INSTANCE.enable() || (activity = getActivity()) == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.clearFlags(128);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C473410IhP.LJ(new ARunnableS112S0100000_12(this, 197));
        if (!this.LLLL) {
            C1EOY c1eoy = C1EOY.LIZ;
            C1300480jwk c1300480jwkLIZIZ = c1eoy.LIZIZ("replay_video_play_enter");
            if (c1300480jwkLIZIZ != null) {
                c1300480jwkLIZIZ.stop();
            }
            c1eoy.LJJI();
            C1EOY.LJIILJJIL = "replay_video_play_period";
            c1eoy.LJIILLIIL();
        }
        this.LLLL = true;
        C1EOY.LIZ.LJII();
        C1833990xpF.LIZJ("video_page");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLLL) {
            C1EOY c1eoy = C1EOY.LIZ;
            c1eoy.LJJI();
            C1EOY.LJIILJJIL = "replay_video_play_period";
            c1eoy.LJIILLIIL();
        }
        C465520INi.LIZ.o41("video_page");
        C1833990xpF.LIZLLL("video_page");
    }

    public final void qS() {
        C500260Jjc.LLFFF(bS());
        C1749280vcc c1749280vccBS = bS();
        if (c1749280vccBS != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_eye_slash;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1722300uv6.LJFF = 2131856099;
            c1749280vccBS.setStatus(c1722300uv6);
        }
    }

    @Override // X.InterfaceC1834200xpa
    public final void KD(int i) {
        if (i == 1) {
            L1(2131842558);
            onBackPressed();
            OR();
        }
    }

    public final void L1(int i) {
        if (this.LLLIILIL) {
            C766270U4b.LIZLLL(i);
        }
    }

    public final void cS(RoomReplay roomReplay) {
        int i = roomReplay.status;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    this.LLL = roomReplay.downloadUrl;
                    PR();
                    return;
                } else {
                    L1(2131842154);
                    return;
                }
            }
            oS();
            return;
        }
        C782110Um9 c782110Um9 = new C782110Um9(getContext());
        c782110Um9.LJIIZILJ(2131842568);
        c782110Um9.LJII(2131842567);
        C494720Jag c494720Jag = new C494720Jag();
        C755620TkW c755620TkW = new C755620TkW();
        c755620TkW.LIZ = C497740JfY.LJIJI(2131842559);
        c755620TkW.LIZJ = new AcS498S0100000_27(this, 8);
        c494720Jag.LIZ(new C0TZ2(c755620TkW));
        C755630TkX c755630TkX = new C755630TkX();
        c755630TkX.LIZ = C497740JfY.LJIJI(2131842566);
        c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0xqz
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        };
        c494720Jag.LIZ(new C0TZ3(c755630TkX));
        c494720Jag.LIZIZ = 2;
        c782110Um9.LIZJ(new C494730Jah(c494720Jag));
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
        wS("livesdk_live_replay_click", "schedule_download");
    }

    public final void dS(RoomReplay roomReplay) {
        int i = roomReplay.status;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        L1(2131842154);
                        return;
                    }
                    return;
                }
                yS(null);
                return;
            }
            aS().LIZLLL();
            yS(6);
            return;
        }
        yS(5);
    }

    public final void mS(long j) {
        if (this.LLLIL) {
            return;
        }
        this.LLLIL = true;
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).scheduledLiveReplayAutoDownload(j).LJJLL(new AfS10S0100100_27(this, j, 1), new AfS196S0100000_27(this, 23));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View viewFindViewById = null;
        if (configuration.orientation == 2) {
            nS(this, RR(), Integer.valueOf((int) C497740JfY.LIZIZ(8.0f)), Integer.valueOf((int) C497740JfY.LIZIZ(18.0f)), null, null, 24);
            View view = this.LLJ;
            if (view == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.n9g);
                }
                this.LLJ = (ConstraintLayout) viewFindViewById;
                view = viewFindViewById;
            }
            nS(this, view, null, null, Integer.valueOf((int) C497740JfY.LIZIZ(18.0f)), Integer.valueOf((int) C497740JfY.LIZIZ(18.0f)), 6);
            ConstraintLayout constraintLayout = this.LLJILLL;
            if (constraintLayout != null) {
                C426750GoL.LJIIL(constraintLayout, null, 0, null, Integer.valueOf((int) C497740JfY.LIZIZ(68.0f)), 16);
            }
            nS(this, ZR(), Integer.valueOf((int) C497740JfY.LIZIZ(16.0f)), null, null, null, 28);
            return;
        }
        nS(this, RR(), Integer.valueOf((int) C497740JfY.LIZIZ(8.0f)), Integer.valueOf((int) C497740JfY.LIZIZ(46.0f)), null, null, 24);
        View view3 = this.LLJ;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.n9g);
            }
            this.LLJ = (ConstraintLayout) viewFindViewById;
            view3 = viewFindViewById;
        }
        nS(this, view3, null, null, Integer.valueOf((int) C497740JfY.LIZIZ(18.0f)), Integer.valueOf((int) C497740JfY.LIZIZ(28.0f)), 6);
        ConstraintLayout constraintLayout2 = this.LLJILLL;
        if (constraintLayout2 != null) {
            C426750GoL.LJIIL(constraintLayout2, null, 0, Integer.valueOf((int) C497740JfY.LIZIZ(10.0f)), Integer.valueOf((int) C497740JfY.LIZIZ(82.0f)), 16);
        }
        nS(this, ZR(), Integer.valueOf((int) C497740JfY.LIZIZ(16.0f)), null, null, null, 28);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1833990xpF.LIZ("video_page");
        C1EOY c1eoy = C1EOY.LIZ;
        c1eoy.LJJI();
        C1300480jwk c1300480jwkLIZIZ = c1eoy.LIZIZ("replay_video_play_enter");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LIZJ(null);
        }
        C473410IhP.LIZJ(new ARunnableS112S0100000_12(this.LLLLII, 199), 3000L);
        setStyle(2, android.R.style.Theme.Holo.Light);
        getLifecycle().addObserver(this.LLLLIIL);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.BQ2(this, this, ReplayResultChannel.class, new AwS606S0100000_27(this, 110));
        dataChannelGlobal.JQ2(AnonymousClass1689.class, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[PHI: r1
      0x0051: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:6:0x0015, B:10:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yS(java.lang.Integer r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L53
            X.0xqP r2 = X.C1834710xqP.LIZJ()
            java.lang.String r1 = r4.LLL
            java.lang.String r0 = r4.LLLF
            r2.getClass()
            int r2 = X.C1834710xqP.LIZLLL(r1, r0)
            r3 = 1
            if (r2 == 0) goto L20
            r1 = 2
            if (r2 == r3) goto L51
            r0 = 4
            if (r2 == r1) goto L4f
            r1 = 3
            if (r2 == r1) goto L51
            if (r2 == r0) goto L20
            r3 = 0
        L20:
            X.09Gk r2 = r4.NR()
            java.lang.String r0 = "download_status"
            r2.LIZJ(r3, r0)
            int r0 = r4.LLJLL
            java.lang.String r1 = X.C1834240xpe.LIZJ(r0)
            java.lang.String r0 = "access_identity"
            r2.LJIIIIZZ(r0, r1)
            int r0 = r4.LLJLL
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r1 = r0.getCurUserId()
            java.lang.String r0 = "viewer_user_id"
            r2.LJFF(r0, r1)
        L47:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "livesdk_live_replay_play_start"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L4f:
            r3 = 4
            goto L20
        L51:
            r3 = r1
            goto L20
        L53:
            int r3 = r5.intValue()
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment.yS(java.lang.Integer):void");
    }

    public static TuxIconDrawable sS(int i, Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        return c419910GdJ.LIZ(context);
    }

    public final void kS(int i, Integer num) {
        C2344009Gk c2344009GkNR = NR();
        c2344009GkNR.LIZJ(i, "is_success");
        c2344009GkNR.LJ(num, "error_code");
        C20684815ws.LJIILLIIL("livesdk_live_replay_page_open", c2344009GkNR.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v126, types: [X.0xqM] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        int i;
        int i2;
        int i3;
        long j;
        boolean z;
        boolean z2;
        int iIntValue;
        int i4;
        boolean z3;
        boolean z4;
        boolean z5;
        String curUserId;
        String string7;
        Integer numLJIIJJI;
        String string8;
        C1835980xsS c1835980xsS;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        C19736512Jv c19736512Jv;
        ImageView imageView;
        C376400EpK c376400EpK;
        boolean z6;
        int i5;
        C1835970xsR c1835970xsR;
        TuxImmersionBar tuxImmersionBarLIZJ;
        C19736512Jv c19736512Jv2;
        C19EG activity;
        Window window;
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0UkA
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view2.setPadding(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        if (LiveReplayKeepScreenOnEnableSetting.INSTANCE.enable() && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
            window.addFlags(128);
        }
        if (getArguments() == null) {
            dismiss();
        } else {
            Bundle arguments = getArguments();
            String str = "";
            if (arguments == null || (string = arguments.getString("roomId")) == null) {
                string = "";
            }
            this.LLLF = string;
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string2 = arguments2.getString("videoUrl")) == null) {
                string2 = "";
            }
            this.LLJJIJIIJIL = string2;
            Bundle arguments3 = getArguments();
            if (arguments3 == null || (string3 = arguments3.getString("fileId")) == null) {
                string3 = "";
            }
            this.LLJJIJIL = string3;
            Bundle arguments4 = getArguments();
            if (arguments4 == null || (string4 = arguments4.getString("downloadUrl")) == null) {
                string4 = "";
            }
            this.LLL = string4;
            if (LiveReplayVideoPreloadSetting.INSTANCE.isEnable() && this.LLL.length() > 0) {
                this.LLJJIJIIJIL = this.LLL;
            }
            Bundle arguments5 = getArguments();
            if (arguments5 == null || (string5 = arguments5.getString("enterFromPage")) == null) {
                string5 = "";
            }
            this.LLLFF = string5;
            Bundle arguments6 = getArguments();
            if (arguments6 == null || (string6 = arguments6.getString("enterFrom")) == null) {
                string6 = "";
            }
            this.LLLFFI = string6;
            Bundle arguments7 = getArguments();
            if (arguments7 != null && (string8 = arguments7.getString("last_page")) != null) {
                str = string8;
            }
            this.LLLFZ = str;
            Bundle arguments8 = getArguments();
            if (arguments8 != null) {
                i = arguments8.getInt("videoLength");
            } else {
                i = 0;
            }
            this.LLJJJ = i;
            Bundle arguments9 = getArguments();
            if (arguments9 != null) {
                i2 = arguments9.getInt("videoWidth");
            } else {
                i2 = 0;
            }
            this.LLJJJIL = i2;
            Bundle arguments10 = getArguments();
            if (arguments10 != null) {
                i3 = arguments10.getInt("videoHeight");
            } else {
                i3 = 0;
            }
            this.LLJJJJ = i3;
            Bundle arguments11 = getArguments();
            if (arguments11 != null) {
                j = arguments11.getInt("position");
            } else {
                j = 0;
            }
            this.LLJJL = j;
            Bundle arguments12 = getArguments();
            if (arguments12 != null) {
                z = arguments12.getBoolean("isMute");
            } else {
                z = false;
            }
            this.LLJLIL = z;
            Bundle arguments13 = getArguments();
            if (arguments13 != null) {
                arguments13.getBoolean("isPause");
            }
            Bundle arguments14 = getArguments();
            if (arguments14 != null) {
                arguments14.getBoolean("isAutoPlay");
            }
            Bundle arguments15 = getArguments();
            if (arguments15 != null) {
                z2 = arguments15.getBoolean("asFragmentAddToActivity", true);
            } else {
                z2 = true;
            }
            this.LLJLILLLLZIIL = z2;
            Bundle arguments16 = getArguments();
            if (arguments16 != null && (string7 = arguments16.getString("user_type")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string7)) != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 0;
            }
            this.LLJLL = iIntValue;
            Bundle arguments17 = getArguments();
            if (arguments17 != null) {
                i4 = arguments17.getInt("music_copyright_status");
            } else {
                i4 = 0;
            }
            this.LLLI = i4;
            Bundle arguments18 = getArguments();
            if (arguments18 != null) {
                z3 = arguments18.getBoolean("support_bb_download");
            } else {
                z3 = false;
            }
            this.LLJLLIL = z3;
            Bundle arguments19 = getArguments();
            if (arguments19 != null) {
                z4 = arguments19.getBoolean("clip_disable");
            } else {
                z4 = false;
            }
            this.LLJLLL = z4;
            Bundle arguments20 = getArguments();
            if (arguments20 != null) {
                z5 = arguments20.getBoolean("is_bb_fans");
            } else {
                z5 = false;
            }
            this.LLJZ = z5;
            if (this.LLJLL != 0) {
                Bundle arguments21 = getArguments();
                if (arguments21 != null) {
                    curUserId = arguments21.getString("anchor_id");
                } else {
                    curUserId = null;
                }
            } else {
                curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            }
            this.LLLIIII = curUserId;
        }
        C1835970xsR c1835970xsR2 = (C1835970xsR) view.findViewById(R.id.n5j);
        this.LLJILJIL = c1835970xsR2;
        if (c1835970xsR2 != null) {
            c1835980xsS = (C1835980xsS) c1835970xsR2.findViewById(R.id.qtg);
        } else {
            c1835980xsS = null;
        }
        this.LLJILJILJ = c1835980xsS;
        if (c1835980xsS != null) {
            constraintLayout = (ConstraintLayout) c1835980xsS.findViewById(R.id.a15);
        } else {
            constraintLayout = null;
        }
        this.LLJILLL = constraintLayout;
        C1835980xsS c1835980xsS2 = this.LLJILJILJ;
        if (c1835980xsS2 != null) {
            constraintLayout2 = (ConstraintLayout) c1835980xsS2.findViewById(R.id.eqx);
        } else {
            constraintLayout2 = null;
        }
        this.LLJJ = constraintLayout2;
        this.LLJJIJI = (ConstraintLayout) view.findViewById(R.id.n9g);
        ConstraintLayout constraintLayout3 = this.LLJILLL;
        if (constraintLayout3 != null) {
            c19736512Jv = (C19736512Jv) constraintLayout3.findViewById(R.id.vki);
        } else {
            c19736512Jv = null;
        }
        this.LLJL = c19736512Jv;
        ConstraintLayout constraintLayout4 = this.LLJILLL;
        if (constraintLayout4 != null) {
            imageView = (ImageView) constraintLayout4.findViewById(R.id.inu);
        } else {
            imageView = null;
        }
        this.LLJJIII = imageView;
        C1835980xsS c1835980xsS3 = this.LLJILJILJ;
        if (c1835980xsS3 != null) {
            c1835980xsS3.findViewById(R.id.xwn);
        }
        C1835980xsS c1835980xsS4 = this.LLJILJILJ;
        if (c1835980xsS4 != null) {
            c376400EpK = (C376400EpK) c1835980xsS4.findViewById(R.id.qmi);
        } else {
            c376400EpK = null;
        }
        this.LLJJI = c376400EpK;
        C1835970xsR c1835970xsR3 = this.LLJILJIL;
        if (c1835970xsR3 != null) {
            final C1488060opI c1488060opI = new C1488060opI(c1835970xsR3);
            c1488060opI.LJIIL = this.LLJLIL;
            ((ArrayList) c1488060opI.LJIILJJIL).add(new InterfaceC1488080opK() { // from class: X.0xqT
                @Override // X.InterfaceC1488080opK
                public final void LL(String str2) {
                }

                @Override // X.InterfaceC1488080opK
                public final void onBufferedPercent(String str2, long j2, int i6) {
                }

                @Override // X.InterfaceC1488080opK
                public final void onPlayProgressChange(float f) {
                }

                @Override // X.InterfaceC1488080opK
                public final void onVideoSizeChanged(String str2, int i6, int i7) {
                }

                @Override // X.InterfaceC1488080opK
                public final void onBuffering(boolean z7) {
                    if (z7) {
                        this.LL.LLLIZZ = System.currentTimeMillis();
                    } else {
                        C2344009Gk c2344009GkNR = this.LL.NR();
                        c2344009GkNR.LIZLLL(System.currentTimeMillis() - this.LL.LLLIZZ, "duration");
                        c2344009GkNR.LIZJ(1, "block_type");
                        C20684815ws.LJIILLIIL("livesdk_video_block", c2344009GkNR.LIZ);
                    }
                }

                @Override // X.InterfaceC1488080opK
                public final void onDecoderBuffering(boolean z7) {
                    if (z7) {
                        this.LL.LLLJ = System.currentTimeMillis();
                    } else {
                        C2344009Gk c2344009GkNR = this.LL.NR();
                        c2344009GkNR.LIZLLL(System.currentTimeMillis() - this.LL.LLLJ, "duration");
                        c2344009GkNR.LIZJ(2, "block_type");
                        C20684815ws.LJIILLIIL("livesdk_video_block", c2344009GkNR.LIZ);
                    }
                }

                @Override // X.InterfaceC1488080opK
                public final void onPausePlay(String str2) {
                    C376400EpK c376400EpK2 = this.LL.LLJJI;
                    if (c376400EpK2 != null) {
                        int visibility = c376400EpK2.getVisibility();
                        c376400EpK2.setVisibility(0);
                        C1602160rnK.LIZIZ(visibility, 0, c376400EpK2);
                    }
                }

                @Override // X.InterfaceC1488080opK
                public final void onPlayCompleted(String str2) {
                    C1835970xsR c1835970xsR4 = c1488060opI.LIZ;
                    if (c1835970xsR4 != null) {
                        c1835970xsR4.LJIIIZ(0.0f, false);
                    }
                    C20684815ws.LJIILLIIL("livesdk_video_play_end", this.LL.NR().LIZ);
                }

                @Override // X.InterfaceC1488080opK
                public final void onPreparePlay(String str2) {
                    LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = this.LL;
                    liveReplayVideoPlayerDialogFragment.LLLJL = true;
                    C2344009Gk c2344009GkNR = liveReplayVideoPlayerDialogFragment.NR();
                    c2344009GkNR.LIZLLL(System.currentTimeMillis() - this.LL.LLLJIL, "duration");
                    C20684815ws.LJIILLIIL("livesdk_video_prepare", c2344009GkNR.LIZ);
                }

                @Override // X.InterfaceC1488080opK
                public final void onResumePlay(String str2) {
                    C376400EpK c376400EpK2 = this.LL.LLJJI;
                    if (c376400EpK2 != null) {
                        int visibility = c376400EpK2.getVisibility();
                        c376400EpK2.setVisibility(4);
                        C1602160rnK.LIZIZ(visibility, 4, c376400EpK2);
                    }
                }

                @Override // X.InterfaceC1488080opK
                public final void LJII(float f, int i6) {
                    ConstraintLayout constraintLayout5 = this.LL.LLJJIJI;
                    if (constraintLayout5 != null) {
                        C786410Ut5.c5(constraintLayout5, f);
                    }
                    ImageView imageViewRR = this.LL.RR();
                    if (imageViewRR != null) {
                        C786410Ut5.V4(imageViewRR, f);
                    }
                    ConstraintLayout constraintLayout6 = this.LL.LLJJIJI;
                    if (constraintLayout6 != null) {
                        C786410Ut5.LL(i6, constraintLayout6);
                    }
                    ImageView imageViewRR2 = this.LL.RR();
                    if (imageViewRR2 != null) {
                        C786410Ut5.LJZI(i6, imageViewRR2);
                    }
                }

                @Override // X.InterfaceC1488080opK
                public final void LLJJIJIL(int i6, String str2) {
                    LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = this.LL;
                    liveReplayVideoPlayerDialogFragment.LLJJJJLIIL = Boolean.TRUE;
                    InterfaceC1835090xr1 interfaceC1835090xr1 = liveReplayVideoPlayerDialogFragment.LLLIIL;
                    if (interfaceC1835090xr1 != null) {
                        interfaceC1835090xr1.LIZIZ();
                    }
                    this.LL.uS("show", "1", "other");
                    C2344009Gk c2344009GkNR = this.LL.NR();
                    c2344009GkNR.LIZJ(i6, "errorCode");
                    c2344009GkNR.LJIIIIZZ("errorDomain", str2);
                    C20684815ws.LJIILLIIL("livesdk_video_play_failed", c2344009GkNR.LIZ);
                }

                @Override // X.InterfaceC1488080opK
                public final void LLLIZZ(int i6, int i7, long j2) {
                    InterfaceC1836050xsZ player$live_release;
                    LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = this.LL;
                    liveReplayVideoPlayerDialogFragment.LLLII = true;
                    liveReplayVideoPlayerDialogFragment.LLJJJJLIIL = Boolean.FALSE;
                    Float fValueOf = null;
                    if (j2 != liveReplayVideoPlayerDialogFragment.LLJJJJJIL) {
                        liveReplayVideoPlayerDialogFragment.LLJJJJJIL = j2;
                        float f = j2 / 1000.0f;
                        RoomReplay roomReplay = liveReplayVideoPlayerDialogFragment.LLLLIIIILLL;
                        if (roomReplay != null) {
                            long j3 = 0;
                            int i8 = 0;
                            int i9 = -1;
                            for (Long l : roomReplay.endOffsets) {
                                int i10 = i8 + 1;
                                if (i8 >= 0) {
                                    long jLongValue = l.longValue();
                                    Long l2 = (Long) C13LP.LJJJLZIJ(i8, roomReplay.startOffsets);
                                    if (l2 != null) {
                                        long jLongValue2 = jLongValue - l2.longValue();
                                        if (jLongValue2 > j3) {
                                            j3 = jLongValue2;
                                        } else {
                                            i8 = i9;
                                        }
                                        i9 = i8;
                                    }
                                    i8 = i10;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            if (i9 != -1) {
                                float fFloatValue = ((Number) ListProtector.get(roomReplay.startOffsets, i9)).floatValue() / f;
                                float fFloatValue2 = ((Number) ListProtector.get(roomReplay.endOffsets, i9)).floatValue() / f;
                                C1835980xsS c1835980xsS5 = liveReplayVideoPlayerDialogFragment.LLJILJILJ;
                                if (c1835980xsS5 != null) {
                                    c1835980xsS5.LLJLILLLLZIIL = fFloatValue;
                                    c1835980xsS5.LLJLL = fFloatValue2;
                                    C0EVM momentViewFromXml = c1835980xsS5.getMomentViewFromXml();
                                    if (momentViewFromXml != null) {
                                        ((ArrayList) momentViewFromXml.LLILZ).clear();
                                        ((ArrayList) momentViewFromXml.LLILZ).add(Float.valueOf(fFloatValue));
                                        ((ArrayList) momentViewFromXml.LLILZ).add(Float.valueOf(fFloatValue2));
                                        momentViewFromXml.invalidate();
                                    }
                                }
                                C1835970xsR c1835970xsR4 = liveReplayVideoPlayerDialogFragment.LLJILJIL;
                                if (c1835970xsR4 != null) {
                                    c1835970xsR4.LJIIIIZZ(fFloatValue);
                                }
                            }
                        }
                        LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment2 = this.LL;
                        if (!liveReplayVideoPlayerDialogFragment2.LLJLLL) {
                            if (liveReplayVideoPlayerDialogFragment2.LLJJJJJIL >= liveReplayVideoPlayerDialogFragment2.LLLILZJ * LSPassThroughRecordSizeConfig.DEFAULT) {
                                C786410Ut5.B5(liveReplayVideoPlayerDialogFragment2.ZR(), 1.0f);
                                this.LL.uS("show", CardStruct.IStatusCode.DEFAULT, null);
                            } else {
                                liveReplayVideoPlayerDialogFragment2.uS("show", "1", "short");
                            }
                        }
                        C1835970xsR c1835970xsR5 = c1488060opI.LIZ;
                        if (c1835970xsR5 != null) {
                            c1835970xsR5.setVideoLength$live_release(this.LL.LLJJJJJIL);
                        }
                    }
                    C2344009Gk c2344009GkNR = this.LL.NR();
                    c2344009GkNR.LIZIZ(j2 / 1000.0f, "video_duration");
                    C1835970xsR c1835970xsR6 = c1488060opI.LIZ;
                    if (c1835970xsR6 != null && (player$live_release = c1835970xsR6.getPlayer$live_release()) != null) {
                        fValueOf = Float.valueOf(player$live_release.getBitrate());
                    }
                    c2344009GkNR.LJ(fValueOf, "play_bitrate");
                    c2344009GkNR.LIZLLL(System.currentTimeMillis() - this.LL.LLLILZ, "duration");
                    c2344009GkNR.LIZ(((Number) C2097608Jq.LJFF("cpu_speed", new LiveHostPerformanceMonitor().getCpuRate())).doubleValue(), "cpu_speed");
                    c2344009GkNR.LIZJ(C1305320k4Y.LJ(this.LL.getContext()), "cpu_cores");
                    C20684815ws.LJIILLIIL("livesdk_video_play_quality", c2344009GkNR.LIZ);
                }
            });
            this.LLJIJIL = c1488060opI;
        }
        ConstraintLayout constraintLayout5 = this.LLJJ;
        if (constraintLayout5 != null) {
            constraintLayout5.setOnTouchListener(new ATListenerS459S0100000_27(this, 9));
        }
        ConstraintLayout constraintLayout6 = this.LLJILLL;
        if (constraintLayout6 != null) {
            C426750GoL.LJIIL(constraintLayout6, null, 0, Integer.valueOf((int) C497740JfY.LIZIZ(10.0f)), Integer.valueOf((int) C497740JfY.LIZIZ(82.0f)), 16);
        }
        C500260Jjc.LJIILIIL(this.LLJJIII);
        if (this.LLJLIL && (c19736512Jv2 = this.LLJL) != null) {
            c19736512Jv2.callOnClick();
        }
        C500260Jjc.LLFFF(this.LLJJI);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0xqj
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i6, KeyEvent keyEvent) {
                    if (4 == i6 && 1 == keyEvent.getAction()) {
                        this.LL.onBackPressed();
                        return true;
                    }
                    return false;
                }
            });
        }
        C786410Ut5.Q7(RR(), new ACListenerS161S0100000_27(this, 105));
        Context context = getContext();
        if (context != null) {
            TuxIconDrawable tuxIconDrawableSS = sS(R.raw.icon_scissors, context);
            if (C444960Hcc.LIZJ(getContext())) {
                ZR().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableSS, (Drawable) null);
            } else {
                ZR().setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableSS, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            ZR().setEnabled(!this.LLJLLL);
            C500260Jjc.LLFFF(ZR());
            C786410Ut5.h9(ZR(), new ACListenerS161S0100000_27(this, 104));
        }
        try {
            C19EG c19egLJ = C500260Jjc.LJ(getContext());
            if (c19egLJ != null) {
                if (this.LLJLILLLLZIIL) {
                    tuxImmersionBarLIZJ = new TuxImmersionBar(c19egLJ, ImmersionBar.LJIILJJIL(c19egLJ));
                } else if (getDialog() != null) {
                    tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
                }
                tuxImmersionBarLIZJ.LIZJ(false, false);
                tuxImmersionBarLIZJ.LIZIZ.LJIIL();
                tuxImmersionBarLIZJ.LJFF(-16777216);
                tuxImmersionBarLIZJ.LIZIZ.LJII(false);
                tuxImmersionBarLIZJ.LIZLLL();
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        int i6 = this.LLLI;
        if (i6 != 1 && i6 != 3) {
            if (LiveReplayVideoFirstFrameOptEnableSetting.INSTANCE.enable()) {
                int i7 = this.LLJJJIL;
                if (i7 > 0 && (i5 = this.LLJJJJ) > 0 && (c1835970xsR = this.LLJILJIL) != null) {
                    c1835970xsR.LJIILIIL(i7, i5);
                }
                C1835970xsR c1835970xsR4 = this.LLJILJIL;
                if (c1835970xsR4 != null) {
                    HandlerHook.viewPost(c1835970xsR4, new ARunnableS112S0100000_12(this, 198));
                }
            } else {
                iS();
            }
            View view2 = getView();
            if (view2 != null) {
                HandlerHook.viewPost(view2, new ARunnableS112S0100000_12(this, 230));
            }
            C1834190xpZ.LIZ().LIZ.LIZJ(this);
            this.LLJZIJLIL = new C1835180xrA(this.LLL, this.LLLF) { // from class: X.0xqM
                @Override // X.C1835180xrA, X.InterfaceC1835200xrC
                public final void LIZ(DownloadInfo downloadInfo) {
                    this.LIZLLL.aS().LIZJ();
                    String str2 = this.LIZLLL.LLLF;
                    C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1833600xoc.ya;
                    Map<String, String> mapLIZIZ = c20337914i1.LIZIZ();
                    mapLIZIZ.remove(str2);
                    c20337914i1.LJFF(mapLIZIZ);
                    if (this.LIZLLL.LLLIILIL) {
                        super.LIZ(downloadInfo);
                        this.LIZLLL.L1(2131841455);
                    }
                }

                @Override // X.C1835180xrA, X.InterfaceC1835200xrC
                public final void onPause(DownloadInfo downloadInfo) {
                    int downloadProcess;
                    super.onPause(downloadInfo);
                    C761730TuN c761730TuNAS = this.LIZLLL.aS();
                    if (downloadInfo != null) {
                        downloadProcess = downloadInfo.getDownloadProcess();
                    } else {
                        downloadProcess = 0;
                    }
                    c761730TuNAS.setPause(downloadProcess);
                    LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = this.LIZLLL;
                    if (liveReplayVideoPlayerDialogFragment.LLLIILIL) {
                        liveReplayVideoPlayerDialogFragment.L1(2131842570);
                    }
                }

                @Override // X.C1835180xrA, X.InterfaceC1835200xrC
                public final void onProgress(DownloadInfo downloadInfo) {
                    super.onProgress(downloadInfo);
                    int downloadProcess = downloadInfo.getDownloadProcess();
                    LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = this.LIZLLL;
                    C761730TuN c761730TuNAS = liveReplayVideoPlayerDialogFragment.aS();
                    int visibility = c761730TuNAS.getVisibility();
                    c761730TuNAS.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c761730TuNAS);
                    liveReplayVideoPlayerDialogFragment.aS().setProgress(downloadProcess);
                }

                @Override // X.C1835180xrA, X.InterfaceC1835200xrC
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    if (this.LIZLLL.LLLIILIL) {
                        super.onFailed(downloadInfo, baseException);
                        this.LIZLLL.L1(2131842153);
                    }
                    this.LIZLLL.aS().LIZJ();
                    String str2 = this.LIZLLL.LLLF;
                    C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1833600xoc.ya;
                    Map<String, String> mapLIZIZ = c20337914i1.LIZIZ();
                    mapLIZIZ.remove(str2);
                    c20337914i1.LJFF(mapLIZIZ);
                }
            };
            this.LLLIILIL = false;
            C1834710xqP c1834710xqPLIZJ = C1834710xqP.LIZJ();
            String str2 = this.LLL;
            String str3 = this.LLLF;
            C1834680xqM c1834680xqM = this.LLJZIJLIL;
            c1834710xqPLIZJ.getClass();
            C1834710xqP.LJ(str2, str3, c1834680xqM);
            this.LLLIILIL = true;
            if (!TextUtils.isEmpty(this.LLLF)) {
                long j2 = CastLongProtector.parseLong(this.LLLF);
                IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                Long lValueOf = Long.valueOf(j2);
                if (this.LLJLL == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z6);
                Integer numValueOf = Integer.valueOf(this.LLJLL);
                if (numValueOf.intValue() == 0) {
                    numValueOf = null;
                }
                C11NZ<C470590Icr<AnchorReplayInfoData>> c11nzCheckScheduledLiveReplayVideoTask = iBroadcastService.checkScheduledLiveReplayVideoTask(false, lValueOf, boolValueOf, numValueOf, Boolean.valueOf(this.LLJZ));
                if (c11nzCheckScheduledLiveReplayVideoTask != null) {
                    c11nzCheckScheduledLiveReplayVideoTask.LJJLL(new AfS196S0100000_27(this, 26), new AfS196S0100000_27(this, 27));
                    return;
                }
                return;
            }
            return;
        }
        Integer numValueOf2 = Integer.valueOf(R.attr.ee);
        if (i6 == 1) {
            C500260Jjc.LLFFF(bS());
            C1749280vcc c1749280vccBS = bS();
            if (c1749280vccBS == null) {
                return;
            }
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_eye_slash;
            c419910GdJ.LJ = numValueOf2;
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1722300uv6.LJFF = 2131855677;
            c1749280vccBS.setStatus(c1722300uv6);
            return;
        }
        if (i6 != 3) {
            return;
        }
        C500260Jjc.LLFFF(bS());
        C1749280vcc c1749280vccBS2 = bS();
        if (c1749280vccBS2 == null) {
            return;
        }
        C1722300uv6 c1722300uv62 = new C1722300uv6();
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_eye_slash;
        c419910GdJ2.LJ = numValueOf2;
        c1722300uv62.LIZJ = 0;
        c1722300uv62.LIZIZ = c419910GdJ2;
        c1722300uv62.LJFF = 2131855676;
        c1749280vccBS2.setStatus(c1722300uv62);
    }

    public final void wS(String str, String str2) {
        C2344009Gk c2344009GkNR = NR();
        c2344009GkNR.LJIIIIZZ("access_identity", C1834240xpe.LIZJ(this.LLJLL));
        if (this.LLJLL != 0) {
            c2344009GkNR.LJFF("viewer_user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        }
        if (str2 != null) {
            c2344009GkNR.LJFF("click_icon", str2);
        }
        C20684815ws.LJIILLIIL(str, c2344009GkNR.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.djk, viewGroup, false);
        C19GS c19gs = null;
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

    public final void uS(String str, String str2, String str3) {
        C2344009Gk c2344009GkNR = NR();
        c2344009GkNR.LJIIIIZZ("last_page", this.LLLFZ);
        c2344009GkNR.LJIIIIZZ("action_type", str);
        c2344009GkNR.LJIIIIZZ("is_grey", str2);
        c2344009GkNR.LJIIIIZZ("access_identity", C1834240xpe.LIZJ(this.LLJLL));
        if (this.LLJLL != 0) {
            c2344009GkNR.LJFF("viewer_user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        }
        if (str3 != null) {
            c2344009GkNR.LJFF("grey_reason", str3);
        }
        C20684815ws.LJIILLIIL("livesdk_live_replay_clip_icon", c2344009GkNR.LIZ);
    }

    public static void hS(Context context, int i, ImageView imageView, boolean z) {
        TuxIconDrawable tuxIconDrawableSS = sS(i, context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e5);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(36));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.zj);
        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableSS, c384050F3z.LIZ(context));
        if (z) {
            C426750GoL.LIZ(imageView, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 2, C418440Gaw.LIZIZ(10), C418440Gaw.LIZIZ(10), null, 0, null, null, 960);
        }
        imageView.setImageDrawable(layerDrawableLJIILIIL);
        C500260Jjc.LLFFF(imageView);
    }

    public static void nS(LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment, View view, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        int iIntValue;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int iIntValue3;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        if ((i & 16) != 0) {
            num4 = null;
        }
        liveReplayVideoPlayerDialogFragment.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int iIntValue4 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                iIntValue = marginLayoutParams.leftMargin;
            } else {
                iIntValue = 0;
            }
        }
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                iIntValue2 = marginLayoutParams2.topMargin;
            } else {
                iIntValue2 = 0;
            }
        }
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                iIntValue3 = marginLayoutParams3.rightMargin;
            } else {
                iIntValue3 = 0;
            }
        }
        if (num4 != null) {
            iIntValue4 = num4.intValue();
        } else {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                iIntValue4 = marginLayoutParams4.bottomMargin;
            }
        }
        marginLayoutParams5.setMargins(iIntValue, iIntValue2, iIntValue3, iIntValue4);
    }
}
