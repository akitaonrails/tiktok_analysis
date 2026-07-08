package com.ss.android.ugc.aweme.feed.ui.innerskylight;

import X.AbstractC738140SxQ;
import X.C0DVF;
import X.C0PEM;
import X.C0PSR;
import X.C118300cf;
import X.C1220000hqw;
import X.C13LE;
import X.C14EU;
import X.C14KQ;
import X.C1595930rdH;
import X.C1618190sDB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C1DFH;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C23250099c;
import X.C366620EYy;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ATListenerS438S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.detail.vm.FollowInnerFeedVM;
import com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityExperienceExp;
import com.ss.android.ugc.aweme.model.SkylightFollowingUserItem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class FollowingInnerSkylightAssem extends UISlotAssem {
    public FrameLayout LLJJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIII;
    public final C736950SvV LLJJIJI;
    public final C736950SvV LLJJIJIIJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.c7t;
    }

    public final FollowingInnerSkylightAssemViewModel hp() {
        return (FollowingInnerSkylightAssemViewModel) this.LLJJIJI.getValue();
    }

    public FollowingInnerSkylightAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FollowingInnerSkylightAssemViewModel.class);
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(155);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(112);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((AbstractC738140SxQ) this, 339);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJIJI = new C736950SvV(c19719912DlLIZ, aFwS206S0000000_18, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS256S0000000_18, awS562S0100000_18, c451610HnL, c723700Sa8);
        AFwS206S0000000_18 aFwS206S0000000_182 = AFwS206S0000000_18.get$arr$(154);
        this.LLJJIJIIJIL = new C736950SvV(C13LE.LIZ(FollowInnerFeedVM.class), aFwS206S0000000_182, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(113), new AwS562S0100000_18((AbstractC738140SxQ) this, 340), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        FollowingInnerSkylightAssemViewModel followingInnerSkylightAssemViewModelHp = hp();
        followingInnerSkylightAssemViewModelHp.LLILLJJLI = -1;
        for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) followingInnerSkylightAssemViewModelHp.LL) {
            if (interfaceC1891350zJl instanceof SkylightFollowingUserItem) {
                ((SkylightFollowingUserItem) interfaceC1891350zJl).LL = false;
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUnFollowEvent(C0PSR c0psr) {
        Object obj;
        User user;
        String uid;
        String uid2;
        if (c0psr.LIZ == 0 && (obj = c0psr.LIZIZ) != null && (obj instanceof User)) {
            FollowingInnerSkylightAssemViewModel followingInnerSkylightAssemViewModelHp = hp();
            Object obj2 = c0psr.LIZIZ;
            if (obj2 instanceof User) {
                user = (User) obj2;
            } else {
                user = null;
            }
            followingInnerSkylightAssemViewModelHp.getClass();
            if (user != null) {
                C118300cf c118300cf = new C118300cf();
                c118300cf.element = -1;
                int i = 0;
                for (Object obj3 : (ArrayList) followingInnerSkylightAssemViewModelHp.LL) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj3;
                        if (interfaceC1891350zJl instanceof SkylightFollowingUserItem) {
                            User user2 = ((SkylightFollowingUserItem) interfaceC1891350zJl).followingUser;
                            if (user2 != null) {
                                uid2 = user2.getUid();
                            } else {
                                uid2 = null;
                            }
                            if (Intrinsics.LJFF(uid2, user.getUid())) {
                                c118300cf.element = i;
                            }
                        } else if (interfaceC1891350zJl instanceof C1595930rdH) {
                            User user3 = ((C1595930rdH) interfaceC1891350zJl).LLILLJJLI;
                            if (user3 != null) {
                                uid = user3.getUid();
                            } else {
                                uid = null;
                            }
                            if (Intrinsics.LJFF(uid, user.getUid())) {
                                c118300cf.element = i;
                            }
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                ListProtector.remove(followingInnerSkylightAssemViewModelHp.LL, c118300cf.element);
                followingInnerSkylightAssemViewModelHp.setState(new AwS597S0100000_18(c118300cf, 40));
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        super.onViewCreated(view);
        this.LLJJIII = (ViewOnAttachStateChangeListenerC20604515jv) LJJIJL().findViewById(R.id.igo);
        this.LLJJI = (FrameLayout) LJJIJL().findViewById(R.id.igp);
        if (FollowingSkylightAbilityExperienceExp.LIZIZ()) {
            if (C14KQ.LJIIIIZZ(getContext()) >= C1618190sDB.LIZ(390)) {
                FrameLayout frameLayout = this.LLJJI;
                if (frameLayout != null && (layoutParams5 = frameLayout.getLayoutParams()) != null) {
                    layoutParams5.width = C1618190sDB.LIZ(280);
                }
            } else {
                FrameLayout frameLayout2 = this.LLJJI;
                if (frameLayout2 != null && (layoutParams3 = frameLayout2.getLayoutParams()) != null) {
                    layoutParams3.width = C1618190sDB.LIZ(228);
                }
            }
            FrameLayout frameLayout3 = this.LLJJI;
            if (frameLayout3 != null) {
                frameLayout3.setOnTouchListener(new ATListenerS438S0100000_4(this, 0));
            }
            FrameLayout frameLayout4 = this.LLJJI;
            if (frameLayout4 != null && (layoutParams4 = frameLayout4.getLayoutParams()) != null) {
                layoutParams4.height = C1618190sDB.LIZ(60);
            }
        } else {
            FrameLayout frameLayout5 = this.LLJJI;
            if (frameLayout5 != null && (layoutParams2 = frameLayout5.getLayoutParams()) != null) {
                layoutParams2.width = C1618190sDB.LIZ(228);
            }
            FrameLayout frameLayout6 = this.LLJJI;
            if (frameLayout6 != null && (layoutParams = frameLayout6.getLayoutParams()) != null) {
                layoutParams.height = C1618190sDB.LIZ(55);
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(FollowingInnerSkylightUserCell.class, FollowingInnerSkylightLiveCell.class);
            getActualLifecycleOwner();
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext());
            linearLayoutManager.setOrientation(0);
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(linearLayoutManager);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C366620EYy(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0));
            viewOnAttachStateChangeListenerC20604515jv.setPivotX(0.8f);
            viewOnAttachStateChangeListenerC20604515jv.setPivotY(0.0f);
            viewOnAttachStateChangeListenerC20604515jv.setLayerType(2, null);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            RecyclerView.RecycledViewPool recycledViewPool = viewOnAttachStateChangeListenerC20604515jv.getRecycledViewPool();
            recycledViewPool.setMaxRecycledViews(viewOnAttachStateChangeListenerC20604515jv.LJIIJJI(C1595930rdH.class, null), 10);
            recycledViewPool.setMaxRecycledViews(viewOnAttachStateChangeListenerC20604515jv.LJIIJJI(SkylightFollowingUserItem.class, null), 10);
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0DVF(this, viewOnAttachStateChangeListenerC20604515jv, null), 2);
        }
        subscribe(hp(), C736820SvI.LIZLLL(), null, new AwS632S0100000_18(this, 27));
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0gLU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158960gGU) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 28), 4);
        EventBus.LIZLLL().LJIJJ(this);
    }
}
