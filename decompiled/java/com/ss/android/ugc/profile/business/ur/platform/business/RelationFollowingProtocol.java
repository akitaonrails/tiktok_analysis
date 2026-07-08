package com.ss.android.ugc.profile.business.ur.platform.business;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C03H5;
import X.C0OBG;
import X.C0XPD;
import X.C0XQ7;
import X.C0ZP4;
import X.C1176850gjL;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1250210idf;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19EG;
import X.C2187451AjH;
import X.C268330AfP;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C627150Oin;
import X.C725080ScM;
import X.C736680Sv4;
import X.C814420VxA;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC723720SaA;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.ur.relations.ProfileRelationVM;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS103S1200000_19;
import kotlin.jvm.internal.AwS116S0400000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RelationFollowingProtocol extends ProfilePlatformProtocol<RelationData> implements InterfaceC724530SbT, GenericLifecycleObserver {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2410));
    public boolean LLJJJJ;
    public String LLJJJJJIL;
    public RelationData LLJJJJLIIL;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
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

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "relation_info_following";
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final View LJIIJJI() {
        if (!C725080ScM.LIZLLL) {
            return null;
        }
        try {
            InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
            if (interfaceC723720SaA == null) {
                return null;
            }
            int i = C2187451AjH.LIZ;
            interfaceC723720SaA.log("RelationFollowingComponent", "generateComponentView");
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        TextView textView;
        TextView textView2;
        String string;
        Resources resources;
        Describe describe;
        Describe describe2;
        Describe describe3;
        Describe describe4;
        Describe describe5;
        Integer followingCount;
        ProfileRelationVM profileRelationVM = (ProfileRelationVM) this.LLJJJIL.getValue();
        if (profileRelationVM != null) {
            RelationData relationData = (RelationData) this.LLJILJIL;
            profileRelationVM.withState(new AwS116S0400000_19(profileRelationVM, (Integer) null, Integer.valueOf((relationData == null || (followingCount = relationData.getFollowingCount()) == null) ? 0 : followingCount.intValue()), (Long) null, 1));
        }
        RelationData relationData2 = (RelationData) this.LLJILJIL;
        if (relationData2 != null) {
            relationData2.getNumber();
        }
        RelationData relationData3 = this.LLJJJJLIIL;
        String text = (relationData3 == null || (describe5 = relationData3.getDescribe()) == null) ? null : describe5.getText();
        T t = this.LLJILJIL;
        if (!Intrinsics.LJFF(text, (t == 0 || (describe4 = t.getDescribe()) == null) ? null : describe4.getText())) {
            RelationData relationData4 = this.LLJJJJLIIL;
            String subText = (relationData4 == null || (describe3 = relationData4.getDescribe()) == null) ? null : describe3.getSubText();
            T t2 = this.LLJILJIL;
            if (!Intrinsics.LJFF(subText, (t2 == 0 || (describe2 = t2.getDescribe()) == null) ? null : describe2.getSubText())) {
                View view = this.LLILZLL;
                if ((view instanceof LinearLayout) && view != null && (textView2 = (TextView) view.findViewById(R.id.s5w)) != null) {
                    T t3 = this.LLJILJIL;
                    if (t3 == 0 || (describe = t3.getDescribe()) == null || (string = describe.getText()) == null) {
                        Context context = getContext();
                        string = (context == null || (resources = context.getResources()) == null) ? null : resources.getString(2131837645);
                    }
                    textView2.setText(string);
                }
            }
        }
        View view2 = this.LLILZLL;
        if ((view2 instanceof LinearLayout) && view2 != null && (textView = (TextView) view2.findViewById(R.id.s5x)) != null) {
            RelationData relationData5 = (RelationData) this.LLJILJIL;
            textView.setText(C1176850gjL.LIZ(1, relationData5 != null ? relationData5.getFollowingCount() : null, "-"));
        }
        return false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("RelationFollowingComponent", "onCreate");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("RelationFollowingComponent", "onResume");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJI() {
        View view;
        if (!C268330AfP.LJIIIZ() || (view = this.LLILZLL) == null) {
            return;
        }
        C426750GoL.LJIIL(view, 0, 0, Integer.valueOf(C268330AfP.LIZLLL() ? 0 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), 0, 16);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String LJJIFFI() {
        Resources resources;
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null) {
            return null;
        }
        return resources.getString(2131837645);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        boolean z;
        String str;
        C19EG activity;
        if (C0OBG.LIZIZ(this.LLILZLL)) {
            return true;
        }
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null && iProfilePlatformVM.isMyProfile()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        Fragment fragment = this.LLILZ;
        if (fragment != null) {
            activity = fragment.getActivity();
        } else {
            activity = null;
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C0XPD.LIZIZ(activity, "personal_homepage", "following_list", new C627150Oin().LIZ, null);
            return true;
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJJJIL.getValue();
        if (assemViewModel != null) {
            C736680Sv4.LJIJJ(assemViewModel, new AwS103S1200000_19(this, activity, str, 3));
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        RelationData relationData;
        try {
            relationData = (RelationData) C1250210idf.LIZ(nVar.toString(), RelationData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            relationData = null;
        }
        this.LLJILJIL = relationData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, r3) != false) goto L38;
     */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIIJJIZ(com.ss.android.ugc.profile.platform.base.data.ProfileComponents r7) {
        /*
            r6 = this;
            com.google.gson.n r0 = r7.bizData
            r3 = 0
            if (r0 == 0) goto L8c
            java.lang.String r2 = r0.toString()
        L9:
            java.lang.String r0 = r6.LLJJJJJIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            r5 = 0
            if (r0 != 0) goto L83
            com.google.gson.n r0 = r7.bizData
            if (r0 == 0) goto L83
            r6.LJJJLZIJ(r0)
            T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData r4 = r6.LLJILJIL
            com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData r4 = (com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData) r4
            com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData r0 = r6.LLJJJJLIIL
            if (r0 == 0) goto L8f
            java.lang.Integer r1 = r0.getFollowingCount()
            java.lang.Integer r0 = r4.getFollowingCount()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L8f
            com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData r0 = r6.LLJJJJLIIL
            if (r0 == 0) goto L8a
            java.lang.Integer r1 = r0.getFollowingVisibility()
        L37:
            java.lang.Integer r0 = r4.getFollowingVisibility()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L8f
            com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData r0 = r6.LLJJJJLIIL
            if (r0 == 0) goto L88
            java.lang.String r1 = r0.getNumber()
        L49:
            java.lang.String r0 = r4.getNumber()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L8f
            com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData r0 = r6.LLJJJJLIIL
            if (r0 == 0) goto L86
            java.lang.Integer r1 = r0.getFollowToastType()
        L5b:
            java.lang.Integer r0 = r4.getFollowToastType()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L8f
            com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData r0 = r6.LLJJJJLIIL
            if (r0 == 0) goto L84
            com.ss.android.ugc.profile.platform.base.data.Describe r0 = r0.getDescribe()
            if (r0 == 0) goto L84
            java.lang.String r1 = r0.getText()
        L73:
            com.ss.android.ugc.profile.platform.base.data.Describe r0 = r4.getDescribe()
            if (r0 == 0) goto L7d
            java.lang.String r3 = r0.getText()
        L7d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 == 0) goto L8f
        L83:
            return r5
        L84:
            r1 = r3
            goto L73
        L86:
            r1 = r3
            goto L5b
        L88:
            r1 = r3
            goto L49
        L8a:
            r1 = r3
            goto L37
        L8c:
            r2 = r3
            goto L9
        L8f:
            r6.LJJLIIIJILLIZJL()
            r6.LLJJJJJIL = r2
            T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData r0 = r6.LLJILJIL
            com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData r0 = (com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData) r0
            r6.LLJJJJLIIL = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.platform.business.RelationFollowingProtocol.LJJLIIIJJIZ(com.ss.android.ugc.profile.platform.base.data.ProfileComponents):boolean");
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
