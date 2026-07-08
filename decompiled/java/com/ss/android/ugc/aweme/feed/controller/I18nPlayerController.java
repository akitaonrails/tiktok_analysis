package com.ss.android.ugc.aweme.feed.controller;

import X.C01GW;
import X.C08MI;
import X.C0O0X;
import X.C0RRP;
import X.C0SZ8;
import X.C1017070cZd;
import X.C1019620cdk;
import X.C1020020ceO;
import X.C1020030ceP;
import X.C1022820ciu;
import X.C1029590ctp;
import X.C1045220dJ2;
import X.C1233040iBy;
import X.C1387230mCf;
import X.C1387240mCg;
import X.C1387690mDP;
import X.C1479890oc7;
import X.C1481290oeN;
import X.C1483430ohp;
import X.C1594680rbG;
import X.C1906580ziK;
import X.C20642515q3;
import X.C2093608Ic;
import X.C2184171Adz;
import X.C2344009Gk;
import X.C581630MrZ;
import X.C583420MuS;
import X.C735370Ssx;
import X.C810560Vqw;
import X.InterfaceC582800MtS;
import X.InterfaceC583650Mup;
import Y.ARunnableS18S0400000_9;
import Y.ARunnableS28S0110000_9;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.api.I18nPlayControllerContext;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;

/* JADX INFO: loaded from: classes10.dex */
public class I18nPlayerController extends PlayerController implements I18nPlayControllerContext {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public boolean LL;

