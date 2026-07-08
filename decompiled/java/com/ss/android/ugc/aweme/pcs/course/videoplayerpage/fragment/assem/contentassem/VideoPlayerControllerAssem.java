package com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C054G;
import X.C09R3;
import X.C0JMS;
import X.C0JO7;
import X.C0QSJ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1DFT;
import X.C2217381BqS;
import X.C490660JMa;
import X.C490670JMb;
import X.C490810JMp;
import X.C687700QyG;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC490700JMe;
import X.InterfaceC490720JMg;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.view.TextureView;
import com.bytedance.android.livesdk.chatroom.api.ContentAuditStatus;
import com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerControllerAbility;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerControllerAssem;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.viewmodel.PcsCourseVideoPlayerVM;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes8.dex */
public final class VideoPlayerControllerAssem extends AbstractC738140SxQ implements VideoPlayerControllerAbility, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final VideoPlayerControllerAssem LL = this;
    public final AssemVMLazy LLILLJJLI;
    public final C490810JMp LLILLL;
    public final C490670JMb LLILZ;
    public final C490660JMa LLILZIL;
    public volatile VideoPlayerPagerAbility LLILZLL;
    public InterfaceC665370Q7z LLIZ;
    public C0QSJ LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoPlayerControllerAssem.class, "loadMoreAbility", "getLoadMoreAbility()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/assem/ability/VideoPlayerLoadMoreAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoPlayerControllerAssem.class, "pagerAbility", "getPagerAbility()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/assem/ability/VideoPlayerPagerAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(VideoPlayerControllerAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/viewmodel/PcsCourseVideoPlayerVM;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0JMb] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0JMa] */
    public VideoPlayerControllerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCourseVideoPlayerVM.class);
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 725), AFwS237S0000000_7.get$arr$(171), null, true);
        this.LLILLL = new C490810JMp();
        this.LLILZ = new InterfaceC490700JMe() { // from class: X.0JMb
            @Override // X.InterfaceC490700JMe
            public final void LIZ(C490760JMk c490760JMk) {
                String strLIZ;
                if (Math.abs(c490760JMk.getBindingAdapterPosition() - this.LIZ.m302do().getState().LLILZIL) <= 2 && c490760JMk.I5()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PcsVideoPlayerControllerAssem onHolderDetached ");
                    Aweme aweme = c490760JMk.getAweme();
                    if (aweme != null) {
                        strLIZ = C490750JMj.LIZ(aweme);
                    } else {
                        strLIZ = null;
                    }
                    sbLIZ.append(strLIZ);
                    sbLIZ.append(' ');
                    sbLIZ.append(c490760JMk);
                    C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    Aweme aweme2 = c490760JMk.getAweme();
                    if (aweme2 != null) {
                        this.LIZ.LLILLL.LLILZIL.LIZJ(C490750JMj.LIZ(aweme2));
                    }
                }
            }

            @Override // X.InterfaceC490700JMe
            public final void LIZIZ(C490760JMk c490760JMk) {
                String strLIZ;
                if (Math.abs(c490760JMk.getBindingAdapterPosition() - this.LIZ.m302do().getState().LLILZIL) <= 2 && c490760JMk.I5()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PcsVideoPlayerControllerAssem onHolderAttached ");
                    Aweme aweme = c490760JMk.getAweme();
                    if (aweme != null) {
                        strLIZ = C490750JMj.LIZ(aweme);
                    } else {
                        strLIZ = null;
                    }
                    sbLIZ.append(strLIZ);
                    sbLIZ.append(' ');
                    sbLIZ.append(c490760JMk);
                    C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    Aweme aweme2 = c490760JMk.getAweme();
                    if (aweme2 != null) {
                        this.LIZ.LLILLL.LLILZIL.LIZ(C490750JMj.LIZ(aweme2));
                    }
                }
            }

            @Override // X.InterfaceC490700JMe
            public final void LIZJ(C490760JMk c490760JMk) {
                String strLIZ;
                String nickname;
                ContentAuditStatus contentAuditStatus;
                String str;
                User author;
                int bindingAdapterPosition = c490760JMk.getBindingAdapterPosition();
                C0JMR c0jmr = (C0JMR) ListProtector.get(this.LIZ.m302do().getState().LLILLL, bindingAdapterPosition);
                Aweme awemeLIZIZ = c0jmr.LIZIZ();
                if (awemeLIZIZ != null) {
                    VideoPlayerControllerAssem videoPlayerControllerAssem = this.LIZ;
                    Video video = awemeLIZIZ.getVideo();
                    if (video == null) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PcsVideoPlayerControllerAssem tryPrepare ");
                    sbLIZ.append(bindingAdapterPosition);
                    sbLIZ.append(' ');
                    Aweme aweme = c490760JMk.getAweme();
                    if (aweme != null) {
                        strLIZ = C490750JMj.LIZ(aweme);
                    } else {
                        strLIZ = null;
                    }
                    sbLIZ.append(strLIZ);
                    C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    C490810JMp c490810JMp = videoPlayerControllerAssem.LLILLL;
                    C0JO7 c0jo7 = c490760JMk.LL;
                    int i = videoPlayerControllerAssem.m302do().getState().LLILLJJLI;
                    boolean z = true;
                    if (c490760JMk.LLILZ && c490760JMk.LLILLL <= 1) {
                        z = false;
                    }
                    Aweme awemeLIZIZ2 = c0jmr.LIZIZ();
                    if (awemeLIZIZ2 != null && (author = awemeLIZIZ2.getAuthor()) != null) {
                        nickname = author.getNickname();
                    } else {
                        nickname = null;
                    }
                    String str2 = "";
                    if (nickname == null) {
                        nickname = "";
                    }
                    SMBCourseVideo sMBCourseVideo = c0jmr.LIZIZ;
                    if (sMBCourseVideo != null && (contentAuditStatus = sMBCourseVideo.title) != null && (str = contentAuditStatus.content) != null) {
                        str2 = str;
                    }
                    C0JIX c0jix = new C0JIX(null, new C489640JIc(false, new C489660JIe(nickname, str2), null, 11), 3);
                    c490810JMp.getClass();
                    c0jo7.LIZ(video, i, c0jix);
                    if (z) {
                        C0N0Y c0n0yLIZLLL = c490810JMp.LIZLLL(c0jo7.getCurrentSourceID());
                        C1479720obq c1479720obq = new C1479720obq();
                        c1479720obq.LIZ.LJJJLL = false;
                        c1479720obq.LIZ.LIZLLL = C1481230oeH.LJI(video);
                        boolean zIsNeedSetCookie = video.isNeedSetCookie();
                        C1479530obX c1479530obX = c1479720obq.LIZ;
                        c1479530obX.LJIL = zIsNeedSetCookie;
                        c1479530obX.LJIIJ = false;
                        C1479530obX c1479530obXLIZ = c1479720obq.LIZ();
                        if (c0n0yLIZLLL != null) {
                            C490750JMj.LJ(c0n0yLIZLLL, c490810JMp.LLILZ, new C490780JMm(c1479530obXLIZ, null));
                        }
                        TextureView textureView = c0jo7.getTextureView();
                        if (textureView != null) {
                            textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC490800JMo(c490810JMp, c0jo7, video));
                        }
                    }
                }
            }
        };
        this.LLILZIL = new C0JMS() { // from class: X.0JMa
            @Override // X.C0JMS
            public final void LJIIJ() {
            }

            @Override // X.C0JMS
            public final void LJJLIIIJJIZ() {
            }

            @Override // X.C0JMS
            public final void LJJLIIIJL(C490760JMk c490760JMk, int i) {
                String strLIZ;
                Aweme aweme = c490760JMk.getAweme();
                if (aweme != null) {
                    String strLIZ2 = C490750JMj.LIZ(aweme);
                    VideoPlayerControllerAssem videoPlayerControllerAssem = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PcsVideoPlayerControllerAssem render ");
                    sbLIZ.append(i);
                    sbLIZ.append(' ');
                    Aweme aweme2 = c490760JMk.getAweme();
                    if (aweme2 != null) {
                        strLIZ = C490750JMj.LIZ(aweme2);
                    } else {
                        strLIZ = null;
                    }
                    sbLIZ.append(strLIZ);
                    C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    C490810JMp c490810JMp = videoPlayerControllerAssem.LLILLL;
                    C0N0Y c0n0yLIZLLL = c490810JMp.LIZLLL(strLIZ2);
                    if (c0n0yLIZLLL != null) {
                        C490750JMj.LJ(c0n0yLIZLLL, c490810JMp.LLILZ, new C424501kx(null));
                    }
                }
            }

            @Override // X.C0JMS
            public final void LJJLIIIJLJLI(int i, int i2, C490760JMk c490760JMk) {
                VideoPlayerPagerAbility videoPlayerPagerAbilityBo;
                C490760JMk c490760JMkZZ0;
                Aweme aweme = c490760JMk.getAweme();
                if (aweme != null) {
                    String strLIZ = C490750JMj.LIZ(aweme);
                    this.LIZ.LLILLL.LLILZIL.LIZ(strLIZ);
                    if (i != -1 && (videoPlayerPagerAbilityBo = this.LIZ.bo()) != null && (c490760JMkZZ0 = videoPlayerPagerAbilityBo.zZ0()) != null) {
                        VideoPlayerControllerAssem videoPlayerControllerAssem = this.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PcsVideoPlayerControllerAssem reset playback ");
                        sbLIZ.append(i);
                        sbLIZ.append(' ');
                        sbLIZ.append(strLIZ);
                        C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        C490810JMp c490810JMp = videoPlayerControllerAssem.LLILLL;
                        C0JO7 c0jo7 = c490760JMkZZ0.LL;
                        c490810JMp.getClass();
                        C0N0Y c0n0yLIZLLL = c490810JMp.LIZLLL(c0jo7.getCurrentSourceID());
                        if (c0n0yLIZLLL != null) {
                            C490750JMj.LJ(c0n0yLIZLLL, c490810JMp.LLILZ, new C459101qX(null));
                        }
                        c0jo7.setPlayer(null);
                        c490810JMp.LL = null;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("PcsVideoPlayerControllerAssem start ");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(' ');
                    sbLIZ2.append(strLIZ);
                    C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    this.LIZ.LLILLL.LJFF(c490760JMk.LL);
                }
            }
        };
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoPlayerFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoPlayerFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerControllerAbility
    public final void AM0() {
        C490810JMp c490810JMp;
        C0JO7 c0jo7;
        String currentSourceID;
        if (this.LLILLL.LJ() || (c0jo7 = (c490810JMp = this.LLILLL).LL) == null || (currentSourceID = c0jo7.getCurrentSourceID()) == null) {
            return;
        }
        c490810JMp.LJJLIIIIJ(currentSourceID);
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerControllerAbility
    public final void Kc1() {
        C490810JMp c490810JMp;
        C0JO7 c0jo7;
        String currentSourceID;
        if (!this.LLILLL.LJ() || (c0jo7 = (c490810JMp = this.LLILLL).LL) == null || (currentSourceID = c0jo7.getCurrentSourceID()) == null) {
            return;
        }
        c490810JMp.pause(currentSourceID);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility bo() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility r0 = r4.LLILZLL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility r0 = r4.LLILZLL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLIZLLLIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLIZ     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLIZ = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope> r1 = com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLIZLLLIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility> r0 = com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility r0 = (com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLILZLL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerControllerAssem.bo():com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility");
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final PcsCourseVideoPlayerVM m302do() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (PcsCourseVideoPlayerVM) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        VideoPlayerPagerAbility videoPlayerPagerAbilityBo = bo();
        if (videoPlayerPagerAbilityBo != null) {
            videoPlayerPagerAbilityBo.P30(this.LLILZ);
        }
        VideoPlayerPagerAbility videoPlayerPagerAbilityBo2 = bo();
        if (videoPlayerPagerAbilityBo2 != null) {
            videoPlayerPagerAbilityBo2.vP0(this.LLILZIL);
        }
        C490810JMp c490810JMp = this.LLILLL;
        c490810JMp.LLILZIL.release();
        ((C1DFT) c490810JMp.LLILLL.getValue()).close();
        ((ExecutorService) c490810JMp.LLILLJJLI.getValue()).shutdown();
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        C490810JMp c490810JMp = this.LLILLL;
        c490810JMp.getClass();
        final C054G c054g = c490810JMp.LLILZ;
        c490810JMp.LLILZIL = new InterfaceC490720JMg(c054g) { // from class: X.01YV
            public final InterfaceC497601wk LIZ;
            public final LinkedList<C0N0Y> LIZIZ = new LinkedList<>();
            public final Map<String, C0N0Y> LIZJ = new HashMap();

            @Override // X.InterfaceC490720JMg
            public final void release() {
                Iterator<C0N0Y> it2 = this.LIZIZ.iterator();
                while (it2.hasNext()) {
                    C23250099c.LIZLLL(this.LIZ, null, null, new C01YT(it2.next(), null), 3);
                }
                Iterator it3 = ((HashMap) this.LIZJ).entrySet().iterator();
                while (it3.hasNext()) {
                    C23250099c.LIZLLL(this.LIZ, null, null, new C01YT((C0N0Y) ((Map.Entry) it3.next()).getValue(), null), 3);
                }
                ((HashMap) this.LIZJ).clear();
                this.LIZIZ.clear();
            }

            {
                this.LIZ = c054g;
                int i = 0;
                do {
                    LinkedList<C0N0Y> linkedList = this.LIZIZ;
                    C1483410ohn c1483410ohn = new C1483410ohn();
                    C23250099c.LIZLLL(this.LIZ, null, null, new C01YU(c1483410ohn, null), 3);
                    linkedList.add(c1483410ohn);
                    i++;
                } while (i < 4);
            }

            @Override // X.InterfaceC490720JMg
            public final C0N0Y LIZ(String str) {
                C0N0Y c0n0y = (C0N0Y) ((HashMap) this.LIZJ).get(str);
                if (c0n0y != null) {
                    return c0n0y;
                }
                C0N0Y c0n0yPoll = this.LIZIZ.poll();
                if (c0n0yPoll == null) {
                    c0n0yPoll = new C1483410ohn();
                    C23250099c.LIZLLL(this.LIZ, null, null, new C01YU(c0n0yPoll, null), 3);
                }
                ((HashMap) this.LIZJ).put(str, c0n0yPoll);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MultiPlayerManagerStore allocatePlayer player: ");
                sbLIZ.append(c0n0yPoll.hashCode());
                sbLIZ.append(" sourceID: ");
                sbLIZ.append(str);
                sbLIZ.append(" available: ");
                sbLIZ.append(this.LIZIZ.size());
                sbLIZ.append(" occupied:  ");
                sbLIZ.append(((HashMap) this.LIZJ).size());
                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                return c0n0yPoll;
            }

            @Override // X.InterfaceC490720JMg
            public final C0N0Y LIZIZ(String str) {
                return (C0N0Y) ((HashMap) this.LIZJ).get(str);
            }

            @Override // X.InterfaceC490720JMg
            public final void LIZJ(String str) {
                C0N0Y c0n0y = (C0N0Y) ((HashMap) this.LIZJ).get(str);
                if (c0n0y == null) {
                    return;
                }
                ((HashMap) this.LIZJ).remove(str);
                if (this.LIZIZ.size() < 2) {
                    C23250099c.LIZLLL(this.LIZ, null, null, new C01YX(c0n0y, null), 3);
                    this.LIZIZ.addFirst(c0n0y);
                } else {
                    C23250099c.LIZLLL(this.LIZ, null, null, new C01YT(c0n0y, null), 3);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MultiPlayerManagerStore freePlayer player: ");
                sbLIZ.append(c0n0y.hashCode());
                sbLIZ.append(" sourceID: ");
                sbLIZ.append(str);
                sbLIZ.append(" available: ");
                sbLIZ.append(this.LIZIZ.size());
                sbLIZ.append(" occupied:  ");
                sbLIZ.append(((HashMap) this.LIZJ).size());
                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        VideoPlayerPagerAbility videoPlayerPagerAbilityBo = bo();
        if (videoPlayerPagerAbilityBo != null) {
            videoPlayerPagerAbilityBo.NQ1(this.LLILZ);
        }
        VideoPlayerPagerAbility videoPlayerPagerAbilityBo2 = bo();
        if (videoPlayerPagerAbilityBo2 != null) {
            videoPlayerPagerAbilityBo2.UT(this.LLILZIL);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoPlayerFragmentScope.class}).unbindAbility(this.LL, VideoPlayerControllerAbility.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoPlayerFragmentScope.class}).bindAbility(this.LL, VideoPlayerControllerAbility.class);
    }
}
