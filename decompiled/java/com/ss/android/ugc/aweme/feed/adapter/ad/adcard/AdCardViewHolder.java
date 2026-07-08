package com.ss.android.ugc.aweme.feed.adapter.ad.adcard;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C035D;
import X.C0QSJ;
import X.C0R6M;
import X.C0RC1;
import X.C0REZ;
import X.C0RF0;
import X.C0RGF;
import X.C0RHA;
import X.C0RQ8;
import X.C0SKK;
import X.C0SYH;
import X.C0SZ8;
import X.C0T23;
import X.C1017180cZo;
import X.C1048150dNl;
import X.C1056540dbI;
import X.C1365850leB;
import X.C1365860leC;
import X.C1365870leD;
import X.C1440005kM;
import X.C14EU;
import X.C1558420qem;
import X.C19EG;
import X.C1AV2;
import X.C2188811AlT;
import X.C284090BBn;
import X.C452501pT;
import X.C583360MuM;
import X.C584270Mvp;
import X.C673150Qan;
import X.C687700QyG;
import X.C690190R5l;
import X.C690330R5z;
import X.C690430R6j;
import X.C690870R8b;
import X.C691490RAl;
import X.C691720RBi;
import X.C691740RBk;
import X.C691830RBt;
import X.C691870RBx;
import X.C692050RCp;
import X.C697110RWb;
import X.C708090Rq3;
import X.C714530S1b;
import X.C723850SaN;
import X.C724240Sb0;
import X.InterfaceC1008930cMV;
import X.InterfaceC1146704e9;
import X.InterfaceC1473950oSX;
import X.InterfaceC1483820oiS;
import X.InterfaceC448830Hir;
import X.InterfaceC583650Mup;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC689860R4e;
import X.InterfaceC691660RBc;
import X.InterfaceC704110Rjd;
import X.InterfaceC713360RyY;
import X.InterfaceC739930T0t;
import android.content.Context;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedContainer;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.item.ISearchInflowProductShopCardService;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.landpage.preload.ICommerceGeckoPreloadService;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility;
import com.ss.android.ugc.aweme.ad.feed.translation.ability.ICarouselComponentTranslationAbility;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS555S0100000_11;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes12.dex */
public final class AdCardViewHolder extends AssemReusedContainer<AdCardViewHolder, VideoItemParams> implements C0SZ8, C0RGF<AdCardViewHolder, VideoItemParams>, ViewModelStoreOwner, InterfaceC1483820oiS, C0QSJ, InterfaceC1146704e9 {
    public final C0RF0 LLJILJILJ;
    public final ViewModelStore LLJILLL;
    public Aweme LLJJ;
    public final C0T23 LLJJI;
    public final String LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public BottomSlideIndicatorAbility LLJJJJLIIL;
    public IPhotoModeAbility LLJJL;
    public IPhotoSlidesAbility LLJJLIIIJLLLLLLLZ;
    public IPhotoSlidesEventDispatchAbility LLJL;
    public ISlideIndicatorAbility LLJLIL;
    public ICommercePhotoSlideAbility LLJLILLLLZIIL;
    public ICarouselComponentTranslationAbility LLJLL;
    public PauseTimeAbility LLJLLIL;
    public FeedBarSearchAbility LLJLLL;
    public InterfaceC448830Hir LLJZ;
    public InterfaceC704110Rjd LLJZIJLIL;
    public FcpMetaTagAbility LLL;
    public List<InterfaceC687730QyJ> LLLF;

    @Override // X.C0SZ8
    public final /* synthetic */ void A(boolean z, C1AV2 c1av2) {
    }

