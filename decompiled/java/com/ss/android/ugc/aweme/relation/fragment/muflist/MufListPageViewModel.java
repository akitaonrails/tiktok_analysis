package com.ss.android.ugc.aweme.relation.fragment.muflist;

import X.C00I6;
import X.C01GW;
import X.C08YE;
import X.C0NXK;
import X.C0PEM;
import X.C1072570e19;
import X.C1072630e1F;
import X.C1075800e6M;
import X.C1195404m0;
import X.C1243240iSQ;
import X.C1247020iYW;
import X.C1247690iZb;
import X.C1263670izN;
import X.C1337005Lc;
import X.C13BV;
import X.C15438062q;
import X.C1720106oR;
import X.C1E7L;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2232408os;
import X.C23250099c;
import X.C452501pT;
import X.C897370ZIh;
import X.C897520ZIw;
import X.EnumC1247010iYV;
import X.EnumC1262450ixP;
import X.EnumC1263650izL;
import X.EnumC1263680izO;
import X.EnumC1263700izQ;
import X.EnumC1263720izS;
import X.EnumC1910450zoZ;
import X.InterfaceC0148002o;
import X.InterfaceC1264300j0O;
import X.InterfaceC897380ZIi;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.following.model.AliasPermissionUserData;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.relation.model.FriendsListResponse;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import com.ss.android.ugc.aweme.relation.service.SocialMonoFreqControlService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MufListPageViewModel extends AssemViewModel<C1263670izN> {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public String LL = "";
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1734));
    public final C897520ZIw LLILLL;
    public final C01GW LLILZ;
    public final List<IMUser> LLILZIL;
    public final C2232408os LLILZLL;
    public final C01GW LLIZ;

    public static EnumC1263680izO yQ2() {
        boolean zLIZJ = C1072630e1F.LIZ.LIZJ();
        boolean zLIZJ2 = !SocialMonoFreqControlService.LIZIZ().LIZ(C1E7L.AUTH_FB) ? true : C1072570e19.LIZ.LIZJ();
        return zLIZJ ? zLIZJ2 ? EnumC1263680izO.ALL_AUTH : EnumC1263680izO.CONTACT_ONLY : zLIZJ2 ? EnumC1263680izO.FACEBOOK_ONLY : EnumC1263680izO.ZERO_AUTH;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        EnumC1263700izQ enumC1263700izQ = EnumC1263700izQ.UNINITIALIZED;
        return new C1263670izN(-1, null, EnumC1263720izS.NOT_APPENDED, enumC1263700izQ, new C1075800e6M(null, 7), "", C13BV.INSTANCE, yQ2(), EnumC1263650izL.UNINITIALIZED, -1);
    }

    public final InterfaceC1264300j0O zQ2() {
        return (InterfaceC1264300j0O) this.LLILZ.getValue();
    }

    public MufListPageViewModel() {
        InterfaceC897380ZIi.LIZIZ.getClass();
        this.LLILLL = C897370ZIh.LIZ().LJI(EnumC1910450zoZ.FRIEND_LIST, false);
        this.LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1733));
        this.LLILZIL = new ArrayList();
        this.LLILZLL = C08YE.LIZ("LocalDbFriendList");
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1337005Lc(this, null), 2);
        this.LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1732));
    }

    public final void vQ2() {
        EnumC1263680izO enumC1263680izOYQ2 = yQ2();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VM checkAuthState authState: ");
        sbLIZ.append(enumC1263680izOYQ2.name());
        C1720106oR.LJI("MUF-LIST VM", C2188811AlT.LIZIZ(sbLIZ));
        if (getState().LLIZLLLIL != enumC1263680izOYQ2) {
            setState(new AwS598S0100000_19(enumC1263680izOYQ2, 225));
        }
    }

    public static Map xQ2(List list) {
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C1247690iZb c1247690iZb : (ArrayList) list) {
            String uid = c1247690iZb.LL.getUid();
            Pair pair = new Pair(uid, new C0NXK(uid, c1247690iZb.LL.lastActiveTime.longValue(), 0L));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public final List<C1247690iZb> wQ2(FriendsListResponse friendsListResponse, boolean z) {
        boolean z2;
        ?? LJ;
        int iIntValue;
        int i = getState().LLJI;
        if (z) {
            List<AliasPermissionUserData> list = friendsListResponse.aliasPermissions;
            if (list != null) {
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LJ = new LinkedHashMap(iLIZIZ);
                for (AliasPermissionUserData aliasPermissionUserData : list) {
                    String str = aliasPermissionUserData.userId;
                    if (str == null) {
                        str = "";
                    }
                    Integer num = aliasPermissionUserData.aliasPermissionType;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Pair pair = new Pair(str, Integer.valueOf(iIntValue));
                    LJ.put(pair.getFirst(), pair.getSecond());
                }
            } else {
                LJ = C2097608Jq.LJ();
            }
            Map<String, Integer> map = C1195404m0.LIZ;
            ((LinkedHashMap) map).clear();
            map.putAll((Map<? extends String, ? extends Integer>) LJ);
        }
        List<C00I6> userList = friendsListResponse.getUserList();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(userList, 10));
        int i2 = 0;
        for (C00I6 c00i6 : userList) {
            if (c00i6.getSocialData().isNewFriend() && (i2 < i || i == -1)) {
                i2++;
                z2 = true;
            } else {
                z2 = false;
            }
            int iLIZ = C1195404m0.LIZ(c00i6.getUid());
            EnumC1262450ixP enumC1262450ixP = (EnumC1262450ixP) this.LLILLJJLI.getValue();
            MufPageTrackInfo mufPageTrackInfo = getState().LLILLJJLI;
            C1243240iSQ.LIZ.getClass();
            String strLIZ = C1243240iSQ.LIZ(c00i6, true);
            C1247020iYW c1247020iYW = EnumC1247010iYV.Companion;
            Integer numValueOf = Integer.valueOf(iLIZ);
            c1247020iYW.getClass();
            arrayList.add(new C1247690iZb(c00i6, enumC1262450ixP, mufPageTrackInfo, z2, strLIZ, C1247020iYW.LIZ(numValueOf), false, 64));
        }
        return arrayList;
    }
}
