package com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel;

import X.C01GW;
import X.C03H5;
import X.C1558520qew;
import X.C2097908Jt;
import X.C452501pT;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC698070RZt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BottomLabelTriggerComponent<RECEIVER extends C03H5> extends BaseCellTriggerComponent<RECEIVER> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11((BottomLabelTriggerComponent) this, 1237));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS555S0100000_11((BottomLabelTriggerComponent) this, 1238));

    public abstract InterfaceC698070RZt Ap();

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final Map<String, Object> hp() {
        return C2097908Jt.LIZJ(new Pair("bottom_label_ui_state", Ap()));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    public void yp(ComponentPriorityProtocol componentPriorityProtocol, Function0<Unit> function0, Function0<Unit> function02) {
        Object obj;
        Object obj2 = null;
        if (!op()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (up((VideoItemParams) obj)) {
                InteractAreaAttachAbility interactAreaAttachAbility = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), VideoBottomLabelAbility.class, null);
                if (interactAreaAttachAbility != null) {
                    interactAreaAttachAbility.Fn1(this, new AwS412S0200000_11((BottomLabelTriggerComponent) this, componentPriorityProtocol, (ComponentPriorityProtocol) 40));
                }
                InteractAreaAttachAbility interactAreaAttachAbility2 = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), VideoBottomLabelAbility.class, null);
                if (interactAreaAttachAbility2 != null) {
                    interactAreaAttachAbility2.wR(0);
                }
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            InteractAreaAttachAbility interactAreaAttachAbility3 = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), VideoBottomLabelAbility.class, null);
            if (interactAreaAttachAbility3 != null) {
                interactAreaAttachAbility3.wR(8);
            }
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            if (function02 == null) {
                return;
            }
            function02.invoke();
            return;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        if (up((VideoItemParams) obj2)) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            if (function02 == null) {
                return;
            }
            function02.invoke();
        }
    }
}
