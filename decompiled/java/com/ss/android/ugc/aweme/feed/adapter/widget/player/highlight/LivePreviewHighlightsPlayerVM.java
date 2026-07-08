package com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight;

import X.C01GW;
import X.C1ACA;
import X.C2175081AAo;
import X.C2175101AAq;
import X.C2188811AlT;
import X.C452501pT;
import X.C468930IaB;
import X.EnumC2175031AAj;
import X.EnumC765980U2y;
import X.InterfaceC1484830ok5;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePreviewHighlightsPlayerVM extends LiveWidgetViewModel {
    public final MutableLiveData<Unit> LL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<EnumC765980U2y> LLILLL = new MutableLiveData<>(EnumC765980U2y.IDLE);
    public final MutableLiveData<Unit> LLILZ = new MutableLiveData<>();
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2137));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(295));
    public C2175081AAo LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;

    public final C1ACA vQ2() {
        return (C1ACA) this.LLILZIL.getValue();
    }

    public final C2175101AAq wQ2() {
        return (C2175101AAq) this.LLILZLL.getValue();
    }

    public final boolean xQ2() {
        C1ACA c1acaVQ2 = vQ2();
        if (c1acaVQ2 != null) {
            return c1acaVQ2.LJIILIIL;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0ogN, X.1AAo] */
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
    public final void yQ2(final android.widget.FrameLayout r11) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM.yQ2(android.widget.FrameLayout):void");
    }

    public final void zQ2(EnumC2175031AAj enumC2175031AAj) {
        this.LLJ = false;
        C2175101AAq c2175101AAqWQ2 = wQ2();
        InterfaceC1484830ok5 interfaceC1484830ok5 = c2175101AAqWQ2.LIZJ;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.stop();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop playerTag:");
        sbLIZ.append(c2175101AAqWQ2.LIZ);
        sbLIZ.append(" scene:");
        sbLIZ.append(enumC2175031AAj);
        C468930IaB.LIZ(c2175101AAqWQ2.LIZLLL, "ttlive_preview_Highlight_Player", C2188811AlT.LIZIZ(sbLIZ));
    }
}
