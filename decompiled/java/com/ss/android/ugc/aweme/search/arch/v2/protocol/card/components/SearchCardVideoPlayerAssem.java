package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.AbstractC585420Mxg;
import X.C01GW;
import X.C07E5;
import X.C098200Yq;
import X.C0C1B;
import X.C0H62;
import X.C0N7A;
import X.C0R45;
import X.C1012300cRw;
import X.C1331570kkt;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1558520qew;
import X.C1559260qg8;
import X.C189200o6;
import X.C21565319aV;
import X.C302000Bsc;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C438710HIf;
import X.C452501pT;
import X.C653660PkS;
import X.C655510PnR;
import X.C657280PqI;
import X.C657320PqM;
import X.C657410PqV;
import X.C657910PrJ;
import X.C658730Psd;
import X.C658900Psu;
import X.C659400Pti;
import X.C661470Px3;
import X.C661490Px5;
import X.C723580SZw;
import X.C786410Ut5;
import X.EnumC1334360kpO;
import X.EnumC714850S2h;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC494301wD;
import X.InterfaceC583720Muw;
import X.InterfaceC641090PCp;
import X.InterfaceC658750Psf;
import X.InterfaceC661540PxA;
import X.InterfaceC712990Rxx;
import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.InternalPlayerSyncAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$IPlayerStateHostAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchResultPictureSrExperiment;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class SearchCardVideoPlayerAssem extends ReusedUISlotAssem<SearchCardVideoPlayerAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s>, SearchComponentCenter$Player$PlayerControlAbility {
    public InterfaceC435460H5s LLJZIJLIL;
    public C653660PkS LLL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 224));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 227));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 226));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 225));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 221));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 231));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 228));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 229));
    public final C1559260qg8 LLLF = new C1559260qg8(new C723580SZw(this, C657410PqV.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLLFF = new C1559260qg8(new C723580SZw(this, C657280PqI.class, null), checkSupervisorPrepared());
    public final C01GW LLLFFI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(145));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 230));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 219));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 223));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 220));
    public final AwS589S0100000_10 LLLIIIIL = new AwS589S0100000_10(this, 118);
    public final C655510PnR LLLIIIL = new InterfaceC658750Psf() { // from class: X.0PnR
        @Override // X.InterfaceC658750Psf
        public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
        }

        @Override // X.InterfaceC658750Psf
        public final void Ck(JSONObject jSONObject) {
            Aweme aweme;
            ISearchContextAbility iSearchContextAbilityLIZJ;
            InterfaceC435460H5s interfaceC435460H5s = this.LL.LLJZIJLIL;
            if (interfaceC435460H5s != null && (aweme = interfaceC435460H5s.getAweme()) != null && (iSearchContextAbilityLIZJ = C0Q3E.LIZJ(aweme)) != null) {
                boolean z = true;
                if (!jSONObject.optBoolean("isSuccess")) {
                    z = false;
                }
                iSearchContextAbilityLIZJ.fe(new C641710PEz(z));
            }
        }
    };
    public final C0N7A LLLIIL = new C0H62() { // from class: X.0N7A
        @Override // X.C0H62
        public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
            if (C0N79.LIZ[c0o0l2.ordinal()] == 1 && c0o0l != C0O0L.AVAILABLE) {
                C1524805y2.LIZIZ(0L, new AwS554S0100000_10(this.LL, 222));
            }
        }
    };

    public String Ap() {
        return "SearchCardVideoPlayerAssem";
    }

    public void Ep() {
        try {
            C1558520qew.LJI(this, SearchPlayerScope.class, (InterfaceC494301wD) this.LLLI.getValue(), SearchServiceCenter$AutoPlayAbility.class, null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f11;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void VV1(C657320PqM c657320PqM) {
    }

    public void op(C653660PkS c653660PkS) {
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void qq1(C657320PqM c657320PqM) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C661470Px3 Bp() {
        return (C661470Px3) this.LLJLLIL.getValue();
    }

    public final void sp() {
        Aweme aweme;
        Video video;
        UrlModel cover;
        int i;
        String str;
        Integer num;
        Function0<? extends InterfaceC658750Psf> function0;
        InterfaceC435460H5s interfaceC435460H5s = this.LLJZIJLIL;
        if (interfaceC435460H5s == null || (aweme = interfaceC435460H5s.getAweme()) == null || (video = aweme.getVideo()) == null || (cover = video.getCover()) == null) {
            return;
        }
        C657280PqI c657280PqI = (C657280PqI) this.LLLFF.getValue();
        InterfaceC658750Psf interfaceC658750PsfInvoke = (c657280PqI == null || (function0 = c657280PqI.LLIZLLLIL) == null) ? null : function0.invoke();
        C658730Psd c658730Psd = interfaceC658750PsfInvoke instanceof C658730Psd ? (C658730Psd) interfaceC658750PsfInvoke : null;
        C657280PqI c657280PqI2 = (C657280PqI) this.LLLFF.getValue();
        int iIntValue = 0;
        boolean z = c657280PqI2 != null ? c657280PqI2.LLIZ : false;
        C657280PqI c657280PqI3 = (C657280PqI) this.LLLFF.getValue();
        String str2 = c657280PqI3 != null ? c657280PqI3.LLJ : null;
        if (C0C1B.LIZ()) {
            if (c658730Psd != null) {
                i = c658730Psd.LL;
                str = c658730Psd.LLILZ;
                if (str == null) {
                }
                if (c658730Psd != null && (num = c658730Psd.LLILLL) != null) {
                    iIntValue = num.intValue();
                }
                C657910PrJ.LIZ(null, C438710HIf.LIZ(cover), (SmartImageView) this.LLJL.getValue(), null, 0, 0, str, i, null, Integer.valueOf(iIntValue), null, this.LLLIIIL, str2, 7481);
                return;
            }
            i = 0;
            str = "";
            if (c658730Psd != null) {
                iIntValue = num.intValue();
            }
            C657910PrJ.LIZ(null, C438710HIf.LIZ(cover), (SmartImageView) this.LLJL.getValue(), null, 0, 0, str, i, null, Integer.valueOf(iIntValue), null, this.LLLIIIL, str2, 7481);
            return;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLJL.getValue());
        InterfaceC658750Psf interfaceC658750Psf = c658730Psd;
        if (c658730Psd == null) {
            interfaceC658750Psf = this.LLLIIIL;
        }
        c1331670kl3LJIIIIZZ.LJJJIL = interfaceC658750Psf;
        if (z) {
            if (C302000Bsc.LIZIZ()) {
                c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.HIGH;
            }
            if (C302000Bsc.LIZ()) {
                c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                c1331670kl3LJIIIIZZ.LJJJJJ = "search_cache";
            }
            if (SearchResultPictureSrExperiment.LIZ() > 0.0f) {
                c1331670kl3LJIIIIZZ.LJJIJIL((C1331570kkt) C658900Psu.LIZ.getValue());
            }
        }
        if (str2 != null) {
            c1331670kl3LJIIIIZZ.LIZLLL(str2);
        }
        c1331670kl3LJIIIIZZ.LJIIJJI();
    }

    public void tp() {
        String str;
        Aweme aweme;
        InterfaceC435460H5s interfaceC435460H5s = this.LLJZIJLIL;
        if (interfaceC435460H5s != null && (aweme = interfaceC435460H5s.getAweme()) != null) {
            Bp().LJFF(aweme);
        }
        C661490Px5 dataProvider = Bp().getDataProvider();
        if (dataProvider != null) {
            dataProvider.LJIL = this.LLL;
        }
        C661490Px5 dataProvider2 = Bp().getDataProvider();
        if (dataProvider2 != null) {
            C653660PkS c653660PkS = this.LLL;
            if (c653660PkS == null || (str = c653660PkS.LJIJI) == null) {
                str = "";
            }
            dataProvider2.LJFF(str);
        }
        C659400Pti c659400Pti = (C659400Pti) this.LLLFZ.getValue();
        InterfaceC435460H5s interfaceC435460H5s2 = this.LLJZIJLIL;
        c659400Pti.LLIZLLLIL = interfaceC435460H5s2 != null ? interfaceC435460H5s2.getAweme() : null;
        InterfaceC641090PCp interfaceC641090PCp = (InterfaceC641090PCp) this.LLLIIII.getValue();
        if (interfaceC641090PCp != null) {
            Bp().setContainerStatusProvider(interfaceC641090PCp);
            InternalPlayerSyncAbility internalPlayerSyncAbility = (InternalPlayerSyncAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InternalPlayerSyncAbility.class, null);
            if (internalPlayerSyncAbility != null) {
                internalPlayerSyncAbility.pI1(Bp(), this.LLLIIIIL);
            }
        }
        Ep();
    }

    public final TuxIconView up() {
        return (TuxIconView) this.LLJLL.getValue();
    }

    public final CopyOnWriteArrayList<InterfaceC583720Muw> yp() {
        return (CopyOnWriteArrayList) this.LLLFFI.getValue();
    }

    public final C1012300cRw zp() {
        return (C1012300cRw) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final View LLLLLLLZIL() {
        return Bp();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final boolean isMute() {
        InterfaceC661540PxA interfaceC661540PxA = Bp().LLJ;
        if (interfaceC661540PxA == null) {
            return false;
        }
        return interfaceC661540PxA.isMute();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final boolean isPlaying() {
        return Bp().isPlaying();
    }

    @Override // X.InterfaceC712990Rxx
    public void unBind() {
        InternalPlayerSyncAbility internalPlayerSyncAbility;
        Bp().LJIIJ();
        try {
            C1558520qew.LJIIJ(this, SearchPlayerScope.class, SearchServiceCenter$AutoPlayAbility.class, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (this.LLLIIII.getValue() == null || (internalPlayerSyncAbility = (InternalPlayerSyncAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InternalPlayerSyncAbility.class, null)) == null) {
            return;
        }
        internalPlayerSyncAbility.e70(Bp());
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void Im2(InterfaceC583720Muw interfaceC583720Muw) {
        yp().add(interfaceC583720Muw);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void LJIILJJIL(boolean z) {
        Bp().setMute(z);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C21565319aV.LIZIZ(view, Float.valueOf(C418440Gaw.LIZIZ(4)), null, null, null, null, 30);
        C1012300cRw c1012300cRwZp = zp();
        C427690Gpr.LJI(c1012300cRwZp, null);
        C786410Ut5.Ja(c1012300cRwZp, new ACListenerS145S0100000_10(this, 44));
        C427690Gpr.LJI(up(), null);
        C786410Ut5.a9(up(), new ACListenerS145S0100000_10(this, 45));
        C661470Px3 c661470Px3Bp = Bp();
        c661470Px3Bp.setEnableLifecycleObserver(true);
        c661470Px3Bp.setEnableHideCoverAnim(true);
        c661470Px3Bp.setMCoverView((ImageView) this.LLJL.getValue());
        c661470Px3Bp.setClipToOutline(true);
        c661470Px3Bp.setVideoUiListener((AbstractC585420Mxg) this.LLLFZ.getValue());
        try {
            C1558520qew.LJI(this, SearchPlayerScope.class, this, SearchComponentCenter$Player$PlayerControlAbility.class, null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Bp().setVideoLifeCycleListener(new OnUIPlayListener() { // from class: X.0Muv
            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
                return C583620Mum.LIZ(this);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBrightnessChanged(String str, float f) {
                C583620Mum.LIZIZ(this, str, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
                C583620Mum.LIZJ(this, str, j, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
                C583620Mum.LIZLLL(this, str, j);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                C583620Mum.LJFF(this, str, z, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBuffering(boolean z) {
                C583620Mum.LJI(this, z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
                C583620Mum.LJII(this, str, z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onCrosstalkHappened(String str) {
                C583620Mum.LJIIIIZZ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
                C583620Mum.LJIIIZ(this, str, list);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
                C583620Mum.LJIIJ(this, str, z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                C583620Mum.LJIIJJI(this, str, z, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onDecoderBuffering(boolean z) {
                C583620Mum.LJIIL(this, z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
                C583620Mum.LJIILIIL(this, i, j, j2, map);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                C583620Mum.LJIILJJIL(this, str, c1480420ocy);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onLoopPlay(String str, int i) {
                C583620Mum.LJIILL(this, str, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
                C583620Mum.LJIILLIIL(this, str, c1480290ocl);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPausePlay(String str) {
                C583620Mum.LJIIZILJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJIJ(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompleted(String str, int i) {
                C583620Mum.LJIJJ(this, str, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
                C583620Mum.LJIJJLI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJIL(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
                C583620Mum.LJJIFFI(this, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayPause(String str) {
                C583620Mum.LJJII(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayPrepare(String str) {
                C583620Mum.LJJIII(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayPrepared(String str) {
                C583620Mum.LJJIIJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayProgressChange(float f) {
                C583620Mum.LJJIIJZLJL(this, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
                C583620Mum.LJJIIZ(this, str, j, j2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayRelease(String str) {
                C583620Mum.LJJIIZI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str) {
                C583620Mum.LJJIJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
                C583620Mum.LJJIJIIJI(this, str, jSONObject);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                C583620Mum.LJJIJIIJIL(this, str, jSONObject, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str, boolean z) {
                C583620Mum.LJJIJIL(this, str, z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
                C583620Mum.LJJIJL(this, str, i, jSONObject);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJJIL(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPreRenderSessionMissed(String str) {
                C583620Mum.LJJIZ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPreparePlay(String str) {
                C583620Mum.LJJJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJJJI(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                C583620Mum.LJJJJ(this, c1480420ocy);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                C583620Mum.LJJJIL(this, str, c1480420ocy);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
                C583620Mum.LJJJJI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
                C583620Mum.LJJJJIZL(this, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onResumePlay(String str) {
                C583620Mum.LJJJJJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJJJJJL(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
                C583620Mum.LJJJJLI(this, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
                C583620Mum.LJJJJL(this, str, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSeekEnd(String str, boolean z) {
                C583620Mum.LJJJJLL(this, str, z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSeekStart(String str, int i, float f) {
                C583620Mum.LJJJJZ(this, str, i, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSpeedChanged(String str, float f) {
                C583620Mum.LJJJJZI(this, str, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onStopPlay(String str) {
                C583620Mum.LJJJLIIL(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
                C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onVideoSecondFrame(String str) {
                C583620Mum.LJJJLZIJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
                C583620Mum.LJJJZ(this, str, i, i2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str) {
                C583620Mum.LJIJI(this, str);
                Iterator<InterfaceC583720Muw> it2 = this.LL.yp().iterator();
                while (it2.hasNext()) {
                    it2.next().LIZLLL();
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlaying(String str) {
                C583620Mum.LJJIJLIJ(this, str);
                Iterator<InterfaceC583720Muw> it2 = this.LL.yp().iterator();
                while (it2.hasNext()) {
                    it2.next().LJJZ();
                }
                SearchCardVideoPlayerAssem searchCardVideoPlayerAssem = this.LL;
                searchCardVideoPlayerAssem.getClass();
                SearchComponentCenter$Player$IPlayerStateHostAbility searchComponentCenter$Player$IPlayerStateHostAbility = (SearchComponentCenter$Player$IPlayerStateHostAbility) C1558520qew.LIZ(C1558520qew.LJIIL(searchCardVideoPlayerAssem), SearchComponentCenter$Player$IPlayerStateHostAbility.class, null);
                if (searchComponentCenter$Player$IPlayerStateHostAbility != null) {
                    searchComponentCenter$Player$IPlayerStateHostAbility.LJJZ();
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBuffering(String str, boolean z) {
                C583620Mum.LJ(this, str, z);
                Iterator<InterfaceC583720Muw> it2 = this.LL.yp().iterator();
                while (it2.hasNext()) {
                    it2.next().onBuffering(z);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
                C583620Mum.LJJ(this, str, c1481290oeN);
                for (InterfaceC583720Muw interfaceC583720Muw : this.LL.yp()) {
                    String.valueOf(c1481290oeN);
                    interfaceC583720Muw.LIZJ();
                }
            }
        });
        view.addOnAttachStateChangeListener(new C0R45(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.InterfaceC435460H5s r12) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void yA2(InterfaceC583720Muw interfaceC583720Muw) {
        yp().remove(interfaceC583720Muw);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
