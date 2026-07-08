package com.ss.android.ugc.aweme.tako.ui;

import X.AbstractC1905540zge;
import X.C013C;
import X.C01GW;
import X.C07CP;
import X.C07QG;
import X.C07QI;
import X.C07QU;
import X.C08A4;
import X.C09AE;
import X.C0CS4;
import X.C0DQG;
import X.C0PEM;
import X.C1099104Rp;
import X.C1227904rF;
import X.C123100dR;
import X.C1254880ilC;
import X.C1308910kAL;
import X.C13LP;
import X.C144I;
import X.C144O;
import X.C14FI;
import X.C14FL;
import X.C14FU;
import X.C14FV;
import X.C15438062q;
import X.C1697810uHb;
import X.C1859007Pw;
import X.C1862330yYx;
import X.C1862720yZa;
import X.C1863380yae;
import X.C1863420yai;
import X.C1863850ybP;
import X.C1905510zgb;
import X.C199Y;
import X.C19EH;
import X.C1AF0;
import X.C202069144t;
import X.C20227014Cm;
import X.C20227114Cn;
import X.C20227214Co;
import X.C20227614Cs;
import X.C20230914Dz;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2276501E8q;
import X.C23250099c;
import X.C259800zU;
import X.C298850BnX;
import X.C298860BnY;
import X.C299020Bno;
import X.C324860CoO;
import X.C324920CoU;
import X.C335910DEv;
import X.C426750GoL;
import X.C634060Otw;
import X.C688120Qyw;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC20660615sy;
import X.InterfaceC214902198i;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.crash.Npth;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.gson.Gson;
import com.google.gson.o;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceItemBridge;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceLinkItemBridge;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationEntranceInfo;
import com.ss.android.ugc.aweme.tako.experiment.TakoWaitNewMsgWhileLoadingExperimentConfig;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.LastMessageInfo;
import com.ss.android.ugc.aweme.tako.router.model.TakoAttachedLandingPage;
import com.ss.android.ugc.aweme.tako.router.model.TakoBehaviorCollectData;
import com.ss.android.ugc.aweme.tako.router.model.TakoInteractGuideData;
import com.ss.android.ugc.aweme.tako.router.model.TakoSubConversationData;
import com.ss.android.ugc.aweme.tako.signal.impl.TakoContextAbilityImpl;
import com.zhiliaoapp.musically.R;
import defpackage.w2;
import irm.AkS96S0100000_30;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS0S0210200_4;
import kotlin.jvm.internal.AwS36S0200100_4;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoChatActivity extends C199Y implements InterfaceC20660615sy {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjHELIOSEtIiB9PSxiHS44JwYkKDsSKzElPyYnMQ==";
    public final boolean LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final List<Function0<Boolean>> LLJLILLLLZIIL;
    public boolean LLJLL;
    public C0DQG LLJLLIL;
    public final C144O LLJLLL;

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean isDelegateFragmentManager() {
        return true;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean migrateDarkModeImplToFragment() {
        return true;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean migrateImmersiveBarImplToFragment() {
        return true;
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.ui.TakoChatActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.ui.TakoChatActivity", "onResume", false);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.ui.TakoChatActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.ui.TakoChatActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.ui.TakoChatActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return false;
    }

    public final TakoEnterParams DN1() {
        return (TakoEnterParams) this.LLILLJJLI.getValue();
    }

    public final boolean LLLLZLL() {
        TakoInteractGuideData takoInteractGuideData;
        LastMessageInfo lastMessageInfo;
        List<Message> list;
        Message message;
        TakoSubConversationData takoSubConversationData;
        AIBotInfo aIBotInfo;
        AIBotInfo aIBotInfo2;
        TakoWaitNewMsgWhileLoadingExperimentConfig takoWaitNewMsgWhileLoadingExperimentConfig = C07QU.LIZ;
        if (!C07QU.LIZJ) {
            return false;
        }
        TakoEnterParams takoEnterParamsDN1 = DN1();
        String str = null;
        if (takoEnterParamsDN1 == null || (takoInteractGuideData = takoEnterParamsDN1.interactGuideData) == null || (lastMessageInfo = takoInteractGuideData.lastMessageInfo) == null || !lastMessageInfo.unread) {
            return false;
        }
        C1863420yai c1863420yai = C1863380yae.LJJII;
        TakoEnterParams takoEnterParamsDN12 = DN1();
        Long lValueOf = (takoEnterParamsDN12 == null || (aIBotInfo2 = takoEnterParamsDN12.botInfo) == null) ? null : Long.valueOf(aIBotInfo2.botId);
        TakoEnterParams takoEnterParamsDN13 = DN1();
        Integer numValueOf = (takoEnterParamsDN13 == null || (aIBotInfo = takoEnterParamsDN13.botInfo) == null) ? null : Integer.valueOf(aIBotInfo.botSource);
        TakoEnterParams takoEnterParamsDN14 = DN1();
        w2 w2VarLJI = c1863420yai.LJI(numValueOf, lValueOf, (takoEnterParamsDN14 == null || (takoSubConversationData = takoEnterParamsDN14.subConversationData) == null) ? null : takoSubConversationData.subConversationId);
        if (w2VarLJI != null && (list = w2VarLJI.LIZIZ) != null && (message = (Message) C13LP.LJJLIIIJL(list)) != null) {
            str = message.msgId;
        }
        return !Intrinsics.LJFF(str, lastMessageInfo.msgId);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        return new C688120Qyw(this, this, null);
    }

    @Override // X.C199Y, X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.LL) {
            super.onBackPressed();
            return;
        }
        TakoEnterParams takoEnterParamsDN1 = DN1();
        boolean zLIZJ = takoEnterParamsDN1 != null ? C20227614Cs.LIZJ(takoEnterParamsDN1) : false;
        int i = C14FI.LIZ;
        TakoEnterParams takoEnterParamsDN12 = DN1();
        if (C14FI.LIZIZ(takoEnterParamsDN12 != null ? takoEnterParamsDN12.processId : null) && !zLIZJ) {
            C14FU c14fu = C14FU.LIZ;
            InterfaceC214902198i interfaceC214902198iLIZLLL = C20230914Dz.LIZLLL(this);
            C144O c144o = this.LLJLLL;
            c14fu.getClass();
            C14FU.LIZLLL(this, interfaceC214902198iLIZLLL, c144o);
            return;
        }
        if (getSupportFragmentManager().LJJLIIIIJ() > 0) {
            getSupportFragmentManager().LJLLILLLL();
            return;
        }
        if (C298850BnX.LIZ()) {
            C07QI.LIZ.getClass();
            if (!C07QI.LIZ()) {
                super.onBackPressed();
                Iterator it2 = ((ArrayList) this.LLJLILLLLZIIL).iterator();
                while (it2.hasNext()) {
                    ((Function0) it2.next()).invoke();
                }
                ((ArrayList) this.LLJLILLLLZIIL).clear();
                return;
            }
        }
        Iterator it3 = ((ArrayList) this.LLJLILLLLZIIL).iterator();
        while (it3.hasNext()) {
            if (((Boolean) ((Function0) it3.next()).invoke()).booleanValue()) {
                return;
            }
        }
        super.onBackPressed();
        ((ArrayList) this.LLJLILLLLZIIL).clear();
    }

    /* JADX WARN: Type inference failed for: r0v88, types: [X.144O] */
    public TakoChatActivity() {
        this.LL = C07CP.LIZ() && ((Boolean) C1099104Rp.LIZ.getValue()).booleanValue();
        this.LLILLJJLI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(199), "tako_enter_param", TakoEnterParams.class);
        this.LLILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(196), "sug_source", String.class);
        this.LLILZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(200), "enter_from", String.class);
        this.LLILZIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(202), "enter_method", String.class);
        this.LLILZLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(203), "token_type", String.class);
        this.LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(220), "search_id", String.class);
        this.LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(221), "search_keyword", String.class);
        this.LLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(195), "sug_query", String.class);
        this.LLJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(208), "message_content", String.class);
        this.LLJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(209), "web_doc_list", String.class);
        this.LLJILJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(219), "search_general_card_type", String.class);
        this.LLJILJILJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(218), "card_type", Integer.class);
        this.LLJILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(192), "send_msg_type", Integer.class);
        this.LLJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(216), "query", String.class);
        this.LLJJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(214), "channel", Integer.class);
        this.LLJJIII = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(215), "msg_id", String.class);
        this.LLJJIJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(213), "push_id", String.class);
        this.LLJJIJIIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(198), "chat_mob_params", String.class);
        this.LLJJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(205), "type", String.class);
        this.LLJJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(206), "interaction_type", String.class);
        this.LLJJJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(194), "sug_list", String.class);
        this.LLJJJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(204), "enter_start_time", Long.class);
        this.LLJJJJJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(217), "sar_info", String.class);
        this.LLJJJJLIIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(212), "process_id", String.class);
        this.LLJJL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(207), "landing_page", String.class);
        this.LLJJLIIIJLLLLLLLZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(201), "template_id", String.class);
        this.LLJL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(197), "tab_id", String.class);
        this.LLJLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(193), "tako_sub_conversation_info", String.class);
        this.LLJLILLLLZIIL = new ArrayList();
        this.LLJLLL = new C14FV() { // from class: X.144O
            @Override // X.C14FV
            public final void LIZIZ() throws JSONException {
                this.LIZ.getClass();
                C1863850ybP c1863850ybP = (C1863850ybP) ((TakoContextAbilityImpl) C144I.LIZ()).T71().LIZIZ();
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str = c1863850ybP.LLILZIL;
                String str2 = c1863850ybP.LLILZLL;
                if (str2 == null) {
                    str2 = "";
                }
                C1862330yYx.LJLLL(c1862330yYx, str, str2, c1863850ybP.LLIZ, c1863850ybP.LL, c1863850ybP.LLILLJJLI, "popup");
            }

            @Override // X.C14FV
            public final void onSuccess() {
                Iterator it2 = ((ArrayList) this.LIZ.LLJLILLLLZIIL).iterator();
                while (it2.hasNext()) {
                    ((Function0) it2.next()).invoke();
                }
                ((ArrayList) this.LIZ.LLJLILLLLZIIL).clear();
                this.LIZ.finish();
            }

            @Override // X.C14FV
            public final void LIZ(String str) throws JSONException {
                Iterator<Function0<Boolean>> it2 = this.LIZ.LLJLILLLLZIIL.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke();
                }
                ((ArrayList) this.LIZ.LLJLILLLLZIIL).clear();
                this.LIZ.LLLLZLLIL(str);
                this.LIZ.finish();
            }

            @Override // X.C14FV
            public final void LIZJ(String str) throws JSONException {
                this.LIZ.LLLLZLLIL(str);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZIL() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.ui.TakoChatActivity.LLLLZIL():void");
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        String str;
        super.finish();
        TakoEnterParams takoEnterParamsDN1 = DN1();
        if (takoEnterParamsDN1 == null || (str = takoEnterParamsDN1.enterFrom) == null) {
            str = "";
        }
        if (Intrinsics.LJFF(str, "notification_page_tikbot")) {
            return;
        }
        C20227114Cn c20227114Cn = C20227114Cn.LIZ;
        TakoEnterParams takoEnterParamsDN12 = DN1();
        c20227114Cn.getClass();
        if ((((Number) C20227114Cn.LIZIZ.getValue()).intValue() == 0 || !C20227114Cn.LIZ(takoEnterParamsDN12)) && !C20227014Cm.LIZ(DN1())) {
            C1254880ilC.LIZ.getClass();
            C1254880ilC.LIZ(this, false, 0);
            return;
        }
        int i = C426750GoL.LIZLLL(this) ? R.anim.m_ : R.anim.mc;
        if (Build.VERSION.SDK_INT >= 34) {
            C786410Ut5.Zd(this, 1, 0, i);
        } else {
            C786410Ut5.ke(this, 0, i);
        }
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return C634060Otw.LIZ(this);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.LL) {
            return;
        }
        if (this.LLJLL) {
            C0CS4.LIZ();
        }
        Npth.removeTag("tako");
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean getEnableSAF() {
        return this.LL;
    }

    @Override // X.C199Y
    public final Class<? extends InterfaceC214902198i> getRootFragmentClz() {
        return TakoChatRootFragment.class;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.0956] */
    public final void LLLLZI(SubConversationEntranceInfo subConversationEntranceInfo) {
        boolean zLIZ = C1859007Pw.LIZ();
        C259800zU c259800zU = new C259800zU();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C013C c013c = new C013C();
        if (zLIZ) {
            C0DQG c0dqg = new C0DQG(findViewById(R.id.x3q));
            this.LLJLLIL = c0dqg;
            c0dqg.LIZ();
            c013c.element = true;
            C0DQG c0dqg2 = this.LLJLLIL;
            if (c0dqg2 != null) {
                AwS36S0200100_4 awS36S0200100_4 = new AwS36S0200100_4(c259800zU, (C259800zU<C09AE>) jCurrentTimeMillis, (long) this, (TakoChatActivity) 0);
                View view = c0dqg2.LIZJ;
                if (view != null) {
                    C786410Ut5.I7(new AkS96S0100000_30(awS36S0200100_4, 2), view);
                }
            }
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
            immersionBarLJIILJJIL.LJIIL();
            tuxImmersionBar.LIZ(true);
            tuxImmersionBar.LIZLLL();
        }
        c259800zU.element = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C324860CoO(this, subConversationEntranceInfo, zLIZ, jCurrentTimeMillis, c013c, null), 2);
    }

    public final void LLLLZLLIL(String str) throws JSONException {
        C1863850ybP c1863850ybP = (C1863850ybP) ((TakoContextAbilityImpl) C144I.LIZ()).T71().LIZIZ();
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str2 = c1863850ybP.LLILZIL;
        String str3 = c1863850ybP.LLILZLL;
        if (str3 == null) {
            str3 = "";
        }
        C1862330yYx.LJLLJ(c1862330yYx, str2, c1863850ybP.LL, c1863850ybP.LLILLJJLI, str3, c1863850ybP.LLIZ, "popup", str);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException {
        String str;
        TakoEnterParams takoEnterParamsDN1;
        boolean z;
        int i;
        TakoEnterParams takoEnterParamsDN12;
        TakoSubConversationData takoSubConversationData;
        TakoEnterParams takoEnterParamsDN13;
        TakoEnterParams takoEnterParamsDN14;
        TakoEnterParams takoEnterParamsDN15;
        List<String> list;
        TakoEnterParams takoEnterParamsDN16;
        TakoEnterParams takoEnterParamsDN17;
        Integer num;
        TakoEnterParams takoEnterParamsDN18;
        TakoEnterParams takoEnterParamsDN19;
        TakoEnterParams takoEnterParamsDN110;
        TakoEnterParams takoEnterParamsDN111;
        TakoEnterParams takoEnterParamsDN112;
        TakoEnterParams takoEnterParamsDN113;
        TakoEnterParams takoEnterParamsDN114;
        Map<String, String> mapLIZ;
        TakoEnterParams takoEnterParamsDN115;
        TakoEnterParams takoEnterParamsDN116;
        TakoBehaviorCollectData behaviorCollectDataAndInit;
        TakoEnterParams takoEnterParamsDN117;
        TakoEnterParams takoEnterParamsDN118;
        TakoEnterParams takoEnterParamsDN119;
        TakoEnterParams takoEnterParamsDN120;
        TakoEnterParams takoEnterParamsDN121;
        TakoEnterParams takoEnterParamsDN122;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.ui.TakoChatActivity", "onCreate", true);
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        if (this.LL) {
            super.onCreate(bundle);
            activityConfiguration(AFwS274S0000000_30.get$arr$(210));
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.ui.TakoChatActivity", "onCreate", false);
            return;
        }
        C1862720yZa.LIZ.getClass();
        C1862720yZa.LIZJ(null, this);
        TakoEnterParams takoEnterParamsDN123 = DN1();
        if (takoEnterParamsDN123 != null && C20227614Cs.LIZLLL(takoEnterParamsDN123) && C298860BnY.LIZ()) {
            getTheme().applyStyle(R.style.z4, true);
        }
        super.onCreate(bundle);
        setContentView(R.layout.fjc);
        String str2 = (String) this.LLILLL.getValue();
        if (str2 != null && C123100dR.LIZ(str2) && (takoEnterParamsDN122 = DN1()) != null) {
            takoEnterParamsDN122.setSugSource(str2);
        }
        String str3 = (String) this.LLILZ.getValue();
        if (str3 != null && C123100dR.LIZ(str3) && (takoEnterParamsDN121 = DN1()) != null) {
            takoEnterParamsDN121.setEnterFrom(str3);
        }
        String str4 = (String) this.LLILZIL.getValue();
        if (str4 != null && C123100dR.LIZ(str4) && (takoEnterParamsDN120 = DN1()) != null) {
            takoEnterParamsDN120.setEnterMethod(str4);
        }
        String str5 = (String) this.LLJJJJLIIL.getValue();
        if (str5 != null && C123100dR.LIZ(str5) && Intrinsics.LJFF(this.LLILZ.getValue(), "notification_page_tikbot") && Intrinsics.LJFF(this.LLILZIL.getValue(), "click_tikbot_cell") && C2276501E8q.LIZ() && (takoEnterParamsDN119 = DN1()) != null) {
            takoEnterParamsDN119.setProcessId(str5);
        }
        String str6 = (String) this.LLJJ.getValue();
        if (str6 != null && C123100dR.LIZ(str6) && (takoEnterParamsDN118 = DN1()) != null) {
            takoEnterParamsDN118.setAutoSendMsgContent(str6);
        }
        Integer num2 = (Integer) this.LLJILLL.getValue();
        if (num2 != null && num2.intValue() != -1) {
            int iIntValue = num2.intValue();
            TakoEnterParams takoEnterParamsDN124 = DN1();
            if (takoEnterParamsDN124 != null) {
                takoEnterParamsDN124.setAutoSendMsgType(Integer.valueOf(iIntValue));
            }
        }
        Integer num3 = (Integer) this.LLJJI.getValue();
        if (num3 != null && C08A4.LIZ(Integer.valueOf(num3.intValue()))) {
            int iIntValue2 = num3.intValue();
            TakoEnterParams takoEnterParamsDN125 = DN1();
            if (takoEnterParamsDN125 != null) {
                takoEnterParamsDN125.setPushMsgChannel(iIntValue2);
            }
        }
        String str7 = (String) this.LLJJIII.getValue();
        if (str7 != null && C123100dR.LIZ(str7) && (takoEnterParamsDN117 = DN1()) != null) {
            takoEnterParamsDN117.setPushMsgId(str7);
        }
        String str8 = (String) this.LLJJIJI.getValue();
        if (str8 != null && str8.length() > 0 && (takoEnterParamsDN116 = DN1()) != null && (behaviorCollectDataAndInit = takoEnterParamsDN116.getBehaviorCollectDataAndInit()) != null) {
            behaviorCollectDataAndInit.setChatMobParams(C2097608Jq.LJIIJ(new Pair("push_id", str8)));
            behaviorCollectDataAndInit.setSendMessageMobParams(C2097608Jq.LJIIJ(new Pair("push_id", str8)));
        }
        String str9 = (String) this.LLJJIJIIJIL.getValue();
        if (str9 != null && (mapLIZ = C1905510zgb.LIZ(str9)) != null && (!mapLIZ.isEmpty()) && (takoEnterParamsDN115 = DN1()) != null) {
            takoEnterParamsDN115.addChatMobParams(mapLIZ);
            takoEnterParamsDN115.addSendMessageMobParams(mapLIZ);
        }
        String str10 = (String) this.LLILZLL.getValue();
        if (str10 != null && C123100dR.LIZ(str10) && (takoEnterParamsDN114 = DN1()) != null) {
            takoEnterParamsDN114.setTokenType(str10);
        }
        String str11 = (String) this.LLIZ.getValue();
        if (str11 != null && C123100dR.LIZ(str11) && (takoEnterParamsDN113 = DN1()) != null) {
            takoEnterParamsDN113.setEnterSearchId(str11);
        }
        String str12 = (String) this.LLIZLLLIL.getValue();
        if (str12 != null && C123100dR.LIZ(str12) && (takoEnterParamsDN112 = DN1()) != null) {
            takoEnterParamsDN112.setSearchKeyword(str12);
        }
        String str13 = (String) this.LLJ.getValue();
        if (str13 != null && C123100dR.LIZ(str13) && (takoEnterParamsDN111 = DN1()) != null) {
            takoEnterParamsDN111.setAutoSendMsgContent(str13);
        }
        String str14 = (String) this.LLJI.getValue();
        if (str14 != null && C123100dR.LIZ(str14) && (takoEnterParamsDN110 = DN1()) != null) {
            takoEnterParamsDN110.setCarriedSendAnswerContent(str14);
        }
        String str15 = (String) this.LLJILJIL.getValue();
        if (str15 != null && C123100dR.LIZ(str15) && (takoEnterParamsDN19 = DN1()) != null) {
            takoEnterParamsDN19.setSearchGeneralCardType(str15);
        }
        Integer num4 = (Integer) this.LLJILJILJ.getValue();
        if (num4 != null) {
            int iIntValue3 = num4.intValue();
            if (C08A4.LIZ(Integer.valueOf(iIntValue3)) && iIntValue3 != -1) {
                int iIntValue4 = num4.intValue();
                TakoEnterParams takoEnterParamsDN126 = DN1();
                if (takoEnterParamsDN126 != null) {
                    takoEnterParamsDN126.setSearchCardType(Integer.valueOf(iIntValue4));
                }
            }
        }
        String str16 = (String) this.LLIZ.getValue();
        if (str16 != null && C123100dR.LIZ(str16) && (num = (Integer) this.LLJILJILJ.getValue()) != null && num.intValue() == 43 && (takoEnterParamsDN18 = DN1()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) this.LLIZ.getValue());
            sbLIZ.append("-1");
            takoEnterParamsDN18.setCarriedRepeatKey(C2188811AlT.LIZIZ(sbLIZ));
        }
        String str17 = (String) this.LLJJIJIL.getValue();
        if (str17 != null && C123100dR.LIZ(str17) && (takoEnterParamsDN17 = DN1()) != null) {
            takoEnterParamsDN17.setType(str17);
        }
        String str18 = (String) this.LLJJJ.getValue();
        if (str18 != null && C123100dR.LIZ(str18) && (takoEnterParamsDN16 = DN1()) != null) {
            takoEnterParamsDN16.setInteractionType(str18);
        }
        String str19 = (String) this.LLJJJIL.getValue();
        if (str19 != null && C123100dR.LIZ(str19) && (takoEnterParamsDN15 = DN1()) != null) {
            try {
                C1227904rF.LIZ.getClass();
                list = (List) GsonProtectorUtils.fromJson(C1227904rF.LIZLLL(), str19, new AbstractC1905540zge<List<? extends String>>() { // from class: X.0zdK
                }.getType());
            } catch (o e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LIZLLL("tako sug_list parse error", C2097608Jq.LJI(new Pair("sug_list", str19)));
                list = null;
            }
            takoEnterParamsDN15.setCarriedSugList(list);
        }
        String str20 = (String) this.LLJIJIL.getValue();
        if (str20 != null && C123100dR.LIZ(str20)) {
            try {
                C1227904rF.LIZ.getClass();
                List list2 = (List) C1227904rF.LIZLLL().LJIIIIZZ(str20, new AbstractC1905540zge<List<? extends ReferenceLinkItemBridge>>() { // from class: X.0zd7
                }.getType());
                if (list2 != null && (!list2.isEmpty())) {
                    TakoEnterParams takoEnterParamsDN127 = DN1();
                    if (takoEnterParamsDN127 != null) {
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        int i2 = 0;
                        for (Object obj : list2) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                arrayList.add(new ReferenceItemBridge(i3, 0, (ReferenceLinkItemBridge) obj, null));
                                i2 = i3;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        takoEnterParamsDN127.setCarriedReferenceList(arrayList);
                    }
                    TakoEnterParams takoEnterParamsDN128 = DN1();
                    if (takoEnterParamsDN128 != null) {
                        takoEnterParamsDN128.setSearchCardType(50);
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        Long l = (Long) this.LLJJJJ.getValue();
        if (l != null && l.longValue() != 0) {
            long jLongValue = l.longValue();
            TakoEnterParams takoEnterParamsDN129 = DN1();
            if (takoEnterParamsDN129 != null) {
                takoEnterParamsDN129.setEnterStartTime(Long.valueOf(jLongValue));
            }
            TakoEnterParams takoEnterParamsDN130 = DN1();
            if (takoEnterParamsDN130 != null) {
                takoEnterParamsDN130.setFromSchema(true);
            }
        }
        String str21 = (String) this.LLJJJJJIL.getValue();
        if (str21 != null && C123100dR.LIZ(str21) && (takoEnterParamsDN14 = DN1()) != null) {
            takoEnterParamsDN14.setSarInfo(str21);
        }
        String str22 = (String) this.LLJJL.getValue();
        if (str22 != null && str22.length() > 0 && (takoEnterParamsDN13 = DN1()) != null) {
            String str23 = (String) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (str23 == null || str23.length() <= 0) {
                str23 = null;
            }
            String str24 = (String) this.LLJL.getValue();
            if (str24 == null || str24.length() <= 0) {
                str24 = null;
            }
            takoEnterParamsDN13.addInteractGuideData(new TakoInteractGuideData(null, null, null, null, null, null, false, null, new TakoAttachedLandingPage(str22, str23, str24), false, null, null, null));
        }
        String str25 = (String) this.LLJLIL.getValue();
        if (str25 != null && str25.length() > 0 && (takoEnterParamsDN12 = DN1()) != null) {
            try {
                takoSubConversationData = (TakoSubConversationData) new Gson().LJII(str25, TakoSubConversationData.class);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                takoSubConversationData = null;
            }
            takoEnterParamsDN12.setSubConversationData(takoSubConversationData);
        }
        TakoEnterParams takoEnterParamsDN131 = DN1();
        if (takoEnterParamsDN131 == null || (str = takoEnterParamsDN131.enterFrom) == null) {
            str = "";
        }
        if (!Intrinsics.LJFF(str, "notification_page_tikbot")) {
            C20227114Cn c20227114Cn = C20227114Cn.LIZ;
            TakoEnterParams takoEnterParamsDN132 = DN1();
            c20227114Cn.getClass();
            C01GW c01gw = C20227114Cn.LIZIZ;
            if (((Number) c01gw.getValue()).intValue() == 1 && C20227114Cn.LIZ(takoEnterParamsDN132)) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !C20227014Cm.LIZ(DN1())) {
                TakoEnterParams takoEnterParamsDN133 = DN1();
                if (((Number) c01gw.getValue()).intValue() == 2 && C20227114Cn.LIZ(takoEnterParamsDN133)) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        C786410Ut5.Zd(this, 0, R.anim.m6, 0);
                    } else {
                        C786410Ut5.ke(this, R.anim.m6, 0);
                    }
                } else {
                    C1254880ilC.LIZ.getClass();
                    C1254880ilC.LIZ(this, true, 1);
                }
            } else {
                if (C426750GoL.LIZLLL(this)) {
                    i = R.anim.m8;
                } else {
                    i = R.anim.m9;
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    C786410Ut5.Zd(this, 0, i, 0);
                } else {
                    C786410Ut5.ke(this, i, 0);
                }
            }
        } else {
            activityConfiguration(AFwS274S0000000_30.get$arr$(211));
        }
        Npth.addTag("tako", "enter");
        C0CS4.LIZIZ();
        if (bundle != null) {
            C07QG.LIZ.getClass();
            if (C07QG.LIZ() && (takoEnterParamsDN1 = DN1()) != null) {
                takoEnterParamsDN1.setProcessId(UUID.randomUUID().toString());
            }
        }
        LLLLZIL();
        boolean z2 = C14FL.LIZ;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C202069144t(DN1(), null), 3);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.ui.TakoChatActivity", "onCreate", false);
    }

    @Override // X.C199Y, X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) throws JSONException {
        super.onNewIntent(intent);
        if (this.LL) {
            return;
        }
        LLLLZIL();
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        super.onSaveInstanceState(bundle);
        if (!this.LL && (bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key")) != null) {
            C786410Ut5.LJJIJL(bundle2, "android:support:fragments", new Bundle());
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public final void LLLLLZL(long j, boolean z) {
        long jCurrentTimeMillis;
        if (z) {
            jCurrentTimeMillis = System.currentTimeMillis() - j;
        } else {
            jCurrentTimeMillis = 0;
        }
        if (!z) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C324920CoU(this, null), 2);
        }
        C20227214Co c20227214Co = TakoChatFragment.LLLLLL;
        TakoEnterParams takoEnterParamsDN1 = DN1();
        c20227214Co.getClass();
        TakoChatFragment takoChatFragment = new TakoChatFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "tako_enter_param", takoEnterParamsDN1);
        takoChatFragment.setArguments(bundle);
        ((ArrayList) this.LLJLILLLLZIIL).add(new AwS574S0100000_30(takoChatFragment, 280));
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiv, takoChatFragment, null);
        c19ehLJIIJ.LJIIJ();
        takoChatFragment.LLLL = new AwS0S0210200_4(this, z, j, takoChatFragment, jCurrentTimeMillis, 0);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.LL) {
            return;
        }
        Iterator<Fragment> it2 = getSupportFragmentManager().LJJLIIIJL().iterator();
        while (it2.hasNext()) {
            it2.next().onActivityResult(i, i2, intent);
        }
    }
}
