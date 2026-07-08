package com.ss.android.ugc.aweme.feed.landscape;

import X.AbstractC1386130mAt;
import X.AbstractC739960T0w;
import X.AbstractC848400XPy;
import X.C07HM;
import X.C0C64;
import X.C0HHT;
import X.C0HTT;
import X.C0IS1;
import X.C0JBR;
import X.C0N0Y;
import X.C0O3Q;
import X.C0OAJ;
import X.C0OVM;
import X.C0PEM;
import X.C0PSR;
import X.C0QSJ;
import X.C0R9L;
import X.C0RQB;
import X.C0SHX;
import X.C0SR4;
import X.C0SXF;
import X.C0SXJ;
import X.C0SY1;
import X.C0SYF;
import X.C0SYH;
import X.C0SZ8;
import X.C0T0K;
import X.C0XPD;
import X.C0XQ7;
import X.C0XQS;
import X.C0XQT;
import X.C1076010e6h;
import X.C1233040iBy;
import X.C1252380ihA;
import X.C1260910iuv;
import X.C1360540lVc;
import X.C1365450ldX;
import X.C1370890lmJ;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C1440005kM;
import X.C1478160oZK;
import X.C1483390ohl;
import X.C1484690ojr;
import X.C14EU;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1558520qew;
import X.C1594680rbG;
import X.C1618110sD3;
import X.C1620050sGB;
import X.C1637806bA;
import X.C16F4;
import X.C19651011uW;
import X.C19719912Dl;
import X.C1ER1;
import X.C20096413kA;
import X.C20684815ws;
import X.C21610619ho;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2296808zG;
import X.C23250099c;
import X.C2344809Gs;
import X.C328640CuU;
import X.C328650CuV;
import X.C5182020e;
import X.C583170Mu3;
import X.C584760Mwc;
import X.C627150Oin;
import X.C666580QCq;
import X.C673150Qan;
import X.C687700QyG;
import X.C692480REg;
import X.C708600Rqs;
import X.C711330RvH;
import X.C723180SYi;
import X.C724750Sbp;
import X.C729980SkG;
import X.C733660SqC;
import X.C734630Srl;
import X.C735280Sso;
import X.C735330Sst;
import X.C735340Ssu;
import X.C735350Ssv;
import X.C735370Ssx;
import X.C735610StL;
import X.C735820Stg;
import X.C735840Sti;
import X.C737030Svd;
import X.C737910Sx3;
import X.C738890Syd;
import X.C740470T2v;
import X.C786410Ut5;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.InterfaceC1146704e9;
import X.InterfaceC468940IaC;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC689860R4e;
import X.InterfaceC707080RoQ;
import X.InterfaceC713360RyY;
import X.InterfaceC723190SYj;
import X.InterfaceC849390XTt;
import Y.ACListenerS146S0100000_11;
import android.app.Activity;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.abilities.LandscapePanelStateNotificationAbility;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.adapter.PanelScope;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.LandscapeCellAssem;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedLoadingAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedVideoEventDispatcherAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class LandscapeFragmentPanel extends AbstractC739960T0w implements C0R9L, IBaseListFragmentPanel, C0HTT<C737030Svd>, InterfaceC713360RyY, InterfaceC723190SYj, DisplayManager.DisplayListener, C0QSJ, InterfaceC1146704e9 {
    public C16F4 LL;
    public ImageView LLILLJJLI;
    public C0SY1 LLILLL;
    public boolean LLILZ;
    public Aweme LLILZIL;
    public boolean LLIZLLLIL;
    public DisplayManager LLJ;
    public C2189821An6 LLJI;
    public C1620050sGB LLJILJIL;
    public InterfaceC665370Q7z LLJILLL;
    public C738890Syd LLJJ;
    public boolean LLILZLL = true;
    public final C20096413kA LLIZ = new C20096413kA();
    public boolean LLJIJIL = true;
    public final int LLJILJILJ = (C0RQB.AUTO_PLAY_NEXT.getValue() | C0RQB.SHOW_INTRO.getValue()) | C0RQB.DANMAKU_FOCUSABLE.getValue();
    public final ViewModelStore LLJJI = new ViewModelStore();

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final /* synthetic */ IFeedPanelPlatformAbility Ak2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final /* synthetic */ String Ci0() {
        return "";
    }

    @Override // X.InterfaceC581430MrF
    public final void Ee(Aweme aweme) {
    }

    @Override // X.InterfaceC581430MrF
    public final void Fe() {
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final /* synthetic */ boolean GY() {
        return false;
    }

    @Override // X.InterfaceC581430MrF
    public final /* synthetic */ void He(int i, String str) {
    }

    @Override // X.InterfaceC581430MrF
    public final void Ie() {
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final /* synthetic */ void Jl1(int i, Aweme aweme) {
    }

    @Override // X.InterfaceC581390MrB
    public final void LIZLLL(long j) {
    }

    @Override // X.InterfaceC581390MrB
    public final Aweme LJI(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC581390MrB
    public final boolean LJIIJ() {
        return false;
    }

    @Override // X.InterfaceC581390MrB
    public final void LJIIJJI(String str) {
    }

    @Override // X.InterfaceC581390MrB
    public final boolean LJJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void LJJIJIIJI(String str) {
    }

    @Override // X.InterfaceC581390MrB
    public final boolean LJJIJIIJIL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final /* synthetic */ void LJLLI(String str) {
    }

    @Override // X.InterfaceC581430MrF
    public final /* synthetic */ void Ne() {
    }

    @Override // X.InterfaceC581430MrF
    public final /* synthetic */ void Oe() {
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final /* synthetic */ JSONObject RC2() {
        return null;
    }

    @Override // X.InterfaceC581430MrF
    public final /* synthetic */ boolean Re() {
        return false;
    }

    @Override // X.InterfaceC581390MrB
    public final Aweme Rh(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC581430MrF
    public final void Te() {
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void UJ2() {
    }

    @Override // X.InterfaceC581430MrF
    public final /* synthetic */ void Ue() {
    }

    @Override // X.InterfaceC581430MrF
    public final /* synthetic */ void Ve(long j, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final void Vm1() {
    }

    @Override // X.InterfaceC581430MrF
    public final void We() {
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final /* synthetic */ void XK0() {
    }

    @Override // X.InterfaceC581430MrF
    public final void Xe(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final /* synthetic */ String Xe1() {
        return "";
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PanelScope.class});
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final boolean ge0(boolean z) {
        return false;
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PanelScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final C0N0Y getPlayerManager() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PanelScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String getTabName() {
        return "";
    }

    @Override // X.InterfaceC581430MrF
    public final void hideIvPlay() {
        LJJJJZI(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final boolean iB() {
        return false;
    }

    @Override // X.InterfaceC581390MrB
    public final boolean ic() {
        return false;
    }

    @Override // X.AbstractC739960T0w
    public final void initPanel() {
    }

    @Override // X.AbstractC739960T0w
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final /* synthetic */ void kd2() {
    }

    @Override // X.C0R9L
    public final void nk(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final /* synthetic */ void nk2(int i) {
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final /* synthetic */ void o6(boolean z) {
    }

    @Override // X.C0R9L
    public final C583170Mu3 ok() {
        return null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void onPlaying(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final /* synthetic */ void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final /* synthetic */ void pK2() {
    }

    @Override // X.InterfaceC581430MrF
    public final boolean postDelayed(Runnable runnable, long j) {
        return false;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final String ro0(Aweme aweme) {
        return "";
    }

    @Override // X.InterfaceC723190SYj
    public final void uc1(FollowStatus followStatus) {
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final InterfaceC707080RoQ un() {
        return null;
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final void xR1() {
    }

    @Override // X.C0R9L
    public final void z() {
    }

    @Override // X.InterfaceC581430MrF
    public final void De() {
        Fragment fragment;
        LandscapeFeedLoadingAbility landscapeFeedLoadingAbility;
        if (!C0SXJ.LIZ || (fragment = getFragment()) == null || (landscapeFeedLoadingAbility = (LandscapeFeedLoadingAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), LandscapeFeedLoadingAbility.class, null)) == null) {
            return;
        }
        landscapeFeedLoadingAbility.De();
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String Gk0() {
        C2189821An6 c2189821An6 = this.LLJI;
        if (c2189821An6 == null) {
            c2189821An6 = null;
        }
        String enterFromRequestId = c2189821An6.getEnterFromRequestId();
        return enterFromRequestId == null ? "" : enterFromRequestId;
    }

    public final ImageView LJJJJJ() {
        if (this.LLILZ) {
            C0SZ8 c0sz8LJLIL = LJLIL();
            ImageView imageViewF2 = c0sz8LJLIL != null ? c0sz8LJLIL.F2() : null;
            this.LLILLJJLI = imageViewF2;
            if (imageViewF2 != null) {
                C786410Ut5.Q7(imageViewF2, new ACListenerS146S0100000_11(this, 15));
            }
        }
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        if (this.LLJJ == null) {
            this.LLJJ = new C738890Syd(this, 4);
        }
        C738890Syd c738890Syd = this.LLJJ;
        return c738890Syd == null ? new C738890Syd(this, 4) : c738890Syd;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void PN() {
        C1484690ojr c1484690ojr = C1484690ojr.LIZ;
        String strZc = Zc();
        c1484690ojr.getClass();
        C1484690ojr.LIZJ(strZc);
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final Boolean Vl() {
        C2189821An6 c2189821An6 = this.LLJI;
        if (c2189821An6 == null) {
            c2189821An6 = null;
        }
        return Boolean.valueOf(c2189821An6.isSkipEventTracking());
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String getContentSource() {
        C2189821An6 c2189821An6 = this.LLJI;
        if (c2189821An6 == null) {
            c2189821An6 = null;
        }
        String contentSource = c2189821An6.getContentSource();
        return contentSource == null ? "" : contentSource;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String getEventType() {
        C2189821An6 c2189821An6 = this.LLJI;
        if (c2189821An6 == null) {
            c2189821An6 = null;
        }
        String eventType = c2189821An6.getEventType();
        return eventType == null ? "" : eventType;
    }

    public final int getPageType() {
        C2189821An6 c2189821An6 = this.LLJI;
        if (c2189821An6 == null) {
            c2189821An6 = null;
        }
        return c2189821An6.getPageType();
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final C2189821An6 getParam() {
        C2189821An6 c2189821An6 = this.LLJI;
        if (c2189821An6 == null) {
            return null;
        }
        return c2189821An6;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String getPreviousPage() {
        C2189821An6 c2189821An6 = this.LLJI;
        if (c2189821An6 == null) {
            c2189821An6 = null;
        }
        String previousPage = c2189821An6.getPreviousPage();
        return previousPage == null ? "" : previousPage;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String getTracker() {
        C2189821An6 c2189821An6 = this.LLJI;
        if (c2189821An6 == null) {
            c2189821An6 = null;
        }
        String tracker = c2189821An6.getTracker();
        return tracker == null ? "" : tracker;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String im0() {
        C2189821An6 c2189821An6 = this.LLJI;
        if (c2189821An6 == null) {
            c2189821An6 = null;
        }
        String likeEnterMethod = c2189821An6.getLikeEnterMethod();
        return likeEnterMethod == null ? "" : likeEnterMethod;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void jB0() {
        if (this.LLJIJIL) {
            this.LLJIJIL = false;
        }
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLJILLL;
        if (interfaceC665370Q7z != null) {
            return interfaceC665370Q7z;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(getFragment(), null);
        this.LLJILLL = interfaceC665370Q7zLJFF;
        return interfaceC665370Q7zLJFF;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String qE2() {
        C2189821An6 c2189821An6 = this.LLJI;
        if (c2189821An6 == null) {
            c2189821An6 = null;
        }
        String searchKeyword = c2189821An6.getSearchKeyword();
        return searchKeyword == null ? "" : searchKeyword;
    }

    @Override // X.InterfaceC581700Mrg
    public final Aweme LJIIIIZZ() {
        C0SZ8 c0sz8LJLIL;
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility == null || (c0sz8LJLIL = landscapeFeedViewPagerAbility.LJLIL()) == null) {
            return null;
        }
        return c0sz8LJLIL.getAweme();
    }

    public final Aweme LJJJJ() {
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility != null) {
            return landscapeFeedViewPagerAbility.LLLLLJLJLL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final C0SZ8 LJLIL() {
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility != null) {
            return landscapeFeedViewPagerAbility.LJLIL();
        }
        return null;
    }

    @Override // X.InterfaceC581700Mrg
    public final int LJLLJ() {
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility != null) {
            return landscapeFeedViewPagerAbility.LJLLJ();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final VerticalViewPager LLLIIIIL() {
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility != null) {
            return landscapeFeedViewPagerAbility.sP1();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final Aweme LLLLLJLJLL() {
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility != null) {
            return landscapeFeedViewPagerAbility.LLLLLJLJLL();
        }
        return null;
    }

    @Override // X.InterfaceC581430MrF
    public final boolean Pe() {
        ImageView imageViewLJJJJJ = LJJJJJ();
        return imageViewLJJJJJ != null && imageViewLJJJJJ.getVisibility() == 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final String Zc() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("landscape_feed");
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC581700Mrg
    public final int getItemCount() {
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility != null) {
            return landscapeFeedViewPagerAbility.getItemCount();
        }
        return 0;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return getFragment().getLifecycle();
    }

    @Override // X.AbstractC739960T0w, X.InterfaceC581390MrB
    public final boolean isResumed() {
        return super.isResumed();
    }

    @Override // X.InterfaceC581700Mrg
    public final C0SZ8 ku() {
        return LJLIL();
    }

    @Override // X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onDestroy() {
        super.onDestroy();
        DisplayManager displayManager = this.LLJ;
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this);
        }
        C1483390ohl.LIZ().LIZJ().LJI(Zc());
        C1484690ojr c1484690ojr = C1484690ojr.LIZ;
        String strZc = Zc();
        c1484690ojr.getClass();
        if (!C07HM.LIZ) {
            C1478160oZK.LIZ().LJJIJLIJ(strZc);
            return;
        }
        C0IS1 c0is1LIZ = ((InterfaceC468940IaC) C1484690ojr.LIZIZ.getValue()).LIZ(strZc);
        if (c0is1LIZ != null) {
            c0is1LIZ.LIZ();
        }
    }

    @Override // X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onPause() {
        super.onPause();
        this.LLILZLL = false;
        C0SZ8 c0sz8LJLIL = LJLIL();
        if (c0sz8LJLIL == null) {
            return;
        }
        if (C1594680rbG.LJIIJJI(c0sz8LJLIL) && getUserVisibleHint() && C0C64.LJIILLIIL().LJIJ(31744, 1, "player_surfacetexture_keep", true) == 1) {
            c0sz8LJLIL.x3().Ai1(true);
        }
        c0sz8LJLIL.onPause();
        if (getUserVisibleHint()) {
            c0sz8LJLIL.LJLIIIL(2);
        }
        if (getUserVisibleHint()) {
            C1478160oZK.LIZ().LIZ();
        }
    }

    @Override // X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onResume() {
        super.onResume();
        this.LLILZLL = true;
    }

    @Override // X.InterfaceC581430MrF
    public final void showIvPlay() {
        String eventType = getEventType();
        Aweme awemeLJJJJ = LJJJJ();
        LandscapeFeedPlayerAbility landscapeFeedPlayerAbility = (LandscapeFeedPlayerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(getFragment(), null), LandscapeFeedPlayerAbility.class, null);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0OAJ(eventType, awemeLJJJJ, landscapeFeedPlayerAbility != null ? landscapeFeedPlayerAbility.LLLJL() : -1L, null), 3);
        ImageView imageViewLJJJJJ = LJJJJJ();
        if (imageViewLJJJJJ == null) {
            return;
        }
        C786410Ut5.LJZI(0, imageViewLJJJJJ);
        C786410Ut5.Qb(imageViewLJJJJJ, 2.5f);
        C786410Ut5.rc(imageViewLJJJJJ, 2.5f);
        imageViewLJJJJJ.animate().alpha(0.25f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        imageViewLJJJJJ.setSelected(false);
        String string = getContext().getString(2131822938);
        C20096413kA c20096413kA = this.LLIZ;
        Context context = getContext();
        c20096413kA.getClass();
        C20096413kA.LIZ(context, string);
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final JSONObject zj() {
        VerticalViewPager verticalViewPagerSP1;
        C0SR4 c0sr4;
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility != null && (verticalViewPagerSP1 = landscapeFeedViewPagerAbility.sP1()) != null) {
            PagerAdapter adapter = verticalViewPagerSP1.getAdapter();
            if ((adapter instanceof C711330RvH) && (c0sr4 = (C0SR4) adapter) != null) {
                return C708600Rqs.LIZ(getPageType(), c0sr4.getItem(verticalViewPagerSP1.getCurrentItem()), "", getEventType());
            }
        }
        return new JSONObject();
    }

    @Override // X.InterfaceC581390MrB
    public final boolean LJII() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String C7(boolean z) {
        return C735610StL.LIZ(getPageType(), getEventType(), z);
    }

    @Override // X.InterfaceC581390MrB
    public final void LJJIFFI(Aweme aweme) {
        Y2(aweme, true, false);
    }

    @Override // X.InterfaceC581390MrB
    public final void LJJIIZI(boolean z) {
        this.LLILZLL = true;
    }

    @Override // X.InterfaceC581700Mrg
    public final C0SZ8 LJJIJIL(String str) {
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility == null) {
            return null;
        }
        return landscapeFeedViewPagerAbility.LJJIJIL(str);
    }

    public final void LJJJJJL(final C737030Svd c737030Svd) {
        Integer numValueOf;
        C0SZ8 c0sz8LJLIL;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        LandscapePanelStateNotificationAbility landscapePanelStateNotificationAbility;
        C0SZ8 c0sz8LJLIL2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        LandscapePanelStateNotificationAbility landscapePanelStateNotificationAbility2;
        int iLIZ;
        C2189821An6 c2189821An6 = null;
        if (c737030Svd != null && (numValueOf = Integer.valueOf(c737030Svd.LIZ)) != null) {
            if (numValueOf.intValue() == 0) {
                Aweme aweme = (Aweme) c737030Svd.LIZIZ;
                C735280Sso.LIZ.getClass();
                C735280Sso.LJ(aweme);
                return;
            }
            if (numValueOf != null) {
                if (numValueOf.intValue() == 12) {
                    final Aweme aweme2 = (Aweme) c737030Svd.LIZIZ;
                    if (aweme2.getAuthor() == null) {
                        return;
                    }
                    final String uid = aweme2.getAuthor().getUid();
                    final String secUid = aweme2.getAuthor().getSecUid();
                    final int followerStatus = aweme2.getAuthor().getFollowerStatus();
                    boolean zIsSecret = aweme2.getAuthor().isSecret();
                    if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                        LJJJLIIL(aweme2, uid, false, zIsSecret ? 1 : 0, c737030Svd);
                        Activity activity = this.activity;
                        String eventType = getEventType();
                        C627150Oin c627150Oin = new C627150Oin();
                        C786410Ut5.LJJJI("group_id", aweme2.getAid(), c627150Oin.LIZ);
                        C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aweme2.getAid()), c627150Oin.LIZ);
                        Bundle bundle = c627150Oin.LIZ;
                        final int i = zIsSecret ? 1 : 0;
                        C0XPD.LIZIZ(activity, eventType, "click_follow", bundle, new InterfaceC849390XTt() { // from class: X.0SY2
                            @Override // X.InterfaceC849390XTt
                            public final /* synthetic */ void LIZIZ() {
                            }

                            @Override // X.InterfaceC849390XTt
                            public final void LIZ() {
                                C0SY1 c0sy1 = this.LIZ.LLILLL;
                                if (c0sy1 == null || !c0sy1.LJIIIZ()) {
                                    return;
                                }
                                this.LIZ.LJJJLIIL(aweme2, uid, true, i, c737030Svd);
                                C0SY1 c0sy12 = this.LIZ.LLILLL;
                                if (c0sy12 != null) {
                                    C0OVM c0ovm = new C0OVM();
                                    c0ovm.LIZJ(uid);
                                    c0ovm.LIZIZ(secUid);
                                    boolean z = aweme2.getAuthor().isSecret() || aweme2.getAuthor().isPrivateAccount();
                                    C1252380ihA c1252380ihA = c0ovm.LIZ;
                                    c1252380ihA.LJIILIIL = z;
                                    c1252380ihA.LIZLLL = 1;
                                    c0ovm.LIZ.LJI = this.LIZ.getEventType();
                                    String strLIZJ = C729980SkG.LIZJ(this.LIZ.LJIIIIZZ());
                                    C1252380ihA c1252380ihA2 = c0ovm.LIZ;
                                    c1252380ihA2.LJII = strLIZJ;
                                    c1252380ihA2.LJIIIIZZ = aweme2;
                                    c1252380ihA2.LJIIIZ = c737030Svd.LIZLLL;
                                    C2189821An6 c2189821An62 = this.LIZ.LLJI;
                                    if (c2189821An62 == null) {
                                        c2189821An62 = null;
                                    }
                                    c0ovm.LIZ.LJFF = C735820Stg.LIZ(c2189821An62.getEventType());
                                    C2189821An6 c2189821An63 = this.LIZ.LLJI;
                                    int iLIZIZ = C735820Stg.LIZIZ(aweme2, (c2189821An63 != null ? c2189821An63 : null).getEventType());
                                    C1252380ihA c1252380ihA3 = c0ovm.LIZ;
                                    c1252380ihA3.LJ = iLIZIZ;
                                    c1252380ihA3.LJIIJJI = followerStatus;
                                    c0ovm.LIZ.LJIILLIIL = aweme2.getAuthor().getAccurateRecType();
                                    c0sy12.LJ(c0ovm.LIZ());
                                }
                            }
                        });
                        return;
                    }
                    LJJJLIIL(aweme2, uid, true, zIsSecret ? 1 : 0, c737030Svd);
                    C0SY1 c0sy1 = this.LLILLL;
                    if (c0sy1 != null) {
                        C0OVM c0ovm = new C0OVM();
                        c0ovm.LIZJ(uid);
                        c0ovm.LIZIZ(secUid);
                        boolean zIsSecret2 = aweme2.getAuthor().isSecret();
                        C1252380ihA c1252380ihA = c0ovm.LIZ;
                        c1252380ihA.LJIILIIL = zIsSecret2;
                        c1252380ihA.LIZLLL = 1;
                        c0ovm.LIZ.LJI = getEventType();
                        String strLIZJ = C729980SkG.LIZJ(LJIIIIZZ());
                        C1252380ihA c1252380ihA2 = c0ovm.LIZ;
                        c1252380ihA2.LJII = strLIZJ;
                        c1252380ihA2.LJIIIIZZ = aweme2;
                        c1252380ihA2.LJIIIZ = c737030Svd.LIZLLL;
                        if (TextUtils.equals(getEventType(), "homepage_hot")) {
                            iLIZ = -1;
                        } else {
                            C2189821An6 c2189821An62 = this.LLJI;
                            if (c2189821An62 == null) {
                                c2189821An62 = null;
                            }
                            iLIZ = C735820Stg.LIZ(c2189821An62.getEventType());
                        }
                        c0ovm.LIZ.LJFF = iLIZ;
                        C2189821An6 c2189821An63 = this.LLJI;
                        if (c2189821An63 != null) {
                            c2189821An6 = c2189821An63;
                        }
                        int iLIZIZ = C735820Stg.LIZIZ(aweme2, c2189821An6.getEventType());
                        C1252380ihA c1252380ihA3 = c0ovm.LIZ;
                        c1252380ihA3.LJ = iLIZIZ;
                        c1252380ihA3.LJIIJJI = followerStatus;
                        c0ovm.LIZ.LJIILLIIL = aweme2.getAuthor().getAccurateRecType();
                        c0sy1.LJ(c0ovm.LIZ());
                        return;
                    }
                    return;
                }
                if (numValueOf.intValue() == 3) {
                    if (C692480REg.LIZ() && (c0sz8LJLIL2 = LJLIL()) != null && (interfaceC665370Q7zLIZIZ2 = C0T0K.LIZIZ(c0sz8LJLIL2)) != null && (landscapePanelStateNotificationAbility2 = (LandscapePanelStateNotificationAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, LandscapePanelStateNotificationAbility.class, null)) != null) {
                        landscapePanelStateNotificationAbility2.tq1(this.LLJILJILJ, true);
                        return;
                    }
                    return;
                }
                if (numValueOf.intValue() == 28 && C692480REg.LIZ() && (c0sz8LJLIL = LJLIL()) != null && (interfaceC665370Q7zLIZIZ = C0T0K.LIZIZ(c0sz8LJLIL)) != null && (landscapePanelStateNotificationAbility = (LandscapePanelStateNotificationAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, LandscapePanelStateNotificationAbility.class, null)) != null) {
                    landscapePanelStateNotificationAbility.tq1(this.LLJILJILJ, false);
                }
            }
        }
    }

    public final void LJJJJZI(boolean z) {
        C0SZ8 c0sz8F;
        C0SZ8 c0sz8D;
        ImageView imageViewLJJJJJ = LJJJJJ();
        if (imageViewLJJJJJ == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, imageViewLJJJJJ);
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility != null && (c0sz8D = landscapeFeedViewPagerAbility.D()) != null && c0sz8D.F2() != null) {
            C786410Ut5.LJZI(8, c0sz8D.F2());
        }
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility2 = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility2 != null && (c0sz8F = landscapeFeedViewPagerAbility2.F()) != null && c0sz8F.F2() != null) {
            C786410Ut5.LJZI(8, c0sz8F.F2());
        }
        Context context = getContext();
        if (context != null) {
            String string = context.getString(2131822938);
            this.LLIZ.getClass();
            C20096413kA.LIZIZ(100L, context, string, true);
        }
    }

    @Override // X.C0HTT
    public final void LLIIL(C737030Svd c737030Svd) {
        LJJJJJL(c737030Svd);
    }

    @Override // X.InterfaceC581430MrF
    public final void Ud(int i) {
        Fragment fragment;
        LandscapeFeedLoadingAbility landscapeFeedLoadingAbility;
        if (C0SXJ.LIZ && (fragment = getFragment()) != null && (landscapeFeedLoadingAbility = (LandscapeFeedLoadingAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), LandscapeFeedLoadingAbility.class, null)) != null) {
            landscapeFeedLoadingAbility.Ud(i);
        }
    }

    @Override // X.InterfaceC723190SYj
    public final void Uo(FollowStatus followStatus) {
        User author;
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ != null && (author = awemeLJIIIIZZ.getAuthor()) != null && author.getUid() != null) {
            if (Intrinsics.LJFF(author.getUid(), followStatus.getUserId())) {
                author.setFollowStatus(followStatus.getFollowStatus());
            }
            C1440005kM.LIZ(new C0PSR(followStatus.getFollowStatus(), author));
        }
    }

    @Override // X.InterfaceC581700Mrg
    public final Aweme d2(int i) {
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility == null) {
            return null;
        }
        return landscapeFeedViewPagerAbility.d2(i);
    }

    @Override // X.C0R9L
    public final void handleDoubleClick(MotionEvent motionEvent) {
        LandscapeVideoViewCell landscapeVideoViewCell;
        LandscapeCellAssem landscapeCellAssem;
        String aid;
        C0SZ8 c0sz8LJLIL;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            Aweme awemeLJJJJ = LJJJJ();
            if (awemeLJJJJ != null) {
                ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
                C0XQS c0xqs = new C0XQS();
                c0xqs.LIZ = this.activity;
                c0xqs.LIZIZ = getEventType();
                c0xqs.LIZJ = "click_double_like";
                C627150Oin c627150Oin = new C627150Oin();
                C786410Ut5.LJJJI("login_title", "", c627150Oin.LIZ);
                C786410Ut5.LJJJI("group_id", awemeLJJJJ.getAid(), c627150Oin.LIZ);
                C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(awemeLJJJJ.getAid()), c627150Oin.LIZ);
                c0xqs.LIZLLL = c627150Oin.LIZ;
                iLoginServiceLIZJ.showLoginView(new C0XQT(c0xqs));
                C735330Sst c735330Sst = new C735330Sst();
                c735330Sst.LIZLLL = getEventType();
                c735330Sst.LJJLIIIJLLLLLLLZ = getPageType();
                c735330Sst.LJJLIIIJ = awemeLJJJJ.getAid();
                c735330Sst.LJIJI(awemeLJJJJ);
                c735330Sst.LJJLIIIJJIZ = "click_double_like";
                c735330Sst.LJJLIIIJL = !C740470T2v.LIZIZ() ? 1 : 0;
                c735330Sst.LJJLIIIJLJLI = 0;
                c735330Sst.LJIILJJIL();
                if (!C740470T2v.LIZIZ()) {
                    C740470T2v.LIZJ();
                    return;
                }
                return;
            }
            return;
        }
        Aweme awemeLJJJJ2 = LJJJJ();
        if (awemeLJJJJ2 != null && awemeLJJJJ2.isPaidContent) {
            return;
        }
        C733660SqC.LIZ.getClass();
        if (C733660SqC.LIZ() && (c0sz8LJLIL = LJLIL()) != null) {
            c0sz8LJLIL.Ar(LJJJJ());
        }
        C0SZ8 c0sz8LJLIL2 = LJLIL();
        if ((c0sz8LJLIL2 instanceof LandscapeVideoViewCell) && (landscapeVideoViewCell = (LandscapeVideoViewCell) c0sz8LJLIL2) != null && (landscapeCellAssem = landscapeVideoViewCell.LLLLLILLIL) != null) {
            C0HHT c0hht = C0HHT.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoDiggVM.class);
            VideoDiggVM videoDiggVM = (VideoDiggVM) C737910Sx3.LIZ(landscapeCellAssem, C724750Sbp.LJIIJ(landscapeCellAssem, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 336), null, AFwS243S0000000_11.get$arr$(654)).getValue(null, LandscapeVideoViewCell.LLLZZIL[0]);
            if (videoDiggVM != null) {
                Aweme awemeLJJJJ3 = LJJJJ();
                if (awemeLJJJJ3 != null) {
                    aid = awemeLJJJJ3.getAid();
                } else {
                    aid = null;
                }
                if (videoDiggVM.LQ2(aid)) {
                    return;
                }
            }
        }
        C16F4 c16f4 = this.LL;
        if (c16f4 == null) {
            return;
        }
        c16f4.LIZJ(motionEvent.getRawX(), motionEvent.getRawY(), null);
    }

    @Override // X.InterfaceC581700Mrg
    public final int hu(Aweme aweme) {
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility != null) {
            return landscapeFeedViewPagerAbility.hu(aweme);
        }
        return -1;
    }

    @C14EU
    public final void onCommentDialogEvent(C0SYH c0syh) {
        InterfaceC689860R4e interfaceC689860R4eK9;
        Activity activity = this.activity;
        if (activity != null && !activity.isFinishing()) {
            if (c0syh.LIZIZ != activity.hashCode()) {
                return;
            }
            boolean z = true;
            if (c0syh.LIZ != 1) {
                z = false;
            }
            C1620050sGB c1620050sGB = this.LLJILJIL;
            if (c1620050sGB != null) {
                c1620050sGB.LJIIJJI("comment_panel", z, null);
            }
            C0SZ8 c0sz8LJLIL = LJLIL();
            if (c0sz8LJLIL != null && c0sz8LJLIL.K9() != null && (interfaceC689860R4eK9 = c0sz8LJLIL.K9()) != null) {
                interfaceC689860R4eK9.LLILZ(z);
            }
        }
    }

    @C14EU
    public void onCommentDialogEventOnBase(C0SYH c0syh) {
        C0SZ8 c0sz8LJLIL = LJLIL();
        if (c0sz8LJLIL != null) {
            c0sz8LJLIL.LLIIIJ(c0syh);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        C0SZ8 c0sz8LJLIL = LJLIL();
        if (c0sz8LJLIL != null) {
            c0sz8LJLIL.LLLLLLJ(true);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        C0SZ8 c0sz8LJLIL = LJLIL();
        if (c0sz8LJLIL != null) {
            c0sz8LJLIL.LLLLLLJ(false);
        }
    }

    @C14EU
    public void onVideoCleanModeEvent(C0SYF c0syf) {
        WeakReference<IBaseListFragmentPanel> weakReference;
        String aid = null;
        if (c0syf.LIZJ != null || ((weakReference = c0syf.LIZLLL) != null && weakReference.get() != null)) {
            IBaseListFragmentPanel iBaseListFragmentPanel = c0syf.LIZJ;
            if (iBaseListFragmentPanel == null) {
                WeakReference<IBaseListFragmentPanel> weakReference2 = c0syf.LIZLLL;
                if (weakReference2 != null) {
                    iBaseListFragmentPanel = weakReference2.get();
                } else {
                    iBaseListFragmentPanel = null;
                }
            }
            if (!Intrinsics.LJFF(this, iBaseListFragmentPanel)) {
                return;
            }
        }
        C0SZ8 c0sz8LJLIL = LJLIL();
        if (c0sz8LJLIL != null && c0syf.LIZIZ != null && c0sz8LJLIL.getAweme() != null) {
            Aweme aweme = c0syf.LIZIZ;
            if (aweme != null) {
                aid = aweme.getAid();
            }
            if (!Intrinsics.LJFF(aid, c0sz8LJLIL.getAweme().getAid())) {
                return;
            }
            c0sz8LJLIL.LJIIZILJ(c0syf.LIZ);
        }
    }

    @Override // X.InterfaceC723190SYj
    public final void th(Exception exc) {
        if (!isViewValid()) {
            return;
        }
        C0O3Q.LIZ(C1388190mED.LIZ(getContext()), exc);
    }

    @Override // X.InterfaceC723190SYj
    public final void u41(Exception exc) {
        C723180SYi.LIZ(this, exc);
    }

    @Override // X.InterfaceC581390MrB
    public final void LJJIZ(Aweme aweme, boolean z) {
        Y2(aweme, true, false);
    }

    @Override // X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onViewCreated(View view, Bundle bundle) {
        C21610619ho c21610619ho;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.t25);
        if ((viewFindViewById instanceof FeedSwipeRefreshLayout) && (c21610619ho = (C21610619ho) viewFindViewById) != null) {
            c21610619ho.setEnabled(false);
        }
        this.LL = (C16F4) view.findViewById(R.id.fu8);
        view.findViewById(R.id.cxw);
        ArrayList arrayList = new ArrayList();
        Aweme awemeLJJJJ = LJJJJ();
        if (awemeLJJJJ != null) {
            arrayList.add(awemeLJJJJ);
        }
        LandscapeFeedVideoEventDispatcherAbility landscapeFeedVideoEventDispatcherAbility = (LandscapeFeedVideoEventDispatcherAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedVideoEventDispatcherAbility.class, null);
        if (landscapeFeedVideoEventDispatcherAbility != null) {
            landscapeFeedVideoEventDispatcherAbility.Qu1(this, new AwS590S0100000_11(this, 435));
        }
        this.LLILZ = true;
        C0SY1 c0sy1LJIIIIZZ = C1076010e6h.LIZJ.LJIIIIZZ();
        this.LLILLL = c0sy1LJIIIIZZ;
        if (c0sy1LJIIIIZZ != null) {
            c0sy1LJIIIIZZ.LJII(this);
        }
        C1484690ojr c1484690ojr = C1484690ojr.LIZ;
        String strZc = Zc();
        c1484690ojr.getClass();
        C1484690ojr.LIZ(strZc);
        C1484690ojr.LIZJ(Zc());
        this.LLJILJIL = C0SHX.LIZ(this.activity, null);
    }

    @Override // X.InterfaceC581430MrF
    public final void Je(long j, String str, float f) {
        Fragment fragment;
        LandscapeFeedLoadingAbility landscapeFeedLoadingAbility;
        if (f > 0.0f && !this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
            try {
                DisplayManager displayManager = (DisplayManager) C786410Ut5.H2(C786410Ut5.N3(getContext()), "display");
                this.LLJ = displayManager;
                displayManager.registerDisplayListener(this, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (C0SXJ.LIZ && (fragment = getFragment()) != null && (landscapeFeedLoadingAbility = (LandscapeFeedLoadingAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), LandscapeFeedLoadingAbility.class, null)) != null) {
            landscapeFeedLoadingAbility.eR(j);
        }
    }

    @Override // X.C0R9L
    public final void Y2(Aweme aweme, boolean z, boolean z2) {
        C735280Sso.LIZ.getClass();
        if (C735280Sso.LJ(aweme)) {
            C1233040iBy c1233040iBy = new C1233040iBy(getContext());
            c1233040iBy.LIZIZ(2131858551);
            c1233040iBy.LIZLLL();
            return;
        }
        if ((!this.LLILZLL || !isViewValid()) && !C1618110sD3.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("try to handlePlay,but can't meet the conditions,pageResume:");
            sbLIZ.append(this.LLILZLL);
            sbLIZ.append(",isViewValid:");
            sbLIZ.append(isViewValid());
            sbLIZ.append("BgPlayState.INSTANCE.isMediaNotificationActiveAndInBackground():");
            sbLIZ.append(C1618110sD3.LIZ());
            C2344809Gs.LIZLLL(4, "LandscapeFragmentPanel", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("the stacktrace:");
            sbLIZ2.append(Log.getStackTraceString(new Throwable()));
            C2344809Gs.LIZLLL(4, "LandscapeFragmentPanel", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        LandscapeFeedPlayerAbility landscapeFeedPlayerAbility = (LandscapeFeedPlayerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(getFragment(), null), LandscapeFeedPlayerAbility.class, null);
        if (landscapeFeedPlayerAbility == null) {
            return;
        }
        if (aweme != null) {
            landscapeFeedPlayerAbility.Y2(aweme, z, z2);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void LJJJLIIL(Aweme aweme, String str, boolean z, int i, C737030Svd c737030Svd) {
        String previousPage;
        String previousPagePosition;
        String str2;
        User author;
        boolean z2;
        String str3;
        String previousPage2;
        String aid;
        String str4;
        if (z && !TextUtils.isEmpty(getEventType()) && aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            C328650CuV c328650CuV = new C328650CuV(4, aweme.getAid(), System.currentTimeMillis(), getEventType());
            c328650CuV.LJ = AwemeExtKt.getAuthorUid(aweme);
            C328640CuU.LIZ(c328650CuV);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("author_id", AwemeExtKt.getAuthorUid(aweme));
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("enter_from", getEventType());
            jSONObject.put("impr_type", C735370Ssx.LJI(aweme));
            jSONObject.put("compilation_id", AwemeExtKt.getMixId(aweme));
            jSONObject.put("request_id", zj().optString("request_id"));
            jSONObject.put("enter_type", "normal_way");
            jSONObject.put("is_landscape_screen", String.valueOf(C0SXF.LJJIII(getContext(), aweme)));
            if (!Intrinsics.LJFF("homepage_hot", getEventType())) {
                C2189821An6 c2189821An6 = this.LLJI;
                if (c2189821An6 == null) {
                    c2189821An6 = null;
                }
                jSONObject.put("previous_page", c2189821An6.getEnterMethodValue());
            }
            jSONObject.put("request_id", C735370Ssx.LJIJ(getPageType(), aweme));
            jSONObject.put("is_photo", C735370Ssx.LJ(aweme));
            if (aweme.isAd()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_ad", str4);
            C1370890lmJ c1370890lmJ = C1370890lmJ.LIZ;
            C735840Sti c735840Sti = C735840Sti.LIZ;
            Object objLJIIIZ = C19651011uW.LIZIZ.LJIIIZ(aweme, jSONObject);
            c735840Sti.getClass();
            C735840Sti.LIZIZ(aweme, objLJIIIZ);
            c1370890lmJ.appendCreationParams(objLJIIIZ, aweme);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        getContext();
        C20684815ws.LJIILIIL("follow", getEventType(), str, C735370Ssx.LIZJ(aweme), jSONObject);
        String previousPagePosition2 = "follow_button";
        if (z) {
            if (c737030Svd != null && !TextUtils.isEmpty(c737030Svd.LJIIJ) && (Intrinsics.LJFF("card_button", c737030Svd.LJIIJ) || Intrinsics.LJFF("expand_card", c737030Svd.LJIIJ) || Intrinsics.LJFF("small_card", c737030Svd.LJIIJ))) {
                str2 = c737030Svd.LJIIJ;
            } else {
                str2 = "main_head";
            }
            C2189821An6 c2189821An62 = this.LLJI;
            if (c2189821An62 == null) {
                c2189821An62 = null;
            }
            String searchResultId = c2189821An62.getSearchResultId();
            if (aweme != null) {
                author = aweme.getAuthor();
            } else {
                author = null;
            }
            String str5 = "";
            if (TextUtils.isEmpty(searchResultId)) {
                if (aweme == null) {
                    searchResultId = "";
                } else {
                    searchResultId = aweme.getAid();
                }
            }
            C2189821An6 c2189821An63 = this.LLJI;
            if (c2189821An63 == null) {
                c2189821An63 = null;
            }
            if (!c2189821An63.isCard()) {
                C1360540lVc c1360540lVc = C1360540lVc.LIZIZ;
                C735840Sti c735840Sti2 = C735840Sti.LIZ;
                C19651011uW c19651011uW = C19651011uW.LIZIZ;
                C1260910iuv c1260910iuv = new C1260910iuv(0);
                c1260910iuv.LJJIJLIJ(getEventType());
                c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.ITEM;
                c1260910iuv.LJJJJLL();
                c1260910iuv.LJJLIIIJJI = EnumC1260930iux.FOLLOW;
                c1260910iuv.LJJIL(str2);
                c1260910iuv.LJIJI(aweme);
                c1260910iuv.LJJJJZI(author);
                c1260910iuv.LJLL = C0SXF.LJJIII(getContext(), aweme);
                Object objLJIIIZ2 = c19651011uW.LJIIIZ(aweme, c1260910iuv);
                c735840Sti2.getClass();
                C735840Sti.LIZIZ(aweme, objLJIIIZ2);
                ((C1260910iuv) c1360540lVc.LIZ(aweme, objLJIIIZ2)).LJJJJI();
            }
            if (aweme != null && aweme.getBottomBarModel() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (author != null && author.getFollowerStatus() == 1) {
                str3 = "mutual";
            } else {
                str3 = "single";
            }
            C1ER1 c1er1 = C1ER1.LIZIZ;
            String eventType = getEventType();
            C2189821An6 c2189821An64 = this.LLJI;
            if (c2189821An64 == null) {
                c2189821An64 = null;
            }
            Map<String, String> mapFetchSearchParams = c1er1.fetchSearchParams(eventType, c2189821An64.getPreviousPage());
            C735840Sti c735840Sti3 = C735840Sti.LIZ;
            C19651011uW c19651011uW2 = C19651011uW.LIZIZ;
            C735350Ssv c735350Ssv = new C735350Ssv();
            c735350Ssv.LIZLLL = C7(true);
            if (TextUtils.isEmpty(getPreviousPage())) {
                previousPage2 = getEventType();
            } else {
                previousPage2 = getPreviousPage();
            }
            c735350Ssv.LJJLIIIJ = previousPage2;
            if (!TextUtils.isEmpty(getPreviousPage())) {
                C2189821An6 c2189821An65 = this.LLJI;
                if (c2189821An65 == null) {
                    c2189821An65 = null;
                }
                previousPagePosition2 = c2189821An65.getPreviousPagePosition();
            }
            c735350Ssv.LJJLIIIJILLIZJL = previousPagePosition2;
            c735350Ssv.LJJLIIIJJI = z2;
            c735350Ssv.LJJLIIJ = str2;
            c735350Ssv.LJJLIIIJJIZ = str;
            c735350Ssv.LJJIJIL(getPageType(), aweme);
            C2189821An6 c2189821An66 = this.LLJI;
            if (c2189821An66 == null) {
                c2189821An66 = null;
            }
            c735350Ssv.LJJIJLIJ = c2189821An66.getSearchId();
            c735350Ssv.LJJII = searchResultId;
            c735350Ssv.LJLIIIL = i;
            C2189821An6 c2189821An67 = this.LLJI;
            if (c2189821An67 == null) {
                c2189821An67 = null;
            }
            c735350Ssv.LJJZZI = c2189821An67.getChallengeId();
            C2189821An6 c2189821An68 = this.LLJI;
            if (c2189821An68 == null) {
                c2189821An68 = null;
            }
            c735350Ssv.LJJZZIII = c2189821An68.getParentTagId();
            c735350Ssv.LJLJI = AwemeBizExtKt.isHighlighted(aweme);
            c735350Ssv.LJLJJI = AwemeBizExtKt.getOriginalPos(aweme);
            C2189821An6 c2189821An69 = this.LLJI;
            if (c2189821An69 == null) {
                c2189821An69 = null;
            }
            c735350Ssv.LJLJJLL = c2189821An69.getCategoryName();
            C1365450ldX.LIZLLL(c735350Ssv, aweme.getAuthor());
            User author2 = aweme.getAuthor();
            c735840Sti3.getClass();
            c735350Ssv.LJJJLL = C735840Sti.LJIIIIZZ(author2);
            c735350Ssv.LJJZ = str3;
            c735350Ssv.LJJLIIIJLJLI = aweme.getRequestId();
            String previousPage3 = getPreviousPage();
            Aweme awemeLJJJJ = LJJJJ();
            if (awemeLJJJJ != null && (aid = awemeLJJJJ.getAid()) != null) {
                str5 = aid;
            }
            c735350Ssv.LJJLIIIIJ = C584760Mwc.LIZ(previousPage3, str5);
            c735350Ssv.LJJII(C0JBR.LIZ(aweme, mapFetchSearchParams));
            c735350Ssv.LJLJLJ = C0SXF.LJJIII(getContext(), aweme);
            C2189821An6 c2189821An610 = null;
            c735350Ssv.LIZIZ(C666580QCq.LIZIZ(aweme, "follow", getEventType(), null));
            Object objLJIIIZ3 = c19651011uW2.LJIIIZ(aweme, c735350Ssv);
            C735840Sti.LIZIZ(aweme, objLJIIIZ3);
            AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) objLJIIIZ3;
            C0SXF.LIZJ(abstractC1386130mAt, C7(true), aweme, null);
            C0SXF.LJIIIIZZ(abstractC1386130mAt, aweme, getContext(), false);
            C2189821An6 c2189821An611 = this.LLJI;
            if (c2189821An611 != null) {
                c2189821An610 = c2189821An611;
            }
            C734630Srl.LIZIZ(abstractC1386130mAt, c2189821An610);
            abstractC1386130mAt.LJIILJJIL();
            return;
        }
        C735340Ssu c735340Ssu = new C735340Ssu();
        c735340Ssu.LIZLLL = C7(true);
        if (TextUtils.isEmpty(getPreviousPage())) {
            previousPage = getEventType();
        } else {
            previousPage = getPreviousPage();
        }
        c735340Ssu.LJJLIIIJ = previousPage;
        if (TextUtils.isEmpty(getPreviousPage())) {
            previousPagePosition = "follow_button";
        } else {
            C2189821An6 c2189821An612 = this.LLJI;
            if (c2189821An612 == null) {
                c2189821An612 = null;
            }
            previousPagePosition = c2189821An612.getPreviousPagePosition();
        }
        c735340Ssu.LJJLIIIJILLIZJL = previousPagePosition;
        c735340Ssu.LJJLIIIJLJLI = "follow_button";
        c735340Ssu.LJJLIIIJJI = str;
        c735340Ssu.LJJIJIL(getPageType(), aweme);
        c735340Ssu.LJIILJJIL();
    }
}
