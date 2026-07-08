package com.ss.android.ugc.aweme.interest;

import X.AnonymousClass1180;
import X.AnonymousClass1182;
import X.C01GW;
import X.C0PEM;
import X.C1192404lW;
import X.C1227904rF;
import X.C123100dR;
import X.C1514430pVp;
import X.C194508117y;
import X.C194509117z;
import X.C20647815qu;
import X.C20648315qz;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23250099c;
import X.C326301Oj;
import X.C358501aJ;
import X.C418440Gaw;
import X.C452501pT;
import X.C814420VxA;
import X.C817503Hh;
import X.C823050WQl;
import X.C844470XAv;
import X.EnumC20654715s1;
import X.InterfaceC1563550qn3;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS33S1100000_29;
import Y.ARunnableS40S0101000_29;
import Y.ARunnableS98S0200000_29;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import com.ss.android.ugc.aweme.service.interest.IInterestReselectionService;
import com.ss.android.ugc.aweme.service.interest.model.InterestTag;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class InterestReselectionService implements IInterestReselectionService {
    public volatile AtomicInteger LIZJ;
    public volatile AtomicInteger LIZLLL;
    public int LJFF;
    public String LJI;
    public boolean LJII;
    public InterfaceC1563550qn3 LJIIL;
    public int LJIILIIL;
    public final C194508117y LJIILJJIL;
    public final C01GW LIZ = C452501pT.LIZIZ(new C1192404lW());
    public final Object LIZIZ = new Object();
    public final Set<String> LJ = new LinkedHashSet();
    public int LJIIIIZZ = -1;
    public final C194509117z LJIIIZ = C194509117z.LIZ;
    public List<InterestTag> LJIIJ = new ArrayList();
    public List<InterestTag> LJIIJJI = new ArrayList();

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final boolean LIZIZ() {
        DisplayMetrics displayMetrics;
        DisplayMetrics displayMetrics2;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(640));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360));
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        Resources resources = contextLIZ.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return false;
        }
        int i = displayMetrics.widthPixels;
        Resources resources2 = contextLIZ.getResources();
        if (resources2 == null || (displayMetrics2 = resources2.getDisplayMetrics()) == null) {
            return false;
        }
        return i <= iLIZIZ2 && displayMetrics2.heightPixels <= iLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final boolean LIZLLL() {
        int i = this.LJIILIIL;
        this.LJIILIIL = i - 1;
        return i > 0;
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final boolean LJII() {
        C194509117z.LIZ.getClass();
        long jLIZ = C1514430pVp.LIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (0 + jLIZ >= jCurrentTimeMillis || jLIZ + 259200000 <= jCurrentTimeMillis) {
            return false;
        }
        int i = this.LIZJ.get();
        this.LJIIIZ.getClass();
        if (i >= 200 || LJJII().getInt("keva_key_user_selected_interest", 0) == 1) {
            return false;
        }
        this.LJIIIZ.getClass();
        Integer num = this.LJIILJJIL.LIZ;
        return (num == null || num.intValue() < 1) && (LJJIII().isEmpty() ^ true);
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final boolean LJIILJJIL() {
        C194509117z.LIZ.getClass();
        int i = C194509117z.LIZ().startAtVv;
        return i <= 0 || this.LIZLLL.get() > i;
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final void LJIILLIIL() {
        Integer num = this.LJIILJJIL.LIZ;
        int iIntValue = num != null ? num.intValue() : 0;
        this.LJIILJJIL.LIZ = Integer.valueOf(iIntValue + 1);
        C823050WQl.LIZIZ().submit(new ARunnableS40S0101000_29(this, iIntValue, 20));
        LJJIIJZLJL("homepage_hot");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.service.interest.model.InterestTag> LJJ() {
        /*
            r7 = this;
            java.util.List<com.ss.android.ugc.aweme.service.interest.model.InterestTag> r0 = r7.LJIIJJI
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L90
            java.util.List r6 = r7.LJJIII()
            X.117y r0 = r7.LJIILJJIL
            java.util.List<java.util.List<java.lang.String>> r0 = r0.LIZIZ
            if (r0 == 0) goto L57
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L1b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r1.next()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            X.C19719612Di.LJJI(r0, r2)
            goto L1b
        L2b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r2, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L3a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
            r3.add(r0)
            goto L3a
        L50:
            java.util.Set r5 = X.C13LP.LLIIJI(r3)
            if (r5 == 0) goto L57
            goto L59
        L57:
            X.08CX r5 = X.C08CX.INSTANCE
        L59:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L8e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r6.iterator()
        L68:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.service.interest.model.InterestTag r0 = (com.ss.android.ugc.aweme.service.interest.model.InterestTag) r0
            java.lang.String r1 = r0.text
            if (r1 == 0) goto L8b
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
        L7f:
            boolean r0 = X.C13LP.LJJJJ(r0, r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L68
            r4.add(r2)
            goto L68
        L8b:
            r0 = 0
            goto L7f
        L8d:
            r6 = r4
        L8e:
            r7.LJIIJJI = r6
        L90:
            java.util.List<com.ss.android.ugc.aweme.service.interest.model.InterestTag> r0 = r7.LJIIJJI
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.interest.InterestReselectionService.LJJ():java.util.List");
    }

    public final Keva LJJII() {
        return (Keva) this.LIZ.getValue();
    }

    public final List<InterestTag> LJJIII() {
        if (this.LJIIJ.isEmpty()) {
            String string = LJJII().getString("keva_key_interest_tags", "");
            if (C123100dR.LIZ(string)) {
                try {
                    C1227904rF.LIZ.getClass();
                    this.LJIIJ = (List) C1227904rF.LIZLLL().LJIIIIZZ(string, new TypeToken<List<? extends InterestTag>>() { // from class: X.10w1
                    }.getType());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C823050WQl.LIZIZ().submit(new ARunnableS129S0100000_29(this, 54));
                }
            }
        }
        return this.LJIIJ;
    }

    public InterestReselectionService() {
        this.LIZJ = new AtomicInteger(0);
        this.LIZLLL = new AtomicInteger(0);
        int i = LJJII().getInt("keva_key_vv_counter", 0);
        int i2 = LJJII().getInt("keva_key_vv_counter_since_install", 0);
        int i3 = LJJII().getInt("keva_key_interest_card_shown_cnt", 0);
        this.LIZJ = new AtomicInteger(i);
        this.LIZLLL = new AtomicInteger(i2);
        this.LJIILJJIL = new C194508117y(Integer.valueOf(i3), new ArrayList());
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final void LIZJ() {
        LJJII().storeBoolean("keva_key_user_saw_interest", true);
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final boolean LJIJJLI() {
        List<List<String>> list;
        if (!LJII()) {
            return false;
        }
        C194509117z.LIZ.getClass();
        if (!C194509117z.LIZ().isEnable) {
            return false;
        }
        if (C194509117z.LIZ().disableFirstSession && C1514430pVp.LIZLLL().booleanValue()) {
            return false;
        }
        int i = C194509117z.LIZ().startAtVv;
        if ((i > 0 && this.LIZLLL.get() <= i) || (list = this.LJIILJJIL.LIZIZ) == null || list.size() < 4) {
            return false;
        }
        C20647815qu c20647815qu = C20647815qu.LIZ;
        C20648315qz.LIZ.getClass();
        OutreachRecordData outreachRecordData = new OutreachRecordData(EnumC20654715s1.SPECIAL_CARD.getTypeName(), "interests_reselection_card", null, "hot", C20648315qz.LJI(new Date(C20648315qz.LJII())), C20648315qz.LJFF, "");
        c20647815qu.getClass();
        boolean zLIZ = C20647815qu.LJ(outreachRecordData, false).LIZ();
        if (zLIZ) {
            this.LJIIIIZZ = this.LIZJ.get();
            return zLIZ;
        }
        LJ(-1, "homepage_hot");
        return zLIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final String LJJI() {
        String string = LJJII().getString("keva_key_interest_card_music_url", "");
        if (string.length() != 0) {
            return string;
        }
        this.LJIIIZ.getClass();
        return C194509117z.LIZ().bgmUrl;
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final C194508117y LJIILL() {
        return this.LJIILJJIL;
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final boolean LJIIZILJ() {
        return this.LJII;
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final Set<String> LJIL() {
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final int LJJIFFI() {
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final void LIZ(C194508117y c194508117y) {
        List<List<String>> list = c194508117y.LIZIZ;
        this.LJIILJJIL.LIZIZ = list;
        if (list != null) {
            int size = list.size();
            this.LJIIIZ.getClass();
            if (size == 4) {
                LJJIIJ("homepage_hot");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final void LJI(String str) {
        C823050WQl.LIZIZ().submit(new ARunnableS33S1100000_29(this, str, 1));
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final void LJIIIIZZ(int i) {
        this.LJFF = i;
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final void LJIIIZ(InterfaceC1563550qn3 interfaceC1563550qn3) {
        if (this.LJIIL == interfaceC1563550qn3) {
            this.LJIIL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final void LJIIJ(String str) {
        C823050WQl.LIZIZ().submit(new ARunnableS33S1100000_29(this, str, 2));
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final void LJIILIIL(boolean z) {
        if (z) {
            LJJII().storeInt("keva_key_user_selected_interest", -1);
            InterfaceC1563550qn3 interfaceC1563550qn3 = this.LJIIL;
            if (interfaceC1563550qn3 != null) {
                interfaceC1563550qn3.fi();
            }
            this.LJIIL = null;
            return;
        }
        LJJII().storeInt("keva_key_user_selected_interest", 1);
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final void LJIJ(boolean z) {
        this.LJII = z;
        this.LJIILIIL = 1;
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final void LJIJI(List<InterestTag> list) {
        C823050WQl.LIZIZ().submit(new ARunnableS98S0200000_29(list, this, 20));
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final void LJIJJ(InterfaceC1563550qn3 interfaceC1563550qn3) {
        this.LJIIL = interfaceC1563550qn3;
        if (LJJII().getInt("keva_key_user_selected_interest", 0) == -1) {
            interfaceC1563550qn3.fi();
            this.LJIIL = null;
        }
    }

    public final void LJJIIJ(String str) {
        AnonymousClass1182.LIZ.getClass();
        AnonymousClass1180 anonymousClass1180 = new AnonymousClass1180("consecutive_4_skips");
        anonymousClass1180.LIZ.LJFF("enter_from", str);
        C20684815ws.LJIILLIIL("consecutive_4_skips", anonymousClass1180.LIZ.LIZ);
    }

    public final void LJJIIJZLJL(String str) {
        AnonymousClass1182 anonymousClass1182 = AnonymousClass1182.LIZ;
        int i = this.LJIIIIZZ;
        int i2 = this.LIZJ.get();
        anonymousClass1182.getClass();
        AnonymousClass1180 anonymousClass1180 = new AnonymousClass1180("show_interest_reselection");
        anonymousClass1180.LIZ.LJFF("enter_from", str);
        anonymousClass1180.LIZ.LIZJ(i, "vv_sequence_expected");
        anonymousClass1180.LIZ.LIZJ(i2, "vv_sequence_actual");
        anonymousClass1180.LIZ.LIZJ(i2 - i, "vv_sequence_diff");
        C20684815ws.LJIILLIIL("show_interest_reselection", anonymousClass1180.LIZ.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final void LJ(int i, String str) {
        int iIntValue;
        AnonymousClass1182 anonymousClass1182 = AnonymousClass1182.LIZ;
        Integer numValueOf = Integer.valueOf(i);
        anonymousClass1182.getClass();
        AnonymousClass1180 anonymousClass1180 = new AnonymousClass1180("fail_interest_reselection");
        anonymousClass1180.LIZ.LJFF("enter_from", str);
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        anonymousClass1180.LIZ.LIZJ(iIntValue, "error_code");
        C20684815ws.LJIILLIIL("fail_interest_reselection", anonymousClass1180.LIZ.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final void LJIIL(List list, AFwS273S0000000_29 aFwS273S0000000_29) {
        C358501aJ c358501aJ = C358501aJ.LIZ;
        AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(aFwS273S0000000_29, 660);
        c358501aJ.getClass();
        if (C358501aJ.LIZIZ != null) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C326301Oj(list, null, awS608S0100000_29), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final void LJFF(int i, String str, String str2) {
        int iIntValue;
        AnonymousClass1182 anonymousClass1182 = AnonymousClass1182.LIZ;
        Integer numValueOf = Integer.valueOf(i);
        anonymousClass1182.getClass();
        AnonymousClass1180 anonymousClass1180 = new AnonymousClass1180("disappear_interest_reselection");
        anonymousClass1180.LIZ.LJFF("enter_from", str);
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        anonymousClass1180.LIZ.LIZJ(iIntValue, "select_interest_cnt");
        if (str2 == null) {
            str2 = "";
        }
        anonymousClass1180.LIZ.LJFF("interests_list", str2);
        C20684815ws.LJIILLIIL("disappear_interest_reselection", anonymousClass1180.LIZ.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.service.interest.IInterestReselectionService
    public final void LJIIJJI(Aweme aweme, String str, boolean z, boolean z2) {
        if (z) {
            Log.getStackTraceString(new Throwable(String.valueOf(aweme.getDesc())));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" <==> desc: ");
            sbLIZ.append(aweme.getDesc());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (z2) {
            this.LJIIIZ.getClass();
        }
    }
}
