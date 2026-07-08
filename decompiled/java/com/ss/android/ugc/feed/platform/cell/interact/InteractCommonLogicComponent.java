package com.ss.android.ugc.feed.platform.cell.interact;

import X.C0QSJ;
import X.C1558520qew;
import X.C673150Qan;
import X.C687700QyG;
import X.C691710RBh;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class InteractCommonLogicComponent extends BaseCellLogicComponent<InteractCommonLogicComponent> implements InteractCommonLogicAbility, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public FcpProtocolAbility LLJJIJI;
    public InteractAreaFunnelAbility LLJJIJIIJIL;
    public IFcpPolicyAbility LLJJIJIL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == FcpProtocolAbility.class) {
            this.LLJJIJI = (FcpProtocolAbility) obj;
        } else if (cls == InteractAreaFunnelAbility.class) {
            this.LLJJIJIIJIL = (InteractAreaFunnelAbility) obj;
        } else if (cls == IFcpPolicyAbility.class) {
            this.LLJJIJIL = (IFcpPolicyAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CellInteractAreaScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == FcpProtocolAbility.class) {
            return this.LLJJIJI;
        }
        if (cls == InteractAreaFunnelAbility.class) {
            return this.LLJJIJIIJIL;
        }
        if (cls == IFcpPolicyAbility.class) {
            return this.LLJJIJIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CellInteractAreaScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CellInteractAreaScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -193890719) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == FcpProtocolAbility.class) {
            this.LLJJIJI = null;
        } else if (cls == InteractAreaFunnelAbility.class) {
            this.LLJJIJIIJIL = null;
        } else if (cls == IFcpPolicyAbility.class) {
            this.LLJJIJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractCommonLogicAbility
    public final void NF1() {
        C691710RBh.LIZ(this, "event_component_hint_text", null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractCommonLogicAbility
    public final void cl1(boolean z) {
        C691710RBh.LIZ(this, "event_component_clickable", Boolean.valueOf(z));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
