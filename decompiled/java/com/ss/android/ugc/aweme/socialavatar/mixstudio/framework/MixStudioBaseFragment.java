package com.ss.android.ugc.aweme.socialavatar.mixstudio.framework;

import X.AnonymousClass0951;
import X.AnonymousClass1430;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C09R3;
import X.C0C64;
import X.C0H6Q;
import X.C0HKU;
import X.C0HOD;
import X.C0HOM;
import X.C0HQV;
import X.C0HS8;
import X.C0HSC;
import X.C0HSD;
import X.C0HSE;
import X.C0HSG;
import X.C0HSH;
import X.C0PEM;
import X.C0TSA;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1365870leD;
import X.C1372405Ys;
import X.C1372805Yw;
import X.C1373105Yz;
import X.C1389890mGx;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C15438062q;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C168Q;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C19F0;
import X.C19GS;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C338520DOw;
import X.C345280DgE;
import X.C439010HJj;
import X.C440270HOf;
import X.C440440HOw;
import X.C440680HPu;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C461720I8s;
import X.C622680Oba;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C987103tV;
import X.EnumC440890HQp;
import X.EnumC441640HTm;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC440230HOb;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.ss.android.ugc.aweme.socialavatar.api.mixstudio.MixStudioShareService;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseFragment;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageViewModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdSelectionCache;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioUseFriendsIDExpConfig;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioBaseFragment extends BaseFragment implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYjKiYyJCQ6KDsyOmshIDHELIOScgPDAoICB9LjctJCokJzcnZwI6MBY4PCs6JwctOioVOiQrJCo9PA==";
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final C736950SvV LLJ;
    public FrameLayout LLJI;
    public final Map<EnumC440890HQp, View> LLJIJIL;
    public final C736950SvV LLJILJIL;
    public final C736950SvV LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C19F0<String> LLJJI;
    public final C01GW LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixStudioBaseFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/framework/MixStudioBaseViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MixStudioBaseFragment.class, "resultVM", "getResultVM()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/resultspage/MixStudioResultsPageViewModel;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    public MixStudioBaseFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        boolean z2;
        boolean z3;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixStudioBaseViewModel.class);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c19719912DlLIZ, 612);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(310);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS550S0100000_6, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 613), aFwS236S0000000_6, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS550S0100000_6, new AwS550S0100000_6((Fragment) this, 614), aFwS236S0000000_6, null, null, null);
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS550S0100000_6, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 615), aFwS236S0000000_6, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MixStudioResultsPageViewModel.class);
        AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6(c19719912DlLIZ2, 616);
        AFwS236S0000000_6 aFwS236S0000000_62 = AFwS236S0000000_6.get$arr$(311);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS550S0100000_62, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 617), aFwS236S0000000_62, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
            z3 = false;
            z2 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS550S0100000_62, new AwS550S0100000_6((Fragment) this, 618), aFwS236S0000000_62, null, null, null);
            z2 = true;
            z3 = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z2 = true;
            z3 = false;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS550S0100000_62, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 611), aFwS236S0000000_62, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MixStudioHomePageViewModel.class);
        AFwS236S0000000_6 aFwS236S0000000_63 = AFwS236S0000000_6.get$arr$(312);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, z3);
        C451620HnM c451620HnM = new C451620HnM(this, z2);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJ = new C736950SvV(c19719912DlLIZ3, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS236S0000000_63, c451460Hn6, c451620HnM, c338520DOw);
        this.LLJIJIL = new LinkedHashMap();
        AwS550S0100000_6 awS550S0100000_63 = new AwS550S0100000_6(this, 610);
        this.LLJILJIL = new C736950SvV(C13LE.LIZ(IMStickerPanelEventViewModel.class), awS550S0100000_63, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS236S0000000_6.get$arr$(313), new C451460Hn6(this, z3), new C451620HnM(this, z2), new C338520DOw(this));
        this.LLJILJILJ = new C736950SvV(C13LE.LIZ(IdAndElementViewModel.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS236S0000000_6.get$arr$(309), new C451460Hn6(this, z3), new C451620HnM(this, z2), new C338520DOw(this));
        this.LLJILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(148));
        this.LLJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(147));
        this.LLJJI = registerForActivityResult(new AnonymousClass1430(), new C168Q() { // from class: X.0HSB
            @Override // X.C168Q
            public final void LIZ(Object obj) {
                Context context;
                if (((Boolean) obj).booleanValue() && (context = this.LIZ.getContext()) != null) {
                    MixStudioBaseFragment mixStudioBaseFragment = this.LIZ;
                    mixStudioBaseFragment.UR().CQ2(context, mixStudioBaseFragment.getChildFragmentManager());
                }
            }
        });
        this.LLJJIII = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(149));
    }

    public final MixStudioStatusRepository SR() {
        return (MixStudioStatusRepository) this.LLJJIII.getValue();
    }

    public final MixStudioResultsPageViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (MixStudioResultsPageViewModel) assemVMLazy.getValue();
    }

    public final MixStudioBaseViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (MixStudioBaseViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (UR().yQ2().LLIZLLLIL.isInDM()) {
            ((AssemViewModel) this.LLJILJIL.getValue()).setState(new AwS21S0010000_6(true, 21));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        List<C440440HOw> list;
        Map<String, C13IQ<? extends Object>> mapLJ;
        Map<String, List<String>> mapLJIILL;
        String str;
        Map<String, C13IQ<? extends Object>> mapLJ2;
        Map<String, List<String>> mapLJIILL2;
        Map<String, C13IQ<? extends Object>> mapLJ3;
        Map<String, List<String>> mapLJIILL3;
        C1372405Ys c1372405Ys;
        IdSelectionCache idSelectionCache;
        super.onStop();
        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb = ((C440270HOf) this.LLJ.getValue().getState()).LL;
        String str2 = VR().wQ2().LLILZIL;
        if (C0H6Q.LIZ()) {
            if (interfaceC440230HOb instanceof C0HKU) {
                IdSelectionCache idSelectionCache2 = (IdSelectionCache) this.LLJJ.getValue();
                if (idSelectionCache2 != null) {
                    idSelectionCache2.LIZ(str2, Collections.singletonList(new Pair(0, C461720I8s.LIZIZ())));
                }
            } else if (interfaceC440230HOb instanceof C0HOD) {
                C0HOM<? extends List<C440440HOw>> value = ((C0HOD) interfaceC440230HOb).LIZ.getValue();
                if ((value instanceof C1372405Ys) && (c1372405Ys = (C1372405Ys) value) != null && (idSelectionCache = (IdSelectionCache) this.LLJJ.getValue()) != null) {
                    Iterable<C440440HOw> iterable = (Iterable) c1372405Ys.LIZIZ;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
                    for (C440440HOw c440440HOw : iterable) {
                        arrayList.add(new Pair(Integer.valueOf(c440440HOw.LJ), c440440HOw.LIZJ));
                    }
                    idSelectionCache.LIZ(str2, arrayList);
                }
            } else {
                IdSelectionCache idSelectionCache3 = (IdSelectionCache) this.LLJJ.getValue();
                if (idSelectionCache3 != null) {
                    idSelectionCache3.LIZ(str2, C13BV.INSTANCE);
                }
            }
        } else if (interfaceC440230HOb instanceof C0HKU) {
            Object value2 = ((AnonymousClass0951) ((C0HKU) interfaceC440230HOb).getState()).getValue();
            if ((value2 instanceof C1372405Ys) && value2 != null) {
                MixStudioStatusRepository mixStudioStatusRepositorySR = SR();
                if (mixStudioStatusRepositorySR != null && (mapLJIILL3 = mixStudioStatusRepositorySR.LJIILL()) != null) {
                    mapLJIILL3.put(str2, Collections.singletonList(C461720I8s.LIZIZ()));
                }
                MixStudioStatusRepository mixStudioStatusRepositorySR2 = SR();
                if (mixStudioStatusRepositorySR2 != null && (mapLJ3 = mixStudioStatusRepositorySR2.LJ()) != null) {
                    mapLJ3.put(str2, C13LE.LIZ(C0HKU.class));
                }
            }
        } else if (interfaceC440230HOb instanceof C1372805Yw) {
            C440440HOw c440440HOw2 = ((C1372805Yw) interfaceC440230HOb).LIZ;
            if (c440440HOw2 != null && (str = c440440HOw2.LIZJ) != null) {
                MixStudioStatusRepository mixStudioStatusRepositorySR3 = SR();
                if (mixStudioStatusRepositorySR3 != null && (mapLJIILL2 = mixStudioStatusRepositorySR3.LJIILL()) != null) {
                    mapLJIILL2.put(str2, Collections.singletonList(str));
                }
                MixStudioStatusRepository mixStudioStatusRepositorySR4 = SR();
                if (mixStudioStatusRepositorySR4 != null && (mapLJ2 = mixStudioStatusRepositorySR4.LJ()) != null) {
                    mapLJ2.put(str2, C13LE.LIZ(C1372805Yw.class));
                }
            }
        } else if ((interfaceC440230HOb instanceof C1373105Yz) && (list = ((C1373105Yz) interfaceC440230HOb).LIZ) != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C440440HOw> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().LIZJ);
            }
            MixStudioStatusRepository mixStudioStatusRepositorySR5 = SR();
            if (mixStudioStatusRepositorySR5 != null && (mapLJIILL = mixStudioStatusRepositorySR5.LJIILL()) != null) {
                mapLJIILL.put(str2, arrayList2);
            }
            MixStudioStatusRepository mixStudioStatusRepositorySR6 = SR();
            if (mixStudioStatusRepositorySR6 != null && (mapLJ = mixStudioStatusRepositorySR6.LJ()) != null) {
                mapLJ.put(str2, C13LE.LIZ(C1373105Yz.class));
            }
        }
        if (UR().yQ2().LLIZLLLIL.isInDM()) {
            ((AssemViewModel) this.LLJILJIL.getValue()).setState(new AwS21S0010000_6(false, 21));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C622680Oba.LIZJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onMixStudioStoryPublishEvent(C0HSH c0hsh) {
        MixStudioShareService mixStudioShareService = (MixStudioShareService) PluggableExtentionKt.pluggableSpi$default(MixStudioShareService.class, false, false, false, 14, null);
        if (mixStudioShareService != null) {
            mixStudioShareService.LIZ(this);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onShareCompleteEvent(C1365870leD c1365870leD) {
        C19EG activity;
        String strLIZ;
        if (!c1365870leD.LJIILIIL && (activity = getActivity()) != null && (strLIZ = C345280DgE.LIZ(activity, c1365870leD)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIJ(strLIZ);
            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        C0HSD c0hsd;
        String str;
        Emoji emoji;
        MixStudioLauncher.ImageWithPromptPrefill imageWithPromptPrefill;
        Serializable serializable2;
        EnumC441640HTm enumC441640HTm;
        String string;
        String string2;
        MixStudioLauncher.PushInfo pushInfo;
        Boolean boolValueOf;
        boolean z;
        MixStudioLauncher.IdAndElementConfiguration idAndElementConfiguration;
        boolean z2;
        MixStudioLauncher.GenerationConfiguration generationConfiguration;
        Serializable serializable3;
        FriendsIDInfo friendsIDInfo;
        List<String> list;
        String str2;
        boolean z3;
        Bundle arguments;
        Bundle arguments2;
        MixStudioLauncher.PrefillInfo prefillInfo;
        super.onViewCreated(view, bundle);
        Bundle arguments3 = getArguments();
        if (arguments3 != null && arguments3.containsKey("MixStudioBaseFragment_input_landingPage")) {
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                serializable = arguments4.getSerializable("MixStudioBaseFragment_input_landingPage");
            } else {
                serializable = null;
            }
            if ((serializable instanceof C0HSD) && (c0hsd = (C0HSD) serializable) != null) {
                if (C0HSC.LIZ[c0hsd.ordinal()] == 1) {
                    EnumC440890HQp enumC440890HQp = EnumC440890HQp.LOADING;
                    Bundle arguments5 = getArguments();
                    if (arguments5 != null && arguments5.containsKey("MixStudioBaseFragment_input_prefill") && (arguments2 = getArguments()) != null && (prefillInfo = (MixStudioLauncher.PrefillInfo) arguments2.getParcelable("MixStudioBaseFragment_input_prefill")) != null) {
                        str = prefillInfo.prefillText;
                        emoji = prefillInfo.prefillEmoji;
                        imageWithPromptPrefill = prefillInfo.prefillImage;
                    } else {
                        str = null;
                        emoji = null;
                        imageWithPromptPrefill = null;
                    }
                    Bundle arguments6 = getArguments();
                    if (arguments6 != null && arguments6.containsKey("MixStudioBaseFragment_input_enterFrom")) {
                        Bundle arguments7 = getArguments();
                        if (arguments7 != null) {
                            serializable2 = arguments7.getSerializable("MixStudioBaseFragment_input_enterFrom");
                        } else {
                            serializable2 = null;
                        }
                        if ((serializable2 instanceof EnumC441640HTm) && (enumC441640HTm = (EnumC441640HTm) serializable2) != null) {
                            Bundle arguments8 = getArguments();
                            if (arguments8 == null || (string = arguments8.getString("MixStudioBaseFragment_input_enterFrom_mob")) == null) {
                                string = "";
                            }
                            Bundle arguments9 = getArguments();
                            if (arguments9 != null && (string2 = arguments9.getString("MixStudioBaseFragment_sticker_vm_key")) != null) {
                                Bundle arguments10 = getArguments();
                                if (arguments10 != null && arguments10.containsKey("MixStudioBaseFragment_push_info") && (arguments = getArguments()) != null) {
                                    pushInfo = (MixStudioLauncher.PushInfo) arguments.getParcelable("MixStudioBaseFragment_push_info");
                                } else {
                                    pushInfo = null;
                                }
                                Bundle arguments11 = getArguments();
                                if (arguments11 != null && arguments11.containsKey("MixStudioBaseFragment_is_animated")) {
                                    Bundle arguments12 = getArguments();
                                    if (arguments12 != null) {
                                        z3 = arguments12.getBoolean("MixStudioBaseFragment_is_animated");
                                    } else {
                                        z3 = false;
                                    }
                                    boolValueOf = Boolean.valueOf(z3);
                                } else {
                                    boolValueOf = null;
                                }
                                Bundle arguments13 = getArguments();
                                if (arguments13 != null && arguments13.containsKey("MixStudioBaseFragment_id_and_element_configuration")) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    Bundle arguments14 = getArguments();
                                    if (arguments14 != null && (idAndElementConfiguration = (MixStudioLauncher.IdAndElementConfiguration) arguments14.getParcelable("MixStudioBaseFragment_id_and_element_configuration")) != null) {
                                        Bundle arguments15 = getArguments();
                                        if (arguments15 != null && arguments15.containsKey("MixStudioBaseFragment_generation_configuration")) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            Bundle arguments16 = getArguments();
                                            if (arguments16 != null && (generationConfiguration = (MixStudioLauncher.GenerationConfiguration) arguments16.getParcelable("MixStudioBaseFragment_generation_configuration")) != null) {
                                                Bundle arguments17 = getArguments();
                                                if (arguments17 != null) {
                                                    serializable3 = arguments17.getSerializable("MixStudioBaseFragment_input_friendsIDInfo");
                                                } else {
                                                    serializable3 = null;
                                                }
                                                if (serializable3 instanceof FriendsIDInfo) {
                                                    friendsIDInfo = (FriendsIDInfo) serializable3;
                                                } else {
                                                    friendsIDInfo = null;
                                                }
                                                C723850SaN.LIZ(this, false, null, new C440680HPu(this, enumC440890HQp, str, emoji, imageWithPromptPrefill, string2, pushInfo, boolValueOf, enumC441640HTm, friendsIDInfo, string, idAndElementConfiguration, generationConfiguration), 3);
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("friend list=");
                                                if (friendsIDInfo != null) {
                                                    list = friendsIDInfo.friendUidList;
                                                } else {
                                                    list = null;
                                                }
                                                sbLIZ.append(list);
                                                sbLIZ.append(", default friend uid=");
                                                if (friendsIDInfo != null) {
                                                    str2 = friendsIDInfo.defaultFriendUid;
                                                } else {
                                                    str2 = null;
                                                }
                                                sbLIZ.append(str2);
                                                C2188811AlT.LIZIZ(sbLIZ);
                                                MixStudioBaseViewModel mixStudioBaseViewModelVR = VR();
                                                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                                                MixStudioUseFriendsIDExpConfig mixStudioUseFriendsIDExpConfig = C0HSE.LIZ;
                                                MixStudioUseFriendsIDExpConfig mixStudioUseFriendsIDExpConfig2 = (MixStudioUseFriendsIDExpConfig) c0c64LJIILLIIL.LJJII(MixStudioUseFriendsIDExpConfig.class, mixStudioUseFriendsIDExpConfig, "mix_studio_use_friends_id", true);
                                                if (mixStudioUseFriendsIDExpConfig2 != null) {
                                                    mixStudioUseFriendsIDExpConfig = mixStudioUseFriendsIDExpConfig2;
                                                }
                                                if (mixStudioUseFriendsIDExpConfig.enabled != 0) {
                                                    C0HSG.LIZ.getClass();
                                                    if (!C0HSG.LIZIZ().getBoolean("has_sent_use_friends_id_notification", false)) {
                                                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(mixStudioBaseViewModelVR), C0PEM.LIZJ, null, new C439010HJj(null), 2);
                                                    }
                                                }
                                                C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.0HS6
                                                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                                                    public final Object get(Object obj) {
                                                        return ((C440510HPd) obj).LL;
                                                    }
                                                }, null, new C0HS8(this), 6);
                                                C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.0HPz
                                                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                                                    public final Object get(Object obj) {
                                                        return ((C440510HPd) obj).LLILZ;
                                                    }
                                                }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 67), 4);
                                                FragmentManager childFragmentManager = getChildFragmentManager();
                                                C0HQV.LIZ.getClass();
                                                childFragmentManager.LLIIIJ("STICKER_RESULT", this, new C0TSA() { // from class: X.0HS9
                                                    @Override // X.C0TSA
                                                    public final void LIZ(Bundle bundle2, String str3) {
                                                        Context context;
                                                        C0HQV.LIZ.getClass();
                                                        if (Intrinsics.LJFF(str3, "STICKER_RESULT") && bundle2.getBoolean("DOWNLOADED_RESULT") && (context = this.LIZ.getContext()) != null) {
                                                            C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
                                                            c1389890mGx.LJIIJ(context.getString(2131835868));
                                                            c1389890mGx.LJIIJJI();
                                                        }
                                                    }
                                                });
                                                if (C0H6Q.LIZ()) {
                                                    C736680Sv4.LJIIIIZZ(this, this.LLJILJILJ.getValue(), new C2217381BqS() { // from class: X.0HPy
                                                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                                                        public final Object get(Object obj) {
                                                            return ((C0HPZ) obj).LL;
                                                        }
                                                    }, null, new AwS620S0100000_6(this, 68), 6);
                                                    return;
                                                }
                                                return;
                                            }
                                            throw new IllegalArgumentException("The generation configuration must be passed into MixStudio");
                                        }
                                        throw new IllegalArgumentException("The generation configuration must be passed into MixStudio");
                                    }
                                    throw new IllegalArgumentException("The Id and element configuration must be passed into MixStudio");
                                }
                                throw new IllegalArgumentException("The Id and element configuration must be passed into MixStudio");
                            }
                            throw new IllegalArgumentException("has to pass in sticker vm key into MixStudio");
                        }
                        throw new IllegalArgumentException("Unrecognized enter from");
                    }
                    throw new IllegalArgumentException("The enter from must be passed into MixStudio");
                }
                throw new C1954807lC();
            }
            throw new IllegalArgumentException("Unrecognized landing page");
        }
        throw new IllegalArgumentException("The landing page must be passed into MixStudio");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        int iIntValue;
        Context context = getContext();
        C19GS c19gs = null;
        if (context == null) {
            frameLayout = null;
        } else {
            frameLayout = new FrameLayout(context);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            frameLayout.setBackgroundColor(iIntValue);
            this.LLJI = frameLayout;
        }
        if (!(frameLayout instanceof View)) {
            frameLayout = null;
        }
        if (frameLayout != null) {
            try {
                ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(frameLayout, this);
                frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return frameLayout;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return frameLayout;
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
