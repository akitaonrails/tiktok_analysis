package com.ss.android.ugc.aweme.feed.landscape.component;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C054G;
import X.C086I;
import X.C0DMU;
import X.C0PN0;
import X.C0SZF;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C13LE;
import X.C13LP;
import X.C1481060oe0;
import X.C1484690ojr;
import X.C15438062q;
import X.C1558520qew;
import X.C1637806bA;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C622680Oba;
import X.C711330RvH;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C726540Sei;
import X.C726590Sen;
import X.C726680Sew;
import X.C729980SkG;
import X.C736680Sv4;
import X.C736950SvV;
import X.InterfaceC0148002o;
import X.InterfaceC1209780haS;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC21503119Dh;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ARunnableS22S0101000_11;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.LandscapeExitResetViewModel;
import com.ss.android.ugc.aweme.LandscapeInnerSyncViewModel;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedFragment;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFragmentPanel;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedDataLoadLogicAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeLoadMoreAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeProfilePanelAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel;
import com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeCacheViewModel;
import com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFYPViewModel;
import com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeProfileViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeFeedDataLoadLogicComponent extends BasePanelComponent implements LandscapeFeedDataLoadLogicAbility, InterfaceC1209780haS, InterfaceC724530SbT, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public volatile boolean LL;
    public boolean LLILLJJLI;
    public long LLILZ;
    public boolean LLILZIL;
    public BaseDetailShareVM<?, ?, ?> LLILZLL;
    public final AssemVMLazy LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public final C01GW LLJILJIL;
    public boolean LLJILJILJ;
    public C711330RvH LLJILLL;
    public final Map<Integer, List<Function2<List<? extends Aweme>, Boolean, Unit>>> LLJJ;
    public final C726590Sen LLJJI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 409));
    public final C736950SvV LLIZ = new C736950SvV(C13LE.LIZ(LandscapeInnerSyncViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(205), new AwS555S0100000_11((AbstractC738140SxQ) this, 407), new C451610HnL(this, true, true), new C723700Sa8(this));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LandscapeFeedDataLoadLogicComponent.class, "landscapeCacheVM", "getLandscapeCacheVM()Lcom/ss/android/ugc/aweme/feed/landscape/viewmodels/LandscapeCacheViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ boolean B1(C0PN0<Aweme> c0pn0) {
        return false;
    }

    @Override // X.InterfaceC728550Shx
    public final void G90(Pair<Integer, ? extends Aweme> pair) {
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void IK(int[] iArr) {
    }

    @Override // X.InterfaceC728550Shx
    public final /* synthetic */ void JK1() {
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void Js(List<Aweme> list) {
    }

    @Override // X.InterfaceC1212360hec
    public final void LJ() {
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void LLLZZIL(List<Aweme> list) {
    }

    @Override // X.InterfaceC1212360hec
    public final void Ng1() {
    }

    @Override // X.InterfaceC653820Pki
    public final void Pc2(List<Aweme> list) {
    }

    @Override // X.InterfaceC1209780haS
    public final void S() {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void SY() {
    }

    @Override // X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void V1(int i, Aweme aweme) {
    }

    @Override // X.InterfaceC1255930imt
    public final void Y1(int i) {
    }

    @Override // X.InterfaceC653820Pki
    public final void YB1(Exception exc) {
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1611563263) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC728550Shx
    public final void qJ1(Exception exc) {
    }

    @Override // X.InterfaceC1255930imt
    public final void w(int i, List list) {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void zK() {
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Sen] */
    public LandscapeFeedDataLoadLogicComponent() {
        C13LE.LIZ(LandscapeExitResetViewModel.class);
        AFwS243S0000000_11.get$arr$(206);
        new AwS555S0100000_11((AbstractC738140SxQ) this, 408);
        new C451610HnL(this, true, true);
        new C723700Sa8(this);
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LandscapeCacheViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 406), AFwS243S0000000_11.get$arr$(204), null, true);
        this.LLJ = true;
        this.LLJI = true;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 405));
        this.LLJJ = new LinkedHashMap();
        this.LLJJI = new InterfaceC21503119Dh() { // from class: X.0Sen
            @Override // X.InterfaceC21503119Dh
            public final Context LIZJ(Context context) {
                return context;
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJFF() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJII() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJIL(Activity activity, Context context) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIFFI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJII(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIII() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIJZLJL(BaseActivity baseActivity, boolean z) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIZ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIIJI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIIJIL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIL(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJL(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJLIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIL(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIZ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJ(BaseActivity baseActivity, Configuration configuration) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJI() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJIL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJ(BaseActivity baseActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJI() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJIZL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJJ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJJL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void finish() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC21503119Dh
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                return false;
            }

            @Override // X.InterfaceC21503119Dh
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void onUserInteraction() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void u1(int i, Intent intent) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedDataLoadLogicAbility
    public final void PS1() {
        BaseDetailShareVM<?, ?, ?> baseDetailShareVM;
        if (this.LL || !this.LLJI) {
            Wi(new Exception("can't load latest"));
            return;
        }
        this.LL = true;
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 == null || (baseDetailShareVM = this.LLILZLL) == null) {
            return;
        }
        C2189821An6 c2189821An62 = getPanelContext().LIZJ;
        baseDetailShareVM.request(2, c2189821An6, c2189821An62 != null ? c2189821An62.getPageType() : -1, false);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final LandscapeFeedViewPagerAbility m196do() {
        return (LandscapeFeedViewPagerAbility) this.LLILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedDataLoadLogicAbility
    public final void iw2() {
        C054G c054g = C0DMU.LIZ;
        C0DMU.LIZIZ("landscape_feed_manual_load_more", new JSONObject());
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM196do = m196do();
        int iLJLLJ = landscapeFeedViewPagerAbilityM196do != null ? landscapeFeedViewPagerAbilityM196do.LJLLJ() : 0;
        C711330RvH c711330RvH = this.LLJILLL;
        fo(iLJLLJ, c711330RvH != null ? c711330RvH.getCount() : 0, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f7, code lost:
    
        r7.LLIZLLLIL = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ff, code lost:
    
        if ((!r1.isHasMore()) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0201, code lost:
    
        r5.invoke(java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0206, code lost:
    
        r7.LLILZLL = r8.getUid();
        r7.LLILZIL = !kotlin.jvm.internal.Intrinsics.LJFF(r8.getFrom(), "others_homepage");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021a, code lost:
    
        if (r7._initialized != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021c, code lost:
    
        r7.AQ2(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0221, code lost:
    
        if (X.C1603960rqE.LIZ != r1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0223, code lost:
    
        X.C1603960rqE.LIZ = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0225, code lost:
    
        r6 = (com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0229, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r8.isFromPostList() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r8.isFromPostList() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r7 = new androidx.lifecycle.SharedViewModelProvider(new androidx.lifecycle.ViewModelProvider.NewInstanceFactory());
        r6 = getLifecycle();
        r1 = X.C2188811AlT.LIZ();
        r1.append("landscapeprofile");
        r1.append(r8.getUid());
        r6 = r7.get(r6, X.C2188811AlT.LIZIZ(r1), com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeProfileViewModel.class);
        r7 = (com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeProfileViewModel) r6;
        r0 = X.C666390QBx.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
    
        if (r0 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        r0 = r0.getAid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        r7.LLIZ = r0;
        r1 = X.C1603960rqE.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r1 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        r5.invoke(java.lang.Boolean.FALSE);
        r6 = X.C494760Jak.LIZ(r10, r18);
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    @Override // X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onParentViewCreated() {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedDataLoadLogicComponent.onParentViewCreated():void");
    }

    @Override // X.InterfaceC1212360hec
    public final void Jm() {
        LandscapeLoadMoreAbility landscapeLoadMoreAbility = (LandscapeLoadMoreAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeLoadMoreAbility.class, null);
        if (landscapeLoadMoreAbility != null) {
            landscapeLoadMoreAbility.Jm();
        }
    }

    @Override // X.InterfaceC1209780haS
    public final Fragment getFragment() {
        return getPanelContext().LJ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
        BaseDetailShareVM<?, ?, ?> baseDetailShareVM = this.LLILZLL;
        if (baseDetailShareVM != null) {
            baseDetailShareVM.unInit();
        }
        C726540Sei c726540Sei = BaseActivity.Companion;
        C726590Sen c726590Sen = this.LLJJI;
        c726540Sei.getClass();
        BaseActivity.callback.LL.remove(c726590Sen);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLJILJILJ = true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        LandscapeProfileViewModel landscapeProfileViewModel;
        C0SZF c0szf;
        Aweme awemeLJJZZI;
        super.onResume();
        if (this.LLJILJILJ) {
            this.LLJILJILJ = false;
            BaseDetailShareVM<?, ?, ?> baseDetailShareVM = this.LLILZLL;
            String aid = null;
            if (!(baseDetailShareVM instanceof LandscapeProfileViewModel) || (landscapeProfileViewModel = (LandscapeProfileViewModel) baseDetailShareVM) == null) {
                return;
            }
            Object context = getContext();
            if ((context instanceof C0SZF) && (c0szf = (C0SZF) context) != null && (awemeLJJZZI = c0szf.LJJZZI()) != null) {
                aid = awemeLJJZZI.getAid();
            }
            landscapeProfileViewModel.LLIZ = aid;
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        LandscapeLoadMoreAbility landscapeLoadMoreAbility = (LandscapeLoadMoreAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeLoadMoreAbility.class, null);
        if (landscapeLoadMoreAbility != null) {
            landscapeLoadMoreAbility.showLoadMoreLoading();
        }
    }

    @Override // X.InterfaceC666290QBn
    public final void Uh(boolean z) {
        this.LLILLJJLI = z;
    }

    @Override // X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        LandscapeLoadMoreAbility landscapeLoadMoreAbility = (LandscapeLoadMoreAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeLoadMoreAbility.class, null);
        if (landscapeLoadMoreAbility != null) {
            landscapeLoadMoreAbility.Wi(exc);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void bD1(Exception exc) {
        LandscapeLoadMoreAbility landscapeLoadMoreAbility = (LandscapeLoadMoreAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeLoadMoreAbility.class, null);
        if (landscapeLoadMoreAbility != null) {
            landscapeLoadMoreAbility.Wi(exc);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLandscapeModeExit(X.C726580Sem r12) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedDataLoadLogicComponent.onLandscapeModeExit(X.0Sem):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedDataLoadLogicAbility
    public final void vK1(int i) {
        this.LLJIJIL = i;
    }

    public static List bo(List list, List list2) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Aweme) it2.next()).getAid());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (!arrayList.contains(((Aweme) obj).getAid())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // X.InterfaceC1212360hec
    public final void LLJJJIL(List<Aweme> list, boolean z) {
        List<Aweme> listLJJJLZIJ;
        this.LLJ = z;
        ko(list, false);
        C711330RvH c711330RvH = this.LLJILLL;
        if (c711330RvH != null) {
            listLJJJLZIJ = c711330RvH.LJJJLZIJ();
        } else {
            listLJJJLZIJ = null;
        }
        ho(0, z, listLJJJLZIJ);
    }

    @Override // X.InterfaceC1212360hec
    public final void Pj(List<Aweme> list, boolean z) {
        lo(list, z, false);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedDataLoadLogicAbility
    public final void as1(LandscapeProfileListViewModel landscapeProfileListViewModel, Aweme aweme) {
        List<Aweme> listLJJJLZIJ;
        VerticalViewPager verticalViewPagerSP1;
        landscapeProfileListViewModel.bindView(this);
        this.LLJ = landscapeProfileListViewModel.LJIIJJI();
        this.LLJI = true;
        List<Aweme> awemeList = landscapeProfileListViewModel.getAwemeList();
        this.LLILZLL = landscapeProfileListViewModel;
        C711330RvH c711330RvH = this.LLJILLL;
        if (c711330RvH != null) {
            c711330RvH.setData(awemeList);
        }
        C711330RvH c711330RvH2 = this.LLJILLL;
        if (c711330RvH2 != null) {
            listLJJJLZIJ = c711330RvH2.LJJJLZIJ();
        } else {
            listLJJJLZIJ = null;
        }
        int iLJFF = C729980SkG.LJFF(aweme, listLJJJLZIJ);
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM196do = m196do();
        if (landscapeFeedViewPagerAbilityM196do != null && (verticalViewPagerSP1 = landscapeFeedViewPagerAbilityM196do.sP1()) != null) {
            verticalViewPagerSP1.LJJIJLIJ(iLJFF, false);
        }
    }

    public final void ko(List<? extends Aweme> list, boolean z) {
        int count;
        String strZc;
        LandscapeFeedFragment landscapeFeedFragment;
        LandscapeFragmentPanel landscapeFragmentPanel;
        C711330RvH c711330RvH = this.LLJILLL;
        if (c711330RvH == null) {
            return;
        }
        int count2 = c711330RvH.getCount();
        C711330RvH c711330RvH2 = this.LLJILLL;
        if (c711330RvH2 != null) {
            c711330RvH2.setData(list);
        }
        C711330RvH c711330RvH3 = this.LLJILLL;
        if (c711330RvH3 != null) {
            count = c711330RvH3.getCount();
        } else {
            count = -1;
        }
        if (count2 < count && list != null && list.size() >= count && C1481060oe0.LJFF() && !C086I.LIZIZ(list)) {
            List<? extends Aweme> listSubList = list.subList(count2, count);
            C1484690ojr c1484690ojr = C1484690ojr.LIZ;
            boolean z2 = !z;
            Fragment fragment = getFragment();
            String eventType = null;
            if (!(fragment instanceof LandscapeFeedFragment) || (landscapeFeedFragment = (LandscapeFeedFragment) fragment) == null || (landscapeFragmentPanel = landscapeFeedFragment.LL) == null || (strZc = landscapeFragmentPanel.Zc()) == null) {
                strZc = "";
            }
            C2189821An6 c2189821An6 = getPanelContext().LIZJ;
            if (c2189821An6 != null) {
                eventType = c2189821An6.getEventType();
            }
            c1484690ojr.getClass();
            C1484690ojr.LIZIZ(listSubList, z2, z2, strZc, eventType, true);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void mE(List<Aweme> list, boolean z) {
        C711330RvH c711330RvH;
        List<Aweme> listLJJJLZIJ;
        this.LLJI = z;
        List<Aweme> listLJJJLZIJ2 = null;
        LandscapeLoadMoreAbility landscapeLoadMoreAbility = (LandscapeLoadMoreAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeLoadMoreAbility.class, null);
        if (landscapeLoadMoreAbility != null) {
            landscapeLoadMoreAbility.gC0(false);
        }
        this.LL = false;
        if (list != null && (c711330RvH = this.LLJILLL) != null && (listLJJJLZIJ = c711330RvH.LJJJLZIJ()) != null) {
            ko(C13LP.LJLIL(listLJJJLZIJ, bo(listLJJJLZIJ, list)), false);
        }
        C711330RvH c711330RvH2 = this.LLJILLL;
        if (c711330RvH2 != null) {
            listLJJJLZIJ2 = c711330RvH2.LJJJLZIJ();
        }
        ho(2, z, listLJJJLZIJ2);
    }

    public final void fo(int i, int i2, boolean z) {
        BaseDetailShareVM<?, ?, ?> baseDetailShareVM;
        int pageType;
        if (!this.LL && this.LLJ && (i2 - 1) - i <= 3) {
            this.LL = true;
            this.LLILLJJLI = !z;
            C2189821An6 c2189821An6 = getPanelContext().LIZJ;
            if (c2189821An6 != null && (baseDetailShareVM = this.LLILZLL) != null) {
                C2189821An6 c2189821An62 = getPanelContext().LIZJ;
                if (c2189821An62 != null) {
                    pageType = c2189821An62.getPageType();
                } else {
                    pageType = -1;
                }
                baseDetailShareVM.request(4, c2189821An6, pageType, false);
                return;
            }
            return;
        }
        Wi(new Exception("can't load more"));
    }

    public final void ho(int i, boolean z, List list) {
        List list2 = (List) ((LinkedHashMap) this.LLJJ).get(Integer.valueOf(i));
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((Function2) it2.next()).invoke(list, Boolean.valueOf(z));
            }
        }
    }

    public final void lo(List<Aweme> list, boolean z, boolean z2) {
        Aweme awemeLLLLLJLJLL;
        int count;
        List<Aweme> listLJJJLZIJ;
        boolean zSw;
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM196do;
        VerticalViewPager verticalViewPagerSP1;
        C711330RvH c711330RvH;
        List<Aweme> listLJJJLZIJ2;
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM196do2 = m196do();
        if (landscapeFeedViewPagerAbilityM196do2 != null) {
            awemeLLLLLJLJLL = landscapeFeedViewPagerAbilityM196do2.LLLLLJLJLL();
        } else {
            awemeLLLLLJLJLL = null;
        }
        int iLJFF = C729980SkG.LJFF(awemeLLLLLJLJLL, list);
        C711330RvH c711330RvH2 = this.LLJILLL;
        if (c711330RvH2 != null) {
            count = c711330RvH2.getCount();
        } else {
            count = -1;
        }
        this.LLJ = z;
        this.LL = false;
        if (list != null && (c711330RvH = this.LLJILLL) != null && (listLJJJLZIJ2 = c711330RvH.LJJJLZIJ()) != null) {
            List listBo = bo(listLJJJLZIJ2, list);
            if (!((ArrayList) listBo).isEmpty()) {
                ko(C13LP.LJLIL(listBo, listLJJJLZIJ2), true);
            }
        }
        C711330RvH c711330RvH3 = this.LLJILLL;
        if (c711330RvH3 != null) {
            listLJJJLZIJ = c711330RvH3.LJJJLZIJ();
        } else {
            listLJJJLZIJ = null;
        }
        ho(1, z, listLJJJLZIJ);
        if (!this.LLILZIL && (this.LLILZLL instanceof LandscapeFYPViewModel)) {
            this.LLILZIL = true;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", C726680Sew.LIZJ);
            c2344009Gk.LIZLLL(Math.abs(System.currentTimeMillis() - this.LLILZ), "load_time");
            c2344009Gk.LIZJ(z2 ? 1 : 0, "is_cache");
            if (!z2) {
                c2344009Gk.LJFF("fail_reason", "cache_slower_than_normal_refresh");
            }
            C20684815ws.LJIILLIIL("landscape_first_refresh_time", c2344009Gk.LIZ);
        }
        LandscapeLoadMoreAbility landscapeLoadMoreAbility = (LandscapeLoadMoreAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeLoadMoreAbility.class, null);
        if (landscapeLoadMoreAbility != null) {
            zSw = landscapeLoadMoreAbility.Sw();
        } else {
            zSw = false;
        }
        LandscapeProfilePanelAbility landscapeProfilePanelAbility = (LandscapeProfilePanelAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeProfilePanelAbility.class, null);
        if (landscapeProfilePanelAbility != null && landscapeProfilePanelAbility.LJJII()) {
            return;
        }
        if ((this.LLILLJJLI && (iLJFF != count - 1 || !zSw)) || (landscapeFeedViewPagerAbilityM196do = m196do()) == null || (verticalViewPagerSP1 = landscapeFeedViewPagerAbilityM196do.sP1()) == null) {
            return;
        }
        HandlerHook.viewPost(verticalViewPagerSP1, new ARunnableS22S0101000_11(iLJFF, this, 8));
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedDataLoadLogicAbility
    public final void zR(LifecycleOwner lifecycleOwner, final int i, final Function2<? super List<? extends Aweme>, ? super Boolean, Unit> function2) {
        if (((LinkedHashMap) this.LLJJ).get(Integer.valueOf(i)) == null) {
            this.LLJJ.put(Integer.valueOf(i), new ArrayList());
        }
        List list = (List) ((LinkedHashMap) this.LLJJ).get(Integer.valueOf(i));
        if (list != null) {
            list.add(function2);
        }
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedDataLoadLogicComponent$registerDataLoadListener$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    List list2 = (List) ((LinkedHashMap) this.LL.LLJJ).get(Integer.valueOf(i));
                    if (list2 != null) {
                        list2.remove(function2);
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
