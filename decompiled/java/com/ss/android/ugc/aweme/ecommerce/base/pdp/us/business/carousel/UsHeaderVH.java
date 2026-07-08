package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel;

import X.AnonymousClass0317;
import X.AnonymousClass0956;
import X.C01GW;
import X.C034S;
import X.C03GG;
import X.C04BL;
import X.C04DA;
import X.C04DB;
import X.C0H1U;
import X.C0I7R;
import X.C1054004Ag;
import X.C1120604Zw;
import X.C1260120ite;
import X.C13LP;
import X.C14EU;
import X.C1508390pM5;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C1713070ugD;
import X.C1743750vTh;
import X.C1745060vVo;
import X.C1748510vbN;
import X.C1748720vbi;
import X.C1753460vjM;
import X.C1757850vqR;
import X.C1758020vqi;
import X.C1758030vqj;
import X.C1762020vxA;
import X.C1762400vxm;
import X.C1762410vxn;
import X.C1762490vxv;
import X.C1762540vy0;
import X.C1762720vyI;
import X.C1762730vyJ;
import X.C1763000vyk;
import X.C1763010vyl;
import X.C1763720vzu;
import X.C1763800w02;
import X.C1763840w06;
import X.C1765590w2v;
import X.C1954807lC;
import X.C19ME;
import X.C1AQS;
import X.C21599719g3;
import X.C2217381BqS;
import X.C289740BXg;
import X.C419400GcU;
import X.C421950Ggb;
import X.C424040Gjy;
import X.C452501pT;
import X.C679280Qkg;
import X.C684570QtD;
import X.C712350Rwv;
import X.C954703oH;
import X.EnumC1508950pMz;
import X.InterfaceC10331042f;
import X.InterfaceC1748810vbr;
import X.InterfaceC1763080vys;
import X.InterfaceC1763730vzv;
import X.InterfaceC1766040w3e;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS59S0300000_26;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaFeature;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.SkuEntranceState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.SkuEntranceViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CreatorVideoItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CreatorVideoModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistJumpSchema;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.UsHeaderVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonutils.CommonUtilsDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils.ICommonUtilsDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS45S2100000_26;
import kotlin.jvm.internal.AwS4S2201000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class UsHeaderVH extends AbsFullSpanVH<C1762020vxA> implements InterfaceC1763730vzv, InterfaceC1766040w3e {
    public final ECBaseFragment LLJJIJIL;
    public final View LLJJJ;
    public C03GG LLJJJIL;
    public FrameLayout LLJJJJ;
    public C421950Ggb LLJJJJJIL;
    public C424040Gjy LLJJJJLIIL;
    public FrameLayout LLJJL;
    public C1762400vxm LLJJLIIIJLLLLLLLZ;
    public C1753460vjM LLJL;
    public C21599719g3 LLJLIL;
    public C1762730vyJ LLJLILLLLZIIL;
    public C419400GcU LLJLL;
    public C684570QtD LLJLLIL;
    public C1763800w02 LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public C1762720vyI LLL;
    public C0I7R LLLF;
    public Object LLLFF;
    public InterfaceC10331042f LLLFFI;
    public Boolean LLLFZ;
    public boolean LLLI;
    public TryOnData LLLII;
    public C1762020vxA LLLIIII;
    public AnonymousClass0956 LLLIIIIL;
    public final C1762540vy0 LLLIIIL;
    public C1762490vxv LLLIIL;
    public C1757850vqR LLLIILIL;
    public EnumC1508950pMz LLLIL;

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C1753460vjM D6() {
        View viewFindViewById = this.LLJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.video_control_button) : null;
            this.LLJL = (C1753460vjM) viewFindViewById;
        }
        return (C1753460vjM) viewFindViewById;
    }

    public final C1508390pM5 K6() {
        return (C1508390pM5) this.LLJZIJLIL.getValue();
    }

    public final PdpViewModel L6() {
        return (PdpViewModel) this.LLJZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ce A[Catch: Exception -> 0x089e, TRY_LEAVE, TryCatch #0 {Exception -> 0x089e, blocks: (B:123:0x03b3, B:125:0x03b7, B:132:0x03c4, B:134:0x03ce, B:128:0x03bc, B:130:0x03c0), top: B:299:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0926  */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.0vz9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9, types: [X.0vyT, android.view.View] */
    /* JADX WARN: Type inference failed for: r7v26, types: [X.0vyM, android.view.View, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d6() {
        /*
            Method dump skipped, instruction units count: 2347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.UsHeaderVH.d6():void");
    }

    public final FrameLayout h6() {
        View viewFindViewById = this.LLJJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cxb) : null;
            this.LLJJL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C1762400vxm i6() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ehy) : null;
            this.LLJJLIIIJLLLLLLLZ = (C1762400vxm) viewFindViewById;
        }
        return (C1762400vxm) viewFindViewById;
    }

    @Override // X.InterfaceC1763730vzv
    public final boolean isFullScreen() {
        Boolean bool = this.LLLFZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final FrameLayout q6() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ei4) : null;
            this.LLJJJJ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C1763800w02 r6() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.f9o) : null;
            this.LLJLLL = (C1763800w02) viewFindViewById;
        }
        return (C1763800w02) viewFindViewById;
    }

    public final C1762730vyJ u6() {
        View viewFindViewById = this.LLJLILLLLZIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.gdm) : null;
            this.LLJLILLLLZIIL = (C1762730vyJ) viewFindViewById;
        }
        return (C1762730vyJ) viewFindViewById;
    }

    public final C421950Ggb w6() {
        View viewFindViewById = this.LLJJJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.kl2) : null;
            this.LLJJJJJIL = (C421950Ggb) viewFindViewById;
        }
        return (C421950Ggb) viewFindViewById;
    }

    public final C424040Gjy z6() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.knz) : null;
            this.LLJJJJLIIL = (C424040Gjy) viewFindViewById;
        }
        return (C424040Gjy) viewFindViewById;
    }

    public final int C6() {
        List<MediaItem> list = X5().LLJ;
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

    public final int J6() {
        Iterator<MediaItem> it2 = X5().LLJ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().type == 2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab A[PHI: r5
      0x00ab: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String), (r5v3 java.lang.String), (r5v3 java.lang.String) binds: [B:37:0x00a8, B:11:0x0037, B:13:0x0041, B:15:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1763730vzv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJLI() {
        /*
            r12 = this;
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r4 = r12.L6()
            android.view.View r0 = r12.itemView
            android.content.Context r6 = r0.getContext()
            r4.getClass()
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r4.LLJILLL
            r9 = 0
            if (r0 == 0) goto Lad
            java.lang.String r0 = r0.productId
        L18:
            r2.append(r0)
            r0 = 95
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2.append(r0)
            java.lang.String r8 = X.C2188811AlT.LIZIZ(r2)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r1 = r4.LLJILLL
            if (r1 == 0) goto L94
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.HeaderSlideEntrance r0 = r1.headerSlideEntrance
            if (r0 == 0) goto La7
            java.lang.String r5 = r0.schemaLink
        L35:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.HeaderSlideEntrance r0 = r1.headerSlideEntrance
            if (r0 == 0) goto Lab
            java.lang.Integer r2 = r0.schemaType
            X.04C4 r0 = X.C04C4.FIND_SIMILAR
            int r1 = r0.getValue()
            if (r2 == 0) goto Lab
            int r0 = r2.intValue()
            if (r0 != r1) goto Lab
            X.0vjr r3 = X.C1753770vjr.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r2 = r4.LLJILLL
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r0 = r4.Pv0()
            if (r0 == 0) goto La5
            java.lang.String r1 = r0.skuId
        L55:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r4.LLJI
            if (r0 == 0) goto La3
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.trackParams
        L5b:
            r3.getClass()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.utils.SimilarCacheData r11 = X.C1753770vjr.LIZIZ(r8, r2, r1, r0)
        L62:
            if (r5 == 0) goto L94
            X.0vjr r2 = X.C1753770vjr.LIZ
            X.04Ae r1 = r4.LLILZIL
            java.lang.String r0 = "c2087.d4069"
            java.lang.String r7 = r1.LJII(r0, r5, r9)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r4.LLJI
            if (r0 == 0) goto L74
            java.util.Map<java.lang.String, java.lang.Object> r9 = r0.trackParams
        L74:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r10 = r4.LLJILLL
            r2.getClass()
            X.C1753770vjr.LIZJ(r6, r7, r8, r9, r10, r11)
            X.04Ag r0 = r4.LLJLILLLLZIIL
            if (r0 == 0) goto L94
            X.0vbr r2 = r0.LJJIJLIJ()
            if (r2 == 0) goto L94
            X.04Bi r1 = new X.04Bi
            r1.<init>()
            r0 = 751(0x2ef, float:1.052E-42)
            kotlin.jvm.internal.AFwS268S0000000_26 r0 = kotlin.jvm.internal.AFwS268S0000000_26.get$arr$(r0)
            X.C1748720vbi.LIZIZ(r2, r1, r0)
        L94:
            android.view.View r3 = r12.itemView
            Y.ARunnableS126S0100000_26 r2 = new Y.ARunnableS126S0100000_26
            r0 = 32
            r2.<init>(r12, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r3, r2, r0)
            return
        La3:
            r0 = r9
            goto L5b
        La5:
            r1 = r9
            goto L55
        La7:
            r5 = r9
            if (r1 == 0) goto Lab
            goto L35
        Lab:
            r11 = r9
            goto L62
        Lad:
            r0 = r9
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.UsHeaderVH.LJJLJLI():void");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void P5() {
        super.P5();
        K6().pause();
    }

    public final void S6() {
        Video video;
        C1762020vxA c1762020vxAX5 = X5();
        C1054004Ag c1054004Ag = L6().LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            int iJ6 = J6();
            int iJ62 = J6();
            Integer num = c1762020vxAX5.LLJI;
            if (num == null) {
                num = 0;
            }
            boolean z = iJ62 == num.intValue();
            String str = !L6().LLJJIJIL ? "main" : "viewer";
            MediaItem mediaItem = (MediaItem) C13LP.LJJJLZIJ(J6(), c1762020vxAX5.LLJ);
            c1054004Ag.LJIJJ(str, iJ6, (mediaItem == null || (video = mediaItem.video) == null) ? null : video.id, K6().LJIJJLI ? "auto" : "manual", (int) K6().LJIILJJIL, K6().LIZLLL(), z, L6().iH1(null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T6() {
        /*
            r5 = this;
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "ec_pdp_fix_default_selection_from_video_config_old_header"
            r4 = 1
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r4)
            if (r0 == 0) goto L64
            java.lang.Object r3 = r5.X5()
            X.0vxA r3 = (X.C1762020vxA) r3
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r5.L6()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r0.LLJILLL
            r2 = 0
            if (r0 == 0) goto L3b
            boolean r0 = r0.LJII()
            if (r0 != r4) goto L3b
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r5.L6()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r1 = r0.LLJILLL
            if (r1 == 0) goto L67
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r5.L6()
            java.lang.Integer r0 = r0.AR2()
            boolean r0 = r1.LJIIIIZZ(r0)
            if (r0 != r4) goto L67
        L3b:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r5.L6()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r1 = r0.LLJILLL
            if (r1 == 0) goto L55
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r5.L6()
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r0 = r0.Pv0()
            if (r0 == 0) goto L65
            java.lang.String[] r0 = r0.checkedSkuIds
        L4f:
            java.lang.Integer r2 = X.C041Y.LIZ(r1, r0)
            if (r2 != 0) goto L5b
        L55:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r5.L6()
            java.lang.Integer r2 = r0.LLLILZLLLI
        L5b:
            Y.ARunnableS59S0300000_26 r1 = new Y.ARunnableS59S0300000_26
            r0 = 0
            r1.<init>(r3, r5, r2, r0)
            X.C1260120ite.LIZIZ(r1)
        L64:
            return
        L65:
            r0 = 0
            goto L4f
        L67:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.UsHeaderVH.T6():void");
    }

    public final boolean V6() {
        MediaFeature mediaFeature;
        C1763720vzu viewPager;
        List<CreatorVideoItem> list;
        C1762020vxA c1762020vxAX5 = X5();
        boolean z = c1762020vxAX5.LLJJI != null;
        CreatorVideoModel creatorVideoModel = c1762020vxAX5.LLJJIII;
        boolean z2 = (creatorVideoModel == null || (list = creatorVideoModel.videos) == null || !(list.isEmpty() ^ true)) ? false : true;
        C1762400vxm c1762400vxmI6 = i6();
        int currentItem = (c1762400vxmI6 == null || (viewPager = c1762400vxmI6.getViewPager()) == null) ? 0 : viewPager.getCurrentItem();
        boolean z3 = currentItem != J6();
        MediaItem mediaItem = (MediaItem) C13LP.LJJJLZIJ(currentItem, c1762020vxAX5.LLJ);
        return z && z2 && z3 && ((mediaItem != null && (mediaFeature = mediaItem.mediaFeature) != null && mediaFeature.getType() == 1) ^ true);
    }

    public final boolean a7() {
        C1762400vxm c1762400vxmI6;
        C1763720vzu viewPager;
        Integer numValueOf;
        C1762020vxA c1762020vxAX5 = X5();
        if (!c1762020vxAX5.LLJJ && !c1762020vxAX5.LLJJIJIIJIL && !V6() && ((c1762020vxAX5.LLJJI == null || c1762020vxAX5.LLJJIJI) && (c1762400vxmI6 = i6()) != null && (viewPager = c1762400vxmI6.getViewPager()) != null && (numValueOf = Integer.valueOf(viewPager.getCurrentItem())) != null)) {
            if (numValueOf.intValue() != J6() && Intrinsics.LJFF(this.LLLFZ, Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public final void c6() {
        IECommerceHostService iECommerceHostService;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1763720vzu viewPager;
        C1763720vzu viewPager2;
        ViewGroup.LayoutParams layoutParams = null;
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
            C1762400vxm c1762400vxmI6 = i6();
            if (c1762400vxmI6 != null && (viewPager2 = c1762400vxmI6.getViewPager()) != null) {
                layoutParams = viewPager2.getLayoutParams();
            }
            if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            marginLayoutParams.height = C679280Qkg.LIZ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            C1762400vxm c1762400vxmI62 = i6();
            if (c1762400vxmI62 == null || (viewPager = c1762400vxmI62.getViewPager()) == null) {
                return;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewPager);
            viewPager.setLayoutParams(marginLayoutParams);
        }
    }

    public final void f6() {
        C1763720vzu viewPager;
        MediaItem mediaItem;
        MediaFeature mediaFeatureLIZ;
        C1762400vxm c1762400vxmI6 = i6();
        if (c1762400vxmI6 == null || (viewPager = c1762400vxmI6.getViewPager()) == null || (mediaItem = (MediaItem) C13LP.LJJJLZIJ(viewPager.getCurrentItem(), X5().LLJ)) == null || (mediaFeatureLIZ = mediaItem.LIZ()) == null || mediaFeatureLIZ.getCanShowFindSimilarBtn()) {
            C684570QtD c684570QtDV6 = v6();
            if (c684570QtDV6 != null) {
                c684570QtDV6.LIZLLL(L6().LLJJIJIL);
                return;
            }
            return;
        }
        C684570QtD c684570QtDV62 = v6();
        if (c684570QtDV62 != null) {
            c684570QtDV62.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        AnonymousClass0317 anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin;
        super.onCreate();
        SkuEntranceViewModel skuEntranceViewModel = L6().LLLIL;
        C1763000vyk c1763000vyk = new C2217381BqS() { // from class: X.0vyk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuEntranceState) obj).getSelectImage();
            }
        };
        C1763010vyl c1763010vyl = new C2217381BqS() { // from class: X.0vyl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuEntranceState) obj).getForceRefresh();
            }
        };
        AwS640S0100000_26 awS640S0100000_26 = new AwS640S0100000_26(this, 22);
        skuEntranceViewModel.getClass();
        JediViewModel.aR2(skuEntranceViewModel, c1763000vyk, c1763010vyl, null, new AwS640S0100000_26(awS640S0100000_26, 123), 4, null);
        L6().hR2(new C2217381BqS() { // from class: X.0vsg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getFlashSaleCountDown();
            }
        }, new AwS605S0100000_26(this, 222));
        IPdpStarter.PdpEnterParam pdpEnterParam = L6().LLJI;
        this.LLLFZ = pdpEnterParam != null ? Boolean.valueOf(pdpEnterParam.fullScreen) : null;
        L6().hR2(new C2217381BqS() { // from class: X.0vnJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((PdpMainState) obj).isFullScreen());
            }
        }, new AwS605S0100000_26(this, 223));
        L6().hR2(new C2217381BqS() { // from class: X.0vnG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((PdpMainState) obj).getBottomSheetSlideOffset());
            }
        }, new AwS605S0100000_26(this, 224));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin = CommonUtilsDependencyService.createICommonUtilsDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ICommonUtilsDependencyService.class.getName(), anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonUtilsDependencyService.class);
        }
        ((ICommonUtilsDependencyService) anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin).getConfigurationChangedManager().LIZ(C1745060vVo.LIZ(this.LLJJIJIL), this);
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        AnonymousClass0317 anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin;
        Video video;
        C1054004Ag c1054004Ag;
        C1743750vTh.LIZ(this);
        MediaItem mediaItem = (MediaItem) C13LP.LJJJLZIJ(J6(), X5().LLJ);
        if (mediaItem != null && (video = mediaItem.video) != null) {
            Aweme awemeLIZ = video.LIZ();
            if (awemeLIZ.getVideo() != null && (c1054004Ag = L6().LLJLILLLLZIIL) != null) {
                String aid = awemeLIZ.getAid();
                int i = (int) K6().LJIILJJIL;
                Integer numValueOf = Integer.valueOf(J6());
                InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
                if (interfaceC1748810vbrLJJIJLIJ != null) {
                    C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04BL(), new AwS4S2201000_26(c1054004Ag, "head_pic", aid, i, numValueOf, 3));
                }
            }
        }
        C1757850vqR c1757850vqR = this.LLLIILIL;
        if (c1757850vqR != null) {
            c1757850vqR.LIZIZ();
        }
        this.LLLIILIL = null;
        C1762410vxn headerPagerAdapter = i6().getHeaderPagerAdapter();
        if (headerPagerAdapter != null) {
            C1765590w2v c1765590w2v = headerPagerAdapter.LLJJL;
            if (c1765590w2v != null) {
                c1765590w2v.LIZ(true);
            }
            C1508390pM5 c1508390pM5 = headerPagerAdapter.LLJ;
            SurfaceTexture surfaceTexture = c1508390pM5.LIZJ;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            c1508390pM5.LIZJ = null;
        }
        C1762490vxv c1762490vxv = this.LLLIIL;
        if (c1762490vxv != null) {
            c1762490vxv.LIZ();
        }
        this.LLLIIL = null;
        C1713070ugD.LIZIZ(this);
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

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onPause() {
        K6().pause();
    }

    public final C684570QtD v6() {
        if (!C289740BXg.LIZ()) {
            return null;
        }
        View view = this.LLJLLIL;
        if (view == null) {
            View view2 = this.itemView;
            View viewFindViewById = view2 != null ? view2.findViewById(R.id.hys) : null;
            this.LLJLLIL = (C684570QtD) viewFindViewById;
            view = viewFindViewById;
        }
        return (C684570QtD) view;
    }

    public final void U6(int i) {
        C1762730vyJ c1762730vyJU6 = u6();
        int visibility = c1762730vyJU6.getVisibility();
        c1762730vyJU6.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1762730vyJU6);
    }

    public final void b7(int i) {
        Integer numValueOf;
        if (!a7()) {
            C684570QtD c684570QtDV6 = v6();
            if (c684570QtDV6 != null) {
                c684570QtDV6.LIZ();
                return;
            }
            return;
        }
        C684570QtD c684570QtDV62 = v6();
        if (c684570QtDV62 != null) {
            c684570QtDV62.setCurrentIndex(i);
        }
        if (!Intrinsics.LJFF(this.LLLFZ, Boolean.TRUE)) {
            return;
        }
        MediaItem mediaItem = (MediaItem) C13LP.LJJJLZIJ(i, X5().LLJ);
        if (mediaItem != null && (numValueOf = Integer.valueOf(mediaItem.type)) != null && numValueOf.intValue() == 1) {
            f6();
            return;
        }
        C684570QtD c684570QtDV63 = v6();
        if (c684570QtDV63 == null) {
            return;
        }
        c684570QtDV63.LIZ();
    }

    public final void e6(ImageSelectData imageSelectData) {
        C04DA c04da;
        Integer numValueOf;
        String uri;
        String uri2;
        C1762020vxA c1762020vxAX5 = X5();
        if (imageSelectData.from == C04DB.HEAD_PAGER || (c04da = imageSelectData.source) == C04DA.PRODUCT) {
            return;
        }
        if (c04da == C04DA.SKC) {
            K6().pause();
            C712350Rwv.LIZ(i6().getCommerceHeaderPagerFromXml(), 0);
            return;
        }
        if (c1762020vxAX5.LLJ.isEmpty()) {
            return;
        }
        Iterator<MediaItem> it2 = c1762020vxAX5.LLJ.iterator();
        int i = 0;
        while (true) {
            numValueOf = null;
            if (it2.hasNext()) {
                MediaItem next = it2.next();
                if (next.type == 1) {
                    Image image = next.image;
                    if (image != null) {
                        uri = image.getUri();
                    } else {
                        uri = null;
                    }
                    Image image2 = imageSelectData.image;
                    if (image2 != null) {
                        uri2 = image2.getUri();
                    } else {
                        uri2 = null;
                    }
                    if (Intrinsics.LJFF(uri, uri2)) {
                        break;
                    }
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (imageSelectData.index < 0) {
            numValueOf = 0;
        } else if (i >= 0) {
            numValueOf = Integer.valueOf(i);
        }
        C1260120ite.LIZIZ(new ARunnableS59S0300000_26(c1762020vxAX5, this, numValueOf, 10));
    }

    public final void h7(int i) {
        boolean z;
        MediaFeature mediaFeatureLIZ;
        int i2 = i + 1;
        L6().LLLZI = i2;
        if (!this.LLLI) {
            return;
        }
        C1762020vxA c1762020vxAX5 = X5();
        MediaItem mediaItem = (MediaItem) C13LP.LJJJLZIJ(i, c1762020vxAX5.LLJ);
        if (mediaItem != null && mediaItem.type == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1763840w06 c1763840w06 = (C1763840w06) C1748510vbN.LIZ(this, R.id.yln);
            if (c1763840w06 != null) {
                c1763840w06.h0();
                return;
            }
            return;
        }
        MediaItem mediaItem2 = (MediaItem) C13LP.LJJJLZIJ(i, c1762020vxAX5.LLJ);
        if (mediaItem2 != null && (mediaFeatureLIZ = mediaItem2.LIZ()) != null && !mediaFeatureLIZ.getCanShowTryOnBtn()) {
            View viewLIZ = C1748510vbN.LIZ(this, R.id.yln);
            if (viewLIZ == null) {
                return;
            }
            C0H1U.LIZIZ(viewLIZ);
            return;
        }
        C1763840w06 c1763840w062 = (C1763840w06) C1748510vbN.LIZ(this, R.id.yln);
        if (c1763840w062 == null) {
            return;
        }
        c1763840w062.setProductPicIndex(i2);
        C1763840w06.e0(c1763840w062);
    }

    @C14EU(sticky = true)
    public final void onPdpEnterAnimStateChange(C1758030vqj c1758030vqj) {
        int i = C1758020vqi.LIZ[c1758030vqj.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C1762400vxm c1762400vxmI6 = i6();
                int visibility = c1762400vxmI6.getVisibility();
                c1762400vxmI6.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c1762400vxmI6);
                return;
            }
            throw new C1954807lC();
        }
        C1762400vxm c1762400vxmI62 = i6();
        int visibility2 = c1762400vxmI62.getVisibility();
        c1762400vxmI62.setVisibility(4);
        C1602160rnK.LIZIZ(visibility2, 4, c1762400vxmI62);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0345  */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 1551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.UsHeaderVH.rr(java.lang.Object):void");
    }

    @Override // X.InterfaceC1766040w3e
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        c6();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0vy0] */
    public UsHeaderVH(ViewGroup viewGroup, ECBaseFragment eCBaseFragment, View view) {
        View viewLIZ;
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            viewLIZ = C954703oH.LIZ(viewGroup.getContext(), R.layout.as1, viewGroup, false);
        } else {
            viewLIZ = view;
        }
        super(viewLIZ);
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJJ = view;
        this.LLJZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 448));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 447));
        this.LLLIIIL = new InterfaceC1763080vys() { // from class: X.0vy0
            @Override // X.InterfaceC1763080vys
            public final void LIZIZ(String str, String str2) {
                C1748720vbi.LIZLLL(this.LIZ.itemView, new C049G(), new AwS45S2100000_26(str, this.LIZ, str2, 2));
            }

            @Override // X.InterfaceC1763080vys
            public final void LIZ(Context context, WaistJumpSchema waistJumpSchema, String str, String str2) {
                C1748720vbi.LIZLLL(this.LIZ.itemView, new C049H(), new AwS45S2100000_26(str, this.LIZ, str2, 1));
                C10288040o c10288040o = (C10288040o) this.LIZ.L6().LLLLLLL.getValue();
                UsHeaderVH usHeaderVH = this.LIZ;
                c10288040o.LIZ(usHeaderVH.LLJJIJIL, context, usHeaderVH.L6().LLJI, waistJumpSchema, this.LIZ.L6().iH1(Integer.valueOf(this.LIZ.L6().Tg2())), str2);
            }
        };
        this.LLLIL = EnumC1508950pMz.PLAYER_IDLE;
    }
}
