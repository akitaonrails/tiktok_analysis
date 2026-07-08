package com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0BJM;
import X.C0CNZ;
import X.C0QQT;
import X.C0QSJ;
import X.C0R7C;
import X.C0T2X;
import X.C0T2Y;
import X.C0TVI;
import X.C0XAU;
import X.C0XQ7;
import X.C1220000hqw;
import X.C1339790ky9;
import X.C1339820kyC;
import X.C1342780l2y;
import X.C1344030l4z;
import X.C1345250l6x;
import X.C1345380l7A;
import X.C1345390l7B;
import X.C1345670l7d;
import X.C1345700l7g;
import X.C1345720l7i;
import X.C1345760l7m;
import X.C1346170l8R;
import X.C1346420l8q;
import X.C1347570lAh;
import X.C1349730lEB;
import X.C1349800lEI;
import X.C1349860lEO;
import X.C1349900lES;
import X.C1349910lET;
import X.C1350010lEd;
import X.C1350090lEl;
import X.C1350120lEo;
import X.C1350920lG6;
import X.C1351950lHl;
import X.C1353060lJY;
import X.C1354730lMF;
import X.C1356320lOo;
import X.C1356810lPb;
import X.C1357700lR2;
import X.C1360720lVu;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C1490190osj;
import X.C14EU;
import X.C14K9;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1591220rVg;
import X.C1616490sAR;
import X.C1685300txQ;
import X.C189200o6;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20593115i5;
import X.C211000rc;
import X.C21146717pB;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2252408s6;
import X.C288640BTa;
import X.C307000C1q;
import X.C338520DOw;
import X.C339190DRl;
import X.C419910GdJ;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C454140HrQ;
import X.C484220Iyq;
import X.C586540MzU;
import X.C622680Oba;
import X.C673150Qan;
import X.C682110QpF;
import X.C687700QyG;
import X.C690450R6l;
import X.C722580SWa;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C740740T3w;
import X.C786410Ut5;
import X.C844470XAv;
import X.C960203pA;
import X.EnumC2262571Dh9;
import X.InterfaceC1258040iqI;
import X.InterfaceC1350080lEk;
import X.InterfaceC1350190lEv;
import X.InterfaceC1350270lF3;
import X.InterfaceC1351090lGN;
import X.InterfaceC1356280lOk;
import X.InterfaceC1583770rJf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC679410Qkt;
import X.InterfaceC737790Swr;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS121S0100000_21;
import Y.ARunnableS7S0202000_21;
import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.comment.commentlist.util.CommentPageLoadTimer;
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentDoubleTapToLikeGuideFragment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardVMAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentEventModel;
import com.ss.android.ugc.aweme.comment.model.CommentListModel;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.commentv2.CommentSyncSharedVM;
import com.ss.android.ugc.aweme.commentv2.actionbar.AbsCommentPageTab;
import com.ss.android.ugc.aweme.commentv2.actionbar.CommentPageActionBarViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentFloatAdAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment;
import com.ss.android.ugc.aweme.commentv2.keyboard.inboxquickcomment.SingleKeyboardFragment;
import com.ss.android.ugc.aweme.commentv2.panel.CommentListPanelV2Provider;
import com.ss.android.ugc.aweme.commentv2.panel.CommerceAppReviewPanelProvider;
import com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol;
import com.ss.android.ugc.aweme.commentv2.panel.LikePanelProviderV2;
import com.ss.android.ugc.aweme.commentv2.panel.MixViewerPanelProviderV2;
import com.ss.android.ugc.aweme.commentv2.panel.ReviewPanelProvider;
import com.ss.android.ugc.aweme.commentv2.panel.ViewerPanelProviderV2;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.experiment.CommentStickerConsumptionSpecExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.entry.commenticon.communication.CommentRootFragmentScope;
import com.ss.android.ugc.aweme.service.proactive.IActiveLoginCommentService;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthPushAddNewScenes;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS138S0110000_21;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.AwS79S0500000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class DefaultCommentPageContainerFragment extends BaseCommentPageContainerFragment implements InterfaceC1351090lGN, InterfaceC1583770rJf, C0T2Y, InterfaceC737790Swr {
    public static final C1345670l7d LLLILZJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjE6e2EwJyghLCEnOCQrLGEwHELIOSJyghJiElISEpJmEXLSMtPCMnCyohJCo9PBUtLioQJys4KCY9LTcKOy40JSAiPQ==";
    public C0T2X LLJJJIL;
    public Aweme LLJJJJ;
    public C1353060lJY LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJLIL;
    public BPEAHandler LLJLILLLLZIIL;
    public C1350010lEd LLJLL;
    public final C01GW LLJLLIL;
    public C1349910lET LLJLLL;
    public final C722580SWa LLJZ;
    public boolean LLJZIJLIL;
    public View LLL;
    public final C01GW LLLF;
    public C1350120lEo LLLFF;
    public boolean LLLFFI;
    public TuxIconView LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public int LLLIIII;
    public volatile C0QQT LLLIIIIL;
    public IPageActionBarAbility LLLIIIL;
    public ICommentPageContainer LLLIIL;
    public C0QQT LLLIILIL;
    public InterfaceC665370Q7z LLLIL;
    public C0QSJ LLLILZ;
    public final DefaultCommentPageContainerFragment LLJJJ = this;
    public final C736950SvV LLJL = new C736950SvV(C13LE.LIZ(CommentSyncSharedVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(134), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DefaultCommentPageContainerFragment.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(DefaultCommentPageContainerFragment.class, "searchIconAbility", "getSearchIconAbility()Lcom/ss/android/ugc/aweme/search/entry/commenticon/communication/ShrinkVideoSearchIconAbility;", 0)};
        LLLILZJ = new C1345670l7d();
    }

    @Override // X.InterfaceC1351090lGN
    public final void Uj() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        super.bindAbility(obj, cls);
        if (cls == IPageActionBarAbility.class) {
            this.LLLIIIL = (IPageActionBarAbility) obj;
        } else if (cls == ICommentPageContainer.class) {
            this.LLLIIL = (ICommentPageContainer) obj;
        } else if (cls == C0QQT.class) {
            this.LLLIILIL = (C0QQT) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentRootFragmentScope.class, CommentRootFragmentScope.class});
    }

    @Override // X.InterfaceC1351090lGN
    public final void d6() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, X.C0QSJ
    public final Object getAbility(Class cls) {
        return cls == IPageActionBarAbility.class ? this.LLLIIIL : cls == ICommentPageContainer.class ? this.LLLIIL : cls == C0QQT.class ? this.LLLIILIL : super.getAbility(cls);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(CommentRootFragmentScope.class);
        arrayList.add(CommentRootFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(CommentRootFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        super.unbindAbility(obj, cls);
        if (cls == IPageActionBarAbility.class) {
            this.LLLIIIL = null;
        } else if (cls == ICommentPageContainer.class) {
            this.LLLIIL = null;
        } else if (cls == C0QQT.class) {
            this.LLLIILIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    public DefaultCommentPageContainerFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentPublishViewModel.class);
        this.LLJLIL = C452501pT.LIZIZ(new AwS79S0500000_19(this, c19719912DlLIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 823), AFwS259S0000000_21.get$arr$(388), (Function0) null, 16));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(225));
        this.LLJZ = new C722580SWa();
        this.LLLF = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(226));
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final boolean B9() {
        C1349910lET c1349910lET = this.LLJLLL;
        if (c1349910lET == null) {
            return false;
        }
        Iterator it2 = ((ArrayList) c1349910lET.LIZIZ).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC1350080lEk) it2.next()).isShowing()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final void Qh0() {
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        CommentCommonModel commonModel3;
        String str = null;
        if (this.LLJJJJLIIL) {
            this.LLJJJJLIIL = false;
            CommentPerfMonitorUtil.LIZ.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1345380l7A c1345380l7A = CommentPerfMonitorUtil.LJII;
            c1345380l7A.LIZJ = jCurrentTimeMillis;
            c1345380l7A.LJIILLIIL = jCurrentTimeMillis;
            c1345380l7A.LJIILL = jCurrentTimeMillis;
            CommentPerfMonitorUtil.LJIIIZ = true;
            CommentPerfMonitorUtil.MyHandler myHandler = CommentPerfMonitorUtil.LJIIIIZZ;
            myHandler.removeMessages(1);
            Message message = new Message();
            message.what = 1;
            myHandler.sendMessageDelayed(message, 200L);
            bS();
            C20593115i5.LIZ.getClass();
            if (C20593115i5.LJIILIIL() && !C20593115i5.LJIIIIZZ(null)) {
                C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                C0R7C c0r7cLLJJJJ = c19252910Tv.LIZLLL().LJIJI().LLJJJJ();
                View view = this.LLJJL;
                if (view == null) {
                    view = null;
                }
                c0r7cLLJJJJ.LJ(getResources().getConfiguration().orientation, view instanceof ViewGroup ? (ViewGroup) view : null, C1616490sAR.LIZ(CommentContextSourceKt.aweme(GL())));
                c19252910Tv.LIZLLL().LJIIZILJ().LIZJ(getActivity(), this.LLILZ, null, C1616490sAR.LIZ(CommentContextSourceKt.aweme(GL())), getResources().getConfiguration().orientation);
            }
            C1353060lJY c1353060lJY = this.LLJJJJJIL;
            if (c1353060lJY != null) {
                c1353060lJY.LIZJ("", true, true);
                C0XAU.LIZ(new ARunnableS113S0100000_13(0, c1353060lJY, 249));
            }
            dS("preBindDone");
            C1353060lJY c1353060lJY2 = this.LLJJJJJIL;
            if (c1353060lJY2 != null) {
                HandlerHook.viewPost(c1353060lJY2, new Runnable() { // from class: X.0l7J
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("DefaultCommentPageContainerFragment@bdd4.showCommentPage$1");
                        try {
                            CommentPerfMonitorUtil.LIZ.getClass();
                            if (CommentPerfMonitorUtil.LJIIIZ) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                C1345380l7A c1345380l7A2 = CommentPerfMonitorUtil.LJII;
                                c1345380l7A2.LJIILLIIL = jCurrentTimeMillis2;
                                c1345380l7A2.LJIILL = jCurrentTimeMillis2;
                                CommentPerfMonitorUtil.MyHandler myHandler2 = CommentPerfMonitorUtil.LJIIIIZZ;
                                myHandler2.removeMessages(1);
                                Message message2 = new Message();
                                message2.what = 1;
                                myHandler2.sendMessageDelayed(message2, 200L);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("DefaultCommentPageContainerFragment@bdd4.showCommentPage$1");
                    }
                });
                return;
            }
            return;
        }
        C1349800lEI c1349800lEI = this.LL;
        if (c1349800lEI != null && c1349800lEI.isPreBind()) {
            this.LLJJJJLIIL = true;
            C1353060lJY c1353060lJY3 = this.LLJJJJJIL;
            if (c1353060lJY3 != null) {
                C786410Ut5.z(c1353060lJY3, 4);
                return;
            }
            return;
        }
        CommentContextSource commentContextSourceGL = GL();
        if (C1346420l8q.LIZJ((commentContextSourceGL == null || (commonModel3 = commentContextSourceGL.getCommonModel()) == null) ? null : Boolean.valueOf(commonModel3.isPreCreate()))) {
            CommentContextSource commentContextSourceGL2 = GL();
            if (commentContextSourceGL2 != null && (commonModel2 = commentContextSourceGL2.getCommonModel()) != null) {
                str = commonModel2.eventType;
            }
            C1350920lG6.LJJIIJ(0, "pre_create_in_scp", str);
            return;
        }
        bS();
        C20593115i5.LIZ.getClass();
        if (C20593115i5.LJIILIIL() && !C20593115i5.LJIIIIZZ(null)) {
            C19252910Tv c19252910Tv2 = C19252910Tv.LIZIZ;
            C0R7C c0r7cLLJJJJ2 = c19252910Tv2.LIZLLL().LJIJI().LLJJJJ();
            View view2 = this.LLJJL;
            if (view2 == null) {
                view2 = null;
            }
            c0r7cLLJJJJ2.LJ(getResources().getConfiguration().orientation, view2 instanceof ViewGroup ? (ViewGroup) view2 : null, C1616490sAR.LIZ(CommentContextSourceKt.aweme(GL())));
            c19252910Tv2.LIZLLL().LJIIZILJ().LIZJ(getActivity(), this.LLILZ, null, C1616490sAR.LIZ(CommentContextSourceKt.aweme(GL())), getResources().getConfiguration().orientation);
        }
        if (this.LLJJJJJIL == null) {
            CommentContextSource commentContextSourceGL3 = GL();
            if (commentContextSourceGL3 != null && (commonModel = commentContextSourceGL3.getCommonModel()) != null) {
                str = commonModel.eventType;
            }
            C1350920lG6.LJJIIJ(0, "null_comment_layout", str);
        }
        C1353060lJY c1353060lJY4 = this.LLJJJJJIL;
        if (c1353060lJY4 != null) {
            c1353060lJY4.LIZJ("", true, true);
            C0XAU.LIZ(new ARunnableS113S0100000_13(0, c1353060lJY4, 249));
        }
        dS("normalShow");
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment
    public final void RR() {
        IPanelProviderProtocol iPanelProviderProtocolLJJLIIIJILLIZJL;
        this.LLIZ.add(new CommentListPanelV2Provider());
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean aS() {
        /*
            r8 = this;
            X.0lEI r0 = r8.LL
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L79
            X.0lES r0 = r0.getStoryCommentPageParam()
            if (r0 == 0) goto L79
            boolean r0 = r0.needUseSpecifiedCommentHeight()
            if (r0 != r6) goto L79
            X.0lEI r0 = r8.LL
            if (r0 == 0) goto L78
            X.0lES r0 = r0.getStoryCommentPageParam()
            if (r0 == 0) goto L78
            java.lang.Integer r0 = r0.specifiedCommentHeightPx
            if (r0 == 0) goto L78
            int r5 = r0.intValue()
            r0 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.view.View r0 = r8.getView()
            if (r0 != 0) goto L31
            return r7
        L31:
            int r0 = X.C0HD5.LIZ(r0, r1)
            int r5 = r5 - r0
            androidx.viewpager.widget.ViewPager r0 = r8.LLILZ
            r4 = 0
            if (r0 == 0) goto L76
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
        L3f:
            boolean r0 = r3 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L74
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
        L45:
            android.view.View r1 = r8.getView()
            if (r1 == 0) goto L71
            r0 = 2131380533(0x7f0a4935, float:1.8381358E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 == 0) goto L72
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
        L5a:
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L61
            r4 = r1
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
        L61:
            if (r3 == 0) goto L70
            if (r4 == 0) goto L70
            r4.height = r5
            r3.height = r7
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.weight = r0
            X.C786410Ut5.d6(r2, r4)
        L70:
            return r6
        L71:
            r2 = r4
        L72:
            r1 = r4
            goto L5a
        L74:
            r3 = r4
            goto L45
        L76:
            r3 = r4
            goto L3f
        L78:
            return r7
        L79:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment.aS():boolean");
    }

    public final void bS() {
        C1353060lJY c1353060lJY = this.LLJJJJJIL;
        if (c1353060lJY != null) {
            View view = this.LLJJL;
            if (view == null) {
                view = null;
            }
            C1349910lET c1349910lET = this.LLJLLL;
            if (c1349910lET != null) {
                Integer numValueOf = Integer.valueOf(view.getWidth());
                Integer numValueOf2 = Integer.valueOf(view.getHeight());
                Integer numValueOf3 = Integer.valueOf(c1353060lJY.getWidth());
                Integer numValueOf4 = Integer.valueOf(c1353060lJY.getHeight());
                Iterator it2 = ((ArrayList) c1349910lET.LIZIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1350080lEk) it2.next()).LIZ(numValueOf, numValueOf2, numValueOf3, numValueOf4);
                }
            }
        }
    }

    public final CommentContextSource gS() {
        C722580SWa c722580SWa = this.LLJZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        return c722580SWa.LIZ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0QQT hS() {
        /*
            r4 = this;
            X.0QQT r0 = r4.LLLIIIIL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0QQT r0 = r4.LLLIIIIL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLLILZ     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLLIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.search.entry.commenticon.communication.CommentRootFragmentScope> r1 = com.ss.android.ugc.aweme.search.entry.commenticon.communication.CommentRootFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLLILZ = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0QQT> r0 = X.C0QQT.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0QQT r0 = (X.C0QQT) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLLIIIIL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment.hS():X.0QQT");
    }

    public final boolean kS() {
        C1349730lEB c1349730lEB = this.LLILZIL;
        int i = c1349730lEB != null ? c1349730lEB.LJI : 0;
        return i >= 0 && i < this.LLILLJJLI.size() && ((AbsCommentPageTab) ListProtector.get(this.LLILLJJLI, i)).LIZ().LIZIZ == 1;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final void pX() {
        String str;
        CommentCommonModel commonModel;
        String str2;
        Aweme aweme;
        User author;
        int i = C2187451AjH.LIZ;
        CommentContextSource commentContextSourceGL = GL();
        String str3 = "";
        if (commentContextSourceGL == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceGL)) == null || (author = aweme.getAuthor()) == null || author.getAvatarThumb() == null || author.getAvatarThumb().getUrlList() == null || !(!author.getAvatarThumb().getUrlList().isEmpty()) || (str = (String) ListProtector.get(author.getAvatarThumb().getUrlList(), 0)) == null) {
            str = "";
        }
        if (!ChannelsAuthPushAddNewScenes.INSTANCE.added()) {
            C1350010lEd c1350010lEd = this.LLJLL;
            if (c1350010lEd != null) {
                c1350010lEd.LJ = true;
                c1350010lEd.LJFF = str;
                return;
            }
            return;
        }
        C211000rc.LIZ("[Push]");
        UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("like_finish_comment");
        unifiedAuthPopupConfigLIZJ.setSceneId("like_finish_comment");
        CommentContextSource commentContextSourceGL2 = GL();
        if (commentContextSourceGL2 != null && (commonModel = commentContextSourceGL2.getCommonModel()) != null && (str2 = commonModel.enterFrom) != null) {
            str3 = str2;
        }
        unifiedAuthPopupConfigLIZJ.setEnterFrom(str3);
        unifiedAuthPopupConfigLIZJ.setEnterMethod("exit_comment");
        unifiedAuthPopupConfigLIZJ.setTrigger("comment");
        unifiedAuthPopupConfigLIZJ.setAvatar(str);
        unifiedAuthPopupConfigLIZJ.setSysPage("like_finish_comment");
        List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
        if (list != null && (true ^ list.isEmpty())) {
            ListProtector.get(list, 0);
        }
        Context context = getContext();
        if (context != null) {
            ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(context, null, unifiedAuthPopupConfigLIZJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final int zF() {
        View view = this.LLJJL;
        if (view == null) {
            view = null;
        }
        return view.getMeasuredHeight();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJJJJZI() {
        View view;
        super.LJJJJZI();
        if (isViewValid()) {
            try {
                C19EG activity = getActivity();
                if (activity != null) {
                    if (C960203pA.LIZIZ(activity)) {
                        C682110QpF.LIZ(activity, getContext());
                        return;
                    }
                    View view2 = getView();
                    if (view2 == null || view2.getParent() == null || (view = getView()) == null) {
                        return;
                    }
                    HandlerHook.viewPost(view, new ARunnableS121S0100000_21(activity, 63));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJLLLLLL() {
        CommentCommonModel commonModel;
        super.LJLLLLLL();
        CommentPerfMonitorUtil.LIZ.getClass();
        CommentPerfMonitorUtil.LJIIIIZZ();
        if (((Boolean) C307000C1q.LIZIZ.getValue()).booleanValue()) {
            C1490190osj c1490190osj = C1490190osj.LIZIZ;
            EnumC2262571Dh9 enumC2262571Dh9 = EnumC2262571Dh9.BIZ_COMMENT_CONSUME;
            c1490190osj.LIZJ(enumC2262571Dh9);
            c1490190osj.LIZLLL(enumC2262571Dh9);
        }
        if (isViewValid()) {
            try {
                C19EG activity = getActivity();
                if (activity != null) {
                    CommentContextSource commentContextSourceGS = gS();
                    if (commentContextSourceGS == null || (commonModel = commentContextSourceGS.getCommonModel()) == null || !commonModel.navigationBarAutoColorOnHide || C960203pA.LIZIZ(activity)) {
                        C1360720lVu.LIZ(activity);
                    } else {
                        C1360720lVu.LIZIZ(activity);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1350010lEd c1350010lEd = this.LLJLL;
            if (c1350010lEd != null) {
                C2252408s6.LJIIIZ(new AwS138S0110000_21(c1350010lEd, true, 5));
            }
            if (C1339820kyC.LIZ()) {
                C1345250l6x c1345250l6x = C1345250l6x.LIZ;
                C19EG activity2 = getActivity();
                CommentContextSource commentContextSourceGL = GL();
                Aweme aweme = commentContextSourceGL != null ? CommentContextSourceKt.aweme(commentContextSourceGL) : null;
                c1345250l6x.getClass();
                C1345250l6x.LIZIZ(activity2, "disappear", aweme);
            }
        }
    }

    public final void cS() {
        CommentCommonModel commonModel;
        Aweme aweme;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        CommentContextSource commentContextSourceGS = gS();
        if (((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ((commentContextSourceGS == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceGS)) == null) ? null : AwemeExtKt.getAuthorUid(aweme)) && !CommentContextSourceKt.isFromTitlePanel(gS())) {
            CommentContextSource commentContextSourceGS2 = gS();
            if (C1346420l8q.LIZJ((commentContextSourceGS2 == null || (commonModel = commentContextSourceGS2.getCommonModel()) == null) ? null : Boolean.valueOf(commonModel.forceHideBatchManagementView))) {
                return;
            }
            C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 118), 3);
        }
    }

    @Override // X.InterfaceC1351090lGN
    public final boolean isShowing() {
        C1353060lJY c1353060lJY;
        C1353060lJY c1353060lJY2;
        if (isVisible() && (c1353060lJY = this.LLJJJJJIL) != null && c1353060lJY.LJIIIIZZ()) {
            return !C0BJM.LIZ() || ((c1353060lJY2 = this.LLJJJJJIL) != null && c1353060lJY2.getVisibility() == 0);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final boolean l91() {
        C1353060lJY c1353060lJY;
        C1353060lJY c1353060lJY2;
        if (isVisible() && (c1353060lJY = this.LLJJJJJIL) != null && c1353060lJY.LJIIIIZZ()) {
            return !C0BJM.LIZ() || ((c1353060lJY2 = this.LLJJJJJIL) != null && c1353060lJY2.getVisibility() == 0);
        }
        return false;
    }

    public final Context mS() {
        Context context;
        View view = getView();
        return (view == null || (context = view.getContext()) == null) ? getContext() : context;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nS() {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment.nS():void");
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C19EG activity;
        String aid;
        super.onDestroy();
        this.LLJJJJLIIL = false;
        Aweme aweme = this.LLJJJJ;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            C1350920lG6.LIZ.LJI(aid);
        }
        C1349910lET c1349910lET = this.LLJLLL;
        if (c1349910lET != null) {
            Iterator it2 = ((ArrayList) c1349910lET.LIZIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1350080lEk) it2.next()).onRelease();
            }
            ((ArrayList) c1349910lET.LIZIZ).clear();
        }
        this.LLJLLL = null;
        if (this.LLJJJIL != null && (activity = getActivity()) != null) {
            C740740T3w.LJIIIZ(activity, this.LLJJJIL);
            this.LLJJJIL = null;
        }
        C622680Oba.LIZLLL(this);
        Hox.LLJILJIL.LIZ(requireActivity()).OQ2(this);
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        CommentPageLoadTimer.LIZJ = null;
        CommentPageLoadTimer.LIZLLL = null;
        C1353060lJY c1353060lJY = this.LLJJJJJIL;
        if (c1353060lJY != null) {
            c1353060lJY.LLLLII.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C1349730lEB c1349730lEB;
        super.onPause();
        if (isShowing() && (c1349730lEB = this.LLILZIL) != null) {
            c1349730lEB.LIZLLL(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C1349730lEB c1349730lEB;
        super.onResume();
        if (isShowing() && (c1349730lEB = this.LLILZIL) != null) {
            c1349730lEB.LIZLLL(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility
    public final boolean Ex2() {
        return this.LLJZIJLIL;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final void Kb1(String str) {
        C1349910lET c1349910lET = this.LLJLLL;
        if (c1349910lET != null) {
            c1349910lET.LIZIZ("auto_close_comment_panel");
        }
        ((IActiveLoginCommentService) this.LLJLLIL.getValue()).LIZ();
        C1353060lJY c1353060lJY = this.LLJJJJJIL;
        if (c1353060lJY != null) {
            c1353060lJY.LJ(str);
        }
    }

    @Override // X.InterfaceC1351090lGN
    public final void LO(Comment comment) {
        ((CommentSyncSharedVM) this.LLJL.getValue()).vQ2(new C1342780l2y(2, C1345700l7g.LJIJ(2, comment, false), null));
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment
    public final void MR(boolean z) {
        C1349910lET c1349910lET = this.LLJLLL;
        if (c1349910lET != null) {
            c1349910lET.LIZIZ("auto_close_comment_panel");
        }
        if (CommentStickerConsumptionSpecExp.LIZ()) {
            C454140HrQ.LIZJ(getContext());
        }
        ((IActiveLoginCommentService) this.LLJLLIL.getValue()).LIZ();
        C1353060lJY c1353060lJY = this.LLJJJJJIL;
        if (c1353060lJY != null) {
            c1353060lJY.LJFF(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment
    public final void NR(View view) {
        int i;
        C1349900lES storyCommentPageParam;
        C1349900lES storyCommentPageParam2;
        this.LLJJJJJIL = (C1353060lJY) view.findViewById(R.id.trr);
        view.findViewById(R.id.wya);
        this.LLJJL = view.findViewById(R.id.i4g);
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.nk6);
        View view2 = this.LLJJL;
        if (view2 == null) {
            view2 = null;
        }
        if (C1347570lAh.LIZIZ()) {
            i = R.drawable.ae_;
        } else {
            i = R.drawable.aee;
        }
        view2.setBackgroundResource(i);
        boolean z = false;
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 119), 3);
        C1349800lEI c1349800lEI = this.LL;
        if (c1349800lEI == null || (storyCommentPageParam2 = c1349800lEI.getStoryCommentPageParam()) == null || !storyCommentPageParam2.useStoryCommentStyle) {
            C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 529), 3);
        }
        cS();
        iS(view);
        C1349800lEI c1349800lEI2 = this.LL;
        if (c1349800lEI2 != null && (storyCommentPageParam = c1349800lEI2.getStoryCommentPageParam()) != null && storyCommentPageParam.useStoryCommentStyle) {
            z = true;
        }
        View viewFindViewById = view.findViewById(R.id.b90);
        if (viewFindViewById != null) {
            if (z) {
                C339190DRl.LIZLLL(viewFindViewById);
            } else {
                C339190DRl.LIZIZ(viewFindViewById);
            }
        }
        aS();
        if (CommentContextSourceKt.isFromTitlePanel(GL())) {
            Wi1(this.LLLIIII, this.LLLII);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment
    public final void VR(int i) {
        oS(i);
    }

    @Override // X.C0T2Y
    public final void Y3(Aweme aweme) {
        String aid;
        Aweme aweme2 = this.LLJJJJ;
        String aid2 = null;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        this.LLJJJJ = aweme;
        if (aid != null && aid.length() != 0) {
            if (aweme != null) {
                aid2 = aweme.getAid();
            }
            if (!Intrinsics.LJFF(aid, aid2)) {
                C1350920lG6.LIZ.LJI(aid);
            }
        }
        this.LLJJJJLIIL = false;
        CommentPerfMonitorUtil.LIZ.getClass();
        CommentPerfMonitorUtil.LJIIIIZZ();
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentRootFragmentScope.class}).unbindAbility(this.LLJJJ, ICommentPageContainer.class);
    }

    public final void dS(String str) {
        C1353060lJY c1353060lJY;
        if (C0BJM.LIZ() && (c1353060lJY = this.LLJJJJJIL) != null && c1353060lJY.getVisibility() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ensurePanelVisibleAfterShow(");
            sbLIZ.append(str);
            sbLIZ.append("): force VISIBLE, was=");
            sbLIZ.append(c1353060lJY.getVisibility());
            C1344030l4z.LIZJ("default_comment_page", C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.z(c1353060lJY, 0);
        }
    }

    @Override // X.InterfaceC1351090lGN
    public final void ei(Comment comment) {
        if (comment == null) {
            return;
        }
        ((CommentSyncSharedVM) this.LLJL.getValue()).vQ2(new C1342780l2y(1, C1345700l7g.LJIJ(1, comment, false), null));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void iS(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment.iS(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility
    public final void lK(boolean z) {
        IPageActionBarAbility iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPageActionBarAbility.class, null);
        if (iPageActionBarAbility == null) {
            this.LLJZIJLIL = true;
        } else {
            iPageActionBarAbility.Q52(z);
        }
    }

    public final void oS(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryOpenSwipeToRight2Close ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (i >= ((ArrayList) this.LLILLJJLI).size()) {
            return;
        }
        int i2 = ((AbsCommentPageTab) ListProtector.get(this.LLILLJJLI, i)).LIZ().LIZIZ;
        C1353060lJY c1353060lJY = this.LLJJJJJIL;
        if (c1353060lJY != null) {
            boolean z = true;
            if (i2 != 1 || i != 0) {
                z = false;
            }
            c1353060lJY.setEnableSwipeRightToClose(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConfigurationChanged(android.content.res.Configuration r9) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment.onConfigurationChanged(android.content.res.Configuration):void");
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0lEM] */
    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C1349800lEI c1349800lEI;
        String enterFrom;
        C687700QyG.LJI(this);
        super.onCreate(bundle);
        C622680Oba.LIZJ(this);
        Hox.LLJILJIL.LIZ(requireActivity()).vQ2(this);
        this.LLJLILLLLZIIL = new BPEAHandler();
        C1350010lEd c1350010lEd = new C1350010lEd(requireActivity());
        this.LLJLL = c1350010lEd;
        c1350010lEd.LIZJ = this.LLJLILLLLZIIL;
        if (C1591220rVg.LIZLLL()) {
            C1350010lEd c1350010lEd2 = this.LLJLL;
            if (c1350010lEd2 != null) {
                C1349800lEI c1349800lEI2 = this.LL;
                if ((c1349800lEI2 == null || (enterFrom = c1349800lEI2.getEventType()) == null) && ((c1349800lEI = this.LL) == null || (enterFrom = c1349800lEI.getEnterFrom()) == null)) {
                    enterFrom = "";
                }
                c1350010lEd2.LJI = enterFrom;
            }
        } else {
            C1350010lEd c1350010lEd3 = this.LLJLL;
            if (c1350010lEd3 != null) {
                c1350010lEd3.LIZLLL = this.LL;
            }
        }
        this.LLJLLL = new C1349910lET(new InterfaceC1356280lOk() { // from class: X.0lEM
            @Override // X.InterfaceC1356280lOk
            public final boolean LIZ() {
                C1349800lEI c1349800lEI3 = this.LIZ.LL;
                Aweme aweme = c1349800lEI3 != null ? c1349800lEI3.getAweme() : null;
                return aweme != null && C1347740lAy.LIZ(aweme, false);
            }

            @Override // X.InterfaceC1356280lOk
            public final C1353060lJY LIZIZ() {
                return this.LIZ.LLJJJJJIL;
            }

            @Override // X.InterfaceC1356280lOk
            public final void LIZJ() {
                this.LIZ.bS();
            }

            @Override // X.InterfaceC1356280lOk
            public final C1349800lEI LJ() {
                return this.LIZ.LL;
            }

            @Override // X.InterfaceC1356280lOk
            public final Integer LJI() {
                View viewFindViewById;
                View view = this.LIZ.getView();
                return Integer.valueOf((view == null || (viewFindViewById = view.findViewById(R.id.hkl)) == null) ? 0 : viewFindViewById.getHeight());
            }

            @Override // X.InterfaceC1356280lOk
            public final boolean isShowing() {
                DefaultCommentPageContainerFragment defaultCommentPageContainerFragment = this.LIZ;
                return defaultCommentPageContainerFragment.isShowing() && defaultCommentPageContainerFragment.kS();
            }

            @Override // X.InterfaceC1356280lOk
            public final void LIZLLL(Comment comment) {
                if (comment == null) {
                    return;
                }
                ICommentListVMAbility iCommentListVMAbilityLJ = C1345760l7m.LJ(this.LIZ, C1558360qeg.LJFF(this.LIZ, null));
                if (iCommentListVMAbilityLJ != null) {
                    iCommentListVMAbilityLJ.MS0(comment);
                }
            }

            @Override // X.InterfaceC1356280lOk
            public final void LJFF(Integer num, String str) {
                Context context;
                ICommentListVMAbility iCommentListVMAbilityLJ;
                ICommentFakeInputAbility iCommentFakeInputAbilityLIZJ;
                ICommentFakeInputAbility iCommentFakeInputAbilityLIZJ2;
                DefaultCommentPageContainerFragment defaultCommentPageContainerFragment = this.LIZ;
                int iIntValue = num.intValue();
                if (iIntValue == EnumC1349940lEW.CLICK_RAISE_KEYBOARD.getActionType()) {
                    if (defaultCommentPageContainerFragment.isShowing() && defaultCommentPageContainerFragment.kS() && (iCommentFakeInputAbilityLIZJ2 = C1345760l7m.LIZJ(defaultCommentPageContainerFragment, C1558360qeg.LJFF(defaultCommentPageContainerFragment, null))) != null) {
                        iCommentFakeInputAbilityLIZJ2.V8(null, null);
                        return;
                    }
                    return;
                }
                if (iIntValue == EnumC1349940lEW.CLICK_IMAGE_COMMENT.getActionType()) {
                    if (!defaultCommentPageContainerFragment.isShowing() || !defaultCommentPageContainerFragment.kS() || (iCommentFakeInputAbilityLIZJ = C1345760l7m.LIZJ(defaultCommentPageContainerFragment, C1558360qeg.LJFF(defaultCommentPageContainerFragment, null))) == null) {
                        return;
                    }
                    iCommentFakeInputAbilityLIZJ.OD0();
                    return;
                }
                if (iIntValue != EnumC1349940lEW.CLICK_REPLY.getActionType() || (context = defaultCommentPageContainerFragment.getContext()) == null || str == null || (iCommentListVMAbilityLJ = C1345760l7m.LJ(defaultCommentPageContainerFragment, C1558360qeg.LJFF(defaultCommentPageContainerFragment, null))) == null) {
                    return;
                }
                iCommentListVMAbilityLJ.AL(context, str);
            }
        });
    }

    @C14EU
    public final void onEvent(C1356810lPb c1356810lPb) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZI;
        SingleKeyboardFragment singleKeyboardFragment;
        Context context = getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI("single_keyboard_input")) != null && (fragmentLJJJJZI instanceof SingleKeyboardFragment) && (singleKeyboardFragment = (SingleKeyboardFragment) fragmentLJJJJZI) != null && singleKeyboardFragment.PR()) {
            singleKeyboardFragment.yQ(false);
        }
        C1345670l7d c1345670l7d = LLLILZJ;
        Context context2 = getContext();
        c1345670l7d.getClass();
        DefaultCommentPageContainerFragment defaultCommentPageContainerFragmentLIZIZ = C1345670l7d.LIZIZ(context2);
        if (defaultCommentPageContainerFragmentLIZIZ != null) {
            defaultCommentPageContainerFragmentLIZIZ.MR(defaultCommentPageContainerFragmentLIZIZ.isShowing());
        }
        CommentPublishViewModel commentPublishViewModel = (CommentPublishViewModel) this.LLJLIL.getValue();
        if (commentPublishViewModel.LLJJ != null && commentPublishViewModel.LLJIJIL != null) {
            CommentPublishViewModel.IQ2(commentPublishViewModel, commentPublishViewModel.LLJI, 0, 6);
            TuxSheet tuxSheet = commentPublishViewModel.LLJJ;
            if (tuxSheet != null) {
                tuxSheet.dismiss();
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        JSONObject jSONObjectOptJSONObject;
        String strOptString = c484220Iyq.LIZ.optString("eventName");
        if (strOptString == null || (jSONObjectOptJSONObject = c484220Iyq.LIZ.optJSONObject("data")) == null) {
            return;
        }
        if (TextUtils.equals(strOptString, "commentReportSuccess")) {
            ComplianceServiceProvider.LJIJJ().LJIJJLI(jSONObjectOptJSONObject);
        } else {
            if (!TextUtils.equals(strOptString, "commentBatchReportResult")) {
                return;
            }
            ComplianceServiceProvider.LJIJJ().LJIILL(jSONObjectOptJSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[DONT_GENERATE] */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPreloadSuccessEvent(X.C034V r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLJJJJ
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = r8.LIZ
            java.lang.String r0 = r0.getAid()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L12
            return
        L12:
            X.19EG r3 = r7.getActivity()
            if (r3 != 0) goto L19
            return
        L19:
            X.0lG6 r6 = X.C1350920lG6.LIZ
            java.lang.String r2 = r8.LIZ
            monitor-enter(r6)
            r5 = 0
            r4 = 1
            if (r2 == 0) goto L5f
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5f
            java.util.LinkedHashMap<java.lang.String, kotlin.Unit> r1 = X.C1350920lG6.LIZJ     // Catch: java.lang.Throwable -> L5c
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L5c
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L5c
        L2f:
            java.util.LinkedHashMap<java.lang.String, kotlin.Unit> r2 = X.C1350920lG6.LIZJ     // Catch: java.lang.Throwable -> L5c
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L5c
            r0 = 8
            if (r1 <= r0) goto L61
            java.util.Set r0 = r2.entrySet()     // Catch: java.lang.Throwable -> L5c
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L61
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L5c
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L5c
            r2.remove()     // Catch: java.lang.Throwable -> L5c
            java.util.LinkedHashMap<java.lang.String, java.util.List<X.0lEP>> r0 = X.C1350920lG6.LIZLLL     // Catch: java.lang.Throwable -> L5c
            r0.remove(r1)     // Catch: java.lang.Throwable -> L5c
            goto L2f
        L5c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L5f:
            monitor-exit(r6)
            goto L62
        L61:
            monitor-exit(r6)
        L62:
            X.0lEI r2 = new X.0lEI
            java.lang.String r0 = r8.LIZ
            r2.<init>(r0)
            java.lang.String r0 = r8.LIZLLL
            r2.setEventType(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLJJJJ
            if (r0 == 0) goto Lc0
            boolean r0 = r0.isCmtSwt()
            if (r0 == 0) goto Lc0
            r0 = 0
        L79:
            r2.setEnableComment(r0)
            X.0Kfs r0 = com.ss.android.ugc.aweme.comment.services.CommentService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.comment.services.CommentService r1 = X.C523420Kfs.LIZ()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLJJJJ
            boolean r0 = r1.LJIILLIIL(r0)
            r2.setCommentClose(r0)
            com.ss.android.ugc.aweme.comment.services.CommentService r1 = X.C523420Kfs.LIZ()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLJJJJ
            boolean r0 = r1.LJIILLIIL(r0)
            if (r0 == 0) goto Lbe
            com.ss.android.ugc.aweme.comment.services.CommentService r1 = X.C523420Kfs.LIZ()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLJJJJ
            boolean r0 = r1.LJJIJIIJIL(r0)
            if (r0 != 0) goto Lbe
            r0 = 1
        La7:
            r2.setCommentLimited(r0)
            r2.setPreBind(r4)
            r2.setPreBind(r4)
            r7.LLJJJJLIIL = r5
            X.0l7d r0 = com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment.LLLILZJ
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.LLJJJJ
            r0.getClass()
            r0 = 0
            X.C1345670l7d.LJ(r3, r0, r1, r2)
            return
        Lbe:
            r0 = 0
            goto La7
        Lc0:
            r0 = 1
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment.onPreloadSuccessEvent(X.034V):void");
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentRootFragmentScope.class}).bindAbility(this.LLJJJ, ICommentPageContainer.class);
    }

    @Override // X.InterfaceC1351090lGN
    public final void vz(Comment comment) {
        if (comment == null) {
            return;
        }
        ((CommentSyncSharedVM) this.LLJL.getValue()).vQ2(new C1342780l2y(3, C1345700l7g.LJIJ(3, comment, false), null));
    }

    @C14EU
    public final void onEvent(C586540MzU c586540MzU) {
        if (c586540MzU == null) {
            return;
        }
        if (c586540MzU.LIZ == 1) {
            Kb1("");
        } else {
            if (!this.LLLI) {
                return;
            }
            this.LLLI = false;
            Qh0();
        }
    }

    @C14EU
    public final void onEvent(C690450R6l c690450R6l) {
        this.LLLI = isShowing();
        MR(true);
    }

    @Override // X.InterfaceC1583770rJf
    public final void A4(String str, String str2) {
        C1350010lEd c1350010lEd = this.LLJLL;
        if (c1350010lEd != null) {
            Handler handler = c1350010lEd.LIZJ;
            if (handler != null) {
                handler.removeCallbacks(c1350010lEd.LJII);
            }
            c1350010lEd.LIZIZ = false;
            c1350010lEd.LJ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final void Qg2(Aweme aweme, AwS565S0100000_21 awS565S0100000_21) {
        C19EG activity;
        CommentDoubleTapToLikeGuideFragment commentDoubleTapToLikeGuideFragment;
        if (isShowing()) {
            IKeyboardVMAbility iKeyboardVMAbilityLJIIIIZZ = C1345760l7m.LJIIIIZZ(this, C1558360qeg.LJFF(this, null));
            if (iKeyboardVMAbilityLJIIIIZZ != null && iKeyboardVMAbilityLJIIIIZZ.jc2()) {
                return;
            }
            awS565S0100000_21.invoke();
            ICommentFloatAdAbility iCommentFloatAdAbility = (ICommentFloatAdAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ICommentFloatAdAbility.class, null);
            if (iCommentFloatAdAbility != null && Intrinsics.LJFF(iCommentFloatAdAbility.isVisible(), Boolean.TRUE)) {
                return;
            }
            C1345250l6x.LIZ.getClass();
            C01GW c01gw = C1345250l6x.LIZIZ;
            if (((Keva) c01gw.getValue()).getInt("comment_double_tap_guide_times_v2", 0) >= 3) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = ((Keva) c01gw.getValue()).getLong("comment_double_tap_guide_timestamp_v2", -1L);
            if ((j != -1 && jCurrentTimeMillis < j + TimeUnit.DAYS.toMillis(7L)) || (activity = getActivity()) == null || !isShowing() || !kS()) {
                return;
            }
            View view = this.LLJJL;
            if (view == null) {
                view = null;
            }
            if (view.getMeasuredWidth() <= 0 || zF() <= 0) {
                return;
            }
            Bundle bundle = new Bundle();
            View view2 = this.LLJJL;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJJIZ(bundle, "comment_panel_width", Integer.valueOf(view2.getMeasuredWidth()));
            C786410Ut5.LJJIZ(bundle, "comment_panel_height", Integer.valueOf(zF()));
            Fragment fragmentLJJJJZI = activity.getSupportFragmentManager().LJJJJZI("comment_double_tap_to_like_guide_fragment");
            if ((fragmentLJJJJZI instanceof CommentDoubleTapToLikeGuideFragment) && (commentDoubleTapToLikeGuideFragment = (CommentDoubleTapToLikeGuideFragment) fragmentLJJJJZI) != null) {
                commentDoubleTapToLikeGuideFragment.LLILZIL = aweme;
                return;
            }
            CommentDoubleTapToLikeGuideFragment commentDoubleTapToLikeGuideFragment2 = new CommentDoubleTapToLikeGuideFragment();
            commentDoubleTapToLikeGuideFragment2.setArguments(bundle);
            commentDoubleTapToLikeGuideFragment2.LLILZIL = aweme;
            try {
                C19EH c19ehLJIIJ = activity.getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ.LIZJ(C1345720l7i.LIZ(activity), commentDoubleTapToLikeGuideFragment2, "comment_double_tap_to_like_guide_fragment");
                c19ehLJIIJ.LJIIJ();
                C1345250l6x.LIZ(aweme);
                ((Keva) c01gw.getValue()).storeLong("comment_double_tap_guide_timestamp_v2", System.currentTimeMillis());
                ((Keva) c01gw.getValue()).storeInt("comment_double_tap_guide_times_v2", ((Keva) c01gw.getValue()).getInt("comment_double_tap_guide_times_v2", 0) + 1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Wi1(int r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment.Wi1(int, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        boolean z;
        IPageActionBarAbility iPageActionBarAbility;
        final Aweme aweme;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        CommentListModel listModel;
        Boolean boolValueOf;
        CommentCommonModel commonModel3;
        C19EG activity;
        super.onViewCreated(view, bundle);
        if ((C0CNZ.LIZLLL() & 2) > 0) {
            z = true;
        } else {
            z = false;
        }
        final String str = null;
        if ((!z || ((ArrayList) this.LLILLJJLI).size() > 1) && (iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPageActionBarAbility.class, null)) != null) {
            iPageActionBarAbility.I80(this.LLILZ);
        }
        if (C0BJM.LIZ() && this.LLJJJIL == null && (activity = getActivity()) != null && this.LLJJJIL == null) {
            this.LLJJJIL = C740740T3w.LIZJ(activity, activity, this);
        }
        View view2 = this.LLJJLIIIJLLLLLLLZ;
        if (view2 != null && Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view2, new C0TVI() { // from class: X.0l9q
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view3, C20246014Ju c20246014Ju) {
                    view3.setPadding(0, 0, 0, c20246014Ju.LIZ(7).LIZLLL);
                    C1341790l1N.LIZ.getClass();
                    return c20246014Ju;
                }
            });
        }
        nS();
        final C1353060lJY c1353060lJY = this.LLJJJJJIL;
        if (c1353060lJY != null) {
            c1353060lJY.setCommentContainer(this.LLILZ);
            c1353060lJY.setScrollableContainer(new InterfaceC1258040iqI() { // from class: X.0lEV
                @Override // X.InterfaceC1258040iqI
                public final View LJJLIIIJILLIZJL() {
                    View viewLJJIL;
                    DefaultCommentPageContainerFragment defaultCommentPageContainerFragment = this.LL;
                    C1345610l7X c1345610l7X = defaultCommentPageContainerFragment.LLILLL;
                    if (c1345610l7X != null) {
                        ViewPager viewPager = defaultCommentPageContainerFragment.LLILZ;
                        viewLJJIL = c1345610l7X.LJJIL(viewPager != null ? viewPager.getCurrentItem() : 0);
                    } else {
                        viewLJJIL = null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ScrollableContainer ");
                    sbLIZ.append(viewLJJIL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return viewLJJIL;
                }
            });
            c1353060lJY.LLLLII.add(new InterfaceC1350270lF3() { // from class: X.0lEJ
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.InterfaceC1350270lF3
                public final void LIZ(C1350070lEj c1350070lEj) {
                    String str2;
                    String str3;
                    Aweme aweme2;
                    String aid;
                    Aweme aweme3;
                    CommentCommonModel commonModel4;
                    CommentCommonModel commonModel5;
                    Integer numValueOf;
                    int iValueOf;
                    List<InterfaceC1349750lED> list;
                    String strEnterMethod;
                    C1349730lEB c1349730lEB;
                    CommentCommonModel commonModel6;
                    List<InterfaceC1349750lED> list2;
                    InterfaceC1349750lED interfaceC1349750lED;
                    List<InterfaceC1349750lED> list3;
                    View viewFindViewById;
                    CommentCommonModel commonModel7;
                    Aweme aweme4;
                    String authorUid;
                    CommentCommonModel commonModel8;
                    C1349900lES c1349900lES;
                    CommentCommonModel commonModel9;
                    int height;
                    CommentContextSource commentContextSourceGL;
                    ViewGroup.LayoutParams layoutParams;
                    Aweme aweme5;
                    String aid2;
                    int height2;
                    CommentContextSource commentContextSourceGL2;
                    C1349900lES storyCommentPageParam;
                    InterfaceC1350200lEw interfaceC1350200lEw;
                    String strEnterMethod2;
                    List<InterfaceC1349750lED> list4;
                    View viewFindViewById2;
                    Aweme aweme6;
                    ICommentListAssemAbility iCommentListAssemAbility;
                    C1349900lES storyCommentPageParam2;
                    InterfaceC1350200lEw interfaceC1350200lEw2;
                    if (this.isViewValid() && !this.isDetached()) {
                        DefaultCommentPageContainerFragment defaultCommentPageContainerFragment = this;
                        if (!defaultCommentPageContainerFragment.mStatusDestroyed && defaultCommentPageContainerFragment.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                            int i = C1349970lEZ.LIZ[c1350070lEj.LIZ.ordinal()];
                            ViewGroup.LayoutParams layoutParams2 = null;
                            List<InterfaceC1349750lED> list5 = null;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i != 4) {
                                            if (i == 5) {
                                                C1349800lEI c1349800lEI = this.LL;
                                                if (c1349800lEI != null && (storyCommentPageParam2 = c1349800lEI.getStoryCommentPageParam()) != null && (interfaceC1350200lEw2 = storyCommentPageParam2.commentNestedLayoutStatusListener) != null) {
                                                    interfaceC1350200lEw2.LIZ();
                                                }
                                                C1209980ham c1209980ham = new C1209980ham(23, null);
                                                CommentContextSource commentContextSourceGL3 = this.GL();
                                                if (commentContextSourceGL3 != null) {
                                                    aweme6 = CommentContextSourceKt.aweme(commentContextSourceGL3);
                                                } else {
                                                    aweme6 = null;
                                                }
                                                c1209980ham.LIZJ = aweme6;
                                                C1440005kM.LIZ(c1209980ham);
                                                if (C0BTU.LIZ() && (iCommentListAssemAbility = (ICommentListAssemAbility) C1558520qew.LIZ(C1558360qeg.LJ(c1353060lJY, null), ICommentListAssemAbility.class, null)) != null) {
                                                    iCommentListAssemAbility.q21();
                                                }
                                            }
                                        } else {
                                            C1349800lEI c1349800lEI2 = this.LL;
                                            if (c1349800lEI2 != null && Intrinsics.LJFF(c1349800lEI2.needShowMask(), Boolean.TRUE) && (viewFindViewById2 = c1353060lJY.getRootView().findViewById(R.id.o1o)) != null) {
                                                viewFindViewById2.animate().alpha(0.0f).setDuration(150L).start();
                                            }
                                            DefaultCommentPageContainerFragment defaultCommentPageContainerFragment2 = this;
                                            ViewPager viewPager = defaultCommentPageContainerFragment2.LLILZ;
                                            if (viewPager != null) {
                                                View view3 = view;
                                                if (view3 != null) {
                                                    HandlerHook.viewPost(view3, new ARunnableS81S0200000_12(c1350070lEj, defaultCommentPageContainerFragment2, 46));
                                                }
                                                C1349730lEB c1349730lEB2 = defaultCommentPageContainerFragment2.LLILZIL;
                                                if (c1349730lEB2 != null) {
                                                    CommentContextSource commentContextSourceGL4 = defaultCommentPageContainerFragment2.GL();
                                                    CommentPageActionBarViewModel commentPageActionBarViewModel = defaultCommentPageContainerFragment2.LLILZLL;
                                                    if (commentPageActionBarViewModel != null) {
                                                        list4 = commentPageActionBarViewModel.LLILZIL;
                                                    } else {
                                                        list4 = null;
                                                    }
                                                    c1349730lEB2.LJ(false, commentContextSourceGL4, list4, defaultCommentPageContainerFragment2);
                                                }
                                                C1349730lEB c1349730lEB3 = defaultCommentPageContainerFragment2.LLILZIL;
                                                if (c1349730lEB3 != null) {
                                                    CommentPageActionBarViewModel commentPageActionBarViewModel2 = defaultCommentPageContainerFragment2.LLILZLL;
                                                    if (commentPageActionBarViewModel2 != null) {
                                                        list5 = commentPageActionBarViewModel2.LLILZIL;
                                                    }
                                                    int currentItem = viewPager.getCurrentItem();
                                                    String str4 = c1350070lEj.LIZIZ;
                                                    CommentContextSource commentContextSourceGL5 = defaultCommentPageContainerFragment2.GL();
                                                    if (commentContextSourceGL5 == null || (strEnterMethod2 = CommentContextSourceKt.enterMethod(commentContextSourceGL5)) == null) {
                                                        strEnterMethod2 = "";
                                                    }
                                                    c1349730lEB3.LJFF(list5, currentItem, -1, str4, strEnterMethod2, false, false);
                                                }
                                            }
                                            String str5 = "auto_close_comment_panel";
                                            if (!TextUtils.isEmpty(c1350070lEj.LIZIZ)) {
                                                str5 = "manually_close_comment_panel";
                                            }
                                            C1349910lET c1349910lET = this.LLJLLL;
                                            if (c1349910lET != null) {
                                                c1349910lET.LIZIZ(str5);
                                            }
                                            C1349800lEI c1349800lEI3 = this.LL;
                                            if (c1349800lEI3 != null && (storyCommentPageParam = c1349800lEI3.getStoryCommentPageParam()) != null && (interfaceC1350200lEw = storyCommentPageParam.commentNestedLayoutStatusListener) != null) {
                                                interfaceC1350200lEw.LIZIZ();
                                            }
                                        }
                                    } else {
                                        View view4 = this.LLJJL;
                                        if (view4 == null) {
                                            view4 = null;
                                        }
                                        C1350920lG6.LJJZZI(Integer.valueOf(view4.getMeasuredHeight()), "show_cancel");
                                        if (((Number) C0A8M.LIZ.getValue()).intValue() == 1) {
                                            View view5 = this.LLJJLIIIJLLLLLLLZ;
                                            if (view5 != null) {
                                                height2 = view5.getHeight();
                                            } else {
                                                height2 = 0;
                                            }
                                            if (height2 <= C0HD5.LJFF(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), view, this.requireContext()) && (commentContextSourceGL2 = this.GL()) != null && !CommentContextSourceKt.videoDescOnly(commentContextSourceGL2)) {
                                                int iLJIIIIZZ = (int) (((double) C12ES.LJIIIIZZ(c1353060lJY.getContext())) * 0.68d);
                                                if (iLJIIIIZZ <= C0HD5.LJFF(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), view, this.requireContext())) {
                                                    iLJIIIIZZ = C0HD5.LJFF(583, view, this.requireContext());
                                                }
                                                View view6 = this.LLJJLIIIJLLLLLLLZ;
                                                if (view6 != null && (layoutParams2 = view6.getLayoutParams()) != null) {
                                                    layoutParams2.height = iLJIIIIZZ;
                                                }
                                                View view7 = this.LLJJLIIIJLLLLLLLZ;
                                                if (view7 != null) {
                                                    C786410Ut5.W5(view7, layoutParams2);
                                                }
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("height was set to ");
                                                sbLIZ.append(iLJIIIIZZ);
                                                C1344030l4z.LIZJ("CommentInputCheck", C2188811AlT.LIZIZ(sbLIZ));
                                            }
                                        }
                                    }
                                } else {
                                    Aweme aweme7 = this.LLJJJJ;
                                    if (aweme7 != null && (aid2 = aweme7.getAid()) != null) {
                                        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                                        synchronized (c1350920lG6) {
                                            if (aid2.length() != 0) {
                                                C1350920lG6.LIZJ.remove(aid2);
                                                List<C1349870lEP> listRemove = C1350920lG6.LIZLLL.remove(aid2);
                                                if (listRemove != null) {
                                                    for (C1349870lEP c1349870lEP : listRemove) {
                                                        c1350920lG6.LLFII(c1349870lEP.LIZ, c1349870lEP.LIZIZ, c1349870lEP.LIZJ, c1349870lEP.LIZLLL, c1349870lEP.LJ, c1349870lEP.LJFF, c1349870lEP.LJI);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    DefaultCommentPageContainerFragment defaultCommentPageContainerFragment3 = this;
                                    if (defaultCommentPageContainerFragment3.LLILZ != null) {
                                        C1349730lEB c1349730lEB4 = defaultCommentPageContainerFragment3.LLILZIL;
                                        if (c1349730lEB4 != null) {
                                            c1349730lEB4.LIZJ();
                                        }
                                        CommentPageActionBarViewModel commentPageActionBarViewModel3 = defaultCommentPageContainerFragment3.LLILZLL;
                                        if (commentPageActionBarViewModel3 != null) {
                                            CommentContextSource commentContextSourceGL6 = defaultCommentPageContainerFragment3.GL();
                                            Iterator it2 = ((ArrayList) commentPageActionBarViewModel3.LLILZIL).iterator();
                                            while (it2.hasNext()) {
                                                String tabName = ((InterfaceC1349750lED) it2.next()).getTabName();
                                                if (commentContextSourceGL6 != null && (aweme5 = commentContextSourceGL6.getCommonModel().aweme) != null && !Intrinsics.LJFF(tabName, "comment_tab")) {
                                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                                    c2344009Gk.LJIIIIZZ("enter_from", commentContextSourceGL6.getCommonModel().enterFrom);
                                                    c2344009Gk.LJIIIIZZ("enter_method", commentContextSourceGL6.getCommonModel().enterMethod);
                                                    c2344009Gk.LJIIIIZZ("tab_name", tabName);
                                                    c2344009Gk.LJIIIIZZ("group_id", aweme5.getAid());
                                                    c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme5));
                                                    C735840Sti c735840Sti = C735840Sti.LIZ;
                                                    User author = aweme5.getAuthor();
                                                    c735840Sti.getClass();
                                                    c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author), "follow_status");
                                                    c2344009Gk.LJIIIIZZ("session_id", commentContextSourceGL6.getListModel().getSessionId());
                                                    C1350920lG6.LJJJ(c2344009Gk, "comment_2tab_title_show");
                                                }
                                            }
                                        }
                                    }
                                    View view8 = this.LLJJL;
                                    if (view8 == null) {
                                        view8 = null;
                                    }
                                    C1350920lG6.LJJZZI(Integer.valueOf(view8.getMeasuredHeight()), "show_end");
                                    if (((Number) C0A8M.LIZ.getValue()).intValue() == 1) {
                                        View view9 = this.LLJJLIIIJLLLLLLLZ;
                                        if (view9 != null) {
                                            height = view9.getHeight();
                                        } else {
                                            height = 0;
                                        }
                                        if (height <= C0HD5.LJFF(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), view, this.requireContext()) && (commentContextSourceGL = this.GL()) != null && !CommentContextSourceKt.videoDescOnly(commentContextSourceGL)) {
                                            int iLJIIIIZZ2 = (int) (((double) C12ES.LJIIIIZZ(c1353060lJY.getContext())) * 0.68d);
                                            if (iLJIIIIZZ2 <= C0HD5.LJFF(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), view, this.requireContext())) {
                                                iLJIIIIZZ2 = C0HD5.LJFF(583, view, this.requireContext());
                                            }
                                            View view10 = this.LLJJLIIIJLLLLLLLZ;
                                            if (view10 != null) {
                                                layoutParams = view10.getLayoutParams();
                                                if (layoutParams != null) {
                                                    layoutParams.height = iLJIIIIZZ2;
                                                }
                                            } else {
                                                layoutParams = null;
                                            }
                                            View view11 = this.LLJJLIIIJLLLLLLLZ;
                                            if (view11 != null) {
                                                C786410Ut5.W5(view11, layoutParams);
                                            }
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("height was set to ");
                                            sbLIZ2.append(iLJIIIIZZ2);
                                            C1344030l4z.LIZJ("CommentInputCheck", C2188811AlT.LIZIZ(sbLIZ2));
                                        }
                                    }
                                    CommentContextSource commentContextSourceGS = this.gS();
                                    if (commentContextSourceGS != null && (commonModel9 = commentContextSourceGS.getCommonModel()) != null) {
                                        View view12 = this.LLJJL;
                                        if (view12 == null) {
                                            view12 = null;
                                        }
                                        commonModel9.setReportPanelHeight(Integer.valueOf(view12.getMeasuredHeight()));
                                    }
                                    try {
                                        ICommentFakeInputAbility iCommentFakeInputAbilityLIZJ = C1345760l7m.LIZJ(this, C1558360qeg.LJ(c1353060lJY, null));
                                        if (iCommentFakeInputAbilityLIZJ != null) {
                                            iCommentFakeInputAbilityLIZJ.xF();
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                            } else {
                                C1349800lEI c1349800lEI4 = this.LL;
                                if (c1349800lEI4 != null && Intrinsics.LJFF(c1349800lEI4.needShowMask(), Boolean.TRUE) && (viewFindViewById = c1353060lJY.getRootView().findViewById(R.id.o1o)) != null) {
                                    C786410Ut5.T4(viewFindViewById, 0.0f);
                                    viewFindViewById.animate().alpha(1.0f).setDuration(150L).start();
                                }
                                DefaultCommentPageContainerFragment defaultCommentPageContainerFragment4 = this;
                                ViewPager viewPager2 = defaultCommentPageContainerFragment4.LLILZ;
                                if (viewPager2 != null) {
                                    View view13 = view;
                                    if (view13 != null) {
                                        HandlerHook.viewPost(view13, new ARunnableS112S0100000_12(defaultCommentPageContainerFragment4, 156));
                                    }
                                    C1349730lEB c1349730lEB5 = defaultCommentPageContainerFragment4.LLILZIL;
                                    if (c1349730lEB5 != null) {
                                        CommentContextSource commentContextSourceGL7 = defaultCommentPageContainerFragment4.GL();
                                        CommentPageActionBarViewModel commentPageActionBarViewModel4 = defaultCommentPageContainerFragment4.LLILZLL;
                                        if (commentPageActionBarViewModel4 != null) {
                                            list3 = commentPageActionBarViewModel4.LLILZIL;
                                        } else {
                                            list3 = null;
                                        }
                                        c1349730lEB5.LJ(true, commentContextSourceGL7, list3, defaultCommentPageContainerFragment4);
                                    }
                                    CommentPageActionBarViewModel commentPageActionBarViewModel5 = defaultCommentPageContainerFragment4.LLILZLL;
                                    if (commentPageActionBarViewModel5 != null && (list2 = commentPageActionBarViewModel5.LLILZIL) != null && (interfaceC1349750lED = (InterfaceC1349750lED) C13LP.LJJJLZIJ(viewPager2.getCurrentItem(), list2)) != null) {
                                        numValueOf = Integer.valueOf(interfaceC1349750lED.Rc());
                                    } else {
                                        numValueOf = null;
                                    }
                                    CommentContextSource commentContextSourceGL8 = defaultCommentPageContainerFragment4.GL();
                                    if (commentContextSourceGL8 != null && (commonModel6 = commentContextSourceGL8.getCommonModel()) != null) {
                                        iValueOf = Integer.valueOf(commonModel6.locatePageType);
                                    } else {
                                        iValueOf = 1;
                                    }
                                    if (Intrinsics.LJFF(numValueOf, iValueOf) && (c1349730lEB = defaultCommentPageContainerFragment4.LLILZIL) != null) {
                                        c1349730lEB.LIZ();
                                    }
                                    C1349730lEB c1349730lEB6 = defaultCommentPageContainerFragment4.LLILZIL;
                                    if (c1349730lEB6 != null) {
                                        CommentPageActionBarViewModel commentPageActionBarViewModel6 = defaultCommentPageContainerFragment4.LLILZLL;
                                        if (commentPageActionBarViewModel6 != null) {
                                            list = commentPageActionBarViewModel6.LLILZIL;
                                        } else {
                                            list = null;
                                        }
                                        int currentItem2 = viewPager2.getCurrentItem();
                                        String str6 = c1350070lEj.LIZIZ;
                                        CommentContextSource commentContextSourceGL9 = defaultCommentPageContainerFragment4.GL();
                                        if (commentContextSourceGL9 == null || (strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSourceGL9)) == null) {
                                            strEnterMethod = "";
                                        }
                                        c1349730lEB6.LJFF(list, -1, currentItem2, str6, strEnterMethod, false, false);
                                    }
                                }
                                CommentContextSource commentContextSourceGL10 = this.GL();
                                if (commentContextSourceGL10 != null && (commonModel5 = commentContextSourceGL10.getCommonModel()) != null) {
                                    str2 = commonModel5.eventType;
                                } else {
                                    str2 = null;
                                }
                                if (Intrinsics.LJFF(str2, "homepage_hot") && C294380BgK.LIZ()) {
                                    CommentContextSource commentContextSourceGL11 = this.GL();
                                    if (commentContextSourceGL11 != null && (commonModel4 = commentContextSourceGL11.getCommonModel()) != null) {
                                        str3 = commonModel4.eventType;
                                    } else {
                                        str3 = null;
                                    }
                                    C1209980ham c1209980ham2 = new C1209980ham(24, str3);
                                    CommentContextSource commentContextSourceGL12 = this.GL();
                                    if (commentContextSourceGL12 != null) {
                                        aweme2 = CommentContextSourceKt.aweme(commentContextSourceGL12);
                                    } else {
                                        aweme2 = null;
                                    }
                                    c1209980ham2.LIZJ = aweme2;
                                    C1440005kM.LIZ(c1209980ham2);
                                    C1387870mDh c1387870mDh = C1387870mDh.LIZ;
                                    CommentContextSource commentContextSourceGL13 = this.GL();
                                    if (commentContextSourceGL13 != null && (aweme3 = CommentContextSourceKt.aweme(commentContextSourceGL13)) != null) {
                                        aid = aweme3.getAid();
                                    } else {
                                        aid = null;
                                    }
                                    c1387870mDh.getClass();
                                    C1387870mDh.LJII(aid);
                                }
                            }
                            CommentContextSource commentContextSourceGL14 = this.GL();
                            if (commentContextSourceGL14 != null && (commonModel7 = commentContextSourceGL14.getCommonModel()) != null && commonModel7.isFriendsSimpleDetail()) {
                                CommentContextSource commentContextSourceGL15 = this.GL();
                                if (commentContextSourceGL15 != null) {
                                    aweme4 = CommentContextSourceKt.aweme(commentContextSourceGL15);
                                } else {
                                    aweme4 = null;
                                }
                                IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
                                if (aweme4 == null || (authorUid = AwemeExtKt.getAuthorUid(aweme4)) == null) {
                                    authorUid = "";
                                }
                                boolean zLIZJ = ((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(authorUid);
                                CommentContextSource commentContextSourceGL16 = this.GL();
                                if ((commentContextSourceGL16 != null && (commonModel8 = commentContextSourceGL16.getCommonModel()) != null && (c1349900lES = commonModel8.storyCommentPageParam) != null && !c1349900lES.isCommentFirst()) || zLIZJ) {
                                    return;
                                }
                                ICommentFakeInputAbility iCommentFakeInputAbilityLIZJ2 = C1345760l7m.LIZJ(this, C1558360qeg.LJ(c1353060lJY, null));
                                if (iCommentFakeInputAbilityLIZJ2 == null) {
                                    return;
                                }
                                iCommentFakeInputAbilityLIZJ2.Ua2(c1350070lEj);
                                return;
                            }
                            ICommentFakeInputAbility iCommentFakeInputAbilityLIZJ3 = C1345760l7m.LIZJ(this, C1558360qeg.LJ(c1353060lJY, null));
                            if (iCommentFakeInputAbilityLIZJ3 == null) {
                                return;
                            }
                            iCommentFakeInputAbilityLIZJ3.Ua2(c1350070lEj);
                        }
                    }
                }
            });
            c1353060lJY.setOnShowHeightChangeListener(new InterfaceC679410Qkt() { // from class: X.0lEX
                @Override // X.InterfaceC679410Qkt
                public final void LLJLL(final float f, final float f2) {
                    DefaultCommentPageContainerFragment defaultCommentPageContainerFragment = this.LL;
                    defaultCommentPageContainerFragment.getClass();
                    if (!C1255704vj.LIZ().LJJ(defaultCommentPageContainerFragment.getContext()) && f2 != 0.0f) {
                        View view3 = view;
                        final DefaultCommentPageContainerFragment defaultCommentPageContainerFragment2 = this.LL;
                        HandlerHook.viewPost(view3, new Runnable() { // from class: X.0lEU
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                CommentCommonModel commonModel4;
                                InterfaceC679410Qkt interfaceC679410Qkt;
                                C1C7U.LIZ("DefaultCommentPageContainerFragment@bdd4.onViewCreated$2$3$onShowHeightChange$1");
                                try {
                                    CommentContextSource commentContextSourceGL = defaultCommentPageContainerFragment2.GL();
                                    if (commentContextSourceGL != null && (commonModel4 = commentContextSourceGL.getCommonModel()) != null && (interfaceC679410Qkt = commonModel4.showHeightChangeListener) != null) {
                                        interfaceC679410Qkt.LLJLL(f, f2);
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("DefaultCommentPageContainerFragment@bdd4.onViewCreated$2$3$onShowHeightChange$1");
                            }
                        });
                    }
                }
            });
            c1353060lJY.setOnScrollStateChangedListener(new InterfaceC1350190lEv() { // from class: X.0lEc
                @Override // X.InterfaceC1350190lEv
                public final Boolean LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC1350190lEv
                public final void LIZ(int i, int i2) {
                    HandlerHook.viewPost(view, new ARunnableS7S0202000_21(i2, i, c1353060lJY, this, 0));
                }
            });
            CommentContextSource commentContextSourceGL = GL();
            if (commentContextSourceGL != null && (commonModel3 = commentContextSourceGL.getCommonModel()) != null) {
                boolValueOf = Boolean.valueOf(commonModel3.isPreCreate());
            } else {
                boolValueOf = null;
            }
            if (C1346420l8q.LIZJ(boolValueOf)) {
                c1353060lJY.LJFF(false);
            }
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.0l9F
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C722650SWh) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 57), 4);
        oS(0);
        CommentContextSource commentContextSourceGL2 = GL();
        if (commentContextSourceGL2 != null && (listModel = commentContextSourceGL2.getListModel()) != null) {
            listModel.setSessionId(C1346170l8R.LIZ());
        }
        Qh0();
        bS();
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            final C1350090lEl c1350090lEl = (C1350090lEl) this.LLLF.getValue();
            final Context context = getContext();
            CommentContextSource commentContextSourceGL3 = GL();
            if (commentContextSourceGL3 != null && (commonModel2 = commentContextSourceGL3.getCommonModel()) != null) {
                aweme = commonModel2.aweme;
            } else {
                aweme = null;
            }
            CommentContextSource commentContextSourceGL4 = GL();
            if (commentContextSourceGL4 != null && (commonModel = commentContextSourceGL4.getCommonModel()) != null) {
                str = commonModel.eventType;
            }
            c1350090lEl.getClass();
            if (C1339790ky9.LIZ()) {
                view.findViewById(R.id.ecf).setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0lEN
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        C1350090lEl c1350090lEl2 = c1350090lEl;
                        if (c1350090lEl2.LIZ) {
                            C1349860lEO c1349860lEO = c1350090lEl2.LIZIZ;
                            if (c1349860lEO != null) {
                                View view4 = view;
                                Context context2 = context;
                                C786410Ut5.LJJL(c1349860lEO, (LinearLayout) view4.findViewById(R.id.p4n));
                                C786410Ut5.re(Toast.makeText(context2, "hide comment debug tool", 0));
                                c1350090lEl2.LIZ = false;
                            }
                        } else {
                            Context context3 = context;
                            if (context3 != null) {
                                Aweme aweme2 = aweme;
                                String str2 = str;
                                View view5 = view;
                                C1349860lEO c1349860lEO2 = new C1349860lEO(context3, aweme2, str2);
                                c1350090lEl2.LIZIZ = c1349860lEO2;
                                C384050F3z c384050F3z = new C384050F3z();
                                int iLIZJ = C1308910kAL.LIZJ(R.attr.bt, view5.getContext());
                                if (iLIZJ == null) {
                                    iLIZJ = -16777216;
                                }
                                c384050F3z.LIZ = iLIZJ;
                                c1349860lEO2.setBackground(c384050F3z.LIZ(view5.getContext()));
                                ((ViewGroup) view5.findViewById(R.id.p4n)).addView(c1350090lEl2.LIZIZ, 1, new ViewGroup.LayoutParams(-1, -2));
                                C786410Ut5.re(Toast.makeText(context3, "show comment debug tool", 0));
                                c1350090lEl2.LIZ = true;
                                return true;
                            }
                        }
                        return true;
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment
    public final void SR(Aweme aweme, C1349800lEI c1349800lEI, Boolean bool) {
        CommentEventModel eventModel;
        C1349860lEO c1349860lEO;
        C1349900lES storyCommentPageParam;
        IPageActionBarAbility iPageActionBarAbility;
        super.SR(aweme, c1349800lEI, bool);
        if ((C0CNZ.LIZLLL() & 2) > 0 && ((ArrayList) this.LLILLJJLI).size() > 1 && (iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPageActionBarAbility.class, null)) != null) {
            iPageActionBarAbility.I80(this.LLILZ);
        }
        cS();
        if (c1349800lEI == null || (storyCommentPageParam = c1349800lEI.getStoryCommentPageParam()) == null || !storyCommentPageParam.useStoryCommentStyle) {
            C01GW c01gw = C288640BTa.LIZ;
            if (((Number) c01gw.getValue()).intValue() > 0 && !CommentContextSourceKt.isFromTitlePanel(GL())) {
                if (((Number) c01gw.getValue()).intValue() == 1) {
                    this.LLLFFI = false;
                    TuxIconView tuxIconView = this.LLLFZ;
                    if (tuxIconView != null) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_chevron_expand;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                        tuxIconView.setTuxIcon(c419910GdJ);
                    }
                } else {
                    C1350120lEo c1350120lEo = this.LLLFF;
                    if (c1350120lEo != null) {
                        c1350120lEo.LLIZLLLIL = 5;
                        c1350120lEo.LLILLL = 0;
                        c1350120lEo.LLJ = false;
                        c1350120lEo.LLILZIL = 0.0f;
                        c1350120lEo.LLILZLL = 0.0f;
                    }
                }
                CommentContextSource commentContextSourceGS = gS();
                if (commentContextSourceGS != null && (eventModel = commentContextSourceGS.getEventModel()) != null) {
                    eventModel.setSplitPercent(6);
                }
                Wi1(this.LLLIIII, this.LLLII);
            }
        }
        if (CommentContextSourceKt.isFromTitlePanel(GL())) {
            C1351950lHl.LJIJJ(this.LLLFZ);
            C1350120lEo c1350120lEo2 = this.LLLFF;
            if (c1350120lEo2 != null) {
                C1351950lHl.LJIJJ(c1350120lEo2);
            }
        } else {
            View view = this.LLL;
            if (view != null) {
                iS(view);
            }
        }
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            C1350090lEl c1350090lEl = (C1350090lEl) this.LLLF.getValue();
            c1350090lEl.getClass();
            if (C1339790ky9.LIZ() && c1350090lEl.LIZ && (c1349860lEO = c1350090lEl.LIZIZ) != null) {
                c1349860lEO.setAweme(aweme);
            }
        }
        nS();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        C19EG activity;
        C1349910lET c1349910lET;
        CommentPerfMonitorUtil.LIZ.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1345390l7B c1345390l7B = CommentPerfMonitorUtil.LJI;
        c1345390l7B.LIZLLL = jCurrentTimeMillis;
        C1345380l7A c1345380l7A = CommentPerfMonitorUtil.LJII;
        c1345380l7A.LIZLLL = jCurrentTimeMillis;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        c1345390l7B.LJFF = jCurrentTimeMillis2;
        c1345380l7A.LJFF = jCurrentTimeMillis2;
        C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
        boolean z = C1354730lMF.LIZ;
        boolean z2 = false;
        View viewLIZIZ = C21146717pB.LIZIZ(C1356320lOo.LJ(R.layout.a26, C1354730lMF.LIZIZ(requireContext())), R.layout.a26, viewGroup, false);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        c1345390l7B.LJI = jCurrentTimeMillis3;
        c1345380l7A.LJI = jCurrentTimeMillis3;
        if ((C0CNZ.LIZLLL() & 8) > 0) {
            z2 = true;
        }
        if (!z2 && (activity = getActivity()) != null && (c1349910lET = this.LLJLLL) != null) {
            c1349910lET.LIZ(viewLIZIZ, activity);
        }
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        c1345390l7B.LJ = jCurrentTimeMillis4;
        c1345380l7A.LJ = jCurrentTimeMillis4;
        try {
            ViewTreeLifecycleOwner.set(viewLIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLIZIZ, this);
            viewLIZIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity2 = getActivity();
            if (activity2 instanceof C19GS) {
                c19gs = (C19GS) activity2;
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
}
