package com.ss.android.ugc.aweme.minidrama.tab.v2.skylight;

import X.AbstractViewOnClickListenerC1165700gRM;
import X.C01GW;
import X.C098200Yq;
import X.C0DXR;
import X.C0QSJ;
import X.C1155730gBH;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1573020r2K;
import X.C1574470r4f;
import X.C1578050rAR;
import X.C1578060rAS;
import X.C189200o6;
import X.C19719612Di;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C687700QyG;
import X.C718540SGm;
import X.C723580SZw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1574490r4h;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1577950rAH;
import X.InterfaceC1578080rAU;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem;
import com.ss.android.ugc.aweme.minidrama.tab.v2.DramaTopTabMainFragmentScope;
import com.ss.android.ugc.aweme.minidrama.tab.v2.ability.IDramaSkylightAbility;
import com.ss.android.ugc.aweme.service.MiniDramaRouterService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaSkylightAssem extends UIContentAssem implements IDramaSkylightAbility, InterfaceC1578080rAU, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public Boolean LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public TuxIconView LLJJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIII;
    public boolean LLJJIJIIJIL;
    public volatile InterfaceC1577950rAH LLJJIJIL;
    public InterfaceC665370Q7z LLJJJ;
    public C0QSJ LLJJJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 766));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 767));
    public final C1559260qg8 LLJI = new C1559260qg8(new C723580SZw(this, C1155730gBH.class, "DramaSkylightHierarchyData"), checkSupervisorPrepared());
    public final List<C1578050rAR> LLJJIJI = new ArrayList();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DramaSkylightAssem.class, "hostAbility", "getHostAbility()Lcom/ss/android/ugc/aweme/minidrama/tab/v2/ability/IDramaTopTabHostAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{DramaTopTabMainFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DramaTopTabMainFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1609884636) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1577950rAH Go() {
        /*
            r4 = this;
            X.0rAH r0 = r4.LLJJIJIL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0rAH r0 = r4.LLJJIJIL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJJIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJJ     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJJ = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.minidrama.tab.v2.DramaTopTabMainFragmentScope> r1 = com.ss.android.ugc.aweme.minidrama.tab.v2.DramaTopTabMainFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJJIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0rAH> r0 = X.InterfaceC1577950rAH.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0rAH r0 = (X.InterfaceC1577950rAH) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJIJIL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.tab.v2.skylight.DramaSkylightAssem.Go():X.0rAH");
    }

    @Override // com.ss.android.ugc.aweme.minidrama.tab.v2.ability.IDramaSkylightAbility
    public final void gl1() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        TuxTextView tuxTextView;
        C20600815jK<InterfaceC1891350zJl> state;
        try {
            List<C1578050rAR> list = this.LLJJIJI;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                arrayList.add(C1578050rAR.LIZ((C1578050rAR) it2.next(), 0, Intrinsics.LJFF(this.LLJIJIL, Boolean.TRUE), 3));
            }
            if (arrayList.isEmpty() || !this.LLJJIJIIJIL) {
                return;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIII;
            if ((viewOnAttachStateChangeListenerC20604515jv2 == null || viewOnAttachStateChangeListenerC20604515jv2.getVisibility() != 0) && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJIII) != null) {
                C1573020r2K.LIZIZ(viewOnAttachStateChangeListenerC20604515jv, true);
            }
            TuxTextView tuxTextView2 = this.LLJILLL;
            if ((tuxTextView2 == null || tuxTextView2.getVisibility() != 0) && (tuxTextView = this.LLJILLL) != null) {
                C1573020r2K.LIZIZ(tuxTextView, true);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJIII;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null) {
                state.LJIILL(arrayList, new ARunnableS124S0100000_24(this, 63));
            }
            this.LLJJIJIIJIL = false;
            Map<EnumC1574490r4h, Map<String, Aweme>> map = C1574470r4f.LIZ;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                SkylightCommonItem skylightCommonItem = ((C1578050rAR) it3.next()).LL;
                if (skylightCommonItem != null) {
                    arrayList2.add(skylightCommonItem);
                }
            }
            C1574470r4f.LIZJ(new SkylightBlocks(Collections.singletonList(new SkylightBlockInfo(9, arrayList2, null, null, null))));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("refreshSkylight=");
            sbLIZ.append(C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, AFwS264S0000000_24.get$arr$(228), 31));
            C189200o6.m2constructorimpl(Integer.valueOf(Log.d("DramaNewTab", C2188811AlT.LIZIZ(sbLIZ))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        CopyOnWriteArrayList<InterfaceC1578080rAU> copyOnWriteArrayList = C1578060rAS.LIZ;
        C1578060rAS.LIZ.remove(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC1578080rAU
    public final void Ne(SkylightCommonItem skylightCommonItem) {
        boolean z;
        List<C1578050rAR> list = this.LLJJIJI;
        if ((list instanceof Collection) && ((ArrayList) list).isEmpty()) {
            z = false;
        } else {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((C1578050rAR) it2.next()).LL.collectionId, skylightCommonItem.collectionId)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z) {
            C19719612Di.LJJIIJ(this.LLJJIJI, new AwS603S0100000_24(skylightCommonItem, 153), true);
        } else if (((ArrayList) this.LLJJIJI).size() >= 5) {
            C19719612Di.LJJIJIIJI(this.LLJJIJI);
        }
        boolean zLJFF = Intrinsics.LJFF(this.LLJIJIL, Boolean.TRUE);
        List<C1578050rAR> list2 = this.LLJJIJI;
        ListProtector.add(list2, 0, new C1578050rAR(skylightCommonItem, ((ArrayList) list2).size() + 1, zLJFF));
        int size = ((ArrayList) this.LLJJIJI).size();
        int size2 = ((ArrayList) this.LLJJIJI).size();
        for (int i = 0; i < size2; i++) {
            List<C1578050rAR> list3 = this.LLJJIJI;
            ListProtector.set(list3, i, C1578050rAR.LIZ((C1578050rAR) ListProtector.get(list3, i), size, false, 5));
        }
        this.LLJJIJIIJIL = true;
    }

    @Override // com.ss.android.ugc.aweme.minidrama.tab.v2.ability.IDramaSkylightAbility
    public final void ar1(boolean z) {
        Context context;
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        if (Intrinsics.LJFF(this.LLJIJIL, Boolean.valueOf(z))) {
            return;
        }
        this.LLJIJIL = Boolean.valueOf(z);
        if (z) {
            context = (Context) this.LLIZLLLIL.getValue();
        } else {
            context = (Context) this.LLJ.getValue();
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            TuxTextView tuxTextView = this.LLJILLL;
            if (tuxTextView != null) {
                tuxTextView.setTextColor(iIntValue);
            }
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, context);
        if (numLIZJ2 != null) {
            int iIntValue2 = numLIZJ2.intValue();
            TuxTextView tuxTextView2 = this.LLJJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColor(iIntValue2);
            }
            TuxIconView tuxIconView = this.LLJJI;
            if (tuxIconView != null) {
                tuxIconView.setTintColor(iIntValue2);
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            List<InterfaceC1891350zJl> listLJII = state.LJII();
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLJII) {
                if (obj instanceof C1578050rAR) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C1578050rAR.LIZ((C1578050rAR) it2.next(), 0, z, 3));
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIII;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state2 = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                state2.LJIILL(arrayList2, null);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        super.onViewCreated(view);
        this.LLJILJIL = view.findViewById(R.id.g_4);
        this.LLJILJILJ = view.findViewById(R.id.g_3);
        this.LLJILLL = (TuxTextView) view.findViewById(R.id.g9v);
        this.LLJJ = (TuxTextView) view.findViewById(R.id.g9t);
        this.LLJJI = (TuxIconView) view.findViewById(R.id.g9s);
        this.LLJJIII = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.g9z);
        TuxTextView tuxTextView = this.LLJILLL;
        if (tuxTextView != null) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(2131839420);
            } else {
                string = null;
            }
            tuxTextView.setText(string);
        }
        TuxTextView tuxTextView2 = this.LLJILLL;
        if (tuxTextView2 != null) {
            C718540SGm.LIZ(tuxTextView2);
        }
        View viewFindViewById = view.findViewById(R.id.g9u);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1165700gRM() { // from class: X.0rAP
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1165700gRM
                public final void LIZ(View view2) {
                    boolean z;
                    String strD9;
                    boolean z2;
                    if (view2 != null) {
                        Uri.Builder builderAppendQueryParameter = UriProtector.parse("aweme://paidcontent/drama/mylist").buildUpon().appendQueryParameter("enter_from", "homepage_series");
                        InterfaceC1577950rAH interfaceC1577950rAHGo = this.LLILZ.Go();
                        if (interfaceC1577950rAHGo != null && interfaceC1577950rAHGo.xf()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String string2 = builderAppendQueryParameter.appendQueryParameter("is_from_innerfeed_discover", String.valueOf(z)).toString();
                        MiniDramaRouterService.LIZ.getClass();
                        MiniDramaRouterService miniDramaRouterServiceLIZ = C1573900r3k.LIZ();
                        if (miniDramaRouterServiceLIZ != null) {
                            miniDramaRouterServiceLIZ.LIZIZ(string2, C2097608Jq.LJ());
                        }
                        C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
                        InterfaceC1577950rAH interfaceC1577950rAHGo2 = this.LLILZ.Go();
                        if (interfaceC1577950rAHGo2 != null) {
                            strD9 = interfaceC1577950rAHGo2.d9();
                        } else {
                            strD9 = null;
                        }
                        String str = C1577260r9A.LIZ;
                        InterfaceC1577950rAH interfaceC1577950rAHGo3 = this.LLILZ.Go();
                        if (interfaceC1577950rAHGo3 != null && interfaceC1577950rAHGo3.xf()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C1611660s2e.LJJJJ(null, "button", strD9, "history_default", str, z2);
                    }
                }
            }, viewFindViewById);
        }
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIII;
        boolean zLJFF = false;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new WrapLinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 0));
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(DramaSkylightHistoryCell.class);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR() { // from class: X.0rAQ
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int itemCount;
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                    AbstractC21673619ry adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        itemCount = adapter.getItemCount();
                    } else {
                        itemCount = 0;
                    }
                    if (childAdapterPosition != itemCount - 1) {
                        rect.right = iLIZIZ;
                    }
                }
            });
        }
        C1155730gBH c1155730gBH = (C1155730gBH) this.LLJI.getValue();
        if (c1155730gBH != null) {
            zLJFF = Intrinsics.LJFF(c1155730gBH.LL, Boolean.TRUE);
        }
        ar1(zLJFF);
        C1578060rAS.LIZ.add(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Ho(com.ss.android.ugc.aweme.minidrama.tab.v2.skylight.DramaSkylightAssem r8, com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks r9) {
        /*
            r6 = 1
            r7 = 0
            r2 = 0
            if (r9 == 0) goto L2e
            java.util.List<com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo> r0 = r9.blocks
            if (r0 == 0) goto L2e
            java.util.Iterator r4 = r0.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo r0 = (com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo) r0
            java.lang.Integer r0 = r0.cardStyle
            if (r0 == 0) goto Ld
            int r1 = r0.intValue()
            r0 = 9
            if (r1 != r0) goto Ld
        L26:
            com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo r3 = (com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo) r3
            if (r3 == 0) goto L2e
            java.util.List<com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem> r5 = r3.historyList
            if (r5 != 0) goto L30
        L2e:
            X.13BV r5 = X.C13BV.INSTANCE
        L30:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L56
            com.bytedance.tux.input.TuxTextView r0 = r8.LLJILLL
            if (r0 == 0) goto L3d
            X.C718540SGm.LIZ(r0)
        L3d:
            X.15jv r0 = r8.LLJJIII
            if (r0 == 0) goto L44
            X.C718540SGm.LIZ(r0)
        L44:
            X.15jv r0 = r8.LLJJIII
            if (r0 == 0) goto L53
            X.15jK r1 = r0.getState()
            if (r1 == 0) goto L53
            X.13BV r0 = X.C13BV.INSTANCE
            r1.LJIILL(r0, r2)
        L53:
            return
        L54:
            r3 = r2
            goto L26
        L56:
            java.lang.Boolean r0 = r8.LLJIJIL
            if (r0 == 0) goto L5e
            boolean r7 = r0.booleanValue()
        L5e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r5, r0)
            r4.<init>(r0)
            java.util.Iterator r3 = r5.iterator()
        L6d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem r2 = (com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem) r2
            X.0rAR r1 = new X.0rAR
            int r0 = r5.size()
            r1.<init>(r2, r0, r7)
            r4.add(r1)
            goto L6d
        L86:
            android.view.View r0 = r8.LLJILJIL
            if (r0 == 0) goto L8d
            X.C1573020r2K.LIZIZ(r0, r6)
        L8d:
            com.bytedance.tux.input.TuxTextView r0 = r8.LLJILLL
            if (r0 == 0) goto L94
            X.C1573020r2K.LIZIZ(r0, r6)
        L94:
            java.util.List<X.0rAR> r0 = r8.LLJJIJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.List<X.0rAR> r0 = r8.LLJJIJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r4)
            X.15jv r0 = r8.LLJJIII
            if (r0 == 0) goto Lb6
            X.15jK r2 = r0.getState()
            if (r2 == 0) goto Lb6
            Y.ARunnableS124S0100000_24 r1 = new Y.ARunnableS124S0100000_24
            r0 = 62
            r1.<init>(r8, r0)
            r2.LJIILL(r4, r1)
        Lb6:
            java.util.Map<X.0r4h, java.util.Map<java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme>> r0 = X.C1574470r4f.LIZ
            X.C1574470r4f.LIZJ(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.tab.v2.skylight.DramaSkylightAssem.Ho(com.ss.android.ugc.aweme.minidrama.tab.v2.skylight.DramaSkylightAssem, com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks):void");
    }

    @Override // com.ss.android.ugc.aweme.minidrama.tab.v2.ability.IDramaSkylightAbility
    public final void MT(SkylightBlocks skylightBlocks, boolean z) {
        InterfaceC1577950rAH interfaceC1577950rAHGo;
        Ho(this, skylightBlocks);
        if (z && (interfaceC1577950rAHGo = Go()) != null) {
            interfaceC1577950rAHGo.T6(new AwS603S0100000_24(this, 154));
        }
    }
}
