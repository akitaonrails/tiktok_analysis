package com.ss.android.ugc.aweme.im.streak.impl.pet.assem;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C054G;
import X.C06C6;
import X.C06F6;
import X.C06HD;
import X.C06MJ;
import X.C09R3;
import X.C1231704rr;
import X.C1383370m6R;
import X.C13LE;
import X.C1559260qg8;
import X.C1571106Dd;
import X.C1572806Du;
import X.C1573406Ea;
import X.C1573506Eb;
import X.C1574006Eg;
import X.C1574206Ei;
import X.C1575806Ey;
import X.C1589406Ke;
import X.C1589506Kf;
import X.C1589706Kh;
import X.C1590406Ko;
import X.C1590806Ks;
import X.C1598406Nq;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1743710vTd;
import X.C1807670x8n;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C384150F4j;
import X.C418440Gaw;
import X.C452501pT;
import X.C457780HxI;
import X.C723580SZw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1541990qEH;
import X.InterfaceC2217461Bqa;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnLayoutChangeListenerC1767506w5;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.ChatLongPressVM;
import com.ss.android.ugc.aweme.im.streak.impl.exp.DMStreakWidgetDefaultOffsetConfig;
import com.ss.android.ugc.aweme.im.streak.impl.exp.DMStreakWidgetSizeConfig;
import com.ss.android.ugc.aweme.im.streak.impl.pet.fe.event.StreakJsEventHandler;
import com.zhiliaoapp.musically.R;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS24S0102000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetWidgetAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public final DMStreakWidgetSizeConfig LLJJI = C1590406Ko.LJ;
    public final DMStreakWidgetDefaultOffsetConfig LLJJIII = C1590406Ko.LIZLLL;
    public final int LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1590406Ko.LIZJ)));
    public final C054G LLJJIJIIJIL;
    public AnonymousClass0956 LLJJIJIL;
    public final C1231704rr LLJJJ;
    public C06MJ LLJJJIL;
    public Animator LLJJJJ;
    public final C1559260qg8 LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public int LLJZ;
    public boolean LLJZIJLIL;
    public final AssemVMLazy LLL;
    public Animator LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final ViewOnLayoutChangeListenerC1767506w5 LLLFZ;
    public volatile C1598406Nq LLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StreakPetWidgetAssem.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(StreakPetWidgetAssem.class, "longPressVM", "getLongPressVM()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/ChatLongPressVM;", 0);
        c09r3.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public StreakPetWidgetAssem() {
        C1598406Nq c1598406Nq = this.LLLI;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LLLI;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LLLI = c1598406Nq;
                }
            }
        }
        this.LLJJIJIIJIL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        this.LLJJJ = new C1231704rr("StreakPetAssem", null, 6);
        this.LLJJJJJIL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatLongPressVM.class);
        this.LLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 592), AFwS229S0000000_2.get$arr$(328), null, true);
        this.LLLFF = C452501pT.LIZIZ(new AwS546S0100000_2(this, 593));
        this.LLLFFI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 591));
        this.LLLFZ = new ViewOnLayoutChangeListenerC1767506w5(this, 1);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cq1;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final String hp() {
        SessionInfo sessionInfo;
        String conversationId;
        C457780HxI c457780HxI = (C457780HxI) this.LLJJJJJIL.getValue();
        return (c457780HxI == null || (sessionInfo = c457780HxI.LL) == null || (conversationId = sessionInfo.getConversationId()) == null) ? "" : conversationId;
    }

    public final C06HD ip() {
        return (C06HD) this.LLLFF.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        InterfaceC1541990qEH kitView;
        super.onDestroy();
        lp(this.LLJLL, this.LLJLILLLLZIIL);
        C2296808zG.LIZJ(this.LLJJIJIIJIL, null);
        C06HD c06hdIp = ip();
        if (c06hdIp != null) {
            C2296808zG.LIZJ(c06hdIp.LLJJIII, null);
            StreakJsEventHandler streakJsEventHandler = (StreakJsEventHandler) c06hdIp.LLJJJJ.getValue();
            streakJsEventHandler.getClass();
            C1574006Eg c1574006Eg = C1574006Eg.LLILLJJLI;
            c1574006Eg.getClass();
            C054G c054g = C1574006Eg.LLILZ;
            C23250099c.LIZLLL(c054g, null, null, new C1574206Ei(streakJsEventHandler, null), 3);
            StreakJsEventHandler streakJsEventHandler2 = (StreakJsEventHandler) c06hdIp.LLJJJJJIL.getValue();
            streakJsEventHandler2.getClass();
            c1574006Eg.getClass();
            C23250099c.LIZLLL(c054g, null, null, new C1574206Ei(streakJsEventHandler2, null), 3);
            StreakJsEventHandler streakJsEventHandler3 = (StreakJsEventHandler) c06hdIp.LLJJJJLIIL.getValue();
            streakJsEventHandler3.getClass();
            c1574006Eg.getClass();
            C23250099c.LIZLLL(c054g, null, null, new C1574206Ei(streakJsEventHandler3, null), 3);
            StreakJsEventHandler streakJsEventHandler4 = (StreakJsEventHandler) c06hdIp.LLJJL.getValue();
            streakJsEventHandler4.getClass();
            c1574006Eg.getClass();
            C23250099c.LIZLLL(c054g, null, null, new C1574206Ei(streakJsEventHandler4, null), 3);
            C1575806Ey.LIZJ.getClass();
            WeakHashMap<C06F6, Object> weakHashMap = C1575806Ey.LJFF;
            synchronized (weakHashMap) {
                try {
                    weakHashMap.remove(c06hdIp);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C06C6.LIZIZ.getClass();
            C06C6.LJ(c06hdIp);
            C1571106Dd.LJ.getClass();
            C1571106Dd.LJI.LIZJ.remove(c06hdIp);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c06hdIp.LLJJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
            }
            C1572806Du.LL.uk(c06hdIp.LLIZLLLIL);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c06hdIp.LLJJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView()) == null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = c06hdIp.LLJJ;
                C1743710vTd.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getSparkContext() : null);
            } else {
                kitView.LLD(true);
            }
            C786410Ut5.LJJJZ(c06hdIp.LLJJ, c06hdIp.LL);
            c06hdIp.LLJJ = null;
            C384150F4j c384150F4j = c06hdIp.LLJJIJIL;
            if (c384150F4j != null) {
                c384150F4j.setStreakPetWidgetCallback(null);
            }
        }
        Animator animator = this.LLJJJJ;
        if (animator != null) {
            animator.cancel();
        }
        LJJIJL().removeOnLayoutChangeListener(this.LLLFZ);
        Animator animator2 = this.LLLF;
        if (animator2 != null) {
            animator2.cancel();
        }
        C06MJ c06mj = this.LLJJJIL;
        if (c06mj != null) {
            c06mj.setOnTouchListener(null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C06HD c06hdIp = ip();
        if (c06hdIp != null) {
            C1590806Ks.LIZ("StreakPetWidget, onPause");
            C23250099c.LIZLLL(c06hdIp.LLJJIII, null, null, new C1589406Ke(c06hdIp, null), 3);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C06HD c06hdIp = ip();
        if (c06hdIp != null) {
            C1590806Ks.LIZ("StreakPetWidget, onResume");
            C23250099c.LIZLLL(c06hdIp.LLJJIII, null, null, new C1589506Kf(c06hdIp, null), 3);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        LJJIJL().setLayoutDirection(0);
        C06MJ c06mj = (C06MJ) view.findViewById(R.id.wag);
        if (c06mj != null) {
            ViewGroup.LayoutParams layoutParams = c06mj.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJJI.width)));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJJI.height)));
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c06mj);
            c06mj.setLayoutParams(layoutParams);
        } else {
            c06mj = null;
        }
        this.LLJJJIL = c06mj;
        if (c06mj != null) {
            int visibility = c06mj.getVisibility();
            c06mj.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c06mj);
        }
        C06MJ c06mj2 = this.LLJJJIL;
        if (c06mj2 != null) {
            c06mj2.setOnTouchListener(new View.OnTouchListener() { // from class: X.06Kk
                /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
                
                    if (r1 != 3) goto L9;
                 */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
                    /*
                        Method dump skipped, instruction units count: 602
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1590006Kk.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
        }
        C23250099c.LIZLLL(this.LLJJIJIIJIL, null, null, new C1573506Eb(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1589706Kh(this, null), 3);
    }

    public final void kp(int i, int i2) {
        int width;
        if (i < (LJJIJL().getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJJI.width)))) / 2) {
            width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJJIII.left)));
        } else {
            width = (LJJIJL().getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJJI.width)))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJJIII.right)));
        }
        C06MJ c06mj = this.LLJJJIL;
        if (c06mj != null) {
            C1383370m6R.LIZIZ(c06mj, new AwS24S0102000_2(width, i2, this, 0));
        }
    }

    public final void lp(int i, int i2) {
        C06MJ c06mj = this.LLJJJIL;
        if (c06mj != null && c06mj.getVisibility() == 0) {
            AnonymousClass0956 anonymousClass0956 = this.LLJJIJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJJIJIL = C23250099c.LIZLLL(this.LLJJIJIIJIL, null, null, new C1573406Ea(this, i, i2, null), 3);
        }
    }
}
