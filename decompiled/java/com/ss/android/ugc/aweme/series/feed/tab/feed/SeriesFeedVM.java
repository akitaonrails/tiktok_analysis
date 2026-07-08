package com.ss.android.ugc.aweme.series.feed.tab.feed;

import X.AbstractC1264080j02;
import X.C001U;
import X.C01GW;
import X.C098200Yq;
import X.C0RRR;
import X.C0SZ8;
import X.C1264100j04;
import X.C1567900qu4;
import X.C1568050quJ;
import X.C1568100quO;
import X.C1574100r44;
import X.C1574110r45;
import X.C1574290r4N;
import X.C1589520rSw;
import X.C189200o6;
import X.C20684815ws;
import X.C2344009Gk;
import X.C291001Au;
import X.C452501pT;
import X.C622680Oba;
import X.C627660Ojc;
import X.C729980SkG;
import X.EnumC1573550r3B;
import X.EnumC323450Cm7;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1574170r4B;
import X.InterfaceC1577520r9a;
import X.InterfaceC1891350zJl;
import X.InterfaceC586170Myt;
import Y.AObserverS226S0100000_24;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.feed.INUJUnderTakeManager;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedExService;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository;
import com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesFeedVM extends AssemSingleListViewModel<Aweme, C1567900qu4, Long> implements InterfaceC586170Myt {
    public InterfaceC1574170r4B LLILLL;
    public C1574110r45 LLILZ;
    public C1568100quO LLILZIL;
    public AbstractC1264080j02<Aweme> LLILZLL;
    public String LLIZ;
    public Aweme LLIZLLLIL;
    public Function0<? extends C0SZ8> LLJ;
    public AObserverS226S0100000_24 LLJILLL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(304));
    public final List<Aweme> LLILLJJLI = new CopyOnWriteArrayList();
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(303));
    public final List<String> LLJIJIL = new ArrayList();
    public final List<String> LLJILJIL = new ArrayList();
    public String LLJILJILJ = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1567900qu4(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        InterfaceC1574170r4B interfaceC1574170r4B;
        ISeriesFeedService iSeriesFeedServiceLIZIZ;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        MutableLiveData<C291001Au<C001U>> mutableLiveDataLJII;
        AObserverS226S0100000_24 aObserverS226S0100000_24 = this.LLJILLL;
        if (aObserverS226S0100000_24 != null && (iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ()) != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) != null && (mutableLiveDataLJII = interfaceC1577520r9aLIZIZ.LJII()) != null) {
            mutableLiveDataLJII.removeObserver(aObserverS226S0100000_24);
        }
        C1574110r45 c1574110r45 = this.LLILZ;
        if (c1574110r45 != null && (interfaceC1574170r4B = this.LLILLL) != null) {
            interfaceC1574170r4B.LIZ(c1574110r45);
        }
        C1568100quO c1568100quO = this.LLILZIL;
        if (c1568100quO != null) {
            C622680Oba.LIZLLL(c1568100quO);
        }
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJI(this);
        }
        INUJUnderTakeManager.LIZ.getClass();
        C1589520rSw.LIZ().LIZJ();
        super.onCleared();
    }

    public final SeriesFeedRepository wQ2() {
        return (SeriesFeedRepository) this.LL.getValue();
    }

    public SeriesFeedVM() {
        new AwS638S0100000_24(this, 76);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJIILL(this);
        }
        C1574100r44.LIZ.getClass();
        C1574100r44.LIZIZ.clear();
        INUJUnderTakeManager.LIZ.getClass();
        C1589520rSw.LIZ().LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021b  */
    /* JADX WARN: Type inference failed for: r0v83, types: [X.0quT, X.0r45] */
    /* JADX WARN: Type inference failed for: r0v85, types: [X.0quO, java.lang.Object] */
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
    public final java.lang.Object AQ2(X.InterfaceC1568000quE r11) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM.AQ2(X.0quE):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<Aweme> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 225));
    }

    public final List<Aweme> vQ2(List<? extends Aweme> list) {
        ArrayList arrayList = new ArrayList();
        try {
            for (Aweme aweme : list) {
                try {
                    if (C729980SkG.LJFF(aweme, this.LLILLJJLI) < 0) {
                        ((CopyOnWriteArrayList) this.LLILLJJLI).add(aweme);
                        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
                        arrayList.add(aweme);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return arrayList;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
            return arrayList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object whenRefresh(X.InterfaceC1364105Vn<? super X.AbstractC1264080j02<com.ss.android.ugc.aweme.feed.model.Aweme>> r6) throws org.json.JSONException {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1574140r48
            if (r0 == 0) goto L34
            r4 = r6
            X.0r48 r4 = (X.C1574140r48) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L34
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 != r0) goto L3a
            X.C155000ia.LIZIZ(r3)
        L22:
            r0 = r3
            X.0j02 r0 = (X.AbstractC1264080j02) r0
            r5.LLILZLL = r0
            return r3
        L28:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r3 = r5.yQ2(r4)
            if (r3 != r2) goto L22
            return r2
        L34:
            X.0r48 r4 = new X.0r48
            r4.<init>(r5, r6)
            goto L12
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM.whenRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025e A[Catch: Exception -> 0x0316, LOOP:4: B:99:0x0258->B:101:0x025e, LOOP_END, TryCatch #2 {Exception -> 0x0316, blocks: (B:63:0x0118, B:64:0x011b, B:66:0x0121, B:67:0x0123, B:71:0x013f, B:75:0x016f, B:76:0x0195, B:78:0x019b, B:80:0x01a8, B:81:0x01ac, B:82:0x01b6, B:84:0x01bc, B:86:0x01c8, B:88:0x01cd, B:89:0x0210, B:91:0x0216, B:92:0x0224, B:93:0x0234, B:95:0x023a, B:97:0x0247, B:98:0x024b, B:99:0x0258, B:101:0x025e, B:102:0x026c, B:104:0x0281, B:105:0x0284, B:107:0x0292, B:108:0x0296, B:110:0x029c, B:114:0x02ab, B:115:0x02af, B:116:0x02b4, B:118:0x02ba, B:120:0x02c2, B:121:0x02ee, B:122:0x02f1, B:123:0x02f2, B:127:0x02f9, B:129:0x0308, B:131:0x030e), top: B:156:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0281 A[Catch: Exception -> 0x0316, TryCatch #2 {Exception -> 0x0316, blocks: (B:63:0x0118, B:64:0x011b, B:66:0x0121, B:67:0x0123, B:71:0x013f, B:75:0x016f, B:76:0x0195, B:78:0x019b, B:80:0x01a8, B:81:0x01ac, B:82:0x01b6, B:84:0x01bc, B:86:0x01c8, B:88:0x01cd, B:89:0x0210, B:91:0x0216, B:92:0x0224, B:93:0x0234, B:95:0x023a, B:97:0x0247, B:98:0x024b, B:99:0x0258, B:101:0x025e, B:102:0x026c, B:104:0x0281, B:105:0x0284, B:107:0x0292, B:108:0x0296, B:110:0x029c, B:114:0x02ab, B:115:0x02af, B:116:0x02b4, B:118:0x02ba, B:120:0x02c2, B:121:0x02ee, B:122:0x02f1, B:123:0x02f2, B:127:0x02f9, B:129:0x0308, B:131:0x030e), top: B:156:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0292 A[Catch: Exception -> 0x0316, TryCatch #2 {Exception -> 0x0316, blocks: (B:63:0x0118, B:64:0x011b, B:66:0x0121, B:67:0x0123, B:71:0x013f, B:75:0x016f, B:76:0x0195, B:78:0x019b, B:80:0x01a8, B:81:0x01ac, B:82:0x01b6, B:84:0x01bc, B:86:0x01c8, B:88:0x01cd, B:89:0x0210, B:91:0x0216, B:92:0x0224, B:93:0x0234, B:95:0x023a, B:97:0x0247, B:98:0x024b, B:99:0x0258, B:101:0x025e, B:102:0x026c, B:104:0x0281, B:105:0x0284, B:107:0x0292, B:108:0x0296, B:110:0x029c, B:114:0x02ab, B:115:0x02af, B:116:0x02b4, B:118:0x02ba, B:120:0x02c2, B:121:0x02ee, B:122:0x02f1, B:123:0x02f2, B:127:0x02f9, B:129:0x0308, B:131:0x030e), top: B:156:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ba A[Catch: Exception -> 0x0316, TryCatch #2 {Exception -> 0x0316, blocks: (B:63:0x0118, B:64:0x011b, B:66:0x0121, B:67:0x0123, B:71:0x013f, B:75:0x016f, B:76:0x0195, B:78:0x019b, B:80:0x01a8, B:81:0x01ac, B:82:0x01b6, B:84:0x01bc, B:86:0x01c8, B:88:0x01cd, B:89:0x0210, B:91:0x0216, B:92:0x0224, B:93:0x0234, B:95:0x023a, B:97:0x0247, B:98:0x024b, B:99:0x0258, B:101:0x025e, B:102:0x026c, B:104:0x0281, B:105:0x0284, B:107:0x0292, B:108:0x0296, B:110:0x029c, B:114:0x02ab, B:115:0x02af, B:116:0x02b4, B:118:0x02ba, B:120:0x02c2, B:121:0x02ee, B:122:0x02f1, B:123:0x02f2, B:127:0x02f9, B:129:0x0308, B:131:0x030e), top: B:156:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0308 A[Catch: Exception -> 0x0316, TryCatch #2 {Exception -> 0x0316, blocks: (B:63:0x0118, B:64:0x011b, B:66:0x0121, B:67:0x0123, B:71:0x013f, B:75:0x016f, B:76:0x0195, B:78:0x019b, B:80:0x01a8, B:81:0x01ac, B:82:0x01b6, B:84:0x01bc, B:86:0x01c8, B:88:0x01cd, B:89:0x0210, B:91:0x0216, B:92:0x0224, B:93:0x0234, B:95:0x023a, B:97:0x0247, B:98:0x024b, B:99:0x0258, B:101:0x025e, B:102:0x026c, B:104:0x0281, B:105:0x0284, B:107:0x0292, B:108:0x0296, B:110:0x029c, B:114:0x02ab, B:115:0x02af, B:116:0x02b4, B:118:0x02ba, B:120:0x02c2, B:121:0x02ee, B:122:0x02f1, B:123:0x02f2, B:127:0x02f9, B:129:0x0308, B:131:0x030e), top: B:156:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030e A[Catch: Exception -> 0x0316, TryCatch #2 {Exception -> 0x0316, blocks: (B:63:0x0118, B:64:0x011b, B:66:0x0121, B:67:0x0123, B:71:0x013f, B:75:0x016f, B:76:0x0195, B:78:0x019b, B:80:0x01a8, B:81:0x01ac, B:82:0x01b6, B:84:0x01bc, B:86:0x01c8, B:88:0x01cd, B:89:0x0210, B:91:0x0216, B:92:0x0224, B:93:0x0234, B:95:0x023a, B:97:0x0247, B:98:0x024b, B:99:0x0258, B:101:0x025e, B:102:0x026c, B:104:0x0281, B:105:0x0284, B:107:0x0292, B:108:0x0296, B:110:0x029c, B:114:0x02ab, B:115:0x02af, B:116:0x02b4, B:118:0x02ba, B:120:0x02c2, B:121:0x02ee, B:122:0x02f1, B:123:0x02f2, B:127:0x02f9, B:129:0x0308, B:131:0x030e), top: B:156:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa A[Catch: Exception -> 0x0318, TryCatch #1 {Exception -> 0x0318, blocks: (B:24:0x0064, B:26:0x0070, B:28:0x0076, B:29:0x007a, B:31:0x0080, B:33:0x008c, B:34:0x0094, B:44:0x00aa, B:45:0x00b7, B:47:0x00bd, B:54:0x00d7, B:55:0x00db, B:56:0x00df, B:58:0x00e9, B:59:0x00f9), top: B:154:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9 A[Catch: Exception -> 0x0318, TryCatch #1 {Exception -> 0x0318, blocks: (B:24:0x0064, B:26:0x0070, B:28:0x0076, B:29:0x007a, B:31:0x0080, B:33:0x008c, B:34:0x0094, B:44:0x00aa, B:45:0x00b7, B:47:0x00bd, B:54:0x00d7, B:55:0x00db, B:56:0x00df, B:58:0x00e9, B:59:0x00f9), top: B:154:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121 A[Catch: Exception -> 0x0316, TryCatch #2 {Exception -> 0x0316, blocks: (B:63:0x0118, B:64:0x011b, B:66:0x0121, B:67:0x0123, B:71:0x013f, B:75:0x016f, B:76:0x0195, B:78:0x019b, B:80:0x01a8, B:81:0x01ac, B:82:0x01b6, B:84:0x01bc, B:86:0x01c8, B:88:0x01cd, B:89:0x0210, B:91:0x0216, B:92:0x0224, B:93:0x0234, B:95:0x023a, B:97:0x0247, B:98:0x024b, B:99:0x0258, B:101:0x025e, B:102:0x026c, B:104:0x0281, B:105:0x0284, B:107:0x0292, B:108:0x0296, B:110:0x029c, B:114:0x02ab, B:115:0x02af, B:116:0x02b4, B:118:0x02ba, B:120:0x02c2, B:121:0x02ee, B:122:0x02f1, B:123:0x02f2, B:127:0x02f9, B:129:0x0308, B:131:0x030e), top: B:156:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019b A[Catch: Exception -> 0x0316, TryCatch #2 {Exception -> 0x0316, blocks: (B:63:0x0118, B:64:0x011b, B:66:0x0121, B:67:0x0123, B:71:0x013f, B:75:0x016f, B:76:0x0195, B:78:0x019b, B:80:0x01a8, B:81:0x01ac, B:82:0x01b6, B:84:0x01bc, B:86:0x01c8, B:88:0x01cd, B:89:0x0210, B:91:0x0216, B:92:0x0224, B:93:0x0234, B:95:0x023a, B:97:0x0247, B:98:0x024b, B:99:0x0258, B:101:0x025e, B:102:0x026c, B:104:0x0281, B:105:0x0284, B:107:0x0292, B:108:0x0296, B:110:0x029c, B:114:0x02ab, B:115:0x02af, B:116:0x02b4, B:118:0x02ba, B:120:0x02c2, B:121:0x02ee, B:122:0x02f1, B:123:0x02f2, B:127:0x02f9, B:129:0x0308, B:131:0x030e), top: B:156:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bc A[Catch: Exception -> 0x0316, TryCatch #2 {Exception -> 0x0316, blocks: (B:63:0x0118, B:64:0x011b, B:66:0x0121, B:67:0x0123, B:71:0x013f, B:75:0x016f, B:76:0x0195, B:78:0x019b, B:80:0x01a8, B:81:0x01ac, B:82:0x01b6, B:84:0x01bc, B:86:0x01c8, B:88:0x01cd, B:89:0x0210, B:91:0x0216, B:92:0x0224, B:93:0x0234, B:95:0x023a, B:97:0x0247, B:98:0x024b, B:99:0x0258, B:101:0x025e, B:102:0x026c, B:104:0x0281, B:105:0x0284, B:107:0x0292, B:108:0x0296, B:110:0x029c, B:114:0x02ab, B:115:0x02af, B:116:0x02b4, B:118:0x02ba, B:120:0x02c2, B:121:0x02ee, B:122:0x02f1, B:123:0x02f2, B:127:0x02f9, B:129:0x0308, B:131:0x030e), top: B:156:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0216 A[Catch: Exception -> 0x0316, LOOP:2: B:89:0x0210->B:91:0x0216, LOOP_END, TryCatch #2 {Exception -> 0x0316, blocks: (B:63:0x0118, B:64:0x011b, B:66:0x0121, B:67:0x0123, B:71:0x013f, B:75:0x016f, B:76:0x0195, B:78:0x019b, B:80:0x01a8, B:81:0x01ac, B:82:0x01b6, B:84:0x01bc, B:86:0x01c8, B:88:0x01cd, B:89:0x0210, B:91:0x0216, B:92:0x0224, B:93:0x0234, B:95:0x023a, B:97:0x0247, B:98:0x024b, B:99:0x0258, B:101:0x025e, B:102:0x026c, B:104:0x0281, B:105:0x0284, B:107:0x0292, B:108:0x0296, B:110:0x029c, B:114:0x02ab, B:115:0x02af, B:116:0x02b4, B:118:0x02ba, B:120:0x02c2, B:121:0x02ee, B:122:0x02f1, B:123:0x02f2, B:127:0x02f9, B:129:0x0308, B:131:0x030e), top: B:156:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023a A[Catch: Exception -> 0x0316, TryCatch #2 {Exception -> 0x0316, blocks: (B:63:0x0118, B:64:0x011b, B:66:0x0121, B:67:0x0123, B:71:0x013f, B:75:0x016f, B:76:0x0195, B:78:0x019b, B:80:0x01a8, B:81:0x01ac, B:82:0x01b6, B:84:0x01bc, B:86:0x01c8, B:88:0x01cd, B:89:0x0210, B:91:0x0216, B:92:0x0224, B:93:0x0234, B:95:0x023a, B:97:0x0247, B:98:0x024b, B:99:0x0258, B:101:0x025e, B:102:0x026c, B:104:0x0281, B:105:0x0284, B:107:0x0292, B:108:0x0296, B:110:0x029c, B:114:0x02ab, B:115:0x02af, B:116:0x02b4, B:118:0x02ba, B:120:0x02c2, B:121:0x02ee, B:122:0x02f1, B:123:0x02f2, B:127:0x02f9, B:129:0x0308, B:131:0x030e), top: B:156:0x0118 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.InterfaceC1364105Vn r27) {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM.xQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0212 A[Catch: Exception -> 0x0285, TRY_ENTER, TryCatch #12 {Exception -> 0x0285, blocks: (B:96:0x01d9, B:97:0x01dd, B:99:0x01e3, B:101:0x01f5, B:105:0x01fd, B:109:0x0212, B:110:0x0221, B:112:0x0227, B:115:0x0238, B:116:0x0241), top: B:327:0x01d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0238 A[Catch: Exception -> 0x0285, TryCatch #12 {Exception -> 0x0285, blocks: (B:96:0x01d9, B:97:0x01dd, B:99:0x01e3, B:101:0x01f5, B:105:0x01fd, B:109:0x0212, B:110:0x0221, B:112:0x0227, B:115:0x0238, B:116:0x0241), top: B:327:0x01d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d8 A[Catch: Exception -> 0x047f, TRY_ENTER, TryCatch #9 {Exception -> 0x047f, blocks: (B:142:0x02cb, B:147:0x02d8, B:148:0x02e1, B:150:0x02e7, B:152:0x02f4, B:153:0x02f8, B:157:0x0303, B:158:0x0309, B:160:0x030f, B:162:0x031b, B:167:0x0339, B:170:0x035b, B:173:0x0386, B:174:0x0395, B:176:0x039b, B:178:0x03b0, B:180:0x03b8, B:181:0x03c8, B:183:0x03d2, B:185:0x03da, B:188:0x03e3, B:193:0x0427, B:197:0x044b, B:199:0x0458, B:203:0x0471), top: B:322:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0303 A[Catch: Exception -> 0x047f, TRY_ENTER, TryCatch #9 {Exception -> 0x047f, blocks: (B:142:0x02cb, B:147:0x02d8, B:148:0x02e1, B:150:0x02e7, B:152:0x02f4, B:153:0x02f8, B:157:0x0303, B:158:0x0309, B:160:0x030f, B:162:0x031b, B:167:0x0339, B:170:0x035b, B:173:0x0386, B:174:0x0395, B:176:0x039b, B:178:0x03b0, B:180:0x03b8, B:181:0x03c8, B:183:0x03d2, B:185:0x03da, B:188:0x03e3, B:193:0x0427, B:197:0x044b, B:199:0x0458, B:203:0x0471), top: B:322:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0339 A[Catch: Exception -> 0x047f, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x047f, blocks: (B:142:0x02cb, B:147:0x02d8, B:148:0x02e1, B:150:0x02e7, B:152:0x02f4, B:153:0x02f8, B:157:0x0303, B:158:0x0309, B:160:0x030f, B:162:0x031b, B:167:0x0339, B:170:0x035b, B:173:0x0386, B:174:0x0395, B:176:0x039b, B:178:0x03b0, B:180:0x03b8, B:181:0x03c8, B:183:0x03d2, B:185:0x03da, B:188:0x03e3, B:193:0x0427, B:197:0x044b, B:199:0x0458, B:203:0x0471), top: B:322:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x035b A[Catch: Exception -> 0x047f, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x047f, blocks: (B:142:0x02cb, B:147:0x02d8, B:148:0x02e1, B:150:0x02e7, B:152:0x02f4, B:153:0x02f8, B:157:0x0303, B:158:0x0309, B:160:0x030f, B:162:0x031b, B:167:0x0339, B:170:0x035b, B:173:0x0386, B:174:0x0395, B:176:0x039b, B:178:0x03b0, B:180:0x03b8, B:181:0x03c8, B:183:0x03d2, B:185:0x03da, B:188:0x03e3, B:193:0x0427, B:197:0x044b, B:199:0x0458, B:203:0x0471), top: B:322:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0386 A[Catch: Exception -> 0x047f, TRY_ENTER, TryCatch #9 {Exception -> 0x047f, blocks: (B:142:0x02cb, B:147:0x02d8, B:148:0x02e1, B:150:0x02e7, B:152:0x02f4, B:153:0x02f8, B:157:0x0303, B:158:0x0309, B:160:0x030f, B:162:0x031b, B:167:0x0339, B:170:0x035b, B:173:0x0386, B:174:0x0395, B:176:0x039b, B:178:0x03b0, B:180:0x03b8, B:181:0x03c8, B:183:0x03d2, B:185:0x03da, B:188:0x03e3, B:193:0x0427, B:197:0x044b, B:199:0x0458, B:203:0x0471), top: B:322:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b0 A[Catch: Exception -> 0x047f, TryCatch #9 {Exception -> 0x047f, blocks: (B:142:0x02cb, B:147:0x02d8, B:148:0x02e1, B:150:0x02e7, B:152:0x02f4, B:153:0x02f8, B:157:0x0303, B:158:0x0309, B:160:0x030f, B:162:0x031b, B:167:0x0339, B:170:0x035b, B:173:0x0386, B:174:0x0395, B:176:0x039b, B:178:0x03b0, B:180:0x03b8, B:181:0x03c8, B:183:0x03d2, B:185:0x03da, B:188:0x03e3, B:193:0x0427, B:197:0x044b, B:199:0x0458, B:203:0x0471), top: B:322:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03e3 A[Catch: Exception -> 0x047f, TRY_ENTER, TryCatch #9 {Exception -> 0x047f, blocks: (B:142:0x02cb, B:147:0x02d8, B:148:0x02e1, B:150:0x02e7, B:152:0x02f4, B:153:0x02f8, B:157:0x0303, B:158:0x0309, B:160:0x030f, B:162:0x031b, B:167:0x0339, B:170:0x035b, B:173:0x0386, B:174:0x0395, B:176:0x039b, B:178:0x03b0, B:180:0x03b8, B:181:0x03c8, B:183:0x03d2, B:185:0x03da, B:188:0x03e3, B:193:0x0427, B:197:0x044b, B:199:0x0458, B:203:0x0471), top: B:322:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0427 A[Catch: Exception -> 0x047f, LOOP:3: B:191:0x0421->B:193:0x0427, LOOP_END, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x047f, blocks: (B:142:0x02cb, B:147:0x02d8, B:148:0x02e1, B:150:0x02e7, B:152:0x02f4, B:153:0x02f8, B:157:0x0303, B:158:0x0309, B:160:0x030f, B:162:0x031b, B:167:0x0339, B:170:0x035b, B:173:0x0386, B:174:0x0395, B:176:0x039b, B:178:0x03b0, B:180:0x03b8, B:181:0x03c8, B:183:0x03d2, B:185:0x03da, B:188:0x03e3, B:193:0x0427, B:197:0x044b, B:199:0x0458, B:203:0x0471), top: B:322:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x044b A[Catch: Exception -> 0x047f, TRY_ENTER, TryCatch #9 {Exception -> 0x047f, blocks: (B:142:0x02cb, B:147:0x02d8, B:148:0x02e1, B:150:0x02e7, B:152:0x02f4, B:153:0x02f8, B:157:0x0303, B:158:0x0309, B:160:0x030f, B:162:0x031b, B:167:0x0339, B:170:0x035b, B:173:0x0386, B:174:0x0395, B:176:0x039b, B:178:0x03b0, B:180:0x03b8, B:181:0x03c8, B:183:0x03d2, B:185:0x03da, B:188:0x03e3, B:193:0x0427, B:197:0x044b, B:199:0x0458, B:203:0x0471), top: B:322:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0471 A[Catch: Exception -> 0x047f, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x047f, blocks: (B:142:0x02cb, B:147:0x02d8, B:148:0x02e1, B:150:0x02e7, B:152:0x02f4, B:153:0x02f8, B:157:0x0303, B:158:0x0309, B:160:0x030f, B:162:0x031b, B:167:0x0339, B:170:0x035b, B:173:0x0386, B:174:0x0395, B:176:0x039b, B:178:0x03b0, B:180:0x03b8, B:181:0x03c8, B:183:0x03d2, B:185:0x03da, B:188:0x03e3, B:193:0x0427, B:197:0x044b, B:199:0x0458, B:203:0x0471), top: B:322:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x048f A[Catch: Exception -> 0x05ea, TRY_ENTER, TryCatch #4 {Exception -> 0x05ea, blocks: (B:208:0x048f, B:210:0x04be, B:212:0x04d3, B:215:0x04dd, B:217:0x04e3, B:219:0x04e9, B:220:0x04ed, B:222:0x04f3, B:224:0x04f9, B:225:0x04fd, B:227:0x0503, B:233:0x0519, B:235:0x052e, B:236:0x0531, B:238:0x0537, B:240:0x053d, B:241:0x0540, B:243:0x0550, B:244:0x0553, B:246:0x0560, B:247:0x0564, B:249:0x056a, B:250:0x0574, B:251:0x0578, B:253:0x057e, B:255:0x0586, B:256:0x05b2, B:257:0x05b5, B:258:0x05b6, B:262:0x05bd, B:264:0x05cc, B:265:0x05cf, B:267:0x05db, B:268:0x05e5, B:209:0x04a9), top: B:313:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04a9 A[Catch: Exception -> 0x05ea, TryCatch #4 {Exception -> 0x05ea, blocks: (B:208:0x048f, B:210:0x04be, B:212:0x04d3, B:215:0x04dd, B:217:0x04e3, B:219:0x04e9, B:220:0x04ed, B:222:0x04f3, B:224:0x04f9, B:225:0x04fd, B:227:0x0503, B:233:0x0519, B:235:0x052e, B:236:0x0531, B:238:0x0537, B:240:0x053d, B:241:0x0540, B:243:0x0550, B:244:0x0553, B:246:0x0560, B:247:0x0564, B:249:0x056a, B:250:0x0574, B:251:0x0578, B:253:0x057e, B:255:0x0586, B:256:0x05b2, B:257:0x05b5, B:258:0x05b6, B:262:0x05bd, B:264:0x05cc, B:265:0x05cf, B:267:0x05db, B:268:0x05e5, B:209:0x04a9), top: B:313:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04d3 A[Catch: Exception -> 0x05ea, TryCatch #4 {Exception -> 0x05ea, blocks: (B:208:0x048f, B:210:0x04be, B:212:0x04d3, B:215:0x04dd, B:217:0x04e3, B:219:0x04e9, B:220:0x04ed, B:222:0x04f3, B:224:0x04f9, B:225:0x04fd, B:227:0x0503, B:233:0x0519, B:235:0x052e, B:236:0x0531, B:238:0x0537, B:240:0x053d, B:241:0x0540, B:243:0x0550, B:244:0x0553, B:246:0x0560, B:247:0x0564, B:249:0x056a, B:250:0x0574, B:251:0x0578, B:253:0x057e, B:255:0x0586, B:256:0x05b2, B:257:0x05b5, B:258:0x05b6, B:262:0x05bd, B:264:0x05cc, B:265:0x05cf, B:267:0x05db, B:268:0x05e5, B:209:0x04a9), top: B:313:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04dd A[Catch: Exception -> 0x05ea, TryCatch #4 {Exception -> 0x05ea, blocks: (B:208:0x048f, B:210:0x04be, B:212:0x04d3, B:215:0x04dd, B:217:0x04e3, B:219:0x04e9, B:220:0x04ed, B:222:0x04f3, B:224:0x04f9, B:225:0x04fd, B:227:0x0503, B:233:0x0519, B:235:0x052e, B:236:0x0531, B:238:0x0537, B:240:0x053d, B:241:0x0540, B:243:0x0550, B:244:0x0553, B:246:0x0560, B:247:0x0564, B:249:0x056a, B:250:0x0574, B:251:0x0578, B:253:0x057e, B:255:0x0586, B:256:0x05b2, B:257:0x05b5, B:258:0x05b6, B:262:0x05bd, B:264:0x05cc, B:265:0x05cf, B:267:0x05db, B:268:0x05e5, B:209:0x04a9), top: B:313:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x052e A[Catch: Exception -> 0x05ea, TryCatch #4 {Exception -> 0x05ea, blocks: (B:208:0x048f, B:210:0x04be, B:212:0x04d3, B:215:0x04dd, B:217:0x04e3, B:219:0x04e9, B:220:0x04ed, B:222:0x04f3, B:224:0x04f9, B:225:0x04fd, B:227:0x0503, B:233:0x0519, B:235:0x052e, B:236:0x0531, B:238:0x0537, B:240:0x053d, B:241:0x0540, B:243:0x0550, B:244:0x0553, B:246:0x0560, B:247:0x0564, B:249:0x056a, B:250:0x0574, B:251:0x0578, B:253:0x057e, B:255:0x0586, B:256:0x05b2, B:257:0x05b5, B:258:0x05b6, B:262:0x05bd, B:264:0x05cc, B:265:0x05cf, B:267:0x05db, B:268:0x05e5, B:209:0x04a9), top: B:313:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0550 A[Catch: Exception -> 0x05ea, TryCatch #4 {Exception -> 0x05ea, blocks: (B:208:0x048f, B:210:0x04be, B:212:0x04d3, B:215:0x04dd, B:217:0x04e3, B:219:0x04e9, B:220:0x04ed, B:222:0x04f3, B:224:0x04f9, B:225:0x04fd, B:227:0x0503, B:233:0x0519, B:235:0x052e, B:236:0x0531, B:238:0x0537, B:240:0x053d, B:241:0x0540, B:243:0x0550, B:244:0x0553, B:246:0x0560, B:247:0x0564, B:249:0x056a, B:250:0x0574, B:251:0x0578, B:253:0x057e, B:255:0x0586, B:256:0x05b2, B:257:0x05b5, B:258:0x05b6, B:262:0x05bd, B:264:0x05cc, B:265:0x05cf, B:267:0x05db, B:268:0x05e5, B:209:0x04a9), top: B:313:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0560 A[Catch: Exception -> 0x05ea, TryCatch #4 {Exception -> 0x05ea, blocks: (B:208:0x048f, B:210:0x04be, B:212:0x04d3, B:215:0x04dd, B:217:0x04e3, B:219:0x04e9, B:220:0x04ed, B:222:0x04f3, B:224:0x04f9, B:225:0x04fd, B:227:0x0503, B:233:0x0519, B:235:0x052e, B:236:0x0531, B:238:0x0537, B:240:0x053d, B:241:0x0540, B:243:0x0550, B:244:0x0553, B:246:0x0560, B:247:0x0564, B:249:0x056a, B:250:0x0574, B:251:0x0578, B:253:0x057e, B:255:0x0586, B:256:0x05b2, B:257:0x05b5, B:258:0x05b6, B:262:0x05bd, B:264:0x05cc, B:265:0x05cf, B:267:0x05db, B:268:0x05e5, B:209:0x04a9), top: B:313:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x057e A[Catch: Exception -> 0x05ea, TryCatch #4 {Exception -> 0x05ea, blocks: (B:208:0x048f, B:210:0x04be, B:212:0x04d3, B:215:0x04dd, B:217:0x04e3, B:219:0x04e9, B:220:0x04ed, B:222:0x04f3, B:224:0x04f9, B:225:0x04fd, B:227:0x0503, B:233:0x0519, B:235:0x052e, B:236:0x0531, B:238:0x0537, B:240:0x053d, B:241:0x0540, B:243:0x0550, B:244:0x0553, B:246:0x0560, B:247:0x0564, B:249:0x056a, B:250:0x0574, B:251:0x0578, B:253:0x057e, B:255:0x0586, B:256:0x05b2, B:257:0x05b5, B:258:0x05b6, B:262:0x05bd, B:264:0x05cc, B:265:0x05cf, B:267:0x05db, B:268:0x05e5, B:209:0x04a9), top: B:313:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05cc A[Catch: Exception -> 0x05ea, TryCatch #4 {Exception -> 0x05ea, blocks: (B:208:0x048f, B:210:0x04be, B:212:0x04d3, B:215:0x04dd, B:217:0x04e3, B:219:0x04e9, B:220:0x04ed, B:222:0x04f3, B:224:0x04f9, B:225:0x04fd, B:227:0x0503, B:233:0x0519, B:235:0x052e, B:236:0x0531, B:238:0x0537, B:240:0x053d, B:241:0x0540, B:243:0x0550, B:244:0x0553, B:246:0x0560, B:247:0x0564, B:249:0x056a, B:250:0x0574, B:251:0x0578, B:253:0x057e, B:255:0x0586, B:256:0x05b2, B:257:0x05b5, B:258:0x05b6, B:262:0x05bd, B:264:0x05cc, B:265:0x05cf, B:267:0x05db, B:268:0x05e5, B:209:0x04a9), top: B:313:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05db A[Catch: Exception -> 0x05ea, TryCatch #4 {Exception -> 0x05ea, blocks: (B:208:0x048f, B:210:0x04be, B:212:0x04d3, B:215:0x04dd, B:217:0x04e3, B:219:0x04e9, B:220:0x04ed, B:222:0x04f3, B:224:0x04f9, B:225:0x04fd, B:227:0x0503, B:233:0x0519, B:235:0x052e, B:236:0x0531, B:238:0x0537, B:240:0x053d, B:241:0x0540, B:243:0x0550, B:244:0x0553, B:246:0x0560, B:247:0x0564, B:249:0x056a, B:250:0x0574, B:251:0x0578, B:253:0x057e, B:255:0x0586, B:256:0x05b2, B:257:0x05b5, B:258:0x05b6, B:262:0x05bd, B:264:0x05cc, B:265:0x05cf, B:267:0x05db, B:268:0x05e5, B:209:0x04a9), top: B:313:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x02cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v15, types: [com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor$PagePerformanceEvent] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r19v3, types: [com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository] */
    /* JADX WARN: Type inference failed for: r19v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r22v7, types: [com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks] */
    /* JADX WARN: Type inference failed for: r23v1, types: [com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v49, types: [com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor$PagePerformanceEvent] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Long, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(X.InterfaceC1364105Vn<? super X.AbstractC1264080j02<com.ss.android.ugc.aweme.feed.model.Aweme>> r34) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM.yQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(long r6, X.InterfaceC1364105Vn<? super X.AbstractC1264080j02<com.ss.android.ugc.aweme.feed.model.Aweme>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1574150r49
            if (r0 == 0) goto L34
            r4 = r8
            X.0r49 r4 = (X.C1574150r49) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L34
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 != r0) goto L3a
            X.C155000ia.LIZIZ(r3)
        L22:
            r0 = r3
            X.0j02 r0 = (X.AbstractC1264080j02) r0
            r5.LLILZLL = r0
            return r3
        L28:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r3 = r5.xQ2(r4)
            if (r3 != r2) goto L22
            return r2
        L34:
            X.0r49 r4 = new X.0r49
            r4.<init>(r5, r8)
            goto L12
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM.BQ2(long, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final /* bridge */ /* synthetic */ Object whenLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC1264080j02<Aweme>> interfaceC1364105Vn) {
        return BQ2(l.longValue(), interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final List<Aweme> onLoadPageAddData(EnumC323450Cm7 enumC323450Cm7, List<? extends Aweme> list, List<? extends Aweme> list2) {
        List<Aweme> listOnLoadPageAddData = super.onLoadPageAddData(enumC323450Cm7, list, list2);
        if (enumC323450Cm7 == EnumC323450Cm7.Refresh && list2.isEmpty() && (this.LLILZLL instanceof C1264100j04)) {
            return new ArrayList(list);
        }
        return listOnLoadPageAddData;
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z) {
            ISeriesFeedExService.LIZ.getClass();
            C1574290r4N.LIZ().LIZJ();
            if (i == 1) {
                AQ2(new C1568050quJ("login"));
                MiniDramaPagePerformanceMonitor.PagePerformanceEvent.LJIIJJI(MiniDramaPagePerformanceMonitor.LIZJ(EnumC1573550r3B.TOP_TAB));
            }
        }
    }

    public static void zQ2(String str, long j, boolean z, String str2, String str3, int i, int i2, int i3, int i4, int i5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("drama_request_type", str);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_success");
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LIZJ(i, "video_count");
        c2344009Gk.LJFF("error_code", str2);
        c2344009Gk.LJFF("error_message", str3);
        c2344009Gk.LIZJ(i2, "duplicate_count");
        c2344009Gk.LIZJ(i3, "ads_count");
        c2344009Gk.LIZJ(i4, "ad_first_index");
        c2344009Gk.LIZJ(i5, "request_retry_times");
        C20684815ws.LJIILLIIL("mini_drama_tab_feed_response", c2344009Gk.LIZ);
    }
}
