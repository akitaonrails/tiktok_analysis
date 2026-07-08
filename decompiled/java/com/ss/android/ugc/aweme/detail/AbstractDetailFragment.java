package com.ss.android.ugc.aweme.detail;

import X.AbstractC480470Isn;
import X.C098200Yq;
import X.C1260290itv;
import X.C12ES;
import X.C1445970njP;
import X.C14EU;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19Y3;
import X.C19Y5;
import X.C1C7U;
import X.C20684815ws;
import X.C20687815xM;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C341940Daq;
import X.C446980Hfs;
import X.C497820Jfg;
import X.C616540OGe;
import X.C786410Ut5;
import X.C800330VaR;
import X.InterfaceC1245470iW1;
import X.InterfaceC1258040iqI;
import X.InterfaceC1260330itz;
import X.InterfaceC19369110q9;
import X.InterfaceC19400810vG;
import X.InterfaceC469360Ias;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractDetailFragment extends AmeBaseFragment implements InterfaceC469360Ias, InterfaceC1260330itz {
    public static final String FRAGMENT_TAG;
    public DetailViewModel detailViewModel;
    public InterfaceC19369110q9 mAnimator;
    public ImageView mBackBtn;
    public TuxIconView mCloseBtn;
    public int mCurPos;
    public int mCurrentPosition;
    public TuxIconView mExpandBtn;
    public List<AmeBaseFragment> mFragmentList;
    public AbstractC480470Isn mFragmentPagerAdapter;
    public List<InterfaceC19400810vG> mFragments;
    public C1260290itv mScrollableLayout;
    public ImageView mShareButton;
    public List<InterfaceC19400810vG> mSingleLineFragments;
    public String mStickerIds;
    public C19Y3 mTabLayout;
    public TextView mTitle;
    public View mTitleColorCtrl;
    public ViewPager mViewPager;
    public boolean mHasRecordHideAnim = true;
    public final Observer<Boolean> scroll2TopObserver = new AObserverS231S0100000_29(this, 39);
    public long mStartTime = -1;

    public abstract String getCurId();

    public abstract AbstractC480470Isn getFragmentPagerAdapter();

    public abstract String getLabelName(int i);

    public abstract int getResId();

    public abstract String getShootWayLabel();

    public int getTabViewResId() {
        return R.layout.bk4;
    }

    public abstract void initArguments(Bundle bundle);

    public void initView(View view) {
    }

    public boolean isHaveLatestTab() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public boolean isRegisterEventBus() {
        return true;
    }

    public boolean mobStayTimeOnPause() {
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_ss_android_ugc_aweme_detail_AbstractDetailFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    @C14EU
    public void onEvent(C1445970njP c1445970njP) {
    }

    public void onPageChange(int i, int i2) {
    }

    public void onPageChange(int i, boolean z) {
    }

    @Override // X.InterfaceC469360Ias
    public void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        com_ss_android_ugc_aweme_detail_AbstractDetailFragment_com_ss_android_ugc_aweme_lancet_ComponentFragmentLancet_onResume(this);
    }

    @Override // X.InterfaceC1260330itz
    public boolean onScrollEnd() {
        return false;
    }

    public void onTextClick(int i) {
    }

    public boolean showTabLayout() {
        return false;
    }

    private void initTabLayout() {
        C19Y3 c19y3 = this.mTabLayout;
        if (c19y3 == null) {
            return;
        }
        C786410Ut5.LLLLIL(c19y3, 0);
        this.mTabLayout.setCustomTabViewResId(getTabViewResId());
        this.mTabLayout.setBackgroundColor(C446980Hfs.LIZ(getContext(), R.color.bz));
        this.mTabLayout.LJIILLIIL(C341940Daq.LIZ(16.0d), C341940Daq.LIZ(16.0d));
        addDividerForTabs();
        this.mTabLayout.setupWithViewPager(this.mViewPager);
        this.mTabLayout.setOnTabClickListener(new InterfaceC1245470iW1() { // from class: X.10vF
            @Override // X.InterfaceC1245470iW1
            public final void LIZ(C19Y5 c19y5) {
                this.LIZ.lambda$initTabLayout$2(c19y5);
            }
        });
        if (showTabLayout()) {
            return;
        }
        C786410Ut5.LLLLIL(this.mTabLayout, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startAnimator$1() {
        C1C7U.LIZ("AbstractDetailFragment@2efb.startAnimator$1L");
        if (isViewValid()) {
            this.mAnimator.start();
        }
        C1C7U.LIZIZ("AbstractDetailFragment@2efb.startAnimator$1L");
    }

    private void startAnimator() {
        if (this.mAnimator != null) {
            C786410Ut5.LJLIIL(500L, new BPEAHandler(), new ARunnableS129S0100000_29(this, 26));
        }
    }

    private void stopAnimator() {
        InterfaceC19369110q9 interfaceC19369110q9 = this.mAnimator;
        if (interfaceC19369110q9 != null) {
            interfaceC19369110q9.stop();
        }
    }

    public void addDividerForTabs() {
        C19Y3 c19y3 = this.mTabLayout;
        if (c19y3 == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) c19y3.getChildAt(0);
        linearLayout.setShowDividers(2);
        linearLayout.setDividerDrawable(C800330VaR.LIZIZ(c19y3.getContext(), R.drawable.bgp));
        linearLayout.setDividerPadding(C341940Daq.LIZ(16.0d));
    }

    public void initData() {
        C1260290itv c1260290itv = this.mScrollableLayout;
        if (c1260290itv != null) {
            c1260290itv.setOnScrollListener(this);
        }
        AbstractC480470Isn fragmentPagerAdapter = getFragmentPagerAdapter();
        this.mFragmentPagerAdapter = fragmentPagerAdapter;
        this.mViewPager.setAdapter(fragmentPagerAdapter);
        initTabLayout();
        this.mViewPager.addOnPageChangeListener(this);
        this.mViewPager.setCurrentItem(this.mCurPos);
        onPageSelected(this.mCurPos);
    }

    public void mobStayTime() {
        if (this.mStartTime != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.mStartTime;
            getContext();
            String labelName = getLabelName(this.mCurPos);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(jCurrentTimeMillis);
            C20684815ws.LJIIL("stay_time", labelName, C2188811AlT.LIZIZ(sbLIZ), getCurId());
            this.mStartTime = -1L;
        }
    }

    public void onNeedScrollToTop() {
        C1260290itv c1260290itv = this.mScrollableLayout;
        if (c1260290itv != null) {
            c1260290itv.setMaxScrollHeight(Integer.MAX_VALUE);
            this.mScrollableLayout.scrollTo(0, 2000);
        }
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android:switcher:");
        sbLIZ.append(R.id.viewpager);
        sbLIZ.append(":");
        FRAGMENT_TAG = C2188811AlT.LIZIZ(sbLIZ);
    }

    public void com_ss_android_ugc_aweme_detail_AbstractDetailFragment__onResume$___twin___() {
        super.onResume();
        this.mStartTime = System.currentTimeMillis();
        startAnimator();
    }

    public void controlScroll() {
        List<InterfaceC19400810vG> list;
        RecyclerView recyclerView;
        if (isViewValid() && (list = this.mFragments) != null) {
            int size = list.size();
            int i = this.mCurPos;
            if (size <= i || ListProtector.get(this.mFragments, i) == null || (recyclerView = (RecyclerView) ((InterfaceC19400810vG) ListProtector.get(this.mFragments, this.mCurPos)).LJJLIIIJILLIZJL()) == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            C1260290itv c1260290itv = this.mScrollableLayout;
            if (c1260290itv == null) {
                return;
            }
            if (childCount == 0) {
                if (c1260290itv.LLJJL != 0) {
                    c1260290itv.scrollTo(0, 0);
                }
                List<InterfaceC19400810vG> list2 = this.mFragments;
                ((InterfaceC19400810vG) ListProtector.get(list2, (this.mCurPos + 1) % list2.size())).K();
                this.mScrollableLayout.setMaxScrollHeight(0);
                return;
            }
            View childAt = recyclerView.getLayoutManager().getChildAt(childCount - 1);
            int childCount2 = this.mScrollableLayout.getChildCount();
            if (childCount2 < 2 || childAt == null) {
                return;
            }
            this.mScrollableLayout.setMaxScrollHeight(((((childAt.getBottom() + this.mScrollableLayout.getChildAt(childCount2 - 1).getTop()) - this.mScrollableLayout.getCurScrollY()) + this.mScrollableLayout.getCurScrollY()) + C497820Jfg.LIZJ(getContext())) - C12ES.LJIIIIZZ(getContext()));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.detailViewModel.LLILLJJLI.removeObserver(this.scroll2TopObserver);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (mobStayTimeOnPause()) {
            mobStayTime();
        }
        stopAnimator();
    }

    public static void com_ss_android_ugc_aweme_detail_AbstractDetailFragment_com_ss_android_ugc_aweme_lancet_ComponentFragmentLancet_onResume(AbstractDetailFragment abstractDetailFragment) {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(abstractDetailFragment.getActivity())) {
            C2187451AjH.LJJIJIIJI(abstractDetailFragment.getClass().getName());
        }
        abstractDetailFragment.com_ss_android_ugc_aweme_detail_AbstractDetailFragment__onResume$___twin___();
    }

    private void findView(View view) {
        this.mScrollableLayout = (C1260290itv) view.findViewById(R.id.u30);
        this.mTitle = (TextView) view.findViewById(R.id.title);
        this.mTitleColorCtrl = view.findViewById(R.id.y0u);
        this.mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        this.mTabLayout = (C19Y3) view.findViewById(R.id.wya);
        this.mShareButton = (ImageView) view.findViewById(R.id.uyn);
        this.mBackBtn = (ImageView) view.findViewById(R.id.bn2);
        this.mExpandBtn = (TuxIconView) view.findViewById(R.id.inu);
        this.mCloseBtn = (TuxIconView) view.findViewById(R.id.e1v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTabLayout$2(C19Y5 c19y5) {
        onTextClick(c19y5.LJ);
        c19y5.LIZ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Boolean bool) {
        if (bool.booleanValue()) {
            onNeedScrollToTop();
        }
    }

    public InterfaceC19369110q9 createAnimator(ViewGroup viewGroup) {
        return new C20687815xM(getContext(), viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initArguments(getArguments());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC469360Ias
    public void onPageSelected(int i) {
        boolean z;
        ViewPager viewPager;
        if (i < 0 || ((viewPager = this.mViewPager) != null && viewPager.getAdapter() != null && i >= this.mViewPager.getAdapter().getCount())) {
            i = 0;
        }
        if (this.mStartTime != -1 && this.mCurPos != i) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.mStartTime;
            getContext();
            String labelName = getLabelName(this.mCurPos);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(jCurrentTimeMillis);
            C20684815ws.LJIIL("stay_time", labelName, C2188811AlT.LIZIZ(sbLIZ), getCurId());
            this.mStartTime = System.currentTimeMillis();
        }
        if (i != this.mCurrentPosition) {
            z = true;
        } else {
            z = false;
        }
        onPageChange(i, z);
        this.mCurrentPosition = i;
        this.mCurPos = i;
        int currentItem = this.mViewPager.getCurrentItem();
        int i2 = this.mCurPos;
        if (currentItem != i2) {
            this.mViewPager.setCurrentItem(i2);
        }
        C1260290itv c1260290itv = this.mScrollableLayout;
        if (c1260290itv != null && c1260290itv.getHelper() != null && this.mFragments != null) {
            this.mScrollableLayout.getHelper().LIZIZ = (InterfaceC1258040iqI) ListProtector.get(this.mFragments, this.mCurPos);
        }
        InterfaceC19369110q9 interfaceC19369110q9 = this.mAnimator;
        if (interfaceC19369110q9 != null) {
            interfaceC19369110q9.onPageSelected();
        }
        AbstractC480470Isn abstractC480470Isn = this.mFragmentPagerAdapter;
        if (abstractC480470Isn != null && this.mViewPager != null) {
            int count = abstractC480470Isn.getCount();
            for (int i3 = 0; i3 < count; i3++) {
                Fragment fragmentLJJIJIL = this.mFragmentPagerAdapter.LJJIJIL(i3);
                if (fragmentLJJIJIL != 0 && fragmentLJJIJIL.getFragmentManager() != null) {
                    if (i3 == i) {
                        fragmentLJJIJIL.setUserVisibleHint(true);
                        onPageChange(i, fragmentLJJIJIL.hashCode());
                    } else {
                        fragmentLJJIJIL.setUserVisibleHint(false);
                    }
                    ((InterfaceC19400810vG) fragmentLJJIJIL).Bp();
                }
            }
        }
        controlScroll();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("cur_pos", this.mCurPos);
        super.onSaveInstanceState(bundle);
    }

    public void setAnimator(InterfaceC19369110q9 interfaceC19369110q9) {
        this.mAnimator = interfaceC19369110q9;
    }

    public void onScroll(int i, int i2) {
        this.detailViewModel.LL.setValue(Boolean.TRUE);
    }

    public void onScrolled(float f, float f2) {
        InterfaceC19369110q9 interfaceC19369110q9;
        controlScroll();
        if (Math.abs(f) < Math.abs(f2) && this.mHasRecordHideAnim) {
            if (f2 > 30.0f) {
                InterfaceC19369110q9 interfaceC19369110q92 = this.mAnimator;
                if (interfaceC19369110q92 != null) {
                    interfaceC19369110q92.LIZIZ();
                    return;
                }
                return;
            }
            if (f2 >= -30.0f || (interfaceC19369110q9 = this.mAnimator) == null) {
                return;
            }
            interfaceC19369110q9.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        findView(view);
        if (this.mAnimator == null) {
            this.mAnimator = createAnimator((ViewGroup) view);
        }
        if (bundle != null) {
            this.mCurPos = bundle.getInt("cur_pos", 0);
        }
        DetailViewModel detailViewModel = (DetailViewModel) ViewModelProviders.of(getActivity()).get(DetailViewModel.class);
        this.detailViewModel = detailViewModel;
        detailViewModel.LLILLJJLI.observeForever(this.scroll2TopObserver);
        initData();
    }

    public View com_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, getResId(), viewGroup, false);
        initView(viewTd);
        return viewTd;
    }

    public static View com_ss_android_ugc_aweme_detail_AbstractDetailFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(AbstractDetailFragment abstractDetailFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewCom_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___ = abstractDetailFragment.com_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewCom_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___ instanceof View)) {
            viewCom_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___ = null;
        }
        if (viewCom_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewCom_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___, abstractDetailFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewCom_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___, abstractDetailFragment);
                viewCom_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___.setTag(R.id.view_tree_saved_state_registry_owner, abstractDetailFragment);
                C19EG activity = abstractDetailFragment.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewCom_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewCom_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___;
    }
}
