package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.notification;

import X.C019F;
import X.C09R3;
import X.C1146120fvm;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C16F5;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS152S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.GiftAnchorPanelCenterViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssemViewModel;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftAnchorPanelRecordPageNotificationAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public LinearLayout LLJJIII;
    public LiveIconView LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public final AssemVMLazy LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public ObjectAnimator LLJJJJ;
    public AnimatorSet LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final String LLJJI = "GiftAnchorPanelRecordPageNotificationAssem";
    public final C1559260qg8 LLJJIJIL = new C1559260qg8(new C723590SZx(this, C1146120fvm.class, null), checkSupervisorPrepared());

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GiftAnchorPanelRecordPageNotificationAssem.class, "centerVM", "getCenterVM()Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/anchor/center/GiftAnchorPanelCenterViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GiftAnchorPanelRecordPageNotificationAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/anchor/center/record/center/GiftAnchorPanelRecordPageCenterAssemViewModel;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public GiftAnchorPanelRecordPageNotificationAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GiftAnchorPanelCenterViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS561S0100000_17(c19719912DlLIZ, 160), AFwS254S0000000_17.get$arr$(62), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(GiftAnchorPanelRecordPageCenterAssemViewModel.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS561S0100000_17(c19719912DlLIZ2, 161), AFwS254S0000000_17.get$arr$(63), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gxd;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (LinearLayout) view.findViewById(R.id.pdg);
        this.LLJJIJI = (LiveIconView) view.findViewById(R.id.vu8);
        this.LLJJIJIIJIL = (C16F5) view.findViewById(R.id.text);
        LinearLayout linearLayout = this.LLJJIII;
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS152S0100000_17(this, 42));
        }
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0fvk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1146210fvv) obj).LLILLJJLI;
            }
        }, null, new AwS631S0100000_17(this, 14), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJJJIL.getValue(), new C2217381BqS() { // from class: X.0fvl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1145980fvY) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS631S0100000_17(this, 15), 4);
    }
}
