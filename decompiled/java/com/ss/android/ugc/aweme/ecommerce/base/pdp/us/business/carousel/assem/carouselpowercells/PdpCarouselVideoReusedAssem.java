package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells;

import X.C09R3;
import X.C0QSJ;
import X.C1054004Ag;
import X.C13LE;
import X.C1508390pM5;
import X.C1753460vjM;
import X.C1761890vwx;
import X.C1762250vxX;
import X.C1762260vxY;
import X.C1762460vxs;
import X.C1765290w2R;
import X.C1765580w2u;
import X.C1765620w2y;
import X.C1775700wJE;
import X.C2217381BqS;
import X.C23250099c;
import X.C687700QyG;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C804420Vh2;
import X.C998660c5w;
import X.EnumC1153520g7i;
import X.EnumC1508600pMQ;
import X.EnumC1508950pMz;
import X.InterfaceC1146704e9;
import X.InterfaceC1507740pL2;
import X.InterfaceC1587906Jp;
import X.InterfaceC1761670vwb;
import X.InterfaceC1761750vwj;
import X.InterfaceC1762510vxx;
import X.InterfaceC1763030vyn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.VideoConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.pictureinpicture.IPdpPiPAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpCarouselVideoReusedAssem extends ReusedUISlotAssem<PdpCarouselVideoReusedAssem> implements InterfaceC712990Rxx<C1761890vwx>, InterfaceC1761750vwj, TextureView.SurfaceTextureListener, InterfaceC1507740pL2, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public C1765580w2u LLJJLIIIJLLLLLLLZ;
    public TextureView LLJL;
    public C1753460vjM LLJLIL;
    public final C1775700wJE LLJLILLLLZIIL = new C1775700wJE(this, 1);
    public String LLJLL;
    public volatile InterfaceC1763030vyn LLJLLIL;
    public volatile InterfaceC1762510vxx LLJLLL;
    public volatile InterfaceC1761670vwb LLJZ;
    public volatile IPdpPiPAbility LLJZIJLIL;
    public volatile C1762250vxX LLL;
    public InterfaceC665370Q7z LLLF;
    public C0QSJ LLLFF;
    public C0QSJ LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpCarouselVideoReusedAssem.class, "galleryViewerAbility", "getGalleryViewerAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/ICarouselGalleryViewerAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PdpCarouselVideoReusedAssem.class, "pageViewerAbility", "getPageViewerAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/headerabilities/IPagerViewerAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PdpCarouselVideoReusedAssem.class, "pdpVMAbility", "getPdpVMAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(PdpCarouselVideoReusedAssem.class, "pipAbility", "getPipAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/pictureinpicture/IPdpPiPAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(PdpCarouselVideoReusedAssem.class, "playbackCoordinator", "getPlaybackCoordinator()Lcom/ss/android/ugc/aweme/ecommerce/video/PdpCarouselVideoPlaybackCoordinator;", 0);
        c09r3.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void LJLLI(String str) {
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void LL(String str) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.as0;
    }

    @Override // X.InterfaceC1761750vwj
    public final void Q9() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpCarouselScope.class, PdpFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PdpCarouselScope.class);
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1507740pL2
    public final void i0() {
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void onBufferedPercent(String str, long j, int i) {
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void onBuffering(boolean z) {
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void onPlayProgressChange(float f) {
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void onPreparePlay(String str) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final IPdpPiPAbility Ap() {
        IPdpPiPAbility iPdpPiPAbility;
        IPdpPiPAbility iPdpPiPAbility2 = this.LLJZIJLIL;
        if (iPdpPiPAbility2 == null) {
            synchronized (this) {
                iPdpPiPAbility2 = this.LLJZIJLIL;
                if (iPdpPiPAbility2 == null) {
                    C0QSJ c0qsjSp = sp();
                    if (c0qsjSp != null) {
                        iPdpPiPAbility = (IPdpPiPAbility) c0qsjSp.getAbility(IPdpPiPAbility.class);
                        C687700QyG.LJ(iPdpPiPAbility, IPdpPiPAbility.class);
                    } else {
                        iPdpPiPAbility = null;
                    }
                    this.LLJZIJLIL = iPdpPiPAbility;
                    return iPdpPiPAbility;
                }
            }
        }
        return iPdpPiPAbility2;
    }

    public final C1508390pM5 Bp() {
        C1762250vxX c1762250vxX = this.LLL;
        if (c1762250vxX == null) {
            synchronized (this) {
                c1762250vxX = this.LLL;
                if (c1762250vxX == null) {
                    C0QSJ c0qsjLIZLLL = this.LLLFFI;
                    if (c0qsjLIZLLL == null) {
                        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLF;
                        if (interfaceC665370Q7zLJIIIZ == null) {
                            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                            this.LLLF = interfaceC665370Q7zLJIIIZ;
                        }
                        c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpCarouselScope.class});
                        this.LLLFFI = c0qsjLIZLLL;
                        if (c0qsjLIZLLL == null) {
                            c1762250vxX = null;
                        }
                        this.LLL = c1762250vxX;
                    }
                    c1762250vxX = (C1762250vxX) c0qsjLIZLLL.getAbility(C1762250vxX.class);
                    C687700QyG.LJ(c1762250vxX, C1762250vxX.class);
                    this.LLL = c1762250vxX;
                }
            }
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str = ((C1761890vwx) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c1762250vxX.LIZLLL;
        Object c1508390pM5 = linkedHashMap.get(str);
        if (c1508390pM5 == null) {
            c1508390pM5 = new C1508390pM5(c1762250vxX.LIZ, c1762250vxX.LIZIZ, c1762250vxX.LIZJ);
            linkedHashMap.put(str, c1508390pM5);
        }
        return (C1508390pM5) c1508390pM5;
    }

    @Override // X.InterfaceC588410N5z
    public final void LJII() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Video video = ((C1761890vwx) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILLL;
        if (video == null) {
            return;
        }
        video.LIZ();
        if (Bp().LJI()) {
            Ap().OM2(EnumC1508600pMQ.HEADER_VIDEO, true);
        }
        this.LLJLIL.setIconRes(Bp().isMute() ? R.raw.icon_speaker_x_mark_fill_ltr : R.raw.icon_speaker_2_fill_ltr);
        C786410Ut5.N(this.LLJLIL, 0);
        ik(Bp().isMute());
        Ep();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1765580w2u c1765580w2u = this.LLJJLIIIJLLLLLLLZ;
        if (c1765580w2u != null) {
            c1765580w2u.LIZJ();
        }
        C1765580w2u c1765580w2u2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1765580w2u2 != null) {
            c1765580w2u2.getMainHandler().removeCallbacksAndMessages(null);
            c1765580w2u2.LLJJI = null;
            C1765620w2y playerMaskFromXml = c1765580w2u2.getPlayerMaskFromXml();
            playerMaskFromXml.getClass();
            ((Handler) C998660c5w.LIZ.getValue()).removeCallbacksAndMessages(null);
            C998660c5w.LIZIZ = null;
            playerMaskFromXml.LLJJI = false;
            playerMaskFromXml.LLJJIII = false;
            playerMaskFromXml.LLJJIJI = false;
            playerMaskFromXml.LLJILLL = null;
            C1508390pM5 c1508390pM5 = c1765580w2u2.LLJJIJIIJIL;
            if (c1508390pM5 != null) {
                c1508390pM5.release();
            }
            C1508390pM5 c1508390pM52 = c1765580w2u2.LLJJIJIIJIL;
            if (c1508390pM52 != null) {
                c1508390pM52.LJIILLIIL = EnumC1508950pMz.PLAYER_IDLE;
            }
            c1765580w2u2.LLJJ = false;
        }
        Bp().LIZJ = null;
        up().Kd(this);
        yp().Qj(this.LLJLILLLLZIIL);
    }

    @Override // X.InterfaceC1761750vwj
    public final void i6() {
        C1765580w2u c1765580w2u = this.LLJJLIIIJLLLLLLLZ;
        if (c1765580w2u == null) {
            return;
        }
        int currentPosition = yp().getCurrentPosition();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (currentPosition != ((C1761890vwx) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILLJJLI) {
            SurfaceTexture surfaceTexture = c1765580w2u.getVideoView().getSurfaceTexture();
            if (surfaceTexture != null) {
                C1508390pM5.LJIIJ(Bp(), new Surface(surfaceTexture));
                Bp().LIZJ = surfaceTexture;
                Bp().resume();
                Bp().pause();
                return;
            }
            return;
        }
        SurfaceTexture surfaceTexture2 = c1765580w2u.getVideoView().getSurfaceTexture();
        if (surfaceTexture2 != null) {
            C1508390pM5.LJIIJ(Bp(), new Surface(surfaceTexture2));
            Bp().LIZJ = surfaceTexture2;
            if (Bp().LJI()) {
                Bp().resume();
            } else if (Bp().LJIILLIIL == EnumC1508950pMz.PLAYER_PAUSE) {
                Bp().resume();
                Bp().pause();
            }
        }
    }

    public final void op() {
        C1765580w2u c1765580w2u = this.LLJJLIIIJLLLLLLLZ;
        if (c1765580w2u != null) {
            C1508390pM5 c1508390pM5 = c1765580w2u.LLJJIJIIJIL;
            if (c1508390pM5 != null) {
                if (c1508390pM5.LJI()) {
                    c1765580w2u.LIZIZ();
                } else {
                    c1765580w2u.LIZ();
                }
                if (c1508390pM5.isMute()) {
                    c1765580w2u.getSliderCustomIconFromXml().LIZJ();
                } else {
                    c1765580w2u.getSliderCustomIconFromXml().LIZ();
                }
                float f = c1508390pM5.LJIIIZ / 100;
                if (!c1765580w2u.LLJJ) {
                    int i = (int) (f * 10000);
                    c1765580w2u.getSliderFromXml().setProgress(i);
                    c1765580w2u.getSliderCarouselFromXml().setProgress(i);
                }
            }
            if (c1765580w2u.LLJJJJ == EnumC1153520g7i.FULL_SCREEN) {
                C1508390pM5 c1508390pM52 = c1765580w2u.LLJJIJIIJIL;
                if ((c1508390pM52 != null ? c1508390pM52.LJIILLIIL : null) == EnumC1508950pMz.PLAYER_IDLE && c1765580w2u.LLJJIII && c1508390pM52 != null && c1508390pM52.LIZJ != null) {
                    C786410Ut5.LLFF(0, c1765580w2u.getCoverFromXml());
                    TextureView videoSurfaceFromXml = c1765580w2u.getVideoSurfaceFromXml();
                    C786410Ut5.LLIIIILZ(videoSurfaceFromXml, 0);
                    C786410Ut5.Q4(0.0f, videoSurfaceFromXml);
                }
            }
            c1765580w2u.LLJJIII = false;
        }
        if (yp().Vm() && zp().lX().LLLLIIL) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            VideoConfig videoConfig = ((C1761890vwx) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILZLL;
            if (videoConfig != null && Intrinsics.LJFF(videoConfig.autoplayEnabled, Boolean.TRUE)) {
                C1508390pM5 c1508390pM5Bp = Bp();
                Context context = getContentView().getContext();
                if (c1508390pM5Bp.LJIILLIIL == EnumC1508950pMz.PLAYER_IDLE && !c1508390pM5Bp.LJJ && C804420Vh2.LJI(context)) {
                    Bp().LJJ = true;
                    InterfaceC497601wk interfaceC497601wkZd = yp().zd();
                    if (interfaceC497601wkZd != null) {
                        C23250099c.LIZLLL(interfaceC497601wkZd, null, null, new C1762460vxs(this, null), 3);
                        return;
                    }
                    return;
                }
            }
        }
        if (Bp().LJIILLIIL == EnumC1508950pMz.PLAYER_PAUSE) {
            C1765580w2u c1765580w2u2 = this.LLJJLIIIJLLLLLLLZ;
            if (c1765580w2u2 != null) {
                c1765580w2u2.LIZLLL(0.0f);
            }
            C1765580w2u c1765580w2u3 = this.LLJJLIIIJLLLLLLLZ;
            if (c1765580w2u3 != null) {
                c1765580w2u3.LIZJ();
            }
        }
    }

    public final C0QSJ sp() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLFF;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLF;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLF = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLLFF = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC1763030vyn up() {
        InterfaceC1763030vyn interfaceC1763030vyn;
        InterfaceC1763030vyn interfaceC1763030vyn2 = this.LLJLLIL;
        if (interfaceC1763030vyn2 == null) {
            synchronized (this) {
                interfaceC1763030vyn2 = this.LLJLLIL;
                if (interfaceC1763030vyn2 == null) {
                    C0QSJ c0qsjSp = sp();
                    if (c0qsjSp != null) {
                        interfaceC1763030vyn = (InterfaceC1763030vyn) c0qsjSp.getAbility(InterfaceC1763030vyn.class);
                        C687700QyG.LJ(interfaceC1763030vyn, InterfaceC1763030vyn.class);
                    } else {
                        interfaceC1763030vyn = null;
                    }
                    this.LLJLLIL = interfaceC1763030vyn;
                    return interfaceC1763030vyn;
                }
            }
        }
        return interfaceC1763030vyn2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x003a, PHI: r1
      0x0029: PHI (r1v4 X.0QSJ) = (r1v3 X.0QSJ), (r1v9 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0036, B:17:0x0038, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1762510vxx yp() {
        /*
            r4 = this;
            X.0vxx r1 = r4.LLJLLL
            if (r1 != 0) goto L3e
            monitor-enter(r4)
            X.0vxx r1 = r4.LLJLLL     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L3d
            X.0QSJ r1 = r4.LLLFFI     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLF     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L3a
            r4.LLLF = r3     // Catch: java.lang.Throwable -> L3a
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope> r1 = com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3a
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3a
            r4.LLLFFI = r1     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            r1 = 0
            goto L36
        L29:
            java.lang.Class<X.0vxx> r0 = X.InterfaceC1762510vxx.class
            java.lang.Object r1 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3a
            X.0vxx r1 = (X.InterfaceC1762510vxx) r1     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<X.0vxx> r0 = X.InterfaceC1762510vxx.class
            X.C687700QyG.LJ(r1, r0)     // Catch: java.lang.Throwable -> L3a
        L36:
            r4.LLJLLL = r1     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            return r1
        L3a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L3d:
            monitor-exit(r4)
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells.PdpCarouselVideoReusedAssem.yp():X.0vxx");
    }

    public final InterfaceC1761670vwb zp() {
        InterfaceC1761670vwb interfaceC1761670vwb;
        InterfaceC1761670vwb interfaceC1761670vwb2 = this.LLJZ;
        if (interfaceC1761670vwb2 == null) {
            synchronized (this) {
                interfaceC1761670vwb2 = this.LLJZ;
                if (interfaceC1761670vwb2 == null) {
                    C0QSJ c0qsjSp = sp();
                    if (c0qsjSp != null) {
                        interfaceC1761670vwb = (InterfaceC1761670vwb) c0qsjSp.getAbility(InterfaceC1761670vwb.class);
                        C687700QyG.LJ(interfaceC1761670vwb, InterfaceC1761670vwb.class);
                    } else {
                        interfaceC1761670vwb = null;
                    }
                    this.LLJZ = interfaceC1761670vwb;
                    return interfaceC1761670vwb;
                }
            }
        }
        return interfaceC1761670vwb2;
    }

    public final void Ep() {
        C1054004Ag c1054004Ag = zp().lX().LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            int i = ((C1761890vwx) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILLJJLI;
            int iO2 = yp().o2();
            C724270Sb3 c724270Sb32 = this.LLJI;
            boolean z = iO2 == ((C1761890vwx) (c724270Sb32 != null ? c724270Sb32.LL : null)).LLILLJJLI;
            String str = !up().D9() ? "main" : "viewer";
            C724270Sb3 c724270Sb33 = this.LLJI;
            c1054004Ag.LJIJJ(str, i, ((C1761890vwx) (c724270Sb33 != null ? c724270Sb33.LL : null)).LLILLL.id, Bp().LJIJJLI ? "auto" : "manual", (int) Bp().LJIILJJIL, Bp().LIZLLL(), z, zp().lX().iH1(null));
        }
    }

    public final void Fp() {
        C1054004Ag c1054004Ag = zp().lX().LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            int i = ((C1761890vwx) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILLJJLI;
            int iO2 = yp().o2();
            C724270Sb3 c724270Sb32 = this.LLJI;
            boolean z = iO2 == ((C1761890vwx) (c724270Sb32 != null ? c724270Sb32.LL : null)).LLILLJJLI;
            String str = !up().D9() ? "main" : "viewer";
            C724270Sb3 c724270Sb33 = this.LLJI;
            Video video = ((C1761890vwx) (c724270Sb33 != null ? c724270Sb33.LL : null)).LLILLL;
            c1054004Ag.LJIJJLI(str, i, video != null ? video.id : null, Bp().LJIJJLI ? "auto" : "manual", (int) Bp().LJIILJJIL, Bp().LIZLLL(), z, zp().lX().iH1(null));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        yp().m9(this.LLJLILLLLZIIL);
    }

    public final C1765290w2R tp() {
        C1762260vxY c1762260vxYKR2 = zp().lX().KR2();
        if (c1762260vxYKR2 != null) {
            return c1762260vxYKR2.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC1507740pL2
    public final void ik(boolean z) {
        int i;
        C1753460vjM c1753460vjM = this.LLJLIL;
        if (z) {
            i = R.raw.icon_speaker_x_mark_fill_ltr;
        } else {
            i = R.raw.icon_speaker_2_fill_ltr;
        }
        c1753460vjM.setIconRes(i);
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void onPausePlay(String str) {
        this.LLJLIL.setIconRes(R.raw.icon_play_fill);
        C786410Ut5.N(this.LLJLIL, 8);
        Fp();
        Ap().OM2(EnumC1508600pMQ.HEADER_VIDEO, false);
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void onPlayCompleted(String str) {
        this.LLJLIL.setIconRes(R.raw.icon_play_fill);
        C786410Ut5.N(this.LLJLIL, 8);
        Fp();
        Ap().OM2(EnumC1508600pMQ.HEADER_VIDEO, false);
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void onResumePlay(String str) {
        C786410Ut5.N(this.LLJLIL, 0);
        ik(Bp().isMute());
        if (Bp().LJI()) {
            Ap().OM2(EnumC1508600pMQ.HEADER_VIDEO, true);
        }
        Ep();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1765580w2u c1765580w2u = this.LLJJLIIIJLLLLLLLZ;
        if (c1765580w2u == null) {
            return true;
        }
        C786410Ut5.LLIIIILZ(c1765580w2u.getVideoView(), 0);
        if (c1765580w2u.getVideoView().isAvailable()) {
            Bp();
            if (!C1508390pM5.LJIILIIL(c1765580w2u.getVideoView().getSurfaceTexture())) {
                c1765580w2u.LIZJ();
            }
        }
        if (Bp().LIZJ == null) {
            return true;
        }
        Bp();
        if (C1508390pM5.LJIILIIL(Bp().LIZJ)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById;
        View contentView = getContentView();
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = contentView.findViewById(R.id.qtx);
            C1765580w2u c1765580w2u = (C1765580w2u) callbackFindViewById;
            if (c1765580w2u == null) {
                c1765580w2u = null;
            }
            this.LLJJLIIIJLLLLLLLZ = c1765580w2u;
        }
        this.LLJJLIIIJLLLLLLLZ = (C1765580w2u) callbackFindViewById;
        View contentView2 = getContentView();
        KeyEvent.Callback callbackFindViewById2 = this.LLJLIL;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = contentView2.findViewById(R.id.video_control_button);
            C1753460vjM c1753460vjM = (C1753460vjM) callbackFindViewById2;
            if (c1753460vjM == null) {
                c1753460vjM = null;
            }
            this.LLJLIL = c1753460vjM;
        }
        this.LLJLIL = (C1753460vjM) callbackFindViewById2;
        TextureView textureView = (TextureView) this.LLJJLIIIJLLLLLLLZ.findViewById(R.id.video_surface);
        this.LLJL = textureView;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(this);
        }
        up().Ec(this);
        View viewFindViewById2 = getContentView().findViewById(R.id.qtg);
        if (viewFindViewById2 != null && (viewFindViewById = viewFindViewById2.findViewById(R.id.eqx)) != null) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 99), viewFindViewById);
        }
        C786410Ut5.I7(new AjS70S0100000_26(this, 100), this.LLJLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff A[PHI: r0
      0x00ff: PHI (r0v65 android.graphics.drawable.Drawable) = (r0v64 android.graphics.drawable.Drawable), (r0v68 android.graphics.drawable.Drawable) binds: [B:65:0x00fd, B:60:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01da  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1761890vwx r27) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells.PdpCarouselVideoReusedAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1761890vwx c1761890vwx) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1761890vwx c1761890vwx) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    @Override // android.view.TextureView.SurfaceTextureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r4, int r5, int r6) {
        /*
            r3 = this;
            X.0vyn r0 = r3.up()
            boolean r0 = r0.wh()
            if (r0 != 0) goto Lb
            return
        Lb:
            X.0w2u r2 = r3.LLJJLIIIJLLLLLLLZ
            if (r2 != 0) goto L10
            return
        L10:
            X.0pM5 r0 = r3.Bp()
            android.graphics.SurfaceTexture r0 = r0.LIZJ
            if (r0 == 0) goto L5e
            r3.Bp()
            X.0pM5 r0 = r3.Bp()
            android.graphics.SurfaceTexture r0 = r0.LIZJ
            boolean r0 = X.C1508390pM5.LJIILIIL(r0)
            if (r0 != 0) goto L5e
            X.0pM5 r0 = r3.Bp()
            android.graphics.SurfaceTexture r1 = r0.LIZJ
            if (r1 == 0) goto L44
            android.view.TextureView r0 = r2.getVideoView()
            android.graphics.SurfaceTexture r0 = r0.getSurfaceTexture()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L44
            android.view.TextureView r0 = r3.LLJL
            if (r0 == 0) goto L44
            r0.setSurfaceTexture(r1)
        L44:
            X.0Sb3 r0 = r3.LLJI
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r0.LL
        L4a:
            X.0vwx r0 = (X.C1761890vwx) r0
            int r1 = r0.LLILLJJLI
            X.0vxx r0 = r3.yp()
            int r0 = r0.getCurrentPosition()
            if (r1 != r0) goto L5b
            r3.op()
        L5b:
            return
        L5c:
            r0 = 0
            goto L4a
        L5e:
            X.0pM5 r1 = r3.Bp()
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r4)
            X.C1508390pM5.LJIIJ(r1, r0)
            X.0pM5 r0 = r3.Bp()
            r0.LIZJ = r4
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells.PdpCarouselVideoReusedAssem.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
    }
}
