package com.ss.android.ugc.aweme.ecommerce.search.vision.mix;

import X.AnonymousClass0956;
import X.C019F;
import X.C099R;
import X.C0HA4;
import X.C13IQ;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C674850QdX;
import X.C675280QeE;
import X.C675670Qer;
import X.C675790Qf3;
import X.C676160Qfe;
import X.C676320Qfu;
import X.C676810Qgh;
import X.C676840Qgk;
import X.C677400Qhe;
import X.C677480Qhm;
import X.C678130Qip;
import X.C678150Qir;
import X.C679080QkM;
import X.C679090QkN;
import X.C679100QkO;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import X.InterfaceC1554640qYg;
import X.InterfaceC214897198d;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC602590NkH;
import X.InterfaceC665370Q7z;
import X.InterfaceC676500QgC;
import X.InterfaceC676520QgE;
import X.InterfaceC679310Qkj;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability.MixJSBAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.ability.IPhotoSearchMixContainerAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.ability.IPhotoSearchRootFragmentAbility;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.IECMixContentPlayAbility;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class MixPhotoSearchAssem extends UISlotAssem implements IMixVSearchAbility, IECMixContentPlayAbility, IPhotoSearchMixContainerAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJJI;
    public LinearLayout LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public PhotoSearchBaseVM LLJJIJIIJIL;
    public C678130Qip LLJJIJIL;
    public C675670Qer LLJJJ;
    public SearchResultParam LLJJJIL;
    public AnonymousClass0956 LLJJJJ;
    public boolean LLJJJJJIL;
    public final C675790Qf3 LLJJJJLIIL;
    public final C679100QkO LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixPhotoSearchAssem.class, "mixShopBizVM", "getMixShopBizVM()Lcom/ss/android/ugc/aweme/ecommerce/search/page/mix/MixShopSearchBizVM;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Qf3] */
    public MixPhotoSearchAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixShopSearchBizVM.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 170), AFwS241S0000000_10.get$arr$(85), null, true);
        this.LLJJJJLIIL = new InterfaceC679310Qkj() { // from class: X.0Qf3
            @Override // X.InterfaceC679310Qkj
            public final C679100QkO LIZ() {
                return this.LIZ.LLJJL;
            }

            @Override // X.InterfaceC679310Qkj
            public final C0HA4 LIZIZ() {
                C678130Qip c678130Qip = this.LIZ.LLJJIJIL;
                if (c678130Qip != null) {
                    return c678130Qip.LJI;
                }
                return null;
            }

            @Override // X.InterfaceC679310Qkj
            public final SearchResultParam LIZJ() {
                return this.LIZ.LLJJJIL;
            }
        };
        C679100QkO c679100QkO = new C679100QkO();
        c679100QkO.LJFF(new C679090QkN(c679100QkO));
        c679100QkO.LJFF(new C679080QkM(c679100QkO));
        c679100QkO.LJFF(new C676840Qgk(c679100QkO));
        this.LLJJL = c679100QkO;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.duy;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -104154882) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.ability.IPhotoSearchMixContainerAbility
    public final C0HA4 Bu1() {
        C678130Qip c678130Qip = this.LLJJIJIL;
        if (c678130Qip != null) {
            return c678130Qip.LJI;
        }
        return null;
    }

    public final MixShopSearchBizVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (MixShopSearchBizVM) assemVMLazy.getValue();
    }

    public final FrameLayout ip() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ug0) : null;
            this.LLJJI = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final void kp() throws Exception {
        FrameLayout frameLayoutIp;
        C677400Qhe c677400QheLIZ;
        C678130Qip c678130Qip;
        IPhotoSearchRootFragmentAbility iPhotoSearchRootFragmentAbility;
        try {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ == null || (frameLayoutIp = ip()) == null) {
                return;
            }
            View viewFindViewById = this.LLJJIII;
            C678130Qip c678130QipLIZLLL = null;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.w81) : null;
                this.LLJJIII = (LinearLayout) viewFindViewById;
            }
            LinearLayout linearLayout = (LinearLayout) viewFindViewById;
            if (linearLayout == null) {
                return;
            }
            this.LLJJJIL = new SearchResultParam();
            this.LLJJJ = new C675670Qer(frameLayoutIp, linearLayout, this, this.LLJJIJIIJIL, hp(), this.LLJJL, this);
            PhotoSearchBaseVM photoSearchBaseVM = this.LLJJIJIIJIL;
            this.LLJJJIL = C675670Qer.LIZJ(photoSearchBaseVM != null ? photoSearchBaseVM.LLILLL : null);
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            if (interfaceC665370Q7zLJIIL == null || (iPhotoSearchRootFragmentAbility = (IPhotoSearchRootFragmentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IPhotoSearchRootFragmentAbility.class, null)) == null || iPhotoSearchRootFragmentAbility.c41() == null) {
                SAFHelper.LIZ.getClass();
                SAFHelper.LJFF(frameLayoutIp, c19egLIZ);
            }
            C675670Qer c675670Qer = this.LLJJJ;
            if (c675670Qer != null) {
                c675670Qer.LJII = new C678130Qip(c19egLIZ, C724240Sb0.LJI(this), (ViewGroup) c675670Qer.LIZ, c675670Qer.LIZIZ, c675670Qer.LJ);
                c678130QipLIZLLL = c675670Qer.LIZLLL();
            }
            this.LLJJIJIL = c678130QipLIZLLL;
            C675670Qer c675670Qer2 = this.LLJJJ;
            if (c675670Qer2 == null || (c677400QheLIZ = c675670Qer2.LIZ(this.LLJJJIL)) == null || (c678130Qip = this.LLJJIJIL) == null) {
                return;
            }
            c678130Qip.LIZIZ(c677400QheLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    public final MixJSBAbility lp() {
        C678130Qip c678130Qip = this.LLJJIJIL;
        if (c678130Qip != null) {
            return c678130Qip.LJIILIIL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IECMixContentPlayAbility
    public final InterfaceC676520QgE pC1() {
        C678150Qir c678150Qir;
        C678130Qip c678130Qip = this.LLJJIJIL;
        if (c678130Qip == null || (c678150Qir = c678130Qip.LJIILL) == null) {
            return null;
        }
        return c678150Qir.LL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final boolean Bs() {
        Boolean boolValueOf;
        C677480Qhm c677480Qhm;
        MixJSBAbility mixJSBAbilityLp = lp();
        if (mixJSBAbilityLp != null) {
            boolValueOf = Boolean.valueOf(mixJSBAbilityLp.Bs());
        } else {
            C678130Qip c678130Qip = this.LLJJIJIL;
            boolValueOf = (c678130Qip == null || (c677480Qhm = c678130Qip.LJIILJJIL) == null) ? null : Boolean.valueOf(c677480Qhm.LIZLLL());
        }
        return Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final View Ce() {
        View viewCe;
        MixJSBAbility mixJSBAbilityLp = lp();
        return (mixJSBAbilityLp == null || (viewCe = mixJSBAbilityLp.Ce()) == null) ? ip() : viewCe;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C676320Qfu.LIZJ(AFwS241S0000000_10.get$arr$(84));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, IECMixContentPlayAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, IMixVSearchAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLJJJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, IECMixContentPlayAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, IMixVSearchAbility.class, null);
        }
        C676810Qgh.LIZ.getClass();
        C676810Qgh.LIZJ = null;
        C676810Qgh.LIZLLL.clear();
        C676810Qgh.LJ.clear();
        C675280QeE.LIZIZ = null;
        C675280QeE.LIZ.clear();
        C678130Qip c678130Qip = this.LLJJIJIL;
        if (c678130Qip != null) {
            c678130Qip.LIZLLL();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C678130Qip c678130Qip = this.LLJJIJIL;
        if (c678130Qip != null) {
            Iterator it2 = ((ArrayList) c678130Qip.LJFF).iterator();
            while (it2.hasNext()) {
                ((InterfaceC676500QgC) it2.next()).onResume();
            }
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() throws Exception {
        View view;
        View viewFindViewById;
        super.xo();
        try {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI == null || (view = fragmentLJI.getView()) == null || (viewFindViewById = view.findViewById(R.id.ug0)) == null) {
                throw new IllegalStateException("search_vertical_page not found in MixPhotoSearchAssem");
            }
            Ao(viewFindViewById);
            if (C724240Sb0.LIZ(this) instanceof InterfaceC214897198d) {
                Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                if (fragmentLJI2 != null) {
                    PhotoSearchBaseVM photoSearchBaseVMLIZJ = C676160Qfe.LIZJ(fragmentLJI2);
                    photoSearchBaseVMLIZJ.LLJLL = this;
                    this.LLJJIJIIJIL = photoSearchBaseVMLIZJ;
                }
            } else {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    PhotoSearchBaseVM photoSearchBaseVMLIZ = C676160Qfe.LIZ(C724240Sb0.LJI(this), c19egLIZ);
                    photoSearchBaseVMLIZ.LLJLL = this;
                    this.LLJJIJIIJIL = photoSearchBaseVMLIZ;
                }
            }
            View viewFindViewById2 = this.LLJJIII;
            if (viewFindViewById2 == null) {
                View viewLJJIJL = LJJIJL();
                viewFindViewById2 = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.w81) : null;
                this.LLJJIII = (LinearLayout) viewFindViewById2;
            }
            LinearLayout linearLayout = (LinearLayout) viewFindViewById2;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
            FrameLayout frameLayoutIp = ip();
            if (frameLayoutIp != null) {
                C786410Ut5.LJZ(0, frameLayoutIp);
            }
            kp();
            C723850SaN.LIZLLL(this, new AwS589S0100000_10(this, 527));
            PhotoSearchBaseVM photoSearchBaseVM = this.LLJJIJIIJIL;
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            PhotoSearchBaseVM photoSearchBaseVM2 = this.LLJJIJIIJIL;
            C674850QdX c674850QdX = photoSearchBaseVM2 != null ? photoSearchBaseVM2.LLILZLL : null;
            if (photoSearchBaseVM == null || c19egLIZ2 == null || c674850QdX == null || this.LLJJJJJIL) {
                return;
            }
            if (c674850QdX.isReady() || c674850QdX.forceRequest) {
                photoSearchBaseVM.DQ2(c674850QdX);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final Map<String, Object> Su(Map<String, String> map) {
        MixJSBAbility mixJSBAbilityLp = lp();
        if (mixJSBAbilityLp != null) {
            return mixJSBAbilityLp.Su(map);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final void jP2(int i) {
        MixJSBAbility mixJSBAbilityLp = lp();
        if (mixJSBAbilityLp != null) {
            mixJSBAbilityLp.jP2(i);
        } else {
            hp().LLJJIJIL.setValue(Integer.valueOf(i));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final void sv(String str) {
        MixJSBAbility mixJSBAbilityLp = lp();
        if (mixJSBAbilityLp != null) {
            mixJSBAbilityLp.sv(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final boolean uY1(boolean z) {
        MixJSBAbility mixJSBAbilityLp = lp();
        if (mixJSBAbilityLp != null) {
            mixJSBAbilityLp.uY1(z);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OP0(X.InterfaceC602810Nkd r6, X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C675710Qev
            if (r0 == 0) goto L43
            r4 = r7
            X.0Qev r4 = (X.C675710Qev) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L49
            X.C155000ia.LIZIZ(r3)
        L22:
            if (r3 != 0) goto L30
        L24:
            kotlin.Pair r3 = new kotlin.Pair
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "mix container not ready"
            r3.<init>(r1, r0)
        L30:
            return r3
        L31:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability.MixJSBAbility r0 = r5.lp()
            if (r0 == 0) goto L24
            r4.LLILLL = r1
            java.lang.Object r3 = r0.OP0(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L43:
            X.0Qev r4 = new X.0Qev
            r4.<init>(r5, r7)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.mix.MixPhotoSearchAssem.OP0(X.0Nkd, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final void OR0(View view, InterfaceC602590NkH interfaceC602590NkH) {
        MixJSBAbility mixJSBAbilityLp = lp();
        if (mixJSBAbilityLp != null) {
            mixJSBAbilityLp.OR0(view, interfaceC602590NkH);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final void Se(int i, Map<String, String> map) {
        MixJSBAbility mixJSBAbilityLp = lp();
        if (mixJSBAbilityLp != null) {
            mixJSBAbilityLp.Se(i, map);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final Map X22(String str, String str2, Map map, Map map2) {
        MixJSBAbility mixJSBAbilityLp = lp();
        if (mixJSBAbilityLp != null) {
            return mixJSBAbilityLp.X22(str, str2, map, map2);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final Object XW(View view, String str, String str2, Integer num, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        MixJSBAbility mixJSBAbilityLp = lp();
        if (mixJSBAbilityLp != null) {
            Object objXW = mixJSBAbilityLp.XW(view, str, str2, num, interfaceC1364105Vn);
            if (objXW == C099R.LJFF()) {
                return objXW;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }
}
