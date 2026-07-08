package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C01GW;
import X.C0ANG;
import X.C0C64;
import X.C0CHQ;
import X.C0FNV;
import X.C0LD3;
import X.C0LEP;
import X.C0MVY;
import X.C0P4E;
import X.C0WZX;
import X.C0XPD;
import X.C11NJ;
import X.C123100dR;
import X.C1398110mUD;
import X.C1399380mWG;
import X.C1399730mWp;
import X.C13LE;
import X.C13LP;
import X.C1443560nfW;
import X.C1558360qeg;
import X.C1558520qew;
import X.C15L9;
import X.C15LG;
import X.C1637806bA;
import X.C1661100tKO;
import X.C1661180tKW;
import X.C1661270tKf;
import X.C16H4;
import X.C1850180yFM;
import X.C19406010w6;
import X.C194353111z;
import X.C19576911iZ;
import X.C19719912Dl;
import X.C19EG;
import X.C1ER1;
import X.C20506515Lz;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C291001Au;
import X.C297350Bl7;
import X.C298080BmI;
import X.C298090BmJ;
import X.C298200BmU;
import X.C298260Bma;
import X.C418440Gaw;
import X.C425000GlW;
import X.C452501pT;
import X.C589880NBq;
import X.C629480OmY;
import X.C630310Ont;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C810560Vqw;
import X.C814420VxA;
import X.ExecutorC1592406Li;
import X.InterfaceC1662290tMJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC631090Op9;
import X.ProgressDialogC1399760mWs;
import Y.ARunnableS100S0200000_31;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS88S0200000_19;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.detail.prefab.ShootAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.music.ui.IMDPMobAbility;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCommerceRecommendViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.SharedMusicAwemeListViewModel;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.FromGroupPropService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach.TtsReuseServiceImpl;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS114S1200000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicShootAssem extends ShootAssem implements ShootAbility, ShootContainerProviderAbility, C15LG {
    public static final C1399380mWG LLZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLZIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public final AssemVMLazy LLJJJJLIIL;
    public final C01GW LLJJL;
    public ProgressDialogC1399760mWs LLJJLIIIJLLLLLLLZ;
    public ProgressDialogC1399760mWs LLJL;
    public CreativeDialogWrapper LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public C19EG LLJLLIL;
    public Fragment LLJLLL;
    public Music LLJZ;
    public Music LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public String LLLFFI;
    public long LLLFZ;
    public boolean LLLI;
    public C15L9 LLLII;
    public boolean LLLIIII;
    public MusicDetail LLLIIIIL;
    public final C11NJ LLLIIIL;
    public boolean LLLIIL;
    public final ICommerceMusicLogger LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;
    public final C01GW LLLLIILLL;
    public final C01GW LLLLIL;
    public final C01GW LLLLILI;
    public final C01GW LLLLJ;
    public final C01GW LLLLJI;
    public final C01GW LLLLL;
    public final C01GW LLLLLIL;
    public final C01GW LLLLLILLIL;
    public final C01GW LLLLLJIL;
    public final C01GW LLLLLJLJLL;
    public final C01GW LLLLLL;
    public final C01GW LLLLLLIL;
    public final C01GW LLLLLLJ;
    public final C01GW LLLLLLL;
    public final C01GW LLLLLLLLL;
    public final C01GW LLLLLLLLLL;
    public final C01GW LLLLLLLZIL;
    public final C01GW LLLLLLZ;
    public final C01GW LLLLLLZZ;
    public final C01GW LLLLLZ;
    public final C01GW LLLLLZIL;
    public final C01GW LLLLLZL;
    public final C01GW LLLLZ;
    public final C01GW LLLLZI;
    public final C01GW LLLLZIL;
    public long LLLLZLL;
    public boolean LLLLZLLIL;
    public boolean LLLLZLLLI;
    public ProgressDialogC1399760mWs LLLZ;
    public C20506515Lz LLLZI;
    public boolean LLLZIIL;
    public boolean LLLZIL;
    public C425000GlW LLLZL;
    public final boolean LLLZLL;
    public final C01GW LLLZLZ;
    public final C01GW LLLZZ;
    public final C01GW LLLZZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicShootAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLZ = new C1399380mWG();
    }

    public MusicShootAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1303), AFwS276S0000000_31.get$arr$(160), null, true);
        this.LLJJL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1288));
        this.LLLFFI = UUID.randomUUID().toString();
        this.LLLIIIL = new C11NJ();
        this.LLLIILIL = (ICommerceMusicLogger) ServiceManager.get().getService(ICommerceMusicLogger.class);
        this.LLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1285));
        this.LLLILZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1290));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1293));
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1286));
        this.LLLIZZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1287));
        this.LLLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1294));
        this.LLLJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1302));
        this.LLLJL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1283));
        this.LLLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 893));
        this.LLLLII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 890));
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 895));
        this.LLLLIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 891));
        this.LLLLIILL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1298));
        this.LLLLIILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 894));
        this.LLLLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 884));
        this.LLLLILI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 881));
        this.LLLLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1291));
        this.LLLLJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1284));
        this.LLLLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 886));
        this.LLLLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1301));
        this.LLLLLILLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 900));
        this.LLLLLJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 889));
        this.LLLLLJLJLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 896));
        this.LLLLLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1292));
        this.LLLLLLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 882));
        this.LLLLLLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1289));
        this.LLLLLLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 885));
        this.LLLLLLLLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 887));
        this.LLLLLLLLLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 888));
        this.LLLLLLLZIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 901));
        this.LLLLLLZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 883));
        this.LLLLLLZZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1300));
        this.LLLLLZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1295));
        this.LLLLLZIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1296));
        this.LLLLLZL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1297));
        this.LLLLZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 892));
        this.LLLLZI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 898));
        this.LLLLZIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 899));
        this.LLLLZLL = -1L;
        this.LLLZLL = C0C64.LJIILLIIL().LJIIIZ(31744, "mdp_support_christmas_style", true, false);
        this.LLLZLZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 897));
        this.LLLZZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(258));
        this.LLLZZIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1299));
    }

    public final void Ep() {
        this.LLLZIIL = false;
        ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LLLZ;
        if (progressDialogC1399760mWs != null) {
            C0FNV.LIZ(progressDialogC1399760mWs);
        }
        Handler handler = (Handler) this.LLLZLZ.getValue();
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, Y.ARunnableS104S0100000_4, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wq() {
        /*
            r15 = this;
            r9 = r15
            com.ss.android.ugc.aweme.music.model.Music r1 = r9.Fp()
            if (r1 != 0) goto L8
            return
        L8:
            boolean r0 = X.C306810C0x.LIZ()
            r4 = 0
            r7 = 0
            if (r0 == 0) goto Lb4
            X.0C64 r5 = X.C0C64.LJIILLIIL()
            r3 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r2 = "enable_eh_lyric_mdp_prefetch"
            r0 = 1
            boolean r0 = r5.LJIIIZ(r3, r2, r0, r4)
            if (r0 == 0) goto Lb4
            java.util.List r2 = r1.getLyrics()
            if (r2 == 0) goto L35
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L35
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L86
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L86
        L35:
            long r5 = r1.getId()
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb4
            X.15Lw r10 = new X.15Lw
            r10.<init>(r9, r1)
            android.view.ViewGroup r0 = r9.lp()
            r0.setEnabled(r4)
            com.bytedance.bpea.transmit.delegate.BPEAHandler r7 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r7.<init>(r0)
            X.013C r6 = new X.013C
            r6.<init>()
            X.00zU r8 = new X.00zU
            r8.<init>()
            kotlin.jvm.internal.AwS71S0500000_9 r5 = new kotlin.jvm.internal.AwS71S0500000_9
            r11 = 2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            Y.ARunnableS104S0100000_4 r4 = new Y.ARunnableS104S0100000_4
            r0 = 78
            r4.<init>(r5, r0)
            r8.element = r4
            r2 = 1500(0x5dc, double:7.41E-321)
            X.C786410Ut5.LJLIIL(r2, r7, r4)
            java.lang.Class<com.ss.android.ugc.aweme.port.in.IMusicService> r9 = com.ss.android.ugc.aweme.port.in.IMusicService.class
            r10 = 0
            r13 = 14
            r14 = 0
            r11 = r10
            r12 = r10
            java.lang.Object r4 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r9, r10, r11, r12, r13, r14)
            com.ss.android.ugc.aweme.port.in.IMusicService r4 = (com.ss.android.ugc.aweme.port.in.IMusicService) r4
            if (r4 != 0) goto La3
            r5.invoke()
            return
        L86:
            java.util.Iterator r2 = r2.iterator()
        L8a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.music.model.LyricStruct r0 = (com.ss.android.ugc.aweme.music.model.LyricStruct) r0
            if (r0 == 0) goto L8a
            java.lang.String r0 = r0.lyricUrl
            if (r0 == 0) goto L8a
            int r0 = r0.length()
            if (r0 != 0) goto Lb4
            goto L8a
        La3:
            long r2 = r1.getId()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            X.10lX r0 = new X.10lX
            r0.<init>()
            r4.requestMusic(r2, r0)
            return
        Lb4:
            r9.vq(r1, r4, r7, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem.wq():void");
    }

    public final String Ip() {
        return (String) this.LLLLLZIL.getValue();
    }

    public final String Jp() {
        return (String) this.LLLLLZL.getValue();
    }

    public final SharedMusicAwemeListViewModel Qp() {
        return (SharedMusicAwemeListViewModel) this.LLLZZIL.getValue();
    }

    public final int Tp() {
        return ((Number) this.LLLLLIL.getValue()).intValue();
    }

    public final Map<?, ?> Up() {
        return (Map) this.LLLLZIL.getValue();
    }

    public final MusicDetailViewModel Vp() {
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLZIL;
        return (MusicDetailViewModel) assemVMLazy.getValue();
    }

    public final C589880NBq Wp() {
        return (C589880NBq) this.LLLZZ.getValue();
    }

    public final String Xp() {
        return (String) this.LLLJ.getValue();
    }

    public final String dq() {
        if (TextUtils.isEmpty((String) this.LLLLJI.getValue())) {
            return null;
        }
        try {
            return JSONObjectProtectorUtils.getString(new JSONObject((String) this.LLLLJI.getValue()), "shoot_from");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final String fq() {
        return (String) this.LLLJL.getValue();
    }

    public final C19EG getActivity() {
        C19EG c19eg = this.LLJLLIL;
        if (c19eg != null) {
            return c19eg;
        }
        return null;
    }

    public final String getAwemeId() {
        return (String) this.LLLIL.getValue();
    }

    public final Fragment getFragment() {
        Fragment fragment = this.LLJLLL;
        if (fragment != null) {
            return fragment;
        }
        return null;
    }

    public final String getFrom() {
        return (String) this.LLLILZ.getValue();
    }

    public final int jq() {
        return ((Number) this.LLLLIIL.getValue()).intValue();
    }

    public final int kq() {
        return ((Number) this.LLLILZJ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void lP0() {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(getActivity(), "single_song", true)) {
            return;
        }
        if (C298200BmU.LIZ()) {
            C0CHQ.LIZ().LJJJJJ().preloadVESoAsync();
        }
        this.LLLFFI = UUID.randomUUID().toString();
        this.LLLLZLLIL = false;
        this.LLLLZLL = System.currentTimeMillis();
        qq("user_click", "usesound_button");
        InterfaceC631090Op9 interfaceC631090Op9Gm0 = Gm0();
        if (interfaceC631090Op9Gm0 != null) {
            interfaceC631090Op9Gm0.LIZJ();
        } else if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZLLL()) {
            ICommerceMusicLogger iCommerceMusicLogger = this.LLLIILIL;
            C1850180yFM.LIZ.getClass();
            iCommerceMusicLogger.log(C1850180yFM.LJFF, new AwS606S0100000_27(this, 165));
        }
        withState(Vp(), new AwS588S0100000_9(this, 321));
    }

    public final int lq() {
        return ((Number) this.LLLLLJIL.getValue()).intValue();
    }

    public final boolean pq() {
        return ((Boolean) this.LLLLZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void te0() {
        MusicDetail musicDetail;
        Music music;
        String mid;
        MatchedSoundInfo matchedSongInfo;
        Music music2;
        Music music3;
        int i = 0;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(getActivity(), "share_to_story", true)) {
            return;
        }
        this.LLLFFI = UUID.randomUUID().toString();
        this.LLLLZLLIL = true;
        ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL().LIZJ(new C19406010w6(C629480OmY.LJ(getFragment()), (Aweme) null, "music_page", "user_click", "addstory_button", 34));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "single_song");
        c2344009Gk.LJIIIIZZ("position", "music");
        MusicDetail musicDetail2 = this.LLLIIIIL;
        c2344009Gk.LIZJ((musicDetail2 == null || (music3 = musicDetail2.music) == null || !music3.isPgc()) ? 0 : 1, "is_pgc");
        MusicDetail musicDetail3 = this.LLLIIIIL;
        if ((musicDetail3 != null && (music2 = musicDetail3.music) != null && music2.isPgc()) || ((musicDetail = this.LLLIIIIL) != null && (music = musicDetail.music) != null && C630310Ont.LIZIZ(music))) {
            i = 1;
        }
        c2344009Gk.LIZJ(i, "is_pgc_style");
        c2344009Gk.LJII(C1ER1.LIZIZ.LLZ());
        C20684815ws.LJIILLIIL("share_to_story_click", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", "single_song");
        c2344009Gk2.LJIIIIZZ("content_type", "share");
        c2344009Gk2.LJIIIIZZ("creation_id", this.LLLFFI);
        c2344009Gk2.LJIIIIZZ("shared_content_type", "music");
        c2344009Gk2.LJIIIIZZ("group_id", getAwemeId());
        c2344009Gk2.LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
        String str = "";
        String strAq = aq("");
        if (C123100dR.LIZ(strAq)) {
            c2344009Gk2.LJFF("enter_method", strAq);
        }
        if (C123100dR.LIZ((String) this.LLLLLZ.getValue())) {
            c2344009Gk2.LJFF("single_song_shoot_previous_page", (String) this.LLLLLZ.getValue());
        }
        if (C123100dR.LIZ(Ip())) {
            c2344009Gk2.LJFF("single_song_shoot_previous_enter_method", Ip());
        }
        if (C123100dR.LIZ(Jp())) {
            c2344009Gk2.LJFF("previous_search_query", Jp());
        }
        if (this.LLLLZI.getValue() != null) {
            c2344009Gk2.LJFF("has_lyric_sticker", "1");
        }
        tp(c2344009Gk2);
        C1399380mWG c1399380mWG = LLZ;
        C291001Au<MusicAwemeList> c291001Au = Qp().getState().LL;
        String id = null;
        MusicAwemeList musicAwemeList = c291001Au != null ? c291001Au.LIZ : null;
        c1399380mWG.getClass();
        c2344009Gk2.LJFF("is_same_music_supply_detail_page", C1399380mWG.LIZIZ(musicAwemeList));
        c2344009Gk2.LIZJ(lq(), "is_feed_pre_download_mdp");
        Context context = getContext();
        if (context != null) {
            c2344009Gk2.LJFF("prop_id", Gp());
            IMDPMobAbility iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(getVAssemScope(), IMDPMobAbility.class, null);
            if (iMDPMobAbility != null) {
                C291001Au<MusicAwemeList> c291001Au2 = Qp().getState().LL;
                iMDPMobAbility.Wv0(context, c2344009Gk2, null, c291001Au2 != null ? c291001Au2.LIZ : null);
            }
            Music music4 = this.LLJZ;
            if (music4 != null && (matchedSongInfo = music4.getMatchedSongInfo()) != null) {
                id = matchedSongInfo.getId();
            }
            c2344009Gk2.LJFF("meta_song_id", id);
        }
        c2344009Gk2.LJFF("shoot_way", "share_to_story");
        c2344009Gk2.LJFF("music_selected_from", "music_share");
        c2344009Gk2.LJFF("page_name", Vp().LLJJJJLIIL);
        zp(c2344009Gk2);
        if (C298260Bma.LIZ()) {
            Music musicFp = Fp();
            if (musicFp != null && (mid = musicFp.getMid()) != null) {
                str = mid;
            }
            c2344009Gk2.LJFF("music_id", str);
            ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZ(c2344009Gk2.LIZ);
        } else {
            C20684815ws.LJIILLIIL("shoot", c2344009Gk2.LIZ);
        }
        withState(Vp(), new AwS608S0100000_29(this, 137));
    }

    public final void yq() {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(getActivity(), "single_song", true) || getFragment() == null) {
            return;
        }
        Fragment fragment = getFragment();
        if (fragment == null || !fragment.isDetached()) {
            MusicCommerceRecommendViewModel musicCommerceRecommendViewModel = (MusicCommerceRecommendViewModel) ViewModelProviders.of(getFragment()).get(MusicCommerceRecommendViewModel.class);
            boolean z = musicCommerceRecommendViewModel.LLILLJJLI;
            this.LLLF = z;
            Music music = this.LLJZIJLIL;
            if (music != null) {
                MusicModel musicModelConvertToMusicModel = music.convertToMusicModel();
                if (musicModelConvertToMusicModel == null) {
                    return;
                }
                musicModelConvertToMusicModel.setSimilarMusic(pq());
                C15L9 c15l9 = this.LLLII;
                if (c15l9 != null) {
                    c15l9.LJ(musicModelConvertToMusicModel, null, true, jq(), false, this.LLLF, false);
                    return;
                }
                return;
            }
            Music music2 = z ? musicCommerceRecommendViewModel.LLILLL : this.LLJZ;
            if (music2 == null) {
                return;
            }
            MusicModel musicModelConvertToMusicModel2 = music2.convertToMusicModel();
            musicModelConvertToMusicModel2.setSimilarMusic(pq());
            C15L9 c15l92 = this.LLLII;
            if (c15l92 != null) {
                c15l92.LJ(musicModelConvertToMusicModel2, null, false, jq(), false, this.LLLF, false);
            }
        }
    }

    public final Music Fp() {
        MusicCommerceRecommendViewModel musicCommerceRecommendViewModel = (MusicCommerceRecommendViewModel) ViewModelProviders.of(getFragment()).get(MusicCommerceRecommendViewModel.class);
        boolean z = musicCommerceRecommendViewModel.LLILLJJLI;
        this.LLLF = z;
        return z ? musicCommerceRecommendViewModel.LLILLL : this.LLJZ;
    }

    public final InterfaceC631090Op9 Gm0() {
        CommerceRecommendAbility commerceRecommendAbility = (CommerceRecommendAbility) C1558520qew.LIZ(C1558360qeg.LJFF(getFragment(), null), CommerceRecommendAbility.class, null);
        if (commerceRecommendAbility != null) {
            return commerceRecommendAbility.Gm0();
        }
        return null;
    }

    public final String Gp() {
        if (TextUtils.isEmpty(fq())) {
            return null;
        }
        ArrayList<String> arrayListAp = Ap(fq());
        if (!arrayListAp.isEmpty()) {
            return (String) ListProtector.get(arrayListAp, 0);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.ShootContainerProviderAbility
    public final View aO0() {
        return lp();
    }

    @Override // X.C15LG
    public final boolean h4() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        return fragmentLJI != null && fragmentLJI.isAdded();
    }

    @Override // X.C15LG
    public final void k8() {
        Ep();
        C589880NBq c589880NBqWp = Wp();
        c589880NBqWp.getClass();
        c589880NBqWp.LIZJ = new Pair<>(-4, "not login");
        Wp().LIZ();
        C0XPD.LIZJ(C724240Sb0.LJI(this), "single_song", "click_music_shoot", null, null);
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void nm1() {
        this.LLLFFI = UUID.randomUUID().toString();
        wq();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ShootAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C15L9 c15l9;
        InterfaceC1662290tMJ interfaceC1662290tMJLIZJ;
        super.onDestroy();
        this.LLLIIIL.LJ();
        if (C298090BmJ.LIZ()) {
            C1661180tKW.LIZ.getClass();
            if (C1661180tKW.LJ) {
                C1661180tKW.LJ = false;
                C1661180tKW.LIZ();
            }
        }
        C15L9 c15l92 = this.LLLII;
        if (c15l92 != null) {
            c15l92.LIZIZ();
        }
        if (this.LLLIIL || (c15l9 = this.LLLII) == null || !C1661270tKf.LIZ()) {
            return;
        }
        C1661100tKO c1661100tKO = c15l9.LJIIIIZZ;
        if ((c1661100tKO == null && (c1661100tKO = c15l9.LJIIIZ) == null) || c1661100tKO.LJFF() == null) {
            return;
        }
        String strLJFF = c1661100tKO.LJFF();
        IMusicExternalService iMusicExternalService = (IMusicExternalService) PluggableExtentionKt.pluggableSpi$default(IMusicExternalService.class, false, false, false, 14, null);
        if (iMusicExternalService == null || (interfaceC1662290tMJLIZJ = iMusicExternalService.LIZJ()) == null) {
            return;
        }
        interfaceC1662290tMJLIZJ.LJI(strLJFF);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        this.LLLIIL = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        TtsReuseServiceImpl.LJ().destroyAudioSDKHandler();
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.ShootContainerProviderAbility
    public final View pL1() {
        return getContentView();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ShootAssem
    public final void sp() {
        C786410Ut5.I7(new C0P4E(this, 1), lp());
    }

    public static void zp(C2344009Gk c2344009Gk) {
        FromGroupPropService fromGroupPropService = (FromGroupPropService) ServiceManager.get().getService(FromGroupPropService.class);
        if (fromGroupPropService != null) {
            c2344009Gk.LJFF("from_group_id_prop_list", fromGroupPropService.LIZJ());
            c2344009Gk.LJFF("from_group_id_prop_resource_list", fromGroupPropService.LIZLLL());
        }
    }

    public final ArrayList<String> Ap(String str) {
        Set setLLIIJI;
        List listLJJLIIIJILLIZJL;
        if (str != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null) {
            setLLIIJI = C13LP.LLIIJI(listLJJLIIIJILLIZJL);
        } else {
            setLLIIJI = null;
        }
        return new ArrayList<>(setLLIIJI);
    }

    public final void Bp(boolean z) {
        if (this.LLLLZLLIL) {
            return;
        }
        Ep();
        if (z) {
            this.LLL = false;
            ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LLJJLIIIJLLLLLLLZ;
            if (progressDialogC1399760mWs != null) {
                C0FNV.LIZ(progressDialogC1399760mWs);
            }
            tq(C0MVY.DISMISS);
            this.LLJJLIIIJLLLLLLLZ = null;
        }
        CreativeDialogWrapper creativeDialogWrapper = this.LLJLIL;
        if (creativeDialogWrapper != null && creativeDialogWrapper.isShowing()) {
            CreativeDialogWrapper creativeDialogWrapper2 = this.LLJLIL;
            if (creativeDialogWrapper2 != null) {
                creativeDialogWrapper2.dismiss();
            }
            this.LLJLIL = null;
        }
        ProgressDialogC1399760mWs progressDialogC1399760mWs2 = this.LLJL;
        if (progressDialogC1399760mWs2 != null && progressDialogC1399760mWs2.isShowing()) {
            ProgressDialogC1399760mWs progressDialogC1399760mWs3 = this.LLJL;
            if ((progressDialogC1399760mWs3 instanceof Dialog) && progressDialogC1399760mWs3 != null) {
                C0FNV.LIZ(progressDialogC1399760mWs3);
            }
            tq(C0MVY.DISMISS);
            this.LLJL = null;
        }
    }

    @Override // X.C15LG
    public final void Sx(MusicModel musicModel) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("music_id", musicModel.getMusicId());
        c2344009Gk.LJIIIIZZ("enter_from", "single_song");
        c2344009Gk.LJIIIIZZ("enter_method", "click_shoot");
        C20684815ws.LJIILLIIL("download_music", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.ShootContainerProviderAbility
    public final void To1(int i) {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        TuxTextView tuxTextView;
        if (C297350Bl7.LIZ() && i != 0) {
            Map<Integer, Integer> map = MusicDetailViewModel.LLJJLIIIJLLLLLLLZ;
            Integer num = MusicDetailViewModel.LLJJLIIIJLLLLLLLZ.get(Integer.valueOf(i));
            if (num != null) {
                int iIntValue = num.intValue();
                TextView textViewOp = op();
                if ((textViewOp instanceof TuxTextView) && (tuxTextView = (TuxTextView) textViewOp) != null) {
                    tuxTextView.setTuxFont(iIntValue);
                }
            }
            int i2 = i + 3;
            mp().setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))));
            mp().setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))));
            C425000GlW c425000GlW = this.LLLZL;
            if (c425000GlW != null) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
                ImageView imageView = c425000GlW.LJIIL;
                ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                if ((layoutParams3 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams3) != null) {
                    float f = iLIZIZ;
                    float fLIZIZ = (1.0f * f) / C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                    layoutParams.width = (int) ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)) * fLIZIZ) + f);
                    layoutParams.height = (int) (f + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)) * fLIZIZ));
                    TuxIconView tuxIconView = c425000GlW.LJ;
                    ViewGroup.LayoutParams layoutParams4 = tuxIconView.getLayoutParams();
                    if ((layoutParams4 instanceof RelativeLayout.LayoutParams) && (layoutParams2 = (RelativeLayout.LayoutParams) layoutParams4) != null) {
                        layoutParams2.setMarginStart((layoutParams.width - layoutParams2.width) / 2);
                    }
                    tuxIconView.requestLayout();
                    C786410Ut5.c6(imageView, layoutParams);
                }
            }
        }
    }

    public final String aq(String str) {
        boolean booleanExtra;
        boolean booleanExtra2;
        Intent intentLIZJ = C629480OmY.LIZJ(getFragment());
        boolean booleanExtra3 = false;
        if (intentLIZJ != null) {
            booleanExtra = intentLIZJ.getBooleanExtra("is_story_page", false);
        } else {
            booleanExtra = false;
        }
        Intent intentLIZJ2 = C629480OmY.LIZJ(getFragment());
        if (intentLIZJ2 != null) {
            booleanExtra2 = intentLIZJ2.getBooleanExtra("is_friend_page", false);
        } else {
            booleanExtra2 = false;
        }
        Intent intentLIZJ3 = C629480OmY.LIZJ(getFragment());
        if (intentLIZJ3 != null) {
            booleanExtra3 = intentLIZJ3.getBooleanExtra("story type", false);
        }
        if (booleanExtra) {
            if (booleanExtra3) {
                return "story_immersive_anchor";
            }
            return "post_immersive_anchor";
        }
        if (!booleanExtra2) {
            return str;
        }
        if (booleanExtra3) {
            return "story_friends_feed_anchor";
        }
        return "post_friends_feed_anchor";
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem for r20v4 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.detail.prefab.ShootAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r21) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem.onViewCreated(android.view.View):void");
    }

    public final void tp(C2344009Gk c2344009Gk) {
        yp(c2344009Gk);
        String str = (String) this.LLLLII.getValue();
        if (str != null) {
            c2344009Gk.LJFF("from_group_id_prop_list", str);
        }
        String str2 = (String) this.LLLL.getValue();
        if (str2 != null) {
            c2344009Gk.LJFF("prop_resource_id", str2);
        }
        String str3 = (String) this.LLLLIIIILLL.getValue();
        if (str3 != null) {
            c2344009Gk.LJFF("from_group_id_prop_resource_list", str3);
        }
    }

    public final void tq(C0MVY c0mvy) {
        C194353111z.LIZ.LJ(1020, c0mvy, C0LD3.DUAL_BALL, C0LEP.CLOSE_VISIBLE_5S, this.LLJLL);
        if (c0mvy == C0MVY.CLICK_CLOSE) {
            tq(C0MVY.DISMISS);
        }
    }

    public final void up(C2344009Gk c2344009Gk) {
        if (TextUtils.isEmpty((String) this.LLLLJI.getValue())) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject((String) this.LLLLJI.getValue());
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                c2344009Gk.LJ(jSONObject.opt(next), next);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void xq(Function0<Unit> function0) {
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        C19EG activity = getActivity();
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(false);
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
        creativeLoadingDialogBuilder.loadingMessage(getActivity().getString(R.string.txr));
        creativeLoadingDialogBuilder.clickCancelListener(new AwS610S0100000_31(function0, (Function0<Unit>) 225));
        CreativeDialogWrapper creativeDialogWrapper = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(activity, 1020, creativeLoadingDialogBuilder);
        creativeDialogWrapper.show();
        this.LLJLIL = creativeDialogWrapper;
    }

    public final void yp(C2344009Gk c2344009Gk) {
        if (!TextUtils.isEmpty(fq())) {
            ArrayList<String> arrayListAp = Ap(fq());
            if (!arrayListAp.isEmpty()) {
                c2344009Gk.LJFF("prop_id", (String) ListProtector.get(arrayListAp, 0));
            }
        }
    }

    public static String iq(MusicShootAssem musicShootAssem, String str) {
        Bundle arguments;
        String string;
        Fragment fragment = musicShootAssem.getFragment();
        if (fragment == null || (arguments = fragment.getArguments()) == null || (string = arguments.getString(str)) == null) {
            return null;
        }
        return string;
    }

    @Override // X.C15LG
    public final void Nw(MusicModel musicModel, boolean z) {
        this.LLJLILLLLZIIL = false;
        if (this.LLLZIIL) {
            return;
        }
        C19576911iZ.LIZJ = this.LLLFFI;
        if (z) {
            this.LLL = true;
            new SafeHandler(this).postDelayed(new ARunnableS100S0200000_31(this, musicModel, 30), 300L);
        } else {
            AwS432S0200000_31 awS432S0200000_31 = new AwS432S0200000_31(this, musicModel, 59);
            this.LLLI = true;
            ExecutorC1592406Li.LLILLJJLI.LIZ(300L, new ARunnableS88S0200000_19(this, awS432S0200000_31, 19));
        }
    }

    @Override // X.C15LG
    public final void fB(Effect effect, MusicModel musicModel) {
        C20684815ws.LJIJI("music_detail_trace", new Pair("skip_to_video_progress", "stage"));
        Bp(true);
        C1398110mUD.LIZ = "single_song";
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("MusicDetailFragment", new C16H4(this, effect, musicModel, 0));
    }

    @Override // X.C15LG
    public final void hb(boolean z, boolean z2) {
        if (z2) {
            C589880NBq c589880NBqWp = Wp();
            c589880NBqWp.getClass();
            c589880NBqWp.LIZJ = new Pair<>(-1, "down music failed");
            Wp().LIZ();
            Ep();
        }
        if (z) {
            Bp(true);
        } else {
            C810560Vqw.LIZJ(new ARunnableS131S0100000_31(this, 83));
        }
    }

    public final void qq(String str, String str2) {
        ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL().LIZJ(new C19406010w6(C629480OmY.LJ(getFragment()), (Aweme) null, "music_page", str, str2, 34));
    }

    @Override // X.C15LG
    public final void sa(int i, boolean z) {
        if (z) {
            return;
        }
        this.LLJLL = i;
        CreativeDialogWrapper creativeDialogWrapper = this.LLJLIL;
        if (creativeDialogWrapper != null) {
            CreativeLoadingDialog.DefaultImpls.updateProgress$default(creativeDialogWrapper, i, false, 2, null);
        }
        ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LLJL;
        if (progressDialogC1399760mWs != null) {
            progressDialogC1399760mWs.setProgress(i);
            if (i >= 98 && this.LLJL != null) {
                progressDialogC1399760mWs.setCancelable(true);
            }
        }
    }

    @Override // X.C15LG
    public final void eL(int i, final MusicModel musicModel, final String str) throws Throwable {
        String string;
        String str2;
        LogPbBean logPb;
        String imprId;
        Wp().LIZ();
        this.LLLZI = new C20506515Lz(i, musicModel, str);
        boolean z = true;
        if (musicModel.getLogPb() == null || ((logPb = musicModel.getLogPb()) != null && (imprId = logPb.getImprId()) != null && imprId.length() == 0)) {
            Bundle arguments = getFragment().getArguments();
            if (arguments != null) {
                string = arguments.getString("log_pb");
            } else {
                string = null;
            }
            LogPbBean logPbBean = new LogPbBean();
            logPbBean.setImprId(logPbBean.getImprIdFromJson(string));
            musicModel.setLogPb(logPbBean);
        }
        if (this.LLLLZLLIL) {
            this.LLJLILLLLZIIL = true;
            AssemViewModel.asyncSubscribe$default(Vp(), new C2217381BqS() { // from class: X.0mVv
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C629660Omq) obj).LL;
                }
            }, null, null, null, new AwS114S1200000_31(this, str, musicModel, 8), 14, null);
            if (C298080BmI.LIZ()) {
                this.LLJLILLLLZIIL = false;
                return;
            }
            return;
        }
        if (this.LLJLILLLLZIIL) {
            return;
        }
        C20684815ws.LJIJI("music_detail_trace", new Pair("to_video_progress", "stage"));
        C1398110mUD.LIZ = "single_song";
        boolean zIsRecording = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig().isRecording();
        this.LLLIIL = true;
        if (!TextUtils.equals(getFrom(), "choose_music_with_banner") || !((Boolean) C0ANG.LIZ.getValue()).booleanValue()) {
            z = false;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLFZ;
        if (!zIsRecording && !z) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("MusicDetailFragment", new SimpleServiceLoadCallback() { // from class: X.15Lo
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0140  */
                /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Integer] */
                /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Long] */
                /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Long] */
                /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.Long] */
                /* JADX WARN: Type inference failed for: r36v0, types: [java.util.Map] */
                /* JADX WARN: Type inference failed for: r39v2 */
                /* JADX WARN: Type inference failed for: r39v3, types: [java.lang.Integer] */
                /* JADX WARN: Type inference failed for: r39v4 */
                /* JADX WARN: Type inference failed for: r39v7 */
                /* JADX WARN: Type inference failed for: r42v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
                /* JADX WARN: Type inference failed for: r5v144 */
                /* JADX WARN: Type inference failed for: r5v55 */
                /* JADX WARN: Type inference failed for: r5v56, types: [com.ss.android.ugc.aweme.music.model.MusicAwemeList] */
                /* JADX WARN: Type inference failed for: r6v15, types: [java.util.Map] */
                /* JADX WARN: Type inference failed for: r6v37 */
                /* JADX WARN: Type inference failed for: r6v40 */
                /* JADX WARN: Type inference failed for: r6v41 */
                /* JADX WARN: Type inference failed for: r6v42 */
                /* JADX WARN: Type inference failed for: r6v43 */
                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onLoad(com.ss.android.ugc.aweme.services.AsyncAVService r44, long r45) {
                    /*
                        Method dump skipped, instruction units count: 1376
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20505415Lo.onLoad(com.ss.android.ugc.aweme.services.AsyncAVService, long):void");
                }
            });
            return;
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().addMusic(musicModel, 0);
        Intent intent = new Intent();
        if (TextUtils.equals(getFrom(), "choose_music_with_banner") && ((Number) this.LLLJIL.getValue()).intValue() == 2) {
            str2 = "shoot_page_banner";
        } else if (TextUtils.equals(getFrom(), "choose_music_with_banner") && ((Number) this.LLLJIL.getValue()).intValue() == 0) {
            str2 = "edit_page_banner";
        } else {
            str2 = "";
        }
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        if (C629480OmY.LIZIZ(getFragment())) {
            SAFTikTokFragment sAFTikTokFragmentLIZIZ = C1399730mWp.LIZIZ(getFragment());
            if (sAFTikTokFragmentLIZIZ != null) {
                C1399730mWp.LIZ(sAFTikTokFragmentLIZIZ, intent);
            }
            C629480OmY.LJI(getFragment());
            return;
        }
        C2204961BRm.LLJJIJIL(-1, intent, getActivity(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOe9cJbNkiQm9PeTClhvb+y2V10B+MI37ppsnmgeyw==", null));
        getActivity().finish();
        if (!TextUtils.equals(getFrom(), "choose_music_with_banner")) {
            return;
        }
        C786410Ut5.ce(getActivity(), 0, R.anim.ao);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:358:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:424:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vq(com.ss.android.ugc.aweme.music.model.Music r34, boolean r35, com.ss.android.ugc.aweme.base.model.UrlModel r36, int r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem.vq(com.ss.android.ugc.aweme.music.model.Music, boolean, com.ss.android.ugc.aweme.base.model.UrlModel, int):void");
    }
}
