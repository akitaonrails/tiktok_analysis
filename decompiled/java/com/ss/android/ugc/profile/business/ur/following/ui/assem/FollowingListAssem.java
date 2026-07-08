package com.ss.android.ugc.profile.business.ur.following.ui.assem;

import X.AbstractC1263550izB;
import X.AbstractC1906720ziY;
import X.AbstractC329610Cw3;
import X.C013C;
import X.C019F;
import X.C01GW;
import X.C08SN;
import X.C08SO;
import X.C09R3;
import X.C0P6P;
import X.C1075830e6P;
import X.C1261940iwa;
import X.C1262970iyF;
import X.C1263590izF;
import X.C1264200j0E;
import X.C1264760j18;
import X.C1264900j1M;
import X.C1265230j1t;
import X.C1265390j29;
import X.C1265420j2C;
import X.C1265550j2P;
import X.C12ES;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1749280vcc;
import X.C1910890zpH;
import X.C19719912Dl;
import X.C19EG;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C296100Bj6;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC1261960iwc;
import X.InterfaceC1073860e3E;
import X.InterfaceC1265570j2R;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.following.ui.viewholder.assem.FollowItemFooterCell;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowRelationInfoViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowingListViewModel;
import com.ss.android.ugc.ur.experiment.ManageBatchUnfollowAbilityExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS127S0101000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowingListAssem extends UIListContentAssem<FollowingListViewModel> implements InterfaceC1265570j2R, IFollowingListAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public boolean LLJ;
    public boolean LLJI;
    public C1264200j0E LLJILJILJ;
    public C1075830e6P LLJILLL;
    public final AssemVMLazy LLJJ;
    public final AssemVMLazy LLJJI;
    public C1265550j2P LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C1559260qg8 LLJJJIL;
    public boolean LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(443));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2325));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(442));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FollowingListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/following/ui/viewmodel/FollowingListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FollowingListAssem.class, "followRelationInfoViewModel", "getFollowRelationInfoViewModel()Lcom/ss/android/ugc/profile/business/ur/following/ui/viewmodel/FollowRelationInfoViewModel;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FollowingListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FollowingListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 2326), AFwS257S0000000_19.get$arr$(430), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FollowRelationInfoViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 2327), AFwS257S0000000_19.get$arr$(431), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2328));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2321));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2324));
        this.LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2323));
        this.LLJJJIL = new C1559260qg8(new C723590SZx(this, C1264760j18.class, null), checkSupervisorPrepared());
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2322));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = FollowItemFooterCell.class;
        return c20603715jn;
    }

    @Override // X.InterfaceC1265570j2R
    public final C1265390j29 LJIIZILJ() {
        return new C1265390j29(Go(), new C0P6P() { // from class: X.0j21
            @Override // X.C0P6P
            public final void LJJIFFI() {
                this.LL.Jo().manualListRetry(EnumC323450Cm7.Next);
            }
        });
    }

    public final C1265230j1t Oo() {
        return (C1265230j1t) this.LLJILJIL.getValue();
    }

    public final C1264760j18 Zo() {
        return (C1264760j18) this.LLJJJIL.getValue();
    }

    public final C1910890zpH ap() {
        return (C1910890zpH) this.LLIZLLLIL.getValue();
    }

    public final C1749280vcc bp() {
        return (C1749280vcc) this.LLJJIJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: cp, reason: merged with bridge method [inline-methods] */
    public final FollowingListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (FollowingListViewModel) assemVMLazy.getValue();
    }

    public final boolean ep() {
        C013C c013c = new C013C();
        withState(Jo(), new AwS385S0200000_19(c013c, this, 61));
        return c013c.element;
    }

    public final boolean kp() {
        if ((((Number) C296100Bj6.LIZ.getValue()).intValue() & 4) == 0 || !hp()) {
            return false;
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return Intrinsics.LJFF(((C1264900j1M) assemVMLazy.getValue().getState()).LLILLJJLI, "following_relation");
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) LJJIJL().findViewById(R.id.twh);
    }

    public final Function0<Boolean> No() {
        return kp() ? AFwS207S0000000_19.get$arr$(441) : Zo().LLILZ;
    }

    public final Function0<String> So() {
        return Zo().LLILZIL;
    }

    public final Function0<String> Vo() {
        return Zo().LLILZLL;
    }

    public final void dp() {
        AbstractC1263550izB abstractC1263550izBLIZ;
        AbstractC329610Cw3<?> abstractC329610Cw3LJIIJJI;
        if (!No().invoke().booleanValue()) {
            new AwS563S0100000_19(this, 11).invoke();
            return;
        }
        if (this.LLJI) {
            C1075830e6P c1075830e6P = this.LLJILLL;
            if (c1075830e6P == null || (abstractC1263550izBLIZ = c1075830e6P.LIZ()) == null || (abstractC329610Cw3LJIIJJI = abstractC1263550izBLIZ.LJIIJJI()) == null) {
                return;
            }
            C1910890zpH c1910890zpHAp = ap();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set maf chunk loading: config: ");
            sbLIZ.append(abstractC329610Cw3LJIIJJI);
            c1910890zpHAp.LIZ("following_assem", C2188811AlT.LIZIZ(sbLIZ));
            Go().LL.LLLIL(abstractC329610Cw3LJIIJJI, abstractC1263550izBLIZ, abstractC1263550izBLIZ.LLILZLL);
            ((C1262970iyF) abstractC1263550izBLIZ).LLFZ(false);
            return;
        }
        this.LLJI = true;
        InterfaceC1073860e3E interfaceC1073860e3E = Zo().LLIZ;
        if (interfaceC1073860e3E != null) {
            Go().LIZJ(interfaceC1073860e3E.i62());
        }
        C1075830e6P c1075830e6P2 = this.LLJILLL;
        int size = Go().getAllChunks().size();
        if (c1075830e6P2 != null) {
            AbstractC1263550izB abstractC1263550izBLIZ2 = c1075830e6P2.LIZ();
            C1910890zpH c1910890zpHAp2 = ap();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("add maf list chunk, config ");
            sbLIZ2.append(abstractC1263550izBLIZ2.LJIIJJI());
            c1910890zpHAp2.LIZ("following_assem", C2188811AlT.LIZIZ(sbLIZ2));
            if (C1263590izF.LIZIZ()) {
                EnumC1261960iwc enumC1261960iwc = EnumC1261960iwc.FOLLOWING_LIST;
                C1261940iwa.LIZ.getClass();
                if (!C1261940iwa.LIZJ(enumC1261960iwc)) {
                    C1261940iwa.LJ(enumC1261960iwc);
                }
            }
            Go().LIZJ(abstractC1263550izBLIZ2);
            Go().setItemAnimator(((C1262970iyF) abstractC1263550izBLIZ2).getItemAnimator());
            c1075830e6P2.LIZIZ(new AwS127S0101000_19(this, size, 0));
        }
    }

    public final boolean hp() {
        return Zo().LLILLL;
    }

    public final void ip() {
        if (Zo().LLJ || this.LLJJJJ) {
            return;
        }
        C1910890zpH c1910890zpHAp = ap();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[FDUP] loadAndRefresh: config=");
        sbLIZ.append(Jo().getConfig());
        sbLIZ.append(", chunkItemsBefore=");
        sbLIZ.append(Oo().getItems().size());
        sbLIZ.append(", thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(", stack=");
        sbLIZ.append(C13LP.LJJLIIIJ(C13LQ.LJJLIIIJJIZ(6, new Throwable().getStackTrace()), " <- ", null, null, 0, null, AFwS257S0000000_19.get$arr$(429), 30));
        c1910890zpHAp.LJII("following_assem", C2188811AlT.LIZIZ(sbLIZ));
        Lo("before loadAndRefresh list.load");
        Go().LJIILIIL(Jo().getConfig(), Oo());
        Lo("after loadAndRefresh list.load");
        C1075830e6P c1075830e6P = this.LLJILLL;
        if (c1075830e6P != null && c1075830e6P.LLILZIL) {
            c1075830e6P.LLILZIL = false;
            c1075830e6P.LIZIZ(null);
        }
        Jo().refresh();
    }

    public final void lp() {
        if (!(!Oo().getItems().isEmpty())) {
            C12ES.LJIILL(8, this.LLJJIII);
            return;
        }
        if (Oo().LJIIJ().LIZJ() == 0) {
            Oo().LJII(this.LLJJIII);
        }
        C12ES.LJIILL(0, this.LLJJIII);
        if (((Boolean) ManageBatchUnfollowAbilityExp.LIZJ.getValue()).booleanValue()) {
            C1265550j2P c1265550j2P = this.LLJJIII;
            if (c1265550j2P != null) {
                c1265550j2P.setStyle("left");
                return;
            }
            return;
        }
        for (AbstractC1906720ziY abstractC1906720ziY : Go().getAllChunks()) {
            if (!abstractC1906720ziY.getItems().isEmpty()) {
                if (abstractC1906720ziY instanceof C1265230j1t) {
                    C1265550j2P c1265550j2P2 = this.LLJJIII;
                    if (c1265550j2P2 != null) {
                        c1265550j2P2.setStyle("left");
                        return;
                    }
                    return;
                }
                C1265550j2P c1265550j2P3 = this.LLJJIII;
                if (c1265550j2P3 != null) {
                    c1265550j2P3.setStyle("right");
                    return;
                }
                return;
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), this, IFollowingListAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), IFollowingListAbility.class, null);
        }
    }

    public final void Lo(String str) {
        C1265420j2C c1265420j2C;
        User user;
        String uid;
        C1265420j2C c1265420j2C2;
        User user2;
        String uid2;
        List<AbstractC1906720ziY> allChunks = Go().getAllChunks();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(allChunks, 10));
        int i = 0;
        for (AbstractC1906720ziY abstractC1906720ziY : allChunks) {
            int i2 = i + 1;
            if (i >= 0) {
                AbstractC1906720ziY abstractC1906720ziY2 = abstractC1906720ziY;
                final List<InterfaceC1891350zJl> items = abstractC1906720ziY2.getItems();
                final ArrayList arrayList2 = new ArrayList();
                for (InterfaceC1891350zJl interfaceC1891350zJl : items) {
                    if ((interfaceC1891350zJl instanceof C1265420j2C) && (c1265420j2C2 = (C1265420j2C) interfaceC1891350zJl) != null && (user2 = c1265420j2C2.LLILLJJLI) != null && (uid2 = user2.getUid()) != null) {
                        arrayList2.add(uid2);
                    }
                }
                Map mapLIZ = C08SO.LIZ(new C08SN<String, String>() { // from class: X.0j20
                    @Override // X.C08SN
                    public final Iterator<String> LIZ() {
                        return arrayList2.iterator();
                    }

                    @Override // X.C08SN
                    public final String LIZIZ(String str2) {
                        return str2;
                    }
                });
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapLIZ.entrySet()) {
                    if (((Number) entry.getValue()).intValue() > 1) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set setKeySet = linkedHashMap.keySet();
                Map mapLIZ2 = C08SO.LIZ(new C08SN<InterfaceC1891350zJl, String>() { // from class: X.0j1y
                    @Override // X.C08SN
                    public final Iterator<InterfaceC1891350zJl> LIZ() {
                        return items.iterator();
                    }

                    @Override // X.C08SN
                    public final String LIZIZ(InterfaceC1891350zJl interfaceC1891350zJl2) {
                        return interfaceC1891350zJl2.getClass().getSimpleName();
                    }
                });
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i);
                sbLIZ.append(':');
                sbLIZ.append(abstractC1906720ziY2.getClass().getSimpleName());
                sbLIZ.append("(count=");
                sbLIZ.append(items.size());
                sbLIZ.append(", users=");
                sbLIZ.append(arrayList2.size());
                sbLIZ.append(", dup=");
                sbLIZ.append(C13LP.LL(setKeySet, 5));
                sbLIZ.append(", types=");
                sbLIZ.append(mapLIZ2);
                sbLIZ.append(')');
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        List<InterfaceC1891350zJl> listItems = Go().getListItems();
        final ArrayList arrayList3 = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl2 : listItems) {
            if ((interfaceC1891350zJl2 instanceof C1265420j2C) && (c1265420j2C = (C1265420j2C) interfaceC1891350zJl2) != null && (user = c1265420j2C.LLILLJJLI) != null && (uid = user.getUid()) != null) {
                arrayList3.add(uid);
            }
        }
        Map mapLIZ3 = C08SO.LIZ(new C08SN<String, String>() { // from class: X.0j1z
            @Override // X.C08SN
            public final Iterator<String> LIZ() {
                return arrayList3.iterator();
            }

            @Override // X.C08SN
            public final String LIZIZ(String str2) {
                return str2;
            }
        });
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : mapLIZ3.entrySet()) {
            if (((Number) entry2.getValue()).intValue() > 1) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        Set setKeySet2 = linkedHashMap2.keySet();
        C1910890zpH c1910890zpHAp = ap();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[FDUP] chunkSnapshot[");
        sbLIZ2.append(str);
        sbLIZ2.append("]: allChunks=");
        sbLIZ2.append(Go().getAllChunks().size());
        sbLIZ2.append(", listItems=");
        sbLIZ2.append(Go().getListItems().size());
        sbLIZ2.append(", relationUsers=");
        sbLIZ2.append(arrayList3.size());
        sbLIZ2.append(", globalDupUids=");
        sbLIZ2.append(C13LP.LL(setKeySet2, 10));
        sbLIZ2.append(", chunks=");
        sbLIZ2.append(C13LP.LJJLIIIJ(arrayList, " || ", null, null, 0, null, null, 62));
        c1910890zpHAp.LJII("following_assem", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.profile.business.ur.following.ui.assem.IFollowingListAbility
    public final void ZK0(List<String> list) {
        C1265420j2C c1265420j2C;
        int i = 0;
        for (InterfaceC1891350zJl interfaceC1891350zJl : Oo().LLILZLL.LJII()) {
            int i2 = i + 1;
            if (i >= 0) {
                InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
                if ((interfaceC1891350zJl2 instanceof C1265420j2C) && (c1265420j2C = (C1265420j2C) interfaceC1891350zJl2) != null && list.contains(c1265420j2C.LLILLJJLI.getUid())) {
                    c1265420j2C.LLILLJJLI.setFollowStatus(0);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x03a7  */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r23) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.following.ui.assem.FollowingListAssem.onViewCreated(android.view.View):void");
    }
}
