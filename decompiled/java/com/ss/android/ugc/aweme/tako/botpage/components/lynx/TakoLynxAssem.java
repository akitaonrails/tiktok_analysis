package com.ss.android.ugc.aweme.tako.botpage.components.lynx;

import X.C111600ba;
import X.C1313240kHK;
import X.C1537720q7O;
import X.C1559260qg8;
import X.C21525219Lu;
import X.C723580SZw;
import X.InterfaceC1587906Jp;
import X.InterfaceC21266318Kf;
import X.InterfaceC712990Rxx;
import X.ViewOnLongClickListenerC20307014d2;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class TakoLynxAssem extends ReusedUIContentAssem<TakoLynxAssem> implements InterfaceC712990Rxx<InterfaceC21266318Kf> {
    public C1537720q7O LLJJJJ;
    public List<String> LLJJJJJIL;
    public List<String> LLJJJJLIIL;
    public String LLJJL;
    public Map<String, Object> LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public final C1559260qg8 LLJLIL = new C1559260qg8(new C723580SZw(this, C111600ba.class, "LYNX_EXTRA_DATA"), checkSupervisorPrepared());
    public final C21525219Lu LLJLILLLLZIIL = new C21525219Lu(this, 1);

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void cp(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                cp(childAt);
                if (!(childAt instanceof C1313240kHK)) {
                    childAt.setOnLongClickListener(new ViewOnLongClickListenerC20307014d2(this, 0));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0269  */
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
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.InterfaceC21266318Kf r15) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.lynx.TakoLynxAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC21266318Kf interfaceC21266318Kf) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC21266318Kf interfaceC21266318Kf) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
