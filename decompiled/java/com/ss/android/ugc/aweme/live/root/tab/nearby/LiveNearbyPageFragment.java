package com.ss.android.ugc.aweme.live.root.tab.nearby;

import X.C01GW;
import X.C098200Yq;
import X.C0IEG;
import X.C0IL2;
import X.C1161920gLG;
import X.C11JF;
import X.C12ES;
import X.C1324720kZq;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20441214yg;
import X.C23250099c;
import X.C452501pT;
import X.C464330IIt;
import X.C472280Ifa;
import X.C473350IhJ;
import X.C474920Ijq;
import X.C475110Ik9;
import X.C475170IkF;
import X.C475260IkO;
import X.C475460Iki;
import X.C476830Imv;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC471720Ieg;
import X.EnumC471790Ien;
import X.InterfaceC420801kM;
import X.InterfaceC463590IFx;
import X.InterfaceC466370IQp;
import X.InterfaceC475140IkC;
import X.InterfaceC475150IkD;
import X.InterfaceC475300IkS;
import X.InterfaceC477100InM;
import X.InterfaceC479780Irg;
import Y.AObserverS211S0100000_7;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.android.livesdk.livesetting.feed.LiveNearbyTabSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment;
import com.ss.android.ugc.aweme.live.root.tab.room.skylight.SkylightController;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS79S0100100_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveNearbyPageFragment extends AbsTabFragment implements InterfaceC477100InM, InterfaceC463590IFx {
    public static final long LLLFF = LiveNearbyTabSetting.INSTANCE.getValue().cacheInterval;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9OiojPWHELIOSEnKSdiJyoyOic1ZwM6PiACLC4hKjwcKCg2DjctLiI2JjE=";
    public View LLILLJJLI;
    public boolean LLILLL;
    public InterfaceC475300IkS LLILZ;
    public Pair<? extends Fragment, ? extends C0IEG> LLILZIL;
    public InterfaceC479780Irg<?> LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public C472280Ifa LLJILJIL;
    public SkylightController LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public long LLJJIII;
    public InterfaceC420801kM LLJJIJI;
    public C475460Iki LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public C1324720kZq LLJJJIL;
    public boolean LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public Long LLJL;
    public EnterRoomConfig LLJLIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(154));
    public final AObserverS211S0100000_7 LLJIJIL = new AObserverS211S0100000_7(this, 27);
    public final int LLJILJILJ = View.generateViewId();
    public List<EnterRoomConfig> LLJJLIIIJLLLLLLLZ = new ArrayList();
    public String LLJLILLLLZIIL = CardStruct.IStatusCode.DEFAULT;
    public String LLJLL = CardStruct.IStatusCode.DEFAULT;
    public String LLJLLIL = CardStruct.IStatusCode.DEFAULT;
    public String LLJLLL = CardStruct.IStatusCode.DEFAULT;
    public String LLJZ = CardStruct.IStatusCode.DEFAULT;
    public long LLJZIJLIL = -1;
    public long LLL = -1;
    public long LLLF = -1;

    @Override // X.InterfaceC479810Irj
    public final Fragment LLLIILIL() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment, X.InterfaceC479810Irj
    public final void LLLILZLLLI() {
        C0IEG second;
        InterfaceC466370IQp currentFragment;
        C0IEG second2;
        InterfaceC466370IQp currentFragment2;
        this.LLJJL = false;
        if (LiveNearbyTabSetting.INSTANCE.getValue().enableSlidingOpt) {
            Pair<? extends Fragment, ? extends C0IEG> pair = this.LLILZIL;
            if (pair != null && (second2 = pair.getSecond()) != null && (currentFragment2 = second2.getCurrentFragment()) != null) {
                currentFragment2.gc();
            }
            Pair<? extends Fragment, ? extends C0IEG> pair2 = this.LLILZIL;
            if (pair2 == null || (second = pair2.getSecond()) == null || (currentFragment = second.getCurrentFragment()) == null) {
                return;
            }
            currentFragment.pause();
        }
    }

    @Override // X.InterfaceC477100InM
    public final Object em() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment, X.InterfaceC479810Irj
    public final void onPageSelected() {
        this.LLJJL = true;
    }

    public final void LJIIL() {
        C20441214yg.LJIIIZ("LiveNearbyPageFragment", "hideLoading");
        C475460Iki c475460Iki = this.LLJJIJIIJIL;
        if (c475460Iki != null) {
            c475460Iki.LIZJ();
        }
        C475460Iki c475460Iki2 = this.LLJJIJIIJIL;
        if (c475460Iki2 != null) {
            c475460Iki2.LIZIZ();
        }
        this.LLJJJJLIIL = false;
    }

    @Override // X.InterfaceC463590IFx
    public final void LJLL() {
        C0IEG second;
        C1324720kZq c1324720kZq;
        if (this.LLJJJJ) {
            this.LLJJJJ = false;
            FrameLayout frameLayout = this.LLJJJJJIL;
            if (frameLayout != null && (c1324720kZq = this.LLJJJIL) != null) {
                C786410Ut5.LJJJZ(c1324720kZq, frameLayout);
            }
            Pair<? extends Fragment, ? extends C0IEG> pair = this.LLILZIL;
            if (pair == null || (second = pair.getSecond()) == null) {
                return;
            }
            second.aF(null);
        }
    }

    public final void MR() {
        InterfaceC475140IkC interfaceC475140IkCOR;
        InterfaceC475140IkC interfaceC475140IkCOR2;
        InterfaceC475140IkC interfaceC475140IkCOR3;
        BaseListResponse<FeedItem, FeedExtra> baseListResponseLJIIIIZZ;
        List<FeedItem> list;
        if (!this.LLJJI && (interfaceC475140IkCOR = OR()) != null && interfaceC475140IkCOR.LJIIIZ() && !SR() && ((interfaceC475140IkCOR2 = OR()) == null || !interfaceC475140IkCOR2.LJIIIZ() || ((interfaceC475140IkCOR3 = OR()) != null && (baseListResponseLJIIIIZZ = interfaceC475140IkCOR3.LJIIIIZZ()) != null && (list = baseListResponseLJIIIIZZ.data) != null && !list.isEmpty()))) {
            this.LLJZ = "1";
            NR();
            return;
        }
        LJ();
        LJLL();
        if (!this.LLJJI) {
            InterfaceC475140IkC interfaceC475140IkCOR4 = OR();
            if (interfaceC475140IkCOR4 != null) {
                interfaceC475140IkCOR4.LJII();
            }
            this.LLJLLL = CardStruct.IStatusCode.DEFAULT;
            UR();
        }
        InterfaceC475140IkC interfaceC475140IkCOR5 = OR();
        if (interfaceC475140IkCOR5 != null) {
            interfaceC475140IkCOR5.LJFF(this.LLJIJIL);
        }
    }

    public final InterfaceC475140IkC OR() {
        return (InterfaceC475140IkC) this.LLILZLL.getValue();
    }

    public final void PR() {
        ViewGroup viewGroup;
        C20441214yg.LJIIIZ("LiveNearbyPageFragment", "hideGpsBackground");
        View view = this.LLJJJ;
        if (view != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this.LLJJJ, viewGroup);
            }
            this.LLJJJ = null;
        }
    }

    public final void RR() {
        C476830Imv c476830Imv;
        EnterRoomConfig enterRoomConfigLIZIZ;
        if (this.LLJJ) {
            return;
        }
        this.LLJJ = true;
        SkylightController skylightController = this.LLJILLL;
        if (skylightController != null) {
            InterfaceC475300IkS interfaceC475300IkS = this.LLILZ;
            if (interfaceC475300IkS == null || (enterRoomConfigLIZIZ = interfaceC475300IkS.LIZIZ()) == null) {
                enterRoomConfigLIZIZ = C0IL2.LIZ.LIZ().mEnterRoomConfig;
            }
            skylightController.LLIZ = this.LLJILJIL;
            skylightController.LIZIZ(enterRoomConfigLIZIZ);
        }
        SkylightController skylightController2 = this.LLJILLL;
        if (skylightController2 == null || (c476830Imv = skylightController2.LL) == null) {
            return;
        }
        c476830Imv.LJJJJJ = true;
        c476830Imv.LJJJJ.removeCallbacksAndMessages(null);
    }

    public final boolean SR() {
        BaseListResponse<FeedItem, FeedExtra> baseListResponseLJIIIIZZ;
        List<FeedItem> list;
        if (this.LLJJIII == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC475140IkC interfaceC475140IkCOR = OR();
            if (jCurrentTimeMillis - (interfaceC475140IkCOR != null ? interfaceC475140IkCOR.LIZ() : 0L) > LLLFF) {
                return true;
            }
        } else if (System.currentTimeMillis() - this.LLJJIII > LLLFF) {
            return true;
        }
        InterfaceC475140IkC interfaceC475140IkCOR2 = OR();
        if (interfaceC475140IkCOR2 == null || (baseListResponseLJIIIIZZ = interfaceC475140IkCOR2.LJIIIIZZ()) == null || (list = baseListResponseLJIIIIZZ.data) == null || list.isEmpty()) {
            return true;
        }
        ILiveFeedApiService iLiveFeedApiService = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class);
        if (iLiveFeedApiService != null) {
            iLiveFeedApiService.zX1();
            CommonSkylightDataManager commonSkylightDataManager = CommonSkylightDataManager.LIZ;
            if (C473350IhJ.LIZLLL) {
                return true;
            }
        }
        return false;
    }

    public final void UR() {
        if (this.LLJJI) {
            return;
        }
        this.LLJJI = true;
        this.LLJJLIIIJLLLLLLLZ = new ArrayList();
        C11JF c11jfLIZIZ = null;
        this.LLJL = null;
        this.LLJLIL = null;
        this.LLJLL = CardStruct.IStatusCode.DEFAULT;
        long jUptimeMillis = SystemClock.uptimeMillis();
        InterfaceC475140IkC interfaceC475140IkCOR = OR();
        if (interfaceC475140IkCOR != null) {
            InterfaceC475140IkC.LIZ.getClass();
            c11jfLIZIZ = interfaceC475140IkCOR.LIZIZ(3, EnumC471720Ieg.NEARBY_PAGE, new AwS79S0100100_7(this, jUptimeMillis, 0));
        }
        this.LLJJIJI = c11jfLIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    @Override // com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment, X.InterfaceC479810Irj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> Z() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.root.tab.nearby.LiveNearbyPageFragment.Z():java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00f6  */
    @Override // com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment, X.InterfaceC479810Irj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void al() {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.root.tab.nearby.LiveNearbyPageFragment.al():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Fragment first;
        C0IEG second;
        DataChannelGlobal.LLILZ.zQ2(this);
        InterfaceC420801kM interfaceC420801kM = this.LLJJIJI;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C472280Ifa c472280Ifa = this.LLJILJIL;
        if (c472280Ifa != null) {
            c472280Ifa.setTouchEventInterceptor(null);
        }
        InterfaceC475300IkS interfaceC475300IkS = this.LLILZ;
        if (interfaceC475300IkS != null) {
            interfaceC475300IkS.LJIIJ(null);
        }
        C475460Iki c475460Iki = this.LLJJIJIIJIL;
        if (c475460Iki != null) {
            c475460Iki.LIZJ();
        }
        C475460Iki c475460Iki2 = this.LLJJIJIIJIL;
        if (c475460Iki2 != null) {
            c475460Iki2.LIZLLL = null;
        }
        Pair<? extends Fragment, ? extends C0IEG> pair = this.LLILZIL;
        if (pair != null && (second = pair.getSecond()) != null) {
            second.aF(null);
        }
        this.LLJJIJIIJIL = null;
        this.LLJILLL = null;
        InterfaceC475150IkD interfaceC475150IkD = this.LL;
        C19EH c19ehPu = interfaceC475150IkD != null ? interfaceC475150IkD.Pu() : null;
        Pair<? extends Fragment, ? extends C0IEG> pair2 = this.LLILZIL;
        if (pair2 != null && (first = pair2.getFirst()) != null) {
            if (c19ehPu != null) {
                c19ehPu.LJIIZILJ(first);
                c19ehPu.LJIIJ();
            }
            this.LLILZIL = null;
        }
        super.onDestroy();
    }

    public final void LJ() {
        C19EG activity = getActivity();
        if ((activity == null || C474920Ijq.LIZ(activity)) && !this.LLJJJJLIIL && this.LLILZIL == null) {
            this.LLJJJJLIIL = true;
            if (this.LLJJIJIIJIL == null) {
                InterfaceC479780Irg<?> interfaceC479780Irg = this.LLIZ;
                this.LLJJIJIIJIL = new C475460Iki(interfaceC479780Irg != null ? interfaceC479780Irg.U6() : null, true, this.LLILLJJLI, new AwS551S0100000_7(this, 321));
            }
            C475460Iki c475460Iki = this.LLJJIJIIJIL;
            if (c475460Iki != null) {
                c475460Iki.LJII = false;
                c475460Iki.LJI = true;
                c475460Iki.LIZ(0);
                C12ES.LJIILL(c475460Iki.LJI ? 0 : 8, c475460Iki.LJIIIZ);
            }
            C20441214yg.LJIIIZ("LiveNearbyPageFragment", "showLoading");
            C475460Iki c475460Iki2 = this.LLJJIJIIJIL;
            if (c475460Iki2 != null && c475460Iki2.LJIIIIZZ && c475460Iki2.LIZ != null) {
                C12ES.LJIILL(0, c475460Iki2.LJ);
            }
            C475460Iki c475460Iki3 = this.LLJJIJIIJIL;
            if (c475460Iki3 != null) {
                c475460Iki3.LIZLLL(true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (r10 == (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r8 = X.C13LP.LLIIII(((java.util.ArrayList) r13.LLJJLIIIJLLLLLLLZ).subList(0, r10));
        r7 = (java.util.ArrayList) r13.LLJJLIIIJLLLLLLLZ;
        r2.mLogData.moreConfig = new java.util.ArrayList<>(X.C13LP.LLIIII(r7.subList(r10 + 1, r7.size())));
        r2.mLogData.frontRoomConfig = new java.util.ArrayList<>(r8);
        r7 = r2.mRoomsData.timeStamps;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        if (r7 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        r7.enterRoomStarTimeReal = 0;
        r7.enterRoomStarTime = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NR() {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.root.tab.nearby.LiveNearbyPageFragment.NR():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewGroup viewGroup;
        super.onDestroyView();
        View view = this.LLILLJJLI;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC477100InM
    public final boolean K4() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC477100InM
    public final C475460Iki c1() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC477100InM
    public final EnumC471790Ien getPage() {
        return EnumC471790Ien.NEARBY;
    }

    @Override // X.InterfaceC463590IFx
    public final boolean zc() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC479810Irj
    public final void IR(int i) {
        C0IEG second;
        InterfaceC466370IQp currentFragment;
        C0IEG second2;
        InterfaceC466370IQp currentFragment2;
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        if (LiveNearbyTabSetting.INSTANCE.getValue().enableSlidingOpt) {
            Pair<? extends Fragment, ? extends C0IEG> pair = this.LLILZIL;
            if (pair != null && (second2 = pair.getSecond()) != null && (currentFragment2 = second2.getCurrentFragment()) != null) {
                currentFragment2.vH();
            }
            Pair<? extends Fragment, ? extends C0IEG> pair2 = this.LLILZIL;
            if (pair2 != null && (second = pair2.getSecond()) != null && (currentFragment = second.getCurrentFragment()) != null) {
                currentFragment.resume();
            }
        }
        InterfaceC475300IkS interfaceC475300IkS = this.LLILZ;
        if (interfaceC475300IkS != null) {
            interfaceC475300IkS.LJIIJJI();
        }
        C20441214yg.LJIIIZ("LiveNearbyPageFragment", "onChosen");
        InterfaceC475300IkS interfaceC475300IkS2 = this.LLILZ;
        if (interfaceC475300IkS2 != null) {
            interfaceC475300IkS2.LJIIJ(this.LLJILJIL);
        }
        InterfaceC475300IkS interfaceC475300IkS3 = this.LLILZ;
        if (interfaceC475300IkS3 != null) {
            interfaceC475300IkS3.LJII(this.LLJILJILJ);
        }
        if (!this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
            SkylightController skylightController = this.LLJILLL;
            if (skylightController != null) {
                C476830Imv c476830Imv = skylightController.LL;
                if (c476830Imv != null) {
                    C500260Jjc.LLFFF(c476830Imv.LJIILLIIL);
                }
                skylightController.LLJILJIL = true;
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C475110Ik9(this, null), 3);
    }

    public final boolean VR(boolean z) {
        InterfaceC479780Irg<?> interfaceC479780Irg;
        C19GS c19gsU6;
        String str;
        if ((!z && LiveNearbyTabSetting.INSTANCE.getValue().cacheInterval == 0) || (interfaceC479780Irg = this.LLIZ) == null || (c19gsU6 = interfaceC479780Irg.U6()) == null || !C474920Ijq.LIZ(c19gsU6) || !SR()) {
            return false;
        }
        if (z) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        this.LLJLLL = str;
        UR();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment, X.InterfaceC479810Irj
    public final void eP(C475260IkO c475260IkO) {
        int i = C475170IkF.LIZ[c475260IkO.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LLJI = true;
                    if (this.LLJ) {
                        VR(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.LLJI = false;
            return;
        }
        this.LLJ = true;
        if (!this.LLJI) {
            return;
        }
        VR(false);
    }

    @Override // X.InterfaceC477100InM
    public final void fj(Rect rect) {
        View view;
        View viewFindViewById;
        if (this.LLJJIJIL != null && (view = this.LLILLJJLI) != null && (viewFindViewById = view.findViewById(R.id.p4c)) != null) {
            viewFindViewById.getGlobalVisibleRect(rect);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        C472280Ifa c472280Ifa;
        super.onActivityCreated(bundle);
        C20441214yg.LJIIIZ("LiveNearbyPageFragment", "onActivityCreated");
        View view = this.LLILLJJLI;
        if (view instanceof C472280Ifa) {
            c472280Ifa = (C472280Ifa) view;
        } else {
            c472280Ifa = null;
        }
        this.LLJILJIL = c472280Ifa;
        if (c472280Ifa != null) {
            c472280Ifa.setPageContainer(1);
        }
        InterfaceC475300IkS interfaceC475300IkS = this.LLILZ;
        if (interfaceC475300IkS != null) {
            interfaceC475300IkS.LJIIJ(this.LLJILJIL);
        }
        C19EG activity = getActivity();
        if (activity != null && C474920Ijq.LIZ(activity)) {
            this.LLJLILLLLZIIL = CardStruct.IStatusCode.DEFAULT;
            RR();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment, X.InterfaceC479810Irj
    public final void onPageScrollStateChanged(int i) {
        ViewGroup viewGroup;
        C0IEG second;
        InterfaceC466370IQp currentFragment;
        if (LiveNearbyTabSetting.INSTANCE.getValue().enableSlidingOpt && i == 1) {
            Pair<? extends Fragment, ? extends C0IEG> pair = this.LLILZIL;
            if (pair != null && (second = pair.getSecond()) != null && (currentFragment = second.getCurrentFragment()) != null) {
                currentFragment.fN();
                return;
            }
            return;
        }
        if (i != 0 || this.LLJJL) {
            return;
        }
        this.LLIZLLLIL = false;
        View view = this.LLJJIJIL;
        if (view != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
        }
        this.LLJJIJIL = null;
        LJLL();
        LJIIL();
        this.LLJLILLLLZIIL = CardStruct.IStatusCode.DEFAULT;
        this.LLJZ = CardStruct.IStatusCode.DEFAULT;
    }

    @Override // X.InterfaceC479810Irj
    public final void py(int i) {
        C19EH c19ehPu;
        Long lValueOf;
        Object next;
        ViewGroup viewGroup;
        Fragment first;
        C0IEG second;
        InterfaceC466370IQp currentFragment;
        C0IEG second2;
        InterfaceC466370IQp currentFragment2;
        C0IEG second3;
        List<Room> listLb;
        String str;
        C20441214yg.LJIIIZ("LiveNearbyPageFragment", "onUnChosen");
        if (!this.LLILLL) {
            return;
        }
        this.LLILLL = false;
        this.LLIZLLLIL = false;
        InterfaceC475150IkD interfaceC475150IkD = this.LL;
        if (interfaceC475150IkD != null) {
            c19ehPu = interfaceC475150IkD.Pu();
        } else {
            c19ehPu = null;
        }
        ArrayList arrayList = new ArrayList();
        Pair<? extends Fragment, ? extends C0IEG> pair = this.LLILZIL;
        if (pair != null && (second3 = pair.getSecond()) != null && (listLb = second3.Lb()) != null) {
            for (Room room : listLb) {
                EnterRoomConfig enterRoomConfigLIZJ = C464330IIt.LIZJ(true, room);
                ArrayList<String> arrayList2 = enterRoomConfigLIZJ.mRoomsData.gaussianBgUrls;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    enterRoomConfigLIZJ.mRoomsData.gaussianBgUrls = room.gaussianBgUrls;
                }
                ArrayList<String> arrayList3 = enterRoomConfigLIZJ.mRoomsData.bgUrls;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    enterRoomConfigLIZJ.mRoomsData.bgUrls = room.bgUrls;
                }
                EnterRoomConfig.StreamData streamData = enterRoomConfigLIZJ.mStreamData;
                if (streamData.pullStreamData == null && (str = room.pullStreamData) != null) {
                    streamData.pullStreamData = str;
                }
                arrayList.add(enterRoomConfigLIZJ);
            }
        }
        this.LLJJLIIIJLLLLLLLZ = arrayList;
        Pair<? extends Fragment, ? extends C0IEG> pair2 = this.LLILZIL;
        if (pair2 != null && (second2 = pair2.getSecond()) != null && (currentFragment2 = second2.getCurrentFragment()) != null) {
            lValueOf = Long.valueOf(currentFragment2.getRoomId());
        } else {
            lValueOf = null;
        }
        this.LLJL = lValueOf;
        Iterator it2 = ((ArrayList) this.LLJJLIIIJLLLLLLLZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                long j = ((EnterRoomConfig) next).mRoomsData.roomId;
                Long l = this.LLJL;
                if (l != null && j == l.longValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        this.LLJLIL = (EnterRoomConfig) next;
        Pair<? extends Fragment, ? extends C0IEG> pair3 = this.LLILZIL;
        if (pair3 != null && (second = pair3.getSecond()) != null && (currentFragment = second.getCurrentFragment()) != null) {
            currentFragment.pL(false);
        }
        Pair<? extends Fragment, ? extends C0IEG> pair4 = this.LLILZIL;
        if (pair4 != null && (first = pair4.getFirst()) != null) {
            if (c19ehPu != null) {
                c19ehPu.LJIIZILJ(first);
                c19ehPu.LJIIL();
            }
            this.LLILZIL = null;
        }
        View view = this.LLJJIJIL;
        if (view != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
        }
        this.LLJJIJIL = null;
        LJLL();
        LJIIL();
        InterfaceC475140IkC interfaceC475140IkCOR = OR();
        if (interfaceC475140IkCOR != null) {
            interfaceC475140IkCOR.LJ(this.LLJIJIL);
        }
        this.LLJJIII = System.currentTimeMillis();
        this.LLJLILLLLZIIL = CardStruct.IStatusCode.DEFAULT;
        this.LLJZ = CardStruct.IStatusCode.DEFAULT;
        this.LLLF = -1L;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        View viewFindViewById;
        this.LLILLJJLI = viewGroup;
        C786410Ut5.Td(layoutInflater, R.layout.db1, viewGroup, true);
        SkylightController skylightController = this.LLJILLL;
        if (skylightController != null) {
            skylightController.LLJILJILJ = this.LLILLJJLI;
        }
        View view = this.LLILLJJLI;
        if (view != null && (viewFindViewById = view.findViewById(R.id.n3v)) != null) {
            viewFindViewById.setId(this.LLJILJILJ);
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            frameLayout = (FrameLayout) view2.findViewById(R.id.iiv);
        } else {
            frameLayout = null;
        }
        this.LLJJJJJIL = frameLayout;
        try {
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
