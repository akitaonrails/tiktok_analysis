package com.ss.android.ugc.aweme.vibefeed.feed.interact.digg;

import X.AbstractC214823195h;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0P6P;
import X.C1220000hqw;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1575440r6E;
import X.C1575960r74;
import X.C1607950rwf;
import X.C1749280vcc;
import X.C19EG;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2255108sX;
import X.C339190DRl;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C481090Itn;
import X.C607770Nsd;
import X.C627300Oj2;
import X.C628920Ole;
import X.C628930Olf;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC19356710o9;
import X.EnumC481060Itk;
import X.EnumC912680ZrG;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS36S0100000_9;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.detail.prefab.ability.InnerFlowAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.prefab.NetworkHelper;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber;
import com.ss.android.ugc.aweme.prefab.ability.RefreshLoadingSubscriber;
import com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS218S0300000_9;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.AwS623S0100000_9;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeFeedDiggDetailListAssem extends DynamicAssem implements InnerFlowAbility<C628920Ole>, RefreshSuccessSubscriber, RefreshErrorSubscriber, RefreshLoadingSubscriber {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C628930Olf.class, "VibeFeedDiggDetailHierarchyData"), checkSupervisorPrepared());
    public final C736950SvV LLJJIII;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJI;
    public C481090Itn LLJJIJIIJIL;
    public C1749280vcc LLJJIJIL;
    public final C01GW LLJJJ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.i82;
    }

    public final C628930Olf lp() {
        return (C628930Olf) this.LLJJI.getValue();
    }

    public final VibeFeedDiggDetailListVM mp() {
        return (VibeFeedDiggDetailListVM) this.LLJJIII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber
    public final void t0() {
        C481090Itn c481090Itn = this.LLJJIJIIJIL;
        if (c481090Itn != null) {
            c481090Itn.setRefreshing(false);
        }
    }

    public VibeFeedDiggDetailListAssem() {
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(348);
        this.LLJJIII = new C736950SvV(C13LE.LIZ(VibeFeedDiggDetailListVM.class), aFwS195S0000000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(669), new AwS553S0100000_9((AbstractC738140SxQ) this, 1593), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshLoadingSubscriber
    public final void i1() {
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber
    public final void LLLLLZIL(Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefreshError ");
        sbLIZ.append(th);
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        C481090Itn c481090Itn = this.LLJJIJIIJIL;
        if (c481090Itn != null) {
            c481090Itn.setRefreshing(false);
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
    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Context context;
        mo127do();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            LifecycleOwner viewLifecycleOwner = null;
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            C481090Itn c481090Itn = (C481090Itn) getContentView().findViewById(R.id.fu4);
            this.LLJJIJIIJIL = c481090Itn;
            if (c481090Itn != null) {
                c481090Itn.setOnRefreshListener(new AwS546S0100000_2(this, 871));
                if (C1558520qew.LIZ(interfaceC665370Q7zLJFF, RefreshAbility.class, null) == null) {
                    c481090Itn.setOverScrollMode(EnumC19356710o9.NONE);
                    c481090Itn.setScrollMode(EnumC481060Itk.NONE);
                    c481090Itn.setNestedHeader(null);
                } else {
                    c481090Itn.setOverScrollMode(EnumC19356710o9.ONLY_TOP);
                    c481090Itn.LLJJIJI = true;
                }
            }
            this.LLJJIJI = (ViewOnAttachStateChangeListenerC20604515jv) getContentView().findViewById(R.id.mno);
            this.LLJJIJIL = (C1749280vcc) getContentView().findViewById(R.id.mnr);
            final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJI;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                C339190DRl.LIZLLL(viewOnAttachStateChangeListenerC20604515jv);
                viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
                C20603715jn c20603715jn = new C20603715jn();
                c20603715jn.LIZJ = true;
                c20603715jn.LIZ = 5;
                viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
                mp().setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
                viewOnAttachStateChangeListenerC20604515jv.LJIIL(mp().getConfig());
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(VibeDiggAwemeDetailCell.class);
                C1575960r74 c1575960r74 = C1575960r74.LL;
                Context context2 = viewOnAttachStateChangeListenerC20604515jv.getContext();
                c1575960r74.getClass();
                final int iLIZIZ = C1575960r74.LIZIZ(context2);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), iLIZIZ);
                gridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.0OlN
                    @Override // X.AbstractC214823195h
                    public final int LJFF(int i) {
                        List<InterfaceC1891350zJl> listLJII = viewOnAttachStateChangeListenerC20604515jv.getState().LJII();
                        int headerCount = viewOnAttachStateChangeListenerC20604515jv.getHeaderCount();
                        if (i < headerCount) {
                            return iLIZIZ;
                        }
                        if (i >= ((ArrayList) listLJII).size() + headerCount) {
                            return iLIZIZ;
                        }
                        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) ListProtector.get(listLJII, i - headerCount);
                        if (interfaceC1891350zJl instanceof C423460Gj2) {
                            return iLIZIZ;
                        }
                        if ((interfaceC1891350zJl instanceof C628920Ole) && ((C628920Ole) interfaceC1891350zJl).LLIZLLLIL == EnumC628900Olc.DATE_TITLE) {
                            return iLIZIZ;
                        }
                        return 1;
                    }
                };
                viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(gridLayoutManager);
            }
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null) {
                InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJI2, null);
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIJI;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                    viewOnAttachStateChangeListenerC20604515jv2.addOnScrollListener(new AsS36S0100000_9(interfaceC665370Q7zLJFF2, 0));
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onViewCreated vm:");
            sbLIZ.append(mp());
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, RefreshSuccessSubscriber.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, this, RefreshSuccessSubscriber.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(this);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(this);
                    c2255108sX.LL.add(interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(RefreshSuccessSubscriber.class.getClassLoader(), new Class[]{RefreshSuccessSubscriber.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, RefreshSuccessSubscriber.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber");
                    }
                }
            }
            InterfaceC494301wD interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLJFF, RefreshErrorSubscriber.class, null);
            if (interfaceC494301wDLIZ2 == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, this, RefreshErrorSubscriber.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(interfaceC494301wDLIZ2);
                    if (invocationHandler2 instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler2).LL.add(this);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2255108sX c2255108sX2 = new C2255108sX();
                    c2255108sX2.LL.add(this);
                    c2255108sX2.LL.add(interfaceC494301wDLIZ2);
                    Object objNewProxyInstance2 = Proxy.newProxyInstance(RefreshErrorSubscriber.class.getClassLoader(), new Class[]{RefreshErrorSubscriber.class}, c2255108sX2);
                    if (objNewProxyInstance2 != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance2, RefreshErrorSubscriber.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber");
                    }
                }
            }
            InterfaceC494301wD interfaceC494301wDLIZ3 = C1558520qew.LIZ(interfaceC665370Q7zLJFF, RefreshLoadingSubscriber.class, null);
            if (interfaceC494301wDLIZ3 == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, this, RefreshLoadingSubscriber.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler3 = Proxy.getInvocationHandler(interfaceC494301wDLIZ3);
                    if (invocationHandler3 instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler3).LL.add(this);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C2255108sX c2255108sX3 = new C2255108sX();
                    c2255108sX3.LL.add(this);
                    c2255108sX3.LL.add(interfaceC494301wDLIZ3);
                    Object objNewProxyInstance3 = Proxy.newProxyInstance(RefreshLoadingSubscriber.class.getClassLoader(), new Class[]{RefreshLoadingSubscriber.class}, c2255108sX3);
                    if (objNewProxyInstance3 != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance3, RefreshLoadingSubscriber.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshLoadingSubscriber");
                    }
                }
            }
            C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0OlS
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C628860OlY) obj).LLILLJJLI;
                }
            }, null, new AwS623S0100000_9(this, 155), 6);
            Fragment fragmentLJI3 = C724240Sb0.LJI(this);
            if (fragmentLJI3 != null) {
                InterfaceC665370Q7z interfaceC665370Q7zLJFF3 = C1558360qeg.LJFF(fragmentLJI3, null);
                InterfaceC494301wD interfaceC494301wDLIZ4 = C1558520qew.LIZ(interfaceC665370Q7zLJFF3, InnerFlowAbility.class, null);
                if (interfaceC494301wDLIZ4 == null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF3, this, InnerFlowAbility.class, null, null);
                } else {
                    try {
                        InvocationHandler invocationHandler4 = Proxy.getInvocationHandler(interfaceC494301wDLIZ4);
                        if (invocationHandler4 instanceof C2255108sX) {
                            ((C2255108sX) invocationHandler4).LL.add(this);
                        } else {
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        }
                    } catch (IllegalArgumentException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        C2255108sX c2255108sX4 = new C2255108sX();
                        c2255108sX4.LL.add(this);
                        c2255108sX4.LL.add(interfaceC494301wDLIZ4);
                        Object objNewProxyInstance4 = Proxy.newProxyInstance(InnerFlowAbility.class.getClassLoader(), new Class[]{InnerFlowAbility.class}, c2255108sX4);
                        if (objNewProxyInstance4 != null) {
                            C1558520qew.LJII(interfaceC665370Q7zLJFF3, (InterfaceC494301wD) objNewProxyInstance4, InnerFlowAbility.class, null, null);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.InnerFlowAbility<com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeDiggHistoryItem>");
                        }
                    }
                }
            }
            VibeFeedDiggDetailListVM vibeFeedDiggDetailListVMMp = mp();
            AssemViewModel.asyncSubscribe$default(vibeFeedDiggDetailListVMMp, new C2217381BqS() { // from class: X.0OlQ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((InterfaceC636270OxV) obj).getRefreshState();
                }
            }, null, new AwS583S0100000_4(this, 0), new AwS548S0100000_4(this, 16), new AwS583S0100000_4(this, 1), 2, null);
            C736680Sv4.LJIIIIZZ(this, vibeFeedDiggDetailListVMMp, new C2217381BqS() { // from class: X.0OlR
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((InterfaceC627270Oiz) obj).getListState();
                }
            }, null, new AwS618S0100000_4(this, 2), 6);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJIJI;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                context = viewOnAttachStateChangeListenerC20604515jv3.getContext();
            } else {
                context = null;
            }
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ean, this.LLJJIJI, false);
            C786410Ut5.LJLLLLLL(8, viewTd);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJIJI;
            if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
                viewOnAttachStateChangeListenerC20604515jv4.LIZLLL(viewTd);
            }
            C627300Oj2 c627300Oj2 = new C627300Oj2(this.LLJJIJI, new C0P6P() { // from class: X.0OlO
                @Override // X.C0P6P
                public final void LJJIFFI() {
                    this.LL.mp().manualListRetry(EnumC323450Cm7.Next);
                }
            });
            AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 8);
            AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(viewTd, 3);
            AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9(viewTd, 9);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                Fragment fragmentLJI4 = C724240Sb0.LJI(this);
                if (fragmentLJI4 != null) {
                    viewLifecycleOwner = fragmentLJI4.getViewLifecycleOwner();
                }
                NetworkHelper networkHelper = new NetworkHelper(awS553S0100000_9, null, awS545S0100000_1, awS553S0100000_92, c19egLIZ, null, 1, viewLifecycleOwner, 162);
                AssemViewModel.asyncSubscribe$default(mp(), new C2217381BqS() { // from class: X.0OlP
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((InterfaceC636270OxV) obj).getLoadMoreState();
                    }
                }, null, new AwS218S0300000_9(networkHelper, this, c627300Oj2, 0), new AwS553S0100000_9(networkHelper, 7), new AwS588S0100000_9(networkHelper, 5), 2, null);
                C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0OlT
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C628860OlY) obj).LLILLL;
                    }
                }, null, new AwS618S0100000_4(this, 3), 6);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.InnerFlowAbility
    public final void Nu0(C607770Nsd c607770Nsd, View view) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C628920Ole c628920Ole = (C628920Ole) c607770Nsd;
        String str9 = null;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJIIJ();
        }
        C628930Olf c628930OlfLp = lp();
        String str10 = null;
        if (c628930OlfLp != null) {
            str9 = c628930OlfLp.LLILLL;
        }
        String str11 = "";
        if (str9 == null) {
            str9 = "";
        }
        EnumC912680ZrG enumC912680ZrGLJI = C1575440r6E.LJI(str9);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://aweme/detail/");
        smartRouteBuildRoute.withParam("activity_has_activity_options", true);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, c628920Ole.LLILLJJLI.getAid(), bundle);
        C628930Olf c628930OlfLp2 = lp();
        if (c628930OlfLp2 != null) {
            str = c628930OlfLp2.LL;
        } else {
            str = null;
        }
        C786410Ut5.LJJJI("userid", str, bundle);
        C628930Olf c628930OlfLp3 = lp();
        if (c628930OlfLp3 != null) {
            str2 = c628930OlfLp3.LLILLJJLI;
        } else {
            str2 = null;
        }
        C786410Ut5.LJJJI("sec_userid", str2, bundle);
        bundle.putInt("video_type", 57);
        C786410Ut5.LJJJI("enter_from", "shared_feed_like_history", bundle);
        C786410Ut5.LJJJI("enter_method", "click_history_list", bundle);
        C628930Olf c628930OlfLp4 = lp();
        if (c628930OlfLp4 != null) {
            str3 = c628930OlfLp4.LLILLL;
        } else {
            str3 = null;
        }
        C786410Ut5.LJJJI("conversation_id", str3, bundle);
        C786410Ut5.LJJJI("chat_type_str", enumC912680ZrGLJI.stringValue(), bundle);
        C786410Ut5.LJJJI("video_from", "VIBE_FEED_LIST_ENTRANCE", bundle);
        C628930Olf c628930OlfLp5 = lp();
        if (c628930OlfLp5 != null) {
            str4 = c628930OlfLp5.LLILZIL;
        } else {
            str4 = null;
        }
        C786410Ut5.LJJJI("shared_feed_id", String.valueOf(str4), bundle);
        HashMap map = new HashMap();
        C628930Olf c628930OlfLp6 = lp();
        if (c628930OlfLp6 == null || (str5 = c628930OlfLp6.LLILZIL) == null) {
            str5 = "";
        }
        map.put("feed_id", str5);
        C786410Ut5.LJJIZ(bundle, "feed_param_extra", map);
        smartRouteBuildRoute.withParam(bundle);
        JSONObject jSONObject = new JSONObject();
        C628930Olf c628930OlfLp7 = lp();
        if (c628930OlfLp7 != null) {
            str6 = c628930OlfLp7.LL;
        } else {
            str6 = null;
        }
        jSONObject.put("to_user_id", str6);
        C628930Olf c628930OlfLp8 = lp();
        if (c628930OlfLp8 != null) {
            str7 = c628930OlfLp8.LLILLJJLI;
        } else {
            str7 = null;
        }
        jSONObject.put("to_user_sec_uid", str7);
        C628930Olf c628930OlfLp9 = lp();
        if (c628930OlfLp9 != null) {
            str10 = c628930OlfLp9.LLILLL;
        }
        jSONObject.put("conversation_id", str10);
        jSONObject.put("enter_from", "shared_feed_like_history");
        C628930Olf c628930OlfLp10 = lp();
        if (c628930OlfLp10 != null && (str8 = c628930OlfLp10.LLILZIL) != null) {
            str11 = str8;
        }
        jSONObject.put("feed_id", str11);
        jSONObject.put("mutual_feed_scene", enumC912680ZrGLJI.getValue());
        jSONObject.put("enter_type", "click_history_list");
        smartRouteBuildRoute.withParam("vibe_feed_extra", C786410Ut5.J3(jSONObject));
        smartRouteBuildRoute.withBundleAnimation(C1607950rwf.LIZ(view, view.getWidth(), view.getHeight()).LJFF());
        smartRouteBuildRoute.open();
    }
}
