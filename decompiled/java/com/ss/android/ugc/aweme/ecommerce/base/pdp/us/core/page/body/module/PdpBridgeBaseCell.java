package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module;

import X.C13LP;
import X.C1753050vih;
import X.C19EG;
import X.C2493909px;
import X.C954703oH;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public abstract class PdpBridgeBaseCell<ITEM extends InterfaceC1891350zJl, VH extends AbsFullSpanVH<ITEM>> extends AssemPowerCell<PdpBridgeCellAssemImlListCard<ITEM, VH>, ITEM> {
    public abstract VH R5(View view);

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PdpBridgeCellAssemImlListCard(getLayoutId(), new C1753050vih(this));
    }

    public final InterfaceC1891350zJl S5(int i) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        List<InterfaceC1891350zJl> listItems;
        ViewParent parent = this.itemView.getParent();
        if (!(parent instanceof ViewOnAttachStateChangeListenerC20604515jv) || (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) parent) == null || (listItems = viewOnAttachStateChangeListenerC20604515jv.getListItems()) == null) {
            return null;
        }
        return (InterfaceC1891350zJl) C13LP.LJJJLZIJ(i, listItems);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(ITEM item) {
        PdpBridgeCellAssemListCard pdpBridgeCellAssemListCard;
        ReusedUIAssem<?> reusedUIAssemNG1 = NG1();
        if ((reusedUIAssemNG1 instanceof PdpBridgeCellAssemListCard) && (pdpBridgeCellAssemListCard = (PdpBridgeCellAssemListCard) reusedUIAssemNG1) != null) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            AbsFullSpanVH<ITEM> absFullSpanVH = pdpBridgeCellAssemListCard.LLJLL;
            if (absFullSpanVH != null) {
                absFullSpanVH.LLJJ = bindingAdapterPosition;
            }
        }
        super.onBindItemView(item);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup viewGroup) {
        Integer numValueOf = Integer.valueOf(getLayoutId());
        if (numValueOf.intValue() > 0) {
            int iIntValue = numValueOf.intValue();
            C19EG c19egLIZIZ = C2493909px.LIZIZ(viewGroup.getContext());
            if (c19egLIZIZ instanceof Activity) {
                this.LL = C954703oH.LIZ(c19egLIZIZ, iIntValue, viewGroup, false);
                Sl0(LJJIJL(), this);
                return LJJIJL();
            }
            "context is not an Activity??".toString();
            throw new IllegalStateException("context is not an Activity??");
        }
        throw new IllegalArgumentException("onCreateItemView layoutId is valid!!");
    }
}
