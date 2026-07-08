package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem;

import X.AnonymousClass0956;
import X.C01GW;
import X.C01MX;
import X.C05OG;
import X.C0JBW;
import X.C0OM1;
import X.C1157610gEJ;
import X.C1202860hPI;
import X.C1202880hPK;
import X.C1202940hPQ;
import X.C1202960hPS;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1482560ogQ;
import X.C1488130opP;
import X.C1488140opQ;
import X.C1559260qg8;
import X.C197039127h;
import X.C20684815ws;
import X.C2097608Jq;
import X.C23250099c;
import X.C2344009Gk;
import X.C339190DRl;
import X.C452501pT;
import X.C723580SZw;
import X.C786410Ut5;
import X.EnumC1163290gNT;
import X.EnumC1202870hPJ;
import X.InterfaceC1484830ok5;
import X.InterfaceC497601wk;
import Y.ACListenerS121S0200000_18;
import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes19.dex */
public final class MeditationExerciseAssem extends UIContentAssem {
    public static final Map<Integer, Integer> LLJL;
    public static final Map<Integer, String> LLJLIL;
    public static final EnumC1202870hPJ LLJLILLLLZIIL;
    public static final EnumC1202870hPJ LLJLL;
    public static final EnumC1202870hPJ LLJLLIL;
    public static final EnumC1202870hPJ LLJLLL;
    public TuxSpinner LLIZLLLIL;
    public FrameLayout LLJ;
    public C197039127h LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public FrameLayout LLJILJILJ;
    public long LLJJ;
    public int LLJJIJI;
    public long LLJJIJIIJIL;
    public AnonymousClass0956 LLJJIJIL;
    public boolean LLJILLL = true;
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(90));
    public int LLJJIII = LLJLILLLLZIIL.LL;
    public final C01GW LLJJJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(91));
    public final C1559260qg8 LLJJJIL = new C1559260qg8(new C723580SZw(this, C1157610gEJ.class, null), checkSupervisorPrepared());
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 150));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 143));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 147));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 148));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 149));

    static {
        EnumC1202870hPJ enumC1202870hPJ = EnumC1202870hPJ.LLILLJJLI;
        EnumC1202870hPJ enumC1202870hPJ2 = EnumC1202870hPJ.LLILLL;
        EnumC1202870hPJ enumC1202870hPJ3 = EnumC1202870hPJ.LLILZ;
        EnumC1202870hPJ enumC1202870hPJ4 = EnumC1202870hPJ.LLILZIL;
        LLJL = C2097608Jq.LJIIIIZZ(new Pair(0, 2131845159), new Pair(1, 2131845153), new Pair(2, 2131845149), new Pair(3, 2131845148), new Pair(4, 2131845173));
        LLJLIL = C2097608Jq.LJIIIIZZ(new Pair(0, "relax"), new Pair(1, "inhale"), new Pair(2, "hold"), new Pair(3, "exhale"), new Pair(4, "well_done"));
        LLJLILLLLZIIL = enumC1202870hPJ;
        LLJLL = enumC1202870hPJ4;
        LLJLLIL = enumC1202870hPJ2;
        LLJLLL = enumC1202870hPJ3;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void Go() {
        String string;
        Integer num = LLJL.get(Integer.valueOf(this.LLJJIII));
        if (num != null) {
            int iIntValue = num.intValue();
            TuxTextView tuxTextView = this.LLJILJIL;
            if (tuxTextView != null) {
                Context context = getContext();
                if (context == null || (string = context.getString(iIntValue)) == null) {
                    string = "";
                }
                tuxTextView.setText(string);
            }
            C339190DRl.LIZLLL(this.LLJILJIL);
        }
        new AwS562S0100000_18(this, 144);
        TuxTextView tuxTextView2 = this.LLJILJIL;
        if (tuxTextView2 != null) {
            tuxTextView2.LJJJJI(32.0f);
            Animation animation = (Animation) this.LLJJL.getValue();
            if (animation != null) {
                tuxTextView2.startAnimation(animation);
            }
        }
        this.LLJJIJIIJIL = System.currentTimeMillis();
        if (this.LLJJIII != LLJLL.LL) {
            List<Long> list = Ho().LIZ;
            int i = this.LLJJIII;
            Oo(((Number) ((i < 0 || i >= list.size()) ? 3750L : ListProtector.get(list, i))).longValue(), new AwS562S0100000_18(this, 145));
            return;
        }
        C1202960hPS c1202960hPS = C1202960hPS.LIZ;
        String value = Lo().getValue();
        String str = LLJLIL.get(Integer.valueOf(this.LLJJIII));
        if (str == null) {
            str = "unknown";
        }
        int i2 = this.LLJJIJI + 1;
        c1202960hPS.getClass();
        C1202960hPS.LIZIZ(i2, value, 0L, str);
        C1202960hPS.LIZ(c1202960hPS, Lo().getValue(), this.LLJJIJI, "completed");
        if (this.LLJILLL) {
            this.LLJILLL = false;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("breathing_type", Lo().getValue());
            C20684815ws.LJIILLIIL("wellbeinghub_breathing_commplete_show", c2344009Gk.LIZ);
        }
    }

    public final C1202880hPK Ho() {
        return (C1202880hPK) this.LLJJJJJIL.getValue();
    }

    public final InterfaceC1484830ok5 Jo() {
        return (InterfaceC1484830ok5) this.LLJJI.getValue();
    }

    public final EnumC1163290gNT Lo() {
        return (EnumC1163290gNT) this.LLJJJJ.getValue();
    }

    public final void Vo() {
        this.LLJJ = System.currentTimeMillis();
        this.LLJJIII = LLJLILLLLZIIL.LL;
        this.LLJJIJI = 0;
        Jo().LJIIZILJ((C1202860hPI) this.LLJJJJLIIL.getValue());
        C1482560ogQ c1482560ogQLIZ = C1488130opP.LIZ(new C1488140opQ(false, Collections.singletonList(Ho().LIZJ), 0, Ho().LIZJ, 0, 0, false, 112));
        So(true);
        Jo().LJ(c1482560ogQLIZ);
        C1202960hPS c1202960hPS = C1202960hPS.LIZ;
        String value = Lo().getValue();
        c1202960hPS.getClass();
        C1202960hPS.LIZLLL("breathing_exercise", value, "video", "play", "beginning");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLJJIII != LLJLL.LL) {
            C1202960hPS.LIZ(C1202960hPS.LIZ, Lo().getValue(), this.LLJJIJI, "left_early");
        }
        Jo().LJJIIZ((C1202860hPI) this.LLJJJJLIIL.getValue());
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Jo().pause();
        C1202960hPS c1202960hPS = C1202960hPS.LIZ;
        String value = Lo().getValue();
        c1202960hPS.getClass();
        C1202960hPS.LIZLLL("breathing_exercise", value, "video", "stop", "");
        C1202960hPS.LIZLLL("breathing_exercise", Lo().getValue(), "audio", "stop", "");
        C05OG.LIZ.getClass();
        C05OG.LIZIZ();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Jo().pause();
        C05OG.LIZ.getClass();
        C05OG.LIZ();
        C1202960hPS c1202960hPS = C1202960hPS.LIZ;
        String value = Lo().getValue();
        c1202960hPS.getClass();
        C1202960hPS.LIZLLL("breathing_exercise", value, "video", "pause", "");
        C1202960hPS.LIZLLL("breathing_exercise", Lo().getValue(), "audio", "pause", "");
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.LLJJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("wellbeinghub_meditation_play_duration", c2344009Gk.LIZ);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        Vo();
    }

    public final void No(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("breathing_type", Lo().getValue());
        c2344009Gk.LJIIIIZZ("exit_method", str);
        C20684815ws.LJIILLIIL("exit_wellbeinghub_breathing", c2344009Gk.LIZ);
    }

    public final void So(boolean z) {
        if (z) {
            FrameLayout frameLayout = this.LLJ;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(ColorProtector.parseColor(Ho().LJFF));
            }
            C339190DRl.LIZLLL(this.LLJ);
            C339190DRl.LIZLLL(this.LLIZLLLIL);
            return;
        }
        C339190DRl.LIZIZ(this.LLJ);
        C339190DRl.LIZIZ(this.LLIZLLLIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        Integer numLIZJ;
        super.onViewCreated(view);
        this.LLIZLLLIL = (TuxSpinner) view.findViewById(R.id.nl1);
        this.LLJ = (FrameLayout) view.findViewById(R.id.nnp);
        this.LLJI = (C197039127h) view.findViewById(R.id.d6g);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.cuh);
        this.LLJILJIL = (TuxTextView) view.findViewById(R.id.title);
        this.LLJILJILJ = (FrameLayout) view.findViewById(R.id.wq8);
        C1202940hPQ.LIZ(Jo(), this.LLJILJILJ);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.y08);
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZJ(new AwS562S0100000_18(this, 146));
            c0om1.LJ(c1251150ifB);
            tuxNavBar.setNavActions(c0om1);
            tuxNavBar.setNavBackground(0);
        }
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zw, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            TuxTextView tuxTextView = this.LLJILJIL;
            if (tuxTextView != null) {
                tuxTextView.setTextColor(iIntValue);
            }
        }
        TuxTextView tuxTextView2 = this.LLJILJIL;
        if (tuxTextView2 != null) {
            Context context2 = tuxTextView2.getContext();
            if (context2 != null) {
                string = context2.getString(2131845162);
            } else {
                string = null;
            }
            tuxTextView2.setText(string);
            tuxTextView2.LJJJJI(40.0f);
            C339190DRl.LIZIZ(tuxTextView2);
        }
        C197039127h c197039127h = this.LLJI;
        if (c197039127h != null) {
            c197039127h.setPadding(0, 8, 0, 8);
            c197039127h.LJJJJL(new AwS585S0100000_6(c197039127h, 53));
            c197039127h.setText(C0JBW.LIZJ(2131858472, new Object[0]));
            C786410Ut5.U8(c197039127h, new ACListenerS153S0100000_18(this, 9));
        }
        TuxTextView tuxTextView3 = this.LLJIJIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setBackgroundColor(0);
            C786410Ut5.h9(tuxTextView3, new ACListenerS121S0200000_18(tuxTextView3, this, 4));
        }
        Vo();
    }

    public final void Oo(long j, Function0<Unit> function0) {
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJIJIL = C23250099c.LIZLLL((InterfaceC497601wk) this.LLJJJ.getValue(), null, null, new C01MX(j, function0, null), 3);
    }
}
