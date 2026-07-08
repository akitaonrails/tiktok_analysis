package com.ss.android.ugc.aweme.im.b2c.impl;

import X.AbstractC1387200mCc;
import X.AbstractC1549150qPp;
import X.AbstractC738140SxQ;
import X.AnonymousClass0629;
import X.AnonymousClass0653;
import X.C01GW;
import X.C061D;
import X.C0C64;
import X.C0PEM;
import X.C0Y7K;
import X.C0Z7V;
import X.C0ZR3;
import X.C123100dR;
import X.C1353205Ri;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1595706Mp;
import X.C1654606ds;
import X.C1662306f7;
import X.C1662406f8;
import X.C1662506f9;
import X.C1662606fA;
import X.C1662806fC;
import X.C1663006fE;
import X.C1663106fF;
import X.C1663206fG;
import X.C1663306fH;
import X.C1665206fa;
import X.C1665306fb;
import X.C1665706ff;
import X.C1667606fy;
import X.C1670206gO;
import X.C1670506gR;
import X.C1906580ziK;
import X.C19719912Dl;
import X.C19EG;
import X.C20741616Ek;
import X.C2097608Jq;
import X.C2277881EDy;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C597210Nbb;
import X.C867580Y1s;
import X.C877170Yb5;
import X.C909290Zln;
import X.EnumC1660706er;
import X.EnumC1725606pK;
import X.InterfaceC1364105Vn;
import X.InterfaceC15516065q;
import X.InterfaceC1608000rwk;
import X.InterfaceC1662906fD;
import X.InterfaceC1664206fQ;
import X.InterfaceC1668206g4;
import X.InterfaceC1669006gC;
import X.InterfaceC1669306gF;
import X.InterfaceC1669506gH;
import X.InterfaceC1670106gN;
import X.InterfaceC1712206nA;
import X.InterfaceC1712506nD;
import X.InterfaceC877200Yb8;
import X.InterfaceC894120Z5u;
import Y.AComparatorS21S0000000_2;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.b2c.actionbar.BusinessChatActionBarDataControllerAssem;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.b2c.api.model.ClickToChatItemResponse;
import com.ss.android.ugc.aweme.im.b2c.singlechat.BusinessSingleChatAssem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.SingleChatAssem;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IMBusinessChatService implements IIMBusinessChatService {
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1663306fH());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1663006fE());
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(338));
    public final C01GW LJ = C452501pT.LIZIZ(new C1663106fF());

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final C13IQ<? extends UIContentAssem> LJ() {
        return C13LE.LIZ(BusinessSingleChatAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final C19719912Dl LJIILLIIL() {
        return C13LE.LIZ(BusinessChatActionBarDataControllerAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final void LIZ() {
        ((InterfaceC15516065q) C1353205Ri.LIZ.getValue()).LJ(EnumC1725606pK.B2C_USER_AVG_RESP_TIME);
        ((C20741616Ek) this.LIZLLL.getValue()).LIZ.evictAll();
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final void LIZJ() {
        InterfaceC1662906fD interfaceC1662906fD;
        C1662306f7 c1662306f7 = C1662306f7.LL;
        C1662306f7.LIZJ();
        String strLIZIZ = C1662306f7.LIZIZ();
        if (strLIZIZ == null || (interfaceC1662906fD = C1662806fC.LIZ) == null) {
            return;
        }
        C23250099c.LIZLLL(C1662306f7.LLILLL, null, null, new C1662406f8(interfaceC1662906fD, strLIZIZ, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final void LIZLLL() {
        C1662306f7 c1662306f7 = C1662306f7.LL;
        C1662306f7.LLILLJJLI.set(C2097608Jq.LJ());
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1669006gC LJIIJJI() {
        return (C1662506f9) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1712206nA LJIILL() {
        return (C20741616Ek) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1668206g4 LJIJJ() {
        return (InterfaceC1668206g4) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJJI() {
        return Collections.singletonList(C1667606fy.class);
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1669506gH LIZIZ() {
        return new InterfaceC1669506gH() { // from class: X.06gI
            @Override // X.InterfaceC1669506gH
            public final EnumC1669706gJ LIZ(IMUser iMUser) {
                EnumC1669706gJ enumC1669706gJ;
                EnumC1669706gJ next;
                if (iMUser == null) {
                    return EnumC1669706gJ.NONE;
                }
                List<Integer> list = C1665206fa.LIZLLL(iMUser).get("buyer");
                if (list != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<Integer> it2 = list.iterator();
                    while (true) {
                        enumC1669706gJ = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        int iIntValue = it2.next().intValue();
                        C1669806gK c1669806gK = EnumC1669706gJ.Companion;
                        Integer numValueOf = Integer.valueOf(iIntValue);
                        c1669806gK.getClass();
                        if (numValueOf != null) {
                            numValueOf.intValue();
                            Iterator<EnumC1669706gJ> it3 = EnumC1669706gJ.getEntries().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                next = it3.next();
                                if (next.getValue() == numValueOf.intValue()) {
                                    if (next == null) {
                                        break;
                                    }
                                }
                            }
                            next = EnumC1669706gJ.NONE;
                        } else {
                            next = EnumC1669706gJ.NONE;
                        }
                        arrayList.add(next);
                    }
                    Set setLLIIJI = C13LP.LLIIJI(arrayList);
                    if (setLLIIJI != null && (!setLLIIJI.isEmpty())) {
                        Iterator<EnumC1669706gJ> it4 = EnumC1669706gJ.getEntries().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            EnumC1669706gJ next2 = it4.next();
                            if (next2 != EnumC1669706gJ.NONE && setLLIIJI.contains(next2)) {
                                enumC1669706gJ = next2;
                                break;
                            }
                        }
                        EnumC1669706gJ enumC1669706gJ2 = enumC1669706gJ;
                        if (enumC1669706gJ2 == null) {
                            return EnumC1669706gJ.NONE;
                        }
                        return enumC1669706gJ2;
                    }
                }
                return EnumC1669706gJ.NONE;
            }

            @Override // X.InterfaceC1669506gH
            public final boolean LIZIZ(IMUser iMUser) {
                List<Integer> list;
                if (iMUser == null || (list = C1665206fa.LIZLLL(iMUser).get("buyer")) == null || !(!list.isEmpty())) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
            @Override // X.InterfaceC1669506gH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List<X.C1669906gL> LIZJ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r14) {
                /*
                    Method dump skipped, instruction units count: 396
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1669606gI.LIZJ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser):java.util.List");
            }

            @Override // X.InterfaceC1669506gH
            public final Map<String, List<Integer>> LIZLLL(IMUser iMUser) {
                if (iMUser == null) {
                    return C2097608Jq.LJ();
                }
                return C1665206fa.LIZLLL(iMUser);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1712506nD LJFF() {
        return new InterfaceC1712506nD() { // from class: X.06fV
            @Override // X.InterfaceC1712506nD
            public final boolean LIZ(IMUser iMUser) {
                List<Integer> list;
                C1664606fU.LIZ.getClass();
                if (iMUser != null) {
                    Map<String, List<Integer>> mapLIZIZ = C1665206fa.LIZIZ(iMUser, true);
                    if ((!mapLIZIZ.isEmpty()) && (list = mapLIZIZ.get("creator")) != null && list.contains(1)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC1712506nD
            public final boolean LIZIZ(IMUser iMUser) {
                List<Integer> list;
                C1664606fU.LIZ.getClass();
                if (iMUser == null) {
                    return false;
                }
                Map<String, List<Integer>> mapLIZIZ = C1665206fa.LIZIZ(iMUser, true);
                if (!(!mapLIZIZ.isEmpty()) || (list = mapLIZIZ.get("oa")) == null || list.isEmpty()) {
                    return false;
                }
                Iterator<Integer> it2 = list.iterator();
                while (it2.hasNext()) {
                    int iIntValue = it2.next().intValue();
                    List list2 = (List) ((LinkedHashMap) C1664606fU.LIZJ).get("oa");
                    if (list2 != null && list2.contains(Integer.valueOf(iIntValue))) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC1712506nD
            public final boolean LIZJ(IMUser iMUser) {
                C1664606fU.LIZ.getClass();
                if (iMUser != null) {
                    Map<String, List<Integer>> mapLIZIZ = C1665206fa.LIZIZ(iMUser, true);
                    if (true ^ mapLIZIZ.isEmpty()) {
                        return C866950Xzh.LIZIZ(mapLIZIZ.get("ad"));
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC1712506nD
            public final boolean LIZLLL(IMUser iMUser) {
                List<Integer> list;
                C1664606fU.LIZ.getClass();
                if (iMUser != null && (list = C1665206fa.LIZIZ(iMUser, true).get("live")) != null && list.contains(1)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1712506nD
            public final Boolean LJ(IMUser iMUser) {
                C1664606fU.LIZ.getClass();
                return C1664606fU.LIZ(iMUser);
            }

            @Override // X.InterfaceC1712506nD
            public final boolean LJFF(IMUser iMUser) {
                C1664606fU.LIZ.getClass();
                return C1664606fU.LJFF(iMUser);
            }

            @Override // X.InterfaceC1712506nD
            public final boolean LJI(IMUser iMUser) {
                C1664606fU.LIZ.getClass();
                return C1664606fU.LIZLLL(iMUser);
            }

            @Override // X.InterfaceC1712506nD
            public final boolean LJII(IMUser iMUser) {
                List<Integer> list;
                C1664606fU.LIZ.getClass();
                if (iMUser != null && (list = C1665206fa.LIZIZ(iMUser, true).get("ad")) != null) {
                    if (list.contains(10) || list.contains(11)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC1712506nD
            public final boolean LJIIIIZZ(IMUser iMUser) {
                if (iMUser == null || iMUser.getFollowerCount() < 10000) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1712506nD
            public final boolean LJIIIZ(IMUser iMUser) {
                List<Integer> list;
                C1664606fU.LIZ.getClass();
                if (iMUser == null) {
                    return false;
                }
                Map<String, List<Integer>> mapLIZIZ = C1665206fa.LIZIZ(iMUser, true);
                if (!(!mapLIZIZ.isEmpty())) {
                    return false;
                }
                List<Integer> list2 = mapLIZIZ.get("ba");
                if ((list2 == null || !list2.contains(1)) && ((list = mapLIZIZ.get("ba")) == null || !list.contains(5))) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1712506nD
            public final Map<String, List<Integer>> LJIIJ(IMUser iMUser) {
                if (iMUser != null) {
                    return C1665206fa.LIZIZ(iMUser, true);
                }
                return C2097608Jq.LJ();
            }

            @Override // X.InterfaceC1712506nD
            public final boolean LJIIJJI(IMUser iMUser) {
                List<Integer> list;
                C1664606fU.LIZ.getClass();
                if (iMUser != null && (list = C1665206fa.LIZIZ(iMUser, true).get("tts")) != null && list.contains(1)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1712506nD
            public final boolean LJIIL(IMUser iMUser) {
                List<Integer> list;
                C1664606fU.LIZ.getClass();
                if (iMUser != null && (list = C1665206fa.LIZIZ(iMUser, true).get("live")) != null && list.contains(4)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1712506nD
            public final boolean LJIILIIL(IMUser iMUser) {
                List<Integer> list;
                C1664606fU.LIZ.getClass();
                if (iMUser != null && (list = C1665206fa.LIZIZ(iMUser, true).get("tts")) != null) {
                    if (list.contains(1) || list.contains(2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC1712506nD
            public final boolean LJIILJJIL(IMUser iMUser) {
                if (!LJIIIZ(iMUser) && !LIZJ(iMUser) && !LJI(iMUser)) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC894120Z5u LJI() {
        return new InterfaceC894120Z5u() { // from class: X.01c3
            @Override // X.InterfaceC894120Z5u
            public final void LIZ() {
                if (C369201c2.LIZIZ.compareAndSet(false, true)) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C369101c1(null), 3);
                }
            }

            @Override // X.InterfaceC894120Z5u
            public final void LIZIZ(C1744706sP c1744706sP) {
                C1744106sJ.LIZ.getClass();
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = "";
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1744206sK(c259800zU, c1744706sP, null), 3);
            }

            @Override // X.InterfaceC894120Z5u
            public final void LIZJ(String str) {
                C1744106sJ.LIZ.getClass();
                ((ConcurrentHashMap) C1744106sJ.LIZJ.getValue()).remove(str);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1669306gF LJIIIIZZ() {
        return new InterfaceC1669306gF() { // from class: X.061g
            @Override // X.InterfaceC1669306gF
            public final boolean LIZ() {
                if (!C19212010Ec.LIZJ.LJJZZI()) {
                    return false;
                }
                InterfaceC1712506nD interfaceC1712506nDLJFF = C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJFF();
                InterfaceC1712506nD.LIZ.getClass();
                return interfaceC1712506nDLJFF.LIZ(AnonymousClass0613.LIZ()) && !C1336205Ku.LIZ(false).getImPrivacySettings().LJI();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final C061D LJIILIIL() {
        return C1662306f7.LL;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final C0Z7V LJIILJJIL() {
        return C1670506gR.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1670106gN LJIIZILJ() {
        return C877170Yb5.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC877200Yb8 LJIJI() {
        return C1665306fb.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final C0ZR3 getFeedbackService() {
        return new C0ZR3() { // from class: X.06or
            public static final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS187S0000000_2.get$arr$(1087));

            @Override // X.C0ZR3
            public final String LIZIZ(C869590Y9l c869590Y9l) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://roma_redirect/?spark_page=im_business_feedback&msg_id=");
                sbLIZ.append(c869590Y9l.getMsgId());
                sbLIZ.append("&conv_short_id=");
                sbLIZ.append(c869590Y9l.getConversationShortId());
                sbLIZ.append("&enter_from=");
                sbLIZ.append("chat");
                sbLIZ.append("&enter_method=");
                sbLIZ.append("click_msg_feedback");
                sbLIZ.append("&feedback_enum=");
                sbLIZ.append(1);
                sbLIZ.append("&target_user_id=");
                sbLIZ.append(c869590Y9l.getSender());
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C0ZR3
            public final void LIZLLL(C869590Y9l c869590Y9l) {
                Map mapLIZ = C1722806os.LIZ(c869590Y9l, "chat", "click_msg_feedback");
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("b2c_msg_feedback_show", mapLIZ);
            }

            @Override // X.C0ZR3
            public final void LJ(String str) {
                ((Keva) LIZIZ.getValue()).storeBoolean(str, true);
            }

            @Override // X.C0ZR3
            public final boolean LIZ(C869590Y9l c869590Y9l, List<? extends C869590Y9l> list) {
                String uuid;
                Object next;
                if (!C0ZDX.LJJJJI(c869590Y9l) || C0C64.LJIILLIIL().LJIJ(31744, 0, "dm_b2c_feedback_aibot_message", true) <= 0) {
                    return false;
                }
                Iterator it2 = C13LP.LJLLLL(new AComparatorS21S0000000_2(20), list).iterator();
                while (true) {
                    uuid = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        C869590Y9l c869590Y9l2 = (C869590Y9l) next;
                        if (C0ZDX.LJJJJI(c869590Y9l2) && c869590Y9l2.getMsgType() != 1) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C869590Y9l c869590Y9l3 = (C869590Y9l) next;
                if (c869590Y9l3 != null) {
                    uuid = c869590Y9l3.getUuid();
                }
                if (!Intrinsics.LJFF(uuid, c869590Y9l.getUuid())) {
                    return false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("feedback_bot_");
                sbLIZ.append(c869590Y9l.getUuid());
                if (((Keva) LIZIZ.getValue()).getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                    return false;
                }
                return true;
            }

            @Override // X.C0ZR3
            public final void LIZJ(C869590Y9l c869590Y9l, boolean z) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1722906ot(c869590Y9l, z, "chat", "click_msg_feedback", null), 3);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final Map<String, List<Integer>> LJIIIZ(IMUser iMUser) {
        if (iMUser == null) {
            return C2097608Jq.LJ();
        }
        return C1665206fa.LIZIZ(iMUser, true);
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final void LJIIL(BusinessCommandMessage businessCommandMessage) {
        this.LJ.getValue().getClass();
        Iterator it2 = ((CopyOnWriteArraySet) C1663206fG.LIZIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1664206fQ) it2.next()).sb();
        }
        Function1<C0Y7K, Unit> onResult = businessCommandMessage.getOnResult();
        if (onResult != null) {
            onResult.invoke(new C867580Y1s(null));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final void LJIL(IMUser iMUser) {
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        C1595706Mp.LIZ.getClass();
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null) {
            C2277881EDy.LIZIZ.jumpToOrgAccountPage(c19egLIZIZ, "chat", iMUser.getUid(), null, "2");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final void LJJ(String str) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        C1595706Mp.LIZ.getClass();
        if (str.length() > 0 && (abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
            c1537900q7g.getClass();
            new C1541950qED(c19egLIZIZ, sparkContext).LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final Object LJIJJLI(AnonymousClass0653 anonymousClass0653, InterfaceC1364105Vn<? super ClickToChatItemResponse> interfaceC1364105Vn) {
        return C1662606fA.LIZIZ.LIZ(anonymousClass0653.LIZ, anonymousClass0653.LIZIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0258 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a4  */
    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf LJIJ(com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r12, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r13, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r14) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.b2c.impl.IMBusinessChatService.LJIJ(com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser):com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf");
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1608000rwk LJIIJ(Aweme aweme, Long l, String str, String str2) {
        return new C597210Nbb(aweme, l, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final void LJII(ChatFeatureListConf chatFeatureListConf, Assembler assembler, Fragment fragment, C909290Zln c909290Zln, SingleChatAssem singleChatAssem) {
        View viewFindViewById;
        assembler.DQ2(fragment, new AwS581S0100000_2(chatFeatureListConf, 544));
        IMAIServiceAPI.LIZ.getClass();
        C13IQ<? extends AbstractC738140SxQ> c13iqLJJIIZ = AnonymousClass0629.LIZ().LIZ().LJJIIZ();
        if (c13iqLJJIIZ != null) {
            assembler.vQ2(singleChatAssem, new AwS581S0100000_2((C13IQ) c13iqLJJIIZ, (C13IQ<? extends UISlotAssem>) 463));
        }
        assembler.vQ2(fragment, AFwS229S0000000_2.get$arr$(660));
        assembler.QQ2(singleChatAssem, AFwS229S0000000_2.get$arr$(662));
        View view = fragment.getView();
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.krm);
        } else {
            viewFindViewById = null;
        }
        assembler.RQ2(singleChatAssem, new AwS581S0100000_2(viewFindViewById, 461));
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "im_business_lead_info_exp", false) > 0) {
            assembler.vQ2(singleChatAssem, AFwS229S0000000_2.get$arr$(665));
        }
        if (chatFeatureListConf.componentEnable(EnumC1660706er.LANDING_MESSAGE.getId())) {
            assembler.QQ2(singleChatAssem, AFwS229S0000000_2.get$arr$(663));
        }
        assembler.vQ2(singleChatAssem, AFwS229S0000000_2.get$arr$(664));
        if (chatFeatureListConf.componentEnable(EnumC1660706er.B2C_AUTO_REPLY.getId())) {
            assembler.vQ2(singleChatAssem, AFwS229S0000000_2.get$arr$(666));
        }
        if (C1665706ff.LIZJ.LJIIIIZZ() && !C1654606ds.LIZIZ() && c909290Zln.isMessageRequest()) {
            assembler.vQ2(singleChatAssem, AFwS229S0000000_2.get$arr$(659));
        }
        if (C123100dR.LIZ(c909290Zln.getAutoQuotedMessageContentInfoMap())) {
            assembler.vQ2(singleChatAssem, AFwS229S0000000_2.get$arr$(667));
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1670206gO(c909290Zln, null), 3);
    }
}
