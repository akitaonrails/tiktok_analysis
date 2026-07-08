package com.bytedance.tiktok.homepage.mainpagefragment.assem;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C0RUJ;
import X.C0X35;
import X.C1009520cNS;
import X.C1211700hdY;
import X.C12P2;
import X.C12P4;
import X.C1440005kM;
import X.C1569340qwO;
import X.C1570460qyC;
import X.C1592050rX1;
import X.C1619850sFr;
import X.C1899620zX6;
import X.C19252910Tv;
import X.C19749612Ow;
import X.C2188811AlT;
import X.C2248671Czp;
import X.C2529009vc;
import X.C426750GoL;
import X.C444960Hcc;
import X.C452501pT;
import X.C520680KbS;
import X.C586640Mze;
import X.C786410Ut5;
import X.InterfaceC1009720cNm;
import X.InterfaceC1554640qYg;
import X.InterfaceC1592060rX2;
import X.InterfaceC494301wD;
import Y.ARunnableS134S0100000_34;
import Y.ARunnableS9S0202000_24;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSeekAssem;
import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.feed.platform.panel.MainSeekbarInterceptTouchAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MainPageSeekAssem extends BaseMainPageFragmentUIAssem implements InterfaceC1592060rX2, MainPageSeekAbility, MainSeekbarInterceptTouchAbility, C0RUJ, InterfaceC1554640qYg {
    public final C01GW LLJ = C452501pT.LIZIZ(new C1569340qwO(this));
    public final C01GW LLJI = C452501pT.LIZIZ(new C1570460qyC(this));
    public final C586640Mze LLJIJIL = new C586640Mze("MainPageSeekAssem");
    public View LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public C12P2 LLJJIII;
    public C12P4 LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public C1211700hdY LLJJIJIL;
    public VideoSeekBarMaskView LLJJJ;
    public FrameLayout LLJJJIL;

    @Override // X.InterfaceC1592060rX2
    public final void Hb() {
    }

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "panel_main_page_seek";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -892200181 || iHashCode == 1391480285) {
            return this;
        }
        return null;
    }

    @Override // X.C0RUJ
    public final void lj() {
        Aweme aweme;
        HomePageDataViewModel homePageDataViewModel;
        String eventType;
        HomePageDataViewModel homePageDataViewModel2 = (HomePageDataViewModel) this.LLJ.getValue();
        if (homePageDataViewModel2 == null || (aweme = homePageDataViewModel2.LLJILJILJ) == null || (homePageDataViewModel = (HomePageDataViewModel) this.LLJ.getValue()) == null || (eventType = homePageDataViewModel.getEventType()) == null) {
            return;
        }
        C1440005kM.LIZ(new C1619850sFr(aweme, eventType));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1009520cNS c1009520cNSLJII;
        super.onDestroy();
        C1592050rX1.LIZIZ(this);
        C1211700hdY c1211700hdY = this.LLJJIJIL;
        if (c1211700hdY != null) {
            c1211700hdY.onDestroy();
        }
        IAnoleService iAnoleService = (IAnoleService) ServiceManager.get().getService(IAnoleService.class);
        if (iAnoleService == null || (c1009520cNSLJII = iAnoleService.LJII()) == null) {
            return;
        }
        c1009520cNSLJII.LIZLLL(null, null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        VideoSeekBarMaskView videoSeekBarMaskView = this.LLJJJ;
        if (videoSeekBarMaskView != null) {
            videoSeekBarMaskView.LLJJIJI = C444960Hcc.LIZIZ();
            C19749612Ow c19749612Ow = videoSeekBarMaskView.LLILLJJLI;
            if (c19749612Ow != null) {
                c19749612Ow.LLILLJJLI.LJIILJJIL = C1899620zX6.LIZ();
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSeekAbility
    public final void EA2(boolean z) {
        int i;
        if (!C2529009vc.LIZ) {
            C586640Mze c586640Mze = this.LLJIJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("experiment disabled, skip scaling=");
            sbLIZ.append(z);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            boolean z2 = AbstractC1604130rqV.LIZLLL;
            c586640Mze.LJIIIIZZ(null, "setBackgroundSurveyScalingState", strLIZIZ);
            return;
        }
        C586640Mze c586640Mze2 = this.LLJIJIL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("scaling=");
        sbLIZ2.append(z);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        boolean z3 = AbstractC1604130rqV.LIZLLL;
        c586640Mze2.LJIIIIZZ(null, "setBackgroundSurveyScalingState", strLIZIZ2);
        VideoSeekBarMaskView videoSeekBarMaskView = this.LLJJJ;
        if (videoSeekBarMaskView != null) {
            videoSeekBarMaskView.setDisableSeekTouch(z);
        }
        C12P2 c12p2 = this.LLJJIII;
        if (c12p2 != null) {
            c12p2.setDisableSeekTouch(z);
        }
        C12P2 c12p22 = this.LLJJIII;
        if (c12p22 != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.a0(c12p22, i);
        }
    }

    public final void Go(boolean z) {
        View view = this.LLJJI;
        if (view != null) {
            C426750GoL.LJIIIZ(view, 0, null, null, null, false, 30);
        }
        C12P2 c12p2 = this.LLJJIII;
        if (c12p2 != null) {
            C426750GoL.LJIIIZ(c12p2, 0, null, null, null, false, 30);
        }
        C12P4 c12p4 = this.LLJJIJI;
        if (c12p4 != null) {
            C426750GoL.LJIIIZ(c12p4, 0, null, null, null, false, 30);
        }
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            C426750GoL.LJIIIZ(viewGroup, 0, null, null, null, false, 30);
        }
        Jo(z);
        FrameLayout frameLayout = this.LLJJJIL;
        if (frameLayout != null) {
            C426750GoL.LJIIIZ(frameLayout, 0, null, null, null, false, 30);
        }
    }

    public final void Jo(boolean z) {
        int i;
        View view = this.LLJILJIL;
        if (view != null) {
            if (z && !C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLIIII()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSeekAbility
    public final void fS0(boolean z) {
        Go(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.0sFs] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1009520cNS c1009520cNSLJII;
        MutableLiveData<Integer> mutableLiveDataXQ2;
        final ViewGroup viewGroup;
        final C12P4 c12p4;
        final VideoSeekBarMaskView videoSeekBarMaskView;
        C0X35.LIZ("seek_assem_part_1", false);
        super.onViewCreated(view);
        this.LLJJI = C520680KbS.LIZ(R.id.wxd, view);
        this.LLJILJIL = C520680KbS.LIZ(R.id.ch9, view);
        Jo(true);
        this.LLJILJILJ = C520680KbS.LIZ(R.id.nwe, view);
        this.LLJILLL = C520680KbS.LIZ(R.id.khx, view);
        this.LLJJ = C520680KbS.LIZ(R.id.cb7, view);
        this.LLJJIII = (C12P2) C520680KbS.LIZ(R.id.video_seek_bar, view);
        this.LLJJIJI = (C12P4) C520680KbS.LIZ(R.id.video_seek_duration_mask, view);
        this.LLJJIJIIJIL = (ViewGroup) C520680KbS.LIZ(R.id.video_seek_duration, view);
        this.LLJJJ = (VideoSeekBarMaskView) C520680KbS.LIZ(R.id.nwj, view);
        this.LLJJJIL = (FrameLayout) C520680KbS.LIZ(R.id.a8w, view);
        ((ArrayList) C1592050rX1.LIZ).add(new WeakReference(this));
        C0X35.LJIIJJI("seek_assem_part_1", false);
        C0X35.LIZ("seek_assem_part_2", false);
        final C12P2 c12p2 = this.LLJJIII;
        if (c12p2 != null && (viewGroup = this.LLJJIJIIJIL) != null && (c12p4 = this.LLJJIJI) != null && (videoSeekBarMaskView = this.LLJJJ) != null) {
            final ImageView imageView = (ImageView) C520680KbS.LIZ(R.id.video_seek_thum, view);
            final ScrollSwitchStateManager scrollSwitchStateManager = (ScrollSwitchStateManager) this.LLJI.getValue();
            if (scrollSwitchStateManager != null) {
                this.LLJJIJIL = new C1211700hdY(new C2248671Czp(c12p2, viewGroup, c12p4, imageView, scrollSwitchStateManager, videoSeekBarMaskView) { // from class: X.1Czs
                    public final C1D0E LLLIILIL;

                    @Override // X.C2248671Czp
                    public final String LJIILIIL() {
                        return "HomeSeekBarControl";
                    }

                    @Override // X.C2248671Czp, X.InterfaceC1211710hdZ
                    public final void LIZJ() {
                        C12P2 c12p22 = this.LL;
                        C679360Qko.LIZ(c12p22.getAlpha(), 1.0f, c12p22);
                    }

                    @Override // X.C2248671Czp, X.InterfaceC1211710hdZ
                    public final void LJFF() {
                        C12P2 c12p22 = this.LL;
                        C679360Qko.LIZ(c12p22.getAlpha(), 0.0f, c12p22);
                    }

                    @Override // X.C2248671Czp, X.InterfaceC1211710hdZ
                    public final void onDestroy() {
                        ServiceManager serviceManager;
                        InterceptHomeBackPressService interceptHomeBackPressService;
                        C1D0E c1d0e;
                        if (C287370BOd.LIZ() && (serviceManager = ServiceManager.get()) != null && (interceptHomeBackPressService = (InterceptHomeBackPressService) serviceManager.getService(InterceptHomeBackPressService.class)) != null && (c1d0e = this.LLLIILIL) != null) {
                            interceptHomeBackPressService.LIZ(c1d0e);
                        }
                        super.onDestroy();
                    }

                    @Override // X.C2248671Czp
                    public final boolean LJIIZILJ(Object obj) {
                        Object obj2;
                        Object obj3;
                        Object obj4;
                        Object obj5;
                        Object obj6;
                        Object obj7;
                        Object obj8 = null;
                        if (obj instanceof C1584420rKi) {
                            obj2 = obj;
                        } else {
                            obj2 = null;
                        }
                        if (Intrinsics.LJFF(obj, obj2)) {
                            return C1591860rWi.LJ(((C1584420rKi) obj).LIZIZ);
                        }
                        if (obj instanceof C1D01) {
                            obj3 = obj;
                        } else {
                            obj3 = null;
                        }
                        if (Intrinsics.LJFF(obj, obj3)) {
                            return C1591860rWi.LJ(((C1D01) obj).LIZIZ);
                        }
                        if (obj instanceof C1619850sFr) {
                            obj4 = obj;
                        } else {
                            obj4 = null;
                        }
                        if (Intrinsics.LJFF(obj, obj4)) {
                            return C1591860rWi.LJ(((C1619850sFr) obj).LIZIZ);
                        }
                        if (obj instanceof C722910SXh) {
                            obj5 = obj;
                        } else {
                            obj5 = null;
                        }
                        if (Intrinsics.LJFF(obj, obj5)) {
                            return C1591860rWi.LJ(((C722910SXh) obj).LIZIZ);
                        }
                        if (obj instanceof C16ED) {
                            obj6 = obj;
                        } else {
                            obj6 = null;
                        }
                        if (Intrinsics.LJFF(obj, obj6)) {
                            return C1591860rWi.LJ(((C16ED) obj).LIZIZ);
                        }
                        if (obj instanceof C2248751Czx) {
                            obj7 = obj;
                        } else {
                            obj7 = null;
                        }
                        if (Intrinsics.LJFF(obj, obj7)) {
                            return C1591860rWi.LJ(((C2248751Czx) obj).LIZIZ);
                        }
                        if (obj instanceof C588040N4o) {
                            obj8 = obj;
                        }
                        if (Intrinsics.LJFF(obj, obj8)) {
                            return C1591860rWi.LJ(((C588040N4o) obj).LIZJ);
                        }
                        return false;
                    }

                    @C14EU
                    public final void onDislikeAwemeEvent(C1372310lob c1372310lob) {
                        if (c1372310lob.LIZIZ == 1) {
                            if (!c1372310lob.LIZ) {
                                LIZJ();
                            } else {
                                LJFF();
                            }
                        }
                    }

                    @C14EU
                    public final void onFullFeedFragmentLifeCycleEvent(C1568310quj c1568310quj) {
                        String eventType;
                        this.LLJJIII = c1568310quj.LIZ;
                        if (!Intrinsics.LJFF(this.LLJJ, c1568310quj.LIZIZ) && !Intrinsics.LJFF(this.LLJJJJJIL, c1568310quj.LIZJ)) {
                            this.LLIZLLLIL.LJ("onFullFeedFragmentLifeCycleEvent");
                            C1440005kM.LIZ(new C1594430rar(this.LLJJ, false));
                        }
                        this.LLJJ = c1568310quj.LIZIZ;
                        IBaseListFragmentPanel iBaseListFragmentPanel = c1568310quj.LIZJ;
                        this.LLJJJJJIL = iBaseListFragmentPanel;
                        if (iBaseListFragmentPanel != null && (eventType = iBaseListFragmentPanel.getEventType()) != null) {
                            this.LLJJJJLIIL = eventType;
                        }
                        int i = this.LLJJIII;
                        if (i != 1) {
                            if (i == 2) {
                                if (Intrinsics.LJFF(c1568310quj.LIZLLL, Boolean.TRUE) && (this.LLJJJJJIL instanceof InterfaceC1576730r8J)) {
                                    this.LL.animate().alpha(0.0f).setInterpolator(new C21388518n5()).setDuration(300L).withEndAction(new ARunnableS134S0100000_34(this, 49)).start();
                                    this.LLILLJJLI.animate().alpha(0.0f).setInterpolator(new C21388518n5()).setDuration(300L).withEndAction(new ARunnableS134S0100000_34(this, 50)).start();
                                    return;
                                } else {
                                    C786410Ut5.a0(this.LL, 8);
                                    LJIIJJI().LIZ();
                                    return;
                                }
                            }
                            return;
                        }
                        if (Intrinsics.LJFF(c1568310quj.LIZLLL, Boolean.TRUE) && LJII(this.LLJJ) && (this.LLJJJJJIL instanceof InterfaceC1576730r8J)) {
                            C339190DRl.LIZLLL(this.LL);
                            HandlerHook.viewPostDelay(this.LL, new ARunnableS134S0100000_34(this, 48), 200L);
                        } else if (((Boolean) C265670Ab7.LIZ.getValue()).booleanValue()) {
                            LJJIFFI(false);
                        } else {
                            LJJIFFI(true);
                        }
                    }

                    @Override // X.C2248671Czp, X.C0JO2
                    public final void onStopTrackingTouch(SeekBar seekBar) {
                        super.onStopTrackingTouch(seekBar);
                        C1440005kM.LIZ(new C1594430rar(this.LLJJ, false));
                        this.LLJJJIL = false;
                    }

                    @Override // X.C2248671Czp, X.InterfaceC1211710hdZ
                    public final void LIZ(float f, boolean z) {
                        if (!this.LLJJJIL) {
                            C1440005kM.LIZ(new C1594430rar(this.LLJJ, true));
                            this.LLJJJIL = true;
                        }
                        super.LIZ(f, z);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v2, types: [X.05bd, X.1D0E] */
                    {
                        InterceptHomeBackPressService interceptHomeBackPressService;
                        super(c12p2, viewGroup, c12p4, imageView, scrollSwitchStateManager, videoSeekBarMaskView, null);
                        C1210140hb2.LIZ(c12p2, viewGroup, c12p4, imageView, null, LJIJJ());
                        if (C287370BOd.LIZ()) {
                            ?? r2 = new InterfaceC1385905bd() { // from class: X.1D0E
                                @Override // X.InterfaceC1385905bd
                                public final boolean onBackPress() {
                                    return this.LL.LLJJIJIL;
                                }
                            };
                            this.LLLIILIL = r2;
                            ServiceManager serviceManager = ServiceManager.get();
                            if (serviceManager != null && (interceptHomeBackPressService = (InterceptHomeBackPressService) serviceManager.getService(InterceptHomeBackPressService.class)) != 0) {
                                interceptHomeBackPressService.LIZJ(r2);
                            }
                        }
                    }
                });
            }
            VideoSeekBarMaskView videoSeekBarMaskView2 = this.LLJJJ;
            if (videoSeekBarMaskView2 != null) {
                videoSeekBarMaskView2.setSeekBarView(c12p2);
                videoSeekBarMaskView2.setSeekBarController(this.LLJJIJIL);
            }
        }
        C0X35.LJIIJJI("seek_assem_part_2", false);
        C0X35.LIZ("seek_assem_part_3", false);
        HomePageDataViewModel homePageDataViewModel = (HomePageDataViewModel) this.LLJ.getValue();
        if (homePageDataViewModel != null && (mutableLiveDataXQ2 = homePageDataViewModel.xQ2()) != null) {
            mutableLiveDataXQ2.observe(this, new Observer() { // from class: X.0sFq
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    int width;
                    Integer num = (Integer) obj;
                    if (num != null) {
                        MainPageSeekAssem mainPageSeekAssem = this.LL;
                        int iIntValue = num.intValue();
                        View view2 = mainPageSeekAssem.LLJJI;
                        if (view2 != null) {
                            width = view2.getWidth();
                        } else {
                            width = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(mainPageSeekAssem.LLJJIII);
                        arrayList.add(mainPageSeekAssem.LLJJIJI);
                        arrayList.add(mainPageSeekAssem.LLJJIJIIJIL);
                        arrayList.add(mainPageSeekAssem.LLJJJIL);
                        View view3 = mainPageSeekAssem.LLJILJILJ;
                        if (Boolean.valueOf(C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLIIII()).booleanValue()) {
                            view3 = null;
                        }
                        arrayList.add(view3);
                        arrayList.add(mainPageSeekAssem.LLJILLL);
                        arrayList.add(mainPageSeekAssem.LLJJ);
                        View view4 = mainPageSeekAssem.LLJILJIL;
                        if (view4 != null) {
                            C426750GoL.LJIIIZ(view4, null, null, Integer.valueOf(iIntValue), null, false, 27);
                        }
                        if (width == 0) {
                            View view5 = mainPageSeekAssem.LLJJI;
                            if (view5 != null) {
                                HandlerHook.viewPost(view5, new ARunnableS9S0202000_24(mainPageSeekAssem, arrayList, width, iIntValue, 0));
                                return;
                            }
                            return;
                        }
                        MainPageSeekAssem.Ho(width, iIntValue, arrayList);
                    }
                }
            });
        }
        C0X35.LJIIJJI("seek_assem_part_3", false);
        IAnoleService iAnoleService = (IAnoleService) ServiceManager.get().getService(IAnoleService.class);
        if (iAnoleService != null && (c1009520cNSLJII = iAnoleService.LJII()) != 0) {
            c1009520cNSLJII.LIZLLL(this.LLJJJIL, new InterfaceC1009720cNm() { // from class: X.0sFs
                @Override // X.InterfaceC1009720cNm
                public final void LIZ(boolean z) {
                    this.LIZ.uo1(z);
                }
            });
        }
    }

    @Override // X.InterfaceC1592060rX2
    public final void r(boolean z) {
        Go(z);
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSeekAbility
    public final void uo1(boolean z) {
        String str;
        C586640Mze c586640Mze = this.LLJIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (z) {
            str = "hide";
        } else {
            str = "show";
        }
        sbLIZ.append(str);
        sbLIZ.append(" seekbar by MainPageAssem");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z2 = AbstractC1604130rqV.LIZLLL;
        c586640Mze.LJIIIIZZ(null, "hideSeekBar", strLIZIZ);
        if (z) {
            C1211700hdY c1211700hdY = this.LLJJIJIL;
            if (c1211700hdY != null) {
                c1211700hdY.LJFF();
                return;
            }
            return;
        }
        C1211700hdY c1211700hdY2 = this.LLJJIJIL;
        if (c1211700hdY2 == null) {
            return;
        }
        c1211700hdY2.LIZJ();
    }

    public static void Ho(int i, int i2, List list) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                View view = (View) it2.next();
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        if (i2 == 0) {
                            layoutParams.width = -1;
                        } else {
                            layoutParams.width = i - i2;
                        }
                    }
                    view.requestLayout();
                }
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC1570850qyp
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        View view = this.LLJJI;
        if (view != null) {
            HandlerHook.viewPost(view, new Runnable() { // from class: X.0sFp
                public final void LIZ() {
                    View view2 = this.LL.LLJJI;
                    if (view2 == null || view2.getWidth() <= 0) {
                        return;
                    }
                    if (1 != 0) {
                        MainPageSeekAssem mainPageSeekAssem = this.LL;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(mainPageSeekAssem.LLJJIII);
                        arrayList.add(mainPageSeekAssem.LLJJIJI);
                        arrayList.add(mainPageSeekAssem.LLJJIJIIJIL);
                        arrayList.add(mainPageSeekAssem.LLJJJIL);
                        View view3 = mainPageSeekAssem.LLJILJILJ;
                        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                        arrayList.add(Boolean.valueOf(c19252910Tv.LIZLLL().LJIJI().LLLIIII()).booleanValue() ? null : view3);
                        arrayList.add(mainPageSeekAssem.LLJILLL);
                        C19EG c19egLIZ = C724240Sb0.LIZ(mainPageSeekAssem);
                        if (c19egLIZ != null) {
                            c19252910Tv.LIZLLL().LJIIIIZZ();
                            int iLIZIZ = C0T45.LIZIZ(c19egLIZ);
                            View view4 = mainPageSeekAssem.LLJILJIL;
                            if (view4 != null) {
                                C426750GoL.LJIIIZ(view4, null, null, Integer.valueOf(iLIZIZ), null, false, 27);
                            }
                            MainPageSeekAssem.Ho(view2.getWidth(), iLIZIZ, arrayList);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MainPageSeekAssem@7efc.onTabChanged$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MainPageSeekAssem@7efc.onTabChanged$1");
                }
            });
        }
    }
}
