package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem;

import X.AbstractC738140SxQ;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C01GW;
import X.C05OG;
import X.C0JBW;
import X.C0QSJ;
import X.C1202940hPQ;
import X.C1202960hPS;
import X.C127G;
import X.C1308910kAL;
import X.C13LE;
import X.C1488140opQ;
import X.C1500020p8a;
import X.C15YW;
import X.C15YX;
import X.C197039127h;
import X.C19719912Dl;
import X.C19ME;
import X.C20536115Xj;
import X.C20542515Zv;
import X.C20543415a4;
import X.C20544115aB;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C339190DRl;
import X.C452070Ho5;
import X.C452501pT;
import X.C687700QyG;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1779300wP2;
import X.EnumC19367010po;
import X.InterfaceC1146704e9;
import X.InterfaceC1484830ok5;
import X.InterfaceC20544315aD;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObjectS405S0100000_31;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourSettings;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.viewmodel.STMMeditationViewModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent;
import com.ss.android.ugc.feed.platform.panel.RootPanelScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS137S0101000_31;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.AwS680S0100000_31;
import wh6.AbS516S0200000_31;
import wh6.AbS710S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class STMMeditationAssem extends BasePanelUISlotComponent implements InterfaceC1146704e9 {
    public static final C1500020p8a LLJZIJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public static final C01GW<Integer> LLLF;
    public static final C01GW<C1488140opQ> LLLFF;
    public static final C01GW<C1488140opQ> LLLFFI;
    public TuxIconView LLJJIJIIJIL;
    public C20544115aB LLJJIJIL;
    public C197039127h LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(64));
    public final AssemVMLazy LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public C127G LLJLLIL;
    public InterfaceC665370Q7z LLJLLL;
    public C0QSJ LLJZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0p8a] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(STMMeditationAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/compliance/protection/timelock/ui/viewmodel/STMMeditationViewModel;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJZIJLIL = new Object() { // from class: X.0p8a
        };
        LLLF = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(124));
        LLLFF = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(126));
        LLLFFI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(125));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bcz;
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

    public final InterfaceC1484830ok5 hp() {
        return (InterfaceC1484830ok5) this.LLJJJJLIIL.getValue();
    }

    public final STMMeditationViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (STMMeditationViewModel) assemVMLazy.getValue();
    }

    public final void kp() {
        long jLIZ = C20543415a4.LIZ((C20543415a4) this.LLJJLIIIJLLLLLLLZ.getValue());
        C20543415a4 c20543415a4 = (C20543415a4) this.LLJJLIIIJLLLLLLLZ.getValue();
        c20543415a4.getClass();
        c20543415a4.LIZ = System.currentTimeMillis();
        if (jLIZ <= 0) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("feature", "sleep_hour_reminder");
        c2344009Gk.LIZLLL(jLIZ, "duration");
        C20684815ws.LJIILLIIL("wellbeing_duration", c2344009Gk.LIZ);
    }

    public STMMeditationAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(STMMeditationViewModel.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 350);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(67);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS575S0100000_31, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS575S0100000_31((AbstractC738140SxQ) this, 351), aFwS276S0000000_31, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJL = assemVMLazy;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(127));
        this.LLJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 349));
        this.LLJLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 352));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 353));
        this.LLJLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 347));
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{STMMeditationViewModel.class, new AObjectS405S0100000_31(this, 0)}, defaultViewModelProviderFactory);
                    this.LLJLLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        hp().LJJIIZ((C20542515Zv) this.LLJL.getValue());
        hp().pause();
        kp();
        hp().release();
        C1202960hPS.LIZ.getClass();
        C1202960hPS.LIZLLL("breathing_exercise", "sleep_hours", "video", "stop", "");
        C1202960hPS.LIZLLL("breathing_exercise", "sleep_hours", "audio", "stop", "");
        C05OG.LIZ.getClass();
        C05OG.LIZIZ();
        ip().wQ2();
        C15YW.LIZ.getClass();
        boolean z = C15YW.LJIIIIZZ;
        C15YW.LJIIIIZZ = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        if (C0JBW.LIZLLL(this)) {
            hp().pause();
            C1202960hPS.LIZ.getClass();
            C1202960hPS.LIZLLL("breathing_exercise", "sleep_hours", "video", "pause", "");
            C1202960hPS.LIZLLL("breathing_exercise", "sleep_hours", "audio", "pause", "");
            kp();
            STMMeditationViewModel sTMMeditationViewModelIp = ip();
            C05OG.LIZ.getClass();
            C05OG.LIZ();
            sTMMeditationViewModelIp.LLIZLLLIL = true;
            sTMMeditationViewModelIp.wQ2();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (C0JBW.LIZLLL(this)) {
            ip().yQ2(EnumC19367010po.RESUME);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        hp().pause();
        C1202960hPS.LIZ.getClass();
        C1202960hPS.LIZLLL("breathing_exercise", "sleep_hours", "video", "pause", "");
        C1202960hPS.LIZLLL("breathing_exercise", "sleep_hours", "audio", "pause", "");
        kp();
        STMMeditationViewModel sTMMeditationViewModelIp = ip();
        C05OG.LIZ.getClass();
        C05OG.LIZ();
        sTMMeditationViewModelIp.LLIZLLLIL = true;
        sTMMeditationViewModelIp.wQ2();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        ip().yQ2(EnumC19367010po.RESUME);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        final boolean z;
        String str;
        Integer numLIZJ;
        C197039127h c197039127h;
        super.onViewCreated(view);
        new AwS575S0100000_31(this, 348);
        this.LLJJIJIIJIL = (TuxIconView) view.findViewById(R.id.jxe);
        this.LLJJIJIL = (C20544115aB) view.findViewById(R.id.d6g);
        this.LLJJJ = (C197039127h) view.findViewById(R.id.y61);
        this.LLJJJIL = (TuxTextView) view.findViewById(R.id.title);
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.eu1);
        this.LLJJJJJIL = (FrameLayout) view.findViewById(R.id.wq8);
        C1202940hPQ.LIZ(hp(), this.LLJJJJJIL);
        TuxIconView tuxIconView = this.LLJJIJIIJIL;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(R.raw.icon_moon_fill);
        }
        C15YW.LIZ.getClass();
        boolean zLIZIZ = C15YW.LIZIZ();
        C20544115aB c20544115aB = this.LLJJIJIL;
        int i = 0;
        if (c20544115aB != null && (c197039127h = this.LLJJJ) != null) {
            ViewGroup.LayoutParams layoutParams = c20544115aB.getLayoutParams();
            if (layoutParams != null) {
                C19ME c19me = (C19ME) layoutParams;
                if (zLIZIZ) {
                    C339190DRl.LIZLLL(c197039127h);
                    c19me.bottomToTop = R.id.y61;
                    c19me.bottomToBottom = -1;
                    ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = C0JBW.LIZ(8, getContext());
                } else {
                    C339190DRl.LIZIZ(c197039127h);
                    c19me.bottomToTop = -1;
                    c19me.bottomToBottom = 0;
                    ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = C0JBW.LIZ(40, getContext());
                }
                C786410Ut5.W5(c20544115aB, c19me);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        C15YX.LIZ.getClass();
        SleepHourSettings sleepHourSettingsLIZJ = C15YX.LIZJ();
        if (sleepHourSettingsLIZJ != null && sleepHourSettingsLIZJ.isFirstShownPrompt) {
            z = true;
        } else {
            z = false;
        }
        final String strLIZJ = C0JBW.LIZJ(2131845171, new Object[0]);
        String strLIZJ2 = C0JBW.LIZJ(2131845158, new Object[0]);
        C197039127h c197039127h2 = this.LLJJJ;
        if (c197039127h2 != null) {
            if (zLIZIZ) {
                C339190DRl.LIZLLL(c197039127h2);
                c197039127h2.setButtonSize(2);
                c197039127h2.setButtonVariant(-1);
                c197039127h2.LJJJJLI(true);
                c197039127h2.setTuxFont(102);
                c197039127h2.setMinTextSize(12.0f);
                c197039127h2.setMaxWidth(C0JBW.LIZ(278, c197039127h2.getContext()));
                c197039127h2.setText(C0JBW.LIZJ(2131830466, new Object[0]));
                C786410Ut5.I7(new AbS710S0100000_31(this, 10), c197039127h2);
            } else {
                C339190DRl.LIZIZ(c197039127h2);
            }
        }
        final C20544115aB c20544115aB2 = this.LLJJIJIL;
        SleepHourSettings sleepHourSettingsLIZ = null;
        if (c20544115aB2 != null) {
            c20544115aB2.LJJLI(true);
            c20544115aB2.setButtonSize(2);
            c20544115aB2.setButtonVariant(1);
            c20544115aB2.LJJJJLI(true);
            c20544115aB2.setTuxFont(102);
            c20544115aB2.setMinTextSize(12.0f);
            c20544115aB2.setMaxWidth(C0JBW.LIZ(278, c20544115aB2.getContext()));
            int iLIZ = C0JBW.LIZ(16, c20544115aB2.getContext());
            int iLIZ2 = C0JBW.LIZ(8, c20544115aB2.getContext());
            c20544115aB2.setPadding(iLIZ, iLIZ2, iLIZ, iLIZ2);
            c20544115aB2.LLLJ = 200.0f;
            c20544115aB2.LLLJIL = 200.0f;
            if (zLIZIZ && z) {
                c20544115aB2.setOnCountdownListener(new InterfaceC20544315aD() { // from class: X.15a1
                    @Override // X.InterfaceC20544315aD
                    public final void LIZ() {
                        c20544115aB2.setText(strLIZJ);
                        this.lp(c20544115aB2, false);
                    }

                    @Override // X.InterfaceC20544315aD
                    public final void LIZIZ(int i2) {
                        c20544115aB2.setText(C0JBW.LIZJ(2131830651, Integer.valueOf(i2)));
                        this.lp(c20544115aB2, true);
                    }
                });
                lp(c20544115aB2, false);
                c20544115aB2.setText(strLIZJ);
                C786410Ut5.I7(new AbS516S0200000_31(this, c20544115aB2, 5), c20544115aB2);
                LLJZIJLIL.getClass();
                c20544115aB2.LJJLIIIIJ(LLLF.getValue().intValue());
            } else {
                c20544115aB2.setOnCountdownListener(null);
                lp(c20544115aB2, false);
                if (!z) {
                    strLIZJ = strLIZJ2;
                }
                c20544115aB2.setText(strLIZJ);
                C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.15Zw
                    @Override // X.AbstractViewOnClickListenerC1637610siV
                    public final void LIZ(View view2) {
                        if (view2 != null) {
                            C2271391DvN.LIZ(view2, (C1A5L) C2271381DvM.G0.getValue());
                            this.LLILZ.hp().pause();
                            C05OG.LIZ.getClass();
                            C05OG.LIZ();
                            if (z) {
                                this.LLILZ.ip().xQ2(c20544115aB2.getContext());
                                return;
                            }
                            this.LLILZ.ip();
                            Context context = c20544115aB2.getContext();
                            if (context == null) {
                                return;
                            }
                            Uri.Builder builderBuildUpon = UriProtector.parse("//compliance/screen_time/sleep_hour_manager_dialog").buildUpon();
                            builderBuildUpon.appendQueryParameter("type", "manage_sleep_hour");
                            SmartRouter.buildRoute(context, builderBuildUpon.build().toString()).open();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("feed_name", "sleephour");
                            c2344009Gk.LJIIIIZZ("button_name", "manage_sleephour");
                            C20684815ws.LJIILLIIL("PrivacyDWL_feed_button_click", c2344009Gk.LIZ);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(300L);
                    }
                }, c20544115aB2);
            }
        }
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zw, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            TuxTextView tuxTextView = this.LLJJJIL;
            if (tuxTextView != null) {
                tuxTextView.setTextColor(iIntValue);
            }
            TuxTextView tuxTextView2 = this.LLJJJJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColor(iIntValue);
            }
            TuxIconView tuxIconView2 = this.LLJJIJIIJIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColor(iIntValue);
            }
        }
        C736680Sv4.LJIIIZ(this, ip(), new C2217381BqS() { // from class: X.15Zu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20542215Zs) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.15Zt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20542215Zs) obj).LLILLJJLI);
            }
        }, null, new AwS680S0100000_31(this, 9), 12);
        hp().LJIIZILJ((C20542515Zv) this.LLJL.getValue());
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.15a2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20542215Zs) obj).LLILLL;
            }
        }, null, new AwS645S0100000_31(this, 89), 6);
        SleepHourSettings sleepHourSettingsLIZJ2 = C15YX.LIZJ();
        if (sleepHourSettingsLIZJ2 != null) {
            int iLJ = C15YX.LJ();
            Keva kevaLIZ = C15YX.LIZ();
            C20536115Xj.LIZ.getClass();
            int i2 = kevaLIZ.getInt(C20536115Xj.LJI("sleep_hour_daily_cadence_day"), 0);
            int i3 = C15YX.LIZ().getInt(C20536115Xj.LJI("sleep_hour_daily_cadence_count"), 0);
            if (i2 == iLJ) {
                iLJ = i2;
                i = i3;
            }
            C15YX.LIZ().storeInt(C20536115Xj.LJI("sleep_hour_daily_cadence_day"), iLJ);
            C15YX.LIZ().storeInt(C20536115Xj.LJI("sleep_hour_daily_cadence_count"), i + 1);
            if (sleepHourSettingsLIZJ2.isFirstShownPrompt) {
                str = "return_for_now";
            } else if (sleepHourSettingsLIZJ2.delayType == EnumC1779300wP2.FIFTEEN_MINS.getValue()) {
                str = "fifteen_min";
            } else {
                str = "manage_sleep_hour";
            }
            int i4 = sleepHourSettingsLIZJ2.popupShowTimes + 1;
            SleepHourSettings sleepHourSettingsLIZJ3 = C15YX.LIZJ();
            if (sleepHourSettingsLIZJ3 != null) {
                sleepHourSettingsLIZ = SleepHourSettings.LIZ(sleepHourSettingsLIZJ3, false, 0L, i4, 0, 11);
            }
            C15YX.LJFF(sleepHourSettingsLIZ);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(i4, "trigger_time");
            c2344009Gk.LJIIIIZZ("reminder_type", str);
            C20684815ws.LJIILLIIL("show_feed_sleep_hour_reminder", c2344009Gk.LIZ);
        }
    }

    public final void lp(C20544115aB c20544115aB, boolean z) {
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
        c20544115aB.LJJJJL(new AwS137S0101000_31(c20544115aB, i, 7));
    }
}
