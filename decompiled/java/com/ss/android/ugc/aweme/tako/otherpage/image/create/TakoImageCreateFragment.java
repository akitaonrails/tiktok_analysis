package com.ss.android.ugc.aweme.tako.otherpage.image.create;

import X.AbstractC1177930gl5;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C04JC;
import X.C07Q7;
import X.C07QC;
import X.C098200Yq;
import X.C0DSB;
import X.C0H22;
import X.C0H4A;
import X.C0Q4Y;
import X.C0QSJ;
import X.C0WZX;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1200930hMB;
import X.C1220000hqw;
import X.C1232360iAs;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C14K9;
import X.C1561220qjI;
import X.C1561230qjJ;
import X.C1618320sDO;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C1852270yIj;
import X.C1852530yJ9;
import X.C1852540yJA;
import X.C1852550yJB;
import X.C1852630yJJ;
import X.C1852650yJL;
import X.C1852670yJN;
import X.C1852690yJP;
import X.C1852710yJR;
import X.C1852820yJc;
import X.C1854150yLl;
import X.C1855920yOc;
import X.C1857690yRT;
import X.C1857750yRZ;
import X.C1860410yVr;
import X.C1862330yYx;
import X.C1864490ycR;
import X.C1864550ycX;
import X.C189200o6;
import X.C19474211Gy;
import X.C19659111vp;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C338490DOt;
import X.C338520DOw;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C622620ObU;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1852720yJS;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionBarItem;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.bottominput.TakoCreateBottomInputViewModel;
import com.ss.android.ugc.aweme.tako.vm.TakoChatBotSharedViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS236S0300000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.AwS676S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImageCreateFragment extends BaseFragment implements InterfaceC724530SbT, C0QSJ, InterfaceC1146704e9 {
    public static final C0H4A LLJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLD0jKSIpHELIOSZyY+KSIpZywhLSQ4LGEHKS4jACIyLyAPOyoyPCAKOy40JSAiPQ==";
    public FrameLayout LLIZ;
    public C1852530yJ9 LLIZLLLIL;
    public boolean LLJ;
    public FrameLayout LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public boolean LLJILJILJ;
    public C1852710yJR LLJILLL;
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 883));
    public final C736950SvV LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoImageCreateFragment.class, "createBottomInputVM", "getCreateBottomInputVM()Lcom/ss/android/ugc/aweme/tako/otherpage/image/create/bottominput/TakoCreateBottomInputViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(TakoImageCreateFragment.class, "createFragmentVM", "getCreateFragmentVM()Lcom/ss/android/ugc/aweme/tako/otherpage/image/create/TakoImageCreateFragmentViewModel;", 0), new C2217381BqS(TakoImageCreateFragment.class, "takoPhotoChooseViewModel", "getTakoPhotoChooseViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/gallery/TakoPhotoChooseViewModel;", 0)};
        LLJJJIL = new C0H4A();
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoCreateTemplateScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
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

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoCreateTemplateScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoCreateTemplateScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public TakoImageCreateFragment() {
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        AssemVMLazy assemVMLazy3;
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1341);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoChatBotSharedViewModel.class);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(269);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, false);
        C451620HnM c451620HnM = new C451620HnM(this, true);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJI = new C736950SvV(c19719912DlLIZ, awS568S0100000_24, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS269S0000000_27, c451460Hn6, c451620HnM, c338520DOw);
        this.LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1342));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 882));
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoCreateBottomInputViewModel.class);
        AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24(c19719912DlLIZ2, 1344);
        AFwS269S0000000_27 aFwS269S0000000_272 = AFwS269S0000000_27.get$arr$(272);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 890), aFwS269S0000000_272, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
            z2 = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            z = true;
            z2 = false;
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, new AwS571S0100000_27((Fragment) this, 891), aFwS269S0000000_272, null, null, null);
        } else {
            z = true;
            z2 = false;
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 892), aFwS269S0000000_272, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJIIJIL = assemVMLazy;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TakoImageCreateFragmentViewModel.class);
        AwS568S0100000_24 awS568S0100000_243 = new AwS568S0100000_24(c19719912DlLIZ3, 1345);
        AFwS269S0000000_27 aFwS269S0000000_273 = AFwS269S0000000_27.get$arr$(273);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS568S0100000_243, c452070Ho5, new C1622206Wu(this, z), new C338490DOt(this, z), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 893), aFwS269S0000000_273, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS568S0100000_243, new AwS571S0100000_27((Fragment) this, 894), aFwS269S0000000_273, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS568S0100000_243, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 886), aFwS269S0000000_273, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        }
        this.LLJJIJIL = assemVMLazy2;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(TakoPhotoChooseViewModel.class);
        AwS568S0100000_24 awS568S0100000_244 = new AwS568S0100000_24(c19719912DlLIZ4, 1343);
        AFwS269S0000000_27 aFwS269S0000000_274 = AFwS269S0000000_27.get$arr$(271);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS568S0100000_244, c452070Ho5, new C1622206Wu(this, z), new C338490DOt(this, z), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 887), aFwS269S0000000_274, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS568S0100000_244, new AwS571S0100000_27((Fragment) this, 888), aFwS269S0000000_274, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS568S0100000_244, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 889), aFwS269S0000000_274, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        }
        this.LLJJJ = assemVMLazy3;
    }

    public final TakoCreateBottomInputViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (TakoCreateBottomInputViewModel) assemVMLazy.getValue();
    }

    public final TakoImageCreateFragmentViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (TakoImageCreateFragmentViewModel) assemVMLazy.getValue();
    }

    public final int WR() {
        C07QC.LIZ.getClass();
        return C07QC.LIZ() ? ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(getContext()) > 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) : Math.max(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)), ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(getContext()));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C622620ObU.LIZIZ("tako_image_create_list");
        C1852710yJR c1852710yJR = this.LLJILLL;
        if (c1852710yJR != null) {
            c1852710yJR.LIZ.setOnDispatchTouchEvent(null);
        }
        VR().LL = false;
    }

    public static void ZR(String str) {
        Integer numValueOf;
        String str2;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        C1852270yIj.LIZ.getClass();
        String str3 = C1852270yIj.LIZJ.get("enter_from");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = C1852270yIj.LIZJ.get("enter_method");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = C1852270yIj.LIZJ.get("process_id");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = C1852270yIj.LIZJ.get("tako_session_id");
        if (str6 == null) {
            str6 = "";
        }
        String str7 = C1852270yIj.LIZJ.get("tako_chat_id");
        if (str7 == null) {
            str7 = "";
        }
        C1852650yJL c1852650yJL = C1852270yIj.LIZLLL;
        if (c1852650yJL != null) {
            numValueOf = Integer.valueOf(c1852650yJL.LIZ);
        } else {
            numValueOf = null;
        }
        String strLIZJ = C1855920yOc.LIZJ(numValueOf);
        C1852650yJL c1852650yJL2 = C1852270yIj.LIZLLL;
        if (c1852650yJL2 != null) {
            str2 = c1852650yJL2.LJI;
        } else {
            str2 = null;
        }
        C1862330yYx.LJJ(c1862330yYx, str3, str4, str5, str6, str7, "create_image_template", str, null, null, strLIZJ, str2, null, null, null, C1852270yIj.LJIIIIZZ(), 47488);
    }

    public final void SR(int i) {
        C19EG activity = getActivity();
        if (activity != null) {
            C2204961BRm.LLJJJ(activity, i, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA0yZP5SGk0u70KzM2C1bcULlh489L8H/TGOynrQQ34XVcnGa5J3qsPhj9xomd6g==", null));
        }
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        C1852270yIj.LIZ.getClass();
        C1852270yIj.LJIILLIIL();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onCreate(bundle);
        NR(AFwS269S0000000_27.get$arr$(270));
        C19EG activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZ(this, new C1864490ycR(this, 4));
        }
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [X.0yJG] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) throws JSONException {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        List<CreativeTemplate> list;
        List<CreativeTemplate> list2;
        FrameLayout frameLayout;
        View viewFindViewById;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        Integer numValueOf;
        C1852530yJ9 c1852530yJ9;
        FrameLayout frameLayout2;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        View viewFindViewById2;
        ViewGroup viewGroup;
        View view2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2;
        Long l;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3;
        TuxNavBar tuxNavBar;
        boolean z;
        String string;
        super.onViewCreated(view, bundle);
        C1561220qjI.LIZ.getClass();
        if (C1561220qjI.LIZ()) {
            C19EG activity = getActivity();
            if (activity != null) {
                new C0H22(activity, activity.getWindow().getDecorView()).LIZ((C1852550yJB) this.LLJJIJI.getValue());
            }
            this.LLJILLL = new C1852710yJR((C1618320sDO) view.findViewById(R.id.x81), new AwS571S0100000_27(this, 884), new AwS571S0100000_27(this, 885), new InterfaceC1852720yJS() { // from class: X.0yJG
                @Override // X.InterfaceC1852720yJS
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1852720yJS
                public final void LIZ() {
                    C2174781A9k.LIZ(view);
                }
            });
            C736680Sv4.LJIIIZ(this, (AssemViewModel) this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0yJE
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1852520yJ8) obj).LLILZ;
                }
            }, new C2217381BqS() { // from class: X.0yJF
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1852520yJ8) obj).LLILLL;
                }
            }, C736820SvI.LIZLLL(), new AwS676S0100000_27(this, 1), 8);
        }
        View view3 = getView();
        if (view3 != null && (tuxNavBar = (TuxNavBar) view3.findViewById(R.id.x7z)) != null) {
            tuxNavBar.findViewById(R.id.p1z).getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zn);
            tuxNavBar.setBackground(c384050F3z.LIZ(tuxNavBar.getContext()));
            C1251150ifB c1251150ifB = new C1251150ifB();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_x_mark;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            c419910GdJ.LIZLLL = Integer.valueOf(C1857690yRT.LJIIJ(R.attr.a1h));
            c1251150ifB.LIZLLL();
            c1251150ifB.LJ = c419910GdJ;
            c1251150ifB.LIZJ(new AwS571S0100000_27(this, 1395));
            tuxNavBar.LIZIZ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            C07Q7.LIZ.getClass();
            if (((Number) C07Q7.LIZIZ.getValue()).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                string = C1200930hMB.LIZ(requireContext(), 2131849903, "Tako_createHub_pageTitle_new");
            } else {
                string = getString(2131849903);
            }
            c1250250idj.LIZJ = string;
            tuxNavBar.LJIJJ(c1250250idj);
            tuxNavBar.LJIIZILJ(false);
            tuxNavBar.setNavBackground(0);
        }
        C07QC.LIZ.getClass();
        String str = null;
        if (C07QC.LIZ()) {
            C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 698), 3);
            View view4 = getView();
            if (view4 != null && (viewOnAttachStateChangeListenerC20604515jv3 = (ViewOnAttachStateChangeListenerC20604515jv) view4.findViewById(R.id.x80)) != null) {
                C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv3);
            }
        } else {
            View view5 = getView();
            if (view5 != null && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view5.findViewById(R.id.x80)) != null) {
                viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
                viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new GridLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 2));
                viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
                viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoImageCreateTemplateItemCell.class);
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoImageCreateTemplateNewItemCell.class);
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoCreateVideoTemplateCell.class);
                viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C1864550ycX(viewOnAttachStateChangeListenerC20604515jv, this, 2));
                C622620ObU.LIZ("tako_image_create_list", viewOnAttachStateChangeListenerC20604515jv);
                C1852670yJN.LIZ.getClass();
                if (C1852670yJN.LIZ()) {
                    C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
                    C1852270yIj.LIZ.getClass();
                    C1852650yJL c1852650yJL = C1852270yIj.LIZLLL;
                    if (c1852650yJL != null) {
                        list2 = c1852650yJL.LJFF;
                    } else {
                        list2 = null;
                    }
                    state.LJIILL(C1852270yIj.LIZLLL(list2, getActivity(), (TakoPageContext) this.LLJJ.getValue(), null, null), null);
                } else {
                    C20600815jK<InterfaceC1891350zJl> state2 = viewOnAttachStateChangeListenerC20604515jv.getState();
                    C1852270yIj.LIZ.getClass();
                    C1852650yJL c1852650yJL2 = C1852270yIj.LIZLLL;
                    if (c1852650yJL2 != null) {
                        list = c1852650yJL2.LJFF;
                    } else {
                        list = null;
                    }
                    state2.LJIILL(C1852270yIj.LJI(list, getActivity(), (TakoPageContext) this.LLJJ.getValue(), null, null), null);
                }
            }
        }
        C1852670yJN.LIZ.getClass();
        if (((Number) C1852670yJN.LIZLLL.getValue()).intValue() == C1852670yJN.LIZJ && (view2 = getView()) != null && (viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) view2.findViewById(R.id.x7s)) != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv2.getContext(), 0, false));
            viewOnAttachStateChangeListenerC20604515jv2.getState().LIZLLL = C0Q4Y.LATEST;
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(TakoImageCreateSubModeItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv2.setOverScrollMode(2);
            viewOnAttachStateChangeListenerC20604515jv2.addItemDecoration(new C04JC(17));
            C20600815jK<InterfaceC1891350zJl> state3 = viewOnAttachStateChangeListenerC20604515jv2.getState();
            C1852270yIj c1852270yIj = C1852270yIj.LIZ;
            C19EG activity2 = getActivity();
            View view6 = getView();
            c1852270yIj.getClass();
            ArrayList arrayList = new ArrayList();
            C1852820yJc c1852820yJcLIZIZ = C1860410yVr.LIZIZ();
            List<NewActionBarItem> list3 = c1852820yJcLIZIZ.LIZIZ;
            ArrayList<NewActionBarItem> arrayList2 = new ArrayList();
            for (NewActionBarItem newActionBarItem : list3) {
                NewActionBarItem newActionBarItem2 = newActionBarItem;
                Long l2 = newActionBarItem2.displayFlag;
                if ((l2 != null && l2.longValue() == 2) || ((l = newActionBarItem2.displayFlag) != null && l.longValue() == 3)) {
                    arrayList2.add(newActionBarItem);
                }
            }
            for (NewActionBarItem newActionBarItem3 : arrayList2) {
                arrayList.add(new C1854150yLl(newActionBarItem3.type, String.valueOf(newActionBarItem3.name), C1852690yJP.LIZ(newActionBarItem3), newActionBarItem3.darkIcon, newActionBarItem3.lightIcon, newActionBarItem3.iconWidth, newActionBarItem3.iconHeight, newActionBarItem3.inputHint, C1852690yJP.LIZLLL(newActionBarItem3), c1852820yJcLIZIZ.LIZ, new AwS236S0300000_27(activity2, view6, c1852820yJcLIZIZ, 50), null, C1852690yJP.LJII(newActionBarItem3), C1852690yJP.LJFF(newActionBarItem3), C1852690yJP.LJI(newActionBarItem3), newActionBarItem3.aiImage, C1852690yJP.LIZJ(newActionBarItem3), C1852690yJP.LIZIZ(newActionBarItem3), null, Boolean.FALSE, newActionBarItem3.standardRatio, newActionBarItem3.subSkills, newActionBarItem3.skillNameText, newActionBarItem3.skillDescription, newActionBarItem3.skillDefaultPrompt, null, 550666240));
            }
            state3.LJIILL(arrayList, null);
        }
        View view7 = getView();
        if (view7 != null && (frameLayout = (FrameLayout) view7.findViewById(R.id.x7v)) != null) {
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZJ = C418440Gaw.LIZIZ(1);
            c19659111vp.LIZLLL = C418440Gaw.LIZIZ(20);
            c19659111vp.LJ = Integer.valueOf(R.attr.oz);
            c19659111vp.LIZ = C418440Gaw.LIZIZ(16);
            frameLayout.setBackground(c19659111vp.LIZ(frameLayout.getContext()));
            ViewParent parent = frameLayout.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.setClipChildren(false);
            }
            C1857750yRZ.LJIIJ(WR(), frameLayout);
        } else {
            frameLayout = null;
        }
        this.LLIZ = frameLayout;
        C1561220qjI.LIZ.getClass();
        if (C1561220qjI.LIZ()) {
            View view8 = getView();
            if (view8 != null && (viewFindViewById2 = view8.findViewById(R.id.x7t)) != null) {
                C0DSB.LIZIZ(viewFindViewById2);
            }
            View view9 = getView();
            if (view9 != null && (c1852530yJ9 = (C1852530yJ9) view9.findViewById(R.id.x5s)) != null) {
                C0DSB.LIZJ(c1852530yJ9);
                c1852530yJ9.setInputViewClickListener(new C1852540yJA(new AwS428S0200000_27(this, c1852530yJ9, 104), new AwS393S0200000_27(this, c1852530yJ9, 179), new AwS606S0100000_27(this, 652), new AwS641S0100000_27(this, 167)));
            } else {
                c1852530yJ9 = null;
            }
            this.LLIZLLLIL = c1852530yJ9;
            View view10 = getView();
            if (view10 != null && (frameLayout2 = (FrameLayout) view10.findViewById(R.id.x5r)) != null) {
                Context context = frameLayout2.getContext();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, context);
                if (numLIZJ != null) {
                    iIntValue4 = numLIZJ.intValue();
                } else {
                    iIntValue4 = 0;
                }
                int iLIZ = C1852630yJJ.LIZ(0, iIntValue4);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zn, context);
                if (numLIZJ2 != null) {
                    iIntValue5 = numLIZJ2.intValue();
                } else {
                    iIntValue5 = 0;
                }
                int iLIZ2 = C1852630yJJ.LIZ(204, iIntValue5);
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.zn, context);
                if (numLIZJ3 != null) {
                    iIntValue6 = numLIZJ3.intValue();
                } else {
                    iIntValue6 = 0;
                }
                gradientDrawable.setColors(new int[]{iLIZ, iLIZ2, C1852630yJJ.LIZ(255, iIntValue6)});
                frameLayout2.setBackground(gradientDrawable);
            } else {
                frameLayout2 = null;
            }
            this.LLJI = frameLayout2;
        } else {
            View view11 = getView();
            if (view11 != null && (viewFindViewById = view11.findViewById(R.id.x7u)) != null) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)) + WR();
                C786410Ut5.W5(viewFindViewById, layoutParams);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setGradientType(0);
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.zn, viewFindViewById.getContext());
                if (numLIZJ4 != null) {
                    iIntValue = numLIZJ4.intValue();
                } else {
                    iIntValue = 0;
                }
                int iLIZ3 = C1852630yJJ.LIZ(0, iIntValue);
                Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.zn, viewFindViewById.getContext());
                if (numLIZJ5 != null) {
                    iIntValue2 = numLIZJ5.intValue();
                } else {
                    iIntValue2 = 0;
                }
                int iLIZ4 = C1852630yJJ.LIZ(204, iIntValue2);
                Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.zn, viewFindViewById.getContext());
                if (numLIZJ6 != null) {
                    iIntValue3 = numLIZJ6.intValue();
                } else {
                    iIntValue3 = 0;
                }
                gradientDrawable2.setColors(new int[]{iLIZ3, iLIZ4, C1852630yJJ.LIZ(255, iIntValue3)});
                viewFindViewById.setBackground(gradientDrawable2);
            }
        }
        C1561230qjJ.LIZ.getClass();
        if (C1561230qjJ.LIZ()) {
            C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 699), 3);
            final View view12 = getView();
            if (view12 != null) {
                View viewFindViewById3 = view12.findViewById(R.id.qd4);
                this.LLJIJIL = viewFindViewById3;
                if (viewFindViewById3 != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById3);
                }
                View view13 = this.LLJIJIL;
                if (view13 != null) {
                    C786410Ut5.I7(new ACListenerS161S0100000_27(this, 200), view13);
                }
                View viewFindViewById4 = view12.findViewById(R.id.qd3);
                this.LLJILJIL = viewFindViewById4;
                if (viewFindViewById4 != null) {
                    C786410Ut5.LJLLLLLL(4, viewFindViewById4);
                    VR().LLILLJJLI = BottomSheetBehavior.from(viewFindViewById4);
                    BottomSheetBehavior<View> bottomSheetBehavior = VR().LLILLJJLI;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.setState(5);
                    }
                    BottomSheetBehavior<View> bottomSheetBehavior2 = VR().LLILLJJLI;
                    if (bottomSheetBehavior2 != null) {
                        bottomSheetBehavior2.setDraggable(true);
                    }
                    BottomSheetBehavior<View> bottomSheetBehavior3 = VR().LLILLJJLI;
                    if (bottomSheetBehavior3 != null) {
                        bottomSheetBehavior3.addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0yJD
                            @Override // X.AbstractC1177930gl5
                            public final void LIZJ(View view14, float f) {
                                float fLIZLLL = C13LZ.LIZLLL(1 + f, 0.0f, 1.0f);
                                View view15 = this.LLJIJIL;
                                if (view15 != null) {
                                    C786410Ut5.T4(view15, fLIZLLL);
                                }
                                View view16 = this.LLJIJIL;
                                if (view16 != null) {
                                    C786410Ut5.LJLLLLLL(0, view16);
                                }
                            }

                            @Override // X.AbstractC1177930gl5
                            public final void LIZLLL(int i, View view14) {
                                if (i != 3 && i != 4) {
                                    if (i == 5) {
                                        View viewFindViewById5 = view12.findViewById(R.id.cb0);
                                        if (viewFindViewById5 != null) {
                                            C786410Ut5.LJLLLLLL(8, viewFindViewById5);
                                        }
                                        View view15 = this.LLJIJIL;
                                        if (view15 != null) {
                                            C786410Ut5.LJLLLLLL(8, view15);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                View view16 = this.LLJIJIL;
                                if (view16 == null) {
                                    return;
                                }
                                C786410Ut5.LJLLLLLL(0, view16);
                            }
                        });
                    }
                    C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.0OEd
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C593380NPc) obj).LL;
                        }
                    }, null, new AwS641S0100000_27(this, 168), 6);
                }
            }
        }
        if (C1561220qjI.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0gMK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1159270gGz) obj).LL;
                }
            }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 169), 4);
            C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0gLf
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1159270gGz) obj).LLILLL);
                }
            }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 170), 4);
            C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0gLh
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1159270gGz) obj).LLILLJJLI;
                }
            }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 171), 4);
        }
        C07QC.LIZ.getClass();
        if (!C07QC.LIZ()) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            C1852270yIj.LIZ.getClass();
            String str2 = C1852270yIj.LIZJ.get("enter_from");
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = C1852270yIj.LIZJ.get("enter_method");
            if (str4 == null) {
                str4 = "";
            }
            String str5 = C1852270yIj.LIZJ.get("process_id");
            if (str5 == null) {
                str5 = "";
            }
            String str6 = C1852270yIj.LIZJ.get("tako_session_id");
            if (str6 == null) {
                str6 = "";
            }
            String str7 = C1852270yIj.LIZJ.get("tako_chat_id");
            if (str7 != null) {
                str3 = str7;
            }
            C1852650yJL c1852650yJL3 = C1852270yIj.LIZLLL;
            if (c1852650yJL3 != null) {
                numValueOf = Integer.valueOf(c1852650yJL3.LIZ);
            } else {
                numValueOf = null;
            }
            String strLIZJ = C1855920yOc.LIZJ(numValueOf);
            C1852650yJL c1852650yJL4 = C1852270yIj.LIZLLL;
            if (c1852650yJL4 != null) {
                str = c1852650yJL4.LJI;
            }
            C1862330yYx.LJJI(c1862330yYx, str2, str4, str5, str6, str3, "create_image_template", null, strLIZJ, str, null, 1600);
        }
        VR().LL = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fod, viewGroup, false);
        C14K9.LJIJJ(viewTd.findViewById(R.id.x81), C1232360iAs.LL);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
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
