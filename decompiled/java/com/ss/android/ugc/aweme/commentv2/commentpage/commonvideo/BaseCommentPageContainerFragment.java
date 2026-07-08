package com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo;

import X.C01GW;
import X.C03H5;
import X.C086I;
import X.C0BTZ;
import X.C0PSL;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1344030l4z;
import X.C1345610l7X;
import X.C1345670l7d;
import X.C1345760l7m;
import X.C1346170l8R;
import X.C1346420l8q;
import X.C1348610lCN;
import X.C1349590lDx;
import X.C1349730lEB;
import X.C1349800lEI;
import X.C1349890lER;
import X.C1350110lEn;
import X.C1350920lG6;
import X.C1354730lMF;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1490190osj;
import X.C1554610qYd;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C18IO;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EH;
import X.C20152913tH;
import X.C20153113tJ;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C295800Bic;
import X.C307000C1q;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C722580SWa;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC2262571Dh9;
import X.ExecutorC1592406Li;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1344590l5t;
import X.InterfaceC1349750lED;
import X.InterfaceC1350220lEy;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC469360Ias;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.AObserverS216S0100000_12;
import Y.ARunnableS112S0100000_12;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRefactorKeyboardFragment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.comment.model.CommentListModel;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.commentv2.CommentPageScope;
import com.ss.android.ugc.aweme.commentv2.actionbar.AbsCommentPageTab;
import com.ss.android.ugc.aweme.commentv2.actionbar.CommentPageActionBarViewModel;
import com.ss.android.ugc.aweme.commentv2.actionbar.ICommentPageActionBarVMAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentFloatAdAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentExposureAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;
import com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment;
import com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS79S0500000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseCommentPageContainerFragment extends AbsFragment implements ICommentPageContainer, ICommentPageAbility, InterfaceC724530SbT, ICommentPageVisibilityProtocol, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public C1345610l7X LLILLL;
    public ViewPager LLILZ;
    public C1349730lEB LLILZIL;
    public CommentPageActionBarViewModel LLILZLL;
    public C1350110lEn LLJ;
    public Aweme LLJI;
    public boolean LLJIJIL;
    public final C01GW LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public ICommentFloatAdAbility LLJJI;
    public ICommentListAssemAbility LLJJIII;
    public ICommentExposureAbility LLJJIJI;
    public ICommentListVMAbility LLJJIJIIJIL;
    public C1349800lEI LL = new C1349800lEI("");
    public final List<AbsCommentPageTab> LLILLJJLI = new ArrayList();
    public final Set<IPanelProviderProtocol> LLIZ = new LinkedHashSet();
    public final C722580SWa LLIZLLLIL = new C722580SWa();
    public String LLJILJIL = "";

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseCommentPageContainerFragment.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BaseCommentPageContainerFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentManagementAssemVM.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS79S0500000_19(this, c19719912DlLIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 823), AFwS259S0000000_21.get$arr$(388), (Function0) null, 14));
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public boolean B9() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility
    public boolean Ex2() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public void Kb1(String str) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public void LJLLLLLL() {
        Aweme aweme;
        this.LLJIJIL = false;
        C1348610lCN c1348610lCN = C1348610lCN.LIZ;
        CommentContextSource commentContextSourceGL = GL();
        String aid = (commentContextSourceGL == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceGL)) == null) ? null : aweme.getAid();
        c1348610lCN.getClass();
        C1348610lCN.LIZ(aid);
        BtmSDK.INSTANCE.onPageHide(this, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LLFF() {
    }

    public void MR(boolean z) {
    }

    public abstract void NR(View view);

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void P61() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public void Qg2(Aweme aweme, AwS565S0100000_21 awS565S0100000_21) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public void Qh0() {
    }

    public abstract void RR();

    public void VR(int i) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility
    public void Wi1(int i, boolean z) {
    }

    @Override // X.C0QSJ
    public void bindAbility(Object obj, Class cls) {
        if (cls == ICommentFloatAdAbility.class) {
            this.LLJJI = (ICommentFloatAdAbility) obj;
        } else if (cls == ICommentListAssemAbility.class) {
            this.LLJJIII = (ICommentListAssemAbility) obj;
        } else if (cls == ICommentExposureAbility.class) {
            this.LLJJIJI = (ICommentExposureAbility) obj;
        } else if (cls == ICommentListVMAbility.class) {
            this.LLJJIJIIJIL = (ICommentListVMAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentPageScope.class});
    }

    @Override // X.C0QSJ
    public Object getAbility(Class cls) {
        if (cls == ICommentFloatAdAbility.class) {
            return this.LLJJI;
        }
        if (cls == ICommentListAssemAbility.class) {
            return this.LLJJIII;
        }
        if (cls == ICommentExposureAbility.class) {
            return this.LLJJIJI;
        }
        if (cls == ICommentListVMAbility.class) {
            return this.LLJJIJIIJIL;
        }
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
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentPageScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentPageScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility
    public void lK(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void onPagePause() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public void pX() {
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public void unbindAbility(Object obj, Class cls) {
        if (cls == ICommentFloatAdAbility.class) {
            this.LLJJI = null;
        } else if (cls == ICommentListAssemAbility.class) {
            this.LLJJIII = null;
        } else if (cls == ICommentExposureAbility.class) {
            this.LLJJIJI = null;
        } else if (cls == ICommentListVMAbility.class) {
            this.LLJJIJIIJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public int zF() {
        return 0;
    }

    public final CommentContextSource GL() {
        C722580SWa c722580SWa = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return c722580SWa.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public void LJJJJZI() {
        IECommerceVideoService iECommerceVideoService;
        InterfaceC1350220lEy interfaceC1350220lEyLIZIZ;
        C1348610lCN.LIZ.getClass();
        C1348610lCN.LIZIZ = false;
        if (!this.LLJILLL) {
            this.LLJILLL = true;
            BtmSDK.INSTANCE.registerBtmPageOnCreate(new C18IO((Fragment) this, "a2270.b4337", false, false, false, (String) null, 124));
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        C1349800lEI c1349800lEI = this.LL;
        btmSDK.updateBtmPage(this, c1349800lEI != null ? c1349800lEI.getSourceBtmToken() : null);
        Boolean bool = Boolean.TRUE;
        C0PSL c0psl = new C0PSL();
        c0psl.LIZ = true;
        btmSDK.onPageShow(this, bool, c0psl);
        Iterator<IPanelProviderProtocol> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            if (it2.next().Kj1() == 11) {
                IECommerceVideoService iECommerceVideoService2 = (IECommerceVideoService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommerceVideoService.class));
                if (iECommerceVideoService2 != null) {
                    CommentContextSource commentContextSourceGL = GL();
                    if (!iECommerceVideoService2.LIZ(commentContextSourceGL != null ? CommentContextSourceKt.aweme(commentContextSourceGL) : null) || (iECommerceVideoService = (IECommerceVideoService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommerceVideoService.class))) == null || (interfaceC1350220lEyLIZIZ = iECommerceVideoService.LIZIZ()) == null) {
                        return;
                    }
                    CommentContextSource commentContextSourceGL2 = GL();
                    Aweme aweme = commentContextSourceGL2 != null ? CommentContextSourceKt.aweme(commentContextSourceGL2) : null;
                    CommentContextSource commentContextSourceGL3 = GL();
                    interfaceC1350220lEyLIZIZ.LIZ(aweme, commentContextSourceGL3 != null ? CommentContextSourceKt.enterFrom(commentContextSourceGL3) : null);
                    return;
                }
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility
    public final void LP0() {
        C1344030l4z.LIZJ("BaseCommentPageContainerFragment", "innerUpdateCommentStatus");
        SR(null, null, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility
    public final void S01() {
        InterfaceC1349750lED interfaceC1349750lED;
        CommentPageActionBarViewModel commentPageActionBarViewModel = this.LLILZLL;
        if (commentPageActionBarViewModel == null || (interfaceC1349750lED = (InterfaceC1349750lED) C13LP.LJJJLZIJ(0, commentPageActionBarViewModel.LLILZIL)) == null) {
            return;
        }
        interfaceC1349750lED.B7();
    }

    public final void WR() {
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        CommentCommonModel commonModel3;
        C1350110lEn c1350110lEn = this.LLJ;
        if (c1350110lEn != null) {
            c1350110lEn.LIZIZ = false;
        }
        CommentContextSource commentContextSourceGL = GL();
        int i = (commentContextSourceGL == null || (commonModel3 = commentContextSourceGL.getCommonModel()) == null) ? -1 : commonModel3.locatePageType;
        CommentContextSource commentContextSourceGL2 = GL();
        Boolean boolValueOf = null;
        if (commentContextSourceGL2 != null && (commonModel2 = commentContextSourceGL2.getCommonModel()) != null) {
            boolValueOf = Boolean.valueOf(commonModel2.smoothScrollLocate);
        }
        final boolean zLIZ = C1346420l8q.LIZ(boolValueOf);
        if (i >= 0 && !C086I.LIZIZ(this.LLILLJJLI)) {
            int size = ((ArrayList) this.LLILLJJLI).size();
            final int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (((AbsCommentPageTab) ListProtector.get(this.LLILLJJLI, i2)).LIZ().LIZIZ == i) {
                    CommentContextSource commentContextSourceGL3 = GL();
                    if (commentContextSourceGL3 != null && (commonModel = commentContextSourceGL3.getCommonModel()) != null && commonModel.isFriendsSimpleDetail()) {
                        boolean z = i == 1;
                        AssemViewModel assemViewModel = (AssemViewModel) this.LLJILJILJ.getValue();
                        assemViewModel.getClass();
                        assemViewModel.setState(new AwS32S0010000_18(z, 35));
                    }
                    if (this.LLILZ != null) {
                        C1345610l7X c1345610l7X = this.LLILLL;
                        if ((c1345610l7X != null ? c1345610l7X.getCount() : 0) > i2) {
                            ExecutorC1592406Li.LLILLJJLI.LIZ(zLIZ ? 400L : 0L, new Runnable() { // from class: X.0lEY
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ2;
                                    C1C7U.LIZ("BaseCommentPageContainerFragment@5db6.setCurrentItemByParams$2$1");
                                    try {
                                        BaseCommentPageContainerFragment baseCommentPageContainerFragment = this.LL;
                                        int i3 = i2;
                                        boolean z2 = zLIZ;
                                        ViewPager viewPager = baseCommentPageContainerFragment.LLILZ;
                                        if (viewPager != null) {
                                            viewPager.setCurrentItem(i3, z2);
                                        }
                                    } finally {
                                        if (!zLIZ2) {
                                        }
                                    }
                                    C1C7U.LIZIZ("BaseCommentPageContainerFragment@5db6.setCurrentItemByParams$2$1");
                                }
                            });
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        C1350110lEn c1350110lEn2 = this.LLJ;
        if (c1350110lEn2 != null) {
            c1350110lEn2.LIZIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility
    public final List<InterfaceC1344590l5t> g11() {
        CommentPageActionBarViewModel commentPageActionBarViewModel = this.LLILZLL;
        if (commentPageActionBarViewModel != null) {
            return commentPageActionBarViewModel.LLILZLL;
        }
        return null;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        CommentPageActionBarViewModel commentPageActionBarViewModel = this.LLILZLL;
        if (commentPageActionBarViewModel != null) {
            ((ArrayList) commentPageActionBarViewModel.LLILZIL).clear();
            ((ArrayList) commentPageActionBarViewModel.LLILZLL).clear();
        }
        C1349730lEB c1349730lEB = this.LLILZIL;
        if (c1349730lEB != null) {
            c1349730lEB.LIZIZ = null;
            c1349730lEB.LJFF.LIZJ(this, c1349730lEB.LIZ);
        }
        this.LLILZIL = null;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        super.onDestroyView();
        CommentContextSource commentContextSourceGL = GL();
        if (commentContextSourceGL != null && (commonModel2 = commentContextSourceGL.getCommonModel()) != null) {
            commonModel2.setScrollStateChangedListener(null);
        }
        CommentContextSource commentContextSourceGL2 = GL();
        if (commentContextSourceGL2 == null || (commonModel = commentContextSourceGL2.getCommonModel()) == null) {
            return;
        }
        commonModel.setShowHeightChangeListener(null);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        C1349730lEB c1349730lEB;
        super.onPause();
        if (!l91() || (c1349730lEB = this.LLILZIL) == null) {
            return;
        }
        C1349590lDx c1349590lDx = c1349730lEB.LJFF;
        c1349590lDx.getClass();
        c1349590lDx.LIZJ = SystemClock.elapsedRealtime();
        if (((Boolean) C307000C1q.LIZIZ.getValue()).booleanValue()) {
            C1490190osj c1490190osj = C1490190osj.LIZIZ;
            EnumC2262571Dh9 enumC2262571Dh9 = EnumC2262571Dh9.BIZ_COMMENT_CONSUME;
            c1490190osj.LIZJ(enumC2262571Dh9);
            c1490190osj.LIZLLL(enumC2262571Dh9);
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C1344030l4z.LIZJ("BaseCommentPageContainerFragment", "onResume");
        PR("onResume", this.LLIZ);
        C1349730lEB c1349730lEB = this.LLILZIL;
        if (c1349730lEB != null) {
            c1349730lEB.LJFF.LJ();
            C1349890lER.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility
    public final int Wb0(int i) {
        AbsCommentPageTab next;
        Iterator<AbsCommentPageTab> it2 = this.LLILLJJLI.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ().LIZIZ == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return ((ArrayList) this.LLILLJJLI).indexOf(next);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility
    public final void dn1(int i) {
        InterfaceC1349750lED interfaceC1349750lED;
        CommentPageActionBarViewModel commentPageActionBarViewModel = this.LLILZLL;
        if (commentPageActionBarViewModel != null && (interfaceC1349750lED = (InterfaceC1349750lED) C13LP.LJJJLZIJ(i, commentPageActionBarViewModel.LLILZIL)) != null) {
            interfaceC1349750lED.LJJJJLI();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onActivityCreated ");
        sbLIZ.append(bundle);
        C2188811AlT.LIZIZ(sbLIZ);
        if (bundle != null && bundle.getBoolean("should_remove", false)) {
            MR(false);
            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager != null) {
                C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
                c19ehLJIIJ.LJIIZILJ(this);
                c19ehLJIIJ.LJIIJ();
            }
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C1349800lEI c1349800lEI;
        Aweme aweme;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate  ");
        sbLIZ.append(bundle);
        sbLIZ.append("  arguments:");
        sbLIZ.append(arguments);
        C2188811AlT.LIZIZ(sbLIZ);
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("video_params_args");
            String fromPage = null;
            if (serializable instanceof C1349800lEI) {
                c1349800lEI = (C1349800lEI) serializable;
            } else {
                c1349800lEI = null;
            }
            this.LL = c1349800lEI;
            if (c1349800lEI != null) {
                aweme = c1349800lEI.getAweme();
            } else {
                aweme = null;
            }
            this.LLJI = aweme;
            boolean z = C1354730lMF.LIZ;
            C1349800lEI c1349800lEI2 = this.LL;
            if (c1349800lEI2 != null) {
                fromPage = c1349800lEI2.getFromPage();
            }
            C1354730lMF.LIZJ = fromPage;
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("should_remove", true);
        Aweme aweme = this.LLJI;
        if (aweme != null) {
            C786410Ut5.LJJIZ(bundle, "aweme_args", aweme);
        }
        C1349800lEI c1349800lEI = this.LL;
        if (c1349800lEI != null) {
            C786410Ut5.LJJIZ(bundle, "video_params_args", c1349800lEI);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSaveInstanceState ");
        sbLIZ.append(bundle);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        Aweme aweme;
        super.onViewStateRestored(bundle);
        C1344030l4z.LIZJ("BaseCommentPageContainerFragment", "onViewStateRestored");
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable("aweme_args");
            C1349800lEI c1349800lEI = null;
            if (serializable instanceof Aweme) {
                aweme = (Aweme) serializable;
            } else {
                aweme = null;
            }
            this.LLJI = aweme;
            Serializable serializable2 = bundle.getSerializable("video_params_args");
            if (serializable2 instanceof C1349800lEI) {
                c1349800lEI = (C1349800lEI) serializable2;
            }
            this.LL = c1349800lEI;
        }
    }

    public final void PR(String str, Set set) {
        AwS422S0200000_21 awS422S0200000_21 = new AwS422S0200000_21(this, (BaseCommentPageContainerFragment) set, (Set<IPanelProviderProtocol>) 77);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            awS422S0200000_21.invoke();
            return;
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS112S0100000_12(awS422S0200000_21, 155));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("source", str);
        C20684815ws.LJIILLIIL("comment_viewpager_crash", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ViewPager viewPager;
        CommentCommonModel commonModel;
        super.onViewCreated(view, bundle);
        CommentPerfMonitorUtil.LIZ.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        CommentPerfMonitorUtil.LJI.LJII = jCurrentTimeMillis;
        CommentPerfMonitorUtil.LJII.LJII = jCurrentTimeMillis;
        if (this.LLJI != null) {
            CommentContextSource commentContextSource = new CommentContextSource();
            ZR(commentContextSource, this.LL, this.LLJI);
            Boolean boolValueOf = null;
            C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), commentContextSource, CommentContextSource.class, "source_default_key");
            this.LLILZIL = new C1349730lEB();
            this.LLILZLL = new CommentPageActionBarViewModel();
            C1349730lEB c1349730lEB = this.LLILZIL;
            if (c1349730lEB != null) {
                c1349730lEB.LIZ = C1558360qeg.LJFF(this, null);
            }
            C1349730lEB c1349730lEB2 = this.LLILZIL;
            if (c1349730lEB2 != null) {
                c1349730lEB2.LIZIZ = this.LLJI;
                c1349730lEB2.LIZJ = commentContextSource;
            }
            CommentPageActionBarViewModel commentPageActionBarViewModel = this.LLILZLL;
            if (commentPageActionBarViewModel != null) {
                commentPageActionBarViewModel.LL = C1558360qeg.LJFF(this, null);
                C1558520qew.LJII(C1558360qeg.LJFF(this, null), commentPageActionBarViewModel, ICommentPageActionBarVMAbility.class, null, null);
            }
            C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, ICommentPageAbility.class, null, null);
            C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, ICommentPageContainer.class, null, getViewLifecycleOwner());
            C1554610qYd.LIZJ(C1558360qeg.LJFF(this, null), ICommentPageVisibilityProtocol.class, C1697810uHb.LJIILJJIL(this));
            this.LLILZ = (ViewPager) view.findViewById(R.id.ecj);
            NR(view);
            RR();
            PR("onViewCreated", this.LLIZ);
            this.LLILLL = new C1345610l7X(getChildFragmentManager(), this.LLILLJJLI);
            ViewPager viewPager2 = this.LLILZ;
            if (viewPager2 != null) {
                C1350110lEn c1350110lEn = new C1350110lEn(viewPager2.getContext());
                this.LLJ = c1350110lEn;
                try {
                    Field declaredField = ViewPager.class.getDeclaredField("mScroller");
                    declaredField.setAccessible(true);
                    declaredField.set(viewPager2, c1350110lEn);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1350110lEn c1350110lEn2 = this.LLJ;
                if (c1350110lEn2 != null) {
                    c1350110lEn2.LIZIZ = true;
                }
                viewPager2.setOffscreenPageLimit(3);
                viewPager2.setAdapter(this.LLILLL);
                viewPager2.addOnPageChangeListener(new InterfaceC469360Ias() { // from class: X.0lEH
                    public boolean LL;
                    public int LLILLJJLI;
                    public int LLILLL;

                    @Override // X.InterfaceC469360Ias
                    public final void onPageScrollStateChanged(int i) {
                        this.LL = true;
                        this.LLILLJJLI = this.LLILLL;
                        this.LLILLL = i;
                    }

                    @Override // X.InterfaceC469360Ias
                    public final void onPageSelected(int i) {
                        String str;
                        List<InterfaceC1349750lED> list;
                        InterfaceC1349750lED interfaceC1349750lED;
                        Integer numValueOf;
                        Integer numValueOf2;
                        CommentCommonModel commonModel2;
                        BaseCommentPageContainerFragment baseCommentPageContainerFragment;
                        C1349730lEB c1349730lEB3;
                        List<InterfaceC1349750lED> list2;
                        BaseCommentPageContainerFragment baseCommentPageContainerFragment2 = this.LLILZ;
                        if (baseCommentPageContainerFragment2.LLJJ) {
                            return;
                        }
                        baseCommentPageContainerFragment2.VR(i);
                        boolean z = true;
                        if (this.LLILLJJLI == 1) {
                            str = "slide";
                        } else {
                            str = "click_label";
                        }
                        String str2 = "";
                        List<InterfaceC1349750lED> list3 = null;
                        if (this.LL && C1350950lG9.LIZIZ.LJ() && (c1349730lEB3 = (baseCommentPageContainerFragment = this.LLILZ).LLILZIL) != null) {
                            CommentPageActionBarViewModel commentPageActionBarViewModel2 = baseCommentPageContainerFragment.LLILZLL;
                            if (commentPageActionBarViewModel2 != null) {
                                list2 = commentPageActionBarViewModel2.LLILZIL;
                            } else {
                                list2 = null;
                            }
                            int i2 = c1349730lEB3.LJI;
                            String strEnterMethod = CommentContextSourceKt.enterMethod(baseCommentPageContainerFragment.GL());
                            if (strEnterMethod == null) {
                                strEnterMethod = "";
                            }
                            c1349730lEB3.LJFF(list2, i2, i, str, strEnterMethod, true, false);
                        }
                        CommentPageActionBarViewModel commentPageActionBarViewModel3 = this.LLILZ.LLILZLL;
                        if (commentPageActionBarViewModel3 != null && (list = commentPageActionBarViewModel3.LLILZIL) != null && (interfaceC1349750lED = (InterfaceC1349750lED) C13LP.LJJJLZIJ(i, list)) != null && (numValueOf = Integer.valueOf(interfaceC1349750lED.Rc())) != null) {
                            BaseCommentPageContainerFragment baseCommentPageContainerFragment3 = this.LLILZ;
                            C1349730lEB c1349730lEB4 = baseCommentPageContainerFragment3.LLILZIL;
                            if (c1349730lEB4 != null) {
                                CommentContextSource commentContextSourceGL = baseCommentPageContainerFragment3.GL();
                                if (commentContextSourceGL != null && (commonModel2 = commentContextSourceGL.getCommonModel()) != null) {
                                    numValueOf2 = Integer.valueOf(commonModel2.locatePageType);
                                } else {
                                    numValueOf2 = null;
                                }
                                if (Intrinsics.LJFF(numValueOf, numValueOf2) && !c1349730lEB4.LIZLLL) {
                                    C1349730lEB c1349730lEB5 = baseCommentPageContainerFragment3.LLILZIL;
                                    if (c1349730lEB5 != null) {
                                        c1349730lEB5.LIZ();
                                    }
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            BaseCommentPageContainerFragment baseCommentPageContainerFragment4 = this.LLILZ;
                            C1349730lEB c1349730lEB6 = baseCommentPageContainerFragment4.LLILZIL;
                            if (c1349730lEB6 != null) {
                                CommentPageActionBarViewModel commentPageActionBarViewModel4 = baseCommentPageContainerFragment4.LLILZLL;
                                if (commentPageActionBarViewModel4 != null) {
                                    list3 = commentPageActionBarViewModel4.LLILZIL;
                                }
                                int i3 = c1349730lEB6.LJI;
                                String strEnterMethod2 = CommentContextSourceKt.enterMethod(baseCommentPageContainerFragment4.GL());
                                if (strEnterMethod2 != null) {
                                    str2 = strEnterMethod2;
                                }
                                c1349730lEB6.LJFF(list3, i3, i, str, str2, true, z);
                            }
                        }
                    }

                    @Override // X.InterfaceC469360Ias
                    public final void onPageScrolled(int i, float f, int i2) {
                        IRefactorKeyboardFragment iRefactorKeyboardFragmentLJIIJ = C1345760l7m.LJIIJ(this.LLILZ, C1558360qeg.LJFF(this.LLILZ, null));
                        if (iRefactorKeyboardFragmentLJIIJ != null) {
                            iRefactorKeyboardFragmentLJIIJ.uE(f, i);
                        }
                    }
                });
            }
            WR();
            CommentContextSource commentContextSourceGL = GL();
            if (commentContextSourceGL != null && (commonModel = commentContextSourceGL.getCommonModel()) != null) {
                boolValueOf = Boolean.valueOf(commonModel.isPreCreate());
            }
            if (C1346420l8q.LIZJ(boolValueOf)) {
                this.LLJJ = true;
                C1345610l7X c1345610l7X = this.LLILLL;
                if (c1345610l7X != null && (viewPager = this.LLILZ) != null) {
                    c1345610l7X.LJJIIZ(viewPager, 0, c1345610l7X.LJJI(0, viewPager));
                    c1345610l7X.LJIJI(viewPager);
                }
                this.LLJJ = false;
            }
            ComplianceServiceProvider.LJI().LJJIII().observe(getViewLifecycleOwner(), new AObserverS216S0100000_12(this, 34));
            CommentPerfMonitorUtil.LIZ.getClass();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            CommentPerfMonitorUtil.LJI.LJIIIIZZ = jCurrentTimeMillis2;
            CommentPerfMonitorUtil.LJII.LJIIIIZZ = jCurrentTimeMillis2;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initAweme == null in onViewCreated ");
        sbLIZ.append(bundle);
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void SR(Aweme aweme, C1349800lEI c1349800lEI, Boolean bool) {
        String insertCid;
        CommentCommonModel commonModel;
        CommentKeyboardModel keyboardModel;
        ICommentFakeInputAbility iCommentFakeInputAbilityLIZJ;
        Aweme aweme2;
        Boolean boolValueOf;
        CommentListModel listModel;
        InterfaceC665370Q7z interfaceC665370Q7z;
        ICommentListAssemAbility iCommentListAssemAbilityLIZLLL;
        CommentListModel listModel2;
        IPageActionBarAbility iPageActionBarAbility;
        List listLIZIZ;
        ICommentListAssemAbility iCommentListAssemAbilityLIZLLL2;
        CommentListModel listModel3;
        Aweme aweme3;
        if (!isViewValid()) {
            return;
        }
        CommentContextSource commentContextSourceGL = GL();
        if (commentContextSourceGL != null && (aweme3 = CommentContextSourceKt.aweme(commentContextSourceGL)) != null) {
            AwemeExtKt.getAuthorUid(aweme3);
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            ZR(GL(), c1349800lEI, aweme);
        }
        this.LL = c1349800lEI;
        if (this.LLJIJIL) {
            this.LLJIJIL = false;
            CommentContextSource commentContextSourceGL2 = GL();
            if (commentContextSourceGL2 != null) {
                commentContextSourceGL2.setCommentForceRefresh(true);
            }
        }
        CommentContextSource commentContextSourceGL3 = GL();
        Boolean boolIsSpiltMode = null;
        if (commentContextSourceGL3 != null && (listModel3 = commentContextSourceGL3.getListModel()) != null) {
            insertCid = listModel3.getInsertCid();
        } else {
            insertCid = null;
        }
        if (Intrinsics.LJFF(insertCid, "bubble_desc_click_faker_cid") && (iCommentListAssemAbilityLIZLLL2 = C1345760l7m.LIZLLL(this, C1558360qeg.LJFF(this, null))) != null) {
            iCommentListAssemAbilityLIZLLL2.LLJ(0);
        }
        PR("reuse", this.LLIZ);
        C1349730lEB c1349730lEB = this.LLILZIL;
        if (c1349730lEB != null) {
            CommentContextSource commentContextSourceGL4 = GL();
            c1349730lEB.LIZIZ = aweme;
            c1349730lEB.LIZJ = commentContextSourceGL4;
        }
        C1349730lEB c1349730lEB2 = this.LLILZIL;
        if (c1349730lEB2 != null) {
            CommentContextSource commentContextSourceGL5 = GL();
            if (aweme == null) {
                if (commentContextSourceGL5 != null) {
                    aweme2 = CommentContextSourceKt.aweme(commentContextSourceGL5);
                    boolValueOf = Boolean.valueOf(commentContextSourceGL5.getCommentForceRefresh());
                } else {
                    aweme2 = null;
                    boolValueOf = null;
                }
            } else {
                aweme2 = aweme;
                if (commentContextSourceGL5 != null) {
                    boolValueOf = Boolean.valueOf(commentContextSourceGL5.getCommentForceRefresh());
                } else {
                    boolValueOf = null;
                }
            }
            if (C1346420l8q.LIZ(boolValueOf)) {
                C1349890lER.LIZIZ(true);
                InterfaceC665370Q7z interfaceC665370Q7z2 = c1349730lEB2.LIZ;
                if (interfaceC665370Q7z2 != null && (listLIZIZ = C1554610qYd.LIZIZ(interfaceC665370Q7z2, ICommentPageReusedProtocol.class, false)) != null) {
                    Iterator it2 = ((ArrayList) listLIZIZ).iterator();
                    while (it2.hasNext()) {
                        ((ICommentPageReusedProtocol) it2.next()).bT(aweme2);
                    }
                }
                InterfaceC665370Q7z interfaceC665370Q7z3 = c1349730lEB2.LIZ;
                if (interfaceC665370Q7z3 != null && (iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(interfaceC665370Q7z3, IPageActionBarAbility.class, null)) != null) {
                    iPageActionBarAbility.K01();
                }
                if (commentContextSourceGL5 != null) {
                    commentContextSourceGL5.setCommentForceRefresh(false);
                }
                if ((C0BTZ.LIZ() & 1) == 1) {
                    C20152913tH.LIZLLL.getClass();
                    if (C20153113tJ.LIZ() && ((Number) C295800Bic.LIZ.getValue()).intValue() != 2) {
                        DefaultCommentPageContainerFragment.LLLILZJ.getClass();
                        C1345670l7d.LIZLLL(c1349800lEI, aweme);
                    }
                }
                if (commentContextSourceGL5 != null && (listModel2 = commentContextSourceGL5.getListModel()) != null) {
                    listModel2.setSessionId(C1346170l8R.LIZ());
                }
            } else {
                C1349890lER.LIZ();
                if (commentContextSourceGL5 != null && (listModel = commentContextSourceGL5.getListModel()) != null && listModel.getSmoothScrollToHighlightComment() && (interfaceC665370Q7z = c1349730lEB2.LIZ) != null && (iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(this, interfaceC665370Q7z)) != null) {
                    iCommentListAssemAbilityLIZLLL.UP2(false);
                }
            }
        }
        CommentContextSource commentContextSourceGL6 = GL();
        if (commentContextSourceGL6 != null && (keyboardModel = commentContextSourceGL6.getKeyboardModel()) != null && keyboardModel.getInitEditTextContent() != null && (iCommentFakeInputAbilityLIZJ = C1345760l7m.LIZJ(this, C1558360qeg.LJFF(this, null))) != null) {
            iCommentFakeInputAbilityLIZJ.sg0();
        }
        WR();
        CommentContextSource commentContextSourceGL7 = GL();
        if (commentContextSourceGL7 != null) {
            String strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSourceGL7);
            CommentContextSource commentContextSourceGL8 = GL();
            if (commentContextSourceGL8 != null && (commonModel = commentContextSourceGL8.getCommonModel()) != null) {
                boolIsSpiltMode = commonModel.isSpiltMode();
            }
            C1350920lG6.LIZ.getClass();
            if (!C1350920lG6.LJJIJIL(1, "comment_show_refresh_result")) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJFF("enter_method", strEnterMethod);
                if (Intrinsics.LJFF(boolIsSpiltMode, Boolean.TRUE)) {
                    c2344009Gk.LJFF("from_split", "1");
                }
                C1350920lG6.LJJJ(c2344009Gk, "comment_show_refresh_result");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0440  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ZR(com.ss.android.ugc.aweme.comment.model.CommentContextSource r93, X.C1349800lEI r94, com.ss.android.ugc.aweme.feed.model.Aweme r95) {
        /*
            Method dump skipped, instruction units count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.BaseCommentPageContainerFragment.ZR(com.ss.android.ugc.aweme.comment.model.CommentContextSource, X.0lEI, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final boolean OR(String str, boolean z, boolean z2, boolean z3) {
        CommentContextSource commentContextSourceGL;
        CommentCommonModel commonModel;
        String aid;
        if (str == null || str.length() == 0 || (commentContextSourceGL = GL()) == null || (commonModel = commentContextSourceGL.getCommonModel()) == null) {
            return false;
        }
        Aweme aweme = commonModel.aweme;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(str, aid) || commonModel.commentClose != z || commonModel.commentLimited != z2 || commonModel.enableComment != z3) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility
    public final void QV0(int i, int i2, View view, Function0 function0, Function0 function02) {
        InterfaceC1349750lED interfaceC1349750lED;
        CommentPageActionBarViewModel commentPageActionBarViewModel = this.LLILZLL;
        if (commentPageActionBarViewModel != null && (interfaceC1349750lED = (InterfaceC1349750lED) C13LP.LJJJLZIJ(0, commentPageActionBarViewModel.LLILZIL)) != null) {
            interfaceC1349750lED.ZC(view, function0, function02, i, i2);
        }
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
