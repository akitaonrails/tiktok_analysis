package com.ss.android.ugc.aweme.compliance.protection.serviceimpl;

import X.AnonymousClass1668;
import X.C0SZ8;
import X.C0T4L;
import X.C0TRR;
import X.C1227904rF;
import X.C1601630rmT;
import X.C1601660rmW;
import X.C166A;
import Y.ACListenerS138S0100000_3;
import Y.ACListenerS66S1200000_34;
import android.content.Context;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.model.AmberAlertCardInfo;
import com.ss.android.ugc.aweme.compliance.api.model.PersonInfo;
import com.ss.android.ugc.aweme.compliance.api.model.PictureInfo;
import com.ss.android.ugc.aweme.compliance.api.services.amberalert.IAmberAlertService;
import com.ss.android.ugc.aweme.compliance.protection.amberalert.AmberAlertCardRequestParam;
import com.ss.android.ugc.aweme.compliance.protection.amberalert.AmberAlertStorage;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InlineLink;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS284S0000000_1;
import kotlin.jvm.internal.AwS402S0200000_1;

/* JADX INFO: loaded from: classes32.dex */
public final class AmberAlertServiceImpl implements IAmberAlertService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.amberalert.IAmberAlertService
    public final boolean LIZIZ() {
        return C1601660rmW.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.amberalert.IAmberAlertService
    public final Object LJ() {
        if (C1601630rmT.LIZ() || C1601660rmW.LIZ()) {
            return new C0TRR() { // from class: X.15ax
                @Override // X.C0TRR
                public final int LIZ() {
                    throw null;
                }

                @Override // X.C0TRR
                public final int LIZIZ() {
                    return 0;
                }

                @Override // X.C0TRR
                public final List<CardTypeRequest> LIZJ(C0TRR c0trr, FeedCardInsertData feedCardInsertData, List<CardInsertResultInfo> list) {
                    AmberAlertStorage amberAlertStorage;
                    String str;
                    String str2;
                    CardInsertResultInfo next;
                    if (list != null) {
                        Iterator<CardInsertResultInfo> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (next.cardType == 12) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        CardInsertResultInfo cardInsertResultInfo = next;
                        if (cardInsertResultInfo != null && cardInsertResultInfo.cardInsertStatus == 20000) {
                            Keva keva = C20548715av.LIZ;
                            C20548715av.LIZJ.getClass();
                            C20548715av.LIZJ = new C20548815aw(false, null);
                            return null;
                        }
                    }
                    if (!C1601630rmT.LIZ() && !C1601660rmW.LIZ()) {
                        return null;
                    }
                    Keva keva2 = C20548715av.LIZ;
                    C20548815aw c20548815aw = C20548715av.LIZJ;
                    if (!c20548815aw.LIZ || (amberAlertStorage = c20548815aw.LIZIZ) == null || (str = amberAlertStorage.alertId) == null || str.length() == 0) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    AmberAlertStorage amberAlertStorage2 = c20548815aw.LIZIZ;
                    if (amberAlertStorage2 == null || (str2 = amberAlertStorage2.alertId) == null) {
                        str2 = "";
                    }
                    arrayList.add(new CardTypeRequest(12, C08JS.LIZLLL(new AmberAlertCardRequestParam(str2)), ""));
                    return arrayList;
                }
            };
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.amberalert.IAmberAlertService
    public final boolean LIZ(Aweme aweme) {
        String cardInsertStatus;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        List<PersonInfo> list;
        if (aweme == null || aweme.getCardInsertInfo() == null || aweme.getCardInsertInfo().getCardType() != 12) {
            return false;
        }
        CardInsertInfo cardInsertInfo = aweme.getCardInsertInfo();
        if (cardInsertInfo != null && (cardInsertStatus = cardInsertInfo.getCardInsertStatus()) != null) {
            try {
                C1227904rF.LIZ.getClass();
                AmberAlertCardInfo amberAlertCardInfo = (AmberAlertCardInfo) C1227904rF.LIZIZ(cardInsertStatus, AmberAlertCardInfo.class);
                if (amberAlertCardInfo != null) {
                    if (C1601660rmW.LIZ()) {
                        List<PersonInfo> list2 = amberAlertCardInfo.children;
                        if (list2 != null) {
                            Iterator<PersonInfo> it2 = list2.iterator();
                            boolean z = false;
                            while (it2.hasNext()) {
                                List<String> list3 = it2.next().images;
                                if (list3 == null || list3.isEmpty()) {
                                    z = true;
                                }
                            }
                            if (!z && (str5 = amberAlertCardInfo.alertId) != null && str5.length() != 0 && (str6 = amberAlertCardInfo.source) != null && str6.length() != 0 && (str7 = amberAlertCardInfo.summary) != null && str7.length() != 0 && (str8 = amberAlertCardInfo.detailPageLink) != null && str8.length() != 0 && (str9 = amberAlertCardInfo.contentPb) != null && str9.length() != 0 && (list = amberAlertCardInfo.children) != null && !list.isEmpty()) {
                                return false;
                            }
                        }
                    } else {
                        if (!C1601630rmT.LIZ()) {
                            return false;
                        }
                        String str10 = amberAlertCardInfo.alertId;
                        if (str10 != null && str10.length() != 0 && (str = amberAlertCardInfo.title) != null && str.length() != 0 && (str2 = amberAlertCardInfo.moreDetailsText) != null && str2.length() != 0 && (str3 = amberAlertCardInfo.amberAlertLink) != null && str3.length() != 0 && (str4 = amberAlertCardInfo.callText) != null && str4.length() != 0) {
                            return false;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.amberalert.IAmberAlertService
    public final View LIZLLL(Context context) {
        if (C1601660rmW.LIZ()) {
            return new C166A(context, null, 0);
        }
        return new AnonymousClass1668(context, null, 0);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.amberalert.IAmberAlertService
    public final Object LIZJ(View view, Fragment fragment) {
        return new C0T4L(view, fragment);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.amberalert.IAmberAlertService
    public final Object LJFF(final View view, final Fragment fragment) {
        return new C0SZ8(view, fragment) { // from class: X.1667
            public final View LL;
            public final Fragment LLILLJJLI;
            public Aweme LLILLL;

            @Override // X.C0SZ8
            public final /* synthetic */ void A(boolean z, C1AV2 c1av2) {
            }

            @Override // X.C0SZ8
            public final void Ar(Aweme aweme) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void B0(boolean z) {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ BaseFeedPlayerView E() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void F0(String str) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ ImageView F2() {
                return null;
            }

            @Override // X.C0SZ8
            public final void G() {
            }

            @Override // X.C0SZ8
            public final void K1(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void K8(View.OnTouchListener onTouchListener) {
            }

            @Override // X.C0SZ8
            public final InterfaceC689860R4e K9() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void L0(int i, Aweme aweme) {
            }

            @Override // X.C0SZ8
            public final void LJIIJ() {
            }

            @Override // X.C0SZ8
            public final void LJIIZILJ(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJIJJ() {
                throw null;
            }

            @Override // X.C0SZ8, X.C0SZA
            public final InterfaceC739930T0t LJIJJLI() {
                return null;
            }

            @Override // X.C0SZ8
            public final void LJJIFFI(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJJIIJ() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ C0SZ8 LJJIJIL(String str) {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJJIL(C0R6M c0r6m) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJJIZ(C0RHA c0rha) {
            }

            @Override // X.C0SZ8
            public final void LJJJJJ(long j) {
            }

            @Override // X.C0SZ8
            public final void LJJJLIIL(int i, long j) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJJJLZIJ(C1365850leB c1365850leB) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LJJLIIIJ() {
                return true;
            }

            @Override // X.C0SZ8
            public final void LJLIIIL(int i) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJLJLLL(int i, int i2, int i3, String str, String str2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJLLILLLL() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJZI(boolean z, boolean z2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLFF() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLFII(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLFZ(Object obj) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLIIII(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLIIIJ(C0SYH c0syh) {
            }

            @Override // X.C0SZ8
            public final void LLIIL(String str) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLIILZL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLIIZ() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLILII(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLILLL(C1365860leC c1365860leC) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLIZLLLIL() {
            }

            @Override // X.C0SZ8
            public final void LLJI(C697110RWb c697110RWb) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJ(int i, boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJIJIIJIL(String str) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJIJIL() {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJJIL() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJJJ(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJJJJIL(boolean z, boolean z2) {
            }

            @Override // X.C0SZ8
            public final void LLJL(boolean z, boolean z2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJLIL(Long l) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJLILLLLZIIL(int i, String str, String str2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJLL() {
            }

            @Override // X.C0SZ8
            public final void LLJLLIL(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ C0SZ8 LLJLLL() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLF() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLFFI(int i, String str, String str2) {
            }

            @Override // X.C0SZ8
            public final void LLLI(int i) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLIIII() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLILZLLLI() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ View LLLJIL() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLLLIIIILLL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLLIIL() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLLIILL(int i, String str) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLLJ(int i, String str) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ C584270Mvp LLLLLJIL() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLLLLLIL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLLLLJ(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLLLZL() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ View LLLLZLLIL() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLLZ() {
                return true;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLLZIL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLZLZ(Map map) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLLZZIL() {
                return true;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLZ() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLZLI() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLZLLLL(int i) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ View LLZZ(String str) {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLZZJLIL(View view2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLZZZIL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void M(C0REZ c0rez) {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void M0(C690190R5l c690190R5l) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean Nv() {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ View Qg(String str, boolean z) {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void Rl(C035D c035d) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void Y0(int i, int i2, long j, long j2, long j3, long j4, long j5) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void Z(int i, boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ C583360MuM Z0() {
                return null;
            }

            @Override // X.C0SZ8
            public final void e1() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void ev() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void g1(int i) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void h0(Aweme aweme) {
            }

            @Override // X.C0SZ8
            public final void i0() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void k1(String str, boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean l() {
                return true;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean l1() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void o(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean o1() {
                return false;
            }

            @Override // X.C0SZ8
            public final void onDestroyView() {
            }

            @Override // X.C0SZ8
            public final void onPageSelected(int i) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void onScrollEnd() {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void p(int i) {
            }

            @Override // X.C0SZ8
            public final void q(String str, String str2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ View.OnTouchListener q5() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void q7(float f, int i, int i2, int i3) {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void qi() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void s0() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void u1() {
            }

            @Override // X.C0SZ8
            public final void unBind() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void uq(C1365870leD c1365870leD) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void v(long j, long j2, long j3, long j4, int i, long j5, int i2) {
            }

            @Override // X.C0SZ8
            public final InterfaceC583650Mup x3() {
                return null;
            }

            @Override // X.C0SZ8
            public final int getAwemeType() {
                Aweme aweme = this.LLILLL;
                if (aweme != null) {
                    return aweme.getAwemeType();
                }
                return 0;
            }

            @Override // X.C0SZ8
            public final void onPause() {
                AnonymousClass1668 anonymousClass1668;
                View view2 = this.LL;
                if (!(view2 instanceof AnonymousClass1668) || (anonymousClass1668 = (AnonymousClass1668) view2) == null || anonymousClass1668.LLJJ) {
                    return;
                }
                C2344009Gk c2344009GkE0 = anonymousClass1668.e0();
                c2344009GkE0.LIZLLL(System.currentTimeMillis() - anonymousClass1668.LLJJI, "time_spent");
                C20684815ws.LJIILLIIL("tt_amber_alert_dismiss", c2344009GkE0.LIZ);
                anonymousClass1668.LLJJ = true;
            }

            @Override // X.C0SZ8
            public final void onResume() {
                AnonymousClass1668 anonymousClass1668;
                View view2 = this.LL;
                if (!(view2 instanceof AnonymousClass1668) || (anonymousClass1668 = (AnonymousClass1668) view2) == null) {
                    return;
                }
                anonymousClass1668.LLJJI = System.currentTimeMillis();
            }

            @Override // X.C0SZ8, X.C0SZA
            public final Aweme LJIIIIZZ() {
                return getAweme();
            }

            @Override // X.C0SZ8
            public final Aweme hm() {
                return getAweme();
            }

            @Override // X.C0SZ8
            public final C0SKK LJLLLL() {
                return C0SKK.INITIALIZED;
            }

            @Override // X.C0SZ8
            public final Aweme getAweme() {
                return this.LLILLL;
            }

            @Override // X.C0SZ8
            public final void LJI(Aweme aweme) {
                AnonymousClass1668 anonymousClass1668;
                AmberAlertCardInfo amberAlertCardInfo;
                boolean z;
                Context context;
                String cardInsertStatus;
                this.LLILLL = aweme;
                if (aweme == null) {
                    return;
                }
                View view2 = this.LL;
                if ((view2 instanceof AnonymousClass1668) && (anonymousClass1668 = (AnonymousClass1668) view2) != null) {
                    Fragment fragment2 = this.LLILLJJLI;
                    CardInsertInfo cardInsertInfo = aweme.getCardInsertInfo();
                    if (cardInsertInfo != null && (cardInsertStatus = cardInsertInfo.getCardInsertStatus()) != null) {
                        try {
                            amberAlertCardInfo = (AmberAlertCardInfo) C08JS.LIZIZ().LJII(cardInsertStatus, AmberAlertCardInfo.class);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            amberAlertCardInfo = null;
                        }
                    } else {
                        amberAlertCardInfo = null;
                    }
                    anonymousClass1668.LLJILJILJ = amberAlertCardInfo;
                    if (amberAlertCardInfo != null) {
                        TuxTextView tuxTextView = anonymousClass1668.LLILLJJLI;
                        if (tuxTextView != null) {
                            tuxTextView.setText(amberAlertCardInfo.title);
                        }
                        List<PictureInfo> list = amberAlertCardInfo.pictures;
                        if (list != null && !list.isEmpty()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            TuxIconView tuxIconView = anonymousClass1668.LL;
                            if (tuxIconView != null) {
                                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                            }
                            View view3 = anonymousClass1668.LLILLL;
                            if (view3 != null) {
                                C786410Ut5.LJLLLLLL(8, view3);
                            }
                        } else {
                            TuxIconView tuxIconView2 = anonymousClass1668.LL;
                            if (tuxIconView2 != null) {
                                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                            }
                            View view4 = anonymousClass1668.LLILLL;
                            if (view4 != null) {
                                C786410Ut5.LJLLLLLL(0, view4);
                            }
                            AnonymousClass1668.h0(anonymousClass1668.LLILZ, anonymousClass1668.LLILZIL, anonymousClass1668.LLILZLL, (PictureInfo) ListProtector.get(list, 0));
                            if (list.size() == 1) {
                                View view5 = anonymousClass1668.LLIZ;
                                if (view5 != null) {
                                    C786410Ut5.LJLLLLLL(4, view5);
                                }
                                View view6 = anonymousClass1668.LLILZ;
                                if (view6 != null) {
                                    context = view6.getContext();
                                } else {
                                    context = null;
                                }
                                int iLJIIIIZZ = C14KQ.LJIIIIZZ(context);
                                int iLIZJ = ((iLJIIIIZZ - ((int) C12ES.LIZJ(64.0f, context))) - ((iLJIIIIZZ - ((int) C12ES.LIZJ(74.0f, context))) / 2)) / 2;
                                View view7 = anonymousClass1668.LLILZ;
                                if (view7 != null) {
                                    C786410Ut5.Jc(view7, iLIZJ);
                                }
                            } else {
                                AnonymousClass1668.h0(anonymousClass1668.LLIZ, anonymousClass1668.LLIZLLLIL, anonymousClass1668.LLJ, (PictureInfo) ListProtector.get(list, 1));
                                View view8 = anonymousClass1668.LLILZ;
                                if (view8 != null) {
                                    C786410Ut5.Jc(view8, 0.0f);
                                }
                            }
                        }
                        RecyclerView recyclerView = anonymousClass1668.LLJI;
                        if (recyclerView != null) {
                            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                            ArrayList arrayList = new ArrayList();
                            List<TextWithInlineLink> list2 = amberAlertCardInfo.descriptions;
                            if (list2 != null && !list2.isEmpty()) {
                                arrayList.addAll(list2);
                            }
                            if (C123100dR.LIZ(amberAlertCardInfo.disclaimer)) {
                                arrayList.add(new TextWithInlineLink(amberAlertCardInfo.disclaimer, null, 2, null));
                            }
                            recyclerView.setAdapter(new AbstractC21673619ry<C814203Ga>(arrayList) { // from class: X.03GY
                                public final List<TextWithInlineLink> LL;

                                @Override // X.AbstractC21673619ry
                                public final int getItemCount() {
                                    return this.LL.size();
                                }

                                {
                                    this.LL = arrayList;
                                }

                                @Override // X.AbstractC21673619ry
                                public final int getItemViewType(int i) {
                                    if (i == this.LL.size() - 1) {
                                        return 1;
                                    }
                                    return 0;
                                }

                                @Override // X.AbstractC21673619ry
                                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                                    C814203Ga c814203Ga = (C814203Ga) viewHolder;
                                    TextWithInlineLink textWithInlineLink = (TextWithInlineLink) ListProtector.get(this.LL, i);
                                    Context context2 = c814203Ga.itemView.getContext();
                                    AFwS284S0000000_1 aFwS284S0000000_1 = AFwS284S0000000_1.get$arr$(30);
                                    C444940Hca c444940Hca = new C444940Hca();
                                    c444940Hca.LIZLLL(1);
                                    c444940Hca.LIZIZ = false;
                                    c444940Hca.LIZIZ(43);
                                    ArrayList arrayList2 = new ArrayList();
                                    List<InlineLink> list3 = textWithInlineLink.links;
                                    if (list3 != null) {
                                        for (InlineLink inlineLink : list3) {
                                            c444940Hca.LIZJ = inlineLink.text;
                                            c444940Hca.LJIIIIZZ = new AwS402S0200000_1(aFwS284S0000000_1, inlineLink, 95);
                                            arrayList2.add(c444940Hca.LIZ(context2));
                                        }
                                    }
                                    String str = textWithInlineLink.text;
                                    if (str == null) {
                                        str = "";
                                    }
                                    Spannable[] spannableArr = (Spannable[]) arrayList2.toArray(new Spannable[0]);
                                    c814203Ga.LL.setText(C10KE.LIZIZ(str, (Spannable[]) Arrays.copyOf(spannableArr, spannableArr.length)));
                                }

                                @Override // X.AbstractC21673619ry
                                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                                    int i2;
                                    if (i == 1) {
                                        i2 = R.layout.bf1;
                                    } else {
                                        i2 = R.layout.bf0;
                                    }
                                    C814203Ga c814203Ga = new C814203Ga(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i2, viewGroup, false));
                                    try {
                                        View view9 = c814203Ga.itemView;
                                        if (view9 != null) {
                                            view9.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                                        }
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                    }
                                    c814203Ga.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                                    try {
                                        if (c814203Ga.itemView.getParent() != null) {
                                            try {
                                                SettingsManager.LIZLLL().getClass();
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                            if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                                stringBuffer.append(C814203Ga.class.getName());
                                                stringBuffer.append(" parent ");
                                                stringBuffer.append(viewGroup.getClass().getName());
                                                stringBuffer.append(" viewType ");
                                                stringBuffer.append(i);
                                                C1AF0.LIZJ(stringBuffer.toString());
                                                ViewGroup viewGroup2 = (ViewGroup) c814203Ga.itemView.getParent();
                                                if (viewGroup2 != null) {
                                                    C786410Ut5.LJJJLZIJ(c814203Ga.itemView, viewGroup2);
                                                }
                                            }
                                        }
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        C2081408Dk.LIZ(e2);
                                        C2344809Gs.LIZ(e2);
                                    }
                                    C20612085q.LIZ = C814203Ga.class.getName();
                                    return c814203Ga;
                                }
                            });
                        }
                        String str = amberAlertCardInfo.moreDetailsText;
                        String str2 = amberAlertCardInfo.amberAlertLink;
                        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                            C197039127h c197039127h = anonymousClass1668.LLJIJIL;
                            if (c197039127h != null) {
                                C786410Ut5.LLLLLLJ(c197039127h, 0);
                                c197039127h.setText(str);
                                C786410Ut5.U8(c197039127h, new ACListenerS66S1200000_34(anonymousClass1668, c197039127h, str2, 1));
                            }
                        } else {
                            C197039127h c197039127h2 = anonymousClass1668.LLJIJIL;
                            if (c197039127h2 != null) {
                                C786410Ut5.LLLLLLJ(c197039127h2, 8);
                            }
                        }
                        String str3 = amberAlertCardInfo.callText;
                        if (str3 != null && str3.length() != 0) {
                            C197039127h c197039127h3 = anonymousClass1668.LLJILJIL;
                            if (c197039127h3 != null) {
                                C786410Ut5.LLLLLLJ(c197039127h3, 0);
                                c197039127h3.setText(str3);
                                C786410Ut5.U8(c197039127h3, new ACListenerS138S0100000_3(anonymousClass1668, 16));
                            }
                        } else {
                            C197039127h c197039127h4 = anonymousClass1668.LLJILJIL;
                            if (c197039127h4 != null) {
                                C786410Ut5.LLLLLLJ(c197039127h4, 8);
                            }
                        }
                    }
                    anonymousClass1668.LLJJIII = C0T1R.LIZLLL(fragment2);
                }
            }

            @Override // X.C0SZ8
            public final void LJJIJIIJIL(int i) {
                AnonymousClass1668 anonymousClass1668;
                String aid;
                C0SZ8 c0sz8D;
                Aweme aweme;
                AmberAlertCardInfo amberAlertCardInfo;
                View view2 = this.LL;
                if ((view2 instanceof AnonymousClass1668) && (anonymousClass1668 = (AnonymousClass1668) view2) != null) {
                    if (!anonymousClass1668.LLJILLL && (amberAlertCardInfo = anonymousClass1668.LLJILJILJ) != null) {
                        Keva keva = C20548715av.LIZ;
                        C20548715av.LIZIZ(amberAlertCardInfo.lastUpdateTime, amberAlertCardInfo.alertId);
                        anonymousClass1668.LLJILLL = true;
                    }
                    C2344009Gk c2344009GkE0 = anonymousClass1668.e0();
                    IViewPagerComponentAbility iViewPagerComponentAbility = anonymousClass1668.LLJJIII;
                    if (iViewPagerComponentAbility == null || (c0sz8D = iViewPagerComponentAbility.D()) == null || (aweme = c0sz8D.getAweme()) == null || (aid = aweme.getAid()) == null) {
                        aid = "";
                    }
                    c2344009GkE0.LJIIIIZZ("previous_video_id", aid);
                    C20684815ws.LJIILLIIL("tt_amber_alert_view", c2344009GkE0.LIZ);
                    anonymousClass1668.LLJJI = System.currentTimeMillis();
                }
            }

            @Override // X.C0SZ8
            public final void h(boolean z) {
                AnonymousClass1668 anonymousClass1668;
                View view2 = this.LL;
                if ((view2 instanceof AnonymousClass1668) && (anonymousClass1668 = (AnonymousClass1668) view2) != null) {
                    C2344009Gk c2344009GkE0 = anonymousClass1668.e0();
                    c2344009GkE0.LIZLLL(System.currentTimeMillis() - anonymousClass1668.LLJJI, "time_spent");
                    C20684815ws.LJIILLIIL("tt_amber_alert_dismiss", c2344009GkE0.LIZ);
                    anonymousClass1668.LLJJ = true;
                }
            }

            {
                this.LL = view;
                this.LLILLJJLI = fragment;
            }

            @Override // X.C0SZ8
            public final void LJJJJ(int i, Aweme aweme) {
                LJI(aweme);
            }
        };
    }
}
