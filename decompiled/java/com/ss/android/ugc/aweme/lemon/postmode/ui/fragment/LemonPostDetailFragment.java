package com.ss.android.ugc.aweme.lemon.postmode.ui.fragment;

import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0HYG;
import X.C0N0Y;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1355870lO5;
import X.C1355960lOE;
import X.C1355980lOG;
import X.C1355990lOH;
import X.C1356000lOI;
import X.C1356160lOY;
import X.C13LE;
import X.C14EU;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1ER1;
import X.C20684815ws;
import X.C21146717pB;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C338520DOw;
import X.C442390HWj;
import X.C442430HWn;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C484220Iyq;
import X.C616540OGe;
import X.C641850PFn;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.lemon.postmode.scope.LemonPostFragmentComponentScope;
import com.ss.android.ugc.aweme.lemon.postmode.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.lemon.postmode.ui.photo.model.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.lemon.postmode.viewmodel.LemonPostShareViewModel;
import com.ss.android.ugc.aweme.lemon.postmode.viewmodel.PostModeContainerViewModel;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
public final class LemonPostDetailFragment extends CommonPageFragment implements InterfaceC724530SbT, C0QSJ, InterfaceC1146704e9 {
    public static final C1355980lOG LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZikpJCA9ZjUjOjs+JyHELIOSEpZzo6ZiM+KCg+LSs4ZwM2JSoiGSAgPAEpPS46JAM+KCg+LSs4";
    public LinearLayout LL;
    public FrameLayout LLILLJJLI;
    public C197039127h LLILLL;
    public long LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 683));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 684));
    public C442430HWn LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final C736950SvV LLJ;
    public final AssemVMLazy LLJI;
    public C442390HWj LLJIJIL;
    public C0N0Y LLJILJIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0lOG] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LemonPostDetailFragment.class, "photoViewModel", "getPhotoViewModel()Lcom/ss/android/ugc/aweme/lemon/postmode/ui/photo/model/PostModeFullPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(LemonPostDetailFragment.class, "shareViewModel", "getShareViewModel()Lcom/ss/android/ugc/aweme/lemon/postmode/viewmodel/LemonPostShareViewModel;", 0)};
        LLJILJILJ = new Object() { // from class: X.0lOG
        };
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{LemonPostFragmentComponentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
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
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LemonPostFragmentComponentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LemonPostFragmentComponentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final PhotoSharedViewModel MR() {
        return (PhotoSharedViewModel) this.LLJ.getValue();
    }

    public final PostModeFullPageViewModel NR() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (PostModeFullPageViewModel) assemVMLazy.getValue();
    }

    public LemonPostDetailFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PostModeFullPageViewModel.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 685);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(187);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLIZLLLIL = new AssemVMLazy(function0LJIIJ, awS565S0100000_21, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 686), aFwS259S0000000_21);
        this.LLJ = new C736950SvV(C13LE.LIZ(PhotoSharedViewModel.class), new AwS565S0100000_21((Fragment) this, 1485), c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(410), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LemonPostShareViewModel.class);
        this.LLJI = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), new AwS565S0100000_21(c19719912DlLIZ2, 687), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 688), AFwS259S0000000_21.get$arr$(188));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLJIJIL = null;
        C442390HWj c442390HWj = this.LLJIJIL;
        if (c442390HWj != null) {
            c442390HWj.setTitleComponent(null);
        }
        C442390HWj c442390HWj2 = this.LLJIJIL;
        if (c442390HWj2 != null) {
            c442390HWj2.setDescriptionComponent(null);
        }
        C442390HWj c442390HWj3 = this.LLJIJIL;
        if (c442390HWj3 != null) {
            c442390HWj3.setAnimationComponent(null);
        }
        C442390HWj c442390HWj4 = this.LLJIJIL;
        if (c442390HWj4 != null) {
            c442390HWj4.setPhotosIndicatorComponent(null);
        }
        this.LLIZ = null;
        this.LLJILJIL = null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        View view = this.LLILLL;
        if (view == null) {
            View view2 = getView();
            View viewFindViewById = view2 != null ? view2.findViewById(R.id.f_w) : null;
            this.LLILLL = (C197039127h) viewFindViewById;
            view = viewFindViewById;
        }
        this.LLILLL = (C197039127h) view;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        Aweme aweme;
        PostModeDetailParams postModeDetailParams;
        PostModeDetailParams postModeDetailParams2;
        String str;
        super.onPause();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZ;
        C1356160lOY c1356160lOY = C1356160lOY.LIZ;
        C442430HWn c442430HWn = this.LLIZ;
        if (c442430HWn != null) {
            aweme = c442430HWn.LIZJ;
            postModeDetailParams = c442430HWn.LJI;
        } else {
            aweme = null;
            postModeDetailParams = null;
        }
        c1356160lOY.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1355960lOE.LIZJ(c2344009Gk, postModeDetailParams);
        c2344009Gk.LJFF("enter_method", postModeDetailParams != null ? postModeDetailParams.enterMethod : null);
        C1355960lOE.LIZLLL(c2344009Gk, aweme);
        C1355960lOE.LIZ(c2344009Gk, aweme);
        C1355960lOE.LIZIZ(c2344009Gk, aweme);
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        String str2 = "";
        C641850PFn.LIZ(c2344009Gk, C1ER1.LIZIZ.fetchSearchParams(postModeDetailParams != null ? postModeDetailParams.eventType : null, ""));
        C20684815ws.LJIILLIIL("graphic_detail_playtime", c2344009Gk.LIZ);
        IScreenshotService iScreenshotService = (IScreenshotService) ServiceManager.get().getService(IScreenshotService.class);
        C442430HWn c442430HWn2 = this.LLIZ;
        if (c442430HWn2 != null && (postModeDetailParams2 = c442430HWn2.LJI) != null && (str = postModeDetailParams2.previousPage) != null) {
            str2 = str;
        }
        iScreenshotService.LIZJ(str2);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(LemonPostDetailFragment.class.getName());
        }
        super.onResume();
        this.LLILZ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        VideoItemParams videoItemParams = MR().LL;
        if (videoItemParams != null) {
            PostModeFullPageViewModel postModeFullPageViewModelNR = NR();
            PostModeDetailParams postModeDetailParams = MR().LLILLL;
            postModeFullPageViewModelNR.LLILLJJLI = videoItemParams;
            videoItemParams.getAweme();
            postModeFullPageViewModelNR.LLILZIL = false;
            C1355990lOH c1355990lOH = postModeFullPageViewModelNR.LL;
            c1355990lOH.getClass();
            c1355990lOH.LIZIZ = videoItemParams.getAweme();
            c1355990lOH.LIZJ = postModeDetailParams;
            c1355990lOH.LIZLLL = -1;
            C1356000lOI c1356000lOI = postModeFullPageViewModelNR.LLILZ;
            c1356000lOI.getClass();
            String str = videoItemParams.mEventType;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            c1356000lOI.LJFF = str;
            c1356000lOI.LJ = videoItemParams.getAweme();
            String str3 = videoItemParams.mEnterMethodValue;
            if (str3 != null) {
                str2 = str3;
            }
            c1356000lOI.LJI = str2;
            c1356000lOI.LJII = videoItemParams.currentPosition;
        }
        MR().LL = null;
        C1355870lO5 c1355870lO5 = MR().LLILZ;
        if (c1355870lO5 != null) {
            c1355870lO5.LIZJ = System.currentTimeMillis();
            c1355870lO5.LIZ();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        Aweme aweme;
        String string;
        String string2;
        String string3;
        try {
            if (TextUtils.equals("videoReportSuccess", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
                String string4 = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"), "object_id");
                C442430HWn c442430HWn = this.LLIZ;
                String aid = null;
                if (c442430HWn != null) {
                    aweme = c442430HWn.LIZJ;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    }
                } else {
                    aweme = null;
                }
                if (TextUtils.equals(aid, string4)) {
                    if (aweme != null) {
                        Boolean bool = Boolean.TRUE;
                        Context context = getContext();
                        if (context == null || (string = context.getString(2131846337)) == null) {
                            string = "";
                        }
                        Context context2 = getContext();
                        if (context2 == null || (string2 = context2.getString(2131846335)) == null) {
                            string2 = "";
                        }
                        Context context3 = getContext();
                        if (context3 == null || (string3 = context3.getString(2131846336)) == null) {
                            string3 = "";
                        }
                        aweme.setReportMaskInfo(new VideoMaskInfo(bool, 1, 1, null, null, string, string2, string3, null));
                    }
                    ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
                }
                C19EG activity = getActivity();
                if (activity != null && !activity.isFinishing()) {
                    PostModeContainerViewModel postModeContainerViewModel = (PostModeContainerViewModel) this.LLILZIL.getValue();
                    C0HYG c0hyg = C0HYG.REPORT;
                    if (postModeContainerViewModel.LL.getValue() == null) {
                        postModeContainerViewModel.LL.setValue(c0hyg);
                    }
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d2 A[PHI: r2
      0x00d2: PHI (r2v8 android.view.View) = (r2v7 android.view.View), (r2v27 android.view.View) binds: [B:14:0x00bc, B:19:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.lemon.postmode.ui.fragment.LemonPostDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        Context context = getContext();
        if (context != null) {
            viewTd = C21146717pB.LIZIZ(context, R.layout.dab, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.dab, viewGroup, false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
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
