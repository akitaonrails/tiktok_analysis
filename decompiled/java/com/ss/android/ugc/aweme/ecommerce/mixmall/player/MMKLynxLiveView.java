package com.ss.android.ugc.aweme.ecommerce.mixmall.player;

import X.AnonymousClass0317;
import X.C034S;
import X.C0BAH;
import X.C0H9H;
import X.C0PEM;
import X.C1120604Zw;
import X.C1120704Zx;
import X.C1289960jfm;
import X.C1298720jtu;
import X.C1311730kEt;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1334210kp9;
import X.C1388190mED;
import X.C1768420w7U;
import X.C1768550w7h;
import X.C1771440wCM;
import X.C1773330wFP;
import X.C1773610wFr;
import X.C1774840wHq;
import X.C1775180wIO;
import X.C1775190wIP;
import X.C1775330wId;
import X.C1775560wJ0;
import X.C1775570wJ1;
import X.C1775600wJ4;
import X.C1851070yGn;
import X.C1ACD;
import X.C1AEE;
import X.C1AEJ;
import X.C1AEV;
import X.C1AQS;
import X.C1DFH;
import X.C20160313uT;
import X.C20161913uj;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2126308Ur;
import X.C2188811AlT;
import X.C2272921Dxq;
import X.C2296808zG;
import X.C23250099c;
import X.C314740CVk;
import X.C418601k0;
import X.C599820Nfo;
import X.C770702zh;
import X.C786410Ut5;
import X.C817503Hh;
import X.EnumC1769850w9n;
import X.EnumC1775410wIl;
import X.EnumC1782850wUl;
import X.EnumC1782940wUu;
import X.EnumC2176021AEe;
import X.InterfaceC1312540kGC;
import X.InterfaceC1699420uKC;
import X.InterfaceC1773310wFN;
import X.InterfaceC1773850wGF;
import X.InterfaceC1773890wGJ;
import X.InterfaceC1775450wIp;
import X.InterfaceC1967107nB;
import X.InterfaceC2175541ACi;
import X.InterfaceC2272941Dxs;
import X.InterfaceC2272961Dxu;
import X.InterfaceC464060IHs;
import X.InterfaceC497601wk;
import Y.ARunnableS128S0100000_28;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.player.MMKLynxLiveView;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import j27.s;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS38S2200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class MMKLynxLiveView extends LynxUI<C1AEE> implements View.OnAttachStateChangeListener, InterfaceC2272941Dxs, InterfaceC2272961Dxu {
    public static boolean LLLFFI = true;
    public static boolean LLLFZ;
    public RemoteImageView LL;
    public TextView LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public volatile boolean LLJI;
    public volatile boolean LLJIJIL;
    public volatile long LLJILJIL;
    public volatile boolean LLJILJILJ;
    public volatile boolean LLJILLL;
    public C1775600wJ4 LLJJ;
    public C1775570wJ1 LLJJI;
    public C1773610wFr<C1773330wFP> LLJJIII;
    public C2272921Dxq LLJJIJI;
    public InterfaceC1773850wGF LLJJIJIIJIL;
    public volatile boolean LLJJIJIL;
    public volatile boolean LLJJJ;
    public volatile boolean LLJJJIL;
    public Long LLJJJJ;
    public C1768420w7U LLJJJJJIL;
    public volatile boolean LLJJJJLIIL;
    public volatile C1851070yGn LLJJL;
    public C1AEE LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public String LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;
    public Long LLJLLIL;
    public Long LLJLLL;
    public Long LLJZ;
    public String LLJZIJLIL;
    public String LLL;
    public String LLLF;
    public String LLLFF;

    static {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            LLLFZ = Keva.getRepo("ecom_keva_store").getBoolean("_debug_mix_mall_live_video_debug_view", false);
        }
    }

    public MMKLynxLiveView() {
        throw null;
    }

    public final void LJJJJ() {
        InterfaceC497601wk lifecycleScope;
        InterfaceC2175541ACi interfaceC2175541ACi;
        C1ACD livePlayHelper;
        C1ACD livePlayHelper2;
        C1ACD livePlayHelper3;
        Integer numValueOf = null;
        if (!this.LLJJIJIL) {
            LJJJJJ("not allowPlay");
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MMKLive ");
            sbLIZ.append(hashCode());
            sbLIZ.append(",player ");
            C1AEE c1aee = this.LLJJLIIIJLLLLLLLZ;
            if (c1aee != null && (livePlayHelper3 = c1aee.getLivePlayHelper()) != null) {
                numValueOf = Integer.valueOf(livePlayHelper3.hashCode());
            }
            sbLIZ.append(numValueOf);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startPlay skip: allowPlay: ");
            sbLIZ2.append(this.LLJJIJIL);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c599820Nfo.getClass();
            C599820Nfo.LIZ(strLIZIZ, strLIZIZ2);
            this.LLJJJJLIIL = false;
            return;
        }
        String str = this.LLILLL;
        C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("MMKLive ");
        sbLIZ3.append(hashCode());
        sbLIZ3.append(",player ");
        C1AEE c1aee2 = this.LLJJLIIIJLLLLLLLZ;
        sbLIZ3.append((c1aee2 == null || (livePlayHelper2 = c1aee2.getLivePlayHelper()) == null) ? null : Integer.valueOf(livePlayHelper2.hashCode()));
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("tryToStartPlay... ");
        String str2 = this.LLILLL;
        sbLIZ4.append(str2 != null ? str2.hashCode() : 0);
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
        c599820Nfo2.getClass();
        C599820Nfo.LIZ(strLIZIZ3, strLIZIZ4);
        if (str == null || a0.LJJJIL(str) || this.LLILZIL == null) {
            this.LLJJJJLIIL = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1775600wJ4 c1775600wJ4 = this.LLJJ;
        if (c1775600wJ4 != null) {
            ((C1AEE) this.mView).LLILLJJLI = c1775600wJ4;
            C1120704Zx.LIZ.getClass();
            C1120704Zx.LIZJ = c1775600wJ4;
        }
        String str3 = this.LLILZIL;
        this.LLJJL = null;
        if (str3 == null) {
            str3 = "unknown";
        }
        this.LLJJL = new C1851070yGn(str3, "mix");
        C1851070yGn c1851070yGn = this.LLJJL;
        if (c1851070yGn != null) {
            c1851070yGn.LJII = EnumC1782850wUl.TRIGGERED;
            c1851070yGn.LIZJ = SystemClock.elapsedRealtime();
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("MMKLive ");
        sbLIZ5.append(hashCode());
        sbLIZ5.append(",player ");
        C1AEE c1aee3 = this.LLJJLIIIJLLLLLLLZ;
        sbLIZ5.append((c1aee3 == null || (livePlayHelper = c1aee3.getLivePlayHelper()) == null) ? null : Integer.valueOf(livePlayHelper.hashCode()));
        C599820Nfo.LIZ(C2188811AlT.LIZIZ(sbLIZ5), "startPlay...");
        C1AEE c1aee4 = (C1AEE) this.mView;
        if (c1aee4 != null && (interfaceC2175541ACi = c1aee4.LLILLJJLI) != null) {
            C1120704Zx.LIZ.getClass();
            C1120704Zx.LIZJ = interfaceC2175541ACi;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("MMKLive-testCallback ");
        sbLIZ6.append(hashCode());
        String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ6);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("registerLiveCallback=");
        C1775600wJ4 c1775600wJ42 = this.LLJJ;
        sbLIZ7.append(c1775600wJ42 != null ? c1775600wJ42.hashCode() : 0);
        C599820Nfo.LIZ(strLIZIZ5, C2188811AlT.LIZIZ(sbLIZ7));
        ((C1AEE) this.mView).setAttachCallback(this.LLJJI);
        ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(this.mView.getContext());
        LifecycleOwner lifecycleOwnerLIZ = C20161913uj.LIZ(this.mView);
        if ((lifecycleOwnerLIZ == null && (!(componentCallbacks2LIZ instanceof LifecycleOwner) || (lifecycleOwnerLIZ = (LifecycleOwner) componentCallbacks2LIZ) == null)) || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ)) == null) {
            lifecycleScope = C817503Hh.LL;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.LLIILII(), null, new C1775560wJ0(str, this, jElapsedRealtime, null), 2);
    }

    @Override // X.InterfaceC2272941Dxs
    public final String LLLLLLL() {
        return "live";
    }

    @InterfaceC1312540kGC(name = "optimizetype")
    public final void setOptimizeType(String str) {
    }

    public final String LJJIJIIJIL() {
        return this.LLJI ? EnumC1775410wIl.PLAYING.getStatus() : LLLFFI ? EnumC1775410wIl.INIT.getStatus() : EnumC1775410wIl.STOP.getStatus();
    }

    public final InterfaceC1773850wGF LJJIJIL() {
        InterfaceC1773310wFN interfaceC1773310wFN;
        InterfaceC1773890wGJ interfaceC1773890wGJLIZJ;
        if (this.LLJJIJIIJIL == null) {
            InterfaceC1775450wIp<C1773330wFP> containerCallback = getContainerCallback();
            this.LLJJIJIIJIL = (containerCallback == null || (interfaceC1773310wFN = ((C1773610wFr) containerCallback).LL) == null || (interfaceC1773890wGJLIZJ = interfaceC1773310wFN.LIZJ()) == null) ? null : (InterfaceC1773850wGF) interfaceC1773890wGJLIZJ.getService(InterfaceC1773850wGF.class);
        }
        return this.LLJJIJIIJIL;
    }

    public final void LJJIJLIJ() {
        Size size;
        RemoteImageView remoteImageView = this.LL;
        if (remoteImageView == null || Intrinsics.LJFF(remoteImageView.getTag(), this.LLILZ)) {
            return;
        }
        remoteImageView.LIZ();
        String str = this.LLILZ;
        if (str == null) {
            str = "";
        }
        EnumC1769850w9n enumC1769850w9n = EnumC1769850w9n.SHOP_MALL_LIVE_CARD;
        C1334210kp9.LIZIZ(str, enumC1769850w9n, null, null, false, false, null, null);
        String value = enumC1769850w9n.getValue();
        if (!C314740CVk.LIZ.enableLynxForceResize || (size = (Size) C20160313uT.LIZIZ().get(value)) == null) {
            size = new Size(remoteImageView.getWidth(), remoteImageView.getHeight());
        }
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
        int width = size.getWidth();
        int height = size.getHeight();
        c1331670kl3LIZLLL.LJIIIIZZ = width;
        c1331670kl3LIZLLL.LJIIIZ = height;
        c1331670kl3LIZLLL.LJJI(remoteImageView);
        C786410Ut5.h3(c1331670kl3LIZLLL);
        remoteImageView.setTag(this.LLILZ);
    }

    public final void LJJJ() {
        C1ACD livePlayHelper;
        RemoteImageView remoteImageView = this.LL;
        if (remoteImageView == null) {
            return;
        }
        if (C1AEJ.LIZ()) {
            String str = this.LLILZ;
            if (str == null || str.length() == 0) {
                return;
            }
            LJJIJLIJ();
            C786410Ut5.l(remoteImageView, 0);
            remoteImageView.bringToFront();
            HandlerHook.viewPost(this.mView, new ARunnableS128S0100000_28(remoteImageView, 27));
            return;
        }
        if (!C1771440wCM.LIZ() || ((ViewGroup) this.mView).indexOfChild(remoteImageView) == 0) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) remoteImageView.getParent();
        if (viewGroup != null) {
            C786410Ut5.LJJJLZIJ(remoteImageView, viewGroup);
        }
        ((ViewGroup) this.mView).addView(remoteImageView, 0);
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MMKLive ");
        sbLIZ.append(hashCode());
        sbLIZ.append(",player ");
        C1AEE c1aee = this.LLJJLIIIJLLLLLLLZ;
        sbLIZ.append((c1aee == null || (livePlayHelper = c1aee.getLivePlayHelper()) == null) ? null : Integer.valueOf(livePlayHelper.hashCode()));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ(strLIZIZ, "reset poster to bottom");
    }

    @Override // X.InterfaceC2272941Dxs
    public final void LLLLLIL() {
        LJJJJJ("try playMedia");
        this.LLJJIJIL = true;
        this.LLJJJJ = Long.valueOf(System.currentTimeMillis());
        if (!C0BAH.LIZ()) {
            play(null);
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("play!!! currItem=");
            sbLIZ.append(hashCode());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("MMKLive", strLIZIZ);
        }
        if (this.LLJJJJLIIL) {
            return;
        }
        this.LLJJJJLIIL = true;
        if (C0BAH.LIZ()) {
            play(null);
            C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("new play!!! currItem=");
            sbLIZ2.append(hashCode());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c599820Nfo2.getClass();
            C599820Nfo.LIZ("MMKLive", strLIZIZ2);
        }
        LJJJJL("play");
        LJJJJI("play");
        LJJJJIZL(this, "card_emit_play");
    }

    @Override // X.InterfaceC2272941Dxs
    public final String LLLLLJLJLL() {
        String str = this.LLILZLL;
        if (str != null) {
            return str;
        }
        String str2 = this.LLILZIL;
        if (str2 != null) {
            return str2;
        }
        String str3 = this.LLILLL;
        return str3 == null ? "" : str3;
    }

    @Override // X.InterfaceC2272941Dxs
    public final C1768420w7U getConfig() {
        C1773330wFP data;
        ECMixMallItemInfoDTO eCMixMallItemInfoDTO;
        Map<String, Object> map;
        C1ACD livePlayHelper;
        if (this.LLJJJJJIL == null) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZ("MMKLive", "initConfig");
            if (getContainerCallback() != null) {
                InterfaceC1775450wIp<C1773330wFP> containerCallback = getContainerCallback();
                Integer numValueOf = null;
                if (containerCallback != null && (data = containerCallback.getData()) != null && (eCMixMallItemInfoDTO = data.LJIIIZ) != null && (map = eCMixMallItemInfoDTO.config) != null) {
                    this.LLJJJJJIL = C1768550w7h.LIZIZ(map);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MMKLive ");
                    sbLIZ.append(hashCode());
                    sbLIZ.append(",player ");
                    C1AEE c1aee = this.LLJJLIIIJLLLLLLLZ;
                    if (c1aee != null && (livePlayHelper = c1aee.getLivePlayHelper()) != null) {
                        numValueOf = Integer.valueOf(livePlayHelper.hashCode());
                    }
                    sbLIZ.append(numValueOf);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("initConfig: ");
                    sbLIZ2.append(this.LLJJJJJIL);
                    C599820Nfo.LIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC2272941Dxs
    public final InterfaceC1775450wIp<C1773330wFP> getContainerCallback() {
        if (this.LLJJIII == null) {
            LynxView lynxViewLJIILJJIL = this.mContext.LJIILJJIL();
            ViewParent parent = lynxViewLJIILJJIL != null ? lynxViewLJIILJJIL.getParent() : null;
            this.LLJJIII = parent instanceof C1773610wFr ? (C1773610wFr) parent : null;
        }
        return this.LLJJIII;
    }

    @Override // X.InterfaceC2272941Dxs
    public final String getMediaSrc() {
        String str = this.LLILLL;
        return str == null ? "" : str;
    }

    public final void LJJIIZI() {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest() && LLLFZ) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trigger:");
            sbLIZ.append(this.LLLF);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            sb.append("\n");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("status:");
            sbLIZ2.append(this.LLL);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            sb.append("\n");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("msg:");
            sbLIZ3.append(this.LLJZIJLIL);
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            sb.append("\n");
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("ratio:");
            sbLIZ4.append(this.LLLFF);
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
            sb.append("\n");
            TextView textView = this.LLILLJJLI;
            if (textView != null) {
                textView.setText(sb.toString());
            }
        }
    }

    public final C2272921Dxq LJJIJIIJI() {
        C1768420w7U config = getConfig();
        if (config != null) {
            if (config.LIZ != 1) {
                C599820Nfo.LJ(C599820Nfo.LIZ);
                return null;
            }
            if (config != null) {
                if (config.LIZLLL == 1) {
                    throw null;
                }
                if (!config.LIZIZ()) {
                    C599820Nfo.LJ(C599820Nfo.LIZ);
                    return null;
                }
                if (!config.LIZLLL(this.mView.getContext())) {
                    C599820Nfo.LJ(C599820Nfo.LIZ);
                    return null;
                }
                if (!config.LIZJ()) {
                    C599820Nfo.LJ(C599820Nfo.LIZ);
                    return null;
                }
            }
        }
        return this.LLJJIJI;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroy ");
        sbLIZ.append(SystemClock.elapsedRealtime());
        LJJJJJ(C2188811AlT.LIZIZ(sbLIZ));
        C1775600wJ4 c1775600wJ4 = this.LLJJ;
        if (c1775600wJ4 != null) {
            ((C1AEE) this.mView).LJFF(c1775600wJ4);
        }
        ((C1AEE) this.mView).LJI();
        C418601k0.LIZ(new AwS576S0100000_32(this, 154));
        if (this.LLJILJIL > 0 && this.LLJIJIL) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
            }
            EnumC1782940wUu enumC1782940wUu = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).isAppBackGround() ? EnumC1782940wUu.LIVE_CARD_DESTROY : EnumC1782940wUu.LIVE_CARD_DETACH;
            LJJJIL(CardStruct.IStatusCode.DEFAULT, String.valueOf(SystemClock.elapsedRealtime() - this.LLJILJIL), C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(enumC1782940wUu.getCode())), new Pair("msg", enumC1782940wUu.getMsg())));
        }
        C1851070yGn c1851070yGn = this.LLJJL;
        if (c1851070yGn != null) {
            c1851070yGn.LIZIZ(c1851070yGn.LJII, "destroy", null, null);
        }
        super.destroy();
        this.LLJJIJIL = false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        C1ACD livePlayHelper;
        super.onPropsUpdated();
        if (this.LLIZLLLIL && !this.LLJI) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MMKLive ");
            sbLIZ.append(hashCode());
            sbLIZ.append(",player ");
            C1AEE c1aee = this.LLJJLIIIJLLLLLLLZ;
            sbLIZ.append((c1aee == null || (livePlayHelper = c1aee.getLivePlayHelper()) == null) ? null : Integer.valueOf(livePlayHelper.hashCode()));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ(strLIZIZ, "onPropsUpdated");
            LJJJJ();
        }
        if (this.LLJILJILJ) {
            this.LLJILJILJ = false;
            C418601k0.LIZ(new AwS576S0100000_32(this, 155));
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLL() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLLLLL() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLLLLLL() {
        return this.LLJI;
    }

    @Override // X.InterfaceC2272941Dxs
    public final View getItemView() {
        return this.mView;
    }

    public final void LJJIJ(String str) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            this.LLL = str;
            LJJIIZI();
        }
    }

    public final void LJJIJL(boolean z) {
        if (C1771440wCM.LIZ() && !C1AEJ.LIZ()) {
            LJJIJLIJ();
            return;
        }
        if (z) {
            RemoteImageView remoteImageView = this.LL;
            if (remoteImageView != null) {
                C786410Ut5.l(remoteImageView, 8);
                return;
            }
            return;
        }
        RemoteImageView remoteImageView2 = this.LL;
        if (remoteImageView2 != null) {
            LJJIJLIJ();
            String str = this.LLILZ;
            if (str != null && str.length() != 0 && !this.LLJI) {
                C786410Ut5.l(remoteImageView2, 0);
            } else {
                C786410Ut5.l(remoteImageView2, 8);
            }
        }
    }

    public final void LJJIZ(EnumC2176021AEe enumC2176021AEe) {
        Integer numValueOf;
        C1ACD livePlayHelper;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try pauseInternal ");
        sbLIZ.append(SystemClock.elapsedRealtime());
        LJJJJJ(C2188811AlT.LIZIZ(sbLIZ));
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MMKLive ");
        sbLIZ2.append(hashCode());
        sbLIZ2.append(",player ");
        C1AEE c1aee = this.LLJJLIIIJLLLLLLLZ;
        if (c1aee != null && (livePlayHelper = c1aee.getLivePlayHelper()) != null) {
            numValueOf = Integer.valueOf(livePlayHelper.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ2.append(numValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        c599820Nfo.getClass();
        C599820Nfo.LIZ(strLIZIZ, "pauseInternal...");
        ((C1AEE) this.mView).LIZLLL(enumC2176021AEe);
        this.LLJI = false;
        LJJIJL(false);
        if (this.LLJILJIL > 0 && this.LLJIJIL) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.LLJILJIL);
            EnumC1782940wUu enumC1782940wUu = EnumC1782940wUu.LIVE_CARD_PAUSE;
            LJJJIL(CardStruct.IStatusCode.DEFAULT, strValueOf, C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(enumC1782940wUu.getCode())), new Pair("msg", enumC1782940wUu.getMsg())));
        }
        C418601k0.LIZ(new AwS576S0100000_32(this, 158));
        C1851070yGn c1851070yGn = this.LLJJL;
        if (c1851070yGn != null) {
            c1851070yGn.LIZIZ(c1851070yGn.LJII, "pause", null, null);
        }
        this.LLJZ = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
    }

    public final void LJJJJI(String str) {
        C1773330wFP data;
        InterfaceC1773850wGF interfaceC1773850wGFLJJIJIL = LJJIJIL();
        if (interfaceC1773850wGFLJJIJIL != null) {
            InterfaceC1775450wIp<C1773330wFP> containerCallback = getContainerCallback();
            if (containerCallback != null) {
                data = containerCallback.getData();
            } else {
                data = null;
            }
            interfaceC1773850wGFLJJIJIL.LJIIJ(str, data, 0, new C1774840wHq(null, 7), null);
        }
    }

    public final void LJJJJJ(String str) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            this.LLLF = str;
            LJJIIZI();
        }
    }

    public final void LJJJJJL(Boolean bool) {
        C1773330wFP data;
        C1775190wIP c1775190wIP;
        C1775180wIO c1775180wIO;
        String strLJJIJIIJIL;
        InterfaceC1775450wIp<C1773330wFP> containerCallback = getContainerCallback();
        if (containerCallback != null && (data = containerCallback.getData()) != null && (c1775190wIP = data.LJII) != null && (c1775180wIO = c1775190wIP.LIZIZ) != null) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                strLJJIJIIJIL = EnumC1775410wIl.PLAYING.getStatus();
            } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
                strLJJIJIIJIL = EnumC1775410wIl.STOP.getStatus();
            } else {
                strLJJIJIIJIL = LJJIJIIJIL();
            }
            c1775180wIO.LJIJJ = strLJJIJIIJIL;
        }
    }

    public final void LJJJJL(String str) {
        C1773330wFP data;
        C1775190wIP c1775190wIP;
        C1775180wIO c1775180wIO;
        InterfaceC1775450wIp<C1773330wFP> containerCallback = getContainerCallback();
        if (containerCallback != null && (data = containerCallback.getData()) != null && (c1775190wIP = data.LJII) != null && (c1775180wIO = c1775190wIP.LIZIZ) != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1877652737) {
                if (iHashCode != 3443508) {
                    if (iHashCode == 1910181940 && str.equals("play_break")) {
                        c1775180wIO.LJIILLIIL++;
                        c1775180wIO.LJIJ = 0L;
                        c1775180wIO.LJIJI = 0;
                        c1775180wIO.LJIJJ = LJJIJIIJIL();
                        return;
                    }
                    return;
                }
                if (!str.equals("play")) {
                    return;
                }
                c1775180wIO.LJIILJJIL++;
                c1775180wIO.LJIJ = 0L;
                c1775180wIO.LJIJI = 0;
                c1775180wIO.LJIJJ = LJJIJIIJIL();
                return;
            }
            if (!str.equals("play_over")) {
                return;
            }
            c1775180wIO.LJIIZILJ++;
            c1775180wIO.LJIJ = 0L;
            c1775180wIO.LJIJI = 0;
            c1775180wIO.LJIJJ = LJJIJIIJIL();
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLF(String str) {
        return ((C1AEE) this.mView).LIZIZ();
    }

    @Override // X.InterfaceC2272941Dxs
    public final void LLLLLJIL(float f) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(f);
            sbLIZ.append(" at ");
            sbLIZ.append(SystemClock.elapsedRealtime());
            this.LLLFF = C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final void LLLLLLIL(boolean z) {
        LJJII(EnumC2176021AEe.PLAY_SELECTION, z);
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLLJ(boolean z) {
        C1775190wIP c1775190wIP;
        C1775180wIO c1775180wIO;
        C1773330wFP data;
        boolean z2 = true;
        if (!this.LLJJJIL && z) {
            InterfaceC1775450wIp<C1773330wFP> containerCallback = getContainerCallback();
            if (containerCallback != null && (data = containerCallback.getData()) != null) {
                c1775190wIP = data.LJII;
            } else {
                c1775190wIP = null;
            }
            if (c1775190wIP != null && (c1775180wIO = c1775190wIP.LIZIZ) != null && Intrinsics.LJFF("card_exposure", "card_exposure")) {
                c1775180wIO.LJIILL++;
            }
            LJJJJIZL(this, "card_exposure");
        }
        if (this.LLJJJIL == z) {
            z2 = false;
        }
        this.LLJJJIL = z;
        return z2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(C1311730kEt c1311730kEt) {
        super.afterPropsUpdated(c1311730kEt);
        if (c1311730kEt != null) {
            if (c1311730kEt.LJIIIIZZ("qualities")) {
                if (this.mView.isAttachedToWindow()) {
                    ((C1AEE) this.mView).LJIIJ(this.LLIZ, new InterfaceC1699420uKC() { // from class: X.0wJ2
                        @Override // X.InterfaceC1699420uKC
                        public final void LIZ(boolean z) {
                            Integer numValueOf;
                            C1ACD livePlayHelper;
                            this.LIZ.LJJJI("switchresolution", C2097608Jq.LJIIJ(new Pair("success", Boolean.valueOf(z))));
                            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("MMKLive ");
                            sbLIZ.append(this.LIZ.hashCode());
                            sbLIZ.append(",player ");
                            C1AEE c1aee = this.LIZ.LLJJLIIIJLLLLLLLZ;
                            if (c1aee != null && (livePlayHelper = c1aee.getLivePlayHelper()) != null) {
                                numValueOf = Integer.valueOf(livePlayHelper.hashCode());
                            } else {
                                numValueOf = null;
                            }
                            sbLIZ.append(numValueOf);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("$ switchResolution: ");
                            sbLIZ2.append(z);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            c599820Nfo.getClass();
                            C599820Nfo.LIZ(strLIZIZ, strLIZIZ2);
                        }
                    });
                }
                if (c1311730kEt == null) {
                    return;
                }
            }
            if (c1311730kEt.LJIIIIZZ("poster")) {
                LJJIJL(false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0wJ1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0wJ4] */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        int i;
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        boolean z;
        String name;
        boolean z2;
        String name2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LLJJI = new C1AEV() { // from class: X.0wJ1
            @Override // X.C1AEV
            public final void onAttachedToWindow() {
                C1773610wFr c1773610wFr;
                InterfaceC1773310wFN mixMallController;
                InterfaceC1773890wGJ interfaceC1773890wGJLIZJ;
                C1ACD livePlayHelper;
                C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MMKLive ");
                sbLIZ.append(this.LIZ.hashCode());
                sbLIZ.append(",player ");
                C1AEE c1aee = this.LIZ.LLJJLIIIJLLLLLLLZ;
                C2272921Dxq c2272921Dxq = null;
                sbLIZ.append((c1aee == null || (livePlayHelper = c1aee.getLivePlayHelper()) == null) ? null : Integer.valueOf(livePlayHelper.hashCode()));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c599820Nfo.getClass();
                C599820Nfo.LIZ(strLIZIZ, "onViewAttachedToWindow");
                MMKLynxLiveView mMKLynxLiveView = this.LIZ;
                if (mMKLynxLiveView.LLJJIJI == null) {
                    LynxView lynxViewLJIILJJIL = mMKLynxLiveView.mContext.LJIILJJIL();
                    ViewParent parent = lynxViewLJIILJJIL != null ? lynxViewLJIILJJIL.getParent() : null;
                    if ((parent instanceof C1773610wFr) && (c1773610wFr = (C1773610wFr) parent) != null && (mixMallController = c1773610wFr.getMixMallController()) != null && (interfaceC1773890wGJLIZJ = mixMallController.LIZJ()) != null) {
                        c2272921Dxq = (C2272921Dxq) interfaceC1773890wGJLIZJ.getService(C2272921Dxq.class);
                    }
                    mMKLynxLiveView.LLJJIJI = c2272921Dxq;
                }
                MMKLynxLiveView mMKLynxLiveView2 = this.LIZ;
                C2272921Dxq c2272921DxqLJJIJIIJI = mMKLynxLiveView2.LJJIJIIJI();
                if (c2272921DxqLJJIJIIJI != null) {
                    c2272921DxqLJJIJIIJI.LJI(mMKLynxLiveView2);
                }
            }

            @Override // X.C1AEV
            public final void onDetachedFromWindow() {
                C1ACD livePlayHelper;
                C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MMKLive ");
                sbLIZ.append(this.LIZ.hashCode());
                sbLIZ.append(",player ");
                C1AEE c1aee = this.LIZ.LLJJLIIIJLLLLLLLZ;
                sbLIZ.append((c1aee == null || (livePlayHelper = c1aee.getLivePlayHelper()) == null) ? null : Integer.valueOf(livePlayHelper.hashCode()));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c599820Nfo.getClass();
                C599820Nfo.LIZ(strLIZIZ, "onDetachedFromWindow");
                this.LIZ.LJJII(EnumC2176021AEe.VIEW_DETACH, true);
                MMKLynxLiveView mMKLynxLiveView = this.LIZ;
                C2272921Dxq c2272921DxqLJJIJIIJI = mMKLynxLiveView.LJJIJIIJI();
                if (c2272921DxqLJJIJIIJI != null) {
                    c2272921DxqLJJIJIIJI.LIZIZ(mMKLynxLiveView);
                }
            }
        };
        this.LLJJ = new InterfaceC2175541ACi() { // from class: X.0wJ4
            @Override // X.InterfaceC2175541ACi
            public final Integer Dk() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean LLILLIZIL() {
                return false;
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLIL() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLLLIL() {
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Md() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean U1() {
                return true;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean We() {
                return false;
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Y7() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final void o() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void oc(C945320ahu c945320ahu) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void T5() {
                C1ACD livePlayHelper;
                if (this.LL.LLJIJIL) {
                    this.LL.LLJI = true;
                }
                this.LL.LLJJJJLIIL = false;
                this.LL.LJJJI("play", null);
                MMKLynxLiveView.LLLFFI = false;
                this.LL.LJJIJL(true);
                C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MMKLive ");
                sbLIZ.append(this.LL.hashCode());
                sbLIZ.append(",player ");
                C1AEE c1aee = this.LL.LLJJLIIIJLLLLLLLZ;
                sbLIZ.append((c1aee == null || (livePlayHelper = c1aee.getLivePlayHelper()) == null) ? null : Integer.valueOf(livePlayHelper.hashCode()));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c599820Nfo.getClass();
                C599820Nfo.LIZ(strLIZIZ, "playing");
                if (MMKLynxLiveView.LLLFZ) {
                    MMKLynxLiveView mMKLynxLiveView = this.LL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("playing ");
                    sbLIZ2.append(SystemClock.elapsedRealtime());
                    mMKLynxLiveView.LJJIJ(C2188811AlT.LIZIZ(sbLIZ2));
                }
                this.LL.LJJJJJL(null);
                MMKLynxLiveView.LJJJJIZL(this.LL, "card_play_success");
                C1851070yGn c1851070yGn = this.LL.LLJJL;
                if (c1851070yGn != null) {
                    c1851070yGn.LIZIZ(EnumC1782850wUl.FIRST_FRAME, "first_frame", null, null);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void v() {
                C1ACD livePlayHelper;
                MMKLynxLiveView mMKLynxLiveView = this.LL;
                boolean z3 = MMKLynxLiveView.LLLFFI;
                Integer numValueOf = null;
                mMKLynxLiveView.LJJJI("firstframe", null);
                if (C1AEJ.LIZ()) {
                    this.LL.LJJIJL(true);
                }
                if (MMKLynxLiveView.LLLFZ) {
                    this.LL.LJJIJ("firstFrame");
                }
                if (this.LL.LLJILJIL > 0 && this.LL.LLJIJIL) {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - this.LL.LLJILJIL;
                    this.LL.LLJILJIL = -1L;
                    MMKLynxLiveView mMKLynxLiveView2 = this.LL;
                    String strValueOf = String.valueOf(jElapsedRealtime2);
                    EnumC1782940wUu enumC1782940wUu = EnumC1782940wUu.SUCCESS;
                    mMKLynxLiveView2.LJJJIL("1", strValueOf, C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(enumC1782940wUu.getCode())), new Pair("msg", enumC1782940wUu.getMsg())));
                }
                C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MMKLive ");
                sbLIZ.append(this.LL.hashCode());
                sbLIZ.append(",player ");
                C1AEE c1aee = this.LL.LLJJLIIIJLLLLLLLZ;
                if (c1aee != null && (livePlayHelper = c1aee.getLivePlayHelper()) != null) {
                    numValueOf = Integer.valueOf(livePlayHelper.hashCode());
                }
                sbLIZ.append(numValueOf);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c599820Nfo.getClass();
                C599820Nfo.LIZ(strLIZIZ, "firstFrame");
                C1851070yGn c1851070yGn = this.LL.LLJJL;
                if (c1851070yGn != null) {
                    c1851070yGn.LJII = EnumC1782850wUl.PLAYING;
                    c1851070yGn.LJ = SystemClock.elapsedRealtime();
                }
            }

            @Override // X.InterfaceC2175541ACi
            /* JADX INFO: renamed from: if */
            public final void mo29if(String str) {
                Integer numValueOf;
                Integer numValueOf2;
                C1ACD livePlayHelper;
                C1ACD livePlayHelper2;
                if (MMKLynxLiveView.LLLFZ) {
                    this.LL.LJJIJ("playComplete");
                    this.LL.LJJJJJ("triggerPlay for playComplete");
                }
                this.LL.LJJJI("ended", null);
                C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MMKLive ");
                sbLIZ.append(this.LL.hashCode());
                sbLIZ.append(",player ");
                C1AEE c1aee = this.LL.LLJJLIIIJLLLLLLLZ;
                if (c1aee != null && (livePlayHelper2 = c1aee.getLivePlayHelper()) != null) {
                    numValueOf = Integer.valueOf(livePlayHelper2.hashCode());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("playCompleted: ");
                sbLIZ2.append(str);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c599820Nfo.getClass();
                C599820Nfo.LIZ(strLIZIZ, strLIZIZ2);
                this.LL.LLJI = false;
                this.LL.LLJJJ = true;
                this.LL.LJJJJL("play_over");
                this.LL.LJJJJI("play_over");
                this.LL.LJJIJL(false);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("MMKLive ");
                sbLIZ3.append(this.LL.hashCode());
                sbLIZ3.append(",player ");
                C1AEE c1aee2 = this.LL.LLJJLIIIJLLLLLLLZ;
                if (c1aee2 != null && (livePlayHelper = c1aee2.getLivePlayHelper()) != null) {
                    numValueOf2 = Integer.valueOf(livePlayHelper.hashCode());
                } else {
                    numValueOf2 = null;
                }
                sbLIZ3.append(numValueOf2);
                C599820Nfo.LIZ(C2188811AlT.LIZIZ(sbLIZ3), "triggerPlay for playComplete");
                C2272921Dxq c2272921DxqLJJIJIIJI = this.LL.LJJIJIIJI();
                if (c2272921DxqLJJIJIIJI != null) {
                    c2272921DxqLJJIJIIJI.LJIIJJI(false, false);
                }
                this.LL.LJJJJJL(null);
                C1851070yGn c1851070yGn = this.LL.LLJJL;
                if (c1851070yGn != null) {
                    c1851070yGn.LIZIZ(c1851070yGn.LJII, "complete", null, null);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void oe(String str) {
                C1ACD livePlayHelper;
                MMKLynxLiveView mMKLynxLiveView = this.LL;
                boolean z3 = MMKLynxLiveView.LLLFFI;
                Integer numValueOf = null;
                mMKLynxLiveView.LJJJI("prepared", null);
                C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MMKLive ");
                sbLIZ.append(this.LL.hashCode());
                sbLIZ.append(",player ");
                C1AEE c1aee = this.LL.LLJJLIIIJLLLLLLLZ;
                if (c1aee != null && (livePlayHelper = c1aee.getLivePlayHelper()) != null) {
                    numValueOf = Integer.valueOf(livePlayHelper.hashCode());
                }
                sbLIZ.append(numValueOf);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("playPrepared: ");
                sbLIZ2.append(str);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c599820Nfo.getClass();
                C599820Nfo.LIZ(strLIZIZ, strLIZIZ2);
                C1851070yGn c1851070yGn = this.LL.LLJJL;
                if (c1851070yGn != null) {
                    c1851070yGn.LJII = EnumC1782850wUl.PREPARED;
                    c1851070yGn.LJFF = SystemClock.elapsedRealtime();
                }
                if (MMKLynxLiveView.LLLFZ) {
                    this.LL.LJJIJ("playPrepared");
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void sk(String str) {
                this.LL.LJJJI("sei", C2097608Jq.LJIIJ(new Pair("sei", str)));
            }

            @Override // X.InterfaceC2175541ACi
            public final void w9(String str) {
                Map<String, Object> mapLJIIJ;
                Integer numValueOf;
                Integer num;
                String str2;
                Integer num2;
                C1ACD livePlayHelper;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    mapLJIIJ = C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(jSONObject.optInt("error_code"))), new Pair("msg", jSONObject.optString("error_description")));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    EnumC1782940wUu enumC1782940wUu = EnumC1782940wUu.DATA_ERROR;
                    mapLJIIJ = C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(enumC1782940wUu.getCode())), new Pair("msg", enumC1782940wUu.getMsg()));
                }
                if (this.LL.LLJILJIL > 0 && this.LL.LLJIJIL) {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - this.LL.LLJILJIL;
                    this.LL.LLJILJIL = -1L;
                    this.LL.LJJJIL(CardStruct.IStatusCode.DEFAULT, String.valueOf(jElapsedRealtime2), mapLJIIJ);
                }
                C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                StringBuilder sb = new StringBuilder("MMKLive ");
                sb.append(this.LL.hashCode());
                sb.append(",player ");
                C1AEE c1aee = this.LL.LLJJLIIIJLLLLLLLZ;
                String str3 = null;
                if (c1aee != null && (livePlayHelper = c1aee.getLivePlayHelper()) != null) {
                    numValueOf = Integer.valueOf(livePlayHelper.hashCode());
                } else {
                    numValueOf = null;
                }
                sb.append(numValueOf);
                c599820Nfo.getClass();
                C599820Nfo.LIZ(sb.toString(), "playerMediaError: " + str);
                if (MMKLynxLiveView.LLLFZ) {
                    this.LL.LJJIJ("playerMediaError " + str);
                }
                this.LL.LLJJJJLIIL = false;
                this.LL.LLJI = false;
                this.LL.LJJIJL(false);
                this.LL.LJJJJJL(null);
                MMKLynxLiveView mMKLynxLiveView = this.LL;
                Object objLIZ = C7726030a.LIZ("code", mapLJIIJ);
                if (objLIZ instanceof Integer) {
                    num = (Integer) objLIZ;
                } else {
                    num = null;
                }
                Object objLIZ2 = C7726030a.LIZ("msg", mapLJIIJ);
                if (objLIZ2 instanceof String) {
                    str2 = (String) objLIZ2;
                } else {
                    str2 = null;
                }
                mMKLynxLiveView.getClass();
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1775330wId("card_play_error", mMKLynxLiveView, num, str2, null), 3);
                C1851070yGn c1851070yGn = this.LL.LLJJL;
                if (c1851070yGn != null) {
                    Object objLIZ3 = C7726030a.LIZ("code", mapLJIIJ);
                    if (objLIZ3 instanceof Integer) {
                        num2 = (Integer) objLIZ3;
                    } else {
                        num2 = null;
                    }
                    Object objLIZ4 = C7726030a.LIZ("msg", mapLJIIJ);
                    if (objLIZ4 instanceof String) {
                        str3 = (String) objLIZ4;
                    }
                    c1851070yGn.LIZIZ(EnumC1782850wUl.ERROR, "error", num2, str3);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
                IECommerceHostService iECommerceHostService3;
                boolean z3;
                String name3;
                if (MMKLynxLiveView.LLLFZ) {
                    MMKLynxLiveView mMKLynxLiveView = this.LL;
                    String strName = enumC1913550ztZ.name();
                    mMKLynxLiveView.getClass();
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        iECommerceHostService3 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                        if (iECommerceHostService3 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        String name4 = IApplicationDependencyService.class.getName();
                        if (iECommerceHostService3 != null) {
                            name3 = iECommerceHostService3.getClass().getName();
                        } else {
                            name3 = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name3, z3);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    if (((IApplicationDependencyService) iECommerceHostService3).isLocalTest()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strName);
                        sbLIZ.append(" at ");
                        sbLIZ.append(SystemClock.elapsedRealtime());
                        mMKLynxLiveView.LLJZIJLIL = C2188811AlT.LIZIZ(sbLIZ);
                        mMKLynxLiveView.LJJIIZI();
                    }
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void Th(int i2, int i3, View view) {
                if (MMKLynxLiveView.LLLFZ) {
                    this.LL.LJJIJ("onVideoSizeChange");
                }
                C599820Nfo.LIZ.getClass();
                C599820Nfo.LIZ("MMKLive", "onVideoSizeChange: video size changed");
            }
        };
        RemoteImageView remoteImageView = new RemoteImageView(context);
        C786410Ut5.f7(remoteImageView, new ViewGroup.LayoutParams(-1, -1));
        if (C1771440wCM.LIZ()) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.l(remoteImageView, i);
        this.LL = remoteImageView;
        C1AEE c1aee = new C1AEE(context, null, 6);
        this.LLJJLIIIJLLLLLLLZ = c1aee;
        c1aee.setAttachCallback(this.LLJJI);
        c1aee.addView(this.LL);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name2 = iECommerceHostService.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name3, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name4 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime3, 1, name4, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService2).isLocalTest()) {
                c1aee.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0zc6
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean z3 = MMKLynxLiveView.LLLFFI;
                        MMKLynxLiveView.LLLFZ = !MMKLynxLiveView.LLLFZ;
                        return false;
                    }
                });
                if (LLLFZ) {
                    TextView textView = new TextView(c1aee.getContext());
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    C786410Ut5.g6(textView, layoutParams);
                    layoutParams.topMargin = C0H9H.LIZIZ(100);
                    textView.setBackgroundColor(-7829368);
                    textView.setTextColor(-1);
                    textView.setTypeface(null, 1);
                    textView.setTextSize(10.0f);
                    this.LLILLJJLI = textView;
                    c1aee.addView(textView);
                    LJJIIZI();
                }
            }
        }
        C418601k0.LIZ(AFwS223S0000000_32.get$arr$(140));
        this.LLJLLIL = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
        return c1aee;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Integer numValueOf;
        C1ACD livePlayHelper;
        C1ACD livePlayHelper2;
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MMKLive ");
        sbLIZ.append(hashCode());
        sbLIZ.append(",player ");
        C1AEE c1aee = this.LLJJLIIIJLLLLLLLZ;
        Integer numValueOf2 = null;
        if (c1aee != null && (livePlayHelper2 = c1aee.getLivePlayHelper()) != null) {
            numValueOf = Integer.valueOf(livePlayHelper2.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ(strLIZIZ, "onViewAttachedToWindow custom");
        if (this.LLILLL != null) {
            LJJIJL(false);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MMKLive-jingjie ");
            sbLIZ2.append(hashCode());
            sbLIZ2.append(",player ");
            C1AEE c1aee2 = this.LLJJLIIIJLLLLLLLZ;
            if (c1aee2 != null && (livePlayHelper = c1aee2.getLivePlayHelper()) != null) {
                numValueOf2 = Integer.valueOf(livePlayHelper.hashCode());
            }
            sbLIZ2.append(numValueOf2);
            C599820Nfo.LIZ(C2188811AlT.LIZIZ(sbLIZ2), "onViewAttachedToWindow");
            LJJJJ();
        }
        C418601k0.LIZ(new AwS576S0100000_32(this, 156));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Integer numValueOf;
        C1ACD livePlayHelper;
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MMKLive ");
        sbLIZ.append(hashCode());
        sbLIZ.append(",player ");
        C1AEE c1aee = this.LLJJLIIIJLLLLLLLZ;
        if (c1aee != null && (livePlayHelper = c1aee.getLivePlayHelper()) != null) {
            numValueOf = Integer.valueOf(livePlayHelper.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ(strLIZIZ, "onViewDetachedFromWindow custom");
        C1775600wJ4 c1775600wJ4 = this.LLJJ;
        if (c1775600wJ4 != null) {
            ((C1AEE) this.mView).LJFF(c1775600wJ4);
        }
        C418601k0.LIZ(new AwS576S0100000_32(this, 157));
        C1851070yGn c1851070yGn = this.LLJJL;
        if (c1851070yGn != null) {
            c1851070yGn.LIZIZ(EnumC1782850wUl.UNKNOWN, "unknown", null, null);
        }
    }

    @InterfaceC1967107nB
    public final void pause(ReadableMap readableMap) {
        String string;
        C1ACD livePlayHelper;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause ");
        sbLIZ.append(SystemClock.elapsedRealtime());
        LJJJJJ(C2188811AlT.LIZIZ(sbLIZ));
        Integer numValueOf = null;
        if (readableMap != null) {
            string = readableMap.getString("uuid");
        } else {
            string = null;
        }
        if (!TextUtils.equals(string, this.LLILZLL)) {
            return;
        }
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MMKLive ");
        sbLIZ2.append(hashCode());
        sbLIZ2.append(",player ");
        C1AEE c1aee = this.LLJJLIIIJLLLLLLLZ;
        if (c1aee != null && (livePlayHelper = c1aee.getLivePlayHelper()) != null) {
            numValueOf = Integer.valueOf(livePlayHelper.hashCode());
        }
        sbLIZ2.append(numValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        c599820Nfo.getClass();
        C599820Nfo.LIZ(strLIZIZ, "receive pause...");
        C1AEE c1aee2 = (C1AEE) this.mView;
        if (c1aee2 != null && !c1aee2.LIZIZ()) {
            return;
        }
        LJJIZ(EnumC2176021AEe.PLAY_SELECTION);
    }

    @InterfaceC1967107nB
    public final void play(ReadableMap readableMap) {
        Integer numValueOf;
        C1ACD livePlayHelper;
        LJJJJJ("try play with params");
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MMKLive ");
        sbLIZ.append(hashCode());
        sbLIZ.append(",player ");
        C1AEE c1aee = this.LLJJLIIIJLLLLLLLZ;
        if (c1aee != null && (livePlayHelper = c1aee.getLivePlayHelper()) != null) {
            numValueOf = Integer.valueOf(livePlayHelper.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ(strLIZIZ, "play");
        LJJJJ();
        LJJIJL(false);
        this.LLJILLL = false;
        C418601k0.LIZ(new AwS576S0100000_32(this, 159));
    }

    @InterfaceC1312540kGC(name = "actiontype")
    public final void setActionType(String str) {
        this.LLJLL = str;
    }

    @InterfaceC1312540kGC(name = "autoplay")
    public final void setAutoPlay(Boolean bool) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue != this.LLIZLLLIL) {
            this.LLIZLLLIL = zBooleanValue;
            this.LLJILJILJ = true;
            this.LLJILLL = false;
        }
    }

    @InterfaceC1312540kGC(name = "enterfrommerge")
    public final void setEnterFromMerge(String str) {
        this.LLJLIL = str;
    }

    @InterfaceC1312540kGC(name = "entermethod")
    public final void setEnterMethod(String str) {
        this.LLJLILLLLZIIL = str;
    }

    @InterfaceC1312540kGC(name = "mute")
    public final void setMute(Boolean bool) {
        boolean zBooleanValue = false;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            ((C1AEE) this.mView).setMute(true);
        } else {
            ((C1AEE) this.mView).setMute(false);
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        this.LLJ = zBooleanValue;
    }

    @InterfaceC1312540kGC(name = "objectfit")
    public final void setObjectfit(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            if (Intrinsics.LJFF(str, "cover")) {
                InterfaceC464060IHs textureView = ((C1AEE) this.mView).getTextureView();
                if (textureView != null) {
                    textureView.setScaleType(2);
                }
                RemoteImageView remoteImageView = this.LL;
                if (remoteImageView != null) {
                    remoteImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                LJJIJL(false);
                return;
            }
            if (!Intrinsics.LJFF(str, "contain")) {
                return;
            }
            InterfaceC464060IHs textureView2 = ((C1AEE) this.mView).getTextureView();
            if (textureView2 != null) {
                textureView2.setScaleType(1);
            }
            RemoteImageView remoteImageView2 = this.LL;
            if (remoteImageView2 != null) {
                remoteImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            LJJIJL(false);
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final void setPlayEnd(boolean z) {
        this.LLJJJ = false;
    }

    @InterfaceC1312540kGC(name = "poster")
    public final void setPoster(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            this.LLILZ = str;
        }
    }

    @InterfaceC1312540kGC(name = "qualities")
    public final void setQualities(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            this.LLIZ = str;
        }
    }

    @InterfaceC1312540kGC(name = "roomid")
    public final void setRoomId(String str) {
        this.LLILZIL = str;
    }

    @InterfaceC1312540kGC(name = "streamurl")
    public final void setStreamURL(String str) {
        C1ACD livePlayHelper;
        Integer numValueOf;
        C1ACD livePlayHelper2;
        int iHashCode = 0;
        if (str != null && !a0.LJJJIL(str)) {
            Integer numValueOf2 = null;
            if (C770702zh.LIZIZ(this.LLILLL) && !TextUtils.equals(this.LLILLL, str)) {
                this.LLJJJ = false;
                this.LLJJJIL = false;
                this.LLJJJJ = null;
                this.LLJJJJLIIL = false;
                if (this.LLJI) {
                    C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MMKLive ");
                    sbLIZ.append(hashCode());
                    sbLIZ.append(",player ");
                    C1AEE c1aee = this.LLJJLIIIJLLLLLLLZ;
                    if (c1aee != null && (livePlayHelper2 = c1aee.getLivePlayHelper()) != null) {
                        numValueOf = Integer.valueOf(livePlayHelper2.hashCode());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c599820Nfo.getClass();
                    C599820Nfo.LIZ(strLIZIZ, "setStreamURL: pauseInternal");
                    LJJIZ(EnumC2176021AEe.TYPE_SWITCH);
                }
            }
            this.LLILLL = str;
            C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MMKLive ");
            sbLIZ2.append(hashCode());
            sbLIZ2.append(",player ");
            C1AEE c1aee2 = this.LLJJLIIIJLLLLLLLZ;
            if (c1aee2 != null && (livePlayHelper = c1aee2.getLivePlayHelper()) != null) {
                numValueOf2 = Integer.valueOf(livePlayHelper.hashCode());
            }
            sbLIZ2.append(numValueOf2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("setStreamURL: ");
            String str2 = this.LLILLL;
            if (str2 != null) {
                iHashCode = str2.hashCode();
            }
            sbLIZ3.append(iHashCode);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            c599820Nfo2.getClass();
            C599820Nfo.LIZ(strLIZIZ2, strLIZIZ3);
        }
    }

    @InterfaceC1312540kGC(name = "uuid")
    public final void setUuId(String str) {
        this.LLILZLL = str;
    }

    @InterfaceC1967107nB
    public final void stop(ReadableMap readableMap) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop ");
        sbLIZ.append(SystemClock.elapsedRealtime());
        LJJJJJ(C2188811AlT.LIZIZ(sbLIZ));
        ((C1AEE) this.mView).LJIIIZ();
        this.LLJI = false;
        LJJIJL(false);
        if (this.LLJILJIL > 0 && this.LLJIJIL) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.LLJILJIL);
            EnumC1782940wUu enumC1782940wUu = EnumC1782940wUu.LIVE_CARD_STOP;
            LJJJIL(CardStruct.IStatusCode.DEFAULT, strValueOf, C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(enumC1782940wUu.getCode())), new Pair("msg", enumC1782940wUu.getMsg())));
        }
        C418601k0.LIZ(new AwS576S0100000_32(this, 160));
        C1851070yGn c1851070yGn = this.LLJJL;
        if (c1851070yGn != null) {
            c1851070yGn.LIZIZ(c1851070yGn.LJII, "stop", null, null);
        }
    }

    public static void LJJJJIZL(MMKLynxLiveView mMKLynxLiveView, String str) {
        mMKLynxLiveView.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1775330wId(str, mMKLynxLiveView, null, null, null), 3);
    }

    @Override // X.InterfaceC2272961Dxu
    public final void LJJII(EnumC2176021AEe enumC2176021AEe, boolean z) {
        Integer numValueOf;
        C1ACD livePlayHelper;
        LJJJJJ("try pauseMedia");
        this.LLJJJJLIIL = false;
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MMKLive ");
        sbLIZ.append(hashCode());
        sbLIZ.append(",player ");
        C1AEE c1aee = this.LLJJLIIIJLLLLLLLZ;
        if (c1aee != null && (livePlayHelper = c1aee.getLivePlayHelper()) != null) {
            numValueOf = Integer.valueOf(livePlayHelper.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("pauseLive: pauseAll:");
        sbLIZ2.append(z);
        sbLIZ2.append(", scene=");
        sbLIZ2.append(enumC2176021AEe);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c599820Nfo.getClass();
        C599820Nfo.LIZ(strLIZIZ, strLIZIZ2);
        if (this.LLJJIJIL) {
            this.LLJJIJIL = false;
            if (!this.LLJJJ) {
                LJJJJL("play_break");
                LJJJJI("play_break");
                LJJJJIZL(this, "card_emit_stop");
            }
        }
        this.LLJI = false;
        LJJIJL(false);
        LJJJJJL(Boolean.FALSE);
        C599820Nfo.LIZ("MMKLive", "pauseLive: pauseInternal force");
        LJJIZ(enumC2176021AEe);
    }

    public final void LJJJI(String str, Map<String, ? extends Object> map) {
        C1298720jtu c1298720jtu;
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        String str2 = this.LLILZLL;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("uuid", str2);
        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), str, linkedHashMap);
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    public final void LJJJIL(String str, String str2, Map<String, Object> map) {
        if (!this.LLJILLL) {
            this.LLJILLL = true;
            C418601k0.LIZ(new AwS38S2200000_32(str2, str, (String) map, (Map<String, Object>) this, (MMKLynxLiveView) 0));
            if (!Intrinsics.LJFF(map.get("code"), Integer.valueOf(EnumC1782940wUu.SUCCESS.getCode()))) {
                LJJJI("error", map);
            }
        }
    }
}
