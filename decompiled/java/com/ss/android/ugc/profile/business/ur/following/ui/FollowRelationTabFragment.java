package com.ss.android.ugc.profile.business.ur.following.ui;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C059B;
import X.C098200Yq;
import X.C0XQ7;
import X.C0ZP4;
import X.C1076010e6h;
import X.C1176850gjL;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C123100dR;
import X.C1247750iZh;
import X.C1251350ifV;
import X.C1253010iiB;
import X.C1264430j0b;
import X.C13LE;
import X.C1595060rbs;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C1843500y4a;
import X.C189200o6;
import X.C1910890zpH;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C19Y3;
import X.C19Y5;
import X.C20684815ws;
import X.C21594419fC;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C300120Bpa;
import X.C338490DOt;
import X.C437940HFg;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C588270N5l;
import X.C616540OGe;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C844470XAv;
import X.C987103tV;
import X.EnumC1262450ixP;
import X.EnumC1910860zpE;
import X.EnumC666200QBe;
import X.InterfaceC0148002o;
import X.InterfaceC1260330itz;
import X.InterfaceC1264400j0Y;
import X.InterfaceC1264910j1N;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC469360Ias;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.experiment.FollowAddRedDotShowSceneExp;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.following.ui.BaseRelationFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.service.RouteAddFriendsPageService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowRelationState;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.RelationTabViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowRelationTabFragment extends JediBaseFragment implements InterfaceC1260330itz, InterfaceC469360Ias, View.OnClickListener, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiHELIOSLyA/JCo7ICE0ZjAlZwk8JCkjPh02JCQ4ICA9HCQuDz0yLygpJzs=";
    public TuxTextView LLILLJJLI;
    public C21594419fC LLILLL;
    public C19Y3 LLILZ;
    public TuxIconView LLILZIL;
    public TuxIconView LLILZLL;
    public C437940HFg LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ;
    public User LLJI;
    public String LLJIJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public ArrayList<String> LLJJIJIIJIL;
    public ArrayList<String> LLJJIJIL;
    public String LLJJJ;
    public boolean LLJJJIL;
    public int LLJJJJ;
    public boolean LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final AssemVMLazy LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public boolean LLJILJIL = true;
    public final List<Fragment> LLJJI = new ArrayList();
    public final List<String> LLJJIII = new ArrayList();
    public final List<String> LLJJIJI = new ArrayList();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FollowRelationTabFragment.class, "followRelationTabAssemViewModel", "getFollowRelationTabAssemViewModel()Lcom/ss/android/ugc/profile/business/ur/following/ui/viewmodel/RelationTabViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1260330itz
    public final void onScroll(int i, int i2) {
    }

    @Override // X.InterfaceC1260330itz
    public final boolean onScrollEnd() {
        return false;
    }

    @Override // X.InterfaceC1260330itz
    public final void onScrolled(float f, float f2) {
    }

    public FollowRelationTabFragment() {
        AssemVMLazy assemVMLazy;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FollowRelationTabViewModel.class);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 105));
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(RelationTabViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ2, 2272);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(419);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2273), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS563S0100000_19, new AwS563S0100000_19((Fragment) this, 2274), aFwS257S0000000_19, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2275), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJL = assemVMLazy;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2271));
    }

    public final TuxIconView PR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.adk) : null;
            this.LLILZLL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final TuxIconView RR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bn2) : null;
            this.LLILZIL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final C19Y3 SR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wya) : null;
            this.LLILZ = (C19Y3) viewFindViewById;
        }
        return (C19Y3) viewFindViewById;
    }

    public final C21594419fC UR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.viewpager) : null;
            this.LLILLL = (C21594419fC) viewFindViewById;
        }
        return (C21594419fC) viewFindViewById;
    }

    public final void ZR() {
        if (this.LLIZLLLIL && C1253010iiB.LIZJ.LJIJJ()) {
            C786410Ut5.LLLLLLZZ(PR(), 0);
        } else {
            C786410Ut5.LLLLLLZZ(PR(), 8);
        }
    }

    public final void MR() {
        Fragment fragmentLJJJJZI = getChildFragmentManager().LJJJJZI(aS(R.id.viewpager, ((ArrayList) this.LLJJI).size()));
        if (fragmentLJJJJZI == null) {
            fragmentLJJJJZI = new FollowerRelationFragment();
        }
        fragmentLJJJJZI.setArguments(getArguments());
        ((ArrayList) this.LLJJI).add(fragmentLJJJJZI);
        if (this.LLJJJIL) {
            List<String> list = this.LLJJIII;
            C844470XAv.LIZ.getClass();
            ((ArrayList) list).add(C844470XAv.LIZ().getString(R.string.jqq));
        } else {
            List<String> list2 = this.LLJJIII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C844470XAv.LIZ.getClass();
            sbLIZ.append(C844470XAv.LIZ().getString(2131838943));
            sbLIZ.append(' ');
            sbLIZ.append(C1843500y4a.LIZIZ(this.LLJILLL));
            ((ArrayList) list2).add(C2188811AlT.LIZIZ(sbLIZ));
        }
        ((ArrayList) this.LLJJIJI).add("follower_relation");
    }

    public final void NR() {
        Fragment fragmentLJJJJZI = getChildFragmentManager().LJJJJZI(aS(R.id.viewpager, ((ArrayList) this.LLJJI).size()));
        if (fragmentLJJJJZI == null) {
            fragmentLJJJJZI = new FollowingRelationFragment();
        }
        fragmentLJJJJZI.setArguments(getArguments());
        ((ArrayList) this.LLJJI).add(fragmentLJJJJZI);
        if (this.LLJJJIL) {
            List<String> list = this.LLJJIII;
            C844470XAv.LIZ.getClass();
            ((ArrayList) list).add(C844470XAv.LIZ().getString(R.string.jrk));
        } else {
            List<String> list2 = this.LLJJIII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C844470XAv.LIZ.getClass();
            sbLIZ.append(C844470XAv.LIZ().getString(R.string.jrk));
            sbLIZ.append(' ');
            sbLIZ.append(C1843500y4a.LIZIZ(this.LLJILJILJ));
            ((ArrayList) list2).add(C2188811AlT.LIZIZ(sbLIZ));
        }
        ((ArrayList) this.LLJJIJI).add("following_relation");
    }

    public final void OR() {
        Resources resources;
        Fragment fragmentLJJJJZI = getChildFragmentManager().LJJJJZI(aS(R.id.viewpager, ((ArrayList) this.LLJJI).size()));
        if (fragmentLJJJJZI == null) {
            C1247750iZh c1247750iZh = C1247750iZh.LIZ;
            EnumC1262450ixP enumC1262450ixP = EnumC1262450ixP.TT_RELATION_PAGE;
            MufPageTrackInfo mufPageTrackInfo = new MufPageTrackInfo("relation_tab", "relation_tab");
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this, 2270);
            c1247750iZh.getClass();
            fragmentLJJJJZI = C1247750iZh.LIZ(enumC1262450ixP, mufPageTrackInfo, -1, awS563S0100000_19);
        }
        ((ArrayList) this.LLJJI).add(fragmentLJJJJZI);
        List<String> list = this.LLJJIII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C19EG activity = getActivity();
        sbLIZ.append((activity == null || (resources = activity.getResources()) == null) ? null : resources.getString(2131834932));
        sbLIZ.append(' ');
        sbLIZ.append(C1843500y4a.LIZIZ(this.LLJJ));
        ((ArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ));
        ((ArrayList) this.LLJJIJI).add("muf_user");
    }

    public final void WR() {
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (Intrinsics.LJFF(this.LLJ, curUser.getUid())) {
            int fansCount = C588270N5l.LIZ(curUser) ? curUser.getFansCount() : curUser.getFollowerCount();
            this.LLJILLL = fansCount;
            User user = this.LLJI;
            if (user != null) {
                user.setFollowerCount(fansCount);
            }
            C2344809Gs.LIZLLL(4, "FollowRelationTabFragment", " user: {  uid: " + curUser.getUid() + ", following_count: " + curUser.getFollowingCount() + ", follower_count: " + curUser.getFollowerCount() + " } time: " + System.currentTimeMillis());
            bS();
        }
    }

    public final void bS() {
        int i;
        TextView textView;
        TextView textView2;
        C19Y3 c19y3SR = SR();
        C437940HFg c437940HFg = this.LLIZ;
        if (c437940HFg == null) {
            c437940HFg = null;
        }
        Iterator<Fragment> it2 = c437940HFg.LLIZ.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it2.hasNext()) {
                i3 = -1;
                break;
            } else if (it2.next() instanceof FollowingRelationFragment) {
                break;
            } else {
                i3++;
            }
        }
        C19Y5 c19y5LJIIIZ = c19y3SR.LJIIIZ(i3);
        View view = c19y5LJIIIZ != null ? c19y5LJIIIZ.LJFF : null;
        TextView textView3 = view instanceof TextView ? (TextView) view : null;
        if (textView3 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C844470XAv.LIZ.getClass();
            sbLIZ.append(C844470XAv.LIZ().getString(R.string.jrk));
            sbLIZ.append(' ');
            sbLIZ.append((Object) C1176850gjL.LIZ(1, Integer.valueOf(this.LLJILJILJ), "-"));
            textView3.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C19Y3 c19y3SR2 = SR();
        C437940HFg c437940HFg2 = this.LLIZ;
        if (c437940HFg2 == null) {
            c437940HFg2 = null;
        }
        Iterator<Fragment> it3 = c437940HFg2.LLIZ.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            if (it3.next() instanceof FollowerRelationFragment) {
                i = i2;
                break;
            }
            i2++;
        }
        C19Y5 c19y5LJIIIZ2 = c19y3SR2.LJIIIZ(i);
        View view2 = c19y5LJIIIZ2 != null ? c19y5LJIIIZ2.LJFF : null;
        if ((view2 instanceof TextView) && (textView2 = (TextView) view2) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            C844470XAv.LIZ.getClass();
            sbLIZ2.append(C844470XAv.LIZ().getString(2131838943));
            sbLIZ2.append(' ');
            sbLIZ2.append((Object) C1176850gjL.LIZ(1, Integer.valueOf(this.LLJILLL), "-"));
            textView2.setText(C2188811AlT.LIZIZ(sbLIZ2));
        }
        C19Y5 c19y5LJIIIZ3 = SR().LJIIIZ(((ArrayList) this.LLJJIJI).indexOf("muf_user"));
        View view3 = c19y5LJIIIZ3 != null ? c19y5LJIIIZ3.LJFF : null;
        if ((view3 instanceof TextView) && (textView = (TextView) view3) != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            C844470XAv.LIZ.getClass();
            sbLIZ3.append(C844470XAv.LIZ().getString(2131834932));
            sbLIZ3.append(' ');
            sbLIZ3.append((Object) C1176850gjL.LIZ(1, Integer.valueOf(this.LLJJ), "-"));
            textView.setText(C2188811AlT.LIZIZ(sbLIZ3));
        }
        C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("updateTitle - isSelf ");
        sbLIZ4.append(this.LLIZLLLIL);
        sbLIZ4.append(", following count ");
        sbLIZ4.append(this.LLJILJILJ);
        sbLIZ4.append(", follower count ");
        sbLIZ4.append(this.LLJILLL);
        sbLIZ4.append(", friend count ");
        sbLIZ4.append(this.LLJJ);
        c1910890zpHLIZ.LJI("FollowRelationTabFragment", C2188811AlT.LIZIZ(sbLIZ4));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        if (((Boolean) FollowAddRedDotShowSceneExp.LJ.getValue()).booleanValue() && this.LLIZLLLIL) {
            ArrayList arrayList = (ArrayList) this.LLJJIJI;
            if (this.LLJJJJ >= arrayList.size() || !Intrinsics.LJFF(ListProtector.get(arrayList, this.LLJJJJ), "following_relation")) {
                return;
            }
            C1595060rbs.LIZIZ.LJI(null, C059B.BACK_FROM_FOLLOW_LIST);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(FollowRelationTabFragment.class.getName());
        }
        super.onResume();
        User user = this.LLJI;
        if (user != null) {
            this.LLJILJILJ = user.getFollowingCount();
            this.LLJILLL = C588270N5l.LIZ(user) ? user.getFansCount() : user.getFollowerCount();
            this.LLJJ = user.getFriendCount();
        }
        if (this.LLJJJIL) {
            return;
        }
        bS();
    }

    public final void Cn(Function1<? super FollowRelationState, Unit> function1) {
        if (C300120Bpa.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLJJL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
            C736680Sv4.LJIJJ(assemVMLazy.getValue(), new AwS598S0100000_19(function1, (Function1<? super C1251350ifV, C1251350ifV>) 372));
            return;
        }
        withState((JediViewModel) this.LLJJJJLIIL.getValue(), new AwS598S0100000_19(function1, (Function1<? super C1251350ifV, C1251350ifV>) 373));
    }

    public final void VR(int i) {
        User user;
        View view;
        if (i > 0 && !this.LLIZLLLIL && (user = this.LLJI) != null && !TextUtils.isEmpty(user.getRecommendReasonRelation()) && PatternProtector.compile("<b>").matcher(user.getRecommendReasonRelation()).find()) {
            List<String> list = this.LLJJIII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C844470XAv.LIZ.getClass();
            sbLIZ.append(C844470XAv.LIZ().getString(2131829432));
            sbLIZ.append(' ');
            sbLIZ.append(C1843500y4a.LIZIZ(i));
            ListProtector.set(list, 0, C2188811AlT.LIZIZ(sbLIZ));
            C19Y5 c19y5LJIIIZ = SR().LJIIIZ(0);
            if (c19y5LJIIIZ != null) {
                view = c19y5LJIIIZ.LJFF;
            } else {
                view = null;
            }
            if (view instanceof TextView) {
                ((TextView) view).setText((CharSequence) ListProtector.get(this.LLJJIII, 0));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        User userM307clone;
        if (view != null) {
            int id = view.getId();
            if (id == R.id.bn2) {
                Cn(new AwS598S0100000_19(this, 371));
                return;
            }
            if (id != R.id.adk) {
                return;
            }
            if (UR().getCurrentItem() == 0) {
                str = "following";
            } else {
                str = "fans";
            }
            FindFriendsPageArg findFriendsPageArg = new FindFriendsPageArg(false, 0, str, "", EnumC666200QBe.DEFAULT, null, 0, false, -1, null);
            C1264430j0b c1264430j0b = new C1264430j0b("personal_homepage", "find_friends_page", null);
            User user = this.LLJI;
            if (user != null) {
                userM307clone = user.m307clone();
            } else {
                userM307clone = null;
            }
            Context context = getContext();
            if (context != null) {
                ((RouteAddFriendsPageService) ServiceManager.get().getService(RouteAddFriendsPageService.class)).LIZJ(context, findFriendsPageArg, c1264430j0b, userM307clone, false);
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "relation_page");
            c2344009Gk.LJIIIIZZ("has_notice", CardStruct.IStatusCode.DEFAULT);
            C20684815ws.LJIILLIIL("click_add_friends", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        boolean z;
        BaseRelationFragment baseRelationFragment;
        boolean z2;
        String str;
        String str2;
        String str3;
        String uid;
        C19Y5 c19y5LJIIIZ = SR().LJIIIZ(i);
        if (c19y5LJIIIZ != null) {
            Object obj = c19y5LJIIIZ.LIZ;
            if ((obj instanceof String) && TextUtils.equals((String) obj, "from_click")) {
                z = true;
            } else {
                z = false;
            }
            c19y5LJIIIZ.LIZ = null;
        } else {
            z = false;
        }
        if (!this.LLJILJIL) {
            String strIT1 = ((InterfaceC1264910j1N) this.LLJJLIIIJLLLLLLLZ.getValue()).iT1();
            if (!C123100dR.LIZ(strIT1)) {
                if (this.LLIZLLLIL) {
                    strIT1 = "personal_homepage";
                } else {
                    strIT1 = "others_homepage";
                }
            }
            String str4 = (String) ListProtector.get(this.LLJJIJI, i);
            String str5 = "";
            switch (str4.hashCode()) {
                case -1917104899:
                    str = !str4.equals("follower_relation") ? "" : "fans";
                    break;
                case -293406256:
                    str = "common_relation";
                    if (!str4.equals("common_relation")) {
                        str = "";
                    }
                    break;
                case -49330266:
                    str = !str4.equals("suggest_user") ? "" : "recommendation";
                    break;
                case 463020972:
                    str = !str4.equals("muf_user") ? "" : "friends";
                    break;
                case 1918208455:
                    str = !str4.equals("mutual_relation") ? "" : "mutual";
                    break;
                case 2080082922:
                    str = !str4.equals("following_relation") ? "" : "following";
                    break;
                default:
                    str = "";
                    break;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("tab_name", str);
            String str6 = "click";
            if (z) {
                str2 = "click";
            } else {
                str2 = "slide";
            }
            c2344009Gk.LJIIIIZZ("enter_method", str2);
            c2344009Gk.LJIIIIZZ("previous_page", strIT1);
            User user = this.LLJI;
            if (user != null && (uid = user.getUid()) != null) {
                str5 = uid;
            }
            c2344009Gk.LJIIIIZZ("to_user_id", str5);
            C20684815ws.LJIILLIIL("change_relation_tab", c2344009Gk.LIZ);
            if (!this.LLJJJJJIL && Intrinsics.LJFF(str, "friends")) {
                C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
                if (!c1076010e6h.LJIIJ().LIZJ() && !c1076010e6h.LJII().LIZJ()) {
                    str3 = "authorize";
                } else {
                    str3 = "normal";
                }
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("tab_name", str);
                if (!z) {
                    str6 = "slide";
                }
                c2344009Gk2.LJIIIIZZ("enter_method", str6);
                c2344009Gk2.LJIIIIZZ("enter_from", "relation_tab");
                c2344009Gk2.LJIIIIZZ("previous_page", "personal_homepage");
                c2344009Gk2.LIZJ(this.LLJJ, "muf_cnt");
                c2344009Gk2.LJIIIIZZ("page_type", str3);
                C20684815ws.LJIILLIIL("enter_mutual_friends_list", c2344009Gk2.LIZ);
                this.LLJJJJJIL = true;
            }
        } else {
            this.LLJILJIL = false;
        }
        ZR();
        ((InterfaceC1264910j1N) this.LLJJLIIIJLLLLLLLZ.getValue()).Ln0(TextUtils.equals((CharSequence) ListProtector.get(this.LLJJIJI, i), "following_relation"));
        C437940HFg c437940HFg = this.LLIZ;
        if (c437940HFg == null) {
            c437940HFg = null;
        }
        int i2 = 0;
        for (Fragment fragment : c437940HFg.LLIZ) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                Fragment fragment2 = fragment;
                if ((fragment2 instanceof BaseRelationFragment) && (baseRelationFragment = (BaseRelationFragment) fragment2) != null) {
                    if (i2 == i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 != baseRelationFragment.LLILLJJLI) {
                        baseRelationFragment.LLILLJJLI = z2;
                        if (z2) {
                            baseRelationFragment.onPageSelected();
                        } else {
                            baseRelationFragment.UR();
                        }
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        List<Fragment> list = c437940HFg.LLIZ;
        if (list != null && !list.isEmpty() && i >= 0 && i <= c437940HFg.LLIZ.size() && (ListProtector.get(c437940HFg.LLIZ, i) instanceof InterfaceC1264400j0Y)) {
            InterfaceC1264400j0Y interfaceC1264400j0Y = (InterfaceC1264400j0Y) ListProtector.get(c437940HFg.LLIZ, i);
            if (interfaceC1264400j0Y.LJLLL()) {
                interfaceC1264400j0Y.ck();
            }
        }
        ((InterfaceC1264910j1N) this.LLJJLIIIJLLLLLLLZ.getValue()).Zo1(TextUtils.equals((CharSequence) ListProtector.get(this.LLJJIJI, i), "follower_relation"));
        this.LLJJJJ = i;
    }

    public final String aS(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android:switcher:");
        sbLIZ.append(R.id.viewpager);
        sbLIZ.append(':');
        sbLIZ.append(i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0284  */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 1393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ed3, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
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