    @Override // com.ss.android.ugc.aweme.feed.api.I18nPlayControllerContext
    public final Integer LJLLJ() {
        if (LJJLIIIJJIZ() != null) {
            return Integer.valueOf(LJJLIIIJJIZ().LJLLJ());
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.I18nPlayControllerContext
    public final String GI1() {
        return this.mCurrentAuthorId;
    }

    public I18nPlayerController(String str, int i, IBaseListFragmentPanel iBaseListFragmentPanel) {
        super(str, i, iBaseListFragmentPanel);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(3:111|4|(1:6))|7|(4:9|(1:11)(2:16|(1:18))|12|(1:14))(8:(1:20)|29|(1:36)(1:35)|37|(1:43)|(1:45)|46|(4:(4:49|(2:51|(1:53))|54|(1:56))|(2:58|(11:74|(1:77)|78|(1:82)|83|(1:89)|90|(1:92)|93|94|(3:100|(1:102)|103))(1:(6:65|(1:67)|68|(1:70)|(1:72)|73)))|104|105)(1:118))|15|109|21|(4:24|(3:114|26|117)(1:116)|115|22)|113|29|(2:31|36)(0)|37|(2:39|43)|(0)|46|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114 A[Catch: JSONException -> 0x022e, TryCatch #1 {JSONException -> 0x022e, blocks: (B:4:0x0006, B:7:0x0011, B:9:0x001c, B:11:0x0030, B:12:0x003d, B:14:0x0050, B:15:0x0059, B:29:0x00d4, B:31:0x00db, B:33:0x00e1, B:39:0x00ee, B:41:0x00f6, B:43:0x0108, B:45:0x0114, B:46:0x0117, B:49:0x0121, B:51:0x0127, B:53:0x013c, B:54:0x0147, B:56:0x014d, B:58:0x0161, B:60:0x0167, B:62:0x016d, B:65:0x0173, B:68:0x017b, B:73:0x018a, B:74:0x019c, B:77:0x01aa, B:78:0x01b0, B:80:0x01b6, B:83:0x01bf, B:86:0x01c7, B:90:0x01d6, B:92:0x01e8, B:93:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0202, B:102:0x021f, B:103:0x0222, B:87:0x01cb, B:89:0x01d3, B:104:0x0228, B:28:0x00d1, B:16:0x007d, B:18:0x0085, B:21:0x0096, B:22:0x00ac, B:24:0x00b2, B:26:0x00be), top: B:111:0x0006, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
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
    @Override // com.ss.android.ugc.aweme.feed.controller.PlayerController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJJ(java.lang.String r19, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel r20, com.ss.android.ugc.aweme.feed.model.Aweme r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.controller.I18nPlayerController.LLJJJJ(java.lang.String, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.PlayerController
    public final void LLJJJJJIL(C1481290oeN c1481290oeN, C0SZ8 c0sz8, boolean z) {
        Video video;
        Audio audio;
        String string;
        String string2;
        if (!isViewValid()) {
            return;
        }
        String str = c1481290oeN.LIZ;
        if (PlayerController.LLLLLLZZ(c0sz8) && C2093608Ic.LIZJ(c0sz8.LJIIIIZZ().getAid(), str)) {
            String str2 = c1481290oeN.LIZ;
            C0RRP c0rrp = C0RRP.O_P_FAILED;
            String string3 = c1481290oeN.toString();
            C583420MuS c583420MuS = C583420MuS.LIZ;
            C583420MuS.LIZLLL(str2, c0rrp.toString(), string3);
            InterfaceC583650Mup interfaceC583650MupX3 = c0sz8.x3();
            if (interfaceC583650MupX3.getContentType() == 2) {
                interfaceC583650MupX3.onPlayFailed(c1481290oeN);
            } else if (C1594680rbG.LJIIJJI(c0sz8)) {
                InterfaceC582800MtS interfaceC582800MtSLJI = C1029590ctp.LJI();
                Aweme awemeLJIIIIZZ = c0sz8.LJIIIIZZ();
                interfaceC582800MtSLJI.getClass();
                C1045220dJ2 c1045220dJ2 = C1045220dJ2.LIZ;
                if (awemeLJIIIIZZ != null && C1019620cdk.LIZIZ(3, awemeLJIIIIZZ)) {
                    C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                    c1020020ceOLIZ.LJ(awemeLJIIIIZZ);
                    c1020020ceOLIZ.LIZ = "draw_ad";
                    c1020020ceOLIZ.LIZIZ = "show_fail";
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("error_message", "vast_mediafile_bad_response");
                    c2344009Gk.LIZJ(c1481290oeN.LJ, "error_code");
                    Object obj = c1481290oeN.LJI;
                    if (obj == null || (string = obj.toString()) == null) {
                        string = "";
                    }
                    c2344009Gk.LJIIIIZZ("error_detail", string);
                    c1020020ceOLIZ.LIZ(c2344009Gk.LIZ);
                    c1020020ceOLIZ.LJIIJ(null);
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "show_fail", awemeLJIIIIZZ.getAwemeRawAd());
                    c1022820ciuLIZLLL.LIZIZ("vast_mediafile_bad_response", "error_message");
                    c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(c1481290oeN.LJ), "error_code");
                    Object obj2 = c1481290oeN.LJI;
                    if (obj2 == null || (string2 = obj2.toString()) == null) {
                        string2 = "";
                    }
                    c1022820ciuLIZLLL.LIZIZ(string2, "error_detail");
                    c1022820ciuLIZLLL.LJIIIIZZ();
                }
                C1479890oc7 c1479890oc7LIZ = C1483430ohp.LIZ(c0sz8.LJIIIIZZ(), "doOnPlayFailed");
                if (C1017070cZd.LLIIIZ(c0sz8.LJIIIIZZ()) && LLJJLIIIJLLLLLLLZ().LIZ() != null) {
                    video = LLJJLIIIJLLLLLLLZ().LIZ();
                    audio = null;
                } else {
                    video = c0sz8.LJIIIIZZ().getVideo();
                    audio = c0sz8.LJIIIIZZ().getAudio();
                }
                if (c1481290oeN.LJIIJ == 1 && C1017070cZd.LJJJLL(c0sz8.LJIIIIZZ())) {
                    if (C1017070cZd.LLIIIZ(c0sz8.LJIIIIZZ())) {
                        video.setRationAndSourceId(LLJJLIIIJLLLLLLLZ().LIZIZ());
                    } else {
                        video.setRationAndSourceId(PlayerController.LLLIILIL(c0sz8));
                    }
                    r(PlayerController.LLLIILIL(c0sz8), false);
                    getPlayerManager().setSurface(interfaceC583650MupX3.getSurface());
                    if (c0sz8.LJIIIIZZ() != null && c0sz8.LJIIIIZZ().getVideo() != null) {
                        Video video2 = c0sz8.LJIIIIZZ().getVideo();
                        video2.setBitRate(null);
                        VideoUrlModel playAddr3DFallback = video2.getPlayAddr3DFallback();
                        if (playAddr3DFallback != null) {
                            playAddr3DFallback.setBitRate(null);
                        }
                        getPlayerManager().LJJJJLL(playAddr3DFallback, video.isNeedSetCookie(), PlayerController.LLLIL(c0sz8), c1479890oc7LIZ);
                    }
                    if (z) {
                        LLLZLZ(c1481290oeN, c0sz8);
                        return;
                    }
                }
                if (c1481290oeN.LIZLLL && video.hasVideoModel() && c1481290oeN.LJ != -499096) {
                    if (C1017070cZd.LLIIIZ(c0sz8.LJIIIIZZ())) {
                        video.setRationAndSourceId(LLJJLIIIJLLLLLLLZ().LIZIZ());
                    } else {
                        video.setRationAndSourceId(PlayerController.LLLIILIL(c0sz8));
                    }
                    r(PlayerController.LLLIILIL(c0sz8), false);
                    getPlayerManager().setSurface(interfaceC583650MupX3.getSurface());
                    getPlayerManager().LJJLIIIIJ(video, audio, PlayerController.LLLLLLJ(c0sz8.LJIIIIZZ()), true, 0, true, false, PlayerController.LLLIL(c0sz8), c1479890oc7LIZ);
                    if (z) {
                        LLLZLZ(c1481290oeN, c0sz8);
                        return;
                    }
                    return;
                }
                if (1 == c1481290oeN.LIZJ && c1481290oeN.LJ != -499096) {
                    if (C1017070cZd.LLIIIZ(c0sz8.LJIIIIZZ())) {
                        video.setRationAndSourceId(LLJJLIIIJLLLLLLLZ().LIZIZ());
                    } else {
                        video.setRationAndSourceId(PlayerController.LLLIILIL(c0sz8));
                    }
                    C810560Vqw.LJ(new ARunnableS28S0110000_9(video, false, 2));
                    r(PlayerController.LLLIILIL(c0sz8), false);
                    getPlayerManager().setSurface(interfaceC583650MupX3.getSurface());
                    if (c0sz8.LJIIIIZZ() != null && c0sz8.LJIIIIZZ().getVideo() != null) {
                        c0sz8.LJIIIIZZ().getVideo().setBitRate(null);
                        VideoUrlModel playAddrH264 = c0sz8.LJIIIIZZ().getVideo().getPlayAddrH264();
                        if (playAddrH264 != null) {
                            playAddrH264.setBitRate(null);
                        }
                        getPlayerManager().LJJJJLL(playAddrH264, video.isNeedSetCookie(), PlayerController.LLLIL(c0sz8), c1479890oc7LIZ);
                    }
                    if (z) {
                        LLLZLZ(c1481290oeN, c0sz8);
                        return;
                    }
                }
                if (c1481290oeN.LIZJ == 2 && c1481290oeN.LJ != -499096) {
                    if (C1017070cZd.LLIIIZ(c0sz8.LJIIIIZZ())) {
                        video.setRationAndSourceId(LLJJLIIIJLLLLLLLZ().LIZIZ());
                    } else {
                        video.setRationAndSourceId(PlayerController.LLLIILIL(c0sz8));
                    }
                    r(PlayerController.LLLIILIL(c0sz8), false);
                    getPlayerManager().setSurface(interfaceC583650MupX3.getSurface());
                    if (c0sz8.LJIIIIZZ() != null && c0sz8.LJIIIIZZ().getVideo() != null) {
                        c0sz8.LJIIIIZZ().getVideo().setBitRate(null);
                        VideoUrlModel playAddrBytevc1 = c0sz8.LJIIIIZZ().getVideo().getPlayAddrBytevc1();
                        if (playAddrBytevc1 != null || (playAddrBytevc1 = c0sz8.LJIIIIZZ().getVideo().getPlayAddrH264()) != null) {
                            playAddrBytevc1.setBitRate(null);
                        }
                        getPlayerManager().LJJJJLL(playAddrBytevc1, video.isNeedSetCookie(), PlayerController.LLLIL(c0sz8), c1479890oc7LIZ);
                    }
                    if (z) {
                        LLLZLZ(c1481290oeN, c0sz8);
                        return;
                    }
                    return;
                }
                Aweme awemeLJIIIIZZ2 = c0sz8.LJIIIIZZ();
                if (awemeLJIIIIZZ2 == null || !AwemeBizExtKt.isLocalUnpublishedAweme(awemeLJIIIIZZ2)) {
                    String strLJI = C20642515q3.LJI(2131840495);
                    C1233040iBy c1233040iBy = new C1233040iBy(this.activity);
                    c1233040iBy.LIZJ(strLJI);
                    c1233040iBy.LIZLLL();
                }
                interfaceC583650MupX3.onPlayFailed(c1481290oeN);
                IBaseListFragmentPanel iBaseListFragmentPanelLJJLIIIJJIZ = LJJLIIIJJIZ();
                if (iBaseListFragmentPanelLJJLIIIJJIZ != null) {
                    iBaseListFragmentPanelLJJLIIIJJIZ.De();
                }
                if (z) {
                    LLLZLZ(c1481290oeN, c0sz8);
                }
                if (video != null && video.getPlayAddr() != null) {
                    if (this.mVideoPrepareTime != 0) {
                        this.mVideoPrepareTime = 0L;
                    }
                    C810560Vqw.LJ(new ARunnableS18S0400000_9(this, c1481290oeN, video, c0sz8, 1));
                    if (iBaseListFragmentPanelLJJLIIIJJIZ != null) {
                        iBaseListFragmentPanelLJJLIIIJJIZ.LIZLLL(0L);
                    }
                    this.mVideoPrepareTime = 0L;
                } else {
                    return;
                }
            }
        }
        l(new C581630MrZ(1, 0));
    }

    public final void Y(String str, Aweme aweme, IBaseListFragmentPanel iBaseListFragmentPanel) throws Exception {
        String str2;
        if (iBaseListFragmentPanel != null) {
            try {
                if (iBaseListFragmentPanel.Vl().booleanValue()) {
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C08MI.LIZ("video_play_finish", e);
                throw e;
            }
        }
        C0SZ8 c0sz8LLJLILLLLZIIL = LLJLILLLLZIIL();
        C1387230mCf c1387230mCf = new C1387230mCf();
        c1387230mCf.LL = "output";
        c1387230mCf.LLILLL = str;
        c1387230mCf.LLILZ = Boolean.TRUE;
        C01GW<C1387690mDP> c01gw = C1387690mDP.LIZIZ;
        C0O0X.LIZ().LIZ(C735370Ssx.LIZJ(aweme));
        c1387230mCf.LLILLJJLI = 0;
        if (C1906580ziK.LJI()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c1387230mCf.LLJIJIL = str2;
        this.playMobManager.LIZJ(new C1387240mCg(aweme, this.mVVIndex, iBaseListFragmentPanel, c0sz8LLJLILLLLZIIL, this, this, this, c1387230mCf, LJJLIIIJJIZ()));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    @Override // com.ss.android.ugc.aweme.feed.controller.PlayerController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLJJJJLIIL(X.C1480430ocz r31, final X.C0SZ8 r32, final java.lang.String r33, final com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel r34, final com.ss.android.ugc.aweme.feed.model.Aweme r35, final org.json.JSONObject r36) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.controller.I18nPlayerController.LLJJJJLIIL(X.0ocz, X.0SZ8, java.lang.String, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel, com.ss.android.ugc.aweme.feed.model.Aweme, org.json.JSONObject):void");
    }
}
