package com.ss.android.ugc.rtc.spi;

import X.AbstractC1387200mCc;
import X.AnonymousClass1403;
import X.AnonymousClass1405;
import X.C01GW;
import X.C0B6W;
import X.C0B6X;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1906580ziK;
import X.C202068144s;
import X.C452501pT;
import X.C786410Ut5;
import X.C844020X9c;
import X.C844470XAv;
import X.EnumC19508711Uf;
import X.InterfaceC842850X4p;
import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.rtc.plugin.ILyraxPlugin;
import com.ss.bytertc.engine.loader.LyraxPluginConfig;
import jv6.a;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class LyraxPluginImpl implements ILyraxPlugin {
    public static volatile boolean LIZJ;
    public final C01GW LIZ;
    public volatile EnumC19508711Uf LIZIZ;

    public LyraxPluginImpl() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(199));
        this.LIZ = c01gwLIZIZ;
        this.LIZIZ = EnumC19508711Uf.LL;
        if (((IPluginService) c01gwLIZIZ.getValue()).checkPluginInstalled("com.ss.android.ugc.aweme.df_rtc")) {
            this.LIZIZ = EnumC19508711Uf.LLILZ;
        }
    }

    public final void LIZIZ(Context context) {
        if (context != null) {
            a.install(context);
        } else {
            C844470XAv.LIZ.getClass();
            a.install(C844470XAv.LIZ());
        }
        for (Activity activity : ActivityStack.getActivityStack()) {
            a.LIZLLL(activity);
        }
        this.LIZIZ = EnumC19508711Uf.LLILZ;
    }

    @Override // com.ss.android.ugc.rtc.plugin.ILyraxPlugin
    public final boolean LIZ(final Context context, boolean z) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJFF;
        Activity activityLIZIZ;
        Activity activityLIZ;
        Activity activityLIZIZ2;
        int iN3;
        if (!LIZJ && ((Boolean) C0B6X.LIZ.getValue()).booleanValue()) {
            LyraxPluginConfig.setPluginState(2);
            LIZJ = true;
        }
        if (!((Boolean) C0B6X.LIZ.getValue()).booleanValue() && !((Boolean) C0B6W.LIZ.getValue()).booleanValue()) {
            return true;
        }
        EnumC19508711Uf enumC19508711Uf = this.LIZIZ;
        EnumC19508711Uf enumC19508711Uf2 = EnumC19508711Uf.LLILZ;
        if (enumC19508711Uf == enumC19508711Uf2) {
            return true;
        }
        if (((IPluginService) this.LIZ.getValue()).checkPluginInstalled("com.ss.android.ugc.aweme.df_rtc")) {
            this.LIZIZ = EnumC19508711Uf.LLILLL;
            LIZIZ(context);
            return true;
        }
        if (z && (((context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) || (((abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (activityLIZIZ2 = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ2)) != null) || ((abstractC1387200mCcLJFF = C1906580ziK.LJFF()) != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null))) && (iN3 = C786410Ut5.n3(activityLIZ.getResources(), "offloadedFeatures_settingUpToast_LIVE", "string", activityLIZ.getPackageName())) != 0)) {
            String string = activityLIZ.getString(iN3);
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
        EnumC19508711Uf enumC19508711Uf3 = this.LIZIZ;
        EnumC19508711Uf enumC19508711Uf4 = EnumC19508711Uf.LLILLJJLI;
        if (enumC19508711Uf3 != enumC19508711Uf4) {
            final AFwS219S0000000_30 aFwS219S0000000_30 = AFwS219S0000000_30.get$arr$(198);
            if (this.LIZIZ == enumC19508711Uf2) {
                aFwS219S0000000_30.getClass();
            } else {
                if (((IPluginService) this.LIZ.getValue()).checkPluginInstalled("com.ss.android.ugc.aweme.df_rtc")) {
                    this.LIZIZ = EnumC19508711Uf.LLILLL;
                    LIZIZ(context);
                    aFwS219S0000000_30.getClass();
                    return false;
                }
                this.LIZIZ = enumC19508711Uf4;
                C844020X9c c844020X9c = new C844020X9c();
                c844020X9c.LIZ = "com.ss.android.ugc.aweme.df_rtc";
                c844020X9c.LIZIZ = false;
                AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
                anonymousClass1403.LJIIIZ = false;
                c844020X9c.LJ = new AnonymousClass1405(anonymousClass1403);
                c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.140w
                    @Override // X.InterfaceC842850X4p
                    public final void LIZJ(String str, boolean z2) {
                        this.LIZ.LIZIZ = EnumC19508711Uf.LLILLL;
                        this.LIZ.LIZIZ(context);
                        aFwS219S0000000_30.invoke();
                    }

                    @Override // X.InterfaceC842850X4p
                    public final void LIZ(int i, String str, boolean z2) {
                        this.LIZ.LIZIZ = EnumC19508711Uf.LL;
                    }
                };
                ((IPluginService) this.LIZ.getValue()).LJJI(new C202068144s(c844020X9c));
                return false;
            }
        }
        return false;
    }
}
