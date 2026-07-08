package com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0DHG;
import X.C0UT9;
import X.C0W0R;
import X.C1220340hrU;
import X.C1222580hv6;
import X.C1300480jwk;
import X.C1305320k4Y;
import X.C1383370m6R;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C13LZ;
import X.C142V;
import X.C1479130oat;
import X.C1483410ohn;
import X.C1488030opF;
import X.C1488060opI;
import X.C1622206Wu;
import X.C1664680tQA;
import X.C1685300txQ;
import X.C1697580uHE;
import X.C1697810uHb;
import X.C1749280vcc;
import X.C1813730xIZ;
import X.C1833640xog;
import X.C1833700xom;
import X.C1833730xop;
import X.C1833990xpF;
import X.C1834120xpS;
import X.C1834180xpY;
import X.C1834240xpe;
import X.C1834310xpl;
import X.C1834550xq9;
import X.C1834580xqC;
import X.C1834720xqQ;
import X.C1834770xqV;
import X.C1834790xqX;
import X.C1834830xqb;
import X.C1835390xrV;
import X.C1835970xsR;
import X.C1835980xsS;
import X.C1846060y8i;
import X.C189200o6;
import X.C197039127h;
import X.C19719212De;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1EOY;
import X.C20441214yg;
import X.C20600815jK;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C2348809Ig;
import X.C259800zU;
import X.C291001Au;
import X.C323910Cmr;
import X.C338490DOt;
import X.C385340F8y;
import X.C452070Ho5;
import X.C465520INi;
import X.C473410IhP;
import X.C485260J1g;
import X.C497740JfY;
import X.C500260Jjc;
import X.C632670Orh;
import X.C724750Sbp;
import X.C766270U4b;
import X.C785410UrT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817403Hg;
import X.C985403tE;
import X.DialogC1390150mHN;
import X.EnumC1487720ook;
import X.EnumC1508960pN0;
import X.EnumC1782300wTs;
import X.EnumC1813540xIG;
import X.EnumC1834800xqY;
import X.EnumC1834820xqa;
import X.EnumC997910c4j;
import X.InterfaceC1389630mGX;
import X.InterfaceC1484830ok5;
import X.InterfaceC1833600xoc;
import X.InterfaceC1835200xrC;
import X.InterfaceC1836050xsZ;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC500940Jki;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import X.ViewOnTouchListenerC1834760xqU;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS8S0300100_27;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.settings.LiveHostReplayEnableUseSprites;
import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayHighlightVideobarSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayVideoGoClipMinimumDurationSetting;
import com.bytedance.android.livesdk.livesetting.highlight.LiveHighlightAddSubtitleSetting;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayHighlightMixStyleSetting;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayHighlightRecoverSetting;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayKeepScreenOnEnableSetting;
import com.bytedance.android.livesdk.replay.proto.Caption;
import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import com.bytedance.android.livesdk.replay.proto.TextStickerConfig;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPerformanceMonitor;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.CaptionPositionLocal;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.EditParams;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.EditRenderElementsLocal;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.MusicLocal;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PublishParams;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.TextStickerConfigLocal;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleStroke;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS462S0200000_27;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import webcast.data.MusicSong;

