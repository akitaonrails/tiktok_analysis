package com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native;

import X.AbstractC1675210th9;
import X.C098200Yq;
import X.C1391190mJ3;
import X.C13BV;
import X.C1685300txQ;
import X.C189200o6;
import X.C1911010zpT;
import X.C1911040zpW;
import X.C19332010kA;
import X.C19333610kQ;
import X.C1954807lC;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20277814Wa;
import X.C786410Ut5;
import X.EnumC1911020zpU;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import X.ViewTreeObserverOnGlobalLayoutListenerC19333810kS;
import Y.AObserverS230S0100000_28;
import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.donate.DonatePageFragment;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.donorlist.DonorListPageFragment;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.edit.EditFundraiserPageFragment;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.fundraiser.FundraiserPageFragment;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import kotlin.Unit;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class FundraiserContainerFragment extends Fragment implements InterfaceC21503819Do {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KjA/ICE2OzZiHELIOSLzo9LDctIDw2OmsiKDs6PiBiDzo9LDctIDw2OgYjJzsyISspOwkhKSIhLCEn";
    public FundraiserContainerViewModel LLILLJJLI;
    public EnumC1911020zpU LLILZ;
    public ViewTreeObserverOnGlobalLayoutListenerC19333810kS LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public final int LL = View.generateViewId();
    public boolean LLILLL = true;
    public final C19332010kA LLJ = new C19332010kA(this, 0);

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final void NR() {
        MutableLiveData<C1911040zpW> mutableLiveData;
        C1911040zpW value;
        View viewFindViewById;
        View viewFindViewById2;
        FundraiserContainerViewModel fundraiserContainerViewModel = this.LLILLJJLI;
        if (fundraiserContainerViewModel == null || (mutableLiveData = fundraiserContainerViewModel.LL) == null || (value = mutableLiveData.getValue()) == null) {
            return;
        }
        int i = value.LJIILL;
        EnumC1911020zpU enumC1911020zpU = value.LJI;
        EnumC1911020zpU enumC1911020zpU2 = EnumC1911020zpU.FUNDRAISER;
        if (enumC1911020zpU != enumC1911020zpU2) {
            MR();
        }
        int screenWidth = ScreenUtils.getScreenWidth(getContext());
        int screenHeight = ScreenUtils.getScreenHeight(getContext());
        if (screenWidth > screenHeight) {
            if (this.LLIZLLLIL) {
                return;
            }
            View view = getView();
            if (view != null && (viewFindViewById2 = view.findViewById(this.LL)) != null) {
                C786410Ut5.W5(viewFindViewById2, new FrameLayout.LayoutParams(-1, screenHeight));
            }
            this.LLIZLLLIL = true;
            return;
        }
        if (enumC1911020zpU == EnumC1911020zpU.EDIT && !value.LJIIJ) {
            OR((int) (((double) screenHeight) * 0.6d));
            return;
        }
        if (enumC1911020zpU == EnumC1911020zpU.DONATE && !value.LJIIJ) {
            OR((int) (((double) screenHeight) * 0.7d));
            return;
        }
        if (i != 0 || enumC1911020zpU != enumC1911020zpU2 || value.LJIIJ) {
            OR(i);
            return;
        }
        View view2 = getView();
        if (view2 == null || (viewFindViewById = view2.findViewById(this.LL)) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC19333810kS viewTreeObserverOnGlobalLayoutListenerC19333810kS = this.LLILZIL;
        if (viewTreeObserverOnGlobalLayoutListenerC19333810kS != null) {
            C786410Ut5.C3(viewFindViewById.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC19333810kS);
        }
        this.LLILZLL = 0;
        this.LLIZ = 0;
        ViewTreeObserverOnGlobalLayoutListenerC19333810kS viewTreeObserverOnGlobalLayoutListenerC19333810kS2 = new ViewTreeObserverOnGlobalLayoutListenerC19333810kS(viewFindViewById, this, 0);
        this.LLILZIL = viewTreeObserverOnGlobalLayoutListenerC19333810kS2;
        C786410Ut5.x3(viewFindViewById.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC19333810kS2);
    }

    public final void SR() {
        View viewFindViewById;
        FundraiserContainerViewModel fundraiserContainerViewModel = this.LLILLJJLI;
        if (fundraiserContainerViewModel != null) {
            fundraiserContainerViewModel.CQ2(0);
        }
        try {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJIILLIIL(-1, this);
            View view = getView();
            if (view == null || (viewFindViewById = view.findViewById(this.LL)) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).height = -2;
                C786410Ut5.W5(viewFindViewById, layoutParams);
            } else {
                C786410Ut5.W5(viewFindViewById, new FrameLayout.LayoutParams(-1, -2));
            }
            viewFindViewById.requestLayout();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void MR() {
        View view = getView();
        View viewFindViewById = view != null ? view.findViewById(this.LL) : null;
        ViewTreeObserverOnGlobalLayoutListenerC19333810kS viewTreeObserverOnGlobalLayoutListenerC19333810kS = this.LLILZIL;
        if (viewFindViewById != null && viewTreeObserverOnGlobalLayoutListenerC19333810kS != null) {
            C786410Ut5.C3(viewFindViewById.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC19333810kS);
        }
        this.LLILZIL = null;
        this.LLILZLL = 0;
        this.LLIZ = 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        MR();
        getChildFragmentManager().LLIILZL(this.LLJ);
        super.onDestroyView();
    }

    public final void OR(int i) {
        View viewFindViewById;
        View view;
        if (ScreenUtils.getScreenWidth(getContext()) <= ScreenUtils.getScreenHeight(getContext()) && i > 0) {
            View view2 = getView();
            if (view2 != null && (viewFindViewById = view2.findViewById(this.LL)) != null) {
                try {
                    Object parent = viewFindViewById.getParent();
                    if (!(parent instanceof View) || (view = (View) parent) == null) {
                        view = viewFindViewById;
                    }
                    BottomSheetBehavior.from(view).setPeekHeight(i);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) layoutParams).height = i;
                        C786410Ut5.W5(viewFindViewById, layoutParams);
                    } else {
                        C786410Ut5.W5(viewFindViewById, new FrameLayout.LayoutParams(-1, i));
                    }
                    viewFindViewById.requestLayout();
                }
            }
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJIILLIIL(i, this);
        }
    }

    public final void PR(EnumC1911020zpU enumC1911020zpU) {
        Fragment fundraiserPageFragment;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        MutableLiveData<C1911040zpW> mutableLiveData;
        C1911040zpW value;
        Integer num;
        MutableLiveData<C1911040zpW> mutableLiveData2;
        C1911040zpW value2;
        String str5;
        MutableLiveData<C1911040zpW> mutableLiveData3;
        C1911040zpW value3;
        MutableLiveData<C1911040zpW> mutableLiveData4;
        C1911040zpW value4;
        MutableLiveData<C1911040zpW> mutableLiveData5;
        C1911040zpW value5;
        MutableLiveData<C1911040zpW> mutableLiveData6;
        C1911040zpW value6;
        MutableLiveData<C1911040zpW> mutableLiveData7;
        C1911040zpW value7;
        int i2 = C1911010zpT.LIZ[enumC1911020zpU.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        fundraiserPageFragment = new DonatePageFragment();
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    fundraiserPageFragment = new EditFundraiserPageFragment();
                }
            } else {
                fundraiserPageFragment = new DonorListPageFragment();
            }
        } else {
            fundraiserPageFragment = new FundraiserPageFragment();
        }
        Bundle bundle = new Bundle();
        FundraiserContainerViewModel fundraiserContainerViewModel = this.LLILLJJLI;
        String str6 = "";
        if (fundraiserContainerViewModel == null || (mutableLiveData7 = fundraiserContainerViewModel.LL) == null || (value7 = mutableLiveData7.getValue()) == null || (str = value7.LIZ) == null) {
            str = "";
        }
        C786410Ut5.LJJJI("arg_org_id", str, bundle);
        FundraiserContainerViewModel fundraiserContainerViewModel2 = this.LLILLJJLI;
        if (fundraiserContainerViewModel2 == null || (mutableLiveData6 = fundraiserContainerViewModel2.LL) == null || (value6 = mutableLiveData6.getValue()) == null || (str2 = value6.LIZIZ) == null) {
            str2 = "";
        }
        C786410Ut5.LJJJI("arg_fundraiser_id", str2, bundle);
        FundraiserContainerViewModel fundraiserContainerViewModel3 = this.LLILLJJLI;
        if (fundraiserContainerViewModel3 == null || (mutableLiveData5 = fundraiserContainerViewModel3.LL) == null || (value5 = mutableLiveData5.getValue()) == null || (str3 = value5.LIZJ) == null) {
            str3 = "";
        }
        C786410Ut5.LJJJI("arg_enter_from", str3, bundle);
        FundraiserContainerViewModel fundraiserContainerViewModel4 = this.LLILLJJLI;
        if (fundraiserContainerViewModel4 == null || (mutableLiveData4 = fundraiserContainerViewModel4.LL) == null || (value4 = mutableLiveData4.getValue()) == null || (str4 = value4.LIZLLL) == null) {
            str4 = "";
        }
        C786410Ut5.LJJJI("arg_enter_method", str4, bundle);
        FundraiserContainerViewModel fundraiserContainerViewModel5 = this.LLILLJJLI;
        if (fundraiserContainerViewModel5 != null && (mutableLiveData3 = fundraiserContainerViewModel5.LL) != null && (value3 = mutableLiveData3.getValue()) != null) {
            i = value3.LJ;
        } else {
            i = 0;
        }
        bundle.putInt("arg_item_type", i);
        FundraiserContainerViewModel fundraiserContainerViewModel6 = this.LLILLJJLI;
        if (fundraiserContainerViewModel6 != null && (mutableLiveData2 = fundraiserContainerViewModel6.LL) != null && (value2 = mutableLiveData2.getValue()) != null && (str5 = value2.LJFF) != null) {
            str6 = str5;
        }
        C786410Ut5.LJJJI("arg_item_id", str6, bundle);
        FundraiserContainerViewModel fundraiserContainerViewModel7 = this.LLILLJJLI;
        if (fundraiserContainerViewModel7 != null && (mutableLiveData = fundraiserContainerViewModel7.LL) != null && (value = mutableLiveData.getValue()) != null && (num = value.LJIJJ) != null) {
            bundle.putInt("arg_donation_optimize", num.intValue());
        }
        fundraiserPageFragment.setArguments(bundle);
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIIZILJ = false;
        c19ehLJIIJ.LJIJJLI(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
        c19ehLJIIJ.LJIJ(this.LL, fundraiserPageFragment, enumC1911020zpU.name());
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        Integer numValueOf;
        String string5;
        super.onCreate(bundle);
        this.LLILLJJLI = (FundraiserContainerViewModel) new ViewModelProvider(this, new C19333610kQ(0)).get(FundraiserContainerViewModel.class);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("arg_org_id")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("arg_fundraiser_id")) == null) {
            string2 = "";
        }
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string3 = arguments3.getString("arg_enter_from")) == null) {
            string3 = "";
        }
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string4 = arguments4.getString("arg_enter_method")) == null) {
            string4 = "";
        }
        Bundle arguments5 = getArguments();
        int i = 0;
        if (arguments5 != null) {
            i = arguments5.getInt("arg_item_type", 0);
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null && (string5 = arguments6.getString("arg_item_id")) != null) {
            str = string5;
        }
        Bundle arguments7 = getArguments();
        Integer numValueOf2 = null;
        if (arguments7 != null) {
            numValueOf = Integer.valueOf(arguments7.getInt("arg_donation_optimize"));
        } else {
            numValueOf = null;
        }
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            numValueOf2 = Integer.valueOf(arguments8.getInt("arg_is_anchor"));
        }
        FundraiserContainerViewModel fundraiserContainerViewModel = this.LLILLJJLI;
        if (fundraiserContainerViewModel != null) {
            fundraiserContainerViewModel.LL.setValue(new C1911040zpW(string, string2, string3, string4, i, str, EnumC1911020zpU.FUNDRAISER, null, null, null, true, false, C13BV.INSTANCE, 0, false, 0, 0L, null, null, 0, numValueOf, numValueOf2, true, 0));
        }
        RR(this, string, string2, i, str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MutableLiveData<C1911040zpW> mutableLiveData;
        MutableLiveData<AbstractC1675210th9> mutableLiveData2;
        super.onViewCreated(view, bundle);
        getChildFragmentManager().LJZL(this.LLJ, false);
        FundraiserContainerViewModel fundraiserContainerViewModel = this.LLILLJJLI;
        if (fundraiserContainerViewModel != null && (mutableLiveData2 = fundraiserContainerViewModel.LLILLJJLI) != null) {
            mutableLiveData2.observe(getViewLifecycleOwner(), new AObserverS230S0100000_28(this, 13));
        }
        FundraiserContainerViewModel fundraiserContainerViewModel2 = this.LLILLJJLI;
        if (fundraiserContainerViewModel2 != null && (mutableLiveData = fundraiserContainerViewModel2.LL) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS230S0100000_28(this, 14));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        FrameLayout frameLayout = new FrameLayout(requireContext());
        FrameLayout frameLayout2 = new FrameLayout(requireContext());
        frameLayout2.setId(this.LL);
        frameLayout.addView(frameLayout2);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(com.zhiliaoapp.musically.R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
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

    public static void RR(FundraiserContainerFragment fundraiserContainerFragment, String str, String str2, int i, String str3) {
        FundraiserContainerViewModel fundraiserContainerViewModel = fundraiserContainerFragment.LLILLJJLI;
        if (fundraiserContainerViewModel != null) {
            fundraiserContainerViewModel.AQ2(false);
        }
        FundraiserContainerViewModel fundraiserContainerViewModel2 = fundraiserContainerFragment.LLILLJJLI;
        if (fundraiserContainerViewModel2 != null) {
            fundraiserContainerViewModel2.setLoading(true);
        }
        ComplianceServiceProvider.LJIILL().LJIILJJIL(i, 0, str, str2, str3, new AwS607S0100000_28(fundraiserContainerFragment, 177));
    }
}
