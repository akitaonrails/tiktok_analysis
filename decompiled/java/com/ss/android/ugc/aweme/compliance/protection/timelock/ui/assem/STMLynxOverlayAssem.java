package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem;

import X.C0QSJ;
import X.C13LE;
import X.C1548820qPI;
import X.C20544515aF;
import X.C20544915aJ;
import X.C20748416Ha;
import X.C2217381BqS;
import X.C687700QyG;
import X.C786410Ut5;
import X.EnumC20538815Yk;
import X.EnumC20545715aR;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent;
import com.ss.android.ugc.feed.platform.panel.RootPanelScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class STMLynxOverlayAssem extends BasePanelUISlotComponent implements InterfaceC1146704e9 {
    public static final C20544515aF LLJJJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final EnumC20538815Yk LLJJL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJIJIIJIL;
    public final C20748416Ha LLJJIJIL = new C20748416Ha(this, 1);
    public volatile SleepHourComponentAbility LLJJJ;
    public InterfaceC665370Q7z LLJJJIL;
    public C0QSJ LLJJJJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.15aF] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(STMLynxOverlayAssem.class, "stmComponentAbility", "getStmComponentAbility()Lcom/ss/android/ugc/aweme/compliance/api/services/digitalwellbeing/SleepHourComponentAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJJIL = new Object() { // from class: X.15aF
        };
        LLJJL = EnumC20538815Yk.LYNX_OVERLAY;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bd1;
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

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1548820qPI.LJIIIIZZ("dismiss_fyp_lynx_overlay", this.LLJJIJIL);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJIIJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIFFI(true);
        }
        this.LLJJIJIIJIL = null;
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hp(java.lang.String r6) {
        /*
            r5 = this;
            kotlin.jvm.internal.AwS115S1000000_31 r1 = new kotlin.jvm.internal.AwS115S1000000_31
            r0 = 1
            r1.<init>(r6, r0)
            X.0qEB r0 = r5.LLJJIJIIJIL
            r2 = 1
            if (r0 == 0) goto Le
            r0.LJJIFFI(r2)
        Le:
            r0 = 0
            r5.LLJJIJIIJIL = r0
            X.15aJ r1 = X.C20544915aJ.LIZ
            r1.getClass()
            X.C20544915aJ.LIZLLL(r0)
            com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility r1 = r5.LLJJJ
            if (r1 != 0) goto L52
            monitor-enter(r5)
            com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility r1 = r5.LLJJJ     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L51
            X.0QSJ r1 = r5.LLJJJJ     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L3f
            X.0Q7z r4 = r5.LLJJJIL     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L30
            X.0Q7z r4 = X.C687700QyG.LJIIIZ(r5)     // Catch: java.lang.Throwable -> L4e
            r5.LLJJJIL = r4     // Catch: java.lang.Throwable -> L4e
        L30:
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<com.ss.android.ugc.feed.platform.panel.RootPanelScope> r2 = com.ss.android.ugc.feed.platform.panel.RootPanelScope.class
            r1 = 0
            r3[r1] = r2     // Catch: java.lang.Throwable -> L4e
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r4, r3)     // Catch: java.lang.Throwable -> L4e
            r5.LLJJJJ = r1     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L47
        L3f:
            java.lang.Class<com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility> r0 = com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L4e
            com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility r0 = (com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility) r0     // Catch: java.lang.Throwable -> L4e
        L47:
            r5.LLJJJ = r0     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
            r1 = r0
            if (r0 == 0) goto L55
            goto L52
        L4e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L51:
            monitor-exit(r5)
        L52:
            r1.S11(r6)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.STMLynxOverlayAssem.hp(java.lang.String):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        ViewGroup viewGroup;
        super.onViewCreated(view);
        C1548820qPI.LIZLLL("dismiss_fyp_lynx_overlay", this.LLJJIJIL);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.w8_);
        if (viewGroup2 == null) {
            return;
        }
        C20544915aJ.LIZ.getClass();
        if (C20544915aJ.LIZJ == EnumC20545715aR.LLILLL && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = C20544915aJ.LJ) != null) {
            ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, viewGroup);
            }
            C20544915aJ.LJ = null;
            C20544915aJ.LIZJ(EnumC20545715aR.LLILZ, "consumed");
            C20544915aJ.LJII = System.currentTimeMillis();
            this.LLJJIJIIJIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
            viewGroup2.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new FrameLayout.LayoutParams(-1, -1));
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LIZ("activate_fyp_lynx_overlay", null);
            return;
        }
        hp("lynx_preloaded_view_missing");
    }
}
