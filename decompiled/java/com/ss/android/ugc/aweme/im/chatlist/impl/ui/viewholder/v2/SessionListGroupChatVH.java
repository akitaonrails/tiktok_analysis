package com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2;

import X.AbstractC19486711Lt;
import X.C01GW;
import X.C054G;
import X.C09A1;
import X.C0HZQ;
import X.C0I0B;
import X.C0PEM;
import X.C0Z37;
import X.C0Z72;
import X.C0Z7I;
import X.C0Z86;
import X.C0Z8A;
import X.C0Z8E;
import X.C0Z8M;
import X.C0Z93;
import X.C0ZE7;
import X.C0ZE8;
import X.C0ZK1;
import X.C0ZKF;
import X.C11RO;
import X.C11S5;
import X.C123100dR;
import X.C1322110kVd;
import X.C1360520lVa;
import X.C13LP;
import X.C1460405ne;
import X.C1492305sn;
import X.C1609500rzA;
import X.C1697810uHb;
import X.C1906570ziJ;
import X.C1906880zio;
import X.C19727912Gn;
import X.C1AF0;
import X.C2296808zG;
import X.C2296908zH;
import X.C337180DJs;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C429290GsR;
import X.C452501pT;
import X.C461720I8s;
import X.C618720OOo;
import X.C786410Ut5;
import X.C814420VxA;
import X.C878950Ydx;
import X.C885310YoD;
import X.C888340Yt6;
import X.C888490YtL;
import X.C888950Yu5;
import X.C890610Ywl;
import X.C893380Z2y;
import X.C894700Z8a;
import X.C895200Z9y;
import X.C897370ZIh;
import X.EnumC880480YgQ;
import X.EnumC887810YsF;
import X.InterfaceC1493505sz;
import X.InterfaceC1508640pMU;
import X.InterfaceC1891350zJl;
import X.InterfaceC879010Ye3;
import X.InterfaceC888500YtM;
import X.InterfaceC894770Z8h;
import X.InterfaceC897380ZIi;
import Y.ACallableS410S0100000_2;
import Y.ARunnableS20S0201000_14;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.im.core.api.experiment.GroupFakeWriteExperimentData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public class SessionListGroupChatVH extends SessionListIMBaseVH<C0Z8M, C888340Yt6> implements C0Z37<C0Z7I>, InterfaceC1508640pMU {
    public C1609500rzA LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;
    public final AwS593S0100000_14 LLLLIILLL;
    public final AwS593S0100000_14 LLLLIL;

    @Override // X.InterfaceC1508640pMU
    public String T() {
        return "SessionListGroupChatVH";
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public String b6() {
        return "group_chat_vh";
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void u7() {
        try {
            Iterator it2 = C1697810uHb.LJIIJJI(Integer.valueOf(R.id.y1z), Integer.valueOf(R.id.evm), Integer.valueOf(R.id.gy3)).iterator();
            while (it2.hasNext()) {
                View viewFindViewById = this.itemView.findViewById(((Number) it2.next()).intValue());
                if (viewFindViewById != null) {
                    C895200Z9y.LIZ(viewFindViewById);
                }
            }
            Iterator it3 = C1697810uHb.LJIIJJI(Integer.valueOf(R.id.g0r), Integer.valueOf(R.id.g0q), Integer.valueOf(R.id.wa6), Integer.valueOf(R.id.m82)).iterator();
            while (it3.hasNext()) {
                View viewFindViewById2 = this.itemView.findViewById(((Number) it3.next()).intValue());
                if (viewFindViewById2 != null) {
                    C895200Z9y.LIZ(viewFindViewById2);
                }
            }
            Iterator it4 = C1697810uHb.LJIIJJI(Integer.valueOf(R.id.user_name), Integer.valueOf(R.id.m69), Integer.valueOf(R.id.m6e)).iterator();
            while (it4.hasNext()) {
                View viewFindViewById3 = this.itemView.findViewById(((Number) it4.next()).intValue());
                if (viewFindViewById3 != null) {
                    C895200Z9y.LIZ(viewFindViewById3);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "GroupChatVH: Deep text optimization failed");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final boolean w6() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, X.C0Z9B
    public final List<View> LLLLJI() {
        return (List) this.LLLLII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, X.C0Z9B
    public final List<View> M() {
        return (List) this.LLLLIIIILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final View T6() {
        return (View) this.LLLJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z9B
    public final C0HZQ b() {
        return (C0HZQ) this.LLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final C0Z8E b7() {
        return (C0Z8E) this.LLLJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final void h7() {
        C337180DJs.LIZ((View) this.LLLJ.getValue());
        super.h7();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z32
    public void onAttach() {
        super.onAttach();
        C0Z8M c0z8m = (C0Z8M) this.LLJJIJIIJIL;
        if (c0z8m == null) {
            return;
        }
        C888490YtL c888490YtL = C888490YtL.LIZ;
        int i = this.LLILZIL;
        boolean zI7 = i7();
        C11RO c11roLIZ = C11S5.LIZ();
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c888490YtL.getClass();
        C878950Ydx pageKey = c0z8m.getPageKey();
        if (pageKey == null) {
            pageKey = new C878950Ydx(null, FilterTabType.OVERALL, Collections.singleton(EnumC880480YgQ.ALL), SystemClock.elapsedRealtime(), 19);
        }
        Map<EnumC887810YsF, Map<InterfaceC879010Ye3, Set<String>>> map = C888490YtL.LIZIZ;
        EnumC887810YsF enumC887810YsF = EnumC887810YsF.CHAT_SHOW;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object linkedHashMap2 = linkedHashMap.get(enumC887810YsF);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(enumC887810YsF, linkedHashMap2);
        }
        Map map2 = (Map) linkedHashMap2;
        Object linkedHashSet = map2.get(pageKey);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            map2.put(pageKey, linkedHashSet);
        }
        Set set = (Set) linkedHashSet;
        EnumC887810YsF enumC887810YsF2 = EnumC887810YsF.TTSOCIAL_CHAT_CELL_SHOW;
        Object linkedHashMap3 = linkedHashMap.get(enumC887810YsF2);
        if (linkedHashMap3 == null) {
            linkedHashMap3 = new LinkedHashMap();
            linkedHashMap.put(enumC887810YsF2, linkedHashMap3);
        }
        Map map3 = (Map) linkedHashMap3;
        Object linkedHashSet2 = map3.get(pageKey);
        if (linkedHashSet2 == null) {
            linkedHashSet2 = new LinkedHashSet();
            map3.put(pageKey, linkedHashSet2);
        }
        ArrayList arrayList = new ArrayList();
        if (((Set) linkedHashSet2).add(c0z8m.getSessionId())) {
            arrayList.add(new ARunnableS20S0201000_14(c0z8m, i, interfaceC1493505szLIZIZ, 4));
        }
        if (set.add(c0z8m.getSessionId())) {
            arrayList.add(new ARunnableS20S0201000_14(c0z8m, i, interfaceC1493505szLIZIZ, 2));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (zI7) {
            EnumC887810YsF enumC887810YsF3 = EnumC887810YsF.CAMERA_ICON_SHOW;
            Object linkedHashMap4 = linkedHashMap.get(enumC887810YsF3);
            if (linkedHashMap4 == null) {
                linkedHashMap4 = new LinkedHashMap();
                linkedHashMap.put(enumC887810YsF3, linkedHashMap4);
            }
            Map map4 = (Map) linkedHashMap4;
            Object linkedHashSet3 = map4.get(pageKey);
            if (linkedHashSet3 == null) {
                linkedHashSet3 = new LinkedHashSet();
                map4.put(pageKey, linkedHashSet3);
            }
            if (((Set) linkedHashSet3).add(c0z8m.getSessionId())) {
                arrayList.add(new ARunnableS20S0201000_14(c0z8m, i, interfaceC1493505szLIZIZ, 1));
            }
        }
        if (!arrayList.isEmpty()) {
            AbstractC19486711Lt.LJIIL(new ACallableS410S0100000_2(arrayList, 7)).LJIJJLI(c11roLIZ).LJIIZILJ();
        }
    }

    public final C0ZE7 s7() {
        return (C0ZE7) this.LLLLIILL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final Map<String, String> S5() {
        List<Long> readers;
        Map<String, String> mapS5 = super.S5();
        C0Z8M c0z8m = (C0Z8M) this.LLJJIJIIJIL;
        if (c0z8m != null && (readers = c0z8m.getReaders()) != null) {
            mapS5.put("readers", C13LP.LJJLIIIJ(readers, ",", null, null, 0, null, null, 62));
        }
        C885310YoD c885310YoD = C885310YoD.LIZ;
        C0Z8M c0z8m2 = (C0Z8M) this.LLJJIJIIJIL;
        Boolean boolValueOf = c0z8m2 != null ? Boolean.valueOf(c0z8m2.getShowStarIcon()) : null;
        c885310YoD.getClass();
        String strLJIILLIIL = C885310YoD.LJIILLIIL(boolValueOf, null, null);
        if (strLJIILLIIL.length() > 0) {
            mapS5.put("chat_label", strLJIILLIIL);
        }
        return mapS5;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z32
    public void onDetach() {
        super.onDetach();
        IDMAvatarLoader iDMAvatarLoaderC6 = C6();
        if (iDMAvatarLoaderC6 != null) {
            iDMAvatarLoaderC6.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final Function1<C0Z8M, Unit> U5() {
        return this.LLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final Function1<C0Z8M, Unit> V5() {
        return this.LLLLIILLL;
    }

    public SessionListGroupChatVH(View view) {
        super(view);
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 430));
        this.LLLIZZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 436));
        this.LLLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 431));
        this.LLLJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 437));
        this.LLLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 438));
        this.LLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 435));
        this.LLLLII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 433));
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 434));
        this.LLLLIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 432));
        this.LLLLIILL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 429));
        this.LLLLIILLL = new AwS593S0100000_14(this, 50);
        this.LLLLIL = new AwS593S0100000_14(this, 49);
        t7(view);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z34
    public final void LLLLJ(C1906880zio c1906880zio) {
        super.LLLLJ(c1906880zio);
        int i = c1906880zio.LIZ;
        if (i != -1) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            View view = this.itemView;
            View viewFindViewById = this.LLLILZJ;
            if (viewFindViewById == null) {
                viewFindViewById = view.findViewById(R.id.i8h);
                this.LLLILZJ = (C1609500rzA) viewFindViewById;
            }
            View view2 = viewFindViewById;
            if (view2 != null) {
                C618720OOo.LIZIZ(view2, iLIZIZ, iLIZIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final void f6(C0Z86 c0z86) {
        int iLIZ;
        boolean z;
        C0Z8M c0z8m = (C0Z8M) c0z86;
        if (c0z8m.getActivityStatusViewData() != null) {
            C1492305sn.LIZ().LJIILLIIL(System.currentTimeMillis());
        }
        C0ZE7 c0ze7S7 = s7();
        c0ze7S7.LJIIIZ = c0z8m.getSessionId();
        c0ze7S7.LJII = Boolean.valueOf(C429290GsR.LIZ(c0z8m.getActivityStatusViewData()));
        C894700Z8a activityStatusTextWithType = c0z8m.getActivityStatusTextWithType();
        if (activityStatusTextWithType != null) {
            iLIZ = C888950Yu5.LIZ(activityStatusTextWithType);
        } else {
            iLIZ = C888950Yu5.LIZ(C894700Z8a.LJI);
        }
        c0ze7S7.LJIIJ = iLIZ;
        if (C123100dR.LIZ(c0z8m.getActivityText()) && c0z8m.isValid()) {
            z = true;
        } else {
            z = false;
        }
        c0ze7S7.LJIIJJI = Boolean.valueOf(z);
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIIJJI();
        C0ZE8.LJIIJ(s7());
        p7(c0z8m);
        C0ZE7 c0ze7S72 = s7();
        c0ze7S72.LJII = Boolean.valueOf(C429290GsR.LIZ(c0z8m.getActivityStatusViewData()));
        c0ze7S72.LJIIIZ = c0z8m.getSessionId();
        C0ZE7 c0ze7LIZ = c0ze7S72.LIZ();
        C897370ZIh.LIZ().LJIIJJI();
        C0ZE8.LJIIIZ(c0ze7LIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final void i6(C0Z72 c0z72) {
        CharSequence charSequence;
        C0Z8A c0z8a;
        CharSequence content;
        TuxTextView tuxTextViewX5 = X5();
        if (tuxTextViewX5 != null) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            CharSequence charSequence2 = "";
            if (c0z72 == null || (charSequence = c0z72.chatHint) == null) {
                charSequence = "";
            }
            c1360520lVa.LIZIZ(charSequence);
            if (c0z72 != null && (c0z8a = c0z72.contentType) != null && (content = c0z8a.getContent()) != null) {
                charSequence2 = content;
            }
            c1360520lVa.LIZIZ(charSequence2);
            tuxTextViewX5.setText(c1360520lVa.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final boolean k7(C0Z86 c0z86) {
        FilterTabType filterTabType;
        C0Z8M c0z8m = (C0Z8M) c0z86;
        if (!c0z8m.isMute() && c0z8m.getSessionUnreadViewState() != null) {
            C878950Ydx pageKey = c0z8m.getPageKey();
            if (pageKey != null) {
                filterTabType = pageKey.LLILLL;
            } else {
                filterTabType = null;
            }
            if (filterTabType != FilterTabType.SPAM) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void p7(C0Z8M c0z8m) {
        boolean z;
        if (c0z8m.getPriority() > 0) {
            C19727912Gn c19727912Gn = (C19727912Gn) this.LLLILZLLLI.getValue();
            if (c19727912Gn != null) {
                c19727912Gn.LIZ(R.attr.c7);
            }
        } else {
            C19727912Gn c19727912Gn2 = (C19727912Gn) this.LLLILZLLLI.getValue();
            if (c19727912Gn2 != null) {
                c19727912Gn2.LIZ(R.attr.bx);
            }
        }
        InterfaceC894770Z8h interfaceC894770Z8h = (InterfaceC894770Z8h) this.LLLLIIL.getValue();
        if (interfaceC894770Z8h != null) {
            if (C429290GsR.LIZ(c0z8m.getActivityStatusViewData()) && c0z8m.isValid()) {
                z = true;
            } else {
                z = false;
            }
            interfaceC894770Z8h.LIZIZ(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    /* JADX INFO: renamed from: r7, reason: merged with bridge method [inline-methods] */
    public void L5(C0Z8M c0z8m) {
        String uid;
        ArrayList arrayList;
        Object avatar = c0z8m.getAvatar();
        if (avatar != null && !(avatar instanceof String)) {
            super.L5(c0z8m);
            return;
        }
        final C427660Gpo c427660GpoC6 = c6();
        if (!(c427660GpoC6 instanceof C1322110kVd)) {
            c427660GpoC6 = null;
        }
        if (c0z8m.isTempConv() && ((GroupFakeWriteExperimentData) C893380Z2y.LIZIZ.getValue()).avatar && c427660GpoC6 != null) {
            User userLIZLLL = C461720I8s.LIZLLL();
            if (userLIZLLL == null || (uid = userLIZLLL.getUid()) == null) {
                uid = "";
            }
            List<String> memberIdList = c0z8m.getMemberIdList();
            if (memberIdList != null) {
                arrayList = new ArrayList(memberIdList);
            } else {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(uid)) {
                ListProtector.add(arrayList, 0, uid);
            }
            C1460405ne c1460405ne = C1460405ne.LIZ;
            Context context = this.itemView.getContext();
            String sessionId = c0z8m.getSessionId();
            C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
            c1460405ne.getClass();
            C1460405ne.LIZLLL(context, sessionId, c427660GpoC6, arrayList, c054gLIZ);
            return;
        }
        IDMAvatarLoader iDMAvatarLoaderC6 = C6();
        if (iDMAvatarLoaderC6 == null) {
            return;
        }
        iDMAvatarLoaderC6.LIZLLL(c0z8m.getSessionId(), (String) avatar, null, new C0ZKF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJJI.LIZ))), 0, 0, 0, 0, new C0ZK1() { // from class: X.0Z8c
            @Override // X.C0ZK1
            public final void LIZ() {
            }

            @Override // X.C0ZK1
            public final void LIZIZ() {
            }

            @Override // X.C0ZK1
            public final void LIZJ(int i, String str, boolean z) {
                String sessionId2;
                C1331070kk5 hierarchy;
                C0Z8M c0z8m2 = (C0Z8M) this.LIZ.LLJJIJIIJIL;
                if (c0z8m2 != null && (sessionId2 = c0z8m2.getSessionId()) != null) {
                    C1322110kVd c1322110kVd = c427660GpoC6;
                    if (Intrinsics.LJFF(C0YNP.LJFF(sessionId2, "is_created_by_fake_write"), "1") && c1322110kVd != null && (hierarchy = c1322110kVd.getHierarchy()) != null) {
                        hierarchy.LJIJ(null, 1);
                    }
                }
                ((C0ZK1) this.LIZ.LLJJJJJIL.getValue()).LIZJ(i, str, z);
            }
        }, 94));
    }

    public void t7(View view) {
        C786410Ut5.Sd(R.layout.cmw, C786410Ut5.ne(view.getContext()), (ViewGroup) this.itemView.findViewById(R.id.uud));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0141 A[PHI: r2
      0x0141: PHI (r2v5 X.0YtM) = (r2v4 X.0YtM), (r2v11 X.0YtM) binds: [B:56:0x012f, B:63:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u6(X.C0Z86 r18) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListGroupChatVH.u6(X.0Z86):void");
    }

    public SessionListGroupChatVH(ViewGroup viewGroup) {
        this(C1906570ziJ.LIZ(C786410Ut5.ne(viewGroup.getContext()), R.layout.cmv, viewGroup, false, 24));
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        I5((C890610Ywl) interfaceC1891350zJl, i);
        try {
            if (((Boolean) C0Z93.LJ.getValue()).booleanValue() && C0Z93.LIZJ()) {
                u7();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    /* JADX INFO: renamed from: d6 */
    public final void j7(InterfaceC888500YtM interfaceC888500YtM, int i) {
        int i2;
        C0Z8M c0z8m = (C0Z8M) interfaceC888500YtM;
        super.j7(c0z8m, i);
        View view = (View) this.LLLIZZ.getValue();
        if (view != null) {
            if (c0z8m.isPublicGroup()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final void j7(C0Z86 c0z86, int i) {
        int i2;
        C0Z8M c0z8m = (C0Z8M) c0z86;
        super.j7(c0z8m, i);
        View view = (View) this.LLLIZZ.getValue();
        if (view != null) {
            if (c0z8m.isPublicGroup()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
    }
}
