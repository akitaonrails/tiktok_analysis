package com.ss.android.ugc.aweme.comment.likelist.ui;

import X.AbstractC1387200mCc;
import X.AbstractC329610Cw3;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0O26;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0Z9X;
import X.C1211690hdX;
import X.C1308910kAL;
import X.C1349280lDS;
import X.C1349800lEI;
import X.C1350920lG6;
import X.C1351950lHl;
import X.C1354730lMF;
import X.C1355640lNi;
import X.C1356850lPf;
import X.C1356860lPg;
import X.C1357110lQ5;
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
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C1906580ziK;
import X.C1913380ztI;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20603715jn;
import X.C20607315kN;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C295780Bia;
import X.C295880Bik;
import X.C297570BlT;
import X.C338490DOt;
import X.C418440Gaw;
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
import X.C814420VxA;
import X.C844470XAv;
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
import Y.AObserverS224S0100000_21;
import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.comment.likelist.adapter.LikeCell;
import com.ss.android.ugc.aweme.comment.likelist.adapter.LikeLoadMoreCell;
import com.ss.android.ugc.aweme.comment.likelist.adapter.LikeNoMoreLimitCell;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.util.ActivityStatusLifecycleOwnerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.activestatus.api.analytics.ActivityStatusAnalyticsCommonLifecycleOwner;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes22.dex */
public final class LikeListFragment extends AmeBaseFragment implements InterfaceC1344590l5t, InterfaceC1349750lED, ICommentPageReusedProtocol, InterfaceC1258040iqI {
    public static final C1355640lNi LLJJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjHELIOSFiJSY4LSklOjt9PSxiBSY4LQklOjsVOiQrJCo9PA==";
    public C1749280vcc LL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILLJJLI;
    public TuxTextView LLILLL;
    public Aweme LLILZ;
    public long LLILZIL;
    public C1349800lEI LLILZLL;
    public String LLIZ;
    public int LLIZLLLIL;
    public boolean LLJI;
    public long LLJJIJI;
    public long LLJJIJIIJIL;
    public long LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final C1356850lPf LLJJJIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 199));
    public volatile boolean LLJIJIL = true;
    public C1357110lQ5 LLJILJIL = new C1357110lQ5(null, "", "");
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 206));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 200));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 198));
    public final C722580SWa LLJJI = new C722580SWa();
    public String LLJJIII = "";

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0lNi] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LikeListFragment.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(LikeListFragment.class, "activityStatusLifecycleOwnerVM", "getActivityStatusLifecycleOwnerVM()Lcom/ss/android/ugc/aweme/comment/util/ActivityStatusLifecycleOwnerVM;", 0)};
        LLJJJJ = new Object() { // from class: X.0lNi
        };
        LLJJJJLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
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
        return 2;
    }

    @Override // X.InterfaceC1349750lED
    public final void LJJJJLI() {
    }

    @Override // X.InterfaceC1349750lED
    public final int Rc() {
        return 2;
    }

    @Override // X.InterfaceC1349750lED
    public final void ZC(View view, Function0<Unit> function0, Function0<Unit> function02, int i, int i2) {
    }

    public final void ZR() {
        IPageActionBarAbility iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPageActionBarAbility.class, null);
        if (iPageActionBarAbility != null) {
            iPageActionBarAbility.K01();
        }
    }

    @Override // X.InterfaceC1349750lED
    public final String getTabName() {
        return "like_list";
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0lPf] */
    public LikeListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ActivityStatusLifecycleOwnerVM.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 388);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(80);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 203), aFwS259S0000000_21, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new AwS565S0100000_21((Fragment) this, 204), aFwS259S0000000_21, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 205), aFwS259S0000000_21, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJ = assemVMLazy;
        final C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 10;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = LikeLoadMoreCell.class;
        this.LLJJJIL = new AbstractC329610Cw3<List<? extends User>>(c20603715jn) { // from class: X.0lPf
            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<List<User>>> interfaceC1364105Vn) {
                String str;
                if (!this.LIZIZ.isViewValid()) {
                    return;
                }
                if (this.LIZIZ.LLJIJIL || ((str = this.LIZIZ.LLIZ) != null && !Intrinsics.LJFF(str, "landing_tag"))) {
                    this.LIZIZ.LLJIJIL = false;
                    this.LIZIZ.MR(C13BV.INSTANCE, interfaceC1364105Vn);
                    return;
                }
                LikeListResponse likeListResponseYQ2 = this.LIZIZ.PR().yQ2();
                if (likeListResponseYQ2 != null) {
                    this.LIZIZ.UR(likeListResponseYQ2, null, interfaceC1364105Vn, C13BV.INSTANCE, null);
                } else {
                    C1344030l4z.LIZ("LikeListFragment", "configList onRefresh unknown error");
                }
            }

            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onLoadMore(InterfaceC1364105Vn interfaceC1364105Vn, Object obj) {
                List list = (List) obj;
                if (this.LIZIZ.isViewValid()) {
                    this.LIZIZ.MR(list, interfaceC1364105Vn);
                }
            }
        };
    }

    public final ActivityStatusLifecycleOwnerVM NR() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (ActivityStatusLifecycleOwnerVM) assemVMLazy.getValue();
    }

    public final String OR() {
        String aid;
        Aweme aweme = this.LLILZ;
        return (aweme == null || (aid = aweme.getAid()) == null) ? "" : aid;
    }

    public final LikeListVM PR() {
        return (LikeListVM) this.LLJ.getValue();
    }

    public final C1749280vcc RR() {
        return (C1749280vcc) this.LLJILJILJ.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv Wl() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        return Wl();
    }

    public final void VR() {
        C1351950lHl.LJIJJLI(RR());
        C1749280vcc c1749280vccRR = RR();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJIIIIZZ = getString(2131833942);
        c1749280vccRR.setStatus(c1722300uv6);
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
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(contextLIZIZ == null ? C1354730lMF.LIZIZ(context) : contextLIZIZ, R.raw.icon_heart);
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

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(LikeListFragment.class.getName());
        }
        super.onResume();
        if (isViewValid()) {
            if (C297570BlT.LIZLLL()) {
                if (Wl() == null || Wl().getVisibility() != 0) {
                    return;
                }
                int size = ((ArrayList) Wl().getState().LJII()).size();
                for (int i = 0; i < size; i++) {
                    InterfaceC1891350zJl interfaceC1891350zJlLJI = Wl().getState().LJI(i);
                    if (interfaceC1891350zJlLJI instanceof C1356860lPg) {
                        C1356860lPg c1356860lPg = (C1356860lPg) interfaceC1891350zJlLJI;
                        String uid = c1356860lPg.LL.getUid();
                        if (uid != null && uid.length() != 0) {
                            C1211690hdX c1211690hdX = C1211690hdX.LIZ;
                            User user = c1356860lPg.LL;
                            c1211690hdX.getClass();
                            Wl().getState().LJIILJJIL(i, new C1356860lPg(c1356860lPg.LL, c1356860lPg.LLILLJJLI, c1356860lPg.LLILLL, c1356860lPg.LLILZ, c1356860lPg.LLILZIL, C1211690hdX.LIZ(user)));
                        }
                    }
                }
            }
            if (this.LLJJIJIIJIL != 0) {
                this.LLJJIJIL += System.currentTimeMillis() - this.LLJJIJIIJIL;
                this.LLJJIJIIJIL = 0L;
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
        this.LLJJIJIIJIL = System.currentTimeMillis();
        C897520ZIw c897520ZIwVQ2 = PR().vQ2();
        if (c897520ZIwVQ2 != null) {
            c897520ZIwVQ2.LJII();
        }
    }

    @Override // X.InterfaceC1349750lED
    public final void Fv(String str) {
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.LLJJIJI) - this.LLJJIJIL;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        C722580SWa c722580SWa = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        CommentContextSource commentContextSourceLIZ = c722580SWa.LIZ(this);
        String str2 = this.LLJJIII;
        if (str2 == null) {
            str2 = "";
        }
        c1350920lG6.getClass();
        C1350920lG6.LJIIIIZZ(commentContextSourceLIZ, "like", jCurrentTimeMillis, str2, str);
        this.LLJJIJI = 0L;
        this.LLJJIJIL = 0L;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCommentPageDismiss LikeListFragment  ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        SR(false);
        ((C0Z9X) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJIIZILJ("tag_like_list").LIZ();
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable GF(Context context) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        if (context == null) {
            boolean z = C1354730lMF.LIZ;
            Context context2 = getContext();
            if (context2 == null && ((abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) == null || (context2 = abstractC1387200mCcLIZIZ.LIZIZ()) == null)) {
                C844470XAv.LIZ.getClass();
                context2 = C844470XAv.LIZ();
            }
            context = C1354730lMF.LIZIZ(context2);
        }
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(context, R.raw.icon_heart);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ != null) {
            tuxIconDrawable.LJFF(numLIZJ.intValue());
        }
        return tuxIconDrawable;
    }

    @Override // X.InterfaceC1349750lED
    public final void Pz(String str) {
        this.LLJJIII = str;
        this.LLJJIJI = System.currentTimeMillis();
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        C722580SWa c722580SWa = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        CommentContextSource commentContextSourceLIZ = c722580SWa.LIZ(this);
        c1350920lG6.getClass();
        C1350920lG6.LJIIJ(commentContextSourceLIZ, "like", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCommentPageShow LikeListFragment  ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJI) {
            SR(true);
        }
        WR(true);
    }

    public final void SR(boolean z) {
        if (isViewValid() && !Intrinsics.LJFF(Boolean.valueOf(z), PR().zQ2().getValue())) {
            if (z) {
                ((Set) PR().LLJ.getValue()).clear();
            }
            PR().zQ2().setValue(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public final void WR(boolean z) {
        ?? arrayList;
        List<User> likeList;
        if (!isViewValid()) {
            return;
        }
        LikeListVM likeListVMPR = PR();
        String strOR = OR();
        if (!Intrinsics.LJFF(likeListVMPR.LLILLJJLI, strOR)) {
            likeListVMPR.LLILLJJLI = strOR;
        }
        LikeListResponse likeListResponseYQ2 = PR().yQ2();
        if (this.LLJIJIL || likeListResponseYQ2 != null) {
            if (z && RR() != null) {
                C1913380ztI.LLILLJJLI.resetTipsBarrier(RR());
            }
            ZR();
            if (likeListResponseYQ2 != null && (likeList = likeListResponseYQ2.getLikeList()) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(likeList, 10));
                Iterator<User> it2 = likeList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C1356860lPg(it2.next(), this.LLJILJIL, false, null, 56));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            C897520ZIw c897520ZIwVQ2 = PR().vQ2();
            if (c897520ZIwVQ2 != null) {
                c897520ZIwVQ2.LJIIIIZZ(C0O26.LIZIZ(arrayList, AFwS259S0000000_21.get$arr$(81)));
            }
            Wl().getState().LJIILL(arrayList, null);
            getOperator().refresh();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    public final void bT(Aweme aweme) {
        String aid;
        String enterFrom;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAwemeChange, last:");
        sbLIZ.append(OR());
        sbLIZ.append(", cur:");
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        String strOR = OR();
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        if (!Intrinsics.LJFF(strOR, aid2)) {
            this.LLJIJIL = true;
        }
        this.LLILZ = aweme;
        String strOR2 = OR();
        Aweme aweme2 = this.LLILZ;
        C1349800lEI c1349800lEI = this.LLILZLL;
        if (c1349800lEI == null || (enterFrom = c1349800lEI.getEnterFrom()) == null) {
            enterFrom = "";
        }
        this.LLJILJIL = new C1357110lQ5(aweme2, strOR2, enterFrom);
        WR(true);
    }

    @Override // X.InterfaceC1344590l5t
    public final CharSequence c4(Context context) {
        long jXQ2;
        long jXQ22;
        if (C1349280lDS.LJIIJJI()) {
            if (!isViewValid()) {
                jXQ22 = this.LLILZIL;
            } else {
                jXQ22 = PR().xQ2(this.LLILZ);
            }
            return C1372520low.LIZIZ(this.LLILZ, jXQ22);
        }
        if (context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        String string = context.getResources().getString(2131833938);
        if (!isViewValid()) {
            jXQ2 = this.LLILZIL;
        } else {
            jXQ2 = PR().xQ2(this.LLILZ);
        }
        return u.LJJIFFI(string, "%d", C1372520low.LIZIZ(this.LLILZ, jXQ2), false);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        C1349800lEI c1349800lEI;
        int likeUserCount;
        String enterFrom;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String insertLikeUserIds = null;
        if (arguments != null) {
            serializable = arguments.getSerializable(FollowStatusChangeMethod.PARAM_UID);
        } else {
            serializable = null;
        }
        if (serializable instanceof C1349800lEI) {
            c1349800lEI = (C1349800lEI) serializable;
        } else {
            c1349800lEI = null;
        }
        this.LLILZLL = c1349800lEI;
        if (c1349800lEI != null) {
            insertLikeUserIds = c1349800lEI.getInsertLikeUserIds();
        }
        this.LLIZ = insertLikeUserIds;
        C1349800lEI c1349800lEI2 = this.LLILZLL;
        if (c1349800lEI2 != null) {
            likeUserCount = c1349800lEI2.getLikeUserCount();
        } else {
            likeUserCount = 0;
        }
        this.LLIZLLLIL = likeUserCount;
        String strOR = OR();
        Aweme aweme = this.LLILZ;
        C1349800lEI c1349800lEI3 = this.LLILZLL;
        if (c1349800lEI3 == null || (enterFrom = c1349800lEI3.getEnterFrom()) == null) {
            enterFrom = "";
        }
        this.LLJILJIL = new C1357110lQ5(aweme, strOR, enterFrom);
        NR().LL = new ActivityStatusAnalyticsCommonLifecycleOwner(this, false);
        ActivityStatusAnalyticsCommonLifecycleOwner activityStatusAnalyticsCommonLifecycleOwner = NR().LL;
        if (activityStatusAnalyticsCommonLifecycleOwner != null) {
            activityStatusAnalyticsCommonLifecycleOwner.LIZLLL();
        }
        C622680Oba.LIZJ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/aweme/comment/likelist/ui/LikeListFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaLrrPbz01xP/0i2XLvV3QlhgBUut5zuryr0NUyg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReceiveCommentListPageDialogEvent(C739870T0n c739870T0n) {
        if (c739870T0n.LIZ == 1) {
            ActivityStatusAnalyticsCommonLifecycleOwner activityStatusAnalyticsCommonLifecycleOwner = NR().LL;
            if (activityStatusAnalyticsCommonLifecycleOwner != null) {
                activityStatusAnalyticsCommonLifecycleOwner.LIZLLL();
                return;
            }
            return;
        }
        ActivityStatusAnalyticsCommonLifecycleOwner activityStatusAnalyticsCommonLifecycleOwner2 = NR().LL;
        if (activityStatusAnalyticsCommonLifecycleOwner2 == null) {
            return;
        }
        activityStatusAnalyticsCommonLifecycleOwner2.LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MR(java.util.List r17, X.InterfaceC1364105Vn r18) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.likelist.ui.LikeListFragment.MR(java.util.List, X.05Vn):void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1554610qYd.LIZJ(C1558360qeg.LJFF(this, null), ICommentPageReusedProtocol.class, C1697810uHb.LJIILJJIL(this));
        Wl().LJIILJJIL(LikeCell.class);
        Wl().LJIILJJIL(LikeNoMoreLimitCell.class);
        Wl().setItemAnimator(null);
        Wl().LJIIL(this.LLJJJIL);
        Wl().LJII(new C20607315kN() { // from class: X.0lPh
            @Override // X.C20607315kN
            public final void LJIIIIZZ() {
                this.LL.RR().LJ();
            }

            @Override // X.C20607315kN
            public final void LJII(Exception exc) {
                C1351950lHl.LJIJJLI(this.LL.RR());
                C1913380ztI c1913380ztI = C1913380ztI.LLILLJJLI;
                if (c1913380ztI.isStandardUIEnable()) {
                    c1913380ztI.setStatusView(this.LL.RR(), "like_list_page", new AwS565S0100000_21(this.LL, 201), exc);
                    C19EG activity = this.LL.getActivity();
                    if (activity != null) {
                        c1913380ztI.triggerNetworkTips(activity, "like_list_page", (Exception) null, this.LL.RR());
                        return;
                    }
                    return;
                }
                C1749280vcc c1749280vccRR = this.LL.RR();
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C1893080zMY.LIZ(c1722300uv6, new AwS565S0100000_21(this.LL, 202));
                c1749280vccRR.setStatus(c1722300uv6);
            }

            @Override // X.C20607315kN
            public final void LJIIIZ(boolean z) {
                C20600815jK<InterfaceC1891350zJl> state;
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl = this.LL.Wl();
                if (viewOnAttachStateChangeListenerC20604515jvWl != null && (state = viewOnAttachStateChangeListenerC20604515jvWl.getState()) != null && state.LJIIIIZZ() > 0) {
                    C1351950lHl.LJIJJ(this.LL.RR());
                }
                C1349800lEI c1349800lEI = this.LL.LLILZLL;
                if (c1349800lEI != null && c1349800lEI.getInsertLikeUserIds() != null) {
                    this.LL.Wl().LJIIJ();
                    HandlerHook.viewPost(this.LL.Wl(), new ARunnableS121S0100000_21(this.LL, 45));
                    C1349800lEI c1349800lEI2 = this.LL.LLILZLL;
                    if (c1349800lEI2 != null) {
                        c1349800lEI2.setInsertLikeUserIds(null);
                    }
                }
            }
        });
        Wl().getState().LIZIZ.observe(getViewLifecycleOwner(), new AObserverS224S0100000_21(this, 22));
        ((LiveData) PR().LLILZLL.getValue()).observe(this, new AObserverS224S0100000_21(this, 52));
        ((LiveData) PR().LLIZ.getValue()).observe(this, new AObserverS224S0100000_21(this, 53));
        if (this.LLJI) {
            SR(true);
        }
        WR(false);
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
            viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(contextLIZIZ), R.layout.a2a, viewGroup, false);
        } else {
            getActivity();
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.a2a, viewGroup, false);
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
        String insertLikeUserIds;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl;
        if (!isViewValid()) {
            return;
        }
        if (z) {
            this.LLJJIII = str;
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            C722580SWa c722580SWa = this.LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
            CommentContextSource commentContextSourceLIZ = c722580SWa.LIZ(this);
            c1350920lG6.getClass();
            C1350920lG6.LJIIJ(commentContextSourceLIZ, "like", str);
        }
        if (isViewValid()) {
            this.LLJI = z;
            C1349800lEI c1349800lEI = this.LLILZLL;
            if (c1349800lEI != null) {
                insertLikeUserIds = c1349800lEI.getInsertLikeUserIds();
            } else {
                insertLikeUserIds = null;
            }
            this.LLIZ = insertLikeUserIds;
            if (!z && (viewOnAttachStateChangeListenerC20604515jvWl = Wl()) != null) {
                C2211751BhN.LIZIZ(viewOnAttachStateChangeListenerC20604515jvWl);
            }
            SR(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void UR(com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse r20, java.lang.Throwable r21, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.util.List<com.ss.android.ugc.aweme.profile.model.User>>> r22, java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r23, java.util.List<java.lang.String> r24) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.likelist.ui.LikeListFragment.UR(com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse, java.lang.Throwable, X.05Vn, java.util.List, java.util.List):void");
    }
}
