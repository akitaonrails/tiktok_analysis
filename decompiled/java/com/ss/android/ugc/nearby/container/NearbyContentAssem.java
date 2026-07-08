package com.ss.android.ugc.nearby.container;

import X.AbstractC21673619ry;
import X.AbstractC738140SxQ;
import X.AnonymousClass0350;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C0B91;
import X.C0C64;
import X.C0DMM;
import X.C0DXR;
import X.C0J34;
import X.C0S4U;
import X.C1155240gAU;
import X.C11JF;
import X.C1203960hR4;
import X.C1204440hRq;
import X.C1204450hRr;
import X.C1204470hRt;
import X.C1204510hRx;
import X.C1205050hSp;
import X.C1220000hqw;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1906580ziK;
import X.C19719912Dl;
import X.C20603715jn;
import X.C20742916Ex;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C814420VxA;
import X.EnumC481060Itk;
import X.InterfaceC1204310hRd;
import X.InterfaceC1204490hRv;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS222S0100000_18;
import Y.AfS187S0100000_18;
import Y.AsS45S0100000_18;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.NonPersonalizedVM;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.service.ILocationOfflineService;
import com.ss.android.ugc.nearby.container.ability.IFeedContentAbility;
import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;
import com.ss.android.ugc.nearby.feedcard.NearbyFeedCardCell;
import com.ss.android.ugc.nearby.feedcard.NearbyFeedFooterCell;
import com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel;
import com.ss.android.ugc.nearby.locationpermission.NearbyFeedAskLocationChangeCell;
import com.ss.android.ugc.nearby.notice.NearbyFeedNoticeCell;
import com.ss.android.ugc.nearby.notice.NearbyFeedPlaceHolderCell;
import com.ss.android.ugc.nearby.settings.NearbyFirstEnterOpt;
import com.ss.android.ugc.nearby.toolzone.NearbyToolZoneCell;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS156S0110000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyContentAssem extends UIListContentAssem<NearbyFeedSharedViewModel> implements IFeedContentAbility, InterfaceC1554640qYg {
    public static final C1205050hSp LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static AwS562S0100000_18 LLJJJIL;
    public final C736950SvV LLIZLLLIL = new C736950SvV(C13LE.LIZ(NearbyFeedSharedViewModel.class), AFwS206S0000000_18.get$arr$(628), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(791), new AwS562S0100000_18((AbstractC738140SxQ) this, 2350), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2346));
    public C0J34 LLJI;
    public StaggeredGridLayoutManager LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public C1203960hR4 LLJILJILJ;
    public Integer LLJILLL;
    public boolean LLJJ;
    public final boolean LLJJI;
    public final AssemVMLazy LLJJIII;
    public C11JF LLJJIJI;
    public final C20603715jn LLJJIJIIJIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0hSp] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NearbyContentAssem.class, "containerVM", "getContainerVM()Lcom/ss/android/ugc/nearby/container/vm/NearbyContainerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(NearbyContentAssem.class, "nonPersonalizedVM", "getNonPersonalizedVM()Lcom/bytedance/tiktok/homepage/mainfragment/NonPersonalizedVM;", 0)};
        LLJJIJIL = new Object() { // from class: X.0hSp
        };
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2021791179) {
            return null;
        }
        return this;
    }

    public NearbyContentAssem() {
        boolean z = true;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NearbyContainerViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 2348), AFwS256S0000000_18.get$arr$(789), null, true);
        checkSupervisorPrepared();
        new C723590SZx(this, C1155240gAU.class, "NearbyBasicHierarchyData");
        this.LLJJ = true;
        int i = 0;
        this.LLJJI = ComplianceServiceProvider.LJI().LJIIJ(false);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(NonPersonalizedVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 2349), AFwS256S0000000_18.get$arr$(790), null, true);
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 4, "nearby_feed_loadmore_count", false) > 0 ? C0C64.LJIILLIIL().LJIJ(31744, 4, "nearby_feed_loadmore_count", false) : 4;
        c20603715jn.LJIIJ = true;
        c20603715jn.LIZLLL = NearbyFeedFooterCell.class;
        C01GW c01gw = NearbyFirstEnterOpt.LIZIZ;
        if (((NearbyFirstEnterOpt.NearbyFirstEnterOptConfig) c01gw.getValue()).enableValue) {
            c20603715jn.LJIIIIZZ = new OptimizeAbility(i, z, C2097908Jt.LIZJ(new Pair(NearbyFeedCardCell.class, Integer.valueOf(((NearbyFirstEnterOpt.NearbyFirstEnterOptConfig) c01gw.getValue()).preloadCount))), 2);
        }
        this.LLJJIJIIJIL = c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    public final NearbyContainerViewModel Oo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (NearbyContainerViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: So, reason: merged with bridge method [inline-methods] */
    public final NearbyFeedSharedViewModel ip() {
        return (NearbyFeedSharedViewModel) this.LLIZLLLIL.getValue();
    }

    public final boolean No() {
        HomeTabAbility homeTabAbilityLIZ;
        MainActivityScope mainActivityScopeLIZLLL = C0S4U.LIZLLL(this);
        if (mainActivityScopeLIZLLL == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZLLL)) == null) {
            return false;
        }
        String strCt0 = homeTabAbilityLIZ.Ct0();
        String strZj2 = homeTabAbilityLIZ.Zj2();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkInNearbyTab, top=");
        sbLIZ.append(strCt0);
        sbLIZ.append(", bottom=");
        sbLIZ.append(strZj2);
        C2188811AlT.LIZIZ(sbLIZ);
        return Intrinsics.LJFF(strCt0, "Nearby") && Intrinsics.LJFF(strZj2, "HOME");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.nearby.container.ability.IFeedContentAbility
    public final int hq1() {
        List<InterfaceC1204490hRv> list = ((C1204510hRx) Jo().getState()).LL.LLILZ;
        if (list != null) {
            int i = 0;
            for (InterfaceC1204490hRv interfaceC1204490hRv : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                if (interfaceC1204490hRv instanceof C1204470hRt) {
                    return i;
                }
                i = i2;
            }
        }
        return 0;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        C11JF c11jf = this.LLJJIJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJIJI = null;
        LLJJJIL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    @Override // X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r6 = this;
            super.onResume()
            com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel r0 = r6.Jo()
            X.002o r0 = r0.getState()
            X.0hRx r0 = (X.C1204510hRx) r0
            r0.getClass()
            X.0Ojc r0 = r0.getListState()
            java.util.List<ITEM> r1 = r0.LLILZ
            r5 = 0
            if (r1 == 0) goto L75
            boolean r0 = r1.isEmpty()
            r2 = 1
            if (r0 != 0) goto L75
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof com.ss.android.ugc.nearby.container.model.NearbyNoticeModel
            if (r0 == 0) goto L24
        L32:
            r4 = 0
            if (r2 == 0) goto L45
            java.lang.Integer r0 = r6.LLJILLL
            if (r0 == 0) goto L73
            int r0 = r0.intValue()
            int r0 = r0 + 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L43:
            r6.LLJILLL = r0
        L45:
            java.lang.Integer r0 = r6.LLJILLL
            if (r0 == 0) goto L5b
            int r3 = r0.intValue()
            X.15jv r2 = r6.Go()
            Y.ARunnableS29S0101000_18 r1 = new Y.ARunnableS29S0101000_18
            r0 = 9
            r1.<init>(r3, r6, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
        L5b:
            r6.LLJILLL = r4
            boolean r0 = r6.No()
            if (r0 == 0) goto L72
            X.0hSa r0 = X.C1204900hSa.LIZ
            r0.getClass()
            boolean r0 = X.C1204900hSa.LIZLLL
            if (r0 == 0) goto L72
            X.C1204900hSa.LIZ()
            X.C1204900hSa.LIZLLL(r5)
        L72:
            return
        L73:
            r0 = r4
            goto L43
        L75:
            r2 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.container.NearbyContentAssem.onResume():void");
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.nearby.container.ability.IFeedContentAbility
    public final void C51(C1203960hR4 c1203960hR4) {
        C0J34 c0j34 = this.LLJI;
        if (c0j34 != null && !c0j34.LLLFF) {
            this.LLJILJILJ = c1203960hR4;
            AbstractC21673619ry adapter = Go().getAdapter();
            if (adapter != null && adapter.getItemCount() > 0) {
                Go().scrollToPosition(0);
            }
            C0J34 c0j342 = this.LLJI;
            if (c0j342 != null) {
                c0j342.LJ();
            }
        }
    }

    @C14EU(threadMode = ThreadMode.POSTING)
    public final void onNearbyFeedScrollToPositionEvent(AnonymousClass0350 anonymousClass0350) {
        this.LLJILLL = Integer.valueOf(anonymousClass0350.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNearbyFeedScrollToPositionEvent, positionWhenBackToDoubleColumn=");
        sbLIZ.append(this.LLJILLL);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        Context context = getContext();
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        C20742916Ex.LIZ(context, R.layout.ds0, viewGroup, true, -1);
        C0J34 c0j34 = (C0J34) LJJIJL().findViewById(R.id.p4b);
        this.LLJI = c0j34;
        if (c0j34 != null) {
            c0j34.setScrollMode(EnumC481060Itk.REFRESH);
        }
        C0J34 c0j342 = this.LLJI;
        if (c0j342 != null) {
            c0j342.setOnRefreshListener(new AwS562S0100000_18(this, 2554));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), 0);
        if (((NearbyFirstEnterOpt.NearbyFirstEnterOptConfig) NearbyFirstEnterOpt.LIZIZ.getValue()).enableValue) {
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LJIJ = true;
            viewOnAttachStateChangeListenerC20604515jvGo.setListConfig(c20603715jn);
        }
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(NearbyFeedNoticeCell.class, NearbyFeedPlaceHolderCell.class, NearbyToolZoneCell.class, NearbyFeedCardCell.class, NearbyFeedAskLocationChangeCell.class);
        viewOnAttachStateChangeListenerC20604515jvGo.getRecycledViewPool().setMaxRecycledViews(viewOnAttachStateChangeListenerC20604515jvGo.LJIIJJI(C1204470hRt.class, null), 12);
        viewOnAttachStateChangeListenerC20604515jvGo.setLayoutManager(new NearbyStaggeredGridLayoutManager() { // from class: com.ss.android.ugc.nearby.container.NearbyContentAssem$initPowerList$1$1
            @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager
            public final int LJJIII() {
                return this.LL;
            }
        });
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jvGo.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        } else {
            staggeredGridLayoutManager = null;
        }
        this.LLJIJIL = staggeredGridLayoutManager;
        viewOnAttachStateChangeListenerC20604515jvGo.addItemDecoration(new C0DXR() { // from class: X.0GmR
            public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d)));
            public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
                int headerCount;
                C21681819tI c21681819tI;
                C21681819tI c21681819tI2 = null;
                if (recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) {
                    viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView;
                } else {
                    viewOnAttachStateChangeListenerC20604515jv = null;
                }
                if (viewOnAttachStateChangeListenerC20604515jv != null) {
                    headerCount = viewOnAttachStateChangeListenerC20604515jv.getHeaderCount();
                } else {
                    headerCount = 0;
                }
                if (recyclerView.getChildAdapterPosition(view2) < headerCount) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof C21681819tI) && (c21681819tI = (C21681819tI) layoutParams) != null) {
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 instanceof C21681819tI) {
                        c21681819tI2 = (C21681819tI) layoutParams2;
                    }
                    int iLIZ = c21681819tI.LIZ();
                    if (c21681819tI2 != null && true == c21681819tI2.LLILLJJLI) {
                        return;
                    }
                    if (iLIZ == 0) {
                        rect.set(0, 0, this.LL, this.LLILLJJLI);
                    } else {
                        rect.set(this.LL, 0, 0, this.LLILLJJLI);
                    }
                }
            }
        });
        if (((ILocationOfflineService) ServiceManager.get().getService(ILocationOfflineService.class)).LIZIZ()) {
            final NearbyFeedSharedViewModel nearbyFeedSharedViewModelJo = Jo();
            viewOnAttachStateChangeListenerC20604515jvGo.addItemDecoration(new C0DXR(nearbyFeedSharedViewModelJo) { // from class: X.0dXf
                public final NearbyFeedSharedViewModel LL;

                {
                    this.LL = nearbyFeedSharedViewModelJo;
                }

                /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
                
                    throw new X.C1954807lC();
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C0DXR
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZLLL(android.graphics.Canvas r16, androidx.recyclerview.widget.RecyclerView r17, X.C21673919s1 r18) {
                    /*
                        Method dump skipped, instruction units count: 243
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1054290dXf.LIZLLL(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, X.19s1):void");
                }

                public static void LJ(String str, Canvas canvas, TextPaint textPaint, TextPaint textPaint2, View view2, float f) {
                    float fMeasureText = textPaint.measureText(str);
                    Rect rect = new Rect();
                    textPaint.getTextBounds(str, 0, str.length(), rect);
                    float left = view2.getLeft() + 20.0f;
                    float top = view2.getTop() + f;
                    float fHeight = rect.height() + top;
                    canvas.drawRect(left, top, fMeasureText + left + 40.0f, fHeight + 20.0f, textPaint2);
                    canvas.drawText(str, left + 20.0f, fHeight + 10.0f, textPaint);
                }
            });
        }
        viewOnAttachStateChangeListenerC20604515jvGo.setLifecycleOwner(this);
        viewOnAttachStateChangeListenerC20604515jvGo.addOnScrollListener(new AsS45S0100000_18(this, 11));
        boolean zBooleanValue = ((Boolean) C0B91.LIZ.getValue()).booleanValue();
        if (this.LLJJI) {
            ComplianceServiceProvider.LJI().LJJIII().observe(this, new AObserverS222S0100000_18(this, 28));
        }
        Jo().LLIZLLLIL = new C1204450hRr(this, null);
        Jo().LLJ = new C1204440hRq(this, null);
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0hRh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1204130hRL) obj).LL;
            }
        }, null, new AwS156S0110000_18(this, zBooleanValue, 1), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0hSm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1204510hRx) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 259), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0hSn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1204510hRx) obj).LLILZ;
            }
        }, null, new AwS632S0100000_18(this, 260), 6);
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0hRj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1204130hRL) obj).LLILZIL;
            }
        }, null, new AwS632S0100000_18(this, 257), 6);
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0hRk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1204130hRL) obj).LLILZLL;
            }
        }, null, new AwS632S0100000_18(this, 258), 6);
        EventBus.LIZLLL().LJIJJ(this);
        NearbyLifecycleManager nearbyLifecycleManager = NearbyLifecycleManager.LL;
        NearbyLifecycleManager.LIZ(this, new InterfaceC1204310hRd() { // from class: X.0hRs
            @Override // X.InterfaceC1204310hRd
            public final void onCreate() {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onDestroy() {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onStart() {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onStop() {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onPause() {
                C20019113Un.LIZ.getClass();
                C20019113Un.LIZIZ();
            }

            @Override // X.InterfaceC1204310hRd
            public final void onResume() {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onNodeHide(Bundle bundle) {
                this.LIZ.Jo().FQ2();
                C20019113Un.LIZ.getClass();
                C20019113Un.LIZIZ();
            }

            @Override // X.InterfaceC1204310hRd
            public final void onNodeShow(Bundle bundle) {
                if (C1204850hSV.LIZ()) {
                    C1204570hS3 c1204570hS3 = C1204570hS3.LIZIZ;
                    long jLJII = c1204570hS3.LJII();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LocationChangeCard set() enterNearbyTimeLastTime = ");
                    sbLIZ.append(jLJII);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1204570hS3.LIZJ = jLJII;
                    c1204570hS3.LJIIIZ();
                }
            }
        });
        this.LLJJIJI = (C11JF) C1906580ziK.LIZJ().LIZ().LJJLJLI(new AfS187S0100000_18(this, 46));
        LLJJJIL = new AwS562S0100000_18(this, 2347);
        super.onViewCreated(view);
    }

    public static void Lo(C1203960hR4 c1203960hR4, List list) {
        InterfaceC1204490hRv interfaceC1204490hRv;
        C1204470hRt c1204470hRt;
        Long l;
        Object next;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next instanceof C1204470hRt) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            interfaceC1204490hRv = (InterfaceC1204490hRv) next;
        } else {
            interfaceC1204490hRv = null;
        }
        if ((interfaceC1204490hRv instanceof C1204470hRt) && (c1204470hRt = (C1204470hRt) interfaceC1204490hRv) != null && (l = c1204470hRt.LLIZ) != null) {
            c1203960hR4.LJIILL = l.longValue();
        }
    }
}
