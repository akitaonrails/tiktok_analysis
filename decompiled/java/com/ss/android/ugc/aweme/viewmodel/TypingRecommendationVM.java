package com.ss.android.ugc.aweme.viewmodel;

import X.AbstractC19875112pZ;
import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C01GW;
import X.C099R;
import X.C09IC;
import X.C09R3;
import X.C0I0B;
import X.C0PEM;
import X.C0XJN;
import X.C0YNP;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C141100gL;
import X.C15438062q;
import X.C1559260qg8;
import X.C1677606ha;
import X.C1807670x8n;
import X.C189200o6;
import X.C1BNE;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C447990HhV;
import X.C448000HhW;
import X.C448020HhY;
import X.C448030HhZ;
import X.C450060Hkq;
import X.C451300Hmq;
import X.C452430Hof;
import X.C452450Hoh;
import X.C452480Hok;
import X.C452501pT;
import X.C452530Hop;
import X.C452540Hoq;
import X.C452610Hox;
import X.C452680Hp4;
import X.C453550HqT;
import X.C456900Hvs;
import X.C457780HxI;
import X.C461720I8s;
import X.C463090IDz;
import X.C516501zn;
import X.C723600SZy;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1808720xAU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC346201Wa;
import X.InterfaceC450290HlD;
import X.InterfaceC452350HoX;
import X.InterfaceC452360HoY;
import X.InterfaceC452410Hod;
import X.InterfaceC452460Hoi;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.model.IMPersonalizedRecommendationParams;
import com.ss.android.ugc.aweme.model.TypingRecommendationResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class TypingRecommendationVM extends ITypingRecommendationVM implements InterfaceC452410Hod, InterfaceC452350HoX {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final /* synthetic */ C452610Hox LL = new C452610Hox();
    public final /* synthetic */ C0XJN LLILLJJLI = new C0XJN();
    public final /* synthetic */ C448030HhZ LLILLL = new C448030HhZ();
    public final /* synthetic */ C456900Hvs LLILZ = new C456900Hvs(null);
    public AnonymousClass0956 LLILZIL;
    public final C2252321DDq LLILZLL;
    public final AnonymousClass0951 LLIZ;
    public final C2252321DDq LLIZLLLIL;
    public final AnonymousClass0951 LLJ;
    public final C2252321DDq LLJI;
    public final AnonymousClass0951 LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public final AnonymousClass0951 LLJILJILJ;
    public AnonymousClass0956 LLJILLL;
    public final C1559260qg8 LLJJ;
    public IMPersonalizedRecommendationParams LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public volatile C452540Hoq LLJJJ;
    public volatile C452530Hop LLJJJIL;
    public volatile InterfaceC452460Hoi LLJJJJ;
    public volatile InterfaceC450290HlD LLJJJJJIL;
    public volatile C452680Hp4 LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TypingRecommendationVM.class, "typingRecommendationCache", "getTypingRecommendationCache()Lcom/ss/android/ugc/aweme/data/TypingRecommendationCache;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TypingRecommendationVM.class, "typingRecommendationDBCache", "getTypingRecommendationDBCache()Lcom/ss/android/ugc/aweme/data/TypingRecommendationDBCache;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TypingRecommendationVM.class, "typingRecommendStickerAnalytics", "getTypingRecommendStickerAnalytics()Lcom/ss/android/ugc/aweme/analytics/ITypingRecommendStickerAnalytics;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(TypingRecommendationVM.class, "stickerRepository", "getStickerRepository()Lcom/ss/android/ugc/aweme/im/sticker/api/repo/IMStickerRepository;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(TypingRecommendationVM.class, "popularStickerListManager", "getPopularStickerListManager()Lcom/ss/android/ugc/aweme/util/PopularStickerListManager;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public final C452680Hp4 PQ2() {
        C452680Hp4 c452680Hp4 = this.LLJJJJLIIL;
        if (c452680Hp4 == null) {
            synchronized (this) {
                c452680Hp4 = this.LLJJJJLIIL;
                if (c452680Hp4 == null) {
                    C452680Hp4 c452680Hp42 = (C452680Hp4) C1807670x8n.o();
                    this.LLJJJJLIIL = c452680Hp42;
                    return c452680Hp42;
                }
            }
        }
        return c452680Hp4;
    }

    public final InterfaceC450290HlD QQ2() {
        InterfaceC450290HlD interfaceC450290HlD = this.LLJJJJJIL;
        if (interfaceC450290HlD == null) {
            synchronized (this) {
                interfaceC450290HlD = this.LLJJJJJIL;
                if (interfaceC450290HlD == null) {
                    InterfaceC450290HlD interfaceC450290HlD2 = (InterfaceC450290HlD) C1807670x8n.LLLLLZ();
                    this.LLJJJJJIL = interfaceC450290HlD2;
                    return interfaceC450290HlD2;
                }
            }
        }
        return interfaceC450290HlD;
    }

    public final InterfaceC452460Hoi RQ2() {
        InterfaceC452460Hoi interfaceC452460Hoi = this.LLJJJJ;
        if (interfaceC452460Hoi == null) {
            synchronized (this) {
                interfaceC452460Hoi = this.LLJJJJ;
                if (interfaceC452460Hoi == null) {
                    InterfaceC452460Hoi interfaceC452460Hoi2 = (InterfaceC452460Hoi) C1807670x8n.LLLLLLL();
                    this.LLJJJJ = interfaceC452460Hoi2;
                    return interfaceC452460Hoi2;
                }
            }
        }
        return interfaceC452460Hoi;
    }

    public final InterfaceC452360HoY SQ2() {
        C452540Hoq c452540Hoq = this.LLJJJ;
        if (c452540Hoq == null) {
            synchronized (this) {
                c452540Hoq = this.LLJJJ;
                if (c452540Hoq == null) {
                    C452540Hoq c452540Hoq2 = (C452540Hoq) C1807670x8n.LJJJ();
                    this.LLJJJ = c452540Hoq2;
                    return c452540Hoq2;
                }
            }
        }
        return c452540Hoq;
    }

    public final String TQ2(String str) {
        return this.LLILLJJLI.LIZIZ(str);
    }

    @Override // X.InterfaceC452410Hod
    public final Object uy(String str, String str2, boolean z, IMPersonalizedRecommendationParams iMPersonalizedRecommendationParams, String str3, boolean z2, InterfaceC1364105Vn<? super C189200o6<TypingRecommendationResponse>> interfaceC1364105Vn) {
        Object objUy = this.LL.uy(str, str2, z, iMPersonalizedRecommendationParams, str3, z2, interfaceC1364105Vn);
        C099R.LJFF();
        return objUy;
    }

    public final C457780HxI NQ2() {
        return (C457780HxI) this.LLJJ.getValue();
    }

    public final Keva OQ2() {
        return (Keva) this.LLJJIII.getValue();
    }

    public final void VQ2() {
        this.LLILLL.LIZ.setValue(new C448020HhY(null, null, null, 0L, null, 0L, null, 255));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(18);
    }

    @Override // X.InterfaceC456690HvX
    public final C2252321DDq mk0() {
        return this.LLILZ.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final void vQ2() {
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final void wQ2() {
        this.LLJI.setValue(new C448000HhW(null, false, 15));
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final void xQ2() {
        this.LLIZLLLIL.setValue(new C447990HhV(0));
    }

    public TypingRecommendationVM() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.TRUE);
        this.LLILZLL = c2252321DDqLIZ;
        this.LLIZ = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(new C447990HhV(0));
        this.LLIZLLLIL = c2252321DDqLIZ2;
        this.LLJ = C09IC.LIZIZ(c2252321DDqLIZ2);
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(new C448000HhW(null, false, 15));
        this.LLJI = c2252321DDqLIZ3;
        this.LLJIJIL = C09IC.LIZIZ(c2252321DDqLIZ3);
        C2252321DDq c2252321DDqLIZ4 = C1BNE.LIZ(C13BV.INSTANCE);
        this.LLJILJIL = c2252321DDqLIZ4;
        this.LLJILJILJ = C09IC.LIZIZ(c2252321DDqLIZ4);
        this.LLJJ = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
        this.LLJJIII = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(710));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 870));
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final void CQ2() {
        QQ2().refreshFavouriteStickers(true, false, null);
        InterfaceC346201Wa recentStickersFlow = QQ2().getRecentStickersFlow();
        if (recentStickersFlow == null) {
            recentStickersFlow = new C516501zn(C13BV.INSTANCE, 1);
        }
        InterfaceC346201Wa favouriteStickersFlow = QQ2().getFavouriteStickersFlow();
        if (favouriteStickersFlow == null) {
            favouriteStickersFlow = new C516501zn(new C450060Hkq(), 1);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJILLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C451300Hmq(recentStickersFlow, favouriteStickersFlow, this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final void DQ2() {
        if (C141100gL.LIZ()) {
            if (OQ2().getBoolean("session_saw_show", false)) {
                boolean z = OQ2().getBoolean("session_clicked", false);
                OQ2().storeBoolean("session_saw_show", false);
                OQ2().storeBoolean("session_clicked", false);
                if (z) {
                    OQ2().storeInt("no_click_streak", 0);
                    int i = OQ2().getInt("click_streak", 0) + 1;
                    if (i >= C452450Hoh.LIZ().dynamicDelayClicksToDecrease) {
                        OQ2().storeInt("click_streak", 0);
                        LQ2(-C452450Hoh.LIZ().dynamicDelayDecreaseStepMs);
                    } else {
                        OQ2().storeInt("click_streak", i);
                    }
                } else {
                    OQ2().storeInt("click_streak", 0);
                    int i2 = OQ2().getInt("no_click_streak", 0) + 1;
                    if (i2 >= C452450Hoh.LIZ().dynamicDelayShowsToIncrease) {
                        OQ2().storeInt("no_click_streak", 0);
                        LQ2(C452450Hoh.LIZ().dynamicDelayIncreaseStepMs);
                    } else {
                        OQ2().storeInt("no_click_streak", i2);
                    }
                }
            }
            this.LLJJIJIIJIL = false;
            this.LLJJIJIL = false;
            OQ2().storeBoolean("session_saw_show", false);
            OQ2().storeBoolean("session_clicked", false);
        }
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final void EQ2() {
        if (C141100gL.LIZ() && !this.LLJJIJIL) {
            if (!this.LLJJIJIIJIL) {
                this.LLJJIJIIJIL = true;
                OQ2().storeBoolean("session_saw_show", true);
            }
            this.LLJJIJIL = true;
            OQ2().storeBoolean("session_clicked", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final void FQ2() {
        if (C141100gL.LIZ() && !this.LLJJIJIIJIL) {
            this.LLJJIJIIJIL = true;
            OQ2().storeBoolean("session_saw_show", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final AnonymousClass0951 AQ2() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final AnonymousClass0951 BQ2() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final AnonymousClass0951 yQ2() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final AnonymousClass0951 zQ2() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final void GQ2(String str) {
        this.LLJI.setValue(new C448000HhW(str, true, 9));
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final void KQ2(boolean z) {
        this.LLILZLL.setValue(Boolean.valueOf(z));
    }

    public final void LQ2(long j) {
        long j2 = C452450Hoh.LIZ().inputDelay;
        long j3 = OQ2().getLong("current_delay_ms", j2);
        long j4 = C452450Hoh.LIZ().dynamicDelayMaxMs;
        long j5 = C452450Hoh.LIZ().inputDelay;
        if (j4 >= j5) {
            j5 = j4;
        }
        long jLJFF = C13LZ.LJFF(j3, j2, j5) + j;
        long j6 = C452450Hoh.LIZ().dynamicDelayMaxMs;
        long j7 = C452450Hoh.LIZ().inputDelay;
        if (j6 >= j7) {
            j7 = j6;
        }
        OQ2().storeLong("current_delay_ms", C13LZ.LJFF(jLJFF, j2, j7));
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final void HQ2(String str, List list) {
        this.LLJI.setValue(new C448000HhW(str, list, true, true));
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final void IQ2(String str, List list) {
        this.LLIZLLLIL.setValue(new C447990HhV(list, str, true));
    }

    public static void UQ2(TypingRecommendationVM typingRecommendationVM, C448020HhY c448020HhY, String str) {
        SessionInfo sessionInfo;
        String conversationId;
        C457780HxI c457780HxINQ2;
        SessionInfo sessionInfo2;
        long jLongValue = ((Number) typingRecommendationVM.LLJJIJI.getValue()).longValue();
        C457780HxI c457780HxINQ22 = typingRecommendationVM.NQ2();
        if (c457780HxINQ22 != null && (sessionInfo = c457780HxINQ22.LL) != null && (conversationId = sessionInfo.getConversationId()) != null && (c457780HxINQ2 = typingRecommendationVM.NQ2()) != null && (sessionInfo2 = c457780HxINQ2.LL) != null) {
            int chatType = sessionInfo2.getChatType();
            List listLL = C13LP.LL(c448020HhY.LL, 10);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
            Iterator it2 = listLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(C453550HqT.LJ((StickerItem) it2.next()));
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJJJJI(arrayList), ",", null, null, 0, null, null, 62);
            typingRecommendationVM.RQ2().LIZJ(conversationId, String.valueOf(C0YNP.LJII(conversationId)), C461720I8s.LIZIZ(), C1677606ha.LIZ(chatType), strLJJLIIIJ, strLJJLIIIJ, str, jLongValue, C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM
    public final void JQ2(String str, String str2, boolean z) {
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str.length() == 0) {
            VQ2();
            C456900Hvs c456900Hvs = this.LLILZ;
            c456900Hvs.getClass();
            c456900Hvs.LIZIZ(new C452480Hok(jCurrentTimeMillis));
            return;
        }
        this.LLILZIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZ, null, new C452430Hof(this, str, z, jCurrentTimeMillis, str2, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object MQ2(int r12, java.util.List r13, X.InterfaceC1364105Vn r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewmodel.TypingRecommendationVM.MQ2(int, java.util.List, X.05Vn):java.lang.Object");
    }

    public final C448020HhY WQ2(List<StickerItem> list, String str, String str2, String str3, long j, long j2, String str4) {
        String str5;
        C448030HhZ c448030HhZ = this.LLILLL;
        InterfaceC1808720xAU interfaceC1808720xAU = c448030HhZ.LIZJ;
        if (interfaceC1808720xAU == null) {
            synchronized (c448030HhZ) {
                interfaceC1808720xAU = c448030HhZ.LIZJ;
                if (interfaceC1808720xAU == null) {
                    interfaceC1808720xAU = (InterfaceC1808720xAU) C1807670x8n.LLLLZLL();
                    c448030HhZ.LIZJ = interfaceC1808720xAU;
                }
            }
        }
        AbstractC19875112pZ<String> currentBlockIds = interfaceC1808720xAU.getCurrentBlockIds();
        C2252321DDq c2252321DDq = c448030HhZ.LIZ;
        ArrayList arrayList = new ArrayList();
        for (StickerItem stickerItem : list) {
            StickerBase stickerBase = stickerItem.stickerBase;
            if (stickerBase != null) {
                str5 = stickerBase.thirdPartyStickerId;
            } else {
                str5 = null;
            }
            if (!currentBlockIds.contains(str5)) {
                arrayList.add(stickerItem);
            }
        }
        c2252321DDq.setValue(new C448020HhY(arrayList, str, str2, j, str3, j2, str4, 2));
        return (C448020HhY) c448030HhZ.LIZIZ.getValue();
    }
}
