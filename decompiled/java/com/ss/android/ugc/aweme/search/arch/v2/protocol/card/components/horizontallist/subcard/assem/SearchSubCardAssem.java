package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.subcard.assem;

import X.C01GW;
import X.C07E5;
import X.C0Q9J;
import X.C0QSJ;
import X.C0R12;
import X.C0R45;
import X.C1010120cOQ;
import X.C13LE;
import X.C1559260qg8;
import X.C2217381BqS;
import X.C427690Gpr;
import X.C452501pT;
import X.C631370Opb;
import X.C654550Plt;
import X.C657320PqM;
import X.C673150Qan;
import X.C683220Qr2;
import X.C684120QsU;
import X.C687700QyG;
import X.C723590SZx;
import X.C723830SaL;
import X.C786410Ut5;
import X.EnumC657370PqR;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC652300PiG;
import X.InterfaceC655240Pn0;
import X.InterfaceC657240PqE;
import X.InterfaceC657350PqP;
import X.InterfaceC658510PsH;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC712990Rxx;
import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.communication.SearchHorizontalListScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.subcard.assem.SearchSubCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleClickScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchSubCardAssem<DATA extends InterfaceC657240PqE> extends ReusedUISlotAssem<SearchSubCardAssem<DATA>> implements InterfaceC712990Rxx<InterfaceC657240PqE>, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public InterfaceC655240Pn0 LLJLIL;
    public InterfaceC657240PqE LLJLL;
    public volatile InterfaceC652300PiG LLJZ;
    public InterfaceC665370Q7z LLJZIJLIL;
    public C0QSJ LLL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C654550Plt.class, null), checkSupervisorPrepared());
    public final int LLJL = R.id.u99;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10((SearchSubCardAssem) this, 243));
    public final C657320PqM LLJLLIL = new InterfaceC658510PsH(this) { // from class: X.0PqM
        public final /* synthetic */ SearchSubCardAssem<DATA> LIZ;

        @Override // X.InterfaceC658510PsH
        public final void LLZZZZ() {
        }

        @Override // X.InterfaceC658510PsH
        public final void J0() {
            InterfaceC655240Pn0 interfaceC655240Pn0 = this.LIZ.LLJLIL;
            if (interfaceC655240Pn0 != null) {
                interfaceC655240Pn0.Tu();
            }
        }

        {
            this.LIZ = this;
        }
    };
    public final String LLJLLL = "";

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchSubCardAssem.class, "searchHorizontalListAbility", "getSearchHorizontalListAbility()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/horizontallist/ability/SearchHorizontalListAbility;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eug;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchHorizontalListScope.class, SearchCLASubtitleClickScope.class});
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchHorizontalListScope.class);
        arrayList.add(SearchCLASubtitleClickScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchCLASubtitleClickScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public abstract EnumC657370PqR up();

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C654550Plt tp() {
        return (C654550Plt) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC652300PiG yp() {
        /*
            r4 = this;
            X.0PiG r0 = r4.LLJZ
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0PiG r0 = r4.LLJZ     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJZIJLIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJZIJLIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.communication.SearchHorizontalListScope> r1 = com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.communication.SearchHorizontalListScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0PiG> r0 = X.InterfaceC652300PiG.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0PiG r0 = (X.InterfaceC652300PiG) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJZ = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.subcard.assem.SearchSubCardAssem.yp():X.0PiG");
    }

    public String sp() {
        return this.LLJLLL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (tp().LLIZ) {
            C427690Gpr.LJ(LJJIJL(), tp().LLILZ);
        } else {
            C427690Gpr.LJFF(LJJIJL(), tp().LLILZ);
        }
        C786410Ut5.I7(new ACListenerS145S0100000_10(this, 79), LJJIJL());
        LJJIJL().addOnAttachStateChangeListener(new C0R45(this, 3));
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(view, (View) this, (SearchSubCardAssem<InterfaceC657240PqE>) 118));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC657240PqE interfaceC657240PqE) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: zp, reason: merged with bridge method [inline-methods] */
    public void tp(InterfaceC657240PqE interfaceC657240PqE) {
        this.LLJLL = interfaceC657240PqE;
        InterfaceC652300PiG interfaceC652300PiGYp = yp();
        if (interfaceC652300PiGYp != null) {
            interfaceC652300PiGYp.T(C631370Opb.LIZIZ(this), interfaceC657240PqE);
        }
        final Aweme aweme = interfaceC657240PqE.getAweme();
        if (!tp().LLJIJIL) {
            this.LLJLIL = null;
            return;
        }
        if ((aweme != null && aweme.isAd()) || C1010120cOQ.LJJIJ(aweme)) {
            InterfaceC655240Pn0 interfaceC655240Pn0LJIIIZ = C0R12.LIZIZ.LJIIIZ(new InterfaceC657350PqP(this, aweme) { // from class: X.0PqL
                public final View LIZ;
                public final Aweme LIZIZ;
                public final Context LIZJ;

                @Override // X.InterfaceC657350PqP
                public final ViewGroup LJIIJ() {
                    return null;
                }

                @Override // X.InterfaceC1010250cOd
                public final Aweme getAweme() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC1010250cOd
                public final Context getContext() {
                    return this.LIZJ;
                }

                {
                    this.LIZ = this.LJJIJL();
                    this.LIZIZ = aweme;
                    this.LIZJ = this.LJJIJL().getContext();
                }
            });
            this.LLJLIL = interfaceC655240Pn0LJIIIZ;
            if (interfaceC655240Pn0LJIIIZ == null) {
                return;
            }
            interfaceC655240Pn0LJIIIZ.bind();
            return;
        }
        this.LLJLIL = null;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC657240PqE interfaceC657240PqE) {
    }

    public C683220Qr2 op(C683220Qr2 c683220Qr2, InterfaceC657240PqE interfaceC657240PqE) {
        UrlModel cover;
        Aweme aweme = interfaceC657240PqE.getAweme();
        c683220Qr2.LIZJ = aweme.getTitle();
        c683220Qr2.LJFF = aweme.getAid();
        c683220Qr2.LJII = AwemeExtKt.getAuthorUid(aweme);
        Video video = aweme.getVideo();
        if (video != null) {
            cover = video.getCover();
        } else {
            cover = null;
        }
        c683220Qr2.LIZIZ = cover;
        String strSp = sp();
        c683220Qr2.LIZ = strSp;
        boolean z = C0Q9J.LIZ;
        c683220Qr2.LIZLLL = C684120QsU.LIZLLL(strSp);
        c683220Qr2.LJIILIIL = aweme;
        return c683220Qr2;
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }
}
