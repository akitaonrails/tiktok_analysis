package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem;

import X.C01GW;
import X.C05OG;
import X.C0JBW;
import X.C0QSJ;
import X.C1202940hPQ;
import X.C1202960hPS;
import X.C1383370m6R;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LE;
import X.C1487160onq;
import X.C1488130opP;
import X.C1488140opQ;
import X.C1500060p8e;
import X.C15YD;
import X.C197039127h;
import X.C20542715Zx;
import X.C20543315a3;
import X.C20543415a4;
import X.C20544115aB;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C297270Bkz;
import X.C339190DRl;
import X.C452501pT;
import X.C497820Jfg;
import X.C687700QyG;
import X.C786410Ut5;
import X.EnumC20537615Xy;
import X.EnumC20538815Yk;
import X.EnumC20542815Zy;
import X.EnumC20542915Zz;
import X.EnumC995500c0q;
import X.InterfaceC1146704e9;
import X.InterfaceC1484830ok5;
import X.InterfaceC20544315aD;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.model.DailyScreenTimeMeditation;
import com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManagerV2;
import com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent;
import com.ss.android.ugc.feed.platform.panel.RootPanelScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS137S0101000_31;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS575S0100000_31;
import wh6.AbS710S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class STMDailyScreenTimeAssem extends BasePanelUISlotComponent implements InterfaceC1146704e9 {
    public static final C1500060p8e LLJZIJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public static final Map<EnumC20542815Zy, C20543315a3> LLLF;
    public static final EnumC20538815Yk LLLFF;
    public FrameLayout LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public C20544115aB LLJJJIL;
    public C197039127h LLJJJJ;
    public boolean LLJLIL;
    public volatile SleepHourComponentAbility LLJLLIL;
    public InterfaceC665370Q7z LLJLLL;
    public C0QSJ LLJZ;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(63));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(123));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS567S0100000_23(this, 77));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(122));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS567S0100000_23(this, 78));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS567S0100000_23(this, 79));
    public final C01GW LLJLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(121));

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0p8e] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(STMDailyScreenTimeAssem.class, "stmComponentAbility", "getStmComponentAbility()Lcom/ss/android/ugc/aweme/compliance/api/services/digitalwellbeing/SleepHourComponentAbility;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJZIJLIL = new Object() { // from class: X.0p8e
        };
        LLLF = C2097608Jq.LJIIIIZZ(new Pair(EnumC20542815Zy.BREATH, new C20543315a3(2131830467, "https://sf16-va.tiktokcdn-us.com/obj/eden-va2/ajbkvyw_zuw/ljhwZthlaukjlkulzlp/digital_wellbeing/daily_screen_time/type_1_breath.mp4", "6817199110869747713")), new Pair(EnumC20542815Zy.WATER, new C20543315a3(2131830470, "https://sf16-va.tiktokcdn-us.com/obj/eden-va2/ajbkvyw_zuw/ljhwZthlaukjlkulzlp/digital_wellbeing/daily_screen_time/type_2_water.mp4", "6817473735168100353")), new Pair(EnumC20542815Zy.RESET, new C20543315a3(2131830471, "https://sf16-va.tiktokcdn-us.com/obj/eden-va2/ajbkvyw_zuw/ljhwZthlaukjlkulzlp/digital_wellbeing/daily_screen_time/type_3_reset.mp4", "6817333094790465538")), new Pair(EnumC20542815Zy.STRETCH, new C20543315a3(2131830476, "https://sf16-va.tiktokcdn-us.com/obj/eden-va2/ajbkvyw_zuw/ljhwZthlaukjlkulzlp/digital_wellbeing/daily_screen_time/type_4_stretch.mp4", "6954081918430218242")));
        LLLFF = EnumC20538815Yk.DAILY_SCREEN_TIME;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bcy;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{RootPanelScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RootPanelScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final InterfaceC1484830ok5 kp() {
        return (InterfaceC1484830ok5) this.LLJJJJJIL.getValue();
    }

    public final DailyScreenTimeMeditation mp() {
        return (DailyScreenTimeMeditation) this.LLJJJJLIIL.getValue();
    }

    public final void tp() {
        long jLIZ = C20543415a4.LIZ((C20543415a4) this.LLJLL.getValue());
        C20543415a4 c20543415a4 = (C20543415a4) this.LLJLL.getValue();
        c20543415a4.getClass();
        c20543415a4.LIZ = System.currentTimeMillis();
        if (jLIZ <= 0) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("feature", "daily_screentime_limit_v2");
        c2344009Gk.LIZLLL(jLIZ, "duration");
        c2344009Gk.LJIIIIZZ("current_page", lp());
        C20684815ws.LJIILLIIL("wellbeing_duration", c2344009Gk.LIZ);
    }

    public final C15YD ip() {
        return C297270Bkz.LIZ() ? FamilyPairingManagerV2.LIZ : FamilyPairingManager.LIZ;
    }

    public final String lp() {
        EnumC20542815Zy enumC20542815Zy = mp().type;
        if (enumC20542815Zy == null) {
            return "";
        }
        int i = C20542715Zx.LIZJ[enumC20542815Zy.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i == 4 ? "daily_screentime_limit_reset" : "" : "daily_screentime_limit_drink" : "daily_screentime_limit_stretch" : "daily_screentime_limit_breathe";
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        kp().pause();
        tp();
        kp().release();
        C1202960hPS.LIZ.getClass();
        C1202960hPS.LIZLLL("daily_screen_time", "sleep_hours", "video", "stop", "");
        C1202960hPS.LIZLLL("daily_screen_time", "sleep_hours", "audio", "stop", "");
        C05OG.LIZ.getClass();
        C05OG.LIZIZ();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        kp().pause();
        C1202960hPS.LIZ.getClass();
        C1202960hPS.LIZLLL("daily_screen_time", "sleep_hours", "video", "pause", "");
        C1202960hPS.LIZLLL("daily_screen_time", "sleep_hours", "audio", "pause", "");
        tp();
        C05OG.LIZ.getClass();
        C05OG.LIZ();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (C0JBW.LIZLLL(this)) {
            hp(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[Catch: all -> 0x0047, PHI: r1
      0x0039: PHI (r1v11 X.0QSJ) = (r1v10 X.0QSJ), (r1v16 X.0QSJ) binds: [B:8:0x001c, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0016, B:7:0x001a, B:9:0x001e, B:11:0x0022, B:12:0x0028, B:16:0x0041, B:17:0x0043, B:15:0x0039), top: B:56:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ap(X.EnumC995500c0q r7) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.STMDailyScreenTimeAssem.Ap(X.0c0q):void");
    }

    public final void hp(boolean z) {
        boolean z2;
        String str;
        C20543315a3 c20543315a3;
        String str2;
        EnumC20542815Zy enumC20542815Zy;
        C20544115aB c20544115aB;
        boolean z3 = false;
        if (((Number) this.LLJL.getValue()).intValue() != 0 && (((Number) this.LLJL.getValue()).intValue() <= 0 || ((c20544115aB = this.LLJJJIL) != null && c20544115aB.LLLIILIL))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.LLJLIL && !z) {
            z3 = true;
        }
        if (z2 && z3) {
            Ap(EnumC995500c0q.RETURN_IN_CURRENT_LIMIT);
            return;
        }
        C20543315a3 c20543315a32 = (C20543315a3) this.LLJJL.getValue();
        if (c20543315a32 == null || (str = c20543315a32.LIZJ) == null || (c20543315a3 = (C20543315a3) this.LLJJL.getValue()) == null || (str2 = c20543315a3.LIZLLL) == null || (enumC20542815Zy = mp().type) == null) {
            return;
        }
        kp().LJ(C1488130opP.LIZ(new C1488140opQ(true, Collections.singletonList(str), 0, enumC20542815Zy.getS(), 0, 0, false, 120)));
        C1202960hPS.LIZ.getClass();
        C1202960hPS.LIZLLL("daily_screen_time", "sleep_hours", "video", "play", "beginning");
        C20543415a4 c20543415a4 = (C20543415a4) this.LLJLL.getValue();
        c20543415a4.getClass();
        c20543415a4.LIZ = System.currentTimeMillis();
        C05OG c05og = C05OG.LIZ;
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(348);
        c05og.getClass();
        C05OG.LIZJ(str2, aFwS221S0000000_31, "daily_screen_time", "sleep_hours");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        kp().pause();
        C1202960hPS.LIZ.getClass();
        C1202960hPS.LIZLLL("daily_screen_time", "sleep_hours", "video", "pause", "");
        C1202960hPS.LIZLLL("daily_screen_time", "sleep_hours", "audio", "pause", "");
        tp();
        C05OG.LIZ.getClass();
        C05OG.LIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        hp(true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        final String strLIZJ;
        String strLIZJ2;
        String strLIZJ3;
        if (getContext() == null) {
            return;
        }
        super.onViewCreated(view);
        new AwS575S0100000_31(this, 346);
        this.LLJJJIL = (C20544115aB) view.findViewById(R.id.d6g);
        this.LLJJIJIL = (TuxTextView) view.findViewById(R.id.title);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.wlq);
        this.LLJJIJIIJIL = (FrameLayout) view.findViewById(R.id.wq8);
        this.LLJJJJ = (C197039127h) view.findViewById(R.id.y61);
        C1202940hPQ.LIZ(kp(), this.LLJJIJIIJIL);
        kp().LJIIZILJ((C1487160onq) this.LLJLILLLLZIIL.getValue());
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        if (frameLayout != null) {
            int iLIZ = C497820Jfg.LIZ(frameLayout.getContext());
            C1383370m6R.LJIILJJIL((iLIZ * 1300) / 1520, iLIZ, frameLayout);
            frameLayout.requestLayout();
        }
        TuxTextView tuxTextView = this.LLJJIJIL;
        String strLIZJ4 = "";
        if (tuxTextView != null) {
            C20543315a3 c20543315a3 = (C20543315a3) this.LLJJL.getValue();
            if (c20543315a3 == null) {
                strLIZJ3 = "";
            } else {
                strLIZJ3 = C0JBW.LIZJ(c20543315a3.LIZ, new Object[0]);
            }
            tuxTextView.setText(strLIZJ3);
            tuxTextView.setMaxLines(2);
        }
        TuxTextView tuxTextView2 = this.LLJJJ;
        if (tuxTextView2 != null) {
            C20543315a3 c20543315a32 = (C20543315a3) this.LLJJL.getValue();
            if (c20543315a32 == null) {
                strLIZJ2 = "";
            } else {
                strLIZJ2 = C0JBW.LIZJ(c20543315a32.LIZIZ, new Object[0]);
            }
            tuxTextView2.setText(strLIZJ2);
            tuxTextView2.setMaxLines(1);
        }
        EnumC20542915Zz enumC20542915Zz = mp().buttonType;
        if (enumC20542915Zz == null) {
            i = -1;
        } else {
            i = C20542715Zx.LIZ[enumC20542915Zz.ordinal()];
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                strLIZJ = "";
            } else {
                strLIZJ = C0JBW.LIZJ(2131830466, new Object[0]);
            }
        } else {
            strLIZJ = C0JBW.LIZJ(2131830475, new Object[0]);
        }
        EnumC20542915Zz enumC20542915Zz2 = mp().buttonType;
        if (enumC20542915Zz2 != null) {
            int i2 = C20542715Zx.LIZ[enumC20542915Zz2.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        strLIZJ4 = C0JBW.LIZJ(2131830475, new Object[0]);
                    }
                } else {
                    strLIZJ4 = C0JBW.LIZJ(2131830466, new Object[0]);
                }
            } else {
                strLIZJ4 = C0JBW.LIZJ(2131830472, 15);
            }
        }
        final C20544115aB c20544115aB = this.LLJJJIL;
        if (c20544115aB != null) {
            c20544115aB.setButtonSize(2);
            c20544115aB.setButtonVariant(1);
            c20544115aB.LJJLI(true);
            c20544115aB.LJJJJLI(true);
            c20544115aB.setTuxFont(102);
            c20544115aB.setMinTextSize(12.0f);
            c20544115aB.setMaxWidth(C0JBW.LIZ(278, c20544115aB.getContext()));
            int iLIZ2 = C0JBW.LIZ(16, c20544115aB.getContext());
            int iLIZ3 = C0JBW.LIZ(8, c20544115aB.getContext());
            c20544115aB.setPadding(iLIZ2, iLIZ3, iLIZ2, iLIZ3);
            c20544115aB.LLLJ = 200.0f;
            c20544115aB.LLLJIL = 200.0f;
            c20544115aB.setOnCountdownListener(new InterfaceC20544315aD() { // from class: X.15a0
                @Override // X.InterfaceC20544315aD
                public final void LIZ() {
                    c20544115aB.setText(strLIZJ);
                    this.up(c20544115aB, false);
                }

                @Override // X.InterfaceC20544315aD
                public final void LIZIZ(int i3) {
                    c20544115aB.setText(C0JBW.LIZIZ(2131755217, i3, Integer.valueOf(i3)));
                    this.up(c20544115aB, true);
                }
            });
            up(c20544115aB, false);
            c20544115aB.setText(strLIZJ);
            C786410Ut5.I7(new AbS710S0100000_31(this, 3), c20544115aB);
            c20544115aB.LJJLIIIIJ(((Number) this.LLJL.getValue()).intValue());
        }
        C197039127h c197039127h = this.LLJJJJ;
        if (c197039127h != null) {
            c197039127h.setButtonSize(2);
            c197039127h.setButtonVariant(-1);
            c197039127h.LJJJJLI(true);
            c197039127h.setTuxFont(102);
            c197039127h.setMinTextSize(12.0f);
            c197039127h.setMaxWidth(C0JBW.LIZ(278, c197039127h.getContext()));
            c197039127h.setText(strLIZJ4);
            C786410Ut5.I7(new AbS710S0100000_31(this, 4), c197039127h);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("popup_name", lp());
        c2344009Gk.LJ(mp().seconds, "countdown");
        c2344009Gk.LJFF("enter_from", "homepage_hot");
        c2344009Gk.LJFF("style", "fyp_card");
        c2344009Gk.LJ(mp().counts, "trigger_time");
        if (ip().LIZIZ() == EnumC20537615Xy.CHILD) {
            c2344009Gk.LJFF("business", "fp_bl_break");
        }
        C20684815ws.LJIILLIIL("PrivacyDWL_popup_show", c2344009Gk.LIZ);
        yp(false);
    }

    public final void op(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("popup_name", lp());
        c2344009Gk.LJ(mp().seconds, "countdown");
        c2344009Gk.LJFF("enter_from", "homepage_hot");
        c2344009Gk.LJFF("style", "fyp_card");
        c2344009Gk.LJ(mp().counts, "trigger_time");
        c2344009Gk.LJFF("button_name", str);
        if (ip().LIZIZ() == EnumC20537615Xy.CHILD) {
            c2344009Gk.LJFF("business", "fp_bl_break");
        }
        C20684815ws.LJIILLIIL("PrivacyDWL_popup_button_click", c2344009Gk.LIZ);
    }

    public final void sp(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("popup_name", str);
        c2344009Gk.LJFF("enter_from", "homepage_hot");
        c2344009Gk.LJFF("style", "toast");
        c2344009Gk.LJ(mp().counts, "trigger_time");
        if (ip().LIZIZ() == EnumC20537615Xy.CHILD) {
            c2344009Gk.LJFF("business", "fp_bl_remind_you");
        }
        C20684815ws.LJIILLIIL("PrivacyDWL_popup_show", c2344009Gk.LIZ);
    }

    public final void yp(boolean z) {
        if (z) {
            TuxTextView tuxTextView = this.LLJJIJIL;
            if (tuxTextView != null) {
                C339190DRl.LIZLLL(tuxTextView);
            }
            TuxTextView tuxTextView2 = this.LLJJJ;
            if (tuxTextView2 != null) {
                C339190DRl.LIZLLL(tuxTextView2);
            }
            C20544115aB c20544115aB = this.LLJJJIL;
            if (c20544115aB != null) {
                C339190DRl.LIZLLL(c20544115aB);
            }
            C197039127h c197039127h = this.LLJJJJ;
            if (c197039127h != null) {
                C339190DRl.LIZLLL(c197039127h);
                return;
            }
            return;
        }
        TuxTextView tuxTextView3 = this.LLJJIJIL;
        if (tuxTextView3 != null) {
            C339190DRl.LIZIZ(tuxTextView3);
        }
        TuxTextView tuxTextView4 = this.LLJJJ;
        if (tuxTextView4 != null) {
            C339190DRl.LIZIZ(tuxTextView4);
        }
        C20544115aB c20544115aB2 = this.LLJJJIL;
        if (c20544115aB2 != null) {
            C339190DRl.LIZIZ(c20544115aB2);
        }
        C197039127h c197039127h2 = this.LLJJJJ;
        if (c197039127h2 == null) {
            return;
        }
        C339190DRl.LIZIZ(c197039127h2);
    }

    public final void zp(int i) {
        String strLIZIZ;
        Activity activityLIZ;
        String strLIZIZ2;
        if (i >= 60) {
            int i2 = i / 60;
            int i3 = i % 60;
            String strLIZIZ3 = C0JBW.LIZIZ(2131755785, i2, Integer.valueOf(i2));
            if (i3 > 0) {
                strLIZIZ2 = C0JBW.LIZIZ(2131756067, i3, Integer.valueOf(i3));
            } else {
                strLIZIZ2 = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ3);
            sbLIZ.append(' ');
            sbLIZ.append(strLIZIZ2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = C0JBW.LIZIZ(2131756067, i, Integer.valueOf(i));
        }
        String strLIZJ = C0JBW.LIZJ(2131830474, strLIZIZ);
        Context context = getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(strLIZJ);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void up(C20544115aB c20544115aB, boolean z) {
        int i;
        float f;
        if (z) {
            i = R.attr.a03;
            f = 0.6f;
        } else {
            i = R.attr.a02;
            f = 1.0f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20544115aB);
        c20544115aB.setAlpha(f);
        c20544115aB.LJJJJL(new AwS137S0101000_31(c20544115aB, i, 6));
    }
}
