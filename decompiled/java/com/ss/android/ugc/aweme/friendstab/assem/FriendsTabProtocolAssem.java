package com.ss.android.ugc.aweme.friendstab.assem;

import X.AbstractC1583720rJa;
import X.C08TN;
import X.C098200Yq;
import X.C0BLH;
import X.C0CLE;
import X.C13LP;
import X.C14EU;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1583510rJF;
import X.C1584420rKi;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2252408s6;
import X.C2344809Gs;
import X.C278440Avi;
import X.C285090BFj;
import X.C724240Sb0;
import X.InterfaceC1583550rJJ;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.friendstab.ability.FriendBottomTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.ability.FriendsTabRouterAbility;
import com.ss.android.ugc.aweme.friendstab.ability.SocialBottomTabAbility;
import com.ss.android.ugc.aweme.friendstab.assem.FriendsTabProtocolAssem;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabRouterAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS268S0300000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsTabProtocolAssem extends BaseMainContainerAssem implements ISocial2TabProtocolAbility {
    public static final ArrayList<String> LLIZLLLIL = C1697810uHb.LJ("REPOST_FEED", "FRIENDS_FEED");
    public FutureTask<Pair<List<ISocialTabProtocol>, List<SocialTopTabNode>>> LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public C19EG LLILZLL;
    public final CopyOnWriteArrayList<SocialTopTabNode> LL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<ISocialTabProtocol> LLILLJJLI = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC1583550rJJ> LLIZ = new CopyOnWriteArrayList<>();

    public final synchronized void fo() {
        Pair<List<ISocialTabProtocol>, List<SocialTopTabNode>> pairHo;
        if (!this.LLILZIL || this.LLILZ) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    FutureTask<Pair<List<ISocialTabProtocol>, List<SocialTopTabNode>>> futureTask = this.LLILLL;
                    C189200o6.m2constructorimpl(futureTask != null ? Boolean.valueOf(futureTask.cancel(true)) : null);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                C19EG c19egLIZ = this.LLILZLL;
                if (c19egLIZ == null && (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                pairHo = ho(c19egLIZ);
            }
            if (!this.LLILZ) {
                FutureTask<Pair<List<ISocialTabProtocol>, List<SocialTopTabNode>>> futureTask2 = this.LLILLL;
                if (futureTask2 != null) {
                    pairHo = futureTask2.get(500L, TimeUnit.MILLISECONDS);
                }
                this.LLILZ = false;
                this.LLILZIL = true;
            }
            C19EG c19egLIZ2 = this.LLILZLL;
            if (c19egLIZ2 == null && (c19egLIZ2 = C724240Sb0.LIZ(this)) == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            pairHo = ho(c19egLIZ2);
            if (pairHo != null) {
                ko(pairHo.getFirst(), pairHo.getSecond());
            }
            this.LLILZ = false;
            this.LLILZIL = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final void rO0() {
        this.LLILZ = true;
        fo();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final boolean Ro() {
        fo();
        CopyOnWriteArrayList<ISocialTabProtocol> copyOnWriteArrayList = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
        Iterator<ISocialTabProtocol> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getTag());
        }
        return ((ArrayList) b9()).size() > 1;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final List<ISocialTabProtocol> b9() {
        fo();
        CopyOnWriteArrayList<ISocialTabProtocol> copyOnWriteArrayList = this.LLILLJJLI;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (ISocialTabProtocol iSocialTabProtocol : copyOnWriteArrayList) {
            if (hashSet.add(iSocialTabProtocol.getTag())) {
                arrayList.add(iSocialTabProtocol);
            }
        }
        if (arrayList.size() != this.LLILLJJLI.size()) {
            C20684815ws.LJIJI("friends_tab_node_add_error_monitor", new Pair("TabProtocol_getTopTabsProtocol", "event_from"), new Pair(String.valueOf(this.LLILLJJLI.size()), "node_size"), new Pair(String.valueOf(arrayList.size()), "distinct_node_size"));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final List<SocialTopTabNode> oK1() {
        fo();
        CopyOnWriteArrayList<SocialTopTabNode> copyOnWriteArrayList = this.LL;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (SocialTopTabNode socialTopTabNode : copyOnWriteArrayList) {
            if (hashSet.add(socialTopTabNode.tag())) {
                arrayList.add(socialTopTabNode);
            }
        }
        if (arrayList.size() != this.LL.size()) {
            C20684815ws.LJIJI("friends_tab_node_add_error_monitor", new Pair("TabProtocol_getTopTabs", "event_from"), new Pair(String.valueOf(this.LLILLJJLI.size()), "node_size"), new Pair(String.valueOf(arrayList.size()), "distinct_node_size"));
        }
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (C0BLH.LIZ()) {
            try {
                EventBus.LIZLLL().LJJI(this);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), FriendsTabRouterAbility.class, null);
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), SocialBottomTabAbility.class, null);
            IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJIIJJI = C1583510rJF.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null));
            if (iBottomFriendsTabAvatarAbilityLJIIJJI != null) {
                iBottomFriendsTabAvatarAbilityLJIIJJI.unRegister();
            }
            C0CLE.LIZ.getClass();
            if (C0CLE.LIZ()) {
                C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), FriendBottomTabAvatarAbility.class, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C08TN.LIZ().LJ("friend_tab_assem_onparentset", false);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C08TN.LIZ().LJ("friend_tab_assem_onparentset_inner_1", false);
            if (C0BLH.LIZ()) {
                EventBus.LIZLLL().LJIJJ(this);
            } else {
                C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), new FriendsTabRouterAbility(getContext()), IFriendsTabRouterAbility.class, null, null);
            }
            C08TN.LIZ().LJI("friend_tab_assem_onparentset_inner_1");
            C08TN.LIZ().LJ("friend_tab_assem_onparentset_inner_2", false);
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), new SocialBottomTabAbility(getContext()), IBottomTabLayoutAbility.class, null, null);
            C08TN.LIZ().LJI("friend_tab_assem_onparentset_inner_2");
            C0CLE.LIZ.getClass();
            if (C0CLE.LIZ()) {
                C08TN.LIZ().LJ("friend_tab_assem_onparentset_inner_3", false);
                if (((Number) C278440Avi.LIZ.getValue()).intValue() != 1 || C1583510rJF.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null)) == null) {
                    C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), new FriendBottomTabAvatarAbility("FRIENDS_TAB", new WeakReference(getContext())), IBottomFriendsTabAvatarAbility.class, null, null);
                }
                C08TN.LIZ().LJI("friend_tab_assem_onparentset_inner_3");
            }
        }
        C08TN.LIZ().LJI("friend_tab_assem_onparentset");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final List<ISocialTabProtocol> sV1() {
        fo();
        CopyOnWriteArrayList<ISocialTabProtocol> copyOnWriteArrayList = this.LLILLJJLI;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (ISocialTabProtocol iSocialTabProtocol : copyOnWriteArrayList) {
            if (hashSet.add(iSocialTabProtocol.getTag())) {
                arrayList.add(iSocialTabProtocol);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final boolean tF0() {
        if (((ArrayList) b9()).size() != 1) {
            return false;
        }
        ISocialTabProtocol iSocialTabProtocol = (ISocialTabProtocol) C13LP.LJJJLZIJ(0, b9());
        return Intrinsics.LJFF(iSocialTabProtocol != null ? iSocialTabProtocol.getTag() : null, "FRIENDS_FEED");
    }

    public static Pair ho(C19EG c19eg) {
        C2344809Gs.LJFF("landing_2860", "execute prepareTopTabs");
        List listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJI(c19eg, null), ISocialTabProtocol.class, false);
        if (listLIZIZ == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLIZIZ) {
            if (hashSet.add(((ISocialTabProtocol) obj).getTag())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((ISocialTabProtocol) obj2).enable()) {
                arrayList2.add(obj2);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareTopTabs ");
        sbLIZ.append(arrayList2);
        sbLIZ.append(' ');
        sbLIZ.append(arrayList2.size());
        C2344809Gs.LJFF("landing_2860", C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (ISocialTabProtocol iSocialTabProtocol : C13LP.LJLLLL(new Comparator() { // from class: X.0rJC
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                ArrayList<String> arrayList5 = FriendsTabProtocolAssem.LLIZLLLIL;
                return C20085613iQ.LIZIZ(Integer.valueOf(arrayList5.indexOf(((ISocialTabProtocol) t).getTag())), Integer.valueOf(arrayList5.indexOf(((ISocialTabProtocol) t2).getTag())));
            }
        }, arrayList2)) {
            arrayList3.add(iSocialTabProtocol);
            arrayList4.add(new SocialTopTabNode(c19eg, iSocialTabProtocol));
        }
        return new Pair(arrayList3, arrayList4);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final void Lt1(InterfaceC1583550rJJ interfaceC1583550rJJ) {
        this.LLIZ.remove(interfaceC1583550rJJ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final void kw2(InterfaceC1583550rJJ interfaceC1583550rJJ) {
        this.LLIZ.addIfAbsent(interfaceC1583550rJJ);
    }

    @C14EU
    public final void onRenderFirstFrame(C1584420rKi c1584420rKi) {
        C19EG c19egLIZ;
        if (C0BLH.LIZ() && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            EventBus.LIZLLL().LJJI(this);
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), new FriendsTabRouterAbility(getContext()), IFriendsTabRouterAbility.class, null, null);
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static boolean m207do(String str, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(((AbstractC1583720rJa) it2.next()).tag(), str)) {
                return true;
            }
        }
        return false;
    }

    public final void bo(final C19EG c19eg, Executor executor) {
        C08TN.LIZ().LJ("friend_tab_protocal_commit_preload_sub1", false);
        this.LLILZLL = c19eg;
        C08TN.LIZ().LJI("friend_tab_protocal_commit_preload_sub1");
        C08TN.LIZ().LJ("friend_tab_protocal_commit_preload_sub2", false);
        if (!((Boolean) C285090BFj.LJIJJLI.getValue()).booleanValue()) {
            C1558520qew.LJII(C1558360qeg.LJI(c19eg, null), this, ISocial2TabProtocolAbility.class, null, null);
        }
        C08TN.LIZ().LJI("friend_tab_protocal_commit_preload_sub2");
        C08TN.LIZ().LJ("friend_tab_protocal_commit_preload_sub3", false);
        this.LLILLL = new FutureTask<>(new Callable() { // from class: X.0rJD
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("FriendsTabProtocolAssem@243d.commitPreloadTask$1");
                C2344809Gs.LJFF("landing_2860", "schedule async task");
                FriendsTabProtocolAssem friendsTabProtocolAssem = this.LL;
                C19EG c19eg2 = c19eg;
                friendsTabProtocolAssem.getClass();
                Pair pairHo = FriendsTabProtocolAssem.ho(c19eg2);
                C1C7U.LIZIZ("FriendsTabProtocolAssem@243d.commitPreloadTask$1");
                return pairHo;
            }
        });
        C2344809Gs.LJFF("landing_2860", "commitPreloadTask");
        C08TN.LIZ().LJI("friend_tab_protocal_commit_preload_sub3");
        C08TN.LIZ().LJ("friend_tab_protocal_commit_preload_sub4", false);
        executor.execute(this.LLILLL);
        C08TN.LIZ().LJI("friend_tab_protocal_commit_preload_sub4");
    }

    public final synchronized void ko(List<? extends ISocialTabProtocol> list, List<SocialTopTabNode> list2) {
        ArrayList arrayList = new ArrayList(this.LL);
        CopyOnWriteArrayList<ISocialTabProtocol> copyOnWriteArrayList = this.LLILLJJLI;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(list);
        CopyOnWriteArrayList<SocialTopTabNode> copyOnWriteArrayList2 = this.LL;
        copyOnWriteArrayList2.clear();
        copyOnWriteArrayList2.addAll(list2);
        if (!arrayList.isEmpty()) {
            CopyOnWriteArrayList<SocialTopTabNode> copyOnWriteArrayList3 = this.LL;
            if (arrayList.size() == copyOnWriteArrayList3.size()) {
                int i = 0;
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    String strTag = null;
                    if (i >= 0) {
                        String strTag2 = ((SocialTopTabNode) obj).tag();
                        SocialTopTabNode socialTopTabNode = (SocialTopTabNode) C13LP.LJJJLZIJ(i, copyOnWriteArrayList3);
                        if (socialTopTabNode != null) {
                            strTag = socialTopTabNode.tag();
                        }
                        if (TextUtils.equals(strTag2, strTag)) {
                            i = i2;
                        } else {
                            C2252408s6.LJII(new AwS268S0300000_24(this, (FriendsTabProtocolAssem) new ArrayList(arrayList), (List<SocialTopTabNode>) new ArrayList(this.LL), (List<SocialTopTabNode>) 12));
                            break;
                        }
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                C2252408s6.LJII(new AwS268S0300000_24(this, (FriendsTabProtocolAssem) new ArrayList(arrayList), (List<SocialTopTabNode>) new ArrayList(this.LL), (List<SocialTopTabNode>) 12));
                break;
            }
        }
        C20684815ws.LJIJI("friends_tab_node_add_error_monitor", new Pair("TabProtocol_updateTabs", "event_from"), new Pair(String.valueOf(this.LLILLJJLI.size()), "node_size"));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onWindowFocusChanged(boolean z, boolean z2) {
        super.onWindowFocusChanged(z, z2);
        if (((Boolean) C285090BFj.LJIJJLI.getValue()).booleanValue()) {
            C08TN.LIZ().LJ("friend_tab_protocal_commit_preload_sub5", false);
            if (this.LLILZLL == null) {
                C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
                if (c19egLIZIZ != null) {
                    C1558520qew.LJII(C1558360qeg.LJI(c19egLIZIZ, null), this, ISocial2TabProtocolAbility.class, null, null);
                }
            } else {
                C19EG c19eg = this.LLILZLL;
                if (c19eg != null) {
                    C1558520qew.LJII(C1558360qeg.LJI(c19eg, null), this, ISocial2TabProtocolAbility.class, null, null);
                }
            }
            C08TN.LIZ().LJI("friend_tab_protocal_commit_preload_sub5");
        }
    }
}
