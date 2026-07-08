package com.ss.android.ugc.aweme.comment.viewerlist.ui;

import X.AbstractC1387200mCc;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0C64;
import X.C0Q4Y;
import X.C0TNQ;
import X.C0Z9X;
import X.C1211690hdX;
import X.C1308910kAL;
import X.C1344030l4z;
import X.C1349280lDS;
import X.C1349800lEI;
import X.C1350920lG6;
import X.C1354730lMF;
import X.C1356890lPj;
import X.C1356900lPk;
import X.C1356910lPl;
import X.C1357100lQ4;
import X.C1372520low;
import X.C13BV;
import X.C13LE;
import X.C14EU;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1749280vcc;
import X.C189200o6;
import X.C1906580ziK;
import X.C1913380ztI;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C20607315kN;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C295780Bia;
import X.C295880Bik;
import X.C297570BlT;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C616540OGe;
import X.C622680Oba;
import X.C722580SWa;
import X.C724750Sbp;
import X.C739870T0n;
import X.C786410Ut5;
import X.C844470XAv;
import X.C888460YtI;
import X.C897520ZIw;
import X.C987103tV;
import X.InterfaceC1258040iqI;
import X.InterfaceC1344590l5t;
import X.InterfaceC1349750lED;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS216S0100000_12;
import Y.AObserverS224S0100000_21;
import Y.ARunnableS116S0100000_16;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.util.ActivityStatusLifecycleOwnerVM;
import com.ss.android.ugc.aweme.comment.viewerlist.adapter.VideoViewerCell;
import com.ss.android.ugc.aweme.comment.viewerlist.adapter.VideoViewerNoMoreLimitCell;
import com.ss.android.ugc.aweme.comment.viewerlist.adapter.ViewerWhiteBoxCell;
import com.ss.android.ugc.aweme.comment.viewerlist.model.ViewCountData;
import com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewerListFragment;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.activestatus.api.analytics.ActivityStatusAnalyticsCommonLifecycleOwner;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.publish.IAVPublishWhiteBoxService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes22.dex */
public final class VideoViewerListFragment extends AmeBaseFragment implements InterfaceC1344590l5t, InterfaceC1349750lED, ICommentPageReusedProtocol, InterfaceC1258040iqI {
    public static final C1356910lPl LLJJJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjFiPyY2HELIOSPyA+JSYgPGs5IGEFISEpJhk6LTIpOwM6OzEKOy40JSAiPQ==";
    public C1749280vcc LL;
    public TuxTextView LLILLJJLI;
    public ViewOnAttachStateChangeListenerC20604515jv LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public C1349800lEI LLIZ;
    public Aweme LLIZLLLIL;
    public boolean LLJ;
    public long LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public final AssemVMLazy LLJJJ;
    public final C01GW LLJJJIL;
    public C1356900lPk LLJJJJ;
    public final C722580SWa LLJI = new C722580SWa();
    public String LLJIJIL = "";
    public volatile boolean LLJJ = true;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 263));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 262));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 256));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 257));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 258));

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0lPl] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoViewerListFragment.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(VideoViewerListFragment.class, "activityStatusLifecycleOwnerVM", "getActivityStatusLifecycleOwnerVM()Lcom/ss/android/ugc/aweme/comment/util/ActivityStatusLifecycleOwnerVM;", 0)};
        LLJJJJJIL = new Object() { // from class: X.0lPl
        };
    }

    @Override // X.InterfaceC1349750lED
    public final void B7() {
    }

    @Override // X.InterfaceC1349750lED
    public final void BC(boolean z) {
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable Cw(boolean z) {
        return null;
    }

    @Override // X.InterfaceC1344590l5t
    public final Integer DJ() {
        return 3;
    }

    @Override // X.InterfaceC1349750lED
    public final void LJJJJLI() {
    }

    @Override // X.InterfaceC1349750lED
    public final int Rc() {
        return 3;
    }

    @Override // X.InterfaceC1349750lED
    public final void ZC(View view, Function0<Unit> function0, Function0<Unit> function02, int i, int i2) {
    }

    @Override // X.InterfaceC1349750lED
    public final String getTabName() {
        return "view_list";
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public VideoViewerListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ActivityStatusLifecycleOwnerVM.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 397);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(98);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 259), aFwS259S0000000_21, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new AwS565S0100000_21((Fragment) this, 260), aFwS259S0000000_21, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 261), aFwS259S0000000_21, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJ = assemVMLazy;
        this.LLJJJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(149));
    }

    public final ActivityStatusLifecycleOwnerVM MR() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (ActivityStatusLifecycleOwnerVM) assemVMLazy.getValue();
    }

    public final String NR() {
        String aid;
        Aweme aweme = this.LLIZLLLIL;
        return (aweme == null || (aid = aweme.getAid()) == null) ? "" : aid;
    }

    public final C1749280vcc OR() {
        return (C1749280vcc) this.LLJJIII.getValue();
    }

    public final VideoViewerListVM PR() {
        return (VideoViewerListVM) this.LLJJI.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv Wl() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1356900lPk c1356900lPk = this.LLJJJJ;
        if (c1356900lPk != null) {
            ((CopyOnWriteArrayList) Wl().LL.LLJJ.getValue()).remove(c1356900lPk);
            this.LLJJJJ = null;
        }
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        return Wl();
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable aJ() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Context context = getContext();
        if (context == null && ((abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) == null || (context = abstractC1387200mCcLIZIZ.LIZIZ()) == null)) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        Context contextLIZIZ = C295780Bia.LIZIZ ? C1354730lMF.LIZIZ(context) : null;
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(contextLIZIZ == null ? C1354730lMF.LIZIZ(context) : contextLIZIZ, R.raw.icon_play);
        if (contextLIZIZ == null) {
            contextLIZIZ = C1354730lMF.LIZIZ(context);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, contextLIZIZ);
        if (numLIZJ != null) {
            tuxIconDrawable.LJFF(numLIZJ.intValue());
        }
        return tuxIconDrawable;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C897520ZIw c897520ZIwVQ2 = PR().vQ2();
        if (c897520ZIwVQ2 != null) {
            c897520ZIwVQ2.destroy();
        }
        C622680Oba.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(VideoViewerListFragment.class.getName());
        }
        super.onResume();
        if (isViewValid()) {
            if (C297570BlT.LIZIZ()) {
                if (Wl() == null || Wl().getVisibility() != 0) {
                    return;
                }
                int size = ((ArrayList) Wl().getState().LJII()).size();
                for (int i = 0; i < size; i++) {
                    InterfaceC1891350zJl interfaceC1891350zJlLJI = Wl().getState().LJI(i);
                    if (interfaceC1891350zJlLJI instanceof C1356890lPj) {
                        C1356890lPj c1356890lPj = (C1356890lPj) interfaceC1891350zJlLJI;
                        String uid = c1356890lPj.LL.getUid();
                        if (uid != null && uid.length() != 0) {
                            C1211690hdX c1211690hdX = C1211690hdX.LIZ;
                            User user = c1356890lPj.LL;
                            c1211690hdX.getClass();
                            Wl().getState().LJIILJJIL(i, C1356890lPj.LIZ(c1356890lPj, C1211690hdX.LIZ(user), 47));
                        }
                    }
                }
            }
            if (this.LLJILJILJ != 0) {
                this.LLJILLL += System.currentTimeMillis() - this.LLJILJILJ;
                this.LLJILJILJ = 0L;
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C897520ZIw c897520ZIwVQ2 = PR().vQ2();
        if (c897520ZIwVQ2 != null) {
            c897520ZIwVQ2.LJ();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LLJILJILJ = System.currentTimeMillis();
        C897520ZIw c897520ZIwVQ2 = PR().vQ2();
        if (c897520ZIwVQ2 != null) {
            c897520ZIwVQ2.LJII();
        }
    }

    @Override // X.InterfaceC1349750lED
    public final void Fv(String str) {
        if (!isViewValid()) {
            return;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.LLJILJIL) - this.LLJILLL;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        C722580SWa c722580SWa = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        CommentContextSource commentContextSourceLIZ = c722580SWa.LIZ(this);
        String str2 = this.LLJIJIL;
        if (str2 == null) {
            str2 = "";
        }
        c1350920lG6.getClass();
        C1350920lG6.LJIIIIZZ(commentContextSourceLIZ, "views", jCurrentTimeMillis, str2, str);
        this.LLJILJIL = 0L;
        this.LLJILLL = 0L;
        RR(false);
        ((C0Z9X) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJIIZILJ("tag_video_viewer_list").LIZ();
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable GF(Context context) {
        Activity activityLIZIZ;
        if (context == null) {
            Context context2 = getContext();
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null) {
                activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            boolean z = C1354730lMF.LIZ;
            if (context2 == null) {
                if (activityLIZIZ == null) {
                    C844470XAv.LIZ.getClass();
                    context2 = C844470XAv.LIZ();
                } else {
                    context2 = activityLIZIZ;
                }
            }
            context = C1354730lMF.LIZIZ(context2);
        }
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(context, R.raw.icon_play);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ != null) {
            tuxIconDrawable.LJFF(numLIZJ.intValue());
        }
        return tuxIconDrawable;
    }

    @Override // X.InterfaceC1349750lED
    public final void Pz(String str) {
        if (!isViewValid()) {
            return;
        }
        this.LLJIJIL = str;
        this.LLJILJIL = System.currentTimeMillis();
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        C722580SWa c722580SWa = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        CommentContextSource commentContextSourceLIZ = c722580SWa.LIZ(this);
        c1350920lG6.getClass();
        C1350920lG6.LJIIJ(commentContextSourceLIZ, "views", str);
        if (isViewValid()) {
            C1344030l4z.LIZJ("VideoViewerListFragment", "onCommentPageShow");
            if (this.LLJ) {
                RR(true);
            }
            SR(false);
        }
    }

    public final void RR(boolean z) {
        if (isViewValid() && !Intrinsics.LJFF(Boolean.valueOf(z), PR().wQ2().getValue())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyPageShow: ");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            if (z) {
                ((Set) PR().LLILZIL.getValue()).clear();
                ((Set) PR().LLILZLL.getValue()).clear();
            }
            PR().wQ2().setValue(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public final void SR(boolean z) {
        ?? arrayList;
        String enterFrom;
        boolean zLJI = MethodIDManager.LJI(71994);
        if (!isViewValid()) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        ViewerListResponse viewerListResponseXQ2 = PR().xQ2();
        if (this.LLJJ || viewerListResponseXQ2 != null) {
            Wl().getState().LJFF(null);
            if (z && OR() != null) {
                C1913380ztI.LLILLJJLI.resetTipsBarrier(OR());
            }
            this.LLJJ = false;
            C1344030l4z.LIZJ("VideoViewerListFragment", "triggerRefresh");
            if (((ArrayList) Wl().getState().LJII()).isEmpty() && viewerListResponseXQ2 != null) {
                List<User> viewerList = viewerListResponseXQ2.getViewerList();
                if (viewerList != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(viewerList, 10));
                    for (User user : viewerList) {
                        String strNR = NR();
                        Aweme aweme = this.LLIZLLLIL;
                        C1349800lEI c1349800lEI = this.LLIZ;
                        if (c1349800lEI == null || (enterFrom = c1349800lEI.getEnterFrom()) == null) {
                            enterFrom = "";
                        }
                        arrayList.add(new C1356890lPj(user, new C1357100lQ4(aweme, strNR, enterFrom), null, false, 28));
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                Wl().getState().LJIILL(arrayList, null);
            }
            IPageActionBarAbility iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPageActionBarAbility.class, null);
            if (iPageActionBarAbility != null) {
                iPageActionBarAbility.K01();
            }
            PR().LLJJIII.getOperator().refresh();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    public final void bT(Aweme aweme) {
        String aid;
        String enterFrom;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAwemeChange, last:");
        sbLIZ.append(NR());
        sbLIZ.append(", cur:");
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        String strNR = NR();
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        if (!Intrinsics.LJFF(strNR, aid2)) {
            this.LLJJ = true;
        }
        this.LLIZLLLIL = aweme;
        PR().LLILLL = this.LLIZLLLIL;
        VideoViewerListVM videoViewerListVMPR = PR();
        C1349800lEI c1349800lEI = this.LLIZ;
        if (c1349800lEI == null || (enterFrom = c1349800lEI.getEnterFrom()) == null) {
            enterFrom = "";
        }
        videoViewerListVMPR.LLILZ = enterFrom;
        SR(true);
    }

    @Override // X.InterfaceC1344590l5t
    public final CharSequence c4(Context context) {
        long j;
        long jLIZLLL;
        if (C1349280lDS.LJIIJJI()) {
            if (!isViewValid()) {
                jLIZLLL = this.LLILZ;
            } else {
                jLIZLLL = C0TNQ.LIZLLL(this.LLIZLLLIL);
            }
            return C1372520low.LIZIZ(this.LLIZLLLIL, jLIZLLL);
        }
        if (context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        String string = context.getResources().getString(2131858199);
        if (!isViewValid()) {
            j = this.LLILZ;
        } else {
            j = this.LLILZLL;
            long jLIZLLL2 = C0TNQ.LIZLLL(this.LLIZLLLIL);
            if (jLIZLLL2 >= j) {
                j = jLIZLLL2;
            }
        }
        this.LLILZIL = j;
        return u.LJJIFFI(string, "%s", C1372520low.LIZIZ(this.LLIZLLLIL, j), false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        C20600815jK<InterfaceC1891350zJl> state;
        String uid;
        User user;
        C1344030l4z.LIZJ("VideoViewerListFragment", "onBlockUserEvent refresh ");
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl = Wl();
        if (viewOnAttachStateChangeListenerC20604515jvWl != null && (state = viewOnAttachStateChangeListenerC20604515jvWl.getState()) != null) {
            for (InterfaceC1891350zJl interfaceC1891350zJl : state.LJII()) {
                if (interfaceC1891350zJl instanceof C1356890lPj) {
                    String uid2 = ((C1356890lPj) interfaceC1891350zJl).LL.getUid();
                    if (c888460YtI != null && (user = c888460YtI.LIZ) != null) {
                        uid = user.getUid();
                    } else {
                        uid = null;
                    }
                    if (Intrinsics.LJFF(uid2, uid)) {
                        C1344030l4z.LIZJ("VideoViewerListFragment", "onBlockUserEvent view in list ");
                        this.LLJJ = true;
                        SR(false);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        C1349800lEI c1349800lEI = null;
        if (arguments != null) {
            serializable = arguments.getSerializable(FollowStatusChangeMethod.PARAM_UID);
        } else {
            serializable = null;
        }
        if (serializable instanceof C1349800lEI) {
            c1349800lEI = (C1349800lEI) serializable;
        }
        this.LLIZ = c1349800lEI;
        MR().LL = new ActivityStatusAnalyticsCommonLifecycleOwner(this, false);
        ActivityStatusAnalyticsCommonLifecycleOwner activityStatusAnalyticsCommonLifecycleOwner = MR().LL;
        if (activityStatusAnalyticsCommonLifecycleOwner != null) {
            activityStatusAnalyticsCommonLifecycleOwner.LIZLLL();
        }
        C622680Oba.LIZJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReceiveCommentListPageDialogEvent(C739870T0n c739870T0n) {
        if (c739870T0n.LIZ == 1) {
            ActivityStatusAnalyticsCommonLifecycleOwner activityStatusAnalyticsCommonLifecycleOwner = MR().LL;
            if (activityStatusAnalyticsCommonLifecycleOwner != null) {
                activityStatusAnalyticsCommonLifecycleOwner.LIZLLL();
                return;
            }
            return;
        }
        ActivityStatusAnalyticsCommonLifecycleOwner activityStatusAnalyticsCommonLifecycleOwner2 = MR().LL;
        if (activityStatusAnalyticsCommonLifecycleOwner2 == null) {
            return;
        }
        activityStatusAnalyticsCommonLifecycleOwner2.LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.0lPk, X.15k8] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String enterFrom;
        String string;
        super.onViewCreated(view, bundle);
        String insertViewUserIds = null;
        C1554610qYd.LIZJ(C1558360qeg.LJFF(this, null), ICommentPageReusedProtocol.class, C1697810uHb.LJIILJJIL(this));
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl = Wl();
        if (viewOnAttachStateChangeListenerC20604515jvWl != 0) {
            viewOnAttachStateChangeListenerC20604515jvWl.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jvWl.LJIILJJIL(VideoViewerCell.class);
            viewOnAttachStateChangeListenerC20604515jvWl.LJIILJJIL(VideoViewerNoMoreLimitCell.class);
            viewOnAttachStateChangeListenerC20604515jvWl.LJIILJJIL(ViewerWhiteBoxCell.class);
            ?? r1 = new C20607315kN() { // from class: X.0lPk
                @Override // X.C20607315kN
                public final void LJIIIIZZ() {
                    VideoViewerListFragment videoViewerListFragment = this.LL;
                    videoViewerListFragment.getClass();
                    C1344030l4z.LIZJ("VideoViewerListFragment", "onLoading");
                    if (videoViewerListFragment.PR().xQ2() == null) {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl2 = videoViewerListFragment.Wl();
                        if (viewOnAttachStateChangeListenerC20604515jvWl2 != null) {
                            C1351950lHl.LJIJJ(viewOnAttachStateChangeListenerC20604515jvWl2);
                        }
                        C1351950lHl.LJIJJLI(videoViewerListFragment.OR());
                        videoViewerListFragment.OR().LJ();
                    }
                    C1351950lHl.LJIJJ((View) videoViewerListFragment.LLJJIJI.getValue());
                }

                @Override // X.C20607315kN
                public final void LJII(Exception exc) {
                    VideoViewerListFragment videoViewerListFragment = this.LL;
                    videoViewerListFragment.getClass();
                    C1344030l4z.LIZJ("VideoViewerListFragment", "onLoadError");
                    C786410Ut5.LLLZLZ(videoViewerListFragment.OR(), 0);
                    C1913380ztI c1913380ztI = C1913380ztI.LLILLJJLI;
                    if (c1913380ztI.isStandardUIEnable()) {
                        c1913380ztI.setStatusView(videoViewerListFragment.OR(), "viewer_list_page", new AwS565S0100000_21(videoViewerListFragment, 1210), exc);
                        C19EG activity = videoViewerListFragment.getActivity();
                        if (activity != null) {
                            c1913380ztI.triggerNetworkTips(activity, "viewer_list_page", (Exception) null, videoViewerListFragment.OR());
                        }
                    } else {
                        videoViewerListFragment.OR().setStatus((C1722300uv6) videoViewerListFragment.LLJJIJIL.getValue());
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl2 = videoViewerListFragment.Wl();
                    if (viewOnAttachStateChangeListenerC20604515jvWl2 != null) {
                        C1351950lHl.LJIJJ(viewOnAttachStateChangeListenerC20604515jvWl2);
                    }
                    C1351950lHl.LJIJJ((View) videoViewerListFragment.LLJJIJI.getValue());
                }

                @Override // X.C20607315kN
                public final void LJIIIZ(boolean z) {
                    long playCount;
                    Aweme aweme;
                    AwemeStatistics statistics;
                    IAVPublishWhiteBoxService iAVPublishWhiteBoxService;
                    String aid;
                    Aweme aweme2;
                    Aweme aweme3;
                    Aweme aweme4;
                    boolean zBooleanValue;
                    long jLongValue;
                    long playCount2;
                    String enterFrom2;
                    AwemeStatistics statistics2;
                    Long l;
                    Boolean boolIsMilestoneView;
                    C20600815jK<InterfaceC1891350zJl> state;
                    Context context;
                    C1749280vcc c1749280vccOR;
                    int i;
                    C637920P0k.LIZ(this.LL.Wl(), new ARunnableS116S0100000_16(this.LL, 28));
                    VideoViewerListFragment videoViewerListFragment = this.LL;
                    videoViewerListFragment.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onLoadSuccess ");
                    sbLIZ.append(videoViewerListFragment.Wl().getState().LJIIIIZZ());
                    C1344030l4z.LIZJ("VideoViewerListFragment", C2188811AlT.LIZIZ(sbLIZ));
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl2 = videoViewerListFragment.Wl();
                    boolean z2 = true;
                    if (viewOnAttachStateChangeListenerC20604515jvWl2 != null && (state = viewOnAttachStateChangeListenerC20604515jvWl2.getState()) != null && ((ArrayList) state.LJII()).isEmpty()) {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl3 = videoViewerListFragment.Wl();
                        if (viewOnAttachStateChangeListenerC20604515jvWl3 != null) {
                            C1351950lHl.LJIJJ(viewOnAttachStateChangeListenerC20604515jvWl3);
                        }
                        C1749280vcc c1749280vccOR2 = videoViewerListFragment.OR();
                        if (c1749280vccOR2 != null) {
                            C786410Ut5.LLLZLZ(c1749280vccOR2, 0);
                        }
                        C1749280vcc c1749280vccOR3 = videoViewerListFragment.OR();
                        if (c1749280vccOR3 != null && (context = c1749280vccOR3.getContext()) != null && (c1749280vccOR = videoViewerListFragment.OR()) != null) {
                            C1722300uv6 c1722300uv6 = new C1722300uv6();
                            Resources resources = context.getResources();
                            if (videoViewerListFragment.PR().zQ2()) {
                                i = 2131837201;
                            } else {
                                i = 2131858178;
                            }
                            c1722300uv6.LJIIIIZZ = resources.getString(i);
                            c1749280vccOR.setStatus(c1722300uv6);
                        }
                        View view2 = (View) videoViewerListFragment.LLJJIJI.getValue();
                        if (view2 != null) {
                            C1351950lHl.LJIJJ(view2);
                        }
                    } else {
                        View view3 = (View) videoViewerListFragment.LLJJIJI.getValue();
                        if (view3 != null) {
                            C1351950lHl.LJIJJ(view3);
                        }
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl4 = videoViewerListFragment.Wl();
                        if (viewOnAttachStateChangeListenerC20604515jvWl4 != null) {
                            C1351950lHl.LJIJJLI(viewOnAttachStateChangeListenerC20604515jvWl4);
                        }
                        C786410Ut5.LLLZLZ(videoViewerListFragment.OR(), 8);
                    }
                    ViewerListResponse viewerListResponseXQ2 = videoViewerListFragment.PR().xQ2();
                    long jLongValue2 = 0;
                    String enterFrom3 = null;
                    if (viewerListResponseXQ2 != null && ((C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_show_comment_cold_start_traffic", true) == 1 || C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_show_comment_play_milestone", true) == 1) && (iAVPublishWhiteBoxService = (IAVPublishWhiteBoxService) videoViewerListFragment.LLJJJIL.getValue()) != null)) {
                        Aweme aweme5 = videoViewerListFragment.LLIZLLLIL;
                        if (aweme5 != null) {
                            aid = aweme5.getAid();
                        } else {
                            aid = null;
                        }
                        if (iAVPublishWhiteBoxService.enableShowWhiteBoxedCard(aid) && (aweme2 = videoViewerListFragment.LLIZLLLIL) != null && AwemeExtKt.isPublic(aweme2) && (((aweme3 = videoViewerListFragment.LLIZLLLIL) == null || !aweme3.getIsTikTokStory()) && ((aweme4 = videoViewerListFragment.LLIZLLLIL) == null || aweme4.getAwemeType() != 40))) {
                            Iterator it2 = ((ArrayList) videoViewerListFragment.Wl().getState().LJII()).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Object next = it2.next();
                                if (next instanceof C1158250gFL) {
                                    if (next == null) {
                                        break;
                                    }
                                }
                            }
                            ViewCountData viewCountData = viewerListResponseXQ2.getViewCountData();
                            if (viewCountData != null && (boolIsMilestoneView = viewCountData.isMilestoneView()) != null) {
                                zBooleanValue = boolIsMilestoneView.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            ViewCountData viewCountData2 = viewerListResponseXQ2.getViewCountData();
                            if (viewCountData2 != null && (l = viewCountData2.coldStartViewCount) != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            C0W8I.LIZ.getClass();
                            if (C0W8I.LIZIZ() || C0W8I.LIZJ()) {
                                int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "publish_video_view_white_box_mock", true);
                                if (iLJIJ != 2 && iLJIJ != 3) {
                                    if (iLJIJ == 4 || iLJIJ == 5) {
                                    }
                                } else {
                                    z2 = false;
                                }
                                jLongValue = 1000;
                                zBooleanValue = z2;
                            }
                            if (!zBooleanValue && jLongValue <= 0) {
                                C1749280vcc c1749280vccOR4 = videoViewerListFragment.OR();
                                if (c1749280vccOR4 != null) {
                                    C786410Ut5.xd(c1749280vccOR4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                                }
                            } else {
                                C1749280vcc c1749280vccOR5 = videoViewerListFragment.OR();
                                if (c1749280vccOR5 != null) {
                                    C786410Ut5.xd(c1749280vccOR5, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)));
                                }
                                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl5 = videoViewerListFragment.Wl();
                                if (viewOnAttachStateChangeListenerC20604515jvWl5 != null) {
                                    C1351950lHl.LJIJJLI(viewOnAttachStateChangeListenerC20604515jvWl5);
                                }
                                Aweme aweme6 = videoViewerListFragment.LLIZLLLIL;
                                if (aweme6 != null && (statistics2 = aweme6.getStatistics()) != null) {
                                    playCount2 = statistics2.getPlayCount();
                                } else {
                                    playCount2 = 0;
                                }
                                Aweme aweme7 = videoViewerListFragment.LLIZLLLIL;
                                if (aweme7 == null) {
                                    aweme7 = new Aweme();
                                }
                                C1349800lEI c1349800lEI = videoViewerListFragment.LLIZ;
                                if (c1349800lEI == null || (enterFrom2 = c1349800lEI.getEnterFrom()) == null) {
                                    enterFrom2 = "";
                                }
                                C20600815jK.LIZIZ(videoViewerListFragment.Wl().getState(), 0, new C1158250gFL(jLongValue, playCount2, aweme7, enterFrom2, zBooleanValue));
                                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl6 = videoViewerListFragment.Wl();
                                if (viewOnAttachStateChangeListenerC20604515jvWl6 != null) {
                                    C1206770hVb.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), viewOnAttachStateChangeListenerC20604515jvWl6);
                                }
                            }
                        }
                    }
                    C1349800lEI c1349800lEI2 = this.LL.LLIZ;
                    if (c1349800lEI2 != null && (aweme = c1349800lEI2.getAweme()) != null && (statistics = aweme.getStatistics()) != null) {
                        playCount = statistics.getPlayCount();
                    } else {
                        playCount = 0;
                    }
                    Long l2 = (Long) ((Map) this.LL.PR().LLIZLLLIL.getValue()).get(this.LL.NR());
                    if (l2 != null) {
                        jLongValue2 = l2.longValue();
                    }
                    C1349800lEI c1349800lEI3 = this.LL.LLIZ;
                    if (c1349800lEI3 != null && c1349800lEI3.getInsertViewUserIds() != null) {
                        this.LL.Wl().LJIIJ();
                        HandlerHook.viewPost(this.LL.Wl(), new ARunnableS116S0100000_16(viewOnAttachStateChangeListenerC20604515jvWl, 29));
                        C1349800lEI c1349800lEI4 = this.LL.LLIZ;
                        if (c1349800lEI4 != null) {
                            c1349800lEI4.setInsertViewUserIds(null);
                        }
                    }
                    C1349800lEI c1349800lEI5 = this.LL.LLIZ;
                    if (c1349800lEI5 != null) {
                        enterFrom3 = c1349800lEI5.getEnterFrom();
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", enterFrom3);
                    c2344009Gk.LIZLLL(playCount, "vv_cnt");
                    c2344009Gk.LIZLLL(jLongValue2, "views_show_cnt");
                    C1350920lG6.LJJJ(c2344009Gk, "enter_video_views_panel");
                }
            };
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService != null && iDetailFeedSafService.LIZLLL(this) != null) {
                this.LLJJJJ = r1;
            }
            viewOnAttachStateChangeListenerC20604515jvWl.LJII(r1);
            viewOnAttachStateChangeListenerC20604515jvWl.LJIIL(PR().LLJJIII);
            viewOnAttachStateChangeListenerC20604515jvWl.getState().LIZLLL = C0Q4Y.BUFFER;
        }
        if (PR().zQ2()) {
            View viewFindViewById = this.LLILLJJLI;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.h2b);
                } else {
                    viewFindViewById = null;
                }
                this.LLILLJJLI = (TuxTextView) viewFindViewById;
            }
            TextView textView = (TextView) viewFindViewById;
            Context context = getContext();
            if (context != null) {
                string = context.getString(2131837201);
            } else {
                string = null;
            }
            textView.setText(string);
        }
        PR().LLILLL = this.LLIZLLLIL;
        VideoViewerListVM videoViewerListVMPR = PR();
        C1349800lEI c1349800lEI = this.LLIZ;
        if (c1349800lEI == null || (enterFrom = c1349800lEI.getEnterFrom()) == null) {
            enterFrom = "";
        }
        videoViewerListVMPR.LLILZ = enterFrom;
        VideoViewerListVM videoViewerListVMPR2 = PR();
        C1349800lEI c1349800lEI2 = this.LLIZ;
        if (c1349800lEI2 != null) {
            insertViewUserIds = c1349800lEI2.getInsertViewUserIds();
        }
        videoViewerListVMPR2.LLJIJIL = insertViewUserIds;
        ((LiveData) PR().LLJ.getValue()).observe(this, new AObserverS216S0100000_12(this, 32));
        ((LiveData) PR().LLJILJILJ.getValue()).observe(this, new AObserverS216S0100000_12(this, 33));
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_show_comment_cold_start_traffic", true) == 1 || C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_show_comment_play_milestone", true) == 1) {
            ((LiveData) PR().LLJJI.getValue()).observe(this, new AObserverS224S0100000_21(this, 27));
        }
        this.LLJJ = true;
        if (this.LLJ) {
            RR(true);
        }
        SR(false);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        Context contextLIZIZ;
        if (C295880Bik.LIZLLL) {
            if (!C295780Bia.LIZIZ || viewGroup == null || (contextLIZIZ = viewGroup.getContext()) == null) {
                boolean z = C1354730lMF.LIZ;
                contextLIZIZ = C1354730lMF.LIZIZ(layoutInflater.getContext());
            }
            viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(contextLIZIZ), R.layout.a2d, viewGroup, false);
        } else {
            getActivity();
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.a2d, viewGroup, false);
        }
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

    @Override // X.InterfaceC1349750lED
    public final void u5(String str, String str2, boolean z) {
        String insertViewUserIds;
        if (!isViewValid()) {
            return;
        }
        if (z) {
            this.LLJIJIL = str;
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            C722580SWa c722580SWa = this.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
            CommentContextSource commentContextSourceLIZ = c722580SWa.LIZ(this);
            c1350920lG6.getClass();
            C1350920lG6.LJIIJ(commentContextSourceLIZ, "views", str);
        }
        if (isViewValid()) {
            this.LLJ = z;
            VideoViewerListVM videoViewerListVMPR = PR();
            C1349800lEI c1349800lEI = this.LLIZ;
            if (c1349800lEI != null) {
                insertViewUserIds = c1349800lEI.getInsertViewUserIds();
            } else {
                insertViewUserIds = null;
            }
            videoViewerListVMPR.LLJIJIL = insertViewUserIds;
            RR(z);
            if (!z && Wl() != null) {
                C2211751BhN.LIZIZ(Wl());
            }
        }
    }
}
