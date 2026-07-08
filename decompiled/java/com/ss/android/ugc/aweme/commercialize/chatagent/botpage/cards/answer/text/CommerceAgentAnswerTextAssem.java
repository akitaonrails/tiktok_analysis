package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.answer.text;

import X.C0WOV;
import X.C1028380crs;
import X.C1029740cu4;
import X.C1052040dU2;
import X.C1052050dU3;
import X.C1052070dU5;
import X.C1227904rF;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C321300Cie;
import X.C321490Cix;
import X.C340910DYb;
import X.C444960Hcc;
import X.C723830SaL;
import X.C786410Ut5;
import X.InterfaceC1051190dSf;
import X.InterfaceC1860810yWV;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base.CommerceAgentAnswerBaseAssem;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BotConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAgentAnswerTextAssem extends CommerceAgentAnswerBaseAssem<C321300Cie> {
    public C321490Cix LLJLILLLLZIIL;
    public String LLJLL;
    public final Map<String, C1052070dU5> LLJLLIL = new LinkedHashMap();
    public long LLJLLL;
    public long LLJZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ak0;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base.CommerceAgentAnswerBaseAssem
    public final InterfaceC1860810yWV sp() {
        return (C340910DYb) LJJIJL().findViewById(R.id.ety);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS595S0100000_16(this, 69));
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base.CommerceAgentAnswerBaseAssem
    /* JADX INFO: renamed from: zp, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C321300Cie r53) {
        /*
            Method dump skipped, instruction units count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.answer.text.CommerceAgentAnswerTextAssem.op(X.0Cie):void");
    }

    public static void up(FrameLayout frameLayout, View view) {
        ViewGroup viewGroup;
        if (view != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
            frameLayout.addView(view);
        }
    }

    public final n yp(Aweme aweme, C1052040dU2 c1052040dU2) {
        boolean z;
        Resources resources;
        Configuration configuration;
        BotConfig botConfig;
        Object obj;
        n nVar = new n();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String logExtra = null;
        if (awemeRawAd != null) {
            logExtra = awemeRawAd.getLogExtra();
        }
        nVar.LJJIIJ("logExtra", logExtra);
        nVar.LJJIIJ("frontendData", c1052040dU2.LIZ());
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && (botConfig = awemeRawAd2.getBotConfig()) != null && (obj = botConfig.commonData) != null) {
            try {
                C1227904rF.LIZ.getClass();
                nVar.LJJIFFI("commonData", C1227904rF.LIZLLL().LJIJJLI(obj));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        nVar.LJJIIJ("componentType", c1052040dU2.LIZ.componentName);
        String groupId = aweme.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        nVar.LJJIIJ("groupID", groupId);
        nVar.LJJII(Boolean.valueOf(C444960Hcc.LIZIZ()), "isRTL");
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && (configuration.uiMode & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        nVar.LJJII(Boolean.valueOf(z), "isDarkMode");
        return nVar;
    }

    public final void Bp(LynxView lynxView, C1052040dU2 c1052040dU2, Aweme aweme) {
        TemplateData templateDataLJII = TemplateData.LJII(C2097608Jq.LJ());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Uri uri = UriProtector.parse(c1052040dU2.LIZIZ());
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                linkedHashMap.put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
        }
        linkedHashMap.put("initialData", yp(aweme, c1052040dU2).toString());
        linkedHashMap.put("isReload", 1);
        lynxView.reloadTemplate(templateDataLJII, TemplateData.LJII(C2097908Jt.LIZJ(new Pair("queryItems", linkedHashMap))));
    }

    public final void Ap(final FrameLayout frameLayout, C1052050dU3 c1052050dU3, final String str, final String str2, final String str3) {
        String creativeIdStr;
        String logExtra;
        Integer numValueOf;
        IAdHybridContainerManager iAdHybridContainerManager = c1052050dU3.LJFF;
        Context context = c1052050dU3.LIZ;
        Aweme aweme = c1052050dU3.LIZIZ;
        C0WOV c0wov = C0WOV.SPARK;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        Integer numValueOf2 = null;
        if (awemeRawAd != null) {
            creativeIdStr = awemeRawAd.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            logExtra = awemeRawAd2.getLogExtra();
        } else {
            logExtra = null;
        }
        String groupId = aweme.getGroupId();
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            numValueOf = Integer.valueOf(awemeRawAd3.getChargeType());
        } else {
            numValueOf = null;
        }
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (awemeRawAd4 != null) {
            numValueOf2 = Integer.valueOf(awemeRawAd4.getSystemOrigin());
        }
        iAdHybridContainerManager.LIZLLL(new C1028380crs("iab_chat_agent_msg_card", c0wov, context, new C1029740cu4(creativeIdStr, logExtra, groupId, numValueOf, numValueOf2, null, false, 96)), c1052050dU3.LJ).LJJ(c1052050dU3.LJ, new InterfaceC1051190dSf() { // from class: X.0dU0
            @Override // X.InterfaceC1051190dSf
            public final void k3(String str4, String str5) {
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
            @Override // X.InterfaceC1051190dSf
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void A9(X.C1014910cW9 r16) {
                /*
                    r15 = this;
                    r0 = r16
                    android.view.View r4 = r0.LIZ
                    boolean r0 = r4 instanceof X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB
                    r5 = 0
                    if (r0 == 0) goto L7d
                    X.0qEB r4 = (X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) r4
                    if (r4 == 0) goto L7e
                    X.0qEH r0 = r4.getKitView()
                    if (r0 == 0) goto L7e
                    android.view.View r2 = r0.e1()
                L17:
                    com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.answer.text.CommerceAgentAnswerTextAssem r1 = r15.LL
                    android.widget.FrameLayout r0 = r2
                    r1.getClass()
                    com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.answer.text.CommerceAgentAnswerTextAssem.up(r0, r2)
                    if (r4 == 0) goto L33
                    com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.answer.text.CommerceAgentAnswerTextAssem r0 = r15.LL
                    java.lang.String r3 = r3
                    java.lang.String r2 = r5
                    java.util.Map<java.lang.String, X.0dU5> r1 = r0.LLJLLIL
                    X.0dU5 r0 = new X.0dU5
                    r0.<init>(r4, r2)
                    r1.put(r3, r0)
                L33:
                    com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.answer.text.CommerceAgentAnswerTextAssem r0 = r15.LL
                    X.0Cix r0 = r0.LLJLILLLLZIIL
                    com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message r0 = X.C320800Chq.LIZ(r0)
                    if (r0 == 0) goto L7b
                    boolean r0 = r0.LIZIZ
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                L43:
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    boolean r14 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C321640CjC.LIZ
                    if (r0 == 0) goto L79
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                L51:
                    if (r0 == 0) goto L77
                    java.lang.String r4 = r0.getCreativeIdStr()
                    java.lang.String r5 = r0.getLogExtra()
                L5b:
                    java.lang.String r6 = r4
                    java.lang.String r7 = r3
                    java.lang.String r8 = "0"
                    com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.answer.text.CommerceAgentAnswerTextAssem r0 = r15.LL
                    long r9 = r0.LLJZ
                    long r0 = r0.LLJLLL
                    long r9 = r9 - r0
                    long r11 = java.lang.System.currentTimeMillis()
                    com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.answer.text.CommerceAgentAnswerTextAssem r0 = r15.LL
                    long r0 = r0.LLJZ
                    long r11 = r11 - r0
                    java.lang.String r13 = "new"
                    X.C1052060dU4.LIZ(r4, r5, r6, r7, r8, r9, r11, r13, r14)
                    return
                L77:
                    r4 = r5
                    goto L5b
                L79:
                    r0 = r5
                    goto L51
                L7b:
                    r1 = r5
                    goto L43
                L7d:
                    r4 = r5
                L7e:
                    r2 = r5
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1052020dU0.A9(X.0cW9):void");
            }
        }, null);
    }
}
