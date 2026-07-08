package com.ss.android.ugc.aweme.feed.assem.desc;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0BOO;
import X.C0HHT;
import X.C0RD6;
import X.C0RFL;
import X.C0RQV;
import X.C0RQW;
import X.C0RQX;
import X.C0RQY;
import X.C0RRC;
import X.C0RT4;
import X.C0RT5;
import X.C0RZ1;
import X.C0S5G;
import X.C0S69;
import X.C0S6A;
import X.C0S6B;
import X.C0S6D;
import X.C0S6E;
import X.C0S6F;
import X.C0S6I;
import X.C0S6J;
import X.C0S6K;
import X.C0S6L;
import X.C0S6M;
import X.C0S6N;
import X.C0S6O;
import X.C0S6P;
import X.C0S6T;
import X.C0S6U;
import X.C0S6V;
import X.C0S6W;
import X.C0S6Y;
import X.C0S78;
import X.C0SBA;
import X.C0SIV;
import X.C10EU;
import X.C1255704vj;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1564680qos;
import X.C1591220rVg;
import X.C161N;
import X.C1637806bA;
import X.C1637906bB;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C19EG;
import X.C1ER1;
import X.C21415018rM;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C269530AhL;
import X.C299180Bo4;
import X.C452501pT;
import X.C608450Ntj;
import X.C622680Oba;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C715830S6b;
import X.C715860S6e;
import X.C717590SCv;
import X.C718770SHj;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C746760TRa;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC487330J9f;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.ViewOnLayoutChangeListenerC738740SyO;
import Y.AAListenerS170S0000000_11;
import Y.AAListenerS322S0100000_11;
import Y.ARunnableS111S0100000_11;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.ad.feed.IAdDescAreaReplaceService;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.GetRemainingWordCountWithoutHashtagAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.df.api.visualsearch.ISearchVisualSearchService;
import com.ss.android.ugc.aweme.tablet.api.IDeviceCapability;
import com.ss.android.ugc.aweme.translation.service.IAutoDubbingService;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaHeightMobAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes12.dex */
public class VideoDescAssem extends BaseCellSlotComponent<VideoDescAssem> implements InterfaceC487330J9f, InteractInfoDescAbility, ComponentPriorityProtocol, GetRemainingWordCountWithoutHashtagAbility, VideoDescProviderAbility, TranslationDelegateAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLJI;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new C0RRC(this));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new C0RZ1(this));
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C715860S6e LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final C01GW LLLFFI;
    public final InterfaceC1731706qJ LLLFZ;
    public final InterfaceC1731706qJ LLLI;
    public final InterfaceC1731706qJ LLLII;
    public final C01GW LLLIIII;
    public final InterfaceC1731706qJ LLLIIIIL;
    public final InterfaceC1731706qJ LLLIIIL;
    public Integer LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public C718770SHj LLLLII;
    public final int LLLLIIIILLL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public final ARunnableS111S0100000_11 LLLLIILLL;
    public ViewOnLayoutChangeListenerC738740SyO LLLLIL;
    public AnonymousClass0956 LLLLILI;
    public C0SIV LLLLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoDescAssem.class, "videoDescVM", "getVideoDescVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/VideoDescVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoDescAssem.class, "translationViewModel", "getTranslationViewModel()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(VideoDescAssem.class, "videoDiggVM", "getVideoDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(VideoDescAssem.class, "videoFavoriteVM", "getVideoFavoriteVM()Lcom/ss/android/ugc/aweme/feed/favorite/VideoFavoriteVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(VideoDescAssem.class, "translationDelegate", "getTranslationDelegate()Lcom/ss/android/ugc/aweme/translation/controller/TranslationDelegate;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(VideoDescAssem.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(VideoDescAssem.class, "smartSearchFeedCacheVM", "getSmartSearchFeedCacheVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/SmartSearchFeedCacheVM;", 0);
        c09r3.getClass();
        LLLLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    public VideoDescAssem() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C0S6E());
        this.LLJZ = c01gwLIZIZ;
        this.LLJZIJLIL = C452501pT.LIZIZ(new C0RT4());
        this.LLL = C452501pT.LIZIZ(new C0S6F());
        this.LLLF = new C715860S6e(this);
        this.LLLFF = ((ITranslationService) c01gwLIZIZ.getValue()).LJLJL(this);
        this.LLLFFI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C0S6W());
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoDiggVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLFZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, c1637906bB, new C0RQV(c19719912DlLIZ), null, new C0S6T());
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VideoFavoriteVM.class);
        this.LLLI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), null, c1637906bB, new C0RQW(c19719912DlLIZ2), null, new C0S6Y());
        this.LLLII = C161N.LIZIZ.LLIFFJFJJ(this);
        this.LLLIIII = C452501pT.LIZIZ(new C0S69(this));
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(ConstraintSizeVM.class);
        this.LLLIIIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c0hht, c1637906bB, new C0RQX(c19719912DlLIZ3), null, new C0S6U());
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(SmartSearchFeedCacheVM.class);
        this.LLLIIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new C0RQY(c19719912DlLIZ4), null, new C0S6V());
        this.LLLIILIL = C452501pT.LIZIZ(new C0S6B(this));
        this.LLLIL = C452501pT.LIZIZ(new C0S6K(this));
        this.LLLILZ = C452501pT.LIZIZ(new C0S6J(this));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 221));
        this.LLLILZLLLI = C452501pT.LIZIZ(new C0S6I(this));
        this.LLLIZZ = C452501pT.LIZIZ(new C0S6O(this));
        this.LLLJ = C452501pT.LIZIZ(new C0S6N(this));
        this.LLLJIL = C452501pT.LIZIZ(new C0S6L(this));
        this.LLLJL = C452501pT.LIZIZ(new C0S6M(this));
        this.LLLL = C452501pT.LIZIZ(new C0S6P(this));
        this.LLLLIIIILLL = 20;
        this.LLLLIILLL = new ARunnableS111S0100000_11(this, 21);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Fn1(ReusedUIAssem<? extends C03H5> reusedUIAssem, Function0<Unit> function0) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "left_container_description";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b9t;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final boolean Vo() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1354300871 || iHashCode == -78363505 || iHashCode == -16814679) {
            return this;
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    public final void Bp() {
        AnonymousClass0956 anonymousClass0956 = this.LLLLILI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLLILI = null;
        HandlerHook.viewRemoveCallbacks(LJJIJL(), this.LLLLIILLL);
        ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO = this.LLLLIL;
        if (viewOnLayoutChangeListenerC738740SyO != null && this.LLLLIILL) {
            Gp().removeOnLayoutChangeListener(viewOnLayoutChangeListenerC738740SyO);
        }
        this.LLLLIL = null;
        this.LLLLIILL = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.InteractInfoDescAbility
    public final void E8() {
        C718770SHj c718770SHj = this.LLLLII;
        if (c718770SHj == null) {
            c718770SHj = null;
        }
        VideoItemParams item = c718770SHj.LLILLJJLI.getItem();
        c718770SHj.LJLLLL(item != null ? item.getAweme() : null);
    }

    public final TuxTextView Ep() {
        return (TuxTextView) this.LLLIILIL.getValue();
    }

    public final FrameLayout Fp() {
        return (FrameLayout) this.LLLJIL.getValue();
    }

    public final LinearLayout Gp() {
        return (LinearLayout) this.LLLIZZ.getValue();
    }

    public final AssemViewModel<C0S5G> Ip() {
        return (AssemViewModel) this.LLLFF.getValue(this, LLLLJI[1]);
    }

    public final VideoDescVM Jp() {
        return (VideoDescVM) this.LLLF.getValue(this, LLLLJI[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        Aweme aweme;
        AnonymousClass0956 anonymousClass0956 = this.LLLLILI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLLILI = null;
        C718770SHj c718770SHj = this.LLLLII;
        if (c718770SHj != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onHolderUnselected: awemeId=");
            VideoItemParams item = c718770SHj.LLILLJJLI.getItem();
            sbLIZ.append((item == null || (aweme = item.getAweme()) == null) ? null : aweme.getAid());
            C2188811AlT.LIZIZ(sbLIZ);
            c718770SHj.LJJZZIII();
            IAdDescAreaReplaceService iAdDescAreaReplaceServiceLJJIZ = c718770SHj.LJJIZ();
            if (iAdDescAreaReplaceServiceLJJIZ != null) {
                iAdDescAreaReplaceServiceLJJIZ.LIZIZ();
            }
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(c19egLIZ, null);
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService != null) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                Fragment fragmentLIZLLL = iDetailFeedSafService.LIZLLL(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).fragment);
                if (fragmentLIZLLL != null) {
                    interfaceC665370Q7zLJI = C1558360qeg.LJFF(fragmentLIZLLL, null);
                }
            }
            if (C1558520qew.LIZ(interfaceC665370Q7zLJI, TranslationDelegateAbility.class, null) != null) {
                C1558520qew.LJIIJJI(interfaceC665370Q7zLJI, TranslationDelegateAbility.class, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationDelegateAbility
    public final C0SBA ME2() {
        return (C0SBA) this.LLLII.getValue(this, LLLLJI[4]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.InteractInfoDescAbility
    public final int fN1() {
        C0SIV c0siv = this.LLLLJ;
        if (c0siv != null) {
            return (int) c0siv.LJJZZI();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.InteractInfoDescAbility
    public final int JD1() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int height = LJJIJL().getHeight();
        ViewGroup.LayoutParams layoutParams = LJJIJL().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = 0;
        int i2 = height + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = LJJIJL().getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i = marginLayoutParams.bottomMargin;
        }
        return i2 + i;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    public final boolean Qp() {
        Context context = LJJIJL().getContext();
        IDeviceCapability iDeviceCapability = (IDeviceCapability) PluggableExtentionKt.pluggableSpi$default(IDeviceCapability.class, false, false, false, 14, null);
        if (iDeviceCapability == null) {
            return false;
        }
        return iDeviceCapability.k(context) || iDeviceCapability.m(context);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.InteractInfoDescAbility
    public final boolean TS0() {
        if (C1255704vj.LIZ().LIZ()) {
            ISearchVisualSearchService iSearchVisualSearchServiceLIZ = C1255704vj.LIZ();
            C724270Sb3 c724270Sb3 = this.LLJI;
            Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            Jp().getItem();
            SmartSearchFeedCacheVM smartSearchFeedCacheVM = (SmartSearchFeedCacheVM) this.LLLIIIL.getValue(this, LLLLJI[6]);
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (iSearchVisualSearchServiceLIZ.LJJIJL(aweme, c19egLIZ, fragmentLJI, smartSearchFeedCacheVM.vQ2(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme()))) {
                return false;
            }
        }
        C1ER1 c1er1 = C1ER1.LIZIZ;
        C724270Sb3 c724270Sb33 = this.LLJI;
        Aweme aweme2 = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme();
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        VideoItemParams item = Jp().getItem();
        String str = item != null ? item.mEventType : null;
        SmartSearchFeedCacheVM smartSearchFeedCacheVM2 = (SmartSearchFeedCacheVM) this.LLLIIIL.getValue(this, LLLLJI[6]);
        C724270Sb3 c724270Sb34 = this.LLJI;
        return c1er1.LLZLLIL(aweme2, c19egLIZ2, fragmentLJI2, str, smartSearchFeedCacheVM2.vQ2(((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).getAweme()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        if (X.C0S4N.LIZ(r2, r5, r0) == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Up() {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem.Up():void");
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.GetRemainingWordCountWithoutHashtagAbility
    public final int WH1() {
        return Jp().LLJIJIL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public void cp() {
        C622680Oba.LIZLLL(this);
        Bp();
        C718770SHj c718770SHj = this.LLLLII;
        if (c718770SHj == null) {
            c718770SHj = null;
        }
        c718770SHj.LJJLIIIJJI();
        if (C0RFL.LIZ()) {
            onDestroyView();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.InteractInfoDescAbility
    public final ObjectAnimator fs1() {
        if (LJJIJL().getVisibility() != 0) {
            return null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LJJIJL(), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.addListener(new AAListenerS170S0000000_11(0));
        objectAnimatorOfFloat.addListener(new AAListenerS322S0100000_11(this, 5));
        objectAnimatorOfFloat.addListener(new AAListenerS322S0100000_11(this, 6));
        return objectAnimatorOfFloat;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void hp() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ip() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public void onCreate() {
        boolean zLJI = MethodIDManager.LJI(202351);
        super.onCreate();
        C723830SaL.LIZ(this, null, new C0S6D(this));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void onDestroyView() {
        Bp();
        C718770SHj c718770SHj = this.LLLLII;
        if (c718770SHj == null) {
            c718770SHj = null;
        }
        c718770SHj.LJJLIIIJJI();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.InteractInfoDescAbility
    public final ObjectAnimator qI() {
        if (LJJIJL().getVisibility() != 8) {
            return null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LJJIJL(), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(350L);
        objectAnimatorOfFloat.addListener(new AAListenerS322S0100000_11(this, 9));
        objectAnimatorOfFloat.addListener(new AAListenerS322S0100000_11(this, 7));
        objectAnimatorOfFloat.addListener(new AAListenerS322S0100000_11(this, 8));
        return objectAnimatorOfFloat;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationDelegateAbility
    public final VideoDescVM qL() {
        return Jp();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void wr() {
        C717590SCv c717590SCv = Jp().LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoDescVM.LLJLLIL;
        c717590SCv.LIZIZ(null);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Tp, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
        Object obj;
        IAutoDubbingService iAutoDubbingServiceLIZ;
        InteractAreaCommonAbility interactAreaCommonAbility;
        if (LJJIJL().getVisibility() == 0 && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLLIL.getValue()) != null) {
            interactAreaCommonAbility.zB1(this);
        }
        C608450Ntj c608450Ntj = C608450Ntj.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        C718770SHj c718770SHj = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        ((VideoItemParams) obj).getAweme().getDesc();
        videoItemParams.getAweme().getAid();
        c608450Ntj.getClass();
        InteractAreaHeightMobAbility interactAreaHeightMobAbility = (InteractAreaHeightMobAbility) this.LLJLLL.getValue();
        if (interactAreaHeightMobAbility != null) {
            interactAreaHeightMobAbility.qd2(this);
        }
        C718770SHj c718770SHj2 = this.LLLLII;
        if (c718770SHj2 != null) {
            c718770SHj = c718770SHj2;
        }
        Aweme aweme = videoItemParams.getAweme();
        c718770SHj.getClass();
        if (C718770SHj.LJJIL(aweme)) {
            c718770SHj.LLLLLJIL = false;
            InteractInfoAreaAttachAbility interactInfoAreaAttachAbility = (InteractInfoAreaAttachAbility) c718770SHj.LLJJIJI.getValue();
            if (interactInfoAreaAttachAbility != null) {
                interactInfoAreaAttachAbility.T92(c718770SHj.LLLZ);
            }
        }
        c718770SHj.LJZ(aweme);
        if (C299180Bo4.LIZ() && !C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(videoItemParams.getAweme())) && (iAutoDubbingServiceLIZ = C0RT5.LIZ()) != null) {
            iAutoDubbingServiceLIZ.LJ(videoItemParams.getAweme());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_component_clickable", new C0S6A(this));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.InteractInfoDescAbility
    public final void gY1(int i) {
        C786410Ut5.LJLLLLLL(i, LJJIJL());
    }

    @C14EU
    public void onFeedRefreshEvent(C1564680qos c1564680qos) {
        if (c1564680qos == null) {
            return;
        }
        C718770SHj c718770SHj = this.LLLLII;
        if (c718770SHj == null) {
            c718770SHj = null;
        }
        c718770SHj.LJIIL("others");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0230  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r23) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
        vr((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: zp */
    public final void vr(VideoItemParams videoItemParams) {
        VideoDescVM videoDescVMJp = Jp();
        Context context = getContext();
        C717590SCv c717590SCv = videoDescVMJp.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoDescVM.LLJLLIL;
        c717590SCv.LIZIZ(context);
        this.LLLLJ = videoItemParams.videoCellDescAbility;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Fragment fragmentLIZLLL;
        VideoDescAssem videoDescAssem;
        Object obj;
        String str;
        C19EG c19egLIZ;
        Aweme aweme2;
        String aid;
        IAdDescAreaReplaceService iAdDescAreaReplaceServiceLJJIZ;
        C718770SHj c718770SHj = this.LLLLII;
        if (c718770SHj != null) {
            VideoItemParams item = c718770SHj.LLILLJJLI.getItem();
            if (item != null) {
                aweme2 = item.getAweme();
            } else {
                aweme2 = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onHolderSelected: awemeId=");
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
            IAdDescAreaReplaceService iAdDescAreaReplaceServiceLJJIZ2 = c718770SHj.LJJIZ();
            if (iAdDescAreaReplaceServiceLJJIZ2 != null) {
                iAdDescAreaReplaceServiceLJJIZ2.LJI(aweme2, new AwS590S0100000_11(c718770SHj, 456));
            }
            if (c718770SHj.LLJZ != null && (iAdDescAreaReplaceServiceLJJIZ = c718770SHj.LJJIZ()) != null) {
                C21415018rM c21415018rM = c718770SHj.LLJZ;
                if (c21415018rM == null) {
                    c21415018rM = null;
                }
                iAdDescAreaReplaceServiceLJJIZ.LIZLLL(aweme2, c21415018rM, new AwS555S0100000_11(c718770SHj, 1495), new AwS555S0100000_11(c718770SHj, 1496));
            }
        }
        if (((Boolean) C269530AhL.LIZ.getValue()).booleanValue() && Qp() && this.LLLLILI == null && ((c19egLIZ = C724240Sb0.LIZ(this)) != null || (c19egLIZ = C724240Sb0.LIZ(this)) != null)) {
            this.LLLLILI = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C715830S6b(c19egLIZ, this, null), 3);
        }
        if (((Boolean) C0BOO.LIZ.getValue()).booleanValue()) {
            VideoItemParams item2 = Jp().getItem();
            if (item2 != null) {
                str = item2.mEventType;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "personal_homepage") && !C746760TRa.LIZ().LJJIJLIJ() && !C746760TRa.LIZ().LJJIFFI()) {
                C0S78.LJFF(true, new AwS571S0100000_27(this, 1120));
                C746760TRa.LIZ().LJJZZIII();
            }
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(c19egLIZ2, null);
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService != null) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                fragmentLIZLLL = iDetailFeedSafService.LIZLLL(((VideoItemParams) obj).fragment);
                if (fragmentLIZLLL != null) {
                    interfaceC665370Q7zLJI = C1558360qeg.LJFF(fragmentLIZLLL, null);
                }
            } else {
                fragmentLIZLLL = null;
            }
            if (C1558520qew.LIZ(interfaceC665370Q7zLJI, TranslationDelegateAbility.class, null) == null || fragmentLIZLLL != null) {
                if (C1591220rVg.LIZLLL()) {
                    videoDescAssem = this;
                } else {
                    videoDescAssem = null;
                }
                C1558520qew.LJII(interfaceC665370Q7zLJI, this, TranslationDelegateAbility.class, null, videoDescAssem);
            }
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLILLIZIL().LLIIII(Gp(), new AwS590S0100000_11(this, 389));
    }
}
