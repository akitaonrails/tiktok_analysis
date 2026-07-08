package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.assem;

import X.C019F;
import X.C055K;
import X.C13LE;
import X.C1637806bA;
import X.C1826520xdC;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C435320H5e;
import X.C446020HeK;
import X.C446350Her;
import X.C507520JvK;
import X.C507540JvM;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1119280fEU;
import X.EnumC1119290fEV;
import X.EnumC1826490xd9;
import X.InterfaceC1119310fEX;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.viewpager.SubOnlyLiveVipChoiceCell;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.vm.SubOnlyLiveVipListVM;
import com.bytedance.android.livesdk.comp.impl.subscription.commonui.UISlotContextCompatAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class SubOnlyLiveVipSheetContentAssem extends UISlotContextCompatAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubOnlyLiveVipSheetContentAssem.class, "subOnlyLiveVipListVM", "getSubOnlyLiveVipListVM()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subonlylive/setting/vip/vm/SubOnlyLiveVipListVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubOnlyLiveVipSheetContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubOnlyLiveVipListVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055K(c19719912DlLIZ), new C507540JvM(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hm9;
    }

    public final SubOnlyLiveVipListVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (SubOnlyLiveVipListVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1826520xdC c1826520xdC = (C1826520xdC) view.findViewById(R.id.ujy);
        c1826520xdC.setSize(EnumC1119290fEV.SMALL);
        c1826520xdC.setVariant(EnumC1826490xd9.CAPSULE);
        c1826520xdC.setMaterial(EnumC1119280fEU.REGULAR);
        c1826520xdC.setOnSelectedChangeListener(new InterfaceC1119310fEX() { // from class: X.0JvL
            @Override // X.InterfaceC1119310fEX
            public final void LIZ(int i, boolean z) {
                if (z) {
                    if (i == 0) {
                        this.LIZ.hp().xQ2(0);
                    } else {
                        this.LIZ.hp().xQ2(1);
                    }
                }
            }
        });
        ((ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.evr)).LJIILJJIL(SubOnlyLiveVipChoiceCell.class);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JBD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JBB) obj).LLIZ;
            }
        }, null, new C446020HeK(view), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JBE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JBB) obj).LLILZ;
            }
        }, null, new C435320H5e(view), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JYk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0JBB) obj).LLILZIL);
            }
        }, null, new C507520JvK(view), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JBC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0JBB) obj).LL);
            }
        }, null, new C446350Her(view), 6);
    }
}
