package com.ss.android.ugc.aweme.music.highlight;

import X.C098200Yq;
import X.C0OM1;
import X.C0QSJ;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C631640Oq2;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC21503819Do;
import X.InterfaceC634000Otq;
import X.InterfaceC687730QyJ;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class HighlightSelectFragment extends BaseFragment implements InterfaceC634000Otq, InterfaceC21503819Do, C0QSJ, InterfaceC1146704e9 {
    public static final int LLJILJIL = 8;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiYwZi0lHELIOSLic/ISIkPWEbISIkJSY0IDEfLCM2KzEKOy40JSAiPQ==";
    public TuxNavBar LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;

    @Override // X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC634000Otq, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void ap() {
    }

    @Override // X.C0QSJ
    public void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{HighlightScope.class});
    }

    @Override // X.C0QSJ
    public Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(HighlightScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(HighlightScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return UR(this, layoutInflater, viewGroup, bundle);
    }

    @Override // X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.C0QSJ
    public void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.C0QSJ
    public void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

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
    private final void cS() {
        TuxNavBar tuxNavBar = this.LLIZ;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS553S0100000_9(this, 1168));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getString(2131847268);
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavActions(c0om1);
        }
    }

    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: VR, reason: merged with bridge method [inline-methods] */
    public C631640Oq2 lt() {
        return new C631640Oq2(this.LLIZLLLIL, this.LLJ, true, null, null, false, null, this.LLJI, null, 2968);
    }

    public final String WR() {
        return this.LLJI;
    }

    public final String ZR() {
        return this.LLJ;
    }

    public final String aS() {
        return this.LLJIJIL;
    }

    public final String bS() {
        return this.LLIZLLLIL;
    }

    public final void dS(String str) {
        this.LLJI = str;
    }

    public final void gS(String str) {
        this.LLJ = str;
    }

    public final void hS(String str) {
        this.LLJIJIL = str;
    }

    public final void iS(String str) {
        this.LLIZLLLIL = str;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS240S0000000_9.get$arr$(491));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLIZ = (TuxNavBar) view.findViewById(R.id.p2m);
        cS();
        C723850SaN.LIZ(this, false, null, new AwS588S0100000_9(this, 297), 3);
    }

    public View SR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.ehl, viewGroup, false);
    }

    public static View UR(HighlightSelectFragment highlightSelectFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewSR = highlightSelectFragment.SR(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewSR instanceof View)) {
            viewSR = null;
        }
        if (viewSR != null) {
            try {
                ViewTreeLifecycleOwner.set(viewSR, highlightSelectFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewSR, highlightSelectFragment);
                viewSR.setTag(R.id.view_tree_saved_state_registry_owner, highlightSelectFragment);
                C19EG activity = highlightSelectFragment.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewSR;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewSR;
    }
}
