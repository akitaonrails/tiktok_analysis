package com.ss.android.ugc.aweme.im.chatroom.common.titlebar;

import X.AbstractC738140SxQ;
import X.C1383370m6R;
import X.C13LE;
import X.C1558520qew;
import X.C19719912Dl;
import X.C20094213jo;
import X.C2217381BqS;
import X.C426750GoL;
import X.C452070Ho5;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C899470ZQj;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS673S0100000_24;
import u4.q0;

/* JADX INFO: loaded from: classes25.dex */
public final class TitleBarLeftAssem extends UISlotAssem implements TitleBarLeftAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public TuxIconView LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TitleBarLeftAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/chatroom/common/titlebar/TitleBarLeftViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cqa;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -309746845) {
            return null;
        }
        return this;
    }

    public TitleBarLeftAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TitleBarLeftViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 590);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(175);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, 591), aFwS264S0000000_24, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJI = assemVMLazy;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C426750GoL.LJIIL(view, null, null, 0, null, 27);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.p20);
        this.LLJJIII = tuxIconView;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        tuxIconView.setTintColor(C1383370m6R.LJFF(R.attr.a1h));
        q0.LJIJ(view, new C20094213jo() { // from class: X.0rHp
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(Button.class.getName());
            }
        });
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0r0U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C899460ZQi) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0r0V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C899460ZQi) obj).LLILLJJLI;
            }
        }, null, new AwS673S0100000_24(this, 2), 12);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.TitleBarLeftAbility
    public final void tj1(int i, String str) {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        assemVMLazy.getValue().setState(new C899470ZQj(str, i));
    }
}
