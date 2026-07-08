package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.AbstractC1393330mMV;
import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C09R3;
import X.C0HTT;
import X.C0OB8;
import X.C0RJN;
import X.C0T4J;
import X.C0T4Q;
import X.C0T4R;
import X.C0T4S;
import X.C0T96;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1360460lVU;
import X.C1389300mG0;
import X.C1393290mMR;
import X.C1393300mMS;
import X.C1393310mMT;
import X.C1393320mMU;
import X.C13LE;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1589640rT8;
import X.C1599640rjG;
import X.C1637806bA;
import X.C1637906bB;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737030Svd;
import X.InterfaceC0148002o;
import X.InterfaceC1167780gUi;
import X.InterfaceC1167830gUn;
import X.InterfaceC1361270lWn;
import X.InterfaceC1392880mLm;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC752010Teh;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.BaseDialogController;
import com.ss.android.ugc.aweme.feed.DialogController;
import com.ss.android.ugc.aweme.feed.api.FeedActionApi;
import com.ss.android.ugc.aweme.feed.controller.BaseController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.ShareActionAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3EventDispatchViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class FriendsV3ShareActionBridgeAssem extends AbstractC738140SxQ implements C0HTT<C737030Svd>, InterfaceC752010Teh, ShareActionAbility, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final Set<AbstractC1393330mMV> LLILLL;
    public C1393290mMR LLILZ;
    public C0ZP4 LLILZIL;
    public final C01GW LLILZLL;
    public final AssemVMLazy LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3ShareActionBridgeAssem.class, "eventVM", "getEventVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3EventDispatchViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FriendsV3ShareActionBridgeAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3FeedListViewModel;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FriendsV3ShareActionBridgeAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3EventDispatchViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS556S0100000_12(c19719912DlLIZ, 494), AFwS259S0000000_21.get$arr$(162), null, true);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 492));
        this.LLILLL = new LinkedHashSet();
        this.LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 591));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FriendsV3FeedListViewModel.class);
        this.LLIZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS556S0100000_12(c19719912DlLIZ2, 495), AFwS259S0000000_21.get$arr$(163), null, true);
    }

    @Override // X.InterfaceC752010Teh
    public final String C7(boolean z) {
        return "homepage_friends";
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0mLm, X.0mMR] */
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
    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        AssemViewModel.asyncSubscribe$default(bo(), new C2217381BqS() { // from class: X.0mMX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1393390mMb) obj).LLILZ;
            }
        }, this, null, null, null, new AwS600S0100000_21(this, 230), 28, null);
        AssemViewModel.asyncSubscribe$default(bo(), new C2217381BqS() { // from class: X.0mMW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1393390mMb) obj).LLIZ;
            }
        }, this, null, null, null, new AwS600S0100000_21(this, 231), 28, null);
        AssemViewModel.asyncSubscribe$default(bo(), new C2217381BqS() { // from class: X.0mMY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1393390mMb) obj).LLILZIL;
            }
        }, this, null, null, null, new AwS591S0100000_12(this, 756), 28, null);
        AssemViewModel.asyncSubscribe$default(bo(), new C2217381BqS() { // from class: X.0mMZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1393390mMb) obj).LLILZLL;
            }
        }, this, null, null, null, new AwS600S0100000_21(this, 232), 28, null);
        AssemViewModel.asyncSubscribe$default(bo(), new C2217381BqS() { // from class: X.0mMa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1393390mMb) obj).LLJ;
            }
        }, this, null, null, null, new AwS591S0100000_12(this, 757), 28, null);
        AssemViewModel.asyncSubscribe$default(bo(), new C2217381BqS() { // from class: X.0mMc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1393390mMb) obj).LLIZLLLIL;
            }
        }, this, null, null, null, new AwS600S0100000_21(this, 233), 28, null);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            this.LLILZIL = C1360460lVU.LIZIZ.LJJJJLI(c19egLIZ, AFwS252S0000000_16.get$arr$(410));
        }
        C736680Sv4.LJIIIIZZ(this, bo(), new C2217381BqS() { // from class: X.0Sln
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1393390mMb) obj).LLJI;
            }
        }, null, new AwS623S0100000_9(this, 172), 6);
        ?? r1 = new InterfaceC1392880mLm() { // from class: X.0mMR
            @Override // X.InterfaceC1392880mLm
            public final void LIZ(String str, EnumC1392960mLu enumC1392960mLu) {
                AbstractC1393330mMV c1393320mMU;
                int i = C1393210mMJ.LIZ[enumC1392960mLu.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        c1393320mMU = new C1393310mMT(str, enumC1392960mLu);
                    } else {
                        c1393320mMU = new C1393300mMS(str, enumC1392960mLu);
                    }
                } else {
                    c1393320mMU = new C1393320mMU(str, enumC1392960mLu);
                }
                this.LIZ.fo(c1393320mMU);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
            @Override // X.InterfaceC1392880mLm
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(java.lang.String r5, X.EnumC1392960mLu r6) {
                /*
                    r4 = this;
                    com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3ShareActionBridgeAssem r0 = r4.LIZ
                    java.util.Set<X.0mMV> r0 = r0.LLILLL
                    java.util.Iterator r3 = r0.iterator()
                L8:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L50
                    java.lang.Object r2 = r3.next()
                    X.0mMV r2 = (X.AbstractC1393330mMV) r2
                    boolean r0 = r2 instanceof X.C1393310mMT
                    if (r0 == 0) goto L27
                    r1 = r2
                    X.0mMT r1 = (X.C1393310mMT) r1
                    java.lang.String r0 = r1.LIZJ
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
                    if (r0 == 0) goto L27
                    X.0mLu r0 = r1.LIZLLL
                    if (r0 == r6) goto L4c
                L27:
                    boolean r0 = r2 instanceof X.C1393320mMU
                    if (r0 == 0) goto L3a
                    r1 = r2
                    X.0mMU r1 = (X.C1393320mMU) r1
                    java.lang.String r0 = r1.LIZJ
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
                    if (r0 == 0) goto L3a
                    X.0mLu r0 = r1.LIZLLL
                    if (r0 == r6) goto L4c
                L3a:
                    boolean r0 = r2 instanceof X.C1393300mMS
                    if (r0 == 0) goto L8
                    X.0mMS r2 = (X.C1393300mMS) r2
                    java.lang.String r0 = r2.LIZJ
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
                    if (r0 == 0) goto L8
                    X.0mLu r0 = r2.LIZLLL
                    if (r0 != r6) goto L8
                L4c:
                    r3.remove()
                    goto L8
                L50:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1393290mMR.LIZIZ(java.lang.String, X.0mLu):void");
            }
        };
        this.LLILZ = r1;
        C1589640rT8.LIZIZ.D2(r1);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, ShareActionAbility.class, null, null);
        }
        BaseController baseController = (BaseController) this.LLILLJJLI.getValue();
        if (baseController != null) {
            baseController.onAttach(C724240Sb0.LIZ(this), C724240Sb0.LJI(this));
        }
    }

    public final FriendsV3EventDispatchViewModel bo() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (FriendsV3EventDispatchViewModel) assemVMLazy.getValue();
    }

    /* JADX INFO: renamed from: do */
    public FriendsV3FeedListViewModel mo219do() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (FriendsV3FeedListViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        C0ZP4 c0zp4 = this.LLILZIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLILZIL = null;
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), ShareActionAbility.class, null);
        }
        C1589640rT8.LIZIZ.H2(this.LLILZ);
        this.LLILZ = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        Iterator<AbstractC1393330mMV> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            ho(it2.next());
        }
        this.LLILLL.clear();
    }

    @Override // X.C0HTT
    public final void LLIIL(C737030Svd c737030Svd) {
        Integer numValueOf;
        Aweme aweme;
        List<ITEM> listListGetAll;
        C0OB8 c0ob8;
        Aweme aweme2;
        final Aweme aweme3;
        IMixFeedService iMixFeedService;
        final Aweme aweme4;
        final IMixFeedService iMixFeedService2;
        Aweme aweme5;
        String aid;
        Aweme aweme6;
        String aid2;
        Aweme aweme7;
        C737030Svd c737030Svd2 = c737030Svd;
        Context context = getContext();
        if (context != null) {
            Object obj = null;
            C0RJN c0rjnLIZIZ = null;
            if (c737030Svd2 != null && (numValueOf = Integer.valueOf(c737030Svd2.LIZ)) != null) {
                if (numValueOf.intValue() == 1) {
                    Object obj2 = c737030Svd2.LIZIZ;
                    if ((obj2 instanceof Aweme) && (aweme7 = (Aweme) obj2) != null) {
                        ShareDependService.LIZ.getClass();
                        ShareDependServiceImpl.LJJJJI().LJJIZ(aweme7, "homepage_friends", context, "", "", "", "", 0, null, null);
                        return;
                    }
                    return;
                }
                if (numValueOf.intValue() == 2) {
                    Object obj3 = c737030Svd2.LIZIZ;
                    if (obj3 instanceof Aweme) {
                        aweme5 = (Aweme) obj3;
                    } else {
                        aweme5 = null;
                    }
                    String str = "";
                    if (aweme5 == null || (aid = aweme5.getAid()) == null) {
                        aid = "";
                    }
                    if (TextUtils.isEmpty(aid)) {
                        return;
                    }
                    try {
                        FeedActionApi.LIZ(aid);
                        C189200o6.m2constructorimpl(aid);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    FriendsV3FeedRepository.LIZ.getClass();
                    FriendsV3FeedRepository.LIZIZ().LIZJ(aid);
                    Object obj4 = c737030Svd2.LIZIZ;
                    if ((obj4 instanceof Aweme) && (aweme6 = (Aweme) obj4) != null && (aid2 = aweme6.getAid()) != null) {
                        str = aid2;
                    }
                    fo(new C0T4R(str));
                    return;
                }
                if (numValueOf.intValue() == 55) {
                    Object obj5 = c737030Svd2.LIZIZ;
                    if (!(obj5 instanceof Aweme) || (aweme4 = (Aweme) obj5) == null) {
                        return;
                    }
                    final String str2 = c737030Svd2.LJIIJ;
                    final C19EG c19egLIZ = C724240Sb0.LIZ(this);
                    if (c19egLIZ == null || (iMixFeedService2 = (IMixFeedService) PluggableExtentionKt.pluggableSpi$default(IMixFeedService.class, false, false, false, 14, null)) == null) {
                        return;
                    }
                    iMixFeedService2.LJJIIJZLJL(new InterfaceC1167830gUn() { // from class: X.0STd
                        @Override // X.InterfaceC1167830gUn
                        public final void LIZ(int i, boolean z) {
                            C0RJN c0rjnLIZIZ2;
                            if (z) {
                                IMixFeedService iMixFeedService3 = iMixFeedService2;
                                C19EG c19eg = c19egLIZ;
                                Aweme aweme8 = aweme4;
                                Fragment fragmentLJI = C724240Sb0.LJI(this);
                                if (fragmentLJI != null) {
                                    c0rjnLIZIZ2 = C1578630rBN.LIZIZ(fragmentLJI);
                                } else {
                                    c0rjnLIZIZ2 = null;
                                }
                                iMixFeedService3.LJIJJLI(c19eg, aweme8, "", "", C1389300mG0.LIZ(c0rjnLIZIZ2), str2);
                                return;
                            }
                            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                            c1389890mGx.LJIIIZ(2131834213);
                            c1389890mGx.LJIIJJI();
                        }
                    });
                    return;
                }
                if (numValueOf.intValue() == 56) {
                    Object obj6 = c737030Svd2.LIZIZ;
                    if (!(obj6 instanceof Aweme) || (aweme3 = (Aweme) obj6) == null) {
                        return;
                    }
                    String str3 = c737030Svd2.LJIIJ;
                    C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                    if (c19egLIZ2 == null || (iMixFeedService = (IMixFeedService) PluggableExtentionKt.pluggableSpi$default(IMixFeedService.class, false, false, false, 14, null)) == null) {
                        return;
                    }
                    InterfaceC1167780gUi interfaceC1167780gUi = new InterfaceC1167780gUi() { // from class: X.0mGh
                        @Override // X.InterfaceC1167780gUi
                        public final void LIZIZ(boolean z) {
                        }

                        @Override // X.InterfaceC1167780gUi
                        public final void LIZ(boolean z) {
                            if (z) {
                                aweme3.playlist_info = null;
                            }
                        }
                    };
                    Fragment fragmentLJI = C724240Sb0.LJI(this);
                    if (fragmentLJI != null) {
                        c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI);
                    }
                    iMixFeedService.LJJIII(c19egLIZ2, aweme3, interfaceC1167780gUi, C1389300mG0.LIZ(c0rjnLIZIZ), str3);
                    return;
                }
                if (numValueOf.intValue() != 70) {
                    return;
                }
                Object obj7 = c737030Svd2.LIZIZ;
                if (!(obj7 instanceof Aweme) || (aweme = (Aweme) obj7) == null || (listListGetAll = mo219do().listGetAll()) == 0) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (ITEM item : listListGetAll) {
                    if ((item instanceof InterfaceC1361270lWn) && (c0ob8 = (C0OB8) item) != null && (aweme2 = c0ob8.getAweme()) != null) {
                        arrayList.add(aweme2);
                    }
                }
                List listLLIIII = C13LP.LLIIII(arrayList);
                if (listLLIIII == null || listLLIIII.isEmpty()) {
                    return;
                }
                Iterator it2 = listLLIIII.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (Intrinsics.LJFF(((Aweme) next).getAid(), aweme.getAid())) {
                        obj = next;
                        break;
                    }
                }
                Aweme aweme8 = (Aweme) obj;
                if (aweme8 == null) {
                    return;
                }
                aweme8.setEditPostPermission(aweme.getEditPostPermission());
            }
        }
    }

    public final void fo(AbstractC1393330mMV abstractC1393330mMV) {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            ho(abstractC1393330mMV);
        } else {
            this.LLILLL.add(abstractC1393330mMV);
        }
    }

    public void ho(AbstractC1393330mMV abstractC1393330mMV) {
        if (abstractC1393330mMV instanceof C0T4R) {
            String str = ((C0T4R) abstractC1393330mMV).LIZJ;
            AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(this, 493);
            if (str != null) {
                C1599640rjG.LIZIZ.Yu(str);
                awS556S0100000_12.invoke();
                return;
            }
            return;
        }
        if (abstractC1393330mMV instanceof C0T4Q) {
            String str2 = ((C0T4Q) abstractC1393330mMV).LIZJ;
            if (str2 == null) {
                return;
            }
            C1599640rjG.LIZIZ.Yu(str2);
            return;
        }
        if (abstractC1393330mMV instanceof C0T96) {
            String str3 = ((C0T96) abstractC1393330mMV).LIZJ;
            AwS413S0200000_12 awS413S0200000_12 = new AwS413S0200000_12(abstractC1393330mMV, this, 26);
            if (str3 == null) {
                return;
            }
            C1599640rjG.LIZIZ.Yu(str3);
            awS413S0200000_12.invoke();
            return;
        }
        if (abstractC1393330mMV instanceof C1393310mMT) {
            C1393310mMT c1393310mMT = (C1393310mMT) abstractC1393330mMV;
            C1599640rjG.LIZIZ.ev(c1393310mMT.LIZJ, c1393310mMT.LIZLLL);
            return;
        }
        if (abstractC1393330mMV instanceof C1393320mMU) {
            C1393320mMU c1393320mMU = (C1393320mMU) abstractC1393330mMV;
            C1599640rjG.LIZIZ.ev(c1393320mMU.LIZJ, c1393320mMU.LIZLLL);
            return;
        }
        if (abstractC1393330mMV instanceof C1393300mMS) {
            C1393300mMS c1393300mMS = (C1393300mMS) abstractC1393330mMV;
            C1599640rjG.LIZIZ.ev(c1393300mMS.LIZJ, c1393300mMS.LIZLLL);
            return;
        }
        if (abstractC1393330mMV instanceof C0T4S) {
            C1599640rjG.LIZIZ.Kn(((C0T4S) abstractC1393330mMV).LIZJ);
            return;
        }
        throw new C1954807lC();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.ShareActionAbility
    public final void Mx1(Aweme aweme, C0T4J c0t4j) {
        BaseDialogController baseDialogController = (BaseDialogController) this.LLILLJJLI.getValue();
        if (baseDialogController != null) {
            ((DialogController) baseDialogController).LLIIZ(C724240Sb0.LIZ(this), aweme, c0t4j);
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
