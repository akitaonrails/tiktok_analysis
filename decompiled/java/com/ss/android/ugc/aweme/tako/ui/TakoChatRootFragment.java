package com.ss.android.ugc.aweme.tako.ui;

import X.C013C;
import X.C01GW;
import X.C07QU;
import X.C098200Yq;
import X.C09AE;
import X.C0CS4;
import X.C0DQG;
import X.C0PEM;
import X.C13LP;
import X.C144I;
import X.C144P;
import X.C14FL;
import X.C14FV;
import X.C1685300txQ;
import X.C1859007Pw;
import X.C1859307Pz;
import X.C1859930yV5;
import X.C1862330yYx;
import X.C1863380yae;
import X.C1863420yai;
import X.C1863850ybP;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C202069144t;
import X.C20227214Co;
import X.C20227614Cs;
import X.C21146717pB;
import X.C23250099c;
import X.C259800zU;
import X.C294780Bgy;
import X.C298860BnY;
import X.C324850CoN;
import X.C324890CoR;
import X.C452501pT;
import X.C634060Otw;
import X.C688120Qyw;
import X.C786410Ut5;
import X.InterfaceC20660615sy;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationEntranceInfo;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import com.ss.android.ugc.aweme.tako.experiment.TakoWaitNewMsgWhileLoadingExperimentConfig;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.LastMessageInfo;
import com.ss.android.ugc.aweme.tako.router.model.TakoInteractGuideData;
import com.ss.android.ugc.aweme.tako.router.model.TakoSubConversationData;
import com.ss.android.ugc.aweme.tako.signal.impl.TakoContextAbilityImpl;
import com.zhiliaoapp.musically.R;
import defpackage.w2;
import irm.AkS96S0100000_30;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS0S0210200_4;
import kotlin.jvm.internal.AwS36S0200100_4;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoChatRootFragment extends SAFTikTokFragment implements InterfaceC20660615sy {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtHELIOSIiB9PSxiHS44JwYkKDsBJyo4Dz0yLygpJzs=";
    public final C01GW LLJILLL;
    public TakoEnterParams LLJJ;
    public final List<Function0<Boolean>> LLJJI;
    public boolean LLJJIII;
    public C0DQG LLJJIJI;
    public final C144P LLJJIJIIJIL;

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void finish() {
        C1859930yV5.LIZ(null);
        super.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            r4 = this;
            r2 = 0
            X.C1859930yV5.LIZ(r2)
            com.ss.android.ugc.aweme.tako.model.TakoEnterParams r0 = r4.LLJJ
            if (r0 == 0) goto L2c
            boolean r1 = X.C20227614Cs.LIZJ(r0)
        Lc:
            int r0 = X.C14FI.LIZ
            com.ss.android.ugc.aweme.tako.model.TakoEnterParams r0 = r4.LLJJ
            if (r0 == 0) goto L14
            java.lang.String r2 = r0.processId
        L14:
            boolean r0 = X.C14FI.LIZIZ(r2)
            r3 = 1
            if (r0 == 0) goto L2e
            if (r1 != 0) goto L2e
            X.14FU r2 = X.C14FU.LIZ
            X.19EG r1 = r4.getActivity()
            X.144P r0 = r4.LLJJIJIIJIL
            r2.getClass()
            X.C14FU.LIZLLL(r1, r4, r0)
            return r3
        L2c:
            r1 = 0
            goto Lc
        L2e:
            X.01GW r0 = r4.LLJILLL
            java.lang.Object r0 = r0.getValue()
            androidx.fragment.app.FragmentManager r0 = (androidx.fragment.app.FragmentManager) r0
            int r0 = r0.LJJLIIIIJ()
            if (r0 <= 0) goto L48
            X.01GW r0 = r4.LLJILLL
            java.lang.Object r0 = r0.getValue()
            androidx.fragment.app.FragmentManager r0 = (androidx.fragment.app.FragmentManager) r0
            r0.LJLLILLLL()
            return r3
        L48:
            boolean r0 = X.C298850BnX.LIZ()
            if (r0 == 0) goto L71
            X.07QI r0 = X.C07QI.LIZ
            r0.getClass()
            boolean r0 = X.C07QI.LIZ()
            if (r0 != 0) goto L71
            java.util.List<kotlin.jvm.functions.Function0<java.lang.Boolean>> r0 = r4.LLJJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L61:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r0 = r1.next()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r0.invoke()
            goto L61
        L71:
            java.util.List<kotlin.jvm.functions.Function0<java.lang.Boolean>> r0 = r4.LLJJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L79:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r1.next()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L79
            return r3
        L92:
            java.util.List<kotlin.jvm.functions.Function0<java.lang.Boolean>> r0 = r4.LLJJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
        L99:
            java.util.List<kotlin.jvm.functions.Function0<java.lang.Boolean>> r0 = r4.LLJJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            boolean r0 = super.onBackPressed()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.ui.TakoChatRootFragment.onBackPressed():boolean");
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return false;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void YP() {
        aS(new AwS609S0100000_30(this, 119));
        super.YP();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0177 A[PHI: r3
      0x0177: PHI (r3v5 long) = (r3v4 long), (r3v15 long) binds: [B:96:0x0174, B:77:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
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
    public final void kS() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.ui.TakoChatRootFragment.kS():void");
    }

    public final boolean mS() {
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
        TakoEnterParams takoEnterParams = this.LLJJ;
        String str = null;
        if (takoEnterParams == null || (takoInteractGuideData = takoEnterParams.interactGuideData) == null || (lastMessageInfo = takoInteractGuideData.lastMessageInfo) == null || !lastMessageInfo.unread) {
            return false;
        }
        C1863420yai c1863420yai = C1863380yae.LJJII;
        Long lValueOf = (takoEnterParams == null || (aIBotInfo2 = takoEnterParams.botInfo) == null) ? null : Long.valueOf(aIBotInfo2.botId);
        TakoEnterParams takoEnterParams2 = this.LLJJ;
        Integer numValueOf = (takoEnterParams2 == null || (aIBotInfo = takoEnterParams2.botInfo) == null) ? null : Integer.valueOf(aIBotInfo.botSource);
        TakoEnterParams takoEnterParams3 = this.LLJJ;
        w2 w2VarLJI = c1863420yai.LJI(numValueOf, lValueOf, (takoEnterParams3 == null || (takoSubConversationData = takoEnterParams3.subConversationData) == null) ? null : takoSubConversationData.subConversationId);
        if (w2VarLJI != null && (list = w2VarLJI.LIZIZ) != null && (message = (Message) C13LP.LJJLIIIJL(list)) != null) {
            str = message.msgId;
        }
        return !Intrinsics.LJFF(str, lastMessageInfo.msgId);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.144P] */
    public TakoChatRootFragment() {
        aS(AFwS232S0000000_4.get$arr$(92));
        this.LLJILLL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 286));
        this.LLJJI = new ArrayList();
        this.LLJJIJIIJIL = new C14FV() { // from class: X.144P
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
                Iterator it2 = ((ArrayList) this.LIZ.LLJJI).iterator();
                while (it2.hasNext()) {
                    ((Function0) it2.next()).invoke();
                }
                ((ArrayList) this.LIZ.LLJJI).clear();
                this.LIZ.finish();
            }

            @Override // X.C14FV
            public final void LIZ(String str) throws JSONException {
                Iterator<Function0<Boolean>> it2 = this.LIZ.LLJJI.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke();
                }
                ((ArrayList) this.LIZ.LLJJI).clear();
                this.LIZ.nS(str);
                this.LIZ.finish();
            }

            @Override // X.C14FV
            public final void LIZJ(String str) throws JSONException {
                this.LIZ.nS(str);
            }
        };
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return C634060Otw.LIZ(this);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        return new C688120Qyw(requireContext(), this, null);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLJJIII) {
            C0CS4.LIZ();
        }
        Npth.removeTag("tako");
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void LLLLIILLL(Bundle bundle) throws JSONException {
        Serializable serializable;
        super.LLLLIILLL(bundle);
        TakoEnterParams takoEnterParams = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("tako_enter_param");
        } else {
            serializable = null;
        }
        if (serializable instanceof TakoEnterParams) {
            takoEnterParams = (TakoEnterParams) serializable;
        }
        this.LLJJ = takoEnterParams;
        kS();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.0956] */
    public final void iS(SubConversationEntranceInfo subConversationEntranceInfo) {
        boolean zLIZ = C1859007Pw.LIZ();
        C013C c013c = new C013C();
        C259800zU c259800zU = new C259800zU();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C013C c013c2 = new C013C();
        if (zLIZ) {
            C0DQG c0dqg = new C0DQG(getView());
            this.LLJJIJI = c0dqg;
            c0dqg.LIZ();
            c013c2.element = true;
            C0DQG c0dqg2 = this.LLJJIJI;
            if (c0dqg2 != null) {
                AwS36S0200100_4 awS36S0200100_4 = new AwS36S0200100_4(c259800zU, (C259800zU<C09AE>) jCurrentTimeMillis, (long) this, (TakoChatRootFragment) 2);
                View view = c0dqg2.LIZJ;
                if (view != null) {
                    C786410Ut5.I7(new AkS96S0100000_30(awS36S0200100_4, 2), view);
                }
            }
        }
        c259800zU.element = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C324850CoN(this, subConversationEntranceInfo, zLIZ, jCurrentTimeMillis, c013c2, c013c, null), 2);
    }

    public final void nS(String str) throws JSONException {
        C1863850ybP c1863850ybP = (C1863850ybP) ((TakoContextAbilityImpl) C144I.LIZ()).T71().LIZIZ();
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str2 = c1863850ybP.LLILZIL;
        String str3 = c1863850ybP.LLILZLL;
        if (str3 == null) {
            str3 = "";
        }
        C1862330yYx.LJLLJ(c1862330yYx, str2, c1863850ybP.LL, c1863850ybP.LLILLJJLI, str3, c1863850ybP.LLIZ, "popup", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Bundle arguments;
        Serializable serializable;
        C19EG activity;
        Resources.Theme theme;
        super.onCreate(bundle);
        Context context = getContext();
        TakoEnterParams takoEnterParams = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            serializable = null;
        } else {
            Fragment parentFragment = this;
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    Object obj = (InterfaceC214902198i) parentFragment;
                    if (obj == null || (arguments = ((Fragment) obj).getArguments()) == null) {
                        break;
                    } else {
                        serializable = arguments.getSerializable("tako_enter_param");
                    }
                } else {
                    parentFragment = parentFragment.getParentFragment();
                    if (parentFragment == 0) {
                        break;
                    }
                }
            }
            serializable = null;
        }
        if (serializable instanceof TakoEnterParams) {
            takoEnterParams = (TakoEnterParams) serializable;
        }
        this.LLJJ = takoEnterParams;
        aS(new AwS609S0100000_30(this, 120));
        TakoEnterParams takoEnterParams2 = this.LLJJ;
        if (takoEnterParams2 != null && C20227614Cs.LIZLLL(takoEnterParams2) && C298860BnY.LIZ() && (activity = getActivity()) != null && (theme = activity.getTheme()) != null) {
            theme.applyStyle(R.style.z4, true);
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        if (bundle2 != null) {
            C786410Ut5.LJJIJL(bundle2, "android:support:fragments", new Bundle());
        }
    }

    public final void hS(long j, boolean z) {
        long jCurrentTimeMillis;
        if (z) {
            jCurrentTimeMillis = System.currentTimeMillis() - j;
        } else {
            jCurrentTimeMillis = 0;
        }
        if (!z) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C324890CoR(this, null), 2);
        }
        C20227214Co c20227214Co = TakoChatFragment.LLLLLL;
        TakoEnterParams takoEnterParams = this.LLJJ;
        c20227214Co.getClass();
        TakoChatFragment takoChatFragment = new TakoChatFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "tako_enter_param", takoEnterParams);
        takoChatFragment.setArguments(bundle);
        ((ArrayList) this.LLJJI).add(new AwS574S0100000_30(takoChatFragment, 285));
        C19EH c19ehLJIIJ = ((FragmentManager) this.LLJILLL.getValue()).LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiv, takoChatFragment, null);
        c19ehLJIIJ.LJIIJ();
        takoChatFragment.LLLL = new AwS0S0210200_4(this, z, j, takoChatFragment, jCurrentTimeMillis, 1);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        super.onViewCreated(view, bundle);
        Npth.addTag("tako", "enter");
        C0CS4.LIZIZ();
        kS();
        boolean z = C14FL.LIZ;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C202069144t(this.LLJJ, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        C19GS c19gs = null;
        if (C1859307Pz.LIZ() && TakoEnterMethodListExperiment.LIZ(false)) {
            Context context = getContext();
            if (context == null) {
                viewTd = null;
            } else {
                viewTd = C21146717pB.LIZIZ(context, R.layout.fr1, viewGroup, false);
            }
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.fr1, viewGroup, false);
        }
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onResult(int i, int i2, Intent intent) {
        Iterator<Fragment> it2 = ((FragmentManager) this.LLJILLL.getValue()).LJJLIIIJL().iterator();
        while (it2.hasNext()) {
            it2.next().onActivityResult(i, i2, intent);
        }
        return super.onResult(i, i2, intent);
    }
}