/* JADX INFO: loaded from: classes28.dex */
@InterfaceC836760Ws6
public final class LiveHighLightPageFragment extends BaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiklHELIOSPyohLTUgMGE7ISIkJSY0IDFiBSYlLQ0lLicfISIkPR8yLyAKOy40JSAiPQ==";
    public C1835970xsR LLIZ;
    public C1835980xsS LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public C197039127h LLJI;
    public TuxNavBar LLJIJIL;
    public C1846060y8i LLJILJIL;
    public ConstraintLayout LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxIconView LLJJ;
    public ViewOnAttachStateChangeListenerC20631115oD LLJJI;
    public C197039127h LLJJIII;
    public C197039127h LLJJIJI;
    public C1749280vcc LLJJIJIIJIL;
    public C1222580hv6 LLJJIJIL;
    public C1488060opI LLJJJ;
    public C1488030opF LLJJJIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public String LLJLIL;
    public boolean LLJLILLLLZIIL;
    public Integer LLJLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public C1834580xqC LLL;
    public boolean LLLII;
    public boolean LLLIIII;
    public long LLLIIIIL;
    public long LLLIIIL;
    public boolean LLLIIL;
    public float LLLIILIL;
    public boolean LLLIL;
    public final AssemVMLazy LLLILZ;
    public DialogC1390150mHN LLLILZJ;
    public Integer LLLILZLLLI;
    public AnonymousClass0956 LLLIZZ;
    public long LLLJ;
    public long LLLJIL;
    public long LLLJL;
    public volatile boolean LLLL;
    public boolean LLLLII;
    public final Map<Long, Pair<Double, Double>> LLLLIIIILLL;
    public final Map<Long, C385340F8y> LLLLIIL;
    public final Map<Long, Boolean> LLLLIILL;
    public final Map<Long, Boolean> LLLLIILLL;
    public final Map<Long, PointF> LLLLIL;
    public final Map<Long, C385340F8y> LLLLILI;
    public final Map<Long, PointF> LLLLJ;
    public final Map<Long, TextStickerConfig> LLLLJI;
    public final Map<Long, Boolean> LLLLL;
    public FrameLayout LLLLLIL;
    public ViewGroup LLLLLILLIL;
    public View LLLLLJIL;
    public final Map<Long, List<Caption>> LLLLLJLJLL;
    public final Map<Long, Integer> LLLLLL;
    public final Map<Long, String> LLLLLLIL;
    public FrameLayout LLLLLLJ;
    public View LLLLLLL;
    public View LLLLLLLLL;
    public boolean LLLLLLLLLL;
    public Pair<Long, Integer> LLLLLLLZIL;
    public Pair<Long, String> LLLLLLZ;
    public EnumC1508960pN0 LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public final AwS571S0100000_27 LLLLLZL;
    public String LLJJJJ = "";
    public String LLJJJJJIL = "";
    public String LLJJJJLIIL = "";
    public EnumC997910c4j LLJLLIL = EnumC997910c4j.NORMAL;
    public Map<String, String> LLJLLL = new LinkedHashMap();
    public String LLLF = "";
    public String LLLFF = "";
    public String LLLFFI = "";
    public String LLLFZ = "";
    public String LLLI = "";

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveHighLightPageFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/highlight/viewmodel/LiveHighlightViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0xpl] */
    public final void nS() {
        final C19EG activity = getActivity();
        if (activity != null) {
            if (this.LLLILZJ == null) {
                DialogC1390150mHN dialogC1390150mHN = new DialogC1390150mHN(activity);
                dialogC1390150mHN.LJJLIIJ(true);
                dialogC1390150mHN.LJJLJ(false);
                dialogC1390150mHN.LJJLJLI(getString(2131842163));
                dialogC1390150mHN.LLILZLL = new InterfaceC1389630mGX() { // from class: X.0xpn
                    @Override // X.InterfaceC1389630mGX
                    public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                        C485260J1g c485260J1g = C485260J1g.LIZ;
                        Map<String, String> map = LiveHighLightPageFragment.bS(this.LIZ, null, 0L, false, 7).LIZ;
                        c485260J1g.getClass();
                        C20684815ws.LJIILLIIL("livesdk_live_anchor_highlight_download_panel_cancel", map);
                        this.LIZ.XS(activity, 1, null);
                    }
                };
                this.LLLILZJ = dialogC1390150mHN;
            }
            DialogC1390150mHN dialogC1390150mHN2 = this.LLLILZJ;
            if (dialogC1390150mHN2 != null) {
                dialogC1390150mHN2.LJJLL(0.0f, false);
            }
            DialogC1390150mHN dialogC1390150mHN3 = this.LLLILZJ;
            if (dialogC1390150mHN3 != null) {
                C786410Ut5.K4(dialogC1390150mHN3);
            }
            C485260J1g c485260J1g = C485260J1g.LIZ;
            Map<String, String> map = bS(this, null, 0L, false, 7).LIZ;
            c485260J1g.getClass();
            C20684815ws.LJIILLIIL("livesdk_live_anchor_highlight_download_panel_show", map);
            XS(activity, 0, new InterfaceC1835200xrC() { // from class: X.0xpl
                @Override // X.InterfaceC1835200xrC
                public final void onPause(DownloadInfo downloadInfo) {
                }

                @Override // X.InterfaceC1835200xrC
                public final void LIZ(DownloadInfo downloadInfo) {
                    Integer numValueOf;
                    int i;
                    DialogC1390150mHN dialogC1390150mHN4 = this.LIZ.LLLILZJ;
                    if (dialogC1390150mHN4 != null) {
                        dialogC1390150mHN4.LJJLL(100.0f, false);
                    }
                    DialogC1390150mHN dialogC1390150mHN5 = this.LIZ.LLLILZJ;
                    if (dialogC1390150mHN5 != null) {
                        dialogC1390150mHN5.dismiss();
                        C785410UrT.LIZ(dialogC1390150mHN5);
                    }
                    C1834580xqC c1834580xqCLIZ = this.LIZ.iS().getState().LLILZ.LIZ();
                    if (c1834580xqCLIZ != null && c1834580xqCLIZ.LL == EnumC1782300wTs.AUTOCUT.getValue()) {
                        i = 2131851264;
                    } else {
                        LiveHighLightPageFragment liveHighLightPageFragment = this.LIZ;
                        if (c1834580xqCLIZ != null) {
                            numValueOf = Integer.valueOf(c1834580xqCLIZ.LLJILJILJ);
                        } else {
                            numValueOf = null;
                        }
                        liveHighLightPageFragment.getClass();
                        if (LiveHighLightPageFragment.wS(numValueOf)) {
                            i = 2131843949;
                        } else {
                            i = 2131842162;
                        }
                    }
                    C766270U4b.LIZLLL(i);
                }

                @Override // X.InterfaceC1835200xrC
                public final void onProgress(DownloadInfo downloadInfo) {
                    float downloadProcess;
                    DialogC1390150mHN dialogC1390150mHN4 = this.LIZ.LLLILZJ;
                    if (dialogC1390150mHN4 != null) {
                        if (downloadInfo != null) {
                            downloadProcess = downloadInfo.getDownloadProcess();
                        } else {
                            downloadProcess = 0.0f;
                        }
                        dialogC1390150mHN4.LJJLL(downloadProcess, false);
                    }
                }

                @Override // X.InterfaceC1835200xrC
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    C766270U4b.LIZLLL(2131842713);
                    DialogC1390150mHN dialogC1390150mHN4 = this.LIZ.LLLILZJ;
                    if (dialogC1390150mHN4 != null) {
                        dialogC1390150mHN4.dismiss();
                        C785410UrT.LIZ(dialogC1390150mHN4);
                    }
                }
            });
            C20684815ws.LJIILLIIL("livesdk_anchor_highlight_download_click", bS(this, null, 0L, false, 7).LIZ);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C19EG activity;
        Window window;
        this.LLLL = true;
        C465520INi.LIZ.qu1();
        C1833990xpF.LIZIZ(this.LLJJJJJIL, "highlight_page");
        PS(iS().getState().LLILZ.LIZ(), "leave_page");
        C1834180xpY.LL.getClass();
        C1834180xpY.LLILLJJLI = null;
        AnonymousClass0956 anonymousClass0956 = this.LLLIZZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLIZZ = null;
        this.LLJJJ = null;
        C1835970xsR c1835970xsR = this.LLIZ;
        if (c1835970xsR != null) {
            c1835970xsR.LIZIZ();
        }
        this.LLIZ = null;
        DialogC1390150mHN dialogC1390150mHN = this.LLLILZJ;
        if (dialogC1390150mHN != null) {
            dialogC1390150mHN.dismiss();
            C785410UrT.LIZ(dialogC1390150mHN);
        }
        this.LLLILZJ = null;
        C1488030opF c1488030opF = this.LLJJJIL;
        if (c1488030opF != null) {
            InterfaceC1484830ok5 interfaceC1484830ok5 = c1488030opF.LIZ;
            if (interfaceC1484830ok5 != null) {
                interfaceC1484830ok5.LJJIIZ(c1488030opF.LJII);
            }
            InterfaceC1484830ok5 interfaceC1484830ok52 = c1488030opF.LIZ;
            if (interfaceC1484830ok52 != null) {
                interfaceC1484830ok52.release();
            }
            c1488030opF.LIZ = null;
            c1488030opF.LJI = null;
            c1488030opF.LIZLLL = null;
            c1488030opF.LIZIZ = null;
            c1488030opF.LJ = 0L;
            c1488030opF.LJFF = EnumC1487720ook.IDLE;
        }
        this.LLJJJIL = null;
        if (LiveReplayKeepScreenOnEnableSetting.INSTANCE.enable() && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
            window.clearFlags(128);
        }
        super.onDestroy();
    }

    public final void JS() {
        C485260J1g c485260J1g = C485260J1g.LIZ;
        C2344009Gk c2344009GkBS = bS(this, null, 0L, false, 7);
        c2344009GkBS.LJIIIIZZ("click_status", gS(EnumC1834820xqa.CAPTION));
        Map<String, String> map = c2344009GkBS.LIZ;
        c485260J1g.getClass();
        C20684815ws.LJIILLIIL("livesdk_anchor_highlight_caption_click", map);
    }

    public final void QS() {
        C485260J1g c485260J1g = C485260J1g.LIZ;
        C2344009Gk c2344009GkBS = bS(this, null, 0L, false, 7);
        c2344009GkBS.LJIIIIZZ("click_status", gS(EnumC1834820xqa.TEXT_STICKER));
        Map<String, String> map = c2344009GkBS.LIZ;
        c485260J1g.getClass();
        C20684815ws.LJIILLIIL("livesdk_anchor_highlight_text_click", map);
    }

    public final LiveHighlightViewModel iS() {
        AssemVMLazy assemVMLazy = this.LLLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLZ;
        return (LiveHighlightViewModel) assemVMLazy.getValue();
    }

    public final boolean uS() {
        return this.LLJJLIIIJLLLLLLLZ == 0;
    }

    public LiveHighLightPageFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveHighlightViewModel.class);
        this.LLLILZ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS556S0100000_12(c19719912DlLIZ, 503), new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 310), AFwS269S0000000_27.get$arr$(76));
        this.LLLILZLLLI = Integer.valueOf(EnumC1813540xIG.PUBLIC.getValue());
        this.LLLLIIIILLL = new LinkedHashMap();
        this.LLLLIIL = new LinkedHashMap();
        this.LLLLIILL = new LinkedHashMap();
        this.LLLLIILLL = new LinkedHashMap();
        this.LLLLIL = new LinkedHashMap();
        this.LLLLILI = new LinkedHashMap();
        this.LLLLJ = new LinkedHashMap();
        this.LLLLJI = new LinkedHashMap();
        this.LLLLL = new LinkedHashMap();
        this.LLLLLJLJLL = new LinkedHashMap();
        this.LLLLLL = new LinkedHashMap();
        this.LLLLLLIL = new LinkedHashMap();
        this.LLLLLZL = new AwS571S0100000_27(this, 309);
    }

    public final boolean HS() {
        RoomReplay roomReplayLIZ = iS().getState().LLILLJJLI.LIZ();
        return roomReplayLIZ == null || roomReplayLIZ.finishTime - roomReplayLIZ.createTime >= ((long) LiveReplayVideoGoClipMinimumDurationSetting.getMinimumDuration());
    }

    public final float SR() {
        C291001Au<Boolean> c291001Au = iS().getState().LLJJI;
        if (c291001Au == null || c291001Au.LIZ.booleanValue()) {
            return (iS().getState().LLJJIII.LIZ.intValue() / 100.0f) * 2.0f;
        }
        return 0.0f;
    }

    public final void X1() {
        C1834580xqC c1834580xqCLIZ = iS().getState().LLILZ.LIZ();
        if (c1834580xqCLIZ != null) {
            iS().yQ2(this.LLJJJJJIL, String.valueOf(c1834580xqCLIZ.LLILZ), uS(), this.LLJJLIIIJLLLLLLLZ, c1834580xqCLIZ.LL, Boolean.valueOf(this.LLJL), this.LLJLLIL, this.LLJLL);
        } else {
            iS().yQ2(this.LLJJJJJIL, this.LLJJJJ, uS(), this.LLJJLIIIJLLLLLLLZ, this.LLJJL, Boolean.valueOf(this.LLJL), this.LLJLLIL, this.LLJLL);
        }
    }

    public final String dS() {
        C1834580xqC c1834580xqCLIZ = iS().getState().LLILZ.LIZ();
        if (UR(c1834580xqCLIZ)) {
            if (c1834580xqCLIZ != null) {
                return c1834580xqCLIZ.LLJJJJLIIL;
            }
            return null;
        }
        if (c1834580xqCLIZ != null) {
            return c1834580xqCLIZ.LLIZLLLIL;
        }
        return null;
    }

    public final void kS() {
        String str;
        String str2;
        List listLIZIZ;
        C1834580xqC c1834580xqCLIZ = iS().getState().LLILZ.LIZ();
        if (c1834580xqCLIZ != null && c1834580xqCLIZ.LL == EnumC1782300wTs.AUTOCUT.getValue()) {
            C766270U4b.LIZLLL(2131851267);
            NS("click", "other");
            return;
        }
        if (UR(c1834580xqCLIZ)) {
            C766270U4b.LIZLLL(2131855649);
            return;
        }
        if (!zS()) {
            if (c1834580xqCLIZ != null && c1834580xqCLIZ.LL == EnumC1782300wTs.HIGHLIGHT.getValue()) {
                if (wS(Integer.valueOf(c1834580xqCLIZ.LLJILJILJ))) {
                    C766270U4b.LIZLLL(2131843968);
                } else {
                    C766270U4b.LIZLLL(2131842145);
                }
            }
            NS("click", "canNotWatch");
            return;
        }
        RoomReplay roomReplayLIZ = iS().getState().LLILLJJLI.LIZ();
        if (roomReplayLIZ != null) {
            VideoMetaInfo videoMetaInfo = roomReplayLIZ.hlsVideoMetaInfo;
            if (videoMetaInfo == null || (str = videoMetaInfo.url) == null) {
                str = "";
            }
            long j = roomReplayLIZ.finishTime - roomReplayLIZ.createTime;
            if (j < LiveReplayVideoGoClipMinimumDurationSetting.getMinimumDuration()) {
                C766270U4b.LIZLLL(2131843944);
                NS("click", "short");
                return;
            }
            try {
                C19EG activity = getActivity();
                if (activity != null) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//live/ReplayVideoClipActivity");
                    smartRouteBuildRoute.withParam("videoId", this.LLJJJJJIL);
                    smartRouteBuildRoute.withParam("videoUrl", str);
                    VideoMetaInfo videoMetaInfo2 = roomReplayLIZ.mp4VideoMetaInfo;
                    smartRouteBuildRoute.withParam("fileId", videoMetaInfo2 != null ? videoMetaInfo2.url : null);
                    smartRouteBuildRoute.withParam("videoLengthMS", j * 1000);
                    smartRouteBuildRoute.withParam("enterFromPage", this.LLLF);
                    smartRouteBuildRoute.withParam("enterFrom", "highlight_page");
                    smartRouteBuildRoute.withParam("lastPage", "highlight_page");
                    VideoMetaInfo videoMetaInfo3 = roomReplayLIZ.hlsVideoMetaInfo;
                    smartRouteBuildRoute.withParam("videoHeight", videoMetaInfo3 != null ? videoMetaInfo3.height : 0L);
                    VideoMetaInfo videoMetaInfo4 = roomReplayLIZ.hlsVideoMetaInfo;
                    smartRouteBuildRoute.withParam("videoWidth", videoMetaInfo4 != null ? videoMetaInfo4.width : 0L);
                    smartRouteBuildRoute.withParam("initialTimeMS", (c1834580xqCLIZ != null ? c1834580xqCLIZ.LLJIJIL : 0L) * 1000);
                    smartRouteBuildRoute.withParam("initialDurationMS", (c1834580xqCLIZ != null ? C814420VxA.LIZJ(c1834580xqCLIZ.LLJILJIL) : 0L) * 1000);
                    smartRouteBuildRoute.withParam("cutContentType", 1);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("fragmentId", String.valueOf(c1834580xqCLIZ != null ? Long.valueOf(c1834580xqCLIZ.LLILZ) : null));
                    linkedHashMap.put("fragmentIdStr", String.valueOf(c1834580xqCLIZ != null ? Long.valueOf(c1834580xqCLIZ.LLILZ) : null));
                    linkedHashMap.put("replayTitle", roomReplayLIZ.title);
                    if (c1834580xqCLIZ == null || c1834580xqCLIZ.LLJILJILJ != 9 || (str2 = c1834580xqCLIZ.LLJJ) == null) {
                        str2 = "";
                    }
                    linkedHashMap.put("businessExtra", str2);
                    smartRouteBuildRoute.withParam("extra", C2348809Ig.LJIIIIZZ(linkedHashMap));
                    if (LiveHostReplayEnableUseSprites.getValue() && (listLIZIZ = C1835390xrV.LIZIZ(roomReplayLIZ.spriteList)) != null) {
                        smartRouteBuildRoute.withParam("spriteImage", new ArrayList(listLIZIZ));
                    }
                    smartRouteBuildRoute.withParam("user_type", this.LLJJLIIIJLLLLLLLZ);
                    smartRouteBuildRoute.withParam("anchor_id", this.LLJLIL);
                    smartRouteBuildRoute.open();
                }
                NS("click", "");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("LiveHighLightPageFragment", e);
            }
        }
    }

    public final void oS() {
        C1834580xqC c1834580xqCLIZ = iS().getState().LLILZ.LIZ();
        if (zS()) {
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(getActivity(), "livesdk_anchor_highlight_post_click", true)) {
                return;
            }
            if (yS()) {
                VS(LiveReplayHighlightMixStyleSetting.INSTANCE.isV2() ? 4 : 1, new AwS428S0200000_27(this, c1834580xqCLIZ, 16));
                return;
            } else {
                FS(c1834580xqCLIZ);
                return;
            }
        }
        if (c1834580xqCLIZ != null && c1834580xqCLIZ.LL == EnumC1782300wTs.HIGHLIGHT.getValue() && uS()) {
            if (wS(Integer.valueOf(c1834580xqCLIZ.LLJILJILJ))) {
                C766270U4b.LIZLLL(2131843968);
            } else {
                C766270U4b.LIZLLL(2131842145);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C1483410ohn c1483410ohn;
        C1834580xqC c1834580xqCLIZ = iS().getState().LLILZ.LIZ();
        if (c1834580xqCLIZ != null) {
            long j = c1834580xqCLIZ.LLILZ;
            C1488060opI c1488060opI = this.LLJJJ;
            if (c1488060opI != null) {
                long jLIZIZ = c1488060opI.LIZIZ();
                C1488060opI c1488060opI2 = this.LLJJJ;
                if (c1488060opI2 != null && (c1483410ohn = c1488060opI2.LJFF) != null) {
                    long duration = c1483410ohn.getDuration();
                    if (duration > 0) {
                        C1834120xpS.LIZLLL = j;
                        C1834120xpS.LJ = (jLIZIZ / duration) * 100.0f;
                    }
                }
            }
        }
        super.onPause();
        C1833990xpF.LIZJ("highlight_page");
        C473410IhP.LJ(new ARunnableS112S0100000_12(this, 202));
        if (!this.LLLLII) {
            C1EOY c1eoy = C1EOY.LIZ;
            C1300480jwk c1300480jwkLIZIZ = c1eoy.LIZIZ("replay_highlight_page_enter");
            if (c1300480jwkLIZIZ != null) {
                c1300480jwkLIZIZ.stop();
            }
            c1eoy.LJJI();
            C1EOY.LJIILJJIL = "replay_highlight_page_period";
            c1eoy.LJIILLIIL();
        }
        this.LLLLII = true;
        C1EOY.LIZ.LJII();
        C1835970xsR c1835970xsR = this.LLIZ;
        if (c1835970xsR != null) {
            c1835970xsR.LIZJ();
        }
        C1488030opF c1488030opF = this.LLJJJIL;
        if (c1488030opF != null) {
            c1488030opF.LIZJ("onPause", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLLLII) {
            C1EOY c1eoy = C1EOY.LIZ;
            c1eoy.LJJI();
            C1EOY.LJIILJJIL = "replay_highlight_page_period";
            c1eoy.LJIILLIIL();
        }
        C465520INi.LIZ.o41("highlight_page");
        C1833990xpF.LIZLLL("highlight_page");
        Boolean boolIsPlaying = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w4().isPlaying();
        if (boolIsPlaying == null || boolIsPlaying.booleanValue()) {
            return;
        }
        C1835970xsR c1835970xsR = this.LLIZ;
        if (c1835970xsR != null) {
            c1835970xsR.LIZLLL();
        }
        C1488060opI c1488060opI = this.LLJJJ;
        if (c1488060opI != null) {
            long j = c1488060opI.LJIIZILJ;
            C1488030opF c1488030opF = this.LLJJJIL;
            if (c1488030opF != null) {
                c1488030opF.LJ = j;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC1836050xsZ interfaceC1836050xsZ;
        super.onStop();
        C1835970xsR c1835970xsR = this.LLIZ;
        if (c1835970xsR != null && (interfaceC1836050xsZ = c1835970xsR.LLJJJIL) != null) {
            interfaceC1836050xsZ.stop();
        }
        C1488060opI c1488060opI = this.LLJJJ;
        if (c1488060opI != null) {
            long j = c1488060opI.LJIIZILJ;
            C1488030opF c1488030opF = this.LLJJJIL;
            if (c1488030opF != null) {
                c1488030opF.LJ = j;
            }
        }
    }

    public final boolean yS() {
        C1834580xqC c1834580xqCLIZ = iS().getState().LLILZ.LIZ();
        return c1834580xqCLIZ != null && c1834580xqCLIZ.LLJJJJ == 1 && LiveReplayHighlightRecoverSetting.INSTANCE.enable();
    }

    public final boolean zS() {
        C1834580xqC c1834580xqCLIZ = iS().getState().LLILZ.LIZ();
        return c1834580xqCLIZ != null && c1834580xqCLIZ.LLIZ == 2;
    }

    public static int BS(String str) {
        boolean z;
        long jLongValue;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        try {
            if (str.charAt(0) == '#') {
                return Color.parseColor(str);
            }
            if (!u.LJJIIJZLJL(str.toLowerCase(Locale.ROOT), "0x", false)) {
                return -1;
            }
            Long lDecode = Long.decode(str);
            if (str.length() == 8) {
                jLongValue = lDecode.longValue() | 4278190080L;
            } else {
                jLongValue = lDecode.longValue();
            }
            return (int) jLongValue;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    public static Map WR(LiveHighLightPageFragment liveHighLightPageFragment) {
        Long lValueOf;
        C1834580xqC c1834580xqCLIZ = liveHighLightPageFragment.iS().getState().LLILZ.LIZ();
        liveHighLightPageFragment.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("room_id", liveHighLightPageFragment.LLJJJJJIL);
        c2344009Gk.LJIIIIZZ("anchor_id", liveHighLightPageFragment.LLJLIL);
        c2344009Gk.LJIIIIZZ("enter_from", liveHighLightPageFragment.LLLFF);
        c2344009Gk.LJIIIIZZ("enter_method", liveHighLightPageFragment.LLLFZ);
        c2344009Gk.LJIIIIZZ("event_page", "highlight_page");
        c2344009Gk.LJIIIIZZ("access_identity", C1834240xpe.LIZJ(liveHighLightPageFragment.LLJJLIIIJLLLLLLLZ));
        c2344009Gk.LJIIIIZZ("enter_from_page", liveHighLightPageFragment.LLLF);
        if (c1834580xqCLIZ != null) {
            c2344009Gk.LJIIIIZZ("fragment_id", String.valueOf(c1834580xqCLIZ.LLILZ));
            c2344009Gk.LIZJ(c1834580xqCLIZ.LLJILJILJ, "fragment_type");
        }
        if (!liveHighLightPageFragment.uS()) {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
            } else {
                lValueOf = null;
            }
            c2344009Gk.LJ(lValueOf, "viewer_user_id");
        }
        return c2344009Gk.LIZ;
    }

    public static EnumC1834800xqY cS(C1834580xqC c1834580xqC) {
        if (c1834580xqC != null && c1834580xqC.LLJLLIL > 0) {
            return EnumC1834800xqY.PROCESSED;
        }
        return EnumC1834800xqY.NORMAL;
    }

    public static boolean wS(Integer num) {
        if (num != null) {
            if (num.intValue() == 7 || num.intValue() == 8) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4 A[Catch: Exception -> 0x0111, PHI: r6
      0x00c4: PHI (r6v2 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:55:0x00c2, B:53:0x00be] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0111, blocks: (B:2:0x0000, B:4:0x0008, B:10:0x0016, B:12:0x001c, B:13:0x0047, B:24:0x0067, B:31:0x0079, B:32:0x007f, B:34:0x0085, B:39:0x008e, B:41:0x00a4, B:45:0x00ac, B:47:0x00b2, B:50:0x00b8, B:52:0x00bc, B:56:0x00c4, B:57:0x00c6, B:59:0x00cf, B:62:0x00dd, B:65:0x00e3, B:23:0x0065, B:20:0x005e), top: B:70:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FS(X.C1834580xqC r33) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment.FS(X.0xqC):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [T, com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.EditParams] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.EditParams] */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.EditParams] */
    public final void GS(C1834580xqC c1834580xqC) {
        String str;
        List<String> list;
        EditRenderElementsLocal editRenderElementsLocal;
        EditRenderElementsLocal editRenderElementsLocal2;
        C19EG activity = getActivity();
        if (activity != null) {
            PublishPageParams publishPageParams = c1834580xqC.LLJILLL;
            MusicSong musicSong = null;
            Object obj = null;
            if (publishPageParams != null) {
                str = publishPageParams.defaultText;
                list = publishPageParams.challenges;
            } else {
                str = null;
                list = null;
            }
            PublishParams publishParams = new PublishParams(str, list, new ArrayList(), "");
            C259800zU c259800zU = new C259800zU();
            long j = c1834580xqC.LLJLLIL;
            List list2 = (List) ((LinkedHashMap) iS().LLILZLL).get(String.valueOf(c1834580xqC.LLILZ));
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((MusicSong) next).id == j) {
                        obj = next;
                        break;
                    }
                }
                musicSong = (MusicSong) obj;
            }
            if (C323910Cmr.LIZ && j > 0 && musicSong != null) {
                ?? editParams = new EditParams(0, 0, null);
                EditRenderElementsLocal editRenderElementsLocal3 = new EditRenderElementsLocal(null, 0.0f, null, null);
                MusicLocal musicLocal = new MusicLocal(0L, "", 0.0f, 0L, false);
                musicLocal.setMusicId(j);
                float f = 2;
                musicLocal.setVolume((iS().getState().LLJJIJI.LIZ.intValue() / 100.0f) * 2.0f * f);
                musicLocal.setPreviewUrl(musicSong.previewUrl);
                musicLocal.setDuration(musicSong.duration);
                editRenderElementsLocal3.setMusic(musicLocal);
                editRenderElementsLocal3.setOriginVideoVolume(SR() * f);
                editParams.setRenderElements(editRenderElementsLocal3);
                c259800zU.element = editParams;
            }
            if (LiveHighlightAddSubtitleSetting.INSTANCE.enable()) {
                List list3 = (List) ((LinkedHashMap) this.LLLLLJLJLL).get(Long.valueOf(c1834580xqC.LLILZ));
                if (list3 != null && !list3.isEmpty()) {
                    if (c259800zU.element == 0) {
                        c259800zU.element = new EditParams(0, 0, null);
                    }
                    EditParams editParams2 = (EditParams) c259800zU.element;
                    if (editParams2 == null || (editRenderElementsLocal2 = editParams2.renderElements) == null) {
                        editRenderElementsLocal2 = new EditRenderElementsLocal(null, 0.0f, null, null);
                        EditParams editParams3 = (EditParams) c259800zU.element;
                        if (editParams3 != null) {
                            editParams3.setRenderElements(editRenderElementsLocal2);
                        }
                    }
                    CaptionPositionLocal captionPositionLocal = new CaptionPositionLocal(0.5d, 0.5d);
                    captionPositionLocal.setCenterX(c1834580xqC.LLL);
                    captionPositionLocal.setCenterY(c1834580xqC.LLLF);
                    editRenderElementsLocal2.setCaptionPositionLocal(captionPositionLocal);
                }
                if (c1834580xqC.LLJZ && c1834580xqC.LLJZIJLIL != null) {
                    if (c259800zU.element == 0) {
                        c259800zU.element = new EditParams(0, 0, null);
                    }
                    EditParams editParams4 = (EditParams) c259800zU.element;
                    if (editParams4 == null || (editRenderElementsLocal = editParams4.renderElements) == null) {
                        editRenderElementsLocal = new EditRenderElementsLocal(null, 0.0f, null, null);
                        EditParams editParams5 = (EditParams) c259800zU.element;
                        if (editParams5 != null) {
                            editParams5.setRenderElements(editRenderElementsLocal);
                        }
                    }
                    TextStickerConfig textStickerConfig = c1834580xqC.LLJZIJLIL;
                    if (textStickerConfig != null) {
                        if (editRenderElementsLocal.subTitleLocal == null) {
                            editRenderElementsLocal.setSubTitleLocal(new TextStickerConfigLocal(0.5d, 0.5d, ""));
                        }
                        TextStickerConfigLocal textStickerConfigLocal = editRenderElementsLocal.subTitleLocal;
                        if (textStickerConfigLocal != null) {
                            textStickerConfigLocal.setCenterX(new BigDecimal(textStickerConfig.centerX).setScale(2, RoundingMode.HALF_UP).doubleValue());
                        }
                        TextStickerConfigLocal textStickerConfigLocal2 = editRenderElementsLocal.subTitleLocal;
                        if (textStickerConfigLocal2 != null) {
                            textStickerConfigLocal2.setCenterY(new BigDecimal(textStickerConfig.centerY).setScale(2, RoundingMode.HALF_UP).doubleValue());
                        }
                        TextStickerConfigLocal textStickerConfigLocal3 = editRenderElementsLocal.subTitleLocal;
                        if (textStickerConfigLocal3 != null) {
                            textStickerConfigLocal3.setText(textStickerConfig.text);
                        }
                    }
                }
            }
            String strValueOf = String.valueOf(c1834580xqC.LLILZ);
            String str2 = c1834580xqC.LLILZIL;
            Integer num = this.LLLILZLLLI;
            Boolean bool = Boolean.TRUE;
            C1834580xqC c1834580xqCLIZ = iS().getState().LLILZ.LIZ();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("item_anchor_id", this.LLJLIL);
            c2344009Gk.LJIIIIZZ("enter_from_page", this.LLLF);
            c2344009Gk.LJIIIIZZ("enter_from", this.LLLFF);
            c2344009Gk.LJIIIIZZ("last_page", this.LLLFFI);
            c2344009Gk.LJIIIIZZ("event_page", "highlight_page");
            c2344009Gk.LJIIIIZZ("enter_method", this.LLLFZ);
            c2344009Gk.LJIIIIZZ("network_type", C0W0R.LIZIZ(getContext()));
            c2344009Gk.LJIIIIZZ("publisher_identity", C1834240xpe.LIZJ(this.LLJJLIIIJLLLLLLLZ));
            c2344009Gk.LJIIIIZZ("shoot_way", "live_highlights_quickpost");
            c2344009Gk.LJIIIIZZ("shoot_enter_from", "autocut_quick_post");
            if (Intrinsics.LJFF(bool, bool)) {
                c2344009Gk.LJFF("content_source", "others");
                c2344009Gk.LJFF("content_type", "video");
            }
            if (c1834580xqCLIZ != null) {
                c2344009Gk.LJIIIIZZ("fragment_id", String.valueOf(c1834580xqCLIZ.LLILZ));
                c2344009Gk.LIZJ(c1834580xqCLIZ.LLJILJILJ, "fragment_type");
                c2344009Gk.LJFF("vid", c1834580xqCLIZ.LLJLL);
            }
            C1813730xIZ.LIZ(false, 0, new PostConfigModel(strValueOf, str2, publishParams, num, c2344009Gk.LIZ, C1834240xpe.LIZJ(this.LLJJLIIIJLLLLLLLZ), "", (EditParams) c259800zU.element, "", "", null, 0, "", false, false), activity, new AwS462S0200000_27(this, activity, 1), new AwS606S0100000_27(this, 124), null, null, null);
            C485260J1g c485260J1g = C485260J1g.LIZ;
            Map<String, String> map = bS(this, null, 0L, true, 3).LIZ;
            c485260J1g.getClass();
            C20684815ws.LJIILLIIL("livesdk_anchor_highlight_post_click", map);
        }
    }

    public final void RS(long j) {
        C1835970xsR c1835970xsR = this.LLIZ;
        if (c1835970xsR == null) {
            return;
        }
        TextureView videoView = c1835970xsR.getVideoView();
        int width = videoView.getWidth();
        int height = videoView.getHeight();
        if (width > 0 && height > 0) {
            this.LLLLLLLLLL = true;
            Pair<Long, Integer> pair = this.LLLLLLLZIL;
            if (pair != null && pair.getFirst().longValue() == j) {
                int iIntValue = pair.getSecond().intValue();
                this.LLLLLLLZIL = null;
                YS(iIntValue);
            }
            Pair<Long, String> pair2 = this.LLLLLLZ;
            if (pair2 != null && pair2.getFirst().longValue() == j) {
                long jLongValue = pair2.getFirst().longValue();
                String second = pair2.getSecond();
                this.LLLLLLZ = null;
                ZR(jLongValue, second);
            }
        }
    }

    public final boolean UR(C1834580xqC c1834580xqC) {
        if (c1834580xqC != null && c1834580xqC.LLJJJJJIL && uS() && LiveReplayHighlightRecoverSetting.INSTANCE.enable()) {
            return true;
        }
        return false;
    }

    public final void US(boolean z) {
        C1835980xsS c1835980xsS = this.LLIZLLLIL;
        if (c1835980xsS != null) {
            c1835980xsS.setDeferActionBarVisible(z);
        }
    }

    public final void VR(int i) {
        C1834770xqV c1834770xqV;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        List<InterfaceC1891350zJl> listItems;
        InterfaceC1833600xoc.ka.LIZJ(Boolean.TRUE);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJ;
        InterfaceC1891350zJl interfaceC1891350zJl = null;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (listItems = viewOnAttachStateChangeListenerC20604515jv2.getListItems()) != null) {
            interfaceC1891350zJl = (InterfaceC1891350zJl) ListProtector.get(listItems, i);
        }
        if ((interfaceC1891350zJl instanceof C1834770xqV) && (c1834770xqV = (C1834770xqV) interfaceC1891350zJl) != null && (viewOnAttachStateChangeListenerC20604515jv = this.LLJ) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILJJIL(i, C1834770xqV.LIZ(c1834770xqV, false, false, null, null, 0L, 4087));
        }
    }

    public final void YS(int i) {
        C1834790xqX c1834790xqX;
        C1834580xqC c1834580xqCLIZ = iS().getState().LLILZ.LIZ();
        if (c1834580xqCLIZ == null) {
            return;
        }
        long j = c1834580xqCLIZ.LLILZ;
        if (j == 0) {
            return;
        }
        QS();
        if (!this.LLLLLLLLLL) {
            this.LLLLLLLZIL = new Pair<>(Long.valueOf(j), Integer.valueOf(i));
            return;
        }
        TextStickerConfig textStickerConfig = c1834580xqCLIZ.LLJZIJLIL;
        boolean z = false;
        if (textStickerConfig == null) {
            c1834580xqCLIZ.LLJZ = false;
            this.LLLLL.put(Long.valueOf(j), Boolean.FALSE);
            return;
        }
        this.LLLLJI.put(Long.valueOf(j), textStickerConfig);
        if (!c1834580xqCLIZ.LLJZ && c1834580xqCLIZ.LLJZIJLIL != null) {
            z = true;
        }
        c1834580xqCLIZ.LLJZ = z;
        this.LLLLL.put(Long.valueOf(j), Boolean.valueOf(z));
        if (LiveReplayHighlightVideobarSetting.INSTANCE.enable()) {
            iS().HQ2(j, c1834580xqCLIZ.LLJZIJLIL, z);
        }
        LiveHighlightViewModel liveHighlightViewModelIS = iS();
        TextStickerConfig textStickerConfig2 = c1834580xqCLIZ.LLJZIJLIL;
        if (textStickerConfig2 != null) {
            c1834790xqX = new C1834790xqX(j, textStickerConfig2, z);
        } else {
            c1834790xqX = null;
        }
        liveHighlightViewModelIS.setState(new AwS606S0100000_27(c1834790xqX, 560));
    }

    public final String gS(EnumC1834820xqa enumC1834820xqa) {
        C20600815jK<InterfaceC1891350zJl> state;
        C1834770xqV c1834770xqV;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            for (InterfaceC1891350zJl interfaceC1891350zJl : state.LJII()) {
                if ((interfaceC1891350zJl instanceof C1834770xqV) && (c1834770xqV = (C1834770xqV) interfaceC1891350zJl) != null && c1834770xqV.LL == enumC1834820xqa) {
                    if (c1834770xqV.LLILLJJLI) {
                        Integer numValueOf = Integer.valueOf(c1834770xqV.LLJ.getValue());
                        int value = EnumC1834800xqY.NORMAL.getValue();
                        if (numValueOf != null && numValueOf.intValue() == value) {
                            return "unselect";
                        }
                        int value2 = EnumC1834800xqY.PROCESSED.getValue();
                        if (numValueOf != null && numValueOf.intValue() == value2) {
                            return "select";
                        }
                        int value3 = EnumC1834800xqY.LOADING.getValue();
                        if (numValueOf == null || numValueOf.intValue() != value3) {
                            int value4 = EnumC1834800xqY.SPINNER_LOADING.getValue();
                            if (numValueOf == null || numValueOf.intValue() != value4) {
                                return "";
                            }
                            return "loading";
                        }
                        return "loading";
                    }
                    return "disabled";
                }
            }
        }
        return "";
    }

    public final void gT(boolean z) {
        C20600815jK<InterfaceC1891350zJl> state;
        C1834770xqV c1834770xqV;
        C20600815jK<InterfaceC1891350zJl> state2;
        ArrayList arrayList = new ArrayList();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) state.LJII()) {
                Runnable runnable = null;
                if ((interfaceC1891350zJl instanceof C1834770xqV) && (c1834770xqV = (C1834770xqV) interfaceC1891350zJl) != null) {
                    if (EnumC1834820xqa.CUT == c1834770xqV.LL) {
                        arrayList.add(C1834770xqV.LIZ(c1834770xqV, z, false, null, null, 0L, 4093));
                    } else {
                        runnable = null;
                        arrayList.add(C1834770xqV.LIZ(c1834770xqV, false, false, null, null, 0L, 4095));
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJ;
                    if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state2 = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                        state2.LJIIJJI(arrayList, runnable);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x022e A[PHI: r17
      0x022e: PHI (r17v6 boolean) = (r17v5 boolean), (r17v8 boolean) binds: [B:123:0x01ba, B:125:0x01cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016a  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r16v0, types: [X.0xqY] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v1, types: [X.0xqY] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void iT(boolean r28) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment.iT(boolean):void");
    }

    public final void mS(C1834580xqC c1834580xqC) {
        String string;
        String string2;
        int i;
        int i2;
        C19EG activity = getActivity();
        if (activity != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            if (c1834580xqC != null && c1834580xqC.LL == EnumC1782300wTs.HIGHLIGHT.getValue()) {
                if (wS(Integer.valueOf(c1834580xqC.LLJILJILJ))) {
                    i2 = 2131843938;
                } else {
                    i2 = 2131842160;
                }
                string = getString(i2);
            } else {
                string = getString(2131851263);
            }
            c1397580mTM.LJI(string);
            if (c1834580xqC != null && c1834580xqC.LL == EnumC1782300wTs.HIGHLIGHT.getValue()) {
                if (wS(Integer.valueOf(c1834580xqC.LLJILJILJ))) {
                    i = 2131843937;
                } else {
                    i = 2131842158;
                }
                string2 = getString(i);
            } else {
                string2 = getString(2131851262);
            }
            c1397580mTM.LIZIZ(string2);
            C985403tE.LIZ(c1397580mTM, new AwS370S0200000_4(this, c1834580xqC, 18));
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
            C485260J1g c485260J1g = C485260J1g.LIZ;
            Map<String, String> map = bS(this, null, 0L, false, 7).LIZ;
            c485260J1g.getClass();
            C20684815ws.LJIILLIIL("livesdk_anchor_highlight_delete_click", map);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1833990xpF.LIZ("highlight_page");
        C0W0R.LIZJ();
        C1EOY c1eoy = C1EOY.LIZ;
        c1eoy.LJJI();
        C1300480jwk c1300480jwkLIZIZ = c1eoy.LIZIZ("replay_highlight_page_enter");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LIZJ(null);
        }
        C473410IhP.LIZJ(new ARunnableS113S0100000_13(this.LLLLLZL, 114), 3000L);
        this.LLLL = false;
    }

    public final void sS(long j) {
        C385340F8y c385340F8y = (C385340F8y) ((LinkedHashMap) this.LLLLIIL).get(Long.valueOf(j));
        if (c385340F8y != null) {
            C786410Ut5.c2(c385340F8y, 8);
        }
    }

    public final void ES(long j, long j2) {
        Object next;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playMusic: fragmentId: ");
        sbLIZ.append(j);
        sbLIZ.append(", musicId: ");
        sbLIZ.append(j2);
        C20441214yg.LIZIZ("LiveHighLightPageFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (j2 <= 0) {
            C1488030opF c1488030opF = this.LLJJJIL;
            if (c1488030opF != null) {
                C1488030opF.LJIIIZ(c1488030opF);
                return;
            }
            return;
        }
        String str = (String) ((LinkedHashMap) iS().LLILZIL).get(Long.valueOf(j2));
        if (str == null || str.length() == 0) {
            return;
        }
        List list = (List) ((LinkedHashMap) iS().LLILZLL).get(String.valueOf(j));
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((MusicSong) next).id == j2) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            MusicSong musicSong = (MusicSong) next;
            if (musicSong != null) {
                C1488030opF c1488030opF2 = this.LLJJJIL;
                if (c1488030opF2 != null) {
                    c1488030opF2.LIZLLL(j, musicSong, str, 0);
                }
                C1835970xsR c1835970xsR = this.LLIZ;
                if (c1835970xsR != null) {
                    c1835970xsR.LJIIIZ(0.0f, false);
                }
            }
        }
    }

    public final void NS(String str, String str2) {
        Boolean boolValueOf;
        C485260J1g c485260J1g = C485260J1g.LIZ;
        C2344009Gk c2344009GkBS = bS(this, null, 0L, false, 7);
        c2344009GkBS.LJFF("action_type", str);
        C197039127h c197039127h = this.LLJI;
        if (c197039127h != null) {
            boolValueOf = Boolean.valueOf(c197039127h.isEnabled());
        } else {
            boolValueOf = null;
        }
        boolean zLJJIFFI = C500260Jjc.LJJIFFI(boolValueOf);
        c2344009GkBS.LJFF("is_grey", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(zLJJIFFI)) ? 1 : 0));
        if (zLJJIFFI) {
            c2344009GkBS.LJFF("grey_reason", str2);
        }
        Map<String, String> map = c2344009GkBS.LIZ;
        c485260J1g.getClass();
        C20684815ws.LJIILLIIL("livesdk_live_replay_clip_icon", map);
    }

    public final void PS(C1834580xqC c1834580xqC, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLIIIL;
        C485260J1g c485260J1g = C485260J1g.LIZ;
        C2344009Gk c2344009GkBS = bS(this, c1834580xqC, 0L, false, 6);
        c2344009GkBS.LIZIZ(jCurrentTimeMillis / 1000.0f, "play_duration");
        if (this.LLLIIII) {
            str = "";
        }
        c2344009GkBS.LJIIIIZZ("cancel_type", str);
        c2344009GkBS.LIZJ(C500260Jjc.LJJJI(Boolean.valueOf(this.LLLIIII)) ? 1 : 0, "is_video_start");
        Map<String, String> map = c2344009GkBS.LIZ;
        c485260J1g.getClass();
        C20684815ws.LJIILLIIL("livesdk_anchor_highlight_play_duration", map);
        if (this.LLLIIII) {
            this.LLLIIII = false;
            this.LLLIIL = false;
        }
    }

    public final void VS(int i, Function0<Unit> function0) {
        String string;
        String string2;
        boolean z;
        String str;
        C19EG activity = getActivity();
        if (activity != null) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        string = getString(2131851280);
                    } else {
                        string = getString(2131855641);
                    }
                } else {
                    string = getString(2131855643);
                }
            } else {
                string = getString(2131855647);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        string2 = getString(2131851272);
                    } else {
                        string2 = getString(2131855640);
                    }
                } else {
                    string2 = getString(2131855642);
                }
            } else {
                string2 = getString(2131855646);
            }
            String string3 = getString(2131855639);
            if (i != 1 && i != 4) {
                z = false;
            } else {
                z = true;
            }
            if (i != 1) {
                if (i != 4) {
                    str = "";
                } else {
                    str = "edit_video";
                }
            } else {
                str = "post_video";
            }
            if (C0DHG.LIZ() && C1388190mED.LIZ(activity) != null) {
                C632670Orh.LIZIZ(activity, new C19719212De(-173127369, new C1220340hrU(string, string2, str, string3, function0, z), true));
            } else {
                C1397580mTM c1397580mTM = new C1397580mTM(activity);
                c1397580mTM.LIZIZ(string);
                str = str;
                C985403tE.LIZ(c1397580mTM, new C1833700xom(string2, string3, str, function0, z));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
            if (z) {
                C1833640xog.LIZ.getClass();
                C1833640xog.LIZIZ("show", null, str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, X.0F8y, android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void ZR(long j, String str) {
        String str2 = str;
        if (!this.LLLLLLLLLL) {
            this.LLLLLLZ = new Pair<>(Long.valueOf(j), str2);
            return;
        }
        FrameLayout frameLayout = this.LLLLLLJ;
        if (frameLayout == 0) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        ?? r0 = ((LinkedHashMap) this.LLLLIIL).get(Long.valueOf(j));
        c259800zU.element = r0;
        if (r0 == 0) {
            if (str2 == null) {
                str2 = "";
            }
            ?? c385340F8y = new C385340F8y(requireContext());
            float textSize = 0.0f;
            if (c385340F8y.getTextSize() > 0.0f) {
                textSize = 1.0f / (c385340F8y.getTextSize() * 2.0f);
            }
            TextStickerModel textStickerModel = new TextStickerModel(null, null, null, str2, null, 0, 0, 0, 0.0f, new TextFontModel(null, null, null, null, null, null, 20, 1, null, null, false, false, false, 0, 16191, null), false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, new TextStyleModel("", "", "", "", "#FFFFFFFF", null, null, new TextStyleStroke("#000000", textSize), false, "", ""), null, null, null, null, false, false, null, false, false, false, null, -777, 65519, null);
            C1664680tQA c1664680tQA = new C1664680tQA(textStickerModel);
            c385340F8y.LJIIIZ(c1664680tQA, getViewLifecycleOwner(), null, AFwS269S0000000_27.get$arr$(74), null);
            c1664680tQA.LIZLLL(AFwS269S0000000_27.get$arr$(75), true);
            c385340F8y.setText(str2);
            Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, 0.0f, 0.0f, null, 0.0f, 0, null, 253);
            if (typefaceLIZIZ != null) {
                c385340F8y.setFontType(typefaceLIZIZ);
            }
            c385340F8y.LIZJ(new InteractStickerStruct(), textStickerModel);
            c385340F8y.setGravity(17);
            C786410Ut5.T5(c385340F8y, 1.0f);
            c385340F8y.setEnabled(true);
            c385340F8y.setClickable(true);
            c385340F8y.setFocusable(false);
            c385340F8y.setFocusableInTouchMode(false);
            c385340F8y.setCursorVisible(false);
            c259800zU.element = c385340F8y;
            this.LLLLIIL.put(Long.valueOf(j), (C385340F8y) c259800zU.element);
            int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(iLIZIZ);
            layoutParams.setMarginEnd(iLIZIZ);
            frameLayout.addView((View) c259800zU.element, layoutParams);
            HandlerHook.viewPost((View) c259800zU.element, new ARunnableS8S0300100_27(j, frameLayout, this, c259800zU, 1));
            View view = (View) c259800zU.element;
            view.setOnTouchListener(new ViewOnTouchListenerC1834760xqU(frameLayout, new int[2], new C817403Hg(), new C817403Hg(), true, view, this));
        } else if (str2 != null) {
            ((TextView) r0).setText(str2);
        }
        C786410Ut5.c2((C385340F8y) c259800zU.element, 0);
        HandlerHook.viewPost(frameLayout, new ARunnableS8S0300100_27(j, frameLayout, this, c259800zU, 3));
    }

    public final void ZS(long j, C385340F8y c385340F8y) {
        View view;
        TextureView videoView;
        C1834580xqC c1834580xqCLIZ = iS().getState().LLILZ.LIZ();
        if (c1834580xqCLIZ == null || j == 0) {
            return;
        }
        this.LLLLIL.put(Long.valueOf(j), new PointF(c385340F8y.getX(), c385340F8y.getY()));
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        C1835970xsR c1835970xsR = this.LLIZ;
        if (c1835970xsR != null && (videoView = c1835970xsR.getVideoView()) != null) {
            videoView.getGlobalVisibleRect(rect);
        }
        Object parent = c385340F8y.getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            view.getGlobalVisibleRect(rect2);
        }
        float fWidth = rect.width();
        float fHeight = rect.height();
        if (fWidth > 0.0f && fHeight > 0.0f) {
            float f = rect2.left - rect.left;
            float f2 = rect2.top - rect.top;
            float x = c385340F8y.getX() + (c385340F8y.getWidth() / 2.0f) + f;
            float y = c385340F8y.getY() + (c385340F8y.getHeight() / 2.0f) + f2;
            float fLIZLLL = C13LZ.LIZLLL(x / fWidth, 0.0f, 1.0f);
            float fLIZLLL2 = C13LZ.LIZLLL(y / fHeight, 0.0f, 1.0f);
            c1834580xqCLIZ.LLL = new BigDecimal(String.valueOf(fLIZLLL)).setScale(2, RoundingMode.HALF_UP).doubleValue();
            c1834580xqCLIZ.LLLF = new BigDecimal(String.valueOf(fLIZLLL2)).setScale(2, RoundingMode.HALF_UP).doubleValue();
            this.LLLLIIIILLL.put(Long.valueOf(j), new Pair<>(Double.valueOf(c1834580xqCLIZ.LLL), Double.valueOf(c1834580xqCLIZ.LLLF)));
        }
    }

    public final String aS(long j, long j2) {
        int iIntValue;
        List list = (List) ((LinkedHashMap) this.LLLLLJLJLL).get(Long.valueOf(j));
        if (list == null || list.isEmpty()) {
            return null;
        }
        Integer num = (Integer) ((LinkedHashMap) this.LLLLLL).get(Long.valueOf(j));
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        int i = -1;
        if (!list.isEmpty()) {
            if (iIntValue < 0 || iIntValue >= list.size()) {
                iIntValue = 0;
            }
            int size = list.size();
            for (int i2 = iIntValue; i2 < size; i2++) {
                Caption caption = (Caption) ListProtector.get(list, i2);
                long j3 = caption.startTime;
                long j4 = caption.duration + j3;
                if (j3 <= j2 && j2 < j4) {
                    i = i2;
                    break;
                }
                if (j2 < j3) {
                    break;
                }
            }
            if (iIntValue > 0) {
                int i3 = 0;
                while (true) {
                    Caption caption2 = (Caption) ListProtector.get(list, i3);
                    long j5 = caption2.startTime;
                    long j6 = caption2.duration + j5;
                    if (j5 <= j2 && j2 < j6) {
                        i = i3;
                        break;
                    }
                    if (j2 < j5 || (i3 = i3 + 1) >= iIntValue) {
                        break;
                    }
                }
            }
        }
        this.LLLLLL.put(Long.valueOf(j), Integer.valueOf(i));
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return ((Caption) ListProtector.get(list, i)).text;
    }

    public final void eT(boolean z, EnumC1834800xqY enumC1834800xqY) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        C1834770xqV c1834770xqV;
        boolean z2;
        boolean zZS = zS();
        ArrayList arrayList = new ArrayList();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state2 = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) state2.LJII()) {
                if (interfaceC1891350zJl instanceof C1834770xqV) {
                    c1834770xqV = (C1834770xqV) interfaceC1891350zJl;
                } else {
                    c1834770xqV = null;
                }
                if (zZS && z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c1834770xqV != null) {
                    EnumC1834820xqa enumC1834820xqa = c1834770xqV.LL;
                    if (enumC1834820xqa != null && C1834830xqb.LIZ[enumC1834820xqa.ordinal()] == 1) {
                        arrayList.add(C1834770xqV.LIZ(c1834770xqV, z2, false, null, enumC1834800xqY, 0L, 3837));
                    } else if (c1834770xqV != null) {
                        arrayList.add(C1834770xqV.LIZ(c1834770xqV, false, false, null, null, 0L, 4095));
                    }
                }
            }
        }
        if ((!arrayList.isEmpty()) && (viewOnAttachStateChangeListenerC20604515jv = this.LLJ) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIIJJI(arrayList, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0181  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r32, android.os.Bundle r33) {
        /*
            Method dump skipped, instruction units count: 2754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qS(com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel r10, java.lang.Boolean r11) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment.qS(com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel, java.lang.Boolean):void");
    }

    public final void rS(long j, Integer num) {
        EnumC1834800xqY enumC1834800xqYLIZ;
        if (num != null) {
            num.intValue();
            iS().LLJI.put(Long.valueOf(j), num);
        }
        C1834580xqC c1834580xqCLIZ = iS().getState().LLILZ.LIZ();
        if (c1834580xqCLIZ != null && j != 0 && j == c1834580xqCLIZ.LLILZ) {
            EnumC1834820xqa enumC1834820xqa = EnumC1834820xqa.CAPTION;
            if (num == null || (enumC1834800xqYLIZ = C1834550xq9.LIZ(num)) == null) {
                enumC1834800xqYLIZ = EnumC1834800xqY.NORMAL;
            }
            hT(enumC1834820xqa, true, enumC1834800xqYLIZ);
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue != 3 && iIntValue != 4) {
                    if (iIntValue == 5) {
                        C766270U4b.LIZLLL(2131852961);
                        return;
                    }
                    return;
                }
                C766270U4b.LIZLLL(2131852959);
            }
        }
    }

    public final void XS(final C19EG c19eg, final int i, final C1834310xpl c1834310xpl) {
        Long lValueOf;
        C1834720xqQ c1834720xqQ = C1834720xqQ.LIZ;
        String strDS = dS();
        if (strDS == null) {
            strDS = "";
        }
        C1834580xqC c1834580xqCLIZ = iS().getState().LLILZ.LIZ();
        if (c1834580xqCLIZ != null) {
            lValueOf = Long.valueOf(c1834580xqCLIZ.LLILZ);
        } else {
            lValueOf = null;
        }
        final String strValueOf = String.valueOf(lValueOf);
        final Map<String, String> map = bS(this, null, 0L, false, 7).LIZ;
        if (1 == i) {
            c1834720xqQ.getClass();
            C1834720xqQ.LIZ(c19eg, i, strDS, strValueOf, ".mp4", "highlight_page", 1, c1834310xpl, map);
        } else if (Build.VERSION.SDK_INT >= 33) {
            c1834720xqQ.getClass();
            C1834720xqQ.LIZ(c19eg, i, strDS, strValueOf, ".mp4", "highlight_page", 1, c1834310xpl, map);
        } else {
            c1834720xqQ.getClass();
            final String str = strDS;
            new C0UT9(C500260Jjc.LJ(c19eg), TokenCert.Companion.with("bpea-bpea-submit_download_task_in_live_replay_video_player")).LIZ(new C142V() { // from class: X.0xqA
                public final /* synthetic */ String LJ = ".mp4";
                public final /* synthetic */ String LJFF = "highlight_page";
                public final /* synthetic */ int LJI = 1;

                @Override // X.C142V
                public final /* synthetic */ void LIZIZ(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LIZLLL(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LJ(String str2, String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LJFF(String... strArr) {
                }

                @Override // X.C142V
                public final void LIZ(String... strArr) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_photo_library_permission_cancel");
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                    c474500IjALIZ.LJJII(strValueOf, "room_id");
                    c474500IjALIZ.LJJII(1, "is_first_request");
                    c474500IjALIZ.LJJIIZI(map);
                    c474500IjALIZ.LIZ();
                }

                @Override // X.C142V
                public final void LIZJ(String... strArr) {
                    C1834720xqQ c1834720xqQ2 = C1834720xqQ.LIZ;
                    Context context = c19eg;
                    int i2 = i;
                    String str2 = str;
                    String str3 = strValueOf;
                    String str4 = this.LJ;
                    String str5 = this.LJFF;
                    int i3 = this.LJI;
                    InterfaceC1835200xrC interfaceC1835200xrC = c1834310xpl;
                    Map<String, String> map2 = map;
                    c1834720xqQ2.getClass();
                    C1834720xqQ.LIZ(context, i2, str2, str3, str4, str5, i3, interfaceC1835200xrC, map2);
                }
            }, false, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    public final void fT(boolean z, boolean z2, boolean z3) {
        Integer numValueOf;
        if (!uS() || !LiveReplayHighlightRecoverSetting.INSTANCE.enable()) {
            return;
        }
        C1834580xqC c1834580xqCLIZ = iS().getState().LLILZ.LIZ();
        if (c1834580xqCLIZ != null) {
            numValueOf = Integer.valueOf(c1834580xqCLIZ.LLJJJJ);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            C1835970xsR c1835970xsR = this.LLIZ;
            if (c1835970xsR != null) {
                HandlerHook.viewRemoveCallbacks(c1835970xsR, c1835970xsR.LLJLILLLLZIIL);
                C500260Jjc.LLFFF(c1835970xsR.LLJILJILJ);
                TuxTextView tuxTextView = c1835970xsR.LLJILJILJ;
                if (tuxTextView != null) {
                    tuxTextView.setText(C1383370m6R.LJIIJ(2131855651));
                    return;
                }
                return;
            }
            return;
        }
        if (z3 && numValueOf != null && numValueOf.intValue() == 3) {
            C1835970xsR c1835970xsR2 = this.LLIZ;
            if (c1835970xsR2 == null) {
                return;
            }
            c1835970xsR2.LJIIJJI(false);
            return;
        }
        if (z && z2 && numValueOf != null && numValueOf.intValue() == 2) {
            C1835970xsR c1835970xsR3 = this.LLIZ;
            if (c1835970xsR3 == null) {
                return;
            }
            c1835970xsR3.LJIIJJI(true);
            return;
        }
        C1835970xsR c1835970xsR4 = this.LLIZ;
        if (c1835970xsR4 == null) {
            return;
        }
        HandlerHook.viewRemoveCallbacks(c1835970xsR4, c1835970xsR4.LLJLILLLLZIIL);
        TuxTextView tuxTextView2 = c1835970xsR4.LLJILJILJ;
        if (tuxTextView2 == null) {
            return;
        }
        C500260Jjc.LJIILIIL(tuxTextView2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.0xqY, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.0xqY] */
    public final void hT(EnumC1834820xqa enumC1834820xqa, boolean z, EnumC1834800xqY enumC1834800xqY) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        C1834770xqV c1834770xqV;
        boolean z2;
        boolean z3;
        boolean zZS = zS();
        ArrayList arrayList = new ArrayList();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJ;
        ?? r10 = 0;
        r10 = 0;
        r10 = 0;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state2 = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) state2.LJII()) {
                if ((interfaceC1891350zJl instanceof C1834770xqV) && (c1834770xqV = (C1834770xqV) interfaceC1891350zJl) != null) {
                    if (c1834770xqV.LL == enumC1834820xqa) {
                        int i = C1834830xqb.LIZ[enumC1834820xqa.ordinal()];
                        if (i != 4) {
                            if (i != 5) {
                                arrayList.add(C1834770xqV.LIZ(c1834770xqV, false, false, r10, r10, 0L, 4095));
                            } else {
                                C1834580xqC c1834580xqCLIZ = iS().getState().LLILZ.LIZ();
                                if (c1834580xqCLIZ != null && c1834580xqCLIZ.LLJZIJLIL != null && z && zZS) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                arrayList.add(C1834770xqV.LIZ(c1834770xqV, z2, false, r10, enumC1834800xqY, 0L, 3837));
                            }
                        } else {
                            if (z && zZS) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            arrayList.add(C1834770xqV.LIZ(c1834770xqV, z3, false, r10, enumC1834800xqY, 0L, 3837));
                        }
                    } else {
                        r10 = r10;
                        arrayList.add(C1834770xqV.LIZ(c1834770xqV, false, false, r10, r10, 0L, 4095));
                    }
                }
            }
        }
        if ((!arrayList.isEmpty()) && (viewOnAttachStateChangeListenerC20604515jv = this.LLJ) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIIJJI(arrayList, r10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dd2, viewGroup, false);
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void jT(long r8, X.C385340F8y r10, com.bytedance.android.livesdk.replay.proto.TextStickerConfig r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment.jT(long, X.0F8y, com.bytedance.android.livesdk.replay.proto.TextStickerConfig, boolean):void");
    }

    public static C2344009Gk bS(LiveHighLightPageFragment liveHighLightPageFragment, C1834580xqC c1834580xqC, long j, boolean z, int i) {
        Object objValueOf;
        Object next;
        Object objValueOf2;
        boolean z2;
        Object next2;
        String str;
        List<C1834580xqC> list;
        Object objValueOf3;
        List<C1834580xqC> list2;
        int i2;
        if ((i & 1) != 0) {
            c1834580xqC = liveHighLightPageFragment.iS().getState().LLILZ.LIZ();
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        liveHighLightPageFragment.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("room_id", liveHighLightPageFragment.LLJJJJJIL);
        c2344009Gk.LJIIIIZZ("anchor_id", liveHighLightPageFragment.LLJLIL);
        c2344009Gk.LJIIIIZZ("enter_from_page", liveHighLightPageFragment.LLLF);
        c2344009Gk.LJIIIIZZ("enter_from", liveHighLightPageFragment.LLLFF);
        c2344009Gk.LJIIIIZZ("last_page", liveHighLightPageFragment.LLLFFI);
        c2344009Gk.LJIIIIZZ("event_page", "highlight_page");
        c2344009Gk.LJIIIIZZ("click_position", liveHighLightPageFragment.LLLI);
        c2344009Gk.LJIIIIZZ("enter_method", liveHighLightPageFragment.LLLFZ);
        c2344009Gk.LIZJ(C500260Jjc.LJJJI(Boolean.valueOf(liveHighLightPageFragment.UR(c1834580xqC))) ? 1 : 0, "is_record");
        c2344009Gk.LJIIIIZZ("network_type", C0W0R.LIZIZ(liveHighLightPageFragment.getContext()));
        Iterator<T> it2 = liveHighLightPageFragment.iS().getState().LLILLL.LIZ.iterator();
        while (true) {
            objValueOf = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (((C1833730xop) next).LLILLJJLI == EnumC1782300wTs.HIGHLIGHT.getValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1833730xop c1833730xop = (C1833730xop) next;
        if (c1833730xop != null && (list2 = c1833730xop.LLILLL) != null) {
            if (list2.isEmpty()) {
                i2 = 0;
            } else {
                Iterator<C1834580xqC> it3 = list2.iterator();
                i2 = 0;
                while (it3.hasNext()) {
                    if ((!wS(Integer.valueOf(it3.next().LLJILJILJ))) && (i2 = i2 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            objValueOf2 = Integer.valueOf(i2);
        } else {
            objValueOf2 = null;
        }
        c2344009Gk.LJ(objValueOf2, "total_num");
        c2344009Gk.LJIIIIZZ("is_finished", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(liveHighLightPageFragment.LLLIIL)) ? 1 : 0));
        c2344009Gk.LJIIIIZZ("access_identity", C1834240xpe.LIZJ(liveHighLightPageFragment.LLJJLIIIJLLLLLLLZ));
        if (z) {
            c2344009Gk.LJFF("caption_button_status", liveHighLightPageFragment.gS(EnumC1834820xqa.CAPTION));
            c2344009Gk.LJFF("text_button_status", liveHighLightPageFragment.gS(EnumC1834820xqa.TEXT_STICKER));
            c2344009Gk.LJFF("music_button_status", liveHighLightPageFragment.gS(EnumC1834820xqa.MUSIC));
        }
        if (j > 0) {
            c2344009Gk.LIZLLL(j, "load_duration");
        }
        if (liveHighLightPageFragment.LLJL) {
            c2344009Gk.LJFF("post_type", "quick_post");
        } else {
            c2344009Gk.LJFF("post_type", "normal_post");
        }
        if (!liveHighLightPageFragment.uS()) {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                objValueOf3 = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
            } else {
                objValueOf3 = null;
            }
            c2344009Gk.LJ(objValueOf3, "viewer_user_id");
        }
        if (c1834580xqC != null) {
            c2344009Gk.LJIIIIZZ("fragment_id", String.valueOf(c1834580xqC.LLILZ));
            c2344009Gk.LIZJ(c1834580xqC.LLJILJILJ, "fragment_type");
            c2344009Gk.LIZLLL(c1834580xqC.LLJIJIL, "start_time");
            c2344009Gk.LIZIZ(c1834580xqC.LLJIJIL + c1834580xqC.LLJILJIL, "end_time");
            c2344009Gk.LIZJ(C500260Jjc.LJJJI(Boolean.valueOf(c1834580xqC.LLJJI)) ? 1 : 0, "is_posted");
            if (c1834580xqC.LLIZ == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            c2344009Gk.LIZJ(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0, "in_progress");
            c2344009Gk.LIZIZ(c1834580xqC.LLJILJIL, "duration");
            Iterator<T> it4 = liveHighLightPageFragment.iS().getState().LLILLL.LIZ.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (((C1833730xop) next2).LLILLJJLI == c1834580xqC.LL) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            C1833730xop c1833730xop2 = (C1833730xop) next2;
            if (c1833730xop2 != null && (list = c1833730xop2.LLILLL) != null) {
                objValueOf = Integer.valueOf(list.indexOf(c1834580xqC));
            }
            c2344009Gk.LJ(objValueOf, "rank");
            if (c1834580xqC.LL == EnumC1782300wTs.HIGHLIGHT.getValue()) {
                str = "highlight_clips";
            } else {
                str = "autocut_videos";
            }
            c2344009Gk.LJIIIIZZ("sub_tab", str);
            c2344009Gk.LJFF("vid", c1834580xqC.LLJLL);
        }
        if (!liveHighLightPageFragment.LLJLLL.isEmpty()) {
            c2344009Gk.LJII(liveHighLightPageFragment.LLJLLL);
        }
        return c2344009Gk;
    }

    public static Map hS(LiveHighLightPageFragment liveHighLightPageFragment, Float f, Integer num, Integer num2, String str, int i) {
        C1834580xqC c1834580xqCLIZ;
        long jCurrentTimeMillis;
        long j;
        String str2 = null;
        if ((i & 1) != 0) {
            c1834580xqCLIZ = liveHighLightPageFragment.iS().getState().LLILZ.LIZ();
        } else {
            c1834580xqCLIZ = null;
        }
        if ((i & 2) != 0) {
            f = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        liveHighLightPageFragment.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (c1834580xqCLIZ != null) {
            str2 = c1834580xqCLIZ.LLIZLLLIL;
        }
        c2344009Gk.LJIIIIZZ("video_url", str2);
        c2344009Gk.LJIIIIZZ("enter_from_page", liveHighLightPageFragment.LLLF);
        c2344009Gk.LJIIIIZZ("enter_from", liveHighLightPageFragment.LLLFF);
        c2344009Gk.LJIIIIZZ("last_page", liveHighLightPageFragment.LLLFFI);
        c2344009Gk.LJIIIIZZ("event_page", "highlight_page");
        c2344009Gk.LJIIIIZZ("room_id", liveHighLightPageFragment.LLJJJJJIL);
        c2344009Gk.LJIIIIZZ("network_type", C0W0R.LIZIZ(liveHighLightPageFragment.getContext()));
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "replay_highlight");
        c2344009Gk.LJ(NetworkUtils.getNetworkType(liveHighLightPageFragment.getContext()), "player_network");
        c2344009Gk.LJIIIIZZ("internet_speed", String.valueOf(C1479130oat.LJII()));
        if (f != null) {
            c2344009Gk.LIZIZ(f.floatValue(), "play_bitrate");
            c2344009Gk.LIZLLL(System.currentTimeMillis() - liveHighLightPageFragment.LLLIIIL, "duration");
            c2344009Gk.LIZ(((Number) C2097608Jq.LJFF("cpu_speed", new LiveHostPerformanceMonitor().getCpuRate())).doubleValue(), "cpu_speed");
            c2344009Gk.LIZJ(C1305320k4Y.LJ(liveHighLightPageFragment.getContext()), "cpu_cores");
        }
        if (num != null) {
            int iIntValue = num.intValue();
            c2344009Gk.LIZJ(iIntValue, "block_type");
            if (iIntValue == 1) {
                jCurrentTimeMillis = System.currentTimeMillis();
                j = liveHighLightPageFragment.LLLJIL;
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                j = liveHighLightPageFragment.LLLJL;
            }
            c2344009Gk.LIZLLL(jCurrentTimeMillis - j, "duration");
        }
        if (num2 != null) {
            c2344009Gk.LIZJ(num2.intValue(), "errorCode");
        }
        if (str != null) {
            c2344009Gk.LJFF("errorDomain", str);
        }
        if (c1834580xqCLIZ != null) {
            c2344009Gk.LJIIIIZZ("fragment_id", String.valueOf(c1834580xqCLIZ.LLILZ));
            c2344009Gk.LIZJ(c1834580xqCLIZ.LLJILJILJ, "fragment_type");
            c2344009Gk.LJIIIIZZ("video_url", c1834580xqCLIZ.LLIZLLLIL);
            c2344009Gk.LIZIZ(c1834580xqCLIZ.LLJILJIL, "video_duration");
            c2344009Gk.LJFF("vid", c1834580xqCLIZ.LLJLL);
        }
        return c2344009Gk.LIZ;
    }
}
