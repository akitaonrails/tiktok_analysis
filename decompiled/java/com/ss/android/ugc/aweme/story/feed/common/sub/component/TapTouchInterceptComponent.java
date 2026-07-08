package com.ss.android.ugc.aweme.story.feed.common.sub.component;

import X.C0RF0;
import X.C0RJN;
import X.C0RMW;
import X.C0SR4;
import X.C0WIY;
import X.C102600a8;
import X.C1389300mG0;
import X.C1600710rkz;
import X.C1618440sDa;
import X.C19EG;
import X.C2189821An6;
import X.C281310B0v;
import X.C628500Oky;
import X.C630740Ooa;
import X.C721900STk;
import X.C724240Sb0;
import X.InterfaceC214902198i;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.IAdapterAbility;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class TapTouchInterceptComponent extends StorySubVHTapInterceptComponent {
    public final C630740Ooa LLJZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 612));

    public final int kp() {
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        C721900STk c721900STk = C721900STk.LIZ;
        C0RF0 c0rf0 = jm().LIZLLL;
        String from = (c0rf0 == null || (baseFeedPageParams = c0rf0.LJ) == null || (c2189821An6 = baseFeedPageParams.param) == null) ? null : c2189821An6.getFrom();
        c721900STk.getClass();
        return Intrinsics.LJFF("STORY_ENTRANCE_GUIDE_CARD", from) ? 1 : -1;
    }

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
    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BaseSubVHTapTouchInterceptComponent, X.InterfaceC693170RGx
    public final void tm(boolean z) {
        Object objLIZLLL;
        Boolean boolValueOf;
        C19EG c19egLIZ;
        boolean zIsFinishing;
        C0RJN c0rjnLIZIZ;
        String pushLabel;
        InterfaceC214902198i interfaceC214902198i;
        C0RF0 c0rf0;
        Fragment fragment;
        IDetailBaseAbility iDetailBaseAbilityLIZ;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        Fragment fragment2;
        IDetailBaseAbility iDetailBaseAbilityLIZ2;
        BaseFeedPageParams baseFeedPageParams2;
        C2189821An6 c2189821An62;
        InterfaceC214902198i interfaceC214902198i2;
        Fragment fragment3;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            if ((fragmentLJI instanceof IDetailBaseAbility) || C1600710rkz.LIZ(fragmentLJI) != null) {
                IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
                Object objLIZLLL2 = null;
                from = null;
                from = null;
                String from = null;
                Fragment fragment4 = null;
                if (iDetailFeedSafService != null) {
                    C0RF0 c0rf02 = jm().LIZLLL;
                    if (c0rf02 != null) {
                        fragment3 = c0rf02.LIZJ;
                    } else {
                        fragment3 = null;
                    }
                    objLIZLLL = iDetailFeedSafService.LIZLLL(fragment3);
                } else {
                    objLIZLLL = null;
                }
                if ((objLIZLLL instanceof InterfaceC214902198i) && (interfaceC214902198i2 = (InterfaceC214902198i) objLIZLLL) != null) {
                    if (!SAFExtensionKt.LJIIZILJ(interfaceC214902198i2) && !interfaceC214902198i2.SL()) {
                        zIsFinishing = false;
                    } else {
                        zIsFinishing = true;
                    }
                } else {
                    C0RJN c0rjnLIZIZ2 = jm().LIZIZ();
                    if (c0rjnLIZIZ2 != null && (c19egLIZ = c0rjnLIZIZ2.LIZ()) != null) {
                        zIsFinishing = c19egLIZ.isFinishing();
                    } else {
                        boolValueOf = null;
                        if (!Intrinsics.LJFF(boolValueOf, Boolean.FALSE) && (c0rjnLIZIZ = jm().LIZIZ()) != null && c0rjnLIZIZ.LIZ() != null && z) {
                            C0RF0 c0rf03 = jm().LIZLLL;
                            if (c0rf03 != null && (baseFeedPageParams2 = c0rf03.LJ) != null && (c2189821An62 = baseFeedPageParams2.param) != null) {
                                pushLabel = c2189821An62.getPushLabel();
                            } else {
                                pushLabel = null;
                            }
                            if (Intrinsics.LJFF("inner_social_push_story_post", pushLabel)) {
                                C0RJN c0rjnLIZIZ3 = jm().LIZIZ();
                                if (c0rjnLIZIZ3 != null && (fragment2 = c0rjnLIZIZ3.LJ) != null && (iDetailBaseAbilityLIZ2 = C1600710rkz.LIZ(fragment2)) != null) {
                                    iDetailBaseAbilityLIZ2.yF(kp(), "click");
                                    return;
                                }
                                return;
                            }
                            if (((Number) C102600a8.LIZ.getValue()).intValue() == 1) {
                                C0RMW c0rmw = C0RMW.LIZ;
                                C0RF0 c0rf04 = jm().LIZLLL;
                                if (c0rf04 != null && (baseFeedPageParams = c0rf04.LJ) != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                                    from = c2189821An6.getFrom();
                                }
                                if (c0rmw.LJIILLIIL(from) || (c0rf0 = jm().LIZLLL) == null || (fragment = c0rf0.LIZJ) == null || (iDetailBaseAbilityLIZ = C1600710rkz.LIZ(fragment)) == null) {
                                    return;
                                }
                                iDetailBaseAbilityLIZ.yF(kp(), "click");
                                return;
                            }
                            IDetailFeedSafService iDetailFeedSafService2 = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
                            if (iDetailFeedSafService2 != null) {
                                C0RJN c0rjnLIZIZ4 = jm().LIZIZ();
                                if (c0rjnLIZIZ4 != null) {
                                    fragment4 = c0rjnLIZIZ4.LJ;
                                }
                                objLIZLLL2 = iDetailFeedSafService2.LIZLLL(fragment4);
                            }
                            if ((objLIZLLL2 instanceof InterfaceC214902198i) && (interfaceC214902198i = (InterfaceC214902198i) objLIZLLL2) != null) {
                                interfaceC214902198i.finish();
                                return;
                            }
                            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                            if (c19egLIZ2 == null) {
                                return;
                            }
                            c19egLIZ2.finish();
                            return;
                        }
                        return;
                    }
                }
                boolValueOf = Boolean.valueOf(zIsFinishing);
                if (!Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BaseSubVHTapTouchInterceptComponent, com.ss.android.ugc.aweme.feed.assem.ability.PanelSingleTapInterceptAbility
    public final boolean tw0(int i, long j, Object obj) {
        Object obj2;
        Float f;
        Object obj3;
        Float f2;
        IAdapterAbility iAdapterAbility;
        C0SR4 c0sr4LJJLIIIJL;
        Integer numValueOf;
        C0WIY c0wiy;
        C0WIY c0wiy2;
        boolean z = obj instanceof C0WIY;
        if (z && (c0wiy2 = (C0WIY) obj) != null) {
            obj2 = c0wiy2.LIZ;
        } else {
            obj2 = null;
        }
        if (obj2 instanceof Float) {
            f = (Float) obj2;
        } else {
            f = null;
        }
        if (z && (c0wiy = (C0WIY) obj) != null) {
            obj3 = c0wiy.LIZIZ;
        } else {
            obj3 = null;
        }
        if (obj3 instanceof Float) {
            f2 = (Float) obj3;
        } else {
            f2 = null;
        }
        if (!C281310B0v.LIZ()) {
            ip(f, f2, i, j);
            return false;
        }
        boolean zLJJIIJZLJL = C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(this));
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (((c0rjnLIZIZ != null && C1389300mG0.LJIJJ(c0rjnLIZIZ)) || !zLJJIIJZLJL) && (iAdapterAbility = (IAdapterAbility) this.LLJZ.getValue()) != null && (c0sr4LJJLIIIJL = iAdapterAbility.LJJLIIIJL()) != null && (numValueOf = Integer.valueOf(c0sr4LJJLIIIJL.getCount())) != null && numValueOf.intValue() == 1) {
            ip(f, f2, i, j);
            return false;
        }
        return super.tw0(i, j, obj);
    }
}