    @Override // X.C0SZ8
    public final void Ar(Aweme aweme) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void B0(boolean z) {
        throw null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ BaseFeedPlayerView E() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void F0(String str) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ ImageView F2() {
        return null;
    }

    @Override // X.C0SZ8
    public final void G() {
    }

    @Override // X.C0SZ8
    public final void K1(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void K8(View.OnTouchListener onTouchListener) {
    }

    @Override // X.C0SZ8
    public final /* bridge */ /* synthetic */ InterfaceC689860R4e K9() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void L0(int i, Aweme aweme) {
    }

    @Override // X.C0SZ8
    public final void LJIIJ() {
    }

    @Override // X.C0SZ8
    public final void LJIIZILJ(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJIJJ() {
        throw null;
    }

    @Override // X.C0SZ8, X.C0SZA
    public final /* bridge */ /* synthetic */ InterfaceC739930T0t LJIJJLI() {
        return null;
    }

    @Override // X.C0SZ8
    public final void LJJIFFI(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJJIIJ() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ C0SZ8 LJJIJIL(String str) {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJJIL(C0R6M c0r6m) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJJIZ(C0RHA c0rha) {
    }

    @Override // X.C0SZ8
    public final void LJJJJJ(long j) {
    }

    @Override // X.C0SZ8
    public final void LJJJLIIL(int i, long j) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJJJLZIJ(C1365850leB c1365850leB) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LJJLIIIJ() {
        return true;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJLJLLL(int i, int i2, int i3, String str, String str2) {
    }

    @Override // X.C0SZ8
    public final void LJLLILLLL() {
        this.LLJJJJ = true;
        LLLIIL();
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJZI(boolean z, boolean z2) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLFF() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLFII(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLFZ(Object obj) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLIIII(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLIIIJ(C0SYH c0syh) {
    }

    @Override // X.C0SZ8
    public final void LLIIL(String str) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLIILZL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLIIZ() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLILII(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLILLL(C1365860leC c1365860leC) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLIZLLLIL() {
    }

    @Override // X.C0SZ8
    public final void LLJI(C697110RWb c697110RWb) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJ(int i, boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJIJIIJIL(String str) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJIJIL() {
        throw null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJJIL() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJJJ(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJJJJIL(boolean z, boolean z2) {
    }

    @Override // X.C0SZ8
    public final void LLJL(boolean z, boolean z2) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJLIL(Long l) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJLILLLLZIIL(int i, String str, String str2) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJLL() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ C0SZ8 LLJLLL() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLF() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLFFI(int i, String str, String str2) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLIIII() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLILZLLLI() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ View LLLJIL() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLLLIIIILLL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLLIIL() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLLIILL(int i, String str) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLLJ(int i, String str) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ C584270Mvp LLLLLJIL() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLLLLLIL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLLLLJ(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLLLZL() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ View LLLLZLLIL() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLLZ() {
        return true;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLLZIL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLZLZ(Map map) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLLZZIL() {
        return true;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLZ() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLZLI() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLZLLLL(int i) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ View LLZZ(String str) {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLZZZIL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void M(C0REZ c0rez) {
        throw null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void M0(C690190R5l c690190R5l) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean Nv() {
        throw null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ View Qg(String str, boolean z) {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void Rl(C035D c035d) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void Y0(int i, int i2, long j, long j2, long j3, long j4, long j5) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void Z(int i, boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ C583360MuM Z0() {
        return null;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLJJJJLIIL = (BottomSlideIndicatorAbility) obj;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJJL = (IPhotoModeAbility) obj;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJJLIIIJLLLLLLLZ = (IPhotoSlidesAbility) obj;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJL = (IPhotoSlidesEventDispatchAbility) obj;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJLIL = (ISlideIndicatorAbility) obj;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJLILLLLZIIL = (ICommercePhotoSlideAbility) obj;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJLL = (ICarouselComponentTranslationAbility) obj;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJLLIL = (PauseTimeAbility) obj;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJLLL = (FeedBarSearchAbility) obj;
            C687700QyG.LJFF(this, this.LLLF, obj, cls);
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJZ = (InterfaceC448830Hir) obj;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJZIJLIL = (InterfaceC704110Rjd) obj;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLL = (FcpMetaTagAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ boolean bn() {
        return true;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.C0SZ8
    public final void e1() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void ev() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void g1(int i) {
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            return this.LLJJJJLIIL;
        }
        if (cls == IPhotoModeAbility.class) {
            return this.LLJJL;
        }
        if (cls == IPhotoSlidesAbility.class) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        if (cls == IPhotoSlidesEventDispatchAbility.class) {
            return this.LLJL;
        }
        if (cls == ISlideIndicatorAbility.class) {
            return this.LLJLIL;
        }
        if (cls == ICommercePhotoSlideAbility.class) {
            return this.LLJLILLLLZIIL;
        }
        if (cls == ICarouselComponentTranslationAbility.class) {
            return this.LLJLL;
        }
        if (cls == PauseTimeAbility.class) {
            return this.LLJLLIL;
        }
        if (cls == FeedBarSearchAbility.class) {
            return this.LLJLLL;
        }
        if (cls == InterfaceC448830Hir.class) {
            return this.LLJZ;
        }
        if (cls == InterfaceC704110Rjd.class) {
            return this.LLJZIJLIL;
        }
        if (cls == FcpMetaTagAbility.class) {
            return this.LLL;
        }
        return null;
    }

    @Override // X.C0SZ8
    public final int getAwemeType() {
        return 104;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ Surface getSurface() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void h0(Aweme aweme) {
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void hj() {
    }

    @Override // X.C0SZ8
    public final void i0() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void k1(String str, boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean l() {
        return true;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean l1() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void o(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean o1() {
        return false;
    }

    @Override // X.C0SZ8
    public final void onPageSelected(int i) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void onScrollEnd() {
        throw null;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void pe() {
    }

    @Override // X.C0SZ8
    public final void q(String str, String str2) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ View.OnTouchListener q5() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void q7(float f, int i, int i2, int i3) {
        throw null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void qi() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void s0() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void u1() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLJJJJLIIL = null;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJJL = null;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJJLIIIJLLLLLLLZ = null;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJL = null;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJLIL = null;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJLILLLLZIIL = null;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJLL = null;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJLLIL = null;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJLLL = null;
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJZ = null;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJZIJLIL = null;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLLF;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void uq(C1365870leD c1365870leD) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void v(long j, long j2, long j3, long j4, int i, long j5, int i2) {
    }

    @Override // X.C0SZ8
    public final /* bridge */ /* synthetic */ InterfaceC583650Mup x3() {
        return null;
    }

    @Override // X.InterfaceC719640SKs
    public final LifecycleOwner E82() {
        return this.LLJILJILJ.LIZJ;
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        return this.LLJILJILJ.LIZ;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public final ReusedUIAssem<?> LLILLJJLI() {
        C690870R8b c690870R8b = new C690870R8b();
        c690870R8b.LIZ = 7;
        c690870R8b.LIZIZ = "cell_ad_card";
        C0RF0 c0rf0 = this.LLJILJILJ;
        c690870R8b.LIZLLL = c0rf0;
        c690870R8b.LJ = c0rf0.LJ;
        c690870R8b.LJFF = C690330R5z.LIZ(new ViewModelProvider(this), this, C691720RBi.LIZ);
        C723850SaN.LJ(this, new AwS377S0200000_11(this, new C690430R6j(c690870R8b), 20));
        return (ReusedUIAssem) this.LLJJIJI.getValue();
    }

    public final C708090Rq3 LLLIILIL() {
        return (C708090Rq3) this.LLJJIJIL.getValue();
    }

    public final ISearchInflowProductShopCardService LLLIZZ() {
        return (ISearchInflowProductShopCardService) this.LLJJJ.getValue();
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        return this.LLJILJILJ.LIZJ.getActivity();
    }

    @Override // X.InterfaceC1483820oiS
    public final HashMap getParams() {
        return new HashMap();
    }

    @Override // X.InterfaceC1483820oiS
    public final FrameLayout getPlayViewContainer() {
        return (FrameLayout) this.LLJILJILJ.LIZ.findViewById(R.id.a7m);
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        InterfaceC713360RyY interfaceC713360RyY = this.LLJILJILJ.LJIIL;
        if (interfaceC713360RyY != null) {
            return C1558420qem.LIZIZ(interfaceC713360RyY);
        }
        return null;
    }

    @Override // X.C0SZ8
    public final void onResume() {
        if (this.LLJJJJ) {
            LLLIIL();
        }
    }

    @Override // X.C0SZ8, X.C0SZA
    public final Aweme LJIIIIZZ() {
        return getAweme();
    }

    public final void LLJJLIIIJLLLLLLLZ() {
        InterfaceC1008930cMV interfaceC1008930cMVLLLIL = LLLIL();
        if (interfaceC1008930cMVLLLIL != null) {
            interfaceC1008930cMVLLLIL.LJIILL(new C692050RCp(false));
        }
        LLLIILIL().LIZ(C0RQ8.PAUSE);
        if (LLLIZZ().LJI(this.LLJJ, this.LLJJIII)) {
            LLLIZZ().LJFF().pause();
        }
        this.LLJJJJJIL = false;
    }

    public final void LLLIIL() {
        InterfaceC1008930cMV interfaceC1008930cMVLLLIL = LLLIL();
        if (interfaceC1008930cMVLLLIL != null) {
            interfaceC1008930cMVLLLIL.LJIILL(new C692050RCp(true));
        }
        LLLIILIL().LIZ(C0RQ8.RESUME);
        if (LLLIZZ().LJI(this.LLJJ, this.LLJJIII)) {
            LLLIZZ().LJFF().resume();
        }
        this.LLJJJJJIL = true;
    }

    public final InterfaceC1008930cMV LLLIL() {
        if (!C1056540dbI.LIZJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getFeedItemModule panel name = ");
            sbLIZ.append(this.LLJJIII);
            sbLIZ.append(",item.aweme = ");
            sbLIZ.append(this.LLJJ);
            C2188811AlT.LIZIZ(sbLIZ);
        } else if (C691740RBk.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getFeedItemModule panel name = ");
            sbLIZ2.append(this.LLJJIII);
            sbLIZ2.append(",item.aweme = ");
            sbLIZ2.append(this.LLJJ);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        return ((IFeedService) this.LLJJIJIIJIL.getValue()).LIZJ(this.LLJILJILJ.LIZ.getContext(), this.LLJJ, this.LLJJIII, true);
    }

    @Override // X.C0SZ8
    public final Aweme hm() {
        return getAweme();
    }

    @Override // X.C0SZ8
    public final void onDestroyView() {
        LLLIILIL().LIZ(C0RQ8.RELEASE);
        if (LLLIZZ().LJI(this.LLJJ, this.LLJJIII)) {
            LLLIZZ().onDestroyView();
        }
    }

    @Override // X.C0SZ8
    public final void unBind() {
        wY0();
        InterfaceC1008930cMV interfaceC1008930cMVLLLIL = LLLIL();
        if (interfaceC1008930cMVLLLIL != null) {
            interfaceC1008930cMVLLLIL.LIZ();
        }
        LLLIILIL().LIZ(C0RQ8.STOP);
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.C0SZ8
    public final C0SKK LJLLLL() {
        return C0SKK.INITIALIZED;
    }

    @Override // X.C0SZ8
    public final Aweme getAweme() {
        return this.LLJJ;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.LLJILLL;
    }

    @Override // X.C0SZ8
    public final void onPause() {
        LLJJLIIIJLLLLLLLZ();
    }

    @Override // X.C0SZ8
    public final void LJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        ICommerceGeckoPreloadService iCommerceGeckoPreloadService;
        this.LLJJ = aweme;
        C0T23 c0t23 = this.LLJJI;
        if (c0t23 != null && c0t23.LIZ(aweme)) {
            return;
        }
        if (!((Boolean) C284090BBn.LIZ.getValue()).booleanValue() && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && C1017180cZo.LJIILJJIL(awemeRawAd) && awemeRawAd.getPreloadWeb() == 4 && (iCommerceGeckoPreloadService = (ICommerceGeckoPreloadService) PluggableExtentionKt.pluggableSpi$default(ICommerceGeckoPreloadService.class, false, false, false, 14, null)) != null) {
            String channelName = awemeRawAd.getChannelName();
            if (channelName == null) {
                channelName = "";
            }
            iCommerceGeckoPreloadService.LIZ(new C1048150dNl(channelName), null);
        }
        InterfaceC1008930cMV interfaceC1008930cMVLLLIL = LLLIL();
        if (interfaceC1008930cMVLLLIL != null) {
            interfaceC1008930cMVLLLIL.LJ(this.LLJILJILJ.LIZ);
        }
        if (LLLIZZ().LJI(aweme, this.LLJJIII)) {
            LLLIZZ().LIZLLL(aweme, this);
        }
        EventBus.LIZLLL().LJIJJ(this);
        LLLIILIL().LIZIZ = new C691830RBt(this);
        LLLIILIL().LIZ(C0RQ8.INIT);
    }

    @Override // X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        AwemeRawAd awemeRawAd;
        Context context;
        ViewGroup viewGroup;
        IAdsPreviewService iAdsPreviewService;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList2;
        C1440005kM.LIZ(new C714530S1b(this.LLJJ));
        AssemSupervisor assemSupervisorLJFF = C724240Sb0.LJFF(this);
        if (assemSupervisorLJFF != null && (copyOnWriteArrayList2 = assemSupervisorLJFF.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList2) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).J1(i, this.LLJJ);
            }
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ((AbstractC738140SxQ) this.LLJJIJI.getValue());
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ2 : copyOnWriteArrayList) {
                if (abstractC738140SxQ2 instanceof InterfaceC691660RBc) {
                    arrayList2.add(abstractC738140SxQ2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((InterfaceC691660RBc) it3.next()).J1(i, this.LLJJ);
            }
        }
        LLLIILIL().LIZ(C0RQ8.START);
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIIZ(hashCode(), this.LLJJ);
        Aweme aweme = this.LLJJ;
        if (aweme != null) {
            ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().r3(aweme);
        }
        if (LLLIZZ().LJI(this.LLJJ, this.LLJJIII)) {
            LLLIZZ().LIZ(this.LLJJIII);
        }
        Aweme aweme2 = this.LLJJ;
        if (aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null && C1017180cZo.LJIJ(awemeRawAd) && (context = this.LLJILJILJ.LIZ.getContext()) != null) {
            View view = this.LLJILJILJ.LIZ;
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null && (iAdsPreviewService = (IAdsPreviewService) PluggableExtentionKt.pluggableSpi$default(IAdsPreviewService.class, false, false, false, 14, null)) != null) {
                String previewWatermarkText = awemeRawAd.getPreviewWatermarkText();
                if (previewWatermarkText == null) {
                    previewWatermarkText = "";
                }
                iAdsPreviewService.LJIIIIZZ(context, viewGroup, new C0RC1(previewWatermarkText, true), null);
            }
        }
    }

    @Override // X.C0SZ8
    public final void LJLIIIL(int i) {
        if (i == 1 || i == 4 || i == 5) {
            this.LLJJJJ = false;
        }
        LLJJLIIIJLLLLLLLZ();
    }

    @Override // X.C0SZ8
    public final void LLJLLIL(boolean z) {
        LLLI(2);
    }

    @Override // X.C0SZ8
    public final void LLLI(int i) {
        if (this.LLJJJJ) {
            LLLIIL();
        }
    }

    @Override // X.C0SZ8
    public final void LLZZJLIL(View view) {
        Sl0(view, this);
    }

    @Override // X.C0SZ8
    public final void h(boolean z) {
        ViewGroup viewGroup;
        IAdsPreviewService iAdsPreviewService;
        AwemeRawAd awemeRawAd;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList2;
        AssemSupervisor assemSupervisorLJFF = C724240Sb0.LJFF(this);
        if (assemSupervisorLJFF != null && (copyOnWriteArrayList2 = assemSupervisorLJFF.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList2) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LJL();
            }
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ((AbstractC738140SxQ) this.LLJJIJI.getValue());
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ2 : copyOnWriteArrayList) {
                if (abstractC738140SxQ2 instanceof InterfaceC691660RBc) {
                    arrayList2.add(abstractC738140SxQ2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((InterfaceC691660RBc) it3.next()).LJL();
            }
        }
        LLLIILIL().LIZ(C0RQ8.STOP);
        Aweme aweme = this.LLJJ;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            awemeRawAd.setReshowAd(true);
        }
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIIL(hashCode());
        Aweme aweme2 = this.LLJJ;
        if (aweme2 != null) {
            ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().TQ1(aweme2);
        }
        if (LLLIZZ().LJI(this.LLJJ, this.LLJJIII)) {
            LLLIZZ().LJJIII();
        }
        View view = this.LLJILJILJ.LIZ;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null && (iAdsPreviewService = (IAdsPreviewService) PluggableExtentionKt.pluggableSpi$default(IAdsPreviewService.class, false, false, false, 14, null)) != null) {
            iAdsPreviewService.LIZIZ(viewGroup);
        }
    }

    @C14EU
    public final void onLandPagePopupWebShowEvent(C691870RBx c691870RBx) {
        if (!this.LLJJJJJIL) {
            return;
        }
        if (c691870RBx.LIZ) {
            LLLIILIL().LIZ(C0RQ8.PAUSE);
        } else {
            LLLIILIL().LIZ(C0RQ8.RESUME);
        }
    }

    @Override // X.C0SZ8
    public final void p(int i) {
        if (this.LLJJJJ) {
            LLLIIL();
        }
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLLF == null) {
            this.LLLF = new ArrayList();
        }
        ((ArrayList) this.LLLF).add(interfaceC687730QyJ);
    }

    public AdCardViewHolder(C0RF0 c0rf0, C691490RAl c691490RAl) {
        super(c691490RAl);
        this.LLJILJILJ = c0rf0;
        this.LLJILLL = new ViewModelStore();
        this.LLJJI = new C0T23(c0rf0);
        this.LLJJIII = c0rf0.LJIIIZ;
        this.LLJJIJI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(471));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(470));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1588));
        this.LLJJJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(472));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1819));
        this.LLJJJJ = true;
        this.LLJJJJJIL = true;
    }

    @Override // X.C0SZ8
    public final void LJJJJ(int i, Aweme aweme) {
        LJI(aweme);
        if (aweme == null) {
            return;
        }
        VideoItemParams videoItemParamsNewBuilder = VideoItemParams.newBuilder();
        videoItemParamsNewBuilder.setAweme(aweme);
        LLJJJJLIIL(i, videoItemParamsNewBuilder, null);
    }
}
