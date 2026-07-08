package com.ss.android.ugc.aweme.tako.aivideo.detail.cell;

import X.C01GW;
import X.C0QSJ;
import X.C0RF0;
import X.C0SUC;
import X.C1280370jQJ;
import X.C13LE;
import X.C1BNE;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C452501pT;
import X.C583360MuM;
import X.C673150Qan;
import X.C687700QyG;
import X.C709680Rsc;
import X.C735410St1;
import X.InterfaceC1487080oni;
import X.InterfaceC1682240tsU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC448830Hir;
import X.InterfaceC665370Q7z;
import X.InterfaceC704110Rjd;
import X.InterfaceC737790Swr;
import Y.AObjectS386S0100000_11;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility;
import com.ss.android.ugc.aweme.ad.feed.translation.ability.ICarouselComponentTranslationAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoEntranceRecorder;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoMobFiller;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TakoAIVideoCell extends VideoViewCell implements InterfaceC448830Hir, InterfaceC737790Swr {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] m1;
    public final TakoAIVideoCell T0;
    public final C01GW U0;
    public final C709680Rsc<TakoAIVideoCell> V0;
    public final C2252321DDq W0;
    public volatile InterfaceC1682240tsU X0;
    public BottomSlideIndicatorAbility Y0;
    public IPhotoModeAbility Z0;
    public IPhotoSlidesAbility a1;
    public IPhotoSlidesEventDispatchAbility b1;
    public ISlideIndicatorAbility c1;
    public ICommercePhotoSlideAbility d1;
    public ICarouselComponentTranslationAbility e1;
    public PauseTimeAbility f1;
    public FeedBarSearchAbility g1;
    public InterfaceC448830Hir h1;
    public InterfaceC704110Rjd i1;
    public FcpMetaTagAbility j1;
    public InterfaceC665370Q7z k1;
    public C0QSJ l1;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAIVideoCell.class, "hostAbility", "getHostAbility()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/ability/TakoAIVideoHostAbility;", 0);
        C13LE.LIZ.getClass();
        m1 = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        super.bindAbility(obj, cls);
        if (cls == BottomSlideIndicatorAbility.class) {
            this.Y0 = (BottomSlideIndicatorAbility) obj;
        } else if (cls == IPhotoModeAbility.class) {
            this.Z0 = (IPhotoModeAbility) obj;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.a1 = (IPhotoSlidesAbility) obj;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.b1 = (IPhotoSlidesEventDispatchAbility) obj;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.c1 = (ISlideIndicatorAbility) obj;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.d1 = (ICommercePhotoSlideAbility) obj;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.e1 = (ICarouselComponentTranslationAbility) obj;
        } else if (cls == PauseTimeAbility.class) {
            this.f1 = (PauseTimeAbility) obj;
        } else if (cls == FeedBarSearchAbility.class) {
            this.g1 = (FeedBarSearchAbility) obj;
            C687700QyG.LJFF(this, this.Q0, obj, cls);
        } else if (cls == InterfaceC448830Hir.class) {
            this.h1 = (InterfaceC448830Hir) obj;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.i1 = (InterfaceC704110Rjd) obj;
        } else if (cls == FcpMetaTagAbility.class) {
            this.j1 = (FcpMetaTagAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoAIVideoDetailScope.class, VideoCellScope.class});
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public final Object getAbility(Class cls) {
        return cls == BottomSlideIndicatorAbility.class ? this.Y0 : cls == IPhotoModeAbility.class ? this.Z0 : cls == IPhotoSlidesAbility.class ? this.a1 : cls == IPhotoSlidesEventDispatchAbility.class ? this.b1 : cls == ISlideIndicatorAbility.class ? this.c1 : cls == ICommercePhotoSlideAbility.class ? this.d1 : cls == ICarouselComponentTranslationAbility.class ? this.e1 : cls == PauseTimeAbility.class ? this.f1 : cls == FeedBarSearchAbility.class ? this.g1 : cls == InterfaceC448830Hir.class ? this.h1 : cls == InterfaceC704110Rjd.class ? this.i1 : cls == FcpMetaTagAbility.class ? this.j1 : super.getAbility(cls);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(TakoAIVideoDetailScope.class);
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        super.unbindAbility(obj, cls);
        if (cls == BottomSlideIndicatorAbility.class) {
            this.Y0 = null;
        } else if (cls == IPhotoModeAbility.class) {
            this.Z0 = null;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.a1 = null;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.b1 = null;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.c1 = null;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.d1 = null;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.e1 = null;
        } else if (cls == PauseTimeAbility.class) {
            this.f1 = null;
        } else if (cls == FeedBarSearchAbility.class) {
            this.g1 = null;
        } else if (cls == InterfaceC448830Hir.class) {
            this.h1 = null;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.i1 = null;
        } else if (cls == FcpMetaTagAbility.class) {
            this.j1 = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final C583360MuM Z0() {
        C709680Rsc<TakoAIVideoCell> c709680Rsc = this.V0;
        c709680Rsc.getClass();
        return new C583360MuM(c709680Rsc.LIZLLL.getValue(), (InterfaceC1487080oni) c709680Rsc.LJ.getValue());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void onDestroyView() {
        C709680Rsc<TakoAIVideoCell> c709680Rsc = this.V0;
        if (c709680Rsc.LIZLLL.isInitialized()) {
            C1280370jQJ value = c709680Rsc.LIZLLL.getValue();
            if (value.LJ.compareAndSet(false, true)) {
                value.LJII("release");
            }
        }
        super.onDestroyView();
    }

    public final InterfaceC1682240tsU p1() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.l1;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.k1;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.k1 = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{TakoAIVideoDetailScope.class});
            this.l1 = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1682240tsU interfaceC1682240tsU = (InterfaceC1682240tsU) c0qsjLIZLLL.getAbility(InterfaceC1682240tsU.class);
        C687700QyG.LJ(interfaceC1682240tsU, InterfaceC1682240tsU.class);
        return interfaceC1682240tsU;
    }

    @Override // X.InterfaceC448830Hir
    public final /* bridge */ /* synthetic */ C2252321DDq LJJJZ() {
        return this.W0;
    }

    public TakoAIVideoCell(C0RF0 c0rf0) {
        super(c0rf0);
        this.T0 = this;
        this.U0 = C452501pT.LIZIZ(new AwS555S0100000_11(this, 945));
        this.V0 = new C709680Rsc<>(AFwS243S0000000_11.get$arr$(485), this, AFwS243S0000000_11.get$arr$(486));
        this.W0 = C1BNE.LIZ(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        this.W0.setValue(Boolean.TRUE);
        InterfaceC1682240tsU interfaceC1682240tsUP1 = this.X0;
        if (interfaceC1682240tsUP1 == null) {
            synchronized (this) {
                interfaceC1682240tsUP1 = this.X0;
                if (interfaceC1682240tsUP1 == null) {
                    interfaceC1682240tsUP1 = p1();
                    this.X0 = interfaceC1682240tsUP1;
                }
            }
        }
        interfaceC1682240tsUP1.TE(this.LLJJ);
        TranslationAbility translationAbility = (TranslationAbility) this.U0.getValue();
        if (translationAbility != null) {
            translationAbility.JX0(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLZZJLIL(View view) throws Exception {
        C687700QyG.LJIIIIZZ(this);
        super.LLZZJLIL(view);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).unbindAbility(this.T0, InterfaceC448830Hir.class);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void g0(C735410St1 c735410St1) {
        Context context = this.LLLLLLLLLL;
        if (context == null) {
            return;
        }
        C2189821An6 c2189821An6LIZ = C0SUC.LIZ(context);
        for (Map.Entry<String, String> entry : TakoAIVideoMobFiller.toParams(c2189821An6LIZ).entrySet()) {
            c735410St1.LJ(entry.getKey(), entry.getValue());
        }
        TakoAIVideoEntranceRecorder.set(c2189821An6LIZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void h(boolean z) {
        super.h(z);
        this.W0.setValue(Boolean.FALSE);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).bindAbility(this.T0, InterfaceC448830Hir.class);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final FeedVideoAssem p0(BaseFeedPageParams baseFeedPageParams, AObjectS386S0100000_11 aObjectS386S0100000_11, int i, ConcurrentHashSet concurrentHashSet) {
        return new TakoAIVideoFeedVideoAssem(baseFeedPageParams, aObjectS386S0100000_11, i, concurrentHashSet);
    }
}
