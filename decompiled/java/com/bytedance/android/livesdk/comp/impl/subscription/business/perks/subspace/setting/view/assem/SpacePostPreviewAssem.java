package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.setting.view.assem;

import X.C019F;
import X.C06SV;
import X.C06SW;
import X.C13LE;
import X.C1637806bA;
import X.C16F5;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C497740JfY;
import X.C503000Jo2;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.setting.vm.SubSpaceSettingVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class SpacePostPreviewAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public boolean LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SpacePostPreviewAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/setting/vm/SubSpaceSettingVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SpacePostPreviewAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceSettingVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C06SV(c19719912DlLIZ), new C06SW(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.glu;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TextView textView;
        boolean zBooleanValue;
        Boolean bool;
        super.onViewCreated(view);
        Map<String, Object> map = getConfig().LLILZ;
        if (map != null) {
            Object obj = map.get("super_fans_space");
            if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.LLJJIII = zBooleanValue;
        }
        View viewFindViewById = view.findViewById(R.id.htg);
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
        if (this.LLJJIII) {
            TextView textView2 = (TextView) view.findViewById(R.id.ht7);
            if (textView2 != null) {
                textView2.setText(C497740JfY.LJIJI(2131856654));
            }
            if ((viewFindViewById instanceof C16F5) && (textView = (TextView) viewFindViewById) != null) {
                textView.setText(C497740JfY.LJIJI(2131856653));
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06Iu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1585606Is) obj2).LLILLJJLI;
            }
        }, null, new C503000Jo2(viewFindViewById, this), 6);
        this.LLJJI.getValue();
    }
}
