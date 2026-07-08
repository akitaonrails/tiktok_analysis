package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.header;

import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C03GF;
import X.C1054104Ah;
import X.C1120604Zw;
import X.C11EA;
import X.C13LE;
import X.C13LP;
import X.C1508390pM5;
import X.C1697810uHb;
import X.C1743750vTh;
import X.C1745060vVo;
import X.C1750140ve0;
import X.C1753460vjM;
import X.C1755600vmo;
import X.C1762030vxB;
import X.C1762420vxo;
import X.C1762780vyO;
import X.C1762790vyP;
import X.C1763710vzt;
import X.C1764030w0P;
import X.C1765590w2v;
import X.C19719612Di;
import X.C19719912Dl;
import X.C19ME;
import X.C1AQS;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C679280Qkg;
import X.C786410Ut5;
import X.C814420VxA;
import X.C959603p4;
import X.EnumC1508950pMz;
import X.InterfaceC1755440vmY;
import X.InterfaceC1755830vnB;
import X.InterfaceC1763740vzw;
import X.InterfaceC1766040w3e;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS126S0100000_26;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.SkuEntranceState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonutils.CommonUtilsDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils.ICommonUtilsDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpHeadViewHolder extends AbsFullSpanVH<C1762030vxB> implements InterfaceC1763740vzw, InterfaceC1766040w3e, InterfaceC1755440vmY, InterfaceC1755830vnB {
    public static final int LLLIILIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    public static final int LLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
    public final Fragment LLJJIJIL;
    public C03GF LLJJJ;
    public C959603p4 LLJJJIL;
    public C1763710vzt LLJJJJ;
    public C1762790vyP LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public C1753460vjM LLJJL;
    public final C1763710vzt LLJJLIIIJLLLLLLLZ;
    public final TextView LLJL;
    public final C01GW LLJLIL;
    public int LLJLILLLLZIIL;
    public boolean LLJLL;
    public Boolean LLJLLIL;
    public int LLJLLL;
    public int LLJZ;
    public Boolean LLJZIJLIL;
    public boolean LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public C1762780vyO LLLFFI;
    public final Set<String> LLLFZ;
    public final Set<String> LLLI;
    public EnumC1508950pMz LLLII;
    public C1764030w0P LLLIIII;
    public Integer LLLIIIIL;
    public volatile boolean LLLIIIL;
    public volatile boolean LLLIIL;

    @Override // X.InterfaceC1755830vnB
    public final void LJJLIIIJJIZ() {
    }

    @Override // X.InterfaceC1755830vnB
    public final void R4() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onStop() {
        b6(null);
        C1764030w0P c1764030w0P = this.LLLIIII;
        if (c1764030w0P != null) {
            C1764030w0P.LJ(c1764030w0P, false, false, 3);
        }
    }

    @Override // X.InterfaceC1755440vmY
    public final void onViewAttachedToWindow() {
    }

    @Override // X.InterfaceC1755440vmY
    public final void onViewDetachedFromWindow() {
    }

    public final C03GF d6() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cxs) : null;
            this.LLJJJ = (C03GF) viewFindViewById;
        }
        return (C03GF) viewFindViewById;
    }

    public final C959603p4 e6() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.h7k) : null;
            this.LLJJJIL = (C959603p4) viewFindViewById;
        }
        return (C959603p4) viewFindViewById;
    }

    public final C1763710vzt f6() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.egr) : null;
            this.LLJJJJ = (C1763710vzt) viewFindViewById;
        }
        return (C1763710vzt) viewFindViewById;
    }

    public final C1762420vxo h6() {
        return (C1762420vxo) this.LLLFF.getValue();
    }

    public final FrameLayout i6() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.oxs) : null;
            this.LLJJJJLIIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    @Override // X.InterfaceC1763740vzw
    public final boolean isFullScreen() {
        Boolean bool = this.LLJLLIL;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onPause() {
        C1764030w0P c1764030w0P = this.LLLIIII;
        if (c1764030w0P != null) {
            C1764030w0P.LJ(c1764030w0P, false, false, 3);
        }
        if (v6().LJI()) {
            v6().pause();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        C1764030w0P c1764030w0P;
        if (this.LLJLILLLLZIIL == u6() && v6().LJIILLIIL == EnumC1508950pMz.PLAYER_PAUSE && !v6().LJIJ) {
            v6().resume();
        } else if (this.LLLIIIL && this.LLLIIL && (c1764030w0P = this.LLLIIII) != null) {
            c1764030w0P.LIZLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int q6() {
        List<MediaItem> list = ((C1762030vxB) this.LLILLJJLI).LLILZLL;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<MediaItem> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next().type == 2 && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int u6() {
        Iterator<MediaItem> it2 = ((C1762030vxB) this.LLILLJJLI).LLILZLL.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().type == 2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final C1508390pM5 v6() {
        return (C1508390pM5) this.LLLF.getValue();
    }

    public final SeaPdpViewModel w6() {
        return (SeaPdpViewModel) this.LLJLIL.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void I5() {
        C1764030w0P c1764030w0P;
        super.I5();
        if (this.LLJLILLLLZIIL == u6() && v6().LJIILLIIL == EnumC1508950pMz.PLAYER_PAUSE && !v6().LJIJ) {
            v6().resume();
        } else if (this.LLLIIIL && this.LLLIIL && (c1764030w0P = this.LLLIIII) != null) {
            c1764030w0P.LIZLLL();
        }
    }

    @Override // X.InterfaceC1763740vzw
    public final void LJJLJLI() {
        w6().bS2(this.itemView.getContext(), null);
        HandlerHook.viewPostDelay(this.itemView, new ARunnableS126S0100000_26(this, 27), 1000L);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void P5() {
        super.P5();
        C1764030w0P c1764030w0P = this.LLLIIII;
        if (c1764030w0P != null) {
            C1764030w0P.LJ(c1764030w0P, false, false, 3);
        }
        if (v6().LJI()) {
            v6().pause();
        }
    }

    public final void c6() {
        IECommerceHostService iECommerceHostService;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isPad()) {
            ViewGroup.LayoutParams layoutParams = this.LLJJLIIIJLLLLLLLZ.getLayoutParams();
            if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            marginLayoutParams.height = C679280Qkg.LIZ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            C1763710vzt c1763710vzt = this.LLJJLIIIJLLLLLLLZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1763710vzt);
            c1763710vzt.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        AnonymousClass0317 anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin;
        super.onCreate();
        C1750140ve0.LIZ(this.itemView, false);
        IPdpStarter.PdpEnterParam pdpEnterParam = w6().LLIZ;
        this.LLJLLIL = pdpEnterParam != null ? Boolean.valueOf(pdpEnterParam.fullScreen) : null;
        v6().LIZIZ = Intrinsics.LJFF(this.LLJLLIL, Boolean.TRUE);
        w6().hR2(new C2217381BqS() { // from class: X.0vnI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((SeaPdpMainState) obj).isFullScreen());
            }
        }, new AwS605S0100000_26(this, 205));
        w6().hR2(new C2217381BqS() { // from class: X.0vnF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((SeaPdpMainState) obj).getBottomSheetSlideOffset());
            }
        }, new AwS605S0100000_26(this, 206));
        C11EA.LJII(this, w6().LLLILZ, new C2217381BqS() { // from class: X.0vyj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuEntranceState) obj).getSelectImage();
            }
        }, new AwS640S0100000_26(this, 20));
        w6().hR2(new C2217381BqS() { // from class: X.0vnE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((SeaPdpMainState) obj).getScrollOffset());
            }
        }, new AwS605S0100000_26(this, 207));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin = CommonUtilsDependencyService.createICommonUtilsDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ICommonUtilsDependencyService.class.getName(), anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonUtilsDependencyService.class);
        }
        ((ICommonUtilsDependencyService) anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin).getConfigurationChangedManager().LIZ(C1745060vVo.LIZ(this), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        AnonymousClass0317 anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin;
        Video video;
        C1054104Ah c1054104Ah;
        C1743750vTh.LIZ(this);
        C19719612Di.LJJIIJ(w6().LLLLJI.LLILLJJLI.LIZ.LIZ, new AwS605S0100000_26((InterfaceC1755830vnB) this, 679), true);
        C1764030w0P c1764030w0P = this.LLLIIII;
        if (c1764030w0P != null) {
            c1764030w0P.LIZJ();
        }
        this.LLLIIII = null;
        MediaItem mediaItem = (MediaItem) C13LP.LJJJLZIJ(u6(), ((C1762030vxB) this.LLILLJJLI).LLILZLL);
        if (mediaItem != null && (video = mediaItem.video) != null) {
            Aweme awemeLIZ = video.LIZ();
            if (awemeLIZ.getVideo() != null && (c1054104Ah = w6().LLJLIL) != null) {
                C1054104Ah.LJJIJ(c1054104Ah, awemeLIZ.getAid(), (int) v6().LJIILJJIL, "head_pic");
            }
        }
        C1762420vxo c1762420vxoH6 = h6();
        C1765590w2v c1765590w2v = c1762420vxoH6.LLJJJIL;
        if (c1765590w2v != null) {
            c1765590w2v.LIZ(true);
        }
        C1508390pM5 c1508390pM5 = c1762420vxoH6.LLJ;
        SurfaceTexture surfaceTexture = c1508390pM5.LIZJ;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        c1508390pM5.LIZJ = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin = CommonUtilsDependencyService.createICommonUtilsDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ICommonUtilsDependencyService.class.getName(), anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonUtilsDependencyService.class);
        }
        ((ICommonUtilsDependencyService) anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin).getConfigurationChangedManager().LIZIZ(this);
    }

    public final void C6(int i) {
        C1762780vyO c1762780vyO = this.LLLFFI;
        if (c1762780vyO != null && !c1762780vyO.LIZ() && this.LLJLILLLLZIIL < this.LLJZ) {
            C786410Ut5.LLIL(this.LLJL, 0);
        }
        C1762780vyO c1762780vyO2 = this.LLLFFI;
        if (c1762780vyO2 != null && c1762780vyO2.LIZ()) {
            c1762780vyO2.LIZJ.setVisible(true);
        }
    }

    @Override // X.InterfaceC1755830vnB
    public final void F0(boolean z) {
        C1764030w0P c1764030w0P;
        this.LLLIIL = z;
        if (this.LLLIIIL) {
            if (!z) {
                C1764030w0P c1764030w0P2 = this.LLLIIII;
                if (c1764030w0P2 != null) {
                    C1764030w0P.LJ(c1764030w0P2, true, false, 2);
                    return;
                }
                return;
            }
            if ((this.LLJLILLLLZIIL == u6() && v6().LJI()) || (c1764030w0P = this.LLLIIII) == null) {
                return;
            }
            c1764030w0P.LIZLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0202  */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.header.SeaPdpHeadViewHolder.rr(java.lang.Object):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaPdpHeadViewHolder(ViewGroup viewGroup, ECBaseFragment eCBaseFragment) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.awg, context, viewGroup, false, true));
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJLIIIJLLLLLLLZ = (C1763710vzt) this.itemView.findViewById(R.id.egr);
        this.LLJL = (TextView) this.itemView.findViewById(R.id.kla);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJLIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 109));
        this.LLJLL = true;
        this.LLJLLL = -1;
        this.LLJZIJLIL = Boolean.FALSE;
        this.LLLF = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(125));
        this.LLLFF = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1246));
        this.LLLFZ = new LinkedHashSet();
        this.LLLI = new LinkedHashSet();
        this.LLLII = EnumC1508950pMz.PLAYER_IDLE;
        this.LLLIIL = true;
    }

    @Override // X.InterfaceC1766040w3e
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        c6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z6(MediaItem mediaItem, int i) {
        String uri;
        boolean z;
        String str;
        boolean z2;
        String str2;
        Integer sourceType;
        String str3;
        boolean z3;
        ProductBase productBase;
        int i2 = mediaItem.type;
        String uri2 = "";
        String str4 = null;
        if (i2 == 1) {
            Image image = mediaItem.image;
            if (image == null || (uri = image.getUri()) == null) {
                return;
            }
        } else if (i2 == 2) {
            uri = "";
        } else {
            return;
        }
        if (!this.LLLFZ.contains(uri)) {
            this.LLLFZ.add(uri);
            C1762030vxB c1762030vxB = (C1762030vxB) this.LLILLJJLI;
            if (c1762030vxB.LLILLL && i == c1762030vxB.LL.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            String str5 = CardStruct.IStatusCode.DEFAULT;
            if (z) {
                str = "size_guide";
            } else {
                str = mediaItem.category;
                if (str == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
            }
            C1054104Ah c1054104Ah = w6().LLJLIL;
            if (c1054104Ah != null) {
                Integer num = ((C1762030vxB) this.LLILLJJLI).LLIZ;
                if (num == null) {
                    num = 0;
                }
                if (i == num.intValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                if (h6().LLJJLIIIJLLLLLLLZ) {
                    str2 = "viewer";
                } else {
                    str2 = "main";
                }
                Image image2 = mediaItem.image;
                if (image2 != null) {
                    sourceType = image2.getSourceType();
                } else {
                    sourceType = null;
                }
                ProductPackStruct productPackStruct = w6().LLJIJIL;
                if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
                    str3 = productBase.categoryId;
                } else {
                    str3 = null;
                }
                String strR6 = r6(i, mediaItem.type, str);
                PageFinder pageFinderVia = PageFinder.via(this.LLJJIJIL);
                if (z) {
                    str5 = "size_guide";
                } else {
                    String str6 = mediaItem.category;
                    if (str6 != null) {
                        str5 = str6;
                    }
                }
                int i3 = mediaItem.type;
                if (i3 == 1) {
                    Image image3 = mediaItem.image;
                    if (image3 != null && (uri2 = image3.getUri()) != null && uri2.length() != 0) {
                        z3 = false;
                        if (uri2 == null) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    if (i3 != 2) {
                        return;
                    }
                    Video video = mediaItem.video;
                    if (video != null) {
                        str4 = video.id;
                    }
                    str5 = "video";
                    z3 = true;
                }
                c1054104Ah.LJJIJIIJIL(uri2, str5, "head_pic", z3, Integer.valueOf(i), boolValueOf, str4, str2, sourceType, str3, strR6, pageFinderVia);
            }
        }
    }

    public static String r6(int i, int i2, String str) {
        if (i2 == 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("c54417.d93546_i");
            sbLIZ.append(i);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (Intrinsics.LJFF(str, "spu_image")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("c54417.d11256_i");
            sbLIZ2.append(i);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (Intrinsics.LJFF(str, "size_guide")) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("c54417.d8413_i");
            sbLIZ3.append(i);
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        return "";
    }
}
