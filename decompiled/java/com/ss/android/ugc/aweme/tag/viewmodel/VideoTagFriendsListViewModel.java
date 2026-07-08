package com.ss.android.ugc.aweme.tag.viewmodel;

import X.C01GW;
import X.C086I;
import X.C098200Yq;
import X.C09R9;
import X.C11S5;
import X.C123100dR;
import X.C1243240iSQ;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C15438062q;
import X.C1559260qg8;
import X.C1572660r1k;
import X.C15NF;
import X.C15NG;
import X.C15NH;
import X.C15NY;
import X.C189200o6;
import X.C20510615No;
import X.C2201941BFw;
import X.C298690BnH;
import X.C452501pT;
import X.C723600SZy;
import X.C737520SwQ;
import X.C737600SwY;
import X.EnumC1778700wO4;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import Y.AfS185S0100000_16;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS24S1201000_31;
import kotlin.jvm.internal.AwS43S0001000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoTagFriendsListViewModel extends AssemViewModel<C15NF> {
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C20510615No.class));
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C1572660r1k.class, null), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1169));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1170));
    public final IMUser LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public boolean LLJ;
    public List<String> LLJI;
    public final C01GW LLJIJIL;
    public boolean LLJILJIL;
    public final List<String> LLJILJILJ;
    public final HashMap<Integer, Set<String>> LLJILLL;
    public C15NH LLJJ;
    public String LLJJI;
    public final Set<String> LLJJIII;

    public final void EQ2() {
        String aid;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (C086I.LIZIZ(vQ2().getTagged())) {
            for (IMUser iMUser : xQ2()) {
                if (C123100dR.LIZ(iMUser.getUid())) {
                    String uid = iMUser.getUid();
                    if (uid == null) {
                        uid = "";
                    }
                    arrayList.add(uid);
                }
            }
        } else if (C086I.LIZIZ(xQ2())) {
            for (BaseContact baseContact : vQ2().getTagged()) {
                if (C123100dR.LIZ(baseContact.getUid())) {
                    String uid2 = baseContact.getUid();
                    if (uid2 == null) {
                        uid2 = "";
                    }
                    arrayList2.add(uid2);
                }
            }
        } else {
            for (BaseContact baseContact2 : vQ2().getTagged()) {
                if (!xQ2().contains(baseContact2) && C123100dR.LIZ(baseContact2.getUid())) {
                    String uid3 = baseContact2.getUid();
                    if (uid3 == null) {
                        uid3 = "";
                    }
                    arrayList2.add(uid3);
                }
            }
            for (IMUser iMUser2 : xQ2()) {
                if (!vQ2().getTagged().contains(iMUser2) && C123100dR.LIZ(iMUser2.getUid())) {
                    String uid4 = iMUser2.getUid();
                    if (uid4 == null) {
                        uid4 = "";
                    }
                    arrayList.add(uid4);
                }
            }
        }
        if (C086I.LIZIZ(arrayList) && C086I.LIZIZ(arrayList2)) {
            setState(AFwS276S0000000_31.get$arr$(225));
            return;
        }
        C15NY c15ny = (C15NY) this.LL.getValue().getOperator();
        String string = arrayList.toString();
        String string2 = arrayList2.toString();
        Aweme aweme = vQ2().getAweme();
        c15ny.LJIIIZ(string, string2, (aweme == null || (aid = aweme.getAid()) == null) ? 0L : CastLongProtector.parseLong(aid)).LJL(C11S5.LIZ()).LJJLL(new AfS185S0100000_16(this, 13), new AfS185S0100000_16(this, 14));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C15NF(0);
    }

    public final C1572660r1k vQ2() {
        C1572660r1k c1572660r1k = (C1572660r1k) this.LLILLJJLI.getValue();
        return c1572660r1k == null ? new C1572660r1k(null, null, 0, null, null, 31, null) : c1572660r1k;
    }

    public final LinkedHashSet<IMUser> xQ2() {
        return (LinkedHashSet) this.LLILZ.getValue();
    }

    public final boolean zQ2() {
        return ((Boolean) this.LLJIJIL.getValue()).booleanValue();
    }

    public VideoTagFriendsListViewModel() {
        C2201941BFw c2201941BFw = IMUser.Companion;
        User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        c2201941BFw.getClass();
        this.LLILZIL = C2201941BFw.LIZJ(currentUser);
        this.LLILZLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1168));
        this.LLIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(286));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(285));
        this.LLJI = new ArrayList();
        this.LLJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1167));
        this.LLJILJILJ = new ArrayList();
        HashMap<Integer, Set<String>> map = new HashMap<>();
        map.put(Integer.valueOf(C15NG.BLOCK_SELF_REMOVAL.getType()), new LinkedHashSet());
        map.put(Integer.valueOf(C15NG.BLOCK_RELATION.getType()), new LinkedHashSet());
        map.put(Integer.valueOf(C15NG.PRIVACY_SETTING.getType()), new LinkedHashSet());
        map.put(Integer.valueOf(C15NG.PASS.getType()), new LinkedHashSet());
        this.LLJILLL = map;
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJJ = new C15NH(c13bv, c13bv, c13bv, c13bv);
        this.LLJJI = "other";
        this.LLJJIII = new LinkedHashSet();
    }

    public static void BQ2(int i) {
        try {
            C737520SwQ.LIZ("tag_block_check_result", new AwS43S0001000_31(i, 1));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static String wQ2(IMUser iMUser) {
        C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
        String nickName = iMUser.getNickName();
        String uniqueId = iMUser.getUniqueId();
        c1243240iSQ.getClass();
        return C1243240iSQ.LIZLLL(nickName, uniqueId);
    }

    public final void DQ2(boolean z) {
        boolean z2;
        Aweme aweme;
        if (xQ2().size() != vQ2().getTagged().size()) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<IMUser> listLLIIII = C13LP.LLIIII(xQ2());
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
        for (IMUser iMUser : listLLIIII) {
            if (!z2 && !vQ2().getTagged().contains(iMUser)) {
                z2 = true;
            }
            IMUser.Companion.getClass();
            arrayList.add(C2201941BFw.LJI(iMUser));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (z2 && (aweme = vQ2().getAweme()) != null) {
            InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
            if (interactionTagInfo != null) {
                interactionTagInfo.setTaggedUsers(arrayList2);
            } else {
                aweme.setInteractionTagInfo(new InteractionTagInfo(InteractionTagInterestLevel.UNDEFINED.getLevel(), "", arrayList2));
            }
            C1440005kM.LIZ(new InteractionTagInfoEvent(aweme));
        }
        InterfaceC1631620sYq<List<InteractionTagUserInfo>, Boolean, Boolean, Unit> tagPanelOnDismiss = vQ2().getTagPanelOnDismiss();
        if (tagPanelOnDismiss != null) {
            tagPanelOnDismiss.invoke(arrayList2, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    public final String yQ2(IMUser iMUser) {
        if (this.LLJJ.LIZ.contains(iMUser)) {
            return "recent";
        }
        if (this.LLJJ.LIZIZ.contains(iMUser)) {
            return "friends";
        }
        if (this.LLJJ.LIZJ.contains(iMUser)) {
            return "following";
        }
        return "";
    }

    public final void AQ2(int i, IMUser iMUser, String str) {
        try {
            C737520SwQ.LIZ("tag_mention_head_click", new AwS24S1201000_31(this, iMUser, str, i, 3));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void CQ2(IMUser iMUser, boolean z, EnumC1778700wO4 enumC1778700wO4) {
        if (!this.LLJILJIL && z != xQ2().contains(iMUser)) {
            if (z) {
                xQ2().add(iMUser);
                if (enumC1778700wO4 == EnumC1778700wO4.SEARCH && C298690BnH.LIZJ()) {
                    ArrayList arrayList = new ArrayList(C737600SwY.LIZ);
                    ListProtector.add(arrayList, 0, iMUser);
                    ArrayList arrayList2 = new ArrayList(this.LLJJ.LIZ);
                    ArrayList arrayList3 = new ArrayList(this.LLJJ.LIZIZ);
                    ArrayList arrayList4 = new ArrayList(this.LLJJ.LIZJ);
                    for (Object obj : arrayList) {
                        if (arrayList2.contains(obj)) {
                            arrayList2.remove(obj);
                        } else if (arrayList3.contains(obj)) {
                            arrayList3.remove(obj);
                        } else if (arrayList4.contains(obj)) {
                            arrayList4.remove(obj);
                        }
                    }
                    arrayList2.addAll(0, arrayList);
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.addAll(arrayList2);
                    arrayList5.addAll(arrayList3);
                    arrayList5.addAll(arrayList4);
                    C15NH c15nh = new C15NH(arrayList2, arrayList3, arrayList4, arrayList5);
                    this.LLJJ = c15nh;
                    C737600SwY.LIZ = arrayList;
                    setState(new AwS610S0100000_31(c15nh, 246));
                }
            } else {
                xQ2().remove(iMUser);
            }
            setState(new AwS610S0100000_31(iMUser, 247));
        }
    }
}
