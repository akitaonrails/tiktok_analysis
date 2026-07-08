package com.ss.android.ugc.aweme.relation.follow.logic;

import X.C054G;
import X.C0PEM;
import X.C0SY7;
import X.C0XIR;
import X.C0ZD9;
import X.C1252380ihA;
import X.C1252630ihZ;
import X.C1260960iv0;
import X.C1336205Ku;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C23250099c;
import X.EnumC1387060mCO;
import X.InterfaceC898260ZLs;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.RecommendCellInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RelationViewVM extends ViewModel implements InterfaceC898260ZLs {
    public static final HashMap<String, Long> LLILZLL = new HashMap<>();
    public final C054G LL;
    public final NextLiveData<Pair<RecommendCellInfo, Boolean>> LLILLJJLI;
    public final NextLiveData LLILLL;
    public final NextLiveData<C0ZD9> LLILZ;
    public final NextLiveData LLILZIL;

    public RelationViewVM() {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LL = C2296808zG.LIZ(C2107308Nj.LIZ.plus(c23119094bLIZ));
        NextLiveData<Pair<RecommendCellInfo, Boolean>> nextLiveData = new NextLiveData<>();
        this.LLILLJJLI = nextLiveData;
        this.LLILLL = nextLiveData;
        NextLiveData<C0ZD9> nextLiveData2 = new NextLiveData<>();
        this.LLILZ = nextLiveData2;
        this.LLILZIL = nextLiveData2;
    }

    public static int wQ2(int i, int i2) {
        int iMin;
        int iMin2 = 0;
        if (i == 0 && i2 == 0) {
            iMin = 0;
        } else if (i == 0) {
            iMin = Math.min(4, i2);
        } else if (i2 == 0 || i > 3) {
            iMin2 = Math.min(4, i);
            iMin = 0;
        } else {
            iMin2 = Math.min(i, 4);
            iMin = Math.min(4 - iMin2, i2);
        }
        return iMin2 + iMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d A[PHI: r8
      0x007d: PHI (r8v6 X.0iux) = (r8v8 X.0iux), (r8v8 X.0iux), (r8v9 X.0iux) binds: [B:7:0x000a, B:192:0x007d, B:5:0x0006] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vQ2(com.ss.android.ugc.aweme.profile.model.User r10, boolean r11, X.C1260960iv0 r12) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM.vQ2(com.ss.android.ugc.aweme.profile.model.User, boolean, X.0iv0):void");
    }

    @Override // X.InterfaceC898260ZLs
    public final void AI2(C1252380ihA c1252380ihA, String str, Function2<? super Boolean, ? super C0XIR, Unit> function2) {
        if (c1252380ihA == null) {
            return;
        }
        c1252380ihA.LJIIZILJ = System.currentTimeMillis();
        C23250099c.LIZLLL(this.LL, C0PEM.LIZJ, null, new C1252630ihZ(c1252380ihA, str, function2, this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0268 A[PHI: r6
      0x0268: PHI (r6v1 int) = (r6v0 int), (r6v4 int) binds: [B:48:0x0265, B:25:0x020a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC898260ZLs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Hb1(X.C1252380ihA r95, X.C1260960iv0 r96, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super X.C0XIR, kotlin.Unit> r97) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM.Hb1(X.0ihA, X.0iv0, kotlin.jvm.functions.Function2):void");
    }

    public static void xQ2(int i, String str, C1260960iv0 c1260960iv0, LifecycleOwner lifecycleOwner, boolean z, boolean z2, EnumC1387060mCO enumC1387060mCO) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if ((i != C0SY7.FOLLOW_MUTUAL.getValue() && !z2) || str == null || str.length() == 0 || enumC1387060mCO != EnumC1387060mCO.MESSAGE_ICE_BREAKING) {
            return;
        }
        IIMService iIMServiceLIZ = C1336205Ku.LIZ(false);
        if (iIMServiceLIZ.getImSayHiService().LJ(str, true, null, !C1336205Ku.LIZ(false).getLightInteractService().LIZLLL(str), false) && c1260960iv0 != null && (!Intrinsics.LJFF(c1260960iv0.LIZIZ, "inner_push"))) {
            Pair[] pairArr = new Pair[7];
            Map<String, String> map = c1260960iv0.LJJJJI;
            if (map == null || (str2 = map.get("light_interaction_enter_from")) == null) {
                str2 = c1260960iv0.LIZIZ;
            }
            pairArr[0] = new Pair("enter_from", str2);
            Map<String, String> map2 = c1260960iv0.LJJJJI;
            String str9 = "";
            if ((map2 == null || (str3 = map2.get("light_interaction_enter_method")) == null) && (str3 = c1260960iv0.LIZLLL) == null) {
                str3 = "";
            }
            pairArr[1] = new Pair("enter_method", str3);
            Map<String, String> map3 = c1260960iv0.LJJJJI;
            if (map3 == null || (str4 = map3.get("push_label")) == null) {
                str4 = "";
            }
            pairArr[2] = new Pair("push_label", str4);
            Map<String, String> map4 = c1260960iv0.LJJJJI;
            if (map4 == null || (str5 = map4.get("light_interaction_position")) == null) {
                str5 = "";
            }
            pairArr[3] = new Pair("position", str5);
            Map<String, String> map5 = c1260960iv0.LJJJJI;
            if (map5 == null || (str6 = map5.get("is_from_push")) == null) {
                str6 = "";
            }
            pairArr[4] = new Pair("is_from_push", str6);
            Map<String, String> map6 = c1260960iv0.LJJJJI;
            if (map6 == null || (str7 = map6.get("push_type")) == null) {
                str7 = "";
            }
            pairArr[5] = new Pair("push_type", str7);
            Map<String, String> map7 = c1260960iv0.LJJJJI;
            if (map7 == null || (str8 = map7.get("push_id")) == null) {
                str8 = "";
            }
            pairArr[6] = new Pair("push_id", str8);
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            String str10 = c1260960iv0.LJIIJ;
            if (str10 != null) {
                mapLJIIJ.put("sub_page", str10);
            }
            User user = c1260960iv0.LIZJ;
            if (user != null) {
                String accurateRecType = user.getAccurateRecType();
                if (accurateRecType != null) {
                    str9 = accurateRecType;
                }
                mapLJIIJ.put("rec_type", str9);
                mapLJIIJ.put("relation_tag", String.valueOf(user.getFollowStatus()));
            }
            iIMServiceLIZ.getImSayhiAnalytics().LIZIZ(str, mapLJIIJ, lifecycleOwner, z);
        }
    }
}
