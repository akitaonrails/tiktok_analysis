package com.ss.android.ugc.aweme.tako.otherpage.settings.ui;

import X.C019F;
import X.C0Q4Y;
import X.C13LE;
import X.C1559260qg8;
import X.C1581450rFv;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.tako.model.TakoSettingsEnterParams;
import com.ss.android.ugc.aweme.tako.otherpage.settings.vm.TakoSettingsVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS644S0100000_30;

/* JADX INFO: loaded from: classes25.dex */
public final class TakoSettingsOperationListAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoSettingsOperationListAssem.class, "settingsVM", "getSettingsVM()Lcom/ss/android/ugc/aweme/tako/otherpage/settings/vm/TakoSettingsVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoSettingsOperationListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoSettingsVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1354), AFwS264S0000000_24.get$arr$(446), null, true);
        this.LLJJIII = new C1559260qg8(new C723580SZw(this, TakoSettingsEnterParams.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.flq;
    }

    public final TakoSettingsEnterParams hp() {
        return (TakoSettingsEnterParams) this.LLJJIII.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        Class[] clsArr;
        super.onViewCreated(view);
        if (view instanceof ViewOnAttachStateChangeListenerC20604515jv) {
            viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view;
        } else {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        this.LLJJIJI = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 1, false));
            viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
            C1581450rFv.LIZ.getClass();
            if (C1581450rFv.LIZ()) {
                clsArr = new Class[]{TakoSettingsHeaderCell.class, TakoOperationCategoryCell.class, TakoSettingsOperationCell.class};
            } else {
                clsArr = new Class[]{TakoSettingsOperationCell.class};
            }
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gMD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1155400gAk) obj).LLILLJJLI;
            }
        }, null, new AwS644S0100000_30(this, 44), 6);
    }
}
