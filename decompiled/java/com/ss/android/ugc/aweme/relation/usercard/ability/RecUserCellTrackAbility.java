package com.ss.android.ugc.aweme.relation.usercard.ability;

import X.AbstractC1223210hw7;
import X.AbstractC1261010iv5;
import X.C01GW;
import X.C0XHV;
import X.C1253970ijj;
import X.C1260910iuv;
import X.C1261000iv4;
import X.C1261030iv7;
import X.C1261270ivV;
import X.C1261370ivf;
import X.C1261650iw7;
import X.C1261860iwS;
import X.C1262320ixC;
import X.C1262570ixb;
import X.C1263080iyQ;
import X.C1264800j1C;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C296550Bjp;
import X.C452501pT;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.InterfaceC1261750iwH;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS127S0101000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RecUserCellTrackAbility implements ICellTrackAbility<C1261650iw7> {
    public final Function0<C1261270ivV> LL;
    public final C1262320ixC LLILLJJLI;
    public final Function1<Function1<? super InterfaceC1261750iwH, Unit>, Unit> LLILLL;
    public final C01GW LLILZ;
    public final Map<String, Boolean> LLILZIL;
    public final C01GW LLILZLL;

    public RecUserCellTrackAbility() {
        throw null;
    }

    public final Map<String, String> LIZ() {
        return this.LL.invoke().LIZJ();
    }

    public final EnumC1260920iuw LIZIZ() {
        EnumC1260920iuw enumC1260920iuw;
        return (!this.LL.invoke().LJFF || (enumC1260920iuw = EnumC1260920iuw.POP_UP) == null) ? EnumC1260920iuw.CARD : enumC1260920iuw;
    }

    public final void LJI(int i, C1261650iw7 c1261650iw7) {
        final C1261860iwS c1261860iwS = c1261650iw7.LLILZIL;
        Map<String, String> mapLIZ = LIZ();
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZ;
        final String str = (String) linkedHashMap.get("enter_from");
        if (str == null) {
            str = "";
        }
        final String str2 = (String) linkedHashMap.get("enter_method");
        final String str3 = (String) linkedHashMap.get("previous_page");
        final String str4 = (String) linkedHashMap.get("homepage_uid");
        final Integer numValueOf = Integer.valueOf(c1261860iwS.getImprOrder());
        new AbstractC1223210hw7(str, c1261860iwS, str2, str3, str4, numValueOf) { // from class: X.0ijl
            public final String LIZIZ;
            public final User LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final String LJFF;
            public final Integer LJI;
            public final String LJII = "close_recommend_user_cell";
            public final Map<String, String> LJIIIIZZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1253990ijl)) {
                    return false;
                }
                C1253990ijl c1253990ijl = (C1253990ijl) obj;
                return Intrinsics.LJFF(this.LIZIZ, c1253990ijl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1253990ijl.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1253990ijl.LIZLLL) && Intrinsics.LJFF(this.LJ, c1253990ijl.LJ) && Intrinsics.LJFF(this.LJFF, c1253990ijl.LJFF) && Intrinsics.LJFF(this.LJI, c1253990ijl.LJI);
            }

            public final int hashCode() {
                int iHashCode = ((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31;
                String str5 = this.LIZLLL;
                int iHashCode2 = (iHashCode + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.LJ;
                int iHashCode3 = (iHashCode2 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.LJFF;
                int iHashCode4 = (iHashCode3 + (str7 == null ? 0 : str7.hashCode())) * 31;
                Integer num = this.LJI;
                return iHashCode4 + (num != null ? num.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CloseRecCellTrack(enterFrom=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", user=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", enterMethod=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", previousPage=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(", homepageUid=");
                sbLIZ.append(this.LJFF);
                sbLIZ.append(", imprOrder=");
                sbLIZ.append(this.LJI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC1223210hw7
            public final String LIZ() {
                return this.LJII;
            }

            @Override // X.AbstractC1223210hw7
            public final Map<String, String> LIZIZ() {
                return this.LJIIIIZZ;
            }

            {
                this.LIZIZ = str;
                this.LIZJ = c1261860iwS;
                this.LIZLLL = str2;
                this.LJ = str3;
                this.LJFF = str4;
                this.LJI = numValueOf;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("enter_method", str2);
                c2344009Gk.LJIIIIZZ("previous_page", str3);
                c2344009Gk.LJIIIIZZ("homepage_uid", str4);
                c2344009Gk.LJ(numValueOf, "impr_order");
                c2344009Gk.LJIIIIZZ("rec_uid", c1261860iwS.getUid());
                c2344009Gk.LJIIIIZZ("rec_type", c1261860iwS.getAccurateRecType());
                c2344009Gk.LJIIIIZZ("req_id", c1261860iwS.getRequestId());
                String friendTypeStr = c1261860iwS.getFriendTypeStr();
                if (friendTypeStr == null) {
                    MatchedFriendStruct matchedFriendStruct = c1261860iwS.getMatchedFriendStruct();
                    if (matchedFriendStruct != null) {
                        friendTypeStr = matchedFriendStruct.relationType;
                    } else {
                        friendTypeStr = null;
                    }
                }
                c2344009Gk.LJIIIIZZ("relation_type", friendTypeStr);
                C1365450ldX.LJ(c2344009Gk, c1261860iwS);
                this.LJIIIIZZ = c2344009Gk.LIZ;
            }
        }.LIZLLL(null);
        LIZLLL(mapLIZ, c1261650iw7, LIZIZ(), EnumC1260930iux.CLOSE);
        Function1<Function1<? super InterfaceC1261750iwH, Unit>, Unit> function1 = this.LLILLL;
        if (function1 != null) {
            function1.invoke(new AwS127S0101000_19(i, c1261650iw7, 4));
        }
    }

    public final void LJII(int i, C1261650iw7 c1261650iw7) {
        C1261860iwS c1261860iwS = c1261650iw7.LLILZIL;
        if (!((CopyOnWriteArraySet) ((C1263080iyQ) this.LLILZ.getValue()).LLJI).add(c1261860iwS.getElementId())) {
            return;
        }
        String uid = c1261860iwS.getUid();
        if (uid != null) {
            C1262570ixb.LIZ("1", uid);
        }
        Map<String, String> mapLIZ = LIZ();
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZ;
        String str = (String) linkedHashMap.get("enter_from");
        if (str == null) {
            str = "";
        }
        new C1253970ijj(str, c1261860iwS, (String) linkedHashMap.get("enter_method"), (String) linkedHashMap.get("previous_page"), (String) linkedHashMap.get("homepage_uid"), Integer.valueOf(c1261860iwS.getImprOrder()), c1261860iwS.isRelatedRec()).LIZLLL(null);
        LIZLLL(mapLIZ, c1261650iw7, LIZIZ(), EnumC1260930iux.SHOW);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cell Show: ");
        sbLIZ.append(c1261650iw7.LLILZIL.getNickname());
        C2188811AlT.LIZIZ(sbLIZ);
        Function1<Function1<? super InterfaceC1261750iwH, Unit>, Unit> function1 = this.LLILLL;
        if (function1 != null) {
            function1.invoke(new AwS127S0101000_19(i, c1261860iwS, 19));
        }
    }

    public RecUserCellTrackAbility(AwS563S0100000_19 awS563S0100000_19, C1262320ixC c1262320ixC, C01GW c01gw, C1261370ivf c1261370ivf) {
        this.LL = awS563S0100000_19;
        this.LLILLJJLI = c1262320ixC;
        this.LLILLL = c1261370ivf;
        this.LLILZ = c01gw;
        this.LLILZIL = new LinkedHashMap();
        this.LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(682));
    }

    public final void LIZLLL(Map<String, String> map, C1261650iw7 c1261650iw7, EnumC1260920iuw enumC1260920iuw, EnumC1260930iux enumC1260930iux) {
        C1261860iwS c1261860iwS = c1261650iw7.LLILZIL;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("post follow recommend for user: ");
        sbLIZ.append(c1261650iw7.LLILZIL.getNickname());
        sbLIZ.append(". follow status: ");
        sbLIZ.append(c1261860iwS.getFollowStatus());
        sbLIZ.append(", cover count: ");
        sbLIZ.append(c1261650iw7.LLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        boolean zLJFF = false;
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJLIIIJILLIZJL = enumC1260920iuw;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        c1260910iuv.LJJJLL = c1261860iwS.getFollowStatus();
        MatchedFriendStruct matchedFriendStruct = c1261860iwS.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            zLJFF = Intrinsics.LJFF(matchedFriendStruct.isNewMaF(), Boolean.TRUE);
        }
        c1260910iuv.LJJJI((String) ((LinkedHashMap) map).get("enter_from"), zLJFF);
        c1260910iuv.LJJJJZI(c1261860iwS);
        c1260910iuv.LJLLLLLL = c1261650iw7.LLILZLL;
        C0XHV.LIZ.getClass();
        c1260910iuv.LJLLLL = C0XHV.LIZ();
        c1260910iuv.LLFII = (Boolean) ((LinkedHashMap) this.LLILZIL).get(c1261860iwS.getUid());
        AbstractC1261010iv5 from = c1261860iwS.getFrom();
        if (from instanceof C1261000iv4) {
            C1261000iv4 c1261000iv4 = (C1261000iv4) from;
            String uid = c1261000iv4.getUid();
            int iterateCnt = c1261000iv4.getIterateCnt();
            int indexOfRecMore = c1261000iv4.getIndexOfRecMore();
            c1260910iuv.LJLJJI = true;
            c1260910iuv.LJLJL = uid;
            c1260910iuv.LJLJLJ = iterateCnt;
            c1260910iuv.LJLJJL = true;
            c1260910iuv.LJLJJLL = indexOfRecMore;
        } else if (from instanceof C1261030iv7) {
            c1260910iuv.LJLJLLL = true;
        }
        Integer num = c1261650iw7.LLIZ;
        if (num != null) {
            c1260910iuv.LLII = Integer.valueOf(num.intValue());
        }
        Boolean bool = c1261650iw7.LLIZLLLIL;
        if (bool != null) {
            c1260910iuv.LLF = Boolean.valueOf(bool.booleanValue());
        }
        if (C296550Bjp.LIZ()) {
            c1260910iuv.LJJJJLI(c1261860iwS.getRequestId());
        }
        c1260910iuv.LIZIZ(map);
        c1260910iuv.LJIILJJIL();
    }

    public final void LJFF(C1261860iwS c1261860iwS, boolean z, boolean z2, boolean z3, EnumC1260930iux enumC1260930iux) {
        Map<String, String> mapLIZ = LIZ();
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LL = Boolean.valueOf(z);
        c1260910iuv.LLD = Boolean.valueOf(z2);
        c1260910iuv.LLF = Boolean.valueOf(z3);
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        c1260910iuv.LJJJJZI(c1261860iwS);
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZ;
        String str = (String) linkedHashMap.get("enter_from");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1260910iuv.LJJIJLIJ(str);
        String str3 = (String) linkedHashMap.get("previous_page");
        if (str3 != null) {
            str2 = str3;
        }
        c1260910iuv.LJJJJJ(str2);
        if (C1264800j1C.LIZIZ()) {
            c1260910iuv.LJJJJZ(EnumC1260920iuw.CARD);
        }
        c1260910iuv.LJIILJJIL();
    }
}
