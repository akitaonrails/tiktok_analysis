package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.ui;

import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0A8I;
import X.C0HTT;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C12ES;
import X.C1344860l6K;
import X.C1347720lAw;
import X.C1347740lAy;
import X.C1348410lC3;
import X.C1348730lCZ;
import X.C1349000lD0;
import X.C1350920lG6;
import X.C1351950lHl;
import X.C1354660lM8;
import X.C14LC;
import X.C14TF;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C1865730yeR;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20673215v0;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2208181Bbc;
import X.C2208191Bbd;
import X.C2208201Bbe;
import X.C309690CBz;
import X.C452501pT;
import X.C497820Jfg;
import X.C673150Qan;
import X.C679360Qko;
import X.C687700QyG;
import X.C723850SaN;
import X.C729510SjV;
import X.C736680Sv4;
import X.C737030Svd;
import X.C786410Ut5;
import X.C810560Vqw;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1209130hZP;
import X.InterfaceC1254640iko;
import X.InterfaceC1348780lCe;
import X.InterfaceC1349040lD4;
import X.InterfaceC1349050lD5;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737790Swr;
import X.RunnableC343190Dcr;
import Y.AAListenerS68S0110000_19;
import Y.ACListenerS116S0200000_12;
import Y.AObserverS216S0100000_12;
import Y.AObserverS224S0100000_21;
import Y.ARunnableS121S0100000_21;
import Y.ARunnableS31S0110000_12;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.livedata.SlideData;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomFriendsV3DetailStoryDMAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomMusicShootCommentAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomSearchPoiEntranceAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomTakoEntranceAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomViewerListAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.NewBottomDefaultCommentInputAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarViewAbility;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.scope.DetailPageBottomBarScope;
import com.ss.android.ugc.aweme.comment.gift.ui.GiftAnimationFragment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IDetailBottomInputAssemAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS230S0300000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public final class BottomBarFragment extends AbsFragment implements InterfaceC1209130hZP, DetailBottomBarAbility, BottomBarViewAbility, InterfaceC724530SbT, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static String LLJJIJIL = null;
    public static String LLJJJ = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjFiLSonKSwgHELIOSOS40LWsuJjsnJyguKD0lems5IGERJzE4JiIRKTcKOy40JSAiPQ==";
    public ViewGroup LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public InterfaceC1254640iko LLILZLL;
    public InterfaceC1349040lD4 LLJ;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public ObjectAnimator LLJJ;
    public DetailBottomBarAbility LLJJIJI;
    public IDetailBottomInputAssemAbility LLJJIJIIJIL;
    public final BottomBarFragment LL = this;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 114));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 115));
    public String LLJI = "";
    public boolean LLJILLL = true;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 116));
    public boolean LLJJIII = true;

    @Override // X.InterfaceC1209130hZP
    public final void Go() {
        this.LLJIJIL = false;
        View view = this.LLILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(this.LLJILJIL ? 4 : 0, view);
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            view2.setEnabled(true);
        }
    }

    @Override // X.InterfaceC1209130hZP
    public final void J4() {
        LLJJJ = null;
        LLJJIJIL = null;
    }

    @Override // X.InterfaceC1209130hZP
    public final void bb() {
        this.LLJIJIL = true;
        View view = this.LLILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            view2.setEnabled(false);
        }
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == DetailBottomBarAbility.class) {
            this.LLJJIJI = (DetailBottomBarAbility) obj;
        } else if (cls == IDetailBottomInputAssemAbility.class) {
            this.LLJJIJIIJIL = (IDetailBottomInputAssemAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{DetailPageBottomBarScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == DetailBottomBarAbility.class) {
            return this.LLJJIJI;
        }
        if (cls == IDetailBottomInputAssemAbility.class) {
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
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DetailPageBottomBarScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DetailPageBottomBarScope.class);
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
        if (cls == DetailBottomBarAbility.class) {
            this.LLJJIJI = null;
        } else if (cls == IDetailBottomInputAssemAbility.class) {
            this.LLJJIJIIJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final C1348730lCZ NR() {
        return (C1348730lCZ) this.LLIZLLLIL.getValue();
    }

    public final C1349000lD0 OR() {
        return (C1349000lD0) this.LLJJI.getValue();
    }

    public final void PR() {
        ViewGroup viewGroup = this.LLILLJJLI;
        if (viewGroup != null) {
            C1351950lHl.LJIJJ(viewGroup);
        }
        View view = this.LLILZ;
        if (view != null) {
            C1351950lHl.LJIJJ(view);
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = 1;
            C786410Ut5.W5(view2, layoutParams);
        }
    }

    public final void RR() {
        Resources resources;
        ViewGroup viewGroup = this.LLILLJJLI;
        if (viewGroup != null) {
            C1351950lHl.LJIJJLI(viewGroup);
        }
        View view = this.LLILZ;
        if (view != null) {
            C1351950lHl.LJIJJLI(view);
        }
        Context context = getContext();
        int dimensionPixelOffset = (context == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelOffset(R.dimen.jn);
        boolean z = C14LC.LJIIIZ;
        C309690CBz.LIZ.getClass();
        int i = dimensionPixelOffset + C14LC.LJIILJJIL;
        View view2 = this.LLILLL;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i;
            C786410Ut5.W5(view2, layoutParams);
        }
    }

    @Override // X.InterfaceC1209130hZP
    public final void Tp() {
        View view;
        if (this.LLILLJJLI != null && Intrinsics.LJFF(OR().LIZJ, "default_comment") && (view = this.LLILZIL) != null && view.getVisibility() == 0) {
            View view2 = this.LLILZIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            InterfaceC1349050lD5 interfaceC1349050lD5LIZIZ = OR().LIZIZ();
            if (interfaceC1349050lD5LIZIZ != null) {
                interfaceC1349050lD5LIZIZ.y0(false);
            }
        }
    }

    @Override // X.InterfaceC1209130hZP, com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarViewAbility
    public final void W3() {
        C1348730lCZ c1348730lCZNR;
        if (this.LLJILJILJ || getContext() == null) {
            return;
        }
        isViewValid();
        Aweme aweme = getAweme();
        if (aweme != null && !AwemeExtKt.isProhibited(aweme) && (c1348730lCZNR = NR()) != null) {
            c1348730lCZNR.LJJIJIIJI();
        }
        AbstractBottomPriorityComponent abstractBottomPriorityComponentLIZ = OR().LIZ();
        if (abstractBottomPriorityComponentLIZ != null) {
            abstractBottomPriorityComponentLIZ.W3();
        }
    }

    public final Aweme getAweme() {
        InterfaceC1254640iko interfaceC1254640iko = this.LLILZLL;
        if (interfaceC1254640iko != null) {
            return ((DetailFragmentPanel) interfaceC1254640iko).o();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility
    public final String getEventType() {
        String eventType;
        C0HTT c0htt = this.LLILZLL;
        return (c0htt == null || (eventType = ((BaseListFragmentPanel) c0htt).getEventType()) == null) ? "" : eventType;
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility
    public final C2189821An6 xp0() {
        C0HTT c0htt = this.LLILZLL;
        if (c0htt != null) {
            return ((BaseListFragmentPanel) c0htt).LLLLIIIILLL;
        }
        return null;
    }

    @Override // X.InterfaceC1209130hZP
    public final void Do() {
        AbstractBottomPriorityComponent abstractBottomPriorityComponentLIZ;
        if (isViewValid() && (abstractBottomPriorityComponentLIZ = OR().LIZ()) != null) {
            abstractBottomPriorityComponentLIZ.Do();
        }
    }

    public final void SR() {
        try {
            OR().LIZLLL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateAssem throw error: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.InterfaceC1209130hZP
    public final boolean a5() {
        int iLJIILLIIL;
        C1348730lCZ c1348730lCZNR = NR();
        if (c1348730lCZNR == null) {
            return false;
        }
        InterfaceC1348780lCe interfaceC1348780lCe = c1348730lCZNR.LLILZIL;
        if (interfaceC1348780lCe == null || !((iLJIILLIIL = C1348730lCZ.LJIILLIIL(interfaceC1348780lCe.getCommentInputAweme())) == 1 || iLJIILLIIL == 2)) {
            return Intrinsics.LJFF(OR().LIZJ, "default_comment") || Intrinsics.LJFF(OR().LIZJ, "quick_comment");
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility, com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarViewAbility
    public final C1348730lCZ am() {
        return NR();
    }

    @Override // X.InterfaceC1209130hZP
    public final void dismissAllowingStateLoss() {
        Fragment fragmentLJJJJZI;
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null || (fragmentLJJJJZI = fragmentManager.LJJJJZI("comment_input_tag")) == null) {
            return;
        }
        C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
        c19ehLJIIJ.LJIILL(fragmentLJJJJZI);
        c19ehLJIIJ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility
    public final Aweme getCommentInputAweme() {
        return getAweme();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, X.C0PO1
    public final boolean isViewValid() {
        return super.isViewValid() && getContext() != null;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILZLL = null;
        Object value = this.LLIZ.getValue();
        value.getClass();
        EventBus.LIZLLL().LJJI(value);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.mStatusActive = false;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Do();
        String str = LLJJIJIL;
        if (str == null) {
            str = "";
        }
        String str2 = LLJJJ;
        r2(str, str2 != null ? str2 : "");
        C0HTT c0htt = this.LLILZLL;
        if (c0htt != null) {
            C737030Svd c737030Svd = new C737030Svd(9, (Object) null);
            c737030Svd.LIZJ = null;
            ((BaseListFragmentPanel) c0htt).LLIIL(c737030Svd);
        }
    }

    @Override // X.InterfaceC1209130hZP
    public final void ry() {
        C1348410lC3 c1348410lC3;
        if (isViewValid()) {
            SR();
            C1348730lCZ c1348730lCZNR = NR();
            if (c1348730lCZNR == null || (c1348410lC3 = c1348730lCZNR.LLLII) == null) {
                return;
            }
            c1348410lC3.LIZJ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility
    public final String getEnterFrom() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1209130hZP
    public final void kB() {
        isViewValid();
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility
    public final void EM2(AbstractBottomPriorityComponent abstractBottomPriorityComponent) {
        C1349000lD0 c1349000lD0OR = OR();
        if (!c1349000lD0OR.LIZJ().containsKey(abstractBottomPriorityComponent.zg())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("storeProtocol: ");
            sbLIZ.append(abstractBottomPriorityComponent.zg());
            C2188811AlT.LIZIZ(sbLIZ);
            c1349000lD0OR.LIZJ().put(abstractBottomPriorityComponent.zg(), abstractBottomPriorityComponent);
        }
    }

    public final void MR(final boolean z) {
        float f;
        ObjectAnimator objectAnimatorOfFloat;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addShowAndHideAnimation ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator objectAnimator = this.LLJJ;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addShowAndHideAnimation cancel anim isShow = ");
            sbLIZ2.append(z);
            C2188811AlT.LIZIZ(sbLIZ2);
            ObjectAnimator objectAnimator2 = this.LLJJ;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
        }
        ViewGroup viewGroup = this.LLILLJJLI;
        if (viewGroup != null && (objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, "alpha", viewGroup.getAlpha(), f)) != null) {
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0hbI
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("addShowAndHideAnimation ");
                    sbLIZ3.append(z);
                    sbLIZ3.append(" animation start ");
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
            });
            objectAnimatorOfFloat.addListener(new AAListenerS68S0110000_19(this, z, 1));
        } else {
            objectAnimatorOfFloat = null;
        }
        this.LLJJ = objectAnimatorOfFloat;
        ObjectAnimator objectAnimator3 = this.LLJJ;
        if (objectAnimator3 != null) {
            C786410Ut5.Pd(objectAnimator3);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarViewAbility
    public final void Sx1(Comment comment) {
        C19EH c19ehLJIIJ;
        FragmentManager supportFragmentManager;
        C19EG activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            c19ehLJIIJ = supportFragmentManager.LJIIJ();
        } else {
            c19ehLJIIJ = null;
        }
        GiftAnimationFragment giftAnimationFragment = new GiftAnimationFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "comment", comment);
        giftAnimationFragment.setArguments(bundle);
        if (c19ehLJIIJ != null) {
            giftAnimationFragment.show(c19ehLJIIJ, "GiftAnimationFragment");
        }
    }

    @Override // X.InterfaceC1209130hZP
    public final void Tj(boolean z) {
        float f;
        View view = this.LLILLL;
        if (view != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.T4(view, f);
            if (z) {
                C786410Ut5.LJLLLLLL(4, view);
                return;
            }
            return;
        }
        this.LLJILJIL = z;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{DetailPageBottomBarScope.class}).unbindAbility(this.LL, DetailBottomBarAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarViewAbility
    public final void hC0(float f) {
        ViewGroup viewGroup = this.LLILLJJLI;
        if (viewGroup != null) {
            C679360Qko.LIZ(viewGroup.getAlpha(), f, this.LLILLJJLI);
        }
        View view = this.LLILZ;
        if (view != null) {
            C679360Qko.LIZ(view.getAlpha(), f, this.LLILZ);
        }
    }

    @Override // X.InterfaceC1209130hZP
    public final void nj(boolean z) {
        View view = this.LLILLL;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS31S0110000_12(this, z, 0));
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = getView();
        if (view != null) {
            int iLIZJ = (int) C12ES.LIZJ(configuration.screenWidthDp, view.getContext());
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width != iLIZJ) {
                    layoutParams.width = iLIZJ;
                }
                C786410Ut5.W5(view, layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C687700QyG.LJI(this);
        super.onCreate(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    @Override // X.InterfaceC1209130hZP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p5(boolean r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            r2 = 0
            if (r0 != 0) goto L8
            r6 = 0
        L8:
            boolean r0 = r5.isViewValid()
            if (r0 != 0) goto Lf
            return r2
        Lf:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            r3 = 1
            if (r0 == 0) goto L30
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isProhibitedAndShouldTell(r0)
            if (r0 != r3) goto L30
        L1c:
            r6 = 0
        L1d:
            java.lang.String r4 = "setInputVisible visibleFlag set "
            if (r6 == 0) goto L5f
            boolean r0 = r5.LLJJIII
            if (r0 != 0) goto Lbd
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            boolean r0 = X.C729510SjV.LIZ(r0)
            if (r0 != 0) goto L4f
            return r2
        L30:
            com.ss.android.ugc.aweme.service.INowsTabService r1 = X.C591970NJr.LIZIZ()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            boolean r0 = r1.LIZIZ(r0)
            if (r0 != 0) goto L1c
            X.0iko r1 = r5.LLILZLL
            if (r1 == 0) goto L1d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r1 = (com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel) r1
            com.ss.android.ugc.aweme.feed.model.SlotInfo r0 = r1.t(r0)
            if (r0 == 0) goto L1d
            goto L1c
        L4f:
            X.0iko r0 = r5.LLILZLL
            if (r0 == 0) goto L94
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = (com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel) r0
            boolean r0 = r0.K()
            if (r0 != r3) goto L94
            r5.PR()
            return r2
        L5f:
            boolean r0 = r5.LLJJIII
            if (r0 == 0) goto Lbd
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = " first bind  hide "
            r1.append(r0)
            boolean r0 = r5.LLJILLL
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r4)
            r0.append(r2)
            X.C2188811AlT.LIZIZ(r0)
            r5.LLJJIII = r2
            boolean r0 = r5.LLJILLL
            if (r0 == 0) goto L90
            r5.LLJILLL = r2
            r5.PR()
        L8c:
            r5.isViewValid()
            goto Lbd
        L90:
            r5.MR(r6)
            goto L8c
        L94:
            r5.RR()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = " first bind  show "
            r1.append(r0)
            boolean r0 = r5.LLJILLL
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r4)
            r0.append(r3)
            X.C2188811AlT.LIZIZ(r0)
            r5.LLJJIII = r3
            boolean r0 = r5.LLJILLL
            if (r0 == 0) goto Lc0
            r5.LLJILLL = r2
        Lbd:
            boolean r0 = r5.LLJJIII
            return r0
        Lc0:
            r5.MR(r6)
            goto Lbd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.ui.BottomBarFragment.p5(boolean):boolean");
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{DetailPageBottomBarScope.class}).bindAbility(this.LL, DetailBottomBarAbility.class);
    }

    @Override // X.InterfaceC1209130hZP
    public final void tR(float f) {
        int i;
        View view = this.LLILLL;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
        View view2 = this.LLILLL;
        boolean z = false;
        if (view2 != null) {
            if (f > 0.0f) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
        if (f > 0.0f) {
            z = true;
        }
        p5(z);
    }

    @Override // X.InterfaceC1209130hZP
    public final void y0(boolean z) {
        View view;
        View view2;
        int i;
        if (this.LLILZIL != null && Intrinsics.LJFF(OR().LIZJ, "default_comment")) {
            View view3 = this.LLILZIL;
            if (view3 != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, view3);
            }
            InterfaceC1349050lD5 interfaceC1349050lD5LIZIZ = OR().LIZIZ();
            if (interfaceC1349050lD5LIZIZ != null) {
                interfaceC1349050lD5LIZIZ.y0(z);
            }
            Aweme aweme = getAweme();
            if (aweme != null && (view = this.LLILZIL) != null && view.getVisibility() == 0 && (view2 = this.LLILZIL) != null) {
                C786410Ut5.I7(new ACListenerS116S0200000_12(aweme, this, 34), view2);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC1254640iko interfaceC1254640iko;
        InterfaceC1254640iko interfaceC1254640iko2;
        boolean zLJI = MethodIDManager.LJI(202318);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = this.LLILLJJLI;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(R.drawable.cg7);
        }
        ViewGroup viewGroup2 = this.LLILLJJLI;
        if (viewGroup2 != null) {
            int i = C14LC.LJIILLIIL;
            C309690CBz.LIZ.getClass();
            int iLIZIZ = C14LC.LIZIZ();
            if (i == 0) {
                i = iLIZIZ;
            }
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            layoutParams.height = i;
            C786410Ut5.X5(layoutParams, viewGroup2);
        }
        boolean z = C14LC.LJIIIZ;
        C14LC c14lc = C309690CBz.LIZ;
        ViewGroup viewGroup3 = this.LLILLJJLI;
        View view2 = this.LLILZ;
        View view3 = this.LLILZIL;
        c14lc.getClass();
        if (view2 != null) {
            C810560Vqw.LIZJ(new RunnableC343190Dcr(2, view2, viewGroup3, view3));
        }
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, DetailBottomBarAbility.class, null, getViewLifecycleOwner());
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, BottomBarViewAbility.class, null, getViewLifecycleOwner());
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, BottomBarProtocol.class, C1697810uHb.LJIILJJIL(new BottomFriendsV3DetailStoryDMAssem()));
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, BottomBarProtocol.class, C1697810uHb.LJIILJJIL(new BottomViewerListAssem()));
        if (!((Boolean) C0A8I.LIZ.getValue()).booleanValue()) {
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, BottomBarProtocol.class, C1697810uHb.LJIILJJIL(new BottomMusicShootCommentAssem()));
        }
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, BottomBarProtocol.class, C1697810uHb.LJIILJJIL(new BottomSearchPoiEntranceAssem()));
        if (((Boolean) C1865730yeR.LIZIZ.getValue()).booleanValue() && C14TF.LIZIZ.LJIILL().LJIILIIL()) {
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, BottomBarProtocol.class, C1697810uHb.LJIILJJIL(new BottomTakoEntranceAssem()));
        }
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, BottomBarProtocol.class, C1697810uHb.LJIILJJIL(new NewBottomDefaultCommentInputAssem()));
        C723850SaN.LIZ(this, false, null, new AwS230S0300000_21(C1554610qYd.LIZIZ(C1558360qeg.LJFF(this, null), BottomBarProtocol.class, false), (List<? extends BottomBarProtocol>) this, (BottomBarFragment) view, (View) 32), 3);
        if (this.LLJIJIL) {
            bb();
        }
        Tj(this.LLJILJIL);
        C19EG activity = getActivity();
        if (activity != null) {
            SlideData slideData = (SlideData) ViewModelProviders.of(activity).get(SlideData.class);
            if (slideData.LL == null) {
                slideData.LL = new MutableLiveData<>();
            }
            slideData.LL.observe(getViewLifecycleOwner(), new AObserverS216S0100000_12(this, 29));
            if (slideData.LLILLJJLI == null) {
                slideData.LLILLJJLI = new MutableLiveData<>();
            }
            slideData.LLILLJJLI.observe(getViewLifecycleOwner(), new AObserverS224S0100000_21(this, 20));
        }
        if (!C729510SjV.LIZ(getAweme()) || (((interfaceC1254640iko = this.LLILZLL) != null && ((DetailFragmentPanel) interfaceC1254640iko).K()) || ((interfaceC1254640iko2 = this.LLILZLL) != null && ((DetailFragmentPanel) interfaceC1254640iko2).t(getAweme()) != null))) {
            p5(false);
        }
        SR();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1209130hZP
    public final void r2(String str, String str2) {
        InterfaceC1349050lD5 interfaceC1349050lD5LIZIZ;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.LLJILJILJ = true;
            LLJJIJIL = str;
            LLJJJ = str2;
            if (Intrinsics.LJFF(OR().LIZJ, "default_comment") && (interfaceC1349050lD5LIZIZ = OR().LIZIZ()) != null) {
                interfaceC1349050lD5LIZIZ.r2(str, str2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        List<CommentImageModel> listLIZLLL;
        List<CommentImageModel> list;
        boolean z;
        String str;
        int iLJIILIIL;
        String aid;
        View view;
        View view2;
        List<CommentImageModel> list2;
        String aid2;
        CommentImageModel commentImageModel;
        List<CommentImageModel> list3;
        List<CommentImageModel> list4;
        int iLJIILIIL2;
        List<CommentImageModel> list5;
        CommentImageModel commentImageModelLJFF;
        if (!C1347740lAy.LIZ(getAweme(), false)) {
            return;
        }
        if ((i2 == 100 || i2 == 104) && intent != null) {
            CommentImageModel commentImageModel2 = null;
            if (i2 != 100) {
                if (i2 == 104 && (commentImageModelLJFF = C1354660lM8.LJFF(intent)) != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(commentImageModelLJFF);
                    listLIZLLL = arrayList;
                } else {
                    listLIZLLL = null;
                }
            } else {
                listLIZLLL = C1347740lAy.LIZLLL(intent.getParcelableArrayListExtra("key_choose_media_data"));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("imageData = ");
            sbLIZ.append(listLIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
            if (listLIZLLL != null) {
                C1348730lCZ c1348730lCZNR = NR();
                if (c1348730lCZNR != null) {
                    list = c1348730lCZNR.LLJJIJI;
                } else {
                    list = null;
                }
                if (list != null) {
                    z = true;
                    if (!list.isEmpty()) {
                        if (1 != 0) {
                            C2208201Bbe c2208201Bbe = C2208201Bbe.LIZ;
                            CommentImageModel commentImageModel3 = (CommentImageModel) ListProtector.get(list, 0);
                            c2208201Bbe.getClass();
                            C2208201Bbe.LIZIZ(commentImageModel3, "user_replace_image");
                        }
                        int i3 = C2208181Bbc.LJII;
                        C2208191Bbd.LIZJ((CommentImageModel) ListProtector.get(list, 0));
                    }
                } else {
                    z = false;
                }
                C1348730lCZ c1348730lCZNR2 = NR();
                if (c1348730lCZNR2 != null) {
                    c1348730lCZNR2.LLJJIJI = listLIZLLL;
                }
                String str2 = this.LLJI;
                if (z) {
                    str = "replace";
                } else {
                    str = "add";
                }
                C1348730lCZ c1348730lCZNR3 = NR();
                if (c1348730lCZNR3 != null && (list5 = c1348730lCZNR3.LLJJIJI) != null) {
                    iLJIILIIL = C1351950lHl.LJIILIIL(list5);
                } else {
                    iLJIILIIL = 0;
                }
                Integer numValueOf = Integer.valueOf(iLJIILIIL);
                Aweme aweme = getAweme();
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                C1350920lG6.LJJJLZIJ(str2, str, numValueOf, false, C1347720lAw.LJIILJJIL(aid, listLIZLLL));
                if (z) {
                    String str3 = this.LLJI;
                    if (list != null) {
                        iLJIILIIL2 = C1351950lHl.LJIILIIL(list);
                    } else {
                        iLJIILIIL2 = 0;
                    }
                    C1350920lG6.LJLJJI(str3, "replace", Integer.valueOf(iLJIILIIL2), false, C1347720lAw.LJIILJJIL("", listLIZLLL));
                }
                C1348730lCZ c1348730lCZNR4 = NR();
                if (c1348730lCZNR4 != null && (list2 = c1348730lCZNR4.LLJJIJI) != null && (!list2.isEmpty())) {
                    int i4 = C1344860l6K.LIZ;
                    Aweme aweme2 = getAweme();
                    if (aweme2 != null) {
                        aid2 = aweme2.getAid();
                    } else {
                        aid2 = null;
                    }
                    C1348730lCZ c1348730lCZNR5 = NR();
                    if (c1348730lCZNR5 != null && (list4 = c1348730lCZNR5.LLJJIJI) != null) {
                        commentImageModel = (CommentImageModel) ListProtector.get(list4, 0);
                    } else {
                        commentImageModel = null;
                    }
                    C1344860l6K.LJFF(commentImageModel, aid2);
                    int i5 = C2208181Bbc.LJII;
                    C1348730lCZ c1348730lCZNR6 = NR();
                    if (c1348730lCZNR6 != null && (list3 = c1348730lCZNR6.LLJJIJI) != null) {
                        commentImageModel2 = (CommentImageModel) ListProtector.get(list3, 0);
                    }
                    C2208191Bbd.LJIILIIL(commentImageModel2);
                }
                if (i == 10002 && (view = this.LLILLL) != null && view.getParent() != null && (view2 = this.LLILLL) != null) {
                    HandlerHook.viewPost(view2, new ARunnableS121S0100000_21(this, 25));
                }
            }
        }
        C1348730lCZ c1348730lCZNR7 = NR();
        if (c1348730lCZNR7 != null) {
            c1348730lCZNR7.LLJJIJIL = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        int iLIZIZ = 0;
        View viewLIZLLL = C20673215v0.LIZLLL(R.layout.a29, getActivity(), viewGroup, false);
        if (viewGroup instanceof RelativeLayout) {
            C19EG activity = getActivity();
            if (activity != null) {
                iLIZIZ = C497820Jfg.LIZIZ(activity);
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLIZIZ, -2);
            layoutParams.addRule(12);
            C786410Ut5.W5(viewLIZLLL, layoutParams);
        } else if (viewGroup instanceof FrameLayout) {
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                iLIZIZ = C497820Jfg.LIZIZ(activity2);
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iLIZIZ, -2);
            layoutParams2.gravity = 80;
            C786410Ut5.W5(viewLIZLLL, layoutParams2);
        } else {
            C19EG activity3 = getActivity();
            if (activity3 != null) {
                iLIZIZ = C497820Jfg.LIZIZ(activity3);
            }
            C786410Ut5.W5(viewLIZLLL, new ViewGroup.LayoutParams(iLIZIZ, -2));
        }
        this.LLILLJJLI = (ViewGroup) viewLIZLLL.findViewById(R.id.cbk);
        this.LLILZIL = viewLIZLLL.findViewById(R.id.a_1);
        this.LLILLL = viewLIZLLL.findViewById(R.id.eqx);
        this.LLILZ = viewLIZLLL.findViewById(R.id.wxh);
        try {
            ViewTreeLifecycleOwner.set(viewLIZLLL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLIZLLL, this);
            viewLIZLLL.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity4 = getActivity();
            if (activity4 instanceof C19GS) {
                c19gs = (C19GS) activity4;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLIZLLL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLIZLLL;
        }
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
