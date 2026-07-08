package com.ss.android.ugc.aweme.commentv2.commentpage.landscapevideo;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0CNZ;
import X.C0QQT;
import X.C0QSJ;
import X.C0R7C;
import X.C0S4U;
import X.C0SYH;
import X.C0T45;
import X.C0TVI;
import X.C0XAU;
import X.C0XQ7;
import X.C1206770hVb;
import X.C1345380l7A;
import X.C1345390l7B;
import X.C1345690l7f;
import X.C1346170l8R;
import X.C1346420l8q;
import X.C1347350lAL;
import X.C1349730lEB;
import X.C1349800lEI;
import X.C1353060lJY;
import X.C1354730lMF;
import X.C1388190mED;
import X.C13LE;
import X.C1440005kM;
import X.C14K9;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1616490sAR;
import X.C1616660sAi;
import X.C1685300txQ;
import X.C189200o6;
import X.C19252910Tv;
import X.C19EG;
import X.C19GS;
import X.C1AV3;
import X.C20097313kJ;
import X.C21146717pB;
import X.C2217381BqS;
import X.C294190Bg1;
import X.C296200BjG;
import X.C343710Ddh;
import X.C418440Gaw;
import X.C452501pT;
import X.C473380IhM;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1258040iqI;
import X.InterfaceC1349750lED;
import X.InterfaceC1350190lEv;
import X.InterfaceC1350210lEx;
import X.InterfaceC1350270lF3;
import X.InterfaceC1586360rNq;
import X.InterfaceC21613719iJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS8S0102000_21;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.comment.commentlist.util.CommentPageLoadTimer;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentListModel;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.commentv2.actionbar.CommentPageActionBarViewModel;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment;
import com.ss.android.ugc.aweme.commentv2.commentpage.landscapevideo.LandscapeCommentPageContainer;
import com.ss.android.ugc.aweme.commentv2.panel.CommentListPanelV2Provider;
import com.ss.android.ugc.aweme.commentv2.panel.CommerceAppReviewPanelProvider;
import com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol;
import com.ss.android.ugc.aweme.commentv2.panel.LikePanelProviderV2;
import com.ss.android.ugc.aweme.commentv2.panel.MixViewerPanelProviderV2;
import com.ss.android.ugc.aweme.commentv2.panel.ReviewPanelProvider;
import com.ss.android.ugc.aweme.commentv2.panel.ViewerPanelProviderV2;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.search.entry.commenticon.communication.CommentRootFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes22.dex */
public final class LandscapeCommentPageContainer extends BaseCommentPageContainerFragment implements InterfaceC21613719iJ, InterfaceC1586360rNq {
    public static final C1345690l7f LLJZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjE6e2EwJyghLCEnOCQrLGHELIOSE/KSsoOiwyOCA6ICs2J2sAKCE3OyYtOSoQJyghLCEnGCQrLAw8JjEtICE2Og==";
    public C1353060lJY LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 508));
    public boolean LLJJLIIIJLLLLLLLZ;
    public volatile MainPageBusinessAbility LLJL;
    public IPageActionBarAbility LLJLIL;
    public ICommentPageContainer LLJLILLLLZIIL;
    public C0QQT LLJLL;
    public InterfaceC665370Q7z LLJLLIL;
    public C0QSJ LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LandscapeCommentPageContainer.class, "mainPageBusinessAbility", "getMainPageBusinessAbility()Lcom/ss/android/ugc/aweme/base/mainpagefragment/MainPageBusinessAbility;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJZ = new C1345690l7f();
    }

    @Override // X.InterfaceC21613719iJ
    public final void ED(int i, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        super.bindAbility(obj, cls);
        if (cls == IPageActionBarAbility.class) {
            this.LLJLIL = (IPageActionBarAbility) obj;
        } else if (cls == ICommentPageContainer.class) {
            this.LLJLILLLLZIIL = (ICommentPageContainer) obj;
        } else if (cls == C0QQT.class) {
            this.LLJLL = (C0QQT) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentRootFragmentScope.class, CommentRootFragmentScope.class});
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, X.C0QSJ
    public final Object getAbility(Class cls) {
        return cls == IPageActionBarAbility.class ? this.LLJLIL : cls == ICommentPageContainer.class ? this.LLJLILLLLZIIL : cls == C0QQT.class ? this.LLJLL : super.getAbility(cls);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(CommentRootFragmentScope.class);
        arrayList.add(MainActivityScope.class);
        arrayList.add(CommentRootFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(CommentRootFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final boolean l91() {
        return true;
    }

    @Override // X.InterfaceC21613719iJ
    public final void my() {
    }

    @Override // X.InterfaceC21613719iJ
    public final void tA() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        super.unbindAbility(obj, cls);
        if (cls == IPageActionBarAbility.class) {
            this.LLJLIL = null;
        } else if (cls == ICommentPageContainer.class) {
            this.LLJLILLLLZIIL = null;
        } else if (cls == C0QQT.class) {
            this.LLJLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.InterfaceC21613719iJ
    public final Fragment wb() {
        return this;
    }

    @Override // X.InterfaceC21613719iJ
    public final String xC() {
        return "comment_page_tablet";
    }

    @Override // X.InterfaceC21613719iJ
    public final void RM() {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        c19252910Tv.LIZLLL().LJIIIIZZ();
        C0T45.LJI();
        this.LLJJLIIIJLLLLLLLZ = false;
        c19252910Tv.LIZLLL().LJIJI().LJJLIIIJ().LIZJ();
        C1353060lJY c1353060lJY = this.LLJJJ;
        if (c1353060lJY == null) {
            c1353060lJY = null;
        }
        c1353060lJY.LJFF(true);
        C1347350lAL.LJ(getContext());
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment
    public final void RR() {
        IPanelProviderProtocol iPanelProviderProtocolLJJLIIIJILLIZJL;
        this.LLIZ.add(new CommentListPanelV2Provider());
        C1349800lEI c1349800lEI = this.LL;
        if (c1349800lEI == null || !c1349800lEI.isSplitMode()) {
            return;
        }
        this.LLIZ.add(new MixViewerPanelProviderV2());
        this.LLIZ.add(new LikePanelProviderV2());
        this.LLIZ.add(new ViewerPanelProviderV2());
        this.LLIZ.add(new ReviewPanelProvider());
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
        if (iECommerceAnchorService != null && (iPanelProviderProtocolLJJLIIIJILLIZJL = iECommerceAnchorService.LJJLIIIJILLIZJL()) != null) {
            this.LLIZ.add(iPanelProviderProtocolLJJLIIIJILLIZJL);
        }
        this.LLIZ.add(new CommerceAppReviewPanelProvider());
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final void Qh0() {
        CommentCommonModel commonModel;
        CommentContextSource commentContextSourceGL = GL();
        if (C1346420l8q.LIZJ((commentContextSourceGL == null || (commonModel = commentContextSourceGL.getCommonModel()) == null) ? null : Boolean.valueOf(commonModel.isPreCreate()))) {
            return;
        }
        C1349800lEI c1349800lEI = this.LL;
        if (c1349800lEI == null || !c1349800lEI.isSplitMode()) {
            C1353060lJY c1353060lJY = this.LLJJJ;
            if (c1353060lJY == null) {
                c1353060lJY = null;
            }
            c1353060lJY.setOnShowWidthChangeListener(new InterfaceC1350210lEx() { // from class: X.0lEh
                @Override // X.InterfaceC1350210lEx
                public final void LIZ(float f, float f2) {
                    C1349800lEI c1349800lEI2;
                    InterfaceC1350210lEx onShowWidthChangeListener;
                    if (f2 != 0.0f && (c1349800lEI2 = this.LIZ.LL) != null && (onShowWidthChangeListener = c1349800lEI2.getOnShowWidthChangeListener()) != null) {
                        onShowWidthChangeListener.LIZ(f, f2);
                    }
                }
            });
            C1353060lJY c1353060lJY2 = this.LLJJJ;
            if (c1353060lJY2 == null) {
                c1353060lJY2 = null;
            }
            c1353060lJY2.getClass();
            c1353060lJY2.LIZJ("", true, true);
            C0XAU.LIZ(new ARunnableS113S0100000_13(0, c1353060lJY2, 249));
            return;
        }
        C1353060lJY c1353060lJY3 = this.LLJJJ;
        if (c1353060lJY3 == null) {
            c1353060lJY3 = null;
        }
        c1353060lJY3.getClass();
        c1353060lJY3.LIZJ("", true, false);
        if (!this.LLJJLIIIJLLLLLLLZ) {
            C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ();
            C1349800lEI c1349800lEI2 = this.LL;
            C0T45.LJFF(c1349800lEI2 != null ? c1349800lEI2.getEnterFrom() : null);
            this.LLJJLIIIJLLLLLLLZ = true;
            C0SYH c0syh = new C0SYH(1);
            C19EG activity = getActivity();
            c0syh.LIZIZ = activity != null ? activity.hashCode() : 0;
            C1440005kM.LIZ(c0syh);
        }
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJLIIIJ().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        CommentPageLoadTimer.LIZJ = null;
        CommentPageLoadTimer.LIZLLL = null;
        C1353060lJY c1353060lJY = this.LLJJJ;
        if (c1353060lJY == null) {
            c1353060lJY = null;
        }
        c1353060lJY.LLLLII.clear();
        C0R7C c0r7cLLJJJJ = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLJJJJ();
        getActivity();
        if (c0r7cLLJJJJ.LIZJ()) {
            Context context = getContext();
            C343710Ddh.LIZ(context != null ? C1388190mED.LIZIZ(context) : null).HQ2(this);
        }
    }

    @Override // X.InterfaceC21613719iJ
    public final void Ml() {
        Qh0();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final void Kb1(String str) {
        C1353060lJY c1353060lJY = this.LLJJJ;
        if (c1353060lJY == null) {
            c1353060lJY = null;
        }
        c1353060lJY.LJ("");
        C0XAU.LIZ(new ARunnableS113S0100000_13(1, c1353060lJY, 249));
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment
    public final void NR(View view) {
        boolean z;
        String authorUid;
        Boolean boolValueOf;
        CommentCommonModel commonModel;
        Aweme aweme;
        this.LLJJJ = (C1353060lJY) view.findViewById(R.id.trr);
        this.LLJJJJJIL = view.findViewById(R.id.ecf);
        this.LLJJJJ = view.findViewById(R.id.o1o);
        this.LLJJJJLIIL = view.findViewById(R.id.eqx);
        C1349800lEI c1349800lEI = this.LL;
        if (c1349800lEI != null && c1349800lEI.isSplitMode()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View view2 = this.LLJJJJLIIL;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams != null) {
                    if (layoutParams.width != -2) {
                        layoutParams.width = -2;
                        C786410Ut5.W5(view2, layoutParams);
                    }
                } else {
                    C786410Ut5.W5(view2, layoutParams);
                }
            }
            View view3 = this.LLJJJJ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            View view4 = this.LLJJJJJIL;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
            C1353060lJY c1353060lJY = this.LLJJJ;
            if (c1353060lJY == null) {
                c1353060lJY = null;
            }
            ViewGroup.LayoutParams layoutParams2 = c1353060lJY.getLayoutParams();
            if (layoutParams2 != null) {
                C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ();
                layoutParams2.width = C0T45.LIZJ();
            }
            View viewFindViewById = view.findViewById(R.id.e_n);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            CommentContextSource commentContextSourceGL = GL();
            if (commentContextSourceGL != null) {
                commentContextSourceGL.setSplitMode(true);
            }
            View viewFindViewById2 = view.findViewById(R.id.ech);
            if (viewFindViewById2 != null) {
                C1206770hVb.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), viewFindViewById2);
            }
        }
        this.LLJJJIL = view.findViewById(R.id.i4g);
        C723850SaN.LIZ(this, false, null, new AwS585S0100000_6(this, 51), 3);
        C1349800lEI c1349800lEI2 = this.LL;
        if (c1349800lEI2 != null && c1349800lEI2.isSplitMode()) {
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            CommentContextSource commentContextSourceGL2 = GL();
            if (commentContextSourceGL2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceGL2)) != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            if (((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(authorUid) && !CommentContextSourceKt.isFromTitlePanel(GL())) {
                CommentContextSource commentContextSourceGL3 = GL();
                if (commentContextSourceGL3 != null && (commonModel = commentContextSourceGL3.getCommonModel()) != null) {
                    boolValueOf = Boolean.valueOf(commonModel.forceHideBatchManagementView);
                } else {
                    boolValueOf = null;
                }
                if (!C1346420l8q.LIZJ(boolValueOf)) {
                    C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 576), 3);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ().getClass();
        if (C1616660sAi.LIZJ()) {
            C1353060lJY c1353060lJY = this.LLJJJ;
            if (c1353060lJY == null) {
                c1353060lJY = null;
            }
            if (c1353060lJY.LJIIIIZZ()) {
                RM();
            }
        }
    }

    @Override // X.InterfaceC21613719iJ
    public final void wq(Object... objArr) {
        C1349800lEI c1349800lEI;
        Aweme aweme;
        ViewPager viewPager;
        String strEnterMethod;
        C1349730lEB c1349730lEB;
        List<InterfaceC1349750lED> list;
        ViewPager viewPager2;
        List<InterfaceC1349750lED> list2;
        String strEnterMethod2;
        C1349730lEB c1349730lEB2;
        List<InterfaceC1349750lED> list3;
        Object obj = objArr[0];
        List<InterfaceC1349750lED> list4 = null;
        if ((obj instanceof C1349800lEI) && (c1349800lEI = (C1349800lEI) obj) != null) {
            Object obj2 = objArr[1];
            if ((obj2 instanceof Aweme) && (aweme = (Aweme) obj2) != null) {
                String str = "";
                if (c1349800lEI.isSplitModeRefresh() && (viewPager2 = this.LLILZ) != null) {
                    C1349730lEB c1349730lEB3 = this.LLILZIL;
                    if (c1349730lEB3 != null) {
                        CommentContextSource commentContextSourceGL = GL();
                        CommentPageActionBarViewModel commentPageActionBarViewModel = this.LLILZLL;
                        if (commentPageActionBarViewModel != null) {
                            list3 = commentPageActionBarViewModel.LLILZIL;
                        } else {
                            list3 = null;
                        }
                        c1349730lEB3.LJ(false, commentContextSourceGL, list3, this);
                    }
                    C294190Bg1.LIZ.getClass();
                    if (C294190Bg1.LIZIZ() && (c1349730lEB2 = this.LLILZIL) != null) {
                        c1349730lEB2.LIZ();
                    }
                    C1349730lEB c1349730lEB4 = this.LLILZIL;
                    if (c1349730lEB4 != null) {
                        CommentPageActionBarViewModel commentPageActionBarViewModel2 = this.LLILZLL;
                        if (commentPageActionBarViewModel2 != null) {
                            list2 = commentPageActionBarViewModel2.LLILZIL;
                        } else {
                            list2 = null;
                        }
                        int currentItem = viewPager2.getCurrentItem();
                        CommentContextSource commentContextSourceGL2 = GL();
                        if (commentContextSourceGL2 == null || (strEnterMethod2 = CommentContextSourceKt.enterMethod(commentContextSourceGL2)) == null) {
                            strEnterMethod2 = "";
                        }
                        c1349730lEB4.LJFF(list2, currentItem, -1, "split_screen", strEnterMethod2, false, false);
                    }
                }
                SR(aweme, c1349800lEI, Boolean.TRUE);
                Qh0();
                if (c1349800lEI.isSplitModeRefresh() && (viewPager = this.LLILZ) != null) {
                    C1349730lEB c1349730lEB5 = this.LLILZIL;
                    if (c1349730lEB5 != null) {
                        CommentContextSource commentContextSourceGL3 = GL();
                        CommentPageActionBarViewModel commentPageActionBarViewModel3 = this.LLILZLL;
                        if (commentPageActionBarViewModel3 != null) {
                            list = commentPageActionBarViewModel3.LLILZIL;
                        } else {
                            list = null;
                        }
                        c1349730lEB5.LJ(true, commentContextSourceGL3, list, this);
                    }
                    C294190Bg1.LIZ.getClass();
                    if (C294190Bg1.LIZIZ() && (c1349730lEB = this.LLILZIL) != null) {
                        c1349730lEB.LIZ();
                    }
                    C1349730lEB c1349730lEB6 = this.LLILZIL;
                    if (c1349730lEB6 != null) {
                        CommentPageActionBarViewModel commentPageActionBarViewModel4 = this.LLILZLL;
                        if (commentPageActionBarViewModel4 != null) {
                            list4 = commentPageActionBarViewModel4.LLILZIL;
                        }
                        int currentItem2 = viewPager.getCurrentItem();
                        CommentContextSource commentContextSourceGL4 = GL();
                        if (commentContextSourceGL4 != null && (strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSourceGL4)) != null) {
                            str = strEnterMethod;
                        }
                        c1349730lEB6.LJFF(list4, -1, currentItem2, "split_screen", str, false, false);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        boolean z;
        IPageActionBarAbility iPageActionBarAbility;
        Boolean boolValueOf;
        Aweme aweme;
        Aweme aweme2;
        CommentListModel listModel;
        View view2;
        CommentCommonModel commonModel;
        super.onViewCreated(view, bundle);
        if ((C0CNZ.LIZLLL() & 2) > 0) {
            z = true;
        } else {
            z = false;
        }
        C19EG c19egLIZIZ = null;
        if ((!z || ((ArrayList) this.LLILLJJLI).size() > 1) && (iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPageActionBarAbility.class, null)) != null) {
            iPageActionBarAbility.I80(this.LLILZ);
        }
        final C1353060lJY c1353060lJY = this.LLJJJ;
        if (c1353060lJY == null) {
            c1353060lJY = null;
        }
        c1353060lJY.setCommentContainer(this.LLILZ);
        c1353060lJY.setEnableSwipeDown(false);
        c1353060lJY.setScrollableContainer(new InterfaceC1258040iqI() { // from class: X.0lEf
            @Override // X.InterfaceC1258040iqI
            public final View LJJLIIIJILLIZJL() {
                LandscapeCommentPageContainer landscapeCommentPageContainer = this.LL;
                C1345610l7X c1345610l7X = landscapeCommentPageContainer.LLILLL;
                if (c1345610l7X == null) {
                    return null;
                }
                ViewPager viewPager = landscapeCommentPageContainer.LLILZ;
                return c1345610l7X.LJJIL(viewPager != null ? viewPager.getCurrentItem() : 0);
            }
        });
        c1353060lJY.LLLLII.add(new InterfaceC1350270lF3() { // from class: X.0lEL
            @Override // X.InterfaceC1350270lF3
            public final void LIZ(C1350070lEj c1350070lEj) {
                List<InterfaceC1349750lED> list;
                String strEnterMethod;
                C1349730lEB c1349730lEB;
                List<InterfaceC1349750lED> list2;
                String splitContainerTag;
                List<InterfaceC1349750lED> list3;
                String strEnterMethod2;
                C1349730lEB c1349730lEB2;
                List<InterfaceC1349750lED> list4;
                int i = C1349990lEb.LIZ[c1350070lEj.LIZ.ordinal()];
                String str = "";
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            LandscapeCommentPageContainer landscapeCommentPageContainer = this.LIZ;
                            ViewPager viewPager = landscapeCommentPageContainer.LLILZ;
                            if (viewPager != null) {
                                C1349730lEB c1349730lEB3 = landscapeCommentPageContainer.LLILZIL;
                                if (c1349730lEB3 != null) {
                                    CommentContextSource commentContextSourceGL = landscapeCommentPageContainer.GL();
                                    CommentPageActionBarViewModel commentPageActionBarViewModel = landscapeCommentPageContainer.LLILZLL;
                                    if (commentPageActionBarViewModel != null) {
                                        list4 = commentPageActionBarViewModel.LLILZIL;
                                    } else {
                                        list4 = null;
                                    }
                                    c1349730lEB3.LJ(false, commentContextSourceGL, list4, landscapeCommentPageContainer);
                                }
                                C294190Bg1.LIZ.getClass();
                                if (C294190Bg1.LIZIZ() && (c1349730lEB2 = landscapeCommentPageContainer.LLILZIL) != null) {
                                    c1349730lEB2.LIZ();
                                }
                                C1349730lEB c1349730lEB4 = landscapeCommentPageContainer.LLILZIL;
                                if (c1349730lEB4 != null) {
                                    CommentPageActionBarViewModel commentPageActionBarViewModel2 = landscapeCommentPageContainer.LLILZLL;
                                    if (commentPageActionBarViewModel2 != null) {
                                        list3 = commentPageActionBarViewModel2.LLILZIL;
                                    } else {
                                        list3 = null;
                                    }
                                    int currentItem = viewPager.getCurrentItem();
                                    String str2 = c1350070lEj.LIZIZ;
                                    CommentContextSource commentContextSourceGL2 = landscapeCommentPageContainer.GL();
                                    if (commentContextSourceGL2 != null && (strEnterMethod2 = CommentContextSourceKt.enterMethod(commentContextSourceGL2)) != null) {
                                        str = strEnterMethod2;
                                    }
                                    c1349730lEB4.LJFF(list3, currentItem, -1, str2, str, false, false);
                                }
                            }
                            C1349800lEI c1349800lEI = this.LIZ.LL;
                            if (c1349800lEI != null && c1349800lEI.isSplitMode()) {
                                C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ();
                                C1349800lEI c1349800lEI2 = this.LIZ.LL;
                                if (c1349800lEI2 != null) {
                                    splitContainerTag = c1349800lEI2.getSplitContainerTag();
                                } else {
                                    splitContainerTag = null;
                                }
                                InterfaceC752360TfG interfaceC752360TfGLIZLLL = C0T45.LIZLLL(splitContainerTag);
                                if (interfaceC752360TfGLIZLLL != null) {
                                    interfaceC752360TfGLIZLLL.LJIILL();
                                }
                            }
                        }
                    } else {
                        C1349730lEB c1349730lEB5 = this.LIZ.LLILZIL;
                        if (c1349730lEB5 != null) {
                            c1349730lEB5.LIZJ();
                        }
                    }
                } else {
                    LandscapeCommentPageContainer landscapeCommentPageContainer2 = this.LIZ;
                    ViewPager viewPager2 = landscapeCommentPageContainer2.LLILZ;
                    if (viewPager2 != null) {
                        C1349730lEB c1349730lEB6 = landscapeCommentPageContainer2.LLILZIL;
                        if (c1349730lEB6 != null) {
                            CommentContextSource commentContextSourceGL3 = landscapeCommentPageContainer2.GL();
                            CommentPageActionBarViewModel commentPageActionBarViewModel3 = landscapeCommentPageContainer2.LLILZLL;
                            if (commentPageActionBarViewModel3 != null) {
                                list2 = commentPageActionBarViewModel3.LLILZIL;
                            } else {
                                list2 = null;
                            }
                            c1349730lEB6.LJ(true, commentContextSourceGL3, list2, landscapeCommentPageContainer2);
                        }
                        C294190Bg1.LIZ.getClass();
                        if (C294190Bg1.LIZIZ() && (c1349730lEB = landscapeCommentPageContainer2.LLILZIL) != null) {
                            c1349730lEB.LIZ();
                        }
                        C1349730lEB c1349730lEB7 = landscapeCommentPageContainer2.LLILZIL;
                        if (c1349730lEB7 != null) {
                            CommentPageActionBarViewModel commentPageActionBarViewModel4 = landscapeCommentPageContainer2.LLILZLL;
                            if (commentPageActionBarViewModel4 != null) {
                                list = commentPageActionBarViewModel4.LLILZIL;
                            } else {
                                list = null;
                            }
                            int currentItem2 = viewPager2.getCurrentItem();
                            String str3 = c1350070lEj.LIZIZ;
                            CommentContextSource commentContextSourceGL4 = landscapeCommentPageContainer2.GL();
                            if (commentContextSourceGL4 != null && (strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSourceGL4)) != null) {
                                str = strEnterMethod;
                            }
                            c1349730lEB7.LJFF(list, -1, currentItem2, str3, str, false, false);
                        }
                    }
                }
                ICommentFakeInputAbility iCommentFakeInputAbilityLIZJ = C1345760l7m.LIZJ(this.LIZ, C1558360qeg.LJ(c1353060lJY, null));
                if (iCommentFakeInputAbilityLIZJ != null) {
                    iCommentFakeInputAbilityLIZJ.Ua2(c1350070lEj);
                }
            }
        });
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        C0R7C c0r7cLLJJJJ = c19252910Tv.LIZLLL().LJIJI().LLJJJJ();
        getActivity();
        if (c0r7cLLJJJJ.LIZJ()) {
            c1353060lJY.setOnScrollStateChangedListener(new InterfaceC1350190lEv() { // from class: X.0lEe
                @Override // X.InterfaceC1350190lEv
                public final Boolean LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC1350190lEv
                public final void LIZ(int i, int i2) {
                    HandlerHook.viewPost(view, new ARunnableS8S0102000_21(this, i, i2, 1));
                }
            });
        }
        CommentContextSource commentContextSourceGL = GL();
        if (commentContextSourceGL != null && (commonModel = commentContextSourceGL.getCommonModel()) != null) {
            boolValueOf = Boolean.valueOf(commonModel.isPreCreate());
        } else {
            boolValueOf = null;
        }
        if (C1346420l8q.LIZJ(boolValueOf)) {
            c1353060lJY.LJFF(false);
        }
        C1349800lEI c1349800lEI = this.LL;
        if (c1349800lEI != null && c1349800lEI.isSplitMode()) {
            View view3 = this.LLJJJIL;
            if (view3 == null) {
                view3 = null;
            }
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            c19252910Tv.LIZLLL().LJIIIIZZ();
            layoutParams.width = C0T45.LIZJ();
            View view4 = this.LLJJJIL;
            if (view4 == null) {
                view2 = null;
                view4 = null;
            } else {
                view2 = view4;
            }
            int paddingStart = view4.getPaddingStart();
            View view5 = this.LLJJJIL;
            if (view5 == null) {
                view5 = null;
            }
            int paddingTop = view5.getPaddingTop();
            View view6 = this.LLJJJIL;
            if (view6 == null) {
                view6 = null;
            }
            view2.setPaddingRelative(paddingStart, paddingTop, 0, view6.getPaddingBottom());
            View view7 = this.LLJJJIL;
            if (view7 == null) {
                view7 = null;
            }
            C14K9.LJIJJ(view7, new C0TVI() { // from class: X.0lEg
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view8, C20246014Ju c20246014Ju) {
                    C1206770hVb.LIZLLL(c20246014Ju.LIZ(1).LIZIZ, view8);
                    return c20246014Ju;
                }
            });
            View view8 = this.LLJJJIL;
            if (view8 == null) {
                view8 = null;
            }
            C20097313kJ.LIZJ(view8);
        } else {
            int iIntValue = ((Number) C473380IhM.LIZ(getActivity()).getSecond()).intValue();
            View view9 = this.LLJJJIL;
            if (view9 == null) {
                view9 = null;
            }
            view9.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) + iIntValue;
        }
        CommentContextSource commentContextSourceGL2 = GL();
        if (commentContextSourceGL2 != null && (listModel = commentContextSourceGL2.getListModel()) != null) {
            listModel.setSessionId(C1346170l8R.LIZ());
        }
        C0R7C c0r7cLLJJJJ2 = c19252910Tv.LIZLLL().LJIJI().LLJJJJ();
        C19EG activity = getActivity();
        C1349800lEI c1349800lEI2 = this.LL;
        if (c1349800lEI2 != null) {
            aweme = c1349800lEI2.getAweme();
        } else {
            aweme = null;
        }
        if (c0r7cLLJJJJ2.LIZ(activity, C1616490sAR.LIZ(aweme))) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
            int iIntValue2 = ((Number) C473380IhM.LIZ(getActivity()).getSecond()).intValue();
            View view10 = this.LLJJJIL;
            if (view10 == null) {
                view10 = null;
            }
            view10.setPadding(0, 0, 0, 0);
            C0R7C c0r7cLLJJJJ3 = c19252910Tv.LIZLLL().LJIJI().LLJJJJ();
            int i = iLIZIZ + iIntValue2;
            Context context = getContext();
            View view11 = this.LLJJJIL;
            if (view11 == null) {
                view11 = null;
            }
            C1349800lEI c1349800lEI3 = this.LL;
            if (c1349800lEI3 != null) {
                aweme2 = c1349800lEI3.getAweme();
            } else {
                aweme2 = null;
            }
            c0r7cLLJJJJ3.LJIIJ(i, context, view11, C1616490sAR.LIZ(aweme2));
            C1353060lJY c1353060lJY2 = this.LLJJJ;
            if (c1353060lJY2 == null) {
                c1353060lJY2 = null;
            }
            C0R7C c0r7cLLJJJJ4 = c19252910Tv.LIZLLL().LJIJI().LLJJJJ();
            getContext();
            float fLJIIIIZZ = (float) c0r7cLLJJJJ4.LJIIIIZZ();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1353060lJY2);
            c1353060lJY2.setTranslationX(fLJIIIIZZ);
            if (getActivity() != null) {
                Context context2 = getContext();
                if (context2 != null) {
                    c19egLIZIZ = C1388190mED.LIZIZ(context2);
                }
                C343710Ddh.LIZ(c19egLIZIZ).wQ2(this);
            }
        }
        Qh0();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        CommentPerfMonitorUtil.LIZ.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1345390l7B c1345390l7B = CommentPerfMonitorUtil.LJI;
        c1345390l7B.LJFF = jCurrentTimeMillis;
        C1345380l7A c1345380l7A = CommentPerfMonitorUtil.LJII;
        c1345380l7A.LJFF = jCurrentTimeMillis;
        boolean z = C1354730lMF.LIZ;
        View viewLIZIZ = C21146717pB.LIZIZ(C1354730lMF.LIZIZ(requireContext()), R.layout.a2_, viewGroup, false);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        c1345390l7B.LJI = jCurrentTimeMillis2;
        c1345380l7A.LJI = jCurrentTimeMillis2;
        try {
            ViewTreeLifecycleOwner.set(viewLIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLIZIZ, this);
            viewLIZIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLIZIZ;
        }
    }

    @Override // X.InterfaceC1586360rNq
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        C19EG c19egLIZIZ;
        MainActivityScope mainActivityScopeLIZJ;
        InterfaceC665370Q7z interfaceC665370Q7z;
        MainPageBusinessAbility mainPageBusinessAbility;
        C0R7C c0r7cLLJJJJ = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLJJJJ();
        getActivity();
        if (c0r7cLLJJJJ.LIZJ()) {
            C1353060lJY c1353060lJY = this.LLJJJ;
            if (c1353060lJY == null) {
                c1353060lJY = null;
            }
            c1353060lJY.LJ("tablet main tab change");
            if (C296200BjG.LIZ()) {
                mainPageBusinessAbility = this.LLJL;
                if (mainPageBusinessAbility == null) {
                    synchronized (this) {
                        mainPageBusinessAbility = this.LLJL;
                        if (mainPageBusinessAbility == null) {
                            C0QSJ c0qsjLIZLLL = this.LLJLLL;
                            if (c0qsjLIZLLL == null) {
                                InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJLLIL;
                                if (interfaceC665370Q7zLJIIIZ == null) {
                                    interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                                    this.LLJLLIL = interfaceC665370Q7zLJIIIZ;
                                }
                                c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
                                this.LLJLLL = c0qsjLIZLLL;
                                if (c0qsjLIZLLL == null) {
                                    mainPageBusinessAbility = null;
                                }
                                this.LLJL = mainPageBusinessAbility;
                            }
                            mainPageBusinessAbility = (MainPageBusinessAbility) c0qsjLIZLLL.getAbility(MainPageBusinessAbility.class);
                            this.LLJL = mainPageBusinessAbility;
                        }
                    }
                }
            } else {
                Context context = getContext();
                if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ)) != null && (interfaceC665370Q7z = mainActivityScopeLIZJ.LL) != null) {
                    mainPageBusinessAbility = (MainPageBusinessAbility) C1558520qew.LIZ(interfaceC665370Q7z, MainPageBusinessAbility.class, null);
                } else {
                    return;
                }
            }
            if (mainPageBusinessAbility != null) {
                mainPageBusinessAbility.YA1(false, true, true, true, null, true, false, C1AV3.LIZ(1, "Social", null, "commentlist_land"));
            }
        }
    }
}
