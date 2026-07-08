package com.ss.android.ugc.aweme.tako.otherpage.settings.ui;

import X.C019F;
import X.C01GW;
import X.C127K;
import X.C13LE;
import X.C14J2;
import X.C1637806bA;
import X.C1852630yJJ;
import X.C19719912Dl;
import X.C20106713lp;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.tako.otherpage.settings.vm.TakoSettingsVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoSettingsOperationItemAssem extends ReusedUISlotAssem<TakoSettingsOperationItemAssem> implements InterfaceC712990Rxx<C20106713lp> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public C14J2 LLJJLIIIJLLLLLLLZ;
    public C127K LLJL;
    public ConstraintLayout LLJLIL;
    public TextView LLJLILLLLZIIL;
    public boolean LLJLL;
    public AnimatorSet LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoSettingsOperationItemAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tako/otherpage/settings/vm/TakoSettingsVM;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoSettingsOperationItemAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoSettingsVM.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1353), AFwS274S0000000_30.get$arr$(172), null, true);
        this.LLJLLL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(145));
        this.LLJZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(146));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.flp;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        AnimatorSet animatorSet = this.LLJLLIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LLJLLIL;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C14J2 c14j2;
        if (view instanceof C14J2) {
            c14j2 = (C14J2) view;
        } else {
            c14j2 = null;
        }
        this.LLJJLIIIJLLLLLLLZ = c14j2;
        this.LLJL = (C127K) view.findViewById(R.id.xca);
        this.LLJLIL = (ConstraintLayout) view.findViewById(R.id.dlh);
        this.LLJLILLLLZIIL = (TextView) view.findViewById(R.id.y3j);
    }

    public final int op(Float f) {
        float fFloatValue;
        int i;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        Context context = getContext();
        if (context != null && C960203pA.LIZIZ(context)) {
            i = 50;
        } else {
            i = 33;
        }
        return C1852630yJJ.LIZ(C814420VxA.LIZIZ(fFloatValue * i), ((Number) this.LLJLLL.getValue()).intValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
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
    public final void up(X.C20106713lp r10) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.otherpage.settings.ui.TakoSettingsOperationItemAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C20106713lp c20106713lp) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C20106713lp c20106713lp) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
