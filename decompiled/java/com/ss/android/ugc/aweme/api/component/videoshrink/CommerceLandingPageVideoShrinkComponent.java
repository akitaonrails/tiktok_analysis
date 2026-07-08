package com.ss.android.ugc.aweme.api.component.videoshrink;

import X.AbstractC1023470cjx;
import X.AnonymousClass0956;
import X.C013C;
import X.C01GW;
import X.C098200Yq;
import X.C0CAU;
import X.C0N0Y;
import X.C1010120cOQ;
import X.C1017180cZo;
import X.C1022620cia;
import X.C1029890cuJ;
import X.C1029900cuK;
import X.C1029910cuL;
import X.C1029960cuQ;
import X.C1058500deS;
import X.C1391190mJ3;
import X.C1440005kM;
import X.C1483410ohn;
import X.C1558520qew;
import X.C16BC;
import X.C1757130vpH;
import X.C189200o6;
import X.C2188811AlT;
import X.C299110Bnx;
import X.C418440Gaw;
import X.C424860GlI;
import X.C452501pT;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1024080ckw;
import X.InterfaceC1034470d1h;
import X.InterfaceC1036270d4b;
import X.InterfaceC1039570d9v;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ARunnableS49S0300000_16;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ad.feed.component.videoshrink.ICommerceLandingPageVideoShrinkAbility;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.VideoCommonShrinkAbility;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceLandingPageVideoShrinkComponent extends BaseCellLogicComponent<CommerceLandingPageVideoShrinkComponent> implements InterfaceC1039570d9v, InterfaceC1036270d4b, InterfaceC1024080ckw, ICommerceLandingPageVideoShrinkAbility, InterfaceC1554640qYg {
    public C1029890cuJ LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public volatile boolean LLJJLIIIJLLLLLLLZ;
    public TuxSheet LLJL;
    public InterfaceC1034470d1h LLJLIL;
    public float LLJLL;
    public boolean LLJLLIL;
    public AnonymousClass0956 LLJZIJLIL;
    public Integer LLL;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 78));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 77));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new C424860GlI(this));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 26));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 76));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(109));
    public int LLJLILLLLZIIL = -1;
    public long LLJLLL = Long.MAX_VALUE;
    public long LLJZ = -1;

    @Override // X.InterfaceC1036270d4b
    public final void Gn(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC1039570d9v
    public final void I1(String str, boolean z) {
    }

    @Override // X.InterfaceC1036270d4b
    public final void Pu(InterfaceC1034470d1h interfaceC1034470d1h) {
    }

    @Override // X.InterfaceC1036270d4b
    public final void Rg(InterfaceC1034470d1h interfaceC1034470d1h) {
    }

    @Override // X.InterfaceC1036270d4b
    public final void V() {
    }

    @Override // X.InterfaceC1036270d4b
    public final void Yc() {
    }

    @Override // X.InterfaceC1036270d4b
    public final void ni(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 148873772) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC1039570d9v
    public final void ze(long j) {
    }

    public final View Bo() {
        return (View) this.LLJJJ.getValue();
    }

    public final C16BC<?> Co() {
        Fragment fragment;
        InterfaceC1034470d1h interfaceC1034470d1h = this.LLJLIL;
        if (interfaceC1034470d1h == null || (fragment = interfaceC1034470d1h.getFragment()) == null) {
            return null;
        }
        String str = TuxSheet._pnsPageId;
        return C1391190mJ3.LJIIIZ(fragment);
    }

    public final C1058500deS Eo() {
        return (C1058500deS) this.LLJJJIL.getValue();
    }

    public final IFeedVideoShrinkService Fo() {
        return (IFeedVideoShrinkService) this.LLJJJJ.getValue();
    }

    @Override // X.InterfaceC1024080ckw
    public final boolean I3() {
        VideoCommonShrinkAbility videoCommonShrinkAbility = (VideoCommonShrinkAbility) this.LLJJIJI.getValue();
        if (videoCommonShrinkAbility != null) {
            return videoCommonShrinkAbility.I3();
        }
        return false;
    }

    @Override // X.InterfaceC1024080ckw
    public final boolean LLJLILLLLZIIL() {
        return this.LLJL != null;
    }

    @Override // X.InterfaceC1024080ckw
    public final void LJJIZ() {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        View view2;
        ViewParent parent;
        AwemeRawAd awemeRawAd;
        LandingPageConfig landingPageConfig;
        Integer num;
        InterfaceC1034470d1h interfaceC1034470d1h;
        Fragment fragment;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onLoadFinish]，hasLoadFinish: ");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        C1022620cia.LIZ("CommerceLandingPageVideoShrinkComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = true;
        Jo(this.LLJLILLLLZIIL);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJLLL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        View view3 = null;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (landingPageConfig = awemeRawAd.getLandingPageConfig()) != null && (num = landingPageConfig.whileLoadingFinishFullScreenType) != null && num.intValue() == 1 && jCurrentTimeMillis <= this.LLJZ) {
            if (!this.LLJJLIIIJLLLLLLLZ || this.LLJLILLLLZIIL != 4 || (interfaceC1034470d1h = this.LLJLIL) == null || (fragment = interfaceC1034470d1h.getFragment()) == null) {
                return;
            }
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJIIIIZZ(fragment, true);
            C1029890cuJ c1029890cuJ = this.LLJJJJJIL;
            if (c1029890cuJ != null) {
                Integer num2 = this.LLL;
                C1029900cuK.LIZ.getClass();
                c1029890cuJ.logAd(C1029900cuK.LIZIZ, new C1029910cuL(1, 1, 1, num2, c1029890cuJ));
                return;
            }
            return;
        }
        if (!this.LLJJLIIIJLLLLLLLZ || this.LLJLILLLLZIIL == 3) {
            return;
        }
        TuxSheet tuxSheet = this.LLJL;
        ViewParent parent2 = (tuxSheet == null || (view2 = tuxSheet.getView()) == null || (parent = view2.getParent()) == null) ? null : parent.getParent();
        if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
            viewGroup2.setClipChildren(false);
        }
        TuxSheet tuxSheet2 = this.LLJL;
        ViewParent parent3 = (tuxSheet2 == null || (view = tuxSheet2.getView()) == null) ? null : view.getParent();
        if (!(parent3 instanceof ViewGroup) || (viewGroup = (ViewGroup) parent3) == null) {
            return;
        }
        viewGroup.setClipChildren(false);
        View view4 = (View) this.LLJJIJIL.getValue();
        if (view4 != null) {
            C786410Ut5.T4(view4, 1.0f);
            view3 = view4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-50));
        No(view3, viewGroup, marginLayoutParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJL() {
        IFeedVideoShrinkService iFeedVideoShrinkServiceFo = Fo();
        if (iFeedVideoShrinkServiceFo != null) {
            iFeedVideoShrinkServiceFo.LLJLLIL(null, true);
        }
        IFeedVideoShrinkService iFeedVideoShrinkServiceFo2 = Fo();
        if (iFeedVideoShrinkServiceFo2 != null) {
            iFeedVideoShrinkServiceFo2.LLJZIJLIL(null, true);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IFeedVideoShrinkService iFeedVideoShrinkServiceFo = Fo();
        if (iFeedVideoShrinkServiceFo != null) {
            iFeedVideoShrinkServiceFo.LLJLLIL(null, true);
        }
        IFeedVideoShrinkService iFeedVideoShrinkServiceFo2 = Fo();
        if (iFeedVideoShrinkServiceFo2 != null) {
            iFeedVideoShrinkServiceFo2.LLJZIJLIL(null, true);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.component.videoshrink.ICommerceLandingPageVideoShrinkAbility
    public final boolean xy() {
        return LLJLILLLLZIIL() && this.LLJLILLLLZIIL == 3;
    }

    public final void Ho(int i) {
        C1757130vpH c1757130vpHU8;
        if (i == 3) {
            InterfaceC1034470d1h interfaceC1034470d1h = this.LLJLIL;
            if (interfaceC1034470d1h != null) {
                c1757130vpHU8 = interfaceC1034470d1h.U8();
            } else {
                c1757130vpHU8 = null;
            }
            if (c1757130vpHU8 == null) {
                Lo(false);
            }
            C1440005kM.LIZ(new C1029960cuQ(getContext(), false));
            return;
        }
        if (this.LLJLILLLLZIIL == 3 && i != 3) {
            Lo(true);
            C1440005kM.LIZ(new C1029960cuQ(getContext(), true));
        } else {
            C1440005kM.LIZ(new C1029960cuQ(getContext(), true));
        }
    }

    public final void Jo(int i) {
        BottomSheetBehavior bottomSheetBehavior;
        TuxSheetBehavior tuxSheetBehavior;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[prohibitDragIfNeed]，hasLoadFinish = ");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        sbLIZ.append(", newState: ");
        sbLIZ.append(i);
        C1022620cia.LIZ("CommerceLandingPageVideoShrinkComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJLIIIJLLLLLLLZ && i == 3) {
            if (C299110Bnx.LIZ()) {
                C16BC<?> c16bcCo = Co();
                if ((c16bcCo instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bcCo) != null) {
                    tuxSheetBehavior.LJIJI = false;
                    return;
                }
                return;
            }
            C16BC<?> c16bcCo2 = Co();
            if (!(c16bcCo2 instanceof BottomSheetBehavior) || (bottomSheetBehavior = (BottomSheetBehavior) c16bcCo2) == null) {
                return;
            }
            bottomSheetBehavior.setDraggable(false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        if (this.LLJLILLLLZIIL == 3) {
            C1440005kM.LIZ(new C1029960cuQ(getContext(), false));
        }
    }

    public final void Lo(boolean z) {
        Object obj;
        Object obj2;
        C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
        if (c0n0yLJLJJI != null && c0n0yLJLJJI.isPaused() == (!z)) {
            return;
        }
        if (z) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj2 = c724270Sb3.LL;
            } else {
                obj2 = null;
            }
            DataCenter dataCenter = ((VideoItemParams) obj2).dataCenter;
            if (dataCenter != null) {
                dataCenter.zQ2(null, "ad_feed_resume_video");
                return;
            }
            return;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj = c724270Sb32.LL;
        } else {
            obj = null;
        }
        DataCenter dataCenter2 = ((VideoItemParams) obj).dataCenter;
        if (dataCenter2 == null) {
            return;
        }
        dataCenter2.zQ2(null, "ad_feed_pause_video");
    }

    @Override // X.InterfaceC1024080ckw
    public final void jk(JSONObject jSONObject) throws JSONException {
        Object obj;
        AwemeRawAd awemeRawAd;
        LandingPageConfig landingPageConfig;
        JSONObject jSONObject2;
        if (LLJLILLLLZIIL()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj2 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (landingPageConfig = awemeRawAd.getLandingPageConfig()) != null && landingPageConfig.whileLoadingTimingType == 1) {
                Object obj3 = jSONObject.get("iab_load_progress_update");
                if ((obj3 instanceof JSONObject) && (jSONObject2 = (JSONObject) obj3) != null) {
                    obj2 = jSONObject2.get("progressType");
                }
                if (Intrinsics.LJFF(obj2, "tti")) {
                    LJJIZ();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C1029890cuJ c1029890cuJ;
        AwemeRawAd awemeRawAd;
        int i;
        AwemeRawAd awemeRawAd2;
        NativeSiteConfig nativeSiteConfig;
        String str;
        VideoItemParams videoItemParams2 = videoItemParams;
        Go(videoItemParams2.getAweme(), false);
        Aweme aweme = videoItemParams2.getAweme();
        String webUrl = null;
        if (aweme != null) {
            final Object[] objArr = {aweme};
            c1029890cuJ = new AbstractC1023470cjx(objArr) { // from class: X.0cuJ
                public final C1023630ckD<?>[] LIZ;

                @Override // X.AbstractC1023380cjo, X.C1023640ckE
                public final C1023630ckD<?>[] getInternalLogics() {
                    return this.LIZ;
                }

                {
                    super(Arrays.copyOf(objArr, objArr.length));
                    this.LIZ = new C1023630ckD[0];
                }
            };
        } else {
            c1029890cuJ = 0;
        }
        this.LLJJJJJIL = c1029890cuJ;
        Aweme aweme2 = videoItemParams2.getAweme();
        if (aweme2 != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null && (nativeSiteConfig = awemeRawAd2.getNativeSiteConfig()) != null && (str = nativeSiteConfig.lynxScheme) != null) {
            webUrl = str;
        } else {
            Aweme aweme3 = videoItemParams2.getAweme();
            if (aweme3 != null && (awemeRawAd = aweme3.getAwemeRawAd()) != null) {
                webUrl = awemeRawAd.getWebUrl();
            }
        }
        IAdLynxLandPageUtils iAdLynxLandPageUtils = (IAdLynxLandPageUtils) PluggableExtentionKt.pluggableSpi$default(IAdLynxLandPageUtils.class, false, false, false, 14, null);
        if (iAdLynxLandPageUtils != null && iAdLynxLandPageUtils.LIZ(webUrl)) {
            i = 0;
        } else {
            i = 1;
        }
        this.LLL = i;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent
    /* JADX INFO: renamed from: zo */
    public final boolean ur(VideoItemParams videoItemParams) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        LandingPageConfig landingPageConfig;
        Integer num;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (landingPageConfig = awemeRawAd2.getLandingPageConfig()) != null && (num = landingPageConfig.webWatchWhileLoadingType) != null && num.intValue() == 1) {
            return true;
        }
        Aweme aweme2 = videoItemParams.getAweme();
        if (aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null && C1010120cOQ.LJJJI(awemeRawAd)) {
            return true;
        }
        return false;
    }

    public final void Go(Aweme aweme, boolean z) {
        Aweme aweme2;
        Object c098200Yq;
        boolean z2;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        LandingPageConfig landingPageConfig;
        Integer num;
        Object obj;
        Object obj2 = null;
        if (aweme == null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            aweme2 = ((VideoItemParams) obj).getAweme();
        } else {
            aweme2 = aweme;
        }
        try {
            c098200Yq = Boolean.valueOf(C1010120cOQ.LJJIIJ(aweme2));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        boolean zBooleanValue = ((Boolean) c098200Yq).booleanValue();
        AwemeRawAd awemeRawAd3 = aweme2.getAwemeRawAd();
        boolean z3 = true;
        if (awemeRawAd3 != null && C1017180cZo.LJJII(awemeRawAd3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (zBooleanValue && z2) {
            this.LLJJJJLIIL = false;
            return;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        Aweme aweme3 = ((VideoItemParams) obj2).getAweme();
        if ((aweme3 == null || (awemeRawAd2 = aweme3.getAwemeRawAd()) == null || (landingPageConfig = awemeRawAd2.getLandingPageConfig()) == null || (num = landingPageConfig.webWatchWhileLoadingType) == null || num.intValue() != 1) && (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || !C1010120cOQ.LJJJI(awemeRawAd))) {
            z3 = false;
        }
        this.LLJJJJLIIL = z3;
        if (z3) {
            IFeedVideoShrinkService iFeedVideoShrinkServiceFo = Fo();
            if (iFeedVideoShrinkServiceFo != null) {
                iFeedVideoShrinkServiceFo.LLJLLIL(this, z);
            }
            IFeedVideoShrinkService iFeedVideoShrinkServiceFo2 = Fo();
            if (iFeedVideoShrinkServiceFo2 != null) {
                iFeedVideoShrinkServiceFo2.LLJZIJLIL(this, z);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Go(aweme, true);
    }

    @Override // X.InterfaceC1036270d4b
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        View view;
        float f2 = this.LLJLL;
        if (!Float.isNaN(f2) && !Float.isNaN(f)) {
            if (Math.abs(f2 - f) < 1.0E-7f) {
                return;
            }
        } else if (Float.isNaN(f2) && Float.isNaN(f)) {
            return;
        }
        this.LLJLL = f;
        if (!this.LLJJL) {
            Eo().LLLFFI(tuxSheet, f);
        }
        if (f > 0.0f) {
            float f3 = 1 - f;
            View view2 = (View) this.LLJJIJIL.getValue();
            if (((view2 == null || view2.getParent() == null) && this.LLJJLIIIJLLLLLLLZ) || (view = (View) this.LLJJIJIL.getValue()) == null) {
                return;
            }
            C786410Ut5.T4(view, f3);
        }
    }

    @Override // X.InterfaceC1036270d4b
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        int i2;
        C1029890cuJ c1029890cuJ;
        int i3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onStateChanged]，newState: ");
        sbLIZ.append(i);
        C1022620cia.LIZ("CommerceLandingPageVideoShrinkComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJJL) {
            Eo().LLLLIIIILLL(tuxSheet, i);
        }
        if (i == 1) {
            this.LLJLLIL = true;
        }
        Jo(i);
        Ho(i);
        if (this.LLJLLIL && (((i2 = this.LLJLILLLLZIIL) == 1 || i2 == 2) && (c1029890cuJ = this.LLJJJJJIL) != null)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        i3 = -1;
                    } else {
                        i3 = 0;
                    }
                } else {
                    i3 = 2;
                }
            } else {
                i3 = 1;
            }
            boolean z = this.LLJJLIIIJLLLLLLLZ;
            Integer num = this.LLL;
            if (i3 != -1) {
                C1029900cuK.LIZ.getClass();
                c1029890cuJ.logAd(C1029900cuK.LIZIZ, new C1029910cuL(i3, z ? 1 : 0, 0, num, c1029890cuJ));
            }
        }
        this.LLJLILLLLZIIL = i;
    }

    public static void No(View view, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        ViewGroup viewGroup2;
        if (view == null || Intrinsics.LJFF(view.getParent(), viewGroup)) {
            return;
        }
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup2);
            }
        }
        viewGroup.addView(view, layoutParams);
    }

    @Override // X.InterfaceC1039570d9v
    public final void C1(Long l, int i, List list) {
        LJJIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    @Override // X.InterfaceC1036270d4b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s8(com.bytedance.tux.sheet.sheet.TuxSheet r8, X.InterfaceC1034470d1h r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.api.component.videoshrink.CommerceLandingPageVideoShrinkComponent.s8(com.bytedance.tux.sheet.sheet.TuxSheet, X.0d1h, java.lang.String):void");
    }

    @Override // X.InterfaceC1036270d4b
    public final void ha(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str, String str2) {
        int iHashCode;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (tuxSheet == null) {
            return;
        }
        if (this.LLJJL) {
            this.LLJJL = false;
            C1022620cia.LIZ("CommerceLandingPageVideoShrinkComponent", "[onHide] skip shrink-collapse for suppressed sheet");
            return;
        }
        this.LLJLLL = Long.MAX_VALUE;
        this.LLJZ = -1L;
        AnonymousClass0956 anonymousClass0956 = this.LLJZIJLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onHide] adWebRefer = ");
        sbLIZ.append(str2);
        sbLIZ.append(" isLandingPageExpand(): ");
        sbLIZ.append(xy());
        C1022620cia.LIZ("CommerceLandingPageVideoShrinkComponent", C2188811AlT.LIZIZ(sbLIZ));
        Lo(true);
        View view = (View) this.LLJJIJIL.getValue();
        if (view != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup2);
            }
        }
        View viewBo = Bo();
        if (viewBo != null) {
            C786410Ut5.LJLLLLLL(8, viewBo);
        }
        View viewBo2 = Bo();
        if (viewBo2 != null) {
            ViewParent parent2 = viewBo2.getParent();
            if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                C786410Ut5.LJJJLZIJ(viewBo2, viewGroup);
            }
        }
        ((IAdLandingPagePopUpService) ServiceManager.get().getService(IAdLandingPagePopUpService.class)).LJIJ();
        C1440005kM.LIZ(new C1029960cuQ(getContext(), true));
        C013C c013c = new C013C();
        if (this.LLJJJJLIIL) {
            Eo().G2(4);
            C1029890cuJ c1029890cuJ = this.LLJJJJJIL;
            if (c1029890cuJ != null) {
                Integer num = this.LLL;
                C1029900cuK.LIZ.getClass();
                c1029890cuJ.logAd(C1029900cuK.LIZJ, new AwS382S0200000_16(num, c1029890cuJ, 72));
            }
            if (this.LLJJJJLIIL && str2 != null && ((iHashCode = str2.hashCode()) == -1260269013 ? str2.equals("result_ad_mask_button") : iHashCode == -837632724 ? str2.equals("result_ad_button") : !(iHashCode != -8923327 || !str2.equals("result_ad_video"))) && Intrinsics.LJFF(str, "system_back") && !xy()) {
                c013c.element = true;
            }
        }
        C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS49S0300000_16(interfaceC1034470d1h, this, c013c, 3));
    }
}
