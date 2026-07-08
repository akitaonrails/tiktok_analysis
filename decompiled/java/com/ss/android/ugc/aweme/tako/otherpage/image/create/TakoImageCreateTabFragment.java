package com.ss.android.ugc.aweme.tako.otherpage.image.create;

import X.AbstractC329610Cw3;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C07G6;
import X.C098200Yq;
import X.C09R3;
import X.C0DXR;
import X.C0H4A;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C13BV;
import X.C13LE;
import X.C15442062u;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C1852260yIi;
import X.C1852270yIj;
import X.C1852420yIy;
import X.C1852490yJ5;
import X.C1852650yJL;
import X.C1852670yJN;
import X.C1853460yKe;
import X.C1853710yL3;
import X.C1855920yOc;
import X.C1855970yOh;
import X.C1862330yYx;
import X.C1864520ycU;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20603715jn;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C338490DOt;
import X.C338520DOw;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C622620ObU;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1206390hUz;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1783630wW1;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS127S0100000_27;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tako.autoplay.TakoAutoPlayController;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TabTemplateFragmentItem;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateTabFragment;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.bottominput.TakoCreateBottomInputViewModel;
import com.ss.android.ugc.aweme.tako.vm.TakoChatBotSharedViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImageCreateTabFragment extends BaseFragment implements InterfaceC1206390hUz, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLD0jKSIpZyHELIOSY+KSIpZywhLSQ4LGEHKS4jACIyLyAPOyoyPCAYKC0VOiQrJCo9PA==";
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public String LLJ;
    public TabTemplateFragmentItem LLJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C736950SvV LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public List<CreativeTemplate> LLJJIJIL;
    public int LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoImageCreateTabFragment.class, "templateSquareVM", "getTemplateSquareVM()Lcom/ss/android/ugc/aweme/tako/otherpage/image/create/TakoImageTemplateTabViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoImageCreateTabFragment.class, "createBottomInputVM", "getCreateBottomInputVM()Lcom/ss/android/ugc/aweme/tako/otherpage/image/create/bottominput/TakoCreateBottomInputViewModel;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
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

    public TakoImageCreateTabFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        boolean z3;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoImageTemplateTabViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 1348);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(276);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 897), aFwS269S0000000_27, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS571S0100000_27((Fragment) this, 898), aFwS269S0000000_27, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 899), aFwS269S0000000_27, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILJIL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoCreateBottomInputViewModel.class);
        AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24(c19719912DlLIZ2, 1349);
        AFwS269S0000000_27 aFwS269S0000000_272 = AFwS269S0000000_27.get$arr$(277);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 900), aFwS269S0000000_272, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
            z3 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, new AwS571S0100000_27((Fragment) this, 901), aFwS269S0000000_272, null, null, null);
            z3 = true;
            z = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z3 = true;
            z = false;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 896), aFwS269S0000000_272, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILJILJ = assemVMLazy2;
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 902);
        this.LLJILLL = new C736950SvV(C13LE.LIZ(TakoChatBotSharedViewModel.class), awS571S0100000_27, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS269S0000000_27.get$arr$(278), new C451460Hn6(this, z), new C451620HnM(this, z3), new C338520DOw(this));
        this.LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1347));
        this.LLJJI = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(192));
        this.LLJJIII = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(195));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(193));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(194));
        this.LLJJIJIL = C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
        ((C1852420yIy) this.LLJJIII.getValue()).LIZIZ(false);
    }

    public final TakoImageTemplateTabViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (TakoImageTemplateTabViewModel) assemVMLazy.getValue();
    }

    public final int WR() {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)) + Math.max(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)), ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(getContext()));
        C1852670yJN.LIZ.getClass();
        return iLIZIZ + (((Number) C1852670yJN.LIZLLL.getValue()).intValue() == C1852670yJN.LIZJ ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)) : 0);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C622620ObU.LIZIZ("tako_image_create_multi_tab_list");
        ((C1852420yIy) this.LLJJIII.getValue()).LIZIZ(false);
        ((C1852420yIy) this.LLJJIJI.getValue()).LIZIZ(false);
        ((C1852420yIy) this.LLJJIJIIJIL.getValue()).LIZIZ(true);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        TabTemplateFragmentItem tabTemplateFragmentItem;
        String str;
        String str2;
        super.onCreate(bundle);
        NR(AFwS269S0000000_27.get$arr$(275));
        Bundle arguments = getArguments();
        String str3 = null;
        if (arguments != null) {
            tabTemplateFragmentItem = (TabTemplateFragmentItem) arguments.getParcelable("power_viewpager_default_key");
        } else {
            tabTemplateFragmentItem = null;
        }
        this.LLJI = tabTemplateFragmentItem;
        String str4 = "";
        if (tabTemplateFragmentItem == null || (str = tabTemplateFragmentItem.tabId) == null) {
            str = "";
        }
        this.LLIZ = str;
        if (tabTemplateFragmentItem != null && (str2 = tabTemplateFragmentItem.tabName) != null) {
            str4 = str2;
        }
        this.LLIZLLLIL = str4;
        if (tabTemplateFragmentItem != null) {
            str3 = tabTemplateFragmentItem.tabEnName;
        }
        this.LLJ = str3;
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
        ((C1852420yIy) this.LLJJIII.getValue()).LIZIZ(true);
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS127S0100000_27(this, 77));
        }
    }

    public final void UR(CreativeTemplate creativeTemplate, int i) {
        String str;
        Integer num;
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJILLL.getValue();
        String str2 = creativeTemplate.templatePrompt;
        C1852270yIj.LIZ.getClass();
        C1853460yKe c1853460yKeLJ = C1852270yIj.LJ(creativeTemplate, i);
        Pair[] pairArr = new Pair[4];
        C1852650yJL c1852650yJL = C1852270yIj.LIZLLL;
        if (c1852650yJL != null) {
            str = c1852650yJL.LJI;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("mode_source", str);
        pairArr[1] = new Pair("tab_id", this.LLIZ);
        String str4 = this.LLJ;
        if (str4 == null) {
            str4 = this.LLIZLLLIL;
        }
        pairArr[2] = new Pair("template_tab", str4);
        String str5 = C1852270yIj.LIZJ.get("push_id");
        if (str5 != null) {
            str3 = str5;
        }
        pairArr[3] = new Pair("push_id", str3);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        TabTemplateFragmentItem tabTemplateFragmentItem = this.LLJI;
        if (tabTemplateFragmentItem != null) {
            num = tabTemplateFragmentItem.tabType;
        } else {
            num = null;
        }
        assemViewModel.setState(new AwS606S0100000_27(new C1853710yL3(str2, null, c1853460yKeLJ, mapLJIIJ, num), 551));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        Object value;
        Object value2;
        Object value3;
        Integer num;
        super.onViewCreated(view, bundle);
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            gridLayoutManager.LLIZ = new C1864520ycU(viewOnAttachStateChangeListenerC20604515jv, gridLayoutManager, 1);
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(gridLayoutManager);
            viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoImageCreateTemplateItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoImageCreateTemplateNewItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoCreateVideoTemplateCell.class);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoInspirationHeaderCell.class);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoInspirationSectionTitleCell.class);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoInspirationListTemplateCell.class);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoInspirationGridTemplateCell.class);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoInspirationEmptyCell.class);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR() { // from class: X.0yIz
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    boolean z2;
                    int iLJ;
                    int i;
                    GridLayoutManager gridLayoutManager2;
                    AbstractC214823195h abstractC214823195h;
                    Integer num2;
                    int i2;
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                    if (childAdapterPosition == -1) {
                        return;
                    }
                    List<InterfaceC1891350zJl> listLJII = viewOnAttachStateChangeListenerC20604515jv.getState().LJII();
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(childAdapterPosition, listLJII);
                    this.getClass();
                    if (!(objLJJJLZIJ instanceof C1157200gDe) && !(objLJJJLZIJ instanceof C1271604yI) && !(objLJJJLZIJ instanceof C1781260wSC) && !(objLJJJLZIJ instanceof C1271504yH)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        rect.left = 0;
                        rect.right = 0;
                        rect.top = 0;
                    } else {
                        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager2 = (GridLayoutManager) layoutManager) != null && (abstractC214823195h = gridLayoutManager2.LLIZ) != null) {
                            iLJ = abstractC214823195h.LJ(childAdapterPosition, 2);
                        } else {
                            iLJ = childAdapterPosition % 2;
                        }
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) / 2;
                        if (iLJ == 0) {
                            i = iLIZIZ;
                        } else {
                            i = iLIZIZ2;
                        }
                        rect.left = i;
                        if (iLJ == 0) {
                            iLIZIZ = iLIZIZ2;
                        }
                        rect.right = iLIZIZ;
                        rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    }
                    TabTemplateFragmentItem tabTemplateFragmentItem = this.LLJI;
                    if (tabTemplateFragmentItem != null && (num2 = tabTemplateFragmentItem.tabType) != null && num2.intValue() == 2) {
                        this.getClass();
                        ArrayList arrayList = (ArrayList) listLJII;
                        ListIterator listIterator = arrayList.listIterator(arrayList.size());
                        while (listIterator.hasPrevious()) {
                            if (!(listIterator.previous() instanceof C20605115k1)) {
                                int iNextIndex = listIterator.nextIndex();
                                if (iNextIndex >= 0 && childAdapterPosition <= iNextIndex) {
                                    ArrayList arrayList2 = new ArrayList();
                                    int i3 = 0;
                                    int i4 = 0;
                                    int i5 = 0;
                                    while (true) {
                                        Object obj = ListProtector.get(listLJII, i3);
                                        if (!(obj instanceof C1157200gDe) && !(obj instanceof C1271604yI) && !(obj instanceof C1781260wSC) && !(obj instanceof C1271504yH)) {
                                            i2 = 1;
                                        } else {
                                            i2 = 2;
                                        }
                                        if (i4 > 0 && i4 + i2 > 2) {
                                            arrayList2.add(C13LZ.LJIILJJIL(i5, i3));
                                            i5 = i3;
                                            i4 = 0;
                                        }
                                        i4 += i2;
                                        if (i4 == 2) {
                                            arrayList2.add(new IntRange(i5, i3));
                                            i5 = i3 + 1;
                                            i4 = 0;
                                        }
                                        if (i3 == iNextIndex) {
                                            break;
                                        } else {
                                            i3++;
                                        }
                                    }
                                    if (i5 <= iNextIndex) {
                                        arrayList2.add(new IntRange(i5, iNextIndex));
                                    }
                                    C1846520y9S intRange = (C1846520y9S) C13LP.LJJLIIIJL(arrayList2);
                                    if (intRange == null) {
                                        intRange = new IntRange(iNextIndex, iNextIndex);
                                    }
                                    int i6 = intRange.LL;
                                    if (childAdapterPosition <= intRange.LLILLJJLI && i6 <= childAdapterPosition) {
                                        rect.bottom = this.WR();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    TakoImageCreateTabFragment takoImageCreateTabFragment = this;
                    int iLIZIZ3 = c21673919s1.LIZIZ();
                    takoImageCreateTabFragment.getClass();
                    if (childAdapterPosition >= ((((iLIZIZ3 + 2) - 1) / 2) - 1) * 2) {
                        rect.bottom = this.WR();
                    }
                }
            });
            if (C07G6.LIZ()) {
                int i = TakoCreateVideoTemplateCell.LLJJI;
                Context context = viewOnAttachStateChangeListenerC20604515jv.getContext();
                TakoImageCreateFragment.LLJJJIL.getClass();
                int iLIZ = C0H4A.LIZ(context);
                Size size = new Size(iLIZ, (iLIZ / 3) * 4);
                TabTemplateFragmentItem tabTemplateFragmentItem = this.LLJI;
                if (tabTemplateFragmentItem != null && (num = tabTemplateFragmentItem.tabType) != null && num.intValue() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                C1855970yOh c1855970yOh = new C1855970yOh(viewOnAttachStateChangeListenerC20604515jv, size, z);
                InterfaceC1783630wW1 interfaceC1783630wW1 = new InterfaceC1783630wW1(viewOnAttachStateChangeListenerC20604515jv) { // from class: X.0yKv
                    public final C1853620yKu LIZ;
                    public final InterfaceC346201Wa<InterfaceC1557650qdX> LIZIZ;

                    @Override // X.InterfaceC1783630wW1
                    public final void LIZ() {
                        this.LIZ.LIZ();
                    }

                    @Override // X.InterfaceC1783630wW1
                    public final void LJI() {
                        this.LIZ.LJI();
                    }

                    @Override // X.InterfaceC1783630wW1
                    public final InterfaceC346201Wa<InterfaceC1557650qdX> getEvents() {
                        return this.LIZIZ;
                    }

                    {
                        C1853620yKu c1853620yKu = new C1853620yKu(C1697810uHb.LJIIJJI(new C1563650qnD(viewOnAttachStateChangeListenerC20604515jv), new C1563660qnE(viewOnAttachStateChangeListenerC20604515jv)));
                        this.LIZ = c1853620yKu;
                        this.LIZIZ = c1853620yKu.LIZIZ;
                    }
                };
                TakoAutoPlayController takoAutoPlayController = (TakoAutoPlayController) this.LLJJI.getValue();
                takoAutoPlayController.LJIILIIL = c1855970yOh;
                takoAutoPlayController.LJIILJJIL = interfaceC1783630wW1;
                Object value4 = this.LLJJIII.getValue();
                C2252321DDq c2252321DDq = takoAutoPlayController.LIZJ.LIZJ;
                do {
                    value = c2252321DDq.getValue();
                } while (!c2252321DDq.compareAndSet(value, C15442062u.LJIIIIZZ(value4, (Set) value)));
                Object value5 = this.LLJJIJI.getValue();
                C2252321DDq c2252321DDq2 = takoAutoPlayController.LIZJ.LIZJ;
                do {
                    value2 = c2252321DDq2.getValue();
                } while (!c2252321DDq2.compareAndSet(value2, C15442062u.LJIIIIZZ(value5, (Set) value2)));
                Object value6 = this.LLJJIJIIJIL.getValue();
                C2252321DDq c2252321DDq3 = takoAutoPlayController.LIZJ.LIZJ;
                do {
                    value3 = c2252321DDq3.getValue();
                } while (!c2252321DDq3.compareAndSet(value3, C15442062u.LJIIIIZZ(value6, (Set) value3)));
                takoAutoPlayController.LIZ(getViewLifecycleOwner());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tako_image_create_multi_tab_list_");
            TabTemplateFragmentItem tabTemplateFragmentItem2 = this.LLJI;
            if (tabTemplateFragmentItem2 == null || (str = tabTemplateFragmentItem2.tabEnName) == null) {
                str = "";
            }
            sbLIZ.append(str);
            C622620ObU.LIZ(C2188811AlT.LIZIZ(sbLIZ), viewOnAttachStateChangeListenerC20604515jv);
            final C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZJ = false;
            c20603715jn.LJIIJ = true;
            c20603715jn.LIZ = 6;
            c20603715jn.LIZLLL = LoadingFooterCell.class;
            AbstractC329610Cw3<C1852490yJ5> abstractC329610Cw3 = new AbstractC329610Cw3<C1852490yJ5>(c20603715jn) { // from class: X.0yIr
                @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
                public final void onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1852490yJ5>> interfaceC1364105Vn) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1852360yIs(this, interfaceC1364105Vn, null), 2);
                }

                @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
                public final void onLoadMore(InterfaceC1364105Vn interfaceC1364105Vn, Object obj) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1852370yIt(this, (C1852490yJ5) obj, interfaceC1364105Vn, null), 2);
                }
            };
            viewOnAttachStateChangeListenerC20604515jv.LJIIL(abstractC329610Cw3);
            abstractC329610Cw3.getOperator().refresh();
        }
        if (C07G6.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLJILJILJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gLg
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1159270gGz) obj).LLILZ);
                }
            }, null, new AwS641S0100000_27(this, 172), 6);
        }
    }

    public final void VR(CreativeTemplate creativeTemplate, int i, List<BaseImage> list) {
        String str;
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJILLL.getValue();
        String str2 = creativeTemplate.templatePrompt;
        C1852270yIj.LIZ.getClass();
        C1853460yKe c1853460yKeLJ = C1852270yIj.LJ(creativeTemplate, i);
        Pair[] pairArr = new Pair[4];
        C1852650yJL c1852650yJL = C1852270yIj.LIZLLL;
        Integer num = null;
        if (c1852650yJL != null) {
            str = c1852650yJL.LJI;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("mode_source", str);
        pairArr[1] = new Pair("tab_id", this.LLIZ);
        String str4 = this.LLJ;
        if (str4 == null) {
            str4 = this.LLIZLLLIL;
        }
        pairArr[2] = new Pair("template_tab", str4);
        String str5 = C1852270yIj.LIZJ.get("push_id");
        if (str5 != null) {
            str3 = str5;
        }
        pairArr[3] = new Pair("push_id", str3);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        TabTemplateFragmentItem tabTemplateFragmentItem = this.LLJI;
        if (tabTemplateFragmentItem != null) {
            num = tabTemplateFragmentItem.tabType;
        }
        assemViewModel.setState(new AwS606S0100000_27(new C1853710yL3(str2, list, c1853460yKeLJ, mapLJIIJ, num), 551));
    }

    public final void ZR(int i, String str, List list) {
        Integer numValueOf;
        JSONArray jSONArrayLIZ = C1852260yIi.LIZ(i, list);
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
        if (str7 == null) {
            str7 = "";
        }
        C1852650yJL c1852650yJL = C1852270yIj.LIZLLL;
        String str8 = null;
        if (c1852650yJL != null) {
            numValueOf = Integer.valueOf(c1852650yJL.LIZ);
        } else {
            numValueOf = null;
        }
        String strLIZJ = C1855920yOc.LIZJ(numValueOf);
        C1852650yJL c1852650yJL2 = C1852270yIj.LIZLLL;
        if (c1852650yJL2 != null) {
            str8 = c1852650yJL2.LJI;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tab_id", this.LLIZ);
        String str9 = this.LLJ;
        if (str9 == null) {
            str9 = this.LLIZLLLIL;
        }
        linkedHashMap.put("template_tab", str9);
        linkedHashMap.put("show_type", str);
        linkedHashMap.put("template_info", jSONArrayLIZ);
        String str10 = C1852270yIj.LIZJ.get("push_id");
        if (str10 != null) {
            str3 = str10;
        }
        linkedHashMap.put("push_id", str3);
        C1862330yYx.LJJI(c1862330yYx, str2, str4, str5, str6, str7, "create_image_template", null, strLIZJ, str8, linkedHashMap, 576);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireContext());
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        C19GS c19gs = null;
        this.LLJIJIL = new ViewOnAttachStateChangeListenerC20604515jv(requireContext(), null);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jv, new FrameLayout.LayoutParams(-1, -1));
        }
        frameLayout.addView(this.LLJIJIL);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
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
